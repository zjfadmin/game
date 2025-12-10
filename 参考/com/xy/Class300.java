package com.xy;

import com.xy.bean.ConfirmBean;
import com.xy.formula.BaseValue;
import com.xy.formula.BaseXuanBao;
import com.xy.game.RoleData;
import com.xy.readbean.Goodstable;
import com.xy.readbean.Skill;
import com.xy.readbean.XuanBao;
import com.xy.richtext.RichLabel;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.image.ImageObserver;
import java.math.BigDecimal;
import javax.swing.JLabel;

public class Class300 extends Class345 {
   private Class436 aue;
   private static Image ayu = Class511.a("sc/music/239.a");
   private static Image kx = Class511.a("sc/music/241.a");
   private <undefinedtype> ayv;
   private static Image ll = Class511.a("sc/music/240.a");
   private Class226 uu;
   private Class643 vy;
   private <undefinedtype> ayw;
   private Class216[] ayx;
   private Class436 r;
   private Class659[] ayy;
   private Class197 ayz;
   private Class226 aza;

   public void ly(Goodstable var1) {
      RoleData var5;
      if ((var5 = this.vd()) == null) {
         this.d();
      } else {
         var5.setChoseXuanBaoId(var1 != null ? var1.getRgid() : null);
         if (var1 == null) {
            this.d();
         } else {
            int var13 = Class224.d(var5.getLoginResult().getGrade());
            int var4 = Class224.g(var5.getLoginResult().getGrade());
            BaseXuanBao var9 = var1.getBaseXuanBao();
            XuanBao var3 = this.vc().cb(var9.getId());

            int var2;
            int var15;
            for(var15 = var2 = 3 & 4; var15 < this.ayv.ad.length; var15 = var2) {
               JLabel var16 = this.ayv.ad[var2];
               ++var2;
               var16.setText(var3.getName());
            }

            var15 = 5 >> 3;
            this.ayv.gi.setTextSize(var3.getText(), 12287 & 20630);
            this.ayv.gi.setBounds(15351 & 17870, 101 & 94, this.ayv.gi.getWidth(), this.ayv.gi.getHeight());

            for(var2 = var15; var15 < this.ayv.akw.length; var15 = var2) {
               if (var2 >= var3.getYins().length) {
                  this.ayv.akw[var2].setVisible((boolean)(3 & 4));
                  this.ayw.baq[var2].c(3 ^ 3, (Object)null);
                  this.ayw.baq[var2].d();
               } else {
                  this.aoe(var2, var3, var9);
               }

               ++var2;
            }

            String[] var17 = new String[var3.getName().length()];
            boolean var10002 = true;
            String[] var11 = var17;

            int var6;
            for(var15 = var6 = 2 & 5; var15 < var11.length; var15 = var6) {
               String var18 = var3.getName();
               int var10001 = var6;
               var18 = var18.substring(var6, var6 + (2 ^ 3));
               ++var6;
               var11[var10001] = var18;
            }

            this.ayw.aza.df(var11);
            this.ayw.asa.e(var11.length == --4 ? 63 & 92 : (var11.length == --3 ? 38 & 127 : 18));
            this.ayw.iv[3 & 5].setText(var3.getLevel() == --3 ? "珍品" : (var3.getLevel() == --2 ? "中品" : "初品"));
            this.ayw.rp[2 & 5].setText(var9.getLvl() + "级");
            this.ayw.rp[4 ^ 5].setText(var9.getExp() + "/" + BaseValue.getXuanBaoExp(var9.getLvl()));
            this.ayw.pv[3 & 4].hf(Class222.i("xb" + var3.getId()));
            Skill var14 = this.vc().bf(String.valueOf(var3.getSkillId()));
            this.ayw.bw.setTextSize("#G" + Class270.si(var14.getRemark(), var14, (double)var9.getLvl(), var13, var4), 6926 & 26111);
            StringBuffer var12;
            (var12 = new StringBuffer()).append("#G");
            Point[] var10 = var9.c(var3, this.vc());
            var6 = 3 >> 2;

            for(var15 = var6; var15 < var3.getResonances().length; var15 = var6) {
               Point var7 = var10[var6 / --3];
               var12.append("#r");
               var12.append("#VIMG2|12|12|sc/e/xy" + (var7.x > 0 ? "c" : "d") + var3.getResonances()[var6] + "#L");
               var12.append("#VIMG2|12|12|sc/e/xy" + (var7.y > 0 ? "c" : "d") + var3.getResonances()[var6 + (5 >> 2)] + "#L ");
               Skill var8 = this.vc().bf(String.valueOf(var3.getResonances()[var6 + (1 ^ 3)]));
               StringBuffer var19;
               if (var7.x > 0 && var7.y > 0) {
                  var12.append("[#R" + (var7.x + var7.y) + "#G级]");
                  var19 = var12;
                  var12.append(Class270.si(var8.getRemark(), var8, (double)(var7.x + var7.y), var13, var4));
               } else {
                  var19 = var12;
                  var12.append("#c808080");
                  var12.append(Class270.si(var8.getRemark(), var8, -9999.0D, var13, var4));
               }

               var6 += 3;
               var19.append("#G");
            }

            this.ayw.acv.setTextSize(var12.toString(), 23870 & 9167);
         }
      }
   }

