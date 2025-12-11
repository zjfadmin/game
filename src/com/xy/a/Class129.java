package com.xy.a;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

class Class129 implements MouseListener {
   private int ds;
   // $VF: synthetic field
   final Class138 awl;
   private boolean cf;

   @Override
   public void mousePressed(MouseEvent var1) {
   }

   public void be(boolean var1) {
      this.cf = var1;
      com.xy.w.Class18 var10000 = Class138.anv(this.awl)[2 + this.ds];
      String var2;
      if (var1) {
         var2 = "d\u000e8\b8^'Cg\u0003p";
         var2 = "sc/e/30.png";
      } else {
         var2 = "co?i?>)\"`bw";
         var2 = "sc/e/29.png";
      }

      var10000.dp(var2);
   }

   // $VF: synthetic method
   static boolean amj(Class129 var0) {
      return var0.cf;
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
   }

   @Override
   public void mouseExited(MouseEvent var1) {
   }

   @Override
   public void mouseClicked(MouseEvent var1) {
      this.be(!this.cf);
   }

   public Class129(Class138 var1, int var2) {
      this.awl = var1;
      this.ds = var2;
   }

   @Override
   public void mouseEntered(MouseEvent var1) {
   }
}
