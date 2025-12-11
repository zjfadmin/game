package com.xy.i;

import com.xy.a.Class117;
import com.xy.a.Class48;
import com.xy.a.w.Class25;
import com.xy.a.w.Class26;
import com.xy.a.w.Class28;
import com.xy.bean.LoginResult;
import com.xy.entity.RoleSummoning;
import com.xy.formula.BaseMeridians;
import com.xy.formula.PetProperty;
import com.xy.formula.RoleProperty;
import com.xy.formula.SkillUtil;
import com.xy.game.ExpIncreaseUntil;
import com.xy.game.RoleData;
import com.xy.q.Class30;
import com.xy.q.Class49;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.math.BigDecimal;

public class Class20 extends Class1 {
   private Object pg;
   private int ah;

   public void e() {
      LoginResult var2;
      if ((var2 = this.form.yx().getLoginResult()).getTurnAround() > 3) {
         int var3;
         if ((var3 = com.xy.v.Class4.s(var2.getGrade())) >= 200) {
            String var8 = "左迃判笴纳乷附";
            this.form.afx._do("已达到等级上限");
         } else {
            int var4;
            if ((var4 = com.xy.v.Class4.l(var3)) > var2.getXiuwei()) {
               String var10001 = "丿奶俜乓炋匮纕";
               this.form.afx._do("不够修为点升级");
            } else {
               var3++;
               String var10008 = "区纳扭劋";
               this.form.afx._do("升级成功");
               var2.setXiuwei(var2.getXiuwei() - var4);
               String var10005 = "\u0006";
               String var5 = Agreement.getSendTextAES("rolechange", "4");
               this.form.za().k(var5);
               StringBuilder var10004 = new StringBuilder(String.valueOf(var2.getRolename()));
               var10005 = "h";
               var5 = Agreement.getSendTextAES("rolelevelup", var10004.append("|").append(var2.getGrade()).toString());
               this.form.za().k(var5);
               ExpIncreaseUntil.a(this.form.afx);
               ((com.xy.a.w.Class11)this.form).h();
            }
         }
      }
   }

   public Class20(String var1, int var2, int var3, Class30 var4) {
      super(var1, var2, var4);
      this.ah = var3;
      this.form = var4;
   }

   public void y(int var1) {
      this.ah = var1;
   }

   public void gw(Object var1) {
      this.pg = var1;
   }

