package com.xy.a.i;

import com.xy.q.Class49;
import com.xy.readbean.StarSoul;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JComponent;
import javax.swing.JLabel;

public class Class19 extends JComponent implements MouseListener {
   public static Image lp = com.xy.w.Class16.c("sc/bang/XPSoul2.png");
   private JLabel bd;
   private Image g;
   private int cb;
   private com.xy.q.Class30 ri;
   private JLabel fs;
   public static Image at = com.xy.w.Class16.c("sc/bang/XPSoul1.png");
   private Image bp;

   @Override
   public void mouseReleased(MouseEvent var1) {
   }

   public void tz(int var1, com.xy.v.Class8 var2) {
      if ((this.cb = var1) == 0) {
         this.bd.setText("");
         this.ef(0L);
         this.bp = null;
      } else {
         StarSoul var3 = var2.p(var1);
         StringBuffer var4;
         StringBuffer var10000 = var4 = new StringBuffer();
         String var10001 = "Z{\u0012~\n-";
         var10000.append("<html>");
         int var5 = 0;

         for (int var6 = var5; var6 < var3.getName().length(); var6 = var5) {
            if (var5 != 0) {
               var10001 = "HX\u0006\u0015J";
               var4.append("<br/>");
            }

            var4.append(var3.getName().charAt(var5++));
         }

         var10001 = "/Iw\u000feX/I{\u0012~\n-";
         var4.append("</div></html>");
         this.bd.setText(var4.toString());
      }
   }

   @Override
   public void mousePressed(MouseEvent var1) {
      if (this.ri instanceof Class24) {
         Class24 var3;
         (var3 = (Class24)this.ri).wu(this, var1);
      } else {
         if (this.ri instanceof Class38) {
            Class38 var2;
            (var2 = (Class38)this.ri).wu(this, var1);
         }
      }
   }

   public Class19(int var1, Image var2, boolean var3, com.xy.v.Class8 var4, com.xy.q.Class30 var5) {
      this.ri = var5;
      this.g = var2;
      if (var3) {
         this.fs = com.xy.q.Class1.k(4, 4, 32, 16, Color.white, Class49.bz);
         this.add(this.fs);
      }

      this.bd = com.xy.q.Class1.k(0, 0, 0, 0, Color.black, Class49.ch);
      this.bd.setHorizontalAlignment(0);
      this.add(this.bd);
      this.addMouseListener(this);
      this.tz(var1, var4);
   }

   @Override
   protected void paintComponent(Graphics var1) {
      super.paintComponent(var1);
      if (this.g != null) {
         var1.drawImage(this.g, 0, 0, this.getWidth(), this.getHeight(), null);
      }

      var1.drawImage(this.bp, 1, 1, this.getWidth() - 2, this.getHeight() - 2, null);
   }

   @Override
   public void mouseExited(MouseEvent var1) {
   }

   @Override
   public void mouseClicked(MouseEvent var1) {
   }

   @Override
   public void setBounds(int var1, int var2, int var3, int var4) {
      this.bd.setBounds(0, 0, var3, var4);
      super.setBounds(var1, var2, var3, var4);
   }

   public int lj() {
      return this.cb;
   }

   static {
      String var10000 = "`\u0005<\u0004r\btIK6@\tf\n\"Hc\bt";
      var10000 = "\u0007Y[X\u0015T\u0013\u0015,j'U\u0001VF\u0014\u0004T\u0013";
   }

   public void ef(long var1) {
      if (this.fs != null) {
         this.fs.setText(var1 > 0L ? String.valueOf(var1) : null);
      }

      this.bp = var1 > 0L ? at : lp;
   }

   @Override
   public void mouseEntered(MouseEvent var1) {
   }

   public int il() {
      return this.fs != null && !com.xy.v.Class12.h(this.fs.getText()) ? Integer.parseInt(this.fs.getText()) : 0;
   }
}
