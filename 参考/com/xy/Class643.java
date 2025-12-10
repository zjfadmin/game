package com.xy;

import com.xy.battle.BattleControl;
import com.xy.battle.TypeState;
import com.xy.bean.ConfirmBean;
import com.xy.entity.Mount;
import com.xy.entity.RoleSummoning;
import com.xy.formula.ActivityPetManualType;
import com.xy.formula.BaseMountSH;
import com.xy.formula.BaseMountSkill;
import com.xy.formula.PetProperty;
import com.xy.formula.PropertyUtil;
import com.xy.game.RoleData;
import com.xy.readbean.ActivityFC;
import com.xy.readbean.ActivitySeries;
import com.xy.readbean.Goodstable;
import com.xy.socket.Agreement;
import com.xy.socket.ParamTool;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.math.BigDecimal;
import java.util.List;

public class Class643 extends Class93 {
   private Object ni;
   private int m;

   public void af(MouseEvent var1) {
      if (this.m != --3 && this.m != --4 && this.m != --5) {
         if (this.m == (87 & 46)) {
            if (this.form instanceof Class264) {
               ((Class264)this.form).gi((Class581)this.ni);
               return;
            }
         } else {
            if (this.m == (71 & 63)) {
               if (this.getText().equals("X")) {
                  ((Class264)this.form).gi((Class581)null);
                  return;
               }

               ((Class264)this.form).y(Integer.parseInt(this.getText()));
               return;
            }

            if (this.m == (53 & 95)) {
               if (this.form.aej.getBattleScene() != null) {
                  return;
               }

               this.form.aej.setMouseIndex(Class320.g);
               return;
            }

            if (this.m == (119 & 30)) {
               if (this.form.aej.getBattleScene() != null) {
                  return;
               }

               if (this.form.aej.t()) {
                  return;
               }

               this.form.aej.setMouseIndex(Class320.m);
               return;
            }

            if ((this.m < (87 & 63) || this.m > (58 & 109)) && this.m != (53 & 126) && this.m != (63 & 117)) {
               if (this.m == 41) {
                  if (this.form.aej.t()) {
                     return;
                  }

                  this.form.ve().n(67);
                  this.form.ve().a(91);
                  return;
               }

               if (this.m == 42) {
                  Class658.cy(62, this.form.aej);
                  return;
               }

               if (this.m == 43) {
                  ((Class683)this.form).s();
                  return;
               }

               if (this.m == 45) {
                  ((Class683)this.form).y(this.m);
                  return;
               }

               if (this.m == 51) {
                  ((Class429)this.form).r((boolean)(5 >> 3));
                  return;
               }

               if (this.m == 61) {
                  if (this.form.ux().getBattleScene() != null) {
                     return;
                  }

                  ((Class199)this.form).d();
                  return;
               }

               if (this.m == 62) {
                  if (this.form.ux().getBattleScene() != null) {
                     return;
                  }

                  ((Class199)this.form).p();
                  return;
               }

               if (this.m == 63) {
                  if (this.form.ux().getBattleScene() != null) {
                     return;
                  }

                  Class658.cy(2, this.form.aej);
                  return;
               }

               if (this.m == 64) {
                  Class658.cy(20, this.form.aej);
                  return;
               }

               if (this.m == 65) {
                  if (this.form.ux().getBattleScene() != null) {
                     return;
                  }

                  if (this.form.aej.t()) {
                     return;
                  }

                  this.s();
                  return;
               }

               if (this.m == 71) {
                  ((Class621)this.form).s();
                  return;
               }

               if (this.m == 72) {
                  ((Class621)this.form).o();
                  return;
               }

               if (this.m == 73) {
                  ((Class621)this.form).p();
                  return;
               }

               if (this.m == 81 || this.m == 82 || this.m == 83 || this.m == 84) {
                  ((Class301)this.form).y(this.m);
                  return;
               }

               if (this.m >= 91 && this.m <= 97) {
                  ((Class466)this.form).y(this.m);
                  return;
               }

               if (this.m == 101 || this.m == 102) {
                  ((Class54)this.form).y(this.m);
                  return;
               }

               if (this.m == 105) {
                  ((Class110)this.form.ve().e(92)).y(601);
                  return;
               }

               if (this.m == 108) {
                  Class658.cy(96, this.form.aej);
                  return;
               }

               if (this.m == 109) {
                  if (this.form.aej.getBattleScene() != null) {
                     return;
                  }

                  this.form.aej.setMouseIndex(Class320.g);
                  return;
               }

               if (this.m == 110) {
                  if (this.form.aej.getBattleScene() != null) {
                     return;
                  }

                  if (this.form.aej.t()) {
                     return;
                  }

                  this.form.aej.setMouseIndex(Class320.m);
                  return;
               }

               if (this.m == 107 || this.m >= 111 && this.m <= 115) {
                  ((Class95)this.form).y(this.m);
                  return;
               }

               if (this.m == 116 || this.m == 117) {
                  ((Class545)this.form).y(this.m);
                  return;
               }

               if (this.m == 118) {
                  ((Class649)this.form).d();
                  return;
               }

               if (this.m >= 123 && this.m <= 130) {
                  ((Class135)this.form).y(this.m);
                  return;
               }

               if (this.m >= 131 && this.m <= 134) {
                  ((Class670)this.form).y(this.m);
                  return;
               }

               if (this.m >= 141 && this.m <= 143) {
                  ((Class680)this.form).y(this.m);
                  return;
               }

               if (this.m >= 151 && this.m <= 155) {
                  ((Class567)this.form).y(this.m);
                  return;
               }

               if (this.m >= 171 && this.m <= 173) {
                  ((Class364)this.form).y(this.m);
                  return;
               }

               if (this.m == 191) {
                  ((Class172)this.form.ve().e(174)).y(((Class195)this.form).e());
                  return;
               }

               if (this.m == 192) {
                  Class658.cy(175, this.form.aej);
                  return;
               }

               if (this.m == 193) {
                  this.d();
                  return;
               }

               if (this.m == 201) {
                  ((Class99)this.form).y(this.m);
                  return;
               }

               if (this.m >= 211 && this.m <= 213) {
                  ((Class172)this.form).as(this.m);
                  return;
               }

               if (this.m == 221) {
                  ((Class687)this.form).y(this.m);
                  return;
               }

               if (this.m >= 231 && this.m <= 232) {
                  ((Class118)this.form).c(this.m, this.ni);
                  return;
               }

               if (this.m == 241) {
                  Class658.cy(189, this.form.aej);
                  return;
               }

               if (this.m >= 241 && this.m <= 244) {
                  ((Class300)this.form).c(this.m, this.ni);
                  return;
               }

               if (this.m >= 251 && this.m <= 252) {
                  ((Class134)this.form).y(this.m);
               }
            } else {
               RoleSummoning var9;
               if (this.m == (61 & 95)) {
                  if ((var9 = this.form.vd().getChosePet()) == null) {
                     return;
                  }

                  if (this.form.ux().getBattleScene() == null) {
                     return;
                  }

                  Class514 var12;
                  if ((var12 = this.form.ux().getBattleControl().getHandleUnit()) != null && var12.bt().getType() == 0) {
                     List var14 = var12.bt().g("召唤兽");

                     int var15;
                     for(int var10000 = var15 = 3 ^ 3; var10000 < var14.size(); var10000 = var15) {
                        if (((TypeState)var14.get(var15)).getState() == 0 && var9.getSid().intValue() == Integer.parseInt(((TypeState)var14.get(var15)).getType())) {
                           BattleControl var17 = this.form.ux().getBattleControl();
                           var17.c(Class600.acq("召唤&" + ((TypeState)var14.get(var15)).getType(), var12, var17));
                           var12.i((boolean)(3 >> 1));
                           var17.m();
                           this.form.ux().getFormManagement().n(110 & 23);
                           this.form.ux().getFormManagement().n(19190 & 13769);
                           return;
                        }

                        ++var15;
                     }

                     this.form.aej.f("这只召唤兽无法召唤");
                     return;
                  }

                  return;
               }

               if (this.m == (105 & 55)) {
                  if ((var9 = this.form.vd().getChosePet()) == null) {
                     return;
                  }

                  ((Class207)this.form.ve().e(42 & 93)).aoo(PropertyUtil.getPetQl(var9, this.form.vd()), 4 ^ 5, var9.getSid());
                  return;
               }

               if (this.m == (126 & 35)) {
                  Class658.cy(83 & 62, this.form.aej);
                  return;
               }

               if (this.form.ux().getBattleScene() == null) {
                  if ((var9 = this.form.vd().getChosePet()) == null) {
                     return;
                  }

                  if (this.m == (119 & 31) || this.m == 24 || this.m == 25) {
                     ((Class45)this.form.ve().e(47)).gs(var9, this.m - 23);
                     return;
                  }

                  if (this.m == 26) {
                     this.v(var9);
                     return;
                  }

                  if (this.m == 27) {
                     if (this.form.aej.t()) {
                        return;
                     }

                     RoleData var11 = this.form.vd();
                     StringBuffer var13 = new StringBuffer();
                     StringBuffer var4 = new StringBuffer();
                     var13.append(var9.getSid().toString());
                     var4.append("#W确定要将召唤兽:#G" + var9.getSummoningname() + "#W放生吗?");
                     if (var11.getGameView().getClient().gamePetManual) {
                        int var5 = Integer.parseInt(var9.getSsn());
                        int var6 = Integer.parseInt(var9.getSummoningid());
                        ActivitySeries var7;
                        ActivityFC var16;
                        ActivityFC var8 = (var16 = (var7 = var11.getObjectArea().br()).getPetManualTypeFC(var5)) != null ? var7.getPetManualFC(var6) : null;
                        ActivityPetManualType var18;
                        if ((var18 = (ActivityPetManualType)(var8 != null && var16 != null ? var16.getData() : null)) != null && var18.getAddExp() > 0) {
                           var13.append("|P");
                           var13.append(var16.getId());
                           var13.append(",");
                           var13.append(var8.getId());
                           var4.append("#r#W放生会获得莲叶载书中对应召唤兽结缘经验:#G" + var18.getAddExp());
                        }
                     }

                     this.form.aej.aal(new ConfirmBean(11, var13.toString(), var4.toString()));
                     return;
                  }

                  if (this.m == 28) {
                     this.iq(var9);
                     return;
                  }

                  if (this.m == 30) {
                     this.ir(var9);
                     return;
                  }

                  if (this.m == 31) {
                     Class658.cy(67, this.form.aej);
                     return;
                  }

                  if (this.m == 32) {
                     Class658.cy(17, this.form.aej);
                     return;
                  }

                  if (this.m == 36) {
                     this.ip(var9);
                     return;
                  }

                  if (this.m == 37) {
                     ((Class466)this.form.ve().e(115)).v(var9);
                     return;
                  }

                  if (this.m == 38) {
                     if (this.form.uw().gamePetManual) {
                        Class658.cy(187, this.form.aej);
                        return;
                     }
                  } else {
                     if (this.m == 39) {
                        ((Class264)this.form).d();
                        return;
                     }

                     if (this.m == 40) {
                        String var10 = Agreement.getSendTextAES("pawnpet", "SHOW");
                        this.form.uw().d(var10);
                        return;
                     }

                     Class45 var2;
                     if (this.m == 52) {
                        var2 = (Class45)this.form;
                        String var3 = Agreement.getSendTextAES("userpet", "ND|" + var2.ez() + "|" + var2.ug());
                        this.form.uw().d(var3);
                        return;
                     }

                     if (this.m == 53) {
                        var2 = (Class45)this.form;
                        this.io(var9, var2.ug());
                        return;
                     }
                  }
               }
            }
         }

      } else {
         ((Class237)this.form).as(this.m);
      }
   }

