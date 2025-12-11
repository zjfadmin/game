package com.xy.a.v;

import com.xy.formula.ActivityMenuSet2;
import com.xy.formula.FormulaNum;
import com.xy.readbean.Activity;
import com.xy.readbean.ActivityFC;
import java.awt.Color;

public class Class21 extends com.xy.q.Class50 {
   private com.xy.q.Class30 vp;
   private Activity vq;
   private int cn;
   private Class43[] vr;
   private com.xy.q.Class14 gb;
   private com.xy.i.Class22 vs;
   private ActivityMenuSet2 vt;
   private com.xy.i.Class22 bl;
   private int ah;

   public void g(int var1) {
      this.cn = Math.max(1, Math.min(var1, this.ah));
      com.xy.v.Class8 var2 = this.vp.yt();
      int var3 = -(this.cn - 1) * this.vr.length;
      FormulaNum[] var7;
      int var6 = (var7 = this.vt.getBases()).length;

      int var5;
      for (int var10000 = var5 = 0; var10000 < var6; var10000 = ++var5) {
         FormulaNum var4;
         int var8 = (var4 = var7[var5]).getSize();
         if (var3 + var8 < 0) {
            var3 += var8;
         } else {
            int var9;
            for (int var13 = var9 = 0; var13 < var8 && var3 < this.vr.length; var3++) {
               if (var3 >= 0) {
                  int var10 = (int)var4.getZhi(var9);
                  ActivityFC var11 = var2.ba(var10);
                  this.vr[var3].afm(var11 != null && var11.getType() == 1 ? var11 : null);
               }

               var13 = ++var9;
            }
         }
      }

      int var12;
      for (int var14 = var12 = Math.max(0, var3); var14 < this.vr.length; var14 = var12) {
         this.vr[var12++].afm(null);
      }

      com.xy.q.Class14 var15 = this.gb;
      StringBuilder var16 = new StringBuilder(String.valueOf(var1));
      String var10002 = "V";
      var15.setText(var16.append("/").append(this.ah).toString());
   }

   public Class21(com.xy.q.Class30 var1) {
      this.setLayout(null);
      this.setBackground(com.xy.q.Class49.bk);
      this.setBounds(0, 0, 745, 452);
      this.vp = var1;
      this.vr = new Class43[9];

      int var2;
      for (int var10000 = var2 = 0; var10000 < this.vr.length; var10000 = var2) {
         String var10008 = "\n\u0014V\u0015V5MBMY\t\u0019\u001e";
         this.vr[var2] = new Class43(this, "sc/b/B454.png", 1, var1);
         this.vr[var2].setBounds(203 + var2 % 3 * 169, 160 + var2 / 3 * 83, 162, 67);
         this.add(this.vr[var2++]);
      }

      this.gb = com.xy.q.Class1.i(412, 405, 80, 19, 0, Color.white, com.xy.q.Class49.w);
      String var10003 = "U\u001f\t\u0018\tM\u0011RV\u0012A";
      this.gb.mt(com.xy.w.Class16.m("sc/d/17.png", 6, 6, 6, 6, false));
      this.add(this.gb);
      String var10009 = "\u0004\u001aX\u001cXHBOY\t\u0019\u001e";
      this.vs = new com.xy.i.Class22("sc/e/156.png", 1, 102, var1, this);
      String var3 = "\u000fESCS\u0017I\u0013RV\u0012A";
      this.bl = new com.xy.i.Class22("sc/e/155.png", 1, 103, var1, this);
      this.vs.setBounds(391, 402, 18, 25);
      this.bl.setBounds(495, 402, 18, 25);
      this.add(this.vs);
      this.add(this.bl);
   }

   public void n(int var1) {
      if (var1 == 102) {
         if (this.cn > 1) {
            this.g(this.cn - 1);
         }
      } else {
         if (var1 == 103) {
            if (this.cn >= this.ah) {
               return;
            }

            this.g(this.cn + 1);
         }
      }
   }

   public void mj(Activity var1, ActivityMenuSet2 var2) {
      this.vq = var1;
      this.vt = var2;
      int var3 = 0;
      FormulaNum[] var7;
      int var6 = (var7 = var2.getBases()).length;

      int var5;
      for (int var10000 = var5 = 0; var10000 < var6; var10000 = var5) {
         FormulaNum var4 = var7[var5];
         var5++;
         var3 += var4.getSize();
      }

      this.ah = 1 + (var3 - 1) / this.vr.length;
      this.g(1);
   }

   // $VF: synthetic method
   static Activity rh(Class21 var0) {
      return var0.vq;
   }
}
