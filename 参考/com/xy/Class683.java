package com.xy;

import com.xy.bean.ConfirmBean;
import com.xy.entity.RoleSummoning;
import com.xy.formula.BaseValue;
import com.xy.formula.CustomFunction;
import com.xy.formula.FBUtil;
import com.xy.formula.Formula;
import com.xy.formula.Formula0;
import com.xy.formula.PetProperty;
import com.xy.formula.SkillUtil;
import com.xy.game.RoleData;
import com.xy.game.RolePet;
import com.xy.readbean.Activity;
import com.xy.readbean.ActivityPetManualRole;
import com.xy.readbean.ActivitySeries;
import com.xy.readbean.Skill;
import com.xy.richtext.RichLabel;
import com.xy.socket.Agreement;
import com.xy.socket.GameClient;
import com.xy.text.GameView;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.ImageObserver;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.BorderFactory;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.border.Border;

public class Class683 extends Class345 {
   private JScrollPane w;
   private JLabel[] fb;
   private Class659 azh;
   private Class643[] azi;
   private List<null> xh;
   private <undefinedtype>[] azj;
   private boolean lb;
   private <undefinedtype> azk;
   private BigDecimal co;
   private Class436[] g;

   public void apb(Point var1) {
      if (this.uw().gamePetManual) {
         Point var10000 = var1;
         int var6 = var1.x;
         int var2 = var10000.y;
         Skill var3 = var6 > 0 ? this.vc().bf(String.valueOf(var6)) : null;
         if (this.lb) {
            this.azh.fa().setText(var3 != null ? var2 + "级" + var3.getSkillname() : "无契印");
         } else {
            RoleData var4;
            RolePet var5;
            if ((var5 = (var4 = this.vd()).getRolePet(this.co.longValue())).getQy() == var6) {
               this.azh.fa().setText(var3 != null ? var2 + "级" + var3.getSkillname() : "无契印");
            } else {
               var4.setRolePetQY(var5.getId().longValue(), var6);
               this.w(var5);
               this.aej.f("更改契印状态成功");
            }
         }
      }
   }

   public static String apc(int var0, int var1) {
      if (var0 == (20447 & 14178)) {
         return "回合前，己方处于倒地状态的人物越多，触发几率提升越多。最多提升" + var1 * (94 & 53) + "%（所有人物都倒地时）。";
      } else if (var0 == (32732 & 1915)) {
         return "召唤兽离场时，对方和自己造型相同的召唤兽越多，触发几率提升越多。最多提升" + var1 * (47 & 90) + "%。";
      } else if (var0 == (20399 & 14207)) {
         return "失败时，" + var1 * (90 & 47) + "%概率自己不死亡。";
      } else if (var0 == (9947 & 24420)) {
         return "目标的抗强力克金每回合减少" + var1 * (5 >> 1) + "%。首回合不减少。（仅在受到人物伤害时生效。）";
      } else if (var0 == (32723 & 1645)) {
         return "目标的抗强力克木每回合减少" + var1 * (1 ^ 3) + "%。首回合不减少。（仅在受到人物伤害时生效。）";
      } else if (var0 == (3815 & 30554)) {
         return "目标的抗强力克土每回合减少" + var1 * (1 ^ 3) + "%。首回合不减少。（仅在受到人物伤害时生效。）";
      } else if (var0 == (22243 & 12127)) {
         return "目标的抗强力克水每回合减少" + var1 * (5 >> 1) + "%。首回合不减少。（仅在受到人物伤害时生效。）";
      } else if (var0 == (6086 & 28285)) {
         return "目标的抗强力克火每回合减少" + var1 * --2 + "%。首回合不减少。（仅在受到人物伤害时生效。）";
      } else if (var0 == (14079 & 20293)) {
         return "目标的抗无属性伤害每回合减少" + var1 * (4 ^ 5) + "%。首回合不减少。（仅在受到人物伤害时生效。）";
      } else if (var0 == (22523 & 12094)) {
         return "如果回合末处于被混状态时，下回合脱混概率提升" + var1 * --5 + "%。每次脱混时，" + var1 * --3 + "%概率获得当回合的免疫抗混效果。技能触发或回合末不处于被混状态，额外概率清零。";
      } else if (var0 == (7997 & 26622)) {
         return "如果回合末处于被封状态时，下回合脱封概率提升" + var1 * --5 + "%。每次脱封时，" + var1 * --3 + "%概率获得当回合的免疫抗封效果。技能触发或回合末不处于被封状态，额外概率清零。";
      } else if (var0 == (5950 & 28671)) {
         return "如果回合末处于被忘状态时，下回合脱忘概率提升" + var1 * --5 + "%。每次脱忘时，" + var1 * --3 + "%概率获得当回合的免疫抗忘效果。技能触发或回合末不处于被忘状态，额外概率清零。";
      } else if (var0 == (30685 & 3902)) {
         return "进场时，" + var1 * 10 + "%概率自动攻击当前血量最少单位。";
      } else if (var0 == 1822) {
         return "进场时，" + var1 * 10 + "%概率自动攻击当前血量最少单位。";
      } else if (var0 == 1833) {
         return "高级分裂攻击触发概率增加" + var1 * (3 >> 1) + "%。";
      } else if (var0 == 1831) {
         return "分花拂柳触发时，增加" + (double)var1 * 1.5D + "%命中，" + var1 * 2000 + "攻击力。";
      } else if (var0 == 1834) {
         return var1 * 10 + "%概率悬刃可以触发两次。";
      } else if (var0 == 1836) {
         return var1 * 10 + "%概率遗患可以触发两次。";
      } else if (var0 == 1835) {
         return "如果一个单位没有触发，下一单位触发概率提升" + var1 * (5 >> 1) + "%。触发时，额外造成最大血量" + (double)var1 * 1.5D + "%的伤害。每回合开始或者触发一次后，额外概率归零。";
      } else if (var0 == 1865) {
         return "敌方人物单位的连击率减少" + var1 * --1 + "%。";
      } else if (var0 == 1611) {
         return var1 * --5 + "%概率增加1单位，回复血法比例增加" + var1 * (3 >> 1) + "%。";
      } else if (var0 == 1871) {
         return var1 * 6 + "%概率增加1单位。";
      } else if (var0 == 1872) {
         return var1 * 6 + "%概率增加1单位。";
      } else if (var0 == 1612) {
         return var1 * 10 + "%概率增加1单位。";
      } else if (var0 == 1838) {
         return "触发吉人天相时，" + var1 * 10 + "%概率将最大血量的30%转化为护盾。";
      } else if (var0 == 1873) {
         return "本方每死亡一个召唤兽，提升" + (2.0D + (double)var1 * 0.3D) + "%仙法鬼火抗性。上限增加至" + (30 + var1) + "%。（替换原效果）";
      } else if (var0 == 1884) {
         return "触发沉雾效果后，此法术的目标数有" + var1 * 10 + "%概率减少原本目标数乘以0.3(小数部分概率减1个单位 例5个单位 50%减少1个 50%减少2个)。";
      } else if (var0 == 1885) {
         return "失败时," + var1 * 10 + "%概率自己不死亡。";
      } else if (var0 == 1891) {
         return "被致死的目标,扣除法量比例提升" + var1 * 10 + "%";
      } else if (var0 == 1881) {
         return var1 * 8 + "%概率取消敌方首个召唤兽指令";
      } else if (var0 == 1882) {
         return var1 * 10 + "%概率追加一回合";
      } else if (var0 == 1883) {
         return "使受到伤害增加30%";
      } else if (var0 == 1867) {
         return "技能附加" + var1 + "阶启灵效果";
      } else if (var0 == 1868) {
         return var1 * 10 + "%概率不用进入冷却(只会生效一次)";
      } else if (var0 == 1869) {
         return "技能生效概率提升" + var1 * 10 + "%。";
      } else if (var0 == 1841) {
         return "提高双管伤害" + var1 * 2000;
      } else if (var0 == 1842) {
         return var1 * 6 + "%概率额外回复召唤兽主人10%气血和法力";
      } else if (var0 == 1828) {
         return var1 * 6 + "%概率化无可以触发两次。";
      } else if (var0 == 1829) {
         return var1 * 10 + "%概率不用离场";
      } else if (var0 == 1830) {
         return var1 * 6 + "%概率额外回复召唤兽主人10%气血和法力";
      } else if (var0 == 1606) {
         return var1 * 10 + "%概率不用进入冷却(只会生效一次)";
      } else if (var0 == 1607) {
         return var1 * 10 + "%概率额外增加一个目标";
      } else if (var0 == 1608) {
         return var1 * 10 + "%概率不用进入冷却(只会生效一次)";
      } else if (var0 == 1890) {
         return var1 * 10 + "%的概率增加一个单位";
      } else if (var0 == 1895) {
         return "技能生效概率提升" + var1 * 20 + "%";
      } else if (var0 == 1900) {
         return "离场时,根据支援列表未入场的召唤兽与当前离场召唤兽造型相同的个数,额外增加闪现概率。每个增加" + 0.2D * (double)var1 + "%(最多增加" + (3 >> 1) * var1 + "%)";
      } else if (var0 == 1918) {
         return var1 * 10 + "%的概率在复制一次";
      } else {
         if (var0 == 3036) {
            if (var1 == --1) {
               return "敌方召唤兽有18%下回合不能释放自身携带技能。（不包含召唤兽技能）有3%抵抗敌方的天赋压制";
            }

            if (var1 == (1 ^ 3)) {
               return "敌方召唤兽有19%下回合不能释放自身携带技能、不能触发内丹效果和施放内丹技能。有4.5%抵抗敌方的天赋压制";
            }

            if (var1 == --3) {
               return "敌方召唤兽有20%下回合不能释放自身携带技能、不能触发内丹效果和施放内丹技能、不能保护其他目标。有6%抵抗敌方的天赋压制";
            }

            if (var1 == --4) {
               return "敌方召唤兽有21%下回合不能释放自身携带技能、不能触发内丹效果和施放内丹技能、不能保护其它目标、不能进行物理攻击。有7.5%抵抗敌方的天赋压制";
            }

            if (var1 == 5) {
               return "敌方召唤兽有22%下回合不能释放自身携带技能、不能触发内丹效果和施放内丹技能、不能选择保护、不能进行物理攻击、不能使用物品栏。有9%抵抗敌方的天赋压制";
            }
         }

         return null;
      }
   }

