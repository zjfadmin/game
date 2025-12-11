package com.xy.a.q;

import com.xy.readbean.Buff;
import com.xy.richtext.RichLabel;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.BorderFactory;
import javax.swing.JComponent;

class Class36 extends JComponent implements MouseListener {
   // $VF: synthetic field
   final Class104 xk;
   private int ds;
   private Image at;
   private RichLabel bj;

   @Override
   public void mousePressed(MouseEvent var1) {
   }

   public void n(int var1) {
      this.ds = var1;
      Buff var2;
      if ((var2 = this.xk.yt().a(var1)) == null) {
         this.bj.setText("");
      } else {
         RichLabel var10000 = this.bj;
         StringBuilder var10001 = new StringBuilder(String.valueOf(var2.getColor())).append(var2.getbName());
         String var10002 = "C";
         var10000.setText(var10001.append(":").append(var2.getbText()).toString());
      }
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
   }

   public Class36(Class104 var1, int var2) {
      this.xk = var1;
      this.bj = new RichLabel("", com.xy.q.Class49.bm, 505);
      this.bj.setBounds(52, 0, 515, 45);
      this.add(this.bj);
      this.addMouseListener(this);
   }

   @Override
   public void mouseClicked(MouseEvent var1) {
      int var2;
      for (int var10000 = var2 = 0; var10000 < Class104.ame(this.xk).length; var10000 = ++var2) {
         if (Class104.ame(this.xk)[var2] == this) {
            Class104.ame(this.xk)[var2].setBorder(BorderFactory.createLineBorder(Color.red, 2));
         } else {
            Class104.ame(this.xk)[var2].setBorder(null);
         }
      }
   }

   @Override
   protected void paintComponent(Graphics var1) {
      super.paintComponent(var1);
      if (this.at == null) {
         String var10001 = "I\n\u0015\u000b\u0015:\bP\bGJ\u0007]";
         this.at = com.xy.w.Class16.c("sc/b/S292.png");
      }

      var1.drawImage(this.at, 0, 0, this.getWidth(), this.getHeight(), null);
   }

   @Override
   public void mouseExited(MouseEvent var1) {
   }

   // $VF: synthetic method
   static int se(Class36 var0) {
      return var0.ds;
   }

   @Override
   public void mouseEntered(MouseEvent var1) {
   }
}