   public void io(RoleSummoning var1, BigDecimal var2) {
      RoleData var5 = this.form.vd();
      if ((var1.getPetlock() >> (3 ^ 3) & 3 >> 1) == (3 & 5)) {
         this.form.aej.f("召唤兽" + var1.getSummoningname() + "已被加锁，不可吐出内丹！！");
      } else if (var5.getGoodPackSum(-1L, new BigDecimal(-4 >> 2), --1) <= 0) {
         this.form.aej.f("背包已满！！！");
      } else {
         String[] var4 = var1.getInnerGoods().split("\\|");
         String var3 = "";

         int var6;
         for(int var10000 = var6 = 3 ^ 3; var10000 < var4.length; var10000 = var6) {
            if (var2.compareTo(new BigDecimal(var4[var6])) == 0) {
               Goodstable var7;
               if ((var7 = var5.getGoodEquip(var2)) != null) {
                  var7.setStatus(3 & 4);
                  var5.i(var7);
                  ParamTool.g(var7, 3 & 4, this.form.uw());
               }
            } else {
               if (!var3.equals("")) {
                  var3 = var3 + "|";
               }

               var3 = var3 + var4[var6];
            }

            ++var6;
         }

         var1.setInnerGoods(var3);
         ParamTool.h(var1, this.form.uw());
         var5.getRoleProperty().m(var1);
      }
   }

