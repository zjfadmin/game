package com.xy.i;

import com.xy.a.Class52;
import com.xy.a.Class65;
import com.xy.a.Class78;
import com.xy.bean.Role_bean;
import com.xy.q.Class30;
import com.xy.q.Class49;
import com.xy.text.GameView;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;

public class Class12 extends Class1 {
   private int ah;

   public static void ff(int var0, GameView var1) {
   }

   public int il() {
      return this.ah;
   }

   public Class12(String var1, int var2, int var3, String var4, Class30 var5) {
      this(var1, var2, var3, null, null, var4, var5);
   }

   public Class12(String var1, int var2, int var3, Class30 var4) {
      super(var1, var2, var4);
      this.ah = var3;
   }

   @Override
   public void fe(MouseEvent var1, boolean var2) {
   }

   @Override
   public void cw(MouseEvent var1) {
      if (this.ah == 1) {
         if (this.form.ze().getBattleScene() == null) {
            this.form.ze().setMouseIndex(com.xy.v.Class3.f);
         }
      } else if (this.ah == 2) {
         this.form.zc().b(75);
      } else if (this.ah == 101) {
         ((Class78)this.form).h();
      } else if (this.ah == 102) {
         Role_bean var3;
         if ((var3 = ((Class78)this.form).zg()) != null) {
            com.xy.d.Class8.bq(var3.getRole_id(), var3.getRolename(), this.form.afx);
         }
      } else if (this.ah == 103) {
         Role_bean var2;
         if ((var2 = ((Class78)this.form).zg()) != null) {
            com.xy.d.Class8.az(var2.getRole_id(), this.form.afx);
         }
      } else if (this.ah == 201) {
         ((Class52)this.form).h();
      } else {
         if (this.ah >= 301 && this.ah <= 309) {
            ((Class65)this.form).g(this.ah);
         }
      }
   }

   public Class12(String var1, int var2, int var3, Font var4, Color[] var5, String var6, Class30 var7) {
      super(var1, var2, var5, var7);
      this.ah = var3;
      Class12 var10000;
      if (var4 != null) {
         var10000 = this;
         this.setFont(var4);
      } else {
         var10000 = this;
         this.setFont(Class49.bz);
      }

      var10000.setHorizontalAlignment(0);
      this.setText(var6);
   }

   public void n(int var1) {
      this.ah = var1;
   }
}
