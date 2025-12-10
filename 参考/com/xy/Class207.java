package com.xy;

import com.xy.bean.LoginResult;
import com.xy.entity.RoleSummoning;
import com.xy.formula.BaseQl;
import com.xy.formula.BaseValue;
import com.xy.formula.Ql;
import com.xy.formula.RoleProperty;
import com.xy.game.RoleData;
import com.xy.text.GameView;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.ImageObserver;
import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JComponent;
import javax.swing.JLabel;

public class Class207 extends Class345 {
   private static List<String> xh;
   private Image wa;
   private BigDecimal iq;
   private static Map<String, Integer> azb;
   private int cy;
   private <undefinedtype>[] azc;

   public static BaseQl aoi(String var0, BaseQl var1) {
      String var10000;
      if (var1 == null) {
         var1 = new BaseQl((String)null, 0.0D);
         var10000 = var0;
      } else {
         var1.setKey((String)null);
         var1.setValue(0.0D);
         var10000 = var0;
      }

      String var2 = var10000;
      BaseQl var3;
      switch(var10000.hashCode()) {
      case -1303848984:
         while(false) {
         }

         if (!var2.equals("ehsfzl")) {
            var3 = var1;
         } else {
            var3 = var1;
            var1.setKey("忽视反震几率");
            var1.setValue(5.0D);
         }
         break;
      case -1289454661:
         if (!var2.equals("exfljl")) {
            var3 = var1;
         } else {
            var3 = var1;
            var1.setKey("仙法连击率");
            var1.setValue(2.0D);
         }
         break;
      case -1289454654:
         if (!var2.equals("exfljs")) {
            var3 = var1;
         } else {
            var3 = var1;
            var1.setKey("仙法连击次数");
            var1.setValue(2.0D);
         }
         break;
      case 97442:
         if (!var2.equals("bff")) {
            var3 = var1;
         } else {
            var3 = var1;
            var1.setKey("风法狂暴");
            var1.setValue(2.0D);
         }
         break;
      case 97475:
         if (!var2.equals("bgh")) {
            var3 = var1;
         } else {
            var3 = var1;
            var1.setKey("鬼火狂暴");
            var1.setValue(2.0D);
         }
         break;
      case 97504:
         if (!var2.equals("bhf")) {
            var3 = var1;
         } else {
            var3 = var1;
            var1.setKey("火法狂暴");
            var1.setValue(2.0D);
         }
         break;
      case 97628:
         if (!var2.equals("blf")) {
            var3 = var1;
         } else {
            var3 = var1;
            var1.setKey("雷法狂暴");
            var1.setValue(2.0D);
         }
         break;
      case 97842:
         if (!var2.equals("bsc")) {
            var3 = var1;
         } else {
            var3 = var1;
            var1.setKey("三尸虫狂暴");
            var1.setValue(2.0D);
         }
         break;
      case 97845:
         if (!var2.equals("bsf")) {
            var3 = var1;
         } else {
            var3 = var1;
            var1.setKey("水法狂暴");
            var1.setValue(2.0D);
         }
         break;
      case 99302:
         if (!var2.equals("ddf")) {
            var3 = var1;
         } else {
            var3 = var1;
            var1.setKey("毒法躲闪");
            var1.setValue(5.0D);
         }
         break;
      case 99364:
         if (!var2.equals("dff")) {
            var3 = var1;
         } else {
            var3 = var1;
            var1.setKey("风法躲闪");
            var1.setValue(5.0D);
         }
         break;
      case 99383:
         if (!var2.equals("dfy")) {
            var3 = var1;
         } else {
            var3 = var1;
            var1.setKey("封印躲闪");
            var1.setValue(5.0D);
         }
         break;
      case 99397:
         if (!var2.equals("dgh")) {
            var3 = var1;
         } else {
            var3 = var1;
            var1.setKey("鬼火躲闪");
            var1.setValue(5.0D);
         }
         break;
      case 99426:
         if (!var2.equals("dhf")) {
            var3 = var1;
         } else {
            var3 = var1;
            var1.setKey("火法躲闪");
            var1.setValue(5.0D);
         }
         break;
      case 99432:
         if (!var2.equals("dhl")) {
            var3 = var1;
         } else {
            var3 = var1;
            var1.setKey("混乱躲闪");
            var1.setValue(5.0D);
         }
         break;
      case 99439:
         if (!var2.equals("dhs")) {
            var3 = var1;
         } else {
            var3 = var1;
            var1.setKey("昏睡躲闪");
            var1.setValue(5.0D);
         }
         break;
      case 99550:
         if (!var2.equals("dlf")) {
            var3 = var1;
         } else {
            var3 = var1;
            var1.setKey("雷法躲闪");
            var1.setValue(5.0D);
         }
         break;
      case 99764:
         if (!var2.equals("dsc")) {
            var3 = var1;
         } else {
            var3 = var1;
            var1.setKey("三尸虫躲闪");
            var1.setValue(5.0D);
         }
         break;
      case 99767:
         if (!var2.equals("dsf")) {
            var3 = var1;
         } else {
            var3 = var1;
            var1.setKey("水法躲闪");
            var1.setValue(5.0D);
         }
         break;
      case 99970:
         if (!var2.equals("dyw")) {
            var3 = var1;
         } else {
            var3 = var1;
            var1.setKey("遗忘躲闪");
            var1.setValue(5.0D);
         }
         break;
      case 99997:
         if (!var2.equals("dzs")) {
            var3 = var1;
         } else {
            var3 = var1;
            var1.setKey("震慑躲闪");
            var1.setValue(5.0D);
         }
         break;
      case 100276:
         if (!var2.equals("eds")) {
            var3 = var1;
         } else {
            var3 = var1;
            var1.setKey("躲闪率");
            var1.setValue(3.0D);
         }
         break;
      case 100397:
         if (!var2.equals("ehp")) {
            var3 = var1;
         } else {
            var3 = var1;
            var1.setKey("每回合HP");
            var1.setValue(5.0D);
         }
         break;
      case 100462:
         if (!var2.equals("ejs")) {
            var3 = var1;
         } else {
            var3 = var1;
            var1.setKey("伤害减免");
            var1.setValue(5.0D);
         }
         break;
      case 100552:
         if (!var2.equals("emp")) {
            var3 = var1;
            break;
         } else {
            var1.setKey("每回合MP");
            var1.setValue(5.0D);
         }
      default:
         var3 = var1;
         break;
      case 101067:
         if (!var2.equals("f_d")) {
            var3 = var1;
         } else {
            var3 = var1;
            var1.setKey("附毒攻击");
            var1.setValue(5.0D);
         }
         break;
      case 101069:
         if (!var2.equals("f_f")) {
            var3 = var1;
         } else {
            var3 = var1;
            var1.setKey("附封攻击");
            var1.setValue(5.0D);
         }
         break;
      case 101071:
         if (!var2.equals("f_h")) {
            var3 = var1;
         } else {
            var3 = var1;
            var1.setKey("附混攻击");
            var1.setValue(5.0D);
         }
         break;
      case 103159:
         if (!var2.equals("hds")) {
            var3 = var1;
         } else {
            var3 = var1;
            var1.setKey("忽视躲闪");
            var1.setValue(3.0D);
         }
         break;
      case 103208:
         if (!var2.equals("hff")) {
            var3 = var1;
         } else {
            var3 = var1;
            var1.setKey("忽视风法");
            var1.setValue(2.0D);
         }
         break;
      case 103212:
         if (!var2.equals("hfj")) {
            var3 = var1;
         } else {
            var3 = var1;
            var1.setKey("忽视反击");
            var1.setValue(3.0D);
         }
         break;
      case 103227:
         if (!var2.equals("hfy")) {
            var3 = var1;
         } else {
            var3 = var1;
            var1.setKey("忽视封印");
            var1.setValue(2.0D);
         }
         break;
      case 103241:
         if (!var2.equals("hgh")) {
            var3 = var1;
         } else {
            var3 = var1;
            var1.setKey("忽视鬼火");
            var1.setValue(2.0D);
         }
         break;
      case 103270:
         if (!var2.equals("hhf")) {
            var3 = var1;
         } else {
            var3 = var1;
            var1.setKey("忽视火法");
            var1.setValue(2.0D);
         }
         break;
      case 103276:
         if (!var2.equals("hhl")) {
            var3 = var1;
         } else {
            var3 = var1;
            var1.setKey("忽视混乱");
            var1.setValue(2.0D);
         }
         break;
      case 103283:
         if (!var2.equals("hhs")) {
            var3 = var1;
         } else {
            var3 = var1;
            var1.setKey("忽视昏睡");
            var1.setValue(2.0D);
         }
         break;
      case 103394:
         if (!var2.equals("hlf")) {
            var3 = var1;
         } else {
            var3 = var1;
            var1.setKey("忽视雷法");
            var1.setValue(2.0D);
         }
         break;
      case 103611:
         if (!var2.equals("hsf")) {
            var3 = var1;
         } else {
            var3 = var1;
            var1.setKey("忽视水法");
            var1.setValue(2.0D);
         }
         break;
      case 103814:
         if (!var2.equals("hyw")) {
            var3 = var1;
         } else {
            var3 = var1;
            var1.setKey("忽视遗忘");
            var1.setValue(2.0D);
         }
         break;
      case 103826:
         if (!var2.equals("hzd")) {
            var3 = var1;
         } else {
            var3 = var1;
            var1.setKey("忽视中毒");
            var1.setValue(2.0D);
         }
         break;
      case 103841:
         if (!var2.equals("hzs")) {
            var3 = var1;
         } else {
            var3 = var1;
            var1.setKey("忽视抗震慑");
            var1.setValue(2.0D);
         }
         break;
      case 105130:
         if (!var2.equals("jff")) {
            var3 = var1;
         } else {
            var3 = var1;
            var1.setKey("风法伤害减免");
            var1.setValue(5.0D);
         }
         break;
      case 105163:
         if (!var2.equals("jgh")) {
            var3 = var1;
         } else {
            var3 = var1;
            var1.setKey("鬼火伤害减免");
            var1.setValue(5.0D);
         }
         break;
      case 105192:
         if (!var2.equals("jhf")) {
            var3 = var1;
         } else {
            var3 = var1;
            var1.setKey("火法伤害减免");
            var1.setValue(5.0D);
         }
         break;
      case 105312:
         if (!var2.equals("jlb")) {
            var3 = var1;
         } else {
            var3 = var1;
            var1.setKey("抗灵宝伤害");
            var1.setValue(5.0D);
         }
         break;
      case 105316:
         if (!var2.equals("jlf")) {
            var3 = var1;
         } else {
            var3 = var1;
            var1.setKey("雷法伤害减免");
            var1.setValue(5.0D);
         }
         break;
      case 105533:
         if (!var2.equals("jsf")) {
            var3 = var1;
         } else {
            var3 = var1;
            var1.setKey("水法伤害减免");
            var1.setValue(5.0D);
         }
         break;
      case 105967:
         if (!var2.equals("kbf")) {
            var3 = var1;
         } else {
            var3 = var1;
            var1.setKey("抗风法狂暴");
            var1.setValue(1.0D);
         }
         break;
      case 105968:
         if (!var2.equals("kbg")) {
            var3 = var1;
         } else {
            var3 = var1;
            var1.setKey("抗鬼火狂暴");
            var1.setValue(1.0D);
         }
         break;
      case 105969:
         if (!var2.equals("kbh")) {
            var3 = var1;
         } else {
            var3 = var1;
            var1.setKey("抗火法狂暴");
            var1.setValue(1.0D);
         }
         break;
      case 105973:
         if (!var2.equals("kbl")) {
            var3 = var1;
         } else {
            var3 = var1;
            var1.setKey("抗雷法狂暴");
            var1.setValue(1.0D);
         }
         break;
      case 105980:
         if (!var2.equals("kbs")) {
            var3 = var1;
         } else {
            var3 = var1;
            var1.setKey("抗水法狂暴");
            var1.setValue(1.0D);
         }
         break;
      case 106091:
         if (!var2.equals("kff")) {
            var3 = var1;
         } else {
            var3 = var1;
            var1.setKey("抗风");
            var1.setValue(1.0D);
         }
         break;
      case 106092:
         if (!var2.equals("kfg")) {
            var3 = var1;
         } else {
            var3 = var1;
            var1.setKey("抗分光化影");
            var1.setValue(5.0D);
         }
         break;
      case 106104:
         if (!var2.equals("kfs")) {
            var3 = var1;
         } else {
            var3 = var1;
            var1.setKey("法术防御");
            var1.setValue(3.0D);
         }
         break;
      case 106110:
         if (!var2.equals("kfy")) {
            var3 = var1;
         } else {
            var3 = var1;
            var1.setKey("抗封印");
            var1.setValue(1.0D);
         }
         break;
      case 106124:
         if (!var2.equals("kgh")) {
            var3 = var1;
         } else {
            var3 = var1;
            var1.setKey("抗鬼火");
            var1.setValue(1.0D);
         }
         break;
      case 106135:
         if (!var2.equals("kgs")) {
            var3 = var1;
         } else {
            var3 = var1;
            var1.setKey("抗隔山打牛");
            var1.setValue(5.0D);
         }
         break;
      case 106153:
         if (!var2.equals("khf")) {
            var3 = var1;
         } else {
            var3 = var1;
            var1.setKey("抗火");
            var1.setValue(1.0D);
         }
         break;
      case 106159:
         if (!var2.equals("khl")) {
            var3 = var1;
         } else {
            var3 = var1;
            var1.setKey("抗混乱");
            var1.setValue(1.0D);
         }
         break;
      case 106165:
         if (!var2.equals("khr")) {
            var3 = var1;
         } else {
            var3 = var1;
            var1.setKey("抗浩然正气");
            var1.setValue(5.0D);
         }
         break;
      case 106166:
         if (!var2.equals("khs")) {
            var3 = var1;
         } else {
            var3 = var1;
            var1.setKey("抗昏睡");
            var1.setValue(1.0D);
         }
         break;
      case 106273:
         if (!var2.equals("klb")) {
            var3 = var1;
         } else {
            var3 = var1;
            var1.setKey("随机抗灵宝伤害");
            var1.setValue(5.0D);
         }
         break;
      case 106277:
         if (!var2.equals("klf")) {
            var3 = var1;
         } else {
            var3 = var1;
            var1.setKey("抗雷");
            var1.setValue(1.0D);
         }
         break;
      case 106437:
         if (!var2.equals("kqk")) {
            var3 = var1;
         } else {
            var3 = var1;
            var1.setKey("抵御强克效果");
            var1.setValue(4.0D);
         }
         break;
      case 106439:
         if (!var2.equals("kqm")) {
            var3 = var1;
         } else {
            var3 = var1;
            var1.setKey("抗青面獠牙");
            var1.setValue(5.0D);
         }
         break;
      case 106449:
         if (!var2.equals("kqw")) {
            var3 = var1;
         } else {
            var3 = var1;
            var1.setKey("抗情网");
            var1.setValue(5.0D);
         }
         break;
      case 106491:
         if (!var2.equals("ksc")) {
            var3 = var1;
         } else {
            var3 = var1;
            var1.setKey("抗三尸");
            var1.setValue(1.0D);
         }
         break;
      case 106494:
         if (!var2.equals("ksf")) {
            var3 = var1;
         } else {
            var3 = var1;
            var1.setKey("抗水");
            var1.setValue(1.0D);
         }
         break;
      case 106532:
         if (!var2.equals("ktm")) {
            var3 = var1;
         } else {
            var3 = var1;
            var1.setKey("抗天魔解体");
            var1.setValue(5.0D);
         }
         break;
      case 106624:
         if (!var2.equals("kwl")) {
            var3 = var1;
         } else {
            var3 = var1;
            var1.setKey("抗物理");
            var1.setValue(3.0D);
         }
         break;
      case 106655:
         if (!var2.equals("kxl")) {
            var3 = var1;
         } else {
            var3 = var1;
            var1.setKey("抗小楼夜哭");
            var1.setValue(5.0D);
         }
         break;
      case 106697:
         if (!var2.equals("kyw")) {
            var3 = var1;
         } else {
            var3 = var1;
            var1.setKey("抗遗忘");
            var1.setValue(1.0D);
         }
         break;
      case 106709:
         if (!var2.equals("kzd")) {
            var3 = var1;
         } else {
            var3 = var1;
            var1.setKey("抗中毒");
            var1.setValue(1.0D);
         }
         break;
      case 106724:
         if (!var2.equals("kzs")) {
            var3 = var1;
         } else {
            var3 = var1;
            var1.setKey("抗震慑");
            var1.setValue(1.0D);
         }
         break;
      case 107951:
         if (!var2.equals("mdf")) {
            var3 = var1;
         } else {
            var3 = var1;
            var1.setKey("毒法命中");
            var1.setValue(5.0D);
         }
         break;
      case 108013:
         if (!var2.equals("mff")) {
            var3 = var1;
         } else {
            var3 = var1;
            var1.setKey("风法命中");
            var1.setValue(5.0D);
         }
         break;
      case 108032:
         if (!var2.equals("mfy")) {
            var3 = var1;
         } else {
            var3 = var1;
            var1.setKey("封印命中");
            var1.setValue(5.0D);
         }
         break;
      case 108046:
         if (!var2.equals("mgh")) {
            var3 = var1;
         } else {
            var3 = var1;
            var1.setKey("鬼火命中");
            var1.setValue(5.0D);
         }
         break;
      case 108075:
         if (!var2.equals("mhf")) {
            var3 = var1;
         } else {
            var3 = var1;
            var1.setKey("火法命中");
            var1.setValue(5.0D);
         }
         break;
      case 108081:
         if (!var2.equals("mhl")) {
            var3 = var1;
         } else {
            var3 = var1;
            var1.setKey("混乱命中");
            var1.setValue(5.0D);
         }
         break;
      case 108088:
         if (!var2.equals("mhs")) {
            var3 = var1;
         } else {
            var3 = var1;
            var1.setKey("昏睡命中");
            var1.setValue(5.0D);
         }
         break;
      case 108199:
         if (!var2.equals("mlf")) {
            var3 = var1;
         } else {
            var3 = var1;
            var1.setKey("雷法命中");
            var1.setValue(5.0D);
         }
         break;
      case 108413:
         if (!var2.equals("msc")) {
            var3 = var1;
         } else {
            var3 = var1;
            var1.setKey("三尸虫命中");
            var1.setValue(5.0D);
         }
         break;
      case 108416:
         if (!var2.equals("msf")) {
            var3 = var1;
         } else {
            var3 = var1;
            var1.setKey("水法命中");
            var1.setValue(5.0D);
         }
         break;
      case 108619:
         if (!var2.equals("myw")) {
            var3 = var1;
         } else {
            var3 = var1;
            var1.setKey("遗忘命中");
            var1.setValue(5.0D);
         }
         break;
      case 108646:
         if (!var2.equals("mzs")) {
            var3 = var1;
         } else {
            var3 = var1;
            var1.setKey("震慑命中");
            var1.setValue(5.0D);
         }
         break;
      case 111857:
         if (!var2.equals("qff")) {
            var3 = var1;
         } else {
            var3 = var1;
            var1.setKey("强风法");
            var1.setValue(2.0D);
         }
         break;
      case 111876:
         if (!var2.equals("qfy")) {
            var3 = var1;
         } else {
            var3 = var1;
            var1.setKey("强封印");
            var1.setValue(2.0D);
         }
         break;
      case 111890:
         if (!var2.equals("qgh")) {
            var3 = var1;
         } else {
            var3 = var1;
            var1.setKey("强鬼火");
            var1.setValue(2.0D);
         }
         break;
      case 111919:
         if (!var2.equals("qhf")) {
            var3 = var1;
         } else {
            var3 = var1;
            var1.setKey("强火法");
            var1.setValue(2.0D);
         }
         break;
      case 111925:
         if (!var2.equals("qhl")) {
            var3 = var1;
         } else {
            var3 = var1;
            var1.setKey("强混乱");
            var1.setValue(2.0D);
         }
         break;
      case 111932:
         if (!var2.equals("qhs")) {
            var3 = var1;
         } else {
            var3 = var1;
            var1.setKey("强昏睡");
            var1.setValue(2.0D);
         }
         break;
      case 111982:
         if (!var2.equals("qjg")) {
            var3 = var1;
         } else {
            var3 = var1;
            var1.setKey("强金箍");
            var1.setValue(5.0D);
         }
         break;
      case 112043:
         if (!var2.equals("qlf")) {
            var3 = var1;
         } else {
            var3 = var1;
            var1.setKey("强雷法");
            var1.setValue(2.0D);
         }
         break;
      case 112076:
         if (!var2.equals("qmh")) {
            var3 = var1;
         } else {
            var3 = var1;
            var1.setKey("加强魅惑");
            var1.setValue(2.0D);
         }
         break;
      case 112203:
         if (!var2.equals("qqk")) {
            var3 = var1;
         } else {
            var3 = var1;
            var1.setKey("增加强克效果");
            var1.setValue(4.0D);
         }
         break;
      case 112215:
         if (!var2.equals("qqw")) {
            var3 = var1;
         } else {
            var3 = var1;
            var1.setKey("强情网");
            var1.setValue(5.0D);
         }
         break;
      case 112257:
         if (!var2.equals("qsc")) {
            var3 = var1;
         } else {
            var3 = var1;
            var1.setKey("加强三尸虫");
            var1.setValue(2.0D);
         }
         break;
      case 112260:
         if (!var2.equals("qsf")) {
            var3 = var1;
         } else {
            var3 = var1;
            var1.setKey("强水法");
            var1.setValue(2.0D);
         }
         break;
      case 112463:
         if (!var2.equals("qyw")) {
            var3 = var1;
         } else {
            var3 = var1;
            var1.setKey("加强遗忘");
            var1.setValue(2.0D);
         }
         break;
      case 112475:
         if (!var2.equals("qzd")) {
            var3 = var1;
         } else {
            var3 = var1;
            var1.setKey("强中毒");
            var1.setValue(2.0D);
         }
         break;
      case 112490:
         if (!var2.equals("qzs")) {
            var3 = var1;
         } else {
            var3 = var1;
            var1.setKey("强震慑");
            var1.setValue(2.0D);
         }
         break;
      case 113779:
         if (!var2.equals("sff")) {
            var3 = var1;
         } else {
            var3 = var1;
            var1.setKey("风法伤害");
            var1.setValue(2.0D);
         }
         break;
      case 113792:
         if (!var2.equals("sfs")) {
            var3 = var1;
         } else {
            var3 = var1;
            var1.setKey("法术伤害");
            var1.setValue(2.0D);
         }
         break;
      case 113812:
         if (!var2.equals("sgh")) {
            var3 = var1;
         } else {
            var3 = var1;
            var1.setKey("鬼火伤害");
            var1.setValue(2.0D);
         }
         break;
      case 113841:
         if (!var2.equals("shf")) {
            var3 = var1;
         } else {
            var3 = var1;
            var1.setKey("火法伤害");
            var1.setValue(2.0D);
         }
         break;
      case 113965:
         if (!var2.equals("slf")) {
            var3 = var1;
         } else {
            var3 = var1;
            var1.setKey("雷法伤害");
            var1.setValue(2.0D);
         }
         break;
      case 114179:
         if (!var2.equals("ssc")) {
            var3 = var1;
         } else {
            var3 = var1;
            var1.setKey("三尸伤害");
            var1.setValue(2.0D);
         }
         break;
      case 114182:
         if (!var2.equals("ssf")) {
            var3 = var1;
         } else {
            var3 = var1;
            var1.setKey("水法伤害");
            var1.setValue(2.0D);
         }
         break;
      case 114397:
         if (!var2.equals("szd")) {
            var3 = var1;
         } else {
            var3 = var1;
            var1.setKey("毒伤害");
            var1.setValue(2.0D);
         }
         break;
      case 118183:
         if (!var2.equals("wxh")) {
            var3 = var1;
         } else {
            var3 = var1;
            var1.setKey("火");
            var1.setValue(4.0D);
         }
         break;
      case 118185:
         if (!var2.equals("wxj")) {
            var3 = var1;
         } else {
            var3 = var1;
            var1.setKey("金");
            var1.setValue(4.0D);
         }
         break;
      case 118188:
         if (!var2.equals("wxm")) {
            var3 = var1;
         } else {
            var3 = var1;
            var1.setKey("木");
            var1.setValue(4.0D);
         }
         break;
      case 118194:
         if (!var2.equals("wxs")) {
            var3 = var1;
         } else {
            var3 = var1;
            var1.setKey("水");
            var1.setValue(4.0D);
         }
         break;
      case 118195:
         if (!var2.equals("wxt")) {
            var3 = var1;
         } else {
            var3 = var1;
            var1.setKey("土");
            var1.setValue(4.0D);
         }
         break;
      case 120444:
         if (!var2.equals("zdf")) {
            var3 = var1;
         } else {
            var3 = var1;
            var1.setKey("毒法伤害加深");
            var1.setValue(5.0D);
         }
         break;
      case 120506:
         if (!var2.equals("zff")) {
            var3 = var1;
         } else {
            var3 = var1;
            var1.setKey("风法伤害加深");
            var1.setValue(5.0D);
         }
         break;
      case 120539:
         if (!var2.equals("zgh")) {
            var3 = var1;
         } else {
            var3 = var1;
            var1.setKey("鬼火伤害加深");
            var1.setValue(5.0D);
         }
         break;
      case 120568:
         if (!var2.equals("zhf")) {
            var3 = var1;
         } else {
            var3 = var1;
            var1.setKey("火法伤害加深");
            var1.setValue(5.0D);
         }
         break;
      case 120692:
         if (!var2.equals("zlf")) {
            var3 = var1;
         } else {
            var3 = var1;
            var1.setKey("雷法伤害加深");
            var1.setValue(5.0D);
         }
         break;
      case 120909:
         if (!var2.equals("zsf")) {
            var3 = var1;
         } else {
            var3 = var1;
            var1.setKey("水法伤害加深");
            var1.setValue(5.0D);
         }
         break;
      case 3024648:
         if (!var2.equals("bjff")) {
            var3 = var1;
         } else {
            var3 = var1;
            var1.setKey("风法暴击几率");
            var1.setValue(2.0D);
         }
         break;
      case 3024667:
         if (!var2.equals("bjfy")) {
            var3 = var1;
         } else {
            var3 = var1;
            var1.setKey("封印暴击几率");
            var1.setValue(2.0D);
         }
         break;
      case 3024681:
         if (!var2.equals("bjgh")) {
            var3 = var1;
         } else {
            var3 = var1;
            var1.setKey("鬼火暴击几率");
            var1.setValue(2.0D);
         }
         break;
      case 3024710:
         if (!var2.equals("bjhf")) {
            var3 = var1;
         } else {
            var3 = var1;
            var1.setKey("火法暴击几率");
            var1.setValue(2.0D);
         }
         break;
      case 3024716:
         if (!var2.equals("bjhl")) {
            var3 = var1;
         } else {
            var3 = var1;
            var1.setKey("混乱暴击几率");
            var1.setValue(2.0D);
         }
         break;
      case 3024723:
         if (!var2.equals("bjhs")) {
            var3 = var1;
         } else {
            var3 = var1;
            var1.setKey("昏睡暴击几率");
            var1.setValue(2.0D);
         }
         break;
      case 3024772:
         if (!var2.equals("bjjf")) {
            var3 = var1;
         } else {
            var3 = var1;
            var1.setKey("加防暴击几率");
            var1.setValue(2.0D);
         }
         break;
      case 3024773:
         if (!var2.equals("bjjg")) {
            var3 = var1;
         } else {
            var3 = var1;
            var1.setKey("加攻暴击几率");
            var1.setValue(2.0D);
         }
         break;
      case 3024785:
         if (!var2.equals("bjjs")) {
            var3 = var1;
         } else {
            var3 = var1;
            var1.setKey("加速暴击几率");
            var1.setValue(2.0D);
         }
         break;
      case 3024834:
         if (!var2.equals("bjlf")) {
            var3 = var1;
         } else {
            var3 = var1;
            var1.setKey("雷法暴击几率");
            var1.setValue(2.0D);
         }
         break;
      case 3024867:
         if (!var2.equals("bjmh")) {
            var3 = var1;
         } else {
            var3 = var1;
            var1.setKey("魅惑暴击几率");
            var1.setValue(2.0D);
         }
         break;
      case 3025048:
         if (!var2.equals("bjsc")) {
            var3 = var1;
         } else {
            var3 = var1;
            var1.setKey("三尸暴击几率");
            var1.setValue(2.0D);
         }
         break;
      case 3025051:
         if (!var2.equals("bjsf")) {
            var3 = var1;
         } else {
            var3 = var1;
            var1.setKey("水法暴击几率");
            var1.setValue(2.0D);
         }
         break;
      case 3025254:
         if (!var2.equals("bjyw")) {
            var3 = var1;
         } else {
            var3 = var1;
            var1.setKey("遗忘暴击几率");
            var1.setValue(2.0D);
         }
         break;
      case 3025266:
         if (!var2.equals("bjzd")) {
            var3 = var1;
         } else {
            var3 = var1;
            var1.setKey("中毒暴击几率");
            var1.setValue(2.0D);
         }
         break;
      case 3025281:
         if (!var2.equals("bjzs")) {
            var3 = var1;
         } else {
            var3 = var1;
            var1.setKey("震慑暴击几率");
            var1.setValue(2.0D);
         }
         break;
      case 3110307:
         if (!var2.equals("efjl")) {
            var3 = var1;
         } else {
            var3 = var1;
            var1.setKey("反击率");
            var1.setValue(3.0D);
         }
         break;
      case 3110317:
         if (!var2.equals("efjv")) {
            var3 = var1;
         } else {
            var3 = var1;
            var1.setKey("反击次数");
            var1.setValue(3.0D);
         }
         break;
      case 3110803:
         if (!var2.equals("efzl")) {
            var3 = var1;
         } else {
            var3 = var1;
            var1.setKey("反震率");
            var1.setValue(5.0D);
         }
         break;
      case 3114864:
         if (!var2.equals("ekbl")) {
            var3 = var1;
         } else {
            var3 = var1;
            var1.setKey("狂暴率");
            var1.setValue(3.0D);
         }
         break;
      case 3116073:
         if (!var2.equals("eljl")) {
            var3 = var1;
         } else {
            var3 = var1;
            var1.setKey("连击率");
            var1.setValue(3.0D);
         }
         break;
      case 3116083:
         if (!var2.equals("eljv")) {
            var3 = var1;
         } else {
            var3 = var1;
            var1.setKey("连击次数");
            var1.setValue(3.0D);
         }
         break;
      case 3117530:
         if (!var2.equals("emzl")) {
            var3 = var1;
         } else {
            var3 = var1;
            var1.setKey("命中率");
            var1.setValue(3.0D);
         }
         break;
      case 3129620:
         if (!var2.equals("ezml")) {
            var3 = var1;
         } else {
            var3 = var1;
            var1.setKey("致命率");
            var1.setValue(3.0D);
         }
         break;
      case 3133641:
         if (!var2.equals("f_sc")) {
            var3 = var1;
         } else {
            var3 = var1;
            var1.setKey("附三尸攻击");
            var1.setValue(5.0D);
         }
         break;
      case 3133799:
         if (!var2.equals("f_xf")) {
            var3 = var1;
         } else {
            var3 = var1;
            var1.setKey("附风攻击");
            var1.setValue(5.0D);
         }
         break;
      case 3133801:
         if (!var2.equals("f_xh")) {
            var3 = var1;
         } else {
            var3 = var1;
            var1.setKey("附火攻击");
            var1.setValue(5.0D);
         }
         break;
      case 3133805:
         if (!var2.equals("f_xl")) {
            var3 = var1;
         } else {
            var3 = var1;
            var1.setKey("附雷攻击");
            var1.setValue(5.0D);
         }
         break;
      case 3133812:
         if (!var2.equals("f_xs")) {
            var3 = var1;
         } else {
            var3 = var1;
            var1.setKey("附水攻击");
            var1.setValue(5.0D);
         }
         break;
      case 3133874:
         if (!var2.equals("f_zs")) {
            var3 = var1;
         } else {
            var3 = var1;
            var1.setKey("附震慑攻击");
            var1.setValue(5.0D);
         }
         break;
      case 3200145:
         if (!var2.equals("hfyl")) {
            var3 = var1;
         } else {
            var3 = var1;
            var1.setKey("忽视防御几率");
            var1.setValue(3.0D);
         }
         break;
      case 3200155:
         if (!var2.equals("hfyv")) {
            var3 = var1;
         } else {
            var3 = var1;
            var1.setKey("忽视防御程度");
            var1.setValue(3.0D);
         }
         break;
      case 3292797:
         if (!var2.equals("kjge")) {
            var3 = var1;
         } else {
            var3 = var1;
            var1.setKey("抗金箍");
            var1.setValue(5.0D);
         }
         break;
      case 3305681:
         if (!var2.equals("kwsx")) {
            var3 = var1;
         } else {
            var3 = var1;
            var1.setKey("抗无属性伤害");
            var1.setValue(5.0D);
         }
         break;
      case 3308094:
         if (!var2.equals("kzds")) {
            var3 = var1;
         } else {
            var3 = var1;
            var1.setKey("抗毒伤");
            var1.setValue(1.0D);
         }
         break;
      case 3308366:
         if (!var2.equals("kzml")) {
            var3 = var1;
         } else {
            var3 = var1;
            var1.setKey("抗致命率");
            var1.setValue(3.0D);
         }
         break;
      case 3468258:
         if (!var2.equals("qfyf")) {
            var3 = var1;
         } else {
            var3 = var1;
            var1.setKey("加强防御法术");
            var1.setValue(2.0D);
         }
         break;
      case 3468754:
         if (!var2.equals("qgjf")) {
            var3 = var1;
         } else {
            var3 = var1;
            var1.setKey("加强攻击法术");
            var1.setValue(2.0D);
         }
         break;
      case 3473338:
         if (!var2.equals("qlcb")) {
            var3 = var1;
         } else {
            var3 = var1;
            var1.setKey("加强沧波效果");
            var1.setValue(2.0D);
         }
         break;
      case 3473454:
         if (!var2.equals("qlfy")) {
            var3 = var1;
         } else {
            var3 = var1;
            var1.setKey("加强扶摇效果");
            var1.setValue(2.0D);
         }
         break;
      case 3473751:
         if (!var2.equals("qlpl")) {
            var3 = var1;
         } else {
            var3 = var1;
            var1.setKey("加强霹雳效果");
            var1.setValue(2.0D);
         }
         break;
      case 3480100:
         if (!var2.equals("qsdf")) {
            var3 = var1;
         } else {
            var3 = var1;
            var1.setKey("加强速度法术");
            var1.setValue(2.0D);
         }
         break;
      case 3486840:
         if (!var2.equals("qzds")) {
            var3 = var1;
         } else {
            var3 = var1;
            var1.setKey("强中毒伤害");
            var1.setValue(2.0D);
         }
         break;
      case 3486964:
         if (!var2.equals("qzhs")) {
            var3 = var1;
         } else {
            var3 = var1;
            var1.setKey("对召唤兽伤害");
            var1.setValue(5.0D);
         }
         break;
      case 3523606:
         if (!var2.equals("sbls")) {
            var3 = var1;
         } else {
            var3 = var1;
            var1.setKey("冰刃术伤害");
            var1.setValue(2.0D);
         }
         break;
      case 3544009:
         if (!var2.equals("swsx")) {
            var3 = var1;
         } else {
            var3 = var1;
            var1.setKey("无属性伤害");
            var1.setValue(5.0D);
         }
         break;
      case 3664056:
         if (!var2.equals("wxqh")) {
            var3 = var1;
         } else {
            var3 = var1;
            var1.setKey("强力克火");
            var1.setValue(4.0D);
         }
         break;
      case 3664058:
         if (!var2.equals("wxqj")) {
            var3 = var1;
         } else {
            var3 = var1;
            var1.setKey("强力克金");
            var1.setValue(4.0D);
         }
         break;
      case 3664061:
         if (!var2.equals("wxqm")) {
            var3 = var1;
         } else {
            var3 = var1;
            var1.setKey("强力克木");
            var1.setValue(4.0D);
         }
         break;
      case 3664067:
         if (!var2.equals("wxqs")) {
            var3 = var1;
         } else {
            var3 = var1;
            var1.setKey("强力克水");
            var1.setValue(4.0D);
         }
         break;
      case 3664068:
         if (!var2.equals("wxqt")) {
            var3 = var1;
         } else {
            var3 = var1;
            var1.setKey("强力克土");
            var1.setValue(4.0D);
         }
         break;
      case 93644931:
         if (!var2.equals("bffcd")) {
            var3 = var1;
         } else {
            var3 = var1;
            var1.setKey("风法狂暴程度");
            var1.setValue(2.0D);
         }
         break;
      case 93676644:
         if (!var2.equals("bghcd")) {
            var3 = var1;
         } else {
            var3 = var1;
            var1.setKey("鬼火狂暴程度");
            var1.setValue(2.0D);
         }
         break;
      case 93704513:
         if (!var2.equals("bhfcd")) {
            var3 = var1;
         } else {
            var3 = var1;
            var1.setKey("火法狂暴程度");
            var1.setValue(2.0D);
         }
         break;
      case 93769859:
         if (!var2.equals("bjlcb")) {
            var3 = var1;
         } else {
            var3 = var1;
            var1.setKey("沧波暴击几率");
            var1.setValue(2.0D);
         }
         break;
      case 93769975:
         if (!var2.equals("bjlfy")) {
            var3 = var1;
         } else {
            var3 = var1;
            var1.setKey("扶摇暴击几率");
            var1.setValue(2.0D);
         }
         break;
      case 93769993:
         if (!var2.equals("bjlgl")) {
            var3 = var1;
         } else {
            var3 = var1;
            var1.setKey("甘霖暴击几率");
            var1.setValue(2.0D);
         }
         break;
      case 93770272:
         if (!var2.equals("bjlpl")) {
            var3 = var1;
         } else {
            var3 = var1;
            var1.setKey("霹雳暴击几率");
            var1.setValue(2.0D);
         }
         break;
      case 93823677:
         if (!var2.equals("blfcd")) {
            var3 = var1;
         } else {
            var3 = var1;
            var1.setKey("雷法狂暴程度");
            var1.setValue(2.0D);
         }
         break;
      case 94029331:
         if (!var2.equals("bsccd")) {
            var3 = var1;
         } else {
            var3 = var1;
            var1.setKey("三尸虫狂暴程度");
            var1.setValue(2.0D);
         }
         break;
      case 94032214:
         if (!var2.equals("bsfcd")) {
            var3 = var1;
         } else {
            var3 = var1;
            var1.setKey("水法狂暴程度");
            var1.setValue(2.0D);
         }
         break;
      case 96419433:
         if (!var2.equals("efjff")) {
            var3 = var1;
         } else {
            var3 = var1;
            var1.setKey("风法反击");
            var1.setValue(3.0D);
         }
         break;
      case 96419495:
         if (!var2.equals("efjhf")) {
            var3 = var1;
         } else {
            var3 = var1;
            var1.setKey("火法反击");
            var1.setValue(3.0D);
         }
         break;
      case 96419570:
         if (!var2.equals("efjjs")) {
            var3 = var1;
         } else {
            var3 = var1;
            var1.setKey("被攻击时释放乾坤借速");
            var1.setValue(3.0D);
         }
         break;
      case 96419606:
         if (!var2.equals("efjkx")) {
            var3 = var1;
         } else {
            var3 = var1;
            var1.setKey("被攻击时释放含情脉脉");
            var1.setValue(3.0D);
         }
         break;
      case 96419619:
         if (!var2.equals("efjlf")) {
            var3 = var1;
         } else {
            var3 = var1;
            var1.setKey("雷法反击");
            var1.setValue(3.0D);
         }
         break;
      case 96419625:
         if (!var2.equals("efjll")) {
            var3 = var1;
         } else {
            var3 = var1;
            var1.setKey("被攻击时释放魔神附身");
            var1.setValue(3.0D);
         }
         break;
      case 96419836:
         if (!var2.equals("efjsf")) {
            var3 = var1;
         } else {
            var3 = var1;
            var1.setKey("水法反击");
            var1.setValue(3.0D);
         }
         break;
      case 96428033:
         if (!var2.equals("efsds")) {
            var3 = var1;
         } else {
            var3 = var1;
            var1.setKey("法术躲闪");
            var1.setValue(5.0D);
         }
         break;
      case 96428319:
         if (!var2.equals("efsmz")) {
            var3 = var1;
         } else {
            var3 = var1;
            var1.setKey("法术命中");
            var1.setValue(5.0D);
         }
         break;
      case 96434714:
         if (!var2.equals("efzcd")) {
            var3 = var1;
         } else {
            var3 = var1;
            var1.setKey("反震程度");
            var1.setValue(5.0D);
         }
         break;
      case 99722295:
         if (!var2.equals("hxfcd")) {
            var3 = var1;
         } else {
            var3 = var1;
            var1.setKey("忽视仙法抗性程度");
            var1.setValue(2.0D);
         }
         break;
      case 99722551:
         if (!var2.equals("hxfkl")) {
            var3 = var1;
         } else {
            var3 = var1;
            var1.setKey("忽视仙法抗性率");
            var1.setValue(2.0D);
         }
         break;
      case 102468963:
         if (!var2.equals("kwlgj")) {
            var3 = var1;
         } else {
            var3 = var1;
            var1.setKey("防御值");
            var1.setValue(3.0D);
         }
         break;
      case 102565100:
         if (!var2.equals("kzshp")) {
            var3 = var1;
         } else {
            var3 = var1;
            var1.setKey("抗震慑气血");
            var1.setValue(1.0D);
         }
         break;
      case 102565255:
         if (!var2.equals("kzsmp")) {
            var3 = var1;
         } else {
            var3 = var1;
            var1.setKey("抗震慑魔法");
            var1.setValue(1.0D);
         }
         break;
      case 107677731:
         if (!var2.equals("qlglc")) {
            var3 = var1;
         } else {
            var3 = var1;
            var1.setKey("甘霖回血程度");
            var1.setValue(2.0D);
         }
         break;
      case 107677750:
         if (!var2.equals("qlglv")) {
            var3 = var1;
         } else {
            var3 = var1;
            var1.setKey("甘霖回血值");
            var1.setValue(2.0D);
         }
         break;
      case 107882321:
         if (!var2.equals("qschx")) {
            var3 = var1;
         } else {
            var3 = var1;
            var1.setKey("强三尸回血");
            var1.setValue(2.0D);
         }
         break;
      case 116418070:
         if (!var2.equals("zzsmp")) {
            var3 = var1;
         } else {
            var3 = var1;
            var1.setKey("震慑魔法伤害加深");
            var1.setValue(5.0D);
         }
      }

      aop(var3);
      return var1;
   }

