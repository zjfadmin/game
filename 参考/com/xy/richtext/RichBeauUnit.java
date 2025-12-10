package com.xy.richtext;

import java.awt.Image;
import java.awt.image.ImageObserver;

public class RichBeauUnit {
   private transient boolean isM;
   private int bh;
   private transient Image image;

   public RichBeauUnit() {
   }

   public void setImage(Image var1) {
      this.image = var1;
   }

   public int getHeight() {
      return this.image.getHeight((ImageObserver)null);
   }

   public RichBeauUnit(int var1) {
      if (var1 < 0 || var1 > (79 & 57)) {
         var1 = 0;
      }

      this.bh = var1;
   }

   public Image getImage() {
      return this.image;
   }

   public int getBh() {
      return this.bh;
   }

   public boolean isM() {
      return this.isM;
   }

   public void setBh(int var1) {
      this.bh = var1;
   }

   public void setM(boolean var1) {
      this.isM = var1;
   }

   public int getWidth() {
      return this.image.getWidth((ImageObserver)null);
   }
}
