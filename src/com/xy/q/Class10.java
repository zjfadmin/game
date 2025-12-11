package com.xy.q;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.SwingUtilities;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreePath;

class Class10 extends MouseAdapter {
   // $VF: synthetic field
   final Class47 qi;

   @Override
   public void mouseClicked(MouseEvent var1) {
      MouseEvent var10000;
      label32: {
         if (Class47.ajn(this.qi)) {
            DefaultMutableTreeNode var2;
            if ((var2 = (DefaultMutableTreeNode)Class47.ajo(this.qi).getLastSelectedPathComponent()) != null && var2.getUserObject() instanceof Class34) {
               var10000 = var1;
               this.qi.ajp(var2, var1.getButton());
               break label32;
            }

            TreePath var3;
            if (SwingUtilities.isRightMouseButton(var1) && (var3 = Class47.ajo(this.qi).getClosestPathForLocation(var1.getX(), var1.getY())) != null) {
               var2 = (DefaultMutableTreeNode)var3.getLastPathComponent();
               this.qi.ajp(var2, var1.getButton());
            }
         }

         var10000 = var1;
      }

      TreePath var5;
      if (SwingUtilities.isLeftMouseButton(var10000) && (var5 = Class47.ajo(this.qi).getSelectionPath()) != null) {
         if (Class47.ajo(this.qi).isExpanded(var5)) {
            Class47.ajo(this.qi).collapsePath(var5);
            return;
         }

         Class47.ajo(this.qi).expandPath(var5);
      }
   }

   Class10(Class47 var1) {
      this.qi = var1;
   }
}