   public boolean zg(int var1, BigDecimal var2) {
      if (this.cy == var1) {
         if (this.cy == 0) {
            return (boolean)(4 ^ 5);
         }

         if (this.cy == (4 ^ 5)) {
            if (this.iq.compareTo(var2) == 0) {
               return (boolean)(2 ^ 3);
            }

            return false;
         }
      }

      return false;
   }

   public void y(int var1) {
      this.azc[var1 - (127 & 120)].cc();
   }

   public void aok(Ql var1) {
      try {
         BaseQl var2 = null;

         int var10000;
         int var4;
         for(var10000 = var4 = 3 ^ 3; var10000 < xh.size(); var10000 = var4) {
            Field var3;
            if ((var3 = var1.getClass().getDeclaredField((String)xh.get(var4))) != null) {
               var3.setAccessible((boolean)(5 >> 2));
               double var5;
               if ((var5 = var3.getDouble(var1)) != 0.0D && (var2 = aoi(var3.getName(), var2)).getKey() != null && (!this.uw().n(5 >> 1, --3) || var2.getKey().indexOf("三尸虫") == -4 >> 2 && var2.getKey().indexOf("鬼火") == -4 >> 2 && var2.getKey().indexOf("遗忘") == -4 >> 2 && var2.getKey().indexOf("魅惑") == -4 >> 2)) {
                  this.aoq((int)var2.getValue(), var5, var2.getKey(), var3.getName());
               }
            }

            ++var4;
         }

         Field[] var10 = var1.getClass().getDeclaredFields();

         int var9;
         for(var10000 = var9 = 5 >> 3; var10000 < var10.length; var10000 = var9) {
            Field var11 = var10[var9];
            if (!xh.contains(var11.getName())) {
               var11.setAccessible((boolean)(3 >> 1));
               double var6;
               if ((var6 = var11.getDouble(var1)) != 0.0D && (var2 = aoi(var11.getName(), var2)).getKey() != null && (!this.uw().n(1 ^ 3, --3) || var2.getKey().indexOf("三尸虫") == -4 >> 2 && var2.getKey().indexOf("鬼火") == -4 >> 2 && var2.getKey().indexOf("遗忘") == -4 >> 2 && var2.getKey().indexOf("魅惑") == -4 >> 2)) {
                  this.aoq((int)var2.getValue(), var6, var2.getKey(), var11.getName());
               }
            }

            ++var9;
         }

      } catch (Exception var8) {
         var8.printStackTrace();
      }
   }

