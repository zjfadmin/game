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

public class Class309 extends Class345 {
   private int agq;
   private String aom;
   private int aee;
   private int em;
   private int dm;
   private int dn;
   private int do;
   private Class529 zb;
   private BigDecimal mz;
   private BigDecimal cd;
   public static Class8 nb = Class330.s("sc/mouse/flicker.tcp", (short[])null);
   private JLabel as;
   private JLabel at;
   private QuackGameBean aon;
   private int j;
   private List<Class655> ie;
   private int cy;
   private BigDecimal py;

   public int e() {
      int var1;
      return (var1 = (106 & 61) - (int)((double)(this.dn - this.do) * 1.5D)) < --4 ? --4 : var1;
   }

   public Class309(GameView var1) {
      int var10007 = -4 >> 2;
      int var10009 = 2 ^ 3;
      int var10011 = -4 >> 2;
      super(127 & 119, 5 >> 1, Class345.aef, var1);
      this.em = var10011;
      this.dm = var10009;
      this.va(var10007, 3 & 4, 3 & 4, 3 & 4, Class345.aeo);
      this.fx("sc/b/S276.png");
      this.ie = new ArrayList();
      this.zb = new Class529("sc/e/31.png", 3 & 5, 28894 & 4077, Class681.ak, Class681.c, "抽奖", this);
      this.zb.setBounds(16639 & 16293, 16543 & 16366, 95 & 111, 121 & 31);
      this.add(this.zb);
      this.as = new JLabel("", 5 >> 3);
      this.as.setBounds(3 ^ 3, 3 ^ 3, 107 & 95, 55 & 90);
      this.as.setFont(Class681.ad);
      this.as.setForeground(Color.red);
      this.add(this.as);
      this.at = new JLabel("", 3 & 4);
      this.at.setBounds(3 & 4, 3 & 4, 91 & 111, 94 & 51);
      this.at.setFont(Class681.ad);
      this.at.setForeground(Color.red);
      this.add(this.at);
   }

   public synchronized void f(String var1) {
      String[] var2 = var1.split("=");
      this.mz = !var2[3 & 4].equals("null") ? new BigDecimal(var2[3 ^ 3]) : null;
      this.aom = !var2[2 ^ 3].equals("null") ? var2[5 >> 2] : null;
      this.cd = !var2[5 >> 1].equals("null") ? new BigDecimal(var2[5 >> 1]) : null;
      this.dm = Integer.parseInt(var2[--3]);
      if (var2.length == --5) {
         this.py = !var2[--4].equals("null") ? new BigDecimal(var2[--4]) : null;
      }

      this.as.setText(this.cd != null ? String.valueOf(this.cd.longValue() * (long)this.dm) : "");
      this.at.setText(this.py != null ? this.py.toString() : "");
   }

   public void cf(int var1, int var2) {
      this.vf(-4 >> 2, 3 & 4, var1, var2);
   }

   public synchronized void hh(QuackGameBean var1) {
      this.f(var1.getPetmsg2());
      String[] var4 = var1.getPetmsg().split("\\|");

      int var10000;
      Class655 var2;
      int var3;
      for(var10000 = var3 = 3 ^ 3; var10000 < var4.length; var10000 = var3) {
         var2 = var3 < this.ie.size() ? (Class655)this.ie.get(var3) : null;
         if (var2 == null) {
            var2 = new Class655(5 >> 2, this);
            this.ie.add(var2);
            this.add(var2);
         }

         String[] var5 = var4[var3].split("=");
         int var10001 = 4 ^ 5;
         Goodstable var10003 = this.vc().n(new BigDecimal(var5[3 & 4]));
         int var10004 = Integer.parseInt(var5[--1]);
         String var10005 = var5[5 >> 1];
         ++var3;
         var2.ey(var10003, var10004, Integer.parseInt(var10005));
         var2.setVisible((boolean)var10001);
      }

      this.cy = var4.length;

      for(var10000 = var3 = var4.length; var10000 < this.ie.size(); var10000 = var3) {
         Object var6 = this.ie.get(var3);
         ++var3;
         ((Class655)var6).setVisible((boolean)(3 >> 2));
      }

      this.em = var1.getMoney().intValue();
      if (this.em == (3 & 5)) {
         var10000 = 3 >> 2;
         this.fx("sc/b/S276.png");
         this.zb.setBounds(6123 & 26996, 18423 & 14574, 112 & 95, 27 & 126);
         this.as.setBounds(12767 & 20350, 31438 & 1527, 127 & 75, 94 & 51);
         this.at.setBounds(22495 & 10622, 18939 & 13996, 107 & 95, 95 & 50);

         for(var3 = var10000; var10000 < this.ie.size(); var10000 = var3) {
            if ((var2 = (Class655)this.ie.get(var3)).isVisible()) {
               if (var3 < (46 & 87)) {
                  var2.setBounds((118 & 61) + var3 * (94 & 127), 62 & 117, 75, 70);
               } else if (var3 < 8) {
                  var2.setBounds(522, var3 == 6 ? 145 : 237, 75, 70);
               } else if (var3 < 14) {
                  var2.setBounds(52 + (13 - var3) * 94, 329, 75, 70);
               } else {
                  var2.setBounds(52, var3 == 14 ? 237 : 145, 75, 70);
               }
            }

            ++var3;
         }

         this.cf(652, 446);
      }

      this.ve().a(this.ae());
   }

   public synchronized void hl(QuackGameBean var1) {
      this.hm(var1);
      this.f(var1.getPetmsg2());
   }

   protected void paintComponent(Graphics var1) {
      super.paintComponent(var1);
      if (this.aon != null) {
         this.agq += 4 ^ 5;
         if (this.agq > this.e()) {
            this.agq = 2 & 5;
            this.do += 3 >> 1;
            if (this.cy <= 0) {
               return;
            }

            Class655 var2;
            Class655 var10001 = var2 = (Class655)this.ie.get(this.do % this.cy);
            this.aee = var2.getX() + (95 & 45);
            this.j = var10001.getY();
            if (this.do >= this.dn) {
               this.hm((QuackGameBean)null);
            }
         }
      }

      if (this.aee > 0) {
         nb.d(Class280.l(), 2 & 5);
         nb.aa(var1, this.aee, this.j);
      }

   }

   public synchronized void d() {
      if (this.aon != null) {
         this.aej.f("抽奖还没有结束");
      } else if (this.mz == null && this.cd.longValue() * (long)this.dm > this.py.longValue()) {
         this.aej.f(this.aom + "不足" + this.cd.longValue() * (long)this.dm);
      } else {
         Goodstable var1 = this.vd().bc(this.mz);
         StringBuffer var2 = new StringBuffer();
         var2.append("D");
         var2.append(this.em);
         var2.append("|");
         var2.append(3 & 4);
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

   public synchronized void hm(QuackGameBean var1) {
      if (this.aon != null) {
         Class677.i(this.aon.getAssetUpdate(), this.aej);
         this.hh(this.aon);
      }

      this.do = 3 >> 2;
      this.dn = var1 != null && var1.getIndex() != null ? var1.getIndex() : 0;
      this.agq = 2 & 5;
      this.aon = var1;
   }

   public boolean t() {
      if (this.aon != null) {
         int var10000 = 3 >> 2;
         this.aej.f("抽奖还没有结束无法关闭面板");
         return (boolean)var10000;
      } else {
         return super.t();
      }
   }
}