   public void aoe(int var1, XuanBao var2, BaseXuanBao var3) {
      null.dc(this.ayv.akw[var1], Class511.a("sc/e/xya" + var2.getYins()[var1] + ".png"));
      Point var4 = var3.getXuanYinByIndex(var1);
      Class300 var10000;
      if (var3.d() < var1 + (2 ^ 3)) {
         var10000 = this;
         null.da(this.ayv.akw[var1], 5 >> 3);
         null.db(this.ayv.akw[var1]).c(2 & 5, (Object)null);
         this.ayw.baq[var1].c(3 >> 2, (Object)null);
         this.ayw.baq[var1].hf(Class511.a("sc/music/245.a"));
      } else if (var4 == null) {
         var10000 = this;
         null.da(this.ayv.akw[var1], 3 >> 1);
         null.db(this.ayv.akw[var1]).c(3 ^ 3, (Object)null);
         this.ayw.baq[var1].c(3 & 4, (Object)null);
         this.ayw.baq[var1].hf(Class511.a("sc/music/246.a"));
      } else if (var4.x == 0) {
         null.da(this.ayv.akw[var1], 1 ^ 3);
         var10000 = this;
         null.db(this.ayv.akw[var1]).c(2 & 5, (Object)null);
         this.ayw.baq[var1].c(3 ^ 3, (Object)null);
         this.ayw.baq[var1].hf(Class511.a("sc/music/247.a"));
      } else {
         null.da(this.ayv.akw[var1], 1 ^ 3);
         Goodstable var5;
         Goodstable var10002 = var5 = new Goodstable();
         var10000 = this;
         var5.setGoodsname(this.vc().ao(Math.abs(var4.x)).getName());
         var5.setType(811L);
         var5.setSkin("xy" + Math.abs(var4.x));
         var5.setValue(Math.abs(var4.x) + "|" + var4.y);
         null.db(this.ayv.akw[var1]).c(3 & 5, var5);
         var10002.setSkin("xya" + Math.abs(var4.x));
         this.ayw.baq[var1].c(3 & 5, var5);
         this.ayw.baq[var1].hf(Class511.a("sc/music/247.a"));
      }

      var10000.ayv.akw[var1].setVisible((boolean)(--1));
   }

   public void y(int var1) {
      this.uu.gb((boolean)(var1 == 3 >> 1 ? 5 >> 2 : 0));
      this.aza.gb((boolean)(var1 == 5 >> 1 ? 5 >> 2 : 0));
      int var10000;
      int var10001;
      int var2;
      int var10002;
      Class216 var3;
      Class659 var4;
      Class300 var5;
      if (var1 == 5 >> 2) {
         for(var10000 = var2 = 3 ^ 3; var10000 < this.ayx.length; var10000 = var2) {
            this.ayx[var2].setImage(var2 == 0 ? "sc/e/42.png" : "sc/e/43.png");
            var3 = this.ayx[var2];
            var10001 = var2 == 0 ? 762 & 32559 : 576;
            ++var2;
            var3.setBounds(var10001, 438, 19 & 126, 19 & 126);
         }

         for(var10000 = var2 = 2 & 5; var10000 < this.ayy.length; var10000 = var2) {
            var4 = this.ayy[var2];
            var10001 = (125 & 86) + var2 * (93 & 119);
            var10002 = 18868 & 14335;
            ++var2;
            var4.vf(var10001, var10002, 88 & 119, 87 & 60);
         }

         var5 = this;
         this.ayz.cf(95 & 42, 1 ^ 3);
         this.aue.setBounds(123 & 87, 4424 & 28671, 23291 & 9989, 109 & 123);
         this.ayz.setBounds(118 & 93, 5983 & 27114, 15359 & 17918, 103 & 126);
         this.r.setBounds(72, 36, 536, 288);
      } else {
         if (var1 == (1 ^ 3)) {
            for(var10000 = var2 = 3 & 4; var10000 < this.ayx.length; var10000 = var2) {
               this.ayx[var2].setImage(var2 == 0 ? "sc/e/47.png" : "sc/e/48.png");
               var3 = this.ayx[var2];
               var10002 = var2 == 0 ? 355 : 378;
               ++var2;
               var3.setBounds(50, var10002, 18, 18);
            }

            for(var10000 = var2 = 3 & 4; var10000 < this.ayy.length; var10000 = var2) {
               var4 = this.ayy[var2];
               var10001 = 76 + var2 * 70;
               ++var2;
               var4.vf(var10001, 432, 66, 20);
            }

            this.ayz.cf(--4, 5 >> 1);
            this.aue.setBounds(75, 324, 207, 105);
            this.ayz.setBounds(76, 326, 204, 102);
            this.r.setBounds(72, 36, 536, 420);
         }

         var5 = this;
      }

      var5.ayv.setVisible((boolean)(var1 == 3 >> 1 ? 4 ^ 5 : 0));
      this.ayw.setVisible((boolean)(var1 == (1 ^ 3) ? --1 : 0));
   }

