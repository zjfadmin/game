package com.xy;

import com.xy.bean.NpcComposeBean;
import com.xy.formula.GoodType;
import com.xy.formula.MsgUntil;
import com.xy.game.RoleData;
import com.xy.readbean.Goodstable;
import com.xy.readbean.MoneyType;
import com.xy.socket.Agreement;
import com.xy.socket.ParamTool;
import com.xy.text.GameView;
import java.awt.Color;
import java.awt.Font;
import java.math.BigDecimal;
import java.util.ArrayList;
import javax.swing.JLabel;

public class Class583 extends Class345 {
   private int dp;
   private Class245 ga;
   private Class574[] awd;
   private Class585 awe;
   private BigDecimal cf;
   private JLabel[] iv;
   private Class556 yk;
   private Class436[] be;
   private Class529[] ib;
   private Class529[] le;
   private MoneyType yn;

   public void s() {
      if (!this.aej.t() && this.cf != null) {
         RoleData var5;
         if ((var5 = this.vd()).getLoginResult().getGold().longValue() < this.cf.longValue()) {
            this.aej.f("金钱不足");
         } else {
            int var2 = this.dp == 5 >> 2 ? --5 : (this.dp == --3 ? 3 >> 1 : 2);
            Goodstable[] var10000 = new Goodstable[var2];
            boolean var10002 = true;
            Goodstable[] var3 = var10000;

            int var4;
            int var13;
            for(var13 = var4 = 2 & 5; var13 < var2; var13 = var4) {
               Goodstable var1;
               if ((var1 = (Goodstable)this.awd[var4].u().hr()) != null) {
                  var1 = var5.getGood(var1.getRgid());
               }

               if (var1 == null) {
                  this.aej.f("请凑齐物品再来");
                  return;
               }

               if (var1.getGoodlock() == (3 & 5)) {
                  this.aej.f("该物品已被加锁");
                  return;
               }

               if (var1.getStatus() != 0) {
                  this.aej.f("该物品不在背包");
                  return;
               }

               if (GoodType.ai(var1.getType()) != -4 >> 2) {
                  if (GoodType.getExtra(var1.getValue(), GoodType.Extras[--3]) != null) {
                     this.aej.f("套装无法用于打造系列");
                     return;
                  }

                  if (GoodType.getExtra(var1.getValue(), GoodType.Extras[--4]) != null || var1.getQhv() != null && var1.getQhv() > 0) {
                     this.aej.f("已镶嵌宝石无法用于打造系列");
                     return;
                  }
               }

               var3[var4++] = var1;
            }

            String var11 = this.dp == 0 ? "我要洗练符石" : (this.dp == (3 & 5) ? "我要合成符石" : (this.dp == 5 >> 1 ? "分解符石" : (this.dp == --3 ? "强化符石" : null)));
            if (var11 != null) {
               Class583 var14;
               label144: {
                  int var7;
                  if (this.dp == 0) {
                     if (var3[3 >> 2].getType() != var3[2 ^ 3].getType()) {
                        this.aej.fw("重铸需要2个符石或者2个符石强化石");
                        return;
                     }

                     var7 = MsgUntil.getGoodLvl(var3[2 & 5].getValue());
                     var2 = MsgUntil.getGoodLvl(var3[3 >> 1].getValue());
                     int var6 = this.uw().gameType == --2 ? --2 : 3;
                     if (var7 <= var6) {
                        this.aej.fw("小于等于" + var6 + "级符石不能洗练");
                        return;
                     }

                     if (var7 - var6 != var2) {
                        this.aej.fw(var7 + "级符石用" + (var7 - var6) + "符石洗练");
                        return;
                     }

                     if (GoodType.getExtra(var3[2 & 5].getValue(), GoodType.Extras[5 >> 2]) != null) {
                        var14 = this;
                        this.aej.f("符石强化后无法重铸");
                        break label144;
                     }
                  } else {
                     if (this.dp == (4 ^ 5)) {
                        if ((var7 = MsgUntil.getGoodLvl(var3[3 ^ 3].getValue())) >= --5) {
                           this.aej.fw("不支持5级以上合成");
                           return;
                        }

                        for(var13 = var2 = 1; var13 < var3.length; var13 = var2) {
                           if (MsgUntil.getGoodLvl(var3[5 >> 3].getValue()) != var7) {
                              this.aej.fw("合成物品需要同等级");
                              return;
                           }

                           ++var2;
                        }

                        var14 = this;
                        break label144;
                     }

                     if (this.dp == --2) {
                        if (MsgUntil.getGoodLvl(var3[3 >> 2].getValue()) != --5) {
                           this.aej.fw("5级符石才能分解");
                           return;
                        }
                     } else {
                        if (this.dp != --3) {
                           return;
                        }

                        if (MsgUntil.getGoodLvl(var3[3 ^ 3].getValue()) != --5) {
                           this.aej.fw("5级符石才能强化");
                           return;
                        }

                        String var8;
                        if ((var8 = GoodType.getExtra(var3[2 & 5].getValue(), GoodType.Extras[4 ^ 5])) != null && Integer.parseInt(var8.split("&")[3 & 5]) >= (90 & 47)) {
                           this.aej.fw("最多只能强化10次");
                           return;
                        }
                     }
                  }

                  var14 = this;
               }

               if (ParamTool.c(var14.cf.longValue(), this.aej)) {
                  ArrayList var9 = new ArrayList();

                  for(var13 = var2 = 5 >> 3; var13 < var3.length; var13 = var2) {
                     ArrayList var15;
                     if (var2 == 0) {
                        var3[var2].setUsetime(0);
                        var15 = var9;
                     } else {
                        var3[var2].ab(1);
                        var15 = var9;
                     }

                     var15.add(var3[var2].getRgid());
                     if (var3[var2].getUsetime() <= 0) {
                        this.awd[var2].c(0, (Object)null);
                        var5.h(var3[var2].getRgid());
                     }

                     ++var2;
                  }

                  NpcComposeBean var10 = new NpcComposeBean();
                  var10.setComposetype(var11);
                  var10.setGoodstables(var9);
                  String var12 = Agreement.getSendTextAES("npccompose", Class695.b().toJson(var10));
                  this.uw().d(var12);
               }
            }
         }
      }
   }

