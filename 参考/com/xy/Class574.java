package com.xy;

import com.xy.readbean.Goodstable;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ImageObserver;
import java.math.BigDecimal;
import javax.swing.JComponent;
import javax.swing.JLabel;

public class Class574 extends JComponent {
   private Class44 akj;
   private static Class116 la = new Class116(2 ^ 3, 123 & 61, 58 & 127, 2 ^ 3);
   private static Class116 asq = new Class116(2 & 5, 2 & 5, 127 & 59, 59 & 125);
   private JLabel d;
   private boolean lc;
   private static Image fq;
   private static Image rv;

   public Class44 u() {
      return this.akj;
   }

   public boolean t() {
      BigDecimal var1;
      return (boolean)((var1 = this.akj.ez()) != null && var1 != ((Goodstable)this.akj.hr()).getRgid() ? 2 ^ 3 : 0);
   }

   public void c(int var1, Object var2) {
      this.akj.c(var1, var2);
      if (this.d != null) {
         this.d.setVisible((boolean)(this.akj.tp() == 0 ? --1 : 0));
      }

   }

   protected void paintComponent(Graphics var1) {
      super.paintComponent(var1);
      if (this.lc) {
         var1.drawImage(fq, la.a, la.b, la.d, la.c, (ImageObserver)null);
      }

      var1.drawImage(rv, asq.a, asq.b, asq.d, asq.c, (ImageObserver)null);
   }

   public Class574(Class345 var1) {
      this(var1, (boolean)(3 >> 1));
   }

   public Class574(Class345 var1, boolean var2) {
      this.akj = new Class44(var1);
      this.akj.setBounds(--4, --4, 54 & 123, 54 & 123);
      this.add(this.akj);
      if (rv == null) {
         rv = Class511.a("sc/d/4.png");
      }

      if (var2 && fq == null) {
         fq = Class511.a("sc/d/30.png");
      }

   }

   public void fx(String var1) {
      if (var1 != null || this.d != null) {
         if (this.d == null) {
            this.d = Class133.c(3 & 4, 117 & 31, 123 & 62, 115 & 28, 2 & 5, Color.gray, Class681.bm);
            this.d.setVisible((boolean)(3 ^ 3));
            this.add(this.d);
         }

         this.d.setText(var1);
         this.d.setVisible((boolean)(this.akj.tp() == 0 ? --1 : 0));
         this.setVisible((boolean)(3 >> 1));
      }
   }
}
