package com.xy.game;

public class TaskRecord {
   private int bSum;
   private int taskId;
   private int cSum;
   private int rSum;
   private int newID;

   public int getTaskId() {
      return this.taskId;
   }

   public int getbSum() {
      return this.bSum;
   }

   public int getrSum() {
      return this.rSum;
   }

   public void a(int var1) {
      this.rSum += var1;
   }

   public TaskRecord(int var1) {
      this.taskId = var1;
   }

   public int getcSum() {
      return this.cSum;
   }

   public void setbSum(int var1) {
      this.bSum = var1;
   }

   public void b(StringBuffer var1) {
      if (var1.length() != 0) {
         var1.append("|");
      }

      var1.append(this.taskId);
      var1.append("-");
      var1.append(this.rSum);
      var1.append("-");
      var1.append(this.cSum);
      if (this.newID != 0) {
         var1.append("-");
         var1.append(this.newID);
      }

      if (this.bSum != 0) {
         var1.append("-B");
         var1.append(this.bSum);
      }

   }

   public void setNewID(int var1) {
      this.newID = var1;
   }

   public void setcSum(int var1) {
      this.cSum = var1;
   }

   public int getNewID() {
      return this.newID;
   }

   public void setTaskId(int var1) {
      this.taskId = var1;
   }

   public void setrSum(int var1) {
      this.rSum = var1;
   }

   public void c(int var1) {
      this.cSum += var1;
   }
}
