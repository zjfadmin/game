package com.xy.formula;

import com.xy.el;
import com.xy.readbean.Goodstable;
import java.util.List;

public class GoodType {
   static List<String> strings;
   public static String[] Extras;

   public static boolean a(long var0) {
      return var0 == 605L || var0 == 604L || var0 == 6700L || var0 == 6701L || var0 == 7000L;
   }

   public static boolean b(long var0) {
      return (boolean)(var0 == 611L ? 3 >> 1 : 0);
   }

   public static boolean c(long var0) {
      return var0 == 800L || var0 >= 600L && var0 <= 605L;
   }

   public static boolean d(long var0) {
      return (boolean)(!n(var0) && !aw(var0) && !s(var0) && !a(var0) && !aj(var0) ? 3 & 4 : 1);
   }

   public static boolean e(Goodstable var0) {
      if (var0.getGoodlock() != (2 ^ 3) && !w(var0.getQuality())) {
         if (ai(var0.getType()) != -4 >> 2) {
            if (getExtra(var0.getValue(), Extras[--3]) != null) {
               return (boolean)(5 >> 2);
            }

            if (getExtra(var0.getValue(), Extras[--4]) != null) {
               return (boolean)(--1);
            }
         }

         return false;
      } else {
         return true;
      }
   }

   public static String[] f(String var0) {
      return var0.split("\\|");
   }

   public static boolean g(long var0) {
      return var0 == 7503L || var0 == 7504L || var0 == 7505L || var0 == 7506L || var0 == 7507L || var0 == 7508L || var0 == 7509L;
   }

   public static boolean h(long var0) {
      return (boolean)(var0 == 612L ? 5 >> 2 : 0);
   }

   public static boolean i(long var0) {
      return (boolean)(!aw(var0) && !s(var0) && !a(var0) && !ar(var0) && !aq(var0) && !af(var0) && !z(var0) && !l(var0) ? 2 & 5 : 1);
   }

   public static String getExtra(String var0, String var1) {
      String[] var2 = var0.split("\\|");

      int var3;
      for(int var10000 = var3 = 2 & 5; var10000 < var2.length; var10000 = var3) {
         if (var2[var3].length() >= --4 && var2[var3].substring(3 >> 2, --4).equals(var1)) {
            return var2[var3];
         }

         ++var3;
      }

      return null;
   }

   public static boolean j(long var0) {
      return (boolean)(var0 == 500L ? 3 & 5 : 0);
   }

   public static boolean k(int var0, long var1) {
      if (var0 == 0) {
         return (boolean)(var1 != 746L && var1 != 755L && var1 != 767L ? 3 & 4 : 1);
      } else if (var0 == 3 >> 1) {
         return (boolean)(var1 != 749L && var1 != 761L ? 3 >> 2 : 1);
      } else if (var0 == 5 >> 1) {
         return (boolean)(var1 != 749L && var1 != 764L ? 3 >> 2 : 1);
      } else if (var0 == --3) {
         return (boolean)(var1 != 761L && var1 != 764L ? 3 & 4 : 1);
      } else if (var0 == --5) {
         return (boolean)(var1 != 752L && var1 != 758L ? 3 >> 2 : 1);
      } else {
         return false;
      }
   }

   static {
      String[] var10000 = new String[79 & 58];
      boolean var10002 = true;
      var10000[5 >> 3] = "炼化属性";
      var10000[--1] = "炼器属性";
      var10000[--2] = "神兵属性";
      var10000[--3] = "套装属性";
      var10000[--4] = "宝石属性";
      var10000[--5] = "觉醒技";
      var10000[119 & 14] = "五行属性";
      var10000[119 & 15] = "星阵属性";
      var10000[44 & 91] = "点粹属性";
      var10000[15 & 121] = "石头属性";
      Extras = var10000;
      strings = el.a("0-1|8|49-52|88|99|100|105|107|111|112|116-120|123-127|131-138|151|189|190|191|193|212|214|492-505|507|508|513-515|521-524|555|559|560|715|716|721|811|813|814|901-910|2040-2043|2053|2070-2079|2080|2113-2116|7005|7010|801-802|1002|1003|1005|1006|1008|2323|2324|2525|728|556|557|889|891|744|8889-8893|60003|7500-7502|7511|5001-5006|777|778|788|8902|8903");
   }

