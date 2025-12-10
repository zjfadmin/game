package com.xy;

import com.xy.text.GameView;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JLabel;

public class Class632 extends Class345 {
   private Class322 vo;
   private Class436[] be;
   private JLabel[] ad;
   private <undefinedtype>[] aod;
   private int m;

   public void as(int var1) {
      if (var1 == (19263 & 13817)) {
         long var2 = 0L;

         for(int var10000 = var1 = 5 >> 3; var10000 < this.aod.length; var10000 = var1) {
            if (this.aod[var1].lc) {
               var2 |= (long)(5 >> 2 << var1);
            }

            ++var1;
         }

         Class632 var4;
         if (this.m == --1 && this.aej.systemData.chatUp != var2) {
            var4 = this;
            this.aej.systemData.chatUp = var2;
            this.aej.systemData.i();
         } else {
            if (this.m == --2 && this.aej.systemData.chatDown != var2) {
               this.aej.systemData.chatDown = var2;
               this.aej.systemData.i();
            }

            var4 = this;
         }

         var4.ve().n(this.ae());
      }

   }

   public Class632(GameView var1) {
      int var10001 = 111 & 23;
      int var10006 = -4 >> 2;
      super(29919 & 3006, --2, Class345.aef, var1);
      this.va(var10006, 5 >> 3, 32703 & 366, 2943 & 30144, Class345.aeo);
      this.uv(Class511.q("sc/d/1.png", 100 & 95, 100 & 95, 100 & 95, 100 & 95, (boolean)(3 & 4)), "频道筛选");
      this.ad(new Class116(79 & 62, 3 & 4, 3 & 4, 39 & 123));
      JLabel[] var4 = new JLabel[var10001];
      boolean var10003 = true;
      this.ad = var4;

      int var10000;
      int var2;
      for(var10000 = var2 = 2 & 5; var10000 < this.ad.length; var10000 = var2) {
         this.ad[var2] = Class133.b(63 & 121, 119 & 31, 10728 & 22239, 127 & 19, Color.black, Class681.ak);
         this.ad[var2].setText(var2 == 0 ? "请勾选要显示的频道信息" : (var2 == --1 ? "当前" : (var2 == 5 >> 1 ? "队伍" : (var2 == --3 ? "世界" : (var2 == --4 ? "帮派" : (var2 == --5 ? "战斗" : (var2 == (70 & 63) ? "信息" : "")))))));
         this.ad[var2].setHorizontalAlignment(58 & 79);
         this.add(this.ad[var2]);
         if (var2 == 0) {
            this.ad[var2].setHorizontalAlignment(3 ^ 3);
         } else if (var2 >= 5 >> 2 && var2 <= (94 & 43)) {
            this.ad[var2].setBounds((103 & 127) + (var2 - (5 >> 2)) % (5 >> 1) * (119 & 107), 64 + (var2 - --1) / --2 * 27, 36, 17);
         }

         ++var2;
      }

      this.vo = new Class322("sc/e/26.png", 2 ^ 3, 313, Class681.ak, Class681.c, "保存设置", this);
      this.vo.setBounds(111, 225, 99, 25);
      this.add(this.vo);
      Class436[] var5 = new Class436[8];
      var10003 = true;
      this.be = var5;

      for(var10000 = var2 = 3 & 4; var10000 < this.be.length; var10000 = var2) {
         this.be[var2] = new Class436();
         Class632 var3;
         if (var2 != 0 && var2 != (4 ^ 5)) {
            if (var2 >= 5 >> 1 && var2 <= 7) {
               this.be[var2].fw("sc/e/29.png");
               this.be[var2].setBounds(85 + (var2 - (1 ^ 3)) % (1 ^ 3) * 99, 64 + (var2 - (5 >> 1)) / (1 ^ 3) * 27, 17, 17);
            }

            var3 = this;
         } else {
            var3 = this;
            this.be[var2].eq(Class511.q("sc/d/66.png", 50, --1, 50, 5 >> 2, (boolean)(3 >> 2)));
            this.be[var2].setBounds(49, 45 + 163 * var2, 220, 1 ^ 3);
         }

         var3.add(this.be[var2++]);
      }

      <undefinedtype>[] var6 = new <undefinedtype>[6];
      var10003 = true;
      this.aod = var6;

      for(var10000 = var2 = 5 >> 3; var10000 < this.aod.length; var10000 = var2) {
         this.aod[var2] = new MouseListener(var2) {
            private boolean lc;
            private int m;

            public {
               this.m = var2;
            }

            public void ak(boolean var1) {
               this.lc = var1;
               Class632.this.be[(1 ^ 3) + this.m].fw(var1 ? "sc/e/30.png" : "sc/e/29.png");
            }

            public void mouseExited(MouseEvent var1) {
            }

            public void mousePressed(MouseEvent var1) {
            }

            public void mouseClicked(MouseEvent var1) {
               this.ak((boolean)(this.lc ? 3 & 4 : 1));
            }

            public void mouseEntered(MouseEvent var1) {
            }

            public void mouseReleased(MouseEvent var1) {
            }
         };
         this.be[(5 >> 1) + var2].addMouseListener(this.aod[var2++]);
      }

   }

   public void y(int var1) {
      long var2 = (this.m = var1) == --1 ? this.aej.systemData.chatUp : (var1 == 5 >> 1 ? this.aej.systemData.chatDown : 0L);

      for(int var10000 = var1 = 3 & 4; var10000 < this.aod.length; var10000 = var1) {
         this.aod[var1].ak((boolean)((var2 >> var1 & 1L) == 1L ? 5 >> 2 : 0));
         ++var1;
      }

      if (this.ve().m(this.ae()) == null) {
         this.ve().a(this.ae());
      }

   }
}
