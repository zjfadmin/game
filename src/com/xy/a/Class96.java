package com.xy.a;

import com.xy.readbean.petExchange;
import javax.swing.JTree;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;

class Class96 implements TreeSelectionListener {
   // $VF: synthetic field
   final Class80 adl;

   @Override
   public void valueChanged(TreeSelectionEvent var1) {
      DefaultMutableTreeNode var3;
      if ((var3 = (DefaultMutableTreeNode)((JTree)var1.getSource()).getLastSelectedPathComponent()) == null) {
         this.adl.lr(null);
      } else {
         if (var3.isLeaf()) {
            int var5 = Integer.parseInt(((com.xy.v.Class11)var3.getUserObject()).a());
            petExchange var6 = Class80.zm(this.adl).yt().e(var5);
            this.adl.lr(var6);
         }
      }
   }

   Class96(Class80 var1) {
      this.adl = var1;
   }
}
