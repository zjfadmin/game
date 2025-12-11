package com.xy.q;

import com.xy.a.Class74;
import com.xy.a.q.Class103;
import com.xy.a.q.Class105;
import com.xy.a.q.Class117;
import com.xy.a.q.Class64;
import com.xy.a.q.Class97;
import com.xy.a.q.Class98;
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
import java.math.BigDecimal;
import javax.swing.JComponent;

public class Class54 extends JComponent implements MouseListener {
   public static com.xy.v.Class32 atp = new com.xy.v.Class32(3, 3, 39, 39);
   public static com.xy.v.Class32 atq = new com.xy.v.Class32(2, 2, 40, 40);
   private com.xy.v.Class32 atr;
   public static com.xy.v.Class32 ats = new com.xy.v.Class32(4, 4, 35, 35);
   protected Image att;
   public static com.xy.v.Class32 atu = new com.xy.v.Class32(4, 4, 40, 40);
   public static com.xy.v.Class32 atv = new com.xy.v.Class32(6, 6, 40, 40);
   public static com.xy.v.Class32 atw = new com.xy.v.Class32(2, 2, 41, 41);
   private boolean atx;
   public static com.xy.v.Class32 aty = new com.xy.v.Class32(2, 2, 35, 35);
   protected long atz;
   private com.xy.v.Class32 aua;
   public static com.xy.v.Class32 aub = new com.xy.v.Class32(2, 2, 42, 42);
   public static com.xy.v.Class32 auc = new com.xy.v.Class32(4, 3, 50, 50);
   protected boolean aud;
   public static com.xy.v.Class32 aue = new com.xy.v.Class32(3, 3, 50, 50);
   public static com.xy.v.Class32 auf = new com.xy.v.Class32(4, 4, 44, 44);
   private boolean aug;
   protected boolean auh;
   protected Class30 aui;
   protected Object auj;
   public static com.xy.v.Class32 agb = new com.xy.v.Class32(4, 4, 52, 52);
   public static com.xy.v.Class32 auk = new com.xy.v.Class32(4, 4, 33, 33);
   public static com.xy.v.Class32 aul = new com.xy.v.Class32(2, 2, 18, 18);
   public static com.xy.v.Class32 aum = new com.xy.v.Class32(2, 2, 50, 50);
   public static com.xy.v.Class32 aun = new com.xy.v.Class32(0, 0, 40, 40);
   protected Image auo;
   public static com.xy.v.Class32 aup = new com.xy.v.Class32(3, 3, 44, 44);
   public static com.xy.v.Class32 auq = new com.xy.v.Class32(3, 3, 36, 36);
   public static com.xy.v.Class32 aur = new com.xy.v.Class32(6, 6, 34, 34);
   public static com.xy.v.Class32 aus = new com.xy.v.Class32(4, 4, 43, 43);
   protected boolean ak = false;
   public static com.xy.v.Class32 aut = new com.xy.v.Class32(2, 2, 31, 31);
   private BigDecimal nj;
   protected Image lp;
   public static com.xy.v.Class32 auu = new com.xy.v.Class32(4, 4, 42, 42);
   private boolean wb;
   public static com.xy.v.Class32 ask = new com.xy.v.Class32(3, 3, 40, 40);
   public static com.xy.v.Class32 auv = new com.xy.v.Class32(4, 4, 23, 23);
   protected com.xy.w.Class9 oh;
   protected int eg;
   public static com.xy.v.Class32 auw = new com.xy.v.Class32(4, 4, 50, 50);

   public Class54(Class30 var1) {
      this.aui = var1;
      this.addMouseListener(this);
      this.atx = !(var1 instanceof com.xy.a.i.Class10)
         && !(var1 instanceof com.xy.a.i.Class6)
         && !(var1 instanceof com.xy.a.i.Class11)
         && !(var1 instanceof com.xy.a.q.Class13);
   }

   public void h() {
      this.eg = 0;
      this.auj = null;
      this.atz = 0L;
      this.ak = false;
      this.wb = false;
      this.nj = null;
      this.l();
   }

