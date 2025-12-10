package com.xy.script;

public class ScriptEnd {
   private int x;
   private int z;
   private int type;
   private int map;
   private int y;

   public void setX(int var1) {
      this.x = var1;
   }

   public void setZ(int var1) {
      this.z = var1;
   }

   public int getX() {
      return this.x;
   }

   public int getY() {
      return this.y;
   }

   public int getType() {
      return this.type;
   }

   public int getMap() {
      return this.map;
   }

   public void setY(int var1) {
      this.y = var1;
   }

   public void setMap(int var1) {
      this.map = var1;
   }

   public ScriptEnd(int var1) {
      this.type = var1;
   }

   public void setType(int var1) {
      this.type = var1;
   }

   public int getZ() {
      return this.z;
   }

   public ScriptEnd(int var1, int var2, int var3, int var4) {
      int var10009 = 3 ^ 3;
      super();
      this.type = var10009;
      this.map = var1;
      this.x = var2;
      this.y = var3;
      this.z = var4;
   }
}
