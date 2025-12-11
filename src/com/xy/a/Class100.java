package com.xy.a;

import com.xy.readbean.MapModel;
import com.xy.text.GameView;
import java.awt.Graphics;
import java.awt.Point;

public class Class100 extends com.xy.q.Class30 {
   private MapModel alj;
   private int cb;
   private int ae;
   private com.xy.i.Class18[] vk;
   private Class58 alk;
   private static com.xy.w.Class1 zf;

   @Override
   protected void paintChildren(Graphics var1) {
      Class100 var5;
      label82: {
         super.paintChildren(var1);
         if (this.alj != this.afx.mapScene.r) {
            this.alj = this.afx.mapScene.r;
            if (this.alj == null) {
               return;
            }

            this.cb = this.ae = 0;

            int var2;
            for (int var10000 = var2 = 3; var10000 < this.vk.length; var10000 = ++var2) {
               Object var3;
               int var4;
               if ((var3 = this.vk[var2].jx()) != null
                  && (
                     (var4 = (Integer)var3) == -1
                        ? this.alj.getMapId() >= 1282L && this.alj.getMapId() <= 1288L
                        : (
                           var4 == -2
                              ? this.alj.getMapId() >= 1289L && this.alj.getMapId() <= 1295L
                              : (
                                 var4 == -3
                                    ? this.alj.getMapId() >= 1268L && this.alj.getMapId() <= 1271L
                                    : (
                                       var4 == -4
                                          ? this.alj.getMapId() >= 1221L && this.alj.getMapId() <= 1226L || this.alj.getMapId() == 3311L
                                          : (var4 == -5 ? this.alj.getMapId() >= 1273L && this.alj.getMapId() <= 1276L : this.alj.getMapId() == var4)
                                    )
                              )
                        )
                  )) {
                  var5 = this;
                  this.ae = this.vk[var2].getX() + this.vk[var2].getWidth() / 2;
                  this.cb = this.vk[var2].getY() + this.vk[var2].getHeight() / 2;
                  break label82;
               }
            }
         }

         var5 = this;
      }

      if (var5.ae > 0) {
         if (zf == null) {
            String var6 = "\u0011|\u0014w";
            zf = com.xy.w.Class11.f(com.xy.w.Class15.p("word"), null);
         }

         if (zf != null) {
            zf.j(com.xy.v.Class22.l(), 0);
            zf.ab(var1, this.ae, this.cb);
         }
      }
   }

   // $VF: synthetic method
   static Class58 adp(Class100 var0) {
      return var0.alk;
   }

   @Override
   public void l() {
      if (this.alk != null) {
         this.alk.setVisible(false);
      }

      super.l();
   }

