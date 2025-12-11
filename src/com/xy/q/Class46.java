package com.xy.q;

import com.xy.game.RoleData;
import com.xy.readbean.Goodstable;
import com.xy.socket.Agreement;
import java.awt.Graphics;
import java.awt.event.MouseEvent;

public class Class46 extends Class25 {
   @Override
   protected void am(RoleData var1) {
   }

   @Override
   protected void ao(int var1, MouseEvent var2, RoleData var3) {
      Goodstable var4;
      if ((var4 = var3.getFlyGood(var1)) != null) {
         if (this.wd instanceof com.xy.a.a.Class30) {
            ((com.xy.a.a.Class30)this.wd).bb(var4);
         }
      }
   }

   public Class46(Class30 var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      super(var1, var2, var3, var4, var5, var6, var7, var8, var9);
   }

   @Override
   public boolean at(int var1) {
      int var2;
      if ((var2 = var1 * this.ae * this.ha) == 0) {
         return true;
      } else {
         RoleData var3;
         return (var3 = this.wd.yx()) == null ? false : var3.getFlyGood(var2) != null;
      }
   }

   @Override
   protected void ap(int var1, MouseEvent var2, RoleData var3) {
      Goodstable var4;
      if ((var4 = var3.getFlyGood(var1)) != null) {
         if (this.wd instanceof com.xy.a.a.Class30) {
            String var10003 = "\u0019f";
            String var5 = Agreement.getSendTextAES("rolechange", "FE" + var4.getRgid());
            this.wd.za().k(var5);
         }
      }
   }

   @Override
   protected void l() {
      this.wd.zc().f(46);
   }

   @Override
   public int il() {
      int var1 = this.ae * this.ha;
      RoleData var2;
      return (var2 = this.wd.yx()) == null ? 0 : (var2.flyList.size() - 1) / var1;
   }

   @Override
   protected void an(Graphics var1, RoleData var2) {
      int var3 = this.dx();

      int var4;
      for (int var10000 = var4 = 0; var10000 < this.abe.length; var10000 = ++var4) {
         this.ia = var4 + var3;
         if (this.lp != null) {
            var1.drawImage(this.lp, var4 % this.ae * this.z, var4 / this.ae * this.cb, this.gz, this.ah, null);
         }

         Goodstable var5;
         if ((var5 = var2.getFlyGood(this.ia)) == null) {
            if (this.abe[var4] != null) {
               this.abe[var4].e();
            }
         } else {
            if (this.abe[var4] == null || var5.getRgid() != this.abe[var4].e) {
               if (this.abe[var4] == null) {
                  this.abe[var4] = new com.xy.w.Class14();
               }

               this.abe[var4].a(var5, var2.getObjectArea());
            }

            RoleData var6;
            if (this.ia != this.gv) {
               var6 = var2;
               com.xy.w.Class16.j(var1, this.abe[var4].p, var4 % this.ae * this.z + 4, var4 / this.ae * this.cb + 4, 50, 50);
            } else {
               com.xy.w.Class16.j(var1, this.abe[var4].p, var4 % this.ae * this.z + 5, var4 / this.ae * this.cb + 5, 50, 50);
               var6 = var2;
            }

            if (var6.goodChoses[14] != null && var5.getRgid().compareTo(var2.goodChoses[14]) == 0) {
               var1.drawImage(com.xy.w.Class15.c, var4 % this.ae * this.z + 4, var4 / this.ae * this.cb + 4, null);
            }
         }
      }
   }
}
