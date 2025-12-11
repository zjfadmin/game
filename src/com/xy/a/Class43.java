package com.xy.a;

import com.xy.readbean.MoneyType;
import com.xy.readbean.petExchange;
import com.xy.richtext.RichLabel;
import java.awt.Color;
import javax.swing.JComponent;
import javax.swing.JLabel;

class Class43 extends JComponent {
   private com.xy.q.Class36[] tu;
   private com.xy.q.Class14[] pm;
   private com.xy.i.Class18[] tv;
   private petExchange tw;
   private RichLabel am;
   private com.xy.q.Class52[] tx;
   private petExchange ty;
   private RichLabel in;
   private JLabel[] r;
   private com.xy.w.Class18[] ar;
   // $VF: synthetic field
   final Class93 tz;
   private com.xy.q.Class27[] ua;
   private RichLabel bj;

   // $VF: synthetic method
   static com.xy.q.Class27[] oa(Class43 var0) {
      return var0.ua;
   }

   // $VF: synthetic method
   static petExchange ob(Class43 var0) {
      return var0.tw;
   }

   // $VF: synthetic method
   static com.xy.q.Class14[] oc(Class43 var0) {
      return var0.pm;
   }

   // $VF: synthetic method
   static com.xy.q.Class52[] od(Class43 var0) {
      return var0.tx;
   }

   // $VF: synthetic method
   static petExchange oe(Class43 var0) {
      return var0.ty;
   }

