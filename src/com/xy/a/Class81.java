package com.xy.a;

import com.xy.readbean.TaskData;
import java.awt.Component;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeCellRenderer;

class Class81 extends DefaultTreeCellRenderer {
   // $VF: synthetic field
   final Class50 abf;

   @Override
   public Component getTreeCellRendererComponent(JTree var1, Object var2, boolean var3, boolean var4, boolean var5, int var6, boolean var7) {
      super.getTreeCellRendererComponent(var1, var2, var3, var4, var5, var6, var7);
      DefaultMutableTreeNode var8;
      if ((var8 = (DefaultMutableTreeNode)var2).getUserObject() instanceof TaskData) {
         TaskData var9 = (TaskData)var8.getUserObject();
         this.setText(var9.getTaskName());
      }

      return this;
   }

   Class81(Class50 var1) {
      this.abf = var1;
   }
}
