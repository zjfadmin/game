package com.xy;

import com.xy.bean.LoginResult;
import com.xy.bean.RoleShow;
import com.xy.bean.TeamBean;
import com.xy.bean.UseCardBean;
import com.xy.entity.RoleSummoning;
import com.xy.entity.TeamRole;
import com.xy.formula.PetProperty;
import com.xy.game.RoleData;
import com.xy.socket.GameClient;
import com.xy.text.GameView;
import com.xy.text.ScreenData;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.ImageObserver;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Class219 extends Class345 {
   private Class90 sn;
   private JLabel so;
   private List<Class441> sp;
   static Class8 sq;
   private Class322 sr;
   private String ss;
   private Class436 st;
   private Class44 su;
   private Class322 jj;
   private Class29 sv;
   public boolean sw;
   private Class322[] sx;
   static Class8 sy;
   private Class44 sz;
   private Class322[] ta;
   private <undefinedtype> tb;
   private Class322 tc;
   private <undefinedtype> td;
   private int te;
   private <undefinedtype> tf;
   private List<Class441> tg;
   private Class436 th;
   private JTextField ti;
   private JLabel tj;
   private Class600 tk;
   private Class436 tl;
   private <undefinedtype> tm;
   private JLabel tn;
   private Class322 to;
   private JLabel lf;
   private String tp;
   private Class322 tq;
   private <undefinedtype> tr;
   private Class436 ts;
   private Class601 tt;
   private JLabel bs;
   private Class436 tu;
   private Class600 tv;
   private String tw;
   private Class272 tx;
   private <undefinedtype> ty;
   private <undefinedtype>[] tz;
   private Class601 ua;
   public boolean op;

   public boolean au(int var1) {
      return this.tz[var1].bb;
   }

   public void ke() {
      if (this.tr != null) {
         this.tr.setVisible((boolean)(3 & 4));
      }

   }

   public Class322 kf() {
      return this.jj;
   }

   public Class29 kg() {
      return this.sv;
   }

   public void kh() {
      RoleData var10003 = this.vd();
      LoginResult var1 = var10003.getLoginResult();
      int var2 = var10003.getRoleProperty().getHp();
      int var3 = var10003.getRoleProperty().getMp();
      int var4 = Class224.d(var1.getGrade());
      int var5 = Class224.g(var1.getGrade());
      this.tb.kz(3 ^ 3, var1.getHp().doubleValue() / (double)var2);
      this.tb.kz(5 >> 2, var1.getMp().doubleValue() / (double)var3);
      this.tb.kz(1 ^ 3, var1.getExperience().doubleValue() / (double)this.vc().ac(var5, var4));
   }

   public Class90 ki() {
      return this.sn;
   }


   private void kj() {
      if (this.tf == null) {
         this.add(this.tf = new MouseListener() {
            boolean po;
            private Class436 uc;
            private List<null> im;
            boolean lc;
            private int cy;
            private Class322 sa;

            public void mouseClicked(MouseEvent var1) {
            }

            public {
               int var10005 = 5 >> 3;
               int var10007 = 3 & 5;
               this.lc = (boolean)var10007;
               this.po = (boolean)var10005;
               this.im = new ArrayList();
               this.uc = new Class436(Class511.q("sc/c/46", 103 & 30, 103 & 30, 103 & 30, 103 & 30, (boolean)(3 ^ 3)));
               this.sa = new Class322("sc/c/55", 2 ^ 3, 71 & 63, Class219.this.gk());
               this.add(this.uc);
               this.add(this.sa);
               this.addMouseListener(this);
               this.uc.setVisible((boolean)(3 & 4));
               this.sa.setVisible((boolean)(3 >> 2));
               this.q();
            }

            public void d() {
               RoleData var4 = Class219.this.vd();
               int var2 = 3 ^ 3;
               Iterator var3;
               Iterator var10000 = var3 = var4.limitMap.values().iterator();

               while(true) {
                  while(var10000.hasNext()) {
                     UseCardBean var7;
                     if (!(var7 = (UseCardBean)var3.next()).getType().equals("限时礼包")) {
                        if (var7.getType().equals("靓号")) {
                           var10000 = var3;
                           continue;
                        }

                        Object var1 = var2 < this.im.size() ? (<undefinedtype>)this.im.get(var2) : null;
                        if (var1 == null) {
                           var1 = new JComponent() {
                              // $FF: synthetic field
                              final Class219 ba;
                              private Class44 ae;
                              private JLabel ax;

                              public {
                                 this.ba = var1;
                                 this.ae = new Class44(var1.gk());
                                 this.ae.eq(Class511.q("sc/c/54", 87 & 46, 87 & 46, 87 & 46, 87 & 46, (boolean)(2 & 5)));
                                 this.ae.ad(Class44.aro);
                                 this.ae.setBounds(3 & 5, 5 >> 1, 55 & 94, 55 & 94);
                                 this.add(this.ae);
                                 this.ax = Class133.c(3 ^ 3, 94 & 55, 61 & 90, 126 & 17, 3 >> 2, Color.white, Class681.bo);
                                 this.add(this.ax);
                              }

                              public void q() {
                                 int var10001 = 5 >> 3;
                                 this.ae.c(3 & 4, (Object)null);
                                 this.ax.setText((String)null);
                                 this.setVisible((boolean)var10001);
                              }

                           
                              static JLabel afu(Object var0) {
                                 return var0.ax;
                              }

                           
                              static Class44 afv(Object var0) {
                                 return var0.ae;
                              }
                           };
                           this.add((Component)var1);
                           this.im.add(var1);
                        }

                        null.afv((<undefinedtype>)var1).c(75 & 62, var7);
                        long var5;
                        if ((var5 = (long)Math.max(var7.getUseTime(), 3 & 4)) == 0L) {
                           null.afu((<undefinedtype>)var1).setText((String)null);
                        } else if (var5 < 60L) {
                           null.afu((<undefinedtype>)var1).setForeground(Color.red);
                           null.afu((<undefinedtype>)var1).setText(var5 + "m");
                        } else if (var5 < 1440L) {
                           null.afu((<undefinedtype>)var1).setForeground(Color.yellow);
                           null.afu((<undefinedtype>)var1).setText(var5 / 60L + "h");
                        } else {
                           null.afu((<undefinedtype>)var1).setForeground(Color.green);
                           null.afu((<undefinedtype>)var1).setText(var5 / 1440L + "d");
                        }

                        ++var2;
                     }

                     var10000 = var3;
                  }

                  int var8;
                  for(int var9 = var8 = var2; var9 < this.im.size(); var9 = var8) {
                     ((<undefinedtype>)this.im.get(var8++)).q();
                  }

                  this.cy = var2;
                  this.q();
                  return;
               }
            }

            protected void paintComponent(Graphics var1) {
               super.paintComponent(var1);
               Point var2;
               if (this.lc && this.po && ((var2 = Class219.this.aej.getMousePoint()).x < this.getX() || var2.x > this.getX() + this.getWidth() || var2.y < this.getY() || var2.y > this.getY() + this.getHeight())) {
                  this.po = (boolean)(2 & 5);
                  this.uc.setVisible(this.po);
                  this.sa.setVisible(this.po);
               }

            }

            public void mouseExited(MouseEvent var1) {
            }

            public void cc() {
               if (this.lc && !this.po) {
                  this.po = (boolean)(--1);
                  this.uc.setVisible(this.po);
                  this.sa.setVisible(this.po);
                  this.add(this.uc);
               }

            }

            public void mouseReleased(MouseEvent var1) {
            }

            public void mouseEntered(MouseEvent var1) {
               this.cc();
            }

            public void mousePressed(MouseEvent var1) {
            }

            public void q() {
               if (this.cy == 0) {
                  this.setVisible((boolean)(2 & 5));
               } else {
                  ScreenData var4 = Class219.this.aej.screenData;
                  int var2;
                  <undefinedtype> var6;
                  int var10000;
                  if (this.lc) {
                     var2 = this.cy * (30 & 121) + (29 & 106) + (29 & 111);
                     int var3 = 126 & 41;

                     int var1;
                     for(var10000 = var1 = 5 >> 3; var10000 < this.cy; var10000 = var1) {
                        <undefinedtype> var5 = (<undefinedtype>)this.im.get(var1);
                        int var10001 = 2 ^ 3;
                        int var10003 = var2 - (24 & 111) - (var1 + (2 ^ 3)) * (60 & 91);
                        int var10004 = 2 & 5;
                        int var10005 = 127 & 24;
                        ++var1;
                        var5.setBounds(var10003, var10004, var10005, 60 & 107);
                        var5.setVisible((boolean)var10001);
                     }

                     var6 = this;
                     this.uc.setBounds(47 & 93, 5 >> 3, this.cy * (63 & 88) + (106 & 29), 107 & 60);
                     this.sa.setBounds(3 >> 2, 1 ^ 3, 61 & 79, 103 & 61);
                     this.setBounds(var4.getScreen_x() - var2, 126 & 79, var2, var3);
                  } else {
                     for(var10000 = var2 = 0; var10000 < this.cy; var10000 = var2) {
                        <undefinedtype> var7 = (<undefinedtype>)this.im.get(var2);
                        ++var2;
                        var7.setVisible((boolean)(2 & 5));
                     }

                     var6 = this;
                     this.sa.setBounds(5 >> 3, --2, 111 & 27, 37);
                     this.setBounds(var4.Screen_x - 11, 78, 11, 40);
                  }

                  var6.setVisible(true);
               }
            }
         });
      }

      this.tf.d();
      if (this.sw) {
         this.s();
      }

   }

   public void kk(RoleSummoning var1, Class514 var2) {
      if (var1 == null) {
         this.su.ach(Class222.t("p0"));
         this.td.kz(5 >> 3, 0.0D);
         this.td.kz(5 >> 2, 0.0D);
         this.td.kz(5 >> 1, 0.0D);
      } else {
         this.su.ach(Class222.t("p" + var1.getSummoningskin()));
         Class219 var10000;
         if (var2 != null) {
            var10000 = this;
            this.td.kz(3 ^ 3, (double)var2.bt().getHp_Current() / (double)var2.bt().getHp_Total());
            this.td.kz(3 >> 1, (double)var2.bt().getMp_Current() / (double)var2.bt().getMp_Total());
         } else {
            int[] var3 = PetProperty.getPetHMASp(var1, this.vd());
            var10000 = this;
            this.td.kz(2 & 5, (double)var1.getBasishp(var3[2 & 5]) / (double)var3[2 & 5]);
            this.td.kz(3 >> 1, (double)var1.getBasismp(var3[3 >> 1]) / (double)var3[2 ^ 3]);
         }

         var10000.td.kz(1 ^ 3, var1.getExp().doubleValue() / (double)this.vc().d(var1.getTurnRount(), Class224.p(var1.getGrade())));
      }
   }

   public Class600 kl() {
      return this.tv;
   }

   public void km() {
      this.sz.fx(Class222.l("s" + this.aej.roleData.getLoginResult().getSpecies_id().intValue()));
      this.kh();
   }

   public Class272 kn() {
      return this.tx;
   }

   public void ko(int var1, Class322 var2) {
      int var10000;
      int var10002;
      int var3;
      Object var5;
      if (var1 == --3) {
         var10000 = 5 >> 3;
         var10002 = --4;
         var2.setImage("sc/c/14");
         var2.ab(var10002);

         for(var3 = var10000; var10000 < this.sp.size(); var10000 = var3) {
            var5 = this.sp.get(var3);
            ++var3;
            ((Class441)var5).setVisible((boolean)(2 & 5));
         }

         for(var10000 = var3 = 3 ^ 3; var10000 < this.tg.size(); var10000 = var3) {
            var5 = this.tg.get(var3);
            ++var3;
            ((Class441)var5).setVisible((boolean)(3 ^ 3));
         }

      } else if (var1 != --4) {
         ScreenData var4;
         if (var1 == --5) {
            var10002 = 103 & 30;
            var2.setImage("sc/c/47");
            var2.ab(var10002);
            var4 = this.aej.screenData;
            this.to.setBounds(var4.getScreen_x() - (24941 & 8158), var4.getScreen_y() - (123 & 84), 111 & 27, 37 & 127);
            this.sn.setVisible((boolean)(--1));
         } else if (var1 == (118 & 15)) {
            var10002 = --5;
            var2.setImage("sc/c/48");
            var2.ab(var10002);
            var4 = this.aej.screenData;
            this.to.setBounds(var4.getScreen_x() - (91 & 47), var4.getScreen_y() - (120 & 87), 111 & 27, 101 & 63);
            this.sn.setVisible((boolean)(2 & 5));
         } else {
            if (var1 == (87 & 47)) {
               this.tf.lc = (boolean)(this.tf.lc ? 2 & 5 : 1);
               Class219 var6;
               if (this.tf.lc) {
                  this.tf.sa.setImage("sc/c/55");
                  Class436 var7 = this.tf.uc;
                  var6 = this;
                  var7.setVisible(this.tf.po);
                  this.tf.sa.setVisible(this.tf.po);
               } else {
                  this.tf.sa.setImage("sc/c/48");
                  var6 = this;
                  this.tf.uc.setVisible((boolean)(3 ^ 3));
                  this.tf.sa.setVisible((boolean)(--1));
               }

               var6.tf.q();
            }

         }
      } else {
         var10000 = 2 & 5;
         var10002 = --3;
         var2.setImage("sc/c/15");
         var2.ab(var10002);

         for(var3 = var10000; var10000 < this.sp.size(); var10000 = var3) {
            var5 = this.sp.get(var3);
            ++var3;
            ((Class441)var5).setVisible((boolean)(4 ^ 5));
         }

         for(var10000 = var3 = 3 >> 2; var10000 < this.tg.size(); var10000 = var3) {
            var5 = this.tg.get(var3);
            ++var3;
            ((Class441)var5).setVisible((boolean)(3 & 5));
         }

      }
   }

   public void cc() {
      ScreenData var1 = this.aej.screenData;

      int var10000;
      int var2;
      for(var10000 = var2 = 3 ^ 3; var10000 < this.tz.length; var10000 = var2) {
         <undefinedtype> var4 = this.tz[var2];
         int var10001 = var1.getScreen_x() - (this.tz.length - var2) * (55 & 111);
         int var10002 = var1.getScreen_y() - (55 & 111);
         ++var2;
         var4.setBounds(var10001, var10002, 55 & 111, 55 & 111);
      }

      var10000 = 3 >> 2;
      this.tl.setBounds(--2, var1.getScreen_y() - (62 & 87), 39 & 127, 125 & 62);
      this.ti.setBounds(53 & 126, var1.getScreen_y() - (31 & 118), var1.getScreen_x() - (26475 & 6902), 87 & 58);

      for(var2 = var10000; var10000 < this.ta.length; var10000 = var2) {
         if (var2 == 0) {
            this.ta[var2].setBounds(var1.getScreen_x() - (26495 & 6834), var1.getScreen_y() - (58 & 93), 51 & 111, 23 & 123);
         } else if (var2 == 5 >> 2) {
            this.ta[var2].setBounds(var1.getScreen_x() - (14315 & 18975), var1.getScreen_y() - (127 & 26), 17, 27);
         } else if (var2 == (1 ^ 3)) {
            this.ta[var2].setBounds(var1.getScreen_x() - 498, var1.getScreen_y() - 22, 21, 21);
         }

         ++var2;
      }

      this.st.setBounds(5 >> 3, var1.getScreen_y() - 42, var1.getScreen_x() - 468, 42);
      if (this.tx.isVisible()) {
         this.tx.cc();
      }

      this.sv.cc();
      this.tb.setBounds(var1.getScreen_x() - 106, 11, 98, 50);
      this.tu.setBounds(var1.getScreen_x() - 180, 2 & 5, 181, 75);
      this.sz.setBounds(var1.getScreen_x() - 175, 10, 60, 60);
      this.d();
      this.tv.setBounds(var1.getScreen_x() - 59, var1.getScreen_y() - 150, 59, 25);
      this.tx.mq.setBounds(var1.getScreen_x() - 59, var1.getScreen_y() - 175, 59, 25);
      var2 = (int)((double)var1.Screen_x * 0.88D);
      int var3 = (int)((double)var1.Screen_y * 0.3D);
      this.tx.mr.setBounds(Math.max(var2, var1.Screen_x - 100) + 60, var3 + 75, 32, 108);
      this.sn.cc();
      this.to.setBounds(var1.getScreen_x() - 332, var1.getScreen_y() - 80, 11, 37);
      if (this.ty != null) {
         this.ty.setBounds(223 + (this.aej.screenData.Screen_x - 892) / --2, 5 >> 3, 358, 75);
      }

      if (this.tf != null) {
         this.tf.q();
      }

      if (this.tr != null) {
         this.tr.q();
      }

   }

   public void go() {
      if (this.tf != null) {
         this.tf.cc();
      }
   }

   public Class600 kp() {
      return this.tk;
   }

   public Class601 kq() {
      return this.tt;
   }

   public void kr(int var1, double var2) {
      this.tb.kz(var1, var2);
   }

   public synchronized void dg() {
      if (this.tm == null) {
         ScreenData var1 = this.aej.screenData;
         this.tm = new Class436() {
            private Class245[] cj;

            public {
               int var10001 = --5;
               Class245[] var3 = new Class245[var10001];
               boolean var10003 = true;
               this.cj = var3;

               int var2;
               for(int var10000 = var2 = 3 ^ 3; var10000 < this.cj.length; var10000 = var2) {
                  this.cj[var2] = new Class245();
                  this.cj[var2].setFont(Class681.ce);
                  this.cj[var2].setForeground(Color.white);
                  this.cj[var2].setHorizontalAlignment(2 & 5);
                  this.cj[var2].addMouseListener(new Class57(--2 + var2, Class219.this.gk()));
                  this.cj[var2].setText(var2 == 0 ? "当前" : (var2 == --1 ? "组队" : (var2 == --2 ? "帮派" : (var2 == --3 ? "世界" : "传音"))));
                  this.cj[var2].setBounds(--1, --1 + (51 & 94) * var2, 111 & 61, 90 & 55);
                  this.add(this.cj[var2++]);
               }

            }

            public void ab(int var1) {
               int var2;
               for(int var10000 = var2 = 2 & 5; var10000 < this.cj.length; var10000 = var2) {
                  this.cj[var2].eq(var2 == var1 ? Class511.q("sc/c/26", --5, --5, --5, --5, (boolean)(3 >> 2)) : null);
                  ++var2;
               }

            }
         };
         this.tm.setBounds(3 ^ 3, var1.getScreen_y() - (118 & 127), 111 & 63, 124 & 95);
         this.add(this.tm, 3 ^ 3);
      } else {
         this.dp(-4 >> 2);
         this.tm.setVisible((boolean)(this.tm.isVisible() ? 3 & 4 : 1));
      }
   }

   public JTextField jj() {
      return this.ti;
   }

   public void o() {
      int var5 = 3 ^ 3;
      this.sp = new ArrayList();
      GameClient var4 = this.uw();

      int var3;
      for(int var10000 = var3 = 3 & 4; var10000 < var4.gn.length(); var10000 = var3) {
         char var2 = var4.gn.charAt(var3);
         Class441 var1 = null;
         Class441 var6;
         if (var2 == (113 & 111)) {
            var6 = var1 = new Class441("sc/b/B434.png", 3 >> 1, 55 & 122, this);
         } else if (var2 == (119 & 106)) {
            var6 = var1 = new Class441("sc/b/B385.png", 3 >> 1, 62 & 121, this);
         } else if (var2 == (115 & 111)) {
            var6 = var1 = new Class441("sc/b/B394.png", 3 >> 1, 123 & 61, this);
         } else if (var2 == (100 & 127)) {
            var6 = var1 = new Class441("sc/b/B22.png", 5 >> 2, 125 & 54, this);
         } else if (var2 == (125 & 103)) {
            var6 = var1 = new Class441("sc/b/B466.png", 5 >> 2, 86 & 109, this);
         } else if (var2 == (102 & 127)) {
            var6 = var1 = new Class441("sc/b/B464.png", 3 >> 1, 32766 & 151, this);
         } else {
            if (var2 == (127 & 103)) {
               var1 = new Class441("sc/b/B465.png", --1, 126 & 51, this);
            }

            var6 = var1;
         }

         if (var6 != null) {
            Class219 var7;
            if (var2 == (105 & 119)) {
               var7 = this;
               var1.setBounds((123 & 23) + 60 * var5, 81, 52, 52);
            } else if (var2 == 'b') {
               var7 = this;
               var1.setBounds(21 + 60 * var5, 82, 49, 49);
            } else if (var2 == 'c') {
               var7 = this;
               var1.setBounds(19 + 60 * var5, 66, 59, 72);
            } else if (var2 == 'd') {
               var7 = this;
               var1.setBounds(19 + 60 * var5, 80, 53, 53);
            } else if (var2 == 'e') {
               var7 = this;
               var1.setBounds(19 + 60 * var5, 84, 53, 44);
            } else if (var2 == 'f') {
               var7 = this;
               var1.setBounds(19 + 60 * var5, 84, 53, 44);
            } else {
               if (var2 == 'g') {
                  var1.setBounds(19 + 60 * var5, 84, 53, 44);
               }

               var7 = this;
            }

            var7.add(var1);
            ++var5;
            this.sp.add(var1);
         }

         ++var3;
      }

   }

   public void dp(int var1) {
      if (this.tm != null) {
         this.tm.ab(var1);
      }

   }

   public void p() {
      List var5 = this.ks();
      int var6 = this.ci().size();
      int var8 = this.kf().ae() == --3 ? 5 >> 2 : 0;

      int var4;
      for(int var10000 = var4 = 2 & 5; var10000 < var5.size(); var10000 = var4) {
         Class441 var1 = (Class441)var5.get(var4);
         int var2;
         int var7 = (var2 = var6 + (var5.size() - (5 >> 2) - var4)) % --4 * (127 & 60) + (19 & 127);
         var2 = var2 / --4 * (55 & 127) + (81 & 126);

         Class441 var10;
         label42: {
            label41: {
               try {
                  int var3 = 0;
                  var10 = var1;

                  while(var10.getImgW() == -4 >> 2) {
                     if (var3 >= (90 & 47)) {
                        break label41;
                     }

                     var10 = var1;
                     ++var3;
                     var1.getImageSize();
                     Thread.sleep(5L);
                  }
               } catch (Exception var9) {
                  var9.printStackTrace();
               }

               var10 = var1;
               break label42;
            }

            var10 = var1;
         }

         if (var10.getImage() == Class511.p()) {
            var10 = var1;
            var1.setBounds(var7, var2, 59 & 108, 59 & 108);
         } else {
            var10 = var1;
            var1.setBounds(var7, var2, var1.getImgW(), var1.getImgH());
         }

         ++var4;
         var10.setVisible((boolean)var8);
      }

   }

   public List<Class441> ks() {
      return this.tg;
   }

   public Class322[] kt() {
      return this.sx;
   }

   public void as(int var1) {
      this.te = var1;
      Class219 var10000;
      if (this.te == 0) {
         this.tl.fw("sc/c/17");
         var10000 = this;
      } else if (this.te == --1) {
         var10000 = this;
         this.tl.fw("sc/c/18");
      } else if (this.te == (1 ^ 3)) {
         var10000 = this;
         this.tl.fw("sc/c/19");
      } else if (this.te == --3) {
         var10000 = this;
         this.tl.fw("sc/c/20");
      } else {
         if (this.te == --4) {
            this.tl.fw("sc/c/21");
         }

         var10000 = this;
      }

      var10000.dg();
   }


   private void s() {
      UseCardBean var5 = this.vd().getLimit("限时礼包");
      Class441 var2 = null;
      int var4 = --5;
      List var3 = this.ks();
      int var1;
      int var10000 = var1 = 2 & 5;

      UseCardBean var9;
      while(true) {
         if (var10000 >= var3.size()) {
            var9 = var5;
            break;
         }

         Class441 var6;
         if ((var6 = (Class441)var3.get(var1)).tp() == var4) {
            var2 = var6;
            var9 = var5;
            break;
         }

         ++var1;
         var10000 = var1;
      }

      Class219 var10;
      label26: {
         if (var9 != null) {
            if (var2 == null) {
               Class441 var7 = new Class441("sc/b/vicon" + var4 + ".png", --1, 2 & 5, this);
               var7.ab(var4);
               this.add(var7);
               var3.add(var7);
               var10 = this;
               this.p();
               break label26;
            }
         } else if (var2 != null) {
            var3.remove(var2);
            this.remove(var2);
            this.p();
         }

         var10 = this;
      }

      Class316 var8;
      if ((var8 = (Class316)var10.aej.getFormManagement().m(25831 & 7103)) != null) {
         var8.as(3 >> 1);
      }

      this.sw = (boolean)(2 & 5);
   }

   public synchronized void ku(RoleShow var1, TeamBean var2) {
      int var10000;
      int var4;
      if (var2 == null) {
         if (this.ty != null) {
            for(var10000 = var4 = 2 & 5; var10000 < this.ty.by.length; var10000 = var4) {
               this.ty.by[var4++] = null;
            }

            this.ty.setVisible((boolean)(3 >> 2));
         }

      } else {
         if (this.ty == null) {
            this.ty = new JComponent() {
               Image bx;
               Image[] by;
               Class554[] bz;

               protected void paintComponent(Graphics var1) {
                  int var10000 = 3 >> 2;
                  super.paintComponent(var1);

                  for(int var2 = var10000; var10000 < this.by.length; var10000 = var2) {
                     if (this.by[var2] == null) {
                        return;
                     }

                     var1.drawImage(this.bx, var2 * (71 & 127), 3 ^ 3, (ImageObserver)null);
                     Image var10002 = this.by[var2];
                     int var10003 = var2 * (111 & 87) + (79 & 55);
                     int var10004 = 47 & 87;
                     int var10005 = 124 & 63;
                     ++var2;
                     var1.drawImage(var10002, var10003, var10004, var10005, var10005, (ImageObserver)null);
                  }

               }

               public {
                  int var10001 = --5;
                  this.bx = Class511.a("sc/c/53");
                  Image[] var2 = new Image[var10001];
                  boolean var10003 = true;
                  this.by = var2;
                  Class554[] var3 = new Class554[--4];
                  var10003 = true;
                  this.bz = var3;
                  this.setVisible((boolean)(3 & 4));
               }
            };
            this.add(this.ty);
         }

         var4 = ((TeamRole)var2.getTeams().get(3 ^ 3)).getRoleId().compareTo(var1.getRole_id()) == 0 ? 2 ^ 3 : 0;
         int var3 = 3 ^ 3;
         int var5 = var2.getTeams().size();

         for(var10000 = var3; var10000 < 5; var10000 = var3) {
            TeamRole var6 = var3 < var5 ? (TeamRole)var2.getTeams().get(var3) : null;
            if (var6 != null) {
               this.ty.by[var3] = Class511.a(Class222.l("s" + var6.getSpeciesId().intValue()));
               if (var3 != 0) {
                  String var7 = null;
                  String var8;
                  if (var4 != 0 && var6.getState() < 0) {
                     var8 = var7 = "召";
                  } else {
                     if (var6.getRoleId().compareTo(var1.getRole_id()) == 0) {
                        var7 = var6.getState() >= 0 ? "离" : "归";
                     }

                     var8 = var7;
                  }

                  if (var8 != null) {
                     if (this.ty.bz[var3 - (3 >> 1)] == null) {
                        this.ty.bz[var3 - --1] = new Class554("sc/c/52", 3 >> 1, 2 & 5, Class681.bm, Class681.an, (String)null, this);
                        this.ty.bz[var3 - (3 >> 1)].setBounds(var3 * (87 & 111), 55 & 127, 31 & 113, 31 & 113);
                        this.ty.add(this.ty.bz[var3 - (3 >> 1)], 3 >> 2);
                     }

                     this.ty.bz[var3 - (4 ^ 5)].setText(var7);
                     Class219 var9;
                     if (var7.equals("召")) {
                        var9 = this;
                        this.ty.bz[var3 - (3 >> 1)].ab((13 & 122) + var3);
                     } else if (var7.equals("离")) {
                        var9 = this;
                        this.ty.bz[var3 - (3 >> 1)].ab(127 & 7);
                     } else {
                        if (var7.equals("归")) {
                           this.ty.bz[var3 - (3 & 5)].ab(42 & 93);
                        }

                        var9 = this;
                     }

                     var9.ty.bz[var3 - (4 ^ 5)].setVisible((boolean)(3 & 5));
                  } else if (this.ty.bz[var3 - (3 >> 1)] != null) {
                     this.ty.bz[var3 - (2 ^ 3)].setVisible(false);
                  }
               }
            } else {
               this.ty.by[var3] = null;
               if (var3 != 0 && this.ty.bz[var3 - 1] != null) {
                  this.ty.bz[var3 - 1].setVisible(false);
               }
            }

            ++var3;
         }

         this.ty.setBounds((18431 & 14559) + (this.aej.screenData.Screen_x - (28541 & 5118)) / (1 ^ 3), 0, 8039 & 25086, 95 & 107);
         this.ty.setVisible(this.aej.getBattleScene() == null);
      }
   }

   public List<Class441> ci() {
      return this.sp;
   }

   public Class601 kw() {
      return this.ua;
   }

   public void kx(int[] var1, RoleSummoning var2) {
      if (var1 == null) {
         this.td.kz(5 >> 3, 0.0D);
         this.td.kz(--1, 0.0D);
         this.td.kz(5 >> 1, 0.0D);
      } else {
         this.td.kz(3 >> 2, (double)var2.getBasishp(var1[3 >> 2]) / (double)var1[3 >> 2]);
         this.td.kz(4 ^ 5, (double)var2.getBasismp(var1[4 ^ 5]) / (double)var1[5 >> 2]);
         this.td.kz(--2, var2.getExp().doubleValue() / (double)this.vc().d(var2.getTurnRount(), Class224.p(var2.getGrade())));
      }
   }

   public int e() {
      return this.te;
   }

   public Class219(GameView var1) {
      super(-4 >> 2, -4 >> 2, Class345.aei, var1);
      ScreenData var2 = var1.screenData;
      this.va(3 ^ 3, 3 ^ 3, var2.getScreen_x(), var2.getScreen_y(), Class345.aei);
      this.sp = new ArrayList();
      this.tg = new ArrayList();
      <undefinedtype>[] var10001 = new <undefinedtype>[60 & 79];
      boolean var10003 = true;
      this.tz = var10001;

      int var3;
      int var10000;
      for(var10000 = var3 = 3 >> 2; var10000 < this.tz.length; var10000 = var3) {
         this.tz[var3] = new Class436(var3) {
            private int ay;
            private Class322 az;
            private boolean bb;
            private Class8 bc;

            protected void paintChildren(Graphics var1) {
               super.paintChildren(var1);
               if (this.bb) {
                  <undefinedtype> var10000;
                  label23: {
                     if (this.bc == null) {
                        if (this.ay == --3) {
                           var10000 = this;
                           this.bc = Class222.b(Class222.v);
                           break label23;
                        }

                        if (this.ay == (75 & 61)) {
                           this.bc = Class222.b(Class222.q);
                        }
                     }

                     var10000 = this;
                  }

                  if (var10000.bc != null) {
                     this.bc.d(Class280.l(), 3 >> 2);
                     this.bc.aa(var1, --3, --3);
                  }

               }
            }

            public {
               this.ay = var2;
               this.az = new Class322("sc/c/" + ((28 & 127) + var2), 3 & 5, (63 & 74) + var2, Class219.this.gk());
               this.az.setBounds(--3, --3, 123 & 37, 123 & 37);
               this.add(this.az);
            }

            public void ak(boolean var1) {
               this.bb = var1;
               this.bc = null;
            }
         };
         this.add(this.tz[var3++]);
      }

      int var6 = --3;
      this.st = new Class436(Class511.q("sc/c/16", 63 & 124, 25 & 126, 117 & 30, 127 & 10, (boolean)(5 >> 3)));
      this.ti = Class133.l(Class681.bx, Color.white);
      this.ti.setDocument(new Class175());
      this.ti.setFocusable((boolean)(5 >> 2));
      this.tl = new Class436("sc/c/17");
      this.tl.addMouseListener(new Class57(2 ^ 3, this));
      Class322[] var7 = new Class322[var6];
      var10003 = true;
      this.ta = var7;

      Class219 var5;
      for(var10000 = var3 = 5 >> 3; var10000 < this.ta.length; var10000 = var3) {
         if (var3 == 0) {
            var5 = this;
            this.ta[var3] = new Class322("sc/c/22", 5 >> 2, 62 & 93, this);
         } else if (var3 == (2 ^ 3)) {
            var5 = this;
            this.ta[var3] = new Class322("sc/c/23", --1, 3 & 4, this);
         } else {
            if (var3 == 5 >> 1) {
               this.ta[var3] = new Class322("sc/c/24", --1, 3 & 4, this);
            }

            var5 = this;
         }

         var5.add(this.ta[var3++]);
      }

      this.add(this.ti);
      this.add(this.tl);
      this.add(this.st);
      this.tx = new Class272(var1);
      this.tx.setVisible((boolean)(5 >> 3));
      this.add(this.tx);
      this.tv = new Class600("sc/e/7.png", 4 ^ 5, 107 & 29, Class681.ak, Class681.c, "自动", this);
      this.tv.setBounds(3 & 4, 3 & 4, 127 & 59, 59 & 93);
      this.tv.setVisible((boolean)(3 >> 2));
      this.add(this.tv);
      this.tk = new Class600("sc/e/40.png", 5 >> 2, 27 & 110, Class681.bm, (Color[])null, "详", this);
      this.tk.setBounds(30447 & 2462, 127 & 65, 23 & 122, 23 & 122);
      this.tk.setVisible((boolean)(3 ^ 3));
      this.add(this.tk);
      this.ua = new Class601("sc/b/bap.png", 5 >> 2, 63 & 75, this);
      this.ua.setBounds(12027 & 20877, --3, 47 & 124, 62);
      this.ua.setVisible((boolean)(3 >> 2));
      this.add(this.ua);
      this.tt = new Class601("sc/b/bap.png", 1, 12, this);
      this.tt.setBounds(182, --3, 44, 62);
      this.tt.setVisible(false);
      this.add(this.tt);
      this.sv = new Class29(var1);
      this.add(this.sv);
      this.th = new Class436("sc/c/6");
      this.th.setBounds(0, 0, 223, 67);
      this.lf = new JLabel("长安城", --4);
      this.tj = new JLabel("[0,0]");
      this.bs = new JLabel(Class280.b(), 0);
      this.tj.setForeground(Color.white);
      this.lf.setForeground(Color.white);
      this.bs.setForeground(Color.white);
      this.tj.setFont(Class681.ab);
      this.lf.setFont(Class681.ab);
      this.bs.setFont(Class681.ce);
      this.lf.setBounds(0, 14, 90, 16);
      this.tj.setBounds(100, 14, 100, 16);
      if (this.uw().k(--4)) {
         this.bs.setBounds(113, 45, 75, 20);
         var5 = this;
      } else {
         this.bs.setBounds(88, 45, 95, 20);
         var5 = this;
      }

      var5.tc = new Class322("sc/c/8", 1, 1, this);
      this.tc.setBounds(180, --3, 20, 20);
      this.tq = new Class322("sc/c/9", 1, 5 >> 1, this);
      this.tq.setBounds(182, 23, 17, 17);
      this.sr = new Class322("sc/c/7", 1, 0, this);
      this.sr.setBounds(170, 32, 11, 11);
      var7 = new Class322[this.uw().k(--4) ? --5 : 4];
      var10003 = true;
      this.sx = var7;

      for(var10000 = var3 = 0; var10000 < this.sx.length; var10000 = var3) {
         if (var3 == 0) {
            var10000 = var3;
            this.sx[var3] = new Class322("sc/c/10", 1, 0, this);
         } else if (var3 == 1) {
            var10000 = var3;
            this.sx[var3] = new Class322("sc/c/11", 1, 31, this);
         } else if (var3 == (1 ^ 3)) {
            Class322[] var9 = this.sx;
            Class322 var8 = new Class322;
            byte var10006;
            Class219 var10007;
            if (this.uw().n(1 ^ 3, 12)) {
               var10006 = 33;
               var10007 = this;
            } else {
               var10006 = 0;
               var10007 = this;
            }

            var8.<init>("sc/c/12", 1, var10006, var10007);
            var9[var3] = var8;
            var10000 = var3;
         } else if (var3 == --3) {
            var10000 = var3;
            this.sx[var3] = new Class322("sc/c/13", 1, 32, this);
         } else {
            if (var3 == --4) {
               this.sx[var3] = new Class322("sc/c/165", 1, 34, this);
            }

            var10000 = var3;
         }

         if (var10000 == 4) {
            var5 = this;
            this.sx[var3].setBounds(var3 * 22, 45, 36, 20);
         } else {
            var5 = this;
            this.sx[var3].setBounds(var3 * 22, 45, 20, 20);
         }

         var5.add(this.sx[var3++]);
      }

      this.add(this.tc);
      this.add(this.tq);
      this.add(this.sr);
      this.add(this.lf);
      this.add(this.tj);
      this.add(this.bs);
      this.add(this.th);
      Color var4 = new Color(0, 0, 0);
      this.setBackground(var4);
      if (this.uw().VALUE.indexOf(76) == -4 >> 2) {
         this.tn = new JLabel();
         this.tn.setBounds(205, 5, 35, 35);
         this.tn.addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent var1) {
            }

            public void mouseExited(MouseEvent var1) {
            }

            public void mouseEntered(MouseEvent var1) {
            }

            public void mousePressed(MouseEvent var1) {
               Class658.cy(111 & 55, Class219.this.ux());
            }

            public void mouseReleased(MouseEvent var1) {
            }
         });
         this.add(this.tn);
      }

      if (this.uw().VALUE.indexOf(65) != -1) {
         this.so = new JLabel();
         this.so.setBounds(245, 5, 35, 35);
         this.so.addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent var1) {
            }

            public void mousePressed(MouseEvent var1) {
               Class658.cy(119 & 95, Class219.this.ux());
            }

            public void mouseExited(MouseEvent var1) {
            }

            public void mouseEntered(MouseEvent var1) {
            }

            public void mouseReleased(MouseEvent var1) {
            }
         });
         this.add(this.so);
      }

      this.tb = new MouseListener(98, 0) {
         private int ek;
         private int aee;
         private int em;
         private int dm;
         private int dn;
         private int do;
         private int dp;
         private int gv;
         private int gc;
         private int gw;
         private boolean po;
         private int ay;
         private int j;
         private int bn;
         private int cy;
         private int m;

         protected void paintComponent(Graphics var1) {
            if (this.do > 0) {
               var1.drawImage(Class511.d, this.gv, this.dn, this.do, this.gw, (ImageObserver)null);
            }

            if (this.m > 0) {
               var1.drawImage(Class511.j, this.bn, this.dm, this.m, this.em, (ImageObserver)null);
            }

            if (this.gc > 0) {
               var1.drawImage(Class511.i, this.dp, this.ay, this.gc, this.cy, (ImageObserver)null);
            }

         }

         public void q() {
            if (this.aee >= 0 && this.aee <= 5 >> 1) {
               Class270 var1 = (Class270)Class219.this.ve().e(110 & 63);
               Class514 var3;
               if (this.j == 0) {
                  LoginResult var2 = Class219.this.vd().getLoginResult();
                  if (this.aee == 0) {
                     int var6 = Class224.g(var2.getGrade());
                     int var4 = Class224.d(var2.getGrade());
                     if (var6 <= --3) {
                        var1.f("EXP(经验): " + var2.getExperience().toString() + "/" + Class219.this.vc().ac(var6, var4));
                        return;
                     }

                     var1.f("EXP(经验): " + var2.getExperience().toString());
                     return;
                  }

                  if (this.aee == (3 & 5)) {
                     var3 = Class219.this.aej.getBattleScene() != null ? Class219.this.aej.getBattleScene().getBattleUnit(3 >> 2, Class219.this.aej.roleData.getRoleId()) : null;
                     if (var3 != null) {
                        var1.f("HP(气血): " + var3.bt().getHp_Current() + "/" + var3.bt().getHp_Total());
                        return;
                     }

                     var1.f("HP(气血): " + var2.getHp().intValue() + "/" + Class219.this.vd().getRoleProperty().getHp());
                     return;
                  }

                  if (this.aee == 5 >> 1) {
                     var3 = Class219.this.aej.getBattleScene() != null ? Class219.this.aej.getBattleScene().getBattleUnit(2 & 5, Class219.this.aej.roleData.getRoleId()) : null;
                     if (var3 != null) {
                        var1.f("MP(法力): " + var3.bt().getMp_Current() + "/" + var3.bt().getMp_Total());
                        return;
                     }

                     var1.f("MP(法力): " + var2.getMp().intValue() + "/" + Class219.this.vd().getRoleProperty().getMp());
                     return;
                  }
               } else if (this.j == (3 & 5)) {
                  RoleSummoning var5;
                  if ((var5 = Class219.this.vd().getChosePet()) == null) {
                     return;
                  }

                  if (this.aee == 0) {
                     var1.f("EXP(经验): " + var5.getExp().toString() + "/" + Class219.this.vc().d(var5.getTurnRount(), Class224.p(var5.getGrade())));
                     return;
                  }

                  int[] var7;
                  if (this.aee == --1) {
                     var3 = Class219.this.aej.getBattleScene() != null ? Class219.this.aej.getBattleScene().getBattleUnit(3 >> 1, var5.getSid().longValue()) : null;
                     if (var3 != null) {
                        var1.f("HP(气血): " + var3.bt().getHp_Current() + "/" + var3.bt().getHp_Total());
                        return;
                     }

                     var7 = PetProperty.getPetHMASp(var5, Class219.this.vd());
                     var1.f("HP(气血): " + var5.getBasishp(var7[3 >> 2]) + "/" + var7[3 ^ 3]);
                     return;
                  }

                  if (this.aee == (1 ^ 3)) {
                     var3 = Class219.this.aej.getBattleScene() != null ? Class219.this.aej.getBattleScene().getBattleUnit(5 >> 2, var5.getSid().longValue()) : null;
                     if (var3 != null) {
                        var1.f("MP(法力): " + var3.bt().getMp_Current() + "/" + var3.bt().getMp_Total());
                        return;
                     }

                     var7 = PetProperty.getPetHMASp(var5, Class219.this.vd());
                     var1.f("MP(法力): " + var5.getBasismp(var7[3 & 5]) + "/" + var7[3 & 5]);
                  }
               }

            } else {
               Class219.this.ve().n(63 & 110);
            }
         }

         public void mouseEntered(MouseEvent var1) {
            this.po = Boolean.TRUE;
            int var2 = this.j == 0 ? 81 & 63 : 15;
            this.aee = var1.getY() / var2;
            this.q();
         }

         public void mouseMoved(MouseEvent var1) {
            int var2 = this.j == 0 ? 29 & 115 : 15;
            if (this.aee != var1.getY() / var2) {
               this.aee = var1.getY() / var2;
               this.q();
            }
         }

         public void mouseReleased(MouseEvent var1) {
         }

         public void mouseDragged(MouseEvent var1) {
         }

         public void mouseExited(MouseEvent var1) {
            int var10002 = -4 >> 2;
            this.po = Boolean.FALSE;
            this.aee = var10002;
            this.q();
         }

         public {
            int var10003 = 3 & 4;
            this.j = var3;
            this.ek = var2;
            this.gv = this.bn = this.dp = var10003;
            <undefinedtype> var10000;
            if (var3 == 0) {
               this.gw = this.em = this.cy = 78 & 61;
               int var10002 = 3 ^ 3;
               var10000 = this;
               int var10004 = 63 & 98;
               this.dn = 59 & 85;
               this.dm = var10004;
               this.ay = var10002;
            } else {
               if (var3 == --1) {
                  this.gw = this.em = this.cy = 110 & 29;
                  int var10001 = 5 >> 3;
                  var10003 = 127 & 30;
                  this.dn = 47 & 95;
                  this.dm = var10003;
                  this.ay = var10001;
               }

               var10000 = this;
            }

            var10000.addMouseListener(this);
            this.addMouseMotionListener(this);
         }

         public void mousePressed(MouseEvent var1) {
         }

         public void kz(int var1, double var2) {
            int var10000;
            int var4;
            if ((var4 = (int)(var2 * (double)this.ek)) < 0) {
               var4 = 5 >> 3;
               var10000 = var1;
            } else {
               if (var4 > this.ek) {
                  var4 = this.ek;
               }

               var10000 = var1;
            }

            if (var10000 == 0) {
               this.do = var4;
            } else if (var1 == --1) {
               this.m = var4;
            } else {
               if (var1 == 5 >> 1) {
                  this.gc = var4;
               }

            }
         }

         public void mouseClicked(MouseEvent var1) {
            int var2 = this.j == 0 ? 17 & 127 : 15;
            if (Class219.this.ux().getBattleScene() == null && var1.getY() % var2 <= (111 & 28)) {
               int var3;
               if ((var3 = var1.getY() / var2 - (5 >> 2)) >= 0 && var3 < 5 >> 1) {
                  Class57.aly(var3 + (this.j == 0 ? 3 & 4 : 2), Class219.this.vd());
               }
            }
         }
      };
      this.td = new MouseListener(70, 1) {
         private int ek;
         private int aee;
         private int em;
         private int dm;
         private int dn;
         private int do;
         private int dp;
         private int gv;
         private int gc;
         private int gw;
         private boolean po;
         private int ay;
         private int j;
         private int bn;
         private int cy;
         private int m;

         protected void paintComponent(Graphics var1) {
            if (this.do > 0) {
               var1.drawImage(Class511.d, this.gv, this.dn, this.do, this.gw, (ImageObserver)null);
            }

            if (this.m > 0) {
               var1.drawImage(Class511.j, this.bn, this.dm, this.m, this.em, (ImageObserver)null);
            }

            if (this.gc > 0) {
               var1.drawImage(Class511.i, this.dp, this.ay, this.gc, this.cy, (ImageObserver)null);
            }

         }

         public void q() {
            if (this.aee >= 0 && this.aee <= 5 >> 1) {
               Class270 var1 = (Class270)Class219.this.ve().e(110 & 63);
               Class514 var3;
               if (this.j == 0) {
                  LoginResult var2 = Class219.this.vd().getLoginResult();
                  if (this.aee == 0) {
                     int var6 = Class224.g(var2.getGrade());
                     int var4 = Class224.d(var2.getGrade());
                     if (var6 <= --3) {
                        var1.f("EXP(经验): " + var2.getExperience().toString() + "/" + Class219.this.vc().ac(var6, var4));
                        return;
                     }

                     var1.f("EXP(经验): " + var2.getExperience().toString());
                     return;
                  }

                  if (this.aee == (3 & 5)) {
                     var3 = Class219.this.aej.getBattleScene() != null ? Class219.this.aej.getBattleScene().getBattleUnit(3 >> 2, Class219.this.aej.roleData.getRoleId()) : null;
                     if (var3 != null) {
                        var1.f("HP(气血): " + var3.bt().getHp_Current() + "/" + var3.bt().getHp_Total());
                        return;
                     }

                     var1.f("HP(气血): " + var2.getHp().intValue() + "/" + Class219.this.vd().getRoleProperty().getHp());
                     return;
                  }

                  if (this.aee == 5 >> 1) {
                     var3 = Class219.this.aej.getBattleScene() != null ? Class219.this.aej.getBattleScene().getBattleUnit(2 & 5, Class219.this.aej.roleData.getRoleId()) : null;
                     if (var3 != null) {
                        var1.f("MP(法力): " + var3.bt().getMp_Current() + "/" + var3.bt().getMp_Total());
                        return;
                     }

                     var1.f("MP(法力): " + var2.getMp().intValue() + "/" + Class219.this.vd().getRoleProperty().getMp());
                     return;
                  }
               } else if (this.j == (3 & 5)) {
                  RoleSummoning var5;
                  if ((var5 = Class219.this.vd().getChosePet()) == null) {
                     return;
                  }

                  if (this.aee == 0) {
                     var1.f("EXP(经验): " + var5.getExp().toString() + "/" + Class219.this.vc().d(var5.getTurnRount(), Class224.p(var5.getGrade())));
                     return;
                  }

                  int[] var7;
                  if (this.aee == --1) {
                     var3 = Class219.this.aej.getBattleScene() != null ? Class219.this.aej.getBattleScene().getBattleUnit(3 >> 1, var5.getSid().longValue()) : null;
                     if (var3 != null) {
                        var1.f("HP(气血): " + var3.bt().getHp_Current() + "/" + var3.bt().getHp_Total());
                        return;
                     }

                     var7 = PetProperty.getPetHMASp(var5, Class219.this.vd());
                     var1.f("HP(气血): " + var5.getBasishp(var7[3 >> 2]) + "/" + var7[3 ^ 3]);
                     return;
                  }

                  if (this.aee == (1 ^ 3)) {
                     var3 = Class219.this.aej.getBattleScene() != null ? Class219.this.aej.getBattleScene().getBattleUnit(5 >> 2, var5.getSid().longValue()) : null;
                     if (var3 != null) {
                        var1.f("MP(法力): " + var3.bt().getMp_Current() + "/" + var3.bt().getMp_Total());
                        return;
                     }

                     var7 = PetProperty.getPetHMASp(var5, Class219.this.vd());
                     var1.f("MP(法力): " + var5.getBasismp(var7[3 & 5]) + "/" + var7[3 & 5]);
                  }
               }

            } else {
               Class219.this.ve().n(63 & 110);
            }
         }

         public void mouseEntered(MouseEvent var1) {
            this.po = Boolean.TRUE;
            int var2 = this.j == 0 ? 81 & 63 : 15;
            this.aee = var1.getY() / var2;
            this.q();
         }

         public void mouseMoved(MouseEvent var1) {
            int var2 = this.j == 0 ? 29 & 115 : 15;
            if (this.aee != var1.getY() / var2) {
               this.aee = var1.getY() / var2;
               this.q();
            }
         }

         public void mouseReleased(MouseEvent var1) {
         }

         public void mouseDragged(MouseEvent var1) {
         }

         public void mouseExited(MouseEvent var1) {
            int var10002 = -4 >> 2;
            this.po = Boolean.FALSE;
            this.aee = var10002;
            this.q();
         }

         public {
            int var10003 = 3 & 4;
            this.j = var3;
            this.ek = var2;
            this.gv = this.bn = this.dp = var10003;
            <undefinedtype> var10000;
            if (var3 == 0) {
               this.gw = this.em = this.cy = 78 & 61;
               int var10002 = 3 ^ 3;
               var10000 = this;
               int var10004 = 63 & 98;
               this.dn = 59 & 85;
               this.dm = var10004;
               this.ay = var10002;
            } else {
               if (var3 == --1) {
                  this.gw = this.em = this.cy = 110 & 29;
                  int var10001 = 5 >> 3;
                  var10003 = 127 & 30;
                  this.dn = 47 & 95;
                  this.dm = var10003;
                  this.ay = var10001;
               }

               var10000 = this;
            }

            var10000.addMouseListener(this);
            this.addMouseMotionListener(this);
         }

         public void mousePressed(MouseEvent var1) {
         }

         public void kz(int var1, double var2) {
            int var10000;
            int var4;
            if ((var4 = (int)(var2 * (double)this.ek)) < 0) {
               var4 = 5 >> 3;
               var10000 = var1;
            } else {
               if (var4 > this.ek) {
                  var4 = this.ek;
               }

               var10000 = var1;
            }

            if (var10000 == 0) {
               this.do = var4;
            } else if (var1 == --1) {
               this.m = var4;
            } else {
               if (var1 == 5 >> 1) {
                  this.gc = var4;
               }

            }
         }

         public void mouseClicked(MouseEvent var1) {
            int var2 = this.j == 0 ? 17 & 127 : 15;
            if (Class219.this.ux().getBattleScene() == null && var1.getY() % var2 <= (111 & 28)) {
               int var3;
               if ((var3 = var1.getY() / var2 - (5 >> 2)) >= 0 && var3 < 5 >> 1) {
                  Class57.aly(var3 + (this.j == 0 ? 3 & 4 : 2), Class219.this.vd());
               }
            }
         }
      };
      this.tu = new Class436("sc/c/40");
      this.ts = new Class436("sc/c/41");
      this.sz = new Class44(this);
      this.su = new Class44(this);
      this.sz.c(23, 1);
      this.su.c(23, 2);
      this.add(this.tb);
      this.add(this.td);
      this.add(this.tu);
      this.add(this.ts);
      this.add(this.sz);
      this.add(this.su);
      this.o();
      this.jj = new Class322("sc/c/15", 1, 3, this);
      this.jj.setBounds(0, 87, 13, 37);
      this.add(this.jj);
      this.to = new Class322("sc/c/47", 1, 6, this);
      this.sn = new Class90(0, var1);
      this.add(this.to);
      this.add(this.sn);
      this.cc();
      if (sy == null && this.tn != null) {
         sy = Class330.s("sc/mouse/商城.tcp", (short[])null);
      }

      if (sq == null && this.so != null) {
         sq = Class330.s("sc/mouse/奖.tcp", (short[])null);
      }

   }

   protected void paintChildren(Graphics var1) {
      if (this.tw != null) {
         if (!Class394.r(this.lf.getText(), this.tw)) {
            this.lf.setText(this.tw);
         }

         this.tw = null;
      }

      if (this.tp != null) {
         if (!Class394.r(this.tj.getText(), this.tp)) {
            this.tj.setText(this.tp);
         }

         this.tp = null;
      }

      if (this.ss != null) {
         if (!Class394.r(this.bs.getText(), this.ss)) {
            this.bs.setText(this.ss);
         }

         this.ss = null;
      }

      if (this.op) {
         int var10001 = 3 & 4;
         this.kj();
         this.op = (boolean)var10001;
      }

      super.paintChildren(var1);
      if (this.tn != null && this.tn.isVisible()) {
         sy.d(Class280.l(), 2 & 5);
         sy.aa(var1, 8447 & 24525, --5);
      }

      if (this.so != null && this.so.isVisible()) {
         sq.d(Class280.l(), 2 & 5);
         sq.aa(var1, 9471 & 23541, --5);
      }

   }

   public void y(int var1) {
      if (this.tr != null && this.tr.isVisible() && this.tr.cy == var1) {
         this.ke();
      } else {
         if (this.tr == null) {
            this.add(this.tr = new JComponent() {
               int j;
               int cy;
               List<Class322> ez = new ArrayList();

               public void q() {
                  <undefinedtype> var4 = Class219.this.tz[this.cy - (127 & 10)];
                  int var2 = 118 & 127;
                  int var3 = (63 & 88) * this.j;
                  int var1 = var4.getX();
                  int var5 = var4.getY();
                  this.setBounds(Math.min(var1 - (var2 - var4.getWidth()) / --2, Class219.this.aej.screenData.getScreen_x() - var2), var5 - var3, var2, var3);
               }

               public void ab(int var1) {
                  if (this.cy != var1 || var1 == (31 & 109)) {
                     this.cy = var1;
                     Class322 var2 = null;
                     <undefinedtype> var10000;
                     int var10002;
                     int var10003;
                     int var10004;
                     if (var1 == (47 & 93)) {
                        if (Class219.this.vd().teamBean == null) {
                           var2 = this.uj(3 >> 2);
                           var10002 = 23 & 126;
                           var2.setText("组队操作");
                           var2.ab(var10002);
                           var10000 = this;
                           var2 = this.uj(--1);
                           var10002 = --2;
                           var10004 = 127 & 23;
                           var2.setText("创建队伍");
                           var2.ab(var10004);
                           this.j = var10002;
                        } else {
                           var2 = this.uj(0);
                           var10000 = this;
                           var10003 = 22 & 127;
                           var2.setText("组队信息");
                           var2.ab(var10003);
                           this.j = --1;
                        }
                     } else if (var1 == (79 & 63)) {
                        var10000 = this;
                        var2 = this.uj(3 & 4);
                        var10003 = 2 ^ 3;
                        int var10005 = 24 & 127;
                        var2.setText("交易");
                        var2.ab(var10005);
                        var2 = this.uj(var10003);
                        var10002 = 1 ^ 3;
                        var10004 = 89 & 63;
                        var2.setText("给予");
                        var2.ab(var10004);
                        this.j = var10002;
                     } else if (var1 == (55 & 89)) {
                        var2 = this.uj(3 ^ 3);
                        var10002 = 4 ^ 5;
                        var10004 = 127 & 26;
                        var2.setText("坐骑");
                        var2.ab(var10004);
                        var2 = this.uj(var10002);
                        var10002 = 59 & 95;
                        var2.setText("飞行器");
                        var2.ab(var10002);
                        if (Class219.this.aej.getClient().gamePetManual) {
                           var2 = this.uj(--2);
                           int var10001 = 95 & 61;
                           var2.setText("莲叶载书");
                           var2.ab(var10001);
                        }

                        this.j = Class219.this.aej.getClient().gamePetManual ? --3 : 2;
                        var10000 = this;
                     } else {
                        if (var1 == (55 & 93)) {
                           if (Class219.this.uw().n(5 >> 1, 126 & 13)) {
                              var2 = this.uj(5 >> 3);
                              var10000 = this;
                              var10003 = 127 & 61;
                              var2.setText("新手指引");
                              var2.ab(var10003);
                              var2 = this.uj(--1);
                              var10002 = 127 & 62;
                              var2.setText("快捷操作(3)");
                              var2.ab(var10002);
                           } else {
                              var2 = this.uj(0);
                              var10000 = this;
                              var2.setText("协议及隐私");
                              var2.ab(70);
                              var2 = this.uj(3 >> 1);
                              var2.setText("精彩分享");
                              var2.ab(70);
                           }

                           var2 = var10000.uj(2);
                           var2.setText("降妖伏魔");
                           var2.ab(60);
                           var2.setForeground(Color.red);
                           var2 = this.uj(--3);
                           int var10010 = --4;
                           var2.setText("月卡兑换");
                           var2.ab(57);
                           var2.setForeground(Color.red);
                           var2 = this.uj(var10010);
                           int var10009 = --5;
                           var2.setText("累计领取");
                           var2.ab(56);
                           var2.setForeground(Color.red);
                           var2 = this.uj(var10009);
                           var2.setText("兑换合成");
                           var2.ab(55);
                           var2.setForeground(Color.red);
                           var2 = this.uj(6);
                           var2.setText("游戏官网");
                           var2.ab(58);
                           var2 = this.uj(7);
                           var2.setText("仙玉寄售");
                           var2.ab(59);
                           var2.setForeground(Color.red);
                           var2 = this.uj(8);
                           var2.setText("生成制作");
                           var2.ab(54);
                           var2.setForeground(Color.red);
                           var2 = this.uj(9);
                           var2.setText("游戏助手");
                           var2.ab(53);
                           var2.setForeground(Color.red);
                           var2 = this.uj(10);
                           var2.setText("辅助炼化");
                           var2.ab(52);
                           var2.setForeground(Color.red);
                           var2 = this.uj(11);
                           var2.setText("游戏设置");
                           var2.ab(51);
                           var2 = this.uj(12);
                           var2.setText("退出游戏");
                           var2.ab(51);
                           this.j = 13;
                        }

                        var10000 = this;
                     }

                     for(int var3 = var1 = var10000.j; var3 < this.ez.size(); var3 = var1) {
                        Object var4 = this.ez.get(var1);
                        ++var1;
                        ((Class322)var4).setVisible((boolean)(2 & 5));
                     }

                     this.q();
                  }
               }

               public Class322 uj(int var1) {
                  Class322 var2 = var1 < this.ez.size() ? (Class322)this.ez.get(var1) : null;
                  if (var2 == null) {
                     var2 = new Class322("sc/e/25.png", 3 >> 1, 3 ^ 3, Class681.ce, (Color[])null, "", Class219.this.gk());
                     var2.setBounds(3 >> 2, (24 & 127) * var1, 127 & 118, 24 & 127);
                     this.add(var2);
                     this.ez.add(var2);
                  }

                  int var10002 = --1;
                  var2.setForeground(Color.white);
                  var2.setVisible((boolean)var10002);
                  return var2;
               }
            }, 3 >> 2);
         }

         this.tr.ab(var1);
         this.tr.setVisible((boolean)(5 >> 2));
      }
   }

   public void ky(int[] var1, RoleSummoning var2) {
      this.su.ach(Class222.t(var2 != null ? "p" + var2.getSummoningskin() : "p0"));
      this.kx(var1, var2);
   }

   public void jy(int var1, boolean var2) {
      this.tz[var1].ak(var2);
   }

   public void kz(int var1, double var2) {
      this.td.kz(var1, var2);
   }

   public void la(String var1) {
      this.ss = var1;
   }

   public void gt(boolean var1) {
      int var10000 = 5 >> 3;
      this.tc.setVisible(var1);
      this.tq.setVisible(var1);
      this.sr.setVisible(var1);
      this.lf.setVisible(var1);
      this.tj.setVisible(var1);
      this.bs.setVisible(var1);
      this.th.setVisible(var1);

      for(int var2 = var10000; var10000 < this.sx.length; var10000 = var2) {
         this.sx[var2++].setVisible(var1);
      }

      if (this.tn != null) {
         this.tn.setVisible(var1);
      }

      if (this.so != null) {
         this.so.setVisible(var1);
      }

   }

   public void lb(String var1) {
      this.tp = var1;
   }

   public void d() {
      ScreenData var1 = this.aej.screenData;
      if (this.aej.getBattleScene() != null) {
         this.td.setBounds(61 & 127, 79 & 55, 119 & 78, 45 & 126);
         this.ts.setBounds(5 >> 3, 5 >> 3, 446 & 32461, 125 & 63);
         this.su.setBounds(--4, --5, 127 & 50, 127 & 50);
      } else {
         this.td.setBounds(var1.getScreen_x() - (511 & 32510), 31 & 103, 126 & 71, 111 & 60);
         this.ts.setBounds(var1.getScreen_x() - (20795 & 12287), 2 & 5, 940 & 31967, 125 & 63);
         this.su.setBounds(var1.getScreen_x() - (3447 & 29631), --5, 63 & 114, 63 & 114);
      }
   }

   public void r(boolean var1) {
      if (this.ty != null) {
         this.ty.setVisible(var1);
      }

   }

   public void f(String var1) {
      this.tw = var1;
   }
}
