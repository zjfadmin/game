package com.xy;

import com.xy.bean.ConfirmBean;
import com.xy.readbean.Activity;
import com.xy.readbean.ActivityFC;
import com.xy.readbean.ActivityFCBeau;
import com.xy.richtext.RichLabel;
import com.xy.text.GameView;
import java.awt.Color;
import javax.swing.JLabel;

public class Class450 extends Class345 {
   private Class436[] be;
   private Class379 sl;
   private JLabel[] ly;
   private RichLabel gi;

   public Class450(GameView var1) {
      int var10001 = --3;
      int var10006 = 5 >> 3;
      super(-4 >> 2, -4 >> 2, Class345.aei, var1);
      this.va(var10006, 5 >> 3, 3839 & 29631, 29599 & 3710, Class345.aei);
      this.sl = new Class379("sc/e/187.png", --1, 26109 & 6859, Class681.cf, (Color[])null, "购买", this);
      this.sl.setBounds(13271 & 19819, 24502 & 8703, 107 & 87, 103 & 59);
      this.add(this.sl);
      JLabel[] var4 = new JLabel[var10001];
      boolean var10003 = true;
      this.ly = var4;

      int var10000;
      int var2;
      Class450 var3;
      for(var10000 = var2 = 2 & 5; var10000 < this.ly.length; var10000 = var2) {
         this.ly[var2] = Class133.b(17842 & 15231, 123 & 109, 117 & 110, 25 & 126, Class681.c("#c86745C"), Class681.ao);
         this.ly[var2].setText(var2 == 0 ? "靓号信筏" : (var2 == (3 & 5) ? "198 积分" : (var2 == 5 >> 1 ? "购买靓号信筏，自定义一组土豪金靓号" : "")));
         if (var2 == (2 ^ 3)) {
            var3 = this;
            this.ly[var2].setBounds(7999 & 25048, 20463 & 12665, 25339 & 7581, 127 & 28);
            this.ly[var2].setFont(Class681.cf);
            this.ly[var2].setForeground(Class681.c("#cDDC798"));
         } else {
            if (var2 == 5 >> 1) {
               this.ly[var2].setBounds(13559 & 19390, 401, 349, 20);
               this.ly[var2].setFont(Class681.cw);
            }

            var3 = this;
         }

         var3.ly[var2].setHorizontalAlignment(3 ^ 3);
         this.add(this.ly[var2++]);
      }

      var10001 = --4;
      this.gi = new RichLabel("", Class681.q);
      this.gi.setTextSize("#c484333投放时间为#cFF0000  2020-01-01 20:00:00 ~ 2020-01-03 20:00:00", 500);
      this.gi.setBounds(101, 75, this.gi.getWidth(), this.gi.getHeight());
      this.add(this.gi);
      Class436[] var5 = new Class436[var10001];
      var10003 = true;
      this.be = var5;

      for(var10000 = var2 = 3 >> 2; var10000 < this.be.length; var10000 = var2) {
         this.be[var2] = new Class436();
         if (var2 == 0) {
            var3 = this;
            this.be[var2].fw("sc/d/200.png");
            this.be[var2].setBounds(301, 163, 110, 184);
         } else if (var2 == (4 ^ 5)) {
            var3 = this;
            this.be[var2].fw("sc/d/139.png");
            this.be[var2].setBounds(280, 361, 153, 28);
         } else if (var2 == --2) {
            var3 = this;
            this.be[var2].fw("sc/d/202.png");
            this.be[var2].setBounds(93, 39, 608, 407);
         } else {
            if (var2 == --3) {
               this.be[var2].eq(Class511.q("sc/d/132.png", 50, 50, 50, 50, (boolean)(5 >> 3)));
               this.be[var2].setBounds(45, 68, 633, 432);
            }

            var3 = this;
         }

         var3.add(this.be[var2++]);
      }

   }

   public void y(int var1) {
      if (var1 == (11259 & 21709)) {
         Activity var3;
         int var2 = (var3 = this.vc().cq()) != null ? Class394.an(var3.getActivitySet(), "靓号信筏说明=", "|") : 0;
         ActivityFC var4 = var2 > 0 ? this.vc().m(var2) : null;
         this.aej.aal(new ConfirmBean(103 & 59, (String)null, var4 != null ? var4.getValue() : "还未设置说明文本"));
      }

   }

   public void d() {
      Activity var1;
      int var2 = (var1 = this.vc().cq()) != null ? Class394.an(var1.getActivitySet(), "靓号信筏设置=", "|") : 0;
      ActivityFC var3 = var2 > 0 ? this.vc().m(var2) : null;
      ActivityFCBeau var8 = var3 != null ? (ActivityFCBeau)var3.getData() : null;
      Class450 var10000;
      if (var8 != null) {
         var10000 = this;
         long var4 = var1.getTimeOpen() + (long)var8.getPointTime().x * 1000L;
         long var6 = var1.getTimeOpen() + (long)var8.getPointTime().y * 1000L;
         this.gi.setTextSize("#c484333投放时间为#cFF0000  " + Class280.i(var4) + " ~ " + Class280.i(var6), 13308 & 19959);
      } else {
         var10000 = this;
         this.gi.setTextSize("", 11263 & 22004);
      }

      var10000.gi.setBounds(111 & 117, 123 & 79, this.gi.getWidth(), this.gi.getHeight());
      this.ly[--1].setText("198 积分");
   }
}
