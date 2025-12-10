package com.xy.script;

import com.xy.W;
import com.xy.ev;
import com.xy.hY;
import com.xy.game.TaskProgress;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ScriptTask {
   private long nowRecord;
   private long timeAssist;
   private hY mapPoint;
   private int timeInterval;
   private int taskID;
   private ScriptIndex nowIndex;
   private List<ScriptIndex> indexList;
   private List<Long> list;
   private int sum;
   private int nowNum;
   private int taskSetID;
   private boolean first;
   private int npcID;

   public void a(long var1) {
      ScriptTask var10000;
      if (this.list == null) {
         this.list = new ArrayList();
         var10000 = this;
      } else {
         if (this.list.contains(var1)) {
            return;
         }

         var10000 = this;
      }

      var10000.list.add(var1);
   }

   public int b() {
      return this.sum -= 4 ^ 5;
   }

   public int getNpcID() {
      return this.npcID;
   }

   public boolean c(int var1, int var2) {
      if (this.indexList == null) {
         return (boolean)(3 >> 2);
      } else {
         Iterator var3;
         for(Iterator var10000 = var3 = this.indexList.iterator(); var10000.hasNext(); var10000 = var3) {
            ScriptIndex var4;
            if ((var4 = (ScriptIndex)var3.next()).getType() == var1 && var4.getKey() == var2) {
               return (boolean)(2 ^ 3);
            }
         }

         return (boolean)(2 & 5);
      }
   }

   public void setTaskSetID(int var1) {
      this.taskSetID = var1;
   }

   public int getMap() {
      return this.mapPoint.a();
   }

   public void d() {
      if (this.first) {
         this.first = (boolean)(2 & 5);
      }

   }

   public boolean e(long var1) {
      return (boolean)(this.list != null && this.list.contains(var1) ? 2 ^ 3 : 0);
   }

   public int getTaskSetID() {
      return this.taskSetID;
   }

   public ScriptIndex getScriptIndex(int var1, TaskProgress var2) {
      if (this.indexList == null) {
         return null;
      } else {
         int var3 = var1 == 0 && var2 != null ? var2.getDId() : 0;
         if (this.nowIndex != null && this.nowIndex.getType() != var1 || var3 != 0 && this.nowIndex != null && this.nowIndex.getKey() != var3) {
            this.nowIndex = null;
         }

         if (this.nowIndex == null) {
            int var10001 = 3 >> 1;
            this.nowNum = 3 ^ 3;
            this.nowRecord = 0L;
            int var6 = var10001;
            Iterator var5;
            Iterator var10000 = var5 = this.indexList.iterator();

            while(true) {
               while(var10000.hasNext()) {
                  ScriptIndex var4;
                  if ((var4 = (ScriptIndex)var5.next()).getType() == var1) {
                     label69: {
                        if (var3 != 0 && var4.getKey() != var3) {
                           var10000 = var5;
                           continue;
                        }

                        if (this.nowIndex != null) {
                           ++var6;
                           if (W.c.nextInt(var6) != 0) {
                              break label69;
                           }
                        }

                        this.nowIndex = var4;
                     }
                  }

                  var10000 = var5;
               }

               return this.nowIndex;
            }
         } else {
            return this.nowIndex;
         }
      }
   }

   public int getTaskID() {
      return this.taskID;
   }

   public int getTimeInterval() {
      return this.timeInterval;
   }

   public boolean f() {
      return this.first;
   }

   public int getY() {
      return this.mapPoint.c();
   }

   public ScriptTask(String[] var1, int var2, int var3) {
      int var10002 = --4;
      int var10007 = --3;
      int var10012 = 3 & 5;
      super();
      this.first = (boolean)var10012;
      this.taskSetID = var3;
      this.mapPoint = new hY(Integer.parseInt(var1[3 ^ 3]), Integer.parseInt(var1[5 >> 2]), Integer.parseInt(var1[--2]));
      this.npcID = Integer.parseInt(var1[var10007]);
      this.sum = var2;
      this.j(var10002, var1);
      if (this.timeInterval < (31726 & 2041)) {
         this.timeInterval = 28648 & 5119;
      }

   }

   public void g() {
      if (this.nowIndex != null) {
         ScriptIndex var6;
         ScriptIndex var10000 = var6 = this.nowIndex;
         int var4 = var10000.getType();
         int var7 = var10000.getKey();
         ScriptIndex var2 = null;
         int var5 = 4 ^ 5;

         int var1;
         int var8;
         for(var8 = var1 = 3 ^ 3; var8 < this.indexList.size(); var8 = var1) {
            if ((ScriptIndex)this.indexList.get(var1) == var6) {
               this.nowRecord |= 1L << var1;
               break;
            }

            ++var1;
         }

         for(var8 = var1 = 0; var8 < this.indexList.size(); var8 = var1) {
            ScriptIndex var3;
            if ((var3 = (ScriptIndex)this.indexList.get(var1)).getType() == var4 && (var7 == 0 || var3.getKey() == var7) && (this.nowRecord >> var1 & 1L) == 0L) {
               label64: {
                  if (var2 != null) {
                     ++var5;
                     if (W.c.nextInt(var5) != 0) {
                        break label64;
                     }
                  }

                  var2 = var3;
               }
            }

            ++var1;
         }

         if (var2 != null) {
            this.nowIndex = var2;
         } else {
            if (this.h()) {
               this.nowNum = 2 & 5;
               this.nowRecord = 0L;
               this.nowIndex = null;
            }

         }
      }
   }

   public int getX() {
      return this.mapPoint.f();
   }


   private boolean h() {
      return (boolean)((this.nowNum += 3 & 5) > --5 ? 5 >> 2 : 0);
   }

   public void setTaskID(int var1) {
      this.taskID = var1;
   }

   public ScriptIndex getNowIndex() {
      return this.nowIndex;
   }

   public ScriptTask(String[] var1, int var2) {
      int var10001 = --5;
      int var10003 = --4;
      int var10007 = --3;
      int var10012 = 4 ^ 5;
      super();
      this.first = (boolean)var10012;
      this.taskSetID = var2;
      this.mapPoint = new hY(Integer.parseInt(var1[3 >> 2]), Integer.parseInt(var1[3 & 5]), Integer.parseInt(var1[--2]));
      this.npcID = Integer.parseInt(var1[var10007]);
      this.sum = Integer.parseInt(var1[var10003]);
      this.j(var10001, var1);
   }

   public boolean i() {
      if (ev.l() > this.timeAssist) {
         int var10000 = --1;
         this.timeAssist = ev.l() + 500L;
         return (boolean)var10000;
      } else {
         return false;
      }
   }

   public void j(int var1, String[] var2) {
      for(int var10000 = var1 = var1; var10000 < var2.length; var10000 = var1) {
         String[] var3;
         ScriptIndex var4;
         if (var2[var1].startsWith("系统野怪设置=")) {
            var3 = var2[var1].split("=");
            var4 = new ScriptIndex(3 >> 2);
            var4.setKey(Integer.parseInt(var3[--1]));
            var4.setMapPoint(new hY(Integer.parseInt(var3[--2]), Integer.parseInt(var3[--3]), Integer.parseInt(var3[--4])));
            this.k(var4);
         } else if (var2[var1].startsWith("巡逻设置=")) {
            var3 = var2[var1].split("=");
            var4 = new ScriptIndex(5 >> 2);
            var4.setMapPoint(new hY(Integer.parseInt(var3[4 ^ 5]), Integer.parseInt(var3[1 ^ 3]), Integer.parseInt(var3[--3])));
            this.k(var4);
         } else if (var2[var1].startsWith("时间间隔=")) {
            this.timeInterval = Integer.parseInt(var2[var1].substring(--5)) * (29678 & 4089);
         } else if (var2[var1].startsWith("任务ID=")) {
            this.taskID = Integer.parseInt(var2[var1].substring(--5));
         }

         ++var1;
      }

   }

   public void setNpcID(int var1) {
      this.npcID = var1;
   }

   public void setNowIndex(ScriptIndex var1) {
      this.nowIndex = var1;
   }

   public void setTimeAssist() {
      this.timeAssist = ev.l() + (long)(this.first ? 16382 & 16885 : this.timeInterval);
   }

   public void k(ScriptIndex var1) {
      if (this.indexList == null) {
         this.indexList = new ArrayList();
      }

      this.indexList.add(var1);
   }

   public void setTimeInterval(int var1) {
      this.timeInterval = var1;
   }
}
