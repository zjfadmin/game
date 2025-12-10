package com.xy;

import com.xy.bean.PayvipBean;
import com.xy.bean.UseCardBean;
import com.xy.entity.Baby;
import com.xy.entity.Lingbao;
import com.xy.formula.Arith;
import com.xy.formula.BaseEquip;
import com.xy.formula.BaseGemOld;
import com.xy.formula.BaseValue;
import com.xy.formula.BaseXuanBao;
import com.xy.formula.ExpUtil;
import com.xy.formula.GoodType;
import com.xy.formula.MsgUntil;
import com.xy.formula.PropertyUtil;
import com.xy.formula.QualityZW;
import com.xy.formula.SkillUtil;
import com.xy.game.RoleData;
import com.xy.readbean.BabyResult;
import com.xy.readbean.Buff;
import com.xy.readbean.Eshop;
import com.xy.readbean.GemOld;
import com.xy.readbean.Goodstable;
import com.xy.readbean.RoleSuitBean;
import com.xy.readbean.RoleTxBean;
import com.xy.readbean.Shop;
import com.xy.readbean.Skill;
import com.xy.readbean.StallBuyData;
import com.xy.readbean.StarSoul;
import com.xy.readbean.Talent;
import com.xy.readbean.XuanBao;
import com.xy.readbean.XuanYin;
import com.xy.richtext.RichLabel;
import com.xy.text.GameView;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Point;
import java.awt.RenderingHints;
import java.awt.image.ImageObserver;
import java.math.BigDecimal;
import java.util.Iterator;
import java.util.Map;

public class Class270 extends Class345 {
   private int gw;
   private RichLabel aj;
   private RichLabel q;
   private RichLabel bv;
   private boolean lc;
   private Class436 bl;
   private boolean op;

   public void r(boolean var1) {
      int var10000 = 4605 & 28522;
      this.bl.setVisible((boolean)(--1));
      this.aj.setBounds(9867 & 23030, --5, this.aj.getWidth(), this.aj.getHeight());
      this.q.setBounds(19406 & 13491, (31 & 106) + this.aj.getHeight(), this.q.getWidth(), this.q.getHeight());
      int var2 = var10000;
      int var3 = Math.max(14526 & 18381, (118 & 29) + this.q.getHeight() + this.aj.getHeight());
      Point var4 = var1 ? this.ux().vn(var2, var3) : this.ux().abg(var2, var3);
      this.vf(var4.x, var4.y, var2, var3);
      this.ve().a(this.ae());
   }

   public void px(String var1) {
      if (!Class394.o(var1)) {
         this.o();
         this.q.setFont(Class681.q);
         this.q.setTextSize(var1, 16895 & 16127);
         this.p();
      }
   }

   public void rb(StringBuffer var1, String var2, String var3, long var4) {
      if (var3 != null && !var3.equals("")) {
         String[] var12 = var3.split("\\|");
         String var6 = null;

         int var7;
         for(int var10000 = var7 = 2 & 5; var10000 < var12.length; var10000 = var7) {
            if (var12[var7].startsWith(GoodType.Extras[3 & 4])) {
               var6 = this.st(var1, var12[var7], var4);
            } else if (var12[var7].startsWith(GoodType.Extras[3 >> 1])) {
               this.ro(var1, var12[var7]);
            } else if (var12[var7].startsWith(GoodType.Extras[--2])) {
               this.re(var1, var12[var7], var4);
            } else if (var12[var7].startsWith(GoodType.Extras[--3])) {
               this.sl(var1, var12[var7]);
            } else if (var12[var7].startsWith(GoodType.Extras[--4])) {
               this.rv(var1, var12[var7]);
            } else if (var12[var7].startsWith(GoodType.Extras[--5])) {
               this.rh(var1, var12[var7]);
            } else if (var12[var7].startsWith(GoodType.Extras[119 & 14])) {
               this.sc(var1, var12[var7], var6);
            } else {
               String[] var8 = var12[var7].split("=");
               if (var1.length() != 0) {
                  var1.append("#r");
               }

               if (!var8[3 ^ 3].equals("装备角色") && !var8[3 ^ 3].equals("等级") && !var8[3 & 4].equals("装备等级") && !var8[5 >> 3].equals("阶数") && !var8[2 & 5].equals("等级要求") && !var8[5 >> 3].equals("力量要求") && !var8[5 >> 3].equals("灵性要求") && !var8[2 & 5].equals("根骨要求") && !var8[5 >> 3].equals("敏捷要求") && !var8[3 & 4].equals("套装品质") && !var8[2 & 5].equals("声望要求")) {
                  if (var8[5 >> 3].equals("装备部位")) {
                     String var14;
                     if ((var14 = MsgUntil.g(var8[5 >> 2], (boolean)(3 & 5))) != null) {
                        var8[3 >> 1] = var14;
                     }

                     var2 = rs(var1, var2, "#cFFFFFF");
                     var1.append("【装备部位】");
                     var1.append(var8[1]);
                  } else if (!var8[0].equals("性别要求") && !var8[0].equals("性别")) {
                     if (!var8[0].equals("HP") && !var8[0].equals("MP") && !var8[0].equals("HP%") && !var8[0].equals("MP%") && !var8[0].equals("经验") && !var8[0].equals("亲密") && !var8[0].equals("钱") && !var8[0].equals("点")) {
                        if (!var8[0].equals("力量") && !var8[0].equals("灵性") && !var8[0].equals("根骨") && !var8[0].equals("敏捷")) {
                           if (var8[0].equals("培养")) {
                              var2 = rs(var1, var2, "#c00ffff");
                              var1.append(var8[0]);
                              var1.append(" ");
                              var1.append(sk(var8[1]));
                           } else if (var8[0].equals("品质")) {
                              var2 = rs(var1, var2, "#c1E90FF");
                              var1.append(var8[0]);
                              var1.append(" ");
                              var1.append(sk(var8[1]));
                           } else if (!var8[0].equals("坐标") && !var8[0].equals("内丹等级")) {
                              if (var8[0].equals("次数")) {
                                 var2 = rs(var1, var2, "#cFFFF33");
                                 var1.append(var8[1]);
                              } else if (var8[0].equals("炼妖次数")) {
                                 var2 = rs(var1, var2, "#c00BFFF");
                                 var1.append(var8[0]);
                                 var1.append(" ");
                                 var1.append(sk(var8[1]));
                              } else if (!var8[0].equals("描述") && !var8[0].equals("名称")) {
                                 if (!var8[0].equals("传送") && !var8[0].equals("宝图")) {
                                    if (var8[0].equals("可用次数")) {
                                       var2 = rs(var1, var2, "#cFFFF33");
                                       var1.append("还可以使用");
                                       var1.append(var8[1]);
                                       var1.append("次");
                                    } else if (var8[0].equals("技能")) {
                                       if (var4 != 112L) {
                                          var2 = rs(var1, var2, "#cFFFF33");
                                          var1.append("技能:#G");
                                          var1.append(var8[1]);
                                       }
                                    } else if (var8[0].equals("技能等级")) {
                                       var2 = rs(var1, var2, "#cFFFF33");
                                       var1.append("技能等级:#G");
                                       var1.append(var8[1]);
                                    } else if (var8[0].equals("耐久")) {
                                       if (this.uw().gameType == 5 >> 1) {
                                          int var13 = var8[1].indexOf(",");
                                          var8[1] = var8[1].substring(0, var13 != -4 >> 2 ? var13 : var8[1].length());
                                          var2 = rs(var1, var2, "cFEFF72");
                                          var1.append("耐久 ");
                                          var1.append(var8[1]);
                                       } else {
                                          var2 = rs(var1, var2, "#cFFFF33");
                                          var1.append("耐久:#G");
                                          var1.append(var8[1].split(",")[0]);
                                       }
                                    } else if (var8[0].equals("场数")) {
                                       var1.append("");
                                    } else if (var8.length > 1 && !var8[0].equals("召唤兽") && !var8[0].equals("物品") && !var8[0].equals("标签") && !var8[0].equals("值") && !var8[0].equals("皮肤") && !var8[0].equals("方向") && !var8[0].equals("变身卡类") && !var8[0].equals("lvl") && !var8[0].equals("刮奖") && !var8[0].equals("卡类") && !var8[0].equals("持续时间") && !var8[0].equals("读条")) {
                                       var2 = rs(var1, var2, "#cDEDE9E");
                                       var1.append(var8[0]);
                                       var1.append(" ");
                                       var1.append(sk(var8[1]));
                                       var1.append(so(var8[0]));
                                    }
                                 } else {
                                    String[] var9 = var8[1].split(",");
                                    int var10 = Integer.parseInt(var9[1 ^ 3]) / (119 & 28);
                                    int var11 = Integer.parseInt(var9[--3]) / (28 & 119);
                                    var2 = rs(var1, var2, "#cFFFF33");
                                    var1.append("坐标: ");
                                    var1.append(var9[1]);
                                    var1.append("(");
                                    var1.append(var10);
                                    var1.append(",");
                                    var1.append(var11);
                                    var1.append(")");
                                 }
                              } else {
                                 var2 = rs(var1, var2, "#c00BFFF");
                                 var1.append(var8[1]);
                              }
                           } else {
                              var2 = rs(var1, var2, "#cFFFF33");
                              var1.append(var8[0]);
                              var1.append(":");
                              var1.append(sk(var8[1]));
                           }
                        } else {
                           var2 = rs(var1, var2, "#cCCCC99");
                           var1.append(var8[0]);
                           var1.append(" ");
                           var1.append(sk(var8[1]));
                        }
                     } else {
                        var2 = rs(var1, var2, "#cFFFFFF");
                        var1.append(var8[0]);
                        var1.append(" ");
                        var1.append(sk(var8[1]));
                     }
                  } else {
                     var2 = rs(var1, var2, "#cFFFFFF");
                     var1.append("【性别要求】");
                     var1.append(var8[1].equals("1") ? "男" : (var8[1].equals("0") ? "女" : "全部性别"));
                  }
               } else {
                  var2 = rs(var1, var2, "#cFFFFFF");
                  var1.append("【");
                  var1.append(var8[2 & 5]);
                  var1.append("】");
                  var1.append(var8[--1]);
               }
            }

            ++var7;
         }

      }
   }

   public void rc(Baby var1, Talent var2, int var3, boolean var4, String var5, int var6) {
      this.o();
      StringBuffer var7 = new StringBuffer();
      int var8;
      if ((var8 = var2.getText().indexOf("|")) == -4 >> 2) {
         var8 = var2.getText().length();
      }

      String var9 = var4 ? var2.getText().substring(3 & 4, var8) : var2.getText().substring(var8 + (5 >> 2));
      int var10000;
      Class270 var23;
      if (var4) {
         double var10;
         Map var17;
         double var12 = var10 = (Double)(var17 = var1.getBabyMap(this.vd())).get(BaseValue.babyTotal3);

         int var14;
         for(var10000 = var14 = 11 & 125; var10000 <= 10; var10000 = var14) {
            Double var15;
            if ((var15 = (Double)var17.get(BaseValue.babyKeys[var14])) != null) {
               if (var15 > 400.0D) {
                  var15 = 400.0D + (var15 - 400.0D) / 6.4D;
               }

               var12 += var10 * var15 * 0.002D;
            }

            ++var14;
         }

         double var21;
         String var22;
         label102: {
            var21 = (var12 /= 100.0D) * var2.getTouch();
            if (var2.getId() > (14333 & 19434)) {
               int var16;
               Double var19;
               if (((var16 = (var2.getId() - (17405 & 16363)) / --2) < (62 & 71) || var16 > (25 & 111)) && var16 != (63 & 87)) {
                  if ((var19 = (Double)var17.get(var2.getTalentName() + "发动几率增加")) != null && var19 != 0.0D) {
                     var21 += var19;
                  }
               } else if ((var19 = (Double)var17.get(var2.getTalentName() + "吸收伤害增加")) != null && var19 != 0.0D) {
                  var21 += var19;
                  var22 = var9;
                  break label102;
               }
            }

            var22 = var9;
         }

         var9 = var22.replace("{数值}", Class394.ak(var21, 1 ^ 3));
         var23 = this;
         var7.append("#W");
         var7.append(var2.getTalentName());
         var7.append("#r");
         var7.append(var9);
         var7.append("#r");
         var7.append(this.sb(var2.getDemand(), var3));
         Class271.d(var17);
      } else {
         String[] var18;
         if ((var18 = var2.getValue().split("\\|")).length == (1 ^ 3)) {
            var18 = var18[4 ^ 5].split("=")[5 >> 2].split("\\+");
            double var10002 = Double.parseDouble(var18[3 & 4]);
            double var10003;
            int var10004;
            if (var18.length > --1) {
               var10003 = Double.parseDouble(var18[--1]);
               var10004 = var3;
            } else {
               var10003 = 0.0D;
               var10004 = var3;
            }

            var9 = var9.replace("{数值}", Class394.ak(var10002 + var10003 * (double)var10004, 5 >> 1));
         }

         var7.append("#W强化");
         var7.append(var2.getTalentName());
         var7.append(" ");
         var7.append(var3);
         var7.append("级#r");
         var7.append(var9);
         var7.append("#r");
         if (Class394.o(var5)) {
            var7.append("#r#G还未获取结局,不可强化此技能格子");
            return;
         }

         if (var3 >= (58 & 79)) {
            var23 = this;
            var7.append("#G已经达到最高级别了");
         } else {
            var7.append("#G可以通过点击技能格子消耗琼浆玉液来强化此技能,有几率成功");
            var23 = this;
         }

         BabyResult var20 = var23.vc().bi(var5);
         int var11 = 3 ^ 3;
         if (var6 == 0) {
            var10000 = var20.getQ1();
         } else if (var6 == 5 >> 2) {
            var10000 = var20.getQ2();
         } else {
            if (var6 == (1 ^ 3)) {
               var11 = var20.getQ3();
            }

            var10000 = var11;
         }

         switch(var10000) {
         case 0:
            while(false) {
            }

            var7.append("#r#G此技能格可强化天资:不可强化");
            var23 = this;
            break;
         case 1:
            var7.append("#r#G此技能格可强化天资:可强化低级人族天资");
            var23 = this;
            break;
         case 2:
            var7.append("#r#G此技能格可强化天资:可强化低级魔族天资");
            var23 = this;
            break;
         case 3:
            var7.append("#r#G此技能格可强化天资:可强化低级仙族天资");
            var23 = this;
            break;
         case 4:
            var7.append("#r#G此技能格可强化天资:可强化低级鬼族天资");
            var23 = this;
            break;
         case 5:
            var7.append("#r#G此技能格可强化天资:可强化全部低级天资");
            var23 = this;
            break;
         case 6:
            var7.append("#r#G此技能格可强化天资:可强化高级人族天资");
            var23 = this;
            break;
         case 7:
            var7.append("#r#G此技能格可强化天资:可强化高级魔族天资");
            var23 = this;
            break;
         case 8:
            var7.append("#r#G此技能格可强化天资:可强化高级仙族天资");
            var23 = this;
            break;
         case 9:
            var7.append("#r#G此技能格可强化天资:可强化高级鬼族天资");
            var23 = this;
            break;
         case 10:
            var7.append("#r#G此技能格可强化天资:可强化全部高级天资");
            var23 = this;
            break;
         case 11:
            var7.append("#r#G此技能格可强化天资:可强化全部天资");
         default:
            var23 = this;
         }
      }

      var23.q.setTextSize(var7.toString(), 17407 & 15615);
      this.p();
   }

