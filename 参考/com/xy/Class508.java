package com.xy;

import com.xy.bean.QuackGameBean;
import com.xy.readbean.Goodstable;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import java.awt.Color;
import java.awt.Graphics;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JLabel;

public class Class508 extends Class345 {
   private BigDecimal agk;
   private JLabel agl;
   private Class44 agm;
   private <undefinedtype> agn;
   private String ago;
   private int vc;
   private <undefinedtype>[] agp;
   private int agq;
   private Class529 aav;
   private QuackGameBean agr;
   private JLabel lf;
   private String tp;
   private Class529 ags;
   private long agt;
   private Class529 zb;
   private String agu;
   private long afh;
   private int gc;
   private BigDecimal cf;
   private int fk;
   private BigDecimal aaq;
   private int j;
   private List<null> ie;
   private BigDecimal co;
   private int m;

   protected void paintComponent(Graphics var1) {
      super.paintComponent(var1);
      if (this.tp != null) {
         var1.setColor(Color.red);
         var1.setFont(Class681.av);
         if (this.ago != null) {
            var1.drawString(this.ago, this.j, 20466 & 12541);
         }

         if (this.fk != 0) {
            long var2 = (Class280.l() - this.agt) / 5L - this.afh;
            this.agq = (int)((long)this.agq + var2);
            this.afh += var2;
            if (this.agq >= this.fk) {
               this.agq = this.fk;
            }

            int var5 = this.agq / (63 & 89) % (107 & 30);
            int var3 = this.agq % (59 & 93);
            var1.setClip(this.j - (127 & 13), 14591 & 18391, 93 & 47, 95 & 57);
            var1.drawString(String.valueOf(var5), this.j - (125 & 15), (18681 & 14326) - var3);
            var1.drawString(String.valueOf(var5 == (27 & 109) ? 2 & 5 : var5 + (5 >> 2)), this.j - (79 & 61), (5595 & 27437) - var3);
            var1.setClip(3 >> 2, 3 >> 2, this.getWidth(), this.getHeight());
            if (this.agq == this.fk) {
               int var10002 = 31742 & 1405;
               this.agq = 5 >> 3;
               this.vc += 3 >> 1;
               this.ago = this.tp.substring(this.tp.length() - this.vc);
               this.j = var10002 - this.tp.length() * (15 & 125) / (1 ^ 3);
               this.j += (this.tp.length() - this.ago.length()) * (111 & 29);
               if (this.vc >= this.tp.length()) {
                  this.fk = 3 & 4;
                  this.hm((QuackGameBean)null);
                  return;
               }

               int var4 = Integer.parseInt(this.tp.substring(this.vc, this.vc + (4 ^ 5)));
               this.fk = 500 + var4 * 25;
            }

         }
      }
   }

   public void as(int var1) {
      if (var1 == (19679 & 13288)) {
         this.d();
      } else if (var1 == (27899 & 5069)) {
         this.y(this.e() - (4 ^ 5));
      } else {
         if (var1 == (19166 & 13803)) {
            this.y(this.e() + (5 >> 2));
         }

      }
   }

   public void y(int var1) {
      this.m = var1;
      Class508 var10000;
      if (this.m < 0) {
         this.m = 3 >> 2;
         var10000 = this;
      } else {
         if (this.m > (this.ie.size() - (5 >> 2)) / (75 & 60)) {
            this.m = (this.ie.size() - --1) / (120 & 15);
         }

         var10000 = this;
      }

      var1 = var10000.m * (107 & 28);

      int var2;
      for(int var4 = var2 = 2 & 5; var4 < this.agp.length; var4 = var2) {
         <undefinedtype> var3 = var2 + var1 < this.ie.size() ? (<undefinedtype>)this.ie.get(var2 + var1) : null;
         this.agp[var2++].amc(var3);
      }

   }

   public synchronized void hh(QuackGameBean var1) {
      this.hm(var1);
   }

