package com.xy.a;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.SwingUtilities;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreePath;

class Class101 extends MouseAdapter {
   // $VF: synthetic field
   final Class50 abf;

   Class101(Class50 var1) {
      this.abf = var1;
   }

   @Override
   public void mousePressed(MouseEvent var1) {
      DefaultMutableTreeNode var2 = (DefaultMutableTreeNode)Class50.sa(this.abf).getLastSelectedPathComponent();
      TreePath var3;
      if (SwingUtilities.isLeftMouseButton(var1) && (var3 = Class50.sa(this.abf).getSelectionPath()) != null) {
         if (Class50.sa(this.abf).isExpanded(var3)) {
            Class50.sa(this.abf).collapsePath(var3);
            return;
         }

         Class50.sa(this.abf).expandPath(var3);
      }
   }
}
