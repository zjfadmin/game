package com.xy;

import com.xy.readbean.Activity;
import com.xy.readbean.ActivityFC;
import com.xy.richtext.RichLabel;
import java.awt.Color;
import javax.swing.JLabel;

public class Class239 extends Class345 {
   private Class94 avg;
   private RichLabel aj;
   private RichLabel q;
   private Class436[] be;
   private JLabel[] ad;
   private RichLabel acv;
   private RichLabel gi;

   public void d() {
      Activity var5 = this.avg.kd();

      int var2;
      for(int var10000 = var2 = 3 & 4; var10000 < 4; var10000 = var2) {
         RichLabel var3 = var2 == 0 ? this.q : (var2 == (2 ^ 3) ? this.acv : (var2 == (1 ^ 3) ? this.aj : this.gi));
         int var4;
         ActivityFC var1 = (var4 = Class394.an(var5.getActivitySet(), var2 == 0 ? "冠军奖励展示=" : (var2 == 3 >> 1 ? "亚军奖励展示=" : (var2 == --2 ? "季军奖励展示=" : "殿军奖励展示=")), "|")) > 0 ? this.vc().m(var4) : null;
         var3.setTextSize(var1 != null ? var1.getValue() : "", 168);
         if (var2 == 0) {
            var3.setBounds(8574 & 24521, 24435 & 8669, var3.getWidth(), var3.getHeight());
         } else if (var2 == (2 ^ 3)) {
            var3.setBounds(1535 & 31738, 22375 & 10750, var3.getWidth(), var3.getHeight());
         } else if (var2 == (1 ^ 3)) {
            var3.setBounds(13817 & 19135, 32127 & 998, var3.getWidth(), var3.getHeight());
         } else if (var2 == --3) {
            var3.setBounds(58 & 127, 25079 & 8061, var3.getWidth(), var3.getHeight());
         }

         ++var2;
      }

   }

   public Class239(Class94 var1) {
      int var10001 = --4;
      int var10005 = 2 & 5;
      super(-4 >> 2, -4 >> 2, Class345.aei, var1.aej);
      this.va(var10005, 5 >> 3, 13038 & 20447, 2735 & 30558, Class345.aei);
      this.avg = var1;
      JLabel[] var4 = new JLabel[var10001];
      boolean var10003 = true;
      this.ad = var4;

      int var10000;
      int var2;
      Class239 var3;
      for(var10000 = var2 = 3 ^ 3; var10000 < this.ad.length; var10000 = var2) {
         this.ad[var2] = Class133.b(2878 & 30207, 2878 & 30207, 7870 & 25075, 126 & 21, Color.YELLOW, Class681.q);
         this.ad[var2].setText(var2 == 0 ? "冠军奖励物品" : (var2 == --1 ? "亚军奖励物品" : (var2 == 5 >> 1 ? "季军奖励物品" : (var2 == --3 ? "殿军奖励物品" : ""))));
         this.ad[var2].setHorizontalAlignment(3 & 4);
         if (var2 == (2 ^ 3)) {
            var3 = this;
            this.ad[var2].setBounds(12793 & 20470, 14331 & 18774, 6543 & 26365, 94 & 53);
         } else if (var2 == 5 >> 1) {
            var3 = this;
            this.ad[var2].setBounds(19965 & 12987, 4570 & 28535, 14213 & 18687, 53 & 94);
         } else {
            if (var2 == --3) {
               this.ad[var2].setBounds(127 & 59, 7153 & 25967, 127 & 126, 20);
            }

            var3 = this;
         }

         var3.add(this.ad[var2++]);
      }

      var10001 = 5 >> 1;
      this.q = new RichLabel("", Class681.bm);
      this.add(this.q);
      this.acv = new RichLabel("", Class681.bm);
      this.add(this.acv);
      this.aj = new RichLabel("", Class681.bm);
      this.add(this.aj);
      this.gi = new RichLabel("", Class681.bm);
      this.add(this.gi);
      Class436[] var5 = new Class436[var10001];
      var10003 = true;
      this.be = var5;

      for(var10000 = var2 = 3 ^ 3; var10000 < this.be.length; var10000 = var2) {
         this.be[var2] = new Class436();
         if (var2 == 0) {
            var3 = this;
            this.be[var2].fw("sc/d/129.png");
            this.be[var2].setBounds(113, 5 >> 1, 160, 57);
         } else {
            if (var2 == 5 >> 2) {
               this.be[var2].fw("sc/d/148.png");
               this.be[var2].setBounds(11, 31, 692, 457);
            }

            var3 = this;
         }

         var3.add(this.be[var2++]);
      }

   }
}
