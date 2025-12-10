package com.xy.scene;

import com.xy.cX;
import com.xy.cY;
import com.xy.dx;
import com.xy.ho;
import com.xy.lz;
import com.xy.z;
import com.xy.richtext.RichLabel;
import com.xy.text.ScreenData;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ImageObserver;

public class BangTZ {
   private Image head2;
   private RichLabel Y_N;
   private Image head1;
   private int time;
   private Image[] Y_FS;
   private Image Y_Z;
   private Image Z_Z;
   private Image[] Z_FS;
   private RichLabel Z_N;
   private z TZ;
   private RichLabel Y_V;
   private Image kuan;
   private RichLabel Z_V;

   public String getLvl(int var1) {
      StringBuffer var2;
      (var2 = new StringBuffer()).append("#Y");
      int var3 = cX.g(var1);
      StringBuffer var10000;
      if (var3 <= --3) {
         var2.append(var3);
         var10000 = var2;
         var2.append("转");
      } else {
         var10000 = var2;
         var2.append("飞升");
      }

      var10000.append("#R");
      var2.append(cX.d(var1));
      var2.append("#G级");
      return var2.toString();
   }

   public BangTZ(String[] var1) {
      StringBuffer var8 = null;
      StringBuffer var7 = null;
      StringBuffer var4 = null;
      StringBuffer var5 = null;
      this.head1 = ho.a("sc/c/56");
      this.head2 = ho.a("sc/c/57");
      this.kuan = ho.a("sc/c/58");
      String[] var6 = var1[2 ^ 3].split("=");

      String[] var2;
      int var3;
      StringBuffer var9;
      String var10;
      int var10000;
      Image[] var10001;
      boolean var10003;
      for(var10000 = var3 = 3 & 4; var10000 < var6.length; var10000 = var3) {
         var2 = var6[var3].split("&");
         if (var3 == 0) {
            this.Z_Z = ho.a(cY.l(var2[2 ^ 3]));
            var9 = var8;
         } else {
            if (this.Z_FS == null) {
               var10001 = new Image[var6.length - (3 >> 1)];
               var10003 = true;
               this.Z_FS = var10001;
            }

            this.Z_FS[var3 - (4 ^ 5)] = ho.a(cY.l(var2[--1]));
            var9 = var8;
         }

         if (var9 == null) {
            var8 = new StringBuffer();
            var9 = var7;
         } else {
            var8.append("#r");
            var9 = var7;
         }

         if (var9 == null) {
            var7 = new StringBuffer();
            var9 = var8;
         } else {
            var7.append("#r");
            var9 = var8;
         }

         var9.append("#G" + var2[2 & 5]);
         var10 = var2[--2];
         ++var3;
         var7.append(this.getLvl(Integer.parseInt(var10)));
      }

      var6 = var1[5 >> 1].split("=");

      for(var10000 = var3 = 2 & 5; var10000 < var6.length; var10000 = var3) {
         var2 = var6[var3].split("&");
         if (var3 == 0) {
            this.Y_Z = ho.a(cY.l(var2[3 & 5]));
            var9 = var4;
         } else {
            if (this.Y_FS == null) {
               var10001 = new Image[var6.length - (2 ^ 3)];
               var10003 = true;
               this.Y_FS = var10001;
            }

            this.Y_FS[var3 - (2 ^ 3)] = ho.a(cY.l(var2[3 >> 1]));
            var9 = var4;
         }

         if (var9 == null) {
            var4 = new StringBuffer();
            var9 = var5;
         } else {
            var4.append("#r");
            var9 = var5;
         }

         if (var9 == null) {
            var5 = new StringBuffer();
            var9 = var4;
         } else {
            var5.append("#r");
            var9 = var4;
         }

         var9.append("#G" + var2[5 >> 3]);
         var10 = var2[--2];
         ++var3;
         var5.append(this.getLvl(Integer.parseInt(var10)));
      }

      if (var8 != null) {
         this.Z_N = new RichLabel(var8.toString(), lz.bm, 127 & 120);
      }

      if (var7 != null) {
         this.Z_V = new RichLabel(var7.toString(), lz.bm, 123 & 124);
      }

      if (var4 != null) {
         this.Y_N = new RichLabel(var4.toString(), lz.bm, 127 & 120);
      }

      if (var5 != null) {
         this.Y_V = new RichLabel(var5.toString(), lz.bm, 122 & 125);
      }

   }

   public boolean a(Graphics var1, BangFightScene var2) {
      ScreenData var6 = var2.getGameView().screenData;
      this.time += 63 & 77;
      var1.drawImage(this.kuan, var6.Screen_x - (30112 & 3039), 123 & 111, 29127 & 3900, 2743 & 30174, (ImageObserver)null);
      var1.drawImage(this.kuan, 54 & 127, var6.Screen_y - (2943 & 30134), 27021 & 6006, 13047 & 19870, (ImageObserver)null);
      int var4 = var6.Screen_x - (26495 & 6642);
      int var3 = 17550 & 15357;
      var1.translate(var4, var3);
      this.Z_N.paint(var1);
      int var10008 = -var4;
      var4 += 120;
      var1.translate(var10008, -var3);
      var1.translate(var4, var3);
      this.Z_V.paint(var1);
      var1.translate(-var4, -var3);
      var4 = 84 & 111;
      var3 = var6.Screen_y - (8063 & 24981);
      var1.translate(var4, var3);
      this.Y_N.paint(var1);
      int var10009 = -var4;
      var4 += 120;
      var1.translate(var10009, -var3);
      var1.translate(var4, var3);
      this.Y_V.paint(var1);
      var1.translate(-var4, -var3);
      var4 = 3327 & 29692;
      var3 = 103 & 126;
      var1.drawImage(this.Z_Z, var4, var3, 94 & 113, 105, (ImageObserver)null);
      var1.drawImage(this.head1, var4, var3, 80, 105, (ImageObserver)null);
      int var10000;
      int var5;
      if (this.Z_FS != null) {
         short var7 = 148;

         for(var10000 = var5 = 2 & 5; var10000 < this.Z_FS.length; var10000 = var5) {
            var4 = 42 + var5 * 52;
            var1.drawImage(this.Z_FS[var5], var4, var7, 46, 46, (ImageObserver)null);
            ++var5;
            var1.drawImage(this.head2, var4, var7, 46, 46, (ImageObserver)null);
         }
      }

      var4 = var6.Screen_x - 486;
      var3 = var6.Screen_y - 305;
      var1.drawImage(this.Y_Z, var4, var3, 80, 105, (ImageObserver)null);
      var1.drawImage(this.head1, var4, var3, 80, 105, (ImageObserver)null);
      if (this.Y_FS != null) {
         var3 = var6.Screen_y - 265;

         for(var10000 = var5 = 3 & 4; var10000 < this.Y_FS.length; var10000 = var5) {
            var4 = var6.Screen_x - 400 + var5 * 52;
            var1.drawImage(this.Y_FS[var5], var4, var3, 46, 46, (ImageObserver)null);
            ++var5;
            var1.drawImage(this.head2, var4, var3, 46, 46, (ImageObserver)null);
         }
      }

      if (this.TZ == null) {
         this.TZ = dx.q("sc/bang/BgTZ.tcp");
      } else {
         if (this.time > this.TZ.k()) {
            return (boolean)(--1);
         }

         this.TZ.d((long)this.time, 3 & 4);
         this.TZ.aa(var1, var6.Screen_x / (1 ^ 3), var6.Screen_y / --2);
      }

      return false;
   }
}
