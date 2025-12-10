package com.xy.formula;

import com.xy.hd;
import java.awt.Point;

public class BaseMountSH {
   private Point point;
   private int id;
   private BaseMountSkill[] mounts;
   private int exp;
   public static String[] SH_HEAD_DATA;
   private int lvl;
   public static String[] SH_HEAD_NAME;
   private int unlock;
   public static String[] SH_HEAD_SHS;

   public int getId() {
      return this.id;
   }

   public void setGZ(int var1, int var2) {
      if (this.id == 0) {
         this.mounts[var1].setB1(var2);
      } else if (var1 == 0) {
         this.point.x = var2;
      } else {
         this.point.y = var2;
      }
   }

   public int a(int var1) {
      int var2;
      if (this.id == 0) {
         for(int var10000 = var2 = 3 ^ 3; var10000 < this.mounts.length; var10000 = var2) {
            if (this.mounts[var2].getB1() == var1) {
               return var2 + --1;
            }

            ++var2;
         }
      } else {
         if (this.point.x == var1) {
            return --1;
         }

         if (this.point.y == var1) {
            return 5 >> 1;
         }
      }

      return 0;
   }

   public void setUnlock(int var1) {
      this.unlock = var1;
   }

   public void setLvl(int var1) {
      this.lvl = var1;
   }

   public void b(int var1, String var2) {
      this.mounts[var1].a(var2);
   }

   static {
      String[] var10000 = new String[--5];
      boolean var10002 = true;
      var10000[3 ^ 3] = "中天";
      var10000[--1] = "青龙";
      var10000[--2] = "白虎";
      var10000[--3] = "朱雀";
      var10000[--4] = "玄武";
      SH_HEAD_NAME = var10000;
      var10000 = new String[--5];
      var10002 = true;
      var10000[3 & 4] = "MZ";
      var10000[4 ^ 5] = "MA";
      var10000[--2] = "MB";
      var10000[--3] = "MC";
      var10000[--4] = "MD";
      SH_HEAD_DATA = var10000;
      var10000 = new String[71 & 63];
      var10002 = true;
      var10000[3 >> 2] = "ma";
      var10000[--1] = "mb";
      var10000[--2] = "mc";
      var10000[--3] = "md";
      var10000[--4] = "me";
      var10000[--5] = "mf";
      var10000[54 & 79] = "mg";
      SH_HEAD_SHS = var10000;
   }

   public void setMounts(BaseMountSkill[] var1) {
      this.mounts = var1;
   }

   public Point getPoint() {
      return this.point;
   }

   public int getLvl() {
      return this.lvl;
   }

   public BaseMountSkill[] getMounts() {
      return this.mounts;
   }

   public BaseMountSH(int var1, String var2) {
      this.id = var1;
      int var10000;
      int var4;
      String var6;
      if (var1 == 0) {
         BaseMountSkill[] var10001 = new BaseMountSkill[7 & 127];
         boolean var10003 = true;
         this.mounts = var10001;

         for(var10000 = var4 = 2 & 5; var10000 < this.mounts.length; var10000 = var4) {
            BaseMountSkill[] var5 = this.mounts;
            int var7 = var4;
            BaseMountSkill var10002 = new BaseMountSkill();
            ++var4;
            var5[var7] = var10002;
         }

         var6 = var2;
      } else {
         this.point = new Point();
         var6 = var2;
      }

      if (hd.o(var6)) {
         this.unlock = var1 == 0 ? 2 & 5 : 1;
      } else {
         var4 = 0;
         var1 = 3 >> 2;

         int var3;
         for(var10000 = var3 = 2 & 5; var10000 < var2.length(); var10000 = var3) {
            if ((var3 = var2.indexOf("#", var1 + --1)) == -4 >> 2) {
               var3 = var2.length();
            }

            if (var4 == 0) {
               var10000 = var3;
               this.lvl = hd.b(var2, var1, var3);
            } else if (var4 == --1) {
               var10000 = var3;
               this.exp = hd.b(var2, var1, var3);
            } else if (var4 == 5 >> 1) {
               var10000 = var3;
               this.unlock = hd.b(var2, var1, var3);
            } else {
               if (var4 == --3) {
                  this.c(var2, var1, var3);
               }

               var10000 = var3;
            }

            ++var4;
            var1 = var10000 + 1;
         }

      }
   }

   public int getExpTotal() {
      return this.id == 0 ? BaseValue.getSHExpByZT(this.lvl) : BaseValue.getSHExpBySX(this.lvl);
   }

   public int getLYJTotal() {
      return this.id == 0 ? BaseValue.getSHLYJByZT(this.lvl) : BaseValue.getSHLYJBySX(this.lvl);
   }

   public void c(String var1, int var2, int var3) {
      int var4 = 3 >> 2;

      int var5;
      for(int var10000 = var5 = 5 >> 3; var10000 < var3; var10000 = var5) {
         if ((var5 = var1.indexOf(",", var2 + (5 >> 2))) == -4 >> 2 || var5 > var3) {
            var5 = var3;
         }

         if (this.id == 0) {
            var10000 = var5;
            this.mounts[var4].setB1(hd.b(var1, var2, var5));
         } else if (var4 == 0) {
            this.point.x = hd.b(var1, var2, var5);
            var10000 = var5;
         } else {
            this.point.y = hd.b(var1, var2, var5);
            var10000 = var5;
         }

         ++var4;
         var2 = var10000 + 1;
      }

   }

   public String toString() {
      return this.lvl + "#" + this.exp + "#" + this.unlock;
   }

   public int getUnlock() {
      return this.unlock;
   }

   public int getGZ(int var1) {
      if (this.id == 0) {
         return this.mounts[var1].getB1();
      } else {
         return var1 == 0 ? this.point.x : this.point.y;
      }
   }

   public void setId(int var1) {
      this.id = var1;
   }

   public void setPoint(Point var1) {
      this.point = var1;
   }

   public void setExp(int var1) {
      this.exp = var1;
   }

   public int getExp() {
      return this.exp;
   }
}
