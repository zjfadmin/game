package com.xy;

import com.xy.bean.NpcComposeBean;
import com.xy.bean.SuitOperBean;
import com.xy.formula.GoodType;
import com.xy.formula.MsgUntil;
import com.xy.game.RoleData;
import com.xy.readbean.Goodstable;
import com.xy.readbean.MoneyType;
import com.xy.socket.Agreement;
import com.xy.socket.ParamTool;
import com.xy.text.GameView;
import java.awt.Color;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JLabel;

public class Class108 extends Class345 {
   private Class556 ps;
   private BigDecimal rc;
   private Class245 rd;
   private Class529 hy;
   private Class436[] pv;
   private Class585 re;
   private JLabel[] ad;
   private Class44[] px;
   private String rf;

   public Class108(GameView var1) {
      int var10008 = -4 >> 2;
      super(123 & 30, 5 >> 1, Class345.aef, var1);
      this.rc = new BigDecimal(100000);
      this.va(var10008, 2 & 5, 21951 & 11218, 15243 & 17917, Class345.aeo);
      this.uv(Class511.q("sc/d/1.png", 108 & 87, 108 & 87, 108 & 87, 108 & 87, (boolean)(3 >> 2)), "打造");
      this.hy = new Class529("sc/e/31.png", 5 >> 2, 88 & 111, Class681.ak, Class681.c, "打 造", this);
      this.hy.setBounds(7662 & 25403, 127 & 115, 95 & 111, 89 & 63);
      this.add(this.hy);
      this.rd = Class133.a(4447 & 28583, 125 & 47, 123 & 118, 115 & 31, 123 & 14, Color.white, Class681.ce);
      this.rd.eq(Class511.q("sc/d/17.png", --3, --3, --3, --3, (boolean)(5 >> 3)));
      this.add(this.rd);
      this.ps = Class133.i(43 & 94, Color.white, Class681.ce, (MoneyType)null, var1);
      this.ps.eq(Class511.q("sc/d/17.png", --3, --3, --3, --3, (boolean)(2 & 5)));
      this.ps.ab(--2);
      this.ps.setText("0");
      this.ps.setBounds(28431 & 4599, 80, 114, 19);
      MoneyType var2 = new MoneyType();
      var2.setId(4 ^ 5);
      var2.setKey("现金");
      this.ps.xa(var2);
      this.add(this.ps);
      Class681.j(this.rd, this.rc.longValue());
      JLabel[] var10001 = new JLabel[--4];
      boolean var10003 = true;
      this.ad = var10001;

      int var10000;
      int var3;
      for(var10000 = var3 = 2 & 5; var10000 < this.ad.length; var10000 = var3) {
         this.ad[var3] = Class133.c(46, 32 + 26 * var3, 36, 19, 3 & 4, Class681.c("#cFFFFFF"), Class681.bm);
         this.ad[var3].setText(var3 == 0 ? "" : (var3 == 3 >> 1 ? "" : (var3 == (1 ^ 3) ? "所需金额" : (var3 == --3 ? "现 金" : ""))));
         this.add(this.ad[var3]);
         if (var3 == 0) {
            this.ad[var3].setBounds(53, 38, 57, 21);
         } else if (var3 == (4 ^ 5)) {
            this.ad[var3].setBounds(127, 38, 62, 21);
         } else if (var3 >= (1 ^ 3) && var3 <= --3) {
            this.ad[var3].setForeground(Class681.c("#c000000"));
            this.ad[var3].setFont(Class681.ak);
            if (var3 == --2) {
               this.ad[var3].setBounds(190, 45, 72, 19);
            } else if (var3 == --3) {
               this.ad[var3].setBounds(215, 80, 48, 19);
            }
         }

         ++var3;
      }

      Class44[] var4 = new Class44[5 >> 1];
      var10003 = true;
      this.px = var4;

      for(var10000 = var3 = 5 >> 3; var10000 < this.px.length; var10000 = var3) {
         this.px[var3] = new Class44(this);
         this.px[var3].setBounds(56 + 76 * var3, 61, 50, 50);
         this.add(this.px[var3++]);
      }

      Class436[] var5 = new Class436[9];
      var10003 = true;
      this.pv = var5;

      for(var10000 = var3 = 5 >> 3; var10000 < this.pv.length; var10000 = var3) {
         label81: {
            this.pv[var3] = new Class436();
            this.add(this.pv[var3]);
            if (var3 >= 0 && var3 <= 5 >> 2) {
               this.pv[var3].eq(Class511.q("sc/d/25.png", 5 >> 1, 5 >> 1, 5 >> 1, 5 >> 1, (boolean)(2 & 5)));
               if (var3 == 0) {
                  var10000 = var3;
                  this.pv[var3].setBounds(53, 38, 57, 21);
                  break label81;
               }

               if (var3 == --1) {
                  this.pv[var3].setBounds(127, 38, 62, 21);
               }
            }

            var10000 = var3;
         }

         if (var10000 >= 2 && var3 <= --3) {
            this.pv[var3].fw("sc/d/30.png");
            this.pv[var3].setBounds(54 + 76 * (var3 - (5 >> 1)), 59, 55, --1);
         }

         if (var3 >= 4 && var3 <= 5) {
            this.pv[var3].fw("sc/d/4.png");
            this.pv[var3].setBounds(52 + 76 * (var3 - 4), 57, 59, 57);
         }

         if (var3 >= 6 && var3 <= 7) {
            this.pv[var3].fw("sc/d/30.png");
            this.pv[var3].setBounds(53 + 76 * (var3 - 6), 114, 58, --1);
         }

         if (var3 == 8) {
            this.pv[var3].eq(Class511.q("sc/d/19.png", 5, 5, 5, 5, (boolean)(3 ^ 3)));
            this.pv[var3].setBounds(47, 158, 309, 207);
         }

         ++var3;
      }

      this.re = new Class585(this, 6, 4, 51, 51, 3 ^ 3, 3 ^ 3, 48, 160);
      this.re.hf(Class511.a("sc/d/18.png"));
      this.re.gb((boolean)(3 & 5));
      this.add(this.re);
   }