   public Class683(GameView var1) {
      int var10001 = 5 >> 1;
      int var10005 = -4 >> 2;
      super(50 & 95, --2, Class345.aef, var1);
      this.va(var10005, 5 >> 3, 15935 & 17406, 29155 & 4063, Class345.aeo);
      this.uv(Class511.q("sc/d/1.png", 93 & 102, 93 & 102, 93 & 102, 93 & 102, (boolean)(3 ^ 3)), "技能");
      Class643[] var3 = new Class643[var10001];
      boolean var10003 = true;
      this.azi = var3;

      int var10000;
      int var2;
      for(var10000 = var2 = 3 >> 2; var10000 < this.azi.length; var10000 = var2) {
         this.azi[var2] = new Class643("sc/e/28.png", 3 & 5, (47 & 122) + var2, Class681.bm, (Color[])null, "", this);
         this.azi[var2].setBounds((84 & 111) + (5373 & 27558) * var2, 7151 & 26013, 109 & 86, 63 & 81);
         this.azi[var2].setText(var2 == 0 ? "支援列表" : (var2 == --1 ? "删除技能" : ""));
         this.add(this.azi[var2++]);
      }

      JLabel[] var4 = new JLabel[--3];
      var10003 = true;
      this.fb = var4;

      for(var10000 = var2 = 5 >> 3; var10000 < this.fb.length; var10000 = var2) {
         this.fb[var2] = Class133.c(127 & 52, (31 & 124) + var2 * (125 & 87), 21479 & 11775, 61 & 87, 2 & 5, Color.white, Class681.ak);
         this.fb[var2].setText(var2 == 0 ? "天生技能" : (var2 == (4 ^ 5) ? "领悟技能" : (var2 == 5 >> 1 ? "契印状态:" : "")));
         this.add(this.fb[var2++]);
      }

      this.fb[1 ^ 3].setVisible((boolean)(3 >> 2));
      if (this.uw().gamePetManual) {
         this.fb[4 ^ 5].setBounds(124 & 55, 113, 263, 21);
         this.fb[1 ^ 3].setBounds(235, 113, 80, 21);
         this.fb[5 >> 1].setVisible((boolean)(5 >> 2));
         this.azh = new Class659(3 & 4, 160, this);
         this.azh.gb((boolean)(2 ^ 3));
         this.azh.vf(318, 113, 220, 20);
         this.add(this.azh);
      }

      <undefinedtype>[] var6 = new <undefinedtype>[9];
      var10003 = true;
      this.azj = var6;

      Class683 var5;
      for(var10000 = var2 = 5 >> 3; var10000 < this.azj.length; var10000 = var2) {
         this.azj[var2] = new MouseListener(3 & 5, var2) {
            private int fk;
            private int ay;
            private int j;
            private Image rg;
            private Image fq;
            private int m;

            public {
               this.ay = var2;
               this.fk = var3;
               this.addMouseListener(this);
            }

            public void mouseClicked(MouseEvent var1) {
               if (this.m > 0) {
                  RoleSummoning var3 = Class683.this.vd().getChosePet();
                  Skill var2 = this.m != 0 ? Class683.this.vc().bf(String.valueOf(this.m)) : null;
                  Class683.this.apj(var3, this.m, this.j, var2, (boolean)(this.ay == --1 ? --1 : 0));
                  if (Class683.this.uw().gameBBXY && (this.m == (22015 & 12002) || this.m == (26621 & 7415))) {
                     ((Class301)Class683.this.ve().e(16562 & 16351)).v(var3);
                  }
               }

            }

            public void mouseReleased(MouseEvent var1) {
            }

            public void cf(int var1, int var2) {
               this.m = var1;
               this.j = var2;
               <undefinedtype> var10000;
               if (var1 == -4 >> 2) {
                  var10000 = this;
                  this.rg = Class511.a("sc/d/59.png");
               } else if (var1 == (-2 & -1)) {
                  var10000 = this;
                  this.rg = Class511.a("sc/d/115.png");
               } else if (var1 == 0) {
                  this.rg = null;
                  var10000 = this;
               } else {
                  this.rg = Class222.g(String.valueOf(var1));
                  var10000 = this;
               }

               var10000.fq = var2 >= 0 ? Class511.a("sc/c/83") : null;
            }

            protected void paintComponent(Graphics var1) {
               if (this.rg != null) {
                  var1.drawImage(this.rg, 5 >> 1, 5 >> 1, this.getWidth() - --4, this.getHeight() - --4, (ImageObserver)null);
               }

               if (this.fq != null) {
                  var1.drawImage(this.fq, 36 & 127, --3, 79 & 63, 79 & 63, (ImageObserver)null);
               }

            }

            public void mousePressed(MouseEvent var1) {
            }

            public void mouseEntered(MouseEvent var1) {
               if ((this.m == -4 >> 2 || this.m == (-2 & -1)) && Class683.this.uw().gamePetSkill) {
                  Class270 var2 = (Class270)Class683.this.ve().e(62 & 111);
                  if (this.fk == (71 & 62)) {
                     if (this.m == (-2 & -1)) {
                        var2.f("#R神兽技能格(未获取)#r#Y获取技能格的方式:#r前6个技能格都获取时自动获取;");
                        return;
                     }

                     if (this.m == -4 >> 2) {
                        var2.f("#Y神兽技能格(封印)#r解封技能格方式:#r前6个技能格都开启时自动开启;");
                        return;
                     }
                  } else {
                     if (this.m == (-2 & -1)) {
                        var2.f("#R技能格(未获取)#r#Y获取技能格的方式:#r1.召唤兽点化后,使用提炼过的聚魄丹时有几率获得;#r2.召唤兽启灵时,有几率获得(封印状态);");
                        return;
                     }

                     if (this.m == -4 >> 2) {
                        var2.f("#Y技能格(封印)#r解封技能格方式:#r1.明雷战斗可随机开启;#r2.使用启魂丹开启;");
                     }
                  }
               }

            }

            public void mouseExited(MouseEvent var1) {
               if ((this.m == -4 >> 2 || this.m == (-1 & -2)) && Class683.this.uw().gamePetSkill) {
                  Class683.this.ve().n(127 & 46);
               }

            }
         };
         if (var2 == 0) {
            var5 = this;
            this.azj[var2].setBounds(159, 144, 50, 50);
         } else if (var2 == (4 ^ 5)) {
            var5 = this;
            this.azj[var2].setBounds(89, 184, 50, 50);
         } else if (var2 == (1 ^ 3)) {
            var5 = this;
            this.azj[var2].setBounds(63, 254, 50, 50);
         } else if (var2 == --3) {
            var5 = this;
            this.azj[var2].setBounds(89, 324, 50, 50);
         } else if (var2 == --4) {
            var5 = this;
            this.azj[var2].setBounds(159, 364, 50, 50);
         } else if (var2 == --5) {
            var5 = this;
            this.azj[var2].setBounds(229, 324, 50, 50);
         } else if (var2 == 6) {
            var5 = this;
            this.azj[var2].setBounds(159, 254, 50, 50);
         } else if (var2 == 7) {
            var5 = this;
            this.azj[var2].setBounds(255, 254, 50, 50);
         } else {
            if (var2 == 8) {
               this.azj[var2].setBounds(229, 184, 50, 50);
            }

            var5 = this;
         }

         var5.azj[var2].setBounds(this.azj[var2].getX() - (5 >> 1), this.azj[var2].getY() - --2, 54, 54);
         this.add(this.azj[var2++]);
      }

      var10001 = --5;
      this.xh = new ArrayList();
      this.azk = new JComponent() {
         private Class643 yf;
         private int do;
         private RichLabel lt;
         private RichLabel aho;
         private Skill ane;
         private int gw;
         private int fk;
         private int ay;
         private RichLabel bv;
         private JLabel ir;
         private Class604 ame;
         private int m;

         public {
            int var10003 = 18903 & 14079;
            int var10005 = --5;
            this.fk = var10005;
            this.ay = var10003;
            this.bv = new RichLabel("", Class681.ab);
            this.add(this.bv);
            this.lt = new RichLabel();
            this.add(this.lt);
            this.aho = new RichLabel();
            this.add(this.aho);
            this.yf = new Class643("sc/e/5.png", 2 ^ 3, 111 & 61, Class681.bm, Class681.an, (String)null, Class683.this.gk());
            this.add(this.yf);
            this.ir = new JLabel("等级", 5 >> 3);
            this.ir.setFont(Class681.bm);
            this.ir.setForeground(Color.white);
            this.add(this.ir);
         }

         protected void paintComponent(Graphics var1) {
            super.paintComponent(var1);
            if (this.ame == null) {
               this.ame = Class511.q("sc/d/17.png", 47 & 86, 47 & 86, 47 & 86, 47 & 86, (boolean)(2 & 5));
            }

            var1.translate(this.fk, this.do);
            this.ame.g(var1, this.ay, this.gw);
            var1.translate(-this.fk, -this.do);
         }

         public int rk(int var1, int var2) {
            int var10002 = 63 & 94;
            int var10004 = --5;
            this.m = var1;
            this.do = var10004 + var2;
            this.gw = var10002;
            StringBuffer var3;
            Dimension var4;
            if (var1 == -4 >> 2) {
               this.lt.setText("还没开启#G天赋进阶");
               var4 = this.lt.computeSize(24821 & 8126);
               this.lt.setBounds(42 & 95, this.do + --3, (int)var4.getWidth(), (int)var4.getHeight());
               (var3 = new StringBuffer()).append("#R一阶天赋效果:(尚未激活)");
               var3.append(Class683.apc(16381 & 19422, 2 ^ 3));
               this.aho.setText(var3.toString());
               var4 = Class683.this.azk.aho.computeSize(21759 & 11218);
               this.aho.setBounds(30 & 107, this.do + (31 & 124) + --5 + (87 & 58), (int)var4.getWidth(), (int)var4.getHeight());
               this.gw += (int)var4.getHeight() + (111 & 22) + (118 & 29);
            } else {
               this.lt.setText("已经开启#G天赋进阶");
               var4 = this.lt.computeSize(26814 & 6133);
               this.lt.setBounds(75 & 62, this.do + --3, (int)var4.getWidth(), (int)var4.getHeight());
               this.ir.setBounds(61 & 74, this.do + (62 & 93) + --5, 119 & 76, 31 & 110);
               this.ir.setText("等级:" + var1 + "/5");
               this.ir.setVisible((boolean)(4 ^ 5));
               var3 = new StringBuffer();
               var3.append("#G当前天赋效果:");
               var3.append(Class683.apc(3036, var1));
               if (var1 < --5) {
                  if (var3.length() != 0) {
                     var3.append("#r");
                  }

                  var3.append("#R下一阶天赋效果:(尚未激活)");
                  var3.append(Class683.apc(3036, var1 + (3 >> 1)));
               }

               this.aho.setText(var3.toString());
               var4 = Class683.this.azk.aho.computeSize(210);
               this.aho.setBounds(10, this.do + 28 + --5 + 18, (int)var4.getWidth(), (int)var4.getHeight());
               this.gw += (int)var4.getHeight() + 6 + 20;
            }

            return 10 + this.gw;
         }

         public void q() {
            this.bv.setText((String)null);
            this.lt.setText((String)null);
            this.aho.setText((String)null);
            this.yf.setVisible((boolean)(5 >> 3));
            this.ir.setVisible((boolean)(2 & 5));
         }

         public int fs(int var1, int var2) {
            int var10002 = 94 & 63;
            int var10004 = --5;
            this.m = var1;
            this.do = var10004 + var2;
            this.gw = var10002;
            Dimension var5;
            if (var1 == (-3 & -1)) {
               this.lt.setText("此技能无法悟灵");
               var5 = this.lt.computeSize(8629 & 24318);
               this.lt.setBounds(78 & 59, this.do + --3, (int)var5.getWidth(), (int)var5.getHeight());
            } else if (var1 == (-2 & -1)) {
               this.lt.setText("技能悟灵个数#R已达上限");
               var5 = this.lt.computeSize(4599 & 28348);
               this.lt.setBounds(94 & 43, this.do + --3, (int)var5.getWidth(), (int)var5.getHeight());
            } else if (var1 == -4 >> 2) {
               this.lt.setText("技能可以开启#G悟灵状态");
               var5 = this.lt.computeSize(22517 & 10430);
               this.lt.setBounds(62 & 75, this.do + --3, (int)var5.getWidth(), (int)var5.getHeight());
               this.yf.setText("开启");
               this.yf.setBounds(23791 & 9151, this.do + --3, 115 & 46, 87 & 57);
               this.yf.setVisible((boolean)(3 & 5));
            } else {
               this.lt.setText("此技能处于#G悟灵状态");
               var5 = this.lt.computeSize(1276 & 31671);
               this.lt.setBounds(42 & 95, this.do + --3, (int)var5.getWidth(), (int)var5.getHeight());
               this.yf.setText("关闭");
               this.yf.setBounds(13807 & 19135, this.do + --3, 106 & 55, 17);
               this.yf.setVisible((boolean)(3 >> 1));
               this.ir.setBounds(8, this.do + 28 + --5, 68, 14);
               this.ir.setText("等级:" + var1 + "/10");
               this.ir.setVisible((boolean)(--1));
               int var4 = Integer.parseInt(this.ane.getSkillid());
               StringBuffer var3 = new StringBuffer();
               if (var1 > 0) {
                  var3.append("#G当前灵阶效果:");
                  var3.append(Class683.apc(var4, var1));
               }

               if (var1 < 10) {
                  if (var3.length() != 0) {
                     var3.append("#r");
                  }

                  var3.append("#R下一灵阶效果:(尚未激活)");
                  var3.append(Class683.apc(var4, var1 + (4 ^ 5)));
               }

               this.aho.setText(var3.toString());
               var5 = Class683.this.azk.aho.computeSize(210);
               this.aho.setBounds(10, this.do + 28 + --5 + 18, (int)var5.getWidth(), (int)var5.getHeight());
               this.gw += (int)var5.getHeight() + 6 + 20;
            }

            return 10 + this.gw;
         }
      };
      this.w = Class133.f(318, 136, 233, 280, this.azk, 30);
      this.add(this.w);
      Class436[] var7 = new Class436[var10001];
      var10003 = true;
      this.g = var7;

      for(var10000 = var2 = 5 >> 3; var10000 < this.g.length; var10000 = var2) {
         this.g[var2] = new Class436();
         if (var2 != 0 && var2 != --1) {
            if (var2 == 2) {
               var5 = this;
               this.g[var2].eq(Class511.q("sc/d/24.png", 2, 2, 2, 2, (boolean)(3 >> 2)));
               this.g[var2].setBounds(52, 28, 487, 80);
            } else if (var2 == 3) {
               var5 = this;
               this.g[var2].fw("sc/d/58.png");
               this.g[var2].setBounds(52, 133, 264, 291);
            } else {
               if (var2 == 4) {
                  this.g[var2].eq(Class511.q("sc/d/24.png", 2, 2, 2, 2, false));
                  this.g[var2].setBounds(316, 134, 223, 290);
               }

               var5 = this;
            }
         } else {
            var5 = this;
            this.g[var2].eq(Class511.q("sc/d/25.png", --2, --2, --2, --2, (boolean)(2 & 5)));
            this.g[var2].setBounds(52, 28 + var2 * 85, 487, 21);
         }

         var5.add(this.g[var2++]);
      }

   }

