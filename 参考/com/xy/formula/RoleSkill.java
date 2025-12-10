package com.xy.formula;

import java.util.ArrayList;
import java.util.List;

public class RoleSkill {
   private static RoleSkill roleSkill;

   public List<String> a(int var1) {
      ArrayList var2 = new ArrayList();
      if (var1 >= (3 & 5) && var1 <= (94 & 43)) {
         switch((var1 + --1) / (1 ^ 3)) {
         case 1:
            while(false) {
            }

            var2.add(127 & 23);
            var2.add(125 & 26);
            if (var1 % (5 >> 1) == 0) {
               var2.add(121 & 31);
            } else {
               var2.add(26);
            }
            break;
         case 2:
            var2.add(95 & 59);
            var2.add(94 & 61);
            if (var1 % --2 == 0) {
               var2.add(125 & 31);
            } else {
               var2.add(30);
            }
            break;
         case 3:
            var2.add(87 & 59);
            var2.add(55 & 94);
            if (var1 % (5 >> 1) == 0) {
               var2.add(30 & 117);
            } else {
               var2.add(21);
            }
            break;
         case 4:
            var2.add(92 & 107);
            var2.add(75 & 126);
            if (var1 % (1 ^ 3) == 0) {
               var2.add(75 & 127);
            } else {
               var2.add(73);
            }
            break;
         case 5:
            var2.add(111 & 92);
            var2.add(79 & 125);
            if (var1 % (1 ^ 3) == 0) {
               var2.add(95 & 111);
            } else {
               var2.add(78);
            }
         }
      } else {
         var2.add(var1);
      }

      ArrayList var4 = new ArrayList();

      int var3;
      for(int var10000 = var3 = var2.size() - (4 ^ 5); var10000 >= 0; var10000 = var3) {
         switch((Integer)var2.get(var3)) {
         case 19:
            while(false) {
            }

            var4.add("1046");
            var4.add("1047");
            var4.add("1048");
            var4.add("1049");
            var4.add("1050");
            break;
         case 20:
            var4.add("1056");
            var4.add("1057");
            var4.add("1058");
            var4.add("1059");
            var4.add("1060");
            break;
         case 21:
            var4.add("1041");
            var4.add("1042");
            var4.add("1043");
            var4.add("1044");
            var4.add("1045");
            break;
         case 22:
            var4.add("1051");
            var4.add("1052");
            var4.add("1053");
            var4.add("1054");
            var4.add("1055");
            break;
         case 23:
            var4.add("1006");
            var4.add("1007");
            var4.add("1008");
            var4.add("1009");
            var4.add("1010");
            break;
         case 24:
            var4.add("1011");
            var4.add("1012");
            var4.add("1013");
            var4.add("1014");
            var4.add("1015");
            break;
         case 25:
            var4.add("1016");
            var4.add("1017");
            var4.add("1018");
            var4.add("1019");
            var4.add("1020");
            break;
         case 26:
            var4.add("1001");
            var4.add("1002");
            var4.add("1003");
            var4.add("1004");
            var4.add("1005");
            break;
         case 27:
            var4.add("1021");
            var4.add("1022");
            var4.add("1023");
            var4.add("1024");
            var4.add("1025");
            break;
         case 28:
            var4.add("1026");
            var4.add("1027");
            var4.add("1028");
            var4.add("1029");
            var4.add("1030");
            break;
         case 29:
            var4.add("1031");
            var4.add("1032");
            var4.add("1033");
            var4.add("1034");
            var4.add("1035");
            break;
         case 30:
            var4.add("1036");
            var4.add("1037");
            var4.add("1038");
            var4.add("1039");
            var4.add("1040");
            break;
         case 72:
            var4.add("1061");
            var4.add("1062");
            var4.add("1063");
            var4.add("1064");
            var4.add("1065");
            break;
         case 73:
            var4.add("1066");
            var4.add("1067");
            var4.add("1068");
            var4.add("1069");
            var4.add("1070");
            break;
         case 74:
            var4.add("1071");
            var4.add("1072");
            var4.add("1073");
            var4.add("1074");
            var4.add("1075");
            break;
         case 75:
            var4.add("1076");
            var4.add("1077");
            var4.add("1078");
            var4.add("1079");
            var4.add("1080");
            break;
         case 76:
            var4.add("1081");
            var4.add("1082");
            var4.add("1083");
            var4.add("1084");
            var4.add("1085");
            break;
         case 77:
            var4.add("1091");
            var4.add("1092");
            var4.add("1093");
            var4.add("1094");
            var4.add("1095");
            break;
         case 78:
            var4.add("1096");
            var4.add("1097");
            var4.add("1098");
            var4.add("1099");
            var4.add("1100");
            break;
         case 79:
            var4.add("1086");
            var4.add("1087");
            var4.add("1088");
            var4.add("1089");
            var4.add("1090");
         }

         --var3;
      }

      return var4;
   }

   public static RoleSkill getRoleSkill() {
      if (roleSkill == null) {
         roleSkill = new RoleSkill();
      }

      return roleSkill;
   }

   public String[] getAllSkill(int var1, int var2) {
      List var5;
      String[] var10000 = new String[(var5 = this.a(var1)).size()];
      boolean var10002 = true;
      String[] var4 = var10000;

      int var3;
      for(int var6 = var3 = 3 ^ 3; var6 < var5.size(); var6 = var3) {
         int var10001 = var3;
         String var7 = (String)var5.get(var3) + "_" + var2;
         ++var3;
         var4[var10001] = var7;
      }

      return var4;
   }
}
