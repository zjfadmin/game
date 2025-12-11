package com.xy.a.i;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JComponent;

class Class21 extends JComponent implements MouseListener {
   // $VF: synthetic field
   final Class10 aba;
   private com.xy.w.Class18 af;
   private Class8[] abb;
   private com.xy.w.Class18 dn;

   @Override
   public void mouseClicked(MouseEvent var1) {
   }

   @Override
   public void mouseEntered(MouseEvent var1) {
   }

   public Class21(Class10 var1) {
      this.aba = var1;
      String var10008 = "03l4laz~3>$";
      this.af = new com.xy.w.Class18(com.xy.w.Class16.m("sc/d/19.png", 5, 5, 5, 5, false));
      this.af.setBounds(9, 9, 206, 104);
      this.add(this.af);
      this.abb = new Class8[8];

      int var2;
      for (int var10000 = var2 = 0; var10000 < this.abb.length; var10000 = var2) {
         this.abb[var2] = new Class8(var1, var2);
         this.abb[var2].setBounds(10 + var2 % 4 * 51, 10 + var2 / 4 * 51, 51, 51);
         this.add(this.abb[var2++]);
      }

      String var10006 = "P<\f;\fl\u0015qS1D";
      this.dn = new com.xy.w.Class18(com.xy.w.Class16.m("sc/d/36.png", 20, 20, 20, 20, false));
      this.dn.setBounds(0, 0, 224, 122);
      this.add(this.dn);
      this.addMouseListener(this);
   }

   @Override
   public void mousePressed(MouseEvent var1) {
   }

   @Override
   public void mouseExited(MouseEvent var1) {
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
   }
}
