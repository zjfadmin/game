package com.xy;

import com.xy.bean.LoginResult;
import com.xy.text.GameView;
import java.awt.Color;
import java.awt.Font;
import java.math.BigDecimal;
import java.math.RoundingMode;
import javax.swing.JLabel;

public class Class564 extends Class345 {
   private Class70[] da;
   private Class245[] jc;
   private JLabel[] hj;
   private BigDecimal ne;
   private Class436[] an;
   private Class70 hb;

   public void bk(BigDecimal var1) {
      BigDecimal var2 = var1.divide(this.ne, --2, RoundingMode.HALF_DOWN);
      BigDecimal var3 = var2.multiply(new BigDecimal("152"));
      Class564 var10000;
      if (var2.compareTo(new BigDecimal(2 & 5)) <= 0) {
         var10000 = this;
         this.an[3 >> 2].setSize(3 >> 1, 111 & 31);
      } else if (var2.compareTo(new BigDecimal(--1)) <= 0) {
         this.an[3 & 4].setSize(var3.intValue(), 127 & 15);
         var10000 = this;
      } else {
         this.an[3 >> 2].setSize(8345 & 24574, 127 & 15);
         var10000 = this;
      }

      var10000.hj[12 & 123].setText(var1.toString());
   }

   public void d() {
      LoginResult var1;
      this.bk((var1 = this.vd().getLoginResult()).getExperience());
      int var2 = Class224.d(var1.getGrade());
      int var3 = var1.getExtraPointInt("F");
      this.jc[--1].setText(var2 + "级");
      int var4 = Class224.b(Class224.d(var1.getGrade()), this.uw().v() ? 1 ^ 3 : 1);
      var2 = Class224.m(Class224.d(var1.getGrade()), this.uw().v() ? 1 ^ 3 : 1);
      this.jc[1 ^ 3].setText(String.valueOf(var4));
      this.jc[3 & 4].setText(var1.getXiuwei() + "/" + var2);
      this.jc[--3].setText(var3 + "/40");
      this.jc[--4].setText(String.valueOf(var3 + (2 ^ 3)));
   }

