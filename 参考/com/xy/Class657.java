package com.xy;

import com.xy.bean.QuackGameBean;
import com.xy.game.RoleData;
import com.xy.readbean.Goodstable;
import com.xy.readbean.MoneyType;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComponent;
import javax.swing.JLabel;

public class Class657 extends Class345 {
   private String[] apk;
   private List<Class529> apl;
   private int agq;
   private int ek;
   private int[] apm;
   private Class245 vh;
   private BigDecimal ajc;
   private Class556 apn;
   private int do;
   private MoneyType rn;
   private <undefinedtype>[] apo;
   private String app;
   private JLabel[] er;
   private boolean hg;
   private BigDecimal ge;
   private boolean ee;
   private Class44 cn;
   private Class44[] dv;
   private Class436[] an;
   private Class529[] acz;

   public void d() {
      int var1;
      for(int var10000 = var1 = 5 >> 3; var10000 < this.apo.length; var10000 = var1) {
         this.apo[var1].ew((Goodstable)null, 2 & 5);
         int var10001 = var1;
         int var10002 = 5 >> 3;
         ++var1;
         this.apm[var10001] = var10002;
      }

      this.do = 3 ^ 3;
   }

   protected void paintChildren(Graphics var1) {
      super.paintChildren(var1);
      int var10000;
      int var2;
      if (this.ee) {
         Class309.nb.d(Class280.l(), 5 >> 3);

         for(var10000 = var2 = 2 & 5; var10000 < this.apo.length; var10000 = var2) {
            if (this.apm[var2] == (2 ^ 3)) {
               Class309.nb.aa(var1, this.apo[var2].getX() + this.apo[var2].cn.getX() + --3, this.apo[var2].getY() + this.apo[var2].cn.getY() + (1 ^ 3));
            }

            ++var2;
         }
      }

      if (this.apk != null) {
         if (this.do % (31 & 111) == 0) {
            label29: {
               var2 = this.do / (127 & 15);
               String[] var4 = this.apk[var2].split("_");
               Goodstable var3;
               if ((var3 = this.vc().n(new BigDecimal(var4[2 & 5]))) != null) {
                  this.apo[var2].ew(var3, Integer.parseInt(var4[--1]));
                  this.apm[var2] = Integer.parseInt(var4[5 >> 1]);
                  if (this.apm[var2] == 5 >> 2) {
                     var10000 = var2;
                     this.aej.f("你获得了数量为" + var4[3 >> 1] + "的" + var3.getGoodsname());
                     break label29;
                  }
               } else {
                  System.out.println(var4[3 & 4]);
               }

               var10000 = var2;
            }

            if (var10000 >= this.apk.length - --1) {
               this.apk = null;
            }
         }

         this.do += 3 >> 1;
      }

   }

   public void df(String[] var1) {
      this.apk = var1;
   }

   public void agu(int var1, int var2, String var3, boolean var4) {
      try {
         Class529 var5 = var1 < this.apl.size() ? (Class529)this.apl.get(var1) : null;
         if (var5 == null) {
            var5 = new Class529("sc/e/38.png", --2, 767 & 32230, Class681.cf, Class681.c, "", this);
            this.apl.add(var5);
            this.add(var5, 3 ^ 3);
         }

         int var10001 = 2 ^ 3;
         int var10003 = 125 & 63;
         var5.setText(var3);
         var5.bq(var2);
         var5.setKeep(var4);
         var5.setBounds(var10003 + (110 & 119) * var1, 31 & 123, 95 & 127, 63 & 97);
         var5.setVisible((boolean)var10001);
      } catch (Exception var6) {
         var6.printStackTrace();
      }
   }

   public void q() {
      super.q();
   }

