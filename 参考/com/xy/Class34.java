package com.xy;

import com.xy.bean.RoleShow;
import com.xy.formula.SkillUtil;
import com.xy.readbean.Activity;
import com.xy.readbean.ActivityFC;
import com.xy.readbean.BWDHRule;
import com.xy.scene.BWDHRuleBattle;
import com.xy.scene.BWDHTeam;
import com.xy.socket.Agreement;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.ImageObserver;
import javax.swing.JLabel;

public class Class34 extends Class345 {
   private Class436 ec;
   private Class8 awf;
   private int ay;
   private <undefinedtype>[] awg;
   private long lp;
   private Class94 awh;
   private Class456[] awi;


   static Class8 alq(Class34 var0) {
      return var0.awf;
   }

   public void alr(int var1, BWDHRuleBattle[] var2) {
      this.c(3 & 5, var2);
      ((<undefinedtype>)this.awi[3 >> 1]).b.fa().setText(var1 == 0 ? "A组" : (var1 == --1 ? "B组" : (var1 == --2 ? "C组" : "D组")));
   }

   public void uq(BWDHTeam var1) {
      if (this.ay == 0) {
         ((<undefinedtype>)this.awi[3 >> 2]).uq(var1);
      }

   }

   public void y(int var1) {
      if (Class280.f() - this.lp < (long)(Class280.i * --5)) {
         this.aej.f("你点击的太快了");
      } else {
         this.lp = Class280.f();
         Activity var2 = this.awh.kd();
         String var3 = Agreement.getSendTextAES("activity", var2.getId() + "|R3#" + var1);
         this.uw().d(var3);
      }
   }

   public void wy(int var1, Object var2) {
      if (var1 != (445 & 32463) && var1 != (10751 & 22158) && var1 != (22687 & 10223)) {
         if (var1 == (29143 & 3770)) {
            ((<undefinedtype>)this.awi[4 ^ 5]).c(var1, var2);
         }

      } else {
         ((<undefinedtype>)this.awi[2 & 5]).c(var1, var2);
      }
   }

   public void s() {
      if (Class280.f() - this.lp >= (long)(Class280.i * --5)) {
         this.lp = Class280.f();
         Activity var1;
         int var2;
         ActivityFC var3 = (var2 = Class394.an((var1 = this.awh.kd()).getActivitySet(), "赛制设置=", "|")) > 0 ? this.vc().m(var2) : null;
         BWDHRule var5 = var3 != null && var3.getType() == --5 ? (BWDHRule)var3.getData() : null;

         int var6;
         for(int var10000 = var6 = 2 & 5; var10000 < this.awg.length; var10000 = var6) {
            <undefinedtype> var7 = this.awg[var6];
            Point[] var10001;
            Activity var10002;
            if (var5 != null) {
               var10001 = var5.getRuleTimes(--2 + var6);
               var10002 = var1;
            } else {
               var10001 = null;
               var10002 = var1;
            }

            var7.ik(var10001, var10002);
            ++var6;
         }

         var6 = var5 != null ? var5.getRuleIndex((Class280.f() - var1.getTimeOpen()) / 1000L) : 0;
         var6 = Math.max(Math.min(var6 - (5 >> 1), --3), 2 & 5);
         String var4 = Agreement.getSendTextAES("activity", var1.getId() + "|R" + (var6 + (1 ^ 3)));
         this.uw().d(var4);
      }
   }

   public void d() {
      this.awf = null;
      if (this.awi[2 & 5] != null) {
         ((<undefinedtype>)this.awi[5 >> 3]).uq((BWDHTeam)null);
      }

   }

   public Class34(Class94 var1) {
      int var10001 = --4;
      int var10005 = 2 & 5;
      super(-4 >> 2, -4 >> 2, Class345.aei, var1.aej);
      this.awf = null;
      this.va(var10005, 3 >> 2, 7134 & 26351, 14990 & 18303, Class345.aei);
      this.awh = var1;
      <undefinedtype>[] var3 = new <undefinedtype>[var10001];
      boolean var10003 = true;
      this.awg = var3;

      int var2;
      for(int var10000 = var2 = 3 & 4; var10000 < this.awg.length; var10000 = var2) {
         this.awg[var2] = new MouseListener(var2) {
            private JLabel bd;
            private boolean lb;
            private JLabel ir;
            private int cy;

            public void mousePressed(MouseEvent var1) {
            }

            public void mouseReleased(MouseEvent var1) {
            }

            public void mouseExited(MouseEvent var1) {
            }

            public void mouseClicked(MouseEvent var1) {
               if (!Class280.j()) {
                  Activity var2 = Class34.this.awh.kd();
                  String var3 = Agreement.getSendTextAES("activity", var2.getId() + "|R" + (this.cy + (1 ^ 3)));
                  Class34.this.uw().d(var3);
               }
            }

            public boolean ij(boolean var1) {
               if (var1 == this.lb) {
                  return (boolean)(3 >> 2);
               } else {
                  this.lb = var1;
                  if (var1) {
                     this.bd.setForeground(Color.white);
                     this.ir.setForeground(Color.white);
                     this.bd.setBounds(3 & 4, --4, 1742 & 31167, 54 & 93);
                     this.ir.setBounds(2 & 5, 30 & 115, 27567 & 5342, 119 & 28);
                  } else {
                     this.bd.setForeground(Class681.c("#c462803"));
                     this.ir.setForeground(Class681.c("#c462803"));
                     this.bd.setBounds(121 & 46, --3, 125 & 95, 124 & 23);
                     this.ir.setBounds(104 & 63, 89 & 55, 125 & 95, 119 & 28);
                  }

                  return true;
               }
            }

            public void im(String var1) {
               if (!Class394.r(var1, this.ir.getText())) {
                  this.ir.setText(var1);
               }
            }

            public void ik(Point[] var1, Activity var2) {
               if (var1 == null) {
                  this.im("00.00-00.00");
               } else {
                  long var3 = var2.getTimeOpen() + (long)var1[3 >> 2].x * 1000L;
                  long var5 = var2.getTimeOpen() + (long)var1[var1.length - --1].y * 1000L;
                  this.im(Class280.c(var3, "MM.dd") + "-" + Class280.c(var5, "MM.dd"));
               }
            }

            public void mouseEntered(MouseEvent var1) {
            }

            public {
               int var10004 = 123 & 44;
               int var10006 = 41 & 126;
               this.cy = var2;
               this.bd = Class133.b(var10006, --3, 127 & 93, 117 & 30, Class681.c("#c462803"), Class681.ak);
               this.ir = Class133.b(var10004, 29 & 115, 95 & 125, 61 & 86, Class681.c("#c462803"), Class681.bm);
               this.bd.setHorizontalAlignment(3 >> 2);
               this.ir.setHorizontalAlignment(3 ^ 3);
               this.bd.setText(var2 == 0 ? "积分赛" : (var2 == (3 & 5) ? "入围赛" : (var2 == (1 ^ 3) ? "半决赛" : "总决赛")));
               this.add(this.bd);
               this.add(this.ir);
               this.addMouseListener(this);
            }
         };
         this.awg[var2].fw("sc/d/131.png");
         this.awg[var2].setBounds((127 & 47) + var2 * (93 & 127), 117 & 62, 32493 & 414, 121 & 46);
         this.add(this.awg[var2++]);
      }

      var10001 = --3;
      this.ec = new Class436(Class511.q("sc/d/132.png", 51 & 126, 51 & 126, 51 & 126, 51 & 126, (boolean)(3 ^ 3)));
      this.ec.setBounds(41 & 127, 95 & 120, 22119 & 11263, 16255 & 16888);
      this.add(this.ec);
      Class456[] var4 = new Class456[var10001];
      var10003 = true;
      this.awi = var4;
   }