   public Class508(GameView var1) {
      int var10001 = 28 & 107;
      int var10014 = -1 & -2;
      int var10016 = --1;
      super(18929 & 13966, 1 ^ 3, Class345.aef, var1);
      this.gc = var10016;
      this.va(var10014, 5 >> 3, 3047 & 30461, 3063 & 30079, Class345.aeo);
      this.fx("sc/b/S305.png");
      this.aea.setBtnPath("sc/b/B395.png");
      this.aea.setBounds(8703 & 24520, 47 & 95, 47 & 125, 126 & 47);
      this.ie = new ArrayList();
      this.agl = new JLabel("");
      this.agl.setBounds(17407 & 15808, 13759 & 19318, 91 & 111, 55 & 90);
      this.agl.setFont(Class681.ad);
      this.agl.setForeground(Color.red);
      this.add(this.agl);
      this.lf = new JLabel("");
      this.lf.setBounds(32085 & 1007, 95 & 55, 95 & 107, 18);
      this.lf.setFont(Class681.ad);
      this.lf.setForeground(Color.red);
      this.add(this.lf);
      this.zb = new Class529("sc/e/42.png", 3 >> 1, 201, this);
      this.zb.setBounds(460, 158, 18, 18);
      this.add(this.zb);
      this.ags = new Class529("sc/e/43.png", 2 ^ 3, 202, this);
      this.ags.setBounds(478, 158, 18, 18);
      this.add(this.ags);
      this.aav = new Class529("sc/b/B394.png", 5 >> 2, 200, this);
      this.aav.setBounds(492, 272, 59, 72);
      this.add(this.aav);
      <undefinedtype>[] var3 = new <undefinedtype>[var10001];
      boolean var10003 = true;
      this.agp = var3;

      int var2;
      for(int var10000 = var2 = 5 >> 3; var10000 < this.agp.length; var10000 = var2) {
         this.agp[var2] = new Class44(this) {
            private <undefinedtype> awv;
            // $FF: synthetic field
            final Class508 aww;

            protected void paintComponent(Graphics var1) {
               super.paintComponent(var1);
               if (this.awv != null) {
                  var1.setColor(Color.red);
                  var1.setFont(Class681.bm);
                  var1.drawString(String.valueOf(this.awv.b), 119 & 44, 31 & 110);
               }

            }

            public void amc(Object var1) {
               this.awv = var1;
               Goodstable var2 = this.awv != null ? this.aww.vc().n(this.awv.d) : null;
               int var10001;
               Goodstable var10002;
               if (var2 != null) {
                  var10001 = 3 >> 1;
                  var10002 = var2;
               } else {
                  var10001 = 0;
                  var10002 = var2;
               }

               this.c(var10001, var10002);
               this.fw(this.aww.agn != null && this.aww.agn == this.awv ? "sc/b/S306.png" : null);
            }
         };
         this.agp[var2].setBounds(262 + var2 % --4 * 60, 42 + var2 / --4 * 54, 54, 52);
         this.add(this.agp[var2++]);
      }

      this.agm = new Class44(this);
      this.agm.setBounds(358, 254, 49, 49);
      this.add(this.agm);
   }

   public synchronized void fr(Class44 var1) {
      if (var1 != this.agm) {
         if (this.agr != null) {
            this.aej.f("抽奖还没有结束");
         } else {
            <undefinedtype> var3;
            if ((var3 = (<undefinedtype>)var1).awv != null) {
               this.agn = var3.awv;
               Goodstable var2 = this.vc().n(this.agn.d);
               Class44 var10000 = this.agm;
               int var10001;
               Goodstable var10002;
               if (var2 != null) {
                  var10001 = 4 ^ 5;
                  var10002 = var2;
               } else {
                  var10001 = 0;
                  var10002 = var2;
               }

               var10000.c(var10001, var10002);
               if (var2 == null) {
                  this.agm.setVisible((boolean)(4 ^ 5));
               }

               int var4;
               for(int var5 = var4 = 0; var5 < this.agp.length; var5 = var4) {
                  this.agp[var4++].d();
               }

               var3.fw("sc/b/S306.png");
               if (this.cf != null) {
                  this.agl.setText(String.valueOf(this.cf.longValue() * (long)this.agn.c));
               } else {
                  this.agl.setText("数量:" + this.agn.c);
               }
            }
         }
      }
   }

   public int e() {
      return this.m;
   }

   public void hl(QuackGameBean var1) {
      this.aaq = var1.getMoney();
      this.f(var1.getPetmsg2());
      String[] var2 = var1.getPetmsg() != null && !var1.getPetmsg().equals("") ? var1.getPetmsg().split("\\|") : null;
      this.agn = null;
      this.agm.c(3 ^ 3, (Object)null);
      this.agm.setVisible((boolean)(3 >> 1));
      this.ie.clear();
      int var5;
      if (var2 != null) {
         for(int var10000 = var5 = 3 >> 2; var10000 < var2.length; var10000 = var5) {
            String[] var3 = var2[var5].split("_");
            Object var4 = new Object() {
               private int b;
               private int c;
               private BigDecimal d;

               public int a() {
                  return this.b;
               }

               public int b() {
                  return this.c;
               }

               public void d(int var1) {
                  this.c = var1;
               }

               public BigDecimal e() {
                  return this.d;
               }

               public void f(int var1) {
                  this.b = var1;
               }

               public void i(BigDecimal var1) {
                  this.d = var1;
               }
            };
            int var10003 = 1 ^ 3;
            int var10006 = --1;
            ((<undefinedtype>)var4).i(new BigDecimal(var3[5 >> 3]));
            ((<undefinedtype>)var4).f(Integer.parseInt(var3[var10006]));
            ((<undefinedtype>)var4).d(Integer.parseInt(var3[var10003]));
            ++var5;
            this.ie.add(var4);
         }
      }

      this.y(5 >> 3);
      if (this.ve().m(this.ae()) == null) {
         this.ve().a(this.ae());
      }

   }