   public void th(Class44 var1) {
      if (this.aej.getBattleScene() != null) {
         this.aej.f("战斗中无法操作");
      } else {
         Goodstable var6;
         RoleData var7;
         if ((var6 = (var7 = this.vd()).getChoseXuanBao()) != null) {
            BaseXuanBao var4 = var6.getBaseXuanBao();
            XuanBao var5 = this.vc().cb(var4.getId());
            int var3 = var4.b(var5.getYins().length);
            int var2;
            if (this.ayv.isVisible() || this.ayw.isVisible()) {
               for(int var10000 = var2 = 0; var10000 < this.ayv.akw.length; var10000 = var2) {
                  if (null.db(this.ayv.akw[var2]) == var1 || this.ayw.baq[var2] == var1) {
                     if (var3 != -4 >> 2 && var2 >= var3) {
                        if (var4.d() < var3 + (5 >> 2)) {
                           return;
                        }

                        Goodstable var8;
                        if ((var8 = var7.az(813L)) == null) {
                           this.aej.f("你身上没有玄珏无法开启玄印槽");
                           return;
                        }

                        int var9 = var3 == 0 ? --2 : (var3 == 3 >> 1 ? --4 : (var3 == (1 ^ 3) ? 24 & 111 : (var3 == --3 ? 63 & 76 : 20)));
                        this.aej.aal(new ConfirmBean(47 & 116, var6.getRgid() + "|" + var8.getRgid(), "#W消耗#G" + var9 + "#W个#G玄珏#W有几率解锁此玄印槽。施放确认解锁？#r#Y当前剩余：" + (var8 != null ? var8.getUsetime() : 0)));
                     } else if (var4.getYins()[var2].x == 0) {
                        ((Class472)this.ve().e(95 & 59)).lg(var2, var5, var6);
                     } else {
                        this.aej.aal(new ConfirmBean(38 & 125, var6.getRgid() + "|A" + var2, "是否拆卸第" + (var2 + --1) + "个玄印槽中的玄印？"));
                     }
                  }

                  ++var2;
               }
            }

         }
      }
   }

   public void q() {
      if (this.vd() != null) {
         int var10002 = 2 ^ 3;
         this.av((Goodstable)null);
         this.y(var10002);
         super.q();
      }
   }

   public void c(int var1, Object var2) {
      if (var1 == (15863 & 17145)) {
         Class658.cy(24511 & 8445, this.aej);
      } else {
         Goodstable var3;
         if (var1 == (3835 & 29175)) {
            if (this.aej.getBattleScene() != null) {
               this.aej.f("战斗中无法操作");
            } else if ((var3 = this.vd().getChoseXuanBao()) != null) {
               ((Class134)this.aej.getFormManagement().e(27839 & 5119)).ax(var3);
            }
         } else {
            if (var1 == (12021 & 20990)) {
               if (this.aej.getBattleScene() != null) {
                  this.aej.f("战斗中无法操作");
                  return;
               }

               if ((var3 = this.vd().getChoseXuanBao()) == null) {
                  return;
               }

               this.aej.aal(new ConfirmBean(116 & 47, var3.getRgid() + "|A-1", "是否拆卸全部玄印？"));
            }

         }
      }
   }

   public void av(Goodstable var1) {
      RoleData var4 = this.vd();

      int var3;
      for(int var10000 = var3 = 3 >> 2; var10000 < this.ayv.ct.length; var10000 = var3) {
         Goodstable var2 = var4.getEquipGood((95 & 47) + var3);
         Class44 var5 = this.ayv.ct[var3];
         int var10001;
         Goodstable var10002;
         if (var2 != null) {
            var10001 = 5 >> 2;
            var10002 = var2;
         } else {
            var10001 = 0;
            var10002 = var2;
         }

         var5.c(var10001, var10002);
         ++var3;
      }

      if (var1 == null || var4.al(var1.getRgid())) {
         this.ly(var1);
      }

   }