   public Object jx() {
      return this.auj;
   }

   public boolean ls() {
      return this.ak;
   }

   @Override
   public void mousePressed(MouseEvent var1) {
      this.gn(Boolean.TRUE);
   }

   public void l() {
      this.lp = null;
   }

   public void t() {
      this.att = null;
   }

   public boolean dh() {
      return this.eg == 0;
   }

   public void als(Image var1, com.xy.v.Class32 var2) {
      this.auo = var1;
      this.atr = var2;
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
      this.gn(Boolean.FALSE);
      if (this.aud) {
         if (com.xy.v.Class22.h()) {
            return;
         }

         this.cw(var1);
      }
   }

   @Override
   public void mouseEntered(MouseEvent var1) {
      this.aud = Boolean.TRUE;
      if (this.eg == 10 && this.aui instanceof Class74) {
         ((Class74)this.aui).xg();
      }

      if (this.eg != 1 && this.eg != 18) {
         if (this.eg != 3 && this.eg != 4) {
            if (this.eg == 7) {
               Lingbao var21 = this.aui.yx().getChoseBao();
               ((com.xy.a.Class48)this.aui.zc().j(46)).qp((String)this.auj, (int)this.atz, var21);
               return;
            }

            if (this.eg == 8) {
               RoleTxBean var20 = (RoleTxBean)this.auj;
               ((com.xy.a.Class48)this.aui.zc().j(46)).qo(var20);
               return;
            }

            if (this.eg == 9) {
               Skill var19;
               if ((var19 = this.aui.yt().ac(String.valueOf(this.atz))) == null) {
                  return;
               }

               String[] var23 = (String[])this.auj;
               long var4 = new BigDecimal(var23[3]).longValue();
               StringBuffer var6 = new StringBuffer();
               String var28 = "\u00144q\u0011q\u0011\u0007g〧拗胊笞纐う\u0017";
               var6.append("#cFFFF00【技能等级】 ");
               var6.append(ExpUtil.d(var4));
               String var10004 = ":R〉籛垒〱9逺由\u0003k\u0003^";
               var6.append("#r【类型】 通用#r#G");
               var6.append(com.xy.a.Class48.pp(var19.getRemark(), var19, var23[2], String.valueOf(ExpUtil.d(var4))));
               ((com.xy.a.Class48)this.aui.zc().j(46)).es(var19.getSkillname(), var6.toString());
               return;
            }

            if (this.eg == 10) {
               UseCardBean var17 = (UseCardBean)this.auj;
               if ((var17 = this.aui.yx().getLimit(var17.getType())) == null) {
                  return;
               }

               ((com.xy.a.Class48)this.aui.zc().j(46)).pt(var17);
               return;
            }

            if (this.eg == 12) {
               BaseSkillData var16 = (BaseSkillData)this.auj;
               ((com.xy.a.Class48)this.aui.zc().j(46))
                  .qa(
                     var16.getSkill(),
                     var16.getSld(),
                     com.xy.v.Class4.s(this.aui.yx().getLoginResult().getGrade()),
                     com.xy.v.Class4.q(this.aui.yx().getLoginResult().getGrade())
                  );
               return;
            }

            if (this.eg == 13) {
               Shop var15 = (Shop)this.auj;
               ((com.xy.a.Class48)this.aui.zc().j(46)).ov(var15);
               return;
            }

            if (this.eg == 14) {
               PartJade var14;
               Goodstable var22 = com.xy.a.i.Class31.abs(var14 = (PartJade)this.auj, (int)this.atz);
               ((com.xy.a.Class48)this.aui.zc().j(46)).hr(var22, false);
               return;
            }

            if (this.eg == 17) {
               Buff var13 = (Buff)this.auj;
               ((com.xy.a.Class48)this.aui.zc().j(46)).es(var13.getbName(), var13.getbText());
               return;
            }

            if (this.eg == 19) {
               Eshop var12 = (Eshop)this.auj;
               ((com.xy.a.Class48)this.aui.zc().j(46)).qw(var12);
               return;
            }

            if (this.eg == 21) {
               RoleSummoning var11;
               if ((var11 = (RoleSummoning)this.auj).getSid() != null && (var11 = this.aui.yx().getPet(var11.getSid())) == null) {
                  var11 = (RoleSummoning)this.auj;
               }

               if (var11 == null) {
                  return;
               }

               ((com.xy.a.Class1)this.aui.zc().j(42)).aa(var11, null, false);
               return;
            }

            if (this.eg == 22) {
               ((com.xy.a.Class48)this.aui.zc().j(46)).bq((String)this.auj);
               return;
            }

            if (this.eg == 23) {
               if (this.atz == 1L) {
                  LoginResult var8 = this.aui.yx().getLoginResult();
                  com.xy.a.Class48 var3 = (com.xy.a.Class48)this.aui.zc().j(46);
                  StringBuilder var24 = new StringBuilder(String.valueOf(var8.getRolename()));
                  String var26 = "\u0017";
                  var24 = var24.append(" ").append(com.xy.v.Class4.h(var8.getGrade()));
                  var26 = "纾";
                  var3.bq(var24.append("级").toString());
                  return;
               }

               if (this.atz == 2L) {
                  RoleSummoning var7;
                  if ((var7 = this.aui.yx().getChosePet()) == null) {
                     return;
                  }

                  com.xy.a.Class48 var10000 = (com.xy.a.Class48)this.aui.zc().j(46);
                  StringBuilder var10001 = new StringBuilder(String.valueOf(var7.getSummoningname()));
                  String var10002 = "w志讍\r";
                  var10000.bq(var10001.append(" 忠诚:").append(var7.getFaithful()).toString());
                  return;
               }
            } else {
               if (this.eg == 24) {
                  StallBuyData var10 = (StallBuyData)this.auj;
                  ((com.xy.a.Class48)this.aui.zc().j(46)).po(var10);
                  return;
               }

               if (this.eg == 25) {
                  StallBuyData var9 = this.aui.yt().cb((int)this.atz);
                  ((com.xy.a.Class48)this.aui.zc().j(46)).po(var9);
               }
            }
         } else if (this.aui instanceof com.xy.a.a.Class4) {
            ((com.xy.a.a.Class4)this.aui).af(this);
            return;
         }
      } else {
         Goodstable var2 = (Goodstable)this.auj;
         if (this.eg == 1 && var2.getRgid() != null) {
            var2 = this.aui.yx().getGood(var2.getRgid());
         }

         if (var2 != null) {
            ((com.xy.a.Class48)this.aui.zc().j(46)).hr(var2, false);
         }
      }
   }

