package com.xy.a;

import com.xy.socket.Agreement;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JComponent;

class Class13 extends JComponent implements MouseListener {
   private Image g;
   private boolean gk;
   private Image gl;
   private int ds;
   private boolean bi;
   // $VF: synthetic field
   final Class28 gm;

   @Override
   protected void paintComponent(Graphics var1) {
      if (this.bi) {
         var1.drawImage(this.ez(1), 1, 1, this.getWidth(), this.getHeight(), null);
      } else if (this.gk) {
         var1.drawImage(this.ez(1), 0, 0, this.getWidth(), this.getHeight(), null);
      } else {
         var1.drawImage(this.ez(0), 0, 0, this.getWidth(), this.getHeight(), null);
      }
   }

   public Class13(Class28 var1, int var2) {
      this.gm = var1;
      this.ds = var2;
      this.addMouseListener(this);
   }

   @Override
   public void mouseExited(MouseEvent var1) {
      this.bi = Boolean.FALSE;
      this.gk = Boolean.FALSE;
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
      this.bi = Boolean.FALSE;
   }

   @Override
   public void mouseEntered(MouseEvent var1) {
      this.gk = Boolean.TRUE;
   }

   @Override
   public void mousePressed(MouseEvent var1) {
      this.bi = Boolean.TRUE;
      if (this.gk) {
         if (this.ds == 0) {
            String var3 = "\u001b";
            String var2 = Agreement.getSendTextAES("teamArena", "X");
            this.gm.za().k(var2);
         } else if (this.ds == 1 && this.gm.za().VALUE.indexOf(74) != -1) {
            this.gm.zc().b(135);
         } else {
            String var10001 = "暢杯张敻";
            this.gm.afx._do("暂未开放");
         }
      }
   }

   @Override
   public void mouseClicked(MouseEvent var1) {
   }

   public Image ez(int var1) {
      if (var1 == 0 && this.g == null || var1 != 0 && this.gl == null) {
         if (var1 == 0) {
            String var2 = "# \u007f!\u007f\u0010";
            this.g = com.xy.w.Class16.c("sc/b/S" + (this.ds * 2 + 278) + ".png");
            return var1 == 0 ? this.g : this.gl;
         }

         String var10003 = "S&\u000f'\u000f\u0016";
         this.gl = com.xy.w.Class16.c("sc/b/S" + (this.ds * 2 + 279) + ".png");
      }

      return var1 == 0 ? this.g : this.gl;
   }
}
