package com.xy.a.a;

import com.xy.game.RoleData;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComponent;

class Class14 extends JComponent {
   List<com.xy.i.Class4> eq;
   private BigDecimal mz;
   // $VF: synthetic field
   final Class16 na;

   // $VF: synthetic method
   static BigDecimal jw(Class14 var0) {
      return var0.mz;
   }

   public void cc(int var1, int var2) {
      RoleData var3 = this.na.yx();
      int var4 = 0;
      int var5 = Class16.la(this.na).getComponentCount();

      int var6;
      for (int var10000 = var6 = 0; var10000 < var3.pets.size(); var10000 = ++var6) {
         if (var3.pets.get(var6).getId().compareTo(this.mz) != 0) {
            com.xy.i.Class4 var8 = var4 < this.eq.size() ? this.eq.get(var4) : null;
            if (var8 == null) {
               String var10002 = "id5d5?+";
               var8 = new com.xy.i.Class4("sc/c/81", 1, 7, com.xy.q.Class49.bz, null, null, this.na.eg());
               this.eq.add(var8);
               this.add(var8);
            }

            var8.setText(String.valueOf(var6 + 1));
            int var10003 = 3 + var4 % 6 * 18;
            int var10004 = 1 + var4 / 6 * 18;
            var4++;
            var8.setBounds(var10003, var10004, 18, 18);
            var8.setVisible(true);
         }
      }

      com.xy.i.Class4 var10 = var4 < this.eq.size() ? this.eq.get(var4) : null;
      if (var10 == null) {
         String var13 = ")>u>uek";
         var10 = new com.xy.i.Class4("sc/c/81", 1, 7, com.xy.q.Class49.bz, null, null, this.na.eg());
         this.eq.add(var10);
         this.add(var10);
      }

      String var10005 = "B";
      var10.setText("X");
      int var14 = 3 + var4 % 6 * 18;
      int var15 = 1 + var4 / 6 * 18;
      var4++;
      var10.setBounds(var14, var15, 18, 18);
      var10.setVisible(true);

      int var7;
      for (int var11 = var7 = var4; var11 < this.eq.size(); var11 = var7) {
         Object var12 = this.eq.get(var7);
         var7++;
         ((com.xy.i.Class4)var12).setVisible(false);
      }

      Class16.kx(this.na).setBounds(var1, var2, 114, 20 + (var4 - 1) / 6 * 18);
   }

   public void i(BigDecimal var1) {
      this.mz = var1;
   }

   public Class14(Class16 var1) {
      this.na = var1;
      this.setLayout(null);
      this.setBackground(com.xy.q.Class49.bk);
      this.setVisible(false);
      this.eq = new ArrayList<>();
   }
}
