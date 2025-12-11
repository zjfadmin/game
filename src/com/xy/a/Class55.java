package com.xy.a;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.JComponent;

class Class55 extends JComponent {
   Image[] zl;
   com.xy.i.Class10[] zm;
   // $VF: synthetic field
   final Class74 zn;
   Image bp;

   @Override
   protected void paintComponent(Graphics var1) {
      int var10000 = 0;
      super.paintComponent(var1);

      for (int var2 = 0; var10000 < this.zl.length; var10000 = var2) {
         if (this.zl[var2] == null) {
            return;
         }

         var1.drawImage(this.bp, var2 * 71, 0, null);
         Image var10002 = this.zl[var2];
         int var10003 = var2 * 71 + 7;
         var2++;
         var1.drawImage(var10002, var10003, 7, 60, 60, null);
      }
   }

   public Class55(Class74 var1) {
      super();
      String var10003 = "Qw\rw\r!\u0011";
      this.zn = var1;
      this.bp = com.xy.w.Class16.c("sc/c/53");
      this.zl = new Image[5];
      this.zm = new com.xy.i.Class10[4];
      this.setVisible(false);
   }
}
