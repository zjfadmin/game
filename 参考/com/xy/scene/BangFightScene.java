package com.xy.scene;

import com.xy.cY;
import com.xy.dx;
import com.xy.ev;
import com.xy.ho;
import com.xy.z;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;

public class BangFightScene implements Scene {
   public int state;
   public Build buildMouse;
   public int manstate;
   private GameView gameView;
   private Build[] builds;
   public static int MINSUM = --3;
   public BangTZ tz;
   private Image t_xg;
   z Huo;
   private z Bg_Xt_Z;
   private Image t_z;
   private Image t_xr;

   public void a() {
   }

   public void b(Graphics var1) {
      if (this.t_xg != null) {
         var1.drawImage(this.t_z, this.gameView.mapCamera.t.Screen_x / (5 >> 1) - (21463 & 11578), 79 & 123, (ImageObserver)null);
         this.Bg_Xt_Z.d(System.currentTimeMillis(), 3 & 4);
         this.Bg_Xt_Z.aa(var1, this.gameView.mapCamera.t.Screen_x / (1 ^ 3), 105 & 127);
         double var3;
         int var2 = (int)((var3 = (double)this.builds[3 >> 1].getHp() / 4000.0D) * 226.0D);
         BangFightScene var10000;
         if (var3 < 0.3D) {
            var1.drawImage(this.t_xr, this.gameView.mapCamera.t.Screen_x / --2 - (127 & 43) - var2, 105 & 118, var2, 29 & 111, (ImageObserver)null);
            var10000 = this;
         } else {
            var1.drawImage(this.t_xg, this.gameView.mapCamera.t.Screen_x / (1 ^ 3) - (111 & 59) - var2, 109 & 114, var2, 125 & 15, (ImageObserver)null);
            var10000 = this;
         }

         var2 = (int)((var3 = (double)var10000.builds[23 & 110].getHp() / 4000.0D) * 226.0D);
         if (var3 < 0.3D) {
            var1.drawImage(this.t_xr, this.gameView.mapCamera.t.Screen_x / (1 ^ 3) + (107 & 63), 123 & 100, var2, 13 & 127, (ImageObserver)null);
         } else {
            var1.drawImage(this.t_xg, this.gameView.mapCamera.t.Screen_x / (1 ^ 3) + (107 & 63), 123 & 100, var2, 45 & 95, (ImageObserver)null);
         }
      }
   }

   public void c(Build var1) {
      this.buildMouse = var1;
      String var2 = Agreement.getSendTextAES("gangmonitor", String.valueOf(var1.getBh()));
      this.gameView.getClient().d(var2);
   }

   public static boolean d(Image var0, int var1, int var2) {
      if (var0 == null) {
         return (boolean)(3 & 4);
      } else if (var1 >= 0 && var1 < var0.getWidth((ImageObserver)null) && var2 >= 0 && var2 < var0.getHeight((ImageObserver)null)) {
         BufferedImage var3 = null;
         if (var0 instanceof BufferedImage) {
            return (boolean)((var3 = (BufferedImage)var0).getRGB(var1, var2) != 0 ? 2 ^ 3 : 0);
         } else {
            return true;
         }
      } else {
         return false;
      }
   }

   public void e(String[] var1) {
   }

   public boolean f(int var1, int var2) {
      if (!this.gameView.roleUnit.h()) {
         return (boolean)(3 >> 2);
      } else {
         int var3;
         if (this.state == (2 ^ 3)) {
            for(int var10000 = var3 = 2 & 5; var10000 < this.builds.length; var10000 = var3) {
               if (this.builds[var3] != null && this.builds[var3].getImage() != null && d(this.builds[var3].getImage(), var1 - this.builds[var3].getX() + this.builds[var3].getPx(), var2 - this.builds[var3].getY() + this.builds[var3].getPy())) {
                  var10000 = 4 ^ 5;
                  this.c(this.builds[var3]);
                  return (boolean)var10000;
               }

               ++var3;
            }
         }

         return false;
      }
   }

   public BangFightScene(String[] var1, GameView var2) {
      int var10001 = 27 & 111;
      super();
      Build[] var3 = new Build[var10001];
      boolean var10003 = true;
      this.builds = var3;
      this.gameView = var2;
      this.g(var1);
   }

   public void g(String[] var1) {
      if (this.t_xg == null) {
         this.t_xg = ho.a("sc/c/74");
         this.t_xr = ho.a("sc/c/75");
         this.t_z = ho.a("sc/c/76");
         this.Bg_Xt_Z = dx.s("sc/bang/BgXtZ.tcp", (short[])null);
      }

      if (var1 != null) {
         int var2;
         if ((var2 = Integer.parseInt(var1[5 >> 3])) == 0) {
            int var10002 = 1 ^ 3;
            this.state = Integer.parseInt(var1[3 >> 1]);
            this.manstate = Integer.parseInt(var1[var10002]);
         }

         var2 = var2 == --1 ? 2 ^ 3 : 3;

         for(int var10000 = var2; var10000 < var1.length; var10000 = var2) {
            String[] var3;
            int var4;
            int var5 = (var4 = Integer.parseInt((var3 = var1[var2].split("="))[3 & 4])) > --5 ? var4 - --5 : var4;
            if (this.builds[var5] == null) {
               this.builds[var5] = new Build(var4, Integer.parseInt(var3[--1]), Integer.parseInt(var3[1 ^ 3]), Integer.parseInt(var3[--3]));
            } else {
               this.builds[var5].setState(Integer.parseInt(var3[--2]));
               this.builds[var5].setHp(Integer.parseInt(var3[--3]));
            }

            ++var2;
         }

      } else {
         this.state = 2 & 5;
      }
   }

   public int getSceneId() {
      return 3 ^ 3;
   }

   public void h(Graphics var1) {
      this.gameView.mapScene.s(var1, this.gameView);
      if (this.state == --1 && this.gameView.mapScene.b() == 3315L) {
         int var2;
         for(int var10000 = var2 = 3 ^ 3; var10000 < this.builds.length; var10000 = var2) {
            if (this.builds[var2] != null) {
               this.builds[var2].a(var1, this.gameView.mapCamera);
            }

            ++var2;
         }

         BangFightScene var4;
         if (this.Huo == null) {
            this.Huo = cY.b(cY.k(56 & 111));
            var4 = this;
         } else {
            this.Huo.d(ev.l(), 5 >> 3);
            Point var3;
            if ((var3 = this.gameView.mapCamera.i(19324 & 13779, 30174 & 3059)) != null) {
               this.Huo.aa(var1, var3.x, var3.y);
            }

            if ((var3 = this.gameView.mapCamera.i(111 & 27, 29686 & 3387)) != null) {
               this.Huo.aa(var1, var3.x, var3.y);
            }

            if ((var3 = this.gameView.mapCamera.i(13151 & 19966, 31463 & 1439)) != null) {
               this.Huo.aa(var1, var3.x, var3.y);
            }

            if ((var3 = this.gameView.mapCamera.i(24511 & 8940, 25012 & 8047)) != null) {
               this.Huo.aa(var1, var3.x, var3.y);
            }

            var4 = this;
         }

         var4.b(var1);
         if (this.tz != null && this.tz.a(var1, this)) {
            this.tz = null;
         }
      }

   }

   public GameView getGameView() {
      return this.gameView;
   }

   public boolean i() {
      if (this.state == (3 & 5) && this.gameView.mapScene.b() == 3315L) {
         return this.manstate == 0 || this.manstate == --1 || this.manstate == -4 >> 2;
      } else {
         return true;
      }
   }
}