   public void q() {
      int var10002 = 2 & 5;
      this.uu(this.awe, 13164 & 19959, 11641 & 21407);
      this.yk.cc();
      this.y(var10002);
      super.q();
   }

   public void d() {
      if (this.dp != 0 && this.dp != --2 && this.dp != --3) {
         if (this.dp == --1) {
            Goodstable var1;
            if ((var1 = (Goodstable)this.awd[3 ^ 3].u().hr()) == null) {
               this.cf = null;
               this.ga.setText((String)null);
               return;
            }

            int var2 = MsgUntil.getGoodLvl(var1.getValue());
            Class583 var10000;
            if (this.uw().n(5 >> 1, 94 & 45)) {
               this.cf = new BigDecimal(100000 * var2);
               var10000 = this;
            } else {
               this.cf = new BigDecimal(1000000 * var2);
               var10000 = this;
            }

            Class681.j(var10000.ga, this.cf.longValue());
         }

      } else if (this.awd[5 >> 3].u().tp() == --1) {
         this.cf = new BigDecimal(this.uw().n(5 >> 1, 108 & 31) ? 100000 : 1000000);
         Class681.j(this.ga, this.cf.longValue());
      } else {
         this.cf = null;
         this.ga.setText((String)null);
      }
   }

   public Class583(GameView var1) {
      int var10001 = --4;
      int var10005 = -4 >> 2;
      super(127 & 70, --2, Class345.aef, var1);
      this.va(var10005, 2 & 5, 29612 & 3547, 13821 & 19451, Class345.aeo);
      this.uv(Class511.q("sc/d/1.png", 86 & 109, 86 & 109, 86 & 109, 86 & 109, (boolean)(3 & 4)), "符石重铸");
      Class529[] var4 = new Class529[var10001];
      boolean var10003 = true;
      this.ib = var4;

      int var2;
      Class529[] var3;
      int var10000;
      Class529 var10002;
      int var10006;
      Font var10007;
      String var10009;
      Class583 var10010;
      for(var10000 = var2 = 3 & 4; var10000 < this.ib.length; var10000 = var2) {
         var3 = this.ib;
         var10002 = new Class529;
         var10005 = 1 ^ 3;
         var10006 = (123 & 127) + var2;
         var10007 = Class681.cf;
         Color[] var10008 = Class681.c;
         if (var2 == 0) {
            var10009 = "重铸";
            var10010 = this;
         } else if (var2 == (3 & 5)) {
            var10009 = "升级";
            var10010 = this;
         } else if (var2 == 5 >> 1) {
            var10009 = "分解";
            var10010 = this;
         } else if (var2 == --3) {
            var10009 = "强化";
            var10010 = this;
         } else {
            var10009 = "";
            var10010 = this;
         }

         var10002.<init>("sc/e/66.png", var10005, var10006, var10007, var10008, var10009, var10010);
         var3[var2] = var10002;
         this.ib[var2].setOffsetTexts(Class681.bv);
         this.ib[var2].setBounds((127 & 59) + (77 & 115) * var2, 115 & 30, 63 & 122, 119 & 41);
         this.add(this.ib[var2++]);
      }

      var4 = new Class529[--2];
      var10003 = true;
      this.le = var4;

      Class583 var5;
      for(var10000 = var2 = 2 & 5; var10000 < this.le.length; var10000 = var2) {
         var3 = this.le;
         var10002 = new Class529;
         var10005 = 3 & 5;
         var10006 = (17547 & 15351) + var2;
         var10007 = Class681.ak;
         if (var2 == 0) {
            var10009 = "升级";
            var10010 = this;
         } else if (var2 == (4 ^ 5)) {
            var10009 = "升级规则";
            var10010 = this;
         } else {
            var10009 = "";
            var10010 = this;
         }

         var10002.<init>("sc/e/7.png", var10005, var10006, var10007, (Color[])null, var10009, var10010);
         var3[var2] = var10002;
         if (var2 == 0) {
            var5 = this;
            this.le[var2].setForeground(Color.black);
         } else {
            if (var2 == 5 >> 2) {
               this.le[var2].setImage("sc/e/28.png");
               this.le[var2].setFont(Class681.bm);
               this.le[var2].setBounds(7123 & 25919, 24799 & 8171, 79 & 116, 19 & 126);
            }

            var5 = this;
         }

         var5.le[var2].setBounds(17719 & 15325, 241, 59, 25);
         this.add(this.le[var2++]);
      }

      JLabel[] var6 = new JLabel[--3];
      var10003 = true;
      this.iv = var6;

      for(var10000 = var2 = 5 >> 3; var10000 < this.iv.length; var10000 = var2) {
         this.iv[var2] = Class133.c(71, 235 + 20 * var2, 72, 19, 3 & 4, Class681.c("#cFFFFFF"), Class681.q);
         this.iv[var2].setText(var2 == 0 ? "消耗金钱" : (var2 == (4 ^ 5) ? "拥有金钱" : (var2 == (1 ^ 3) ? "5个除5级符石外任意同级符石可升级高一级的符石" : "")));
         if (var2 == --2) {
            this.iv[var2].setFont(Class681.ab);
            this.iv[var2].setBounds(53, 63, 300, 15);
            this.iv[var2].setForeground(Class681.c("#cFFFF00"));
         }

         this.add(this.iv[var2++]);
      }

      this.yn = new MoneyType();
      this.yn.setIdAndKey(--1, "金钱");
      this.ga = Class133.a(143, 235, 124, 19, 10, Color.white, Class681.q);
      this.yk = Class133.m(143, 255, 124, 19, 10, Color.white, Class681.q, this.yn, var1);
      this.ga.eq(Class511.q("sc/d/17.png", 6, 6, 6, 6, (boolean)(2 & 5)));
      this.yk.eq(Class511.q("sc/d/17.png", 6, 6, 6, 6, (boolean)(2 & 5)));
      this.add(this.ga);
      this.add(this.yk);
      Class574[] var8 = new Class574[6];
      var10003 = true;
      this.awd = var8;

      for(var10000 = var2 = 5 >> 3; var10000 < this.awd.length; var10000 = var2) {
         this.awd[var2] = new Class574(this);
         if (var2 < --5) {
            var5 = this;
            this.awd[var2].setBounds(60 + var2 * 57, 95, 59, 58);
         } else {
            var5 = this;
            this.awd[var2].setBounds(174, 167, 59, 58);
         }

         var5.add(this.awd[var2++]);
      }

      Class436[] var9 = new Class436[--3];
      var10003 = true;
      this.be = var9;

      for(var10000 = var2 = 5 >> 3; var10000 < this.be.length; var10000 = var2) {
         this.be[var2] = new Class436();
         this.add(this.be[var2]);
         if (var2 == 0) {
            this.be[var2].eq(Class511.q("sc/d/35.png", 80, 10, 80, 10, (boolean)(2 & 5)));
            this.be[var2].setBounds(47, 32, 310, 20);
         } else if (var2 == --1) {
            this.be[var2].eq(Class511.q("sc/d/49.png", --5, --5, --5, --5, (boolean)(3 >> 2)));
            this.be[var2].setBounds(47, 51, 310, 230);
         } else if (var2 == 5 >> 1) {
            this.be[var2].eq(Class511.q("sc/d/19.png", --5, --5, --5, --5, (boolean)(5 >> 3)));
            this.be[var2].setBounds(47, 281, 309, 207);
         }

         ++var2;
      }

      this.awe = new Class585(this, 6, --4, 51, 51, 0, 0, 48, 283);
      this.awe.hf(Class511.a("sc/d/18.png"));
      this.awe.gb(true);
      this.add(this.awe);
      if (this.uw().VALUE.indexOf(73) == -1) {
         this.ib[2].setVisible(false);
         this.ib[3].setVisible(false);
      }

   }

