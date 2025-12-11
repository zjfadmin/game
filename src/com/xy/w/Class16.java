package com.xy.w;

import com.google.gson.Gson;
import com.xy.q.Class49;
import com.xy.v.Class31;
import java.awt.AlphaComposite;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.Toolkit;
import java.awt.geom.Area;
import java.awt.geom.RoundRectangle2D.Double;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Class16 {
   private static List<String> a = new ArrayList<>();
   public static Image b = c("sc/c/44");
   public static Map<String, SoftReference<Image>> c = new HashMap<>();
   public static final byte[] d;
   public static Map<String, Class9> e = new HashMap<>();
   public static final int f = 16777215;
   public static Image g = c("sc/c/42");
   public static Image h = c("sc/c/43");
   public static Map<String, Class17> i = new HashMap<>();
   public static final int j = 123;
   public static Map<Integer, com.xy.n.Class2> k = new HashMap<>();
   public static Image l;

   public static byte[] a(byte[] var0) {
      if (var0.length < 16) {
         int var3;
         for (int var5 = var3 = 0; var5 < var0.length; var5 = var3) {
            byte var11 = var0[var3];
            int var7 = var3;
            var11 = (byte)(var11 ^ d[var3 % d.length]);
            var3++;
            var0[var7] = var11;
         }

         return var0;
      } else {
         int var1;
         for (int var10000 = var1 = 0; var10000 < 8; var10000 = var1) {
            byte var10002 = var0[var1];
            int var10001 = var1;
            var10002 = (byte)(var10002 ^ d[var1 % d.length]);
            var1++;
            var0[var10001] = var10002;
         }

         for (int var4 = var1 = var0.length - 8; var4 < var0.length; var4 = var1) {
            byte var9 = var0[var1];
            int var6 = var1;
            var9 = (byte)(var9 ^ d[var1 % d.length]);
            var1++;
            var0[var6] = var9;
         }

         return var0;
      }
   }

   public static Class17 b(String var0) {
      if (a.contains(var0)) {
         return null;
      } else {
         Class17 var1;
         if ((var1 = i.get(var0)) != null) {
            var1.e(4);
            return var1;
         } else {
            String var10002 = "\u0002F^M\u0014D\u0015\n?";
            byte[] var2;
            Image var3 = (var2 = g("sc/head/N" + var0 + ".png")) != null ? Toolkit.getDefaultToolkit().createImage(var2) : null;
            if (var3 == null) {
               a.add(var0);
               return null;
            } else {
               new Class17(4, var3);
               i.put(var0, var1 = new Class17(4, var3));

               try {
                  int var4 = 0;

                  for (Class17 var10000 = var1; var10000.c().getHeight(null) == -1; var10000 = var1) {
                     if (var4 >= 10) {
                        return var1;
                     }

                     var4++;
                     Thread.sleep(5L);
                  }
               } catch (Exception var5) {
                  var5.printStackTrace();
               }

               return var1;
            }
         }
      }
   }

   public static Image c(String var0) {
      if (var0 == null) {
         return null;
      } else {
         SoftReference var1;
         return (var1 = c.get(var0)) != null && var1.get() != null ? (Image)var1.get() : e(var0);
      }
   }

   public static com.xy.n.Class2 d(int var0) throws Exception {
      synchronized (k) {
         com.xy.n.Class2 var2;
         if ((var2 = k.get(var0)) == null) {
            com.xy.n.Class2 var4;
            if (var0 > 0) {
               String var10002 = "\u0002F^H\u0010U^";
               StringBuilder var10000 = new StringBuilder("sc/map/").append(var0);
               String var10001 = "3S|N";
               var4 = var2 = com.xy.n.Class2.f(var10000.append(".map").toString());
            } else {
               String var7 = "\u0002F^H\u0010U^";
               StringBuilder var5 = new StringBuilder("sc/map/").append(-var0);
               String var6 = "\u007f3S|N";
               var4 = var2 = com.xy.n.Class2.f(var5.append("A.map").toString());
            }

            var4.l = var0;
            k.put(var0, var2);
         }

         var2.n++;
         return var2;
      }
   }

   static {
      Gson var10000 = Class31.a();
      String var10001 = "e0\r(\u00120\t-\u00120\u000f-\u000b1\u000f,\b1\u0006,\u0012)\b1\u000f,\u00120\f)\u00120\u000b$\u00120\u0007)\u0012,\f*\u0012$\f1\u000b*\u0012/\f1\u0013,\r1\u0013)\u00061\u0013%\r1\u0013,\u000f%\u0012,\u000e.\u0012+\u00061\r.\u00120\f1\u0013.\t1\u0013*\f1\u0013,\u000e*\u0012,\u000f)\u0012*\u00071\n)\u0012$\u00120\f+\u00120\b,\u00120\u0007+\u0012,\f(\u0012$\u000e1\u000b(\u0012/\u000e1\u0013,\u000b1\u0013(\u000e1\u0013%\u000b1\u0013,\f-\u0012,\u000e,\u0012+\b1\r,\u00120\n1\u0013.\u00071\u0013*\n1\u0013,\u000e$\u0012,\u000f/\u0012*\t1\n/\u0012*\u00120\f%\u00120\b.\u00120\u0007%\u0012,\f.\u0012%\u00061\u000b.\u0012,\u00061\u0013,\t1\u0013(\f1\u0013%\t1\u0013,\f/\u0012$\u00071\b)\u0012/\u00071\u0013+\u00120\n,\u00120\t+\u00120\u000f,\u000f1\u000f,\u000e1\t(\u0012)\u000e1\u000b1\u0013.\u000e1\u0013+\u000b1\u0013,\u000e-\u0012,\f,\u0012%\b1\u000b,\u0012,\b1\u0013,\u00071\u0013(\n1\u0013%\u00071\u0013,\f)\u0012$\t1\b/\u0012/\t1\u0013%\u00120\n.\u00120\t%\u00120\u000f,\r1\u000f-\u00061\t.\u0012.\u00061\r1\u0013.\f1\u0013+\t1\u0013,\u000e/\u0012,\u000f$\u0012%\n1\n$\u0012,\n1\u0013/\u000f1\u0013(\b1\u0013$\u000f1\u0013,\f+\u0012$\u000b1\b-\u0012/\u000b1\u0013,\u000e1\u0013)\u000b1\u0013%\u000e1\u0013,\u000f(\u0012,\u000e+\u0012*\u000f1\r+\u0012,\u00120\r)\u00120\b$\u00120\u000f-\n1\u000f,\t1\u0006/\u0012)\t1\u000f/\u00120\f.\u00120\u000b%\u00120\u0007.\u00120\u000f/\u00061\u0007.\u0012(\u00061\f.\u00120\u000f/\u00120\n*\u00120\u0006/\u00120\u000f,\t1\u000f-\n1\b$\u0012.\n1\u0013,\u00120\r+\u00120\t,\u00120\u000f-\b1\u000f,\u000b1\u0006-\u0012)\u000b1\u000f-\u00120\f(\u00120\b-\u00120\u0007(\u0012,\f+\u0012$\u000f1\u000b+\u0012/\u000f1\u0013,\n1\u0013)\u00071\u0013%\n1\u0013,\u000f$\u0012,\u000e/\u0012+\t1\r/\u00120\r1\u0013.\u00061\u0013*\r1\u0013,\u000e%\u0012,\u000f.\u0012*\u00061\n.\u0012%\u00120\f*\u00120\b/\u00120\u0007*\u0012,\f)\u0012%\u00071\u000b)\u0012,\u00071\u0013,\b1\u0013(\u000f1\u0013%\b1\u0013,\f,\u0012,\u000e-\u0012+\u000b1\r-\u00120\u000b1\u0013)\u000e1\u0013*\u000b1\u0013,\u000f-\u0012,\u000f,\u0012*\b1\n,\u0012+\u00120\f$\u00120\b)\u00120\u0007$\u0012,\f/\u0012%\t1\u000b/\u0012,\t1\u0013,\u00061\u0013(\r1\u0013%\u00061\u0013,\f.\u0012$\u00061\b.\u0012/\u00061\u0013*\u00120\n/\u00120\t*\u00120\u000f,\f1\u000f-\u00071\t)\u0012.\u00071\n1\u0013.\u000f1\u0013+\b1\u0013,\u000e,\u0012,\f-\u0012%\u000b1\u000b-\u0012,\u000b1\u0013/\u000e1\u0013(\u000b1\u0013$\u000e1\u0013,\f(\u0012$\b1\b,\u0012/\b1\u0013$\u00120\n)\u00120\t$\u00120\u000f,\n1\u000f-\t1\t/\u0012.\t1\f1\u0013.\r1\u0013+\u00061\u0013,\u000e.\u0012,\u000f%\u0012%\r1\n%\u0012,\r1\u0013/\f1\u0013(\t1\u0013$\f1\u0013,\f*\u0012$\n1\u000b$\u0012/\n1\u0013,\u000f1\u0013)\b1\u0013%\u000f1\u0013,\u000f+\u0012,\u000e(\u0012*\u000e1\r(\u0012-\u00120\r(\u00120\t-\u00120\u000f-\u000b1\u000f,\b1\u0006,\u0012)\b1\u000f,\u00120\f)\u00120\u000b$\u00120\u0007)\u0012,\f*\u0012$\f1\u000b*\u0012/\f1\u0013,\r1\u0013)\u00061\u0013%\r1\u0013,\u000f%\u0012,\u000e.\u0012+\u00061\r.\u00120\f1\u0013.\t1\u0013*\f1\u0013,\u000e*\u0012,\u000f)\u0012*\u00071\n)\u0012$\u00120\f+\u00120\b,\u00120\u0007+\u0012,\f(\u0012$\u000e1\u000b(\u0012/\u000e1\u0013,\u000b1\u0013(\u000e1\u0013%\u000b1\u0013,\f-\u0012,\u000e,\u0012+\b1\r,\u00120\n1\u0013.\u00071\u0013*\n1\u0013,\u000e$\u0012,\u000f/\u0012*\t1\n/\u0012*\u00120\f%\u00120\b.\u00120\u0007%\u0012,\f.\u0012%\u00061\u000b.\u0012,\u00061\u0013,\t1\u0013(\f1\u0013%\t1\u0013,\f/\u0012$\u00071\b)\u0012/\u00071\u0013+\u00120\n,\u00120\t+\u00120\u000f,\u000f1\u000f,\u000e1\t(\u0012)\u000e1\u000b1\u0013.\u000e1\u0013+\u000b1\u0013,\u000e-\u0012,\f,\u0012%\b1\u000b,\u0012,\b1\u0013,\u00071\u0013(\n1\u0013%\u00071\u0013,\f)\u0012$\t1\b/\u0012/\t1\u0013%\u00120\n.\u00120\t%\u00120\u000f,\r1\u000f-\u00061\t.\u0012.\u00061\r1\u0013.\f1\u0013+\t1\u0013,\u000e/\u0012,\u000f$\u0012%\n1\n$\u0012,\n1\u0013/\u000f1\u0013(\b1\u0013$\u000f1\u0013,\f+\u0012$\u000b1\b-\u0012/\u000b1\u0013,\u000e1\u0013)\u000b1\u0013%\u000e1\u0013,\u000f(\u0012,\u000e+\u0012*\u000f1\r+\u0012,\u00120\r)\u00120\b$\u00120\u000f-\n1\u000f,\t1\u0006/\u0012)\t1\u000f/\u00120\f.\u00120\u000b%\u00120\u0007.\u00120\u000f/\u00061\u0007.\u0012(\u00061\f.\u00120\u000f/\u00120\n*\u00120\u0006/\u00120\u000f,\t1\u000f-\n1\b$\u0012.\n1\u0013,\u00120\r+\u00120\t,\u00120\u000f-\b1\u000f,\u000b1\u0006-\u0012)\u000b1\u000f-\u00120\f(\u00120\b-\u00120\u0007(\u0012,\f+\u0012$\u000f1\u000b+\u0012/\u000f1\u0013,\n1\u0013)\u00071\u0013%\n1\u0013,\u000f$\u0012,\u000e/\u0012+\t1\r/\u00120\r1\u0013.\u00061\u0013*\r1\u0013,\u000e%\u0012,\u000f.\u0012*\u00061\n.\u0012%\u00120\f*\u00120\b/\u00120\u0007*\u0012,\f)\u0012%\u00071\u000b)\u0012,\u00071\u0013,\b1\u0013(\u000f1\u0013%\b1\u0013,\f,\u0012,\u000e-\u0012+\u000b1\r-\u00120\u000b1\u0013)\u000e1\u0013*\u000b1\u0013,\u000f-\u0012,\u000f,\u0012*\b1\n,\u0012+\u00120\f$\u00120\b)\u00120\u0007$\u0012,\f/\u0012%\t1\u000b/\u0012,\t1\u0013,\u00061\u0013(\r1\u0013%\u00061\u0013,\f.\u0012$\u00061\b.\u0012/\u00061\u0013*\u00120\n/\u00120\t*\u00120\u000f,\f1\u000f-\u00071\t)\u0012.\u00071\n1\u0013.\u000f1\u0013+\b1\u0013,\u000e,\u0012,\f-\u0012%\u000b1\u000b-\u0012,\u000b1\u0013/\u000e1\u0013(\u000b1\u0013$\u000e1\u0013,\f(\u0012$\b1\b,\u0012/\b1\u0013$\u00120\n)\u00120\t$\u00120\u000f,\n1\u000f-\t1\t/\u0012.\t1\f1\u0013.\r1\u0013+\u00061\u0013,\u000e.\u0012,\u000f%\u0012%\r1\n%\u0012,\r1\u0013/\f1\u0013(\t1\u0013$\f1\u0013,\f*\u0012$\n1\u000b$\u0012/\n1\u0013,\u000f1\u0013)\b1\u0013%\u000f1\u0013,\u000f+\u0012,\u000e(\u0012*\u000e1\r(\u0012-c";
      d = var10000.fromJson(
         "[-35,-70,-105,116,81,46,11,-24,-59,-94,127,92,57,22,-13,-48,-83,-118,103,68,33,-2,-37,-72,-107,114,79,44,9,-26,-61,-96,125,90,55,20,-15,-50,-85,-120,101,66,31,-4,-39,-74,-109,112,77,42,7,-28,-63,-98,123,88,53,18,-17,-52,-87,-122,99,64,29,-6,-41,-76,-111,110,75,40,5,-30,-65,-100,121,86,51,16,-19,-54,-89,-124,97,62,27,-8,-43,-78,-113,108,73,38,3,-32,-67,-102,119,84,49,14,-21,-56,-91,-126,95,60,25,-10,-45,-80,-115,106,71,36,1,-34,-69,-104,117,82,47,12,-23,-58,-93,-128,93,58,23,-12,-47,-82,-117,104,69,34,-1,-36,-71,-106,115,80,45,10,-25,-60,-95,126,91,56,21,-14,-49,-84,-119,102,67,32,-3,-38,-73,-108,113,78,43,8,-27,-62,-97,124,89,54,19,-16,-51,-86,-121,100,65,30,-5,-40,-75,-110,111,76,41,6,-29,-64,-99,122,87,52,17,-18,-53,-88,-123,98,63,28,-7,-42,-77,-112,109,74,39,4,-31,-66,-101,120,85,50,15,-20,-55,-90,-125,96,61,26,-9,-44,-79,-114,107,72,37,2,-33,-68,-103,118,83,48,13,-22,-57,-92,-127,94,59,24,-11,-46,-81,-116,105,70,35,0,-35,-70,-105,116,81,46,11,-24,-59,-94,127,92,57,22,-13,-48,-83,-118,103,68,33,-2,-37,-72,-107,114,79,44,9,-26,-61,-96,125,90,55,20,-15,-50,-85,-120,101,66,31,-4,-39,-74,-109,112,77,42,7,-28,-63,-98,123,88,53,18,-17,-52,-87,-122,99,64,29,-6,-41,-76,-111,110,75,40,5,-30,-65,-100,121,86,51,16,-19,-54,-89,-124,97,62,27,-8,-43,-78,-113,108,73,38,3,-32,-67,-102,119,84,49,14,-21,-56,-91,-126,95,60,25,-10,-45,-80,-115,106,71,36,1,-34,-69,-104,117,82,47,12,-23,-58,-93,-128,93,58,23,-12,-47,-82,-117,104,69,34,-1,-36,-71,-106,115,80,45,10,-25,-60,-95,126,91,56,21,-14,-49,-84,-119,102,67,32,-3,-38,-73,-108,113,78,43,8,-27,-62,-97,124,89,54,19,-16,-51,-86,-121,100,65,30,-5,-40,-75,-110,111,76,41,6,-29,-64,-99,122,87,52,17,-18,-53,-88,-123,98,63,28,-7,-42,-77,-112,109,74,39,4,-31,-66,-101,120,85,50,15,-20,-55,-90,-125,96,61,26,-9,-44,-79,-114,107,72,37,2,-33,-68,-103,118,83,48,13,-22,-57,-92,-127,94,59,24,-11,-46,-81,-116,105,70,35,0]",
         byte[].class
      );
      String var0 = "\u0002F^F^\u0011C";
      String var1 = "M~\u0011~\u0011)\r";
      String var2 = "\u0002F^F^\u0011E";
   }

   // $VF: synthetic method
   private static synchronized Image e(String var0) {
      SoftReference var1;
      if ((var1 = c.get(var0)) != null && var1.get() != null) {
         return (Image)var1.get();
      } else {
         byte[] var2;
         Image var3 = (var2 = g(var0)) != null ? Toolkit.getDefaultToolkit().createImage(var2) : null;
         if (var3 == null) {
            var3 = i();
            c.put(var0, var1);
            return var3;
         } else {
            var3.getWidth(null);
            c.put(var0, new SoftReference<>(var3));
            return var3;
         }
      }
   }

   public static void f(Graphics var0, Image var1, int var2, int var3, int var4, int var5) {
      if (var1 != null && var1.getWidth(null) != -1) {
         int var6 = var1.getWidth(null);
         int var7 = var1.getHeight(null);
         var6 = (int)(var6 * 0.8);
         var7 = (int)(var7 * 0.8);
         var0.drawImage(var1, var2 + (var4 - var6) / 2, var3 + (var5 - var7) / 2, var6, var7, null);
      }
   }

   public static byte[] g(String var0) {
      File var1;
      if (!(var1 = new File(var0)).exists()) {
         return null;
      } else {
         byte[] var2 = null;
         FileInputStream var3 = null;

         FileInputStream var21;
         label96: {
            try {
               label94: {
                  try {
                     var21 = var3 = new FileInputStream(var1);
                     var2 = new byte[var21.available()];
                     int var4 = 0;
                     int var5 = 0;

                     while (var21.available() > 0) {
                        var21 = var3;
                        var4 = var3.read(var2, var5, var3.available());
                        var5 += var4;
                     }
                  } catch (Exception var16) {
                     var2 = null;
                     break label94;
                  }

                  var21 = var3;
                  break label96;
               }
            } catch (Throwable var17) {
               try {
                  if (var3 != null) {
                     var3.close();
                     throw var17;
                  }
               } catch (Exception var15) {
               }

               throw var17;
            }

            try {
               if (var3 != null) {
                  var3.close();
                  return var2;
               }

               return var2;
            } catch (Exception var14) {
               return var2;
            }
         }

         try {
            if (var21 != null) {
               var3.close();
               return var2;
            }
         } catch (Exception var13) {
         }

         return var2;
      }
   }

   public static Class17 h(String var0) {
      String var10002 = "mP\u007fM\u001e";
      String var1 = "SMAP " + var0;
      if (a.contains(var1)) {
         return null;
      } else {
         Class17 var2;
         if ((var2 = i.get(var1)) != null) {
            var2.e(4);
            return var2;
         } else {
            var10002 = "\u0002F^V\u001cD\u0001\n\u0002";
            byte[] var3;
            Image var4 = (var3 = g("sc/smap/s" + var0 + ".png")) != null ? Toolkit.getDefaultToolkit().createImage(var3) : null;
            if (var4 == null) {
               a.add(var1);
               return null;
            } else {
               new Class17(4, var4);
               i.put(var1, var2 = new Class17(4, var4));

               try {
                  int var5 = 0;

                  for (Class17 var10000 = var2; var10000.c().getHeight(null) == -1; var10000 = var2) {
                     if (var5 >= 10) {
                        return var2;
                     }

                     var5++;
                     Thread.sleep(5L);
                  }
               } catch (Exception var6) {
                  var6.printStackTrace();
               }

               return var2;
            }
         }
      }
   }

   public static synchronized Image i() {
      if (l == null) {
         String var10000 = "n]2\\2就圭囀线炇-\u000e-\u000e3NsY";
         l = e("sc/b/小地图红点0000.png");
      }

      return l;
   }

   public static void j(Graphics var0, Image var1, int var2, int var3, int var4, int var5) {
      if (var1 != null && var1.getWidth(null) != -1) {
         int var6 = var1.getWidth(null);
         int var7 = var1.getHeight(null);
         if (var6 <= 40 && var7 <= 40) {
            var0.drawImage(var1, var2 + (var4 - var6) / 2, var3 + (var5 - var7) / 2, var6, var7, null);
         } else {
            var0.drawImage(
               var1,
               var2 + (120 - var6) * var4 / 240,
               var3 + (120 - var7) * var5 / 240,
               Math.round(var6 * var4 / 120.0F),
               Math.round(var7 * var5 / 120.0F),
               null
            );
         }
      }
   }

   public static void k() {
      Iterator var1;
      for (Iterator var10000 = var1 = i.keySet().iterator(); var10000.hasNext(); var10000 = var1) {
         String var0 = (String)var1.next();
         if (i.get(var0).a()) {
            var1.remove();
         }
      }
   }

   public static void l() {
      synchronized (k) {
         long var1 = System.currentTimeMillis();
         int var3 = 0;

         Iterator var4;
         for (Iterator var10000 = var4 = k.keySet().iterator(); var10000.hasNext(); var10000 = var4) {
            var3 = (Integer)var4.next();
            com.xy.n.Class2 var5;
            if ((var5 = k.get(var3)).n <= 0 && var1 - var5.m > com.xy.v.Class0.d) {
               var5.m();
               var4.remove();
            }
         }
      }
   }

   public static Class9 m(String var0, int var1, int var2, int var3, int var4, boolean var5) {
      Class9 var6;
      if ((var6 = e.get(var0)) == null) {
         var6 = new Class9(c(var0), var1, var2, var3, var4);
         e.put(var0, var6);
         Map var10001 = e;
         StringBuilder var10002 = new StringBuilder(String.valueOf(var0));
         String var10003 = "Q";
         var10002 = var10002.append(" ").append(var1);
         var10003 = "\u001e";
         var10002 = var10002.append(" ").append(var3);
         var10003 = "Q";
         var10002 = var10002.append(" ").append(var2);
         var10003 = "\u001e";
         var10001.put(var10002.append(" ").append(var4).toString(), var6);
         if (var5) {
            return var6;
         }
      }

      if (var5) {
         return new Class9(var6).c(var1, var2, var3, var4);
      } else if (var6.a() == var1 && var6.i() == var2 && var6.d() == var3 && var6.e() == var4) {
         return var6;
      } else {
         StringBuilder var10000 = new StringBuilder(String.valueOf(var0));
         String var12 = "Q";
         var10000 = var10000.append(" ").append(var1);
         var12 = "\u001e";
         var10000 = var10000.append(" ").append(var3);
         var12 = "Q";
         var10000 = var10000.append(" ").append(var2);
         var12 = "\u001e";
         String var7 = var10000.append(" ").append(var4).toString();
         Class9 var8;
         if ((var8 = e.get(var7)) == null) {
            var8 = new Class9(var6).c(var1, var2, var3, var4);
            e.put(var7, var8);
         }

         return var8;
      }
   }

   public static Image n(String var0) {
      String var10002 = "P\u007fM\u001e";
      String var1 = "MAP " + var0;
      if (a.contains(var1)) {
         return i();
      } else {
         Class17 var2;
         if ((var2 = i.get(var1)) != null) {
            var2.e(4);
            return var2.c();
         } else {
            var10002 = "\u0002F^H\u0010U^";
            StringBuilder var10000 = new StringBuilder("sc/map/").append(var0);
            String var10001 = "3TmY";
            byte[] var3;
            Image var4 = (var3 = g(var10000.append(".jpg").toString())) != null ? Toolkit.getDefaultToolkit().createImage(var3) : null;
            if (var4 == null) {
               a.add(var1);
               return i();
            } else {
               new Class17(4, var4);
               i.put(var1, var2 = new Class17(4, var4));
               return var2.c();
            }
         }
      }
   }

   public static void o(com.xy.n.Class2 var0) {
      synchronized (k) {
         if (var0 != null) {
            var0.n--;
            var0.m = System.currentTimeMillis();
         }
      }
   }

   public static void p(Image var0, BufferedImage var1) {
      Graphics2D var2 = var1.createGraphics();
      var2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
      var2.setBackground(Class49.bk);
      var2.clearRect(0, 0, var1.getWidth(), var1.getHeight());
      var2.drawImage(var0, 0, 0, var1.getWidth(), var1.getHeight(), null);
      Double var3 = new Double(0.0, 0.0, var1.getWidth(), var1.getHeight(), var1.getWidth(), var1.getHeight());
      Area var4 = new Area(new Rectangle(0, 0, var1.getWidth(), var1.getHeight()));
      var4.subtract(new Area(var3));
      var2.setComposite(AlphaComposite.Clear);
      var2.fill(var4);
      var2.dispose();
   }

   public static Point q(int var0) {
      try {
         synchronized (k) {
            com.xy.n.Class2 var2;
            if ((var2 = k.get(var0)) != null) {
               return new Point(var2.i, var2.o);
            } else {
               String var10002 = "\u0002F^H\u0010U^";
               StringBuilder var10000 = new StringBuilder("sc/map/").append(var0);
               String var10001 = "3S|N";
               return com.xy.n.Class2.l(var10000.append(".map").toString());
            }
         }
      } catch (Exception var4) {
         var4.printStackTrace();
         return new Point(800, 600);
      }
   }
}
