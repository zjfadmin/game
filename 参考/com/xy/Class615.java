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

public class Class615 extends Class345 {
   private JScrollPane hd;
   private Class19 up;
   private Class70[] uq;
   private Class643[] y;
   private Class436[] il;
   private JLabel[] iv;
   private Class217 ur;
   private <undefinedtype> us;
   private boolean lc;
   private Class245[] cj;
   private Class248 ut;

   public Class217 md() {
      return this.ur;
   }

   public JLabel[] mf() {
      return this.iv;
   }

   public void d() {
      int var10000 = 3 & 4;
      this.gi((Class581)null);
      this.ur.setText((String)null);

      int var1;
      for(var1 = var10000; var10000 < this.cj.length; var10000 = var1) {
         this.cj[var1++].setText((String)null);
      }

      var10000 = 5 >> 1;
      int var10002 = 5 >> 3;
      this.up = null;
      this.lc = (boolean)var10002;

      for(var1 = var10000; var10000 < 5; var10000 = var1) {
         this.y[var1++].setVisible((boolean)(3 >> 2));
      }

      this.as(3 ^ 3);
   }

   public Class245[] mg() {
      return this.cj;
   }

   public Class643[] mh() {
      return this.y;
   }

   public void as(int var1) {
      if (var1 <= --3) {
         this.uq[90 & 45].setVisible((boolean)(2 & 5));
         this.uq[27 & 109].setVisible((boolean)(5 >> 3));
         this.iv[95 & 47].setVisible((boolean)(3 & 4));
         this.iv[91 & 52].setVisible((boolean)(2 & 5));
         this.cj[111 & 29].setVisible((boolean)(3 >> 2));
         this.cj[31 & 110].setVisible((boolean)(3 >> 2));
         this.y[55 & 88].setVisible((boolean)(3 >> 2));
         this.iv[45 & 91].setBounds(55 & 111, 16863 & 16299, 125 & 42, 116 & 31);
         this.cj[55 & 79].setBounds(127 & 79, 1023 & 32139, 14078 & 18823, 20);
         this.y[14].setBounds(253, 397, 51, 17);
         this.y[15].setBounds(310, 397, 51, 17);
      } else {
         this.uq[8].setVisible((boolean)(--1));
         this.uq[9].setVisible((boolean)(2 ^ 3));
         this.iv[15].setVisible((boolean)(5 >> 2));
         this.iv[16].setVisible((boolean)(4 ^ 5));
         this.cj[13].setVisible((boolean)(3 >> 1));
         this.cj[14].setVisible((boolean)(--1));
         this.y[16].setVisible((boolean)(--1));
         this.iv[9].setBounds(39, 420, 40, 20);
         this.cj[7].setBounds(79, 420, 134, 20);
         this.y[14].setBounds(253, 422, 51, 17);
         this.y[15].setBounds(310, 422, 51, 17);
      }
   }

   public void y(int var1) {
      --var1;
      this.us.setVisible((boolean)(3 ^ 3));
      if (var1 >= 0) {
         RoleData var2;
         RolePet var3;
         int var4 = (var3 = (var2 = this.vd()).getRolePet(this.us.ne.longValue())) != null ? var2.pets.indexOf(var3) : -1;
         if (var3 != null && var4 != -4 >> 2) {
            if (var4 != var1) {
               RolePet var5 = var1 < var2.pets.size() ? (RolePet)var2.pets.get(var1) : null;
               if (var5 != null) {
                  var2.pets.set(var4, var5);
                  var2.pets.set(var1, var3);
                  var2.ax();
                  this.ut.bl();
               }
            }
         }
      }
   }

   public boolean t() {
      this.d();
      return super.t();
   }

