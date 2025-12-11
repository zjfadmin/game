package com.xy.a.q;

import com.xy.readbean.Goodstable;
import java.awt.Color;
import java.awt.Dimension;
import java.math.BigDecimal;
import javax.swing.JComponent;
import javax.swing.JLabel;

public class Class7 extends JComponent {
   private com.xy.q.Class54 hr;
   private com.xy.q.Class30 hs;
   private BigDecimal ee;
   private int cb;
   private JLabel dh;
   private JLabel fs;
   private boolean bi;
   private int ah;

   public BigDecimal em() {
      return this.ee;
   }

   public void bn(Goodstable var1, int var2, int var3) {
      this.ee = var1 != null ? var1.getGoodsid() : null;
      this.cb = var2;
      this.bi = var3 == 1;
      byte var10001;
      Goodstable var10002;
      if (var1 != null) {
         var10001 = 1;
         var10002 = var1;
      } else {
         var10001 = 0;
         var10002 = var1;
      }

      this.hr.gs(var10001, var10002);
      this.hr.setVisible(true);
      if (this.ee != null) {
         this.fs.setText(var2 > 1 ? String.valueOf(var2) : null);
         this.dh.setText(var1.getGoodsname());
         this.dh.setForeground(Color.BLACK);
      } else {
         this.fs.setText(null);
         this.dh.setText(null);
      }
   }

   public void be(boolean var1) {
      this.bi = var1;
   }

   public boolean ah() {
      return this.bi;
   }

   public void cb(Goodstable var1, int var2) {
      this.ee = var1 != null ? var1.getGoodsid() : null;
      this.cb = var2;
      byte var10001;
      Goodstable var10002;
      if (var1 != null) {
         var10001 = 1;
         var10002 = var1;
      } else {
         var10001 = 0;
         var10002 = var1;
      }

      this.hr.gs(var10001, var10002);
      this.hr.setVisible(true);
      if (this.ee != null) {
         this.t();
      } else {
         this.dh.setText(null);
      }
   }

   // $VF: synthetic method
   static boolean fo(Class7 var0) {
      return var0.bi;
   }

   public void t() {
      if (this.ee != null) {
         int var1 = this.hs.yx().getGoodNum(this.ee);
         JLabel var10001 = this.dh;
         StringBuilder var10002 = new StringBuilder(String.valueOf(var1));
         String var10003 = "8";
         var10001.setText(var10002.append("/").append(this.cb).toString());
         this.dh.setForeground(var1 >= this.cb ? Color.green : Color.red);
      }
   }

   public JLabel en() {
      return this.dh;
   }

   public Class7(int var1, com.xy.q.Class30 var2) {
      this.hs = var2;
      this.setLayout(null);
      this.setOpaque(false);
      this.ah = var1;
      Class7 var10000;
      if (this.ah == 1) {
         var10000 = this;
         this.setPreferredSize(new Dimension(75, 70));
         this.fs = new JLabel("", 4);
         this.dh = new JLabel("", 0);
         this.fs.setForeground(Color.red);
         this.dh.setFont(com.xy.q.Class49.bz);
         this.hr = new Class76(this, var2);
         this.fs.setBounds(0, 5, 63, 15);
         this.dh.setBounds(0, 55, 75, 15);
         this.hr.setBounds(10, 0, 55, 55);
      } else {
         var10000 = this;
         this.setPreferredSize(new Dimension(55, 70));
         this.dh = new JLabel("", 0);
         this.dh.setFont(com.xy.q.Class49.bm);
         String var10004 = "'K{L{\u001czX:O";
         this.hr.mt(com.xy.w.Class16.m("sc/d/4.png", 5, 5, 5, 5, false));
         this.dh.setBounds(0, 55, 55, 15);
         this.hr.setBounds(0, 0, 55, 55);
      }

      if (var10000.fs != null) {
         this.add(this.fs);
      }

      if (this.dh != null) {
         this.add(this.dh);
      }

      if (this.hr != null) {
         this.add(this.hr);
      }

      this.cb(null, 0);
   }
}
