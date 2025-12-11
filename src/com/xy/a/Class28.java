package com.xy.a;

import com.xy.text.GameView;

public class Class28 extends com.xy.q.Class30 {
   private Class13[] qu;

   public Class28(GameView var1) {
      super(120, 2, com.xy.q.Class30.afz, var1);
      String var10003 = "03l2l\u0003qgt~3>$";
      this.yy(-1, 0, 684, 455, com.xy.q.Class30.agf);
      this._do("sc/b/S277.png");
      this.qu = new Class13[3];

      int var2;
      for (int var10000 = var2 = 0; var10000 < this.qu.length; var10000 = var2) {
         this.qu[var2] = new Class13(this, var2);
         this.qu[var2].setBounds(29 + 216 * var2, 38, 192, 378);
         this.add(this.qu[var2++]);
      }
   }
}
