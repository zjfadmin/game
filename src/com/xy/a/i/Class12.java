package com.xy.a.i;

import com.xy.a.q.Class97;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JComponent;

public class Class12 extends JComponent implements MouseListener {
   public com.xy.q.Class30 hs;
   private com.xy.w.Class18 co;
   public com.xy.q.Class44 nb;
   public com.xy.q.Class43 nc;
   public Object nd;
   public com.xy.q.Class13 ne;
   private com.xy.w.Class18 dn;

   @Override
   public void mouseClicked(MouseEvent var1) {
   }

   @Override
   public void mouseEntered(MouseEvent var1) {
   }

   public Object jx() {
      return this.nd;
   }

   @Override
   public void mousePressed(MouseEvent var1) {
      if (var1.getButton() == 3) {
         if (this.hs instanceof Class97) {
            ((Class97)this.hs).cr(false);
            return;
         }

         if (this.hs instanceof Class6) {
            ((Class6)this.hs).cr(false);
            return;
         }

         if (this.hs instanceof Class11) {
            ((Class11)this.hs).cr(false);
            return;
         }

         if (this.hs instanceof com.xy.a.a.Class27) {
            ((com.xy.a.a.Class27)this.hs).cr(false);
            return;
         }

         if (this.hs instanceof com.xy.a.q.Class13) {
            ((com.xy.a.q.Class13)this.hs).cr(false);
         }
      }
   }

   public Class12(com.xy.q.Class30 var1) {
      this.hs = var1;
      if (!(var1 instanceof com.xy.a.a.Class27) && !(var1 instanceof com.xy.a.q.Class13)) {
         this.nb = new com.xy.q.Class44(0, 100, var1);
         this.nb.zb(10, 122, 150, 20);
         this.add(this.nb);
      }

      com.xy.i.Class3[] var2 = new com.xy.i.Class3[2];

      int var3;
      for (int var10000 = var3 = 0; var10000 < var2.length; var10000 = var3) {
         String var5;
         if (var3 == 0) {
            var5 = "tu(s(\"58wx`";
            var5 = "sc/e/42.png";
         } else {
            var5 = ")>u8uiis*3=";
            var5 = "sc/e/43.png";
         }

         com.xy.i.Class3 var10001 = new com.xy.i.Class3(var5, 1, var3, var1);
         var2[var3] = var10001;
         var2[var3].setBounds(280 + var3 * 20, 123, 18, 18);
         this.add(var2[var3++]);
      }

      String var10007 = "tu(r('>8wx`";
      this.dn = new com.xy.w.Class18(com.xy.w.Class16.m("sc/d/19.png", 5, 5, 5, 5, false));
      this.dn.setBounds(9, 13, 309, 105);
      this.add(this.dn);
      Class12 var4;
      if (!(var1 instanceof com.xy.a.a.Class27) && !(var1 instanceof com.xy.a.q.Class13)) {
         var4 = this;
         this.nc = new com.xy.q.Class43(var1, 6, 2, 51, 51, 0, 0, 10, 15);
         String var7 = "tu(r('?8wx`";
         this.nc.gt(com.xy.w.Class16.c("sc/d/18.png"));
         this.nc.vo(var2, 1);
         this.add(this.nc);
      } else {
         var4 = this;
         this.ne = new com.xy.q.Class13(var1, 6, 2, 51, 51, 0, 0, 10, 15);
         String var10005 = ")>u9ulbs*3=";
         this.ne.gt(com.xy.w.Class16.c("sc/d/18.png"));
         this.ne.vo(var2, 1);
         this.add(this.ne);
      }

      String var10003 = ")>u9unls*3=";
      var4.co = new com.xy.w.Class18(com.xy.w.Class16.m("sc/d/36.png", 20, 20, 20, 20, false));
      this.co.setBounds(0, 0, 330, 150);
      this.add(this.co);
      this.addMouseListener(this);
   }

   @Override
   public void mouseExited(MouseEvent var1) {
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
   }
}
