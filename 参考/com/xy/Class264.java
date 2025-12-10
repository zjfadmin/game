package com.xy;

import com.xy.entity.RoleSummoning;
import com.xy.formula.PetProperty;
import com.xy.game.RoleData;
import com.xy.game.RolePet;
import com.xy.text.GameView;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.LayoutManager;
import java.awt.image.ImageObserver;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JScrollPane;

public class Class264 extends Class345 {
   private Class217 acp;
   private Class248 acq;
   private Class245[] rp;
   private JLabel[] er;
   private Class70[] acr;
   private Class436[] cs;
   private Class19 ue;
   private JScrollPane fe;
   private Class643[] acs;
   private <undefinedtype> act;
   private boolean op;

   public void s() {
      int var10000 = 3 & 4;
      this.gi((Class581)null);
      this.acp.setText((String)null);

      int var1;
      for(var1 = var10000; var10000 < this.rp.length; var10000 = var1) {
         this.rp[var1++].setText((String)null);
      }

      var10000 = 1 ^ 3;
      int var10002 = 3 & 4;
      this.ue = null;
      this.op = (boolean)var10002;

      for(var1 = var10000; var10000 < 5; var10000 = var1) {
         this.acs[var1++].setVisible((boolean)(3 ^ 3));
      }

      this.as(3 >> 2);
   }

   public boolean t() {
      this.s();
      return super.t();
   }

   public void cf(int var1, int var2) {
      try {
         Class264 var10000;
         if (var1 == 0) {
            var10000 = this;
            var1 = Integer.parseInt(this.rp[127 & 9].getText());
            this.rp[109 & 27].setText(String.valueOf(var1 + var2));
         } else if (var1 == (2 ^ 3)) {
            var10000 = this;
            var1 = Integer.parseInt(this.rp[110 & 27].getText());
            this.rp[79 & 58].setText(String.valueOf(var1 + var2));
         } else if (var1 == --2) {
            var10000 = this;
            var1 = Integer.parseInt(this.rp[47 & 91].getText());
            this.rp[75 & 63].setText(String.valueOf(var1 + var2));
         } else if (var1 == --3) {
            var10000 = this;
            var1 = Integer.parseInt(this.rp[77 & 62].getText());
            this.rp[61 & 78].setText(String.valueOf(var1 + var2));
         } else {
            if (var1 == --4) {
               var1 = Integer.parseInt(this.rp[30 & 111].getText());
               this.rp[14 & 127].setText(String.valueOf(var1 + var2));
            }

            var10000 = this;
         }

         var1 = Integer.parseInt(var10000.rp[41 & 94].getText());
         this.rp[74 & 61].setText(String.valueOf(var1 - var2));
      } catch (Exception var3) {
      }
   }

   public int mi(int var1) {
      try {
         if (var1 == 0) {
            return Integer.parseInt(this.rp[63 & 73].getText());
         }

         if (var1 == 3 >> 1) {
            return Integer.parseInt(this.rp[26 & 111].getText());
         }

         if (var1 == (1 ^ 3)) {
            return Integer.parseInt(this.rp[127 & 11].getText());
         }

         if (var1 == --3) {
            return Integer.parseInt(this.rp[29 & 110].getText());
         }

         if (var1 == --4) {
            return Integer.parseInt(this.rp[94 & 47].getText());
         }

         if (var1 == --5) {
            var1 = Integer.parseInt(this.rp[29 & 106].getText());
            return var1;
         }
      } catch (Exception var2) {
         var1 = 3 >> 2;
      }

      return var1;
   }

   public void r(boolean var1) {
      this.op = var1;
   }

   public Class245[] mg() {
      return this.rp;
   }

   public void gd(int var1, String var2) {
      this.acp.setText(var2);
      this.rp[2 & 5].setForeground(Color.white);
      this.rp[3 >> 2].setText(Class224.t(var1) + "级");
      this.as(Class224.n(var1));
   }

   public Class217 md() {
      return this.acp;
   }

   public Class643[] mh() {
      return this.acs;
   }

   public JLabel[] mf() {
      return this.er;
   }

   public void q() {
      this.acq.cc();
      this.acq.q();
      super.q();
   }

