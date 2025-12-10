package com.xy;

import com.xy.entity.Pal;
import com.xy.game.RoleData;
import com.xy.readbean.Goodstable;
import com.xy.socket.Agreement;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.image.ImageObserver;

public class Class331 extends Class397 {
   public Class331(Class345 var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      super(var1, var2, var3, var4, var5, var6, var7, var8, var9);
   }

   protected void cm(Graphics var1, RoleData var2) {
      int var10000 = 2 & 5;
      var1.setColor(Class681.g);

      for(int var3 = var10000; var10000 < this.asw.length; var10000 = var3) {
         Goodstable var4;
         if (this.asw[var3] != null && this.asw[var3].o == (3 & 5) && (var4 = var2.getGoodEquip(this.asw[var3].i)) != null) {
            if (var4.getRgid() != this.asw[var3].i) {
               this.asw[var3].d(var4);
            }

            var1.fillRect(var3 % this.cy * this.dp, var3 / this.cy * this.gc, this.bn + --1, this.m + (3 >> 1));
            Goodstable var5;
            if (var3 != this.gv) {
               var5 = var4;
               var1.drawImage(this.asw[var3].p, var3 % this.cy * this.dp, var3 / this.cy * this.gc, this.bn, this.m, (ImageObserver)null);
            } else {
               var1.drawImage(this.asw[var3].p, var3 % this.cy * this.dp + (4 ^ 5), var3 / this.cy * this.gc + --1, this.bn, this.m, (ImageObserver)null);
               var5 = var4;
            }

            if (var5.getGoodlock() == 3 >> 1) {
               var1.drawImage(Class222.u, var3 % this.cy * this.dp + (124 & 39), var3 / this.cy * this.gc, 111 & 26, 44 & 95, (ImageObserver)null);
            }
         }

         ++var3;
      }

   }

   protected void cj(int var1, MouseEvent var2, RoleData var3) {
   }

   protected void cl(RoleData var1) {
      if (this.asw[this.j] != null && this.asw[this.j].o == (4 ^ 5)) {
         Goodstable var2;
         if ((var2 = var1.getGood(this.asw[this.j].i)) != null) {
            ((Class270)this.lo.ve().e(62 & 111)).oj(var2, (boolean)(3 & 4));
         }
      }
   }

   protected void cn(int var1, MouseEvent var2, RoleData var3) {
      if (this.asw[var1] != null && this.asw[var1].o == 3 >> 1) {
         Pal var5;
         if ((var5 = var3.getChosePal()) != null) {
            StringBuffer var6;
            (var6 = new StringBuffer()).append(var5.getId());
            var6.append("|");
            var6.append(this.asw[var1].i);
            var6.append("|T");
            String var4 = Agreement.getSendTextAES("userpal", var6.toString());
            this.lo.uw().d(var4);
         }
      }
   }

   protected void q() {
      this.lo.ve().n(110 & 63);
   }
}
