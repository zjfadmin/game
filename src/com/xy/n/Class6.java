package com.xy.n;

import com.xy.bean.PathPoint;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Class6 {
   private static byte[] a;
   private static byte b = 12;
   private static final int[][] c = new int[][]{{0, -1}, {1, -1}, {1, 0}, {1, 1}, {0, 1}, {-1, 1}, {-1, 0}, {-1, -1}};
   private static byte d = 0;
   private static byte e = 4;
   private static byte f = 3;
   private static List<Class7> g = new ArrayList<>(128);
   private static Class2 h;
   public static int i = 65535;
   private static byte j = 1;
   private static byte k = 3;

   public static int a(Class7 var0, Class7 var1, Class7 var2) {
      int var3 = var0.g * (var1.b - var2.b);
      int var4 = var1.g * (var2.b - var0.b);
      return Math.abs(var2.g * (var0.b - var1.b) + var3 + var4);
   }

   // $VF: synthetic method
   private static int b(int var0, int var1, int var2, int var3) {
      return (Math.abs(var0 - var2) + Math.abs(var1 - var3)) * 10;
   }

   public static synchronized List<PathPoint> c(int var0, int var1, int var2, int var3, int var4, int var5, com.xy.d.Class8 var6, Class2 var7) {
      if (var7.c(var3, var4, var5)) {
         h = null;
         g.clear();
         return null;
      } else {
         e(var7);
         boolean var8 = false;
         boolean var9 = var5 > 0;
         int var10 = 0;
         int var11 = 0;
         int var12 = 0;
         int var13 = 0;
         boolean var14 = false;
         Class7 var15 = null;
         boolean var10004;
         int var10005;
         if (var2 > 0) {
            var10004 = true;
            var10005 = var0;
         } else {
            var10004 = false;
            var10005 = var0;
         }

         Class7 var10000 = new Class7(var0, var1, var10004, b(var10005, var1, var3, var4));
         Class7 var16 = var10000;
         a[var7.g * var1 + var0] = (byte)(a[var7.g * var1 + var0] | j);
         g.add(var16);

         boolean var36;
         label154:
         do {
            Class7 var17 = g.get(0);

            int var18;
            for (int var33 = var18 = g.size() - 1; var33 >= g.size() - 9 && var18 >= 0; var33 = --var18) {
               if (var17.e > g.get(var18).e) {
                  var17 = g.get(var18);
               }
            }

            a[var7.g * var17.b + var17.g] = (byte)(a[var7.g * var17.b + var17.g] | (var17.f ? b : k));
            g.remove(var17);
            var18 = 0;

            for (int var34 = var18; var34 < c.length; var34 = ++var18) {
               var10 = var17.g + c[var18][0];
               var11 = var17.b + c[var18][1];
               if (var10 >= 0 && var11 >= 0 && var10 < var7.g && var11 < var7.p) {
                  var12 = var18 == 8 ? (var17.f ? 0 : 1) : (var17.f ? 1 : 0);
                  var14 = var12 > 0;
                  var13 = a[var7.g * var11 + var10] >> var12 * 2 & f;
                  if (!var7.c(var10, var11, var12) && var13 != k && !f(var18, var10, var11, var12)) {
                     Class7 var19 = new Class7(var10, var11, var14, b(var10, var11, var3, var4), var17);
                     if (var13 != j) {
                        a[var7.g * var11 + var10] = (byte)(a[var7.g * var11 + var10] | (var14 ? e : j));
                        g.add(var19);
                     }
                  }
               }
            }

            for (int var35 = var18 = g.size() - 1; var35 >= 0 && var18 >= g.size() - 9; var35 = --var18) {
               Class7 var31;
               if ((var31 = g.get(var18)).g == var3 && var31.b == var4 && var31.f == var9) {
                  var15 = g.get(var18);
                  var36 = var8 = true;
                  continue label154;
               }
            }

            var36 = var8;
         } while (!var36 && g.size() != 0);

         if (!var8) {
            h = null;
            g.clear();
            return null;
         } else {
            g.clear();

            for (Class7 var37 = var15; var37 != null; var37 = var15) {
               var15.g = var15.g * 20 + 10;
               var15.b = var15.b * 20 + 10;
               g.add(var15);
               Class7 var25 = var15;
               var15 = var15.c;
               var25.c = null;
            }

            if (var6 != null) {
               Class7 var26 = new Class7();
               var26.g = var6.ae;
               var26.b = var6.v;
               var26.f = var2 > 0;
               g.set(g.size() - 1, var26);
            }

            g = d(g);
            ArrayList var27 = new ArrayList(g.size());

            int var30;
            for (int var38 = var30 = 0; var38 < g.size(); var38 = var30) {
               Class7 var32 = g.get(var30);
               var30++;
               var27.add(new PathPoint(var32.g, var32.b));
            }

            h = null;
            g.clear();
            return var27;
         }
      }
   }

   public static List<Class7> d(List<Class7> var0) {
      ArrayList var1;
      ArrayList var10000 = var1 = new ArrayList();
      int var2 = var0.size() - 1;
      var10000.add(var0.get(var2));
      int var3 = var2;

      for (int var7 = var2; var7 >= 0; var7 = --var3) {
         Class7 var4 = var0.get(var3);

         int var5;
         for (int var8 = var5 = 0; var8 < var3; var8 = ++var5) {
            Class7 var6 = var0.get(var5);
            if (var4.f != var6.f) {
               if (var4.g == var6.g && var4.b == var6.b) {
                  var3 = var5 + 1;
                  var1.remove(var4);
                  var1.add(var6);
               }
            } else if (h(var4, var6)) {
               var3 = var5 + 1;
               var1.add(var6);
               break;
            }
         }
      }

      return var1;
   }

   public static byte[] e(Class2 var0) {
      h = var0;
      if (a != null && a.length >= var0.b.length) {
         Arrays.fill(a, d);
      } else {
         a = new byte[var0.b.length];
      }

      return a;
   }

   public static boolean f(int var0, int var1, int var2, int var3) {
      if (var0 == 0 || var0 == 2 || var0 == 4 || var0 == 6) {
         return false;
      } else if (var0 == 1) {
         return h.c(var1 + c[6][0], var2 + c[6][1], var3) && h.c(var1 + c[4][0], var2 + c[4][1], var3);
      } else if (var0 == 3) {
         return h.c(var1 + c[0][0], var2 + c[0][1], var3) && h.c(var1 + c[6][0], var2 + c[6][1], var3);
      } else {
         return var0 == 5
            ? h.c(var1 + c[0][0], var2 + c[0][1], var3) && h.c(var1 + c[2][0], var2 + c[2][1], var3)
            : h.c(var1 + c[2][0], var2 + c[2][1], var3) && h.c(var1 + c[4][0], var2 + c[4][1], var3);
      }
   }

   public static Class7 g(int var0, Class7 var1, Class7 var2, Class7 var3) {
      int var4 = var1.g;
      int var5 = var1.b;
      if (var0 == 0) {
         return new Class7(var4, var5 - 1, var1.f);
      } else if (var0 == 1) {
         return new Class7(var4 + 1, var5 - 1, var1.f);
      } else if (var0 == 2) {
         return new Class7(var4 + 1, var5, var1.f);
      } else if (var0 == 3) {
         return new Class7(var4 + 1, var5 + 1, var1.f);
      } else if (var0 == 4) {
         return new Class7(var4, var5 + 1, var1.f);
      } else if (var0 == 5) {
         return new Class7(var4 - 1, var5 + 1, var1.f);
      } else if (var0 == 6) {
         return new Class7(var4 - 1, var5, var1.f);
      } else if (var0 == 7) {
         return new Class7(var4 - 1, var5 - 1, var1.f);
      } else if (var0 == 12) {
         return k(new Class7(var4, var5 - 1, var1.f), new Class7(var4 + 1, var5 - 1, var1.f), var2, var3);
      } else if (var0 == 11) {
         return k(new Class7(var4 + 1, var5 - 1, var1.f), new Class7(var4 + 1, var5, var1.f), var2, var3);
      } else if (var0 == 31) {
         return k(new Class7(var4 + 1, var5, var1.f), new Class7(var4 + 1, var5 + 1, var1.f), var2, var3);
      } else if (var0 == 32) {
         return k(new Class7(var4 + 1, var5 + 1, var1.f), new Class7(var4, var5 + 1, var1.f), var2, var3);
      } else if (var0 == 52) {
         return k(new Class7(var4, var5 + 1, var1.f), new Class7(var4 - 1, var5 + 1, var1.f), var2, var3);
      } else if (var0 == 51) {
         return k(new Class7(var4 - 1, var5 + 1, var1.f), new Class7(var4 - 1, var5, var1.f), var2, var3);
      } else if (var0 == 71) {
         return k(new Class7(var4 - 1, var5, var1.f), new Class7(var4 - 1, var5 - 1, var1.f), var2, var3);
      } else {
         return var0 == 72 ? k(new Class7(var4 - 1, var5 - 1, var1.f), new Class7(var4, var5 - 1, var1.f), var2, var3) : var1;
      }
   }

   public static boolean h(Class7 var0, Class7 var1) {
      int var10002 = var1.g - var0.g;
      Class7 var10000 = var1;
      int var3 = i(j(var10002, var1.b - var0.b));

      for (Class7 var4 = var0; var10000.g != var4.g || var1.b != var4.b; var10000 = var1) {
         var4 = g(var3, var4, var0, var1);
         if (h.c(var4.g / 20, var4.b / 20, var4.f ? 1 : 0)) {
            return false;
         }
      }

      return true;
   }

   public static int i(int var0) {
      if (var0 <= 7) {
         return var0;
      } else {
         switch (var0) {
            case 11:

               return 11;
            case 12:
               return 11;
            case 13:
               return 12;
            case 14:
               return 12;
            case 31:
               return 31;
            case 32:
               return 31;
            case 33:
               return 32;
            case 34:
               return 32;
            case 51:
               return 51;
            case 52:
               return 51;
            case 53:
               return 52;
            case 54:
               return 52;
            case 71:
               return 71;
            case 72:
               return 71;
            case 73:
               return 72;
            case 74:
               return 72;
            default:
               return var0;
         }
      }
   }

   public static int j(int var0, int var1) {
      int var2 = 8;
      if (var0 == 0 && var1 == 0) {
         var2 = (byte)8;
         return 8;
      } else if (var0 == 0) {
         if (var1 > 0) {
            var2 = (byte)4;
            return 4;
         } else {
            boolean var16 = false;
            return 0;
         }
      } else if (var1 == 0) {
         if (var0 > 0) {
            var2 = (byte)2;
            return 2;
         } else {
            var2 = (byte)6;
            return 6;
         }
      } else {
         int var3 = Math.abs(var0);
         int var4 = Math.abs(var1);
         byte var5 = 0;
         int var10000;
         if (var3 == var4) {
            var5 = 0;
            var10000 = var1;
         } else if (var3 > var4 * 3) {
            var5 = 1;
            var10000 = var1;
         } else if (var4 > var3 * 3) {
            var5 = 4;
            var10000 = var1;
         } else if (var3 > var4) {
            var5 = 2;
            var10000 = var1;
         } else {
            var5 = 3;
            var10000 = var1;
         }

         if (var10000 > 0 && var0 > 0) {
            if (var5 == 0) {
               var2 = (byte)3;
               return 3;
            } else {
               return var2 = 30 + var5;
            }
         } else if (var1 < 0 && var0 < 0) {
            if (var5 == 0) {
               byte var11 = 7;
               return 7;
            } else {
               return var2 = 70 + var5;
            }
         } else if (var1 > 0 && var0 < 0) {
            if (var5 == 0) {
               byte var9 = 5;
               return 5;
            } else {
               return var2 = 50 + var5;
            }
         } else if (var5 == 0) {
            boolean var7 = true;
            return 1;
         } else {
            return var2 = 10 + var5;
         }
      }
   }

   public static Class7 k(Class7 var0, Class7 var1, Class7 var2, Class7 var3) {
      return a(var0, var2, var3) <= a(var1, var2, var3) ? var0 : var1;
   }
}
