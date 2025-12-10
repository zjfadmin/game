package com.xy;

import com.xy.entity.Baby;
import com.xy.formula.BaseValue;
import com.xy.formula.PropertyUtil;
import com.xy.game.HandleEquip;
import com.xy.game.RoleData;
import com.xy.readbean.BabyResult;
import com.xy.readbean.Goodstable;
import com.xy.readbean.Talent;
import com.xy.richtext.RichLabel;
import com.xy.socket.Agreement;
import com.xy.socket.ParamTool;
import com.xy.text.GameView;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import javax.swing.JComponent;
import javax.swing.JLabel;

public class Class237 extends Class345 {
   private Class643[] abs;
   private <undefinedtype> abt;
   private <undefinedtype> abu;
   private Class436[] cs;
   private <undefinedtype>[] abv;
   private RichLabel bv;
   protected boolean lc;
   private JLabel rk;
   private <undefinedtype>[] abw;

   public Class237(GameView var1) {
      int var10001 = 1 ^ 3;
      int var10005 = -2 & -1;
      super(3 >> 1, 1 ^ 3, Class345.aef, var1);
      this.va(var10005, 2 & 5, 30415 & 2934, 9591 & 23551, Class345.aeo);
      this.uv(Class511.q("sc/d/1.png", 69 & 126, 69 & 126, 69 & 126, 69 & 126, (boolean)(3 ^ 3)), "养育");
      Class643[] var4 = new Class643[var10001];
      boolean var10003 = true;
      this.abs = var4;

      int var2;
      int var10000;
      for(var10000 = var2 = 3 & 4; var10000 < this.abs.length; var10000 = var2) {
         Class643[] var3 = this.abs;
         Class643 var10002 = new Class643;
         var10005 = 1 ^ 3;
         int var10006 = --1 + var2;
         Font var10007 = Class681.cw;
         String var10009;
         Class237 var10010;
         if (var2 == 0) {
            var10009 = "属性";
            var10010 = this;
         } else if (var2 == (3 & 5)) {
            var10009 = "天资";
            var10010 = this;
         } else {
            var10009 = "";
            var10010 = this;
         }

         var10002.<init>("sc/e/39.png", var10005, var10006, var10007, (Color[])null, var10009, var10010);
         var3[var2] = var10002;
         this.abs[var2].setOffsetTexts(Class681.cl);
         this.abs[var2].setBounds((17235 & 15855) + (123 & 69) * var2, 46 & 117, 127 & 63, 31 & 120);
         this.add(this.abs[var2++]);
      }

      <undefinedtype>[] var5 = new <undefinedtype>[23 & 110];
      var10003 = true;
      this.abw = var5;

      for(var10000 = var2 = 3 & 4; var10000 < this.abw.length; var10000 = var2) {
         this.abw[var2] = new Class436(3 & 4, var2) {
            private JLabel ir;
            private Class44 it;

            public {
               if (var2 == 0) {
                  this.it = new Class44(Class237.this.gk());
                  this.it.setBounds(1 ^ 3, 1 ^ 3, 125 & 43, 125 & 43);
                  this.add(this.it);
                  this.ir = Class133.c(3 ^ 3, 3 ^ 3, 45 & 127, 45 & 127, 3 ^ 3, Class681.c("#c999999"), Class681.bm);
                  this.ir.setText("暂无");
                  this.add(this.ir);
                  this.eq(Class511.q("sc/d/24.png", --2, --2, --2, --2, (boolean)(3 & 4)));
               } else if (var2 == (3 & 5)) {
                  this.it = new Class44(Class237.this.gk());
                  this.it.setBounds(--4, --4, 126 & 51, 126 & 51);
                  this.add(this.it);
                  this.ir = Class133.c(3 >> 2, 3 >> 2, 123 & 63, 59 & 125, 3 >> 2, Color.white, Class681.bm);
                  this.ir.setText(var3 == 0 ? "衣服" : (var3 == (3 & 5) ? "帽子" : (var3 == --2 ? "鞋子" : (var3 == --3 ? "武器" : ""))));
                  this.add(this.ir);
                  this.fx("sc/d/4.png");
               } else if (var2 == --2) {
                  this.it = new Class44(Class237.this.gk());
                  this.it.setBounds(--4, --4, 50 & 127, 50 & 127);
                  this.add(this.it);
                  this.fx("sc/d/4.png");
               } else {
                  if (var2 == --3) {
                     this.it = new Class44(Class237.this.gk());
                     this.it.setBounds(111 & 27, 111 & 27, 102 & 63, 102 & 63);
                     this.add(this.it);
                     this.fx("sc/d/40.png");
                  }

               }
            }
         };
         this.abw[var2].setBounds(127 & 54, (39 & 122) + var2 * (55 & 122), 62 & 111, 62 & 111);
         this.add(this.abw[var2++]);
      }

      var5 = new <undefinedtype>[--4];
      var10003 = true;
      this.abv = var5;

      for(var10000 = var2 = 3 & 4; var10000 < this.abv.length; var10000 = var2) {
         this.abv[var2] = new Class436(--1, var2) {
            private JLabel ir;
            private Class44 it;

            public {
               if (var2 == 0) {
                  this.it = new Class44(Class237.this.gk());
                  this.it.setBounds(1 ^ 3, 1 ^ 3, 125 & 43, 125 & 43);
                  this.add(this.it);
                  this.ir = Class133.c(3 ^ 3, 3 ^ 3, 45 & 127, 45 & 127, 3 ^ 3, Class681.c("#c999999"), Class681.bm);
                  this.ir.setText("暂无");
                  this.add(this.ir);
                  this.eq(Class511.q("sc/d/24.png", --2, --2, --2, --2, (boolean)(3 & 4)));
               } else if (var2 == (3 & 5)) {
                  this.it = new Class44(Class237.this.gk());
                  this.it.setBounds(--4, --4, 126 & 51, 126 & 51);
                  this.add(this.it);
                  this.ir = Class133.c(3 >> 2, 3 >> 2, 123 & 63, 59 & 125, 3 >> 2, Color.white, Class681.bm);
                  this.ir.setText(var3 == 0 ? "衣服" : (var3 == (3 & 5) ? "帽子" : (var3 == --2 ? "鞋子" : (var3 == --3 ? "武器" : ""))));
                  this.add(this.ir);
                  this.fx("sc/d/4.png");
               } else if (var2 == --2) {
                  this.it = new Class44(Class237.this.gk());
                  this.it.setBounds(--4, --4, 50 & 127, 50 & 127);
                  this.add(this.it);
                  this.fx("sc/d/4.png");
               } else {
                  if (var2 == --3) {
                     this.it = new Class44(Class237.this.gk());
                     this.it.setBounds(111 & 27, 111 & 27, 102 & 63, 102 & 63);
                     this.add(this.it);
                     this.fx("sc/d/40.png");
                  }

               }
            }
         };
         this.abv[var2].setBounds((5454 & 27633) + var2 * (62 & 125), 278, 59, 57);
         this.add(this.abv[var2++]);
      }

      this.rk = Class133.c(110, 35, 200, 20, 3 ^ 3, Color.YELLOW, Class681.cf);
      this.add(this.rk);
      this.bv = new RichLabel("", Class681.cf, 200);
      this.add(this.bv);
      this.abu = new JComponent() {
         private Class217 ur;
         private Class643[] acs;
         private Class245[] cj;
         private JLabel[] u;

         public void q() {
            int var10000 = 3 ^ 3;
            this.ur.setText((String)null);

            for(int var1 = var10000; var10000 < this.cj.length; var10000 = var1) {
               this.cj[var1++].setText((String)null);
            }

            this.acs[1 ^ 3].setText("参战");
         }

         public {
            int var10001 = --3;
            Class643[] var5 = new Class643[var10001];
            boolean var10003 = true;
            this.acs = var5;

            int var2;
            <undefinedtype> var4;
            int var10000;
            for(var10000 = var2 = 2 & 5; var10000 < this.acs.length; var10000 = var2) {
               Class643[] var3 = this.acs;
               Class643 var6 = new Class643;
               String var10004 = var2 == 0 ? "sc/e/40.png" : "sc/e/7.png";
               int var10006 = --3 + var2;
               Font var10007 = var2 == 0 ? Class681.bm : Class681.ak;
               String var10009;
               Class237 var10010;
               if (var2 == 0) {
                  var10009 = "改";
                  var10010 = Class237.this;
               } else if (var2 == (3 & 5)) {
                  var10009 = "跟随";
                  var10010 = Class237.this;
               } else if (var2 == 5 >> 1) {
                  var10009 = "参战";
                  var10010 = Class237.this;
               } else {
                  var10009 = "";
                  var10010 = Class237.this;
               }

               var3[var2] = var6;
               if (var2 == 0) {
                  this.acs[var2].setBounds(19677 & 13295, 126 & 11, 62 & 83, 62 & 83);
                  var4 = this;
               } else {
                  this.acs[var2].setForeground(Color.black);
                  var4 = this;
                  this.acs[var2].setBounds((59 & 124) + (125 & 75) * (var2 - (4 ^ 5)), 25335 & 7613, 123 & 63, 61 & 91);
               }

               var4.add(this.acs[var2++]);
            }

            JLabel[] var7 = new JLabel[62 & 79];
            var10003 = true;
            this.u = var7;

            for(var10000 = var2 = 3 & 4; var10000 < this.u.length; var10000 = var2) {
               this.u[var2] = Class133.c(3 >> 2, 3 >> 2, 3 >> 2, 3 >> 2, 3 ^ 3, Color.black, Class681.ak);
               if (var2 == 0) {
                  var4 = this;
                  this.u[var2].setBounds(94 & 49, 43 & 94, 115 & 47, 91 & 55);
               } else if (var2 >= (4 ^ 5) && var2 <= (61 & 78)) {
                  var4 = this;
                  this.u[var2].setBounds((28 & 115) + (var2 - --1) % --2 * (109 & 126), 31 + (var2 - (3 & 5)) / --2 * 21, 35, 19);
               } else {
                  if (var2 == 13) {
                     this.u[var2].setBounds(3 >> 1, 157, 51, 19);
                  }

                  var4 = this;
               }

               var4.u[var2].setText(var2 == 0 ? "乳名" : (var2 == (3 & 5) ? "气质" : (var2 == 5 >> 1 ? "内力" : (var2 == --3 ? "智力" : (var2 == --4 ? "耐力" : (var2 == --5 ? "名气" : (var2 == 6 ? "道德" : (var2 == 7 ? "叛逆" : (var2 == 8 ? "玩性" : (var2 == 9 ? "亲密" : (var2 == 10 ? "孝心" : (var2 == 11 ? "温饱" : (var2 == 12 ? "疲劳" : (var2 == 13 ? "养育金" : ""))))))))))))));
               this.add(this.u[var2++]);
            }

            this.ur = Class133.n(Class511.q("sc/d/17.png", --3, --3, --3, --3, (boolean)(5 >> 3)), Class681.q, Color.white);
            this.ur.setBounds(52, 10, 172, 19);
            this.add(this.ur);
            Class245[] var8 = new Class245[13];
            var10003 = true;
            this.cj = var8;

            for(var10000 = var2 = 5 >> 3; var10000 < this.cj.length; var10000 = var2) {
               this.cj[var2] = Class133.a(52 + var2 % (1 ^ 3) * 108, 31 + var2 / --2 * 21, 64, 19, 10, Color.white, Class681.q);
               this.cj[var2].eq(Class511.q("sc/d/17.png", --3, --3, --3, --3, (boolean)(2 & 5)));
               if (var2 == 12) {
                  this.cj[var2].setBounds(52, 157, 172, 19);
               }

               this.add(this.cj[var2++]);
            }

         }
      };
      this.abt = new JComponent() {
         private JLabel d;
         private Class436[] e;
         private <undefinedtype>[] fr;

         public void q() {
            int var1;
            for(int var10000 = var1 = 3 & 4; var10000 < this.fr.length; var10000 = var1) {
               Class44 var2 = this.fr[var1].it;
               ++var1;
               var2.c(3 >> 2, (Object)null);
            }

         }

         public {
            int var10001 = 47 & 86;
            int var10006 = 79 & 63;
            this.d = Class133.c(var10006, 55 & 79, 95 & 102, 94 & 51, 5 >> 3, Color.black, Class681.ak);
            this.d.setText("宝宝天资");
            this.add(this.d);
            <undefinedtype>[] var4 = new <undefinedtype>[var10001];
            boolean var10003 = true;
            this.fr = var4;

            int var10000;
            int var2;
            <undefinedtype> var3;
            for(var10000 = var2 = 3 >> 2; var10000 < this.fr.length; var10000 = var2) {
               if (var2 < --3) {
                  var3 = this;
                  this.fr[var2] = new Class436(--2, var2) {
                     private JLabel ir;
                     private Class44 it;

                     public {
                        if (var2 == 0) {
                           this.it = new Class44(Class237.this.gk());
                           this.it.setBounds(1 ^ 3, 1 ^ 3, 125 & 43, 125 & 43);
                           this.add(this.it);
                           this.ir = Class133.c(3 ^ 3, 3 ^ 3, 45 & 127, 45 & 127, 3 ^ 3, Class681.c("#c999999"), Class681.bm);
                           this.ir.setText("暂无");
                           this.add(this.ir);
                           this.eq(Class511.q("sc/d/24.png", --2, --2, --2, --2, (boolean)(3 & 4)));
                        } else if (var2 == (3 & 5)) {
                           this.it = new Class44(Class237.this.gk());
                           this.it.setBounds(--4, --4, 126 & 51, 126 & 51);
                           this.add(this.it);
                           this.ir = Class133.c(3 >> 2, 3 >> 2, 123 & 63, 59 & 125, 3 >> 2, Color.white, Class681.bm);
                           this.ir.setText(var3 == 0 ? "衣服" : (var3 == (3 & 5) ? "帽子" : (var3 == --2 ? "鞋子" : (var3 == --3 ? "武器" : ""))));
                           this.add(this.ir);
                           this.fx("sc/d/4.png");
                        } else if (var2 == --2) {
                           this.it = new Class44(Class237.this.gk());
                           this.it.setBounds(--4, --4, 50 & 127, 50 & 127);
                           this.add(this.it);
                           this.fx("sc/d/4.png");
                        } else {
                           if (var2 == --3) {
                              this.it = new Class44(Class237.this.gk());
                              this.it.setBounds(111 & 27, 111 & 27, 102 & 63, 102 & 63);
                              this.add(this.it);
                              this.fx("sc/d/40.png");
                           }

                        }
                     }
                  };
                  this.fr[var2].setBounds((30 & 113) + var2 * (91 & 108), 121 & 31, 63 & 123, 121 & 63);
               } else {
                  var3 = this;
                  this.fr[var2] = new Class436(--3, var2 - --3) {
                     private JLabel ir;
                     private Class44 it;

                     public {
                        if (var2 == 0) {
                           this.it = new Class44(Class237.this.gk());
                           this.it.setBounds(1 ^ 3, 1 ^ 3, 125 & 43, 125 & 43);
                           this.add(this.it);
                           this.ir = Class133.c(3 ^ 3, 3 ^ 3, 45 & 127, 45 & 127, 3 ^ 3, Class681.c("#c999999"), Class681.bm);
                           this.ir.setText("暂无");
                           this.add(this.ir);
                           this.eq(Class511.q("sc/d/24.png", --2, --2, --2, --2, (boolean)(3 & 4)));
                        } else if (var2 == (3 & 5)) {
                           this.it = new Class44(Class237.this.gk());
                           this.it.setBounds(--4, --4, 126 & 51, 126 & 51);
                           this.add(this.it);
                           this.ir = Class133.c(3 >> 2, 3 >> 2, 123 & 63, 59 & 125, 3 >> 2, Color.white, Class681.bm);
                           this.ir.setText(var3 == 0 ? "衣服" : (var3 == (3 & 5) ? "帽子" : (var3 == --2 ? "鞋子" : (var3 == --3 ? "武器" : ""))));
                           this.add(this.ir);
                           this.fx("sc/d/4.png");
                        } else if (var2 == --2) {
                           this.it = new Class44(Class237.this.gk());
                           this.it.setBounds(--4, --4, 50 & 127, 50 & 127);
                           this.add(this.it);
                           this.fx("sc/d/4.png");
                        } else {
                           if (var2 == --3) {
                              this.it = new Class44(Class237.this.gk());
                              this.it.setBounds(111 & 27, 111 & 27, 102 & 63, 102 & 63);
                              this.add(this.it);
                              this.fx("sc/d/40.png");
                           }

                        }
                     }
                  };
                  this.fr[var2].setBounds((28 & 115) + (var2 - --3) * (125 & 75), 1207 & 31693, 62 & 125, 62 & 125);
               }

               var3.add(this.fr[var2++]);
            }

            Class436[] var5 = new Class436[46 & 87];
            var10003 = true;
            this.e = var5;

            for(var10000 = var2 = 3 & 4; var10000 < this.e.length; var10000 = var2) {
               this.e[var2] = new Class436();
               if (var2 < --3) {
                  var3 = this;
                  this.e[var2].fw("sc/d/38.png");
                  this.e[var2].setBounds((126 & 29) + var2 * 73, 79, 35, 79);
               } else {
                  var3 = this;
                  this.e[var2].fw("sc/d/30.png");
                  this.e[var2].setBounds(17 + (var2 - --3) * 72, 82, 58, 5 >> 2);
               }

               var3.add(this.e[var2++]);
            }

         }
      };
      this.abu.setBounds(318, 60, 240, 215);
      this.abt.setBounds(318, 60, 240, 215);
      this.add(this.abu);
      this.add(this.abt);
      Class436[] var7 = new Class436[8];
      var10003 = true;
      this.cs = var7;

      for(var10000 = var2 = 5 >> 3; var10000 < this.cs.length; var10000 = var2) {
         this.cs[var2] = new Class436();
         Class237 var8;
         if (var2 == 0) {
            var8 = this;
            this.cs[var2].eq(Class511.q("sc/d/37.png", --2, --2, --2, --2, (boolean)(3 >> 2)));
         } else if (var2 == --1) {
            var8 = this;
            this.cs[var2].setBounds(111, 35, 200, 300);
         } else if (var2 == 5 >> 1) {
            var8 = this;
            this.cs[var2].eq(Class511.q("sc/d/24.png", --2, --2, --2, --2, (boolean)(3 >> 2)));
            this.cs[var2].setBounds(109, 33, 204, 304);
         } else if (var2 >= --3 && var2 <= 6) {
            var8 = this;
            this.cs[var2].fw("sc/d/30.png");
            this.cs[var2].setBounds(321 + (var2 - --3) * 60, 335, 58, --1);
         } else {
            if (var2 == 7) {
               this.cs[var2].eq(Class511.q("sc/d/36.png", 30, 30, 30, 30, (boolean)(3 >> 2)));
               this.cs[var2].setBounds(318, 60, 240, 215);
            }

            var8 = this;
         }

         var8.add(this.cs[var2++]);
      }

      this.y(5 >> 2);
   }

