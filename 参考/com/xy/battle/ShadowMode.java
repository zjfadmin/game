package com.xy.battle;

import com.xy.iO;
import com.xy.o;
import com.xy.bean.PathPoint;
import com.xy.game.GameMove;
import java.awt.Graphics;
import java.util.List;

public class ShadowMode {
   private int x;
   private o part;
   private int time;
   private iO battleUnit;
   private int dir;
   private int y;
   private List<PathPoint> paths;

   public ShadowMode(o var1, int var2, int var3, List<PathPoint> var4, int var5, iO var6) {
      this.part = var1;
      this.x = var2;
      this.y = var3;
      this.paths = var4;
      this.dir = var5;
      this.battleUnit = var6;
   }

   public void setX(int var1) {
      this.x = var1;
   }

   public int getTime() {
      return this.time;
   }

   public void setPaths(List<PathPoint> var1) {
      this.paths = var1;
   }

   public int getY() {
      return this.y;
   }

   public void setY(int var1) {
      this.y = var1;
   }

   public void setTime(int var1) {
      this.time = var1;
   }

   public void setPart(o var1) {
      this.part = var1;
   }

   public int getDir() {
      return this.dir;
   }

   public o getPart() {
      return this.part;
   }

   public List<PathPoint> getPaths() {
      return this.paths;
   }

   public void setDir(int var1) {
      this.dir = var1;
   }

   public void a(Graphics var1, int var2, BattleControl var3) {
      int var4 = this.battleUnit.bt().getCamp() == (28663 & 5103) ? this.battleUnit.bt().getCampId() & --3 : this.battleUnit.bt().getCamp();
      double var5 = (double)var3.gameView.screenData.Screen_x / 1024.0D;
      double var7 = (double)var3.gameView.screenData.Screen_y / 728.0D;
      int var9 = Math.max(3 >> 2, (var3.gameView.screenData.Screen_x - (27883 & 5908)) / --2);
      int var11 = Math.max(3 & 4, (var3.gameView.screenData.Screen_y - (24543 & 8952)) / (5 >> 1) + (47 & 95));
      double var10000;
      int var10;
      if (var4 != var2) {
         var2 = this.x;
         var4 = this.y;
         var10 = this.dir;
         var10000 = var5;
      } else {
         var2 = 1024 - this.x;
         var4 = (733 & 32762) - this.y;
         var10 = BattleHandle.getdir(this.dir);
         var10000 = var5;
      }

      if (var10000 < 1.0D) {
         var2 = (int)((double)var2 * var5);
      }

      if (var7 < 1.0D) {
         var4 = (int)((double)var4 * var7);
      }

      var2 += var9;
      var4 += var11;
      this.part.o(var1, var2, var4, var10, (long)this.time, 1.0F);
   }

   public boolean b(long var1) {
      this.time = (int)((long)this.time + var1);
      if (this.paths != null) {
         return GameMove.getMovetime(this, this.paths);
      } else if (this.time >= this.part.e()) {
         int var10000 = 3 & 5;
         this.time = this.part.e();
         return (boolean)var10000;
      } else {
         return false;
      }
   }

   public int getX() {
      return this.x;
   }
}
