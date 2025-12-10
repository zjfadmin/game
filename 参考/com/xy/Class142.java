package com.xy;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

public class Class142 {
   public static String a = "GBK";
   public static String b = "1234567890123456";
   static BASE64Encoder c;
   static String d = "AES/CBC/PKCS5Padding";
   public static String e = "UTF-8";
   public static Cipher f;
   static BASE64Decoder g;
   public static Cipher h;
   public static String i = "AES";

   public static synchronized String a(String var0, String var1) {
      try {
         if (var1.length() > (58 & 85)) {
            var1 = var1.substring(var1.length() - (26 & 117));
         }

         byte[] var6 = var1.getBytes(e);
         SecretKeySpec var2 = new SecretKeySpec(var6, "AES");
         Cipher var3 = Cipher.getInstance(d);
         IvParameterSpec var4 = new IvParameterSpec("0102030405060708".getBytes(e));
         var3.init(3 >> 1, var2, var4);
         BASE64Encoder var7 = new BASE64Encoder();
         byte[] var8 = var3.doFinal(Class97.b(var0.getBytes(a)));
         return Class695.b().toJson(var7.encode(var8));
      } catch (Exception var5) {
         var5.printStackTrace();
         return null;
      }
   }

   public static synchronized String b(String var0, String var1) {
      try {
         if (var0 != null && !var0.equals("")) {
            if (var1.length() > (82 & 61)) {
               var1 = var1.substring(var1.length() - (115 & 28));
            }

            byte[] var6 = var1.getBytes("ASCII");
            SecretKeySpec var2 = new SecretKeySpec(var6, i);
            Cipher var3 = Cipher.getInstance(d);
            IvParameterSpec var4 = new IvParameterSpec("0102030405060708".getBytes());
            var3.init(--2, var2, var4);
            BASE64Decoder var7 = new BASE64Decoder();
            var0 = (String)Class695.b().fromJson(var0, String.class);
            byte[] var8 = var7.decodeBuffer(var0);
            var8 = Class97.a(var3.doFinal(var8));
            String var9 = new String(var8, a);
            return var9;
         } else {
            return null;
         }
      } catch (Exception var5) {
         var5.printStackTrace();
         return null;
      }
   }

   public static synchronized String c(String var0) {
      try {
         byte[] var1 = Class97.b((Class280.e() + var0).getBytes(e));
         var1 = f.doFinal(var1);
         return Class695.b().toJson(c.encode(var1));
      } catch (Exception var2) {
         var2.printStackTrace();
         return null;
      }
   }

   public static synchronized String d(String var0) {
      try {
         var0 = (String)Class695.b().fromJson(var0, String.class);
         byte[] var1 = g.decodeBuffer(var0);
         byte[] var2 = Class97.a(h.doFinal(var1));
         String var4 = new String(var2, e);
         return var4;
      } catch (Exception var3) {
         var3.printStackTrace();
         return null;
      }
   }

   static {
      byte[] var0;
      SecretKeySpec var1;
      IvParameterSpec var2;
      try {
         var0 = b.getBytes(e);
         var1 = new SecretKeySpec(var0, "AES");
         f = Cipher.getInstance(d);
         var2 = new IvParameterSpec("0102030405060708".getBytes(e));
         f.init(4 ^ 5, var1, var2);
         c = new BASE64Encoder();
      } catch (Exception var4) {
         var4.printStackTrace();
      }

      try {
         var0 = b.getBytes("ASCII");
         var1 = new SecretKeySpec(var0, i);
         h = Cipher.getInstance("AES/CBC/PKCS5Padding");
         var2 = new IvParameterSpec("0102030405060708".getBytes());
         h.init(--2, var1, var2);
         g = new BASE64Decoder();
      } catch (Exception var3) {
         var3.printStackTrace();
      }
   }

   public static synchronized String e(String var0) {
      try {
         var0 = (String)Class695.b().fromJson(var0, String.class);
         byte[] var1 = g.decodeBuffer(var0);
         byte[] var2 = Class97.a(h.doFinal(var1));
         String var4 = new String(var2, a);
         return var4;
      } catch (Exception var3) {
         return null;
      }
   }
}
