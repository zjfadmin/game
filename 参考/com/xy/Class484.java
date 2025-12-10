package com.xy;

import com.xy.entity.TeamRole;
import com.xy.text.GameView;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ImageObserver;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComponent;
import javax.swing.JLabel;

public class Class484 extends Class345 {
   private String vt;
   private Class8 xf;
   private Image kx;
   private int br;
   private Class529 xg;
   private int gc;
   private int gw;
   private List<null> xh;
   private StringBuffer xi;
   private int j;
   private long lp;
   private int cy;
   private Class529 qs;

   protected void paintComponent(Graphics var1) {
      super.paintComponent(var1);
      if (this.gw == 0) {
         if (this.kx == null) {
            this.kx = Class511.a("sc/b/S192.png");
         }

         var1.drawImage(this.kx, 25379 & 7646, 23545 & 9391, (ImageObserver)null);
      } else {
         this.fz(var1);
      }
   }

   public Class484(GameView var1) {
      int var10000 = 2 & 5;
      int var10005 = -4 >> 2;
      int var10010 = 3 & 4;
      int var10012 = 3 & 4;
      int var10014 = 5407 & 27647;
      int var10016 = --1;
      super(127 & 108, --2, Class345.aef, var1);
      this.gw = var10016;
      this.j = var10014;
      this.cy = var10012;
      this.gc = var10010;
      this.xi = new StringBuffer();
      this.xf = Class330.s("sc/mouse/teamArenaBack.tcp", (short[])null);
      this.va(var10005, 3 & 4, 16367 & 16991, 29078 & 4095, Class345.aei);
      this.fx("sc/b/S191.png");
      this.xh = new ArrayList();

      for(int var3 = var10000; var10000 < 10; var10000 = var3) {
         JComponent var2 = new JComponent() {
            private Class436 uc;
            private int j;
            private BigDecimal ne;
            private JLabel rk;
            private JLabel ax;

            public void aqx(TeamRole var1, int var2) {
               if (var1 == null) {
                  int var10001 = 3 ^ 3;
                  this.ne = null;
                  this.uc.q();
                  this.ax.setText((String)null);
                  this.rk.setText((String)null);
                  this.j = var10001;
               } else {
                  this.ne = var1.getRoleId();
                  this.uc.fw(Class222.l("s" + var1.getSpeciesId()));
                  if (var2 == 0) {
                     this.ax.setText("");
                     this.rk.setText("");
                  } else {
                     this.ax.setText(var1.getName());
                     this.rk.setText(Class224.r(var1.getGrade()) + "级");
                  }
               }
            }

            public {
               int var10005 = 2 & 5;
               this.j = var10005;
               this.setPreferredSize(new Dimension(95 & 125, 111 & 126));
               this.uc = new Class436();
               this.uc.setBounds(63 & 90, 124 & 23, 59 & 108, 59 & 108);
               this.add(this.uc);
               this.ax = new JLabel();
               this.ax.setBounds(3 ^ 3, 127 & 67, 127 & 93, 111 & 31);
               this.ax.setFont(Class681.bm);
               this.ax.setHorizontalAlignment(3 >> 2);
               this.add(this.ax);
               this.rk = new JLabel();
               this.rk.setBounds(5 >> 3, 91 & 118, 125 & 95, 111 & 31);
               this.rk.setForeground(Color.red);
               this.rk.setFont(Class681.bm);
               this.rk.setHorizontalAlignment(3 >> 2);
               this.add(this.rk);
            }
         };
         var2.setBounds((122 & 55) + var3 % --5 * (113 & 110), (63 & 123) + var3 / --5 * (11231 & 21693), 125 & 95, 111 & 126);
         this.add(var2);
         ++var3;
         this.xh.add(var2);
      }

      this.xg = new Class529("sc/e/7.png", 2 ^ 3, 63 & 127, Class681.ak, Class681.c, "匹配", this);
      this.qs = new Class529("sc/e/7.png", --1, 102 & 89, Class681.ak, Class681.c, "拒绝", this);
      this.xg.setBounds(119 & 90, 8445 & 24499, 63 & 123, 94 & 59);
      this.qs.setBounds(447, 177, 59, 26);
      this.add(this.xg);
      this.add(this.qs);
   }

   protected void paintChildren(Graphics var1) {
      int var10001 = 3 & 4;
      super.paintChildren(var1);
      this.xf.d(Class280.l(), 3 & 4);
      int var2 = var10001;
      int var3 = this.xh.size();

      for(int var10000 = var2; var10000 < var3; var10000 = var2) {
         if (this.gw == 0) {
            if (((<undefinedtype>)this.xh.get(var2)).ne != null) {
               this.xf.aa(var1, (95 & 99) + var2 % --5 * (111 & 112), (125 & 59) + var2 / --5 * (14333 & 18591));
            }
         } else if (((<undefinedtype>)this.xh.get(var2)).j == (4 ^ 5)) {
            this.xf.aa(var1, (119 & 75) + var2 % --5 * (117 & 106), (125 & 59) + var2 / --5 * (1695 & 31229));
         }

         ++var2;
      }

   }