   public void ef(long var1) {
      this.atz = var1;
   }

   public void gr(Image var1) {
      this.att = var1;
   }

   public void gs(int var1, Object var2) {
      this.eg = var1;
      this.auj = var2;
      this.atz = 0L;
      this.ak = false;
      this.wb = false;
      this.nj = null;
      if (var2 == null) {
         this.l();
         if (this.atx) {
            this.setVisible(false);
         }
      } else {
         Class54 var10000;
         if (var1 == 1 || var1 == 18) {
            Goodstable var20 = (Goodstable)var2;
            this.atz = var20.getRgid() != null ? var20.getRgid().longValue() : 0L;
            var10000 = this;
            this.nj = var20.getRgid();
            this.gt(com.xy.w.Class15.d(var20.getSkin()));
            this.wb = true;
         } else if (var1 == 2) {
            Baby var3;
            Baby var10002 = var3 = (Baby)var2;
            var10000 = this;
            this.atz = var3.getBabyid().longValue();
            this.gt(com.xy.w.Class15.v(var10002.getChildSex()));
         } else if (var1 == 3 || var1 == 4) {
            Talent var19 = (Talent)var2;
            this.atz = var19.getId();
            var10000 = this;
            this.gt(com.xy.w.Class15.g(String.valueOf(var19.getId())));
         } else if (var1 == 5) {
            Lingbao var5;
            Lingbao var25 = var5 = (Lingbao)var2;
            var10000 = this;
            this.atz = var5.getBaoid().longValue();
            this.gt(com.xy.w.Class15.b(var25.getSkin()));
         } else {
            label131: {
               if (var1 == 6) {
                  this.atz = ((Integer)var2).intValue();
                  if (this.atz == 1L) {
                     String var10001 = "jC6D6\u0014-\u000eiN~";
                     this.dp("sc/d/44.png");
                     var10000 = this;
                     break label131;
                  }

                  if (this.atz == 2L) {
                     var10000 = this;
                     String var26 = "D4\u00183\u0018c\u0000yG9P";
                     this.dp("sc/d/47.png");
                     break label131;
                  }
               } else {
                  if (var1 == 7) {
                     String var18;
                     String var23 = var18 = (String)var2;
                     String var24 = "$";
                     int var22 = var23.indexOf("=");
                     this.atz = com.xy.v.Class12.ad(var18, var22 + 1, var18.length());
                     this.auj = var18.substring(0, var22);
                     this.gt(com.xy.w.Class15.o((String)this.auj));
                     var10000 = this;
                     break label131;
                  }

                  if (var1 == 8) {
                     RoleTxBean var17 = (RoleTxBean)var2;
                     var10000 = this;
                     this.atz = var17.getGid();
                     String var32 = "#O";
                     this.gt(com.xy.w.Class15.d("tx" + var17.getRdId()));
                     break label131;
                  }

                  if (var1 == 9) {
                     String[] var16 = (String[])var2;
                     var10000 = this;
                     String var30 = "jC6SrIuL6Ja\u000eiN~";
                     this.atz = Integer.parseInt(var16[1]);
                     var16[0] = null;
                     var16[1] = null;
                     this.dp("sc/skill/jx.png");
                     break label131;
                  }

                  if (var1 == 10) {
                     UseCardBean var15 = (UseCardBean)var2;
                     var10000 = this;
                     this.gt(com.xy.w.Class15.d(var15.getSkin()));
                     break label131;
                  }

                  if (var1 == 11) {
                     aCard var14 = (aCard)var2;
                     var10000 = this;
                     this.dp(com.xy.w.Class15.l(var14.getSkin()));
                     break label131;
                  }

                  if (var1 == 12) {
                     BaseSkillData var13;
                     int var21;
                     if ((var21 = Integer.parseInt((var13 = (BaseSkillData)var2).getSkill().getSkillid())) >= 10001 && var21 <= 10008) {
                        var10000 = this;
                        this.gt(com.xy.w.Class15.g(var13.getSkill().getSkillid()));
                     } else if (var21 > 12000 && var21 <= 13000) {
                        var10000 = this;
                        this.gt(com.xy.w.Class15.i(var21));
                     } else {
                        var10000 = this;
                        this.gt(com.xy.w.Class15.h(var13.getSkill().getSkillid()));
                     }
                     break label131;
                  }

                  if (var1 == 13) {
                     Shop var12 = (Shop)var2;
                     var10000 = this;
                     this.gt(com.xy.w.Class15.d(var12.getShopskin()));
                     break label131;
                  }

                  if (var1 >= 101 && var1 <= 105) {
                     this.eg = 14;
                     this.atz = var1 - 100;
                     PartJade var11 = (PartJade)var2;
                     String var28 = "#M.Q";
                     StringBuilder var29 = new StringBuilder("tzyf");
                     var10000 = this;
                     this.gt(com.xy.w.Class15.d(var29.append(this.atz).toString()));
                     break label131;
                  }

                  if (var1 == 15) {
                     PartJade var10 = (PartJade)var2;
                     var10000 = this;
                     String var31 = "Tc";
                     this.gt(com.xy.w.Class15.d("tz" + var10.getSuitid() + "_" + var10.getPartId()));
                     break label131;
                  }

                  if (var1 == 16) {
                     this.atz = ((Integer)var2).intValue();
                     var10000 = this;
                     this.gt(com.xy.w.Class15.d(String.valueOf(this.atz)));
                     break label131;
                  }

                  if (var1 == 17) {
                     var10000 = this;
                     String var27 = "D4\u00185\u0018\u0015\u0003c\u0005yG9P";
                     this.dp("sc/b/B442.png");
                     break label131;
                  }

                  if (var1 == 19) {
                     Eshop var9 = (Eshop)var2;
                     var10000 = this;
                     this.gt(com.xy.w.Class15.d(var9.getEshopskin()));
                     break label131;
                  }

                  if (var1 == 21) {
                     RoleSummoning var8 = (RoleSummoning)var2;
                     this.atz = var8.getSid() != null ? var8.getSid().longValue() : 0L;
                     var10000 = this;
                     String var10004 = "i";
                     this.gt(com.xy.w.Class15.e("p" + var8.getSummoningskin()));
                     break label131;
                  }

                  if (var1 != 22) {
                     if (var1 == 23) {
                        this.atz = ((Integer)var2).intValue();
                        var10000 = this;
                        break label131;
                     }

                     if (var1 == 24) {
                        StallBuyData var7 = (StallBuyData)var2;
                        var10000 = this;
                        this.atz = var7.getId();
                        this.gt(com.xy.w.Class15.d(var7.getSkin()));
                        this.wb = true;
                        break label131;
                     }

                     if (var1 == 25) {
                        StallNeedBean var6 = (StallNeedBean)var2;
                        this.atz = var6.getId();
                        StallBuyData var4;
                        this.gt(com.xy.w.Class15.d((var4 = this.aui.yt().cb(var6.getId())) != null ? var4.getSkin() : "0"));
                        this.wb = true;
                     }
                  }
               }

               var10000 = this;
            }
         }

         var10000.setVisible(true);
      }
   }

