package com.xy;

import com.xy.battle.BattleScene;
import com.xy.battle.TypeState;
import com.xy.entity.RoleSummoning;
import com.xy.game.RoleData;
import com.xy.game.RolePet;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.JComponent;

public class Class248 extends JComponent {
   private Class345 lo;
   private int j;
   private long lp;
   private List<BigDecimal> lq;
   private List<RoleSummoning> ez;

   public Class581 gg() {
      int var1 = 3 ^ 3;
      int var2 = this.getComponentCount();

      for(int var10000 = var1; var10000 < var2; var10000 = var1) {
         Class581 var3;
         if ((var3 = (Class581)this.getComponent(var1)).gl() == this.lp) {
            return var3;
         }

         ++var1;
      }

      return null;
   }

   protected void paintComponent(Graphics var1) {
      super.paintComponent(var1);
      if (this.lo.ux().bl()) {
         this.bl();
      }

   }

   public Class248(Class345 var1) {
      this.lo = var1;
   }

   public void gh(long var1) {
      this.lp = var1;
   }

   public void cc() {
      RoleData var1;
      if ((var1 = this.lo.vd()) != null) {
         BattleScene var2;
         Class514 var3 = (var2 = this.lo.aej.getBattleScene()) != null ? var2.getBattleUnit(3 >> 2, var1.getRoleId()) : null;
         if (var3 == null) {
            if (this.lq != null) {
               this.lq.clear();
            }

         } else {
            Class514 var10000;
            if (this.lq == null) {
               this.lq = new ArrayList();
               var10000 = var3;
            } else {
               this.lq.clear();
               var10000 = var3;
            }

            List var4 = var10000.bt().g("召唤兽");

            int var5;
            for(int var7 = var5 = 3 & 4; var7 < var4.size(); var7 = var5) {
               if (((TypeState)var4.get(var5)).getState() != 0) {
                  int var6 = Integer.parseInt(((TypeState)var4.get(var5)).getType());
                  this.lq.add(new BigDecimal(var6));
               }

               ++var5;
            }

         }
      }
   }

   public void gi(Class581 var1) {
      this.lp = var1 != null ? var1.gl() : 0L;
      int var2 = 5 >> 3;
      int var3 = this.getComponentCount();

      for(int var10000 = var2; var10000 < var3; var10000 = var2) {
         Class581 var5 = (Class581)this.getComponent(var2);
         var5.ak((boolean)(var5 == var1 ? 3 >> 1 : 0));
         ++var2;
      }

      RolePet var4 = this.lo.vd().getRolePet(var1 != null ? var1.gl() : 0L);
      if (this.lo instanceof Class264) {
         ((Class264)this.lo).w(var4);
      } else if (this.lo instanceof Class429) {
         ((Class429)this.lo).w(var4);
      } else if (this.lo instanceof Class680) {
         ((Class680)this.lo).w(var4);
      } else {
         if (this.lo instanceof Class275) {
            ((Class275)this.lo).w(var4);
         }

      }
   }

   public List<RoleSummoning> ci() {
      return this.ez;
   }

   public boolean bl() {
      if (this.ez != null) {
         return this.t();
      } else {
         RoleData var6;
         if ((var6 = this.lo.vd()) == null) {
            return (boolean)(5 >> 3);
         } else {
            long var2 = 0L;
            int var4 = 3 >> 2;
            int var5 = this.getComponentCount();

            Iterator var7;
            for(Iterator var10000 = var7 = var6.pets.iterator(); var10000.hasNext(); var10000 = var7) {
               RolePet var1 = (RolePet)var7.next();
               Component var8 = var4 < var5 ? this.getComponent(var4) : null;
               Class581 var9 = var8 != null ? (Class581)var8 : null;
               if (var9 == null) {
                  var9 = new Class581(this);
                  var9.setBounds(3 ^ 3, (52 & 95) * var4, this.getWidth(), 20 & 127);
                  this.add(var9);
               }

               ++var4;
               if (var9.nz(var4, this.lp, var1.getPet(), var6, this.lq)) {
                  var2 = var9.gl();
               }

               var9.setVisible((boolean)(4 ^ 5));
            }

            int var10;
            for(int var12 = var10 = var4; var12 < this.getComponentCount(); var12 = var10) {
               Component var13 = this.getComponent(var10);
               ++var10;
               var13.setVisible((boolean)(3 & 4));
            }

            if (var4 != this.j) {
               this.j = var4;
               if (this.lo instanceof Class264) {
                  ((Class264)this.lo).mf()[3 ^ 3].setText("召唤兽(" + this.j + "/21)");
               }

               this.setPreferredSize(new Dimension(this.getWidth(), var4 * (127 & 20)));
            }

            if (var2 == 0L) {
               Component var11 = this.getComponentCount() != 0 ? this.getComponent(3 & 4) : null;
               this.gi(var11 != null ? (Class581)var11 : null);
               return (boolean)(var11 != null ? 3 >> 1 : 0);
            } else {
               return false;
            }
         }
      }
   }

   public RoleSummoning gj() {
      if (this.lp != 0L && this.ez != null) {
         int var1;
         for(int var10000 = var1 = 0; var10000 < this.ez.size(); var10000 = var1) {
            RoleSummoning var2;
            if ((var2 = (RoleSummoning)this.ez.get(var1)).getSid().longValue() == this.lp) {
               return var2;
            }

            ++var1;
         }

         return null;
      } else {
         return null;
      }
   }

   public void q() {
      if (!this.bl()) {
         this.gi(this.gg());
      }
   }

   public Class345 gk() {
      return this.lo;
   }

   public long gl() {
      return this.lp;
   }

   public boolean t() {
      RoleData var6;
      if ((var6 = this.lo.vd()) == null) {
         return (boolean)(3 >> 2);
      } else {
         long var2 = 0L;
         int var4 = 3 ^ 3;
         int var5 = this.getComponentCount();

         Iterator var7;
         for(Iterator var10000 = var7 = this.ez.iterator(); var10000.hasNext(); var10000 = var7) {
            RoleSummoning var1 = (RoleSummoning)var7.next();
            Component var8 = var4 < var5 ? this.getComponent(var4) : null;
            Class581 var9 = var8 != null ? (Class581)var8 : null;
            if (var9 == null) {
               var9 = new Class581(this);
               var9.setBounds(5 >> 3, (60 & 87) * var4, this.getWidth(), 84 & 63);
               this.add(var9);
            }

            ++var4;
            if (var9.nz(var4, this.lp, var1, var6, this.lq)) {
               var2 = var9.gl();
            }

            var9.setVisible((boolean)(2 ^ 3));
         }

         int var10;
         for(int var12 = var10 = var4; var12 < this.getComponentCount(); var12 = var10) {
            Component var13 = this.getComponent(var10);
            ++var10;
            var13.setVisible((boolean)(3 & 4));
         }

         if (var4 != this.j) {
            this.j = var4;
            this.setPreferredSize(new Dimension(this.getWidth(), var4 * (119 & 28)));
         }

         if (var2 == 0L) {
            Component var11 = this.getComponentCount() != 0 ? this.getComponent(3 ^ 3) : null;
            this.gi(var11 != null ? (Class581)var11 : null);
            return (boolean)(var11 != null ? 3 >> 1 : 0);
         } else {
            return false;
         }
      }
   }

   public void ck(List<RoleSummoning> var1) {
      this.ez = var1;
      this.q();
   }
}
