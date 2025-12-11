package com.xy.q;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import sun.swing.table.DefaultTableCellHeaderRenderer;

class Class55 extends DefaultTableCellHeaderRenderer {
   @Override
   public Component getTableCellRendererComponent(JTable var1, Object var2, boolean var3, boolean var4, int var5, int var6) {
      if (var1 == null) {
         return this;
      } else {
         super.setBackground(Class49.bk);
         super.setForeground(Color.white);
         this.setFont(Class49.ch);
         this.setValue(var2);
         return this;
      }
   }
}
