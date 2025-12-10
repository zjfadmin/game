package com.xy;

import com.xy.bean.Role_bean;
import com.xy.text.GameView;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;

public class Class464 extends Class93 {
   private int m;

   public Class464(String var1, int var2, int var3, Class345 var4) {
      super(var1, var2, var4);
      this.m = var3;
   }

   public void af(MouseEvent var1) {
      if (this.m == 3 >> 1) {
         if (this.form.ux().getBattleScene() == null) {
            this.form.ux().setMouseIndex(Class320.k);
         }
      } else if (this.m == (1 ^ 3)) {
         this.form.ve().a(127 & 75);
      } else if (this.m == (103 & 125)) {
         ((Class83)this.form).d();
      } else {
         Role_bean var2;
         if (this.m == (118 & 111)) {
            if ((var2 = ((Class83)this.form).n()) != null) {
               Class183.ao(var2.getRole_id(), var2.getRolename(), this.form.aej);
            }
         } else if (this.m == (119 & 111)) {
            if ((var2 = ((Class83)this.form).n()) != null) {
               Class183.y(var2.getRole_id(), this.form.aej);
            }
         } else if (this.m == (4095 & 28873)) {
            ((Class494)this.form).d();
         } else {
            if (this.m >= (32189 & 879) && this.m <= (28661 & 4415)) {
               ((Class304)this.form).y(this.m);
            }

         }
      }
   }

   public Class464(String var1, int var2, int var3, Font var4, Color[] var5, String var6, Class345 var7) {
      super(var1, var2, var5, var7);
      this.m = var3;
      Class464 var10000;
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

   public void ab(int var1) {
      this.m = var1;
   }

   public Class464(String var1, int var2, int var3, String var4, Class345 var5) {
      this(var1, var2, var3, (Font)null, (Color[])null, var4, var5);
   }

   public void ac(MouseEvent var1, boolean var2) {
   }

   public static void cy(int var0, GameView var1) {
   }

   public int ae() {
      return this.m;
   }
}
