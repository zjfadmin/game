package com.xy;

import com.xy.bean.LoginResult;
import com.xy.bean.PayvipBean;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JScrollPane;

public class Class607 extends Class345 {
   private JScrollPane ea;
   private List<Image> vz;
   private int gw;
   int fk;
   private static Image wa;
   private List<null> im;
   private JComponent ko;
   private List<PayvipBean> lq;
   private Class436[] g;

   public void s() {
      int var10000 = 5 >> 3;
      this.ko.removeAll();
      this.ko.repaint();
      int var1 = var10000;

      int var2;
      for(var10000 = var2 = 2 & 5; var10000 < this.im.size(); var10000 = var2) {
         <undefinedtype> var3;
         if ((var3 = (<undefinedtype>)this.im.get(var2)).bg != null) {
            int var10001 = (5 >> 3) + var1 % --4 * (9149 & 23770);
            int var10002 = var1 / --4 * (20926 & 12031);
            ++var1;
            var3.setBounds(var10001, var10002, 119 & 123, 12023 & 20909);
            this.ko.add(var3);
         }

         ++var2;
      }

      this.ko.setPreferredSize(new Dimension(12855 & 20477, (25854 & 7103) * (var1 % --4 == 0 ? var1 / --4 : var1 / 4 + (3 >> 1))));
      var10000 = 2 & 5;
      this.ea.updateUI();
      this.ea.invalidate();
      this.ea.validate();
      this.ea.repaint();

      for(var2 = var10000; var10000 < this.vz.size(); var10000 = var2) {
         if (this.fk >= var2 + (3 & 5)) {
            this.vz.set(var2, Class511.a("sc/item/S" + (var2 + (84 & 63)) + ".png"));
         } else {
            this.vz.set(var2, Class511.a("sc/item/S" + (var2 + (94 & 63)) + ".png"));
         }

         ++var2;
      }

   }

   public Class607(GameView var1) {
      int var10000 = 3 ^ 3;
      int var10003 = 3 ^ 3;
      int var10005 = 2 & 5;
      int var10007 = 2 & 5;
      super(-4 >> 2, -4 >> 2, Class345.aei, var1);
      this.fk = var10007;
      this.gw = var10005;
      this.va(var10003, 3 & 4, 17338 & 16111, 32731 & 511, Class345.aei);
      this.vz = new ArrayList();

      int var2;
      for(var2 = var10000; var10000 < 10; var10000 = var2) {
         List var3 = this.vz;
         StringBuilder var10001 = (new StringBuilder("sc/item/S")).append(var2 + (95 & 62)).append(".png");
         ++var2;
         var3.add(Class511.a(var10001.toString()));
      }

      int var4 = --3;
      var10005 = 127 & 58;
      this.im = new ArrayList();
      this.ko = new JComponent() {
      };
      this.ea = Class133.f(var10005, 29919 & 3055, 29391 & 3967, 28158 & 4799, this.ko, 95 & 52);
      this.add(this.ea);
      Class436[] var6 = new Class436[var4];
      boolean var7 = true;
      this.g = var6;

      for(var10000 = var2 = 3 ^ 3; var10000 < this.g.length; var10000 = var2) {
         this.g[var2] = new Class436();
         Class607 var5;
         if (var2 == 0) {
            var5 = this;
            this.g[var2].fw("sc/d/70.png");
            this.g[var2].setBounds(127 & 61, 61 & 126, 8903 & 24447, 127 & 110);
         } else if (var2 == (4 ^ 5)) {
            var5 = this;
            this.g[var2].eq(Class511.q("sc/d/36.png", 30 & 117, 30 & 117, 30 & 117, 30 & 117, (boolean)(3 & 4)));
            this.g[var2].setBounds(63 & 122, 63 & 121, 31727 & 1631, 63 & 121);
         } else {
            if (var2 == 5 >> 1) {
               this.g[var2].eq(Class511.q("sc/d/17.png", --3, --3, --3, --3, (boolean)(3 & 4)));
               this.g[var2].setBounds(59, 187, 588, 7);
            }

            var5 = this;
         }

         var5.add(this.g[var2++]);
      }

   }