   public boolean ah() {
      return this.aug;
   }

   public void gn(Boolean var1) {
      if (this.auh != var1) {
         this.auh = var1;
      }
   }

   @Override
   public void setVisible(boolean var1) {
      if (var1 != this.isVisible()) {
         this.show(var1);
      }
   }

   public long ee() {
      return this.atz;
   }

   public void gt(Image var1) {
      this.lp = var1;
   }

   public void hy(boolean var1) {
      this.wb = var1;
   }

   public void dp(String var1) {
      this.lp = com.xy.w.Class16.c(var1);
   }

   public void cr(boolean var1) {
      this.aug = var1;
   }

   public int il() {
      return this.eg;
   }

   public void wp(com.xy.v.Class32 var1) {
      this.aua = var1;
   }

   public void rm(boolean var1) {
      this.atx = var1;
   }

   @Override
   public void mouseExited(MouseEvent var1) {
      this.gn(Boolean.FALSE);
      this.aud = Boolean.FALSE;
      if (this.eg != 1
         && this.eg != 3
         && this.eg != 4
         && this.eg != 7
         && this.eg != 10
         && (this.eg < 12 || this.eg > 14)
         && (this.eg < 17 || this.eg > 19)
         && (this.eg < 22 || this.eg > 25)) {
         if (this.eg == 21) {
            this.aui.zc().f(42);
         }
      } else {
         this.aui.zc().f(46);
      }
   }

