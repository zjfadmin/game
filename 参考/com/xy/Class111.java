package com.xy;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.ImageObserver;
import javax.swing.JLabel;

public abstract class Class111 extends JLabel implements MouseListener, Class291 {
   private boolean afv;
   protected Class345 amq;
   private int br;
   private int gv;
   private int[] amr;
   private boolean hg;
   private Color[] ams;
   private boolean ee;
   private boolean lb;
   protected Image[] amt;
   private boolean bb;
   public static Image rv;

   public void fv(MouseEvent var1) {
      if (this.gv == (1 ^ 3)) {
         this.q();
         this.ac(var1, (boolean)(this.lb ? 3 & 4 : 1));
      }
   }

   public void mousePressed(MouseEvent var1) {
      if (this.gv != -4 >> 2) {
         this.hg = Boolean.TRUE;
         this.cc();
         if (this.bb) {
            this.fv(var1);
         }

      }
   }

   public void fw(String var1) {
   }

   public void ab(int var1) {
      if ((this.gv = var1) == -4 >> 2) {
         this.br = -4 >> 2;
         if (this.ams != null && this.getForeground() != this.ams[2 & 5]) {
            this.setForeground(this.ams[5 >> 3]);
            return;
         }
      } else {
         this.br = 5 >> 3;
         this.cc();
      }

   }

   public void fy(MouseEvent var1) {
      if (this.gv == 3 >> 1) {
         if (!Class280.j()) {
            this.q();
            this.af(var1);
         }
      }
   }

   public void mouseClicked(MouseEvent var1) {
   }

   public void fx(String var1) {
      this.fw(var1);
      this.ab(this.gv);
   }

   public void mouseReleased(MouseEvent var1) {
      if (this.gv != -4 >> 2) {
         this.hg = Boolean.FALSE;
         this.cc();
         if (this.bb) {
            this.fy(var1);
         }

      }
   }

   public void mouseEntered(MouseEvent var1) {
      if (this.gv != -4 >> 2) {
         this.bb = Boolean.TRUE;
         this.cc();
      }
   }

   public void cc() {
      if (this.br != -4 >> 2) {
         Class111 var10000;
         if (!this.hg && !this.lb) {
            if (this.bb) {
               this.br = 2 ^ 3;
               var10000 = this;
            } else {
               this.br = 0;
               var10000 = this;
            }
         } else {
            var10000 = this;
            this.br = 5 >> 1;
         }

         if (var10000.ams != null && this.getForeground() != this.ams[this.br]) {
            this.setForeground(this.ams[this.br]);
         }

      }
   }

   public void q() {
   }

   public void setText(String var1) {
      this.ee = (boolean)(var1 != null && !var1.equals("") ? --1 : 0);
      super.setText(var1);
   }

   protected void paintComponent(Graphics var1) {
      Class111 var10000;
      label58: {
         if (this.amt != null) {
            if (this.gv == 5 >> 2 || this.gv == 5 >> 1) {
               var1.drawImage(this.amt[this.br], 3 & 4, 3 & 4, (ImageObserver)null);
               var10000 = this;
               break label58;
            }

            if (this.gv == -4 >> 2) {
               var1.drawImage(this.amt[5 >> 3], 3 ^ 3, 3 ^ 3, (ImageObserver)null);
            }
         }

         var10000 = this;
      }

      label49: {
         if (var10000.ee) {
            if (this.amr != null) {
               var1.translate(3 & 4, this.amr[this.br >= 0 ? this.br : 0]);
               Graphics var2;
               if (this.hg) {
                  int var10001 = -4 >> 2;
                  var2 = var1;
                  var1.translate(3 >> 1, 3 >> 1);
                  super.paintComponent(var1);
                  var1.translate(var10001, -4 >> 2);
               } else {
                  super.paintComponent(var1);
                  var2 = var1;
               }

               var2.translate(0, -this.amr[this.br >= 0 ? this.br : 0]);
               var10000 = this;
               break label49;
            }

            if (this.hg) {
               int var10002 = -4 >> 2;
               var10000 = this;
               var1.translate(3 & 5, 3 & 5);
               super.paintComponent(var1);
               var1.translate(var10002, -4 >> 2);
               break label49;
            }

            super.paintComponent(var1);
         }

         var10000 = this;
      }

      if (var10000.afv) {
         if (rv == null) {
            rv = Class511.p();
         }

         var1.drawImage(rv, this.getWidth() - (127 & 10), 3 >> 2, (ImageObserver)null);
      }

   }

   public boolean ft(int var1, String var2) {
      if (this.gv == var1) {
         return (boolean)(3 & 4);
      } else {
         this.fw(var2);
         this.ab(var1);
         return (boolean)(--1);
      }
   }

   public void aeu(Image[] var1) {
      this.amt = var1;
   }

   public int ae() {
      return this.gv;
   }

   public void mouseExited(MouseEvent var1) {
      this.hg = Boolean.FALSE;
      this.bb = Boolean.FALSE;
      this.cc();
   }

   public void ch(int[] var1) {
      this.amr = var1;
   }

   public Class111(String var1, int var2, Class345 var3) {
      this(var1, var2, (Color[])null, var3);
   }

   public void gb(boolean var1) {
      this.afv = var1;
   }

   public void ak(boolean var1) {
      this.lb = var1;
      this.cc();
   }

   public Class111(String var1, int var2, Color[] var3, Class345 var4) {
      this.gv = var2;
      this.amq = var4;
      this.fw(var1);
      this.ams = var3;
      if (var3 == null) {
         this.setForeground(Color.WHITE);
      }

      this.addMouseListener(this);
      this.cc();
   }

   public abstract void af(MouseEvent var1);

   public abstract void ac(MouseEvent var1, boolean var2);
}