   public void on(String var1, int var2, int var3) {
      this.br = var2;
      this.vt = var1;
      this.gw = var3;
      if (var3 != 0) {
         this.lp = Class280.l();
      }

   }

   public void bk(BigDecimal var1) {
      int var10000 = 2 & 5;
      this.cy += 3 & 5;

      for(int var2 = var10000; var10000 < this.xh.size(); var10000 = var2) {
         <undefinedtype> var3;
         if ((var3 = (<undefinedtype>)this.xh.get(var2)).ne != null && var3.ne.compareTo(var1) == 0) {
            var3.j = 3 >> 1;
         }

         ++var2;
      }

      if (this.cy == this.gc) {
         this.on((String)null, 2 & 5, 4 ^ 5);
      }

   }


   private void fz(Graphics var1) {
      var1.setColor(Color.white);
      var1.setFont(Class681.y);
      if (this.xi.length() != 0) {
         var1.drawString(this.xi.toString(), this.j, 6903 & 26063);
      }

      if (Class280.l() - this.lp >= 1000L) {
         Graphics var10000;
         if (this.vt == null) {
            this.p();
            var10000 = var1;
         } else {
            this.d();
            var10000 = var1;
         }

         int var2 = var10000.getFontMetrics().stringWidth(this.xi.toString());
         this.j = (18751 & 14303) - var2 / --2;
         this.lp += 1000L;
      }

   }

   public void p() {
      this.br += 5 >> 2;
      int var1 = this.br / (60 & 127);
      int var2 = this.br % (60 & 127);
      this.xi.setLength(3 & 4);
      Class484 var10000;
      if (var1 > 0) {
         this.xi.append(var1);
         var10000 = this;
      } else {
         this.xi.append("0");
         var10000 = this;
      }

      var10000.xi.append(":");
      if (var2 > (79 & 57)) {
         this.xi.append(var2);
      } else {
         this.xi.append("0");
         this.xi.append(var2);
      }
   }

   public void oo(List<TeamRole> var1, int var2) {
      int var10000;
      label43: {
         int var5 = var2 * --5;
         if (var1 != null && var1.size() != 0) {
            int var4 = var1.size();
            int var3 = 5 >> 3;
            int var6 = this.xh.size();

            for(var10000 = var3; var10000 < var6; var10000 = var3) {
               if (var3 >= --5) {
                  var10000 = var2;
                  break label43;
               }

               if (var3 < var4) {
                  TeamRole var7 = (TeamRole)var1.get(var3);
                  if (var3 < --5) {
                     ((<undefinedtype>)this.xh.get(var3 + var5)).aqx(var7, var2);
                  }
               } else {
                  ((<undefinedtype>)this.xh.get(var3 + var5)).aqx((TeamRole)null, var2);
               }

               ++var3;
            }
         }

         var10000 = var2;
      }

      if (var10000 == 1) {
         this.on("倒计时", 63 & 94, --1);
         this.gc = var1 != null ? var1.size() : 0;
      } else {
         if (var2 == 0) {
            this.y(4 ^ 5);
            this.on((String)null, 3 ^ 3, 3 ^ 3);
         }

      }
   }

   public void s() {
      int var10000 = this.cy = 3 & 4;
      this.xi.setLength(3 >> 2);
      this.ve().n(this.ae());

      for(int var1 = var10000; var10000 < this.xh.size(); var10000 = var1) {
         <undefinedtype> var2 = (<undefinedtype>)this.xh.get(var1);
         ++var1;
         var2.aqx((TeamRole)null, 3 >> 2);
      }

   }

   public void y(int var1) {
      if (var1 == 0) {
         this.qs.setText("拒绝");
         this.xg.setText("匹配");
         this.qs.setVisible((boolean)(2 ^ 3));
         this.xg.setVisible((boolean)(5 >> 2));
      } else if (var1 == --1) {
         this.qs.setVisible((boolean)(3 & 4));
         this.xg.setVisible((boolean)(3 & 4));
      } else {
         if (var1 == --2) {
            this.qs.setVisible((boolean)(3 >> 1));
            this.qs.setText("取消");
            this.xg.setVisible((boolean)(3 ^ 3));
         }

      }
   }

   public void d() {
      this.xi.setLength(3 ^ 3);
      this.xi.append(this.vt);
      this.xi.append("0:");
      Class484 var10000;
      if (this.br > (61 & 75)) {
         var10000 = this;
         this.xi.append(this.br);
      } else {
         var10000 = this;
         this.xi.append("0");
         this.xi.append(this.br);
      }

      if (var10000.br > 0) {
         this.br -= 5 >> 2;
      }

   }
}