   @Override
   public void mouseClicked(MouseEvent var1) {
   }

   public void cw(MouseEvent var1) {
      if (this.aui != null) {
         if (this.aui instanceof Class74) {
            if (this.eg == 23 && this.atz == 1L) {
               if (var1.getButton() == 1) {
                  this.aui.zc().b(0);
                  return;
               }
            } else if (this.eg == 23 && this.atz == 2L) {
               if (var1.getButton() == 1) {
                  this.aui.zc().b(6);
                  return;
               }

               if (var1.getButton() == 3) {
                  this.aui.zc().b(6);
                  com.xy.i.Class0.ff(67, this.aui.afx);
                  return;
               }
            }
         } else if (this.aui instanceof com.xy.a.a.Class4) {
            if (this.eg == 1) {
               ((com.xy.a.a.Class4)this.aui).ak(this);
               return;
            }

            if (this.eg == 2) {
               Baby var2 = this.aui.yx().getBaby(new BigDecimal(this.atz));
               ((com.xy.a.a.Class4)this.aui).aj(var2);
               return;
            }

            if (this.eg == 4) {
               ((com.xy.a.a.Class4)this.aui).ai(this);
               return;
            }
         } else {
            if (this.aui instanceof com.xy.a.a.Class33) {
               ((com.xy.a.a.Class33)this.aui).ak(this);
               return;
            }

            if (this.aui instanceof com.xy.a.w.Class26) {
               ((com.xy.a.w.Class26)this.aui).ak(this);
               return;
            }

            if (this.aui instanceof com.xy.a.q.Class34) {
               if (this.eg == 1) {
                  this.gs(0, null);
                  return;
               }
            } else if (this.aui instanceof Class103) {
               if (this.eg == 11) {
                  ((Class103)this.aui).alp((aCard)this.auj);
                  return;
               }
            } else if (this.aui instanceof com.xy.a.w.Class21) {
               if (this.eg == 12) {
                  this.aui.afx.choseImg.f((BaseSkillData)this.auj);
                  return;
               }
            } else if (this.aui instanceof com.xy.a.w.Class12) {
               int var3;
               BaseSkillData var4;
               if (this.eg == 12 && (var3 = Integer.parseInt((var4 = (BaseSkillData)this.auj).getSkill().getSkillid())) > 12000 && var3 < 12500) {
                  this.aui.afx.choseImg.f((BaseSkillData)this.auj);
                  return;
               }
            } else if (this.aui instanceof com.xy.a.q.Class16) {
               if (this.eg == 1) {
                  this.gs(0, null);
                  return;
               }
            } else if (this.aui instanceof Class64) {
               if (this.eg == 1) {
                  ((Class64)this.aui).ak(this);
                  return;
               }
            } else if (this.aui instanceof com.xy.a.i.Class13) {
               if (this.eg == 1 || this.eg == 14) {
                  this.gs(0, null);
                  return;
               }
            } else if (this.aui instanceof com.xy.a.i.Class45) {
               if (this.eg == 1) {
                  this.gs(0, null);
                  ((com.xy.a.i.Class45)this.aui).e();
                  return;
               }
            } else if (this.aui instanceof com.xy.a.i.Class20) {
               if (this.eg == 1) {
                  this.gs(0, null);
                  ((com.xy.a.i.Class20)this.aui).f();
                  return;
               }
            } else if (this.aui instanceof com.xy.a.i.Class15) {
               if (this.eg == 15) {
                  ((com.xy.a.i.Class15)this.aui).ak(this);
                  return;
               }
            } else if (this.aui instanceof Class117) {
               if (this.eg == 1) {
                  this.gs(0, null);
                  ((Class117)this.aui).h();
                  return;
               }
            } else if (this.aui instanceof Class97) {
               if (this.eg == 1) {
                  ((Class97)this.aui).ak(this);
                  return;
               }
            } else if (this.aui instanceof com.xy.a.q.Class41) {
               if (this.eg == 1) {
                  ((com.xy.a.q.Class41)this.aui).ak(this);
                  return;
               }
            } else if (this.aui instanceof Class105) {
               if (this.eg == 1) {
                  ((Class105)this.aui).ak(this);
                  return;
               }
            } else if (this.aui instanceof Class98) {
               if (this.eg == 1) {
                  ((Class98)this.aui).ak(this);
                  return;
               }
            } else if (this.aui instanceof com.xy.a.i.Class10) {
               if (this.eg == 1) {
                  ((com.xy.a.i.Class10)this.aui).bb(null);
                  return;
               }
            } else if (this.aui instanceof com.xy.a.i.Class6) {
               if (this.eg == 1) {
                  ((com.xy.a.i.Class6)this.aui).bb(null);
                  return;
               }
            } else if (this.aui instanceof com.xy.a.i.Class11) {
               if (this.eg == 1) {
                  ((com.xy.a.i.Class11)this.aui).bb(null);
                  return;
               }
            } else if (this.aui instanceof com.xy.a.v.Class30) {
               if (this.eg == 22) {
                  ((com.xy.a.v.Class30)this.aui).ak(this);
                  return;
               }
            } else if (this.aui instanceof com.xy.a.q.Class13) {
               ((com.xy.a.q.Class13)this.aui).ai(this);
            }
         }
      }
   }

