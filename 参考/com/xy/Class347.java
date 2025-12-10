package com.xy;

import com.xy.bean.ConfirmBean;
import com.xy.bean.SuitOperBean;
import com.xy.entity.PartJade;
import com.xy.formula.GoodType;
import com.xy.formula.MsgUntil;
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
import java.util.Iterator;
import java.util.List;
import javax.swing.JLabel;

public class Class347 extends Class345 {
   private BigDecimal ajc;
   private Class357 ajd;
   private MoneyType ca;
   private static Image kx = Class511.a("sc/d/18.png");
   private Class245 ga;
   private Class529[] ma;
   private <undefinedtype> aje;
   private Class529 ui;
   private Class529 hy;
   private int ay;
   private Class436[] be;
   private JLabel[] ad;
   private Class556 ys;
   private Class44[] ff;

   public Class347(GameView var1) {
      super(119 & 93, 1 ^ 3, Class345.aef, var1);
      this.ajc = new BigDecimal(this.uw().gameType == (1 ^ 3) ? "500000" : "5000000");
      int var10001 = --3;
      this.va(-4 >> 2, 3 >> 2, 18942 & 14207, 28095 & 5117, Class345.aeo);
      this.uv(Class511.q("sc/d/1.png", 93 & 102, 93 & 102, 93 & 102, 93 & 102, (boolean)(5 >> 3)), " 宝石 ");
      Class529[] var4 = new Class529[var10001];
      boolean var10003 = true;
      this.ma = var4;

      int var2;
      int var10000;
      for(var10000 = var2 = 5 >> 3; var10000 < this.ma.length; var10000 = var2) {
         Class529[] var3 = this.ma;
         Class529 var10002 = new Class529;
         int var10005 = 1 ^ 3;
         int var10006 = (28311 & 4607) + var2;
         Font var10007 = Class681.cw;
         String var10009;
         Class347 var10010;
         if (var2 == 0) {
            var10009 = "合成";
            var10010 = this;
         } else if (var2 == 3 >> 1) {
            var10009 = "重铸";
            var10010 = this;
         } else if (var2 == --2) {
            var10009 = "鉴定";
            var10010 = this;
         } else {
            var10009 = "";
            var10010 = this;
         }

         var10002.<init>("sc/e/39.png", var10005, var10006, var10007, (Color[])null, var10009, var10010);
         var3[var2] = var10002;
         this.ma[var2].setOffsetTexts(Class681.cl);
         this.ma[var2].setBounds((55 & 124) + (123 & 69) * var2, 22 & 127, 127 & 63, 62 & 89);
         this.add(this.ma[var2++]);
      }

      var10001 = --5;
      this.ui = new Class529("sc/e/7.png", 5 >> 2, 20979 & 11949, Class681.ak, Class681.c, "合成", this);
      this.add(this.ui);
      this.hy = new Class529("sc/e/28.png", 3 >> 1, 5566 & 27363, Class681.bm, (Color[])null, "重选类型", this);
      this.hy.setBounds(2277 & 30655, 16367 & 16574, 84 & 111, 62 & 83);
      this.add(this.hy);
      JLabel[] var6 = new JLabel[var10001];
      var10003 = true;
      this.ad = var6;

      Class347 var5;
      for(var10000 = var2 = 3 & 4; var10000 < this.ad.length; var10000 = var2) {
         this.ad[var2] = Class133.c(157, 62, 80, 14, 3 ^ 3, Color.white, Class681.ab);
         if (var2 == --2) {
            var5 = this;
            this.ad[var2].setText("+");
            this.ad[var2].setFont(Class681.cd);
            this.ad[var2].setForeground(Class681.c("#cFFE981"));
         } else if (var2 == --3) {
            var5 = this;
            this.ad[var2].setText("消耗金钱");
            this.ad[var2].setBounds(98, 227, 72, 19);
         } else {
            if (var2 == --4) {
               this.ad[var2].setText("拥有金钱");
               this.ad[var2].setBounds(98, 250, 72, 19);
            }

            var5 = this;
         }

         var5.add(this.ad[var2++]);
      }

      var10001 = --3;
      this.ca = new MoneyType();
      this.ca.setIdAndKey(3 >> 1, "金钱");
      this.ga = Class133.a(168, 227, 119, 19, 10, Color.white, Class681.q);
      this.ys = Class133.i(10, Color.white, Class681.q, this.ca, var1);
      this.ys.setBounds(168, 250, 119, 19);
      this.ys.ab(--2);
      this.ga.eq(Class511.q("sc/d/17.png", 6, 6, 6, 6, (boolean)(5 >> 3)));
      this.ys.eq(Class511.q("sc/d/17.png", 6, 6, 6, 6, (boolean)(3 & 4)));
      this.add(this.ga);
      this.add(this.ys);
      Class681.j(this.ga, this.ajc.longValue());
      Class44[] var8 = new Class44[var10001];
      var10003 = true;
      this.ff = var8;

      for(var10000 = var2 = 2 & 5; var10000 < this.ff.length; var10000 = var2) {
         this.ff[var2] = new Class44(this);
         this.ff[var2].ad(Class44.aqy);
         this.ff[var2].fw("sc/d/4.png");
         this.add(this.ff[var2++]);
      }

      Class436[] var9 = new Class436[5 >> 1];
      var10003 = true;
      this.be = var9;

      for(var10000 = var2 = 3 & 4; var10000 < this.be.length; var10000 = var2) {
         this.be[var2] = new Class436();
         if (var2 == 0) {
            var5 = this;
            this.be[var2].eq(Class511.q("sc/d/19.png", --5, --5, --5, --5, (boolean)(5 >> 3)));
            this.be[var2].setBounds(47, 305, 309, 105);
         } else {
            if (var2 == (2 ^ 3)) {
               this.be[var2].eq(Class511.q("sc/d/49.png", --5, --5, --5, --5, (boolean)(3 & 4)));
               this.be[var2].setBounds(46, 46, 310, 260);
            }

            var5 = this;
         }

         var5.add(this.be[var2++]);
      }

      this.ajd = new Class357(this, 6, 5 >> 1, 51, 51, 2 & 5, 2 & 5, 48, 307);
      this.ajd.hf(Class511.a("sc/d/18.png"));
      long[] var10 = new long[10];
      boolean var11 = true;
      var10[3 ^ 3] = 746L;
      var10[4 ^ 5] = 749L;
      var10[2] = 752L;
      var10[3] = 755L;
      var10[4] = 758L;
      var10[5] = 761L;
      var10[6] = 764L;
      var10[7] = 767L;
      var10[8] = 770L;
      var10[9] = 744L;
      this.ajd.ud(var10);
      this.add(this.ajd);
   }


