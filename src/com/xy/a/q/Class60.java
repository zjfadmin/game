package com.xy.a.q;

import com.xy.entity.RoleSummoning;
import com.xy.game.RolePet;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;

class Class60 extends com.xy.i.Class1 {
   private int ae;
   private com.xy.w.Class18 af;
   // $VF: synthetic field
   final Class19 vl;
   private JLabel im;

   @Override
   public void mousePressed(MouseEvent var1) {
      super.mousePressed(var1);
      this.af.setBounds(2, 2, 39, 39);
   }

   public Class60(Class19 var1, String var2, int var3, int var4) {
      super(var2, var3, var1.eg());
      this.vl = var1;
      this.ae = var4;
      this.af = new com.xy.w.Class18();
      this.af.setBounds(1, 1, 39, 39);
      this.add(this.af);
      this.im = com.xy.q.Class1.f(0, 38, 42, 14, 0, Color.white, com.xy.q.Class49.bm);
      String var5;
      if (var4 == 4) {
         var5 = "攉揇";
         var5 = "支援";
      } else {
         var5 = String.valueOf(var4);
      }

      this.im.setText(var5);
      this.add(this.im);
   }

   @Override
   public void fe(MouseEvent var1, boolean var2) {
   }

   @Override
   public void mouseExited(MouseEvent var1) {
      super.mouseExited(var1);
      this.vl.zc().f(42);
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
      super.mouseReleased(var1);
      this.af.setBounds(1, 1, 39, 39);
   }

   @Override
   public void mouseEntered(MouseEvent var1) {
      super.mouseEntered(var1);
      RolePet var2;
      if ((var2 = this.vl.yx().getBBRolePet(this.ae)) != null) {
         ((com.xy.a.Class1)this.vl.zc().j(42)).aa(var2.getPet(), null, false);
      }
   }

   @Override
   public void cw(MouseEvent var1) {
      ((Class81)this.vl.zc().j(136)).g(Class19.ld(this.vl));
   }

   public void lc(RolePet var1) {
      RoleSummoning var2 = var1 != null ? var1.getPet() : null;
      Image var10001;
      if (var2 != null) {
         String var10003 = "\u0004";
         var10001 = com.xy.w.Class15.e("p" + var2.getSummoningskin());
      } else {
         var10001 = null;
      }

      this.af.gt(var10001);
   }
}
