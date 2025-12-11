package com.xy.n;

import com.xy.w.Class16;
import java.awt.Image;
import java.awt.Point;
import java.io.ByteArrayInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.RandomAccessFile;
import javax.imageio.ImageIO;

public class Class2 {
   public Class1[][] a;
   public byte[] b;
   public static int c = 240;
   private static String d = new String("GEPJ");
   private static String e = new String("hmap");
   private static String f = new String("HHYZ");
   public int g;
   public boolean h;
   public int i;
   public static int j = 320;
   private RandomAccessFile k;
   public int l;
   public long m;
   public int n;
   public int o;
   public int p;
   public static int q = 20;
   public int r;
   private static String s = new String("LLEC");

   public static void a(RandomAccessFile var0, byte[] var1) throws IOException {
      var0.read(var1);
   }

   public static short b(RandomAccessFile var0) throws IOException {
      int var1 = var0.read();
      int var2 = var0.read();
      if ((var1 | var2) < 0) {
         throw new EOFException();
      } else {
         return (short)((var1 << 0) + (var2 << 8));
      }
   }

   static {
      String var10002 = "OR^@";
      var10002 = "g{nf";
      var10002 = "@_WP";
      var10002 = "CZJU";
   }

   public boolean c(int var1, int var2, int var3) {
      return var1 < 0 || var2 < 0 || var2 >= this.p || var1 >= this.g || this.b[this.g * var2 + var1] == 0;
   }

   public static Class2 d(RandomAccessFile var0) throws Exception {
      Class2 var1;
      Class2 var10000 = var1 = new Class2(var0);
      var1.r = 1;
      int var2 = q(var0);
      int var3 = q(var0);
      int var4 = q(var0);
      int var5 = q(var0);
      var1.i = q(var0);
      var10000.o = q(var0);
      int var6 = (int)Math.ceil((double)var1.i / j);
      int var7 = (int)Math.ceil((double)var10000.o / c);
      var10000.g = var6 * 16;
      var10000.p = var7 * 12;
      var10000.a = new Class1[var7][var6];
      if (var2 != 0) {
         var0.seek(var2);
         int var8 = var0.read();
         byte[] var9;
         a(var0, var9 = new byte[q(var0)]);
         var9 = Class16.a(var9);
         var1.b = var9;
      }

      var0.seek(var5);

      int var11;
      int var14;
      for (int var15 = var11 = 0; var15 < var1.a.length; var15 = ++var11) {
         for (int var16 = var14 = 0; var16 < var1.a[0].length; var16 = var14) {
            int var10 = q(var0);
            Class1[] var17 = var1.a[var11];
            int var10001 = var14;
            Class1 var10002 = new Class1(var10);
            var14++;
            var17[var10001] = var10002;
         }
      }

      int var18 = 0;
      var1.h = true;

      for (int var12 = 0; var18 < var1.b.length; var18 = ++var12) {
         if (var1.b[var12] == 3) {
            var1.h = false;
            return var1;
         }
      }

      return var1;
   }

   public Class2(RandomAccessFile var1) {
      this.k = var1;
   }

   public static Class2 e(RandomAccessFile var0) throws Exception {
      Class2 var1;
      Class2 var10000 = var1 = new Class2(var0);
      var1.r = 0;
      var1.i = q(var0);
      var10000.o = q(var0);
      int var2 = (int)Math.ceil((double)var1.i / j);
      int var3 = (int)Math.ceil((double)var10000.o / c);
      var10000.g = var2 * 16;
      var10000.p = var3 * 12;
      var10000.a = new Class1[var3][var2];
      var1.b = new byte[var2 * var3 * 16 * 12];
      int[] var4 = new int[var3 * var2];

      int var5;
      for (int var12 = var5 = 0; var12 < var4.length; var12 = var5) {
         int var10001 = var5;
         int var10002 = q(var0);
         var5++;
         var4[var10001] = var10002;
      }

      int var6;
      for (int var13 = var5 = 0; var13 < var3; var13 = ++var5) {
         for (int var14 = var6 = 0; var14 < var2; var14 = ++var6) {
            var0.seek(var4[var6 + var5 * var2]);
            var0.read();
            if (o(var0, 4).equals(d)) {
               int var7 = q(var0);
               var1.a[var5][var6] = new Class1(var4[var6 + var5 * var2] + 5);
               var0.seek(var4[var6 + var5 * var2] + var7 + 4 + 4 + 1);
            }

            if (o(var0, 4).equals(s)) {
               byte[] var8;
               var0.read(var8 = new byte[q(var0)]);
               int var9 = 0;
               int var10 = 0;

               for (int var15 = var9; var15 < var8.length; var15 = ++var9) {
                  var1.b[var6 * 16 + var9 % 16 + (var5 * 12 + var10) * var1.g] = var8[var9];
                  if (var9 % 16 == 15) {
                     var10++;
                  }
               }
            }
         }
      }

      return var1;
   }