   public void c(int var1, Object var2) {
      int var10000 = 2 & 5;
      this.ay = var1;

      int var3;
      for(var3 = var10000; var10000 < this.awg.length; var10000 = var3) {
         if (this.awg[var3].ij((boolean)(var3 == this.ay ? 2 ^ 3 : 0))) {
            this.awg[var3].fw(this.awg[var3].lb ? "sc/d/130.png" : "sc/d/131.png");
         }

         <undefinedtype> var4 = this.awg[var3];
         int var10001 = (var3 >= this.ay ? 61 & 123 : 47) + 93 * var3;
         int var10002;
         Class34 var10003;
         if (this.awg[var3].lb) {
            var10002 = 119 & 59;
            var10003 = this;
         } else {
            var10002 = 52;
            var10003 = this;
         }

         int var6 = var10003.awg[var3].lb ? 3310 & 29599 : 140;
         ++var3;
         var4.setBounds(var10001, var10002, var6, 40);
      }

      Class34 var5;
      if (this.ay == 0) {
         if (this.awi[3 & 4] == null) {
            this.add(this.awi[3 >> 2] = new Class456() {
               private int br;
               private Class379[] adn;
               private <undefinedtype>[] ado;
               private Class436 ec;
               private Class436 et;
               private Class226[] adp;
               private int j;
               private Class379[] bk;
               private BWDHTeam[] adq;

               public void q() {
                  int var1 = 2 & 5;
                  int var2 = this.j * this.bk.length;

                  for(int var10000 = var1; var10000 < this.bk.length; ++var2) {
                     BWDHTeam var3 = this.adq != null && var2 < this.adq.length ? this.adq[var2] : null;
                     if (var3 != null) {
                        this.bk[var1].setKeep((boolean)(this.br == var3.getId() ? 3 & 5 : 0));
                     }

                     ++var1;
                     var10000 = var1;
                  }

               }

               public void oe(BWDHTeam[] var1) {
                  int var10001 = 3 ^ 3;
                  this.adq = var1;
                  this.ab(var10001);
               }

               public void uq(BWDHTeam var1) {
                  this.br = var1 != null ? var1.getId() : 0;
                  int var10000;
                  if (var1 == null) {
                     int var6;
                     for(var10000 = var6 = 2 & 5; var10000 < this.ado.length; var10000 = var6) {
                        this.ado[var6++].le((RoleShow)null);
                     }

                     Class226 var11 = this.adp[4 ^ 5];
                     String[] var10 = new String[--4];
                     boolean var10003 = true;
                     var10[2 & 5] = "队";
                     var10[4 ^ 5] = "伍";
                     var10[1 ^ 3] = "名";
                     var10[--3] = "称";
                     var11.df(var10);
                     this.q();
                  } else {
                     BWDHTeam var2;
                     if ((var2 = this.ur(var1.getId())) == null) {
                        this.uq((BWDHTeam)null);
                     } else {
                        var1.setName(var2.getName());
                        RoleShow[] var5 = var1.getRoleShows();

                        int var3;
                        for(var10000 = var3 = 5 >> 3; var10000 < this.ado.length; var10000 = var3) {
                           RoleShow var4 = var3 < var5.length ? var5[var3] : null;
                           this.ado[var3++].le(var4);
                        }

                        String[] var9 = new String[var1.getName().length()];
                        boolean var10002 = true;
                        String[] var7 = var9;

                        int var8;
                        for(var10000 = var8 = 3 & 4; var10000 < var7.length; var10000 = var8) {
                           String var12 = var1.getName();
                           int var10001 = var8;
                           var12 = var12.substring(var8, var8 + (3 & 5));
                           ++var8;
                           var7[var10001] = var12;
                        }

                        this.adp[2 ^ 3].df(var7);
                        this.q();
                     }
                  }
               }

               public {
                  int var10001 = --3;
                  int var10003 = 2 & 5;
                  this.setBounds(var10003, 3 & 4, 6110 & 27375, 14335 & 18958);
                  Class379[] var5 = new Class379[var10001];
                  boolean var10 = true;
                  this.adn = var5;

                  int var2;
                  <undefinedtype> var4;
                  int var10000;
                  for(var10000 = var2 = 3 >> 2; var10000 < this.adn.length; var10000 = var2) {
                     this.adn[var2] = new Class379(var2 == 0 ? "sc/e/156.png" : "sc/e/155.png", 1, (14813 & 18095) + var2, Class34.this.gk());
                     if (var2 == 0) {
                        var4 = this;
                        this.adn[var2].setBounds(125 & 78, 14519 & 18398, 31 & 114, 91 & 61);
                     } else {
                        if (var2 == (3 & 5)) {
                           this.adn[var2].setBounds(11895 & 21503, 8598 & 24319, 127 & 18, 121 & 31);
                        }

                        var4 = this;
                     }

                     var4.add(this.adn[var2++]);
                  }

                  Class226[] var6 = new Class226[1 ^ 3];
                  var10 = true;
                  this.adp = var6;

                  for(var10000 = var2 = 2 & 5; var10000 < this.adp.length; var10000 = var2) {
                     int var10002 = --4;
                     String[] var7;
                     boolean var9;
                     if (var2 == 0) {
                        var7 = new String[var10002];
                        var9 = true;
                        var7[3 >> 2] = "点";
                        var7[5 >> 2] = "击";
                        var7[1 ^ 3] = "查";
                        var7[--3] = "看";
                     } else {
                        var7 = new String[var10002];
                        var9 = true;
                        var7[3 ^ 3] = "队";
                        var7[3 & 5] = "伍";
                        var7[5 >> 1] = "名";
                        var7[--3] = "称";
                     }

                     String[] var3 = var7;
                     this.adp[var2] = new Class226((String)null, -4 >> 2, 3 >> 2, Class681.cm, (Color[])null, var3, Class34.this.gk());
                     this.adp[var2].setForeground(Class681.c("#c7D6120"));
                     if (var2 == 0) {
                        var4 = this;
                        this.adp[var2].setBounds(62 & 123, 124 & 127, 125 & 22, 120 & 127);
                     } else {
                        if (var2 == 3 >> 1) {
                           this.adp[var2].setBounds(123 & 62, 278, 20, 120);
                        }

                        var4 = this;
                     }

                     var4.adp[var2].ad(new Class116(3 >> 1, 20, 5 >> 3, 5 >> 3));
                     this.add(this.adp[var2++]);
                  }

                  var5 = new Class379[16];
                  var10 = true;
                  this.bk = var5;

                  for(var10000 = var2 = 3 >> 2; var10000 < this.bk.length; var10000 = var2) {
                     this.bk[var2] = new Class379("sc/e/163.png", 1 ^ 3, 143, Class681.bu, Class681.c, "", Class34.this.gk());
                     this.bk[var2].setBounds(94 + var2 % --4 * 138, 109 + var2 / --4 * 27, 121, 27);
                     this.add(this.bk[var2++]);
                  }

                  <undefinedtype>[] var8 = new <undefinedtype>[--5];
                  var10 = true;
                  this.ado = var8;

                  for(var10000 = var2 = 3 >> 2; var10000 < this.ado.length; var10000 = var2) {
                     this.ado[var2] = new Class456() {
                        private Class436 et;
                        private JLabel bd;
                        private Class436 r;
                        // $FF: synthetic field
                        final Class34 ahw;
                        private Class19 qp;
                        private RoleShow ahx;

                        protected void paintChildren(Graphics var1) {
                           super.paintChildren(var1);
                           if (this.ahx != null) {
                              if (Class34.alq(this.ahw) == null) {
                                 Class34.alt(this.ahw, Class330.q(Class222.m("long")));
                              }

                              if (Class34.alq(this.ahw) != null) {
                                 Class34.alq(this.ahw).d(Class280.l(), 5 >> 3);
                                 Class34.alq(this.ahw).aa(var1, 87 & 108, 19615 & 13290);
                              }

                              if (this.qp == null) {
                                 this.qp = Class330.ai(this.ahx.getSpecies_id().longValue(), 5 >> 1, 5 >> 2, (String)null);
                              }

                              this.qp.a(var1, 94 & 101, 21423 & 11482, --4, Class280.l());
                           }
                        }

                        public {
                           int var10007 = 103 & 63;
                           this.ahw = var1;
                           super();
                           this.bd = Class133.b(var10007, 13247 & 19691, 109 & 95, 127 & 20, Color.white, Class681.bm);
                           this.bd.setHorizontalAlignment(3 ^ 3);
                           this.r = new Class436();
                           this.et = new Class436("sc/d/139.png");
                           this.r.setBounds(15 & 121, 14503 & 18431, 125 & 31, 125 & 31);
                           this.et.setBounds(3 >> 2, 12799 & 20140, 14991 & 17911, 93 & 54);
                           this.add(this.bd);
                           this.add(this.r);
                           this.add(this.et);
                        }

                        public void le(RoleShow var1) {
                           int var10001;
                           if ((this.ahx = var1) == null) {
                              var10001 = 3 ^ 3;
                              this.qp = null;
                              this.setVisible((boolean)var10001);
                           } else {
                              var10001 = 5 >> 2;
                              this.bd.setText(var1.getRolename());
                              this.r.fw("sc/d/" + ((16559 & 16342) + (SkillUtil.getSepciesIndex(var1.getSpecies_id()) - (4 ^ 5)) / (5 >> 1)) + ".png");
                              this.qp = null;
                              this.setVisible((boolean)var10001);
                           }
                        }
                     };
                     this.ado[var2].setBounds(72 + 108 * var2, 230, 135, 200);
                     this.ado[var2].setVisible((boolean)(3 & 4));
                     this.add(this.ado[var2++]);
                  }

                  this.ec = new Class436("sc/d/133.png");
                  this.ec.setBounds(54, 249, 29, 164);
                  this.add(this.ec);
                  this.et = new Class436(Class511.q("sc/d/66.png", 50, 3 >> 1, 50, --1, (boolean)(2 & 5)));
                  this.et.setBounds(94, 228, 532, 1 ^ 3);
                  this.add(this.et);
               }

               public void c(int var1, Object var2) {
                  int var4;
                  if (var1 != (26367 & 6541) && var1 != (14846 & 18063)) {
                     if (var1 == (12735 & 20175)) {
                        var4 = (Integer)var2;
                        Activity var6 = Class34.this.awh.kd();
                        String var5 = Agreement.getSendTextAES("activity", var6.getId() + "|T" + var4);
                        Class34.this.uw().d(var5);
                     }

                  } else {
                     var4 = this.adq != null ? Math.max((this.adq.length - --1) / this.bk.length, 2 & 5) : 0;
                     int var3 = this.j;
                     int var10000;
                     if (var1 == (17309 & 15599)) {
                        var3 = var3 == 0 ? var4 : var3 - --1;
                        var10000 = var3;
                     } else {
                        if (var1 == (17631 & 15278)) {
                           var3 = var3 == var4 ? 2 & 5 : var3 + --1;
                        }

                        var10000 = var3;
                     }

                     if (var10000 != this.j) {
                        this.ab(var3);
                     }
                  }
               }

               public BWDHTeam ur(int var1) {
                  int var2 = 3 & 4;
                  int var3 = this.adq != null ? this.adq.length : 0;

                  for(int var10000 = var2; var10000 < var3; var10000 = var2) {
                     if (this.adq[var2].getId() == var1) {
                        return this.adq[var2];
                     }

                     ++var2;
                  }

                  return null;
               }

               public void ab(int var1) {
                  int var10000 = 2 & 5;
                  this.j = var1;
                  int var2 = var10000;
                  var1 *= this.bk.length;

                  for(var10000 = var2; var10000 < this.bk.length; ++var1) {
                     BWDHTeam var3 = this.adq != null && var1 < this.adq.length ? this.adq[var1] : null;
                     if (var3 == null) {
                        this.bk[var2].setVisible((boolean)(2 & 5));
                     } else {
                        this.bk[var2].setText(var3.getName());
                        this.bk[var2].setName(String.valueOf(var3.getId()));
                        this.bk[var2].setKeep((boolean)(this.br == var3.getId() ? 3 >> 1 : 0));
                        this.bk[var2].setVisible((boolean)(--1));
                     }

                     ++var2;
                     var10000 = var2;
                  }

               }
            }, 3 & 4);
         }

         ((<undefinedtype>)this.awi[3 >> 2]).oe((BWDHTeam[])var2);
         var5 = this;
      } else if (this.ay == (2 ^ 3)) {
         if (this.awi[4 ^ 5] == null) {
            this.add(this.awi[4 ^ 5] = new Class456() {
               private Class659 b;
               private JLabel[] c;
               private JLabel d;
               private Class436[] e;
               private Class379[] f;
               private Class436[] g;

               public void a(BWDHRuleBattle[] var1) {
                  int var2 = var1.length == (111 & 23) ? --3 : (var1.length == (70 & 63) ? --2 : (var1.length == --4 ? 3 >> 1 : 0));
                  int var3 = var2 == --3 ? 47 & 87 : (var2 == --2 ? 102 & 31 : (var2 == --1 ? --4 : 0));

                  int var10000;
                  for(var10000 = var3; var10000 < 8; var10000 = var3) {
                     if (var3 == (7 & 127)) {
                        this.f[111 & 30].setName(String.valueOf(3 >> 2));
                        this.f[94 & 47].setText((String)null);
                     } else {
                        this.f[(1 ^ 3) * var3].setKeep((boolean)(5 >> 3));
                        this.f[(5 >> 1) * var3 + --1].setKeep((boolean)(2 & 5));
                        this.f[(1 ^ 3) * var3].setName(String.valueOf(2 & 5));
                        this.f[(5 >> 1) * var3 + --1].setName(String.valueOf(3 ^ 3));
                        this.f[(1 ^ 3) * var3].setText((String)null);
                        this.f[(1 ^ 3) * var3 + --1].setText((String)null);
                        this.c[--2 * var3].setText((String)null);
                        this.c[(1 ^ 3) * var3 + (2 ^ 3)].setText((String)null);
                        this.g[var3].setVisible((boolean)(3 >> 2));
                     }

                     ++var3;
                  }

                  for(var10000 = var3 = 2 & 5; var10000 < var1.length; var10000 = var3) {
                     BWDHRuleBattle var6 = var1[var3];
                     this.f[--2 * var3].setName(String.valueOf(var6.getBwdhTeam1().getId()));
                     this.f[--2 * var3].setText(var6.getBwdhTeam1().getName());
                     this.f[2 * var3 + --1].setName(String.valueOf(var6.getBwdhTeam2().getId()));
                     this.f[2 * var3 + --1].setText(var6.getBwdhTeam2().getName());
                     if (var6.getWin() == 0 && var6.getPoint().x == 0 && var6.getPoint().x == 0) {
                        this.c[2 * var3].setText((String)null);
                        this.c[2 * var3 + (4 ^ 5)].setText((String)null);
                        this.g[var3].setVisible((boolean)(3 & 4));
                     } else {
                        this.c[2 * var3].setText(String.valueOf(var6.getPoint().x));
                        this.c[2 * var3 + --1].setText(String.valueOf(var6.getPoint().y));
                        <undefinedtype> var7;
                        if (var6.getWin() == --1 && var6.getBwdhTeam1().getId() != 0) {
                           Class436 var8 = this.g[var3];
                           int var10002 = this.f[2 * var3].getX() + (119 & 107);
                           var7 = this;
                           var8.setBounds(var10002, this.f[2 * var3].getY() - (47 & 95), 59 & 95, 57 & 94);
                        } else {
                           if (var6.getWin() == 2 && var6.getBwdhTeam1().getId() != 0) {
                              this.g[var3].setBounds(this.f[2 * var3 + (4 ^ 5)].getX() + (115 & 111), this.f[2 * var3 + 1].getY() - (95 & 47), 27 & 127, 26 & 125);
                           }

                           var7 = this;
                        }

                        var7.f[2 * var3].setKeep(var6.getWin() == 1);
                        this.f[2 * var3 + 1].setKeep(var6.getWin() == 2);
                        this.g[var3].setVisible(var6.getWin() != 0);
                        if (var6.getWin() != 0) {
                           int var4 = 0;
                           BWDHRuleBattle var9;
                           if (var3 == 0) {
                              var4 = 60 & 75;
                              var9 = var6;
                           } else if (var3 == 1) {
                              var4 = 9;
                              var9 = var6;
                           } else if (var3 == 2) {
                              var4 = 10;
                              var9 = var6;
                           } else if (var3 == 3) {
                              var4 = 11;
                              var9 = var6;
                           } else if (var3 == 4) {
                              var4 = 12;
                              var9 = var6;
                           } else if (var3 == 5) {
                              var4 = 13;
                              var9 = var6;
                           } else {
                              if (var3 == 6) {
                                 var4 = 14;
                              }

                              var9 = var6;
                           }

                           BWDHTeam var5 = var9.getWin() == 1 ? var6.getBwdhTeam1() : var6.getBwdhTeam2();
                           if (var4 > 0) {
                              this.f[var4].setName(String.valueOf(var5.getId()));
                              this.f[var4].setText(var5.getName());
                           }
                        }
                     }

                     ++var3;
                  }

               }

               public {
                  int var10001 = 127 & 15;
                  int var10012 = 3 ^ 3;
                  this.setBounds(var10012, 3 & 4, 5119 & 28366, 24510 & 8783);
                  this.b = new Class659(1 ^ 3, 103 & 124, Class34.this.gk());
                  this.b.gb((boolean)(3 >> 1));
                  this.b.vf(14323 & 19007, 119 & 79, 87 & 127, 31 & 115);
                  this.b.amy(new Class367("A组", 3 ^ 3));
                  this.b.amy(new Class367("B组", 4 ^ 5));
                  this.b.amy(new Class367("C组", 5 >> 1));
                  this.b.amy(new Class367("D组", --3));
                  this.b.fa().setText("A组");
                  this.add(this.b);
                  this.d = Class133.b(29903 & 3003, 113 & 126, 17398 & 15789, 25 & 126, Class681.c("#c7D6120"), Class681.ch);
                  this.d.setHorizontalAlignment(2 & 5);
                  this.d.setText("入围赛赛程图  A组");
                  this.add(this.d);
                  Class379[] var3 = new Class379[var10001];
                  boolean var10003 = true;
                  this.f = var3;
                  JLabel[] var4 = new JLabel[14 & 127];
                  var10003 = true;
                  this.c = var4;
                  Class436[] var5 = new Class436[39 & 95];
                  var10003 = true;
                  this.g = var5;

                  int var10000;
                  int var2;
                  for(var10000 = var2 = 3 & 4; var10000 < this.f.length; var10000 = var2) {
                     this.f[var2] = new Class379("sc/e/163.png", --2, 29618 & 3295, Class681.bu, Class681.c, "", Class34.this.gk());
                     if (var2 == 0) {
                        this.f[var2].setBounds(61 & 127, 379, 119, 27);
                     } else if (var2 == 3 >> 1) {
                        this.f[var2].setBounds(61, 412, 119, 27);
                     } else if (var2 == --2) {
                        this.f[var2].setBounds(217, 379, 119, 27);
                     } else if (var2 == --3) {
                        this.f[var2].setBounds(217, 412, 119, 27);
                     } else if (var2 == --4) {
                        this.f[var2].setBounds(360, 379, 119, 27);
                     } else if (var2 == --5) {
                        this.f[var2].setBounds(360, 412, 119, 27);
                     } else if (var2 == 6) {
                        this.f[var2].setBounds(516, 379, 119, 27);
                     } else if (var2 == 7) {
                        this.f[var2].setBounds(516, 412, 119, 27);
                     } else if (var2 == 8) {
                        this.f[var2].setBounds(61, 315, 119, 27);
                     } else if (var2 == 9) {
                        this.f[var2].setBounds(217, 315, 119, 27);
                     } else if (var2 == 10) {
                        this.f[var2].setBounds(360, 315, 119, 27);
                     } else if (var2 == 11) {
                        this.f[var2].setBounds(516, 315, 119, 27);
                     } else if (var2 == 12) {
                        this.f[var2].setBounds(140, 242, 119, 27);
                     } else if (var2 == 13) {
                        this.f[var2].setBounds(438, 242, 119, 27);
                     } else if (var2 == 14) {
                        this.f[var2].setBounds(290, 169, 119, 27);
                     }

                     ++var2;
                  }

                  for(var10000 = var2 = 5 >> 3; var10000 < this.g.length; var10000 = var2) {
                     this.g[var2] = new Class436("sc/d/144.png");
                     this.add(this.g[var2++]);
                  }

                  for(var10000 = var2 = 3 >> 2; var10000 < this.f.length; var10000 = var2) {
                     if (var2 < this.c.length) {
                        this.c[var2] = Class133.c(this.f[var2].getX() + 9, this.f[var2].getY() + --4, 100, 16, --4, Color.black, Class681.ce);
                        this.add(this.c[var2]);
                     }

                     this.add(this.f[var2++]);
                  }

                  var5 = new Class436[48];
                  var10003 = true;
                  this.e = var5;

                  for(var10000 = var2 = 3 & 4; var10000 < this.e.length; var10000 = var2) {
                     this.e[var2] = new Class436();
                     <undefinedtype> var6;
                     if (var2 == 0) {
                        var6 = this;
                        this.e[var2].eq(Class511.q("sc/d/103.png", 100, --5, 100, --5, (boolean)(3 >> 2)));
                        this.e[var2].setBounds(146, 119, 406, 11);
                     } else {
                        label301: {
                           if (var2 >= 5 >> 2 && var2 <= 40) {
                              this.e[var2].fw("sc/d/187.png");
                              if (var2 == (4 ^ 5)) {
                                 var6 = this;
                                 this.e[var2].setBounds(179, 391, 9, --2);
                                 break label301;
                              }

                              if (var2 == (1 ^ 3)) {
                                 var6 = this;
                                 this.e[var2].setBounds(186, 391, --2, 36);
                                 break label301;
                              }

                              if (var2 == --3) {
                                 var6 = this;
                                 this.e[var2].setBounds(179, 425, 9, 2);
                                 break label301;
                              }

                              if (var2 == 4) {
                                 var6 = this;
                                 this.e[var2].setBounds(187, 408, 8, 2);
                                 break label301;
                              }

                              if (var2 == 5) {
                                 var6 = this;
                                 this.e[var2].setBounds(195, 364, 2, 46);
                                 break label301;
                              }

                              if (var2 == 6) {
                                 var6 = this;
                                 this.e[var2].setBounds(200, 364, 2, 46);
                                 break label301;
                              }

                              if (var2 == 7) {
                                 var6 = this;
                                 this.e[var2].setBounds(202, 408, 8, 2);
                                 break label301;
                              }

                              if (var2 == 8) {
                                 var6 = this;
                                 this.e[var2].setBounds(209, 391, 9, 2);
                                 break label301;
                              }

                              if (var2 == 9) {
                                 var6 = this;
                                 this.e[var2].setBounds(209, 391, 2, 36);
                                 break label301;
                              }

                              if (var2 == 10) {
                                 var6 = this;
                                 this.e[var2].setBounds(209, 425, 9, 2);
                                 break label301;
                              }

                              if (var2 == 11) {
                                 var6 = this;
                                 this.e[var2].setBounds(478, 391, 9, 2);
                                 break label301;
                              }

                              if (var2 == 12) {
                                 var6 = this;
                                 this.e[var2].setBounds(478, 425, 9, 2);
                                 break label301;
                              }

                              if (var2 == 13) {
                                 var6 = this;
                                 this.e[var2].setBounds(485, 391, 2, 36);
                                 break label301;
                              }

                              if (var2 == 14) {
                                 var6 = this;
                                 this.e[var2].setBounds(486, 408, 8, 2);
                                 break label301;
                              }

                              if (var2 == 15) {
                                 var6 = this;
                                 this.e[var2].setBounds(494, 364, 2, 46);
                                 break label301;
                              }

                              if (var2 == 16) {
                                 var6 = this;
                                 this.e[var2].setBounds(499, 364, 2, 46);
                                 break label301;
                              }

                              if (var2 == 17) {
                                 var6 = this;
                                 this.e[var2].setBounds(501, 408, 8, 2);
                                 break label301;
                              }

                              if (var2 == 18) {
                                 var6 = this;
                                 this.e[var2].setBounds(508, 391, 9, 2);
                                 break label301;
                              }

                              if (var2 == 19) {
                                 var6 = this;
                                 this.e[var2].setBounds(508, 425, 9, 2);
                                 break label301;
                              }

                              if (var2 == 20) {
                                 var6 = this;
                                 this.e[var2].setBounds(508, 391, 2, 36);
                                 break label301;
                              }

                              if (var2 == 21) {
                                 var6 = this;
                                 this.e[var2].setBounds(121, 362, 76, 2);
                                 break label301;
                              }

                              if (var2 == 22) {
                                 var6 = this;
                                 this.e[var2].setBounds(200, 362, 76, 2);
                                 break label301;
                              }

                              if (var2 == 23) {
                                 var6 = this;
                                 this.e[var2].setBounds(420, 362, 76, 2);
                                 break label301;
                              }

                              if (var2 == 24) {
                                 var6 = this;
                                 this.e[var2].setBounds(499, 362, 76, 2);
                                 break label301;
                              }

                              if (var2 == 25) {
                                 var6 = this;
                                 this.e[var2].setBounds(120, 338, 2, 26);
                                 break label301;
                              }

                              if (var2 == 26) {
                                 var6 = this;
                                 this.e[var2].setBounds(275, 338, 2, 26);
                                 break label301;
                              }

                              if (var2 == 27) {
                                 var6 = this;
                                 this.e[var2].setBounds(419, 338, 2, 26);
                                 break label301;
                              }

                              if (var2 == 28) {
                                 var6 = this;
                                 this.e[var2].setBounds(574, 338, 2, 26);
                                 break label301;
                              }

                              if (var2 == 29) {
                                 var6 = this;
                                 this.e[var2].setBounds(120, 291, 2, 26);
                                 break label301;
                              }

                              if (var2 == 30) {
                                 var6 = this;
                                 this.e[var2].setBounds(275, 291, 2, 26);
                                 break label301;
                              }

                              if (var2 == 31) {
                                 var6 = this;
                                 this.e[var2].setBounds(419, 291, 2, 26);
                                 break label301;
                              }

                              if (var2 == 32) {
                                 var6 = this;
                                 this.e[var2].setBounds(574, 291, 2, 26);
                                 break label301;
                              }

                              if (var2 == 33) {
                                 var6 = this;
                                 this.e[var2].setBounds(121, 291, 155, 2);
                                 break label301;
                              }

                              if (var2 == 34) {
                                 var6 = this;
                                 this.e[var2].setBounds(420, 291, 155, 2);
                                 break label301;
                              }

                              if (var2 == 35) {
                                 var6 = this;
                                 this.e[var2].setBounds(198, 265, 2, 26);
                                 break label301;
                              }

                              if (var2 == 36) {
                                 var6 = this;
                                 this.e[var2].setBounds(497, 264, 2, 26);
                                 break label301;
                              }

                              if (var2 == 37) {
                                 var6 = this;
                                 this.e[var2].setBounds(198, 218, 2, 26);
                                 break label301;
                              }

                              if (var2 == 38) {
                                 var6 = this;
                                 this.e[var2].setBounds(497, 218, 2, 26);
                                 break label301;
                              }

                              if (var2 == 39) {
                                 var6 = this;
                                 this.e[var2].setBounds(199, 218, 298, 2);
                                 break label301;
                              }

                              if (var2 == 40) {
                                 var6 = this;
                                 this.e[var2].setBounds(347, 192, 2, 26);
                                 break label301;
                              }
                           } else if (var2 >= 41 && var2 <= 47) {
                              this.e[var2].fw("sc/d/188.png");
                              if (var2 == 41) {
                                 var6 = this;
                                 this.e[var2].setBounds(52, 369, 136, 80);
                                 break label301;
                              }

                              if (var2 == 42) {
                                 var6 = this;
                                 this.e[var2].setBounds(209, 369, 136, 80);
                                 break label301;
                              }

                              if (var2 == 43) {
                                 var6 = this;
                                 this.e[var2].setBounds(351, 369, 136, 80);
                                 break label301;
                              }

                              if (var2 == 44) {
                                 var6 = this;
                                 this.e[var2].setBounds(508, 369, 136, 80);
                                 break label301;
                              }

                              if (var2 == 45) {
                                 var6 = this;
                                 this.e[var2].setBounds(54, 306, 590, 45);
                                 break label301;
                              }

                              if (var2 == 46) {
                                 var6 = this;
                                 this.e[var2].setBounds(54, 233, 590, 45);
                                 break label301;
                              }

                              if (var2 == 47) {
                                 this.e[var2].setBounds(240, 160, 218, 45);
                              }
                           }

                           var6 = this;
                        }
                     }

                     var6.add(this.e[var2++]);
                  }

               }

               public void c(int var1, Object var2) {
                  if (var1 == (24503 & 8410)) {
                     if ((var1 = (Integer)var2) <= 0) {
                        return;
                     }

                     Activity var4 = Class34.this.awh.kd();
                     String var3 = Agreement.getSendTextAES("activity", var4.getId() + "|t" + var1);
                     Class34.this.uw().d(var3);
                  }

               }
            }, 2 & 5);
         }

         ((<undefinedtype>)this.awi[--1]).a((BWDHRuleBattle[])var2);
         var5 = this;
      } else {
         if (this.ay == --2 || this.ay == --3) {
            var1 = 2;
            if (this.awi[1 ^ 3] == null) {
               this.add(this.awi[1 ^ 3] = new Class456() {
                  private Class436 tu;
                  private Class226[] awn;
                  private Class436 et;
                  private Class436 uc;
                  private Class436 r;
                  private <undefinedtype>[] awo;
                  private Class436 ih;

                  public void alr(int var1, BWDHRuleBattle[] var2) {
                     int var3;
                     for(int var10000 = var3 = 3 >> 2; var10000 < 2; var10000 = var3) {
                        BWDHRuleBattle var4 = var2 != null && var3 < var2.length ? var2[var3] : null;
                        Class226 var6;
                        <undefinedtype> var7;
                        String[] var10001;
                        boolean var10003;
                        if (var4 == null) {
                           if (var3 == 0) {
                              this.ih.fw(var1 == --3 ? "sc/d/185.png" : "sc/d/186.png");
                              var10000 = var3;
                           } else {
                              this.r.fw(var1 == --3 ? "sc/d/186.png" : "sc/d/186.png");
                              var10000 = var3;
                           }

                           if (var10000 == 1 && var1 == --3) {
                              var6 = this.awn[var3];
                              var10001 = new String[--3];
                              var10003 = true;
                              var10001[3 ^ 3] = "冠";
                              var10001[2 ^ 3] = "亚";
                              var10001[5 >> 1] = "赛";
                              var6.df(var10001);
                              var7 = this;
                           } else if (var3 == 0 && var1 == --3) {
                              var6 = this.awn[var3];
                              var10001 = new String[--3];
                              var10003 = true;
                              var10001[5 >> 3] = "季";
                              var10001[2 ^ 3] = "殿";
                              var10001[--2] = "赛";
                              var6.df(var10001);
                              var7 = this;
                           } else if (var3 == 0) {
                              var6 = this.awn[var3];
                              var10001 = new String[--3];
                              var10003 = true;
                              var10001[3 & 4] = "上";
                              var10001[--1] = "半";
                              var10001[1 ^ 3] = "场";
                              var6.df(var10001);
                              var7 = this;
                           } else {
                              var6 = this.awn[var3];
                              var10001 = new String[--3];
                              var10003 = true;
                              var10001[5 >> 3] = "下";
                              var10001[3 >> 1] = "半";
                              var10001[5 >> 1] = "场";
                              var6.df(var10001);
                              var7 = this;
                           }

                           var7.awo[--2 * var3].aps((boolean)(3 ^ 3), (BWDHTeam)null);
                           this.awo[(1 ^ 3) * var3 + --1].aps((boolean)(3 ^ 3), (BWDHTeam)null);
                        } else {
                           BWDHRuleBattle var5;
                           if (var3 == 0) {
                              this.ih.fw(var4.getType() == --5 ? "sc/d/141.png" : (var4.getType() == --5 ? "sc/d/185.png" : "sc/d/186.png"));
                              var5 = var4;
                           } else {
                              this.r.fw(var4.getType() == 5 ? "sc/d/141.png" : (var4.getType() == 5 ? "sc/d/185.png" : "sc/d/186.png"));
                              var5 = var4;
                           }

                           if (var5.getType() == 5) {
                              var6 = this.awn[var3];
                              var10001 = new String[3];
                              var10003 = true;
                              var10001[3 ^ 3] = "冠";
                              var10001[5 >> 2] = "亚";
                              var10001[2] = "赛";
                              var6.df(var10001);
                              var7 = this;
                           } else if (var4.getType() == 4) {
                              var6 = this.awn[var3];
                              var10001 = new String[3];
                              var10003 = true;
                              var10001[3 & 4] = "季";
                              var10001[5 >> 2] = "殿";
                              var10001[2] = "赛";
                              var6.df(var10001);
                              var7 = this;
                           } else if (var3 == 0) {
                              var6 = this.awn[var3];
                              var10001 = new String[3];
                              var10003 = true;
                              var10001[3 & 4] = "上";
                              var10001[4 ^ 5] = "半";
                              var10001[2] = "场";
                              var6.df(var10001);
                              var7 = this;
                           } else {
                              var6 = this.awn[var3];
                              var10001 = new String[3];
                              var10003 = true;
                              var10001[3 >> 2] = "下";
                              var10001[--1] = "半";
                              var10001[2] = "场";
                              var6.df(var10001);
                              var7 = this;
                           }

                           <undefinedtype> var9 = var7.awo[2 * var3];
                           boolean var8;
                           BWDHRuleBattle var10002;
                           if (var4.getWin() == 1) {
                              var8 = true;
                              var10002 = var4;
                           } else {
                              var8 = false;
                              var10002 = var4;
                           }

                           var9.aps(var8, var10002.getBwdhTeam1());
                           var9 = this.awo[2 * var3 + 1];
                           if (var4.getWin() == 2) {
                              var8 = true;
                              var10002 = var4;
                           } else {
                              var8 = false;
                              var10002 = var4;
                           }

                           var9.aps(var8, var10002.getBwdhTeam2());
                        }

                        ++var3;
                     }

                  }

                  public {
                     int var10001 = 5 >> 1;
                     int var10003 = 3 >> 2;
                     this.setBounds(var10003, 3 >> 2, 16078 & 17407, 9022 & 24271);
                     Class226[] var5 = new Class226[var10001];
                     boolean var9 = true;
                     this.awn = var5;

                     int var2;
                     <undefinedtype> var6;
                     int var10000;
                     for(var10000 = var2 = 3 & 4; var10000 < this.awn.length; var10000 = var2) {
                        int var10002 = --3;
                        String[] var4;
                        boolean var8;
                        if (var2 == 0) {
                           var4 = new String[var10002];
                           var8 = true;
                           var4[3 & 4] = "上";
                           var4[4 ^ 5] = "半";
                           var4[5 >> 1] = "场";
                        } else {
                           var4 = new String[var10002];
                           var8 = true;
                           var4[3 ^ 3] = "下";
                           var4[--1] = "半";
                           var4[--2] = "场";
                        }

                        String[] var3 = var4;
                        this.awn[var2] = new Class226((String)null, -4 >> 2, 3 ^ 3, Class681.cm, (Color[])null, var3, Class34.this.gk());
                        this.awn[var2].setForeground(Class681.c("#c7D6120"));
                        if (var2 == 0) {
                           var6 = this;
                           this.awn[var2].setBounds(58 & 127, 20981 & 11935, 116 & 31, 126 & 121);
                        } else {
                           if (var2 == 5 >> 2) {
                              this.awn[var2].setBounds(62 & 123, 17243 & 15862, 52 & 95, 123 & 124);
                           }

                           var6 = this;
                        }

                        var6.awn[var2].ad(new Class116(4 ^ 5, 94 & 53, 3 ^ 3, 3 ^ 3));
                        this.add(this.awn[var2++]);
                     }

                     <undefinedtype>[] var7 = new <undefinedtype>[--4];
                     var9 = true;
                     this.awo = var7;

                     for(var10000 = var2 = 3 ^ 3; var10000 < this.awo.length; var10000 = var2) {
                        this.awo[var2] = new MouseListener() {
                           // $FF: synthetic field
                           final Class34 azm;
                           private JLabel bd;
                           private int j;
                           private Image rg;
                           private JLabel rk;
                           private Image rv;

                           public void mouseReleased(MouseEvent var1) {
                           }

                           public {
                              int var10005 = 5 >> 3;
                              int var10007 = 3 ^ 3;
                              this.azm = var1;
                              super();
                              this.bd = Class133.b(var10007, 50 & 127, 3573 & 29358, 29 & 119, Color.black, Class681.bu);
                              this.rk = Class133.b(var10005, 70 & 127, 19949 & 12982, 117 & 31, Color.black, Class681.bu);
                              this.bd.setHorizontalAlignment(3 >> 2);
                              this.rk.setHorizontalAlignment(2 & 5);
                              this.add(this.bd);
                              this.add(this.rk);
                              this.addMouseListener(this);
                           }

                           public void aps(boolean var1, BWDHTeam var2) {
                              this.j = var2 != null ? var2.getId() : 0;
                              this.rk.setText(var2 != null ? var2.getName() : "");
                              this.rg = Class511.a(var1 ? "sc/d/147.png" : "sc/d/196.png");
                              <undefinedtype> var10000;
                              if (var2 != null && var2.getRoleShows() != null) {
                                 this.bd.setText("队长:" + var2.getRoleShows()[2 & 5].getRolename());
                                 var10000 = this;
                                 this.rv = Class511.a(Class222.l("bwdh" + var2.getRoleShows()[3 & 4].getSpecies_id().intValue()));
                              } else {
                                 var10000 = this;
                                 this.bd.setText((String)null);
                                 this.rv = null;
                              }

                              var10000.setVisible(true);
                           }

                           public void mousePressed(MouseEvent var1) {
                           }

                           public void mouseEntered(MouseEvent var1) {
                           }

                           public void mouseExited(MouseEvent var1) {
                           }

                           protected void paintComponent(Graphics var1) {
                              super.paintComponent(var1);
                              if (this.rg != null) {
                                 var1.drawImage(this.rg, 63 & 80, 2 & 5, 3765 & 29134, 107 & 117, (ImageObserver)null);
                              }

                              if (this.rv != null) {
                                 var1.drawImage(this.rv, 3 >> 2, --4, 6069 & 26863, 61 & 111, (ImageObserver)null);
                              }

                           }

                           public void mouseClicked(MouseEvent var1) {
                              if (this.j > 0) {
                                 Activity var2 = Class34.als(this.azm).kd();
                                 String var3 = Agreement.getSendTextAES("activity", var2.getId() + "|t" + this.j);
                                 this.azm.uw().d(var3);
                              }
                           }
                        };
                        if (var2 != 0 && var2 != (3 & 5)) {
                           if (var2 == --2 || var2 == --3) {
                              this.awo[var2].setBounds(139 + (var2 - (5 >> 1)) * 285, 326, 165, 97);
                           }

                           var6 = this;
                        } else {
                           var6 = this;
                           this.awo[var2].setBounds((15835 & 17071) + var2 * (27071 & 5981), 11929 & 20975, 14565 & 18367, 99 & 125);
                        }

                        var6.add(this.awo[var2++]);
                     }

                     this.uc = new Class436("sc/d/133.png");
                     this.tu = new Class436("sc/d/133.png");
                     this.ih = new Class436("sc/d/141.png");
                     this.r = new Class436("sc/d/141.png");
                     this.et = new Class436(Class511.q("sc/d/66.png", 50, 3 & 5, 50, --1, (boolean)(2 & 5)));
                     this.uc.setBounds(54, 100, 29, 164);
                     this.tu.setBounds(54, 289, 29, 164);
                     this.ih.setBounds(321, 131, 84, 109);
                     this.r.setBounds(321, 320, 84, 109);
                     this.et.setBounds(94, 275, 532, 1 ^ 3);
                     this.add(this.uc);
                     this.add(this.tu);
                     this.add(this.ih);
                     this.add(this.r);
                     this.add(this.et);
                  }
               }, 3 & 4);
            }

            ((<undefinedtype>)this.awi[--2]).alr(this.ay, (BWDHRuleBattle[])var2);
         }

         var5 = this;
      }

      if (var5.awi[var1] != null) {
         this.awi[var1].setVisible((boolean)(4 ^ 5));
      }

      for(var10000 = var3 = 0; var10000 < this.awi.length; var10000 = var3) {
         if (this.awi[var3] != null && var1 != var3) {
            this.awi[var3].setVisible((boolean)(3 ^ 3));
         }

         ++var3;
      }

   }


   static void alt(Class34 var0, Class8 var1) {
      var0.awf = var1;
   }
}
