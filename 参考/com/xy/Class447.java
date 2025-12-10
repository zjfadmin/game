package com.xy;

import java.io.IOException;
import java.io.RandomAccessFile;

public class Class447 {
   private int a;
   public RandomAccessFile b;

   public boolean a() {
      Class447 var1 = this;
      synchronized(this) {
         int var10002 = this.a;
         this.a = var10002 + (3 & 5);
         if (var10002 <= (55 & 79)) {
            return false;
         }

         Class447 var10000;
         label26: {
            try {
               this.b.close();
               this.b = null;
            } catch (Exception var3) {
               var10000 = var1;
               var3.printStackTrace();
               break label26;
            }

            var10000 = var1;
         }

      }

      return (boolean)(3 >> 1);
   }

   public int b() {
      return this.a;
   }

   public Class447(String var1) {
      try {
         this.b = new RandomAccessFile(var1, "r");
      } catch (Exception var2) {
      }
   }

   public void c(long var1, byte[] var3) throws IOException {
      synchronized(this) {
         this.a = 3 & 4;
         this.b.seek(var1);
         this.b.read(var3);
      }
   }

   public void d(int var1) {
      this.a = var1;
   }
}
