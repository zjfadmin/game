package com.xy;

import com.xy.bean.LoginResult;
import com.xy.bean.StallNeedBean;
import com.xy.bean.UseCardBean;
import com.xy.entity.Baby;
import com.xy.entity.Lingbao;
import com.xy.entity.PartJade;
import com.xy.entity.RoleSummoning;
import com.xy.formula.BaseSkillData;
import com.xy.formula.ExpUtil;
import com.xy.readbean.Buff;
import com.xy.readbean.Eshop;
import com.xy.readbean.Goodstable;
import com.xy.readbean.RoleTxBean;
import com.xy.readbean.Shop;
import com.xy.readbean.Skill;
import com.xy.readbean.StallBuyData;
import com.xy.readbean.Talent;
import com.xy.readbean.aCard;
import java.awt.Color;
import java.awt.Composite;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.ImageObserver;
import java.math.BigDecimal;
import java.util.List;
import javax.swing.JComponent;

public class Class44 extends JComponent implements MouseListener {
   protected int aqa;
   protected long aqs;
   private boolean aqt;
   public static Class116 aqu = new Class116(1 ^ 3, 1 ^ 3, 63 & 104, 63 & 104);
   public static Class116 aqv = new Class116(3, 3, 36, 36);
   private Class116 aqw;
   public static Class116 aqx = new Class116(86 & 47, 86 & 47, 35 & 126, 35 & 126);
   public static Class116 aqy = new Class116(--4, --4, 58 & 119, 58 & 119);
   protected boolean aqz;
   public static Class116 ara = new Class116(--3, --3, 115 & 62, 115 & 62);
   protected Image arb;
   protected Image arc;
   public static Class116 ard = new Class116(--4, --4, 127 & 35, 127 & 35);
   private String are;
   public static Class116 arf = new Class116(5 >> 1, 5 >> 1, 35 & 127, 35 & 127);
   public static Class116 arg = new Class116(1 ^ 3, 1 ^ 3, 47 & 122, 47 & 122);
   public static Class116 arh = new Class116(4, 3, 50, 50);
   private BigDecimal ari;
   public static Class116 arj = new Class116(--4, --4, 43, 43);
   public static Class116 ark = new Class116(5 >> 3, 5 >> 3, 108 & 59, 108 & 59);
   public static Class116 adw = new Class116(--4, --4, 105 & 62, 105 & 62);
   public static Class116 adx = new Class116(4, 4, 44, 44);
   private Class116 arl;
   private int xy;
   public static Class116 arm = new Class116(1 ^ 3, 1 ^ 3, 95 & 63, 95 & 63);
   private boolean arn;
   public static Class116 aro = new Class116(5 >> 1, 5 >> 1, 127 & 18, 127 & 18);
   protected Object arp;
   public static Class116 arq = new Class116(6, 6, 40, 40);
   public static Class116 arr = new Class116(--4, --4, 52, 52);
   protected Class345 ars;
   public static Class116 art = new Class116(--3, --3, 59 & 108, 59 & 108);
   public static Class116 aru = new Class116(--3, --3, 62 & 109, 62 & 109);
   public static Class116 arv = new Class116(--4, --4, 42, 42);
   protected Image arw;
   protected Class604 arx;
   public static Class116 ary = new Class116(3, 3, 39, 39);
   public static Class116 arz = new Class116(4, 4, 23, 23);
   public static Class116 la = new Class116(4, 4, 33, 33);
   private boolean ee;
   public static Class116 asa = new Class116(1 ^ 3, 1 ^ 3, 105 & 63, 105 & 63);
   public static Class116 asb = new Class116(1 ^ 3, 1 ^ 3, 55 & 122, 55 & 122);
   protected boolean bb;
   protected boolean op;

