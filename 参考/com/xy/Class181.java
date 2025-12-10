package com.xy;

import com.xy.game.RoleData;
import com.xy.readbean.LaborShop;
import com.xy.readbean.LaborVip;
import com.xy.readbean.Shop;
import com.xy.richtext.RichLabel;
import com.xy.text.GameView;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.LayoutManager;
import java.awt.event.MouseEvent;
import java.awt.image.ImageObserver;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComponent;
import javax.swing.JLabel;

public class Class181 extends Class345 {
   private JLabel lj;
   private Class181 aoz;
   private int gv;
   private Class489 apa;
   private Class245 rd;
   private Class489 adg;
   private JLabel bd;
   private Class489[] ci;
   private int bn;
   private JLabel rk;
   private JComponent[] apb;

   public Class181(GameView var1) {
      int var10001 = --4;
      int var10007 = -4 >> 2;
      super(6367 & 26542, 1 ^ 3, Class345.aef, var1);
      this.va(var10007, 5 >> 3, 894 & 32675, 16186 & 17119, Class345.aeo);
      this.fx("sc/b/S333.png");
      this.aea.setBtnPath("sc/b/B448.png");
      this.aea.setBounds(19453 & 14075, 63 & 78, 119 & 30, 119 & 29);
      JComponent[] var4 = new JComponent[var10001];
      boolean var10003 = true;
      this.apb = var4;
      var10001 = --4;
      this.rk = Class133.c(3448 & 29591, 61 & 83, 127 & 110, 23 & 120, 14 & 123, Color.white, Class681.bx);
      this.add(this.rk);
      this.bd = Class133.c(18427 & 14783, 127 & 17, 110 & 127, 22 & 121, 10, Color.white, Class681.bx);
      this.add(this.bd);
      this.lj = Class133.c(645, 17, 110, 16, 10, Color.white, Class681.bx);
      this.add(this.lj);
      Class489[] var5 = new Class489[var10001];
      var10003 = true;
      this.ci = var5;

      int var3;
      for(int var10000 = var3 = 3 >> 2; var10000 < this.ci.length; var10000 = var3) {
         String var2 = var3 == 0 ? "充 值 回 馈" : (var3 == (3 & 5) ? "回 馈 豪 礼" : (var3 == --2 ? "特 惠 商 城" : "特 惠 礼 包"));
         this.ci[var3] = new Class489("sc/b/B449.png", --2, 41 + var3, Class681.bu, Class681.o, var2, this);
         this.ci[var3].setBounds(23, 66 + 35 * var3, 110, 30);
         this.add(this.ci[var3++]);
      }

      this.apa = new Class489("sc/b/B450.png", 4 ^ 5, 51, this);
      this.adg = new Class489("sc/b/B451.png", 3 >> 1, 52, this);
      this.rd = Class133.a(433, 511, 60, 16, 3 >> 2, Color.white, Class681.bx);
      this.apa.setBounds(416, 513, 12, 14);
      this.adg.setBounds(498, 513, 12, 14);
      this.add(this.apa);
      this.add(this.adg);
      this.add(this.rd);
      this.s();
   }

   public Class181 agc() {
      return this.aoz;
   }

   public double agd() {
      int var1 = this.vd().getLoginResult().getPaysum().intValue();
      if (this.uw().n(--2, 95 & 43)) {
         var1 = this.vd().getLoginResult().getScoretype("回馈充值").intValue();
      }

      LaborVip[] var2;
      int var3;
      for(int var10000 = var3 = (var2 = this.vc().au().getVips()).length - (2 ^ 3); var10000 >= 0; var10000 = var3) {
         if (var1 >= var2[var3].getMoney()) {
            return var2[var3].getZk();
         }

         --var3;
      }

      return 1.0D;
   }

