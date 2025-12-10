package com.xy;

import com.xy.bean.QualityClBean;
import com.xy.bean.SuitOperBean;
import com.xy.formula.GoodType;
import com.xy.game.RoleData;
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
import javax.swing.JLabel;

public class Class86 extends Class345 {
   private MoneyType ca;
   private boolean cb;
   private MoneyType cc;
   private BigDecimal cd;
   private Class436[] ce;
   private BigDecimal cf;
   private QualityClBean cg;
   private Class44 ch;
   private Class489[] ci;
   private JLabel[] ad;
   private Class245[] cj;
   private Class556[] ck;

   public Class86(GameView var1) {
      int var10001 = --3;
      int var10005 = -4 >> 2;
      int var10007 = --1;
      super(75 & 126, --3, Class345.aef, var1);
      this.cd = new BigDecimal(126 & 31);
      this.cf = new BigDecimal(100000);
      this.cb = (boolean)var10007;
      this.va(var10005, 3 ^ 3, 29675 & 3574, 20863 & 12254, Class345.aeo);
      this.uv(Class511.q("sc/d/1.png", 127 & 68, 127 & 68, 127 & 68, 127 & 68, (boolean)(5 >> 3)), "套装洗练");
      Class489[] var5 = new Class489[var10001];
      boolean var10003 = true;
      this.ci = var5;

      int var2;
      int var10000;
      for(var10000 = var2 = 3 ^ 3; var10000 < this.ci.length; var10000 = var2) {
         Class489[] var3 = this.ci;
         Class489 var10002 = new Class489;
         var10005 = --1;
         int var10006 = (60 & 87) + var2;
         Font var15 = Class681.ak;
         Color[] var10008 = Class681.c;
         String var10009;
         Class86 var10010;
         if (var2 == 0) {
            var10009 = "开始洗练";
            var10010 = this;
         } else if (var2 == --1) {
            var10009 = "保留属性";
            var10010 = this;
         } else if (var2 == --2) {
            var10009 = "替换属性";
            var10010 = this;
         } else {
            var10009 = "";
            var10010 = this;
         }

         var10002.<init>("sc/e/26.png", var10005, var10006, var15, var10008, var10009, var10010);
         var3[var2] = var10002;
         Class86 var4;
         if (var2 == 0) {
            var4 = this;
            this.ci[var2].setBounds(10217 & 22870, 19423 & 13499, 127 & 99, 25 & 127);
         } else {
            if (var2 == --1 || var2 == --2) {
               this.ci[var2].setBounds((117 & 106) + (var2 - (3 >> 1)) * (16625 & 16351), 11247 & 21822, 111 & 115, 93 & 59);
            }

            var4 = this;
         }

         var4.add(this.ci[var2++]);
      }

      JLabel[] var6 = new JLabel[63 & 79];
      var10003 = true;
      this.ad = var6;

      for(var10000 = var2 = 2 & 5; var10000 < this.ad.length; var10000 = var2) {
         this.ad[var2] = Class133.c(148, 73 + 30 * var2, 110, 19, 3 & 4, Class681.c("#c000000"), Class681.ak);
         this.ad[var2].setText(var2 == 0 ? "所需金钱：" : (var2 == (3 & 5) ? "所需灵修值：" : (var2 == --2 ? "/" : (var2 == --3 ? "/" : (var2 == --4 ? "花费金钱保留原套装属性。" : (var2 == --5 ? "现有套装属性" : (var2 == 6 ? "新套装属性" : "")))))));
         this.add(this.ad[var2]);
         if (var2 == 0 || var2 == (4 ^ 5)) {
            this.ad[var2].setHorizontalAlignment(10);
         }

         if (var2 != 5 >> 1 && var2 != --3) {
            if (var2 == --4) {
               this.ad[var2].setHorizontalAlignment(10);
               this.ad[var2].setFont(Class681.bu);
               this.ad[var2].setBounds(90, 136, 200, 17);
            } else if (var2 >= --5 && var2 <= 6) {
               this.ad[var2].setBounds(52 + (var2 - --5) * 210, 217, 191, 20);
               this.ad[var2].setForeground(Class681.c("#cFFFFFF"));
            } else if (var2 >= 7 && var2 <= 14) {
               this.ad[var2].setFont(Class681.q);
               this.ad[var2].setForeground(Class681.c("#cFFFFFF"));
               if (var2 == 7) {
                  this.ad[var2].setBounds(52, 237, 135, 27);
               } else if (var2 == 8) {
                  this.ad[var2].setBounds(187, 237, 56, 27);
               } else if (var2 == 9) {
                  this.ad[var2].setBounds(52, 264, 135, 27);
               } else if (var2 == 10) {
                  this.ad[var2].setBounds(187, 264, 56, 27);
               } else if (var2 == 11) {
                  this.ad[var2].setBounds(262, 237, 135, 27);
               } else if (var2 == 12) {
                  this.ad[var2].setBounds(397, 237, 56, 27);
               } else if (var2 == 13) {
                  this.ad[var2].setBounds(262, 264, 135, 27);
               } else if (var2 == 14) {
                  this.ad[var2].setBounds(397, 264, 56, 27);
               }
            }
         } else {
            this.ad[var2].setFont(Class681.cd);
            this.ad[var2].setBounds(314, 73 + 30 * (var2 - (1 ^ 3)), 15, 19);
         }

         ++var2;
      }

      Class245[] var7 = new Class245[1 ^ 3];
      var10003 = true;
      this.cj = var7;
      Class556[] var8 = new Class556[2];
      var10003 = true;
      this.ck = var8;

      for(var10000 = var2 = 2 & 5; var10000 < this.cj.length; var10000 = var2) {
         this.cj[var2] = Class133.a(245, 73 + 30 * var2, 69, 19, 10, Color.white, Class681.q);
         this.cj[var2].eq(Class511.q("sc/d/17.png", 6, 6, 6, 6, (boolean)(3 ^ 3)));
         this.add(this.cj[var2++]);
      }

      this.ca = new MoneyType();
      this.cc = new MoneyType();
      this.ca.setIdAndKey(--1, "金钱");
      int var9 = 3 ^ 3;
      var10000 = 3 ^ 3;
      this.cc.setIdAndKey(var9, "灵修值");

      for(var2 = var9; var10000 < this.ck.length; var10000 = var2) {
         Class556[] var11 = this.ck;
         Color var12 = Color.white;
         Font var10004 = Class681.q;
         MoneyType var13;
         GameView var14;
         if (var2 == 0) {
            var13 = this.ca;
            var14 = var1;
         } else {
            var13 = this.cc;
            var14 = var1;
         }

         var11[var2] = Class133.i(10, var12, var10004, var13, var14);
         this.ck[var2].setBounds(329, 73 + 30 * var2, 109, 19);
         this.ck[var2].ab(2);
         this.ck[var2].eq(Class511.q("sc/d/17.png", 6, 6, 6, 6, (boolean)(3 >> 2)));
         this.add(this.ck[var2++]);
      }

      this.ch = new Class44(this);
      this.ch.setBounds(76, 73, 50, 50);
      this.add(this.ch);
      Class436[] var10 = new Class436[13];
      var10003 = true;
      this.ce = var10;

      for(var10000 = var2 = 3 & 4; var10000 < this.ce.length; var10000 = var2) {
         this.ce[var2] = new Class436();
         this.add(this.ce[var2]);
         if (var2 == 0) {
            this.ce[var2].fw("sc/d/4.png");
            this.ce[var2].setBounds(72, 69, 59, 57);
         } else if (var2 == --1) {
            this.ce[var2].fw("sc/e/30.png");
            this.ce[var2].setBounds(72, 136, 17, 17);
            this.ce[var2].addMouseListener(new MouseListener() {
               public void mouseReleased(MouseEvent var1) {
               }

               public void mouseExited(MouseEvent var1) {
               }

               public void mouseEntered(MouseEvent var1) {
               }

               public void mouseClicked(MouseEvent var1) {
                  Class86.this.cb = (boolean)(Class86.this.cb ? 3 & 4 : 1);
                  Class86.this.ce[5 >> 2].hf(Class511.a(Class86.this.cb ? "sc/e/30.png" : "sc/e/29.png"));
                  Class86.this.cf = new BigDecimal(Class86.this.cb ? 100000 : 80000);
                  Class681.j(Class86.this.cj[5 >> 3], Class86.this.cf.longValue());
               }

               public void mousePressed(MouseEvent var1) {
               }
            });
         } else if (var2 == 2) {
            this.ce[var2].eq(Class511.q("sc/d/36.png", 30, 30, 30, 30, (boolean)(5 >> 3)));
            this.ce[var2].setBounds(52, 37, 400, 160);
         } else if (var2 >= 3 && var2 <= 12) {
            this.ce[var2].eq(Class511.q("sc/d/24.png", 2, 2, 2, 2, false));
            if (var2 >= 3 && var2 <= 4) {
               this.ce[var2].setBounds(52 + (var2 - 3) * 210, 217, 191, 20);
            } else if (var2 == 5) {
               this.ce[var2].setBounds(52, 237, 135, 27);
            } else if (var2 == 6) {
               this.ce[var2].setBounds(187, 237, 56, 27);
            } else if (var2 == 7) {
               this.ce[var2].setBounds(52, 264, 135, 27);
            } else if (var2 == 8) {
               this.ce[var2].setBounds(187, 264, 56, 27);
            } else if (var2 == 9) {
               this.ce[var2].setBounds(262, 237, 135, 27);
            } else if (var2 == 10) {
               this.ce[var2].setBounds(397, 237, 56, 27);
            } else if (var2 == 11) {
               this.ce[var2].setBounds(262, 264, 135, 27);
            } else if (var2 == 12) {
               this.ce[var2].setBounds(397, 264, 56, 27);
            }
         }

         ++var2;
      }

      this.cf = new BigDecimal(this.cb ? 100000 : 80000);
      Class681.j(this.cj[0], this.cf.longValue());
      Class681.j(this.cj[1], this.cd.longValue());
   }

