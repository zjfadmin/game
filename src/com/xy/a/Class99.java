package com.xy.a;

import com.xy.readbean.TaskData;
import javax.swing.JTree;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;

class Class99 implements TreeSelectionListener {
   // $VF: synthetic field
   final Class50 abf;

   @Override
   public void valueChanged(TreeSelectionEvent var1) {
      DefaultMutableTreeNode var3;
      if ((var3 = (DefaultMutableTreeNode)((JTree)var1.getSource()).getLastSelectedPathComponent()) != null && var3.isLeaf()) {
         this.abf.sb((TaskData)var3.getUserObject());
      }
   }

   Class99(Class50 var1) {
      this.abf = var1;
   }
}
