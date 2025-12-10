package com.xy.formula;

import com.xy.W;
import com.xy.hd;
import com.xy.lz;
import com.xy.entity.RoleSummoning;
import com.xy.readbean.Goodstable;
import com.xy.socket.GameClient;
import java.awt.Color;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.List;

public class MsgUntil {
   static String[] fbs;

   public static BigDecimal a(String var0, String var1, String var2) {
      return (new BigDecimal(var0)).add(new BigDecimal(var1)).add(new BigDecimal(var2)).divide(new BigDecimal(--3), 1 ^ 3, --4);
   }

   public static String getWingGoodsQuality(String var0) {
      switch(var0.hashCode()) {
      case 647926:
         while(false) {
         }

         if (var0.equals("传世")) {
            return "5";
         }
         break;
      case 811615:
         if (var0.equals("把玩")) {
            return "1";
         }
         break;
      case 828695:
         if (var0.equals("无价")) {
            return "4";
         }
         break;
      case 953250:
         if (var0.equals("珍藏")) {
            return "3";
         }
         break;
      case 1000027:
         if (var0.equals("神迹")) {
            return "6";
         }
         break;
      case 1157111:
         if (var0.equals("贴身")) {
            return "2";
         }
      }

      return null;
   }

   public static int getUpStarData(String var0, int var1, String var2) {
      double var3 = Double.parseDouble(var0);
      return var2 == null ? 3 & 4 : (int)(var3 * (1.0D + (double)var1 * 0.1D) * (1.0D + getQualityAttr(var2)));
   }

   public static String getPalEquipAgree(String var0, String var1) {
      String[] var2 = var0.split("\\|");

      int var3;
      for(int var10000 = var3 = 2 & 5; var10000 < var2.length; var10000 = var3) {
         if (var2[var3].startsWith(var1)) {
            return var2[var3];
         }

         ++var3;
      }

      return null;
   }

   public static int getSxlxz(String var0) {
      int var1 = 5 >> 3;
      String var2;
      boolean var3;
      switch((var2 = p(5 >> 3, GoodType.getExtra(var0, GoodType.Extras[--3]))).hashCode()) {
      case 647926:
         while(false) {
         }

         if (!var2.equals("传世")) {
            return var1;
         } else {
            var1 = 160;
         }
      default:
         return var1;
      case 811615:
         if (!var2.equals("把玩")) {
            return var1;
         }

         var3 = true;
         return 10;
      case 828695:
         if (!var2.equals("无价")) {
            return var1;
         }

         var3 = true;
         return 80;
      case 953250:
         if (!var2.equals("珍藏")) {
            return var1;
         }

         var3 = true;
         return 40;
      case 1157111:
         if (!var2.equals("贴身")) {
            return var1;
         } else {
            var3 = true;
            return 20;
         }
      }
   }

   public static String b(int var0) {
      switch(var0) {
      case 1:
         while(false) {
         }

         return "一";
      case 2:
         return "二";
      case 3:
         return "三";
      case 4:
         return "四";
      case 5:
         return "五";
      case 6:
         return "六";
      case 7:
         return "七";
      case 8:
         return "八";
      case 9:
         return "九";
      case 10:
         return "十";
      default:
         return "零";
      }
   }

   public static Integer c(String var0) {
      if (var0.equals("金")) {
         return 5 >> 2;
      } else if (var0.equals("水")) {
         return --2;
      } else if (var0.equals("木")) {
         return --3;
      } else if (var0.equals("火")) {
         return --4;
      } else {
         return var0.equals("土") ? --5 : null;
      }
   }

   public static String d(String[] var0) {
      return var0[W.c.nextInt(var0.length)];
   }

   public static String getStarName(int var0) {
      if (var0 == 0) {
         return "赤帝宫";
      } else if (var0 == 3 >> 1) {
         return "青帝宫";
      } else if (var0 == --2) {
         return "黄帝宫";
      } else if (var0 == --3) {
         return "白帝宫";
      } else {
         return var0 == --4 ? "黑帝宫" : "赤帝宫";
      }
   }

   public static String e(String var0) {
      String var1 = null;
      if (var0.equals("1")) {
         var1 = "帽子";
         return "帽子";
      } else if (var0.equals("2")) {
         var1 = "项链";
         return "项链";
      } else if (var0.equals("3")) {
         var1 = "衣服";
         return "衣服";
      } else if (var0.equals("6")) {
         var1 = "面具";
         return "面具";
      } else if (var0.equals("7")) {
         var1 = "腰带";
         return "腰带";
      } else if (var0.equals("8")) {
         var1 = "披风";
         return "披风";
      } else if (var0.equals("9")) {
         var1 = "挂件";
         return "挂件";
      } else if (var0.equals("10")) {
         var1 = "左戒指";
         return "左戒指";
      } else {
         if (var0.equals("11")) {
            var1 = "右戒指";
         }

         return var1;
      }
   }

