package com.xy.bean;

public class CreepsMovePath {
   private String points;
   private int time;
   private int y;
   private int x;

   public void setPoints(String var1) {
      this.points = var1;
   }

   public CreepsMovePath(int var1, int var2, int var3, String var4) {
      this.x = var1;
      this.y = var2;
      this.time = var3;
      this.points = var4;
   }

   public int getY() {
      return this.y;
   }

   public int getTime() {
      return this.time;
   }

   public void setY(int var1) {
      this.y = var1;
   }

   public String toString() {
      StringBuffer var1;
      (var1 = new StringBuffer()).append(this.x);
      var1.append("*");
      var1.append(this.y);
      var1.append("*");
      var1.append(this.points);
      return var1.toString();
   }

   public int getX() {
      return this.x;
   }

   public void setTime(int var1) {
      this.time = var1;
   }

   public void setX(int var1) {
      this.x = var1;
   }

   public String getPoints() {
      return this.points;
   }
}
