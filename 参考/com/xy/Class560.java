package com.xy;

import com.xy.game.RoleData;
import com.xy.readbean.Goodstable;
import com.xy.readbean.RoleTxBean;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.image.ImageObserver;
import java.math.BigDecimal;
import java.util.List;

public class Class560 extends Class397 {
   private int ay;

   protected void cl(RoleData var1) {
      if (this.ay == --5) {
         int var2;
         if ((var2 = ((Class131)this.lo).e()) < 0) {
            return;
         }

         if (var2 != --3) {
            Class467 var5;
            if ((var5 = this.asw[this.j]) != null && var5.o == (127 & 7)) {
               RoleTxBean var6 = this.lo.vc().bw(var5.i.intValue());
               ((Class270)this.lo.ve().e(47 & 126)).rg(var6);
               return;
            }

            return;
         }

         BigDecimal var3 = (var2 = this.j + this.ot()) < var1.wingGoodsList.size() ? (BigDecimal)var1.wingGoodsList.get(var2) : null;
         Goodstable var4 = var3 != null ? var1.getGood(var3) : null;
         if (var4 == null) {
            return;
         }

         ((Class270)this.lo.ve().e(127 & 46)).oj(var4, (boolean)(3 >> 2));
      }

   }

   public void fz(Graphics var1) {
      int var4 = this.ot();
      int var3 = 3 >> 2;

      int var2;
      for(int var10000 = var2 = 3 & 4; var10000 < this.asw.length; var10000 = var2) {
         var3 = var2 + var4;
         if (this.ama != null) {
            var1.drawImage(this.ama, var2 % this.cy * this.dp, var2 / this.cy * this.gc, this.bn + --2, this.m + (1 ^ 3), (ImageObserver)null);
         }

         if (this.asw[var2] != null && this.asw[var2].o == (87 & 47)) {
            if (var3 != this.gv) {
               Class511.d(var1, this.asw[var2].p, var2 % this.cy * this.dp + --1, var2 / this.cy * this.gc + (3 >> 1), this.bn, this.m);
            } else {
               Class511.d(var1, this.asw[var2].p, var2 % this.cy * this.dp + (5 >> 1), var2 / this.cy * this.gc + (1 ^ 3), this.bn, this.m);
            }
         }

         ++var2;
      }

   }

   protected void cn(int var1, MouseEvent var2, RoleData var3) {
      if (this.ay == --5) {
         Class467 var4;
         if ((var4 = this.asw[var1 - this.ot()]) == null || var4.o == 0) {
            return;
         }

         Class131 var5 = (Class131)this.lo;
         var5.bx(var4.i, var5.e());
      }

   }

   protected void q() {
      this.lo.ve().n(62 & 111);
   }

   protected void cm(Graphics var1, RoleData var2) {
      if (this.ay == --5) {
         this.xx(var1, var2);
      } else {
         if (this.ay == (47 & 86)) {
            this.fz(var1);
         }

      }
   }

   protected void cj(int var1, MouseEvent var2, RoleData var3) {
   }

