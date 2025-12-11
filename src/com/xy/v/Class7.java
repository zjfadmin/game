package com.xy.v;

import com.xy.readbean.RookieGuideBean;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import javax.swing.tree.DefaultMutableTreeNode;

public class Class7 {
   public static String[] a;

   public static void a(DefaultMutableTreeNode var0, Class8 var1) {
      int var2;
      for (int var10000 = var2 = 0; var10000 < a.length; var10000 = var2) {
         DefaultMutableTreeNode var3 = new DefaultMutableTreeNode(a[var2]);
         List var4;
         int var5;
         if (d(a[var2]) != null && (var4 = e(d(a[var2]), var1)) != null && var4.size() > 0) {
            for (int var6 = var5 = 0; var6 < var4.size(); var6 = var5) {
               var3.add(new DefaultMutableTreeNode(var4.get(var5++)));
            }
         }

         var2++;
         var0.add(var3);
      }
   }

   public static String b(String var0, Class8 var1) {
      String var2 = "";

      Iterator var3;
      for (Iterator var10000 = var3 = var1.bt().getRookieguide().entrySet().iterator(); var10000.hasNext(); var10000 = var3) {
         Entry var4;
         if (((RookieGuideBean)(var4 = (Entry)var3.next()).getValue()).getGuidename().equals(var0)) {
            var2 = ((RookieGuideBean)var4.getValue()).getBootcontent();
         }
      }

      return var2.equals("") ? null : var2;
   }

