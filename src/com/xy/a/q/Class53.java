package com.xy.a.q;

import com.xy.socket.Agreement;
import com.xy.text.GameView;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JLabel;

class Class53 extends JLabel implements MouseListener {
   // $VF: synthetic field
   final Class70 ach;
   private int ah;

   @Override
   public void mouseClicked(MouseEvent var1) {
      if (this.ah >= Class70.aaq(this.ach)) {
         GameView var10000 = this.ach.afx;
         String var4 = "笉";
         StringBuilder var10001 = new StringBuilder("第").append(this.ah + 1);
         String var10002 = "夁辚朂彂攖蠧策";
         var10000._do(var10001.append("天还未开放补签").toString());
      } else {
         if ((this.ach.yx().getTaskSystem().f(7, 2) >>> this.ah & 1) == 0) {
            String var10003 = "wv\u0018\u0003\u0014";
            String var3 = Agreement.getSendTextAES("taskN", "R7=B1" + this.ah);
            this.ach.za().k(var3);
         }
      }
   }

   @Override
   public void mouseEntered(MouseEvent var1) {
   }

   @Override
   public void mousePressed(MouseEvent var1) {
   }

   public Class53(Class70 var1, int var2) {
      super(String.valueOf(var2 + 1), 0);
      this.ach = var1;
      this.ah = var2;
      this.setForeground(Color.black);
      this.setFont(com.xy.q.Class49.aw);
      this.setOpaque(true);
      this.addMouseListener(this);
   }

   @Override
   public void mouseExited(MouseEvent var1) {
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
   }
}
