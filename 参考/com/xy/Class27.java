package com.xy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigDecimal;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Class27 {
   public static final int a = 20;
   public static long b = 5500L;
   public static Random c = new Random();
   public static long d = 3500L;
   public static long e = 180000L;
   public static BigDecimal f = new BigDecimal("99999999999");

   public static String a() {
      try {
         byte[] var1 = NetworkInterface.getByInetAddress(InetAddress.getLocalHost()).getHardwareAddress();
         StringBuffer var2 = new StringBuffer("");

         int var3;
         for(int var10000 = var3 = 3 & 4; var10000 < var1.length; var10000 = var3) {
            String var4;
            if ((var4 = Integer.toHexString(var1[var3] & 17407 & 15615)).length() == --1) {
               var2.append("0" + var4);
            } else {
               var2.append(var4);
            }

            ++var3;
         }

         return var2.toString().toUpperCase();
      } catch (Exception var5) {
         var5.printStackTrace();
         return "000000000000";
      }
   }

   public static String b() {
      StringBuffer var0 = new StringBuffer();
      String var1 = System.getProperty("os.name").toUpperCase().replace(" ", "");
      if (var0.length() != 0) {
         var0.append("-");
      }

      var0.append(var1);
      var1 = h().toUpperCase().replace(" ", "");
      if (var0.length() != 0) {
         var0.append("-");
      }

      var0.append(var1);
      var1 = a().toUpperCase().replace(" ", "");
      if (var0.length() != 0) {
         var0.append("-");
      }

      var0.append(var1);
      return var0.toString();
   }

   public static boolean c(String var0) {
      int var1 = 3 & 5;
      String[] var2 = "管理|GM|gm|Gm|gM|卖|物集|菜|新开|群|号|币|艹|贱".split("\\|");

      int var3;
      for(int var10000 = var3 = 2 & 5; var10000 < var2.length; var10000 = var3) {
         if (var0.contains(var2[var3])) {
            return (boolean)(var1 = 3 & 4);
         }

         ++var3;
      }

      return (boolean)var1;
   }

   public static void d(String var0, String var1) {
      try {
         OutputStreamWriter var2 = new OutputStreamWriter(new FileOutputStream(var0), "UTF-8");
         BufferedWriter var10000 = new BufferedWriter(var2);
         var10000.write(var1);
         var10000.close();
      } catch (Exception var3) {
         var3.printStackTrace();
      }
   }

   public static String e(BigDecimal var0) {
      int var1;
      return (var1 = var0.intValue() % (126 & 11)) != --1 && var1 != 5 >> 1 && var1 != --3 && var1 != (95 & 39) && var1 != (91 & 45) && var1 != (79 & 59) ? "女" : "男";
   }

   public static List<String> f(String var0) {
      File var1;
      if (!(var1 = new File(var0)).exists()) {
         return null;
      } else {
         ArrayList var2 = new ArrayList();

         try {
            FileInputStream var3 = new FileInputStream(var1);
            InputStreamReader var4 = new InputStreamReader(var3, "UTF-8");
            BufferedReader var5 = new BufferedReader(var4);

            BufferedReader var10000;
            label27: {
               String var9;
               try {
                  while((var9 = var5.readLine()) != null) {
                     var2.add(var9);
                  }
               } catch (IOException var6) {
                  var10000 = var5;
                  var6.printStackTrace();
                  break label27;
               }

               var10000 = var5;
            }

            var10000.close();
            var4.close();
            var3.close();
            return var2;
         } catch (FileNotFoundException var7) {
            var7.printStackTrace();
            return var2;
         } catch (IOException var8) {
            var8.printStackTrace();
            return var2;
         }
      }
   }

   public static void g(String var0, String var1) {
      try {
         File var2;
         if (!(var2 = new File(var0)).exists()) {
            var2.createNewFile();
         }

         d(var0, var1);
      } catch (Exception var3) {
         var3.printStackTrace();
      }
   }

   public static String h() {
      try {
         return InetAddress.getLocalHost().getHostName().toString().replace("-", ",");
      } catch (Exception var1) {
         var1.printStackTrace();
         return "00000000000000";
      }
   }

   public static boolean i(String var0) {
      String[] var10000 = new String[31 & 106];
      boolean var10002 = true;
      var10000[2 & 5] = "!";
      var10000[5 >> 2] = "|";
      var10000[1 ^ 3] = "*";
      var10000[--3] = "&";
      var10000[--4] = "@";
      var10000[--5] = "#";
      var10000[110 & 23] = "$";
      var10000[119 & 15] = "%";
      var10000[77 & 58] = "^";
      var10000[63 & 73] = "/";
      String[] var1 = var10000;

      int var2;
      for(int var3 = var2 = 3 & 4; var3 < var1.length; var3 = var2) {
         if (var0.indexOf(var1[var2]) != -4 >> 2) {
            return (boolean)(2 & 5);
         }

         ++var2;
      }

      return (boolean)(5 >> 2);
   }

   public static String j(String var0) {
      String var1 = "";

      int var2;
      for(int var10000 = var2 = 2 & 5; var10000 < var0.length(); var10000 = var2) {
         String var3 = Integer.toHexString(var0.charAt(var2));
         StringBuilder var4 = new StringBuilder(String.valueOf(var1));
         ++var2;
         var1 = var4.append(var3).toString();
      }

      return var1;
   }

   public static int k(BigDecimal var0) {
      int var1;
      return (var1 = var0.intValue() % (122 & 15)) != --1 && var1 != 5 >> 1 && var1 != --3 && var1 != (103 & 31) && var1 != (61 & 75) && var1 != (27 & 111) ? 0 : 1;
   }

   public static void l(String var0, String var1) {
      try {
         try {
            OutputStreamWriter var2 = new OutputStreamWriter(new FileOutputStream(new File(var0)), "UTF-8");
            BufferedWriter var3 = new BufferedWriter(var2);
            var3.write(var1);
            var3.close();
            var2.close();
         } catch (Exception var4) {
            var4.printStackTrace();
         }
      } catch (Exception var5) {
         var5.printStackTrace();
      }
   }

   public static String m(String var0) {
      String var1 = "";

      try {
         File var3;
         if ((var3 = new File(var0)).exists()) {
            FileInputStream var4 = new FileInputStream(var3);
            InputStreamReader var5 = new InputStreamReader(var4, "UTF-8");
            BufferedReader var6 = new BufferedReader(var5);

            BufferedReader var10000;
            label27: {
               String var2;
               try {
                  while((var2 = var6.readLine()) != null) {
                     var1 = var1 + var2;
                  }
               } catch (IOException var7) {
                  var10000 = var6;
                  var7.printStackTrace();
                  break label27;
               }

               var10000 = var6;
            }

            var10000.close();
            var5.close();
            var4.close();
            return var1;
         }
      } catch (FileNotFoundException var8) {
         var8.printStackTrace();
         return var1;
      } catch (IOException var9) {
         var9.printStackTrace();
      }

      return var1;
   }

   public static String n() {
      String var0 = "";

      try {
         Runtime var10000 = Runtime.getRuntime();
         String[] var10001 = new String[--4];
         boolean var10003 = true;
         var10001[2 & 5] = "wmic";
         var10001[3 >> 1] = "cpu";
         var10001[1 ^ 3] = "get";
         var10001[--3] = "ProcessorId";
         Process var1;
         (var1 = var10000.exec(var10001)).getOutputStream().close();
         Scanner var3 = new Scanner(var1.getInputStream());
         var3.next();
         var0 = var3.next();
         var3.close();
         return var0;
      } catch (IOException var2) {
         var2.printStackTrace();
         return var0;
      }
   }
}
