package com.xy;

import com.xy.game.RoleData;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.LayoutManager;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JComponent;

public abstract class Class397 extends JComponent implements MouseListener, MouseMotionListener, Class524 {
   protected boolean aeg;
   protected Image ama;
   protected Class679 asv;
   protected int dp;
   protected Class467[] asw;
   protected int gv;
   protected int gc;
   protected int gw;
   protected int fk;
   protected Class345 lo;
   protected int j;
   protected int bn;
   protected int cy;
   protected int m;

   public void y(int var1) {
      this.fk = var1;
   }

   public void aiu(Class345 var1) {
      this.lo = var1;
   }

   public void aiv(Class467[] var1) {
      this.asw = var1;
   }

   public void aiw(Class216[] var1, int var2) {
      if (this.asv == null) {
         this.aix(var1, var2);
      } else {
         this.asv.n(var1, 2 & 5);
      }
   }

   public void hf(Image var1) {
      this.ama = var1;
   }

   public void d() {
      this.y(-4 >> 2);
      this.cc();
   }

   public Class397(Class345 var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      this.lo = var1;
      this.cy = var2;
      this.gw = var3;
      this.bn = var4;
      this.m = var5;
      this.dp = var4 + var6;
      this.gc = var5 + var7;
      if (!(var1 instanceof Class621)) {
         this.bn -= --2;
         this.m -= 5 >> 1;
      }

      int var10003 = -4 >> 2;
      this.gv = this.j = -4 >> 2;
      this.fk = var10003;
      Class467[] var10001 = new Class467[var2 * var3];
      boolean var10 = true;
      this.asw = var10001;
      this.addMouseListener(this);
      this.addMouseMotionListener(this);
      this.setLayout((LayoutManager)null);
      this.setBackground(Class681.cu);
      this.setBounds(var8, var9, this.dp * var2 - var6, this.gc * var3 - var7);
   }

   public void ah(Class679 var1) {
      this.asv = var1;
   }

   protected abstract void cj(int var1, MouseEvent var2, RoleData var3);

   public void cf(int var1, int var2) {
      synchronized(this) {
         if (this.cy != var1 || this.gw != var2) {
            Class467[] var10000 = new Class467[var1 * var2];
            boolean var10002 = true;
            Class467[] var4 = var10000;
            int var5 = 5 >> 3;
            int var6 = Math.min(var4.length, this.asw.length);

            for(int var8 = var5; var8 < var6; var8 = var5) {
               int var10001 = var5;
               Class467 var9 = this.asw[var5];
               ++var5;
               var4[var10001] = var9;
            }

            int var10004 = -4 >> 2;
            int var10006 = -4 >> 2;
            int var10008 = -4 >> 2;
            this.cy = var1;
            this.gw = var2;
            this.j = var10008;
            this.gv = var10006;
            this.fk = var10004;
            this.asw = var4;
         }
      }
   }

   public void aix(Class216[] var1, int var2) {
      if (this.asv == null) {
         this.asv = new Class679(var1, this, var2);
      }
   }

   protected abstract void cn(int var1, MouseEvent var2, RoleData var3);

   public Class467[] aiy() {
      return this.asw;
   }

   protected abstract void cm(Graphics var1, RoleData var2);

   public void mouseMoved(MouseEvent var1) {
      this.ab(this.fs(var1.getX(), var1.getY()));
   }

   public int ot() {
      return this.asv != null ? this.asv.e() * this.asw.length : 0;
   }

   public void mousePressed(MouseEvent var1) {
      if (!Class280.j()) {
         if (var1.getButton() == --3) {
            this.gv = this.fs(var1.getX(), var1.getY());
            if (this.gv != -4 >> 2) {
               this.gv += this.ot();
               return;
            }
         } else if (var1.getButton() == 3 >> 1) {
            int var2;
            if ((var2 = this.fs(var1.getX(), var1.getY())) == -4 >> 2) {
               return;
            }

            var2 += this.ot();
            RoleData var3;
            if ((var3 = this.lo.vd()) == null) {
               return;
            }

            this.cj(var2, var1, var3);
         }

      }
   }

   protected void paintComponent(Graphics var1) {
      RoleData var2;
      if ((var2 = this.lo.vd()) != null) {
         this.cm(var1, var2);
      }
   }

   protected abstract void cl(RoleData var1);

   public void ab(int var1) {
      if (this.j != var1) {
         this.j = var1;
         if (var1 == -4 >> 2) {
            this.q();
         } else {
            RoleData var2;
            if ((var2 = this.lo.vd()) != null) {
               this.cl(var2);
            }
         }
      }
   }


   private int fs(int var1, int var2) {
      int var3 = var1 / this.dp;
      int var4 = var2 / this.gc;
      if (var3 < this.cy && var4 < this.gw) {
         var1 %= this.dp;
         var2 %= this.gc;
         return var1 < this.bn && var2 < this.m ? var3 + var4 * this.cy : -1;
      } else {
         return -1;
      }
   }

   public int ov() {
      return this.j;
   }

   public void mouseDragged(MouseEvent var1) {
      this.ab(this.fs(var1.getX(), var1.getY()));
   }

   public Class679 aiz() {
      return this.asv;
   }

   public void mouseReleased(MouseEvent var1) {
      if (var1.getButton() == --3) {
         if (this.gv != -4 >> 2) {
            int var2;
            if ((var2 = this.fs(var1.getX(), var1.getY())) != -4 >> 2) {
               var2 += this.ot();
            }

            if (this.gv == var2 && var2 != -4 >> 2) {
               this.gv = -4 >> 2;
               RoleData var3;
               if ((var3 = this.lo.vd()) != null) {
                  this.cn(var2, var1, var3);
               }
            } else {
               this.gv = -4 >> 2;
            }
         }
      }
   }

   public int e() {
      return this.fk;
   }

   public int mi(int var1) {
      for(int var10000 = var1 = var1; var10000 < this.asw.length; var10000 = var1) {
         if (this.asw[var1] == null || this.asw[var1].o == 0) {
            return var1;
         }

         ++var1;
      }

      return -4 >> 2;
   }

   public void cc() {
      int var1;
      for(int var10000 = var1 = 3 ^ 3; var10000 < this.asw.length; var10000 = var1) {
         if (this.asw[var1] != null) {
            this.asw[var1].g();
         }

         ++var1;
      }

   }

   public void mouseEntered(MouseEvent var1) {
      this.ab(this.fs(var1.getX(), var1.getY()));
   }

   protected abstract void q();

   public boolean au(int var1) {
      return (boolean)(3 >> 2);
   }

   public int tp() {
      return this.asv != null ? this.asv.h() * this.asw.length : this.asw.length;
   }

   public void mouseExited(MouseEvent var1) {
      this.ab(this.gv = -4 >> 2);
   }

   public void mouseClicked(MouseEvent var1) {
   }

   public int ae() {
      return 2 & 5;
   }

   public void ak(boolean var1) {
      this.aeg = var1;
   }
}
