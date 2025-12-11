package com.xy.a;

import com.xy.bean.GangReward;
import com.xy.readbean.Goodstable;
import java.awt.Color;
import javax.swing.JLabel;

class Class22 extends com.xy.q.Class54 {
   // $VF: synthetic field
   final Class83 kf;
   private JLabel di = com.xy.q.Class1.f(1, 2, 42, 12, 10, Color.WHITE, com.xy.q.Class49.bz);
   private JLabel im;

   public Class22(Class83 var1) {
      super((var1).eg());
      this.kf = var1;
      this.add(this.di);
      this.im = com.xy.q.Class1.f(7, 34, 42, 12, 4, Color.RED, com.xy.q.Class49.bz);
      this.add(this.im);
   }

   public void hc(GangReward var1) {
      Goodstable var2 = var1 != null ? this.kf.yt().ay(var1.getGoodId()) : null;
      if (var2 == null) {
         this.gs(0, null);
         this.setVisible(true);
         this.di.setText("");
         this.im.setText("");
      } else {
         this.gs(1, var2);
         this.di.setText(var1.getDropNum() > 1 ? String.valueOf(var1.getDropNum()) : "");
         this.im.setText(String.valueOf(var1.getRewardNum()));
      }
   }
}
