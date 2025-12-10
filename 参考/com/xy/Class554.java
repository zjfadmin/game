package com.xy;

import com.xy.bean.TeamBean;
import com.xy.entity.TeamRole;
import com.xy.socket.Agreement;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;

public class Class554 extends Class93 {
   private int m;

   public int ae() {
      return this.m;
   }

   public void ab(int var1) {
      this.m = var1;
   }

   public void ac(MouseEvent var1, boolean var2) {
   }

   public Class554(String var1, int var2, int var3, Font var4, Color[] var5, String var6, Class345 var7) {
      super(var1, var2, var5, var7);
      this.m = var3;
      Class554 var10000;
      if (var4 != null) {
         this.setFont(var4);
         var10000 = this;
      } else {
         this.setFont(Class681.bm);
         var10000 = this;
      }

      var10000.setHorizontalAlignment(0);
      this.setText(var6);
   }

   public Class554(String var1, int var2, int var3, String var4, Class345 var5) {
      this(var1, var2, var3, (Font)null, (Color[])null, var4, var5);
   }

   public void af(MouseEvent var1) {
      if (this.m >= 3 >> 1 && this.m <= (55 & 78)) {
         ((Class520)this.form).as(this.m);
      } else {
         String var4;
         if (this.m == (39 & 95)) {
            var4 = Agreement.getSendTextAES("team4", "L");
            this.form.uw().d(var4);
         } else if (this.m == (124 & 11)) {
            var4 = Agreement.getSendTextAES("team4", "R");
            this.form.uw().d(var4);
         } else if (this.m >= (57 & 79) && this.m <= (44 & 95)) {
            int var3 = this.m - (106 & 29);
            TeamBean var2;
            if ((var2 = this.form.vd().teamBean) != null && var3 < var2.getTeams().size()) {
               TeamRole var5 = (TeamRole)var2.getTeams().get(var3);
               String var6 = Agreement.getSendTextAES("team4", "C" + var5.getRoleId());
               this.form.uw().d(var6);
            }
         } else {
            if (this.m == (61 & 79) || this.m == (15 & 126) || this.m == (15 & 127)) {
               ((Class26)this.form).y(this.m);
            }

         }
      }
   }

   public Class554(String var1, int var2, int var3, Class345 var4) {
      super(var1, var2, var4);
      this.m = var3;
   }
}
