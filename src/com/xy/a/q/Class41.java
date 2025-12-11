package com.xy.a.q;

import com.xy.bean.ConfirmBean;
import com.xy.bean.SuitOperBean;
import com.xy.entity.PartJade;
import com.xy.formula.GoodType;
import com.xy.formula.MsgUntil;
import com.xy.game.RoleData;
import com.xy.i.Class18;
import com.xy.i.Class19;
import com.xy.q.Class49;
import com.xy.readbean.Goodstable;
import com.xy.readbean.MoneyType;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import java.awt.Color;
import java.awt.Image;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.JLabel;

public class Class41 extends com.xy.q.Class30 {
   private JLabel[] yg;
   private com.xy.i.Class19[] yh;
   private int ia;
   private Class1 yi;
   private MoneyType yj;
   private com.xy.w.Class18[] bb;
   private com.xy.q.Class14 nk;
   private com.xy.q.Class52 ek;
   private com.xy.i.Class19 tb;
   private com.xy.q.Class54[] rh;
   private static Image gl = com.xy.w.Class16.c("sc/d/18.png");
   private com.xy.i.Class19 kc;
   private com.xy.q.Class13 ne;
   private BigDecimal hh;

   public void bo(Goodstable var1) {
      Goodstable var2 = (Goodstable)this.rh[0].jx();
      Goodstable var3 = (Goodstable)this.rh[1].jx();
      if (var2 != null) {
         var2 = this.yx().getGood(var2.getRgid());
      }

      if (var3 != null) {
         var3 = this.yx().getGood(var3.getRgid());
      }

      if (var1.getType() == 744L
         || (var2 == null || var1.getRgid().compareTo(var2.getRgid()) != 0) && (var3 == null || var1.getRgid().compareTo(var3.getRgid()) != 0)) {
         int var4 = var1.getType() != 744L ? MsgUntil.getGoodLvl(var1.getValue()) : 1;
         if (var4 <= 4 && var2 == null) {
            String var9 = "丫宑矣朌封9纷";
            this.afx.dp("主宝石最少5级");
         } else if (var3 == null && var2 == null) {
            this.rh[0].gs(1, var1);
            this.h();
         } else {
            int var5 = (var3 != null ? var3.getType() : var2.getType()) != 744L ? MsgUntil.getGoodLvl(var3 != null ? var3.getValue() : var2.getValue()) : 1;
            int var10000;
            if (var3 != null) {
               var4 -= 4;
               var10000 = var4;
            } else {
               var4 += 4;
               var10000 = var4;
            }

            if (var10000 != var5) {
               String var8 = "甑尉\r纡皽宛矊釋铁";
               this.afx.dp("用小4级的宝石重铸");
            } else {
               this.rh[var3 != null ? 0 : 1].gs(1, var1);
               this.h();
            }
         }
      } else {
         String var10001 = "诜宛矊巴袒透且";
         this.afx.dp("该宝石已被选中");
      }
   }

