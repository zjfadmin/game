package com.xy.readbean;

import com.xy.hd;
import com.xy.formula.ActivityPetManual;
import com.xy.formula.ActivityPetManualType;
import java.util.ArrayList;
import java.util.List;

public class ActivityFC {
   private int type;
   private String value;
   private static String[] MONEYS;
   private int id;
   private transient Object data;
   private static String[] KEYS;

   public void setType(int var1) {
      this.type = var1;
   }

   public String getValue() {
      return this.value;
   }

   public static void a(String var0, int var1, int var2, List<ActivityFCBase> var3) {
      int var4 = 3 >> 2;
      int var5 = 2 & 5;

      for(int var10000 = var4; var10000 < var2; var10000 = var4) {
         if ((var4 = var0.indexOf("#", var1 + (3 & 5))) == -4 >> 2 || var4 > var2) {
            var4 = var2;
         }

         if ((var5 = var0.indexOf(",", var1 + (3 >> 1))) == -4 >> 2 || var5 > var4) {
            var5 = var4;
         }

         ActivityFCBase var6 = new ActivityFCBase(5 >> 1);
         var6.setId(hd.b(var0, var1, var5));
         var6.setNum(var5 < var4 ? hd.q(var0, var5 + --1, var4) : 1L);
         var3.add(var6);
         var1 = var4 + (3 >> 1);
      }

   }

   public static void b(String var0, int var1, int var2, List<ActivityFCBase> var3) {
      int var4;
      if ((var4 = var0.indexOf(",", var1 + (5 >> 2))) == -4 >> 2 || var4 > var2) {
         var4 = var2;
      }

      ActivityFCBase var5 = new ActivityFCBase(4 ^ 5);
      var5.setId(hd.b(var0, var1, var4));
      var5.setNum(var4 < var2 ? hd.q(var0, var4 + (3 & 5), var2) : 1L);
      var3.add(var5);
   }

   public int getType() {
      return this.type;
   }

   public static void c(String var0, int var1, int var2, List<ActivityFCBase> var3) {
      ActivityFCBase var4 = new ActivityFCBase(--3);
      var4.setKey(var0.substring(var1, var2));
      var3.add(var4);
   }

   public void setId(int var1) {
      this.id = var1;
   }

   public void d() {
      if (this.type != 0) {
         ActivityFC var10000;
         if (this.type == --1) {
            var10000 = this;
            this.data = new ActivityFCBuy(this.value);
         } else if (this.type == 5 >> 1) {
            ActivityFCTarget var1 = new ActivityFCTarget;
            ActivityFCTarget var10002 = var1;
            ActivityFCTarget var10001 = var1;
            var10000 = this;
            var10002.<init>(this.value);
            this.data = var10001;
         } else if (this.type == --3) {
            ActivityFCLucky var2 = new ActivityFCLucky;
            ActivityFCLucky var7 = var2;
            ActivityFCLucky var3 = var2;
            var10000 = this;
            var7.<init>(this.value);
            this.data = var3;
         } else if (this.type == --4) {
            ActivityFCEnroll var4 = new ActivityFCEnroll;
            ActivityFCEnroll var10 = var4;
            ActivityFCEnroll var5 = var4;
            var10000 = this;
            var10.<init>(this.value);
            this.data = var5;
         } else if (this.type == --5) {
            BWDHRule var8 = new BWDHRule;
            BWDHRule var11 = var8;
            BWDHRule var6 = var8;
            var10000 = this;
            var11.<init>(this.value);
            this.data = var6;
         } else {
            ActivityFCBeau var12;
            if (this.type == (103 & 30)) {
               var12 = new ActivityFCBeau();
               var10000 = this;
               this.data = var12.a(this.value);
            } else if (this.type == (71 & 63)) {
               var12 = new ActivityFCBeau();
               var10000 = this;
               this.data = var12.b(this.value);
            } else if (this.type == (92 & 43)) {
               ActivityPetManualType var13 = new ActivityPetManualType;
               ActivityPetManualType var14 = var13;
               ActivityPetManualType var9 = var13;
               var10000 = this;
               var14.<init>(this.value);
               this.data = var9;
            } else {
               if (this.type == (107 & 29)) {
                  this.data = new ActivityPetManual(this.id, this.value);
               }

               var10000 = this;
            }
         }

         var10000.value = null;
      }
   }