   public Class615(GameView var1) {
      int var10001 = 121 & 23;
      int var10005 = 61 & 111;
      int var10011 = -1 & -2;
      super(6 & 127, 1 ^ 3, Class345.aef, var1);
      this.va(var10011, 5 >> 3, 4511 & 28653, 30207 & 3055, Class345.aeo);
      this.uv(Class511.q("sc/d/1.png", 77 & 118, 77 & 118, 77 & 118, 77 & 118, (boolean)(3 & 4)), "召唤兽");
      this.ut = new Class248(this);
      this.ut.setBounds(3 & 4, 3 & 4, 15007 & 17910, 87 & 60);
      this.hd = Class133.f(var10005, 63 & 106, 23998 & 8939, 13548 & 19359, this.ut, 95 & 52);
      this.add(this.hd);
      JLabel[] var4 = new JLabel[var10001];
      boolean var10003 = true;
      this.iv = var4;

      int var2;
      Class615 var3;
      int var10000;
      for(var10000 = var2 = 3 >> 2; var10000 < this.iv.length; var10000 = var2) {
         this.iv[var2] = Class133.c(56 & 111, 28402 & 4511, 9931 & 22966, 18, 3 >> 2, Color.black, Class681.ak);
         this.iv[var2].setText(var2 == 0 ? "召唤兽(6/18)" : (var2 == --1 ? "名称" : (var2 == --2 ? "等级" : (var2 == --3 ? "忠诚" : (var2 == --4 ? "亲密" : (var2 == --5 ? "气血" : (var2 == 6 ? "法力" : (var2 == 7 ? "攻击" : (var2 == 8 ? "速度" : (var2 == 9 ? "经验" : (var2 == 10 ? "可分配点" : (var2 == 11 ? "根骨" : (var2 == 12 ? "灵性" : (var2 == 13 ? "力量" : (var2 == 14 ? "敏捷" : (var2 == 15 ? "禅定" : (var2 == 16 ? "定力" : "")))))))))))))))));
         if (var2 == 0) {
            var3 = this;
            this.iv[var2].setBounds(45, 21, 170, 21);
            this.iv[var2].setForeground(Color.white);
         } else if (var2 >= --1 && var2 <= 9) {
            var3 = this;
            this.iv[var2].setBounds(39, 195 + (var2 - --1) * 25, 40, 20);
         } else if (var2 == 10) {
            var3 = this;
            this.iv[var2].setBounds(231, 271, 92, 20);
         } else if (var2 >= 11 && var2 <= 14) {
            var3 = this;
            this.iv[var2].setBounds(231, 297 + (var2 - 11) * 25, 40, 20);
         } else if (var2 == 15) {
            var3 = this;
            this.iv[var2].setBounds(39, 395, 40, 20);
         } else {
            if (var2 == 16) {
               this.iv[var2].setBounds(231, 397, 40, 20);
            }

            var3 = this;
         }

         var3.add(this.iv[var2++]);
      }

      Class643[] var5 = new Class643[17];
      var10003 = true;
      this.y = var5;

      for(var10000 = var2 = 3 ^ 3; var10000 < this.y.length; var10000 = var2) {
         this.y[var2] = new Class643((String)null, 3 >> 1, 21 + var2, Class681.bm, (Color[])null, "", this);
         this.y[var2].setText(var2 == --5 ? "改" : (var2 == 6 ? "放生" : (var2 == 7 ? "驯养" : (var2 == 8 ? "召唤" : (var2 == 9 ? "参战" : (var2 == 10 ? "物品" : (var2 == 11 ? "炼妖" : (var2 == 12 ? "抗性" : (var2 == 13 ? "技能" : (var2 == 14 ? "推荐加点" : (var2 == 15 ? "确认加点" : (var2 == 16 ? "灵犀" : ""))))))))))));
         if (var2 == 0) {
            var3 = this;
            this.y[var2].setImage("sc/e/1.png");
            this.y[var2].setBounds(258, 22, 18, 18);
         } else if (var2 == --1) {
            var3 = this;
            this.y[var2].setImage("sc/e/2.png");
            this.y[var2].setBounds(279, 22, 18, 18);
         } else if (var2 >= --2 && var2 <= --4) {
            var3 = this;
            this.y[var2].setImage("sc/e/49.png");
            this.y[var2].setBounds(217, 93 + (var2 - (5 >> 1)) * 20, 17, 17);
         } else if (var2 == --5) {
            var3 = this;
            this.y[var2].setImage("sc/e/40.png");
            this.y[var2].setBounds(195, 196, 18, 18);
         } else if (var2 != 6 && var2 != 7) {
            label366: {
               if ((var2 < 8 || var2 > 13) && var2 != 16) {
                  if (var2 == 14 || var2 == 15) {
                     this.y[var2].setImage("sc/e/27.png");
                     this.y[var2].setBounds(233 + (var2 - 14) * 77, 397, 51, 17);
                  }
               } else {
                  this.y[var2].setFont(Class681.ak);
                  this.y[var2].setForeground(Color.black);
                  this.y[var2].setImage("sc/e/7.png");
                  if (var2 == 8) {
                     var3 = this;
                     this.y[var2].setBounds(315, 450, 59, 25);
                     break label366;
                  }

                  if (var2 == 9) {
                     var3 = this;
                     this.y[var2].setBounds(310, 243, 59, 25);
                     break label366;
                  }

                  if (var2 == 10) {
                     var3 = this;
                     this.y[var2].setBounds(43 + (var2 - 10) * 68, 450, 59, 25);
                     break label366;
                  }

                  if (var2 == 11) {
                     var3 = this;
                     this.y[var2].setBounds(43 + (var2 - 10) * 68, 450, 59, 25);
                     break label366;
                  }

                  if (var2 == 12) {
                     var3 = this;
                     this.y[var2].setBounds(43 + (var2 - 10) * 68, 450, 59, 25);
                     break label366;
                  }

                  if (var2 == 13) {
                     var3 = this;
                     this.y[var2].setBounds(43 + (var2 - 10) * 68, 450, 59, 25);
                     break label366;
                  }

                  if (var2 == 16) {
                     var3 = this;
                     this.y[var2].setBounds(244, 243, 59, 25);
                     break label366;
                  }
               }

               var3 = this;
            }
         } else {
            var3 = this;
            this.y[var2].setImage("sc/e/6.png");
            this.y[var2].setBounds(178, 221 + (var2 - 6) * 25, 34, 18);
         }

         var3.add(this.y[var2++]);
      }

      Class70[] var6 = new Class70[10];
      var10003 = true;
      this.uq = var6;

      for(var10000 = var2 = 3 & 4; var10000 < this.uq.length; var10000 = var2) {
         this.uq[var2] = new Class70(var2 % --2 == 0 ? "sc/e/32.png" : "sc/e/34.png", 1, 200 + var2, this);
         this.uq[var2].setBounds(350 + 11 * (var2 % --2), 300 + 25 * (var2 / (1 ^ 3)), 11, 15);
         this.add(this.uq[var2++]);
      }

      this.ur = Class133.n(Class511.q("sc/d/17.png", --3, --3, --3, --3, (boolean)(2 & 5)), Class681.bx, Color.white);
      this.ur.setBounds(79, 195, 134, 20);
      this.add(this.ur);
      Class245[] var7 = new Class245[15];
      var10003 = true;
      this.cj = var7;

      for(var10000 = var2 = 3 ^ 3; var10000 < this.cj.length; var10000 = var2) {
         this.cj[var2] = Class133.a(3 & 4, 3 & 4, 3 & 4, 3 & 4, 10, Color.white, var2 == 0 ? Class681.bx : Class681.cd);
         this.cj[var2].eq(Class511.q("sc/d/17.png", --3, --3, --3, --3, (boolean)(3 & 4)));
         if (var2 != 0 && var2 != (4 ^ 5)) {
            if (var2 >= 5 >> 1 && var2 <= 7) {
               var3 = this;
               this.cj[var2].setBounds(79, 220 + var2 * 25, 134, 20);
            } else if (var2 == 8) {
               var3 = this;
               this.cj[var2].setBounds(323, 271, 52, 20);
            } else if (var2 >= 9 && var2 <= 12) {
               var3 = this;
               this.cj[var2].setBounds(271, 297 + (var2 - 9) * 25, 104, 20);
            } else if (var2 == 13) {
               var3 = this;
               this.cj[var2].setBounds(79, 395, 134, 20);
            } else {
               if (var2 == 14) {
                  this.cj[var2].setBounds(271, 397, 104, 20);
               }

               var3 = this;
            }
         } else {
            var3 = this;
            this.cj[var2].setBounds(79, 220 + var2 * 25, 98, 20);
         }

         var3.add(this.cj[var2++]);
      }

      Class436[] var8 = new Class436[3];
      var10003 = true;
      this.il = var8;

      for(var10000 = var2 = 2 & 5; var10000 < this.il.length; var10000 = var2) {
         this.il[var2] = new Class436();
         if (var2 == 0) {
            var3 = this;
            this.il[var2].eq(Class511.q("sc/d/25.png", 2, 2, 2, 2, (boolean)(3 ^ 3)));
            this.il[var2].setBounds(45, 21, 170, 21);
         } else if (var2 == (4 ^ 5)) {
            var3 = this;
            this.il[var2].eq(Class511.q("sc/d/24.png", 2, 2, 2, 2, false));
            this.il[var2].setBounds(45, 21, 170, 160);
         } else {
            if (var2 == 2) {
               this.il[var2].eq(Class511.q("sc/d/16.png", 2, 2, 2, 2, false));
               this.il[var2].setBounds(234, 40, 143, 200);
            }

            var3 = this;
         }

         var3.add(this.il[var2++]);
      }

      this.as(0);
   }

