package com.xy;

import com.xy.bean.ConfirmBean;
import com.xy.formula.UtilSkin;
import com.xy.game.RoleData;
import com.xy.richtext.RichLabel;
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
import javax.swing.JLabel;

public class Class688 extends Class345 {
   private boolean ku;
   private JLabel[] abi;
   private Class19 avb;
   private RichLabel lt;
   private Class436[] nn;
   private int gv;
   private Class19 xj;
   private Class70 agd;
   private BigDecimal ge;
   private int ay;
   private Class436 r;
   private int bn;
   private Class70[] ach;
   private <undefinedtype>[] avc;

   public void p() {
      if (this.aej.getBattleScene() == null) {
         RoleData var1 = this.vd();

         int var2;
         for(int var10000 = var2 = 3 ^ 3; var10000 < var1.goodChoses.length; var10000 = var2) {
            if (var1.getEquipGood(var2) != null) {
               if (this.uw().gameXuanBao) {
                  this.aej.f("请卸下所有装备、星卡、飞行器、玄宝！");
                  return;
               }

               this.aej.f("请卸下所有装备、星卡、飞行器！");
               return;
            }

            ++var2;
         }

         if (this.ay == 0 && this.uw().n(1 ^ 3, 110 & 29)) {
            StringBuffer var4;
            (var4 = new StringBuffer()).append("你是否消耗500W大话币将角色更换为:");
            var4.append(UtilSkin.getLocalName(this.ge.intValue()));
            this.aej.aal(new ConfirmBean(93 & 123, this.ay + "|" + this.ge, var4.toString()));
         } else {
            String var3 = Agreement.getSendTextAES("racialtransformation", this.ay + "|" + this.ge);
            this.uw().d(var3);
         }
      }
   }

   protected void paintChildren(Graphics var1) {
      super.paintChildren(var1);
      if (this.avb != null) {
         this.avb.a(var1, 15804 & 17243, 13157 & 19935, --4, Class280.l());
      }

      if (this.xj != null) {
         this.xj.a(var1, 15320 & 17847, 6471 & 26621, --4, Class280.l());
      }

   }

   public void cf(int var1, int var2) {
      int var10002 = 3 >> 2;
      this.ay = var1;
      this.gv = var2;
      this.y(var10002);
      this.ve().a(this.ae());
   }