   static {
      Integer var0 = --3;
      azb = new HashMap();
      azb.put("kwl", var0);
      azb.put("kff", var0);
      azb.put("klf", var0);
      azb.put("ksf", var0);
      azb.put("khf", var0);
      azb.put("khl", var0);
      azb.put("khs", var0);
      azb.put("kfy", var0);
      azb.put("kzd", var0);
      azb.put("kyw", var0);
      azb.put("kgh", var0);
      azb.put("eds", --1);
      xh = new ArrayList(46 & 121);
      int var1 = 3 & 4;

      for(int var10000 = var1; var10000 < 40; var10000 = var1) {
         String var2 = var1 == 0 ? "kff" : (var1 == 5 >> 2 ? "khf" : (var1 == (1 ^ 3) ? "ksf" : (var1 == --3 ? "klf" : (var1 == --4 ? "kfy" : (var1 == --5 ? "khl" : (var1 == (23 & 110) ? "khs" : (var1 == (111 & 23) ? "kyw" : (var1 == (109 & 26) ? "kzd" : (var1 == (43 & 93) ? "kzds" : (var1 == (91 & 46) ? "kzs" : (var1 == (75 & 63) ? "kzshp" : (var1 == (92 & 47) ? "kzsmp" : (var1 == (93 & 47) ? "kgh" : (var1 == (46 & 95) ? "ksc" : (var1 == (31 & 111) ? "qff" : (var1 == (55 & 88) ? "qhf" : (var1 == (125 & 19) ? "qsf" : (var1 == (114 & 31) ? "qlf" : (var1 == (123 & 23) ? "qfy" : (var1 == (85 & 62) ? "qhl" : (var1 == 21 ? "qhs" : (var1 == 22 ? "qyw" : (var1 == 23 ? "qzd" : (var1 == 24 ? "qzds" : (var1 == 25 ? "qzs" : (var1 == 26 ? "qgh" : (var1 == 27 ? "qsc" : (var1 == 28 ? "qschx" : (var1 == 29 ? "hff" : (var1 == 30 ? "hhf" : (var1 == 31 ? "hsf" : (var1 == 32 ? "hlf" : (var1 == 33 ? "hfy" : (var1 == 34 ? "hhl" : (var1 == 35 ? "hhs" : (var1 == 36 ? "hyw" : (var1 == 37 ? "hzd" : (var1 == 38 ? "hzs" : (var1 == 39 ? "hgh" : "")))))))))))))))))))))))))))))))))))))));
         ++var1;
         xh.add(var2);
      }

   }

