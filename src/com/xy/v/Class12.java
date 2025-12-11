package com.xy.v;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class Class12 {
   private static final char a = 'A';
   private static Pattern b = Pattern.compile("^-?\\d+$");
   private static Pattern c = Pattern.compile("^[0-9]*$");
   private static final char d = '-';
   static int e = 10;
   private static Pattern f = Pattern.compile("^(?![0-9]+$)(?![a-zA-Z]+$)[0-9A-Za-z]{6,24}$");
   private static final char g = '9';
   private static final char h = 'V';
   private static final char i = '0';

   public static int a(String var0, String var1) {
      if (var0 != null && !var0.equals("")) {
         int var2 = 0;
         int var4 = 0;

         for (String var10000 = var1; (var4 = var10000.indexOf(var0, var4)) != -1; var2++) {
            var4++;
            var10000 = var1;
         }

         return var2;
      } else {
         return 0;
      }
   }

   public static void b(StringBuffer var0, double var1) {
      if (var1 == (int)var1) {
         var0.append((int)var1);
      } else {
         var0.append(var1);
      }
   }

   public static long[] c(String var0, long var1) {
      String var10001 = "\u0016 ";
      String[] var3;
      if (!(var3 = var0.split("\\|"))[0].equals(String.valueOf(var1))) {
         return null;
      } else {
         long[] var4 = new long[var3.length];

         int var5;
         for (int var10000 = var5 = 0; var10000 < var4.length; var10000 = var5) {
            int var6 = var5;
            long var10002 = Long.parseLong(var3[var5]);
            var5++;
            var4[var6] = var10002;
         }

         return var4;
      }
   }

   public static String d(long[] var0, int var1, String var2) {
      StringBuffer var3 = new StringBuffer();
      int var4 = 0;

      int var5;
      for (int var10000 = var5 = var1; var10000 < var0.length; var10000 = ++var5) {
         if (var0[var5] == 0L) {
            var4++;
         } else {
            if (var4 != 0) {
               if (var3.length() != 0) {
                  var3.append(var2);
               }

               var3.append(-var4);
               var4 = 0;
            }

            if (var3.length() != 0) {
               var3.append(var2);
            }

            var3.append(var0[var5]);
         }
      }

      return var3.toString();
   }

   public static String e(double var0, int var2) {
      if (var0 != (int)var0 && var2 > 0) {
         var2++;
         String var3;
         String var10000 = var3 = String.valueOf(var0);
         String var10001 = "r";
         int var4;
         return (var4 = var10000.indexOf(".")) != -1 && var3.length() - var4 >= var2 ? var3.substring(0, var4) + var3.substring(var4, var4 + var2) : var3;
      } else {
         return String.valueOf((int)var0);
      }
   }

   public static int f(String var0, String var1, String var2) {
      String var3;
      return (var3 = ai(var0, var1, var2)) != null && !var3.equals("") ? Integer.parseInt(var3) : 0;
   }

   static NumberFormatException g(String var0) {
      String var10004 = "\u001a%.j5$,?(j/>.#2-fj~";
      StringBuilder var10002 = new StringBuilder("For input string: \"").append(var0);
      String var10003 = "u";
      return new NumberFormatException(var10002.append("\"").toString());
   }

   public static boolean h(String var0) {
      return var0 == null || var0.equals("");
   }

   // $VF: synthetic method
   private static String i(String var0, String var1, int var2) {
      if (var0 == null) {
         var0 = "";
      }

      if (var1 != null && !var1.equals("")) {
         String var10001 = "j";
         int var3;
         if ((var3 = var1.indexOf("=")) == -1) {
            return var0;
         } else {
            StringBuffer var4 = new StringBuffer();
            String var5 = var1.substring(0, var3 + 1);
            double var6 = Double.parseDouble(var1.substring(var3 + 1));
            if (var2 == 3) {
               var6 = -var6;
            }

            if (var0.startsWith(var5)) {
               var4.append(var5);
               if (var0.equals("")) {
                  b(var4, var6);
                  return var4.toString();
               } else {
                  var10001 = " ";
                  StringBuffer var10000;
                  if ((var3 = var0.indexOf("|")) == -1) {
                     b(var4, var2 == 1 ? var6 : var6 + Double.parseDouble(var0.substring(var5.length())));
                     var10000 = var4;
                  } else {
                     b(var4, var2 == 1 ? var6 : var6 + Double.parseDouble(var0.substring(var5.length(), var3)));
                     var10000 = var4;
                     var4.append(var0.substring(var3));
                  }

                  return var10000.toString();
               }
            } else {
               String var10003 = "+";
               if ((var3 = var0.indexOf("|" + var5)) == -1) {
                  if (!var0.equals("")) {
                     var4.append(var0);
                     String var10002 = " ";
                     var4.append("|");
                  }

                  var4.append(var1);
                  return var4.toString();
               } else {
                  var10001 = "+";
                  int var8;
                  if ((var8 = var0.indexOf("|", var3 + 1)) == -1) {
                     var4.append(var0.substring(0, var3));
                     String var10004 = " ";
                     var4.append("|");
                     var4.append(var5);
                     b(var4, var2 == 1 ? var6 : var6 + Double.parseDouble(var0.substring(var3 + var5.length() + 1)));
                     return var4.toString();
                  } else {
                     var4.append(var0.substring(0, var3 + var5.length() + 1));
                     b(var4, var2 == 1 ? var6 : var6 + Double.parseDouble(var0.substring(var3 + var5.length() + 1, var8)));
                     var4.append(var0.substring(var8));
                     return var4.toString();
                  }
               }
            }
         }
      } else {
         return var0;
      }
   }

   public static long j(String var0, int var1, int var2) throws NumberFormatException {
      if (var0 == null) {
         String var11 = "[\"Y;";
         throw new NumberFormatException("null");
      } else if (var1 >= 0 && var2 <= var0.length() && var1 < var2) {
         long var3 = 0L;
         boolean var5 = true;
         if (var0.charAt(var1) == '-') {
            var5 = false;
            var1++;
         }

         for (int var10000 = --var2; var10000 >= var1; var10000 = --var2) {
            char var6 = var0.charAt(var2);
            var3 <<= 5;
            if (var6 >= '0' && var6 <= '9') {
               var3 += var6 - '0';
            } else {
               if (var6 < 'A' || var6 > 'V') {
                  throw g(var0);
               }

               var3 += var6 - 'A' + 10;
            }
         }

         return var5 ? var3 : -var3;
      } else {
         String var10004 = "\u001a%.j5$,?(j/>.#2-fj~";
         StringBuilder var10002 = new StringBuilder("For input string: \"").append(var0);
         String var10003 = "u";
         var10002 = var10002.append("\"");
         var10003 = "|";
         var10002 = var10002.append(" ").append(var1);
         var10003 = "w";
         throw new NumberFormatException(var10002.append(" ").append(var2).toString());
      }
   }

   public static boolean k(int[] var0, int var1) {
      int[] var5 = var0;
      int var4 = var0.length;

      int var3;
      for (int var10000 = var3 = 0; var10000 < var4; var10000 = ++var3) {
         if (var5[var3] == var1) {
            return true;
         }
      }

      return false;
   }

   public static String l(int var0) {
      if (var0 == 0) {
         String var24 = "\u001d";
         return "A";
      } else if (var0 == 1) {
         String var23 = "\u0015";
         return "B";
      } else if (var0 == 2) {
         String var22 = "\u001f";
         return "C";
      } else if (var0 == 3) {
         String var21 = "\u0013";
         return "D";
      } else if (var0 == 4) {
         String var20 = "\u0019";
         return "E";
      } else if (var0 == 5) {
         String var19 = "\u0011";
         return "F";
      } else if (var0 == 6) {
         String var18 = "\u001b";
         return "G";
      } else if (var0 == 7) {
         String var17 = "\u001f";
         return "H";
      } else if (var0 == 8) {
         String var16 = "\u0015";
         return "I";
      } else if (var0 == 9) {
         String var15 = "\u001d";
         return "J";
      } else if (var0 == 10) {
         String var14 = "\u0017";
         return "K";
      } else if (var0 == 11) {
         String var13 = "\u001b";
         return "L";
      } else if (var0 == 12) {
         return "M";
      } else if (var0 == 13) {
         return "N";
      } else if (var0 == 14) {
         String var12 = "\u0013";
         return "O";
      } else if (var0 == 15) {
         String var11 = "\u0007";
         return "P";
      } else if (var0 == 16) {
         String var10 = "\r";
         return "Q";
      } else if (var0 == 17) {
         String var9 = "\u0005";
         return "R";
      } else if (var0 == 18) {
         String var8 = "\u000f";
         return "S";
      } else if (var0 == 19) {
         String var7 = "\u0003";
         return "T";
      } else if (var0 == 20) {
         String var6 = "\t";
         return "U";
      } else if (var0 == 21) {
         String var5 = "\u0001";
         return "V";
      } else if (var0 == 22) {
         String var4 = "\u000b";
         return "W";
      } else if (var0 == 23) {
         String var3 = "\u000f";
         return "X";
      } else if (var0 == 24) {
         String var2 = "\u0005";
         return "Y";
      } else if (var0 == 25) {
         String var1 = "\r";
         return "Z";
      } else {
         String var10000 = "\u001d";
         return "A";
      }
   }

   public static int m(String var0) {
      return ad(var0, 0, var0.length());
   }

   public static long n(int var0, String var1, int var2, String var3) {
      if (var1 != null && !var1.equals("")) {
         int var4 = 0;
         int var5 = 0;
         String var10000 = var1;

         while (true) {
            var4 = var10000.indexOf(var3, var5);
            long var7;
            if ((
                  (var7 = Long.parseLong(var1.substring(var5, var4 != -1 ? var4 : var1.length()))) < 0L
                     ? (var2 = (int)(var2 + -var7))
                     : (var7 == 0L ? ++var2 : ++var2)
               )
               >= var0) {
               if (var7 > 0L) {
                  return var7;
               }

               return 0L;
            }

            if (var4 == -1) {
               return 0L;
            }

            var5 = var4 + 1;
            var10000 = var1;
         }
      } else {
         return 0L;
      }
   }

   public static long o(String var0, String var1, String var2) {
      String var3;
      return (var3 = ai(var0, var1, var2)) != null && !var3.equals("") ? Long.parseLong(var3) : 0L;
   }

   public static String p(String var0, String var1, int var2) {
      if (var2 != 2 && var2 != 3) {
         boolean var3 = true;
         boolean var4 = false;
         if (var2 == 2 || var2 == 3 || var2 == 5) {
            var4 = true;
         }

         ArrayList var5 = new ArrayList();
         if (var0 == null) {
            var0 = "";
         }

         String var10001 = "i+";
         String[] var6 = var0.split("\\|");

         int var7;
         for (int var10000 = var7 = 0; var10000 < var6.length; var10000 = ++var7) {
            if (var2 == 0) {
               if (!var6[var7].equals(var1)) {
                  var5.add(var6[var7]);
               } else {
                  var3 = false;
               }
            } else {
               String var22 = var6[var7];
               var10001 = "a";
               String[] var8 = var22.split("=");
               var10001 = "j";
               String[] var9 = var1.split("=");
               if (var8[0].equals(var9[0])) {
                  if (var2 == 1) {
                     var5.add(var1);
                  } else if (var2 == 2) {
                     var4 = false;
                     double var10 = Double.parseDouble(var8[1]);
                     double var12 = Double.parseDouble(var9[1]);
                     if ((var10 = var10 + var12) % 1.0 == 0.0) {
                        StringBuilder var26 = new StringBuilder(String.valueOf(var8[0]));
                        String var10002 = "a";
                        var5.add(var26.append("=").append((int)var10).toString());
                     } else {
                        StringBuilder var27 = new StringBuilder(String.valueOf(var8[0]));
                        String var32 = "j";
                        var5.add(var27.append("=").append(var10).toString());
                     }
                  } else if (var2 == 3) {
                     var4 = false;
                     double var17 = Double.parseDouble(var8[1]);
                     double var20 = Double.parseDouble(var9[1]);
                     if ((var17 = var17 - var20) % 1.0 == 0.0) {
                        StringBuilder var28 = new StringBuilder(String.valueOf(var8[0]));
                        String var33 = "a";
                        var5.add(var28.append("=").append((int)var17).toString());
                     } else {
                        StringBuilder var29 = new StringBuilder(String.valueOf(var8[0]));
                        String var34 = "j";
                        var5.add(var29.append("=").append(var17).toString());
                     }
                  } else if (var2 == 5) {
                     var4 = false;
                     double var19 = Double.parseDouble(var8[1]);
                     double var21;
                     if ((var21 = Double.parseDouble(var9[1])) > var19) {
                        var19 = var21;
                     }

                     if (var19 % 1.0 == 0.0) {
                        StringBuilder var30 = new StringBuilder(String.valueOf(var8[0]));
                        String var35 = "a";
                        var5.add(var30.append("=").append((int)var19).toString());
                     } else {
                        StringBuilder var31 = new StringBuilder(String.valueOf(var8[0]));
                        String var36 = "j";
                        var5.add(var31.append("=").append(var19).toString());
                     }
                  }
               } else {
                  var5.add(var6[var7]);
               }
            }
         }

         if (var3 && var2 == 0) {
            var5.add(var1);
         }

         if (var4) {
            var5.add(var1);
         }

         StringBuffer var14 = new StringBuffer();

         int var15;
         for (int var23 = var15 = 0; var23 < var5.size(); var23 = ++var15) {
            if (!var14.toString().equals("")) {
               String var10003 = " ";
               var14.append("|" + var5.get(var15));
            } else {
               var14.append((String)var5.get(var15));
            }
         }

         return var14.toString();
      } else {
         return i(var0, var1, var2);
      }
   }

   public static int q(int[] var0, int var1, int var2) {
      int var3;
      for (int var10000 = var3 = 0; var10000 < var0.length; var10000 = ++var3) {
         if ((var0[var3] & var1) == var2) {
            return var3;
         }
      }

      return -1;
   }

   public static String r(String var0, String var1, String var2, String var3) {
      if (var0 != null && !var0.equals("")) {
         StringBuffer var4 = new StringBuffer();
         if (!var0.startsWith(var1)) {
            int var7;
            if ((var7 = var0.indexOf(var2 + var1)) == -1) {
               if (var3 == null) {
                  return var0;
               } else {
                  var4.append(var0);
                  var4.append(var2);
                  var4.append(var3);
                  return var4.toString();
               }
            } else if (var3 == null) {
               var4.append(var0.substring(0, var7));
               String var10;
               var7 = (var10 = var0.substring(var7 + var2.length() + var1.length())).indexOf(var2);
               if (var7 == -1) {
                  return var4.toString();
               } else {
                  var4.append(var10.substring(var7));
                  return var4.toString();
               }
            } else {
               var4.append(var0.substring(0, var7 + var2.length()));
               String var6;
               var7 = (var6 = var0.substring(var7 + var2.length() + var1.length())).indexOf(var2);
               if (var7 == -1) {
                  var4.append(var3);
                  return var4.toString();
               } else {
                  var4.append(var3);
                  var4.append(var6.substring(var7));
                  return var4.toString();
               }
            }
         } else {
            int var5 = var0.indexOf(var2);
            if (var3 != null) {
               var4.append(var0.substring(0, var1.length() - var1.length()));
               var4.append(var3);
               if (var5 != -1) {
                  var4.append(var0.substring(var5));
                  return var4.toString();
               }
            } else if (var5 != -1) {
               var4.append(var0.substring(var5 + 1));
            }

            return var4.toString();
         }
      } else {
         return var3;
      }
   }

   public static long s(String var0, int var1, int var2) throws NumberFormatException {
      if (var0 == null) {
         String var16 = "$)&0";
         throw new NumberFormatException("null");
      } else if (var1 >= 0 && var2 <= var0.length() && var1 < var2) {
         long var3 = 0L;
         boolean var5 = false;
         long var6 = -9223372036854775807L;
         char var11;
         if ((var11 = var0.charAt(var1)) < '0') {
            if (var11 == '-') {
               var5 = true;
               var6 = Long.MIN_VALUE;
            } else if (var11 != '+') {
               throw g(var0);
            }

            if (++var1 == var2) {
               throw g(var0);
            }
         }

         long var8 = var6 / e;

         for (int var10000 = var1; var10000 < var2; var10000 = var1) {
            var10000 = Character.digit(var0.charAt(var1), e);
            var1++;
            int var10 = var10000;
            if (var10000 < 0 || var3 < var8) {
               throw g(var0);
            }

            if ((var3 = var3 * e) < var6 + var10) {
               throw g(var0);
            }

            var3 -= var10;
         }

         return var5 ? var3 : -var3;
      } else {
         String var10004 = "\u0011Z%\u0015>['@#\u0015$A%\\9Rm\u0015u";
         StringBuilder var10002 = new StringBuilder("For input string: \"").append(var0);
         String var10003 = "~";
         var10002 = var10002.append("\"");
         var10003 = "w";
         var10002 = var10002.append(" ").append(var1);
         var10003 = "|";
         throw new NumberFormatException(var10002.append(" ").append(var2).toString());
      }
   }

   public static int t(int var0) {
      if (var0 < 10) {
         return 1;
      } else if (var0 < 100) {
         return 2;
      } else if (var0 < 1000) {
         return 3;
      } else if (var0 < 10000) {
         return 4;
      } else if (var0 < 100000) {
         return 5;
      } else if (var0 < 1000000) {
         return 6;
      } else if (var0 < 10000000) {
         return 7;
      } else if (var0 < 100000000) {
         return 8;
      } else {
         return var0 < 1000000000 ? 9 : 10;
      }
   }

   public static boolean u(String var0) {
      return var0 != null && !var0.equals("") ? c.matcher(var0).matches() : false;
   }

   public static List<Long> v(String var0) {
      ArrayList var1 = new ArrayList();
      if (var0 != null && !var0.equals("")) {
         String var10001 = "\u0016 ";
         String[] var2 = var0.split("\\|");

         int var3;
         for (int var10000 = var3 = 0; var10000 < var2.length; var10000 = ++var3) {
            String var11 = var2[var3];
            var10001 = "z";
            if (var11.indexOf("-") != -1) {
               String var16 = var2[var3];
               var10001 = "q";
               String[] var17 = var16.split("-");
               Integer var9 = Integer.parseInt(var17[0]);
               Integer var6 = Integer.parseInt(var17[1]);

               long var10;
               for (long var18 = var10 = var9.intValue(); var18 <= var6.intValue(); var18 = ++var10) {
                  var1.add(var10);
               }
            } else {
               String var12 = var2[var3];
               var10001 = "q";
               if (var12.indexOf("&") != -1) {
                  String var13 = var2[var3];
                  var10001 = "z";
                  String[] var14 = var13.split("&");
                  long var5 = Long.parseLong(var14[0]);
                  int var7 = Integer.parseInt(var14[1]);

                  int var8;
                  for (int var15 = var8 = 0; var15 < var7; var15 = var8) {
                     var8++;
                     var1.add(var5);
                  }
               } else {
                  var1.add(Long.parseLong(var2[var3]));
               }
            }
         }

         return var1;
      } else {
         return var1;
      }
   }

   public static Integer w(String var0) {
      if (var0 != null && !var0.equals("")) {
         Integer var1 = null;
         int var2 = 0;
         int var3 = 0;
         String var10001 = "+";
         int var4 = var0.indexOf("|");
         int var5 = -1;

         while (true) {
            int var12;
            label45: {
               String var6;
               String var10000 = (String)(var3 == 0 && var4 == -1 ? (var6 = var0) : (var6 = var0.substring(var3, var4 != -1 ? var4 : var0.length())));
               var10001 = "q";
               if ((var5 = var10000.indexOf("-")) == -1) {
                  if (var1 == null || Class0.a.nextInt(++var2) == 1) {
                     var1 = Integer.parseInt((String)var6);
                     var12 = var4;
                     break label45;
                  }
               } else {
                  Integer var7 = Integer.parseInt(var6.substring(0, var5));
                  Integer var8;
                  if ((var8 = Integer.parseInt(var6.substring(var5 + 1))) > var7) {
                     var2 += var8 - var7 + 1;
                     int var9;
                     if ((var9 = Class0.a.nextInt(var2)) <= var8 - var7) {
                        var1 = var7 + var9;
                     }
                  }
               }

               var12 = var4;
            }

            if (var12 == -1) {
               return var1;
            }

            var3 = var4 + 1;
            var10001 = "+";
            var4 = var0.indexOf("|", var3);
         }
      } else {
         return null;
      }
   }

   public static boolean x(BigDecimal var0, BigDecimal var1) {
      if (var0 == null && var1 == null) {
         return true;
      } else {
         return var0 == null || var1 == null ? false : var0.compareTo(var1) == 0;
      }
   }

   public static long[] y(long[] var0, String var1, int var2, String var3) {
      if (var1 != null && !var1.equals("")) {
         int var4 = 0;
         int var5 = 0;
         String var10000 = var1;

         while (true) {
            var4 = var10000.indexOf(var3, var5);
            long var7;
            int var10;
            if ((var7 = Long.parseLong(var1.substring(var5, var4 != -1 ? var4 : var1.length()))) < 0L) {
               var2 = (int)(var2 + -var7);
               var10 = var4;
            } else if (var7 == 0L) {
               var10 = var4;
               var2++;
            } else {
               var0[var2++] = var7;
               var10 = var4;
            }

            if (var10 == -1) {
               return var0;
            }

            if (var2 >= var0.length) {
               return var0;
            }

            var5 = var4 + 1;
            var10000 = var1;
         }
      } else {
         return var0;
      }
   }

   public static boolean z(Integer var0, Integer var1) {
      return var0 != null && var1 != null ? var0 == var1 : var0 == null && var1 == null;
   }

   public static boolean aa(String var0) {
      return b.matcher(var0).matches();
   }

   static {
      String var10000 = "k\f\u0005z\f\n\u001fs";
      var10000 = "\u0002gc\u00168ax";
      var10000 = "k\u007f\nvng\u0018nh|\u0011~\u001dh\u0014\fTzO\u0016\u0018\rh|\u0011~ng\u0018ntzo6\u0018-h,\u0003{\u0007cHs";
   }

   public static boolean ab(String var0) {
      return f.matcher(var0).matches();
   }

   public static int ac(char var0, String var1) {
      return al(var0, var1, 0, var1.length());
   }

   public static int ad(String var0, int var1, int var2) throws NumberFormatException {
      if (var0 == null) {
         String var13 = "[\"Y;";
         throw new NumberFormatException("null");
      } else if (var1 >= 0 && var2 <= var0.length() && var1 < var2) {
         int var3 = 0;
         boolean var4 = false;
         int var5 = -2147483647;
         char var8;
         if ((var8 = var0.charAt(var1)) < '0') {
            if (var8 == '-') {
               var4 = true;
               var5 = Integer.MIN_VALUE;
            } else if (var8 != '+') {
               throw g(var0);
            }

            if (++var1 == var2) {
               throw g(var0);
            }
         }

         int var6 = var5 / e;

         for (int var10000 = var1; var10000 < var2; var10000 = var1) {
            var10000 = Character.digit(var0.charAt(var1), e);
            var1++;
            int var7 = var10000;
            if (var10000 < 0 || var3 < var6) {
               throw g(var0);
            }

            if ((var3 = var3 * e) < var5 + var7) {
               throw g(var0);
            }

            var3 -= var7;
         }

         return var4 ? var3 : -var3;
      } else {
         String var10004 = "\u001a%.j5$,?(j/>.#2-fj~";
         StringBuilder var10002 = new StringBuilder("For input string: \"").append(var0);
         String var10003 = "u";
         var10002 = var10002.append("\"");
         var10003 = "|";
         var10002 = var10002.append(" ").append(var1);
         var10003 = "w";
         throw new NumberFormatException(var10002.append(" ").append(var2).toString());
      }
   }

   public static List<Integer> ae(String var0) {
      ArrayList var1 = new ArrayList();
      if (var0 != null && !var0.equals("")) {
         String var10001 = "i+";
         String[] var2 = var0.split("\\|");

         int var3;
         for (int var10000 = var3 = 0; var10000 < var2.length; var10000 = ++var3) {
            String var11 = var2[var3];
            var10001 = "q";
            if (var11.indexOf("-") != -1) {
               String var16 = var2[var3];
               var10001 = "z";
               String[] var17 = var16.split("-");
               Integer var8 = Integer.parseInt(var17[0]);
               Integer var9 = Integer.parseInt(var17[1]);

               int var10;
               for (int var18 = var10 = var8; var18 <= var9; var18 = var10) {
                  var1.add(var10++);
               }
            } else {
               String var12 = var2[var3];
               var10001 = "z";
               if (var12.indexOf("&") != -1) {
                  String var13 = var2[var3];
                  var10001 = "q";
                  String[] var14 = var13.split("&");
                  int var5 = Integer.parseInt(var14[0]);
                  int var6 = Integer.parseInt(var14[1]);

                  int var7;
                  for (int var15 = var7 = 0; var15 < var6; var15 = var7) {
                     var7++;
                     var1.add(var5);
                  }
               } else {
                  var1.add(Integer.parseInt(var2[var3]));
               }
            }
         }

         return var1;
      } else {
         return var1;
      }
   }

   public static void af(long var0, StringBuffer var2) throws NumberFormatException {
      if (var0 < 0L) {
         var2.append('-');
         var0 = -var0;
      }

      long var3 = 1L;
      long var10000 = var0;

      while (true) {
         var3 = var10000 % 32L;
         var2.append((char)(var3 >= 10L ? 65L + (var3 - 10L) : 48L + var3));
         if (var0 < 32L) {
            return;
         }

         var10000 = var0 /= 32L;
      }
   }

   public static long ag(String var0) {
      return s(var0, 0, var0.length());
   }

   public static List<String> ah(String var0, String var1) {
      ArrayList var2 = new ArrayList();
      int var3;
      int var10000 = var3 = -1;

      while (var10000 != var1.length()) {
         int var4;
         if ((var4 = var1.indexOf(var0, ++var3)) == -1) {
            var4 = var1.length();
         }

         String var5 = var1.substring(var3, var4);
         var2.add(var5);
         var3 = var4;
         var10000 = var4;
      }

      return var2;
   }

   public static String ai(String var0, String var1, String var2) {
      if (var0 == null || var0.equals("")) {
         return null;
      } else if (var0.startsWith(var1)) {
         int var6 = var0.indexOf(var2);
         return var0.substring(var1.length(), var6 != -1 ? var6 : var0.length());
      } else {
         int var3;
         if ((var3 = var0.indexOf(var2 + var1)) == -1) {
            return null;
         } else {
            String var4;
            int var5;
            return (var5 = (var4 = var0.substring(var3 + var2.length() + var1.length())).indexOf(var2)) == -1 ? var4 : var4.substring(0, var5);
         }
      }
   }

   public static String aj(String var0, String var1, String var2) {
      int var3;
      if ((var3 = var0.indexOf(var1)) == -1) {
         return null;
      } else {
         var3 += var1.length();
         int var4;
         return (var4 = var0.indexOf(var2, var3)) == -1 ? null : var0.substring(var3, var4);
      }
   }

   public static List<String> ak(String var0) {
      ArrayList var1 = new ArrayList();
      if (var0 != null && !var0.equals("")) {
         String var10001 = "i+";
         String[] var2 = var0.split("\\|");

         int var3;
         for (int var10000 = var3 = 0; var10000 < var2.length; var10000 = ++var3) {
            String var10 = var2[var3];
            var10001 = "q";
            if (var10.indexOf("-") != -1) {
               String var14 = var2[var3];
               var10001 = "z";
               String[] var15 = var14.split("-");
               Integer var8 = Integer.parseInt(var15[0]);
               Integer var9 = Integer.parseInt(var15[1]);

               int var7;
               for (int var16 = var7 = var8; var16 <= var9; var16 = var7) {
                  var1.add(String.valueOf(var7++));
               }
            } else {
               String var11 = var2[var3];
               var10001 = "z";
               if (var11.indexOf("&") != -1) {
                  String var12 = var2[var3];
                  var10001 = "q";
                  String[] var4;
                  int var5 = Integer.parseInt((var4 = var12.split("&"))[1]);

                  int var6;
                  for (int var13 = var6 = 0; var13 < var5; var13 = var6) {
                     var6++;
                     var1.add(var4[0]);
                  }
               } else {
                  var1.add(var2[var3]);
               }
            }
         }

         return var1;
      } else {
         return var1;
      }
   }

   public static void main(String[] var0) {
      String var10001 = "Vi\u007fi\u007fi\u007fi\u007fi\u007fi\u007fi\u007fi\u007fi\u007fi\u007fi\u007fi\u007fi\u007fi\u007fi\u007fi\u007fi\u007fi\u007fi\u007fi\u007fi\u007fi\u007fi\u007fi\u007f@\u007fj|j|j|j|j|j|j|j|j|j|j|j|j|j|j|j|j|j|j|j|j|j|j|iVi|j|j|j|j\u007fi|i|j|i|j|j\u007fi|i\u007fi|i\u007fi|i\u007fj|i\u007fi|j|j|j|j\u007f@\u007fj|j|j|j\u007fj\u007fj\u007fj|j\u007fj|j\u007fj\u007fj|i|j\u007fj\u007fj\u007fj\u007fj|i|j|j|j|j|iVi|j|j|j|i\u007fi|i|j|i|j|i\u007fi|j\u007fj|i|i|i\u007fj|j\u007fj|j|j|j|j\u007f@\u007fj|j|j|j\u007fj\u007fj\u007fi\u007fj\u007fi\u007fj\u007fj\u007fj|i|j\u007fi\u007fj\u007fj\u007fj\u007fi\u007fj|j|j|j|iVi|j|j|j|j|j|j|j|j|j|j|j|j|j|j|j|j|j|j|j|j|j|j|j\u007f@\u007fj\u0013(:?/)=>5%2j>3|\u000b0&=>385j\u0013(:?/)=>38|<kdkj\u0018\u000f\u0011\u0005|iVi|j|j|j|j|j|j|j|j|j|j|j|j|j|j|j|j|j|j|j|j|j|j|j\u007f@\u007fj|j|j|j|j|j4>(:fes=+=r+0&=>385d?%1j|j|j|j|j|j|iVi|j|j|j|j|j|j|j|j|j|j|j|j|j|j|j|j|j|j|j|j|j|j|j\u007f@\u007fi\u007fi\u007fi\u007fi\u007fi\u007fi\u007fi\u007fi\u007fi\u007fi\u007fi\u007fi\u007fi\u007fi\u007fi\u007fi\u007fi\u007fi\u007fi\u007fi\u007fi\u007fi\u007fi\u007fiV";
      System.out
         .println(
            "\n################################################\n#                                              #\n#        ## #   #    ## ### ### ##  ###        #\n#       # # #   #   # #  #  # # # #  #         #\n#       ### #   #   ###  #  # # ##   #         #\n#       # # ### ### # #  #  ### # # ###        #\n#                                              #\n# Obfuscation by Allatori Obfuscator v7.7 DEMO #\n#                                              #\n#           http://www.allatori.com            #\n#                                              #\n################################################\n"
         );
      var10001 = "\u0018f\u0005y\u0005g";
      System.out.println(aa("-10.00"));
      var10001 = "mzldm";
      System.out.println(u("100.1"));
      System.out.println(0.3999999999999999);
   }

   public static int al(char var0, String var1, int var2, int var3) {
      int var4 = 0;

      for (String var10000 = var1; (var2 = var10000.indexOf(var0, var2)) != -1 && var2 < var3; var4++) {
         var2++;
         var10000 = var1;
      }

      return var4;
   }

   public static boolean am(String var0, String var1) {
      if (var0 != null && var0.equals("")) {
         var0 = null;
      }

      if (var1 != null && var1.equals("")) {
         var1 = null;
      }

      return var0 != null && var1 != null ? var0.equals(var1) : var0 == null && var1 == null;
   }
}
