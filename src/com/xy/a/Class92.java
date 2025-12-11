package com.xy.a;

import com.xy.text.GameView;

public class Class92 extends com.xy.q.Class30 {
   private com.xy.i.Class18 md;
   private com.xy.i.Class18 ce;
   private com.xy.i.Class18 me;

   public void g(int var1) {
      if (var1 == 141) {
         ((com.xy.a.q.Class35)this.afx.getFormManagement().j(103)).g(1);
      } else if (var1 == 142) {
         ((com.xy.a.q.Class35)this.afx.getFormManagement().j(103)).g(2);
      } else {
         if (var1 == 143) {
            com.xy.i.Class0.ff(130, this.afx);
         }
      }
   }

   public Class92(GameView var1) {
      super(129, 2, com.xy.q.Class30.afz, var1);
      String var10008 = "\u0010\fL\rL<P_TA\u0013\u0001\u0004";
      this.yy(-1, 0, 709, 425, com.xy.q.Class30.agf);
      this._do("sc/b/S307.png");
      String var10010 = ")>u?u\u001fidls*3=";
      this.ce = new com.xy.i.Class18("sc/b/B396.png", 1, 141, this);
      String var10009 = "\u0010\fL\rL-PVTA\u0013\u0001\u0004";
      this.md = new com.xy.i.Class18("sc/b/B397.png", 1, 142, this);
      var10008 = ")>u?u\u001fidbs*3=";
      this.me = new com.xy.i.Class18("sc/b/B398.png", 1, 143, this);
      this.ce.setBounds(224, 295, 88, 20);
      this.md.setBounds(345, 295, 88, 20);
      this.me.setBounds(466, 295, 88, 20);
      this.add(this.ce);
      this.add(this.md);
      this.add(this.me);
   }
}
