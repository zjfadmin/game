package com.xy.a.v;

import java.awt.Color;
import javax.swing.JLabel;

class Class4 extends com.xy.q.Class50 {
   private com.xy.w.Class18 co;
   private com.xy.i.Class22 gp;
   private JLabel[] ay;
   private com.xy.w.Class18 af;
   // $VF: synthetic field
   final Class20 gq;
   private com.xy.i.Class22 gr;

   public Class4(Class20 var1, int var2, Class20 var3) {
      this.gq = var1;
      String var10013 = "\u00173K5Ka]`J \n7";
      String var10018 = "飘視";
      this.gp = new com.xy.i.Class22("sc/e/190.png", 1, 194, com.xy.q.Class49.bx, null, "预览", var3);
      String var10012 = "\u00173K5Ka\\gJ \n7";
      String var10017 = "窂抓";
      this.gr = new com.xy.i.Class22("sc/e/187.png", 1, 195, com.xy.q.Class49.bx, null, "竞拍", var3);
      String var10009 = "G3&e\\gQd";
      this.gp.setForeground(com.xy.q.Class49.c("#cB58754"));
      this.gp.setBounds(170, 43, 49, 24);
      this.gr.setBounds(228, 38, 67, 35);
      this.gp.g(var2);
      this.gr.g(var2);
      this.add(this.gp);
      this.add(this.gr);
      this.ay = new JLabel[5];

      int var4;
      for (int var10000 = var4 = 0; var10000 < this.ay.length; var10000 = var4) {
         Class4 var5;
         if (var4 == 0) {
            var5 = this;
            String var10007 = "\u007f=hfhmom";
            this.ay[var4] = com.xy.q.Class1.k(22, 18, 200, 24, com.xy.q.Class49.c("#c484333"), com.xy.q.Class49.ah);
         } else if (var4 == 1) {
            var5 = this;
            this.ay[var4] = com.xy.q.Class1.k(23, 56, 70, 16, Color.black, com.xy.q.Class49.w);
         } else if (var4 == 2) {
            var5 = this;
            this.ay[var4] = com.xy.q.Class1.k(23, 79, 70, 16, Color.black, com.xy.q.Class49.w);
         } else if (var4 == 3) {
            var5 = this;
            this.ay[var4] = com.xy.q.Class1.k(86, 56, 80, 16, Color.red, com.xy.q.Class49.ac);
         } else {
            if (var4 == 4) {
               this.ay[var4] = com.xy.q.Class1.k(86, 79, 80, 16, Color.red, com.xy.q.Class49.ac);
            }

            var5 = this;
         }

         JLabel var6 = var5.ay[var4];
         String var7;
         if (var4 == 1) {
            var7 = "飠赽攔j";
            var7 = "预购数:";
         } else if (var4 == 2) {
            var7 = "窂抓享d";
            var7 = "竞拍价:";
         } else {
            var7 = "";
         }

         var6.setText(var7);
         this.add(this.ay[var4++]);
      }

      String var10008 = "\u00173K4Ka]iJ \n7";
      this.af = new com.xy.w.Class18("sc/d/199.png");
      String var9 = "/=s:soeir.29";
      this.co = new com.xy.w.Class18(com.xy.w.Class16.m("sc/d/197.png", 10, 10, 10, 10, false));
      this.af.setBounds(288, 20, 24, 70);
      this.co.setBounds(0, 0, 312, 110);
      this.add(this.af);
      this.add(this.co);
   }

   public void fj(int var1, int var2, int var3) {
      this.gp.g(var1);
      this.gr.g(var1);
      this.ay[0].setText(String.valueOf(var1));
      this.ay[3].setText(String.valueOf(var2));
      this.ay[4].setText(String.valueOf(var3));
      this.setVisible(var1 != 0);
   }
}
