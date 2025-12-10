package com.xy.readbean;

import com.xy.hd;
import java.awt.Point;

public class StallBuyUnit {
   private String key;
   private int type;
   private Point[] points;

   public void setKey(String var1) {
      this.key = var1;
   }

   public Point[] getPoints() {
      return this.points;
   }

   public StallBuyUnit(String var1, int var2, int var3) {
      int var4;
      if ((var4 = var1.indexOf("=", var2 + (3 >> 1))) == -4 >> 2 || var4 > var3) {
         var4 = var3;
      }

      this.key = var1.substring(var2, var4);
      int var10000;
      if (this.key.equals("物品ID")) {
         this.key = null;
         var10000 = var4;
         this.type = 5 >> 2;
      } else if (this.key.equals("物品类型")) {
         this.key = null;
         var10000 = var4;
         this.type = 5 >> 1;
      } else {
         this.key = this.key + "=";
         var10000 = var4;
      }

      var2 = var10000 + 1;
      Point[] var10001 = new Point[(3 >> 1) + hd.aj((char)('?' & 'c'), var1, var2, var3)];
      boolean var10003 = true;
      this.points = var10001;
      int var5 = 2 & 5;
      int var6 = 5 >> 3;

      for(var10000 = var4; var10000 < var3; var10000 = var4) {
         if ((var4 = var1.indexOf("#", var2 + (3 & 5))) == -4 >> 2 || var4 > var3) {
            var4 = var3;
         }

         if ((var6 = var1.indexOf("-", var2 + --1)) == -4 >> 2 || var6 > var4) {
            var6 = var4;
         }

         this.points[var5] = new Point();
         this.points[var5].x = hd.b(var1, var2, var6);
         this.points[var5].y = var6 < var4 ? hd.b(var1, var6 + (3 >> 1), var4) : this.points[var5].x;
         ++var5;
         var2 = var4 + (3 & 5);
      }

   }

   public void setPoints(Point[] var1) {
      this.points = var1;
   }

   public String getKey() {
      return this.key;
   }

   public void setType(int var1) {
      this.type = var1;
   }

   public int getType() {
      return this.type;
   }

   public boolean a(int var1) {
      if (this.points == null) {
         return (boolean)(2 & 5);
      } else {
         int var2;
         for(int var10000 = var2 = 0; var10000 < this.points.length; var10000 = var2) {
            if (var1 >= this.points[var2].x && var1 <= this.points[var2].y) {
               return (boolean)(--1);
            }

            ++var2;
         }

         return (boolean)(3 ^ 3);
      }
   }
}
