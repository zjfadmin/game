package com.xy.q;

import com.xy.a.q.Class105;
import com.xy.game.RoleData;
import com.xy.readbean.Goodstable;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;

public class Class13 extends Class25 {
   private List<Long> eq;
   private int eg;

   @Override
   protected void am(RoleData var1) {
      Goodstable var2;
      if ((var2 = this.ok(this.ia + this.dx(), var1)) != null) {
         ((com.xy.a.Class48)this.wd.zc().j(46)).hr(var2, false);
      }
   }

   @Override
   protected void ao(int var1, MouseEvent var2, RoleData var3) {
      Goodstable var4;
      if ((var4 = this.ok(var1, var3)) != null) {
         if (this.wd instanceof com.xy.a.q.Class41) {
            ((com.xy.a.q.Class41)this.wd).bb(var4);
         } else if (this.wd instanceof Class105) {
            ((Class105)this.wd).bb(var4);
         } else if (this.wd instanceof com.xy.a.a.Class19) {
            ((com.xy.a.a.Class19)this.wd).bb(var4);
         } else if (this.wd instanceof com.xy.a.i.Class10) {
            ((com.xy.a.i.Class10)this.wd).bb(var4);
         } else if (this.wd instanceof com.xy.a.i.Class6) {
            ((com.xy.a.i.Class6)this.wd).bb(var4);
         } else if (this.wd instanceof com.xy.a.i.Class11) {
            ((com.xy.a.i.Class11)this.wd).bb(var4);
         } else if (this.wd instanceof com.xy.a.a.Class27) {
            ((com.xy.a.a.Class27)this.wd).bb(var4);
         } else {
            if (this.wd instanceof com.xy.a.q.Class13) {
               ((com.xy.a.q.Class13)this.wd).br(var4);
            }
         }
      }
   }

   public long ee() {
      return this.eq != null && this.eq.size() != 0 ? this.eq.get(0) : -1L;
   }

   public void y(int var1) {
      this.eg = var1;
   }

   @Override
   public boolean at(int var1) {
      int var2;
      if ((var2 = var1 * this.ae * this.ha) == 0) {
         return true;
      } else {
         RoleData var3;
         return (var3 = this.wd.yx()) == null ? false : this.ok(var2, var3) != null;
      }
   }

   @Override
   protected void l() {
      this.wd.zc().f(46);
   }

   public Class13(Class30 var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      super(var1, var2, var3, var4, var5, var6, var7, var8, var9);
   }

   @Override
   protected void ap(int var1, MouseEvent var2, RoleData var3) {
      Goodstable var4;
      if ((var4 = this.ok(var1, var3)) != null) {
         if (this.wd instanceof com.xy.a.q.Class41) {
            ((com.xy.a.q.Class41)this.wd).bb(var4);
         } else if (this.wd instanceof Class105) {
            ((Class105)this.wd).bb(var4);
         } else if (this.wd instanceof com.xy.a.a.Class19) {
            ((com.xy.a.a.Class19)this.wd).bb(var4);
         } else if (this.wd instanceof com.xy.a.i.Class10) {
            ((com.xy.a.i.Class10)this.wd).bb(var4);
         } else if (this.wd instanceof com.xy.a.i.Class6) {
            ((com.xy.a.i.Class6)this.wd).bb(var4);
         } else if (this.wd instanceof com.xy.a.i.Class11) {
            ((com.xy.a.i.Class11)this.wd).bb(var4);
         } else if (this.wd instanceof com.xy.a.a.Class27) {
            ((com.xy.a.a.Class27)this.wd).bb(var4);
         } else {
            if (this.wd instanceof com.xy.a.q.Class13) {
               ((com.xy.a.q.Class13)this.wd).br(var4);
            }
         }
      }
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

      for (int var8 = var5 = 0; var8 < var2.goodPacks.length; var8 = ++var5) {
         Goodstable var6;
         if ((var6 = var2.getGood(var2.goodPacks[var5])) != null
            && (this.eq == null || this.eq.contains(var6.getType()))
            && (this.eg != 1 || ((com.xy.a.q.Class13)this.wd)._if(var6))) {
            if (var4 < 0) {
               var4++;
            } else {
               if (this.abe[var4] == null || var6.getRgid() != this.abe[var4].e) {
                  if (this.abe[var4] == null) {
                     this.abe[var4] = new com.xy.w.Class14();
                  }

                  this.abe[var4].g(var6);
               }

               Class13 var9;
               if (var4 != this.gv) {
                  var9 = this;
                  com.xy.w.Class16.j(var1, this.abe[var4].p, var4 % this.ae * this.z + 1, var4 / this.ae * this.cb + 1, this.gz, this.ah);
               } else {
                  com.xy.w.Class16.j(var1, this.abe[var4].p, var4 % this.ae * this.z + 2, var4 / this.ae * this.cb + 2, this.gz, this.ah);
                  var9 = this;
               }

               if (var9.abe[var4].c != null) {
                  var1.drawString(this.abe[var4].c, var4 % this.ae * this.z + 4, var4 / this.ae * this.cb + 14);
               }

               if (var6.getGoodlock() == 1) {
                  var1.drawImage(com.xy.w.Class15.s, var4 % this.ae * this.z + 36, var4 / this.ae * this.cb, 10, 12, null);
               }

               if (this.bi && var4 + var3 == this.gw) {
                  var1.setColor(Color.red);
                  var1.drawRect(var4 % this.ae * this.z + 1, var4 / this.ae * this.cb + 1, this.gz - 2, this.ah - 2);
                  var1.drawRect(var4 % this.ae * this.z + 2, var4 / this.ae * this.cb + 2, this.gz - 4, this.ah - 4);
                  var1.setColor(Color.white);
               }

               if (++var4 >= this.abe.length) {
                  return;
               }
            }
         }
      }
   }

   public int hx() {
      return this.eg;
   }

   public Goodstable ok(int var1, RoleData var2) {
      int var3;
      for (int var10000 = var3 = 0; var10000 < var2.goodPacks.length; var10000 = ++var3) {
         Goodstable var4;
         if ((var4 = var2.getGood(var2.goodPacks[var3])) != null
            && (this.eq == null || this.eq.contains(var4.getType()))
            && (this.eg != 1 || ((com.xy.a.q.Class13)this.wd)._if(var4))) {
            if (var1 == 0) {
               return var4;
            }

            var1--;
         }
      }

      return null;
   }

   public void ol(long... var1) {
      if (this.eq == null) {
         this.eq = new ArrayList<>();
      } else {
         this.eq.clear();
      }

      int var2;
      for (int var10000 = var2 = 0; var10000 < var1.length; var10000 = ++var2) {
         if (var1[var2] != -1L) {
            this.eq.add(var1[var2]);
         }
      }
   }
}