   public void mt(com.xy.w.Class9 var1) {
      this.oh = var1;
   }

   public void be(boolean var1) {
      this.ak = var1;
   }

   @Override
   protected void paintComponent(Graphics var1) {
      Class54 var10000;
      if (this.att != null) {
         var10000 = this;
         var1.drawImage(this.att, 0, 0, this.getWidth(), this.getHeight(), null);
      } else {
         if (this.oh != null) {
            this.oh.g(var1, this.getWidth(), this.getHeight());
         }

         var10000 = this;
      }

      if (var10000.lp != null) {
         if (this.nj != null && this.nj != ((Goodstable)this.auj).getRgid()) {
            Goodstable var2;
            if ((var2 = this.aui.yx().getGood(this.nj)) == null) {
               this.nj = null;
            } else {
               this.nj = var2.getRgid();
               this.auj = var2;
               this.gt(com.xy.w.Class15.d(var2.getSkin()));
            }
         }

         Composite var4 = null;
         if (this.ak) {
            Graphics2D var3;
            Graphics2D var6 = var3 = (Graphics2D)var1;
            var4 = var6.getComposite();
            var6.setComposite(com.xy.w.Class1.k);
            var6.setColor(Color.BLACK);
         }

         Composite var7;
         if (this.auh) {
            if (this.wb) {
               if (this.aua != null) {
                  com.xy.w.Class16.j(var1, this.lp, this.aua.f() + 1, this.aua.h() + 1, this.aua.c() - 2, this.aua.b() - 2);
                  var7 = var4;
               } else {
                  com.xy.w.Class16.j(var1, this.lp, 1, 1, this.getWidth() - 2, this.getHeight() - 2);
                  var7 = var4;
               }
            } else if (this.aua != null) {
               var1.drawImage(this.lp, this.aua.f() + 1, this.aua.h() + 1, this.aua.c() - 2, this.aua.b() - 2, null);
               var7 = var4;
            } else {
               var1.drawImage(this.lp, 1, 1, this.getWidth() - 2, this.getHeight() - 2, null);
               var7 = var4;
            }
         } else if (this.wb) {
            if (this.aua != null) {
               com.xy.w.Class16.j(var1, this.lp, this.aua.f(), this.aua.h(), this.aua.c(), this.aua.b());
               var7 = var4;
            } else {
               com.xy.w.Class16.j(var1, this.lp, 0, 0, this.getWidth(), this.getHeight());
               var7 = var4;
            }
         } else if (this.aua != null) {
            var1.drawImage(this.lp, this.aua.f(), this.aua.h(), this.aua.c(), this.aua.b(), null);
            var7 = var4;
         } else {
            var1.drawImage(this.lp, 0, 0, this.getWidth(), this.getHeight(), null);
            var7 = var4;
         }

         if (var7 != null) {
            Graphics2D var5;
            (var5 = (Graphics2D)var1).setComposite(var4);
         }
      }

      if (this.aug && this.auo != null) {
         if (this.atr != null) {
            var1.drawImage(this.auo, this.atr.f(), this.atr.h(), this.atr.c(), this.atr.b(), null);
            return;
         }

         var1.drawImage(this.auo, 0, 0, this.getWidth(), this.getHeight(), null);
      }
   }

   public void dq(String var1) {
      this.att = com.xy.w.Class16.c(var1);
   }
}