   public void as(int var1) {
      int var10000;
      int var2;
      for(var10000 = var2 = 3 >> 2; var10000 < this.ci.length; var10000 = var2) {
         this.ci[var2].setKeep((boolean)(var2 == var1 ? 4 ^ 5 : 0));
         ++var2;
      }

      if (this.apb[var1] == null) {
         Class181 var5;
         if (var1 == 0) {
            this.apb[var1] = new JComponent() {
               private int gc;
               private <undefinedtype>[] axh;
               private List<null> xh;
               private Image bx;
               private Image rg;
               private Image fq;
               private int m;

               public void cc() {
                  List var4 = Class181.this.vc().au().getShopList(2 & 5);
                  int var2 = 3 & 4;
                  int var3 = (Class181.this.bn - (4 ^ 5)) * this.axh.length;

                  for(int var10000 = var2; var10000 < this.axh.length; ++var3) {
                     LaborShop var1 = var3 < var4.size() ? (LaborShop)var4.get(var3) : null;
                     if (var1 != null || this.axh[var2] != null) {
                        if (this.axh[var2] == null) {
                           this.axh[var2] = new Class93() {
                              private RichLabel bt;
                              private int gw;
                              private JLabel at;
                              private LaborShop aqr;
                              private Class436 r;
                              private JLabel ir;
                              // $FF: synthetic field
                              final Class181 ij;
                              private JLabel ax;

                              public void aht(int var1, LaborShop var2) {
                                 this.gw = var1;
                                 this.aqr = var2;
                                 if (var2 != null) {
                                    <undefinedtype> var10000;
                                    if (var1 == 0) {
                                       var10000 = this;
                                       this.p();
                                    } else if (var1 == (2 ^ 3)) {
                                       var10000 = this;
                                       this.o();
                                    } else if (var1 == (1 ^ 3)) {
                                       var10000 = this;
                                       this.s();
                                    } else {
                                       if (var1 == --3) {
                                          this.dg();
                                       }

                                       var10000 = this;
                                    }

                                    var10000.d();
                                 }
                              }

                              public void dg() {
                                 this.setImage("sc/b/B455.png");
                                 this.ir.setText(this.aqr.getName());
                                 this.bt.setTextSize("#K" + this.aqr.getText(), 127 & 125);
                                 this.r.hf(Class222.i(this.aqr.getSkin()));
                                 this.ax.setText(this.aqr.getMoneyString(1.0D));
                                 this.ir.setFont(Class681.cw);
                                 this.ir.setForeground(Class681.c("#c634424"));
                                 this.ax.setFont(Class681.y);
                                 this.ax.setForeground(Class681.c("#c634424"));
                                 this.ir.setHorizontalAlignment(5 >> 3);
                                 this.ax.setHorizontalAlignment(15 & 122);
                                 this.ir.setBounds(3 ^ 3, 60 & 79, 20443 & 12479, 27 & 125);
                                 this.bt.setBounds(63 & 79, 45 & 118, this.bt.getWidth(), this.bt.getHeight());
                                 this.r.setBounds(62 & 87, 111 & 89, 111 & 126, 111 & 126);
                                 this.ax.setBounds(47 & 95, 19708 & 13247, 7373 & 25534, 93 & 54);
                              }

                              public void o() {
                                 this.setImage("sc/b/B453.png");
                                 this.ir.setText(this.aqr.getName());
                                 this.bt.setTextSize("#K" + this.aqr.getText(), 125 & 127);
                                 this.r.hf(Class222.i(this.aqr.getSkin()));
                                 this.ax.setText(this.aqr.getMoneyString(1.0D));
                                 this.ir.setFont(Class681.cw);
                                 this.ir.setForeground(Class681.c("#c634424"));
                                 this.ax.setFont(Class681.y);
                                 this.ax.setForeground(Class681.c("#c634424"));
                                 this.ir.setHorizontalAlignment(27 & 110);
                                 this.ax.setHorizontalAlignment(5 >> 3);
                                 this.ir.setBounds(91 & 126, 63 & 89, 17375 & 15547, 63 & 89);
                                 this.bt.setBounds(126 & 91, 63 & 114, this.bt.getWidth(), this.bt.getHeight());
                                 this.r.setBounds(--5, --5, 127 & 80, 127 & 80);
                                 this.ax.setBounds(3 >> 2, 127 & 100, 479 & 32501, 60 & 87);
                              }

                              public void p() {
                                 this.setImage("sc/b/B452.png");
                                 this.ir.setText(this.aqr.getName());
                                 this.bt.setTextSize("#K" + this.aqr.getText(), 127 & 125);
                                 this.r.hf(Class222.i(this.aqr.getSkin()));
                                 this.at.setText(this.aqr.getXGString((int)this.ij.vd().getPackRecord().getLabortype(this.aqr.getId())));
                                 this.ax.setText(this.aqr.getMoneyString(1.0D));
                                 this.ir.setFont(Class681.cw);
                                 this.ir.setForeground(Class681.c("#c634424"));
                                 this.at.setFont(Class681.y);
                                 this.at.setForeground(Class681.c("#c634424"));
                                 this.ax.setFont(Class681.y);
                                 this.ax.setForeground(Class681.c("#c634424"));
                                 this.ir.setHorizontalAlignment(2 & 5);
                                 this.at.setHorizontalAlignment(110 & 27);
                                 this.ax.setHorizontalAlignment(11 & 126);
                                 this.ir.setBounds(3 ^ 3, 14 & 125, 6143 & 26779, 29 & 123);
                                 this.bt.setBounds(31 & 111, 119 & 44, this.bt.getWidth(), this.bt.getHeight());
                                 this.r.setBounds(54 & 95, 79 & 121, 110 & 127, 110 & 127);
                                 this.at.setBounds(15 & 127, 31423 & 1532, 1518 & 31389, 95 & 52);
                                 this.ax.setBounds(47 & 95, 207, 140, 20);
                              }

                              public void mouseExited(MouseEvent var1) {
                                 super.mouseExited(var1);
                                 if (this.gw == (1 ^ 3)) {
                                    this.ij.ve().n(127 & 46);
                                 }

                              }

                              public void mouseEntered(MouseEvent var1) {
                                 super.mouseEntered(var1);
                                 if (this.gw == (1 ^ 3)) {
                                    Shop var2;
                                    Shop var10001 = var2 = new Shop();
                                    var2.setShopname(this.aqr.getName());
                                    var2.setShopskin(this.aqr.getSkin());
                                    var10001.setShoptext(this.aqr.getText());
                                    ((Class270)this.ij.ve().e(127 & 46)).rz(var2);
                                 }

                              }

                              public void s() {
                                 this.setImage("sc/b/B454.png");
                                 this.ir.setText(this.aqr.getName());
                                 this.r.hf(Class222.i(this.aqr.getSkin()));
                                 this.at.setText(this.aqr.getZKMoneyString(3 & 4, 1.0D));
                                 <undefinedtype> var10000;
                                 if (this.aqr.getZk() != null) {
                                    this.ax.setText(this.aqr.getZKMoneyString(3 >> 1, this.ij.agd()));
                                    var10000 = this;
                                 } else {
                                    this.ax.setText((String)null);
                                    var10000 = this;
                                 }

                                 var10000.ir.setFont(Class681.bu);
                                 this.ir.setForeground(Class681.c("#c634424"));
                                 this.at.setFont(Class681.bx);
                                 this.at.setForeground(Class681.c("#c634424"));
                                 this.ax.setFont(Class681.bx);
                                 this.ax.setForeground(Color.red);
                                 this.ir.setHorizontalAlignment(127 & 10);
                                 this.at.setHorizontalAlignment(107 & 30);
                                 this.ax.setHorizontalAlignment(126 & 11);
                                 this.ir.setBounds(61 & 78, 23 & 122, 120 & 127, 125 & 27);
                                 this.r.setBounds(30404 & 2495, --3, 91 & 111, 83 & 124);
                                 this.at.setBounds(108 & 31, 111 & 56, 12023 & 20894, 30 & 117);
                                 this.ax.setBounds(108 & 31, 62 & 123, 150, 20);
                              }

                              public void ac(MouseEvent var1, boolean var2) {
                              }

                              public {
                                 int var10003 = 3 >> 2;
                                 int var10005 = 3 & 4;
                                 int var10008 = 3 & 4;
                                 this.ij = var1;
                                 super((String)null, --1, (Color[])null, var1.gk());
                                 this.ir = Class133.c(var10008, 2 & 5, 2 & 5, 2 & 5, 2 & 5, Color.white, Class681.bx);
                                 this.bt = new RichLabel();
                                 this.r = new Class436();
                                 this.at = Class133.c(var10005, 5 >> 3, 5 >> 3, 5 >> 3, 5 >> 3, Color.white, Class681.bx);
                                 this.ax = Class133.c(var10003, 2 & 5, 2 & 5, 2 & 5, 2 & 5, Color.white, Class681.bx);
                                 this.add(this.ir);
                                 this.add(this.bt);
                                 this.add(this.r);
                                 this.add(this.at);
                                 this.add(this.ax);
                              }

                              public void af(MouseEvent var1) {
                                 if (this.aqr != null) {
                                    if (this.aqr.getGoods().length == (2 ^ 3)) {
                                       ((Class67)this.form.ve().e(31410 & 1501)).aem(this.aqr);
                                    } else {
                                       ((Class538)this.form.ve().e(4255 & 28655)).aem(this.aqr);
                                    }
                                 }
                              }

                              public void d() {
                                 this.ir.setVisible((boolean)(this.gw != 0 && this.gw != (4 ^ 5) && this.gw != (1 ^ 3) && this.gw != --3 ? 3 >> 2 : 1));
                                 this.bt.setVisible((boolean)(this.gw != 0 && this.gw != --1 && this.gw != --3 ? 3 & 4 : 1));
                                 this.r.setVisible((boolean)(this.gw != 0 && this.gw != (3 & 5) && this.gw != --2 && this.gw != --3 ? 3 >> 2 : 1));
                                 this.at.setVisible((boolean)(this.gw != 0 && this.gw != --2 ? 3 >> 2 : 1));
                                 this.ax.setVisible((boolean)(this.gw != 0 && this.gw != (3 & 5) && this.gw != 5 >> 1 && this.gw != --3 ? 3 >> 2 : 1));
                              }
                           };
                           this.axh[var2].setBounds((22975 & 9935) + (17891 & 15039) * var2, 19921 & 13103, 12799 & 20123, 6379 & 26622);
                           this.add(this.axh[var2]);
                        }

                        this.axh[var2].aht(3 >> 2, var1);
                        this.axh[var2].setVisible((boolean)(var1 != null ? --1 : 0));
                     }

                     ++var2;
                     var10000 = var2;
                  }

               }

               public void q() {
                  int var5 = Class181.this.vd().getLoginResult().getPaysum().intValue();
                  if (Class181.this.uw().n(--2, 31 & 107)) {
                     var5 = Class181.this.vd().getLoginResult().getScoretype("回馈充值").intValue();
                  }

                  long var2 = Class181.this.vd().getPackRecord().getLabortype(5 >> 3);
                  LaborVip[] var4 = Class181.this.vc().au().getVips();

                  int var10000;
                  int var1;
                  for(var10000 = var1 = 3 ^ 3; var10000 < var4.length; var10000 = var1) {
                     Object var6 = var1 < this.xh.size() ? (<undefinedtype>)this.xh.get(var1) : null;
                     if (var6 == null) {
                        var6 = new Object(var1) {
                           private Class489 a;
                           // $FF: synthetic field
                           final Class181 b;
                           private LaborVip c;
                           private JLabel d;

                        
                           static Class489 a(Object var0) {
                              return var0.a;
                           }

                        
                           static JLabel b(Object var0) {
                              return var0.d;
                           }

                        
                           static LaborVip c(Object var0) {
                              return var0.c;
                           }

                           public {
                              int var10002 = 2 & 5;
                              this.b = var1;
                              super();
                              this.d = Class133.c(var10002, 2 & 5, 2 & 5, 2 & 5, 2 & 5, Color.black, Class681.ce);
                              this.a = new Class489("sc/b/B308.png", 4 ^ 5, 61 & 119, var1.gk());
                              this.a.setName(String.valueOf(var2));
                           }

                           public void d(LaborVip var1, int var2, int var3) {
                              this.c = var1;
                              <undefinedtype> var10000;
                              if (var2 != 0 && var2 != (1 ^ 3)) {
                                 var10000 = this;
                                 this.a.setBtn(4 ^ 5, "sc/b/B308.png");
                              } else {
                                 this.a.setBtn(-4 >> 2, var2 == 0 ? "sc/b/B309.png" : "sc/b/B310.png");
                                 var10000 = this;
                              }

                              var10000.a.setBounds(var3, 32760 & 191, 109 & 63, 111 & 52);
                              this.d.setText(String.valueOf(var1.getMoney()));
                              this.d.setBounds(var3, 15359 & 17628, 47 & 125, 87 & 58);
                           }
                        };
                        this.xh.add(var6);
                        this.add(null.b((<undefinedtype>)var6));
                        this.add(null.a((<undefinedtype>)var6));
                     }

                     int var7 = 0;
                     Object var9;
                     if ((var2 >> var1 & 1L) == 1L) {
                        var7 = 1 ^ 3;
                        var9 = var6;
                     } else {
                        if (var5 >= var4[var1].getMoney()) {
                           var7 = 5 >> 2;
                        }

                        var9 = var6;
                     }

                     ((<undefinedtype>)var9).d(var4[var1], var7, (29148 & 3759) + (var1 + (3 & 5)) * ((585 & 32767) / var4.length));
                     null.b((<undefinedtype>)var6).setForeground(var1 + (2 ^ 3) == var4.length ? Color.red : Color.black);
                     ++var1;
                  }

                  for(var10000 = var1 = this.xh.size() - (3 & 5); var10000 >= var4.length; var10000 = var1) {
                     <undefinedtype> var8;
                     <undefinedtype> var10 = var8 = (<undefinedtype>)this.xh.remove(var1);
                     JLabel var10003 = null.b(var8);
                     --var1;
                     this.remove(var10003);
                     this.remove(null.a(var10));
                  }

               }

               public void ab(int var1) {
                  if (this.gc != var1) {
                     int var10001 = 28493 & 4859;
                     this.gc = var1;
                     this.m = var10001;

                     int var2;
                     for(int var10000 = var2 = 3 & 4; var10000 < this.xh.size(); var10000 = var2) {
                        <undefinedtype> var3 = (<undefinedtype>)this.xh.get(var2);
                        if (var1 >= null.c(var3).getMoney()) {
                           if (var2 != 0) {
                              var1 -= null.c((<undefinedtype>)this.xh.get(var2 - (5 >> 2))).getMoney();
                           }

                           int var4 = 585 / this.xh.size();
                           this.m = (int)((double)var4 * ((double)var2 + (double)var1 / (double)null.c(var3).getMoney()));
                        }

                        ++var2;
                     }

                     this.q();
                  }
               }

               protected void paintComponent(Graphics var1) {
                  super.paintComponent(var1);
                  if (this.rg == null) {
                     this.rg = Class511.a("sc/b/S336.png");
                  }

                  var1.drawImage(this.rg, 18367 & 14543, 52 & 127, (ImageObserver)null);
                  if (this.bx == null) {
                     this.bx = Class511.a("sc/b/S337.png");
                  }

                  var1.drawImage(this.bx, 22711 & 10204, 28863 & 4094, (ImageObserver)null);
                  if (this.m > 0) {
                     if (this.fq == null) {
                        this.fq = Class511.a("sc/b/S338.png");
                     }

                     (var1 = var1.create(12719 & 20211, 4347 & 28615, this.m, 63 & 79)).drawImage(this.fq, 3 >> 2, 3 >> 2, (ImageObserver)null);
                     var1.dispose();
                  }

               }

               public {
                  int var10001 = --4;
                  int var10004 = 3 & 4;
                  int var10009 = 5 >> 3;
                  this.setOpaque((boolean)var10009);
                  this.setLayout((LayoutManager)null);
                  this.setPreferredSize(new Dimension(5114 & 28455, 7070 & 26235));
                  this.setBounds(var10004, 3 >> 2, 19450 & 14119, 16987 & 16318);
                  this.xh = new ArrayList();
                  <undefinedtype>[] var2 = new <undefinedtype>[var10001];
                  boolean var10003 = true;
                  this.axh = var2;
               }
            };
            var5 = this;
         } else {
            this.apb[var1] = new JComponent(var1) {
               private <undefinedtype>[] ii;
               private int m;

               public void cc() {
                  List var4 = Class181.this.vc().au().getShopList(this.m);
                  int var2 = 3 & 4;
                  int var3 = (Class181.this.bn - --1) * this.ii.length;

                  for(int var10000 = var2; var10000 < this.ii.length; ++var3) {
                     LaborShop var1 = var3 < var4.size() ? (LaborShop)var4.get(var3) : null;
                     if (var1 != null || this.ii[var2] != null) {
                        if (this.ii[var2] == null) {
                           this.ii[var2] = new Class93() {
                              private RichLabel bt;
                              private int gw;
                              private JLabel at;
                              private LaborShop aqr;
                              private Class436 r;
                              private JLabel ir;
                              // $FF: synthetic field
                              final Class181 ij;
                              private JLabel ax;

                              public void aht(int var1, LaborShop var2) {
                                 this.gw = var1;
                                 this.aqr = var2;
                                 if (var2 != null) {
                                    <undefinedtype> var10000;
                                    if (var1 == 0) {
                                       var10000 = this;
                                       this.p();
                                    } else if (var1 == (2 ^ 3)) {
                                       var10000 = this;
                                       this.o();
                                    } else if (var1 == (1 ^ 3)) {
                                       var10000 = this;
                                       this.s();
                                    } else {
                                       if (var1 == --3) {
                                          this.dg();
                                       }

                                       var10000 = this;
                                    }

                                    var10000.d();
                                 }
                              }

                              public void dg() {
                                 this.setImage("sc/b/B455.png");
                                 this.ir.setText(this.aqr.getName());
                                 this.bt.setTextSize("#K" + this.aqr.getText(), 127 & 125);
                                 this.r.hf(Class222.i(this.aqr.getSkin()));
                                 this.ax.setText(this.aqr.getMoneyString(1.0D));
                                 this.ir.setFont(Class681.cw);
                                 this.ir.setForeground(Class681.c("#c634424"));
                                 this.ax.setFont(Class681.y);
                                 this.ax.setForeground(Class681.c("#c634424"));
                                 this.ir.setHorizontalAlignment(5 >> 3);
                                 this.ax.setHorizontalAlignment(15 & 122);
                                 this.ir.setBounds(3 ^ 3, 60 & 79, 20443 & 12479, 27 & 125);
                                 this.bt.setBounds(63 & 79, 45 & 118, this.bt.getWidth(), this.bt.getHeight());
                                 this.r.setBounds(62 & 87, 111 & 89, 111 & 126, 111 & 126);
                                 this.ax.setBounds(47 & 95, 19708 & 13247, 7373 & 25534, 93 & 54);
                              }

                              public void o() {
                                 this.setImage("sc/b/B453.png");
                                 this.ir.setText(this.aqr.getName());
                                 this.bt.setTextSize("#K" + this.aqr.getText(), 125 & 127);
                                 this.r.hf(Class222.i(this.aqr.getSkin()));
                                 this.ax.setText(this.aqr.getMoneyString(1.0D));
                                 this.ir.setFont(Class681.cw);
                                 this.ir.setForeground(Class681.c("#c634424"));
                                 this.ax.setFont(Class681.y);
                                 this.ax.setForeground(Class681.c("#c634424"));
                                 this.ir.setHorizontalAlignment(27 & 110);
                                 this.ax.setHorizontalAlignment(5 >> 3);
                                 this.ir.setBounds(91 & 126, 63 & 89, 17375 & 15547, 63 & 89);
                                 this.bt.setBounds(126 & 91, 63 & 114, this.bt.getWidth(), this.bt.getHeight());
                                 this.r.setBounds(--5, --5, 127 & 80, 127 & 80);
                                 this.ax.setBounds(3 >> 2, 127 & 100, 479 & 32501, 60 & 87);
                              }

                              public void p() {
                                 this.setImage("sc/b/B452.png");
                                 this.ir.setText(this.aqr.getName());
                                 this.bt.setTextSize("#K" + this.aqr.getText(), 127 & 125);
                                 this.r.hf(Class222.i(this.aqr.getSkin()));
                                 this.at.setText(this.aqr.getXGString((int)this.ij.vd().getPackRecord().getLabortype(this.aqr.getId())));
                                 this.ax.setText(this.aqr.getMoneyString(1.0D));
                                 this.ir.setFont(Class681.cw);
                                 this.ir.setForeground(Class681.c("#c634424"));
                                 this.at.setFont(Class681.y);
                                 this.at.setForeground(Class681.c("#c634424"));
                                 this.ax.setFont(Class681.y);
                                 this.ax.setForeground(Class681.c("#c634424"));
                                 this.ir.setHorizontalAlignment(2 & 5);
                                 this.at.setHorizontalAlignment(110 & 27);
                                 this.ax.setHorizontalAlignment(11 & 126);
                                 this.ir.setBounds(3 ^ 3, 14 & 125, 6143 & 26779, 29 & 123);
                                 this.bt.setBounds(31 & 111, 119 & 44, this.bt.getWidth(), this.bt.getHeight());
                                 this.r.setBounds(54 & 95, 79 & 121, 110 & 127, 110 & 127);
                                 this.at.setBounds(15 & 127, 31423 & 1532, 1518 & 31389, 95 & 52);
                                 this.ax.setBounds(47 & 95, 207, 140, 20);
                              }

                              public void mouseExited(MouseEvent var1) {
                                 super.mouseExited(var1);
                                 if (this.gw == (1 ^ 3)) {
                                    this.ij.ve().n(127 & 46);
                                 }

                              }

                              public void mouseEntered(MouseEvent var1) {
                                 super.mouseEntered(var1);
                                 if (this.gw == (1 ^ 3)) {
                                    Shop var2;
                                    Shop var10001 = var2 = new Shop();
                                    var2.setShopname(this.aqr.getName());
                                    var2.setShopskin(this.aqr.getSkin());
                                    var10001.setShoptext(this.aqr.getText());
                                    ((Class270)this.ij.ve().e(127 & 46)).rz(var2);
                                 }

                              }

                              public void s() {
                                 this.setImage("sc/b/B454.png");
                                 this.ir.setText(this.aqr.getName());
                                 this.r.hf(Class222.i(this.aqr.getSkin()));
                                 this.at.setText(this.aqr.getZKMoneyString(3 & 4, 1.0D));
                                 <undefinedtype> var10000;
                                 if (this.aqr.getZk() != null) {
                                    this.ax.setText(this.aqr.getZKMoneyString(3 >> 1, this.ij.agd()));
                                    var10000 = this;
                                 } else {
                                    this.ax.setText((String)null);
                                    var10000 = this;
                                 }

                                 var10000.ir.setFont(Class681.bu);
                                 this.ir.setForeground(Class681.c("#c634424"));
                                 this.at.setFont(Class681.bx);
                                 this.at.setForeground(Class681.c("#c634424"));
                                 this.ax.setFont(Class681.bx);
                                 this.ax.setForeground(Color.red);
                                 this.ir.setHorizontalAlignment(127 & 10);
                                 this.at.setHorizontalAlignment(107 & 30);
                                 this.ax.setHorizontalAlignment(126 & 11);
                                 this.ir.setBounds(61 & 78, 23 & 122, 120 & 127, 125 & 27);
                                 this.r.setBounds(30404 & 2495, --3, 91 & 111, 83 & 124);
                                 this.at.setBounds(108 & 31, 111 & 56, 12023 & 20894, 30 & 117);
                                 this.ax.setBounds(108 & 31, 62 & 123, 150, 20);
                              }

                              public void ac(MouseEvent var1, boolean var2) {
                              }

                              public {
                                 int var10003 = 3 >> 2;
                                 int var10005 = 3 & 4;
                                 int var10008 = 3 & 4;
                                 this.ij = var1;
                                 super((String)null, --1, (Color[])null, var1.gk());
                                 this.ir = Class133.c(var10008, 2 & 5, 2 & 5, 2 & 5, 2 & 5, Color.white, Class681.bx);
                                 this.bt = new RichLabel();
                                 this.r = new Class436();
                                 this.at = Class133.c(var10005, 5 >> 3, 5 >> 3, 5 >> 3, 5 >> 3, Color.white, Class681.bx);
                                 this.ax = Class133.c(var10003, 2 & 5, 2 & 5, 2 & 5, 2 & 5, Color.white, Class681.bx);
                                 this.add(this.ir);
                                 this.add(this.bt);
                                 this.add(this.r);
                                 this.add(this.at);
                                 this.add(this.ax);
                              }

                              public void af(MouseEvent var1) {
                                 if (this.aqr != null) {
                                    if (this.aqr.getGoods().length == (2 ^ 3)) {
                                       ((Class67)this.form.ve().e(31410 & 1501)).aem(this.aqr);
                                    } else {
                                       ((Class538)this.form.ve().e(4255 & 28655)).aem(this.aqr);
                                    }
                                 }
                              }

                              public void d() {
                                 this.ir.setVisible((boolean)(this.gw != 0 && this.gw != (4 ^ 5) && this.gw != (1 ^ 3) && this.gw != --3 ? 3 >> 2 : 1));
                                 this.bt.setVisible((boolean)(this.gw != 0 && this.gw != --1 && this.gw != --3 ? 3 & 4 : 1));
                                 this.r.setVisible((boolean)(this.gw != 0 && this.gw != (3 & 5) && this.gw != --2 && this.gw != --3 ? 3 >> 2 : 1));
                                 this.at.setVisible((boolean)(this.gw != 0 && this.gw != --2 ? 3 >> 2 : 1));
                                 this.ax.setVisible((boolean)(this.gw != 0 && this.gw != (3 & 5) && this.gw != 5 >> 1 && this.gw != --3 ? 3 >> 2 : 1));
                              }
                           };
                           <undefinedtype> var5;
                           if (this.m == (2 ^ 3)) {
                              var5 = this;
                              this.ii[var2].setBounds((11919 & 20990) + var2 % --3 * (30969 & 2015), (111 & 81) + var2 / --3 * (22013 & 10903), 23007 & 9973, 125 & 126);
                           } else if (this.m == --2) {
                              var5 = this;
                              this.ii[var2].setBounds((23953 & 8958) + var2 % --3 * (15327 & 17657), (121 & 55) + var2 / --3 * (125 & 95), 247 & 32728, 118 & 95);
                           } else {
                              if (this.m == --3) {
                                 this.ii[var2].setBounds((12271 & 20639) + var2 % --4 * (5539 & 27391), (119 & 60) + var2 / --4 * (14573 & 18423), 155, 220);
                              }

                              var5 = this;
                           }

                           var5.add(this.ii[var2]);
                        }

                        this.ii[var2].aht(this.m, var1);
                        this.ii[var2].setVisible((boolean)(var1 != null ? 3 >> 1 : 0));
                     }

                     ++var2;
                     var10000 = var2;
                  }

               }

               public {
                  int var10003 = 3 ^ 3;
                  int var10008 = 5 >> 3;
                  this.m = var2;
                  this.setOpaque((boolean)var10008);
                  this.setLayout((LayoutManager)null);
                  this.setPreferredSize(new Dimension(4927 & 28642, 29503 & 3802));
                  this.setBounds(var10003, 3 ^ 3, 4014 & 29555, 23294 & 10011);
                  <undefinedtype>[] var10001 = new <undefinedtype>[var2 == 5 >> 2 ? 27 & 109 : (var2 == 5 >> 1 ? 111 & 31 : 8)];
                  boolean var3 = true;
                  this.ii = var10001;
               }

               public void q() {
               }
            };
            var5 = this;
         }

         if (var5.apb[var1] != null) {
            this.add(this.apb[var1], --1);
         }
      }

      for(var10000 = var2 = 0; var10000 < this.apb.length; var10000 = var2) {
         if (this.apb[var2] != null) {
            this.apb[var2].setVisible((boolean)(var2 == var1 ? 3 & 5 : 0));
            if (var2 == var1) {
               if (var1 == 0) {
                  <undefinedtype> var3 = (<undefinedtype>)this.apb[var1];
                  var10000 = 3 & 5;
                  var3.q();
                  this.gv = var10000 + (this.vc().au().getShopList(3 & 4).size() - (3 & 5)) / var3.axh.length;
               } else {
                  <undefinedtype> var4 = (<undefinedtype>)this.apb[var1];
                  var10000 = 3 >> 1;
                  var4.q();
                  this.gv = var10000 + (this.vc().au().getShopList(var1).size() - (5 >> 2)) / var4.ii.length;
               }
            }
         }

         ++var2;
      }

      this.y(5 >> 2);
   }