   public void rd(StringBuffer var1, String var2) {
      String[] var14 = var2.split("&");
      double var3 = 1.0D;
      int var5;
      int var6 = (var5 = Integer.parseInt(var14[4 ^ 5])) >> --5 & 63 & 95;
      var5 &= 63 & 95;
      StringBuffer var7 = null;

      int var8;
      int var10;
      int var10000;
      for(var10000 = var8 = --4; var10000 < var14.length; var10000 = var8) {
         Skill var9;
         if (var14[var8].startsWith("特技=") && (var9 = this.vc().bf(var14[var8].substring(--3))) != null) {
            StringBuffer var17;
            if ((var10 = Integer.parseInt(var9.getSkillid())) == (24575 & 16313)) {
               var3 += 0.15D;
               var17 = var7;
            } else {
               if (var10 == (8127 & 32762)) {
                  var3 += 0.25D;
               }

               var17 = var7;
            }

            if (var17 == null) {
               var7 = new StringBuffer("特技");
            }

            var7.append("#r");
            var7.append(var9.getSkillname());
         }

         ++var8;
      }

      String var15 = rs(var1, (String)null, "#cBD7F3F");

      int var16;
      for(var10000 = var16 = --2; var10000 < 4 && var16 < var14.length; var10000 = var16) {
         if (!var14[var16].startsWith("特技=") && (var10 = var14[var16].indexOf("=")) != -4 >> 2) {
            String var11 = var14[var16].substring(3 >> 2, var10);
            var10 = var14[var16].indexOf("#", var11.length() + (3 & 5));
            double var12 = QualityZW.getDouble(var14[var16].substring(var11.length() + (4 ^ 5), var10)) * (double)(var16 == (1 ^ 3) ? var6 : var5) + QualityZW.getDouble(var14[var16].substring(var10 + --1));
            if (var3 != 1.0D) {
               var12 *= var3;
            }

            if (var1.length() != 0) {
               var1.append("#r");
            }

            var1.append(var11);
            var1.append(" ");
            var1.append(Class394.ak(var12, --1));
            var1.append(so(var11));
         }

         ++var16;
      }

      if (var1.length() != 0) {
         var1.append("#r");
      }

      var1.append("总点粹值:");
      var1.append(var6 + var5);
      if (var7 != null) {
         if (var1.length() != 0) {
            var1.append("#r");
         }

         var15 = rs(var1, (String)null, "#c868090");
         var1.append(var7);
      }

   }

   public void re(StringBuffer var1, String var2, long var3) {
      String var5 = null;
      String[] var8 = var2.split("&");

      int var6;
      for(int var10000 = var6 = 4 ^ 5; var10000 < var8.length; var10000 = var6) {
         String[] var7 = var8[var6].split("=");
         if (var1.length() != 0) {
            var1.append("#r");
         }

         var5 = rs(var1, var5, GoodType.c(var3) ? "#c00EAFF" : "#cBE9786");
         var1.append(var7[5 >> 3]);
         var1.append(" ");
         var1.append(sk(var7[--1]));
         int var10005 = 3 >> 2;
         ++var6;
         var1.append(so(var7[var10005]));
      }

   }

   public String rf(String var1) {
      if (var1.equals("朱雀")) {
         return "瑕疵:略微减少全队冰混睡忘抗性";
      } else if (var1.equals("青龙")) {
         return "瑕疵:略微减少全队仙法抗性";
      } else if (var1.equals("白虎")) {
         return "瑕疵:略微减少全队鬼火、三尸虫抗性";
      } else if (var1.equals("玄武")) {
         return "瑕疵:略微减少全队震慑抗性";
      } else if (var1.equals("金牛")) {
         return "本方所有人物、召唤兽对敌方造成的物理伤害有一定的加成";
      } else if (var1.equals("火猿")) {
         return "若对方灵宝对本方任意单位造成伤害，抵抗一定程度伤害；每2回合可生效一次";
      } else if (var1.equals("赤马")) {
         return "本方所有人物、召唤兽获得一定经验加成";
      } else {
         return var1.equals("黄鹤") ? "本方所有人物增加冰混睡忘抗性" : "本方所有人物、召唤兽的仙法、鬼火、震慑有一定加成";
      }
   }

   public void rg(RoleTxBean var1) {
      int var10001 = 3 ^ 3;
      this.o();
      this.bl.hf(Class222.i("tx" + var1.getRdId()));
      this.aj.setTextSize("#cFFFF75" + var1.getRdName(), 27127 & 5855);
      this.q.setTextSize(var1.getRdAsk(), 3551 & 29431);
      this.r((boolean)var10001);
   }

   public void la(String var1) {
      if (!Class394.o(var1)) {
         int var10003 = 127 & 15;
         this.o();
         this.q.setFont(Class681.ab);
         this.q.setTextSize(var1, 10750 & 22197);
         this.q.setBounds(31 & 103, 31 & 103, this.q.getWidth(), this.q.getHeight());
         int var3 = var10003 + this.q.getWidth();
         int var2 = (31 & 110) + this.q.getHeight();
         Point var10002 = this.ux().abg(var3, var2);
         this.vf(var10002.x, var10002.y, var3, var2);
         this.ve().a(this.ae());
      }
   }

   public void rh(StringBuffer var1, String var2) {
      String[] var7 = var2.split("&");
      Skill var6 = this.vc().bf(var7[2 ^ 3]);
      if (var1.length() != 0) {
         var1.append("#r");
      }

      long var4 = ExpUtil.d(Long.parseLong(var7[--3]));
      String var3 = rs(var1, (String)null, "#cFFFF00");
      var1.append("【觉醒技】 ");
      var1.append(var6.getSkillname());
      var1.append("(");
      var1.append(var7[--2]);
      var1.append(")");
      if (var1.length() != 0) {
         var1.append("#r");
      }

      var3 = rs(var1, var3, "#cFFFFFF");
      var1.append("【觉醒技等级】 ");
      var1.append(var4);
      if (var1.length() != 0) {
         var1.append("#r");
      }

      var3 = rs(var1, var3, "#cFFFFFF");
      var1.append("【类型】 通用");
      if (var1.length() != 0) {
         var1.append("#r");
      }

      var3 = rs(var1, var3, "#c00FF00");
      var1.append(ry(var6.getRemark(), var6, var7[1 ^ 3], String.valueOf(var4)));
      if (var1.length() != 0) {
         var1.append("#r");
      }

      rs(var1, var3, "#cC5C583");
      var1.append("铃、环、甲觉醒三合一，觉醒技方可生效");
   }

   public void ri(StringBuffer var1, String var2, String var3, long var4, Integer var6) {
      if (!Class394.o(var3)) {
         String[] var17 = var3.split("\\|");
         String var7 = null;
         String var10;
         int var10000;
         if (var4 != 779L) {
            String var8 = null;
            String var9 = null;
            var10 = null;
            String var11 = null;
            String var12 = null;
            String var13 = null;
            int var14;
            var10000 = var14 = 2 & 5;

            String var22;
            while(true) {
               if (var10000 >= var17.length) {
                  var22 = var9;
                  break;
               }

               if (var17[var14] != null) {
                  if (var17[var14].indexOf("&") != -4 >> 2) {
                     var22 = var9;
                     break;
                  }

                  int var15;
                  if ((var15 = var17[var14].indexOf("=")) != -4 >> 2) {
                     String var16;
                     if ((var16 = var17[var14].substring(3 & 4, var15)).equals("等级") | var16.equals("阶数")) {
                        var11 = var16;
                        var12 = var17[var14].substring(var15 + (5 >> 2));
                        var17[var14] = null;
                     } else if (var16.equals("套装品质")) {
                        var8 = var17[var14].substring(var15 + (4 ^ 5));
                        var17[var14] = null;
                     } else if (var16.equals("装备部位")) {
                        var9 = var17[var14].substring(var15 + (5 >> 2));
                        var17[var14] = null;
                     } else if (!var16.equals("性别要求") && !var16.equals("性别")) {
                        if (var16.equals("装备角色")) {
                           var13 = var17[var14].substring(var15 + (5 >> 2));
                           var17[var14] = null;
                        }
                     } else {
                        var10 = var17[var14].substring(var15 + (4 ^ 5));
                        var17[var14] = null;
                     }
                  }
               }

               ++var14;
               var10000 = var14;
            }

            if (var22 == null) {
               var9 = String.valueOf(GoodType.ai(var4));
            }

            if (var13 == null && var10 == null) {
               var10 = "2";
            }

            String var21;
            if (var8 != null) {
               if (var1.length() != 0) {
                  var1.append("#r");
               }

               var2 = rs(var1, var2, "#cFFFFFF");
               var1.append("【套装品质】");
               var1.append(var8);
               var8 = null;
               if (var9 != null) {
                  if ((var21 = MsgUntil.g(var9, (boolean)(--1))) != null) {
                     var9 = var21;
                  }

                  if (var1.length() != 0) {
                     var1.append("#r");
                  }

                  var2 = rs(var1, var2, "#cFFFFFF");
                  var1.append("【装备部位】");
                  var1.append(var9);
                  var9 = null;
               }

               if (var10 != null) {
                  if (var1.length() != 0) {
                     var1.append("#r");
                  }

                  var2 = rs(var1, var2, "#cFFFFFF");
                  var1.append("【装备角色】");
                  var1.append(var10.equals("1") ? "男性角色" : (var10.equals("0") ? "女性角色" : "所有"));
                  var10 = null;
               }

               if (var13 != null) {
                  if (var1.length() != 0) {
                     var1.append("#r");
                  }

                  var2 = rs(var1, var2, "#cFFFFFF");
                  var1.append("【装备角色】");
                  var1.append(var13);
                  var13 = null;
               }

               if (var11 != null) {
                  if (var1.length() != 0) {
                     var1.append("#r");
                  }

                  var2 = rs(var1, var2, "#cFFFFFF");
                  var1.append("【");
                  var1.append(var11);
                  var1.append("】");
                  var1.append(var12);
               }
            } else {
               if (var11 != null) {
                  if (var1.length() != 0) {
                     var1.append("#r");
                  }

                  var2 = rs(var1, var2, "#cFFFFFF");
                  var1.append("【");
                  var1.append(var11);
                  var1.append("】");
                  var1.append(var12);
               }

               if (var9 != null) {
                  if ((var21 = MsgUntil.g(var9, (boolean)(5 >> 3))) != null) {
                     var9 = var21;
                  }

                  if (var1.length() != 0) {
                     var1.append("#r");
                  }

                  var2 = rs(var1, var2, "#cFFFFFF");
                  var1.append("【装备部位】");
                  var1.append(var9);
                  var9 = null;
               }

               if (var10 != null) {
                  if (var1.length() != 0) {
                     var1.append("#r");
                  }

                  var2 = rs(var1, var2, "#cFFFFFF");
                  var1.append("【装备角色】");
                  var1.append(var10.equals("1") ? "男性角色" : (var10.equals("0") ? "女性角色" : "所有"));
                  var10 = null;
               }

               if (var13 != null) {
                  if (var1.length() != 0) {
                     var1.append("#r");
                  }

                  var2 = rs(var1, var2, "#cFFFFFF");
                  var1.append("【装备角色】");
                  var1.append(var13);
                  var13 = null;
               }
            }
         }

         int var18;
         for(var10000 = var18 = 0; var10000 < var17.length; var10000 = var18) {
            if (var17[var18] != null) {
               if (var17[var18].startsWith(GoodType.Extras[3 & 4])) {
                  var7 = this.st(var1, var17[var18], var4);
               } else if (var17[var18].startsWith(GoodType.Extras[2 ^ 3])) {
                  this.ro(var1, var17[var18]);
               } else if (var17[var18].startsWith(GoodType.Extras[--2])) {
                  this.re(var1, var17[var18], var4);
               } else if (var17[var18].startsWith(GoodType.Extras[--3])) {
                  this.sl(var1, var17[var18]);
               } else if (var17[var18].startsWith(GoodType.Extras[--4])) {
                  this.rv(var1, var17[var18]);
               } else if (var17[var18].startsWith(GoodType.Extras[--5])) {
                  this.rh(var1, var17[var18]);
               } else if (var17[var18].startsWith(GoodType.Extras[78 & 55])) {
                  this.sc(var1, var17[var18], var7);
               } else if (var17[var18].startsWith(GoodType.Extras[72 & 63])) {
                  this.rd(var1, var17[var18]);
               } else if (var17[var18].startsWith(GoodType.Extras[95 & 41])) {
                  this.ru(var1, var17[var18]);
               } else {
                  String[] var20 = var17[var18].split("=");
                  if (var1.length() != 0) {
                     var1.append("#r");
                  }

                  if (!var20[3 ^ 3].equals("等级") && !var20[3 ^ 3].equals("阶数")) {
                     if (!var20[3 >> 2].equals("装备角色") && !var20[3 & 4].equals("装备等级") && !var20[5 >> 3].equals("套装品质")) {
                        if (var20[0].equals("最高携带等级")) {
                           var2 = rs(var1, var2, this.uw().gameType == (1 ^ 3) ? "#c00FFFF" : "#cFFFFFF");
                           var1.append("【");
                           var1.append(var20[0]);
                           var1.append("】");
                           var1.append(var20[1]);
                        } else if (!var20[0].equals("力量要求") && !var20[0].equals("灵性要求") && !var20[0].equals("根骨要求") && !var20[0].equals("敏捷要求") && !var20[0].equals("等级要求") && !var20[0].equals("声望要求")) {
                           if (var20[0].equals("装备部位")) {
                              if ((var10 = MsgUntil.g(var20[1], true)) != null) {
                                 var20[1] = var10;
                              }

                              var2 = rs(var1, var2, "#cFFFFFF");
                              var1.append("【装备部位】");
                              var1.append(var20[1]);
                           } else if (!var20[0].equals("性别要求") && !var20[0].equals("性别")) {
                              if (var20[0].equals("耐久")) {
                                 if (this.uw().gameType == 5 >> 1) {
                                    int var19 = var20[1].indexOf(",");
                                    var20[1] = var20[1].substring(0, var19 != -4 >> 2 ? var19 : var20[1].length());
                                    var2 = rs(var1, var2, "#cFEFF72");
                                    var1.append("耐久 ");
                                    var1.append(var20[1]);
                                 } else {
                                    var2 = rs(var1, var2, "#cFFFF33");
                                    var1.append("耐久:#G");
                                    var1.append(var20[1].split(",")[0]);
                                 }
                              } else if (var20.length > 1) {
                                 var2 = rs(var1, var2, this.uw().gameType == (1 ^ 3) ? "#cFEFF72" : "#cFFFF75");
                                 var1.append(var20[0]);
                                 var1.append(" ");
                                 var1.append(sk(var20[1]));
                                 var1.append(so(var20[0]));
                                 if (var6 != null && var6 > 0) {
                                    var2 = rs(var1, var2, "#G");
                                    var1.append(" ");
                                    var1.append("(");
                                    var1.append("+");
                                    Object[] var10002 = new Object[1];
                                    boolean var10004 = true;
                                    var10002[0] = BaseEquip.getQHGemXS(var6) / 100.0D * Double.parseDouble(var20[1]);
                                    var1.append(String.format("%.1f", var10002));
                                    var1.append(")");
                                 }
                              } else if (var4 == 779L) {
                                 var1.append(var20[0]);
                              }
                           } else {
                              var2 = rs(var1, var2, "#cFFFFFF");
                              var1.append("【性别要求】");
                              var1.append(var20[1].equals("1") ? "男" : (var20[1].equals("0") ? "女" : "全部性别"));
                           }
                        } else {
                           var2 = rs(var1, var2, this.uw().gameType == --2 ? "#cFEFF72" : "#cFFFFFF");
                           var1.append(var20[0]);
                           var1.append(" ");
                           var1.append(var20[1]);
                        }
                     } else {
                        var2 = rs(var1, var2, "#cFFFFFF");
                        var1.append("【");
                        var1.append(var20[3 ^ 3]);
                        var1.append("】");
                        var1.append(var20[3 & 5]);
                     }
                  } else {
                     var2 = rs(var1, var2, "#cFFFFFF");
                     var1.append("【");
                     var1.append(var20[3 ^ 3]);
                     var1.append("】");
                     var1.append(var20[5 >> 2]);
                  }
               }
            }

            ++var18;
         }

      }
   }