   public Class100(GameView var1) {
      super(155, 2, com.xy.q.Class30.afz, var1);
      String var10003 = "`\u0005<\u0002<_\"Hc\bt";
      this.yy(-1, 0, 953, 501, com.xy.q.Class30.agf);
      this.yu(com.xy.w.Class16.m("sc/d/91.png", 0, 0, 0, 0, false), null);
      this.vk = new com.xy.i.Class18[55];

      int var2;
      for (int var10000 = var2 = 0; var10000 < this.vk.length; var10000 = ++var2) {
         com.xy.i.Class18[] var3 = this.vk;
         short var10006;
         Class100 var10007;
         if (var2 == 0) {
            var10006 = 281;
            var10007 = this;
         } else if (var2 == 1) {
            var10006 = 282;
            var10007 = this;
         } else if (var2 == 2) {
            var10006 = 283;
            var10007 = this;
         } else {
            var10006 = 284;
            var10007 = this;
         }

         com.xy.i.Class18 var10002 = new com.xy.i.Class18(null, 1, var10006, var10007);
         var3[var2] = var10002;
         this.add(this.vk[var2]);
         if (var2 == 0) {
            com.xy.i.Class18 var10001 = this.vk[var2];
            String var58 = "5\ni\fiXrYh\u0019(\u000e";
            var10001.setImage("sc/e/140.png");
            this.vk[var2].setBounds(850, 38, 20, 20);
         } else if (var2 == 1) {
            com.xy.i.Class18 var4 = this.vk[var2];
            String var59 = "\u0015pIvI\"U+Hc\bt";
            var4.setImage("sc/e/138.png");
            this.vk[var2].setBounds(142, 428, 104, 42);
         } else if (var2 == 2) {
            com.xy.i.Class18 var5 = this.vk[var2];
            String var60 = "5\ni\fiXuPh\u0019(\u000e";
            var5.setImage("sc/e/139.png");
            this.vk[var2].setBounds(262, 428, 104, 42);
         } else if (var2 == 3) {
            this.vk[var2].gw(1230);
            com.xy.i.Class18 var6 = this.vk[var2];
            String var61 = "\u0015pIvI\"T+Hc\bt";
            var6.setImage("sc/e/128.png");
            this.vk[var2].setBounds(182, 115, 49, 25);
         } else if (var2 == 4) {
            this.vk[var2].gw(1267);
            com.xy.i.Class18 var7 = this.vk[var2];
            String var62 = "5\ni\fiXtPh\u0019(\u000e";
            var7.setImage("sc/e/129.png");
            this.vk[var2].setBounds(396, 96, 110, 31);
         } else if (var2 == 5) {
            this.vk[var2].gw(1250);
            com.xy.i.Class18 var8 = this.vk[var2];
            String var63 = "\u0015pIvI\"U#Hc\bt";
            var8.setImage("sc/e/130.png");
            this.vk[var2].setBounds(580, 127, 82, 32);
         } else if (var2 == 6) {
            this.vk[var2].gw(1244);
            com.xy.i.Class18 var9 = this.vk[var2];
            String var64 = "5\ni\fiXuXh\u0019(\u000e";
            var9.setImage("sc/e/131.png");
            this.vk[var2].setBounds(562, 220, 55, 29);
         } else if (var2 == 7) {
            com.xy.i.Class18 var10 = this.vk[var2];
            String var65 = "\u0015pIvI\"U!Hc\bt";
            var10.setImage("sc/e/132.png");
            this.vk[var2].setBounds(770, 221, 57, 31);
         } else if (var2 == 8) {
            this.vk[var2].gw(1228);
            com.xy.i.Class18 var11 = this.vk[var2];
            String var66 = "5\ni\fiXuZh\u0019(\u000e";
            var11.setImage("sc/e/133.png");
            this.vk[var2].setBounds(154, 226, 81, 33);
         } else if (var2 == 9) {
            this.vk[var2].gw(3180);
            com.xy.i.Class18 var12 = this.vk[var2];
            String var67 = "\u0015pIvI\"U'Hc\bt";
            var12.setImage("sc/e/134.png");
            this.vk[var2].setBounds(258, 249, 72, 27);
         } else if (var2 == 10) {
            this.vk[var2].gw(1207);
            com.xy.i.Class18 var13 = this.vk[var2];
            String var68 = "5\ni\fiXu\\h\u0019(\u000e";
            var13.setImage("sc/e/135.png");
            this.vk[var2].setBounds(476, 299, 95, 35);
         } else if (var2 == 11) {
            this.vk[var2].gw(1236);
            com.xy.i.Class18 var14 = this.vk[var2];
            String var69 = "\u0015pIvI\"U%Hc\bt";
            var14.setImage("sc/e/136.png");
            this.vk[var2].setBounds(435, 420, 77, 29);
         } else if (var2 == 12) {
            this.vk[var2].gw(1211);
            com.xy.i.Class18 var15 = this.vk[var2];
            String var70 = "5\ni\fiXu^h\u0019(\u000e";
            var15.setImage("sc/e/137.png");
            this.vk[var2].setBounds(585, 446, 52, 26);
         } else if (var2 == 13) {
            this.vk[var2].gw(1241);
            com.xy.i.Class18 var16 = this.vk[var2];
            String var71 = "\u0015pIvI\"R\"Hc\bt";
            var16.setImage("sc/e/141.png");
            this.vk[var2].setBounds(205, 39, 59, 21);
         } else if (var2 == 14) {
            this.vk[var2].gw(1240);
            com.xy.i.Class18 var17 = this.vk[var2];
            String var72 = "5\ni\fiXr[h\u0019(\u000e";
            var17.setImage("sc/e/142.png");
            this.vk[var2].setBounds(143, 47, 59, 20);
         } else if (var2 == 15) {
            this.vk[var2].gw(1232);
            com.xy.i.Class18 var18 = this.vk[var2];
            String var73 = "\u0015pIvI\"R Hc\bt";
            var18.setImage("sc/e/143.png");
            this.vk[var2].setBounds(152, 86, 43, 21);
         } else if (var2 == 16) {
            this.vk[var2].gw(1231);
            com.xy.i.Class18 var19 = this.vk[var2];
            String var74 = "\u001a%F#FqQh\u0019(\u000e";
            var19.setImage("sc/e/78.png");
            this.vk[var2].setBounds(226, 88, 59, 21);
         } else if (var2 == 17) {
            this.vk[var2].gw(3205);
            com.xy.i.Class18 var20 = this.vk[var2];
            String var75 = "`\u0005<\u0003<Q*Hc\bt";
            var20.setImage("sc/e/79.png");
            this.vk[var2].setBounds(432, 34, 79, 20);
         } else if (var2 == 18) {
            this.vk[var2].gw(1296);
            com.xy.i.Class18 var21 = this.vk[var2];
            String var76 = "\u001a%F#F~Yh\u0019(\u000e";
            var21.setImage("sc/e/80.png");
            this.vk[var2].setBounds(402, 53, 61, 23);
         } else if (var2 == 19) {
            this.vk[var2].gw(-1);
            com.xy.i.Class18 var22 = this.vk[var2];
            String var77 = "`\u0005<\u0003<^\"Hc\bt";
            var22.setImage("sc/e/81.png");
            this.vk[var2].setBounds(472, 65, 41, 20);
         } else if (var2 == 20) {
            this.vk[var2].gw(-2);
            com.xy.i.Class18 var23 = this.vk[var2];
            String var78 = "\u001a%F#F~[h\u0019(\u000e";
            var23.setImage("sc/e/82.png");
            this.vk[var2].setBounds(373, 75, 41, 20);
         } else if (var2 == 21) {
            this.vk[var2].gw(1248);
            com.xy.i.Class18 var24 = this.vk[var2];
            String var79 = "`\u0005<\u0003<^ Hc\bt";
            var24.setImage("sc/e/83.png");
            this.vk[var2].setBounds(628, 102, 59, 20);
         } else if (var2 == 22) {
            this.vk[var2].gw(40001);
            com.xy.i.Class18 var25 = this.vk[var2];
            String var80 = "\u001a%F#F~]h\u0019(\u000e";
            var25.setImage("sc/e/84.png");
            this.vk[var2].setBounds(625, 162, 59, 20);
         } else if (var2 == 23) {
            this.vk[var2].gw(3155);
            com.xy.i.Class18 var26 = this.vk[var2];
            String var81 = "`\u0005<\u0003<^&Hc\bt";
            var26.setImage("sc/e/85.png");
            this.vk[var2].setBounds(602, 185, 56, 20);
         } else if (var2 == 24) {
            this.vk[var2].gw(-3);
            com.xy.i.Class18 var27 = this.vk[var2];
            String var82 = "\u001a%F#F~_h\u0019(\u000e";
            var27.setImage("sc/e/86.png");
            this.vk[var2].setBounds(608, 249, 78, 22);
         } else if (var2 == 25) {
            this.vk[var2].gw(1208);
            com.xy.i.Class18 var28 = this.vk[var2];
            String var83 = "`\u0005<\u0003<^$Hc\bt";
            var28.setImage("sc/e/87.png");
            this.vk[var2].setBounds(656, 292, 77, 20);
         } else if (var2 == 26) {
            this.vk[var2].gw(1213);
            com.xy.i.Class18 var29 = this.vk[var2];
            String var84 = "\u001a%F#F~Qh\u0019(\u000e";
            var29.setImage("sc/e/88.png");
            this.vk[var2].setBounds(653, 321, 77, 21);
         } else if (var2 == 27) {
            this.vk[var2].gw(1214);
            com.xy.i.Class18 var30 = this.vk[var2];
            String var85 = "`\u0005<\u0003<^*Hc\bt";
            var30.setImage("sc/e/89.png");
            this.vk[var2].setBounds(661, 356, 76, 18);
         } else if (var2 == 28) {
            this.vk[var2].gw(40007);
            com.xy.i.Class18 var31 = this.vk[var2];
            String var86 = "\u001a%F#F\u007fYh\u0019(\u000e";
            var31.setImage("sc/e/90.png");
            this.vk[var2].setBounds(808, 178, 41, 19);
         } else if (var2 == 29) {
            this.vk[var2].gw(40004);
            com.xy.i.Class18 var32 = this.vk[var2];
            String var87 = "`\u0005<\u0003<_\"Hc\bt";
            var32.setImage("sc/e/91.png");
            this.vk[var2].setBounds(826, 262, 42, 20);
         } else if (var2 == 30) {
            this.vk[var2].gw(40005);
            com.xy.i.Class18 var33 = this.vk[var2];
            String var88 = "\u001a%F#F\u007f[h\u0019(\u000e";
            var33.setImage("sc/e/92.png");
            this.vk[var2].setBounds(788, 311, 42, 19);
         } else if (var2 == 31) {
            this.vk[var2].gw(40006);
            com.xy.i.Class18 var34 = this.vk[var2];
            String var89 = "`\u0005<\u0003<_ Hc\bt";
            var34.setImage("sc/e/93.png");
            this.vk[var2].setBounds(752, 336, 84, 27);
         } else if (var2 == 32) {
            this.vk[var2].gw(1136);
            com.xy.i.Class18 var35 = this.vk[var2];
            String var90 = "\u001a%F#F\u007f]h\u0019(\u000e";
            var35.setImage("sc/e/94.png");
            this.vk[var2].setBounds(119, 172, 78, 19);
         } else if (var2 == 33) {
            this.vk[var2].gw(1246);
            com.xy.i.Class18 var36 = this.vk[var2];
            String var91 = "`\u0005<\u0003<_&Hc\bt";
            var36.setImage("sc/e/95.png");
            this.vk[var2].setBounds(146, 197, 59, 19);
         } else if (var2 == 34) {
            this.vk[var2].gw(1229);
            com.xy.i.Class18 var37 = this.vk[var2];
            String var92 = "\u001a%F#F\u007f_h\u0019(\u000e";
            var37.setImage("sc/e/96.png");
            this.vk[var2].setBounds(131, 277, 78, 21);
         } else if (var2 == 35) {
            this.vk[var2].gw(1252);
            com.xy.i.Class18 var38 = this.vk[var2];
            String var93 = "`\u0005<\u0003<_$Hc\bt";
            var38.setImage("sc/e/97.png");
            this.vk[var2].setBounds(113, 371, 58, 20);
         } else if (var2 == 36) {
            this.vk[var2].gw(3307);
            com.xy.i.Class18 var39 = this.vk[var2];
            String var94 = "\u001a%F#F\u007fQh\u0019(\u000e";
            var39.setImage("sc/e/98.png");
            this.vk[var2].setBounds(239, 288, 56, 18);
         } else if (var2 == 37) {
            this.vk[var2].gw(3210);
            com.xy.i.Class18 var40 = this.vk[var2];
            String var95 = "`\u0005<\u0003<_*Hc\bt";
            var40.setImage("sc/e/99.png");
            this.vk[var2].setBounds(216, 328, 73, 20);
         } else if (var2 == 38) {
            this.vk[var2].gw(3308);
            com.xy.i.Class18 var41 = this.vk[var2];
            String var96 = "5\ni\fiXvYh\u0019(\u000e";
            var41.setImage("sc/e/100.png");
            this.vk[var2].setBounds(213, 351, 58, 20);
         } else if (var2 == 39) {
            this.vk[var2].gw(1280);
            com.xy.i.Class18 var42 = this.vk[var2];
            String var97 = "\u0015pIvI\"V\"Hc\bt";
            var42.setImage("sc/e/101.png");
            this.vk[var2].setBounds(331, 269, 57, 19);
         } else if (var2 == 40) {
            this.vk[var2].gw(1278);
            com.xy.i.Class18 var43 = this.vk[var2];
            String var98 = "5\ni\fiXv[h\u0019(\u000e";
            var43.setImage("sc/e/102.png");
            this.vk[var2].setBounds(314, 297, 59, 21);
         } else if (var2 == 41) {
            this.vk[var2].gw(1279);
            com.xy.i.Class18 var44 = this.vk[var2];
            String var99 = "\u0015pIvI\"V Hc\bt";
            var44.setImage("sc/e/103.png");
            this.vk[var2].setBounds(301, 328, 58, 20);
         } else if (var2 == 42) {
            this.vk[var2].gw(1251);
            com.xy.i.Class18 var45 = this.vk[var2];
            String var100 = "5\ni\fiXv]h\u0019(\u000e";
            var45.setImage("sc/e/104.png");
            this.vk[var2].setBounds(281, 362, 78, 21);
         } else if (var2 == 43) {
            this.vk[var2].gw(1259);
            com.xy.i.Class18 var46 = this.vk[var2];
            String var101 = "\u0015pIvI\"V&Hc\bt";
            var46.setImage("sc/e/105.png");
            this.vk[var2].setBounds(271, 391, 60, 20);
         } else if (var2 == 44) {
            this.vk[var2].gw(1263);
            com.xy.i.Class18 var47 = this.vk[var2];
            String var102 = "5\ni\fiXv_h\u0019(\u000e";
            var47.setImage("sc/e/106.png");
            this.vk[var2].setBounds(393, 298, 60, 20);
         } else if (var2 == 45) {
            this.vk[var2].gw(1272);
            com.xy.i.Class18 var48 = this.vk[var2];
            String var103 = "\u0015pIvI\"V$Hc\bt";
            var48.setImage("sc/e/107.png");
            this.vk[var2].setBounds(373, 334, 59, 20);
         } else if (var2 == 46) {
            this.vk[var2].gw(1242);
            com.xy.i.Class18 var49 = this.vk[var2];
            String var104 = "5\ni\fiXwPh\u0019(\u000e";
            var49.setImage("sc/e/119.png");
            this.vk[var2].setBounds(371, 359, 59, 20);
         } else if (var2 == 47) {
            this.vk[var2].gw(1254);
            com.xy.i.Class18 var50 = this.vk[var2];
            String var105 = "\u0015pIvI\"T#Hc\bt";
            var50.setImage("sc/e/120.png");
            this.vk[var2].setBounds(501, 248, 59, 20);
         } else if (var2 == 48) {
            this.vk[var2].gw(-4);
            com.xy.i.Class18 var51 = this.vk[var2];
            String var106 = "5\ni\fiXtXh\u0019(\u000e";
            var51.setImage("sc/e/121.png");
            this.vk[var2].setBounds(455, 274, 60, 20);
         } else if (var2 == 49) {
            this.vk[var2].gw(1298);
            com.xy.i.Class18 var52 = this.vk[var2];
            String var107 = "\u0015pIvI\"T!Hc\bt";
            var52.setImage("sc/e/122.png");
            this.vk[var2].setBounds(540, 276, 40, 20);
         } else if (var2 == 50) {
            this.vk[var2].gw(1193);
            com.xy.i.Class18 var53 = this.vk[var2];
            String var108 = "5\ni\fiXtZh\u0019(\u000e";
            var53.setImage("sc/e/123.png");
            this.vk[var2].setBounds(570, 344, 58, 20);
         } else if (var2 == 51) {
            this.vk[var2].gw(1210);
            com.xy.i.Class18 var54 = this.vk[var2];
            String var109 = "\u0015pIvI\"T'Hc\bt";
            var54.setImage("sc/e/124.png");
            this.vk[var2].setBounds(430, 381, 78, 21);
         } else if (var2 == 52) {
            this.vk[var2].gw(-5);
            com.xy.i.Class18 var55 = this.vk[var2];
            String var110 = "5\ni\fiXt\\h\u0019(\u000e";
            var55.setImage("sc/e/125.png");
            this.vk[var2].setBounds(605, 411, 78, 21);
         } else if (var2 == 53) {
            this.vk[var2].gw(1227);
            com.xy.i.Class18 var56 = this.vk[var2];
            String var111 = "\u0015pIvI\"T%Hc\bt";
            var56.setImage("sc/e/126.png");
            this.vk[var2].setBounds(534, 424, 58, 20);
         } else if (var2 == 54) {
            this.vk[var2].gw(3012);
            com.xy.i.Class18 var57 = this.vk[var2];
            String var112 = "5\ni\fiXt^h\u0019(\u000e";
            var57.setImage("sc/e/127.png");
            this.vk[var2].setBounds(653, 454, 58, 20);
         }
      }
   }

   public void adq(int var1, Object var2, com.xy.i.Class18 var3) {
      if (var1 == 281) {
         this.zc().f(this.lj());
      } else if (var1 == 282) {
         ((Class29)this.zc().j(156)).mc(this.afx.mapScene.r);
      } else if (var1 == 283) {
         ((Class132)this.zc().j(157)).mc(this.afx.mapScene.r);
      } else {
         if (var1 == 284) {
            if (var2 == null) {
               return;
            }

            int var4;
            if ((var4 = (Integer)var2) < 0) {
               if (this.alk == null) {
                  this.alk = new Class58(this);
               }

               this.alk.n(var4);
               Point var6 = GameView.dr(var3.getX(), var3.getY(), this.alk.getWidth(), this.alk.getHeight(), this.getWidth(), this.getHeight());
               this.alk.setBounds(var6.x, var6.y, this.alk.getWidth(), this.alk.getHeight());
               this.add(this.alk, 0);
               this.alk.setVisible(true);
               return;
            }

            MapModel var5;
            if ((var5 = this.yt().g(String.valueOf(var4))) == null) {
               return;
            }

            ((Class121)this.zc().j(22)).mc(var5);
         }
      }
   }
}
