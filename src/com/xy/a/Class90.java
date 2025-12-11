package com.xy.a;

import java.awt.Color;
import javax.swing.JComponent;
import javax.swing.JLabel;

class Class90 extends JComponent {
   // $VF: synthetic field
   final Class56 ajz;
   private com.xy.i.Class18 ce;
   private JLabel im;

   public String jg() {
      return this.im.getText();
   }

   public Class90(Class56 var1, String var2) {
      this.ajz = var1;
      this.im = com.xy.q.Class1.k(5, 0, 150, 20, Color.white, com.xy.q.Class49.ac);
      this.im.setText(var2);
      String var10007 = "V\u0012\n\u0014\n@\u0011A\u000b\u0001K\u0016";
      this.ce = new com.xy.i.Class18("sc/e/140.png", 1, 343, var1.eg());
      this.ce.gw(this);
      this.ce.setBounds(160, 4, 12, 12);
      this.add(this.im);
      this.add(this.ce);
   }
}
