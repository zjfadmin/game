package com.xy.bean;

public class Coordinates {
   private int x;
   private int mapID;
   private int y;

   public int getY() {
      return this.y;
   }

   public Coordinates(int var1, int var2, int var3) {
      this.mapID = var1;
      this.x = var2;
      this.y = var3;
   }

   public void setY(int var1) {
      this.y = var1;
   }

   public int getMapID() {
      return this.mapID;
   }

   public int getX() {
      return this.x;
   }

   public void setX(int var1) {
      this.x = var1;
   }

   public void setMapID(int var1) {
      this.mapID = var1;
   }
}
