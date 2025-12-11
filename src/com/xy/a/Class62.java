package com.xy.a;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.SwingUtilities;
import javax.swing.tree.TreePath;

class Class62 extends MouseAdapter {
   // $VF: synthetic field
   final Class112 aav;

   Class62(Class112 var1) {
      this.aav = var1;
   }

   @Override
   public void mousePressed(MouseEvent var1) {
      TreePath var2;
      if (SwingUtilities.isLeftMouseButton(var1) && (var2 = Class112.agy(this.aav).getSelectionPath()) != null) {
         if (Class112.agy(this.aav).isExpanded(var2)) {
            Class112.agy(this.aav).collapsePath(var2);
            return;
         }

         Class112.agy(this.aav).expandPath(var2);
      }
   }
}
