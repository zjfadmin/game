package com.xy;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;
import javax.swing.JComponent;

public class Class379 extends Class93 {
   private JComponent ko;
   private int cy;
   private int m;

   public Class379(String var1, int var2, int var3, Font var4, Color[] var5, String var6, Class345 var7, JComponent var8) {
      super(var1, var2, var5, var7);
      this.cy = var3;
      this.ko = var8;
      Class379 var10000;
      if (var4 != null) {
         this.setFont(var4);
         var10000 = this;
      } else {
         this.setFont(Class681.bm);
         var10000 = this;
      }

      var10000.setHorizontalAlignment(0);
      this.setVerticalTextPosition(3 >> 2);
      this.setText(var6);
   }

   public Class379(String var1, int var2, int var3, Class345 var4, JComponent var5) {
      int var10001 = 5 >> 3;
      int var10003 = 3 ^ 3;
      super(var1, var2, var4);
      this.cy = var3;
      this.ko = var5;
      this.setHorizontalAlignment(var10003);
      this.setVerticalTextPosition(var10001);
   }

   public int tp() {
      return this.m;
   }

   public Class379(String var1, int var2, int var3, Class345 var4) {
      super(var1, var2, var4);
      this.cy = var3;
      this.form = var4;
   }

   public Class379(String var1, int var2, int var3, Font var4, Color[] var5, String var6, Class345 var7) {
      super(var1, var2, var5, var7);
      this.cy = var3;
      Class379 var10000;
      if (var4 != null) {
         this.setFont(var4);
         var10000 = this;
      } else {
         this.setFont(Class681.bm);
         var10000 = this;
      }

      var10000.setHorizontalAlignment(0);
      this.setVerticalTextPosition(3 & 4);
      this.setText(var6);
   }

   public int ae() {
      return this.cy;
   }

   public void af(MouseEvent var1) {
      if (this.ko != null) {
         if (this.ko instanceof Class100) {
            ((Class100)this.ko).ab(this.cy);
         } else if (this.ko instanceof Class16) {
            ((Class16)this.ko).y(this.cy);
         } else if (this.ko instanceof Class71) {
            ((Class71)this.ko).cf(this.cy, this.m);
         } else if (this.ko instanceof Class532) {
            ((Class532)this.ko).as(this.cy);
         } else {
            if (this.ko instanceof Class137) {
               ((Class137)this.ko).ab(this.cy);
            }

         }
      } else if (this.cy == (32764 & 143)) {
         ((Class94)this.form).d();
      } else if (this.cy != (4351 & 28557) && this.cy != (7647 & 25262)) {
         if (this.cy == (10423 & 22495)) {
            ((Class575)this.form).y(Integer.parseInt(this.getName()));
         } else if (this.cy != (10929 & 21999) && this.cy != (27135 & 5794)) {
            if (this.cy >= (7669 & 25278) && this.cy <= (13239 & 19711)) {
               ((Class41)this.form).cf(this.cy, this.m);
            } else if (this.cy >= (4351 & 28607) && this.cy <= (20959 & 12006)) {
               ((Class475)this.form).cf(this.cy, this.m);
            } else if (this.cy == (24285 & 8683)) {
               ((Class450)this.form).y(this.cy);
            } else if (this.cy == (8109 & 24959)) {
               ((Class395)this.form).y(this.cy);
            } else {
               if (this.cy >= (32057 & 1023) && this.cy <= (25954 & 7133)) {
                  ((Class455)this.form).cf(this.cy, this.m);
               }

            }
         } else {
            ((Class11)this.form).c(this.cy, Integer.parseInt(this.getName()));
         }
      } else {
         ((Class34)this.form).wy(this.cy, (Object)null);
      }
   }

   public void ac(MouseEvent var1, boolean var2) {
      if (this.cy >= --1 && this.cy <= (61 & 86)) {
         if (var2) {
            ((Class316)this.form).jc(this.cy, this.m);
            return;
         }
      } else if (this.cy >= (95 & 53) && this.cy <= (95 & 62)) {
         if (var2) {
            ((Class311)this.form).y(this.cy);
            return;
         }
      } else if (this.cy == (127 & 31)) {
         if (var2) {
            ((Class75)this.form).y(this.m);
            return;
         }
      } else if (this.cy == (42 & 117)) {
         if (var2) {
            ((Class694)this.form).y(this.m);
            return;
         }
      } else if (this.cy == (22735 & 10175)) {
         if (var2) {
            ((Class34)this.form).wy(this.cy, Integer.parseInt(this.getName()));
            return;
         }
      } else {
         if (this.cy == (4850 & 28063)) {
            ((Class34)this.form).wy(this.cy, Integer.parseInt(this.getName()));
            return;
         }

         if (this.cy >= (3247 & 29691) && this.cy <= (22205 & 10735)) {
            ((Class214)this.form).y(this.cy - (7595 & 25343));
            return;
         }

         if (this.cy == (23543 & 9535)) {
            ((Class455)this.form).as(this.m);
            return;
         }

         if (this.cy == (15801 & 17278)) {
            ((Class455)this.form).y(this.m);
         }
      }

   }

   public void y(int var1) {
      this.m = var1;
   }

   public Class379(String var1, int var2, int var3, String var4, Class345 var5) {
      this(var1, var2, var3, (Font)null, (Color[])null, var4, var5);
   }

   public void ab(int var1) {
      this.cy = var1;
   }
}
