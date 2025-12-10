package com.xy;

import javax.swing.JComponent;

public class Class456 extends JComponent {
   public void repaint(long var1, int var3, int var4, int var5, int var6) {
   }

   public void setVisible(boolean var1) {
      if (var1 != this.isVisible()) {
         this.show(var1);
      }

   }

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
}
