package com.xy.v;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Class1 {
   private static Class16 a;
   private static List<Class16> b = new ArrayList<>();
   private static boolean c = true;
   private static boolean d = true;
   private static Object e = new Object();

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public static void a(boolean var0) {
      Object var1 = e;
      synchronized (e) {
         Object var10000;
         label28: {
            d = var0;
            label27:
            if (!var0 && a != null) {
               try {
                  a.b();
                  a.finalize();
                  a = null;
               } catch (Throwable var3) {
                  var3.printStackTrace();
                  break label27;
               }

               var10000 = var1;
               break label28;
            }

            var10000 = var1;
         }

         // $VF: monitorexit
      }
   }

   public static void b(boolean var0) {
      synchronized (e) {
         c = var0;
         if (!d) {
            d();
         }
      }
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public static void c(String var0) {
      Object var1 = e;
      synchronized (e) {
         if (d) {
            Object var10000;
            label58: {
               try {
                  if (a != null && a.q().equals(var0)) {
                     if (!a.p()) {
                        a.i();
                     }

                     return;
                  }

                  if (a != null) {
                     a.b();
                     a.finalize();
                  }

                  a = null;
                  String var10004 = "eO9Ac_\u007fO9";
                  if (!new File("sc/music/" + var0).exists()) {
                     return;
                  }

                  a = new Class16(var0);
                  a.h();
                  a.o(true);
               } catch (Exception var3) {
                  var10000 = var1;
                  break label58;
               } catch (Throwable var4) {
                  var10000 = var1;
                  break label58;
               }

               var10000 = var1;
            }

            // $VF: monitorexit
         }
      }
   }

   public static void d() {
      synchronized (e) {
         int var1;
         for (int var10000 = var1 = 0; var10000 < b.size(); var10000 = ++var1) {
            try {
               b.get(var1).b();
               b.get(var1).finalize();
            } catch (Throwable var3) {
               var3.printStackTrace();
            }
         }

         b.clear();
      }
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public static void e(String var0) {
      Object var1 = e;
      synchronized (e) {
         if (d) {
            Object var10000;
            label28: {
               if (var0 == null) {
                  if (a != null) {
                     a.b();
                     var10000 = var1;
                     break label28;
                  }
               } else {
                  c(var0);
               }

               var10000 = var1;
            }

            // $VF: monitorexit
         }
      }
   }

   public static void main(String[] var0) throws InterruptedException {
      String var10001 = "<A\u0015A\u0015A\u0015A\u0015A\u0015A\u0015A\u0015A\u0015A\u0015A\u0015A\u0015A\u0015A\u0015A\u0015A\u0015A\u0015A\u0015A\u0015A\u0015A\u0015A\u0015A\u0015A\u0015A\u0015h\u0015B\u0016B\u0016B\u0016B\u0016B\u0016B\u0016B\u0016B\u0016B\u0016B\u0016B\u0016B\u0016B\u0016B\u0016B\u0016B\u0016B\u0016B\u0016B\u0016B\u0016B\u0016B\u0016B\u0016A<A\u0016B\u0016B\u0016B\u0016B\u0015A\u0016A\u0016B\u0016A\u0016B\u0016B\u0015A\u0016A\u0015A\u0016A\u0015A\u0016A\u0015B\u0016A\u0015A\u0016B\u0016B\u0016B\u0016B\u0015h\u0015B\u0016B\u0016B\u0016B\u0015B\u0015B\u0015B\u0016B\u0015B\u0016B\u0015B\u0015B\u0016A\u0016B\u0015B\u0015B\u0015B\u0015B\u0016A\u0016B\u0016B\u0016B\u0016B\u0016A<A\u0016B\u0016B\u0016B\u0016A\u0015A\u0016A\u0016B\u0016A\u0016B\u0016A\u0015A\u0016B\u0015B\u0016A\u0016A\u0016A\u0015B\u0016B\u0015B\u0016B\u0016B\u0016B\u0016B\u0015h\u0015B\u0016B\u0016B\u0016B\u0015B\u0015B\u0015A\u0015B\u0015A\u0015B\u0015B\u0015B\u0016A\u0016B\u0015A\u0015B\u0015B\u0015B\u0015A\u0015B\u0016B\u0016B\u0016B\u0016A<A\u0016B\u0016B\u0016B\u0016B\u0016B\u0016B\u0016B\u0016B\u0016B\u0016B\u0016B\u0016B\u0016B\u0016B\u0016B\u0016B\u0016B\u0016B\u0016B\u0016B\u0016B\u0016B\u0016B\u0015h\u0015By\u0000P\u0017E\u0001W\u0016_\rXBT\u001b\u0016#Z\u000eW\u0016Y\u0010_By\u0000P\u0017E\u0001W\u0016Y\u0010\u0016\u0014\u0001L\u0001Br'{-\u0016A<A\u0016B\u0016B\u0016B\u0016B\u0016B\u0016B\u0016B\u0016B\u0016B\u0016B\u0016B\u0016B\u0016B\u0016B\u0016B\u0016B\u0016B\u0016B\u0016B\u0016B\u0016B\u0016B\u0016B\u0015h\u0015B\u0016B\u0016B\u0016B\u0016B\u0016B^\u0016B\u0012\fM\u0019\u0015A\u0015\u0018\u0003Z\u000eW\u0016Y\u0010_LU\r[B\u0016B\u0016B\u0016B\u0016B\u0016B\u0016A<A\u0016B\u0016B\u0016B\u0016B\u0016B\u0016B\u0016B\u0016B\u0016B\u0016B\u0016B\u0016B\u0016B\u0016B\u0016B\u0016B\u0016B\u0016B\u0016B\u0016B\u0016B\u0016B\u0016B\u0015h\u0015A\u0015A\u0015A\u0015A\u0015A\u0015A\u0015A\u0015A\u0015A\u0015A\u0015A\u0015A\u0015A\u0015A\u0015A\u0015A\u0015A\u0015A\u0015A\u0015A\u0015A\u0015A\u0015A\u0015A<";
      System.out
         .println(
            "\n################################################\n#                                              #\n#        ## #   #    ## ### ### ##  ###        #\n#       # # #   #   # #  #  # # # #  #         #\n#       ### #   #   ###  #  # # ##   #         #\n#       # # ### ### # #  #  ### # # ###        #\n#                                              #\n# Obfuscation by Allatori Obfuscator v7.7 DEMO #\n#                                              #\n#           http://www.allatori.com            #\n#                                              #\n################################################\n"
         );
      new Thread(new Class9()).start();
      new Thread(new Class14()).start();
      Thread.sleep(2000L);
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public static void f(String var0) {
      Object var1 = e;
      synchronized (e) {
         if (c) {
            Object var10000;
            label57: {
               try {
                  int var2;
                  for (int var7 = var2 = b.size() - 1; var7 >= 0; var7 = --var2) {
                     if (b.get(var2).q().equals(var0)) {
                        return;
                     }
                  }

                  String var10004 = "E\u0001\u0019\u000fC\u0011_\u0001\u0019";
                  if (!new File("sc/music/" + var0).exists()) {
                     return;
                  }

                  Class16 var3 = new Class16(var0);
                  b.add(var3);
                  var3.h();
                  var3.o(false);
               } catch (Exception var4) {
                  var10000 = var1;
                  break label57;
               } catch (Throwable var5) {
                  var10000 = var1;
                  break label57;
               }

               var10000 = var1;
            }

            // $VF: monitorexit
         }
      }
   }

   public static void g(Class16 var0) {
      synchronized (e) {
         try {
            var0.b();
            var0.finalize();
         } catch (Throwable var3) {
            var3.printStackTrace();
         }

         b.remove(var0);
      }
   }

   public static void h(String var0) {
      synchronized (e) {
         if (a != null && a.q().equals(var0)) {
            a.b();
         }
      }
   }
}
