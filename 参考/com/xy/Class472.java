package com.xy;

import com.xy.bean.MonsterBean;
import com.xy.bean.NPCDialog;
import com.xy.entity.DataOther;
import com.xy.entity.Lingbao;
import com.xy.entity.RoleSummoning;
import com.xy.formula.GoodExchange;
import com.xy.formula.MsgUntil;
import com.xy.game.NpcOption;
import com.xy.game.PKSys;
import com.xy.game.RoleData;
import com.xy.game.Task;
import com.xy.game.TaskProgress;
import com.xy.readbean.Activity;
import com.xy.readbean.Door;
import com.xy.readbean.GoodFight;
import com.xy.readbean.Goodstable;
import com.xy.readbean.NpcInfoBean;
import com.xy.readbean.Question;
import com.xy.readbean.Skill;
import com.xy.readbean.Talk;
import com.xy.readbean.TaskData;
import com.xy.readbean.XuanBao;
import com.xy.readbean.XuanYin;
import com.xy.richtext.RichLabel;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.image.ImageObserver;
import java.math.BigDecimal;
import java.util.List;
import javax.swing.JComponent;
import javax.swing.JScrollPane;

public class Class472 extends Class345 {
   private JScrollPane eb;
   private Class436 ec;
   private Class292 uk;
   private int ay;
   private Long ul;
   private RichLabel bw;
   private JComponent um;
   private Long un;

   public void lf(RoleSummoning var1, Goodstable var2) {
      if (var1 != null && var2 != null) {
         int var10005 = 127 & 15;
         this.o();
         this.ay = var10005;
         this.un = var1.getSid().longValue();
         this.ul = var2.getRgid().longValue();
         int var10 = 3 ^ 3;
         String[] var3 = null;
         int var4;
         int var5;
         int var10000;
         if (var1.getPetSkills() != null && !var1.getPetSkills().equals("")) {
            var3 = var1.getPetSkills().split("\\|");

            for(var10000 = var4 = 3 & 4; var10000 < var3.length; var10000 = var4) {
               if (!var3[var4].startsWith("L") && !var3[var4].startsWith("Q") && !var3[var4].startsWith("T") && !var3[var4].startsWith("X")) {
                  if (!Class683.apm(Integer.parseInt((var5 = var3[var4].indexOf("=")) == -4 >> 2 ? var3[var4] : var3[var4].substring(3 ^ 3, var5)), this.uw())) {
                     var3[var4] = null;
                  } else {
                     ++var10;
                  }
               } else {
                  var3[var4] = null;
               }

               ++var4;
            }
         }

         if (var10 == 0) {
            this.aej.fw("该召唤兽还未学习到可悟灵的技能");
         } else {
            int var10001 = 3 >> 2;
            this.lb("可将" + var1.getSummoningname() + "以下技能进行灵返");
            var4 = var10001;
            var5 = 2 & 5;
            Class603 var6 = this.vc();

            int var9;
            for(var10000 = var9 = 3 ^ 3; var10000 < var3.length; var10000 = var9) {
               if (var3[var9] != null) {
                  var10 = var3[var9].indexOf("=");
                  Skill var7;
                  if ((var7 = var6.bf(var10 == -4 >> 2 ? var3[var9] : var3[var9].substring(3 & 4, var10))) != null) {
                     String var8 = var10 != -4 >> 2 ? var7.getSkillname() + "(" + var3[var9].substring(var10 + (4 ^ 5)) + ")" : var7.getSkillname();
                     int var10002 = var4;
                     int var10004 = 73 & 63;
                     ++var4;
                     var5 += this.lq(var10002, var5, var10004, Integer.parseInt(var7.getSkillid()), (Object)null, var8, 31215 & 2002);
                  }
               }

               ++var9;
            }

            this.li(var5, (23 & 127) + this.bw.getHeight());
            this.go();
         }
      }
   }

   public void mousePressed(MouseEvent var1) {
      super.mousePressed(var1);
      if (this.ay == (46 & 91) && var1.getButton() == --1) {
         this.s();
      }

   }

   public void la(String var1) {
      if (!Class394.o(var1)) {
         int var10001 = 5 >> 3;
         int var10005 = 95 & 41;
         this.o();
         this.ay = var10005;
         this.lb(var1);
         this.li(var10001, (23 & 127) + this.bw.getHeight());
         this.go();
      }
   }

   public void go() {
      this.f((String)null);
   }

   public void dg() {
      List var1;
      if ((var1 = this.vd().dataOtherList) == null) {
         this.aej.f("出现异常");
      } else {
         int var10001 = 63 & 94;
         this.o();
         this.lb("请选择一个方案进行覆盖");
         this.ay = var10001;
         int var5 = 3 & 4;
         int var3 = 3 & 4;

         int var4;
         for(int var10000 = var4 = 2 & 5; var10000 < var1.size(); var10000 = var4) {
            DataOther var2;
            if ((var2 = (DataOther)var1.get(var4)).a()) {
               int var10002 = var5;
               int var10004 = 63 & 94;
               int var10005 = --3;
               ++var5;
               var3 += this.lq(var10002, var3, var10004, var10005, var2.getId(), var2.getKey(), 24006 & 9211);
            }

            ++var4;
         }

         this.li(var3, (127 & 23) + this.bw.getHeight());
         this.go();
      }
   }

   public void lg(int var1, XuanBao var2, Goodstable var3) {
      int var10003 = 28 & 127;
      this.o();
      this.ay = var10003;
      Class603 var4 = this.vc();
      RoleData var5 = this.vd();
      int var6 = 5 >> 3;
      int var7 = 3 >> 2;

      int var8;
      for(int var10000 = var8 = 5 >> 3; var10000 < var5.goodPacks.length; var10000 = var8) {
         Goodstable var9;
         if ((var9 = var5.getGood(var5.goodPacks[var8])) != null && var9.getType() == 811L) {
            Point var10 = var9.nd();
            XuanYin var11;
            if ((var11 = var4.ao(Math.abs(var10.x))) != null && (var2.getYins()[var1] >> var11.getType() & (4 ^ 5)) == --1) {
               int var10002 = var6;
               int var10004 = 30 & 119;
               ++var6;
               var7 += this.lq(var10002, var7, var10004, 5 >> 3, var3.getRgid() + "|" + var9.getRgid() + "|" + var1, var10.y + "级" + var11.getName(), 2011 & 31206);
            }
         }

         ++var8;
      }

      StringBuilder var12 = new StringBuilder;
      String var10001;
      if (var6 > 0) {
         var12.<init>("请选择一个玄印镶嵌到第");
         var10001 = var12.append(var1 + --1).append("个玄印槽").toString();
      } else {
         var12.<init>("背包中没有符合第");
         var10001 = var12.append(var1 + (2 ^ 3)).append("个玄印槽的玄印").toString();
      }

      this.lb(var10001);
      this.li(var7, (119 & 31) + this.bw.getHeight());
      this.go();
   }

   public void lh(Class165 var1, NpcInfoBean var2, int var3) {
      int var10003 = 3 ^ 3;
      this.o();
      this.ay = var10003;
      this.un = var2 != null ? Long.parseLong(var2.getNpctable().getNpcid()) : null;
      int var10001 = 2 & 5;
      this.uk = var1;
      int var7 = var10001;
      var3 = 2 & 5;
      RoleData var4;
      PKSys var5;
      Class472 var10000;
      int var10005;
      int var10006;
      if ((var5 = (var4 = this.vd()).getPkSys()).getPk2() == 0) {
         this.lb("一个良民瞎点啥,在闹请你进去");
         var10000 = this;
         var10003 = var7;
         var10005 = 2 & 5;
         var10006 = --3;
         ++var7;
         var3 += this.lq(var10003, var3, var10005, var10006, (Object)null, "我要回长安", 11718 & 21499);
      } else if (var5.getPk1() != 0) {
         StringBuffer var6 = new StringBuffer();
         var10000 = this;
         var6.append(var4.getLoginResult().getRolename());
         var6.append(",你还有");
         var6.append(var5.getPk1());
         var6.append("点PK标志未清除");
         this.lb(var6.toString());
         int var10007 = var7;
         int var10009 = 3 >> 2;
         ++var7;
         var3 += this.lq(var10007, var3, var10009, var10009, (Object)null, "我什么都不做", 10731 & 22486);
      } else if (var5.getPk2() == 3 >> 1) {
         this.lb("今天又收到红色炸弹了。哎日子难过啊");
         int var10002 = var7;
         int var10004 = 5 >> 3;
         ++var7;
         var3 += this.lq(var10002, var3, var10004, 127 & 59, (Object)null, "这是8888W,小小意思", 3039 & 30178);
         var10002 = var7;
         var10004 = 3 & 4;
         ++var7;
         var10001 = var3 += this.lq(var10002, var3, var10004, 127 & 60, (Object)null, "哦?大爷是来办理出狱手续", 25063 & 8154);
         var10000 = this;
         var10003 = var7;
         var10005 = 3 & 4;
         var10006 = 3 & 4;
         ++var7;
         var3 = var10001 + this.lq(var10003, var3, var10005, var10006, (Object)null, "别愁,我去帮你筹点钱", 9726 & 23491);
      } else {
         var10000 = this;
         this.lb("今天天气真好,是出狱的好日子");
         var10003 = var7;
         var10005 = 5 >> 3;
         ++var7;
         var3 += this.lq(var10003, var3, var10005, 127 & 61, (Object)null, "我是来办理出狱手续", 27075 & 6142);
      }

      var10000.li(var3, (23 & 127) + this.bw.getHeight());
      this.f(var2.getNpctable().getSkin());
   }

   public void o() {
      int var10000 = this.ay = 5 >> 3;
      this.uk = null;
      this.un = null;
      this.ul = null;

      for(int var1 = var10000; var10000 < this.um.getComponentCount(); var10000 = var1) {
         this.um.getComponent(var1++).setVisible((boolean)(5 >> 3));
      }

      this.bw.setTextSize("", 21487 & 11775);
      this.ec.q();
   }

   public void li(int var1, int var2) {
      var1 = var1 > (50 & 127) ? var1 : 50;
      int var3 = (15291 & 17663) - var2;
      this.um.setPreferredSize(new Dimension(12770 & 20447, var1));
      this.eb.setBounds(95 & 52, var2, 6646 & 26591, var1 < var3 ? var1 : var3);
   }

   public boolean t() {
      if (this.ay == (90 & 47)) {
         int var10000 = 5 >> 3;
         this.s();
         return (boolean)var10000;
      } else {
         return super.t();
      }
   }

   public void bx(BigDecimal var1, int var2) {
      int var10002 = 3 ^ 3;
      int var10009 = 117 & 27;
      this.o();
      this.ay = var10009;
      this.un = var1.longValue();
      this.ul = (long)var2;
      this.lb("请选择下面其中一项增加" + var2 + "点的基础值");
      int var3 = var10002;
      var2 = 5 >> 3;
      int var10004 = var3;
      int var10006 = 11 & 127;
      ++var3;
      var2 += this.lq(var10004, var2, var10006, 3 & 4, 3 & 4, "HP", 9207 & 24010);
      var10004 = var3;
      var10006 = 31 & 107;
      ++var3;
      var2 += this.lq(var10004, var2, var10006, 5 >> 2, 2 & 5, "MP", 22482 & 10735);
      var10004 = var3;
      var10006 = 79 & 59;
      ++var3;
      var2 += this.lq(var10004, var2, var10006, 5 >> 1, 3 >> 2, "AP", 25051 & 8166);
      var10004 = var3;
      var10006 = 75 & 63;
      ++var3;
      this.li(var2 + this.lq(var10004, var2, var10006, --3, 5 >> 3, "SP", 26083 & 7134), (119 & 31) + this.bw.getHeight());
      this.go();
   }

   public void bk(BigDecimal var1) {
      int var10002 = 2 & 5;
      int var10008 = 92 & 51;
      this.o();
      this.ay = var10008;
      this.un = var1.longValue();
      this.lb("是否变化该召唤兽的造型");
      int var3 = var10002;
      int var2 = 3 >> 2;
      int var10004 = var3;
      int var10006 = 126 & 11;
      ++var3;
      var2 += this.lq(var10004, var2, var10006, --1, 3 >> 2, "是", 32207 & 1010);
      var10004 = var3;
      var10006 = 27 & 110;
      ++var3;
      this.li(var2 + this.lq(var10004, var2, var10006, 3 & 4, 3 & 4, "否", 23011 & 10206), (63 & 87) + this.bw.getHeight());
      this.go();
   }

