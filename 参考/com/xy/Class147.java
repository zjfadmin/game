package com.xy;

import com.xy.game.RoleData;
import com.xy.readbean.Goodstable;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.math.BigDecimal;
import javax.swing.JLabel;

public class Class147 extends Class345 {
   private JLabel[] ai;
   private <undefinedtype>[] xp;
   private JLabel bd;
   private Class529[] xq;
   private int bn;
   private Class44[] px;
   private Class436[] g;

   public void y(int var1) {
      String var2;
      if (var1 == (12223 & 20735)) {
         var2 = Agreement.getSendTextAES("taskN", "R7=Q");
         this.uw().d(var2);
      } else {
         var2 = Agreement.getSendTextAES("taskN", "R7=T" + (var1 - (10493 & 22466)));
         this.uw().d(var2);
      }
   }

   public Class147(GameView var1) {
      int var10001 = 47 & 87;
      int var10005 = -4 >> 2;
      super(127 & 125, 5 >> 1, Class345.aef, var1);
      this.va(var10005, 2 & 5, 29623 & 3806, 29147 & 4095, Class345.aeo);
      this.uv(Class511.q("sc/d/1.png", 125 & 70, 125 & 70, 125 & 70, 125 & 70, (boolean)(3 ^ 3)), "新区冲级礼");
      Class529[] var5 = new Class529[var10001];
      boolean var10003 = true;
      this.xq = var5;

      int var2;
      Class147 var4;
      int var10000;
      for(var10000 = var2 = 2 & 5; var10000 < this.xq.length; var10000 = var2) {
         Class529[] var3 = this.xq;
         Class529 var6 = new Class529;
         String var10004 = var2 == 0 ? "sc/e/7.png" : "sc/e/31.png";
         int var10006 = (21503 & 11455) + var2;
         Font var10007 = Class681.ak;
         Color[] var10008 = Class681.c;
         String var10009;
         Class147 var10010;
         if (var2 == 0) {
            var10009 = "签到";
            var10010 = this;
         } else {
            var10009 = "领 取";
            var10010 = this;
         }

         var6.<init>(var10004, 1, var10006, var10007, var10008, var10009, var10010);
         var3[var2] = var6;
         if (var2 == 0) {
            var4 = this;
            this.xq[var2].setBounds(22326 & 10989, 111 & 63, 123 & 63, 27 & 125);
         } else {
            if (var2 >= (3 & 5) && var2 <= (6 & 127)) {
               this.xq[var2].setBounds((79 & 119) + (127 & 94) * (var2 - (5 >> 2)), 24575 & 8604, 95 & 111, 125 & 27);
            }

            var4 = this;
         }

         var4.add(this.xq[var2++]);
      }

      this.bd = new JLabel();
      this.bd.setBounds(475, 50, 30, 20);
      this.bd.setForeground(Color.red);
      this.bd.setHorizontalAlignment(3 & 4);
      this.bd.setFont(Class681.bd);
      this.bd.setOpaque((boolean)(2 & 5));
      this.add(this.bd);
      JLabel[] var7 = new JLabel[8];
      var10003 = true;
      this.ai = var7;

      for(var10000 = var2 = 5 >> 3; var10000 < this.ai.length; var10000 = var2) {
         this.ai[var2] = Class133.b(69, 45, 240, 18, Color.white, Class681.ce);
         this.ai[var2].setHorizontalAlignment(3 >> 2);
         this.ai[var2].setText(var2 == 0 ? "可通过点击数字消耗一定仙玉进行补签" : (var2 == 5 >> 2 ? "已累计签到： 天 " : (var2 == (1 ^ 3) ? "1天 " : (var2 == --3 ? "3天 " : (var2 == --4 ? "7天 " : (var2 == --5 ? "12天 " : (var2 == 6 ? "18天 " : (var2 == 7 ? "25天 " : ""))))))));
         this.add(this.ai[var2]);
         if (var2 == --1) {
            this.ai[var2].setHorizontalAlignment(10);
            this.ai[var2].setFont(Class681.bd);
            this.ai[var2].setForeground(Color.black);
            this.ai[var2].setBounds(367, 50, 173, 21);
         } else if (var2 >= (1 ^ 3) && var2 <= 7) {
            this.ai[var2].setFont(Class681.ar);
            this.ai[var2].setForeground(Color.black);
            this.ai[var2].setBounds(66 + 96 * (var2 - (5 >> 1)), 251, 87, 28);
         }

         ++var2;
      }

      <undefinedtype>[] var8 = new <undefinedtype>[30];
      var10003 = true;
      this.xp = var8;

      for(var10000 = var2 = 3 ^ 3; var10000 < this.xp.length; var10000 = var2) {
         this.xp[var2] = new MouseListener(var2) {
            private int cy;

            public void mouseReleased(MouseEvent var1) {
            }

            public void mousePressed(MouseEvent var1) {
            }

            public void mouseEntered(MouseEvent var1) {
            }

            public void mouseExited(MouseEvent var1) {
            }

            public void mouseClicked(MouseEvent var1) {
               if (this.cy >= Class147.this.bn) {
                  Class147.this.aej.f("第" + (this.cy + (2 ^ 3)) + "天还未开放补签");
               } else {
                  if ((Class147.this.vd().getTaskSystem().d(55 & 79, 1 ^ 3) >>> this.cy & --1) == 0) {
                     String var2 = Agreement.getSendTextAES("taskN", "R7=B1" + this.cy);
                     Class147.this.uw().d(var2);
                  }

               }
            }

            public {
               int var10003 = --1;
               this.cy = var2;
               this.setForeground(Color.black);
               this.setFont(Class681.y);
               this.setOpaque((boolean)var10003);
               this.addMouseListener(this);
            }
         };
         this.xp[var2].setBounds(367 + var2 % 7 * 35, 88 + var2 / 7 * 30, 35, 30);
         this.add(this.xp[var2++]);
      }

      Class436[] var9 = new Class436[11];
      var10003 = true;
      this.g = var9;

      for(var10000 = var2 = 5 >> 3; var10000 < this.g.length; var10000 = var2) {
         this.g[var2] = new Class436();
         this.add(this.g[var2]);
         if (var2 == 0) {
            var10000 = var2;
            this.g[var2].eq(Class511.q("sc/d/60.png", 76, --2, 76, 1 ^ 3, (boolean)(5 >> 3)));
            this.g[var2].setBounds(365, 78, 248, 7);
         } else if (var2 == (4 ^ 5)) {
            var10000 = var2;
            this.g[var2].eq(Class511.q("sc/d/33.png", 30, 30, 30, 30, (boolean)(3 >> 2)));
            this.g[var2].setBounds(354, 39, 272, 204);
         } else if (var2 == (1 ^ 3)) {
            var10000 = var2;
            this.g[var2].eq(Class511.q("sc/d/74.png", 16, 16, 30, 30, (boolean)(5 >> 3)));
            this.g[var2].setBounds(56, 32, 575, 216);
         } else {
            if (var2 == --3) {
               this.g[var2].eq(Class511.q("sc/d/24.png", 565, 206, --2, --2, (boolean)(3 >> 2)));
               this.g[var2].setBounds(59, 35, 569, 210);
            }

            var10000 = var2;
         }

         if (var10000 >= 4 && var2 <= 10) {
            this.g[var2].eq(Class511.q("sc/d/45.png", 5 >> 1, 76, 5 >> 1, 76, (boolean)(2 & 5)));
            this.g[var2].setBounds(59 + 94 * (var2 - --4), 251, 7, 191);
         }

         ++var2;
      }

      Class44[] var10 = new Class44[30];
      var10003 = true;
      this.px = var10;

      for(var10000 = var2 = 3 ^ 3; var10000 < this.px.length; var10000 = var2) {
         this.px[var2] = new Class44(this);
         this.px[var2].ad(Class44.arf);
         this.px[var2].eq(Class511.q("sc/d/24.png", --2, --2, --2, --2, false));
         if (var2 < 5) {
            var4 = this;
            this.px[var2].setBounds(70 + 41 * ((var2 - 0) % 2), 282 + 41 * ((var2 - 0) / 2), 39, 39);
         } else if (var2 < 10) {
            var4 = this;
            this.px[var2].setBounds(164 + 41 * ((var2 - 5) % 2), 282 + 41 * ((var2 - 5) / 2), 39, 39);
         } else if (var2 < 15) {
            var4 = this;
            this.px[var2].setBounds(258 + 41 * ((var2 - 10) % 2), 282 + 41 * ((var2 - 10) / 2), 39, 39);
         } else if (var2 < 20) {
            var4 = this;
            this.px[var2].setBounds(352 + 41 * ((var2 - 15) % 2), 282 + 41 * ((var2 - 15) / 2), 39, 39);
         } else if (var2 < 25) {
            var4 = this;
            this.px[var2].setBounds(446 + 41 * ((var2 - 20) % 2), 282 + 41 * ((var2 - 20) / 2), 39, 39);
         } else {
            if (var2 < 30) {
               this.px[var2].setBounds(540 + 41 * ((var2 - 25) % 2), 282 + 41 * ((var2 - 25) / 2), 39, 39);
            }

            var4 = this;
         }

         var4.add(this.px[var2++]);
      }

   }

