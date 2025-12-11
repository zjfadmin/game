package com.xy.w;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.Icon;

public class Class13 implements Icon {
   private int a;
   private Image b;
   private int c;
   private boolean d;
   private int e;
   private int f;

   public Class13(Image var1, int var2, int var3, int var4, int var5) {
      this.b = var1;
      this.a = var2;
      this.c = var3;
      this.f = var4;
      this.e = var5;
   }

   public Class13(Image var1, int var2, int var3) {
      this.b = var1;
      this.a = var2;
      this.c = var3;
   }

   @Override
   public void paintIcon(Component var1, Graphics var2, int var3, int var4) {
      if (this.f == 0 && this.e == 0) {
         var2.drawImage(this.b, var3, var4, this.a, this.c, null);
         if (this.d) {
            Graphics2D var6 = (Graphics2D)var2;
            var6.setComposite(Class1.l);
            var6.setColor(Color.BLACK);
            var6.fillRect(var3, var4, this.a, this.c);
            var6.setComposite(Class1.c);
         }
      } else {
         var2.drawImage(this.b, var3 + this.f, var4 + this.e, this.a - 2 * this.f, this.c - 2 * this.e, null);
         if (this.d) {
            Graphics2D var5 = (Graphics2D)var2;
            var5.setComposite(Class1.l);
            var5.setColor(Color.BLACK);
            var5.fillRect(var3 + this.f, var4 + this.e, this.a - 2 * this.f, this.c - 2 * this.e);
            var5.setComposite(Class1.c);
         }
      }
   }

   @Override
   public int getIconHeight() {
      return this.c;
   }

   @Override
   public int getIconWidth() {
      return this.a;
   }
}