   public Class564(GameView var1) {
      int var10001 = --3;
      int var10010 = -4 >> 2;
      super(95 & 113, 5 >> 1, Class345.aef, var1);
      this.ne = new BigDecimal("10000000000");
      this.va(var10010, 3 >> 2, 15182 & 17917, 21975 & 11199, Class345.aeo);
      this.uv(Class511.q("sc/d/1.png", 117 & 78, 117 & 78, 117 & 78, 117 & 78, (boolean)(3 & 4)), "转换经验");
      this.hb = new Class70("sc/e/53.png", 1 ^ 3, 3 & 4, Class681.cw, (Color[])null, "属性点", this);
      this.hb.setBounds(61 & 119, 9465 & 23551, 111 & 125, 62 & 89);
      this.hb.setKeep((boolean)(--1));
      this.add(this.hb);
      Class70[] var5 = new Class70[var10001];
      boolean var10003 = true;
      this.da = var5;

      int var2;
      Class564 var4;
      int var10000;
      for(var10000 = var2 = 5 >> 3; var10000 < this.da.length; var10000 = var2) {
         Class70[] var3 = this.da;
         Class70 var10002 = new Class70;
         int var10005 = 4 ^ 5;
         int var10006 = (20297 & 12791) + var2;
         Font var10007 = Class681.ak;
         Color[] var10008 = Class681.c;
         Class564 var10;
         String var10009;
         if (var2 == 0) {
            var10009 = "转换";
            var10 = this;
         } else if (var2 == (3 & 5)) {
            var10009 = "升级";
            var10 = this;
         } else if (var2 == 5 >> 1) {
            var10009 = "兑换";
            var10 = this;
         } else {
            var10009 = "";
            var10 = this;
         }

         var10002.<init>("sc/e/7.png", var10005, var10006, var10007, var10008, var10009, var10);
         var3[var2] = var10002;
         if (var2 == 0) {
            var4 = this;
            this.da[var2].setBounds(30694 & 2303, 126 & 63, 63 & 123, 93 & 59);
         } else {
            if (var2 == --1 || var2 == --2) {
               this.da[var2].setBounds(28051 & 4863, (21438 & 11513) + (var2 - (3 >> 1)) * (9438 & 23487), 59, 25);
            }

            var4 = this;
         }

         var4.add(this.da[var2++]);
      }

      Class245[] var6 = new Class245[--5];
      var10003 = true;
      this.jc = var6;

      for(var10000 = var2 = 3 >> 2; var10000 < this.jc.length; var10000 = var2) {
         this.jc[var2] = Class133.a(3 & 4, 3 & 4, 3 & 4, 3 & 4, 10, Color.white, Class681.q);
         this.jc[var2].eq(Class511.q("sc/d/17.png", --3, --3, --3, --3, (boolean)(2 & 5)));
         if (var2 == 0) {
            var4 = this;
            this.jc[var2].setBounds(148, 66, 74, 19);
         } else if (var2 == (4 ^ 5)) {
            var4 = this;
            this.jc[var2].setBounds(194, 131, 84, 19);
         } else if (var2 == (1 ^ 3)) {
            var4 = this;
            this.jc[var2].setBounds(194, 155, 84, 19);
         } else if (var2 == --3) {
            var4 = this;
            this.jc[var2].setBounds(201, 286, 68, 19);
         } else {
            if (var2 == --4) {
               this.jc[var2].setBounds(201, 311, 68, 19);
            }

            var4 = this;
         }

         var4.add(this.jc[var2++]);
      }

      JLabel[] var7 = new JLabel[9];
      var10003 = true;
      this.hj = var7;

      for(var10000 = var2 = 3 & 4; var10000 < this.hj.length; var10000 = var2) {
         this.hj[var2] = Class133.c(56, 34, 72, 19, 3 ^ 3, Class681.c("#c000000"), Class681.ak);
         this.hj[var2].setText(var2 == 0 ? "当前经验" : (var2 == 5 >> 2 ? "拥有修为点" : (var2 == (1 ^ 3) ? "人物升级" : (var2 == --3 ? "当前人物等级" : (var2 == --4 ? "升级所需修为点" : (var2 == --5 ? "兑换属性点及潜能属性点" : (var2 == 6 ? "已兑换属性点" : (var2 == 7 ? "兑换所需修为点" : ""))))))));
         this.add(this.hj[var2]);
         if (var2 == 0) {
            this.hj[var2].setBounds(56, 34, 72, 19);
         } else if (var2 == 3 >> 1) {
            this.hj[var2].setBounds(56, 66, 87, 19);
         } else if (var2 == --2) {
            this.hj[var2].setBounds(56, 94, 72, 19);
         } else if (var2 == 3) {
            this.hj[var2].setBounds(88, 131, 103, 19);
         } else if (var2 == 4) {
            this.hj[var2].setBounds(69, 155, 122, 19);
         } else if (var2 == 5) {
            this.hj[var2].setBounds(56, 230, 190, 19);
         } else if (var2 == 6) {
            this.hj[var2].setBounds(61, 286, 103, 19);
         } else if (var2 == 7) {
            this.hj[var2].setBounds(59, 311, 120, 19);
         } else if (var2 == 8) {
            this.hj[var2].setHorizontalAlignment(10);
            this.hj[var2].setForeground(Color.white);
            this.hj[var2].setFont(Class681.q);
            this.hj[var2].setBounds(138, 34, 150, 19);
         }

         ++var2;
      }

      Class436[] var8 = new Class436[6];
      var10003 = true;
      this.an = var8;

      for(var10000 = var2 = 5 >> 3; var10000 < this.an.length; var10000 = var2) {
         this.an[var2] = new Class436();
         if (var2 == 0) {
            var4 = this;
            this.an[var2].eq(Class511.q("sc/d/67.png", 2, 2, 2, 2, (boolean)(3 ^ 3)));
            this.an[var2].setBounds(135, 36, 156, 15);
         } else if (var2 == 5 >> 2) {
            var4 = this;
            this.an[var2].eq(Class511.q("sc/d/17.png", 2, 2, 2, 2, false));
            this.an[var2].setBounds(133, 34, 160, 19);
         } else {
            label191: {
               if (var2 >= 2 && var2 <= 3) {
                  this.an[var2].eq(Class511.q("sc/d/66.png", 30, 1, 30, 1, false));
                  if (var2 == 2) {
                     var4 = this;
                     this.an[var2].setBounds(132, 102, 169, 2);
                     break label191;
                  }

                  if (var2 == 3) {
                     var4 = this;
                     this.an[var2].setBounds(246, 237, 65, 2);
                     break label191;
                  }
               } else if (var2 >= 4 && var2 <= 5) {
                  this.an[var2].eq(Class511.q("sc/d/36.png", 20, 20, 20, 20, false));
                  this.an[var2].setBounds(51, 115 + (var2 - 4) * 158, 250, 110);
               }

               var4 = this;
            }
         }

         var4.add(this.an[var2++]);
      }

   }

   public void q() {
      this.d();
      super.q();
   }
}