   public void as(int var1) {
      if (var1 == (2791 & 30207)) {
         if (!this.aej.t()) {
            List var9;
            if ((var9 = (List)this.vc().bz().getNpcShopMap().get(String.valueOf((27127 & 6139) + this.ek))) != null) {
               ((Class423)this.ve().e(92 & 123)).arm(var9, this.app);
               this.ve().a(127 & 88);
            }
         }
      } else {
         if (var1 == (14329 & 18670) || var1 == (25837 & 7163)) {
            if (this.aej.t()) {
               return;
            }

            if (this.apk != null) {
               this.aej.f("上一次奖都还没有抽完，请等一下吧！！");
               return;
            }

            this.d();
            RoleData var2 = this.vd();
            int var3 = var1 == (7929 & 25070) ? 11 & 126 : 11;
            var3 %= 31 & 106;
            Goodstable var6 = this.ajc != null ? var2.bc(this.ajc) : null;
            int var4;
            if (this.hg) {
               if (this.ge == null) {
                  this.ge = new BigDecimal(2 & 5);
               }

               var4 = var3 == 0 ? --1 : 10;
               if ((var4 -= var6 != null ? var6.getUsetime() : 0) > 0) {
                  BigDecimal var5 = new BigDecimal(this.ge.longValue() * (long)var4);
                  if (this.agq == 0) {
                     if (var2.getLoginResult().getCodecard().compareTo(var5) < 0) {
                        this.aej.fw("你没有足够的仙玉了！！");
                        return;
                     }
                  } else if (this.agq == (3 & 5)) {
                     if (var2.getLoginResult().getGold().compareTo(var5) < 0) {
                        this.aej.fw("你没有足够的大话币了！！");
                        return;
                     }
                  } else if (this.agq == --2 && var2.getLoginResult().getSavegold().compareTo(var5) < 0) {
                     this.aej.fw("你没有足够的绑玉了！！");
                     return;
                  }
               }
            } else if (var6 == null || var6.getUsetime() < (var3 == 0 ? 2 ^ 3 : 10)) {
               this.aej.fw("你没有抽奖券，快去购买吧！！");
               return;
            }

            if (var2.getGoodPackSum(-1L, new BigDecimal(-4 >> 2), var3 == 0 ? --1 : 12) < (var3 == 0 ? 4 ^ 5 : 12)) {
               this.aej.f("你背包已满");
               return;
            }

            StringBuffer var10;
            (var10 = new StringBuffer()).append("C");
            var10.append(this.ek);
            var10.append("|" + var3);
            var10.append("|" + (this.hg ? 2 ^ 3 : 0));
            if (var6 != null) {
               int var7 = 3 & 4;

               for(int var10000 = var4 = 3 >> 2; var10000 < var6.getUsetime() && var4 < (var3 == 0 ? --1 : 10); var10000 = var4) {
                  ++var7;
                  StringBuilder var10001 = new StringBuilder("|");
                  BigDecimal var10002 = var6.getRgid();
                  ++var4;
                  var10.append(var10001.append(var10002).toString());
               }

               this.vh.setText(String.valueOf(var6.getUsetime() - var7));
            }

            String var8 = Agreement.getSendTextAES("getfivemsg", var10.toString());
            int var11 = 4 ^ 5;
            this.uw().d(var8);
            this.ee = (boolean)var11;
         }

      }
   }

