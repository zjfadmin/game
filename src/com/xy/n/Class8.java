package com.xy.n;

import com.xy.formula.FormulaNum;
import com.xy.readbean.Door;
import com.xy.readbean.MapModel;
import com.xy.readbean.NpcInfoBean;
import com.xy.v.Class12;
import java.util.ArrayList;
import java.util.List;

public class Class8 {
   private List<Class4> a;
   private int b;

   public void a(NpcInfoBean var1, String var2, com.xy.v.Class8 var3) {
      int var4 = 0;
      int var5 = 0;
      int var6;
      int var10000 = var6 = 0;

      while (var10000 != var2.length()) {
         String var10001 = "\n";
         if ((var6 = var2.indexOf("|", var5 + 1)) == -1) {
            var6 = var2.length();
         }

         FormulaNum var7 = new FormulaNum(var2.substring(var5, var6));
         int var8 = 0;
         int var9 = var7.getSize();

         for (int var15 = var8; var15 < var9; var15 = ++var8) {
            long var10 = var7.getZhi(var8);
            Door var12;
            if ((var12 = var3.c(String.valueOf(var10))) != null) {
               Class4 var13 = new Class4(1, Long.parseLong(var1.getNpctable().getNpcid()), var12);
               var13.f = this.b;
               var13.j = Integer.parseInt(var1.getNpctable().getTx());
               var13.c = Integer.parseInt(var1.getNpctable().getTy());
               if (this.a == null) {
                  this.a = new ArrayList<>();
               }

               this.a.add(var13);
            }
         }

         var4++;
         var5 = var6 + 1;
         var10000 = var6;
      }
   }

   public List<Class4> b() {
      return this.a;
   }

   public Class8(int var1, com.xy.v.Class8 var2) {
      this.b = var1;
      MapModel var3;
      if ((var3 = var2.g(String.valueOf(var1))) != null) {
         if (!Class12.h(var3.getMapDoor())) {
            String var4 = var3.getMapDoor();
            int var5 = 0;
            int var6;
            int var10000 = var6 = 0;

            while (var10000 != var4.length()) {
               String var10001 = "\n";
               if ((var6 = var4.indexOf("|", var5 + 1)) == -1) {
                  var6 = var4.length();
               }

               FormulaNum var7 = new FormulaNum(var4.substring(var5, var6));
               int var8 = 0;
               int var9 = var7.getSize();

               for (int var24 = var8; var24 < var9; var24 = ++var8) {
                  long var10 = var7.getZhi(var8);
                  Door var12;
                  int[] var13;
                  if ((var12 = var2.c(String.valueOf(var10))) != null && (var13 = var12.getRects()) != null) {
                     Class4 var14 = new Class4(0, var10, var12);
                     var14.f = var1;
                     var14.j = (var13[0] + var13[1]) / 2;
                     var14.c = (var13[2] + var13[3]) / 2;
                     if (this.a == null) {
                        this.a = new ArrayList<>();
                     }

                     this.a.add(var14);
                  }
               }

               var5 = var6 + 1;
               var10000 = var6;
            }
         }

         FormulaNum[] var15 = var3.getNpcs();
         int var16 = 0;
         int var18 = var15 != null ? var15.length : 0;

         for (int var25 = var16; var25 < var18; var25 = ++var16) {
            FormulaNum var19 = var15[var16];
            int var20 = 0;
            int var21 = var19.getSize();

            for (int var26 = var20; var26 < var21; var26 = ++var20) {
               long var22 = var19.getZhi(var20);
               NpcInfoBean var23;
               if ((var23 = var2.at(String.valueOf(var22))) != null) {
                  String var27 = var23.getNpctable().getNpctype();
                  String var28 = "F";
                  if (var27.equals("2")) {
                     this.a(var23, var23.getNpctable().getNpcway(), var2);
                  }
               }
            }
         }
      }
   }
}