   public void r(boolean var1) {
      this.lc = var1;
   }

   public void q() {
      this.ut.cc();
      this.ut.q();
      super.q();
   }

   public void gd(int var1, String var2) {
      this.ur.setText(var2);
      this.cj[3 >> 2].setForeground(Color.white);
      this.cj[5 >> 3].setText(Class224.t(var1) + "级");
      this.as(Class224.n(var1));
   }

   protected void paintChildren(Graphics var1) {
      super.paintChildren(var1);
      if (this.up != null) {
         this.up.a(var1, 17404 & 15663, 14335 & 18632, 3 >> 2, Class280.l());
      }

      if (this.lc) {
         var1.drawImage(Class222.u, 21500 & 11627, 127 & 46, 122 & 15, 29 & 110, (ImageObserver)null);
      }

   }

   public void cf(int var1, int var2) {
      try {
         Class615 var10000;
         if (var1 == 0) {
            var10000 = this;
            var1 = Integer.parseInt(this.cj[45 & 91].getText());
            this.cj[43 & 93].setText(String.valueOf(var1 + var2));
         } else if (var1 == (2 ^ 3)) {
            var10000 = this;
            var1 = Integer.parseInt(this.cj[75 & 62].getText());
            this.cj[90 & 47].setText(String.valueOf(var1 + var2));
         } else if (var1 == (1 ^ 3)) {
            var10000 = this;
            var1 = Integer.parseInt(this.cj[43 & 95].getText());
            this.cj[123 & 15].setText(String.valueOf(var1 + var2));
         } else if (var1 == --3) {
            var10000 = this;
            var1 = Integer.parseInt(this.cj[46 & 93].getText());
            this.cj[124 & 15].setText(String.valueOf(var1 + var2));
         } else {
            if (var1 == --4) {
               var1 = Integer.parseInt(this.cj[31 & 110].getText());
               this.cj[62 & 79].setText(String.valueOf(var1 + var2));
            }

            var10000 = this;
         }

         var1 = Integer.parseInt(var10000.cj[61 & 74].getText());
         this.cj[46 & 89].setText(String.valueOf(var1 - var2));
      } catch (Exception var3) {
      }
   }

