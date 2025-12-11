package com.xy.w;

import java.io.IOException;
import java.io.RandomAccessFile;

public class Class4 {
   private int a;
   public RandomAccessFile b;

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public boolean a() {
      Class4 var1 = this;
      synchronized (this) {
         if (this.a++ > 7) {
            Class4 var5;
            label25: {
               try {
                  this.b.close();
                  this.b = null;
               } catch (Exception var3) {
                  var5 = var1;
                  var3.printStackTrace();
                  break label25;
               }

               var5 = var1;
            }

            // $VF: monitorexit
            return true;
         } else {
            return false;
         }
      }
   }

   public int b() {
      return this.a;
   }

   public Class4(String var1) {
      try {
         String var10004 = "\u0010";
         this.b = new RandomAccessFile(var1, "r");
      } catch (Exception var3) {
      }
   }

   public void c(int var1) {
      this.a = var1;
   }

   public void d(long var1, byte[] var3) throws IOException {
      synchronized (this) {
         this.a = 0;
         this.b.seek(var1);
         this.b.read(var3);
      }
   }

   public static String e(String var0) {
      int var10000 = 5 << 3;
      int var10001 = 1 << 3 ^ 1;
      int var10002 = 5 << 4 ^ 3 << 1;
      String var5;
      int var10003 = (var5 = var0).length();
      char[] var10005 = new char[var10003];
      int var3;
      int var9 = var3 = var10003 - 1;
      char[] var1 = var10005;
      int var4 = var10002;
      var10000 = var9;

      for (int var2 = var10001; var10000 >= 0; var10000 = var3) {
         var10001 = var3;
         int var10 = var5.charAt(var3);
         var3--;
         var1[var10001] = (char)(var10 ^ var2);
         if (var3 < 0) {
            break;
         }

         var10 = var3--;
         var1[var10] = (char)(var5.charAt(var10) ^ var4);
      }

      return new String(var1);
   }
}
