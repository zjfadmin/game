package com.xy.v;

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

public class Class0 {
   public static Random a = new Random();
   public static BigDecimal b = new BigDecimal("99999999999");
   public static long c = 3500L;
   public static long d = 180000L;
   public static final int e = 20;

   public static List<String> a(String var0) {
      File var1;
      if (!(var1 = new File(var0)).exists()) {
         return null;
      } else {
         ArrayList var2 = new ArrayList();

         try {
            FileInputStream var4 = new FileInputStream(var1);
            InputStreamReader var5 = new InputStreamReader(var4, "UTF-8");
            BufferedReader var6 = new BufferedReader(var5);

            BufferedReader var10000;
            label31: {
               String var3;
               try {
                  while ((var3 = var6.readLine()) != null) {
                     var2.add(var3);
                  }
               } catch (IOException var8) {
                  var10000 = var6;
                  var8.printStackTrace();
                  break label31;
               }

               var10000 = var6;
            }

            var10000.close();
            var5.close();
            var4.close();
            return var2;
         } catch (FileNotFoundException var9) {
            var9.printStackTrace();
            return var2;
         } catch (IOException var10) {
            var10.printStackTrace();
            return var2;
         }
      }
   }

   public static boolean b(String var0) {
      boolean var1 = true;
      String var10000 = "篈琯\u0015n$U\u000eD\u0015n\u0004U\u000ed\u0015卿\u0015牀隯U莵U旙弩\u0015羍\u0015叞\u0015帨\u0015艐\u0015贘";
      String var10001 = "5$";
      String[] var3 = "管理|GM|gm|Gm|gM|卖|物集|菜|新开|群|号|币|艹|贱".split("\\|");

      int var4;
      for (int var6 = var4 = 0; var6 < var3.length; var6 = ++var4) {
         if (var0.contains(var3[var4])) {
            var1 = false;
            return false;
         }
      }

      return var1;
   }

   public static int c(BigDecimal var0) {
      int var1;
      return (var1 = var0.intValue() % 10) != 1 && var1 != 2 && var1 != 3 && var1 != 7 && var1 != 9 ? 0 : 1;
   }

   public static String d(String var0) {
      String var1 = "";

      try {
         File var3;
         if ((var3 = new File(var0)).exists()) {
            FileInputStream var4 = new FileInputStream(var3);
            InputStreamReader var5 = new InputStreamReader(var4, "UTF-8");
            BufferedReader var6 = new BufferedReader(var5);

            BufferedReader var10000;
            label33: {
               String var2;
               try {
                  while ((var2 = var6.readLine()) != null) {
                     var1 = var1 + var2;
                  }
               } catch (IOException var8) {
                  var10000 = var6;
                  var8.printStackTrace();
                  break label33;
               }

               var10000 = var6;
            }

            var10000.close();
            var5.close();
            var4.close();
            return var1;
         }
      } catch (FileNotFoundException var9) {
         var9.printStackTrace();
         return var1;
      } catch (IOException var10) {
         var10.printStackTrace();
      }

      return var1;
   }

   public static String e() {
      StringBuffer var0 = new StringBuffer();
      String var10000 = "F\u001a\u0007\u0007H\u0004L";
      var10000 = System.getProperty("os.name").toUpperCase();
      String var10001 = "x";
      String var1 = var10000.replace(" ", "");
      if (var0.length() != 0) {
         var10001 = "\u0004";
         var0.append("-");
      }

      var0.append(var1);
      String var10002 = i().toUpperCase();
      String var10003 = "x";
      var1 = var10002.replace(" ", "");
      if (var0.length() != 0) {
         var10001 = "\u0004";
         var0.append("-");
      }

      var0.append(var1);
      var10002 = h().toUpperCase();
      var10003 = "x";
      var1 = var10002.replace(" ", "");
      if (var0.length() != 0) {
         var10001 = "\u0004";
         var0.append("-");
      }

      var0.append(var1);
      var10002 = k().toUpperCase();
      var10003 = "x";
      var1 = var10002.replace(" ", "");
      if (var0.length() != 0) {
         var10001 = "\u0004";
         var0.append("-");
      }

      var0.append(var1);
      return var0.toString();
   }

