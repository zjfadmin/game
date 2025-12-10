package com.xy;

import com.xy.bean.Stall;
import com.xy.entity.Lingbao;
import com.xy.entity.RoleSummoning;
import com.xy.game.RoleData;
import com.xy.game.RolePet;
import com.xy.readbean.Goodstable;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.image.ImageObserver;
import java.util.List;

public class Class132 extends Class397 {
   private int ay;
   public static Image rv = Class511.a("sc/d/89.png");

   public void tt(boolean var1, RoleSummoning var2, RoleData var3) {
      ((Class130)this.lo).v(var2);
   }

   public int ae() {
      int var1 = this.cy * this.gw;
      RoleData var2;
      if ((var2 = this.lo.vd()) == null) {
         return 5 >> 3;
      } else if (this.ay == 3 >> 1) {
         return (var2.pets.size() - (2 ^ 3)) / var1;
      } else {
         return this.ay == (1 ^ 3) ? (var2.lingbaoList.size() - --1) / var1 : 0;
      }
   }

   protected void cn(int var1, MouseEvent var2, RoleData var3) {
      if (this.ay == 0) {
         Goodstable var6;
         if ((var6 = var3.getGood(var3.goodPacks[var1])) != null) {
            this.tu((boolean)(2 & 5), var6, var3);
         }
      } else if (this.ay == 5 >> 2) {
         RoleSummoning var5 = var1 < var3.pets.size() ? ((RolePet)var3.pets.get(var1)).getPet() : null;
         if (var5 != null) {
            this.tt((boolean)(3 >> 2), var5, var3);
         }
      } else {
         if (this.ay == (1 ^ 3)) {
            Lingbao var4;
            if ((var4 = var3.getLingBaoIndex(var1)) == null) {
               return;
            }

            this.tw((boolean)(3 ^ 3), var4, var3);
         }

      }
   }

   public void as(int var1) {
      this.ay = var1;
   }

   public void tu(boolean var1, Goodstable var2, RoleData var3) {
      ((Class130)this.lo).ew(var2, var1 ? 3 >> 1 : var2.getUsetime());
   }

   protected void cl(RoleData var1) {
      int var2 = this.ot();
      if (this.ay == 0) {
         Goodstable var5;
         if ((var5 = var1.getGood(var1.goodPacks[this.j + var2])) != null) {
            ((Class270)this.lo.ve().e(126 & 47)).oj(var5, (boolean)(2 & 5));
         }
      } else if (this.ay == (4 ^ 5)) {
         RoleSummoning var4 = this.j + var2 < var1.pets.size() ? ((RolePet)var1.pets.get(this.j + var2)).getPet() : null;
         if (var4 != null) {
            ((Class106)this.lo.ve().e(126 & 43)).amj(var4, (String)null, (List)null, (boolean)(3 >> 2));
         }
      } else {
         if (this.ay == 5 >> 1) {
            Lingbao var3;
            if ((var3 = var1.getLingBaoIndex(this.j + var2)) == null) {
               return;
            }

            ((Class73)this.lo.ve().e(125 & 47)).ge(var3, (boolean)(2 & 5));
         }

      }
   }

   protected void q() {
      if (this.ay == 0) {
         this.lo.ve().n(110 & 63);
      } else if (this.ay == --1) {
         this.lo.ve().n(110 & 59);
      } else {
         if (this.ay == 5 >> 1) {
            this.lo.ve().n(63 & 109);
         }

      }
   }

   protected void cm(Graphics var1, RoleData var2) {
      Stall var3 = ((Class130)this.lo).fl();
      if (this.ay == 0) {
         this.tx(var1, var3, var2);
      } else if (this.ay == --1) {
         this.ty(var1, var3, var2);
      } else {
         if (this.ay == 5 >> 1) {
            this.tv(var1, var3, var2);
         }

      }
   }

   protected void cj(int var1, MouseEvent var2, RoleData var3) {
      if (this.ay == 0) {
         Goodstable var6;
         if ((var6 = var3.getGood(var3.goodPacks[var1])) != null) {
            this.tu((boolean)(5 >> 2), var6, var3);
         }
      } else if (this.ay == 5 >> 2) {
         RoleSummoning var5 = var1 < var3.pets.size() ? ((RolePet)var3.pets.get(var1)).getPet() : null;
         if (var5 != null) {
            this.tt((boolean)(--1), var5, var3);
         }
      } else {
         if (this.ay == 5 >> 1) {
            Lingbao var4;
            if ((var4 = var3.getLingBaoIndex(var1)) == null) {
               return;
            }

            this.tw((boolean)(2 ^ 3), var4, var3);
         }

      }
   }

