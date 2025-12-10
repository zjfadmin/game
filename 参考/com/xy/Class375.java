package com.xy;

import com.xy.readbean.RookieGuideBean;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import javax.swing.tree.DefaultMutableTreeNode;

public class Class375 {
   public static String[] a;

   public static void a(DefaultMutableTreeNode var0, Class603 var1) {
      int var2;
      for(int var10000 = var2 = 3 >> 2; var10000 < a.length; var10000 = var2) {
         DefaultMutableTreeNode var4 = new DefaultMutableTreeNode(a[var2]);
         List var3;
         int var5;
         if (b(a[var2]) != null && (var3 = e(b(a[var2]), var1)) != null && var3.size() > 0) {
            for(var10000 = var5 = 3 ^ 3; var10000 < var3.size(); var10000 = var5) {
               var4.add(new DefaultMutableTreeNode(var3.get(var5++)));
            }
         }

         ++var2;
         var0.add(var4);
      }

   }

   public static Integer b(String var0) {
      int var1 = 2 & 5;
      int var10000;
      if (var0.equals("游戏介绍")) {
         var10000 = var1 = 2 ^ 3;
      } else if (var0.equals("充值比例")) {
         var10000 = var1 = 5 >> 1;
      } else if (var0.equals("升级攻略")) {
         var10000 = var1 = --3;
      } else if (var0.equals("装备玩法")) {
         var10000 = var1 = --4;
      } else if (var0.equals("活动玩法")) {
         var10000 = var1 = --5;
      } else if (var0.equals("灵宝符石")) {
         var10000 = var1 = 103 & 30;
      } else if (var0.equals("子女培养")) {
         var10000 = var1 = 103 & 31;
      } else if (var0.equals("版本特色")) {
         var10000 = var1 = 126 & 9;
      } else if (var0.equals("功能介绍")) {
         var10000 = var1 = 93 & 43;
      } else {
         if (var0.equals("套装系统")) {
            var1 = 59 & 78;
         }

         var10000 = var1;
      }

      return var10000 == 0 ? null : var1;
   }

   public static String c(String var0, Class603 var1) {
      String var2 = "";

      Iterator var4;
      for(Iterator var10000 = var4 = var1.al().getRookieguide().entrySet().iterator(); var10000.hasNext(); var10000 = var4) {
         Entry var3;
         if (((RookieGuideBean)(var3 = (Entry)var4.next()).getValue()).getGuidename().equals(var0)) {
            var2 = ((RookieGuideBean)var3.getValue()).getBootcontent();
         }
      }

      if (var2.equals("")) {
         return null;
      } else {
         return var2;
      }
   }