   public void c(int var1, Object var2) {
      int var10006 = 2 & 5;
      int var10008 = 5 >> 3;
      this.aqa = var1;
      this.arp = var2;
      this.aqs = 0L;
      this.bb = (boolean)var10008;
      this.ee = (boolean)var10006;
      this.ari = null;
      this.are = null;
      if (var2 == null) {
         this.cc();
         if (this.aqt) {
            this.setVisible((boolean)(3 >> 2));
         }

      } else {
         int var4;
         Class44 var10000;
         int var10002;
         if (var1 != (4 ^ 5) && var1 != (58 & 87)) {
            if (var1 == --2) {
               Baby var5;
               Baby var10001 = var5 = (Baby)var2;
               var10000 = this;
               this.aqs = var5.getBabyid().longValue();
               this.ach(Class222.r(var10001.getChildSex()));
            } else if (var1 != --3 && var1 != --4) {
               if (var1 == --5) {
                  Lingbao var7;
                  Lingbao var21 = var7 = (Lingbao)var2;
                  var10000 = this;
                  this.aqs = var7.getBaoid().longValue();
                  this.ach(Class222.j(var21.getSkin()));
               } else {
                  label135: {
                     if (var1 == (78 & 55)) {
                        this.aqs = (long)(Integer)var2;
                        if (this.aqs == 1L) {
                           this.fx("sc/d/44.png");
                           var10000 = this;
                           break label135;
                        }

                        if (this.aqs == 2L) {
                           var10000 = this;
                           this.fx("sc/d/47.png");
                           break label135;
                        }
                     } else {
                        if (var1 == (31 & 103)) {
                           String var20;
                           var4 = (var20 = (String)var2).indexOf("=");
                           int var10003 = 3 & 4;
                           this.aqs = (long)Class394.b(var20, var4 + (2 ^ 3), var20.length());
                           this.arp = var20.substring(var10003, var4);
                           this.ach(Class222.a((String)this.arp));
                           var10000 = this;
                           break label135;
                        }

                        if (var1 == (10 & 125)) {
                           RoleTxBean var19 = (RoleTxBean)var2;
                           var10000 = this;
                           this.aqs = (long)var19.getGid();
                           this.ach(Class222.i("tx" + var19.getRdId()));
                           break label135;
                        }

                        if (var1 == (63 & 73)) {
                           String[] var18 = (String[])var2;
                           var10000 = this;
                           this.aqs = (long)Integer.parseInt(var18[2 ^ 3]);
                           var18[2 & 5] = null;
                           var18[4 ^ 5] = null;
                           this.fx("sc/skill/jx.png");
                           break label135;
                        }

                        if (var1 == (26 & 111)) {
                           UseCardBean var17 = (UseCardBean)var2;
                           var10000 = this;
                           this.ach(Class222.i(var17.getSkin()));
                           break label135;
                        }

                        if (var1 == (123 & 15)) {
                           aCard var16 = (aCard)var2;
                           var10000 = this;
                           this.fx(Class222.l(var16.getSkin()));
                           break label135;
                        }

                        if (var1 == (92 & 47)) {
                           BaseSkillData var15;
                           if ((var4 = Integer.parseInt((var15 = (BaseSkillData)var2).getSkill().getSkillid())) >= (28477 & 14291) && var4 <= (32734 & 10041)) {
                              var10000 = this;
                              this.ach(Class222.c(var15.getSkill().getSkillid()));
                           } else if (var4 > (28668 & 16099) && var4 <= (32749 & 13018)) {
                              var10000 = this;
                              this.ach(Class222.s(var4));
                           } else {
                              var10000 = this;
                              this.ach(Class222.g(var15.getSkill().getSkillid()));
                           }
                           break label135;
                        }

                        if (var1 == (47 & 93)) {
                           Shop var14 = (Shop)var2;
                           var10000 = this;
                           this.ach(Class222.i(var14.getShopskin()));
                           break label135;
                        }

                        if (var1 >= (111 & 117) && var1 <= (107 & 125)) {
                           this.aqa = 95 & 46;
                           this.aqs = (long)(var1 - 100);
                           PartJade var23 = (PartJade)var2;
                           StringBuilder var22 = new StringBuilder("tzyf");
                           var10000 = this;
                           this.ach(Class222.i(var22.append(this.aqs).toString()));
                           break label135;
                        }

                        if (var1 == 15) {
                           PartJade var13 = (PartJade)var2;
                           var10000 = this;
                           this.ach(Class222.i("tz" + var13.getSuitid() + "_" + var13.getPartId()));
                           break label135;
                        }

                        if (var1 == 16) {
                           this.aqs = (long)(Integer)var2;
                           var10000 = this;
                           this.ach(Class222.i(String.valueOf(this.aqs)));
                           break label135;
                        }

                        if (var1 == 17) {
                           var10000 = this;
                           this.fx("sc/b/B442.png");
                           break label135;
                        }

                        if (var1 == 19) {
                           Eshop var12 = (Eshop)var2;
                           var10000 = this;
                           this.ach(Class222.i(var12.getEshopskin()));
                           break label135;
                        }

                        if (var1 == 21) {
                           RoleSummoning var11 = (RoleSummoning)var2;
                           this.aqs = var11.getSid() != null ? var11.getSid().longValue() : 0L;
                           var10000 = this;
                           this.ach(Class222.t("p" + var11.getSummoningskin()));
                           break label135;
                        }

                        if (var1 != 22) {
                           if (var1 == 23) {
                              this.aqs = (long)(Integer)var2;
                              var10000 = this;
                              break label135;
                           }

                           if (var1 == 24) {
                              StallBuyData var10 = (StallBuyData)var2;
                              var10002 = --1;
                              var10000 = this;
                              this.aqs = (long)var10.getId();
                              this.ach(Class222.i(var10.getSkin()));
                              this.ee = (boolean)var10002;
                              break label135;
                           }

                           if (var1 == 25) {
                              StallNeedBean var8 = (StallNeedBean)var2;
                              this.aqs = (long)var8.getId();
                              StallBuyData var9;
                              this.ach(Class222.i((var9 = this.ars.vc().an(var8.getId())) != null ? var9.getSkin() : "0"));
                              this.ee = (boolean)(2 ^ 3);
                           }
                        }
                     }

                     var10000 = this;
                  }
               }
            } else {
               Talent var6 = (Talent)var2;
               var10000 = this;
               this.aqs = (long)var6.getId();
               this.ach(Class222.c(String.valueOf(var6.getId())));
            }
         } else {
            Goodstable var3 = (Goodstable)var2;
            this.aqs = var3.getRgid() != null ? var3.getRgid().longValue() : 0L;
            this.ari = var3.getRgid();
            if (this.xy == 0 && var3.getType() == 811L) {
               var4 = var3.getValue().indexOf("|");
               this.are = var3.getValue().substring(var4 + (4 ^ 5)) + "级";
            }

            var10000 = this;
            var10002 = 3 & 5;
            this.ach(Class222.i(var3.getSkin()));
            this.ee = (boolean)var10002;
         }

         var10000.setVisible(true);
      }
   }

