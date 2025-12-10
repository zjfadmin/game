package com.xy;

import com.xy.bean.QuackGameBean;
import com.xy.readbean.Goodstable;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.LayoutManager;
import java.awt.RenderingHints;
import java.awt.geom.AffineTransform;
import java.awt.image.ImageObserver;
import java.math.BigDecimal;
import javax.swing.JComponent;
import javax.swing.JLabel;

public class Class669 extends Class345 {
   private BigDecimal aaj;
   private AffineTransform aak;
   private QuackGameBean aal;
   private Class529 aam;
   private static Class8 aan;
   private int do;
   private int dp;
   private double aao;
   private JLabel bs;
   private <undefinedtype>[] aap;
   private BigDecimal cf;
   private int fk;
   private BigDecimal aaq;
   private String aar;
   private BigDecimal ne;
   private double aas;
   private int m;

   public Class669(GameView var1) {
      int var10001 = 31 & 110;
      int var10013 = -2 & -1;
      int var10015 = 3 >> 2;
      int var10017 = 2 & 5;
      int var10024 = 4 ^ 5;
      super(127 & 126, --2, Class345.aef, var1);
      this.do = var10024;
      this.aao = Math.toRadians(1.0D);
      this.aak = new AffineTransform();
      this.aas = 0.0D;
      this.fk = var10017;
      this.m = var10015;
      this.va(var10013, 5 >> 3, 4989 & 28658, 2047 & 31222, Class345.aeo);
      this.fx("sc/b/S295.png");
      this.aea.setBtnPath("sc/b/B395.png");
      this.aea.setBounds(13309 & 20095, 86 & 127, 57 & 95, 57 & 95);
      this.bs = new JLabel("", 5 >> 3);
      this.bs.setBounds(1627 & 31742, 15230 & 17849, 51 & 126, 52 & 95);
      this.bs.setFont(Class681.y);
      this.bs.setForeground(Color.red);
      this.add(this.bs);
      this.aam = new Class529("sc/e/31.png", --1, 20959 & 12011, Class681.ak, Class681.c, "抽奖", this);
      this.aam.setBounds(28639 & 4664, 25439 & 7678, 127 & 79, 25);
      this.add(this.aam);
      <undefinedtype>[] var4 = new <undefinedtype>[var10001];
      boolean var10003 = true;
      this.aap = var4;

      int var2;
      for(int var10000 = var2 = 3 & 4; var10000 < this.aap.length; var10000 = var2) {
         this.aap[var2] = new JComponent(var2) {
            private JLabel as;
            private BigDecimal ge;
            private JLabel bd;
            private int bn;
            private int cy;
            private Class44 it;

            public void ew(Goodstable var1, int var2) {
               this.ge = var1 != null ? var1.getGoodsid() : null;
               this.bn = var2;
               Class44 var10000 = this.it;
               int var10001;
               Goodstable var10002;
               if (var1 != null) {
                  var10001 = --1;
                  var10002 = var1;
               } else {
                  var10001 = 0;
                  var10002 = var1;
               }

               var10000.c(var10001, var10002);
               if (this.ge != null) {
                  this.as.setText(var2 > --1 ? String.valueOf(var2) : null);
                  this.bd.setText(var1.getGoodsname());
                  this.bd.setForeground(Color.WHITE);
               } else {
                  this.as.setText((String)null);
                  this.bd.setText((String)null);
               }
            }

            public {
               int var10012 = 3 & 4;
               this.cy = var2;
               this.setOpaque((boolean)var10012);
               this.setLayout((LayoutManager)null);
               this.it = new Class44(Class669.this.gk());
               this.it.setBounds(111 & 31, 15 & 124, 111 & 62, 111 & 62);
               this.as = new JLabel("", --4);
               this.bd = new JLabel("", 3 >> 2);
               this.as.setForeground(Color.red);
               this.bd.setFont(Class681.bm);
               this.as.setBounds(111 & 59, 23 & 121, 55 & 90, 31 & 111);
               this.bd.setBounds(3 >> 2, 127 & 60, 124 & 79, 79 & 63);
               this.add(this.as);
               this.add(this.bd);
               this.add(this.it);
            }

            protected void paintComponent(Graphics var1) {
               super.paintComponent(var1);
               Graphics2D var2 = (Graphics2D)var1;
               var2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
               var2.setColor(this.cy == Class669.this.dp ? Class681.cv : Class681.cb);
               var2.fillOval(--3, 5 >> 3, 110 & 87, 110 & 87);
            }
         };
         Class669 var3;
         if (var2 == 0) {
            var3 = this;
            this.aap[var2].setBounds(247, 53, 76, 75);
         } else if (var2 == (2 ^ 3)) {
            var3 = this;
            this.aap[var2].setBounds(312, 88, 76, 75);
         } else if (var2 == --2) {
            var3 = this;
            this.aap[var2].setBounds(358, 145, 76, 75);
         } else if (var2 == --3) {
            var3 = this;
            this.aap[var2].setBounds(376, 216, 76, 75);
         } else if (var2 == --4) {
            var3 = this;
            this.aap[var2].setBounds(358, 286, 76, 75);
         } else if (var2 == --5) {
            var3 = this;
            this.aap[var2].setBounds(312, 344, 76, 75);
         } else if (var2 == 6) {
            var3 = this;
            this.aap[var2].setBounds(247, 376, 76, 75);
         } else if (var2 == 7) {
            var3 = this;
            this.aap[var2].setBounds(172, 376, 76, 75);
         } else if (var2 == 8) {
            var3 = this;
            this.aap[var2].setBounds(106, 344, 76, 75);
         } else if (var2 == 9) {
            var3 = this;
            this.aap[var2].setBounds(60, 286, 76, 75);
         } else if (var2 == 10) {
            var3 = this;
            this.aap[var2].setBounds(45, 216, 76, 75);
         } else if (var2 == 11) {
            var3 = this;
            this.aap[var2].setBounds(60, 145, 76, 75);
         } else if (var2 == 12) {
            var3 = this;
            this.aap[var2].setBounds(108, 88, 76, 75);
         } else {
            if (var2 == 13) {
               this.aap[var2].setBounds(172, 53, 76, 75);
            }

            var3 = this;
         }

         var3.add(this.aap[var2++]);
      }

   }

