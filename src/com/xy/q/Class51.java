package com.xy.q;

import com.xy.entity.Pal;
import com.xy.game.RoleData;
import com.xy.readbean.Goodstable;
import com.xy.socket.Agreement;
import java.awt.Graphics;
import java.awt.event.MouseEvent;

public class Class51 extends Class25 {
   @Override
   protected void ao(int var1, MouseEvent var2, RoleData var3) {
   }

   @Override
   protected void ap(int var1, MouseEvent var2, RoleData var3) {
      if (this.abe[var1] != null && this.abe[var1].l == 1) {
         Pal var4;
         if ((var4 = var3.getChosePal()) != null) {
            StringBuffer var5;
            (var5 = new StringBuffer()).append(var4.getId());
            String var10002 = ";";
            var5.append("|");
            var5.append(this.abe[var1].e);
            String var10004 = "X\f";
            var5.append("|T");
            String var6 = Agreement.getSendTextAES("userpal", var5.toString());
            this.wd.za().k(var6);
         }
      }
   }

   @Override
   protected void an(Graphics var1, RoleData var2) {
      int var10000 = 0;
      var1.setColor(Class49.cd);

      for (int var3 = 0; var10000 < this.abe.length; var10000 = ++var3) {
         Goodstable var4;
         if (this.abe[var3] != null && this.abe[var3].l == 1 && (var4 = var2.getGoodEquip(this.abe[var3].e)) != null) {
            if (var4.getRgid() != this.abe[var3].e) {
               this.abe[var3].g(var4);
            }

            var1.fillRect(var3 % this.ae * this.z, var3 / this.ae * this.cb, this.gz + 1, this.ah + 1);
            Goodstable var5;
            if (var3 != this.gv) {
               var5 = var4;
               var1.drawImage(this.abe[var3].p, var3 % this.ae * this.z, var3 / this.ae * this.cb, this.gz, this.ah, null);
            } else {
               var1.drawImage(this.abe[var3].p, var3 % this.ae * this.z + 1, var3 / this.ae * this.cb + 1, this.gz, this.ah, null);
               var5 = var4;
            }

            if (var5.getGoodlock() == 1) {
               var1.drawImage(com.xy.w.Class15.s, var3 % this.ae * this.z + 36, var3 / this.ae * this.cb, 10, 12, null);
            }
         }
      }
   }

   @Override
   protected void l() {
      this.wd.zc().f(46);
   }

   public Class51(Class30 var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      super(var1, var2, var3, var4, var5, var6, var7, var8, var9);
   }

   @Override
   protected void am(RoleData var1) {
      if (this.abe[this.ia] != null && this.abe[this.ia].l == 1) {
         Goodstable var2;
         if ((var2 = var1.getGood(this.abe[this.ia].e)) != null) {
            ((com.xy.a.Class48)this.wd.zc().j(46)).hr(var2, false);
         }
      }
   }
}
