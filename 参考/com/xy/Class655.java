package com.xy;

import com.xy.readbean.Goodstable;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.LayoutManager;
import java.math.BigDecimal;
import javax.swing.JComponent;
import javax.swing.JLabel;

public class Class655 extends JComponent {
   private int gc;
   private int gw;
   private JLabel at;
   private boolean ee;
   private BigDecimal iq;
   private JLabel ir;
   private Class345 is;
   private Class44 it;

   public void q() {
      if (this.iq != null) {
         int var1 = this.is.vd().getGoodNum(this.iq);
         this.at.setText(var1 + "/" + this.gc);
         this.at.setForeground(var1 >= this.gc ? Color.green : Color.red);
      }

   }

   public void ew(Goodstable var1, int var2) {
      this.iq = var1 != null ? var1.getGoodsid() : null;
      this.gc = var2;
      Class44 var10000 = this.it;
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
      this.it.setVisible((boolean)(--1));
      if (this.iq != null) {
         this.q();
      } else {
         this.at.setText((String)null);
      }
   }

   public boolean t() {
      return this.ee;
   }

   public void ey(Goodstable var1, int var2, int var3) {
      this.iq = var1 != null ? var1.getGoodsid() : null;
      this.gc = var2;
      this.ee = (boolean)(var3 == 3 >> 1 ? 5 >> 2 : 0);
      Class44 var10000 = this.it;
      int var10001;
      Goodstable var10002;
      if (var1 != null) {
         var10001 = 3 & 5;
         var10002 = var1;
      } else {
         var10001 = 0;
         var10002 = var1;
      }

      var10000.c(var10001, var10002);
      this.it.setVisible((boolean)(4 ^ 5));
      if (this.iq != null) {
         this.ir.setText(var2 > 3 >> 1 ? String.valueOf(var2) : null);
         this.at.setText(var1.getGoodsname());
         this.at.setForeground(Color.BLACK);
      } else {
         this.ir.setText((String)null);
         this.at.setText((String)null);
      }
   }

   public BigDecimal ez() {
      return this.iq;
   }

   public JLabel fa() {
      return this.at;
   }

   public void ak(boolean var1) {
      this.ee = var1;
   }

   public Class655(int var1, Class345 var2) {
      int var10004 = 3 ^ 3;
      super();
      this.is = var2;
      this.setLayout((LayoutManager)null);
      this.setOpaque((boolean)var10004);
      this.gw = var1;
      Class655 var10000;
      if (this.gw == 3 >> 1) {
         var10000 = this;
         this.setPreferredSize(new Dimension(95 & 107, 119 & 78));
         this.ir = new JLabel("", --4);
         this.at = new JLabel("", 3 ^ 3);
         this.ir.setForeground(Color.red);
         this.at.setFont(Class681.bm);
         this.it = new Class44(var2) {
            protected void paintComponent(Graphics var1) {
               super.paintComponent(var1);
               if (Class655.this.ee) {
                  Graphics2D var2 = (Graphics2D)var1;
                  int var10001 = 5 >> 3;
                  var2.setComposite(Class8.m);
                  var2.setColor(Color.BLACK);
                  var2.fillRoundRect(var10001, 3 >> 2, 119 & 63, 119 & 63, 95 & 42, 95 & 42);
               }

            }
         };
         this.ir.setBounds(3 ^ 3, --5, 127 & 63, 95 & 47);
         this.at.setBounds(2 & 5, 127 & 55, 111 & 91, 111 & 31);
         this.it.setBounds(43 & 94, 2 & 5, 127 & 55, 127 & 55);
      } else {
         var10000 = this;
         this.setPreferredSize(new Dimension(63 & 119, 70 & 127));
         this.at = new JLabel("", 3 >> 2);
         this.at.setFont(Class681.ad);
         this.it.eq(Class511.q("sc/d/4.png", --5, --5, --5, --5, (boolean)(3 >> 2)));
         this.at.setBounds(2 & 5, 63 & 119, 63 & 119, 31 & 111);
         this.it.setBounds(3 >> 2, 3 >> 2, 55 & 127, 55 & 127);
      }

      if (var10000.ir != null) {
         this.add(this.ir);
      }

      if (this.at != null) {
         this.add(this.at);
      }

      if (this.it != null) {
         this.add(this.it);
      }

      this.ew((Goodstable)null, 3 ^ 3);
   }
}
