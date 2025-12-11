package com.xy.a.i;

import com.xy.readbean.StarSoul;
import java.awt.Graphics;
import java.awt.event.MouseEvent;

class Class26 extends com.xy.i.Class5 {
   // $VF: synthetic field
   final Class22 afp;
   private com.xy.w.Class1 kl;
   private boolean bi;
   private int ah;

   @Override
   public void cw(MouseEvent var1) {
      if (Class22.wa(this.afp) == -1L) {
         Class22.vz(this.afp, com.xy.v.Class22.l());
         this.afp.g(this.ah);
      }
   }

   protected void yn(com.xy.w.Class1 var1, Graphics var2) {
      com.xy.w.Class1 var10000;
      label19: {
         if (this.bi) {
            if (this.kl != null) {
               var10000 = var1;
               this.kl.j(com.xy.v.Class22.l(), 0);
               this.kl.ab(var2, this.getX(), this.getY());
               break label19;
            }

            String var10003 = "\u0011\u0003M\u0002\u0003\u000e\u0005O:0&,";
            this.kl = com.xy.w.Class11.f("sc/bang/XPDL" + this.ah + ".tcp", null);
         }

         var10000 = var1;
      }

      if (var10000 != null) {
         var1.j(com.xy.v.Class22.l(), 0);
         var1.ab(var2, this.getX(), this.getY());
      }
   }

   // $VF: synthetic method
   static void yo(Class26 var0, boolean var1) {
      var0.bi = var1;
   }

   // $VF: synthetic method
   static int yp(Class26 var0) {
      return var0.ah;
   }

   @Override
   public void fe(MouseEvent var1, boolean var2) {
   }

   @Override
   public void mouseExited(MouseEvent var1) {
      super.mouseExited(var1);
      this.afp.afx.getFormManagement().f(46);
   }

   // $VF: synthetic method
   static boolean yq(Class26 var0) {
      return var0.bi;
   }

   @Override
   public void mouseEntered(MouseEvent var1) {
      super.mouseEntered(var1);
      StarSoul var3 = this.afp.yt().p(10000 + this.ah);
      ((com.xy.a.Class48)this.afp.zc().j(46)).qn(var3, this.bi ? 1 : 0);
   }

   public Class26(Class22 var1, int var2) {
      super(null, 1, null, var1.eg());
      this.afp = var1;
      this.ro(Class22.vw(var2));
      this.ah = var2;
      if (var2 == 1) {
         this.setBounds(247, 8, 137, 65);
      } else if (var2 == 2) {
         this.setBounds(388, 28, 115, 113);
      } else if (var2 == 3) {
         this.setBounds(469, 141, 65, 137);
      } else if (var2 == 4) {
         this.setBounds(395, 280, 114, 115);
      } else if (var2 == 5) {
         this.setBounds(263, 365, 135, 61);
      } else if (var2 == 6) {
         this.setBounds(146, 291, 114, 116);
      } else if (var2 == 7) {
         this.setBounds(115, 156, 65, 140);
      } else {
         if (var2 == 8) {
            this.setBounds(137, 39, 114, 113);
         }
      }
   }
}
