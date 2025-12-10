package com.xy;

import com.xy.text.GameView;

public class Class599 extends Class345 {
   private Class322 wq;
   private Class322 aw;
   private Class322 sa;

   public void y(int var1) {
      if (var1 == (24719 & 8189)) {
         ((Class420)this.aej.getFormManagement().e(119 & 111)).y(5 >> 2);
      } else if (var1 == (12543 & 20366)) {
         ((Class420)this.aej.getFormManagement().e(103 & 127)).y(5 >> 1);
      } else {
         if (var1 == (479 & 32431)) {
            Class658.cy(1247 & 31650, this.aej);
         }

      }
   }

   public Class599(GameView var1) {
      int var10010 = -4 >> 2;
      super(25223 & 7673, 1 ^ 3, Class345.aef, var1);
      this.va(var10010, 3 & 4, 25319 & 8157, 27133 & 6059, Class345.aei);
      this.fx("sc/b/S307.png");
      this.sa = new Class322("sc/b/B396.png", 4 ^ 5, 20109 & 12799, this);
      this.wq = new Class322("sc/b/B397.png", 3 >> 1, 1166 & 31743, this);
      this.aw = new Class322("sc/b/B398.png", 3 & 5, 20399 & 12511, this);
      this.sa.setBounds(32241 & 750, 23023 & 10039, 95 & 120, 30 & 117);
      this.wq.setBounds(28537 & 4575, 13743 & 19319, 120 & 95, 93 & 54);
      this.aw.setBounds(24023 & 9210, 25575 & 7487, 88, 20);
      this.add(this.sa);
      this.add(this.wq);
      this.add(this.aw);
   }
}
