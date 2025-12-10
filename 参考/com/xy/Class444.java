package com.xy;

import java.lang.ref.SoftReference;

public class Class444 extends Thread {
   public static String b = "N0";
   boolean c;
   public static String d = "M1";
   public static String e = "N";
   private static String f = "_";
   public static String g = "N1";
   public static String h = "M";
   public static String i = "M0";
   private int j;

   public void c() {
      synchronized(this) {
         if (!this.c) {
            this.c = (boolean)(--1);
            this.notifyAll();
         }
      }
   }

   public Class444() {
      int var10001 = --1;
      int var10003 = 4 ^ 5;
      super();
      this.c = (boolean)var10003;
      this.setDaemon((boolean)var10001);
   }

   public void run() {
      while(true) {
         while(true) {
            try {
               Object var1;
               if ((var1 = Class330.ak()) != null) {
                  Object var17;
                  if (var1 instanceof Class8) {
                     int var10002 = this.j;
                     this.j = var10002 + (3 & 5);
                     if (var10002 % --4 == 0) {
                        Thread.sleep(1L);
                     }

                     Class330.ad((Class8)var1);
                     var17 = var1;
                  } else {
                     label104: {
                        if (var1 instanceof String) {
                           long var3;
                           SoftReference var5;
                           long var6;
                           short[] var8;
                           Class8 var9;
                           String var14;
                           if ((var14 = (String)var1).startsWith(e)) {
                              var3 = Long.parseLong(var14.substring(1 ^ 3));
                              if ((var5 = (SoftReference)Class330.z.get(var3)) == null || var5.get() == null) {
                                 var8 = Class330.t(var6 = var3 >> (62 & 105));
                                 if ((var9 = Class330.ah(var3 & 549755813887L, var14.startsWith(g), var8)) != null) {
                                    Class330.z.put(var3, new SoftReference(var9));
                                    if (var9.z() == 5 >> 2) {
                                       var17 = var1;
                                       var9.a(3 ^ 3);
                                       Class330.ad(var9);
                                       break label104;
                                    }
                                 }
                              }
                           } else if (var14.startsWith(h)) {
                              var3 = Long.parseLong(var14.substring(1 ^ 3));
                              if ((var5 = (SoftReference)Class330.z.get(-var3)) == null || var5.get() == null) {
                                 var8 = Class330.t(var6 = var3 >> (63 & 104));
                                 if ((var9 = Class330.ab(var3 & 549755813887L, var14.startsWith(d), var8)) != null) {
                                    Class330.z.put(-var3, new SoftReference(var9));
                                    if (var9.z() == (3 & 5)) {
                                       var17 = var1;
                                       var9.a(3 >> 2);
                                       Class330.ad(var9);
                                       break label104;
                                    }
                                 }
                              }
                           } else {
                              SoftReference var15;
                              if ((var15 = (SoftReference)Class330.ah.get(var14)) == null || var15.get() == null) {
                                 Class8 var4 = null;
                                 int var16;
                                 Class8 var18;
                                 if ((var16 = var14.indexOf(f)) == -4 >> 2) {
                                    var18 = var4 = Class330.s(var14, (short[])null);
                                 } else {
                                    var6 = Class394.q(var14, var16 + --1, var14.length());
                                    var18 = var4 = Class330.s(var14.substring(5 >> 3, var16), Class330.t(var6));
                                 }

                                 if (var18 != null) {
                                    Class330.ah.put(var14, new SoftReference(var4));
                                    if (var4.z() == 3 >> 1) {
                                       var4.a(3 >> 2);
                                       Class330.ad(var4);
                                    }
                                 }
                              }
                           }
                        }

                        var17 = var1;
                     }
                  }

                  Class330.b(var17);
               } else {
                  synchronized(this) {
                     this.c = (boolean)(5 >> 3);
                     this.wait();
                  }
               }
            } catch (Exception var13) {
               var13.printStackTrace();
               Class444 var2 = this;
               synchronized(this) {
                  Class444 var10000;
                  label62: {
                     try {
                        Thread.sleep(2000L);
                        this.c = (boolean)(2 ^ 3);
                        this.notifyAll();
                     } catch (Exception var11) {
                        var10000 = var2;
                        var11.printStackTrace();
                        break label62;
                     }

                     var10000 = var2;
                  }

               }
            }
         }
      }
   }
}
