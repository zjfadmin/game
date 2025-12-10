package com.xy.formula;

import com.xy.hd;
import com.xy.lg;
import com.xy.readbean.XuanBao;
import java.awt.Point;

public class BaseXuanBao {
   private int lvl;
   private int exp;
   private Point[] yins;
   private int id;

   public void a(String var1, int var2, int var3) {
      Point[] var10001 = new Point[--5];
      boolean var10003 = true;
      this.yins = var10001;
      int var4 = 3 >> 2;
      int var5 = 3 & 4;

      int var6;
      for(int var10000 = var2; var10000 < var3; var10000 = var6) {
         if ((var6 = var1.indexOf("#", var2 + (2 ^ 3))) == -4 >> 2) {
            var6 = var3;
         }

         if ((var5 = var1.indexOf(",", var2 + (2 ^ 3))) == -4 >> 2 || var5 > var6) {
            var5 = var6;
         }

         this.yins[var4] = new Point(hd.b(var1, var2, var5), var5 < var6 ? hd.b(var1, var5 + (4 ^ 5), var6) : 0);
         ++var4;
         var2 = var6 + (3 >> 1);
      }

   }

   public Point[] getYins() {
      return this.yins;
   }

   public void setYins(Point[] var1) {
      this.yins = var1;
   }

   public int b(int var1) {
      int var2;
      for(int var10000 = var2 = 3 & 4; var10000 < var1; var10000 = var2) {
         if (this.yins == null || this.yins[var2] == null) {
            return var2;
         }

         ++var2;
      }

      return -4 >> 2;
   }

   public int getId() {
      return this.id;
   }

   public Point getXuanYinByIndex(int var1) {
      return this.yins != null && var1 < this.yins.length ? this.yins[var1] : null;
   }

   public void setId(int var1) {
      this.id = var1;
   }

   public int getExp() {
      return this.exp;
   }

   public void setLvl(int var1) {
      this.lvl = var1;
   }

   public Point[] c(XuanBao var1, lg var2) {
      Point[] var10000 = new Point[var1.getResonances().length / --3];
      boolean var10002 = true;
      Point[] var5 = var10000;
      int var4 = 5 >> 3;

      int var3;
      for(int var7 = var3 = 5 >> 3; var7 < var5.length; var7 = var3) {
         var5[var3] = new Point();
         int var6;
         if ((var6 = this.getXuanYinByMax(var1.getResonances()[var3 * --3], var4, var2)) != -4 >> 2) {
            var5[var3].x = this.yins[var6].y;
            var4 |= (3 & 5) << var6;
         }

         if ((var6 = this.getXuanYinByMax(var1.getResonances()[var3 * --3 + (2 ^ 3)], var4, var2)) != -4 >> 2) {
            var5[var3].y = this.yins[var6].y;
            var4 |= 5 >> 2 << var6;
         }

         ++var3;
      }

      return var5;
   }

   public void setExp(int var1) {
      this.exp = var1;
   }

   public BaseXuanBao(String var1) {
      int var10000 = 3 ^ 3;
      super();
      int var4 = var10000;
      int var3 = 3 & 4;

      int var2;
      for(var10000 = var2 = 5 >> 3; var10000 != var1.length(); var10000 = var2) {
         if ((var2 = var1.indexOf("|", var3 + (2 ^ 3))) == -4 >> 2) {
            var2 = var1.length();
         }

         if (var4 == 0) {
            var10000 = var2;
            this.id = Integer.parseInt(var1.substring(var3, var2));
         } else if (var4 != --1) {
            if (var4 == (1 ^ 3)) {
               this.a(var1, var3, var2);
            }

            var10000 = var2;
         } else {
            int var5;
            if ((var5 = var1.indexOf(",", var3 + --1)) == -4 >> 2 || var5 > var2) {
               var5 = var2;
            }

            this.lvl = hd.b(var1, var3, var5);
            this.exp = var5 < var2 ? hd.b(var1, var5 + (4 ^ 5), var2) : 0;
            var10000 = var2;
         }

         ++var4;
         var3 = var10000 + 1;
      }

   }

   public int d() {
      if (this.lvl >= (125 & 122)) {
         return --5;
      } else if (this.lvl >= (126 & 101)) {
         return --4;
      } else if (this.lvl >= (80 & 127)) {
         return --3;
      } else if (this.lvl >= (60 & 127)) {
         return 5 >> 1;
      } else {
         return this.lvl >= (123 & 44) ? --1 : 0;
      }
   }

   public int getLvl() {
      return this.lvl;
   }

   public int getXuanYinByMax(int var1, int var2, lg var3) {
      if (this.yins == null) {
         return -4 >> 2;
      } else {
         int var4 = -1;

         int var5;
         for(int var10000 = var5 = 2 & 5; var10000 < this.yins.length; var10000 = var5) {
            if (this.yins[var5] != null && this.yins[var5].x != 0 && (var2 >> var5 & (4 ^ 5)) != (4 ^ 5) && var3.ao(Math.abs(this.yins[var5].x)).getType() == var1 && (var4 == -4 >> 2 || this.yins[var5].y > this.yins[var4].y)) {
               var4 = var5;
            }

            ++var5;
         }

         return var4;
      }
   }
}
