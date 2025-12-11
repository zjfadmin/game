package com.xy.a.i;

import com.xy.q.Class54;
import java.awt.event.MouseEvent;

class Class46 extends Class54 {
   // $VF: synthetic field
   final Class9 axh;
   private int ah;

   public Class46(Class9 var1, int var2) {
      super(var1.eg());
      String var10003 = "qq-p-A1!;<r|e";
      this.axh = var1;
      this.dq("sc/b/S339.png");
      this.ah = var2;
   }

   @Override
   public void mousePressed(MouseEvent var1) {
      if (Class9.hf(this.axh).getChoice() != null) {
         Class9.hd(this.axh, this.ah);
      }
   }
}