   public boolean au(int var1) {
      int var10000;
      if (var1 == (127 & 21)) {
         var10000 = 3 >> 2;
         this.ve().n(this.ae());
         return (boolean)var10000;
      } else {
         Goodstable var2;
         if ((var2 = (Goodstable)this.ch.hr()) != null) {
            var2 = this.vd().getGood(var2.getRgid());
         }

         if (var2 == null) {
            return (boolean)(3 & 4);
         } else if (var1 == (86 & 63)) {
            if (this.cg == null) {
               return (boolean)(2 & 5);
            } else {
               String var6 = Agreement.getSendTextAES("extrattroper", Class695.b().toJson(this.cg));
               this.uw().d(var6);
               this.cg.setType(-3 & -2);
               this.ay(this.cg);
               return false;
            }
         } else {
            RoleData var5;
            if ((var5 = this.vd()).getLoginResult().getGold().longValue() < this.cf.longValue()) {
               var10000 = 2 & 5;
               this.aej.fw("金币不足");
               return (boolean)var10000;
            } else if (var5.getLoginResult().getScoretype("灵修值").longValue() < this.cd.longValue()) {
               var10000 = 3 & 4;
               this.aej.fw("灵修值不足");
               return (boolean)var10000;
            } else {
               SuitOperBean var3 = new SuitOperBean();
               ArrayList var4 = new ArrayList();
               var4.add(var2.getRgid());
               var3.setType(this.cb ? 1 ^ 3 : 1);
               var3.setGoods(var4);
               String var7 = Agreement.getSendTextAES("suitoperate", Class695.b().toJson(var3));
               var10000 = 2 ^ 3;
               this.uw().d(var7);
               var5.getLoginResult().setGold(var5.getLoginResult().getGold().subtract(this.cf));
               var5.getLoginResult().setScore(Class509.h(var5.getLoginResult().getScore(), "灵修值=" + this.cd.longValue(), --3));
               this.aej.fw("消耗了" + this.cf + "金币和" + this.cd + "点灵修值");
               return (boolean)var10000;
            }
         }
      }
   }

