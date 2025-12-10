package com.xy;

import com.xy.bean.SuitOperBean;
import com.xy.entity.PartJade;
import com.xy.entity.RoleSummoning;
import com.xy.formula.ExpUtil;
import com.xy.formula.GoodType;
import com.xy.formula.MsgUntil;
import com.xy.game.RoleData;
import com.xy.game.RolePet;
import com.xy.readbean.Goodstable;
import com.xy.readbean.MoneyType;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Class185 extends Class345 {
   private Class319 aat;
   private Class245 ka;
   private Class390 aau;
   private Class529 aav;
   private Class556 kd;
   private MoneyType aaw;
   private int dm;
   private <undefinedtype> aax;
   private MoneyType ca;
   private Class574[] aay;
   private int br;
   private Class529 xg;
   private Class436[] ce;
   private JLabel[] ai;
   private BigDecimal ge;
   private Class529[] mn;
   private Class529 aaz;
   private Class217 aba;
   private Class556 ys;
   private Class30 abb;

   public Class185(GameView var1) {
      int var10001 = --3;
      int var10005 = -3 & -1;
      int var10009 = -4 >> 2;
      super(95 & 123, --2, Class345.aef, var1);
      this.dm = var10009;
      this.ge = null;
      this.va(var10005, 3 & 4, 2558 & 30591, 17919 & 15303, Class345.aeo);
      this.uv(Class511.q("sc/d/1.png", 68 & 127, 68 & 127, 68 & 127, 68 & 127, (boolean)(3 & 4)), "装备炼化");
      Class529[] var6 = new Class529[var10001];
      boolean var10003 = true;
      this.mn = var6;

      int var2;
      int var10000;
      for(var10000 = var2 = 3 ^ 3; var10000 < this.mn.length; var10000 = var2) {
         Class529[] var5 = this.mn;
         Class529 var10002 = new Class529;
         var10005 = 5 >> 1;
         int var10006 = (32421 & 479) + var2;
         Font var10007 = Class681.cw;
         String var12;
         Class185 var10010;
         if (var2 == 0) {
            var12 = "培养";
            var10010 = this;
         } else if (var2 == (2 ^ 3)) {
            var12 = "重铸";
            var10010 = this;
         } else if (var2 == 5 >> 1) {
            var12 = "觉醒";
            var10010 = this;
         } else {
            var12 = "";
            var10010 = this;
         }

         var10002.<init>("sc/e/39.png", var10005, var10006, var10007, (Color[])null, var12, var10010);
         var5[var2] = var10002;
         this.mn[var2].setOffsetTexts(Class681.cl);
         this.mn[var2].setBounds((124 & 59) + (83 & 109) * var2, 127 & 30, 127 & 63, 88 & 63);
         this.add(this.mn[var2++]);
      }

      var10001 = 118 & 15;
      this.aaz = new Class529("sc/e/28.png", 3 & 5, 653 & 32255, Class681.bm, (Color[])null, "兑换奖励", this);
      this.aaz.setBounds(57 & 119, 16309 & 16878, 108 & 87, 18);
      this.add(this.aaz);
      this.aav = new Class529("sc/e/28.png", --1, 142, Class681.bm, (Color[])null, "已穿装备", this);
      this.xg = new Class529("sc/e/7.png", 4 ^ 5, 143, Class681.ak, Class681.c, "培养", this);
      this.add(this.aav);
      this.add(this.xg);
      Class574[] var7 = new Class574[var10001];
      var10003 = true;
      this.aay = var7;

      for(var10000 = var2 = 3 & 4; var10000 < this.aay.length; var10000 = var2) {
         this.aay[var2] = new Class574(this);
         this.add(this.aay[var2++]);
      }

      JLabel[] var9 = new JLabel[6];
      var10003 = true;
      this.ai = var9;

      Class185 var8;
      for(var10000 = var2 = 3 & 4; var10000 < this.ai.length; var10000 = var2) {
         this.ai[var2] = Class133.c(3 ^ 3, 3 ^ 3, 3 ^ 3, 3 ^ 3, 10, Color.white, Class681.ab);
         if (var2 == 0) {
            var8 = this;
            this.ai[var2].setBounds(130, 68, 54, 18);
         } else if (var2 == 3 >> 1) {
            var8 = this;
            this.ai[var2].setBounds(224, 68, 54, 18);
         } else if (var2 == (1 ^ 3)) {
            var8 = this;
            this.ai[var2].setText("消耗金钱");
         } else if (var2 == --3) {
            var8 = this;
            this.ai[var2].setText("拥有金钱");
         } else if (var2 == --4) {
            var8 = this;
            this.ai[var2].setText("消耗奖章");
         } else {
            if (var2 == --5) {
               this.ai[var2].setText("拥有奖章");
            }

            var8 = this;
         }

         var8.add(this.ai[var2++]);
      }

      this.ca = new MoneyType();
      this.ca.setIdAndKey(5 >> 2, "金钱");
      this.aaw = new MoneyType();
      this.aaw.setIdAndKey(3 & 4, "比斗奖章");
      Class604 var4 = Class511.q("sc/d/17.png", 6, 6, 6, 6, (boolean)(3 >> 2));
      this.ka = Class133.a(3 ^ 3, 3 ^ 3, 3 ^ 3, 3 ^ 3, 10, Color.white, Class681.q);
      this.aba = Class133.n(var4, Class681.q, Color.white);
      this.kd = Class133.i(10, Color.white, Class681.q, this.ca, var1);
      this.ys = Class133.i(10, Color.white, Class681.q, this.aaw, var1);
      this.kd.ab(--2);
      this.ys.ab(--2);
      this.ka.eq(var4);
      this.kd.eq(var4);
      this.ys.eq(var4);
      this.add(this.ka);
      this.add(this.aba);
      this.add(this.kd);
      this.add(this.ys);
      this.aat = new Class319(15, this.aba, this);
      Class436[] var11 = new Class436[--4];
      var10003 = true;
      this.ce = var11;

      int var3;
      for(var10000 = var3 = 3 >> 2; var10000 < this.ce.length; var10000 = var3) {
         this.ce[var3] = new Class436();
         if (var3 == 0) {
            var8 = this;
            this.ce[var3].setBounds(111 + var3 * 94, 68, 18, 18);
            this.ce[var3].addMouseListener(new MouseListener() {
               public void mouseReleased(MouseEvent var1) {
               }

               public void mouseClicked(MouseEvent var1) {
               }

               public void mouseEntered(MouseEvent var1) {
               }

               public void mousePressed(MouseEvent var1) {
                  if (Class185.this.dm != 0) {
                     Class185.this.y(3 & 4);
                  }
               }

               public void mouseExited(MouseEvent var1) {
               }
            });
         } else if (var3 == --1) {
            var8 = this;
            this.ce[var3].setBounds(111 + var3 * 94, 68, 18, 18);
            this.ce[var3].addMouseListener(new MouseListener() {
               public void mouseEntered(MouseEvent var1) {
               }

               public void mouseExited(MouseEvent var1) {
               }

               public void mouseReleased(MouseEvent var1) {
               }

               public void mouseClicked(MouseEvent var1) {
               }

               public void mousePressed(MouseEvent var1) {
                  if (Class185.this.dm != (2 ^ 3)) {
                     Class185.this.y(3 >> 1);
                  }
               }
            });
         } else if (var3 == 5 >> 1) {
            var8 = this;
            this.ce[var3].eq(Class511.q("sc/d/19.png", --5, --5, --5, --5, (boolean)(5 >> 3)));
            this.ce[var3].setBounds(48, 313, 309, 105);
         } else {
            if (var3 == --3) {
               this.ce[var3].eq(Class511.q("sc/d/49.png", --5, --5, --5, --5, (boolean)(3 >> 2)));
               this.ce[var3].setBounds(47, 54, 310, 260);
            }

            var8 = this;
         }

         var8.add(this.ce[var3++]);
      }

      this.abb = new Class30(this, 6, 2, 51, 51, 3 & 4, 3 & 4, 49, 315);
      this.abb.hf(Class511.a("sc/d/18.png"));
      this.add(this.abb);
   }

   public void as(int var1) {
      int var10000 = 3 ^ 3;
      this.br = var1;

      for(var1 = var10000; var10000 < this.mn.length; var10000 = var1) {
         this.mn[var1].setKeep((boolean)(var1 == this.br ? --1 : 0));
         ++var1;
      }

      Class185 var2;
      if (this.br == 0) {
         this.ai[3 ^ 3].setText("培养");
         var2 = this;
         this.ai[3 & 5].setText("分解");
      } else if (this.br == --1) {
         var2 = this;
         this.ai[5 >> 3].setText("重洗属性");
         this.ai[5 >> 2].setText("重悟技能");
      } else {
         if (this.br == --2) {
            this.ai[3 & 4].setText("提升等级");
            this.ai[2 ^ 3].setText("开启觉醒");
         }

         var2 = this;
      }

      var2.y(0);
      this.kd.cc();
      this.ys.cc();
   }

   public void q() {
      this.as(3 & 4);
      super.q();
   }

   public List<BigDecimal> qu(List<BigDecimal> var1, String[] var2) {
      int var4;
      for(int var10000 = var4 = 4 ^ 5; var10000 < var2.length; var10000 = var4) {
         String[] var3;
         Goodstable var5;
         if ((var3 = var2[var4].split("-")).length >= (1 ^ 3) && !var3[3 >> 2].equals("3") && (var5 = this.vd().getGood(new BigDecimal(var3[2 ^ 3]))) != null) {
            if (var1 == null) {
               var1 = new ArrayList();
            }

            ((List)var1).add(var5.getRgid());
         }

         ++var4;
      }

      return (List)var1;
   }

   public boolean aa(long var1, JTextField var3) {
      return (boolean)(3 & 5);
   }

   public Class574[] qv() {
      return this.aay;
   }

   public Long x(long var1, JTextField var3) {
      if (var1 == 0L) {
         return null;
      } else if (var1 < 0L) {
         return 0L;
      } else {
         long var4 = this.vd().getMoney(this.aaw);
         return var1 > var4 ? var4 : null;
      }
   }

   public void av(Goodstable var1) {
      Class605 var2;
      if (this.br == 3 >> 1 && this.dm == 0 && Class394.v(var1.getRgid(), this.aay[3 & 4].u().ez()) && (var2 = (Class605)this.aej.getFormManagement().m(121 & 127)) != null) {
         var2.pk(var1.getValue());
      }

   }

   public void y(int var1) {
      if (this.dm != var1) {
         this.ce[3 & 4].fw(var1 == 0 ? "sc/e/67.png" : "sc/e/68.png");
         this.ce[3 >> 1].fw(var1 == --1 ? "sc/e/67.png" : "sc/e/68.png");
      }

      int var10002 = 3 >> 2;
      this.dm = var1;
      this.r((boolean)var10002);
      this.aav.setVisible((boolean)(3 ^ 3));

      int var10000;
      for(var10000 = var1 = 5 >> 1; var10000 < this.ai.length; var10000 = var1) {
         this.ai[var1++].setVisible((boolean)(5 >> 3));
      }

      this.ka.setVisible((boolean)(3 >> 2));
      this.aba.setVisible((boolean)(2 & 5));
      int var10003 = 2 & 5;
      var10000 = 2 & 5;
      this.kd.setVisible((boolean)var10003);
      this.ys.setVisible((boolean)(5 >> 3));

      for(var1 = var10000; var10000 < this.aay.length; var10000 = var1) {
         this.aay[var1].c(2 & 5, (Object)null);
         this.aay[var1++].setVisible((boolean)(3 & 4));
      }

      if (this.aax != null) {
         this.aax.setVisible((boolean)(2 & 5));
      }

      Class185 var2;
      if (this.br == 0 && this.dm == 0) {
         this.aay[3 >> 2].setBounds(127 & 115, 126 & 119, 123 & 63, 127 & 58);
         this.aay[--1].setBounds(13295 & 19703, 118 & 127, 59 & 127, 122 & 63);
         this.aay[3 & 4].fx("装备");
         this.aay[--1].fx("玄铁晶石");
         this.aav.setBounds(126 & 115, 103 & 124, 63 & 125, 55 & 90);
         this.aav.setVisible((boolean)(3 >> 1));
         this.xg.setText("培养");
         this.xg.setBounds(25259 & 7678, 9627 & 23412, 127 & 59, 27 & 125);
         this.ai[--2].setBounds(98, 204, 72, 19);
         this.ai[--2].setVisible((boolean)(--1));
         this.ai[--3].setBounds(98, 227, 72, 19);
         this.ai[--3].setVisible((boolean)(4 ^ 5));
         this.ka.setBounds(170, 204, 124, 19);
         this.ka.setVisible(true);
         this.kd.setBounds(170, 227, 124, 19);
         this.kd.setVisible(true);
         if (this.uw().n(5 >> 1, 8)) {
            this.ge = new BigDecimal(1000000);
            var2 = this;
         } else if (this.uw().n(5 >> 1, 12)) {
            this.ge = new BigDecimal(100000);
            var2 = this;
         } else {
            this.ge = new BigDecimal(50000000);
            var2 = this;
         }

         Class681.j(var2.ka, this.ge.longValue());
      } else if (this.br == 0 && this.dm == 1) {
         this.aay[0].setBounds(165, 118, 59, 58);
         this.aay[0].fx("装备");
         this.xg.setText("分解");
         this.xg.setBounds(170, 272, 59, 25);
         this.ge = null;
         this.ka.setText((String)null);
      } else if (this.br == 1 && this.dm == 0) {
         var10000 = 1;
         this.aay[0].setBounds(165, 114, 59, 58);

         for(var1 = 1; var10000 < this.aay.length; var10000 = var1) {
            Class574 var3 = this.aay[var1];
            int var10001 = 54 + (var1 - 1) * 59;
            ++var1;
            var3.setBounds(var10001, 177, 59, 58);
         }

         this.aay[0].fx("装备");
         this.aay[1].fx("玄铁晶石");
         this.aay[5 >> 1].fx("内丹精华");
         this.aay[--3].fx("九彩");
         this.aay[--4].fx("九彩");
         this.aay[--5].fx("九彩");
         this.aav.setBounds(164, 96, 61, 18);
         this.aav.setVisible(true);
         this.xg.setText("重洗");
         this.xg.setBounds(170, 284, 59, 25);
         this.ai[5 >> 1].setBounds(98, 237, 72, 19);
         this.ai[5 >> 1].setVisible(true);
         this.ai[--3].setBounds(98, 260, 72, 19);
         this.ai[--3].setVisible(true);
         this.ka.setBounds(170, 237, 124, 19);
         this.ka.setVisible(true);
         this.kd.setBounds(170, 260, 124, 19);
         this.kd.setVisible(true);
         if (this.uw().n(5 >> 1, 12)) {
            this.ge = new BigDecimal(100000);
            var2 = this;
         } else {
            this.ge = new BigDecimal(1000000);
            var2 = this;
         }

         Class681.j(var2.ka, this.ge.longValue());
      } else if (this.br == 1 && this.dm == 1) {
         this.aay[0].setBounds(115, 118, 59, 58);
         this.aay[1].setBounds(231, 118, 59, 58);
         this.aay[0].fx("装备");
         this.aay[1].fx("隐月神石");
         this.aav.setBounds(114, 100, 61, 18);
         this.aav.setVisible(true);
         this.xg.setText("重悟");
         this.xg.setBounds(170, 272, 59, 25);
         this.ai[2].setBounds(98, 204, 72, 19);
         this.ai[2].setVisible(true);
         this.ai[3].setBounds(98, 227, 72, 19);
         this.ai[3].setVisible(true);
         this.ka.setBounds(170, 204, 124, 19);
         this.ka.setVisible(true);
         this.kd.setBounds(170, 227, 124, 19);
         this.kd.setVisible(true);
         if (this.uw().n(2, 12)) {
            this.ge = new BigDecimal(1000000);
            var2 = this;
         } else {
            this.ge = new BigDecimal(5000000);
            var2 = this;
         }

         Class681.j(var2.ka, this.ge.longValue());
      } else if (this.br == 2 && this.dm == 0) {
         this.aay[0].setBounds(85, 105, 59, 58);
         this.aay[0].fx("装备");
         this.aav.setBounds(85, 88, 61, 18);
         this.aav.setVisible(true);
         this.xg.setText("提升");
         this.xg.setBounds(170, 278, 59, 25);
         this.ai[2].setBounds(100, 229, 58, 20);
         this.ai[2].setVisible(true);
         this.ai[3].setBounds(100, 252, 58, 20);
         this.ai[3].setVisible(true);
         this.ka.setBounds(161, 229, 124, 20);
         this.ka.setVisible(true);
         this.kd.setBounds(161, 252, 124, 20);
         this.kd.setVisible(true);
         this.ai[4].setBounds(100, 168, 58, 20);
         this.ai[4].setVisible(true);
         this.ai[5].setBounds(100, 191, 58, 20);
         this.ai[5].setVisible(true);
         this.aba.setBounds(161, 168, 124, 20);
         this.aba.setVisible(true);
         this.ys.setBounds(161, 191, 124, 20);
         this.ys.setVisible(true);
         this.ge = new BigDecimal(0);
         Class681.j(this.ka, this.ge.longValue());
         if (this.aax == null) {
            this.aax = new Class436() {
               private JLabel[] hj;
               private Class436 bl;
               private Class436 ih;

               public {
                  int var10001 = --4;
                  JLabel[] var3 = new JLabel[var10001];
                  boolean var10003 = true;
                  this.hj = var3;

                  int var2;
                  for(int var10000 = var2 = 3 ^ 3; var10000 < this.hj.length; var10000 = var2) {
                     this.hj[var2] = Class133.c(3 ^ 3, 3 ^ 3, 3 ^ 3, 3 ^ 3, var2 == 0 ? 3 ^ 3 : 10, Color.white, Class681.bm);
                     this.add(this.hj[var2++]);
                  }

                  this.hj[--1].setBounds(47 & 91, --3, 28063 & 4855, 120 & 23);
                  this.hj[1 ^ 3].setBounds(15 & 123, 115 & 31, 14591 & 18327, 20 & 123);
                  this.hj[--3].setBounds(11 & 127, 61 & 102, 20151 & 12767, 52 & 91);
                  this.ih = new Class436(Class511.q("sc/d/67.png", --3, --3, --3, --3, (boolean)(3 & 4)));
                  this.bl = new Class436(Class511.q("sc/d/17.png", --3, --3, --3, --3, (boolean)(3 ^ 3)));
                  this.bl.setBounds(125 & 54, 125 & 38, 110 & 127, 63 & 82);
                  this.add(this.ih);
                  this.add(this.bl);
               }

               public void d() {
                  int var10000 = 3 >> 1;
                  this.ih.setVisible((boolean)(3 ^ 3));
                  this.bl.setVisible((boolean)(3 >> 2));

                  int var1;
                  for(var1 = var10000; var10000 < this.hj.length; var10000 = var1) {
                     this.hj[var1++].setVisible((boolean)(5 >> 3));
                  }

                  Goodstable var8;
                  if ((var8 = (Goodstable)Class185.this.aay[3 ^ 3].u().hr()) == null) {
                     this.hj[2 & 5].setForeground(Color.gray);
                     this.hj[3 >> 2].setText("请放入已有觉醒技的装备");
                     this.hj[3 ^ 3].setBounds(3 ^ 3, 3 ^ 3, 29117 & 3815, 59 & 124);
                  } else {
                     String var9;
                     if ((var9 = MsgUntil.getValuesMessage(var8.getValue().split("\\|"), "觉醒技")) == null) {
                        this.hj[3 >> 2].setForeground(Color.red);
                        this.hj[2 & 5].setText("该装备还没有觉醒技");
                        this.hj[3 >> 2].setBounds(3 ^ 3, 3 ^ 3, 14583 & 18349, 124 & 59);
                     } else {
                        long var2;
                        String[] var10;
                        long var4 = ExpUtil.d(var2 = Long.parseLong((var10 = var9.split("&"))[--3]));
                        var2 = ExpUtil.getPetSkillNowExp(var2);
                        long var6 = ExpUtil.getPetSkillMaxExp(var4);
                        this.hj[4 ^ 5].setText("觉醒技:" + var10[2 & 5]);
                        this.hj[5 >> 1].setText("等  级:" + var4);
                        this.hj[--3].setText("经  验:");
                        var1 = (new BigDecimal(var2)).multiply(new BigDecimal(105 & 126)).divide(new BigDecimal(var6), 1 ^ 3, --4).intValue();
                        this.ih.setBounds(63 & 119, 111 & 55, var1 == 0 ? 2 ^ 3 : var1, 12);
                        var10000 = 3 & 5;
                        this.hj[3 ^ 3].setForeground(Color.white);
                        this.hj[3 ^ 3].setText(var2 + "/" + var6);
                        this.hj[2 & 5].setBounds(61 & 118, 101 & 62, 111 & 126, 62 & 83);
                        this.ih.setVisible(true);
                        this.bl.setVisible(true);

                        for(var1 = var10000; var10000 < this.hj.length; var10000 = var1) {
                           this.hj[var1++].setVisible(true);
                        }

                     }
                  }
               }
            };
            this.aax.setBounds(149, 106, 165, 56);
            this.add(this.aax, 1);
         }

         this.aax.d();
         this.aax.setVisible(true);
         this.aba.setText("100");
      } else {
         if (this.br == 2 && this.dm == 1) {
            this.aay[0].setBounds(115, 118, 59, 58);
            this.aay[1].setBounds(231, 118, 59, 58);
            this.aay[0].fx("装备");
            this.aay[1].fx("千年魂石");
            this.aav.setBounds(114, 100, 61, 18);
            this.aav.setVisible(true);
            this.xg.setText("开启");
            this.xg.setBounds(170, 272, 59, 25);
            this.ai[2].setBounds(98, 204, 72, 19);
            this.ai[2].setVisible(true);
            this.ai[3].setBounds(98, 227, 72, 19);
            this.ai[3].setVisible(true);
            this.ka.setBounds(170, 204, 124, 19);
            this.ka.setVisible(true);
            this.kd.setBounds(170, 227, 124, 19);
            this.kd.setVisible(true);
            if (this.uw().n(2, 12)) {
               this.ge = new BigDecimal(2000000);
               var2 = this;
            } else {
               this.ge = new BigDecimal(10000000);
               var2 = this;
            }

            Class681.j(var2.ka, this.ge.longValue());
         }

      }
   }

   public void r(boolean var1) {
      if (this.aau != null || var1) {
         if (var1) {
            if (this.aau == null) {
               this.add(this.aau = new Class390(this), 5 >> 3);
            }

            int var10004 = 2 & 5;
            this.aau.qc.ak((boolean)(2 & 5));
            this.aau.qc.oy().removeAllElements();
            int var4 = var10004;
            RoleData var7 = this.vd();
            List var2 = null;

            int var5;
            for(int var10000 = var5 = 3 & 4; var10000 < var7.pets.size(); var10000 = var5) {
               String var3;
               RoleSummoning var6;
               if ((var3 = (var6 = ((RolePet)var7.pets.get(var5)).getPet()).getStye()) != null && var3.length() > (2 ^ 3)) {
                  String[] var8 = var3.split("\\|");
                  if (var2 != null) {
                     var2.clear();
                  }

                  if ((var2 = this.qu(var2, var8)) != null && var2.size() != 0) {
                     var4 += var2.size();
                     Class367 var10 = new Class367(var6.getSummoningname() + "(" + var2.size() + ")", var6.getSid());
                     this.aau.qc.amy(var10);
                  }
               }

               ++var5;
            }

            Class367 var9 = new Class367("全部(" + var4 + ")", (Object)null);
            this.aau.qc.amy(var9);
            this.aau.qc.y(this.aau.qc.oy().size() - (3 & 5));
            this.aau.setBounds(126 & 31, 31682 & 1213, 6011 & 27086, 26110 & 6807);
         }

         this.aau.setVisible(var1);
      }
   }

   public void d() {
      if (this.aau == null) {
         this.r((boolean)(5 >> 2));
      } else {
         this.r((boolean)(this.aau.isVisible() ? 2 & 5 : 1));
      }
   }

   public void z(long var1, JTextField var3) {
      if (this.br == --2 && this.dm == 0) {
         this.ge = new BigDecimal(6000L * var1);
         Class681.j(this.ka, this.ge.longValue());
      }

   }

   public int ov() {
      return this.dm;
   }

   public void bk(BigDecimal var1) {
      if (this.aau != null) {
         RoleData var5 = this.vd();
         Object var3 = new ArrayList();

         int var4;
         for(int var10000 = var4 = 3 ^ 3; var10000 < var5.pets.size(); var10000 = var4) {
            RoleSummoning var2 = ((RolePet)var5.pets.get(var4)).getPet();
            String var6;
            if ((var1 == null || var2.getSid().compareTo(var1) == 0) && (var6 = var2.getStye()) != null && var6.length() > --1) {
               String[] var7 = var6.split("\\|");
               var3 = this.qu((List)var3, var7);
            }

            ++var4;
         }

         this.aau.qb.aiz().i(3 & 4);
         this.aau.qb.ck((List)var3);
      }
   }

   public void fr(Class44 var1) {
      int var2;
      for(int var10000 = var2 = 3 ^ 3; var10000 < this.aay.length; var10000 = var2) {
         if (this.aay[var2].u() == var1) {
            this.aay[var2].c(3 & 4, (Object)null);
            if (this.br == --2 && this.dm == 0) {
               this.aax.d();
            }

            return;
         }

         ++var2;
      }

   }

   public boolean bl() {
      RoleData var5 = this.vd();
      Goodstable var6;
      if ((var6 = (Goodstable)this.aay[5 >> 3].u().hr()) != null) {
         var6 = var5.getGood(var6.getRgid());
      }

      int var10000;
      if (var6 == null) {
         var10000 = 3 >> 2;
         this.aej.f("请选择召唤兽装备");
         return (boolean)var10000;
      } else if (this.ge != null && var5.getLoginResult().getGold().compareTo(this.ge) < 0) {
         var10000 = 5 >> 3;
         this.aej.f("大话币不足" + this.ge.longValue() / 10000L + "万");
         return (boolean)var10000;
      } else {
         String[] var4 = var6.getValue().split("\\|");
         SuitOperBean var3 = new SuitOperBean();
         Goodstable var1;
         String var11;
         if (this.br == 0 && this.dm == 0) {
            if ((var1 = (Goodstable)this.aay[5 >> 2].u().hr()) != null) {
               var1 = var5.getGood(var1.getRgid());
            }

            if (var1 == null) {
               var10000 = 5 >> 3;
               this.aej.f("没有选中玄铁晶石");
               return (boolean)var10000;
            }

            if (Integer.parseInt(MsgUntil.getValuesMessage(var4, "通灵")) >= (6140 & 32627)) {
               var10000 = 3 & 4;
               this.aej.fw("该装备的通灵值已经抵达上限，无法在培养");
               return (boolean)var10000;
            }

            var3.setType(57 & 111);
            ArrayList var14;
            (var14 = new ArrayList()).add(var6.getRgid());
            var14.add(var1.getRgid());
            int var10004 = --1;
            var3.setGoods(var14);
            var1.ab(var10004);
            if (var1.getUsetime() <= 0) {
               var5.h(var1.getRgid());
               this.aay[--1].c(3 & 4, (Object)null);
            }
         } else {
            ArrayList var13;
            if (this.br == 0 && this.dm == --1) {
               var3.setType(111 & 58);
               (var13 = new ArrayList()).add(var6.getRgid());
               int var10003 = 5 >> 2;
               var3.setGoods(var13);
               var6.ab(var10003);
               if (var6.getUsetime() <= 0) {
                  var5.h(var6.getRgid());
                  this.aay[3 >> 2].c(3 & 4, (Object)null);
               }
            } else {
               int var12;
               if (this.br == 5 >> 2 && this.dm == 0) {
                  var3.setType(127 & 43);
                  (var13 = new ArrayList()).add(var6.getRgid());
                  int var10001 = 3 >> 1;
                  var3.setGoods(var13);
                  var12 = var10001;

                  Goodstable var7;
                  for(var10000 = var12; var10000 < this.aay.length; var10000 = var12) {
                     if ((var7 = (Goodstable)this.aay[var12].u().hr()) != null) {
                        var7 = var5.getGood(var7.getRgid());
                     }

                     if (var7 == null) {
                        if (var12 == --1) {
                           this.aej.f("请放入玄铁晶石");
                        } else if (var12 == 5 >> 1) {
                           this.aej.f("请放入内丹精华");
                        } else {
                           this.aej.f("请放入九彩云龙珠");
                        }

                        return false;
                     }

                     int var8 = 1;

                     Iterator var15;
                     for(Iterator var16 = var15 = var13.iterator(); var16.hasNext(); var16 = var15) {
                        if (((BigDecimal)var15.next()).compareTo(var7.getRgid()) == 0) {
                           ++var8;
                        }
                     }

                     if (var8 > var7.getUsetime()) {
                        var10000 = 5 >> 3;
                        this.aej.fw(var7.getGoodsname() + "数量不足");
                        return (boolean)var10000;
                     }

                     ++var12;
                     var13.add(var7.getRgid());
                  }

                  for(var10000 = var12 = 5 >> 2; var10000 < var13.size(); var10000 = var12) {
                     Goodstable var17 = var7 = var5.getGood((BigDecimal)var13.get(var12));
                     var17.ab(--1);
                     if (var17.getUsetime() <= 0) {
                        var5.h(var7.getRgid());
                        this.aay[var12].c(5 >> 3, (Object)null);
                     }

                     ++var12;
                  }
               } else {
                  ArrayList var2;
                  if (this.br == 1 && this.dm == 1) {
                     if ((var1 = (Goodstable)this.aay[1].u().hr()) != null) {
                        var1 = var5.getGood(var1.getRgid());
                     }

                     if (var1 == null) {
                        this.aej.f("没有选中隐月神石");
                        return false;
                     }

                     if (MsgUntil.getValuesMessage(var4, "觉醒技") == null) {
                        this.aej.fw("该装备没有觉醒技");
                        return false;
                     }

                     var3.setType(124 & 47);
                     (var2 = new ArrayList()).add(var6.getRgid());
                     var2.add(var1.getRgid());
                     var3.setGoods(var2);
                     var1.ab(1);
                     if (var1.getUsetime() <= 0) {
                        var5.h(var1.getRgid());
                        this.aay[1].c(0, (Object)null);
                     }
                  } else if (this.br == 5 >> 1 && this.dm == 0) {
                     if ((var11 = MsgUntil.getValuesMessage(var4, "觉醒技")) == null) {
                        this.aej.fw("该装备没有觉醒技");
                        return false;
                     }

                     if ((var12 = (int)this.aat.gl()) <= 0) {
                        this.aej.fw("请输入消耗比斗奖章数量");
                        return false;
                     }

                     if ((long)var12 > var5.getLoginResult().getScoretype("比斗奖章").longValue()) {
                        this.aej.fw("比斗奖章数量不足");
                        return false;
                     }

                     if (ExpUtil.d(Long.parseLong(var11.split("&")[--3])) >= 20L) {
                        this.aej.f("等级已经达到最大值");
                        return false;
                     }

                     var3.setType(62 & 111);
                     var3.setJade(new PartJade((long)var12, 0));
                     ArrayList var10;
                     (var10 = new ArrayList()).add(var6.getRgid());
                     var3.setGoods(var10);
                  } else {
                     if (this.br != (1 ^ 3) || this.dm != 1) {
                        return false;
                     }

                     if (MsgUntil.getValuesMessage(var4, "觉醒技") != null) {
                        this.aej.fw("该装备已有觉醒技");
                        return false;
                     }

                     if ((var1 = (Goodstable)this.aay[1].u().hr()) != null) {
                        var1 = var5.getGood(var1.getRgid());
                     }

                     if (var1 == null) {
                        this.aej.f("没有选中千年魂石");
                        return false;
                     }

                     var3.setType(47 & 125);
                     (var2 = new ArrayList()).add(var6.getRgid());
                     var2.add(var1.getRgid());
                     var3.setGoods(var2);
                     var1.ab(1);
                     if (var1.getUsetime() <= 0) {
                        var5.h(var1.getRgid());
                        this.aay[1].c(0, (Object)null);
                     }
                  }
               }
            }
         }

         var11 = Agreement.getSendTextAES("suitoperate", Class695.b().toJson(var3));
         this.uw().d(var11);
         return true;
      }
   }

   public void ax(Goodstable var1) {
      if (GoodType.ac(var1.getType())) {
         this.aay[3 & 4].c(3 >> 1, var1);
         if (this.br == (1 ^ 3) && this.dm == 0) {
            this.aax.d();
            return;
         }
      } else if (this.br == 0 && this.dm == 0) {
         if (var1.getType() == 513L) {
            this.aay[5 >> 2].c(--1, var1);
            return;
         }
      } else if (this.br == (2 ^ 3) && this.dm == 0) {
         if (var1.getType() == 513L) {
            this.aay[--1].c(3 >> 1, var1);
            return;
         }

         if (var1.getType() == 497L) {
            this.aay[1 ^ 3].c(4 ^ 5, var1);
            return;
         }

         if (var1.getType() == 498L) {
            this.aay[--3].c(--1, var1);
            this.aay[--4].c(5 >> 2, var1);
            this.aay[--5].c(2 ^ 3, var1);
            return;
         }
      } else if (this.br == 5 >> 2 && this.dm == (2 ^ 3)) {
         if (var1.getType() == 515L) {
            this.aay[4 ^ 5].c(--1, var1);
            return;
         }
      } else if (this.br == 5 >> 1 && this.dm == --1 && var1.getType() == 514L) {
         this.aay[--1].c(3 & 5, var1);
      }

   }

   public int e() {
      return this.br;
   }
}
