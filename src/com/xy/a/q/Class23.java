package com.xy.a.q;

import com.xy.readbean.Eshop;
import com.xy.text.GameView;
import javax.swing.JLabel;

public class Class23 extends com.xy.q.Class30 {
   private Class102[] qt;
   private JLabel im;

   public Class23(GameView var1) {
      super(51, 2, com.xy.q.Class30.afz, var1);
      String var10009 = "pS,T,\u00035\u001es^d";
      this.yy(-1, 0, 385, 395, com.xy.q.Class30.agh);
      this.yu(com.xy.w.Class16.m("sc/d/36.png", 20, 20, 20, 20, false), null);
      String var10012 = "MN^\u001d^\u001d^\u001d";
      this.im = com.xy.q.Class1.f(20, 9, 150, 17, 0, com.xy.q.Class49.c("#c000000"), com.xy.q.Class49.ch);
      this.im.setHorizontalAlignment(10);
      String var10005 = "彐剽己该穼牙哂";
      this.im.setText("当前已试穿物品");
      this.add(this.im);
      this.qt = new Class102[3];

      int var2;
      for (int var10000 = var2 = 0; var10000 < this.qt.length; var10000 = var2) {
         this.qt[var2] = new Class102(this);
         this.qt[var2].setBounds(8 + var2 * 125, 27, 115, 150);
         this.add(this.qt[var2++]);
      }
   }

   public void ly(Eshop[] var1) {
      int var2;
      for (int var10000 = var2 = 0; var10000 < this.qt.length; var10000 = var2) {
         this.qt[var2].t();
         this.qt[var2++].setVisible(false);
      }

      var2 = 0;
      int var3;
      int var5 = var3 = 0;

      Class23 var7;
      while (true) {
         if (var5 >= var1.length) {
            var7 = this;
            break;
         }

         if (var1[var3] != null) {
            Class102 var6 = this.qt[var3];
            Eshop var8 = var1[var3];
            var2++;
            String var10002 = "亷玤";
            var6.alc(var8, "仙玉");
            if (var2 >= this.qt.length) {
               var7 = this;
               break;
            }
         }

         var5 = ++var3;
      }

      var7.zc().b(this.lj());
   }
}
