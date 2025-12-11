package com.xy.q;

import com.xy.game.RoleData;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JComponent;

public abstract class Class25 extends JComponent implements MouseListener, MouseMotionListener, com.xy.i.Class6 {
   protected int gv;
   protected int gw;
   protected int ia;
   protected com.xy.i.Class23 abd;
   protected int gz;
   protected int z;
   protected Image lp;
   protected com.xy.w.Class14[] abe;
   protected int ha;
   protected int cb;
   protected int ae;
   protected Class30 wd;
   protected boolean bi;
   protected int ah;

   public int ia() {
      return this.abd != null ? this.abd.f() * this.abe.length : this.abe.length;
   }

   public int ky(int var1) {
      int var2;
      for (int var10000 = var2 = var1; var10000 < this.abe.length; var10000 = ++var2) {
         if (this.abe[var2] == null || this.abe[var2].l == 0) {
            return var2;
         }
      }

      return -1;
   }

   public void or(com.xy.i.Class23 var1) {
      this.abd = var1;
   }

   public void h() {
      int var1;
      for (int var10000 = var1 = 0; var10000 < this.abe.length; var10000 = ++var1) {
         if (this.abe[var1] != null) {
            this.abe[var1].e();
         }
      }
   }

   public void vo(com.xy.i.Class3[] var1, int var2) {
      if (this.abd == null) {
         this.abd = new com.xy.i.Class23(var1, this, var2);
      }
   }

   @Override
   public void mousePressed(MouseEvent var1) {
      if (!com.xy.v.Class22.h()) {
         if (var1.getButton() == 3) {
            this.gv = this.qj(var1.getX(), var1.getY());
            if (this.gv != -1) {
               this.gv = this.gv + this.dx();
               return;
            }
         } else if (var1.getButton() == 1) {
            int var2;
            if ((var2 = this.qj(var1.getX(), var1.getY())) == -1) {
               return;
            }

            var2 += this.dx();
            RoleData var3;
            if ((var3 = this.wd.yx()) == null) {
               return;
            }

            this.ao(var2, var1, var3);
         }
      }
   }

   protected abstract void ao(int var1, MouseEvent var2, RoleData var3);

   public void g(int var1) {
      if (this.ia != var1) {
         this.ia = var1;
         if (var1 == -1) {
            this.l();
         } else {
            RoleData var2;
            if ((var2 = this.wd.yx()) != null) {
               this.am(var2);
            }
         }
      }
   }

   @Override
   protected void paintComponent(Graphics var1) {
      RoleData var2;
      if ((var2 = this.wd.yx()) != null) {
         this.an(var1, var2);
      }
   }

   protected abstract void l();

   public void vp(com.xy.w.Class14[] var1) {
      this.abe = var1;
   }

   public int id() {
      return this.gw;
   }

   public void t() {
      this.n(-1);
      this.h();
   }

   @Override
   public void mouseExited(MouseEvent var1) {
      this.gv = -1;
      this.g(-1);
   }

   public int dx() {
      return this.abd != null ? this.abd.g() * this.abe.length : 0;
   }

   // $VF: synthetic method
   private int qj(int var1, int var2) {
      int var3 = var1 / this.z;
      int var4 = var2 / this.cb;
      if (var3 < this.ae && var4 < this.ha) {
         var1 %= this.z;
         var2 %= this.cb;
         return var1 < this.gz && var2 < this.ah ? var3 + var4 * this.ae : -1;
      } else {
         return -1;
      }
   }

   @Override
   public boolean at(int var1) {
      return false;
   }

   @Override
   public int il() {
      return 0;
   }

   @Override
   public void mouseEntered(MouseEvent var1) {
      this.g(this.qj(var1.getX(), var1.getY()));
   }

   protected abstract void an(Graphics var1, RoleData var2);

   public com.xy.w.Class14[] vq() {
      return this.abe;
   }

   public void be(boolean var1) {
      this.bi = var1;
   }

   public void vr(com.xy.i.Class3[] var1, int var2) {
      if (this.abd == null) {
         this.vo(var1, var2);
      } else {
         this.abd.e(var1, 0);
      }
   }

   public int lj() {
      return this.ia;
   }

   @Override
   public void mouseMoved(MouseEvent var1) {
      this.g(this.qj(var1.getX(), var1.getY()));
   }

   @Override
   public void mouseClicked(MouseEvent var1) {
   }

   @Override
   public void mouseDragged(MouseEvent var1) {
      this.g(this.qj(var1.getX(), var1.getY()));
   }

   public Class25(Class30 var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      this.wd = var1;
      this.ae = var2;
      this.ha = var3;
      this.gz = var4;
      this.ah = var5;
      this.z = var4 + var6;
      this.cb = var5 + var7;
      if (!(var1 instanceof com.xy.a.a.Class30)) {
         this.gz -= 2;
         this.ah -= 2;
      }

      this.gv = this.ia = -1;
      this.gw = -1;
      this.abe = new com.xy.w.Class14[var2 * var3];
      this.addMouseListener(this);
      this.addMouseMotionListener(this);
      this.setLayout(null);
      this.setBackground(Class49.bk);
      this.setBounds(var8, var9, this.z * var2 - var6, this.cb * var3 - var7);
   }

   public void gt(Image var1) {
      this.lp = var1;
   }

   public com.xy.i.Class23 vs() {
      return this.abd;
   }

   protected abstract void am(RoleData var1);

   @Override
   public void mouseReleased(MouseEvent var1) {
      if (var1.getButton() == 3) {
         if (this.gv != -1) {
            int var2;
            if ((var2 = this.qj(var1.getX(), var1.getY())) != -1) {
               var2 += this.dx();
            }

            if (this.gv == var2 && var2 != -1) {
               this.gv = -1;
               RoleData var3;
               if ((var3 = this.wd.yx()) != null) {
                  this.ap(var2, var1, var3);
               }
            } else {
               this.gv = -1;
            }
         }
      }
   }

   protected abstract void ap(int var1, MouseEvent var2, RoleData var3);

   public void n(int var1) {
      this.gw = var1;
   }

   public void vt(Class30 var1) {
      this.wd = var1;
   }
}
