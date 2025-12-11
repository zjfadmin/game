package com.xy.a.a;

import java.awt.event.MouseEvent;

class Class28 extends com.xy.q.Class54 {
   // $VF: synthetic field
   final Class49 sx;

   @Override
   public void cw(MouseEvent var1) {
      this.sx.je(var1);
   }

   @Override
   public void mouseExited(MouseEvent var1) {
      this.gn(Boolean.FALSE);
      this.aud = Boolean.FALSE;
      this.aui.zc().f(46);
   }

   Class28(Class49 var1, com.xy.q.Class30 var2) {
      super(var2);
      this.sx = var1;
   }

   @Override
   public void mouseEntered(MouseEvent var1) {
      this.aud = Boolean.TRUE;
      this.sx.cw(var1);
   }
}
