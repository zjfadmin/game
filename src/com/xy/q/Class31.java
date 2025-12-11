package com.xy.q;

import com.xy.game.RoleData;
import com.xy.readbean.Goodstable;
import com.xy.socket.Agreement;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;

public class Class31 extends Class25 {
   @Override
   protected void ap(int var1, MouseEvent var2, RoleData var3) {
      Goodstable var4;
      if ((var4 = var3.getParcelGood(var1)) != null) {
         if (var3.getGoodPackSum(var4.getType(), var4.getGoodsid(), var4.getUsetime()) <= 0) {
            String var10001 = "伸肥卝嶛溹";
            this.wd.afx.dp("你背包已满");
         } else {
            String var6 = Agreement.getSendTextAES("parcel", var4.getRgid().toString());
            this.wd.za().k(var6);
         }
      }
   }

   public Class31(Class30 var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      super(var1, var2, var3, var4, var5, var6, var7, var8, var9);
   }

   @Override
   protected void ao(int var1, MouseEvent var2, RoleData var3) {
   }

   @Override
   protected void l() {
      this.wd.zc().f(46);
   }

   @Override
   protected void an(Graphics var1, RoleData var2) {
      int var3 = this.dx();
      int var4 = 0;
      var1.setFont(Class49.ac);
      var1.setColor(Color.white);

      int var5;
      for (int var10000 = var5 = 0; var10000 < this.abe.length; var10000 = ++var5) {
         var4 = var5 + var3;
         if (this.lp != null) {
            var1.drawImage(this.lp, var5 % this.ae * this.z, var5 / this.ae * this.cb, this.gz + 2, this.ah + 2, null);
         }

         Goodstable var6;
         if ((var6 = var2.getParcelGood(var4)) == null) {
            if (this.abe[var5] != null) {
               this.abe[var5].e();
            }
         } else {
            if (this.abe[var5] == null || var6.getRgid() != this.abe[var5].e) {
               if (this.abe[var5] == null) {
                  this.abe[var5] = new com.xy.w.Class14();
               }

               this.abe[var5].g(var6);
            }

            Class31 var8;
            if (var4 != this.gv) {
               var8 = this;
               com.xy.w.Class16.j(var1, this.abe[var5].p, var5 % this.ae * this.z + 1, var5 / this.ae * this.cb + 1, this.gz, this.ah);
            } else {
               com.xy.w.Class16.j(var1, this.abe[var5].p, var5 % this.ae * this.z + 2, var5 / this.ae * this.cb + 2, this.gz, this.ah);
               var8 = this;
            }

            if (var8.abe[var5].c != null) {
               var1.drawString(this.abe[var5].c, var5 % this.ae * this.z + 4, var5 / this.ae * this.cb + 14);
            }

            if (var6.getGoodlock() == 1) {
               var1.drawImage(com.xy.w.Class15.s, var5 % this.ae * this.z + 36, var5 / this.ae * this.cb, 10, 12, null);
            }

            if (this.bi && var4 == this.gw) {
               var1.setColor(Color.red);
               var1.drawRect(var5 % this.ae * this.z + 1, var5 / this.ae * this.cb + 1, this.gz, this.ah);
               var1.drawRect(var5 % this.ae * this.z + 2, var5 / this.ae * this.cb + 2, this.gz - 2, this.ah - 2);
               var1.setColor(Color.white);
            }
         }
      }
   }

   @Override
   protected void am(RoleData var1) {
      Goodstable var2;
      if ((var2 = var1.getParcelGood(this.ia + this.dx())) != null) {
         ((com.xy.a.Class48)this.wd.zc().j(46)).hr(var2, false);
      }
   }
}
