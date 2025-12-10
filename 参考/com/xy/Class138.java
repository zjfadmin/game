package com.xy;

import com.xy.text.GameView;
import java.awt.Color;

public class Class138 extends Class345 {
   private Class162 wo;
   private Class623 wp;
   private Class322[] kn;
   private Class322 wq;
   private Class436 bl;
   private int m;

   public void dp(int var1) {
      if (var1 == -4 >> 2) {
         var1 = this.m;
      }

      if (var1 == this.m) {
         if (this.m == 0) {
            this.wp.as(5 >> 3);
         } else {
            if (this.m == 5 >> 2 || this.m == 5 >> 1) {
               this.wo.y(this.m);
            }

         }
      }
   }

   public void oa(Class623 var1) {
      this.wp = var1;
   }

   public int e() {
      return this.m;
   }

   public void as(int var1) {
      this.m = var1;
   }

   public void ob(Class162 var1) {
      this.wo = var1;
   }

   public void q() {
      this.y(3 ^ 3);
      super.q();
   }

   public void y(int var1) {
      int var10000 = 2 & 5;
      this.m = var1;

      for(int var2 = var10000; var10000 < this.kn.length; var10000 = var2) {
         this.kn[var2].setKeep((boolean)(var2 == this.m ? --1 : 0));
         ++var2;
      }

      this.dp(var1);
      this.wp.setVisible((boolean)(var1 == 0 ? --1 : 0));
      this.wo.setVisible((boolean)(var1 != (3 & 5) && var1 != 5 >> 1 ? 3 >> 2 : 1));
   }

   public boolean t() {
      return (boolean)(this.m == 0 && !this.wp.pd() ? 5 >> 3 : super.t());
   }

   public Class138(GameView var1) {
      int var10001 = --3;
      int var10005 = -4 >> 2;
      int var10007 = -4 >> 2;
      super(21935 & 10965, --2, Class345.aef, var1);
      this.m = var10007;
      this.va(var10005, 3 & 4, 32494 & 895, 19407 & 13822, Class345.aeo);
      this.uv(Class511.q("sc/d/1.png", 86 & 109, 86 & 109, 86 & 109, 86 & 109, (boolean)(3 & 4)), "职业");
      Class322[] var3 = new Class322[var10001];
      boolean var10003 = true;
      this.kn = var3;

      int var2;
      for(int var10000 = var2 = 3 ^ 3; var10000 < this.kn.length; var10000 = var2) {
         this.kn[var2] = new Class322("sc/e/38.png", 5 >> 1, (27501 & 5567) + var2, Class681.cf, Class681.c, "", this);
         this.kn[var2].setBounds((114 & 79) + (127 & 82) * var2, 48 & 95, 79 & 127, 117 & 43);
         this.kn[var2].setText(var2 == 0 ? "生 产" : (var2 == --1 ? "我要买" : (var2 == (1 ^ 3) ? "我要卖" : "")));
         this.kn[var2].setOffsetTexts(Class681.bv);
         this.add(this.kn[var2++]);
      }

      this.wq = new Class322("sc/e/28.png", 3 >> 1, 4081 & 28990, Class681.bm, (Color[])null, "切换副职业", this);
      this.wq.setBounds(17404 & 15871, 30 & 123, 92 & 103, 51 & 94);
      this.add(this.wq);
      this.bl = new Class436(Class511.q("sc/d/35.png", 80, 63 & 74, 80, 10, (boolean)(3 >> 2)));
      this.bl.setBounds(32, 30, 574, 20);
      this.add(this.bl);
      this.add(this.wp = new Class623(var1), 3 & 4);
      this.add(this.wo = new Class162(var1));
   }

   public Class623 oc() {
      return this.wp;
   }

   public Class162 od() {
      return this.wo;
   }
}
