package com.xy.i;

import com.xy.v.Class32;
import java.awt.Color;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JComponent;

public abstract class Class8 extends JComponent implements MouseListener, Class15 {
   private boolean acq;
   private int gv;
   private boolean acr;
   protected Image aj;
   private boolean ak;
   private int gz = -1;
   private Class32 acs;
   private String[] act;
   private int cn;
   private int ha = -1;
   public static Image acu;
   private int[] acv;
   private boolean il;
   private Color[] acw;
   private boolean cf;

   public void rm(boolean var1) {
      this.il = var1;
   }

   public void dp(String var1) {
      this.dq(var1);
      this.n(this.cn);
   }

   protected void dj(Graphics var1) {
      if (var1.getFont() instanceof com.xy.q.Class0) {
         Graphics2D var2;
         Graphics2D var10000 = var2 = (Graphics2D)var1;
         Object var3 = var10000.getRenderingHint(RenderingHints.KEY_RENDERING);
         Object var4 = var10000.getRenderingHint(RenderingHints.KEY_ANTIALIASING);
         Object var5;
         if (var3 != RenderingHints.VALUE_RENDER_QUALITY) {
            var5 = var4;
            var2.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
         } else {
            var3 = null;
            var5 = var4;
         }

         if (var5 != RenderingHints.VALUE_ANTIALIAS_ON) {
            var2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
         } else {
            var4 = null;
         }

         this.dn(var1);
         if (var3 != null) {
            var2.setRenderingHint(RenderingHints.KEY_RENDERING, var3);
         }

         if (var4 != null) {
            var2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, var4);
            return;
         }
      } else {
         this.dn(var1);
      }
   }

   public void l() {
      if (this.gv != -1) {
         Class8 var10000;
         if (this.acq || this.cf) {
            var10000 = this;
            this.gv = 2;
         } else if (this.ak) {
            this.gv = 1;
            var10000 = this;
         } else {
            this.gv = 0;
            var10000 = this;
         }

         if (var10000.acw != null && this.getForeground() != this.acw[this.gv]) {
            this.setForeground(this.acw[this.gv]);
         }
      }
   }

   public void je(MouseEvent var1) {
      if (this.cn == 2) {
         this.fe(var1, !this.cf);
      }
   }

   public void be(boolean var1) {
      this.cf = var1;
      this.l();
   }

   @Override
   public void mouseClicked(MouseEvent var1) {
   }

   @Override
   public void mouseEntered(MouseEvent var1) {
      if (this.cn != -1) {
         this.ak = Boolean.TRUE;
         this.l();
      }
   }

   protected void dn(Graphics var1) {
      if (this.acs == null || this.acs.c == 0) {
         if (this.acs == null) {
            int var10000 = 0;
            this.acs = new Class32(0, 0, 0, 0);
            this.acs.c = var1.getFontMetrics().getHeight();

            for (int var2 = 0; var10000 < this.act.length; var10000 = var2) {
               Class32 var4 = this.acs;
               int var10001 = this.acs.b;
               FontMetrics var10002 = var1.getFontMetrics();
               String var10003 = this.act[var2];
               var2++;
               var4.b = Math.max(var10001, var10002.stringWidth(var10003));
            }

            this.acs.d = (this.getWidth() - this.acs.b) / 2;
            this.acs.a = (this.getHeight() - this.acs.c * this.act.length) / 2;
         }

         this.acs.c = var1.getFontMetrics().getHeight();
      }

      var1.setColor(this.getForeground());

      int var3;
      for (int var5 = var3 = 0; var5 < this.act.length; var5 = var3) {
         var1.drawString(this.act[var3], this.acs.d, this.acs.a + var3++ * this.acs.c);
      }
   }

   @Override
   public void mouseExited(MouseEvent var1) {
      this.acq = Boolean.FALSE;
      this.ak = Boolean.FALSE;
      this.l();
   }

   public void ne(int[] var1) {
      this.acv = var1;
   }

   public boolean rn(int var1, String var2) {
      if (this.cn == var1) {
         return false;
      } else {
         this.dq(var2);
         this.n(var1);
         return true;
      }
   }

   public Class8(String var1, int var2) {
      this(var1, var2, null);
   }

   public void tg(String[] var1) {
      this.act = var1;
      this.acr = var1 != null;
   }

   @Override
   public abstract void cw(MouseEvent var1);

   public void n(int var1) {
      if ((this.cn = var1) == -1) {
         this.gv = -1;
         if (this.acw != null && this.getForeground() != this.acw[0]) {
            this.setForeground(this.acw[0]);
            return;
         }
      } else {
         this.gv = 0;
         this.l();
      }
   }

   @Override
   public void mousePressed(MouseEvent var1) {
      if (this.cn != -1) {
         this.acq = Boolean.TRUE;
         this.l();
         if (this.ak) {
            this.je(var1);
         }
      }
   }

   public void wp(Class32 var1) {
      this.acs = var1;
   }

   public Class8(String var1, int var2, Color[] var3) {
      this.setOpaque(false);
      this.cn = var2;
      this.dq(var1);
      this.acw = var3;
      if (var3 == null) {
         this.setForeground(Color.WHITE);
      }

      this.addMouseListener(this);
      this.l();
   }

   @Override
   public abstract void fe(MouseEvent var1, boolean var2);

   public void dq(String var1) {
      if (var1 != null) {
         this.aj = com.xy.w.Class16.c(var1);
      }

      this.ha = this.gz = -1;
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
      if (this.cn != -1) {
         this.acq = Boolean.FALSE;
         this.l();
         if (this.ak) {
            this.fi(var1);
         }
      }
   }

   public void fi(MouseEvent var1) {
      if (this.cn == 1) {
         if (!com.xy.v.Class22.h()) {
            this.cw(var1);
         }
      }
   }

   public int il() {
      return this.cn;
   }

   @Override
   protected void paintComponent(Graphics var1) {
      Class8 var10000;
      label54: {
         if (this.aj != null) {
            if (this.gz == -1) {
               this.t();
            }

            if (this.cn == 1 || this.cn == 2) {
               var1.drawImage(this.aj, 0, 0, this.getWidth(), this.getHeight(), 0, this.ha * this.gv, this.gz, this.ha * this.gv + this.ha, null);
               var10000 = this;
               break label54;
            }

            if (this.cn == -1) {
               var1.drawImage(this.aj, 0, 0, this.getWidth(), this.getHeight(), null);
            }
         }

         var10000 = this;
      }

      label44: {
         if (var10000.acr) {
            if (this.acv != null) {
               var1.translate(this.acv[this.gv], 0);
               Graphics var3;
               if (this.acq) {
                  var3 = var1;
                  var1.translate(1, 1);
                  this.dj(var1);
                  var1.translate(-1, -1);
               } else {
                  this.dj(var1);
                  var3 = var1;
               }

               var3.translate(-this.acv[this.gv], 0);
               var10000 = this;
               break label44;
            }

            if (this.acq) {
               var10000 = this;
               var1.translate(1, 1);
               this.dj(var1);
               var1.translate(-1, -1);
               break label44;
            }

            this.dj(var1);
         }

         var10000 = this;
      }

      if (var10000.il) {
         if (acu == null) {
            acu = com.xy.w.Class16.i();
         }

         var1.drawImage(acu, this.getWidth() - 10, 0, null);
      }
   }

   public void t() {
      this.gz = this.aj.getWidth(null);
      this.ha = this.aj.getHeight(null) / 3;
   }
}