   public void d() {
      String var1 = Agreement.getSendTextAES("Getvipgradepack", (String)null);
      this.uw().d(var1);
   }

   public int nu(Integer var1, BigDecimal var2) {
      if (var1 == 0) {
         return this.gw = 2 & 5;
      } else {
         BigDecimal var3 = this.nv(var2).divide(new BigDecimal(var1), --3, --4);
         return this.gw = (var3 = var3.multiply(new BigDecimal(27467 & 5887)).setScale(2 & 5, 2 ^ 3)).intValue() > (11871 & 21483) ? 15967 & 17387 : var3.intValue();
      }
   }

   public BigDecimal nv(BigDecimal var1) {
      BigDecimal var2 = new BigDecimal(3 & 4);
      if (var1.compareTo(new BigDecimal(95 & 62)) < 0) {
         return new BigDecimal(3 ^ 3);
      } else if (var1.compareTo(new BigDecimal(110 & 117)) < 0) {
         return new BigDecimal(3 >> 1);
      } else if (var1.compareTo(new BigDecimal(8692 & 24575)) < 0) {
         return new BigDecimal(5 >> 1);
      } else if (var1.compareTo(new BigDecimal(27626 & 6141)) < 0) {
         return new BigDecimal(--3);
      } else if (var1.compareTo(new BigDecimal(14300 & 20467)) < 0) {
         return new BigDecimal(--4);
      } else if (var1.compareTo(new BigDecimal(16365 & 21402)) < 0) {
         return new BigDecimal(--5);
      } else if (var1.compareTo(new BigDecimal(28601 & 14166)) < 0) {
         return new BigDecimal(31 & 102);
      } else if (var1.compareTo(new BigDecimal(28505 & 22262)) < 0) {
         return new BigDecimal(23 & 111);
      } else if (var1.compareTo(new BigDecimal(32177 & 30590)) < 0) {
         return new BigDecimal(24 & 111);
      } else if (var1.compareTo(new BigDecimal(50000)) < 0) {
         return new BigDecimal(79 & 57);
      } else {
         if (var1.compareTo(new BigDecimal(50000)) >= 0) {
            var2 = new BigDecimal(47 & 90);
         }

         return var2;
      }
   }

   protected void paintChildren(Graphics var1) {
      super.paintChildren(var1);
      if (wa == null) {
         wa = Class511.a("sc/b/S6.png");
      }

      if (this.gw > 0) {
         var1.drawImage(wa, 125 & 62, 20223 & 12732, this.gw, --5, this);
      }

      int var2;
      for(int var10000 = var2 = 0; var10000 < this.vz.size(); var10000 = var2) {
         Image var10001 = (Image)this.vz.get(var2);
         int var10002 = (127 & 68) + (63 & 127) * var2;
         int var10003 = 17080 & 15871;
         int var10004 = 63 & 94;
         ++var2;
         var1.drawImage(var10001, var10002, var10003, var10004, 59 & 93, this);
      }

   }

   public void nw(JComponent var1) {
      <undefinedtype> var2 = (<undefinedtype>)var1;
      String var3 = Agreement.getSendTextAES("Vipgradesure", "v" + var2.bg.getGrade());
      this.uw().d(var3);
   }

