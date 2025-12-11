package com.xy.a;

import com.xy.bean.MonsterBean;
import com.xy.bean.NPCDialog;
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
import com.xy.richtext.RichLabel;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.math.BigDecimal;
import java.util.List;
import javax.swing.JComponent;
import javax.swing.JScrollPane;

public class Class6 extends com.xy.q.Class30 {
   private Long cm;
   private int cn;
   private com.xy.w.Class18 co;
   private JScrollPane cp;
   private Long cq;
   private JComponent cr;
   private com.xy.d.Class4 cs;
   private RichLabel bj;

   public JComponent bf() {
      return this.cr;
   }

   public void bg(int var1, int var2) {
      var1 = var1 > 50 ? var1 : 50;
      int var3 = 187 - var2;
      this.cr.setPreferredSize(new Dimension(450, var1));
      this.cp.setBounds(20, var2, 470, var1 < var3 ? var1 : var3);
   }

   public void bh(com.xy.d.Class1 var1, NpcInfoBean var2, int var3) {
      this.e();
      this.cn = 0;
      this.cq = var2 != null ? Long.parseLong(var2.getNpctable().getNpcid()) : null;
      this.cs = var1;
      int var4 = 0;
      int var5 = 0;
      RoleData var6;
      PKSys var7;
      Class6 var10000;
      if ((var7 = (var6 = this.yx()).getPkSys()).getPk1() == 0) {
         String var10001 = "乯义舀汲矡烚唊O均閚讘伃辴变";
         this.bq("一个良民瞎点啥,在闹请你进去");
         int var10002 = var4++;
         Integer var10006 = 1;
         String var10007 = "执惿反歷爔掮皧";
         var5 += this.by(var10002, var5, 0, 62, var10006, "我想去死牢探监", 450);
         var10002 = var4++;
         var10006 = 2;
         var10007 = "扲悜变坟爁揍皲";
         int var15;
         int var18 = var15 = var5 + this.by(var10002, var5, 0, 62, var10006, "我想去地牢探监", 450);
         var10000 = this;
         int var10003 = var4++;
         Integer var23 = 3;
         String var10008 = "执惿反夥爔掮皧";
         var5 = var18 + this.by(var10003, var15, 0, 62, var23, "我想去天牢探监", 450);
      } else {
         StringBuffer var8 = new StringBuffer();
         var10000 = this;
         var8.append(var6.getLoginResult().getRolename());
         String var20 = "C伃辷杪";
         var8.append(",你还有");
         var8.append(var7.getPk1());
         String var10005 = "烏\\=栋御臦駠口亓凃輍罦蠺";
         var8.append("点PK标志自首可以减轻罪行");
         this.bq(var8.toString());
         int var24 = var4++;
         String var10012 = "找晌朊膉駹盧";
         var5 += this.by(var24, var5, 0, 63, null, "我是来自首的", 450);
         var24 = var4++;
         var10012 = "戝亶乄邋丁倬";
         var5 += this.by(var24, var5, 0, 0, null, "我什么都不做", 450);
      }

      var10000.bg(var5, 23 + this.bj.getHeight());
      this.ci(var2.getNpctable().getSkin());
   }

   public void bi(int var1) {
      int var2;
      if ((var2 = MsgUntil.getSM(var1, this.yx().getLoginResult().getSpecies_id().intValue())) != -1) {
         this.e();
         this.cn = 13;
         this.cq = (long)var1;
         this.bq("");
         int var3 = 0;
         int var4 = 0;
         com.xy.v.Class8 var5 = this.yt();

         int var6;
         for (int var10000 = var6 = 0; var10000 < 5; var10000 = ++var6) {
            Skill var7;
            if ((var7 = var5.ac(String.valueOf(1001 + var2 * 5 + var6))) != null) {
               var4 += this.by(var3++, var4, 8, 1001 + var2 * 5 + var6, null, var7.getSkillname(), 450);
            }
         }

         this.bg(var4, 23 + this.bj.getHeight());
         this.h();
      }
   }

   public void bj(BigDecimal var1, int var2) {
      this.e();
      this.cn = 17;
      this.cq = var1.longValue();
      this.cm = (long)var2;
      String var10006 = "讔遦把乤霁儙乎乯頚壱勃";
      StringBuilder var10004 = new StringBuilder("请选择下面其中一项增加").append(var2);
      String var10005 = "烏皈垌硌偊";
      this.bq(var10004.append("点的基础值").toString());
      int var3 = 0;
      int var4 = 0;
      int var12 = var3++;
      Integer var10008 = 0;
      String var10009 = "'3";
      var4 += this.by(var12, var4, 11, 0, var10008, "HP", 450);
      int var13 = var3++;
      var10008 = 0;
      var10009 = "A&";
      var4 += this.by(var13, var4, 11, 1, var10008, "MP", 450);
      int var14 = var3++;
      var10008 = 0;
      var10009 = ".3";
      var4 += this.by(var14, var4, 11, 2, var10008, "AP", 450);
      this.bg(var4 + this.by(var3++, var4, 11, 3, 0, "SP", 450), 23 + this.bj.getHeight());
      this.h();
   }

   public void bk(String var1) {
      if (!com.xy.v.Class12.h(var1)) {
         this.e();
         this.cn = 9;
         this.bq(var1);
         this.bg(0, 23 + this.bj.getHeight());
         this.h();
      }
   }

   public void bl(Goodstable var1) {
      String var10002 = "遪抆戰彯呪礊姡慠蚨盫旚彠ｫ礧秬夹勒暛乓宣ｪ";
      this.e();
      this.cn = 1;
      this.cq = var1.getRgid().longValue();
      this.bq("选择打开吉祥如意蛋的方式（祈福奖励更丰富）");
      int var2 = 0;
      int var3 = 0;

      int var4;
      for (int var10000 = var4 = 0; var10000 < 2; var10000 = var4) {
         NpcOption var5 = this.ca(var2);
         var2++;
         NpcOption var6;
         if (var4 == 0) {
            var6 = var5;
            String var10005 = "相揓扟彶";
            var5.agv(6, 1, null, "直接打开", 450);
         } else {
            var6 = var5;
            String var7 = "礧秬ｧV_S8醲幮ｪ";
            var5.agv(6, 2, null, "祈福（500W金币）", 450);
         }

         var6.setBounds(0, var3, 470, var5.getHeight());
         var4++;
         var3 += var5.getHeight();
      }

      this.bg(var3, 23 + this.bj.getHeight());
      this.h();
   }

   public void bm(com.xy.d.Class0 var1) {
      String var10003 = "辺醣颭昀辻乢嶍";
      this.e();
      this.cn = 0;
      this.cs = var1;
      this.bq("这里风景还不差");
      int var2 = 0;
      int var3 = 0;
      int var14 = var2++;
      Integer var10007 = 0;
      String var10008 = "执昣朓凷朶佬盲";
      var3 += this.by(var14, var3, 0, 58, var10007, "我是来击杀你的", 450);
      TaskData var4;
      int var5;
      if ((var4 = var1.b.getTask().getTaskData()) != null) {
         for (int var10000 = var5 = 1; var10000 <= var4.getNd(); var10000 = ++var5) {
            if (var5 == 1) {
               int var10002 = var2++;
               Integer var10006 = 1;
               String var18 = "扲晀朆冔朣伏盧G嚓雑雝廉J";
               var3 += this.by(var10002, var3, 0, 58, var10006, "我是来击杀你的(困难难度)", 450);
            } else if (var5 == 2) {
               int var10 = var2++;
               Integer var15 = 2;
               String var19 = "执昣朓凷朶佬盲$匥趆雈庪_";
               var3 += this.by(var10, var3, 0, 58, var15, "我是来击杀你的(卓越难度)", 450);
            } else if (var5 == 3) {
               int var11 = var2++;
               Integer var16 = 3;
               String var20 = "扲晀朆冔朣伏盧G坓犞雝廉J";
               var3 += this.by(var11, var3, 0, 58, var16, "我是来击杀你的(地狱难度)", 450);
            } else if (var5 == 4) {
               int var12 = var2++;
               Integer var17 = 4;
               String var21 = "执昣朓凷朶佬盲$奟堎雈庪_";
               var3 += this.by(var12, var3, 0, 58, var17, "我是来击杀你的(天堂难度)", 450);
            }
         }
      }

      int var13 = var2++;
      String var22 = "扲亯丫邒乮悜倹";
      var3 += this.by(var13, var3, 0, 0, null, "我什么都不想做", 450);
      this.bg(var3, 23 + this.bj.getHeight());
      this.ci(null);
   }

   public void bn(Goodstable var1, int var2, int var3) {
      com.xy.v.Class8 var4;
      Goodstable var5;
      GoodExchange[] var6 = (var5 = (var4 = this.afx.getObjectArea()).ay(var1.getGoodsid())) != null ? var5.getExchanges() : null;
      if (var6 != null) {
         this.cn = 21;
         this.cq = var1.getRgid().longValue();
         this.cm = (long)var3;
         String var10003 = "读避拥靶覍儧据盲逅頏『弥剁儧据攆釃L";
         this.bq("请选择需要兑换的选项。当前兑换数量:" + var3);
         int var7 = 0;
         int var8 = 0;
         GoodExchange var9 = var6[var2];

         int var10;
         for (int var10000 = var10 = 0; var10000 < var9.getGoods().length; var10000 = ++var10) {
            if ((var5 = var4.ay(var9.getGoods()[var10])) != null) {
               var8 += this.by(var7++, var8, 15, var9.getGoods()[var10].intValue(), null, var5.getGoodsname(), 450);
            }
         }

         this.bg(var8, 23 + this.bj.getHeight());
         this.h();
      }
   }

   @Override
   protected void paintComponent(Graphics var1) {
      super.paintComponent(var1);
      if (this.wt) {
         this.wt = false;
         this.cp.updateUI();
      }
   }

   public void bo(Goodstable var1) {
      String var10002 = "屰彥昀矿袳据乌寵廢皈厚唨儋饼咷";
      this.e();
      this.cn = 1;
      this.cq = var1.getRgid().longValue();
      this.bq("将彩晶石装换为对应的召唤兽饰品");
      int var2 = 0;
      int var3 = 0;

      int var4;
      for (int var10000 = var4 = 0; var10000 < 33; var10000 = var4) {
         NpcOption var5 = this.ca(var2);
         var2++;
         NpcOption var6;
         if (var4 == 0) {
            var6 = var5;
            String var10004 = "鿶騏餟咢";
            String var10005 = "龕騚饼咷";
            var5.agv(5, 1, "龙马饰品", "龙马饰品", 450);
         } else if (var4 == 1) {
            var6 = var5;
            String var7 = "瘞鿶幾餟咢";
            String var39 = "瘋龕幫饼咷";
            var5.agv(5, 1, "白龙帝饰品", "白龙帝饰品", 450);
         } else if (var4 == 2) {
            var6 = var5;
            String var8 = "灹婮獈屩盧奈剣";
            String var40 = "灬娍獝尊盲夫剶";
            var5.agv(5, 1, "瀚威猫将的大刀", "瀚威猫将的大刀", 450);
         } else if (var4 == 3) {
            var6 = var5;
            String var9 = "梶屠人餟咢";
            String var41 = "梣尃亯饼咷";
            var5.agv(5, 1, "棕小仙饰品", "棕小仙饰品", 450);
         } else if (var4 == 4) {
            var6 = var5;
            String var10 = "缸剚魓妏餟咢";
            String var42 = "罛剏鬰妚饼咷";
            var5.agv(5, 1, "罗刹鬼姬饰品", "罗刹鬼姬饰品", 450);
         } else if (var4 == 5) {
            var6 = var5;
            String var11 = "凊隔餟咢";
            String var43 = "冩隁饼咷";
            var5.agv(5, 1, "冥雷饰品", "冥雷饰品", 450);
         } else if (var4 == 6) {
            var6 = var5;
            String var12 = "褐垼咢騏餟咢";
            String var44 = "襳垩品騚饼咷";
            var5.agv(5, 1, "西域响马饰品", "西域响马饰品", 450);
         } else if (var4 == 7) {
            var6 = var5;
            String var13 = "醲乢持餟咢";
            String var45 = "醧丁挔饼咷";
            var5.agv(5, 1, "金不换饰品", "金不换饰品", 450);
         } else if (var4 == 8) {
            var6 = var5;
            String var14 = "朑齃餟咢";
            String var46 = "杲齖饼咷";
            var5.agv(5, 1, "松鼠饰品", "松鼠饰品", 450);
         } else if (var4 == 9) {
            var6 = var5;
            String var15 = "抋洅齰餟咢";
            String var47 = "択浦齥饼咷";
            var5.agv(5, 1, "拨浪鼓饰品", "拨浪鼓饰品", 450);
         } else if (var4 == 10) {
            var6 = var5;
            String var16 = "咆來夞餟咢";
            String var48 = "咓俥夋饼咷";
            var5.agv(5, 1, "哥俩好饰品", "哥俩好饰品", 450);
         } else if (var4 == 11) {
            var6 = var5;
            String var17 = "嬻隣晡珨餟咢";
            String var49 = "存隶昂珽饼咷";
            var5.agv(5, 1, "孔雀明王饰品", "孔雀明王饰品", 450);
         } else if (var4 == 12) {
            var6 = var5;
            String var18 = "贂热餟咢";
            String var50 = "赡烸饼咷";
            var5.agv(5, 1, "赭炎饰品", "赭炎饰品", 450);
         } else if (var4 == 13) {
            var6 = var5;
            String var19 = "畔盍婷嬳餟咢";
            String var51 = "男盘娔嬦饼咷";
            var5.agv(5, 1, "画皮娘子饰品", "画皮娘子饰品", 450);
         } else if (var4 == 14) {
            var6 = var5;
            String var20 = "凊瀖姬嬳餟咢";
            String var52 = "冩瀃妏嬦饼咷";
            var5.agv(5, 1, "冥灵妃子饰品", "冥灵妃子饰品", 450);
         } else if (var4 == 15) {
            var6 = var5;
            String var21 = "麧醾儞餟咢";
            String var53 = "麲針儋饼咷";
            var5.agv(5, 1, "黄金兽饰品", "黄金兽饰品", 450);
         } else if (var4 == 16) {
            var6 = var5;
            String var22 = "刲糑瀖餟咢";
            String var54 = "刧粲瀃饼咷";
            var5.agv(5, 1, "剑精灵饰品", "剑精灵饰品", 450);
         } else if (var4 == 17) {
            var6 = var5;
            String var23 = "沆瞜恉餟咢";
            String var55 = "沓矿恜饼咷";
            var5.agv(5, 1, "泥石怪饰品", "泥石怪饰品", 450);
         } else if (var4 == 18) {
            var6 = var5;
            String var24 = "凓隅鬷餟咢";
            String var56 = "准雦鬢饼咷";
            var5.agv(5, 1, "冰雪魔饰品", "冰雪魔饰品", 450);
         } else if (var4 == 19) {
            var6 = var5;
            String var25 = "蜛蜕亶嬳餟咢";
            String var57 = "蝸蜀仕嬦饼咷";
            var5.agv(5, 1, "蝴蝶仙子饰品", "蝴蝶仙子饰品", 450);
         } else if (var4 == 20) {
            var6 = var5;
            String var26 = "冋冓餟咢";
            String var58 = "凨円饼咷";
            var5.agv(5, 1, "凤凰饰品", "凤凰饰品", 450);
         } else if (var4 == 21) {
            var6 = var5;
            String var27 = "凑凝蘈餟咢";
            String var59 = "凄冾蘝饼咷";
            var5.agv(5, 1, "冲冲虫饰品", "冲冲虫饰品", 450);
         } else if (var4 == 22) {
            var6 = var5;
            String var28 = "獅恉餟咢";
            String var60 = "猦恜饼咷";
            var5.agv(5, 1, "猪怪饰品", "猪怪饰品", 450);
         } else if (var4 == 23) {
            var6 = var5;
            String var29 = "等哱夜婑餟咢";
            String var61 = "笪哤奿婄饼咷";
            var5.agv(5, 1, "符咒女娲饰品", "符咒女娲饰品", 450);
         } else if (var4 == 24) {
            var6 = var5;
            String var30 = "糑匈餟咢";
            String var62 = "粲匝饼咷";
            var5.agv(5, 1, "精卫饰品", "精卫饰品", 450);
         } else if (var4 == 25) {
            var6 = var5;
            String var31 = "獛糝餟咢";
            String var63 = "猸糈饼咷";
            var5.agv(5, 1, "猴精饰品", "猴精饰品", 450);
         } else if (var4 == 26) {
            var6 = var5;
            String var32 = "奊鿶夐餟咢";
            String var64 = "奟龕夅饼咷";
            var5.agv(5, 1, "天龙女饰品", "天龙女饰品", 450);
         } else if (var4 == 27) {
            var6 = var5;
            String var33 = "呪礊柿餟咢";
            String var65 = "呿祩柪饼咷";
            var5.agv(5, 1, "吉祥果饰品", "吉祥果饰品", 450);
         } else if (var4 == 28) {
            var6 = var5;
            String var34 = "犍蘡儞餟咢";
            String var66 = "犘虂儋饼咷";
            var5.agv(5, 1, "狮虎兽饰品", "狮虎兽饰品", 450);
         } else if (var4 == 29) {
            var6 = var5;
            String var35 = "姶鞐鹑夐餟咢";
            String var67 = "妕鞅鸲夅饼咷";
            var5.agv(5, 1, "妙音鸾女饰品", "妙音鸾女饰品", 450);
         } else if (var4 == 30) {
            var6 = var5;
            String var36 = "磈汗糑鬧餟咢";
            String var68 = "碫求粲鬲饼咷";
            var5.agv(5, 1, "碧水精魄饰品", "碧水精魄饰品", 450);
         } else if (var4 == 31) {
            var6 = var5;
            String var37 = "侬婷嬳餟咢";
            String var69 = "侹娔嬦饼咷";
            var5.agv(5, 1, "俏娘子饰品", "俏娘子饰品", 450);
         } else {
            if (var4 == 32) {
               String var10003 = "杋畝仙餟咢";
               String var38 = "杞甾仌饼咷";
               var5.agv(5, 1, "木甲人饰品", "木甲人饰品", 450);
            }

            var6 = var5;
         }

         var6.setBounds(0, var3, 470, var5.getHeight());
         var4++;
         var3 += var5.getHeight();
      }

      this.bg(var3, 23 + this.bj.getHeight());
      this.h();
   }