   public void o() {
      int var10002 = 2 & 5;
      int var10004 = this.gw = 3 ^ 3;
      this.aj.clear();
      this.q.clear();
      this.bv.clear();
      this.q.setFont(Class681.ce);
      this.bl.q();
      this.op = (boolean)var10004;
      this.lc = (boolean)var10002;
      this.bl.setVisible((boolean)(3 & 4));
   }

   public int rj(int var1) {
      return (var1 << --1) - --1;
   }

   public int rk(int var1, int var2) {
      if ((var1 < (7099 & 28669) || var1 > (4053 & 31723)) && var1 != (23551 & 12239) && var1 != (16351 & 19443)) {
         if (var1 != (24519 & 11261) && var1 != (12254 & 23527) && var1 != (27615 & 8167)) {
            if (var1 >= (12286 & 23497) && var1 <= (15310 & 20477)) {
               return this.mi(var2);
            } else {
               return var1 != (27612 & 8183) && var1 != (11231 & 24565) && var1 != (16375 & 19422) ? var2 : var2 - --3;
            }
         } else {
            return this.rj(var2);
         }
      } else {
         return this.rr(var2);
      }
   }

   public int fs(int var1, int var2) {
      if (var1 == (27633 & 8143)) {
         return 3 & 5;
      } else if (var1 != (31743 & 4034) && var1 != (4055 & 31738) && var1 != (19455 & 16333) && var1 != (19439 & 16350)) {
         if (var1 >= (12271 & 23512) && var1 <= (23551 & 12235)) {
            return var2 > --4 ? --3 : 2;
         } else if (var1 != (12287 & 23505) && var1 != (23535 & 12255)) {
            if (var1 != (28639 & 7157) && var1 != (24543 & 11252)) {
               return var2;
            } else {
               return var2 > --3 ? 1 ^ 3 : 1;
            }
         } else {
            return 3;
         }
      } else {
         return 2;
      }
   }

   public void p() {
      int var10003 = 94 & 63;
      this.q.setBounds(15 & 127, 95 & 45, this.q.getWidth(), this.q.getHeight());
      int var1 = var10003 + this.q.getWidth();
      int var2 = (26 & 127) + this.q.getHeight();
      Point var10002 = this.ux().abg(var1, var2);
      this.vf(var10002.x, var10002.y, var1, var2);
      this.ve().a(this.ae());
   }

   public void rl(String var1, String var2) {
      this.o();
      this.aj.setTextSize("#cf8fc70" + var1, 1239 & 31743);
      this.q.setTextSize(var2, 15103 & 17879);
      this.s();
   }

   public void rm(StringBuffer var1, String var2, String var3, long var4) {
      if (!Class394.o(var3)) {
         var1.append("#r");
         rs(var1, var2, "#Y");
         int var6 = var3.indexOf("|");
         int var8 = Math.abs(Class394.b(var3, 3 >> 2, var6));
         var6 = Class394.b(var3, var6 + (5 >> 2), var3.length());
         XuanYin var7 = this.vc().ao(var8);
         var1.append("等级：");
         var1.append(var6);
         var1.append("#r");
         var1.append(var7.getBaseQl().getKey());
         var1.append(" ");
         if (var7.getBaseQl().getValue() >= 0.0D) {
            var1.append("+");
         }

         var1.append(Class394.ak(var7.getBaseQl().getValue() * (double)var6, 5 >> 2));
         var1.append(so(var7.getBaseQl().getKey()));
      }
   }

   public void rn(StringBuffer var1, String var2, String var3, long var4) {
      if (!Class394.o(var3)) {
         boolean var9 = false;
         String[] var8 = var3.split("\\|");

         int var5;
         for(int var10000 = var5 = 3 & 4; var10000 < var8.length; var10000 = var5) {
            int var6;
            String var7;
            if ((var6 = var8[var5].indexOf("=")) != -4 >> 2 && !(var7 = var8[var5].substring(2 & 5, var6)).equals("事件") && !var7.equals("糖果")) {
               if (var7.endsWith("要求")) {
                  if (var1.length() != 0) {
                     var1.append("#r");
                  }

                  var2 = rs(var1, var2, "#W");
                  var1.append("【");
                  var1.append(var7);
                  var1.append("】");
                  var1.append(var8[var5].substring(var6 + (2 ^ 3)));
                  if (var7.equals("年龄要求")) {
                     var1.append("岁");
                  }
               } else {
                  if (var1.length() != 0) {
                     var1.append(var9 ? "," : "#r");
                  }

                  var9 = true;
                  var2 = rs(var1, var2, "#Y");
                  if (var7.equals("大话币")) {
                     var1.append("消耗大话币");
                     var1.append(var8[var5].substring(var6 + (3 & 5)));
                  } else {
                     var1.append(var7);
                     if (var8[var5].charAt(var6 + (4 ^ 5)) != (45 & 127)) {
                        var1.append("+");
                     }

                     var1.append(var8[var5].substring(var6 + --1));
                  }
               }
            }

            ++var5;
         }

      }
   }

   public void ro(StringBuffer var1, String var2) {
      String[] var6 = var2.split("&");
      if (var1.length() != 0) {
         var1.append("#r");
      }

      String var3 = rs(var1, (String)null, "#W");
      var1.append("【炼器】");
      var3 = rs(var1, var3, "#c00EAFF");
      var1.append("开光次数 ");
      var1.append(var6[--1]);
      int var4 = 5 >> 1;

      for(int var10000 = var4; var10000 < var6.length; var10000 = var4) {
         String[] var5 = var6[var4].split("=");
         if (var1.length() != 0) {
            var1.append("#r");
         }

         var3 = rs(var1, var3, "#c00CD00");
         var1.append(var5[3 ^ 3]);
         var1.append(" ");
         var1.append(sk(var5[4 ^ 5]));
         int var10005 = 3 & 4;
         ++var4;
         var1.append(so(var5[var10005]));
      }

   }

   public void rp(StringBuffer var1, String var2, Goodstable var3) {
      if (!Class394.o(var3.getValue())) {
         String[] var4 = var3.getValue().split("\\|");
         if (var1.length() != 0) {
            var1.append("#r");
         }

         var2 = rs(var1, var2, "#cFFFFFF");
         var1.append("【等级】 ");
         var1.append(var4[3 ^ 3].substring(--3));
         if (var1.length() != 0) {
            var1.append("#r");
         }

         var2 = rs(var1, var2, "#cFFFFFF");
         var1.append("【装备部位】 ");
         var1.append(var4[--1].substring(--5));
         if (var1.length() != 0) {
            var1.append("#r");
         }

         var2 = rs(var1, var2, "#cFFFFFF");
         var1.append("【等级需求】 ");
         var1.append(var4[1 ^ 3].substring(--5));
         int var5 = --3;
         int var10000 = var5;

         StringBuffer var8;
         while(true) {
            if (var10000 >= var4.length) {
               var8 = var1;
               break;
            }

            if (var4[var5].startsWith("品质")) {
               var8 = var1;
               break;
            }

            if (var1.length() != 0) {
               var1.append("#r");
            }

            var2 = rs(var1, var2, "#cFFFFFF");
            String[] var6 = var4[var5].split("=");
            var1.append("【");
            var1.append(var6[3 & 4]);
            var1.append("】 ");
            int var10005 = 4 ^ 5;
            ++var5;
            var1.append(var6[var10005]);
            var10000 = var5;
         }

         if (var8.length() != 0) {
            var1.append("#r");
         }

         var2 = rs(var1, var2, "#cFFFFFF");
         var1.append("【品质】 ");
         var1.append(var4[var5].substring(--3));
         var1.append("/100");
         if (var1.length() != 0) {
            var1.append("#r");
         }

         var2 = rs(var1, var2, "#cFFFFFF");
         var1.append("【通灵】 ");
         int var7 = Integer.parseInt(var4[5 >> 3].substring(--3));
         var1.append(var4[var5 + (2 ^ 3)].substring(--3));
         var1.append("/");
         var1.append(var7 * (3051 & 30716));
         var7 = --1;
         var5 += 1 ^ 3;

         for(var10000 = var5; var10000 < var4.length; var10000 = var5) {
            if (var4[var5].startsWith(GoodType.Extras[3 ^ 3])) {
               this.st(var1, var4[var5], var3.getType());
            } else if (var4[var5].startsWith(GoodType.Extras[--5])) {
               var7 = 3 & 4;
               this.rh(var1, var4[var5]);
            }

            ++var5;
         }

         if (var7 != 0) {
            if (var1.length() != 0) {
               var1.append("#r");
            }

            rs(var1, var2, "#c00FDF1");
            var1.append("未开启觉醒(开启铃、环、甲之觉醒，可领悟觉醒技)");
         }

      }
   }