   public Double aol(Object var1) {
      RoleData var2 = this.vd();
      if (this.cy == --1) {
         RoleSummoning var10;
         return (var10 = var2.getPet(this.iq)) == null ? null : (double)(var2.getMount(var10.getSid()) != null ? 127 & 95 : 75) - null.ame(var1);
      } else if (this.cy != 0) {
         return null;
      } else {
         RoleProperty var3 = var2.getRoleProperty();
         double var4 = 0.0D;
         double var6 = null.ame(var1);
         double var10000;
         if (null.amd(var1).equals("kwl")) {
            var4 = 75.0D + (double)var3.qhv * 1.5D;
            var6 = var3.getEquip("物理吸收");
            var10000 = var4;
         } else if (null.amd(var1).equals("kff")) {
            var4 = 75.0D + (double)var3.qhv * 1.5D;
            var6 = var3.getEquip("抗风");
            var10000 = var4;
         } else if (null.amd(var1).equals("klf")) {
            var4 = 75.0D + (double)var3.qhv * 1.5D;
            var6 = var3.getEquip("抗雷");
            var10000 = var4;
         } else if (null.amd(var1).equals("ksf")) {
            var4 = 75.0D + (double)var3.qhv * 1.5D;
            var6 = var3.getEquip("抗水");
            var10000 = var4;
         } else if (null.amd(var1).equals("khf")) {
            var4 = 75.0D + (double)var3.qhv * 1.5D;
            var6 = var3.getEquip("抗火");
            var10000 = var4;
         } else if (null.amd(var1).equals("kgh")) {
            var4 = 75.0D + (double)var3.qhv * 1.5D;
            var6 = var3.getEquip("抗鬼火");
            var10000 = var4;
         } else if (!null.amd(var1).equals("khl") && !null.amd(var1).equals("khs") && !null.amd(var1).equals("kfy") && !null.amd(var1).equals("kyw") && !null.amd(var1).equals("kzd")) {
            if (null.amd(var1).equals("eds")) {
               var4 = 75.0D + (double)var3.qhv * 1.5D;
               var6 = var3.getEquip("躲闪率") + var3.getEquip("躲闪") + var3.getEquip("物理躲闪");
            }

            var10000 = var4;
         } else {
            String var8 = null.amd(var1).equals("khl") ? "抗混乱" : (null.amd(var1).equals("khs") ? "抗昏睡" : (null.amd(var1).equals("kfy") ? "抗封印" : (null.amd(var1).equals("kyw") ? "抗遗忘" : "抗中毒")));
            LoginResult var9 = var2.getLoginResult();
            var4 = (BaseValue.a(var8, var9.getRace_id()) + (double)var3.qhv * 0.4D) * (1.0D + var3.getValue(var8 + "上限") / 100.0D);
            var6 = var3.getGrade(var8) + var3.getEquip(var8) + var3.getBorn(var8);
            var10000 = var4;
         }

         return var10000 - var6;
      }
   }