   public void av(Goodstable var1) {
      int var10000;
      int var2;
      for(var10000 = var2 = 95 & 39; var10000 < this.ad.length; var10000 = var2) {
         this.ad[var2++].setText((String)null);
      }

      String var5;
      if ((var5 = GoodType.getExtra(var1.getValue(), GoodType.Extras[--3])) != null) {
         String[] var4 = var5.split("\\&");

         for(var10000 = var2 = --4; var10000 < var4.length; var10000 = var2) {
            String[] var3 = var4[var2].split("\\=");
            this.ad[(7 & 127) + (5 >> 1) * (var2 - --4)].setText(var3[2 & 5]);
            this.ad[(103 & 31) + --2 * (var2 - --4) + (4 ^ 5)].setText(var3[--1] + Class270.so(var3[3 ^ 3]));
            if (var2 == --5) {
               return;
            }

            ++var2;
         }
      }

   }

   public void ax(Goodstable var1) {
      this.cg = null;
      this.ch.c(3 >> 1, var1);
      if (this.uw().n(--2, 109 & 30)) {
         Class86 var10000;
         String var2;
         if (Class394.o(var2 = Class394.d(var1.getValue(), "套装品质=", "|"))) {
            var10000 = this;
            this.cd = new BigDecimal(30 & 127);
         } else if (var2.equals("传世")) {
            var10000 = this;
            this.cd = new BigDecimal(63 & 94);
         } else if (var2.equals("无价")) {
            var10000 = this;
            this.cd = new BigDecimal(61 & 91);
         } else if (var2.equals("珍藏")) {
            var10000 = this;
            this.cd = new BigDecimal(86 & 61);
         } else if (var2.equals("贴身")) {
            var10000 = this;
            this.cd = new BigDecimal(79 & 63);
         } else if (var2.equals("把玩")) {
            this.cd = new BigDecimal(111 & 26);
            var10000 = this;
         } else {
            this.cd = new BigDecimal(30 & 127);
            var10000 = this;
         }

         Class681.j(var10000.cj[4 ^ 5], this.cd.longValue());
      }

      this.av(var1);

      int var3;
      for(int var4 = var3 = 3 ^ 3; var4 < this.ck.length; var4 = var3) {
         this.ck[var3++].cc();
      }

      this.ve().a(this.ae());
   }