   public static Class2 f(String var0) throws Exception {
      String var10003 = "h";
      RandomAccessFile var1;
      String var2;
      if ((var2 = o(var1 = new RandomAccessFile(var0, "r"), 4)).equals(f)) {
         return e(var1);
      } else if (var2.equals(e)) {
         return d(var1);
      } else {
         var1.close();
         String var10002 = "朥石栳弙圿囨";
         throw new IllegalArgumentException("未知格式地图");
      }
   }

   public byte[] g(int var1) throws IOException {
      synchronized (this) {
         this.k.seek(var1);
         byte[] var3 = new byte[q(this.k)];
         a(this.k, var3);
         return var3;
      }
   }

   public boolean h(int var1, int var2, int var3) {
      return var1 > 0 && var2 > 0 && var2 < this.p && var1 < this.g && this.b[this.g * var2 + var1] == 2;
   }

   public RandomAccessFile i() {
      return this.k;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void j(Class1 var1) {
      Class1 var2 = var1;
      synchronized (var1) {
         Class1 var10000;
         label39: {
            try {
               if (var1.a == 0 || var1.b != null) {
                  return;
               }

               byte[] var3 = this.g(var1.a);
               if (this.r == 1) {
                  var3 = Class16.a(var3);
               }

               var1.b = ImageIO.read(new ByteArrayInputStream(var3));
            } catch (Exception var4) {
               var10000 = var2;
               var4.printStackTrace();
               break label39;
            }

            var10000 = var2;
         }

         // $VF: monitorexit
      }
   }

   public Point k() {
      Point var1 = new Point(400, 300);

      int var2;
      for (int var10000 = var2 = 0; var10000 < 64; var10000 = ++var2) {
         var1.move(com.xy.v.Class0.a.nextInt(this.g), com.xy.v.Class0.a.nextInt(this.p));
         if (!this.c(var1.x, var1.y, 0)) {
            var1.move(var1.x * 20 + 10, var1.y * 20 + 10);
            return var1;
         }
      }

      var1.move(400, 300);
      return var1;
   }

   public static Point l(String var0) throws Exception {
      String var10003 = "h";
      RandomAccessFile var1;
      String var2;
      if ((var2 = o(var1 = new RandomAccessFile(var0, "r"), 4)).equals(f)) {
         Point var10000 = new Point(q(var1), q(var1));
         var1.close();
         return var10000;
      } else if (var2.equals(e)) {
         var1.seek(20L);
         Point var3 = new Point(q(var1), q(var1));
         var1.close();
         return var3;
      } else {
         var1.close();
         String var10002 = "朥石栳弙圿囨";
         throw new IllegalArgumentException("未知格式地图");
      }
   }

   public void m() {
      try {
         this.k.close();
      } catch (Exception var2) {
         var2.printStackTrace();
      }
   }

   public boolean n(int var1, int var2, int var3) {
      return var1 > 0 && var2 > 0 && var2 < this.p && var1 < this.g && this.b[this.g * var2 + var1] == 3;
   }

   public static String o(RandomAccessFile var0, int var1) throws IOException {
      byte[] var2 = new byte[var1];
      a(var0, var2);
      return new String(var2);
   }

   public Image p(int var1, int var2) {
      if (var1 >= 0 && var2 >= 0 && var2 < this.a.length && var1 < this.a[0].length) {
         Class1 var3;
         if ((var3 = this.a[var2][var1]) == null) {
            return null;
         } else {
            if (var3.a != 0 && var3.b == null) {
               this.j(var3);
            }

            return var3.b;
         }
      } else {
         return null;
      }
   }

   public static int q(RandomAccessFile var0) throws IOException {
      int var1 = var0.read();
      int var2 = var0.read();
      int var3 = var0.read();
      int var4 = var0.read();
      if ((var1 | var2 | var3 | var4) < 0) {
         throw new EOFException();
      } else {
         return (var1 << 0) + (var2 << 8) + (var3 << 16) + (var4 << 24);
      }
   }
}