   public void aoo(Ql var1, int var2, BigDecimal var3) {
      int var10000 = 5 >> 3;
      this.cy = var2;
      this.iq = var3;
      this.s();
      this.aok(var1);

      int var10002;
      for(int var4 = var10000; var10000 < this.azc.length; var10000 = var4) {
         this.azc[var4].afz = (boolean)(--1);
         <undefinedtype> var5 = this.azc[var4];
         int var10001 = 124 & 23;
         var10002 = this.azc[var4].gw * (54 & 95);
         int var10003 = this.azc[var4].j * (126 & 23);
         ++var4;
         var5.cy = var10001 + Math.max(var10002, var10003);
      }

      var10002 = -4 >> 2;
      this.d();
      this.vf(var10002, 3 >> 2, this.getWidth(), this.getHeight());
      this.ve().a(this.ae());
   }

   public Class207(GameView var1) {
      int var10001 = --5;
      int var10008 = -2 & -1;
      super(30 & 105, 1 ^ 3, Class345.aef, var1);
      this.va(var10008, 3 ^ 3, 3004 & 30063, 127 & 114, Class345.aei);
      this.uv(Class511.q("sc/d/31.png", 79 & 58, 79 & 58, 79 & 58, 79 & 58, (boolean)(5 >> 3)), (String)null);
      this.aea = new Class658("sc/e/36.png", 3 >> 1, this.ae(), this);
      this.aea.setBounds(18205 & 14838, --3, 31 & 113, 31 & 113);
      this.add(this.aea);
      <undefinedtype>[] var3 = new <undefinedtype>[var10001];
      boolean var10003 = true;
      this.azc = var3;

      int var2;
      for(int var10000 = var2 = 3 & 4; var10000 < this.azc.length; var10000 = var2) {
         this.azc[var2] = new JComponent(var2) {
            private boolean afz;
            private int gw;
            private Class322 vo;
            private int j;
            private int bn;
            private int cy;
            private List<null> ez;

            public {
               this.bn = var2;
               Class322 var10001 = new Class322;
               int var10004 = 3 & 5;
               int var10005 = (124 & 123) + var2;
               Font var10006 = Class681.cm;
               String var10008;
               Class207 var10009;
               if (var2 == 0) {
                  var10008 = "法术抗性";
                  var10009 = Class207.this;
               } else if (var2 == (2 ^ 3)) {
                  var10008 = "物理属性";
                  var10009 = Class207.this;
               } else if (var2 == --2) {
                  var10008 = "五行属性";
                  var10009 = Class207.this;
               } else if (var2 == --3) {
                  var10008 = "法术增强";
                  var10009 = Class207.this;
               } else if (var2 == --4) {
                  var10008 = "其他";
                  var10009 = Class207.this;
               } else {
                  var10008 = "";
                  var10009 = Class207.this;
               }

               this.vo = var10001;
               this.vo.setBounds(3 >> 2, 3 >> 2, 21371 & 11695, 117 & 30);
               this.add(this.vo);
               this.ez = new ArrayList();
            }

            public void cc() {
               if (this.gw != 0 || this.j != 0) {
                  this.afz = (boolean)(this.afz ? 3 >> 2 : 1);
                  Class207.this.d();
               }
            }

            public void q() {
               int var10000 = 3 >> 2;
               int var10002 = 3 >> 2;
               this.gw = 2 & 5;
               this.j = var10002;

               for(int var1 = var10000; var10000 < this.ez.size(); var10000 = var1) {
                  JLabel var2 = (JLabel)this.ez.get(var1);
                  int var10001 = 3 >> 2;
                  ++var1;
                  var2.setText((String)null);
                  var2.setVisible((boolean)var10001);
               }

            }

            protected void paintChildren(Graphics var1) {
               super.paintChildren(var1);
               if (!this.afz) {
                  if (Class207.this.wa == null) {
                     Class207.this.wa = Class511.a("sc/d/32.png");
                  }

                  var1.drawImage(Class207.this.wa, 91 & 125, --3, 24 & 119, 24 & 119, (ImageObserver)null);
                  var1.drawImage(Class207.this.wa, 21247 & 11710, --3, 52 & 91, 52 & 91, (ImageObserver)null);
               }
            }

         
            private void zy(JLabel var1, double var2, String var4) {
               StringBuilder var10001 = (new StringBuilder(String.valueOf(var4))).append(":");
               Object[] var10003 = new Object[5 >> 2];
               boolean var10005 = true;
               var10003[2 & 5] = var2;
               var1.setText(var10001.append(String.format("%.1f", var10003)).append(Class270.so(var4)).toString());
            }

            public void zz(double var1, String var3, String var4) {
               <undefinedtype> var5 = this.aac(this.gw + this.j);
               null.amf(var5, var4);
               null.amg(var5, var1);
               Double var7 = null;
               Integer var6;
               if ((var6 = (Integer)Class207.azb.get(null.amd(var5))) != null && (var6 >> Class207.this.cy & 3 & 5) == 5 >> 2) {
                  var7 = Class207.this.aol(var5);
               }

               <undefinedtype> var10000;
               if (var7 != null && var7 <= 0.0D) {
                  var10000 = this;
                  var5.setForeground(Color.red);
               } else {
                  var5.setForeground(Color.white);
                  var10000 = this;
               }

               var10000.zy(var5, var1, var3);
               if (var3.length() > (15 & 120)) {
                  var5.setBounds(--5, (21 & 126) + this.gw * (95 & 54), 28606 & 4461, 118 & 31);
                  if (this.gw > this.j) {
                     this.j += 2 ^ 3;
                  }

                  this.gw += 3 >> 1;
                  this.j += --1;
               } else if (this.gw <= this.j) {
                  var5.setBounds(--5, (119 & 28) + this.gw * (119 & 30), 17566 & 15351, 118 & 31);
                  this.gw += 4 ^ 5;
               } else {
                  var5.setBounds(187 & 32735, (118 & 29) + this.j * (95 & 54), 28830 & 4087, 86 & 63);
                  this.j += 5 >> 2;
               }
            }

         
            private <undefinedtype> aac(int var1) {
               Object var2 = var1 < this.ez.size() ? (<undefinedtype>)this.ez.get(var1) : null;
               if (var2 == null) {
                  Object var10000 = var2 = new MouseListener() {
                     private String rw;
                     private double aas;
                     // $FF: synthetic field
                     final Class207 awx;

                     public void mouseExited(MouseEvent var1) {
                        this.awx.ve().n(110 & 63);
                     }

                     public void mouseClicked(MouseEvent var1) {
                     }

                     public void mouseEntered(MouseEvent var1) {
                        String var4 = null;
                        String var10000;
                        if (this.rw.equals("kwl")) {
                           var10000 = var4 = "能够抵抗物理伤害的一定百分比";
                        } else if (this.rw.equals("kzs")) {
                           var10000 = var4 = "能抵抗震慑法术伤害的一定百分比";
                        } else if (this.rw.equals("kff")) {
                           var10000 = var4 = "能抵抗风系法术伤害的一定百分比";
                        } else if (this.rw.equals("klf")) {
                           var10000 = var4 = "能抵抗雷系法术伤害的一定百分比";
                        } else if (this.rw.equals("ksf")) {
                           var10000 = var4 = "能抵抗水系法术伤害的一定百分比";
                        } else if (this.rw.equals("khf")) {
                           var10000 = var4 = "能抵抗火系法术伤害的一定百分比";
                        } else if (this.rw.equals("khl")) {
                           var10000 = var4 = "降低中混乱法术的几率";
                        } else if (this.rw.equals("khs")) {
                           var10000 = var4 = "降低中昏睡法术的几率";
                        } else if (this.rw.equals("kfy")) {
                           var10000 = var4 = "降低中封印法术的几率";
                        } else if (this.rw.equals("kzd")) {
                           var10000 = var4 = "降低中毒法术的几率";
                        } else if (this.rw.equals("kzds")) {
                           var10000 = var4 = "能抵抗中毒法术伤害的绝对值";
                        } else if (this.rw.equals("kyw")) {
                           var10000 = var4 = "降低中遗忘法术的几率";
                        } else if (this.rw.equals("kgh")) {
                           var10000 = var4 = "能抵抗鬼火法术伤害的一定百分比";
                        } else if (this.rw.equals("ksc")) {
                           var10000 = var4 = "能抵抗三尸法术伤害的绝对值";
                        } else if (this.rw.equals("klb")) {
                           var10000 = var4 = "能抵抗灵宝伤害的绝对值";
                        } else if (this.rw.equals("kqk")) {
                           var10000 = var4 = "减少受到所有的强力克效果百分比";
                        } else if (this.rw.equals("kwsx")) {
                           var10000 = var4 = "减少受到无属性伤害效果百分比";
                        } else if (this.rw.equals("kzshp")) {
                           var10000 = var4 = "能抵抗震慑法术气血伤害的一定百分比";
                        } else if (this.rw.equals("kzsmp")) {
                           var10000 = var4 = "能抵抗震慑法术魔法伤害的一定百分比";
                        } else if (this.rw.equals("kjge")) {
                           var10000 = var4 = "受到法宝金箍控制的几率减小";
                        } else if (this.rw.equals("kqw")) {
                           var10000 = var4 = "受到法宝情网控制的几率减小";
                        } else if (this.rw.equals("khr")) {
                           var10000 = var4 = "抵抗一定的内丹浩然正气伤害";
                        } else if (this.rw.equals("kgs")) {
                           var10000 = var4 = "抵抗一定的内丹隔山打牛伤害";
                        } else if (this.rw.equals("kqm")) {
                           var10000 = var4 = "抵抗一定的内丹青面獠牙伤害";
                        } else if (this.rw.equals("ktm")) {
                           var10000 = var4 = "抵抗一定的内丹天魔解体伤害";
                        } else if (this.rw.equals("kxl")) {
                           var10000 = var4 = "抵抗一定的内丹小楼夜哭伤害";
                        } else if (this.rw.equals("kfg")) {
                           var10000 = var4 = "抵抗一定的内丹分光化影伤害";
                        } else if (this.rw.equals("kzml")) {
                           var10000 = var4 = "降低受到物理攻击时致命触发几率";
                        } else if (this.rw.equals("kbf")) {
                           var10000 = var4 = "降低受到风系法术伤害时狂暴触发几率";
                        } else if (this.rw.equals("kbh")) {
                           var10000 = var4 = "降低受到火系法术伤害时狂暴触发几率";
                        } else if (this.rw.equals("kbs")) {
                           var10000 = var4 = "降低受到水系法术伤害时狂暴触发几率";
                        } else if (this.rw.equals("kbl")) {
                           var10000 = var4 = "降低受到雷系法术伤害时狂暴触发几率";
                        } else if (this.rw.equals("kbg")) {
                           var10000 = var4 = "降低受到鬼火系法术伤害时狂暴触发几率";
                        } else if (this.rw.equals("kwlgj")) {
                           var10000 = var4 = "能够抵抗物理伤害的绝对值";
                        } else if (this.rw.equals("kfs")) {
                           var10000 = var4 = "减少法术类的伤害技能造成的伤害";
                        } else if (this.rw.equals("hfyv")) {
                           var10000 = var4 = "物理攻击时无视对方物理抗性程度";
                        } else if (this.rw.equals("hfyl")) {
                           var10000 = var4 = "物理攻击时无视对方物理抗性几率";
                        } else if (this.rw.equals("hff")) {
                           var10000 = var4 = "忽视对方风抗性的绝对值";
                        } else if (this.rw.equals("hlf")) {
                           var10000 = var4 = "忽视对方雷抗性的绝对值";
                        } else if (this.rw.equals("hsf")) {
                           var10000 = var4 = "忽视对方水抗性的绝对值";
                        } else if (this.rw.equals("hhf")) {
                           var10000 = var4 = "忽视对方火抗性的绝对值";
                        } else if (this.rw.equals("hhl")) {
                           var10000 = var4 = "忽视对方混乱抗性的绝对值";
                        } else if (this.rw.equals("hhs")) {
                           var10000 = var4 = "忽视对方昏睡抗性的绝对值";
                        } else if (this.rw.equals("hfy")) {
                           var10000 = var4 = "忽视对方封印抗性的绝对值";
                        } else if (this.rw.equals("hzd")) {
                           var10000 = var4 = "忽视对方毒抗性的绝对值";
                        } else if (this.rw.equals("hzs")) {
                           var10000 = var4 = "忽视对方震慑抗性的绝对值";
                        } else if (this.rw.equals("hds")) {
                           var10000 = var4 = "忽视对方物理躲闪的绝对值";
                        } else if (this.rw.equals("hfj")) {
                           var10000 = var4 = "忽视对方物理反击的绝对值";
                        } else if (this.rw.equals("hxfkl")) {
                           var10000 = var4 = "仙法攻击时无视对方仙法抗性几率";
                        } else if (this.rw.equals("hxfcd")) {
                           var10000 = var4 = "仙法攻击时无视对方仙法抗性程度";
                        } else if (this.rw.equals("hgh")) {
                           var10000 = var4 = "忽视对方鬼火抗性的绝对值";
                        } else if (this.rw.equals("hyw")) {
                           var10000 = var4 = "忽视对方遗忘抗性的绝对值";
                        } else if (this.rw.equals("qff")) {
                           var10000 = var4 = "加强风法术的强度";
                        } else if (this.rw.equals("qlf")) {
                           var10000 = var4 = "加强雷法术的强度";
                        } else if (this.rw.equals("qsf")) {
                           var10000 = var4 = "加强水法术的强度";
                        } else if (this.rw.equals("qhf")) {
                           var10000 = var4 = "加强火法术的强度";
                        } else if (this.rw.equals("qhl")) {
                           var10000 = var4 = "加强混乱法术的强度";
                        } else if (this.rw.equals("qhs")) {
                           var10000 = var4 = "加强昏睡法术的强度";
                        } else if (this.rw.equals("qzs")) {
                           var10000 = var4 = "加强震慑法术的强度";
                        } else if (this.rw.equals("qfy")) {
                           var10000 = var4 = "加强封印法术的强度";
                        } else if (this.rw.equals("qzd")) {
                           var10000 = var4 = "加强毒法术的强度";
                        } else if (this.rw.equals("qzds")) {
                           var10000 = var4 = "加强毒法术的强度";
                        } else if (this.rw.equals("qgh")) {
                           var10000 = var4 = "加强鬼火法术的强度";
                        } else if (this.rw.equals("qyw")) {
                           var10000 = var4 = "加强遗忘法术的强度";
                        } else if (this.rw.equals("qsc")) {
                           var10000 = var4 = "加强三尸法术的强度";
                        } else if (this.rw.equals("qschx")) {
                           var10000 = var4 = "加强三尸法术的强度";
                        } else if (this.rw.equals("qqk")) {
                           var10000 = var4 = "增加自身所有的强力克效果百分比";
                        } else if (this.rw.equals("qzhs")) {
                           var10000 = var4 = "增加自身对召唤兽伤害的百分比";
                        } else if (this.rw.equals("qgjf")) {
                           var10000 = var4 = "加强加攻法术的效果";
                        } else if (this.rw.equals("qfyf")) {
                           var10000 = var4 = "加强加防法术的效果";
                        } else if (this.rw.equals("qsdf")) {
                           var10000 = var4 = "加强加速法术的效果";
                        } else if (this.rw.equals("qmh")) {
                           var10000 = var4 = "加强魅惑法术的强度";
                        } else if (this.rw.equals("qjg")) {
                           var10000 = var4 = "使用法宝金箍成功率增加";
                        } else if (this.rw.equals("qqw")) {
                           var10000 = var4 = "使用法宝情网成功率增加";
                        } else if (this.rw.equals("qlpl")) {
                           var10000 = var4 = "加强霹雳法术的强度";
                        } else if (this.rw.equals("qlfy")) {
                           var10000 = var4 = "加强扶摇法术的强度";
                        } else if (this.rw.equals("qlcb")) {
                           var10000 = var4 = "加强沧波法术的强度";
                        } else if (this.rw.equals("qlglv")) {
                           var10000 = var4 = "加强甘霖法术的强度的绝对值";
                        } else if (this.rw.equals("qlglc")) {
                           var10000 = var4 = "加强甘霖法术的强度的百分比";
                        } else if (this.rw.equals("eds")) {
                           var10000 = var4 = "受到物理攻击躲闪的几率";
                        } else if (this.rw.equals("efjl")) {
                           var10000 = var4 = "物理攻击时所能反击的几率";
                        } else if (this.rw.equals("efjv")) {
                           var10000 = var4 = "物理攻击时所能反击的次数";
                        } else if (this.rw.equals("efjff")) {
                           var10000 = var4 = "受到物理攻击风法反击对方";
                        } else if (this.rw.equals("efjhf")) {
                           var10000 = var4 = "受到物理攻击火法反击对方";
                        } else if (this.rw.equals("efjsf")) {
                           var10000 = var4 = "受到物理攻击水法反击对方";
                        } else if (this.rw.equals("efjlf")) {
                           var10000 = var4 = "受到物理攻击雷法反击对方";
                        } else if (this.rw.equals("efjkx")) {
                           var10000 = var4 = "受到物理攻击释放含情脉脉几率";
                        } else if (this.rw.equals("efjjs")) {
                           var10000 = var4 = "受到物理攻击释放乾坤借速几率";
                        } else if (this.rw.equals("efjll")) {
                           var10000 = var4 = "受到物理攻击释放魔神附体几率";
                        } else if (this.rw.equals("eljl")) {
                           var10000 = var4 = "物理攻击时所能连击的几率";
                        } else if (this.rw.equals("eljv")) {
                           var10000 = var4 = "物理攻击时所能连击的次数";
                        } else if (this.rw.equals("emzl")) {
                           var10000 = var4 = "物理攻击时所能命中的几率";
                        } else if (this.rw.equals("ezml")) {
                           var10000 = var4 = "物理攻击时一定几率出现致命几率，敌方血量越多效果越高";
                        } else if (this.rw.equals("ekbl")) {
                           var10000 = var4 = "物理攻击时一定几率将自身防御率转化为攻击力";
                        } else if (this.rw.equals("efzl")) {
                           var10000 = var4 = "受到伤害反震给对方的几率";
                        } else if (this.rw.equals("efzcd")) {
                           var10000 = var4 = "受到伤害反震给对方的程度";
                        } else if (this.rw.equals("exfljl")) {
                           var10000 = var4 = "仙法攻击时所能连击的几率";
                        } else if (this.rw.equals("exfljs")) {
                           var10000 = var4 = "仙法攻击时所能连击的次数";
                        } else if (this.rw.equals("ejs")) {
                           var10000 = var4 = "受到所有伤害减少的百分比";
                        } else if (this.rw.equals("efsmz")) {
                           var10000 = var4 = "法术命中的几率";
                        } else if (this.rw.equals("efsds")) {
                           var10000 = var4 = "受到法术伤害躲闪的几率";
                        } else if (this.rw.equals("wxj")) {
                           var10000 = var4 = "五行之一,金克木";
                        } else if (this.rw.equals("wxm")) {
                           var10000 = var4 = "五行之一,木克土";
                        } else if (this.rw.equals("wxt")) {
                           var10000 = var4 = "五行之一,土克水";
                        } else if (this.rw.equals("wxs")) {
                           var10000 = var4 = "五行之一,水克火";
                        } else if (this.rw.equals("wxh")) {
                           var10000 = var4 = "五行之一,火克金";
                        } else if (this.rw.equals("wxqj")) {
                           var10000 = var4 = "对五行属金的目标造成法术和物理伤害时，受到百分比加成";
                        } else if (this.rw.equals("wxqm")) {
                           var10000 = var4 = "对五行属木的目标造成法术和物理伤害时，受到百分比加成";
                        } else if (this.rw.equals("wxqt")) {
                           var10000 = var4 = "对五行属土的目标造成法术和物理伤害时，受到百分比加成";
                        } else if (this.rw.equals("wxqs")) {
                           var10000 = var4 = "对五行属水的目标造成法术和物理伤害时，受到百分比加成";
                        } else if (this.rw.equals("wxqh")) {
                           var10000 = var4 = "对五行属火的目标造成法术和物理伤害时，受到百分比加成";
                        } else if (this.rw.equals("swsx")) {
                           var10000 = var4 = "对无属性目标伤害增加";
                        } else if (this.rw.equals("sff")) {
                           var10000 = var4 = "加强风法伤害的基础值";
                        } else if (this.rw.equals("slf")) {
                           var10000 = var4 = "加强雷法伤害的基础值";
                        } else if (this.rw.equals("ssf")) {
                           var10000 = var4 = "加强水法伤害的基础值";
                        } else if (this.rw.equals("shf")) {
                           var10000 = var4 = "加强火法伤害的基础值";
                        } else if (this.rw.equals("szd")) {
                           var10000 = var4 = "加强毒法伤害的基础值";
                        } else if (this.rw.equals("sgh")) {
                           var10000 = var4 = "加强鬼火伤害的基础值";
                        } else if (this.rw.equals("ssc")) {
                           var10000 = var4 = "加强三尸伤害的基础值";
                        } else if (this.rw.equals("sbls")) {
                           var10000 = var4 = "加强冰刃术伤害的基础值";
                        } else if (this.rw.equals("sfs")) {
                           var10000 = var4 = "增加法术类的伤害/治疗技能造成的伤害/治疗";
                        } else if (this.rw.equals("blf")) {
                           var10000 = var4 = "雷系法术狂暴的几率";
                        } else if (this.rw.equals("bff")) {
                           var10000 = var4 = "风系法术狂暴的几率";
                        } else if (this.rw.equals("bsf")) {
                           var10000 = var4 = "水系法术狂暴的几率";
                        } else if (this.rw.equals("bhf")) {
                           var10000 = var4 = "火系法术狂暴的几率";
                        } else if (this.rw.equals("bgh")) {
                           var10000 = var4 = "鬼火系法术狂暴的几率";
                        } else if (this.rw.equals("bsc")) {
                           var10000 = var4 = "三尸系法术狂暴的几率";
                        } else if (this.rw.equals("bjff")) {
                           var10000 = var4 = "风法系法术暴击的几率";
                        } else if (this.rw.equals("bjlf")) {
                           var10000 = var4 = "雷法系法术暴击的几率";
                        } else if (this.rw.equals("bjsf")) {
                           var10000 = var4 = "水法系法术暴击的几率";
                        } else if (this.rw.equals("bjhf")) {
                           var10000 = var4 = "火法系法术暴击的几率";
                        } else if (this.rw.equals("bjhl")) {
                           var10000 = var4 = "混乱系法术暴击的几率";
                        } else if (this.rw.equals("bjfy")) {
                           var10000 = var4 = "封印系法术暴击的几率";
                        } else if (this.rw.equals("bjhs")) {
                           var10000 = var4 = "昏睡系法术暴击的几率";
                        } else if (this.rw.equals("bjzd")) {
                           var10000 = var4 = "中毒系法术暴击的几率";
                        } else if (this.rw.equals("bjzs")) {
                           var10000 = var4 = "震慑系法术暴击的几率";
                        } else if (this.rw.equals("bjjs")) {
                           var10000 = var4 = "加速系法术暴击的几率";
                        } else if (this.rw.equals("bjjg")) {
                           var10000 = var4 = "加攻系法术暴击的几率";
                        } else if (this.rw.equals("bjjf")) {
                           var10000 = var4 = "加防系法术暴击的几率";
                        } else if (this.rw.equals("bjsc")) {
                           var10000 = var4 = "三尸系法术暴击的几率";
                        } else if (this.rw.equals("bjmh")) {
                           var10000 = var4 = "魅惑系法术暴击的几率";
                        } else if (this.rw.equals("bjgh")) {
                           var10000 = var4 = "鬼火系法术暴击的几率";
                        } else if (this.rw.equals("bjyw")) {
                           var10000 = var4 = "遗忘系法术暴击的几率";
                        } else if (this.rw.equals("bjlpl")) {
                           var10000 = var4 = "霹雳系法术暴击的几率";
                        } else if (this.rw.equals("bjlfy")) {
                           var10000 = var4 = "扶摇系法术暴击的几率";
                        } else if (this.rw.equals("bjlcb")) {
                           var10000 = var4 = "沧波系法术暴击的几率";
                        } else if (this.rw.equals("bjlgl")) {
                           var10000 = var4 = "甘霖系法术暴击的几率";
                        } else if (this.rw.equals("blfcd")) {
                           var10000 = var4 = "雷系法术狂暴后增加的百分比";
                        } else if (this.rw.equals("bffcd")) {
                           var10000 = var4 = "风系法术狂暴后增加的百分比";
                        } else if (this.rw.equals("bsfcd")) {
                           var10000 = var4 = "水系法术狂暴后增加的百分比";
                        } else if (this.rw.equals("bhfcd")) {
                           var10000 = var4 = "火系法术狂暴后增加的百分比";
                        } else if (this.rw.equals("bghcd")) {
                           var10000 = var4 = "鬼火系法术狂暴后增加的百分比";
                        } else if (this.rw.equals("bsccd")) {
                           var10000 = var4 = "三尸虫系法术狂暴后增加的百分比";
                        } else if (this.rw.equals("f_f")) {
                           var10000 = var4 = "物理攻击附加封印法术";
                        } else if (this.rw.equals("f_h")) {
                           var10000 = var4 = "物理攻击附加混乱法术";
                        } else if (this.rw.equals("f_d")) {
                           var10000 = var4 = "物理攻击附加中毒法术";
                        } else if (this.rw.equals("f_xf")) {
                           var10000 = var4 = "物理攻击附加风法法术";
                        } else if (this.rw.equals("f_xh")) {
                           var10000 = var4 = "物理攻击附加火法法术";
                        } else if (this.rw.equals("f_xs")) {
                           var10000 = var4 = "物理攻击附加水法法术";
                        } else if (this.rw.equals("f_xl")) {
                           var10000 = var4 = "物理攻击附加雷法法术";
                        } else if (this.rw.equals("f_zs")) {
                           var10000 = var4 = "物理攻击附加震慑法术";
                        } else if (this.rw.equals("f_sc")) {
                           var10000 = var4 = "物理攻击附加三尸法术";
                        } else if (this.rw.equals("dzs")) {
                           var10000 = var4 = "受到震慑法术伤害躲闪的几率";
                        } else if (this.rw.equals("dhf")) {
                           var10000 = var4 = "受到火系法术伤害躲闪的几率";
                        } else if (this.rw.equals("dlf")) {
                           var10000 = var4 = "受到雷系法术伤害躲闪的几率";
                        } else if (this.rw.equals("dff")) {
                           var10000 = var4 = "受到风系法术伤害躲闪的几率";
                        } else if (this.rw.equals("dsf")) {
                           var10000 = var4 = "受到水系法术伤害躲闪的几率";
                        } else if (this.rw.equals("ddf")) {
                           var10000 = var4 = "受到毒系法术伤害躲闪的几率";
                        } else if (this.rw.equals("dfy")) {
                           var10000 = var4 = "受到封印法术伤害躲闪的几率";
                        } else if (this.rw.equals("dhl")) {
                           var10000 = var4 = "受到混乱法术伤害躲闪的几率";
                        } else if (this.rw.equals("dhs")) {
                           var10000 = var4 = "受到昏睡法术伤害躲闪的几率";
                        } else if (this.rw.equals("dyw")) {
                           var10000 = var4 = "受到遗忘法术伤害躲闪的几率";
                        } else if (this.rw.equals("dgh")) {
                           var10000 = var4 = "受到鬼火法术伤害躲闪的几率";
                        } else if (this.rw.equals("dsc")) {
                           var10000 = var4 = "受到三尸法术伤害躲闪的几率";
                        } else if (this.rw.equals("jsf")) {
                           var10000 = var4 = "受到水系法术伤害减少的百分比";
                        } else if (this.rw.equals("jff")) {
                           var10000 = var4 = "受到风系法术伤害减少的百分比";
                        } else if (this.rw.equals("jlf")) {
                           var10000 = var4 = "受到雷系法术伤害减少的百分比";
                        } else if (this.rw.equals("jhf")) {
                           var10000 = var4 = "受到火系法术伤害减少的百分比";
                        } else if (this.rw.equals("jgh")) {
                           var10000 = var4 = "受到鬼火法术伤害减少的百分比";
                        } else if (this.rw.equals("jlb")) {
                           var10000 = var4 = "受到灵宝伤害减少的百分比";
                        } else if (this.rw.equals("ehsfzl")) {
                           var10000 = var4 = "忽视对方反震率";
                        } else if (this.rw.equals("mzs")) {
                           var10000 = var4 = "释放震慑时所能命中的几率";
                        } else if (this.rw.equals("mhf")) {
                           var10000 = var4 = "释放火法时所能命中的几率";
                        } else if (this.rw.equals("mlf")) {
                           var10000 = var4 = "释放雷法时所能命中的几率";
                        } else if (this.rw.equals("mff")) {
                           var10000 = var4 = "释放风法时所能命中的几率";
                        } else if (this.rw.equals("msf")) {
                           var10000 = var4 = "释放水法时所能命中的几率";
                        } else if (this.rw.equals("mdf")) {
                           var10000 = var4 = "释放毒法时所能命中的几率";
                        } else if (this.rw.equals("mfy")) {
                           var10000 = var4 = "释放封印时所能命中的几率";
                        } else if (this.rw.equals("mhl")) {
                           var10000 = var4 = "释放混乱时所能命中的几率";
                        } else if (this.rw.equals("mhs")) {
                           var10000 = var4 = "释放昏睡时所能命中的几率";
                        } else if (this.rw.equals("myw")) {
                           var10000 = var4 = "释放遗忘时所能命中的几率";
                        } else if (this.rw.equals("mgh")) {
                           var10000 = var4 = "释放鬼火时所能命中的几率";
                        } else if (this.rw.equals("msc")) {
                           var10000 = var4 = "释放三尸时所能命中的几率";
                        } else if (this.rw.equals("zsf")) {
                           var10000 = var4 = "造成水系法术伤害增加的百分比";
                        } else if (this.rw.equals("zff")) {
                           var10000 = var4 = "造成风系法术伤害增加的百分比";
                        } else if (this.rw.equals("zlf")) {
                           var10000 = var4 = "造成雷系法术伤害增加的百分比";
                        } else if (this.rw.equals("zhf")) {
                           var10000 = var4 = "造成火系法术伤害增加的百分比";
                        } else if (this.rw.equals("zgh")) {
                           var10000 = var4 = "造成鬼火法术伤害增加的百分比";
                        } else if (this.rw.equals("zdf")) {
                           var10000 = var4 = "造成毒系法术伤害增加的百分比";
                        } else if (this.rw.equals("zzsmp")) {
                           var10000 = var4 = "造成震慑法术魔法伤害增加的百分比";
                        } else if (this.rw.equals("ehp")) {
                           var10000 = var4 = "每回合恢复气血";
                        } else {
                           if (this.rw.equals("emp")) {
                              var4 = "每回合恢复法力";
                           }

                           var10000 = var4;
                        }

                        if (var10000 != null) {
                           Integer var2;
                           Double var3;
                           if ((var2 = (Integer)Class207.aoj().get(this.rw)) != null && (var2 >> Class207.aom(this.awx) & (4 ^ 5)) == (3 & 5) && (var3 = this.awx.aol(this)) != null) {
                              StringBuilder var5 = (new StringBuilder(String.valueOf(var4))).append("#r距离抗性上限:");
                              Object[] var10002 = new Object[2 ^ 3];
                              boolean var10004 = true;
                              var10002[3 & 4] = var3;
                              var4 = var5.append(String.format("%.1f", var10002)).toString();
                           }

                           ((Class270)this.awx.ve().e(46 & 127)).la(var4);
                        }
                     }

                  
                     static String amd(Object var0) {
                        return var0.rw;
                     }

                  
                     static double ame(Object var0) {
                        return var0.aas;
                     }

                  
                     static void amf(Object var0, String var1) {
                        var0.rw = var1;
                     }

                  
                     static void amg(Object var0, double var1) {
                        var0.aas = var1;
                     }

                     public void mousePressed(MouseEvent var1) {
                     }

                     public void mouseReleased(MouseEvent var1) {
                     }

                     public {
                        this.awx = var1;
                     }
                  };
                  ((<undefinedtype>)var2).setForeground(Color.white);
                  ((<undefinedtype>)var2).setFont(Class681.ab);
                  ((<undefinedtype>)var2).addMouseListener((MouseListener)var2);
                  ((<undefinedtype>)var2).addMouseMotionListener(Class207.this.gk());
                  ((<undefinedtype>)var10000).addMouseListener(Class207.this.gk());
                  this.add((Component)var10000);
                  this.ez.add(var2);
               }

               ((<undefinedtype>)var2).setVisible((boolean)(--1));
               return (<undefinedtype>)var2;
            }
         };
         this.add(this.azc[var2++]);
      }

   }