   public Long lj() {
      return this.un;
   }

   public void lk(Class526 var1) {
      int var10001 = 3 ^ 3;
      int var10007 = 3 ^ 3;
      this.o();
      this.ay = var10007;
      this.uk = var1;
      this.lb("这里风景还不差");
      int var5 = var10001;
      int var2 = 2 & 5;
      int var10003 = var5;
      int var10005 = 123 & 62;
      ++var5;
      var2 += this.lq(var10003, var2, 5 >> 3, var10005, 5 >> 3, "我是来击杀你的", 31219 & 1998);
      int var3;
      TaskData var4;
      int var10002;
      int var10004;
      if ((var4 = var1.y.getTask().getTaskData()) != null) {
         for(int var6 = var3 = 3 >> 1; var6 <= var4.getNd(); var6 = var3) {
            if (var3 == 3 >> 1) {
               var10002 = var5;
               var10004 = 5 >> 3;
               ++var5;
               var2 += this.lq(var10002, var2, var10004, 126 & 59, 3 >> 1, "我是来击杀你的(困难难度)", 25075 & 8142);
            } else if (var3 == --2) {
               var10002 = var5;
               var10004 = 2 & 5;
               ++var5;
               var2 += this.lq(var10002, var2, var10004, 123 & 62, 1 ^ 3, "我是来击杀你的(卓越难度)", 471 & 32746);
            } else if (var3 == --3) {
               var10002 = var5;
               var10004 = 3 ^ 3;
               ++var5;
               var2 += this.lq(var10002, var2, var10004, 122 & 63, --3, "我是来击杀你的(地狱难度)", 17347 & 15870);
            } else if (var3 == --4) {
               var10002 = var5;
               var10004 = 3 & 4;
               ++var5;
               var2 += this.lq(var10002, var2, var10004, 127 & 58, --4, "我是来击杀你的(天堂难度)", 24515 & 8702);
            }

            ++var3;
         }
      }

      var10002 = var5;
      var10004 = 3 & 4;
      var10005 = 3 & 4;
      ++var5;
      var2 += this.lq(var10002, var2, var10004, var10005, (Object)null, "我什么都不想做", 27614 & 5603);
      this.li(var2, (119 & 31) + this.bw.getHeight());
      this.f((String)null);
   }

   public void ey(Goodstable var1, int var2, int var3) {
      Class603 var4;
      Goodstable var5;
      GoodExchange[] var6 = (var5 = (var4 = this.aej.getObjectArea()).n(var1.getGoodsid())) != null ? var5.getExchanges() : null;
      if (var6 != null) {
         this.ay = 125 & 23;
         this.un = var1.getRgid().longValue();
         this.ul = (long)var3;
         this.lb("请选择需要兑换的选项。当前兑换数量:" + var3);
         int var7 = 2 & 5;
         var3 = 3 ^ 3;
         GoodExchange var8 = var6[var2];

         int var9;
         for(int var10000 = var9 = 2 & 5; var10000 < var8.getGoods().length; var10000 = var9) {
            if ((var5 = var4.n(var8.getGoods()[var9])) != null) {
               int var10002 = var7;
               int var10004 = 111 & 31;
               ++var7;
               var3 += this.lq(var10002, var3, var10004, var8.getGoods()[var9].intValue(), (Object)null, var5.getGoodsname(), 21990 & 11227);
            }

            ++var9;
         }

         this.li(var3, (63 & 87) + this.bw.getHeight());
         this.go();
      }
   }