   public static boolean l(long var0) {
      return (boolean)(var0 == 606L ? 5 >> 2 : 0);
   }

   public static boolean m(long var0) {
      return (boolean)(!ar(var0) && !aq(var0) && !af(var0) && !z(var0) && !l(var0) ? 3 >> 2 : 1);
   }

   public static boolean n(long var0) {
      return var0 == 800L || var0 == 6500L || var0 == 7004L;
   }

   public static String o(String[] var0, int var1, String var2) {
      StringBuffer var3 = new StringBuffer();

      int var4;
      for(int var10000 = var4 = 5 >> 3; var10000 < var0.length; var10000 = var4) {
         if (var0[var4].startsWith(Extras[var1])) {
            if (var2 != null && !var2.equals("")) {
               if (var4 != 0) {
                  var3.append("|");
               }

               var3.append(var2);
               var2 = null;
            }
         } else {
            if (var4 != 0) {
               var3.append("|");
            }

            var3.append(var0[var4]);
         }

         ++var4;
      }

      if (var2 != null) {
         var3.append("|");
         var3.append(var2);
      }

      return var3.toString();
   }

   public static String p(int var0) {
      String var1 = null;
      switch(var0) {
      case 0:
         while(false) {
         }

         var1 = "武器";
         return "武器";
      case 1:
         var1 = "帽子";
         return "帽子";
      case 2:
         var1 = "项链";
         return "项链";
      case 3:
         var1 = "衣服";
         return "衣服";
      case 4:
         var1 = "护身符";
         return "护身符";
      case 5:
         var1 = "鞋子";
         return "鞋子";
      case 6:
         var1 = "面具";
         return "面具";
      case 7:
         var1 = "腰带";
         return "腰带";
      case 8:
         var1 = "披风";
         return "披风";
      case 9:
         var1 = "挂件";
         return "挂件";
      case 10:
      case 11:
         var1 = "戒指";
      default:
         return var1;
      case 12:
         var1 = "翅膀";
         return "翅膀";
      }
   }

   public static boolean q(long var0) {
      return var0 == 0L || var0 == 1L;
   }

   public static boolean r(long var0) {
      return var0 == 498L || var0 == 497L || var0 == 513L || var0 == 514L || var0 == 515L;
   }

   public static boolean s(long var0) {
      return var0 == 603L || var0 == 7002L || var0 == 6800L;
   }

   public static boolean t(long var0) {
      return var0 == 493L || var0 == 492L;
   }

   public static int u(long var0) {
      if (var0 == 123L) {
         return 3 & 4;
      } else if (var0 == 124L) {
         return 1 ^ 3;
      } else if (var0 == 125L) {
         return --5;
      } else if (var0 == 126L) {
         return --1;
      } else {
         return var0 == 127L ? --3 : -1;
      }
   }

   public static boolean v(long var0) {
      return (boolean)(var0 >= 7500L && var0 <= 7550L ? 2 ^ 3 : 0);
   }

   public static boolean w(long var0) {
      return (boolean)(var0 != 1L && var0 != 3L && var0 != 5L ? 2 & 5 : 1);
   }

   public static boolean x(long var0) {
      return var0 == 888L || var0 == 100L || var0 == 715L || var0 == 2041L || var0 == 2040L || var0 == 2042L;
   }

   public static int y(int var0, long var1) {
      if (var0 == 0) {
         if (var1 == 746L) {
            return 2 ^ 3;
         }

         if (var1 == 767L) {
            return --2;
         }

         if (var1 == 755L) {
            return --3;
         }
      } else if (var0 == (3 & 5)) {
         if (var1 == 761L) {
            return 3 & 5;
         }

         if (var1 == 749L) {
            return 5 >> 1;
         }
      } else if (var0 == (1 ^ 3)) {
         if (var1 == 764L) {
            return 3 & 5;
         }

         if (var1 == 749L) {
            return 5 >> 1;
         }
      } else if (var0 == --3) {
         if (var1 == 761L) {
            return 4 ^ 5;
         }

         if (var1 == 764L) {
            return 1 ^ 3;
         }
      } else if (var0 == --5) {
         if (var1 == 758L) {
            return 4 ^ 5;
         }

         if (var1 == 752L) {
            return --2;
         }
      }

      return 0;
   }