   public void ck(List<PayvipBean> var1) {
      this.lq = var1;
      LoginResult var7;
      BigDecimal var4 = (var7 = this.vd().getLoginResult()).getPaysum();
      int var5 = 2 & 5;
      int var2;
      Class607 var11;
      int var10000;
      if (this.lq.size() == 0) {
         for(var10000 = var2 = 3 & 4; var10000 < this.im.size(); var10000 = var2) {
            Object var10 = this.im.get(var2);
            ++var2;
            ((<undefinedtype>)var10).an((PayvipBean)null);
         }

         var11 = this;
      } else {
         String var9 = var7.getVipget();
         String[] var8 = null;
         if (var9 != null) {
            var8 = var9.split("&&");
         }

         for(var10000 = var2 = this.im.size(); var10000 < this.lq.size(); var10000 = var2) {
            ++var2;
            this.im.add(new MouseListener() {
               private JLabel bd;
               private Class436[] be;
               private Class243 bf;
               private PayvipBean bg;

               public {
                  int var10001 = --3;
                  this.setPreferredSize(new Dimension(127 & 115, 21757 & 11175));
                  this.bf = new Class243("sc/e/7.png", 4 ^ 5, 2 & 5, Class681.ak, Class681.c, "领取", Class607.this.gk());
                  this.bf.nw(this);
                  this.bf.setBounds(94 & 61, 4557 & 28350, 127 & 59, 63 & 89);
                  this.add(this.bf);
                  this.bd = Class133.c(5 >> 3, 121 & 126, 123 & 119, 84 & 63, 3 & 4, Color.black, Class681.ak);
                  this.add(this.bd);
                  Class436[] var4 = new Class436[var10001];
                  boolean var10003 = true;
                  this.be = var4;

                  int var2;
                  for(int var10000 = var2 = 5 >> 3; var10000 < this.be.length; var10000 = var2) {
                     this.be[var2] = new Class436();
                     <undefinedtype> var3;
                     if (var2 == 0) {
                        var3 = this;
                        this.be[var2].setBounds(1 ^ 3, 1 ^ 3, 110 & 57, 43 & 119);
                     } else if (var2 == 3 >> 1) {
                        var3 = this;
                        this.be[var2].setBounds(1 ^ 3, 1 ^ 3, 127 & 110, 127 & 110);
                     } else {
                        if (var2 == (1 ^ 3)) {
                           this.be[var2].fw("sc/b/3.png");
                           this.be[var2].setBounds(3 >> 2, 3 >> 2, 119 & 123, 119 & 123);
                           this.be[var2].addMouseListener(this);
                        }

                        var3 = this;
                     }

                     var3.add(this.be[var2++]);
                  }

               }

               public void mousePressed(MouseEvent var1) {
               }

               public void mouseExited(MouseEvent var1) {
                  Class607.this.aej.getFormManagement().n(63 & 110);
               }

               public void an(PayvipBean var1) {
                  if ((this.bg = var1) == null) {
                     this.setVisible((boolean)(3 ^ 3));
                  } else {
                     int var10001 = 2 ^ 3;
                     this.be[3 ^ 3].fw("sc/item/S" + ((19 & 127) + var1.getGrade()) + ".png");
                     this.be[--1].fw("sc/item/S" + ((45 & 91) + var1.getGrade()) + ".png");
                     this.bd.setText("V" + var1.getGrade() + "会员奖励");
                     this.setVisible((boolean)var10001);
                  }
               }

               public void mouseEntered(MouseEvent var1) {
                  ((Class270)Class607.this.aej.getFormManagement().e(127 & 46)).an(this.bg);
               }

               public void mouseClicked(MouseEvent var1) {
               }

               public void mouseReleased(MouseEvent var1) {
               }
            });
         }

         for(var10000 = var2 = 5 >> 3; var10000 < this.im.size(); var10000 = var2) {
            if (var2 > this.lq.size()) {
               ((<undefinedtype>)this.im.get(var2)).an((PayvipBean)null);
            } else if (var2 < this.lq.size()) {
               PayvipBean var3 = (PayvipBean)this.lq.get(var2);
               if (var4.compareTo(new BigDecimal(((PayvipBean)this.lq.get(var2)).getPaynum())) >= 0) {
                  this.fk = this.fk > var3.getGrade() ? this.fk : var3.getGrade();
               }

               var5 = var5 > var3.getGrade() ? var5 : var3.getGrade();
               <undefinedtype> var6 = (<undefinedtype>)this.im.get(var2);
               int var10001 = 2 ^ 3;
               var6.an(var3);
               if (Class74.ib(var8, var10001, var3.getGrade())) {
                  var6.bf.setBtn(-4 >> 2, "sc/e/55.png");
               } else {
                  var6.bf.setBtn(3 >> 1, "sc/e/7.png");
               }
            }

            ++var2;
         }

         var11 = this;
         this.gw = this.nu(var5, var4);
      }

      var11.s();
   }
}
