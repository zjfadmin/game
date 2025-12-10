package com.xy.bean;

public class BeauBean {
   private int lvl;
   private int skin;
   private int beau;

   public BeauBean(String var1) {
      this(var1, 3 ^ 3, var1.length());
   }

   public int getSkin() {
      return this.skin;
   }

   public int getBeau() {
      return this.beau;
   }

   public void setBeau(int var1) {
      this.beau = var1;
   }

   public int getLvl() {
      return this.lvl;
   }

   public void setSkin(int var1) {
      this.skin = var1;
   }

   public BeauBean() {
   }

   public String toString() {
      return this.lvl + "," + this.beau + "," + this.skin;
   }

   public boolean a() {
      return (boolean)(this.lvl == --1 && this.skin == 0 ? 3 & 4 : 1);
   }

   public BeauBean(String var1, int var2, int var3) {
      int var10000 = 2 & 5;
      super();
      int var4 = var10000;

      int var5;
      for(var10000 = var5 = 3 >> 2; var10000 < var3; var10000 = var5) {
         if ((var5 = var1.indexOf(",", var2 + --1)) == -4 >> 2 || var5 > var3) {
            var5 = var3;
         }

         if (var4 == 0) {
            var10000 = var5;
            this.lvl = Integer.parseInt(var1.substring(var2, var5));
         } else if (var4 == 5 >> 2) {
            var10000 = var5;
            this.beau = Integer.parseInt(var1.substring(var2, var5));
         } else {
            if (var4 == (1 ^ 3)) {
               this.skin = Integer.parseInt(var1.substring(var2, var5));
            }

            var10000 = var5;
         }

         ++var4;
         var2 = var10000 + 1;
      }

   }

   public void setLvl(int var1) {
      this.lvl = var1;
   }
}