   public static String d(String var0) {
      String var1 = "";
      String var10000;
      if (var0.equals("游戏介绍")) {
         var10000 = var1 = "#r #r#Y欢迎来到大话西游!!! #38#38#r #r#W本服是工作室历时一年#R自主研发#W版本,不是随风,不是木头.#r #r涵盖30种真实#G灵宝#W,#G法宝#W系统,#G龙神大炮帮战#W系统,自带真实#G天生技能#W,#G召唤兽饰品#W系统,#G套装#W系统,真实#G飞升点化#W,官服的#GAI挑战#W体制,进阶式的玩法。#r #r后续将推出#G光武#W系统,#G坐骑染色#W等好玩的系统。#28#115#r #r平民靠#R时间#W能拥有一切,#R仿官长久服#W,非一两天顶级,适合平民,商人入驻,喜欢快餐的绕道!#r #r本游戏对运行电脑有一定的要求,具体可以查看群文件的（游戏运行环境及建议）选择自己合适的游戏方式!";
      } else if (var0.equals("充值比例")) {
         var10000 = var1 = "#r #r#Y本服充值比例#R 1 #Y比#R 100 #Y,需要充值的玩家打开商城,选择元宝充值!#r #r#W充值#G 100  #W送#G 100 #W#r充值#G 200  #W送#G 200 #W#r充值#G 300  #W送#G 300 #W#r充值#G 400  #W送#G 400 #W#r充值#G 500  #W送#G 500 #W#r充值#G 1000 #W送#G 1000 #W#r充值#G 3000 #W送#G 3000 #W#r #r本服一切充值走商城,赠送福利自动到账,无额外福利、以及线下充值的说法,为了游戏的公平稳定性,请免开尊口! ";
      } else if (var0.equals("升级攻略")) {
         var10000 = var1 = "#r #r新手玩家创建好角色以后进入游戏,找（#G44#W,#G9#W）#G新手使者#W领取#R新手礼包#W,#r #r然后到#Y长安杂货店#W购买人参果,吃到#R31#W级后购买15个蟠桃王,#r #r到#Y长安桥#WNPC#G张闻#W处传送到长安比武馆,根据当前种族选择对应的法术师门传送,学习完技能以后就可以开始升级了.#r #r由于本游戏对电脑配置有一定要求,无法多开的玩家可以使用新手礼包里赠送的#R单人礼盒#W进行单人升级，#r #r前期多开党升级队伍推荐:#G 人-魔-魔-仙-仙#W，升级以睡杀为主,出手顺序:#G 魔抽-仙秒-人睡#W,仅供参考,玩家根据实际情况进行调整!";
      } else if (var0.equals("装备玩法")) {
         var10000 = var1 = "#r #r#G本服装备属性#R 80％#G接近官方，若对装备属性不懂的玩家可以查询官方！";
      } else if (var0.equals("活动玩法")) {
         var10000 = var1 = "";
      } else if (var0.equals("灵宝符石")) {
         var10000 = var1 = "";
      } else if (var0.equals("子女培养")) {
         var10000 = var1 = "#r #r游戏里相爱的男、女角色可以一起组队到#Y长安城#W（#G232#W,#G224#W）#G月老#W处进行结婚.#r #r婚后可以组队到#Y长安城#W（#G162#W,#G121#W）#G超级管家#W处开始洞房,洞房完毕后等待1分钟孩子出生,#r #r女方选择确定则孩子在女方身上,女方选择取消则孩子在男方身上!";
      } else if (var0.equals("版本特色")) {
         var10000 = var1 = "#r #r#Y                唯一独家版本#r #r#W本服模拟官方运营，采用#G官方全服几率制#W设定#r #r让你体验#R 70% #W相似程度仿官玩法，官方#G怪物智能AI#W,#G几率感#W，让你充满激情。#r #r#W采用官方#R怀旧#W活动主题，#G城东魅影#W，#G龙宫寻宝#W，#G大闹天宫#W，#G天降灵猴#W，#G天宫寻宝#W，#G天降祥瑞#W，#G年年有鱼#W，等等。";
      } else if (var0.equals("功能介绍")) {
         var10000 = var1 = "#r #r#Y快捷键：（#R和官方99%一致#Y）#r#G战斗外：#W#r#YAlt+1：#W小地图          #YAlt+S：#W系统设置#r#YAlt+W：#W人物信息        #YAlt+R：#W坐骑#r#YAlt+X：#W交易            #YAlt+E：#W道具栏#r#YAlt+Q：#W任务栏          #YAlt+T：#W组队功能#r#YAlt+Y：#W孩子功能        #YAlt+A：#W切磋#r#YAlt+O：#W召唤兽界面      #YAlt+F：#W好友功能#r#YAlt+V：#W法宝界面        #YAlt+M：#W帮派界面#r#YAlt+G：#W给予 #r #r#G战斗内：#r#YAlt+W：#W法术列表        #YAlt+E：#W道具栏#r#YAlt+D：#W防御            #YAlt+T：#W保护#r#YAlt+A：#W随机物理攻击    #YAlt+B：#W捕抓#r#YAlt+S：#W上一次使用过的技能#r #r#R下载游戏：#r#W当前所在群聊打#G 下载 #W，机器人回复有群空间#G下载地址#W。切记#Y关闭杀毒软件#W，不然客户端不能正常安装使用。#r #r#R游戏注册：#r#W可在群聊内输入#G 注册 #W，机器人自动回复。#r客户端#Y更新完毕#W后，点#G 开始游戏 #W进入登录窗口#Y选择区服#W进入账号界面点击#G注册#W。#r #r#R创建角色：#r#W根据自身情况创建好角色#r#YNPC新手使者#W有新手宠物，根据#G自己的喜好#W带上一只就开干吧#89#r#Y新手礼包#W打开可获得#G新手装备#W一套。#28#r #r";
      } else {
         if (var0.equals("套装系统")) {
            var1 = "#r #r#Y                套装系统#r#W分为:#r#G套装合成     套装洗练     套装收录#r套装洗练     套装升级     套装转移/拆解#r #r#Y灵修值:#r#W作为套装所有功能的#R基础材料#W，灵修值可以使用#Y九天玄玉#W来兑换，也可以使用#Y无用的玉符#W来兑换，#r #r#W注：#R玉符和合成后的套装都无法交易。";
         }

         var10000 = var1;
      }

      return var10000.equals("") ? null : var1;
   }

