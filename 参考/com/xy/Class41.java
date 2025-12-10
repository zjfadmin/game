package com.xy;

import com.xy.readbean.Activity;
import com.xy.readbean.ActivityFC;
import com.xy.richtext.RichLabel;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import java.awt.Color;
import javax.swing.JLabel;

public class Class41 extends Class345 {
   private RichLabel bt;
   private Class379[] aex;
   private Class436[] cs;
   private long gf;
   private Class217 aoo;
   private <undefinedtype>[] aop;
   private JLabel rk;
   private Class319 zg;

   public void ch(int[] var1) {
      Activity var2;
      int var3 = (var2 = this.vc().cq()) != null ? Class394.an(var2.getActivitySet(), "选靓号说明=", "|") : 0;
      ActivityFC var5 = var3 > 0 ? this.vc().m(var3) : null;
      this.bt.setTextSize(var5 != null ? var5.getValue() : "还未设置说明文本", 480);
      int var10001 = 3 >> 2;
      this.bt.setBounds(5821 & 27118, 126 & 95, this.bt.getWidth(), this.bt.getHeight());
      int var6 = var1[var10001];

      for(int var10000 = var3 = 3 & 4; var10000 < this.aop.length; var10000 = var3) {
         int var4 = var3 + (2 ^ 3) < var1.length ? var1[var3 + --1] : 0;
         <undefinedtype> var7 = this.aop[var3];
         ++var3;
         var7.cf(var4, var6);
      }

   }

   public void cf(int var1, int var2) {
      String var3;
      if (var1 == (31477 & 1470)) {
         if (var2 != 0) {
            var3 = Agreement.getSendTextAES("BEAU", "B0" + var2);
            this.uw().d(var3);
         }
      } else if (var1 == (8373 & 24575)) {
         if (Class280.f() - this.gf < (long)(Class280.i * (26 & 111))) {
            this.aej.f("你点的太快了");
         } else {
            this.gf = Class280.f();
            var3 = Agreement.getSendTextAES("BEAU", "V0" + this.aoo.getText());
            this.uw().d(var3);
         }
      } else {
         if (var1 != (24502 & 8447)) {
         }

      }
   }

   public Class41(GameView var1) {
      int var10001 = 4 ^ 5;
      int var10003 = 5 >> 3;
      super(-4 >> 2, -4 >> 2, Class345.aei, var1);
      this.va(var10003, 5 >> 3, 6847 & 26623, 28639 & 4670, Class345.aei);
      Class379[] var3 = new Class379[var10001];
      boolean var7 = true;
      this.aex = var3;

      int var10000;
      int var2;
      for(var10000 = var2 = 5 >> 3; var10000 < this.aex.length; var10000 = var2) {
         this.aex[var2] = new Class379(var2 == 0 ? "sc/e/188.png" : (var2 == 5 >> 2 ? "sc/e/156.png" : "sc/e/155.png"), 1, (22269 & 10679) + var2, this);
         this.aex[var2].setBounds(31190 & 1919, 125 & 71, 62 & 85, 62 & 85);
         if (var2 >= --1 && var2 <= --2) {
            this.aex[var2].setBounds((17397 & 15675) + (var2 - (3 & 5)) * (127 & 94), 10747 & 22518, 123 & 22, 127 & 25);
         }

         this.add(this.aex[var2++]);
      }

      var10001 = 88 & 55;
      this.rk = Class133.b(30125 & 2814, 103 & 93, 126 & 47, 83 & 63, Color.black, Class681.ak);
      this.rk.setText("搜索");
      this.add(this.rk);
      this.bt = new RichLabel("", Class681.ab);
      this.bt.setTextSize("#c484333【规则说明】#r可以自选非5A的6位数靓号", 480);
      this.bt.setBounds(172, 94, this.bt.getWidth(), this.bt.getHeight());
      this.add(this.bt);
      this.aoo = Class133.n(Class511.q("sc/d/17.png", 6, 6, 6, 6, (boolean)(3 >> 2)), Class681.q, Color.white);
      this.aoo.setBounds(216, 69, 144, 19);
      this.add(this.aoo);
      this.zg = new Class319(3 ^ 3, this.aoo, this);
      <undefinedtype>[] var5 = new <undefinedtype>[var10001];
      var7 = true;
      this.aop = var5;

      for(var10000 = var2 = 3 ^ 3; var10000 < this.aop.length; var10000 = var2) {
         this.aop[var2] = new Class456(var2, this) {
            private JLabel at;
            private Class436 uc;
            private JLabel d;
            private Class379 sl;
            private JLabel rk;

            public void cf(int var1, int var2) {
               this.sl.y(var1);
               this.d.setText(String.valueOf(var1));
               this.rk.setText(String.valueOf(var2));
               this.setVisible((boolean)(var1 != 0 ? 5 >> 2 : 0));
            }

            public {
               int var10007 = 62 & 119;
               int var10009 = 126 & 15;
               int var10011 = 107 & 31;
               this.sl = new Class379("sc/e/189.png", 5 >> 2, 1718 & 31229, var3);
               this.sl.setBounds(127 & 125, 87 & 59, 95 & 59, 95 & 59);
               this.d = Class133.b(var10011, 77 & 59, 126 & 121, 95 & 56, Class681.c("#c484333"), Class681.ar);
               this.at = Class133.b(var10009, 47 & 118, 55 & 122, 113 & 30, Class681.c("#c6F6957"), Class681.ce);
               this.rk = Class133.b(var10007, 39 & 126, 95 & 102, 19 & 124, Color.red, Class681.bx);
               this.at.setText("积分：");
               this.rk.setText("6");
               this.uc = new Class436("sc/d/198.png");
               this.uc.setBounds(3 & 4, 3 & 4, 156, 66);
               this.add(this.sl);
               this.add(this.d);
               this.add(this.at);
               this.add(this.rk);
               this.add(this.uc);
            }
         };
         this.aop[var2].setBounds(43 + var2 % --4 * 160, 217 + var2 / --4 * 70, 156, 66);
         this.add(this.aop[var2++]);
      }

      Class436[] var6 = new Class436[--3];
      var7 = true;
      this.cs = var6;

      for(var10000 = var2 = 5 >> 3; var10000 < this.cs.length; var10000 = var2) {
         this.cs[var2] = new Class436();
         Class41 var4;
         if (var2 == 0) {
            var4 = this;
            this.cs[var2].eq(Class511.q("sc/d/66.png", 100, --1, 100, 2 ^ 3, (boolean)(3 & 4)));
            this.cs[var2].setBounds(47, 208, 629, 1 ^ 3);
         } else if (var2 == (4 ^ 5)) {
            var4 = this;
            this.cs[var2].fw("sc/d/201.png");
            this.cs[var2].setBounds(63, 26, 81, 207);
         } else {
            if (var2 == (1 ^ 3)) {
               this.cs[var2].eq(Class511.q("sc/d/36.png", 20, 20, 20, 20, (boolean)(3 ^ 3)));
               this.cs[var2].setBounds(44, 58, 634, 142);
            }

            var4 = this;
         }

         var4.add(this.cs[var2++]);
      }

   }
}