   protected void paintComponent(Graphics var1) {
      super.paintComponent(var1);
      if (aan == null) {
         aan = Class330.q(Class222.m("drawzp"));
      } else {
         if (this.fk != this.m) {
            Class669 var10000;
            if (this.m - this.fk > (12223 & 20694)) {
               var10000 = this;
               this.fk += (1 ^ 3) + (this.m - this.fk) / (671 & 32246);
            } else {
               var10000 = this;
               this.fk += 5 >> 1;
            }

            if (var10000.fk > this.m) {
               this.fk = this.m;
            }

            this.dp = this.fk % (31726 & 1401);
            this.aas = (double)this.dp * this.aao;
            this.dp = (int)((double)this.dp / 25.714285714285715D);
            if (this.fk == this.m) {
               this.hm((QuackGameBean)null);
            }
         }

         aan.d(0L, 5 >> 3);
         if (this.aas != 0.0D) {
            Graphics2D var2;
            Graphics2D var5 = var2 = (Graphics2D)var1;
            int var10001 = 29951 & 3063;
            this.aak.setToIdentity();
            this.aak.rotate(this.aas, (double)aan.ac().k(), (double)aan.ac().i());
            int var3 = var10001 - aan.ac().k();
            int var4 = (23551 & 9466) - aan.ac().i();
            var2.translate(var3, var4);
            var5.drawImage(aan.ac().g(), this.aak, (ImageObserver)null);
            var2.translate(-var3, -var4);
         } else {
            aan.aa(var1, 14847 & 18167, 31998 & 1019);
         }
      }
   }