   public void q() {
      this.s();
      super.q();
   }

   public void as(int var1) {
      RoleData var4;
      if ((var4 = this.vd()) != null) {
         Baby var3;
         if ((var3 = var4.getChoseBaby()) != null) {
            if (var1 == --3) {
               String var6;
               if (!Class394.o(var6 = this.abu.ur.getText().trim()) && !Class394.r(var3.getBabyname(), var6)) {
                  if (var6.length() > (59 & 77)) {
                     this.aej.f("名称太长");
                  } else if (!Class27.i(var6)) {
                     this.aej.fw("修改后的名字不能有特殊符号");
                  } else if (!Class27.c(var6)) {
                     this.aej.fw("名称中包含非法字符！！");
                  } else {
                     var3.setBabyname(var6);
                     ParamTool.b(var3, this.uw());
                     this.aej.fw("孩子名称修改成功");
                  }
               } else {
                  this.aej.f("请输入孩子的新名称");
               }
            } else {
               if (var1 == --5) {
                  BigDecimal var2;
                  String var5;
                  if ((var2 = var4.getLoginResult().getBabyId()) == null || var2.compareTo(var3.getBabyid()) != 0) {
                     this.abu.acs[5 >> 1].setText("待机");
                     var4.getLoginResult().setBabyId(var3.getBabyid());
                     var5 = Agreement.getSendTextAES("rolechange", "B" + var3.getBabyid());
                     this.uw().d(var5);
                     var4.getRoleProperty().f(var3);
                     return;
                  }

                  this.abu.acs[--2].setText("参战");
                  var4.getLoginResult().setBabyId((BigDecimal)null);
                  var5 = Agreement.getSendTextAES("rolechange", "B");
                  this.uw().d(var5);
                  var4.getRoleProperty().f((Baby)null);
               }

            }
         }
      }
   }