   public void q() {
      this.d();
      super.q();
   }

   public void av(Goodstable var1) {
      int var2;
      for(int var10000 = var2 = 2 & 5; var10000 < this.px.length; var10000 = var2) {
         if (this.px[var2].tp() == 3 >> 1) {
            Goodstable var3 = (Goodstable)this.px[var2].hr();
            if (Class394.v(var1.getRgid(), var3.getRgid())) {
               if (var1.getUsetime() > 0) {
                  this.px[var2].c(--1, var1);
               } else {
                  this.px[var2].c(2 & 5, (Object)null);
               }
            }
         }

         ++var2;
      }

   }

   public void ax(Goodstable var1) {
      if (this.rf.equals("我要合成仙器")) {
         if (var1.getType() == 7099L) {
            this.px[3 >> 2].c(5 >> 2, var1);
            return;
         }

         if (GoodType.an(var1.getType())) {
            this.px[--1].c(2 ^ 3, var1);
            return;
         }
      } else if (this.rf.equals("我要升级仙器")) {
         if (var1.getType() == 7099L) {
            this.px[3 ^ 3].c(--1, var1);
            return;
         }

         if (GoodType.j(var1.getType())) {
            this.px[4 ^ 5].c(3 >> 1, var1);
            return;
         }
      } else if (this.rf.equals("我要洗炼仙器")) {
         if (GoodType.an(var1.getType())) {
            this.px[3 & 4].c(3 & 5, var1);
            return;
         }

         if (var1.getType() == 212L) {
            this.px[5 >> 2].c(3 >> 1, var1);
            return;
         }
      } else if (!this.rf.equals("打造11-16级装备") && !this.rf.equals("我要打造普通装备")) {
         if (this.rf.equals("我要升级神兵")) {
            if (GoodType.aa(var1.getType())) {
               this.px[3 & 4].c(4 ^ 5, var1);
               return;
            }

            if (GoodType.j(var1.getType())) {
               this.px[3 & 5].c(5 >> 2, var1);
               return;
            }
         } else {
            Goodstable var2;
            if (this.rf.equals("我要合成炼妖石")) {
               if (GoodType.ah(var1.getType())) {
                  if (this.uw().n(5 >> 1, 111 & 28) && Class394.an(var1.getValue(), "等级=", "|") >= (47 & 90)) {
                     this.ux().f("炼妖石最高10级");
                     return;
                  }

                  if ((var2 = (Goodstable)this.px[0].hr()) != null) {
                     var2 = this.vd().getGood(var2.getRgid());
                  }

                  if (var2 == null) {
                     this.px[0].c(1, var1);
                     return;
                  }

                  if (var2 != var1) {
                     if (Class394.an(var2.getValue(), "等级=", "|") != Class394.an(var1.getValue(), "等级=", "|")) {
                        return;
                     }

                     this.px[1].c(1, var1);
                     return;
                  }
               }
            } else if (this.rf.equals("我要培养饰品")) {
               if (var1.getType() == 1008L) {
                  this.px[1].c(1, var1);
                  return;
               }

               if (GoodType.am(var1.getType())) {
                  if ((var2 = (Goodstable)this.px[0].hr()) != null) {
                     var2 = this.vd().getGood(var2.getRgid());
                  }

                  if (var2 == null) {
                     this.px[0].c(1, var1);
                     return;
                  }

                  if (var2 != var1) {
                     this.px[1].c(1, var1);
                     return;
                  }
               }
            } else if (this.rf.equals("我要重铸饰品")) {
               if (GoodType.am(var1.getType())) {
                  this.px[0].c(1, var1);
                  return;
               }

               if (GoodType.j(var1.getType())) {
                  this.px[1].c(1, var1);
                  return;
               }
            } else if (this.rf.equals("我要上神兵石")) {
               if (GoodType.aa(var1.getType())) {
                  this.px[0].c(1, var1);
                  return;
               }

               if (var1.getType() == 191L) {
                  this.px[1].c(1, var1);
                  return;
               }
            } else if (this.rf.equals("我要培养护身符")) {
               if (GoodType.h(var1.getType())) {
                  if ((var2 = (Goodstable)this.px[0].hr()) != null) {
                     var2 = this.vd().getGood(var2.getRgid());
                  }

                  if (var2 == null) {
                     this.px[0].c(1, var1);
                     return;
                  }

                  if (var2 != var1) {
                     this.px[1].c(1, var1);
                     return;
                  }
               }
            } else if (this.rf.equals("我要重铸护身符")) {
               if (GoodType.h(var1.getType())) {
                  this.px[0].c(1, var1);
                  return;
               }

               if (GoodType.j(var1.getType())) {
                  this.px[1].c(1, var1);
                  return;
               }
            } else if (this.rf.equals("炼化仙器")) {
               if (var1.getType() == 7005L) {
                  this.px[1].c(1, var1);
                  return;
               }

               if (GoodType.an(var1.getType())) {
                  if ((var2 = (Goodstable)this.px[0].hr()) != null) {
                     var2 = this.vd().getGood(var2.getRgid());
                  }

                  if (var2 == null) {
                     this.px[0].c(1, var1);
                     return;
                  }

                  if (var2 != var1) {
                     this.px[1].c(1, var1);
                     return;
                  }
               }
            } else if (this.rf.equals("培养彩晶石")) {
               if (var1.getType() == 729L) {
                  if ((var2 = (Goodstable)this.px[0].hr()) != null) {
                     var2 = this.vd().getGood(var2.getRgid());
                  }

                  if (var2 == null) {
                     this.px[0].c(1, var1);
                     return;
                  }

                  if (var2 != var1) {
                     this.px[1].c(1, var1);
                     return;
                  }
               }
            } else if (this.rf.equals("精炼神兵")) {
               if (GoodType.aa(var1.getType())) {
                  if ((var2 = (Goodstable)this.px[0].hr()) != null) {
                     var2 = this.vd().getGood(var2.getRgid());
                  }

                  if (var2 == null) {
                     this.px[0].c(1, var1);
                     return;
                  }

                  if (var2 != var1) {
                     this.px[1].c(1, var1);
                     return;
                  }
               }
            } else if (this.rf.equals("宝石合成")) {
               if (var1.getType() == 700L) {
                  if ((var2 = (Goodstable)this.px[0].hr()) != null) {
                     var2 = this.vd().getGood(var2.getRgid());
                  }

                  if (var2 == null) {
                     this.px[0].c(1, var1);
                     return;
                  }

                  if (var2 != var1) {
                     this.px[1].c(1, var1);
                     return;
                  }
               }
            } else if (this.rf.equals("宝石镶嵌") || this.rf.equals("宝石追加")) {
               if (GoodType.c(var1.getType())) {
                  this.px[0].c(1, var1);
                  return;
               }

               if (var1.getType() == 700L) {
                  this.px[1].c(1, var1);
               }
            }
         }
      } else {
         if (GoodType.c(var1.getType())) {
            this.px[3 >> 2].c(2 ^ 3, var1);
            return;
         }

         if (GoodType.j(var1.getType())) {
            this.px[--1].c(3 >> 1, var1);
            return;
         }
      }

   }

