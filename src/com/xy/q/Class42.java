package com.xy.q;

import com.xy.a.Class127;
import com.xy.bean.Stall;
import com.xy.entity.Lingbao;
import com.xy.entity.RoleSummoning;
import com.xy.game.RoleData;
import com.xy.readbean.Goodstable;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;

public class Class42 extends Class25 {
   public static Image hf = com.xy.w.Class16.c("sc/d/89.png");
   private int eg;

   @Override
   protected void am(RoleData var1) {
      int var2 = this.dx();
      if (this.eg == 0) {
         Goodstable var6;
         if ((var6 = var1.getGood(var1.goodPacks[this.ia + var2])) != null) {
            ((com.xy.a.Class48)this.wd.zc().j(46)).hr(var6, false);
         }
      } else if (this.eg == 1) {
         RoleSummoning var5 = this.ia + var2 < var1.pets.size() ? var1.pets.get(this.ia + var2).getPet() : null;
         if (var5 != null) {
            ((com.xy.a.Class1)this.wd.zc().j(42)).aa(var5, null, false);
         }
      } else {
         if (this.eg == 2) {
            Lingbao var3;
            if ((var3 = var1.getLingBaoIndex(this.ia + var2)) == null) {
               return;
            }

            ((com.xy.a.Class7)this.wd.zc().j(45)).cs(var3, false);
         }
      }
   }

   protected void aem(Graphics var1, Stall var2, RoleData var3) {
      int var4 = this.dx();
      int var5 = 0;
      var1.setFont(Class49.ac);
      var1.setColor(Color.white);

      int var6;
      for (int var10000 = var6 = 0; var10000 < this.abe.length; var10000 = ++var6) {
         var5 = var6 + var4;
         if (this.lp != null) {
            var1.drawImage(this.lp, var6 % this.ae * this.z, var6 / this.ae * this.cb, this.gz + 2, this.ah + 2, null);
         }

         Goodstable var7;
         if ((var7 = var3.getGood(var3.goodPacks[var5])) == null) {
            if (this.abe[var6] != null) {
               this.abe[var6].e();
            }
         } else {
            if (this.abe[var6] == null || var7.getRgid() != this.abe[var6].e) {
               if (this.abe[var6] == null) {
                  this.abe[var6] = new com.xy.w.Class14();
               }

               this.abe[var6].g(var7);
            }

            Class42 var9;
            if (var5 != this.gv) {
               var9 = this;
               com.xy.w.Class16.j(var1, this.abe[var6].p, var6 % this.ae * this.z + 1, var6 / this.ae * this.cb + 1, this.gz, this.ah);
            } else {
               com.xy.w.Class16.j(var1, this.abe[var6].p, var6 % this.ae * this.z + 2, var6 / this.ae * this.cb + 2, this.gz, this.ah);
               var9 = this;
            }

            if (var9.abe[var6].c != null) {
               var1.drawString(this.abe[var6].c, var6 % this.ae * this.z + 4, var6 / this.ae * this.cb + 14);
            }

            if (var7.getGoodlock() == 1) {
               var1.drawImage(com.xy.w.Class15.s, var6 % this.ae * this.z + 36, var6 / this.ae * this.cb, 10, 12, null);
            }

            if (var2.getGood(var7.getRgid()) != null) {
               var1.drawImage(hf, var6 % this.ae * this.z + 29, var6 / this.ae * this.cb + 28, 20, 21, null);
            }

            if (this.bi && var5 == this.gw) {
               var1.setColor(Color.red);
               var1.drawRect(var6 % this.ae * this.z + 1, var6 / this.ae * this.cb + 1, this.gz, this.ah);
               var1.drawRect(var6 % this.ae * this.z + 2, var6 / this.ae * this.cb + 2, this.gz - 2, this.ah - 2);
               var1.setColor(Color.white);
            }
         }
      }
   }

   @Override
   public boolean at(int var1) {
      int var2;
      if ((var2 = var1 * this.ae * this.ha) == 0) {
         return true;
      } else {
         RoleData var3;
         if ((var3 = this.wd.yx()) == null) {
            return false;
         } else if (this.eg == 1) {
            return var2 < var3.pets.size();
         } else {
            return this.eg == 2 ? var3.getLingBaoIndex(var2) != null : false;
         }
      }
   }

   @Override
   protected void l() {
      if (this.eg == 0) {
         this.wd.zc().f(46);
      } else if (this.eg == 1) {
         this.wd.zc().f(42);
      } else {
         if (this.eg == 2) {
            this.wd.zc().f(45);
         }
      }
   }

   public Class42(int var1, Class30 var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
      super(var2, var3, var4, var5, var6, var7, var8, var9, var10);
      this.eg = var1;
   }

   @Override
   public int il() {
      int var1 = this.ae * this.ha;
      RoleData var2;
      if ((var2 = this.wd.yx()) == null) {
         return 0;
      } else if (this.eg == 1) {
         return (var2.pets.size() - 1) / var1;
      } else {
         return this.eg == 2 ? (var2.lingbaoList.size() - 1) / var1 : 0;
      }
   }

   public void aen(boolean var1, Lingbao var2, RoleData var3) {
      ((Class127)this.wd).cq(var2);
   }

   @Override
   protected void an(Graphics var1, RoleData var2) {
      Stall var3 = ((Class127)this.wd).amc();
      if (this.eg == 0) {
         this.aem(var1, var3, var2);
      } else if (this.eg == 1) {
         this.aeq(var1, var3, var2);
      } else {
         if (this.eg == 2) {
            this.aep(var1, var3, var2);
         }
      }
   }

   static {
      String var10000 = "\"m~j~6h !`6";
   }

