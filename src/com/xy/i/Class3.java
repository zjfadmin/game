package com.xy.i;

import com.xy.q.Class30;
import com.xy.q.Class49;
import java.awt.Color;
import java.awt.event.MouseEvent;

public class Class3 extends Class1 {
   private int eg;
   private Class23 uo;

   public void h() {
   }

   @Override
   public void cw(MouseEvent var1) {
      if (this.uo != null) {
         this.uo.i(this.eg);
      }
   }

   public void or(Class23 var1) {
      this.uo = var1;
   }

   public Class3(String var1, int var2, int var3) {
      super(var1, var2, null);
      this.eg = var3;
   }

   public Class3(String var1, int var2, int var3, Class30 var4) {
      super(var1, var2, var4);
      this.eg = var3;
   }

   public Class3(String var1, int var2, String var3, int var4, Class30 var5) {
      super(var1, var2, var5);
      this.eg = var4;
      this.setFont(Class49.bz);
      this.setForeground(Color.white);
      this.setHorizontalAlignment(0);
      this.setText(var3);
   }

   @Override
   public void fe(MouseEvent var1, boolean var2) {
      if (var2) {
         if (this.uo != null) {
            this.uo.i(this.eg);
         } else {
            if (this.form != null) {
               this.h();
            }
         }
      }
   }
}
