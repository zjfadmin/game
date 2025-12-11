package com.xy.a.q;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JComponent;

class Class1 extends JComponent implements MouseListener {
   // $VF: synthetic field
   final Class41 dk;
   private Class9[] dl;
   private com.xy.w.Class18 dm;
   private com.xy.w.Class18 dn;

   @Override
   public void mouseReleased(MouseEvent var1) {
   }

   @Override
   public void mouseClicked(MouseEvent var1) {
   }

   @Override
   public void mouseExited(MouseEvent var1) {
   }

   @Override
   public void mouseEntered(MouseEvent var1) {
   }

   @Override
   public void mousePressed(MouseEvent var1) {
   }

   public Class1(Class41 var1) {
      this.dk = var1;
      String var10008 = "p\u0006,\u0001,T:Ks\u000bd";
      this.dm = new com.xy.w.Class18(com.xy.w.Class16.m("sc/d/19.png", 5, 5, 5, 5, false));
      this.dm.setBounds(9, 9, 206, 104);
      this.add(this.dm);
      this.dl = new Class9[8];

      int var2;
      for (int var10000 = var2 = 0; var10000 < this.dl.length; var10000 = var2) {
         this.dl[var2] = new Class9(var1, var2);
         this.dl[var2].setBounds(10 + var2 % 4 * 51, 10 + var2 / 4 * 51, 51, 51);
         this.add(this.dl[var2++]);
      }

      String var10006 = ">MbJb\u001d{\u0000=@*";
      this.dn = new com.xy.w.Class18(com.xy.w.Class16.m("sc/d/36.png", 20, 20, 20, 20, false));
      this.dn.setBounds(0, 0, 224, 122);
      this.add(this.dn);
      this.addMouseListener(this);
   }
}