   public void bk(BigDecimal var1) {
      this.acq.gh(var1 != null ? var1.longValue() : 0L);
   }

   public void w(RolePet var1) {
      RoleData var2;
      (var2 = this.vd()).setChosePetId(var1 != null ? var1.getId() : null);
      if (var1 == null) {
         this.s();
         this.ve().n(58 & 87);
         this.ve().n(95 & 99);
      } else {
         this.gi((Class581)null);
         RoleSummoning var4;
         int[] var3 = PetProperty.getPetHMASp(var4 = var1.getPet(), var2);
         this.rp[--3].setText(var4.getBasishp(var3[3 ^ 3]) + "/" + var3[3 ^ 3]);
         this.rp[--4].setText(var4.getBasismp(var3[5 >> 2]) + "/" + var3[4 ^ 5]);
         this.rp[--5].setText(String.valueOf(var3[--2]));
         this.rp[103 & 30].setText(String.valueOf(var3[--3]));
         this.rp[127 & 13].setText(String.valueOf(var3[--4]));
         this.rp[111 & 25].setText(String.valueOf(var3[--5]));
         this.rp[122 & 15].setText(String.valueOf(var3[86 & 47]));
         this.rp[107 & 31].setText(String.valueOf(var3[15 & 119]));
         this.rp[29 & 110].setText(String.valueOf(var3[74 & 61]));
         this.rp[78 & 63].setText(String.valueOf(var3[105 & 31]));
         this.rp[61 & 74].setText(String.valueOf(var4.getCanpoint()));
         this.rp[71 & 63].setText(var4.getExp().toString() + "/" + this.vc().d(var4.getTurnRount(), Class224.p(var4.getGrade())));
         this.rp[5 >> 2].setText(var4.getFaithful().toString());
         this.rp[--2].setText(var4.getFriendliness().toString());
         this.gd(var4.getGrade(), var4.getSummoningname());
         this.aej.baseView.ky(var3, var4);
         BigDecimal var5;
         if ((var5 = var2.getLoginResult().getSummoning_id()) != null && var5.compareTo(var4.getSid()) == 0) {
            this.acs[105 & 31].setText("休息");
         } else {
            this.acs[9].setText("参战");
         }

         int var6;
         int var10000;
         for(var10000 = var6 = 2; var10000 < 5; var10000 = var6) {
            this.acs[var6++].setVisible((boolean)(3 >> 2));
         }

         if (var4.getInnerGoods() != null && !var4.getInnerGoods().equals("")) {
            String[] var7 = var4.getInnerGoods().split("\\|");

            int var8;
            for(var10000 = var8 = 5 >> 3; var10000 < var7.length && var8 < --3; var10000 = var8) {
               int var10001 = var8 + (1 ^ 3);
               ++var8;
               this.acs[var10001].setVisible((boolean)(3 >> 1));
            }
         }

         this.ue = var4.getPart(this.aej);
         this.op = (boolean)((var4.getPetlock() >> (5 >> 3) & 3 >> 1) == (3 & 5) ? 5 >> 2 : 0);
         Class683 var9;
         if ((var9 = (Class683)this.aej.getFormManagement().m(18)) != null) {
            var9.v(var4);
         }

         Class47 var10;
         if ((var10 = (Class47)this.aej.getFormManagement().m(67)) != null) {
            var10.v(var4);
         }

         Class45 var11;
         if ((var11 = (Class45)this.aej.getFormManagement().m(47)) != null) {
            var11.v(var4);
         }

      }
   }