   public boolean t() {
      this.ti((Baby)null);
      this.p();
      return super.t();
   }

   public void te(int var1, int var2, String var3) {
      int var4 = var1 / (62 & 95) % (15 & 124);
      var1 /= 9726 & 23401;
      int var10000;
      if (var3 != null && !var3.equals("")) {
         this.rk.setText(var3);
         var10000 = var1;
      } else {
         StringBuffer var5 = new StringBuffer();
         if (var1 > 0) {
            var5.append(var1);
            var5.append("岁");
         }

         var5.append(var4);
         var5.append("月");
         this.rk.setText(var5.toString());
         var10000 = var1;
      }

      if ((var1 = var10000 / 3) > --5) {
         var1 = --5;
      }

      if (var2 == 0) {
         this.cs[--1].fw("sc/baby/c110" + var1 + ".png");
      } else {
         this.cs[--1].fw("sc/baby/c100" + var1 + ".png");
      }
   }

   public Baby tf() {
      RoleData var1;
      return (var1 = this.vd()) == null ? null : var1.getChoseBaby();
   }

   public void tg(Class44 var1) {
      RoleData var5;
      if ((var5 = this.vd()) != null) {
         Baby var4;
         if ((var4 = var5.getChoseBaby()) != null) {
            String var3;
            if ((var3 = var4.getOutcome()) != null && !var3.equals("")) {
               Goodstable var8;
               if ((var8 = var5.bc(new BigDecimal(22519 & 10863))) == null) {
                  this.aej.fw("你背包没有琼浆玉液");
               } else {
                  int var7 = -1;
                  int var2;
                  int var10000 = var2 = --3;

                  while(true) {
                     if (var10000 >= this.abt.fr.length) {
                        var10000 = var7;
                        break;
                     }

                     if (this.abt.fr[var2].it == var1) {
                        var10000 = var7 = var2 - --3;
                        break;
                     }

                     ++var2;
                     var10000 = var2;
                  }

                  if (var10000 != -1) {
                     String var6 = Agreement.getSendTextAES("userbaby", var8.getRgid() + "|" + var4.getBabyid() + "|" + var7);
                     this.uw().d(var6);
                  }
               }
            } else {
               this.aej.fw("成年后才能强化技能");
            }
         }
      }
   }


