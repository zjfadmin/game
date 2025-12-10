package com.xy;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

public class Class97 {
   public static byte[] a(byte[] var0) {
      Object var1 = null;

      try {
         ByteArrayInputStream var2 = new ByteArrayInputStream(var0);
         GZIPInputStream var3 = new GZIPInputStream(var2);
         byte[] var10000 = new byte[32250 & 1541];
         boolean var10002 = true;
         byte[] var4 = var10000;
         int var5 = -4 >> 2;
         ByteArrayOutputStream var6 = new ByteArrayOutputStream();

         for(GZIPInputStream var9 = var3; (var5 = var9.read(var4, 3 & 4, var4.length)) != -4 >> 2; var9 = var3) {
            var6.write(var4, 5 >> 3, var5);
         }

         byte[] var8 = var6.toByteArray();
         var6.flush();
         var6.close();
         var3.close();
         var2.close();
         return var8;
      } catch (Exception var7) {
         var7.printStackTrace();
         return (byte[])var1;
      }
   }

   public static byte[] b(byte[] var0) {
      Object var1 = null;

      try {
         ByteArrayOutputStream var2 = new ByteArrayOutputStream();
         GZIPOutputStream var3 = new GZIPOutputStream(var2);
         var3.write(var0);
         var3.finish();
         var3.close();
         byte[] var5 = var2.toByteArray();
         var2.close();
         return var5;
      } catch (Exception var4) {
         var4.printStackTrace();
         return (byte[])var1;
      }
   }

   public static String c(byte[] var0) {
      StringBuffer var1 = new StringBuffer(var0.length);

      int var3;
      for(int var10000 = var3 = 3 ^ 3; var10000 < var0.length; var10000 = var3) {
         String var2;
         if ((var2 = Integer.toHexString(255 & var0[var3])).length() < --2) {
            var1.append(3 >> 2);
         }

         ++var3;
         var1.append(var2.toUpperCase());
      }

      return var1.toString();
   }
}
