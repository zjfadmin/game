package com.xy.q;

import com.xy.a.q.Class97;
import com.xy.formula.GoodType;
import com.xy.game.RoleData;
import com.xy.readbean.Goodstable;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;

public class Class56 extends Class25 {
   @Override
   protected void ap(int var1, MouseEvent var2, RoleData var3) {
      Goodstable var4;
      if ((var4 = this.vf(var1)) != null) {
         if (this.wd instanceof Class97) {
            this.bb(var4);
         }
      }
   }

   public void bb(Goodstable var1) {
      Class97 var2 = (Class97)this.wd;
      if (GoodType.ag(var1.getType()) && this.wd.zc().l(94) != null) {
         String var10001 = "诇克偪宏曄捡抰胾擽佟";
         this.wd.afx.dp("请先做完更换技能操作");
      } else {
         var2.bb(var1);
      }
   }

   public Goodstable vf(int var1) {
      RoleData var2;
      if ((var2 = this.wd.yx()) == null) {
         return null;
      } else {
         int var3 = 0;

         int var4;
         for (int var10000 = var4 = 0; var10000 < var2.goodPacks.length; var10000 = ++var4) {
            Goodstable var5;
            if (var2.goodPacks[var4] != null
               && (var5 = var2.getGood(var2.goodPacks[var4])) != null
               && (GoodType.ag(var5.getType()) || GoodType.ab(var5.getType()))) {
               if (var1 == var3) {
                  return var5;
               }

               var3++;
            }
         }

         return null;
      }
   }

   @Override
   protected void an(Graphics var1, RoleData var2) {
      var1.setFont(Class49.ac);
      var1.setColor(Color.white);
      int var3 = this.lp != null ? 0 : this.abe.length;

      for (int var10000 = var3; var10000 < this.abe.length; var10000 = var3) {
         int var10002 = var3 % this.ae * this.z;
         int var10003 = var3 / this.ae * this.cb;
         int var10004 = this.gz + 2;
         var3++;
         var1.drawImage(this.lp, var10002, var10003, var10004, this.ah + 2, null);
      }

      var3 = 0;

      int var4;
      for (int var7 = var4 = 0; var7 < var2.goodPacks.length; var7 = ++var4) {
         Goodstable var5;
         if (var2.goodPacks[var4] != null
            && (var5 = var2.getGood(var2.goodPacks[var4])) != null
            && (GoodType.ag(var5.getType()) || GoodType.ab(var5.getType()))) {
            if (this.abe[var3] == null || var5.getRgid() != this.abe[var3].e) {
               if (this.abe[var3] == null) {
                  this.abe[var3] = new com.xy.w.Class14();
               }

               this.abe[var3].g(var5);
            }

            Class56 var8;
            if (var3 != this.gv) {
               var8 = this;
               com.xy.w.Class16.j(var1, this.abe[var3].p, var3 % this.ae * this.z + 1, var3 / this.ae * this.cb + 1, this.gz, this.ah);
            } else {
               com.xy.w.Class16.j(var1, this.abe[var3].p, var3 % this.ae * this.z + 2, var3 / this.ae * this.cb + 2, this.gz, this.ah);
               var8 = this;
            }

            if (var8.abe[var3].c != null) {
               var1.drawString(this.abe[var3].c, var3 % this.ae * this.z + 4, var3 / this.ae * this.cb + 14);
            }

            if (var5.getGoodlock() == 1) {
               var1.drawImage(com.xy.w.Class15.s, var3 % this.ae * this.z + 36, var3 / this.ae * this.cb, 10, 12, null);
            }

            if (++var3 >= 12) {
               return;
            }
         }
      }
   }

   @Override
   protected void l() {
      this.wd.zc().f(46);
   }

   @Override
   protected void ao(int var1, MouseEvent var2, RoleData var3) {
   }

   public Class56(Class30 var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      super(var1, var2, var3, var4, var5, var6, var7, var8, var9);
   }

   @Override
   protected void am(RoleData var1) {
      Goodstable var2;
      if ((var2 = this.vf(this.ia + this.dx())) != null) {
         ((com.xy.a.Class48)this.wd.zc().j(46)).hr(var2, false);
      }
   }
}