   private static void aop(BaseQl var0) {
      if (var0.getKey() != null) {
         BaseQl var10000;
         String var1;
         switch((var1 = var0.getKey()).hashCode()) {
         case -1814824587:
            while(false) {
            }

            if (var1.equals("抗分光化影")) {
               var0.setKey("灵犀一点");
               return;
            }

            var10000 = var0;
            break;
         case -1741749902:
            if (var1.equals("抗天魔解体")) {
               var0.setKey("化血成碧");
               return;
            }

            var10000 = var0;
            break;
         case -1732293003:
            if (var1.equals("抗小楼夜哭")) {
               var0.setKey("明珠有泪");
               return;
            }

            var10000 = var0;
            break;
         case -1608135126:
            if (var1.equals("抗水法狂暴")) {
               var0.setKey("抗水法狂暴几率");
               return;
            }

            var10000 = var0;
            break;
         case -1597909547:
            if (var1.equals("抗浩然正气")) {
               var0.setKey("上善若水");
               return;
            }

            var10000 = var0;
            break;
         case -1575990637:
            if (var1.equals("抗火法狂暴")) {
               var0.setKey("抗火法狂暴几率");
               return;
            }

            var10000 = var0;
            break;
         case -1289194936:
            if (var1.equals("抗隔山大牛")) {
               var0.setKey("尘埃落定");
               return;
            }

            var10000 = var0;
            break;
         case -1282013049:
            if (var1.equals("抗雷法狂暴")) {
               var0.setKey("抗雷法狂暴几率");
               return;
            }

            var10000 = var0;
            break;
         case -1268826016:
            if (var1.equals("抗青面獠牙")) {
               var0.setKey("美人迟暮");
               return;
            }

            var10000 = var0;
            break;
         case -1267981488:
            if (var1.equals("抗风法狂暴")) {
               var0.setKey("抗风法狂暴几率");
               return;
            }

            var10000 = var0;
            break;
         case -1248569288:
            if (var1.equals("抗鬼火狂暴")) {
               var0.setKey("抗鬼火狂暴几率");
               return;
            }

            var10000 = var0;
            break;
         case -1194311134:
            if (var1.equals("加强三尸虫")) {
               var0.setKey("强三尸虫");
               return;
            }

            var10000 = var0;
            break;
         case -791726641:
            if (var1.equals("加强速度法术效果")) {
               var0.setKey("加强加速法术效果");
               return;
            }

            var10000 = var0;
            break;
         case -307203320:
            if (var1.equals("加强攻击法术效果")) {
               var0.setKey("加强加攻法术效果");
               return;
            }

            var10000 = var0;
            break;
         case 29076885:
            if (var1.equals("狂暴率")) {
               var0.setKey("狂暴几率");
               return;
            }

            var10000 = var0;
            break;
         case 32670622:
            if (var1.equals("致命率")) {
               var0.setKey("致命几率");
               return;
            }

            var10000 = var0;
            break;
         case 852922131:
            if (var1.equals("水法狂暴")) {
               var0.setKey("水法狂暴几率");
               return;
            }

            var10000 = var0;
            break;
         case 856082378:
            if (var1.equals("法术命中")) {
               var0.setKey("法术命中率");
               return;
            }

            var10000 = var0;
            break;
         case 856562674:
            if (var1.equals("法术躲闪")) {
               var0.setKey("法术躲闪率");
               return;
            }

            var10000 = var0;
            break;
         case 885066620:
            if (var1.equals("火法狂暴")) {
               var0.setKey("火法狂暴几率");
               return;
            }

            var10000 = var0;
            break;
         case 901786491:
            if (var1.equals("物理吸收")) {
               var0.setKey("物理吸收率");
               return;
            }

            var10000 = var0;
            break;
         case 1008733975:
            if (var1.equals("加强防御法术效果")) {
               var0.setKey("加强加防法术效果");
               return;
            }

            var10000 = var0;
            break;
         case 1179044208:
            if (var1.equals("雷法狂暴")) {
               var0.setKey("雷法狂暴几率");
               return;
            }

            var10000 = var0;
            break;
         case 1193075769:
            if (var1.equals("风法狂暴")) {
               var0.setKey("风法狂暴几率");
               return;
            }

            var10000 = var0;
            break;
         case 1212487969:
            if (var1.equals("鬼火狂暴")) {
               var0.setKey("鬼火狂暴几率");
               return;
            }

            var10000 = var0;
            break;
         case 2006621742:
            if (var1.equals("三尸虫狂暴")) {
               var0.setKey("三尸虫狂暴几率");
               return;
            }

            var10000 = var0;
            break;
         default:
            var10000 = var0;
         }

         if (var10000.getKey().startsWith("强")) {
            if (var0.getKey().startsWith("强力")) {
               return;
            }

            var0.setKey("加" + var0.getKey());
         }

      }
   }

