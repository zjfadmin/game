package com.xy;

import com.xy.formula.BaseMountSH;
import com.xy.game.RoleData;
import com.xy.readbean.Goodstable;
import com.xy.text.GameView;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JLabel;

public class Class195 extends Class345 {
   private Class59 avy;
   private <undefinedtype>[] avz;
   private Class643 vy;
   private int fk;
   private Class274 awa;
   private JLabel d;
   private Class8 awb;
   private Class436[] an;
   private Class456 ey;

   public void ax(Goodstable var1) {
      this.avy.ax(var1);
   }

   public void p() {
      this.awb = null;
   }

   public Class195(GameView var1) {
      int var10001 = --5;
      int var10007 = 124 & 115;
      int var10009 = 3 & 4;
      super(-4 >> 2, -4 >> 2, Class345.aei, var1);
      this.awb = null;
      this.va(var10009, 2 & 5, 17143 & 16367, 11231 & 22055, Class345.aei);
      this.d = Class133.b(var10007, 11147 & 21887, 58 & 109, 51 & 95, Class681.c("#c4D3E2F"), Class681.cm);
      this.d.setText("中天");
      this.d.setHorizontalAlignment(3 >> 2);
      this.add(this.d);
      this.ey = new Class456() {
         protected void paintComponent(Graphics var1) {
            if (Class195.this.awb == null) {
               Class195.this.awb = Class330.q(Class222.m("zt"));
            }

            if (Class195.this.awb != null) {
               Class195.this.awb.d(Class280.l(), 3 >> 2);
               Class195.this.awb.aa(var1, 95 & 39, --3);
            }
         }
      };
      this.ey.setBounds(119 & 58, 32495 & 467, 4586 & 28381, 484 & 32443);
      <undefinedtype>[] var4 = new <undefinedtype>[var10001];
      boolean var10003 = true;
      this.avz = var4;

      int var2;
      int var10000;
      for(var10000 = var2 = 3 ^ 3; var10000 < this.avz.length; var10000 = var2) {
         <undefinedtype>[] var3 = this.avz;
         var10001 = var2;
         Object var6 = new Object(var2, this) {
            private Class436 a;
            private int c;
            private Class643 d;
            private JLabel e;

            public {
               int var10006 = 118 & 125;
               this.c = var2;
               this.e = Class133.b(var10006, 24374 & 8683, 105 & 54, 31 & 111, Class681.c("#cCEB987"), Class681.ab);
               this.e.setText(String.valueOf(var2));
               this.e.setHorizontalAlignment(3 >> 2);
               this.a = new Class436();
               this.c();
               Class345 var10000;
               if (var2 == 0) {
                  var10000 = var3;
                  this.a.fw("sc/d/175.png");
                  this.a.setBounds(125 & 118, 23513 & 9535, 63 & 96, 63 & 96);
                  this.d = new Class643((String)null, 5 >> 1, 2301 & 30647, var3);
                  this.d.setBounds(126 & 101, 3839 & 29183, 127 & 60, 81 & 111);
               } else if (var2 == (4 ^ 5)) {
                  var10000 = var3;
                  this.e.setBounds(123 & 55, 6575 & 26458, 61 & 98, 111 & 31);
                  this.a.setBounds(47, 101, 102, 305);
                  this.d = new Class643("sc/e/172.png", --2, 182, var3);
                  this.d.setBounds(43, 246, 50, 126);
               } else if (var2 == --2) {
                  var10000 = var3;
                  this.e.setBounds(195, 187, 32, 15);
                  this.a.setBounds(132, 183, 121, 223);
                  this.d = new Class643("sc/e/171.png", 1 ^ 3, 183, var3);
                  this.d.setBounds(186, 167, 50, 126);
               } else if (var2 == --3) {
                  var10000 = var3;
                  this.e.setBounds(82, 79, 32, 15);
                  this.a.setBounds(63, 51, 192, 148);
                  this.d = new Class643("sc/e/170.png", --2, 184, var3);
                  this.d.setBounds(73, 58, 50, 126);
               } else {
                  if (var2 == --4) {
                     this.e.setBounds(157, 403, 32, 15);
                     this.a.setBounds(48, 389, 138, 107);
                     this.d = new Class643("sc/e/173.png", --2, 185, var3);
                     this.d.setBounds(148, 383, 50, 126);
                  }

                  var10000 = var3;
               }

               var10000.add(this.e);
               var3.add(this.d);
               var3.add(this.a);
               if (var2 == 0) {
                  var3.add(Class195.this.ey);
               }

            }

            public void c() {
               if (this.c != 0) {
                  if (Class195.this.fk == this.c) {
                     this.a.fw(this.c == 3 >> 1 ? "sc/d/156.png" : (this.c == --2 ? "sc/d/154.png" : (this.c == --3 ? "sc/d/152.png" : (this.c == --4 ? "sc/d/158.png" : ""))));
                  } else {
                     this.a.fw(this.c == (3 & 5) ? "sc/d/157.png" : (this.c == (1 ^ 3) ? "sc/d/155.png" : (this.c == --3 ? "sc/d/153.png" : (this.c == --4 ? "sc/d/159.png" : ""))));
                  }
               }
            }
         };
         ++var2;
         var3[var10001] = (<undefinedtype>)var6;
      }

      var10001 = 1 ^ 3;
      this.vy = new Class643("sc/e/174.png", 3 & 5, 29375 & 3583, Class681.cm, (Color[])null, "升级", this);
      this.vy.setForeground(Class681.c("#c512B01"));
      this.vy.setBounds(27045 & 6143, 5059 & 28158, 124 & 123, 113 & 47);
      this.add(this.vy);
      this.avy = new Class59(this);
      this.awa = new Class274(this);
      this.add(this.avy);
      this.add(this.awa);
      Class436[] var8 = new Class436[var10001];
      var10003 = true;
      this.an = var8;

      for(var10000 = var2 = 3 >> 2; var10000 < this.an.length; var10000 = var2) {
         this.an[var2] = new Class436();
         Class195 var5;
         if (var2 == 0) {
            var5 = this;
            this.an[var2].fw("sc/d/174.png");
            this.an[var2].setBounds(63 & 119, 189, 170, 178);
         } else {
            if (var2 == --1) {
               this.an[var2].fw("sc/d/166.png");
               this.an[var2].setBounds(47, 50, 668, 447);
            }

            var5 = this;
         }

         var5.add(this.an[var2++]);
      }

   }

