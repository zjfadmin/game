package com.xy.a;

import com.xy.readbean.Goodstable;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.math.BigDecimal;
import javax.swing.JComponent;
import javax.swing.JLabel;

class Class12 extends JComponent {
   private int aa;
   private int cn;
   private BigDecimal ee;
   // $VF: synthetic field
   final Class93 fr;
   private JLabel dh;
   private JLabel fs;
   private boolean bi;
   private com.xy.q.Class54 ft;

   @Override
   protected void paintComponent(Graphics var1) {
      if (this.fr.afx.dh()) {
         this.t();
      }
   }

   public void t() {
      if (this.ee != null) {
         int var1 = this.fr.yx().getGoodNum(this.ee);
         JLabel var10001 = this.fs;
         StringBuilder var10002 = new StringBuilder(String.valueOf(var1));
         String var10003 = "V";
         var10001.setText(var10002.append("/").append(this.aa).toString());
         this.fs.setForeground(var1 >= this.aa ? Color.green : Color.red);
      }
   }

   public void be(boolean var1) {
      this.bi = var1;
   }

   public BigDecimal em() {
      return this.ee;
   }

   public void cb(Goodstable var1, int var2) {
      this.ee = var1 != null ? var1.getGoodsid() : null;
      this.aa = var2;
      byte var10001;
      Goodstable var10002;
      if (var1 != null) {
         var10001 = 1;
         var10002 = var1;
      } else {
         var10001 = 0;
         var10002 = var1;
      }

      this.ft.gs(var10001, var10002);
      this.ft.setVisible(true);
      if (this.ee != null) {
         this.t();
      } else {
         this.fs.setText(null);
      }
   }

   public Class12(Class93 var1, int var2) {
      this.fr = var1;
      this.setLayout(null);
      this.setOpaque(false);
      this.cn = var2;
      this.setPreferredSize(new Dimension(55, 70));
      this.fs = new JLabel("", 0);
      this.fs.setFont(com.xy.q.Class49.bm);
      this.ft = new com.xy.q.Class54(var1.eg());
      String var10005 = "\u0019DECE\u0013DW\u0004@";
      this.ft.mt(com.xy.w.Class16.m("sc/d/4.png", 5, 5, 5, 5, false));
      this.ft.wp(com.xy.q.Class54.aum);
      this.ft.setBounds(0, 0, 55, 55);
      this.fs.setBounds(0, 55, 55, 15);
      if (this.dh != null) {
         this.add(this.dh);
      }

      if (this.fs != null) {
         this.add(this.fs);
      }

      if (this.ft != null) {
         this.add(this.ft);
      }

      this.cb(null, 0);
   }

   public boolean ah() {
      return this.bi;
   }

   public JLabel en() {
      return this.fs;
   }
}
