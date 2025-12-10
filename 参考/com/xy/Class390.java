package com.xy;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JComponent;

public class Class390 extends JComponent implements MouseListener {
   public Class6 qb;
   private Class436 et;
   public Class659 qc;
   public Object qd;
   private Class436 av;
   public Class345 is;
   public Class357 cw;

   public void mouseReleased(MouseEvent var1) {
   }

   public void mouseEntered(MouseEvent var1) {
   }

   public void mouseClicked(MouseEvent var1) {
   }

   public Object hr() {
      return this.qd;
   }

   public void mousePressed(MouseEvent var1) {
      if (var1.getButton() == --3) {
         if (this.is instanceof Class185) {
            ((Class185)this.is).r((boolean)(3 ^ 3));
            return;
         }

         if (this.is instanceof Class232) {
            ((Class232)this.is).r((boolean)(3 >> 2));
            return;
         }

         if (this.is instanceof Class660) {
            ((Class660)this.is).r((boolean)(3 ^ 3));
            return;
         }

         if (this.is instanceof Class195) {
            ((Class195)this.is).r((boolean)(2 & 5));
            return;
         }

         if (this.is instanceof Class428) {
            ((Class428)this.is).gt((boolean)(3 & 4));
         }
      }

   }

   public void mouseExited(MouseEvent var1) {
   }

   public Class390(Class345 var1) {
      this.is = var1;
      if (!(var1 instanceof Class195) && !(var1 instanceof Class428)) {
         this.qc = new Class659(5 >> 3, 100 & 127, var1);
         this.qc.vf(127 & 10, 122 & 127, 5119 & 27798, 22 & 125);
         this.add(this.qc);
      }

      Class216[] var10000 = new Class216[2];
      boolean var10002 = true;
      Class216[] var2 = var10000;

      int var3;
      for(int var4 = var3 = 5 >> 3; var4 < var2.length; var4 = var3) {
         var2[var3] = new Class216(var3 == 0 ? "sc/e/42.png" : "sc/e/43.png", 1, var3, var1);
         var2[var3].setBounds((21944 & 11103) + var3 * (84 & 63), 127 & 123, 27 & 118, 27 & 118);
         this.add(var2[var3++]);
      }

      this.et = new Class436(Class511.q("sc/d/19.png", --5, --5, --5, --5, (boolean)(3 >> 2)));
      this.et.setBounds(91 & 45, 45 & 95, 20861 & 12215, 107 & 125);
      this.add(this.et);
      Class390 var5;
      if (!(var1 instanceof Class195) && !(var1 instanceof Class428)) {
         var5 = this;
         this.qb = new Class6(var1, 6, 1 ^ 3, 51, 51, 5 >> 3, 5 >> 3, 10, 15);
         this.qb.hf(Class511.a("sc/d/18.png"));
         this.qb.aix(var2, 5 >> 2);
         this.add(this.qb);
      } else {
         var5 = this;
         this.cw = new Class357(var1, 102 & 31, --2, 55 & 123, 55 & 123, 2 & 5, 2 & 5, 10 & 127, 15);
         this.cw.hf(Class511.a("sc/d/18.png"));
         this.cw.aix(var2, --1);
         this.add(this.cw);
      }

      var5.av = new Class436(Class511.q("sc/d/36.png", 20, 20, 20, 20, (boolean)(3 >> 2)));
      this.av.setBounds(2 & 5, 2 & 5, 330, 150);
      this.add(this.av);
      this.addMouseListener(this);
   }
}
