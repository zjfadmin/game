package com.xy.a.q;

import com.xy.readbean.Goodstable;
import java.awt.Color;
import java.math.BigDecimal;
import javax.swing.JComponent;
import javax.swing.JLabel;

class Class92 extends JComponent {
   // $VF: synthetic field
   final Class64 afe;
   private com.xy.w.Class18 gh;
   private com.xy.q.Class54 fe;
   private com.xy.w.Class18 dm;
   private JLabel im;

   public Goodstable aho() {
      Goodstable var1;
      return this.fe.il() == 1 && (var1 = (Goodstable)this.fe.jx()).getRgid() != null ? this.afe.yx().getGood(var1.getRgid()) : null;
   }

   public String jg() {
      Goodstable var1;
      return (var1 = this.aho()) != null ? var1.getValue() : null;
   }

   public long ee() {
      Goodstable var1;
      return (var1 = this.aho()) != null ? var1.getType() : -1L;
   }

   public Class92(Class64 var1) {
      this.afe = var1;
      this.fe = new com.xy.q.Class54(var1.eg());
      this.fe.setBounds(4, 4, 50, 50);
      this.add(this.fe);
      this.im = com.xy.q.Class1.f(0, 21, 58, 16, 0, Color.gray, com.xy.q.Class49.bz);
      this.add(this.im);
      String var10010 = "|u r \"!faq";
      this.dm = new com.xy.w.Class18("sc/d/4.png");
      String var10009 = "\u001bdGcG4X)\u0018i\u000f";
      this.gh = new com.xy.w.Class18("sc/d/30.png");
      this.dm.setBounds(0, 0, 59, 57);
      this.gh.setBounds(1, 57, 58, 1);
      this.add(this.dm);
      this.add(this.gh);
   }

   public BigDecimal em() {
      Goodstable var1;
      return (var1 = this.aho()) != null ? var1.getRgid() : null;
   }

   public void dq(String var1) {
      this.im.setText(var1);
   }

   // $VF: synthetic method
   static com.xy.q.Class54 ahp(Class92 var0) {
      return var0.fe;
   }

   public void bb(Goodstable var1) {
      this.im.setVisible(var1 == null);
      byte var10001;
      Goodstable var10002;
      if (var1 != null) {
         var10001 = 1;
         var10002 = var1;
      } else {
         var10001 = 0;
         var10002 = var1;
      }

      this.fe.gs(var10001, var10002);
   }
}
