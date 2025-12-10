package com.xy;

import com.xy.game.RoleData;
import com.xy.readbean.Shop;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.image.ImageObserver;
import java.util.List;

public class Class505 extends Class397 {
   private List<Shop> ez;

   public boolean au(int var1) {
      return (boolean)(var1 <= this.ae() ? 3 & 5 : 0);
   }

   protected void cj(int var1, MouseEvent var2, RoleData var3) {
      Shop var4;
      if ((var4 = this.aez(var1)) != null) {
         if (this.lo instanceof Class684) {
            this.y(var1);
            ((Class684)this.lo).em(var4, (boolean)(3 & 4));
         } else if (this.lo instanceof Class110) {
            this.y(var1);
            ((Class110)this.lo).em(var4, (boolean)(2 & 5));
         } else {
            if (this.lo instanceof Class162) {
               this.y(var1);
               ((Class162)this.lo).em(var4, (boolean)(2 & 5));
            }

         }
      }
   }

   public void ck(List<Shop> var1) {
      this.ez = var1;
      if (this.asv != null) {
         this.asv.i(3 & 4);
         this.asv.q((boolean)(this.ae() > 0 ? --1 : 0));
      }

      this.d();
   }

   public Shop aez(int var1) {
      if (this.ez == null) {
         return null;
      } else {
         return var1 < this.ez.size() ? (Shop)this.ez.get(var1) : null;
      }
   }

   protected void q() {
      this.lo.ve().n(46 & 127);
   }

   public int ae() {
      int var1;
      return (var1 = this.uf()) == 0 ? 3 >> 2 : (var1 - --1) / this.asw.length;
   }

   protected void cm(Graphics var1, RoleData var2) {
      int var6 = this.ot();
      int var4 = 5 >> 3;
      var1.setFont(Class681.ce);
      var1.setColor(Color.white);

      int var3;
      for(int var10000 = var3 = 2 & 5; var10000 < this.asw.length; var10000 = var3) {
         var4 = var3 + var6;
         if (this.ama != null) {
            var1.drawImage(this.ama, var3 % this.cy * this.dp, var3 / this.cy * this.gc, this.bn + (1 ^ 3), this.m + (5 >> 1), (ImageObserver)null);
         }

         Shop var5;
         if ((var5 = this.aez(var4)) != null) {
            if (this.asw[var3] == null || var5 != this.asw[var3].j) {
               if (this.asw[var3] == null) {
                  this.asw[var3] = new Class467();
               }

               this.asw[var3].i(var5);
            }

            Class505 var7;
            if (var4 != this.gv) {
               var7 = this;
               Class511.d(var1, this.asw[var3].p, var3 % this.cy * this.dp + (3 & 5), var3 / this.cy * this.gc + (2 ^ 3), this.bn, this.m);
            } else {
               Class511.d(var1, this.asw[var3].p, var3 % this.cy * this.dp + --2, var3 / this.cy * this.gc + (5 >> 1), this.bn, this.m);
               var7 = this;
            }

            if (var7.asw[var3].k != null) {
               var1.drawString(this.asw[var3].k, var3 % this.cy * this.dp + (5 >> 1), var3 / this.cy * this.gc + (59 & 78));
            }

            if (this.asw[var3].a != null) {
               var1.drawString(this.asw[var3].a, var3 % this.cy * this.dp + --2, var3 / this.cy * this.gc + this.m - --2);
            }

            if (this.aeg && var4 == this.fk) {
               var1.setColor(Color.red);
               var1.drawRect(var3 % this.cy * this.dp + (3 >> 1), var3 / this.cy * this.gc + (5 >> 2), this.bn, this.m);
               var1.drawRect(var3 % this.cy * this.dp + (1 ^ 3), var3 / this.cy * this.gc + (5 >> 1), this.bn - (5 >> 1), this.m - --2);
               var1.setColor(Color.white);
            } else if (this.j == var3) {
               var1.setColor(Color.white);
               var1.drawRect(var3 % this.cy * this.dp + (2 ^ 3), var3 / this.cy * this.gc + (2 ^ 3), this.bn, this.m);
               var1.drawRect(var3 % this.cy * this.dp + (5 >> 1), var3 / this.cy * this.gc + (1 ^ 3), this.bn - --2, this.m - (5 >> 1));
               var1.setColor(Color.white);
            }
         }

         ++var3;
      }

   }

   public int uf() {
      return this.ez == null ? 5 >> 3 : this.ez.size();
   }

   protected void cl(RoleData var1) {
      Shop var2;
      if ((var2 = this.aez(this.j + this.ot())) != null) {
         ((Class270)this.lo.ve().e(126 & 47)).rz(var2);
      }
   }

   protected void cn(int var1, MouseEvent var2, RoleData var3) {
      Shop var4;
      if ((var4 = this.aez(var1)) != null) {
         if (this.lo instanceof Class684) {
            this.y(var1);
            ((Class684)this.lo).em(var4, (boolean)(4 ^ 5));
         } else if (this.lo instanceof Class110) {
            this.y(var1);
            ((Class110)this.lo).em(var4, (boolean)(2 ^ 3));
         } else {
            if (this.lo instanceof Class162) {
               this.y(var1);
               ((Class162)this.lo).em(var4, (boolean)(--1));
            }

         }
      }
   }

   public List<Shop> ci() {
      return this.ez;
   }

   public Class505(Class345 var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      int var10001 = 2 ^ 3;
      super(var1, var2, var3, var4, var5, var6, var7, var8, var9);
      this.ak((boolean)var10001);
   }
}
