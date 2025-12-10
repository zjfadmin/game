package com.xy;

import java.awt.Color;
import java.awt.event.MouseEvent;

public class Class216 extends Class93 {
   private Class679 ap;
   private Class116 aq;
   private int m;

   public void ab(int var1) {
      this.m = var1;
   }

   public Class216(String var1, int var2, String var3, int var4, Class345 var5) {
      int var10003 = 2 & 5;
      super(var1, var2, var5);
      this.m = var4;
      this.setFont(Class681.bm);
      this.setForeground(Color.white);
      this.setHorizontalAlignment(var10003);
      this.setText(var3);
   }

   public Class216(String var1, int var2, int var3) {
      super(var1, var2, (Class345)null);
      this.m = var3;
   }

   public void ac(MouseEvent var1, boolean var2) {
      if (var2) {
         if (this.ap != null) {
            if (this.m <= (-2 & -99)) {
               Class345 var10000 = this.form;
               Class216[] var10001 = this.ap.f();
               int var10002 = this.aq.d;
               int var10003;
               Class216 var10004;
               if (this.aq.c == --1) {
                  var10003 = 5 >> 2;
                  var10004 = this;
               } else {
                  var10003 = 0;
                  var10004 = this;
               }

               int var3;
               Class216 var10005;
               if (var10004.m == (-67 & -34)) {
                  var3 = 2 ^ 3;
                  var10005 = this;
               } else {
                  var3 = 0;
                  var10005 = this;
               }

               Class216[] var4 = var10000.vg(var10001, var10002, (boolean)var10003, var3, var10005.aq.a, this.aq.b);
               this.ap.n(var4, 3 & 4);
            } else {
               this.ap.d(this.m - this.ap.g());
            }
         } else {
            if (this.form != null) {
               this.d();
            }

         }
      }
   }

   public void ad(Class116 var1) {
      this.aq = var1;
   }

   public Class216(String var1, int var2, int var3, Class345 var4) {
      super(var1, var2, var4);
      this.m = var3;
   }

   public int ae() {
      return this.m;
   }

   public void af(MouseEvent var1) {
      if (this.ap != null) {
         this.ap.d(this.m);
      }

   }

   public Class116 ag() {
      return this.aq;
   }

   public void ah(Class679 var1) {
      this.ap = var1;
   }

   public void d() {
   }
}
