package com.xy.a.i;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JComponent;

class Class8 extends JComponent implements MouseListener {
   // $VF: synthetic field
   final Class10 kg;
   private Image at;
   private int ah;

   @Override
   public void mouseClicked(MouseEvent var1) {
      Class8 var10000;
      if (this.ah == 0) {
         var10000 = this;
         Class10.hm(this.kg)[1].gs(16, 650);
      } else if (this.ah == 1) {
         var10000 = this;
         Class10.hm(this.kg)[1].gs(16, 620);
      } else if (this.ah == 2) {
         var10000 = this;
         Class10.hm(this.kg)[1].gs(16, 630);
      } else if (this.ah == 3) {
         var10000 = this;
         Class10.hm(this.kg)[1].gs(16, 640);
      } else if (this.ah == 4) {
         var10000 = this;
         Class10.hm(this.kg)[1].gs(16, 625);
      } else if (this.ah == 5) {
         var10000 = this;
         Class10.hm(this.kg)[1].gs(16, 635);
      } else {
         if (this.ah == 6) {
            Class10.hm(this.kg)[1].gs(16, 645);
         }

         var10000 = this;
      }

      Class10.hl(var10000.kg, false);
   }

   @Override
   public void mousePressed(MouseEvent var1) {
   }

   @Override
   public void mouseEntered(MouseEvent var1) {
   }

   public Class8(Class10 var1, int var2) {
      this.kg = var1;
      this.ah = var2;
      Class8 var10000;
      if (var2 == 0) {
         var10000 = this;
         this.at = com.xy.w.Class15.d(String.valueOf(650));
      } else if (var2 == 1) {
         var10000 = this;
         this.at = com.xy.w.Class15.d(String.valueOf(620));
      } else if (var2 == 2) {
         var10000 = this;
         this.at = com.xy.w.Class15.d(String.valueOf(630));
      } else if (var2 == 3) {
         var10000 = this;
         this.at = com.xy.w.Class15.d(String.valueOf(640));
      } else if (var2 == 4) {
         var10000 = this;
         this.at = com.xy.w.Class15.d(String.valueOf(625));
      } else if (var2 == 5) {
         var10000 = this;
         this.at = com.xy.w.Class15.d(String.valueOf(635));
      } else {
         if (var2 == 6) {
            this.at = com.xy.w.Class15.d(String.valueOf(645));
         }

         var10000 = this;
      }

      if (var10000.at != null) {
         this.addMouseListener(this);
      }
   }

   @Override
   public void mouseExited(MouseEvent var1) {
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
   }

   @Override
   protected void paintComponent(Graphics var1) {
      super.paintComponent(var1);
      var1.drawImage(Class10.gu(), 0, 0, this.getWidth(), this.getHeight(), null);
      if (this.at != null) {
         var1.drawImage(this.at, 1, 1, this.getWidth() - 2, this.getHeight() - 2, null);
      }
   }
}