   public void y(int var1) {
      int var10000 = 5 >> 3;
      this.dp = var1;

      for(var1 = var10000; var10000 < this.ib.length; var10000 = var1) {
         this.ib[var1].setKeep((boolean)(var1 == this.dp ? 4 ^ 5 : 0));
         ++var1;
      }

      for(var10000 = var1 = 5 >> 3; var10000 < this.awd.length; var10000 = var1) {
         this.awd[var1].c(5 >> 3, (Object)null);
         this.awd[var1++].setVisible((boolean)(3 & 4));
      }

      if (this.dp == 0) {
         var1 = this.uw().gameType == (1 ^ 3) ? --2 : 3;
         this.iv[--2].setText("使用小于主符石" + var1 + "个等级的符石重铸");
         this.iv[5 >> 1].setVisible((boolean)(5 >> 2));
         this.le[3 & 4].setText("重铸");
         this.le[2 ^ 3].setText("重铸规则");
         this.awd[5 >> 3].setBounds(11694 & 21247, 95 & 127, 59 & 127, 63 & 122);
         this.awd[3 & 5].setBounds(10734 & 22207, 22711 & 10223, 59 & 127, 122 & 63);
         this.awd[3 & 4].setVisible((boolean)(4 ^ 5));
         this.awd[--1].setVisible((boolean)(--1));
      } else if (this.dp != 3 >> 1) {
         if (this.dp == 5 >> 1) {
            this.iv[1 ^ 3].setVisible(false);
            this.le[0].setText("分解");
            this.le[1].setText("分解规则");
            this.awd[0].setBounds(174, 95, 59, 58);
            this.awd[0].setVisible(true);
         } else {
            if (this.dp == --3) {
               this.iv[1 ^ 3].setVisible(false);
               this.le[0].setText("强化");
               this.le[1].setText("强化规则");
               this.awd[0].setBounds(174, 95, 59, 58);
               this.awd[1].setBounds(174, 167, 59, 58);
               this.awd[0].setVisible(true);
               this.awd[1].setVisible(true);
            }

         }
      } else {
         this.iv[--2].setText("5个除5级符石外任意同级符石可升级高一级的符石");
         this.iv[1 ^ 3].setVisible((boolean)(--1));
         this.le[5 >> 3].setText("升级");
         this.le[3 & 5].setText("升级规则");
         int var10003 = 3 >> 2;
         var10000 = 3 >> 2;
         this.awd[var10003].setBounds(124 & 63, 95 & 127, 63 & 123, 62 & 123);
         this.awd[--1].setBounds(127 & 117, 95 & 127, 123 & 63, 126 & 59);

         for(var1 = var10000; var10000 < this.awd.length; var10000 = var1) {
            this.awd[var1++].setVisible(true);
         }

      }
   }