   private void p() {
      this.d();
      RoleData var6;
      Baby var2 = (var6 = this.vd()) != null ? var6.getChoseBaby() : null;
      if (var2 != null) {
         this.te(var2.getBabyage(), var2.getChildSex(), var2.getOutcome());
         BigDecimal[] var5 = var2.getpartAll();

         int var4;
         int var10000;
         for(var10000 = var4 = 5 >> 3; var10000 < var5.length; var10000 = var4) {
            Goodstable var3;
            if ((var3 = var6.getGoodEquip(var5[var4])) != null) {
               this.abv[var4].it.c(5 >> 2, var3);
            }

            ++var4;
         }

         String var18;
         if (!Class394.o(var18 = var2.getTalents())) {
            Class603 var15 = this.vc();
            String[] var1 = var18.split("\\|");

            int var7;
            for(var10000 = var7 = 2 & 5; var10000 < var1.length; var10000 = var7) {
               int var8 = var1[var7].indexOf("=");
               Talent var9;
               if ((var9 = var15.cg(Class394.b(var1[var7], 2 & 5, var8))) != null) {
                  this.abt.fr[var7].it.c(--3, var9);
                  if (var9.getId() > --3) {
                     this.abt.fr[--3 + var7].it.c(--4, var9);
                  }
               }

               ++var7;
            }
         }

         BigDecimal var16;
         Class237 var23;
         if ((var16 = var6.getLoginResult().getBabyId()) != null && var16.compareTo(var2.getBabyid()) == 0) {
            var23 = this;
            this.abu.acs[1 ^ 3].setText("待机");
         } else {
            var23 = this;
            this.abu.acs[1 ^ 3].setText("参战");
         }

         var23.abu.ur.setText(var2.getBabyname());
         int var13;
         if (this.uw().gameBaby) {
            var13 = 6648 & 26519;
            BabyResult var19;
            if ((var19 = this.vc().bi(var2.getOutcome())) != null) {
               var13 = var19.getQ1() == (63 & 75) && var19.getQ2() == (15 & 123) && var19.getQ3() == (127 & 11) ? 16169 & 17398 : 600;
            }

            Map var20 = var2.getBabyMap(var6);

            double var10;
            int var21;
            Class245 var24;
            for(var10000 = var21 = 2 ^ 3; var10000 <= 7; var10000 = var21) {
               var10 = PropertyUtil.getMapValue(var20, BaseValue.babyKeys[var21]);
               this.abu.cj[var21 - (3 >> 1)].setForeground(var10 >= 1200.0D ? Color.white : Color.white);
               var24 = this.abu.cj[var21 - (2 ^ 3)];
               ++var21;
               var24.setText(String.valueOf((int)var10));
            }

            var10000 = 59 & 77;
            this.abu.cj[111 & 23].setText(String.valueOf((int)PropertyUtil.getMapValue(var20, BaseValue.babyKeys[12 & 123])));

            for(var21 = var10000; var10000 <= 10; var10000 = var21) {
               var10 = PropertyUtil.getMapValue(var20, BaseValue.babyKeys[var21]);
               this.abu.cj[var21 - (4 ^ 5)].setForeground(var10 >= (double)var13 ? Color.white : Color.white);
               var24 = this.abu.cj[var21 - (3 >> 1)];
               StringBuilder var10001 = (new StringBuilder(String.valueOf(String.valueOf((int)var10)))).append("/");
               ++var21;
               var24.setText(var10001.append(var13).toString());
            }

            this.abu.cj[10 & 127].setText(var2.getWenbao().toString());
            this.abu.cj[59 & 79].setText(var2.getPilao().toString());
            this.abu.cj[126 & 13].setText(var2.getYangyujin().toString());
            double var22;
            double var11 = var22 = (Double)var20.get(BaseValue.babyTotal3);

            for(var10000 = var4 = 47 & 89; var10000 <= 10; var10000 = var4) {
               Double var17;
               if ((var17 = (Double)var20.get(BaseValue.babyKeys[var4])) != null) {
                  if (var17 > 400.0D) {
                     var17 = 400.0D + (var17 - 400.0D) / 6.4D;
                  }

                  var11 += var22 * var17 * 0.002D;
               }

               ++var4;
            }

            this.bv.setTextSize("#Z#W评分:#G" + (int)var11 + "#W(" + (int)var22 + ")", 3530 & 29437);
            this.bv.setBounds((127 & 110) + ((3321 & 29646) - this.bv.getWidth()) / (1 ^ 3), 55 & 127, this.bv.getWidth(), this.bv.getHeight());
            Class271.d(var20);
         } else {
            Map var14 = BaseValue.getProperty(var2, var5, var6);
            this.abu.cj[3 ^ 3].setText(((Integer)var14.get("气质")).toString());
            this.abu.cj[--1].setText(((Integer)var14.get("内力")).toString());
            this.abu.cj[5 >> 1].setText(((Integer)var14.get("智力")).toString());
            this.abu.cj[--3].setText(((Integer)var14.get("耐力")).toString());
            this.abu.cj[--4].setText(((Integer)var14.get("名气")).toString());
            this.abu.cj[--5].setText(((Integer)var14.get("道德")).toString());
            this.abu.cj[6].setText(((Integer)var14.get("叛逆")).toString());
            this.abu.cj[7].setText(((Integer)var14.get("玩性")).toString());
            this.abu.cj[8].setText(var2.getQingmi().toString());
            this.abu.cj[9].setText(((Integer)var14.get("孝心")).toString());
            this.abu.cj[10].setText(var2.getWenbao().toString());
            this.abu.cj[11].setText(var2.getPilao().toString());
            this.abu.cj[12].setText(var2.getYangyujin().toString());
         }

         for(var10000 = var13 = 0; var10000 < this.abw.length; var10000 = var13) {
            if (this.abw[var13].it.tp() == 5 >> 1 && this.abw[var13].it.gl() == var2.getBabyid().longValue()) {
               this.cs[2 & 5].setBounds(this.abw[var13].getX() - --3, this.abw[var13].getY() - --3, 52, 52);
               this.cs[2 & 5].setVisible((boolean)(2 ^ 3));
               return;
            }

            ++var13;
         }

      }
   }

