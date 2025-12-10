package com.xy.scene;

import com.xy.kj;
import com.xy.lz;
import com.xy.text.GameView;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ImageObserver;
import java.math.BigDecimal;
import javax.swing.ImageIcon;

public class DNTGScene implements Scene {
   private String DN_SLs;
   private BigDecimal DN_JF;
   private DNTGSG DNTGSg;
   private static Image XZ;
   private GameView gameView;
   private DNTGNV DNTGNv;
   private CountDown countDown;
   private String DN_HGS_KJ;
   private boolean is1;
   private static Image XY;
   private BigDecimal DN_JB;
   private static Image image;
   private int camp;
   private String DN_TT_KJ;
   private boolean is2;

   public void e(String[] var1) {
      int var2;
      for(int var10000 = var2 = 5 >> 2; var10000 < var1.length; var10000 = var2) {
         if (var1[var2].startsWith("M")) {
            this.DN_JB = new BigDecimal(var1[var2].substring(--1));
         } else if (var1[var2].startsWith("J")) {
            this.DN_JF = new BigDecimal(var1[var2].substring(--1));
         } else if (var1[var2].startsWith("K")) {
            if (var1[var2].startsWith("K0")) {
               this.DN_TT_KJ = var1[var2].substring(--2);
            } else {
               this.DN_HGS_KJ = var1[var2].substring(5 >> 1);
            }
         } else {
            String[] var3;
            if (var1[var2].startsWith("N")) {
               if (var1[var2].length() == (3 & 5)) {
                  this.DNTGNv = null;
               } else {
                  if (this.DNTGNv == null) {
                     this.DNTGNv = new DNTGNV();
                  }

                  if (var1[var2].startsWith("N0")) {
                     this.DNTGNv.a(3 >> 2, var1[var2].substring(5 >> 1));
                  } else if (var1[var2].startsWith("N1")) {
                     this.DNTGNv.a(3 & 5, var1[var2].substring(5 >> 1));
                  } else {
                     var3 = var1[var2].substring(--2).split("\\$");
                     this.DNTGNv.c(this.camp, Integer.parseInt(var3[3 >> 2]), Integer.parseInt(var3[--1]));
                  }
               }
            } else if (var1[var2].startsWith("S")) {
               if (var1[var2].length() == 5 >> 2) {
                  this.DNTGSg = null;
               } else {
                  if (this.DNTGSg == null) {
                     this.DNTGSg = new DNTGSG();
                  }

                  if (var1[var2].startsWith("S0")) {
                     this.DNTGSg.a(2 & 5, Integer.parseInt(var1[var2].substring(5 >> 1)));
                  } else if (var1[var2].startsWith("S1")) {
                     this.DNTGSg.a(3 & 5, Integer.parseInt(var1[var2].substring(5 >> 1)));
                  } else {
                     this.DNTGSg.c(var1[var2].substring(--2));
                  }
               }
            } else if (var1[var2].startsWith("D")) {
               if (var1[var2].length() == 5 >> 2) {
                  this.countDown = null;
               } else {
                  var3 = var1[var2].substring(--1).split("\\$");
                  this.countDown = new CountDown(Integer.parseInt(var3[3 >> 2]), Long.parseLong(var3[3 >> 1]));
               }
            } else if (var1[var2].startsWith("C")) {
               this.camp = Integer.parseInt(var1[var2].substring(5 >> 2));
            } else if (var1[var2].startsWith("L")) {
               this.DN_SLs = var1[var2].substring(3 >> 1);
               ((kj)this.gameView.getFormManagement().e(110 & 115)).f(this.DN_SLs);
            }
         }

         ++var2;
      }

   }

   public void j() {
      ((kj)this.gameView.getFormManagement().e(99 & 126)).f(this.DN_SLs);
      this.gameView.getFormManagement().a(119 & 106);
   }

   public void a() {
   }

   public int getCamp() {
      return this.camp;
   }

   public void setDN_JB(BigDecimal var1) {
      this.DN_JB = var1;
   }

   public BigDecimal getDN_JB() {
      return this.DN_JB;
   }

   public int getSceneId() {
      return 25591 & 8187;
   }

   public void setCamp(int var1) {
      this.camp = var1;
   }

   public void setDN_JF(BigDecimal var1) {
      this.DN_JF = var1;
   }

