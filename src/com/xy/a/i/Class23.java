package com.xy.a.i;

import com.xy.entity.PartJade;
import com.xy.i.Class18;
import com.xy.i.Class19;
import com.xy.q.Class49;
import com.xy.text.GameView;

public class Class23 extends com.xy.q.Class30 {
   private com.xy.i.Class19[] pa;
   private int eg;
   private com.xy.q.Class30[] acf;

   public Class23(GameView var1) {
      super(-1, -1, com.xy.q.Class30.agf, var1);
      String var10004 = "Td\bc\b4\u0011)Wi@";
      this.yy(0, 0, 562, 520, com.xy.q.Class30.agf);
      this.yu(com.xy.w.Class16.m("sc/d/36.png", 2, 2, 2, 2, false), this.age);
      this.wp(new com.xy.v.Class32(46, 74, 26, 18));
      this.pa = new com.xy.i.Class19[5];

      int var2;
      for (int var10000 = var2 = 0; var10000 < this.pa.length; var10000 = var2) {
         com.xy.i.Class19[] var3 = this.pa;
         var10004 = "U\u001f\t\u0019\tJ\u0017RV\u0012A";
         int var10006 = 116 + var2;
         String var6;
         Class23 var10010;
         if (var2 == 0) {
            var6 = "启'户";
            var6 = "合 成";
            var10010 = this;
         } else if (var2 == 1) {
            var6 = "洱\\绥";
            var6 = "洗 练";
            var10010 = this;
         } else if (var2 == 2) {
            var6 = "奐裢區纀";
            var6 = "套装升级";
            var10010 = this;
         } else if (var2 == 3) {
            var6 = "珵笀医纁";
            var6 = "玉符升级";
            var10010 = this;
         } else if (var2 == 4) {
            var6 = "拁规轫秜";
            var6 = "拆解转移";
            var10010 = this;
         } else {
            var6 = "";
            var10010 = this;
         }

         Class19 var10002 = new Class19("sc/e/61.png", 2, var10006, Class49.ck, null, var6, var10010);
         var3[var2] = var10002;
         this.pa[var2].setOffsetTexts(Class49.bo);
         this.pa[var2].setBounds(55 + 92 * var2, 50, 90, 24);
         this.add(this.pa[var2++]);
      }

      this.acf = new com.xy.q.Class30[5];
   }

   public int dx() {
      return this.eg;
   }

   public Class45 wn() {
      return (Class45)this.acf[1];
   }

   public void ck(PartJade var1) {
      if (this.eg == 0 && this.acf[0] != null) {
         Class13 var3;
         (var3 = (Class13)this.acf[0]).eq().ck(var1);
      } else {
         if (this.eg == 3 && this.acf[3] != null) {
            Class34 var2;
            (var2 = (Class34)this.acf[3]).eq().ck(var1);
         }
      }
   }

   public void g(int var1) {
      int var10000 = 0;
      this.eg = var1;

      for (int var2 = 0; var10000 < this.pa.length; var10000 = ++var2) {
         this.pa[var2].setKeep(var2 == this.eg);
      }

      Class23 var4;
      if (var1 == 0) {
         if (this.acf[var1] == null) {
            this.add(this.acf[var1] = new Class13(this.afx));
         }

         ((Class13)this.acf[var1]).h();
         var4 = this;
      } else if (var1 == 1) {
         if (this.acf[var1] == null) {
            this.add(this.acf[var1] = new Class45(this.afx));
         }

         ((Class45)this.acf[var1]).h();
         var4 = this;
      } else if (var1 == 2) {
         if (this.acf[var1] == null) {
            this.add(this.acf[var1] = new Class20(this.afx));
         }

         ((Class20)this.acf[var1]).h();
         var4 = this;
      } else if (var1 == 3) {
         if (this.acf[var1] == null) {
            this.add(this.acf[var1] = new Class34(this.afx));
         }

         ((Class34)this.acf[var1]).e();
         var4 = this;
      } else {
         if (var1 == 4) {
            if (this.acf[var1] == null) {
               this.add(this.acf[var1] = new Class37(this.afx));
            }

            ((Class37)this.acf[var1]).f();
         }

         var4 = this;
      }

      if (var4.acf[var1] != null) {
         this.acf[var1].setVisible(true);
      }

      int var3;
      for (int var5 = var3 = 0; var5 < this.acf.length; var5 = ++var3) {
         if (this.acf[var3] != null && var1 != var3) {
            this.acf[var3].setVisible(false);
         }
      }
   }
}