   public Class132(int var1, Class345 var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
      super(var2, var3, var4, var5, var6, var7, var8, var9, var10);
      this.ay = var1;
   }

   protected void tv(Graphics var1, Stall var2, RoleData var3) {
      int var7 = this.ot();
      int var4 = 3 ^ 3;
      var1.setFont(Class681.ce);
      var1.setColor(Color.white);

      int var5;
      for(int var10000 = var5 = 3 ^ 3; var10000 < this.asw.length; var10000 = var5) {
         var4 = var5 + var7;
         if (this.ama != null) {
            var1.drawImage(this.ama, var5 % this.cy * this.dp, var5 / this.cy * this.gc, this.bn + --2, this.m + (1 ^ 3), (ImageObserver)null);
         }

         Lingbao var6;
         if ((var6 = var3.getLingBaoIndex(var4)) == null) {
            if (this.asw[var5] != null) {
               this.asw[var5].g();
            }
         } else {
            if (this.asw[var5] == null || var6.getBaoid() != this.asw[var5].i) {
               if (this.asw[var5] == null) {
                  this.asw[var5] = new Class467();
               }

               this.asw[var5].c(var6);
            }

            Class132 var8;
            if (var4 != this.gv) {
               var8 = this;
               Class511.d(var1, this.asw[var5].p, var5 % this.cy * this.dp + (3 & 5), var5 / this.cy * this.gc + (3 >> 1), this.bn, this.m);
            } else {
               Class511.d(var1, this.asw[var5].p, var5 % this.cy * this.dp + --2, var5 / this.cy * this.gc + (5 >> 1), this.bn, this.m);
               var8 = this;
            }

            if (var8.aeg && var4 == this.fk) {
               var1.setColor(Color.red);
               var1.drawRect(var5 % this.cy * this.dp + (4 ^ 5), var5 / this.cy * this.gc + (2 ^ 3), this.bn, this.m);
               var1.drawRect(var5 % this.cy * this.dp + (5 >> 1), var5 / this.cy * this.gc + (5 >> 1), this.bn - --2, this.m - (5 >> 1));
               var1.setColor(Color.white);
            }
         }

         ++var5;
      }

   }

   public boolean au(int var1) {
      if ((var1 = var1 * this.cy * this.gw) == 0) {
         return (boolean)(3 >> 1);
      } else {
         RoleData var2;
         if ((var2 = this.lo.vd()) == null) {
            return (boolean)(3 >> 2);
         } else if (this.ay == --1) {
            return (boolean)(var1 < var2.pets.size() ? 2 ^ 3 : 0);
         } else if (this.ay == (1 ^ 3)) {
            return (boolean)(var2.getLingBaoIndex(var1) != null ? --1 : 0);
         } else {
            return false;
         }
      }
   }

   public void tw(boolean var1, Lingbao var2, RoleData var3) {
      ((Class130)this.lo).fn(var2);
   }