   public Class270(GameView var1) {
      super(110 & 63, --4, Class345.aef, var1);
      this.va(5 >> 3, 5 >> 3, 5 >> 3, 5 >> 3, Class345.aei);
      this.uv(Class511.q("sc/d/49.png", 103 & 30, 103 & 30, 103 & 30, 103 & 30, (boolean)(3 & 4)), (String)null);
      this.bl = new Class436();
      this.add(this.bl);
      this.aj = new RichLabel("", Class681.av, 32235 & 1022) {
         public void paintComponent(Graphics var1) {
            ((Graphics2D)var1).setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            super.paintComponent(var1);
            ((Graphics2D)var1).setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_DEFAULT);
         }
      };
      this.add(this.aj);
      this.q = Class271.l("", Class681.ce, 17407 & 15850);
      this.add(this.q);
      this.bv = Class271.l("", Class681.bx, 127 & 120);
      this.bv.setBounds(--5, 12751 & 20151, 126 & 121, 126 & 121);
      this.add(this.bv);
   }

   public static String ow(String var0, String var1) {
      StringBuffer var2 = new StringBuffer();
      int var5 = 3 & 4;
      String[] var12 = var1.split("\\|");
      Map var4 = Class271.e();

      int var3;
      int var10000;
      for(var10000 = var3 = 5 >> 3; var10000 < var12.length; var10000 = var3) {
         if (var12[var3].startsWith(GoodType.Extras[--1])) {
            String[] var6;
            var5 = Integer.parseInt((var6 = var12[var3].split("&"))[2 ^ 3]);

            int var7;
            for(var10000 = var7 = 1 ^ 3; var10000 < var6.length; var10000 = var7) {
               int var8;
               if ((var8 = var6[var7].indexOf("=")) != -4 >> 2) {
                  String var9 = var6[var7].substring(3 ^ 3, var8);
                  double var10 = Double.parseDouble(var6[var7].substring(var8 + (3 >> 1)));
                  PropertyUtil.d(var4, var9, var10);
               }

               ++var7;
            }

            var12[var3] = null;
            break;
         }

         ++var3;
      }

      for(var10000 = var3 = 0; var10000 < var12.length; var10000 = var3) {
         int var14;
         if (var12[var3] != null && (var14 = var12[var3].indexOf("=")) != -4 >> 2) {
            var0 = rs(var2, var0, "#cFFFFFF");
            if (var2.length() != 0) {
               var2.append("#r");
            }

            String var16 = var12[var3].substring(3 & 4, var14);
            String var17 = var12[var3].substring(var14 + --1);
            if (var16.equals("等级")) {
               var0 = rs(var2, var0, "#cFFFFFF");
               var2.append("【");
               var2.append(var16);
               var2.append("】");
               var2.append(var17);
            } else {
               var0 = rs(var2, var0, "#cDEDE9E");
               var2.append(var16);
               var2.append(" ");
               var2.append(sk(var17));
               var2.append(so(var16));
               Double var18;
               if ((var18 = (Double)var4.get(var16.equals("负敏") ? "加强速度" : "加强" + var16)) != null) {
                  var0 = rs(var2, var0, "#G");
                  var2.append(" ");
                  var2.append("(");
                  var2.append("+");
                  Object[] var10002 = new Object[4 ^ 5];
                  boolean var10004 = true;
                  var10002[5 >> 3] = var18 / 100.0D * Double.parseDouble(var17);
                  var2.append(String.format("%.1f", var10002));
                  var2.append(")");
               }
            }
         }

         ++var3;
      }

      if (var5 > 0) {
         if (var2.length() != 0) {
            var2.append("#r");
         }

         var0 = rs(var2, var0, "#c00EAFF");
         var2.append("强化次数 ");
         var2.append(var5);
         Iterator var15 = var4.keySet().iterator();

         for(Iterator var19 = var15; var19.hasNext(); var19 = var15) {
            String var13 = (String)var15.next();
            if (var2.length() != 0) {
               var2.append("#r");
            }

            var0 = rs(var2, var0, "#c00EAFF");
            var2.append(var13);
            var2.append(" ");
            var2.append(var4.get(var13));
            var2.append("%");
         }
      }

      Class271.d(var4);
      return var2.toString();
   }

   protected void paintComponent(Graphics var1) {
      Class270 var10000;
      label33: {
         super.paintComponent(var1);
         if (this.bl.ga() != null) {
            Image var4 = this.bl.ga();
            int var2;
            int var3;
            if (this.gw == 5 >> 1) {
               var3 = Math.min(86 & 121, var4.getWidth((ImageObserver)null));
               var2 = Math.min(113 & 94, var4.getHeight((ImageObserver)null));
               if (this.bl.getWidth() != var3 || this.bl.getHeight() != var2) {
                  var10000 = this;
                  this.bl.setBounds(--5 + ((125 & 82) - var3) / (5 >> 1), (11 & 126) + ((85 & 122) - var2) / --2, var3, var2);
                  break label33;
               }
            } else {
               var3 = Math.min(120, var4.getWidth((ImageObserver)null));
               var2 = Math.min(125 & 122, var4.getHeight((ImageObserver)null));
               if (this.bl.getWidth() != var3 || this.bl.getHeight() != var2) {
                  this.bl.setBounds(--5 + ((124 & 123) - var3) / (1 ^ 3), (58 & 79) + ((125 & 122) - var2) / --2, var3, var2);
               }
            }
         }

         var10000 = this;
      }

      if (var10000.op) {
         var1.drawImage(Class222.k, this.getWidth() - (49 & 127), 3 ^ 3, this);
      }

      if (this.lc) {
         var1.drawImage(Class222.u, 63 & 79, 106 & 29, this);
      }

   }

   public void rq(StringBuffer var1, String var2, String var3, long var4) {
      if (!Class394.o(var3)) {
         int var15 = 0;
         int var5 = 5 >> 3;
         int var6 = 2 & 5;
         int var7 = 2 & 5;
         var2 = rs(var1, var2, "#Y");
         int var8 = 3 >> 2;

         int var9;
         for(int var10000 = var9 = 3 >> 2; var10000 < var3.length(); var10000 = var9) {
            if ((var9 = var3.indexOf("|", var8 + (5 >> 2))) == -4 >> 2) {
               var9 = var3.length();
            }

            label57: {
               int var10;
               if ((var10 = var3.indexOf("=", var8 + (2 ^ 3))) != -4 >> 2) {
                  if (var10 > var9) {
                     var10000 = var9;
                     break label57;
                  }

                  String var11;
                  if ((var11 = var3.substring(var8, var10)).equals("等级")) {
                     var15 = Class394.b(var3, var10 + (3 & 5), var9);
                     var10000 = var9;
                     break label57;
                  }

                  if (var11.equals("耐久")) {
                     var5 = Class394.b(var3, var10 + (2 ^ 3), var9);
                     var10000 = var9;
                     break label57;
                  }

                  if (var11.equals("技能")) {
                     if (var6 == 0) {
                        var10000 = 4 ^ 5;
                        this.se(var1, var15, var5);
                        var6 = var10000;
                     }

                     if (var7 == 0) {
                        var2 = rs(var1, var2, "#c868090");
                        var1.append("#r【特技】");
                        var7 = 5 >> 2;
                     }

                     var8 = var10 + (2 ^ 3);
                     var10 = var3.indexOf("#", var8 + (4 ^ 5));
                     int var16 = Class394.b(var3, var8, var10);
                     int var13 = Class394.b(var3, var10 + (3 >> 1), var9);
                     Skill var14;
                     if ((var14 = this.vc().bf(String.valueOf(var16))) == null) {
                        var10000 = var9;
                     } else {
                        var1.append("#r");
                        var1.append(var14.getSkillname());
                        var1.append("(");
                        var1.append(var13);
                        var1.append("级)");
                        var1.append(":");
                        var1.append(SkillUtil.g(var14, var13).replaceAll("#W", "#c868090"));
                        var10000 = var9;
                     }
                     break label57;
                  }

                  String var12;
                  String var17 = var12 = var3.substring(var10 + (3 >> 1), var9);
                  int var10001 = 5 >> 3;
                  var1.append("#r");
                  var1.append(var11);
                  var1.append(" ");
                  if (var17.charAt(var10001) != (109 & 63)) {
                     var1.append("+");
                  }

                  var1.append(var12);
                  var1.append(so(var11));
               }

               var10000 = var9;
            }

            var8 = var10000 + 1;
         }

         if (var6 == 0) {
            this.se(var1, var15, var5);
         }

      }
   }

   public int rr(int var1) {
      return var1 <= --3 ? var1 : (var1 << (3 & 5)) - --3;
   }

   public static String rs(StringBuffer var0, String var1, String var2) {
      if (Class394.r(var1, var2)) {
         return var1;
      } else {
         var0.append(var2);
         return var2;
      }
   }

   public void rt(StringBuffer var1, String var2, Goodstable var3) {
      if (!Class394.o(var3.getValue())) {
         String var12 = var3.getValue();
         String var4 = null;
         String var5 = null;
         String var6 = null;
         String var7 = null;
         int var8 = 2 & 5;
         int var9 = 3 >> 2;

         int var10;
         for(int var10000 = var10 = 3 >> 2; var10000 < var12.length(); var10000 = var10) {
            if ((var10 = var12.indexOf("|", var9 + --1)) == -4 >> 2) {
               var10 = var12.length();
            }

            if (var8 == 0) {
               var4 = var12.substring(var9 + --3, var10);
               var10000 = var10;
            } else if (var8 == 3 >> 1) {
               var5 = var12.substring(var9 + --3, var10);
               var10000 = var10;
            } else if (var8 == (1 ^ 3)) {
               var6 = var12.substring(var9 + --3, var10);
               if (var1.length() != 0) {
                  var1.append("#r");
               }

               var2 = rs(var1, var2, "#cFFFFFF");
               var1.append("【等级】 ");
               var1.append(var4);
               if (var1.length() != 0) {
                  var1.append("#r");
               }

               var2 = rs(var1, var2, "#cFFFFFF");
               var1.append("【神力】 ");
               var2 = rs(var1, var2, "#cFFFF00");
               var1.append(var5);
               var1.append("/");
               var1.append(Integer.parseInt(var4.split("/")[5 >> 3]) * (29944 & 3023));
               if (var1.length() != 0) {
                  var1.append("#r");
               }

               var2 = rs(var1, var2, "#cFFFFFF");
               var1.append("【战力】 ");
               var2 = rs(var1, var2, "#cFFFF00");
               var1.append(var6);
               var10000 = var10;
            } else {
               String var11;
               if ((var11 = var12.substring(var9, var10)).startsWith(GoodType.Extras[3 & 4])) {
                  var7 = this.st(var1, var11, 520L);
                  var10000 = var10;
               } else {
                  if (var11.startsWith(GoodType.Extras[7 & 126])) {
                     this.sc(var1, var11, var7);
                  }

                  var10000 = var10;
               }
            }

            ++var8;
            var9 = var10000 + 1;
         }

      }
   }

   public void ru(StringBuffer var1, String var2) {
      rs(var1, (String)null, "#cFEFF72");
      int var5 = 5 >> 3;
      int var4 = 3 >> 2;

      int var3;
      for(int var10000 = var3 = 3 >> 2; var10000 != var2.length(); var10000 = var3) {
         if ((var3 = var2.indexOf("&", var4 + (3 & 5))) == -4 >> 2) {
            var3 = var2.length();
         }

         if (var5 == 0) {
            var10000 = var3;
         } else {
            BaseGemOld var6;
            GemOld var7;
            if ((var7 = (var6 = new BaseGemOld(var2.substring(var4, var3))).getGemOld(this.vc())) != null) {
               if (var1.length() != 0) {
                  var1.append("#r");
               }

               var1.append(var7.getKey());
               var1.append(" ");
               var1.append(Class394.ak((double)(var6.getLvl() * var6.getValue()) / 100.0D * var7.getValue(), 3 & 5));
               var1.append(so(var7.getKey()));
            }

            var10000 = var3;
         }

         ++var5;
         var4 = var10000 + 1;
      }

   }

   public void an(PayvipBean var1) {
      int var10004 = 5 >> 2;
      this.o();
      this.gw = var10004;
      this.bl.hf(Class222.i("S" + var1.getGrade()));
      this.aj.setTextSize("#cFFFF75V" + var1.getGrade() + "会员奖励", 18135 & 14847);
      this.q.setTextSize(var1.getInstructiontext() != null ? var1.getInstructiontext() : "", 215);
      this.r((boolean)(3 & 4));
   }

   public void rv(StringBuffer var1, String var2) {
      RoleData var5 = this.vd();
      if (var1.length() != 0) {
         var1.append("#r");
      }

      rs(var1, (String)null, "#c00ffff");
      var1.append("【宝石镶嵌】");
      String[] var6 = var2.split("&");
      int var4 = --1;

      for(int var10000 = var4; var10000 < var6.length; var10000 = var4) {
         Goodstable var3;
         if ((var3 = var5.getGoodEquip(new BigDecimal(var6[var4]))) != null) {
            if (var1.length() != 0) {
               var1.append("#r");
            }

            rs(var1, (String)null, "#cEA5700");
            var1.append(var3.getGoodsname());
            String[] var7 = var3.getValue().split("\\|");
            var1.append(" ");
            var1.append(var7[5 >> 3].split("=")[--1]);
            var1.append("级 ");
            var7 = var7[--1].split("=");
            var1.append(var7[3 ^ 3]);
            var1.append(" ");
            var1.append(sk(var7[--1]) + so(var7[--1]));
         }

         ++var4;
      }

   }

   public void rw(StringBuffer var1, String var2, String var3, long var4) {
      if (!Class394.o(var3)) {
         if (var1.length() != 0) {
            var1.append("#r");
         }

         var1.append(ow(var2, var3));
      }
   }

   public void oj(Goodstable var1, boolean var2) {
      int var10005 = --1;
      this.o();
      this.gw = var10005;
      this.bl.hf(Class222.i(var1.getSkin()));
      this.op = GoodType.w(var1.getQuality());
      this.lc = (boolean)(var1.getGoodlock() == 5 >> 2 ? --1 : 0);
      this.bv.setText(var1.getAuthor() != null ? "#R制作人:" + var1.getAuthor() : "");
      if (var1.getQht() != null && var1.getQht() > 0) {
         StringBuffer var4;
         (var4 = new StringBuffer()).append("#cFFFF75");
         var4.append(var1.getGoodsname());
         var4.append("#r");
         int var3 = 4 ^ 5;

         for(int var10000 = var3; var10000 < var1.getQht(); var10000 = var3) {
            if (var1.getQhv() != null && var3 <= var1.getQhv()) {
               var4.append("#881");
            } else {
               var4.append("#880");
            }

            ++var3;
         }

         this.aj.setTextSize(var4.toString(), 4575 & 28407);
      } else {
         this.aj.setTextSize("#cFFFF75" + var1.getGoodsname(), 11255 & 21727);
      }

      String var7 = "#W";
      StringBuffer var6 = new StringBuffer();
      Goodstable var5;
      Goodstable var8;
      if ((var5 = this.vc().n(var1.getGoodsid())) == null && !Class394.o(var1.getInstruction())) {
         var8 = var1;
         var6.append(var1.getInstruction());
      } else {
         if (var5 != null && !Class394.o(var5.getInstruction())) {
            var6.append(var5.getInstruction());
         }

         var8 = var1;
      }

      Class270 var9;
      label134: {
         if (!GoodType.al(var8.getType())) {
            if (var1.getType() == 520L) {
               var9 = this;
               this.rt(var6, var7, var1);
               break label134;
            }

            if (var1.getType() == 812L) {
               var9 = this;
               this.sh(var6, var7, var1);
               break label134;
            }

            if (var1.getType() == 8888L) {
               var9 = this;
               this.sj(var6, var7, var1);
               break label134;
            }

            if (GoodType.ac(var1.getType())) {
               var9 = this;
               this.rp(var6, var7, var1);
               break label134;
            }

            if (GoodType.g(var1.getType())) {
               var9 = this;
               this.sm(var6, var7, var1);
               break label134;
            }

            if (var1.getType() == 779L || GoodType.ai(var1.getType()) != -4 >> 2) {
               var9 = this;
               this.ri(var6, var7, var1.getValue(), var1.getType(), var1.getQhv());
               break label134;
            }

            if (var1.getType() == 188L) {
               var9 = this;
               this.rw(var6, var7, var1.getValue(), var1.getType());
               break label134;
            }

            if (var1.getType() == 133L || var1.getType() == 134L) {
               var9 = this;
               this.rn(var6, var7, var1.getValue(), var1.getType());
               break label134;
            }

            if (var1.getType() == 114L) {
               var9 = this;
               this.ss(var6, var7, var1.getValue(), var1.getType());
               break label134;
            }

            if (var1.getType() == 700L) {
               var9 = this;
               this.rx(var6, var7, var1.getValue(), var1.getType());
               break label134;
            }

            if (var1.getType() == 139L) {
               var9 = this;
               this.sp(var6, var7, var1.getValue(), var1.getType());
               break label134;
            }

            if (var1.getType() == 108L) {
               var9 = this;
               this.rq(var6, var7, var1.getValue(), var1.getType());
               break label134;
            }

            if (var1.getType() == 811L) {
               this.rm(var6, var7, var1.getValue(), var1.getType());
               var9 = this;
               break label134;
            }

            this.rb(var6, var7, var1.getValue(), var1.getType());
         }

         var9 = this;
      }

      var9.q.setTextSize(var6.toString(), 15607 & 17375);
      this.r(var2);
   }

   public void rx(StringBuffer var1, String var2, String var3, long var4) {
      if (var3 != null && !var3.equals("")) {
         BaseGemOld var7;
         GemOld var8;
         if ((var8 = (var7 = new BaseGemOld(var3)).getGemOld(this.vc())) != null) {
            rs(var1, var2, "#Y");
            var1.append("等级 " + var7.getLvl());
            if (var1.length() != 0) {
               var1.append("#r");
            }

            var1.append(var8.getKey());
            var1.append(" ");
            var1.append(Class394.ak((double)(var7.getLvl() * var7.getValue()) / 100.0D * var8.getValue(), 3 >> 1));
            var1.append(so(var8.getKey()));
            if (var1.length() != 0) {
               var1.append("#r");
            }

            var1.append("价值 " + var7.getValue());
            if (var1.length() != 0) {
               var1.append("#r");
            }

            var1.append("镶嵌部位:");
            int var6 = 2 & 5;

            for(int var10000 = var6; var10000 < var8.getParts().length; var10000 = var6) {
               if (var6 != 0) {
                  var1.append("、");
               }

               var1.append(GoodType.p(var8.getParts()[var6++]));
            }

         }
      }
   }

   public static String ry(String var0, Skill var1, String var2, String var3) {
      return var0.replace("{公式一}", "#R" + (int)Arith.b(Arith.f(Arith.b(Double.parseDouble(var1.getValue()), Double.parseDouble(var2)), 5.0D, 3 ^ 3), Math.sqrt(Double.parseDouble(var3))) + "#G").replace("{公式二}", "#R" + (int)Arith.b(Arith.b(Arith.f(Arith.b(Double.parseDouble(var1.getValue()), Double.parseDouble(var2)), 5.0D, 5 >> 3), Math.sqrt(Double.parseDouble(var3))), Double.parseDouble("0.8")) + "#G").replace("{公式三}", "#R" + (int)Arith.b(Arith.b(Arith.f(Arith.b(Double.parseDouble(var1.getValue()), Double.parseDouble(var2)), 5.0D, 2 & 5), Math.sqrt(Double.parseDouble(var3))), Double.parseDouble("0.7")) + "#G").replace("{公式四}", "#R" + (int)Arith.b(Arith.b(Arith.f(Arith.b(Double.parseDouble(var1.getValue()), Double.parseDouble(var2)), 5.0D, 2 & 5), Math.sqrt(Double.parseDouble(var3))), Double.parseDouble("0.3")) + "#G").replace("{公式五}", "#R" + (int)Arith.d(Double.parseDouble("100"), Arith.b(Arith.f(Arith.b(Double.parseDouble(var1.getValue()), Double.parseDouble(var2)), 5.0D, 3 & 4), Math.sqrt(Double.parseDouble(var3)))) + "#G").replace("{公式六}", "#R" + (int)Arith.b(Arith.b(Arith.f(Arith.b(Double.parseDouble(var1.getValue()), Double.parseDouble(var2)), 5.0D, 5 >> 3), Math.sqrt(Double.parseDouble(var3))), Double.parseDouble("0.25")) + "#G").replace("{公式七}", "#R" + (int)Arith.c(Double.parseDouble("100"), Arith.b(Arith.f(Arith.b(Double.parseDouble(var1.getValue()), Double.parseDouble(var2)), 5.0D, 3 ^ 3), Math.sqrt(Double.parseDouble(var3)))) + "#G").replace("{公式八}", "#R" + (int)Arith.c(Double.parseDouble("1"), Arith.b(Arith.b(Arith.f(Arith.b(Double.parseDouble(var1.getValue()), Double.parseDouble(var2)), 5.0D, 3 & 4), Math.sqrt(Double.parseDouble(var3))), Double.parseDouble("0.07"))) + "#G").replace("{公式九}", "#R" + (int)Arith.b(Arith.b(Arith.f(Arith.b(Double.parseDouble(var1.getValue()), Double.parseDouble(var2)), 5.0D, 3 & 4), Math.sqrt(Double.parseDouble(var3))), Double.parseDouble("0.5")) + "#G").replace("{公式十}", "#R" + (int)Arith.b(Arith.b(Arith.f(Arith.b(Double.parseDouble(var1.getValue()), Double.parseDouble(var2)), 5.0D, 3 >> 2), Math.sqrt(Double.parseDouble(var3))), Double.parseDouble("0.05")) + "#G");
   }

   public void lb(String var1) {
      if (!Class394.o(var1)) {
         this.o();
         this.q.setTextSize(var1, 28075 & 4862);
         this.p();
      }
   }

   public void s() {
      int var10003 = 63 & 94;
      this.aj.setBounds(111 & 31, --5, this.aj.getWidth(), this.aj.getHeight());
      this.q.setBounds(47 & 95, 108 & 55, this.q.getWidth(), this.q.getHeight());
      int var1 = var10003 + this.q.getWidth();
      int var2 = (91 & 62) + this.q.getHeight() + this.aj.getHeight();
      Point var10002 = this.ux().abg(var1, var2);
      this.vf(var10002.x, var10002.y, var1, var2);
      this.ve().a(this.ae());
   }

   public void rz(Shop var1) {
      int var10005 = 3 >> 1;
      this.o();
      this.gw = var10005;
      this.bl.hf(Class222.i(var1.getShopskin()));
      this.aj.setTextSize("#cFFFF75" + var1.getShopname(), 10207 & 22775);
      String var4 = "#W";
      StringBuffer var3 = new StringBuffer();
      Goodstable var2 = this.vc().n(var1.getShopiid());
      Goodstable var10000;
      if (var1.getShoptext() != null && !var1.getShoptext().equals("")) {
         var10000 = var2;
         var3.append(var1.getShoptext());
      } else {
         if (var2 != null && var2.getInstruction() != null && !var2.getInstruction().equals("")) {
            var3.append(var2.getInstruction());
         }

         var10000 = var2;
      }

      if (var10000 != null && var2.getType() == 112L) {
         this.rb(var3, var4, var2.getValue(), var2.getType());
      }

      if (var1.getShoptype() >= (15275 & 22493) && var1.getShoptype() <= (22527 & 15246)) {
         if (var3.length() != 0) {
            var3.append("#r");
         }

         rs(var3, var4, "#Y");
         var3.append("参考价格: ");
         var3.append(var1.getShopprice());
      }

      int var10001 = 3 >> 2;
      this.q.setTextSize(var3.toString(), 983 & 31999);
      this.r((boolean)var10001);
   }

   public void sa(int var1, Skill var2, int var3) {
      int var10002 = --2;
      this.o();
      this.gw = var10002;
      Class270 var10000;
      StringBuffer var4;
      if (var1 == 0) {
         var4 = new StringBuffer();
         var4.append("#cf8fc70秘技" + (var3 == 0 ? "#R(未激活)" : (var3 == (2 ^ 3) ? "(可激活)" : "#G(已激活)")));
         var4.append("#r#cf8fc70");
         var4.append(var2.getSkillname());
         var4.append(":#G");
         var4.append(var2.getRemark());
         this.q.setTextSize(var4.toString(), 28670 & 4407);
         var10000 = this;
      } else {
         (var4 = new StringBuffer()).append("#cf8fc70" + var2.getSkillname() + "(" + var3 + "/8)");
         var4.append("#r#G" + var2.getRemark());
         var10000 = this;
         this.q.setTextSize(var4.toString(), 5047 & 28030);
      }

      var10000.p();
   }

   public String sb(String var1, int var2) {
      if (var2 >= (59 & 77)) {
         return "天资已达到最高境界,不可强化";
      } else if (var1 != null && !var1.equals("")) {
         String[] var5 = var1.split("\\|");
         StringBuffer var6 = new StringBuffer();

         int var3;
         for(int var10000 = var3 = 3 & 4; var10000 < var5.length; var10000 = var3) {
            var6.append(" ");
            String[] var4 = var5[var3].split("=");
            var6.append(var4[3 >> 2]);
            var6.append(" >= ");
            int var10005 = 5 >> 2;
            ++var3;
            var6.append(var4[var10005]);
         }

         var6.append(" ,达到要求后可以继续强化有几率成功");
         return var6.toString();
      } else {
         return "";
      }
   }

   public void sc(StringBuffer var1, String var2, String var3) {
      if (var1.length() != 0) {
         var1.append("#r");
      }

      String var4 = rs(var1, (String)null, "#cFFFFFF");
      var1.append("【五行】");
      String[] var9 = var2.split("&");
      String[] var5 = var3 != null ? var3.split("=") : null;
      double var6 = 0.0D;

      int var10;
      for(int var10000 = var10 = 3 >> 1; var10000 < var9.length; var10000 = var10) {
         String[] var8 = var9[var10].split("=");
         if (var1.length() != 0) {
            var1.append("#r");
         }

         var4 = rs(var1, var4, "#cFFFF00");
         var1.append(var8[5 >> 3]);
         var1.append(" ");
         var1.append(var8[2 ^ 3]);
         var1.append("/100");
         if (var5 != null) {
            var6 += MsgUntil.l(var5[--2], var8[2 & 5], var8[3 >> 1]);
         }

         ++var10;
      }

      if (var5 != null) {
         if (var1.length() != 0) {
            var1.append("#r");
         }

         rs(var1, var4, "#c4ADEDD");
         var1.append("五行加成星阵之力 ");
         Object[] var10002 = new Object[--1];
         boolean var10004 = true;
         var10002[3 ^ 3] = var6;
         var1.append(String.format("%.1f", var10002));
         var1.append("%");
         if (var1.length() != 0) {
            var1.append("#r");
         }

         var1.append("【星阵】");
         if (var1.length() != 0) {
            var1.append("#r");
         }

         var1.append(var5[3 >> 1]);
         var1.append("(");
         var1.append(var5[--2]);
         var1.append(")");
         if (this.ee(var5[4 ^ 5])) {
            var1.append("#r#cFFFFFF赤帝宫 #c00FF00" + var5[--3]);
            var1.append("#r#cFFFFFF青帝宫 #c00FF00" + var5[--4]);
            var1.append("#r#cFFFFFF黄帝宫 #c00FF00" + var5[--5]);
            var1.append("#r#cFFFFFF白帝宫 #c00FF00" + var5[103 & 30]);
            var1.append("#r#cFFFFFF黑帝宫 #c00FF00" + var5[63 & 71]);
            var4 = null;
         }

         var1.append("#r#c00FF00" + this.rf(var5[4 ^ 5]));
      } else {
         var1.append("#r#c4ADEDD无星阵，五行暂不生效");
      }
   }

   public void sd(String var1, int var2, Lingbao var3) {
      this.o();
      Skill var4 = this.vc().bg(var1);
      StringBuffer var5 = new StringBuffer();
      var5.append("#W");
      var5.append(var1);
      var5.append("#r#Y【组合技能】: ");
      var5.append(var2);
      var5.append("人合技#r#Y【组合类型】: ");
      Skill var10000;
      if (var4.getSkilltype().equals("0")) {
         var10000 = var4;
         var5.append("攻击类");
      } else if (var4.getSkilltype().equals("1")) {
         var5.append("辅助类");
         var10000 = var4;
      } else {
         var5.append("落宝类");
         var10000 = var4;
      }

      String[] var13 = var10000.getRemark().split("\\|");
      int var6 = Integer.parseInt(var4.getSkillid());

      int var7;
      for(int var17 = var7 = 3 ^ 3; var17 < var13.length; var17 = var7) {
         if (var13[var7].equals("目标数")) {
            var5.append("#r#Y【目标数】: ");
            var5.append(this.rk(var6, var2));
         } else if (var13[var7].equals("持续回合数")) {
            var5.append("#r#Y【持续回合数】: ");
            var5.append(this.fs(var6, var2));
         } else if (this.uw().gameBattle && var6 >= (16377 & 19391) && var6 <= (3039 & 32751)) {
            int var8;
            label100: {
               var8 = var3 != null ? var3.getLingbaolvl().intValue() : 0;
               if (var3 != null) {
                  int var9;
                  if ((var9 = BaseValue.getQv(var3.getBaoquality())) == (126 & 51)) {
                     var8 = (int)((double)var8 * 2.5D);
                     var10000 = var4;
                     break label100;
                  }

                  if (var9 == (47 & 120)) {
                     var8 = (int)((double)var8 * 1.7D);
                     var10000 = var4;
                     break label100;
                  }

                  if (var9 == (127 & 30)) {
                     var8 = (int)((double)var8 * 1.3D);
                     var10000 = var4;
                     break label100;
                  }

                  if (var9 == (62 & 85)) {
                     var8 = (int)((double)var8 * 1.1D);
                  }
               }

               var10000 = var4;
            }

            double var11;
            double var14;
            Lingbao var18;
            label129: {
               var14 = Double.parseDouble(var10000.getValue());
               var11 = Double.parseDouble(var4.getGrow());
               var14 += var11 * (double)var8;
               if (var6 == (12283 & 23495) || var6 == (28628 & 7151)) {
                  if (var2 == --5) {
                     var14 *= 3.84D;
                     var18 = var3;
                     break label129;
                  }

                  if (var2 == --4) {
                     var14 *= 2.74D;
                     var18 = var3;
                     break label129;
                  }

                  if (var2 == --3) {
                     var14 *= 1.96D;
                     var18 = var3;
                     break label129;
                  }

                  if (var2 == (1 ^ 3)) {
                     var14 *= 1.4D;
                  }
               }

               var18 = var3;
            }

            Map var15;
            if (var18 != null) {
               var15 = PropertyUtil.getBaoMap(var3, this.vd());
               var11 = var3.getBaotype().equals("攻击") ? (Double)var15.get("伤害") : (var3.getBaotype().equals("辅助") ? (Double)var15.get("回复") : (Double)var15.get("落宝"));
               var14 *= 1.0D + var11;
               Class271.d(var15);
            }

            var15 = null;
            String var16;
            StringBuffer var19;
            if (var6 != (19387 & 16383) && var6 != (7165 & 28606)) {
               if (var6 == (3002 & 32767)) {
                  var16 = Class394.ak(var14 / 1000.0D, 3 >> 2) + "-" + Class394.ak(var14, 3 ^ 3);
                  var19 = var5;
               } else {
                  var16 = Class394.ak(var14, 3 ^ 3);
                  var19 = var5;
               }
            } else {
               var16 = "1-" + Class394.ak(var14, 3 >> 2);
               var19 = var5;
            }

            var19.append("#r#W");
            var5.append(var13[var7].replace("{数值}", var16));
         } else {
            var5.append("#r#W");
            var5.append(var13[var7]);
         }

         ++var7;
      }

      this.q.setTextSize(var5.toString(), 23767 & 9215);
      this.p();
   }

   public void se(StringBuffer var1, int var2, int var3) {
      var1.append("#r耐久 ");
      var1.append(var3);
      var1.append("/1000#r锻炼等级 ");
      var1.append(var2);
      var1.append("级");
   }

   public void sf(Skill var1, double var2, int var4, int var5) {
      int var10002 = 5 >> 1;
      this.o();
      this.gw = var10002;
      Class270 var10000;
      int var6;
      String var7;
      if ((var6 = Integer.parseInt(var1.getSkillid())) > (32746 & 12021) && var6 <= (13021 & 32746)) {
         var7 = SkillUtil.h(var1, var2);
         var10000 = this;
         this.bl.hf(Class222.s(var6));
         this.aj.setTextSize("#cf8fc70" + var1.getSkillname(), 17631 & 15351);
         this.q.setTextSize(var7, 27103 & 5879);
      } else if (var6 >= (14335 & 28433) && var6 <= (10074 & 32701)) {
         var10000 = this;
         this.bl.hf(Class222.c(var1.getSkillid()));
         this.aj.setTextSize("#cf8fc70" + var1.getSkillname(), 18391 & 14591);
         this.q.setTextSize(SkillUtil.a(var1.getRemark(), var1, var2), 11007 & 21975);
      } else {
         if ((var7 = Class683.apn(var6, var1, var2, var4, var5)) == null) {
            return;
         }

         if ((var4 = var7.indexOf(var1.getSkillname())) != -4 >> 2 && var4 <= (72 & 63)) {
            var7 = var7.substring(2 & 5, var4) + var7.substring(var4 + var1.getSkillname().length());
         }

         var10000 = this;
         this.bl.hf(Class222.g(var1.getSkillid()));
         this.aj.setTextSize("#cf8fc70" + var1.getSkillname(), 27127 & 5855);
         this.q.setTextSize(var7, 16127 & 16855);
      }

      var10000.d();
   }

   public void sg(StarSoul var1, long var2) {
      int var10002 = 1 ^ 3;
      this.o();
      this.gw = var10002;
      int var4 = var1.getId() <= (28536 & 14231) ? 121 & 126 : 280;
      StringBuffer var5;
      (var5 = new StringBuffer()).append("#cf8fc70");
      var5.append(var1.getName());
      var5.append("#r");
      Class270 var10000;
      if (var1.getId() <= (28671 & 14096)) {
         var10000 = this;
         var5.append("#W耐久:");
         var5.append(var2);
         var5.append("/8000#r点击补充耐久");
      } else {
         Class603 var8 = this.vc();
         var5.append("#W激活所需#cf8fc70");
         String[] var3 = var1.getValue().split("\\|");
         int var6 = 5 >> 3;

         for(int var10 = var6; var10 < var3.length; var10 = var6) {
            StarSoul var7 = var8.k(Integer.parseInt(var3[var6]));
            if (var6 != 0) {
               var5.append(",");
            }

            ++var6;
            var5.append(var7.getName());
         }

         Skill var9 = var8.bf(String.valueOf(var1.getLvl()));
         var10000 = this;
         var5.append("#r#W激活后获得技能-#cf8fc70");
         var5.append(var9.getSkillname());
      }

      var10000.q.setTextSize(var5.toString(), var4);
      this.p();
   }

   public void sh(StringBuffer var1, String var2, Goodstable var3) {
      Class603 var4 = this.vc();
      BaseXuanBao var13 = var3.getBaseXuanBao();
      XuanBao var5;
      Skill var6 = var4.bf(String.valueOf((var5 = var4.cb(var13.getId())).getSkillId()));
      Integer var10000 = this.vd().getLoginResult().getGrade();
      int var7 = Class224.d(var10000);
      int var8 = Class224.g(var10000);
      var2 = rs(var1, var2, "#cFFFFFF");
      var1.append("【玄宝等级】");
      var1.append(var13.getLvl());
      var1.append("级#r【玄宝品质】");
      var1.append(var5.getLevel() == --3 ? "珍品" : (var5.getLevel() == 5 >> 1 ? "中品" : "初品"));
      var1.append("#r【玄宝类型】");
      var1.append(var5.getType() == 5 >> 2 ? "攻击型" : (var5.getType() == 5 >> 1 ? "防御型" : (var5.getType() == --3 ? "辅助型" : "")));
      var1.append("#r【适用角色】");
      var1.append(var5.getRace());
      var1.append("#r【技能消耗】");
      StringBuffer var20;
      if (!Class394.o(var6.getDielectric())) {
         double var9 = Double.parseDouble(var6.getDielectric());
         if (!var6.getSkillid().equals("16014") && !var6.getSkillid().equals("16021")) {
            var20 = var1;
            var1.append((int)var9);
            var1.append("玄元");
            var1.append("#r【冷却回合】10");
         } else {
            var20 = var1;
            var1.append((int)var9);
            var1.append("玄元/次");
         }
      } else {
         var20 = var1;
         var1.append("无");
      }

      var20.append("#r");
      var2 = rs(var1, var2, "#G");
      var1.append(si(var6.getRemark(), var6, (double)var13.getLvl(), var7, var8));
      var2 = rs(var1, var2, "#cC8B591");
      var1.append("#r #r【玄印】");
      int var16 = 5 >> 3;

      int var21;
      for(var21 = var16; var21 < var5.getYins().length; var21 = var16) {
         var1.append("#r");
         Point var10 = var13.getXuanYinByIndex(var16);
         if (var10 == null) {
            var1.append(" 未开启");
         } else {
            XuanYin var14 = var10.x != 0 ? var4.ao(Math.abs(var10.x)) : null;
            if (var14 == null) {
               var1.append(" 未镶嵌");
            } else {
               double var11;
               double var22 = var11 = var14.getBaseQl().getValue() * (double)var10.y;
               var1.append("#VIMG2|18|18|sc/item/xya" + Math.abs(var10.x) + "#L");
               var1.append("[" + var10.y + "级]");
               var1.append(var14.getBaseQl().getKey());
               var1.append(" ");
               if (var22 > 0.0D) {
                  var1.append("+");
               }

               var1.append(Class394.ak(var11, 3 >> 1));
               var1.append(so(var14.getBaseQl().getKey()));
            }
         }

         ++var16;
      }

      rs(var1, var2, "#G");
      var1.append("#r #r【玄宝印鸣技能】");
      Point[] var17 = var13.c(var5, var4);
      int var18 = 3 >> 2;

      for(var21 = var18; var21 < var5.getResonances().length; var21 = var18) {
         Point var15 = var17[var18 / --3];
         var1.append("#r");
         var1.append("#VIMG2|12|12|sc/e/xy" + (var15.x > 0 ? "c" : "d") + var5.getResonances()[var18] + "#L");
         var1.append("#VIMG2|12|12|sc/e/xy" + (var15.y > 0 ? "c" : "d") + var5.getResonances()[var18 + (3 >> 1)] + "#L ");
         if (var15.x > 0 && var15.y > 0) {
            Skill var19 = var4.bf(String.valueOf(var5.getResonances()[var18 + (5 >> 1)]));
            var1.append("[#R" + (var15.x + var15.y) + "#G级]");
            var1.append(si(var19.getRemark(), var19, (double)(var15.x + var15.y), var7, var8));
         } else {
            var1.append("未激活");
         }

         var18 += 3;
      }

   }

   public static String si(String var0, Skill var1, double var2, int var4, int var5) {
      if (var1.getFormulas() == null) {
         return var0;
      } else {
         int var10000;
         String var10001;
         int var6;
         if (var2 != -9999.0D) {
            for(var10000 = var6 = 0; var10000 < var1.getFormulas().length; var10000 = var6) {
               double var7 = var1.getFormulas()[var6].a(var2, var4, var5);
               var10001 = "{公式" + Class509.l(var6 + (5 >> 2)) + "}";
               StringBuilder var10002 = (new StringBuilder("#R")).append(Class394.ak(var7, var7 < 200.0D ? 4 ^ 5 : 0)).append("#G");
               ++var6;
               var0 = var0.replace(var10001, var10002.toString());
            }

            return var0;
         } else {
            for(var10000 = var6 = 3 & 4; var10000 < var1.getFormulas().length; var10000 = var6) {
               var10001 = "{公式" + Class509.l(var6 + --1) + "}";
               ++var6;
               var0 = var0.replace(var10001, "0");
            }

            return var0;
         }
      }
   }

   public void sj(StringBuffer var1, String var2, Goodstable var3) {
      if (!Class394.o(var3.getValue())) {
         String var11 = var3.getValue();
         String var4 = null;
         int var5 = 3 & 4;
         int var6 = 2 & 5;
         int var7 = 5 >> 3;

         int var8;
         for(int var10000 = var8 = 3 ^ 3; var10000 < var11.length(); var10000 = var8) {
            if ((var8 = var11.indexOf("|", var7 + (4 ^ 5))) == -4 >> 2) {
               var8 = var11.length();
            }

            if (var6 == 0) {
               var4 = var11.substring(var7 + --3, var8);
               if (var1.length() != 0) {
                  var1.append("#r");
               }

               var2 = rs(var1, var2, "#cFFFFFF");
               var1.append("【品质】");
               var2 = rs(var1, var2, GoodType.getQualityColorOx(var4));
               var1.append(var4);
               var10000 = var8;
            } else if (var6 == --1) {
               var5 = Class394.b(var11, var7 + --3, var8);
               if (var1.length() != 0) {
                  var1.append("#r");
               }

               var2 = rs(var1, var2, "#cFFFFFF");
               var1.append("【星级】");
               var2 = rs(var1, var2, "#cFFFF00");
               var1.append(var5);
               var1.append("/15");
               var10000 = var8;
            } else if (var6 == --2) {
               int var12 = Class394.b(var11, var7 + --3, var8);
               if (var1.length() != 0) {
                  var1.append("#r");
               }

               var2 = rs(var1, var2, "#cFFFFFF");
               var1.append("【等级】");
               var1.append(BaseValue.getWingLevel(var12));
               if (var1.length() != 0) {
                  var1.append("#r");
               }

               var2 = rs(var1, var2, "#cFFFFFF");
               var1.append("【经验】");
               var1.append(var12);
               var10000 = var8;
            } else if (var6 == --3) {
               if (var1.length() != 0) {
                  var1.append("#r");
               }

               var2 = rs(var1, var2, "#cFFFFFF");
               var1.append("【颜色】");
               var1.append(var11.substring(var7 + --3, var8));
               var10000 = var8;
            } else {
               String var9;
               if (!(var9 = var11.substring(var7, var8)).startsWith("力量") && !var9.startsWith("灵性") && !var9.startsWith("根骨") && !var9.startsWith("敏捷")) {
                  if (var9.startsWith(GoodType.Extras[3 >> 2])) {
                     this.st(var1, var9, 8888L);
                  }

                  var10000 = var8;
               } else {
                  String[] var10 = var9.split("=");
                  if (var1.length() != 0) {
                     var1.append("#r");
                  }

                  var2 = rs(var1, var2, "#cCDCA6D");
                  var1.append(var10[3 >> 2]);
                  var1.append(" ");
                  var1.append(BaseValue.getUpStarData(var10[--1], var5, var4));
                  var2 = rs(var1, var2, "#cFFFFFF");
                  var1.append("(");
                  var1.append(var10[3 >> 1]);
                  var1.append(")");
                  var10000 = var8;
               }
            }

            ++var6;
            var7 = var10000 + 1;
         }

      }
   }

   public static String sk(String var0) {
      StringBuffer var1 = new StringBuffer();

      try {
         if (Double.parseDouble(var0) > 0.0D) {
            var1.append("+");
         }

         String[] var2 = var0.split("\\.");
         var1.append(var2[2 & 5]);
         if (var2.length >= --2) {
            var1.append(".");
            var1.append(var2[3 >> 1].charAt(2 & 5));
         }

         return var1.toString();
      } catch (Exception var3) {
         return var0;
      }
   }

   public void sl(StringBuffer var1, String var2) {
      if (var1.length() != 0) {
         var1.append("#r");
      }

      String var5 = rs(var1, (String)null, "#c00ffff");
      var1.append("【套装属性】");
      String[] var8 = var2.split("&");
      int var4 = --4;

      int var10000;
      for(var10000 = var4; var10000 < var8.length; var10000 = var4) {
         String[] var3 = var8[var4].split("=");
         if (var1.length() != 0) {
            var1.append("#r");
         }

         var5 = rs(var1, var5, "#c00CD00");
         var1.append(var3[3 & 4]);
         var1.append(" ");
         var1.append(sk(var3[4 ^ 5]));
         int var10005 = 2 & 5;
         ++var4;
         var1.append(so(var3[var10005]));
      }

      if (var1.length() != 0) {
         var1.append("#r");
      }

      var5 = rs(var1, (String)null, "#c00ffff");
      var1.append("【套装品质:");
      var1.append(var8[--3]);
      var1.append("】");
      var4 = Integer.parseInt(var8[5 >> 2]);
      RoleSuitBean var10 = this.vc().bx(var4);
      if (var10 != null) {
         int var9 = this.vd().getRoleProperty().getSuitSum(var8[3 & 5]);
         String[] var12 = var10.getHaveSkill().split("\\|");

         int var11;
         for(var10000 = var11 = 5 >> 3; var10000 < var12.length; var10000 = var11) {
            String[] var6 = var12[var11].split("-");
            int var7 = Integer.parseInt(var6[3 & 4]);
            Skill var13;
            if ((var13 = this.vc().bf(var6[5 >> 2])) != null) {
               if (var1.length() != 0) {
                  var1.append("#r");
               }

               StringBuffer var14;
               if (var9 >= var7) {
                  var5 = rs(var1, (String)null, "#c00CD00");
                  var1.append("[");
                  var14 = var1;
                  var1.append(var7);
               } else {
                  var14 = var1;
                  var5 = rs(var1, (String)null, "#c807876");
                  var1.append("[");
                  var1.append(var9);
               }

               var14.append("/");
               var1.append(var7);
               var1.append("]");
               var1.append(var13.getSkillname());
            }

            ++var11;
         }
      }

   }

   public void sm(StringBuffer var1, String var2, Goodstable var3) {
      if (!Class394.o(var3.getValue())) {
         String[] var4 = var3.getValue().split("\\|");
         int var5 = 3 >> 2;
         if (var1.length() != 0) {
            var1.append("#r");
         }

         var2 = rs(var1, var2, "#cFFFFFF");
         var1.append("【等级】 ");
         String var10003 = var4[var5];
         ++var5;
         var1.append(var10003.substring(--3));
         if (var1.length() != 0) {
            var1.append("#r");
         }

         var2 = rs(var1, var2, "#cFFFFFF");
         var1.append("【等级要求】 ");
         String var10002 = var4[var5];
         ++var5;
         var1.append(var10002.substring(--5));
         if (var4[var5].startsWith("性别")) {
            if (var1.length() != 0) {
               var1.append("#r");
            }

            var2 = rs(var1, var2, "#c1E90FF");
            var1.append("【性别要求】 ");
            String var6 = var4[var5].substring(--5);
            var1.append(var6.equals("1") ? "男" : (var6.equals("0") ? "女" : "全部性别"));
            ++var5;
         }

         if (var1.length() != 0) {
            var1.append("#r");
         }

         var2 = rs(var1, var2, "#c1E90FF");
         var1.append("【品质】 ");
         var10002 = var4[var5];
         ++var5;
         var1.append(var10002.substring(--3));
         int var10000 = var5;

         StringBuffer var9;
         while(true) {
            if (var10000 >= var4.length) {
               var9 = var1;
               break;
            }

            if (var4[var5].startsWith("契合度")) {
               var9 = var1;
               break;
            }

            if (var1.length() != 0) {
               var1.append("#r");
            }

            String[] var7 = var4[var5].split("=");
            var2 = rs(var1, var2, "#cDEDE9E");
            var1.append(var7[3 ^ 3]);
            var1.append(sk(var7[3 & 5]));
            int var10004 = 3 & 4;
            ++var5;
            var1.append(so(var7[var10004]));
            var10000 = var5;
         }

         if (var9.length() != 0) {
            var1.append("#r");
         }

         rs(var1, var2, "#cDEDE9E");
         var1.append("契合度 ");
         var1.append(var4[var5].substring(--4));
         int var8 = var5 + --1;

         for(var10000 = var8; var10000 < var4.length; var10000 = var8) {
            var10002 = var4[var8];
            ++var8;
            this.st(var1, var10002, var3.getType());
         }

      }
   }

   public void sn(UseCardBean var1) {
      this.o();
      StringBuffer var2;
      (var2 = new StringBuffer()).append("#Y ");
      var2.append(var1.getName());
      int var13;
      UseCardBean var10000;
      if (var1.getType().equals("SVIP")) {
         var10000 = var1;
         var2.append("#r#Y以下加成只在PVE有效");
      } else {
         if (var1.getType().equals("TT")) {
            if (!Class394.o(var1.getValue())) {
               Class603 var9 = this.vc();
               String[] var10 = var1.getValue().split("\\|");

               int var11;
               for(var13 = var11 = 2 & 5; var13 < var10.length; var13 = var11) {
                  int var12 = Integer.parseInt(var10[var11]);
                  Buff var7;
                  if ((var7 = var9.p(var12)) != null) {
                     var2.append("#r");
                     var2.append(var7.getColor());
                     var2.append(var7.getbName());
                  }

                  ++var11;
               }
            }

            this.q.setTextSize(var2.toString(), 11775 & 21247);
            this.p();
            return;
         }

         if (var1.getType().equals("月卡")) {
            if (this.uw().n(5 >> 1, 47 & 92)) {
               var2.append("#r #W1.每日奖励领取");
               var2.append("#r #W2.可购买副本次数");
               var2.append("#r #W3.激活助手功能");
               var2.append("#r #W4.死亡后，默认回复血法");
               var2.append("#r #W5.PVE中获得BUFF加成(锐不可挡:全系强法5%(强震慑2%))");
               var10000 = var1;
            } else {
               var2.append("#r #W1.每日奖励领取");
               var2.append("#r #W2.可购买副本次数");
               var2.append("#r #W3.激活助手功能");
               var2.append("#r #W4.死亡后，默认回复血法");
               var2.append("#r #W5.PVE中获得BUFF加成(锦上添花:使用多体法术攻击时，有30%概率额外增加一个单位)");
               var10000 = var1;
            }
         } else if (var1.getType().equals("季卡")) {
            if (this.uw().n(--2, 109 & 30)) {
               var2.append("#r #W1.每日奖励领取");
               var2.append("#r #W2.增加1次副本次数");
               var2.append("#r #W3.激活助手功能");
               var2.append("#r #W4.增加获得物品概率3%");
               var2.append("#r #W5.明雷战斗中有20%概率额外获得一次物品奖励（不包含经验、金钱、副本积分等奖励）");
               var10000 = var1;
            } else {
               var2.append("#r #W1.每日奖励领取");
               var2.append("#r #W2.增加1次副本次数");
               var2.append("#r #W3.激活助手功能");
               var2.append("#r #W4.增加获得物品概率3%");
               var2.append("#r #W5.PVE中获得BUFF加成(锐不可当:每回合开始时30%概率获得20点伤害系忽视,10点控制系忽视,持续一回合)");
               var10000 = var1;
            }
         } else {
            long var3;
            if ((var3 = (long)Math.max(var1.getUseTime(), 2 & 5)) > 0L) {
               var2.append("  #G剩余时间#Y");
               var2.append(var3);
               var2.append("#G分钟");
            }

            var10000 = var1;
         }
      }

      if (!Class394.o(var10000.getValue())) {
         String[] var8 = var1.getValue().split("\\|");

         int var4;
         for(var13 = var4 = 5 >> 3; var13 < var8.length; var13 = var4) {
            String[] var5;
            if ((var5 = var8[var4].split("=")).length == --2) {
               if (var5[2 & 5].equals("技能")) {
                  Skill var6;
                  Skill var14 = var6 = this.vc().bf(var5[--1]);
                  var2.append("#r#W  ");
                  var2.append(var5[5 >> 3]);
                  var2.append(" ");
                  if (var14 == null) {
                     var2.append("未知技能-" + var5[--1]);
                  } else if (var6.getSkillid().equals("8052")) {
                     var2.append(var6.getRemark());
                  } else {
                     var2.append(var6.getSkillname());
                  }
               } else if (!var5[3 ^ 3].equals("标签") && !var5[3 >> 2].equals("值") && !var5[5 >> 3].equals("皮肤") && !var5[3 ^ 3].equals("方向") && !var5[3 & 4].equals("变身卡类") && !var5[3 & 4].equals("lvl") && !var5[3 & 4].equals("刮奖") && !var5[5 >> 3].equals("卡类")) {
                  var2.append("#r#W  ");
                  var2.append(var5[3 ^ 3]);
                  var2.append(" ");
                  var2.append(sk(var5[2 ^ 3]));
                  var2.append(so(var5[2 & 5]));
               }
            } else if (var5.length == (2 ^ 3)) {
               var2.append("#r#W  ");
               var2.append(var5[3 & 4]);
            }

            ++var4;
         }
      }

      this.q.setTextSize(var2.toString(), 23807 & 9215);
      this.p();
   }

   public void bh(StallBuyData var1) {
      String var10000 = "#W";
      int var10004 = --1;
      this.o();
      this.gw = var10004;
      this.bl.hf(Class222.i(var1.getSkin()));
      this.aj.setTextSize("#cFFFF75" + var1.getName(), 29663 & 3319);
      StringBuffer var2 = new StringBuffer();
      if (var1.getText() != null && !var1.getText().equals("")) {
         var2.append(var1.getText());
      }

      int var10001 = 5 >> 3;
      this.q.setTextSize(var2.toString(), 3799 & 29183);
      this.r((boolean)var10001);
   }

   public boolean ee(String var1) {
      return var1.equals("朱雀") || var1.equals("青龙") || var1.equals("白虎") || var1.equals("玄武");
   }

   public static String so(String var0) {
      if (var0.indexOf("抗") != -4 >> 2) {
         return !var0.equals("抗三尸虫") && !var0.equals("抗三尸") && !var0.equals("抗浩然正气") && !var0.equals("抗隔山打牛") && !var0.equals("抗青面獠牙") && !var0.equals("抗天魔解体") && !var0.equals("抗小楼夜哭") && !var0.equals("抗分光化影") && !var0.startsWith("抗毒伤") && !var0.equals("随机抗灵宝伤害") ? "%" : "";
      } else if (var0.endsWith("加成")) {
         return "%";
      } else if (!var0.equals("上善若水") && !var0.equals("尘埃落定") && !var0.equals("灵犀一点") && !var0.equals("化血成碧") && !var0.equals("美人迟暮") && !var0.equals("明珠有泪")) {
         if (!var0.equals("对无属性目标伤害") && !var0.equals("加成攻击")) {
            if (var0.indexOf("强") != -4 >> 2 || var0.indexOf("程度") != -4 >> 2 || var0.indexOf("率") != -4 >> 2 || var0.indexOf("狂暴") != -4 >> 2 || var0.indexOf("命中") != -4 >> 2 || var0.indexOf("致命") != -4 >> 2 || var0.indexOf("忽视") != -4 >> 2 || var0.indexOf("属性需求") != -4 >> 2) {
               if (var0.indexOf("三尸虫") != -4 >> 2) {
                  if (var0.indexOf("程度") != -4 >> 2) {
                     return "%";
                  }

                  return "";
               }

               if (var0.indexOf("次数") == -4 >> 2 && !var0.endsWith("值")) {
                  return "%";
               }
            }

            return "";
         } else {
            return "%";
         }
      } else {
         return "";
      }
   }

   public void sp(StringBuffer var1, String var2, String var3, long var4) {
      if (!Class394.o(var3)) {
         int var16 = 0;
         int var5 = 3 & 4;

         int var6;
         for(int var10000 = var6 = 3 >> 2; var10000 < var3.length(); var10000 = var6) {
            if ((var6 = var3.indexOf("|", var5 + --1)) == -4 >> 2) {
               var6 = var3.length();
            }

            int var7;
            String var8;
            if ((var8 = var3.substring(var5, var6)).startsWith(GoodType.Extras[3 & 5])) {
               String[] var17;
               if ((var17 = var8.split("&")).length <= 5 >> 1) {
                  var2 = rs(var1, var2, "#G");
                  var1.append("#r");
                  var1.append("点金成功");
                  var10000 = var6;
               } else {
                  int var10;
                  var10000 = var10 = 2;

                  while(true) {
                     if (var10000 >= var17.length) {
                        var10000 = var6;
                        break;
                     }

                     if ((var7 = var17[var10].indexOf("=")) != -4 >> 2) {
                        String var11;
                        if ((var11 = var17[var10].substring(3 ^ 3, var7)).equals("特技")) {
                           var2 = rs(var1, var2, "#c868090");
                           var1.append("#r特技");
                           Class603 var12 = this.vc();
                           String[] var13 = var17[var10].split("=");
                           int var14 = --1;

                           for(var10000 = var14; var10000 < var13.length; var10000 = var14) {
                              Skill var15;
                              if ((var15 = var12.bf(var13[var14])) != null) {
                                 var1.append("#r");
                                 var1.append(var15.getSkillname());
                                 var1.append(":");
                                 var1.append(var15.getRemark());
                              }

                              ++var14;
                           }
                        } else {
                           var2 = rs(var1, var2, "#G");
                           var1.append("#r");
                           var1.append(var11);
                           var1.append(" ");
                           if (var17[var10].charAt(var7 + --1) != (61 & 111)) {
                              var1.append("+");
                           }

                           var1.append(var17[var10].substring(var7 + (3 & 5)));
                        }
                     }

                     ++var10;
                     var10000 = var10;
                  }
               }
            } else if ((var7 = var8.indexOf("=")) == -4 >> 2) {
               var10000 = var6;
            } else {
               label109: {
                  String var9;
                  if (!(var9 = var8.substring(3 & 4, var7)).equals("等级") && !var9.equals("装备类型") && !var9.equals("性别要求")) {
                     var2 = rs(var1, var2, "#Y");
                     var1.append(var16 != 0 ? " " : "#r");
                     var1.append(var9);
                     if (var8.charAt(var7 + (3 & 5)) != (109 & 63)) {
                        var1.append("+");
                     }

                     var1.append(var8.substring(var7 + (3 >> 1)));
                     var16 = 4 ^ 5;
                  } else {
                     var2 = rs(var1, var2, "#W");
                     var1.append("#r");
                     var1.append(var9);
                     var1.append(": ");
                     var1.append(var8.substring(var7 + (2 ^ 3)));
                     if (var9.equals("等级")) {
                        var10000 = var6;
                        var1.append("级");
                        break label109;
                     }
                  }

                  var10000 = var6;
               }
            }

            var5 = var10000 + 1;
         }

      }
   }

   public void sq(Eshop var1) {
      int var10005 = 5 >> 2;
      this.o();
      this.gw = var10005;
      this.bl.hf(Class222.i(var1.getEshopskin()));
      this.aj.setTextSize("#cFFFF75" + var1.getEshopname(), 12279 & 20703);
      String var4 = "#W";
      StringBuffer var3 = new StringBuffer();
      Goodstable var2 = this.vc().n(new BigDecimal(var1.getEshopiid()));
      Goodstable var10000;
      if (var1.getEshoptext() != null && !var1.getEshoptext().equals("")) {
         var10000 = var2;
         var3.append(var1.getEshoptext());
      } else {
         if (var2 != null && var2.getInstruction() != null && !var2.getInstruction().equals("")) {
            var3.append(var2.getInstruction());
         }

         var10000 = var2;
      }

      if (var10000 != null && var2.getType() == 112L) {
         this.rb(var3, var4, var2.getValue(), var2.getType());
      }

      int var10001 = 2 & 5;
      this.q.setTextSize(var3.toString(), 19935 & 13047);
      this.r((boolean)var10001);
   }

   public int mi(int var1) {
      return var1 >= --5 ? 95 & 42 : (var1 << (4 ^ 5)) - (4 ^ 5);
   }

   public void sr(Baby var1, Talent var2, int var3, boolean var4, String var5, int var6) {
      if (this.uw().gameBaby) {
         this.rc(var1, var2, var3, var4, var5, var6);
      } else {
         this.o();
         StringBuffer var7 = new StringBuffer();
         var7.append("#Y ");
         boolean var10000;
         if (!var4 && var3 != 0) {
            var7.append("强化");
            var7.append(var2.getTalentName());
            var7.append(" ");
            var7.append(var3);
            var7.append("级");
            var10000 = var4;
         } else {
            var7.append(var2.getTalentName());
            var10000 = var4;
         }

         Class270 var9;
         if (var10000) {
            String var8 = var2.getText().replace("{触发几率}", (double)var3 * var2.getTouch() + "%").replace("{要求}", this.sb(var2.getDemand(), var3));
            var9 = this;
            var7.append("#r#W");
            var7.append(var8);
         } else {
            var9 = this;
            this.su(var7, var2, var3, var5, var6);
         }

         var9.q.setTextSize(var7.toString(), 8959 & 24063);
         this.p();
      }
   }

   public void d() {
      int var10003 = 14663 & 18424;
      this.bl.setVisible((boolean)(4 ^ 5));
      this.aj.setBounds(91 & 126, --5, this.aj.getWidth(), this.aj.getHeight());
      this.q.setBounds(95 & 122, (74 & 63) + this.aj.getHeight(), this.q.getWidth(), this.q.getHeight());
      int var1 = var10003;
      int var2 = Math.max(127 & 120, (95 & 52) + this.q.getHeight() + this.aj.getHeight());
      Point var10002 = this.ux().abg(var1, var2);
      this.vf(var10002.x, var10002.y, var1, var2);
      this.ve().a(this.ae());
   }

   public void ss(StringBuffer var1, String var2, String var3, long var4) {
      if (var3 != null && !var3.equals("")) {
         int var7;
         if ((var7 = var3.indexOf("|")) != -4 >> 2) {
            String var10000 = var3;
            int var6 = Integer.parseInt(var3.substring(--3, var7));
            String var8 = var10000.substring(var7 + --4);
            Skill var9;
            if ((var9 = this.vc().bf(var8)) != null) {
               var2 = rs(var1, var2, "#G");
               var1.append(var6 == (1 ^ 3) ? "当前灵阶为4~9级时可用" : "当前灵阶为0~4级时可用");
               rs(var1, var2, "#R");
               var1.append("技能:" + var9.getSkillname());
            }
         }
      }
   }

   public String st(StringBuffer var1, String var2, long var3) {
      String var5 = null;
      String var6 = null;
      int var7 = !GoodType.aa(var3) && !GoodType.an(var3) ? 3 >> 2 : 1;
      String[] var10 = var2.split("&");

      int var11;
      for(int var10000 = var11 = 4 ^ 5; var10000 < var10.length; var10000 = var11) {
         if (var10[var11].startsWith("星阵属性")) {
            var5 = var10[var11];
         } else {
            String[] var4 = var10[var11].split("=");
            if (var1.length() != 0) {
               var1.append("#r");
            }

            if (var4[3 & 4].equals("特技")) {
               var6 = rs(var1, var6, "#c868090");
               var1.append("特技");
               int var8 = --1;

               for(var10000 = var8; var10000 < var4.length; var10000 = var8) {
                  Skill var9;
                  if ((var9 = this.vc().bf(var4[var8])) != null) {
                     if (var1.length() != 0) {
                        var1.append("#r");
                     }

                     var1.append(var9.getSkillname());
                     var1.append(":");
                     var1.append(var9.getRemark());
                  }

                  ++var8;
               }
            } else if (var4[3 >> 2].endsWith("等级")) {
               var6 = rs(var1, var6, "#c00CD00");
               var1.append(var4[2 & 5]);
               var1.append(" ");
               var1.append(var4[--1]);
               var1.append("级");
            } else if (var4[3 & 4].equals("资质")) {
               var6 = rs(var1, var6, "#cFFFFFF");
               var1.append("【神通】");
               var1.append(var4[3 & 4]);
               var1.append(" ");
               var1.append(var4[--1]);
               var1.append("/100");
            } else {
               var6 = rs(var1, var6, var7 != 0 ? "#c00EAFF" : "#c00CD00");
               var1.append(var4[5 >> 3]);
               var1.append(" ");
               var1.append(sk(var4[3 >> 1]));
               var1.append(so(var4[3 >> 2]));
            }
         }

         ++var11;
      }

      return var5;
   }

   public void su(StringBuffer var1, Talent var2, int var3, String var4, int var5) {
      String[] var6;
      if ((var6 = var2.getValue().split("\\|")).length == (1 ^ 3)) {
         var6 = var6[--1].split("=");
         var1.append("#r");
         var1.append(" #W发动");
         var1.append(var2.getTalentName());
         var1.append("时增加");
         var1.append(var6[3 & 4]);
         var6 = var6[3 & 5].split("\\+");
         var1.append(Double.parseDouble(var6[3 >> 2]) + Double.parseDouble(var6[4 ^ 5]) * (double)var3);
      }

      var1.append("#r");
      String var10000;
      if (var3 >= (106 & 31)) {
         var10000 = var4;
         var1.append("#G已经达到最高级别了");
      } else {
         if (var3 >= (94 & 43)) {
            var1.append("#G可以通过点击技能格子消耗琼浆玉液来强化此技能,有几率成功");
         }

         var10000 = var4;
      }

      if (Class394.o(var10000)) {
         var1.append("#r#G还未获取结局,不可强化此技能格子");
      } else {
         BabyResult var7 = this.vc().bi(var4);
         var3 = 3 ^ 3;
         int var8;
         if (var5 == 0) {
            var8 = var7.getQ1();
         } else if (var5 == --1) {
            var8 = var7.getQ2();
         } else {
            if (var5 == --2) {
               var3 = var7.getQ3();
            }

            var8 = var3;
         }

         switch(var8) {
         case 0:
            while(false) {
            }

            var1.append("#r#G此技能格可强化天资:不可强化");
            return;
         case 1:
            var1.append("#r#G此技能格可强化天资:可强化低级人族天资");
            return;
         case 2:
            var1.append("#r#G此技能格可强化天资:可强化低级魔族天资");
            return;
         case 3:
            var1.append("#r#G此技能格可强化天资:可强化低级仙族天资");
            return;
         case 4:
            var1.append("#r#G此技能格可强化天资:可强化低级鬼族天资");
            return;
         case 5:
            var1.append("#r#G此技能格可强化天资:可强化全部低级天资");
            return;
         case 6:
            var1.append("#r#G此技能格可强化天资:可强化高级人族天资");
            return;
         case 7:
            var1.append("#r#G此技能格可强化天资:可强化高级魔族天资");
            return;
         case 8:
            var1.append("#r#G此技能格可强化天资:可强化高级仙族天资");
            return;
         case 9:
            var1.append("#r#G此技能格可强化天资:可强化高级鬼族天资");
            return;
         case 10:
            var1.append("#r#G此技能格可强化天资:可强化全部高级天资");
            return;
         case 11:
            var1.append("#r#G此技能格可强化天资:可强化全部天资");
         default:
         }
      }
   }

   public void f(String var1) {
      if (!Class394.o(var1)) {
         this.o();
         this.q.setTextSize(var1, 27647 & 5375);
         this.p();
      }
   }
}
