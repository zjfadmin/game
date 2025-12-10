package com.xy.formula;

import java.util.HashMap;
import java.util.Map;

public class QualityZW {
   public static Map<String, Object> keys = new HashMap();
   static String WL;

   public static boolean a(String var0) {
      Object var1;
      if ((var1 = keys.get(var0)) == null) {
         return WL.equals(var0);
      } else {
         return var1 instanceof String ? WL.equals(var1) : false;
      }
   }

   public static double getDouble(String var0) {
      try {
         return Double.parseDouble(var0);
      } catch (Exception var1) {
         return 0.0D;
      }
   }

   static {
      keys.put("忽视抗昏睡", "忽视抗睡");
      keys.put("忽视抗中毒", "忽视抗毒");
      keys.put("忽视抗封印", "忽视抗封");
      keys.put("忽视抗混乱", "忽视抗混");
      keys.put("忽视遗忘", "忽视抗遗忘");
      keys.put("忽视鬼火", "忽视抗鬼火");
      keys.put("加强无属性伤害", "无属性伤害");
      keys.put("对无属性目标伤害", "无属性伤害");
      keys.put("致命几率", "致命率");
      keys.put("致命", "致命率");
      keys.put("忽视躲闪", "命中率");
      keys.put("命中几率", "命中率");
      keys.put("命中", "命中率");
      keys.put("狂暴几率", "狂暴率");
      keys.put("狂暴", "狂暴率");
      keys.put("连击", "连击率");
      keys.put("反击", "反击率");
      keys.put("躲闪", "躲闪率");
      keys.put("物理躲闪", "躲闪率");
      keys.put("加三尸", "加强三尸虫");
      keys.put("强三尸虫", "加强三尸虫");
      keys.put("抗风法", "抗风");
      keys.put("抗火法", "抗火");
      keys.put("抗水法", "抗水");
      keys.put("抗雷法", "抗雷");
      keys.put("抗三尸", "抗三尸虫");
      keys.put("抗物理", "物理吸收");
      keys.put("物理吸收率", "物理吸收");
      keys.put("抗毒伤害", "抗毒伤");
      keys.put("抗浩然正气", "上善若水");
      keys.put("抗隔山打牛", "尘埃落定");
      keys.put("抗青面獠牙", "美人迟暮");
      keys.put("抗天魔解体", "化血成碧");
      keys.put("抗小楼夜哭", "明珠有泪");
      keys.put("抗分光化影", "灵犀一点");
      keys.put("强震慑", "加强震慑");
      keys.put("强毒伤", "加强毒伤害");
      keys.put("加强攻击法术效果", "加强加攻法术效果");
      keys.put("加强防御法术效果", "加强加防法术效果");
      keys.put("加强速度法术效果", "加强加速法术效果");
      keys.put("抗风法狂暴几率", "抗风法狂暴");
      keys.put("抗火法狂暴几率", "抗火法狂暴");
      keys.put("抗水法狂暴几率", "抗水法狂暴");
      keys.put("抗雷法狂暴几率", "抗雷法狂暴");
      keys.put("抗鬼火狂暴几率", "抗鬼火狂暴");
      keys.put("风法狂暴几率", "风法狂暴");
      keys.put("火法狂暴几率", "火法狂暴");
      keys.put("水法狂暴几率", "水法狂暴");
      keys.put("雷法狂暴几率", "雷法狂暴");
      keys.put("鬼火狂暴几率", "鬼火狂暴");
      keys.put("三尸虫狂暴几率", "三尸虫狂暴");
      keys.put("附加毒攻击几率", "附加毒法攻击");
      keys.put("附加震慑攻击几率", "附加震慑攻击");
      Map var10000 = keys;
      String[] var10002 = new String[--4];
      boolean var10004 = true;
      var10002[3 >> 2] = "雷法狂暴程度";
      var10002[--1] = "风法狂暴程度";
      var10002[--2] = "水法狂暴程度";
      var10002[--3] = "火法狂暴程度";
      var10000.put("仙法狂暴程度", var10002);
      var10000 = keys;
      var10002 = new String[--4];
      var10004 = true;
      var10002[5 >> 3] = "雷法狂暴";
      var10002[--1] = "风法狂暴";
      var10002[--2] = "水法狂暴";
      var10002[--3] = "火法狂暴";
      var10000.put("仙法狂暴", var10002);
      var10000 = keys;
      var10002 = new String[--4];
      var10004 = true;
      var10002[3 >> 2] = "火法命中";
      var10002[--1] = "雷法命中";
      var10002[--2] = "风法命中";
      var10002[--3] = "水法命中";
      var10000.put("仙法命中", var10002);
      var10000 = keys;
      var10002 = new String[--4];
      var10004 = true;
      var10002[2 & 5] = "忽视抗雷";
      var10002[--1] = "忽视抗水";
      var10002[5 >> 1] = "忽视抗火";
      var10002[--3] = "忽视抗风";
      var10000.put("忽视仙法", var10002);
      var10000 = keys;
      var10002 = new String[--4];
      var10004 = true;
      var10002[3 & 4] = "忽视抗睡";
      var10002[3 >> 1] = "忽视抗毒";
      var10002[1 ^ 3] = "忽视抗封";
      var10002[--3] = "忽视抗混";
      var10000.put("忽视人法", var10002);
      var10000 = keys;
      var10002 = new String[--4];
      var10004 = true;
      var10002[3 ^ 3] = "毒法命中";
      var10002[4 ^ 5] = "封印命中";
      var10002[2] = "混乱命中";
      var10002[3] = "昏睡命中";
      var10000.put("人法命中", var10002);
      var10000 = keys;
      var10002 = new String[4];
      var10004 = true;
      var10002[3 >> 2] = "抗水";
      var10002[5 >> 2] = "抗火";
      var10002[2] = "抗雷";
      var10002[3] = "抗风";
      var10000.put("抗仙法", var10002);
      var10000 = keys;
      var10002 = new String[4];
      var10004 = true;
      var10002[5 >> 3] = "抗昏睡";
      var10002[--1] = "抗混乱";
      var10002[2] = "抗封印";
      var10002[3] = "抗中毒";
      var10000.put("抗人法", var10002);
      var10000 = keys;
      var10002 = new String[78 & 55];
      var10004 = true;
      var10002[3 >> 2] = "上善若水";
      var10002[--1] = "尘埃落定";
      var10002[2] = "美人迟暮";
      var10002[3] = "化血成碧";
      var10002[4] = "明珠有泪";
      var10002[5] = "灵犀一点";
      var10000.put("抗内丹", var10002);
      var10000 = keys;
      var10002 = new String[4];
      var10004 = true;
      var10002[3 ^ 3] = "加强风";
      var10002[--1] = "加强雷";
      var10002[2] = "加强火";
      var10002[3] = "加强水";
      var10000.put("强仙法", var10002);
      var10000 = keys;
      var10002 = new String[4];
      var10004 = true;
      var10002[0] = "加强昏睡";
      var10002[1] = "加强中毒";
      var10002[2] = "加强封印";
      var10002[3] = "加强混乱";
      var10000.put("强人法", var10002);
      var10000 = keys;
      var10002 = new String[4];
      var10004 = true;
      var10002[0] = "雷法伤害";
      var10002[1] = "水法伤害";
      var10002[2] = "风法伤害";
      var10002[3] = "火法伤害";
      var10000.put("仙法伤害", var10002);
      var10000 = keys;
      var10002 = new String[4];
      var10004 = true;
      var10002[0] = "抗混乱";
      var10002[1] = "抗昏睡";
      var10002[2] = "抗封印";
      var10002[3] = "抗遗忘";
      var10000.put("四抗", var10002);
      var10000 = keys;
      var10002 = new String[4];
      var10004 = true;
      var10002[0] = "抗混乱上限";
      var10002[1] = "抗昏睡上限";
      var10002[2] = "抗封印上限";
      var10002[3] = "抗遗忘上限";
      var10000.put("四抗上限", var10002);
      var10000 = keys;
      var10002 = new String[4];
      var10004 = true;
      var10002[0] = "忽视抗睡";
      var10002[1] = "忽视抗封";
      var10002[2] = "忽视抗混";
      var10002[3] = "忽视抗遗忘";
      var10000.put("忽视四抗", var10002);
      var10000 = keys;
      var10002 = new String[5];
      var10004 = true;
      var10002[0] = "忽视抗雷";
      var10002[1] = "忽视抗水";
      var10002[2] = "忽视抗火";
      var10002[3] = "忽视抗风";
      var10002[4] = "忽视鬼火";
      var10000.put("忽视抗仙法鬼火", var10002);
      var10000 = keys;
      var10002 = new String[5];
      var10004 = true;
      var10002[0] = "火法命中";
      var10002[1] = "雷法命中";
      var10002[2] = "风法命中";
      var10002[3] = "水法命中";
      var10002[4] = "鬼火命中";
      var10000.put("仙法鬼火命中率", var10002);
      var10000 = keys;
      var10002 = new String[5];
      var10004 = true;
      var10002[0] = "抗雷法狂暴";
      var10002[1] = "抗风法狂暴";
      var10002[2] = "抗水法狂暴";
      var10002[3] = "抗火法狂暴";
      var10002[4] = "抗鬼火狂暴";
      var10000.put("抗仙法鬼火狂暴率", var10002);
      keys.put("气血增加率", "加强气血");
      keys.put("魔法增加率", "加强魔法");
      keys.put("hp", "气血");
      keys.put("HP", "气血");
      keys.put("加气血", "气血");
      keys.put("附加气血", "气血");
      keys.put("mp", "法力");
      keys.put("MP", "法力");
      keys.put("魔法", "法力");
      keys.put("加魔法", "法力");
      keys.put("附加魔法", "法力");
      keys.put("恢复气血", "每回合HP");
      keys.put("恢复法力", "每回合MP");
      WL = "物理吸收";
   }