   private void gt(boolean var1) {
      if (this.aje != null || var1) {
         if (var1) {
            if (this.aje == null) {
               this.add(this.aje = new MouseListener() {
                  private Class436 r;
                  private Class436 av;
                  private <undefinedtype>[] adk;

                  public void mouseExited(MouseEvent var1) {
                  }

                  public void mouseReleased(MouseEvent var1) {
                  }

                  public {
                     int var10001 = 107 & 28;
                     this.av = new Class436(Class511.q("sc/d/19.png", --5, --5, --5, --5, (boolean)(3 >> 2)));
                     this.av.setBounds(59 & 77, 59 & 77, 27086 & 5887, 106 & 125);
                     this.add(this.av);
                     <undefinedtype>[] var3 = new <undefinedtype>[var10001];
                     boolean var10003 = true;
                     this.adk = var3;

                     int var2;
                     for(int var10000 = var2 = 5 >> 3; var10000 < this.adk.length; var10000 = var2) {
                        this.adk[var2] = new MouseListener(var2) {
                           // $FF: synthetic field
                           final Class347 wc;
                           private int cy;
                           private Image rv;

                           public void mouseEntered(MouseEvent var1) {
                           }

                           public void mousePressed(MouseEvent var1) {
                           }

                           protected void paintComponent(Graphics var1) {
                              super.paintComponent(var1);
                              var1.drawImage(Class347.ga(), 2 & 5, 2 & 5, this.getWidth(), this.getHeight(), (ImageObserver)null);
                              var1.drawImage(this.rv, --1, --1, this.getWidth() - (1 ^ 3), this.getHeight() - --2, (ImageObserver)null);
                           }

                           public {
                              this.wc = var1;
                              this.cy = var2;
                              this.rv = Class222.i(String.valueOf((23294 & 10219) + var2 * --3));
                              this.addMouseListener(this);
                           }

                           public void mouseExited(MouseEvent var1) {
                           }

                           public void mouseClicked(MouseEvent var1) {
                              Class347.zp(this.wc)[1 ^ 3].c(62 & 81, (6894 & 26619) + this.cy * --3);
                              Class347.zq(this.wc, (boolean)(3 >> 2));
                           }

                           public void mouseReleased(MouseEvent var1) {
                           }
                        };
                        this.adk[var2].setBounds((74 & 63) + var2 % --4 * (119 & 59), (74 & 63) + var2 / --4 * (123 & 55), 123 & 55, 123 & 55);
                        this.add(this.adk[var2++]);
                     }

                     this.r = new Class436(Class511.q("sc/d/36.png", 116 & 31, 116 & 31, 116 & 31, 116 & 31, (boolean)(3 & 4)));
                     this.r.setBounds(5 >> 3, 5 >> 3, 29667 & 3324, 127 & 122);
                     this.add(this.r);
                     this.addMouseListener(this);
                  }

                  public void mousePressed(MouseEvent var1) {
                  }

                  public void mouseClicked(MouseEvent var1) {
                  }

                  public void mouseEntered(MouseEvent var1) {
                  }
               }, 2 & 5);
            }

            this.aje.setBounds(95 & 119, 18942 & 13959, 11256 & 21735, 122 & 127);
         }

         this.aje.setVisible(var1);
      }
   }