   public void s() {
      if (!this.aej.t()) {
         RoleSummoning var6;
         if ((var6 = this.vd().getChosePet()) != null) {
            Skill var2;
            if ((var2 = this.apo()) == null) {
               this.ux().f("请选择一个技能");
            } else {
               int var5 = 0;
               String var4;
               if ((var4 = var6.getBeastSkills()) != null && var4.equals(var2.getSkillid())) {
                  var5 = 2 ^ 3;
               }

               int var10000;
               int var1;
               label98: {
                  if (var5 == 0 && (var4 = var6.getPetSkills()) != null && !var4.equals("")) {
                     String[] var3 = var4.split("\\|");

                     for(var10000 = var1 = 2 & 5; var10000 < var3.length; var10000 = var1) {
                        if (var3[var1].indexOf("=") == -4 >> 2) {
                           if (var3[var1].equals(var2.getSkillid())) {
                              var10000 = var5 = 3 & 5;
                              break label98;
                           }
                        } else if (var3[var1].startsWith(var2.getSkillid() + "=")) {
                           var10000 = var5 = 3 & 5;
                           break label98;
                        }

                        ++var1;
                     }
                  }

                  var10000 = var5;
               }

               if (var10000 == 0) {
                  this.ux().f("不能删除天生技能");
               } else if (!this.uw().n(--2, 14 & 125)) {
                  this.aej.aal(new ConfirmBean(61 & 78, var6.getSid() + "|" + var2.getSkillid(), "#Y你确定要删除 #G" + var2.getSkillname() + "#Y这个技能吗?"));
               } else {
                  if (var2.getSkilltype().equals("3") && !var2.getSkillid().equals("3034")) {
                     int var7 = 3 ^ 3;

                     for(var10000 = var1 = 3 ^ 3; var10000 < this.azj.length; var10000 = var1) {
                        Skill var8 = this.azj[var1].m > 0 ? this.vc().bf(String.valueOf(this.azj[var1].m)) : null;
                        if (var8 != null && var8.getSkilltype().equals("3")) {
                           ++var7;
                        }

                        ++var1;
                     }

                     if (var7 >= --2) {
                        var1 = var7 == (1 ^ 3) ? 126 & 101 : (var7 == --3 ? 1524 & 31743 : 3000);
                        if (this.uw().o()) {
                           var1 = var7 == (1 ^ 3) ? 124 & 103 : (var7 == --3 ? 29899 & 3068 : 500);
                        }

                        this.aej.aal(new ConfirmBean(126 & 13, var6.getSid() + "|" + var2.getSkillid(), "#Y你是否要确定花费" + var1 + "积分,进行终极技能重修"));
                        return;
                     }
                  }

                  this.aej.aal(new ConfirmBean(79 & 60, var6.getSid() + "|" + var2.getSkillid(), "#Y你是否要确定花费10W大话币,删除#G" + var2.getSkillname() + "#Y这个技能吗？(如果是终极技能且没有领悟???会重修成???)"));
               }
            }
         }
      }
   }

