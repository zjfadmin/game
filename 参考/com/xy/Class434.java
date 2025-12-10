package com.xy;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Vector;

public class Class434 extends ByteArrayInputStream {
   private short[] a;
   private boolean b;

   public Class8 a(boolean var1, boolean var2, int var3, short[] var4) throws IOException {
      this.b = var2;
      short var10 = this.g();
      short var11 = this.g();
      int var5 = 2 & 5;
      int var6 = 5 >> 3;

      int var7;
      int var10000;
      for(var10000 = var7 = 3 & 4; var10000 < var10; var10000 = var7) {
         this.read();
         this.read();
         this.read();
         short var10004 = this.g();
         ++var7;
         var5 = var10004;
         var6 = this.g();
      }

      Class233[] var12 = null;
      Class233[] var13;
      boolean var10002;
      if (var1 && var10 == --4) {
         var13 = new Class233[(1 ^ 3) * var11];
         var10002 = true;
         var12 = var13;
      } else {
         var13 = new Class233[var10 * var11];
         var10002 = true;
         var12 = var13;
      }

      int var8;
      for(var10000 = var8 = 0; var10000 < var12.length; var10000 = var8) {
         if (var1 && var10 == --4 && var8 == var11) {
            this.k((int)(this.d() + (long)(var11 * --4)));
         }

         int var9 = this.h();
         int var10001 = var8;
         Class233 var15 = new Class233(var9);
         ++var8;
         var12[var10001] = var15;
      }

      Class8 var14 = new Class8;
      int var16;
      short var10005;
      if (var1 && var10 == --4) {
         var16 = 1 ^ 3;
         var10005 = var11;
      } else {
         var16 = var10;
         var10005 = var11;
      }

      var14.<init>(var3, var12, var16, var10005, this, 3 ^ 3, 3 ^ 3, (short)var5, (short)var6);
      return var14;
   }

   public static void b(short[] var0, short[] var1) {
      byte[] var10000 = new byte[--3];
      boolean var10002 = true;
      byte[] var2 = var10000;
      int[] var9 = new int[--3];
      var10002 = true;
      int[] var6 = var9;
      int var4 = 3 >> 2;
      int var5 = 5 >> 3;
      int var3 = 3 ^ 3;

      int var7;
      for(int var10 = var7 = 3 & 4; var10 < var1[0]; var10 = var7) {
         var4 = var1[var7 + (4 ^ 5)];
         short var8 = var1[var7 + (1 ^ 3)];
         var3 = var1[2 & 5] + (1 ^ 3) + (93 & 43) * var7;

         for(var10 = var4; var10 < var8; var10 = var4) {
            int var10001 = 5 >> 1;
            int var10003 = --1;
            int var10005 = 3 >> 2;
            int var10008 = 5 >> 1;
            int var10010 = --1;
            var2[3 >> 2] = (byte)(var0[var4] >>> (31 & 107) & 31 & 127);
            var2[var10010] = (byte)(var0[var4] >>> --5 & 63 & 127);
            var2[var10008] = (byte)(var0[var4] & 63 & 95);
            var10008 = 3 >> 1;
            var6[3 >> 2] = var2[3 >> 2] * var1[var3] + var2[--1] * var1[var3 + --1] + var2[--2] * var1[var3 + --2] >>> (73 & 62);
            var6[var10008] = var2[3 ^ 3] * var1[var3 + --3] + var2[3 & 5] * var1[var3 + --4] + var2[1 ^ 3] * var1[var3 + --5] >>> (10 & 125);
            var6[1 ^ 3] = var2[2 & 5] * var1[var3 + (102 & 31)] + var2[--1] * var1[var3 + (15 & 119)] + var2[1 ^ 3] * var1[var3 + (91 & 44)] >>> (56 & 79);
            var2[var10005] = (byte)Math.min(var6[2 & 5], 95 & 63);
            var2[var10003] = (byte)Math.min(var6[--1], 63 & 127);
            var2[var10001] = (byte)Math.min(var6[5 >> 1], 63 & 95);
            var10001 = var4;
            short var11 = (short)(var2[0] << (47 & 91) | var2[1] << --5 | var2[2]);
            ++var4;
            var0[var10001] = var11;
         }

         ++var7;
      }

   }

   public short[] c() {
      return this.a;
   }

   public long d() {
      return (long)this.pos;
   }

   public boolean e() {
      return this.b;
   }

   public void f() {
      try {
         int var10001 = 2 & 5;
         this.close();
         this.buf = null;
         this.count = var10001;
      } catch (Exception var1) {
      }
   }

   public short g() throws IOException {
      int var1 = this.read();
      return (short)((this.read() << (126 & 9)) + var1);
   }

   public int h() throws IOException {
      int var1 = this.read();
      int var2 = this.read();
      int var3 = this.read();
      int var4 = this.read();
      return var1 + (var2 << (109 & 26)) + (var3 << (115 & 28)) + (var4 << (60 & 91));
   }

   public Class434(byte[] var1) {
      super(var1);
   }