   public void s() {
      if (this.aje == null) {
         this.gt((boolean)(5 >> 2));
      } else {
         this.gt((boolean)(this.aje.isVisible() ? 2 & 5 : 1));
      }
   }

   public void lo(Goodstable var1) {
      int var4 = var1.getType() == 744L ? 2 ^ 3 : MsgUntil.getGoodLvl(var1.getValue());
      Goodstable var3 = (Goodstable)this.ff[2 & 5].hr();
      Goodstable var2 = (Goodstable)this.ff[3 & 5].hr();
      if (var3 != null) {
         var3 = this.vd().getGood(var3.getRgid());
      }

      if (var2 != null) {
         var2 = this.vd().getGood(var2.getRgid());
      }

      if (var3 != null && var1.getRgid().compareTo(var3.getRgid()) == 0 || var2 != null && var1.getRgid().compareTo(var2.getRgid()) == 0) {
         this.aej.fw("该宝石已被选中");
      } else {
         int var5;
         if (!GoodType.ab(var1.getType()) && var1.getType() != 744L) {
            if (var1.getType() == 770L) {
               if (var2 != null) {
                  var5 = var2.getType() != 744L ? MsgUntil.getGoodLvl(var2.getValue()) : 1;
                  if (var4 - --3 != var5 && (this.uw().gameType != --2 || var4 != var5)) {
                     if (this.uw().gameType == --2) {
                        this.aej.f("材料宝石使用比奇异石小3级进行普通鉴定,使用同等级宝石进行高品质鉴定");
                        return;
                     }

                     this.aej.f("材料宝石使用比奇异石小3级进行普通鉴定");
                     return;
                  }
               }

               this.ff[3 >> 2].c(--1, var1);
            }

         } else {
            if (var3 != null) {
               var5 = MsgUntil.getGoodLvl(var3.getValue());
               if (var4 + --3 != var5 && (this.uw().gameType != (1 ^ 3) || var4 != var5)) {
                  if (this.uw().gameType == --2) {
                     this.aej.f("宝石要比奇异石小3级进行普通鉴定,使用同等级宝石进行高品质鉴定");
                     return;
                  }

                  this.aej.f("宝石要比奇异石小3级");
                  return;
               }
            }

            this.ff[3 >> 1].c(3 >> 1, var1);
         }
      }
   }


   static Class44[] zp(Class347 var0) {
      return var0.ff;
   }


   static void zq(Class347 var0, boolean var1) {
      var0.gt(var1);
   }

   public void ly(Goodstable var1) {
      if (this.ay == 0) {
         if (GoodType.ab(var1.getType()) || var1.getType() == 744L) {
            this.av(var1);
         }
      } else if (this.ay == (2 ^ 3)) {
         if (GoodType.ab(var1.getType()) || var1.getType() == 744L) {
            this.ax(var1);
         }
      } else {
         if (this.ay == --2) {
            this.lo(var1);
         }

      }
   }

