package com.xy.q;

import java.awt.Component;
import javax.swing.JTable;
import javax.swing.JTable.DropLocation;
import javax.swing.table.DefaultTableCellRenderer;

class Class5 extends DefaultTableCellRenderer {
   @Override
   public Component getTableCellRendererComponent(JTable var1, Object var2, boolean var3, boolean var4, int var5, int var6) {
      if (var1 == null) {
         return this;
      } else {
         DropLocation var7;
         if ((var7 = var1.getDropLocation()) != null && !var7.isInsertRow() && !var7.isInsertColumn() && var7.getRow() == var5 && var7.getColumn() == var6) {
            var3 = true;
         }

         Class5 var10000;
         if (var3) {
            var10000 = this;
            super.setBackground(Class49.au);
         } else {
            var10000 = this;
            super.setBackground(Class49.bk);
         }

         var10000.setForeground(var1.getForeground());
         this.setFont(var1.getFont());
         this.setValue(var2);
         return this;
      }
   }
}
