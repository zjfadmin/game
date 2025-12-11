package com.xy.a.a;

import java.awt.Color;
import javax.swing.JComponent;
import javax.swing.JLabel;

class Class57 extends JComponent {
   // $VF: synthetic field
   final Class4 atg;
   private Class56[] ath;
   private com.xy.w.Class18[] fp;
   private JLabel im;

   public Class57(Class4 var1) {
      this.atg = var1;
      this.im = com.xy.q.Class1.f(15, 7, 70, 18, 0, Color.black, com.xy.q.Class49.ch);
      String var10005 = "安宿夽赦";
      this.im.setText("宝宝天资");
      this.add(this.im);
      this.ath = new Class56[6];

      int var2;
      for (int var10000 = var2 = 0; var10000 < this.ath.length; var10000 = var2) {
         Class57 var4;
         if (var2 < 3) {
            var4 = this;
            this.ath[var2] = new Class56(var1, 2, var2);
            this.ath[var2].setBounds(16 + var2 * 72, 25, 59, 57);
         } else {
            var4 = this;
            this.ath[var2] = new Class56(var1, 3, var2 - 3);
            this.ath[var2].setBounds(16 + (var2 - 3) * 73, 133, 60, 60);
         }

         var4.add(this.ath[var2++]);
      }

      this.fp = new com.xy.w.Class18[6];

      for (int var5 = var2 = 0; var5 < this.fp.length; var5 = var2) {
         this.fp[var2] = new com.xy.w.Class18();
         Class57 var6;
         if (var2 < 3) {
            var6 = this;
            com.xy.w.Class18 var7 = this.fp[var2];
            String var10003 = "[C\u0007D\u0007\u0013\u0010\u000eXNO";
            var7.dp("sc/d/38.png");
            this.fp[var2].setBounds(28 + var2 * 73, 79, 35, 79);
         } else {
            var6 = this;
            com.xy.w.Class18 var8 = this.fp[var2];
            String var10 = "Qw\rp\r'\u0012:RzE";
            var8.dp("sc/d/30.png");
            this.fp[var2].setBounds(17 + (var2 - 3) * 72, 82, 58, 1);
         }

         var6.add(this.fp[var2++]);
      }
   }

   // $VF: synthetic method
   static Class56[] alf(Class57 var0) {
      return var0.ath;
   }

   public void t() {
      int var1;
      for (int var10000 = var1 = 0; var10000 < this.ath.length; var10000 = var1) {
         com.xy.q.Class54 var2 = Class56.ale(this.ath[var1]);
         var1++;
         var2.gs(0, null);
      }
   }
}