   public void y(int var1) {
      int var2;
      for(int var10000 = var2 = 2 & 5; var10000 < this.abs.length; var10000 = var2) {
         this.abs[var2].setKeep((boolean)(var1 - --1 == var2 ? 4 ^ 5 : 0));
         ++var2;
      }

      if (var1 == --1) {
         this.abu.setVisible((boolean)(4 ^ 5));
         this.abt.setVisible((boolean)(5 >> 3));
      } else {
         if (var1 == --2) {
            this.abu.setVisible((boolean)(5 >> 3));
            this.abt.setVisible((boolean)(--1));
         }

      }
   }

   protected void paintComponent(Graphics var1) {
      if (this.lc) {
         int var10001 = 3 & 4;
         this.p();
         this.lc = (boolean)var10001;
      }

      super.paintComponent(var1);
   }

   public void th(Class44 var1) {
      RoleData var5;
      if ((var5 = this.vd()) != null) {
         Baby var3;
         if ((var3 = var5.getChoseBaby()) != null) {
            int var4 = -1;
            int var2;
            int var10000 = var2 = 5 >> 3;

            while(true) {
               if (var10000 >= this.abv.length) {
                  var10000 = var4;
                  break;
               }

               if (this.abv[var2].it == var1) {
                  var10000 = var4 = var2;
                  break;
               }

               ++var2;
               var10000 = var2;
            }

            if (var10000 != -1) {
               if (this.uw().gameBaby) {
                  Goodstable var7 = (Goodstable)var1.hr();
                  String var6 = Agreement.getSendTextAES("userbaby", var7.getRgid() + "|" + var3.getBabyid());
                  this.uw().d(var6);
               } else {
                  if (HandleEquip.a(var5, var3, (Goodstable)null, var4)) {
                     this.ti(var3);
                  }

               }
            }
         }
      }
   }