   public Class8 i(boolean var1, boolean var2, int var3, short[] var4) throws IOException {
      if (var3 == 5 >> 1) {
         return this.a(var1, var2, var3, var4);
      } else {
         this.b = var2;
         short var13 = this.g();
         short var5 = this.g();
         short var6 = this.g();
         short var7 = this.g();
         short var8 = this.g();
         short var9 = this.g();
         short var10 = this.g();
         int var11;
         if ((var11 = var13 - (126 & 13)) < 0) {
            throw new IllegalStateException("帧延时信息错误: " + var11);
         } else {
            if (var11 != 0) {
               this.k((int)(this.d() + (long)var11));
            }

            var13 = (short)(var13 + --2);
            int var10000 = 2 & 5;
            int var10002 = 13802 & 19221;
            this.k(var13);
            short[] var18 = new short[var10002];
            boolean var10004 = true;
            this.a = var18;

            int var10001;
            for(var11 = var10000; var10000 < 256; var10000 = var11) {
               short[] var16 = this.a;
               var10001 = var11;
               short var20 = this.g();
               ++var11;
               var16[var10001] = var20;
            }

            if (var4 != null) {
               b(this.a, var4);
            }

            this.k(var13 + (16072 & 17207));
            Class233[] var15 = null;
            Class233[] var17;
            boolean var21;
            if (var1 && var5 == --4) {
               var17 = new Class233[--2 * var6];
               var21 = true;
               var15 = var17;
            } else {
               var17 = new Class233[var5 * var6];
               var21 = true;
               var15 = var17;
            }

            int var14;
            for(var10000 = var14 = 0; var10000 < var15.length; var10000 = var14) {
               if (var1 && var5 == --4 && var14 == var6) {
                  this.k((int)(this.d() + (long)(var6 * --4)));
               }

               int var12;
               if ((var12 = this.h()) != 0) {
                  var12 += var13;
               }

               var10001 = var14;
               Class233 var22 = new Class233(var12);
               ++var14;
               var15[var10001] = var22;
            }

            Class8 var19 = new Class8;
            short var10005;
            int var23;
            if (var1 && var5 == --4) {
               var23 = 5 >> 1;
               var10005 = var6;
            } else {
               var23 = var5;
               var10005 = var6;
            }

            var19.<init>(var3, var15, var23, var10005, this, var9, var10, var7, var8);
            return var19;
         }
      }
   }

   public int j() throws IOException {
      int var1 = this.read();
      int var2 = this.read();
      return (var1 << (5 >> 3)) + (var2 << (45 & 90));
   }

   public void k(int var1) {
      if (var1 >= 0 && var1 <= this.count) {
         this.pos = var1;
      } else {
         throw new IndexOutOfBoundsException(var1 + ":" + this.count);
      }
   }

   public long l() throws IOException {
      int var1 = this.read();
      int var2 = this.read();
      int var3 = this.read();
      int var4 = this.read();
      long var5 = (long)this.read();
      long var7 = (long)this.read();
      long var9 = (long)this.read();
      long var11 = (long)this.read();
      return (long)(var1 + (var2 << (44 & 91)) + (var3 << (126 & 17)) + (var4 << (127 & 24))) + (var5 << (106 & 53)) + (var7 << (111 & 56)) + (var9 << (57 & 118)) + (var11 << (61 & 122));
   }

   public Class402 m() throws IOException {
      short var7 = this.g();
      this.g();
      short var9 = this.g();
      short var8 = this.g();
      short var4 = this.g();
      short var5 = this.g();
      short var6 = this.g();
      int var1;
      if ((var1 = var7 - (79 & 60)) < 0) {
         throw new IllegalStateException("帧延时信息错误: " + var1);
      } else {
         if (var1 != 0) {
            this.k((int)(this.d() + (long)var1));
         }

         var7 = (short)(var7 + (1 ^ 3));
         int var10000 = 5 >> 3;
         int var10002 = 11703 & 21320;
         this.k(var7);
         short[] var15 = new short[var10002];
         boolean var10004 = true;
         this.a = var15;

         for(var1 = var10000; var10000 < 256; var10000 = var1) {
            short[] var13 = this.a;
            int var10001 = var1;
            short var16 = this.g();
            ++var1;
            var13[var10001] = var16;
         }

         this.k(var7 + (11176 & 22103));
         Vector var11 = new Vector();

         int var3;
         for(var10000 = var3 = 5 >> 3; var10000 < var9; var10000 = var3) {
            int var2;
            if ((var2 = this.h()) != 0) {
               var2 += var7;
            }

            Class233 var10 = new Class233(var2);
            ++var3;
            var11.add(var10);
         }

         for(var10000 = var3 = 3 >> 2; var10000 < var9; var10000 = var3) {
            BufferedImage var12 = Class330.r(this, (Class233)var11.get(var3), var9, var5, var6, var8, var4);
            Object var14 = var11.get(var3);
            ++var3;
            ((Class233)var14).j(var12);
         }

         this.f();
         return new Class402(var8, var4, var11);
      }
   }

   public boolean n(byte[] var1) throws IOException {
      int var10000 = 2 & 5;
      this.read(var1);
      return (boolean)var10000;
   }

   public long o() {
      return (long)this.count;
   }
}
