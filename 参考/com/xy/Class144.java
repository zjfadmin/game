package com.xy;

import com.xy.bean.QuackGameBean;
import com.xy.readbean.Goodstable;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.LayoutManager;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.ImageObserver;
import java.math.BigDecimal;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class Class144 extends Class345 {
   private int dp;
   private BigDecimal mz;
   private <undefinedtype>[] na;
   private Class8 nb;
   private BigDecimal cf;
   private BigDecimal ge;
   private String nc;
   private QuackGameBean nd;
   private BigDecimal ne;
   private static Image fq;
   private JLabel ax;

   public synchronized void hh(QuackGameBean var1) {
      this.hm(var1);
   }

   public Class144(GameView var1) {
      int var10001 = --4;
      int var10005 = -4 >> 2;
      int var10007 = 5 >> 2;
      super(127 & 127, --2, Class345.aef, var1);
      this.dp = var10007;
      this.va(var10005, 3 & 4, 30719 & 2795, 13661 & 19446, Class345.aei);
      this.fx("sc/b/S300.png");
      <undefinedtype>[] var3 = new <undefinedtype>[var10001];
      boolean var10003 = true;
      this.na = var3;

      int var2;
      for(int var10000 = var2 = 3 ^ 3; var10000 < this.na.length; var10000 = var2) {
         this.na[var2] = new MouseListener(var2) {
            private int gv;
            private Class44 aob;
            private int gw;
            private int fk;
            private int ay;
            private JLabel d;
            private BigDecimal co;
            private JLabel ax;

            public void ab(int var1) {
               this.gv = var1;
               this.d.setVisible((boolean)(var1 == 5 >> 1 ? --1 : 0));
               this.ax.setVisible((boolean)(var1 == --2 ? 3 >> 1 : 0));
               this.aob.setVisible((boolean)(var1 == --2 ? 4 ^ 5 : 0));
            }

            public void mouseClicked(MouseEvent var1) {
               if (this.gv == 0) {
                  if (Class144.this.dp != -4 >> 2) {
                     Goodstable var3 = Class144.this.vd().bc(Class144.this.mz);
                     StringBuffer var2 = new StringBuffer();
                     var2.append("P");
                     var2.append(Class144.this.ge);
                     var2.append("|");
                     var2.append(this.ay);
                     var2.append("|");
                     var2.append(--1);
                     if (var3 != null) {
                        var2.append("|");
                        var2.append(var3.getRgid());
                     }

                     String var4 = Agreement.getSendTextAES("getfivemsg", var2.toString());
                     Class144.this.uw().d(var4);
                  }
               }
            }

            public void mouseEntered(MouseEvent var1) {
               if (this.gv == 0) {
                  this.setBorder(BorderFactory.createLineBorder(Color.red, --2));
               }

            }

            public void ew(Goodstable var1, int var2) {
               this.co = var1 != null ? var1.getGoodsid() : null;
               this.gw = var2;
               Class44 var10000 = this.aob;
               int var10001;
               Goodstable var10002;
               if (var1 != null) {
                  var10001 = 2 ^ 3;
                  var10002 = var1;
               } else {
                  var10001 = 0;
                  var10002 = var1;
               }

               var10000.c(var10001, var10002);
               if (this.co != null) {
                  this.d.setText(var2 > --1 ? String.valueOf(var2) : null);
                  this.ax.setText(var1.getGoodsname());
                  this.ax.setForeground(Color.WHITE);
               } else {
                  this.d.setText((String)null);
                  this.ax.setText((String)null);
               }
            }

            public void mouseReleased(MouseEvent var1) {
            }

            public {
               int var10013 = 3 & 4;
               this.setLayout((LayoutManager)null);
               this.setOpaque((boolean)var10013);
               this.ay = var2;
               this.aob = new Class44(Class144.this.gk());
               this.aob.setBounds(62 & 85, 119 & 62, 85 & 122, 85 & 122);
               this.d = new JLabel("", --4);
               this.ax = new JLabel("", 3 & 4);
               this.d.setForeground(Color.red);
               this.d.setFont(Class681.bx);
               this.ax.setFont(Class681.ce);
               this.d.setBounds(127 & 78, 122 & 63, 94 & 63, 118 & 27);
               this.ax.setBounds(3 ^ 3, 27359 & 5558, 127 & 120, 30 & 113);
               this.add(this.d);
               this.add(this.ax);
               this.add(this.aob);
               this.addMouseListener(this);
            }

            public void mouseExited(MouseEvent var1) {
               this.setBorder((Border)null);
            }

            protected void paintComponent(Graphics var1) {
               if (this.gv == --2) {
                  if (Class144.fq == null) {
                     Class144.fq = Class511.a("sc/b/S301.png");
                  }

                  var1.drawImage(Class144.fq, 5 >> 1, 5 >> 1, (ImageObserver)null);
               } else if (Class144.this.nb == null) {
                  Class144.this.nb = Class330.q(Class222.m("drawfp"));
               } else {
                  if (this.gv == --1) {
                     this.fk += 29 & 115;
                     if (this.fk >= Class144.this.nb.k()) {
                        int var10002 = --2;
                        this.fk = Class144.this.nb.k();
                        this.ab(var10002);
                        Class144.this.hm((QuackGameBean)null);
                     }
                  }

                  Class144.this.nb.d((long)this.fk, 3 & 4);
                  Class144.this.nb.aa(var1, 5 >> 1, 5 >> 1);
               }
            }

            public void mousePressed(MouseEvent var1) {
            }
         };
         this.na[var2].setBounds((2542 & 30365) + (127 & 120) * var2, 103 & 124, 121 & 126, 26110 & 6845);
         this.na[var2].ew(this.vc().n(new BigDecimal(117 & 110)), 93 & 46);
         this.add(this.na[var2++]);
      }

      this.ax = new JLabel("免费翻一张牌", 5 >> 3);
      this.ax.setBounds(8190 & 24807, 7660 & 25407, 7660 & 25407, 61 & 86);
      this.ax.setFont(Class681.y);
      this.ax.setForeground(Color.WHITE);
      this.add(this.ax);
   }

   public void hl(QuackGameBean var1) {
      this.ge = var1.getMoney();
      this.f(var1.getPetmsg2());
      String[] var2 = var1.getPetmsg() != null && !var1.getPetmsg().equals("") ? var1.getPetmsg().split("\\|") : null;

      int var3;
      for(int var10000 = var3 = 5 >> 3; var10000 < this.na.length; var10000 = var3) {
         if (var2 != null && var3 < var2.length && !var2[var3].equals("null")) {
            String[] var4 = var2[var3].split("_");
            Goodstable var5 = this.vc().n(new BigDecimal(var4[3 ^ 3]));
            this.na[var3].ew(var5, Integer.parseInt(var4[--1]));
            this.na[var3].ab(var1.getIndex() == var3 ? --1 : 2);
         } else {
            this.na[var3].ew((Goodstable)null, 2 & 5);
         }

         ++var3;
      }

      if (this.ve().m(this.ae()) == null) {
         this.ve().a(this.ae());
      }

   }

   public synchronized void hm(QuackGameBean var1) {
      if (this.nd != null) {
         Class677.i(this.nd.getAssetUpdate(), this.aej);
         this.f(this.nd.getPetmsg2());
      }

      this.nd = var1;
      if (var1 != null) {
         this.hl(var1);
      }

   }

   public synchronized void f(String var1) {
      String[] var2 = var1.split("=");
      this.mz = !var2[2 & 5].equals("null") ? new BigDecimal(var2[5 >> 3]) : null;
      this.nc = !var2[--1].equals("null") ? var2[--1] : null;
      this.cf = !var2[1 ^ 3].equals("null") ? new BigDecimal(var2[--2]) : null;
      this.dp = Integer.parseInt(var2[--3]);
      if (var2.length == --5) {
         this.ne = !var2[--4].equals("null") ? new BigDecimal(var2[--4]) : null;
      }

      if (this.dp == -4 >> 2) {
         this.ax.setText("翻牌次数已用完");
      } else if (this.dp != 0 && (this.mz != null || this.nc != null)) {
         if (this.mz != null) {
            Goodstable var3;
            if ((var3 = this.vc().n(this.mz)) == null) {
               this.ax.setText("数据异常");
            } else if (this.nc == null) {
               this.ax.setText("翻牌消耗" + this.dp + "个" + var3.getGoodsname());
            } else {
               this.ax.setText("翻牌消耗" + this.dp + "个" + var3.getGoodsname() + ",物品不足时可以用" + this.cf.longValue() + this.nc + "抵消");
            }
         } else {
            this.ax.setText("翻牌消耗" + this.cf.longValue() * (long)this.dp + this.nc);
         }
      } else {
         this.ax.setText("免费翻一张牌");
      }
   }

   public boolean t() {
      if (this.nd == null && this.dp != 0) {
         if (this.dp > 0) {
            String var1 = Agreement.getSendTextAES("getfivemsg", "PP" + this.ge);
            this.uw().d(var1);
         }

         return super.t();
      } else {
         this.aej.f("抽奖还没有结束无法关闭面板");
         return (boolean)(3 ^ 3);
      }
   }
}
