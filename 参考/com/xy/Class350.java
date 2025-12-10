package com.xy;

import com.xy.formula.GoodType;
import com.xy.game.RoleData;
import com.xy.readbean.Goodstable;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.image.ImageObserver;

public class Class350 extends Class397 {
   private int ay;

   public Goodstable hp(int var1) {
      if (var1 < 0) {
         return null;
      } else {
         RoleData var4 = this.lo.vd();

         int var3;
         for(int var10000 = var3 = 3 & 4; var10000 < var4.goodPacks.length; var10000 = var3) {
            Goodstable var2;
            long var5;
            if (var4.goodPacks[var3] != null && (var2 = var4.getGood(var4.goodPacks[var3])) != null && GoodType.i(var2.getType()) && (var5 = var2.getGoodsid().longValue()) != 6029L && var5 != 6030L && var5 != 6031L && var5 != 6032L && var5 != 6033L && var5 != 6034L) {
               int var7 = var2.getValue().indexOf(GoodType.Extras[--3]);
               if ((this.ay != --1 || var7 == -4 >> 2) && (this.ay != (1 ^ 3) || var7 != -4 >> 2)) {
                  if (var1 == 0) {
                     return var2;
                  }

                  --var1;
               }
            }

            ++var3;
         }

         return null;
      }
   }

   public Class350(int var1, Class345 var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
      super(var2, var3, var4, var5, var6, var7, var8, var9, var10);
      this.ay = var1;
   }

   protected void cn(int var1, MouseEvent var2, RoleData var3) {
      Goodstable var4;
      if ((var4 = this.hp(var1)) != null) {
         if (this.lo instanceof Class401) {
            ((Class401)this.lo).iu()[3 ^ 3].c(3 & 5, var4);
         } else if (this.lo instanceof Class14) {
            Class14 var7 = (Class14)this.lo;
            var7.u().c(3 & 5, var4);
            var7.p();
         } else if (this.lo instanceof Class568) {
            Class568 var6 = (Class568)this.lo;
            var6.iu()[5 >> 3].c(3 >> 1, var4);
            var6.s();
         } else {
            if (this.lo instanceof Class644) {
               Class644 var5 = (Class644)this.lo;
               Class644 var10000;
               if (this.ay == 5 >> 1) {
                  var10000 = var5;
                  var5.iu()[5 >> 3].c(3 & 5, var4);
                  var5.iu()[3 & 5].c(2 ^ 3, var4);
               } else {
                  var10000 = var5;
                  var5.iu()[--2].c(5 >> 2, var4);
               }

               var10000.p();
            }

         }
      }
   }

   protected void cj(int var1, MouseEvent var2, RoleData var3) {
   }

   protected void cl(RoleData var1) {
      Goodstable var2;
      if ((var2 = this.hp(this.j + this.ot())) != null) {
         ((Class270)this.lo.ve().e(62 & 111)).oj(var2, (boolean)(5 >> 3));
      }
   }

   protected void q() {
      this.lo.ve().n(111 & 62);
   }

   public boolean au(int var1) {
      if ((var1 = var1 * this.cy * this.gw) == 0) {
         return (boolean)(3 >> 1);
      } else if (this.lo.vd() == null) {
         return (boolean)(3 & 4);
      } else {
         return (boolean)(this.hp(var1) != null ? 4 ^ 5 : 0);
      }
   }

   protected void cm(Graphics var1, RoleData var2) {
      var1.setFont(Class681.ce);
      var1.setColor(Color.white);
      int var4;
      int var3 = -(var4 = this.ot());
      int var5 = this.ama != null ? 2 & 5 : this.asw.length;

      int var10000;
      for(var10000 = var5; var10000 < this.asw.length; var10000 = var5) {
         int var10002 = var5 % this.cy * this.dp;
         int var10003 = var5 / this.cy * this.gc;
         int var10004 = this.bn + (1 ^ 3);
         int var10006 = 1 ^ 3;
         ++var5;
         var1.drawImage(this.ama, var10002, var10003, var10004, this.m + var10006, (ImageObserver)null);
      }

      for(var10000 = var5 = 3 ^ 3; var10000 < var2.goodPacks.length; var10000 = var5) {
         Goodstable var6;
         long var7;
         if (var2.goodPacks[var5] != null && (var6 = var2.getGood(var2.goodPacks[var5])) != null && GoodType.i(var6.getType()) && (var7 = var6.getGoodsid().longValue()) != 6029L && var7 != 6030L && var7 != 6031L && var7 != 6032L && var7 != 6033L && var7 != 6034L) {
            int var9 = var6.getValue().indexOf(GoodType.Extras[--3]);
            if ((this.ay != (2 ^ 3) || var9 == -4 >> 2) && (this.ay != 5 >> 1 || var9 != -4 >> 2)) {
               if (var3 < 0) {
                  ++var3;
               } else {
                  if (this.asw[var3] == null || var6.getRgid() != this.asw[var3].i) {
                     if (this.asw[var3] == null) {
                        this.asw[var3] = new Class467();
                     }

                     this.asw[var3].d(var6);
                  }

                  Goodstable var10;
                  if (var3 != this.gv) {
                     var10 = var6;
                     Class511.d(var1, this.asw[var3].p, var3 % this.cy * this.dp + (5 >> 2), var3 / this.cy * this.gc + (3 >> 1), this.bn, this.m);
                  } else {
                     Class511.d(var1, this.asw[var3].p, var3 % this.cy * this.dp + (1 ^ 3), var3 / this.cy * this.gc + (5 >> 1), this.bn, this.m);
                     var10 = var6;
                  }

                  if (var10.getGoodlock() == (2 ^ 3)) {
                     var1.drawImage(Class222.u, var3 % this.cy * this.dp + (102 & 61), var3 / this.cy * this.gc, 63 & 74, 46 & 93, (ImageObserver)null);
                  }

                  if (this.aeg && var3 + var4 == this.fk) {
                     var1.setColor(Color.red);
                     var1.drawRect(var3 % this.cy * this.dp + (4 ^ 5), var3 / this.cy * this.gc + (3 >> 1), this.bn, this.m);
                     var1.drawRect(var3 % this.cy * this.dp + (1 ^ 3), var3 / this.cy * this.gc + (5 >> 1), this.bn - (5 >> 1), this.m - (1 ^ 3));
                     var1.setColor(Color.white);
                  }

                  ++var3;
                  if (var3 >= this.asw.length) {
                     return;
                  }
               }
            }
         }

         ++var5;
      }

   }
}
