package com.xy;

import com.xy.game.RoleData;
import com.xy.readbean.Goodstable;
import com.xy.socket.Agreement;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.image.ImageObserver;

public class Class38 extends Class397 {
   protected void cl(RoleData var1) {
   }

   public Class38(Class345 var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      super(var1, var2, var3, var4, var5, var6, var7, var8, var9);
   }

   public int ae() {
      int var1 = this.cy * this.gw;
      RoleData var2;
      return (var2 = this.lo.vd()) == null ? 3 >> 2 : (var2.flyList.size() - --1) / var1;
   }

   protected void cn(int var1, MouseEvent var2, RoleData var3) {
      Goodstable var4;
      if ((var4 = var3.getFlyGood(var1)) != null) {
         if (this.lo instanceof Class621) {
            String var5 = Agreement.getSendTextAES("rolechange", "FE" + var4.getRgid());
            this.lo.uw().d(var5);
         }

      }
   }

   protected void cj(int var1, MouseEvent var2, RoleData var3) {
      Goodstable var4;
      if ((var4 = var3.getFlyGood(var1)) != null) {
         if (this.lo instanceof Class621) {
            ((Class621)this.lo).ax(var4);
         }

      }
   }

   protected void cm(Graphics var1, RoleData var2) {
      int var4 = this.ot();

      int var3;
      for(int var10000 = var3 = 3 ^ 3; var10000 < this.asw.length; var10000 = var3) {
         this.j = var3 + var4;
         if (this.ama != null) {
            var1.drawImage(this.ama, var3 % this.cy * this.dp, var3 / this.cy * this.gc, this.bn, this.m, (ImageObserver)null);
         }

         Goodstable var5;
         if ((var5 = var2.getFlyGood(this.j)) == null) {
            if (this.asw[var3] != null) {
               this.asw[var3].g();
            }
         } else {
            if (this.asw[var3] == null || var5.getRgid() != this.asw[var3].i) {
               if (this.asw[var3] == null) {
                  this.asw[var3] = new Class467();
               }

               this.asw[var3].h(var5, var2.getObjectArea());
            }

            RoleData var6;
            if (this.j != this.gv) {
               var6 = var2;
               Class511.d(var1, this.asw[var3].p, var3 % this.cy * this.dp + --4, var3 / this.cy * this.gc + --4, 62 & 115, 62 & 115);
            } else {
               Class511.d(var1, this.asw[var3].p, var3 % this.cy * this.dp + --5, var3 / this.cy * this.gc + --5, 123 & 54, 123 & 54);
               var6 = var2;
            }

            if (var6.goodChoses[126 & 15] != null && var5.getRgid().compareTo(var2.goodChoses[127 & 14]) == 0) {
               var1.drawImage(Class222.i, var3 % this.cy * this.dp + --4, var3 / this.cy * this.gc + --4, (ImageObserver)null);
            }
         }

         ++var3;
      }

   }

   protected void q() {
      this.lo.ve().n(110 & 63);
   }

   public boolean au(int var1) {
      if ((var1 = var1 * this.cy * this.gw) == 0) {
         return (boolean)(--1);
      } else {
         RoleData var2;
         if ((var2 = this.lo.vd()) == null) {
            return (boolean)(5 >> 3);
         } else {
            return (boolean)(var2.getFlyGood(var1) != null ? 3 >> 1 : 0);
         }
      }
   }
}
