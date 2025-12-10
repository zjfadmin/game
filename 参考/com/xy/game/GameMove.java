package com.xy.game;

import com.xy.fa;
import com.xy.iO;
import com.xy.lI;
import com.xy.battle.ShadowMode;
import com.xy.bean.PathPoint;
import java.util.List;

public class GameMove {
   public int x2;
   private long time;
   private boolean flag;
   private double sp;
   public int z2;
   public int x1;
   private boolean isMove;
   public int z1;
   private String value;
   private int index;
   private long moveTime;
   static final char A = '*';
   public int y1;
   public int y2;
   static final char B = '-';

   public static boolean getMovetime(iO var0, List<PathPoint> var1) {
      if (var1 != null && var1.size() != 0) {
         if (var1.size() == (3 & 5)) {
            var0.ab = ((PathPoint)var1.get(5 >> 3)).getX();
            var0.al = ((PathPoint)var1.get(3 ^ 3)).getY();
            return (boolean)(--1);
         } else {
            PathPoint var2 = (PathPoint)var1.get(3 ^ 3);
            PathPoint var3;
            PathPoint var10002 = var3 = (PathPoint)var1.get(2 ^ 3);
            var0.ab = getmove2(var2.x, var3.x, var0.an, 700L);
            var0.al = getmove2(var2.y, var3.y, var0.an, 700L);
            var0.as = getDirTwo(var10002.x - var2.x, var3.y - var2.y);
            return (boolean)(var0.an >= 700L ? 5 >> 2 : 0);
         }
      } else {
         return true;
      }
   }

   public boolean a() {
      return this.flag;
   }

   public static int getDirTwo(int var0, int var1) {
      int var4 = Math.abs(var0);
      int var3 = Math.abs(var1);
      int var2 = var4 > (5 >> 1) * var3 ? 4 ^ 5 : (var3 > (5 >> 1) * var4 ? --2 : 0);
      if (var0 > 0 && var1 > 0) {
         if (var2 == (4 ^ 5)) {
            return 2 ^ 3;
         } else {
            return var2 == 5 >> 1 ? --5 : 3;
         }
      } else if (var0 < 0 && var1 < 0) {
         if (var2 == 5 >> 2) {
            return --5;
         } else {
            return var2 == 5 >> 1 ? 3 & 5 : 7;
         }
      } else if (var0 > 0) {
         if (var2 == --1) {
            return --3;
         } else {
            return var2 == --2 ? 31 & 103 : 1;
         }
      } else if (var2 == (2 ^ 3)) {
         return 55 & 79;
      } else {
         return var2 == (1 ^ 3) ? --3 : 5;
      }
   }

   public static double getdou(long var0, long var2) {
      double var4;
      return (var4 = (double)var0 / (double)var2) > 1.0D ? 1.0D : var4;
   }

   public static long gettime(long var0, long var2, double var4) {
      return (long)(Math.sqrt((double)(var0 * var0 + var2 * var2)) / var4);
   }

   public static int getmove2(int var0, int var1, long var2, long var4) {
      return var0 + (int)((double)(var1 - var0) * getdou(var2, var4));
   }

   public void setSp(double var1) {
      synchronized(this) {
         if (this.sp != var1) {
            if (this.isMove) {
               this.x1 = getmove2(this.x1, this.x2, this.time, this.moveTime);
               this.y1 = getmove2(this.y1, this.y2, this.time, this.moveTime);
               this.moveTime -= this.time;
               this.time = 0L;
            }

            this.sp = var1;
         }
      }
   }

   public boolean b() {
      return this.isMove;
   }

