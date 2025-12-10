package com.xy;

import com.xy.game.RoleData;
import com.xy.readbean.Goodstable;
import com.xy.socket.Agreement;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.image.ImageObserver;

public class Class387 extends Class397 {
   protected void cn(int var1, MouseEvent var2, RoleData var3) {
      Goodstable var4;
      if ((var4 = var3.getParcelGood(var1)) != null) {
         if (var3.getGoodPackSum(var4.getType(), var4.getGoodsid(), var4.getUsetime()) <= 0) {
            this.lo.aej.fw("你背包已满");
         } else {
            String var5 = Agreement.getSendTextAES("parcel", var4.getRgid().toString());
            this.lo.uw().d(var5);
         }
      }
   }

   public Class387(Class345 var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      super(var1, var2, var3, var4, var5, var6, var7, var8, var9);
   }

   protected void cj(int var1, MouseEvent var2, RoleData var3) {
   }

   protected void cm(Graphics var1, RoleData var2) {
      int var5 = this.ot();
      int var4 = 2 & 5;
      var1.setFont(Class681.ce);
      var1.setColor(Color.white);

      int var3;
      for(int var10000 = var3 = 3 >> 2; var10000 < this.asw.length; var10000 = var3) {
         var4 = var3 + var5;
         if (this.ama != null) {
            var1.drawImage(this.ama, var3 % this.cy * this.dp, var3 / this.cy * this.gc, this.bn + (5 >> 1), this.m + (1 ^ 3), (ImageObserver)null);
         }

         Goodstable var6;
         if ((var6 = var2.getParcelGood(var4)) == null) {
            if (this.asw[var3] != null) {
               this.asw[var3].g();
            }
         } else {
            if (this.asw[var3] == null || var6.getRgid() != this.asw[var3].i) {
               if (this.asw[var3] == null) {
                  this.asw[var3] = new Class467();
               }

               this.asw[var3].d(var6);
            }

            Class387 var7;
            if (var4 != this.gv) {
               var7 = this;
               Class511.d(var1, this.asw[var3].p, var3 % this.cy * this.dp + (2 ^ 3), var3 / this.cy * this.gc + (3 & 5), this.bn, this.m);
            } else {
               Class511.d(var1, this.asw[var3].p, var3 % this.cy * this.dp + (1 ^ 3), var3 / this.cy * this.gc + --2, this.bn, this.m);
               var7 = this;
            }

            if (var7.asw[var3].k != null) {
               var1.drawString(this.asw[var3].k, var3 % this.cy * this.dp + --4, var3 / this.cy * this.gc + (14 & 127));
            }

            if (this.asw[var3].a != null) {
               var1.drawString(this.asw[var3].a, var3 % this.cy * this.dp + --4, var3 / this.cy * this.gc + this.m - (1 ^ 3));
            }

            if (var6.getGoodlock() == 3 >> 1) {
               var1.drawImage(Class222.u, var3 % this.cy * this.dp + (109 & 54), var3 / this.cy * this.gc, 43 & 94, 111 & 28, (ImageObserver)null);
            }

            if (this.aeg && var4 == this.fk) {
               var1.setColor(Color.red);
               var1.drawRect(var3 % this.cy * this.dp + (3 >> 1), var3 / this.cy * this.gc + (5 >> 2), this.bn, this.m);
               var1.drawRect(var3 % this.cy * this.dp + --2, var3 / this.cy * this.gc + (5 >> 1), this.bn - --2, this.m - --2);
               var1.setColor(Color.white);
            }
         }

         ++var3;
      }

   }

   protected void q() {
      this.lo.ve().n(126 & 47);
   }

   protected void cl(RoleData var1) {
      Goodstable var2;
      if ((var2 = var1.getParcelGood(this.j + this.ot())) != null) {
         ((Class270)this.lo.ve().e(126 & 47)).oj(var2, (boolean)(5 >> 3));
      }
   }
}
