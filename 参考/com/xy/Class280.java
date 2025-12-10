package com.xy;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Class280 {
   private static long a;
   private static long b;
   private static long c;
   public static boolean d;
   private static int e = 3600000;
   public static int f;
   public static Calendar g;
   private static long h;
   public static int i = 27900 & 5067;
   private static long j;
   public static int k = 30493 & 12274;
   private static int l = 60000;
   private static Object m = new Object();
   public static int n = 60000;
   static SimpleDateFormat o;
   private static long p;
   public static int q;
   private static long r = 1000000000000L;
   private static long s;
   public static int t = 300000;
   public static int u;

   static {
      g = Calendar.getInstance(Locale.CHINA);
      o = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
   }

   public static String a() {
      if (u != (95 & 55) && u != 0) {
         if (u != --1 && u != 5 >> 1) {
            if (u != --3 && u != --4) {
               if (u != --5 && u != (86 & 47)) {
                  if (u != (39 & 95) && u != (109 & 26)) {
                     if (u != (61 & 75) && u != (59 & 78)) {
                        if (u != (63 & 75) && u != (77 & 62)) {
                           if (u != (93 & 47) && u != (110 & 31)) {
                              if (u != (79 & 63) && u != (121 & 22)) {
                                 if (u != (51 & 93) && u != (126 & 19)) {
                                    if (u != (27 & 119) && u != (61 & 86)) {
                                       if (u != 21 && u != 22) {
                                          return "子 时";
                                       } else {
                                          d = true;
                                          return "亥 时";
                                       }
                                    } else {
                                       d = true;
                                       return "辛 时";
                                    }
                                 } else {
                                    d = false;
                                    return "酉 时";
                                 }
                              } else {
                                 d = false;
                                 return "申 时";
                              }
                           } else {
                              d = false;
                              return "未 时";
                           }
                        } else {
                           d = false;
                           return "午 时";
                        }
                     } else {
                        d = false;
                        return "巳 时";
                     }
                  } else {
                     d = false;
                     return "辰 时";
                  }
               } else {
                  d = true;
                  return "卯 时";
               }
            } else {
               d = true;
               return "寅 时";
            }
         } else {
            d = true;
            return "丑 时";
         }
      } else {
         d = true;
         return "子 时";
      }
   }

   public static String b() {
      return (u < (30 & 107) ? "0" + u : u) + ":" + (q < (123 & 14) ? "0" + q : q);
   }

   public static String c(long var0, String var2) {
      if (var2 == null || var2.isEmpty()) {
         var2 = "yyyy-MM-dd HH:mm:ss";
      }

      SimpleDateFormat var3 = new SimpleDateFormat(var2);
      return var3.format(new Date(var0));
   }

   public static void d(long var0) {
      if (s < var0) {
         p = 0L;
         s = var0;
      }
   }

   public static long e() {
      synchronized(m) {
         return ++r;
      }
   }

   public static long f() {
      return s + p;
   }

   public static String g(long var0) {
      ++h;
      a += var0;
      p += var0;
      synchronized(m) {
         r = Math.max(r, f());
      }

      if (h % 60L != 0L) {
         return null;
      } else {
         g.setTimeInMillis(f());
         int var2 = g.get(15 & 123);
         int var1 = g.get(30 & 109);
         if (var2 == u && var1 == q) {
            return null;
         } else {
            f = g.get(95 & 39);
            u = var2;
            q = var1;
            return a();
         }
      }
   }

   public static String h(long var0) {
      var0 -= f();
      int var2 = (int)Math.max(0L, var0 / (long)e);
      var0 -= (long)(var2 * e);
      int var3 = (int)Math.max(0L, var0 / (long)l);
      var0 = (var0 - (long)(var3 * l)) / 1000L;
      if (var2 > 0) {
         return var2 + "时" + var3 + "分" + var0 + "秒";
      } else if (var3 > 0) {
         return var3 + "分" + var0 + "秒";
      } else {
         return var0 > 0L ? var0 + "秒" : "0秒";
      }
   }

   public static synchronized String i(long var0) {
      return o.format(new Date(var0));
   }

   public static boolean j() {
      if (a - j < (long)i) {
         return (boolean)(2 ^ 3);
      } else {
         j = a;
         return (boolean)(3 ^ 3);
      }
   }

   public static void k(long var0) {
      if (c != 0L) {
         d(var0);
      } else {
         c = var0;
         p = 0L;
         s = var0;
         a = var0;
         b = System.currentTimeMillis();
         synchronized(m) {
            r = Math.max(var0, r);
         }

         g.setTimeInMillis(f());
         f = g.get(79 & 55);
         u = g.get(43 & 95);
         q = g.get(95 & 44);
         a();
      }
   }

   public static long l() {
      return a;
   }
}