   public void xx(Graphics var1, RoleData var2) {
      if (((Class131)this.lo).e() != --3) {
         this.fz(var1);
      } else {
         int var5 = this.ot();
         int var4 = 3 & 4;

         int var3;
         for(int var10000 = var3 = 3 & 4; var10000 < this.asw.length; var10000 = var3) {
            var4 = var3 + var5;
            if (this.ama != null) {
               var1.drawImage(this.ama, var3 % this.cy * this.dp, var3 / this.cy * this.gc, this.bn + (5 >> 1), this.m + --2, (ImageObserver)null);
            }

            BigDecimal var6 = var4 < var2.wingGoodsList.size() ? (BigDecimal)var2.wingGoodsList.get(var4) : null;
            Goodstable var7 = var6 != null ? var2.getGood(var6) : null;
            if (var7 == null) {
               if (this.asw[var3] != null) {
                  this.asw[var3].g();
               }
            } else {
               if (this.asw[var3] == null || var7.getRgid() != this.asw[var3].i) {
                  if (this.asw[var3] == null) {
                     this.asw[var3] = new Class467();
                  }

                  this.asw[var3].d(var7);
               }

               Class560 var8;
               if (var4 != this.gv) {
                  var8 = this;
                  Class511.d(var1, this.asw[var3].p, var3 % this.cy * this.dp + (3 >> 1), var3 / this.cy * this.gc + (5 >> 2), this.bn, this.m);
               } else {
                  Class511.d(var1, this.asw[var3].p, var3 % this.cy * this.dp + --2, var3 / this.cy * this.gc + (1 ^ 3), this.bn, this.m);
                  var8 = this;
               }

               if (var8.aeg && var4 == this.fk) {
                  var1.setColor(Color.red);
                  var1.drawRect(var3 % this.cy * this.dp + (4 ^ 5), var3 / this.cy * this.gc + (5 >> 2), this.bn, this.m);
                  var1.drawRect(var3 % this.cy * this.dp + (5 >> 1), var3 / this.cy * this.gc + --2, this.bn - --2, this.m - (1 ^ 3));
                  var1.setColor(Color.white);
               }
            }

            ++var3;
         }

      }
   }

   public boolean au(int var1) {
      if (this.ay != --5) {
         return false;
      } else {
         RoleData var5;
         if ((var5 = this.lo.vd()) == null) {
            return (boolean)(3 ^ 3);
         } else {
            int var3;
            if ((var3 = ((Class131)this.lo).e()) < 0) {
               return (boolean)(2 & 5);
            } else {
               int var10000;
               if (var3 == --3) {
                  int var8;
                  for(var10000 = var8 = 0; var10000 < this.asw.length; var10000 = var8) {
                     if (this.asw[var8] != null) {
                        this.asw[var8].g();
                     }

                     ++var8;
                  }

                  if (var1 != 0 && var1 * this.cy * this.gw >= var5.wingGoodsList.size()) {
                     return (boolean)(3 >> 2);
                  } else {
                     return true;
                  }
               } else {
                  List var4 = var5.getPackRecord().getTX(var3 + (3 & 5), this.lo.vc());
                  if ((var3 = var1 * this.cy * this.gw) >= var4.size() && var1 != 0) {
                     return (boolean)(3 ^ 3);
                  } else {
                     int var2;
                     for(var10000 = var2 = 0; var10000 < this.asw.length; var10000 = var2) {
                        if (this.asw[var2] != null) {
                           this.asw[var2].g();
                        }

                        ++var2;
                     }

                     var2 = 2 & 5;
                     int var6 = (var1 + --1) * this.cy * this.gw;

                     for(var10000 = var3; var10000 < var6 && var3 < var4.size(); var10000 = var3) {
                        RoleTxBean var7 = (RoleTxBean)var4.get(var3);
                        if (this.asw[var2] == null) {
                           this.asw[var2] = new Class467();
                        }

                        this.asw[var2++].b(var7);
                        ++var3;
                     }

                     return true;
                  }
               }
            }
         }
      }
   }

   public int ae() {
      int var1 = this.cy * this.gw;
      if (this.ay == --5) {
         RoleData var2;
         if ((var2 = this.lo.vd()) == null) {
            return 2 & 5;
         } else {
            int var3;
            if ((var3 = ((Class131)this.lo).e()) < 0) {
               return 3 & 4;
            } else {
               return var3 != --3 ? (var2.getPackRecord().getTX(var3 + --1, this.lo.vc()).size() - (2 ^ 3)) / var1 : (var2.wingGoodsList.size() - (3 & 5)) / var1;
            }
         }
      } else {
         return 0;
      }
   }

   public Class560(int var1, Class345 var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
      super(var2, var3, var4, var5, var6, var7, var8, var9, var10);
      this.ay = var1;
   }
}
