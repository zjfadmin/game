package com.xy.richtext;

import com.xy.ho;

public class RichBeau {
   private int skin;
   private RichBeauUnit[] units;
   private int lvl;

   public boolean init() {
      if (!this.isDraw()) {
         return false;
      } else {
         int var10000;
         int var1;
         for(var10000 = var1 = 3 & 4; var10000 < this.units.length; var10000 = var1) {
            RichBeauUnit var4 = this.units[var1];
            StringBuilder var10001 = (new StringBuilder(String.valueOf(RichLabel.PATH))).append(this.skin).append("\\").append(this.units[var1].getBh()).append(".png");
            ++var1;
            var4.setImage(ho.a(var10001.toString()));
         }

         for(var10000 = var1 = 3 ^ 3; var10000 < this.units.length; var10000 = var1) {
            if (this.units[var1].getWidth() == -4 >> 2) {
               try {
                  Thread.sleep(10L);
               } catch (Exception var3) {
                  var3.printStackTrace();
               }

               --var1;
            }

            ++var1;
         }

         return (boolean)(4 ^ 5);
      }
   }

   public RichBeau() {
   }

   public RichBeau(String var1, int var2, int var3) {
      int var10000 = 5 >> 3;
      super();
      int var4 = var10000;

      int var5;
      for(var10000 = var5 = 3 ^ 3; var10000 < var3; var10000 = var5) {
         if ((var5 = var1.indexOf(",", var2 + (3 & 5))) == -4 >> 2 || var5 > var3) {
            var5 = var3;
         }

         if (var4 == 0) {
            var10000 = var5;
            this.lvl = Integer.parseInt(var1.substring(var2, var5));
         } else if (var4 != 3 >> 1) {
            if (var4 == 5 >> 1) {
               this.skin = Integer.parseInt(var1.substring(var2, var5));
            }

            var10000 = var5;
         } else {
            RichBeauUnit[] var10001 = new RichBeauUnit[var5 - var2];
            boolean var10003 = true;
            this.units = var10001;

            int var6;
            for(var10000 = var6 = 3 ^ 3; var10000 < this.units.length; var10000 = var6) {
               RichBeauUnit[] var7 = this.units;
               int var8 = var6;
               RichBeauUnit var10002 = new RichBeauUnit(var1.charAt(var2 + var6) - (63 & 112));
               ++var6;
               var7[var8] = var10002;
            }

            var10000 = var5;
         }

         ++var4;
         var2 = var10000 + 1;
      }

      if (this.lvl >= --2) {
         this.skin = --5;
      }

   }

   public void setUnits(RichBeauUnit[] var1) {
      this.units = var1;
   }

   public RichBeauUnit[] getUnits() {
      return this.units;
   }

   public RichBeau(String var1) {
      this(var1, 5 >> 3, var1.length());
   }

   public boolean isDraw() {
      return (boolean)(this.skin >= --1 && this.skin <= --5 ? 3 & 5 : 0);
   }
}