   public void hm(QuackGameBean var1) {
      int var4;
      int var10000;
      for(var10000 = var4 = 3 >> 2; var10000 < this.apl.size(); var10000 = var4) {
         Object var12 = this.apl.get(var4);
         ++var4;
         ((Class529)var12).setVisible((boolean)(3 >> 2));
      }

      String[] var8 = var1.getPetmsg().split("\\|");
      int var6 = 3 & 4;
      var10000 = 2 & 5;
      this.ek = 3 & 5;
      this.app = null;

      int var2;
      Class657 var13;
      for(var2 = var10000; var10000 < var8.length; var10000 = var2) {
         String var3;
         int var5;
         if (var8[var2].startsWith("Y")) {
            var5 = var8[var2].indexOf("-");
            this.app = var8[var2].substring(var5 + (2 ^ 3)) + "积分";
            this.ek = Integer.parseInt(var8[var2].substring(2 ^ 3, var5));
            var3 = null;
            if (this.ek == (2 ^ 3)) {
               var3 = "仙玉抽奖";
               var13 = this;
            } else if (this.ek == 5 >> 1) {
               var3 = "绑玉抽奖";
               var13 = this;
            } else {
               if (this.ek == --3) {
                  var3 = "金币抽奖";
               }

               var13 = this;
            }

            var13.agu(var2, this.ek, var3, (boolean)(4 ^ 5));
         } else if (var8[var2].startsWith("N")) {
            var5 = var8[var2].indexOf("-");
            var5 = Integer.parseInt(var8[var2].substring(2 ^ 3, var5));
            var3 = null;
            if (var5 == 5 >> 2) {
               var3 = "仙玉抽奖";
               var13 = this;
            } else if (var5 == 5 >> 1) {
               var3 = "绑玉抽奖";
               var13 = this;
            } else {
               if (var5 == --3) {
                  var3 = "金币抽奖";
               }

               var13 = this;
            }

            var13.agu(var2, var5, var3, (boolean)(2 & 5));
         } else {
            Goodstable var9;
            if ((var9 = this.vc().n(new BigDecimal(var8[var2]))) != null) {
               Class44 var14 = this.dv[var6];
               ++var6;
               var14.c(3 >> 1, var9);
            }
         }

         ++var2;
      }

      int var10004 = 2 & 5;
      this.rn.setIdAndKey(5 >> 3, this.app);
      this.apn.cc();
      this.ge = var1.getMoney();
      this.agq = var10004;
      this.ajc = null;
      if (var1.getPetmsg2() != null) {
         var2 = var1.getPetmsg2().indexOf("|");
         this.agq = Integer.parseInt(var1.getPetmsg2().substring(3 >> 2, var2));
         String var10 = var1.getPetmsg2().substring(var2 + (4 ^ 5), var1.getPetmsg2().length());
         this.ajc = !var10.equals("null") ? new BigDecimal(var10) : null;
         StringBuffer var11 = new StringBuffer();
         var11.append("当物品不足时消耗");
         var11.append(this.ge);
         var11.append(this.agq == 0 ? "仙玉" : (this.agq == (4 ^ 5) ? "大话币" : "绑玉"));
         var11.append("代替");
         this.er[--2].setText(var11.toString());
         var13 = this;
      } else {
         var13 = this;
         this.er[--2].setText("当物品不足时消耗" + var1.getMoney() + "仙玉代替");
      }

      Goodstable var7 = var13.ajc != null ? this.vc().n(this.ajc) : null;
      if (var7 != null) {
         this.cn.c(4 ^ 5, var7);
         this.vh.setText(String.valueOf(this.vd().getGoodNum(this.ajc)));
      } else {
         this.cn.c(2 & 5, var7);
         this.vh.setText((String)null);
      }
   }