   public boolean f(int var1, int var2) {
      var1 -= this.gameView.mapCamera.j();
      var2 -= this.gameView.mapCamera.h();
      if (this.is1) {
         if (var1 >= (1199 & 31728) && var1 <= (20671 & 12276) && var2 >= (29172 & 3775) && var2 <= (29919 & 3053)) {
            this.is1 = (boolean)(this.is1 ? 3 & 4 : 1);
            return (boolean)(2 ^ 3);
         }
      } else if (var1 >= 0 && var1 <= (86 & 61) && var2 >= (7166 & 25781) && var2 <= (20717 & 12255)) {
         this.is1 = (boolean)(this.is1 ? 3 & 4 : 1);
         return (boolean)(4 ^ 5);
      }

      if (this.DNTGNv != null) {
         if (this.is2) {
            if (var2 >= (18175 & 14782) && var2 <= (31199 & 1783) && var1 >= this.gameView.screenData.Screen_x - this.DNTGNv.getImage().getWidth((ImageObserver)null) + (106 & 31) && var1 <= this.gameView.screenData.Screen_x - this.DNTGNv.getImage().getWidth((ImageObserver)null) + (95 & 62)) {
               this.is2 = (boolean)(this.is2 ? 3 >> 2 : 1);
               return (boolean)(--1);
            }
         } else if (var1 >= this.gameView.screenData.Screen_x - (22 & 125) && var1 <= this.gameView.screenData.Screen_x && var2 >= (11262 & 21695) && var2 <= (6903 & 26079)) {
            this.is2 = (boolean)(this.is2 ? 3 ^ 3 : 1);
            return (boolean)(3 >> 1);
         }
      }

      return false;
   }

   public DNTGScene(String[] var1, GameView var2) {
      int var10001 = 5 >> 2;
      int var10003 = 2 ^ 3;
      super();
      this.gameView = var2;
      this.is1 = (boolean)var10003;
      this.is2 = (boolean)var10001;
      if (image == null) {
         image = (new ImageIcon("sc/b/S23.png")).getImage();
      }

      if (XZ == null) {
         XZ = (new ImageIcon("sc/b/B27.png")).getImage();
      }

      if (XY == null) {
         XY = (new ImageIcon("sc/b/B28.png")).getImage();
      }

      this.DN_JB = new BigDecimal(5 >> 3);
      this.DN_JF = new BigDecimal(3 ^ 3);
      this.DN_TT_KJ = "0";
      this.DN_HGS_KJ = "0";
      this.e(var1);
   }

   public BigDecimal getDN_JF() {
      return this.DN_JF;
   }

   public void h(Graphics var1) {
      this.gameView.mapScene.s(var1, this.gameView);
      DNTGScene var10000;
      if (this.is1) {
         var1.drawImage(image, 3 >> 2, 124 & 123, (ImageObserver)null);
         lz.k(var1, this.DN_JB, 121 & 31, 6141 & 26879);
         lz.k(var1, this.DN_JF, 29 & 123, 31167 & 1903);
         var1.setColor(Color.white);
         var1.drawString(this.DN_HGS_KJ, 95 & 122, 2045 & 31099);
         var1.drawString(this.DN_TT_KJ, 123 & 94, 20479 & 12742);
         var1.drawImage(XZ, 13034 & 19893, 12797 & 20150, (ImageObserver)null);
         var10000 = this;
      } else {
         var1.drawImage(XY, 5 >> 3, 24053 & 8894, (ImageObserver)null);
         var10000 = this;
      }

      if (var10000.countDown != null) {
         this.countDown.b(var1, this.gameView);
      }

      if (this.DNTGNv != null) {
         if (this.is2) {
            this.DNTGNv.b(var1, this.gameView);
            var1.drawImage(XY, this.gameView.screenData.Screen_x - this.DNTGNv.getImage().getWidth((ImageObserver)null) + (30 & 107), 30462 & 2495, (ImageObserver)null);
         } else {
            var1.drawImage(XZ, this.gameView.screenData.Screen_x - (118 & 29), 25023 & 7934, (ImageObserver)null);
         }
      } else {
         if (this.DNTGSg != null) {
            this.DNTGSg.b(var1, this.gameView);
         }

      }
   }
}
