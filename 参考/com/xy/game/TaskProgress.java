package com.xy.game;

public class TaskProgress {
   private int max;
   private int y;
   private String GName;
   private String DName;
   private int map;
   private int x;
   private Task task;
   private int GId;
   private int DId;
   private int sum;
   private int type;

   public int getGId() {
      return this.GId;
   }

   public void setType(int var1) {
      this.type = var1;
   }

   public int getDId() {
      return this.DId;
   }

   public TaskProgress(Task var1) {
      this.task = var1;
   }

   public int getX() {
      return this.x;
   }

   public void setMax(int var1) {
      this.max = var1;
   }

   public int getSum() {
      return this.sum;
   }

   public void setX(int var1) {
      this.x = var1;
   }

   public void a(int var1) {
      this.sum += var1;
      if (this.sum > this.max) {
         this.sum = this.max;
      }

   }

   public int getType() {
      return this.type;
   }

   public void setSum(int var1) {
      this.sum = var1;
   }

   public String getDName() {
      return this.DName;
   }

   public int getMax() {
      return this.max;
   }

   public void setGName(String var1) {
      this.GName = var1;
   }

   public int getMap() {
      return this.map;
   }

   public Task getTask() {
      return this.task;
   }

   public String getGName() {
      return this.GName;
   }

   public int getY() {
      return this.y;
   }

   public void setGId(int var1) {
      this.GId = var1;
   }

   public void setY(int var1) {
      this.y = var1;
   }

   public void setDName(String var1) {
      this.DName = var1;
   }

   public void setDId(int var1) {
      this.DId = var1;
   }

   public void setMap(int var1) {
      this.map = var1;
   }
}
