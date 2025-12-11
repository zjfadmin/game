package com.xy.a;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.SwingUtilities;
import javax.swing.tree.TreePath;

class Class73 extends MouseAdapter {
   // $VF: synthetic field
   final Class80 adl;

   Class73(Class80 var1) {
      this.adl = var1;
   }

   @Override
   public void mousePressed(MouseEvent var1) {
      if (SwingUtilities.isLeftMouseButton(var1)) {
         TreePath var2;
         if ((var2 = Class80.zn(this.adl).getSelectionPath()) != null) {
            if (Class80.zn(this.adl).isExpanded(var2)) {
               Class80.zn(this.adl).collapsePath(var2);
            } else {
               Class80.zn(this.adl).expandPath(var2);
            }
         }
      }
   }
}