   public static String f(String var0) {
      String var1 = "";

      int var2;
      for (int var10000 = var2 = 0; var10000 < var0.length(); var10000 = var2) {
         String var4 = Integer.toHexString(var0.charAt(var2));
         StringBuilder var5 = new StringBuilder(String.valueOf(var1));
         var2++;
         var1 = var5.append(var4).toString();
      }

      return var1;
   }

   static {
      String var10002 = "aPaPaPaPaPa";
   }

   public static void g(String var0, String var1) {
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

   public static String h() {
      String var0 = "";

      try {
         Runtime var10000 = Runtime.getRuntime();
         String[] var10001 = new String[4];
         String var10004 = "\u001e5\u0000;";
         var10001[0] = "wmic";
         var10004 = "J\u0019\\";
         var10001[1] = "cpu";
         var10004 = "?\f,";
         var10001[2] = "get";
         var10004 = "y\u001bF\nL\u001aZ\u0006[ M";
         var10001[3] = "ProcessorId";
         Process var1;
         (var1 = var10000.exec(var10001)).getOutputStream().close();
         Scanner var5 = new Scanner(var1.getInputStream());
         String var3 = var5.next();
         var0 = var5.next();
         var5.close();
         return var0;
      } catch (IOException var4) {
         var4.printStackTrace();
         return var0;
      }
   }

   public static String i() {
      try {
         String var2 = InetAddress.getLocalHost().getHostName().toString();
         String var10001 = "u";
         return var2.replace("-", ",");
      } catch (Exception var1) {
         String var10000 = "Y\u0019Y\u0019Y\u0019Y\u0019Y\u0019Y\u0019Y\u0019";
         var1.printStackTrace();
         return "00000000000000";
      }
   }

   public static boolean j(String var0) {
      String[] var10000 = new String[10];
      String var10003 = "\b";
      var10000[0] = "!";
      var10003 = "$";
      var10000[1] = "|";
      var10003 = "\u0003";
      var10000[2] = "*";
      var10003 = "~";
      var10000[3] = "&";
      var10003 = "i";
      var10000[4] = "@";
      var10003 = "{";
      var10000[5] = "#";
      var10003 = "\r";
      var10000[6] = "$";
      var10003 = "}";
      var10000[7] = "%";
      var10003 = "w";
      var10000[8] = "^";
      var10003 = "w";
      var10000[9] = "/";
      String[] var1 = var10000;

      int var2;
      for (int var3 = var2 = 0; var3 < var1.length; var3 = ++var2) {
         if (var0.indexOf(var1[var2]) != -1) {
            return false;
         }
      }

      return true;
   }

   public static String k() {
      try {
         byte[] var1 = NetworkInterface.getByInetAddress(InetAddress.getLocalHost()).getHardwareAddress();
         StringBuffer var2 = new StringBuffer("");

         int var3;
         for (int var7 = var3 = 0; var7 < var1.length; var7 = ++var3) {
            String var5;
            if ((var5 = Integer.toHexString(var1[var3] & 255)).length() == 1) {
               var2.append("0" + var5);
            } else {
               var2.append(var5);
            }
         }

         return var2.toString().toUpperCase();
      } catch (Exception var6) {
         String var10000 = "YhYhYhYhYhYh";
         return "000000000000";
      }
   }

   public static String l(BigDecimal var0) {
      int var1;
      if ((var1 = var0.intValue() % 10) != 1 && var1 != 2 && var1 != 3 && var1 != 7 && var1 != 9) {
         String var2 = "夫";
         return "女";
      } else {
         String var10000 = "甞";
         return "男";
      }
   }

   public static void m(String var0, String var1) {
      try {
         File var2;
         if (!(var2 = new File(var0)).exists()) {
            var2.createNewFile();
         }

         n(var0, var1);
      } catch (Exception var3) {
         var3.printStackTrace();
      }
   }

   public static void n(String var0, String var1) {
      try {
         OutputStreamWriter var2 = new OutputStreamWriter(new FileOutputStream(var0), "UTF-8");
         BufferedWriter var10000 = new BufferedWriter(var2);
         var10000.write(var1);
         var10000.close();
      } catch (Exception var3) {
         var3.printStackTrace();
      }
   }
}
