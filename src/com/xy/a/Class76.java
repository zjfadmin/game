package com.xy.a;

import com.xy.readbean.MoneyType;
import com.xy.richtext.RichLabel;
import java.awt.Color;
import javax.swing.JComponent;
import javax.swing.JLabel;

class Class76 extends JComponent {
   private com.xy.w.Class18[] zv;
   private com.xy.q.Class27[] afm;
   private MoneyType sj;
   private com.xy.q.Class14[] fa;
   private long qb;
   private MoneyType lv;
   // $VF: synthetic field
   final Class93 fr;
   private com.xy.q.Class52[] du;
   private com.xy.q.Class36[] afn;
   private JLabel[] o;
   private RichLabel bj;

   // $VF: synthetic method
   static com.xy.q.Class14[] yg(Class76 var0) {
      return var0.fa;
   }

   // $VF: synthetic method
   static com.xy.q.Class36[] yh(Class76 var0) {
      return var0.afn;
   }

   public void dq(String var1) {
      int var10000 = 0;
      this.afn[0].setText("0");
      this.afn[1].setText("0");

      for (int var2 = 0; var10000 < Class130.amr(Class93.aco(this.fr)).length; var10000 = var2) {
         Class130.amr(Class93.aco(this.fr))[var2++].setVisible(false);
      }

      String var9 = ";4";
      String[] var6 = var1.split("\\|");
      var10000 = 2;
      Class93.aco(this.fr).ia = Integer.parseInt(var6[0].substring(2));
      Class93.aco(this.fr).aa = (Integer.parseInt(var6[1]) - 1) / 6 + 1;
      com.xy.q.Class14 var10 = this.fa[0];
      StringBuilder var10002 = new StringBuilder(String.valueOf(Class93.aco(this.fr).ia));
      String var10003 = "H";
      var10.setText(var10002.append("/").append(Class93.aco(this.fr).aa).toString());

      for (int var3 = 2; var10000 < var6.length && var3 < 8; var10000 = var3) {
         int var4 = var3 - 2;
         Class54 var5 = Class130.amr(Class93.aco(this.fr))[var4];
         var10003 = var6[var3];
         String var10004 = "u";
         var3++;
         var5.tg(var10003.split("="));
         var5.setVisible(true);
      }
   }

   // $VF: synthetic method
   static com.xy.q.Class52[] yi(Class76 var0) {
      return var0.du;
   }

   // $VF: synthetic method
   static com.xy.q.Class27[] yj(Class76 var0) {
      return var0.afm;
   }

