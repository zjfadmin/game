package com.xy.a.v;

import java.awt.Color;
import javax.swing.JLabel;

class Class13 extends com.xy.q.Class50 {
   private JLabel df;
   private JLabel ad;
   private JLabel dh;
   private com.xy.w.Class18 af;
   private com.xy.i.Class22 bl;
   // $VF: synthetic field
   final Class22 pj;

   public void cc(int var1, int var2) {
      this.bl.g(var1);
      this.dh.setText(String.valueOf(var1));
      this.df.setText(String.valueOf(var2));
      this.setVisible(var1 != 0);
   }

   public Class13(Class22 var1, int var2, Class22 var3) {
      this.pj = var1;
      String var10016 = "_u\u0003s\u0003'\u0014/\u0002fBq";
      this.bl = new com.xy.i.Class22("sc/e/189.png", 1, 180, var3);
      this.bl.setBounds(125, 19, 27, 27);
      String var10015 = "\u0019&\u000e}\u000ev\tv";
      this.dh = com.xy.q.Class1.k(11, 9, 120, 24, com.xy.q.Class49.c("#c484333"), com.xy.q.Class49.ah);
      String var10013 = "\u000fu\u001aP\u001a/\u0019!";
      this.ad = com.xy.q.Class1.k(14, 38, 50, 16, com.xy.q.Class49.c("#c6F6957"), com.xy.q.Class49.ac);
      this.df = com.xy.q.Class1.k(54, 38, 70, 16, Color.red, com.xy.q.Class49.cp);
      String var10006 = "禪刼｟";
      this.ad.setText("积分：");
      String var10005 = " ";
      this.df.setText("6");
      var10006 = "I&\u0015!\u0015t\u0003}\u00145T\"";
      this.af = new com.xy.w.Class18("sc/d/198.png");
      this.af.setBounds(0, 0, 156, 66);
      this.add(this.bl);
      this.add(this.dh);
      this.add(this.ad);
      this.add(this.df);
      this.add(this.af);
   }
}