   public synchronized void f(String var1) {
      String[] var2 = var1.split("=");
      this.agk = !var2[5 >> 3].equals("null") ? new BigDecimal(var2[2 & 5]) : null;
      this.agu = !var2[4 ^ 5].equals("null") ? var2[--1] : null;
      this.cf = !var2[5 >> 1].equals("null") ? new BigDecimal(var2[1 ^ 3]) : null;
      this.gc = Integer.parseInt(var2[--3]);
      if (var2.length == --5) {
         this.co = !var2[--4].equals("null") ? new BigDecimal(var2[--4]) : null;
      }

      Class508 var10000;
      if (this.agn != null && this.cf != null) {
         var10000 = this;
         this.agl.setText(String.valueOf(this.cf.longValue() * (long)this.agn.c));
      } else {
         var10000 = this;
         this.agl.setText("");
      }

      var10000.lf.setText(this.co != null ? this.co.toString() : "");
   }

   public synchronized void d() {
      if (this.agr != null) {
         this.aej.f("抽奖还没有结束");
      } else if (this.agn == null) {
         this.aej.f("没有选中的抽奖物品");
      } else {
         int var1 = 0;
         if (this.agk != null) {
            var1 += this.vd().getGoodNum(this.agk);
         }

         if (this.co != null && this.cf != null) {
            var1 = (int)((long)var1 + this.co.longValue() / this.cf.longValue());
         }

         if (this.agn.c > var1) {
            this.aej.f("抽奖次数不足");
         } else {
            Goodstable var3 = this.vd().bc(this.agk);
            StringBuffer var2 = new StringBuffer();
            var2.append("V");
            var2.append(this.aaq);
            var2.append("|");
            var2.append(this.agn.d);
            var2.append("|");
            var2.append(this.agn.c);
            if (var3 != null) {
               var2.append("|");
               var2.append(var3.getRgid());
            }

            String var4 = Agreement.getSendTextAES("getfivemsg", var2.toString());
            this.uw().d(var4);
         }
      }
   }

   public synchronized void hm(QuackGameBean var1) {
      if (this.agr != null) {
         Class677.i(this.agr.getAssetUpdate(), this.aej);
         this.f(this.agr.getPetmsg2());
      }

      this.agr = var1;
      if (var1 != null) {
         Class508 var10000;
         if (var1.getIndex() < (26 & 111)) {
            var10000 = this;
            this.tp = "00" + var1.getIndex();
         } else if (var1.getIndex() < (103 & 124)) {
            var10000 = this;
            this.tp = "0" + var1.getIndex();
         } else if (var1.getIndex() < (16383 & 17384)) {
            var10000 = this;
            this.tp = "0" + var1.getIndex();
         } else {
            var10000 = this;
            this.tp = "" + var1.getIndex();
         }

         var10000.vc = 0;
         int var10006 = 5 >> 3;
         int var10008 = 3 & 4;
         int var10013 = 3 & 4;
         this.ago = null;
         this.j = var10013;
         this.agt = Class280.l();
         this.afh = 0L;
         this.agq = var10008;
         this.fk = var10006;
         int var2 = Integer.parseInt(this.tp.substring(this.vc, this.vc + (4 ^ 5)));
         this.ago = this.tp.substring(this.tp.length() - this.vc);
         this.j = (17918 & 15229) - this.tp.length() * (93 & 47) / --2;
         this.j += (this.tp.length() - this.ago.length()) * (63 & 77);
         this.fk = (31733 & 1534) + var2 * (29 & 123);
      }

   }

   public boolean t() {
      if (this.agr != null) {
         int var10000 = 3 >> 2;
         this.aej.f("抽奖还没有结束无法关闭面板");
         return (boolean)var10000;
      } else {
         return super.t();
      }
   }
}
