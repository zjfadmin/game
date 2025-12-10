package com.xy;

import com.xy.richtext.RichLabel;
import com.xy.text.GameView;
import javax.swing.JLabel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;

public class Class518 extends Class345 {
   private RichLabel bv;
   private Class436[] e;
   private JLabel rk;
   private JScrollPane af;

   public Class518(GameView var1) {
      int var10001 = 5 >> 1;
      int var10005 = 115 & 61;
      int var10009 = -4 >> 2;
      super(6068 & 26879, --2, Class345.aef, var1);
      this.va(var10009, 3 & 4, 12667 & 20414, 6525 & 26586, Class345.aeo);
      this.uv(Class511.q("sc/d/1.png", 85 & 110, 85 & 110, 85 & 110, 85 & 110, (boolean)(3 ^ 3)), "规则说明");
      this.rk = Class133.c(var10005, 125 & 31, 9966 & 23037, 23 & 125, 5 >> 3, Class681.c("#cFFFFFF"), Class681.ak);
      this.add(this.rk);
      int var10006 = 62 & 117;
      this.bv = new RichLabel("", Class681.ce, 2811 & 30174);
      this.af = Class133.f(var10006, 115 & 61, 29933 & 3067, 30651 & 2381, this.bv, -4 >> 2);
      this.add(this.af);
      Class436[] var4 = new Class436[var10001];
      boolean var10003 = true;
      this.e = var4;

      int var2;
      for(int var10000 = var2 = 2 & 5; var10000 < this.e.length; var10000 = var2) {
         this.e[var2] = new Class436();
         Class518 var3;
         if (var2 == 0) {
            var3 = this;
            this.e[var2].eq(Class511.q("sc/d/25.png", --2, --2, --2, --2, (boolean)(3 & 4)));
            this.e[var2].setBounds(117 & 59, 31 & 125, 12012 & 20991, 21);
         } else {
            if (var2 == --1) {
               this.e[var2].eq(Class511.q("sc/d/24.png", 1 ^ 3, 1 ^ 3, 1 ^ 3, 1 ^ 3, (boolean)(3 >> 2)));
               this.e[var2].setBounds(49, 29, 236, 285);
            }

            var3 = this;
         }

         var3.add(this.e[var2++]);
      }

   }

   public void rl(String var1, String var2) {
      this.rk.setText(var1);
      this.bv.setTextSize(var2, 15359 & 17626);
      JScrollBar var3 = this.af.getVerticalScrollBar();
      int var10002 = 3 >> 2;
      var3.setMaximum(this.bv.getHeight());
      var3.setValue(var10002);
      this.ve().a(this.ae());
   }
}