   public void ll(Class165 var1, NpcInfoBean var2, int var3) {
      if (var3 == (117 & 111)) {
         this.lh(var1, var2, var3);
      } else if (var3 == (110 & 119)) {
         this.lr(var1, var2, var3);
      } else {
         int var10003 = 5 >> 3;
         this.o();
         this.ay = var10003;
         this.un = var2 != null ? Long.parseLong(var2.getNpctable().getNpcid()) : null;
         this.uk = var1;
         Talk var11 = var2 != null ? var2.a() : null;
         if (var11 != null) {
            this.lb(var11.getTalktext());
            if (var2.getNpctable().getNpcid().equals("400102")) {
               this.uw().d(Agreement.getSendTextAES("hatchvalue", (String)null));
            }
         } else {
            this.lb((String)null);
         }

         String var12 = null;
         int var4 = 3 >> 2;
         int var5 = 2 & 5;
         int var8;
         NpcInfoBean var10000;
         int var10002;
         int var10004;
         int var23;
         if ((var3 < --5 || var3 > (78 & 59)) && (var3 < (127 & 13) || var3 > (47 & 95)) && var3 != (114 & 31) && var3 != (119 & 45) && var3 != (61 & 111) && var3 != (59 & 118) && var3 != (126 & 89) && var3 != (99 & 127) && var3 != (120 & 127) && var3 != (125 & 123) && var3 != (127 & 123) && var3 != (124 & 127) && var3 != (125 & 127) && var3 != 131 && var3 != 136 && var3 != 735 && var3 != 2025) {
            if (var3 >= 19 && var3 <= 30 || var3 >= 72 && var3 <= 75) {
               var12 = "我什么都不做";
               if (MsgUntil.r(var3, this.vd().getLoginResult().getSpecies_id().intValue())) {
                  var10002 = var4;
                  var10004 = 3 ^ 3;
                  ++var4;
                  var5 += this.lq(var10002, var5, var10004, 1 ^ 3, var3, "学习法术", 450);
               }

               var10002 = var4;
               var10004 = 3 ^ 3;
               int var10005 = --3;
               ++var4;
               var5 += this.lq(var10002, var5, var10004, var10005, (Object)null, "我要回长安", 450);
               var10000 = var2;
            } else if (var3 == 888) {
               var12 = "我什么都不做";
               var10002 = var4;
               var10004 = 5 >> 3;
               ++var4;
               var5 += this.lq(var10002, var5, var10004, --4, (Object)null, "我要结婚", 450);
               var10002 = var4;
               var10004 = 3 & 4;
               ++var4;
               var5 += this.lq(var10002, var5, var10004, --5, (Object)null, "我要离婚", 450);
               var10000 = var2;
            } else if (var3 == 39) {
               var10002 = var4;
               var10004 = 3 & 4;
               ++var4;
               var5 += this.lq(var10002, var5, var10004, 6, 60, "我要领取一小时双倍时间", 450);
               var10002 = var4;
               var10004 = 3 >> 2;
               ++var4;
               var5 += this.lq(var10002, var5, var10004, 6, 120, "我要领取二小时双倍时间", 450);
               var10002 = var4;
               var10004 = 3 ^ 3;
               ++var4;
               var5 += this.lq(var10002, var5, var10004, 6, 240, "我要领取四小时双倍时间", 450);
               var10002 = var4;
               var10004 = 3 & 4;
               ++var4;
               var5 += this.lq(var10002, var5, var10004, 7, (Object)null, "我要冻结双倍时间", 450);
               var10002 = var4;
               var10004 = 3 >> 2;
               ++var4;
               var5 += this.lq(var10002, var5, var10004, 8, (Object)null, "我要查询剩余双倍时间", 450);
               var10000 = var2;
            } else {
               label568: {
                  if (var3 == 40) {
                     var12 = "我什么都不做";
                     var10002 = var4;
                     var10004 = 2 & 5;
                     ++var4;
                     var5 += this.lq(var10002, var5, var10004, 9, "换个高级藏宝图", "换个高级藏宝图", 450);
                     var10002 = var4;
                     var10004 = 5 >> 3;
                     ++var4;
                     var5 += this.lq(var10002, var5, var10004, 9, "换个超级藏宝图", "换个超级藏宝图", 450);
                     if (!this.uw().n(--2, 11) && !this.uw().n(5 >> 1, 12)) {
                        var10002 = var4;
                        var10004 = 5 >> 3;
                        ++var4;
                        var5 += this.lq(var10002, var5, var10004, 9, "换个玲珑藏宝图(消耗10E大话币,1W仙玉)", "换个玲珑藏宝图(消耗10E大话币,1W仙玉)", 450);
                        var10000 = var2;
                        break label568;
                     }
                  } else {
                     if (var3 == 41) {
                        var12 = "我什么都不做";
                        var10002 = var4;
                        var10004 = 2 & 5;
                        ++var4;
                        var5 += this.lq(var10002, var5, var10004, 10, (Object)null, "我要住店(扣除2000银两)", 450);
                        var10000 = var2;
                        break label568;
                     }

                     if (var3 == 12) {
                        if (this.uw().n(5 >> 1, --3)) {
                           var10002 = var4;
                           var10004 = 3 >> 2;
                           ++var4;
                           var5 += this.lq(var10002, var5, var10004, 11, "我要升级神兵", "我要升级神兵", 450);
                           var10002 = var4;
                           var10004 = 5 >> 3;
                           ++var4;
                           var5 += this.lq(var10002, var5, var10004, 11, "我要上神兵石", "我要上神兵石", 450);
                           var5 += this.lq(var4++, var5, 0, 11, "精炼神兵", "精炼神兵", 450);
                           var5 += this.lq(var4++, var5, 0, 11, "我要合成炼妖石", "我要合成炼妖石", 450);
                           var5 += this.lq(var4++, var5, 0, 11, "宝石合成", "宝石合成", 450);
                           var5 += this.lq(var4++, var5, 0, 11, "宝石镶嵌", "宝石镶嵌", 450);
                           var5 += this.lq(var4++, var5, 0, 11, "宝石追加", "宝石追加", 450);
                           var10000 = var2;
                        } else {
                           var5 += this.lq(var4++, var5, 0, 11, "我要打造普通装备", "我要打造普通装备", 450);
                           var5 += this.lq(var4++, var5, 0, 11, "我要升级神兵", "我要升级神兵", 450);
                           var5 += this.lq(var4++, var5, 0, 11, "精炼神兵", "精炼神兵", 450);
                           var5 += this.lq(var4++, var5, 0, 11, "我要上神兵石", "我要上神兵石", 450);
                           var5 += this.lq(var4++, var5, 0, 11, "我要合成炼妖石", "我要合成炼妖石", 450);
                           var5 += this.lq(var4++, var5, 0, 11, "符石", "符石", 450);
                           var10000 = var2;
                        }
                        break label568;
                     }

                     if (var3 == 16) {
                        var12 = "我什么都不做";
                        var5 += this.lq(var4++, var5, 0, 12, (Object)null, "治疗当前召唤兽并恢复忠诚", 450);
                        var5 += this.lq(var4++, var5, 0, 14, (Object)null, "全部医治和修复", 450);
                        var10000 = var2;
                        break label568;
                     }

                     if (var3 == 32) {
                        var12 = "我什么都不做";
                        var5 += this.lq(var4++, var5, 0, 16, (Object)null, "我要一颗情花苗", 450);
                        var10000 = var2;
                        break label568;
                     }

                     if (var3 == 36) {
                        var12 = "我什么都不做";
                        var5 += this.lq(var4++, var5, 0, 9, "我是来召唤你的", "我是来召唤你的", 450);
                        var10000 = var2;
                        break label568;
                     }

                     if (var3 == 38) {
                        var12 = "我什么都不做";
                        var5 += this.lq(var4++, var5, 0, 18, (Object)null, "神兽学习技能", 450);
                        var5 += this.lq(var4++, var5, 0, 19, (Object)null, "飞升当前参战神兽", 450);
                        if (!this.uw().n(--2, 12)) {
                           var5 += this.lq(var4++, var5, 0, 20, (Object)null, "我要合成召唤兽", 450);
                           var5 += this.lq(var4++, var5, 0, 21, (Object)null, "我要幻化当前参战召唤兽", 450);
                           var10000 = var2;
                           break label568;
                        }

                        var5 += this.lq(var4++, var5, 0, 67, (Object)null, "我有神兽碎片,我来换神兽", 450);
                        if (this.uw().v() || this.uw().f()) {
                           var5 += this.lq(var4++, var5, 0, 21, (Object)null, "我要幻化当前参战召唤兽", 450);
                           var10000 = var2;
                           break label568;
                        }
                     } else if (var3 == 44) {
                        var12 = "我什么都不做";
                        var5 += this.lq(var4++, var5, 0, 22, (Object)null, "转生当前召唤兽", 450);
                        var5 += this.lq(var4++, var5, 0, 23, (Object)null, "点化当前召唤兽", 450);
                        var5 += this.lq(var4++, var5, 0, 24, (Object)null, "启灵当前召唤兽", 450);
                        var5 += this.lq(var4++, var5, 0, 25, (Object)null, "点化当前坐骑", 450);
                        if (this.uw().gameMount) {
                           var5 += this.lq(var4++, var5, 0, 68, (Object)null, "我要重塑一到五坐骑", 450);
                           var10000 = var2;
                           break label568;
                        }
                     } else {
                        if (var3 == 47) {
                           var12 = "我什么都不做";
                           var5 += this.lq(var4++, var5, 0, 26, (Object)null, "我已做好了转生准备", 450);
                           var10000 = var2;
                           break label568;
                        }

                        if (var3 == 48) {
                           var12 = "我什么都不做";
                           var5 += this.lq(var4++, var5, 0, 27, (Object)null, "我想转换种族", 450);
                           var10000 = var2;
                           break label568;
                        }

                        Class472 var22;
                        if (var3 == 54) {
                           var12 = "我什么都不做";
                           if (this.uw().n(--2, --3)) {
                              var5 += this.lq(var4++, var5, 0, 11, "我要打造普通装备", "我要打造普通装备", 450);
                              var5 += this.lq(var4++, var5, 0, 11, "打造11-14级装备", "打造11-14级装备", 450);
                              var22 = this;
                           } else {
                              var5 += this.lq(var4++, var5, 0, 11, "打造11-16级装备", "打造11-16级装备", 450);
                              var22 = this;
                           }

                           if (var22.uw().gameBaby) {
                              var5 += this.lq(var4++, var5, 0, 11, "打造孩子装备", "打造孩子装备", 450);
                              var10000 = var2;
                              break label568;
                           }
                        } else {
                           if (var3 == 61) {
                              var12 = "我什么都不做";
                              var5 += this.lq(var4++, var5, 0, 28, "我来报名参加帮战", "我来报名参加帮战", 450);
                              var5 += this.lq(var4++, var5, 0, 28, "我要参加帮战", "我要参加帮战", 450);
                              var5 += this.lq(var4++, var5, 0, 28, "我要领取帮战奖励", "我要领取帮战奖励", 450);
                              var5 += this.lq(var4++, var5, 0, 1, var3, "我想买点东西", 450);
                              var10000 = var2;
                              break label568;
                           }

                           if (var3 == 63) {
                              var12 = "我什么都不做";
                              var5 += this.lq(var4++, var5, 0, 31, (Object)null, "我要创建帮派,(需要一个召集令)", 450);
                              var5 += this.lq(var4++, var5, 0, 32, (Object)null, "加入帮派", 450);
                              var10000 = var2;
                              break label568;
                           }

                           if (var3 == 64) {
                              var12 = "我什么都不做";
                              var5 += this.lq(var4++, var5, 0, 33, (Object)null, "进入帮派", 450);
                              var10000 = var2;
                              break label568;
                           }

                           if (var3 == 66) {
                              var12 = "我什么都不做";
                              var5 += this.lq(var4++, var5, 0, 11, "我要合成仙器", "我要合成仙器", 450);
                              var5 += this.lq(var4++, var5, 0, 11, "我要升级仙器", "我要升级仙器", 450);
                              var5 += this.lq(var4++, var5, 0, 11, "我要洗炼仙器", "我要洗炼仙器", 450);
                              var10000 = var2;
                              break label568;
                           }

                           if (var3 == 69) {
                              var12 = "我什么都不做";
                              var5 += this.lq(var4++, var5, 0, 11, "我要培养护身符", "我要培养护身符", 450);
                              var5 += this.lq(var4++, var5, 0, 11, "我要重铸护身符", "我要重铸护身符", 450);
                              var5 += this.lq(var4++, var5, 0, 11, "我要培养饰品", "我要培养饰品", 450);
                              var5 += this.lq(var4++, var5, 0, 11, "我要重铸饰品", "我要重铸饰品", 450);
                              var5 += this.lq(var4++, var5, 0, 11, "培养彩晶石", "培养彩晶石", 450);
                              var10000 = var2;
                              break label568;
                           }

                           if (var3 == 31) {
                              var12 = "我什么都不做";
                              var5 += this.lq(var4++, var5, 0, 34, (Object)null, "我要取回物品", 450);
                              var5 += this.lq(var4++, var5, 0, 35, (Object)null, "我要典当物品", 450);
                              var5 += this.lq(var4++, var5, 0, 36, (Object)null, "我要典当召唤兽", 450);
                              var10000 = var2;
                              break label568;
                           }

                           if (var3 == 33) {
                              var12 = "我什么都不做";
                              var5 += this.lq(var4++, var5, 0, 37, (Object)null, "我来查询寄售金钱", 450);
                              var5 += this.lq(var4++, var5, 0, 38, (Object)null, "我要取出寄售金钱", 450);
                              var5 += this.lq(var4++, var5, 0, 39, (Object)null, "我要存点钱(0.1%手续费)", 450);
                              var10000 = var2;
                              break label568;
                           }

                           if (var3 == 130) {
                              var12 = "我什么都不做";
                              var5 += this.lq(var4++, var5, 0, 66, (Object)null, "我要领养一个孩子", 450);
                              var10000 = var2;
                              break label568;
                           }

                           if (var3 == 1001) {
                              var5 += this.lq(var4++, var5, 0, 28, "我要进入战场", "我要进入战场", 450);
                              var5 += this.lq(var4++, var5, 0, 28, "我要进入高手挑战赛", "我要进入高手挑战赛", 450);
                              var5 += this.lq(var4++, var5, 0, 28, "回到营地", "回到营地", 450);
                              var5 += this.lq(var4++, var5, 0, 28, "我要脱离帮战", "我要脱离帮战", 450);
                              var10000 = var2;
                              break label568;
                           }

                           if (var3 == 1003) {
                              var5 += this.lq(var4++, var5, 0, 9, "剧毒封印之书", "剧毒封印之书", 450);
                              var5 += this.lq(var4++, var5, 0, 9, "寒冰封印之书", "寒冰封印之书", 450);
                              var5 += this.lq(var4++, var5, 0, 9, "天雷封印之书", "天雷封印之书", 450);
                              var5 += this.lq(var4++, var5, 0, 9, "御剑封印之书", "御剑封印之书", 450);
                              var5 += this.lq(var4++, var5, 0, 9, "狂力封印之书", "狂力封印之书", 450);
                              var10000 = var2;
                              break label568;
                           }

                           if (var3 == 1004) {
                              var5 += this.lq(var4++, var5, 0, 9, "冥灵古卷", "冥灵古卷", 450);
                              var5 += this.lq(var4++, var5, 0, 9, "玲珑古卷", "玲珑古卷", 450);
                              var5 += this.lq(var4++, var5, 0, 9, "巨翼古卷", "巨翼古卷", 450);
                              var5 += this.lq(var4++, var5, 0, 9, "葫芦古卷", "葫芦古卷", 450);
                              var5 += this.lq(var4++, var5, 0, 9, "如意古卷", "如意古卷", 450);
                              var10000 = var2;
                              break label568;
                           }

                           if (var3 == 1005) {
                              var5 += this.lq(var4++, var5, 0, 9, "苍凛古卷", "苍凛古卷", 450);
                              var5 += this.lq(var4++, var5, 0, 9, "赭炎古卷", "赭炎古卷", 450);
                              var5 += this.lq(var4++, var5, 0, 9, "当康古卷", "当康古卷", 450);
                              var5 += this.lq(var4++, var5, 0, 9, "松鼠古卷", "松鼠古卷", 450);
                              var5 += this.lq(var4++, var5, 0, 9, "佳音小使古卷", "佳音小使古卷", 450);
                              var10000 = var2;
                              break label568;
                           }

                           if (var3 == 1006) {
                              var5 += this.lq(var4++, var5, 0, --3, (Object)null, "我要回长安", 450);
                              var10000 = var2;
                              break label568;
                           }

                           if (var3 == 1100) {
                              var5 += this.lq(var4++, var5, 0, 41, (Object)null, "我要激活兑奖码", 450);
                              var5 += this.lq(var4++, var5, 0, 9, "兑换彩晶石", "兑换彩晶石", 450);
                              var10000 = var2;
                              break label568;
                           }

                           if (var3 == 122) {
                              var12 = "我什么都不做";
                              var5 += this.lq(var4++, var5, 0, 42, (Object)null, "我要抽奖", 450);
                              var5 += this.lq(var4++, var5, 0, 43, (Object)null, "我要投放功绩物品", 450);
                              var10000 = var2;
                              break label568;
                           }

                           if (var3 == 126) {
                              var12 = "我什么都不做";
                              var5 += this.lq(var4++, var5, 0, 28, "我要参加水陆大会", "我要参加水陆大会", 450);
                              var5 += this.lq(var4++, var5, 0, 28, "领取水陆大会奖励", "领取水陆大会奖励", 450);
                              var5 += this.lq(var4++, var5, 0, 1, var3, "我想买点东西", 450);
                              var10000 = var2;
                              break label568;
                           }

                           if (var3 == 127) {
                              var12 = "我什么都不做";
                              var5 += this.lq(var4++, var5, 0, 1, var3, "我想买点东西", 450);
                              var10000 = var2;
                              break label568;
                           }

                           if (var3 == 128) {
                              var5 += this.lq(var4++, var5, 0, 44, (Object)null, "我要下挑战书", 450);
                              var10000 = var2;
                              break label568;
                           }

                           if (var3 == 129) {
                              var12 = "我什么都不做";
                              var5 += this.lq(var4++, var5, 0, 45, (Object)null, "我要兑换灵修值", 450);
                              var5 += this.lq(var4++, var5, 0, 46, (Object)null, "我要收录玉符（玉符转符录）", 450);
                              var5 += this.lq(var4++, var5, 0, 47, (Object)null, "我要查看已有符录（符录转玉符）", 450);
                              var5 += this.lq(var4++, var5, 0, 1, var3, "我想买点东西", 450);
                              var5 += this.lq(var4++, var5, 0, --3, (Object)null, "我要回长安", 450);
                              var10000 = var2;
                              break label568;
                           }

                           if (var3 == 132) {
                              var12 = "前途缈缈，我还是再准备下吧";
                              var10000 = var2;
                              break label568;
                           }

                           if (var3 == 133) {
                              var12 = "我什么都不做";
                              var5 += this.lq(var4++, var5, 0, 9, "年(588碎片)", "年(588碎片)", 450);
                              var5 += this.lq(var4++, var5, 0, 9, "画中仙(488碎片)", "画中仙(488碎片)", 450);
                              var5 += this.lq(var4++, var5, 0, 9, "白泽(468碎片)", "白泽(468碎片)", 450);
                              var10000 = var2;
                              break label568;
                           }

                           if (var3 == 134) {
                              var12 = "我什么都不做";
                              var5 += this.lq(var4++, var5, 0, 9, "龙马(188碎片)", "龙马(188碎片)", 450);
                              var5 += this.lq(var4++, var5, 0, 9, "画皮娘子(188碎片)", "画皮娘子(188碎片)", 450);
                              var5 += this.lq(var4++, var5, 0, 9, "孔雀明王(188碎片)", "孔雀明王(188碎片)", 450);
                              var5 += this.lq(var4++, var5, 0, 9, "北冥龙君(288碎片)", "北冥龙君(288碎片)", 450);
                              var5 += this.lq(var4++, var5, 0, 9, "孟极(288碎片)", "孟极(288碎片)", 450);
                              var5 += this.lq(var4++, var5, 0, 9, "镜花水月(388碎片)", "镜花水月(388碎片)", 450);
                              var5 += this.lq(var4++, var5, 0, 9, "妙音栾女(388碎片)", "妙音栾女(388碎片)", 450);
                              var10000 = var2;
                              break label568;
                           }

                           if (var3 == 137) {
                              var12 = "元旦快乐，有事先闪";
                              var5 += this.lq(var4++, var5, 0, 48, (Object)null, "我来助你一孵之力（需提交一个物品）", 450);
                              var10000 = var2;
                              break label568;
                           }

                           if (var3 == 1106) {
                              var5 += this.lq(var4++, var5, 0, 28, "参加种族赛", "参加种族赛", 450);
                              var5 += this.lq(var4++, var5, 0, 28, "一键领取种族赛奖励", "一键领取种族赛奖励", 450);
                              var5 += this.lq(var4++, var5, 0, 1, var3, "我想买点东西", 450);
                              var10000 = var2;
                              break label568;
                           }

                           if (var3 == 515) {
                              var5 += this.lq(var4++, var5, 0, 28, "参加擂台赛", "参加擂台赛", 450);
                              var5 += this.lq(var4++, var5, 0, 28, "一键领取擂台赛奖励", "一键领取擂台赛奖励", 450);
                              var5 += this.lq(var4++, var5, 0, 1, var3, "我想买点东西", 450);
                              var10000 = var2;
                              break label568;
                           }

                           if (var3 == 520) {
                              var5 += this.lq(var4++, var5, 0, 28, "我要进行九生九死挑战", "我要进行九生九死挑战", 450);
                              var10000 = var2;
                              break label568;
                           }

                           if (var3 == 85) {
                              var5 += this.lq(var4++, var5, 0, 49, (Object)null, "我要打造,摘抄宝石", 450);
                              var5 += this.lq(var4++, var5, 0, 50, (Object)null, "我要合成宝石等", 450);
                              var5 += this.lq(var4++, var5, 0, 1, var3, "我想买点东西", 450);
                              var10000 = var2;
                              break label568;
                           }

                           if (var3 == 800) {
                              var12 = "我什么都不做";
                              var5 += this.lq(var4++, var5, 0, 28, "我要参加跨服联赛", "我要参加跨服联赛", 450);
                              var10000 = var2;
                              break label568;
                           }

                           if (var3 == 530) {
                              var12 = "我什么都不做";
                              var5 += this.lq(var4++, var5, 0, 28, "我来上交地煞星之魂", "我来上交地煞星之魂", 450);
                              var10000 = var2;
                              break label568;
                           }

                           if (var3 == 605) {
                              var12 = "我什么都不做";
                              var5 += this.lq(var4++, var5, 0, 28, "我要回到500年前", "我要回到500年前", 450);
                              var5 += this.lq(var4++, var5, 0, 28, "领取大闹天宫奖励", "领取大闹天宫奖励", 450);
                              var5 += this.lq(var4++, var5, 0, 1, var3, "我想买点东西", 450);
                              var10000 = var2;
                              break label568;
                           }

                           if (var3 == 42 || var3 == 43) {
                              var12 = "我什么都不做";
                              var5 += this.lq(var4++, var5, 0, 28, "我来上交上古宝箱", "我来上交上古宝箱", 450);
                              var10000 = var2;
                              break label568;
                           }

                           if (var3 == 103) {
                              var12 = "我什么都不做";
                              var5 += this.lq(var4++, var5, 0, 28, "我要参观上古战场的风采", "我要参观上古战场的风采", 450);
                              var10000 = var2;
                              break label568;
                           }

                           if (var3 == 104) {
                              var12 = "我什么都不做";
                              var5 += this.lq(var4++, var5, 0, 28, "送我回后方营地", "送我回后方营地", 450);
                              var10000 = var2;
                              break label568;
                           }

                           if (var3 == 105) {
                              var5 += this.lq(var4++, var5, 0, 51, (Object)null, "神力加持", 450);
                              var10000 = var2;
                              break label568;
                           }

                           if (var3 == 2021) {
                              var5 += this.lq(var4++, var5, 0, 28, "升级帮派等级", "升级帮派等级", 450);
                              var10000 = var2;
                              break label568;
                           }

                           if (var3 == 2024) {
                              var5 += this.lq(var4++, var5, 0, 52, (Object)null, "我要提交材料", 450);
                              var10000 = var2;
                              break label568;
                           }

                           if (var3 == 2026) {
                              var5 += this.lq(var4++, var5, 0, 53, 1, "守护小成修炼", 450);
                              var5 += this.lq(var4++, var5, 0, 53, 5 >> 1, "守护大成修炼", 450);
                              var10000 = var2;
                              break label568;
                           }

                           if (var3 == 89) {
                              var5 += this.lq(var4++, var5, 0, 54, (Object)null, "我想从你这换点绑玉", 450);
                              var5 += this.lq(var4++, var5, 0, 1, var3, "我想买点东西", 450);
                              var10000 = var2;
                              break label568;
                           }

                           if (var3 == 2027) {
                              var5 += this.lq(var4++, var5, 0, 55, (Object)null, "我要参加天梯巅峰赛", 450);
                              var10000 = var2;
                              break label568;
                           }

                           if (var3 == 2028) {
                              var12 = "我点错了，我实力未到，不敢尝试";
                              var5 += this.lq(var4++, var5, 0, 56, (Object)null, "我要挑战试炼幻境", 450);
                              var10000 = var2;
                              break label568;
                           }

                           if (var3 == 2029) {
                              var12 = "我什么都不做";
                              var5 += this.lq(var4++, var5, 0, 57, (Object)null, "我要上柱香", 450);
                              var5 += this.lq(var4++, var5, 0, 1, var3, "我想买点东西", 450);
                              var10000 = var2;
                              break label568;
                           }

                           if (var3 == 2030) {
                              var12 = "我什么都不做";
                              var5 += this.lq(var4++, var5, 0, 28, "我要参加大乱斗", "我要参加大乱斗", 450);
                              var5 += this.lq(var4++, var5, 0, 28, "领取大乱斗吃鸡奖励", "领取大乱斗吃鸡奖励", 450);
                              var5 += this.lq(var4++, var5, 0, 1, var3, "我想买点东西", 450);
                              var10000 = var2;
                              break label568;
                           }

                           if (var3 == 59998) {
                              var5 += this.lq(var4++, var5, 0, 1, --5, "杂货店", 450);
                              var5 += this.lq(var4++, var5, 0, 1, 9, "药店", 450);
                              var5 += this.lq(var4++, var5, 0, 1, 14, "技能商店", 450);
                              var5 += this.lq(var4++, var5, 0, 1, 15, "内丹商店", 450);
                              if (!this.uw().n(2, 3)) {
                                 var5 += this.lq(var4++, var5, 0, 1, 37, "符文商店", 450);
                                 var5 += this.lq(var4++, var5, 0, 1, -71, "金币回收商", 450);
                                 var5 += this.lq(var4++, var5, 0, 1, -89, "绑玉回收商", 450);
                                 var10000 = var2;
                                 break label568;
                              }
                           } else {
                              if (var3 == 59990) {
                                 var5 += this.lq(var4++, var5, 0, 11, "我要打造普通装备", "我要打造普通装备", 450);
                                 var5 += this.lq(var4++, var5, 0, 11, "我要升级神兵", "我要升级神兵", 450);
                                 var5 += this.lq(var4++, var5, 0, 11, "我要上神兵石", "我要上神兵石", 450);
                                 var5 += this.lq(var4++, var5, 0, 11, "精炼神兵", "精炼神兵", 450);
                                 var10000 = var2;
                                 break label568;
                              }

                              if (var3 == -44) {
                                 if (this.uw().n(2, 3)) {
                                    var5 += this.lq(var4++, var5, 0, 22, (Object)null, "转生当前召唤兽", 450);
                                    var5 += this.lq(var4++, var5, 0, 20, (Object)null, "我要合成召唤兽", 450);
                                    var22 = this;
                                 } else {
                                    label569: {
                                       if (this.uw().n(2, 12)) {
                                          var5 += this.lq(var4++, var5, 0, 22, (Object)null, "转生当前召唤兽", 450);
                                          var5 += this.lq(var4++, var5, 0, 23, (Object)null, "点化当前召唤兽", 450);
                                          var5 += this.lq(var4++, var5, 0, 24, (Object)null, "启灵当前召唤兽", 450);
                                          var5 += this.lq(var4++, var5, 0, 25, (Object)null, "点化当前坐骑", 450);
                                          var5 += this.lq(var4++, var5, 0, 18, (Object)null, "神兽学习技能", 450);
                                          var5 += this.lq(var4++, var5, 0, 19, (Object)null, "飞升当前参战神兽", 450);
                                          var5 += this.lq(var4++, var5, 0, 67, (Object)null, "我有神兽碎片,我来换神兽", 450);
                                          if (this.uw().v() || this.uw().f()) {
                                             var5 += this.lq(var4++, var5, 0, 21, (Object)null, "我要幻化当前参战召唤兽", 450);
                                             var22 = this;
                                             break label569;
                                          }
                                       } else {
                                          var5 += this.lq(var4++, var5, 0, 22, (Object)null, "转生当前召唤兽", 450);
                                          var5 += this.lq(var4++, var5, 0, 23, (Object)null, "点化当前召唤兽", 450);
                                          var5 += this.lq(var4++, var5, 0, 24, (Object)null, "启灵当前召唤兽", 450);
                                          var5 += this.lq(var4++, var5, 0, 25, (Object)null, "点化当前坐骑", 450);
                                          var5 += this.lq(var4++, var5, 0, 18, (Object)null, "神兽学习技能", 450);
                                          var5 += this.lq(var4++, var5, 0, 19, (Object)null, "飞升当前参战神兽", 450);
                                          var5 += this.lq(var4++, var5, 0, 20, (Object)null, "我要合成召唤兽", 450);
                                          var5 += this.lq(var4++, var5, 0, 21, (Object)null, "我要幻化当前参战召唤兽", 450);
                                       }

                                       var22 = this;
                                    }
                                 }

                                 if (var22.uw().gameMount) {
                                    var5 += this.lq(var4++, var5, 0, 68, (Object)null, "我要重塑一到五坐骑", 450);
                                    var10000 = var2;
                                    break label568;
                                 }
                              } else {
                                 if (var3 == -47) {
                                    var5 += this.lq(var4++, var5, 0, 27, (Object)null, "我想转换种族", 450);
                                    var5 += this.lq(var4++, var5, 0, 26, (Object)null, "我已做好了转生准备", 450);
                                    var10000 = var2;
                                    break label568;
                                 }

                                 if (var3 == 155) {
                                    List var6 = this.aej.baseView.ks();
                                    Activity var7 = null;
                                    var23 = var8 = 0;

                                    Activity var24;
                                    while(true) {
                                       if (var23 >= var6.size()) {
                                          var24 = var7;
                                          break;
                                       }

                                       Class441 var9;
                                       Activity var10 = (var9 = (Class441)var6.get(var8)).tp() > 100 && var9.tp() < 200 ? this.vc().aq(var9.tp()) : null;
                                       if (var10 != null && var10.getModelId() == 3) {
                                          var24 = var7 = var10;
                                          break;
                                       }

                                       ++var8;
                                       var23 = var8;
                                    }

                                    if (var24 != null) {
                                       var5 += this.lq(var4++, var5, 0, 69, var7.getId(), "我要进入比武大会场地", 450);
                                       var5 += this.lq(var4++, var5, 0, 70, var7.getId(), "我要报名参加比武大会", 450);
                                       var5 += this.lq(var4++, var5, 0, 71, var7.getId(), "我要领取比武大会奖励", 450);
                                    }
                                 }
                              }
                           }
                        }
                     }
                  }

                  var10000 = var2;
               }
            }
         } else {
            var12 = "我什么都不做";
            var10002 = var4;
            var10004 = 5 >> 3;
            ++var4;
            var5 += this.lq(var10002, var5, var10004, --1, var3, "我想买点东西", 450);
            var10000 = var2;
         }

         if (var10000 != null) {
            if (var2.getDoors() != null) {
               int var13;
               for(var23 = var13 = 0; var23 < var2.getDoors().size(); var23 = var13) {
                  Door var16;
                  if ((var16 = (Door)var2.getDoors().get(var13)) != null && !Class394.o(var16.getDoorkey())) {
                     var5 += this.lq(var4++, var5, 2, 0, var16, var16.getDoorkey(), 450);
                  }

                  ++var13;
               }

               var12 = "我哪里都不去";
            }

            if (var3 != 2 && !Class394.o(var2.getNpctable().getNpcway())) {
               String var14 = var2.getNpctable().getNpcway();
               int var17 = 0;

               byte var18;
               for(var23 = var18 = 0; var23 < var14.length(); var23 = var8) {
                  if ((var8 = var14.indexOf(" ", var17 + 1)) == -1) {
                     var8 = var14.length();
                  }

                  List var20;
                  if ((var20 = Class241.a(var14.substring(var17, var8))).size() == 0) {
                     var23 = var8;
                  } else {
                     String var21;
                     if ((var21 = this.vd().getTaskSystem().r(Integer.parseInt((String)var20.get(0)))) != null) {
                        var5 += this.lq(var4++, var5, 1, 0, var21, var21, 450);
                     }

                     var23 = var8;
                  }

                  var17 = var23 + 1;
               }
            }

            TaskProgress var15;
            TaskData var19 = (var15 = this.vd().getTaskSystem().q(Integer.parseInt(var2.getNpctable().getNpcid()))) != null ? var15.getTask().getTaskData() : null;
            if (var19 != null) {
               var5 += this.lq(var4++, var5, 0, 58, 0, "我是来击杀你的", 450);

               for(var23 = var8 = 1; var23 <= var19.getNd(); var23 = var8) {
                  if (var8 == 1) {
                     var5 += this.lq(var4++, var5, 0, 58, 1, "我是来击杀你的(困难难度)", 450);
                  } else if (var8 == 2) {
                     var5 += this.lq(var4++, var5, 0, 58, 2, "我是来击杀你的(卓越难度)", 450);
                  } else if (var8 == 3) {
                     var5 += this.lq(var4++, var5, 0, 58, 3, "我是来击杀你的(地狱难度)", 450);
                  } else if (var8 == 4) {
                     var5 += this.lq(var4++, var5, 0, 58, 4, "我是来击杀你的(天堂难度)", 450);
                  }

                  ++var8;
               }
            }
         }

         if (var12 != null) {
            var5 += this.lq(var4++, var5, 0, 0, (Object)null, var12, 450);
         }

         this.li(var5, 23 + this.bw.getHeight());
         this.f(var2 != null ? var2.getNpctable().getSkin() : null);
      }
   }

