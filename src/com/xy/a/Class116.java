package com.xy.a;

import com.xy.richtext.RichLabel;
import com.xy.text.GameView;
import java.awt.Color;
import java.awt.Graphics;

public class Class116 extends com.xy.q.Class30 {
   private RichLabel[] aph;
   private int eg;
   private com.xy.w.Class18[] cl;

   public RichLabel[] ahl() {
      if (this.aph == null) {
         this.aph = new RichLabel[40];
      }

      int var1;
      for (int var10000 = var1 = 0; var10000 < 40; var10000 = ++var1) {
         int var2;
         if ((var2 = (this.eg - 1) * 40 + var1) < 168) {
            if (this.aph[var1] != null) {
               RichLabel var3 = this.aph[var1];
               String var10003 = "D";
               var3.setText("#" + var2);
            } else {
               String var10006 = "\u0006";
               this.aph[var1] = new RichLabel("#" + var2, com.xy.q.Class49.bz);
            }
         } else if (this.aph[var1] != null) {
            this.aph[var1].setText("");
         }
      }

      return this.aph;
   }

   // $VF: synthetic method
   static void ahm(Class116 var0, int var1) {
      var0.eg = var1;
   }

   // $VF: synthetic method
   static int ahn(Class116 var0) {
      return var0.eg;
   }

   public Class116(GameView var1) {
      super(52, 2, com.xy.q.Class30.afz, var1);
      String var10003 = "\u00144H3Hc^y\u00179\u0000";
      this.eg = 1;
      this.yy(-1, 0, 504, 348, com.xy.q.Class30.agf);
      this.yu(com.xy.w.Class16.m("sc/d/49.png", 6, 6, 6, 6, false), null);
      this.cl = new com.xy.w.Class18[40];

      int var2;
      for (int var10000 = var2 = 0; var10000 < 40; var10000 = var2) {
         int var3 = var2 % 8;
         int var4 = var2 / 8;
         this.cl[var2] = new com.xy.w.Class18();
         this.cl[var2].setBounds(5 + 60 * var3 + var3 * 2, 5 + 60 * var4 + var4 * 2, 60, 60);
         this.cl[var2].setBackground(com.xy.q.Class49.bk);
         this.cl[var2].addMouseListener(new Class139(this, var2));
         this.add(this.cl[var2++]);
      }

      for (int var7 = var2 = 0; var7 < 5; var7 = var2) {
         com.xy.q.Class14 var6 = com.xy.q.Class1.i(10 + var2 * 48, 318, 41, 25, 0, Color.WHITE, com.xy.q.Class49.ac);
         String var10004 = "V}\n|\n\\\u0014(\u00170UpB";
         var6.setText(String.valueOf(var2 + 1));
         var6.mt(com.xy.w.Class16.m("sc/b/B162.png", 6, 6, 6, 6, false));
         int var10006 = var2 + 1 + 100;
         var2++;
         var6.addMouseListener(new Class139(this, var10006));
         this.add(var6);
      }
   }

   @Override
   protected void paintComponent(Graphics var1) {
      super.paintComponent(var1);
      if (this.aph == null) {
         this.ahl();
      }

      int var2;
      for (int var10000 = var2 = 0; var10000 < this.aph.length; var10000 = ++var2) {
         if (this.aph[var2] != null && !this.aph[var2].getText().equals("")) {
            int var3 = var2 % 8;
            int var4 = var2 / 8;
            Graphics var5 = var1.create(8 + 62 * var3, 8 + 62 * var4, 50, 50);
            this.aph[var2].paint(var5);
            var5.dispose();
         }
      }
   }
}