   public void d() {
      this.bn += 4 ^ 5;
      if (this.bn >= (127 & 30)) {
         this.bn = 3 & 4;
      }

      this.f((String)null);
   }

   public void f(String var1) {
      if (var1 != null) {
         this.bn = Integer.parseInt(var1);
      }

      Class603 var11 = this.vc();
      RoleData var5 = this.vd();
      int var13 = var5.getTaskSystem().d(111 & 23, 5 >> 2);
      int var6 = var5.getTaskSystem().d(55 & 79, --2);
      String[] var4 = var11.w().getTotals();

      int var2;
      int var10000;
      for(var10000 = var2 = 3 ^ 3; var10000 < 6; var10000 = var2) {
         String var3 = var4 != null && var2 < var4.length ? var4[var2] : null;
         String[] var7 = var3 != null && !var3.equals("") ? var3.split("\\|") : null;

         int var8;
         for(var10000 = var8 = 5 >> 3; var10000 < 5; var10000 = var8) {
            String var9 = var7 != null && var8 < var7.length ? var7[var8] : null;
            Goodstable var10 = var9 != null ? var11.n(new BigDecimal(var9)) : null;
            if (var10 != null) {
               this.px[var2 * --5 + var8].c(5 >> 2, var10);
            } else {
               this.px[var2 * --5 + var8].c(3 ^ 3, (Object)null);
               this.px[var2 * --5 + var8].setVisible((boolean)(3 >> 1));
            }

            ++var8;
         }

         if ((var13 >>> var2 & 5 >> 2) == 0) {
            this.xq[(4 ^ 5) + var2].setText("领 取");
            this.xq[(2 ^ 3) + var2].setBtn(3 & 5, "sc/e/31.png");
         } else {
            this.xq[(2 ^ 3) + var2].setText("已领取");
            this.xq[--1 + var2].setBtn(-4 >> 2, "sc/e/58.png");
         }

         ++var2;
      }

      var2 = 3 >> 2;

      int var12;
      for(var10000 = var12 = 3 >> 2; var10000 < 30; var10000 = var12) {
         if ((var6 >>> var12 & 3 & 5) == 5 >> 2) {
            ++var2;
            this.xp[var12].setBackground(Class681.cc);
         } else {
            this.xp[var12].setBackground(Class681.cu);
         }

         ++var12;
      }

      this.bd.setText(String.valueOf(var2));
      this.xq[3 & 4].setVisible((boolean)((var6 >>> this.bn & 3 >> 1) == 0 ? 3 & 5 : 0));
      this.ve().a(this.ae());
   }
}
