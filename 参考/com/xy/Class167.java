package com.xy;

import java.awt.Graphics;
import javax.swing.JComponent;
import javax.swing.JScrollPane;

public class Class167 extends JComponent {
   private JScrollPane dw;
   private Class604 ip;

   protected void paintComponent(Graphics var1) {
      super.paintComponent(var1);
      if (this.ip != null) {
         this.ip.g(var1, this.getWidth(), this.getHeight());
      }

   }

   public void q() {
      this.setBounds(this.getX(), this.getY(), this.dw.getWidth(), this.dw.getHeight());
   }

   public void setBounds(int var1, int var2, int var3, int var4) {
      super.setBounds(var1, var2, var3, var4);
      if (this.ip != null) {
         this.dw.setBounds(122 & 15, --5, var3 - (111 & 31), var4 - (27 & 109));
      } else {
         this.dw.setBounds(2 & 5, 2 & 5, var3, var4);
      }
   }

   public Class167(Class604 var1, JScrollPane var2) {
      this.ip = var1;
      this.dw = var2;
      this.add(var2);
      this.setBounds(var2.getX(), var2.getY(), var2.getWidth(), var2.getHeight());
   }

   public void eq(Class604 var1) {
      this.ip = var1;
      this.setBounds(this.getX(), this.getY(), this.getWidth(), this.getHeight());
   }

   public JScrollPane ce() {
      return this.dw;
   }
}
