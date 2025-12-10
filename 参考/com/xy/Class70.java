package com.xy;

import com.xy.bean.LoginResult;
import com.xy.entity.RoleSummoning;
import com.xy.formula.BaseMeridians;
import com.xy.formula.PetProperty;
import com.xy.formula.RoleProperty;
import com.xy.formula.SkillUtil;
import com.xy.game.ExpIncreaseUntil;
import com.xy.game.RoleData;
import com.xy.socket.Agreement;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.math.BigDecimal;

public class Class70 extends Class93 {
   private Object ni;
   private int m;

   public void p() {
      LoginResult var1;
      if ((var1 = this.form.vd().getLoginResult()).getTurnAround() > --3) {
         int var2;
         if ((var2 = Class224.d(var1.getGrade())) >= (26846 & 6121)) {
            this.form.aej.f("已达到等级上限");
         } else {
            int var3;
            if ((var3 = Class224.b(var2, this.form.uw().v() ? 5 >> 1 : 1)) > var1.getXiuwei()) {
               this.form.aej.f("不够修为点升级");
            } else {
               ++var2;
               this.form.aej.f("升级成功");
               var1.setXiuwei(var1.getXiuwei() - var3);
               String var4 = Agreement.getSendTextAES("rolechange", "4");
               this.form.uw().d(var4);
               var4 = Agreement.getSendTextAES("rolelevelup", var1.getRolename() + "|" + var1.getGrade());
               this.form.uw().d(var4);
               ExpIncreaseUntil.c(this.form.aej);
               ((Class564)this.form).d();
            }
         }
      }
   }

   public Class70(String var1, int var2, int var3, String var4, Class345 var5) {
      this(var1, var2, var3, (Font)null, (Color[])null, var4, var5);
   }

   public int ae() {
      return this.m;
   }

   public int hq(int var1, int var2, int var3, int var4) {
      if (var1 > var2 + var4) {
         var4 = var1 - var2;
      }

      if (var3 - var4 < 0) {
         var4 = var3;
      }

      return var4;
   }

   public Object hr() {
      return this.ni;
   }

   public void ac(MouseEvent var1, boolean var2) {
      if (this.m != (127 & 51) && this.m != (119 & 60) && this.m != (125 & 55)) {
         if (this.m != (127 & 61) && this.m != (127 & 62) && this.m != (127 & 63) && this.m != (71 & 120)) {
            if (this.m != (121 & 87) && this.m != (83 & 126) && this.m != (127 & 83)) {
               if (this.m != (32255 & 853) && this.m != (27519 & 5590)) {
                  if (this.m >= 351 && this.m <= 355) {
                     if (var2) {
                        ((Class688)this.form).y(this.m - 351);
                        return;
                     }
                  } else if (this.m >= 391 && this.m <= 394 && var2) {
                     ((Class627)this.form).y(this.m - 391);
                  }
               } else if (var2) {
                  ((Class313)this.form).as(this.m - (24927 & 8180));
                  return;
               }
            } else if (var2) {
               ((Class371)this.form).y(this.m - (115 & 93));
               return;
            }
         } else if (var2) {
            ((Class131)this.form).as(this.m - (127 & 61));
            return;
         }
      } else if (var2) {
         ((Class259)this.form).y(this.m - (59 & 119));
         return;
      }

   }

   public void as(int var1) {
      RoleSummoning var4;
      if ((var4 = this.form.vd().getChosePet()) != null) {
         int var3 = (this.m - (20216 & 12751)) / --2;
         Class264 var2 = (Class264)this.form;
         if ((var1 = this.hq(this.hs(var3, var4), var2.mi(var3), var2.mi(--5), var1)) == 0) {
            this.form.ux().fw("已无法改变点数");
         } else {
            var2.cf(var3, var1);
         }
      }
   }