   public int ae() {
      return this.m;
   }

   public void ip(RoleSummoning var1) {
      RoleData var10 = this.form.vd();
      Class264 var9;
      Class264 var10000 = var9 = (Class264)this.form;
      int var4 = var10000.mi(3 ^ 3);
      int var5 = var10000.mi(3 >> 1);
      int var6 = var10000.mi(1 ^ 3);
      int var7 = var10000.mi(--3);
      int var8 = var10000.mi(--4);
      int var3 = var1.getCanpoint();
      int[] var2 = PetProperty.getPetHMASp(var1, var10);
      if (var3 - var4 - var5 - var6 - var7 - var8 + var2[--5] + var2[127 & 6] + var2[39 & 95] + var2[27 & 108] + var2[47 & 89] >= 0 && (var4 > var2[--5] || var5 > var2[63 & 70] || var6 > var2[39 & 95] || var7 > var2[77 & 58] || var8 > var2[15 & 121])) {
         var1.setBone(var1.getBone() + var4 - var2[--5]);
         var1.setSpir(var1.getSpir() + var5 - var2[47 & 86]);
         var1.setPower(var1.getPower() + var6 - var2[63 & 71]);
         var1.setSpeed(var1.getSpeed() + var7 - var2[75 & 60]);
         var1.setCalm(var1.getCalm() + var8 - var2[57 & 79]);
         ParamTool.h(var1, this.form.uw());
         var9.w(var10.getRolePet(var1.getSid().longValue()));
      }

   }