   public boolean jp(Goodstable var1, Goodstable var2) {
      int var4 = MsgUntil.getGoodLvl(var1.getValue());
      int var5 = MsgUntil.getGoodLvl(var2.getValue());
      int var10000;
      if (this.uw().n(5 >> 1, --3)) {
         if (var5 <= (107 & 29)) {
            return (boolean)(3 >> 2);
         }
      } else if (this.uw().gameType == (1 ^ 3)) {
         if (var5 >= (55 & 78)) {
            int var3 = --5 + var5;
            if (var4 < (123 & 15) && var3 == (127 & 11)) {
               return (boolean)(3 ^ 3);
            }

            if (var4 < (123 & 15) || var4 != var3 && var4 + (4 ^ 5) != var3) {
               this.aej.fw("需要使用对应等级的矿石来升级或者重铸");
               return (boolean)(5 >> 2);
            }

            return false;
         }

         if (var4 < (11 & 127)) {
            var10000 = 3 & 5;
            this.aej.fw("需要使用更高级的矿石");
            return (boolean)var10000;
         }

         return false;
      }

      if (var4 >= (63 & 74)) {
         var10000 = 3 & 5;
         this.aej.fw("打造11-16级装备去长安桥头!");
         return (boolean)var10000;
      } else if (var5 > (73 & 63)) {
         var10000 = 5 >> 2;
         this.aej.fw("打造1-10级装备最高只能使用9级矿石!");
         return (boolean)var10000;
      } else {
         return false;
      }
   }