   @Override
   public void mousePressed(MouseEvent var1) {
      super.mousePressed(var1);
      if (this.cn == 10 && var1.getButton() == 1) {
         this.f();
      }
   }

   public void i(BigDecimal var1) {
      String var10004 = "晙吪厮匚讓叠啒共盲逬埽";
      this.e();
      this.cn = 16;
      this.cq = var1.longValue();
      this.bq("是否变化该召唤兽的造型");
      int var2 = 0;
      int var3 = 0;
      int var7 = var2++;
      Integer var10008 = 0;
      String var10009 = "晌";
      var3 += this.by(var7, var3, 10, 1, var10008, "是", 450);
      int var8 = var2++;
      var10008 = 0;
      var10009 = "呐";
      this.bg(var3 + this.by(var8, var3, 10, 0, var10008, "否", 450), 23 + this.bj.getHeight());
      this.h();
   }

   public com.xy.d.Class4 bp() {
      return this.cs;
   }

   public void bq(String var1) {
      this.bj.setTextSize(var1 != null ? var1 : "", 495);
      this.bj.setBounds(20, 15, this.bj.getWidth(), this.bj.getHeight());
   }

   public void br(Goodstable var1) {
      this.e();
      this.cn = 18;
      this.cq = var1.getRgid().longValue();
      String var10002 = var1.getValue();
      String var10003 = "3\u001f";
      var10002 = var10002.split("\\|")[2];
      var10003 = "K";
      String var2 = var10002.split("=")[1];
      String var10004 = "讆晰匂弼刮扷勸乕Y";
      StringBuilder var13 = new StringBuilder("该星卡当前战力为:").append(var2);
      var10003 = "Z口亓逅抟仩乽丨离衩儳戔勭";
      this.bq(var13.append(",可以选择以下两种补充战力").toString());
      int var3 = 0;
      int var4 = 0;
      Class6 var10000;
      if (this.za().l(2, 12)) {
         int var14 = var3++;
         Integer var10006 = 0;
         String var10007 = "晼苽态奢K^S烖^^S_S烖扻勴J";
         var4 += this.by(var14, var4, 12, 0, var10006, "星芒恢复(10点=1000点战力)", 450);
         int var15 = var3++;
         var10006 = 0;
         var10007 = "針幷恮奻$G<F下K=F<F炵扮劗_";
         var4 += this.by(var15, var4, 12, 1, var10006, "金币恢复(100万=1000点战力)", 450);
         var10000 = this;
      } else {
         int var16 = var3++;
         Integer var21 = 0;
         String var24 = "晰英怍奮GR_S烖^^S_S烖扻勴J";
         var4 += this.by(var16, var4, 12, 0, var21, "星芒恢复(100点=1000点战力)", 450);
         int var17 = var3++;
         var21 = 0;
         var24 = "醧帍怔夁^=F<F下K=F<F炵扮劗_";
         var4 += this.by(var17, var4, 12, 1, var21, "金币恢复(1000万=1000点战力)", 450);
         var10000 = this;
      }

      var10000.bg(var4, 23 + this.bj.getHeight());
      this.h();
   }

   public void bs(int var1, Point var2, int[] var3, String var4) {
      int var5;
      int var6;
      int[] var10000;
      label45: {
         this.e();
         this.cn = 27;
         this.cq = (long)var1;
         var5 = 0;
         var6 = 0;
         if (var2.x == 3) {
            if (var2.y == 0) {
               String var59 = "L4权坙殻贸乕RY彙拍伮贴K";
               StringBuilder var10001 = new StringBuilder("#W本场比赛为16强抢位赛(");
               var10000 = var3;
               StringBuilder var24 = var10001.append(var3[1]);
               var59 = "Y";
               var24 = var24.append("/").append(var3[2]);
               var59 = "JC伃盫定戤晌L$";
               var24 = var24.append("),你的对手是#G").append(var4);
               var59 = "U[险企ぴ彟刻毘剰/$";
               var24 = var24.append("#W队伍。当前比分#R").append(var3[4]);
               var59 = "@8YL1";
               this.bq(var24.append("#W:#R").append(var3[5]).toString());
               break label45;
            }

            if (var2.y == 1) {
               String var54 = "U[杚圶殢赗乌4彌抮伻赗^";
               StringBuilder var19 = new StringBuilder("#W本场比赛为8强抢位赛(");
               var10000 = var3;
               var19 = var19.append(var3[1]);
               var54 = "L";
               var19 = var19.append("/").append(var3[2]);
               var54 = "_ 伖皈宏扇晙/1";
               var19 = var19.append("),你的对手是#G").append(var4);
               var54 = "@8陼佢ち弼刮殻剥L1";
               var19 = var19.append("#W队伍。当前比分#R").append(var3[4]);
               var54 = "U[L/$";
               this.bq(var19.append("#W:#R").append(var3[5]).toString());
               break label45;
            }

            if (var2.y == 2) {
               String var10003 = "@8杏坕殷贴乙[彙拍伮贴K";
               StringBuilder var10002 = new StringBuilder("#W本场比赛为4强抢位赛(");
               var10000 = var3;
               var10002 = var10002.append(var3[1]);
               var10003 = "Y";
               var10002 = var10002.append("/").append(var3[2]);
               var10003 = "JC伃盫定戤晌L$";
               var10002 = var10002.append("),你的对手是#G").append(var4);
               var10003 = "U[险企ぴ彟刻毘剰/$";
               var10002 = var10002.append("#W队伍。当前比分#R").append(var3[4]);
               var10003 = "@8YL1";
               this.bq(var10002.append("#W:#R").append(var3[5]).toString());
               break label45;
            }
         } else if (var2.x == 4) {
            if (var2.y == 0) {
               String var69 = "/!朠坌毘购丶匼冿购丆匼圶^";
               StringBuilder var33 = new StringBuilder("#W本场比赛为半决赛上半场(");
               var10000 = var3;
               var33 = var33.append(var3[1]);
               var69 = "L";
               var33 = var33.append("/").append(var3[2]);
               var69 = "_ 伖皈宏扇晙/1";
               var33 = var33.append("),你的对手是#G").append(var4);
               var69 = "@8陼佢ち弼刮殻剥L1";
               var33 = var33.append("#W队伍。当前比分#R").append(var3[4]);
               var69 = "U[L/$";
               this.bq(var33.append("#W:#R").append(var3[5]).toString());
               break label45;
            }

            if (var2.y == 1) {
               String var64 = "L4权坙殻贸乕匩凜贸乤匩坕K";
               StringBuilder var28 = new StringBuilder("#W本场比赛为半决赛下半场(");
               var10000 = var3;
               var28 = var28.append(var3[1]);
               var64 = "Y";
               var28 = var28.append("/").append(var3[2]);
               var64 = "JC伃盫定戤晌L$";
               var28 = var28.append("),你的对手是#G").append(var4);
               var64 = "U[险企ぴ彟刻毘剰/$";
               var28 = var28.append("#W队伍。当前比分#R").append(var3[4]);
               var64 = "@8YL1";
               this.bq(var28.append("#W:#R").append(var3[5]).toString());
               break label45;
            }
         } else if (var2.x == 5) {
            if (var2.y == 0) {
               String var75 = "U[杚圶殢赗乌孯毉亅奌赗^";
               StringBuilder var42 = new StringBuilder("#W本场比赛为季殿争夺赛(");
               var10000 = var3;
               var42 = var42.append(var3[1]);
               var75 = "L";
               var42 = var42.append("/").append(var3[2]);
               var75 = "_ 伖皈宏扇晙/1";
               var42 = var42.append("),你的对手是#G").append(var4);
               var75 = "@8陼佢ち弼刮殻剥L1";
               var42 = var42.append("#W队伍。当前比分#R").append(var3[4]);
               var75 = "U[L/$";
               this.bq(var42.append("#W:#R").append(var3[5]).toString());
               break label45;
            }

            if (var2.y == 1) {
               String var74 = "@8杏坕殷贴乙减仹仦奙贴K";
               StringBuilder var11 = new StringBuilder("#W本场比赛为冠亚争夺赛(").append(var3[1]);
               String var38 = "Y";
               var11 = var11.append("/").append(var3[2]);
               var38 = "JC伃盫定戤晌L$";
               var11 = var11.append("),你的对手是#G").append(var4);
               var38 = "U[险企ぴ彟刻毘剰/$";
               var11 = var11.append("#W队伍。当前比分#R").append(var3[4]);
               var38 = "@8YL1";
               this.bq(var11.append("#W:#R").append(var3[5]).toString());
            }
         }

         var10000 = var3;
      }

      int var10;
      if (var10000[3] == 0) {
         int var47 = var5++;
         String var10007 = "执凊奱奱仰";
         var10 = var6 = var6 + this.by(var47, var6, 21, 1, null, "我准备好了", 450);
      } else {
         int var48 = var5++;
         String var80 = "找辻泎冥奨夞";
         var10 = var6 = var6 + this.by(var48, var6, 21, 2, null, "我还没准备好", 450);
      }

      int var49 = var5++;
      String var81 = "戝亶乄邋丁倬";
      this.bg(var10 + this.by(var49, var6, 0, 0, null, "我什么都不做", 450), 23 + this.bj.getHeight());
      this.h();
   }

