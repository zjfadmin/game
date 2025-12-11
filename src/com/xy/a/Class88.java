package com.xy.a;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.JTable.DropLocation;
import javax.swing.table.DefaultTableCellRenderer;

class Class88 extends DefaultTableCellRenderer {
   // $VF: synthetic field
   final Class11 aju;

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
            var10000 = var5;
            super.setBackground(com.xy.q.Class49.au);
         } else {
            super.setBackground(com.xy.q.Class49.bk);
            var10000 = var5;
         }

         Class88 var8;
         if (var10000 < 3) {
            var8 = this;
            super.setForeground(Color.yellow);
         } else {
            var8 = this;
            super.setForeground(Color.white);
         }

         var8.setFont(var1.getFont());
         this.setValue(var2);
         return this;
      }
   }

   Class88(Class11 var1) {
      this.aju = var1;
   }
}
