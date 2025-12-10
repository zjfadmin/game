package com.xy;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class Class394 {
   private static Pattern a = Pattern.compile("^(?![0-9]+$)(?![a-zA-Z]+$)[0-9A-Za-z]{6,24}$");
   private static Pattern b = Pattern.compile("^-?\\d+$");
   static int c = 90 & 47;
   private static final char d = 'a';
   private static final char e = 'V';
   private static final char f = '9';
   private static final char g = '-';
   private static final char h = '0';
   private static final char i = '-';
   private static final char j = '0';
   private static final char k = 'Z';
   private static final char l = '9';
   private static Pattern m = Pattern.compile("^[0-9]*$");
   private static final char n = 'A';
   private static final char o = 'z';
   private static final char p = 'A';

   public static int a(int var0) {
      if (var0 < (63 & 74)) {
         return 4 ^ 5;
      } else if (var0 < (102 & 125)) {
         return 5 >> 1;
      } else if (var0 < (19453 & 14314)) {
         return --3;
      } else if (var0 < (28625 & 14142)) {
         return --4;
      } else if (var0 < 100000) {
         return --5;
      } else if (var0 < 1000000) {
         return 95 & 38;
      } else if (var0 < 10000000) {
         return 23 & 111;
      } else if (var0 < 100000000) {
         return 74 & 61;
      } else {
         return var0 < 1000000000 ? 95 & 41 : 10;
      }
   }

   public static int b(String var0, int var1, int var2) throws NumberFormatException {
      if (var0 == null) {
         throw new NumberFormatException("null");
      } else if (var1 >= 0 && var2 <= var0.length() && var1 < var2) {
         int var3 = 0;
         int var4 = 5 >> 3;
         int var5 = -2147483647;
         char var8;
         if ((var8 = var0.charAt(var1)) < (49 & 126)) {
            if (var8 == (127 & 45)) {
               var4 = --1;
               var5 = Integer.MIN_VALUE;
            } else if (var8 != (107 & 63)) {
               throw ac(var0);
            }

            ++var1;
            if (var1 == var2) {
               throw ac(var0);
            }
         }

         int var6 = var5 / c;

         for(int var10000 = var1; var10000 < var2; var10000 = var1) {
            var10000 = Character.digit(var0.charAt(var1), c);
            ++var1;
            int var7 = var10000;
            if (var10000 < 0 || var3 < var6) {
               throw ac(var0);
            }

            if ((var3 *= c) < var5 + var7) {
               throw ac(var0);
            }

            var3 -= var7;
         }

         if (var4 != 0) {
            return var3;
         } else {
            return -var3;
         }
      } else {
         throw new NumberFormatException("For input string: \"" + var0 + "\"" + " " + var1 + " " + var2);
      }
   }

   public static String c(String var0, String var1, int var2) {
      if (var2 != --2 && var2 != --3) {
         boolean var8 = true;
         int var4 = 3 ^ 3;
         if (var2 == --2 || var2 == --3 || var2 == --5) {
            var4 = 1;
         }

         ArrayList var5 = new ArrayList();
         if (var0 == null) {
            var0 = "";
         }

         String[] var6 = var0.split("\\|");

         int var7;
         int var10000;
         for(var10000 = var7 = 3 & 4; var10000 < var6.length; var10000 = var7) {
            if (var2 == 0) {
               if (!var6[var7].equals(var1)) {
                  var5.add(var6[var7]);
               } else {
                  var8 = false;
               }
            } else {
               String[] var3 = var6[var7].split("=");
               String[] var9 = var1.split("=");
               if (var3[2 & 5].equals(var9[5 >> 3])) {
                  if (var2 == --1) {
                     var5.add(var1);
                  } else {
                     double var10;
                     double var12;
                     if (var2 == --2) {
                        var4 = 2 & 5;
                        var10 = Double.parseDouble(var3[3 >> 1]);
                        var12 = Double.parseDouble(var9[5 >> 2]);
                        if ((var10 += var12) % 1.0D == 0.0D) {
                           var5.add(var3[3 & 4] + "=" + (int)var10);
                        } else {
                           var5.add(var3[2 & 5] + "=" + var10);
                        }
                     } else if (var2 == --3) {
                        var4 = 3 >> 2;
                        var10 = Double.parseDouble(var3[3 & 5]);
                        var12 = Double.parseDouble(var9[--1]);
                        if ((var10 -= var12) % 1.0D == 0.0D) {
                           var5.add(var3[3 >> 2] + "=" + (int)var10);
                        } else {
                           var5.add(var3[3 >> 2] + "=" + var10);
                        }
                     } else if (var2 == --5) {
                        var4 = 3 & 4;
                        var10 = Double.parseDouble(var3[--1]);
                        if ((var12 = Double.parseDouble(var9[3 >> 1])) > var10) {
                           var10 = var12;
                        }

                        if (var10 % 1.0D == 0.0D) {
                           var5.add(var3[3 >> 2] + "=" + (int)var10);
                        } else {
                           var5.add(var3[2 & 5] + "=" + var10);
                        }
                     }
                  }
               } else {
                  var5.add(var6[var7]);
               }
            }

            ++var7;
         }

         if (var8 && var2 == 0) {
            var5.add(var1);
         }

         if (var4 != 0) {
            var5.add(var1);
         }

         StringBuffer var15 = new StringBuffer();

         int var14;
         for(var10000 = var14 = 0; var10000 < var5.size(); var10000 = var14) {
            if (!var15.toString().equals("")) {
               var15.append("|" + (String)var5.get(var14));
            } else {
               var15.append((String)var5.get(var14));
            }

            ++var14;
         }

         return var15.toString();
      } else {
         return ad(var0, var1, var2);
      }
   }

   public static String d(String var0, String var1, String var2) {
      if (var0 != null && !var0.equals("")) {
         int var3;
         if (var0.startsWith(var1)) {
            var3 = var0.indexOf(var2);
            return var0.substring(var1.length(), var3 != -4 >> 2 ? var3 : var0.length());
         } else if ((var3 = var0.indexOf(var2 + var1)) == -4 >> 2) {
            return null;
         } else {
            return (var3 = (var1 = var0.substring(var3 + var2.length() + var1.length())).indexOf(var2)) == -4 >> 2 ? var1 : var1.substring(2 & 5, var3);
         }
      } else {
         return null;
      }
   }

   public static long e(String var0) {
      return q(var0, 3 & 4, var0.length());
   }

   public static int f(char var0, String var1) {
      return aj(var0, var1, 3 ^ 3, var1.length());
   }

   public static int g(String var0) {
      return b(var0, 5 >> 3, var0.length());
   }

   public static void h(long var0, StringBuffer var2) throws NumberFormatException {
      if (var0 < 0L) {
         var2.append((char)('?' & 'm'));
         var0 = -var0;
      }

      long var3 = 1L;
      long var10000 = var0;

      while(true) {
         var3 = var10000 % 32L;
         var2.append((char)((int)(var3 >= 10L ? 65L + (var3 - 10L) : 48L + var3)));
         if (var0 < 32L) {
            return;
         }

         var10000 = var0 /= 32L;
      }
   }

   public static boolean i(String var0) {
      return var0 != null && !var0.equals("") ? m.matcher(var0).matches() : false;
   }

   public static List<Integer> j(String var0) {
      ArrayList var1 = new ArrayList();
      if (var0 != null && !var0.equals("")) {
         String[] var2 = var0.split("\\|");

         int var3;
         for(int var10000 = var3 = 3 & 4; var10000 < var2.length; var10000 = var3) {
            int var6;
            String[] var9;
            if (var2[var3].indexOf("-") != -4 >> 2) {
               var9 = var2[var3].split("-");
               Integer var7 = Integer.parseInt(var9[3 >> 2]);
               Integer var8 = Integer.parseInt(var9[3 & 5]);

               for(var10000 = var6 = var7; var10000 <= var8; var10000 = var6) {
                  var1.add(var6++);
               }
            } else if (var2[var3].indexOf("&") != -4 >> 2) {
               var9 = var2[var3].split("&");
               int var4 = Integer.parseInt(var9[3 ^ 3]);
               int var5 = Integer.parseInt(var9[5 >> 2]);

               for(var10000 = var6 = 3 >> 2; var10000 < var5; var10000 = var6) {
                  ++var6;
                  var1.add(var4);
               }
            } else {
               var1.add(Integer.parseInt(var2[var3]));
            }

            ++var3;
         }

         return var1;
      } else {
         return var1;
      }
   }

   public static void k(long var0, StringBuffer var2) throws NumberFormatException {
      if (var0 < 0L) {
         var2.append((char)('o' & '='));
         var0 = -var0;
      }

      long var3 = 1L;
      long var10000 = var0;

      while(true) {
         var3 = var10000 % 62L;
         var2.append((char)((int)(var3 >= 36L ? 97L + (var3 - 36L) : (var3 >= 10L ? 65L + (var3 - 10L) : 48L + var3))));
         if (var0 < 62L) {
            return;
         }

         var10000 = var0 /= 62L;
      }
   }

   public static long l(int var0, String var1, int var2, String var3) {
      if (var1 != null && !var1.equals("")) {
         boolean var4 = false;
         int var5 = 5 >> 3;
         String var10000 = var1;

         while(true) {
            int var8 = var10000.indexOf(var3, var5);
            long var6;
            int var9;
            if ((var6 = Long.parseLong(var1.substring(var5, var8 != -4 >> 2 ? var8 : var1.length()))) < 0L) {
               var9 = var2 = (int)((long)var2 + -var6);
            } else if (var6 == 0L) {
               ++var2;
               var9 = var2;
            } else {
               ++var2;
               var9 = var2;
            }

            if (var9 >= var0) {
               if (var6 > 0L) {
                  return var6;
               }

               return 0L;
            }

            if (var8 == -4 >> 2) {
               return 0L;
            }

            var5 = var8 + (3 & 5);
            var10000 = var1;
         }
      } else {
         return 0L;
      }
   }

   public static long[] m(long[] var0, String var1, int var2, String var3) {
      if (var1 != null && !var1.equals("")) {
         boolean var4 = false;
         int var5 = 2 & 5;
         String var10000 = var1;

         while(true) {
            int var8 = var10000.indexOf(var3, var5);
            long var6;
            int var9;
            if ((var6 = Long.parseLong(var1.substring(var5, var8 != -4 >> 2 ? var8 : var1.length()))) < 0L) {
               var2 = (int)((long)var2 + -var6);
               var9 = var8;
            } else if (var6 == 0L) {
               var9 = var8;
               ++var2;
            } else {
               var0[var2++] = var6;
               var9 = var8;
            }

            if (var9 == -1) {
               return var0;
            }

            if (var2 >= var0.length) {
               return var0;
            }

            var5 = var8 + (5 >> 2);
            var10000 = var1;
         }
      } else {
         return var0;
      }
   }

   public static long n(String var0, int var1, int var2) throws NumberFormatException {
      if (var0 == null) {
         throw new NumberFormatException("null");
      } else if (var1 >= 0 && var2 <= var0.length() && var1 < var2) {
         long var3 = 0L;
         int var5 = 3 & 5;
         if (var0.charAt(var1) == (111 & 61)) {
            var5 = 3 & 4;
            ++var1;
         }

         --var2;

         for(int var10000 = var2; var10000 >= var1; var10000 = var2) {
            char var6 = var0.charAt(var2);
            var3 <<= --5;
            if (var6 >= (117 & 58) && var6 <= (63 & 121)) {
               var3 += (long)(var6 - (124 & 51));
            } else {
               if (var6 < (107 & 85) || var6 > (127 & 86)) {
                  throw ac(var0);
               }

               var3 += (long)(var6 - (101 & 91) + (90 & 47));
            }

            --var2;
         }

         if (var5 != 0) {
            return var3;
         } else {
            return -var3;
         }
      } else {
         throw new NumberFormatException("For input string: \"" + var0 + "\"" + " " + var1 + " " + var2);
      }
   }

   public static boolean o(String var0) {
      return (boolean)(var0 != null && !var0.equals("") ? 2 & 5 : 1);
   }

   public static long p(String var0, String var1, String var2) {
      return (var0 = d(var0, var1, var2)) != null && !var0.equals("") ? Long.parseLong(var0) : 0L;
   }

   public static long q(String var0, int var1, int var2) throws NumberFormatException {
      if (var0 == null) {
         throw new NumberFormatException("null");
      } else if (var1 >= 0 && var2 <= var0.length() && var1 < var2) {
         long var3 = 0L;
         int var5 = 3 & 4;
         long var6 = -9223372036854775807L;
         char var11;
         if ((var11 = var0.charAt(var1)) < (48 & 127)) {
            if (var11 == (111 & 61)) {
               var5 = 4 ^ 5;
               var6 = Long.MIN_VALUE;
            } else if (var11 != (123 & 47)) {
               throw ac(var0);
            }

            ++var1;
            if (var1 == var2) {
               throw ac(var0);
            }
         }

         long var8 = var6 / (long)c;

         for(int var10000 = var1; var10000 < var2; var10000 = var1) {
            var10000 = Character.digit(var0.charAt(var1), c);
            ++var1;
            int var10 = var10000;
            if (var10000 < 0 || var3 < var8) {
               throw ac(var0);
            }

            if ((var3 *= (long)c) < var6 + (long)var10) {
               throw ac(var0);
            }

            var3 -= (long)var10;
         }

         if (var5 != 0) {
            return var3;
         } else {
            return -var3;
         }
      } else {
         throw new NumberFormatException("For input string: \"" + var0 + "\"" + " " + var1 + " " + var2);
      }
   }

   public static boolean r(String var0, String var1) {
      if (var0 != null && var0.equals("")) {
         var0 = null;
      }

      if (var1 != null && var1.equals("")) {
         var1 = null;
      }

      if (var0 != null && var1 != null) {
         return var0.equals(var1);
      } else {
         return (boolean)(var0 == null && var1 == null ? 5 >> 2 : 0);
      }
   }

   public static int s(String var0, String var1) {
      if (var0 != null && !var0.equals("")) {
         int var2 = 0;
         int var3 = 3 & 4;

         for(String var10000 = var1; (var3 = var10000.indexOf(var0, var3)) != -4 >> 2; ++var2) {
            ++var3;
            var10000 = var1;
         }

         return var2;
      } else {
         return 0;
      }
   }

   public static void t(StringBuffer var0, double var1) {
      if (var1 == (double)((int)var1)) {
         var0.append((int)var1);
      } else {
         var0.append(var1);
      }
   }

   public static boolean u(String var0) {
      return a.matcher(var0).matches();
   }

   public static boolean v(BigDecimal var0, BigDecimal var1) {
      if (var0 == null && var1 == null) {
         return (boolean)(3 >> 1);
      } else if (var0 != null && var1 != null) {
         return (boolean)(var0.compareTo(var1) == 0 ? --1 : 0);
      } else {
         return false;
      }
   }

   public static String w(String var0, String var1, String var2) {
      int var3;
      if ((var3 = var0.indexOf(var1)) == -4 >> 2) {
         return null;
      } else {
         var3 += var1.length();
         int var4;
         return (var4 = var0.indexOf(var2, var3)) == -4 >> 2 ? null : var0.substring(var3, var4);
      }
   }

   public static Integer x(String var0) {
      if (var0 != null && !var0.equals("")) {
         Integer var6 = null;
         int var4 = 3 & 4;
         int var3 = 5 >> 3;
         int var2 = var0.indexOf("|");
         int var5 = -4 >> 2;

         while(true) {
            int var10;
            label54: {
               String var1 = null;
               if ((var5 = (var3 == 0 && var2 == -4 >> 2 ? (var1 = var0) : (var1 = var0.substring(var3, var2 != -4 >> 2 ? var2 : var0.length()))).indexOf("-")) == -4 >> 2) {
                  ++var4;
                  if (var6 == null || Class27.c.nextInt(var4) == (2 ^ 3)) {
                     var6 = Integer.parseInt(var1);
                     var10 = var2;
                     break label54;
                  }
               } else {
                  Integer var9 = Integer.parseInt(var1.substring(3 ^ 3, var5));
                  Integer var7;
                  if (var7 = Integer.parseInt(var1.substring(var5 + (4 ^ 5))) > var9) {
                     var4 += var7 - var9 + (5 >> 2);
                     int var8;
                     if ((var8 = Class27.c.nextInt(var4)) <= var7 - var9) {
                        var6 = var9 + var8;
                     }
                  }
               }

               var10 = var2;
            }

            if (var10 == -1) {
               return var6;
            }

            var3 = var2 + (3 >> 1);
            var2 = var0.indexOf("|", var3);
         }
      } else {
         return null;
      }
   }

   public static List<Long> y(String var0) {
      ArrayList var1 = new ArrayList();
      if (var0 != null && !var0.equals("")) {
         String[] var2 = var0.split("\\|");

         int var3;
         for(int var10000 = var3 = 3 ^ 3; var10000 < var2.length; var10000 = var3) {
            String[] var10;
            if (var2[var3].indexOf("-") != -4 >> 2) {
               var10 = var2[var3].split("-");
               Integer var8 = Integer.parseInt(var10[2 & 5]);
               Integer var5 = Integer.parseInt(var10[--1]);

               long var9;
               for(long var11 = var9 = (long)var8; var11 <= (long)var5; var11 = var9) {
                  var1.add(var9);
                  ++var9;
               }
            } else if (var2[var3].indexOf("&") != -4 >> 2) {
               var10 = var2[var3].split("&");
               long var4 = Long.parseLong(var10[2 & 5]);
               int var6 = Integer.parseInt(var10[2 ^ 3]);

               int var7;
               for(var10000 = var7 = 3 >> 2; var10000 < var6; var10000 = var7) {
                  ++var7;
                  var1.add(var4);
               }
            } else {
               var1.add(Long.parseLong(var2[var3]));
            }

            ++var3;
         }

         return var1;
      } else {
         return var1;
      }
   }

   public static boolean z(Integer var0, Integer var1) {
      if (var0 != null && var1 != null) {
         return (boolean)(var0 == var1 ? --1 : 0);
      } else {
         return (boolean)(var0 == null && var1 == null ? 3 & 5 : 0);
      }
   }

   public static boolean aa(String var0) {
      return b.matcher(var0).matches();
   }

   public static boolean ab(int[] var0, int var1) {
      int[] var4 = var0;
      int var3 = var0.length;

      int var2;
      for(int var10000 = var2 = 3 >> 2; var10000 < var3; var10000 = var2) {
         if (var4[var2] == var1) {
            return (boolean)(3 & 5);
         }

         ++var2;
      }

      return (boolean)(3 & 4);
   }

   static NumberFormatException ac(String var0) {
      return new NumberFormatException("For input string: \"" + var0 + "\"");
   }


   private static String ad(String var0, String var1, int var2) {
      if (var0 == null) {
         var0 = "";
      }

      if (var1 != null && !var1.equals("")) {
         int var4;
         if ((var4 = var1.indexOf("=")) == -4 >> 2) {
            return var0;
         } else {
            StringBuffer var3 = new StringBuffer();
            String var5 = var1.substring(3 ^ 3, var4 + (3 >> 1));
            double var6 = Double.parseDouble(var1.substring(var4 + --1));
            if (var2 == --3) {
               var6 = -var6;
            }

            if (var0.startsWith(var5)) {
               var3.append(var5);
               if (var0.equals("")) {
                  t(var3, var6);
                  return var3.toString();
               } else {
                  StringBuffer var10000;
                  if ((var4 = var0.indexOf("|")) == -4 >> 2) {
                     t(var3, var2 == --1 ? var6 : var6 + Double.parseDouble(var0.substring(var5.length())));
                     var10000 = var3;
                  } else {
                     t(var3, var2 == (4 ^ 5) ? var6 : var6 + Double.parseDouble(var0.substring(var5.length(), var4)));
                     var10000 = var3;
                     var3.append(var0.substring(var4));
                  }

                  return var10000.toString();
               }
            } else if ((var4 = var0.indexOf("|" + var5)) == -4 >> 2) {
               if (!var0.equals("")) {
                  var3.append(var0);
                  var3.append("|");
               }

               var3.append(var1);
               return var3.toString();
            } else {
               int var8;
               if ((var8 = var0.indexOf("|", var4 + (3 >> 1))) == -4 >> 2) {
                  var3.append(var0.substring(2 & 5, var4));
                  var3.append("|");
                  var3.append(var5);
                  t(var3, var2 == --1 ? var6 : var6 + Double.parseDouble(var0.substring(var4 + var5.length() + (3 >> 1))));
                  return var3.toString();
               } else {
                  var3.append(var0.substring(3 & 4, var4 + var5.length() + --1));
                  t(var3, var2 == 3 >> 1 ? var6 : var6 + Double.parseDouble(var0.substring(var4 + var5.length() + (3 & 5), var8)));
                  var3.append(var0.substring(var8));
                  return var3.toString();
               }
            }
         }
      } else {
         return var0;
      }
   }

   public static List<String> ae(String var0) {
      ArrayList var1 = new ArrayList();
      if (var0 != null && !var0.equals("")) {
         String[] var2 = var0.split("\\|");

         int var3;
         for(int var10000 = var3 = 5 >> 3; var10000 < var2.length; var10000 = var3) {
            if (var2[var3].indexOf("-") != -4 >> 2) {
               String[] var10 = var2[var3].split("-");
               Integer var8 = Integer.parseInt(var10[3 & 4]);
               Integer var9 = Integer.parseInt(var10[3 >> 1]);

               int var7;
               for(var10000 = var7 = var8; var10000 <= var9; var10000 = var7) {
                  var1.add(String.valueOf(var7++));
               }
            } else if (var2[var3].indexOf("&") != -4 >> 2) {
               String[] var4;
               int var5 = Integer.parseInt((var4 = var2[var3].split("&"))[2 ^ 3]);

               int var6;
               for(var10000 = var6 = 3 ^ 3; var10000 < var5; var10000 = var6) {
                  int var10002 = 3 ^ 3;
                  ++var6;
                  var1.add(var4[var10002]);
               }
            } else {
               var1.add(var2[var3]);
            }

            ++var3;
         }

         return var1;
      } else {
         return var1;
      }
   }

   public static String af(String var0, String var1, String var2, String var3) {
      if (var0 != null && !var0.equals("")) {
         StringBuffer var4 = new StringBuffer();
         int var5;
         if (!var0.startsWith(var1)) {
            if ((var5 = var0.indexOf(var2 + var1)) == -4 >> 2) {
               if (var3 == null) {
                  return var0;
               } else {
                  var4.append(var0);
                  var4.append(var2);
                  var4.append(var3);
                  return var4.toString();
               }
            } else {
               String var6;
               if (var3 == null) {
                  var4.append(var0.substring(3 & 4, var5));
                  var5 = (var6 = var0.substring(var5 + var2.length() + var1.length())).indexOf(var2);
                  if (var5 == -4 >> 2) {
                     return var4.toString();
                  } else {
                     var4.append(var6.substring(var5));
                     return var4.toString();
                  }
               } else {
                  var4.append(var0.substring(2 & 5, var5 + var2.length()));
                  var5 = (var6 = var0.substring(var5 + var2.length() + var1.length())).indexOf(var2);
                  if (var5 == -4 >> 2) {
                     var4.append(var3);
                     return var4.toString();
                  } else {
                     var4.append(var3);
                     var4.append(var6.substring(var5));
                     return var4.toString();
                  }
               }
            }
         } else {
            var5 = var0.indexOf(var2);
            StringBuffer var10000;
            if (var3 != null) {
               var4.append(var0.substring(5 >> 3, var1.length() - var1.length()));
               var4.append(var3);
               if (var5 != -4 >> 2) {
                  var10000 = var4;
                  var4.append(var0.substring(var5));
                  return var10000.toString();
               }
            } else if (var5 != -4 >> 2) {
               var4.append(var0.substring(var5 + (5 >> 2)));
            }

            var10000 = var4;
            return var10000.toString();
         }
      } else {
         return var3;
      }
   }

   public static int ag(int[] var0, int var1, int var2) {
      int var3;
      for(int var10000 = var3 = 3 >> 2; var10000 < var0.length; var10000 = var3) {
         if ((var0[var3] & var1) == var2) {
            return var3;
         }

         ++var3;
      }

      return -4 >> 2;
   }

   public static long ah(String var0, int var1, int var2) throws NumberFormatException {
      if (var0 == null) {
         throw new NumberFormatException("null");
      } else if (var1 >= 0 && var2 <= var0.length() && var1 < var2) {
         long var3 = 0L;
         int var5 = 4 ^ 5;
         if (var0.charAt(var1) == (63 & 109)) {
            var5 = 3 ^ 3;
            ++var1;
         }

         --var2;

         for(int var10000 = var2; var10000 >= var1; var10000 = var2) {
            char var6 = var0.charAt(var2);
            var3 *= 62L;
            if (var6 >= (122 & 53) && var6 <= (63 & 121)) {
               var3 += (long)(var6 - (60 & 115));
            } else if (var6 >= (101 & 91) && var6 <= (95 & 122)) {
               var3 += (long)(var6 - (105 & 87) + (78 & 59));
            } else {
               if (var6 < (115 & 109) || var6 > (123 & 126)) {
                  throw ac(var0);
               }

               var3 += (long)(var6 - (101 & 123) + (63 & 100));
            }

            --var2;
         }

         if (var5 != 0) {
            return var3;
         } else {
            return -var3;
         }
      } else {
         throw new NumberFormatException("For input string: \"" + var0 + "\"" + " " + var1 + " " + var2);
      }
   }

   public static String ai(int var0) {
      if (var0 == 0) {
         return "A";
      } else if (var0 == (2 ^ 3)) {
         return "B";
      } else if (var0 == 5 >> 1) {
         return "C";
      } else if (var0 == --3) {
         return "D";
      } else if (var0 == --4) {
         return "E";
      } else if (var0 == --5) {
         return "F";
      } else if (var0 == (6 & 127)) {
         return "G";
      } else if (var0 == (55 & 79)) {
         return "H";
      } else if (var0 == (41 & 94)) {
         return "I";
      } else if (var0 == (43 & 93)) {
         return "J";
      } else if (var0 == (94 & 43)) {
         return "K";
      } else if (var0 == (111 & 27)) {
         return "L";
      } else if (var0 == (62 & 77)) {
         return "M";
      } else if (var0 == (29 & 111)) {
         return "N";
      } else if (var0 == (78 & 63)) {
         return "O";
      } else if (var0 == (127 & 15)) {
         return "P";
      } else if (var0 == (126 & 17)) {
         return "Q";
      } else if (var0 == (85 & 59)) {
         return "R";
      } else if (var0 == (50 & 95)) {
         return "S";
      } else if (var0 == (51 & 95)) {
         return "T";
      } else if (var0 == (116 & 31)) {
         return "U";
      } else if (var0 == (117 & 31)) {
         return "V";
      } else if (var0 == 22) {
         return "W";
      } else if (var0 == 23) {
         return "X";
      } else if (var0 == 24) {
         return "Y";
      } else {
         return var0 == 25 ? "Z" : "A";
      }
   }

   public static int aj(char var0, String var1, int var2, int var3) {
      int var4 = 2 & 5;

      for(String var10000 = var1; (var2 = var10000.indexOf(var0, var2)) != -4 >> 2 && var2 < var3; ++var4) {
         ++var2;
         var10000 = var1;
      }

      return var4;
   }

   public static String ak(double var0, int var2) {
      if (var0 != (double)((int)var0) && var2 > 0) {
         int var3 = var2 + 1;
         String var1;
         return (var2 = (var1 = String.valueOf(var0)).indexOf(".")) != -4 >> 2 && var1.length() - var2 >= var3 ? var1.substring(5 >> 3, var2) + var1.substring(var2, var2 + var3) : var1;
      } else {
         return String.valueOf((int)var0);
      }
   }

   public static String al(long[] var0, int var1, String var2) {
      StringBuffer var3 = new StringBuffer();
      int var4 = 3 & 4;

      for(int var10000 = var1 = var1; var10000 < var0.length; var10000 = var1) {
         if (var0[var1] == 0L) {
            ++var4;
         } else {
            if (var4 != 0) {
               if (var3.length() != 0) {
                  var3.append(var2);
               }

               var3.append(-var4);
               var4 = 3 >> 2;
            }

            if (var3.length() != 0) {
               var3.append(var2);
            }

            var3.append(var0[var1]);
         }

         ++var1;
      }

      return var3.toString();
   }

   public static long[] am(String var0, long var1) {
      String[] var3;
      if (!(var3 = var0.split("\\|"))[2 & 5].equals(String.valueOf(var1))) {
         return null;
      } else {
         long[] var10000 = new long[var3.length];
         boolean var10002 = true;
         long[] var4 = var10000;

         int var2;
         for(int var5 = var2 = 3 & 4; var5 < var4.length; var5 = var2) {
            int var10001 = var2;
            long var6 = Long.parseLong(var3[var2]);
            ++var2;
            var4[var10001] = var6;
         }

         return var4;
      }
   }

   public static int an(String var0, String var1, String var2) {
      return (var0 = d(var0, var1, var2)) != null && !var0.equals("") ? Integer.parseInt(var0) : 0;
   }

   public static List<String> ao(String var0, String var1) {
      ArrayList var4 = new ArrayList();

      int var2;
      int var3;
      for(int var10000 = var3 = -4 >> 2; var10000 != var1.length(); var10000 = var2) {
         ++var3;
         if ((var2 = var1.indexOf(var0, var3)) == -4 >> 2) {
            var2 = var1.length();
         }

         String var5 = var1.substring(var3, var2);
         var4.add(var5);
         var3 = var2;
      }

      return var4;
   }

   public static void main(String[] var0) {
      System.out.println("\n###########################################\n#                                         #\n#      ## #   #    ## ### ### ##  ###     #\n#     # # #   #   # #  #  # # # #  #      #\n#     ### #   #   ###  #  # # ##   #      #\n#     # # ### ### # #  #  ### # # ###     #\n#                                         #\n# Protecting Java applications since 2006 #\n#                                         #\n#      Allatori Obfuscator v9.4 DEMO      #\n#                                         #\n#              DEMO VERSION!              #\n#                                         #\n#         NOT FOR COMMERCIAL USE!         #\n#                                         #\n#          https://allatori.com           #\n#                                         #\n###########################################\n");
      System.out.println(aa("-10.00"));
      System.out.println(i("100.1"));
      System.out.println(0.3999999999999999D);
   }
}
