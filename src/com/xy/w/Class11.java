package com.xy.w;

import com.xy.q.Class49;
import com.xy.text.SystemData;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.awt.image.WritableRaster;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Class11 {
   static BufferedImage a;
   public static String[] b = new String[13];
   static String c = "1282.tcp";
   static final int d = 12;
   public static final BufferedImage e = new BufferedImage(1, 1, 2);
   static final int f = 128;
   public static Map<Long, long[]> g = new HashMap<>();
   public static Class2 h;
   static String[] i;
   static final int j = 32;
   static final String k = "SH";
   static final int l = 192;
   public static Map<Long, short[]> m = new HashMap<>();
   private static long n;
   static final int o = 64;
   static BufferedImage p;
   public static Map<String, SoftReference<Class1>> q = new HashMap<>();
   public static Object r = new Object();
   public static Map<Integer, long[]> s = new HashMap<>();
   public static Map<Long, SoftReference<Class1>> t = new HashMap<>();
   public static final int u = 100;
   static final String v = "SP";
   public static Map<Integer, Class4> w = new HashMap<>();
   public static Map<String, Long> x = new HashMap<>();
   static long[] y = new long[0];
   public static Map<Long, Class5[]> z = new HashMap<>();
   public static Class1[] aa = new Class1[6];
   public static Class1 ab;
   public static List<Object> ac = new ArrayList<>();
   static final int ad = 0;
   static final int ae = 0;
   static final int af = 192;

   public static Class1 a(long var0, int var2) {
      SoftReference var3;
      if ((var3 = t.get(-var0)) != null && var3.get() != null) {
         return (Class1)var3.get();
      } else {
         ac((var2 != 0 && var2 != 1 && var2 != 2 && var2 != 10 ? Class2.f : Class2.c) + var0);
         return null;
      }
   }

   public static void b(Class1 var0) {
      synchronized (var0) {
         int var2 = var0.n();
         int var3 = var0.w();
         if (var2 != -1) {
            boolean var4;
            Class10 var5;
            Class1 var10000;
            label102: {
               var2 %= var0.z();
               var4 = false;
               var5 = var0.y();
               if ((var0.z() == 4 || var0.z() == 8) && var5 != null && var5.e()) {
                  var4 = true;
                  if (var2 == 1) {
                     var2 = 0;
                     var10000 = var0;
                     break label102;
                  }

                  if (var2 == 3) {
                     var2 = 2;
                     var10000 = var0;
                     break label102;
                  }

                  if (var2 == 7) {
                     var2 = 5;
                  }
               }

               var10000 = var0;
            }

            if (var10000.i(var2).h() == null) {
               boolean var13;
               if (var5 != null) {
                  int var6;
                  for (int var12 = var6 = 0; var12 < var3; var12 = var6) {
                     Class3 var7 = var0.b()[var2 * var3 + var6];
                     BufferedImage var8 = r(var5, var7, var0);
                     var6++;
                     var7.m(var8);
                  }

                  var13 = var4;
               } else {
                  int var11;
                  for (int var14 = var11 = 0; var14 < var3; var14 = var11) {
                     Class3[] var15 = var0.b();
                     int var10001 = var2 * var3 + var11;
                     var11++;
                     var15[var10001].m(e);
                  }

                  var13 = var4;
               }

               label61: {
                  if (var13) {
                     if (var2 == 0) {
                        var10000 = var0;
                        var0.x(0, 1);
                        break label61;
                     }

                     if (var2 == 2) {
                        var10000 = var0;
                        var0.x(2, 3);
                        break label61;
                     }

                     if (var2 == 5) {
                        var0.x(5, 7);
                     }
                  }

                  var10000 = var0;
               }

               var10000.ac();
            }
         }
      }
   }

   static {
      String[] var10000 = new String[20];
      String var10003 = "=\\!\u001b!V%";
      var10000[0] = "hit.tcp";
      var10003 = "J\u000b@\u0003DDS\tW";
      var10000[1] = "magic.tcp";
      var10003 = "Q0S0[1\u001b!V%";
      var10000[2] = "defend.tcp";
      var10003 = "@\u001fF\u0018CDS\tW";
      var10000[3] = "guard.tcp";
      var10003 = "1\\0\u001b!V%";
      var10000[4] = "die.tcp";
      var10003 = "\u000bS\u001eF\tLDS\tW";
      var10000[5] = "attack.tcp";
      var10003 = "Ag\u001b!V%";
      var10000[6] = "t2.tcp";
      var10003 = "^\u0017Z\u0016DS\tW";
      var10000[7] = "4001.tcp";
      var10003 = "\u0001e\u0005g\u001b!V%";
      var10000[8] = "4002.tcp";
      var10003 = "^\u0017Z\u0014DS\tW";
      var10000[9] = "4003.tcp";
      var10003 = "\u0001e\u0005a\u001b!V%";
      var10000[10] = "4004.tcp";
      var10003 = "^\u0017Z\u0012Z\u001e";
      var10000[11] = "400509";
      var10003 = "\u0001e\u0005`\u0006`";
      var10000[12] = "400535";
      var10003 = "^\u0017Z\u0014[\u0013";
      var10000[13] = "400314";
      var10003 = "`\u0007d\u0005c";
      var10000[14] = "52106";
      var10003 = "\u0012X\u0016[\u0013";
      var10000[15] = "52114";
      var10003 = "\u0004g\u0000g\u001b!V%";
      var10000[16] = "1252.tcp";
      var10003 = "[\u0015_\u0014DS\tW";
      var10000[17] = "1253.tcp";
      var10003 = "\u0004g\u0000a\u001b!V%";
      var10000[18] = "1254.tcp";
      var10003 = "[\u0015_\u0012DS\tW";
      var10000[19] = "1255.tcp";
      i = var10000;
      String var10002 = "B4Y>";
      b[0] = "walk";
      var10002 = "U\u001fI";
      b[1] = "run";
      var10002 = "&A4[1";
      b[2] = "stand";
      var10002 = "\u001e\u0016";
      b[3] = "t1";
      var10002 = "=\\!";
      b[4] = "hit";
      var10002 = "J\u000b@\u0003D";
      b[5] = "magic";
      var10002 = "Q0S0[1";
      b[6] = "defend";
      var10002 = "@\u001fF\u0018C";
      b[7] = "guard";
      var10002 = "1\\0";
      b[8] = "die";
      var10002 = "\u000bS\u001eF\tL";
      b[9] = "attack";
      var10002 = "4A!T6^'@;";
      b[10] = "attackrun";
      var10002 = "\u001e\u0015";
      b[11] = "t2";
      var10002 = "Af";
      b[12] = "t3";

      try {
         var10002 = "\u0019DEJ\u001fT\u0003DE\u0016";
         File var0;
         if ((var0 = new File("sc/music/1")).exists()) {
            FileInputStream var1;
            FileInputStream var14 = var1 = new FileInputStream(var0);
            byte[] var2;
            var14.read(var2 = new byte[var14.available()]);
            Class10 var3;
            (var3 = new Class10(var2)).f(2);
            Class10 var15 = var3;

            while (var15.available() > 0) {
               var15 = var3;
               long var4 = var3.m();
               z.put(var4, h(var4, var3));
            }

            var1.close();
            var3.close();
         }

         var10002 = "F6\u001a8@&\\6\u001ae\u001b%[2";
         if ((var0 = new File("sc/music/0.png")).exists()) {
            FileInputStream var10;
            FileInputStream var16 = var10 = new FileInputStream(var0);
            byte[] var11;
            var16.read(var11 = new byte[var16.available()]);
            Class10 var12;
            (var12 = new Class10(var11)).f(2);

            for (Class10 var17 = var12; var17.available() > 0; var17 = var12) {
               long var13 = var12.m();
               long[] var6 = new long[var12.read()];

               int var7;
               for (int var18 = var7 = 0; var18 < var6.length; var18 = var7) {
                  var6[var7] = var12.read();
                  int var10001 = var7;
                  long var34 = var6[var7] << 32 | var12.k();
                  var7++;
                  var6[var10001] = var34;
               }

               g.put(var13, var6);
               if (g.get(var13 & 268435455L) == null) {
                  g.put(var13 & 268435455L, y);
               }
            }

            var10.close();
            var12.close();
         }
      } catch (Exception var8) {
         var8.printStackTrace();
      }

      h = new Class2();
      h.start();
      String var19 = "T\u0001N\u0004\b3}DS\tW";
      ab = f("skin/YZ.tcp", null);
      ab.j(0L, 0);
   }

   public static long c(long var0) {
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

   public static long d(long var0) {
      if (var0 < 25000L) {
         var0 = n(var0);
      }

      if (var0 > 2147483647L) {
         if (var0 >> 40 > 0L) {
            return var0;
         }

         if (var0 >> 32 > 18L) {
            var0 = (var0 >> 32) - 18L << 32 | (int)var0;
         }

         long var2;
         if ((var2 = c(var0 & 2147483647L)) != 0L) {
            var0 = var2;
         }

         if (z.get(var0) == null) {
            var0 = n(var0 & 2147483647L);
         }
      }

      return var0;
   }

   public static synchronized Class4 e(int var0) {
      Class4 var1;
      if ((var1 = w.get(var0)) == null) {
         try {
            if (var0 > 32) {
               String var10004 = "&VzX F<Vz";
               var1 = new Class4("sc/music/" + (var0 - 32) + ".png");
            } else {
               StringBuilder var10002 = new StringBuilder("skin/").append(var0);
               String var10003 = "\t\u0002O";
               var1 = new Class4(var10002.append(".hh").toString());
            }

            w.put(var0, var1);
            return var1;
         } catch (Exception var3) {
            var3.printStackTrace();
            return var1;
         }
      } else {
         var1.c(0);
         return var1;
      }
   }

   public static Class1 f(String var0, short[] var1) {
      if (var0 != null && var0.length() != 0) {
         Class1 var2 = null;

         Class1 var10000;
         label51: {
            label50: {
               try {
                  File var3;
                  if ((var3 = new File(var0)) != null && var3.exists()) {
                     FileInputStream var4 = new FileInputStream(var3);
                     byte[] var5 = new byte[2];
                     var4.read(var5);
                     String var6 = new String(var5);
                     int var7 = var6.equals("SP") ? 0 : (var6.equals("SH") ? 1 : -1);
                     if (var7 >= 0) {
                        FileInputStream var13 = var4;
                        var5 = new byte[var4.available()];
                        int var8 = 0;
                        int var9 = 0;

                        while (var13.available() > 0) {
                           var13 = var4;
                           var8 = var4.read(var5, var9, var4.available());
                           var9 += var8;
                        }

                        var4.close();
                        var10000 = var2 = new Class10(var5).j(ai(var0), i(var0), var7, var1);
                        break label51;
                     }

                     var4.close();
                     break label50;
                  }
               } catch (Exception var10) {
                  var10.printStackTrace();
               }

               var10000 = var2;
               break label51;
            }

            var10000 = var2;
         }

         if (var10000 == null) {
            var2 = af(o(var0));
         }

         return var2;
      } else {
         return null;
      }
   }

   public static String g(int var0) {
      return b[var0];
   }

   public static Class5[] h(long var0, Class10 var2) throws IOException {
      Class5[] var3 = new Class5[var2.read()];

      int var4;
      for (int var10000 = var4 = 0; var10000 < var3.length; var10000 = var4) {
         Class5 var5;
         (var5 = new Class5()).c((byte)var2.read());
         long[] var6 = new long[var2.read()];

         int var7;
         for (int var8 = var7 = 0; var8 < var6.length; var8 = var7) {
            int var10001 = var7;
            long var10002 = var2.m();
            var7++;
            var6[var10001] = var10002;
         }

         int var9 = var4;
         var5.d(var6);
         var4++;
         var3[var9] = var5;
      }

      return var3;
   }

   public static boolean i(String var0) {
      return !var0.endsWith(c);
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public static Object j() {
      Object var0 = r;
      synchronized (r) {
         Object var10000;
         Object var10001;
         if (ac.size() != 0) {
            var10000 = ac.get(0);
            var10001 = var0;
         } else {
            var10000 = null;
            var10001 = var0;
         }

         // $VF: monitorexit
         return var10000;
      }
   }

   public static long k(String var0) {
      Long var1;
      return (var1 = x.get(var0)) != null ? var1 : l(var0);
   }

   // $VF: synthetic method
   private static synchronized long l(String var0) {
      Long var1;
      if ((var1 = x.get(var0)) != null) {
         return var1;
      } else {
         try {
            var1 = ++n;
            short[] var2 = null;
            int var3 = 0;
            int var4 = 0;
            int var5;
            int var10000 = var5 = 0;

            while (var10000 != var0.length()) {
               String var10001 = ")";
               if ((var5 = var0.indexOf("|", var4 + 1)) == -1) {
                  var5 = var0.length();
               }

               if (var3 == 0) {
                  int var6 = com.xy.v.Class12.ad(var0, var4, var5);
                  var2 = new short[2 + 10 * var6];
                  var10000 = var5;
                  var2[var3] = (short)var6;
               } else {
                  var2[var3] = (short)com.xy.v.Class12.ad(var0, var4, var5);
                  var10000 = var5;
               }

               var3++;
               var4 = var10000 + 1;
               var10000 = var5;
            }

            m.put(var1, var2);
            return var1;
         } catch (Exception var7) {
            var7.printStackTrace();
            String var10002 = "锾讅栛彥皣眪艕旓桯";
            System.err.println("错误格式的着色方案");
            return 0L;
         }
      }
   }

   public static Class1 m(long var0, boolean var2, short[] var3) {
      Class1 var4 = null;

      Class1 var10000;
      label33: {
         label32: {
            try {
               Class4 var5;
               if ((var5 = e((int)(var0 >> 32) + 32)) != null) {
                  byte[] var6 = new byte[4];
                  var5.d(var0 & 2147483647L, var6);
                  int var7 = 0;

                  int var8;
                  for (int var12 = var8 = 0; var12 < var6.length; var12 = var8) {
                     int var9 = (var6[var8] & 255) << 8 * var8;
                     var8++;
                     var7 += var9;
                  }

                  var6 = new byte[var7];
                  var5.d(var0 + 4L & 2147483647L, var6);
                  var4 = new Class10(var6).j(var2, true, 1, var3);
                  break label32;
               }
            } catch (Exception var10) {
               var10.printStackTrace();
            }

            var10000 = var4;
            break label33;
         }

         var10000 = var4;
      }

      if (var10000 == null) {
         var4 = af(1);
      }

      return var4;
   }

   public static long n(long var0) {
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
      } else if (var0 == 23007L) {
         var0 = 42949695967L;
         return 42949695967L;
      } else if (var0 == 21012L) {
         var0 = 42949693972L;
         return 42949693972L;
      } else if (var0 == 20012L) {
         var0 = 34359758380L;
         return 34359758380L;
      } else if (var0 == 22012L) {
         var0 = 47244662268L;
         return 47244662268L;
      } else if (var0 == 22011L) {
         var0 = 51539629563L;
         return 51539629563L;
      } else if (var0 == 23008L) {
         var0 = 4294990304L;
         return 4294990304L;
      } else if (var0 == 20011L) {
         var0 = 30064791083L;
         return 30064791083L;
      } else {
         if (var0 == 21011L) {
            var0 = 42949693971L;
         }

         return var0;
      }
   }

   public static int o(String var0) {
      if (var0.length() <= 4) {
         return -1;
      } else {
         var0 = var0.substring(0, var0.length() - 4);

         int var1;
         for (int var10000 = var1 = 0; var10000 < b.length; var10000 = ++var1) {
            if (var0.endsWith(b[var1])) {
               return var1;
            }
         }

         return -1;
      }
   }

   public static Class0 p(long var0, int var2, int var3, String var4) {
      long var5;
      Object var7;
      Object var10000;
      label43: {
         label42: {
            var5 = var4 != null ? k(var4) : 0L;
            var7 = null;
            if (var2 != -2 && var2 != -1) {
               try {
                  long var8;
                  if ((var8 = aj(var0)) != 0L) {
                     var0 = var8;
                  }

                  Class5[] var10;
                  if ((var10 = ab(var0)) != null) {
                     if (SystemData.isOld) {
                        var0 = d(var0);
                        var10000 = var7;
                     } else {
                        var10000 = var7 = new Class6(var0, var10, var2, var3, var5);
                     }
                     break label43;
                  }

                  if (y(var0, -1) != null) {
                     var7 = new Class12(var0, var2, var3, var5);
                     break label42;
                  }
               } catch (Exception var11) {
                  var11.printStackTrace();
               }
            }

            var10000 = var7;
            break label43;
         }

         var10000 = var7;
      }

      if (var10000 == null) {
         var7 = new Class8(String.valueOf(var0), var2, var3, var5);
      }

      return (Class0)var7;
   }

   public static void q(Object var0) {
      synchronized (r) {
         ac.remove(var0);
      }
   }

   public static BufferedImage r(Class10 var0, Class3 var1, Class1 var2) {
      try {
         if (var1.b() == 0) {
            return e;
         } else if (var1.h() != null) {
            return (BufferedImage)var1.h();
         } else {
            var0.f(var1.b());
            int var3 = var0.k();
            int var4 = var0.k();
            if (var2.w() == 1) {
               var3 = var2.r();
               var4 = var2.t();
            }

            int var5 = var0.k();
            int var6;
            if ((var6 = var0.k()) > 1000 || var5 > 1000) {
               PrintStream var10000 = System.err;
               String var10003 = "謳抐o";
               StringBuilder var10001 = new StringBuilder("警报:").append(var5);
               String var10002 = "\u001d";
               var10000.println(var10001.append(":").append(var6).toString());
               if (var6 >= 5000 || var5 >= 5000) {
                  return e;
               }
            }

            int[] var7 = new int[var6];

            int var8;
            for (int var35 = var8 = 0; var35 < var6; var35 = var8) {
               int var44 = var8;
               int var48 = var0.k();
               var8++;
               var7[var44] = var48;
            }

            var1.i(var3);
            var1.g(var4);
            if (var5 != 0 && var6 != 0) {
               short[] var22 = var0.c();
               BufferedImage var9;
               WritableRaster var10 = (var9 = new BufferedImage(var5, var6, 2)).getRaster();
               int[] var11 = new int[4];
               int var12 = 0;
               int var17 = 0;

               int var18;
               for (int var36 = var18 = 0; var36 < var6; var36 = ++var18) {
                  if (var7[var18] != 0) {
                     int var13;
                     var36 = var13 = 0;
                     var0.f(var7[var18] + var1.b());

                     while (true) {
                        if (var36 < var5) {
                           int var15;
                           if ((var15 = (var12 = var0.read()) & 192) != 0) {
                              if (var15 == 64) {
                                 int var28;
                                 if ((var28 = var12 & 63) + var13 > var5) {
                                    var28 = var5 - var13;
                                 }

                                 int var34;
                                 for (int var43 = var34 = 0; var43 < var28; var43 = var34) {
                                    ad(var11, var22[var0.read()], 255);
                                    var34++;
                                    var10.setPixel(var13, var18, var11);
                                    var13++;
                                 }

                                 var36 = var13;
                                 continue;
                              }

                              if (var15 != 128) {
                                 if (var15 == 192) {
                                    int var27;
                                    if ((var27 = var12 & 63) == 0) {
                                       var12 = var0.read();
                                       var12 = var0.read();
                                       var36 = var13;
                                       continue;
                                    }

                                    if (var27 + var13 > var5) {
                                       var36 = var13 = var5;
                                       continue;
                                    }

                                    var13 += var27;
                                 }

                                 var36 = var13;
                                 continue;
                              }

                              int var26;
                              if ((var26 = var12 & 63) + var13 > var5) {
                                 var26 = var5 - var13;
                              }

                              ad(var11, var22[var0.read()], 255);

                              int var33;
                              for (int var42 = var33 = 0; var42 < var26; var42 = var33) {
                                 var33++;
                                 var10.setPixel(var13, var18, var11);
                                 var13++;
                              }

                              var36 = var13;
                              continue;
                           }

                           if ((var12 & 32) == 32) {
                              int var30;
                              var30 = (var30 = var12 & 31) << 3 | var30 >>> 2;
                              int var47 = var13;
                              int var10004 = var0.read();
                              var13++;
                              ad(var11, var22[var10004], var30);
                              var10.setPixel(var47, var18, var11);
                              var36 = var13;
                              continue;
                           }

                           if (var12 != 0) {
                              int var14;
                              if ((var14 = var12 & 31) + var13 > var5) {
                                 var14 = var5 - var13;
                              }

                              int var16;
                              var16 = (var16 = var0.read()) << 3 | var16 >>> 2;
                              var36 = 0;
                              ad(var11, var22[var0.read()], var16);

                              for (int var32 = 0; var36 < var14; var36 = var32) {
                                 var32++;
                                 var10.setPixel(var13, var18, var11);
                                 var13++;
                              }

                              var36 = var13;
                              continue;
                           }

                           if (var13 == 0 && var17 != var18) {
                              var17 = var18 + 1;
                              int var19 = var18 - 1;

                              int var20;
                              for (int var39 = var20 = var13; var39 < var5; var39 = ++var20) {
                                 if ((var11 = var10.getPixel(var20, var19, var11))[0] != 0 || var11[1] != 0 || var11[2] != 0 || var11[3] != 0) {
                                    var10.setPixel(var20, var18, var11);
                                 }
                              }

                              var36 = var13;
                              break;
                           }
                        }

                        var36 = var13;
                        break;
                     }

                     if (var36 > var5) {
                        PrintStream var40 = System.err;
                        String var51 = "W9Z6^uP;QuP'G:Go\u0015\u000e";
                        StringBuilder var45 = new StringBuilder("block end error: [").append(var18);
                        String var49 = "7|";
                        var45 = var45.append("][").append(var13);
                        var49 = "z";
                        var40.println(var45.append("/").append(var5).append("]").toString());
                     }
                  }
               }

               return var9;
            } else {
               return e;
            }
         }
      } catch (Exception var21) {
         var21.printStackTrace();
         return e;
      }
   }

   public static int s(int var0, int var1) {
      if (var1 == 2) {
         return var0 == 3 ? 0 : 1;
      } else {
         switch (var0) {
            case 0:
               int var9 = 6;
               return 6;
            case 1:
               int var8 = 3;
               return 3;
            case 2:
               int var7 = 7;
               return 7;
            case 3:
               boolean var6 = false;
               return 0;
            case 4:
               int var5 = 4;
               return 4;
            case 5:
               boolean var4 = true;
               return 1;
            case 6:
               int var3 = 5;
               return 5;
            case 7:
               int var2 = 2;
               return 2;
            default:
               return var0;
         }
      }
   }

   public static Class0 t(String var0, int var1, int var2, String var3) {
      long var4;
      Object var6;
      Object var10000;
      label48: {
         label47: {
            var4 = var3 != null ? k(var3) : 0L;
            var6 = null;
            if (var1 != -2 && var1 != -1) {
               try {
                  long var7 = !com.xy.v.Class12.h(var0) ? Long.parseLong(var0) : 0L;
                  long var9;
                  if ((var9 = aj(var7)) != 0L) {
                     var0 = String.valueOf(var9);
                     var7 = var9;
                  }

                  Class5[] var11;
                  if ((var11 = ab(var7)) != null) {
                     if (SystemData.isOld) {
                        var0 = String.valueOf(d(var7));
                        var10000 = var6;
                     } else {
                        var10000 = var6 = new Class6(var7, var11, var1, var2, var4);
                     }
                     break label48;
                  }

                  if (y(var7, -1) != null) {
                     var6 = new Class12(var7, var1, var2, var4);
                     break label47;
                  }
               } catch (Exception var12) {
                  var12.printStackTrace();
               }
            }

            var10000 = var6;
            break label48;
         }

         var10000 = var6;
      }

      if (var10000 == null) {
         var6 = new Class8(var0, var1, var2, var4);
      }

      return (Class0)var6;
   }

   public static Class7 u(String var0) {
      Class7 var1 = null;

      Class7 var10000;
      label49: {
         label48: {
            try {
               File var2;
               if ((var2 = new File(var0)) != null && var2.exists()) {
                  FileInputStream var3 = new FileInputStream(var2);
                  byte[] var4 = new byte[2];
                  var3.read(var4);
                  String var5 = new String(var4);
                  int var6 = var5.equals("SP") ? 0 : (var5.equals("SH") ? 1 : -1);
                  if (var6 >= 0) {
                     FileInputStream var13 = var3;
                     var4 = new byte[var3.available()];
                     int var7 = 0;
                     int var8 = 0;

                     while (var13.available() > 0) {
                        var13 = var3;
                        var7 = var3.read(var4, var8, var3.available());
                        var8 += var7;
                     }

                     var3.close();
                     var10000 = var1 = new Class10(var4).l();
                     break label49;
                  }

                  var3.close();
                  break label48;
               }
            } catch (Exception var9) {
               var9.printStackTrace();
            }

            var10000 = var1;
            break label49;
         }

         var10000 = var1;
      }

      if (var10000 == null) {
         var1 = new Class7();
         Class3 var10 = new Class3(e, 0, 0);
         var1.k(var10);
      }

      return var1;
   }

   public static short[] v(long var0) {
      return m.get(var0);
   }

   public static int w(int var0) {
      if (var0 == 0) {
         return 0;
      } else {
         int var1 = var0 >> 16 & 0xFF;
         int var2 = var0 >> 8 & 0xFF;
         int var3 = var0 & 0xFF;
         int var4 = var0 >> 24 & 0xFF;
         int var5 = var1 * 400 >>> 8;
         int var6 = var2 * 400 >>> 8;
         int var7 = var3 * 400 >>> 8;
         var1 = Math.min(var5, 255);
         var2 = Math.min(var6, 255);
         var3 = Math.min(var7, 255);
         return var4 << 24 | var1 << 16 | var2 << 8 | var3;
      }
   }

   public static Class1 x(String var0) {
      SoftReference var1;
      if ((var1 = q.get(var0)) != null && var1.get() != null) {
         return (Class1)var1.get();
      } else {
         ac(var0);
         return null;
      }
   }

   public static long[] y(long var0, int var2) {
      if (var2 == -1) {
         return g.get(var0);
      } else {
         long[] var3;
         if ((var3 = g.get(var2 << 28 | var0)) != null) {
            return var3;
         } else {
            int var4;
            for (int var10000 = var4 = 0; var10000 < b.length; var10000 = ++var4) {
               if ((var3 = g.get(var4 << 28 | var0)) != null && var3.length != 0) {
                  return var3;
               }
            }

            return y;
         }
      }
   }

   public static Class1 z(long var0, boolean var2, short[] var3) {
      Class1 var4 = null;

      Class1 var10000;
      label33: {
         label32: {
            try {
               Class4 var5;
               if ((var5 = e((int)(var0 >> 32))) != null) {
                  byte[] var6 = new byte[4];
                  var5.d(var0 & 2147483647L, var6);
                  int var7 = 0;

                  int var8;
                  for (int var12 = var8 = 0; var12 < var6.length; var12 = var8) {
                     int var9 = (var6[var8] & 255) << 8 * var8;
                     var8++;
                     var7 += var9;
                  }

                  var6 = new byte[var7];
                  var5.d(var0 + 4L & 2147483647L, var6);
                  var4 = new Class10(var6).j(var2, true, 1, var3);
                  break label32;
               }
            } catch (Exception var10) {
               var10.printStackTrace();
            }

            var10000 = var4;
            break label33;
         }

         var10000 = var4;
      }

      if (var10000 == null) {
         var4 = af(1);
      }

      return var4;
   }

   public static BufferedImage aa(Class10 var0, Class3 var1, int var2, int var3, int var4, int var5, int var6) {
      try {
         if (var1.b() == 0) {
            return e;
         } else if (var1.h() != null) {
            return (BufferedImage)var1.h();
         } else {
            var0.f(var1.b());
            int var7 = var0.k();
            int var8 = var0.k();
            var1.i(var7);
            var1.g(var8);
            if (var2 == 1) {
               var7 = var3;
               var8 = var4;
            }

            int var9 = var0.k();
            int var10;
            int[] var11 = new int[var10 = var0.k()];

            int var12;
            for (int var10000 = var12 = 0; var10000 < var10; var10000 = var12) {
               int var10001 = var12;
               int var10002 = var0.k();
               var12++;
               var11[var10001] = var10002;
            }

            if (var9 != 0 && var10 != 0) {
               short[] var28 = var0.c();
               BufferedImage var13;
               WritableRaster var14 = (var13 = new BufferedImage(var5, var6, 2)).getRaster();
               var7 = var3 - var7;
               var8 = var4 - var8;
               int[] var15 = new int[4];
               int var16 = 0;
               int var21 = 0;

               int var22;
               for (int var41 = var22 = 0; var41 < var10; var41 = ++var22) {
                  if (var11[var22] != 0) {
                     int var17;
                     var41 = var17 = 0;
                     var0.f(var11[var22] + var1.b());

                     while (true) {
                        if (var41 < var9) {
                           int var19;
                           if ((var19 = (var16 = var0.read()) & 192) != 0) {
                              if (var19 == 64) {
                                 int var34;
                                 if ((var34 = var16 & 63) + var17 > var9) {
                                    var34 = var9 - var17;
                                 }

                                 int var40;
                                 for (int var48 = var40 = 0; var48 < var34; var48 = var40) {
                                    ad(var15, var28[var0.read()], 255);
                                    int var54 = var17 + var7;
                                    var17++;
                                    var40++;
                                    var14.setPixel(var54, var22 + var8, var15);
                                 }

                                 var41 = var17;
                                 continue;
                              }

                              if (var19 != 128) {
                                 if (var19 == 192) {
                                    int var33;
                                    if ((var33 = var16 & 63) == 0) {
                                       var16 = var0.read();
                                       var16 = var0.read();
                                       var41 = var17;
                                       continue;
                                    }

                                    if (var33 + var17 > var9) {
                                       var41 = var17 = var9;
                                       continue;
                                    }

                                    var17 += var33;
                                 }

                                 var41 = var17;
                                 continue;
                              }

                              int var32;
                              if ((var32 = var16 & 63) + var17 > var9) {
                                 var32 = var9 - var17;
                              }

                              ad(var15, var28[var0.read()], 255);

                              int var39;
                              for (int var47 = var39 = 0; var47 < var32; var47 = var39) {
                                 int var53 = var17 + var7;
                                 var17++;
                                 var39++;
                                 var14.setPixel(var53, var22 + var8, var15);
                              }

                              var41 = var17;
                              continue;
                           }

                           if ((var16 & 32) == 32) {
                              int var36;
                              var36 = (var36 = var16 & 31) << 3 | var36 >>> 2;
                              int var52 = var17;
                              int var10004 = var0.read();
                              var17++;
                              ad(var15, var28[var10004], var36);
                              var14.setPixel(var52 + var7, var22 + var8, var15);
                              var41 = var17;
                              continue;
                           }

                           if (var16 != 0) {
                              int var18;
                              if ((var18 = var16 & 31) + var17 > var9) {
                                 var18 = var9 - var17;
                              }

                              int var20;
                              var20 = (var20 = var0.read()) << 3 | var20 >>> 2;
                              var41 = 0;
                              ad(var15, var28[var0.read()], var20);

                              for (int var38 = 0; var41 < var18; var41 = var38) {
                                 int var51 = var17 + var7;
                                 var17++;
                                 var38++;
                                 var14.setPixel(var51, var22 + var8, var15);
                              }

                              var41 = var17;
                              continue;
                           }

                           if (var17 == 0 && var21 != var22) {
                              var21 = var22 + 1;
                              int var23 = var22 - 1;

                              int var24;
                              for (int var44 = var24 = var17; var44 < var9; var44 = ++var24) {
                                 if ((var15 = var14.getPixel(var24, var23 + var8, var15))[0] != 0 || var15[1] != 0 || var15[2] != 0 || var15[3] != 0) {
                                    var14.setPixel(var24, var22 + var8, var15);
                                 }
                              }

                              var41 = var17;
                              break;
                           }
                        }

                        var41 = var17;
                        break;
                     }

                     if (var41 > var9) {
                        PrintStream var45 = System.err;
                        String var10003 = "\bK\u0005D\u0001\u0007\u000fI\u000e\u0007\u000fU\u0018H\u0018\u001dJ|";
                        StringBuilder var49 = new StringBuilder("block end error: [").append(var22);
                        String var55 = "h\u000e";
                        var49 = var49.append("][").append(var17);
                        var55 = "\b";
                        var45.println(var49.append("/").append(var9).append("]").toString());
                     }
                  }
               }

               return var13;
            } else {
               return e;
            }
         }
      } catch (Exception var25) {
         var25.printStackTrace();
         return e;
      }
   }

   public static Class5[] ab(long var0) {
      if (var0 < 25000L) {
         var0 = n(var0);
      }

      Class5[] var2;
      if ((var2 = z.get(var0)) == null && var0 > 2147483647L && var0 >> 32 > 18L) {
         var2 = z.get((var0 >> 32) - 18L << 32 | (int)var0);
      }

      if (var2 == null) {
         var0 = n(var0 & 2147483647L);
         var2 = z.get(var0);
      }

      return var2;
   }

   public static void ac(Object var0) {
      if (var0 != null) {
         synchronized (r) {
            if (!ac.contains(var0)) {
               ac.add(var0);
               h.g();
            }
         }
      }
   }

   public static void ad(int[] var0, short var1, int var2) {
      var0[0] = var1 >>> 11 & 31;
      var0[1] = var1 >>> 5 & 63;
      var0[2] = var1 & 31;
      var0[0] = var0[0] << 3 | var0[0] & 7;
      var0[1] = var0[1] << 2 | var0[1] & 3;
      var0[2] = var0[2] << 3 | var0[2] & 7;
      var0[3] = var2;
   }

   public static synchronized Class1 ae(String var0) {
      SoftReference var1;
      if ((var1 = q.get(var0)) != null && var1.get() != null) {
         return (Class1)var1.get();
      } else {
         Class1 var2 = f(var0, null);
         q.put(var0, new SoftReference<>(var2));
         return var2;
      }
   }

   public static Class1 af(int var0) {
      int var1 = 0;
      if (var0 == 1 || var0 == 0 || var0 == 10) {
         var1 = 1;
      } else if (var0 == 2 || var0 == 7) {
         var1 = 2;
      } else if (var0 == 4 || var0 == 6) {
         var1 = 3;
      } else if (var0 == 5 || var0 == 3 || var0 == 9 || var0 == 11 || var0 == 12) {
         var1 = 4;
      } else if (var0 == 8) {
         var1 = 5;
      }

      Class1 var2;
      if ((var2 = aa[var1]) == null) {
         Object var3 = null;
         String var10;
         if (var1 == 1) {
            var10 = "F>\\;\u001a瀾柁仯\u001a'@;\u001b!V%";
            var10 = (String)(var3 = "skin/火柴人/run.tcp");
         } else if (var1 == 2) {
            var10 = "\u0019L\u0003IE灌枞亝ET\u001eF\u0004CDS\tW";
            var10 = (String)(var3 = "skin/火柴人/stand.tcp");
         } else if (var1 == 3) {
            var10 = "F>\\;\u001a瀾柁仯\u001a=\\!\u001b!V%";
            var10 = (String)(var3 = "skin/火柴人/hit.tcp");
         } else if (var1 == 4) {
            var10 = "\u0019L\u0003IE灌枞亝EJ\u000b@\u0003DDS\tW";
            var10 = (String)(var3 = "skin/火柴人/magic.tcp");
         } else if (var1 == 5) {
            var10 = "F6\u001a\u0013\\2]!\\;R\u0006^<Y9\u001a捔绘狣怴z墦磄\u001b!V%";
            var10 = (String)(var3 = "sc/FightingSkill/持续状态/墓碑.tcp");
         } else {
            var10 = "T\t\b,N\rO\u001eN\u0004@9L\u0003K\u0006\b[\u0017X\u0012DS\tW";
            var10 = (String)(var3 = "sc/FightingSkill/1025.tcp");
         }

         var2 = f(var10, null);
         aa[var1] = var2;
      }

      return var2;
   }

   public static Class1 ag(long var0, int var2) {
      SoftReference var3;
      if ((var3 = t.get(var0)) != null && var3.get() != null) {
         return (Class1)var3.get();
      } else {
         ac((var2 != 0 && var2 != 1 && var2 != 2 && var2 != 10 ? Class2.h : Class2.d) + var0);
         return null;
      }
   }

   public static Class0 ah(Class0 var0, int var1, String var2) {
      try {
         long var3;
         long var5;
         if ((var5 = aj(var3 = Long.parseLong(var2))) != 0L) {
            var2 = String.valueOf(var5);
            var3 = var5;
         }

         Class5[] var7;
         if ((var7 = ab(var3)) != null) {
            if (!SystemData.isOld) {
               return var0.l(var1, var3, var7);
            }

            var2 = String.valueOf(d(var3));
            return var0.g(var1, var2);
         }
      } catch (Exception var8) {
      }

      return var0.g(var1, var2);
   }

   public static boolean ai(String var0) {
      int var1;
      for (int var10000 = var1 = 0; var10000 < 11; var10000 = ++var1) {
         if (var0.endsWith(i[var1])) {
            int var2;
            for (int var3 = var2 = 11; var3 < i.length; var3 = ++var2) {
               if (var0.indexOf(i[var2]) != -1) {
                  return false;
               }
            }

            return true;
         }
      }

      return false;
   }

   public static long aj(long var0) {
      long var2 = var0 & 2147483647L;
      if (var0 > 2147483647L) {
         if (var0 >> 40 > 0L) {
            return var0;
         } else {
            long var4 = var0 >> 32;
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
         return n(var0);
      }
   }

   public static void ak() {
      try {
         a = null;
         Iterator var1;
         Iterator var10000 = var1 = q.keySet().iterator();

         while (var10000.hasNext()) {
            String var0 = (String)var1.next();
            SoftReference var2;
            if ((var2 = q.get(var0)) != null && var2.get() != null && ((Class1)var2.get()).m() != 0) {
               ((Class1)var2.get()).aa(0);
               var10000 = var1;
            } else {
               var10000 = var1;
               var1.remove();
            }
         }

         Iterator var4;
         var10000 = var4 = t.keySet().iterator();

         while (var10000.hasNext()) {
            long var9 = (Long)var4.next();
            SoftReference var5;
            if ((var5 = t.get(var9)) != null && var5.get() != null && ((Class1)var5.get()).m() != 0) {
               ((Class1)var5.get()).aa(0);
               var10000 = var4;
            } else {
               var10000 = var4;
               var4.remove();
            }
         }

         Iterator var6;
         for (Iterator var12 = var6 = w.keySet().iterator(); var12.hasNext(); var12 = var6) {
            int var10 = (Integer)var6.next();
            Class4 var7;
            if ((var7 = w.get(var10)) == null || var7.a()) {
               var6.remove();
            }
         }
      } catch (Exception var8) {
         var8.printStackTrace();
      }
   }

   public static synchronized void al(Graphics2D var0, int var1, int var2, AffineTransform var3, BufferedImage var4) {
      if (p == null || p.getWidth() < var4.getWidth() || p.getHeight() < var4.getHeight()) {
         BufferedImage var10000 ;
         int var10002;
         BufferedImage var10003;
         if (var4.getWidth() < 120) {
            var10002 = 120;
            var10003 = var4;
         } else {
            var10002 = var4.getWidth();
            var10003 = var4;
         }

         var10000= new BufferedImage(var10002, var10003.getHeight() < 160 ? 160 : var4.getHeight(), 2);
         p = var10000;
      }

      if (a != var4) {
         Graphics2D var5 = p.createGraphics();
         var5.setBackground(Class49.bk);
         var5.clearRect(0, 0, p.getWidth(), p.getHeight());

         int var6;
         int var7;
         for (int var9 = var6 = var4.getHeight() - 1; var9 >= 0; var9 = --var6) {
            for (int var10 = var7 = var4.getWidth() - 1; var10 >= 0; var10 = --var7) {
               int var8;
               if ((var8 = var4.getRGB(var7, var6)) != 0) {
                  p.setRGB(var7, var6, w(var8));
               }
            }
         }

         var5.dispose();
         a = var4;
      }

      if (var3 != null) {
         var0.drawImage(p, var3, null);
      } else {
         var0.drawImage(p, var1, var2, null);
      }
   }
}
