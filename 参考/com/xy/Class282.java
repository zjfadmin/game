package com.xy;

import com.xy.readbean.StarSoul;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.ImageObserver;
import javax.swing.JComponent;
import javax.swing.JLabel;

public class Class282 extends JComponent implements MouseListener {
   public static Image vx = Class511.a("sc/bang/XPSoul2.png");
   private Image gd;
   private Image xs;
   private Class345 lo;
   private JLabel d;
   public static Image rg = Class511.a("sc/bang/XPSoul1.png");
   private int cy;
   private JLabel ax;

   public void alb(int var1, Class603 var2) {
      if ((this.cy = var1) == 0) {
         this.d.setText("");
         this.gh(0L);
         this.gd = null;
      } else {
         StarSoul var4 = var2.k(var1);
         StringBuffer var5;
         (var5 = new StringBuffer()).append("<html>");
         int var3 = 3 >> 2;

         for(int var10000 = var3; var10000 < var4.getName().length(); var10000 = var3) {
            if (var3 != 0) {
               var5.append("<br/>");
            }

            var5.append(var4.getName().charAt(var3++));
         }

         var5.append("</div></html>");
         this.d.setText(var5.toString());
      }
   }

   public void mouseEntered(MouseEvent var1) {
   }

   public void gh(long var1) {
      if (this.ax != null) {
         this.ax.setText(var1 > 0L ? String.valueOf(var1) : null);
      }

      this.gd = var1 > 0L ? rg : vx;
   }

   public void setBounds(int var1, int var2, int var3, int var4) {
      this.d.setBounds(3 & 4, 3 & 4, var3, var4);
      super.setBounds(var1, var2, var3, var4);
   }

   public void mousePressed(MouseEvent var1) {
      if (this.lo instanceof Class391) {
         ((Class391)this.lo).un(this, var1);
      } else {
         if (this.lo instanceof Class588) {
            ((Class588)this.lo).un(this, var1);
         }

      }
   }

   protected void paintComponent(Graphics var1) {
      super.paintComponent(var1);
      if (this.xs != null) {
         var1.drawImage(this.xs, 3 >> 2, 3 >> 2, this.getWidth(), this.getHeight(), (ImageObserver)null);
      }

      var1.drawImage(this.gd, 3 & 5, 3 & 5, this.getWidth() - --2, this.getHeight() - --2, (ImageObserver)null);
   }

   public void mouseExited(MouseEvent var1) {
   }

   public void mouseReleased(MouseEvent var1) {
   }

   public void mouseClicked(MouseEvent var1) {
   }

   public int tp() {
      return this.cy;
   }

   public Class282(int var1, Image var2, boolean var3, Class603 var4, Class345 var5) {
      this.lo = var5;
      this.xs = var2;
      if (var3) {
         this.ax = Class133.b(--4, --4, 111 & 48, 125 & 18, Color.white, Class681.bm);
         this.add(this.ax);
      }

      this.d = Class133.b(2 & 5, 2 & 5, 2 & 5, 2 & 5, Color.black, Class681.ak);
      this.d.setHorizontalAlignment(3 ^ 3);
      this.add(this.d);
      this.addMouseListener(this);
      this.alb(var1, var4);
   }

   public int ae() {
      return this.ax != null && !Class394.o(this.ax.getText()) ? Integer.parseInt(this.ax.getText()) : 0;
   }
}
