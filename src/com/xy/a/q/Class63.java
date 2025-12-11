package com.xy.a.q;

import com.xy.text.GameView;

public class Class63 extends com.xy.q.Class30 {
   private com.xy.q.Class3 ahd;
   private com.xy.w.Class18 dn;

   public Class63(GameView var1) {
      super(55, 2, com.xy.q.Class30.afz, var1);
      String var10006 = "\u0014+H,HyI8\t/";
      this.yy(-3, 0, 411, 401, com.xy.q.Class30.agh);
      com.xy.w.Class9 var24 = com.xy.w.Class16.m("sc/d/1.png", 68, 68, 68, 68, false);
      String var10007 = "兂弿";
      this.yu(var24, "典当");
      this.dn = new com.xy.w.Class18();
      String var10005 = ";\u0004g\u0003gVqI8\t/";
      this.dn.mt(com.xy.w.Class16.m("sc/d/19.png", 5, 5, 5, 5, false));
      this.dn.setBounds(51, 22, 310, 359);
      this.add(this.dn);
      com.xy.i.Class3[] var2 = new com.xy.i.Class3[10];

      int var3;
      for (int var10000 = var3 = 0; var10000 < var2.length; var10000 = var3) {
         var2[var3] = new com.xy.i.Class3(null, 2, var3);
         var2[var3].setBounds(360, 28 + var3 * 35, 36, 33);
         Class63 var4;
         if (var3 == 0) {
            var4 = this;
            com.xy.i.Class3 var10001 = var2[var3];
            String var10002 = "I\u000f\u0015\t\u0015T\u0014\u001cT\u000b";
            var10001.setImage("sc/e/8.png");
         } else if (var3 == 1) {
            var4 = this;
            com.xy.i.Class3 var6 = var2[var3];
            String var15 = "\u0014+H-HqI8\t/";
            var6.setImage("sc/e/9.png");
         } else if (var3 == 2) {
            var4 = this;
            com.xy.i.Class3 var7 = var2[var3];
            String var16 = "\u001fYC_C\u000b\\\u0014\u001cT\u000b";
            var7.setImage("sc/e/10.png");
         } else if (var3 == 3) {
            var4 = this;
            com.xy.i.Class3 var8 = var2[var3];
            String var17 = ";\u0004g\u0002gVyI8\t/";
            var8.setImage("sc/e/11.png");
         } else if (var3 == 4) {
            var4 = this;
            com.xy.i.Class3 var9 = var2[var3];
            String var18 = "\u001fYC_C\u000b^\u0014\u001cT\u000b";
            var9.setImage("sc/e/12.png");
         } else if (var3 == 5) {
            var4 = this;
            com.xy.i.Class3 var10 = var2[var3];
            String var19 = "\u0014+H*H~I8\t/";
            var10.setImage("sc/b/6.png");
         } else if (var3 == 6) {
            var4 = this;
            com.xy.i.Class3 var11 = var2[var3];
            String var20 = "I\u000f\u0015\u000e\u0015[\u0014\u001cT\u000b";
            var11.setImage("sc/b/7.png");
         } else if (var3 == 7) {
            var4 = this;
            com.xy.i.Class3 var12 = var2[var3];
            String var21 = "\u0014+H*HpI8\t/";
            var12.setImage("sc/b/8.png");
         } else if (var3 == 8) {
            var4 = this;
            com.xy.i.Class3 var13 = var2[var3];
            String var22 = "I\u000f\u0015\u000e\u0015U\u0014\u001cT\u000b";
            var13.setImage("sc/b/9.png");
         } else {
            if (var3 == 9) {
               com.xy.i.Class3 var5 = var2[var3];
               String var14 = ";\u0004g\u0005gVxI8\t/";
               var5.setImage("sc/b/10.png");
            }

            var4 = this;
         }

         var4.add(var2[var3++]);
      }

      this.ahd = new com.xy.q.Class3(this, 6, 7, 51, 51, 0, 0, 52, 24);
      String var10004 = "\u001fYC^C\u000bT\u0014\u001cT\u000b";
      this.ahd.gt(com.xy.w.Class16.c("sc/d/18.png"));
      this.ahd.vo(var2, 0);
      this.add(this.ahd);
   }
}