   public boolean pd() {
      return (boolean)(this.aqa == 0 ? 4 ^ 5 : 0);
   }

   public int tp() {
      return this.aqa;
   }

   public void gh(long var1) {
      this.aqs = var1;
   }

   public void fw(String var1) {
      this.arb = Class511.a(var1);
   }

   public void gt(boolean var1) {
      this.aqt = var1;
   }

   public void mouseEntered(MouseEvent var1) {
      this.aqz = Boolean.TRUE;
      if (this.aqa == (110 & 27) && this.ars instanceof Class219) {
         ((Class219)this.ars).go();
      }

      if (this.aqa != 3 >> 1 && this.aqa != (55 & 90)) {
         if (this.aqa != --3 && this.aqa != --4) {
            if (this.aqa == (7 & 127)) {
               Lingbao var19 = this.ars.vd().getChoseBao();
               ((Class270)this.ars.ve().e(63 & 110)).sd((String)this.arp, (int)this.aqs, var19);
               return;
            }

            if (this.aqa == (110 & 25)) {
               RoleTxBean var18 = (RoleTxBean)this.arp;
               ((Class270)this.ars.ve().e(62 & 111)).rg(var18);
               return;
            }

            if (this.aqa == (77 & 59)) {
               Skill var17;
               if ((var17 = this.ars.vc().bf(String.valueOf(this.aqs))) == null) {
                  return;
               }

               String[] var9 = (String[])this.arp;
               long var3 = (new BigDecimal(var9[--3])).longValue();
               StringBuffer var5 = new StringBuffer();
               var5.append("#cFFFF00【技能等级】 ");
               var5.append(ExpUtil.d(var3));
               var5.append("#r【类型】 通用#r#G");
               var5.append(Class270.ry(var17.getRemark(), var17, var9[5 >> 1], String.valueOf(ExpUtil.d(var3))));
               ((Class270)this.ars.ve().e(63 & 110)).rl(var17.getSkillname(), var5.toString());
               return;
            }

            if (this.aqa == (78 & 59)) {
               UseCardBean var16 = (UseCardBean)this.arp;
               if ((var16 = this.ars.vd().getLimit(var16.getType())) == null) {
                  return;
               }

               ((Class270)this.ars.ve().e(46 & 127)).sn(var16);
               return;
            }

            if (this.aqa == (15 & 124)) {
               BaseSkillData var15 = (BaseSkillData)this.arp;
               ((Class270)this.ars.ve().e(126 & 47)).sf(var15.getSkill(), (double)var15.getSld(), Class224.d(this.ars.vd().getLoginResult().getGrade()), Class224.g(this.ars.vd().getLoginResult().getGrade()));
               return;
            }

            if (this.aqa == (15 & 125)) {
               Shop var14 = (Shop)this.arp;
               ((Class270)this.ars.ve().e(127 & 46)).rz(var14);
               return;
            }

            if (this.aqa == (126 & 15)) {
               Goodstable var7 = Class641.to((PartJade)this.arp, (int)this.aqs);
               ((Class270)this.ars.ve().e(46)).oj(var7, (boolean)(2 & 5));
               return;
            }

            if (this.aqa == 17) {
               Buff var13 = (Buff)this.arp;
               ((Class270)this.ars.ve().e(46)).rl(var13.getbName(), var13.getbText());
               return;
            }

            if (this.aqa == 19) {
               Eshop var12 = (Eshop)this.arp;
               ((Class270)this.ars.ve().e(46)).sq(var12);
               return;
            }

            RoleSummoning var8;
            if (this.aqa == 21) {
               if ((var8 = (RoleSummoning)this.arp).getSid() != null && (var8 = this.ars.vd().getPet(var8.getSid())) == null) {
                  var8 = (RoleSummoning)this.arp;
               }

               if (var8 == null) {
                  return;
               }

               ((Class106)this.ars.ve().e(42)).amj(var8, this.ars.vd().getLoginResult().getRolename(), (List)null, (boolean)(3 >> 2));
               return;
            }

            if (this.aqa == 22) {
               ((Class270)this.ars.ve().e(46)).f((String)this.arp);
               return;
            }

            if (this.aqa == 23) {
               if (this.aqs == 1L) {
                  LoginResult var10 = this.ars.vd().getLoginResult();
                  Class270 var2 = (Class270)this.ars.ve().e(46);
                  var2.f(var10.getRolename() + " " + Class224.r(var10.getGrade()) + "级");
                  return;
               }

               if (this.aqs == 2L) {
                  if ((var8 = this.ars.vd().getChosePet()) == null) {
                     return;
                  }

                  ((Class270)this.ars.ve().e(46)).f(var8.getSummoningname() + " 忠诚:" + var8.getFaithful());
                  return;
               }
            } else {
               StallBuyData var11;
               if (this.aqa == 24) {
                  var11 = (StallBuyData)this.arp;
                  ((Class270)this.ars.ve().e(46)).bh(var11);
                  return;
               }

               if (this.aqa == 25) {
                  var11 = this.ars.vc().an((int)this.aqs);
                  ((Class270)this.ars.ve().e(46)).bh(var11);
               }
            }
         } else if (this.ars instanceof Class237) {
            ((Class237)this.ars).fr(this);
            return;
         }

      } else {
         Goodstable var6 = (Goodstable)this.arp;
         if (this.aqa == (3 & 5) && var6.getRgid() != null) {
            var6 = this.ars.vd().getGood(var6.getRgid());
         }

         if (var6 != null) {
            ((Class270)this.ars.ve().e(126 & 47)).oj(var6, (boolean)(2 & 5));
         }
      }
   }