   public void br(Goodstable var1) {
      int var2 = var1.getType() == 744L ? 1 : MsgUntil.getGoodLvl(var1.getValue());
      Goodstable var3 = (Goodstable)this.rh[0].jx();
      Goodstable var4 = (Goodstable)this.rh[1].jx();
      if (var3 != null) {
         var3 = this.yx().getGood(var3.getRgid());
      }

      if (var4 != null) {
         var4 = this.yx().getGood(var4.getRgid());
      }

      if ((var3 == null || var1.getRgid().compareTo(var3.getRgid()) != 0) && (var4 == null || var1.getRgid().compareTo(var4.getRgid()) != 0)) {
         if (!GoodType.v(var1.getType()) && var1.getType() != 744L) {
            if (var1.getType() == 770L) {
               if (var4 != null) {
                  int var6 = var4.getType() != 744L ? MsgUntil.getGoodLvl(var4.getValue()) : 1;
                  if (var2 - 3 != var6 && (this.za().gameType != 2 || var2 != var6)) {
                     if (this.za().gameType == 2) {
                        String var10 = "杖斠宛矊佹甑毒奾弄矊尉\n纡迢衊晗逜鉍宜\u0015佹甑吊筰纡室矵迢衊髡哇贑鉲宣";
                        this.afx._do("材料宝石使用比奇异石小3级进行普通鉴定,使用同等级宝石进行高品质鉴定");
                        return;
                     }

                     String var9 = "杀斕宍矿佯甤毄奋弒矿尟?纷迗衜晢逊鉸宊";
                     this.afx._do("材料宝石使用比奇异石小3级进行普通鉴定");
                     return;
                  }
               }

               this.rh[0].gs(1, var1);
            }
         } else {
            if (var3 != null) {
               int var5 = MsgUntil.getGoodLvl(var3.getValue());
               if (var2 + 3 != var5 && (this.za().gameType != 2 || var2 != var5)) {
                  if (this.za().gameType == 2) {
                     String var8 = "室矵覸毒奾弄矊尉\n纡迢衊晗逜鉍宜\u0015佹甑吊筰纡室矵迢衊髡哇贑鉲宣";
                     this.afx._do("宝石要比奇异石小3级进行普通鉴定,使用同等级宝石进行高品质鉴定");
                     return;
                  }

                  String var7 = "宑矣覍毄奋弒矿尟?纷";
                  this.afx._do("宝石要比奇异石小3级");
                  return;
               }
            }

            this.rh[1].gs(1, var1);
         }
      } else {
         String var10001 = "诵宑矣巾袻逅丽";
         this.afx.dp("该宝石已被选中");
      }
   }

   public void ay(Goodstable var1) {
      int var2 = var1.getType() != 744L ? MsgUntil.getGoodLvl(var1.getValue()) : 1;
      if (var2 >= 10) {
         String var7 = "宍矿朐體筙纫!<纷";
         this.afx.dp("宝石最高等级10级");
      } else {
         Goodstable var3 = (Goodstable)this.rh[0].jx();
         Goodstable var4 = (Goodstable)this.rh[1].jx();
         if (var3 != null) {
            var3 = this.yx().getGood(var3.getRgid());
         }

         if (var4 != null) {
            var4 = this.yx().getGood(var4.getRgid());
         }

         if (var1.getType() == 744L
            || (var3 == null || var1.getRgid().compareTo(var3.getRgid()) != 0) && (var4 == null || var1.getRgid().compareTo(var4.getRgid()) != 0)) {
            if (var4 == null && var3 == null) {
               this.rh[0].gs(1, var1);
            } else {
               int var5 = (var3 != null ? var3.getType() : var4.getType()) != 744L ? MsgUntil.getGoodLvl(var3 != null ? var3.getValue() : var4.getValue()) : 1;
               if (var2 != var5) {
                  String var6 = "宍矿筙纫丝直吜";
                  this.afx.dp("宝石等级不相同");
               } else {
                  this.rh[var4 != null ? 0 : 1].gs(1, var1);
               }
            }
         } else {
            String var10001 = "诜宛矊巴袒透且";
            this.afx.dp("该宝石已被选中");
         }
      }
   }

   @Override
   public void l() {
      this.g(0);
      super.l();
   }

   public void f() {
      if (this.yi == null) {
         this.cr(true);
      } else {
         this.cr(!this.yi.isVisible());
      }
   }

   // $VF: synthetic method
   static Image gu() {
      return gl;
   }

   public void ak(com.xy.q.Class54 var1) {
      var1.gs(0, null);
      var1.setVisible(true);
      this.h();
   }

