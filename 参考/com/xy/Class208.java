package com.xy;

import com.xy.bean.QuackGameBean;
import com.xy.readbean.Goodstable;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.math.BigDecimal;
import javax.swing.JLabel;

public class Class208 extends Class345 {
   private int ek;
   private int aee;
   private long yx;
   private int dm;
   private int dn;
   private QuackGameBean aof;
   private Class44[] aog;
   private boolean gu;
   private JLabel[] fb;
   private JLabel ik;
   private long aoh;
   private Class529 hy;
   private JLabel[] c;
   public static Class8 bm = Class330.s("sc/mouse/cjwrk.tcp", (short[])null);
   private int bn;
   private BigDecimal co;
   private Image rv;

   public void ax(Goodstable var1) {
      if (this.ek != 0) {
         this.aej.f("抽奖还没有结束");
      } else {
         this.co = var1.getRgid();

         int var2;
         for(int var10000 = var2 = 3 & 4; var10000 < this.aog.length; var10000 = var2) {
            this.aog[var2].c(3 ^ 3, (Object)null);
            this.fb[var2].setText("");
            this.c[var2++].setText("");
         }

         this.ik.setText(var1.getUsetime().toString());
         this.ve().a(this.ae());
      }
   }

   public Class208(GameView var1) {
      int var10001 = 31 & 110;
      int var10008 = -4 >> 2;
      int var10010 = 125 & 123;
      int var10012 = 5 >> 3;
      super(127 & 118, 1 ^ 3, Class345.aef, var1);
      this.bn = var10012;
      this.dn = var10010;
      this.va(var10008, 2 & 5, 11758 & 21439, 15215 & 17872, Class345.aei);
      this.fx("sc/b/S195.png");
      this.hy = new Class529("sc/e/31.png", 5 >> 2, 25079 & 7917, Class681.ak, Class681.c, "抽奖", this);
      this.hy.setBounds(24053 & 8879, 8414 & 24495, 127 & 79, 93 & 59);
      this.add(this.hy);
      Class44[] var4 = new Class44[var10001];
      boolean var10003 = true;
      this.aog = var4;
      JLabel[] var5 = new JLabel[94 & 47];
      var10003 = true;
      this.fb = var5;
      var5 = new JLabel[95 & 46];
      var10003 = true;
      this.c = var5;

      int var2;
      for(int var10000 = var2 = 3 & 4; var10000 < this.aog.length; var10000 = var2) {
         this.aog[var2] = new Class44(this);
         this.aog[var2].setOpaque((boolean)(3 ^ 3));
         this.fb[var2] = new JLabel("", --4);
         this.fb[var2].setOpaque((boolean)(3 >> 2));
         this.fb[var2].setForeground(Color.red);
         this.c[var2] = new JLabel("", 3 & 4);
         this.c[var2].setOpaque((boolean)(5 >> 3));
         this.c[var2].setForeground(Color.black);
         Class208 var3;
         if (var2 <= --4) {
            if (var2 >= --3) {
               var3 = this;
               this.aog[var2].setBounds((24571 & 8383) + (var2 - (1 ^ 3)) * (85 & 126), 43 & 95, 63 & 115, 63 & 115);
            } else {
               var3 = this;
               this.aog[var2].setBounds(20 + var2 * 84, 11, 51, 51);
            }
         } else if (var2 <= 7) {
            var3 = this;
            this.aog[var2].setBounds(355, 11 + (var2 - --4) * 77, 51, 51);
         } else if (var2 <= 11) {
            if (var2 >= 9) {
               var3 = this;
               this.aog[var2].setBounds(355 - (var2 - 7) * 84 + (3 >> 1), 242, 51, 51);
            } else {
               var3 = this;
               this.aog[var2].setBounds(355 - (var2 - 7) * 84, 242, 51, 51);
            }
         } else {
            if (var2 <= 13) {
               this.aog[var2].setBounds(20, 242 - (var2 - 11) * 77, 51, 51);
            }

            var3 = this;
         }

         var3.fb[var2].setBounds(this.aog[var2].getX() + 32, this.aog[var2].getY() + --2, 17, 12);
         this.c[var2].setBounds(this.aog[var2].getX() - 8, this.aog[var2].getY() + 50, 75, 20);
         this.aog[var2].setBounds(this.aog[var2].getX() + --1, this.aog[var2].getY() + --1, 51, 51);
         this.add(this.c[var2]);
         this.add(this.fb[var2]);
         this.add(this.aog[var2++]);
      }

      this.ik = new JLabel("100", 3 & 4);
      this.ik.setBounds(233, 188, 40, 14);
      this.ik.setForeground(Color.red);
      this.ik.setFont(Class681.bm);
      this.add(this.ik);
   }

