package com.xy.a;

import com.xy.bean.LoginResult;
import com.xy.bean.RoleShow;
import com.xy.bean.TeamBean;
import com.xy.bean.UseCardBean;
import com.xy.entity.RoleSummoning;
import com.xy.entity.TeamRole;
import com.xy.formula.PetProperty;
import com.xy.game.RoleData;
import com.xy.i.Class21;
import com.xy.socket.GameClient;
import com.xy.text.GameView;
import com.xy.text.ScreenData;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Class74 extends com.xy.q.Class30 {
   private com.xy.w.Class18 ads;
   private com.xy.i.Class14 adt;
   private com.xy.i.Class18[] adu;
   private com.xy.i.Class14 adv;
   private com.xy.i.Class18 adw;
   private com.xy.q.Class54 adx;
   private JLabel ady;
   private com.xy.i.Class13 adz;
   private com.xy.i.Class18 aea;
   private JLabel aeb;
   private com.xy.w.Class18 aec;
   private Class9 aed;
   private com.xy.i.Class18 aee;
   public boolean aef;
   private String aeg;
   private JLabel aeh;
   private com.xy.i.Class18 aei;
   private Class61 aej;
   private com.xy.w.Class18 aek;
   private com.xy.q.Class54 ael;
   private List<com.xy.i.Class21> aem;
   static com.xy.w.Class1 aen;
   private String aeo;
   public boolean aep;
   private int xt;
   static com.xy.w.Class1 aeq;
   private String aer;
   private com.xy.w.Class18 aae;
   private List<com.xy.i.Class21> aes;
   private JLabel cy;
   private Class14 aet;
   private com.xy.i.Class18 aeu;
   private JLabel db;
   private Class57 aev;
   private com.xy.i.Class18[] aew;
   private Class55 aex;
   private Class35 aey;
   private Class14 aez;
   private Class102 afa;
   private com.xy.w.Class18 nn;
   private Class3[] afb;
   private Class0 afc;
   private JTextField zo;
   private com.xy.i.Class13 afd;

   public boolean at(int var1) {
      return Class3.bd(this.afb[var1]);
   }

   // $VF: synthetic method
   private void wz() {
      UseCardBean var1 = this.yx().getLimit("限时礼包");
      com.xy.i.Class21 var2 = null;
      byte var3 = 5;
      List var4 = this.rs();
      int var5;
      int var10000 = var5 = 0;

      UseCardBean var9;
      while (true) {
         if (var10000 >= var4.size()) {
            var9 = var1;
            break;
         }

         com.xy.i.Class21 var6;
         if ((var6 = (com.xy.i.Class21)var4.get(var5)).il() == var3) {
            var2 = var6;
            var9 = var1;
            break;
         }

         var10000 = ++var5;
      }

      Class74 var10;
      label28: {
         if (var9 != null) {
            if (var2 == null) {
               String var10004 = "_u\u0003t\u0003`EuCx";
               com.xy.i.Class21 var7 = new com.xy.i.Class21("sc/b/vicon" + var3 + ".png", 1, 0, this);
               var7.g(var3);
               this.add(var7);
               var4.add(var7);
               var10 = this;
               this.h();
               break label28;
            }
         } else if (var2 != null) {
            var4.remove(var2);
            this.remove(var2);
            this.h();
         }

         var10 = this;
      }

      com.xy.a.v.Class39 var8;
      if ((var8 = (com.xy.a.v.Class39)var10.afx.getFormManagement().l(167)) != null) {
         var8.y(1);
      }

      this.aef = false;
   }

   public Class9 xa() {
      return this.aed;
   }

   public synchronized void xb(RoleShow var1, TeamBean var2) {
      if (var2 == null) {
         if (this.aex != null) {
            int var8;
            for (int var15 = var8 = 0; var15 < this.aex.zl.length; var15 = var8) {
               this.aex.zl[var8++] = null;
            }

            this.aex.setVisible(false);
         }
      } else {
         if (this.aex == null) {
            this.aex = new Class55(this);
            this.add(this.aex);
         }

         boolean var3 = var2.getTeams().get(0).getRoleId().compareTo(var1.getRole_id()) == 0;
         int var4 = 0;
         int var5 = var2.getTeams().size();

         for (int var10000 = var4; var10000 < 5; var10000 = ++var4) {
            TeamRole var6 = var4 < var5 ? var2.getTeams().get(var4) : null;
            if (var6 != null) {
               String var10005 = "\u0011";
               this.aex.zl[var4] = com.xy.w.Class16.c(com.xy.w.Class15.l("s" + var6.getSpeciesId().intValue()));
               if (var4 != 0) {
                  String var7 = null;
                  String var12;
                  if (var3 && var6.getState() < 0) {
                     String var13 = "叺";
                     var12 = var7 = "召";
                  } else {
                     if (var6.getRoleId().compareTo(var1.getRole_id()) == 0) {
                        String var10;
                        if (var6.getState() >= 0) {
                           String var9 = "秙";
                           var10 = "离";
                        } else {
                           String var11 = "彄";
                           var10 = "归";
                        }

                        var7 = var10;
                     }

                     var12 = var7;
                  }

                  if (var12 != null) {
                     if (this.aex.zm[var4 - 1] == null) {
                        int var10003 = var4 - 1;
                        String var10006 = "\u0011+M+M}P";
                        this.aex.zm[var10003] = new com.xy.i.Class10("sc/c/52", 1, 0, com.xy.q.Class49.bz, com.xy.q.Class49.r, null, this);
                        this.aex.zm[var4 - 1].setBounds(var4 * 71, 55, 17, 17);
                        this.aex.add(this.aex.zm[var4 - 1], 0);
                     }

                     this.aex.zm[var4 - 1].setText(var7);
                     String var10001 = "叺";
                     Class74 var14;
                     if (var7.equals("召")) {
                        var14 = this;
                        this.aex.zm[var4 - 1].n(8 + var4);
                     } else {
                        var10001 = "秙";
                        if (var7.equals("离")) {
                           var14 = this;
                           this.aex.zm[var4 - 1].n(7);
                        } else {
                           var10001 = "彄";
                           if (var7.equals("归")) {
                              this.aex.zm[var4 - 1].n(8);
                           }

                           var14 = this;
                        }
                     }

                     var14.aex.zm[var4 - 1].setVisible(true);
                  } else if (this.aex.zm[var4 - 1] != null) {
                     this.aex.zm[var4 - 1].setVisible(false);
                  }
               }
            } else {
               this.aex.zl[var4] = null;
               if (var4 != 0 && this.aex.zm[var4 - 1] != null) {
                  this.aex.zm[var4 - 1].setVisible(false);
               }
            }
         }

         this.aex.setBounds(223 + (this.afx.screenData.Screen_x - 892) / 2, 0, 358, 75);
         this.aex.setVisible(this.afx.getBattleScene() == null);
      }
   }

   // $VF: synthetic method
   private void xc() {
      if (this.aey == null) {
         this.add(this.aey = new Class35(this));
      }

      this.aey.t();
      if (this.aef) {
         this.wz();
      }
   }

   public void xd(int var1, com.xy.i.Class18 var2) {
      if (var1 == 3) {
         int var15 = 0;
         String var22 = "eO9O9\u001d\"";
         var2.setImage("sc/c/14");
         var2.n(4);

         for (int var7 = 0; var15 < this.aem.size(); var15 = var7) {
            Object var16 = this.aem.get(var7);
            var7++;
            ((com.xy.i.Class21)var16).setVisible(false);
         }

         int var8;
         for (int var17 = var8 = 0; var17 < this.aes.size(); var17 = var8) {
            Object var18 = this.aes.get(var8);
            var8++;
            ((com.xy.i.Class21)var18).setVisible(false);
         }
      } else if (var1 != 4) {
         if (var1 == 5) {
            String var21 = "eO9O9\u0018!";
            var2.setImage("sc/c/47");
            var2.n(6);
            ScreenData var6 = this.afx.screenData;
            this.aea.setBounds(var6.getScreen_x() - 332, var6.getScreen_y() - 80, 11, 37);
            this.aej.setVisible(true);
         } else if (var1 == 6) {
            String var20 = "\u0011+M+M|Z";
            var2.setImage("sc/c/48");
            var2.n(5);
            ScreenData var5 = this.afx.screenData;
            this.aea.setBounds(var5.getScreen_x() - 11, var5.getScreen_y() - 80, 11, 37);
            this.aej.setVisible(false);
         } else {
            if (var1 == 7) {
               this.aey.dr = !this.aey.dr;
               Class74 var13;
               if (this.aey.dr) {
                  com.xy.i.Class18 var12 = Class35.my(this.aey);
                  String var10001 = "eO9O9\u0019#";
                  var12.setImage("sc/c/55");
                  com.xy.w.Class18 var10002 = Class35.mx(this.aey);
                  var13 = this;
                  var10002.setVisible(this.aey._do);
                  Class35.my(this.aey).setVisible(this.aey._do);
               } else {
                  com.xy.i.Class18 var14 = Class35.my(this.aey);
                  String var19 = "\u0011+M+M|Z";
                  var14.setImage("sc/c/48");
                  var13 = this;
                  Class35.mx(this.aey).setVisible(false);
                  Class35.my(this.aey).setVisible(true);
               }

               var13.aey.l();
            }
         }
      } else {
         int var10000 = 0;
         String var10004 = "\u0011+M+MyW";
         var2.setImage("sc/c/15");
         var2.n(3);

         for (int var3 = 0; var10000 < this.aem.size(); var10000 = var3) {
            Object var9 = this.aem.get(var3);
            var3++;
            ((com.xy.i.Class21)var9).setVisible(true);
         }

         int var4;
         for (int var10 = var4 = 0; var10 < this.aes.size(); var10 = var4) {
            Object var11 = this.aes.get(var4);
            var4++;
            ((com.xy.i.Class21)var11).setVisible(true);
         }
      }
   }

   public com.xy.i.Class18 xe() {
      return this.aeu;
   }

   public void xf() {
      RoleData var10003 = this.yx();
      LoginResult var2 = var10003.getLoginResult();
      int var3 = var10003.getRoleProperty().getHp();
      int var4 = var10003.getRoleProperty().getMp();
      int var5 = com.xy.v.Class4.s(var2.getGrade());
      int var6 = com.xy.v.Class4.q(var2.getGrade());
      this.aez.fk(0, var2.getHp().doubleValue() / var3);
      this.aez.fk(1, var2.getMp().doubleValue() / var4);
      this.aez.fk(2, var2.getExperience().doubleValue() / this.yt().ag(var6, var5));
   }

   public void bi(int var1) {
      if (this.afc != null) {
         this.afc.n(var1);
      }
   }

   public void xg() {
      if (this.aey != null) {
         this.aey.h();
      }
   }

   public Class61 xh() {
      return this.aej;
   }

   public void xi() {
      int var1 = 0;
      this.aem = new ArrayList<>();
      GameClient var2 = this.za();

      int var3;
      for (int var10000 = var3 = 0; var10000 < var2.gn.length(); var10000 = ++var3) {
         char var4 = var2.gn.charAt(var3);
         com.xy.i.Class21 var5 = null;
         com.xy.i.Class21 var6;
         if (var4 == 'a') {
            String var10002 = "\u0011+M*M\nV{Vf\u0012&\u0005";
            var6 = var5 = new com.xy.i.Class21("sc/b/B434.png", 1, 50, this);
         } else if (var4 == 'b') {
            String var8 = "eO9N9n%\u0014#\u0002fBq";
            var6 = var5 = new com.xy.i.Class21("sc/b/B385.png", 1, 56, this);
         } else if (var4 == 'c') {
            String var9 = "\u0011+M*M\nQqVf\u0012&\u0005";
            var6 = var5 = new com.xy.i.Class21("sc/b/B394.png", 1, 57, this);
         } else if (var4 == 'd') {
            String var10 = "_u\u0003t\u0003T\u001e$\u0002fBq";
            var6 = var5 = new com.xy.i.Class21("sc/b/B22.png", 1, 52, this);
         } else if (var4 == 'e') {
            String var11 = "\u0011+M*M\nV~Tf\u0012&\u0005";
            var6 = var5 = new com.xy.i.Class21("sc/b/B466.png", 1, 68, this);
         } else if (var4 == 'f') {
            String var12 = "eO9N9n\"\u001a\"\u0002fBq";
            var6 = var5 = new com.xy.i.Class21("sc/b/B464.png", 1, 150, this);
         } else {
            if (var4 == 'g') {
               String var13 = "\u0011+M*M\nV~Wf\u0012&\u0005";
               var5 = new com.xy.i.Class21("sc/b/B465.png", 1, 50, this);
            }

            var6 = var5;
         }

         if (var6 != null) {
            Class74 var7;
            if (var4 == 'a') {
               var7 = this;
               var5.setBounds(19 + 60 * var1, 81, 52, 52);
            } else if (var4 == 'b') {
               var7 = this;
               var5.setBounds(21 + 60 * var1, 82, 49, 49);
            } else if (var4 == 'c') {
               var7 = this;
               var5.setBounds(19 + 60 * var1, 66, 59, 72);
            } else if (var4 == 'd') {
               var7 = this;
               var5.setBounds(19 + 60 * var1, 80, 53, 53);
            } else if (var4 == 'e') {
               var7 = this;
               var5.setBounds(19 + 60 * var1, 84, 53, 44);
            } else if (var4 == 'f') {
               var7 = this;
               var5.setBounds(19 + 60 * var1, 84, 53, 44);
            } else {
               if (var4 == 'g') {
                  var5.setBounds(19 + 60 * var1, 84, 53, 44);
               }

               var7 = this;
            }

            var7.add(var5);
            var1++;
            this.aem.add(var5);
         }
      }
   }

   public int dx() {
      return this.xt;
   }

   public void xj(RoleSummoning var1, com.xy.d.Class11 var2) {
      if (var1 == null) {
         String var10004 = "\\&";
         this.ael.gt(com.xy.w.Class15.e("p0"));
         this.aet.fk(0, 0.0);
         this.aet.fk(1, 0.0);
         this.aet.fk(2, 0.0);
      } else {
         String var10003 = "\u0012";
         this.ael.gt(com.xy.w.Class15.e("p" + var1.getSummoningskin()));
         Class74 var10000;
         if (var2 != null) {
            var10000 = this;
            this.aet.fk(0, (double)var2.cg().getHp_Current() / var2.cg().getHp_Total());
            this.aet.fk(1, (double)var2.cg().getMp_Current() / var2.cg().getMp_Total());
         } else {
            int[] var3 = PetProperty.getPetHMASp(var1, this.yx());
            var10000 = this;
            this.aet.fk(0, (double)var1.getBasishp(var3[0]) / var3[0]);
            this.aet.fk(1, (double)var1.getBasismp(var3[1]) / var3[1]);
         }

         var10000.aet.fk(2, var1.getExp().doubleValue() / this.yt().m(var1.getTurnRount(), com.xy.v.Class4.f(var1.getGrade())));
      }
   }

   public List<com.xy.i.Class21> xk() {
      return this.aem;
   }

   public void a() {
      ScreenData var1 = this.afx.screenData;
      if (this.afx.getBattleScene() != null) {
         this.aet.setBounds(61, 7, 70, 44);
         this.aek.setBounds(0, 0, 140, 61);
         this.ael.setBounds(4, 5, 50, 50);
      } else {
         this.aet.setBounds(var1.getScreen_x() - 254, 7, 70, 44);
         this.aek.setBounds(var1.getScreen_x() - 315, 0, 140, 61);
         this.ael.setBounds(var1.getScreen_x() - 311, 5, 50, 50);
      }
   }

   public Class74(GameView var1) {
      super(-1, -1, com.xy.q.Class30.agf, var1);
      ScreenData var2 = var1.screenData;
      this.yy(0, 0, var2.getScreen_x(), var2.getScreen_y(), com.xy.q.Class30.agf);
      this.aem = new ArrayList<>();
      this.aes = new ArrayList<>();
      this.afb = new Class3[12];

      int var3;
      for (int var10000 = var3 = 0; var10000 < this.afb.length; var10000 = var3) {
         this.afb[var3] = new Class3(this, var3);
         this.add(this.afb[var3++]);
      }

      String var10010 = "eO9O9\u001d ";
      this.aec = new com.xy.w.Class18(com.xy.w.Class16.m("sc/c/16", 60, 24, 20, 10, false));
      this.zo = com.xy.q.Class1.n(com.xy.q.Class49.cp, Color.white);
      this.zo.setDocument(new com.xy.q.Class11());
      this.zo.setFocusable(true);
      String var10006 = "\u0011+M+MyU";
      this.ads = new com.xy.w.Class18("sc/c/17");
      this.ads.addMouseListener(new com.xy.q.Class9(1, this));
      this.adu = new com.xy.i.Class18[3];

      for (int var7 = var3 = 0; var7 < this.adu.length; var7 = var3) {
         Class74 var8;
         if (var3 == 0) {
            var8 = this;
            String var10005 = "eO9O9\u001e$";
            this.adu[var3] = new com.xy.i.Class18("sc/c/22", 1, 28, this);
         } else if (var3 == 1) {
            var8 = this;
            String var19 = "\u0011+M+MzQ";
            this.adu[var3] = new com.xy.i.Class18("sc/c/23", 1, 0, this);
         } else {
            if (var3 == 2) {
               String var10004 = "eO9O9\u001e\"";
               this.adu[var3] = new com.xy.i.Class18("sc/c/24", 1, 0, this);
            }

            var8 = this;
         }

         var8.add(this.adu[var3++]);
      }

      this.add(this.zo);
      this.add(this.ads);
      this.add(this.aec);
      this.aed = new Class9(var1);
      this.aed.setVisible(false);
      this.add(this.aed);
      String var10013 = ";\u0001g\u0007gUf\u0012&\u0005";
      String var10018 = "臆劾";
      this.adv = new com.xy.i.Class14("sc/e/7.png", 1, 9, com.xy.q.Class49.ch, com.xy.q.Class49.bv, "自动", this);
      this.adv.setBounds(0, 0, 59, 25);
      this.adv.setVisible(false);
      this.add(this.adv);
      String var10014 = "\u0011+M-M|Rf\u0012&\u0005";
      String var10019 = "诰";
      this.adt = new com.xy.i.Class14("sc/e/40.png", 1, 10, com.xy.q.Class49.bz, null, "详", this);
      this.adt.setBounds(142, 65, 18, 18);
      this.adt.setVisible(false);
      this.add(this.adt);
      String var10015 = ";\u0001g\u0000g\u0000)\u0012f\u0012&\u0005";
      this.adz = new com.xy.i.Class13("sc/b/bap.png", 1, 11, this);
      this.adz.setBounds(137, 3, 44, 62);
      this.adz.setVisible(false);
      this.add(this.adz);
      String var10016 = "_u\u0003t\u0003tMf\u0002fBq";
      this.afd = new com.xy.i.Class13("sc/b/bap.png", 1, 12, this);
      this.afd.setBounds(182, 3, 44, 62);
      this.afd.setVisible(false);
      this.add(this.afd);
      this.aev = new Class57(var1);
      this.add(this.aev);
      String var10033 = ";\u0001g\u0001gT";
      this.nn = new com.xy.w.Class18("sc/c/6");
      this.nn.setBounds(0, 0, 223, 67);
      String var10031 = "镩宥埘";
      this.cy = new JLabel("长安城", 4);
      String var10030 = "9xNx?";
      this.db = new JLabel("[0,0]");
      this.aeb = new JLabel(com.xy.v.Class22.e(), 0);
      this.db.setForeground(Color.white);
      this.cy.setForeground(Color.white);
      this.aeb.setForeground(Color.white);
      this.db.setFont(com.xy.q.Class49.n);
      this.cy.setFont(com.xy.q.Class49.n);
      this.aeb.setFont(com.xy.q.Class49.ac);
      this.cy.setBounds(0, 14, 90, 16);
      this.db.setBounds(100, 14, 100, 16);
      this.aeb.setBounds(88, 45, 95, 20);
      var10019 = "_u\u0003u\u0003.";
      this.aee = new com.xy.i.Class18("sc/c/8", 1, 1, this);
      this.aee.setBounds(180, 3, 20, 20);
      String var10017 = ";\u0001g\u0001g[";
      this.aei = new com.xy.i.Class18("sc/c/9", 1, 2, this);
      this.aei.setBounds(182, 23, 17, 17);
      var10015 = "_u\u0003u\u0003!";
      this.adw = new com.xy.i.Class18("sc/c/7", 1, 0, this);
      this.adw.setBounds(170, 32, 11, 11);
      this.aew = new com.xy.i.Class18[4];

      for (int var9 = var3 = 0; var9 < this.aew.length; var9 = var3) {
         Class74 var10;
         if (var3 == 0) {
            var10 = this;
            String var20 = "\u0011+M+MyR";
            this.aew[var3] = new com.xy.i.Class18("sc/c/10", 1, 0, this);
         } else if (var3 == 1) {
            var10 = this;
            String var21 = "eO9O9\u001d'";
            this.aew[var3] = new com.xy.i.Class18("sc/c/11", 1, 31, this);
         } else if (var3 == 2) {
            com.xy.i.Class18[] var11 = this.aew;
            String var17 = "\u0011+M+MyP";
            byte var22;
            Class74 var10007;
            if (this.za().l(2, 12)) {
               var22 = 33;
               var10007 = this;
            } else {
               var22 = 0;
               var10007 = this;
            }

            com.xy.i.Class18 var15 = new com.xy.i.Class18("sc/c/12", 1, var22, var10007);
            var11[var3] = var15;
            var10 = this;
         } else {
            if (var3 == 3) {
               String var18 = "eO9O9\u001d%";
               this.aew[var3] = new com.xy.i.Class18("sc/c/13", 1, 32, this);
            }

            var10 = this;
         }

         var10.aew[var3].setBounds(var3 * 22, 45, 20, 20);
         this.add(this.aew[var3++]);
      }

      this.add(this.aee);
      this.add(this.aei);
      this.add(this.adw);
      this.add(this.cy);
      this.add(this.db);
      this.add(this.aeb);
      this.add(this.nn);
      Color var6 = new Color(0, 0, 0);
      this.setBackground(var6);
      if (this.za().VALUE.indexOf(76) == -1) {
         this.ady = new JLabel();
         this.ady.setBounds(205, 5, 35, 35);
         this.ady.addMouseListener(new Class108(this));
         this.add(this.ady);
      }

      if (this.za().VALUE.indexOf(65) != -1) {
         this.aeh = new JLabel();
         this.aeh.setBounds(245, 5, 35, 35);
         this.aeh.addMouseListener(new Class133(this));
         this.add(this.aeh);
      }

      this.aez = new Class14(this, 98, 0);
      this.aet = new Class14(this, 70, 1);
      var10010 = "\u0011+M+M|R";
      this.aae = new com.xy.w.Class18("sc/c/40");
      String var10009 = "eO9O9\u0018'";
      this.aek = new com.xy.w.Class18("sc/c/41");
      this.adx = new com.xy.q.Class54(this);
      this.ael = new com.xy.q.Class54(this);
      this.adx.gs(23, 1);
      this.ael.gs(23, 2);
      this.add(this.aez);
      this.add(this.aet);
      this.add(this.aae);
      this.add(this.aek);
      this.add(this.adx);
      this.add(this.ael);
      this.xi();
      String var10012 = "\u0011+M+MyW";
      this.aeu = new com.xy.i.Class18("sc/c/15", 1, 3, this);
      this.aeu.setBounds(0, 87, 13, 37);
      this.add(this.aeu);
      var10013 = "eO9O9\u0018!";
      this.aea = new com.xy.i.Class18("sc/c/47", 1, 6, this);
      this.aej = new Class61(0, var1);
      this.add(this.aea);
      this.add(this.aej);
      this.t();
      if (aen == null && this.ady != null) {
         String var12 = "\u0011+M%\r=\u0011-M唎垬f\u0016+\u0012";
         aen = com.xy.w.Class11.f("sc/mouse/商城.tcp", null);
      }

      if (aeq == null && this.aeh != null) {
         String var13 = "_u\u0003{Cc_s\u0003奀\u0002bOf";
         aeq = com.xy.w.Class11.f("sc/mouse/奖.tcp", null);
      }
   }

   public void bk(String var1) {
      this.aer = var1;
   }

   public void hy(boolean var1) {
      if (this.aex != null) {
         this.aex.setVisible(var1);
      }
   }

   public void xl(int[] var1, RoleSummoning var2) {
      if (var1 == null) {
         this.aet.fk(0, 0.0);
         this.aet.fk(1, 0.0);
         this.aet.fk(2, 0.0);
      } else {
         this.aet.fk(0, (double)var2.getBasishp(var1[0]) / var1[0]);
         this.aet.fk(1, (double)var2.getBasismp(var1[1]) / var1[1]);
         this.aet.fk(2, var2.getExp().doubleValue() / this.yt().m(var2.getTurnRount(), com.xy.v.Class4.f(var2.getGrade())));
      }
   }

   // $VF: synthetic method
   static Class3[] xm(Class74 var0) {
      return var0.afb;
   }

   public void bq(String var1) {
      this.aeo = var1;
   }

   public Class57 xn() {
      return this.aev;
   }

   public com.xy.i.Class14 xo() {
      return this.adv;
   }

   public void c() {
      String var10003 = "\u0011";
      this.adx.dp(com.xy.w.Class15.l("s" + this.afx.roleData.getLoginResult().getSpecies_id().intValue()));
      this.xf();
   }

   public com.xy.i.Class14 xp() {
      return this.adt;
   }

   public synchronized void e() {
      if (this.afc == null) {
         ScreenData var1 = this.afx.screenData;
         this.afc = new Class0(this);
         this.afc.setBounds(0, var1.getScreen_y() - 118, 47, 92);
         this.add(this.afc, 0);
      } else {
         this.bi(-1);
         this.afc.setVisible(!this.afc.isVisible());
      }
   }

   public void xq(int[] var1, RoleSummoning var2) {
      String var10001;
      if (var2 != null) {
         String var10003 = "f";
         var10001 = "p" + var2.getSummoningskin();
      } else {
         var10001 = "8R";
         var10001 = "p0";
      }

      this.ael.gt(com.xy.w.Class15.e(var10001));
      this.xl(var1, var2);
   }

   public void ab(int var1, boolean var2) {
      this.afb[var1].be(var2);
   }

   public void f() {
      if (this.afa != null) {
         this.afa.setVisible(false);
      }
   }

   public JTextField ty() {
      return this.zo;
   }

   public com.xy.i.Class13 xr() {
      return this.afd;
   }

   public void ci(String var1) {
      this.aeg = var1;
   }

   public void xs(int var1, double var2) {
      this.aez.fk(var1, var2);
   }

   public List<com.xy.i.Class21> rs() {
      return this.aes;
   }

   @Override
   public void t() {
      ScreenData var1 = this.afx.screenData;

      int var2;
      for (int var10000 = var2 = 0; var10000 < this.afb.length; var10000 = var2) {
         Class3 var4 = this.afb[var2];
         int var10001 = var1.getScreen_x() - (this.afb.length - var2) * 39;
         int var10002 = var1.getScreen_y() - 39;
         var2++;
         var4.setBounds(var10001, var10002, 39, 39);
      }

      int var5 = 0;
      this.ads.setBounds(2, var1.getScreen_y() - 22, 39, 60);
      this.zo.setBounds(52, var1.getScreen_y() - 22, var1.getScreen_x() - 610, 18);

      for (int var3 = 0; var5 < this.adu.length; var5 = ++var3) {
         if (var3 == 0) {
            this.adu[var3].setBounds(var1.getScreen_x() - 562, var1.getScreen_y() - 24, 35, 19);
         } else if (var3 == 1) {
            this.adu[var3].setBounds(var1.getScreen_x() - 523, var1.getScreen_y() - 26, 17, 27);
         } else if (var3 == 2) {
            this.adu[var3].setBounds(var1.getScreen_x() - 498, var1.getScreen_y() - 22, 21, 21);
         }
      }

      this.aec.setBounds(0, var1.getScreen_y() - 42, var1.getScreen_x() - 468, 42);
      if (this.aed.isVisible()) {
         this.aed.t();
      }

      this.aev.t();
      this.aez.setBounds(var1.getScreen_x() - 106, 11, 98, 50);
      this.aae.setBounds(var1.getScreen_x() - 180, 0, 181, 75);
      this.adx.setBounds(var1.getScreen_x() - 175, 10, 60, 60);
      this.a();
      this.adv.setBounds(var1.getScreen_x() - 59, var1.getScreen_y() - 150, 59, 25);
      this.aej.t();
      this.aea.setBounds(var1.getScreen_x() - 332, var1.getScreen_y() - 80, 11, 37);
      if (this.aex != null) {
         this.aex.setBounds(223 + (this.afx.screenData.Screen_x - 892) / 2, 0, 358, 75);
      }

      if (this.aey != null) {
         this.aey.l();
      }

      if (this.afa != null) {
         this.afa.t();
      }
   }

   public void y(int var1) {
      this.xt = var1;
      Class74 var10000;
      if (this.xt == 0) {
         var10000 = this;
         String var10002 = "eO9O9\u001d!";
         this.ads.dp("sc/c/17");
      } else if (this.xt == 1) {
         var10000 = this;
         String var2 = "\u0011+M+MyZ";
         this.ads.dp("sc/c/18");
      } else if (this.xt == 2) {
         var10000 = this;
         String var3 = "eO9O9\u001d/";
         this.ads.dp("sc/c/19");
      } else if (this.xt == 3) {
         var10000 = this;
         String var4 = "\u0011+M+MzR";
         this.ads.dp("sc/c/20");
      } else {
         if (this.xt == 4) {
            String var10001 = "eO9O9\u001e'";
            this.ads.dp("sc/c/21");
         }

         var10000 = this;
      }

      var10000.e();
   }

   public void fk(int var1, double var2) {
      this.aet.fk(var1, var2);
   }

   public com.xy.i.Class13 xt() {
      return this.adz;
   }

   @Override
   protected void paintChildren(Graphics var1) {
      if (this.aeo != null) {
         if (!com.xy.v.Class12.am(this.cy.getText(), this.aeo)) {
            this.cy.setText(this.aeo);
         }

         this.aeo = null;
      }

      if (this.aer != null) {
         if (!com.xy.v.Class12.am(this.db.getText(), this.aeo)) {
            this.db.setText(this.aer);
         }

         this.aer = null;
      }

      if (this.aeg != null) {
         if (!com.xy.v.Class12.am(this.aeb.getText(), this.aeo)) {
            this.aeb.setText(this.aeg);
         }

         this.aeg = null;
      }

      if (this.aep) {
         this.xc();
         this.aep = false;
      }

      super.paintChildren(var1);
      if (this.ady != null && this.ady.isVisible()) {
         aen.j(com.xy.v.Class22.l(), 0);
         aen.ab(var1, 205, 5);
      }

      if (this.aeh != null && this.aeh.isVisible()) {
         aeq.j(com.xy.v.Class22.l(), 0);
         aeq.ab(var1, 245, 5);
      }
   }

   public void h() {
      List var1 = this.rs();
      int var2 = this.xk().size();
      boolean var3 = this.xe().il() == 3;

      int var4;
      for (int var10000 = var4 = 0; var10000 < var1.size(); var10000 = var4) {
         com.xy.i.Class21 var5 = (com.xy.i.Class21)var1.get(var4);
         int var6;
         int var7 = (var6 = var2 + (var1.size() - 1 - var4)) % 4 * 60 + 19;
         int var8 = var6 / 4 * 55 + 80;

         Class21 var12;
         label44: {
            label43: {
               try {
                  int var9 = 0;
                  com.xy.i.Class21 var11 = var5;

                  while (var11.getImgW() == -1) {
                     if (var9 >= 10) {
                        break label43;
                     }

                     var11 = var5;
                     var9++;
                     var5.getImageSize();
                     Thread.sleep(5L);
                  }
               } catch (Exception var10) {
                  var10.printStackTrace();
               }

               var12 = var5;
               break label44;
            }

            var12 = var5;
         }

         com.xy.i.Class21 var13;
         if (var12.getImage() == com.xy.w.Class16.i()) {
            var13 = var5;
            var5.setBounds(var7, var8, 40, 40);
         } else {
            var13 = var5;
            var5.setBounds(var7, var8, var5.getImgW(), var5.getImgH());
         }

         var4++;
         var13.setVisible(var3);
      }
   }

   public void cr(boolean var1) {
      int var10000 = 0;
      this.aee.setVisible(var1);
      this.aei.setVisible(var1);
      this.adw.setVisible(var1);
      this.cy.setVisible(var1);
      this.db.setVisible(var1);
      this.aeb.setVisible(var1);
      this.nn.setVisible(var1);

      for (int var2 = 0; var10000 < this.aew.length; var10000 = var2) {
         this.aew[var2++].setVisible(var1);
      }

      if (this.ady != null) {
         this.ady.setVisible(var1);
      }

      if (this.aeh != null) {
         this.aeh.setVisible(var1);
      }
   }

   public void g(int var1) {
      if (this.afa != null && this.afa.isVisible() && this.afa.ae == var1) {
         this.f();
      } else {
         if (this.afa == null) {
            this.add(this.afa = new Class102(this), 0);
         }

         this.afa.n(var1);
         this.afa.setVisible(true);
      }
   }
}
