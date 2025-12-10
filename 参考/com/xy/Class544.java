package com.xy;

import com.xy.bean.LoginResult;
import com.xy.readbean.MoneyType;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import java.awt.Color;
import java.awt.Graphics;
import java.math.BigDecimal;
import javax.swing.JLabel;

public class Class544 extends Class345 {
   private BigDecimal cf;
   private JLabel[] iv;
   private Class245[] jc;
   private int j;
   private Class436 av;
   private Class70 akq;
   private Class556[] ck;

   protected void paintComponent(Graphics var1) {
      super.paintComponent(var1);
      if (this.aej.bl()) {
         this.d();
      }

   }

   public void p() {
      LoginResult var1 = this.vd().getLoginResult();
      if (this.j == (1 ^ 3)) {
         if (var1.getExtraPointInt("X") < (127 & 30)) {
            this.aej.f("小成修炼尚未结束");
         } else if (var1.getExtraPointInt("D") >= (122 & 95)) {
            this.aej.f("大成修炼已经结束");
         } else if (var1.getExperience().compareTo(new BigDecimal(5000000)) < 0) {
            this.aej.f("经验不足");
         } else if (var1.getContribution().compareTo(new BigDecimal(10207 & 24060)) < 0) {
            this.aej.f("帮贡不足");
         } else if (var1.getGold().compareTo(this.cf) < 0) {
            this.aej.f("金钱不足");
         } else {
            String var3 = Agreement.getSendTextAES("rolechange", "6D");
            this.uw().d(var3);
         }
      } else {
         if (this.j == --1) {
            if (var1.getExtraPointInt("X") >= (31 & 126)) {
               this.aej.f("小成修炼已经修炼完毕");
               return;
            }

            if (var1.getExperience().compareTo(new BigDecimal(2000000)) < 0) {
               this.aej.f("经验不足");
               return;
            }

            if (var1.getContribution().compareTo(new BigDecimal(25981 & 7086)) < 0) {
               this.aej.f("帮贡不足");
               return;
            }

            if (var1.getGold().compareTo(this.cf) < 0) {
               this.aej.f("金钱不足");
               return;
            }

            String var2 = Agreement.getSendTextAES("rolechange", "6X");
            this.uw().d(var2);
         }

      }
   }

   public void s() {
      this.y(this.j);
   }

   public void y(int var1) {
      this.j = var1;
      Class544 var10000;
      if (this.j == (3 & 5)) {
         this.akq.setText("小成修炼");
         this.cf = new BigDecimal(this.uw().n(5 >> 1, 44 & 95) ? 1000000 : 2000000);
         var10000 = this;
         Class681.j(this.jc[5 >> 1], 2000000L);
         Class681.j(this.jc[--3], 300L);
         Class681.j(this.jc[--4], this.cf.longValue());
      } else {
         if (this.j == --2) {
            this.akq.setText("大成修炼");
            this.cf = new BigDecimal(this.uw().n(--2, 111 & 28) ? 2000000 : 5000000);
            Class681.j(this.jc[--2], 5000000L);
            Class681.j(this.jc[--3], 1500L);
            Class681.j(this.jc[--4], this.cf.longValue());
         }

         var10000 = this;
      }

      LoginResult var3 = var10000.vd().getLoginResult();
      int var2;
      if (this.j == 3 >> 1) {
         var2 = var3.getExtraPointInt("X");
         var10000 = this;
         this.jc[3 & 4].setText(String.valueOf(var2));
         this.jc[2 ^ 3].setText(String.valueOf((63 & 94) - var2));
      } else {
         if (this.j == (1 ^ 3)) {
            var2 = var3.getExtraPointInt("D");
            this.jc[3 & 4].setText(String.valueOf(var2));
            this.jc[3 & 5].setText(String.valueOf((95 & 122) - var2));
         }

         var10000 = this;
      }

      var10000.d();
   }

   public void d() {
      LoginResult var1 = this.vd().getLoginResult();
      this.ck[2 & 5].gh(var1.getExperience().longValue());
      this.ck[--1].gh(var1.getContribution().longValue());
      this.ck[5 >> 1].gh(var1.getGold().longValue());
   }

