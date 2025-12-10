package com.xy;

import com.xy.bean.SuitOperBean;
import com.xy.entity.PartJade;
import com.xy.game.RoleData;
import com.xy.readbean.Goodstable;
import com.xy.readbean.MoneyType;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.ImageObserver;
import java.math.BigDecimal;
import java.util.ArrayList;
import javax.swing.JLabel;

public class Class65 extends Class345 {
   private int dn;
   private BigDecimal rm;
   private static Image kx = Class511.a("sc/d/18.png");
   private Class245 ga;
   private Class436[] oi;
   private Class44[] nt;
   private Class357 bad;
   private Class556 aet;
   private <undefinedtype> bae;
   private JLabel[] hj;
   private MoneyType am;
   private Class489[] rt;
   private Class245 abf;


   static Class44[] aqr(Class65 var0) {
      return var0.nt;
   }

   public void q() {
      int var10002 = 2 & 5;
      this.aet.cc();
      this.as(var10002);
      super.q();
   }

   public Class65(GameView var1) {
      int var10001 = 5 >> 1;
      int var10005 = -4 >> 2;
      int var10007 = -4 >> 2;
      super(22190 & 10741, 5 >> 1, Class345.aef, var1);
      this.dn = var10007;
      this.va(var10005, 2 & 5, 9214 & 23935, 30205 & 2975, Class345.aeo);
      this.uv(Class511.q("sc/d/1.png", 86 & 109, 86 & 109, 86 & 109, 86 & 109, (boolean)(3 ^ 3)), "打造分解");
      Class489[] var7 = new Class489[var10001];
      boolean var10003 = true;
      this.rt = var7;

      int var2;
      Class65 var6;
      int var10000;
      for(var10000 = var2 = 2 & 5; var10000 < this.rt.length; var10000 = var2) {
         Class489[] var5 = this.rt;
         Class489 var8 = new Class489;
         String var10004 = var2 == 0 ? "sc/e/28.png" : "sc/e/7.png";
         int var10006 = (61 & 127) + var2;
         Font var14 = var2 == 0 ? Class681.bm : Class681.ak;
         String var10009;
         Class65 var10010;
         if (var2 == 0) {
            var10009 = "选择部位";
            var10010 = this;
         } else if (var2 == 3 >> 1) {
            var10009 = "打造";
            var10010 = this;
         } else {
            var10009 = "";
            var10010 = this;
         }

         var8.<init>(var10004, 1, var10006, var14, (Color[])null, var10009, var10010);
         var5[var2] = var8;
         if (var2 == 0) {
            var6 = this;
            this.rt[var2].setBounds(6643 & 26349, 26294 & 6623, 60 & 127, 19 & 126);
         } else {
            if (var2 == --1) {
               this.rt[var2].setBounds(19391 & 13548, 17903 & 15101, 63 & 123, 95 & 57);
               this.rt[var2].setForeground(Color.black);
            }

            var6 = this;
         }

         var6.add(this.rt[var2++]);
      }

      var10001 = --4;
      int var10008 = 8939 & 23998;
      int var10012 = 111 & 123;
      this.ga = Class133.a(7422 & 25515, 180, 124, 19, 10, Color.white, Class681.q);
      this.abf = Class133.a(var10012, 149, 64, 19, 5 >> 3, Color.white, Class681.q);
      this.am = new MoneyType();
      this.am.setIdAndKey(2 ^ 3, "金 钱");
      this.aet = Class133.m(var10008, 203, 124, 19, 10, Color.white, Class681.q, this.am, var1);
      this.ga.eq(Class511.q("sc/d/17.png", 6, 6, 6, 6, (boolean)(5 >> 3)));
      this.abf.eq(Class511.q("sc/d/17.png", 6, 6, 6, 6, (boolean)(3 ^ 3)));
      this.aet.eq(Class511.q("sc/d/17.png", 6, 6, 6, 6, (boolean)(5 >> 3)));
      this.add(this.ga);
      this.add(this.aet);
      this.add(this.abf);
      JLabel[] var9 = new JLabel[var10001];
      var10003 = true;
      this.hj = var9;

      for(var10000 = var2 = 3 ^ 3; var10000 < this.hj.length; var10000 = var2) {
         this.hj[var2] = Class133.c(104, 180 + 23 * var2, 60, 19, 10, Class681.c("#cFFFFFF"), Class681.ab);
         this.hj[var2].setText(var2 == 0 ? "消耗金钱" : (var2 == (2 ^ 3) ? "拥有金钱" : (var2 == 5 >> 1 ? "装备打造" : (var2 == --3 ? "装备分解" : ""))));
         if (var2 >= 5 >> 1 && var2 <= --3) {
            this.hj[var2].setBounds(132 + 101 * (var2 - --2), 49, 60, 18);
         }

         this.add(this.hj[var2++]);
      }

      Class44[] var10 = new Class44[1 ^ 3];
      var10003 = true;
      this.nt = var10;

      for(var10000 = var2 = 2 & 5; var10000 < this.nt.length; var10000 = var2) {
         this.nt[var2] = new Class44(this);
         this.nt[var2].fw("sc/d/4.png");
         this.nt[var2].ad(Class44.arh);
         this.nt[var2].setBounds(109 + var2 * 116, 90, 59, 57);
         this.add(this.nt[var2++]);
      }

      Class436[] var11 = new Class436[--5];
      var10003 = true;
      this.oi = var11;

      for(var10000 = var2 = 3 ^ 3; var10000 < this.oi.length; var10000 = var2) {
         this.oi[var2] = new Class436();
         if (var2 == 0) {
            var6 = this;
            this.oi[var2].setBounds(111 + var2 * 101, 49, 18, 18);
            this.oi[var2].addMouseListener(new MouseListener() {
               public void mouseReleased(MouseEvent var1) {
               }

               public void mousePressed(MouseEvent var1) {
                  if (Class65.this.dn != 0) {
                     Class65.this.as(3 ^ 3);
                  }
               }

               public void mouseEntered(MouseEvent var1) {
               }

               public void mouseClicked(MouseEvent var1) {
               }

               public void mouseExited(MouseEvent var1) {
               }
            });
         } else if (var2 == (2 ^ 3)) {
            var6 = this;
            this.oi[var2].setBounds(111 + var2 * 101, 49, 18, 18);
            this.oi[var2].addMouseListener(new MouseListener() {
               public void mouseReleased(MouseEvent var1) {
               }

               public void mouseClicked(MouseEvent var1) {
               }

               public void mousePressed(MouseEvent var1) {
                  if (Class65.this.dn != (3 & 5)) {
                     Class65.this.as(--1);
                  }
               }

               public void mouseExited(MouseEvent var1) {
               }

               public void mouseEntered(MouseEvent var1) {
               }
            });
         } else if (var2 == 5 >> 1) {
            var6 = this;
            this.oi[var2].fw("sc/d/73.png");
            this.oi[var2].setBounds(180, 99, 34, 38);
         } else if (var2 == --3) {
            var6 = this;
            this.oi[var2].eq(Class511.q("sc/d/19.png", --5, --5, --5, --5, (boolean)(3 >> 2)));
            this.oi[var2].setBounds(47, 272, 311, 105);
         } else {
            if (var2 == --4) {
               this.oi[var2].eq(Class511.q("sc/d/49.png", 5, 5, 5, 5, (boolean)(3 >> 2)));
               this.oi[var2].setBounds(46, 32, 311, 240);
            }

            var6 = this;
         }

         var6.add(this.oi[var2++]);
      }

      Class216[] var13 = new Class216[2];
      boolean var12 = true;
      Class216[] var4 = var13;

      int var3;
      for(var10000 = var3 = 5 >> 3; var10000 < var4.length; var10000 = var3) {
         var4[var3] = new Class216(var3 == 0 ? "sc/e/42.png" : "sc/e/43.png", 1, var3, this);
         if (var3 == 0) {
            var4[var3].setBounds(316, 378, 18, 18);
            var6 = this;
         } else {
            var4[var3].setBounds(338, 378, 18, 18);
            var6 = this;
         }

         var6.add(var4[var3++]);
      }

      this.bad = new Class357(this, 6, 2, 51, 51, 3 & 4, 3 & 4, 48, 273);
      this.bad.hf(Class511.a("sc/d/18.png"));
      this.bad.aiw(var4, 3 >> 1);
      this.add(this.bad);
   }