   public NpcOption lm(int var1) {
      NpcOption var2;
      if ((var2 = (NpcOption)(var1 < this.um.getComponentCount() ? this.um.getComponent(var1) : null)) == null) {
         var2 = new NpcOption(this);
         this.um.add(var2);
      }

      var2.setVisible((boolean)(4 ^ 5));
      return var2;
   }

   public void ln(Goodstable var1) {
      int var10000 = 3 ^ 3;
      int var10006 = 4 ^ 5;
      this.o();
      this.ay = var10006;
      this.un = var1.getRgid().longValue();
      this.lb("选择打开吉祥如意蛋的方式（祈福奖励更丰富）");
      int var5 = var10000;
      int var4 = 2 & 5;

      int var3;
      for(var10000 = var3 = 5 >> 3; var10000 < 2; var10000 = var3) {
         NpcOption var2 = this.lm(var5);
         ++var5;
         NpcOption var6;
         if (var3 == 0) {
            var2.yc(111 & 22, --1, (Object)null, "直接打开", 3538 & 29679);
            var6 = var2;
         } else {
            var2.yc(6, 5 >> 1, (Object)null, "祈福（500W金币）", 16354 & 16863);
            var6 = var2;
         }

         var6.setBounds(0, var4, 26623 & 6614, var2.getHeight());
         ++var3;
         var4 += var2.getHeight();
      }

      this.li(var4, (127 & 23) + this.bw.getHeight());
      this.go();
   }