   public void ab(int var1) {
      this.xy = var1;
   }

   public void mouseExited(MouseEvent var1) {
      this.vu(Boolean.FALSE);
      this.aqz = Boolean.FALSE;
      if (this.aqa == --1 || this.aqa == --3 || this.aqa == --4 || this.aqa == (95 & 39) || this.aqa == (11 & 126) || this.aqa >= (108 & 31) && this.aqa <= (110 & 31) || this.aqa >= (27 & 117) && this.aqa <= (127 & 19) || this.aqa >= (118 & 31) && this.aqa <= (125 & 27)) {
         this.ars.ve().n(62 & 111);
      } else {
         if (this.aqa == (117 & 31)) {
            this.ars.ve().n(127 & 42);
         }

      }
   }

   public void af(MouseEvent var1) {
      if (this.ars != null) {
         if (this.ars instanceof Class219) {
            if (this.aqa == (31 & 119) && this.aqs == 1L) {
               if (var1.getButton() == (3 & 5)) {
                  this.ars.ve().a(3 ^ 3);
                  return;
               }
            } else if (this.aqa == (119 & 31) && this.aqs == 2L) {
               if (var1.getButton() == (2 ^ 3)) {
                  this.ars.ve().a(55 & 78);
                  return;
               }

               if (var1.getButton() == --3) {
                  int var10000 = 107 & 87;
                  this.ars.ve().a(95 & 38);
                  Class658.cy(var10000, this.ars.aej);
                  return;
               }
            }
         } else if (this.ars instanceof Class237) {
            if (this.aqa == 5 >> 2) {
               ((Class237)this.ars).th(this);
               return;
            }

            if (this.aqa == --2) {
               Baby var2 = this.ars.vd().getBaby(new BigDecimal(this.aqs));
               ((Class237)this.ars).ti(var2);
               return;
            }

            if (this.aqa == --4) {
               ((Class237)this.ars).tg(this);
               return;
            }
         } else {
            if (this.ars instanceof Class31) {
               ((Class31)this.ars).fr(this);
               return;
            }

            if (this.ars instanceof Class131) {
               ((Class131)this.ars).fr(this);
               return;
            }

            if (this.ars instanceof Class429) {
               if (this.aqa == 3 >> 1) {
                  this.c(3 >> 2, (Object)null);
                  return;
               }
            } else if (this.ars instanceof Class21) {
               if (this.aqa == (95 & 43)) {
                  ((Class21)this.ars).gu((aCard)this.arp);
                  return;
               }
            } else if (this.ars instanceof Class334) {
               if (this.aqa == (77 & 62)) {
                  this.ars.aej.choseImg.e((BaseSkillData)this.arp);
                  return;
               }
            } else if (this.ars instanceof Class638) {
               int var3;
               if (this.aqa == (76 & 63) && (var3 = Integer.parseInt(((BaseSkillData)this.arp).getSkill().getSkillid())) > (32502 & 12265) && var3 < (32471 & 12796)) {
                  this.ars.aej.choseImg.e((BaseSkillData)this.arp);
                  return;
               }
            } else if (this.ars instanceof Class108) {
               if (this.aqa == --1) {
                  this.c(3 & 4, (Object)null);
                  return;
               }
            } else if (this.ars instanceof Class250) {
               if (this.aqa == 5 >> 2) {
                  ((Class250)this.ars).fr(this);
                  return;
               }
            } else if (this.ars instanceof Class401) {
               if (this.aqa == 3 >> 1 || this.aqa == (78 & 63)) {
                  this.c(5 >> 3, (Object)null);
                  return;
               }
            } else if (this.ars instanceof Class14) {
               if (this.aqa == 3 >> 1) {
                  this.c(5 >> 3, (Object)null);
                  ((Class14)this.ars).p();
                  return;
               }
            } else if (this.ars instanceof Class568) {
               if (this.aqa == (3 & 5)) {
                  this.c(3 & 4, (Object)null);
                  ((Class568)this.ars).s();
                  return;
               }
            } else if (this.ars instanceof Class218) {
               if (this.aqa == (79 & 63)) {
                  ((Class218)this.ars).fr(this);
                  return;
               }
            } else if (this.ars instanceof Class583) {
               if (this.aqa == (2 ^ 3)) {
                  this.c(3 >> 2, (Object)null);
                  ((Class583)this.ars).d();
                  return;
               }
            } else if (this.ars instanceof Class185) {
               if (this.aqa == 3 >> 1) {
                  ((Class185)this.ars).fr(this);
                  return;
               }
            } else if (this.ars instanceof Class347) {
               if (this.aqa == --1) {
                  ((Class347)this.ars).fr(this);
                  return;
               }
            } else if (this.ars instanceof Class312) {
               if (this.aqa == --1) {
                  ((Class312)this.ars).fr(this);
                  return;
               }
            } else if (this.ars instanceof Class508) {
               if (this.aqa == 1) {
                  ((Class508)this.ars).fr(this);
                  return;
               }
            } else if (this.ars instanceof Class65) {
               if (this.aqa == 1) {
                  ((Class65)this.ars).ax((Goodstable)null);
                  return;
               }
            } else if (this.ars instanceof Class232) {
               if (this.aqa == 1) {
                  ((Class232)this.ars).ax((Goodstable)null);
                  return;
               }
            } else if (this.ars instanceof Class660) {
               if (this.aqa == 1) {
                  ((Class660)this.ars).ax((Goodstable)null);
                  return;
               }
            } else if (this.ars instanceof Class694) {
               if (this.aqa == (54 & 95)) {
                  ((Class694)this.ars).fr(this);
                  return;
               }
            } else {
               if (this.ars instanceof Class428) {
                  ((Class428)this.ars).th(this);
                  return;
               }

               if (this.ars instanceof Class522) {
                  ((Class522)this.ars).fr(this);
                  return;
               }

               if (this.ars instanceof Class687) {
                  ((Class687)this.ars).fr(this);
                  return;
               }

               if (this.ars instanceof Class300) {
                  if (this.xy == 1) {
                     ((Class300)this.ars).th(this);
                     return;
                  }

                  if (var1.getButton() == 1) {
                     if (this.aqa == 1) {
                        Goodstable var4 = (Goodstable)this.arp;
                        if ((var4 = this.ars.vd().getGood(var4.getRgid())) != null && var4.getType() == 812L) {
                           ((Class300)this.ars).ly(var4);
                           return;
                        }
                     }
                  } else {
                     ((Class300)this.ars).fr(this);
                  }
               }
            }
         }

      }
   }