   @Override
   public void cw(MouseEvent var1) {
      if (this.ah == 2) {
         if (this.form.afx.getClient().gameBeau) {
            Class0.ff(183, this.form.afx);
         }
      } else if (this.ah == 3) {
         String var16 = Agreement.getSendTextAES("titlelist", null);
         this.form.za().k(var16);
      } else if (this.ah == 4) {
         Class0.ff(132, this.form.afx);
      } else if (this.ah == 6) {
         RoleData var15;
         RoleData var30 = var15 = this.form.yx();
         RoleProperty var20 = var30.getRoleProperty();
         LoginResult var21 = var30.getLoginResult();
         com.xy.a.w.Class30 var23;
         com.xy.a.w.Class30 var39 = var23 = (com.xy.a.w.Class30)this.form;
         int var10011 = var23.ky(0);
         String var10013 = "桄骼";
         var21.setBone(var10011 - (int)var20.getValue("根骨"));
         int var10008 = var23.ky(1);
         String var10010 = "瀜怕";
         var21.setSpir(var10008 - (int)var20.getValue("灵性"));
         int var10005 = var23.ky(2);
         String var10007 = "勦釛";
         var21.setPower(var10005 - (int)var20.getValue("力量"));
         int var40 = var39.ky(3);
         String var10004 = "攦捅";
         var21.setSpeed(var40 - (int)var20.getValue("敏捷"));
         if (var21.getTurnAround() >= 4) {
            int var31 = var23.ky(4);
            String var46 = "寧劏";
            var21.setCalm(var31 - (int)var20.getValue("定力"));
         }

         String var47 = "v";
         StringBuilder var32 = new StringBuilder("D").append(var21.getBone());
         String var41 = ")";
         StringBuilder var33 = var32.append("=").append(var21.getSpir());
         String var42 = "\u000f";
         StringBuilder var34 = var33.append("=").append(var21.getPower());
         String var43 = ")";
         StringBuilder var35 = var34.append("=").append(var21.getSpeed());
         String var44 = "\u000f";
         String var6 = Agreement.getSendTextAES("rolechange", var35.append("=").append(var21.getCalm()).toString());
         this.form.za().k(var6);
         var15.getRoleProperty().e();
      } else if (this.ah == 7) {
         Class0.ff(89, this.form.afx);
      } else if (this.ah == 8) {
         Class0.ff(43, this.form.afx);
      } else if (this.ah == 9) {
         if (this.form.ze().getBattleScene() != null) {
            String var14 = Agreement.getSendTextAES("fig8", null);
            this.form.za().k(var14);
         } else {
            ((Class25)this.form.zc().j(8)).abn(this.form.yx().getRoleProperty().getQuality(), 0, null);
         }
      } else if (this.ah == 10) {
         Class0.ff(82, this.form.afx);
      } else if (this.ah == 11) {
         if (this.form.za().gameMount) {
            Class0.ff(172, this.form.afx);
         } else {
            Class0.ff(7, this.form.afx);
         }
      } else if (this.ah == 12) {
         if (!this.form.afx.ah()) {
            Class0.ff(61, this.form.afx);
         }
      } else if (this.ah == 54) {
         ((com.xy.a.w.Class17)this.form).e();
      } else if (this.ah == 71) {
         ((Class26)this.form).cr(true);
      } else if (this.ah == 72) {
         ((Class26)this.form).cr(false);
      } else if (this.ah == 73) {
         ((Class26)this.form).f();
      } else if (this.ah == 74) {
         ((Class26)this.form).g(0);
         ((Class26)this.form).g(1);
         ((Class26)this.form).g(2);
         ((Class26)this.form).g(3);
      } else if (this.ah == 13) {
         Class0.ff(81, this.form.afx);
      } else if (this.ah == 91) {
         String var29 = "LH$";
         String var13 = Agreement.getSendTextAES("rolechange", "X50");
         this.form.za().k(var13);
      } else if (this.ah == 92 || this.ah == 93 || this.ah == 94) {
         String var45 = "1\u0007";
         String var12 = Agreement.getSendTextAES("rolechange", "X5" + (this.ah - 91));
         this.form.za().k(var12);
      } else if (this.ah == 95 || this.ah == 96) {
         RoleData var11;
         BaseMeridians var19;
         if ((var19 = (var11 = this.form.yx()).getRoleProperty().getMeridians(0)) != null) {
            LoginResult var4 = var11.getLoginResult();
            int var5 = var19 != null && var19.getKey() != null ? Integer.parseInt(var19.getKey()) - 1 : -1;
            var5 = SkillUtil.getFMIndex(SkillUtil.getSepciesIndex(var4.getSpecies_id()), var5);
            short var25;
            int var28;
            if (this.ah == 95) {
               var25 = 12000;
               var28 = var5;
            } else {
               var25 = 12500;
               var28 = var5;
            }

            int var7 = var25 + var28;
            if (this.form.yt().ac(String.valueOf(var7)) != null) {
               ((com.xy.a.w.Class3)this.form.zc().j(123)).dw(var19, this.ah == 95 ? 0 : 1);
            }
         }
      } else if (this.ah >= 100 && this.ah <= 109) {
         int var10 = var1.isShiftDown() ? 40 : 1;
         this.g(var10 * (this.ah % 2 == 0 ? -1 : 1));
      } else if (this.ah >= 200 && this.ah <= 209) {
         int var9 = var1.isShiftDown() ? 40 : 1;
         this.n(var9 * (this.ah % 2 == 0 ? -1 : 1));
      } else if (this.ah == 302) {
         ((com.xy.a.w.Class20)this.form).e();
      } else if (this.ah == 303) {
         Class0.ff(83, this.form.afx);
      } else if (this.ah == 304) {
         ((com.xy.a.w.Class20)this.form).f();
      } else if (this.ah == 305) {
         ((com.xy.a.w.Class20)this.form).g(-1);
      } else if (this.ah == 306) {
         ((com.xy.a.w.Class20)this.form).c();
      } else if (this.ah == 307 || this.ah == 308) {
         com.xy.a.w.Class20 var8;
         if ((var8 = (com.xy.a.w.Class20)this.form).dh()) {
            String var27 = "佴靽覕浪炭味扙肀刓挟夽潩筂";
            this.form.afx._do("你需要洗点后才能切换天演策");
         } else {
            int var17;
            com.xy.a.w.Class20 var24;
            if ((var17 = var8.dx() + (this.ah == 307 ? 1 : -1)) < 0) {
               var24 = var8;
               var17 += 3;
            } else {
               var17 %= 3;
               var24 = var8;
            }

            var24.de(var17, null);
         }
      } else if (this.ah == 321) {
         this.h();
      } else if (this.ah == 322) {
         this.e();
      } else if (this.ah == 323) {
         this.f();
      } else if (this.ah == 331) {
         ((com.xy.a.w.Class18)this.form).c();
      } else if (this.ah == 332) {
         ((com.xy.a.w.Class18)this.form).h();
      } else if (this.ah == 333 || this.ah == 334) {
         com.xy.a.w.Class3 var2 = (com.xy.a.w.Class3)this.form;
         String var10003 = "j";
         StringBuilder var26 = new StringBuilder("X");
         String var37;
         if (var2.dx() == 0) {
            var37 = "\"";
            var37 = "6";
         } else {
            var37 = "\u0005";
            var37 = "7";
         }

         String var3 = Agreement.getSendTextAES("rolechange", var26.append(var37).append(this.ah == 334 ? "1" : "").toString());
         this.form.za().k(var3);
      } else if (this.ah >= 343 && this.ah <= 346) {
         ((com.xy.a.w.Class0)this.form).g(this.ah);
      } else if (this.ah == 347 || this.ah == 348) {
         com.xy.a.w.Class0 var10000 = (com.xy.a.w.Class0)this.form;
         boolean var10001;
         Class20 var10002;
         if (this.ah == 348) {
            var10001 = true;
            var10002 = this;
         } else {
            var10001 = false;
            var10002 = this;
         }

         var10000.x(var10001, var10002.pg);
      } else if (this.ah == 349) {
         ((Class28)this.form).h();
      } else if (this.ah == 361) {
         ((com.xy.a.w.Class19)this.form).e();
      } else if (this.ah == 371 || this.ah == 372) {
         ((com.xy.a.w.Class10)this.form).g(this.ah);
      } else if (this.ah == 373) {
         ((Class117)this.form).g(this.ah);
      } else if (this.ah >= 381 && this.ah <= 385) {
         ((com.xy.a.w.Class22)this.form).g(this.ah);
      } else if (this.ah >= 386 && this.ah <= 387) {
         ((com.xy.a.w.Class6)this.form).g(this.ah);
      } else {
         if (this.ah == 390) {
            ((com.xy.a.w.Class13)this.form).g(this.ah);
         }
      }
   }

