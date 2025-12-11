package com.xy.a.q;

import java.awt.Color;
import javax.swing.JComponent;
import javax.swing.JLabel;

class Class27 extends JComponent {
   private com.xy.i.Class19 jv;
   private JLabel bd;
   private com.xy.i.Class19 tb;
   private com.xy.i.Class19 tc;
   private boolean dr;
   // $VF: synthetic field
   final Class19 td;
   private com.xy.i.Class19 te;
   private com.xy.i.Class19 qf;

   public void be(boolean var1) {
      this.dr = var1;
      this.bd.setVisible(var1);
      String var2;
      if (var1) {
         var2 = "\u0005oYoY:F";
         var2 = "sc/c/60";
      } else {
         var2 = "8HdIdi\u007f\u001f{\u0005;E,";
         var2 = "sc/b/B440.png";
      }

      this.jv.setImage(var2);
      if (var1) {
         this.jv.setBounds(173, 300, 25, 25);
      } else {
         this.jv.setBounds(98, 300, 100, 26);
      }
   }

   public boolean ah() {
      return this.dr;
   }

   public Class27(Class19 var1) {
      this.td = var1;
      this.setBounds(0, 0, 602, 375);
      this.jv = new com.xy.i.Class19(null, 1, 211, var1.eg());
      this.add(this.jv);
      String var10014 = "8HdIdi\u007f\u001fx\u0005;E,";
      this.tb = new com.xy.i.Class19("sc/b/B443.png", 1, 212, var1.eg());
      String var10013 = "\u0005oYnYNB8C\"\u0006b\u0011";
      this.qf = new com.xy.i.Class19("sc/b/B445.png", 1, 213, var1.eg());
      String var10012 = "8HdIdi\u007f\u001f}\u0005;E,";
      this.te = new com.xy.i.Class19("sc/b/B446.png", 1, 214, var1.eg());
      String var10011 = "\u0005oYnYNB8A\"\u0006b\u0011";
      this.tc = new com.xy.i.Class19("sc/b/B447.png", 1, 215, var1.eg());
      this.qf.setBounds(259, 276, 100, 25);
      this.te.setBounds(259, 305, 100, 25);
      this.tc.setBounds(439, 276, 100, 25);
      this.tb.setBounds(439, 305, 100, 25);
      this.tb.setVisible(false);
      this.add(this.tb);
      this.add(this.qf);
      this.add(this.te);
      this.add(this.tc);
      this.bd = com.xy.q.Class1.k(98, 300, 100, 26, Color.WHITE, com.xy.q.Class49.cp);
      String var10008 = "歈坣匒鄆";
      this.bd.setText("正在匹配");
      this.add(this.bd);
      this.be(false);
   }
}
