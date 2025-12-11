package com.xy.q;

import com.xy.entity.Mount;
import com.xy.game.RoleData;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.math.BigDecimal;
import java.util.Iterator;
import javax.swing.JComponent;

public class Class45 extends JComponent {
   private Class30 wd;
   private long fh;
   private int ah;

   public void aht(Class33 var1) {
      this.fh = var1 != null ? var1.ee() : 0L;
      int var2 = 0;
      int var3 = this.getComponentCount();

      for (int var10000 = var2; var10000 < var3; var10000 = ++var2) {
         Class33 var5 = (Class33)this.getComponent(var2);
         var5.be(var5 == var1);
      }

      Mount var4 = this.wd.yx().getMount(new BigDecimal(this.fh));
      if (this.wd instanceof com.xy.a.a.Class0) {
         ((com.xy.a.a.Class0)this.wd).b(var4);
      }
   }

   public long ee() {
      return this.fh;
   }

   public Class45(Class30 var1) {
      this.wd = var1;
   }

   @Override
   protected void paintComponent(Graphics var1) {
      super.paintComponent(var1);
      if (this.wd.ze().dh()) {
         this.ah();
      }
   }

   public boolean ah() {
      RoleData var1;
      if ((var1 = this.wd.yx()) == null) {
         return false;
      } else {
         long var2 = 0L;
         int var4 = 0;
         int var5 = this.getComponentCount();

         Iterator var7;
         for (Iterator var10000 = var7 = var1.mounts.iterator(); var10000.hasNext(); var10000 = var7) {
            Mount var6 = (Mount)var7.next();
            Component var8 = var4 < var5 ? this.getComponent(var4) : null;
            Class33 var9 = var8 != null ? (Class33)var8 : null;
            if (var9 == null) {
               var9 = new Class33(this);
               var9.setBounds(0, 20 * var4, this.getWidth(), 20);
               this.add(var9);
            }

            if (var9.abc(++var4, this.fh, var6, var1)) {
               var2 = var9.ee();
            }

            var9.setVisible(true);
         }

         int var10;
         for (int var12 = var10 = var4; var12 < this.getComponentCount(); var12 = var10) {
            Component var13 = this.getComponent(var10);
            var10++;
            var13.setVisible(false);
         }

         if (var4 != this.ah) {
            this.ah = var4;
            this.setPreferredSize(new Dimension(this.getWidth(), var4 * 20));
         }

         if (var2 == 0L) {
            Component var11 = this.getComponentCount() != 0 ? this.getComponent(0) : null;
            this.aht(var11 != null ? (Class33)var11 : null);
            return var11 != null;
         } else {
            return false;
         }
      }
   }

   public void t() {
      if (!this.ah()) {
         this.aht(this.ahu());
      }
   }

   public void ef(long var1) {
      this.fh = var1;
   }

   public Class33 ahu() {
      int var1 = 0;
      int var2 = this.getComponentCount();

      for (int var10000 = var1; var10000 < var2; var10000 = ++var1) {
         Class33 var3;
         if ((var3 = (Class33)this.getComponent(var1)).ee() == this.fh) {
            return var3;
         }
      }

      return null;
   }

   public Class30 eg() {
      return this.wd;
   }
}