   public void bt(RoleSummoning var1, Goodstable var2) {
      if (var1 != null && var2 != null) {
         this.e();
         this.cn = 15;
         this.cq = var1.getSid().longValue();
         this.cm = var2.getRgid().longValue();
         int var3 = 0;
         String[] var4 = null;
         if (var1.getPetSkills() != null && !var1.getPetSkills().equals("")) {
            String var10000 = var1.getPetSkills();
            String var10001 = "3\u001f";
            var4 = var10000.split("\\|");

            int var5;
            for (int var14 = var5 = 0; var14 < var4.length; var14 = ++var5) {
               var10000 = var4[var5];
               var10001 = ":";
               if (!var10000.startsWith("L")) {
                  var10000 = var4[var5];
                  var10001 = "2";
                  if (!var10000.startsWith("Q")) {
                     var10000 = var4[var5];
                     var10001 = "\"";
                     if (!var10000.startsWith("T")) {
                        var10000 = var4[var5];
                        var10001 = ";";
                        if (!var10000.startsWith("X")) {
                           var10000 = var4[var5];
                           var10001 = "K";
                           int var6;
                           if (!com.xy.a.a.Class9.fz(
                              Integer.parseInt((var6 = var10000.indexOf("=")) == -1 ? var4[var5] : var4[var5].substring(0, var6)), this.za()
                           )) {
                              var4[var5] = null;
                           } else {
                              var3++;
                           }
                           continue;
                        }
                     }
                  }
               }

               var4[var5] = null;
            }
         }

         if (var3 == 0) {
            String var33 = "讆厃啇儒辻杅嬅丏剓厀惼瀚盧拯肞";
            this.afx.dp("该召唤兽还未学习到可悟灵的技能");
         } else {
            String var10005 = "口屰";
            StringBuilder var10003 = new StringBuilder("可将").append(var1.getSummoningname());
            String var10004 = "亊乨拯肞辴蠯瀚辷";
            this.bq(var10003.append("以下技能进行灵返").toString());
            int var12 = 0;
            int var13 = 0;
            com.xy.v.Class8 var7 = this.yt();

            int var8;
            for (int var20 = var8 = 0; var20 < var4.length; var20 = ++var8) {
               if (var4[var8] != null) {
                  String var21 = var4[var8];
                  String var30 = "K";
                  int var9 = var21.indexOf("=");
                  Skill var10;
                  if ((var10 = var7.ac(var9 == -1 ? var4[var8] : var4[var8].substring(0, var9))) != null) {
                     String var24;
                     if (var9 != -1) {
                        StringBuilder var22 = new StringBuilder(String.valueOf(var10.getSkillname()));
                        var30 = "K";
                        StringBuilder var23 = var22.append("(").append(var4[var8].substring(var9 + 1));
                        var30 = "_";
                        var24 = var23.append(")").toString();
                     } else {
                        var24 = var10.getSkillname();
                     }

                     String var11 = var24;
                     var13 += this.by(var12++, var13, 9, Integer.parseInt(var10.getSkillid()), null, var11, 450);
                  }
               }
            }

            this.bg(var13, 23 + this.bj.getHeight());
            this.h();
         }
      }
   }

   public void y(int var1) {
      this.e();
      this.cn = 23;
      if (var1 == 1) {
         String var10001 = "佳畞//5F/!並UK礨共磸牋U[厙仩雹朶儧据亓万礨共乛皈雹朶乶另ｬ/\u0004亘幎祒儋６UK仢叺ぷ浦涮沕ぷ颐姴玅ぷ垎仧叓ぷ茏役乇鬴/\u0004/!练儎祒儋６UK跳纫風鱰ぷ趉绑蟲蝻」跳纫蝮蛗ぷ趉绑蝕蜖」跳纫殤蛋ぷ趉绑浻鿩/\u0004/!兡舌祒儋６UK瀃吠ぷ飒輟」菄甓ぷ夫呣」儆亡ぷ幷族";
         this.bq("使用#Y90#W个#G神兽碎片#W可以随机兑换以下神兽中的随机一只：#r五常神兽：#G五叶、浪淘沙、颜如玉、垂云叟、范式之魂#r#W经典神兽：#G超级飞鱼、超级蟾蜍、超级蜘蛛、超级蝙蝠、超级毒蛇、超级海龟#r#W六艺神兽：#G灵听、飞轩、莲生、大吕、兰亭、幻方");
      } else if (var1 == 2) {
         String var7 = "伐畋L:ZS_@8义L$玢悿礱儞磡爤L4厀了雠杙儾持亊乨礱儞乂盧雠杙乯厉ｵ@\u001d@8玮穯礽儒ｹL$帛ぢ畔乎亶ぢ瘒沞";
         this.bq("使用#Y500#W个#G珍惜神兽碎片#W可以随机兑换以下神兽中的随机一只：#r#W珍稀神兽：#G年、画中仙、白泽");
      }

      int var2 = 0;
      int var3 = 0;
      int var10002 = var2++;
      String var10007 = "绕伖祒儋碂爱\uff00执巾纹迧乻叆忳亊ｷ";
      var3 += this.by(var10002, var3, 17, var1, null, "给你神兽碎片，我已经迫不及待了！", 450);
      var10002 = var2++;
      var10007 = "找坋聬蘲聬蘲";
      this.bg(var3 + this.by(var10002, var3, 0, 0, null, "我在考虑考虑", 450), 23 + this.bj.getHeight());
      this.h();
   }

   public void bu(NPCDialog var1) {
      this.e();
      this.cn = 14;
      this.bq(var1.getMsg());
      if (!com.xy.v.Class12.h(var1.getType())) {
         if (var1.getType().startsWith("N")) {
            this.cq = com.xy.v.Class12.s(var1.getType(), 1, var1.getType().length());
            this.cm = 0L;
         } else if (var1.getType().startsWith("M")) {
            this.cq = com.xy.v.Class12.s(var1.getType(), 1, var1.getType().length());
            this.cm = 1L;
            com.xy.d.Class9 var2;
            if ((var2 = this.afx.mapScene.h(this.cq.intValue())) == null) {
               return;
            }

            this.cs = var2;
         }
      }

      String var10 = null;
      int var3 = 0;
      int var4 = 0;
      String var16;
      if (var1.getFunctions() != null) {
         boolean var5 = false;
         com.xy.d.Class9 var6;
         MonsterBean var7;
         if (this.cm != null
            && this.cm == 1L
            && (var7 = (var6 = (com.xy.d.Class9)this.cs).au).getRobottype() >= 100
            && var7.getRobottype() <= 199
            && var7.getRobottype() != 132) {
            int var8;
            for (int var10000 = var8 = 0; var10000 < var1.getFunctions().size(); var10000 = var8) {
               String var9 = var1.getFunctions().get(var8);
               int var10002 = var3++;
               StringBuilder var10006 = new StringBuilder("M").append(var7.getI());
               String var10007 = "\u001f";
               String var23 = var10006.append("|").append(var9).toString();
               var8++;
               var4 += this.by(var10002, var4, 0, 64, var23, var9, 450);
            }

            var5 = true;
         }

         int var12 = var5 ? var1.getFunctions().size() : 0;

         for (int var14 = var12; var14 < var1.getFunctions().size(); var14 = ++var12) {
            String var13;
            var16 = var13 = var1.getFunctions().get(var12);
            String var10001 = "执覍嚨镳寿";
            if (var16.equals("我要回长安")) {
               int var19 = var3++;
               String var24 = "扲觮嚽锐寪";
               var4 += this.by(var19, var4, 0, 3, null, "我要回长安", 450);
            } else {
               var10001 = "执覍乽戔丐";
               if (var13.equals("我要下战书")) {
                  int var20 = var3++;
                  String var25 = "扲觮乨扷丅";
                  var4 += this.by(var20, var4, 0, 65, null, "我要下战书", 450);
               } else {
                  var4 += this.by(var3++, var4, 0, 28, var13, var13, 450);
               }
            }
         }

         var16 = var10;
      } else {
         var16 = "戝亶乄邋丁倬";
         var16 = var10 = "我什么都不做";
      }

      if (var16 != null) {
         var4 += this.by(var3++, var4, 0, 0, null, var10, 450);
      }

      this.bg(var4, 23 + this.bj.getHeight());
      this.h();
   }

   public void g(int var1) {
      this.e();
      int var4 = 19;
      this.cq = (long)19;
      String var6;
      if (var4 == 0) {
         var6 = "讁逅頏寵廢皈则聀乬";
         var6 = "请选项对应的副职业";
      } else {
         var6 = "伏觢暛持承郀久刌耣乹ｰ刌耣乹符组杯屲^S终戮肒暗挍刌耣乹C乷殠歂暛持呡刌耣乹符组併阮伡P终ち";
         var6 = "你要更换成那个副职业？副职业等级最少10级才能更换副职业,且每次更换后副职业等级会降低3级。";
      }

      this.bq(var6);
      int var2 = 0;
      int var3 = 0;
      if (var4 != 1) {
         int var10002 = var2++;
         Integer var10006 = 0;
         String var10007 = "畐爑";
         var3 += this.by(var10002, var3, 13, 1, var10006, "畜牧", 450);
      }

      if (var4 != 2) {
         int var8 = var2++;
         Integer var14 = 0;
         String var19 = "禢楮";
         var3 += this.by(var8, var3, 13, 2, var14, "种植", 450);
      }

      if (var4 != 3) {
         int var9 = var2++;
         Integer var15 = 0;
         String var20 = "釋瞉";
         var3 += this.by(var9, var3, 13, 3, var15, "采矿", 450);
      }

      if (var4 != 4) {
         int var10 = var2++;
         Integer var16 = 0;
         String var21 = "寙儔";
         var3 += this.by(var10, var3, 13, 4, var16, "家具", 450);
      }

      if (var4 != 5) {
         int var11 = var2++;
         Integer var17 = 0;
         String var22 = "刺茙";
         var3 += this.by(var11, var3, 13, 5, var17, "制药", 450);
      }

      if (var4 != 6) {
         int var12 = var2++;
         Integer var18 = 0;
         String var23 = "等旤";
         var3 += this.by(var12, var3, 13, 6, var18, "符文", 450);
      }

      if (var4 != 0) {
         int var13 = var2++;
         String var24 = "戝亶乄邋丁倬";
         var3 += this.by(var13, var3, 0, 0, null, "我什么都不做", 450);
      }

      this.bg(var3, 23 + this.bj.getHeight());
      this.h();
   }

   public void ay(Goodstable var1) {
      String var10003 = "诟弶奵义圿桤盫颽蠣梨";
      this.e();
      this.cn = 1;
      this.cq = var1.getRgid().longValue();
      this.bq("记录多个坐标的飞行棋");
      int var2 = 0;
      int var3 = 0;

      GoodFight var4;
      for (GoodFight var10000 = var4 = var1.getFight(); var10000 != null && var4.getMap() != 0; var10000 = var4 = var4.getNextFight()) {
         NpcOption var5 = this.ca(var2);
         var2++;
         var5.agv(3, 0, var4, var4.getMenu(), 450);
         var5.setBounds(0, var3, 470, var5.getHeight());
         var3 += var5.getHeight();
      }

      if (var2 < 5) {
         NpcOption var7 = this.ca(var2);
         var2++;
         String var10006 = "於壨坜桱";
         var7.agv(4, 0, null, "新增坐标", 450);
         var7.setBounds(0, var3, 470, var7.getHeight());
         var3 += var7.getHeight();
      }

      this.bg(var3, 23 + this.bj.getHeight());
      this.h();
   }

   public Long bv() {
      return this.cq;
   }