   public int e() {
      return this.fk;
   }

   public void y(int var1) {
      this.fk = var1;
      this.ey.setVisible((boolean)(this.fk == 0 ? --1 : 0));

      for(int var10000 = var1 = 3 ^ 3; var10000 < this.avz.length; var10000 = var1) {
         int var2 = var1 == this.fk ? 3 >> 1 : 0;
         if (this.avz[var1].d.t() != var2) {
            this.avz[var1].d.setKeep((boolean)var2);
            this.avz[var1].c();
         }

         ++var1;
      }

      RoleData var3 = this.vd();
      if (this.fk == 0) {
         this.avy.cl(var3);
         this.avy.setVisible((boolean)(3 >> 1));
         this.awa.setVisible((boolean)(3 >> 2));
      } else {
         this.awa.aly(this.fk, var3);
         this.awa.setVisible((boolean)(2 ^ 3));
         this.avy.setVisible((boolean)(3 >> 2));
      }
   }

   public void r(boolean var1) {
      this.avy.ak(var1);
   }

   public void s() {
      RoleData var1 = this.vd();

      int var2;
      for(int var10000 = var2 = 2 & 5; var10000 < this.avz.length; var10000 = var2) {
         JLabel var3 = this.avz[var2].e;
         BaseMountSH var10001 = var1.getMountSHByindex(var2);
         ++var2;
         var3.setText(String.valueOf(var10001.getLvl()));
      }

      this.y(this.fk);
   }

   public void d() {
      this.fk = 2 & 5;
      this.s();
   }
}