   public void ax(Goodstable var1) {
      int var10000;
      long var2;
      int var4;
      int var5;
      Goodstable var6;
      if (this.dp == 0) {
         if ((var2 = var1.getType()) == 188L || var2 == 187L) {
            var4 = -1;

            for(var10000 = var5 = 3 >> 2; var10000 < 2; var10000 = var5) {
               if ((var6 = (Goodstable)this.awd[var5].u().hr()) != null && var6.getRgid().compareTo(var1.getRgid()) == 0) {
                  return;
               }

               if (var6 == null && var4 == -4 >> 2) {
                  var4 = var5;
               }

               ++var5;
            }

            if (var4 == -4 >> 2) {
               var4 = 3 & 4;
            }

            this.awd[var4].c(4 ^ 5, var1);
            this.d();
         }
      } else if (this.dp == (4 ^ 5)) {
         if (var1.getType() == 188L) {
            var4 = -1;

            for(var10000 = var5 = 5 >> 3; var10000 < 5; var10000 = var5) {
               if ((var6 = (Goodstable)this.awd[var5].u().hr()) != null && var6.getRgid().compareTo(var1.getRgid()) == 0) {
                  return;
               }

               if (var6 == null && var4 == -4 >> 2) {
                  var4 = var5;
               }

               ++var5;
            }

            if (var4 == -4 >> 2) {
               var4 = 3 ^ 3;
            }

            this.awd[var4].c(4 ^ 5, var1);
            this.d();
         }
      } else if (this.dp == 5 >> 1) {
         if (var1.getType() == 188L) {
            var4 = -1;

            for(var10000 = var5 = 3 ^ 3; var10000 < 1; var10000 = var5) {
               if ((var6 = (Goodstable)this.awd[var5].u().hr()) != null && var6.getRgid().compareTo(var1.getRgid()) == 0) {
                  return;
               }

               if (var6 == null && var4 == -4 >> 2) {
                  var4 = var5;
               }

               ++var5;
            }

            if (var4 == -4 >> 2) {
               var4 = 2 & 5;
            }

            this.awd[var4].c(3 & 5, var1);
            this.d();
         }
      } else {
         if (this.dp == --3) {
            if ((var2 = var1.getType()) != 188L && var2 != 187L) {
               return;
            }

            var4 = var2 == 188L ? 3 & 4 : 1;
            this.awd[var4].c(3 & 5, var1);
            this.d();
         }

      }
   }
}
