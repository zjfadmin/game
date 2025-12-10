package com.xy.richtext;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class ChatFileRandom {
   public RandomAccessFile randomFile;
   public int use;

   public int getUse() {
      return this.use;
   }

   public void read(long var1, byte[] var3) throws IOException {
      synchronized(this) {
         this.use = 5 >> 3;
         this.randomFile.seek(var1);
         this.randomFile.read(var3);
      }
   }

   public ChatFileRandom(String var1, boolean var2) {
      try {
         File var4 = new File(var1);
         this.randomFile = new RandomAccessFile(var4, "rw");
         if (var2 && var4.exists()) {
            this.randomFile.setLength(0L);
            return;
         }
      } catch (Exception var3) {
         var3.printStackTrace();
      }

   }

   public boolean isEnd() {
      ChatFileRandom var1 = this;
      synchronized(this) {
         int var10002 = this.use;
         this.use = var10002 + --1;
         if (var10002 <= --3) {
            return false;
         }

         ChatFileRandom var10000;
         label26: {
            try {
               this.randomFile.close();
               this.randomFile = null;
            } catch (Exception var3) {
               var10000 = var1;
               var3.printStackTrace();
               break label26;
            }

            var10000 = var1;
         }

      }

      return (boolean)(4 ^ 5);
   }

   public void setUse(int var1) {
      this.use = var1;
   }

   public void setFileNew(boolean var1) {
      if (var1) {
         try {
            this.randomFile.setLength(0L);
         } catch (Exception var2) {
         }
      }
   }
}
