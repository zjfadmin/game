package com.xy.a.v;

import com.xy.formula.ActivityMenuSet2;
import com.xy.q.Class54;
import com.xy.readbean.Activity;
import com.xy.text.GameView;
import java.awt.Graphics;

public class Class30 extends com.xy.q.Class30 {
   private Class15 add;
   private com.xy.i.Class22[] ade;
   private Activity adf;
   private com.xy.w.Class18 af;
   private int eg;
   private Class37 adg;

   // $VF: synthetic method
   private void e() {
      int var1 = 0;
      int var2 = this.ade != null ? this.ade.length : 0;

      for (int var10000 = var1; var10000 < var2; var10000 = var1) {
         this.remove(this.ade[var1++]);
      }

      ActivityMenuSet2[] var4;
      this.ade = new com.xy.i.Class22[(var4 = this.adf.getMenuSet2s()).length];

      for (int var6 = var2 = 0; var6 < this.ade.length; var6 = var2) {
         ActivityMenuSet2 var3 = var4[var2];
         String var10009 = "\u001fYC_C\tT\u0014\u001cT\u000b";
         this.ade[var2] = new com.xy.i.Class22("sc/e/38.png", 2, 32, com.xy.q.Class49.bx, com.xy.q.Class49.bv, var3.getKey(), this);
         this.ade[var2].setOffsetTexts(com.xy.q.Class49.d);
         this.ade[var2].g(var2);
         this.ade[var2].setBounds(67 + 97 * var2, 31, 95, 33);
         this.add(this.ade[var2++]);
      }

      this.add(this.af);
   }

   public Class30(GameView var1) {
      super(168, 2, com.xy.q.Class30.afz, var1);
      String var10005 = "/=s:sor.29";
      this.yy(-1, 0, 483, 526, com.xy.q.Class30.agh);
      com.xy.w.Class9 var2 = com.xy.w.Class16.m("sc/d/1.png", 68, 68, 68, 68, false);
      String var10006 = "陪斚洁勄";
      this.yu(var2, "限时活动");
      this.rm(false);
      this.wp(new com.xy.v.Class32(14, 8, 0, 0));
      String var10004 = "-?q8qokr.29";
      this.af = new com.xy.w.Class18(com.xy.w.Class16.m("sc/d/35.png", 80, 10, 80, 10, false));
      this.af.setBounds(34, 46, 428, 20);
   }

   public void ws(Activity var1) {
      if (var1 != null) {
         boolean var2 = this.adf != var1;
         this.adf = var1;
         if (var2) {
            this.e();
         }

         this.h();
         this.zc().b(this.lj());
      }
   }

   public void ak(Class54 var1) {
      if (this.adg != null && this.adg.isVisible()) {
         this.adg.n((int)var1.ee());
      }
   }

   public void f() {
      this.wt = true;
   }

   public void h() {
      this.f();
   }

   public void g(int var1) {
      int var10000 = 0;
      this.eg = var1;

      for (int var2 = 0; var10000 < this.ade.length; var10000 = ++var2) {
         this.ade[var2].setKeep(var1 == var2);
      }

      ActivityMenuSet2 var3;
      if ((var3 = this.adf.getMenuSet2s()[var1]).getId() == 1) {
         if (this.add == null) {
            this.add(this.add = new Class15(this), 0);
         }

         this.add.mj(this.adf, var3);
         this.add.setVisible(true);
         if (this.adg != null) {
            this.adg.setVisible(false);
            return;
         }
      } else if (var3.getId() == 2) {
         if (this.adg == null) {
            this.add(this.adg = new Class37(this), 0);
         }

         this.adg.mj(this.adf, var3);
         this.adg.setVisible(true);
         if (this.add != null) {
            this.add.setVisible(false);
         }
      }
   }

   @Override
   public void paint(Graphics var1) {
      if (this.wt) {
         this.g(this.eg);
      }

      super.paint(var1);
   }
}