   protected void paintComponent(Graphics var1) {
      if (this.aej.bl()) {
         this.d();
      }

      super.paintComponent(var1);
   }


   static void aqs(Class65 var0, boolean var1) {
      var0.r(var1);
   }

   public boolean bl() {
      RoleData var1 = this.vd();
      Goodstable var2;
      if ((var2 = (Goodstable)this.nt[3 ^ 3].hr()) != null) {
         var2 = var1.getGood(var2.getRgid());
      }

      int var10000;
      if (var2 == null) {
         var10000 = 5 >> 3;
         this.aej.f("请选择对应物品");
         return (boolean)var10000;
      } else if (this.rm != null && var1.getLoginResult().getGold().compareTo(this.rm) < 0) {
         var10000 = 3 >> 2;
         this.aej.f("大话币不足" + this.rm.longValue() / 10000L + "万");
         return (boolean)var10000;
      } else {
         SuitOperBean var4 = new SuitOperBean();
         ArrayList var3;
         if (this.dn == 0) {
            if (this.nt[2 ^ 3].gl() == 0L) {
               var10000 = 5 >> 3;
               this.aej.f("请选择对应孩子装备类型");
               return (boolean)var10000;
            }

            (var3 = new ArrayList()).add(var2.getRgid());
            var4.setType(22007 & 10892);
            var4.setGoods(var3);
            var4.setJade(new PartJade(this.nt[3 & 5].gl(), 3 & 4));
         } else if (this.dn == (3 & 5)) {
            (var3 = new ArrayList()).add(var2.getRgid());
            var4.setType(23027 & 9871);
            var4.setGoods(var3);
         }

         String var5 = Agreement.getSendTextAES("suitoperate", Class695.b().toJson(var4));
         var10000 = 3 >> 1;
         this.uw().d(var5);
         return (boolean)var10000;
      }
   }

