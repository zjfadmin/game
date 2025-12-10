package com.xy;

import com.xy.formula.FormulaNum;
import com.xy.readbean.Door;
import com.xy.readbean.MapModel;
import com.xy.readbean.NpcInfoBean;
import java.util.ArrayList;
import java.util.List;

public class Class686 {
   private int a;
   private List<Class543> b;

   public List<Class543> a() {
      return this.b;
   }

   public Class686(int var1, Class603 var2) {
      this.a = var1;
      MapModel var4;
      if ((var4 = var2.ay(String.valueOf(var1))) != null) {
         int var5;
         int var6;
         FormulaNum var7;
         int var8;
         int var9;
         long var10;
         int var10000;
         if (!Class394.o(var4.getMapDoor())) {
            String var3 = var4.getMapDoor();
            var5 = 3 & 4;

            for(var10000 = var6 = 3 ^ 3; var10000 != var3.length(); var10000 = var6) {
               if ((var6 = var3.indexOf("|", var5 + (3 & 5))) == -4 >> 2) {
                  var6 = var3.length();
               }

               var7 = new FormulaNum(var3.substring(var5, var6));
               var8 = 5 >> 3;
               var9 = var7.getSize();

               for(var10000 = var8; var10000 < var9; var10000 = var8) {
                  var10 = var7.getZhi(var8);
                  Door var12;
                  int[] var13;
                  if ((var12 = var2.bo(String.valueOf(var10))) != null && (var13 = var12.getRects()) != null) {
                     Class543 var14 = new Class543(3 >> 2, var10, var12);
                     int var10003 = 1 ^ 3;
                     int var10006 = 3 ^ 3;
                     var14.b = var1;
                     var14.f = (var13[var10006] + var13[--1]) / --2;
                     var14.j = (var13[var10003] + var13[--3]) / (1 ^ 3);
                     if (this.b == null) {
                        this.b = new ArrayList();
                     }

                     this.b.add(var14);
                  }

                  ++var8;
               }

               var5 = var6 + (3 & 5);
            }
         }

         FormulaNum[] var15 = var4.getNpcs();
         var5 = 5 >> 3;
         var6 = var15 != null ? var15.length : 0;

         for(var10000 = var5; var10000 < var6; var10000 = var5) {
            var7 = var15[var5];
            var8 = 5 >> 3;
            var9 = var7.getSize();

            for(var10000 = var8; var10000 < var9; var10000 = var8) {
               var10 = var7.getZhi(var8);
               NpcInfoBean var16;
               if ((var16 = var2.ck(String.valueOf(var10))) != null && var16.getNpctable().getNpctype().equals("2")) {
                  this.b(var16, var16.getNpctable().getNpcway(), var2);
               }

               ++var8;
            }

            ++var5;
         }

      }
   }

   public void b(NpcInfoBean var1, String var2, Class603 var3) {
      int var10000 = 3 & 4;
      int var4 = 3 >> 2;

      int var5;
      for(var10000 = var5 = 5 >> 3; var10000 != var2.length(); var10000 = var5) {
         if ((var5 = var2.indexOf("|", var4 + (2 ^ 3))) == -4 >> 2) {
            var5 = var2.length();
         }

         FormulaNum var6 = new FormulaNum(var2.substring(var4, var5));
         int var7 = 3 >> 2;
         int var8 = var6.getSize();

         for(var10000 = var7; var10000 < var8; var10000 = var7) {
            long var9 = var6.getZhi(var7);
            Door var12;
            if ((var12 = var3.bo(String.valueOf(var9))) != null) {
               Class543 var11 = new Class543(5 >> 2, Long.parseLong(var1.getNpctable().getNpcid()), var12);
               var11.b = this.a;
               var11.f = Integer.parseInt(var1.getNpctable().getTx());
               var11.j = Integer.parseInt(var1.getNpctable().getTy());
               if (this.b == null) {
                  this.b = new ArrayList();
               }

               this.b.add(var11);
            }

            ++var7;
         }

         var4 = var5 + (4 ^ 5);
      }

   }
}