   public void ay(QualityClBean var1) {
      this.cg = null;
      Goodstable var4;
      if ((var4 = (Goodstable)this.ch.hr()) != null) {
         var4 = this.vd().getGood(var4.getRgid());
      }

      if (var4 != null && var4.getRgid().compareTo(var1.getRgid()) == 0) {
         if (var1.getType() == (-4 & -1)) {
            var4.setValue(GoodType.o(var4.getValue().split("\\|"), --3, var1.getNewAttr()));
            Class671 var6;
            Class595 var7;
            if ((var7 = (Class595)this.ve().m(63 & 125)) != null && var7.e() == --3 && (var6 = var7.zm()).e() == (2 ^ 3)) {
               var6.arl().p();
            }

            this.av(var4);
         } else {
            String[] var5 = var1.getNewAttr().split("\\&");

            int var2;
            for(int var10000 = var2 = --4; var10000 < 6; var10000 = var2) {
               if (var2 < var5.length) {
                  String[] var3 = var5[var2].split("\\=");
                  this.ad[(111 & 27) + --2 * (var2 - --4)].setText(var3[2 & 5]);
                  this.ad[(79 & 59) + --2 * (var2 - --4) + (5 >> 2)].setText(var3[--1] + Class270.so(var3[2 & 5]));
               } else {
                  this.ad[(59 & 79) + --2 * (var2 - --4)].setText((String)null);
                  this.ad[(95 & 43) + (5 >> 1) * (var2 - --4) + --1].setText((String)null);
               }

               ++var2;
            }

            this.cg = var1;
         }
      }
   }
}