   public Class300(GameView var1) {
      int var10004 = -1 & -2;
      super(23038 & 9919, 1 ^ 3, Class345.aef, var1);
      this.va(var10004, 3 ^ 3, 9854 & 23551, 2043 & 31199, Class345.aeo);
      this.uv(Class511.q("sc/d/1.png", 86 & 109, 86 & 109, 86 & 109, 86 & 109, (boolean)(3 & 4)), "玄宝");
      var10004 = 5 >> 1;
      int var10005 = 23 & 125;
      Font var10006 = Class681.bu;
      String[] var10008 = new String[--4];
      boolean var10010 = true;
      var10008[3 >> 2] = "玄";
      var10008[--1] = "宝";
      var10008[1 ^ 3] = "装";
      var10008[--3] = "备";
      this.uu = new Class226("sc/e/41.png", var10004, var10005, var10006, (Color[])null, var10008, this);
      var10004 = --2;
      var10005 = 54 & 95;
      var10006 = Class681.bu;
      var10008 = new String[--4];
      var10010 = true;
      var10008[2 & 5] = "玄";
      var10008[3 >> 1] = "宝";
      var10008[5 >> 1] = "属";
      var10008[--3] = "性";
      this.aza = new Class226("sc/e/41.png", var10004, var10005, var10006, (Color[])null, var10008, this);
      int var10001 = --3;
      this.uu.ad(new Class116(94 & 39, 59 & 87, 3 ^ 3, 22 & 123));
      this.aza.ad(new Class116(62 & 71, 83 & 63, 2 & 5, 50 & 95));
      this.uu.setBounds(123 & 46, 120 & 47, 127 & 30, 80);
      this.aza.setBounds(42, 121, 30, 80);
      this.uu.ch(Class681.bv);
      this.aza.ch(Class681.bv);
      this.add(this.uu);
      this.add(this.aza);
      this.vy = new Class643("sc/e/27.png", 4 ^ 5, 241, Class681.bm, (Color[])null, "玄宝图鉴", this);
      this.vy.setBounds(545, 15, 51, 17);
      this.add(this.vy);
      Class659[] var4 = new Class659[var10001];
      boolean var10003 = true;
      this.ayy = var4;

      int var2;
      int var10000;
      for(var10000 = var2 = 5 >> 3; var10000 < this.ayy.length; var10000 = var2) {
         this.ayy[var2] = new Class659(--2, 100, this);
         this.ayy[var2].fa().setFont(Class681.ce);
         this.ayy[var2].oz().setFont(Class681.ce);
         Class300 var3;
         if (var2 == 0) {
            var3 = this;
            this.ayy[var2].fx(" 所有");
            this.ayy[var2].fx(" 通用");
            this.ayy[var2].fx(" 人族");
            this.ayy[var2].fx(" 魔族");
            this.ayy[var2].fx(" 仙族");
            this.ayy[var2].fx(" 鬼族");
            this.ayy[var2].fx(" 龙族");
         } else if (var2 == 3 >> 1) {
            var3 = this;
            this.ayy[var2].fx(" 类型");
            this.ayy[var2].fx(" 攻击");
            this.ayy[var2].fx(" 防御");
            this.ayy[var2].fx(" 辅助");
         } else {
            if (var2 == (1 ^ 3)) {
               this.ayy[var2].fx(" 品质");
               this.ayy[var2].fx(" 初品");
               this.ayy[var2].fx(" 中品");
               this.ayy[var2].fx(" 珍品");
            }

            var3 = this;
         }

         var3.ayy[var2].vf(84 + var2 * 85, 436, 80, 20);
         this.ayy[var2].y(3 & 4);
         this.add(this.ayy[var2++]);
      }

      var10001 = 5 >> 1;
      this.ayv = new Class456() {
         private Class436[] cs;
         private Class44[] ct;
         private <undefinedtype>[] akw;
         private JLabel[] ad;
         private RichLabel gi;

         public {
            int var10001 = --3;
            Class44[] var4 = new Class44[var10001];
            boolean var10003 = true;
            this.ct = var4;

            int var2;
            int var10000;
            for(var10000 = var2 = 3 ^ 3; var10000 < this.ct.length; var10000 = var2) {
               this.ct[var2] = new Class44(Class300.this.gk());
               this.ct[var2].fw("sc/d/49.png");
               this.ct[var2].ad(Class44.aqy);
               this.ct[var2].setBounds(90 & 119, (54 & 123) + var2 * (61 & 126), 127 & 58, 127 & 58);
               this.ct[var2].gt((boolean)(3 & 4));
               this.add(this.ct[var2++]);
            }

            JLabel[] var6 = new JLabel[--5];
            var10003 = true;
            this.ad = var6;

            <undefinedtype> var5;
            for(var10000 = var2 = 2 & 5; var10000 < this.ad.length; var10000 = var2) {
               this.ad[var2] = Class133.c(9677 & 23550, 46 & 123, 2781 & 30126, 92 & 59, --4, var2 == 0 ? Color.white : Color.black, Class681.cf);
               JLabel var3;
               int var10002;
               if (var2 == (3 & 5)) {
                  var3 = this.ad[var2];
                  var10002 = this.ad[var2].getX() + --1;
                  var5 = this;
                  var3.setBounds(var10002, this.ad[var2].getY() + --1, this.ad[var2].getWidth(), this.ad[var2].getHeight());
               } else if (var2 == 5 >> 1) {
                  var3 = this.ad[var2];
                  var10002 = this.ad[var2].getX() + (3 & 5);
                  var5 = this;
                  var3.setBounds(var10002, this.ad[var2].getY() - --1, this.ad[var2].getWidth(), this.ad[var2].getHeight());
               } else if (var2 == --3) {
                  var3 = this.ad[var2];
                  var10002 = this.ad[var2].getX() - (5 >> 2);
                  var5 = this;
                  var3.setBounds(var10002, this.ad[var2].getY() + --1, this.ad[var2].getWidth(), this.ad[var2].getHeight());
               } else {
                  if (var2 == --4) {
                     this.ad[var2].setBounds(this.ad[var2].getX() - --1, this.ad[var2].getY() - --1, this.ad[var2].getWidth(), this.ad[var2].getHeight());
                  }

                  var5 = this;
               }

               var5.add(this.ad[var2++]);
            }

            var10001 = --5;
            this.gi = new RichLabel("", Class681.bm);
            this.add(this.gi);
            <undefinedtype>[] var8 = new <undefinedtype>[var10001];
            var10003 = true;
            this.akw = var8;

            for(var10000 = var2 = 3 >> 2; var10000 < this.akw.length; var10000 = var2) {
               this.akw[var2] = new Class456() {
                  private Class44 cn;
                  // $FF: synthetic field
                  final Class300 fp;
                  private Image fq;
                  private int m;

               
                  static void da(Object var0, int var1) {
                     var0.m = var1;
                  }

               
                  static Class44 db(Object var0) {
                     return var0.cn;
                  }

                  public {
                     this.fp = var1;
                     this.cn = new Class44(var1.gk());
                     this.cn.setBounds(--4, 5 >> 1, 59 & 124, 59 & 124);
                     this.cn.gt((boolean)(3 >> 2));
                     this.cn.ab(4 ^ 5);
                     this.add(this.cn);
                  }

               
                  static void dc(Object var0, Image var1) {
                     var0.fq = var1;
                  }

                  protected void paintComponent(Graphics var1) {
                     super.paintComponent(var1);
                     Graphics var10000;
                     if (this.m == 0) {
                        var10000 = var1;
                        var1.drawImage(Class300.qa(), 5 >> 3, 5 >> 3, 91 & 100, 91 & 100, (ImageObserver)null);
                     } else if (this.m == 3 >> 1) {
                        var10000 = var1;
                        var1.drawImage(Class300.ga(), 5 >> 3, 5 >> 3, 75 & 116, 75 & 116, (ImageObserver)null);
                     } else {
                        var10000 = var1;
                        var1.drawImage(Class300.aog(), 3 & 4, 3 & 4, 79 & 112, 79 & 112, (ImageObserver)null);
                     }

                     var10000.drawImage(this.fq, 3 >> 2, 3 >> 2, 80 & 111, 80 & 111, (ImageObserver)null);
                  }
               };
               if (var2 == 0) {
                  var5 = this;
                  this.akw[var2].setBounds(26615 & 6460, 54 & 111, 104 & 87, 104 & 87);
               } else if (var2 == 3 >> 1) {
                  var5 = this;
                  this.akw[var2].setBounds(2030 & 30935, 20895 & 12009, 76 & 115, 76 & 115);
               } else if (var2 == 5 >> 1) {
                  var5 = this;
                  this.akw[var2].setBounds(6901 & 26111, 1774 & 31231, 64, 64);
               } else if (var2 == --3) {
                  var5 = this;
                  this.akw[var2].setBounds(371, 238, 64, 64);
               } else {
                  if (var2 == --4) {
                     this.akw[var2].setBounds(418, 137, 64, 64);
                  }

                  var5 = this;
               }

               var5.add(this.akw[var2++]);
            }

            Class436[] var9 = new Class436[--3];
            var10003 = true;
            this.cs = var9;

            for(var10000 = var2 = 3 >> 2; var10000 < this.cs.length; var10000 = var2) {
               this.cs[var2] = new Class436();
               if (var2 == 0) {
                  var5 = this;
                  this.cs[var2].fw("sc/music/238.a");
                  this.cs[var2].setBounds(456, 40, 148, 28);
               } else {
                  if (var2 == 5 >> 1) {
                     this.cs[var2].fw("sc/music/237.a");
                     this.cs[var2].setBounds(76, 40, 528, 280);
                  }

                  var5 = this;
               }

               var5.add(this.cs[var2++]);
            }

         }
      };
      this.ayv.setBounds(5 >> 3, 5 >> 3, 638, 475);
      this.add(this.ayv);
      this.ayw = new Class456() {
         private Class44[] baq;
         private Class167 bar;
         private Class167 bas;
         private Class245[] rp;
         private Class643[] y;
         private JLabel[] iv;
         private Class436[] pv;
         private Class116 asa;
         private RichLabel bw;
         private RichLabel acv;
         private Class226 aza;

         public {
            this.aza = new Class226("sc/music/236.a", -4 >> 2, 3 ^ 3, Class681.ct, (Color[])null, (String[])null, Class300.this.gk());
            this.aza.ad(this.asa = new Class116(-1 & -2, 30 & 125, 2 & 5, 93 & 54));
            int var10001 = --3;
            this.aza.setBounds(126 & 87, 63 & 110, 25 & 126, 109 & 126);
            this.aza.setForeground(Class681.c("#cE0C986"));
            this.aza.ch(Class681.bv);
            this.add(this.aza);
            Class643[] var5 = new Class643[var10001];
            boolean var10003 = true;
            this.y = var5;

            int var2;
            <undefinedtype> var4;
            int var10000;
            for(var10000 = var2 = 3 ^ 3; var10000 < this.y.length; var10000 = var2) {
               Class643[] var3 = this.y;
               Class643 var6 = new Class643;
               String var10004 = var2 == --2 ? "sc/e/27.png" : "sc/e/5.png";
               int var10006 = (755 & 32254) + var2;
               Font var10007 = Class681.bm;
               String var10009;
               Class300 var10010;
               if (var2 == 0) {
                  var10009 = "转换";
                  var10010 = Class300.this;
               } else if (var2 == --1) {
                  var10009 = "修炼";
                  var10010 = Class300.this;
               } else if (var2 == (1 ^ 3)) {
                  var10009 = "一键卸下";
                  var10010 = Class300.this;
               } else {
                  var10009 = "";
                  var10010 = Class300.this;
               }

               var3[var2] = var6;
               if (var2 == 0) {
                  var4 = this;
                  this.y[var2].setBounds(22766 & 10239, 58 & 119, 98 & 63, 121 & 23);
               } else if (var2 == (2 ^ 3)) {
                  var4 = this;
                  this.y[var2].setBounds(1279 & 31726, 14287 & 18747, 58 & 103, 27 & 117);
               } else {
                  if (var2 == (1 ^ 3)) {
                     this.y[var2].setBounds(544, 200, 51, 17);
                  }

                  var4 = this;
               }

               var4.add(this.y[var2++]);
            }

            JLabel[] var7 = new JLabel[--4];
            var10003 = true;
            this.iv = var7;

            for(var10000 = var2 = 3 & 4; var10000 < this.iv.length; var10000 = var2) {
               JLabel[] var9 = this.iv;
               int var10002 = 2 & 5;
               int var12 = 2 & 5;
               Color var13;
               int var14;
               if (var2 == 0) {
                  var13 = Color.white;
                  var14 = var2;
               } else if (var2 == (4 ^ 5)) {
                  var13 = Color.yellow;
                  var14 = var2;
               } else {
                  var13 = Color.black;
                  var14 = var2;
               }

               var9[var2] = Class133.b(var12, var12, var10002, var12, var13, var14 >= 0 && var2 <= --1 ? Class681.ce : Class681.ak);
               this.iv[var2].setText(var2 == 0 ? "品质" : (var2 == --1 ? "初品" : (var2 == --2 ? "等级" : (var2 == --3 ? "玄蕴" : ""))));
               if (var2 == 0) {
                  var4 = this;
                  this.iv[var2].setBounds(140, 230, 40, 16);
               } else if (var2 == --1) {
                  var4 = this;
                  this.iv[var2].setBounds(176, 230, 40, 16);
               } else if (var2 == (1 ^ 3)) {
                  var4 = this;
                  this.iv[var2].setBounds(84, 265, 46, 20);
               } else {
                  if (var2 == --3) {
                     this.iv[var2].setBounds(84, 290, 46, 20);
                  }

                  var4 = this;
               }

               var4.add(this.iv[var2++]);
            }

            Class245[] var8 = new Class245[--5];
            var10003 = true;
            this.rp = var8;

            for(var10000 = var2 = 3 ^ 3; var10000 < this.rp.length; var10000 = var2) {
               this.rp[var2] = Class133.a(2 & 5, 2 & 5, 2 & 5, 2 & 5, var2 == --1 ? 5 >> 3 : 10, Color.white, Class681.ce);
               if (var2 >= 0 && var2 <= (3 & 5)) {
                  this.rp[var2].eq(Class511.q("sc/d/17.png", --3, --3, --3, --3, (boolean)(3 >> 2)));
                  if (var2 == 0) {
                     this.rp[var2].setBounds(126, 265, 148, 20);
                     var4 = this;
                  } else {
                     this.rp[var2].setBounds(126, 290, 148, 20);
                     var4 = this;
                  }
               } else {
                  this.rp[var2].setFont(Class681.ak);
                  this.rp[var2].setForeground(Class681.c("#c535441"));
                  this.rp[var2].setText(var2 == 5 >> 1 ? "玄宝技能" : (var2 == --3 ? "玄印" : (var2 == --4 ? "玄宝印鸣技能" : "")));
                  this.rp[var2].eq(Class511.q("sc/music/244.a", 5 >> 3, 5 >> 3, 5 >> 3, 5 >> 3, (boolean)(2 & 5)));
                  if (var2 == 5 >> 1) {
                     var4 = this;
                     this.rp[var2].setBounds(292, 42, 188, 24);
                  } else if (var2 == 3) {
                     var4 = this;
                     this.rp[var2].setBounds(292, 196, 188, 24);
                  } else {
                     if (var2 == 4) {
                        this.rp[var2].setBounds(292, 275, 188, 24);
                     }

                     var4 = this;
                  }
               }

               var4.add(this.rp[var2++]);
            }

            Class44[] var10 = new Class44[5];
            var10003 = true;
            this.baq = var10;

            for(var10000 = var2 = 5 >> 3; var10000 < this.baq.length; var10000 = var2) {
               this.baq[var2] = new Class44(Class300.this.gk());
               this.baq[var2].ab(1);
               this.baq[var2].gt(false);
               this.baq[var2].setBounds(295 + var2 * 40, 230, 36, 36);
               this.add(this.baq[var2++]);
            }

            this.bw = new RichLabel("", Class681.ce);
            this.acv = new RichLabel("", Class681.ce);
            this.bar = new Class167(Class511.q("sc/e/192.png", 8, 8, 8, 8, false), Class133.f(0, 0, 0, 0, this.bw, 0));
            this.bar.setBounds(295, 70, 300, 120);
            this.add(this.bar);
            this.bas = new Class167(Class511.q("sc/e/192.png", 8, 8, 8, 8, false), Class133.f(0, 0, 0, 0, this.acv, 0));
            this.bas.setBounds(295, 302, 300, 140);
            this.add(this.bas);
            Class436[] var11 = new Class436[3];
            var10003 = true;
            this.pv = var11;

            for(var10000 = var2 = 0; var10000 < this.pv.length; var10000 = var2) {
               this.pv[var2] = new Class436();
               if (var2 == 0) {
                  var4 = this;
                  this.pv[var2].setBounds(120, 82, 120, 120);
               } else if (var2 == 1) {
                  var4 = this;
                  this.pv[var2].fw("sc/music/242.a");
                  this.pv[var2].setBounds(84, 46, 192, 204);
               } else {
                  if (var2 == 2) {
                     this.pv[var2].fw("sc/music/243.a");
                     this.pv[var2].setBounds(284, 44, 4, 276);
                  }

                  var4 = this;
               }

               var4.add(this.pv[var2++]);
            }

         }
      };
      this.ayw.setBounds(5 >> 3, 5 >> 3, 638, 475);
      this.add(this.ayw);
      this.aue = new Class436();
      this.aue.eq(Class511.q("sc/d/19.png", --5, --5, --5, --5, (boolean)(3 >> 2)));
      this.aue.setBounds(83, 328, 513, 105);
      this.add(this.aue);
      Class216[] var5 = new Class216[var10001];
      var10003 = true;
      this.ayx = var5;

      for(var10000 = var2 = 3 ^ 3; var10000 < this.ayx.length; var10000 = var2) {
         this.ayx[var2] = new Class216(var2 == 0 ? "sc/e/42.png" : "sc/e/43.png", 1, var2, this);
         this.ayx[var2].setBounds(var2 == 0 ? 554 : 576, 438, 18, 18);
         this.add(this.ayx[var2++]);
      }

      this.ayz = new Class197(this, 10, --2, 51, 51, 2 & 5, 2 & 5, 84, 330);
      this.ayz.hf(Class511.a("sc/d/18.png"));
      this.ayz.aiw(this.ayx, --1);
      this.add(this.ayz);
      this.r = new Class436();
      this.r.eq(Class511.q("sc/d/36.png", 30, 30, 30, 30, (boolean)(3 >> 2)));
      this.r.setBounds(72, 36, 536, 288);
      this.add(this.r);
   }

