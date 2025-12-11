package com.xy.q;

import javax.swing.JComponent;

public class Class50 extends JComponent {
   @Override
   public void repaint(long var1, int var3, int var4, int var5, int var6) {
   }

   @Override
   public void setVisible(boolean var1) {
      if (var1 != this.isVisible()) {
         this.show(var1);
      }
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
}