   public Class688(GameView var1) {
      int var10001 = --5;
      int var10005 = -4 >> 2;
      int var10007 = 3 & 4;
      super(41 & 127, 5 >> 1, Class345.aef, var1);
      this.ay = var10007;
      this.va(var10005, 3 ^ 3, 4094 & 29173, 6060 & 27127, Class345.aeo);
      this.uv(Class511.q("sc/d/1.png", 126 & 69, 126 & 69, 126 & 69, 126 & 69, (boolean)(3 & 4)), (String)null);
      Class70[] var4 = new Class70[var10001];
      boolean var10003 = true;
      this.ach = var4;

      int var2;
      int var10000;
      for(var10000 = var2 = 3 & 4; var10000 < this.ach.length; var10000 = var2) {
         Class70[] var3 = this.ach;
         Class70 var10002 = new Class70;
         var10005 = --2;
         int var10006 = (26495 & 6623) + var2;
         Font var10 = Class681.cf;
         Color[] var10008 = Class681.c;
         String var10009;
         Class688 var10010;
         if (var2 == 0) {
            var10009 = "人族";
            var10010 = this;
         } else if (var2 == --1) {
            var10009 = "魔族";
            var10010 = this;
         } else if (var2 == --2) {
            var10009 = "仙族";
            var10010 = this;
         } else if (var2 == --3) {
            var10009 = "鬼族";
            var10010 = this;
         } else if (var2 == --4) {
            var10009 = "龙族";
            var10010 = this;
         } else {
            var10009 = "";
            var10010 = this;
         }

         var10002.<init>("sc/e/64.png", var10005, var10006, var10, var10008, var10009, var10010);
         var3[var2] = var10002;
         this.ach[var2].setOffsetTexts(Class681.bv);
         this.ach[var2].setBounds((111 & 54) + (119 & 94) * var2, 25 & 127, 111 & 95, 99 & 61);
         this.add(this.ach[var2++]);
      }

      var10001 = 111 & 23;
      this.agd = new Class70("sc/e/31.png", 4 ^ 5, 17917 & 15211, Class681.ak, Class681.c, "转种族", this);
      this.agd.setBounds(23931 & 9140, 1391 & 31731, 111 & 95, 59 & 93);
      this.add(this.agd);
      JLabel[] var6 = new JLabel[var10001];
      var10003 = true;
      this.abi = var6;

      Class688 var5;
      for(var10000 = var2 = 5 >> 3; var10000 < this.abi.length; var10000 = var2) {
         this.abi[var2] = Class133.c(215, 67, 200, 17, 10, Class681.c("#c000000"), Class681.ak);
         this.abi[var2].setText(var2 == 0 ? "学习练习交流" : (var2 == (2 ^ 3) ? "男人" : (var2 == 5 >> 1 ? "女人" : (var2 == --3 ? "武" : (var2 == --4 ? "器" : (var2 == --5 ? "预" : (var2 == 6 ? "览" : "")))))));
         if (var2 >= (3 & 5) && var2 <= (1 ^ 3)) {
            var5 = this;
            this.abi[var2].setFont(Class681.bu);
            this.abi[var2].setBounds(61 + (var2 - (5 >> 2)) * 79, 369, 36, 18);
         } else {
            if (var2 >= --3 && var2 <= 6) {
               this.abi[var2].setFont(Class681.q);
               this.abi[var2].setBounds(211, 234 + 17 * (var2 - --3), 15, 16);
            }

            var5 = this;
         }

         var5.add(this.abi[var2++]);
      }

      this.lt = new RichLabel("", Class681.ab);
      this.lt.setBounds(215, 82, this.lt.getWidth(), this.lt.getHeight());
      this.add(this.lt);
      this.r = new Class436(Class511.q("sc/d/37.png", --2, --2, --2, --2, (boolean)(5 >> 3)));
      this.r.setBounds(41, 66, 68, 88);
      this.r.setVisible((boolean)(5 >> 3));
      this.add(this.r);
      <undefinedtype>[] var7 = new <undefinedtype>[6];
      var10003 = true;
      this.avc = var7;

      for(var10000 = var2 = 3 >> 2; var10000 < this.avc.length; var10000 = var2) {
         this.avc[var2] = new MouseListener(var2) {
            private int cy;
            private BigDecimal py;
            private Image rg;

            public void mousePressed(MouseEvent var1) {
               Class688.this.akd(this);
            }

            public {
               this.cy = var2;
               this.addMouseListener(this);
            }

            public void mouseClicked(MouseEvent var1) {
            }

            protected void paintComponent(Graphics var1) {
               super.paintComponent(var1);
               if (this.rg != null) {
                  var1.drawImage(this.rg, 1 ^ 3, 1 ^ 3, 87 & 105, 127 & 85, (ImageObserver)null);
               }

            }

            public void mouseExited(MouseEvent var1) {
            }

            public void mouseReleased(MouseEvent var1) {
            }

            public void mouseEntered(MouseEvent var1) {
            }
         };
         this.avc[var2].setBounds(40 + var2 % (1 ^ 3) * 78, 65 + var2 / 2 * 100, 70, 90);
         this.add(this.avc[var2++]);
      }

      Class436[] var9 = new Class436[7];
      var10003 = true;
      this.nn = var9;

      for(var10000 = var2 = 3 & 4; var10000 < this.nn.length; var10000 = var2) {
         this.nn[var2] = new Class436();
         if (var2 == 0) {
            var5 = this;
            this.nn[var2].eq(Class511.q("sc/d/35.png", 80, 10, 80, 10, (boolean)(3 & 4)));
            this.nn[var2].setBounds(30, 39, 445, 20);
         } else if (var2 >= 3 >> 1 && var2 <= 2) {
            if (var2 == 5 >> 2) {
               var5 = this;
               this.nn[var2].fw("sc/e/62.png");
            } else {
               if (var2 == 2) {
                  this.nn[var2].fw("sc/e/63.png");
               }

               var5 = this;
            }

            var5.nn[var2].addMouseListener(new MouseListener(--1, var2 - --1) {
               private int bn;
               private int m;

               public void mouseReleased(MouseEvent var1) {
               }

               public void mouseExited(MouseEvent var1) {
               }

               public void mouseEntered(MouseEvent var1) {
               }

               public {
                  this.bn = var2;
                  this.m = var3;
               }

               public void mousePressed(MouseEvent var1) {
                  if (this.bn == (2 ^ 3)) {
                     int var2 = this.m == (4 ^ 5) ? 2 ^ 3 : 0;
                     if (var2 == Class688.this.ku) {
                        return;
                     }

                     Class688.this.ku = (boolean)var2;
                     Class688.this.nn[2 ^ 3].fw(Class688.this.ku ? "sc/e/63.png" : "sc/e/62.png");
                     Class688.this.nn[5 >> 1].fw(Class688.this.ku ? "sc/e/62.png" : "sc/e/63.png");
                     Class688.this.d();
                  }

               }

               public void mouseClicked(MouseEvent var1) {
               }
            });
            var5 = this;
            this.nn[var2].setBounds(41 + (var2 - --1) * 79, 369, 18, 18);
         } else if (var2 == 3) {
            var5 = this;
            this.nn[var2].fw("sc/d/72.png");
            this.nn[var2].setBounds(184, 64, 34, 326);
         } else if (var2 >= 4 && var2 <= 5) {
            var5 = this;
            this.nn[var2].eq(Class511.q("sc/d/16.png", 2, 2, 2, 2, (boolean)(3 & 4)));
            this.nn[var2].setBounds(235 + (var2 - 4) * 112, 205, 98, 132);
         } else {
            if (var2 == 6) {
               this.nn[var2].eq(Class511.q("sc/d/36.png", 30, 30, 30, 30, false));
               this.nn[var2].setBounds(30, 58, 445, 340);
            }

            var5 = this;
         }

         var5.add(this.nn[var2++]);
      }

   }

