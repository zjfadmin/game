package com.xy.q;

import com.xy.game.RoleData;
import com.xy.readbean.Goodstable;
import com.xy.readbean.RoleTxBean;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.math.BigDecimal;
import java.util.List;

public class Class20 extends Class25 {
   private int eg;

   public void tk(Graphics var1, RoleData var2) {
      if (((com.xy.a.w.Class26)this.wd).dx() != 3) {
         this.dn(var1);
      } else {
         int var5 = this.dx();
         int var6 = 0;

         int var7;
         for (int var10000 = var7 = 0; var10000 < this.abe.length; var10000 = ++var7) {
            var6 = var7 + var5;
            if (this.lp != null) {
               var1.drawImage(this.lp, var7 % this.ae * this.z, var7 / this.ae * this.cb, this.gz + 2, this.ah + 2, null);
            }

            BigDecimal var8 = var6 < var2.wingGoodsList.size() ? var2.wingGoodsList.get(var6) : null;
            Goodstable var9 = var8 != null ? var2.getGood(var8) : null;
            if (var9 == null) {
               if (this.abe[var7] != null) {
                  this.abe[var7].e();
               }
            } else {
               if (this.abe[var7] == null || var9.getRgid() != this.abe[var7].e) {
                  if (this.abe[var7] == null) {
                     this.abe[var7] = new com.xy.w.Class14();
                  }

                  this.abe[var7].g(var9);
               }

               Class20 var11;
               if (var6 != this.gv) {
                  var11 = this;
                  com.xy.w.Class16.j(var1, this.abe[var7].p, var7 % this.ae * this.z + 1, var7 / this.ae * this.cb + 1, this.gz, this.ah);
               } else {
                  com.xy.w.Class16.j(var1, this.abe[var7].p, var7 % this.ae * this.z + 2, var7 / this.ae * this.cb + 2, this.gz, this.ah);
                  var11 = this;
               }

               if (var11.bi && var6 == this.gw) {
                  var1.setColor(Color.red);
                  var1.drawRect(var7 % this.ae * this.z + 1, var7 / this.ae * this.cb + 1, this.gz, this.ah);
                  var1.drawRect(var7 % this.ae * this.z + 2, var7 / this.ae * this.cb + 2, this.gz - 2, this.ah - 2);
                  var1.setColor(Color.white);
               }
            }
         }
      }
   }

   @Override
   protected void ao(int var1, MouseEvent var2, RoleData var3) {
   }

   @Override
   protected void ap(int var1, MouseEvent var2, RoleData var3) {
      if (this.eg == 5) {
         com.xy.w.Class14 var4;
         if ((var4 = this.abe[var1 - this.dx()]) == null || var4.l == 0) {
            return;
         }

         com.xy.a.w.Class26 var5 = (com.xy.a.w.Class26)this.wd;
         var5.bj(var4.e, var5.dx());
      }
   }

   @Override
   protected void an(Graphics var1, RoleData var2) {
      if (this.eg == 5) {
         this.tk(var1, var2);
      } else {
         if (this.eg == 6) {
            this.dn(var1);
         }
      }
   }

   @Override
   protected void am(RoleData var1) {
      if (this.eg == 5) {
         int var3;
         if ((var3 = ((com.xy.a.w.Class26)this.wd).dx()) < 0) {
            return;
         }

         if (var3 != 3) {
            com.xy.w.Class14 var7;
            if ((var7 = this.abe[this.ia]) != null && var7.l == 7) {
               RoleTxBean var8 = this.wd.yt().ci(var7.e.intValue());
               ((com.xy.a.Class48)this.wd.zc().j(46)).qo(var8);
               return;
            }

            return;
         }

         int var4;
         BigDecimal var5 = (var4 = this.ia + this.dx()) < var1.wingGoodsList.size() ? var1.wingGoodsList.get(var4) : null;
         Goodstable var6 = var5 != null ? var1.getGood(var5) : null;
         if (var6 == null) {
            return;
         }

         ((com.xy.a.Class48)this.wd.zc().j(46)).hr(var6, false);
      }
   }

   public void dn(Graphics var1) {
      int var2 = this.dx();
      int var3 = 0;

      int var4;
      for (int var10000 = var4 = 0; var10000 < this.abe.length; var10000 = ++var4) {
         var3 = var4 + var2;
         if (this.lp != null) {
            var1.drawImage(this.lp, var4 % this.ae * this.z, var4 / this.ae * this.cb, this.gz + 2, this.ah + 2, null);
         }

         if (this.abe[var4] != null && this.abe[var4].l == 7) {
            if (var3 != this.gv) {
               com.xy.w.Class16.j(var1, this.abe[var4].p, var4 % this.ae * this.z + 1, var4 / this.ae * this.cb + 1, this.gz, this.ah);
            } else {
               com.xy.w.Class16.j(var1, this.abe[var4].p, var4 % this.ae * this.z + 2, var4 / this.ae * this.cb + 2, this.gz, this.ah);
            }
         }
      }
   }

   @Override
   protected void l() {
      this.wd.zc().f(46);
   }

   public Class20(int var1, Class30 var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
      super(var2, var3, var4, var5, var6, var7, var8, var9, var10);
      this.eg = var1;
   }

   @Override
   public boolean at(int var1) {
      if (this.eg != 5) {
         return false;
      } else {
         RoleData var2;
         if ((var2 = this.wd.yx()) == null) {
            return false;
         } else {
            int var4;
            if ((var4 = ((com.xy.a.w.Class26)this.wd).dx()) < 0) {
               return false;
            } else if (var4 == 3) {
               int var10;
               for (int var13 = var10 = 0; var13 < this.abe.length; var13 = ++var10) {
                  if (this.abe[var10] != null) {
                     this.abe[var10].e();
                  }
               }

               return var1 == 0 || var1 * this.ae * this.ha < var2.wingGoodsList.size();
            } else {
               List var5 = var2.getPackRecord().getTX(var4 + 1, this.wd.yt());
               int var6;
               if ((var6 = var1 * this.ae * this.ha) >= var5.size() && var1 != 0) {
                  return false;
               } else {
                  int var7;
                  for (int var10000 = var7 = 0; var10000 < this.abe.length; var10000 = ++var7) {
                     if (this.abe[var7] != null) {
                        this.abe[var7].e();
                     }
                  }

                  var7 = 0;
                  int var8 = (var1 + 1) * this.ae * this.ha;

                  for (int var12 = var6; var12 < var8 && var6 < var5.size(); var12 = ++var6) {
                     RoleTxBean var9 = (RoleTxBean)var5.get(var6);
                     if (this.abe[var7] == null) {
                        this.abe[var7] = new com.xy.w.Class14();
                     }

                     this.abe[var7++].d(var9);
                  }

                  return true;
               }
            }
         }
      }
   }

   @Override
   public int il() {
      int var1 = this.ae * this.ha;
      if (this.eg == 5) {
         RoleData var2;
         if ((var2 = this.wd.yx()) == null) {
            return 0;
         } else {
            int var4;
            if ((var4 = ((com.xy.a.w.Class26)this.wd).dx()) < 0) {
               return 0;
            } else {
               return var4 != 3 ? (var2.getPackRecord().getTX(var4 + 1, this.wd.yt()).size() - 1) / var1 : (var2.wingGoodsList.size() - 1) / var1;
            }
         }
      } else {
         return 0;
      }
   }
}