   public void s() {
      RoleData var1;
      LoginResult var2;
      if ((var2 = (var1 = this.form.vd()).getLoginResult()).getTurnAround() > --3) {
         int var3;
         if ((var3 = var2.getExtraPointInt("F") + (4 ^ 5)) > var2.getXiuwei()) {
            this.form.aej.f("修为点不够兑换");
         } else if (var3 >= (47 & 121)) {
            this.form.aej.f("属性点兑换达到上限");
         } else {
            this.form.aej.f("兑换了一点属性点");
            var2.setXiuwei(var2.getXiuwei() - var3);
            var2.setExtraPoint("F", 3 & 5);
            String var4 = Agreement.getSendTextAES("rolechange", "5");
            this.form.uw().d(var4);
            var1.getRoleProperty().k();
            ((Class564)this.form).d();
         }
      }
   }

   public void d() {
      LoginResult var1;
      if ((var1 = this.form.vd().getLoginResult()).getTurnAround() > --3) {
         long var2 = 1000000000L;
         long var4;
         if ((var4 = var1.getExperience().longValue()) < var2) {
            this.form.aej.f("当前经验不足10E");
         } else {
            long var6 = Math.min((long)(Class224.m(Class224.d(var1.getGrade()), this.form.uw().v() ? --2 : 1) - var1.getXiuwei()), var4 / var2);
            if ((var6 = Math.min(10L, var6)) <= 0L) {
               this.form.aej.f("修为点以达到上限,无法继续转换");
            } else {
               var4 -= var2 * var6;
               var1.setExperience(new BigDecimal(var4));
               var1.setXiuwei(var1.getXiuwei() + (int)var6);
               String var8 = Agreement.getSendTextAES("rolechange", "3" + var6);
               this.form.uw().d(var8);
               this.form.aej.f("修为值加" + var6);
               ((Class564)this.form).d();
               this.form.aej.baseView.kh();
            }
         }
      }
   }

   public void bq(Object var1) {
      this.ni = var1;
   }

   public void mouseExited(MouseEvent var1) {
      super.mouseExited(var1);
      if (this.m >= (110 & 117) && this.m <= (111 & 125) || this.m >= (10731 & 22236) && this.m <= (15315 & 17661)) {
         this.form.ve().n(127 & 46);
      }

   }

   public void y(int var1) {
      int var2 = (this.m - (100 & 127)) / (1 ^ 3);
      Class145 var3 = (Class145)this.form;
      if ((var1 = this.hq(this.hs(var2, (RoleSummoning)null), var3.mi(var2), var3.mi(--5), var1)) == 0) {
         this.form.ux().fw("已无法改变点数");
      } else {
         var3.cf(var2, var1);
      }
   }

