package com.xy;

import com.xy.game.RoleData;
import com.xy.readbean.Goodstable;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.image.ImageObserver;
import java.util.ArrayList;
import java.util.List;

public class Class357 extends Class397 {
   private List<Long> xh;
   private int ay;

   protected void cm(Graphics var1, RoleData var2) {
      var1.setFont(Class681.ce);
      var1.setColor(Color.white);
      int var4;
      int var3 = -(var4 = this.ot());
      int var5 = this.ama != null ? 5 >> 3 : this.asw.length;

      int var10000;
      for(var10000 = var5; var10000 < this.asw.length; var10000 = var5) {
         int var10002 = var5 % this.cy * this.dp;
         int var10003 = var5 / this.cy * this.gc;
         int var10004 = this.bn + (5 >> 1);
         int var10006 = 5 >> 1;
         ++var5;
         var1.drawImage(this.ama, var10002, var10003, var10004, this.m + var10006, (ImageObserver)null);
      }

      for(var10000 = var5 = 3 & 4; var10000 < var2.goodPacks.length; var10000 = var5) {
         Goodstable var6;
         if ((var6 = var2.getGood(var2.goodPacks[var5])) != null && (this.xh == null || this.xh.contains(var6.getType())) && (this.ay != --1 || ((Class428)this.lo).pp(var6))) {
            if (var3 < 0) {
               ++var3;
            } else {
               if (this.asw[var3] == null || var6.getRgid() != this.asw[var3].i) {
                  if (this.asw[var3] == null) {
                     this.asw[var3] = new Class467();
                  }

                  this.asw[var3].d(var6);
               }

               Class357 var7;
               if (var3 != this.gv) {
                  var7 = this;
                  Class511.d(var1, this.asw[var3].p, var3 % this.cy * this.dp + (4 ^ 5), var3 / this.cy * this.gc + (4 ^ 5), this.bn, this.m);
               } else {
                  Class511.d(var1, this.asw[var3].p, var3 % this.cy * this.dp + --2, var3 / this.cy * this.gc + (5 >> 1), this.bn, this.m);
                  var7 = this;
               }

               if (var7.asw[var3].k != null) {
                  var1.drawString(this.asw[var3].k, var3 % this.cy * this.dp + --4, var3 / this.cy * this.gc + (127 & 14));
               }

               if (this.asw[var3].a != null) {
                  var1.drawString(this.asw[var3].a, var3 % this.cy * this.dp + --4, var3 / this.cy * this.gc + this.m - (5 >> 1));
               }

               if (var6.getGoodlock() == (3 & 5)) {
                  var1.drawImage(Class222.u, var3 % this.cy * this.dp + (117 & 46), var3 / this.cy * this.gc, 75 & 62, 111 & 28, (ImageObserver)null);
               }

               if (this.aeg && var3 + var4 == this.fk) {
                  var1.setColor(Color.red);
                  var1.drawRect(var3 % this.cy * this.dp + (4 ^ 5), var3 / this.cy * this.gc + --1, this.bn - --2, this.m - (5 >> 1));
                  var1.drawRect(var3 % this.cy * this.dp + --2, var3 / this.cy * this.gc + --2, this.bn - --4, this.m - --4);
                  var1.setColor(Color.white);
               }

               ++var3;
               if (var3 >= this.asw.length) {
                  return;
               }
            }
         }

         ++var5;
      }

   }

   public Class357(Class345 var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      super(var1, var2, var3, var4, var5, var6, var7, var8, var9);
   }

   public void ud(long... var1) {
      if (this.xh == null) {
         this.xh = new ArrayList();
      } else {
         this.xh.clear();
      }

      int var2;
      for(int var10000 = var2 = 0; var10000 < var1.length; var10000 = var2) {
         if (var1[var2] != -1L) {
            this.xh.add(var1[var2]);
         }

         ++var2;
      }

   }

   protected void cn(int var1, MouseEvent var2, RoleData var3) {
      Goodstable var4;
      if ((var4 = this.ue(var1, var3)) != null) {
         if (this.lo instanceof Class347) {
            ((Class347)this.lo).ly(var4);
         } else if (this.lo instanceof Class312) {
            ((Class312)this.lo).av(var4);
         } else if (this.lo instanceof Class95) {
            ((Class95)this.lo).ly(var4);
         } else if (this.lo instanceof Class65) {
            ((Class65)this.lo).ax(var4);
         } else if (this.lo instanceof Class232) {
            ((Class232)this.lo).ax(var4);
         } else if (this.lo instanceof Class660) {
            ((Class660)this.lo).ax(var4);
         } else if (this.lo instanceof Class195) {
            ((Class195)this.lo).ax(var4);
         } else if (this.lo instanceof Class428) {
            ((Class428)this.lo).av(var4);
         } else {
            if (this.lo instanceof Class687) {
               ((Class687)this.lo).ax(var4);
            }

         }
      }
   }

   public boolean au(int var1) {
      if ((var1 = var1 * this.cy * this.gw) == 0) {
         return (boolean)(3 & 5);
      } else {
         RoleData var2;
         if ((var2 = this.lo.vd()) == null) {
            return (boolean)(3 >> 2);
         } else {
            return (boolean)(this.ue(var1, var2) != null ? --1 : 0);
         }
      }
   }

   public Goodstable ue(int var1, RoleData var2) {
      int var4;
      for(int var10000 = var4 = 2 & 5; var10000 < var2.goodPacks.length; var10000 = var4) {
         Goodstable var3;
         if ((var3 = var2.getGood(var2.goodPacks[var4])) != null && (this.xh == null || this.xh.contains(var3.getType())) && (this.ay != --1 || ((Class428)this.lo).pp(var3))) {
            if (var1 == 0) {
               return var3;
            }

            --var1;
         }

         ++var4;
      }

      return null;
   }

   public long gl() {
      return this.xh != null && this.xh.size() != 0 ? (Long)this.xh.get(3 & 4) : -1L;
   }

   public int uf() {
      return this.ay;
   }

   protected void cl(RoleData var1) {
      Goodstable var2;
      if ((var2 = this.ue(this.j + this.ot(), var1)) != null) {
         ((Class270)this.lo.ve().e(62 & 111)).oj(var2, (boolean)(5 >> 3));
      }
   }

   protected void q() {
      this.lo.ve().n(127 & 46);
   }

   public void as(int var1) {
      this.ay = var1;
   }

   protected void cj(int var1, MouseEvent var2, RoleData var3) {
      Goodstable var4;
      if ((var4 = this.ue(var1, var3)) != null) {
         if (this.lo instanceof Class347) {
            ((Class347)this.lo).ly(var4);
         } else if (this.lo instanceof Class312) {
            ((Class312)this.lo).av(var4);
         } else if (this.lo instanceof Class95) {
            ((Class95)this.lo).ly(var4);
         } else if (this.lo instanceof Class65) {
            ((Class65)this.lo).ax(var4);
         } else if (this.lo instanceof Class232) {
            ((Class232)this.lo).ax(var4);
         } else if (this.lo instanceof Class660) {
            ((Class660)this.lo).ax(var4);
         } else if (this.lo instanceof Class195) {
            ((Class195)this.lo).ax(var4);
         } else if (this.lo instanceof Class428) {
            ((Class428)this.lo).av(var4);
         } else {
            if (this.lo instanceof Class687) {
               ((Class687)this.lo).ax(var4);
            }

         }
      }
   }
}
