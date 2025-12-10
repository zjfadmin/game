package com.xy;

import java.awt.Color;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.ImageObserver;
import javax.swing.JComponent;

public abstract class Class13 extends JComponent implements MouseListener, Class291 {
   private boolean ku;
   protected Image kv;
   private String[] kw;
   private int do;
   public static Image kx;
   private boolean gu;
   private int[] ky;
   private int gc;
   private Color[] kz;
   private Class116 la;
   private int ay;
   private boolean lb;
   private boolean lc;
   private boolean bb;
   private int m;

   public boolean ft(int var1, String var2) {
      if (this.do == var1) {
         return (boolean)(2 & 5);
      } else {
         this.fx(var2);
         this.ab(var1);
         return (boolean)(3 & 5);
      }
   }

   protected void fu(Graphics var1) {
      int var10000;
      int var2;
      if (this.la == null || this.la.c == 0) {
         if (this.la == null) {
            var10000 = 3 >> 2;
            this.la = new Class116(2 & 5, 2 & 5, 2 & 5, 2 & 5);
            this.la.c = var1.getFontMetrics().getHeight();

            for(var2 = var10000; var10000 < this.kw.length; var10000 = var2) {
               Class116 var3 = this.la;
               int var10001 = this.la.d;
               FontMetrics var10002 = var1.getFontMetrics();
               String var10003 = this.kw[var2];
               ++var2;
               var3.d = Math.max(var10001, var10002.stringWidth(var10003));
            }

            this.la.a = (this.getWidth() - this.la.d) / (1 ^ 3);
            this.la.b = (this.getHeight() - this.la.c * this.kw.length) / (1 ^ 3);
         }

         this.la.c = var1.getFontMetrics().getHeight();
      }

      var1.setColor(this.getForeground());

      for(var10000 = var2 = 3 & 4; var10000 < this.kw.length; var10000 = var2) {
         var1.drawString(this.kw[var2], this.la.a, this.la.b + var2++ * this.la.c);
      }

   }

   public void fv(MouseEvent var1) {
      if (this.do == --2) {
         this.ac(var1, (boolean)(this.ku ? 3 >> 2 : 1));
      }
   }

   public void mouseEntered(MouseEvent var1) {
      if (this.do != -4 >> 2) {
         this.lb = Boolean.TRUE;
         this.q();
      }
   }

   protected void paintComponent(Graphics var1) {
      Class13 var10000;
      label52: {
         if (this.kv != null) {
            if (this.m == -4 >> 2) {
               this.cc();
            }

            if (this.do == 3 >> 1 || this.do == 5 >> 1) {
               var1.drawImage(this.kv, 5 >> 3, 5 >> 3, this.getWidth(), this.getHeight(), 5 >> 3, this.gc * this.ay, this.m, this.gc * this.ay + this.gc, (ImageObserver)null);
               var10000 = this;
               break label52;
            }

            if (this.do == -4 >> 2) {
               var1.drawImage(this.kv, 3 ^ 3, 3 ^ 3, this.getWidth(), this.getHeight(), (ImageObserver)null);
            }
         }

         var10000 = this;
      }

      label42: {
         if (var10000.bb) {
            if (this.ky != null) {
               var1.translate(this.ky[this.ay], 3 ^ 3);
               Graphics var2;
               if (this.gu) {
                  int var10001 = -4 >> 2;
                  var2 = var1;
                  var1.translate(2 ^ 3, 2 ^ 3);
                  this.fz(var1);
                  var1.translate(var10001, -4 >> 2);
               } else {
                  this.fz(var1);
                  var2 = var1;
               }

               var2.translate(-this.ky[this.ay], 3 ^ 3);
               var10000 = this;
               break label42;
            }

            if (this.gu) {
               int var10002 = -4 >> 2;
               var10000 = this;
               var1.translate(5 >> 2, 5 >> 2);
               this.fz(var1);
               var1.translate(var10002, -4 >> 2);
               break label42;
            }

            this.fz(var1);
         }

         var10000 = this;
      }

      if (var10000.lc) {
         if (kx == null) {
            kx = Class511.p();
         }

         var1.drawImage(kx, this.getWidth() - (11 & 126), 2 & 5, (ImageObserver)null);
      }

   }

   public Class13(String var1, int var2) {
      this(var1, var2, (Color[])null);
   }

   public int ae() {
      return this.do;
   }

   public void fw(String var1) {
      this.fx(var1);
      this.ab(this.do);
   }

   public void fx(String var1) {
      if (var1 != null) {
         this.kv = Class511.a(var1);
      }

      this.gc = this.m = -4 >> 2;
   }

   public void cc() {
      this.m = this.kv.getWidth((ImageObserver)null);
      this.gc = this.kv.getHeight((ImageObserver)null) / --3;
   }

   public void fy(MouseEvent var1) {
      if (this.do == (4 ^ 5)) {
         if (!Class280.j()) {
            this.af(var1);
         }
      }
   }

   public abstract void af(MouseEvent var1);