   public void aof(String var1, Class659 var2) {
      if (this.ayz != null) {
         Class300 var10000;
         if (var1.equals(" 所有")) {
            var10000 = this;
            this.ayz.bbf[2 & 5] = 2 & 5;
         } else if (var1.equals(" 通用")) {
            var10000 = this;
            this.ayz.bbf[3 >> 2] = --1;
         } else if (var1.equals(" 人族")) {
            var10000 = this;
            this.ayz.bbf[2 & 5] = 1 ^ 3;
         } else if (var1.equals(" 魔族")) {
            var10000 = this;
            this.ayz.bbf[3 >> 2] = --3;
         } else if (var1.equals(" 仙族")) {
            var10000 = this;
            this.ayz.bbf[2 & 5] = --4;
         } else if (var1.equals(" 鬼族")) {
            var10000 = this;
            this.ayz.bbf[2 & 5] = --5;
         } else if (var1.equals(" 龙族")) {
            var10000 = this;
            this.ayz.bbf[3 ^ 3] = 46 & 87;
         } else if (var1.equals(" 类型")) {
            var10000 = this;
            this.ayz.bbf[--1] = 3 >> 2;
         } else if (var1.equals(" 攻击")) {
            var10000 = this;
            this.ayz.bbf[3 & 5] = 3 & 5;
         } else if (var1.equals(" 防御")) {
            var10000 = this;
            this.ayz.bbf[3 & 5] = 1 ^ 3;
         } else if (var1.equals(" 辅助")) {
            var10000 = this;
            this.ayz.bbf[3 >> 1] = --3;
         } else if (var1.equals(" 品质")) {
            var10000 = this;
            this.ayz.bbf[5 >> 1] = 3 & 4;
         } else if (var1.equals(" 初品")) {
            var10000 = this;
            this.ayz.bbf[1 ^ 3] = 4 ^ 5;
         } else if (var1.equals(" 中品")) {
            var10000 = this;
            this.ayz.bbf[1 ^ 3] = 1 ^ 3;
         } else {
            if (var1.equals(" 珍品")) {
               this.ayz.bbf[--2] = --3;
            }

            var10000 = this;
         }

         var10000.ayz.au(3 & 4);
      }
   }