   public void as(int var1) {
      if (this.dn != var1) {
         this.oi[2 & 5].fw(var1 == 0 ? "sc/e/67.png" : "sc/e/68.png");
         this.oi[5 >> 2].fw(var1 == (4 ^ 5) ? "sc/e/67.png" : "sc/e/68.png");
      }

      int var2;
      for(int var10000 = var2 = 0; var10000 < this.nt.length; var10000 = var2) {
         Class44 var3 = this.nt[var2];
         ++var2;
         var3.c(3 >> 2, (Object)null);
      }

      this.dn = var1;
      Class65 var4;
      if (this.dn == 0) {
         long[] var10001 = new long[3 & 5];
         boolean var10003 = true;
         var10001[2 & 5] = 138L;
         this.bad.ud(var10001);
         var4 = this;
         this.rm = new BigDecimal(5000000);
         Class681.j(this.ga, this.rm.longValue());
         this.abf.setBounds(127 & 107, 22677 & 10239, 83 & 108, 63 & 83);
         this.ga.setVisible((boolean)(3 & 5));
         this.aet.setVisible((boolean)(--1));
         this.hj[3 & 4].setVisible((boolean)(2 ^ 3));
         this.hj[--1].setVisible((boolean)(5 >> 2));
         this.rt[3 >> 2].setVisible((boolean)(3 & 5));
         this.rt[5 >> 2].setText("打造");
         this.nt[2 ^ 3].c(87 & 56, 23483 & 9934);
      } else {
         if (this.dn == 3 >> 1) {
            long[] var10011 = new long[2 ^ 3];
            boolean var10013 = true;
            var10011[3 ^ 3] = 139L;
            this.bad.ud(var10011);
            this.abf.setForeground(Color.white);
            this.rm = null;
            this.abf.setBounds(7391 & 25599, 25271 & 7645, 66 & 125, 27 & 119);
            this.ga.setVisible((boolean)(5 >> 3));
            this.aet.setVisible(false);
            this.hj[0].setVisible(false);
            this.hj[1].setVisible(false);
            this.rt[0].setVisible(false);
            this.rt[1].setText("分解");
         }

         var4 = this;
      }

      var4.r(false);
      this.bad.aiz().i(0);
   }


