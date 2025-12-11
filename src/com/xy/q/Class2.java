package com.xy.q;

import javax.swing.JLabel;
import javax.swing.JTextField;

public class Class2 {
   private JLabel a;
   private Class27 b;
   private JLabel c;
   private JTextField d;

   public void a(JTextField var1) {
      this.d = var1;
   }

   public Class27 b() {
      return this.b;
   }

   public JTextField c() {
      return this.d;
   }

   public Class2(JLabel var1, Class27 var2) {
      this.c = var1;
      this.b = var2;
      this.d = var2.ty();
   }

   public JLabel d() {
      return this.a;
   }

   public Class2(JLabel var1, JLabel var2) {
      this.c = var1;
      this.a = var2;
   }

   public void e(JLabel var1) {
      this.a = var1;
   }

   public JLabel f() {
      return this.c;
   }

   public void g(boolean var1) {
      if (this.c != null) {
         this.c.setVisible(var1);
      }

      if (this.a != null) {
         this.a.setVisible(var1);
      }

      if (this.d != null) {
         this.d.setVisible(var1);
      }
   }

   public void h(JLabel var1) {
      this.c = var1;
   }

   public void i(Class27 var1) {
      this.b = var1;
   }
}