   public void s() {
      if (!this.aej.t()) {
         RoleData var5;
         if ((var5 = this.vd()).getLoginResult().getGold().longValue() < this.rc.longValue()) {
            this.aej.fw("金钱不足");
         } else {
            Goodstable var3;
            int var4;
            int var10000;
            for(var10000 = var4 = 0; var10000 < this.px.length; var10000 = var4) {
               if ((var3 = (Goodstable)this.px[var4].hr()) != null) {
                  var3 = this.vd().getGood(var3.getRgid());
               }

               if (var3 == null || var3.getStatus() != 0) {
                  this.aej.f("请凑齐物品再来");
                  return;
               }

               if (var3.getGoodlock() == (4 ^ 5)) {
                  this.aej.f("该物品已被加锁");
                  return;
               }

               if (GoodType.ai(var3.getType()) != -4 >> 2) {
                  if (GoodType.getExtra(var3.getValue(), GoodType.Extras[--3]) != null) {
                     this.aej.f("套装无法用于打造系列");
                     return;
                  }

                  if (GoodType.getExtra(var3.getValue(), GoodType.Extras[--4]) != null || var3.getQhv() != null && var3.getQhv() > 0) {
                     this.aej.f("已镶嵌宝石无法用于打造系列");
                     return;
                  }
               }

               ++var4;
            }

            Goodstable var14 = (Goodstable)this.px[2 & 5].hr();
            var3 = (Goodstable)this.px[--1].hr();
            if (var14 != null) {
               var14 = var5.getGood(var14.getRgid());
            }

            if (var3 != null) {
               var3 = var5.getGood(var3.getRgid());
            }

            int var1;
            int var2;
            String var6;
            int var8;
            Matcher var18;
            int var19;
            if (this.rf.equals("我要合成仙器")) {
               if ((var2 = MsgUntil.getGoodLvl(var3.getValue())) == 0 || var2 >= (6 & 127)) {
                  this.aej.fw("最高合成六阶仙器");
                  return;
               }

               if ((var1 = MsgUntil.getGoodLvl(var14.getValue())) == var2) {
                  var8 = (var18 = Pattern.compile("灵气=(.*?)点").matcher(var14.getValue())).find() ? Integer.parseInt(var18.group(2 ^ 3)) : 0;
                  var19 = var1 != (4 ^ 5) && var1 != 5 >> 1 ? (var1 == --3 ? 127 & 6 : (var1 == --4 ? --5 : 3)) : 8;
                  if (var8 >= var19) {
                     this.aej.fw("瓶子灵气已满");
                     return;
                  }

                  if (GoodType.w(var14.getQuality()) != GoodType.w(var3.getQuality())) {
                     this.aej.fw("绑定和不绑定不能混合");
                     return;
                  }
               } else if (var1 != 0) {
                  this.aej.fw("阶数不相同");
                  return;
               }
            } else {
               int var10;
               String var11;
               if (this.rf.equals("我要升级仙器")) {
                  if ((var11 = var14.getValue()) == null || var11.equals("")) {
                     this.aej.fw("这是空瓶子");
                     return;
                  }

                  var1 = MsgUntil.getGoodLvl(var11);
                  var8 = (var18 = Pattern.compile("灵气=(.*?)点").matcher(var14.getValue())).find() ? Integer.parseInt(var18.group(3 & 5)) : 0;
                  var19 = var1 != 3 >> 1 && var1 != 5 >> 1 ? (var1 == --3 ? 111 & 22 : (var1 == --4 ? --5 : 3)) : 8;
                  if (var8 != var19) {
                     this.aej.fw("瓶子灵气未满");
                     return;
                  }

                  var10 = MsgUntil.getGoodLvl(var3.getValue());
                  if (var1 + --5 != var10) {
                     this.aej.fw(MsgUntil.b(var1) + "阶仙器使用" + (var1 + --5) + "级矿石升级");
                     return;
                  }

                  if (var1 >= (47 & 86)) {
                     this.aej.fw("不支持六阶仙器升级!");
                     return;
                  }
               } else if (!this.rf.equals("我要洗炼仙器")) {
                  if (this.rf.equals("我要打造普通装备")) {
                     if (this.jp(var14, var3)) {
                        return;
                     }
                  } else if (this.rf.equals("打造11-16级装备")) {
                     if (this.fp(var14, var3)) {
                        return;
                     }
                  } else if (this.rf.equals("我要升级神兵")) {
                     var2 = MsgUntil.getGoodLvl(var14.getValue());
                     var1 = MsgUntil.getGoodLvl(var3.getValue());
                     if (var2 < 3 >> 1 || var2 > --5) {
                        this.aej.fw("不支持6级神兵升级!");
                        return;
                     }

                     if (var2 + --5 != var1) {
                        this.aej.fw(var2 + "级神兵使用" + (var2 + --5) + "级矿石升级");
                        return;
                     }
                  } else if (!this.rf.equals("我要合成炼妖石")) {
                     if (this.rf.equals("我要培养饰品")) {
                        if (GoodType.am(var3.getType())) {
                           if (this.uw().n(2, 31 & 107)) {
                              this.aej.fw("副配饰只允许使用配饰精华");
                              return;
                           }

                           if (MsgUntil.getGoodLvl(var3.getValue()) >= 2) {
                              this.aej.fw("副配饰已经达到2级以上");
                              return;
                           }
                        }

                        if (MsgUntil.getGoodLvl(var14.getValue()) > (103 & 30)) {
                           this.aej.fw("已达到最高配饰等级");
                           return;
                        }

                        if (var14.getValue().indexOf("培养=") == -1) {
                           this.aej.fw("该配饰无法培养");
                           return;
                        }
                     } else if (this.rf.equals("我要重铸饰品")) {
                        this.rf = "佩饰重铸";
                        var2 = MsgUntil.getGoodLvl(var14.getValue());
                        var1 = MsgUntil.getGoodLvl(var3.getValue());
                        if (var2 + 3 != var1) {
                           this.aej.fw(var2 + "级饰品使用" + (var2 + 3) + "级矿石重铸");
                           return;
                        }

                        if (Class241.d(var14.getValue(), GoodType.Extras[122 & 13], "|") != null) {
                           this.aej.f("配饰已有点粹属性无法重铸");
                           return;
                        }

                        if (Class241.d(var3.getValue(), GoodType.Extras[3], "|") != null) {
                           this.aej.f("配饰已有套装属性无法重铸");
                           return;
                        }
                     } else if (this.rf.equals("我要上神兵石")) {
                        if (var14.getValue().indexOf("神兵属性") != -1) {
                           this.aej.fw("该神兵已有神兵属性");
                           return;
                        }
                     } else if (this.rf.equals("我要培养护身符")) {
                        label276: {
                           var2 = (int)Class394.p(var14.getValue(), "品质=", "|");
                           var1 = 7026 & 26541;
                           if ((var6 = GoodType.getExtra(var14.getValue(), "炼化属性")) != null) {
                              String[] var7 = var6.split("&");

                              for(var10000 = var8 = 3 ^ 3; var10000 < var7.length; var10000 = var8) {
                                 String[] var9;
                                 if ((var9 = var7[var8].split("="))[2 & 5].equals("特技")) {
                                    for(var10000 = var10 = 3 >> 1; var10000 < var9.length; var10000 = var10) {
                                       if (var9[var10].equals("8031")) {
                                          var1 = 16332 & 17335;
                                          var10000 = var2;
                                          break label276;
                                       }

                                       ++var10;
                                    }
                                 }

                                 ++var8;
                              }
                           }

                           var10000 = var2;
                        }

                        if (var10000 > var1) {
                           this.aej.fw("该护身符品质大于" + var1 + "后无法培养");
                           return;
                        }
                     } else if (this.rf.equals("我要重铸护身符")) {
                        if ((int)Class394.p(var14.getValue(), "品质=", "|") < (10237 & 22830)) {
                           this.aej.fw("护身符品质高于300才能重铸");
                           return;
                        }

                        if ((var1 = MsgUntil.getGoodLvl(var3.getValue())) != (27 & 109) && var1 != (11 & 126)) {
                           this.aej.fw("护身符重铸使用9级矿石");
                           this.aej.fw("护身符升级使用10级矿石");
                           return;
                        }

                        byte var17 = 9;
                        if (var1 == (110 & 27) && MsgUntil.getGoodLvl(var14.getValue()) >= var17) {
                           this.aej.fw("护身符等级最高为" + var17 + "级");
                           return;
                        }
                     } else if (this.rf.equals("炼化仙器")) {
                        var11 = var3.getType() == 7005L ? GoodType.f(var3.getValue())[3 & 5] : GoodType.f(var3.getValue())[3 ^ 3];
                        if (!var11.equals("阶数=1")) {
                           this.aej.fw("使用一阶作为炼化材料太掉价了吗?");
                           return;
                        }
                     } else if (!this.rf.equals("培养彩晶石")) {
                        if (this.rf.equals("精炼神兵")) {
                           var2 = MsgUntil.getGoodLvl(var14.getValue());
                           var1 = MsgUntil.getGoodLvl(var3.getValue());
                           if (var2 < 3 >> 1 || var2 > 5) {
                              this.aej.fw("不支持6级神兵升级!");
                              return;
                           }

                           if (var2 <= 3) {
                              this.aej.fw("4级及以上的神兵才可以精练");
                              return;
                           }

                           if (var1 > 3) {
                              this.aej.fw("用3级以下的神兵精练");
                              return;
                           }
                        } else if (!this.rf.equals("宝石合成") && !this.rf.equals("宝石镶嵌")) {
                           this.rf.equals("宝石追加");
                        }
                     }
                  }
               }
            }

            ArrayList var12;
            SuitOperBean var13;
            if (!this.rf.equals("我要升级神兵") && !this.rf.equals("精炼神兵")) {
               if (!this.rf.equals("宝石合成") && !this.rf.equals("宝石镶嵌") && !this.rf.equals("宝石追加")) {
                  if (ParamTool.c(this.rc.longValue(), this.aej)) {
                     ArrayList var16;
                     (var16 = new ArrayList()).add(var14.getRgid());
                     var16.add(var3.getRgid());
                     var14.setUsetime(0);
                     var3.ab(1);
                     if (var14.getUsetime() <= 0) {
                        var5.h(var14.getRgid());
                        this.px[0].c(0, (Object)null);
                     }

                     if (var3.getUsetime() <= 0) {
                        var5.h(var3.getRgid());
                        this.px[1].c(0, (Object)null);
                     }

                     NpcComposeBean var15 = new NpcComposeBean();
                     var15.setComposetype(this.rf);
                     var15.setGoodstables(var16);
                     var6 = Agreement.getSendTextAES("npccompose", Class695.b().toJson(var15));
                     this.uw().d(var6);
                  }
               } else {
                  (var13 = new SuitOperBean()).setType(this.rf.equals("宝石合成") ? 121 & 127 : (this.rf.equals("宝石镶嵌") ? 122 & 127 : 123));
                  (var12 = new ArrayList()).add(var14.getRgid());
                  var12.add(var3.getRgid());
                  var13.setGoods(var12);
                  var6 = Agreement.getSendTextAES("suitoperate", Class695.b().toJson(var13));
                  this.uw().d(var6);
               }
            } else {
               var5.getLoginResult().setGold(var5.getLoginResult().getGold().subtract(this.rc));
               (var13 = new SuitOperBean()).setType(51 & 92);
               (var12 = new ArrayList()).add(var14.getRgid());
               var12.add(var3.getRgid());
               int var10004 = --1;
               int var10006 = 2 & 5;
               var13.setGoods(var12);
               var14.setUsetime(var10006);
               var3.ab(var10004);
               if (var14.getUsetime() <= 0) {
                  var5.h(var14.getRgid());
                  this.px[2 & 5].c(2 & 5, (Object)null);
               }

               if (var3.getUsetime() <= 0) {
                  var5.h(var3.getRgid());
                  this.px[5 >> 2].c(3 >> 2, (Object)null);
               }

               var6 = Agreement.getSendTextAES("suitoperate", Class695.b().toJson(var13));
               this.uw().d(var6);
            }
         }
      }
   }

