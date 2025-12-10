package com.xy;

import com.xy.formula.BaseMountSH;
import com.xy.formula.BaseValue;
import com.xy.game.RoleData;
import com.xy.readbean.Goodstable;
import com.xy.readbean.MoneyType;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Class172 extends Class345 {
   private Class436 et;
   private Class245[] jc;
   private int j;
   private <undefinedtype> pk;
   private JLabel[] ly;
   private <undefinedtype> pl;

   public void z(long var1, JTextField var3) {
      Class681.j(this.pl.abf, this.pl.afh * var1);
   }

   public Class172(GameView var1) {
      int var10001 = --4;
      int var10006 = -4 >> 2;
      super(10238 & 22703, 5 >> 1, Class345.aef, var1);
      this.va(var10006, 2 & 5, 2047 & 31062, 9206 & 23947, Class345.aeo);
      this.uv(Class511.q("sc/d/1.png", 125 & 70, 125 & 70, 125 & 70, 125 & 70, (boolean)(3 & 4)), "提升守护之力");
      this.ad(new Class116(63 & 78, 2 & 5, 2 & 5, 60 & 111));
      JLabel[] var3 = new JLabel[var10001];
      boolean var10003 = true;
      this.ly = var3;

      int var10000;
      int var2;
      for(var10000 = var2 = 3 >> 2; var10000 < this.ly.length; var10000 = var2) {
         this.ly[var2] = Class133.b(87 & 105, (47 & 124) + (90 & 63) * var2, 125 & 74, 127 & 19, Color.black, Class681.ak);
         this.ly[var2].setText(var2 == 0 ? "守护之力" : (var2 == (4 ^ 5) ? "等级" : (var2 == 5 >> 1 ? "修为点" : "")));
         this.ly[var2].setHorizontalAlignment(27 & 110);
         if (var2 == --3) {
            this.ly[var2].setBounds(75 & 117, 4812 & 28095, 20951 & 11946, 83 & 63);
         }

         this.add(this.ly[var2++]);
      }

      Class245[] var4 = new Class245[--3];
      var10003 = true;
      this.jc = var4;

      for(var10000 = var2 = 3 >> 2; var10000 < this.jc.length; var10000 = var2) {
         this.jc[var2] = Class133.a(138, 44 + var2 * 26, 134, 19, 3 >> 2, Color.white, Class681.q);
         this.jc[var2].eq(Class511.q("sc/d/17.png", 6, 6, 6, 6, (boolean)(3 ^ 3)));
         this.add(this.jc[var2++]);
      }

      this.pl = new Class456() {
         private long afh;
         private Class217 mm;
         private Class556 aet;
         private Class319 avo;
         private MoneyType akn;
         private Class643[] acs;
         private JLabel[] ly;
         private Class245 abf;

         public {
            int var10001 = --3;
            this.afh = 0L;
            JLabel[] var4 = new JLabel[var10001];
            boolean var10003 = true;
            this.ly = var4;

            int var2;
            int var10000;
            for(var10000 = var2 = 3 ^ 3; var10000 < this.ly.length; var10000 = var2) {
               this.ly[var2] = Class133.b(2 & 5, (2 & 5) + var2 * (95 & 63), 91 & 108, 83 & 63, Color.black, Class681.ak);
               this.ly[var2].setText(var2 == 0 ? "所需金钱" : (var2 == (2 ^ 3) ? "当前金钱" : (var2 == (1 ^ 3) ? "提升点数" : "")));
               this.ly[var2].setHorizontalAlignment(14 & 123);
               this.add(this.ly[var2++]);
            }

            var10001 = --2;
            int var10012 = 93 & 107;
            int var10014 = 93 & 107;
            this.akn = new MoneyType();
            this.akn.setIdAndKey(4 ^ 5, "金 钱");
            this.abf = Class133.a(var10014, 3 & 4, 20895 & 12006, 55 & 91, 3 & 4, Color.white, Class681.q);
            this.aet = Class133.m(var10012, 31 & 127, 13287 & 19614, 127 & 19, 3 & 4, Color.white, Class681.q, this.akn, Class172.this.aej);
            this.mm = Class133.n(Class511.q("sc/d/17.png", 78 & 55, 78 & 55, 78 & 55, 78 & 55, (boolean)(3 ^ 3)), Class681.q, Color.white);
            this.mm.setHorizontalAlignment(2 & 5);
            this.mm.setBounds(127 & 73, 63 & 126, 20926 & 11975, 51 & 95);
            this.abf.eq(Class511.q("sc/d/17.png", 70 & 63, 70 & 63, 70 & 63, 70 & 63, (boolean)(5 >> 3)));
            this.aet.eq(Class511.q("sc/d/17.png", 6, 6, 6, 6, (boolean)(3 >> 2)));
            this.avo = new Class319(15, this.mm, Class172.this.gk());
            this.add(this.abf);
            this.add(this.aet);
            this.add(this.mm);
            Class643[] var6 = new Class643[var10001];
            var10003 = true;
            this.acs = var6;

            for(var10000 = var2 = 3 >> 2; var10000 < this.acs.length; var10000 = var2) {
               Class643[] var3 = this.acs;
               Class643 var7 = new Class643;
               int var10005 = 4 ^ 5;
               int var10006 = 211 + var2;
               Font var10007 = Class681.ak;
               String var10009;
               Class172 var10010;
               if (var2 == 0) {
                  var10009 = "提升修为点";
                  var10010 = Class172.this;
               } else if (var2 == --1) {
                  var10009 = "一键提升";
                  var10010 = Class172.this;
               } else {
                  var10009 = "";
                  var10010 = Class172.this;
               }

               var3[var2] = var7;
               this.acs[var2].setForeground(Color.black);
               <undefinedtype> var5;
               if (var2 == 0) {
                  var5 = this;
                  this.acs[var2].setBounds(127, 108, 119, 25);
               } else {
                  if (var2 == 3 >> 1) {
                     this.acs[var2].setBounds(3 ^ 3, 108, 119, 25);
                  }

                  var5 = this;
               }

               var5.add(this.acs[var2++]);
            }

         }

         public void agf(BaseMountSH var1) {
            this.afh = BaseValue.getSHMoney(var1.getLvl());
            this.aet.cc();
            this.mm.setText(String.valueOf(4 ^ 5));
         }
      };
      this.pk = new Class456() {
         private Class556 abn;
         private Class245 eu;
         private long amd;
         private Class643 fm;
         private JLabel[] ly;
         private MoneyType yn;

         public {
            int var10001 = --2;
            JLabel[] var3 = new JLabel[var10001];
            boolean var10003 = true;
            this.ly = var3;

            int var2;
            for(int var10000 = var2 = 5 >> 3; var10000 < this.ly.length; var10000 = var2) {
               this.ly[var2] = Class133.b(5 >> 3, (5 >> 3) + var2 * (95 & 63), 94 & 123, 59 & 87, Color.black, Class681.ak);
               this.ly[var2].setText(var2 == 0 ? "所需灵元晶" : (var2 == (2 ^ 3) ? "当前灵元晶" : ""));
               this.ly[var2].setHorizontalAlignment(78 & 59);
               this.add(this.ly[var2++]);
            }

            int var10005 = 127 & 91;
            int var10007 = 123 & 95;
            this.yn = new MoneyType();
            this.yn.setIdAndMax(-3 & -2, 107L);
            this.eu = Class133.a(var10007, 2 & 5, 119 & 124, 55 & 91, 2 & 5, Color.white, Class681.q);
            this.abn = Class133.m(var10005, 127 & 31, 118 & 125, 95 & 51, 2 & 5, Color.white, Class681.q, this.yn, Class172.this.aej);
            this.eu.eq(Class511.q("sc/d/17.png", 70 & 63, 70 & 63, 70 & 63, 70 & 63, (boolean)(3 & 4)));
            this.abn.eq(Class511.q("sc/d/17.png", 86 & 47, 86 & 47, 86 & 47, 86 & 47, (boolean)(3 ^ 3)));
            this.add(this.eu);
            this.add(this.abn);
            this.fm = new Class643("sc/e/7.png", 4 ^ 5, 28637 & 4343, Class681.ak, (Color[])null, "突破", Class172.this.gk());
            this.fm.setForeground(Color.black);
            this.fm.setBounds(124 & 91, 108, 59, 25);
            this.add(this.fm);
         }

         public void agf(BaseMountSH var1) {
            this.abn.cc();
            this.amd = (long)var1.getLYJTotal();
            Class681.j(this.eu, this.amd);
         }
      };
      this.pl.setBounds(65, 175, 250, 135);
      this.pk.setBounds(65, 175, 250, 135);
      this.add(this.pl);
      this.add(this.pk);
      this.et = new Class436();
      this.et.eq(Class511.q("sc/d/66.png", 100, --1, 100, 4 ^ 5, (boolean)(3 >> 2)));
      this.et.setBounds(65, 163, 241, --2);
      this.add(this.et);
   }

   public void as(int var1) {
      RoleData var2;
      BaseMountSH var3 = (var2 = this.vd()).getMountSHByindex(this.j);
      if (var1 != (22747 & 10231) && var1 != (3295 & 29684)) {
         if (var1 == (19191 & 13789)) {
            Goodstable var8;
            if ((var8 = var2.az(107L)) == null || this.pk.amd > (long)var8.getUsetime()) {
               this.aej.f("没有足够的灵元晶");
               return;
            }

            String var5 = Agreement.getSendTextAES("usermount", "SHTP" + var3.getId() + "|" + var8.getRgid());
            this.aej.getClient().d(var5);
         }

      } else {
         long var4 = (long)var3.getExpTotal();
         long var6 = var1 == (19191 & 13787) ? this.pl.avo.gl() : var4 - (long)var3.getExp();
         if (var6 <= 0L) {
            this.aej.f("提升修为点数不能为0");
         } else if (var2.getMoney(this.pl.akn) < var6 * this.pl.afh) {
            this.aej.f("金钱不足");
         } else {
            String var9 = Agreement.getSendTextAES("usermount", "SHXL" + var3.getId() + "|" + var6);
            this.aej.getClient().d(var9);
         }
      }
   }

   public void y(int var1) {
      this.j = var1;
      this.d();
      this.ve().a(this.ae());
   }

   public Long x(long var1, JTextField var3) {
      if (var1 < 0L) {
         return 0L;
      } else {
         RoleData var6 = this.vd();
         long var4 = var6.getMoney(this.pl.akn) / this.pl.afh;
         BaseMountSH var7;
         var4 = Math.min((long)(var7 = var6.getMountSHByindex(this.j)).getExpTotal() - (long)var7.getExp(), var4);
         return var1 > var4 ? var4 : null;
      }
   }

   public boolean aa(long var1, JTextField var3) {
      return (boolean)(3 & 5);
   }

   public void d() {
      BaseMountSH var1;
      long var2 = (long)(var1 = this.vd().getMountSHByindex(this.j)).getExpTotal();
      this.jc[3 & 4].setText(BaseMountSH.SH_HEAD_NAME[this.j]);
      this.jc[3 >> 1].setText(String.valueOf(var1.getLvl()));
      this.jc[1 ^ 3].setText(String.valueOf(var1.getExp() + "/" + var2));
      if ((long)var1.getExp() < var2) {
         this.pl.agf(var1);
         this.pl.setVisible((boolean)(5 >> 2));
         this.pk.setVisible((boolean)(3 >> 2));
      } else {
         this.pk.agf(var1);
         this.pk.setVisible((boolean)(4 ^ 5));
         this.pl.setVisible((boolean)(5 >> 3));
      }
   }
}