   public void ab(int var1) {
      if ((this.do = var1) == -4 >> 2) {
         this.ay = -4 >> 2;
         if (this.kz != null && this.getForeground() != this.kz[3 ^ 3]) {
            this.setForeground(this.kz[3 & 4]);
            return;
         }
      } else {
         this.ay = 2 & 5;
         this.q();
      }

   }

   public void ad(Class116 var1) {
      this.la = var1;
   }

   public void ch(int[] var1) {
      this.ky = var1;
   }

   public Class13(String var1, int var2, Color[] var3) {
      int var10008 = 3 & 4;
      int var10010 = -4 >> 2;
      int var10012 = -4 >> 2;
      super();
      this.m = var10012;
      this.gc = var10010;
      this.setOpaque((boolean)var10008);
      this.do = var2;
      this.fx(var1);
      this.kz = var3;
      if (var3 == null) {
         this.setForeground(Color.WHITE);
      }

      this.addMouseListener(this);
      this.q();
   }

   protected void fz(Graphics var1) {
      if (var1.getFont() instanceof Class191) {
         Graphics2D var2;
         Graphics2D var10000 = var2 = (Graphics2D)var1;
         Object var7 = var10000.getRenderingHint(RenderingHints.KEY_RENDERING);
         Object var4 = var10000.getRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING);
         Object var5 = var10000.getRenderingHint(RenderingHints.KEY_FRACTIONALMETRICS);
         Object var6 = var10000.getRenderingHint(RenderingHints.KEY_STROKE_CONTROL);
         Object var3 = var10000.getRenderingHint(RenderingHints.KEY_ANTIALIASING);
         Object var8;
         if (var7 != RenderingHints.VALUE_RENDER_QUALITY) {
            var8 = var4;
            var2.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
         } else {
            var7 = null;
            var8 = var4;
         }

         if (var8 != RenderingHints.VALUE_TEXT_ANTIALIAS_LCD_HRGB) {
            var8 = var5;
            var2.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_LCD_HRGB);
         } else {
            var4 = null;
            var8 = var5;
         }

         if (var8 != RenderingHints.VALUE_FRACTIONALMETRICS_ON) {
            var8 = var6;
            var2.setRenderingHint(RenderingHints.KEY_FRACTIONALMETRICS, RenderingHints.VALUE_FRACTIONALMETRICS_ON);
         } else {
            var5 = null;
            var8 = var6;
         }

         if (var8 != RenderingHints.VALUE_STROKE_DEFAULT) {
            var8 = var3;
            var2.setRenderingHint(RenderingHints.KEY_STROKE_CONTROL, RenderingHints.VALUE_STROKE_DEFAULT);
         } else {
            var6 = null;
            var8 = var3;
         }

         Class13 var9;
         if (var8 != RenderingHints.VALUE_ANTIALIAS_ON) {
            var9 = this;
            var2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
         } else {
            var3 = null;
            var9 = this;
         }

         var9.fu(var1);
         if (var7 != null) {
            var2.setRenderingHint(RenderingHints.KEY_RENDERING, var7);
         }

         if (var4 != null) {
            var2.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, var4);
         }

         if (var5 != null) {
            var2.setRenderingHint(RenderingHints.KEY_FRACTIONALMETRICS, var5);
         }

         if (var6 != null) {
            var2.setRenderingHint(RenderingHints.KEY_STROKE_CONTROL, var6);
         }

         if (var3 != null) {
            var2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, var3);
            return;
         }
      } else {
         this.fu(var1);
      }

   }

   public void mousePressed(MouseEvent var1) {
      if (this.do != -4 >> 2) {
         this.gu = Boolean.TRUE;
         this.q();
         if (this.lb) {
            this.fv(var1);
         }

      }
   }

   public abstract void ac(MouseEvent var1, boolean var2);

   public Image ga() {
      return this.kv;
   }

   public void mouseExited(MouseEvent var1) {
      this.gu = Boolean.FALSE;
      this.lb = Boolean.FALSE;
      this.q();
   }

   public void gb(boolean var1) {
      this.ku = var1;
      this.q();
   }

   public void mouseClicked(MouseEvent var1) {
   }

   public void mouseReleased(MouseEvent var1) {
      if (this.do != -4 >> 2) {
         this.gu = Boolean.FALSE;
         this.q();
         if (this.lb) {
            this.fy(var1);
         }

      }
   }

   public void df(String[] var1) {
      this.bb = (boolean)((this.kw = var1) != null ? --1 : 0);
   }

   public void ak(boolean var1) {
      this.lc = var1;
   }

   public void q() {
      if (this.ay != -4 >> 2) {
         Class13 var10000;
         if (!this.gu && !this.ku) {
            if (this.lb) {
               this.ay = 4 ^ 5;
               var10000 = this;
            } else {
               this.ay = 0;
               var10000 = this;
            }
         } else {
            var10000 = this;
            this.ay = 5 >> 1;
         }

         if (var10000.kz != null && this.getForeground() != this.kz[this.ay]) {
            this.setForeground(this.kz[this.ay]);
         }

      }
   }
}