   public void fr(Class44 var1) {
      int var10002 = 4 ^ 5;
      var1.c(5 >> 3, (Object)null);
      var1.setVisible((boolean)var10002);
      this.d();
   }

   public void y(int var1) {
      int var10000 = 2 & 5;
      this.ay = var1;

      for(var1 = var10000; var10000 < this.ma.length; var10000 = var1) {
         this.ma[var1].setKeep((boolean)(var1 == this.ay ? 3 >> 1 : 0));
         ++var1;
      }

      int var10002 = 3 & 4;
      var10000 = 3 & 4;
      this.gt((boolean)var10002);

      for(var1 = var10002; var10000 < this.ff.length; var10000 = var1) {
         this.ff[var1].c(5 >> 3, (Object)null);
         this.ff[var1++].setVisible((boolean)(3 >> 1));
      }

      this.hy.setVisible((boolean)(3 & 4));
      this.ad[--3].setVisible((boolean)(3 ^ 3));
      this.ad[--4].setVisible((boolean)(3 ^ 3));
      this.ga.setVisible((boolean)(2 & 5));
      this.ys.setVisible((boolean)(3 ^ 3));
      if (this.ay == 0) {
         this.ad[3 >> 2].setText("同等级宝石×2");
         this.ad[3 >> 1].setText("几率获得");
         this.ad[3 ^ 3].setBounds(16563 & 16351, 127 & 62, 117 & 110, 63 & 78);
         this.ad[3 >> 2].setForeground(Class681.c("#c999999"));
         this.ad[5 >> 2].setBounds(9150 & 23775, 25309 & 7598, 87 & 120, 111 & 30);
         this.ad[4 ^ 5].setForeground(Class681.c("#cFFE981"));
         this.ad[5 >> 1].setBounds(1722 & 31231, 110 & 117, 95 & 52, 95 & 52);
         this.ui.setText("合成");
         this.ui.setBounds(4092 & 28843, 16786 & 16255, 127 & 59, 91 & 61);
         this.ff[3 >> 2].setBounds(14816 & 18079, 81, 59, 57);
         this.ff[4 ^ 5].setBounds(207, 81, 59, 57);
         this.ff[--2].setBounds(168, 156, 59, 57);
         this.ad[--3].setVisible((boolean)(4 ^ 5));
         this.ad[--4].setVisible((boolean)(3 >> 1));
         this.ga.setVisible(true);
         this.ys.setVisible(true);
         this.ys.cc();
      } else if (this.ay == 1) {
         this.ad[0].setText("主宝石");
         this.ad[1].setText("材料宝石");
         this.ad[0].setBounds(107, 85, 99, 14);
         this.ad[0].setForeground(Class681.c("#c999999"));
         this.ad[1].setBounds(190, 85, 99, 14);
         this.ad[1].setForeground(Class681.c("#c999999"));
         this.ad[5 >> 1].setBounds(188, 121, 20, 20);
         this.ff[0].setBounds(127, 102, 59, 57);
         this.ff[1].setBounds(210, 102, 59, 57);
         this.ff[--2].setBounds(170, 191, 59, 57);
         this.ui.setText("重铸");
         this.ui.setBounds(171, 264, 59, 25);
         this.hy.setBtn(-4 >> 2, "sc/e/57.png");
         this.hy.setVisible(true);
      } else {
         if (this.ay == --2) {
            this.ad[0].setText("奇异石");
            this.ad[1].setText("材料宝石");
            this.ad[0].setBounds(107, 85, 99, 14);
            this.ad[0].setForeground(Class681.c("#c999999"));
            this.ad[1].setBounds(190, 85, 99, 14);
            this.ad[1].setForeground(Class681.c("#c999999"));
            this.ad[1 ^ 3].setBounds(188, 121, 20, 20);
            this.ff[0].setBounds(127, 102, 59, 57);
            this.ff[1].setBounds(210, 102, 59, 57);
            this.ff[5 >> 1].setBounds(170, 191, 59, 57);
            this.ui.setText("鉴定");
            this.ui.setBounds(171, 264, 59, 25);
         }

      }
   }