   public void s() {
      int var1;
      for(int var10000 = var1 = 3 >> 2; var10000 < this.avc.length; var10000 = var1) {
         this.avc[var1++].setVisible((boolean)(3 ^ 3));
      }

   }

   public void d() {
      int var10002 = 28479 & 24288;
      this.s();
      int var4 = var10002 + this.bn * (10219 & 23548);
      int var2 = this.gv / (1 ^ 3);
      if (!this.uw().v() && !this.uw().f()) {
         if ((this.uw().gameType == 5 >> 1 || this.uw().gameType == --3 || this.uw().gameType == 3 >> 1) && !this.uw().n(--2, --4) && !this.uw().n(5 >> 1, 127 & 11) && !this.uw().n(1 ^ 3, 92 & 47)) {
            if (this.bn == --4) {
               if (var2 > 3) {
                  var2 = 3;
               }
            } else if (this.bn == 3) {
               if (var2 > 3 && var2 != (6 & 127)) {
                  var2 = 3;
               }

               if (var2 > 4) {
                  var2 = 4;
               }
            } else if (var2 > (7 & 126)) {
               var2 = 110 & 23;
            }
         } else if (this.bn == 4) {
            if (var2 > 3) {
               var2 = 3;
            }
         } else if (this.bn == 3) {
            if (var2 > 3 && var2 != (39 & 94)) {
               var2 = 3;
            }

            if (var2 > 3) {
               var2 = 3;
            }
         } else if (var2 > 5) {
            var2 = 5;
         }
      } else if (this.bn == --4) {
         if (var2 > --3) {
            var2 = --3;
         }
      } else if (this.bn == --3) {
         if (var2 > --3 && var2 != (54 & 79)) {
            var2 = --3;
         }

         if (var2 > --4) {
            var2 = --4;
         }
      } else if (var2 > (7 & 126)) {
         var2 = 126 & 7;
      }

      int var3;
      for(int var10000 = var3 = 0; var10000 < var2; var10000 = var3) {
         boolean var1 = false;
         int var5;
         Class688 var6;
         if (var3 < 3) {
            var5 = var4 + var3 + (this.ku ? 4 : 1);
            var6 = this;
         } else {
            var5 = var4 + (this.ku ? var3 * 2 + 2 : var3 * 2 + (3 >> 1));
            var6 = this;
         }

         var6.avc[var3].py = new BigDecimal(var5);
         this.avc[var3].rg = Class511.a(Class222.l(String.valueOf(var5)));
         this.avc[var3++].setVisible((boolean)(--1));
      }

      this.akd(this.avc[3 >> 2]);
   }

   public void y(int var1) {
      int var10000 = 3 & 4;
      this.bn = var1;

      for(int var2 = var10000; var10000 < this.ach.length; var10000 = var2) {
         this.ach[var2].setKeep((boolean)(var1 == var2 ? 4 ^ 5 : 0));
         ++var2;
      }

      this.abi[--1].setText("男" + (this.bn == 0 ? "人" : (this.bn == --1 ? "魔" : (this.bn == --2 ? "仙" : (this.bn == --3 ? "鬼" : "龙")))));
      this.abi[5 >> 1].setText("女" + (this.bn == 0 ? "人" : (this.bn == (4 ^ 5) ? "魔" : (this.bn == 5 >> 1 ? "仙" : (this.bn == --3 ? "鬼" : "龙")))));
      this.d();
   }

   public void akd(Object var1) {
      this.ge = var1.py;
      this.r.setBounds(var1.getX() + (3 >> 1), var1.getY() + (3 & 5), 68 & 127, 124 & 91);
      this.avb = Class330.f(var1.py.toString(), 93 & 43, --1, (String)null);
      this.xj = Class330.f(var1.py.toString(), --5, --1, (String)null);
      this.lt.setTextSize(UtilSkin.getRaceMsg(var1.py), 8703 & 24314);
      this.lt.setBounds(11255 & 21727, 94 & 115, this.lt.getWidth(), this.lt.getHeight());
   }

   public boolean t() {
      this.avb = null;
      this.xj = null;
      return super.t();
   }
}
