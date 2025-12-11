package com.xy.a;

import com.xy.i.Class18;
import com.xy.q.Class49;
import com.xy.readbean.MoneyType;
import com.xy.richtext.RichLabel;
import java.awt.Color;
import javax.swing.JComponent;
import javax.swing.JLabel;

class Class118 extends JComponent {
   private com.xy.w.Class18[] aqf;
   private int aod;
   private com.xy.w.Class18 aqg;
   private com.xy.a.q.Class102[] aqh;
   private com.xy.q.Class36[] aqi;
   // $VF: synthetic field
   final Class44 aqj;
   private JComponent aqk;
   private com.xy.i.Class18[] aql;
   private JLabel cy;
   private int gv;
   private JComponent aqm;
   private com.xy.q.Class14 ok;
   private com.xy.q.Class52 ey;
   private com.xy.i.Class18[] aew;
   private com.xy.i.Class18[] aqn;
   private com.xy.q.Class14[] fa;
   private RichLabel ed;
   private MoneyType lv;
   private com.xy.q.Class27[] kw;
   private JLabel[] ay;
   private com.xy.q.Class52[] bz;
   private MoneyType ff;
   private int ah;

   // $VF: synthetic method
   static com.xy.q.Class52[] ain(Class118 var0) {
      return var0.bz;
   }

   // $VF: synthetic method
   static com.xy.q.Class14[] aio(Class118 var0) {
      return var0.fa;
   }

   // $VF: synthetic method
   static MoneyType aip(Class118 var0) {
      return var0.lv;
   }

   // $VF: synthetic method
   static void aiq(Class118 var0, int var1) {
      var0.gv = var1;
   }

   // $VF: synthetic method
   static com.xy.a.q.Class102[] air(Class118 var0) {
      return var0.aqh;
   }

   // $VF: synthetic method
   static com.xy.i.Class18[] ais(Class118 var0) {
      return var0.aql;
   }

   // $VF: synthetic method
   static void ait(Class118 var0, int var1) {
      var0.aod = var1;
   }

   // $VF: synthetic method
   static com.xy.q.Class27[] aiu(Class118 var0) {
      return var0.kw;
   }

   // $VF: synthetic method
   static void aiv(Class118 var0, int var1) {
      var0.ah = var1;
   }

   // $VF: synthetic method
   static int aiw(Class118 var0) {
      return var0.aod;
   }

   // $VF: synthetic method
   static com.xy.q.Class14 aix(Class118 var0) {
      return var0.ok;
   }

   // $VF: synthetic method
   static JComponent aiy(Class118 var0) {
      return var0.aqm;
   }

   // $VF: synthetic method
   static com.xy.q.Class36[] aiz(Class118 var0) {
      return var0.aqi;
   }

   public void t() {
   }

   // $VF: synthetic method
   static int aja(Class118 var0) {
      return var0.ah;
   }

   // $VF: synthetic method
   static com.xy.q.Class52 ajb(Class118 var0) {
      return var0.ey;
   }

   // $VF: synthetic method
   static int ajc(Class118 var0) {
      return var0.gv;
   }

