package com.xy;

import com.xy.bean.LoginResult;
import com.xy.formula.BaseMeridians;
import com.xy.formula.BaseSkillData;
import com.xy.formula.SkillUtil;
import com.xy.game.RoleData;
import com.xy.readbean.Skill;
import com.xy.richtext.RichLabel;
import com.xy.text.GameView;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JLabel;

public class Class638 extends Class345 {
   private Class70 acg;
   private <undefinedtype>[] aph;
   private Class604 ip;

   public Class638(GameView var1) {
      int var10001 = --3;
      int var10003 = 3 >> 2;
      super(-4 >> 2, -4 >> 2, Class345.aei, var1);
      this.va(var10003, 3 ^ 3, 26238 & 7131, 31723 & 1469, Class345.aei);
      <undefinedtype>[] var3 = new <undefinedtype>[var10001];
      boolean var4 = true;
      this.aph = var3;

      int var2;
      for(int var10000 = var2 = 3 & 4; var10000 < this.aph.length; var10000 = var2) {
         this.aph[var2] = new Class436(var2) {
            private JLabel[] er;
            private int gw;
            private RichLabel q;
            private boolean lb;
            private Class436 av;
            private Class70 akq;
            private <undefinedtype>[] awu;

            public {
               int var10001 = --3;
               this.gw = var2;
               this.q = new RichLabel((String)null, Class681.ab);
               this.add(this.q);
               JLabel[] var5 = new JLabel[var10001];
               boolean var10003 = true;
               this.er = var5;

               int var10000;
               int var3;
               for(var10000 = var3 = 3 ^ 3; var10000 < this.er.length; var10000 = var3) {
                  this.er[var3] = Class133.c(5 >> 3, 5 >> 3, 5 >> 3, 5 >> 3, 3 ^ 3, Class681.c(var3 == 0 ? "#cFBD833" : "#c000000"), Class681.h);
                  <undefinedtype> var4;
                  if (var3 == 0) {
                     var4 = this;
                     this.er[var3].setBounds(2 & 5, 15 & 125, 27882 & 5055, 90 & 63);
                  } else if (var3 == 5 >> 2) {
                     var4 = this;
                     this.er[var3].setBounds(-4 >> 2, 14 & 125, 24575 & 8362, 63 & 90);
                  } else {
                     if (var3 == --2) {
                        this.er[var3].setBounds(--1, 110 & 31, 10671 & 22266, 122 & 31);
                     }

                     var4 = this;
                  }

                  var4.add(this.er[var3++]);
               }

               var10001 = 5 >> 1;
               this.av = new Class436();
               this.av.eq(Class511.q("sc/d/60.png", 79 & 124, 1 ^ 3, 79 & 124, 5 >> 1, (boolean)(3 & 4)));
               this.av.setBounds(--4, 43 & 127, 26534 & 6393, 7 & 127);
               this.add(this.av);
               <undefinedtype>[] var6 = new <undefinedtype>[var10001];
               var10003 = true;
               this.awu = var6;

               for(var10000 = var3 = 3 >> 2; var10000 < this.awu.length; var10000 = var3) {
                  this.awu[var3] = new Class436() {
                     private JLabel[] c;
                     // $FF: synthetic field
                     final Class638 ajy;
                     private Class44 ahi;
                     private Class436[] an;
                     private Class70 hb;

                     public void abk(boolean var1, boolean var2) {
                        this.c[5 >> 1].setVisible(var1);
                        this.an[2 & 5].setVisible(var1);
                        this.an[--1].setVisible(var1);
                        this.hb.ab(var2 ? 95 & 127 : 96);
                        this.hb.setVisible(var1);
                        if (var1) {
                           this.setBounds(--4, (18063 & 14839) + (var2 ? 3 & 4 : 82), 22007 & 10920, 113 & 94);
                        } else {
                           this.setBounds(--4, (13007 & 19895) + (var2 ? 3 & 4 : 56), 21413 & 11514, 54 & 127);
                        }
                     }

                     public void abl(int var1, int var2, int var3, boolean var4, boolean var5) {
                        Class603 var10000 = this.ajy.vc();
                        int var10001;
                        int var10002;
                        if (var5) {
                           var10001 = 16372 & 28395;
                           var10002 = var1;
                        } else {
                           var10001 = 12500;
                           var10002 = var1;
                        }

                        Skill var9 = var10000.bf(String.valueOf(var10001 + var10002));
                        BaseSkillData var6 = new BaseSkillData(var9);
                        var6.setSld(var2);
                        var6.setSldMax(var3);
                        this.c[3 & 4].setText(var9.getSkillname());
                        this.c[--1].setText(var5 ? "主动技能" : "被动技能");
                        this.c[1 ^ 3].setText(var2 + "/" + var3);
                        double var7;
                        <undefinedtype> var10;
                        if ((var7 = (double)var2 / (double)var3) <= 0.0D) {
                           var10 = this;
                           this.an[5 >> 3].setBounds(79 & 62, 127 & 55, 2 & 5, 79 & 58);
                        } else if (var7 >= 1.0D) {
                           this.an[3 ^ 3].setBounds(46 & 95, 55 & 127, 116 & 107, 31 & 106);
                           var10 = this;
                        } else {
                           this.an[3 ^ 3].setBounds(62 & 79, 119 & 63, (int)(var7 * 96.0D), 15 & 122);
                           var10 = this;
                        }

                        var10.ahi.c(108 & 31, var6);
                        this.abk(var4, var5);
                     }

                     public {
                        int var10001 = --3;
                        this.ajy = var1;
                        super();
                        JLabel[] var5 = new JLabel[var10001];
                        boolean var10003 = true;
                        this.c = var5;

                        int var2;
                        <undefinedtype> var4;
                        int var10000;
                        for(var10000 = var2 = 3 >> 2; var10000 < this.c.length; var10000 = var2) {
                           JLabel[] var3 = this.c;
                           int var10002 = 3 >> 2;
                           int var10004 = 3 >> 2;
                           int var10006;
                           int var10007;
                           if (var2 == --2) {
                              var10006 = 3 & 4;
                              var10007 = var2;
                           } else {
                              var10006 = 10;
                              var10007 = var2;
                           }

                           var3[var2] = Class133.c(var10004, var10004, var10002, var10004, var10006, Class681.c(var10007 == 1 ? "#c999999" : "#cFFFFFF"), var2 == 0 ? Class681.bu : (var2 == (4 ^ 5) ? Class681.ab : Class681.bm));
                           if (var2 == 0) {
                              var4 = this;
                              this.c[var2].setBounds(63 & 121, 24 & 111, 90 & 117, 114 & 31);
                           } else if (var2 == --1) {
                              var4 = this;
                              this.c[var2].setBounds(125 & 59, 95 & 59, 92 & 115, 58 & 87);
                           } else {
                              if (var2 == 5 >> 1) {
                                 this.c[var2].setBounds(29 & 110, 52 & 127, 119 & 108, 14 & 127);
                              }

                              var4 = this;
                           }

                           var4.add(this.c[var2++]);
                        }

                        Class436[] var6 = new Class436[5 >> 1];
                        var10003 = true;
                        this.an = var6;

                        for(var10000 = var2 = 3 >> 2; var10000 < this.an.length; var10000 = var2) {
                           this.an[var2] = new Class436();
                           this.an[var2].eq(Class511.q(var2 == 0 ? "sc/d/65.png" : "sc/d/17.png", 3, 3, 3, 3, (boolean)(3 >> 2)));
                           if (var2 == 0) {
                              var4 = this;
                              this.an[var2].setBounds(94 & 47, 63 & 119, 121 & 102, 90 & 47);
                           } else {
                              if (var2 == (4 ^ 5)) {
                                 this.an[var2].setBounds(12, 53, 100, 14);
                              }

                              var4 = this;
                           }

                           var4.add(this.an[var2++]);
                        }

                        this.ahi = new Class44(var1.gk());
                        this.ahi.setBounds(15, 12, 30, 30);
                        this.add(this.ahi);
                        this.hb = new Class70("sc/e/6.png", --1, 3 >> 2, Class681.bm, (Color[])null, "修炼", var1.gk());
                        this.hb.setOffsetTexts(Class681.am);
                        this.hb.setBounds(116, 52, 34, 18);
                        this.add(this.hb);
                     }
                  };
                  this.awu[var3].eq(Class511.q("sc/d/49.png", 78 & 55, 78 & 55, 78 & 55, 78 & 55, (boolean)(3 >> 2)));
                  this.add(this.awu[var3++]);
               }

               this.akq = new Class70("sc/e/31.png", 3 & 5, (126 & 93) + var2, Class681.ak, (Color[])null, "选 定", Class638.this.gk());
               this.akq.setForeground(Color.black);
               this.akq.setBounds(45 & 127, 260, 79, 25);
               this.add(this.akq);
            }

            public void ama(int var1, int var2, int var3, BaseMeridians var4) {
               this.lb = this.gw != var1 && var1 != -4 >> 2;
               this.akq.setVisible((boolean)(var1 == -4 >> 2 ? --1 : 0));
               var2 = SkillUtil.getFMIndex(var2, this.gw);
               this.er[5 >> 3].setText(SkillUtil.getFMType(var2));
               this.er[2 ^ 3].setText(this.er[3 ^ 3].getText());
               this.er[1 ^ 3].setText(this.er[3 & 4].getText());
               this.q.setTextSize(SkillUtil.getFMMsg(var2), 16095 & 16822);
               this.q.setBounds(95 & 46, 125 & 54, this.q.getWidth(), this.q.getHeight());
               <undefinedtype> var10000 = this.awu[5 >> 3];
               int var10002;
               int var10003;
               if (var4 != null) {
                  var10002 = var4.getExp();
                  var10003 = var3;
               } else {
                  var10002 = 0;
                  var10003 = var3;
               }

               var10000.abl(var2, var10002, var10003, (boolean)(this.gw == var1 ? 3 >> 1 : 0), true);
               var10000 = this.awu[2 ^ 3];
               if (var4 != null) {
                  var10002 = var4.getXs();
                  var10003 = var3;
               } else {
                  var10002 = 0;
                  var10003 = var3;
               }

               var10000.abl(var2, var10002, var10003, (boolean)(this.gw == var1 ? 2 ^ 3 : 0), false);
            }

            protected void paintChildren(Graphics var1) {
               super.paintChildren(var1);
               if (this.lb) {
                  if (Class638.this.ip == null) {
                     Class638.this.ip = Class511.q("sc/d/17.png", --3, --3, --3, --3, (boolean)(3 >> 2));
                  }

                  Graphics2D var2 = (Graphics2D)var1;
                  var2.setComposite(Class8.n);
                  var2.setColor(Color.BLACK);
                  Class638.this.ip.g(var2, this.getWidth(), this.getHeight());
                  var2.setComposite(Class8.g);
               }
            }
         };
         this.aph[var2].eq(Class511.q("sc/d/17.png", --3, --3, --3, --3, (boolean)(3 >> 2)));
         this.aph[var2].setBounds((115 & 60) + var2 * (20662 & 12281), 127 & 63, 31979 & 958, 29102 & 3965);
         this.add(this.aph[var2++]);
      }

      this.acg = new Class70("sc/e/6.png", 2 ^ 3, 123 & 95, Class681.bm, (Color[])null, "重置", this);
      this.acg.setOffsetTexts(Class681.am);
      this.acg.setBounds(1887 & 31415, 6520 & 26623, 115 & 46, 22 & 123);
      this.add(this.acg);
   }

   public void d() {
      RoleData var1;
      if ((var1 = this.vd()) != null) {
         LoginResult var6 = var1.getLoginResult();
         BaseMeridians var2;
         int var5 = (var2 = var1.getRoleProperty().getMeridians(3 >> 2)) != null && var2.getKey() != null ? Integer.parseInt(var2.getKey()) - --1 : -1;
         int var7 = SkillUtil.getSepciesIndex(var6.getSpecies_id());
         int var4 = SkillUtil.getFMMax(var6.getGrade(), this.uw());

         int var3;
         for(int var9 = var3 = 3 ^ 3; var9 < this.aph.length; var9 = var3) {
            <undefinedtype> var10 = this.aph[var3];
            ++var3;
            var10.ama(var5, var7, var4, var2);
         }

      }
   }
}