   public void lo(Goodstable var1) {
      int var10000 = 2 & 5;
      int var10006 = 3 & 5;
      this.o();
      this.ay = var10006;
      this.un = var1.getRgid().longValue();
      this.lb("将彩晶石装换为对应的召唤兽饰品");
      int var5 = var10000;
      int var4 = 3 >> 2;

      int var3;
      for(var10000 = var3 = 3 & 4; var10000 < 33; var10000 = var3) {
         NpcOption var2 = this.lm(var5);
         ++var5;
         NpcOption var6;
         if (var3 == 0) {
            var6 = var2;
            var2.yc(--5, 5 >> 2, "龙马饰品", "龙马饰品", 12283 & 20934);
         } else if (var3 == 3 >> 1) {
            var6 = var2;
            var2.yc(--5, 5 >> 2, "白龙帝饰品", "白龙帝饰品", 31222 & 1995);
         } else if (var3 == --2) {
            var6 = var2;
            var2.yc(--5, 4 ^ 5, "瀚威猫将的大刀", "瀚威猫将的大刀", 29655 & 3562);
         } else if (var3 == --3) {
            var6 = var2;
            var2.yc(--5, --1, "棕小仙饰品", "棕小仙饰品", 15342 & 17875);
         } else if (var3 == --4) {
            var6 = var2;
            var2.yc(--5, 4 ^ 5, "罗刹鬼姬饰品", "罗刹鬼姬饰品", 11251 & 21966);
         } else if (var3 == --5) {
            var6 = var2;
            var2.yc(--5, 5 >> 2, "冥雷饰品", "冥雷饰品", 28130 & 5087);
         } else if (var3 == (30 & 103)) {
            var6 = var2;
            var2.yc(--5, 3 & 5, "西域响马饰品", "西域响马饰品", 25075 & 8142);
         } else if (var3 == (127 & 7)) {
            var6 = var2;
            var2.yc(--5, 5 >> 2, "金不换饰品", "金不换饰品", 4066 & 29151);
         } else if (var3 == (42 & 93)) {
            var6 = var2;
            var2.yc(--5, 3 >> 1, "松鼠饰品", "松鼠饰品", 23543 & 9674);
         } else if (var3 == (27 & 109)) {
            var6 = var2;
            var2.yc(--5, --1, "拨浪鼓饰品", "拨浪鼓饰品", 7167 & 26050);
         } else if (var3 == (63 & 74)) {
            var6 = var2;
            var2.yc(--5, 5 >> 2, "哥俩好饰品", "哥俩好饰品", 9694 & 23523);
         } else if (var3 == 11) {
            var6 = var2;
            var2.yc(--5, 2 ^ 3, "孔雀明王饰品", "孔雀明王饰品", 450);
         } else if (var3 == 12) {
            var6 = var2;
            var2.yc(5, 2 ^ 3, "赭炎饰品", "赭炎饰品", 450);
         } else if (var3 == 13) {
            var6 = var2;
            var2.yc(5, --1, "画皮娘子饰品", "画皮娘子饰品", 450);
         } else if (var3 == 14) {
            var6 = var2;
            var2.yc(5, 4 ^ 5, "冥灵妃子饰品", "冥灵妃子饰品", 450);
         } else if (var3 == 15) {
            var6 = var2;
            var2.yc(5, 1, "黄金兽饰品", "黄金兽饰品", 450);
         } else if (var3 == 16) {
            var6 = var2;
            var2.yc(5, 1, "剑精灵饰品", "剑精灵饰品", 450);
         } else if (var3 == 17) {
            var6 = var2;
            var2.yc(5, 1, "泥石怪饰品", "泥石怪饰品", 450);
         } else if (var3 == 18) {
            var6 = var2;
            var2.yc(5, 1, "冰雪魔饰品", "冰雪魔饰品", 450);
         } else if (var3 == 19) {
            var6 = var2;
            var2.yc(5, 1, "蝴蝶仙子饰品", "蝴蝶仙子饰品", 450);
         } else if (var3 == 20) {
            var6 = var2;
            var2.yc(5, 1, "凤凰饰品", "凤凰饰品", 450);
         } else if (var3 == 21) {
            var6 = var2;
            var2.yc(5, 1, "冲冲虫饰品", "冲冲虫饰品", 450);
         } else if (var3 == 22) {
            var6 = var2;
            var2.yc(5, 1, "猪怪饰品", "猪怪饰品", 450);
         } else if (var3 == 23) {
            var6 = var2;
            var2.yc(5, 1, "符咒女娲饰品", "符咒女娲饰品", 450);
         } else if (var3 == 24) {
            var6 = var2;
            var2.yc(5, 1, "精卫饰品", "精卫饰品", 450);
         } else if (var3 == 25) {
            var6 = var2;
            var2.yc(5, 1, "猴精饰品", "猴精饰品", 450);
         } else if (var3 == 26) {
            var6 = var2;
            var2.yc(5, 1, "天龙女饰品", "天龙女饰品", 450);
         } else if (var3 == 27) {
            var6 = var2;
            var2.yc(5, 1, "吉祥果饰品", "吉祥果饰品", 450);
         } else if (var3 == 28) {
            var6 = var2;
            var2.yc(5, 1, "狮虎兽饰品", "狮虎兽饰品", 450);
         } else if (var3 == 29) {
            var6 = var2;
            var2.yc(5, 1, "妙音鸾女饰品", "妙音鸾女饰品", 450);
         } else if (var3 == 30) {
            var6 = var2;
            var2.yc(5, 1, "碧水精魄饰品", "碧水精魄饰品", 450);
         } else if (var3 == 31) {
            var6 = var2;
            var2.yc(5, 1, "俏娘子饰品", "俏娘子饰品", 450);
         } else {
            if (var3 == 32) {
               var2.yc(5, 1, "木甲人饰品", "木甲人饰品", 450);
            }

            var6 = var2;
         }

         var6.setBounds(0, var4, 470, var2.getHeight());
         ++var3;
         var4 += var2.getHeight();
      }

      this.li(var4, 23 + this.bw.getHeight());
      this.go();
   }

   public void lp(Goodstable var1, String var2) {
      this.o();
      GoodFight var3 = var1 != null ? var1.getFight() : null;
      if (var3 != null) {
         GoodFight var4 = null;
         GoodFight var10000 = var3;

         while(true) {
            if (var10000 == null || var3.getMap() == 0) {
               var10000 = var4;
               break;
            }

            boolean var10001 = var3.getMenu().equals(var2);
            var10000 = var3;
            if (var10001) {
               var4 = var3;
               break;
            }

            var10000 = var3 = var3.getNextFight();
         }

         if (var10000 != null) {
            this.ay = 3 & 5;
            this.un = var1.getRgid().longValue();
            this.lb("你真的要去" + var2 + "吗？");
            int var6 = 3 >> 2;
            int var7 = 2 & 5;

            int var8;
            for(int var9 = var8 = 2 & 5; var9 < 3; var9 = var8) {
               NpcOption var5 = this.lm(var6);
               ++var6;
               NpcOption var10;
               if (var8 == 0) {
                  var10 = var5;
                  var5.yc(--4, --1, var4, "快送我去", 30202 & 3015);
               } else if (var8 == (3 & 5)) {
                  var10 = var5;
                  var5.yc(--4, 5 >> 1, var4, "删除路标", 16874 & 16343);
               } else {
                  var10 = var5;
                  var5.yc(--4, --3, var4, "重新做路标", 32719 & 498);
               }

               var10.setBounds(0, var7, 25087 & 8150, var5.getHeight());
               ++var8;
               var7 += var5.getHeight();
            }

            this.li(var7, (87 & 63) + this.bw.getHeight());
            this.go();
         }
      }
   }

   public int lq(int var1, int var2, int var3, int var4, Object var5, String var6, int var7) {
      NpcOption var8 = this.lm(var1);
      int var10002 = 3 ^ 3;
      var8.yc(var3, var4, var5, var6, var7);
      var8.setBounds(var10002, var2, 8662 & 24575, var8.getHeight());
      return var8.getHeight();
   }