   public void bw(com.xy.d.Class1 var1, NpcInfoBean var2, int var3) {
      if (var3 == 101) {
         this.cg(var1, var2, var3);
      } else if (var3 == 102) {
         this.bh(var1, var2, var3);
      } else {
         this.e();
         this.cn = 0;
         this.cq = var2 != null ? Long.parseLong(var2.getNpctable().getNpcid()) : null;
         this.cs = var1;
         Talk var4 = var2 != null ? var2.b() : null;
         if (var4 != null) {
            this.bq(var4.getTalktext());
            String var10000 = var2.getNpctable().getNpcid();
            String var10001 = "[S_R_Q";
            if (var10000.equals("400102")) {
               this.za().k(Agreement.getSendTextAES("hatchvalue", null));
            }
         } else {
            this.bq(null);
         }

         String var5 = null;
         int var6 = 0;
         int var7 = 0;
         NpcInfoBean var238;
         if ((var3 < 5 || var3 > 10)
            && (var3 < 13 || var3 > 15)
            && var3 != 18
            && var3 != 37
            && var3 != 45
            && var3 != 50
            && var3 != 88
            && var3 != 99
            && var3 != 120
            && var3 != 121
            && var3 != 123
            && var3 != 124
            && var3 != 125
            && var3 != 131
            && var3 != 136
            && var3 != 735
            && var3 != 2025) {
            if ((var3 < 19 || var3 > 30) && (var3 < 72 || var3 > 75)) {
               if (var3 == 888) {
                  String var240 = "找亣丧邞乢倹";
                  var5 = "我什么都不做";
                  int var288 = var6++;
                  String var590 = "戝觷统娬";
                  var7 += this.by(var288, var7, 0, 4, null, "我要结婚", 450);
                  var288 = var6++;
                  var590 = "找觢秔娹";
                  var7 += this.by(var288, var7, 0, 5, null, "我要离婚", 450);
                  var238 = var2;
               } else if (var3 == 39) {
                  int var290 = var6++;
                  Integer var474 = 60;
                  String var592 = "执覍飰叚乶尃斀叀偻旺閂";
                  var7 += this.by(var290, var7, 0, 6, var474, "我要领取一小时双倍时间", 450);
                  var290 = var6++;
                  var474 = 120;
                  var592 = "扲觮飥厹仯屠斕厣偮料閗";
                  var7 += this.by(var290, var7, 0, 6, var474, "我要领取二小时双倍时间", 450);
                  var290 = var6++;
                  var474 = 240;
                  var592 = "执覍飰叚嚭尃斀叀偻旺閂";
                  var7 += this.by(var290, var7, 0, 6, var474, "我要领取四小时双倍时间", 450);
                  var290 = var6++;
                  var592 = "找觢凔纰厣偮料閗";
                  var7 += this.by(var290, var7, 0, 7, null, "我要冻结双倍时间", 450);
                  var290 = var6++;
                  var592 = "戝觷柩讔剥伯叀偻旺閂";
                  var7 += this.by(var290, var7, 0, 8, null, "我要查询剩余双倍时间", 450);
                  var238 = var2;
               } else {
                  label582: {
                     if (var3 == 40) {
                        String var241 = "找亣丧邞乢倹";
                        var5 = "我什么都不做";
                        int var295 = var6++;
                        String var477 = "挔並骮纫薹宑嚈";
                        String var597 = "持久骻终薬寲嚝";
                        var7 += this.by(var295, var7, 0, 9, "换个高级藏宝图", "换个高级藏宝图", 450);
                        var295 = var6++;
                        var477 = "挔並跳纫薹宑嚈";
                        var597 = "持久跦终薬寲嚝";
                        var7 += this.by(var295, var7, 0, 9, "换个超级藏宝图", "换个超级藏宝图", 450);
                        if (!this.za().l(2, 11) && !this.za().l(2, 12)) {
                           var295 = var6++;
                           var477 = "据乜玾玧藃寫囲^涄聡=FI契译幷 G[亯玅_";
                           var597 = "挍义珝玲薠対嚑K淧聴^S*奄讲幢CR8人珦J";
                           var7 += this.by(var295, var7, 0, 9, "换个玲珑藏宝图(消耗10E大话币,1W仙玉)", "换个玲珑藏宝图(消耗10E大话币,1W仙玉)", 450);
                           var238 = var2;
                           break label582;
                        }
                     } else {
                        if (var3 == 41) {
                           String var279 = "戝亶乄邋丁倬";
                           var5 = "我什么都不做";
                           int var464 = var6++;
                           String var766 = "找觢传廴G戀阋Q_S_钕之J";
                           var7 += this.by(var464, var7, 0, 10, null, "我要住店(扣除2000银两)", 450);
                           var238 = var2;
                           break label582;
                        }

                        if (var3 == 12) {
                           if (this.za().l(2, 3)) {
                              int var451 = var6++;
                              String var570 = "戝觷卋绑祒儃";
                              String var753 = "找觢匨组礱儖";
                              var7 += this.by(var451, var7, 0, 11, "我要升级神兵", "我要升级神兵", 450);
                              var451 = var6++;
                              var570 = "戝觷丆礨兹瞅";
                              var753 = "找觢乥礽儚瞐";
                              var7 += this.by(var451, var7, 0, 11, "我要上神兵石", "我要上神兵石", 450);
                              var451 = var6++;
                              var570 = "粲烊祒儃";
                              var753 = "糑烟礱儖";
                              var7 += this.by(var451, var7, 0, 11, "精炼神兵", "精炼神兵", 450);
                              var451 = var6++;
                              var570 = "执覍呾戜烊妚瞅";
                              var753 = "扲觮呫承烟姹瞐";
                              var7 += this.by(var451, var7, 0, 11, "我要合成炼妖石", "我要合成炼妖石", 450);
                              var451 = var6++;
                              var570 = "宑瞅各扦";
                              var753 = "寲瞐呧扳";
                              var7 += this.by(var451, var7, 0, 11, "宝石合成", "宝石合成", 450);
                              var451 = var6++;
                              var570 = "宑瞅镺崺";
                              var753 = "寲瞐错崯";
                              var7 += this.by(var451, var7, 0, 11, "宝石镶嵌", "宝石镶嵌", 450);
                              var451 = var6++;
                              var570 = "宑瞅迱勖";
                              var753 = "寲瞐辒勃";
                              var7 += this.by(var451, var7, 0, 11, "宝石追加", "宝石追加", 450);
                              var238 = var2;
                           } else {
                              int var458 = var6++;
                              String var577 = "戝觷扟遖晢遬裉奱";
                              String var760 = "找觢戼遃昁遹袪奤";
                              var7 += this.by(var458, var7, 0, 11, "我要打造普通装备", "我要打造普通装备", 450);
                              var458 = var6++;
                              var577 = "戝觷卋绑祒儃";
                              var760 = "找觢匨组礱儖";
                              var7 += this.by(var458, var7, 0, 11, "我要升级神兵", "我要升级神兵", 450);
                              if (!this.za().l(2, 11)) {
                                 var458 = var6++;
                                 var577 = "粲烊祒儃";
                                 var760 = "糑烟礱儖";
                                 var7 += this.by(var458, var7, 0, 11, "精炼神兵", "精炼神兵", 450);
                              }

                              var458 = var6++;
                              var577 = "戝觷丆礨兹瞅";
                              var760 = "找觢乥礽儚瞐";
                              var7 += this.by(var458, var7, 0, 11, "我要上神兵石", "我要上神兵石", 450);
                              var458 = var6++;
                              var577 = "执覍呾戜烊妚瞅";
                              var760 = "扲觮呫承烟姹瞐";
                              var7 += this.by(var458, var7, 0, 11, "我要合成炼妖石", "我要合成炼妖石", 450);
                              var458 = var6++;
                              var577 = "笪瞅";
                              var760 = "等瞐";
                              var7 += this.by(var458, var7, 0, 11, "符石", "符石", 450);
                              var238 = var2;
                           }
                           break label582;
                        }

                        if (var3 == 16) {
                           String var278 = "戝亶乄邋丁倬";
                           var5 = "我什么都不做";
                           int var449 = var6++;
                           String var751 = "泔痴弼刮厃啇儒帕怍奮徏讹";
                           var7 += this.by(var449, var7, 0, 12, null, "治疗当前召唤兽并恢复忠诚", 450);
                           var449 = var6++;
                           var751 = "儞郤卍沷哺俢奻";
                           var7 += this.by(var449, var7, 0, 14, null, "全部医治和修复", 450);
                           var238 = var2;
                           break label582;
                        }

                        if (var3 == 32) {
                           String var277 = "找亣丧邞乢倹";
                           var5 = "我什么都不做";
                           int var448 = var6++;
                           String var750 = "执覍乶颛悳芽芡";
                           var7 += this.by(var448, var7, 0, 16, null, "我要一颗情花苗", 450);
                           var238 = var2;
                           break label582;
                        }

                        if (var3 == 36) {
                           String var276 = "找亣丧邞乢倹";
                           var5 = "我什么都不做";
                           int var447 = var6++;
                           String var569 = "执昣朓叠啒佬盲";
                           String var749 = "扲晀朆厃啇伏盧";
                           var7 += this.by(var447, var7, 0, 9, "我是来召唤你的", "我是来召唤你的", 450);
                           var238 = var2;
                           break label582;
                        }

                        if (var3 == 38) {
                           String var275 = "戝亶乄邋丁倬";
                           var5 = "我什么都不做";
                           int var442 = var6++;
                           String var744 = "礱儞嬉七拯肞";
                           var7 += this.by(var442, var7, 0, 18, null, "神兽学习技能", 450);
                           var442 = var6++;
                           var744 = "飒匱彟刻収扮祒儋";
                           var7 += this.by(var442, var7, 0, 19, null, "飞升当前参战神兽", 450);
                           if (this.za().l(2, 12)) {
                              var442 = var6++;
                              var744 = "找杪礱儞磡爤C扲朊持礱儞";
                              var7 += this.by(var442, var7, 0, 67, null, "我有神兽碎片,我来换神兽", 450);
                              var238 = var2;
                           } else {
                              var442 = var6++;
                              var744 = "执覍呾戜厚唨儋";
                              var7 += this.by(var442, var7, 0, 20, null, "我要合成召唤兽", 450);
                              var442 = var6++;
                              var744 = "扲觮帘卹弰刢厡扷厏啋儞";
                              var7 += this.by(var442, var7, 0, 21, null, "我要幻化当前参战召唤兽", 450);
                              var238 = var2;
                           }
                           break label582;
                        }

                        if (var3 == 44) {
                           String var242 = "戝亶乄邋丁倬";
                           var5 = "我什么都不做";
                           int var298 = var6++;
                           String var600 = "輏異弰刢厏啋儞";
                           var7 += this.by(var298, var7, 0, 22, null, "转生当前召唤兽", 450);
                           var298 = var6++;
                           var600 = "烏匚弥剁厚唨儋";
                           var7 += this.by(var298, var7, 0, 23, null, "点化当前召唤兽", 450);
                           var298 = var6++;
                           var600 = "呌瀚弰刢厏啋儞";
                           var7 += this.by(var298, var7, 0, 24, null, "启灵当前召唤兽", 450);
                           var298 = var6++;
                           var600 = "炵占彟刻坜髧";
                           var7 += this.by(var298, var7, 0, 25, null, "点化当前坐骑", 450);
                           if (this.za().gameMount) {
                              var298 = var6++;
                              var600 = "扲觮醮堾乣剟价圿髲";
                              var7 += this.by(var298, var7, 0, 68, null, "我要重塑一到五坐骑", 450);
                              var238 = var2;
                              break label582;
                           }
                        } else {
                           if (var3 == 47) {
                              String var274 = "戝亶乄邋丁倬";
                              var5 = "我什么都不做";
                              int var441 = var6++;
                              String var743 = "扲嶝倹夒以較畼冩奤";
                              var7 += this.by(var441, var7, 0, 26, null, "我已做好了转生准备", 450);
                              var238 = var2;
                              break label582;
                           }

                           if (var3 == 48) {
                              String var273 = "戝亶乄邋丁倬";
                              var5 = "我什么都不做";
                              int var440 = var6++;
                              String var742 = "找悐較持禢斬";
                              var7 += this.by(var440, var7, 0, 27, null, "我想转换种族", 450);
                              var238 = var2;
                              break label582;
                           }

                           if (var3 == 54) {
                              String var243 = "戝亶乄邋丁倬";
                              var5 = "我什么都不做";
                              Class6 var244;
                              if (this.za().l(2, 3)) {
                                 int var303 = var6++;
                                 String var480 = "找觢戼遃昁遹袪奤";
                                 String var605 = "戝觷扟遖晢遬裉奱";
                                 var7 += this.by(var303, var7, 0, 11, "我要打造普通装备", "我要打造普通装备", 450);
                                 var303 = var6++;
                                 var480 = "戼遃^RBR[组袪奤";
                                 var605 = "扟遖=G!G8绑裉奱";
                                 var7 += this.by(var303, var7, 0, 11, "打造11-14级装备", "打造11-14级装备", 450);
                                 var244 = this;
                              } else {
                                 int var305 = var6++;
                                 String var482 = "戼遃^RBRY组袪奤";
                                 String var607 = "扟遖=G!G:绑裉奱";
                                 var7 += this.by(var305, var7, 0, 11, "打造11-16级装备", "打造11-16级装备", 450);
                                 var244 = this;
                              }

                              if (var244.za().gameBaby) {
                                 int var306 = var6++;
                                 String var483 = "戼遃嬆嬳袪奤";
                                 String var608 = "扟遖孥嬦裉奱";
                                 var7 += this.by(var306, var7, 0, 11, "打造孩子装备", "打造孩子装备", 450);
                                 var238 = var2;
                                 break label582;
                              }
                           } else {
                              if (var3 == 61) {
                                 String var272 = "找亣丧邞乢倹";
                                 var5 = "我什么都不做";
                                 int var436 = var6++;
                                 String var565 = "戝朓抩呻収勖帢扮";
                                 String var738 = "找朆拊呮厭勃幁扻";
                                 var7 += this.by(var436, var7, 0, 28, "我来报名参加帮战", "我来报名参加帮战", 450);
                                 var436 = var6++;
                                 var565 = "戝觷収勖帢扮";
                                 var738 = "找觢厭勃幁扻";
                                 var7 += this.by(var436, var7, 0, 28, "我要参加帮战", "我要参加帮战", 450);
                                 var436 = var6++;
                                 var565 = "戝觷颊厠帢扮奚勇";
                                 var738 = "找觢飩厵幁扻夹勒";
                                 var7 += this.by(var436, var7, 0, 28, "我要领取帮战奖励", "我要领取帮战奖励", 450);
                                 var436 = var6++;
                                 Integer var568 = var3;
                                 var738 = "戝悅乼烏丐褉";
                                 var7 += this.by(var436, var7, 0, 1, var568, "我想买点东西", 450);
                                 var238 = var2;
                                 break label582;
                              }

                              if (var3 == 63) {
                                 String var271 = "找亣丧邞乢倹";
                                 var5 = "我什么都不做";
                                 int var434 = var6++;
                                 String var736 = "戝觷列庌帢浈 ^霌觷丌乜叠隰仨_";
                                 var7 += this.by(var434, var7, 0, 31, null, "我要创建帮派,(需要一个召集令)", 450);
                                 var434 = var6++;
                                 var736 = "勏儆幁浝";
                                 var7 += this.by(var434, var7, 0, 32, null, "加入帮派", 450);
                                 var238 = var2;
                                 break label582;
                              }

                              if (var3 == 64) {
                                 String var270 = "戝亶乄邋丁倬";
                                 var5 = "我什么都不做";
                                 int var433 = var6++;
                                 String var735 = "辴儆幁浝";
                                 var7 += this.by(var433, var7, 0, 33, null, "进入帮派", 450);
                                 var238 = var2;
                                 break label582;
                              }

                              if (var3 == 66) {
                                 String var269 = "戝亶乄邋丁倬";
                                 var5 = "我什么都不做";
                                 int var430 = var6++;
                                 String var562 = "找觢呧扳亶嘋";
                                 String var732 = "戝觷各扦仕嘞";
                                 var7 += this.by(var430, var7, 0, 11, "我要合成仙器", "我要合成仙器", 450);
                                 var430 = var6++;
                                 var562 = "找觢匨组亶嘋";
                                 var732 = "戝觷卋绑仕嘞";
                                 var7 += this.by(var430, var7, 0, 11, "我要升级仙器", "我要升级仙器", 450);
                                 var430 = var6++;
                                 var562 = "找觢浸烟亶嘋";
                                 var732 = "戝觷洛烊仕嘞";
                                 var7 += this.by(var430, var7, 0, 11, "我要洗炼仙器", "我要洗炼仙器", 450);
                                 var238 = var2;
                                 break label582;
                              }

                              if (var3 == 69) {
                                 String var268 = "找亣丧邞乢倹";
                                 var5 = "我什么都不做";
                                 int var425 = var6++;
                                 String var557 = "执覍垏具拒躧筐";
                                 String var727 = "扲觮垚儔拇軄筅";
                                 var7 += this.by(var425, var7, 0, 11, "我要培养护身符", "我要培养护身符", 450);
                                 var425 = var6++;
                                 var557 = "执覍醻铴拒躧筐";
                                 var727 = "扲觮醮钗拇軄筅";
                                 var7 += this.by(var425, var7, 0, 11, "我要重铸护身符", "我要重铸护身符", 450);
                                 var425 = var6++;
                                 var557 = "戝觷埵儍饼咷";
                                 var727 = "找觢垖儘餟咢";
                                 var7 += this.by(var425, var7, 0, 11, "我要培养饰品", "我要培养饰品", 450);
                                 var425 = var6++;
                                 var557 = "戝觷釁钎饼咷";
                                 var727 = "找觢醢钛餟咢";
                                 var7 += this.by(var425, var7, 0, 11, "我要重铸饰品", "我要重铸饰品", 450);
                                 var425 = var6++;
                                 var557 = "垏具弟智瞅";
                                 var727 = "垚儔弊昙瞐";
                                 var7 += this.by(var425, var7, 0, 11, "培养彩晶石", "培养彩晶石", 450);
                                 var238 = var2;
                                 break label582;
                              }

                              if (var3 == 31) {
                                 String var267 = "戝亶乄邋丁倬";
                                 var5 = "我什么都不做";
                                 int var422 = var6++;
                                 String var724 = "找觢厹嚽爆咢";
                                 var7 += this.by(var422, var7, 0, 34, null, "我要取回物品", 450);
                                 var422 = var6++;
                                 var724 = "戝觷兴弥牥咷";
                                 var7 += this.by(var422, var7, 0, 35, null, "我要典当物品", 450);
                                 var422 = var6++;
                                 var724 = "扲觮儛弼厏啋儞";
                                 var7 += this.by(var422, var7, 0, 36, null, "我要典当召唤兽", 450);
                                 var238 = var2;
                                 break label582;
                              }

                              if (var3 == 33) {
                                 String var266 = "戝亶乄邋丁倬";
                                 var5 = "我什么都不做";
                                 int var419 = var6++;
                                 String var721 = "找朆枊讁宫啍醾铒";
                                 var7 += this.by(var419, var7, 0, 37, null, "我来查询寄售金钱", 450);
                                 var419 = var6++;
                                 var721 = "戝觷叚册寈啘針铇";
                                 var7 += this.by(var419, var7, 0, 38, null, "我要取出寄售金钱", 450);
                                 var419 = var6++;
                                 var721 = "找觢嬷烚铞K_M^F戤纎赖J";
                                 var7 += this.by(var419, var7, 0, 39, null, "我要存点钱(0.1%手续费)", 450);
                                 var238 = var2;
                                 break label582;
                              }

                              if (var3 == 130) {
                                 String var265 = "戝亶乄邋丁倬";
                                 var5 = "我什么都不做";
                                 int var418 = var6++;
                                 String var720 = "找觢飩儘乯义嬆嬳";
                                 var7 += this.by(var418, var7, 0, 66, null, "我要领养一个孩子", 450);
                                 var238 = var2;
                                 break label582;
                              }

                              if (var3 == 1001) {
                                 int var414 = var6++;
                                 String var553 = "戝觷迗儓戔坌";
                                 String var716 = "找觢辴儆扷坙";
                                 var7 += this.by(var414, var7, 0, 28, "我要进入战场", "我要进入战场", 450);
                                 var414 = var6++;
                                 var553 = "执覍辭兩骮扇捧戔购";
                                 var716 = "扲觮辸儊骻戤捲扷贸";
                                 var7 += this.by(var414, var7, 0, 28, "我要进入高手挑战赛", "我要进入高手挑战赛", 450);
                                 var414 = var6++;
                                 var553 = "囒剆萩坆";
                                 var716 = "嚱剓葊坓";
                                 var7 += this.by(var414, var7, 0, 28, "回到营地", "回到营地", 450);
                                 var414 = var6++;
                                 var553 = "戝觷脽种帢扮";
                                 var716 = "找觢腞秘幁扻";
                                 var7 += this.by(var414, var7, 0, 28, "我要脱离帮战", "我要脱离帮战", 450);
                                 var238 = var2;
                                 break label582;
                              }

                              if (var3 == 1003) {
                                 int var409 = var6++;
                                 String var548 = "剫殤對匆乇丐";
                                 String var711 = "刈殱屮匓两丅";
                                 var7 += this.by(var409, var7, 0, 9, "剧毒封印之书", "剧毒封印之书", 450);
                                 var409 = var6++;
                                 var548 = "寞准對匆乇丐";
                                 var711 = "宽凓屮匓两丅";
                                 var7 += this.by(var409, var7, 0, 9, "寒冰封印之书", "寒冰封印之书", 450);
                                 var409 = var6++;
                                 var548 = "夥隁對匆乇丐";
                                 var711 = "奆隔屮匓两丅";
                                 var7 += this.by(var409, var7, 0, 9, "天雷封印之书", "天雷封印之书", 450);
                                 var409 = var6++;
                                 var548 = "徭刧對匆乇丐";
                                 var711 = "忎刲屮匓两丅";
                                 var7 += this.by(var409, var7, 0, 9, "御剑封印之书", "御剑封印之书", 450);
                                 var409 = var6++;
                                 var548 = "狎勭對匆乇丐";
                                 var711 = "犭勸屮匓两丅";
                                 var7 += this.by(var409, var7, 0, 9, "狂力封印之书", "狂力封印之书", 450);
                                 var238 = var2;
                                 break label582;
                              }

                              if (var3 == 1004) {
                                 int var404 = var6++;
                                 String var543 = "冩瀃叨匁";
                                 String var706 = "凊瀖压匔";
                                 var7 += this.by(var404, var7, 0, 9, "冥灵古卷", "冥灵古卷", 450);
                                 var404 = var6++;
                                 var543 = "玾玧叨匁";
                                 var706 = "珝玲压匔";
                                 var7 += this.by(var404, var7, 0, 9, "玲珑古卷", "玲珑古卷", 450);
                                 var404 = var6++;
                                 var543 = "巤羊叨匁";
                                 var706 = "嶇羟压匔";
                                 var7 += this.by(var404, var7, 0, 9, "巨翼古卷", "巨翼古卷", 450);
                                 var404 = var6++;
                                 var543 = "葧苐叨匁";
                                 var706 = "萄苅压匔";
                                 var7 += this.by(var404, var7, 0, 9, "葫芦古卷", "葫芦古卷", 450);
                                 var404 = var6++;
                                 var543 = "妎慹叨匁";
                                 var706 = "姭慬压匔";
                                 var7 += this.by(var404, var7, 0, 9, "如意古卷", "如意古卷", 450);
                                 var238 = var2;
                                 break label582;
                              }

                              if (var3 == 1005) {
                                 int var399 = var6++;
                                 String var538 = "苁冭叨匁";
                                 String var701 = "芢冸压匔";
                                 var7 += this.by(var399, var7, 0, 9, "苍凛古卷", "苍凛古卷", 450);
                                 var399 = var6++;
                                 var538 = "赡烸叨匁";
                                 var701 = "贂热压匔";
                                 var7 += this.by(var399, var7, 0, 9, "赭炎古卷", "赭炎古卷", 450);
                                 var399 = var6++;
                                 var538 = "彟廁叨匁";
                                 var701 = "弼廔压匔";
                                 var7 += this.by(var399, var7, 0, 9, "当康古卷", "当康古卷", 450);
                                 var399 = var6++;
                                 var538 = "杲齖叨匁";
                                 var701 = "朑齃压匔";
                                 var7 += this.by(var399, var7, 0, 9, "松鼠古卷", "松鼠古卷", 450);
                                 var399 = var6++;
                                 var538 = "使鞅尃伉叨匁";
                                 var701 = "伜鞐屠伜压匔";
                                 var7 += this.by(var399, var7, 0, 9, "佳音小使古卷", "佳音小使古卷", 450);
                                 var238 = var2;
                                 break label582;
                              }

                              if (var3 == 1006) {
                                 int var398 = var6++;
                                 String var700 = "执覍嚨镳寿";
                                 var7 += this.by(var398, var7, 0, 3, null, "我要回长安", 450);
                                 var238 = var2;
                                 break label582;
                              }

                              if (var3 == 1100) {
                                 int var396 = var6++;
                                 String var698 = "扲觮澣浔儲夹硢";
                                 var7 += this.by(var396, var7, 0, 41, null, "我要激活兑奖码", 450);
                                 var396 = var6++;
                                 String var537 = "儧据弟智瞅";
                                 var698 = "儲挍弊昙瞐";
                                 var7 += this.by(var396, var7, 0, 9, "兑换彩晶石", "兑换彩晶石", 450);
                                 var238 = var2;
                                 break label582;
                              }

                              if (var3 == 122) {
                                 String var264 = "戝亶乄邋丁倬";
                                 var5 = "我什么都不做";
                                 int var394 = var6++;
                                 String var696 = "找觢拒夵";
                                 var7 += this.by(var394, var7, 0, 42, null, "我要抽奖", 450);
                                 var394 = var6++;
                                 var696 = "戝觷抙效劓纟牥咷";
                                 var7 += this.by(var394, var7, 0, 43, null, "我要投放功绩物品", 450);
                                 var238 = var2;
                                 break label582;
                              }

                              if (var3 == 126) {
                                 String var263 = "找亣丧邞乢倹";
                                 var5 = "我什么都不做";
                                 int var391 = var6++;
                                 String var534 = "戝觷収勖永阰夫佬";
                                 String var693 = "找觢厭勃汛阥奈佹";
                                 var7 += this.by(var391, var7, 0, 28, "我要参加水陆大会", "我要参加水陆大会", 450);
                                 var391 = var6++;
                                 var534 = "颊厠永阰夫佬奚勇";
                                 var693 = "飩厵汛阥奈佹夹勒";
                                 var7 += this.by(var391, var7, 0, 28, "领取水陆大会奖励", "领取水陆大会奖励", 450);
                                 var391 = var6++;
                                 Integer var536 = var3;
                                 var693 = "戝悅乼烏丐褉";
                                 var7 += this.by(var391, var7, 0, 1, var536, "我想买点东西", 450);
                                 var238 = var2;
                                 break label582;
                              }

                              if (var3 == 127) {
                                 String var262 = "找亣丧邞乢倹";
                                 var5 = "我什么都不做";
                                 int var390 = var6++;
                                 Integer var533 = var3;
                                 String var692 = "戝悅乼烏丐褉";
                                 var7 += this.by(var390, var7, 0, 1, var533, "我想买点东西", 450);
                                 var238 = var2;
                                 break label582;
                              }

                              if (var3 == 128) {
                                 int var389 = var6++;
                                 String var691 = "找觢乤捲扷丅";
                                 var7 += this.by(var389, var7, 0, 44, null, "我要下挑战书", 450);
                                 var238 = var2;
                                 break label582;
                              }

                              if (var3 == 129) {
                                 String var261 = "戝亶乄邋丁倬";
                                 var5 = "我什么都不做";
                                 int var384 = var6++;
                                 String var686 = "扲觮儲挍瀖侁偟";
                                 var7 += this.by(var384, var7, 0, 45, null, "我要兑换灵修值", 450);
                                 var384 = var6++;
                                 var686 = "执覍敀彙珿笪ｾ玅筐轠筐彙ｿ";
                                 var7 += this.by(var384, var7, 0, 46, null, "我要收录玉符（玉符转符录）", 450);
                                 var384 = var6++;
                                 var686 = "扲觮枆睤嶑杦筅强ｫ等弶較珪等ｪ";
                                 var7 += this.by(var384, var7, 0, 47, null, "我要查看已有符录（符录转玉符）", 450);
                                 var384 = var6++;
                                 Integer var532 = var3;
                                 var686 = "戝悅乼烏丐褉";
                                 var7 += this.by(var384, var7, 0, 1, var532, "我想买点东西", 450);
                                 var384 = var6++;
                                 var686 = "扲觮嚽锐寪";
                                 var7 += this.by(var384, var7, 0, 3, null, "我要回长安", 450);
                                 var238 = var2;
                                 break label582;
                              }

                              if (var3 == 132) {
                                 String var260 = "刻逘罾缄ｺ戝辮昣击凊奱万呑";
                                 var5 = "前途缈缈，我还是再准备下吧";
                                 var238 = var2;
                                 break label582;
                              }

                              if (var3 == 133) {
                                 String var259 = "找亣丧邞乢倹";
                                 var5 = "我什么都不做";
                                 int var381 = var6++;
                                 String var529 = "幸^9N4磸牋_";
                                 String var683 = "帛KZ[W磭爨J";
                                 var7 += this.by(var381, var7, 0, 9, "年(588碎片)", "年(588碎片)", 450);
                                 var381 = var6++;
                                 var529 = "男乛仕^8N4磸牋_";
                                 var683 = "畔乎亶K[[W磭爨J";
                                 var7 += this.by(var381, var7, 0, 9, "画中仙(488碎片)", "画中仙(488碎片)", 450);
                                 var381 = var6++;
                                 var529 = "瘋泱^8@4磸牋_";
                                 var683 = "瘞沒K[UW磭爨J";
                                 var7 += this.by(var381, var7, 0, 9, "白泽(468碎片)", "白泽(468碎片)", 450);
                                 var238 = var2;
                                 break label582;
                              }

                              if (var3 == 134) {
                                 String var258 = "戝亶乄邋丁倬";
                                 var5 = "我什么都不做";
                                 int var374 = var6++;
                                 String var522 = "鿺騃K^[W磭爨J";
                                 String var676 = "鿯驠^=N4磸牋_";
                                 var7 += this.by(var374, var7, 0, 9, "龙马(188碎片)", "龙马(188碎片)", 450);
                                 var374 = var6++;
                                 var522 = "畘盁婻嬿K^[W磭爨J";
                                 var676 = "畍皢婮孜^=N4磸牋_";
                                 var7 += this.by(var374, var7, 0, 9, "画皮娘子(188碎片)", "画皮娘子(188碎片)", 450);
                                 var374 = var6++;
                                 var522 = "嬷隯晭珤K^[W磭爨J";
                                 var676 = "嬢雌晸率^=N4磸牋_";
                                 var7 += this.by(var374, var7, 0, 9, "孔雀明王(188碎片)", "孔雀明王(188碎片)", 450);
                                 var374 = var6++;
                                 var522 = "却凊鿺呴K][W磭爨J";
                                 var676 = "卡冩鿯吗^>N4磸牋_";
                                 var7 += this.by(var374, var7, 0, 9, "北冥龙君(288碎片)", "北冥龙君(288碎片)", 450);
                                 var374 = var6++;
                                 var522 = "嬼柮K][W磭爨J";
                                 var676 = "嬩枍^>N4磸牋_";
                                 var7 += this.by(var374, var7, 0, 9, "孟极(288碎片)", "孟极(288碎片)", 450);
                                 var374 = var6++;
                                 var522 = "锿苞汗杧K\\[W磭爨J";
                                 var676 = "锪芽求朄^?N4磸牋_";
                                 var7 += this.by(var374, var7, 0, 9, "镜花水月(388碎片)", "镜花水月(388碎片)", 450);
                                 var374 = var6++;
                                 var522 = "姺鞜桝夜K\\[W磭爨J";
                                 var676 = "姯響案奿^?N4磸牋_";
                                 var7 += this.by(var374, var7, 0, 9, "妙音栾女(388碎片)", "妙音栾女(388碎片)", 450);
                                 var238 = var2;
                                 break label582;
                              }

                              if (var3 == 137) {
                                 String var257 = "儠斉很丿ｯ杦仨儧閉";
                                 var5 = "元旦快乐，有事先闪";
                                 int var373 = var6++;
                                 String var675 = "执杩募佬乶孹丽劗ｾ霌掦亨乶並爟响ｿ";
                                 var7 += this.by(var373, var7, 0, 48, null, "我来助你一孵之力（需提交一个物品）", 450);
                                 var238 = var2;
                                 break label582;
                              }

                              if (var3 == 1106) {
                                 int var370 = var6++;
                                 String var519 = "厡勏禮斠贸";
                                 String var672 = "厴劬离旃购";
                                 var7 += this.by(var370, var7, 0, 28, "参加种族赛", "参加种族赛", 450);
                                 var370 = var6++;
                                 var519 = "乣镁飥厹禮斠贸夹勒";
                                 var672 = "乶锢飰叚离旃购奚勇";
                                 var7 += this.by(var370, var7, 0, 28, "一键领取种族赛奖励", "一键领取种族赛奖励", 450);
                                 var370 = var6++;
                                 Integer var521 = var3;
                                 var672 = "找悐丟烚乳褜";
                                 var7 += this.by(var370, var7, 0, 1, var521, "我想买点东西", 450);
                                 var238 = var2;
                                 break label582;
                              }

                              if (var3 == 515) {
                                 int var367 = var6++;
                                 String var516 = "厴劬撴叼购";
                                 String var669 = "厡勏撡原贸";
                                 var7 += this.by(var367, var7, 0, 28, "参加擂台赛", "参加擂台赛", 450);
                                 var367 = var6++;
                                 var516 = "乶锢飰叚撴叼购奚勇";
                                 var669 = "乣镁飥厹撡原贸夹勒";
                                 var7 += this.by(var367, var7, 0, 28, "一键领取擂台赛奖励", "一键领取擂台赛奖励", 450);
                                 var367 = var6++;
                                 Integer var518 = var3;
                                 var669 = "戝悅乼烏丐褉";
                                 var7 += this.by(var367, var7, 0, 1, var518, "我想买点东西", 450);
                                 var238 = var2;
                                 break label582;
                              }

                              if (var3 == 520) {
                                 int var366 = var6++;
                                 String var515 = "找觢辴蠯串畼串欘捾扻";
                                 String var668 = "戝觷迗蠺乑畩乑欍挝扮";
                                 var7 += this.by(var366, var7, 0, 28, "我要进行九生九死挑战", "我要进行九生九死挑战", 450);
                                 var238 = var2;
                                 break label582;
                              }

                              if (var3 == 85) {
                                 int var363 = var6++;
                                 String var665 = "扲觮戰遏O搷拧寲瞐";
                                 var7 += this.by(var363, var7, 0, 49, null, "我要打造,摘抄宝石", 450);
                                 var363 = var6++;
                                 var665 = "执覍呾戜寫矿笿";
                                 var7 += this.by(var363, var7, 0, 50, null, "我要合成宝石等", 450);
                                 var363 = var6++;
                                 Integer var514 = var3;
                                 var665 = "找悐丟烚乳褜";
                                 var7 += this.by(var363, var7, 0, 1, var514, "我想买点东西", 450);
                                 var238 = var2;
                                 break label582;
                              }

                              if (var3 == 800) {
                                 String var256 = "戝亶乄邋丁倬";
                                 var5 = "我什么都不做";
                                 int var362 = var6++;
                                 String var513 = "找觢厭勃趇杮耻贸";
                                 String var664 = "戝觷収勖跤杻聘购";
                                 var7 += this.by(var362, var7, 0, 28, "我要参加跨服联赛", "我要参加跨服联赛", 450);
                                 var238 = var2;
                                 break label582;
                              }

                              if (var3 == 530) {
                                 String var255 = "找亣丧邞乢倹";
                                 var5 = "我什么都不做";
                                 int var361 = var6++;
                                 String var512 = "执杩乼亨坆煒晩乇鬴";
                                 String var663 = "扲朊乩介坓焱晼两鬡";
                                 var7 += this.by(var361, var7, 0, 28, "我来上交地煞星之魂", "我来上交地煞星之魂", 450);
                                 var238 = var2;
                                 break label582;
                              }

                              if (var3 == 605) {
                                 String var254 = "戝亶乄邋丁倬";
                                 var5 = "我什么都不做";
                                 int var358 = var6++;
                                 String var509 = "扲觮嚽剟V_S帛刮";
                                 String var660 = "执覍嚨刼C<F幸刻";
                                 var7 += this.by(var358, var7, 0, 28, "我要回到500年前", "我要回到500年前", 450);
                                 var358 = var6++;
                                 var509 = "飩厵奈閚奆寈夹勒";
                                 var660 = "颊厠夫閏夥寝奚勇";
                                 var7 += this.by(var358, var7, 0, 28, "领取大闹天宫奖励", "领取大闹天宫奖励", 450);
                                 var358 = var6++;
                                 Integer var511 = var3;
                                 var660 = "找悐丟烚乳褜";
                                 var7 += this.by(var358, var7, 0, 1, var511, "我想买点东西", 450);
                                 var238 = var2;
                                 break label582;
                              }

                              if (var3 == 42 || var3 == 43) {
                                 String var253 = "戝亶乄邋丁倬";
                                 var5 = "我什么都不做";
                                 int var357 = var6++;
                                 String var508 = "找朆乥仇乥厇寲篒";
                                 String var659 = "戝朓丆仒丆厒宑篇";
                                 var7 += this.by(var357, var7, 0, 28, "我来上交上古宝箱", "我来上交上古宝箱", 450);
                                 var238 = var2;
                                 break label582;
                              }

                              if (var3 == 103) {
                                 String var252 = "找亣丧邞乢倹";
                                 var5 = "我什么都不做";
                                 int var356 = var6++;
                                 String var507 = "执覍厴觎乼叨扮圶盲飂醱";
                                 String var658 = "扲觮厡覭乩压扻坕盧颡醤";
                                 var7 += this.by(var356, var7, 0, 28, "我要参观上古战场的风采", "我要参观上古战场的风采", 450);
                                 var238 = var2;
                                 break label582;
                              }

                              if (var3 == 104) {
                                 String var251 = "戝亶乄邋丁倬";
                                 var5 = "我什么都不做";
                                 int var355 = var6++;
                                 String var506 = "遢找嚽呡旚葊坓";
                                 String var657 = "遷戝嚨吂族萩坆";
                                 var7 += this.by(var355, var7, 0, 28, "送我回后方营地", "送我回后方营地", 450);
                                 var238 = var2;
                                 break label582;
                              }

                              if (var3 == 105) {
                                 int var354 = var6++;
                                 String var656 = "礱勸勏换";
                                 var7 += this.by(var354, var7, 0, 51, null, "神力加持", 450);
                                 var238 = var2;
                                 break label582;
                              }

                              if (var3 == 2021) {
                                 int var353 = var6++;
                                 String var505 = "卋绑帢浈筅绑";
                                 String var655 = "匨组幁浝符组";
                                 var7 += this.by(var353, var7, 0, 28, "升级帮派等级", "升级帮派等级", 450);
                                 var238 = var2;
                                 break label582;
                              }

                              if (var3 == 2024) {
                                 int var352 = var6++;
                                 String var654 = "戝觷揜仒杜旯";
                                 var7 += this.by(var352, var7, 0, 52, null, "我要提交材料", 450);
                                 var238 = var2;
                                 break label582;
                              }

                              if (var3 == 2026) {
                                 int var350 = var6++;
                                 Integer var503 = 1;
                                 String var652 = "寧拇屠扳侁烟";
                                 var7 += this.by(var350, var7, 0, 53, var503, "守护小成修炼", 450);
                                 var350 = var6++;
                                 var503 = 2;
                                 var652 = "宄拒夫扦俢烊";
                                 var7 += this.by(var350, var7, 0, 53, var503, "守护大成修炼", 450);
                                 var238 = var2;
                                 break label582;
                              }

                              if (var3 == 89) {
                                 int var348 = var6++;
                                 String var650 = "扲悜亭伏辺挍烚纾珪";
                                 var7 += this.by(var348, var7, 0, 54, null, "我想从你这换点绑玉", 450);
                                 var348 = var6++;
                                 Integer var502 = var3;
                                 var650 = "戝悅乼烏丐褉";
                                 var7 += this.by(var348, var7, 0, 1, var502, "我想买点东西", 450);
                                 var238 = var2;
                                 break label582;
                              }

                              if (var3 == 2027) {
                                 int var347 = var6++;
                                 String var649 = "扲觮厡勏奊检嶦岟贸";
                                 var7 += this.by(var347, var7, 0, 55, null, "我要参加天梯巅峰赛", 450);
                                 var238 = var2;
                                 break label582;
                              }

                              if (var3 == 2028) {
                                 String var250 = "执炵镯亊ｺ戝寨劗杜刼ｺ丁攔少讣";
                                 var5 = "我点错了，我实力未到，不敢尝试";
                                 int var346 = var6++;
                                 String var648 = "找觢捾扻论烟帔壠";
                                 var7 += this.by(var346, var7, 0, 56, null, "我要挑战试炼幻境", 450);
                                 var238 = var2;
                                 break label582;
                              }

                              if (var3 == 2029) {
                                 String var249 = "戝亶乄邋丁倬";
                                 var5 = "我什么都不做";
                                 int var344 = var6++;
                                 String var646 = "扲觮乩枞駺";
                                 var7 += this.by(var344, var7, 0, 57, null, "我要上柱香", 450);
                                 var344 = var6++;
                                 Integer var501 = var3;
                                 var646 = "戝悅乼烏丐褉";
                                 var7 += this.by(var344, var7, 0, 1, var501, "我想买点东西", 450);
                                 var238 = var2;
                                 break label582;
                              }

                              if (var3 == 2030) {
                                 String var248 = "找亣丧邞乢倹";
                                 var5 = "我什么都不做";
                                 int var341 = var6++;
                                 String var498 = "执覍厴劬契乽旡";
                                 String var643 = "扲觮厡勏奄丞旴";
                                 var7 += this.by(var341, var7, 0, 28, "我要参加大乱斗", "我要参加大乱斗", 450);
                                 var341 = var6++;
                                 var498 = "飰叚契乽旡吏鹗奚勇";
                                 var643 = "飥厹奄丞旴呬鹂夹勒";
                                 var7 += this.by(var341, var7, 0, 28, "领取大乱斗吃鸡奖励", "领取大乱斗吃鸡奖励", 450);
                                 var341 = var6++;
                                 Integer var500 = var3;
                                 var643 = "戝悅乼烏丐褉";
                                 var7 += this.by(var341, var7, 0, 1, var500, "我想买点东西", 450);
                                 var238 = var2;
                                 break label582;
                              }

                              if (var3 == 59998) {
                                 int var307 = var6++;
                                 Integer var484 = 5;
                                 String var609 = "朡赈廴";
                                 var7 += this.by(var307, var7, 0, 1, var484, "杂货店", 450);
                                 var307 = var6++;
                                 var484 = 9;
                                 var609 = "荣廡";
                                 var7 += this.by(var307, var7, 0, 1, var484, "药店", 450);
                                 var307 = var6++;
                                 var484 = 14;
                                 var609 = "拯肞唩廴";
                                 var7 += this.by(var307, var7, 0, 1, var484, "技能商店", 450);
                                 var307 = var6++;
                                 var484 = 15;
                                 var609 = "冉乏啊廡";
                                 var7 += this.by(var307, var7, 0, 1, var484, "内丹商店", 450);
                                 if (!this.za().l(2, 3)) {
                                    var307 = var6++;
                                    var484 = 37;
                                    var609 = "等旤唩廴";
                                    var7 += this.by(var307, var7, 0, 1, var484, "符文商店", 450);
                                    var307 = var6++;
                                    var484 = -71;
                                    var609 = "醧帍嚨攺唰";
                                    var7 += this.by(var307, var7, 0, 1, var484, "金币回收商", 450);
                                    var307 = var6++;
                                    var484 = -89;
                                    var609 = "纲珦嚽教唥";
                                    var7 += this.by(var307, var7, 0, 1, var484, "绑玉回收商", 450);
                                    var238 = var2;
                                    break label582;
                                 }
                              } else if (var3 == 59990) {
                                 int var314 = var6++;
                                 String var491 = "戝觷扟遖晢遬裉奱";
                                 String var616 = "找觢戼遃昁遹袪奤";
                                 var7 += this.by(var314, var7, 0, 11, "我要打造普通装备", "我要打造普通装备", 450);
                                 var314 = var6++;
                                 var491 = "戝觷卋绑祒儃";
                                 var616 = "找觢匨组礱儖";
                                 var7 += this.by(var314, var7, 0, 11, "我要升级神兵", "我要升级神兵", 450);
                                 var314 = var6++;
                                 var491 = "戝觷丆礨兹瞅";
                                 var616 = "找觢乥礽儚瞐";
                                 var7 += this.by(var314, var7, 0, 11, "我要上神兵石", "我要上神兵石", 450);
                                 if (!this.za().l(2, 11)) {
                                    var314 = var6++;
                                    var491 = "粲烊祒儃";
                                    var616 = "糑烟礱儖";
                                    var7 += this.by(var314, var7, 0, 11, "精炼神兵", "精炼神兵", 450);
                                    var238 = var2;
                                    break label582;
                                 }
                              } else if (var3 == -44) {
                                 Class6 var245;
                                 if (this.za().l(2, 3)) {
                                    int var318 = var6++;
                                    String var620 = "輚甓弥剁厚唨儋";
                                    var7 += this.by(var318, var7, 0, 22, null, "转生当前召唤兽", 450);
                                    var318 = var6++;
                                    var620 = "扲觮呫承厏啋儞";
                                    var7 += this.by(var318, var7, 0, 20, null, "我要合成召唤兽", 450);
                                    var245 = this;
                                 } else if (this.za().l(2, 12)) {
                                    int var320 = var6++;
                                    String var622 = "輚甓弥剁厚唨儋";
                                    var7 += this.by(var320, var7, 0, 22, null, "转生当前召唤兽", 450);
                                    var320 = var6++;
                                    var622 = "烚卹弰刢厏啋儞";
                                    var7 += this.by(var320, var7, 0, 23, null, "点化当前召唤兽", 450);
                                    var320 = var6++;
                                    var622 = "呙灹弥剁厚唨儋";
                                    var7 += this.by(var320, var7, 0, 24, null, "启灵当前召唤兽", 450);
                                    var320 = var6++;
                                    var622 = "烖卵弼刮圿髲";
                                    var7 += this.by(var320, var7, 0, 25, null, "点化当前坐骑", 450);
                                    var320 = var6++;
                                    var622 = "祒儋孪世抌肋";
                                    var7 += this.by(var320, var7, 0, 18, null, "神兽学习技能", 450);
                                    var320 = var6++;
                                    var622 = "颱匤弼刮厭扻礱儞";
                                    var7 += this.by(var320, var7, 0, 19, null, "飞升当前参战神兽", 450);
                                    var320 = var6++;
                                    var622 = "戝板祒儋碂爱 执杩挔祒儋";
                                    var7 += this.by(var320, var7, 0, 67, null, "我有神兽碎片,我来换神兽", 450);
                                    var245 = this;
                                 } else {
                                    int var327 = var6++;
                                    String var629 = "輏異弰刢厏啋儞";
                                    var7 += this.by(var327, var7, 0, 22, null, "转生当前召唤兽", 450);
                                    var327 = var6++;
                                    var629 = "烏匚弥剁厚唨儋";
                                    var7 += this.by(var327, var7, 0, 23, null, "点化当前召唤兽", 450);
                                    var327 = var6++;
                                    var629 = "呌瀚弰刢厏啋儞";
                                    var7 += this.by(var327, var7, 0, 24, null, "启灵当前召唤兽", 450);
                                    var327 = var6++;
                                    var629 = "炵占彟刻坜髧";
                                    var7 += this.by(var327, var7, 0, 25, null, "点化当前坐骑", 450);
                                    var327 = var6++;
                                    var629 = "礱儞嬉七拯肞";
                                    var7 += this.by(var327, var7, 0, 18, null, "神兽学习技能", 450);
                                    var327 = var6++;
                                    var629 = "飒匱彟刻収扮祒儋";
                                    var7 += this.by(var327, var7, 0, 19, null, "飞升当前参战神兽", 450);
                                    var327 = var6++;
                                    var629 = "扲觮呫承厏啋儞";
                                    var7 += this.by(var327, var7, 0, 20, null, "我要合成召唤兽", 450);
                                    var327 = var6++;
                                    var629 = "执覍帍匚弥剁厴戔厚唨儋";
                                    var7 += this.by(var327, var7, 0, 21, null, "我要幻化当前参战召唤兽", 450);
                                    var245 = this;
                                 }

                                 if (var245.za().gameMount) {
                                    int var335 = var6++;
                                    String var637 = "扲觮醮堾乣剟价圿髲";
                                    var7 += this.by(var335, var7, 0, 68, null, "我要重塑一到五坐骑", 450);
                                    var238 = var2;
                                    break label582;
                                 }
                              } else {
                                 if (var3 == -47) {
                                    int var339 = var6++;
                                    String var641 = "戝悅轠挔私方";
                                    var7 += this.by(var339, var7, 0, 27, null, "我想转换种族", 450);
                                    var339 = var6++;
                                    var641 = "扲嶝倹夒以較畼冩奤";
                                    var7 += this.by(var339, var7, 0, 26, null, "我已做好了转生准备", 450);
                                    var238 = var2;
                                    break label582;
                                 }

                                 if (var3 == 155) {
                                    List var8 = this.afx.baseView.rs();
                                    Activity var9 = null;
                                    int var10;
                                    int var246 = var10 = 0;

                                    Activity var247;
                                    while (true) {
                                       if (var246 >= var8.size()) {
                                          var247 = var9;
                                          break;
                                       }

                                       com.xy.i.Class21 var11;
                                       Activity var12 = (var11 = (com.xy.i.Class21)var8.get(var10)).il() > 100 && var11.il() < 200
                                          ? this.yt().cd(var11.il())
                                          : null;
                                       if (var12 != null && var12.getModelId() == 3) {
                                          var247 = var9 = var12;
                                          break;
                                       }

                                       var246 = ++var10;
                                    }

                                    if (var247 != null) {
                                       int var336 = var6++;
                                       Integer var495 = var9.getId();
                                       String var638 = "戝觷迗儓毘欐夫佬圶坆";
                                       var7 += this.by(var336, var7, 0, 69, var495, "我要进入比武大会场地", 450);
                                       var336 = var6++;
                                       var495 = var9.getId();
                                       var638 = "找觢拊呮厭勃殻欅奈佹";
                                       var7 += this.by(var336, var7, 0, 70, var495, "我要报名参加比武大会", 450);
                                       var336 = var6++;
                                       var495 = var9.getId();
                                       var638 = "戝觷颊厠毘欐夫佬奚勇";
                                       var7 += this.by(var336, var7, 0, 71, var495, "我要领取比武大会奖励", 450);
                                    }
                                 }
                              }
                           }
                        }
                     }

                     var238 = var2;
                  }
               }
            } else {
               String var239 = "戝亶乄邋丁倬";
               var5 = "我什么都不做";
               if (MsgUntil.p(var3, this.yx().getLoginResult().getSpecies_id().intValue())) {
                  int var286 = var6++;
                  Integer var473 = var3;
                  String var588 = "嬉七沺杌";
                  var7 += this.by(var286, var7, 0, 2, var473, "学习法术", 450);
               }

               int var287 = var6++;
               String var589 = "执覍嚨镳寿";
               var7 += this.by(var287, var7, 0, 3, null, "我要回长安", 450);
               var238 = var2;
            }
         } else {
            String var237 = "戝亶乄邋丁倬";
            var5 = "我什么都不做";
            int var10002 = var6++;
            Integer var10006 = var3;
            String var10007 = "找悐丟烚乳褜";
            var7 += this.by(var10002, var7, 0, 1, var10006, "我想买点东西", 450);
            var238 = var2;
         }

         if (var238 != null) {
            if (var2.getDoors() != null) {
               int var226;
               for (int var280 = var226 = 0; var280 < var2.getDoors().size(); var280 = ++var226) {
                  Door var229;
                  if ((var229 = var2.getDoors().get(var226)) != null && !com.xy.v.Class12.h(var229.getDoorkey())) {
                     var7 += this.by(var6++, var7, 2, 0, var229, var229.getDoorkey(), 450);
                  }
               }

               String var281 = "找咉醣邞乢变";
               var5 = "我哪里都不去";
            }

            if (var3 != 2 && !com.xy.v.Class12.h(var2.getNpctable().getNpcway())) {
               String var227 = var2.getNpctable().getNpcway();
               int var230 = 0;
               int var232;
               int var282 = var232 = 0;

               while (var282 < var227.length()) {
                  String var285 = "V";
                  if ((var232 = var227.indexOf(" ", var230 + 1)) == -1) {
                     var232 = var227.length();
                  }

                  List var235;
                  int var283;
                  if ((var235 = com.xy.v.Class10.c(var227.substring(var230, var232))).size() == 0) {
                     var283 = var232;
                  } else {
                     String var236;
                     if ((var236 = this.yx().getTaskSystem().m(Integer.parseInt((String)var235.get(0)))) != null) {
                        var7 += this.by(var6++, var7, 1, 0, var236, var236, 450);
                     }

                     var283 = var232;
                  }

                  var230 = var283 + 1;
                  var282 = var232;
               }
            }

            TaskProgress var228;
            TaskData var231 = (var228 = this.yx().getTaskSystem().c(Integer.parseInt(var2.getNpctable().getNpcid()))) != null
               ? var228.getTask().getTaskData()
               : null;
            if (var231 != null) {
               int var467 = var6++;
               Integer var583 = 0;
               String var767 = "扲晀朆冔朣伏盧";
               var7 += this.by(var467, var7, 0, 58, var583, "我是来击杀你的", 450);

               int var234;
               for (int var284 = var234 = 1; var284 <= var231.getNd(); var284 = ++var234) {
                  if (var234 == 1) {
                     var467 = var6++;
                     var583 = 1;
                     var767 = "执昣朓凷朶佬盲$嚆隲雈庪_";
                     var7 += this.by(var467, var7, 0, 58, var583, "我是来击杀你的(困难难度)", 450);
                  } else if (var234 == 2) {
                     var467 = var6++;
                     var583 = 2;
                     var767 = "扲晀朆冔朣伏盧G匰跥雝廉J";
                     var7 += this.by(var467, var7, 0, 58, var583, "我是来击杀你的(卓越难度)", 450);
                  } else if (var234 == 3) {
                     var467 = var6++;
                     var583 = 3;
                     var767 = "执昣朓凷朶佬盲$坆狽雈庪_";
                     var7 += this.by(var467, var7, 0, 58, var583, "我是来击杀你的(地狱难度)", 450);
                  } else if (var234 == 4) {
                     var467 = var6++;
                     var583 = 4;
                     var767 = "扲晀朆冔朣伏盧G奊塭雝廉J";
                     var7 += this.by(var467, var7, 0, 58, var583, "我是来击杀你的(天堂难度)", 450);
                  }
               }
            }
         }

         if (var5 != null) {
            var7 += this.by(var6++, var7, 0, 0, null, var5, 450);
         }

         this.bg(var7, 23 + this.bj.getHeight());
         this.ci(var2 != null ? var2.getNpctable().getSkin() : null);
      }
   }