   public void s() {
      RoleData var1 = this.vd();
      Class681.j(this.rk, var1.getLoginResult().getCodecard().longValue());
      Class681.j(this.bd, (long)var1.getLoginResult().getMoney());
      Class681.j(this.lj, var1.getLoginResult().getScoretype("回馈积分").longValue());
      if (this.ci[2 & 5].getBtn() == 5 >> 1 && this.apb[2 & 5] != null) {
         int var2 = this.vd().getLoginResult().getPaysum().intValue();
         if (this.uw().n(5 >> 1, 15 & 123)) {
            var2 = this.vd().getLoginResult().getScoretype("回馈充值").intValue();
         }

         ((<undefinedtype>)this.apb[3 ^ 3]).ab(var2);
      }

   }

   protected void paintComponent(Graphics var1) {
      super.paintComponent(var1);
      if (this.aej.bl()) {
         this.s();
      }

   }

   public void y(int var1) {
      if (var1 == (-1 & -2) || var1 == -4 >> 2) {
         if ((var1 = this.bn + (var1 == (-2 & -1) ? -4 >> 2 : 1)) <= 0) {
            this.aej.f("当前是首页");
            return;
         }

         if (var1 > this.gv) {
            this.aej.f("当前是尾页");
            return;
         }
      }

      this.bn = var1;
      if (this.bn > this.gv) {
         this.gv = this.bn;
      }

      this.rd.setText(this.bn + "/" + this.gv);
      if (this.ci[3 ^ 3].t() && this.apb[5 >> 3] != null) {
         ((<undefinedtype>)this.apb[3 & 4]).cc();
      } else if (this.ci[4 ^ 5].t() && this.apb[5 >> 2] != null) {
         ((<undefinedtype>)this.apb[4 ^ 5]).cc();
      } else if (this.ci[1 ^ 3].t() && this.apb[1 ^ 3] != null) {
         ((<undefinedtype>)this.apb[1 ^ 3]).cc();
      } else {
         if (this.ci[--3].t() && this.apb[--3] != null) {
            ((<undefinedtype>)this.apb[--3]).cc();
         }

      }
   }

   public void d() {
      if (this.ci[3 >> 2].t() && this.apb[2 & 5] != null) {
         ((<undefinedtype>)this.apb[5 >> 3]).q();
         ((<undefinedtype>)this.apb[2 & 5]).cc();
      }

   }

   public void q() {
      this.as(5 >> 3);
      super.q();
   }
}
