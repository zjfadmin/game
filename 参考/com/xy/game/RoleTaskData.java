package com.xy.game;

import com.xy.aG;
import com.xy.cX;
import com.xy.cc;
import com.xy.eM;
import com.xy.hd;
import com.xy.iI;
import com.xy.jJ;
import com.xy.kZ;
import com.xy.mp;
import com.xy.bean.LoginResult;
import com.xy.bean.RoleShow;
import com.xy.readbean.TaskData;
import com.xy.readbean.TaskSet;
import com.xy.readbean.TaskTQ;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class RoleTaskData {
   private static Object LOCK = new Object();
   public static final int quxiaoTime = 9;
   public static final int completeTask = 3;
   private boolean limitFlyFlag;
   private Map<Integer, TaskRecord> taskRecordMap;
   public static final int finishTask = 4;
   public static final int cannotAccept = 0;
   private List<Task> taskList;
   public long time;
   public static final int canAccept = 1;
   public static final int doTasking = 2;
   private List<iI> units;
   public static final int quxiao = 8;
   private static List<iI> npcUnits = new ArrayList();
   public RoleData roleData;

   public int getTaskSetNum(TaskSet var1, int var2) {
      int var3 = var2 == (3 & 5) ? var1.getSumreceive() : var1.getSumlimit();
      if (var3 == 0) {
         return var3;
      } else {
         TaskTQ var4;
         if ((var4 = var1.getTq()) != null) {
            if (var4.a() && this.roleData.getLimit("季卡") != null) {
               var3 += var2 == 5 >> 2 ? var4.getReceiveNum() : var4.getLimitNum();
            }

            if (var4.getBuyNum() > 0) {
               int var10001;
               RoleTaskData var10002;
               if (var2 == (3 & 5)) {
                  var10001 = var4.getReceiveNum();
                  var10002 = this;
               } else {
                  var10001 = var4.getLimitNum();
                  var10002 = this;
               }

               var3 += var10001 * var10002.d(var1.getTaskSetID(), --5);
            }
         }

         return var3;
      }
   }

   public Task getTaskId(int var1) {
      int var2;
      for(int var10000 = var2 = this.taskList.size() - (3 >> 1); var10000 >= 0; var10000 = var2) {
         if (((Task)this.taskList.get(var2)).getTaskId() == var1) {
            return (Task)this.taskList.get(var2);
         }

         --var2;
      }

      return null;
   }

   public Task a(String var1, String var2) {
      int var3;
      for(int var10000 = var3 = this.taskList.size() - (5 >> 2); var10000 >= 0; var10000 = var3) {
         Task var4;
         if ((var4 = (Task)this.taskList.get(var3)).d(var1, var2) != 0) {
            return var4;
         }

         --var3;
      }

      return null;
   }

   public iI b(Task var1, TaskProgress var2, List<iI> var3) {
      int var4;
      for(int var10000 = var4 = 5 >> 3; var10000 < var3.size(); var10000 = var4) {
         iI var5;
         if ((var5 = (iI)var3.get(var4)).z == var1 && var5.y == var2) {
            var3.remove(var4);
            return var5;
         }

         ++var4;
      }

      return new iI(var1, var2, this.roleData.getObjectArea());
   }

   public Task getTaskSet(int var1) {
      int var2;
      for(int var10000 = var2 = this.taskList.size() - (3 >> 1); var10000 >= 0; var10000 = var2) {
         if (((Task)this.taskList.get(var2)).getTaskData().getTaskSetID() == var1) {
            return (Task)this.taskList.get(var2);
         }

         --var2;
      }

      return null;
   }

   public void getSetId(List<Integer> var1) {
      int var4;
      for(int var10000 = var4 = 3 & 4; var10000 < this.taskList.size(); var10000 = var4) {
         int var3 = ((Task)this.taskList.get(var4)).getTaskData().getTaskSetID();
         if (!var1.contains(var3)) {
            label34: {
               int var2;
               for(var10000 = var2 = 0; var10000 < var1.size(); var10000 = var2) {
                  if ((Integer)var1.get(var2) < var3) {
                     var1.add(var2, var3);
                     break label34;
                  }

                  ++var2;
               }

               var1.add(var3);
            }
         }

         ++var4;
      }

   }

   public boolean getTaskGive(int var1) {
      int var2;
      for(int var10000 = var2 = this.taskList.size() - (2 ^ 3); var10000 >= 0; var10000 = var2) {
         Task var3 = (Task)this.taskList.get(var2);

         int var4;
         for(var10000 = var4 = 5 >> 3; var10000 < var3.getProgress().size(); var10000 = var4) {
            TaskProgress var5;
            if ((var5 = (TaskProgress)var3.getProgress().get(var4)).getType() == --4 && var5.getGId() == var1) {
               return (boolean)(2 ^ 3);
            }

            ++var4;
         }

         --var2;
      }

      return (boolean)(3 >> 2);
   }

   public Task c(int var1, int var2) {
      int var4;
      for(int var10000 = var4 = 3 & 4; var10000 < this.taskList.size(); var10000 = var4) {
         Task var3;
         if ((var3 = (Task)this.taskList.get(var4)).getTaskId() == var1) {
            this.taskList.remove(var4);
            RoleTaskData var5;
            if (var2 == (121 & 15)) {
               var5 = this;
               this.roleData.getGameView().f("你的" + var3.getTaskData().getTaskName() + "任务因为超时导致失败");
            } else if (var2 == (72 & 63)) {
               var5 = this;
               this.roleData.getGameView().f("取消了" + var3.getTaskData().getTaskName());
            } else {
               if (var2 == --4) {
                  if (!this.roleData.getGameView().getClient().n(5 >> 1, 79 & 60)) {
                     this.roleData.getGameView().f("完成了" + var3.getTaskData().getTaskName());
                  }

                  if (!hd.o(var3.getTaskData().getTaskEnd())) {
                     ((jJ)this.roleData.getGameView().getFormManagement().e(91 & 63)).la(var3.getTaskData().getTaskEnd());
                  }
               }

               var5 = this;
            }

            var5.roleData.getGameView().getGameReadBar().b(var3.getTaskData());
            return var3;
         }

         ++var4;
      }

      return null;
   }

   public int d(int var1, int var2) {
      TaskRecord var3;
      if ((var3 = this.getTaskRecord(var1)) == null) {
         return var2 == --4 ? 62 & 75 : 0;
      } else if (var2 == (4 ^ 5)) {
         return var3.getrSum();
      } else if (var2 == --2) {
         return var3.getcSum();
      } else if (var2 == --3) {
         return var3.getNewID();
      } else if (var2 == --4) {
         return (110 & 27) - var3.getcSum() + var3.getrSum();
      } else {
         return var2 == --5 ? var3.getbSum() : 0;
      }
   }

   public iI getTaskUnit(long var1, long var3) {
      int var5;
      for(int var10000 = var5 = this.units.size() - (3 & 5); var10000 >= 0; var10000 = var5) {
         iI var6;
         if ((long)(var6 = (iI)this.units.get(var5)).y.getDId() == var1 && (var6.y.getType() == --5 || (long)var6.y.getMap() == var3)) {
            return var6;
         }

         --var5;
      }

      return null;
   }

   public void e() {
      this.taskList = GameUtil.i(this.roleData);
      this.taskRecordMap = GameUtil.g(this.roleData);
      this.g();
   }

   public boolean f(Task var1) {
      TaskData var10000 = var1.getTaskData();
      String var3 = var10000.getLvl();
      int var2 = var10000.getTeamSum();
      return this.p(var2, var3);
   }

   public void g() {
      synchronized(LOCK) {
         int var5 = 0;
         npcUnits.clear();

         int var10000;
         int var3;
         for(var10000 = var3 = this.taskList.size() - --1; var10000 >= 0; var10000 = var3) {
            Task var4;
            TaskData var2 = (var4 = (Task)this.taskList.get(var3)).getTaskData();
            var5 |= var2.getIsTP() == (4 ^ 5) ? 4 ^ 5 : 0;

            int var8;
            for(var10000 = var8 = 5 >> 3; var10000 < var4.getProgress().size(); var10000 = var8) {
               TaskProgress var1;
               if ((var1 = (TaskProgress)var4.getProgress().get(var8)).getSum() < var1.getMax() && (var1.getType() == --1 || var1.getType() == --5)) {
                  npcUnits.add(this.b(var4, var1, npcUnits));
               }

               ++var8;
            }

            --var3;
         }

         var10000 = 3 >> 2;
         this.limitFlyFlag = (boolean)var5;
         this.units.clear();

         for(var3 = var10000; var10000 < npcUnits.size(); var10000 = var3) {
            this.units.add((iI)npcUnits.get(var3++));
         }

         npcUnits.clear();
      }
   }

   public Task h(TaskProgress var1) {
      int var2;
      for(int var10000 = var2 = 5 >> 3; var10000 < this.taskList.size(); var10000 = var2) {
         Task var3 = (Task)this.taskList.get(var2);

         int var4;
         for(var10000 = var4 = 3 ^ 3; var10000 < var3.getProgress().size(); var10000 = var4) {
            TaskProgress var5;
            if (((var5 = (TaskProgress)var3.getProgress().get(var4)).getType() == 0 || var5.getType() == (4 ^ 5)) && var1.getDId() == var5.getDId()) {
               return var3;
            }

            ++var4;
         }

         ++var2;
      }

      return null;
   }

   public void i() {
      StringBuffer var6 = null;
      StringBuffer var2 = null;

      int var3;
      for(int var10000 = var3 = this.taskList.size() - (3 & 5); var10000 >= 0; var10000 = var3) {
         Task var4;
         if ((var4 = (Task)this.taskList.get(var3)).c()) {
            StringBuffer var10;
            if (var6 == null) {
               var10 = var6 = new StringBuffer("T");
            } else {
               var10 = var6;
               var6.append("|");
            }

            var10.append(var4.getTaskId());
         } else {
            int var5;
            if (var2 == null) {
               for(var10000 = var5 = 0; var10000 < var4.getProgress().size(); var10000 = var5) {
                  TaskProgress var1;
                  if ((var1 = (TaskProgress)var4.getProgress().get(var5)).getSum() < var1.getMax() && var1.getType() == (77 & 58) && this.roleData.getGameView().roleUnit.r.getMapid() == (long)var1.getMap()) {
                     int var7 = this.roleData.getGameView().roleUnit.ab - var1.getX();
                     int var8 = this.roleData.getGameView().roleUnit.al - var1.getY();
                     if (var7 * var7 + var8 * var8 <= var1.getDId() * var1.getDId()) {
                        (var2 = new StringBuffer()).append("P");
                        var2.append(var4.getTaskId());
                        var2.append("|");
                        var2.append(var5);
                     }
                  }

                  ++var5;
               }
            }
         }

         --var3;
      }

      String var9;
      if (var6 != null) {
         var9 = Agreement.getSendTextAES("taskN", var6.toString());
         this.roleData.getGameView().getClient().d(var9);
      }

      if (var2 != null) {
         var9 = Agreement.getSendTextAES("taskN", var2.toString());
         this.roleData.getGameView().getClient().d(var9);
      }

   }

   public List<iI> getUnits() {
      return this.units;
   }

   public static String getMinLvl(String var0) {
      int var1 = 3 ^ 3;
      int var2 = 5 >> 3;
      int var10000 = 7660 & 25307;
      var10000 = --4;
      var10000 = 6395 & 26572;
      if (var0 != null && !var0.equals("")) {
         String[] var3;
         String[] var4 = var3 = var0.split("\\|");
         String[] var10001 = var4[3 ^ 3].split("\\-");
         var2 = Integer.parseInt(var10001[3 ^ 3]);
         Integer.parseInt(var10001[3 & 5]);
         if (var4.length >= (1 ^ 3)) {
            var1 = Integer.parseInt(var3[2 ^ 3]);
         }

         if (var3.length == --3) {
            var4 = var3[5 >> 1].split("\\-");
            Integer.parseInt(var4[3 & 4]);
            Integer.parseInt(var4[--1]);
         }
      }

      if (var1 == 0) {
         return var2 + "级";
      } else {
         return var1 >= --4 ? "飞升" + var2 + "级" : var1 + "转" + var2 + "级";
      }
   }

   public void j(String[] var1) {
      int var10 = Integer.parseInt(var1[2 & 5]);
      int var3 = 3 ^ 3;
      int var4 = 3 >> 2;
      int var5 = 2 & 5;
      int var6 = 5 >> 3;
      int var7 = 5 >> 3;
      int var8 = 2 & 5;
      int var9 = 2 & 5;

      int var2;
      int var10000;
      for(var10000 = var2 = 3 & 5; var10000 < var1.length; var10000 = var2) {
         if (var1[var2].startsWith("L")) {
            if (var1[var2].length() == (3 & 5)) {
               var4 = --1;
            } else {
               var9 = Integer.parseInt(var1[var2].substring(3 & 5));
            }
         } else if (var1[var2].startsWith("R")) {
            if (var1[var2].length() == 5 >> 2) {
               var3 = 5 >> 2;
            } else {
               var8 = Integer.parseInt(var1[var2].substring(3 & 5));
            }
         } else if (var1[var2].startsWith("N")) {
            var5 = Integer.parseInt(var1[var2].substring(5 >> 2));
         } else if (var1[var2].startsWith("M")) {
            var6 = Integer.parseInt(var1[var2].substring(--1));
         } else if (var1[var2].startsWith("B")) {
            var7 = Integer.parseInt(var1[var2].substring(--1));
         }

         ++var2;
      }

      if (var3 != 0 || var4 != 0 || var5 != 0 || var8 != 0 || var9 != 0 || var6 != 0 || var7 != 0) {
         TaskRecord var12 = this.getTaskRecord(var10);
         if (var8 != 0) {
            var10000 = var9;
            var12.setrSum(var8);
         } else {
            if (var3 != 0) {
               var12.setrSum(var12.getrSum() + var3);
            }

            var10000 = var9;
         }

         if (var10000 != 0) {
            var10000 = var6;
            var12.setcSum(var9);
         } else {
            if (var4 != 0) {
               var12.setcSum(var12.getcSum() + var4);
            }

            var10000 = var6;
         }

         if (var10000 != 0) {
            var10000 = var7;
            var12.setNewID(var12.getNewID() + var6);
         } else {
            if (var5 != 0) {
               var12.setNewID(var5);
            }

            var10000 = var7;
         }

         if (var10000 != 0) {
            var12.setbSum(var7);
         }

         eM var11;
         mp var13;
         if ((var13 = (mp)(var11 = this.roleData.getGameView().getFormManagement()).m(107 & 60)) != null) {
            var13.y(var10);
         }

         cc var14;
         if (var10 == (127 & 7) && (var14 = (cc)var11.m(125 & 127)) != null) {
            var14.f((String)null);
         }

         aG var15;
         if ((var15 = (aG)var11.m(27349 & 5563)) != null) {
            var15.y(var10);
         }

      }
   }

   public boolean getTaskXL(long var1) {
      int var3;
      for(int var10000 = var3 = this.taskList.size() - --1; var10000 >= 0; var10000 = var3) {
         Task var4 = (Task)this.taskList.get(var3);

         int var5;
         for(var10000 = var5 = 3 >> 2; var10000 < var4.getProgress().size(); var10000 = var5) {
            TaskProgress var6;
            if ((var6 = (TaskProgress)var4.getProgress().get(var5)).getType() == (119 & 14) && (long)var6.getMap() == var1) {
               return (boolean)(4 ^ 5);
            }

            ++var5;
         }

         --var3;
      }

      return (boolean)(2 & 5);
   }

   public TaskRecord getTaskRecord(int var1) {
      TaskRecord var2;
      if ((var2 = (TaskRecord)this.taskRecordMap.get(var1)) != null) {
         return var2;
      } else {
         synchronized(this.taskRecordMap) {
            if ((var2 = (TaskRecord)this.taskRecordMap.get(var1)) != null) {
               return var2;
            } else {
               this.taskRecordMap.put(var1, var2 = new TaskRecord(var1));
               return var2;
            }
         }
      }
   }

   public void k() {
      this.taskRecordMap = GameUtil.g(this.roleData);
   }

   public synchronized Task l(int var1, int var2) {
      TaskData var3 = this.roleData.getObjectArea().am(var1);
      Task var4 = new Task(var1, var2, var3);
      var4.setTaskId(var1);
      var4.setTaskState(var2);
      return var4;
   }

   public void m(String var1) {
      if (!hd.o(var1)) {
         int var7 = 0;
         int var6 = 2 & 5;
         kZ var4 = (kZ)this.roleData.getGameView().getFormManagement().m(--3);
         int var10000 = 3 ^ 3;
         int var5 = 2 & 5;

         int var3;
         for(var10000 = var3 = 3 & 4; var10000 < var1.length(); var10000 = var3) {
            if ((var3 = var1.indexOf("|", var5 + --1)) == -4 >> 2) {
               var3 = var1.length();
            }

            String[] var2;
            if (var1.charAt(var5) == (87 & 107)) {
               var6 = 3 >> 1;
               var2 = var1.substring(var5 + (4 ^ 5), var3).split("=");
               var10000 = var3;
               this.j(var2);
            } else {
               var2 = var1.substring(var5, var3).split("=");
               int var8 = Integer.parseInt(var2[5 >> 3]);
               int var9 = Integer.parseInt(var2[3 & 5]);
               Task var10 = this.o(var8, var9, var2);
               if (var4 != null && var4.e() == var8) {
                  var7 = --1;
               }

               if (var10 != null) {
                  this.roleData.getGameView().automation.j(var10, var9);
               }

               var10000 = var3;
            }

            var5 = var10000 + 1;
         }

         this.g();
         if (var6 != 0) {
            this.roleData.getGameView().automation.setAutomationBtnRed(--5);
         }

         if (var4 != null) {
            var4.d();
            if (var7 != 0) {
               var4.afo((Task)null, (TaskData)null);
            }
         }

      }
   }

   public Task n(int var1) {
      int var2;
      for(int var10000 = var2 = 3 >> 2; var10000 < this.taskList.size(); var10000 = var2) {
         Task var3 = (Task)this.taskList.get(var2);

         int var4;
         for(var10000 = var4 = 3 & 4; var10000 < var3.getProgress().size(); var10000 = var4) {
            TaskProgress var5;
            if ((var5 = (TaskProgress)var3.getProgress().get(var4)).getType() == --2 && var5.getDId() == var1) {
               return var3;
            }

            ++var4;
         }

         ++var2;
      }

      return null;
   }

   public Task o(int var1, int var2, String[] var3) {
      if (var2 != (92 & 43) && var2 != (109 & 27) && var2 != --4) {
         Task var4;
         if ((var4 = this.getTaskId(var1)) != null) {
            var4.b(var3, this.roleData.getObjectArea());
            return var4;
         } else {
            (var4 = this.l(var1, var2)).b(var3, this.roleData.getObjectArea());
            this.taskList.add(var4);
            if (!this.roleData.getGameView().getClient().n(1 ^ 3, 78 & 61)) {
               this.roleData.getGameView().f("领取了" + var4.getTaskData().getTaskName());
            }

            this.roleData.getGameView().getGameReadBar().setCountDown(var4);
            if (this.roleData.getGameView().getClient().k(--3) && !this.roleData.getGameView().getClient().z(2 & 5)) {
               var1 = this.roleData.getLimit("经验") != null ? 4 ^ 5 : 0;
               if (var1 == 0 && var4.getTaskData().a("双倍领取提示")) {
                  jJ var5 = (jJ)this.roleData.getGameView().getFormManagement().e(31 & 123);
                  var5.do(3 & 4);
                  return var4;
               }

               if (var1 != 0 && var4.getTaskData().a("双倍冻结提示")) {
                  ((jJ)this.roleData.getGameView().getFormManagement().e(27 & 127)).do(4 ^ 5);
               }
            }

            return var4;
         }
      } else {
         return this.c(var1, var2);
      }
   }

   public boolean p(int var1, String var2) {
      int var8 = 3 >> 2;
      int var4 = 28408 & 4559;
      int var5 = 2 & 5;
      int var6 = --4;
      int var7 = 27647 & 5320;
      if (var2 != null && !var2.equals("")) {
         String[] var3;
         String[] var10000 = var3 = var2.split("\\|");
         String[] var10001 = var10000[3 ^ 3].split("\\-");
         var8 = Integer.parseInt(var10001[5 >> 3]);
         var4 = Integer.parseInt(var10001[4 ^ 5]);
         if (var10000.length >= 5 >> 1) {
            var5 = Integer.parseInt(var3[--1]);
         }

         if (var3.length == --3) {
            var10000 = var3[--2].split("\\-");
            var6 = Integer.parseInt(var10000[3 & 4]);
            var7 = Integer.parseInt(var10000[--1]);
         }
      }

      GameView var12;
      if (!(var12 = this.roleData.getGameView()).roleUnit.h()) {
         return (boolean)(3 & 4);
      } else {
         String[] var9 = var12.roleUnit.ad();
         int var11;
         int var14;
         int var15;
         if (var1 == 0) {
            if (var9 != null && var9.length > (2 ^ 3)) {
               var15 = 3 & 4;
               var12.f("该任务只能一个人完成");
               return (boolean)var15;
            }

            if ((var11 = cX.d(var12.roleUnit.r.getGrade())) >= var8 && var11 <= var4) {
               if ((var14 = var12.roleUnit.r.getTurnAround()) < var5) {
                  var15 = 3 >> 2;
                  var12.f("转生次数最少" + var5 + "次");
                  return (boolean)var15;
               }

               if (var14 <= var6 && (var14 != var6 || var11 <= var7)) {
                  return true;
               }

               var12.f("最大到" + var6 + "转" + var7 + "级");
               return (boolean)(3 ^ 3);
            }

            var12.f("等级不满足在" + var8 + "-" + var4 + "范围");
            return (boolean)(3 & 4);
         } else if (var1 == 3 >> 1) {
            if ((var11 = cX.d(var12.roleUnit.r.getGrade())) >= var8 && var11 <= var4) {
               if ((var14 = var12.roleUnit.r.getTurnAround()) < var5) {
                  var15 = 5 >> 3;
                  var12.f("转生次数最少" + var5 + "次");
                  return (boolean)var15;
               }

               if (var14 <= var6 && (var14 != var6 || var11 <= var7)) {
                  return true;
               }

               var12.f("最大到" + var6 + "转" + var7 + "级");
               return (boolean)(3 ^ 3);
            }

            var12.f("等级不满足在" + var8 + "-" + var4 + "范围");
            return (boolean)(3 >> 2);
         } else if (var9 != null) {
            var11 = 5 >> 3;
            LoginResult var10;
            if ((var10 = this.roleData.getLoginResult()).getPals() != null && !var10.getPals().equals("")) {
               var11 = var10.getPals().split("\\|").length;
            }

            if (var9.length + var11 < var1) {
               var15 = 2 & 5;
               var12.f("队伍人数不够" + var1 + "个人,先凑齐人数在来吧");
               return (boolean)var15;
            }

            for(var15 = var1 = 0; var15 < var9.length; var15 = var1) {
               RoleShow var13;
               if ((var14 = cX.d((var13 = var12.mapScene.a(var9[var1]).r).getGrade())) < var8 || var14 > var4) {
                  var12.f("队伍等级不满足在" + var8 + "-" + var4 + "范围");
                  return false;
               }

               if ((var11 = var13.getTurnAround()) < var5) {
                  var12.f("转生次数最少" + var5 + "次");
                  return false;
               }

               if (var11 > var6 || var11 == var6 && var14 > var7) {
                  var12.f("最大到" + var6 + "转" + var7 + "级");
                  return false;
               }

               ++var1;
            }
         }

         return true;
      }
   }

   public RoleTaskData(RoleData var1) {
      int var10004 = 2 & 5;
      super();
      this.limitFlyFlag = (boolean)var10004;
      this.roleData = var1;
      this.units = new ArrayList();
   }

   public TaskProgress q(int var1) {
      int var5;
      for(int var10000 = var5 = 3 ^ 3; var10000 < this.taskList.size(); var10000 = var5) {
         Task var3 = (Task)this.taskList.get(var5);

         int var4;
         for(var10000 = var4 = 5 >> 3; var10000 < var3.getProgress().size(); var10000 = var4) {
            TaskProgress var2;
            if ((var2 = (TaskProgress)var3.getProgress().get(var4)).getType() == (1 ^ 3) && var2.getSum() < var2.getMax() && var2.getDId() == var1) {
               return var2;
            }

            ++var4;
         }

         ++var5;
      }

      return null;
   }

   public List<Task> getTaskList() {
      return this.taskList;
   }

   public String r(int var1) {
      TaskData var4;
      if ((var4 = this.roleData.getObjectArea().am(var1)) == null) {
         return null;
      } else {
         int var2;
         for(int var10000 = var2 = 0; var10000 < this.taskList.size(); var10000 = var2) {
            Task var3;
            if ((var3 = (Task)this.taskList.get(var2)).getTaskData().getTaskName().equals(var4.getTaskName())) {
               if (var3.getTaskState() == --2) {
                  return "我要取消" + var4.getTaskName();
               }

               if (var3.getTaskState() == --3) {
                  return "我要领取" + var4.getTaskName() + "奖励";
               }
            }

            ++var2;
         }

         if (var4.getTaskID() >= (19927 & 15997) && var4.getTaskID() <= (19951 & 16316)) {
            var2 = this.d(var4.getTaskSetID(), --3);
            if (var4.getTaskID() != var2 + --1) {
               return null;
            }
         }

         return var4.getTaskOpen();
      }
   }

   public boolean s() {
      return this.limitFlyFlag;
   }

   public Task getSetTask(int var1) {
      int var2;
      for(int var10000 = var2 = 5 >> 3; var10000 < this.taskList.size(); var10000 = var2) {
         if (((Task)this.taskList.get(var2)).getTaskData().getTaskSetID() == var1) {
            return (Task)this.taskList.get(var2);
         }

         ++var2;
      }

      return null;
   }
}
