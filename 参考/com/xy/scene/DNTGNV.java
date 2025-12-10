package com.xy.scene;

import com.xy.ho;
import com.xy.lz;
import com.xy.text.GameView;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ImageObserver;

public class DNTGNV {
   private String msg2;
   private String msg1;
   private DNTGNVRole[] TTNV;
   private DNTGNVRole[] HGSNV;
   private int num;
   private Image image;
   private int ci;

   public void a(int var1, String var2) {
      DNTGNVRole[] var5 = var1 == 0 ? this.TTNV : this.HGSNV;
      String[] var6 = var2.split("&");

      int var10000;
      int var3;
      for(var10000 = var3 = 3 ^ 3; var10000 < var6.length && var3 < --5; var10000 = var3) {
         String[] var4 = var6[var3].split("\\$");
         if (var5[var3] == null) {
            var5[var3] = new DNTGNVRole(var4[3 & 4], var4[3 & 5]);
         } else {
            var5[var3].a(var4[3 & 4], var4[--1]);
         }

         ++var3;
      }

      for(var10000 = var3 = var6.length; var10000 < 5; var10000 = var3) {
         var5[var3++] = null;
      }

   }

   public int getCi() {
      return this.ci;
   }

   public void b(Graphics var1, GameView var2) {
      int var5 = var2.screenData.Screen_x - this.image.getWidth((ImageObserver)null);
      var1.drawImage(this.image, var5, 11235 & 21662, (ImageObserver)null);
      var5 += 40;
      var1.setColor(Color.white);
      var1.setFont(lz.ab);
      var1.drawString(this.msg1, var5, 11255 & 21742);
      var1.drawString(this.msg2, var5 + (110 & 125), 22766 & 10231);
      int var3 = 3 >> 2;

      int var10000;
      DNTGNVRole var4;
      for(var10000 = var3; var10000 < this.TTNV.length && (var4 = this.TTNV[var3]) != null; var10000 = var3) {
         var1.drawString(var4.getName(), var5, (31154 & 1871) + (87 & 61) * var3);
         var1.drawString(var4.getSize(), var5 + (124 & 111), (21474 & 11551) + (53 & 95) * var3++);
      }

      for(var10000 = var3 = 0; var10000 < this.HGSNV.length; var10000 = var3) {
         if ((var4 = this.HGSNV[var3]) == null) {
            return;
         }

         var1.drawString(var4.getName(), var5, (18301 & 14847) + (23 & 125) * var3);
         var1.drawString(var4.getSize(), var5 + (108 & 127), (7167 & 25981) + (117 & 31) * var3++);
      }

   }

   public void setNum(int var1) {
      this.num = var1;
   }

   public DNTGNVRole[] getHGSNV() {
      return this.HGSNV;
   }

   public void setCi(int var1) {
      this.ci = var1;
   }

   public int getNum() {
      return this.num;
   }

   public void c(int var1, int var2, int var3) {
      this.num = var2;
      this.ci = var3;
      DNTGNV var10000;
      if (var3 == 0) {
         this.msg1 = var1 == 0 ? "天庭" : "花果山";
         var10000 = this;
      } else {
         StringBuilder var10003 = new StringBuilder;
         String var10001;
         if (var1 == 0) {
            var10003.<init>("天庭   第");
            var10001 = var10003.append(var3).append("名").toString();
         } else {
            var10003.<init>("花果山   第");
            var10001 = var10003.append(var3).append("名").toString();
         }

         this.msg1 = var10001;
         var10000 = this;
      }

      var10000.msg2 = String.valueOf(var2);
   }

   public void setImage(Image var1) {
      this.image = var1;
   }

   public DNTGNV() {
      int var10001 = --5;
      int var10007 = 3 & 4;
      int var10009 = 3 & 4;
      super();
      this.num = var10009;
      this.ci = var10007;
      this.msg1 = "";
      this.msg2 = "";
      DNTGNVRole[] var1 = new DNTGNVRole[var10001];
      boolean var10003 = true;
      this.TTNV = var1;
      var1 = new DNTGNVRole[--5];
      var10003 = true;
      this.HGSNV = var1;
      this.image = ho.a("sc/c/77");
   }

   public DNTGNVRole[] getTTNV() {
      return this.TTNV;
   }

   public Image getImage() {
      return this.image;
   }

   public void setHGSNV(DNTGNVRole[] var1) {
      this.HGSNV = var1;
   }

   public void setTTNV(DNTGNVRole[] var1) {
      this.TTNV = var1;
   }
}