   public boolean bl() {
      return this.bb;
   }

   public void bk(BigDecimal var1) {
      this.ari = var1;
   }

   public BigDecimal ez() {
      return this.ari;
   }

   public void mouseClicked(MouseEvent var1) {
   }

   public void mouseReleased(MouseEvent var1) {
      this.vu(Boolean.FALSE);
      if (this.aqz) {
         if (Class280.j()) {
            return;
         }

         this.af(var1);
      }

   }

   public void vu(Boolean var1) {
      if (this.op != var1) {
         this.op = var1;
      }
   }

   public int ae() {
      return this.xy;
   }

   public void ad(Class116 var1) {
      this.aqw = var1;
   }

   public void setVisible(boolean var1) {
      if (var1 != this.isVisible()) {
         this.show(var1);
      }

   }

   public void ach(Image var1) {
      this.arc = var1;
   }

   protected void paintComponent(Graphics var1) {
      Class44 var10000;
      if (this.arb != null) {
         var10000 = this;
         var1.drawImage(this.arb, 3 & 4, 3 & 4, this.getWidth(), this.getHeight(), (ImageObserver)null);
      } else {
         if (this.arx != null) {
            this.arx.g(var1, this.getWidth(), this.getHeight());
         }

         var10000 = this;
      }

      if (var10000.arc != null) {
         if (this.ari != null && this.ari != ((Goodstable)this.arp).getRgid()) {
            Goodstable var2;
            if ((var2 = this.ars.vd().getGood(this.ari)) == null) {
               this.ari = null;
            } else {
               this.ari = var2.getRgid();
               this.ach(Class222.i(((Goodstable)(this.arp = var2)).getSkin()));
            }
         }

         Composite var3 = null;
         Graphics2D var10001;
         Graphics2D var4;
         if (this.bb) {
            var4 = (Graphics2D)var1;
            var10001 = (Graphics2D)var1;
            var3 = var4.getComposite();
            var4.setComposite(Class8.j);
            var4.setColor(Color.BLACK);
         }

         if (this.op) {
            if (this.ee) {
               if (this.aqw != null) {
                  Class511.d(var1, this.arc, this.aqw.g() + (2 ^ 3), this.aqw.d() + --1, this.aqw.h() - --2, this.aqw.i() - --2);
                  var10000 = this;
               } else {
                  Class511.d(var1, this.arc, 4 ^ 5, 4 ^ 5, this.getWidth() - --2, this.getHeight() - (1 ^ 3));
                  var10000 = this;
               }
            } else if (this.aqw != null) {
               var1.drawImage(this.arc, this.aqw.g() + (4 ^ 5), this.aqw.d() + --1, this.aqw.h() - (5 >> 1), this.aqw.i() - (5 >> 1), (ImageObserver)null);
               var10000 = this;
            } else {
               var1.drawImage(this.arc, 4 ^ 5, 4 ^ 5, this.getWidth() - --2, this.getHeight() - (1 ^ 3), (ImageObserver)null);
               var10000 = this;
            }
         } else if (this.ee) {
            if (this.aqw != null) {
               Class511.d(var1, this.arc, this.aqw.g(), this.aqw.d(), this.aqw.h(), this.aqw.i());
               var10000 = this;
            } else {
               Class511.d(var1, this.arc, 5 >> 3, 5 >> 3, this.getWidth(), this.getHeight());
               var10000 = this;
            }
         } else if (this.aqw != null) {
            var1.drawImage(this.arc, this.aqw.g(), this.aqw.d(), this.aqw.h(), this.aqw.i(), (ImageObserver)null);
            var10000 = this;
         } else {
            var1.drawImage(this.arc, 3 & 4, 3 & 4, this.getWidth(), this.getHeight(), (ImageObserver)null);
            var10000 = this;
         }

         if (var10000.are != null) {
            var1.setFont(Class681.ce);
            var1.setColor(Color.white);
            var1.drawString(this.are, 1 ^ 3, this.getHeight() - --4);
         }

         if (var3 != null) {
            var4 = (Graphics2D)var1;
            var10001 = (Graphics2D)var1;
            var4.setComposite(var3);
         }
      }

      if (this.arn && this.arw != null) {
         if (this.arl != null) {
            var1.drawImage(this.arw, this.arl.g(), this.arl.d(), this.arl.h(), this.arl.i(), (ImageObserver)null);
            return;
         }

         var1.drawImage(this.arw, 5 >> 3, 5 >> 3, this.getWidth(), this.getHeight(), (ImageObserver)null);
      }

   }

