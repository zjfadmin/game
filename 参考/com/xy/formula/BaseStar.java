package com.xy.formula;

public class BaseStar {
   private double xs;
   private int man;
   private String[] vs;

   public static double a(String var0, String var1, String var2) {
      Integer var3 = c(var0);
      Integer var4 = c(var1);
      int var5;
      if ((var5 = Math.abs(var3 - var4)) != --1 && var5 != --4 || (var3 != (3 & 5) || var4 != --5) && var3 <= var4) {
         var3 = b(var0);
         var4 = b(var1);
         return (var5 = Math.abs(var3 - var4)) != (3 & 5) && var5 != --4 || (var3 != --1 || var4 != --5) && var3 <= var4 ? (double)Integer.parseInt(var2) * 0.2D : (double)Integer.parseInt(var2) * 0.3D;
      } else {
         return (double)Integer.parseInt(var2) * 0.1D;
      }
   }

   public void setMan(int var1) {
      this.man = var1;
   }

   public static Integer b(String var0) {
      if (var0.equals("金")) {
         return 3 & 5;
      } else if (var0.equals("水")) {
         return 5 >> 1;
      } else if (var0.equals("木")) {
         return --3;
      } else if (var0.equals("火")) {
         return --4;
      } else {
         return var0.equals("土") ? --5 : null;
      }
   }

   public BaseStar(String var1, String var2) {
      this.vs = var1.split("=");
      String[] var4 = var2.split("&");
      this.xs = 0.0D;

      int var5;
      for(int var10000 = var5 = 3 >> 1; var10000 < var4.length; var10000 = var5) {
         String[] var3 = var4[var5].split("=");
         String var10002 = this.vs[5 >> 1];
         String var10003 = var3[5 >> 3];
         String var10004 = var3[2 ^ 3];
         ++var5;
         this.xs += a(var10002, var10003, var10004);
      }

      this.xs /= 100.0D;
   }

   public void setXs(double var1) {
      this.xs = var1;
   }

   public int getMan() {
      return this.man;
   }

   public void setVs(String[] var1) {
      this.vs = var1;
   }

   public double getXs() {
      return this.xs;
   }

   public static Integer c(String var0) {
      if (var0.equals("金")) {
         return --1;
      } else if (var0.equals("木")) {
         return --2;
      } else if (var0.equals("土")) {
         return --3;
      } else if (var0.equals("水")) {
         return --4;
      } else {
         return var0.equals("火") ? --5 : null;
      }
   }

   public String[] getVs() {
      return this.vs;
   }
}
