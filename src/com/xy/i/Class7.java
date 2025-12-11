package com.xy.i;

import com.xy.a.a.Class33;
import com.xy.a.v.Class27;
import com.xy.q.Class30;
import com.xy.q.Class49;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;

public class Class7 extends Class8 {
   private Class30 cw;
   private int ah;

   public Class7(String var1, int var2, int var3, Font var4, Color[] var5, String[] var6, Class30 var7) {
      super(var1, var2, var5);
      this.ah = var3;
      this.cw = var7;
      Class7 var10000;
      if (var4 != null) {
         var10000 = this;
         this.setFont(var4);
      } else {
         var10000 = this;
         this.setFont(Class49.bz);
      }

      var10000.tg(var6);
   }

   public Class7(String var1, int var2, int var3, String[] var4, Class30 var5) {
      this(var1, var2, var3, null, null, var4, var5);
   }

   @Override
   public void cw(MouseEvent var1) {
   }

   public Class7(String var1, int var2, int var3, Class30 var4) {
      super(var1, var2);
      this.ah = var3;
      this.cw = var4;
   }

   @Override
   public void fe(MouseEvent var1, boolean var2) {
      if (this.ah >= 1 && this.ah <= 2) {
         if (var2) {
            ((Class33)this.cw).g(this.ah);
            return;
         }
      } else if (this.ah >= 3 && this.ah <= 6) {
         if (var2) {
            ((com.xy.a.a.Class19)this.cw).lm(this.ah - 3);
            return;
         }
      } else if (this.ah >= 7 && this.ah <= 10 && var2) {
         ((Class27)this.cw).g(this.ah - 7);
      }
   }
}
