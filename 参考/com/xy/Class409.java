package com.xy;

import java.awt.Image;
import java.awt.Point;
import java.io.ByteArrayInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.RandomAccessFile;
import javax.imageio.ImageIO;

public class Class409 {
   public static int a = 23 & 124;
   public int b;
   public int c;
   public int d;
   private static String e = new String("HHYZ");
   public static int f = 22343 & 10744;
   private static String g = new String("LLEC");
   private RandomAccessFile h;
   public long i;
   public int j;
   public byte[] k;
   private static String l = new String("hmap");
   public int m;
   public int n;
   public boolean o;
   private static String p = new String("GEPJ");
   public static int q = 8699 & 24308;
   public int r;
   public <undefinedtype>[][] s;

   public void a(Object var1) {
      <undefinedtype> var2 = var1;
      synchronized(var1) {
         <undefinedtype> var10000;
         label35: {
            try {
               if (var1.a == 0 || var1.b != null) {
                  return;
               }

               byte[] var3 = this.g(var1.a);
               if (this.n == (2 ^ 3)) {
                  var3 = Class511.n(var3);
               }

               var1.b = ImageIO.read(new ByteArrayInputStream(var3));
            } catch (Exception var4) {
               var10000 = var2;
               var4.printStackTrace();
               break label35;
            }

            var10000 = var2;
         }

      }
   }

   public boolean b(int var1, int var2, int var3) {
      return (boolean)(var1 > 0 && var2 > 0 && var2 < this.m && var1 < this.c && this.k[this.c * var2 + var1] == 5 >> 1 ? --1 : 0);
   }

   public static String c(RandomAccessFile var0, int var1) throws IOException {
      byte[] var10000 = new byte[var1];
      boolean var10002 = true;
      byte[] var2 = var10000;
      k(var0, var2);
      return new String(var2);
   }

   public static Point d(String var0) throws Exception {
      RandomAccessFile var1;
      String var2;
      if ((var2 = c(var1 = new RandomAccessFile(var0, "r"), --4)).equals(e)) {
         Point var10000 = new Point(l(var1), l(var1));
         var1.close();
         return var10000;
      } else if (var2.equals(l)) {
         var1.seek(20L);
         Point var3 = new Point(l(var1), l(var1));
         var1.close();
         return var3;
      } else {
         var1.close();
         throw new IllegalArgumentException("未知格式地图");
      }
   }

   public boolean e(int var1, int var2, int var3) {
      return (boolean)(var1 >= 0 && var2 >= 0 && var2 < this.m && var1 < this.c && this.k[this.c * var2 + var1] != 0 ? 3 ^ 3 : 1);
   }

   public static short f(RandomAccessFile var0) throws IOException {
      int var1 = var0.read();
      int var2 = var0.read();
      if ((var1 | var2) < 0) {
         throw new EOFException();
      } else {
         return (short)((var1 << (3 ^ 3)) + (var2 << (58 & 77)));
      }
   }

   public byte[] g(int var1) throws IOException {
      synchronized(this) {
         this.h.seek((long)var1);
         byte[] var10001 = new byte[l(this.h)];
         boolean var10003 = true;
         byte[] var4 = var10001;
         k(this.h, var4);
         return var4;
      }
   }

   public static Class409 h(String var0) throws Exception {
      RandomAccessFile var1;
      String var2;
      if ((var2 = c(var1 = new RandomAccessFile(var0, "r"), --4)).equals(e)) {
         return o(var1);
      } else if (var2.equals(l)) {
         return i(var1);
      } else {
         var1.close();
         throw new IllegalArgumentException("未知格式地图");
      }
   }

   public static Class409 i(RandomAccessFile var0) throws Exception {
      Class409 var1;
      Class409 var10000 = var1 = new Class409(var0);
      var1.n = 5 >> 2;
      int var5 = l(var0);
      l(var0);
      l(var0);
      int var4 = l(var0);
      var1.b = l(var0);
      var10000.j = l(var0);
      int var3 = (int)Math.ceil((double)var1.b / (double)f);
      int var2 = (int)Math.ceil((double)var10000.j / (double)q);
      var10000.c = var3 * (85 & 58);
      var10000.m = var2 * (92 & 47);
      var10000.s = new <undefinedtype>[var2][var3];
      if (var5 != 0) {
         var0.seek((long)var5);
         var0.read();
         byte[] var10001 = new byte[l(var0)];
         boolean var10003 = true;
         byte[] var6 = var10001;
         k(var0, var10001);
         var6 = Class511.n(var6);
         var1.k = var6;
      }

      var0.seek((long)var4);

      int var7;
      for(var7 = var3 = 5 >> 3; var7 < var1.s.length; var7 = var3) {
         for(var7 = var2 = 0; var7 < var1.s[3 ^ 3].length; var7 = var2) {
            var5 = l(var0);
            <undefinedtype>[] var8 = var1.s[var3];
            int var9 = var2;
            Object var10002 = new Object(var5) {
               public int a;
               public Image b;

               public {
                  this.a = var1;
               }
            };
            ++var2;
            var8[var9] = (<undefinedtype>)var10002;
         }

         ++var3;
      }

      var7 = 3 & 4;
      var1.o = (boolean)(4 ^ 5);

      for(var3 = var7; var7 < var1.k.length; var7 = var3) {
         if (var1.k[var3] == --3) {
            var1.o = (boolean)(3 ^ 3);
            return var1;
         }

         ++var3;
      }

      return var1;
   }