   static Image ga() {
      return kx;
   }

   public void y(int var1) {
      if (var1 == (63 & 125)) {
         if (this.bae == null) {
            this.r((boolean)(2 ^ 3));
         } else {
            this.r((boolean)(this.bae.isVisible() ? 3 >> 2 : 1));
         }
      } else {
         if (var1 == (127 & 62)) {
            this.bl();
         }

      }
   }

   public void ax(Goodstable var1) {
      Class44 var10000;
      int var10001;
      Goodstable var10002;
      if (this.dn == 0) {
         var10000 = this.nt[3 ^ 3];
         if (var1 != null) {
            var10001 = 2 ^ 3;
            var10002 = var1;
         } else {
            var10001 = 0;
            var10002 = var1;
         }

         var10000.c(var10001, var10002);
         if (var1 != null) {
            this.abf.setText("50/" + var1.getUsetime());
            this.abf.setForeground(var1.getUsetime() < (55 & 122) ? Color.red : Color.white);
         } else {
            this.abf.setText("");
         }
      } else {
         if (this.dn == (4 ^ 5)) {
            var10000 = this.nt[3 ^ 3];
            if (var1 != null) {
               var10001 = --1;
               var10002 = var1;
            } else {
               var10001 = 0;
               var10002 = var1;
            }

            var10000.c(var10001, var10002);
            Goodstable var2 = var1 != null ? this.vc().n(new BigDecimal(25599 & 7836)) : null;
            if (var2 != null) {
               int var3 = Class394.an(var1.getValue(), "等级=", "|");
               this.nt[3 & 5].c(5 >> 2, var2);
               this.abf.setText(String.valueOf(var3 == --3 ? 63 & 94 : (var3 == (1 ^ 3) ? --5 : 2)));
               return;
            }

            this.nt[3 & 5].c(3 & 4, (Object)null);
            this.abf.setText("");
         }

      }
   }

   public void d() {
      if (this.nt[5 >> 3].tp() != 0) {
         RoleData var1 = this.vd();
         Goodstable var2;
         if ((var2 = (Goodstable)this.nt[2 & 5].hr()) != null) {
            var2 = var1.getGood(var2.getRgid());
         }

         if (var2 == null) {
            this.ax((Goodstable)null);
            return;
         }

         if (this.dn == 0) {
            this.abf.setText("50/" + var2.getUsetime());
            this.abf.setForeground(var2.getUsetime() < (62 & 115) ? Color.red : Color.white);
         }
      }

   }