   public Class118(Class44 var1) {
      this.aqj = var1;
      this.aql = new com.xy.i.Class18[2];

      int var2;
      for (int var10000 = var2 = 0; var10000 < this.aql.length; var10000 = var2) {
         com.xy.i.Class18[] var9 = this.aql;
         String var10004 = "qq-w-!;<r|e";
         int var10006 = 165 + var2;
         String var65;
         Class44 var10010;
         if (var2 == 0) {
            var65 = "斮妱秨刡";
            var65 = "斩妖积分";
            var10010 = var1;
         } else if (var2 == 1) {
            var65 = "伍魆仦";
            var65 = "伏魔令";
            var10010 = var1;
         } else {
            var65 = "";
            var10010 = var1;
         }

         com.xy.i.Class18 var10002 = new com.xy.i.Class18("sc/e/39.png", 2, var10006, com.xy.q.Class49.ck, null, var65, var10010.eg());
         var9[var2] = var10002;
         this.aql[var2].setOffsetTexts(com.xy.q.Class49.bo);
         this.aql[var2].setBounds(50 + 102 * var2, 60, 100, 24);
         this.add(this.aql[var2++]);
      }

      this.aqk = new Class36(this);
      this.aqm = new Class10(this);
      this.aqk.setBounds(0, 0, 620, 479);
      this.aqm.setBounds(0, 0, 620, 479);
      this.add(this.aqk);
      this.add(this.aqm);
      this.ff = new MoneyType();
      String var10014 = "斮妱秨刡";
      this.ff.setIdAndKey(0, "斩妖积分");
      this.ey = com.xy.q.Class1.m(483, 62, 110, 19, 10, Color.white, com.xy.q.Class49.w, this.ff, var1.afx);
      this.ok = com.xy.q.Class1.i(290, 430, 58, 18, 0, Color.white, com.xy.q.Class49.w);
      String var10008 = "qq-v-#5<r|e";
      this.ey.mt(com.xy.w.Class16.m("sc/d/17.png", 6, 6, 6, 6, false));
      String var10007 = "Td\bc\b6\u0010)Wi@";
      this.ok.mt(com.xy.w.Class16.m("sc/d/17.png", 6, 6, 6, 6, false));
      this.ey.n(2);
      this.aqk.add(this.ey);
      this.aqk.add(this.ok);
      this.aqh = new com.xy.a.q.Class102[8];

      for (int var10 = var2 = 0; var10 < this.aqh.length; var10 = var2) {
         this.aqh[var2] = new com.xy.a.q.Class102(var1.eg());
         this.aqh[var2].setBounds(58 + var2 % 4 * 138, 105 + var2 / 4 * 165, 115, 150);
         this.aqk.add(this.aqh[var2++]);
      }

      this.cy = com.xy.q.Class1.k(411, 62, 110, 19, Color.black, com.xy.q.Class49.ch);
      String var51 = "斻妔秽刄";
      this.cy.setText("斩妖积分");
      this.aqk.add(this.cy);
      this.aew = new com.xy.i.Class18[4];

      for (int var11 = var2 = 0; var11 < this.aew.length; var11 = var2) {
         Class118 var13;
         if (var2 != 0 && var2 != 1) {
            com.xy.i.Class18[] var14 = this.aew;
            com.xy.i.Class18 var10001 ;
            if (var2 == 2) {
               var51 = "qq-w-&0<r|e";
               var51 = "sc/e/42.png";
            } else {
               var51 = "Td\bb\b3\u0014)Wi@";
               var51 = "sc/e/43.png";
            }

            var10001 = new com.xy.i.Class18(var51, 1, 167 + var2, var1.eg());
            var14[var2] = var10001;
            var13 = this;
            this.aew[var2].setBounds(269 + (var2 - 2) * 82, 430, 18, 18);
         } else {
            com.xy.i.Class18[] var12 = this.aew;
            var51 = "tD(B(\u0011)Wi@";
            int var60 = 167 + var2;
            String var68;
            Class44 var70;
            if (var2 == 0) {
               var68 = "馄顷";
               var68 = "首页";
               var70 = var1;
            } else if (var2 == 1) {
               var68 = "本顒";
               var68 = "末页";
               var70 = var1;
            } else {
               var68 = "";
               var70 = var1;
            }

            Class18 var39 = new Class18("sc/e/6.png", 1, var60, Class49.bz, null, var68, var70.eg());
            var12[var2] = var39;
            var13 = this;
            this.aew[var2].setBounds(232 + var2 * 140, 430, 34, 18);
         }

         var13.aqk.add(this.aew[var2++]);
      }

      this.aqn = new com.xy.i.Class18[2];

      for (int var16 = var2 = 0; var16 < this.aqn.length; var16 = var2) {
         String var61 = "qq-w-!3<r|e";
         int var63 = 171 + var2;
         String var10011 = "兖捅";
         this.aqn[var2] = new com.xy.i.Class18("sc/e/31.png", 1, var63, com.xy.q.Class49.ch, com.xy.q.Class49.bv, "兑换", var1.eg());
         this.aqn[var2].setBounds(415, 156 + var2 * 150, 79, 25);
         this.aqm.add(this.aqn[var2++]);
      }

      this.ay = new JLabel[10];

      for (int var17 = var2 = 0; var17 < this.ay.length; var17 = var2) {
         this.ay[var2] = com.xy.q.Class1.k(150, 100 + 150 * var2, 100, 19, Color.black, com.xy.q.Class49.ch);
         JLabel var18 = this.ay[var2];
         String var28;
         if (var2 == 0 || var2 == 1) {
            var28 = "伍魆仦";
            var28 = "伏魔令";
         } else if (var2 == 2 || var2 == 5) {
            var28 = "拢朮";
            var28 = "拥有";
         } else if (var2 == 3 || var2 == 6) {
            var28 = "元捠";
            var28 = "兑换";
         } else if (var2 == 4 || var2 == 7) {
            var28 = "莰徰";
            var28 = "获得";
         } else if (var2 == 8) {
            var28 = "。亸牻绍骞〓";
            var28 = "【人物经验】";
         } else if (var2 == 9) {
            var28 = "〗勠耂秈刁〶";
            var28 = "【勇者积分】";
         } else {
            var28 = "";
         }

         var18.setText(var28);
         this.ay[var2].setHorizontalAlignment(0);
         Class118 var19;
         if (var2 >= 2 && var2 <= 4) {
            var19 = this;
            this.ay[var2].setBounds(263, 132 + (var2 - 2) * 27, 36, 19);
         } else if (var2 >= 5 && var2 <= 7) {
            var19 = this;
            this.ay[var2].setBounds(263, 283 + (var2 - 5) * 27, 36, 19);
         } else {
            if (var2 >= 8 && var2 <= 9) {
               this.ay[var2].setHorizontalAlignment(10);
               this.ay[var2].setFont(com.xy.q.Class49.n);
               this.ay[var2].setBounds(300, 206 + (var2 - 8) * 150, 80, 14);
            }

            var19 = this;
         }

         var19.aqm.add(this.ay[var2++]);
      }

      this.ed = new RichLabel("", com.xy.q.Class49.n);
      String var10005 = "!q2\"2\"2\"渫馺插礨８1p#〃毝弢伝魖件叭元捠皖亸牻绍骞丌元捠旤皆亨牫筛纥望共【!`0〓母弲伍魆仦叽兓捰皆動耇秽刄＞栻捼仵栮视徙浬劺　";
      this.ed.setTextSize("#c000000温馨提示：#r1、每张伏魔令可兑换的人物经验与兑换时的人物等级有关。#r2、每张伏魔令可兑换的勇者积分，根据价格规律浮动。", 360);
      this.ed.setBounds(149, 385, this.ed.getWidth(), this.ed.getHeight());
      this.aqm.add(this.ed);
      this.lv = new MoneyType();
      var10005 = "伨魓仃";
      this.lv.setIdAndKey(0, "伏魔令");
      this.kw = new com.xy.q.Class27[2];
      this.bz = new com.xy.q.Class52[2];
      this.aqi = new com.xy.q.Class36[2];
      this.fa = new com.xy.q.Class14[2];

      for (int var21 = var2 = 0; var21 < 2; var21 = var2) {
         this.bz[var2] = com.xy.q.Class1.m(305, 132 + 150 * var2, 94, 19, 10, Color.white, com.xy.q.Class49.w, this.lv, var1.afx);
         var10008 = "qq-v-#5<r|e";
         this.aqi[var2] = com.xy.q.Class1.j(com.xy.w.Class16.m("sc/d/17.png", 6, 6, 6, 6, false), com.xy.q.Class49.w, Color.white);
         this.fa[var2] = com.xy.q.Class1.i(305, 186 + 150 * var2, 94, 19, 10, Color.white, com.xy.q.Class49.w);
         this.aqi[var2].setBounds(305, 159 + 150 * var2, 94, 19);
         com.xy.q.Class52 var10003 = this.bz[var2];
         var51 = "Td\bc\b6\u0010)Wi@";
         var10003.mt(com.xy.w.Class16.m("sc/d/17.png", 6, 6, 6, 6, false));
         com.xy.q.Class14 var43 = this.fa[var2];
         String var48 = "qq-v-#5<r|e";
         var43.mt(com.xy.w.Class16.m("sc/d/17.png", 6, 6, 6, 6, false));
         this.bz[var2].n(2);
         this.aqm.add(this.aqi[var2]);
         this.aqm.add(this.fa[var2]);
         this.aqm.add(this.bz[var2]);
         com.xy.q.Class27[] var49 = this.kw;
         int var57 = var2;
         com.xy.q.Class27 var59 = new com.xy.q.Class27(15, this.aqi[var2], var1.eg());
         var2++;
         var49[var57] = var59;
      }

      this.aqf = new com.xy.w.Class18[5];

      for (int var22 = var2 = 0; var22 < this.aqf.length; var22 = var2) {
         this.aqf[var2] = new com.xy.w.Class18();
         Class118 var23;
         if (var2 >= 0 && var2 <= 1) {
            Class118 var24;
            if (var2 == 0) {
               var24 = this;
               com.xy.w.Class18 var35 = this.aqf[var2];
               String var46 = "Td\bc\b0\u0010)Wi@";
               var35.dp("sc/d/77.png");
            } else {
               if (var2 == 1) {
                  com.xy.w.Class18 var25 = this.aqf[var2];
                  String var36 = "qq-v-%:<r|e";
                  var25.dp("sc/d/78.png");
               }

               var24 = this;
            }

            var24.aqf[var2].setBounds(154, 123 + var2 * 150, 92, 92);
            var23 = this;
         } else if (var2 >= 2 && var2 <= 3) {
            var23 = this;
            com.xy.w.Class18 var45 = this.aqf[var2];
            String var50 = "tD(C(\u0013)Wi@";
            var45.mt(com.xy.w.Class16.m("sc/d/4.png", 5, 5, 5, 5, false));
            this.aqf[var2].setBounds(150, 119 + (var2 - 2) * 150, 100, 100);
         } else {
            if (var2 == 4) {
               com.xy.w.Class18 var34 = this.aqf[var2];
               String var44 = "qq-v-$4<r|e";
               var34.mt(com.xy.w.Class16.m("sc/d/66.png", 80, 1, 80, 1, false));
               this.aqf[var2].setBounds(112, 237, 416, 2);
            }

            var23 = this;
         }

         var23.aqm.add(this.aqf[var2++]);
      }

      String var62 = "Td\bc\b4\u0011)Wi@";
      this.aqg = new com.xy.w.Class18(com.xy.w.Class16.m("sc/d/36.png", 20, 20, 20, 20, false));
      this.aqg.setBounds(43, 84, 550, 374);
      this.add(this.aqg);
      this.setBounds(0, 0, 620, 479);
   }

   // $VF: synthetic method
   static JComponent ajd(Class118 var0) {
      return var0.aqk;
   }
}