   public void bb(Goodstable var1) {
      if (var1.getType() == 721L) {
         this.e();
         this.cn = 25;
         if (var1.getType() == 721L) {
            String var10001 = "伖昣呐尊笽骤掦氘乏兝挔戜瀃兏昀３U^^兝挔毘俽?L>_";
            this.bq("你是否将筋骨提气丹兑换成灵元晶？#R(兑换比例3:2)");
         }

         int var2 = 0;
         int var3 = 0;
         int var10002 = var2++;
         BigDecimal var10006 = var1.getRgid();
         String var10007 = "找觢儾持";
         var3 += this.by(var10002, var3, 19, 0, var10006, "我要兑换", 450);
         var10002 = var2++;
         var10007 = "戝乻愳慹";
         this.bg(var3 + this.by(var10002, var3, 0, 0, null, "我不愿意", 450), 23 + this.bj.getHeight());
         this.h();
      }
   }

   public void bx(com.xy.d.Class9 var1) {
      this.e();
      this.cn = 0;
      this.cq = var1.au.getI().longValue();
      this.cs = var1;
      MonsterBean var2 = var1.au;
      String var10001 = "惿觷戝軝丆盲宑爟君I,悅覍屇杩拔商W";
      this.bq("想要我身上的宝物吗? 想要就来抢啊!");
      int var3 = 0;
      int var4 = 0;
      int var5;
      MonsterBean var10000;
      if ((var5 = var2.getRobottype()) == 2) {
         int var10002 = var3++;
         Integer var10006 = 0;
         String var10007 = "找悐丟烚乳褜";
         var4 += this.by(var10002, var4, 0, 1, var10006, "我想买点东西", 450);
         var10000 = var2;
      } else {
         label51: {
            if (var2.getTaskList() == null || var2.getTaskList().get(0) == 0) {
               if ((var5 == 4 || var5 == 132) && var2.getFollow() != null) {
                  int var12 = var3++;
                  Integer var16 = 0;
                  String var18 = "戝晙杩勝遟盲";
                  var4 += this.by(var12, var4, 0, 58, var16, "我是来劫道的", 450);
                  var10000 = var2;
                  break label51;
               }

               int var11 = var3++;
               Integer var15 = 0;
               String var17 = "溎坓寲爊儧拁乯义均讗";
               var4 += this.by(var11, var4, 0, 58, var15, "满地宝物先抢一个在说", 450);
            }

            var10000 = var2;
         }
      }

      int var6;
      if (var10000.getTaskList() != null) {
         for (int var10 = var6 = 1; var10 < var2.getTaskList().size(); var10 = ++var6) {
            String var7;
            if ((var7 = this.yx().getTaskSystem().m(var2.getTaskList().get(var6))) != null) {
               var4 += this.by(var3++, var4, 1, 0, var7, var7, 450);
            }
         }
      }

      int var14 = var3++;
      String var19 = "执仌举郱乻惿倬";
      var4 += this.by(var14, var4, 0, 0, null, "我什么都不想做", 450);
      this.bg(var4, 23 + this.bj.getHeight());
      this.ci(var2.getRobotskin());
   }

