package com.xy.a.w;

import com.xy.i.Class18;
import com.xy.q.Class49;
import com.xy.text.GameView;

public class Class4 extends com.xy.q.Class30 {
   private com.xy.q.Class30[] fj;
   private com.xy.w.Class18 af;
   private int eg;
   private com.xy.i.Class20[] fk;

   public Class4(GameView var1) {
      super(82, 2, com.xy.q.Class30.afz, var1);
      String var10003 = "\\I\u0000N\u0000\u001b\u0001ZAM";
      this.yy(-1, 0, 602, 425, com.xy.q.Class30.agh);
      com.xy.w.Class9 var5 = com.xy.w.Class16.m("sc/d/1.png", 68, 68, 68, 68, false);
      String var10004 = "拤肭";
      this.yu(var5, "技能");
      this.fk = new com.xy.i.Class20[3];

      int var2;
      for (int var10000 = var2 = 0; var10000 < this.fk.length; var10000 = var2) {
         com.xy.i.Class20[] var3 = this.fk;
         var10004 = "YL\u0005J\u0005\u001c\u0012\u0001ZAM";
         int var10006 = 81 + var2;
         String var8;
         Class4 var10010;
         if (var2 == 0) {
            var8 = "幘D閸";
            var8 = "师 门";
            var10010 = this;
         } else if (var2 == 1) {
            var8 = "泿\u000f闂";
            var8 = "法 门";
            var10010 = this;
         } else if (var2 == 2) {
            var8 = "她潰凜";
            var8 = "天演册";
            var10010 = this;
         } else {
            var8 = "";
            var10010 = this;
         }

         com.xy.i.Class20 var10002 = new  com.xy.i.Class20("sc/e/38.png", 2, var10006, Class49.bx, Class49.bv, var8, var10010);
         var3[var2] = var10002;
         this.fk[var2].setOffsetTexts(Class49.d);
         this.fk[var2].setBounds(60 + 102 * var2, 26, 95, 33);
         this.add(this.fk[var2++]);
      }

      this.af = new com.xy.w.Class18();
      String var7 = "YL\u0005K\u0005\u001c\u001f\u0001ZAM";
      this.af.mt(com.xy.w.Class16.m("sc/d/35.png", 80, 10, 80, 10, false));
      this.af.setBounds(38, 40, this.getWidth() - 62, 20);
      this.add(this.af);
      this.fj = new com.xy.q.Class30[3];
   }

   @Override
   public void l() {
      this.g(0);
      super.l();
   }

   public void y(int var1) {
      if (this.eg == var1) {
         if (this.eg == 0) {
            ((Class21)this.fj[0]).h();
         } else if (this.eg == 1) {
            ((Class12)this.fj[1]).h();
         } else {
            if (this.eg == 2) {
               ((Class20)this.fj[2]).h();
            }
         }
      }
   }

   public void cc(int var1, int var2) {
      if (var1 != this.getWidth() || var2 != this.getHeight()) {
         int var3;
         if ((var3 = var1 - this.getWidth()) != 0) {
            this.agi.setBounds(this.agi.getX() + var3, this.agi.getY(), this.agi.getWidth(), this.agi.getHeight());
         }

         this.af.setBounds(38, 40, var1 - 62, 20);
         this.setBounds(this.getX(), this.getY(), var1, var2);
      }
   }

   public void g(int var1) {
      this.eg = var1;
      if (this.eg == 0) {
         if (this.fj[0] == null) {
            boolean var10005 = false;
            this.add(this.fj[0] = new Class21(this.afx));
         }

         ((Class21)this.fj[0]).h();
      } else if (this.eg == 1) {
         if (this.fj[1] == null) {
            this.add(this.fj[1] = new Class12(this.afx));
         }

         ((Class12)this.fj[1]).h();
      } else if (this.eg == 2) {
         if (this.fj[2] == null) {
            this.add(this.fj[2] = new Class20(this.afx));
         }

         ((Class20)this.fj[2]).h();
      }

      int var2;
      for (int var10000 = var2 = 0; var10000 < this.fj.length; var10000 = ++var2) {
         this.fk[var2].setKeep(var2 == this.eg);
         if (var2 != this.eg && this.fj[var2] != null) {
            this.fj[var2].setVisible(false);
         }
      }

      if (this.fj[this.eg] != null) {
         this.cc(this.fj[this.eg].getWidth(), this.fj[this.eg].getHeight());
         this.fj[this.eg].setVisible(true);
      }

      String var3;
      if (this.eg == 1) {
         var3 = "沱閸";
         var3 = "法门";
      } else if (this.eg == 2) {
         var3 = "夃漻筼";
         var3 = "天演策";
      } else {
         var3 = "拤肭";
         var3 = "技能";
      }

      this.dq(var3);
   }
}
