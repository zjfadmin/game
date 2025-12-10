package com.xy;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;

public class Class226 extends Class13 {
   private int cy;
   private Class345 pr;

   public Class226(String var1, int var2, int var3, Class345 var4) {
      super(var1, var2);
      this.cy = var3;
      this.pr = var4;
   }

   public Class226(String var1, int var2, int var3, Font var4, Color[] var5, String[] var6, Class345 var7) {
      super(var1, var2, var5);
      this.cy = var3;
      this.pr = var7;
      Class226 var10000;
      if (var4 != null) {
         this.setFont(var4);
         var10000 = this;
      } else {
         this.setFont(Class681.bm);
         var10000 = this;
      }

      var10000.df(var6);
   }

   public Class226(String var1, int var2, int var3, String[] var4, Class345 var5) {
      this(var1, var2, var3, (Font)null, (Color[])null, var4, var5);
   }

   public void af(MouseEvent var1) {
   }

   public void ac(MouseEvent var1, boolean var2) {
      if (this.cy >= (2 ^ 3) && this.cy <= (1 ^ 3)) {
         if (var2) {
            ((Class31)this.pr).y(this.cy);
            return;
         }
      } else if (this.cy >= --3 && this.cy <= (39 & 94)) {
         if (var2) {
            ((Class95)this.pr).do(this.cy - --3);
            return;
         }
      } else if (this.cy >= (55 & 79) && this.cy <= (42 & 95)) {
         if (var2) {
            ((Class94)this.pr).y(this.cy - (7 & 127));
            return;
         }
      } else if (this.cy >= (31 & 107) && this.cy <= (79 & 61)) {
         if (var2) {
            ((Class395)this.pr).as(this.cy - (15 & 123));
            return;
         }
      } else if (this.cy >= (53 & 95) && this.cy <= (127 & 22) && var2) {
         ((Class300)this.pr).y(this.cy - (85 & 62));
      }

   }
}