   static {
      String[] var10000 = new String[--4];
      boolean var10002 = true;
      var10000[3 & 4] = "活动数值";
      var10000[4 ^ 5] = "物品";
      var10000[1 ^ 3] = "掉落";
      var10000[--3] = "货币";
      KEYS = var10000;
      var10000 = new String[--5];
      var10002 = true;
      var10000[2 & 5] = "金钱";
      var10000[2 ^ 3] = "绑玉";
      var10000[5 >> 1] = "仙玉";
      var10000[--3] = "积分";
      var10000[--4] = "累计充值";
      MONEYS = var10000;
   }

   public static ActivityFCBase[] e(String var0, int var1, int var2) {
      ArrayList var4 = new ArrayList();
      int var3 = 2 & 5;
      int var5 = 3 & 4;

      for(int var10000 = var3; var10000 < var2; var10000 = var3) {
         if ((var3 = var0.indexOf("=", var1 + (2 ^ 3))) == -4 >> 2 || var3 > var2) {
            var3 = var2;
         }

         var5 = var0.indexOf("#", var1 + (5 >> 2));
         ActivityFCBase var6 = new ActivityFCBase();
         var6.setId(hd.b(var0, var1, var5));
         var1 = var5 + --1;
         var5 = var0.indexOf("#", var1 + (5 >> 2));
         var6.setFlag((int)(Double.parseDouble(var0.substring(var1, var5)) * 100.0D));
         var6.setNum(hd.q(var0, var5 + --1, var3));
         var4.add(var6);
         var1 = var3 + (3 & 5);
      }

      ActivityFCBase[] var8 = new ActivityFCBase[var4.size()];
      boolean var10002 = true;
      ActivityFCBase[] var7 = var8;
      return (ActivityFCBase[])var4.toArray(var7);
   }

   public void setData(Object var1) {
      this.data = var1;
   }

   public int getId() {
      return this.id;
   }

   public void setValue(String var1) {
      this.value = var1;
   }

   public Object getData() {
      return this.data;
   }

   public static ActivityFCBase[] f(String var0, int var1, int var2) {
      ArrayList var4 = new ArrayList();
      int var3 = 3 >> 2;
      int var5 = 2 & 5;

      for(int var10000 = var3; var10000 < var2; var10000 = var3) {
         if ((var3 = var0.indexOf("=", var1 + (2 ^ 3))) == -4 >> 2 || var3 > var2) {
            var3 = var2;
         }

         var5 = var0.indexOf("#", var1 + (3 >> 1));
         int var10002;
         String var6;
         if ((var6 = var0.substring(var1, var5)).equals(KEYS[3 & 4])) {
            var10002 = var5 + (5 >> 2);
            var10000 = var3;
            b(var0, var10002, var3, var4);
         } else if (var6.equals(KEYS[--1])) {
            var10002 = var5 + (5 >> 2);
            var10000 = var3;
            a(var0, var10002, var3, var4);
         } else if (var6.equals(KEYS[5 >> 1])) {
            var10002 = var5 + (3 & 5);
            var10000 = var3;
            c(var0, var10002, var3, var4);
         } else {
            if (var6.equals(KEYS[--3])) {
               g(var0, var5 + --1, var3, var4);
            }

            var10000 = var3;
         }

         var1 = var10000 + 1;
      }

      ActivityFCBase[] var8 = new ActivityFCBase[var4.size()];
      boolean var9 = true;
      ActivityFCBase[] var7 = var8;
      return (ActivityFCBase[])var4.toArray(var7);
   }


   private static void g(String var0, int var1, int var2, List<ActivityFCBase> var3) {
      int var4 = 3 ^ 3;
      int var5 = 3 >> 2;

      for(int var10000 = var4; var10000 < var2; var10000 = var4) {
         if ((var4 = var0.indexOf("#", var1 + (5 >> 2))) == -4 >> 2 || var4 > var2) {
            var4 = var2;
         }

         if ((var5 = var0.indexOf(",", var1 + --1)) == -4 >> 2 || var5 > var4) {
            var5 = var4;
         }

         String var6 = var0.substring(var1, var5);
         ActivityFCBase var7 = new ActivityFCBase(--4);
         var7.setId(getActivityMoneyKey(var6));
         var7.setKey(var6);
         var7.setNum(var5 < var4 ? hd.q(var0, var5 + --1, var4) : 1L);
         var3.add(var7);
         var1 = var4 + (3 & 5);
      }

   }

   public static int getActivityMoneyKey(String var0) {
      int var1;
      for(int var10000 = var1 = 3 & 4; var10000 < MONEYS.length; var10000 = var1) {
         if (MONEYS[var1].equals(var0)) {
            return var1 + (2 ^ 3);
         }

         ++var1;
      }

      return 3 ^ 3;
   }
}