   public int by(int var1, int var2, int var3, int var4, Object var5, String var6, int var7) {
      NpcOption var8 = this.ca(var1);
      var8.agv(var3, var4, var5, var6, var7);
      var8.setBounds(0, var2, 470, var8.getHeight());
      return var8.getHeight();
   }

   public void bz(com.xy.d.Class1 var1, NpcInfoBean var2, Task var3, TaskProgress var4) {
      this.e();
      Question var5;
      if ((var5 = this.yt().f(var4.getDId())) == null) {
         String var10001 = "戈丁剆寵廢颔廥";
         this.afx.dp("找不到对应题库");
      } else {
         this.cn = 12;
         this.cq = (long)var3.getTaskId();
         this.cs = var1;
         this.bq(var5.getKey());
         int var6 = 0;
         int var7 = 0;

         int var8;
         for (int var10000 = var8 = 0; var10000 < var5.getValues().length; var10000 = var8) {
            NpcOption var9 = this.ca(var6);
            var6++;
            var9.agv(7, var8 + 1, var2.getNpctable().getNpcname(), var5.getValues()[var8], 450);
            var9.setBounds(0, var7, 470, var9.getHeight());
            var8++;
            var7 += var9.getHeight();
         }

         this.bg(var7, 23 + this.bj.getHeight());
         this.h();
      }
   }