   public <undefinedtype> apd(int var1) {
      if (var1 < this.xh.size()) {
         ((<undefinedtype>)this.xh.get(var1)).setBounds((127 & 55) + (61 & 123) * var1, 118 & 59, 55 & 127, 55 & 127);
         return (<undefinedtype>)this.xh.get(var1);
      } else {
         MouseListener var2 = new MouseListener(5 >> 3, this.xh.size()) {
            private int fk;
            private int ay;
            private int j;
            private Image rg;
            private Image fq;
            private int m;

            public {
               this.ay = var2;
               this.fk = var3;
               this.addMouseListener(this);
            }

            public void mouseClicked(MouseEvent var1) {
               if (this.m > 0) {
                  RoleSummoning var3 = Class683.this.vd().getChosePet();
                  Skill var2 = this.m != 0 ? Class683.this.vc().bf(String.valueOf(this.m)) : null;
                  Class683.this.apj(var3, this.m, this.j, var2, (boolean)(this.ay == --1 ? --1 : 0));
                  if (Class683.this.uw().gameBBXY && (this.m == (22015 & 12002) || this.m == (26621 & 7415))) {
                     ((Class301)Class683.this.ve().e(16562 & 16351)).v(var3);
                  }
               }

            }

            public void mouseReleased(MouseEvent var1) {
            }

            public void cf(int var1, int var2) {
               this.m = var1;
               this.j = var2;
               <undefinedtype> var10000;
               if (var1 == -4 >> 2) {
                  var10000 = this;
                  this.rg = Class511.a("sc/d/59.png");
               } else if (var1 == (-2 & -1)) {
                  var10000 = this;
                  this.rg = Class511.a("sc/d/115.png");
               } else if (var1 == 0) {
                  this.rg = null;
                  var10000 = this;
               } else {
                  this.rg = Class222.g(String.valueOf(var1));
                  var10000 = this;
               }

               var10000.fq = var2 >= 0 ? Class511.a("sc/c/83") : null;
            }

            protected void paintComponent(Graphics var1) {
               if (this.rg != null) {
                  var1.drawImage(this.rg, 5 >> 1, 5 >> 1, this.getWidth() - --4, this.getHeight() - --4, (ImageObserver)null);
               }

               if (this.fq != null) {
                  var1.drawImage(this.fq, 36 & 127, --3, 79 & 63, 79 & 63, (ImageObserver)null);
               }

            }

            public void mousePressed(MouseEvent var1) {
            }

            public void mouseEntered(MouseEvent var1) {
               if ((this.m == -4 >> 2 || this.m == (-2 & -1)) && Class683.this.uw().gamePetSkill) {
                  Class270 var2 = (Class270)Class683.this.ve().e(62 & 111);
                  if (this.fk == (71 & 62)) {
                     if (this.m == (-2 & -1)) {
                        var2.f("#R神兽技能格(未获取)#r#Y获取技能格的方式:#r前6个技能格都获取时自动获取;");
                        return;
                     }

                     if (this.m == -4 >> 2) {
                        var2.f("#Y神兽技能格(封印)#r解封技能格方式:#r前6个技能格都开启时自动开启;");
                        return;
                     }
                  } else {
                     if (this.m == (-2 & -1)) {
                        var2.f("#R技能格(未获取)#r#Y获取技能格的方式:#r1.召唤兽点化后,使用提炼过的聚魄丹时有几率获得;#r2.召唤兽启灵时,有几率获得(封印状态);");
                        return;
                     }

                     if (this.m == -4 >> 2) {
                        var2.f("#Y技能格(封印)#r解封技能格方式:#r1.明雷战斗可随机开启;#r2.使用启魂丹开启;");
                     }
                  }
               }

            }

            public void mouseExited(MouseEvent var1) {
               if ((this.m == -4 >> 2 || this.m == (-1 & -2)) && Class683.this.uw().gamePetSkill) {
                  Class683.this.ve().n(127 & 46);
               }

            }
         };
         this.apl(var2);
         return var2;
      }
   }

