package com.xy.v;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

public class Class23 {
   public static String a = "1234567890123456";
   public static Cipher b;
   public static String c = "UTF-8";
   static BASE64Decoder d;
   public static String e = "AES";
   static BASE64Encoder f;
   public static Cipher g;
   static String h = "AES/CBC/PKCS5Padding";
   public static String i = "GBK";

   public static synchronized String a(String var0) {
      try {
         var0 = Class31.a().fromJson(var0, String.class);
         byte[] var1 = d.decodeBuffer(var0);
         byte[] var2 = Class15.b(b.doFinal(var1));
         return new String(var2, i);
      } catch (Exception var4) {
         return null;
      }
   }

   public static synchronized String b(String var0, String var1) {
      try {
         if (var1.length() > 16) {
            var1 = var1.substring(var1.length() - 16);
         }

         byte[] var2 = var1.getBytes(c);
         SecretKeySpec var3 = new SecretKeySpec(var2, "AES");
         Cipher var4 = Cipher.getInstance(h);
         String var10002 = ">h>k>j>m>l>o>n>a";
         IvParameterSpec var5 = new IvParameterSpec("0102030405060708".getBytes(c));
         var4.init(1, var3, var5);
         BASE64Encoder var6 = new BASE64Encoder();
         byte[] var7 = var4.doFinal(Class15.a(var0.getBytes(i)));
         return Class31.a().toJson(var6.encode(var7));
      } catch (Exception var8) {
         var8.printStackTrace();
         return null;
      }
   }

   public static synchronized String c(String var0, String var1) {
      try {
         if (var1.length() > 16) {
            var1 = var1.substring(var1.length() - 16);
         }

         String var10001 = "xUzOp";
         byte[] var2 = var1.getBytes("ASCII");
         SecretKeySpec var3 = new SecretKeySpec(var2, e);
         Cipher var4 = Cipher.getInstance(h);
         String var10002 = ">h>k>j>m>l>o>n>a";
         IvParameterSpec var5 = new IvParameterSpec("0102030405060708".getBytes());
         var4.init(2, var3, var5);
         BASE64Decoder var6 = new BASE64Decoder();
         var0 = Class31.a().fromJson(var0, String.class);
         byte[] var7 = var6.decodeBuffer(var0);
         byte[] var8 = Class15.b(var4.doFinal(var7));
         return new String(var8, i);
      } catch (Exception var10) {
         var10.printStackTrace();
         return null;
      }
   }

   public static synchronized String d(String var0) {
      try {
         byte[] var1 = Class15.a((Class22.c() + var0).getBytes(c));
         var1 = g.doFinal(var1);
         return Class31.a().toJson(f.encode(var1));
      } catch (Exception var2) {
         var2.printStackTrace();
         return null;
      }
   }

   public static synchronized String e(String var0) {
      try {
         var0 = Class31.a().fromJson(var0, String.class);
         byte[] var1 = d.decodeBuffer(var0);
         byte[] var2 = Class15.b(b.doFinal(var1));
         return new String(var2, c);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   static {
      try {
         byte[] var0 = a.getBytes(c);
         SecretKeySpec var1 = new SecretKeySpec(var0, "AES");
         g = Cipher.getInstance(h);
         String var10002 = "6\b6\u000b6\n6\r6\f6\u000f6\u000e6\u0001";
         IvParameterSpec var2 = new IvParameterSpec("0102030405060708".getBytes(c));
         g.init(1, var1, var2);
         f = new BASE64Encoder();
      } catch (Exception var4) {
         var4.printStackTrace();
      }

      try {
         String var10001 = "\u0018]\u001aG\u0010";
         byte[] var5 = a.getBytes("ASCII");
         SecretKeySpec var6 = new SecretKeySpec(var5, e);
         b = Cipher.getInstance("AES/CBC/PKCS5Padding");
         String var8 = "6\b6\u000b6\n6\r6\f6\u000f6\u000e6\u0001";
         IvParameterSpec var7 = new IvParameterSpec("0102030405060708".getBytes());
         b.init(2, var6, var7);
         d = new BASE64Decoder();
      } catch (Exception var3) {
         var3.printStackTrace();
      }
   }
}