   public void g(int var1) {
      int var10000 = 0;
      this.ia = var1;

      for (int var2 = 0; var10000 < this.yh.length; var10000 = ++var2) {
         this.yh[var2].setKeep(var2 == this.ia);
      }

      var10000 = 0;
      this.cr(false);

      for (int var3 = 0; var10000 < this.rh.length; var10000 = var3) {
         this.rh[var3].gs(0, null);
         this.rh[var3++].setVisible(true);
      }

      this.tb.setVisible(false);
      this.yg[3].setVisible(false);
      this.yg[4].setVisible(false);
      this.nk.setVisible(false);
      this.ek.setVisible(false);
      if (this.ia == 0) {
         JLabel var5 = this.yg[0];
         String var6 = "吜筅纷宑矣Û\"";
         var5.setText("同等级宝石×2");
         JLabel var10015 = this.yg[1];
         String var10016 = "処玾莱微";
         var10015.setText("几率获得");
         this.yg[0].setBounds(147, 62, 100, 14);
         JLabel var19 = this.yg[0];
         String var10014 = "/s5)5)5)";
         var19.setForeground(com.xy.q.Class49.c("#c999999"));
         this.yg[1].setBounds(158, 140, 80, 14);
         JLabel var15 = this.yg[1];
         String var18 = "%Z@\u007fC\u0000>\b";
         var15.setForeground(com.xy.q.Class49.c("#cFFE981"));
         this.yg[2].setBounds(186, 100, 20, 20);
         String var12 = "各戀";
         this.kc.setText("合成");
         this.kc.setBounds(168, 274, 59, 25);
         this.rh[0].setBounds(128, 81, 59, 57);
         this.rh[1].setBounds(207, 81, 59, 57);
         this.rh[2].setBounds(168, 156, 59, 57);
         this.yg[3].setVisible(true);
         this.yg[4].setVisible(true);
         this.nk.setVisible(true);
         this.ek.setVisible(true);
         this.ek.l();
      } else if (this.ia == 1) {
         JLabel var16 = this.yg[0];
         String var10013 = "丂宛矊";
         var16.setText("主宝石");
         JLabel var14 = this.yg[1];
         String var17 = "杜斉宑矣";
         var14.setText("材料宝石");
         this.yg[0].setBounds(107, 85, 99, 14);
         JLabel var10 = this.yg[0];
         String var11 = "%Z?\u0000?\u0000?\u0000";
         var10.setForeground(com.xy.q.Class49.c("#c999999"));
         this.yg[1].setBounds(190, 85, 99, 14);
         JLabel var8 = this.yg[1];
         String var9 = "/s5)5)5)";
         var8.setForeground(com.xy.q.Class49.c("#c999999"));
         this.yg[2].setBounds(188, 121, 20, 20);
         this.rh[0].setBounds(127, 102, 59, 57);
         this.rh[1].setBounds(210, 102, 59, 57);
         this.rh[2].setBounds(170, 191, 59, 57);
         String var10003 = "釋铁";
         this.kc.setText("重铸");
         this.kc.setBounds(171, 264, 59, 25);
         String var7 = "co?i?9'\"`bw";
         this.tb.setBtn(-1, "sc/e/57.png");
         this.tb.setVisible(true);
      } else {
         if (this.ia == 2) {
            JLabel var10011 = this.yg[0];
            String var10012 = "奾弄矊";
            var10011.setText("奇异石");
            JLabel var10010 = this.yg[1];
            String var13 = "杜斉宑矣";
            var10010.setText("材料宝石");
            this.yg[0].setBounds(107, 85, 99, 14);
            JLabel var10008 = this.yg[0];
            String var10009 = "%Z?\u0000?\u0000?\u0000";
            var10008.setForeground(com.xy.q.Class49.c("#c999999"));
            this.yg[1].setBounds(190, 85, 99, 14);
            JLabel var10006 = this.yg[1];
            String var10007 = "/s5)5)5)";
            var10006.setForeground(com.xy.q.Class49.c("#c999999"));
            this.yg[2].setBounds(188, 121, 20, 20);
            this.rh[0].setBounds(127, 102, 59, 57);
            this.rh[1].setBounds(210, 102, 59, 57);
            this.rh[2].setBounds(170, 191, 59, 57);
            String var10002 = "鉲宣";
            this.kc.setText("鉴定");
            this.kc.setBounds(171, 264, 59, 25);
         }
      }
   }

   public void bb(Goodstable var1) {
      if (this.ia == 0) {
         if (GoodType.v(var1.getType()) || var1.getType() == 744L) {
            this.ay(var1);
         }
      } else if (this.ia == 1) {
         if (GoodType.v(var1.getType()) || var1.getType() == 744L) {
            this.bo(var1);
         }
      } else {
         if (this.ia == 2) {
            this.br(var1);
         }
      }
   }

