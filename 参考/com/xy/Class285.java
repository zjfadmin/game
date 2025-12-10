package com.xy;

import com.xy.game.RoleData;
import com.xy.game.RolePet;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.Iterator;
import javax.swing.JComponent;

public class Class285 extends JComponent {
   private long lp;
   private Class345 is;
   private int m;

   public Class285(Class345 var1) {
      this.is = var1;
   }

   public long gl() {
      return this.lp;
   }

   protected void paintComponent(Graphics var1) {
      super.paintComponent(var1);
      if (this.is.ux().bl()) {
         this.t();
      }

   }

   public void gh(long var1) {
      this.lp = var1;
   }

   public boolean t() {
      RoleData var6;
      if ((var6 = this.is.vd()) == null) {
         return (boolean)(3 & 4);
      } else {
         long var2 = 0L;
         int var4 = 2 & 5;
         int var5 = this.getComponentCount();

         Iterator var7;
         for(Iterator var10000 = var7 = var6.pets.iterator(); var10000.hasNext(); var10000 = var7) {
            RolePet var1 = (RolePet)var7.next();
            Component var8 = var4 < var5 ? this.getComponent(var4) : null;
            Class443 var9 = var8 != null ? (Class443)var8 : null;
            if (var9 == null) {
               var9 = new Class443(this);
               var9.setBounds(5 >> 3, (54 & 93) * var4, this.getWidth(), 84 & 63);
               this.add(var9);
            }

            ++var4;
            if (var9.aji(var4, this.lp, var1.getPet(), var6)) {
               var2 = var9.gl();
            }

            var9.setVisible((boolean)(4 ^ 5));
         }

         int var10;
         for(int var12 = var10 = var4; var12 < this.getComponentCount(); var12 = var10) {
            Component var13 = this.getComponent(var10);
            ++var10;
            var13.setVisible((boolean)(2 & 5));
         }

         if (var4 != this.m) {
            this.m = var4;
            if (this.is instanceof Class264) {
               ((Class264)this.is).mf()[5 >> 3].setText("召唤兽(" + this.m + "/21)");
            }

            this.setPreferredSize(new Dimension(this.getWidth(), var4 * (86 & 61)));
         }

         if (var2 == 0L) {
            Component var11 = this.getComponentCount() != 0 ? this.getComponent(3 >> 2) : null;
            this.apa(var11 != null ? (Class443)var11 : null);
            return (boolean)(var11 != null ? 3 & 5 : 0);
         } else {
            return false;
         }
      }
   }

   public void q() {
      if (!this.t()) {
         this.apa(this.aoz());
      }
   }

   public Class443 aoz() {
      int var1 = 3 & 4;
      int var2 = this.getComponentCount();

      for(int var10000 = var1; var10000 < var2; var10000 = var1) {
         Class443 var3;
         if ((var3 = (Class443)this.getComponent(var1)).gl() == this.lp) {
            return var3;
         }

         ++var1;
      }

      return null;
   }

   public void apa(Class443 var1) {
      this.lp = var1 != null ? var1.gl() : 0L;
      int var2 = 3 & 4;
      int var3 = this.getComponentCount();

      for(int var10000 = var2; var10000 < var3; var10000 = var2) {
         Class443 var4 = (Class443)this.getComponent(var2);
         var4.gb((boolean)(var4 == var1 ? 3 & 5 : 0));
         ++var2;
      }

   }

   public Class345 gk() {
      return this.is;
   }
}
