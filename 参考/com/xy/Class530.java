package com.xy;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.ImageObserver;
import javax.swing.Icon;

public class Class530 implements Icon {
   private int a;
   private int b;
   private int c;
   private Image d;
   private boolean e;
   private int f;

   public int getIconWidth() {
      return this.f;
   }

   public Class530(Image var1, int var2, int var3, int var4, int var5) {
      this.d = var1;
      this.f = var2;
      this.b = var3;
      this.c = var4;
      this.a = var5;
   }

   public int getIconHeight() {
      return this.b;
   }

   public void paintIcon(Component var1, Graphics var2, int var3, int var4) {
      Graphics2D var5;
      if (this.c == 0 && this.a == 0) {
         var2.drawImage(this.d, var3, var4, this.f, this.b, (ImageObserver)null);
         if (this.e) {
            var5 = (Graphics2D)var2;
            var5.setComposite(Class8.m);
            var5.setColor(Color.BLACK);
            var5.fillRect(var3, var4, this.f, this.b);
            var5.setComposite(Class8.g);
         }

      } else {
         var2.drawImage(this.d, var3 + this.c, var4 + this.a, this.f - (1 ^ 3) * this.c, this.b - --2 * this.a, (ImageObserver)null);
         if (this.e) {
            var5 = (Graphics2D)var2;
            var5.setComposite(Class8.m);
            var5.setColor(Color.BLACK);
            var5.fillRect(var3 + this.c, var4 + this.a, this.f - --2 * this.c, this.b - --2 * this.a);
            var5.setComposite(Class8.g);
         }

      }
   }

   public Class530(Image var1, int var2, int var3) {
      this.d = var1;
      this.f = var2;
      this.b = var3;
   }
}
