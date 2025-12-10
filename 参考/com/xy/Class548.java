package com.xy;

import com.xy.game.RoleData;
import com.xy.readbean.Goodstable;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JComponent;

public class Class548 extends JComponent {
   private Class345 ef;
   private long om;
   private int m;

   public long gl() {
      return this.om;
   }

   public Class548(Class345 var1) {
      this.ef = var1;
   }

   public Class345 gk() {
      return this.ef;
   }

   public void q() {
      if (!this.t()) {
         this.alo(this.alp());
      }
   }

   protected void paintComponent(Graphics var1) {
      super.paintComponent(var1);
      if (this.ef.ux().bl()) {
         this.t();
      }

   }

   public void alo(Class306 var1) {
      this.om = var1 != null ? var1.gl() : 0L;
      int var2 = 2 & 5;
      int var3 = this.getComponentCount();

      for(int var10000 = var2; var10000 < var3; var10000 = var2) {
         Class306 var5 = (Class306)this.getComponent(var2);
         var5.gb((boolean)(var5 == var1 ? 2 ^ 3 : 0));
         ++var2;
      }

      Goodstable var4 = var1 != null ? this.ef.vd().getGood(var1.ez()) : null;
      if (this.ef instanceof Class680) {
         ((Class680)this.ef).ax(var4);
      }

   }

   public void gh(long var1) {
      this.om = var1;
   }

   public boolean t() {
      RoleData var6;
      if ((var6 = this.ef.vd()) == null) {
         return (boolean)(3 & 4);
      } else {
         long var2 = 0L;
         int var4 = 3 ^ 3;
         int var5 = this.getComponentCount();

         int var10000;
         int var1;
         for(var10000 = var1 = 2 & 5; var10000 < var6.goodPacks.length; var10000 = var1) {
            Goodstable var7;
            if ((var7 = var6.getGood(var6.goodPacks[var1])) != null && var7.getType() == 2326L) {
               Class306 var8;
               if ((var8 = (Class306)(var4 < var5 ? this.getComponent(var4) : null)) == null) {
                  var8 = new Class306(this);
                  var8.setBounds(3 ^ 3, (28 & 119) * var4, this.getWidth(), 85 & 62);
                  this.add(var8);
               }

               ++var4;
               if (var8.ny(var4, this.om, var7, var6)) {
                  var2 = var8.gl();
               }

               var8.setVisible((boolean)(--1));
            }

            ++var1;
         }

         for(var10000 = var1 = var4; var10000 < this.getComponentCount(); var10000 = var1) {
            Component var10 = this.getComponent(var1);
            ++var1;
            var10.setVisible((boolean)(3 ^ 3));
         }

         if (var4 != this.m) {
            this.m = var4;
            this.setPreferredSize(new Dimension(this.getWidth(), var4 * (92 & 55)));
         }

         if (var2 == 0L) {
            Component var9 = this.getComponentCount() != 0 ? this.getComponent(3 >> 2) : null;
            this.alo(var9 != null ? (Class306)var9 : null);
            return (boolean)(var9 != null ? 5 >> 2 : 0);
         } else {
            return false;
         }
      }
   }

   public Class306 alp() {
      int var1 = 5 >> 3;
      int var2 = this.getComponentCount();

      for(int var10000 = var1; var10000 < var2; var10000 = var1) {
         Class306 var3;
         if ((var3 = (Class306)this.getComponent(var1)).gl() == this.om) {
            return var3;
         }

         ++var1;
      }

      return null;
   }
}