   public static String ape(int var0, Skill var1, double var2, int var4, int var5) {
      String var6 = var1.getRemark();
      int var7 = Integer.parseInt(var1.getSkilllevel());
      double var8 = Double.parseDouble(var1.getDielectric());
      String var10 = var0 <= (20477 & 13295) ? "混乱" : (var0 <= (19443 & 14334) ? "封印" : (var0 <= (16375 & 17407) ? "昏睡" : (var0 <= (9214 & 24573) ? "中毒" : (var0 <= (17563 & 16229) ? "震慑" : (var0 <= (13358 & 20439) ? "力量" : (var0 <= (27951 & 5851) ? "抗性" : (var0 <= (10045 & 23762) ? "加速" : (var0 <= (22205 & 11607) ? "风" : (var0 <= (11995 & 21822) ? "雷" : (var0 <= (22431 & 11391) ? "水" : (var0 <= (28535 & 5292) ? "火" : (var0 <= (25981 & 7851) ? "鬼火" : (var0 <= (15550 & 18287) ? "三尸虫" : (var0 <= (22327 & 11515) ? "遗忘" : (var0 <= (17661 & 16186) ? "smmh" : (var0 <= 1085 ? "霹雳" : (var0 <= 1090 ? "沧波" : (var0 <= 1095 ? "甘霖" : "扶摇"))))))))))))))))));
      int var11 = (var0 - 1001) / --5;
      StringBuffer var12 = new StringBuffer();
      String var10000 = var6;
      var12.append("#W【门派】");
      var12.append(SkillUtil.getSkillBySM(var11));
      var12.append("#r【师傅】");
      var12.append(SkillUtil.getSkillBySMSF(var11));
      var12.append("#r【法术系】");
      var12.append(SkillUtil.getSkillBySMText(var11));
      var12.append("#r【熟练度】");
      var12.append((int)var2);
      var12.append("#r【消耗MP】");
      var12.append((int)(var8 * (var2 / 25000.0D + 1.0D)));
      var12.append("#r");
      var11 = 2 & 5;
      int var14 = 2 & 5;

      StringBuffer var15;
      while(true) {
         if ((var11 = var10000.indexOf("{", var14)) == -4 >> 2) {
            var15 = var12;
            break;
         }

         if ((var14 = var6.indexOf("}", var11 + (2 ^ 3))) == -4 >> 2) {
            var15 = var12;
            break;
         }

         String var9;
         if ((var9 = var6.substring(var11 + (3 >> 1), var14)).indexOf("{") != -4 >> 2) {
            var10000 = var6;
            ++var11;
         } else {
            int var13 = var6.length();
            var6 = apk(var9, var6, var0, var1, var2, var4, var5, var10, var7);
            var14 += var6.length() - var13;
            var10000 = var6;
         }
      }

      var15.append(var6);
      return var12.toString();
   }

   public static String apf(int var0, Skill var1, double var2, int var4, int var5) {
      String var6 = "其他";
      int var7 = 3 >> 2;
      String var8 = var1.getRemark();
      StringBuffer var9 = new StringBuffer();
      int var10 = 3 & 4;
      int var11 = 3 >> 2;
      String var10000 = var8;

      StringBuffer var14;
      while(true) {
         if ((var10 = var10000.indexOf("{", var11)) == -4 >> 2) {
            var14 = var9;
            break;
         }

         if ((var11 = var8.indexOf("}", var10 + (5 >> 2))) == -4 >> 2) {
            var14 = var9;
            break;
         }

         String var12;
         if ((var12 = var8.substring(var10 + (4 ^ 5), var11)).indexOf("{") != -4 >> 2) {
            var10000 = var8;
            ++var10;
         } else {
            int var13 = var8.length();
            var8 = apk(var12, var8, var0, var1, var2, var4, var5, var6, var7);
            var11 += var8.length() - var13;
            var10000 = var8;
         }
      }

      var14.append(var8);
      return var9.toString();
   }

   public void y(int var1) {
      if (var1 == (45 & 127)) {
         RoleSummoning var2;
         if ((var2 = this.vd().getChosePet()) == null) {
            return;
         }

         if (this.azk.ane == null) {
            this.aej.f("请选择一个技能");
            return;
         }

         String var3 = Agreement.getSendTextAES("userpet", "QL" + this.azk.ane.getSkillid() + "|" + var2.getSid());
         this.uw().d(var3);
      }

   }

   public static String apg(String var0, String var1, int var2, Skill var3, RoleSummoning var4) {
      double var5 = Double.parseDouble(var3.getValue());
      double var7 = Double.parseDouble(var3.getGrow());
      String var11 = null;
      String var10000;
      int var12;
      if (!var0.equals("数值") && !var0.equals("整值")) {
         if (var0.equals("数值等级") || var0.equals("整值等级")) {
            var12 = var0.equals("数值等级") ? 2 ^ 3 : 0;
            int var9 = Class224.n(var4.getGrade());
            int var10 = Class224.p(var4.getGrade());
            if (var9 >= --4) {
               var10 = Math.max(var10, 8895 & 24052);
            }

            var7 = (double)var10 / 200.0D * BaseValue.f(var4.getFriendliness(), var7);
            var11 = Class394.ak(var5 + var7, var12);
         }

         var10000 = var11;
      } else {
         var12 = var0.equals("数值") ? --1 : 0;
         var10000 = var11 = Class394.ak(var5 + BaseValue.f(var4.getFriendliness(), var7), var12);
      }

      return var10000 == null ? var1 : var1.replace("{" + var0 + "}", var11);
   }

   public static String api(RoleSummoning var0, int var1, int var2, Skill var3, GameClient var4) {
      StringBuffer var7 = new StringBuffer();
      StringBuffer var10000;
      if (var1 == (7167 & 28636)) {
         var10000 = var7;
         var7.append(var3.getSkillname());
      } else {
         String var5;
         if (var1 < (24159 & 9708)) {
            if ((var5 = apn(var1, var3, 1.0D, 31996 & 971, --4)) != null) {
               var10000 = var7;
               var7.append(var5);
               return var10000.toString();
            }
         } else {
            var5 = !var4.gameBattle && var1 != (13666 & 20383) ? so(var3.getRemark()) : var3.getRemark();
            if (var4.gameBattle || var1 == (32647 & 1402)) {
               var10000 = var7;
               var7.append(var5);
               return var10000.toString();
            }

            String[] var6 = var5.split("\\|");

            int var8;
            for(int var10 = var8 = 2 & 5; var10 < var6.length; var10 = var8) {
               String[] var9 = var6[var8].split("=");
               if ((var5 = apq(var6, var8)) != null) {
                  ++var8;
                  var7.append("#c" + var9[3 ^ 3] + " " + var9[3 & 5] + "#c" + var6[var8].split("=")[5 >> 3] + var5 + "#r");
               } else {
                  var7.append("#c" + var9[3 ^ 3] + " " + var9[--1] + "#r");
               }

               ++var8;
            }
         }

         var10000 = var7;
      }

      return var10000.toString();
   }