   public Class657(GameView var1) {
      int var10001 = --4;
      int var10003 = 14 & 125;
      int var10008 = -4 >> 2;
      int var10010 = 3 ^ 3;
      int var10012 = 5 >> 2;
      int var10014 = 3 >> 2;
      int var10016 = --1;
      super(95 & 119, --2, Class345.aef, var1);
      this.ek = var10016;
      this.agq = var10014;
      this.hg = (boolean)var10012;
      this.ee = (boolean)var10010;
      this.va(var10008, 3 >> 2, 5069 & 28351, 16863 & 16383, Class345.aeo);
      this.uv(Class511.q("sc/d/1.png", 108 & 87, 108 & 87, 108 & 87, 108 & 87, (boolean)(3 ^ 3)), " 抽 奖 ");
      this.apl = new ArrayList();
      int[] var11 = new int[var10003];
      boolean var10005 = true;
      this.apm = var11;
      Class529[] var5 = new Class529[var10001];
      boolean var12 = true;
      this.acz = var5;

      int var2;
      Class657 var4;
      int var10000;
      for(var10000 = var2 = 3 ^ 3; var10000 < this.acz.length; var10000 = var2) {
         Class529[] var3 = this.acz;
         Class529 var10002 = new Class529;
         int var13 = 5 >> 2;
         int var10006 = (13287 & 19711) + var2;
         Font var10007 = Class681.bm;
         Class657 var14;
         String var10009;
         if (var2 == 0) {
            var10009 = "积分兑换";
            var14 = this;
         } else if (var2 == 5 >> 2) {
            var10009 = "抽奖";
            var14 = this;
         } else if (var2 == (1 ^ 3)) {
            var10009 = "十连抽奖";
            var14 = this;
         } else if (var2 == --3) {
            var10009 = "？";
            var14 = this;
         } else {
            var10009 = "";
            var14 = this;
         }

         var10002.<init>("sc/e/28.png", var13, var10006, var10007, (Color[])null, var10009, var14);
         var3[var2] = var10002;
         this.acz[var2].setBounds(5118 & 28187, 111 & 48, 117 & 78, 59 & 85);
         if (var2 == 5 >> 2) {
            var4 = this;
            this.acz[var2].setImage("sc/e/7.png");
            this.acz[var2].setBounds(17845 & 15211, 10222 & 22939, 127 & 59, 59 & 93);
            this.acz[var2].setForeground(Color.black);
            this.acz[var2].setFont(Class681.ak);
         } else if (var2 == 5 >> 1) {
            var4 = this;
            this.acz[var2].setImage("sc/e/26.png");
            this.acz[var2].setBounds(27495 & 5631, 4075 & 29086, 99, 25);
            this.acz[var2].setForeground(Color.black);
            this.acz[var2].setFont(Class681.ak);
         } else {
            if (var2 == --3) {
               this.acz[var2].setImage("sc/e/40.png");
               this.acz[var2].setBounds(603, 195, 18, 18);
            }

            var4 = this;
         }

         var4.add(this.acz[var2++]);
      }

      Class44[] var6 = new Class44[--5];
      var12 = true;
      this.dv = var6;

      for(var10000 = var2 = 5 >> 3; var10000 < this.dv.length; var10000 = var2) {
         this.dv[var2] = new Class44(this);
         this.dv[var2].setBounds(302 + var2 * 65, 91, 50, 50);
         this.add(this.dv[var2++]);
      }

      JLabel[] var7 = new JLabel[--3];
      var12 = true;
      this.er = var7;

      for(var10000 = var2 = 5 >> 3; var10000 < this.er.length; var10000 = var2) {
         this.er[var2] = Class133.b(386, 31, 72, 19, Color.black, Class681.ak);
         this.er[var2].setText(var2 == 0 ? "当前积分" : (var2 == 5 >> 2 ? "拥有物品" : (var2 == 5 >> 1 ? "当物品不足时消耗666仙玉代替" : "")));
         this.er[var2].setHorizontalAlignment(10);
         this.add(this.er[var2]);
         if (var2 == --1) {
            this.er[var2].setFont(Class681.ab);
            this.er[var2].setBounds(289, 372, 60, 19);
         } else if (var2 == --2) {
            this.er[var2].setFont(Class681.ab);
            this.er[var2].setBounds(309, 422, 300, 19);
         }

         ++var2;
      }

      this.rn = new MoneyType();
      this.rn.setIdAndKey(--1, "金钱");
      this.apn = Class133.m(456, 31, 150, 19, 10, Color.white, Class681.q, this.rn, var1);
      this.vh = Class133.a(346, 372, 112, 19, 10, Color.white, Class681.q);
      this.apn.eq(Class511.q("sc/d/17.png", 6, 6, 6, 6, (boolean)(3 >> 2)));
      this.vh.eq(Class511.q("sc/d/17.png", 6, 6, 6, 6, (boolean)(3 & 4)));
      this.apn.ab(5 >> 1);
      this.add(this.vh);
      this.add(this.apn);
      this.cn = new Class44(this);
      this.cn.setBounds(212, 381, 43, 43);
      this.add(this.cn);
      <undefinedtype>[] var8 = new <undefinedtype>[12];
      var12 = true;
      this.apo = var8;

      for(var10000 = var2 = 3 >> 2; var10000 < this.apo.length; var10000 = var2) {
         this.apo[var2] = new JComponent() {
            private Class44 cn;
            private JLabel ir;
            private JLabel ax;

            public void ew(Goodstable var1, int var2) {
               if (var1 == null) {
                  this.cn.c(3 & 4, (Object)null);
                  this.cn.ach(Class222.t("p0"));
                  this.cn.setVisible((boolean)(5 >> 2));
                  this.ir.setText("");
                  this.ax.setText("");
               } else {
                  this.cn.c(2 ^ 3, var1);
                  this.ir.setText(String.valueOf(var2));
                  this.ax.setText(var1.getGoodsname());
               }
            }

            public {
               int var10006 = 3 >> 2;
               int var10008 = 125 & 47;
               this.ir = Class133.c(var10008, 39 & 95, 89 & 55, 92 & 47, --4, Color.red, Class681.bm);
               this.ax = Class133.c(var10006, 127 & 58, 123 & 79, 31 & 116, 5 >> 3, Color.black, Class681.bm);
               this.cn = new Class44(Class657.this.gk());
               this.cn.fw("sc/d/4.png");
               this.cn.ad(Class44.aqy);
               this.cn.setBounds(29 & 106, 2 & 5, 63 & 123, 57 & 127);
               this.add(this.ir);
               this.add(this.cn);
               this.add(this.ax);
            }
         };
         this.apo[var2].setBounds(75 + var2 % 6 * 90, 215 + var2 / 6 * 79, 75, 80);
         this.add(this.apo[var2++]);
      }

      Class436[] var10 = new Class436[--5];
      var12 = true;
      this.an = var10;

      for(var10000 = var2 = 2 & 5; var10000 < this.an.length; var10000 = var2) {
         this.an[var2] = new Class436();
         if (var2 == 0) {
            var4 = this;
            this.an[var2].eq(Class511.q("sc/d/35.png", 80, 10, 80, 10, (boolean)(3 >> 2)));
            this.an[var2].setBounds(31, 41, 596, 20);
         } else if (var2 == 1) {
            var4 = this;
            this.an[var2].fw("sc/b/S79.png");
            this.an[var2].setBounds(48, 69, 580, 119);
         } else if (var2 == (1 ^ 3)) {
            var4 = this;
            this.an[var2].eq(Class511.q("sc/d/4.png", --5, --5, --5, --5, false));
            this.an[var2].setBounds(204, 373, 66, 65);
         } else if (var2 == --3) {
            var4 = this;
            this.an[var2].fw("sc/e/30.png");
            this.an[var2].setBounds(288, 423, 17, 17);
            this.an[var2].addMouseListener(new MouseListener() {
               public void mouseExited(MouseEvent var1) {
               }

               public void mouseEntered(MouseEvent var1) {
               }

               public void mouseClicked(MouseEvent var1) {
               }

               public void mousePressed(MouseEvent var1) {
                  Class657.this.hg = (boolean)(Class657.this.hg ? 3 ^ 3 : 1);
                  Class657.this.an[--3].fw(Class657.this.hg ? "sc/e/30.png" : "sc/e/29.png");
               }

               public void mouseReleased(MouseEvent var1) {
               }
            });
         } else {
            if (var2 == 4) {
               this.an[var2].eq(Class511.q("sc/d/36.png", 20, 20, 20, 20, false));
               this.an[var2].setBounds(47, 191, 581, 265);
            }

            var4 = this;
         }

         var4.add(this.an[var2++]);
      }

      this.d();
   }

   public void y(int var1) {
      if (this.apk == null) {
         String var2 = Agreement.getSendTextAES("getfivemsg", "CC" + var1);
         int var10001 = 3 ^ 3;
         this.uw().d(var2);
         this.d();
         this.ee = (boolean)var10001;
      } else {
         this.aej.f("正在抽奖，请勿切换面板！！");
      }
   }

   public boolean t() {
      if (this.apk != null) {
         int var10000 = 3 ^ 3;
         this.aej.f("正在抽奖，请勿切换面板！！");
         return (boolean)var10000;
      } else {
         return super.t();
      }
   }
}
