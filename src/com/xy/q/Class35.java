package com.xy.q;

import java.util.Vector;
import javax.swing.JTable;

class Class35 extends JTable {
   @Override
   public boolean isCellEditable(int var1, int var2) {
      return false;
   }

   Class35(Vector var1, Vector var2) {
      super(var1, var2);
   }
}
