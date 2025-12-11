package com.xy.a.q;

import java.awt.Component;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeCellRenderer;

class Class72 extends DefaultTreeCellRenderer {
   // $VF: synthetic field
   final Class20 abp;

   @Override
   public Component getTreeCellRendererComponent(JTree var1, Object var2, boolean var3, boolean var4, boolean var5, int var6, boolean var7) {
      DefaultMutableTreeNode var8;
      DefaultMutableTreeNode var10000 = var8 = (DefaultMutableTreeNode)var2;
      super.getTreeCellRendererComponent(var1, var2, var3, var4, var5, var6, var7);
      if (var10000.getUserObject() instanceof com.xy.v.Class11) {
         com.xy.v.Class11 var9 = (com.xy.v.Class11)var8.getUserObject();
         this.setText(var9.d());
      }

      return this;
   }

   Class72(Class20 var1) {
      this.abp = var1;
   }
}
