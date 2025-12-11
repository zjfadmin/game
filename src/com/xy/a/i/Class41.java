package com.xy.a.i;

import com.xy.readbean.LaborShop;
import java.awt.Dimension;
import java.util.List;
import javax.swing.JComponent;

class Class41 extends JComponent {
   // $VF: synthetic field
   final Class28 asx;
   private Class32[] asy;
   private int ah;

   public Class41(Class28 var1, int var2) {
      this.asx = var1;
      this.ah = var2;
      this.setOpaque(false);
      this.setLayout(null);
      this.setPreferredSize(new Dimension(802, 538));
      this.setBounds(0, 0, 802, 538);
      this.asy = new Class32[var2 == 1 ? 9 : (var2 == 2 ? 15 : 8)];
   }

   public void l() {
   }

   public void t() {
      List var1 = this.asx.yt().am().getShopList(this.ah);
      int var2 = 0;
      int var3 = (Class28.aar(this.asx) - 1) * this.asy.length;

      for (int var10000 = var2; var10000 < this.asy.length; var3++) {
         LaborShop var4 = var3 < var1.size() ? (LaborShop)var1.get(var3) : null;
         if (var4 != null || this.asy[var2] != null) {
            if (this.asy[var2] == null) {
               this.asy[var2] = new Class32(this.asx);
               Class41 var5;
               if (this.ah == 1) {
                  var5 = this;
                  this.asy[var2].setBounds(142 + var2 % 3 * 217, 65 + var2 / 3 * 149, 213, 124);
               } else if (this.ah == 2) {
                  var5 = this;
                  this.asy[var2].setBounds(144 + var2 % 3 * 217, 49 + var2 / 3 * 93, 208, 86);
               } else {
                  if (this.ah == 3) {
                     this.asy[var2].setBounds(143 + var2 % 4 * 163, 52 + var2 / 4 * 229, 155, 220);
                  }

                  var5 = this;
               }

               var5.add(this.asy[var2]);
            }

            this.asy[var2].adh(this.ah, var4);
            this.asy[var2].setVisible(var4 != null);
         }

         var10000 = ++var2;
      }
   }

   // $VF: synthetic method
   static Class32[] aky(Class41 var0) {
      return var0.asy;
   }
}
