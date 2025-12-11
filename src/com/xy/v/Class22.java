package com.xy.v;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Class22 {
   public static int a = 60000;
   public static Calendar b = Calendar.getInstance(Locale.CHINA);
   static SimpleDateFormat c = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
   private static long d;
   private static long e;
   private static long f;
   private static int g = 3600000;
   public static int h = 200;
   private static int i = 60000;
   private static long j;
   public static int k = 300000;
   private static int l;
   private static long m;
   private static long n;
   public static int o = 10000;
   private static int p;
   private static long q;
   public static boolean r;
   private static Object s = new Object();
   private static long t = 1000000000000L;

   public static String a(long var0) {
      e++;
      f += var0;
      d += var0;
      synchronized (s) {
         t = Math.max(t, f());
      }

      if (e % 60L != 0L) {
         return null;
      } else {
         b.setTimeInMillis(f());
         int var5 = b.get(11);
         int var3 = b.get(12);
         if (var5 == p && var3 == l) {
            return null;
         } else {
            p = var5;
            l = var3;
            return g();
         }
      }
   }

   public static void b(long var0) {
      if (m < var0) {
         d = 0L;
         m = var0;
      }
   }

   public static long c() {
      synchronized (s) {
         return ++t;
      }
   }

   public static void d(long var0) {
      if (j != 0L) {
         b(var0);
      } else {
         j = var0;
         d = 0L;
         m = var0;
         f = var0;
         q = System.currentTimeMillis();
         synchronized (s) {
            t = Math.max(var0, t);
         }

         b.setTimeInMillis(f());
         p = b.get(11);
         l = b.get(12);
         g();
      }
   }

   public static String e() {
      StringBuilder var10000 = new StringBuilder().append(p < 10 ? "0" + p : p);
      String var10001 = "*";
      return var10000.append(":").append(l < 10 ? "0" + l : l).toString();
   }

   public static long f() {
      return m + d;
   }

   public static String g() {
      if (p == 23 || p == 0) {
         r = true;
         String var11 = "嬇\u0015斡";
         return "子 时";
      } else if (p == 1 || p == 2) {
         r = true;
         String var10 = "丁,旦";
         return "丑 时";
      } else if (p == 3 || p == 4) {
         r = true;
         String var9 = "宒\u0015斡";
         return "寅 时";
      } else if (p == 5 || p == 6) {
         r = true;
         String var8 = "卿,旦";
         return "卯 时";
      } else if (p == 7 || p == 8) {
         r = false;
         String var7 = "迧\u0015斡";
         return "辰 时";
      } else if (p == 9 || p == 10) {
         r = false;
         String var6 = "巣,旦";
         return "巳 时";
      } else if (p == 11 || p == 12) {
         r = false;
         String var5 = "匟\u0015斡";
         return "午 时";
      } else if (p == 13 || p == 14) {
         r = false;
         String var4 = "机,旦";
         return "未 时";
      } else if (p == 15 || p == 16) {
         r = false;
         String var3 = "畤\u0015斡";
         return "申 时";
      } else if (p == 17 || p == 18) {
         r = false;
         String var2 = "酙,旦";
         return "酉 时";
      } else if (p == 19 || p == 20) {
         r = true;
         String var1 = "迌\u0015斡";
         return "辛 时";
      } else if (p != 21 && p != 22) {
         String var0 = "嬇\u0015斡";
         return "子 时";
      } else {
         r = true;
         String var10000 = "亵,旦";
         return "亥 时";
      }
   }

   public static boolean h() {
      if (f - n < h) {
         return true;
      } else {
         n = f;
         return false;
      }
   }

   public static synchronized String i(long var0) {
      return c.format(new Date(var0));
   }

   static {
      String var10002 = ".L.Lzx\u001a\u00183Qw}\u001f\u000f:XmF$";
   }

   public static String j(long var0, String var2) {
      if (var2 == null || var2.isEmpty()) {
         String var10000 = ".L.Lzx\u001a\u00183Qw}\u001f\u000f:XmF$";
         var2 = "yyyy-MM-dd HH:mm:ss";
      }

      SimpleDateFormat var3 = new SimpleDateFormat(var2);
      return var3.format(new Date(var0));
   }

   public static String k(long var0) {
      var0 -= f();
      int var2 = (int)Math.max(0L, var0 / g);
      var0 -= var2 * g;
      int var3 = (int)Math.max(0L, var0 / i);
      long var6;
      var0 = (var6 = var0 - var3 * i) / 1000L;
      if (var2 > 0) {
         StringBuilder var11 = new StringBuilder(String.valueOf(var2));
         String var16 = "旦";
         var11 = var11.append("时").append(var3);
         var16 = "剑";
         var11 = var11.append("分").append(var0);
         var16 = "秂";
         return var11.append("秒").toString();
      } else if (var3 > 0) {
         StringBuilder var9 = new StringBuilder(String.valueOf(var3));
         String var14 = "剑";
         var9 = var9.append("分").append(var0);
         var14 = "秂";
         return var9.append("秒").toString();
      } else if (var0 > 0L) {
         StringBuilder var8 = new StringBuilder(String.valueOf(var0));
         String var10001 = "禅";
         return var8.append("秒").toString();
      } else {
         String var10000 = "<秂";
         return "0秒";
      }
   }

   public static long l() {
      return f;
   }
}