   public void iq(RoleSummoning var1) {
      RoleData var4 = this.form.vd();

      int var3;
      for(int var10000 = var3 = 5 >> 3; var10000 < var4.goodPacks.length; var10000 = var3) {
         if (var1.getFaithful() >= (111 & 116)) {
            this.form.aej.fw("召唤兽 " + var1.getSummoningname() + "的忠诚度已满");
            return;
         }

         Goodstable var2;
         if ((var2 = var4.getGood(var4.goodPacks[var3])) != null && var2.getType() == 49L) {
            int var10002 = --1;
            var2.ab(--1);
            ParamTool.g(var2, var10002, this.form.uw());
            if (var2.getUsetime() <= 0) {
               var4.h(var2.getRgid());
            }

            var1.a(Integer.parseInt(var2.getValue()));
            this.form.aej.fw("召唤兽 " + var1.getSummoningname() + "增加了" + var2.getValue() + "点忠诚度");
            ParamTool.h(var1, this.form.uw());
            ((Class264)this.form).mg()[2 ^ 3].setText(var1.getFaithful().toString());
            return;
         }

         ++var3;
      }

      this.form.aej.fw("您没有足够宠物口粮了");
   }

   public void s() {
      RoleData var1;
      if ((var1 = this.form.vd()) != null) {
         Mount var2;
         if ((var2 = var1.getChoseMount()) != null) {
            if (var1.getLoginResult().getMount_id() == var2.getMountid()) {
               this.form.aej.fw("您的坐骑还被您骑着呢！");
            } else if (var2.getSid() == null && var2.getOthrersid() == null && var2.getSid3() == null) {
               this.form.aej.aal(new ConfirmBean(30 & 111, var2.getMid().toString(), "#W确定要将坐骑:#G" + var2.getMountname() + "#W放生吗?"));
            } else {
               this.form.aej.fw("您的坐骑管制着召唤兽呢！");
            }
         }
      }
   }

   public void gd(int var1, String var2) {
      this.m = var1;
      this.setText(var2);
   }

