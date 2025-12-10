package com.xy;

import java.io.IOException;

public class Class495 {
   public int[] a;
   public int[] b;
   public int[][] c;
   public int[] d;

   public void a(Class434 var1) throws IOException {
      int var2 = var1.read();
      int var3 = var1.read();
      this.a[3 >> 2] = var2;
      this.a[--1] = var3;
      Class434 var10000;
      if (var2 > var3) {
         var10000 = var1;
         this.a[--2] = ((79 & 54) * this.a[3 & 4] + this.a[3 >> 1]) / (79 & 55);
         this.a[--3] = (--5 * this.a[2 & 5] + (1 ^ 3) * this.a[2 ^ 3]) / (7 & 127);
         this.a[--4] = (--4 * this.a[3 ^ 3] + --3 * this.a[3 >> 1]) / (23 & 111);
         this.a[--5] = (--3 * this.a[2 & 5] + --4 * this.a[3 & 5]) / (111 & 23);
         this.a[71 & 62] = ((5 >> 1) * this.a[3 >> 2] + --5 * this.a[3 >> 1]) / (7 & 127);
         this.a[23 & 111] = (this.a[5 >> 3] + (7 & 126) * this.a[3 & 5]) / (23 & 111);
      } else {
         this.a[1 ^ 3] = (--4 * this.a[3 >> 2] + this.a[--1]) / --5;
         this.a[--3] = (--3 * this.a[3 >> 2] + (1 ^ 3) * this.a[--1]) / 5;
         this.a[4] = (2 * this.a[5 >> 3] + 3 * this.a[2 ^ 3]) / 5;
         this.a[5] = (this.a[0] + 4 * this.a[1]) / 5;
         this.a[62 & 71] = 0;
         this.a[63 & 71] = 2303 & 30719;
         var10000 = var1;
      }

      var2 = var10000.read();
      this.b[0] = var2 & 55 & 79;
      this.b[1] = var2 >> 3 & 55 & 79;
      var2 = var1.read() << 2 | var2 >> (87 & 46);
      this.b[2] = var2 & 127 & 7;
      this.b[3] = var2 >> 3 & 7;
      this.b[4] = var2 >> 6 & 7;
      var2 = var1.read() << 1 | var2 >> 9;
      this.b[5] = var2 & 7;
      this.b[6] = var2 >> 3 & 7;
      this.b[7] = var2 >> 6 & 7;
      var2 = var1.read();
      this.b[8] = var2 & 7;
      this.b[9] = var2 >> 3 & 7;
      var2 = var1.read() << 2 | var2 >> 6;
      this.b[10] = var2 & 7;
      this.b[11] = var2 >> 3 & 7;
      this.b[12] = var2 >> 6 & 7;
      var2 = var1.read() << 1 | var2 >> 9;
      this.b[13] = var2 & 7;
      this.b[14] = var2 >> 3 & 7;
      this.b[15] = var2 >> 6 & 7;
      var3 = var1.j();
      int var4 = var1.j();
      this.c[0][0] = (var3 >>> 11 & 31) << 3;
      this.c[0][1] = (var3 >>> 5 & 63) << 2;
      this.c[0][2] = (var3 & 31) << 3;
      this.c[1][0] = (var4 >>> 11 & 31) << 3;
      this.c[1][1] = (var4 >>> 5 & 63) << 2;
      this.c[1][2] = (var4 & 31) << 3;
      int var10001;
      int var5;
      int var7;
      if (var3 > var4) {
         for(var5 = var3 = 0; var5 < 3; var5 = var3) {
            this.c[2][var3] = (2 * this.c[0][var3] + this.c[1][var3]) / 3;
            int[] var6 = this.c[3];
            int[] var10002 = this.c[0];
            var10001 = var3;
            var7 = (var10002[var3] + 2 * this.c[1][var3]) / 3;
            ++var3;
            var6[var10001] = var7;
         }
      } else {
         for(var5 = var3 = 0; var5 < 3; var5 = var3) {
            this.c[2][var3] = (this.c[0][var3] + this.c[1][var3]) / 2;
            this.c[3][var3++] = 0;
         }
      }

      var3 = 0;
      var4 = 0;

      for(var5 = var3; var5 < 4; var5 = var3) {
         var2 = var1.read();
         this.d[var4] = var2 & 3;
         this.d[var4 + 1] = var2 >> 2 & 3;
         this.d[var4 + 2] = var2 >> 4 & 3;
         var10001 = var4 + 3;
         var7 = var2 >> 6 & 3;
         ++var3;
         this.d[var10001] = var7;
         var4 += 4;
      }

   }

   public Class495() {
      int var10001 = --4;
      int var10003 = 87 & 56;
      int var10005 = 93 & 42;
      super();
      int[] var1 = new int[var10005];
      boolean var10007 = true;
      this.a = var1;
      int[] var4 = new int[var10003];
      boolean var2 = true;
      this.b = var4;
      this.c = new int[var10001][--3];
      int[] var3 = new int[61 & 82];
      boolean var5 = true;
      this.d = var3;
   }
}
