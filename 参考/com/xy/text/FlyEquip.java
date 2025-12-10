package com.xy.text;

public class FlyEquip {
   private boolean isMove;
   private long time;
   private int y;
   private int x;

   public long getTime() {
      return this.time;
   }

   public void setY(int var1) {
      this.y = var1;
   }

   public boolean a() {
      return this.isMove;
   }

   public void setMove(boolean var1) {
      this.isMove = var1;
   }

   public void setX(int var1) {
      this.x = var1;
   }

   public int getX() {
      return this.x;
   }

   public int getY() {
      return this.y;
   }

   public FlyEquip(int var1, int var2, boolean var3, long var4) {
      this.x = var1;
      this.y = var2;
      this.isMove = var3;
      this.time = var4;
   }

   public void setTime(long var1) {
      this.time = var1;
   }
}