   public void fr(Class44 var1) {
      if (this.ayv.isVisible()) {
         if (this.aej.getBattleScene() != null) {
            this.aej.f("战斗中无法操作");
            return;
         }

         int var2;
         for(int var10000 = var2 = 0; var10000 < this.ayv.ct.length; var10000 = var2) {
            if (this.ayv.ct[var2] == var1) {
               if (this.vd().goodChoses[(15 & 127) + var2] != null) {
                  if (this.vd().getGoodPackSum(-1L, new BigDecimal(-4 >> 2), 2 ^ 3) <= 0) {
                     this.aej.fw("你背包已满");
                     return;
                  }

                  StringBuffer var3;
                  (var3 = new StringBuffer()).append("EXB-");
                  var3.append(this.vd().goodChoses[(15 & 127) + var2]);
                  String var4 = Agreement.getSendTextAES("rolechange", var3.toString());
                  this.uw().d(var4);
               }

               return;
            }

            ++var2;
         }
      }

   }

   public void ax(Goodstable var1) {
      if (this.ayv.isVisible()) {
         if (this.aej.getBattleScene() != null) {
            this.aej.f("战斗中无法操作");
            return;
         }

         StringBuffer var2 = new StringBuffer();
         var2.append("EXB");
         if (var1.getStatus() == 3 >> 1) {
            var2.append("-");
            var2.append(var1.getRgid());
         } else {
            var2.append(var1.getRgid());
         }

         String var3 = Agreement.getSendTextAES("rolechange", var2.toString());
         this.uw().d(var3);
      }

   }