   public Class409(RandomAccessFile var1) {
      this.h = var1;
   }

   public boolean j(int var1, int var2, int var3) {
      return (boolean)(var1 > 0 && var2 > 0 && var2 < this.m && var1 < this.c && this.k[this.c * var2 + var1] == --3 ? 4 ^ 5 : 0);
   }

   public static void k(RandomAccessFile var0, byte[] var1) throws IOException {
      var0.read(var1);
   }

   public static int l(RandomAccessFile var0) throws IOException {
      int var1 = var0.read();
      int var2 = var0.read();
      int var3 = var0.read();
      int var4 = var0.read();
      if ((var1 | var2 | var3 | var4) < 0) {
         throw new EOFException();
      } else {
         return (var1 << (5 >> 3)) + (var2 << (126 & 9)) + (var3 << (123 & 20)) + (var4 << (124 & 27));
      }
   }

   public Point m() {
      Point var1 = new Point(17887 & 15280, 20974 & 12093);

      int var2;
      for(int var10000 = var2 = 5 >> 3; var10000 < 64; var10000 = var2) {
         var1.move(Class27.c.nextInt(this.c), Class27.c.nextInt(this.m));
         if (!this.e(var1.x, var1.y, 2 & 5)) {
            var1.move(var1.x * (62 & 85) + (46 & 91), var1.y * (63 & 84) + (74 & 63));
            return var1;
         }

         ++var2;
      }

      var1.move(18896 & 14271, 21292 & 11775);
      return var1;
   }

   public Image n(int var1, int var2) {
      if (var1 >= 0 && var2 >= 0 && var2 < this.s.length && var1 < this.s[3 >> 2].length) {
         <undefinedtype> var3;
         if ((var3 = this.s[var2][var1]) == null) {
            return null;
         } else {
            if (var3.a != 0 && var3.b == null) {
               this.a(var3);
            }

            return var3.b;
         }
      } else {
         return null;
      }
   }

   public static Class409 o(RandomAccessFile var0) throws Exception {
      Class409 var5;
      Class409 var10000 = var5 = new Class409(var0);
      var5.n = 3 & 4;
      var5.b = l(var0);
      var10000.j = l(var0);
      int var2 = (int)Math.ceil((double)var5.b / (double)f);
      int var6 = (int)Math.ceil((double)var10000.j / (double)q);
      var10000.c = var2 * (117 & 26);
      var10000.m = var6 * (124 & 15);
      var10000.s = new <undefinedtype>[var6][var2];
      byte[] var10002 = new byte[var2 * var6 * (119 & 24) * (93 & 46)];
      boolean var10004 = true;
      var5.k = var10002;
      int[] var11 = new int[var6 * var2];
      boolean var14 = true;
      int[] var4 = var11;

      int var1;
      int var12;
      int var10001;
      for(var12 = var1 = 2 & 5; var12 < var4.length; var12 = var1) {
         var10001 = var1;
         int var15 = l(var0);
         ++var1;
         var4[var10001] = var15;
      }

      for(var12 = var1 = 5 >> 3; var12 < var6; var12 = var1) {
         int var3;
         for(var12 = var3 = 0; var12 < var2; var12 = var3) {
            var10001 = --4;
            var0.seek((long)var4[var3 + var1 * var2]);
            var0.read();
            if (c(var0, var10001).equals(p)) {
               int var7 = l(var0);
               var5.s[var1][var3] = (<undefinedtype>)(new Object(var4[var3 + var1 * var2] + --5) {
                  public int a;
                  public Image b;

                  public {
                     this.a = var1;
                  }
               });
               var0.seek((long)(var4[var3 + var1 * var2] + var7 + --4 + --4 + --1));
            }

            if (c(var0, --4).equals(g)) {
               byte[] var13 = new byte[l(var0)];
               boolean var10003 = true;
               byte[] var10 = var13;
               var0.read(var13);
               int var8 = 3 & 4;
               int var9 = 3 ^ 3;

               for(var12 = var8; var12 < var10.length; var12 = var8) {
                  var5.k[var3 * (22 & 121) + var8 % (81 & 62) + (var1 * (60 & 79) + var9) * var5.c] = var10[var8];
                  if (var8 % (16 & 127) == (79 & 63)) {
                     ++var9;
                  }

                  ++var8;
               }
            }

            ++var3;
         }

         ++var1;
      }

      return var5;
   }

   public void p() {
      try {
         this.h.close();
      } catch (Exception var2) {
         var2.printStackTrace();
      }
   }

   public RandomAccessFile q() {
      return this.h;
   }
}