   public void apj(RoleSummoning var1, int var2, int var3, Skill var4, boolean var5) {
      this.azk.ane = var4;
      this.azk.q();
      int var6;
      int var10000;
      if (var4 == null) {
         for(var10000 = var6 = 5 >> 3; var10000 < this.azj.length; var10000 = var6) {
            this.azj[var6++].setBorder((Border)null);
         }

      } else {
         for(var10000 = var6 = 0; var10000 < this.azj.length; var10000 = var6) {
            if (this.azj[var6].m == var2) {
               this.azj[var6].setBorder(BorderFactory.createLineBorder(Color.red, 5 >> 1));
            } else {
               this.azj[var6].setBorder((Border)null);
            }

            ++var6;
         }

         if (!var5) {
            this.azk.ane = null;
         }

         int var8;
         int var15;
         Class683 var25;
         RichLabel var31;
         if (var2 == (11231 & 24572)) {
            var25 = this;
            this.azk.bv.addText(var4.getSkillname());
         } else {
            label301: {
               String var14;
               if (var2 <= (11870 & 21997)) {
                  if ((var14 = apn(var2, var4, 1.0D, 1788 & 31179, --3)) != null) {
                     var25 = this;
                     this.azk.bv.addText(var14);
                     break label301;
                  }
               } else {
                  var14 = !this.uw().gameBattle && var2 != (18410 & 15639) ? so(var4.getRemark()) : var4.getRemark();
                  double var7;
                  StringBuffer var9;
                  int[] var10;
                  int var13;
                  String var28;
                  if (var2 == (19959 & 14075)) {
                     var7 = Math.pow((double)var1.getFriendliness(), 0.16666666666666666D);
                     var14 = var14.replace("{数值1}", Class394.ak(5.0D + 0.3D * var7 + 0.4D * Math.pow((double)var1.getZBone(this.aej), 0.5D), 2 ^ 3)).replace("{数值2}", Class394.ak(3.0D + 0.4D * var7 + 0.6D * Math.pow((double)var1.getZBone(this.aej), 0.5D), 3 >> 1)).replace("{数值3}", Class394.ak(2.0D + 0.2D * var7 + 0.2D * Math.pow((double)var1.getZSpeed(this.aej), 0.5D), --1)).replace("{数值4}", Class394.ak(3.5D + 0.2D * var7 + 0.3D * Math.pow((double)var1.getZSpeed(this.aej), 0.5D), 5 >> 2)).replace("{数值5}", Class394.ak(4.5D + 0.2D * var7 + 0.3D * Math.pow((double)var1.getZPower(this.aej), 0.5D), 2 ^ 3));
                     var25 = this;
                  } else if (var2 == (30143 & 3906)) {
                     var7 = 20.0D + CustomFunction.a(var1.getFriendliness(), 0.6D);
                     (var9 = new StringBuffer()).append(Class394.ak(var7, --1));
                     var9.append("#G/#R");
                     var9.append(Class394.ak(var7 * 1.1D, --1));
                     var9.append("#G/#R");
                     var9.append(Class394.ak(var7 * 1.2D, 4 ^ 5));
                     var9.append("#G/#R");
                     var9.append(Class394.ak(var7 * 1.85D, --1));
                     var10 = PetProperty.getPetHMASp(var1, this.vd());
                     var7 = 12.0D + CustomFunction.a(var1.getFriendliness(), 0.2D);
                     var7 = 1000.0D + var7 / 100.0D * (double)var10[4 ^ 5];
                     var14 = var14.replace("{数值1}", var9.toString()).replace("{数值2}", Class394.ak(var7, 5 >> 3));
                     var25 = this;
                  } else {
                     if (var2 >= (5435 & 28615) && var2 <= (26570 & 7485) || var2 == (12279 & 22397)) {
                        var15 = 0;
                        var8 = var4.getFormulas() != null ? var4.getFormulas().length : 0;

                        for(var10000 = var15; var10000 < var8; var10000 = var15) {
                           double var17 = 0.0D;
                           if (var2 == (9495 & 24556) && var15 >= (2 ^ 3) && var15 <= --4) {
                              var28 = var14;
                              var17 = var4.getFormulas()[var15].a((double)var1.getFriendliness(), 2 & 5, 2 & 5);
                           } else if (var2 == (24326 & 9727) && var15 == 0) {
                              var28 = var14;
                              var13 = Class224.n(var1.getGrade());
                              int var11 = Class224.p(var1.getGrade());
                              var17 = var4.getFormulas()[3 ^ 3].a(8000.0D + Math.sqrt((double)var1.getFriendliness()) * 4.0D, var11, var13);
                           } else {
                              Formula0 var12;
                              var17 = (var12 = (Formula0)var4.getFormulas()[var15]).getValue() + CustomFunction.a(var1.getFriendliness(), var12.getSv());
                              if (var2 == (3383 & 30667) && var15 == 5 >> 1) {
                                 var17 *= (double)(Math.max(var1.getZPower(this.aej), 118 & 59) / (100 & 127));
                              }

                              var28 = var14;
                           }

                           String var10001 = "{公式" + Class509.l(var15 + --1) + "}";
                           StringBuilder var10002 = (new StringBuilder("#R")).append(Class394.ak(var17, var17 < 200.0D ? --1 : 0)).append("#G");
                           ++var15;
                           var14 = var28.replace(var10001, var10002.toString());
                        }
                     }

                     var25 = this;
                  }

                  if (var25.uw().gameBattle || var2 == (15634 & 18415)) {
                     if (var4.getSkilltype().equals("4")) {
                        var15 = 3 ^ 3;

                        for(var10000 = var8 = 3 ^ 3; var10000 < this.azj.length; var10000 = var8) {
                           Skill var23 = this.azj[var8].m > 0 ? this.vc().bf(String.valueOf(this.azj[var8].m)) : null;
                           if (var23 != null && var23.getSkilltype().equals("3")) {
                              ++var15;
                           }

                           ++var8;
                        }

                        label189: {
                           var8 = 26623 & 7143;
                           if (var15 > 0) {
                              if (this.uw().n(1 ^ 3, 12)) {
                                 if (var15 == --1) {
                                    var8 = 4999;
                                    var28 = var14;
                                    break label189;
                                 }

                                 if (var15 == --2) {
                                    var8 = 9999;
                                    var28 = var14;
                                    break label189;
                                 }

                                 if (var15 >= --3) {
                                    var8 = 12999;
                                    var28 = var14;
                                    break label189;
                                 }
                              } else {
                                 if (this.uw().gameType == 5 >> 1) {
                                    var8 += var15 * 2000;
                                    var28 = var14;
                                    break label189;
                                 }

                                 var8 += var15 * 200;
                              }
                           }

                           var28 = var14;
                        }

                        var14 = var28.replace("0/999", var1.getTrainNum() + "/" + var8);
                        var25 = this;
                     } else if (var2 == 1288) {
                        var7 = 20.0D + CustomFunction.a(var1.getFriendliness(), 0.7D);
                        (var9 = new StringBuffer()).append(Class394.ak(var7, 1));
                        var9.append("#G/#R");
                        var9.append(Class394.ak(var7 * 1.2D, 1));
                        var9.append("#G/#R");
                        var9.append(Class394.ak(var7 * 1.4D, 1));
                        var9.append("#G/#R");
                        var9.append(Class394.ak(var7 * 2.0D, 1));
                        var10 = PetProperty.getPetHMASp(var1, this.vd());
                        var7 = 20.0D + CustomFunction.a(var1.getFriendliness(), 0.3D);
                        var7 = 1000.0D + var7 / 100.0D * (double)var10[1];
                        var14 = var14.replace("{数值1}", var9.toString()).replace("{数值2}", Class394.ak(var7, 0));
                        var25 = this;
                     } else {
                        if (var2 != 1267 && (var2 < 1282 || var2 > 1288) && var2 != 1909) {
                           var14 = app(var2, var4, var1);
                        }

                        var25 = this;
                     }

                     var25.azk.bv.addText(var14);
                     var25 = this;
                     break label301;
                  }

                  String[] var16 = var14.split("\\|");

                  for(var10000 = var8 = 0; var10000 < var16.length; var10000 = var8) {
                     String[] var20 = var16[var8].split("=");
                     if (var4.getSkilltype().equals("4") && var20[1].equals("0/999")) {
                        int var18 = 0;

                        for(var10000 = var13 = 0; var10000 < this.azj.length; var10000 = var13) {
                           Skill var21 = this.azj[var13].m > 0 ? this.vc().bf(String.valueOf(this.azj[var13].m)) : null;
                           if (var21 != null && var21.getSkilltype().equals("3")) {
                              ++var18;
                           }

                           ++var13;
                        }

                        String[] var30;
                        label221: {
                           var13 = 999;
                           if (var18 > 0) {
                              if (this.uw().gameType == --2) {
                                 var13 += 2000 * var18;
                                 var30 = var20;
                                 break label221;
                              }

                              var13 += 200 * var18;
                           }

                           var30 = var20;
                        }

                        boolean var10004 = true;
                        var30[1] = var1.getTrainNum() + "/" + var13;
                     }

                     String var19;
                     if ((var19 = apq(var16, var8)) != null) {
                        var31 = this.azk.bv;
                        ++var8;
                        var31.addText("#c" + var20[0] + " " + var20[1] + "#c" + var16[var8].split("=")[0] + var19 + "#r");
                     } else {
                        this.azk.bv.addText("#c" + var20[0] + " " + var20[1] + "#r");
                     }

                     ++var8;
                  }
               }

               var25 = this;
            }
         }

         Dimension var22 = var25.azk.bv.computeSize(205);
         var31 = this.azk.bv;
         int var26 = --3;
         int var10003 = --3;
         var31.setBounds(var26, --3, (int)var22.getWidth(), (int)var22.getHeight());
         var15 = var10003 + (int)var22.getHeight();
         if (var2 == 3036) {
            var15 += this.azk.rk(var3, var15);
            var25 = this;
         } else if (apm(var2, this.uw())) {
            if (var3 == -4 >> 2) {
               var8 = var1.getQLNum();

               int var24;
               for(var10000 = var24 = 0; var10000 < this.azj.length; var10000 = var24) {
                  if (this.azj[var24].m > 0 && this.azj[var24].j != -4 >> 2) {
                     --var8;
                  }

                  ++var24;
               }

               <undefinedtype> var27 = this.azk;
               int var29;
               if (var8 > 0) {
                  var29 = -4 >> 2;
                  var10003 = var15;
               } else {
                  var29 = -2;
                  var10003 = var15;
               }

               var15 += var27.fs(var29, var10003);
               var25 = this;
            } else {
               var15 += this.azk.fs(var3, var15);
               var25 = this;
            }
         } else {
            var15 += this.azk.fs(-3, var15);
            var25 = this;
         }

         var25.azk.setBounds(0, 0, 215, var15);
      }
   }