   public int mi(int var1) {
      try {
         if (var1 == 0) {
            return Integer.parseInt(this.cj[125 & 11].getText());
         }

         if (var1 == 3 >> 1) {
            return Integer.parseInt(this.cj[91 & 46].getText());
         }

         if (var1 == 5 >> 1) {
            return Integer.parseInt(this.cj[127 & 11].getText());
         }

         if (var1 == --3) {
            return Integer.parseInt(this.cj[31 & 108].getText());
         }

         if (var1 == --4) {
            return Integer.parseInt(this.cj[47 & 94].getText());
         }

         if (var1 == --5) {
            var1 = Integer.parseInt(this.cj[28 & 107].getText());
            return var1;
         }
      } catch (Exception var2) {
         var1 = 3 & 4;
      }

      return var1;
   }

   public void gi(Class581 var1) {
      if (var1 == null) {
         if (this.us != null) {
            this.us.setVisible((boolean)(2 & 5));
         }
      } else if (var1.gl() != 0L) {
         if (this.us == null) {
            this.us = new JComponent() {
               private BigDecimal ne;
               List<Class643> ez;

               public {
                  int var10002 = 3 & 4;
                  this.setLayout((LayoutManager)null);
                  this.setBackground(Class681.cu);
                  this.setVisible((boolean)var10002);
                  this.ez = new ArrayList();
               }

               public void cf(int var1, int var2) {
                  RoleData var5 = Class615.this.vd();
                  int var4 = 2 & 5;
                  Class615.this.ut.getComponentCount();

                  int var3;
                  int var10000;
                  int var10001;
                  int var10003;
                  int var10004;
                  int var10005;
                  for(var10000 = var3 = 3 >> 2; var10000 < var5.pets.size(); var10000 = var3) {
                     if (((RolePet)var5.pets.get(var3)).getId().compareTo(this.ne) != 0) {
                        Class643 var7 = var4 < this.ez.size() ? (Class643)this.ez.get(var4) : null;
                        if (var7 == null) {
                           var7 = new Class643("sc/c/81", --1, 111 & 23, Class681.bm, (Color[])null, (String)null, Class615.this.gk());
                           this.ez.add(var7);
                           this.add(var7);
                        }

                        var10001 = 2 ^ 3;
                        var10003 = --3;
                        var7.setText(String.valueOf(var3 + (2 ^ 3)));
                        var10003 += var4 % (71 & 62) * (115 & 30);
                        var10004 = (3 >> 1) + var4 / (38 & 95) * (18 & 127);
                        var10005 = 58 & 87;
                        ++var4;
                        var7.setBounds(var10003, var10004, var10005, var10005);
                        var7.setVisible((boolean)var10001);
                     }

                     ++var3;
                  }

                  Class643 var8 = var4 < this.ez.size() ? (Class643)this.ez.get(var4) : null;
                  if (var8 == null) {
                     var8 = new Class643("sc/c/81", 2 ^ 3, 15 & 119, Class681.bm, (Color[])null, (String)null, Class615.this.gk());
                     this.ez.add(var8);
                     this.add(var8);
                  }

                  var10001 = 3 >> 1;
                  var10003 = --3;
                  var8.setText("X");
                  var10003 += var4 % (23 & 110) * (115 & 30);
                  var10004 = (3 & 5) + var4 / (95 & 38) * (18 & 127);
                  var10005 = 22 & 123;
                  ++var4;
                  var8.setBounds(var10003, var10004, var10005, var10005);
                  var8.setVisible((boolean)var10001);

                  int var6;
                  for(var10000 = var6 = var4; var10000 < this.ez.size(); var10000 = var6) {
                     Object var9 = this.ez.get(var6);
                     ++var6;
                     ((Class643)var9).setVisible((boolean)(3 & 4));
                  }

                  Class615.this.us.setBounds(var1, var2, 114 & 127, (52 & 95) + (var4 - --1) / (111 & 22) * (63 & 82));
               }

               public void bk(BigDecimal var1) {
                  this.ne = var1;
               }
            };
            this.add(this.us, 3 >> 2);
         }

         this.us.bk(new BigDecimal(var1.gl()));
         this.us.cf(26606 & 6391, 120 & 47);
         this.us.setVisible((boolean)(--1));
      }
   }