   public static int f(String var0) {
      int var1 = 5 >> 3;
      boolean var3;
      switch(var0.hashCode()) {
      case 647926:
         while(false) {
         }

         if (!var0.equals("传世")) {
            return var1;
         } else {
            var3 = true;
            return 5;
         }
      case 811615:
         if (!var0.equals("把玩")) {
            return var1;
         }

         var3 = true;
         return 1;
      case 828695:
         if (!var0.equals("无价")) {
            return var1;
         }

         var3 = true;
         return 4;
      case 953250:
         if (!var0.equals("珍藏")) {
            return var1;
         }

         var3 = true;
         return 3;
      case 1157111:
         if (!var0.equals("贴身")) {
            return var1;
         }

         var3 = true;
         return 2;
      default:
         return var1;
      }
   }

   public static Color getQualityColor(String var0) {
      switch(var0.hashCode()) {
      case 647926:
         while(false) {
         }

         if (var0.equals("传世")) {
            return lz.e;
         }
         break;
      case 811615:
         if (var0.equals("把玩")) {
            return lz.s;
         }
         break;
      case 828695:
         if (var0.equals("无价")) {
            return lz.ah;
         }
         break;
      case 953250:
         if (var0.equals("珍藏")) {
            return lz.bn;
         }
         break;
      case 1000027:
         if (var0.equals("神迹")) {
            return lz.x;
         }
         break;
      case 1157111:
         if (var0.equals("贴身")) {
            return lz.bf;
         }
      }

      return null;
   }

   public static String g(String var0, boolean var1) {
      if (var0.equals("0")) {
         return "武器";
      } else if (var0.equals("1")) {
         return "帽子";
      } else if (var0.equals("2")) {
         return "项链";
      } else if (var0.equals("3")) {
         return "衣服";
      } else if (var0.equals("4")) {
         return "护身符";
      } else if (var0.equals("5")) {
         return "鞋子";
      } else if (var0.equals("6")) {
         return "面具";
      } else if (var0.equals("7")) {
         return "腰带";
      } else if (var0.equals("8")) {
         return "披风";
      } else if (var0.equals("9")) {
         return "挂件";
      } else if (var0.equals("10")) {
         return var1 ? "左戒指" : "戒指";
      } else if (var0.equals("11")) {
         return var1 ? "右戒指" : "戒指";
      } else {
         return null;
      }
   }

   public static int h(int var0) {
      int var1 = 5 >> 3;
      boolean var2;
      switch(var0) {
      case 1:
         while(false) {
         }

         var2 = true;
         return 1;
      case 2:
         var2 = true;
         return 1;
      case 3:
         var2 = true;
         return 2;
      case 4:
         var2 = true;
         return 2;
      case 5:
         var2 = true;
         return 3;
      default:
         return var1;
      }
   }

   public static Integer i(String var0) {
      if (var0.equals("金")) {
         return 4 ^ 5;
      } else if (var0.equals("木")) {
         return 1 ^ 3;
      } else if (var0.equals("土")) {
         return --3;
      } else if (var0.equals("水")) {
         return --4;
      } else {
         return var0.equals("火") ? --5 : null;
      }
   }