   public static boolean z(long var0) {
      return (boolean)(var0 == 607L ? 3 >> 1 : 0);
   }

   public static int getPetGoodType(Long var0) {
      if (var0 == 510L) {
         return 3 >> 2;
      } else if (var0 == 511L) {
         return 2 ^ 3;
      } else if (var0 == 512L) {
         return --2;
      } else {
         return var0 == 729L ? --3 : 4;
      }
   }

   public static boolean aa(long var0) {
      return var0 == 6500L || var0 == 6900L || var0 == 6601L || var0 == 6600L || var0 == 6701L || var0 == 6700L || var0 == 6900L || var0 == 6800L;
   }

   public static boolean ab(long var0) {
      return (boolean)(var0 != 746L && var0 != 749L && var0 != 752L && var0 != 755L && var0 != 758L && var0 != 761L && var0 != 764L && var0 != 767L ? 3 & 4 : 1);
   }

   public static boolean ac(long var0) {
      return var0 == 510L || var0 == 511L || var0 == 512L;
   }

   public static boolean ad(long var0) {
      return (boolean)(var0 == 120L ? --1 : 0);
   }

   public static boolean ae(long var0) {
      return var0 == 494L || var0 == 495L || var0 == 496L;
   }

   public static boolean af(long var0) {
      return (boolean)(var0 == 610L ? 5 >> 2 : 0);
   }

   public static boolean ag(Long var0) {
      return strings.contains(var0.toString());
   }

   public static boolean ah(long var0) {
      return var0 >= 702L && var0 <= 711L || var0 == 722L || var0 == 723L;
   }

   public static int ai(long var0) {
      if (n(var0)) {
         return 3 ^ 3;
      } else if (aw(var0)) {
         return 4 ^ 5;
      } else if (s(var0)) {
         return 5 >> 1;
      } else if (a(var0)) {
         return --3;
      } else if (!b(var0) && !h(var0)) {
         if (aj(var0)) {
            return --5;
         } else if (ar(var0)) {
            return 102 & 31;
         } else if (aq(var0)) {
            return 103 & 31;
         } else if (af(var0)) {
            return 94 & 41;
         } else if (z(var0)) {
            return 31 & 105;
         } else {
            return l(var0) ? 58 & 79 : -1;
         }
      } else {
         return 4;
      }
   }

   public static boolean aj(long var0) {
      return var0 == 602L || var0 == 6900L || var0 == 7003L;
   }

   public static boolean ak(long var0) {
      return (boolean)(var0 == 7005L ? 5 >> 2 : 0);
   }

   public static boolean al(long var0) {
      return var0 == 100L || var0 == 8L || var0 == 49L || var0 == 88L || var0 == 99L || var0 == 111L || var0 == 113L || var0 == 212L || var0 == 213L || var0 == 501L || var0 == 502L || var0 == 503L || var0 == 504L || var0 == 716L || var0 == 717L || var0 == 718L || var0 == 719L || var0 == 720L || var0 == 721L || var0 == 7005L || var0 == 118L || var0 == 190L || var0 == 1003L || var0 == 1L || var0 == 559L || var0 == 555L || var0 == 560L || var0 == 559L || var0 == 2525L || var0 == 60005L;
   }

   public static boolean am(long var0) {
      if (ar(var0)) {
         return (boolean)(--1);
      } else if (aq(var0)) {
         return (boolean)(3 >> 1);
      } else if (af(var0)) {
         return (boolean)(5 >> 2);
      } else if (z(var0)) {
         return (boolean)(5 >> 2);
      } else if (l(var0)) {
         return (boolean)(--1);
      } else {
         return (boolean)(b(var0) ? --1 : 0);
      }
   }

