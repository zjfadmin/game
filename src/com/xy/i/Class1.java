package com.xy.i;

import com.xy.q.Class30;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JLabel;

public abstract class Class1 extends JLabel implements MouseListener, Class15 {
   private int imgW = -1;
   private int[] offsetTexts;
   public static Image JT;
   private boolean isMouse;
   private int btn;
   private boolean isInside;
   private boolean isText;
   private int imgH = -1;
   private int index;
   protected Image image;
   private boolean isRed;
   protected Class30 form;
   private boolean isKeep;
   private Color[] colors;

   public void l() {
   }

   public void je(MouseEvent var1) {
      if (this.btn == 1) {
         if (!com.xy.v.Class22.h()) {
            this.l();
            this.cw(var1);
         }
      }
   }

   public void setKeep(boolean var1) {
      this.isKeep = var1;
      this.t();
   }

   @Override
   protected void paintComponent(Graphics var1) {
      Class1 var10000;
      label64: {
         if (this.image != null) {
            if (this.imgW == -1) {
               this.getImageSize();
            }

            if (this.btn == 1 || this.btn == 2) {
               var1.drawImage(
                  this.image, 0, 0, this.getWidth(), this.getHeight(), 0, this.imgH * this.index, this.imgW, this.imgH * this.index + this.imgH, null
               );
               var10000 = this;
               break label64;
            }

            if (this.btn == -1) {
               var1.drawImage(this.image, 0, 0, this.getWidth(), this.getHeight(), null);
            }
         }

         var10000 = this;
      }

      label54: {
         if (var10000.isText) {
            if (this.offsetTexts != null) {
               var1.translate(0, this.offsetTexts[this.index >= 0 ? this.index : 0]);
               Graphics var3;
               if (this.isMouse) {
                  var3 = var1;
                  var1.translate(1, 1);
                  super.paintComponent(var1);
                  var1.translate(-1, -1);
               } else {
                  super.paintComponent(var1);
                  var3 = var1;
               }

               var3.translate(0, -this.offsetTexts[this.index >= 0 ? this.index : 0]);
               var10000 = this;
               break label54;
            }

            if (this.isMouse) {
               var10000 = this;
               var1.translate(1, 1);
               super.paintComponent(var1);
               var1.translate(-1, -1);
               break label54;
            }

            super.paintComponent(var1);
         }

         var10000 = this;
      }

      if (var10000.isRed) {
         if (JT == null) {
            JT = com.xy.w.Class16.i();
         }

         var1.drawImage(JT, this.getWidth() - 10, 0, null);
      }
   }

   public void t() {
      if (this.index != -1) {
         Class1 var10000;
         if (this.isMouse || this.isKeep) {
            var10000 = this;
            this.index = 2;
         } else if (this.isInside) {
            this.index = 1;
            var10000 = this;
         } else {
            this.index = 0;
            var10000 = this;
         }

         if (var10000.colors != null && this.getForeground() != this.colors[this.index]) {
            this.setForeground(this.colors[this.index]);
         }
      }
   }

   public void setImage(String var1) {
      if (var1 != null) {
         this.image = com.xy.w.Class16.c(var1);
      }

      this.imgH = this.imgW = -1;
   }

   public void setRed(boolean var1) {
      this.isRed = var1;
   }

   public boolean ah() {
      return this.isKeep;
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
      if (this.btn != -1) {
         this.isMouse = Boolean.FALSE;
         this.t();
         if (this.isInside) {
            this.je(var1);
         }
      }
   }

   public void setBtnPath(String var1) {
      this.setImage(var1);
      this.setBtn(this.btn);
   }

   public int getBtn() {
      return this.btn;
   }

   public Class30 getForm() {
      return this.form;
   }

   @Override
   public abstract void fe(MouseEvent var1, boolean var2);

   @Override
   public void mouseExited(MouseEvent var1) {
      this.isMouse = Boolean.FALSE;
      this.isInside = Boolean.FALSE;
      this.t();
   }

   public void getImageSize() {
      this.imgW = this.image.getWidth(null);
      this.imgH = this.image.getHeight(null) / 3;
   }

   public Class1(String var1, int var2, Class30 var3) {
      this(var1, var2, null, var3);
   }

   public void setOffsetTexts(int[] var1) {
      this.offsetTexts = var1;
   }

   @Override
   public void setBounds(int var1, int var2, int var3, int var4) {
      try {
         if (this.getX() != var1) {
            Class30.agd.set(this, var1);
         }

         if (this.getY() != var2) {
            Class30.aga.set(this, var2);
         }

         if (this.getWidth() != var3) {
            Class30.agk.set(this, var3);
         }

         if (this.getHeight() != var4) {
            Class30.afy.set(this, var4);
            return;
         }
      } catch (Exception var6) {
         var6.printStackTrace();
      }
   }

   public Class1(String var1, int var2, Color[] var3, Class30 var4) {
      this.btn = var2;
      this.form = var4;
      this.setImage(var1);
      this.colors = var3;
      if (var3 == null) {
         this.setForeground(Color.WHITE);
      }

      this.addMouseListener(this);
      this.t();
   }

   @Override
   public void mousePressed(MouseEvent var1) {
      if (this.btn != -1) {
         this.isMouse = Boolean.TRUE;
         this.t();
         if (this.isInside) {
            this.fi(var1);
         }
      }
   }

   @Override
   public void setVisible(boolean var1) {
      if (var1 != this.isVisible()) {
         this.show(var1);
      }
   }

   @Override
   public abstract void cw(MouseEvent var1);

   public int getImgW() {
      return this.imgW;
   }

   public int getImgH() {
      return this.imgH;
   }

   public void setBtn(int var1) {
      if ((this.btn = var1) == -1) {
         this.index = -1;
         if (this.colors != null && this.getForeground() != this.colors[0]) {
            this.setForeground(this.colors[0]);
            return;
         }
      } else {
         this.index = 0;
         this.t();
      }
   }

   @Override
   public void mouseClicked(MouseEvent var1) {
   }

   @Override
   public void setText(String var1) {
      this.isText = var1 != null && !var1.equals("");
      super.setText(var1);
   }

   public Image getImage() {
      return this.image;
   }

   @Override
   public void mouseEntered(MouseEvent var1) {
      if (this.btn != -1) {
         this.isInside = Boolean.TRUE;
         this.t();
      }
   }

   public void fi(MouseEvent var1) {
      if (this.btn == 2) {
         this.l();
         this.fe(var1, !this.isKeep);
      }
   }

   public boolean setBtn(int var1, String var2) {
      if (this.btn == var1) {
         return false;
      } else {
         this.setImage(var2);
         this.setBtn(var1);
         return true;
      }
   }
}
