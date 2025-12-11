package com.xy.a.q;

import java.awt.Color;
import javax.swing.JComponent;
import javax.swing.JLabel;

class Class31 extends JComponent {
   private com.xy.i.Class19 tb;
   private com.xy.i.Class19 tc;
   private boolean dr;
   private com.xy.i.Class19 kc;
   // $VF: synthetic field
   final Class19 vl;
   private JLabel im;

   public void be(boolean var1) {
      this.dr = var1;
      this.im.setVisible(var1);
      String var2;
      if (var1) {
         var2 = "@E\u001cE\u001c\u0010\u0003";
         var2 = "sc/c/60";
      } else {
         var2 = "eO9N9n\"\u001f/\u0002fBq";
         var2 = "sc/b/B439.png";
      }

      this.tc.setImage(var2);
      if (var1) {
         this.tc.setBounds(482, 239, 25, 25);
      } else {
         this.tc.setBounds(407, 239, 100, 26);
      }
   }

   public Class31(Class19 var1) {
      this.vl = var1;
      this.setBounds(0, 0, 602, 375);
      this.tc = new com.xy.i.Class19(null, 1, 208, var1.eg());
      this.add(this.tc);
      String var10007 = "eO9N9n\"\u0018%\u0002fBq";
      this.kc = new com.xy.i.Class19("sc/b/B443.png", 1, 209, var1.eg());
      this.kc.setBounds(259, 211, 100, 25);
      this.add(this.kc);
      String var10008 = "@E\u001cD\u001cd\u0007\u0012\u0007\bCHT";
      this.tb = new com.xy.i.Class19("sc/b/B444.png", 1, 210, var1.eg());
      this.tb.setBounds(259, 240, 100, 25);
      this.add(this.tb);
      this.im = com.xy.q.Class1.k(407, 239, 100, 26, Color.WHITE, com.xy.q.Class49.cp);
      String var10006 = "歏圾匕酛";
      this.im.setText("正在匹配");
      this.add(this.im);
      this.be(false);
   }

   public boolean ah() {
      return this.dr;
   }
}