   public void f(String var1) {
      if ((this.rf = var1).equals("我要炼器")) {
         this.ad[5 >> 3].setText("仙器");
         this.ad[3 >> 1].setText("材料");
         this.hy.setText("炼 器");
      } else if (var1.equals("我要培养饰品")) {
         this.ad[3 ^ 3].setText("主饰品");
         this.ad[3 >> 1].setText("副饰品");
         this.hy.setText("培 养");
      } else if (var1.equals("我要重铸饰品")) {
         this.ad[5 >> 3].setText("饰品");
         this.ad[2 ^ 3].setText("矿石");
         this.hy.setText("重 铸");
      } else if (var1.equals("宝石合成")) {
         this.ad[3 ^ 3].setText("宝石");
         this.ad[2 ^ 3].setText("宝石");
         this.hy.setText("合 成");
      } else if (!var1.equals("宝石镶嵌") && !var1.equals("宝石追加")) {
         if (!var1.equals("我要打造普通装备") && !var1.equals("打造11-16级装备")) {
            if (var1.equals("我要升级神兵")) {
               this.ad[2 & 5].setText("神兵");
               this.ad[--1].setText("矿石");
               this.hy.setText("打 造");
            } else if (var1.equals("我要上神兵石")) {
               this.ad[3 >> 2].setText("神兵");
               this.ad[--1].setText("神兵石");
               this.hy.setText("打 造");
            } else if (var1.equals("精炼神兵")) {
               this.ad[2 & 5].setText("主神兵");
               this.ad[3 >> 1].setText("副神兵");
               this.hy.setText("打 造");
            } else if (var1.equals("我要合成炼妖石")) {
               this.ad[3 >> 2].setText("炼妖石");
               this.ad[2 ^ 3].setText("炼妖石");
               this.hy.setText("打 造");
            } else if (var1.equals("我要合成仙器")) {
               this.ad[0].setText("八荒遗风");
               this.ad[1].setText("仙器");
               this.hy.setText("打 造");
            } else if (var1.equals("我要升级仙器")) {
               this.ad[0].setText("八荒遗风");
               this.ad[1].setText("矿石");
               this.hy.setText("打 造");
            } else if (var1.equals("我要洗炼仙器")) {
               this.ad[0].setText("仙器");
               this.ad[1].setText("悔梦石");
               this.hy.setText("打 造");
            } else if (var1.equals("我要培养护身符")) {
               this.ad[0].setText("护身符");
               this.ad[1].setText("护身符");
               this.hy.setText("打 造");
            } else if (var1.equals("我要重铸护身符")) {
               this.ad[0].setText("护身符");
               this.ad[1].setText("矿石");
               this.hy.setText("打 造");
            } else if (var1.equals("培养彩晶石")) {
               this.ad[0].setText("彩晶石");
               this.ad[1].setText("彩晶石");
               this.hy.setText("打 造");
            } else {
               this.ad[0].setText("物品");
               this.ad[1].setText("物品");
               this.hy.setText("打 造");
            }
         } else {
            this.ad[2 & 5].setText("装备");
            this.ad[5 >> 2].setText("矿石");
            this.hy.setText("打 造");
         }
      } else {
         this.ad[2 & 5].setText("装备");
         this.ad[5 >> 2].setText("宝石");
         this.hy.setText("镶 嵌");
      }

      int var2;
      for(int var10000 = var2 = 0; var10000 < this.px.length; var10000 = var2) {
         Class44 var3 = this.px[var2];
         ++var2;
         var3.c(0, (Object)null);
      }

      this.ve().a(this.ae());
   }