   static Image aog() {
      return kx;
   }


   static Image qa() {
      return ayu;
   }

   public boolean t() {
      this.ly((Goodstable)null);
      return super.t();
   }


   static Image ga() {
      return ll;
   }

   public void d() {
      int var10000;
      int var1;
      for(var10000 = var1 = 2 & 5; var10000 < this.ayv.ad.length; var10000 = var1) {
         this.ayv.ad[var1++].setText((String)null);
      }

      var10000 = 5 >> 3;
      this.ayv.gi.setTextSize("", 25503 & 7414);

      for(var1 = var10000; var10000 < this.ayv.akw.length; var10000 = var1) {
         this.ayv.akw[var1++].setVisible((boolean)(3 ^ 3));
      }

      var10000 = 3 & 4;
      this.ayw.aza.df((String[])null);
      this.ayw.iv[2 ^ 3].setText((String)null);
      this.ayw.rp[5 >> 3].setText((String)null);
      this.ayw.rp[--1].setText((String)null);
      this.ayw.pv[5 >> 3].q();

      for(var1 = var10000; var10000 < this.ayw.baq.length; var10000 = var1) {
         this.ayw.baq[var1].c(3 >> 2, (Object)null);
         this.ayw.baq[var1++].d();
      }

      this.ayw.bw.setTextSize("", 9215 & 23822);
      this.ayw.acv.setTextSize("", 30479 & 2558);
   }
}
