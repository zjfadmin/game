package com.xy.a;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeCellRenderer;

class Class33 extends DefaultTreeCellRenderer {
   // $VF: synthetic field
   final Class112 rq;
   Color rr;

   @Override
   public Component getTreeCellRendererComponent(JTree var1, Object var2, boolean var3, boolean var4, boolean var5, int var6, boolean var7) {
      DefaultMutableTreeNode var8;
      DefaultMutableTreeNode var10000 = var8 = (DefaultMutableTreeNode)var2;
      super.getTreeCellRendererComponent(var1, var2, var3, var4, var5, var6, var7);
      if (var10000.getLevel() == 1) {
         this.setForeground(this.rr);
         this.setFont(com.xy.q.Class49.ac);
      }

      if (var8.getLevel() == 2) {
         this.setFont(com.xy.q.Class49.ac);
      }

      return this;
   }

   Class33(Class112 var1) {
      this.rq = var1;
      this.rr = new Color(237, 234, 0);
   }
}
