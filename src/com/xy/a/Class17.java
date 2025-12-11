package com.xy.a;

import com.xy.richtext.RichLabel;
import com.xy.text.GameView;
import javax.swing.JLabel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;

public class Class17 extends com.xy.q.Class30 {
   private JScrollPane i;
   private com.xy.w.Class18[] j;
   private RichLabel ck;
   private JLabel im;

   public void es(String var1, String var2) {
      this.im.setText(var1);
      this.ck.setTextSize(var2, 218);
      JScrollBar var3 = this.i.getVerticalScrollBar();
      var3.setMaximum(this.ck.getHeight());
      var3.setValue(0);
      this.zc().b(this.lj());
   }

   public Class17(GameView var1) {
      super(180, 2, com.xy.q.Class30.afz, var1);
      String var10007 = "}2!5!` !`6";
      this.yy(-1, 0, 314, 344, com.xy.q.Class30.agh);
      com.xy.w.Class9 var6 = com.xy.w.Class16.m("sc/d/1.png", 68, 68, 68, 68, false);
      String var10008 = "觢刪诒昽";
      this.yu(var6, "规则说明");
      String var10010 = "-2H\u0017H\u0017H\u0017";
      this.im = com.xy.q.Class1.f(49, 29, 236, 21, 0, com.xy.q.Class49.c("#cFFFFFF"), com.xy.q.Class49.ch);
      this.add(this.im);
      this.ck = new RichLabel("", com.xy.q.Class49.ac, 218);
      this.i = com.xy.q.Class1.g(52, 49, 233, 265, this.ck, -1);
      this.add(this.i);
      this.j = new com.xy.w.Class18[2];

      int var2;
      for (int var10000 = var2 = 0; var10000 < this.j.length; var10000 = var2) {
         this.j[var2] = new com.xy.w.Class18();
         Class17 var3;
         if (var2 == 0) {
            var3 = this;
            com.xy.w.Class18 var10002 = this.j[var2];
            String var10003 = "@E\u001cB\u001c\u0014\u0006\bCHT";
            var10002.mt(com.xy.w.Class16.m("sc/d/25.png", 2, 2, 2, 2, false));
            this.j[var2].setBounds(49, 29, 236, 21);
         } else {
            if (var2 == 1) {
               com.xy.w.Class18 var10001 = this.j[var2];
               String var4 = "\"m~j~<e !`6";
               var10001.mt(com.xy.w.Class16.m("sc/d/24.png", 2, 2, 2, 2, false));
               this.j[var2].setBounds(49, 29, 236, 285);
            }

            var3 = this;
         }

         var3.add(this.j[var2++]);
      }
   }
}