   public void av(Goodstable var1) {
      int var4 = var1.getType() != 744L ? MsgUntil.getGoodLvl(var1.getValue()) : 1;
      if (var4 >= (79 & 58)) {
         this.aej.fw("宝石最高等级10级");
      } else {
         Goodstable var3 = (Goodstable)this.ff[2 & 5].hr();
         Goodstable var2 = (Goodstable)this.ff[2 ^ 3].hr();
         if (var3 != null) {
            var3 = this.vd().getGood(var3.getRgid());
         }

         if (var2 != null) {
            var2 = this.vd().getGood(var2.getRgid());
         }

         if (var1.getType() != 744L && (var3 != null && var1.getRgid().compareTo(var3.getRgid()) == 0 || var2 != null && var1.getRgid().compareTo(var2.getRgid()) == 0)) {
            this.aej.fw("该宝石已被选中");
         } else if (var2 == null && var3 == null) {
            this.ff[2 & 5].c(5 >> 2, var1);
         } else {
            int var5 = var3 != null ? var3.getType() : var2.getType() != 744L ? MsgUntil.getGoodLvl(var3 != null ? var3.getValue() : var2.getValue()) : 1;
            if (var4 != var5) {
               this.aej.fw("宝石等级不相同");
            } else {
               this.ff[var2 != null ? 3 & 4 : 1].c(--1, var1);
            }
         }
      }
   }

   public int e() {
      return this.ay;
   }

   public void ax(Goodstable var1) {
      Goodstable var2 = (Goodstable)this.ff[2 & 5].hr();
      Goodstable var3 = (Goodstable)this.ff[3 >> 1].hr();
      if (var2 != null) {
         var2 = this.vd().getGood(var2.getRgid());
      }

      if (var3 != null) {
         var3 = this.vd().getGood(var3.getRgid());
      }

      if (var1.getType() == 744L || (var2 == null || var1.getRgid().compareTo(var2.getRgid()) != 0) && (var3 == null || var1.getRgid().compareTo(var3.getRgid()) != 0)) {
         int var4 = var1.getType() != 744L ? MsgUntil.getGoodLvl(var1.getValue()) : 1;
         if (var4 <= --4 && var2 == null) {
            this.aej.fw("主宝石最少5级");
         } else if (var3 == null && var2 == null) {
            this.ff[5 >> 3].c(--1, var1);
            this.d();
         } else {
            int var5 = var3 != null ? var3.getType() : var2.getType() != 744L ? MsgUntil.getGoodLvl(var3 != null ? var3.getValue() : var2.getValue()) : 1;
            int var10000;
            if (var3 != null) {
               var4 -= 4;
               var10000 = var4;
            } else {
               var4 += 4;
               var10000 = var4;
            }

            if (var10000 != var5) {
               this.aej.fw("用小4级的宝石重铸");
            } else {
               this.ff[var3 != null ? 3 >> 2 : 1].c(--1, var1);
               this.d();
            }
         }
      } else {
         this.aej.fw("该宝石已被选中");
      }
   }

   public void d() {
      if (this.ay == 5 >> 2) {
         Goodstable var1 = (Goodstable)this.ff[3 >> 2].hr();
         Goodstable var2 = (Goodstable)this.ff[4 ^ 5].hr();
         if (var1 != null) {
            var1 = this.vd().getGood(var1.getRgid());
         }

         if (var2 != null) {
            var2 = this.vd().getGood(var2.getRgid());
         }

         if (var1 == null || var2 == null) {
            this.hy.setBtn(-4 >> 2, "sc/e/57.png");
            if (this.ff[5 >> 1].tp() != 0) {
               this.ff[--2].c(3 >> 2, (Object)null);
               this.ff[5 >> 1].setVisible((boolean)(3 & 5));
            }

            this.gt((boolean)(5 >> 3));
            return;
         }

         this.hy.setBtn(4 ^ 5, "sc/e/28.png");
         if (this.ff[--2].tp() == 0) {
            this.ff[--2].c(81 & 62, var1.getType().intValue());
         }
      }

   }

   public void q() {
      this.y(3 & 4);
      super.q();
   }

