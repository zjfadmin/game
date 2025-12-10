package com.xy;

import com.xy.readbean.Activity;
import com.xy.socket.Agreement;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;

public class Class441 extends Class93 {
   private int cy;
   private int m;

   public void af(MouseEvent var1) {
      String var2;
      if (this.cy != 0) {
         if (this.cy == --3) {
            Class658.cy(22495 & 10414, this.form.aej);
         } else if (this.cy == --5) {
            Class658.cz(28919 & 4015, this.form.aej, new Integer(3 >> 1));
         } else if (this.cy > (108 & 119) && this.cy < (12507 & 20460)) {
            Activity var3;
            if ((var3 = this.form.vc().aq(this.cy)) != null) {
               if (var3.getModelId() == (4 ^ 5)) {
                  Class658.cz(30649 & 2286, this.form.aej, var3);
               } else if (var3.getModelId() == (1 ^ 3)) {
                  Class658.cz(4327 & 28607, this.form.aej, var3);
               } else {
                  if (var3.getModelId() == --3) {
                     Class658.cz(14779 & 18164, this.form.aej, var3);
                  }

               }
            }
         } else {
            var2 = Agreement.getSendTextAES("vicon", String.valueOf(this.cy));
            this.form.uw().d(var2);
         }
      } else if (this.m == (54 & 123)) {
         if (this.form.uw().gameType == 5 >> 1) {
            Class658.cy(111 & 119, this.form.aej);
         } else {
            Class658.cy(129, this.form.aej);
         }
      } else if (this.m == (118 & 61)) {
         var2 = Agreement.getSendTextAES("Paydaygradepay", (String)null);
         this.form.uw().d(var2);
      } else if (this.m == (125 & 58)) {
         Class658.cy(123 & 124, this.form.aej);
      } else if (this.m == (63 & 121)) {
         var2 = Agreement.getSendTextAES("getfivemsg", "VV2001");
         this.form.uw().d(var2);
      } else if (this.m == (111 & 84)) {
         Class658.cy(116 & 79, this.form.aej);
      } else {
         if (this.m == (22783 & 10134)) {
            Class658.cy(150, this.form.aej);
         }

      }
   }

   public Class441(String var1, int var2, int var3, Font var4, Color[] var5, String var6, Class345 var7) {
      super(var1, var2, var5, var7);
      this.m = var3;
      Class441 var10000;
      if (var4 != null) {
         this.setFont(var4);
         var10000 = this;
      } else {
         this.setFont(Class681.bm);
         var10000 = this;
      }

      var10000.setHorizontalAlignment(0);
      this.setText(var6);
   }

   public void y(int var1) {
      this.m = var1;
   }

   public int tp() {
      return this.cy;
   }

   public void ab(int var1) {
      this.cy = var1;
   }

   public int ae() {
      return this.m;
   }

   public void ac(MouseEvent var1, boolean var2) {
   }

   public Class441(String var1, int var2, int var3, String var4, Class345 var5) {
      this(var1, var2, var3, (Font)null, (Color[])null, var4, var5);
   }

   public Class441(String var1, int var2, int var3, Class345 var4) {
      super(var1, var2, var4);
      this.m = var3;
   }
}
