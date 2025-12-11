package com.xy.w;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Vector;

public class Class10 extends ByteArrayInputStream {
   private short[] a;
   private boolean b;

   public long a() {
      return this.count;
   }

   public static void b(short[] var0, short[] var1) {
      byte[] var2 = new byte[3];
      int[] var3 = new int[3];
      int var4 = 0;
      short var5 = 0;
      int var6 = 0;

      int var7;
      for (int var10000 = var7 = 0; var10000 < var1[0]; var10000 = ++var7) {
         var4 = var1[var7 + 1];
         var5 = var1[var7 + 2];
         var6 = var1[0] + 2 + 9 * var7;

         for (int var11 = var4; var11 < var5; var11 = var4) {
            var2[0] = (byte)(var0[var4] >>> 11 & 31);
            var2[1] = (byte)(var0[var4] >>> 5 & 63);
            var2[2] = (byte)(var0[var4] & 31);
            var3[0] = var2[0] * var1[var6] + var2[1] * var1[var6 + 1] + var2[2] * var1[var6 + 2] >>> 8;
            var3[1] = var2[0] * var1[var6 + 3] + var2[1] * var1[var6 + 4] + var2[2] * var1[var6 + 5] >>> 8;
            var3[2] = var2[0] * var1[var6 + 6] + var2[1] * var1[var6 + 7] + var2[2] * var1[var6 + 8] >>> 8;
            var2[0] = (byte)Math.min(var3[0], 31);
            var2[1] = (byte)Math.min(var3[1], 63);
            var2[2] = (byte)Math.min(var3[2], 31);
            int var10001 = var4;
            short var10002 = (short)(var2[0] << 11 | var2[1] << 5 | var2[2]);
            var4++;
            var0[var10001] = var10002;
         }
      }
   }

   public short[] c() {
      return this.a;
   }

   public long d() {
      return this.pos;
   }

   public boolean e() {
      return this.b;
   }

   public void f(int var1) {
      if (var1 >= 0 && var1 <= this.count) {
         this.pos = var1;
      } else {
         StringBuilder var10002 = new StringBuilder().append(var1);
         String var10003 = "8";
         throw new IndexOutOfBoundsException(var10002.append(":").append(this.count).toString());
      }
   }

   public short g() throws IOException {
      int var1 = this.read();
      return (short)((this.read() << 8) + var1);
   }

   public Class10(byte[] var1) {
      super(var1);
   }

   public void h() {
      try {
         this.close();
         this.buf = null;
         this.count = 0;
      } catch (Exception var2) {
      }
   }

   public boolean i(byte[] var1) throws IOException {
      this.read(var1);
      return false;
   }

   public Class1 j(boolean var1, boolean var2, int var3, short[] var4) throws IOException {
      this.b = var2;
      short var5 = this.g();
      short var6 = this.g();
      short var7 = this.g();
      short var8 = this.g();
      short var9 = this.g();
      short var10 = this.g();
      short var11 = this.g();
      int var12;
      if ((var12 = var5 - 12) < 0) {
         String var24 = "帥廤旴俳恭锋语(\"";
         throw new IllegalStateException("帧延时信息错误: " + var12);
      } else {
         if (var12 != 0) {
            this.f((int)(this.d() + var12));
         }

         var5 = (short)(var5 + 2);
         int var10000 = 0;
         this.f(var5);
         this.a = new short[256];

         for (int var13 = 0; var10000 < 256; var10000 = var13) {
            short[] var19 = this.a;
            int var10001 = var13;
            short var10002 = this.g();
            var13++;
            var19[var10001] = var10002;
         }

         if (var4 != null) {
            b(this.a, var4);
         }

         this.f(var5 + 512);
         Object var17 = null;
         if (var1 && var6 == 4) {
            var17 = new Class3[2 * var7];
         } else {
            var17 = new Class3[var6 * var7];
         }

         int var14;
         for (int var20 = var14 = 0; var20 < ((Object[])var17).length; var20 = var14) {
            if (var1 && var6 == 4 && var14 == var7) {
               this.f((int)(this.d() + var7 * 4));
            }

            int var15;
            if ((var15 = this.k()) != 0) {
               var15 += var5;
            }

            int var22 = var14;
            Class3 var23 = new Class3(var15);
            var14++;
            ((Object[])var17)[var22] = var23;
         }

         Class1 var21 ;
         short var10003;
         short var10004;
         if (var1 && var6 == 4) {
            var10003 = 2;
            var10004 = var7;
         } else {
            var10003 = var6;
            var10004 = var7;
         }

         var21= new Class1((Class3[])var17, var10003, var10004, this, var10, var11, var8, var9);
         return var21;
      }
   }

   public int k() throws IOException {
      int var1 = this.read();
      int var2 = this.read();
      int var3 = this.read();
      int var4 = this.read();
      return var1 + (var2 << 8) + (var3 << 16) + (var4 << 24);
   }

   public Class7 l() throws IOException {
      short var1 = this.g();
      short var2 = this.g();
      short var3 = this.g();
      short var4 = this.g();
      short var5 = this.g();
      short var6 = this.g();
      short var7 = this.g();
      int var8;
      if ((var8 = var1 - 12) < 0) {
         String var10004 = "帐庡旁侶恘镎诘m\u0017";
         throw new IllegalStateException("帧延时信息错误: " + var8);
      } else {
         if (var8 != 0) {
            this.f((int)(this.d() + var8));
         }

         var1 = (short)(var1 + 2);
         int var10000 = 0;
         this.f(var1);
         this.a = new short[256];

         for (int var9 = 0; var10000 < 256; var10000 = var9) {
            short[] var17 = this.a;
            int var10001 = var9;
            short var10002 = this.g();
            var9++;
            var17[var10001] = var10002;
         }

         this.f(var1 + 512);
         Vector var14 = new Vector();

         int var10;
         for (int var18 = var10 = 0; var18 < var3; var18 = var10) {
            int var11;
            if ((var11 = this.k()) != 0) {
               var11 += var1;
            }

            Class3 var12 = new Class3(var11);
            var10++;
            var14.add(var12);
         }

         for (int var19 = var10 = 0; var19 < var3; var19 = var10) {
            BufferedImage var16 = Class11.aa(this, (Class3)var14.get(var10), var3, var6, var7, var4, var5);
            Object var20 = var14.get(var10);
            var10++;
            ((Class3)var20).m(var16);
         }

         this.h();
         return new Class7(var14);
      }
   }

   public long m() throws IOException {
      int var1 = this.read();
      int var2 = this.read();
      int var3 = this.read();
      int var4 = this.read();
      long var5 = this.read();
      long var7 = this.read();
      long var9 = this.read();
      long var11 = this.read();
      return var1 + (var2 << 8) + (var3 << 16) + (var4 << 24) + (var5 << 32) + (var7 << 40) + (var9 << 48) + (var11 << 56);
   }
}