   public Class20(String var1, int var2, int var3, String var4, Class30 var5) {
      this(var1, var2, var3, null, null, var4, var5);
   }

   public void g(int var1) {
      int var2 = (this.ah - 100) / 2;
      com.xy.a.w.Class30 var3 = (com.xy.a.w.Class30)this.form;
      if ((var1 = this.ala(this.alb(var2, null), var3.ky(var2), var3.ky(5), var1)) == 0) {
         GameView var10000 = this.form.ze();
         String var10001 = "左斝況敄双烄敤";
         var10000.dp("已无法改变点数");
      } else {
         var3.cc(var2, var1);
      }
   }

   public Object jx() {
      return this.pg;
   }

   @Override
   public void fe(MouseEvent var1, boolean var2) {
      if (this.ah != 51 && this.ah != 52 && this.ah != 53) {
         if (this.ah != 61 && this.ah != 62 && this.ah != 63 && this.ah != 64) {
            if (this.ah != 81 && this.ah != 82 && this.ah != 83) {
               if (this.ah != 341 && this.ah != 342) {
                  if (this.ah >= 351 && this.ah <= 355) {
                     if (var2) {
                        ((com.xy.a.w.Class19)this.form).g(this.ah - 351);
                        return;
                     }
                  } else if (this.ah >= 391 && this.ah <= 394 && var2) {
                     ((com.xy.a.w.Class13)this.form).y(this.ah - 391);
                  }
               } else if (var2) {
                  ((com.xy.a.w.Class0)this.form).y(this.ah - 340);
                  return;
               }
            } else if (var2) {
               ((com.xy.a.w.Class4)this.form).g(this.ah - 81);
               return;
            }
         } else if (var2) {
            ((Class26)this.form).y(this.ah - 61);
            return;
         }
      } else if (var2) {
         ((com.xy.a.w.Class17)this.form).g(this.ah - 51);
         return;
      }
   }

   @Override
   public void mouseExited(MouseEvent var1) {
      super.mouseExited(var1);
      if (this.ah >= 100 && this.ah <= 109 || this.ah >= 200 && this.ah <= 209) {
         this.form.zc().f(46);
      }
   }

