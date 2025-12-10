package com.xy;

import com.xy.socket.Agreement;
import com.xy.text.GameView;
import java.awt.Color;
import javax.swing.JTextField;

public class Class273 extends Class345 {
   private Class322 aw;
   private JTextField azg;

   public void y(int var1) {
      String var2;
      if ((var2 = this.azg.getText()) != null && !var2.equals("")) {
         var2 = Agreement.getSendTextAES("exchangegoods", var2);
         this.uw().d(var2);
      }
   }

   public Class273(GameView var1) {
      int var10007 = -4 >> 2;
      super(9715 & 23182, 1 ^ 3, Class345.aef, var1);
      this.va(var10007, 3 >> 2, 447 & 32753, 15805 & 17247, Class345.aei);
      this.fx("sc/b/S308.png");
      this.azg = Class133.l(Class681.ce, Color.WHITE);
      this.azg.setBounds(121 & 127, 10984 & 21975, 21487 & 11480, 82 & 61);
      this.add(this.azg);
      this.aw = new Class322("sc/e/31.png", 4 ^ 5, 9470 & 23441, Class681.ak, Class681.c, "兑 换", this);
      this.aw.setBounds(27647 & 5460, 22462 & 10491, 79 & 123, 123 & 29);
      this.add(this.aw);
   }
}