   public static String j(int var0, GameClient var1) {
      StringBuffer var2 = new StringBuffer();
      String[] var3 = null;
      String[] var10000;
      boolean var10002;
      StringBuffer var7;
      if (var1.n(1 ^ 3, --3)) {
         var10000 = new String[126 & 11];
         var10002 = true;
         var10000[3 >> 2] = "抗物理";
         var10000[3 & 5] = "抗震慑";
         var10000[--2] = "抗风";
         var10000[--3] = "抗雷";
         var10000[--4] = "抗水";
         var10000[--5] = "抗火";
         var10000[54 & 79] = "抗混乱";
         var10000[31 & 103] = "抗昏睡";
         var10000[27 & 108] = "抗封印";
         var10000[29 & 107] = "抗中毒";
         var3 = var10000;
         var7 = var2;
      } else {
         var10000 = new String[12];
         var10002 = true;
         var10000[3 & 4] = "抗物理";
         var10000[2 ^ 3] = "抗震慑";
         var10000[5 >> 1] = "抗风";
         var10000[--3] = "抗雷";
         var10000[--4] = "抗水";
         var10000[--5] = "抗火";
         var10000[111 & 22] = "抗混乱";
         var10000[7 & 127] = "抗昏睡";
         var10000[124 & 11] = "抗封印";
         var10000[77 & 59] = "抗中毒";
         var10000[94 & 43] = "抗遗忘";
         var10000[15 & 123] = "抗鬼火";
         var3 = var10000;
         var7 = var2;
      }

      var7.append(d(var3) + "=");
      int var6;
      double var4 = getDouble((double)(((var6 = (var0 - (3 >> 1)) / (111 & 56) + (4 ^ 5)) - --1) * (1 ^ 3)) + 0.1D, (double)(var6 * (5 >> 1)) + 0.1D, --1);
      if (var4 > 10.0D) {
         var4 = 10.0D;
      }

      var2.append(var4);
      return var2.toString();
   }

