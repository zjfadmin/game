package com.xy.v;

class Class21 implements Runnable {
   // $VF: synthetic field
   private final boolean k;
   // $VF: synthetic field
   final Class16 a;

   @Override
   public void run() {
      try {
         Class16.m(this.a, this.k);
         if (!this.k) {
            Class1.g(this.a.c);
            return;
         }
      } catch (InterruptedException var2) {
         if (!this.k) {
            Class1.g(this.a.c);
         }
      }
   }

   Class21(Class16 var1, boolean var2) {
      this.a = var1;
      this.k = var2;
   }
}
