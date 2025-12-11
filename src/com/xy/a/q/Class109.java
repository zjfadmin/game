package com.xy.a.q;

import com.xy.readbean.Goodstable;
import java.awt.Color;
import java.awt.Graphics;

class Class109 extends com.xy.q.Class54 {
   // $VF: synthetic field
   final Class98 axi;
   private Class28 axj;

   public void ane(Class28 var1) {
      this.axj = var1;
      Goodstable var2 = this.axj != null ? this.axi.yt().ay(Class28.h(this.axj)) : null;
      byte var10001;
      Goodstable var10002;
      if (var2 != null) {
         var10001 = 1;
         var10002 = var2;
      } else {
         var10001 = 0;
         var10002 = var2;
      }

      this.gs(var10001, var10002);
      String var3;
      if (Class98.ajl(this.axi) != null && Class98.ajl(this.axi) == this.axj) {
         String var4 = "B\u000e\u001e\u000f\u001e>\u0002]\u0007CA\u0003V";
         var3 = "sc/b/S306.png";
      } else {
         var3 = null;
      }

      this.dq(var3);
   }

   public Class109(Class98 var1) {
      super(var1.eg());
      this.axi = var1;
   }

   // $VF: synthetic method
   static Class28 anf(Class109 var0) {
      return var0.axj;
   }

   @Override
   protected void paintComponent(Graphics var1) {
      super.paintComponent(var1);
      if (this.axj != null) {
         var1.setColor(Color.red);
         var1.setFont(com.xy.q.Class49.bz);
         var1.drawString(String.valueOf(Class28.e(this.axj)), 36, 14);
      }
   }
}
