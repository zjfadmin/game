package com.xy.q;

import com.xy.game.RoleData;
import com.xy.readbean.Goodstable;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JComponent;

public class Class4 extends JComponent {
   private long et;
   private int eg;
   private Class30 eu;

   public Class17 ec() {
      int var1 = 0;
      int var2 = this.getComponentCount();

      for (int var10000 = var1; var10000 < var2; var10000 = ++var1) {
         Class17 var3;
         if ((var3 = (Class17)this.getComponent(var1)).ee() == this.et) {
            return var3;
         }
      }

      return null;
   }

   public void ed(Class17 var1) {
      this.et = var1 != null ? var1.ee() : 0L;
      int var2 = 0;
      int var3 = this.getComponentCount();

      for (int var10000 = var2; var10000 < var3; var10000 = ++var2) {
         Class17 var5 = (Class17)this.getComponent(var2);
         var5.be(var5 == var1);
      }

      Goodstable var4 = var1 != null ? this.eu.yx().getGood(var1.em()) : null;
      if (this.eu instanceof com.xy.a.a.Class50) {
         ((com.xy.a.a.Class50)this.eu).bb(var4);
      }
   }

   public long ee() {
      return this.et;
   }

   public void ef(long var1) {
      this.et = var1;
   }

   public void t() {
      if (!this.ah()) {
         this.ed(this.ec());
      }
   }

   public boolean ah() {
      RoleData var1;
      if ((var1 = this.eu.yx()) == null) {
         return false;
      } else {
         long var2 = 0L;
         int var4 = 0;
         int var5 = this.getComponentCount();

         int var6;
         for (int var10000 = var6 = 0; var10000 < var1.goodPacks.length; var10000 = ++var6) {
            Goodstable var7;
            if ((var7 = var1.getGood(var1.goodPacks[var6])) != null && var7.getType() == 2326L) {
               Class17 var8;
               if ((var8 = (Class17)(var4 < var5 ? this.getComponent(var4) : null)) == null) {
                  var8 = new Class17(this);
                  var8.setBounds(0, 20 * var4, this.getWidth(), 20);
                  this.add(var8);
               }

               if (var8.rt(++var4, this.et, var7, var1)) {
                  var2 = var8.ee();
               }

               var8.setVisible(true);
            }
         }

         for (int var11 = var6 = var4; var11 < this.getComponentCount(); var11 = var6) {
            Component var12 = this.getComponent(var6);
            var6++;
            var12.setVisible(false);
         }

         if (var4 != this.eg) {
            this.eg = var4;
            this.setPreferredSize(new Dimension(this.getWidth(), var4 * 20));
         }

         if (var2 == 0L) {
            Component var10 = this.getComponentCount() != 0 ? this.getComponent(0) : null;
            this.ed(var10 != null ? (Class17)var10 : null);
            return var10 != null;
         } else {
            return false;
         }
      }
   }

   public Class30 eg() {
      return this.eu;
   }

   @Override
   protected void paintComponent(Graphics var1) {
      super.paintComponent(var1);
      if (this.eu.ze().dh()) {
         this.ah();
      }
   }

   public Class4(Class30 var1) {
      this.eu = var1;
   }
}
