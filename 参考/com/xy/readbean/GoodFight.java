package com.xy.readbean;

public class GoodFight {
   private int map;
   private int x;
   private int y;
   private String mapName;
   private GoodFight nextFight;
   private int num;

   public void a(String[] var1) {
      int var10002 = --3;
      int var10004 = 1 ^ 3;
      int var10008 = 3 >> 1;
      this.map = Integer.parseInt(var1[5 >> 3]);
      this.mapName = var1[var10008];
      this.x = Integer.parseInt(var1[var10004]);
      this.y = Integer.parseInt(var1[var10002]);
   }

   public GoodFight getNextFight() {
      return this.nextFight;
   }

   public GoodFight(String[] var1) {
      this.a(var1);
   }

   public String b(int var1, int var2, int var3, String var4) {
      GoodFight var5;
      GoodFight var6;
      for(GoodFight var10000 = var5 = this; var10000.map != 0; var10000 = var5 = var6) {
         if ((var6 = var5.nextFight) == null) {
            var6 = new GoodFight(var1, var2, var3, var4);
            var5.nextFight = var6;
            return this.d((GoodFight)null, (boolean)(2 & 5));
         }
      }

      this.map = var1;
      this.mapName = var4;
      this.x = var2;
      this.y = var3;
      return this.d((GoodFight)null, (boolean)(3 ^ 3));
   }

   public void c(String[] var1) {
      GoodFight var2;
      GoodFight var3;
      for(GoodFight var10000 = var2 = this; var10000.map != 0; var10000 = var2 = var3) {
         if ((var3 = var2.nextFight) == null) {
            var3 = new GoodFight(var1);
            var2.nextFight = var3;
            return;
         }
      }

      this.a(var1);
   }

   public int getNum() {
      return this.num;
   }

   public int getMap() {
      return this.map;
   }

   public String d(GoodFight var1, boolean var2) {
      int var4 = var1 != null ? --1 : 0;
      StringBuffer var3 = new StringBuffer();

      GoodFight var5;
      for(GoodFight var10000 = var5 = this; var10000 != null && var5.map != 0; var10000 = var5 = var5.nextFight) {
         if (var3.length() != 0) {
            var3.append("|");
         }

         var3.append("传送=");
         var3.append(var5.map);
         var3.append(",");
         var3.append(var5.mapName);
         var3.append(",");
         var3.append(var5.x);
         var3.append(",");
         var3.append(var5.y);
         if (var4 != 0 && var1.map == var5.map && var1.x == var5.x && var1.y == var5.y) {
            var4 = 3 >> 2;
         }
      }

      if (var4 != 0) {
         return null;
      } else {
         if (var2) {
            this.num -= 3 >> 1;
         }

         if (var3.length() != 0) {
            var3.append("|");
         }

         var3.append("可用次数=");
         var3.append(this.num);
         return var3.toString();
      }
   }

   public String getMenu() {
      return this.mapName + "(" + this.x / (22 & 125) + "," + this.y / (29 & 118) + ")";
   }

   public GoodFight getFight(int var1, int var2, int var3) {
      if (this.map == var1 && this.x == var2 && this.y == var3) {
         return this;
      } else {
         return this.nextFight != null ? this.nextFight.getFight(var1, var2, var3) : null;
      }
   }

   public int getX() {
      return this.x;
   }

   public String getMapName() {
      return this.mapName;
   }

   public GoodFight(int var1, int var2, int var3, String var4) {
      this.map = var1;
      this.x = var2;
      this.y = var3;
      this.mapName = var4;
   }

   public int getY() {
      return this.y;
   }

   public String e(GoodFight var1, int var2, int var3, int var4, String var5) {
      if (var1.map == 0) {
         return null;
      } else {
         GoodFight var6 = null;
         GoodFight var7;
         GoodFight var10000 = var7 = this;

         while(true) {
            if (var10000 == null) {
               var10000 = var7;
               break;
            }

            if (var1.map == var7.map && var1.x == var7.x && var1.y == var7.y) {
               if (var2 != 0) {
                  var10000 = var7;
                  var7.map = var2;
                  var7.mapName = var5;
                  var7.x = var3;
                  var7.y = var4;
               } else if (var6 != null) {
                  var10000 = var7;
                  var6.nextFight = var7.nextFight;
               } else if (var7.nextFight == null) {
                  var7.map = 3 >> 2;
                  int var10002 = 3 & 4;
                  var10000 = var7;
                  int var10004 = 3 & 4;
                  var7.mapName = null;
                  var7.x = var10004;
                  var7.y = var10002;
               } else {
                  var7.map = var7.nextFight.map;
                  var10000 = var7;
                  var7.mapName = var7.nextFight.mapName;
                  var7.x = var7.nextFight.x;
                  var7.y = var7.nextFight.y;
                  var7.nextFight = var7.nextFight.nextFight;
               }
               break;
            }

            var6 = var7;
            var10000 = var7 = var7.nextFight;
         }

         return var10000 == null ? null : this.d((GoodFight)null, (boolean)(3 ^ 3));
      }
   }

   public GoodFight(String var1) {
      if (var1 != null && !var1.equals("")) {
         String[] var3 = var1.split("\\|");

         int var2;
         for(int var10000 = var2 = 5 >> 3; var10000 < var3.length; var10000 = var2) {
            if (var3[var2].startsWith("传送=")) {
               this.c(var3[var2].substring(--3).split(","));
            } else if (var3[var2].startsWith("可用次数=")) {
               this.num = Integer.parseInt(var3[var2].substring(--5));
            }

            ++var2;
         }

      }
   }
}