   public Class41(GameView var1) {
      super(85, 2, com.xy.q.Class30.afz, var1);
      String var25;
      if (this.za().gameType == 2) {
         var25 = "3\t6\t6\t";
         var25 = "500000";
      } else {
         var25 = "%< < < ";
         var25 = "5000000";
      }

      BigDecimal var10000 = new BigDecimal(var25);
      this.hh = var10000;
      var25 = "uZ)])\b(Ih^";
      this.yy(-1, 0, 382, 445, com.xy.q.Class30.agh);
      com.xy.w.Class9 var28 = com.xy.w.Class16.m("sc/d/1.png", 68, 68, 68, 68, false);
      String var10004 = ",宍矿0";
      this.yu(var28, " 宝石 ");
      this.yh = new com.xy.i.Class19[3];

      int var2;
      for (int var6 = var2 = 0; var6 < this.yh.length; var6 = var2) {
         com.xy.i.Class19[] var7 = this.yh;
         var10004 = "Je\u0016c\u00165\u0000(Ih^";
         int var10006 = 151 + var2;
         String var37;
         Class41 var10010;
         if (var2 == 0) {
            var37 = "各戀";
            var37 = "合成";
            var10010 = this;
         } else if (var2 == 1) {
            var37 = "釋铁";
            var37 = "重铸";
            var10010 = this;
         } else if (var2 == 2) {
            var37 = "鉸宊";
            var37 = "鉴定";
            var10010 = this;
         } else {
            var37 = "";
            var10010 = this;
         }

         Class19 var10002 = new Class19("sc/e/39.png", 2, var10006, Class49.ck, null, var37, var10010);

         var7[var2] = var10002;
         this.yh[var2].setOffsetTexts(com.xy.q.Class49.bo);
         this.yh[var2].setBounds(52 + 65 * var2, 22, 63, 24);
         this.add(this.yh[var2++]);
      }

      String var10007 = "uZ)\\)\u000e(Ih^";
      String var10012 = "各戀";
      this.kc = new com.xy.i.Class19("sc/e/7.png", 1, 161, com.xy.q.Class49.ch, com.xy.q.Class49.bv, "合成", this);
      this.add(this.kc);
      String var40 = "Je\u0016c\u00164\u0001(Ih^";
      String var10014 = "釁這籷垛";
      this.tb = new com.xy.i.Class19("sc/e/28.png", 1, 162, com.xy.q.Class49.bz, null, "重选类型", this);
      this.tb.setBounds(165, 174, 68, 18);
      this.add(this.tb);
      this.yg = new JLabel[5];

      for (int var8 = var2 = 0; var8 < this.yg.length; var8 = var2) {
         this.yg[var2] = com.xy.q.Class1.f(157, 62, 80, 14, 0, Color.white, com.xy.q.Class49.n);
         Class41 var9;
         if (var2 == 2) {
            var9 = this;
            JLabel var29 = this.yg[var2];
            var10004 = "\u0012";
            var29.setText("+");
            this.yg[var2].setFont(com.xy.q.Class49.ab);
            JLabel var10001 = this.yg[var2];
            String var16 = "/sJVI)4!";
            var10001.setForeground(com.xy.q.Class49.c("#cFFE981"));
         } else if (var2 == 3) {
            var9 = this;
            JLabel var17 = this.yg[var2];
            var25 = "涎耮釗针";
            var17.setText("消耗金钱");
            this.yg[var2].setBounds(98, 227, 72, 19);
         } else {
            if (var2 == 4) {
               JLabel var13 = this.yg[var2];
               String var18 = "择朙針钡";
               var13.setText("拥有金钱");
               this.yg[var2].setBounds(98, 250, 72, 19);
            }

            var9 = this;
         }

         var9.add(this.yg[var2++]);
      }

      this.yj = new MoneyType();
      var10014 = "釗针";
      this.yj.setIdAndKey(1, "金钱");
      this.nk = com.xy.q.Class1.i(168, 227, 119, 19, 10, Color.white, com.xy.q.Class49.w);
      this.ek = com.xy.q.Class1.a(10, Color.white, com.xy.q.Class49.w, this.yj, var1);
      this.ek.setBounds(168, 250, 119, 19);
      this.ek.n(2);
      String var36 = "co?h?='\"`bw";
      this.nk.mt(com.xy.w.Class16.m("sc/d/17.png", 6, 6, 6, 6, false));
      String var10005 = "Je\u0016b\u00167\u000e(Ih^";
      this.ek.mt(com.xy.w.Class16.m("sc/d/17.png", 6, 6, 6, 6, false));
      this.add(this.nk);
      this.add(this.ek);
      com.xy.q.Class49.b(this.nk, this.hh.longValue());
      this.rh = new com.xy.q.Class54[3];

      for (int var10 = var2 = 0; var10 < this.rh.length; var10 = var2) {
         this.rh[var2] = new com.xy.q.Class54(this);
         this.rh[var2].wp(com.xy.q.Class54.auw);
         com.xy.q.Class54 var20 = this.rh[var2];
         var25 = "\u007fs#t#$\"`bw";
         var20.dq("sc/d/4.png");
         this.add(this.rh[var2++]);
      }

      this.bb = new com.xy.w.Class18[2];

      for (int var11 = var2 = 0; var11 < this.bb.length; var11 = var2) {
         this.bb[var2] = new com.xy.w.Class18();
         Class41 var12;
         if (var2 == 0) {
            var12 = this;
            com.xy.w.Class18 var22 = this.bb[var2];
            var25 = "Je\u0016b\u00167\u0000(Ih^";
            var22.mt(com.xy.w.Class16.m("sc/d/19.png", 5, 5, 5, 5, false));
            this.bb[var2].setBounds(47, 305, 309, 105);
         } else {
            if (var2 == 1) {
               com.xy.w.Class18 var14 = this.bb[var2];
               String var23 = "co?h?8)\"`bw";
               var14.mt(com.xy.w.Class16.m("sc/d/49.png", 5, 5, 5, 5, false));
               this.bb[var2].setBounds(46, 46, 310, 260);
            }

            var12 = this;
         }

         var12.add(this.bb[var2++]);
      }

      this.ne = new com.xy.q.Class13(this, 6, 2, 51, 51, 0, 0, 48, 307);
      var10004 = "Je\u0016b\u00167\u0001(Ih^";
      this.ne.gt(com.xy.w.Class16.c("sc/d/18.png"));
      this.ne.ol(746L, 749L, 752L, 755L, 758L, 761L, 764L, 767L, 770L, 744L);
      this.add(this.ne);
   }