   public void bk(BigDecimal var1) {
      this.ut.gh(var1 != null ? var1.longValue() : 0L);
   }

   public void w(RolePet var1) {
      RoleData var2;
      (var2 = this.vd()).setChosePetId(var1 != null ? var1.getId() : null);
      if (var1 == null) {
         this.d();
         this.ve().n(23 & 122);
         this.ve().n(91 & 103);
      } else {
         this.gi((Class581)null);
         RoleSummoning var4;
         int[] var3 = PetProperty.getPetHMASp(var4 = var1.getPet(), var2);
         this.cj[--3].setText(var4.getBasishp(var3[5 >> 3]) + "/" + var3[2 & 5]);
         this.cj[--4].setText(var4.getBasismp(var3[--1]) + "/" + var3[2 ^ 3]);
         this.cj[--5].setText(String.valueOf(var3[1 ^ 3]));
         this.cj[71 & 62].setText(String.valueOf(var3[--3]));
         this.cj[61 & 79].setText(String.valueOf(var3[--4]));
         this.cj[25 & 111].setText(String.valueOf(var3[--5]));
         this.cj[58 & 79].setText(String.valueOf(var3[55 & 78]));
         this.cj[59 & 79].setText(String.valueOf(var3[103 & 31]));
         this.cj[12 & 127].setText(String.valueOf(var3[108 & 27]));
         this.cj[95 & 46].setText(String.valueOf(var3[29 & 107]));
         this.cj[9 & 126].setText(String.valueOf(var4.getCanpoint()));
         this.cj[23 & 111].setText(var4.getExp().toString() + "/" + this.vc().d(var4.getTurnRount(), Class224.p(var4.getGrade())));
         this.cj[4 ^ 5].setText(var4.getFaithful().toString());
         this.cj[1 ^ 3].setText(var4.getFriendliness().toString());
         this.gd(var4.getGrade(), var4.getSummoningname());
         this.aej.baseView.ky(var3, var4);
         BigDecimal var5;
         if ((var5 = var2.getLoginResult().getSummoning_id()) != null && var5.compareTo(var4.getSid()) == 0) {
            this.y[13 & 123].setText("休息");
         } else {
            this.y[9].setText("参战");
         }

         int var6;
         int var10000;
         for(var10000 = var6 = 2; var10000 < 5; var10000 = var6) {
            this.y[var6++].setVisible((boolean)(2 & 5));
         }

         if (var4.getInnerGoods() != null && !var4.getInnerGoods().equals("")) {
            String[] var7 = var4.getInnerGoods().split("\\|");

            int var8;
            for(var10000 = var8 = 3 ^ 3; var10000 < var7.length && var8 < --3; var10000 = var8) {
               int var10001 = var8 + (5 >> 1);
               ++var8;
               this.y[var10001].setVisible((boolean)(--1));
            }
         }

         this.up = var4.getPart(this.aej);
         this.lc = (boolean)((var4.getPetlock() >> (5 >> 3) & --1) == 5 >> 2 ? 3 & 5 : 0);
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
}
