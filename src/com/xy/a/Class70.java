package com.xy.a;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

class Class70 extends DefaultTableCellRenderer {
   // $VF: synthetic field
   final Class110 adh;

   Class70(Class110 var1) {
      this.adh = var1;
   }

   @Override
   public Component getTableCellRendererComponent(JTable var1, Object var2, boolean var3, boolean var4, int var5, int var6) {
      this.setForeground(Color.white);
      return super.getTableCellRendererComponent(var1, var2, var3, var4, var5, var6);
   }
}
