package com.xy.i;

import com.xy.a.Class25;
import com.xy.a.Class46;
import com.xy.bean.TeamBean;
import com.xy.entity.TeamRole;
import com.xy.q.Class30;
import com.xy.q.Class49;
import com.xy.socket.Agreement;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;

public class Class10 extends Class1 {
   private int ah;

   public void n(int var1) {
      this.ah = var1;
   }

   public Class10(String var1, int var2, int var3, Font var4, Color[] var5, String var6, Class30 var7) {
      super(var1, var2, var5, var7);
      this.ah = var3;
      Class10 var10000;
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

   public Class10(String var1, int var2, int var3, Class30 var4) {
      super(var1, var2, var4);
      this.ah = var3;
   }

   @Override
   public void cw(MouseEvent var1) {
      System.out.println(this.ah);
      if (this.ah >= 1 && this.ah <= 6) {
         Class25 var9;
         (var9 = (Class25)this.form).g(this.ah);
      } else if (this.ah == 7) {
         String var10 = "K";
         String var8 = Agreement.getSendTextAES("team4", "L");
         this.form.za().k(var8);
      } else if (this.ah == 8) {
         String var10001 = "1";
         String var7 = Agreement.getSendTextAES("team4", "R");
         this.form.za().k(var7);
      } else if (this.ah >= 9 && this.ah <= 12) {
         int var6 = this.ah - 8;
         TeamBean var3;
         if ((var3 = this.form.yx().teamBean) != null && var6 < var3.getTeams().size()) {
            TeamRole var4 = var3.getTeams().get(var6);
            String var10003 = "D";
            String var5 = Agreement.getSendTextAES("team4", "C" + var4.getRoleId());
            this.form.za().k(var5);
         }
      } else {
         if (this.ah == 13 || this.ah == 14 || this.ah == 15) {
            Class46 var2;
            (var2 = (Class46)this.form).g(this.ah);
         }
      }
   }

   @Override
   public void fe(MouseEvent var1, boolean var2) {
   }

   public int il() {
      return this.ah;
   }

   public Class10(String var1, int var2, int var3, String var4, Class30 var5) {
      this(var1, var2, var3, null, null, var4, var5);
   }
}
