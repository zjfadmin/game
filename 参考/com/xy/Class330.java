package com.xy;

import com.xy.text.SystemData;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.awt.image.WritableRaster;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Class330 {
   public static Class8[] a;
   public static Map<Long, long[]> b;
   public static Map<String, Long> c;
   private static long d;
   static final String e = "D5";
   public static final int f = 100;
   public static final BufferedImage g;
   static Map<Long, Long> h;
   static long[] i;
   public static Map<Long, short[]> j;
   static final int k = 128;
   public static final int l = 120;
   static final int m = 192;
   static final int n = 64;
   static final String o = "SH";
   static BufferedImage p;
   static BufferedImage q;
   static final int r = 0;
   public static Map<Integer, long[]> s;
   public static Class8 t;
   public static Class444 u;
   public static List<Object> v;
   static final int w = 192;
   public static Object x = new Object();
   static final int y = 12;
   public static Map<Long, SoftReference<Class8>> z;
   public static String[] aa;
   static final int ab = 0;
   static final String ac = "SP";
   static final int ad = 32;
   static String[] ae;
   public static Map<Integer, Class447> af;
   static String ag;
   public static Map<String, SoftReference<Class8>> ah;
   public static Map<Long, Class25[]> ai;

   public static Class25[] a(long var0, Class434 var2) throws IOException {
      Class434 var3 = var2;
      Class25[] var10000 = new Class25[var2.read()];
      boolean var10002 = true;
      Class25[] var1 = var10000;

      int var5;
      for(int var8 = var5 = 3 >> 2; var8 < var1.length; var8 = var5) {
         Class25 var4;
         (var4 = new Class25()).b((byte)var3.read());
         long[] var9 = new long[var3.read()];
         var10002 = true;
         long[] var7 = var9;

         int var6;
         int var10001;
         for(var8 = var6 = 2 & 5; var8 < var7.length; var8 = var6) {
            var10001 = var6;
            long var10 = var3.l();
            ++var6;
            var7[var10001] = var10;
         }

         var10001 = var5;
         var4.d(var7);
         ++var5;
         var1[var10001] = var4;
      }

      return var1;
   }

   public static void b(Object var0) {
      synchronized(x) {
         v.remove(var0);
      }
   }

   public static long c(long var0) {
      long var2 = var0 & 2147483647L;
      if (var0 > 2147483647L) {
         if (var0 >> (62 & 105) > 0L) {
            return var0;
         } else {
            long var4 = var0 >> (114 & 45);
            if (var2 == 23007L && var4 != 10L && var4 != 1L) {
               return var0 = 42949672960L | var2;
            } else if (var2 == 21012L && var4 != 10L && var4 != 14L) {
               return var0 = 42949672960L | var2;
            } else if (var2 == 20012L && var4 != 8L && var4 != 10L) {
               return var0 = 34359738368L | var2;
            } else if (var2 == 22012L && var4 != 11L && var4 != 16L) {
               return var0 = 47244640256L | var2;
            } else if (var2 == 22011L && var4 != 12L && var4 != 7L) {
               return var0 = 51539607552L | var2;
            } else if (var2 == 23008L && var4 != 1L && var4 != 16L) {
               return var0 = 4294967296L | var2;
            } else if (var2 == 20011L && var4 != 7L && var4 != 1L) {
               return var0 = 30064771072L | var2;
            } else {
               if (var2 == 21011L && var4 != 10L && var4 != 12L) {
                  var0 = 42949672960L | var2;
               }

               return var0;
            }
         }
      } else {
         return o(var0);
      }
   }

   public static boolean d(String var0) {
      return (boolean)(var0.endsWith(ag) ? 3 & 4 : 1);
   }

   public static void e(int[] var0, short var1, int var2) {
      int var10001 = --3;
      int var10003 = 3 & 5;
      int var10004 = 3 ^ 3;
      int var10006 = --2;
      int var10009 = 3 >> 1;
      var0[3 >> 2] = var1 >>> (95 & 43) & 127 & 31;
      var0[var10009] = var1 >>> --5 & 127 & 63;
      var0[var10006] = var1 & 95 & 63;
      var0[var10004] = var0[3 & 4] << --3 | var0[2 & 5] & 15 & 119;
      var0[var10003] = var0[3 >> 1] << (1 ^ 3) | var0[3 >> 1] & --3;
      var0[var10006] = var0[--2] << --3 | var0[1 ^ 3] & 127 & 7;
      var0[var10001] = var2;
   }

   public static Class19 f(String var0, int var1, int var2, String var3) {
      Object var10000;
      long var4;
      Object var11;
      label45: {
         label44: {
            var4 = var3 != null ? h(var3) : 0L;
            var11 = null;
            if (var1 != (-2 & -1) && var1 != -4 >> 2) {
               try {
                  long var6 = !Class394.o(var0) ? Long.parseLong(var0) : 0L;
                  long var8;
                  if ((var8 = c(var6)) != 0L) {
                     var0 = String.valueOf(var8);
                     var6 = var8;
                  }

                  Class25[] var12;
                  if ((var12 = j(var6)) != null) {
                     if (SystemData.isOld) {
                        var0 = String.valueOf(ag(var6));
                        var10000 = var11;
                     } else {
                        var10000 = var11 = new Class154(var6, var12, var1, var2, var4);
                     }
                     break label45;
                  }

                  if (ac(var6, -4 >> 2) != null) {
                     var11 = new Class188(var6, var1, var2, var4);
                     break label44;
                  }
               } catch (Exception var10) {
                  var10.printStackTrace();
               }
            }

            var10000 = var11;
            break label45;
         }

         var10000 = var11;
      }

      if (var10000 == null) {
         var11 = new Class277(var0, var1, var2, var4);
      }

      return (Class19)var11;
   }

   public static long g(long var0) {
      if (var0 == 22010L) {
         return 73014466042L;
      } else if (var0 == 20009L) {
         return 8589954601L;
      } else if (var0 == 21009L) {
         return 42949693969L;
      } else if (var0 == 21007L) {
         return 17179890191L;
      } else if (var0 == 20008L) {
         return 42949692968L;
      } else if (var0 == 20007L) {
         return 4294987303L;
      } else if (var0 == 21008L) {
         return 42949693968L;
      } else if (var0 == 20010L) {
         return 4294987306L;
      } else if (var0 == 22008L) {
         return 47244662264L;
      } else if (var0 == 21010L) {
         return 38654726674L;
      } else if (var0 == 22007L) {
         return 51539629559L;
      } else {
         return var0 == 22009L ? 55834596857L : 0L;
      }
   }

   public static long h(String var0) {
      Long var1;
      return (var1 = (Long)c.get(var0)) != null ? var1 : ae(var0);
   }

   public static Class402 i(String var0) {
      Class402 var1 = null;

      Class402 var9;
      label48: {
         label47: {
            try {
               File var6;
               if ((var6 = new File(var0)) == null || !var6.exists()) {
                  break label47;
               }

               FileInputStream var3 = new FileInputStream(var6);
               byte[] var10000 = new byte[5 >> 1];
               boolean var10002 = true;
               byte[] var4 = var10000;
               var3.read(var4);
               String var5 = new String(var4);
               int var2 = var5.equals("SP") ? 2 & 5 : (var5.equals("SH") ? 4 ^ 5 : -1);
               if (var2 >= 0) {
                  FileInputStream var10 = var3;
                  byte[] var10001 = new byte[var3.available()];
                  boolean var10003 = true;
                  var4 = var10001;
                  int var8 = 3 ^ 3;

                  for(var2 = 2 & 5; var10.available() > 0; var2 += var8) {
                     var10 = var3;
                     var8 = var3.read(var4, var2, var3.available());
                  }

                  var3.close();
                  var9 = var1 = (new Class434(var4)).m();
                  break label48;
               }

               var3.close();
            } catch (Exception var7) {
               var7.printStackTrace();
               break label47;
            }

            var9 = var1;
            break label48;
         }

         var9 = var1;
      }

      if (var9 == null) {
         var1 = new Class402(g);
      }

      return var1;
   }

   public static Class25[] j(long var0) {
      if (var0 < 25000L) {
         var0 = o(var0);
      }

      Class25[] var2;
      if ((var2 = (Class25[])ai.get(var0)) == null && var0 > 2147483647L && var0 >> (117 & 42) > 18L) {
         Long var3;
         if ((var3 = (Long)h.get(var0)) == null) {
            var3 = new Long(var0);
            File var4;
            if ((var4 = new File("skin/" + var3)).exists() || var4.isDirectory()) {
               h.put(var3, var3);
               return null;
            }

            h.put(var3, 0L);
         } else if (var3 != 0L) {
            return null;
         }

         var2 = (Class25[])ai.get((var0 >> (44 & 115)) - 18L << (34 & 125) | (long)((int)var0));
      }

      if (var2 == null) {
         var0 = o(var0 & 2147483647L);
         var2 = (Class25[])ai.get(var0);
      }

      return var2;
   }

   public static Class8 k(int var0) {
      int var1 = 3 & 4;
      if (var0 != 5 >> 2 && var0 != 0 && var0 != (47 & 90)) {
         if (var0 != 5 >> 1 && var0 != (47 & 87)) {
            if (var0 != --4 && var0 != (63 & 70)) {
               if (var0 != --5 && var0 != --3 && var0 != (41 & 95) && var0 != (31 & 107) && var0 != (31 & 108)) {
                  if (var0 == (94 & 41)) {
                     var1 = --5;
                  }
               } else {
                  var1 = 4;
               }
            } else {
               var1 = 3;
            }
         } else {
            var1 = 2;
         }
      } else {
         var1 = 1;
      }

      Class8 var2;
      if ((var2 = a[var1]) == null) {
         String var10000 = null;
         String var10001;
         if (var1 == --1) {
            var10000 = "skin/火柴人/run.tcp";
            var10001 = "skin/火柴人/run.tcp";
         } else if (var1 == 5 >> 1) {
            var10000 = "skin/火柴人/stand.tcp";
            var10001 = "skin/火柴人/stand.tcp";
         } else if (var1 == --3) {
            var10000 = "skin/火柴人/hit.tcp";
            var10001 = "skin/火柴人/hit.tcp";
         } else if (var1 == --4) {
            var10000 = "skin/火柴人/magic.tcp";
            var10001 = "skin/火柴人/magic.tcp";
         } else if (var1 == --5) {
            var10000 = "sc/FightingSkill/持续状态/墓碑.tcp";
            var10001 = "sc/FightingSkill/持续状态/墓碑.tcp";
         } else {
            var10000 = "sc/FightingSkill/1025.tcp";
            var10001 = "sc/FightingSkill/1025.tcp";
         }

         var2 = s(var10000, (short[])null);
         a[var1] = var2;
      }

      return var2;
   }

   static {
      String[] var10000 = new String[127 & 13];
      boolean var10002 = true;
      aa = var10000;
      v = new ArrayList();
      Class8[] var9 = new Class8[70 & 63];
      var10002 = true;
      a = var9;
      ah = new HashMap();
      z = new HashMap();
      j = new HashMap();
      c = new HashMap();
      s = new HashMap();
      g = new BufferedImage(5 >> 2, 5 >> 2, --2);
      var10000 = new String[53 & 94];
      var10002 = true;
      var10000[3 & 4] = "hit.tcp";
      var10000[3 & 5] = "magic.tcp";
      var10000[5 >> 1] = "defend.tcp";
      var10000[--3] = "guard.tcp";
      var10000[--4] = "die.tcp";
      var10000[--5] = "attack.tcp";
      var10000[102 & 31] = "t2.tcp";
      var10000[111 & 23] = "4001.tcp";
      var10000[77 & 58] = "4002.tcp";
      var10000[125 & 11] = "4003.tcp";
      var10000[110 & 27] = "4004.tcp";
      var10000[123 & 15] = "400509";
      var10000[110 & 29] = "400535";
      var10000[13 & 127] = "400314";
      var10000[62 & 79] = "52106";
      var10000[15 & 127] = "52114";
      var10000[114 & 29] = "1252.tcp";
      var10000[121 & 23] = "1253.tcp";
      var10000[26 & 119] = "1254.tcp";
      var10000[19] = "1255.tcp";
      ae = var10000;
      ag = "1282.tcp";
      long[] var10 = new long[5 >> 3];
      var10002 = true;
      i = var10;
      aa[3 >> 2] = "walk";
      aa[3 & 5] = "run";
      aa[5 >> 1] = "stand";
      aa[--3] = "t1";
      aa[--4] = "hit";
      aa[--5] = "magic";
      aa[6] = "defend";
      aa[7] = "guard";
      aa[8] = "die";
      aa[9] = "attack";
      aa[10] = "attackrun";
      aa[11] = "t2";
      aa[12] = "t3";
      af = new HashMap();
      ai = new HashMap();
      b = new HashMap();

      try {
         File var0;
         FileInputStream var1;
         byte[] var2;
         Class434 var3;
         long var4;
         FileInputStream var11;
         Class434 var12;
         byte[] var10001;
         boolean var10003;
         if ((var0 = new File("sc/music/1")).exists()) {
            var11 = var1 = new FileInputStream(var0);
            var10001 = new byte[var11.available()];
            var10003 = true;
            var2 = var10001;
            var11.read(var10001);
            (var3 = new Class434(var2)).k(1 ^ 3);
            var12 = var3;

            while(var12.available() > 0) {
               var12 = var3;
               var4 = var3.l();
               ai.put(var4, a(var4, var3));
            }

            var1.close();
            var3.close();
         }

         if ((var0 = new File("sc/music/0.png")).exists()) {
            var11 = var1 = new FileInputStream(var0);
            var10001 = new byte[var11.available()];
            var10003 = true;
            var2 = var10001;
            var11.read(var10001);
            (var3 = new Class434(var2)).k(1 ^ 3);

            for(var12 = var3; var12.available() > 0; var12 = var3) {
               var4 = var3.l();
               var10 = new long[var3.read()];
               var10002 = true;
               long[] var8 = var10;

               int var6;
               for(int var14 = var6 = 5 >> 3; var14 < var8.length; var14 = var6) {
                  var8[var6] = (long)var3.read();
                  int var13 = var6;
                  long var15 = var8[var6] << 32 | (long)var3.h();
                  ++var6;
                  var8[var13] = var15;
               }

               b.put(var4, var8);
               if (b.get(var4 & 268435455L) == null) {
                  b.put(var4 & 268435455L, i);
               }
            }

            var1.close();
            var3.close();
         }
      } catch (Exception var7) {
         var7.printStackTrace();
      }

      u = new Class444();
      u.start();
      t = s("skin/YZ.tcp", (short[])null);
      t.d(0L, 3 >> 2);
      h = new HashMap();
   }

   public static BufferedImage l(Class434 var0, Class233 var1, Class8 var2) {
      try {
         if (var1.n() == 0) {
            return g;
         } else if (var1.g() != null) {
            return (BufferedImage)var1.g();
         } else if (var2.ad() == 5 >> 1) {
            return al(var0, var1, var2);
         } else {
            var0.k(var1.n());
            int var11 = var0.h();
            int var4 = var0.h();
            if (var2.x() == (3 & 5)) {
               var11 = var2.r();
               var4 = var2.i();
            }

            int var19 = var0.h();
            int var5;
            if ((var5 = var0.h()) > (14328 & 19439) || var19 > (18426 & 15341)) {
               System.err.println("警报:" + var19 + ":" + var5);
               if (var5 >= (14250 & 23517) || var19 >= (21385 & 16382)) {
                  return g;
               }
            }

            int[] var10000 = new int[var5];
            boolean var10002 = true;
            int[] var6 = var10000;

            int var7;
            int var10001;
            int var22;
            for(var22 = var7 = 3 ^ 3; var22 < var5; var22 = var7) {
               var10001 = var7;
               int var23 = var0.h();
               ++var7;
               var6[var10001] = var23;
            }

            var1.l(var11);
            var1.b(var4);
            if (var19 != 0 && var5 != 0) {
               short[] var21 = var0.c();
               BufferedImage var20;
               WritableRaster var8 = (var20 = new BufferedImage(var19, var5, 1 ^ 3)).getRaster();
               var10000 = new int[--4];
               var10002 = true;
               int[] var9 = var10000;
               int var10 = 3 ^ 3;
               int var15 = 5 >> 3;

               int var16;
               for(var22 = var16 = 5 >> 3; var22 < var5; var22 = var16) {
                  if (var6[var16] != 0) {
                     int var3;
                     var22 = var3 = 0;
                     var0.k(var6[var16] + var1.n());

                     while(true) {
                        if (var22 < var19) {
                           int var12;
                           int var13;
                           int var17;
                           if ((var13 = (var10 = var0.read()) & 9185 & 23774) != 0) {
                              if (var13 == (95 & 96)) {
                                 if ((var12 = var10 & 63 & 127) + var3 > var19) {
                                    var12 = var19 - var3;
                                 }

                                 for(var22 = var17 = 0; var22 < var12; var22 = var17) {
                                    e(var9, var21[var0.read()], 25855 & 7167);
                                    ++var17;
                                    var8.setPixel(var3, var16, var9);
                                    ++var3;
                                 }

                                 var22 = var3;
                                 continue;
                              }

                              if (var13 != (13524 & 19371)) {
                                 if (var13 == (7393 & 25566)) {
                                    if ((var12 = var10 & 63) == 0) {
                                       var10 = var0.read();
                                       var10 = var0.read();
                                       var22 = var3;
                                       continue;
                                    }

                                    if (var12 + var3 > var19) {
                                       var22 = var3 = var19;
                                       continue;
                                    }

                                    var3 += var12;
                                 }

                                 var22 = var3;
                                 continue;
                              }

                              if ((var12 = var10 & 63 & 127) + var3 > var19) {
                                 var12 = var19 - var3;
                              }

                              e(var9, var21[var0.read()], 14335 & 18687);

                              for(var22 = var17 = 3 >> 2; var22 < var12; var22 = var17) {
                                 ++var17;
                                 var8.setPixel(var3, var16, var9);
                                 ++var3;
                              }

                              var22 = var3;
                              continue;
                           }

                           int var14;
                           if ((var10 & 109 & 50) == (123 & 36)) {
                              var14 = (var14 = var10 & 31 & 127) << --3 | var14 >>> --2;
                              var10001 = var3;
                              int var10004 = var0.read();
                              ++var3;
                              e(var9, var21[var10004], var14);
                              var8.setPixel(var10001, var16, var9);
                              var22 = var3;
                              continue;
                           }

                           if (var10 != 0) {
                              if ((var12 = var10 & 127 & 31) + var3 > var19) {
                                 var12 = var19 - var3;
                              }

                              var14 = (var14 = var0.read()) << --3 | var14 >>> --2;
                              var22 = 2 & 5;
                              e(var9, var21[var0.read()], var14);

                              for(var17 = var22; var22 < var12; var22 = var17) {
                                 ++var17;
                                 var8.setPixel(var3, var16, var9);
                                 ++var3;
                              }

                              var22 = var3;
                              continue;
                           }

                           if (var3 == 0 && var15 != var16) {
                              var15 = var16 + (3 >> 1);
                              var17 = var16 - (5 >> 2);

                              for(var22 = var14 = var3; var22 < var19; var22 = var14) {
                                 if ((var9 = var8.getPixel(var14, var17, var9))[3 ^ 3] != 0 || var9[2 ^ 3] != 0 || var9[5 >> 1] != 0 || var9[--3] != 0) {
                                    var8.setPixel(var14, var16, var9);
                                 }

                                 ++var14;
                              }

                              var22 = var3;
                              break;
                           }
                        }

                        var22 = var3;
                        break;
                     }

                     if (var22 > var19) {
                        System.err.println("block end error: [" + var16 + "][" + var3 + "/" + var19 + "]");
                     }
                  }

                  ++var16;
               }

               return var20;
            } else {
               return g;
            }
         }
      } catch (Exception var18) {
         var18.printStackTrace();
         return g;
      }
   }

   public static int m(String var0) {
      if (var0.length() <= --4) {
         return -4 >> 2;
      } else {
         var0 = var0.substring(3 & 4, var0.length() - --4);

         int var1;
         for(int var10000 = var1 = 5 >> 3; var10000 < aa.length; var10000 = var1) {
            if (var0.endsWith(aa[var1])) {
               return var1;
            }

            ++var1;
         }

         return -4 >> 2;
      }
   }

   public static Class8 n(long var0, int var2) {
      int var3 = var2;
      SoftReference var4;
      if ((var4 = (SoftReference)z.get(-var0)) != null && var4.get() != null) {
         return (Class8)var4.get();
      } else {
         p((var3 != 0 && var3 != --1 && var3 != 5 >> 1 && var3 != (14 & 123) ? Class444.d : Class444.i) + var0);
         return null;
      }
   }

   public static long o(long var0) {
      if (var0 == 24006L) {
         var0 = 73014468038L;
         return 73014468038L;
      } else if (var0 == 21006L) {
         var0 = 60129563150L;
         return 60129563150L;
      } else if (var0 == 20001L) {
         var0 = 4294987297L;
         return 4294987297L;
      } else if (var0 == 21004L) {
         var0 = 42949693964L;
         return 42949693964L;
      } else if (var0 == 20004L) {
         var0 = 34359758372L;
         return 34359758372L;
      } else if (var0 == 20002L) {
         var0 = 12884921890L;
         return 12884921890L;
      } else if (var0 == 21003L) {
         var0 = 42949693963L;
         return 42949693963L;
      } else if (var0 == 24001L) {
         var0 = 25769827777L;
         return 25769827777L;
      } else if (var0 == 20006L) {
         var0 = 51539627558L;
         return 51539627558L;
      } else if (var0 == 22001L) {
         var0 = 12884923889L;
         return 12884923889L;
      } else if (var0 == 22010L) {
         var0 = 73014466042L;
         return 73014466042L;
      } else if (var0 == 22005L) {
         var0 = 30064793077L;
         return 30064793077L;
      } else if (var0 == 22002L) {
         var0 = 64424531442L;
         return 64424531442L;
      } else if (var0 == 20009L) {
         var0 = 8589954601L;
         return 8589954601L;
      } else if (var0 == 23004L) {
         var0 = 34359761372L;
         return 34359761372L;
      } else if (var0 == 24004L) {
         var0 = 12884925892L;
         return 12884925892L;
      } else if (var0 == 21009L) {
         var0 = 42949693969L;
         return 42949693969L;
      } else if (var0 == 21007L) {
         var0 = 17179890191L;
         return 17179890191L;
      } else if (var0 == 21005L) {
         var0 = 4294988301L;
         return 4294988301L;
      } else if (var0 == 24005L) {
         var0 = 77309435333L;
         return 77309435333L;
      } else if (var0 == 22004L) {
         var0 = 42949694964L;
         return 42949694964L;
      } else if (var0 == 23005L) {
         var0 = 73014467037L;
         return 73014467037L;
      } else if (var0 == 21001L) {
         var0 = 30064792073L;
         return 30064792073L;
      } else if (var0 == 20008L) {
         var0 = 42949692968L;
         return 42949692968L;
      } else if (var0 == 20007L) {
         var0 = 4294987303L;
         return 4294987303L;
      } else if (var0 == 21008L) {
         var0 = 42949693968L;
         return 42949693968L;
      } else if (var0 == 20010L) {
         var0 = 4294987306L;
         return 4294987306L;
      } else if (var0 == 23003L) {
         var0 = 55834597851L;
         return 55834597851L;
      } else if (var0 == 22003L) {
         var0 = 30064793075L;
         return 30064793075L;
      } else if (var0 == 24002L) {
         var0 = 51539631554L;
         return 51539631554L;
      } else if (var0 == 23002L) {
         var0 = 51539630554L;
         return 51539630554L;
      } else if (var0 == 22008L) {
         var0 = 47244662264L;
         return 47244662264L;
      } else if (var0 == 20005L) {
         var0 = 42949692965L;
         return 42949692965L;
      } else if (var0 == 24003L) {
         var0 = 77309435331L;
         return 77309435331L;
      } else if (var0 == 20003L) {
         var0 = 17179889187L;
         return 17179889187L;
      } else if (var0 == 21010L) {
         var0 = 38654726674L;
         return 38654726674L;
      } else if (var0 == 22007L) {
         var0 = 51539629559L;
         return 51539629559L;
      } else if (var0 == 21002L) {
         var0 = 42949693962L;
         return 42949693962L;
      } else if (var0 == 23001L) {
         var0 = 42949695961L;
         return 42949695961L;
      } else if (var0 == 23006L) {
         var0 = 47244663262L;
         return 47244663262L;
      } else if (var0 == 22009L) {
         var0 = 55834596857L;
         return 55834596857L;
      } else if (var0 == 22006L) {
         var0 = 4294989302L;
         return 4294989302L;
      } else if (var0 == 20011L) {
         var0 = 30064791083L;
         return 30064791083L;
      } else if (var0 == 20012L) {
         var0 = 34359758380L;
         return 34359758380L;
      } else if (var0 == 21011L) {
         var0 = 42949693971L;
         return 42949693971L;
      } else if (var0 == 21012L) {
         var0 = 42949693972L;
         return 42949693972L;
      } else if (var0 == 22011L) {
         var0 = 51539629563L;
         return 51539629563L;
      } else if (var0 == 22012L) {
         var0 = 47244662268L;
         return 47244662268L;
      } else if (var0 == 23007L) {
         var0 = 42949695967L;
         return 42949695967L;
      } else if (var0 == 23008L) {
         var0 = 4294990304L;
         return 4294990304L;
      } else if (var0 == 24007L) {
         var0 = 4294991303L;
         return 4294991303L;
      } else {
         if (var0 == 24008L) {
            var0 = 68719500744L;
         }

         return var0;
      }
   }

   public static void p(Object var0) {
      if (var0 != null) {
         synchronized(x) {
            if (!v.contains(var0)) {
               v.add(var0);
               u.c();
            }

         }
      }
   }

   public static Class8 q(String var0) {
      SoftReference var1;
      if ((var1 = (SoftReference)ah.get(var0)) != null && var1.get() != null) {
         return (Class8)var1.get();
      } else {
         p(var0);
         return null;
      }
   }

   public static BufferedImage r(Class434 var0, Class233 var1, int var2, int var3, int var4, int var5, int var6) {
      try {
         if (var1.n() == 0) {
            return g;
         } else if (var1.g() != null) {
            return (BufferedImage)var1.g();
         } else {
            var0.k(var1.n());
            int var7 = var0.h();
            int var8 = var0.h();
            var1.l(var7);
            var1.b(var8);
            if (var2 == 5 >> 2) {
               var7 = var3;
               var8 = var4;
            }

            var2 = var0.h();
            int var9;
            int[] var10000 = new int[var9 = var0.h()];
            boolean var10002 = true;
            int[] var10 = var10000;

            int var11;
            int var10001;
            int var24;
            for(var24 = var11 = 3 ^ 3; var24 < var9; var24 = var11) {
               var10001 = var11;
               int var25 = var0.h();
               ++var11;
               var10[var10001] = var25;
            }

            if (var2 != 0 && var9 != 0) {
               short[] var23 = var0.c();
               BufferedImage var21;
               WritableRaster var22 = (var21 = new BufferedImage(var5, var6, 5 >> 1)).getRaster();
               var7 = var3 - var7;
               var8 = var4 - var8;
               var10000 = new int[--4];
               var10002 = true;
               int[] var20 = var10000;
               var4 = 3 ^ 3;
               int var16 = 3 >> 2;

               int var17;
               for(var24 = var17 = 3 ^ 3; var24 < var9; var24 = var17) {
                  if (var10[var17] != 0) {
                     int var12;
                     var24 = var12 = 0;
                     var0.k(var10[var17] + var1.n());

                     while(true) {
                        if (var24 < var2) {
                           int var13;
                           int var14;
                           int var18;
                           if ((var14 = (var4 = var0.read()) & 11722 & 21237) != 0) {
                              if (var14 == (91 & 100)) {
                                 if ((var13 = var4 & 127 & 63) + var12 > var2) {
                                    var13 = var2 - var12;
                                 }

                                 for(var24 = var18 = 0; var24 < var13; var24 = var18) {
                                    e(var20, var23[var0.read()], 12287 & 20735);
                                    var10001 = var12 + var7;
                                    ++var12;
                                    ++var18;
                                    var22.setPixel(var10001, var17 + var8, var20);
                                 }

                                 var24 = var12;
                                 continue;
                              }

                              if (var14 != (11505 & 21390)) {
                                 if (var14 == (6341 & 26618)) {
                                    if ((var13 = var4 & 127 & 63) == 0) {
                                       var4 = var0.read();
                                       var4 = var0.read();
                                       var24 = var12;
                                       continue;
                                    }

                                    if (var13 + var12 > var2) {
                                       var24 = var12 = var2;
                                       continue;
                                    }

                                    var12 += var13;
                                 }

                                 var24 = var12;
                                 continue;
                              }

                              if ((var13 = var4 & 63 & 127) + var12 > var2) {
                                 var13 = var2 - var12;
                              }

                              e(var20, var23[var0.read()], 10495 & 22527);

                              for(var24 = var18 = 3 & 4; var24 < var13; var24 = var18) {
                                 var10001 = var12 + var7;
                                 ++var12;
                                 ++var18;
                                 var22.setPixel(var10001, var17 + var8, var20);
                              }

                              var24 = var12;
                              continue;
                           }

                           int var15;
                           if ((var4 & 59 & 100) == (120 & 39)) {
                              var15 = (var15 = var4 & 63 & 95) << --3 | var15 >>> --2;
                              var10001 = var12;
                              int var10004 = var0.read();
                              ++var12;
                              e(var20, var23[var10004], var15);
                              var22.setPixel(var10001 + var7, var17 + var8, var20);
                              var24 = var12;
                              continue;
                           }

                           if (var4 != 0) {
                              if ((var13 = var4 & 31 & 127) + var12 > var2) {
                                 var13 = var2 - var12;
                              }

                              var15 = (var15 = var0.read()) << --3 | var15 >>> (1 ^ 3);
                              var24 = 2 & 5;
                              e(var20, var23[var0.read()], var15);

                              for(var18 = var24; var24 < var13; var24 = var18) {
                                 var10001 = var12 + var7;
                                 ++var12;
                                 ++var18;
                                 var22.setPixel(var10001, var17 + var8, var20);
                              }

                              var24 = var12;
                              continue;
                           }

                           if (var12 == 0 && var16 != var17) {
                              var16 = var17 + (3 >> 1);
                              var18 = var17 - (5 >> 2);

                              for(var24 = var15 = var12; var24 < var2; var24 = var15) {
                                 if ((var20 = var22.getPixel(var15, var18 + var8, var20))[3 ^ 3] != 0 || var20[--1] != 0 || var20[1 ^ 3] != 0 || var20[--3] != 0) {
                                    var22.setPixel(var15, var17 + var8, var20);
                                 }

                                 ++var15;
                              }

                              var24 = var12;
                              break;
                           }
                        }

                        var24 = var12;
                        break;
                     }

                     if (var24 > var2) {
                        System.err.println("block end error: [" + var17 + "][" + var12 + "/" + var2 + "]");
                     }
                  }

                  ++var17;
               }

               return var21;
            } else {
               return g;
            }
         }
      } catch (Exception var19) {
         var19.printStackTrace();
         return g;
      }
   }

   public static Class8 s(String var0, short[] var1) {
      if (var0 != null && var0.length() != 0) {
         Class8 var6 = null;

         Class8 var10000;
         label51: {
            label50: {
               try {
                  File var4;
                  if ((var4 = new File(var0)) != null && var4.exists()) {
                     FileInputStream var3 = new FileInputStream(var4);
                     byte[] var11 = new byte[1 ^ 3];
                     boolean var10002 = true;
                     byte[] var5 = var11;
                     var3.read(var5);
                     String var2 = new String(var5);
                     int var7 = var2.equals("SP") ? 5 >> 3 : (var2.equals("SH") ? 4 ^ 5 : (var2.equals("D5") ? 1 ^ 3 : -1));
                     if (var7 >= 0) {
                        FileInputStream var12 = var3;
                        byte[] var10001 = new byte[var3.available()];
                        boolean var10003 = true;
                        var5 = var10001;
                        int var10 = 2 & 5;

                        for(int var8 = 3 >> 2; var12.available() > 0; var8 += var10) {
                           var12 = var3;
                           var10 = var3.read(var5, var8, var3.available());
                        }

                        var3.close();
                        var10000 = var6 = (new Class434(var5)).i(am(var0), d(var0), var7, var1);
                        break label51;
                     }

                     var3.close();
                     break label50;
                  }
               } catch (Exception var9) {
                  var9.printStackTrace();
               }

               var10000 = var6;
               break label51;
            }

            var10000 = var6;
         }

         if (var10000 == null) {
            var6 = k(m(var0));
         }

         return var6;
      } else {
         return null;
      }
   }

   public static short[] t(long var0) {
      return (short[])j.get(var0);
   }

   public static void u() {
      try {
         q = null;
         Iterator var1;
         Iterator var10000 = var1 = ah.keySet().iterator();

         while(true) {
            while(var10000.hasNext()) {
               String var0 = (String)var1.next();
               SoftReference var2;
               if ((var2 = (SoftReference)ah.get(var0)) != null && var2.get() != null && ((Class8)var2.get()).w() != 0) {
                  ((Class8)var2.get()).y(3 >> 2);
                  var10000 = var1;
               } else {
                  var10000 = var1;
                  var1.remove();
               }
            }

            var10000 = var1 = z.keySet().iterator();

            while(true) {
               while(var10000.hasNext()) {
                  long var6 = (Long)var1.next();
                  SoftReference var4;
                  if ((var4 = (SoftReference)z.get(var6)) != null && var4.get() != null && ((Class8)var4.get()).w() != 0) {
                     ((Class8)var4.get()).y(2 & 5);
                     var10000 = var1;
                  } else {
                     var10000 = var1;
                     var1.remove();
                  }
               }

               for(var10000 = var1 = af.keySet().iterator(); var10000.hasNext(); var10000 = var1) {
                  int var8 = (Integer)var1.next();
                  Class447 var7;
                  if ((var7 = (Class447)af.get(var8)) == null || var7.a()) {
                     var1.remove();
                  }
               }

               return;
            }
         }
      } catch (Exception var5) {
         var5.printStackTrace();
      }
   }

   public static int v(int var0, int var1) {
      if (var1 == (1 ^ 3)) {
         return var0 == --3 ? 3 ^ 3 : 1;
      } else {
         boolean var2;
         switch(var0) {
         case 0:
            while(false) {
            }

            var2 = true;
            return 6;
         case 1:
            var2 = true;
            return 3;
         case 2:
            var2 = true;
            return 7;
         case 3:
            var2 = false;
            return 0;
         case 4:
            var2 = true;
            return 4;
         case 5:
            var2 = true;
            return 1;
         case 6:
            var2 = true;
            return 5;
         case 7:
            var2 = true;
            return 2;
         default:
            return var0;
         }
      }
   }

   public static Class19 w(Class19 var0, int var1, String var2) {
      Class19 var10000;
      try {
         long var3;
         long var5;
         if ((var5 = c(var3 = Long.parseLong(var2))) != 0L) {
            var2 = String.valueOf(var5);
            var3 = var5;
         }

         Class25[] var8;
         if ((var8 = j(var3)) != null) {
            if (!SystemData.isOld) {
               return var0.v(var1, var3, var8);
            }

            var2 = String.valueOf(ag(var3));
            var10000 = var0;
            return var10000.c(var1, var2);
         }
      } catch (Exception var7) {
      }

      var10000 = var0;
      return var10000.c(var1, var2);
   }

   public static int x(int var0) {
      if (var0 == 0) {
         return 3 >> 2;
      } else {
         int var1 = var0 >> (93 & 50) & 21503 & 11519;
         int var2 = var0 >> (11 & 124) & 20223 & 12799;
         int var3 = var0 & 7935 & 25087;
         int var4 = var0 >> (24 & 127) & 27903 & 5119;
         int var5 = var1 * (3577 & 29590) >>> (10 & 125);
         int var6 = var2 * (23481 & 9686) >>> (78 & 57);
         int var7 = var3 * (12251 & 20916) >>> (105 & 30);
         var1 = Math.min(var5, 8191 & 24831);
         var2 = Math.min(var6, 15359 & 17663);
         var3 = Math.min(var7, 28671 & 4351);
         return var4 << 24 | var1 << 16 | var2 << 8 | var3;
      }
   }

   public static synchronized Class8 y(String var0) {
      SoftReference var1;
      if ((var1 = (SoftReference)ah.get(var0)) != null && var1.get() != null) {
         return (Class8)var1.get();
      } else {
         Class8 var2 = s(var0, (short[])null);
         ah.put(var0, new SoftReference(var2));
         return var2;
      }
   }

   public static synchronized Class447 z(int var0) {
      Class447 var1;
      if ((var1 = (Class447)af.get(var0)) == null) {
         try {
            if (var0 > (36 & 123)) {
               var1 = new Class447("sc/music/" + (var0 - (96 & 63)) + ".png");
            } else {
               var1 = new Class447("skin/" + var0 + ".hh");
            }

            af.put(var0, var1);
            return var1;
         } catch (Exception var3) {
            var3.printStackTrace();
            return var1;
         }
      } else {
         var1.d(3 >> 2);
         return var1;
      }
   }

   public static synchronized void aa(Graphics2D var0, int var1, int var2, AffineTransform var3, BufferedImage var4) {
      int var10002;
      if (p == null || p.getWidth() < var4.getWidth() || p.getHeight() < var4.getHeight()) {
         BufferedImage var10000 = new BufferedImage;
         BufferedImage var10003;
         if (var4.getWidth() < (120 & 127)) {
            var10002 = 125 & 122;
            var10003 = var4;
         } else {
            var10002 = var4.getWidth();
            var10003 = var4;
         }

         var10000.<init>(var10002, var10003.getHeight() < (30368 & 2559) ? 10731 & 22196 : var4.getHeight(), 2);
         p = var10000;
      }

      if (q != var4) {
         Graphics2D var5 = p.createGraphics();
         var10002 = 5 >> 3;
         var5.setBackground(Class681.cu);
         var5.clearRect(var10002, 3 >> 2, p.getWidth(), p.getHeight());

         int var6;
         for(int var9 = var6 = var4.getHeight() - (4 ^ 5); var9 >= 0; var9 = var6) {
            int var7;
            for(var9 = var7 = var4.getWidth() - --1; var9 >= 0; var9 = var7) {
               int var8;
               if ((var8 = var4.getRGB(var7, var6)) != 0) {
                  p.setRGB(var7, var6, x(var8));
               }

               --var7;
            }

            --var6;
         }

         var5.dispose();
         q = var4;
      }

      if (var3 != null) {
         var0.drawImage(p, var3, (ImageObserver)null);
      } else {
         var0.drawImage(p, var1, var2, (ImageObserver)null);
      }
   }

   public static Class8 ab(long var0, boolean var2, short[] var3) {
      boolean var6 = var2;
      Class8 var4 = null;

      Class8 var10000;
      label30: {
         label29: {
            try {
               Class447 var5;
               if ((var5 = z((int)(var0 >> (123 & 36)) + (62 & 97))) != null) {
                  byte[] var12 = new byte[--4];
                  boolean var10002 = true;
                  byte[] var11 = var12;
                  int var13 = 3 ^ 3;
                  var5.c(var0 & 2147483647L, var11);
                  int var7 = var13;

                  int var8;
                  for(var13 = var8 = 3 & 4; var13 < var11.length; var13 = var8) {
                     int var9 = (var11[var8] & 4863 & 28159) << (75 & 60) * var8;
                     ++var8;
                     var7 += var9;
                  }

                  var12 = new byte[var7];
                  var10002 = true;
                  var11 = var12;
                  var5.c(var0 + 4L & 2147483647L, var11);
                  var4 = (new Class434(var11)).i(var6, (boolean)(3 & 5), 3 & 5, var3);
                  break label29;
               }
            } catch (Exception var10) {
               var10.printStackTrace();
            }

            var10000 = var4;
            break label30;
         }

         var10000 = var4;
      }

      if (var10000 == null) {
         var4 = k(--1);
      }

      return var4;
   }

   public static long[] ac(long var0, int var2) {
      if (var2 == -4 >> 2) {
         return (long[])b.get(var0);
      } else {
         long[] var3;
         if ((var3 = (long[])b.get((long)(var2 << (94 & 61)) | var0)) != null) {
            return var3;
         } else {
            for(int var10000 = var2 = 0; var10000 < aa.length; var10000 = var2) {
               if ((var3 = (long[])b.get((long)(var2 << (92 & 63)) | var0)) != null && var3.length != 0) {
                  return var3;
               }

               ++var2;
            }

            return i;
         }
      }
   }

   public static void ad(Class8 var0) {
      synchronized(var0) {
         int var2 = var0.f();
         int var3 = var0.x();
         if (var2 != -4 >> 2) {
            Class8 var10000;
            int var4;
            Class434 var5;
            label99: {
               var2 %= var0.z();
               var4 = 3 & 4;
               var5 = var0.n();
               if ((var0.z() == --4 || var0.z() == (77 & 58)) && var5 != null && var5.e()) {
                  var4 = --1;
                  if (var2 == (3 & 5)) {
                     var2 = 3 >> 2;
                     var10000 = var0;
                     break label99;
                  }

                  if (var2 == --3) {
                     var2 = 5 >> 1;
                     var10000 = var0;
                     break label99;
                  }

                  if (var2 == (111 & 23)) {
                     var2 = --5;
                  }
               }

               var10000 = var0;
            }

            if (var10000.e(var2).g() == null) {
               int var1;
               int var10;
               if (var5 != null) {
                  for(var10 = var1 = 2 & 5; var10 < var3; var10 = var1) {
                     Class233 var7 = var0.c()[var2 * var3 + var1];
                     BufferedImage var8 = l(var5, var7, var0);
                     ++var1;
                     var7.j(var8);
                  }

                  var10 = var4;
               } else {
                  for(var10 = var1 = 0; var10 < var3; var10 = var1) {
                     Class233[] var11 = var0.c();
                     int var10001 = var2 * var3 + var1;
                     ++var1;
                     var11[var10001].j(g);
                  }

                  var10 = var4;
               }

               label58: {
                  if (var10 != 0) {
                     if (var2 == 0) {
                        var10000 = var0;
                        var0.j(2 & 5, --1);
                        break label58;
                     }

                     if (var2 == 5 >> 1) {
                        var10000 = var0;
                        var0.j(5 >> 1, --3);
                        break label58;
                     }

                     if (var2 == --5) {
                        var0.j(--5, 95 & 39);
                     }
                  }

                  var10000 = var0;
               }

               var10000.s();
            }
         }
      }
   }


   private static synchronized long ae(String var0) {
      Long var5;
      if ((var5 = (Long)c.get(var0)) != null) {
         return var5;
      } else {
         try {
            var5 = ++d;
            short[] var2 = null;
            int var4 = 2 & 5;
            int var3 = 3 ^ 3;

            int var1;
            for(int var10000 = var1 = 3 & 4; var10000 != var0.length(); var10000 = var1) {
               if ((var1 = var0.indexOf("|", var3 + (3 >> 1))) == -4 >> 2) {
                  var1 = var0.length();
               }

               if (var4 == 0) {
                  int var6 = Class394.b(var0, var3, var1);
                  short[] var8 = new short[(1 ^ 3) + (30 & 107) * var6];
                  boolean var10002 = true;
                  var2 = var8;
                  var10000 = var1;
                  var2[var4] = (short)var6;
               } else {
                  var2[var4] = (short)Class394.b(var0, var3, var1);
                  var10000 = var1;
               }

               ++var4;
               var3 = var10000 + 1;
            }

            j.put(var5, var2);
            return var5;
         } catch (Exception var7) {
            var7.printStackTrace();
            System.err.println("错误格式的着色方案");
            return 0L;
         }
      }
   }

   public static String af(int var0) {
      return aa[var0];
   }

   public static long ag(long var0) {
      if (var0 < 25000L) {
         var0 = o(var0);
      }

      if (var0 > 2147483647L) {
         if (var0 >> (40 & 127) > 0L) {
            return var0;
         }

         if (var0 >> (58 & 101) > 18L) {
            long var10000;
            Long var2;
            if ((var2 = (Long)h.get(var0)) == null) {
               var2 = new Long(var0);
               File var3;
               if ((var3 = new File("skin/" + var2)).exists() || var3.isDirectory()) {
                  h.put(var2, var2);
                  return var0;
               }

               h.put(var2, 0L);
               var10000 = var0;
            } else {
               if (var2 != 0L) {
                  return var0;
               }

               var10000 = var0;
            }

            var0 = (var10000 >> 32) - 18L << (120 & 39) | (long)((int)var0);
         }

         long var4;
         if ((var4 = g(var0 & 2147483647L)) != 0L) {
            var0 = var4;
         }

         if ((Class25[])ai.get(var0) == null) {
            var0 = o(var0 & 2147483647L);
         }
      }

      return var0;
   }

   public static Class8 ah(long var0, boolean var2, short[] var3) {
      boolean var6 = var2;
      Class8 var4 = null;

      Class8 var10000;
      label30: {
         label29: {
            try {
               Class447 var5;
               if ((var5 = z((int)(var0 >> (120 & 39)))) != null) {
                  byte[] var12 = new byte[--4];
                  boolean var10002 = true;
                  byte[] var11 = var12;
                  int var13 = 3 ^ 3;
                  var5.c(var0 & 2147483647L, var11);
                  int var7 = var13;

                  int var8;
                  for(var13 = var8 = 3 ^ 3; var13 < var11.length; var13 = var8) {
                     int var9 = (var11[var8] & 2047 & 30975) << (45 & 90) * var8;
                     ++var8;
                     var7 += var9;
                  }

                  var12 = new byte[var7];
                  var10002 = true;
                  var11 = var12;
                  var5.c(var0 + 4L & 2147483647L, var11);
                  var4 = (new Class434(var11)).i(var6, (boolean)(3 & 5), 3 & 5, var3);
                  break label29;
               }
            } catch (Exception var10) {
               var10.printStackTrace();
            }

            var10000 = var4;
            break label30;
         }

         var10000 = var4;
      }

      if (var10000 == null) {
         var4 = k(3 & 5);
      }

      return var4;
   }

   public static Class19 ai(long var0, int var2, int var3, String var4) {
      long var5;
      Object var12;
      int var13;
      Object var14;
      label51: {
         int var10000 = var2;
         String var11 = var4;
         var13 = var10000;
         var5 = var11 != null ? h(var11) : 0L;
         var12 = null;
         if (var13 != (-1 & -2) && var13 != -4 >> 2) {
            label50: {
               try {
                  long var7;
                  if ((var7 = c(var0)) != 0L) {
                     var0 = var7;
                  }

                  Class25[] var9;
                  if ((var9 = j(var0)) != null) {
                     if (SystemData.isOld) {
                        var0 = ag(var0);
                        var14 = var12;
                     } else {
                        var14 = var12 = new Class154(var0, var9, var13, var3, var5);
                     }
                     break label51;
                  }

                  if (ac(var0, -4 >> 2) == null) {
                     break label50;
                  }

                  var12 = new Class188(var0, var13, var3, var5);
               } catch (Exception var10) {
                  var10.printStackTrace();
                  break label50;
               }

               var14 = var12;
               break label51;
            }
         }

         var14 = var12;
      }

      if (var14 == null) {
         var12 = new Class277(String.valueOf(var0), var13, var3, var5);
      }

      return (Class19)var12;
   }

   public static Class8 aj(long var0, int var2) {
      int var3 = var2;
      SoftReference var4;
      if ((var4 = (SoftReference)z.get(var0)) != null && var4.get() != null) {
         return (Class8)var4.get();
      } else {
         p((var3 != 0 && var3 != (3 & 5) && var3 != 5 >> 1 && var3 != (110 & 27) ? Class444.g : Class444.b) + var0);
         return null;
      }
   }

   public static Object ak() {
      Object var0;
      synchronized(var0 = x) {
         Object var10000;
         Object var10001;
         if (v.size() != 0) {
            var10000 = v.get(2 & 5);
            var10001 = var0;
         } else {
            var10000 = null;
            var10001 = var0;
         }

         return var10000;
      }
   }

   public static BufferedImage al(Class434 var0, Class233 var1, Class8 var2) throws IOException {
      var0.k(var1.n());
      int var18 = var0.read() == (2 ^ 3) ? 3 & 5 : 0;
      short var15 = var0.g();
      short var4 = var0.g();
      short var5 = var0.g();
      short var6;
      short var10001 = var6 = var0.g();
      var1.l(var5);
      var1.b(var10001);
      System.out.println(var5 + ":" + var6);
      if (var4 > (2024 & 31743) || var15 > (17405 & 16362)) {
         System.err.println("警报:" + var15 + ":" + var4);
         if (var4 >= (7147 & 30620) || var15 >= (8095 & 29672)) {
            return g;
         }
      }

      Class495 var17 = new Class495();
      BufferedImage var19;
      WritableRaster var20 = (var19 = new BufferedImage(var15, var4, 5 >> 1)).getRaster();
      int[] var10000 = new int[--4];
      boolean var10002 = true;
      int[] var7 = var10000;
      int var8 = 3 ^ 3;
      int var9 = 3 & 4;
      int var10 = 5 >> 3;
      int var11 = 3 >> 2;
      int var3;
      int var12;
      int var13;
      int var14;
      int[] var16;
      int var21;
      int var10007;
      if (var18 != 0) {
         var18 = (var4 - (2 ^ 3)) / --4;
         var12 = (var15 - (3 >> 1)) / --4;

         for(var21 = var13 = 2 & 5; var21 <= var18; var21 = var13) {
            for(var21 = var14 = 0; var21 <= var12; var21 = var14) {
               var17.a(var0);
               var8 = var13 * --4;
               var9 = var14 * --4;

               for(var21 = var3 = 3 ^ 3; var21 < var17.d.length; var21 = var3) {
                  var10 = var8 + var3 % --4;
                  var11 = var9 + var3 / --4;
                  if (var10 < var4 && var11 < var15) {
                     var10 = var11;
                     var11 = var4 - (4 ^ 5) - (var8 + var3 % --4);
                     var16 = var17.c[var17.d[var3]];
                     int var10003 = --3;
                     int var10005 = 1 ^ 3;
                     var10007 = 3 & 5;
                     var7[5 >> 3] = var16[5 >> 3];
                     var7[var10007] = var16[4 ^ 5];
                     var7[var10005] = var16[--2];
                     var7[var10003] = var17.a[var17.b[var3]];
                     var20.setPixel(var10, var11, var7);
                  }

                  ++var3;
               }

               ++var14;
            }

            ++var13;
         }

         return var19;
      } else {
         var18 = (var15 - (4 ^ 5)) / --4;
         var12 = (var4 - --1) / --4;

         for(var21 = var13 = 3 & 4; var21 <= var18; var21 = var13) {
            for(var21 = var14 = 0; var21 <= var12; var21 = var14) {
               var17.a(var0);
               var8 = var13 * --4;
               var9 = var14 * --4;

               for(var21 = var3 = 3 & 4; var21 < var17.d.length; var21 = var3) {
                  var10 = var8 + var3 % 4;
                  var11 = var9 + var3 / 4;
                  if (var10 < var15 && var11 < var4) {
                     var16 = var17.c[var17.d[var3]];
                     var10007 = --1;
                     var7[3 >> 2] = var16[3 >> 2];
                     var7[var10007] = var16[1];
                     var7[2] = var16[2];
                     var7[3] = var17.a[var17.b[var3]];
                     var20.setPixel(var10, var11, var7);
                  }

                  ++var3;
               }

               ++var14;
            }

            ++var13;
         }

         return var19;
      }
   }

   public static boolean am(String var0) {
      int var1;
      for(int var10000 = var1 = 5 >> 3; var10000 < 11; var10000 = var1) {
         if (var0.endsWith(ae[var1])) {
            int var2;
            for(var10000 = var2 = 79 & 59; var10000 < ae.length; var10000 = var2) {
               if (var0.indexOf(ae[var2]) != -4 >> 2) {
                  return false;
               }

               ++var2;
            }

            return (boolean)(3 >> 1);
         }

         ++var1;
      }

      return false;
   }
}
