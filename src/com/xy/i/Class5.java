package com.xy.i;

import com.xy.q.Class30;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JLabel;

public abstract class Class5 extends JLabel implements MouseListener, Class15 {
   private boolean ln;
   private boolean ak;
   private boolean al;
   private int z;
   protected Image[] vz;
   private Color[] wa;
   private boolean wb;
   private int[] wc;
   public static Image gl;
   protected Class30 wd;
   private boolean bi;
   private int ah;

   @Override
   public void mouseExited(MouseEvent var1) {
      this.wb = Boolean.FALSE;
      this.al = Boolean.FALSE;
      this.t();
   }

   public Class5(String var1, int var2, Class30 var3) {
      this(var1, var2, null, var3);
   }

   public void ne(int[] var1) {
      this.wc = var1;
   }

   public void rm(boolean var1) {
      this.ak = var1;
   }

   public void dp(String var1) {
   }

   public void be(boolean var1) {
      this.bi = var1;
      this.t();
   }

   public void je(MouseEvent var1) {
      if (this.ah == 1) {
         if (!com.xy.v.Class22.h()) {
            this.l();
            this.cw(var1);
         }
      }
   }

   public void l() {
   }

   public int il() {
      return this.ah;
   }

   public boolean rn(int var1, String var2) {
      if (this.ah == var1) {
         return false;
      } else {
         this.dp(var2);
         this.n(var1);
         return true;
      }
   }

   @Override
   protected void paintComponent(Graphics var1) {
      Class5 var10000;
      label60: {
         if (this.vz != null) {
            if (this.ah == 1 || this.ah == 2) {
               var1.drawImage(this.vz[this.z], 0, 0, null);
               var10000 = this;
               break label60;
            }

            if (this.ah == -1) {
               var1.drawImage(this.vz[0], 0, 0, null);
            }
         }

         var10000 = this;
      }

      label51: {
         if (var10000.ln) {
            if (this.wc != null) {
               var1.translate(0, this.wc[this.z >= 0 ? this.z : 0]);
               Graphics var3;
               if (this.wb) {
                  var3 = var1;
                  var1.translate(1, 1);
                  super.paintComponent(var1);
                  var1.translate(-1, -1);
               } else {
                  super.paintComponent(var1);
                  var3 = var1;
               }

               var3.translate(0, -this.wc[this.z >= 0 ? this.z : 0]);
               var10000 = this;
               break label51;
            }

            if (this.wb) {
               var10000 = this;
               var1.translate(1, 1);
               super.paintComponent(var1);
               var1.translate(-1, -1);
               break label51;
            }

            super.paintComponent(var1);
         }

         var10000 = this;
      }

      if (var10000.ak) {
         if (gl == null) {
            gl = com.xy.w.Class16.i();
         }

         var1.drawImage(gl, this.getWidth() - 10, 0, null);
      }
   }

   @Override
   public void mousePressed(MouseEvent var1) {
      if (this.ah != -1) {
         this.wb = Boolean.TRUE;
         this.t();
         if (this.al) {
            this.fi(var1);
         }
      }
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
      if (this.ah != -1) {
         this.wb = Boolean.FALSE;
         this.t();
         if (this.al) {
            this.je(var1);
         }
      }
   }

   @Override
   public abstract void cw(MouseEvent var1);

   public void fi(MouseEvent var1) {
      if (this.ah == 2) {
         this.l();
         this.fe(var1, !this.bi);
      }
   }

   public Class5(String var1, int var2, Color[] var3, Class30 var4) {
      this.ah = var2;
      this.wd = var4;
      this.dp(var1);
      this.wa = var3;
      if (var3 == null) {
         this.setForeground(Color.WHITE);
      }

      this.addMouseListener(this);
      this.t();
   }

   public void t() {
      if (this.z != -1) {
         Class5 var10000;
         if (this.wb || this.bi) {
            var10000 = this;
            this.z = 2;
         } else if (this.al) {
            this.z = 1;
            var10000 = this;
         } else {
            this.z = 0;
            var10000 = this;
         }

         if (var10000.wa != null && this.getForeground() != this.wa[this.z]) {
            this.setForeground(this.wa[this.z]);
         }
      }
   }

   @Override
   public void mouseEntered(MouseEvent var1) {
      if (this.ah != -1) {
         this.al = Boolean.TRUE;
         this.t();
      }
   }

   @Override
   public void setText(String var1) {
      this.ln = var1 != null && !var1.equals("");
      super.setText(var1);
   }

   @Override
   public abstract void fe(MouseEvent var1, boolean var2);

   public void dq(String var1) {
      this.dp(var1);
      this.n(this.ah);
   }

   public void ro(Image[] var1) {
      this.vz = var1;
   }

   public void n(int var1) {
      if ((this.ah = var1) == -1) {
         this.z = -1;
         if (this.wa != null && this.getForeground() != this.wa[0]) {
            this.setForeground(this.wa[0]);
            return;
         }
      } else {
         this.z = 0;
         this.t();
      }
   }

   @Override
   public void mouseClicked(MouseEvent var1) {
   }
}
