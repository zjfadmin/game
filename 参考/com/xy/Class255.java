package com.xy;

import com.xy.entity.Mount;
import com.xy.game.RoleData;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.math.BigDecimal;
import java.util.Iterator;
import javax.swing.JComponent;

public class Class255 extends JComponent {
   private long lp;
   private int cy;
   private Class345 pr;

   public void ym(Class400 var1) {
      this.lp = var1 != null ? var1.gl() : 0L;
      int var2 = 3 & 4;
      int var3 = this.getComponentCount();

      for(int var10000 = var2; var10000 < var3; var10000 = var2) {
         Class400 var5 = (Class400)this.getComponent(var2);
         var5.gb((boolean)(var5 == var1 ? --1 : 0));
         ++var2;
      }

      Mount var4 = this.pr.vd().getMount(new BigDecimal(this.lp));
      if (this.pr instanceof Class364) {
         ((Class364)this.pr).adi(var4);
      }

   }

   public void gh(long var1) {
      this.lp = var1;
   }

   protected void paintComponent(Graphics var1) {
      super.paintComponent(var1);
      if (this.pr.ux().bl()) {
         this.t();
      }

   }

   public Class400 yn() {
      int var1 = 3 ^ 3;
      int var2 = this.getComponentCount();

      for(int var10000 = var1; var10000 < var2; var10000 = var1) {
         Class400 var3;
         if ((var3 = (Class400)this.getComponent(var1)).gl() == this.lp) {
            return var3;
         }

         ++var1;
      }

      return null;
   }

   public Class345 gk() {
      return this.pr;
   }

   public boolean t() {
      RoleData var6;
      if ((var6 = this.pr.vd()) == null) {
         return (boolean)(3 ^ 3);
      } else {
         long var2 = 0L;
         int var4 = 2 & 5;
         int var5 = this.getComponentCount();

         Iterator var7;
         for(Iterator var10000 = var7 = var6.mounts.iterator(); var10000.hasNext(); var10000 = var7) {
            Mount var1 = (Mount)var7.next();
            Component var8 = var4 < var5 ? this.getComponent(var4) : null;
            Class400 var9 = var8 != null ? (Class400)var8 : null;
            if (var9 == null) {
               var9 = new Class400(this);
               var9.setBounds(3 ^ 3, (30 & 117) * var4, this.getWidth(), 61 & 86);
               this.add(var9);
            }

            ++var4;
            if (var9.aqu(var4, this.lp, var1, var6)) {
               var2 = var9.gl();
            }

            var9.setVisible((boolean)(2 ^ 3));
         }

         int var10;
         for(int var12 = var10 = var4; var12 < this.getComponentCount(); var12 = var10) {
            Component var13 = this.getComponent(var10);
            ++var10;
            var13.setVisible((boolean)(3 >> 2));
         }

         if (var4 != this.cy) {
            this.cy = var4;
            this.setPreferredSize(new Dimension(this.getWidth(), var4 * (85 & 62)));
         }

         if (var2 == 0L) {
            Component var11 = this.getComponentCount() != 0 ? this.getComponent(3 >> 2) : null;
            this.ym(var11 != null ? (Class400)var11 : null);
            return (boolean)(var11 != null ? --1 : 0);
         } else {
            return false;
         }
      }
   }

   public long gl() {
      return this.lp;
   }

   public Class255(Class345 var1) {
      this.pr = var1;
   }

   public void q() {
      if (!this.t()) {
         this.ym(this.yn());
      }
   }
}