   public NpcOption ca(int var1) {
      NpcOption var2;
      if ((var2 = (NpcOption)(var1 < this.cr.getComponentCount() ? this.cr.getComponent(var1) : null)) == null) {
         var2 = new NpcOption(this);
         this.cr.add(var2);
      }

      var2.setVisible(true);
      return var2;
   }

   public void cb(Goodstable var1, int var2) {
      Goodstable var3;
      GoodExchange[] var4 = (var3 = this.afx.getObjectArea().ay(var1.getGoodsid())) != null ? var3.getExchanges() : null;
      if (var4 != null) {
         if (var4.length == 1) {
            this.bn(var1, 0, var2);
         } else {
            this.e();
            this.cn = 20;
            this.cq = var1.getRgid().longValue();
            this.cm = (long)var2;
            String var10003 = "讘遪抆定廻盧儾持剩簘ね弰刢儲挍攓醠Y";
            this.bq("请选择对应的兑换分类。当前兑换数量:" + var2);
            int var5 = 0;
            int var6 = 0;

            int var7;
            for (int var10000 = var7 = 0; var10000 < var4.length; var10000 = var7) {
               int var10002 = var5++;
               int var10005 = var7;
               String var10007 = var4[var7].getKey();
               var7++;
               var6 += this.by(var10002, var6, 14, var10005, null, var10007, 450);
            }

            this.bg(var6, 23 + this.bj.getHeight());
            this.h();
         }
      }
   }

