package com.xy.a.v;

import java.awt.Color;
import javax.swing.JLabel;

class Class14 extends com.xy.q.Class50 {
   private com.xy.i.Class22 rc;
   // $VF: synthetic field
   final Class20 gq;
   private JLabel[] au;

   public void fj(int var1, int var2, int var3) {
      this.au[0].setText(String.valueOf(Math.abs(var1)));
      this.au[1].setText(String.valueOf(var3));
      Class14 var10000;
      if (var2 == 2) {
         var10000 = this;
         this.rc.n(198);
         this.rc.g(var1);
         String var10003 = "風厛";
         this.rc.setText("领取");
         JLabel var10001 = this.au[2];
         String var10002 = "丞栤";
         var10001.setText(String.valueOf("中标"));
      } else if (var2 != 1 || var1 >= 0 && Class20.om(this.gq) != 2) {
         var10000 = this;
         this.rc.n(196);
         this.rc.g(var1);
         String var9 = "悺技";
         this.rc.setText("悔拍");
         JLabel var5 = this.au[2];
         String var7 = "竽拾与";
         var5.setText(String.valueOf("竞拍中"));
      } else {
         var10000 = this;
         this.rc.n(197);
         this.rc.g(var1);
         String var8 = "逮歳";
         this.rc.setText("退款");
         JLabel var4 = this.au[2];
         String var6 = "有丞栤";
         var4.setText(String.valueOf("未中标"));
      }

      var10000.setVisible(var1 != 0);
   }

   public Class14(Class20 var1, int var2, Class20 var3) {
      this.gq = var1;
      String var10009 = "].\u0001(\u0001|\u0017|\u0000=@*";
      String var10014 = "悧拮";
      this.rc = new com.xy.i.Class22("sc/e/191.png", 1, 196, com.xy.q.Class49.bx, null, "悔拍", var3);
      String var10006 = "\r.lx\u0016z\u001by";
      this.rc.setForeground(com.xy.q.Class49.c("#cB58754"));
      this.rc.setBounds(512, 0, 79, 24);
      this.add(this.rc);
      this.au = new JLabel[3];

      int var4;
      for (int var10000 = var4 = 0; var10000 < this.au.length; var10000 = var4) {
         Class14 var5;
         if (var4 == 0) {
            var5 = this;
            String var10007 = "\u0010@\u000b\u0015\u0004\u0017\u0006`";
            this.au[var4] = com.xy.q.Class1.k(7, 0, 150, 24, com.xy.q.Class49.c("#c86745C"), com.xy.q.Class49.ah);
         } else if (var4 == 1) {
            var5 = this;
            this.au[var4] = com.xy.q.Class1.k(170, 0, 150, 24, Color.red, com.xy.q.Class49.w);
         } else {
            if (var4 == 2) {
               this.au[var4] = com.xy.q.Class1.k(326, 0, 150, 24, Color.red, com.xy.q.Class49.w);
            }

            var5 = this;
         }

         var5.au[var4].setHorizontalAlignment(0);
         this.add(this.au[var4++]);
      }
   }
}
