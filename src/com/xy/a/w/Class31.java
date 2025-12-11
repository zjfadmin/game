package com.xy.a.w;

import com.xy.q.Class49;
import javax.swing.JLabel;

class Class31 extends com.xy.w.Class18 {
   private Class16[] axk;
   // $VF: synthetic field
   final Class21 axl;
   private JLabel[] au;

   // $VF: synthetic method
   static Class16[] ang(Class31 var0) {
      return var0.axk;
   }

   public Class31(Class21 var1) {
      this.axl = var1;
      this.au = new JLabel[3];

      int var2;
      for (int var10000 = var2 = 0; var10000 < this.au.length; var10000 = var2) {
         String var10007 = "Nt+U)/^$";
         this.au[var2] = com.xy.q.Class1.f(0, 0, 0, 0, 0, Class49.c("#cFBD833"), var2 == 0 ? Class49.bf : Class49.bz);
         Class31 var4;
         if (var2 == 0) {
            var4 = this;
            this.au[var2].setBounds(0, 2, 170, 34);
         } else if (var2 == 1) {
            var4 = this;
            JLabel var10002 = this.au[var2];
            String var10003 = "闖浃";
            var10002.setText("门派");
            this.au[var2].setBounds(48, 39, 36, 14);
         } else {
            if (var2 == 2) {
               JLabel var6 = this.au[var2];
               String var9 = "Nt]'+Q]'";
               var6.setForeground(Class49.c("#c00FF00"));
               this.au[var2].setHorizontalAlignment(10);
               this.au[var2].setBounds(86, 39, 72, 14);
            }

            var4 = this;
         }

         var4.add(this.au[var2++]);
      }

      this.axk = new Class16[5];

      for (int var5 = var2 = 0; var5 < this.axk.length; var5 = var2) {
         this.axk[var2] = new Class16(var1);
         Class16 var10 = this.axk[var2];
         String var10004 = "\u000e]RZR\nD\u0010\rP\u001a";
         var10.mt(com.xy.w.Class16.m("sc/d/49.png", 6, 6, 6, 6, false));
         this.axk[var2].setBounds(2, 56 + var2 * 49, 165, 45);
         this.add(this.axk[var2++]);
      }
   }

   // $VF: synthetic method
   static JLabel[] anh(Class31 var0) {
      return var0.au;
   }
}
