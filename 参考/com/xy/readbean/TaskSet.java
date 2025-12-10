package com.xy.readbean;

public class TaskSet {
   private int resetcycle;
   private String taskType;
   private String taskTQ;
   private String taskMsg;
   private int taskSetID;
   private int taskMsgID;
   private int sumreceive;
   private transient TaskTQ tq;
   private int sumlimit;
   private int sumcycle;

   public int getResetcycle() {
      return this.resetcycle;
   }

   public void setTaskMsgID(int var1) {
      this.taskMsgID = var1;
   }

   public void setSumcycle(int var1) {
      this.sumcycle = var1;
   }

   public int getTaskSetID() {
      return this.taskSetID;
   }

   public void setResetcycle(int var1) {
      this.resetcycle = var1;
   }

   public int getSumreceive() {
      return this.sumreceive;
   }

   public int getSumcycle() {
      return this.sumcycle;
   }

   public void setTaskSetID(int var1) {
      this.taskSetID = var1;
   }

   public void setTaskType(String var1) {
      this.taskType = var1;
   }

   public void setSumreceive(int var1) {
      this.sumreceive = var1;
   }

   public String getTaskMsg() {
      return this.taskMsg;
   }

   public int getSumlimit() {
      return this.sumlimit;
   }

   public double a(int var1) {
      if (this.sumcycle == 0) {
         var1 = 3 & 4;
      } else {
         var1 %= this.sumcycle;
      }

      double var10001 = 1.0D;
      double var10000 = 1.0D + 0.05D * (double)var1;
      var10001 = 1.0D + 0.05D * (double)var1;
      return var10000;
   }

   public int getTaskMsgID() {
      return this.taskMsgID;
   }

   public TaskTQ getTq() {
      if (this.taskTQ != null) {
         if (!this.taskTQ.equals("")) {
            this.tq = new TaskTQ(this.taskTQ);
         }

         this.taskTQ = null;
      }

      return this.tq;
   }

   public void setTaskMsg(String var1) {
      this.taskMsg = var1;
   }

   public String getTaskType() {
      return this.taskType;
   }

   public void setSumlimit(int var1) {
      this.sumlimit = var1;
   }
}