   public void hy(boolean var1) {
      RoleData var2 = this.yx();
      SuitOperBean var3 = new SuitOperBean();
      var3.setGoods(new ArrayList<>());
      int var5 = this.ia == 0 ? 17 : (this.ia == 1 ? 18 : 19);
      RoleData var20;
      BigDecimal var4;
      if (var5 == 17 && this.za().gameType == 2) {
         String var39 = "3\t6\t6\t";
         var4 = new BigDecimal("500000");
         var20 = var2;
      } else {
         if (var5 == 19 && this.za().gameType == 2) {
            String var34 = "%< < < ";
            var4 = new BigDecimal("5000000");
            Goodstable var6 = (Goodstable)this.rh[0].jx();
            Goodstable var7 = (Goodstable)this.rh[1].jx();
            if (var6 != null) {
               var6 = this.yx().getGood(var6.getRgid());
            }

            if (var7 != null) {
               var7 = this.yx().getGood(var7.getRgid());
            }

            if (var6 == null || var7 == null) {
               String var27 = "诎凗齩牯哸冋杜";
               this.afx._do("请凑齐物品再来");
               return;
            }

            int var8 = MsgUntil.getGoodLvl(var6.getValue());
            int var9 = MsgUntil.getGoodLvl(var7.getValue());
            if (var8 == var9) {
               boolean var10000 = this.za().l(2, 12);
               BigDecimal var35 ;
               boolean var19;
               if (var10000) {
                  var35= new BigDecimal(100000L * var8 * var8 * var8);
                  var4 = var35;
                  var19 = var1;
               } else {
                  var35= new BigDecimal(10000000L * var8 * var8 * var8);
                  var4 = var35;
                  var19 = var1;
               }

               if (!var19) {
                  StringBuffer var10 = new StringBuffer();
                  var34 = "/G佬昿吪覑涄耇/B";
                  var10.append("#W你是否要消耗#R");
                  StringBuffer var21;
                  if (var4.longValue() >= 100000000L) {
                     var10.append(var4.longValue() / 100000000L);
                     var34 = "了";
                     var10.append("亿");
                     var21 = var10;
                  } else {
                     var10.append(var4.longValue() / 10000L);
                     var34 = "丗";
                     var10.append("万");
                     var21 = var10;
                  }

                  String var10001 = "%n夡诤帇迢衊髡哇贑鉲宣";
                  var21.append("#W大话币进行高品质鉴定");
                  this.afx.dm(new ConfirmBean(18, null, var10.toString()));
                  return;
               }
            }
         } else {
            String var10002 = "%< < < ";
            var4 = new BigDecimal("5000000");
         }

         var20 = var2;
      }

      if (var20.getLoginResult().getGold().compareTo(var4) < 0) {
         String var33 = "釗颤下越";
         this.afx._do("金额不足");
      } else {
         int var12;
         for (int var22 = var12 = 0; var22 < 2; var22 = var12) {
            Goodstable var15;
            if ((var15 = (Goodstable)this.rh[var12].jx()) != null) {
               var15 = var2.getGood(var15.getRgid());
            }

            if (var15 == null) {
               String var30 = "诧凝齀牥哑冁杵";
               this.afx._do("请凑齐物品再来");
               return;
            }

            if (var15.getGoodlock() == 1) {
               String var29 = "诜牯哸巴袒劦锸";
               this.afx._do("该物品已被加锁");
               return;
            }

            int var17 = 1;

            Iterator var18;
            for (Iterator var23 = var18 = var3.getGoods().iterator(); var23.hasNext(); var23 = var18) {
               if (((BigDecimal)var18.next()).compareTo(var15.getRgid()) == 0) {
                  var17++;
               }
            }

            if (var17 > var15.getUsetime()) {
               GameView var25 = this.afx;
               StringBuilder var28 = new StringBuilder(String.valueOf(var15.getGoodsname()));
               String var40 = "敼釟丁趣";
               var25.dp(var28.append("数量不足").toString());
               return;
            }

            List var24 = var3.getGoods();
            var12++;
            var24.add(var15.getRgid());
         }

         var3.setType(var5);
         if (var5 == 18) {
            if ((var12 = (int)this.rh[2].ee()) == 0) {
               var12 = 746;
            }

            var3.setJade(new PartJade(var12, 0));
         }

         if (var2.getGoodPackSum(-1L, new BigDecimal(-1), 1) <= 0) {
            String var32 = "胊匼穼闍下越";
            this.afx.dp("背包空间不足");
         } else {
            String var14 = Agreement.getSendTextAES("suitoperate", com.xy.v.Class31.a().toJson(var3));
            int var26 = 0;
            this.za().k(var14);
            this.cr(false);

            for (int var16 = 0; var26 < 2; var26 = var16) {
               this.rh[var16].gs(0, null);
               this.rh[var16++].setVisible(true);
            }
         }
      }
   }