   public static String apk(String var0, String var1, int var2, Skill var3, double var4, int var6, int var7, String var8, int var9) {
      String var10 = null;
      String var10000;
      if (var0.equals("人数")) {
         var10000 = var10 = String.valueOf(FBUtil.i(var9, (int)var4, var8));
      } else {
         int var12;
         if (var0.equals("回合数")) {
            var12 = 5 >> 3;
            int var14;
            if (var2 <= (8183 & 25599) || var2 >= (31919 & 1919) && var2 <= (19703 & 14139)) {
               byte var13;
               var14 = var13 = 7;
            } else if (var2 <= (5119 & 28668)) {
               var14 = var12 = --3;
            } else {
               if (var2 <= (8058 & 25749) || var2 >= (5556 & 28287) && var2 <= (1727 & 32120)) {
                  var12 = 7;
               }

               var14 = var12;
            }

            var10000 = var10 = String.valueOf(var14);
         } else if (var0.equals("次数")) {
            var10000 = var10 = String.valueOf(var9 == --5 ? --3 : (var9 == --4 ? --5 : 2));
         } else {
            if (var0.startsWith("数值")) {
               var12 = var0.length() > (1 ^ 3) ? Class394.b(var0, 1 ^ 3, var0.length()) - (5 >> 2) : 0;
               Formula var11;
               if ((var11 = var3.getFormulaByIndex(var12)) == null) {
                  return var1;
               }

               var2 = (var2 - (20473 & 13295)) / --5;
               var4 = var11.a(var4, var6, var7);
               if (var12 == 0 && (var2 >= (14 & 121) && var2 <= (47 & 93) || var2 == (63 & 81) || var2 == (90 & 55) || var2 == (119 & 27))) {
                  var10000 = var10 = String.valueOf((int)var4);
                  return var10000 == null ? var1 : var1.replace("{" + var0 + "}", var10);
               }

               if (var12 == (3 & 5) && var2 == --3) {
                  var10000 = var10 = String.valueOf((int)var4);
                  return var10000 == null ? var1 : var1.replace("{" + var0 + "}", var10);
               }

               if (var12 == --3 && var2 == (79 & 63)) {
                  var10000 = var10 = String.valueOf((int)var4);
                  return var10000 == null ? var1 : var1.replace("{" + var0 + "}", var10);
               }

               if (var12 == --4 && var2 == (111 & 31)) {
                  var10000 = var10 = String.valueOf((int)var4);
                  return var10000 == null ? var1 : var1.replace("{" + var0 + "}", var10);
               }

               var10 = Class394.ak(var4, 4 ^ 5) + "%";
            }

            var10000 = var10;
         }
      }

      return var10000 == null ? var1 : var1.replace("{" + var0 + "}", var10);
   }

   public static String so(String var0) {
      Matcher var4 = Pattern.compile(">(.*?)<").matcher(var0);
      Matcher var2 = Pattern.compile("'#(.*?)'").matcher(var0);
      StringBuffer var3 = new StringBuffer();

      Matcher var10000;
      for(var10000 = var2; var10000.find(); var10000 = var2) {
         String var1 = var2.group();
         if (!var3.toString().equals("")) {
            var3.append("|");
         }

         var3.append(var1.split("'#")[3 >> 1].split("'")[3 & 4]);
      }

      StringBuffer var5 = new StringBuffer();

      for(var10000 = var4; var10000.find(); var10000 = var4) {
         String var7;
         if (!(var7 = var4.group()).equals("><")) {
            if (!var5.toString().equals("")) {
               var5.append("|");
            }

            var5.append(var7.split(">")[--1].split("<")[3 & 4]);
         }
      }

      StringBuffer var8 = new StringBuffer();
      String[] var10 = var3.toString().split("\\|");
      String[] var9 = var5.toString().split("\\|");

      int var6;
      for(int var11 = var6 = 2 & 5; var11 < var10.length && var6 < var9.length; var11 = var6) {
         if (!var8.toString().equals("")) {
            var8.append("|");
         }

         StringBuilder var10001 = (new StringBuilder(String.valueOf(var10[var6]))).append("=");
         String var10002 = var9[var6];
         ++var6;
         var8.append(var10001.append(var10002).toString());
      }

      return var8.toString();
   }

   public void apl(Object var1) {
      var1.setBounds((63 & 119) + (63 & 121) * this.xh.size(), 55 & 122, 127 & 55, 127 & 55);
      this.xh.add(var1);
      this.add(var1, 3 & 4);
   }

   public static boolean apm(int var0, GameClient var1) {
      if (var1.gameType == (1 ^ 3) && (var0 >= (32759 & 1614) && var0 <= (20057 & 14318) || var0 >= (1829 & 32766) && var0 <= (32566 & 2031) || var0 >= (26553 & 8054) && var0 <= (18299 & 16310) || var0 >= (16235 & 18399) && var0 <= (28653 & 5983) || var0 >= (10235 & 24413) && var0 <= (32731 & 1919) || var0 == (14207 & 20478))) {
         return false;
      } else {
         return (boolean)((var0 < (18164 & 16203) || var0 > (11991 & 22381)) && var0 != (26571 & 7807) && var0 != (13902 & 20477) && var0 != (14206 & 20381) && var0 != 1822 && var0 != 1831 && var0 != 1833 && (var0 < 1834 || var0 > 1836) && var0 != 1838 && var0 != 1839 && var0 != 1850 && var0 != 1852 && var0 != 1854 && var0 != 1858 && var0 != 1865 && (var0 < 1871 || var0 > 1873) && var0 != 1880 && var0 != 1884 && var0 != 1885 && var0 != 1606 && var0 != 1607 && var0 != 1608 && var0 != 1828 && var0 != 1829 && var0 != 1830 && var0 != 1841 && var0 != 1842 && var0 != 1867 && var0 != 1868 && var0 != 1869 && var0 != 1881 && var0 != 1882 && var0 != 1883 && var0 != 1890 && var0 != 1891 && var0 != 1895 && var0 != 1900 ? 2 & 5 : 1);
      }
   }

   public static String apn(int var0, Skill var1, double var2, int var4, int var5) {
      if (var0 >= (19449 & 14319) && var0 <= (28381 & 5486)) {
         if (var1.getFormulas() != null) {
            return ape(var0, var1, var2, var4, var5);
         } else {
            Skill var10002 = var1;
            Skill var10001 = var1;
            Skill var10000 = var1;
            Skill var10003 = var1;
            String var13 = var1.getRemark();
            var5 = Integer.parseInt(var10003.getSkilllevel());
            double var6 = Double.parseDouble(var10002.getGrow());
            double var8 = Double.parseDouble(var10001.getDielectric());
            double var10 = Double.parseDouble(var10000.getValue());
            String var12 = var0 <= (4093 & 29679) ? "混乱" : (var0 <= (16379 & 17398) ? "封印" : (var0 <= (12279 & 21503) ? "昏睡" : (var0 <= (9212 & 24575) ? "中毒" : (var0 <= (9885 & 23907) ? "震慑" : (var0 <= (5150 & 28647) ? "力量" : (var0 <= (11615 & 22187) ? "抗性" : (var0 <= (8188 & 25619) ? "加速" : (var0 <= (26207 & 7605) ? "风" : (var0 <= (15866 & 17951) ? "雷" : (var0 <= (23711 & 10111) ? "水" : (var0 <= (14326 & 19501) ? "火" : (var0 <= (12157 & 21675) ? "鬼火" : (var0 <= (7678 & 26159) ? "三尸虫" : (var0 <= 1075 ? "遗忘" : (var0 <= 1080 ? "smmh" : (var0 <= 1085 ? "霹雳" : (var0 <= 1090 ? "沧波" : (var0 <= 1095 ? "甘霖" : "扶摇"))))))))))))))))));
            var13 = var13.replace("|个数|", String.valueOf(FBUtil.i(var5, (int)var2, var12)));
            BigDecimal var14;
            String var15;
            if (var0 > 1015 && (var0 < 1071 || var0 > 1075)) {
               if (var0 <= 1020) {
                  var14 = new BigDecimal((double)((int)((var10 + var2 * var6 / 1000.0D) * 1000.0D)) / 15.0D * 17.0D);
                  var15 = var13.replace("|伤害|", var5 > --3 ? "15" : (var5 > --1 ? "12.5" : "10")).replace("|几率|", var14.setScale(--2, --4).toString()).replace("|回合|", "3");
               } else if (var0 <= 1040 || var0 >= 1076 && var0 <= 1080) {
                  var14 = new BigDecimal((double)((int)((var10 + var2 * var6 / 1000.0D) * 1000.0D)) / 10.0D);
                  var15 = var13.replace("|回合|", "7").replace("|伤害|", var14.setScale(1 ^ 3, --4).toString());
               } else if (var0 > 1065 && var0 < 1081) {
                  if (var0 <= 1070) {
                     var13 = var13.replace("|伤害|", String.valueOf((int)((var10 * (double)var4 + var2 * var6 / 1000.0D) * 1000.0D))).replace("|几率|", String.valueOf((int)(var10 * 100.0D + (double)((int)(var2 / 250.0D)))));
                  }

                  var15 = var13;
               } else {
                  var14 = new BigDecimal((var10 + var6 * (1.0D + 5.0D * var2 / 5000.0D * (10.0D - var2 / 5000.0D) / 2.0D)) * (double)var4);
                  var15 = var13.replace("|伤害|", String.valueOf(var14.intValue()));
               }
            } else {
               var14 = new BigDecimal(var10 + var6 * (new BigDecimal(Math.pow(var2, 0.3D))).setScale(5 >> 1, --4).doubleValue());
               var15 = var13.replace("|几率|", var14.setScale(1 ^ 3, --4).toString()).replace("|回合|", "7");
            }

            return var15.replace("|蓝|", String.valueOf((int)(var8 * (var2 / 25000.0D + 1.0D))));
         }
      } else {
         return null;
      }
   }

