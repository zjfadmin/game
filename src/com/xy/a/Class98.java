package com.xy.a;

import com.xy.bean.GangResultBean;
import com.xy.text.GameView;
import java.math.BigDecimal;

public class Class98 extends com.xy.q.Class30 {
   private com.xy.i.Class18[] akb;
   private com.xy.w.Class18 gh;
   private int ds;
   private Class20 akv;
   private Class115 io;

   public Class98(GameView var1) {
      super(48, 2, com.xy.q.Class30.afz, var1);
      String var10003 = "$\u0004x\u0003xVy\u00179\u0000";
      this.yy(-1, 0, 662, 475, com.xy.q.Class30.agh);
      com.xy.w.Class9 var5 = com.xy.w.Class16.m("sc/d/1.png", 68, 68, 68, 68, false);
      String var10004 = "帎洧箁琟";
      this.yu(var5, "帮派管理");
      this.akb = new com.xy.i.Class18[3];

      int var2;
      for (int var10000 = var2 = 0; var10000 < this.akb.length; var10000 = var2) {
         com.xy.i.Class18[] var3 = this.akb;
         var10004 = "\u00144H2Hd_y\u00179\u0000";
         int var10006 = 201 + var2;
         String var7;
         Class98 var10010;
         if (var2 == 0) {
            var7 = "帎洧怛觑";
            var7 = "帮派总览";
            var10010 = this;
         } else if (var2 == 1) {
            var7 = "幹浙扇吿";
            var7 = "帮派成员";
            var10010 = this;
         } else if (var2 == 2) {
            var7 = "帎洧戸彠";
            var7 = "帮派战役";
            var10010 = this;
         } else {
            var7 = "";
            var10010 = this;
         }

         com.xy.i.Class18 var10002 = new com.xy.i.Class18("sc/e/38.png", 2, var10006, com.xy.q.Class49.bx, com.xy.q.Class49.bv, var7, var10010);
         var3[var2] = var10002;
         this.akb[var2].setOffsetTexts(com.xy.q.Class49.d);
         this.akb[var2].setBounds(64 + 102 * var2, 22, 95, 33);
         this.add(this.akb[var2++]);
      }

      this.akv = new Class20(var1);
      this.io = new Class115(var1);
      this.add(this.akv);
      this.add(this.io);
      String var10008 = "\u00144H3HdRy\u00179\u0000";
      this.gh = new com.xy.w.Class18(com.xy.w.Class16.m("sc/d/35.png", 80, 10, 80, 10, false));
      this.gh.setBounds(32, 36, 614, 20);
      this.add(this.gh);
   }

   public void i(BigDecimal var1) {
      this.io.i(var1);
   }

   public void adb(BigDecimal var1, String var2) {
      this.io.adb(var1, var2);
   }

   @Override
   public void l() {
      this.g(0);
      super.l();
   }

   public Class115 adc() {
      return this.io;
   }

   public void add(GangResultBean var1) {
      this.io.add(var1);
      this.io.cr(false);
      this.io.cr(true);
      this.akv.gv(var1.getGang(), var1.getGangGroup());
      this.zc().b(this.lj());
   }

   public void g(int var1) {
      if (var1 != 2) {
         this.ds = var1;

         int var2;
         for (int var10000 = var2 = 0; var10000 < this.akb.length; var10000 = ++var2) {
            this.akb[var2].setKeep(var2 == this.ds);
         }

         if (var1 == 1) {
            this.io.y(0);
         }

         this.akv.setVisible(var1 == 0);
         this.io.setVisible(var1 == 1);
      }
   }
}
