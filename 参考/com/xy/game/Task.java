package com.xy.game;

import com.xy.ev;
import com.xy.lg;
import com.xy.lz;
import com.xy.mi;
import com.xy.bean.Coordinates;
import com.xy.readbean.TaskData;
import com.xy.richtext.InputBean;
import com.xy.richtext.RichLabel;
import com.xy.script.ScriptTask;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Task {
   private int taskId;
   private List<TaskProgress> progress;
   private transient TaskData taskData;
   private transient RichLabel richLabel;
   private int taskState;
   private long time;

   public TaskProgress getTaskProgress(ScriptTask var1) {
      int var2;
      for(int var10000 = var2 = 3 ^ 3; var10000 < this.progress.size(); var10000 = var2) {
         TaskProgress var3;
         if ((var3 = (TaskProgress)this.progress.get(var2)).getSum() < var3.getMax()) {
            if (var3.getType() == (2 ^ 3) || var3.getType() == 5 >> 1 || var3.getType() == --3) {
               return var3;
            }

            if (var3.getType() == 0) {
               if (var1.c(3 ^ 3, var3.getDId())) {
                  return var3;
               }
            } else if (var3.getType() == (7 & 126)) {
               if (var1.c(5 >> 2, 3 ^ 3)) {
                  return var3;
               }
            } else {
               if (var3.getType() == --4) {
                  return var3;
               }

               if (var3.getType() == (107 & 28)) {
                  return var3;
               }
            }
         }

         ++var2;
      }

      return null;
   }

   public TaskData getTaskData() {
      return this.taskData;
   }

   public boolean a() {
      if (this.taskState != --2) {
         return false;
      } else {
         int var10000;
         if (this.progress == null) {
            var10000 = --1;
            this.taskState = --3;
            return (boolean)var10000;
         } else {
            int var1;
            for(var10000 = var1 = 0; var10000 < this.progress.size(); var10000 = var1) {
               if (((TaskProgress)this.progress.get(var1)).getSum() < ((TaskProgress)this.progress.get(var1)).getMax()) {
                  return (boolean)(5 >> 3);
               }

               ++var1;
            }

            var10000 = 4 ^ 5;
            this.taskState = --3;
            return (boolean)var10000;
         }
      }
   }

   public void b(String[] var1, lg var2) {
      String[] var10000;
      if (this.progress != null) {
         this.progress.clear();
         var10000 = var1;
      } else {
         this.progress = new ArrayList();
         var10000 = var1;
      }

      TaskProgress var3;
      int var5;
      int var12;
      if (var10000 != null) {
         for(var12 = var5 = 5 >> 1; var12 < var1.length; var12 = var5) {
            if (!var1[var5].startsWith("P")) {
               if (var1[var5].startsWith("T")) {
                  this.time = Long.parseLong(var1[var5].substring(--1)) * 1000L;
               }
            } else {
               String[] var4 = var1[var5].split("_");
               var3 = new TaskProgress(this);
               var12 = 3 & 5;
               int var10002 = 3 & 5;
               int var10007 = 2 & 5;
               var3.setType(Integer.parseInt(var4[2 & 5].substring(--1)));
               var3.setSum(var10007);
               var3.setMax(var10002);

               for(int var6 = var12; var12 < var4.length; var12 = var6) {
                  String[] var7;
                  if (var4[var6].startsWith("S")) {
                     var10000 = var7 = var4[var6].split("-");
                     var10002 = 2 ^ 3;
                     var3.setSum(Integer.parseInt(var7[2 & 5].substring(--1)));
                     var3.setMax(Integer.parseInt(var10000[var10002]));
                  } else if (var4[var6].startsWith("M")) {
                     var10000 = var7 = var4[var6].split("-");
                     var10002 = 1 ^ 3;
                     int var10004 = 3 >> 1;
                     var3.setMap(Integer.parseInt(var7[5 >> 3].substring(--1)));
                     var3.setX(Integer.parseInt(var7[var10004]));
                     var3.setY(Integer.parseInt(var10000[var10002]));
                  } else if (var4[var6].startsWith("D")) {
                     var10000 = var7 = var4[var6].split("-");
                     var10002 = --1;
                     var3.setDId(Integer.parseInt(var7[3 ^ 3].substring(3 >> 1)));
                     var3.setDName(var10000[var10002]);
                  } else if (var4[var6].startsWith("G")) {
                     var10000 = var7 = var4[var6].split("-");
                     var10002 = 3 & 5;
                     var3.setGId(Integer.parseInt(var7[5 >> 3].substring(--1)));
                     var3.setGName(var10000[var10002]);
                  }

                  ++var6;
               }

               this.progress.add(var3);
            }

            ++var5;
         }
      }

      if (this.progress.size() == 0) {
         this.richLabel = null;
      } else {
         StringBuffer var9;
         (var9 = new StringBuffer()).append("#Y");
         var9.append(this.getTaskData().getTaskName());
         var9.append("#W[");
         var9.append(this.taskData.getTaskSet().getTaskType());
         var9.append("]");
         int var8 = 3 & 4;

         for(var12 = var8; var12 < this.progress.size(); var12 = var8) {
            TaskProgress var13 = var3 = (TaskProgress)this.progress.get(var8);
            var9.append("#r");
            Coordinates var10;
            InputBean var11;
            if (var13.getType() != 0 && var3.getType() != (3 & 5) && var3.getType() != 5 >> 1) {
               if (var3.getType() == --3) {
                  var13 = var3;
                  var9.append("问候");
               } else if (var3.getType() == --4) {
                  var9.append("将");
                  var13 = var3;
                  var9.append(var3.getDName());
                  var9.append("送给");
               } else if (var3.getType() == --5) {
                  var9.append("护送");
                  var13 = var3;
                  var9.append(var3.getDName());
                  var9.append("到");
               } else if (var3.getType() == (14 & 119)) {
                  var9.append("到");
                  var10 = new Coordinates(var3.getMap(), var3.getX(), var3.getY());
                  var11 = new InputBean((Integer)null, var3.getType() + (94 & 53), new BigDecimal(var3.getGId()), var2.ab(String.valueOf(var3.getMap())), "G", var10);
                  var9.append("#V");
                  var9.append(mi.b().toJson(var11));
                  var9.append("#L");
                  var9.append("巡逻");
                  var13 = var3;
               } else if (var3.getType() == (55 & 79)) {
                  var13 = var3;
                  var9.append("答题");
               } else {
                  if (var3.getType() == (95 & 40)) {
                     var9.append("泡点");
                  }

                  var13 = var3;
               }
            } else {
               var9.append("击杀");
               var13 = var3;
            }

            label130: {
               if (var13.getType() != (38 & 95)) {
                  if (var3.getMap() == 0) {
                     var9.append(var3.getType() != --4 && var3.getType() != --5 && var3.getType() != (127 & 7) ? var3.getDName() : var3.getGName());
                     var13 = var3;
                     break label130;
                  }

                  if (var3.getType() == (11 & 124)) {
                     var10 = new Coordinates(var3.getMap(), var3.getX(), var3.getY());
                     var11 = new InputBean((Integer)null, var3.getType() + (85 & 62), new BigDecimal(var3.getDId()), "挂机点", "G", var10);
                     var13 = var3;
                     var9.append("#V");
                     var9.append(mi.b().toJson(var11));
                     var9.append("#L");
                     break label130;
                  }

                  var10 = new Coordinates(var3.getMap(), var3.getX(), var3.getY());
                  var11 = new InputBean((Integer)null, var3.getType() + (21 & 126), new BigDecimal(var3.getType() != --4 && var3.getType() != --5 && var3.getType() != (111 & 23) ? var3.getDId() : var3.getGId()), var3.getType() != --4 && var3.getType() != --5 && var3.getType() != (127 & 7) ? var3.getDName() : var3.getGName(), "G", var10);
                  var9.append("#V");
                  var9.append(mi.b().toJson(var11));
                  var9.append("#L");
               }

               var13 = var3;
            }

            if (var13.getType() == 0 || var3.getType() == (4 ^ 5) || var3.getType() == 5 >> 1 || var3.getType() == --4 || var3.getType() == (6 & 127) || var3.getType() == (95 & 39) || var3.getType() == (122 & 13)) {
               var9.append(" ");
               var9.append(var3.getSum());
               var9.append("/");
               var9.append(var3.getMax());
            }

            ++var8;
         }

         if (this.richLabel == null) {
            this.richLabel = new RichLabel(var9.toString(), lz.bm, 25511 & 7421);
         } else {
            this.richLabel.setTextSize(var9.toString(), 5551 & 27381);
         }
      }
   }

   public TaskProgress getProgressFinish(String var1, String var2) {
      int var4;
      for(int var10000 = var4 = 3 >> 2; var10000 < this.progress.size(); var10000 = var4) {
         TaskProgress var3;
         if ((var3 = (TaskProgress)this.progress.get(var4)).getSum() < var3.getMax() && var2.equals(var3.getType() != --5 && var3.getType() != (55 & 79) ? var3.getDName() : var3.getGName())) {
            if ((var3.getType() == 0 || var3.getType() == --1 || var3.getType() == --2) && var1.equals("击杀")) {
               return var3;
            }

            if ((var3.getType() == --3 || var3.getType() == --5) && var1.equals("问候")) {
               return var3;
            }

            if (var3.getType() == --4 && var1.equals("给予物品")) {
               return var3;
            }

            if (var3.getType() == (103 & 31) && var1.equals("答题")) {
               return var3;
            }
         }

         ++var4;
      }

      return null;
   }

   public int getTaskId() {
      return this.taskId;
   }

   public void setTime(long var1) {
      this.time = var1;
   }

   public boolean c() {
      if (this.time == 0L) {
         return (boolean)(5 >> 3);
      } else {
         return (boolean)(this.time <= ev.f() ? 3 & 5 : 0);
      }
   }

   public Task(int var1, int var2, TaskData var3) {
      this.taskId = var1;
      this.taskState = var2;
      this.taskData = var3;
   }

   public void setTaskId(int var1) {
      this.taskId = var1;
   }

   public int d(String var1, String var2) {
      int var4;
      for(int var10000 = var4 = 3 ^ 3; var10000 < this.progress.size(); var10000 = var4) {
         TaskProgress var3;
         if ((var3 = (TaskProgress)this.progress.get(var4)).getSum() < var3.getMax() && var2.equals(var3.getType() != --5 && var3.getType() != (111 & 23) ? var3.getDName() : var3.getGName())) {
            if ((var3.getType() == 0 || var3.getType() == (2 ^ 3) || var3.getType() == (1 ^ 3)) && var1.equals("击杀")) {
               return --3;
            }

            if ((var3.getType() == --3 || var3.getType() == --5) && var1.equals("问候")) {
               return 3 >> 1;
            }

            if (var3.getType() == --4 && var1.equals("给予物品")) {
               return --2;
            }

            if (var3.getType() == (7 & 127) && var1.equals("答题")) {
               return --4;
            }
         }

         ++var4;
      }

      return 2 & 5;
   }

   public void setTaskData(TaskData var1) {
      this.taskData = var1;
   }

   public void setProgress(List<TaskProgress> var1) {
      this.progress = var1;
   }

   public List<TaskProgress> getProgress() {
      return this.progress;
   }

   public RichLabel getRichLabel() {
      return this.richLabel;
   }

   public void setTaskState(int var1) {
      this.taskState = var1;
   }

   public long getTime() {
      return this.time;
   }

   public int getTaskState() {
      return this.taskState;
   }
}
