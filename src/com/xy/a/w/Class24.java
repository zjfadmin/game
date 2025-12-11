package com.xy.a.w;

import com.xy.q.Class49;
import com.xy.q.Class54;
import javax.swing.JLabel;

class Class24 extends com.xy.w.Class18 {
   // $VF: synthetic field
   final Class26 aip;
   private Class54 ada;
   private JLabel im;

   public Class24(Class26 var1, int var2, int var3) {
      this.aip = var1;
      if (var2 == 0) {
         this.ada = new Class54(var1.eg());
         this.ada.setBounds(2, 2, 38, 38);
         this.add(this.ada);
         String var10008 = "e\n\u007fP\u007fP\u007fP";
         this.im = com.xy.q.Class1.f(2, 2, 38, 38, 0, Class49.c("#c999999"), Class49.bz);
         String var4;
         if (var3 == 0) {
            var4 = "牯敔";
            var4 = "特效";
         } else if (var3 == 1) {
            var4 = "袬餶咨";
            var4 = "装饰品";
         } else if (var3 == 2) {
            var4 = "趥迥";
            var4 = "足迹";
         } else if (var3 == 3) {
            var4 = "羃臩";
            var4 = "翅膀";
         } else {
            var4 = "";
         }

         this.im.setText(var4);
         this.add(this.im);
         String var10002 = "ou3r3$(8lx{";
         this.mt(com.xy.w.Class16.m("sc/d/24.png", 2, 2, 2, 2, false));
      }
   }

   // $VF: synthetic method
   static Class54 abd(Class24 var0) {
      return var0.ada;
   }
}