   public void d() {
      Class216[] var10001;
      Class108 var10002;
      if (this.re.aiz() != null) {
         var10001 = this.re.aiz().f();
         var10002 = this;
      } else {
         var10001 = null;
         var10002 = this;
      }

      Class216[] var1 = this.vg(var10001, var10002.vd().goodPacks.length / (62 & 89), this.re.t(), 3 & 4, 15334 & 17789, 23230 & 9695);
      this.re.aiw(var1, 3 ^ 3);
   }

   public boolean fp(Goodstable var1, Goodstable var2) {
      int var4 = MsgUntil.getGoodLvl(var1.getValue());
      int var5 = MsgUntil.getGoodLvl(var2.getValue());
      int var10000;
      int var6;
      if (this.uw().gameType == --2 && !this.uw().n(1 ^ 3, --3)) {
         if (var5 >= (23 & 110)) {
            var6 = --5 + var5;
            if (var4 < (15 & 123) && var6 == (127 & 11)) {
               return (boolean)(5 >> 3);
            } else if (var4 < (11 & 127) || var4 != var6 && var4 + (3 & 5) != var6) {
               this.aej.fw("需要使用对应等级的矿石来升级或者重铸");
               return (boolean)(--1);
            } else {
               return false;
            }
         } else if (var4 < (127 & 11)) {
            var10000 = --1;
            this.aej.fw("需要使用更高级的矿石");
            return (boolean)var10000;
         } else {
            return false;
         }
      } else if (var4 < (79 & 58)) {
         var10000 = 3 & 5;
         this.aej.fw("打造1-10级装备去长安城打铁铺找冯铁匠!");
         return (boolean)var10000;
      } else {
         boolean var3 = false;
         if (var4 >= (127 & 10) && var4 <= (61 & 79)) {
            if (var5 != (72 & 63) && var5 != (13 & 123)) {
               var10000 = 2 ^ 3;
               this.aej.fw("打造11-14级装备使用9级矿石!");
               this.aej.fw("重铸10-13级装备使用8级矿石!");
               return (boolean)var10000;
            }

            if (var5 == (27 & 109)) {
               var6 = 2 ^ 3;
            }
         } else if (var4 == (30 & 111)) {
            if (var5 != (79 & 57) && var5 != (62 & 75)) {
               var10000 = 3 & 5;
               this.aej.fw("打造15级装备使用10级矿石!");
               this.aej.fw("重铸14级装备使用9级矿石!");
               return (boolean)var10000;
            }

            if (var5 == (122 & 15)) {
               var6 = 3 >> 1;
            }
         } else if (var4 == (31 & 111)) {
            if (var5 != 10 && var5 != 11) {
               var10000 = 3 & 5;
               this.aej.fw("打造16级装备使用11级矿石!");
               this.aej.fw("重铸15级装备使用10级矿石!");
               return (boolean)var10000;
            }

            if (var5 == 11) {
               var6 = 5 >> 2;
            }
         } else {
            if (var4 != 16) {
               this.aej.fw("错误公式");
               return (boolean)(--1);
            }

            if (var5 != 11) {
               var10000 = 3 & 5;
               this.aej.fw("重铸16级装备使用11级矿石!");
               return (boolean)var10000;
            }
         }

         return false;
      }
   }
}
