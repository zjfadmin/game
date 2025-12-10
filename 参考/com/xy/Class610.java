package com.xy;

import java.awt.Image;

public class Class610 {
   private int a;
   private Image b;

   public boolean a() {
      return (boolean)((this.a -= 4 ^ 5) < 0 ? --1 : 0);
   }

   public void b(int var1) {
      this.a = var1;
   }

   public int c() {
      return this.a;
   }

   public Class610(int var1, Image var2) {
      this.a = var1;
      this.b = var2;
   }

   public void d(Image var1) {
      this.b = var1;
   }

   public Image e() {
      return this.b;
   }
}
