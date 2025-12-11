package com.xy.q;

import javax.swing.JTree;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;

class Class59 implements TreeSelectionListener {
   // $VF: synthetic field
   final Class47 qi;

   Class59(Class47 var1) {
      this.qi = var1;
   }

   @Override
   public void valueChanged(TreeSelectionEvent var1) {
      DefaultMutableTreeNode var3;
      if ((var3 = (DefaultMutableTreeNode)((JTree)var1.getSource()).getLastSelectedPathComponent()) != null) {
         this.qi.ajp(var3, 1);
      }
   }
}
