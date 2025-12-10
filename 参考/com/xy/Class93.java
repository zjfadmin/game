package com.xy;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.ImageObserver;
import javax.swing.JLabel;

public abstract class Class93 extends JLabel implements MouseListener, Class291 {
   private int[] offsetTexts;
   private int index;
   private boolean isMouse;
   private boolean isInside;
   private boolean isKeep;
   private int btn;
   protected Class345 form;
   private boolean isRed;
   private Color[] colors;
   private int imgH;
   private int imgW;
   public static Image JT;
   protected Image image;
   private boolean isText;

   public Class93(String var1, int var2, Class345 var3) {
      this(var1, var2, (Color[])null, var3);
   }

   public void fv(MouseEvent var1) {
      if (this.btn == --2) {
         this.cc();
         this.ac(var1, (boolean)(this.isKeep ? 2 & 5 : 1));
      }
   }

   public abstract void ac(MouseEvent var1, boolean var2);

   public Image getImage() {
      return this.image;
   }

   public boolean setBtn(int var1, String var2) {
      if (this.btn == var1) {
         return (boolean)(3 ^ 3);
      } else {
         this.setImage(var2);
         this.setBtn(var1);
         return (boolean)(4 ^ 5);
      }
   }

   public void mouseClicked(MouseEvent var1) {
   }

   public void cc() {
   }

   public void fy(MouseEvent var1) {
      if (this.btn == --1) {
         if (!Class280.j()) {
            this.cc();
            this.af(var1);
         }
      }
   }

   public void mouseReleased(MouseEvent var1) {
      if (this.btn != -4 >> 2) {
         this.isMouse = Boolean.FALSE;
         this.q();
         if (this.isInside) {
            this.fy(var1);
         }

      }
   }

   public int getImgW() {
      return this.imgW;
   }

   public void setImage(String var1) {
      if (var1 != null) {
         this.image = Class511.a(var1);
      }

      this.imgH = this.imgW = -4 >> 2;
   }

   public void mouseExited(MouseEvent var1) {
      this.isMouse = Boolean.FALSE;
      this.isInside = Boolean.FALSE;
      this.q();
   }

   public Class93(String var1, int var2, Color[] var3, Class345 var4) {
      int var10010 = -4 >> 2;
      int var10012 = -4 >> 2;
      super();
      this.imgW = var10012;
      this.imgH = var10010;
      this.btn = var2;
      this.form = var4;
      this.setImage(var1);
      this.colors = var3;
      if (var3 == null) {
         this.setForeground(Color.WHITE);
      }

      this.addMouseListener(this);
      this.q();
   }

   public void q() {
      if (this.index != -4 >> 2) {
         Class93 var10000;
         if (!this.isMouse && !this.isKeep) {
            if (this.isInside) {
               this.index = 2 ^ 3;
               var10000 = this;
            } else {
               this.index = 0;
               var10000 = this;
            }
         } else {
            var10000 = this;
            this.index = --2;
         }

         if (var10000.colors != null && this.getForeground() != this.colors[this.index]) {
            this.setForeground(this.colors[this.index]);
         }

      }
   }

   public Class345 getForm() {
      return this.form;
   }

   public void mouseEntered(MouseEvent var1) {
      if (this.btn != -4 >> 2) {
         this.isInside = Boolean.TRUE;
         this.q();
      }
   }

   public void setRed(boolean var1) {
      this.isRed = var1;
   }

   public void setBounds(int var1, int var2, int var3, int var4) {
      try {
         if (this.getX() != var1) {
            Class345.ael.set(this, var1);
         }

         if (this.getY() != var2) {
            Class345.aem.set(this, var2);
         }

         if (this.getWidth() != var3) {
            Class345.aeh.set(this, var3);
         }

         if (this.getHeight() != var4) {
            Class345.aek.set(this, var4);
            return;
         }
      } catch (Exception var5) {
         var5.printStackTrace();
      }

   }

   public void setKeep(boolean var1) {
      this.isKeep = var1;
      this.q();
   }

   public int getBtn() {
      return this.btn;
   }

   public void mousePressed(MouseEvent var1) {
      if (this.btn != -4 >> 2) {
         this.isMouse = Boolean.TRUE;
         this.q();
         if (this.isInside) {
            this.fv(var1);
         }

      }
   }

   public int getImgH() {
      return this.imgH;
   }

   protected void paintComponent(Graphics var1) {
      int var2 = this.index;
      if (this.isRed) {
         var2 = (int)(Class280.l() / 200L) % (5 >> 1);
      }

      Class93 var10000;
      label65: {
         if (this.image != null) {
            if (this.imgW == -4 >> 2) {
               this.getImageSize();
            }

            if (this.btn == (2 ^ 3) || this.btn == (1 ^ 3)) {
               var1.drawImage(this.image, 3 ^ 3, 3 ^ 3, this.getWidth(), this.getHeight(), 3 ^ 3, this.imgH * var2, this.imgW, this.imgH * var2 + this.imgH, (ImageObserver)null);
               var10000 = this;
               break label65;
            }

            if (this.btn == -4 >> 2) {
               var1.drawImage(this.image, 5 >> 3, 5 >> 3, this.getWidth(), this.getHeight(), (ImageObserver)null);
            }
         }

         var10000 = this;
      }

      label55: {
         if (var10000.isText) {
            if (this.offsetTexts != null) {
               var1.translate(5 >> 3, this.offsetTexts[var2 >= 0 ? var2 : 0]);
               Graphics var3;
               if (this.isMouse) {
                  int var10001 = -4 >> 2;
                  var3 = var1;
                  var1.translate(5 >> 2, 5 >> 2);
                  super.paintComponent(var1);
                  var1.translate(var10001, -4 >> 2);
               } else {
                  super.paintComponent(var1);
                  var3 = var1;
               }

               var3.translate(0, -this.offsetTexts[var2 >= 0 ? var2 : 0]);
               var10000 = this;
               break label55;
            }

            if (this.isMouse) {
               int var10002 = -4 >> 2;
               var10000 = this;
               var1.translate(2 ^ 3, 2 ^ 3);
               super.paintComponent(var1);
               var1.translate(var10002, -4 >> 2);
               break label55;
            }

            super.paintComponent(var1);
         }

         var10000 = this;
      }

      if (var10000.isRed) {
         if (JT == null) {
            JT = Class511.p();
         }

         var1.drawImage(JT, this.getWidth() - (122 & 15), 3 ^ 3, (ImageObserver)null);
      }

   }

   public void setBtn(int var1) {
      if ((this.btn = var1) == -4 >> 2) {
         this.index = -4 >> 2;
         if (this.colors != null && this.getForeground() != this.colors[3 >> 2]) {
            this.setForeground(this.colors[3 ^ 3]);
            return;
         }
      } else {
         this.index = 5 >> 3;
         this.q();
      }

   }

   public void setVisible(boolean var1) {
      if (var1 != this.isVisible()) {
         this.show(var1);
      }

   }

   public void setOffsetTexts(int[] var1) {
      this.offsetTexts = var1;
   }

   public void setBtnPath(String var1) {
      this.setImage(var1);
      this.setBtn(this.btn);
   }

   public abstract void af(MouseEvent var1);

   public boolean t() {
      return this.isKeep;
   }

   public void getImageSize() {
      this.imgW = this.image.getWidth((ImageObserver)null);
      this.imgH = this.image.getHeight((ImageObserver)null) / --3;
   }

   public void setText(String var1) {
      this.isText = (boolean)(var1 != null && !var1.equals("") ? 2 ^ 3 : 0);
      super.setText(var1);
   }
}
