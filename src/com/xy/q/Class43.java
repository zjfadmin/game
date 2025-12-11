package com.xy.q;

import com.xy.a.Class107;
import com.xy.a.q.Class97;
import com.xy.formula.GoodType;
import com.xy.game.RoleData;
import com.xy.readbean.Goodstable;
import com.xy.readbean.StallBuyData;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Class43 extends Class25 {
   private List<BigDecimal> jr = new ArrayList<>();

   @Override
   protected void ap(int var1, MouseEvent var2, RoleData var3) {
      Goodstable var4;
      if ((var4 = var3.getGood(this.aaf(var1))) != null) {
         if (this.wd instanceof Class97) {
            Class97 var5 = (Class97)this.wd;
            if (GoodType.ag(var4.getType()) && this.wd.zc().l(94) != null) {
               String var10001 = "讵兠倘室暶捊拂胕撏佴";
               this.wd.afx.dp("请先做完更换技能操作");
            } else {
               var5.bb(var4);
               var5.h();
            }
         } else {
            if (this.wd instanceof Class107) {
               ((Class107)this.wd).cb(var4, var4.getUsetime());
            }
         }
      }
   }

   public void fm(List<BigDecimal> var1) {
      this.jr = var1;
   }

   @Override
   protected void ao(int var1, MouseEvent var2, RoleData var3) {
      Goodstable var4;
      if ((var4 = var3.getGood(this.aaf(var1))) != null) {
         if (this.wd instanceof Class107) {
            ((Class107)this.wd).cb(var4, 1);
         }
      }
   }

   public BigDecimal aaf(int var1) {
      if (this.jr == null) {
         return null;
      } else {
         return var1 < this.jr.size() ? this.jr.get(var1) : null;
      }
   }

   @Override
   protected void an(Graphics var1, RoleData var2) {
      int var3 = this.dx();
      int var4 = 0;
      var1.setFont(Class49.ac);
      var1.setColor(Color.white);

      int var5;
      for (int var10000 = var5 = 0; var10000 < this.abe.length; var10000 = ++var5) {
         var4 = var5 + var3;
         if (this.lp != null) {
            var1.drawImage(this.lp, var5 % this.ae * this.z, var5 / this.ae * this.cb, this.gz + 2, this.ah + 2, null);
         }

         Goodstable var6;
         if ((var6 = var2.getGood(this.aaf(var4))) == null) {
            if (this.abe[var5] != null) {
               this.abe[var5].e();
            }
         } else {
            if (this.abe[var5] == null || var6.getRgid() != this.abe[var5].e) {
               if (this.abe[var5] == null) {
                  this.abe[var5] = new com.xy.w.Class14();
               }

               this.abe[var5].g(var6);
            }

            Class43 var8;
            if (var4 != this.gv) {
               var8 = this;
               com.xy.w.Class16.j(var1, this.abe[var5].p, var5 % this.ae * this.z + 1, var5 / this.ae * this.cb + 1, this.gz, this.ah);
            } else {
               com.xy.w.Class16.j(var1, this.abe[var5].p, var5 % this.ae * this.z + 2, var5 / this.ae * this.cb + 2, this.gz, this.ah);
               var8 = this;
            }

            if (var8.abe[var5].c != null) {
               var1.drawString(this.abe[var5].c, var5 % this.ae * this.z + 4, var5 / this.ae * this.cb + 14);
            }

            if (var6.getGoodlock() == 1) {
               var1.drawImage(com.xy.w.Class15.s, var5 % this.ae * this.z + 36, var5 / this.ae * this.cb, 10, 12, null);
            }

            if (this.bi && var4 == this.gw) {
               var1.setColor(Color.red);
               var1.drawRect(var5 % this.ae * this.z + 1, var5 / this.ae * this.cb + 1, this.gz, this.ah);
               var1.drawRect(var5 % this.ae * this.z + 2, var5 / this.ae * this.cb + 2, this.gz - 2, this.ah - 2);
               var1.setColor(Color.white);
            }
         }
      }
   }

   @Override
   protected void am(RoleData var1) {
      Goodstable var2;
      if ((var2 = var1.getGood(this.aaf(this.ia + this.dx()))) != null) {
         ((com.xy.a.Class48)this.wd.zc().j(46)).hr(var2, false);
      }
   }

   public List<BigDecimal> rs() {
      return this.jr;
   }

   public Class43(Class30 var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      super(var1, var2, var3, var4, var5, var6, var7, var8, var9);
   }

   public boolean afn(StallBuyData var1) {
      if (var1 == null) {
         return false;
      } else {
         RoleData var2 = this.wd.yx();

         int var3;
         for (int var10000 = var3 = 0; var10000 < var2.goodPacks.length; var10000 = ++var3) {
            Goodstable var4;
            if ((var4 = var2.getGood(var2.goodPacks[var3])) != null && !GoodType.aw(var4) && var1.a(var4)) {
               return true;
            }
         }

         return false;
      }
   }

   @Override
   protected void l() {
      this.wd.zc().f(46);
   }

   public void po(StallBuyData var1) {
      if (var1 == null) {
         this.fm(null);
      } else {
         List<BigDecimal> var2;
         if ((var2 = this.rs()) != null) {
            var2.clear();
         }

         RoleData var3 = this.wd.yx();

         int var4;
         for (int var10000 = var4 = 0; var10000 < var3.goodPacks.length; var10000 = ++var4) {
            Goodstable var5;
            if ((var5 = var3.getGood(var3.goodPacks[var4])) != null && !GoodType.aw(var5) && var1.a(var5)) {
               if (var2 == null) {
                  var2 = new ArrayList();
               }

               var2.add(var5.getRgid());
            }
         }

         this.fm((List<BigDecimal>)var2);
      }
   }

   @Override
   public boolean at(int var1) {
      int var2;
      if ((var2 = var1 * this.ae * this.ha) == 0) {
         return true;
      } else {
         return this.wd.yx() == null ? false : this.aaf(var2) != null;
      }
   }
}
