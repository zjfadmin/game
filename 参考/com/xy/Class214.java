package com.xy;

import com.xy.socket.Agreement;
import com.xy.text.GameView;
import java.awt.Color;
import java.awt.Font;

public class Class214 extends Class345 {
   private Class345[] bj;
   private Class379[] bk;
   private Class436 bl;
   private int m;

   public void y(int var1) {
      if (var1 == 5 >> 1) {
         this.c(var1, (Object)null);
      } else {
         String var2 = Agreement.getSendTextAES("BEAU", "V" + var1);
         this.uw().d(var2);
      }
   }

   public Class214(GameView var1) {
      int var10001 = --3;
      int var10005 = -4 >> 2;
      super(6395 & 26558, 5 >> 1, Class345.aef, var1);
      this.va(var10005, 3 ^ 3, 26559 & 6911, 12191 & 21118, Class345.aeo);
      this.uv(Class511.q("sc/d/1.png", 109 & 86, 109 & 86, 109 & 86, 109 & 86, (boolean)(3 & 4)), " 靓 号 ");
      Class379[] var4 = new Class379[var10001];
      boolean var10003 = true;
      this.bk = var4;

      int var2;
      for(int var10000 = var2 = 3 >> 2; var10000 < this.bk.length; var10000 = var2) {
         Class379[] var3 = this.bk;
         Class379 var10002 = new Class379;
         var10005 = 1 ^ 3;
         int var10006 = (9723 & 23215) + var2;
         Font var10007 = Class681.cf;
         Color[] var10008 = Class681.c;
         String var10009;
         Class214 var10010;
         if (var2 == 0) {
            var10009 = "选靓号";
            var10010 = this;
         } else if (var2 == (2 ^ 3)) {
            var10009 = "抢靓号";
            var10010 = this;
         } else if (var2 == 5 >> 1) {
            var10009 = "靓号信筏";
            var10010 = this;
         } else {
            var10009 = "";
            var10010 = this;
         }

         var10002.<init>("sc/e/38.png", var10005, var10006, var10007, var10008, var10009, var10010);
         var3[var2] = var10002;
         this.bk[var2].setOffsetTexts(Class681.bv);
         this.bk[var2].setBounds((125 & 62) + (102 & 127) * var2, 26 & 119, 95 & 127, 123 & 37);
         this.add(this.bk[var2++]);
      }

      this.bl = new Class436(Class511.q("sc/d/35.png", --2, --2, --2, --2, (boolean)(2 & 5)));
      this.bl.setBounds(44 & 119, 33 & 127, 15999 & 17406, 30 & 117);
      this.add(this.bl);
      Class345[] var5 = new Class345[this.bk.length];
      var10003 = true;
      this.bj = var5;
   }

   public void d() {
      if (this.m == (4 ^ 5) && this.bj[3 >> 1] != null) {
         ((Class475)this.bj[3 & 5]).d();
      }
   }

   public void c(int var1, Object var2) {
      int var10000 = 2 & 5;
      this.m = var1;

      int var3;
      for(var3 = var10000; var10000 < this.bk.length; var10000 = var3) {
         this.bk[var3].setKeep((boolean)(var1 == var3 ? 5 >> 2 : 0));
         ++var3;
      }

      Class214 var4;
      if (var1 == 0) {
         if (this.bj[2 & 5] == null) {
            this.add(this.bj[5 >> 3] = new Class41(this.aej), 3 >> 2);
         }

         ((Class41)this.bj[3 ^ 3]).ch((int[])var2);
         var4 = this;
      } else if (var1 == (3 & 5)) {
         if (this.bj[2 ^ 3] == null) {
            this.add(this.bj[4 ^ 5] = new Class475(this.aej), 3 >> 2);
         }

         ((Class475)this.bj[3 >> 1]).ch((int[])var2);
         var4 = this;
      } else {
         if (var1 == 5 >> 1) {
            if (this.bj[1 ^ 3] == null) {
               this.add(this.bj[--2] = new Class450(this.aej), 2 & 5);
            }

            ((Class450)this.bj[1 ^ 3]).d();
         }

         var4 = this;
      }

      if (var4.bj[var1] != null) {
         this.bj[var1].setVisible((boolean)(4 ^ 5));
      }

      for(var10000 = var3 = 0; var10000 < this.bj.length; var10000 = var3) {
         if (this.bj[var3] != null && var1 != var3) {
            this.bj[var3].setVisible((boolean)(3 & 4));
         }

         ++var3;
      }

   }
}
