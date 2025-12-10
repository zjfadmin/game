package com.xy;

import javax.swing.JLabel;
import javax.swing.JTextField;

public class Class186 {
   private JLabel a;
   private JLabel b;
   private Class319 c;
   private JTextField d;

   public void a(JLabel var1) {
      this.a = var1;
   }

   public Class186(JLabel var1, Class319 var2) {
      this.b = var1;
      this.c = var2;
      this.d = var2.jj();
   }

   public JTextField b() {
      return this.d;
   }

   public Class319 c() {
      return this.c;
   }

   public void d(JLabel var1) {
      this.b = var1;
   }

   public JLabel e() {
      return this.a;
   }

   public Class186(JLabel var1, JLabel var2) {
      this.b = var1;
      this.a = var2;
   }

   public void f(boolean var1) {
      if (this.b != null) {
         this.b.setVisible(var1);
      }

      if (this.a != null) {
         this.a.setVisible(var1);
      }

      if (this.d != null) {
         this.d.setVisible(var1);
      }

   }

   public void g(JTextField var1) {
      this.d = var1;
   }

   public void h(Class319 var1) {
      this.c = var1;
   }

   public JLabel i() {
      return this.b;
   }
}