   public void as(int var1) {
      if (var1 <= --3) {
         this.acr[125 & 10].setVisible((boolean)(3 & 4));
         this.acr[31 & 105].setVisible((boolean)(3 ^ 3));
         this.er[31 & 111].setVisible((boolean)(2 & 5));
         this.er[24 & 119].setVisible((boolean)(5 >> 3));
         this.rp[109 & 31].setVisible((boolean)(3 & 4));
         this.rp[95 & 46].setVisible((boolean)(3 ^ 3));
         this.acs[27 & 116].setVisible((boolean)(3 ^ 3));
         this.er[127 & 9].setBounds(1770 & 31231, 22991 & 10171, 122 & 45, 61 & 86);
         this.rp[95 & 39].setBounds(11643 & 21398, 14751 & 18411, 29350 & 3551, 20);
         this.acs[14].setBounds(450, 397, 51, 17);
         this.acs[15].setBounds(507, 397, 51, 17);
      } else {
         this.acr[8].setVisible((boolean)(5 >> 2));
         this.acr[9].setVisible((boolean)(2 ^ 3));
         this.er[15].setVisible((boolean)(4 ^ 5));
         this.er[16].setVisible((boolean)(--1));
         this.rp[13].setVisible((boolean)(3 & 5));
         this.rp[14].setVisible((boolean)(--1));
         this.acs[16].setVisible((boolean)(4 ^ 5));
         this.er[9].setBounds(234, 420, 40, 20);
         this.rp[7].setBounds(274, 420, 134, 20);
         this.acs[14].setBounds(450, 422, 51, 17);
         this.acs[15].setBounds(507, 422, 51, 17);
      }
   }

   public void gi(Class581 var1) {
      if (var1 == null) {
         if (this.act != null) {
            this.act.setVisible((boolean)(2 & 5));
         }
      } else if (var1.gl() != 0L) {
         if (this.act == null) {
            this.act = new JComponent() {
               List<Class643> ie;
               private BigDecimal py;

               public void bk(BigDecimal var1) {
                  this.py = var1;
               }

               public {
                  int var10002 = 3 & 4;
                  this.setLayout((LayoutManager)null);
                  this.setBackground(Class681.cu);
                  this.setVisible((boolean)var10002);
                  this.ie = new ArrayList();
               }

               public void cf(int var1, int var2) {
                  RoleData var5 = Class264.this.vd();
                  int var4 = 3 >> 2;
                  Class264.this.acq.getComponentCount();

                  int var3;
                  int var10000;
                  int var10001;
                  int var10003;
                  int var10004;
                  int var10005;
                  for(var10000 = var3 = 5 >> 3; var10000 < var5.pets.size(); var10000 = var3) {
                     if (((RolePet)var5.pets.get(var3)).getId().compareTo(this.py) != 0) {
                        Class643 var7 = var4 < this.ie.size() ? (Class643)this.ie.get(var4) : null;
                        if (var7 == null) {
                           var7 = new Class643("sc/c/81", 3 >> 1, 55 & 79, Class681.bm, (Color[])null, (String)null, Class264.this.gk());
                           this.ie.add(var7);
                           this.add(var7);
                        }

                        var10001 = 3 >> 1;
                        var10003 = --3;
                        var7.setText(String.valueOf(var3 + (2 ^ 3)));
                        var10003 += var4 % (118 & 15) * (18 & 127);
                        var10004 = (3 >> 1) + var4 / (79 & 54) * (91 & 54);
                        var10005 = 82 & 63;
                        ++var4;
                        var7.setBounds(var10003, var10004, var10005, var10005);
                        var7.setVisible((boolean)var10001);
                     }

                     ++var3;
                  }

                  Class643 var8 = var4 < this.ie.size() ? (Class643)this.ie.get(var4) : null;
                  if (var8 == null) {
                     var8 = new Class643("sc/c/81", 3 >> 1, 119 & 15, Class681.bm, (Color[])null, (String)null, Class264.this.gk());
                     this.ie.add(var8);
                     this.add(var8);
                  }

                  var10001 = --1;
                  var10003 = --3;
                  var8.setText("X");
                  var10003 += var4 % (63 & 70) * (50 & 95);
                  var10004 = (2 ^ 3) + var4 / (79 & 54) * (118 & 27);
                  var10005 = 91 & 54;
                  ++var4;
                  var8.setBounds(var10003, var10004, var10005, var10005);
                  var8.setVisible((boolean)var10001);

                  int var6;
                  for(var10000 = var6 = var4; var10000 < this.ie.size(); var10000 = var6) {
                     Object var9 = this.ie.get(var6);
                     ++var6;
                     ((Class643)var9).setVisible((boolean)(3 & 4));
                  }

                  Class264.this.act.setBounds(var1, var2, 123 & 118, (87 & 60) + (var4 - (3 >> 1)) / (22 & 111) * (87 & 58));
               }
            };
            this.add(this.act, 3 ^ 3);
         }

         this.act.bk(new BigDecimal(var1.gl()));
         this.act.cf(3327 & 29675, 40 & 127);
         this.act.setVisible((boolean)(3 >> 1));
      }
   }

