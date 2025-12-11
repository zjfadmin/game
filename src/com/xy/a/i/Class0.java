package com.xy.a.i;

import java.awt.Component;
import javax.swing.JTree;
import javax.swing.tree.DefaultTreeCellRenderer;

class Class0 extends DefaultTreeCellRenderer {
   // $VF: synthetic field
   final Class36 bm;

   Class0(Class36 var1) {
      this.bm = var1;
   }

   @Override
   public Component getTreeCellRendererComponent(JTree var1, Object var2, boolean var3, boolean var4, boolean var5, int var6, boolean var7) {
      super.getTreeCellRendererComponent(var1, var2, var3, var4, var5, var6, var7);
      if (var2 instanceof Class33) {
         this.setForeground(((Class33)var2).aew());
      }

      return this;
   }
}
