package com.xy.a.i;

import com.xy.q.Class49;
import com.xy.readbean.LaborVip;
import java.awt.Color;
import javax.swing.JLabel;

class Class43 {
   private JLabel a;
   private LaborVip b;
   private com.xy.i.Class11 c;
   // $VF: synthetic field
   final Class28 d;

   // $VF: synthetic method
   static com.xy.i.Class11 a(Class43 var0) {
      return var0.c;
   }

   // $VF: synthetic method
   static LaborVip b(Class43 var0) {
      return var0.b;
   }

   public Class43(Class28 var1, int var2) {
      this.d = var1;
      this.a = com.xy.q.Class1.f(0, 0, 0, 0, 0, Color.black, Class49.ac);
      String var10004 = "pS,R,r0\u0000;\u001es^d";
      this.c = new com.xy.i.Class11("sc/b/B308.png", 1, 53, var1.eg());
      this.c.setName(String.valueOf(var2));
   }

   // $VF: synthetic method
   static JLabel c(Class43 var0) {
      return var0.a;
   }

   public void d(LaborVip var1, int var2, int var3) {
      this.b = var1;
      Class43 var10000;
      if (var2 != 0 && var2 != 2) {
         var10000 = this;
         String var10003 = "&\u0003z\u0002z\"fPmN%\u000e2";
         this.c.setBtn(1, "sc/b/B308.png");
      } else {
         String var4;
         if (var2 == 0) {
            var4 = "&\u0003z\u0002z\"fPlN%\u000e2";
            var4 = "sc/b/B309.png";
         } else {
            var4 = "pS,R,r0\u00013\u001es^d";
            var4 = "sc/b/B310.png";
         }

         this.c.setBtn(-1, var4);
         var10000 = this;
      }

      var10000.c.setBounds(var3, 184, 45, 36);
      this.a.setText(String.valueOf(var1.getMoney()));
      this.a.setBounds(var3, 220, 45, 18);
   }
}
