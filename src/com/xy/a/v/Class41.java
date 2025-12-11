package com.xy.a.v;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.JTable.DropLocation;
import javax.swing.table.DefaultTableCellRenderer;

class Class41 extends DefaultTableCellRenderer {
   // $VF: synthetic field
   final Class10 alo;

   Class41(Class10 var1) {
      this.alo = var1;
   }

   @Override
   public Component getTableCellRendererComponent(JTable var1, Object var2, boolean var3, boolean var4, int var5, int var6) {
      if (var1 == null) {
         return this;
      } else {
         DropLocation var7;
         if ((var7 = var1.getDropLocation()) != null && !var7.isInsertRow() && !var7.isInsertColumn() && var7.getRow() == var5 && var7.getColumn() == var6) {
            var3 = true;
         }

         Class41 var10000;
         if (var3) {
            var10000 = this;
            super.setBackground(com.xy.q.Class49.au);
         } else {
            var10000 = this;
            super.setBackground(com.xy.q.Class49.bk);
         }

         var10000.setForeground(var5 < 32 ? Color.black : Color.red);
         this.setFont(var1.getFont());
         this.setValue(var2);
         return this;
      }
   }
}