   public void s() {
      int var1;
      for(int var10000 = var1 = 3 & 4; var10000 < this.azc.length; var10000 = var1) {
         this.azc[var1++].q();
      }

   }

   public void aoq(int var1, double var2, String var4, String var5) {
      if (var2 != 0.0D) {
         if (var1 == (3 & 5)) {
            this.azc[3 & 4].zz(var2, var4, var5);
         } else if (var1 == 5 >> 1) {
            this.azc[--3].zz(var2, var4, var5);
         } else if (var1 == --3) {
            this.azc[--1].zz(var2, var4, var5);
         } else if (var1 == --4) {
            this.azc[5 >> 1].zz(var2, var4, var5);
         } else {
            if (var1 == --5) {
               this.azc[--4].zz(var2, var4, var5);
            }

         }
      }
   }

   public void d() {
      int var1 = 3 & 4;

      int var2;
      for(int var10000 = var2 = 3 & 4; var10000 < this.azc.length; var10000 = var2) {
         int var3 = this.azc[var2].afz ? this.azc[var2].cy : 20;
         this.azc[var2].setBounds(5 >> 3, var1, 18299 & 14767, var3);
         ++var2;
         var1 += var3;
      }

      this.vf(this.getX(), this.getY(), 9647 & 23420, var1);
   }
}