   public Class544(GameView var1) {
      int var10001 = --5;
      int var10009 = -4 >> 2;
      int var10011 = -4 >> 2;
      super(127 & 106, --2, Class345.aef, var1);
      this.cf = new BigDecimal(100000);
      this.j = var10011;
      this.va(var10009, 5 >> 3, 23402 & 9727, 15871 & 17211, Class345.aeo);
      this.uv(Class511.q("sc/d/1.png", 110 & 85, 110 & 85, 110 & 85, 110 & 85, (boolean)(5 >> 3)), "修炼");
      this.akq = new Class70("sc/e/26.png", 2 ^ 3, 13151 & 19965, Class681.ak, Class681.c, "小成修炼", this);
      this.akq.setBounds(1726 & 31183, 7951 & 25081, 123 & 103, 57 & 95);
      this.add(this.akq);
      Class245[] var4 = new Class245[var10001];
      boolean var10003 = true;
      this.jc = var4;
      Class556[] var5 = new Class556[--3];
      var10003 = true;
      this.ck = var5;

      int var10000;
      int var2;
      Class544 var3;
      for(var10000 = var2 = 2 & 5; var10000 < this.jc.length; var10000 = var2) {
         this.jc[var2] = Class133.a(2 & 5, 2 & 5, 2 & 5, 2 & 5, 11 & 126, Color.white, Class681.q);
         this.jc[var2].eq(Class511.q("sc/d/17.png", --3, --3, --3, --3, (boolean)(5 >> 3)));
         if (var2 == 0) {
            var3 = this;
            this.jc[var2].setBounds(2749 & 30175, 125 & 42, 61 & 110, 23 & 123);
         } else if (var2 == (3 & 5)) {
            var3 = this;
            this.jc[var2].setBounds(21789 & 11263, 106 & 61, 44, 19);
         } else if (var2 == (1 ^ 3)) {
            var3 = this;
            this.jc[var2].setBounds(170, 101, 144, 19);
         } else if (var2 == --3) {
            var3 = this;
            this.jc[var2].setBounds(170, 153, 144, 19);
         } else {
            if (var2 == --4) {
               this.jc[var2].setBounds(170, 205, 144, 19);
            }

            var3 = this;
         }

         var3.add(this.jc[var2++]);
      }

      for(var10000 = var2 = 3 ^ 3; var10000 < this.ck.length; var10000 = var2) {
         this.ck[var2] = Class133.i(10, Color.white, Class681.q, (MoneyType)null, var1);
         this.ck[var2].eq(Class511.q("sc/d/17.png", --3, --3, --3, --3, (boolean)(2 & 5)));
         if (var2 == 0) {
            var3 = this;
            this.ck[var2].setBounds(170, 127, 144, 19);
         } else if (var2 == (4 ^ 5)) {
            var3 = this;
            this.ck[var2].setBounds(170, 179, 144, 19);
         } else {
            if (var2 == 5 >> 1) {
               this.ck[var2].setBounds(170, 231, 144, 19);
            }

            var3 = this;
         }

         var3.ck[var2].ab(--2);
         this.ck[var2].setText("0");
         this.add(this.ck[var2++]);
      }

      JLabel[] var6 = new JLabel[9];
      var10003 = true;
      this.iv = var6;

      for(var10000 = var2 = 3 & 4; var10000 < this.iv.length; var10000 = var2) {
         this.iv[var2] = Class133.c(56, 101 + (var2 - --3) * 26, 120, 19, 10, Class681.c("#c000000"), Class681.ak);
         this.iv[var2].setText(var2 == 0 ? "当前修炼等级" : (var2 == --1 ? "还可修炼" : (var2 == 5 >> 1 ? "提升修炼等级所需" : (var2 == --3 ? "修炼所需经验" : (var2 == --4 ? "当前拥有经验" : (var2 == --5 ? "修炼所需帮贡" : (var2 == 6 ? "当前拥有帮贡" : (var2 == 7 ? "修炼所需金钱" : (var2 == 8 ? "当前拥有金钱" : "")))))))));
         this.add(this.iv[var2]);
         if (var2 == 0) {
            this.iv[var2].setBounds(56, 40, 102, 19);
         } else if (var2 == --1) {
            this.iv[var2].setBounds(215, 40, 72, 19);
         } else if (var2 == 2) {
            this.iv[var2].setBounds(56, 69, 138, 19);
         }

         ++var2;
      }

      this.av = new Class436();
      this.av.eq(Class511.q("sc/d/66.png", 30, --1, 30, --1, (boolean)(3 >> 2)));
      this.av.setBounds(188, 78, 150, 2);
      this.add(this.av);
   }
}