   public Skill apo() {
      return this.azk.ane;
   }

   public void w(RolePet var1) {
      this.lb = (boolean)(2 ^ 3);
      ActivitySeries var3;
      Activity var4;
      RoleData var8;
      ActivityPetManualRole var5 = (var4 = (var3 = (var8 = this.vd()).getObjectArea().br()).getActivityPetManual()) != null ? (ActivityPetManualRole)var8.getActivity(var4.getId()) : null;
      int var6 = 2 & 5;
      int var7 = 3 & 5;
      int[] var2 = var5 != null ? var5.a(var4, var3) : null;
      int var10001 = 4 ^ 5;
      this.azh.oy().clear();
      this.azh.ahr(new Class367("无契印", new Point(3 >> 2, 3 >> 2)));
      int var12 = var10001;
      int var13 = var2 != null ? var2.length : 0;

      for(int var10000 = var12; var10000 < var13; var10000 = var12) {
         if (var2[var12] > 0) {
            int var9 = var4.getPetManualSet().getSkillId(var12 - (2 ^ 3));
            Skill var10;
            if ((var10 = this.vc().bf(String.valueOf(var9))) != null) {
               if (var9 == var1.getQy()) {
                  var6 = var7;
               }

               RolePet var11;
               if ((var11 = var8.getRolePetQY(var9)) == null) {
                  this.azh.ahr(new Class367(var2[var12] + "级" + var10.getSkillname(), new Point(var9, var2[var12])));
               } else {
                  this.azh.ahr(new Class367(var2[var12] + "级" + var10.getSkillname() + "(" + var11.getPet().getSummoningname() + ")", new Point(var9, var2[var12])));
               }

               ++var7;
            }
         }

         ++var12;
      }

      var10001 = 3 ^ 3;
      this.azh.y(var6);
      this.lb = (boolean)var10001;
   }


   private static String app(int var0, Skill var1, RoleSummoning var2) {
      String var3 = var1.getRemark();
      int var4 = 5 >> 3;
      int var5 = 3 >> 2;
      String var10000 = var3;

      while((var4 = var10000.indexOf("{", var5)) != -4 >> 2) {
         if ((var5 = var3.indexOf("}", var4 + --1)) == -4 >> 2) {
            return var3;
         }

         String var6;
         if ((var6 = var3.substring(var4 + --1, var5)).indexOf("{") != -4 >> 2) {
            var10000 = var3;
            ++var4;
         } else {
            int var7 = var3.length();
            var3 = apg(var6, var3, var0, var1, var2);
            var5 += var3.length() - var7;
            var10000 = var3;
         }
      }

      return var3;
   }

   public void d() {
      int var10000;
      int var1;
      for(var10000 = var1 = 2 & 5; var10000 < this.xh.size(); var10000 = var1) {
         Object var2 = this.xh.get(var1);
         ++var1;
         ((<undefinedtype>)var2).setVisible((boolean)(5 >> 3));
      }

      for(var10000 = var1 = 3 & 4; var10000 < this.azj.length; var10000 = var1) {
         <undefinedtype> var3 = this.azj[var1];
         ++var1;
         var3.cf(-4 >> 2, -4 >> 2);
      }

      this.apj((RoleSummoning)null, 2 & 5, 2 & 5, (Skill)null, (boolean)(5 >> 2));
   }

   public void q() {
      RoleData var1;
      if ((var1 = this.vd()) != null) {
         this.v(var1.getChosePet());
         super.q();
      }
   }

   public void v(RoleSummoning var1) {
      this.co = var1 != null ? var1.getSid() : null;
      this.d();
      if (var1 != null) {
         ArrayList var5 = new ArrayList();
         int var4;
         int var10000;
         if (var1.getPetSkills() != null && !var1.getPetSkills().equals("")) {
            String[] var7 = var1.getPetSkills().split("\\|");

            for(var10000 = var4 = 3 & 4; var10000 < var7.length; var10000 = var4) {
               if (!var7[var4].startsWith("L") && !var7[var4].startsWith("Q") && !var7[var4].startsWith("T") && !var7[var4].startsWith("X")) {
                  var5.add(var7[var4]);
               }

               ++var4;
            }
         }

         int var13 = var1.getOpenSealByType(3 >> 2);
         var4 = var1.getOpenSealByType(4 ^ 5);

         int var2;
         int var3;
         int var8;
         for(var10000 = var2 = 2 & 5; var10000 < 9; var10000 = var2) {
            if (var2 >= var13) {
               if (this.uw().gamePetSkill && var2 >= var4) {
                  this.azj[var2].cf(-2 & -1, -4 >> 2);
               } else {
                  this.azj[var2].cf(-4 >> 2, -4 >> 2);
               }
            } else if (var2 == (71 & 62) && var1.getBeastSkills() != null && !var1.getBeastSkills().equals("")) {
               this.azj[39 & 94].cf(Integer.parseInt(var1.getBeastSkills()), -4 >> 2);
            } else if (var2 < (39 & 94) && var5 != null && var2 < var5.size() || var2 > (62 & 71) && var5 != null && var2 - --1 < var5.size()) {
               String var6;
               var8 = (var3 = (var6 = (String)var5.get(var2 < (119 & 14) ? var2 : var2 - --1)).indexOf("=")) == -4 >> 2 ? -4 >> 2 : Integer.parseInt(var6.substring(var3 + (5 >> 2)));
               this.azj[var2].cf(Integer.parseInt(var3 == -4 >> 2 ? var6 : var6.substring(3 ^ 3, var3)), var8);
            } else {
               this.azj[var2].cf(var2 == (78 & 55) && !var1.getSsn().equals("2") && !var1.getSsn().equals("3") && !var1.getSsn().equals("4") ? -2 & -1 : 0, -1);
            }

            ++var2;
         }

         var2 = 3 >> 2;
         if (var1.getSkill() != null && !var1.getSkill().equals("")) {
            String[] var11 = var1.getSkill().split("\\|");

            for(var10000 = var3 = 2 & 5; var10000 < var11.length; var10000 = var3) {
               Skill var14;
               if ((var14 = this.vc().bf(var11[var3])) != null) {
                  <undefinedtype> var10 = this.apd(var2);
                  ++var2;
                  var10.setVisible((boolean)(2 ^ 3));
                  var10.cf(Integer.parseInt(var14.getSkillid()), -4 >> 2);
               }

               ++var3;
            }
         }

         Skill var12;
         if ((var12 = this.vc().bf("3036")) != null) {
            <undefinedtype> var9 = this.apd(var2);
            ++var2;
            var9.setVisible((boolean)(5 >> 2));
            var8 = var1.getTFNum();
            var9.cf(Integer.parseInt(var12.getSkillid()), var8 > 0 ? var8 : -1);
            var9.setBounds(6655 & 26594, 55 & 122, 119 & 63, 119 & 63);
            if (this.uw().gamePetManual) {
               this.w(this.vd().getRolePet(var1.getSid().longValue()));
            }

         }
      }
   }

   public static String apq(String[] var0, int var1) {
      String[] var2;
      return var0.length <= var1 + (5 >> 2) || (var2 = var0[var1 + (3 & 5)].split("=")).length <= 3 >> 1 || !var2[--1].equals("{公式一}") && !var2[--1].equals("{公式二}") && !var2[2 ^ 3].equals("{公式三}") && !var2[5 >> 2].equals("{公式四}") && !var2[--1].equals("{公式五}") ? null : "1";
   }
}