   public void af(MouseEvent var1) {
      if (this.m == 5 >> 1) {
         if (this.form.aej.getClient().gameBeau) {
            Class658.cy(183, this.form.aej);
         }
      } else {
         String var2;
         if (this.m == --3) {
            var2 = Agreement.getSendTextAES("titlelist", (String)null);
            this.form.uw().d(var2);
         } else if (this.m == --4) {
            Class658.cy(10477 & 22422, this.form.aej);
         } else {
            LoginResult var4;
            RoleData var7;
            if (this.m == (94 & 39)) {
               RoleData var19 = var7 = this.form.vd();
               RoleProperty var14 = var19.getRoleProperty();
               var4 = var19.getLoginResult();
               Class145 var15;
               Class145 var18 = var15 = (Class145)this.form;
               int var10003 = --3;
               int var10005 = 1 ^ 3;
               int var10009 = --1;
               var4.setBone(var15.mi(3 ^ 3) - (int)var14.getValue("根骨"));
               var4.setSpir(var15.mi(var10009) - (int)var14.getValue("灵性"));
               var4.setPower(var15.mi(var10005) - (int)var14.getValue("力量"));
               var4.setSpeed(var18.mi(var10003) - (int)var14.getValue("敏捷"));
               if (var4.getTurnAround() >= --4) {
                  var4.setCalm(var15.mi(--4) - (int)var14.getValue("定力"));
               }

               String var6 = Agreement.getSendTextAES("rolechange", "D" + var4.getBone() + "=" + var4.getSpir() + "=" + var4.getPower() + "=" + var4.getSpeed() + "=" + var4.getCalm());
               this.form.uw().d(var6);
               var7.getRoleProperty().k();
            } else if (this.m == (87 & 47)) {
               Class658.cy(93 & 123, this.form.aej);
            } else if (this.m == (25 & 110)) {
               Class658.cy(127 & 43, this.form.aej);
            } else if (this.m == (77 & 59)) {
               if (this.form.ux().getBattleScene() != null) {
                  var2 = Agreement.getSendTextAES("fig8", (String)null);
                  this.form.uw().d(var2);
               } else {
                  ((Class207)this.form.ve().e(90 & 45)).aoo(this.form.vd().getRoleProperty().getQuality(), 3 ^ 3, (BigDecimal)null);
               }
            } else if (this.m == (46 & 91)) {
               Class658.cy(126 & 83, this.form.aej);
            } else if (this.m == (11 & 127)) {
               if (this.form.uw().gameMount) {
                  Class658.cy(12733 & 20206, this.form.aej);
               } else {
                  Class658.cy(7, this.form.aej);
               }
            } else if (this.m == (92 & 47)) {
               if (!this.form.aej.t()) {
                  Class658.cy(61, this.form.aej);
               }
            } else if (this.m == (62 & 119)) {
               ((Class259)this.form).d();
            } else if (this.m == (87 & 111)) {
               ((Class131)this.form).r((boolean)(4 ^ 5));
            } else if (this.m == (91 & 108)) {
               ((Class131)this.form).r((boolean)(3 & 4));
            } else if (this.m == 73) {
               ((Class131)this.form).d();
            } else if (this.m == 74) {
               ((Class131)this.form).y(2 & 5);
               ((Class131)this.form).y(3 & 5);
               ((Class131)this.form).y(1 ^ 3);
               ((Class131)this.form).y(--3);
            } else if (this.m == 13) {
               Class658.cy(81, this.form.aej);
            } else if (this.m == 14) {
               Class658.cy(190, this.form.aej);
            } else if (this.m == 91) {
               var2 = Agreement.getSendTextAES("rolechange", "X50");
               this.form.uw().d(var2);
            } else if (this.m != 92 && this.m != 93 && this.m != 94) {
               int var10001;
               if (this.m != 95 && this.m != 96) {
                  int var10;
                  if (this.m >= 100 && this.m <= 109) {
                     var10 = var1.isShiftDown() ? 40 : 1;
                     this.y(var10 * (this.m % --2 == 0 ? -4 >> 2 : 1));
                  } else if (this.m >= 200 && this.m <= 209) {
                     var10 = var1.isShiftDown() ? 40 : 1;
                     this.as(var10 * (this.m % (1 ^ 3) == 0 ? -4 >> 2 : 1));
                  } else {
                     String var11;
                     if (this.m == 301) {
                        if (this.form.uw().v() || this.form.uw().g()) {
                           if (this.form.vd().bo()) {
                              ((Class472)this.form.ve().e(27)).p();
                              return;
                           }

                           var11 = Agreement.getSendTextAES("rolechange", "AA1");
                           this.form.uw().d(var11);
                           return;
                        }
                     } else {
                        if (this.m == 302) {
                           ((Class20)this.form).d();
                           return;
                        }

                        if (this.m == 303) {
                           Class658.cy(83, this.form.aej);
                           return;
                        }

                        if (this.m == 304) {
                           ((Class20)this.form).s();
                           return;
                        }

                        if (this.m == 305) {
                           ((Class20)this.form).as(-4 >> 2);
                           return;
                        }

                        if (this.m == 306) {
                           ((Class20)this.form).dg();
                           return;
                        }

                        if (this.m == 307 || this.m == 308) {
                           Class20 var9;
                           if ((var9 = (Class20)this.form).bl()) {
                              this.form.aej.f("你需要洗点后才能切换天演策");
                              return;
                           } else {
                              int var12;
                              Class20 var17;
                              if ((var12 = var9.e() + (this.m == 307 ? 3 >> 1 : -1)) < 0) {
                                 var17 = var9;
                                 var12 += 3;
                              } else {
                                 var12 %= --3;
                                 var17 = var9;
                              }

                              var17.dq(var12, (String[])null);
                              return;
                           }
                        }

                        if (this.m == 321) {
                           this.d();
                           return;
                        }

                        if (this.m == 322) {
                           this.p();
                           return;
                        }

                        if (this.m == 323) {
                           this.s();
                           return;
                        }

                        if (this.m == 331) {
                           ((Class85)this.form).p();
                           return;
                        }

                        if (this.m == 332) {
                           ((Class85)this.form).o();
                           return;
                        }

                        if (this.m == 333 || this.m == 334) {
                           Class473 var8 = (Class473)this.form;
                           var11 = Agreement.getSendTextAES("rolechange", "X" + (var8.e() == 0 ? "6" : "7") + (this.m == 334 ? "1" : ""));
                           this.form.uw().d(var11);
                           return;
                        }

                        if (this.m >= 343 && this.m <= 346) {
                           ((Class313)this.form).y(this.m);
                           return;
                        }

                        if (this.m == 347 || this.m == 348) {
                           Class313 var16 = (Class313)this.form;
                           Class70 var10002;
                           if (this.m == 348) {
                              var10001 = 4 ^ 5;
                              var10002 = this;
                           } else {
                              var10001 = 0;
                              var10002 = this;
                           }

                           var16.aoy((boolean)var10001, var10002.ni);
                           return;
                        }

                        if (this.m == 349) {
                           ((Class544)this.form).p();
                           return;
                        }

                        if (this.m == 361) {
                           ((Class688)this.form).p();
                           return;
                        }

                        if (this.m == 371 || this.m == 372) {
                           ((Class410)this.form).y(this.m);
                           return;
                        }

                        if (this.m == 373) {
                           ((Class682)this.form).y(this.m);
                           return;
                        }

                        if (this.m >= 381 && this.m <= 385) {
                           ((Class225)this.form).y(this.m);
                           return;
                        }

                        if (this.m >= 386 && this.m <= 387) {
                           ((Class451)this.form).y(this.m);
                           return;
                        }

                        if (this.m == 390) {
                           ((Class627)this.form).as(this.m);
                        }
                     }

                  }
               } else {
                  BaseMeridians var3;
                  if ((var3 = (var7 = this.form.vd()).getRoleProperty().getMeridians(5 >> 3)) != null) {
                     var4 = var7.getLoginResult();
                     int var5 = var3 != null && var3.getKey() != null ? Integer.parseInt(var3.getKey()) - --1 : -1;
                     var5 = SkillUtil.getFMIndex(SkillUtil.getSepciesIndex(var4.getSpecies_id()), var5);
                     short var10000;
                     if (this.m == 95) {
                        var10000 = 12000;
                        var10001 = var5;
                     } else {
                        var10000 = 12500;
                        var10001 = var5;
                     }

                     int var13 = var10000 + var10001;
                     if (this.form.vc().bf(String.valueOf(var13)) != null) {
                        ((Class473)this.form.ve().e(123)).apx(var3, this.m == 95 ? 2 & 5 : 1);
                     }
                  }
               }
            } else {
               var2 = Agreement.getSendTextAES("rolechange", "X5" + (this.m - 91));
               this.form.uw().d(var2);
            }
         }
      }
   }

