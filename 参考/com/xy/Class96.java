package com.xy;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Class96 {
   private static Object a = new Object();
   private static List<Class411> b = new ArrayList();
   private static Class411 c;
   private static boolean d = --1;
   private static boolean e = --1;

   public static void a(String var0) {
      Object var1;
      synchronized(var1 = a) {
         if (e) {
            Object var10000;
            label25: {
               if (var0 == null) {
                  if (c != null) {
                     c.d();
                     var10000 = var1;
                     break label25;
                  }
               } else {
                  e(var0);
               }

               var10000 = var1;
            }

         }
      }
   }

   public static void b(boolean var0) {
      synchronized(a) {
         d = var0;
         if (!e) {
            f();
         }

      }
   }

   public static void c(Class411 var0) {
      synchronized(a) {
         try {
            var0.d();
            var0.finalize();
         } catch (Throwable var3) {
            var3.printStackTrace();
         }

         b.remove(var0);
      }
   }

   public static void d(String var0) {
      synchronized(a) {
         if (c != null && c.a().equals(var0)) {
            c.d();
         }
      }
   }

   public static void e(String var0) {
      Object var1;
      synchronized(var1 = a) {
         if (e) {
            Object var10000;
            label60: {
               label73: {
                  try {
                     if (c != null && c.a().equals(var0)) {
                        if (!c.j()) {
                           c.o();
                        }

                        return;
                     }

                     if (c != null) {
                        c.d();
                        c.finalize();
                     }

                     c = null;
                     if ((new File("sc/music/" + var0)).exists()) {
                        c = new Class411(var0);
                        c.g();
                        c.c((boolean)(3 >> 1));
                        break label73;
                     }
                  } catch (Exception var2) {
                     var10000 = var1;
                     break label60;
                  } catch (Throwable var3) {
                     var10000 = var1;
                     break label60;
                  }

                  return;
               }

               var10000 = var1;
            }

         }
      }
   }

   public static void main(String[] var0) throws InterruptedException {
      System.out.println("\n###########################################\n#                                         #\n#      ## #   #    ## ### ### ##  ###     #\n#     # # #   #   # #  #  # # # #  #      #\n#     ### #   #   ###  #  # # ##   #      #\n#     # # ### ### # #  #  ### # # ###     #\n#                                         #\n# Protecting Java applications since 2006 #\n#                                         #\n#      Allatori Obfuscator v9.4 DEMO      #\n#                                         #\n#              DEMO VERSION!              #\n#                                         #\n#         NOT FOR COMMERCIAL USE!         #\n#                                         #\n#          https://allatori.com           #\n#                                         #\n###########################################\n");
      (new Thread(new Runnable() {
         public void run() {
            Class96.h("按钮按下.mp3");
         }
      })).start();
      (new Thread(new Runnable() {
         public void run() {
            Class96.h("按钮按下.mp3");
         }
      })).start();
      Thread.sleep(2000L);
   }

   public static void f() {
      synchronized(a) {
         int var1;
         for(int var10000 = var1 = 0; var10000 < b.size(); var10000 = var1) {
            try {
               ((Class411)b.get(var1)).d();
               ((Class411)b.get(var1)).finalize();
            } catch (Throwable var3) {
               var3.printStackTrace();
            }

            ++var1;
         }

         b.clear();
      }
   }

   public static void g(boolean var0) {
      Object var1;
      synchronized(var1 = a) {
         Object var10000;
         label25: {
            e = var0;
            if (!var0 && c != null) {
               label22: {
                  try {
                     c.d();
                     c.finalize();
                     c = null;
                  } catch (Throwable var3) {
                     var3.printStackTrace();
                     break label22;
                  }

                  var10000 = var1;
                  break label25;
               }
            }

            var10000 = var1;
         }

      }
   }

   public static void h(String var0) {
      Object var1;
      synchronized(var1 = a) {
         if (d) {
            Object var10000;
            label69: {
               try {
                  int var2;
                  for(int var7 = var2 = b.size() - (3 & 5); var7 >= 0; var7 = var2) {
                     if (((Class411)b.get(var2)).a().equals(var0)) {
                        return;
                     }

                     --var2;
                  }

                  if (!(new File("sc/music/" + var0)).exists()) {
                     return;
                  }

                  Class411 var3 = new Class411(var0);
                  b.add(var3);
                  var3.g();
                  var3.c((boolean)(3 >> 2));
               } catch (Exception var4) {
                  var10000 = var1;
                  break label69;
               } catch (Throwable var5) {
                  var10000 = var1;
                  break label69;
               }

               var10000 = var1;
            }

         }
      }
   }
}
