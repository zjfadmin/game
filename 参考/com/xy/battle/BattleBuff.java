package com.xy.battle;

import com.xy.cY;
import com.xy.dx;
import com.xy.ev;
import com.xy.z;
import com.xy.text.ScreenData;
import java.awt.Graphics;

public class BattleBuff {
   private int id;
   private String type;
   private boolean isv;
   private z sprite;
   private String skin;
   private int xy;
   private int camp;
   private long time;

   public long getTime() {
      return this.time;
   }


   private String getSkin() {
      return cY.f(this.skin);
   }

   public void setId(int var1) {
      this.id = var1;
   }

   public void setCamp(int var1) {
      this.camp = var1;
   }

   public int getXy() {
      return this.xy;
   }

   public void a(Graphics var1, int var2, BattleControl var3) {
      if (this.isv) {
         if (this.sprite == null) {
            this.sprite = dx.q(this.getSkin());
         }

         if (this.sprite != null) {
            this.sprite.d(ev.l() - this.time, 2 & 5);
            ScreenData var4 = var3.gameView.screenData;
            int var5;
            if (this.camp == var2) {
               if (this.xy == 5 >> 2) {
                  this.sprite.aa(var1, var4.Screen_x / (5 >> 1), var4.Screen_y / (5 >> 1));
                  return;
               }

               if (this.xy == 5 >> 1) {
                  this.sprite.aa(var1, var4.Screen_x - (2031 & 30966), var4.Screen_y - (118 & 89));
                  return;
               }

               if (this.xy == --3) {
                  this.sprite.aa(var1, 62 & 115, var4.Screen_y * --2 / --5);
                  return;
               }

               if (this.xy == --4) {
                  this.sprite.aa(var1, var4.Screen_x - (30 & 127), var4.Screen_y * --3 / --5);
                  return;
               }

               if (this.xy == --5) {
                  this.sprite.aa(var1, var4.Screen_x - (51 & 126), var4.Screen_y * --4 / --5);
                  return;
               }

               if (this.xy == (86 & 47)) {
                  this.sprite.aa(var1, 90 & 127, var4.Screen_y * --2 / --5);
                  return;
               }

               if (this.xy == (79 & 55)) {
                  if (var4.Screen_x <= (3839 & 29952) && var4.Screen_y <= (17404 & 16091)) {
                     this.sprite.aa(var1, var4.Screen_x * 3 / 4, var4.Screen_y / 2 - 35);
                     return;
                  }

                  var2 = Math.max(0, (var3.gameView.screenData.Screen_x - (9871 & 23920)) / (5 >> 1));
                  var5 = Math.max(2 & 5, (var3.gameView.screenData.Screen_y - (28633 & 4862)) / --2);
                  var2 += var4.Screen_x > (24482 & 9309) ? 17201 & 16334 : var4.Screen_x * 3 / 4;
                  var5 += var4.Screen_y > (32473 & 1022) ? 11645 & 21486 : var4.Screen_y / 2;
                  this.sprite.aa(var1, var2, var5 - 70);
                  return;
               }
            } else {
               if (this.xy == (3 & 5)) {
                  this.sprite.aa(var1, var4.Screen_x / 2, var4.Screen_y / 2);
                  return;
               }

               if (this.xy == 2) {
                  this.sprite.aa(var1, 100, 360);
                  return;
               }

               if (this.xy == 3) {
                  this.sprite.aa(var1, var4.Screen_x - 70, var4.Screen_y * 4 / 5);
                  return;
               }

               if (this.xy == 4) {
                  this.sprite.aa(var1, 160, var4.Screen_y * 3 / 10);
                  return;
               }

               if (this.xy == 5) {
                  this.sprite.aa(var1, 120, var4.Screen_y * 2 / 5);
                  return;
               }

               if (this.xy == 6) {
                  this.sprite.aa(var1, var4.Screen_x - 90, var4.Screen_y * 4 / 5);
                  return;
               }

               if (this.xy == 7) {
                  if (var4.Screen_x > 1024 || var4.Screen_y > 728) {
                     var2 = Math.max(0, (var3.gameView.screenData.Screen_x - 1024) / 2);
                     var5 = Math.max(2 & 5, (var3.gameView.screenData.Screen_y - 728) / 2);
                     var2 += var4.Screen_x > 1024 ? 256 : var4.Screen_x / 4;
                     var5 += var4.Screen_y > 728 ? 364 : var4.Screen_y / 2;
                     this.sprite.aa(var1, var2, var5 - 70);
                     return;
                  }

                  this.sprite.aa(var1, var4.Screen_x / 4, var4.Screen_y / 2 - 35);
               }
            }

         }
      }
   }

   public void setIsv(boolean var1) {
      this.isv = var1;
   }

   public void setType(String var1) {
      this.type = var1;
   }

   public int getCamp() {
      return this.camp;
   }

   public void setSkin(String var1) {
      this.skin = var1;
   }

   public BattleBuff(String var1, String var2, int var3) {
      this.type = var1;
      this.skin = var2;
      this.camp = var3;
   }

   public void setTime(long var1) {
      this.time = var1;
   }

   public int getId() {
      return this.id;
   }

   public boolean b() {
      return this.isv;
   }

   public void c(Graphics var1, long var2, int var4, int var5) {
      if (this.sprite == null) {
         this.sprite = dx.q(this.getSkin());
      }

      if (this.sprite != null) {
         this.sprite.d(var2, 2 & 5);
         this.sprite.aa(var1, var4, var5);
      }

   }

   public void setXy(int var1) {
      this.xy = var1;
   }

   public BattleBuff(String[] var1) {
      int var10005 = --3;
      int var10007 = 1 ^ 3;
      int var10011 = 5 >> 2;
      super();
      this.id = Integer.parseInt(var1[var10011]);
      this.camp = Integer.parseInt(var1[var10007]);
      this.type = var1[var10005];
      this.skin = this.type;
      this.time = ev.l();
   }

   public String getType() {
      return this.type;
   }
}
