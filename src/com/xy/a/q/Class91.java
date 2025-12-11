package com.xy.a.q;

import javax.swing.JTree;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;

class Class91 implements TreeSelectionListener {
   // $VF: synthetic field
   final Class20 abp;

   @Override
   public void valueChanged(TreeSelectionEvent var1) {
      DefaultMutableTreeNode var3;
      if ((var3 = (DefaultMutableTreeNode)((JTree)var1.getSource()).getLastSelectedPathComponent()) == null) {
         Class20.lq(this.abp).setViewportView(null);
      } else {
         if (var3.getUserObject() instanceof com.xy.v.Class11) {
            int var5 = Integer.parseInt(((com.xy.v.Class11)var3.getUserObject()).a());
            this.abp.ln(this.abp.yt().e(var5));
         }
      }
   }

   Class91(Class20 var1) {
      this.abp = var1;
   }
}
