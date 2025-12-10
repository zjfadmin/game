package com.xy;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ImageObserver;
import javax.swing.JComponent;

public class Class436 extends JComponent {
   protected Image bx;
   protected Image rg;
   protected Class604 ame;
   private Integer amf;

   public void setBounds(int var1, int var2, int var3, int var4) {
      try {
         if (this.getX() != var1) {
            Class345.ael.set(this, var1);
         }

         if (this.getY() != var2) {
            Class345.aem.set(this, var2);
         }

         if (this.getWidth() != var3) {
            Class345.aeh.set(this, var3);
         }

         if (this.getHeight() != var4) {
            Class345.aek.set(this, var4);
            return;
         }
      } catch (Exception var5) {
         var5.printStackTrace();
      }

   }

   public Class436(String var1) {
      this.rg = Class511.a(var1);
   }

   public Class436(Class604 var1) {
      this.ame = var1;
   }

   public void aed(double var1) {
      if (var1 <= 0.0D) {
         this.amf = 3 >> 2;
      } else if (var1 >= 1.0D) {
         this.amf = this.getWidth() - (5 >> 1);
      } else {
         this.amf = (int)((double)(this.getWidth() - --2) * var1);
      }
   }

   public void cc() {
      this.bx = null;
   }

   public Class436() {
   }

   public void aee(double var1, int var3) {
      Class436 var10000;
      if (var1 <= 0.0D) {
         var3 = 3 >> 2;
         var10000 = this;
      } else {
         if (var1 < 1.0D) {
            var3 = (int)((double)var3 * var1);
         }

         var10000 = this;
      }

      var10000.setBounds(this.getX(), this.getY(), var3, this.getHeight());
   }

   public Image ga() {
      return this.rg;
   }

   public void q() {
      this.rg = null;
   }

   public void fw(String var1) {
      this.rg = Class511.a(var1);
   }

   public void ach(Image var1) {
      this.bx = var1;
   }

   public void repaint(long var1, int var3, int var4, int var5, int var6) {
   }

   public void setVisible(boolean var1) {
      if (var1 != this.isVisible()) {
         this.show(var1);
      }
   }

   public Class436(Image var1) {
      this.rg = var1;
   }

   protected void paintComponent(Graphics var1) {
      Class436 var10000;
      label22: {
         if (this.rg != null) {
            if (this.amf != null) {
               var1.drawImage(this.rg, --1, 3 >> 2, this.amf, this.getHeight(), (ImageObserver)null);
               var10000 = this;
               break label22;
            }

            var1.drawImage(this.rg, 3 ^ 3, 3 ^ 3, this.getWidth(), this.getHeight(), (ImageObserver)null);
         }

         var10000 = this;
      }

      if (var10000.bx != null) {
         var1.drawImage(this.bx, 5 >> 3, 5 >> 3, this.getWidth(), this.getHeight(), (ImageObserver)null);
      } else {
         if (this.ame != null) {
            this.ame.g(var1, this.getWidth(), this.getHeight());
         }

      }
   }

   public void fx(String var1) {
      this.bx = Class511.a(var1);
   }

   public void eq(Class604 var1) {
      this.ame = var1;
   }

   public void hf(Image var1) {
      this.rg = var1;
   }
}