   protected void tx(Graphics var1, Stall var2, RoleData var3) {
      int var4 = this.ot();
      int var5 = 5 >> 3;
      var1.setFont(Class681.ce);
      var1.setColor(Color.white);

      int var6;
      for(int var10000 = var6 = 3 ^ 3; var10000 < this.asw.length; var10000 = var6) {
         var5 = var6 + var4;
         if (this.ama != null) {
            var1.drawImage(this.ama, var6 % this.cy * this.dp, var6 / this.cy * this.gc, this.bn + (5 >> 1), this.m + (5 >> 1), (ImageObserver)null);
         }

         Goodstable var7;
         if ((var7 = var3.getGood(var3.goodPacks[var5])) == null) {
            if (this.asw[var6] != null) {
               this.asw[var6].g();
            }
         } else {
            if (this.asw[var6] == null || var7.getRgid() != this.asw[var6].i) {
               if (this.asw[var6] == null) {
                  this.asw[var6] = new Class467();
               }

               this.asw[var6].d(var7);
            }

            Class132 var8;
            if (var5 != this.gv) {
               var8 = this;
               Class511.d(var1, this.asw[var6].p, var6 % this.cy * this.dp + (4 ^ 5), var6 / this.cy * this.gc + --1, this.bn, this.m);
            } else {
               Class511.d(var1, this.asw[var6].p, var6 % this.cy * this.dp + --2, var6 / this.cy * this.gc + (5 >> 1), this.bn, this.m);
               var8 = this;
            }

            if (var8.asw[var6].k != null) {
               var1.drawString(this.asw[var6].k, var6 % this.cy * this.dp + --4, var6 / this.cy * this.gc + (62 & 79));
            }

            if (this.asw[var6].a != null) {
               var1.drawString(this.asw[var6].a, var6 % this.cy * this.dp + --4, var6 / this.cy * this.gc + this.m - (1 ^ 3));
            }

            if (var7.getGoodlock() == (3 & 5)) {
               var1.drawImage(Class222.u, var6 % this.cy * this.dp + (126 & 37), var6 / this.cy * this.gc, 10 & 127, 29 & 110, (ImageObserver)null);
            }

            if (var2.getGood(var7.getRgid()) != null) {
               var1.drawImage(rv, var6 % this.cy * this.dp + (31 & 125), var6 / this.cy * this.gc + (61 & 94), 28 & 119, 85 & 63, (ImageObserver)null);
            }

            if (this.aeg && var5 == this.fk) {
               var1.setColor(Color.red);
               var1.drawRect(var6 % this.cy * this.dp + (5 >> 2), var6 / this.cy * this.gc + --1, this.bn, this.m);
               var1.drawRect(var6 % this.cy * this.dp + (5 >> 1), var6 / this.cy * this.gc + (5 >> 1), this.bn - (5 >> 1), this.m - (5 >> 1));
               var1.setColor(Color.white);
            }
         }

         ++var6;
      }

   }

   protected void ty(Graphics var1, Stall var2, RoleData var3) {
      int var4 = this.ot();
      int var5 = 3 & 4;
      var1.setFont(Class681.ce);
      var1.setColor(Color.white);

      int var6;
      for(int var10000 = var6 = 3 >> 2; var10000 < this.asw.length; var10000 = var6) {
         var5 = var6 + var4;
         if (this.ama != null) {
            var1.drawImage(this.ama, var6 % this.cy * this.dp, var6 / this.cy * this.gc, this.bn + (5 >> 1), this.m + --2, (ImageObserver)null);
         }

         RoleSummoning var7 = var5 < var3.pets.size() ? ((RolePet)var3.pets.get(var5)).getPet() : null;
         if (var7 == null) {
            if (this.asw[var6] != null) {
               this.asw[var6].g();
            }
         } else {
            if (this.asw[var6] == null || var7.getSid() != this.asw[var6].i) {
               if (this.asw[var6] == null) {
                  this.asw[var6] = new Class467();
               }

               this.asw[var6].a(var7);
            }

            Stall var8;
            if (var5 != this.gv) {
               var8 = var2;
               Class511.d(var1, this.asw[var6].p, var6 % this.cy * this.dp + --1, var6 / this.cy * this.gc + (3 & 5), this.bn, this.m);
            } else {
               Class511.d(var1, this.asw[var6].p, var6 % this.cy * this.dp + (1 ^ 3), var6 / this.cy * this.gc + (5 >> 1), this.bn, this.m);
               var8 = var2;
            }

            if (var8.getPet(var7.getSid()) != null) {
               var1.drawImage(rv, var6 % this.cy * this.dp + (127 & 29), var6 / this.cy * this.gc + (61 & 94), 84 & 63, 55 & 93, (ImageObserver)null);
            }

            if (this.aeg && var5 == this.fk) {
               var1.setColor(Color.red);
               var1.drawRect(var6 % this.cy * this.dp + (4 ^ 5), var6 / this.cy * this.gc + (3 >> 1), this.bn, this.m);
               var1.drawRect(var6 % this.cy * this.dp + --2, var6 / this.cy * this.gc + (5 >> 1), this.bn - (1 ^ 3), this.m - (1 ^ 3));
               var1.setColor(Color.white);
            }
         }

         ++var6;
      }

   }
}
