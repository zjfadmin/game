package com.xy.q;

import com.xy.game.RoleData;
import com.xy.game.RolePet;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.Iterator;
import javax.swing.JComponent;
import javax.swing.JLabel;

public class Class6 extends JComponent {
   private int ds;
   private long fh;
   private Class30 eu;

   @Override
   protected void paintComponent(Graphics var1) {
      super.paintComponent(var1);
      if (this.eu.ze().dh()) {
         this.ah();
      }
   }

   public Class41 ej() {
      int var1 = 0;
      int var2 = this.getComponentCount();

      for (int var10000 = var1; var10000 < var2; var10000 = ++var1) {
         Class41 var3;
         if ((var3 = (Class41)this.getComponent(var1)).ee() == this.fh) {
            return var3;
         }
      }

      return null;
   }

   public boolean ah() {
      RoleData var1;
      if ((var1 = this.eu.yx()) == null) {
         return false;
      } else {
         long var2 = 0L;
         int var4 = 0;
         int var5 = this.getComponentCount();

         Iterator var7;
         for (Iterator var10000 = var7 = var1.pets.iterator(); var10000.hasNext(); var10000 = var7) {
            RolePet var6 = (RolePet)var7.next();
            Component var8 = var4 < var5 ? this.getComponent(var4) : null;
            Class41 var9 = var8 != null ? (Class41)var8 : null;
            if (var9 == null) {
               var9 = new Class41(this);
               var9.setBounds(0, 20 * var4, this.getWidth(), 20);
               this.add(var9);
            }

            if (var9.ado(++var4, this.fh, var6.getPet(), var1)) {
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

         if (var4 != this.ds) {
            this.ds = var4;
            if (this.eu instanceof com.xy.a.a.Class16) {
               JLabel var14 = ((com.xy.a.a.Class16)this.eu).lb()[0];
               String var10003 = "厇唎儖\u0002";
               StringBuilder var10001 = new StringBuilder("召唤兽(").append(this.ds);
               String var10002 = "y;g ";
               var14.setText(var10001.append("/21)").toString());
            }

            this.setPreferredSize(new Dimension(this.getWidth(), var4 * 20));
         }

         if (var2 == 0L) {
            Component var11 = this.getComponentCount() != 0 ? this.getComponent(0) : null;
            this.ek(var11 != null ? (Class41)var11 : null);
            return var11 != null;
         } else {
            return false;
         }
      }
   }

   public void ef(long var1) {
      this.fh = var1;
   }

   public void ek(Class41 var1) {
      this.fh = var1 != null ? var1.ee() : 0L;
      int var2 = 0;
      int var3 = this.getComponentCount();

      for (int var10000 = var2; var10000 < var3; var10000 = ++var2) {
         Class41 var4 = (Class41)this.getComponent(var2);
         var4.be(var4 == var1);
      }
   }

   public void t() {
      if (!this.ah()) {
         this.ek(this.ej());
      }
   }

   public Class6(Class30 var1) {
      this.eu = var1;
   }

   public Class30 eg() {
      return this.eu;
   }

   public long ee() {
      return this.fh;
   }
}
