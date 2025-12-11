package com.xy.a.q;

import com.xy.text.GameView;

public class Class80 extends com.xy.q.Class30 {
   private com.xy.w.Class18 dm;
   private com.xy.q.Class31 akz;

   public Class80(GameView var1) {
      super(182, 2, com.xy.q.Class30.afz, var1);
      String var10006 = "/=s:sor.29";
      this.yy(-3, 0, 411, 401, com.xy.q.Class30.agh);
      com.xy.w.Class9 var24 = com.xy.w.Class16.m("sc/d/1.png", 68, 68, 68, 68, false);
      String var10007 = "卒袞";
      this.yu(var24, "包裹");
      this.dm = new com.xy.w.Class18();
      String var10005 = "-?q8qmgr.29";
      this.dm.mt(com.xy.w.Class16.m("sc/d/19.png", 5, 5, 5, 5, false));
      this.dm.setBounds(51, 22, 310, 359);
      this.add(this.dm);
      com.xy.i.Class3[] var2 = new com.xy.i.Class3[10];

      int var3;
      for (int var10000 = var3 = 0; var10000 < var2.length; var10000 = var3) {
         var2[var3] = new com.xy.i.Class3(null, 2, var3);
         var2[var3].setBounds(360, 28 + var3 * 35, 36, 33);
         Class80 var4;
         if (var3 == 0) {
            var4 = this;
            com.xy.i.Class3 var10001 = var2[var3];
            String var10002 = "$\u0004x\u0002x_y\u00179\u0000";
            var10001.setImage("sc/e/8.png");
         } else if (var3 == 1) {
            var4 = this;
            com.xy.i.Class3 var6 = var2[var3];
            String var15 = "/=s;sgr.29";
            var6.setImage("sc/e/9.png");
         } else if (var3 == 2) {
            var4 = this;
            com.xy.i.Class3 var7 = var2[var3];
            String var16 = "\u00144H2HfWy\u00179\u0000";
            var7.setImage("sc/e/10.png");
         } else if (var3 == 3) {
            var4 = this;
            com.xy.i.Class3 var8 = var2[var3];
            String var17 = "-?q9qmor.29";
            var8.setImage("sc/e/11.png");
         } else if (var3 == 4) {
            var4 = this;
            com.xy.i.Class3 var9 = var2[var3];
            String var18 = "\u00144H2HfUy\u00179\u0000";
            var9.setImage("sc/e/12.png");
         } else if (var3 == 5) {
            var4 = this;
            com.xy.i.Class3 var10 = var2[var3];
            String var19 = "/=s<shr.29";
            var10.setImage("sc/b/6.png");
         } else if (var3 == 6) {
            var4 = this;
            com.xy.i.Class3 var11 = var2[var3];
            String var20 = "$\u0004x\u0005xPy\u00179\u0000";
            var11.setImage("sc/b/7.png");
         } else if (var3 == 7) {
            var4 = this;
            com.xy.i.Class3 var12 = var2[var3];
            String var21 = "/=s<sfr.29";
            var12.setImage("sc/b/8.png");
         } else if (var3 == 8) {
            var4 = this;
            com.xy.i.Class3 var13 = var2[var3];
            String var22 = "$\u0004x\u0005x^y\u00179\u0000";
            var13.setImage("sc/b/9.png");
         } else {
            if (var3 == 9) {
               com.xy.i.Class3 var5 = var2[var3];
               String var14 = "-?q>qmnr.29";
               var5.setImage("sc/b/10.png");
            }

            var4 = this;
         }

         var4.add(var2[var3++]);
      }

      this.akz = new com.xy.q.Class31(this, 6, 7, 51, 51, 0, 0, 52, 24);
      String var10004 = "\u00144H3Hf_y\u00179\u0000";
      this.akz.gt(com.xy.w.Class16.c("sc/d/18.png"));
      this.akz.vo(var2, 0);
      this.add(this.akz);
   }
}
