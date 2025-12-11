package com.xy.q;

import java.awt.Graphics;
import javax.swing.JComponent;
import javax.swing.JScrollPane;

public class Class39 extends JComponent {
   private com.xy.w.Class9 qk;
   private JScrollPane l;

   public Class39(com.xy.w.Class9 var1, JScrollPane var2) {
      this.qk = var1;
      this.l = var2;
      this.add(var2);
      this.setBounds(var2.getX(), var2.getY(), var2.getWidth(), var2.getHeight());
   }

   @Override
   protected void paintComponent(Graphics var1) {
      super.paintComponent(var1);
      if (this.qk != null) {
         this.qk.g(var1, this.getWidth(), this.getHeight());
      }
   }

   public JScrollPane cn() {
      return this.l;
   }

   @Override
   public void setBounds(int var1, int var2, int var3, int var4) {
      super.setBounds(var1, var2, var3, var4);
      if (this.qk != null) {
         this.l.setBounds(10, 5, var3 - 15, var4 - 9);
      } else {
         this.l.setBounds(0, 0, var3, var4);
      }
   }

   public void mt(com.xy.w.Class9 var1) {
      this.qk = var1;
      this.setBounds(this.getX(), this.getY(), this.getWidth(), this.getHeight());
   }

   public void t() {
      this.setBounds(this.getX(), this.getY(), this.l.getWidth(), this.l.getHeight());
   }
}