   public void aeo(boolean var1, Goodstable var2, RoleData var3) {
      ((Class127)this.wd).cb(var2, var1 ? 1 : var2.getUsetime());
   }

   @Override
   protected void ao(int var1, MouseEvent var2, RoleData var3) {
      if (this.eg == 0) {
         Goodstable var6;
         if ((var6 = var3.getGood(var3.goodPacks[var1])) != null) {
            this.aeo(true, var6, var3);
         }
      } else if (this.eg == 1) {
         RoleSummoning var5 = var1 < var3.pets.size() ? var3.pets.get(var1).getPet() : null;
         if (var5 != null) {
            this.aer(true, var5, var3);
         }
      } else {
         if (this.eg == 2) {
            Lingbao var4;
            if ((var4 = var3.getLingBaoIndex(var1)) == null) {
               return;
            }

            this.aen(true, var4, var3);
         }
      }
   }

   public void y(int var1) {
      this.eg = var1;
   }

   protected void aep(Graphics var1, Stall var2, RoleData var3) {
      int var4 = this.dx();
      int var5 = 0;
      var1.setFont(Class49.ac);
      var1.setColor(Color.white);

      int var6;
      for (int var10000 = var6 = 0; var10000 < this.abe.length; var10000 = ++var6) {
         var5 = var6 + var4;
         if (this.lp != null) {
            var1.drawImage(this.lp, var6 % this.ae * this.z, var6 / this.ae * this.cb, this.gz + 2, this.ah + 2, null);
         }

         Lingbao var7;
         if ((var7 = var3.getLingBaoIndex(var5)) == null) {
            if (this.abe[var6] != null) {
               this.abe[var6].e();
            }
         } else {
            if (this.abe[var6] == null || var7.getBaoid() != this.abe[var6].e) {
               if (this.abe[var6] == null) {
                  this.abe[var6] = new com.xy.w.Class14();
               }

               this.abe[var6].j(var7);
            }

            Class42 var9;
            if (var5 != this.gv) {
               var9 = this;
               com.xy.w.Class16.j(var1, this.abe[var6].p, var6 % this.ae * this.z + 1, var6 / this.ae * this.cb + 1, this.gz, this.ah);
            } else {
               com.xy.w.Class16.j(var1, this.abe[var6].p, var6 % this.ae * this.z + 2, var6 / this.ae * this.cb + 2, this.gz, this.ah);
               var9 = this;
            }

            if (var9.bi && var5 == this.gw) {
               var1.setColor(Color.red);
               var1.drawRect(var6 % this.ae * this.z + 1, var6 / this.ae * this.cb + 1, this.gz, this.ah);
               var1.drawRect(var6 % this.ae * this.z + 2, var6 / this.ae * this.cb + 2, this.gz - 2, this.ah - 2);
               var1.setColor(Color.white);
            }
         }
      }
   }

   protected void aeq(Graphics var1, Stall var2, RoleData var3) {
      int var4 = this.dx();
      int var5 = 0;
      var1.setFont(Class49.ac);
      var1.setColor(Color.white);

      int var6;
      for (int var10000 = var6 = 0; var10000 < this.abe.length; var10000 = ++var6) {
         var5 = var6 + var4;
         if (this.lp != null) {
            var1.drawImage(this.lp, var6 % this.ae * this.z, var6 / this.ae * this.cb, this.gz + 2, this.ah + 2, null);
         }

         RoleSummoning var7 = var5 < var3.pets.size() ? var3.pets.get(var5).getPet() : null;
         if (var7 == null) {
            if (this.abe[var6] != null) {
               this.abe[var6].e();
            }
         } else {
            if (this.abe[var6] == null || var7.getSid() != this.abe[var6].e) {
               if (this.abe[var6] == null) {
                  this.abe[var6] = new com.xy.w.Class14();
               }

               this.abe[var6].i(var7);
            }

            Stall var9;
            if (var5 != this.gv) {
               var9 = var2;
               com.xy.w.Class16.j(var1, this.abe[var6].p, var6 % this.ae * this.z + 1, var6 / this.ae * this.cb + 1, this.gz, this.ah);
            } else {
               com.xy.w.Class16.j(var1, this.abe[var6].p, var6 % this.ae * this.z + 2, var6 / this.ae * this.cb + 2, this.gz, this.ah);
               var9 = var2;
            }

            if (var9.getPet(var7.getSid()) != null) {
               var1.drawImage(hf, var6 % this.ae * this.z + 29, var6 / this.ae * this.cb + 28, 20, 21, null);
            }

            if (this.bi && var5 == this.gw) {
               var1.setColor(Color.red);
               var1.drawRect(var6 % this.ae * this.z + 1, var6 / this.ae * this.cb + 1, this.gz, this.ah);
               var1.drawRect(var6 % this.ae * this.z + 2, var6 / this.ae * this.cb + 2, this.gz - 2, this.ah - 2);
               var1.setColor(Color.white);
            }
         }
      }
   }

   public void aer(boolean var1, RoleSummoning var2, RoleData var3) {
      ((Class127)this.wd).ew(var2);
   }

   @Override
   protected void ap(int var1, MouseEvent var2, RoleData var3) {
      if (this.eg == 0) {
         Goodstable var6;
         if ((var6 = var3.getGood(var3.goodPacks[var1])) != null) {
            this.aeo(false, var6, var3);
         }
      } else if (this.eg == 1) {
         RoleSummoning var5 = var1 < var3.pets.size() ? var3.pets.get(var1).getPet() : null;
         if (var5 != null) {
            this.aer(false, var5, var3);
         }
      } else {
         if (this.eg == 2) {
            Lingbao var4;
            if ((var4 = var3.getLingBaoIndex(var1)) == null) {
               return;
            }

            this.aen(false, var4, var3);
         }
      }
   }
}
