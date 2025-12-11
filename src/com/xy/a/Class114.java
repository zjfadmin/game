package com.xy.a;

import java.awt.Component;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeCellRenderer;

class Class114 extends DefaultTreeCellRenderer {
   // $VF: synthetic field
   final Class80 adl;

   Class114(Class80 var1) {
      this.adl = var1;
   }

   @Override
   public Component getTreeCellRendererComponent(JTree var1, Object var2, boolean var3, boolean var4, boolean var5, int var6, boolean var7) {
      DefaultMutableTreeNode var8;
      DefaultMutableTreeNode var10000 = var8 = (DefaultMutableTreeNode)var2;
      super.getTreeCellRendererComponent(var1, var2, var3, var4, var5, var6, var7);
      if (var10000.getLevel() == 2) {
         com.xy.v.Class11 var9 = (com.xy.v.Class11)var8.getUserObject();
         this.setText(var9.d());
      }

      return this;
   }
}