   public void lr(Class165 var1, NpcInfoBean var2, int var3) {
      int var10003 = 3 >> 2;
      this.o();
      this.ay = var10003;
      this.un = var2 != null ? Long.parseLong(var2.getNpctable().getNpcid()) : null;
      int var10001 = 5 >> 3;
      this.uk = var1;
      int var7 = var10001;
      var3 = 5 >> 3;
      RoleData var4;
      PKSys var5;
      Class472 var10000;
      if ((var5 = (var4 = this.vd()).getPkSys()).getPk1() == 0) {
         this.lb("一个良民瞎点啥,在闹请你进去");
         int var10002 = var7;
         int var10004 = 3 ^ 3;
         ++var7;
         var3 += this.lq(var10002, var3, var10004, 62 & 127, 2 ^ 3, "我想去死牢探监", 4062 & 29155);
         var10002 = var7;
         var10004 = 5 >> 3;
         ++var7;
         var10001 = var3 += this.lq(var10002, var3, var10004, 62 & 127, 5 >> 1, "我想去地牢探监", 30171 & 3046);
         var10000 = this;
         var10003 = var7;
         int var10005 = 3 & 4;
         int var10006 = 63 & 126;
         ++var7;
         var3 = var10001 + this.lq(var10003, var3, var10005, var10006, --3, "我想去天牢探监", 16374 & 16843);
      } else {
         StringBuffer var6 = new StringBuffer();
         var10000 = this;
         var6.append(var4.getLoginResult().getRolename());
         var6.append(",你还有");
         var6.append(var5.getPk1());
         var6.append("点PK标志自首可以减轻罪行");
         this.lb(var6.toString());
         int var10007 = var7;
         int var10009 = 5 >> 3;
         ++var7;
         var3 += this.lq(var10007, var3, var10009, 127 & 63, (Object)null, "我是来自首的", 26111 & 7106);
         var10007 = var7;
         var10009 = 5 >> 3;
         ++var7;
         var3 += this.lq(var10007, var3, var10009, var10009, (Object)null, "我什么都不做", 26579 & 6638);
      }

      var10000.li(var3, (31 & 119) + this.bw.getHeight());
      this.f(var2.getNpctable().getSkin());
   }

   public void p() {
      List var5;
      if ((var5 = this.vd().dataOtherList) == null) {
         this.aej.f("出现异常");
      } else {
         int var10001 = 94 & 63;
         this.o();
         this.lb("请选择你要对天演策进行的相关操作");
         this.ay = var10001;
         int var2 = 5 >> 3;
         int var3 = 3 & 4;

         int var10002;
         int var10004;
         int var4;
         for(int var10000 = var4 = 3 ^ 3; var10000 < var5.size(); var10000 = var4) {
            DataOther var1;
            if ((var1 = (DataOther)var5.get(var4)).a()) {
               var10002 = var2;
               var10004 = 62 & 95;
               int var10005 = 2 & 5;
               ++var2;
               var3 += this.lq(var10002, var3, var10004, var10005, var1.getId(), var1.getKey(), 8686 & 24531);
            }

            ++var4;
         }

         var4 = var2 < --5 ? 5 >> 2 : 0;
         int var6 = var2 > 0 ? 3 & 5 : 0;
         if (var4 != 0) {
            var10002 = var2;
            var10004 = 94 & 63;
            ++var2;
            var3 += this.lq(var10002, var3, var10004, 4 ^ 5, (Object)null, "新建一个方案", 1018 & 32199);
         }

         if (var6 != 0) {
            var10002 = var2;
            var10004 = 127 & 30;
            ++var2;
            var3 += this.lq(var10002, var3, var10004, --2, (Object)null, "保存当前加点方案", 4607 & 28610);
         }

         this.li(var3, (63 & 87) + this.bw.getHeight());
         this.go();
      }
   }

   public void fn(Lingbao var1) {
      int var10000 = 3 & 4;
      int var10004 = 61 & 95;
      this.o();
      this.ay = var10004;
      this.lb("#Y确定要将花  #G200000 #Y银两指定一种灵宝附加抗性吗??");
      int var5 = var10000;
      int var3 = 2 & 5;
      String[] var6 = new String[63 & 77];
      boolean var10002 = true;
      var6[2 & 5] = "维持原本抗性";
      var6[3 & 5] = "抗物理";
      var6[--2] = "抗震慑";
      var6[--3] = "抗风";
      var6[--4] = "抗雷";
      var6[--5] = "抗水";
      var6[14 & 119] = "抗火";
      var6[111 & 23] = "抗混乱";
      var6[29 & 106] = "抗昏睡";
      var6[79 & 57] = "抗封印";
      var6[10 & 127] = "抗中毒";
      var6[95 & 43] = "抗遗忘";
      var6[76 & 63] = "抗鬼火";
      String[] var4 = var6;

      int var2;
      for(var10000 = var2 = 5 >> 3; var10000 < var4.length; var10000 = var2) {
         int var7 = var5;
         var10004 = 127 & 23;
         StringBuilder var10005 = new StringBuilder;
         ++var5;
         int var10007 = 3 & 4;
         var10005.<init>();
         String var9 = var10005.append(var1.getBaoid()).append("|").append(var4[var2]).toString();
         String var10 = var4[var2];
         int var10008 = 19963 & 13254;
         ++var2;
         var3 += this.lq(var7, var3, var10004, var10007, var9, var10, var10008);
      }

      this.li(var3, (31 & 119) + this.bw.getHeight());
      this.go();
   }

   public Class292 ls() {
      return this.uk;
   }

   public Class472(GameView var1) {
      int var10005 = 101 & 126;
      super(27 & 127, 1 ^ 3, Class345.aef, var1);
      this.va(var10005, 116 & 91, 4015 & 29278, 20223 & 12693, Class345.aei);
      this.fx("sc/d/26.png");
      this.ec = new Class436();
      this.add(this.ec);
      this.bw = Class271.l("", Class681.ce, 3567 & 29695);
      this.add(this.bw);
      var10005 = 127 & 15;
      this.um = new JComponent() {
      };
      this.um.addMouseListener(this);
      this.eb = Class133.f(var10005, 43 & 94, 11734 & 21503, 27326 & 5601, this.um, 84 & 63);
      this.add(this.eb);
   }

   public void do(int var1) {
      this.o();
      Class472 var10000;
      if (var1 == 0) {
         this.lb("当前任务可触发双倍经验。30秒后未操作将自动领取一小时双倍经验");
         var10000 = this;
      } else {
         this.lb("当前任务不可触发双倍经验。30秒后未操作将冻结双倍时间");
         var10000 = this;
      }

      var10000.ay = 31;
      int var2 = 3 >> 2;
      int var3 = 5 >> 3;
      int var10002 = var2;
      int var10004 = 5 >> 3;
      ++var2;
      var3 += this.lq(var10002, var3, var10004, 103 & 30, 124 & 63, "我要领取一小时双倍时间", 31226 & 1991);
      var10002 = var2;
      var10004 = 5 >> 3;
      ++var2;
      var3 += this.lq(var10002, var3, var10004, 31 & 102, 125 & 122, "我要领取二小时双倍时间", 15810 & 17407);
      var10002 = var2;
      var10004 = 3 & 4;
      ++var2;
      var3 += this.lq(var10002, var3, var10004, 78 & 55, 5882 & 27125, "我要领取四小时双倍时间", 7618 & 25599);
      var10002 = var2;
      var10004 = 3 & 4;
      ++var2;
      var3 += this.lq(var10002, var3, var10004, 111 & 23, (Object)null, "我要冻结双倍时间", 10734 & 22483);
      var10002 = var2;
      var10004 = 3 ^ 3;
      ++var2;
      var3 += this.lq(var10002, var3, var10004, 92 & 43, (Object)null, "我要查询剩余双倍时间", 18891 & 14326);
      var10002 = var2;
      var10004 = 127 & 31;
      ++var2;
      var3 += this.lq(var10002, var3, var10004, var1, (Object)null, "本次登录不在提示", 24010 & 9207);
      this.li(var3, (95 & 55) + this.bw.getHeight());
      this.aej.automation.setAutomationDoubleExp(new Class136((long)var1, Class280.l() + 30000L));
      this.go();
   }

   public void dp(int var1) {
      int var10002 = 31 & 115;
      this.o();
      var1 = var10002;
      this.un = (long)var10002;
      this.lb(var1 == 0 ? "请选项对应的副职业" : "你要更换成那个副职业？副职业等级最少10级才能更换副职业,且每次更换后副职业等级会降低3级。");
      int var2 = 5 >> 3;
      int var3 = 5 >> 3;
      int var10004;
      if (var1 != --1) {
         var10002 = var2;
         var10004 = 45 & 95;
         ++var2;
         var3 += this.lq(var10002, var3, var10004, 4 ^ 5, 3 >> 2, "畜牧", 6655 & 26562);
      }

      if (var1 != --2) {
         var10002 = var2;
         var10004 = 15 & 125;
         ++var2;
         var3 += this.lq(var10002, var3, var10004, 1 ^ 3, 3 & 4, "种植", 9723 & 23494);
      }

      if (var1 != --3) {
         var10002 = var2;
         var10004 = 63 & 77;
         ++var2;
         var3 += this.lq(var10002, var3, var10004, --3, 2 & 5, "采矿", 6642 & 26575);
      }

      if (var1 != --4) {
         var10002 = var2;
         var10004 = 63 & 77;
         ++var2;
         var3 += this.lq(var10002, var3, var10004, --4, 5 >> 3, "家具", 28130 & 5087);
      }

      if (var1 != --5) {
         var10002 = var2;
         var10004 = 109 & 31;
         ++var2;
         var3 += this.lq(var10002, var3, var10004, --5, 3 & 4, "制药", 23550 & 9667);
      }

      if (var1 != (95 & 38)) {
         var10002 = var2;
         var10004 = 127 & 13;
         ++var2;
         var3 += this.lq(var10002, var3, var10004, 23 & 110, 3 & 4, "符文", 5099 & 28118);
      }

      if (var1 != 0) {
         var10002 = var2;
         var10004 = 3 & 4;
         ++var2;
         var3 += this.lq(var10002, var3, var10004, var10004, (Object)null, "我什么都不做", 5082 & 28135);
      }

      this.li(var3, 23 + this.bw.getHeight());
      this.go();
   }


   private void s() {
   }

   public void lt(int var1, Point var2, int[] var3, String var4) {
      int var5;
      int[] var10000;
      int var10005;
      label43: {
         int var10001 = 3 & 4;
         var10005 = 127 & 27;
         this.o();
         this.ay = var10005;
         this.un = (long)var1;
         var1 = var10001;
         var5 = 3 >> 2;
         StringBuilder var10002;
         if (var2.x == --3) {
            if (var2.y == 0) {
               var10002 = new StringBuilder("#W本场比赛为16强抢位赛(");
               var10000 = var3;
               this.lb(var10002.append(var3[4 ^ 5]).append("/").append(var3[1 ^ 3]).append("),你的对手是#G").append(var4).append("#W队伍。当前比分#R").append(var3[--4]).append("#W:#R").append(var3[--5]).toString());
               break label43;
            }

            if (var2.y == (3 & 5)) {
               var10002 = new StringBuilder("#W本场比赛为8强抢位赛(");
               var10000 = var3;
               this.lb(var10002.append(var3[2 ^ 3]).append("/").append(var3[1 ^ 3]).append("),你的对手是#G").append(var4).append("#W队伍。当前比分#R").append(var3[--4]).append("#W:#R").append(var3[--5]).toString());
               break label43;
            }

            if (var2.y == 5 >> 1) {
               var10002 = new StringBuilder("#W本场比赛为4强抢位赛(");
               var10000 = var3;
               this.lb(var10002.append(var3[5 >> 2]).append("/").append(var3[1 ^ 3]).append("),你的对手是#G").append(var4).append("#W队伍。当前比分#R").append(var3[--4]).append("#W:#R").append(var3[--5]).toString());
               break label43;
            }
         } else if (var2.x == --4) {
            if (var2.y == 0) {
               var10002 = new StringBuilder("#W本场比赛为半决赛上半场(");
               var10000 = var3;
               this.lb(var10002.append(var3[3 >> 1]).append("/").append(var3[1 ^ 3]).append("),你的对手是#G").append(var4).append("#W队伍。当前比分#R").append(var3[--4]).append("#W:#R").append(var3[--5]).toString());
               break label43;
            }

            if (var2.y == (3 & 5)) {
               var10002 = new StringBuilder("#W本场比赛为半决赛下半场(");
               var10000 = var3;
               this.lb(var10002.append(var3[--1]).append("/").append(var3[5 >> 1]).append("),你的对手是#G").append(var4).append("#W队伍。当前比分#R").append(var3[4]).append("#W:#R").append(var3[5]).toString());
               break label43;
            }
         } else if (var2.x == 5) {
            if (var2.y == 0) {
               var10002 = new StringBuilder("#W本场比赛为季殿争夺赛(");
               var10000 = var3;
               this.lb(var10002.append(var3[3 & 5]).append("/").append(var3[2]).append("),你的对手是#G").append(var4).append("#W队伍。当前比分#R").append(var3[4]).append("#W:#R").append(var3[5]).toString());
               break label43;
            }

            if (var2.y == 5 >> 2) {
               this.lb("#W本场比赛为冠亚争夺赛(" + var3[5 >> 2] + "/" + var3[2] + "),你的对手是#G" + var4 + "#W队伍。当前比分#R" + var3[4] + "#W:#R" + var3[5]);
            }
         }

         var10000 = var3;
      }

      int var6;
      int var7;
      int var10004;
      if (var10000[3] == 0) {
         var7 = var1;
         var10004 = 85 & 63;
         var10005 = 5 >> 2;
         ++var1;
         var6 = var5 += this.lq(var7, var5, var10004, var10005, (Object)null, "我准备好了", 16890 & 16327);
      } else {
         var7 = var1;
         var10004 = 87 & 61;
         ++var1;
         var6 = var5 += this.lq(var7, var5, var10004, 2, (Object)null, "我还没准备好", 20986 & 12231);
      }

      var7 = var1;
      var10004 = 3 ^ 3;
      var10005 = 3 ^ 3;
      ++var1;
      this.li(var6 + this.lq(var7, var5, var10004, var10005, (Object)null, "我什么都不做", 7618 & 25599), (31 & 119) + this.bw.getHeight());
      this.go();
   }

