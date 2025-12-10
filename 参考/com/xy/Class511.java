package com.xy;

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
import java.awt.image.ImageObserver;
import java.io.File;
import java.io.FileInputStream;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Class511 {
   private static List<String> a = new ArrayList();
   public static Map<String, SoftReference<Image>> b = new HashMap();
   public static final int c = 123;
   public static Image d = a("sc/c/43");
   public static Image e;
   public static final byte[] f = (byte[])Class695.b().fromJson("[-35,-70,-105,116,81,46,11,-24,-59,-94,127,92,57,22,-13,-48,-83,-118,103,68,33,-2,-37,-72,-107,114,79,44,9,-26,-61,-96,125,90,55,20,-15,-50,-85,-120,101,66,31,-4,-39,-74,-109,112,77,42,7,-28,-63,-98,123,88,53,18,-17,-52,-87,-122,99,64,29,-6,-41,-76,-111,110,75,40,5,-30,-65,-100,121,86,51,16,-19,-54,-89,-124,97,62,27,-8,-43,-78,-113,108,73,38,3,-32,-67,-102,119,84,49,14,-21,-56,-91,-126,95,60,25,-10,-45,-80,-115,106,71,36,1,-34,-69,-104,117,82,47,12,-23,-58,-93,-128,93,58,23,-12,-47,-82,-117,104,69,34,-1,-36,-71,-106,115,80,45,10,-25,-60,-95,126,91,56,21,-14,-49,-84,-119,102,67,32,-3,-38,-73,-108,113,78,43,8,-27,-62,-97,124,89,54,19,-16,-51,-86,-121,100,65,30,-5,-40,-75,-110,111,76,41,6,-29,-64,-99,122,87,52,17,-18,-53,-88,-123,98,63,28,-7,-42,-77,-112,109,74,39,4,-31,-66,-101,120,85,50,15,-20,-55,-90,-125,96,61,26,-9,-44,-79,-114,107,72,37,2,-33,-68,-103,118,83,48,13,-22,-57,-92,-127,94,59,24,-11,-46,-81,-116,105,70,35,0,-35,-70,-105,116,81,46,11,-24,-59,-94,127,92,57,22,-13,-48,-83,-118,103,68,33,-2,-37,-72,-107,114,79,44,9,-26,-61,-96,125,90,55,20,-15,-50,-85,-120,101,66,31,-4,-39,-74,-109,112,77,42,7,-28,-63,-98,123,88,53,18,-17,-52,-87,-122,99,64,29,-6,-41,-76,-111,110,75,40,5,-30,-65,-100,121,86,51,16,-19,-54,-89,-124,97,62,27,-8,-43,-78,-113,108,73,38,3,-32,-67,-102,119,84,49,14,-21,-56,-91,-126,95,60,25,-10,-45,-80,-115,106,71,36,1,-34,-69,-104,117,82,47,12,-23,-58,-93,-128,93,58,23,-12,-47,-82,-117,104,69,34,-1,-36,-71,-106,115,80,45,10,-25,-60,-95,126,91,56,21,-14,-49,-84,-119,102,67,32,-3,-38,-73,-108,113,78,43,8,-27,-62,-97,124,89,54,19,-16,-51,-86,-121,100,65,30,-5,-40,-75,-110,111,76,41,6,-29,-64,-99,122,87,52,17,-18,-53,-88,-123,98,63,28,-7,-42,-77,-112,109,74,39,4,-31,-66,-101,120,85,50,15,-20,-55,-90,-125,96,61,26,-9,-44,-79,-114,107,72,37,2,-33,-68,-103,118,83,48,13,-22,-57,-92,-127,94,59,24,-11,-46,-81,-116,105,70,35,0]", byte[].class);
   public static final int g = 16777215;
   public static Map<String, Class604> h = new HashMap();
   public static Image i = a("sc/c/42");
   public static Image j = a("sc/c/44");
   public static Map<String, Class610> k = new HashMap();
   public static Map<Integer, Class409> l = new HashMap();

   public static Image a(String var0) {
      if (var0 == null) {
         return null;
      } else {
         SoftReference var1;
         return (var1 = (SoftReference)b.get(var0)) != null && var1.get() != null ? (Image)var1.get() : l(var0);
      }
   }

   public static void b() {
      synchronized(l) {
         long var1 = System.currentTimeMillis();
         int var3 = 2 & 5;

         Iterator var4;
         for(Iterator var10000 = var4 = l.keySet().iterator(); var10000.hasNext(); var10000 = var4) {
            var3 = (Integer)var4.next();
            Class409 var5;
            if ((var5 = (Class409)l.get(var3)).d <= 0 && var1 - var5.i > Class27.e) {
               var5.p();
               var4.remove();
            }
         }

      }
   }

   public static Class610 c(String var0) {
      if (a.contains(var0)) {
         return null;
      } else {
         Class610 var1;
         if ((var1 = (Class610)k.get(var0)) != null) {
            var1.b(--4);
            return var1;
         } else {
            byte[] var2;
            Image var3 = (var2 = h("sc/head/N" + var0 + ".png")) != null ? Toolkit.getDefaultToolkit().createImage(var2) : null;
            if (var3 == null) {
               a.add(var0);
               return null;
            } else {
               new Class610(--4, var3);
               k.put(var0, var1 = new Class610(--4, var3));

               try {
                  int var5 = 0;

                  for(Class610 var10000 = var1; var10000.e().getHeight((ImageObserver)null) == -4 >> 2; var10000 = var1) {
                     if (var5 >= (47 & 90)) {
                        return var1;
                     }

                     ++var5;
                     Thread.sleep(5L);
                  }
               } catch (Exception var4) {
                  var4.printStackTrace();
               }

               return var1;
            }
         }
      }
   }

   public static void d(Graphics var0, Image var1, int var2, int var3, int var4, int var5) {
      if (var1 != null && var1.getWidth((ImageObserver)null) != -4 >> 2) {
         int var6 = var1.getWidth((ImageObserver)null);
         int var7 = var1.getHeight((ImageObserver)null);
         if (var6 <= (61 & 106) && var7 <= (122 & 45)) {
            var0.drawImage(var1, var2 + (var4 - var6) / --2, var3 + (var5 - var7) / (1 ^ 3), var6, var7, (ImageObserver)null);
         } else {
            var0.drawImage(var1, var2 + ((123 & 124) - var6) * var4 / (14326 & 18681), var3 + ((121 & 126) - var7) * var5 / (20214 & 12793), Math.round((float)(var6 * var4) / 120.0F), Math.round((float)(var7 * var5) / 120.0F), (ImageObserver)null);
         }
      }
   }

   public static void e() {
      Iterator var1;
      for(Iterator var10000 = var1 = k.keySet().iterator(); var10000.hasNext(); var10000 = var1) {
         String var0 = (String)var1.next();
         if (((Class610)k.get(var0)).a()) {
            var1.remove();
         }
      }

   }

   public static void f(Image var0, BufferedImage var1) {
      Graphics2D var2 = var1.createGraphics();
      int var10002 = 3 & 4;
      int var10004 = 5 >> 3;
      var2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
      var2.setBackground(Class681.cu);
      var2.clearRect(var10004, 3 & 4, var1.getWidth(), var1.getHeight());
      var2.drawImage(var0, var10002, 3 & 4, var1.getWidth(), var1.getHeight(), (ImageObserver)null);
      Double var3 = new Double(0.0D, 0.0D, (double)var1.getWidth(), (double)var1.getHeight(), (double)var1.getWidth(), (double)var1.getHeight());
      Area var4 = new Area(new Rectangle(3 & 4, 3 & 4, var1.getWidth(), var1.getHeight()));
      var4.subtract(new Area(var3));
      var2.setComposite(AlphaComposite.Clear);
      var2.fill(var4);
      var2.dispose();
   }

   public static Point g(int var0) {
      try {
         synchronized(l) {
            Class409 var2;
            return (var2 = (Class409)l.get(var0)) != null ? new Point(var2.b, var2.j) : Class409.d("sc/map/" + var0 + ".map");
         }
      } catch (Exception var4) {
         var4.printStackTrace();
         return new Point(14134 & 19433, 20479 & 12888);
      }
   }

   public static byte[] h(String var0) {
      File var1;
      if (!(var1 = new File(var0)).exists()) {
         return null;
      } else {
         Object var2 = null;
         FileInputStream var3 = null;

         byte[] var17;
         FileInputStream var18;
         label114: {
            try {
               label112: {
                  try {
                     var18 = var3 = new FileInputStream(var1);
                     byte[] var10001 = new byte[var18.available()];
                     boolean var10003 = true;
                     var17 = var10001;
                     int var16 = 3 ^ 3;

                     for(int var4 = 2 & 5; var18.available() > 0; var4 += var16) {
                        var18 = var3;
                        var16 = var3.read(var17, var4, var3.available());
                     }
                  } catch (Exception var14) {
                     var17 = null;
                     break label112;
                  }

                  var18 = var3;
                  break label114;
               }
            } catch (Throwable var15) {
               Throwable var10000;
               label131: {
                  try {
                     if (var3 != null) {
                        var3.close();
                        break label131;
                     }
                  } catch (Exception var13) {
                  }

                  var10000 = var15;
                  throw var10000;
               }

               var10000 = var15;
               throw var10000;
            }

            try {
               if (var3 != null) {
                  var3.close();
                  return var17;
               }

               return var17;
            } catch (Exception var12) {
               return var17;
            }
         }

         try {
            if (var18 != null) {
               var3.close();
               return var17;
            }
         } catch (Exception var11) {
         }

         return var17;
      }
   }

   public static Image i(String var0) {
      String var1 = "MAP " + var0;
      if (a.contains(var1)) {
         return p();
      } else {
         Class610 var2;
         if ((var2 = (Class610)k.get(var1)) != null) {
            var2.b(--4);
            return var2.e();
         } else {
            byte[] var4;
            Image var3 = (var4 = h("sc/map/" + var0 + ".jpg")) != null ? Toolkit.getDefaultToolkit().createImage(var4) : null;
            if (var3 == null) {
               a.add(var1);
               return p();
            } else {
               new Class610(--4, var3);
               k.put(var1, var2 = new Class610(--4, var3));
               return var2.e();
            }
         }
      }
   }

   public static void j(Class409 var0) {
      synchronized(l) {
         if (var0 != null) {
            var0.d -= --1;
            var0.i = System.currentTimeMillis();
         }
      }
   }

   public static void k(Graphics var0, Image var1, int var2, int var3, int var4, int var5) {
      if (var1 != null && var1.getWidth((ImageObserver)null) != -4 >> 2) {
         int var6 = var1.getWidth((ImageObserver)null);
         int var7 = var1.getHeight((ImageObserver)null);
         var6 = (int)((double)var6 * 0.8D);
         var7 = (int)((double)var7 * 0.8D);
         var0.drawImage(var1, var2 + (var4 - var6) / (1 ^ 3), var3 + (var5 - var7) / (1 ^ 3), var6, var7, (ImageObserver)null);
      }
   }


   private static synchronized Image l(String var0) {
      SoftReference var1;
      if ((var1 = (SoftReference)b.get(var0)) != null && var1.get() != null) {
         return (Image)var1.get();
      } else {
         byte[] var2;
         Image var3 = (var2 = h(var0)) != null ? Toolkit.getDefaultToolkit().createImage(var2) : null;
         if (var3 == null) {
            var3 = p();
            b.put(var0, var1);
            return var3;
         } else {
            var3.getWidth((ImageObserver)null);
            b.put(var0, new SoftReference(var3));
            return var3;
         }
      }
   }

   public static Class610 m(String var0) {
      String var1 = "SMAP " + var0;
      if (a.contains(var1)) {
         return null;
      } else {
         Class610 var2;
         if ((var2 = (Class610)k.get(var1)) != null) {
            var2.b(--4);
            return var2;
         } else {
            byte[] var4;
            Image var3 = (var4 = h("sc/smap/s" + var0 + ".png")) != null ? Toolkit.getDefaultToolkit().createImage(var4) : null;
            if (var3 == null) {
               a.add(var1);
               return null;
            } else {
               new Class610(--4, var3);
               k.put(var1, var2 = new Class610(--4, var3));

               try {
                  int var6 = 0;

                  for(Class610 var10000 = var2; var10000.e().getHeight((ImageObserver)null) == -4 >> 2; var10000 = var2) {
                     if (var6 >= (11 & 126)) {
                        return var2;
                     }

                     ++var6;
                     Thread.sleep(5L);
                  }
               } catch (Exception var5) {
                  var5.printStackTrace();
               }

               return var2;
            }
         }
      }
   }

   public static byte[] n(byte[] var0) {
      int var10000;
      int var1;
      int var10001;
      byte var10002;
      if (var0.length < (86 & 57)) {
         for(var10000 = var1 = 3 & 4; var10000 < var0.length; var10000 = var1) {
            var10002 = var0[var1];
            var10001 = var1;
            var10002 ^= f[var1 % f.length];
            ++var1;
            var0[var10001] = var10002;
         }

         return var0;
      } else {
         for(var10000 = var1 = 0; var10000 < 8; var10000 = var1) {
            var10002 = var0[var1];
            var10001 = var1;
            var10002 ^= f[var1 % f.length];
            ++var1;
            var0[var10001] = var10002;
         }

         for(var10000 = var1 = var0.length - (11 & 124); var10000 < var0.length; var10000 = var1) {
            var10002 = var0[var1];
            var10001 = var1;
            var10002 ^= f[var1 % f.length];
            ++var1;
            var0[var10001] = var10002;
         }

         return var0;
      }
   }

   public static Class409 o(int var0) throws Exception {
      synchronized(l) {
         Class409 var2;
         if ((var2 = (Class409)l.get(var0)) == null) {
            StringBuilder var10002 = new StringBuilder;
            Class409 var10000;
            if (var0 > 0) {
               var10002.<init>("sc/map/");
               var10000 = var2 = Class409.h(var10002.append(var0).append(".map").toString());
            } else {
               var10002.<init>("sc/map/");
               var10000 = var2 = Class409.h(var10002.append(-var0).append("A.map").toString());
            }

            var10000.r = var0;
            l.put(var0, var2);
         }

         var2.d += 3 & 5;
         return var2;
      }
   }

   public static synchronized Image p() {
      if (e == null) {
         e = l("sc/b/小地图红点0000.png");
      }

      return e;
   }

   public static Class604 q(String var0, int var1, int var2, int var3, int var4, boolean var5) {
      Class604 var6;
      if ((var6 = (Class604)h.get(var0)) == null) {
         var6 = new Class604(a(var0), var1, var2, var3, var4);
         h.put(var0, var6);
         h.put(var0 + " " + var1 + " " + var3 + " " + var2 + " " + var4, var6);
         if (var5) {
            return var6;
         }
      }

      if (var5) {
         return (new Class604(var6)).a(var1, var2, var3, var4);
      } else if (var6.b() == var1 && var6.c() == var2 && var6.i() == var3 && var6.j() == var4) {
         return var6;
      } else {
         String var8 = var0 + " " + var1 + " " + var3 + " " + var2 + " " + var4;
         Class604 var7;
         if ((var7 = (Class604)h.get(var8)) == null) {
            var7 = (new Class604(var6)).a(var1, var2, var3, var4);
            h.put(var8, var7);
         }

         return var7;
      }
   }
}