   public void d() {
      this.arb = null;
   }

   public void r(boolean var1) {
      this.arn = var1;
   }

   public void hf(Image var1) {
      this.arb = var1;
   }

   public void gb(boolean var1) {
      this.bb = var1;
   }

   public Class44(Class345 var1) {
      int var10007 = 2 & 5;
      super();
      this.bb = (boolean)var10007;
      this.ars = var1;
      this.addMouseListener(this);
      this.aqt = !(var1 instanceof Class65) && !(var1 instanceof Class232) && !(var1 instanceof Class660) && !(var1 instanceof Class428);
   }

   public boolean t() {
      return this.arn;
   }

   public void ahu(Image var1, Class116 var2) {
      this.arw = var1;
      this.arl = var2;
   }

   public void eq(Class604 var1) {
      this.arx = var1;
   }

   public void cc() {
      this.arc = null;
   }

   public void fx(String var1) {
      this.arc = Class511.a(var1);
   }

   public Object hr() {
      return this.arp;
   }

   public void ak(boolean var1) {
      this.ee = var1;
   }

   public void q() {
      int var10006 = 3 ^ 3;
      int var10008 = 5 >> 3;
      this.aqa = 3 >> 2;
      this.arp = null;
      this.aqs = 0L;
      this.bb = (boolean)var10008;
      this.ee = (boolean)var10006;
      this.ari = null;
      this.are = null;
      this.cc();
   }

   public long gl() {
      return this.aqs;
   }

   public void mousePressed(MouseEvent var1) {
      this.vu(Boolean.TRUE);
   }
}
