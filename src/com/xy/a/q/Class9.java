package com.xy.a.q;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JComponent;

class Class9 extends JComponent implements MouseListener {
   private int ds;
   private Image at;
   // $VF: synthetic field
   final Class41 jt;

   @Override
   public void mouseReleased(MouseEvent var1) {
   }

   public Class9(Class41 var1, int var2) {
      this.jt = var1;
      this.ds = var2;
      this.at = com.xy.w.Class15.d(String.valueOf(746 + var2 * 3));
      this.addMouseListener(this);
   }

   @Override
   protected void paintComponent(Graphics var1) {
      super.paintComponent(var1);
      var1.drawImage(Class41.gu(), 0, 0, this.getWidth(), this.getHeight(), null);
      var1.drawImage(this.at, 1, 1, this.getWidth() - 2, this.getHeight() - 2, null);
   }

   @Override
   public void mouseEntered(MouseEvent var1) {
   }

   @Override
   public void mousePressed(MouseEvent var1) {
   }

   @Override
   public void mouseExited(MouseEvent var1) {
   }

   @Override
   public void mouseClicked(MouseEvent var1) {
      Class41.sw(this.jt)[2].gs(16, 746 + this.ds * 3);
      Class41.sv(this.jt, false);
   }
}
