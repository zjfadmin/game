package com.xy;

import com.xy.battle.BattleScene;
import com.xy.battle.TypeState;
import com.xy.entity.Lingbao;
import com.xy.game.RoleData;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.JComponent;

public class Class612 extends JComponent {
   private List<BigDecimal> im;
   private int bn;
   private long om;
   private Class345 pr;

   public void gh(long var1) {
      this.om = var1;
   }

   public long gl() {
      return this.om;
   }

   public void cc() {
      RoleData var1;
      if ((var1 = this.pr.vd()) != null) {
         BattleScene var2;
         Class514 var3 = (var2 = this.pr.aej.getBattleScene()) != null ? var2.getBattleUnit(5 >> 3, var1.getRoleId()) : null;
         if (var3 == null) {
            if (this.im != null) {
               this.im.clear();
            }

         } else {
            Class514 var10000;
            if (this.im == null) {
               this.im = new ArrayList();
               var10000 = var3;
            } else {
               this.im.clear();
               var10000 = var3;
            }

            List var4 = var10000.bt().g("灵宝");

            int var5;
            for(int var7 = var5 = 3 & 4; var7 < var4.size(); var7 = var5) {
               if (((TypeState)var4.get(var5)).getState() != 0) {
                  int var6 = Integer.parseInt(((TypeState)var4.get(var5)).getType());
                  this.im.add(new BigDecimal(var6));
               }

               ++var5;
            }

         }
      }
   }

   public void akz(Class28 var1) {
      this.om = var1 != null ? var1.gl() : 0L;
      int var2 = 3 ^ 3;
      int var3 = this.getComponentCount();

      for(int var10000 = var2; var10000 < var3; var10000 = var2) {
         Class28 var5 = (Class28)this.getComponent(var2);
         var5.ak((boolean)(var5 == var1 ? 4 ^ 5 : 0));
         ++var2;
      }

      Lingbao var4 = this.pr.vd().getLingbao(new BigDecimal(var1 != null ? var1.gl() : 0L));
      if (this.pr instanceof Class275) {
         ((Class275)this.pr).fn(var4);
      }

   }

   public Class345 gk() {
      return this.pr;
   }

   public void q() {
      if (!this.t()) {
         this.akz(this.ala());
      }
   }

   protected void paintComponent(Graphics var1) {
      super.paintComponent(var1);
      if (this.pr.ux().bl()) {
         this.t();
      }

   }

   public Class612(Class345 var1) {
      this.pr = var1;
   }

   public Class28 ala() {
      int var1 = 3 >> 2;
      int var2 = this.getComponentCount();

      for(int var10000 = var1; var10000 < var2; var10000 = var1) {
         Class28 var3;
         if ((var3 = (Class28)this.getComponent(var1)).gl() == this.om) {
            return var3;
         }

         ++var1;
      }

      return null;
   }

   public boolean t() {
      RoleData var6;
      if ((var6 = this.pr.vd()) == null) {
         return (boolean)(3 >> 2);
      } else {
         long var2 = 0L;
         int var4 = 3 >> 2;
         int var5 = this.getComponentCount();

         Iterator var7;
         for(Iterator var10000 = var7 = var6.lingbaoList.iterator(); var10000.hasNext(); var10000 = var7) {
            BigDecimal var1 = (BigDecimal)var7.next();
            Component var8 = var4 < var5 ? this.getComponent(var4) : null;
            Class28 var9 = var8 != null ? (Class28)var8 : null;
            if (var9 == null) {
               var9 = new Class28(this);
               var9.setBounds(5 >> 3, (63 & 84) * var4, this.getWidth(), 52 & 95);
               this.add(var9);
            }

            ++var4;
            if (var9.it(var4, this.om, var6.getLingbao(var1), var6, this.im)) {
               var2 = var9.gl();
            }

            var9.setVisible((boolean)(3 >> 1));
         }

         int var10;
         for(int var12 = var10 = var4; var12 < this.getComponentCount(); var12 = var10) {
            Component var13 = this.getComponent(var10);
            ++var10;
            var13.setVisible((boolean)(3 & 4));
         }

         if (var4 != this.bn) {
            this.bn = var4;
            this.setPreferredSize(new Dimension(this.getWidth(), var4 * (126 & 21)));
         }

         if (var2 == 0L) {
            Component var11 = this.getComponentCount() != 0 ? this.getComponent(3 >> 2) : null;
            this.akz(var11 != null ? (Class28)var11 : null);
            return (boolean)(var11 != null ? 4 ^ 5 : 0);
         } else {
            return false;
         }
      }
   }
}