   public void r(boolean var1) {
      RoleData var7 = this.vd();
      SuitOperBean var6 = new SuitOperBean();
      var6.setGoods(new ArrayList());
      BigDecimal var4 = null;
      int var5 = this.ay == 0 ? 21 & 123 : (this.ay == (3 & 5) ? 119 & 26 : 19);
      Goodstable var2;
      int var8;
      RoleData var15;
      if (var5 == (119 & 25) && this.uw().gameType == --2) {
         var4 = new BigDecimal("500000");
         var15 = var7;
      } else {
         if (var5 == (123 & 23) && this.uw().gameType == --2) {
            var4 = new BigDecimal("5000000");
            Goodstable var3 = (Goodstable)this.ff[5 >> 3].hr();
            var2 = (Goodstable)this.ff[4 ^ 5].hr();
            if (var3 != null) {
               var3 = this.vd().getGood(var3.getRgid());
            }

            if (var2 != null) {
               var2 = this.vd().getGood(var2.getRgid());
            }

            if (var3 == null || var2 == null) {
               this.aej.f("请凑齐物品再来");
               return;
            }

            var8 = MsgUntil.getGoodLvl(var3.getValue());
            int var9 = MsgUntil.getGoodLvl(var2.getValue());
            if (var8 == var9) {
               boolean var10000 = this.uw().n(5 >> 1, 31 & 108);
               BigDecimal var10002 = new BigDecimal;
               if (var10000) {
                  var10002.<init>(100000L * (long)var8 * (long)var8 * (long)var8);
                  var4 = var10002;
                  var10000 = var1;
               } else {
                  var10002.<init>(10000000L * (long)var8 * (long)var8 * (long)var8);
                  var4 = var10002;
                  var10000 = var1;
               }

               if (!var10000) {
                  StringBuffer var10 = new StringBuffer();
                  var10.append("#W你是否要消耗#R");
                  StringBuffer var16;
                  if (var4.longValue() >= 100000000L) {
                     var10.append(var4.longValue() / 100000000L);
                     var10.append("亿");
                     var16 = var10;
                  } else {
                     var10.append(var4.longValue() / 10000L);
                     var10.append("万");
                     var16 = var10;
                  }

                  var16.append("#W大话币进行高品质鉴定");
                  this.aej.aal(new ConfirmBean(19 & 126, (String)null, var10.toString()));
                  return;
               }
            }
         } else {
            var4 = new BigDecimal("5000000");
         }

         var15 = var7;
      }

      if (var15.getLoginResult().getGold().compareTo(var4) < 0) {
         this.aej.f("金额不足");
      } else {
         int var11;
         int var18;
         for(var18 = var11 = 0; var18 < 2; var18 = var11) {
            if ((var2 = (Goodstable)this.ff[var11].hr()) != null) {
               var2 = var7.getGoodPacK(var2.getRgid());
            }

            if (var2 == null) {
               this.aej.f("请凑齐物品再来");
               return;
            }

            if (var2.getGoodlock() == (3 & 5)) {
               this.aej.f("该物品已被加锁");
               return;
            }

            var8 = 1;

            Iterator var14;
            for(Iterator var19 = var14 = var6.getGoods().iterator(); var19.hasNext(); var19 = var14) {
               if (((BigDecimal)var14.next()).compareTo(var2.getRgid()) == 0) {
                  ++var8;
               }
            }

            if (var8 > var2.getUsetime()) {
               this.aej.fw(var2.getGoodsname() + "数量不足");
               return;
            }

            List var20 = var6.getGoods();
            ++var11;
            var20.add(var2.getRgid());
         }

         var6.setType(var5);
         if (var5 == (94 & 51)) {
            if ((var11 = (int)this.ff[5 >> 1].gl()) == 0) {
               var11 = 5118 & 28395;
            }

            var6.setJade(new PartJade((long)var11, 2 & 5));
         }

         if (var7.getGoodPackSum(-1L, new BigDecimal(-4 >> 2), 5 >> 2) <= 0) {
            this.aej.fw("背包空间不足");
         } else {
            String var13 = Agreement.getSendTextAES("suitoperate", Class695.b().toJson(var6));
            var18 = 5 >> 3;
            int var17 = 5 >> 3;
            this.uw().d(var13);
            this.gt((boolean)var17);

            for(int var12 = var18; var18 < 2; var18 = var12) {
               this.ff[var12].c(3 >> 2, (Object)null);
               this.ff[var12++].setVisible((boolean)(3 & 5));
            }

         }
      }
   }


   static Image ga() {
      return kx;
   }
}
