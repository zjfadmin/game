package com.xy.a.q;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.SwingUtilities;
import javax.swing.tree.TreePath;

class Class110 extends MouseAdapter {
   // $VF: synthetic field
   final Class20 abp;

   Class110(Class20 var1) {
      this.abp = var1;
   }

   @Override
   public void mouseClicked(MouseEvent var1) {
      TreePath var2;
      if (SwingUtilities.isLeftMouseButton(var1) && (var2 = Class20.lp(this.abp).getSelectionPath()) != null) {
         if (Class20.lp(this.abp).isExpanded(var2)) {
            Class20.lp(this.abp).collapsePath(var2);
            return;
         }

         Class20.lp(this.abp).expandPath(var2);
      }
   }
}
