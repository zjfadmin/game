package com.xy;

import com.xy.readbean.Eshop;
import com.xy.text.GameView;
import javax.swing.JLabel;

public class Class359 extends Class345 {
   private Class254[] qt;
   private JLabel ax;

   public void ji(Eshop[] var1) {
      int var10000;
      int var2;
      for(var10000 = var2 = 3 ^ 3; var10000 < this.qt.length; var10000 = var2) {
         this.qt[var2].q();
         this.qt[var2++].setVisible((boolean)(3 >> 2));
      }

      var2 = 3 ^ 3;
      int var3;
      var10000 = var3 = 3 ^ 3;

      Class359 var6;
      while(true) {
         if (var10000 >= var1.length) {
            var6 = this;
            break;
         }

         if (var1[var3] != null) {
            Class254 var4 = this.qt[var3];
            Eshop var5 = var1[var3];
            ++var2;
            var4.xk(var5, "仙玉");
            if (var2 >= this.qt.length) {
               var6 = this;
               break;
            }
         }

         ++var3;
         var10000 = var3;
      }

      var6.ve().a(this.ae());
   }

   public Class359(GameView var1) {
      int var10001 = --3;
      int var10007 = 85 & 62;
      int var10011 = -4 >> 2;
      super(51 & 127, 5 >> 1, Class345.aef, var1);
      this.va(var10011, 3 & 4, 31623 & 1529, 12763 & 20399, Class345.aeo);
      this.uv(Class511.q("sc/d/36.png", 31 & 116, 31 & 116, 31 & 116, 31 & 116, (boolean)(2 & 5)), (String)null);
      this.ax = Class133.c(var10007, 109 & 27, 20631 & 12286, 117 & 27, 2 & 5, Class681.c("#c000000"), Class681.ak);
      this.ax.setHorizontalAlignment(74 & 63);
      this.ax.setText("当前已试穿物品");
      this.add(this.ax);
      Class254[] var3 = new Class254[var10001];
      boolean var10003 = true;
      this.qt = var3;

      int var2;
      for(int var10000 = var2 = 3 >> 2; var10000 < this.qt.length; var10000 = var2) {
         this.qt[var2] = new Class254(this);
         this.qt[var2].setBounds((121 & 14) + var2 * (125 & 127), 123 & 31, 119 & 123, 8183 & 24734);
         this.add(this.qt[var2++]);
      }

   }
}