   public Class264(GameView var1) {
      int var10001 = 31 & 113;
      int var10005 = 47 & 125;
      int var10011 = -2 & -1;
      super(87 & 46, 5 >> 1, Class345.aef, var1);
      this.va(var10011, 3 ^ 3, 26365 & 6987, 4607 & 28655, Class345.aeo);
      this.uv(Class511.q("sc/d/1.png", 110 & 85, 110 & 85, 110 & 85, 110 & 85, (boolean)(5 >> 3)), "召唤兽");
      this.acq = new Class248(this);
      this.acq.setBounds(3 >> 2, 3 >> 2, 9443 & 23484, 63 & 84);
      this.fe = Class133.f(var10005, 42 & 127, 9908 & 23039, 15839 & 17383, this.acq, 54 & 93);
      this.add(this.fe);
      JLabel[] var4 = new JLabel[var10001];
      boolean var10003 = true;
      this.er = var4;

      int var2;
      Class264 var3;
      int var10000;
      for(var10000 = var2 = 3 >> 2; var10000 < this.er.length; var10000 = var2) {
         this.er[var2] = Class133.c(43 & 124, 9978 & 22935, 27354 & 5543, 18, 5 >> 3, Color.black, Class681.ak);
         this.er[var2].setText(var2 == 0 ? "召唤兽(6/18)" : (var2 == 5 >> 2 ? "名称" : (var2 == (1 ^ 3) ? "等级" : (var2 == --3 ? "忠诚" : (var2 == --4 ? "亲密" : (var2 == --5 ? "气血" : (var2 == 6 ? "法力" : (var2 == 7 ? "攻击" : (var2 == 8 ? "速度" : (var2 == 9 ? "经验" : (var2 == 10 ? "可分配点数" : (var2 == 11 ? "根骨" : (var2 == 12 ? "灵性" : (var2 == 13 ? "力量" : (var2 == 14 ? "敏捷" : (var2 == 15 ? "禅定" : (var2 == 16 ? "定力" : "")))))))))))))))));
         if (var2 == 0) {
            this.er[var2].setBounds(45, 21, 170, 21);
            this.er[var2].setForeground(Color.white);
         }

         if (var2 >= 3 >> 1 && var2 <= --3) {
            var3 = this;
            this.er[var2].setBounds(234, 220 + (var2 - (4 ^ 5)) * 25, 40, 20);
         } else if (var2 == --4) {
            var3 = this;
            this.er[var2].setBounds(413, 245, 40, 20);
         } else if (var2 >= --5 && var2 <= 9) {
            var3 = this;
            this.er[var2].setBounds(234, 295 + (var2 - --5) * 25, 40, 20);
         } else if (var2 == 10) {
            var3 = this;
            this.er[var2].setBounds(413, 270, 90, 20);
         } else if (var2 >= 11 && var2 <= 14) {
            var3 = this;
            this.er[var2].setBounds(413, 295 + (var2 - 11) * 25, 40, 20);
         } else if (var2 == 15) {
            var3 = this;
            this.er[var2].setBounds(234, 395, 40, 20);
         } else {
            if (var2 == 16) {
               this.er[var2].setBounds(413, 395, 40, 20);
            }

            var3 = this;
         }

         var3.add(this.er[var2++]);
      }

      Class643[] var5 = new Class643[20];
      var10003 = true;
      this.acs = var5;

      for(var10000 = var2 = 2 & 5; var10000 < this.acs.length; var10000 = var2) {
         this.acs[var2] = new Class643((String)null, 3 >> 1, 21 + var2, Class681.bm, (Color[])null, "", this);
         this.acs[var2].setText(var2 == --5 ? "改" : (var2 == 6 ? "放生" : (var2 == 7 ? "驯养" : (var2 == 8 ? "召唤" : (var2 == 9 ? "参战" : (var2 == 10 ? "物品" : (var2 == 11 ? "炼妖" : (var2 == 12 ? "抗性" : (var2 == 13 ? "技能" : (var2 == 14 ? "推荐加点" : (var2 == 15 ? "确认加点" : (var2 == 16 ? "灵犀" : (var2 == 17 ? "载书" : (var2 == 18 ? "排" : (var2 == 19 ? "存" : "")))))))))))))));
         if (var2 == 0) {
            var3 = this;
            this.acs[var2].setImage("sc/e/1.png");
            this.acs[var2].setBounds(274, 21, 18, 18);
         } else if (var2 == (2 ^ 3)) {
            var3 = this;
            this.acs[var2].setImage("sc/e/2.png");
            this.acs[var2].setBounds(295, 21, 18, 18);
         } else if (var2 >= 5 >> 1 && var2 <= --4) {
            var3 = this;
            this.acs[var2].setImage("sc/e/49.png");
            this.acs[var2].setBounds(247, 93 + (var2 - (1 ^ 3)) * 20, 17, 17);
         } else if (var2 != --5 && var2 != 18 && var2 != 19) {
            if (var2 != 6 && var2 != 7 && var2 != 17) {
               label423: {
                  if ((var2 < 8 || var2 > 13) && var2 != 16) {
                     if (var2 == 14 || var2 == 15) {
                        this.acs[var2].setImage("sc/e/27.png");
                        this.acs[var2].setBounds(233 + (var2 - 14) * 77, 397, 51, 17);
                     }
                  } else {
                     this.acs[var2].setFont(Class681.ak);
                     this.acs[var2].setForeground(Color.black);
                     this.acs[var2].setImage("sc/e/7.png");
                     if (var2 == 8) {
                        var3 = this;
                        this.acs[var2].setBounds(315, 450, 59, 25);
                        break label423;
                     }

                     if (var2 == 9) {
                        var3 = this;
                        this.acs[var2].setBounds(498, 217, 59, 25);
                        break label423;
                     }

                     if (var2 == 10) {
                        var3 = this;
                        this.acs[var2].setBounds(43 + (var2 - 10) * 78 + 205, 450, 59, 25);
                        break label423;
                     }

                     if (var2 == 11) {
                        var3 = this;
                        this.acs[var2].setBounds(43 + (var2 - 10) * 78 + 205, 450, 59, 25);
                        break label423;
                     }

                     if (var2 == 12) {
                        var3 = this;
                        this.acs[var2].setBounds(43 + (var2 - 10) * 78 + 205, 450, 59, 25);
                        break label423;
                     }

                     if (var2 == 13) {
                        var3 = this;
                        this.acs[var2].setBounds(43 + (var2 - 10) * 78 + 205, 450, 59, 25);
                        break label423;
                     }

                     if (var2 == 16) {
                        var3 = this;
                        this.acs[var2].setBounds(428, 217, 59, 25);
                        break label423;
                     }
                  }

                  var3 = this;
               }
            } else {
               this.acs[var2].setImage("sc/e/6.png");
               if (var2 == 17) {
                  var3 = this;
                  this.acs[var2].setBounds(238, 21, 34, 18);
               } else {
                  var3 = this;
                  this.acs[var2].setBounds(373, 246 + (var2 - 6) * 25, 34, 18);
               }
            }
         } else {
            this.acs[var2].setImage("sc/e/40.png");
            if (var2 != 18 && var2 != 19) {
               var3 = this;
               this.acs[var2].setBounds(390, 221, 18, 18);
            } else {
               var3 = this;
               this.acs[var2].setBounds(188 + (var2 - 18) * 18, 22, 18, 18);
            }
         }

         var3.add(this.acs[var2++]);
      }

      this.acs[8].setVisible((boolean)(2 & 5));
      if (!this.uw().gamePetManual) {
         this.acs[17].setVisible((boolean)(3 & 4));
      }

      Class70[] var6 = new Class70[10];
      var10003 = true;
      this.acr = var6;

      for(var10000 = var2 = 3 >> 2; var10000 < this.acr.length; var10000 = var2) {
         this.acr[var2] = new Class70(var2 % --2 == 0 ? "sc/e/32.png" : "sc/e/34.png", 1, 200 + var2, this);
         this.acr[var2].setBounds(528 + 15 * (var2 % --2), 298 + 25 * (var2 / 2), 11, 15);
         this.add(this.acr[var2++]);
      }

      this.acp = Class133.n(Class511.q("sc/d/17.png", 3, 3, 3, 3, (boolean)(3 ^ 3)), Class681.bx, Color.white);
      this.acp.setBounds(274, 220, 134, 20);
      this.add(this.acp);
      Class245[] var7 = new Class245[15];
      var10003 = true;
      this.rp = var7;

      for(var10000 = var2 = 3 ^ 3; var10000 < this.rp.length; var10000 = var2) {
         this.rp[var2] = Class133.a(3 >> 2, 3 >> 2, 3 >> 2, 3 >> 2, 10, Color.white, var2 == 0 ? Class681.bx : Class681.cd);
         this.rp[var2].eq(Class511.q("sc/d/17.png", 3, 3, 3, 3, (boolean)(3 >> 2)));
         if (var2 != 0 && var2 != (3 & 5)) {
            if (var2 == 2) {
               var3 = this;
               this.rp[var2].setBounds(453, 245, 104, 20);
            } else if (var2 >= 3 && var2 <= 7) {
               var3 = this;
               this.rp[var2].setBounds(274, 295 + (var2 - 3) * 25, 134, 20);
            } else if (var2 == 8) {
               var3 = this;
               this.rp[var2].setBounds(505, 270, 52, 20);
            } else if (var2 >= 9 && var2 <= 12) {
               var3 = this;
               this.rp[var2].setBounds(453, 295 + (var2 - 9) * 25, 104, 20);
            } else if (var2 == 13) {
               var3 = this;
               this.rp[var2].setBounds(274, 395, 134, 20);
            } else {
               if (var2 == 14) {
                  this.rp[var2].setBounds(453, 395, 104, 20);
               }

               var3 = this;
            }
         } else {
            var3 = this;
            this.rp[var2].setBounds(274, 245 + var2 * 25, 98, 20);
         }

         var3.add(this.rp[var2++]);
      }

      Class436[] var8 = new Class436[3];
      var10003 = true;
      this.cs = var8;

      for(var10000 = var2 = 3 & 4; var10000 < this.cs.length; var10000 = var2) {
         this.cs[var2] = new Class436();
         if (var2 == 0) {
            var3 = this;
            this.cs[var2].eq(Class511.q("sc/d/25.png", 2, 2, 2, 2, false));
            this.cs[var2].setBounds(45, 21, 180, 21);
         } else if (var2 == 1) {
            var3 = this;
            this.cs[var2].eq(Class511.q("sc/d/24.png", 2, 2, 2, 2, false));
            this.cs[var2].setBounds(45, 21, 180, 455);
         } else {
            if (var2 == 2) {
               this.cs[var2].eq(Class511.q("sc/d/16.png", 2, 2, 2, 2, false));
               this.cs[var2].setBounds(238, 40, 320, 175);
            }

            var3 = this;
         }

         var3.add(this.cs[var2++]);
      }

      this.as(0);
   }

   protected void paintChildren(Graphics var1) {
      super.paintChildren(var1);
      if (this.ue != null) {
         this.ue.a(var1, 28159 & 5008, 13818 & 19149, 3 & 4, Class280.l());
      }

      if (this.op) {
         var1.drawImage(Class222.u, 5745 & 27567, 127 & 46, 31 & 106, 94 & 45, (ImageObserver)null);
      }

   }

   public void d() {
      this.gi(this.acq.gg());
   }

   public void y(int var1) {
      --var1;
      this.act.setVisible((boolean)(3 & 4));
      if (var1 >= 0) {
         RoleData var2;
         RolePet var3;
         int var4 = (var3 = (var2 = this.vd()).getRolePet(this.act.py.longValue())) != null ? var2.pets.indexOf(var3) : -1;
         if (var3 != null && var4 != -4 >> 2) {
            if (var4 != var1) {
               RolePet var5 = var1 < var2.pets.size() ? (RolePet)var2.pets.get(var1) : null;
               if (var5 != null) {
                  var2.pets.set(var4, var5);
                  var2.pets.set(var1, var3);
                  var2.ax();
                  this.acq.bl();
               }
            }
         }
      }
   }
}