   public static String getStarArrayAttribute(String var0) {
      if (var0.equals("朱雀")) {
         return "瑕疵:略微减少全队冰混睡忘抗性";
      } else if (var0.equals("青龙")) {
         return "瑕疵:略微减少全队仙法抗性";
      } else if (var0.equals("白虎")) {
         return "瑕疵:略微减少全队鬼火、三尸虫抗性";
      } else if (var0.equals("玄武")) {
         return "瑕疵:略微减少全队震慑抗性";
      } else if (var0.equals("金牛")) {
         return "本方所有人物、召唤兽对敌方造成的物理伤害有一定的加成";
      } else if (var0.equals("火猿")) {
         return "若对方灵宝对本方任意单位造成伤害，抵抗一定程度伤害；每2回合可生效一次";
      } else if (var0.equals("赤马")) {
         return "本方所有人物、召唤兽获得一定经验加成";
      } else {
         return var0.equals("黄鹤") ? "本方所有人物增加冰混睡忘抗性" : "本方所有人物、召唤兽的仙法、鬼火、震慑有一定加成";
      }
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

   public static boolean k(String var0) {
      return var0.equals("朱雀") || var0.equals("青龙") || var0.equals("白虎") || var0.equals("玄武");
   }

   public static int getSM(int var0, int var1) {
      if (!r(var0, var1)) {
         return -4 >> 2;
      } else if (var0 == (87 & 59)) {
         return 79 & 57;
      } else if (var0 == (87 & 60)) {
         return 111 & 27;
      } else if (var0 == (119 & 29)) {
         return 88 & 47;
      } else if (var0 == (22 & 127)) {
         return 127 & 10;
      } else if (var0 == (63 & 87)) {
         return 3 & 5;
      } else if (var0 == (88 & 63)) {
         return 1 ^ 3;
      } else if (var0 == (127 & 25)) {
         return --3;
      } else if (var0 == (27 & 126)) {
         return 3 ^ 3;
      } else if (var0 == (59 & 95)) {
         return --4;
      } else if (var0 == (60 & 95)) {
         return --5;
      } else if (var0 == (63 & 93)) {
         return 23 & 110;
      } else if (var0 == 30) {
         return 7;
      } else if (var0 == 72) {
         return 12;
      } else if (var0 == 73) {
         return 13;
      } else if (var0 == 74) {
         return 14;
      } else {
         return var0 == 75 ? 15 : -1;
      }
   }

   public static String getGoodValue(String var0, String var1) {
      if (var0 != null && !var0.equals("")) {
         String[] var2 = var0.split("\\|");

         int var3;
         for(int var10000 = var3 = 2 & 5; var10000 < var2.length; var10000 = var3) {
            if (var2[var3].startsWith(var1)) {
               return var2[var3];
            }

            ++var3;
         }

         return null;
      } else {
         return null;
      }
   }

   public static double l(String var0, String var1, String var2) {
      Integer var3 = i(var0);
      Integer var4 = i(var1);
      int var5;
      if ((var5 = Math.abs(var3 - var4)) != (2 ^ 3) && var5 != --4 || (var3 != 5 >> 2 || var4 != --5) && var3 <= var4) {
         var3 = c(var0);
         var4 = c(var1);
         return (var5 = Math.abs(var3 - var4)) != 5 >> 2 && var5 != --4 || (var3 != (2 ^ 3) || var4 != --5) && var3 <= var4 ? (double)Integer.parseInt(var2) * 0.2D : (double)Integer.parseInt(var2) * 0.3D;
      } else {
         return (double)Integer.parseInt(var2) * 0.1D;
      }
   }

   public static double getQualityAttr(String var0) {
      switch(var0.hashCode()) {
      case 647926:
         while(false) {
         }

         if (var0.equals("传世")) {
            return 1.6D;
         }
         break;
      case 811615:
         if (var0.equals("把玩")) {
            return 0.0D;
         }
         break;
      case 828695:
         if (var0.equals("无价")) {
            return 0.8D;
         }
         break;
      case 953250:
         if (var0.equals("珍藏")) {
            return 0.4D;
         }
         break;
      case 1000027:
         if (var0.equals("神迹")) {
            return 3.2D;
         }
         break;
      case 1157111:
         if (var0.equals("贴身")) {
            return 0.2D;
         }
      }

      return -1.0D;
   }

   public static int getGoodLvl(String var0) {
      int var1;
      if ((var1 = var0.indexOf("=")) == -4 >> 2) {
         return 3 & 4;
      } else {
         int var2;
         if ((var2 = var0.indexOf("|")) == -4 >> 2) {
            var2 = var0.length();
         }

         return hd.b(var0, var1 + --1, var2);
      }
   }

   public static void getNpcOption(int var0, List<String> var1) {
      int var10000;
      if ((var0 < --5 || var0 > (107 & 30)) && var0 != (63 & 77) && var0 != (46 & 95) && var0 != (15 & 127) && var0 != (30 & 115) && var0 != (63 & 101) && var0 != (63 & 109) && var0 != (126 & 51) && var0 != (119 & 107) && var0 != (122 & 125) && var0 != (127 & 121) && var0 != (127 & 123) && var0 != (127 & 124) && var0 != (125 & 127) && var0 != (21215 & 11683) && var0 != (19423 & 14079)) {
         if ((var0 < 19 || var0 > 30) && var0 != 72 && var0 != 73 && var0 != 74 && var0 != 75 && var0 != 1006) {
            if (var0 == 39) {
               var10000 = var0;
               var1.add("我要查询剩余双倍时间");
               var1.add("我要冻结双倍时间");
               var1.add("我要领取一小时双倍时间");
               var1.add("我要领取二小时双倍时间");
            } else if (var0 == 40) {
               var10000 = var0;
               var1.add("我要住店(扣除2000银两)");
               var1.add("换个高级藏宝图");
               var1.add("换个超级藏宝图");
            } else if (var0 == 12) {
               var10000 = var0;
               var1.add("我要打造普通装备");
               var1.add("我要升级神兵");
               var1.add("我要上神兵石");
               var1.add("我要合成炼妖石");
               var1.add("符石");
            } else if (var0 == 16) {
               var10000 = var0;
               var1.add("治疗当前召唤兽并恢复忠诚");
               var1.add("治疗全部召唤兽并恢复忠诚");
            } else if (var0 == 32) {
               var10000 = var0;
               var1.add("我要一颗情花苗");
            } else if (var0 == 36) {
               var10000 = var0;
               var1.add("我是来召唤你的");
            } else if (var0 == 38) {
               var10000 = var0;
               var1.add("我想买点东西");
               var1.add("神兽学习技能");
               var1.add("飞升当前参战神兽");
            } else if (var0 == 44) {
               var10000 = var0;
               var1.add("转生当前召唤兽");
               var1.add("点化当前坐骑");
               var1.add("点化当前召唤兽");
            } else if (var0 == 47) {
               var10000 = var0;
               var1.add("我已做好了转生准备");
            } else if (var0 == 48) {
               var10000 = var0;
               var1.add("我想转换种族");
            } else if (var0 == 54) {
               var10000 = var0;
               var1.add("打造11-16级装备");
            } else if (var0 == 57) {
               var10000 = var0;
               var1.add("我是来捐钱的");
               var1.add("我是来领工资的");
            } else if (var0 == 58) {
               var10000 = var0;
               var1.add("更改帮派主守护");
               var1.add("更改帮派副守护");
            } else if (var0 == 59) {
               var10000 = var0;
               var1.add("单人护送物资");
               var1.add("组队护送物资");
            } else if (var0 == 61) {
               var10000 = var0;
               var1.add("我来报名参加帮战");
               var1.add("我要参加帮战");
               var1.add("我想买点东西");
            } else if (var0 == 63) {
               var10000 = var0;
               var1.add("我要创建帮派");
               var1.add("加入帮派");
            } else if (var0 == 64) {
               var10000 = var0;
               var1.add("进入帮派");
            } else if (var0 == 66) {
               var10000 = var0;
               var1.add("我要合成仙器");
               var1.add("我要升级仙器");
               var1.add("我要洗炼仙器");
            } else if (var0 == 69) {
               var10000 = var0;
               var1.add("我要培养护身符");
               var1.add("我要重铸护身符");
               var1.add("我要培养饰品");
               var1.add("我要重铸饰品");
               var1.add("培养彩晶石");
            } else if (var0 == 31) {
               var10000 = var0;
               var1.add("我要取回物品");
               var1.add("我要典当物品");
            } else if (var0 == 130) {
               var10000 = var0;
               var1.add("我要领养一个男孩");
               var1.add("我要领养一个女孩");
            } else if (var0 == 1001) {
               var10000 = var0;
               var1.add("我要脱离帮战");
               var1.add("我要进入高手挑战赛");
               var1.add("我要进入战场");
               var1.add("回到营地");
            } else if (var0 == 1003) {
               var10000 = var0;
               var1.add("剧毒封印之书");
               var1.add("寒冰封印之书");
               var1.add("天雷封印之书");
               var1.add("御剑封印之书");
               var1.add("狂力封印之书");
            } else if (var0 == 1004) {
               var10000 = var0;
               var1.add("冥灵古卷");
               var1.add("玲珑古卷");
               var1.add("巨翼古卷");
               var1.add("葫芦古卷");
               var1.add("如意古卷");
            } else if (var0 == 1005) {
               var10000 = var0;
               var1.add("苍凛古卷");
               var1.add("赭炎古卷");
               var1.add("当康古卷");
               var1.add("松鼠古卷");
               var1.add("佳音小使古卷");
            } else if (var0 == 1100) {
               var10000 = var0;
               var1.add("我要激活兑奖码");
               var1.add("兑换彩晶石");
            } else if (var0 == 126) {
               var10000 = var0;
               var1.add("我要参加水陆大会");
               var1.add("领取水陆大会奖励");
               var1.add("我想买点东西");
            } else if (var0 == 128) {
               var10000 = var0;
               var1.add("我要下挑战书");
            } else if (var0 == 129) {
               var10000 = var0;
               var1.add("我要兑换灵修值");
               var1.add("我要收录玉符(玉符转符录)");
               var1.add("我要查看已有符录(符录转玉符)");
               var1.add("我想买点东西");
               var1.add("我要回长安");
            } else if (var0 == 132) {
               var10000 = var0;
               var1.add("前途缈缈,我还是再准备下吧");
            } else if (var0 == 133) {
               var10000 = var0;
               var1.add("年(588碎片)");
               var1.add("画中仙(488碎片)");
               var1.add("白泽(468碎片)");
            } else if (var0 == 134) {
               var10000 = var0;
               var1.add("龙马(188碎片)");
               var1.add("画皮娘子(188碎片)");
               var1.add("孔雀明王(188碎片)");
               var1.add("北冥龙君(288碎片)");
               var1.add("孟极(288碎片)");
               var1.add("镜花水月(388碎片)");
               var1.add("妙音栾女(388碎片)");
            } else if (var0 == 136) {
               var10000 = var0;
               var1.add("我想买点东西");
            } else if (var0 == 1106) {
               var10000 = var0;
               var1.add("参加种族赛");
               var1.add("一键领取种族赛奖励");
               var1.add("我想买点东西");
            } else if (var0 == 515) {
               var10000 = var0;
               var1.add("参加擂台赛");
               var1.add("一键领取擂台赛奖励");
               var1.add("我想买点东西");
            } else if (var0 == 520) {
               var10000 = var0;
               var1.add("我要进行九生九死挑战");
            } else if (var0 == 85) {
               var10000 = var0;
               var1.add("我要打造,摘抄宝石");
               var1.add("我要合成宝石等");
               var1.add("我想买点东西");
            } else if (var0 == 800) {
               var10000 = var0;
               var1.add("我要参加跨服联赛");
            } else if (var0 == 530) {
               var10000 = var0;
               var1.add("我来上交地煞星之魂");
            } else if (var0 == 605) {
               var10000 = var0;
               var1.add("我要回到500年前");
               var1.add("领取大闹天宫奖励");
               var1.add("我想买点东西");
            } else if (var0 == 42) {
               var10000 = var0;
               var1.add("我来上交上古宝箱");
            } else if (var0 == 43) {
               var10000 = var0;
               var1.add("我来上交上古宝箱");
            } else if (var0 == 103) {
               var10000 = var0;
               var1.add("我要参观上古战场的风采");
            } else if (var0 == 104) {
               var10000 = var0;
               var1.add("送我回后方营地");
            } else if (var0 == 105) {
               var10000 = var0;
               var1.add("神力加持");
            } else if (var0 == 2021) {
               var10000 = var0;
               var1.add("升级帮派等级");
            } else if (var0 == 2024) {
               var10000 = var0;
               var1.add("我要提交材料");
            } else if (var0 == 2025) {
               var10000 = var0;
               var1.add("我想买点东西");
            } else if (var0 == 2026) {
               var10000 = var0;
               var1.add("守护小成修炼");
               var1.add("守护大成修炼");
            } else if (var0 == 2027) {
               var10000 = var0;
               var1.add("我要参加全名竞技切磋");
               var1.add("我来换点竞技物品");
            } else if (var0 == 2028) {
               var10000 = var0;
               var1.add("我要挑战试炼幻境");
               var1.add("我点错了,我实力未到,不敢尝试");
            } else {
               if (var0 != 49 && var0 != 56 && var0 != 70) {
                  return;
               }

               var10000 = var0;
            }
         } else {
            var1.add("我要回长安");
            var10000 = var0;
         }
      } else {
         var1.add("我想买点东西");
         var10000 = var0;
      }

      if (var10000 != 2028 && var0 != 132 && var0 != 134 && var0 != 129) {
         var1.add("我什么都不做");
      }
   }

   public static boolean m(String var0) {
      int var1;
      for(int var10000 = var1 = 3 >> 2; var10000 < fbs.length; var10000 = var1) {
         if (fbs[var1].equals(var0)) {
            return (boolean)(3 >> 1);
         }

         ++var1;
      }

      return (boolean)(3 ^ 3);
   }

   public static double getDouble(double var0, double var2, int var4) {
      int var6 = var4;
      StringBuffer var5 = new StringBuffer();

      for(int var10000 = var4 = 2 & 5; var10000 < var6; var10000 = var4) {
         ++var4;
         var5.append("0");
      }

      var2 = (var2 - var0) / 4.0D * (double)W.c.nextInt(--5);
      return Double.valueOf((new DecimalFormat("#." + var5)).format(W.c.nextDouble() * var2 + var0));
   }

   public static String n(String var0, String var1) {
      String var10000 = var1;
      int var3 = Integer.parseInt(var0);
      int var2 = Integer.parseInt(var10000);
      if (var3 <= --5) {
         if (var3 + --5 == var2) {
            return "装备升级";
         }

         if (var3 + --4 == var2) {
            return "装备重铸";
         }
      } else if (var3 == (47 & 86) && var2 == (58 & 79)) {
         return "装备重铸";
      }

      return "?";
   }

   public static int o(int var0) {
      int var1 = 3 >> 2;
      boolean var2;
      switch(var0) {
      case 1:
         while(false) {
         }

         var2 = true;
         return 5;
      case 2:
         var2 = true;
         return 4;
      case 3:
         var2 = true;
         return 3;
      case 4:
         var2 = true;
         return 3;
      default:
         return var1;
      }
   }

   public static String p(int var0, String var1) {
      String[] var7 = var1.split("\\&");
      String var2 = "";
      String var6 = var7[--3];
      if (var0 == 0) {
         return var6;
      } else if (var0 == --1) {
         int var4 = f(var6) + (5 >> 2);
         StringBuffer var5 = new StringBuffer();

         int var3;
         for(int var10000 = var3 = 3 ^ 3; var10000 < var7.length; var10000 = var3) {
            if (var3 != 0) {
               var5.append("&");
            }

            if (var3 != --3) {
               var5.append(var7[var3]);
            } else {
               var5.append(s(var4));
            }

            ++var3;
         }

         return var5.toString();
      } else {
         if (var0 == --3) {
            var2 = s(f(var6) + (5 >> 2));
         }

         return var2;
      }
   }

   public static String getValuesMessage(String[] var0, String var1) {
      int var2;
      for(int var10000 = var2 = 2 & 5; var10000 < var0.length; var10000 = var2) {
         if (var0[var2].startsWith(var1)) {
            if ("觉醒技".equals(var1)) {
               return var0[var2];
            }

            return var0[var2].split("=")[--1];
         }

         ++var2;
      }

      return null;
   }

   public static void q(RoleSummoning var0) {
      if (var0.getSummoningid().equals("200102")) {
         var0.setSummoningskin(var0.getRevealNum() <= --1 ? "200076" : "400105");
      } else if (var0.getSummoningid().equals("200103")) {
         var0.setSummoningskin(var0.getRevealNum() <= --1 ? "400080" : "400102");
      } else if (var0.getSummoningid().equals("200104")) {
         var0.setSummoningskin(var0.getRevealNum() <= 5 >> 2 ? "400083" : "400106");
      } else if (var0.getSummoningid().equals("200105")) {
         var0.setSummoningskin(var0.getRevealNum() <= --1 ? "400072" : "400105");
      } else if (var0.getSummoningid().equals("200106")) {
         var0.setSummoningskin(var0.getRevealNum() <= 5 >> 2 ? "400079" : "400103");
      } else if (var0.getSummoningid().equals("200107")) {
         var0.setSummoningskin(var0.getRevealNum() <= (3 & 5) ? "400064" : "400104");
      } else if (var0.getSummoningskin().equals("400107")) {
         var0.setSummoningskin("500152");
      } else if (var0.getSummoningskin().equals("400108")) {
         var0.setSummoningskin("500153");
      } else if (var0.getSummoningskin().equals("400109")) {
         var0.setSummoningskin("500151");
      } else if (var0.getSummoningskin().equals("400110")) {
         var0.setSummoningskin("500154");
      } else if (var0.getSummoningskin().equals("400111")) {
         var0.setSummoningskin("500155");
      } else if (var0.getSummoningskin().equals("400120")) {
         var0.setSummoningskin("500156");
      } else if (var0.getSummoningskin().equals("400121")) {
         var0.setSummoningskin("400521");
      } else if (var0.getSummoningskin().equals("400127")) {
         var0.setSummoningskin("500157");
      } else if (var0.getSummoningskin().equals("500150")) {
         var0.setSummoningskin("500231");
      } else if (var0.getSummoningskin().equals("500158")) {
         var0.setSummoningskin("500204");
      } else if (var0.getSummoningskin().equals("500159")) {
         var0.setSummoningskin("500205");
      } else {
         if (var0.getSummoningskin().equals("52108")) {
            var0.setSummoningskin("500699");
         }

      }
   }

   public static boolean r(int var0, int var1) {
      if (var0 == (59 & 87)) {
         return (boolean)(var1 != (30719 & 24049) && var1 != (32755 & 22014) && var1 != (24563 & 30207) && var1 != (30207 & 24567) && var1 != (22526 & 32245) && var1 != (22007 & 32765) && var1 != (24062 & 30711) && var1 != (22010 & 32765) && var1 != (24057 & 30719) && var1 != (24575 & 30202) && var1 != (22527 & 32252) ? 5 >> 3 : 1);
      } else if (var0 == (54 & 93)) {
         return (boolean)(var1 != (32245 & 22526) && var1 != (24055 & 30717) && var1 != (30198 & 24575) && var1 != 22008 && var1 != 22010 && var1 != 22012 ? 3 ^ 3 : 1);
      } else if (var0 == 21) {
         return (boolean)(var1 != 22001 && var1 != 22002 && var1 != 22003 && var1 != 22007 && var1 != 22009 && var1 != 22011 ? 3 >> 2 : 1);
      } else if (var0 == 22) {
         return (boolean)(var1 != 22001 && var1 != 22002 && var1 != 22003 && var1 != 22007 && var1 != 22009 && var1 != 22004 && var1 != 22005 && var1 != 22006 && var1 != 22008 && var1 != 22010 && var1 != 22011 && var1 != 22012 ? 3 ^ 3 : 1);
      } else if (var0 == 23) {
         return (boolean)(var1 != 20001 && var1 != 20002 && var1 != 20003 && var1 != 20007 && var1 != 20009 && var1 != 20004 && var1 != 20005 && var1 != 20006 && var1 != 20008 && var1 != 20010 && var1 != 20011 && var1 != 20012 ? 3 ^ 3 : 1);
      } else if (var0 == 24) {
         return (boolean)(var1 != 20001 && var1 != 20002 && var1 != 20003 && var1 != 20007 && var1 != 20009 && var1 != 20004 && var1 != 20005 && var1 != 20006 && var1 != 20008 && var1 != 20010 && var1 != 20011 && var1 != 20012 ? 3 ^ 3 : 1);
      } else if (var0 == 25) {
         return (boolean)(var1 != 20004 && var1 != 20005 && var1 != 20006 && var1 != 20008 && var1 != 20010 && var1 != 20012 ? 3 >> 2 : 1);
      } else if (var0 == 26) {
         return (boolean)(var1 != 20001 && var1 != 20002 && var1 != 20003 && var1 != 20007 && var1 != 20009 && var1 != 20011 ? 3 ^ 3 : 1);
      } else if (var0 == 27) {
         return (boolean)(var1 != 21001 && var1 != 21002 && var1 != 21003 && var1 != 21007 && var1 != 21009 && var1 != 21004 && var1 != 21005 && var1 != 21006 && var1 != 21008 && var1 != 21010 && var1 != 21011 && var1 != 21012 ? 5 >> 3 : 1);
      } else if (var0 == 28) {
         return (boolean)(var1 != 21001 && var1 != 21002 && var1 != 21003 && var1 != 21007 && var1 != 21009 && var1 != 21004 && var1 != 21005 && var1 != 21006 && var1 != 21008 && var1 != 21010 && var1 != 21011 && var1 != 21012 ? 3 & 4 : 1);
      } else if (var0 == 29) {
         return (boolean)(var1 != 21004 && var1 != 21005 && var1 != 21006 && var1 != 21008 && var1 != 21010 && var1 != 21012 ? 3 ^ 3 : 1);
      } else if (var0 == 30) {
         return (boolean)(var1 != 21001 && var1 != 21002 && var1 != 21003 && var1 != 21007 && var1 != 21009 && var1 != 21011 ? 3 ^ 3 : 1);
      } else if (var0 == 72) {
         return (boolean)(var1 != 23001 && var1 != 23002 && var1 != 23003 && var1 != 23004 && var1 != 23005 && var1 != 23006 && var1 != 23007 && var1 != 23008 ? 2 & 5 : 1);
      } else if (var0 == 73) {
         return (boolean)(var1 != 23001 && var1 != 23002 && var1 != 23003 && var1 != 23007 ? 5 >> 3 : 1);
      } else if (var0 == 74) {
         return (boolean)(var1 != 23001 && var1 != 23002 && var1 != 23003 && var1 != 23004 && var1 != 23005 && var1 != 23006 && var1 != 23007 && var1 != 23008 ? 5 >> 3 : 1);
      } else if (var0 == 75) {
         return (boolean)(var1 != 23004 && var1 != 23005 && var1 != 23006 && var1 != 23008 ? 3 >> 2 : 1);
      } else {
         return false;
      }
   }

   static {
      String[] var10000 = new String[95 & 47];
      boolean var10002 = true;
      var10000[2 & 5] = "银索金铃";
      var10000[4 ^ 5] = "将军令";
      var10000[--2] = "大势锤";
      var10000[--3] = "七宝玲珑塔";
      var10000[--4] = "黑龙珠";
      var10000[--5] = "幽冥鬼手";
      var10000[118 & 15] = "大手印";
      var10000[47 & 87] = "绝情鞭";
      var10000[93 & 42] = "情网";
      var10000[41 & 95] = "宝莲灯";
      var10000[110 & 27] = "金箍儿";
      var10000[123 & 15] = "番天印";
      var10000[111 & 28] = "锦襕袈裟";
      var10000[15 & 125] = "白骨爪";
      var10000[78 & 63] = "化蝶";
      fbs = var10000;
   }

   public static BigDecimal getWingGoodsTrue(Goodstable var0, Integer var1) {
      if (var1 == null) {
         return null;
      } else {
         String var2 = var0.getValue().split("=")[3 >> 1];
         if (var1 <= 5 >> 1) {
            if (var2.equals("1")) {
               return new BigDecimal("100000000");
            }
         } else if (var1 <= --5) {
            if (var2.equals("2")) {
               return new BigDecimal("200000000");
            }
         } else if (var1 <= (109 & 26)) {
            if (var2.equals("3")) {
               return new BigDecimal("300000000");
            }
         } else if (var1 <= (31 & 107)) {
            if (var2.equals("4")) {
               return new BigDecimal("400000000");
            }
         } else if (var1 <= (47 & 94) && var2.equals("5")) {
            return new BigDecimal("500000000");
         }

         return null;
      }
   }

   public static String s(int var0) {
      String var1 = "把玩";
      switch(var0) {
      case 1:
         while(false) {
         }

         var1 = "把玩";
         return "把玩";
      case 2:
         var1 = "贴身";
         return "贴身";
      case 3:
         var1 = "珍藏";
         return "珍藏";
      case 4:
         var1 = "无价";
         return "无价";
      case 5:
         var1 = "传世";
         return "传世";
      default:
         return var1;
      }
   }
}
