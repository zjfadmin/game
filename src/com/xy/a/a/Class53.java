package com.xy.a.a;

import com.xy.entity.Mount;
import com.xy.i.Class18;
import com.xy.i.Class4;
import com.xy.q.Class49;
import com.xy.text.GameView;

public class Class53 extends com.xy.q.Class30 {
   private int ae;
   private com.xy.i.Class4[] ly;
   private com.xy.q.Class30[] yo;
   private com.xy.w.Class18 dn;

   public Class53(GameView var1) {
      super(172, 2, com.xy.q.Class30.afz, var1);
      String var10003 = "\u0018'D DuE4\u0005#";
      this.yy(-1, 0, 743, 519, com.xy.q.Class30.agh);
      com.xy.w.Class9 var5 = com.xy.w.Class16.m("sc/d/1.png", 68, 68, 68, 68, false);
      String var10004 = "'圸骖H";
      this.yu(var5, " 坐骑 ");
      this.ly = new com.xy.i.Class4[2];

      int var2;
      for (int var10000 = var2 = 0; var10000 < this.ly.length; var10000 = var2) {
         com.xy.i.Class4[] var3 = this.ly;
         var10004 = "7\bk\u000ekX|E4\u0005#";
         int var10006 = 161 + var2;
         String var8;
         Class53 var10010;
         if (var2 == 0) {
            var8 = "块髹";
            var8 = "坐骑";
            var10010 = this;
         } else if (var2 == 1) {
            var8 = "寣拠";
            var8 = "守护";
            var10010 = this;
         } else {
            var8 = "";
            var10010 = this;
         }

         Class4 var10002 = new Class4("sc/e/38.png", 2, var10006, Class49.bx, Class49.bv, var8, var10010);

         var3[var2] = var10002;
         this.ly[var2].setOffsetTexts(com.xy.q.Class49.d);
         this.ly[var2].setBounds(60 + 102 * var2, 15, 95, 33);
         this.add(this.ly[var2++]);
      }

      this.dn = new com.xy.w.Class18();
      String var7 = "\u001bdGcG4])\u0018i\u000f";
      this.dn.mt(com.xy.w.Class16.m("sc/d/35.png", 80, 10, 80, 10, false));
      this.dn.setBounds(50, 29, 665, 20);
      this.add(this.dn);
      this.yo = new com.xy.q.Class30[this.ly.length];
   }

   public void h() {
   }

   @Override
   public boolean ah() {
      Class53 var10000;
      if (this.ae == 0) {
         ((Class0)this.yo[0]).e();
         var10000 = this;
      } else {
         if (this.ae == 1) {
            ((Class27)this.yo[1]).h();
         }

         var10000 = this;
      }

      return var10000.ah();
   }

   @Override
   public void l() {
      this.g(0);
      super.l();
   }

   public boolean dh() {
      if (this.ae == 0) {
         ((Class0)this.yo[0]).h();
         return true;
      } else if (this.ae == 1) {
         ((Class27)this.yo[1]).f();
         return true;
      } else {
         return false;
      }
   }

   public void g(int var1) {
      int var10000 = 0;
      this.ae = var1;

      for (int var2 = 0; var10000 < this.ly.length; var10000 = ++var2) {
         this.ly[var2].setKeep(var2 == this.ae);
      }

      Class53 var4;
      if (var1 == 0) {
         if (this.yo[0] == null) {
            boolean var10005 = false;
            this.add(this.yo[0] = new Class0(this.afx));
         }

         ((Class0)this.yo[0]).h();
         var4 = this;
      } else {
         if (var1 == 1) {
            if (this.yo[1] == null) {
               this.add(this.yo[1] = new Class27(this.afx));
            }

            ((Class27)this.yo[1]).e();
         }

         var4 = this;
      }

      if (var4.yo[var1] != null) {
         this.yo[var1].setVisible(true);
      }

      int var3;
      for (int var5 = var3 = 0; var5 < this.yo.length; var5 = ++var3) {
         if (this.yo[var3] != null && var1 != var3) {
            this.yo[var3].setVisible(false);
            if (var3 == 0) {
               ((Class0)this.yo[0]).e();
            } else if (var3 == 1) {
               ((Class27)this.yo[1]).h();
            }
         }
      }
   }

   public boolean aju(Mount var1) {
      if (this.ae == 0) {
         ((Class0)this.yo[0]).b(var1);
         return true;
      } else {
         return false;
      }
   }
}