   private void r(boolean var1) {
      if (this.bae != null || var1) {
         if (var1) {
            if (this.bae == null) {
               this.add(this.bae = new MouseListener() {
                  private Class436 r;
                  private <undefinedtype>[] pz;
                  private Class436 ih;

                  public void mousePressed(MouseEvent var1) {
                  }

                  public void mouseEntered(MouseEvent var1) {
                  }

                  public void mouseClicked(MouseEvent var1) {
                  }

                  public {
                     int var10001 = 25 & 110;
                     this.r = new Class436(Class511.q("sc/d/19.png", --5, --5, --5, --5, (boolean)(2 & 5)));
                     this.r.setBounds(25 & 111, 25 & 111, 5070 & 27903, 127 & 104);
                     this.add(this.r);
                     <undefinedtype>[] var3 = new <undefinedtype>[var10001];
                     boolean var10003 = true;
                     this.pz = var3;

                     int var2;
                     for(int var10000 = var2 = 3 ^ 3; var10000 < this.pz.length; var10000 = var2) {
                        this.pz[var2] = new MouseListener(var2) {
                           private int bn;
                           // $FF: synthetic field
                           final Class65 qa;
                           private Image rv;

                           public void mouseReleased(MouseEvent var1) {
                           }

                           public {
                              this.qa = var1;
                              this.bn = var2;
                              <undefinedtype> var10000;
                              if (var2 == 0) {
                                 var10000 = this;
                                 this.rv = Class222.i(String.valueOf(21162 & 12255));
                              } else if (var2 == --1) {
                                 var10000 = this;
                                 this.rv = Class222.i(String.valueOf(27261 & 6126));
                              } else if (var2 == 5 >> 1) {
                                 var10000 = this;
                                 this.rv = Class222.i(String.valueOf(29311 & 4086));
                              } else if (var2 == --3) {
                                 var10000 = this;
                                 this.rv = Class222.i(String.valueOf(22269 & 11138));
                              } else if (var2 == --4) {
                                 var10000 = this;
                                 this.rv = Class222.i(String.valueOf(18161 & 15231));
                              } else if (var2 == --5) {
                                 var10000 = this;
                                 this.rv = Class222.i(String.valueOf(23167 & 10235));
                              } else {
                                 if (var2 == (14 & 119)) {
                                    this.rv = Class222.i(String.valueOf(22493 & 10919));
                                 }

                                 var10000 = this;
                              }

                              if (var10000.rv != null) {
                                 this.addMouseListener(this);
                              }

                           }

                           public void mouseClicked(MouseEvent var1) {
                              <undefinedtype> var10000;
                              if (this.bn == 0) {
                                 Class65.aqr(this.qa)[3 >> 1].c(85 & 58, 7818 & 25599);
                                 var10000 = this;
                              } else if (this.bn == --1) {
                                 var10000 = this;
                                 Class65.aqr(this.qa)[4 ^ 5].c(117 & 26, 20460 & 12927);
                              } else if (this.bn == --2) {
                                 var10000 = this;
                                 Class65.aqr(this.qa)[5 >> 2].c(28 & 115, 2038 & 31359);
                              } else if (this.bn == --3) {
                                 var10000 = this;
                                 Class65.aqr(this.qa)[3 >> 1].c(83 & 60, 12930 & 20477);
                              } else if (this.bn == --4) {
                                 var10000 = this;
                                 Class65.aqr(this.qa)[--1].c(17 & 126, 19067 & 14325);
                              } else if (this.bn == --5) {
                                 var10000 = this;
                                 Class65.aqr(this.qa)[--1].c(23 & 120, 17019 & 16383);
                              } else {
                                 if (this.bn == (14 & 119)) {
                                    Class65.aqr(this.qa)[--1].c(60 & 83, 1999 & 31413);
                                 }

                                 var10000 = this;
                              }

                              Class65.aqs(var10000.qa, (boolean)(3 ^ 3));
                           }

                           public void mousePressed(MouseEvent var1) {
                           }

                           public void mouseEntered(MouseEvent var1) {
                           }

                           public void mouseExited(MouseEvent var1) {
                           }

                           protected void paintComponent(Graphics var1) {
                              super.paintComponent(var1);
                              var1.drawImage(Class65.ga(), 3 & 4, 3 & 4, this.getWidth(), this.getHeight(), (ImageObserver)null);
                              if (this.rv != null) {
                                 var1.drawImage(this.rv, 3 & 5, 3 & 5, this.getWidth() - (5 >> 1), this.getHeight() - (1 ^ 3), (ImageObserver)null);
                              }

                           }
                        };
                        this.pz[var2].setBounds((110 & 27) + var2 % --4 * (127 & 51), (90 & 47) + var2 / --4 * (115 & 63), 127 & 51, 127 & 51);
                        this.add(this.pz[var2++]);
                     }

                     this.ih = new Class436(Class511.q("sc/d/36.png", 60 & 87, 60 & 87, 60 & 87, 60 & 87, (boolean)(3 >> 2)));
                     this.ih.setBounds(3 & 4, 3 & 4, 21986 & 11005, 123 & 126);
                     this.add(this.ih);
                     this.addMouseListener(this);
                  }

                  public void mouseExited(MouseEvent var1) {
                  }

                  public void mouseReleased(MouseEvent var1) {
                  }
               }, 3 & 4);
            }

            this.bae.setBounds(87 & 127, 8894 & 24007, 21231 & 11760, 127 & 122);
         }

         this.bae.setVisible(var1);
      }
   }
}