   public void c() {
      this.x1 = this.x2;
      this.y1 = this.y2;
      this.z1 = this.z2;
      if (this.value == null) {
         this.isMove = Boolean.FALSE;
      } else {
         boolean var4 = Boolean.FALSE;
         boolean var2 = Boolean.TRUE;
         int var1 = 3 ^ 3;
         GameMove var10000 = this;

         while(true) {
            label72: {
               if (var10000.index < this.value.length()) {
                  char var3;
                  if ((var3 = this.value.charAt(this.index)) == (122 & 47) || this.index == this.value.length() - (3 >> 1)) {
                     if (this.index == this.value.length() - --1) {
                        if (var3 != (42 & 127)) {
                           var1 = var1 * (11 & 126) + (this.value.charAt(this.index) - (120 & 55));
                        }

                        this.value = null;
                     }

                     if (var4) {
                        this.y2 = var2 ? var1 : -var1;
                        if (this.y2 >= lI.a) {
                           var10000 = this;
                           this.z2 = --1;
                           this.y2 &= lI.a;
                        } else {
                           var10000 = this;
                           this.z2 = 5 >> 3;
                        }

                        var10000.moveTime = gettime((long)(this.x2 - this.x1), (long)(this.y2 - this.y1), this.sp);
                        this.isMove = Boolean.TRUE;
                        this.index += --1;
                        return;
                     }

                     this.x2 = var2 ? var1 : -var1;
                     var4 = Boolean.TRUE;
                     var1 = 3 ^ 3;
                     var10000 = this;
                     break label72;
                  }

                  if (var3 == (47 & 125)) {
                     var2 = Boolean.FALSE;
                     var10000 = this;
                     break label72;
                  }

                  if (var3 >= (58 & 117)) {
                     if (var3 > (61 & 123)) {
                        var10000 = this;
                        break;
                     }

                     var1 = var1 * (43 & 94) + (this.value.charAt(this.index) - (122 & 53));
                     var10000 = this;
                     break label72;
                  }
               }

               var10000 = this;
               break;
            }

            var10000.index += --1;
            var10000 = this;
         }

         var10000.isMove = Boolean.FALSE;
         this.value = null;
         this.x2 = this.x1;
         this.y2 = this.y1;
         this.z2 = this.z1;
      }
   }

   public GameMove(double var1) {
      this.sp = var1;
   }

   public String getValue() {
      return this.value;
   }

   public static boolean getMovetime(ShadowMode var0, List<PathPoint> var1) {
      if (var1 != null && var1.size() != 0) {
         if (var1.size() == --1) {
            var0.setX(((PathPoint)var1.get(2 & 5)).getX());
            var0.setY(((PathPoint)var1.get(5 >> 3)).getY());
            return (boolean)(3 >> 1);
         } else {
            PathPoint var2 = (PathPoint)var1.get(3 >> 2);
            PathPoint var3;
            PathPoint var10002 = var3 = (PathPoint)var1.get(3 >> 1);
            var0.setX(getmove2(var2.x, var3.x, (long)var0.getTime(), 1000L));
            var0.setY(getmove2(var2.y, var3.y, (long)var0.getTime(), 1000L));
            var0.setDir(getDirTwo(var10002.x - var2.x, var3.y - var2.y));
            return (boolean)(var0.getTime() >= (2043 & 31724) ? --1 : 0);
         }
      } else {
         return true;
      }
   }

   public static int getDir(int var0, int var1, int var2) {
      if (var0 == 0 && var1 == 0) {
         return var2;
      } else {
         int var3 = Math.abs(var0);
         int var4 = Math.abs(var1);
         if (var0 == 0) {
            var2 = var1 < 0 ? 30 & 103 : 4;
            return var2;
         } else if (var1 == 0) {
            var2 = var0 > 0 ? 63 & 71 : 5;
            return var2;
         } else if (var3 > --3 * var4) {
            var2 = var0 > 0 ? 95 & 39 : 5;
            return var2;
         } else if (var4 > --3 * var3) {
            var2 = var1 > 0 ? --4 : 6;
            return var2;
         } else if (var0 > 0 && var1 > 0) {
            return var2 = 5 >> 3;
         } else if (var0 > 0 && var1 < 0) {
            return var2 = --3;
         } else if (var0 < 0 && var1 < 0) {
            return var2 = 1 ^ 3;
         } else {
            if (var0 < 0 && var1 > 0) {
               var2 = 3 >> 1;
            }

            return var2;
         }
      }
   }

   public boolean d(long var1, fa var3) {
      synchronized(this) {
         if (this.isMove) {
            this.time += var1;
            if (this.time < 0L) {
               return this.isMove;
            }

            int var6 = var3.bc();

            do {
               var6 = var3 instanceof iO ? getDirTwo(this.x2 - this.x1, this.y2 - this.y1) : getDir(this.x2 - this.x1, this.y2 - this.y1, var6);
               if (this.time < this.moveTime) {
                  var3.x(getmove2(this.x1, this.x2, this.time, this.moveTime), getmove2(this.y1, this.y2, this.time, this.moveTime), this.z1, var6);
                  return this.isMove;
               }

               this.time -= this.moveTime;
               this.c();
            } while(this.isMove);

            var3.x(this.x1, this.y1, this.z1, var6);
            return this.isMove;
         }
      }

      return (boolean)(3 ^ 3);
   }

   public void setFlag(boolean var1) {
      this.flag = var1;
   }

   public void setValue(int var1, long var2, String var4) {
      synchronized(this) {
         this.time = var2;
         this.index = var1;
         this.value = var4;
         if (var4 == null) {
            this.c();
         } else {
            this.c();
            this.c();
         }
      }
   }
}
