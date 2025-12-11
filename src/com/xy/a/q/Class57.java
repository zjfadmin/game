package com.xy.a.q;

import com.xy.entity.PartJade;
import com.xy.i.Class18;
import com.xy.i.Class19;
import com.xy.q.Class49;
import com.xy.text.GameView;

public class Class57 extends com.xy.q.Class30 {
   private Class64 afe;
   private int ae;
   private com.xy.a.i.Class23 aff;
   private com.xy.w.Class18 dm;
   private com.xy.i.Class19[] afg;

   public Class64 xu() {
      return this.afe;
   }

   public com.xy.a.i.Class23 xv() {
      return this.aff;
   }

   public void g(int var1) {
      int var10000 = 0;
      this.ae = var1;

      for (int var2 = 0; var10000 < this.afg.length; var10000 = ++var2) {
         this.afg[var2].setKeep(var2 == this.ae);
      }

      if (var1 != 0 && var1 != 1 && var1 != 2) {
         if (var1 == 3) {
            if (this.aff == null) {
               this.add(this.aff = new com.xy.a.i.Class23(this.afx));
            }

            this.aff.g(0);
            this.aff.setVisible(true);
            if (this.afe != null) {
               this.afe.setVisible(false);
            }
         }
      } else {
         if (this.afe == null) {
            this.add(this.afe = new Class64(this.afx));
         }

         this.afe.g(var1);
         this.afe.setVisible(true);
         if (this.aff != null) {
            this.aff.setVisible(false);
            return;
         }
      }
   }

   public int dx() {
      return this.ae;
   }

   public void ck(PartJade var1) {
      if (this.ae == 3 && this.aff != null) {
         this.aff.ck(var1);
      }
   }

   @Override
   public void l() {
      this.g(0);
      super.l();
   }

   public Class57(GameView var1) {
      super(61, 2, com.xy.q.Class30.afz, var1);
      String var10003 = "\u0011\u0003M\u0004MQL\u0010\f\u0007";
      this.yy(-1, 0, 562, 520, com.xy.q.Class30.agh);
      com.xy.w.Class9 var5 = com.xy.w.Class16.m("sc/d/1.png", 68, 68, 68, 68, false);
      String var10004 = "企圐烡卌";
      this.yu(var5, "作坊炼化");
      this.afg = new com.xy.i.Class19[4];

      int var2;
      for (int var10000 = var2 = 0; var10000 < this.afg.length; var10000 = var2) {
         com.xy.i.Class19[] var3 = this.afg;
         var10004 = "\u0013\u0001O\u0007OQXL\u0010\f\u0007";
         int var10006 = 111 + var2;
         String var8;
         Class57 var10010;
         if (var2 == 0) {
            var8 = "烡卌袘奝";
            var8 = "炼化装备";
            var10010 = this;
         } else if (var2 == 1) {
            var8 = "烞卶鄯餐";
            var8 = "炼化配饰";
            var10010 = this;
         } else if (var2 == 2) {
            var8 = "烦}嘲";
            var8 = "炼 器";
            var10010 = this;
         } else if (var2 == 3) {
            var8 = "夵袥呪扰";
            var8 = "套装合成";
            var10010 = this;
         } else {
            var8 = "";
            var10010 = this;
         }

         Class19 var10002 = new Class19("sc/e/38.png", 2, var10006, Class49.bx, Class49.bv, var8, var10010);
         var3[var2] = var10002;
         this.afg[var2].setOffsetTexts(com.xy.q.Class49.d);
         this.afg[var2].setBounds(58 + 102 * var2, 16, 95, 33);
         this.add(this.afg[var2++]);
      }

      String var7 = ")>u9unos*3=";
      this.dm = new com.xy.w.Class18(com.xy.w.Class16.m("sc/d/35.png", 80, 10, 80, 10, false));
      this.dm.setBounds(38, 30, 500, 20);
      this.add(this.dm);
   }
}