   public int ala(int var1, int var2, int var3, int var4) {
      if (var1 > var2 + var4) {
         var4 = var1 - var2;
      }

      if (var3 - var4 < 0) {
         var4 = var3;
      }

      return var4;
   }

   public int alb(int var1, RoleSummoning var2) {
      if (var2 == null) {
         RoleProperty var3 = this.form.yx().getRoleProperty();
         if (var1 == 0) {
            return var3.getBone();
         } else if (var1 == 1) {
            return var3.getSpir();
         } else if (var1 == 2) {
            return var3.getPower();
         } else {
            return var1 == 3 ? var3.getSpeed() : var3.getCalm();
         }
      } else {
         return PetProperty.getPetHMASp(var2, this.form.yx())[5 + var1];
      }
   }

   public void f() {
      RoleData var1;
      LoginResult var2;
      if ((var2 = (var1 = this.form.yx()).getLoginResult()).getTurnAround() > 3) {
         String var10001 = "t";
         int var3;
         if ((var3 = var2.getExtraPointInt("F") + 1) > var2.getXiuwei()) {
            var10001 = "俺乇炭买夋儬捶";
            this.form.afx._do("修为点不够兑换");
         } else if (var3 >= 41) {
            var10001 = "屬恎炋儸捐迗刂乣院";
            this.form.afx._do("属性点兑换达到上限");
         } else {
            String var10005 = "儬捶任且烄届恚炭";
            this.form.afx._do("兑换了一点属性点");
            var2.setXiuwei(var2.getXiuwei() - var3);
            String var10004 = "t";
            var2.setExtraPoint("F", 1);
            String var10003 = "!";
            String var4 = Agreement.getSendTextAES("rolechange", "5");
            this.form.za().k(var4);
            var1.getRoleProperty().e();
            ((com.xy.a.w.Class11)this.form).h();
         }
      }
   }

   public Class20(String var1, int var2, int var3, Font var4, Color[] var5, String var6, Class30 var7) {
      super(var1, var2, var5, var7);
      this.ah = var3;
      Class20 var10000;
      if (var4 != null) {
         var10000 = this;
         this.setFont(var4);
      } else {
         var10000 = this;
         this.setFont(Class49.bz);
      }

      var10000.setHorizontalAlignment(0);
      this.setText(var6);
   }

   public void n(int var1) {
      RoleSummoning var2;
      if ((var2 = this.form.yx().getChosePet()) != null) {
         int var3 = (this.ah - 200) / 2;
         com.xy.a.a.Class16 var4 = (com.xy.a.a.Class16)this.form;
         if ((var1 = this.ala(this.alb(var3, var2), var4.ky(var3), var4.ky(5), var1)) == 0) {
            GameView var10000 = this.form.ze();
            String var10001 = "巀斉泧敐只烐敂";
            var10000.dp("已无法改变点数");
         } else {
            var4.cc(var3, var1);
         }
      }
   }

   @Override
   public void mouseEntered(MouseEvent var1) {
      super.mouseEntered(var1);
      if (this.ah >= 100 && this.ah <= 109 || this.ah >= 200 && this.ah <= 209) {
         Class48 var10000 = (Class48)this.form.zc().j(46);
         String var10001 = "挻:Z\u0000T\u001d锜勉\u0006Y炋";
         var10000.bq("按Shift键加40点");
      }
   }

   public void h() {
      LoginResult var2;
      if ((var2 = this.form.yx().getLoginResult()).getTurnAround() > 3) {
         long var3;
         if ((var3 = var2.getExperience().longValue()) < 1000000000L) {
            String var9 = "彇到绛髱丙跎%MQ";
            this.form.afx._do("当前经验不足10E");
         } else {
            int var5 = com.xy.v.Class4.m(com.xy.v.Class4.s(var2.getGrade()));
            if (var2.getXiuwei() >= var5) {
               String var8 = "俜乓炋二辌剙丸阹\u001e斉泧纎统輅捐";
               this.form.afx._do("修为点以达到上限,无法继续转换");
            } else {
               var3 -= 1000000000L;
               var2.setExperience(new BigDecimal(var3));
               var2.setXiuwei(var2.getXiuwei() + 1);
               String var10001 = "'";
               String var6 = Agreement.getSendTextAES("rolechange", "3");
               this.form.za().k(var6);
               String var10002 = "俜乓倎勉\u0003";
               this.form.afx._do("修为值加1");
               ((com.xy.a.w.Class11)this.form).h();
               this.form.afx.baseView.xf();
            }
         }
      }
   }

   public int il() {
      return this.ah;
   }
}