   public static void b(String var0, double var1, Map<String, Double> var3) {
      Object var4;
      Double var8;
      if ((var4 = keys.get(var0)) == null) {
         var8 = (var8 = (Double)var3.get(var0)) != null ? var8 + var1 : var1;
         var3.put(var0, var8);
      } else if (var4 instanceof String) {
         var0 = (String)var4;
         var8 = (var8 = (Double)var3.get(var0)) != null ? var8 + var1 : var1;
         var3.put(var0, var8);
      } else {
         if (var4 instanceof String[]) {
            String[] var5 = (String[])var4;

            int var7;
            for(int var10000 = var7 = 3 ^ 3; var10000 < var5.length; var10000 = var7) {
               Double var6 = (var6 = (Double)var3.get(var5[var7])) != null ? var6 + var1 : var1;
               var3.put(var5[var7++], var6);
            }
         }

      }
   }

   public static void c(Ql var0, String var1, double var2) {
      Object var4;
      if ((var4 = keys.get(var1)) == null) {
         d(var0, var1, var2);
      } else if (var4 instanceof String) {
         d(var0, (String)var4, var2);
      } else {
         if (var4 instanceof String[]) {
            String[] var5 = (String[])var4;

            int var6;
            for(int var10000 = var6 = 3 ^ 3; var10000 < var5.length; var10000 = var6) {
               d(var0, var5[var6++], var2);
            }
         }

      }
   }