   public Class43(Class93 var1) {
      this.tz = var1;
      this.tv = new com.xy.i.Class18[2];

      int var2;
      for (int var10000 = var2 = 0; var10000 < this.tv.length; var10000 = var2) {
         String var10007 = "mF1@1\u00120UpB";
         int var10009 = 191 + var2;
         String var10012 = "兞捴";
         this.tv[var2] = new com.xy.i.Class18("sc/e/7.png", 1, var10009, com.xy.q.Class49.ch, com.xy.q.Class49.bv, "兑换", var1.eg());
         this.tv[var2].setBounds(378, 248 + var2 * 141, 59, 25);
         this.add(this.tv[var2++]);
      }

      this.r = new JLabel[17];

      for (int var10 = var2 = 0; var10 < this.r.length; var10 = ++var2) {
         this.r[var2] = com.xy.q.Class1.k(47, 57, 150, 19, Color.black, com.xy.q.Class49.ch);
         JLabel var11 = this.r[var2];
         String var20;
         if (var2 == 0) {
            var20 = "戴歽圍兏捇经玬";
            var20 = "我正在兑换绑玉";
         } else if (var2 == 1) {
            var20 = "悧彅剂內朆，";
            var20 = "您当前共有：";
         } else if (var2 == 2) {
            var20 = "经玬";
            var20 = "绑玉";
         } else if (var2 == 3) {
            var20 = "他玟兞捴";
            var20 = "仙玉兑换";
         } else if (var2 == 4) {
            var20 = "夂诃帤兏捇";
            var20 = "大话币兑换";
         } else if (var2 == 5 || var2 == 8) {
            var20 = "拪期";
            var20 = "拥有";
         } else if (var2 == 6 || var2 == 9) {
            var20 = "兏捇";
            var20 = "兑换";
         } else if (var2 == 7 || var2 == 10) {
            var20 = "莸征";
            var20 = "获得";
         } else if (var2 == 11 || var2 == 12) {
            var20 = "『仼玗〴";
            var20 = "【仙玉】";
         } else if (var2 == 13 || var2 == 16) {
            var20 = "〟织玆〇";
            var20 = "【绑玉】";
         } else if (var2 != 14 && var2 != 15) {
            var20 = "";
         } else {
            var20 = "〵夹诸帟〴";
            var20 = "【大话币】";
         }

         var11.setText(var20);
         this.r[var2].setHorizontalAlignment(10);
         this.add(this.r[var2]);
         if (var2 >= 1 && var2 <= 2) {
            this.r[var2].setBounds(131 + 228 * (var2 - 1), 95, 84, 19);
            this.r[var2].setFont(com.xy.q.Class49.co);
         } else if (var2 >= 3 && var2 <= 4) {
            this.r[var2].setFont(com.xy.q.Class49.bx);
            this.r[var2].setHorizontalAlignment(0);
            this.r[var2].setBounds(37, 197 + 141 * (var2 - 3), 119, 21);
         } else if (var2 >= 5 && var2 <= 7) {
            this.r[var2].setBounds(147, 226 + 25 * (var2 - 5), 36, 19);
         } else if (var2 >= 8 && var2 <= 10) {
            this.r[var2].setBounds(147, 367 + 25 * (var2 - 8), 36, 19);
         } else if (var2 >= 11 && var2 <= 13) {
            this.r[var2].setBounds(312, 226 + 25 * (var2 - 11), 72, 19);
            this.r[var2].setFont(com.xy.q.Class49.bz);
         } else if (var2 >= 14 && var2 <= 16) {
            this.r[var2].setBounds(312, 367 + 25 * (var2 - 14), 72, 19);
            this.r[var2].setFont(com.xy.q.Class49.bz);
         }
      }

      this.bj = new RichLabel("", com.xy.q.Class49.n);
      String var10005 = "5l&?&?&?尐他玟兞捴戟织玆：兞捴毛依丵5lPI&?&?6>6５$";
      this.bj.setTextSize("#c000000将仙玉兑换成绑玉，兑换比例为#cFF0000 1 ：2", 360);
      this.bj.setBounds(129, 124, this.bj.getWidth(), this.bj.getHeight());
      this.add(this.bj);
      this.am = new RichLabel("", com.xy.q.Class49.n);
      String var10006 = "\u0006}\u0015.\u0015.\u0015.尣夹诸帟兴捼戵经玬２兴捼毱侕丟=FXc.\u0015.\u0015>\u0014.\u0015.\u0015.\u0005＄\u0014";
      this.am.setTextSize("#c000000将大话币兑换成绑玉，兑换比例为#cFF0000 100000 ：1", 360);
      this.am.setBounds(129, 142, this.am.getWidth(), this.am.getHeight());
      this.add(this.am);
      this.in = new RichLabel("", com.xy.q.Class49.n);
      String var50 = "5l&?&?&?渿馧揆礵，夨诋帎兇捭织玆：粱硸刿丼佂敦＃5lPI&?&?扖朆尙敿渓雹5l&?&?&?〔";
      this.in.setTextSize("#c000000温馨提示：大话币兑换绑玉，精确到个位数，#cFF0000所有小数清零#c000000。", 360);
      this.in.setBounds(48, 467, this.in.getWidth(), this.in.getHeight());
      this.add(this.in);
      String var10004 = "V}\nz\n/\u00120UpB";
      com.xy.w.Class9 var6 = com.xy.w.Class16.m("sc/d/17.png", 6, 6, 6, 6, false);
      this.pm = new com.xy.q.Class14[2];
      this.tx = new com.xy.q.Class52[3];
      this.tu = new com.xy.q.Class36[2];
      this.ua = new com.xy.q.Class27[2];

      int var3;
      for (int var12 = var3 = 0; var12 < this.tu.length; var12 = var3) {
         this.tu[var3] = com.xy.q.Class1.j(var6, com.xy.q.Class49.w, Color.white);
         Class43 var13;
         if (var3 == 0) {
            var13 = this;
            this.tu[var3].setBounds(187, 251, 124, 19);
         } else {
            if (var3 == 1) {
               this.tu[var3].setBounds(187, 392, 124, 19);
            }

            var13 = this;
         }

         var13.add(this.tu[var3]);
         com.xy.q.Class27[] var31 = this.ua;
         int var38 = var3;
         com.xy.q.Class27 var10003 = new com.xy.q.Class27(15, this.tu[var3], var1.eg());
         var3++;
         var31[var38] = var10003;
      }

      for (int var14 = var3 = 0; var14 < this.pm.length; var14 = var3) {
         this.pm[var3] = com.xy.q.Class1.i(0, 0, 0, 0, 10, Color.white, com.xy.q.Class49.w);
         this.pm[var3].mt(var6);
         Class43 var15;
         if (var3 == 0) {
            var15 = this;
            this.pm[var3].setBounds(187, 276, 124, 19);
         } else {
            if (var3 == 1) {
               this.pm[var3].setBounds(187, 417, 124, 19);
            }

            var15 = this;
         }

         var15.add(this.pm[var3++]);
      }

      for (int var16 = var3 = 0; var16 < this.tx.length; var16 = var3) {
         MoneyType var4 = new MoneyType();
         Class43 var17;
         if (var3 == 0) {
            var17 = this;
            String var48 = "绞玟";
            var4.setIdAndKey(2, "绑玉");
         } else if (var3 == 1) {
            var17 = this;
            String var49 = "仇玬";
            var4.setIdAndKey(3, "仙玉");
         } else {
            if (var3 == 2) {
               String var40 = "釞钧";
               var4.setIdAndKey(1, "金钱");
            }

            var17 = this;
         }

         var17.tx[var3] = com.xy.q.Class1.m(0, 0, 0, 0, 10, Color.white, com.xy.q.Class49.w, var4, var1.afx);
         Class43 var18;
         if (var3 == 0) {
            var18 = this;
            this.tx[var3].setBounds(214, 95, 139, 19);
         } else if (var3 == 1) {
            var18 = this;
            this.tx[var3].setBounds(187, 226, 124, 19);
         } else {
            if (var3 == 2) {
               this.tx[var3].setBounds(187, 367, 124, 19);
            }

            var18 = this;
         }

         var18.tx[var3].n(2);
         this.tx[var3].mt(var6);
         this.add(this.tx[var3++]);
      }

      this.ar = new com.xy.w.Class18[9];

      for (int var19 = var3 = 0; var19 < this.ar.length; var19 = ++var3) {
         if (var3 != 0) {
            this.ar[var3] = new com.xy.w.Class18();
            this.add(this.ar[var3]);
            if (var3 == 0) {
               com.xy.w.Class18 var32 = this.ar[var3];
               String var42 = "V}\nz\n-\u00100UpB";
               var32.mt(com.xy.w.Class16.m("sc/d/35.png", 80, 10, 80, 10, false));
               this.ar[var3].setBounds(47, 34, 408, 20);
            } else if (var3 == 1) {
               com.xy.w.Class18 var33 = this.ar[var3];
               String var43 = "el9k97&!faq";
               var33.dp("sc/d/80.png");
               this.ar[var3].setBounds(64, 93, 50, 70);
            } else if (var3 == 2) {
               com.xy.w.Class18 var34 = this.ar[var3];
               String var44 = "V}\nz\n(\u00130UpB";
               var34.mt(com.xy.w.Class16.m("sc/d/66.png", 60, 1, 60, 1, false));
               this.ar[var3].setBounds(130, 120, 306, 2);
            } else if (var3 == 3) {
               com.xy.w.Class18 var35 = this.ar[var3];
               String var45 = "el9k9< !faq";
               var35.mt(com.xy.w.Class16.m("sc/d/36.png", 20, 20, 20, 20, false));
               this.ar[var3].setBounds(47, 78, 408, 100);
            } else if (var3 == 4 || var3 == 5) {
               this.ar[var3].setBounds(61, 226 + (var3 - 4) * 141, 70, 70);
            } else if (var3 == 6 || var3 == 7) {
               com.xy.w.Class18 var37 = this.ar[var3];
               String var47 = "mF1A1\u00110UpB";
               var37.mt(com.xy.w.Class16.m("sc/d/4.png", 5, 5, 5, 5, false));
               this.ar[var3].setBounds(57, 222 + (var3 - 6) * 141, 79, 77);
            } else if (var3 == 8) {
               com.xy.w.Class18 var36 = this.ar[var3];
               String var46 = "el9k99 !faq";
               var36.mt(com.xy.w.Class16.m("sc/d/66.png", 60, 1, 60, 1, false));
               this.ar[var3].setBounds(57, 321, 390, 2);
            }
         }
      }
   }

   // $VF: synthetic method
   static RichLabel of(Class43 var0) {
      return var0.am;
   }

   // $VF: synthetic method
   static RichLabel og(Class43 var0) {
      return var0.bj;
   }

   // $VF: synthetic method
   static void oh(Class43 var0, petExchange var1) {
      var0.tw = var1;
   }

   // $VF: synthetic method
   static com.xy.q.Class36[] oi(Class43 var0) {
      return var0.tu;
   }

   // $VF: synthetic method
   static void oj(Class43 var0, petExchange var1) {
      var0.ty = var1;
   }
}
