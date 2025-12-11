package com.xy.q;

import com.xy.game.RoleData;
import com.xy.readbean.Shop;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.util.List;

public class Class29 extends Class25 {
   private List<Shop> jr;

   @Override
   public int il() {
      int var1;
      return (var1 = this.hx()) == 0 ? 0 : (var1 - 1) / this.abe.length;
   }

   @Override
   protected void am(RoleData var1) {
      Shop var2;
      if ((var2 = this.ym(this.ia + this.dx())) != null) {
         ((com.xy.a.Class48)this.wd.zc().j(46)).ov(var2);
      }
   }

   @Override
   protected void ap(int var1, MouseEvent var2, RoleData var3) {
      Shop var4;
      if ((var4 = this.ym(var1)) != null) {
         if (this.wd instanceof com.xy.a.q.Class18) {
            this.n(var1);
            com.xy.a.q.Class18 var7;
            (var7 = (com.xy.a.q.Class18)this.wd).ei(var4, true);
         } else if (this.wd instanceof com.xy.a.q.Class45) {
            this.n(var1);
            com.xy.a.q.Class45 var6;
            (var6 = (com.xy.a.q.Class45)this.wd).ei(var4, true);
         } else {
            if (this.wd instanceof com.xy.a.q.Class3) {
               this.n(var1);
               com.xy.a.q.Class3 var5;
               (var5 = (com.xy.a.q.Class3)this.wd).ei(var4, true);
            }
         }
      }
   }

   @Override
   public boolean at(int var1) {
      return var1 <= this.il();
   }

   public Class29(Class30 var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      super(var1, var2, var3, var4, var5, var6, var7, var8, var9);
      this.be(true);
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

         Shop var6;
         if ((var6 = this.ym(var4)) != null) {
            if (this.abe[var5] == null || var6 != this.abe[var5].b) {
               if (this.abe[var5] == null) {
                  this.abe[var5] = new com.xy.w.Class14();
               }

               this.abe[var5].b(var6);
            }

            Class29 var8;
            if (var4 != this.gv) {
               var8 = this;
               com.xy.w.Class16.j(var1, this.abe[var5].p, var5 % this.ae * this.z + 1, var5 / this.ae * this.cb + 1, this.gz, this.ah);
            } else {
               com.xy.w.Class16.j(var1, this.abe[var5].p, var5 % this.ae * this.z + 2, var5 / this.ae * this.cb + 2, this.gz, this.ah);
               var8 = this;
            }

            if (var8.abe[var5].c != null) {
               var1.drawString(this.abe[var5].c, var5 % this.ae * this.z + 2, var5 / this.ae * this.cb + 10);
            }

            if (this.bi && var4 == this.gw) {
               var1.setColor(Color.red);
               var1.drawRect(var5 % this.ae * this.z + 1, var5 / this.ae * this.cb + 1, this.gz, this.ah);
               var1.drawRect(var5 % this.ae * this.z + 2, var5 / this.ae * this.cb + 2, this.gz - 2, this.ah - 2);
               var1.setColor(Color.white);
            } else if (this.ia == var5) {
               var1.setColor(Color.white);
               var1.drawRect(var5 % this.ae * this.z + 1, var5 / this.ae * this.cb + 1, this.gz, this.ah);
               var1.drawRect(var5 % this.ae * this.z + 2, var5 / this.ae * this.cb + 2, this.gz - 2, this.ah - 2);
               var1.setColor(Color.white);
            }
         }
      }
   }

   public Shop ym(int var1) {
      if (this.jr == null) {
         return null;
      } else {
         return var1 < this.jr.size() ? this.jr.get(var1) : null;
      }
   }

   public List<Shop> rs() {
      return this.jr;
   }

   public int hx() {
      return this.jr == null ? 0 : this.jr.size();
   }

   @Override
   protected void l() {
      this.wd.zc().f(46);
   }

   @Override
   protected void ao(int var1, MouseEvent var2, RoleData var3) {
      Shop var4;
      if ((var4 = this.ym(var1)) != null) {
         if (this.wd instanceof com.xy.a.q.Class18) {
            this.n(var1);
            com.xy.a.q.Class18 var7;
            (var7 = (com.xy.a.q.Class18)this.wd).ei(var4, false);
         } else if (this.wd instanceof com.xy.a.q.Class45) {
            this.n(var1);
            com.xy.a.q.Class45 var6;
            (var6 = (com.xy.a.q.Class45)this.wd).ei(var4, false);
         } else {
            if (this.wd instanceof com.xy.a.q.Class3) {
               this.n(var1);
               com.xy.a.q.Class3 var5;
               (var5 = (com.xy.a.q.Class3)this.wd).ei(var4, false);
            }
         }
      }
   }

   public void fm(List<Shop> var1) {
      this.jr = var1;
      if (this.abd != null) {
         this.abd.a(0);
         this.abd.b(this.il() > 0);
      }

      this.t();
   }
}
