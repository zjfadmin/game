package com.xy.w;

import java.lang.ref.SoftReference;

public class Class2 extends Thread {
   public static String b = "M";
   public static String c = "M0";
   public static String d = "N0";
   boolean e = true;
   public static String f = "M1";
   private static String g = "_";
   public static String h = "N1";
   private int i;
   public static String j = "N";

   public Class2() {
      this.setDaemon(true);
   }

   public void g() {
      synchronized (this) {
         if (!this.e) {
            this.e = true;
            this.notifyAll();
         }
      }
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public void run() {
      while (true) {
         try {
            Object var1;
            if ((var1 = Class11.j()) == null) {
               synchronized (this) {
                  this.e = false;
                  this.wait();
               }
            } else {
               Object var24;
               if (var1 instanceof Class1) {
                  if (this.i++ % 4 == 0) {
                     Thread.sleep(1L);
                  }

                  Class11.b((Class1)var1);
                  var24 = var1;
               } else {
                  label106: {
                     if (var1 instanceof String) {
                        String var14;
                        if ((var14 = (String)var1).startsWith(j)) {
                           long var3 = Long.parseLong(var14.substring(2));
                           SoftReference var5;
                           if ((var5 = Class11.t.get(var3)) == null || var5.get() == null) {
                              long var6;
                              short[] var8 = Class11.v(var6 = var3 >> 40);
                              Class1 var9;
                              if ((var9 = Class11.z(var3 & 549755813887L, var14.startsWith(h), var8)) != null) {
                                 Class11.t.put(var3, new SoftReference<>(var9));
                                 if (var9.z() == 1) {
                                    var24 = var1;
                                    var9.p(0);
                                    Class11.b(var9);
                                    break label106;
                                 }
                              }
                           }
                        } else if (var14.startsWith(b)) {
                           long var15 = Long.parseLong(var14.substring(2));
                           SoftReference var18;
                           if ((var18 = Class11.t.get(-var15)) == null || var18.get() == null) {
                              long var20;
                              short[] var22 = Class11.v(var20 = var15 >> 40);
                              Class1 var23;
                              if ((var23 = Class11.m(var15 & 549755813887L, var14.startsWith(f), var22)) != null) {
                                 Class11.t.put(-var15, new SoftReference<>(var23));
                                 if (var23.z() == 1) {
                                    var24 = var1;
                                    var23.p(0);
                                    Class11.b(var23);
                                    break label106;
                                 }
                              }
                           }
                        } else {
                           SoftReference var16;
                           if ((var16 = Class11.q.get(var14)) == null || var16.get() == null) {
                              Class1 var4 = null;
                              int var19;
                              if ((var19 = var14.indexOf(g)) == -1) {
                                 var24 = var4 = Class11.f(var14, null);
                              } else {
                                 long var21 = com.xy.v.Class12.s(var14, var19 + 1, var14.length());
                                 var24 = var4 = Class11.f(var14.substring(0, var19), Class11.v(var21));
                              }

                              if (var24 != null) {
                                 Class11.q.put(var14, new SoftReference<>(var4));
                                 if (var4.z() == 1) {
                                    var4.p(0);
                                    Class11.b(var4);
                                 }
                              }
                           }
                        }
                     }

                     var24 = var1;
                  }
               }

               Class11.q(var24);
            }
         } catch (Exception var13) {
            var13.printStackTrace();
            Class2 var2 = this;
            synchronized (this) {
               Class2 var10000;
               label65: {
                  try {
                     Thread.sleep(2000L);
                     this.e = true;
                     this.notifyAll();
                  } catch (Exception var11) {
                     var10000 = var2;
                     var11.printStackTrace();
                     break label65;
                  }

                  var10000 = var2;
               }

               // $VF: monitorexit
            }
         }
      }
   }
}
