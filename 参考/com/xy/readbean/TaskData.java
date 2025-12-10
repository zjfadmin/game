package com.xy.readbean;

import com.xy.ev;
import com.xy.hd;
import com.xy.game.GameUtil;

public class TaskData {
   private int TeamSum;
   private transient TaskTime[] taskTimes;
   private String openTime;
   private int taskSetID;
   private transient int[] lvls;
   private String taskText;
   private int taskID;
   private String unknow;
   private int time;
   private transient TaskSet taskSet;
   private String lvl;
   private String taskName;
   private int nd;
   private String taskEnd;
   private int isTP;
   private String taskOpen;

   public boolean a(String var1) {
      if (this.unknow == null) {
         return (boolean)(5 >> 3);
      } else {
         return (boolean)(this.unknow.indexOf(var1) != -4 >> 2 ? 4 ^ 5 : 0);
      }
   }

   public String getOpenTime() {
      return this.openTime;
   }

   public void setTaskOpen(String var1) {
      this.taskOpen = var1;
   }

   public int getIsTP() {
      return this.isTP;
   }

   public boolean b(int var1, boolean var2) {
      if (this.TeamSum == 0) {
         return (boolean)(4 ^ 5);
      } else if (!var2) {
         return (boolean)(3 & 4);
      } else {
         return (boolean)(var1 >= this.TeamSum ? 4 ^ 5 : 0);
      }
   }

   public int getTaskID() {
      return this.taskID;
   }

   public void setTaskSet(TaskSet var1) {
      this.taskSet = var1;
   }

   public String getTaskEnd() {
      return this.taskEnd;
   }

   public void setTaskName(String var1) {
      this.taskName = var1;
   }

   public void setUnknow(String var1) {
      this.unknow = var1;
   }

   public void setLvl(String var1) {
      this.lvl = var1;
   }

   public void setOpenTime(String var1) {
      this.openTime = var1;
   }

   public void setTaskText(String var1) {
      this.taskText = var1;
   }

   public String getTaskOpen() {
      return this.taskOpen;
   }

   public int getTeamSum() {
      return this.TeamSum;
   }

   public String getTaskName() {
      return this.taskName;
   }

   public void setNd(int var1) {
      this.nd = var1;
   }

   public boolean c(int var1) {
      if (hd.o(this.lvl)) {
         return (boolean)(5 >> 2);
      } else {
         if (this.lvls == null) {
            int[] var10004 = new int[--5];
            boolean var10006 = true;
            var10004[5 >> 1] = --4;
            var10004[--3] = 21724 & 11243;
            var10004[--4] = 11006 & 21961;
            this.lvls = var10004;
            String[] var2;
            String[] var3 = (var2 = this.lvl.split("\\|"))[2 & 5].split("\\-");
            this.lvls[3 >> 1] = Integer.parseInt(var3[3 >> 2]);
            this.lvls[--3] = Integer.parseInt(var3[3 & 5]);
            if (var2.length >= --2) {
               this.lvls[3 & 4] = Integer.parseInt(var2[3 & 5]);
            }

            if (var2.length == --3) {
               var3 = var2[5 >> 1].split("\\-");
               this.lvls[--2] = Integer.parseInt(var3[5 >> 3]);
               this.lvls[--4] = Integer.parseInt(var3[5 >> 2]);
            }
         }

         return GameUtil.c(var1, this.lvls);
      }
   }

   public boolean d() {
      if (hd.o(this.openTime)) {
         return (boolean)(--1);
      } else {
         int var10000;
         if (this.taskTimes == null) {
            String[] var1;
            TaskTime[] var10001 = new TaskTime[(var1 = this.openTime.split("\\|")).length];
            boolean var10003 = true;
            this.taskTimes = var10001;

            int var2;
            for(var10000 = var2 = 3 & 4; var10000 < this.taskTimes.length; var10000 = var2) {
               this.taskTimes[var2] = new TaskTime();
               String[] var3;
               int var4;
               TaskData var7;
               if ((var4 = Integer.parseInt((var3 = var1[var2].split("-"))[3 & 4])) == (31 & 103)) {
                  var4 = 3 & 4;
                  var7 = this;
               } else {
                  --var4;
                  var7 = this;
               }

               var7.taskTimes[var2].setWeek(var4);
               this.taskTimes[var2].setStartTime(Integer.parseInt(var3[4 ^ 5]));
               TaskTime var8 = this.taskTimes[var2];
               int var10002 = 5 >> 1;
               ++var2;
               var8.setEndTime(Integer.parseInt(var3[var10002]));
            }
         }

         int var5;
         for(var10000 = var5 = 0; var10000 < this.taskTimes.length; var10000 = var5) {
            TaskTime var6;
            if ((var6 = this.taskTimes[var5]).getWeek() == ev.f && ev.u >= var6.getStartTime() && ev.u < var6.getEndTime()) {
               return (boolean)(--1);
            }

            ++var5;
         }

         return (boolean)(3 & 4);
      }
   }

   public String getUnknow() {
      return this.unknow;
   }

   public void setTaskID(int var1) {
      this.taskID = var1;
   }

   public void setIsTP(int var1) {
      this.isTP = var1;
   }

   public int getTaskSetID() {
      return this.taskSetID;
   }

   public String getLvl() {
      return this.lvl;
   }

   public TaskSet getTaskSet() {
      return this.taskSet;
   }

   public void setTeamSum(int var1) {
      this.TeamSum = var1;
   }

   public void setTaskSetID(int var1) {
      this.taskSetID = var1;
   }

   public void setTime(int var1) {
      this.time = var1;
   }

   public int getNd() {
      return this.nd;
   }

   public void setTaskEnd(String var1) {
      this.taskEnd = var1;
   }

   public int getTime() {
      return this.time;
   }

   public String getTaskText() {
      return this.taskText;
   }

   public String getUnknowType(String var1) {
      return this.unknow == null ? null : hd.d(this.unknow, var1 + "=", "|");
   }
}