   public static String c(String var0) {
      String var1 = "";
      String var10001 = "湯扨亜纪";
      String var2;
      if (var0.equals("游戏介绍")) {
         var2 = "vGu\u0016'\u0016\f欗辛材剥夒讈襊湭\u0014t\u0014u\u0016f\rv\u0006m\u0016'\u0015vGvb杹朸智巐伉宑叓旃乕幁vg膿与硁古vb爝朙y丸智隺颛\u0019乘昚杽夁{\u0016'\u0015vG淠監f\u0005禘眪寋\u0016\u0012灀寈\u0016\u0002\u0019vr沀宨vb粮绪y\u0016\u0012龬礋夒烻帛才\u0016\u0002糎纊\u0019膿帓睊宫vr奼甪拕胈vby\u0016\u0012叙啱先餥哴vb粮绪y\u0016\u0012奢袐\u0016\u0002糎纊\u0019睊宫vr颋卲烬匣vby宭杘皱vr\u0014|捄戭vb伆刃y迮陣强监玜沀〷vGu\u0016'吻纸尳揽减vr儜歓vb粮绪y\u0016\u0012坥髄柦舧\u0016\u0002筼夨玜监糎纊〷v\u0007m\u0016d\u0004`\u0016'\u0015vG带氤霵\u0016\u0007旃閡\u0016\u0002胈抰朼乕刲y\u0016\u0007今寍镊丐朸vby靫乕丑奼顃绲\u0019遗吽带氤y啳仯児騮\u0019嗉欗徾餥监绠逆\u0014vGu\u0016'朙湭戺宬迥蠙甀腄朼乕宯监覴気\u0019儢佦厺仐枰眾翱斲亣皱｝渍扚迥蠙玚壖叿庯讛｜逼押臟嶤吽遗皱湭戺旬强t";
         var2 = var1 = "#r #r#Y欢迎来到大话西游!!! #38#38#r #r#W本服是工作室历时一年#R自主研发#W版本,不是随风,不是木头.#r #r涵盖30种真实#G灵宝#W,#G法宝#W系统,#G龙神大炮帮战#W系统,自带真实#G天生技能#W,#G召唤兽饰品#W系统,#G套装#W系统,真实#G飞升点化#W,官服的#GAI挑战#W体制,进阶式的玩法。#r #r后续将推出#G光武#W系统,#G坐骑染色#W等好玩的系统。#28#115#r #r平民靠#R时间#W能拥有一切,#R仿官长久服#W,非一两天顶级,适合平民,商人入驻,喜欢快餐的绕道!#r #r本游戏对运行电脑有一定的要求,具体可以查看群文件的（游戏运行环境及建议）选择自己合适的游戏方式!";
      } else {
         var10001 = "儒偛殃俬";
         if (var0.equals("充值比例")) {
            var2 = "vGu\u0016'\u0016\f朙杘兰偩毡俞\u0016\u0007\u0015d\u0015vl殁\u0016\u0007\u0015d\u0005e\u0015vly霵觔兰偩皱珼它戆張唓埻y逼押其寈兰偩\u0014vGu\u0016'\u0016\u0002兰偩\u0016\u0012\u0015d\u0005e\u0015u\u0016\u0002逴vru\u0004e\u0005u\u0016\u0002\u0016'兰偩\u0016\u0012\u0015g\u0005e\u0015u\u0016\u0002逴vru\u0007e\u0005u\u0016\u0002\u0016'兰偩\u0016\u0012\u0015f\u0005e\u0015u\u0016\u0002逴vru\u0006e\u0005u\u0016\u0002\u0016'兰偩\u0016\u0012\u0015a\u0005e\u0015u\u0016\u0002逴vru\u0001e\u0005u\u0016\u0002\u0016'兰偩\u0016\u0012\u0015`\u0005e\u0015u\u0016\u0002逴vru\u0000e\u0005u\u0016\u0002\u0016'兰偩\u0016\u0012\u0015d\u0005e\u0005u\u0016\u0002逴vru\u0004e\u0005e\u0015vbvG儐倉vru\u0006e\u0005e\u0015vb達\u0016\u0012\u0015f\u0005e\u0005u\u0016\u0002\u0016'\u0015vG杹朸乕刲儐倉败啳垛\u0019贵逴秚刜膿劝剥贓y旕飈夣秚刜ご仐原纊乞兰偩皱计泠y丏仓渍扚皱儹幆穦宯恲\u0019订典录尿厶\u0014u";
            var2 = var1 = "#r #r#Y本服充值比例#R 1 #Y比#R 100 #Y,需要充值的玩家打开商城,选择元宝充值!#r #r#W充值#G 100  #W送#G 100 #W#r充值#G 200  #W送#G 200 #W#r充值#G 300  #W送#G 300 #W#r充值#G 400  #W送#G 400 #W#r充值#G 500  #W送#G 500 #W#r充值#G 1000 #W送#G 1000 #W#r充值#G 3000 #W送#G 3000 #W#r #r本服一切充值走商城,赠送福利自动到账,无额外福利、以及线下充值的说法,为了游戏的公平稳定性,请免开尊口! ";
         } else {
            var10001 = "匐绀敬甂";
            if (var0.equals("升级攻略")) {
               var2 = "vGu\u0016'斅戞玜寣刮庯奈覇艇亰吻辎児湭戺y手｝\u0016\u0012\u0001a\u0016\u0002\u0019vrl\u0016\u0002＼vr日找伪耰vb飓口vg日找祩匰vby\u0016'\u0015vG煣吻剥\u0016\f镊寜杷赲庢vb赸久仯号柉\u0019呖刅vgf\u0004vb绲吻赸久d\u0000乿蟕栖玾y\u0016'\u0015vG剥\u0016\f镊寜桐vb\u001be\u0016\u0016\u0012引閮\u0016\u0002失併逴剥镊寜毡欳馳y栌挻彦刘秸斚逼押富廁皱沀朚幝闝併逴y孓丵容拕胈亰吻層叚亰張妞卲绲亳{\u0016'\u0015vG畤亻杹渍扚富畠脤鄘罛杜丵寏覴気\u0019斵泠奏張监玜寣叚亰佊畽斅戞礉卐釹贵逴监\u0016\u0007占仯礉皇\u0016\u0002迮蠙占仯卲绲ＹvGu\u0016'剸杊夯录兯匒纒陊伸揽荥o\u0016\u0012\u0015仯\u0018鬁\u0018鬁\u0018二\u0018二\u0016\u0002Ｙ匒纒亰睔朕丏乮\u0019冯找頯庺o\u0016\u0012\u0015鬁抈x们禇\u0018仯睔vby仰俎号聖\u0019珼它桬捛寋陰悐冀辎衹豖敁t";
               var2 = var1 = "#r #r新手玩家创建好角色以后进入游戏,找（#G44#W,#G9#W）#G新手使者#W领取#R新手礼包#W,#r #r然后到#Y长安杂货店#W购买人参果,吃到#R31#W级后购买15个蟠桃王,#r #r到#Y长安桥#WNPC#G张闻#W处传送到长安比武馆,根据当前种族选择对应的法术师门传送,学习完技能以后就可以开始升级了.#r #r由于本游戏对电脑配置有一定要求,无法多开的玩家可以使用新手礼包里赠送的#R单人礼盒#W进行单人升级，#r #r前期多开党升级队伍推荐:#G 人-魔-魔-仙-仙#W，升级以睡杀为主,出手顺序:#G 魔抽-仙秒-人睡#W,仅供参考,玩家根据实际情况进行调整!";
            } else {
               var10001 = "袒奠現沲";
               if (var0.equals("装备玩法")) {
                  var2 = "\u0016'\u0015vGvr杹朸袐夲尋怒vgu\reＰvr揰迤寍斌ｙ苐宬裰奒屫恲丸憗皱珼它厺仐枰诗寍斌ｔ";
                  var2 = var1 = "#r #r#G本服装备属性#R 80％#G接近官方，若对装备属性不懂的玩家可以查询官方！";
               } else {
                  var10001 = "浬勏現沲";
                  if (var0.equals("活动玩法")) {
                     var2 = var1 = "";
                  } else {
                     var10001 = "灀寈笓瞦";
                     if (var0.equals("灵宝符石")) {
                        var2 = var1 = "";
                     } else {
                        var10001 = "嬇夔垮儜";
                        if (var0.equals("子女培养")) {
                           var2 = "vGu\u0016'渍扚釹皭爄监甂ご奆覇艇厺仐乕赂纑阪剥\u0016\f镊寜埻vb｝\u0016\u0012\u0007f\u0007vby\u0016\u0012\u0007g\u0001vb｜\u0016\u0012朽联\u0016\u0002失辎衹纆婯{\u0016'\u0015vG娏吻厺仐纑阪剥\u0016\f镊寜埻vb｝\u0016\u0012\u0004c\u0007vby\u0016\u0012\u0004g\u0004vb｜\u0016\u0012趰绲箔寣\u0016\u0002失录姾测戊y洫扪容殀吻笜徰d刳铊孜嬅减畊\u0019vGu\u0016'奆旬逼押硛寏刬嬼孥坽奆旬躞也\u0019夦斌遜拜厃涽剌孜嬅圝畢斌軾丿t";
                           var2 = var1 = "#r #r游戏里相爱的男、女角色可以一起组队到#Y长安城#W（#G232#W,#G224#W）#G月老#W处进行结婚.#r #r婚后可以组队到#Y长安城#W（#G162#W,#G121#W）#G超级管家#W处开始洞房,洞房完毕后等待1分钟孩子出生,#r #r女方选择确定则孩子在女方身上,女方选择取消则孩子在男方身上!";
                        } else {
                           var10001 = "爟杋爮舕";
                           if (var0.equals("版本特色")) {
                              var2 = "vGu\u0016'\u0016\f\u0015u\u0015u\u0015u\u0015u\u0015u\u0015u\u0015u\u0015u唚乕狙寣牽杹\u0016'\u0015vGvb杹朸橴拪寍斌辅萐ｙ釲畽\u0016\u0012宭旬兝杘凕珒刃vb诫宯vGu\u0016'讜伵佦髙\u0016\u0007\u0015b\u0005p\u0015vb皭伉穞库亪宭珼泠ｙ宭旬\u0016\u0012怟爼晏肨t\u001c\u0016\u0002\u0019vr况玲慊\u0016\u0002Ｙ诼何儐滔澕惰し\u0016'\u0015vGvb醒甝寍斌vg恕旒vb浮劝乮颭ｙ\u0016\u0012埻义魰弤\u0016\u0002Ｙvr鿌实宮宨vbｙ\u0016\u0012夒閬夜対\u0016\u0002Ｙvr奼陸瀠猁vbｙ\u0016\u0012夜対寎寈\u0016\u0002Ｙvr奼陸礰瑫vbｙ\u0016\u0012幁帡朼鰩\u0016\u0002Ｙ笜筼し";
                              var2 = var1 = "#r #r#Y                唯一独家版本#r #r#W本服模拟官方运营，采用#G官方全服几率制#W设定#r #r让你体验#R 70% #W相似程度仿官玩法，官方#G怪物智能AI#W,#G几率感#W，让你充满激情。#r #r#W采用官方#R怀旧#W活动主题，#G城东魅影#W，#G龙宫寻宝#W，#G大闹天宫#W，#G天降灵猴#W，#G天宫寻宝#W，#G天降祥瑞#W，#G年年有鱼#W，等等。";
                           } else {
                              var10001 = "勈肚亜纪";
                              if (var0.equals("功能介绍")) {
                                 var2 = "vGu\u0016'\u0016\f忞挢锛ｏ］vg哙宭旬\fl\u0010乕臁vl｜\u0016'\u0016\u0012戭旂夣ｏ\u0016\u0002\u0016'\u0016\ft9A~\u0004ｏ\u0016\u0002尺坥囋u\u0015u\u0015u\u0015u\u0015u\u0015vl\u0014Y!\u001e\u0006Ｏvb粮绪诫罛vGvl\u0014Y!\u001e\u0002Ｏvb仯牜侴恚u\u0015u\u0015u\u0015u\u0015vl\u0014Y!\u001e\u0007Ｏvb圅骤vGvl\u0014Y!\u001e\rＯvb仱昦u\u0015u\u0015u\u0015u\u0015u\u0015u\u0015vl\u0014Y!\u001e\u0010Ｏvb逆兂桚\u0016'\u0016\ft9A~dｏ\u0016\u0002从勴栺u\u0015u\u0015u\u0015u\u0015u\u0015vl\u0014Y!\u001e\u0001Ｏvb纑阪勊胈vGvl\u0014Y!\u001e\fＯvb嬼孥勊胈u\u0015u\u0015u\u0015u\u0015vl\u0014Y!\u001e\u0014Ｏvb剒磾vGvl\u0014Y!\u001e\u001aＯvb厹唑儨畹霷\u0015u\u0015u\u0015u\u0016\ft9A~sｏ\u0016\u0002奈厞努肨\u0016'\u0016\ft9A~cｏ\u0016\u0002泠寈畹霷\u0015u\u0015u\u0015u\u0015u\u0016\ft9A~xｏ\u0016\u0002帛浫畹霷\u0016'\u0016\ft9A~rｏ\u0016\u0002绬仝\u0015vGu\u0016'\u0016\u0012戭旂冰ｏ\u0016'\u0016\ft9A~bｏ\u0016\u0002泠杺刢蠽\u0015u\u0015u\u0015u\u0015u\u0016\ft9A~pｏ\u0016\u0002遦儢栺vGvl\u0014Y!\u001e\u0011Ｏvb陧徔u\u0015u\u0015u\u0015u\u0015u\u0015u\u0015vl\u0014Y!\u001e\u0001Ｏvb侈抑vGvl\u0014Y!\u001e\u0014Ｏvb雚朏爼琳敮凎u\u0015u\u0015vl\u0014Y!\u001e\u0017Ｏvb挀抦vGvl\u0014Y!\u001e\u0006Ｏvb也丵歴佊畽迲监抵肨\u0016'\u0015vGvg乞轈湭戺ｏ\u0016'\u0016\u0002彦刘扵坽羑耟扦vru举輨\u0015vbｙ朏嘽亏嚋夸杜羑稯闁vr乞轈坥坵vbし刲该\u0016\f兆閸杵殇轚亣\u0016\u0002Ｙ乘焃寷戂窺丸肨歖幭宼袐佊畽〷vGu\u0016'\u0016\u0007渍扚泝凙ＯvGvb厺圝翱聿凐辦儰\u0016\u0012\u0015沽冹u\u0016\u0002Ｙ杯噝仯臟勽囫奘〷vG寷戂窺\u0016\f曁日容殀\u0016\u0002吻ｙ炌vru張妞渍扚\u0015vb辎児瘮彠竂取vl遜拜卯朸vb辎児赳参甙靗烬凎vr沽冹vbし\u0016'\u0015vGvg剎廏覇艇ｏ\u0016'\u0016\u0002栌挻臟軾惰几刮庯奈覇艇vGvl\u001be\u0016斅戞佊聐\u0016\u0002朼日找寵牜ｙ栌挻\u0016\u0012臟嶤皱嗉奈vb平丿乕叟層張帧吒v\rl\u0016'\u0016\f斅戞礉卐\u0016\u0002扦录叚菢徢vr日找袐夲vb乕奢し\u0016g\rvGu\u0016'";
                                 var2 = var1 = "#r #r#Y快捷键：（#R和官方99%一致#Y）#r#G战斗外：#W#r#YAlt+1：#W小地图          #YAlt+S：#W系统设置#r#YAlt+W：#W人物信息        #YAlt+R：#W坐骑#r#YAlt+X：#W交易            #YAlt+E：#W道具栏#r#YAlt+Q：#W任务栏          #YAlt+T：#W组队功能#r#YAlt+Y：#W孩子功能        #YAlt+A：#W切磋#r#YAlt+O：#W召唤兽界面      #YAlt+F：#W好友功能#r#YAlt+V：#W法宝界面        #YAlt+M：#W帮派界面#r#YAlt+G：#W给予 #r #r#G战斗内：#r#YAlt+W：#W法术列表        #YAlt+E：#W道具栏#r#YAlt+D：#W防御            #YAlt+T：#W保护#r#YAlt+A：#W随机物理攻击    #YAlt+B：#W捕抓#r#YAlt+S：#W上一次使用过的技能#r #r#R下载游戏：#r#W当前所在群聊打#G 下载 #W，机器人回复有群空间#G下载地址#W。切记#Y关闭杀毒软件#W，不然客户端不能正常安装使用。#r #r#R游戏注册：#r#W可在群聊内输入#G 注册 #W，机器人自动回复。#r客户端#Y更新完毕#W后，点#G 开始游戏 #W进入登录窗口#Y选择区服#W进入账号界面点击#G注册#W。#r #r#R创建角色：#r#W根据自身情况创建好角色#r#YNPC新手使者#W有新手宠物，根据#G自己的喜好#W带上一只就开干吧#89#r#Y新手礼包#W打开可获得#G新手装备#W一套。#28#r #r";
                              } else {
                                 var10001 = "夀袢粬纸";
                                 if (var0.equals("套装系统")) {
                                    var2 = "vGu\u0016'\u0016\f\u0015u\u0015u\u0015u\u0015u\u0015u\u0015u\u0015u\u0015u奢袐糎纊\u0016'\u0016\u0002刳乯\u000fvGvr夂裰呝戥u\u0015u\u0015u奢袐洢纖\u0015u\u0015u\u0015夂裰散彠vG夂裰浂绶u\u0015u\u0015u奢袐卲绲\u0015u\u0015u\u0015夂裰輹秎z拳覶\u0016'\u0015vGvl瀠俛偩\u000fvGvb伉丏夂裰戕朼勊胈监\u0016\u0007埏砕来旌\u0016\u0002Ｙ瀠俛偩叚亰佊畽\u0016\f乨奼玱珜\u0016\u0002材億捗ｙ乪厺仐伪甝vl斵甝监玼筳\u0016\u0002材億捗ｙ\u0016'\u0015vGvb沽Ｏvg珜笓哙吽扅吻监奢袐郈斵泠仱昦し";
                                    var1 = "#r #r#Y                套装系统#r#W分为:#r#G套装合成     套装洗练     套装收录#r套装洗练     套装升级     套装转移/拆解#r #r#Y灵修值:#r#W作为套装所有功能的#R基础材料#W，灵修值可以使用#Y九天玄玉#W来兑换，也可以使用#Y无用的玉符#W来兑换，#r #r#W注：#R玉符和合成后的套装都无法交易。";
                                 }

                                 var2 = var1;
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
      }

      return var2.equals("") ? null : var1;
   }

   public static Integer d(String var0) {
      byte var1 = 0;
      String var10001 = "湯扨亜纪";
      byte var10000;
      if (var0.equals("游戏介绍")) {
         var10000 = var1 = 1;
      } else {
         var10001 = "兰偩毡俞";
         if (var0.equals("充值比例")) {
            var10000 = var1 = 2;
         } else {
            var10001 = "匐绀敬甂";
            if (var0.equals("升级攻略")) {
               var10000 = var1 = 3;
            } else {
               var10001 = "裰奒玜沀";
               if (var0.equals("装备玩法")) {
                  var10000 = var1 = 4;
               } else {
                  var10001 = "浬勏現沲";
                  if (var0.equals("活动玩法")) {
                     var10000 = var1 = 5;
                  } else {
                     var10001 = "灀寈笓瞦";
                     if (var0.equals("灵宝符石")) {
                        var10000 = var1 = 6;
                     } else {
                        var10001 = "嬇夔垮儜";
                        if (var0.equals("子女培养")) {
                           var10000 = var1 = 7;
                        } else {
                           var10001 = "牽杹牌舧";
                           if (var0.equals("版本特色")) {
                              var10000 = var1 = 8;
                           } else {
                              var10001 = "勈肚亜纪";
                              if (var0.equals("功能介绍")) {
                                 var10000 = var1 = 9;
                              } else {
                                 var10001 = "奢袐糎纊";
                                 if (var0.equals("套装系统")) {
                                    var1 = 10;
                                 }

                                 var10000 = var1;
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
      }

      return var10000 == 0 ? null : Integer.valueOf(var1);
   }

   static {
      String[] var10000 = new String[8];
      String var10003 = "牽杹牌舧";
      var10000[0] = "版本特色";
      var10003 = "勈肚亜纪";
      var10000[1] = "功能介绍";
      var10003 = "卲绲攎田";
      var10000[2] = "升级攻略";
      var10003 = "袒奠現沲";
      var10000[3] = "装备玩法";
      var10003 = "奢袐糎纊";
      var10000[4] = "套装系统";
      var10003 = "浬勏現沲";
      var10000[5] = "活动玩法";
      var10003 = "灀寈笓瞦";
      var10000[6] = "灵宝符石";
      var10003 = "嬇夔垮儜";
      var10000[7] = "子女培养";
      a = var10000;
   }

   public static List<String> e(int var0, Class8 var1) {
      if (var1.bt().getRookieguide() == null) {
         return null;
      } else {
         ArrayList var2 = new ArrayList();

         Iterator var3;
         for (Iterator var10000 = var3 = var1.bt().getRookieguide().entrySet().iterator(); var10000.hasNext(); var10000 = var3) {
            Entry var4;
            if (((RookieGuideBean)(var4 = (Entry)var3.next()).getValue()).getFid() == var0) {
               var2.add(((RookieGuideBean)var4.getValue()).getGuidename());
            }
         }

         if (var0 == 5) {
            ArrayList var6 = new ArrayList();

            int var5;
            for (int var8 = var5 = 0; var8 < var2.size(); var8 = var5) {
               var6.add(var2.get(var5++));
            }

            for (int var9 = var5 = 0; var9 < var2.size(); var9 = ++var5) {
               String var10 = (String)var2.get(var5);
               String var10001 = "呝乕洎勽";
               if (var10.equals("周一活动")) {
                  var6.set(0, var2.get(var5));
               } else {
                  String var11 = (String)var2.get(var5);
                  var10001 = "吿仫浬勏";
                  if (var11.equals("周二活动")) {
                     var6.set(1, var2.get(var5));
                  } else {
                     String var12 = (String)var2.get(var5);
                     var10001 = "呝乜洎勽";
                     if (var12.equals("周三活动")) {
                        var6.set(2, var2.get(var5));
                     } else {
                        String var13 = (String)var2.get(var5);
                        var10001 = "吿嚼浬勏";
                        if (var13.equals("周四活动")) {
                           var6.set(3, var2.get(var5));
                        } else {
                           String var14 = (String)var2.get(var5);
                           var10001 = "呝仁洎勽";
                           if (var14.equals("周五活动")) {
                              var6.set(4, var2.get(var5));
                           } else {
                              String var15 = (String)var2.get(var5);
                              var10001 = "吿儊浬勏";
                              if (var15.equals("周六活动")) {
                                 var6.set(5, var2.get(var5));
                              } else {
                                 String var16 = (String)var2.get(var5);
                                 var10001 = "呝新洎勽";
                                 if (var16.equals("周日活动")) {
                                    var6.set(6, var2.get(var5));
                                 } else {
                                    String var17 = (String)var2.get(var5);
                                    var10001 = "块焉晸剑幤";
                                    if (var17.equals("地煞星分布")) {
                                       var6.set(7, var2.get(var5));
                                    } else {
                                       String var18 = (String)var2.get(var5);
                                       var10001 = "迮陣挤才";
                                       if (var18.equals("进阶挑战")) {
                                          var6.set(8, var2.get(var5));
                                       }
                                    }
                                 }
                              }
                           }
                        }
                     }
                  }
               }
            }

            var2.clear();
            var2 = var6;
         }

         return var2;
      }
   }
}
