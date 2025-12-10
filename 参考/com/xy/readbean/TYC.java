package com.xy.readbean;

import java.util.ArrayList;
import java.util.List;

public class TYC {
   private int v2;
   public static final int TYC3 = 3;
   private int type;
   public static final int TYC1 = 1;
   private List<TYC> list;
   private int[] vs;
   public static final int TYC2 = 2;
   public static final int TYC7 = 7;
   public static final int TYC6 = 6;
   public static final int TYC5 = 5;
   public static final int TYC0 = 0;
   private int v1;
   public static final int TYC4 = 4;

   public void setVs(int[] var1) {
      this.vs = var1;
   }

   public void setList(List<TYC> var1) {
      this.list = var1;
   }

   public void setType(int var1) {
      this.type = var1;
   }

   public void setV2(int var1) {
      this.v2 = var1;
   }

   public TYC(String var1) {
      String[] var6 = var1.split("#");
      this.type = 3 >> 2;
      this.v1 = Integer.parseInt(var6[3 ^ 3]);
      this.v2 = Integer.parseInt(var6[3 >> 1]);
      if (var6.length != 5 >> 1) {
         this.list = new ArrayList();

         int var2;
         for(int var10000 = var2 = 1 ^ 3; var10000 < var6.length; var10000 = var2) {
            label64: {
               TYC var4 = new TYC();
               TYC var8;
               if (var6[var2].startsWith("D")) {
                  var8 = this;
                  var4.type = --1;
                  var4.v1 = Integer.parseInt(var6[var2].substring(--1));
               } else {
                  String[] var3;
                  int var5;
                  int[] var9;
                  int var10;
                  int[] var10001;
                  int var10002;
                  boolean var10003;
                  if (var6[var2].startsWith("Z")) {
                     var4.type = --2;
                     var10001 = new int[(var3 = var6[var2].substring(3 >> 1).split("-")).length];
                     var10003 = true;
                     var4.vs = var10001;

                     for(var10000 = var5 = 3 & 4; var10000 < var3.length; var10000 = var5) {
                        var9 = var4.vs;
                        var10 = var5;
                        var10002 = Integer.parseInt(var3[var5]);
                        ++var5;
                        var9[var10] = var10002;
                     }

                     var8 = this;
                  } else {
                     int var7;
                     if (var6[var2].startsWith("Q")) {
                        var8 = this;
                        var4.type = --3;
                        var7 = var6[var2].indexOf("-");
                        var4.v1 = Integer.parseInt(var6[var2].substring(2 ^ 3, var7));
                        var4.v2 = Integer.parseInt(var6[var2].substring(var7 + (3 >> 1)));
                     } else if (var6[var2].startsWith("L")) {
                        var8 = this;
                        var4.type = --4;
                        var7 = var6[var2].indexOf("-");
                        var4.v1 = Integer.parseInt(var6[var2].substring(--1, var7));
                        var4.v2 = Integer.parseInt(var6[var2].substring(var7 + (2 ^ 3)));
                     } else if (var6[var2].startsWith("C")) {
                        var4.type = --5;
                        var10001 = new int[(var3 = var6[var2].substring(5 >> 2).split("-")).length];
                        var10003 = true;
                        var4.vs = var10001;

                        for(var10000 = var5 = 2 & 5; var10000 < var3.length; var10000 = var5) {
                           var9 = var4.vs;
                           var10 = var5;
                           var10002 = Integer.parseInt(var3[var5]);
                           ++var5;
                           var9[var10] = var10002;
                        }

                        var8 = this;
                     } else if (var6[var2].startsWith("G")) {
                        var4.type = 119 & 14;
                        var10001 = new int[(var3 = var6[var2].substring(3 & 5).split("-")).length - (3 & 5)];
                        var10003 = true;
                        var4.vs = var10001;
                        var10000 = 4 ^ 5;
                        var4.v1 = Integer.parseInt(var3[3 ^ 3]);

                        for(var5 = var10000; var10000 < var3.length; var10000 = var5) {
                           var9 = var4.vs;
                           var10 = var5 - (5 >> 2);
                           var10002 = Integer.parseInt(var3[var5]);
                           ++var5;
                           var9[var10] = var10002;
                        }

                        var8 = this;
                     } else {
                        if (!var6[var2].startsWith("J")) {
                           break label64;
                        }

                        var8 = this;
                        var4.type = 7 & 127;
                        var4.v1 = Integer.parseInt(var6[var2].substring(3 & 5));
                     }
                  }
               }

               var8.list.add(var4);
            }

            ++var2;
         }

      }
   }

   public int getV1() {
      return this.v1;
   }

   public void setV1(int var1) {
      this.v1 = var1;
   }

   public int getType() {
      return this.type;
   }

   public int[] getVs() {
      return this.vs;
   }

   public TYC() {
   }

   public List<TYC> getList() {
      return this.list;
   }

   public int getV2() {
      return this.v2;
   }
}