   private static void d(Ql var0, String var1, double var2) {
      switch(var1.hashCode()) {
      case -2091530424:
         while(false) {
         }

         if (!var1.equals("加强霹雳效果")) {
            return;
         } else {
            var0.setQlpl(var0.getQlpl() + var2);
            return;
         }
      case -1999968977:
         if (!var1.equals("忽视抗遗忘")) {
            return;
         }

         var0.setRolehsyw(var0.getRolehsyw() + var2);
         return;
      case -1999915528:
         if (!var1.equals("忽视抗震慑")) {
            return;
         }

         var0.setRolehszs(var0.getRolehszs() + var2);
         return;
      case -1999878275:
         if (!var1.equals("忽视抗鬼火")) {
            return;
         }

         var0.setRolehsgh(var0.getRolehsgh() + var2);
         return;
      case -1980720918:
         if (!var1.equals("忽视反震几率")) {
            return;
         }

         var0.setEhsfzl(var0.getEhsfzl() + var2);
         return;
      case -1967484242:
         if (!var1.equals("仙法连击率")) {
            return;
         }

         var0.setRolexfljl(var0.getRolexfljl() + var2);
         return;
      case -1944210552:
         if (!var1.equals("霹雳暴击几率")) {
            return;
         }

         var0.setBjlpl(var0.getBjlpl() + var2);
         return;
      case -1767548599:
         if (!var1.equals("沧波暴击几率")) {
            return;
         }

         var0.setBjlcb(var0.getBjlcb() + var2);
         return;
      case -1717393177:
         if (!var1.equals("加强加速法术效果")) {
            return;
         }

         var0.setJqsdfs(var0.getJqsdfs() + var2);
         return;
      case -1639328833:
         if (!var1.equals("加强三尸虫回血程度")) {
            return;
         }

         var0.setRolestrongbodyblooddeep(var0.getRolestrongbodyblooddeep() + var2);
         return;
      case -1620819259:
         if (!var1.equals("被攻击时释放乾坤借速")) {
            return;
         }

         var0.setEfjjs(var0.getEfjjs() + var2);
         return;
      case -1608135126:
         if (!var1.equals("抗水法狂暴")) {
            return;
         }

         var0.setKbs(var0.getKbs() + var2);
         return;
      case -1580214290:
         if (!var1.equals("抗灵宝伤害")) {
            return;
         }

         var0.setJlb(var0.getJlb() + var2);
         return;
      case -1575990637:
         if (!var1.equals("抗火法狂暴")) {
            return;
         }

         var0.setKbh(var0.getKbh() + var2);
         return;
      case -1574841255:
         if (!var1.equals("被攻击时释放含情脉脉")) {
            return;
         }

         var0.setEfjkx(var0.getEfjkx() + var2);
         return;
      case -1510666933:
         if (!var1.equals("冰刃术伤害")) {
            return;
         }

         var0.setSbls(var0.getSbls() + var2);
         return;
      case -1487992193:
         if (!var1.equals("忽视防御几率")) {
            return;
         }

         var0.setRolehsfyl(var0.getRolehsfyl() + var2);
         return;
      case -1487678765:
         if (!var1.equals("忽视防御程度")) {
            return;
         }

         var0.setRolehsfyv(var0.getRolehsfyv() + var2);
         return;
      case -1284413843:
         if (!var1.equals("抗震慑气血")) {
            return;
         }

         var0.setK_zshp(var0.getK_zshp() + var2);
         return;
      case -1284045886:
         if (!var1.equals("抗震慑魔法")) {
            return;
         }

         var0.setK_zsmp(var0.getK_zsmp() + var2);
         return;
      case -1282013049:
         if (!var1.equals("抗雷法狂暴")) {
            return;
         }

         var0.setKbl(var0.getKbl() + var2);
         return;
      case -1267981488:
         if (!var1.equals("抗风法狂暴")) {
            return;
         }

         var0.setKbf(var0.getKbf() + var2);
         return;
      case -1248569288:
         if (!var1.equals("抗鬼火狂暴")) {
            return;
         }

         var0.setKbg(var0.getKbg() + var2);
         return;
      case -1200392901:
         if (!var1.equals("对召唤兽伤害")) {
            return;
         }

         var0.setQ_zhssh(var0.getQ_zhssh() + var2);
         return;
      case -1194311134:
         if (!var1.equals("加强三尸虫")) {
            return;
         }

         var0.setRolesssh(var0.getRolesssh() + var2);
         return;
      case -1187098233:
         if (!var1.equals("加强毒伤害")) {
            return;
         }

         var0.setQzds(var0.getQzds() + var2);
         return;
      case -1186108993:
         if (!var1.equals("扶摇暴击几率")) {
            return;
         }

         var0.setBjlfy(var0.getBjlfy() + var2);
         return;
      case -1083553685:
         if (!var1.equals("雷法伤害减免")) {
            return;
         }

         var0.setJlf(var0.getJlf() + var2);
         return;
      case -1083539874:
         if (!var1.equals("雷法伤害加深")) {
            return;
         }

         var0.setZlf(var0.getZlf() + var2);
         return;
      case -1059231031:
         if (!var1.equals("加攻暴击几率")) {
            return;
         }

         var0.setBjjg(var0.getBjjg() + var2);
         return;
      case -1025915216:
         if (!var1.equals("被攻击时释放魔神附身")) {
            return;
         }

         var0.setEfjll(var0.getEfjll() + var2);
         return;
      case -1009414731:
         if (!var1.equals("加强甘霖回血程度")) {
            return;
         }

         var0.setQlglc(var0.getQlglc() + var2);
         return;
      case -992375921:
         if (!var1.equals("遗忘暴击几率")) {
            return;
         }

         var0.setBjyw(var0.getBjyw() + var2);
         return;
      case -955631560:
         if (!var1.equals("无属性伤害")) {
            return;
         }

         var0.setRolewsxsh(var0.getRolewsxsh() + var2);
         return;
      case -954257074:
         if (!var1.equals("水法伤害减免")) {
            return;
         }

         var0.setJsf(var0.getJsf() + var2);
         return;
      case -954243263:
         if (!var1.equals("水法伤害加深")) {
            return;
         }

         var0.setZsf(var0.getZsf() + var2);
         return;
      case -951787075:
         if (!var1.equals("封印暴击几率")) {
            return;
         }

         var0.setBjfy(var0.getBjfy() + var2);
         return;
      case -906236052:
         if (!var1.equals("雷法暴击几率")) {
            return;
         }

         var0.setBjlf(var0.getBjlf() + var2);
         return;
      case -862510040:
         if (!var1.equals("仙法连击次数")) {
            return;
         }

         var0.setRolexfljs(var0.getRolexfljs() + var2);
         return;
      case -808889493:
         if (!var1.equals("雷法狂暴程度")) {
            return;
         }

         var0.setBlfcd(var0.getBlfcd() + var2);
         return;
      case -776939441:
         if (!var1.equals("水法暴击几率")) {
            return;
         }

         var0.setBjsf(var0.getBjsf() + var2);
         return;
      case -747909173:
         if (!var1.equals("震慑魔法伤害加深")) {
            return;
         }

         var0.setZzsmp(var0.getZzsmp() + var2);
         return;
      case -679592882:
         if (!var1.equals("水法狂暴程度")) {
            return;
         }

         var0.setBsfcd(var0.getBsfcd() + var2);
         return;
      case -538500623:
         if (!var1.equals("抵御强克效果")) {
            return;
         }

         var0.setK_qk(var0.getK_qk() + var2);
         return;
      case -484125452:
         if (!var1.equals("风法伤害减免")) {
            return;
         }

         var0.setJff(var0.getJff() + var2);
         return;
      case -484111641:
         if (!var1.equals("风法伤害加深")) {
            return;
         }

         var0.setZff(var0.getZff() + var2);
         return;
      case -367414304:
         if (!var1.equals("昏睡暴击几率")) {
            return;
         }

         var0.setBjhs(var0.getBjhs() + var2);
         return;
      case -306807819:
         if (!var1.equals("风法暴击几率")) {
            return;
         }

         var0.setBjff(var0.getBjff() + var2);
         return;
      case -281318022:
         if (!var1.equals("加强加防法术效果")) {
            return;
         }

         var0.setJqfyfs(var0.getJqfyfs() + var2);
         return;
      case -252587737:
         if (!var1.equals("增加强克效果")) {
            return;
         }

         var0.setQ_qk(var0.getQ_qk() + var2);
         return;
      case -209461260:
         if (!var1.equals("风法狂暴程度")) {
            return;
         }

         var0.setBffcd(var0.getBffcd() + var2);
         return;
      case -173175638:
         if (!var1.equals("三尸虫暴击几率")) {
            return;
         }

         var0.setBjsc(var0.getBjsc() + var2);
         return;
      case -128174217:
         if (!var1.equals("火法伤害减免")) {
            return;
         }

         var0.setJhf(var0.getJhf() + var2);
         return;
      case -128160406:
         if (!var1.equals("火法伤害加深")) {
            return;
         }

         var0.setZhf(var0.getZhf() + var2);
         return;
      case -75829079:
         if (!var1.equals("三尸虫狂暴程度")) {
            return;
         }

         var0.setBsccd(var0.getBsccd() + var2);
         return;
      case 22303:
         if (!var1.equals("土")) {
            return;
         }

         var0.setRolewxt(var0.getRolewxt() + var2);
         return;
      case 26408:
         if (!var1.equals("木")) {
            return;
         }

         var0.setRolewxm(var0.getRolewxm() + var2);
         return;
      case 27700:
         if (!var1.equals("水")) {
            return;
         }

         var0.setRolewxs(var0.getRolewxs() + var2);
         return;
      case 28779:
         if (!var1.equals("火")) {
            return;
         }

         var0.setRolewxh(var0.getRolewxh() + var2);
         return;
      case 37329:
         if (!var1.equals("金")) {
            return;
         }

         var0.setRolewxj(var0.getRolewxj() + var2);
         return;
      case 810109:
         if (!var1.equals("抗水")) {
            return;
         }

         var0.setRoleksf(var0.getRoleksf() + var2);
         return;
      case 811188:
         if (!var1.equals("抗火")) {
            return;
         }

         var0.setRolekhf(var0.getRolekhf() + var2);
         return;
      case 821056:
         if (!var1.equals("抗雷")) {
            return;
         }

         var0.setRoleklf(var0.getRoleklf() + var2);
         return;
      case 821527:
         if (!var1.equals("抗风")) {
            return;
         }

         var0.setRolekff(var0.getRolekff() + var2);
         return;
      case 1216431:
         if (!var1.equals("防御")) {
            return;
         }

         var0.setKwlgj(var0.getKwlgj() + var2);
         return;
      case 21110490:
         if (!var1.equals("加强水")) {
            return;
         }

         var0.setRoleqsf(var0.getRoleqsf() + var2);
         return;
      case 21111569:
         if (!var1.equals("加强火")) {
            return;
         }

         var0.setRoleqhf(var0.getRoleqhf() + var2);
         return;
      case 21121437:
         if (!var1.equals("加强雷")) {
            return;
         }

         var0.setRoleqlf(var0.getRoleqlf() + var2);
         return;
      case 21121908:
         if (!var1.equals("加强风")) {
            return;
         }

         var0.setRoleqff(var0.getRoleqff() + var2);
         return;
      case 21296505:
         if (!var1.equals("反击率")) {
            return;
         }

         var0.setRoleffjl(var0.getRoleffjl() + var2);
         return;
      case 21435447:
         if (!var1.equals("命中率")) {
            return;
         }

         var0.setRolefmzl(var0.getRolefmzl() + var2);
         return;
      case 21844461:
         if (!var1.equals("反震率")) {
            return;
         }

         var0.setRoleffzl(var0.getRoleffzl() + var2);
         return;
      case 24227814:
         if (!var1.equals("强情网")) {
            return;
         }

         var0.setQqw(var0.getQqw() + var2);
         return;
      case 24616086:
         if (!var1.equals("强金箍")) {
            return;
         }

         var0.setQjg(var0.getQjg() + var2);
         return;
      case 24902684:
         if (!var1.equals("抗中毒")) {
            return;
         }

         var0.setRolekzd(var0.getRolekzd() + var2);
         return;
      case 25006182:
         if (!var1.equals("抗封印")) {
            return;
         }

         var0.setRolekfy(var0.getRolekfy() + var2);
         return;
      case 25055235:
         if (!var1.equals("抗情网")) {
            return;
         }

         var0.setK_qw(var0.getK_qw() + var2);
         return;
      case 25095177:
         if (!var1.equals("抗昏睡")) {
            return;
         }

         var0.setRolekhs(var0.getRolekhs() + var2);
         return;
      case 25130601:
         if (!var1.equals("抗毒伤")) {
            return;
         }

         var0.setKzds(var0.getKzds() + var2);
         return;
      case 25147441:
         if (!var1.equals("抗混乱")) {
            return;
         }

         var0.setRolekhl(var0.getRolekhl() + var2);
         return;
      case 25424696:
         if (!var1.equals("抗遗忘")) {
            return;
         }

         var0.setRolekyw(var0.getRolekyw() + var2);
         return;
      case 25443507:
         if (!var1.equals("抗金箍")) {
            return;
         }

         var0.setK_jge(var0.getK_jge() + var2);
         return;
      case 25478145:
         if (!var1.equals("抗震慑")) {
            return;
         }

         var0.setRolekzs(var0.getRolekzs() + var2);
         return;
      case 25515398:
         if (!var1.equals("抗鬼火")) {
            return;
         }

         var0.setRolekgh(var0.getRolekgh() + var2);
         return;
      case 29076885:
         if (!var1.equals("狂暴率")) {
            return;
         }

         var0.setRolefkbl(var0.getRolefkbl() + var2);
         return;
      case 32670622:
         if (!var1.equals("致命率")) {
            return;
         }

         var0.setRolefzml(var0.getRolefzml() + var2);
         return;
      case 36073802:
         if (!var1.equals("连击率")) {
            return;
         }

         var0.setRolefljl(var0.getRolefljl() + var2);
         return;
      case 36324623:
         if (!var1.equals("躲闪率")) {
            return;
         }

         var0.setRolefdsl(var0.getRolefdsl() + var2);
         return;
      case 49143416:
         if (!var1.equals("火法暴击几率")) {
            return;
         }

         var0.setBjhf(var0.getBjhf() + var2);
         return;
      case 61004801:
         if (!var1.equals("抗无属性伤害")) {
            return;
         }

         var0.setK_wsxsh(var0.getK_wsxsh() + var2);
         return;
      case 105974082:
         if (!var1.equals("加强甘霖回血值")) {
            return;
         }

         var0.setQlglv(var0.getQlglv() + var2);
         return;
      case 146489975:
         if (!var1.equals("火法狂暴程度")) {
            return;
         }

         var0.setBhfcd(var0.getBhfcd() + var2);
         return;
      case 288414768:
         if (!var1.equals("忽视仙法抗性程度")) {
            return;
         }

         var0.setRolehsxfcd(var0.getRolehsxfcd() + var2);
         return;
      case 472679051:
         if (!var1.equals("附加三尸攻击")) {
            return;
         }

         var0.setF_sc(var0.getF_sc() + var2);
         return;
      case 491094957:
         if (!var1.equals("加速暴击几率")) {
            return;
         }

         var0.setBjjs(var0.getBjjs() + var2);
         return;
      case 535067235:
         if (!var1.equals("毒法伤害加深")) {
            return;
         }

         var0.setZdf(var0.getZdf() + var2);
         return;
      case 577051339:
         if (!var1.equals("附加封印攻击")) {
            return;
         }

         var0.setF_f(var0.getF_f() + var2);
         return;
      case 617269289:
         if (!var1.equals("上善若水")) {
            return;
         }

         var0.setK_ndhr(var0.getK_ndhr() + var2);
         return;
      case 626795181:
         if (!var1.equals("伤害减免")) {
            return;
         }

         var0.setEjs(var0.getEjs() + var2);
         return;
      case 626808992:
         if (!var1.equals("伤害加深")) {
            return;
         }

         var0.setEzs(var0.getEzs() + var2);
         return;
      case 654214495:
         if (!var1.equals("加强中毒")) {
            return;
         }

         var0.setRoleqzd(var0.getRoleqzd() + var2);
         return;
      case 654317993:
         if (!var1.equals("加强封印")) {
            return;
         }

         var0.setRoleqfy(var0.getRoleqfy() + var2);
         return;
      case 654406988:
         if (!var1.equals("加强昏睡")) {
            return;
         }

         var0.setRoleqhs(var0.getRoleqhs() + var2);
         return;
      case 654459252:
         if (!var1.equals("加强混乱")) {
            return;
         }

         var0.setRoleqhl(var0.getRoleqhl() + var2);
         return;
      case 654736507:
         if (!var1.equals("加强遗忘")) {
            return;
         }

         var0.setRolestrongforget(var0.getRolestrongforget() + var2);
         return;
      case 654789956:
         if (!var1.equals("加强震慑")) {
            return;
         }

         var0.setRoleqzs(var0.getRoleqzs() + var2);
         return;
      case 654823494:
         if (!var1.equals("加强魅惑")) {
            return;
         }

         var0.setQmh(var0.getQmh() + var2);
         return;
      case 654827209:
         if (!var1.equals("加强鬼火")) {
            return;
         }

         var0.setRolegstronghostfire(var0.getRolegstronghostfire() + var2);
         return;
      case 654846984:
         if (!var1.equals("混乱暴击几率")) {
            return;
         }

         var0.setBjhl(var0.getBjhl() + var2);
         return;
      case 660150973:
         if (!var1.equals("反击次数")) {
            return;
         }

         var0.setRoleffjv(var0.getRoleffjv() + var2);
         return;
      case 667983361:
         if (!var1.equals("化血成碧")) {
            return;
         }

         var0.setK_ndtm(var0.getK_ndtm() + var2);
         return;
      case 677254229:
         if (!var1.equals("反震程度")) {
            return;
         }

         var0.setRoleffzcd(var0.getRoleffzcd() + var2);
         return;
      case 703922559:
         if (!var1.equals("附加毒法攻击")) {
            return;
         }

         var0.setF_d(var0.getF_d() + var2);
         return;
      case 706842077:
         if (!var1.equals("附加水法攻击")) {
            return;
         }

         var0.setF_xs(var0.getF_xs() + var2);
         return;
      case 712371057:
         if (!var1.equals("毒法暴击几率")) {
            return;
         }

         var0.setBjzd(var0.getBjzd() + var2);
         return;
      case 712801238:
         if (!var1.equals("附加混乱攻击")) {
            return;
         }

         var0.setF_h(var0.getF_h() + var2);
         return;
      case 722884895:
         if (!var1.equals("封印命中")) {
            return;
         }

         var0.setMfy(var0.getMfy() + var2);
         return;
      case 723365191:
         if (!var1.equals("封印躲闪")) {
            return;
         }

         var0.setDfy(var0.getDfy() + var2);
         return;
      case 725016296:
         if (!var1.equals("尘埃落定")) {
            return;
         }

         var0.setKgs(var0.getKgs() + var2);
         return;
      case 738986566:
         if (!var1.equals("附加火法攻击")) {
            return;
         }

         var0.setF_xh(var0.getF_xh() + var2);
         return;
      case 747234709:
         if (!var1.equals("强力克土")) {
            return;
         }

         var0.setRolewxqkt(var0.getRolewxqkt() + var2);
         return;
      case 747238814:
         if (!var1.equals("强力克木")) {
            return;
         }

         var0.setRolewxqkm(var0.getRolewxqkm() + var2);
         return;
      case 747240106:
         if (!var1.equals("强力克水")) {
            return;
         }

         var0.setRolewxqks(var0.getRolewxqks() + var2);
         return;
      case 747241185:
         if (!var1.equals("强力克火")) {
            return;
         }

         var0.setRolewxqkh(var0.getRolewxqkh() + var2);
         return;
      case 747249735:
         if (!var1.equals("强力克金")) {
            return;
         }

         var0.setRolewxqkj(var0.getRolewxqkj() + var2);
         return;
      case 766634743:
         if (!var1.equals("忽视反击")) {
            return;
         }

         var0.setRolehsfj(var0.getRolehsfj() + var2);
         return;
      case 766754675:
         if (!var1.equals("忽视抗封")) {
            return;
         }

         var0.setRolehsfy(var0.getRolehsfy() + var2);
         return;
      case 766758724:
         if (!var1.equals("忽视抗毒")) {
            return;
         }

         var0.setRolehszd(var0.getRolehszd() + var2);
         return;
      case 766758822:
         if (!var1.equals("忽视抗水")) {
            return;
         }

         var0.setRolehssf(var0.getRolehssf() + var2);
         return;
      case 766759273:
         if (!var1.equals("忽视抗混")) {
            return;
         }

         var0.setRolehshl(var0.getRolehshl() + var2);
         return;
      case 766759901:
         if (!var1.equals("忽视抗火")) {
            return;
         }

         var0.setRolehshf(var0.getRolehshf() + var2);
         return;
      case 766761683:
         if (!var1.equals("忽视抗睡")) {
            return;
         }

         var0.setRolehshs(var0.getRolehshs() + var2);
         return;
      case 766769769:
         if (!var1.equals("忽视抗雷")) {
            return;
         }

         var0.setRolehslf(var0.getRolehslf() + var2);
         return;
      case 766770240:
         if (!var1.equals("忽视抗风")) {
            return;
         }

         var0.setRolehsff(var0.getRolehsff() + var2);
         return;
      case 771859205:
         if (!var1.equals("抗三尸虫")) {
            return;
         }

         var0.setRoleksc(var0.getRoleksc() + var2);
         return;
      case 784565671:
         if (!var1.equals("抗致命率")) {
            return;
         }

         var0.setKzml(var0.getKzml() + var2);
         return;
      case 807672339:
         if (!var1.equals("明珠有泪")) {
            return;
         }

         var0.setK_ndxl(var0.getK_ndxl() + var2);
         return;
      case 808409090:
         if (!var1.equals("昏睡命中")) {
            return;
         }

         var0.setMhs(var0.getMhs() + var2);
         return;
      case 808889386:
         if (!var1.equals("昏睡躲闪")) {
            return;
         }

         var0.setDhs(var0.getDhs() + var2);
         return;
      case 849756115:
         if (!var1.equals("毒法命中")) {
            return;
         }

         var0.setMdf(var0.getMdf() + var2);
         return;
      case 850236411:
         if (!var1.equals("毒法躲闪")) {
            return;
         }

         var0.setDdf(var0.getDdf() + var2);
         return;
      case 852636656:
         if (!var1.equals("水法伤害")) {
            return;
         }

         var0.setRolesfsh(var0.getRolesfsh() + var2);
         return;
      case 852671151:
         if (!var1.equals("水法反击")) {
            return;
         }

         var0.setEfjsf(var0.getEfjsf() + var2);
         return;
      case 852675633:
         if (!var1.equals("水法命中")) {
            return;
         }

         var0.setMsf(var0.getMsf() + var2);
         return;
      case 852922131:
         if (!var1.equals("水法狂暴")) {
            return;
         }

         var0.setRolesfkb(var0.getRolesfkb() + var2);
         return;
      case 853155929:
         if (!var1.equals("水法躲闪")) {
            return;
         }

         var0.setDsf(var0.getDsf() + var2);
         return;
      case 856043401:
         if (!var1.equals("法术伤害")) {
            return;
         }

         var0.setSfs(var0.getSfs() + var2);
         return;
      case 856082378:
         if (!var1.equals("法术命中")) {
            return;
         }

         var0.setEfsmz(var0.getEfsmz() + var2);
         return;
      case 856562674:
         if (!var1.equals("法术躲闪")) {
            return;
         }

         var0.setEfsds(var0.getEfsds() + var2);
         return;
      case 856608297:
         if (!var1.equals("法术防御")) {
            return;
         }

         var0.setKfs(var0.getKfs() + var2);
         return;
      case 858634794:
         if (!var1.equals("混乱命中")) {
            return;
         }

         var0.setMhl(var0.getMhl() + var2);
         return;
      case 859115090:
         if (!var1.equals("混乱躲闪")) {
            return;
         }

         var0.setDhl(var0.getDhl() + var2);
         return;
      case 884781145:
         if (!var1.equals("火法伤害")) {
            return;
         }

         var0.setRolehfsh(var0.getRolehfsh() + var2);
         return;
      case 884815640:
         if (!var1.equals("火法反击")) {
            return;
         }

         var0.setEfjhf(var0.getEfjhf() + var2);
         return;
      case 884820122:
         if (!var1.equals("火法命中")) {
            return;
         }

         var0.setMhf(var0.getMhf() + var2);
         return;
      case 885066620:
         if (!var1.equals("火法狂暴")) {
            return;
         }

         var0.setRolehfkb(var0.getRolehfkb() + var2);
         return;
      case 885300418:
         if (!var1.equals("火法躲闪")) {
            return;
         }

         var0.setDhf(var0.getDhf() + var2);
         return;
      case 886469796:
         if (!var1.equals("灵犀一点")) {
            return;
         }

         var0.setK_ndfg(var0.getK_ndfg() + var2);
         return;
      case 901786491:
         if (!var1.equals("物理吸收")) {
            return;
         }

         var0.setRolekwl(var0.getRolekwl() + var2);
         return;
      case 991129564:
         if (!var1.equals("鬼火伤害减免")) {
            return;
         }

         var0.setJgh(var0.getJgh() + var2);
         return;
      case 991143375:
         if (!var1.equals("鬼火伤害加深")) {
            return;
         }

         var0.setZgh(var0.getZgh() + var2);
         return;
      case 993331355:
         if (!var1.equals("美人迟暮")) {
            return;
         }

         var0.setK_ndqm(var0.getK_ndqm() + var2);
         return;
      case 994317379:
         if (!var1.equals("随机抗灵宝伤害")) {
            return;
         }

         var0.setKlb(var0.getKlb() + var2);
         return;
      case 1027248131:
         if (!var1.equals("加强加攻法术效果")) {
            return;
         }

         var0.setJqgjfs(var0.getJqgjfs() + var2);
         return;
      case 1030607782:
         if (!var1.equals("附加震慑攻击")) {
            return;
         }

         var0.setF_zs(var0.getF_zs() + var2);
         return;
      case 1032964154:
         if (!var1.equals("附加雷法攻击")) {
            return;
         }

         var0.setF_xl(var0.getF_xl() + var2);
         return;
      case 1046995715:
         if (!var1.equals("附加风法攻击")) {
            return;
         }

         var0.setF_xf(var0.getF_xf() + var2);
         return;
      case 1118247180:
         if (!var1.equals("连击次数")) {
            return;
         }

         var0.setRolefljv(var0.getRolefljv() + var2);
         return;
      case 1124257752:
         if (!var1.equals("震慑暴击几率")) {
            return;
         }

         var0.setBjzs(var0.getBjzs() + var2);
         return;
      case 1125076849:
         if (!var1.equals("遗忘命中")) {
            return;
         }

         var0.setMyw(var0.getMyw() + var2);
         return;
      case 1125557145:
         if (!var1.equals("遗忘躲闪")) {
            return;
         }

         var0.setDyw(var0.getDyw() + var2);
         return;
      case 1168447197:
         if (!var1.equals("鬼火暴击几率")) {
            return;
         }

         var0.setBjgh(var0.getBjgh() + var2);
         return;
      case 1176441338:
         if (!var1.equals("震慑命中")) {
            return;
         }

         var0.setMzs(var0.getMzs() + var2);
         return;
      case 1176921634:
         if (!var1.equals("震慑躲闪")) {
            return;
         }

         var0.setDzs(var0.getDzs() + var2);
         return;
      case 1178758733:
         if (!var1.equals("雷法伤害")) {
            return;
         }

         var0.setRolelfsh(var0.getRolelfsh() + var2);
         return;
      case 1178793228:
         if (!var1.equals("雷法反击")) {
            return;
         }

         var0.setEfjlf(var0.getEfjlf() + var2);
         return;
      case 1178797710:
         if (!var1.equals("雷法命中")) {
            return;
         }

         var0.setMlf(var0.getMlf() + var2);
         return;
      case 1179044208:
         if (!var1.equals("雷法狂暴")) {
            return;
         }

         var0.setRolelfkb(var0.getRolelfkb() + var2);
         return;
      case 1179278006:
         if (!var1.equals("雷法躲闪")) {
            return;
         }

         var0.setDlf(var0.getDlf() + var2);
         return;
      case 1192790294:
         if (!var1.equals("风法伤害")) {
            return;
         }

         var0.setRoleffsh(var0.getRoleffsh() + var2);
         return;
      case 1192824789:
         if (!var1.equals("风法反击")) {
            return;
         }

         var0.setEfjff(var0.getEfjff() + var2);
         return;
      case 1192829271:
         if (!var1.equals("风法命中")) {
            return;
         }

         var0.setMff(var0.getMff() + var2);
         return;
      case 1193075769:
         if (!var1.equals("风法狂暴")) {
            return;
         }

         var0.setRoleffkb(var0.getRoleffkb() + var2);
         return;
      case 1193309567:
         if (!var1.equals("风法躲闪")) {
            return;
         }

         var0.setDff(var0.getDff() + var2);
         return;
      case 1212202494:
         if (!var1.equals("鬼火伤害")) {
            return;
         }

         var0.setRoleghsh(var0.getRoleghsh() + var2);
         return;
      case 1212241471:
         if (!var1.equals("鬼火命中")) {
            return;
         }

         var0.setMgh(var0.getMgh() + var2);
         return;
      case 1212487969:
         if (!var1.equals("鬼火狂暴")) {
            return;
         }

         var0.setRoleghkb(var0.getRoleghkb() + var2);
         return;
      case 1212721767:
         if (!var1.equals("鬼火躲闪")) {
            return;
         }

         var0.setDgh(var0.getDgh() + var2);
         return;
      case 1265793756:
         if (!var1.equals("鬼火狂暴程度")) {
            return;
         }

         var0.setBghcd(var0.getBghcd() + var2);
         return;
      case 1358290860:
         if (!var1.equals("甘霖暴击几率")) {
            return;
         }

         var0.setBjlgl(var0.getBjlgl() + var2);
         return;
      case 1533321906:
         if (!var1.equals("忽视仙法抗性率")) {
            return;
         }

         var0.setRolehsxfkl(var0.getRolehsxfkl() + var2);
         return;
      case 1664653415:
         if (!var1.equals("加强全系法术")) {
            return;
         }

         var0.c(var2);
         return;
      case 1788583743:
         if (!var1.equals("加强扶摇效果")) {
            return;
         }

         var0.setQlfy(var0.getQlfy() + var2);
         return;
      case 1868425545:
         if (!var1.equals("加强沧波效果")) {
            return;
         }

         var0.setQlcb(var0.getQlcb() + var2);
         return;
      case 1927170112:
         if (!var1.equals("加防暴击几率")) {
            return;
         }

         var0.setBjjf(var0.getBjjf() + var2);
         return;
      case 2006375244:
         if (!var1.equals("三尸虫命中")) {
            return;
         }

         var0.setMsc(var0.getMsc() + var2);
         return;
      case 2006621742:
         if (!var1.equals("三尸虫狂暴")) {
            return;
         }

         var0.setRolesskb(var0.getRolesskb() + var2);
         return;
      case 2006855540:
         if (!var1.equals("三尸虫躲闪")) {
            return;
         }

         var0.setDsc(var0.getDsc() + var2);
         return;
      case 2032533978:
         if (!var1.equals("魅惑暴击几率")) {
            return;
         }

         var0.setBjmh(var0.getBjmh() + var2);
         return;
      default:
      }
   }
}