   static {
      String[] var10000 = new String[104 & 31];
      boolean var10002 = true;
      var10000[3 & 4] = "版本特色";
      var10000[3 & 5] = "功能介绍";
      var10000[--2] = "升级攻略";
      var10000[--3] = "装备玩法";
      var10000[--4] = "套装系统";
      var10000[--5] = "活动玩法";
      var10000[111 & 22] = "灵宝符石";
      var10000[23 & 111] = "子女培养";
      a = var10000;
   }

   public static List<String> e(int var0, Class603 var1) {
      if (var1.al().getRookieguide() == null) {
         return null;
      } else {
         ArrayList var2 = new ArrayList();

         Iterator var4;
         for(Iterator var10000 = var4 = var1.al().getRookieguide().entrySet().iterator(); var10000.hasNext(); var10000 = var4) {
            Entry var3;
            if (((RookieGuideBean)(var3 = (Entry)var4.next()).getValue()).getFid() == var0) {
               var2.add(((RookieGuideBean)var3.getValue()).getGuidename());
            }
         }

         if (var0 == --5) {
            ArrayList var6 = new ArrayList();

            int var5;
            int var7;
            for(var7 = var5 = 3 >> 2; var7 < var2.size(); var7 = var5) {
               var6.add((String)var2.get(var5++));
            }

            for(var7 = var5 = 3 ^ 3; var7 < var2.size(); var7 = var5) {
               if (((String)var2.get(var5)).equals("周一活动")) {
                  var6.set(3 >> 2, (String)var2.get(var5));
               } else if (((String)var2.get(var5)).equals("周二活动")) {
                  var6.set(2 ^ 3, (String)var2.get(var5));
               } else if (((String)var2.get(var5)).equals("周三活动")) {
                  var6.set(1 ^ 3, (String)var2.get(var5));
               } else if (((String)var2.get(var5)).equals("周四活动")) {
                  var6.set(--3, (String)var2.get(var5));
               } else if (((String)var2.get(var5)).equals("周五活动")) {
                  var6.set(--4, (String)var2.get(var5));
               } else if (((String)var2.get(var5)).equals("周六活动")) {
                  var6.set(--5, (String)var2.get(var5));
               } else if (((String)var2.get(var5)).equals("周日活动")) {
                  var6.set(118 & 15, (String)var2.get(var5));
               } else if (((String)var2.get(var5)).equals("地煞星分布")) {
                  var6.set(47 & 87, (String)var2.get(var5));
               } else if (((String)var2.get(var5)).equals("进阶挑战")) {
                  var6.set(11 & 124, (String)var2.get(var5));
               }

               ++var5;
            }

            var2.clear();
            var2 = var6;
         }

         return var2;
      }
   }
}
