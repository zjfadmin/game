package com.xy;

import com.xy.formula.GoodType;
import com.xy.game.RoleData;
import com.xy.readbean.Goodstable;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.image.ImageObserver;

public class Class30 extends Class397 {
   public void ax(Goodstable var1) {
      Class185 var2 = (Class185)this.lo;
      if (GoodType.ac(var1.getType()) && this.lo.ve().m(127 & 94) != null) {
         this.lo.aej.fw("请先做完更换技能操作");
      } else {
         var2.ax(var1);
      }
   }

   protected void cn(int var1, MouseEvent var2, RoleData var3) {
      Goodstable var4;
      if ((var4 = this.hp(var1)) != null) {
         if (this.lo instanceof Class185) {
            this.ax(var4);
         }

      }
   }

   protected void q() {
      this.lo.ve().n(63 & 110);
   }

   public Goodstable hp(int var1) {
      RoleData var2;
      if ((var2 = this.lo.vd()) == null) {
         return null;
      } else {
         int var5 = 0;

         int var4;
         for(int var10000 = var4 = 3 & 4; var10000 < var2.goodPacks.length; var10000 = var4) {
            Goodstable var3;
            if (var2.goodPacks[var4] != null && (var3 = var2.getGood(var2.goodPacks[var4])) != null && (GoodType.ac(var3.getType()) || GoodType.r(var3.getType()))) {
               if (var1 == var5) {
                  return var3;
               }

               ++var5;
            }

            ++var4;
         }

         return null;
      }
   }

   protected void cj(int var1, MouseEvent var2, RoleData var3) {
   }

   public Class30(Class345 var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      super(var1, var2, var3, var4, var5, var6, var7, var8, var9);
   }

   protected void cm(Graphics var1, RoleData var2) {
      var1.setFont(Class681.ce);
      var1.setColor(Color.white);
      int var3 = this.ama != null ? 2 & 5 : this.asw.length;

      int var10000;
      for(var10000 = var3; var10000 < this.asw.length; var10000 = var3) {
         int var10002 = var3 % this.cy * this.dp;
         int var10003 = var3 / this.cy * this.gc;
         int var10004 = this.bn + --2;
         int var10006 = 5 >> 1;
         ++var3;
         var1.drawImage(this.ama, var10002, var10003, var10004, this.m + var10006, (ImageObserver)null);
      }

      var3 = 3 & 4;

      int var4;
      for(var10000 = var4 = 3 ^ 3; var10000 < var2.goodPacks.length; var10000 = var4) {
         Goodstable var5;
         if (var2.goodPacks[var4] != null && (var5 = var2.getGood(var2.goodPacks[var4])) != null && (GoodType.ac(var5.getType()) || GoodType.r(var5.getType()))) {
            if (this.asw[var3] == null || var5.getRgid() != this.asw[var3].i) {
               if (this.asw[var3] == null) {
                  this.asw[var3] = new Class467();
               }

               this.asw[var3].d(var5);
            }

            Class30 var6;
            if (var3 != this.gv) {
               var6 = this;
               Class511.d(var1, this.asw[var3].p, var3 % this.cy * this.dp + (3 >> 1), var3 / this.cy * this.gc + (3 & 5), this.bn, this.m);
            } else {
               Class511.d(var1, this.asw[var3].p, var3 % this.cy * this.dp + (5 >> 1), var3 / this.cy * this.gc + (5 >> 1), this.bn, this.m);
               var6 = this;
            }

            if (var6.asw[var3].k != null) {
               var1.drawString(this.asw[var3].k, var3 % this.cy * this.dp + --4, var3 / this.cy * this.gc + (95 & 46));
            }

            if (var5.getGoodlock() == (3 & 5)) {
               var1.drawImage(Class222.u, var3 % this.cy * this.dp + (101 & 62), var3 / this.cy * this.gc, 106 & 31, 28 & 111, (ImageObserver)null);
            }

            ++var3;
            if (var3 >= (14 & 125)) {
               return;
            }
         }

         ++var4;
      }

   }

   protected void cl(RoleData var1) {
      Goodstable var2;
      if ((var2 = this.hp(this.j + this.ot())) != null) {
         ((Class270)this.lo.ve().e(110 & 63)).oj(var2, (boolean)(3 ^ 3));
      }
   }
}