   public synchronized void d() {
      if (this.aal != null) {
         this.aej.f("抽奖还没有结束");
      } else if (this.bs.equals("0")) {
         this.aej.f("抽奖次数不足");
      } else {
         Goodstable var1 = this.vd().bc(this.aaj);
         StringBuffer var2 = new StringBuffer();
         var2.append("R");
         var2.append(this.ne);
         var2.append("|");
         var2.append(5 >> 3);
         var2.append("|");
         var2.append(4 ^ 5);
         if (var1 != null) {
            var2.append("|");
            var2.append(var1.getRgid());
         }

         String var3 = Agreement.getSendTextAES("getfivemsg", var2.toString());
         this.uw().d(var3);
      }
   }

   public boolean t() {
      if (this.aal != null) {
         int var10000 = 5 >> 3;
         this.aej.f("抽奖还没有结束无法关闭面板");
         return (boolean)var10000;
      } else {
         return super.t();
      }
   }

   public void hh(QuackGameBean var1) {
      this.ne = var1.getMoney();
      this.f(var1.getPetmsg2());
      String[] var5 = var1.getPetmsg() != null && !var1.getPetmsg().equals("") ? var1.getPetmsg().split("\\|") : null;
      int var6 = -4 >> 2;

      int var3;
      for(int var10000 = var3 = 3 >> 2; var10000 < this.aap.length; var10000 = var3) {
         if (var5 != null && var3 < var5.length) {
            String[] var4 = var5[var3].split("_");
            Goodstable var2 = this.vc().n(new BigDecimal(var4[2 & 5]));
            this.aap[var3].ew(var2, Integer.parseInt(var4[3 >> 1]));
            if (var4[1 ^ 3].equals("1")) {
               var6 = var3;
            }
         } else {
            this.aap[var3].ew((Goodstable)null, 3 >> 2);
         }

         ++var3;
      }

      if (var6 >= 0 && var6 < (15 & 126)) {
         double var8 = 25.714285714285715D;
         int var7 = (int)(25.714285714285715D * (double)var6);
         double var10001 = (double)(var6 + (2 ^ 3));
         var7 += 2;
         var6 = (int)(var8 * var10001);
         var6 -= 2;
         if (var6 - var7 > 0) {
            var7 += Class27.c.nextInt(var6 - var7);
         }

         var7 += 720;
         var7 += (5481 & 27646) - this.fk % (5481 & 27646);
         this.m += var7;
      }

      if (this.ve().m(this.ae()) == null) {
         this.ve().a(this.ae());
      }

   }

   public synchronized void f(String var1) {
      String[] var2 = var1.split("=");
      this.aaj = !var2[3 & 4].equals("null") ? new BigDecimal(var2[5 >> 3]) : null;
      this.aar = !var2[3 >> 1].equals("null") ? var2[4 ^ 5] : null;
      this.aaq = !var2[--2].equals("null") ? new BigDecimal(var2[1 ^ 3]) : null;
      this.do = Integer.parseInt(var2[--3]);
      if (var2.length == --5) {
         this.cf = !var2[--4].equals("null") ? new BigDecimal(var2[--4]) : null;
      }

      int var3 = 0;
      if (this.aaj != null) {
         var3 += this.vd().getGoodNum(this.aaj);
      }

      if (this.cf != null && this.aaq != null) {
         var3 = (int)((long)var3 + this.cf.longValue() / this.aaq.longValue());
      }

      this.bs.setText(String.valueOf(var3 / this.do));
   }

   public synchronized void hl(QuackGameBean var1) {
      this.hm(var1);
   }

   public synchronized void hm(QuackGameBean var1) {
      if (this.aal != null) {
         Class677.i(this.aal.getAssetUpdate(), this.aej);
         this.f(this.aal.getPetmsg2());
      }

      this.aal = var1;
      if (var1 != null) {
         this.hh(var1);
      }

   }
}