   public void cc(int var1, int var2) {
      this.e();
      this.cn = 26;
      String var10006 = "伏杪L$";
      StringBuilder var10004 = new StringBuilder("你有#G").append(var1);
      String var10005 = "U[乜宄拒矿厙俢奻\uff00絙训厡捓聦义偊/$";
      var10004 = var10004.append("#W个守护石可修复，累计受损耐久值#R").append(var2);
      var10005 = "@8ち佷儫侁奮聿並杯伭盫寫拋瞐｣殬烖聳个偟靯觢淧聴乯烚寧拇两屻";
      this.bq(var10004.append("#W。优先修复耐久最低的守护石，每点耐久值需要消耗一点守护之尘").toString());
      int var3 = 0;
      int var4 = 0;
      int var13 = var3++;
      String var10009 = "俢奻=F<烏耜丳";
      var4 += this.by(var13, var4, 20, 100, null, "修复100点耐久", 450);
      int var14 = var3++;
      var10009 = "侍奢R_S_烚聿並";
      var4 += this.by(var14, var4, 20, 1000, null, "修复1000点耐久", 450);
      int var15 = var3++;
      var10009 = "兤邞俢奻";
      var4 += this.by(var15, var4, 20, 99999, null, "全部修复", 450);
      int var16 = var3++;
      var10009 = "曡料乮侁奮";
      this.bg(var4 + this.by(var16, var4, 0, 0, null, "暂时不修复", 450), 23 + this.bj.getHeight());
      this.h();
   }

   public void cd(Goodstable var1, String var2) {
      this.e();
      GoodFight var3 = var1 != null ? var1.getFight() : null;
      if (var3 != null) {
         GoodFight var4 = null;
         GoodFight var10000 = var3;

         while (true) {
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
            this.cn = 1;
            this.cq = var1.getRgid().longValue();
            String var10003 = "伃睰盧觮变";
            StringBuilder var12 = new StringBuilder("你真的要去").append(var2);
            String var10002 = "君ｩ";
            this.bq(var12.append("吗？").toString());
            int var5 = 0;
            int var6 = 0;

            int var7;
            for (int var10 = var7 = 0; var10 < 3; var10 = var7) {
               NpcOption var8 = this.ca(var5);
               var5++;
               NpcOption var11;
               if (var7 == 0) {
                  var11 = var8;
                  String var10005 = "径遢找变";
                  var8.agv(4, 1, var4, "快送我去", 450);
               } else if (var7 == 1) {
                  var11 = var8;
                  String var13 = "刬阒跣桱";
                  var8.agv(4, 2, var4, "删除路标", 450);
               } else {
                  var11 = var8;
                  String var14 = "醮旟倹趀桤";
                  var8.agv(4, 3, var4, "重新做路标", 450);
               }

               var11.setBounds(0, var6, 470, var8.getHeight());
               var7++;
               var6 += var8.getHeight();
            }

            this.bg(var6, 23 + this.bj.getHeight());
            this.h();
         }
      }
   }

   public Class6(GameView var1) {
      super(27, 2, com.xy.q.Class30.afz, var1);
      String var10003 = "\u0005oYhY>@\"\u0006b\u0011";
      this.yy(100, 80, 526, 149, com.xy.q.Class30.agf);
      this._do("sc/d/26.png");
      this.co = new com.xy.w.Class18();
      this.add(this.co);
      this.bj = com.xy.v.Class27.j("", com.xy.q.Class49.ac, 495);
      this.add(this.bj);
      this.cr = new Class144(this);
      this.cr.addMouseListener(this);
      this.cp = com.xy.q.Class1.g(15, 10, 470, 160, this.cr, 20);
      this.add(this.cp);
   }

   public void c() {
      String var10004 = "讘遪抆伃觮儲挍盧簔埨";
      this.e();
      this.cn = 22;
      this.bq("请选择你要兑换的类型");
      int var1 = 0;
      int var2 = 0;
      int var6 = var1++;
      String var10009 = "执覍畞5F並礨共磸牋朓兝挔祒儋";
      var2 += this.by(var6, var2, 16, 1, null, "我要用90个神兽碎片来兑换神兽", 450);
      int var7 = var1++;
      var10009 = "找觢畇V_S久玮悳礽儒磭爨朆儾持穯杪礱儞";
      this.bg(var2 + this.by(var7, var2, 16, 2, null, "我要用500个珍惜神兽碎片来兑换稀有神兽", 450), 23 + this.bj.getHeight());
      this.h();
   }

   public void e() {
      int var10000 = this.cn = 0;
      this.cs = null;
      this.cq = null;
      this.cm = null;

      for (int var1 = 0; var10000 < this.cr.getComponentCount(); var10000 = var1) {
         this.cr.getComponent(var1++).setVisible(false);
      }

      this.bj.setTextSize("", 495);
      this.co.l();
   }

   public Long ce() {
      return this.cm;
   }

   // $VF: synthetic method
   private void f() {
   }

   public void h() {
      this.ci(null);
   }

   public void cf(int var1, int[] var2) {
      this.e();
      this.cn = 27;
      this.cq = (long)var1;
      int var3 = 0;
      int var4 = 0;
      String var10003 = "L4禀剥贴乣儞杪L$";
      StringBuilder var10002 = new StringBuilder("#W积分赛一共有#G").append(var2[0]);
      var10003 = "U[乜阓佻 弥剁欕圤协酁险企板/1";
      var10002 = var10002.append("#W个队伍,当前正在匹配队伍有#G").append(var2[1]);
      var10003 = "@8义陰佮";
      this.bq(var10002.append("#W个队伍").toString());
      int var10000;
      if (var2[2] == 0) {
         int var9 = var3++;
         String var10007 = "戝觷迗蠺匵鄻";
         var10000 = var4 = var4 + this.by(var9, var4, 21, 1, null, "我要进行匹配", 450);
      } else {
         int var10 = var3++;
         String var14 = "找觢厹淫卖鄮";
         var10000 = var4 = var4 + this.by(var10, var4, 21, 2, null, "我要取消匹配", 450);
      }

      int var11 = var3++;
      String var15 = "戝亶乄邋丁倬";
      this.bg(var10000 + this.by(var11, var4, 0, 0, null, "我什么都不做", 450), 23 + this.bj.getHeight());
      this.h();
   }

   public void cg(com.xy.d.Class1 var1, NpcInfoBean var2, int var3) {
      this.e();
      this.cn = 0;
      this.cq = var2 != null ? Long.parseLong(var2.getNpctable().getNpcid()) : null;
      this.cs = var1;
      int var4 = 0;
      int var5 = 0;
      RoleData var6;
      PKSys var7;
      Class6 var10000;
      if ((var7 = (var6 = this.yx()).getPkSys()).getPk2() == 0) {
         String var10002 = "丌乜艣汧瞂烏啩Z圤閏读伖迗反";
         this.bq("一个良民瞎点啥,在闹请你进去");
         var10000 = this;
         int var10003 = var4++;
         String var10008 = "扲觮嚽锐寪";
         var5 += this.by(var10003, var5, 0, 3, null, "我要回长安", 450);
      } else if (var7.getPk1() != 0) {
         StringBuffer var8 = new StringBuffer();
         var10000 = this;
         var8.append(var6.getLoginResult().getRolename());
         String var22 = " 伖返板";
         var8.append(",你还有");
         var8.append(var7.getPk1());
         String var10005 = "烖3$桤徸杉湪阇";
         var8.append("点PK标志未清除");
         this.bq(var8.toString());
         int var10007 = var4++;
         String var10012 = "戝亶乄邋丁倬";
         var5 += this.by(var10007, var5, 0, 0, null, "我什么都不做", 450);
      } else if (var7.getPk2() == 1) {
         String var10001 = "亩奆厫教剓绍舑烗彚仩ち咡斆嬿雝辨唩";
         this.bq("今天又收到红色炸弹了。哎日子难过啊");
         int var19 = var4++;
         String var25 = "迕晙4N4N[Z尃屹愃恫";
         var5 += this.by(var19, var5, 0, 59, null, "这是8888W,小小意思", 450);
         var19 = var4++;
         var25 = "咉\\奈牔晀朆勱瑥冕犒戤纎";
         int var17;
         int var18 = var17 = var5 + this.by(var19, var5, 0, 60, null, "哦?大爷是来办理出狱手续", 450);
         var10000 = this;
         int var23 = var4++;
         String var27 = "刧慷 执厷幘佬笏炵铇";
         var5 = var18 + this.by(var23, var17, 0, 0, null, "别愁,我去帮你筹点钱", 450);
      } else {
         var10000 = this;
         String var21 = "亥奊奆汷睰夞C晌冕犒盫夞斊嬳";
         this.bq("今天天气真好,是出狱的好日子");
         int var24 = var4++;
         String var28 = "执昣朓劒瑰凶犇扇纛";
         var5 += this.by(var24, var5, 0, 61, null, "我是来办理出狱手续", 450);
      }

      var10000.bg(var5, 23 + this.bj.getHeight());
      this.ci(var2.getNpctable().getSkin());
   }

   @Override
   public boolean ah() {
      if (this.cn == 10) {
         this.f();
         return false;
      } else {
         return super.ah();
      }
   }

   public void ch(RoleSummoning var1, Goodstable var2) {
      this.e();
      this.cn = 24;
      String var10002 = "@8伃厃啇儒戰烓姵呡盧就恄屩乙G@6麧舝@8乙台妨就恄C@(纜舝@8乙嶝纬杦盧烓姵就恄C@=绁舝@8乙爆咢壱勃盫尽恈OL\u0000[\"+&+'4>凪杉厃啇儒欇拸恄盫烟姹乩阿O跪辤泎杪寱阦攧柿L4FY";
      StringBuffer var3 = new StringBuffer("#W你召唤兽打炼妖后的属性将为(#Y黄色#W为原始属性,#G绿色#W为已经有的炼妖属性,#R红色#W为物品增加的属性,#c4ADEDD[]内未召唤兽此抗性的炼妖上限,超过没有实际效果#W):");
      var10002 = "UoBM2I2H-";
      String var4 = "#c4ADEDD[" + (this.yx().getPetMount(var1.getSid()) != null ? 95 : 75) + "]";
      int var5 = 0;
      int var6 = 0;
      int var7 = 0;
      int var10000 = var6;

      while (var10000 < var2.getValue().length()) {
         String var18 = var2.getValue();
         String var10001 = "\u001f";
         if ((var6 = var18.indexOf("|", var5 + 1)) == -1) {
            var6 = var2.getValue().length();
         }

         String var19 = var2.getValue();
         var10001 = "K";
         if ((var7 = var19.indexOf("=", var5 + 1)) == -1 || var7 > var6) {
            var7 = var6;
         }

         String var8;
         String var20 = var8 = var2.getValue().substring(var5, var7);
         var10001 = "符组";
         if (var20.equals("等级")) {
            var10000 = var6;
         } else {
            var10001 = "/\u0004/!";
            var3.append("#r#W");
            var3.append(var8);
            String var10003 = "UC";
            var3.append(": ");
            var10003 = var1.getResistance();
            StringBuilder var10004 = new StringBuilder(String.valueOf(var8));
            String var10005 = "K";
            String var37 = var10004.append("=").toString();
            var10005 = "\u001f";
            String var9 = com.xy.v.Class12.ai(var10003, var37, "|");
            if (!com.xy.v.Class12.h(var9)) {
               var10001 = "//";
               var3.append("#Y");
               var3.append(var9);
               var10003 = "CL4DC";
               var3.append(" #W+ ");
            }

            String var22 = var1.getLyk();
            StringBuilder var27 = new StringBuilder(String.valueOf(var8));
            var10002 = "K";
            var10001 = var27.append("=").toString();
            var10002 = "\u001f";
            if (!com.xy.v.Class12.h(var9 = com.xy.v.Class12.ai(var22, var10001, "|"))) {
               var10001 = "/1";
               var3.append("#G");
               var3.append(var9);
               var10003 = "CL4DC";
               var3.append(" #W+ ");
            }

            var10001 = "/$";
            var3.append("#R");
            var3.append(var2.getValue(), var7 + 1, var6);
            var3.append(var4);
            var10000 = var6;
         }

         var5 = var10000 + 1;
         var10000 = var6;
      }

      this.bq(var3.toString());
      var5 = 0;
      int var14 = 0;
      int var38 = var5++;
      String var10009 = "夞属辺桘以";
      var14 += this.by(var38, var14, 18, 0, null, "好就这样了", 450);
      var38 = var5++;
      var10009 = "戝击凊奱丌乽";
      this.bg(var14 + this.by(var38, var14, 0, 0, null, "我再准备一下", 450), 23 + this.bj.getHeight());
      this.h();
   }

   public void ci(String var1) {
      com.xy.w.Class17 var2 = !com.xy.v.Class12.h(var1) ? com.xy.w.Class16.b(var1) : null;
      int var3 = var2 != null ? 1 + var2.c().getHeight(null) : 0;
      int var4 = Math.max(150, 200 - Math.max(0, 150 - this.cp.getY() - this.cp.getHeight()));
      Class6 var10000;
      if (var3 > 0) {
         this.co.gt(var2.c());
         var10000 = this;
         this.co.setBounds(2, 1, var2.c().getWidth(null), var2.c().getHeight(null));
         this.cp.setBounds(this.cp.getX(), this.cp.getY() + var3, this.cp.getWidth(), this.cp.getHeight());
         this.bj.setBounds(this.bj.getX(), this.bj.getY() + var3, this.bj.getWidth(), this.bj.getHeight());
         this.yv((this.afx.screenData.Screen_x - 526) / 2, (this.afx.screenData.Screen_y - var4) / 2 - var3, this.getWidth(), var4 + var3);
         this.wp(new com.xy.v.Class32(0, var3, 0, 0));
      } else {
         this.co.l();
         var10000 = this;
         this.yv((this.afx.screenData.Screen_x - 526) / 2, (this.afx.screenData.Screen_y - var4) / 2, this.getWidth(), var4);
         this.wp(null);
      }

      var10000.cp.getVerticalScrollBar().setValue(0);
      if (this.cn == 24) {
         this.zc().h(this.lj());
      } else {
         this.zc().b(this.lj());
      }
   }
}
