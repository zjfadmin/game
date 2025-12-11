package com.xy.q;

import com.xy.formula.GoodType;
import com.xy.game.RoleData;
import com.xy.readbean.Goodstable;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;

public class Class24 extends Class25 {
   private int eg;

   @Override
   public boolean at(int var1) {
      int var2;
      if ((var2 = var1 * this.ae * this.ha) == 0) {
         return true;
      } else {
         return this.wd.yx() == null ? false : this.vf(var2) != null;
      }
   }

   public Class24(int var1, Class30 var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
      super(var2, var3, var4, var5, var6, var7, var8, var9, var10);
      this.eg = var1;
   }

   @Override
   protected void ao(int var1, MouseEvent var2, RoleData var3) {
   }

   @Override
   protected void ap(int var1, MouseEvent var2, RoleData var3) {
      Goodstable var4;
      if ((var4 = this.vf(var1)) != null) {
         if (this.wd instanceof com.xy.a.i.Class13) {
            com.xy.a.i.Class13 var8;
            (var8 = (com.xy.a.i.Class13)this.wd).ka()[0].gs(1, var4);
         } else if (this.wd instanceof com.xy.a.i.Class45) {
            com.xy.a.i.Class45 var7;
            com.xy.a.i.Class45 var10 = var7 = (com.xy.a.i.Class45)this.wd;
            var10.ep().gs(1, var4);
            var10.e();
         } else if (this.wd instanceof com.xy.a.i.Class20) {
            com.xy.a.i.Class20 var6;
            com.xy.a.i.Class20 var9 = var6 = (com.xy.a.i.Class20)this.wd;
            var9.ka()[0].gs(1, var4);
            var9.f();
         } else {
            if (this.wd instanceof com.xy.a.i.Class37) {
               com.xy.a.i.Class37 var5 = (com.xy.a.i.Class37)this.wd;
               com.xy.a.i.Class37 var10000;
               if (this.eg == 2) {
                  var10000 = var5;
                  var5.ka()[0].gs(1, var4);
                  var5.ka()[1].gs(1, var4);
               } else {
                  var10000 = var5;
                  var5.ka()[2].gs(1, var4);
               }

               var10000.e();
            }
         }
      }
   }

   public Goodstable vf(int var1) {
      if (var1 < 0) {
         return null;
      } else {
         RoleData var2 = this.wd.yx();

         int var3;
         for (int var10000 = var3 = 0; var10000 < var2.goodPacks.length; var10000 = ++var3) {
            Goodstable var4;
            long var5;
            if (var2.goodPacks[var3] != null
               && (var4 = var2.getGood(var2.goodPacks[var3])) != null
               && GoodType.ae(var4.getType())
               && (var5 = var4.getGoodsid().longValue()) != 6029L
               && var5 != 6030L
               && var5 != 6031L
               && var5 != 6032L
               && var5 != 6033L
               && var5 != 6034L) {
               int var7 = var4.getValue().indexOf(GoodType.Extras[3]);
               if ((this.eg != 1 || var7 == -1) && (this.eg != 2 || var7 != -1)) {
                  if (var1 == 0) {
                     return var4;
                  }

                  var1--;
               }
            }
         }

         return null;
      }
   }

   @Override
   protected void l() {
      this.wd.zc().f(46);
   }

   @Override
   protected void an(Graphics var1, RoleData var2) {
      var1.setFont(Class49.ac);
      var1.setColor(Color.white);
      int var3;
      int var4 = -(var3 = this.dx());
      int var5 = this.lp != null ? 0 : this.abe.length;

      for (int var10000 = var5; var10000 < this.abe.length; var10000 = var5) {
         int var10002 = var5 % this.ae * this.z;
         int var10003 = var5 / this.ae * this.cb;
         int var10004 = this.gz + 2;
         var5++;
         var1.drawImage(this.lp, var10002, var10003, var10004, this.ah + 2, null);
      }

      for (int var11 = var5 = 0; var11 < var2.goodPacks.length; var11 = ++var5) {
         Goodstable var6;
         long var7;
         if (var2.goodPacks[var5] != null
            && (var6 = var2.getGood(var2.goodPacks[var5])) != null
            && GoodType.ae(var6.getType())
            && (var7 = var6.getGoodsid().longValue()) != 6029L
            && var7 != 6030L
            && var7 != 6031L
            && var7 != 6032L
            && var7 != 6033L
            && var7 != 6034L) {
            int var9 = var6.getValue().indexOf(GoodType.Extras[3]);
            if ((this.eg != 1 || var9 == -1) && (this.eg != 2 || var9 != -1)) {
               if (var4 < 0) {
                  var4++;
               } else {
                  if (this.abe[var4] == null || var6.getRgid() != this.abe[var4].e) {
                     if (this.abe[var4] == null) {
                        this.abe[var4] = new com.xy.w.Class14();
                     }

                     this.abe[var4].g(var6);
                  }

                  Goodstable var12;
                  if (var4 != this.gv) {
                     var12 = var6;
                     com.xy.w.Class16.j(var1, this.abe[var4].p, var4 % this.ae * this.z + 1, var4 / this.ae * this.cb + 1, this.gz, this.ah);
                  } else {
                     com.xy.w.Class16.j(var1, this.abe[var4].p, var4 % this.ae * this.z + 2, var4 / this.ae * this.cb + 2, this.gz, this.ah);
                     var12 = var6;
                  }

                  if (var12.getGoodlock() == 1) {
                     var1.drawImage(com.xy.w.Class15.s, var4 % this.ae * this.z + 36, var4 / this.ae * this.cb, 10, 12, null);
                  }

                  if (this.bi && var4 + var3 == this.gw) {
                     var1.setColor(Color.red);
                     var1.drawRect(var4 % this.ae * this.z + 1, var4 / this.ae * this.cb + 1, this.gz, this.ah);
                     var1.drawRect(var4 % this.ae * this.z + 2, var4 / this.ae * this.cb + 2, this.gz - 2, this.ah - 2);
                     var1.setColor(Color.white);
                  }

                  if (++var4 >= this.abe.length) {
                     return;
                  }
               }
            }
         }
      }
   }

   @Override
   protected void am(RoleData var1) {
      Goodstable var2;
      if ((var2 = this.vf(this.ia + this.dx())) != null) {
         ((com.xy.a.Class48)this.wd.zc().j(46)).hr(var2, false);
      }
   }
}
