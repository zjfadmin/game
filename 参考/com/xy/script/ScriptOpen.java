package com.xy.script;

import java.math.BigDecimal;

public class ScriptOpen {
   private int map;
   private int x;
   private int type;
   private long id;
   private BigDecimal rgid;
   private int y;
   private int z;

   public int getY() {
      return this.y;
   }

   public BigDecimal getRgid() {
      return this.rgid;
   }

   public void setType(int var1) {
      this.type = var1;
   }

   public void setId(long var1) {
      this.id = var1;
   }

   public int getZ() {
      return this.z;
   }

   public int getX() {
      return this.x;
   }

   public ScriptOpen(int var1, long var2, int var4, int var5, int var6, int var7) {
      this.type = var1;
      this.id = var2;
      this.map = var4;
      this.x = var5;
      this.y = var6;
      this.z = var7;
   }

   public int getMap() {
      return this.map;
   }

   public long getId() {
      return this.id;
   }

   public ScriptOpen(int var1, long var2) {
      this.type = var1;
      this.id = var2;
   }

   public void setZ(int var1) {
      this.z = var1;
   }

   public void setY(int var1) {
      this.y = var1;
   }

   public void setMap(int var1) {
      this.map = var1;
   }

   public void setX(int var1) {
      this.x = var1;
   }

   public void setRgid(BigDecimal var1) {
      this.rgid = var1;
   }

   public ScriptOpen(int var1, int var2, int var3) {
      int var10007 = 3 ^ 3;
      super();
      this.type = var10007;
      this.x = var1;
      this.y = var2;
      this.z = var3;
   }

   public int getType() {
      return this.type;
   }
}
