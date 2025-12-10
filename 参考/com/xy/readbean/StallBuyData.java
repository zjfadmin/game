package com.xy.readbean;

import com.xy.hd;

public class StallBuyData {
   private String text;
   private transient StallBuyUnit[] units;
   private String name;
   private String value;
   private int id;
   private String skin;

   public StallBuyUnit[] getUnits() {
      return this.units;
   }

   public void setUnits(StallBuyUnit[] var1) {
      this.units = var1;
   }

   public String getName() {
      return this.name;
   }

   public void setSkin(String var1) {
      this.skin = var1;
   }

   public boolean a(Goodstable var1) {
      if (this.units == null) {
         return (boolean)(3 & 4);
      } else {
         int var4;
         for(int var10000 = var4 = 0; var10000 < this.units.length; var10000 = var4) {
            StallBuyUnit var3 = this.units[var4];
            int var2 = 5 >> 3;
            StallBuyUnit var5;
            if (var3.getType() == (3 & 5)) {
               var5 = var3;
               var2 = var1.getGoodsid().intValue();
            } else if (var3.getType() == (1 ^ 3)) {
               var5 = var3;
               var2 = var1.getType().intValue();
            } else {
               if (var3.getKey() != null) {
                  var2 = hd.an(var1.getValue(), var3.getKey(), "|");
               }

               var5 = var3;
            }

            if (!var5.a(var2)) {
               return (boolean)(3 ^ 3);
            }

            ++var4;
         }

         return (boolean)(2 ^ 3);
      }
   }

   public String getValue() {
      return this.value;
   }

   public int getId() {
      return this.id;
   }

   public String getSkin() {
      return this.skin;
   }

   public String getText() {
      return this.text;
   }

   public void setId(int var1) {
      this.id = var1;
   }

   public void setName(String var1) {
      this.name = var1;
   }

   public void b() {
      StallBuyUnit[] var10001 = new StallBuyUnit[--1 + hd.f((char)('\u007f' & '|'), this.value)];
      boolean var10003 = true;
      this.units = var10001;
      int var1 = 5 >> 3;
      int var2 = 3 >> 2;

      int var3;
      for(int var10000 = var3 = 3 ^ 3; var10000 < this.value.length(); var10000 = var3) {
         if ((var3 = this.value.indexOf("|", var2 + (4 ^ 5))) == -4 >> 2) {
            var3 = this.value.length();
         }

         this.units[var1] = new StallBuyUnit(this.value, var2, var3);
         ++var1;
         var2 = var3 + --1;
      }

      this.value = null;
   }

   public void setText(String var1) {
      this.text = var1;
   }

   public void setValue(String var1) {
      this.value = var1;
   }
}