   public void hm(QuackGameBean var1) {
      int var10002;
      if (this.aof != null) {
         var10002 = 3 >> 2;
         int var10004 = 2 & 5;
         this.aee += this.ek;
         this.aee %= 15 & 126;
         this.ek = var10004;
         this.gu = (boolean)var10002;
         Class677.i(this.aof.getAssetUpdate(), this.aej);
      }

      this.aof = var1;
      String[] var7 = var1.getPetmsg().split("\\|");
      int var4 = -4 >> 2;

      int var3;
      for(int var10000 = var3 = 3 ^ 3; var10000 < this.aog.length; var10000 = var3) {
         String[] var2 = var3 < var7.length ? var7[var3].split("_") : null;
         Goodstable var5 = var2 != null ? this.vc().n(new BigDecimal(var2[3 & 4])) : null;
         if (var5 != null) {
            var10002 = 2 ^ 3;
            this.aog[var3].c(2 ^ 3, var5);
            int var6 = Integer.parseInt(var2[var10002]);
            this.fb[var3].setText(var6 > (4 ^ 5) ? var2[3 & 5] : "");
            this.c[var3].setText(var5.getGoodsname());
            if (var4 == -4 >> 2) {
               var4 = var2[1 ^ 3].equals("1") ? var3 : -1;
            }
         } else {
            this.aog[var3].c(3 >> 2, (Object)null);
            this.fb[var3].setText("");
            this.c[var3].setText("");
         }

         ++var3;
      }

      var3 = (63 & 78) - this.aee;
      this.yx = Class280.l();
      this.aoh = 0L;
      this.ek = var4 + (62 & 79) * (Class27.c.nextInt(--3) == 0 ? --3 : 2) + var3;
   }

   public void fz(Graphics var1) {
      if (this.ek == 0) {
         if (this.gu) {
            if (this.aof != null) {
               Class677.i(this.aof.getAssetUpdate(), this.aej);
               this.aof = null;
            }

            this.gu = (boolean)(3 >> 2);
         }
      } else {
         long var2 = (Class280.l() - this.yx) / 17L - this.aoh;
         this.aoh += var2;
         this.dm = (int)((long)this.dm + var2);
         if (this.dm > (this.ek > 3 >> 1 ? (111 & 116) / this.ek : 70)) {
            this.ek -= 5 >> 2;
            this.aee += 4 ^ 5;
            if (this.aee >= (47 & 94)) {
               this.aee = 3 >> 2;
            }

            this.dm = 2 & 5;
            Class208 var10000;
            int var10002;
            if (this.aee <= --4) {
               var10002 = 123 & 125;
               var10000 = this;
               this.bn = this.aee * (116 & 95);
               this.dn = var10002;
            } else if (this.aee <= (15 & 119)) {
               var10002 = 121 & 127;
               var10000 = this;
               this.bn = 20959 & 12143;
               this.dn = var10002 + (this.aee - --4) * (77 & 127);
            } else if (this.aee <= (63 & 75)) {
               var10002 = 21473 & 11646;
               var10000 = this;
               this.bn = (8191 & 24911) - (this.aee - (15 & 119)) * (124 & 87);
               this.dn = var10002;
            } else {
               if (this.aee <= (111 & 29)) {
                  int var4 = 25957 & 7162;
                  this.bn = 2 & 5;
                  this.dn = var4 - (this.aee - (91 & 47)) * 77;
               }

               var10000 = this;
            }

            if (var10000.ek == 0) {
               this.gu = (boolean)(--1);
            }
         }
      }

      bm.d(Class280.l(), 2 & 5);
      bm.aa(var1, this.bn, this.dn - 130);
   }

   public void d() {
      if (this.ek != 0) {
         this.aej.f("抽奖还没有结束无法关闭面板");
      } else {
         Goodstable var1;
         if ((var1 = this.vd().getGood(this.co)) != null && var1.getUsetime() > 0) {
            String var2 = Agreement.getSendTextAES("user", var1.getRgid().toString());
            int var10002 = 5 >> 2;
            this.uw().d(var2);
            var1.ab(var10002);
            this.ik.setText(var1.getUsetime().toString());
            if (var1.getUsetime() <= 0) {
               this.vd().h(var1.getRgid());
            }

         } else {
            this.aej.f("抽奖次数不足");
         }
      }
   }

   public boolean t() {
      if (this.ek != 0) {
         int var10000 = 2 & 5;
         this.aej.f("抽奖还没有结束无法关闭面板");
         return (boolean)var10000;
      } else {
         return super.t();
      }
   }

   protected void paintChildren(Graphics var1) {
      super.paintChildren(var1);
      if (this.rv == null) {
         this.rv = Class511.a("sc/b/S116.png");
      }

      this.fz(var1);
   }
}