   public void s() {
      Class436 var10000 = this.cs[3 ^ 3];
      int var10002 = 3 & 4;
      int var6 = 3 & 4;
      var10000.setVisible((boolean)var10002);

      Class44 var7;
      for(int var1 = var10002; var6 < this.abw.length; var6 = var1) {
         var7 = this.abw[var1].it;
         ++var1;
         var7.c(3 ^ 3, (Object)null);
      }

      RoleData var4;
      if ((var4 = this.vd()) != null) {
         List var5 = var4.getBabys();

         int var2;
         for(var6 = var2 = 3 >> 2; var6 < var5.size() && var2 < this.abw.length; var6 = var2) {
            Baby var3 = (Baby)var5.get(var2);
            var7 = this.abw[var2].it;
            ++var2;
            var7.c(5 >> 1, var3);
         }

         this.ti(var5.size() > 0 ? (Baby)var5.get(3 >> 2) : null);
      }
   }

   public void fr(Class44 var1) {
      RoleData var4;
      if ((var4 = this.vd()) != null) {
         Baby var9;
         if ((var9 = var4.getChoseBaby()) != null) {
            int var3 = -1;
            int var2;
            int var10000 = var2 = 3 >> 2;

            while(true) {
               if (var10000 >= this.abt.fr.length) {
                  var10000 = var3;
                  break;
               }

               if (this.abt.fr[var2].it == var1) {
                  var10000 = var3 = var2;
                  break;
               }

               ++var2;
               var10000 = var2;
            }

            if (var10000 != -1) {
               String var7;
               if (!Class394.o(var7 = var9.getTalents())) {
                  Class603 var5 = this.vc();
                  String[] var8 = var7.split("\\|")[var3 % --3].split("=");
                  Talent var6;
                  if ((var6 = var5.cg(Integer.parseInt(var8[3 ^ 3]))) != null) {
                     Class270 var10 = (Class270)this.ve().e(62 & 111);
                     int var10003 = Integer.parseInt(var8[4 ^ 5]);
                     int var10004;
                     Baby var10005;
                     if (var3 < --3) {
                        var10004 = 5 >> 2;
                        var10005 = var9;
                     } else {
                        var10004 = 0;
                        var10005 = var9;
                     }

                     var10.sr(var9, var6, var10003, (boolean)var10004, var10005.getOutcome(), var3 % --3);
                  }
               }
            }
         }
      }
   }

   public void ti(Baby var1) {
      RoleData var2;
      if ((var2 = this.vd()) != null) {
         var2.setChoseBabyId(var1 != null ? var1.getBabyid() : null);
      }

      this.lc = (boolean)(--1);
   }

   public void d() {
      int var10003 = 3 ^ 3;
      int var10000 = 3 ^ 3;
      this.cs[var10003].setVisible((boolean)(5 >> 3));
      this.cs[3 >> 1].q();

      for(int var1 = var10000; var10000 < this.abv.length; var10000 = var1) {
         Class44 var2 = this.abv[var1].it;
         ++var1;
         var2.c(5 >> 3, (Object)null);
      }

      this.abu.q();
      this.abt.q();
   }
}