   public Class76(Class93 var1) {
      this.fr = var1;
      this.qb = 100000L;
      this.o = new JLabel[12];

      int var2;
      for (int var10000 = var2 = 0; var10000 < this.o.length; var10000 = ++var2) {
         this.o[var2] = com.xy.q.Class1.k(47 + 137 * var2, 57, 150, 19, Color.black, com.xy.q.Class49.ch);
         JLabel var8 = this.o[var2];
         String var19;
         if (var2 == 0) {
            var19 = "扶欫坏完啉盌亾珁";
            var19 = "我正在寄售的仙玉";
         } else if (var2 == 1) {
            var19 = "O儆挅奰论幖N";
            var19 = "(兑换大话币)";
         } else if (var2 == 2) {
            var19 = "亾珁";
            var19 = "仙玉";
         } else if (var2 == 3) {
            var19 = "殘烞啹亐";
            var19 = "每点售价";
         } else if (var2 == 4) {
            var19 = "恜亿";
            var19 = "总价";
         } else if (var2 == 5) {
            var19 = "嶕仳晴";
            var19 = "已交易";
         } else if (var2 == 6) {
            var19 = "宣啦亾珁";
            var19 = "寄售仙玉";
         } else if (var2 == 7) {
            var19 = "恬亐";
            var19 = "总价";
         } else if (var2 == 8) {
            var19 = "殨烱啉亿";
            var19 = "每点售价";
         } else if (var2 == 9) {
            var19 = "拫醶";
            var19 = "押金";
         } else if (var2 == 10) {
            var19 = "扶盌亾珁";
            var19 = "我的仙玉";
         } else if (var2 == 11) {
            var19 = "珧醶";
            var19 = "现金";
         } else {
            var19 = "";
         }

         var8.setText(var19);
         this.o[var2].setHorizontalAlignment(10);
         this.add(this.o[var2]);
         if (var2 == 1) {
            this.o[var2].setForeground(Color.red);
         } else if (var2 >= 2 && var2 <= 5) {
            this.o[var2].setForeground(Color.white);
            if (var2 == 2) {
               this.o[var2].setBounds(91, 78, 72, 21);
            } else if (var2 == 3) {
               this.o[var2].setBounds(151, 78, 72, 21);
            } else if (var2 == 4) {
               this.o[var2].setBounds(262, 78, 72, 21);
            } else if (var2 == 5) {
               this.o[var2].setBounds(346, 78, 72, 21);
            }
         } else if (var2 >= 6 && var2 <= 11) {
            this.o[var2].setBounds(116 + (var2 - 6) % 2 * 177, 361 + (var2 - 6) / 2 * 25, 72, 19);
         }
      }

      this.bj = new RichLabel("", com.xy.q.Class49.n);
      String var10005 = "D+WxWxWx湎駠掷祲ｽ姊乬柾亾珁ｫ拴醶k\u0004\u000e!xWxW久仯遈辿k\u0004xWxWxWお";
      this.bj.setTextSize("#c000000温馨提示：如下架仙玉，押金#cFF0000不予退还#c000000。", 410);
      this.bj.setBounds(48, 436, this.bj.getWidth(), this.bj.getHeight());
      this.add(this.bj);
      String var10002 = "\u00144H3HfPy\u00179\u0000";
      this.lv = new MoneyType();
      String var10007 = "于珮";
      this.lv.setIdAndKey(3, "仙玉");
      this.sj = new MoneyType();
      var10005 = "醶铹";
      this.sj.setIdAndKey(1, "金钱");
      com.xy.w.Class9 var4 = com.xy.w.Class16.m("sc/d/17.png", 6, 6, 6, 6, false);
      this.fa = new com.xy.q.Class14[3];
      this.du = new com.xy.q.Class52[2];
      this.afn = new com.xy.q.Class36[2];
      this.afm = new com.xy.q.Class27[2];

      int var3;
      for (int var9 = var3 = 0; var9 < this.afn.length; var9 = var3) {
         this.afn[var3] = com.xy.q.Class1.j(var4, com.xy.q.Class49.w, Color.white);
         Class76 var10;
         if (var3 == 1) {
            var10 = this;
            this.afn[var3].setBounds(188, 387, 89, 19);
         } else {
            var10 = this;
            this.afn[var3].setBounds(188, 362, 89, 19);
         }

         var10.add(this.afn[var3]);
         com.xy.q.Class27[] var31 = this.afm;
         int var35 = var3;
         com.xy.q.Class27 var10003 = new com.xy.q.Class27(15, this.afn[var3], var1.eg());
         var3++;
         var31[var35] = var10003;
      }

      for (int var11 = var3 = 0; var11 < this.fa.length; var11 = var3) {
         this.fa[var3] = com.xy.q.Class1.i(222, 321, 58, 18, var3 == 0 ? 0 : 10, Color.white, com.xy.q.Class49.w);
         this.fa[var3].mt(var4);
         Class76 var12;
         if (var3 == 1) {
            var12 = this;
            this.fa[var3].setBounds(332, 362, 124, 19);
         } else {
            if (var3 == 2) {
               this.fa[var3].setBounds(332, 387, 124, 19);
            }

            var12 = this;
         }

         var12.add(this.fa[var3++]);
      }

      int var13 = 0;
      com.xy.q.Class49.b(this.fa[2], this.qb);

      for (int var6 = 0; var13 < this.du.length; var13 = var6) {
         int var37 = var6 == 0 ? 188 : 332;
         int var10004 = var6 == 0 ? 89 : 124;
         MoneyType var10009;
         Class93 var10010;
         if (var6 == 0) {
            var10009 = this.lv;
            var10010 = var1;
         } else {
            var10009 = this.sj;
            var10010 = var1;
         }

         this.du[var6] = com.xy.q.Class1.m(var37, 412, var10004, 19, 10, Color.white, com.xy.q.Class49.w, var10009, var10010.afx);
         this.du[var6].n(2);
         this.du[var6].mt(var4);
         this.add(this.du[var6++]);
      }

      this.zv = new com.xy.w.Class18[5];

      for (int var14 = var3 = 0; var14 < this.zv.length; var14 = var3) {
         this.zv[var3] = new com.xy.w.Class18();
         Class76 var15;
         if (var3 == 0) {
            var15 = this;
            com.xy.w.Class18 var39 = this.zv[var3];
            String var44 = ";\u0004g\u0003gU}I8\t/";
            var39.mt(com.xy.w.Class16.m("sc/d/25.png", 2, 2, 2, 2, false));
            this.zv[var3].setBounds(47, 78, 408, 21);
         } else if (var3 == 1) {
            var15 = this;
            com.xy.w.Class18 var40 = this.zv[var3];
            String var45 = "\u00144H3HeSy\u00179\u0000";
            var40.mt(com.xy.w.Class16.m("sc/d/24.png", 2, 2, 2, 2, false));
            this.zv[var3].setBounds(47, 78, 408, 235);
         } else if (var3 == 2) {
            Class76 var17;
            if (var1.za().l(2, 11)) {
               com.xy.w.Class18 var16 = this.zv[var3];
               String var32 = "1\u0005}Wx";
               var16.gt(com.xy.w.Class15.d("yb500"));
               var17 = this;
            } else {
               com.xy.w.Class18 var18 = this.zv[var3];
               String var33 = "UdQ";
               var18.gt(com.xy.w.Class15.d("236"));
               var17 = this;
            }

            var17.zv[var3].setBounds(51, 372, 50, 50);
            var15 = this;
         } else if (var3 == 3) {
            var15 = this;
            com.xy.w.Class18 var41 = this.zv[var3];
            String var46 = "\u0014+H,H|I8\t/";
            var41.dp("sc/d/4.png");
            this.zv[var3].setBounds(47, 368, 59, 57);
         } else {
            if (var3 == 4) {
               com.xy.w.Class18 var34 = this.zv[var3];
               var10002 = "\u00144H3HaQy\u00179\u0000";
               var34.mt(com.xy.w.Class16.m("sc/d/66.png", 60, 1, 60, 1, false));
               this.zv[var3].setBounds(56, 346, 390, 2);
            }

            var15 = this;
         }

         var15.add(this.zv[var3++]);
      }
   }
}
