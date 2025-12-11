package com.xy.a.a;

import com.xy.entity.RoleSummoning;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.math.BigDecimal;
import javax.swing.JComponent;

class Class7 extends JComponent implements MouseListener {
   private Image hf;
   // $VF: synthetic field
   final Class0 hg;
   private BigDecimal hh;

   public void i(BigDecimal var1) {
      if (!com.xy.v.Class12.x(var1, this.hh)) {
         this.hh = var1;
         RoleSummoning var2 = var1 != null ? this.hg.yx().getPet(var1) : null;
         Image var10001;
         if (var2 != null) {
            String var10003 = "5";
            var10001 = com.xy.w.Class15.e("p" + var2.getSummoningskin());
         } else {
            var10001 = null;
         }

         this.hf = var10001;
      }
   }

   public Class7(Class0 var1) {
      this.hg = var1;
      this.addMouseListener(this);
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
   }

   @Override
   protected void paintComponent(Graphics var1) {
      var1.drawImage(Class0.j(this.hg), 0, 0, this.getWidth(), this.getHeight(), null);
      if (this.hf != null) {
         var1.drawImage(this.hf, 12, 11, 35, 35, null);
      }
   }

   @Override
   public void mouseExited(MouseEvent var1) {
   }

   @Override
   public void mousePressed(MouseEvent var1) {
   }

   @Override
   public void mouseEntered(MouseEvent var1) {
   }

   @Override
   public void mouseClicked(MouseEvent var1) {
      if (this.hh != null && var1.isMetaDown()) {
         this.hg.d(this.hh);
      }
   }
}