   public static boolean an(long var0) {
      return (boolean)(var0 >= 7000L && var0 <= 7004L ? 3 >> 1 : 0);
   }

   public static int[] ao(String var0) {
      int[] var10000 = new int[--4];
      boolean var10002 = true;
      int[] var1 = var10000;
      String[] var2 = var0.split("\\|");

      int var3;
      for(int var4 = var3 = 5 >> 3; var4 < var2.length; var4 = var3) {
         if (var2[var3].split("=").length >= --2) {
            if (var2[var3].split("=")[3 >> 2].equals("HP")) {
               var1[3 >> 2] = Integer.parseInt(var2[var3].split("=")[5 >> 2]);
            } else if (var2[var3].split("=")[3 & 4].equals("MP")) {
               var1[5 >> 2] = Integer.parseInt(var2[var3].split("=")[5 >> 2]);
            } else if (var2[var3].split("=")[3 >> 2].equals("HP%")) {
               var1[1 ^ 3] = Integer.parseInt(var2[var3].split("=")[4 ^ 5]);
            } else if (var2[var3].split("=")[3 >> 2].equals("MP%")) {
               var1[--3] = Integer.parseInt(var2[var3].split("=")[3 >> 1]);
            }
         }

         ++var3;
      }

      return var1;
   }

   public static boolean ap(long var0) {
      return (boolean)(!ab(var0) && var0 != 770L && var0 != 744L ? 2 & 5 : 1);
   }

   public static boolean aq(long var0) {
      return (boolean)(var0 == 608L ? --1 : 0);
   }

   public static boolean ar(long var0) {
      return (boolean)(var0 == 609L ? 3 & 5 : 0);
   }

   public static String getQualityColorOx(String var0) {
      switch(var0.hashCode()) {
      case 647926:
         while(false) {
         }

         if (var0.equals("传世")) {
            return "#cF35E01";
         }
         break;
      case 811615:
         if (var0.equals("把玩")) {
            return "#c29BF6B";
         }
         break;
      case 828695:
         if (var0.equals("无价")) {
            return "#cDB0ACD";
         }
         break;
      case 953250:
         if (var0.equals("珍藏")) {
            return "#cEFEE0C";
         }
         break;
      case 1000027:
         if (var0.equals("神迹")) {
            return "#cFB0001";
         }
         break;
      case 1157111:
         if (var0.equals("贴身")) {
            return "#c01FBF9";
         }
      }

      return null;
   }

   public static boolean as(long var0) {
      return (boolean)(var0 == 8889L ? 5 >> 2 : 0);
   }

   public static String at(long var0) {
      String var2 = null;
      String var10000;
      switch(ai(var0)) {
      case 0:
         var10000 = "武器";

         while(false) {
         }

         var2 = "武器";
         break;
      case 1:
         var10000 = var2 = "帽子";
         break;
      case 2:
         var10000 = var2 = "项链";
         break;
      case 3:
         var10000 = var2 = "衣服";
         break;
      case 4:
         var10000 = var2 = "护身符";
         break;
      case 5:
         var10000 = var2 = "鞋子";
         break;
      case 6:
         var10000 = var2 = "面具";
         break;
      case 7:
         var10000 = var2 = "腰带";
         break;
      case 8:
         var10000 = var2 = "披风";
         break;
      case 9:
         var10000 = var2 = "挂件";
         break;
      case 10:
      case 11:
         var2 = "戒指";
      default:
         var10000 = var2;
         break;
      case 12:
         var10000 = var2 = "翅膀";
      }

      if (var10000 != null && (aa(var0) || an(var0))) {
         var2 = "仙器" + var2;
      }

      return var2;
   }

   public static boolean au(long var0) {
      return var0 == 2010L || var0 == 2011L || var0 == 2012L;
   }

   public static boolean av(long var0) {
      return var0 == 123L || var0 == 124L || var0 == 125L || var0 == 126L || var0 == 127L;
   }

   public static boolean aw(long var0) {
      return var0 == 601L || var0 == 600L || var0 == 6600L || var0 == 6601L || var0 == 600L || var0 == 7001L;
   }
}