   public void lu(Class572 var1) {
      int var10007 = 5 >> 3;
      this.o();
      this.ay = var10007;
      this.un = var1.p.getI().longValue();
      this.uk = var1;
      MonsterBean var6 = var1.p;
      this.lb("想要我身上的宝物吗? 想要就来抢啊!");
      int var2 = 3 & 4;
      int var3 = 5 >> 3;
      int var4;
      MonsterBean var10000;
      int var10002;
      int var10004;
      int var10005;
      if ((var4 = var6.getRobottype()) == 5 >> 1) {
         var10002 = var2;
         var10004 = 2 ^ 3;
         ++var2;
         var3 += this.lq(var10002, var3, 5 >> 3, var10004, 5 >> 3, "我想买点东西", 6143 & 27074);
         var10000 = var6;
      } else {
         label49: {
            if (var6.getTaskList() == null || (Integer)var6.getTaskList().get(3 ^ 3) == 0) {
               if ((var4 == --4 || var4 == (5116 & 27783)) && var6.getFollow() != null) {
                  var10002 = var2;
                  var10004 = 63 & 122;
                  ++var2;
                  var3 += this.lq(var10002, var3, 3 >> 2, var10004, 3 >> 2, "我是来劫道的", 31711 & 1506);
                  var10000 = var6;
                  break label49;
               }

               var10002 = var2;
               var10004 = 58 & 127;
               var10005 = 3 ^ 3;
               ++var2;
               var3 += this.lq(var10002, var3, var10005, var10004, var10005, "满地宝物先抢一个在说", 26623 & 6594);
            }

            var10000 = var6;
         }
      }

      if (var10000.getTaskList() != null) {
         for(int var7 = var4 = 5 >> 2; var7 < var6.getTaskList().size(); var7 = var4) {
            String var5;
            if ((var5 = this.vd().getTaskSystem().r((Integer)var6.getTaskList().get(var4))) != null) {
               var10002 = var2;
               var10004 = --1;
               ++var2;
               var3 += this.lq(var10002, var3, var10004, 5 >> 3, var5, var5, 5623 & 27594);
            }

            ++var4;
         }
      }

      var10002 = var2;
      var10004 = 5 >> 3;
      var10005 = 5 >> 3;
      ++var2;
      var3 += this.lq(var10002, var3, var10004, var10005, (Object)null, "我什么都不想做", 22470 & 10747);
      this.li(var3, (95 & 55) + this.bw.getHeight());
      this.f(var6.getRobotskin());
   }

   public int e() {
      return this.ay;
   }

   public void lv(Class165 var1, NpcInfoBean var2, Task var3, TaskProgress var4) {
      this.o();
      Question var9;
      if ((var9 = this.vc().cd(var4.getDId())) == null) {
         this.aej.fw("找不到对应题库");
      } else {
         this.ay = 29 & 110;
         this.un = (long)var3.getTaskId();
         this.uk = var1;
         this.lb(var9.getKey());
         int var7 = 3 & 4;
         int var8 = 3 & 4;

         int var5;
         for(int var10000 = var5 = 5 >> 3; var10000 < var9.getValues().length; var10000 = var5) {
            NpcOption var6 = this.lm(var7);
            var10000 = 5 >> 3;
            ++var7;
            var6.yc(103 & 31, var5 + (3 & 5), var2.getNpctable().getNpcname(), var9.getValues()[var5], 10231 & 22986);
            var6.setBounds(var10000, var8, 32223 & 1014, var6.getHeight());
            ++var5;
            var8 += var6.getHeight();
         }

         this.li(var8, (119 & 31) + this.bw.getHeight());
         this.go();
      }
   }

   public void lb(String var1) {
      this.bw.setTextSize(var1 != null ? var1 : "", 495);
      this.bw.setBounds(23 & 124, 47 & 95, this.bw.getWidth(), this.bw.getHeight());
   }

   public void lw(NPCDialog var1) {
      int var10004 = 46 & 95;
      this.o();
      this.ay = var10004;
      this.lb(var1.getMsg());
      if (!Class394.o(var1.getType())) {
         if (var1.getType().startsWith("N")) {
            this.un = Class394.q(var1.getType(), 3 & 5, var1.getType().length());
            this.ul = 0L;
         } else if (var1.getType().startsWith("M")) {
            this.un = Class394.q(var1.getType(), --1, var1.getType().length());
            this.ul = 1L;
            Class572 var4;
            if ((var4 = this.aej.mapScene.q(this.un.intValue())) == null) {
               return;
            }

            this.uk = var4;
         }
      }

      String var11 = null;
      int var7 = 3 >> 2;
      int var2 = 5 >> 3;
      String var12;
      int var10002;
      if (var1.getFunctions() != null) {
         int var5 = 2 & 5;
         MonsterBean var3;
         int var10000;
         int var10005;
         if (this.ul != null && this.ul == 1L && (var3 = ((Class572)this.uk).p).getRobottype() >= (109 & 118) && var3.getRobottype() <= (20207 & 12759) && var3.getRobottype() != (28606 & 4293)) {
            int var8;
            for(var10000 = var8 = 3 ^ 3; var10000 < var1.getFunctions().size(); var10000 = var8) {
               String var9 = (String)var1.getFunctions().get(var8);
               var10002 = var7;
               var10004 = 3 & 4;
               ++var7;
               var10005 = 77 & 114;
               String var10006 = "M" + var3.getI() + "|" + var9;
               int var10008 = 12286 & 20931;
               ++var8;
               var2 += this.lq(var10002, var2, var10004, var10005, var10006, var9, var10008);
            }

            var5 = 3 >> 1;
         }

         int var6 = var5 != 0 ? var1.getFunctions().size() : 0;

         for(var10000 = var6; var10000 < var1.getFunctions().size(); var10000 = var6) {
            String var10;
            if ((var10 = (String)var1.getFunctions().get(var6)).equals("我要回长安")) {
               var10002 = var7;
               var10004 = 3 >> 2;
               ++var7;
               var2 += this.lq(var10002, var2, var10004, --3, (Object)null, "我要回长安", 6631 & 26586);
            } else if (var10.equals("我要下战书")) {
               var10002 = var7;
               var10004 = 5 >> 3;
               var10005 = 101 & 91;
               ++var7;
               var2 += this.lq(var10002, var2, var10004, var10005, (Object)null, "我要下战书", 29690 & 3527);
            } else {
               var10002 = var7;
               var10004 = 3 ^ 3;
               var10005 = 30 & 125;
               ++var7;
               var2 += this.lq(var10002, var2, var10004, var10005, var10, var10, 19442 & 13775);
            }

            ++var6;
         }

         var12 = var11;
      } else {
         var12 = var11 = "我什么都不做";
      }

      if (var12 != null) {
         var10002 = var7;
         var10004 = 5 >> 3;
         ++var7;
         var2 += this.lq(var10002, var2, var10004, var10004, (Object)null, var11, 8158 & 25059);
      }

      this.li(var2, (23 & 127) + this.bw.getHeight());
      this.go();
   }

   public Long lx() {
      return this.ul;
   }

   public void ly(Goodstable var1) {
      int var10006 = 63 & 82;
      this.o();
      this.ay = var10006;
      this.un = var1.getRgid().longValue();
      String var3 = var1.getValue().split("\\|")[5 >> 1].split("=")[--1];
      this.lb("该星卡当前战力为:" + var3 + ",可以选择以下两种补充战力");
      int var4 = 3 & 4;
      int var2 = 3 >> 2;
      Class472 var10000;
      int var10002;
      int var10004;
      int var10005;
      if (this.uw().n(1 ^ 3, 126 & 13)) {
         var10002 = var4;
         var10004 = 93 & 46;
         var10005 = 3 >> 2;
         ++var4;
         var2 += this.lq(var10002, var2, var10004, var10005, var10005, "星芒恢复(10点=1000点战力)", 11767 & 21450);
         var10002 = var4;
         var10004 = 124 & 15;
         ++var4;
         var2 += this.lq(var10002, var2, var10004, 2 ^ 3, 5 >> 3, "金币恢复(100万=1000点战力)", 9179 & 24038);
         var10000 = this;
      } else {
         var10002 = var4;
         var10004 = 76 & 63;
         var10005 = 3 & 4;
         ++var4;
         var2 += this.lq(var10002, var2, var10004, var10005, var10005, "星芒恢复(100点=1000点战力)", 25059 & 8158);
         var10002 = var4;
         var10004 = 44 & 95;
         ++var4;
         var2 += this.lq(var10002, var2, var10004, 4 ^ 5, 3 >> 2, "金币恢复(1000万=1000点战力)", 18410 & 14807);
         var10000 = this;
      }

      var10000.li(var2, (127 & 23) + this.bw.getHeight());
      this.go();
   }

   public void f(String var1) {
      Class610 var2 = !Class394.o(var1) ? Class511.c(var1) : null;
      int var4 = var2 != null ? (3 & 5) + var2.e().getHeight((ImageObserver)null) : 0;
      int var3 = Math.max(32191 & 726, (28655 & 4312) - Math.max(5 >> 3, (32191 & 726) - this.eb.getY() - this.eb.getHeight()));
      Class472 var10000;
      if (var4 > 0) {
         this.ec.hf(var2.e());
         var10000 = this;
         this.ec.setBounds(1 ^ 3, --1, var2.e().getWidth((ImageObserver)null), var2.e().getHeight((ImageObserver)null));
         this.eb.setBounds(this.eb.getX(), this.eb.getY() + var4, this.eb.getWidth(), this.eb.getHeight());
         this.bw.setBounds(this.bw.getX(), this.bw.getY() + var4, this.bw.getWidth(), this.bw.getHeight());
         this.vf((this.aej.screenData.Screen_x - (25278 & 8015)) / (5 >> 1), (this.aej.screenData.Screen_y - var3) / --2 - var4, this.getWidth(), var3 + var4);
         this.ad(new Class116(3 >> 2, var4, 3 >> 2, 3 >> 2));
      } else {
         this.ec.q();
         var10000 = this;
         this.vf((this.aej.screenData.Screen_x - (31279 & 2014)) / --2, (this.aej.screenData.Screen_y - var3) / (5 >> 1), this.getWidth(), var3);
         this.ad((Class116)null);
      }

      var10000.eb.getVerticalScrollBar().setValue(3 ^ 3);
      if (this.ay == (62 & 89)) {
         this.ve().i(this.ae());
      } else {
         this.ve().a(this.ae());
      }
   }

