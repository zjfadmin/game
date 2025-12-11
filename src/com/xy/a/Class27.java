package com.xy.a;

import com.xy.socket.Agreement;
import com.xy.text.GameView;
import java.awt.Color;
import javax.swing.JTextField;

public class Class27 extends com.xy.q.Class30 {
   private com.xy.i.Class18 ce;
   private JTextField qq;

   public Class27(GameView var1) {
      super(130, 2, com.xy.q.Class30.afz, var1);
      String var10005 = "\u00006\\7\\\u0006@eK{\u0003;\u0014";
      this.yy(-1, 0, 433, 285, com.xy.q.Class30.agf);
      this._do("sc/b/S308.png");
      this.qq = com.xy.q.Class1.n(com.xy.q.Class49.ac, Color.WHITE);
      this.qq.setBounds(121, 192, 200, 16);
      this.add(this.qq);
      String var10007 = "D4\u00182\u0018d\u0006yG9P";
      String var10012 = "儢u挑";
      this.ce = new com.xy.i.Class18("sc/e/31.png", 1, 144, com.xy.q.Class49.ch, com.xy.q.Class49.bv, "兑 换", this);
      this.ce.setBounds(340, 186, 75, 25);
      this.add(this.ce);
   }

   public void g(int var1) {
      String var2;
      if ((var2 = this.qq.getText()) != null && !var2.equals("")) {
         String var3 = Agreement.getSendTextAES("exchangegoods", var2);
         this.za().k(var3);
      }
   }
}
