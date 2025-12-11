package com.xy.w;

import com.xy.q.Class30;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.JComponent;

public class Class18 extends JComponent {
   protected Class9 acm;
   protected Image hf;
   private Integer ayh;
   protected Image bp;

   public void l() {
      this.bp = null;
   }

   @Override
   public void setBounds(int var1, int var2, int var3, int var4) {
      try {
         if (this.getX() != var1) {
            Class30.agd.set(this, var1);
         }

         if (this.getY() != var2) {
            Class30.aga.set(this, var2);
         }

         if (this.getWidth() != var3) {
            Class30.agk.set(this, var3);
         }

         if (this.getHeight() != var4) {
            Class30.afy.set(this, var4);
            return;
         }
      } catch (Exception var6) {
         var6.printStackTrace();
      }
   }

   public void ant(double var1, int var3) {
      Class18 var10000;
      if (var1 <= 0.0) {
         var3 = 0;
         var10000 = this;
      } else {
         if (var1 < 1.0) {
            var3 = (int)(var3 * var1);
         }

         var10000 = this;
      }

      var10000.setBounds(this.getX(), this.getY(), var3, this.getHeight());
   }

   public void anu(double var1) {
      if (var1 <= 0.0) {
         this.ayh = 0;
      } else if (var1 >= 1.0) {
         this.ayh = this.getWidth() - 2;
      } else {
         this.ayh = (int)((this.getWidth() - 2) * var1);
      }
   }

   public Class18() {
   }

   public Class18(Image var1) {
      this.bp = var1;
   }

   @Override
   public void setVisible(boolean var1) {
      if (var1 != this.isVisible()) {
         this.show(var1);
      }
   }

   @Override
   protected void paintComponent(Graphics var1) {
      Class18 var10000;
      label24: {
         if (this.bp != null) {
            if (this.ayh != null) {
               var10000 = this;
               var1.drawImage(this.bp, 1, 0, this.ayh, this.getHeight(), null);
               break label24;
            }

            var1.drawImage(this.bp, 0, 0, this.getWidth(), this.getHeight(), null);
         }

         var10000 = this;
      }

      if (var10000.hf != null) {
         var1.drawImage(this.hf, 0, 0, this.getWidth(), this.getHeight(), null);
      } else {
         if (this.acm != null) {
            this.acm.g(var1, this.getWidth(), this.getHeight());
         }
      }
   }

   public void dp(String var1) {
      this.bp = Class16.c(var1);
   }

   public Class18(String var1) {
      this.bp = Class16.c(var1);
   }

   public void dq(String var1) {
      this.hf = Class16.c(var1);
   }

   public void gr(Image var1) {
      this.hf = var1;
   }

   public Class18(Class9 var1) {
      this.acm = var1;
   }

   @Override
   public void repaint(long var1, int var3, int var4, int var5, int var6) {
   }

   public Image gu() {
      return this.bp;
   }

   public void t() {
      this.hf = null;
   }

   public void mt(Class9 var1) {
      this.acm = var1;
   }

   public void gt(Image var1) {
      this.bp = var1;
   }
}