   public void ab(int var1) {
      this.m = var1;
   }

   public void mouseEntered(MouseEvent var1) {
      super.mouseEntered(var1);
      if (this.m >= (119 & 108) && this.m <= (127 & 109) || this.m >= (27853 & 5114) && this.m <= (9717 & 23259)) {
         ((Class270)this.form.ve().e(126 & 47)).f("按Shift键加40点");
      }

   }

   public Class70(String var1, int var2, int var3, Class345 var4) {
      super(var1, var2, var4);
      this.m = var3;
      this.form = var4;
   }

   public int hs(int var1, RoleSummoning var2) {
      if (var2 == null) {
         RoleProperty var3 = this.form.vd().getRoleProperty();
         if (var1 == 0) {
            return var3.getBone();
         } else if (var1 == 5 >> 2) {
            return var3.getSpir();
         } else if (var1 == (1 ^ 3)) {
            return var3.getPower();
         } else {
            return var1 == --3 ? var3.getSpeed() : var3.getCalm();
         }
      } else {
         return PetProperty.getPetHMASp(var2, this.form.vd())[--5 + var1];
      }
   }

   public Class70(String var1, int var2, int var3, Font var4, Color[] var5, String var6, Class345 var7) {
      super(var1, var2, var5, var7);
      this.m = var3;
      Class70 var10000;
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
}
