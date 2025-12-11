package com.xy.v;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

public class Class15 {
   public static byte[] a(byte[] var0) {
      byte[] var1 = null;

      try {
         ByteArrayOutputStream var2 = new ByteArrayOutputStream();
         GZIPOutputStream var3 = new GZIPOutputStream(var2);
         var3.write(var0);
         var3.finish();
         var3.close();
         var1 = var2.toByteArray();
         var2.close();
         return var1;
      } catch (Exception var4) {
         var4.printStackTrace();
         return var1;
      }
   }

   public static byte[] b(byte[] var0) {
      byte[] var1 = null;

      try {
         ByteArrayInputStream var2 = new ByteArrayInputStream(var0);
         GZIPInputStream var3 = new GZIPInputStream(var2);
         byte[] var4 = new byte[1024];
         int var5 = -1;
         ByteArrayOutputStream var6 = new ByteArrayOutputStream();

         for (GZIPInputStream var10000 = var3; (var5 = var10000.read(var4, 0, var4.length)) != -1; var10000 = var3) {
            var6.write(var4, 0, var5);
         }

         var1 = var6.toByteArray();
         var6.flush();
         var6.close();
         var3.close();
         var2.close();
         return var1;
      } catch (Exception var7) {
         var7.printStackTrace();
         return var1;
      }
   }

   public static String c(byte[] var0) {
      StringBuffer var1 = new StringBuffer(var0.length);

      int var3;
      for (int var10000 = var3 = 0; var10000 < var0.length; var10000 = var3) {
         String var2;
         if ((var2 = Integer.toHexString(255 & var0[var3])).length() < 2) {
            var1.append(0);
         }

         var3++;
         var1.append(var2.toUpperCase());
      }

      return var1.toString();
   }
}
