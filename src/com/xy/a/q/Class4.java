package com.xy.a.q;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JComponent;
import javax.swing.JLabel;

class Class4 extends JComponent implements MouseListener {
   private JLabel ge;
   private com.xy.w.Class18 fy;
   private com.xy.w.Class18 gf;
   private JLabel df;
   // $VF: synthetic field
   final Class30 gg;
   private com.xy.w.Class18 gh;
   private int ds;
   private boolean bi;
   private boolean cf;

   // $VF: synthetic method
   static int er(Class4 var0) {
      return var0.ds;
   }

   public void es(String var1, String var2) {
      this.df.setText(var1);
      this.ge.setText(var2);
   }

   @Override
   public void mouseClicked(MouseEvent var1) {
   }

   public void be(boolean var1) {
      if (this.gf != null) {
         if (this.gf.gu() == null || this.bi != var1) {
            this.bi = var1;
            String var2;
            if (var1) {
               var2 = "gY;_;\t$\u0014dTs";
               var2 = "sc/e/30.png";
            } else {
               var2 = "\u001f;C=CjUv\u001c6\u000b";
               var2 = "sc/e/29.png";
            }

            this.gf.dp(var2);
         }
      }
   }

   public Class4(Class30 var1, boolean var2, int var3) {
      this.gg = var1;
      this.cf = var2;
      this.ds = var3;
      this.df = com.xy.q.Class1.k(9, 0, 126, 28, var2 ? Color.white : Color.green, com.xy.q.Class49.n);
      this.ge = com.xy.q.Class1.k(139, 0, 81, 28, var2 ? Color.white : Color.green, com.xy.q.Class49.n);
      String var10007 = "gY;^;\b \u0014dTs";
      this.fy = new com.xy.w.Class18(com.xy.w.Class16.m("sc/d/24.png", 2, 2, 2, 2, false));
      String var10006 = "\u001f;C<CjXv\u001c6\u000b";
      this.gh = new com.xy.w.Class18(com.xy.w.Class16.m("sc/d/24.png", 2, 2, 2, 2, false));
      this.add(this.df);
      this.add(this.ge);
      if (var2) {
         this.gf = new com.xy.w.Class18();
         this.gf.setBounds(112, 5, 17, 17);
         this.add(this.gf);
         this.addMouseListener(this);
      }

      this.fy.setBounds(0, 0, 135, 28);
      this.gh.setBounds(136, 0, 55, 28);
      this.add(this.fy);
      this.add(this.gh);
   }

   // $VF: synthetic method
   static boolean et(Class4 var0) {
      return var0.bi;
   }

   // $VF: synthetic method
   static boolean eu(Class4 var0) {
      return var0.cf;
   }

   @Override
   public void mousePressed(MouseEvent var1) {
   }

   // $VF: synthetic method
   static com.xy.w.Class18 ev(Class4 var0) {
      return var0.gf;
   }

   @Override
   public void mouseEntered(MouseEvent var1) {
   }

   @Override
   public void mouseExited(MouseEvent var1) {
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
   }
}
