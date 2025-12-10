package com.xy.battle;

import com.xy.game.GameMove;
import java.awt.Point;

public class BattleUnitExecute {
   private int key;
   private BattleUnitExecute execute;
   private Point p1;
   private int value;
   private Point p2;
   private boolean playEnd;
   private double playSpeed;

   public void setExecute(BattleUnitExecute var1) {
      this.execute = var1;
   }

   public int getValue() {
      return this.value;
   }

   public void a(BattleUnitExecute var1) {
      if (this.execute != null) {
         this.execute.a(var1);
      } else {
         this.execute = var1;
      }
   }

   public BattleUnitExecute(int var1, int var2, double var3, boolean var5) {
      this.key = var1;
      this.value = var2;
      this.playSpeed = var3;
      this.playEnd = var5;
   }

   public BattleUnitExecute(int var1, Point var2, Point var3) {
      int var10001 = 4 ^ 5;
      super();
      this.key = var1;
      this.p1 = var2;
      this.p2 = var3;
      this.playEnd = (boolean)var10001;
   }

   public void setKey(int var1) {
      this.key = var1;
   }

   public void setValue(int var1) {
      this.value = var1;
   }

   public int getMoveX() {
      if (this.p1.x == this.p2.x) {
         return this.p1.x;
      } else if (this.key != (1 ^ 3) && this.key != --4) {
         return GameMove.getmove2(this.p1.x, this.p2.x, (long)this.value, 1000L);
      } else {
         return this.value >= (29173 & 4094) ? GameMove.getmove2(this.p2.x, this.p1.x, (long)(this.value - (24574 & 8693)), 500L) : GameMove.getmove2(this.p1.x, this.p2.x, (long)this.value, 500L);
      }
   }

   public void setP2(Point var1) {
      this.p2 = var1;
   }

   public boolean b() {
      return this.playEnd;
   }

   public int getMoveDir() {
      return this.key == --2 && this.value >= (22527 & 10740) ? GameMove.getDirTwo(this.p1.x - this.p2.x, this.p1.y - this.p2.y) : GameMove.getDirTwo(this.p2.x - this.p1.x, this.p2.y - this.p1.y);
   }

   public Point getP2() {
      return this.p2;
   }

   public int getKey() {
      return this.key;
   }

   public void setPlaySpeed(double var1) {
      this.playSpeed = var1;
   }

   public boolean c(BattleUnitExecute var1) {
      return this.key == 0 && var1.key == 0 || this.key != 0 && var1.key != 0;
   }

   public Point getP1() {
      return this.p1;
   }

   public double getPlaySpeed() {
      return this.playSpeed;
   }

   public void setPlayEnd(boolean var1) {
      this.playEnd = var1;
   }

   public BattleUnitExecute getExecute() {
      return this.execute;
   }

   public void d(long var1) {
      this.value = (int)((long)this.value + var1);
   }

   public boolean e() {
      if (this.p1.x == this.p2.x && this.p1.y == this.p2.y) {
         return (boolean)(2 ^ 3);
      } else {
         return (boolean)(this.value >= (29673 & 4094) ? 4 ^ 5 : 0);
      }
   }

   public int getMoveY() {
      if (this.p1.y == this.p2.y) {
         return this.p1.y;
      } else if (this.key != --2 && this.key != --4) {
         return GameMove.getmove2(this.p1.y, this.p2.y, (long)this.value, 1000L);
      } else {
         return this.value >= (15350 & 17917) ? GameMove.getmove2(this.p2.y, this.p1.y, (long)(this.value - (25591 & 7676)), 500L) : GameMove.getmove2(this.p1.y, this.p2.y, (long)this.value, 500L);
      }
   }

   public void setP1(Point var1) {
      this.p1 = var1;
   }
}