   public Class643(String var1, int var2, int var3, String var4, Class345 var5) {
      this(var1, var2, var3, (Font)null, (Color[])null, var4, var5);
   }

   public void ac(MouseEvent var1, boolean var2) {
      if (this.m != --1 && this.m != --2) {
         if (this.m != (127 & 103) && this.m != (104 & 127)) {
            if (this.m >= (126 & 121) && this.m <= (123 & 126)) {
               if (var2) {
                  ((Class135)this.form).dp(this.m - (124 & 123));
                  return;
               }
            } else if (this.m >= (20647 & 12281) && this.m <= (12791 & 20138)) {
               if (var2) {
                  ((Class329)this.form).y(this.m - (10941 & 21987));
                  return;
               }
            } else if (this.m >= (14077 & 18871) && this.m <= (3519 & 29433) && var2) {
               ((Class195)this.form).y(this.m - (20159 & 12789));
            }
         } else if (var2) {
            if (this.form.aej.t()) {
               return;
            }

            ((Class95)this.form).dp(this.m - (127 & 103));
            return;
         }
      } else if (var2) {
         ((Class237)this.form).y(this.m);
         return;
      }

   }

   public void ir(RoleSummoning var1) {
      RoleData var2 = this.form.vd();
      Class264 var5 = (Class264)this.form;
      String var3;
      BigDecimal var4;
      if ((var4 = var2.getLoginResult().getSummoning_id()) != null && var4.compareTo(var1.getSid()) == 0) {
         var5.mh()[11 & 125].setText("参战");
         var2.getLoginResult().setSummoning_id((BigDecimal)null);
         var3 = Agreement.getSendTextAES("rolechange", "P");
         this.form.uw().d(var3);
      } else {
         var5.mh()[13 & 123].setText("休息");
         var2.getLoginResult().setSummoning_id(var1.getSid());
         var3 = Agreement.getSendTextAES("rolechange", "P" + var1.getSid());
         this.form.uw().d(var3);
      }
   }

   public Object hr() {
      return this.ni;
   }

   public void ab(int var1) {
      this.m = var1;
   }

   public void d() {
      int var5 = 3 >> 2;
      int var2 = 3 >> 2;
      BaseMountSH var4 = this.form.vd().getMountSHByindex(3 ^ 3);

      int var3;
      for(int var10000 = var3 = 3 >> 2; var10000 < var4.getMounts().length; var10000 = var3) {
         BaseMountSkill var1;
         if ((var1 = var4.getMounts()[var3]).getB1() != 0 && var1.getB2() != 0 && var1.getB3() < (21480 & 12287)) {
            ++var5;
            var2 += (27647 & 6120) - var1.getB3();
         }

         ++var3;
      }

      if (var5 == 0) {
         this.form.aej.f("没有需要修复的守护石");
      } else {
         ((Class472)this.form.ve().e(59 & 95)).cf(var5, var2);
      }
   }

   public Class643(String var1, int var2, int var3, Class345 var4) {
      super(var1, var2, var4);
      this.m = var3;
      this.form = var4;
   }

   public void v(RoleSummoning var1) {
      String var2 = ((Class264)this.form).md().getText().trim();
      String var3 = var1.getSummoningname();
      if (!var2.equals("") && !var2.equals(var3)) {
         if (var2.length() > (43 & 93)) {
            this.form.aej.fw("名称不能过长");
         } else {
            var1.setSummoningname(var2);
            ParamTool.h(var1, this.form.uw());
            this.form.aej.fw("您的召唤兽 " + var3 + "成功改名为:" + var2);
         }
      } else {
         this.form.aej.fw("请输入召唤兽" + var1.getSummoningname() + "的新名字！");
      }
   }

   public Class643(String var1, int var2, int var3, Font var4, Color[] var5, String var6, Class345 var7) {
      super(var1, var2, var5, var7);
      this.m = var3;
      Class643 var10000;
      if (var4 != null) {
         this.setFont(var4);
         var10000 = this;
      } else {
         this.setFont(Class681.bm);
         var10000 = this;
      }

      var10000.setHorizontalAlignment(0);
      this.setText(var6);
   }

   public void bq(Object var1) {
      this.ni = var1;
   }
}