   // $VF: synthetic method
   static void sv(Class41 var0, boolean var1) {
      var0.cr(var1);
   }

   // $VF: synthetic method
   static com.xy.q.Class54[] sw(Class41 var0) {
      return var0.rh;
   }

   // $VF: synthetic method
   private void cr(boolean var1) {
      if (this.yi != null || var1) {
         if (var1) {
            if (this.yi == null) {
               this.add(this.yi = new Class1(this), 0);
            }

            this.yi.setBounds(87, 134, 224, 122);
         }

         this.yi.setVisible(var1);
      }
   }

   public int dx() {
      return this.ia;
   }

   static {
      String var10000 = "co?h?=(\"`bw";
   }

   public void h() {
      if (this.ia == 1) {
         Goodstable var1 = (Goodstable)this.rh[0].jx();
         Goodstable var2 = (Goodstable)this.rh[1].jx();
         if (var1 != null) {
            var1 = this.yx().getGood(var1.getRgid());
         }

         if (var2 != null) {
            var2 = this.yx().getGood(var2.getRgid());
         }

         if (var1 == null || var2 == null) {
            String var3 = "Je\u0016c\u00163\u000e(Ih^";
            this.tb.setBtn(-1, "sc/e/57.png");
            if (this.rh[2].il() != 0) {
               this.rh[2].gs(0, null);
               this.rh[2].setVisible(true);
            }

            this.cr(false);
            return;
         }

         String var10003 = "co?i?>(\"`bw";
         this.tb.setBtn(1, "sc/e/28.png");
         if (this.rh[2].il() == 0) {
            this.rh[2].gs(16, var1.getType().intValue());
         }
      }
   }
}
