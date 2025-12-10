package com.xy;

import com.xy.bean.UseCardBean;
import com.xy.game.RoleData;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;

public class Class368 extends Class345 {
   private Class529[] xq;
   private JLabel[] ad;
   private Class245[] cj;
   private Class436[] g;

   public void d() {
      RoleData var1;
      UseCardBean var2;
      int var3 = (var2 = (var1 = this.vd()).getLimit("月卡")) != null ? var2.getUseTime() / (19948 & 14259) : 0;
      this.cj[3 ^ 3].setText(var3 > 0 ? String.valueOf(var3) : "--");
      this.xq[3 ^ 3].setVisible((boolean)(var2 != null ? 5 >> 2 : 0));
      RoleData var10000;
      if (var2 == null && this.uw().VALUE.indexOf("K") != -4 >> 2) {
         var10000 = var1;
         this.xq[5 >> 3].setText("购买月卡");
         this.xq[5 >> 3].setVisible((boolean)(--1));
      } else {
         this.xq[2 & 5].setText("领取奖励");
         var10000 = var1;
      }

      var3 = (var2 = var10000.getLimit("季卡")) != null ? var2.getUseTime() / (1459 & 32748) : 0;
      this.cj[--1].setText(var3 > 0 ? String.valueOf(var3) : "--");
      this.xq[--1].setVisible((boolean)(var2 != null ? --1 : 0));
      if (var2 == null && this.uw().VALUE.indexOf("K") != -4 >> 2) {
         this.xq[4 ^ 5].setText("购买季卡");
         this.xq[2 ^ 3].setVisible((boolean)(3 >> 1));
      } else {
         this.xq[3 >> 1].setText("领取奖励");
      }
   }

   public Class368(GameView var1) {
      int var10001 = 1 ^ 3;
      int var10003 = 3 ^ 3;
      super(-4 >> 2, -4 >> 2, Class345.aei, var1);
      this.va(var10003, 3 & 4, 7870 & 25579, 24031 & 9211, Class345.aei);
      Class529[] var4 = new Class529[var10001];
      boolean var11 = true;
      this.xq = var4;

      int var2;
      int var10000;
      for(var10000 = var2 = 3 & 4; var10000 < this.xq.length; var10000 = var2) {
         Class529[] var3 = this.xq;
         Class529 var10002 = new Class529;
         int var10005 = 3 & 5;
         int var10006 = (28510 & 4539) + var2;
         Font var10007 = Class681.ak;
         Color[] var10008 = Class681.c;
         String var10009;
         Class368 var10010;
         if (var2 == 0) {
            var10009 = "领取奖励";
            var10010 = this;
         } else if (var2 == 5 >> 2) {
            var10009 = "领取奖励";
            var10010 = this;
         } else {
            var10009 = "";
            var10010 = this;
         }

         var10002.<init>("sc/e/26.png", var10005, var10006, var10007, var10008, var10009, var10010);
         var3[var2] = var10002;
         this.xq[var2].setBounds(24573 & 8575, (121 & 87) + (22207 & 10750) * var2, 107 & 119, 89 & 63);
         this.add(this.xq[var2++]);
      }

      JLabel[] var5 = new JLabel[1 ^ 3];
      var11 = true;
      this.ad = var5;

      for(var10000 = var2 = 3 ^ 3; var10000 < this.ad.length; var10000 = var2) {
         this.ad[var2] = Class133.b(103 & 91, (6828 & 26111) + var2 * (9151 & 23806), 95 & 111, 31 & 118, Color.black, Class681.cf);
         this.ad[var2].setText(var2 == 0 ? "月卡" : (var2 == --1 ? "季卡" : ""));
         this.ad[var2].setHorizontalAlignment(3 ^ 3);
         this.add(this.ad[var2++]);
      }

      Class245[] var6 = new Class245[5 >> 1];
      var11 = true;
      this.cj = var6;

      for(var10000 = var2 = 3 & 4; var10000 < this.cj.length; var10000 = var2) {
         this.cj[var2] = Class133.a(20479 & 12541, (116 & 95) + var2 * (4286 & 28671), 79, 19, 3 ^ 3, Color.white, Class681.t);
         this.cj[var2].eq(Class511.q("sc/d/17.png", 6, 6, 6, 6, (boolean)(3 ^ 3)));
         this.add(this.cj[var2]);
         Class245 var8 = this.cj[var2];
         ++var2;
         var8.setText("99");
      }

      Class436[] var9 = new Class436[10];
      var11 = true;
      this.g = var9;

      for(var10000 = var2 = 3 >> 2; var10000 < this.g.length; var10000 = var2) {
         this.g[var2] = new Class436();
         Class368 var10;
         if (var2 != 0 && var2 != (2 ^ 3)) {
            if (var2 != (1 ^ 3) && var2 != --3) {
               if (var2 != --4 && var2 != --5) {
                  if (var2 == 6) {
                     var10 = this;
                     this.g[var2].fw("sc/d/84.png");
                     this.g[var2].setBounds(157, 87, 494, 141);
                  } else if (var2 == 7) {
                     var10 = this;
                     this.g[var2].fw("sc/d/85.png");
                     this.g[var2].setBounds(157, 277, 497, 148);
                  } else {
                     if (var2 == 8 || var2 == 9) {
                        this.g[var2].eq(Class511.q("sc/d/36.png", 20, 20, 20, 20, (boolean)(3 & 4)));
                        this.g[var2].setBounds(53, 62 + (var2 - 8) * 190, 610, 180);
                     }

                     var10 = this;
                  }
               } else {
                  var10 = this;
                  this.g[var2].eq(Class511.q("sc/d/66.png", 80, 4 ^ 5, 80, 2 ^ 3, (boolean)(5 >> 3)));
                  this.g[var2].setBounds(154, 109 + (var2 - --4) * 190, 501, 5 >> 1);
               }
            } else {
               var10 = this;
               this.g[var2].eq(Class511.q("sc/d/4.png", --5, --5, --5, --5, (boolean)(3 & 4)));
               this.g[var2].setBounds(67, 85 + (var2 - (5 >> 1)) * 190, 79, 77);
            }
         } else {
            if (var2 == 0) {
               var10 = this;
               this.g[var2].fw("sc/d/82.png");
            } else {
               if (var2 == --1) {
                  this.g[var2].fw("sc/d/83.png");
               }

               var10 = this;
            }

            var10.g[var2].setBounds(67, 85 + var2 * 190, 79, 77);
            var10 = this;
         }

         var10.add(this.g[var2++]);
      }

   }

   public void y(int var1) {
      String var2 = Agreement.getSendTextAES("taskN", "R1=" + (var1 == (7547 & 25503) ? 1 ^ 3 : (var1 == (29627 & 3422) ? 4 ^ 5 : 0)));
      this.uw().d(var2);
   }
}
