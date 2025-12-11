package com.xy.a.q;

import java.awt.Component;
import javax.swing.JTable;
import javax.swing.JTable.DropLocation;
import javax.swing.table.DefaultTableCellRenderer;

class Class38 extends DefaultTableCellRenderer {
   // $VF: synthetic field
   final Class103 cx;

   @Override
   public Component getTableCellRendererComponent(JTable var1, Object var2, boolean var3, boolean var4, int var5, int var6) {
      if (var1 == null) {
         return this;
      } else {
         DropLocation var7;
         if ((var7 = var1.getDropLocation()) != null && !var7.isInsertRow() && !var7.isInsertColumn() && var7.getRow() == var5 && var7.getColumn() == var6) {
            var3 = true;
         }

         int var10000;
         if (var3) {
            var10000 = var6;
            super.setBackground(com.xy.q.Class49.au);
         } else {
            super.setBackground(com.xy.q.Class49.bk);
            var10000 = var6;
         }

         Class38 var8;
         if (var10000 == 0) {
            this.setForeground(this.cx.aln((String)var2));
            var8 = this;
         } else {
            var8 = this;
            super.setForeground(var1.getForeground());
         }

         var8.setFont(var1.getFont());
         this.setValue(var2);
         return this;
      }
   }

   Class38(Class103 var1) {
      this.cx = var1;
   }
}