   public void d() {
      int var10002 = 3 ^ 3;
      int var10006 = 94 & 55;
      this.o();
      this.ay = var10006;
      this.lb("请选择你要兑换的类型");
      int var1 = var10002;
      int var2 = 3 ^ 3;
      int var10004 = var1;
      var10006 = 115 & 28;
      ++var1;
      var2 += this.lq(var10004, var2, var10006, 3 & 5, (Object)null, "我要用90个神兽碎片来兑换神兽", 8171 & 25046);
      var10004 = var1;
      var10006 = 63 & 80;
      ++var1;
      this.li(var2 + this.lq(var10004, var2, var10006, 1 ^ 3, (Object)null, "我要用500个珍惜神兽碎片来兑换稀有神兽", 28135 & 5082), (119 & 31) + this.bw.getHeight());
      this.go();
   }

   public void lz(int var1, int[] var2) {
      int var10000 = 2 & 5;
      int var10005 = 127 & 27;
      this.o();
      this.ay = var10005;
      this.un = (long)var1;
      var1 = var10000;
      int var3 = 3 ^ 3;
      this.lb("#W积分赛一共有#G" + var2[3 >> 2] + "#W个队伍,当前正在匹配队伍有#G" + var2[--1] + "#W个队伍");
      int var10002;
      int var10004;
      if (var2[--2] == 0) {
         var10002 = var1;
         var10004 = 95 & 53;
         var10005 = 4 ^ 5;
         ++var1;
         var10000 = var3 += this.lq(var10002, var3, var10004, var10005, (Object)null, "我要进行匹配", 29175 & 4042);
      } else {
         var10002 = var1;
         var10004 = 31 & 117;
         var10005 = 5 >> 1;
         ++var1;
         var10000 = var3 += this.lq(var10002, var3, var10004, var10005, (Object)null, "我要取消匹配", 8159 & 25058);
      }

      var10002 = var1;
      var10004 = 5 >> 3;
      var10005 = 5 >> 3;
      ++var1;
      this.li(var10000 + this.lq(var10002, var3, var10004, var10005, (Object)null, "我什么都不做", 6119 & 27098), (31 & 119) + this.bw.getHeight());
      this.go();
   }

   public void ma(RoleSummoning var1, Goodstable var2) {
      int var10001 = 127 & 24;
      this.o();
      this.ay = var10001;
      StringBuffer var6 = new StringBuffer("#W你召唤兽打炼妖后的属性将为(#Y黄色#W为原始属性,#G绿色#W为已经有的炼妖属性,#R红色#W为物品增加的属性,#c4ADEDD[]内未召唤兽此抗性的炼妖上限,超过没有实际效果#W):");
      String var4 = "#c4ADEDD[" + (this.vd().getPetMount(var1.getSid()) != null ? 95 & 127 : 75) + "]";
      int var5 = 3 ^ 3;
      int var3 = 2 & 5;
      int var7 = 3 & 4;

      for(int var10000 = var3; var10000 < var2.getValue().length(); var10000 = var3) {
         if ((var3 = var2.getValue().indexOf("|", var5 + (3 & 5))) == -4 >> 2) {
            var3 = var2.getValue().length();
         }

         if ((var7 = var2.getValue().indexOf("=", var5 + --1)) == -4 >> 2 || var7 > var3) {
            var7 = var3;
         }

         String var8;
         if ((var8 = var2.getValue().substring(var5, var7)).equals("等级")) {
            var10000 = var3;
         } else {
            var6.append("#r#W");
            var6.append(var8);
            var6.append(": ");
            String var9 = Class394.d(var1.getResistance(), var8 + "=", "|");
            if (!Class394.o(var9)) {
               var6.append("#Y");
               var6.append(var9);
               var6.append(" #W+ ");
            }

            if (!Class394.o(var9 = Class394.d(var1.getLyk(), var8 + "=", "|"))) {
               var6.append("#G");
               var6.append(var9);
               var6.append(" #W+ ");
            }

            var6.append("#R");
            var6.append(var2.getValue(), var7 + --1, var3);
            var6.append(var4);
            var10000 = var3;
         }

         var5 = var10000 + 1;
      }

      int var10002 = 3 & 4;
      this.lb(var6.toString());
      var5 = var10002;
      var3 = 3 & 4;
      int var10004 = var5;
      int var10006 = 83 & 62;
      ++var5;
      var3 += this.lq(var10004, var3, var10006, 3 >> 2, (Object)null, "好就这样了", 11263 & 21954);
      var10004 = var5;
      var10006 = 3 >> 2;
      ++var5;
      this.li(var3 + this.lq(var10004, var3, var10006, var10006, (Object)null, "我再准备一下", 6087 & 27130), (87 & 63) + this.bw.getHeight());
      this.go();
   }

   public JComponent dl() {
      return this.um;
   }

   public void cf(int var1, int var2) {
      int var10002 = 3 >> 2;
      int var10005 = 95 & 58;
      this.o();
      this.ay = var10005;
      this.lb("你有#G" + var1 + "#W个守护石可修复，累计受损耐久值#R" + var2 + "#W。优先修复耐久最低的守护石，每点耐久值需要消耗一点守护之尘");
      var1 = var10002;
      var2 = 5 >> 3;
      int var10004 = var1;
      int var10006 = 23 & 124;
      ++var1;
      var2 += this.lq(var10004, var2, var10006, 103 & 124, (Object)null, "修复100点耐久", 22522 & 10695);
      var10004 = var1;
      var10006 = 127 & 20;
      ++var1;
      var2 += this.lq(var10004, var2, var10006, 32765 & 1002, (Object)null, "修复1000点耐久", 2538 & 30679);
      var10004 = var1;
      var10006 = 126 & 21;
      ++var1;
      var2 += this.lq(var10004, var2, var10006, 99999, (Object)null, "全部修复", 25030 & 8187);
      var10004 = var1;
      var10006 = 5 >> 3;
      ++var1;
      this.li(var2 + this.lq(var10004, var2, var10006, var10006, (Object)null, "暂时不修复", 24571 & 8646), (23 & 127) + this.bw.getHeight());
      this.go();
   }

   public void as(int var1) {
      int var5;
      if ((var5 = MsgUntil.getSM(var1, this.vd().getLoginResult().getSpecies_id().intValue())) != -4 >> 2) {
         int var10001 = 3 ^ 3;
         int var10007 = 45 & 95;
         this.o();
         this.ay = var10007;
         this.un = (long)var1;
         this.lb("");
         var1 = var10001;
         int var3 = 5 >> 3;
         Class603 var4 = this.vc();

         int var2;
         for(int var10000 = var2 = 5 >> 3; var10000 < 5; var10000 = var2) {
            Skill var6;
            if ((var6 = var4.bf(String.valueOf((32749 & 1019) + var5 * --5 + var2))) != null) {
               int var10002 = var1;
               int var10004 = 107 & 28;
               int var10005 = 2045 & 31723;
               ++var1;
               var3 += this.lq(var10002, var3, var10004, var10005 + var5 * --5 + var2, (Object)null, var6.getSkillname(), 16363 & 16854);
            }

            ++var2;
         }

         this.li(var3, (87 & 63) + this.bw.getHeight());
         this.go();
      }
   }

   protected void paintComponent(Graphics var1) {
      super.paintComponent(var1);
      if (this.aeg) {
         this.aeg = (boolean)(2 & 5);
         this.eb.updateUI();
      }

   }

   public void av(Goodstable var1) {
      int var10001 = 3 & 4;
      int var10007 = 3 >> 1;
      this.o();
      this.ay = var10007;
      this.un = var1.getRgid().longValue();
      this.lb("记录多个坐标的飞行棋");
      int var5 = var10001;
      int var4 = 5 >> 3;

      NpcOption var2;
      GoodFight var3;
      for(GoodFight var6 = var3 = var1.getFight(); var6 != null && var3.getMap() != 0; var6 = var3 = var3.getNextFight()) {
         var2 = this.lm(var5);
         ++var5;
         int var10002 = 3 & 4;
         var2.yc(--3, 3 >> 2, var3, var3.getMenu(), 17898 & 15319);
         var2.setBounds(var10002, var4, 19414 & 13823, var2.getHeight());
         var4 += var2.getHeight();
      }

      if (var5 < --5) {
         var2 = this.lm(var5);
         int var7 = 3 & 4;
         ++var5;
         var2.yc(--4, 5 >> 3, (Object)null, "新增坐标", 28154 & 5063);
         var2.setBounds(var7, var4, 22494 & 10743, var2.getHeight());
         var4 += var2.getHeight();
      }

      this.li(var4, (63 & 87) + this.bw.getHeight());
      this.go();
   }

   public void y(int var1) {
      int var10002 = 87 & 63;
      this.o();
      this.ay = var10002;
      if (var1 == (3 & 5)) {
         this.lb("使用#Y90#W个#G神兽碎片#W可以随机兑换以下神兽中的随机一只：#r五常神兽：#G五叶、浪淘沙、颜如玉、垂云叟、范式之魂#r#W经典神兽：#G超级飞鱼、超级蟾蜍、超级蜘蛛、超级蝙蝠、超级毒蛇、超级海龟#r#W六艺神兽：#G灵听、飞轩、莲生、大吕、兰亭、幻方");
      } else if (var1 == (1 ^ 3)) {
         this.lb("使用#Y500#W个#G珍惜神兽碎片#W可以随机兑换以下神兽中的随机一只：#r#W珍稀神兽：#G年、画中仙、白泽");
      }

      byte var2 = 0;
      int var3 = 3 & 4;
      int var10004 = 127 & 17;
      int var4 = var2 + 1;
      var3 += this.lq(var2, var3, var10004, var1, (Object)null, "给你神兽碎片，我已经迫不及待了！", 20947 & 12270);
      var10002 = var4;
      var10004 = 5 >> 3;
      ++var4;
      this.li(var3 + this.lq(var10002, var3, var10004, var10004, (Object)null, "我在考虑考虑", 990 & 32227), (63 & 87) + this.bw.getHeight());
      this.go();
   }

   public void ax(Goodstable var1) {
      if (var1.getType() == 721L) {
         int var10001 = 61 & 91;
         this.o();
         this.ay = var10001;
         if (var1.getType() == 721L) {
            this.lb("你是否将筋骨提气丹兑换成灵元晶？#R(兑换比例3:2)");
         }

         byte var2 = 0;
         int var3 = 3 ^ 3;
         int var10004 = 127 & 19;
         int var4 = var2 + 1;
         var3 += this.lq(var2, var3, var10004, 5 >> 3, var1.getRgid(), "我要兑换", 13823 & 19394);
         int var5 = var4;
         var10004 = 2 & 5;
         ++var4;
         this.li(var3 + this.lq(var5, var3, var10004, var10004, (Object)null, "我不愿意", 27623 & 5594), (63 & 87) + this.bw.getHeight());
         this.go();
      }
   }

   public void ew(Goodstable var1, int var2) {
      Goodstable var3;
      GoodExchange[] var4 = (var3 = this.aej.getObjectArea().n(var1.getGoodsid())) != null ? var3.getExchanges() : null;
      if (var4 != null) {
         if (var4.length == --1) {
            this.ey(var1, 2 & 5, var2);
         } else {
            int var10006 = 21 & 126;
            this.o();
            this.ay = var10006;
            this.un = var1.getRgid().longValue();
            this.ul = (long)var2;
            this.lb("请选择对应的兑换分类。当前兑换数量:" + var2);
            int var5 = 3 >> 2;
            var2 = 3 >> 2;

            int var6;
            for(int var10000 = var6 = 2 & 5; var10000 < var4.length; var10000 = var6) {
               int var10002 = var5;
               int var10004 = 94 & 47;
               ++var5;
               int var10005 = var6;
               String var10007 = var4[var6].getKey();
               int var10008 = 17359 & 15858;
               ++var6;
               var2 += this.lq(var10002, var2, var10004, var10005, (Object)null, var10007, var10008);
            }

            this.li(var2, (31 & 119) + this.bw.getHeight());
            this.go();
         }
      }
   }
}
