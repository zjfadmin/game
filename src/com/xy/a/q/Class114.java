package com.xy.a.q;

import com.xy.readbean.Goodstable;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.math.BigDecimal;
import javax.swing.JComponent;
import javax.swing.JLabel;

class Class114 extends JComponent {
   private JLabel bd;
   private int ha;
   // $VF: synthetic field
   final Class86 axx;
   private int ae;
   private BigDecimal bn;
   private com.xy.q.Class54 ada;
   private JLabel im;

   public void cb(Goodstable var1, int var2) {
      this.bn = var1 != null ? var1.getGoodsid() : null;
      this.ha = var2;
      byte var10001;
      Goodstable var10002;
      if (var1 != null) {
         var10001 = 1;
         var10002 = var1;
      } else {
         var10001 = 0;
         var10002 = var1;
      }

      this.ada.gs(var10001, var10002);
      if (this.bn != null) {
         this.im.setText(var2 > 1 ? String.valueOf(var2) : null);
         this.bd.setText(var1.getGoodsname());
         this.bd.setForeground(Color.WHITE);
      } else {
         this.im.setText(null);
         this.bd.setText(null);
      }
   }

   public Class114(Class86 var1, int var2) {
      this.axx = var1;
      this.ae = var2;
      this.setOpaque(false);
      this.setLayout(null);
      this.ada = new com.xy.q.Class54(var1.eg());
      this.ada.setBounds(15, 12, 46, 46);
      this.im = new JLabel("", 4);
      this.bd = new JLabel("", 0);
      this.im.setForeground(Color.red);
      this.bd.setFont(com.xy.q.Class49.bz);
      this.im.setBounds(43, 17, 18, 15);
      this.bd.setBounds(0, 60, 76, 15);
      this.add(this.im);
      this.add(this.bd);
      this.add(this.ada);
   }

   @Override
   protected void paintComponent(Graphics var1) {
      super.paintComponent(var1);
      Graphics2D var2 = (Graphics2D)var1;
      var2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
      var2.setColor(this.ae == Class86.age(this.axx) ? com.xy.q.Class49.cj : com.xy.q.Class49.ca);
      var2.fillOval(3, 0, 70, 70);
   }
}
