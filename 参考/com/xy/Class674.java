package com.xy;

import com.xy.bean.FriendBean;
import com.xy.bean.GoodTrans;
import com.xy.bean.GoodTrans2;
import com.xy.entity.Lingbao;
import com.xy.entity.RoleSummoning;
import com.xy.formula.GoodType;
import com.xy.game.RoleData;
import com.xy.game.RolePet;
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
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class Class674 extends Class345 {
   private <undefinedtype> wv;
   private <undefinedtype> ww;
   private Class556 kd;
   private Class436[] wx;
   private MoneyType wy;
   private Class529[] wz;
   private Class529 xa;
   private Class521 xb;
   private JScrollPane w;
   private Class44[] gb;
   private Class319 uh;
   private Class245[] xc;
   private Class217 xd;
   private Class585 ab;
   private Class248 xe;
   private JLabel[] ad;
   private Class436[] an;
   private int m;

   public void of(GoodTrans2 var1) {
      int var2;
      if (var1.getGoods() != null) {
         for(int var10000 = var2 = 3 & 4; var10000 < 8; var10000 = var2) {
            Goodstable var3 = this.ww.a.getGood(var2);
            Goodstable var4 = (Goodstable)this.gb[var2].hr();
            if (var3 != null || var4 != null) {
               if (var3 == null) {
                  this.gb[var2].c(5 >> 3, (Object)null);
                  this.gb[var2].setVisible((boolean)(3 & 5));
               } else if (var4 == null) {
                  this.gb[var2].c(--1, var3);
               } else if (!Class394.v(var3.getRgid(), var4.getRgid())) {
                  this.gb[var2].c(3 & 5, var3);
               }
            }

            ++var2;
         }
      }

      if (var1.getPet() != null) {
         RoleSummoning var5 = this.ww.a.getPet(5 >> 3);
         RoleSummoning var7 = this.ww.a.getPet(5 >> 2);
         this.xc[--1].setText(var5 != null ? var5.getSummoningname() : null);
         this.xc[5 >> 1].setText(var7 != null ? var7.getSummoningname() : null);
      }

      if (var1.getLingbao() != null) {
         Lingbao var6 = this.ww.a.getLingbao(5 >> 3);
         Lingbao var8 = this.ww.a.getLingbao(--1);
         this.xc[--3].setText(var6 != null ? var6.getBaoname() : null);
         this.xc[--4].setText(var8 != null ? var8.getBaoname() : null);
      }

   }

   public void r(boolean var1) {
      if (this.ww != null && this.ww.a != null) {
         if (var1) {
            RoleData var9 = this.vd();
            List var5 = this.ww.a.getGoods();
            List var7 = this.ww.a.getPets();
            List var4 = this.ww.a.getLingbaos();
            int var2 = 2 & 5;
            int var6 = var5 != null ? var5.size() : 0;

            Goodstable var3;
            int var10000;
            for(var10000 = var2; var10000 < var6; var10000 = var2) {
               var3 = (Goodstable)var5.get(var2);
               Goodstable var8;
               Goodstable var13 = var8 = var9.getGood(var3.getRgid());
               var13.ab(var3.getUsetime());
               if (var13.getUsetime() <= 0) {
                  var9.h(var8.getRgid());
               }

               ++var2;
            }

            var2 = 5 >> 3;
            var6 = var7 != null ? var7.size() : 0;

            RoleSummoning var10;
            for(var10000 = var2; var10000 < var6; var10000 = var2) {
               var10 = (RoleSummoning)var7.get(var2);
               RolePet var12;
               if ((var12 = var9.getRolePet(var10.getSid().longValue())) != null) {
                  var9.pets.remove(var12);
               }

               if (var9.bj(var12.getId())) {
                  var9.setChosePetId((BigDecimal)null);
               }

               ++var2;
            }

            var2 = 3 ^ 3;
            var6 = var4 != null ? var4.size() : 0;

            Lingbao var11;
            for(var10000 = var2; var10000 < var6; var10000 = var2) {
               Lingbao var14 = var11 = (Lingbao)var4.get(var2);
               var9.l(var11);
               var9.lingbaoMap.remove(var11.getBaoid());
               var9.lingbaoList.remove(var11.getBaoid());
               if (var9.bt(var14.getBaoid())) {
                  var9.setChoseBaoId((BigDecimal)null);
               }

               ++var2;
            }

            var5 = this.wv.a.getGoods();
            var7 = this.wv.a.getPets();
            var4 = this.wv.a.getLingbaos();
            if (this.wv.a.getMoney() != null && this.wv.a.getMoney().longValue() > 0L) {
               this.aej.f("你获得金钱#c00FFFF" + this.wv.a.getMoney());
            }

            var2 = 0;
            var6 = var5 != null ? var5.size() : 0;

            GameView var15;
            StringBuilder var10001;
            String var10002;
            for(var10000 = var2; var10000 < var6; var10000 = var2) {
               var3 = (Goodstable)var5.get(var2);
               var15 = this.aej;
               var10001 = (new StringBuilder("你获得#G")).append(var3.getUsetime()).append("#Y个#c00FFFF");
               var10002 = var3.getGoodsname();
               ++var2;
               var15.f(var10001.append(var10002).toString());
            }

            var2 = 3 ^ 3;
            var6 = var7 != null ? var7.size() : 0;

            for(var10000 = var2; var10000 < var6; var10000 = var2) {
               var10 = (RoleSummoning)var7.get(var2);
               var15 = this.aej;
               var10001 = new StringBuilder("你获得召唤兽#c00FFFF");
               var10002 = var10.getSummoningname();
               ++var2;
               var15.f(var10001.append(var10002).toString());
            }

            var2 = 5 >> 3;
            var6 = var4 != null ? var4.size() : 0;

            for(var10000 = var2; var10000 < var6; var10000 = var2) {
               var11 = (Lingbao)var4.get(var2);
               var15 = this.aej;
               var10001 = new StringBuilder("你获得灵宝#c00FFFF");
               var10002 = var11.getBaoname();
               ++var2;
               var15.f(var10001.append(var10002).toString());
            }
         }

         this.ww.a = null;
         this.wv.a = null;
         this.ve().n(this.ae());
      }
   }

   public void z(long var1, JTextField var3) {
      if (this.wv != null && this.wv.b != null) {
         long var4 = this.ww.a.getMoney() != null ? this.ww.a.getMoney().longValue() : 0L;
         if (var1 != var4) {
            this.ww.a.setMoney(new BigDecimal(var1));
            GoodTrans2 var6 = new GoodTrans2();
            var6.setI((boolean)(2 ^ 3));
            var6.setMoney(this.ww.a.getMoney());
            String var7 = Agreement.getSendTextAES("TransGood", Class695.b().toJson(var6));
            this.uw().d(var7);
         }
      }

   }

   public boolean aa(long var1, JTextField var3) {
      return (boolean)(this.ww != null && this.ww.c == 0 ? 3 & 5 : 0);
   }

   public void q() {
      int var10002 = 5 >> 3;
      this.uu(this.ab, 6909 & 26382, 127 & 51);
      this.kd.cc();
      this.y(var10002);
      super.q();
   }

   public void y(int var1) {
      int var10000 = 3 ^ 3;
      this.m = var1;

      for(var1 = var10000; var10000 < this.wz.length; var10000 = var1) {
         this.wz[var1].setKeep((boolean)(var1 == this.m ? 3 >> 1 : 0));
         ++var1;
      }

      if (this.m == 0) {
         this.xe.q();
         this.w.setVisible((boolean)(--1));
         this.an[2 & 5].setVisible((boolean)(3 >> 1));
         this.an[--1].setVisible((boolean)(2 ^ 3));
         this.an[5 >> 1].setVisible((boolean)(3 >> 2));
         this.xb.setVisible((boolean)(3 & 4));
      } else {
         if (this.m == 3 >> 1) {
            this.an[1 ^ 3].setVisible((boolean)(3 >> 1));
            this.xb.setVisible((boolean)(3 >> 1));
            this.an[3 >> 2].setVisible((boolean)(5 >> 3));
            this.an[2 ^ 3].setVisible((boolean)(2 & 5));
            this.w.setVisible((boolean)(2 & 5));
         }

      }
   }

   protected void paintChildren(Graphics var1) {
      super.paintChildren(var1);
      if (this.ww != null) {
         this.ww.g(var1);
      }

      if (this.wv != null) {
         this.wv.g(var1);
      }

   }

   public void oi(GoodTrans2 var1) {
      this.wv.a.b(var1);
      if (var1.getMoney() != null) {
         this.wv.h(var1.getMoney().longValue());
      }

      int var2;
      if (var1.getGoods() != null) {
         for(int var10000 = var2 = 3 >> 2; var10000 < 8; var10000 = var2) {
            Goodstable var3 = this.wv.a.getGood(var2);
            Goodstable var4 = (Goodstable)this.gb[(89 & 46) + var2].hr();
            if (var3 != null || var4 != null) {
               if (var3 == null) {
                  this.gb[(93 & 42) + var2].c(2 & 5, (Object)null);
                  this.gb[(78 & 57) + var2].setVisible((boolean)(--1));
               } else if (var4 == null) {
                  this.gb[(74 & 61) + var2].c(82 & 63, var3);
               } else if (!Class394.v(var3.getRgid(), var4.getRgid())) {
                  this.gb[(27 & 108) + var2].c(27 & 118, var3);
               }
            }

            ++var2;
         }
      }

      if (var1.getPet() != null) {
         RoleSummoning var5 = this.wv.a.getPet(3 ^ 3);
         RoleSummoning var7 = this.wv.a.getPet(4 ^ 5);
         this.xc[--5].setText(var5 != null ? var5.getSummoningname() : null);
         this.xc[119 & 14].setText(var7 != null ? var7.getSummoningname() : null);
      }

      if (var1.getLingbao() != null) {
         Lingbao var6 = this.wv.a.getLingbao(3 & 4);
         Lingbao var8 = this.wv.a.getLingbao(--1);
         this.xc[15 & 119].setText(var6 != null ? var6.getBaoname() : null);
         this.xc[62 & 73].setText(var8 != null ? var8.getBaoname() : null);
      }

   }

   public void gd(int var1, String var2) {
      <undefinedtype> var3 = null;
      <undefinedtype> var4 = null;
      int var10000;
      if (this.wv.d.equals(var2)) {
         var3 = this.wv;
         var4 = this.ww;
         var10000 = var1;
      } else {
         if (this.vd().getLoginResult().getRolename().equals(var2)) {
            var3 = this.ww;
            var4 = this.wv;
         }

         var10000 = var1;
      }

      if (var10000 == 3) {
         var3.e(4 ^ 5);
      } else {
         if (var1 == --4) {
            var3.e(3 ^ 3);
            if (var4.c == (1 ^ 3)) {
               var4.e(--1);
               return;
            }
         } else if (var1 == --5) {
            var3.e(1 ^ 3);
         }

      }
   }

   public void fn(Lingbao var1) {
      if (this.ww.c == 0) {
         if (var1 != null) {
            if (var1.getEquipment() == --1) {
               this.aej.f("该灵宝在参战中，不可交易！");
            } else {
               int var2 = this.ww.a.getLingbaos() != null ? this.ww.a.getLingbaos().size() : 0;
               boolean var3 = this.ww.a.setLingbao(var1);
               int var4 = this.ww.a.getLingbaos() != null ? this.ww.a.getLingbaos().size() : 0;
               if (var2 == var4) {
                  this.aej.f("格子已满");
               } else {
                  GoodTrans2 var6 = new GoodTrans2();
                  var6.setI(var3);
                  var6.setLingbao(var1);
                  String var5 = Agreement.getSendTextAES("TransGood", Class695.b().toJson(var6));
                  this.uw().d(var5);
                  this.of(var6);
               }
            }
         }
      }
   }

   public void d() {
      if (!this.aej.t()) {
         if (this.ww.c != 0 && this.wv.c != 0) {
            if (this.wv.a.getGoods() != null && this.vd().getGoodPackSum(-1L, new BigDecimal(-4 >> 2), 30719 & 3047) < this.wv.a.getGoods().size()) {
               this.aej.f("背包不足");
            } else {
               if (this.wv.a.getPets() != null) {
                  int var1 = this.wv.a.getPets().size() + this.vd().pets.size();
                  if (this.ww.a.getPets() != null) {
                     var1 -= this.ww.a.getPets().size();
                  }

                  if (var1 > (87 & 61)) {
                     this.aej.f("召唤兽格子不足");
                     return;
                  }
               }

               String var2 = Agreement.getSendTextAES("TransState", "5");
               this.uw().d(var2);
            }
         } else {
            this.aej.f("双方都锁定才能点击确定");
         }
      }
   }

   public void oj(Goodstable var1, boolean var2) {
      if (this.ww.c == 0) {
         if (GoodType.e(var1)) {
            this.aej.f("该物品禁止交易");
         } else {
            Goodstable var3;
            if ((var3 = this.ww.a.getGood(var1.getRgid())) == null) {
               if (this.ww.a.getGoods() != null && this.ww.a.getGoods().size() >= (26 & 109)) {
                  this.aej.f("格子已满");
                  return;
               }

               var3 = (Goodstable)var1.clone();
               int var10000 = 2 & 5;
               var3.setUsetime(5 >> 2);
               this.ww.a.setGood(var3);
               var3.setUsetime(var10000);
            }

            int var4 = var2 ? var1.getUsetime() : Math.min(var1.getUsetime(), var3.getUsetime() + (5 >> 2));
            if (var4 != var3.getUsetime()) {
               var3.setUsetime(var4);
               GoodTrans2 var5 = new GoodTrans2();
               var5.setI((boolean)(--1));
               var5.setGoods(var3);
               String var6 = Agreement.getSendTextAES("TransGood", Class695.b().toJson(var5));
               this.uw().d(var6);
               this.of(var5);
            }
         }
      }
   }

   public void ok(RolePet var1, MouseEvent var2) {
      if (this.ww.c == 0) {
         RoleSummoning var7 = var1 != null ? var1.getPet() : null;
         if (var7 != null) {
            if ((var7.getPetlock() >>> (3 ^ 3) & (4 ^ 5)) == --1) {
               this.aej.fw("召唤兽" + var7.getSummoningname() + "已被加锁，不可交易！！");
            } else if ((var7.getPetlock() >>> (4 ^ 5) & (4 ^ 5)) == (4 ^ 5)) {
               this.aej.fw("召唤兽" + var7.getSummoningname() + "已被禁交易，不可交易！！");
            } else {
               int var5;
               if ((var5 = Integer.parseInt(var7.getSummoningid())) >= 100000 && var5 <= 200000) {
                  this.aej.fw("召唤兽" + var7.getSummoningname() + "已被禁交易，不可交易！！");
               } else if (Class394.v(this.vd().getLoginResult().getSummoning_id(), var7.getSid())) {
                  this.aej.fw("该召唤兽在参战中，不可交易！");
               } else if (this.vd().getPetMount(var7.getSid()) != null) {
                  this.aej.f("这只召唤兽被管制中，不可交易！！！");
               } else {
                  var5 = this.ww.a.getPets() != null ? this.ww.a.getPets().size() : 0;
                  boolean var3 = this.ww.a.setPet(var7);
                  int var4 = this.ww.a.getPets() != null ? this.ww.a.getPets().size() : 0;
                  if (var5 == var4) {
                     this.aej.f("格子已满");
                  } else {
                     GoodTrans2 var6 = new GoodTrans2();
                     var6.setI(var3);
                     var6.setPet(var7);
                     String var8 = Agreement.getSendTextAES("TransGood", Class695.b().toJson(var6));
                     this.uw().d(var8);
                     this.of(var6);
                  }
               }
            }
         }
      }
   }

   public boolean t() {
      int var10000;
      if (this.wv != null && this.wv.a != null) {
         String var2 = Agreement.getSendTextAES("TransState", "2");
         var10000 = 3 >> 2;
         this.uw().d(var2);
         return (boolean)var10000;
      } else {
         if (this.ww != null) {
            this.ww.a = null;
         }

         if (this.wv != null) {
            this.wv.a = null;
         }

         int var1;
         for(var10000 = var1 = 0; var10000 < this.gb.length; var10000 = var1) {
            this.gb[var1].c(3 & 4, (Object)null);
            this.gb[var1++].setVisible((boolean)(3 >> 1));
         }

         for(var10000 = var1 = 3 >> 2; var10000 < this.xc.length; var10000 = var1) {
            this.xc[var1++].setText((String)null);
         }

         return super.t();
      }
   }

   public Class674(GameView var1) {
      int var10001 = 5 >> 1;
      int var10005 = -4 >> 2;
      super(126 & 15, 1 ^ 3, Class345.aef, var1);
      this.va(var10005, 3 >> 2, 22514 & 10815, 12767 & 20475, Class345.aeo);
      this.uv(Class511.q("sc/d/1.png", 116 & 79, 116 & 79, 116 & 79, 116 & 79, (boolean)(3 & 4)), "交易");
      Class529[] var6 = new Class529[var10001];
      boolean var10003 = true;
      this.wz = var6;

      int var2;
      int var10000;
      for(var10000 = var2 = 3 ^ 3; var10000 < this.wz.length; var10000 = var2) {
         Class529[] var5 = this.wz;
         Class529 var10002 = new Class529;
         var10005 = 1 ^ 3;
         int var10006 = (28415 & 4573) + var2;
         Font var10007 = Class681.cw;
         String var10009;
         Class674 var10010;
         if (var2 == 0) {
            var10009 = "召唤兽";
            var10010 = this;
         } else if (var2 == (3 & 5)) {
            var10009 = "灵宝";
            var10010 = this;
         } else {
            var10009 = "";
            var10010 = this;
         }

         var10002.<init>("sc/e/39.png", var10005, var10006, var10007, (Color[])null, var10009, var10010);
         var5[var2] = var10002;
         this.wz[var2].setOffsetTexts(Class681.cl);
         this.wz[var2].setBounds((62 & 115) + (115 & 77) * var2, 125 & 11, 63 & 127, 124 & 27);
         this.add(this.wz[var2++]);
      }

      var10001 = --3;
      var10005 = 63 & 111;
      this.xe = new Class248(this);
      this.xe.setBounds(3 ^ 3, 3 ^ 3, 7918 & 24989, 30 & 117);
      this.w = Class133.f(var10005, 127 & 53, 17133 & 15794, 17133 & 15794, this.xe, 31 & 116);
      this.add(this.w);
      Class436[] var8 = new Class436[var10001];
      var10003 = true;
      this.an = var8;

      Class674 var7;
      for(var10000 = var2 = 2 & 5; var10000 < this.an.length; var10000 = var2) {
         this.an[var2] = new Class436();
         if (var2 == 0) {
            var7 = this;
            this.an[var2].eq(Class511.q("sc/d/25.png", 5 >> 1, 5 >> 1, 5 >> 1, 5 >> 1, (boolean)(3 >> 2)));
            this.an[var2].setBounds(47, 32, 160, 21);
         } else if (var2 == (4 ^ 5)) {
            var7 = this;
            this.an[var2].eq(Class511.q("sc/d/24.png", --2, --2, --2, --2, (boolean)(5 >> 3)));
            this.an[var2].setBounds(47, 32, 160, 180);
         } else {
            if (var2 == --2) {
               this.an[var2].eq(Class511.q("sc/d/19.png", --5, --5, --5, --5, (boolean)(5 >> 3)));
               this.an[var2].setBounds(49, 32, 156, 156);
            }

            var7 = this;
         }

         var7.add(this.an[var2++]);
      }

      this.xa = new Class529("sc/e/7.png", --1, 223, Class681.ak, Class681.c, "确定", this);
      this.xa.setBounds(42, 272, 59, 25);
      this.add(this.xa);
      JLabel[] var9 = new JLabel[11];
      var10003 = true;
      this.ad = var9;

      for(var10000 = var2 = 3 & 4; var10000 < this.ad.length; var10000 = var2) {
         this.ad[var2] = Class133.b(47, 220 + 22 * var2, 36, 19, Color.black, Class681.ak);
         this.ad[var2].setText(var2 == 0 ? "现金" : (var2 == --1 ? "银两" : (var2 == --2 ? "银两" : "")));
         this.ad[var2].setHorizontalAlignment(10);
         this.add(this.ad[var2]);
         if (var2 == --2) {
            this.ad[var2].setBounds(337, 246, 36, 19);
         }

         ++var2;
      }

      this.wy = new MoneyType();
      this.wy.setIdAndKey(--1, "金钱");
      this.kd = Class133.i(10, Color.white, Class681.q, this.wy, var1);
      this.kd.ab(--2);
      this.kd.eq(Class511.q("sc/d/17.png", 6, 6, 6, 6, (boolean)(5 >> 3)));
      this.kd.setBounds(85, 220, 123, 19);
      this.add(this.kd);
      this.xd = Class133.n(Class511.q("sc/d/17.png", 6, 6, 6, 6, (boolean)(5 >> 3)), Class681.q, Color.white);
      this.xd.setBounds(85, 242, 123, 19);
      this.add(this.xd);
      this.uh = new Class319(15, this.xd, this);
      Class245[] var11 = new Class245[9];
      var10003 = true;
      this.xc = var11;

      for(var10000 = var2 = 3 & 4; var10000 < this.xc.length; var10000 = var2) {
         if (var2 == 0) {
            var7 = this;
            this.xc[var2] = Class133.a(375, 246, 123, 19, 10, Color.white, Class681.q);
         } else if (var2 >= (4 ^ 5) && var2 <= --4) {
            var7 = this;
            this.xc[var2] = Class133.a(42 + (var2 - (3 >> 1)) / (5 >> 1) * 106, 302 + (var2 - (5 >> 2)) % (1 ^ 3) * 20, 100, 19, 10, Color.white, Class681.q);
            this.xc[var2].addMouseListener(new MouseListener(1, var2 - 1) {
               private int bn;
               private int m;

               public {
                  this.m = var2;
                  this.bn = var3;
               }

               public void mouseExited(MouseEvent var1) {
                  if (this.m == (2 ^ 3) || this.m == (1 ^ 3)) {
                     if (this.bn == 0 || this.bn == (4 ^ 5)) {
                        Class674.this.ve().n(43 & 126);
                        return;
                     }

                     Class674.this.ve().n(45 & 127);
                  }

               }

               public void mouseReleased(MouseEvent var1) {
               }

               public void mouseClicked(MouseEvent var1) {
               }

               public void mousePressed(MouseEvent var1) {
                  if (this.m == 0) {
                     String var4;
                     if (Class674.this.ww.c == 0) {
                        var4 = Agreement.getSendTextAES("TransState", "3");
                        Class674.this.uw().d(var4);
                     } else {
                        var4 = Agreement.getSendTextAES("TransState", "4");
                        Class674.this.uw().d(var4);
                     }
                  } else {
                     if (this.m == (2 ^ 3)) {
                        if (this.bn == 0 || this.bn == --1) {
                           RoleSummoning var3;
                           if ((var3 = Class674.this.ww.a.getPet(this.bn)) == null) {
                              return;
                           } else {
                              Class674.this.ok(Class674.this.vd().getRolePet(var3.getSid().longValue()), var1);
                              return;
                           }
                        }

                        Lingbao var2;
                        if ((var2 = Class674.this.ww.a.getLingbao(this.bn - (5 >> 1))) == null) {
                           return;
                        }

                        Class674.this.fn(var2);
                     }

                  }
               }

               public void mouseEntered(MouseEvent var1) {
                  if (this.m == 3 >> 1 || this.m == --2) {
                     if (this.bn == 0 || this.bn == 5 >> 2) {
                        RoleSummoning var3 = this.m == (2 ^ 3) ? Class674.this.ww.a.getPet(this.bn) : Class674.this.wv.a.getPet(this.bn);
                        if (var3 == null) {
                           return;
                        }

                        ((Class106)Class674.this.ve().e(59 & 110)).amj(var3, (String)null, (List)null, (boolean)(5 >> 3));
                        return;
                     }

                     Lingbao var2 = this.m == 5 >> 2 ? Class674.this.ww.a.getLingbao(this.bn - (1 ^ 3)) : Class674.this.wv.a.getLingbao(this.bn - (1 ^ 3));
                     if (var2 == null) {
                        return;
                     }

                     ((Class73)Class674.this.ve().e(47 & 125)).ge(var2, (boolean)(3 & 4));
                  }

               }
            });
         } else {
            if (var2 >= --5 && var2 <= 8) {
               this.xc[var2] = Class133.a(313 + (var2 - 5) / 2 * 106, 302 + (var2 - 5) % 2 * 20, 100, 19, 10, Color.white, Class681.q);
               this.xc[var2].addMouseListener(new MouseListener(2, var2 - 5) {
                  private int bn;
                  private int m;

                  public {
                     this.m = var2;
                     this.bn = var3;
                  }

                  public void mouseExited(MouseEvent var1) {
                     if (this.m == (2 ^ 3) || this.m == (1 ^ 3)) {
                        if (this.bn == 0 || this.bn == (4 ^ 5)) {
                           Class674.this.ve().n(43 & 126);
                           return;
                        }

                        Class674.this.ve().n(45 & 127);
                     }

                  }

                  public void mouseReleased(MouseEvent var1) {
                  }

                  public void mouseClicked(MouseEvent var1) {
                  }

                  public void mousePressed(MouseEvent var1) {
                     if (this.m == 0) {
                        String var4;
                        if (Class674.this.ww.c == 0) {
                           var4 = Agreement.getSendTextAES("TransState", "3");
                           Class674.this.uw().d(var4);
                        } else {
                           var4 = Agreement.getSendTextAES("TransState", "4");
                           Class674.this.uw().d(var4);
                        }
                     } else {
                        if (this.m == (2 ^ 3)) {
                           if (this.bn == 0 || this.bn == --1) {
                              RoleSummoning var3;
                              if ((var3 = Class674.this.ww.a.getPet(this.bn)) == null) {
                                 return;
                              } else {
                                 Class674.this.ok(Class674.this.vd().getRolePet(var3.getSid().longValue()), var1);
                                 return;
                              }
                           }

                           Lingbao var2;
                           if ((var2 = Class674.this.ww.a.getLingbao(this.bn - (5 >> 1))) == null) {
                              return;
                           }

                           Class674.this.fn(var2);
                        }

                     }
                  }

                  public void mouseEntered(MouseEvent var1) {
                     if (this.m == 3 >> 1 || this.m == --2) {
                        if (this.bn == 0 || this.bn == 5 >> 2) {
                           RoleSummoning var3 = this.m == (2 ^ 3) ? Class674.this.ww.a.getPet(this.bn) : Class674.this.wv.a.getPet(this.bn);
                           if (var3 == null) {
                              return;
                           }

                           ((Class106)Class674.this.ve().e(59 & 110)).amj(var3, (String)null, (List)null, (boolean)(5 >> 3));
                           return;
                        }

                        Lingbao var2 = this.m == 5 >> 2 ? Class674.this.ww.a.getLingbao(this.bn - (1 ^ 3)) : Class674.this.wv.a.getLingbao(this.bn - (1 ^ 3));
                        if (var2 == null) {
                           return;
                        }

                        ((Class73)Class674.this.ve().e(47 & 125)).ge(var2, (boolean)(3 & 4));
                     }

                  }
               });
            }

            var7 = this;
         }

         var7.xc[var2].eq(Class511.q("sc/d/17.png", 6, 6, 6, 6, false));
         this.add(this.xc[var2++]);
      }

      var8 = new Class436[6];
      var10003 = true;
      this.wx = var8;

      for(var10000 = var2 = 0; var10000 < this.wx.length; var10000 = var2) {
         this.wx[var2] = new Class436();
         this.add(this.wx[var2]);
         if (var2 >= 0 && var2 <= 2) {
            this.wx[var2].eq(Class511.q("sc/d/19.png", 5, 5, 5, 5, false));
            if (var2 == 0) {
               this.wx[var2].setBounds(215, 32, 309, 207);
            } else if (var2 == 1) {
               this.wx[var2].setBounds(41, 345, 207, 105);
            } else if (var2 == 2) {
               this.wx[var2].setBounds(313, 345, 207, 105);
            }
         } else if (var2 == 3) {
            this.wx[var2].setBounds(140, 269, 17, 17);
            this.wx[var2].addMouseListener(new MouseListener(0, 0) {
               private int bn;
               private int m;

               public {
                  this.m = var2;
                  this.bn = var3;
               }

               public void mouseExited(MouseEvent var1) {
                  if (this.m == (2 ^ 3) || this.m == (1 ^ 3)) {
                     if (this.bn == 0 || this.bn == (4 ^ 5)) {
                        Class674.this.ve().n(43 & 126);
                        return;
                     }

                     Class674.this.ve().n(45 & 127);
                  }

               }

               public void mouseReleased(MouseEvent var1) {
               }

               public void mouseClicked(MouseEvent var1) {
               }

               public void mousePressed(MouseEvent var1) {
                  if (this.m == 0) {
                     String var4;
                     if (Class674.this.ww.c == 0) {
                        var4 = Agreement.getSendTextAES("TransState", "3");
                        Class674.this.uw().d(var4);
                     } else {
                        var4 = Agreement.getSendTextAES("TransState", "4");
                        Class674.this.uw().d(var4);
                     }
                  } else {
                     if (this.m == (2 ^ 3)) {
                        if (this.bn == 0 || this.bn == --1) {
                           RoleSummoning var3;
                           if ((var3 = Class674.this.ww.a.getPet(this.bn)) == null) {
                              return;
                           } else {
                              Class674.this.ok(Class674.this.vd().getRolePet(var3.getSid().longValue()), var1);
                              return;
                           }
                        }

                        Lingbao var2;
                        if ((var2 = Class674.this.ww.a.getLingbao(this.bn - (5 >> 1))) == null) {
                           return;
                        }

                        Class674.this.fn(var2);
                     }

                  }
               }

               public void mouseEntered(MouseEvent var1) {
                  if (this.m == 3 >> 1 || this.m == --2) {
                     if (this.bn == 0 || this.bn == 5 >> 2) {
                        RoleSummoning var3 = this.m == (2 ^ 3) ? Class674.this.ww.a.getPet(this.bn) : Class674.this.wv.a.getPet(this.bn);
                        if (var3 == null) {
                           return;
                        }

                        ((Class106)Class674.this.ve().e(59 & 110)).amj(var3, (String)null, (List)null, (boolean)(5 >> 3));
                        return;
                     }

                     Lingbao var2 = this.m == 5 >> 2 ? Class674.this.ww.a.getLingbao(this.bn - (1 ^ 3)) : Class674.this.wv.a.getLingbao(this.bn - (1 ^ 3));
                     if (var2 == null) {
                        return;
                     }

                     ((Class73)Class674.this.ve().e(47 & 125)).ge(var2, (boolean)(3 & 4));
                  }

               }
            });
         } else if (var2 == 4) {
            this.wx[var2].setBounds(503, 247, 17, 17);
         } else if (var2 == 5) {
            this.wx[var2].setBounds(270, 258, 34, 59);
         }

         ++var2;
      }

      this.ab = new Class585(this, 6, 4, 51, 51, 0, 0, 216, 34);
      this.ab.hf(Class511.a("sc/d/18.png"));
      this.add(this.ab);
      Class216[] var14 = new Class216[2];
      boolean var12 = true;
      Class216[] var4 = var14;

      int var3;
      for(var10000 = var3 = 0; var10000 < var4.length; var10000 = var3) {
         var4[var3] = new Class216(var3 == 0 ? "sc/e/42.png" : "sc/e/43.png", 1, var3, this);
         var4[var3].setBounds(163 + 21 * var3, 187, 18, 18);
         this.add(var4[var3++]);
      }

      this.xb = new Class521(true, this, 3, 3, 51, 51, 0, 0, 50, 34);
      this.xb.hf(Class511.a("sc/d/18.png"));
      this.xb.aiw(var4, 1);
      this.add(this.xb);
      Class44[] var13 = new Class44[16];
      var10003 = true;
      this.gb = var13;

      for(var10000 = var3 = 0; var10000 < this.gb.length; var10000 = var3) {
         this.gb[var3] = new Class44(this);
         if (var3 < 8) {
            var7 = this;
            this.gb[var3].setBounds(42 + 51 * (var3 % 4), 347 + 51 * (var3 / 4), 51, 51);
         } else {
            var7 = this;
            this.gb[var3].setBounds(314 + 51 * ((var3 - 8) % 4), 347 + 51 * ((var3 - 8) / 4), 51, 51);
         }

         var7.gb[var3].fw("sc/d/18.png");
         this.add(this.gb[var3++]);
      }

   }

   public void eb(BigDecimal var1, String var2) {
      if (this.wv != null) {
         this.wv.b = null;
      }

      int var10000;
      int var3;
      for(var10000 = var3 = 0; var10000 < this.gb.length; var10000 = var3) {
         this.gb[var3].c(3 & 4, (Object)null);
         this.gb[var3++].setVisible((boolean)(2 ^ 3));
      }

      for(var10000 = var3 = 5 >> 3; var10000 < this.xc.length; var10000 = var3) {
         this.xc[var3++].setText((String)null);
      }

      if (this.ww == null) {
         this.ww = (<undefinedtype>)(new Object() {
            private GoodTrans a;
            private BigDecimal b;
            private int c;
            private String d;
            private String e;

            public void e(int var1) {
               this.c = var1;
               if (this.c == 0) {
                  this.e = null;
                  Class674.this.wx[this.b == null ? --3 : 4].fw("sc/e/29.png");
               } else if (this.c == 5 >> 2) {
                  this.e = "未确定";
                  Class674.this.wx[this.b == null ? --3 : 4].fw("sc/e/30.png");
               } else {
                  if (this.c == (1 ^ 3)) {
                     this.e = "已确定";
                     Class674.this.wx[this.b == null ? --3 : 4].fw("sc/e/30.png");
                  }

               }
            }

            protected void g(Graphics var1) {
               if (this.d != null) {
                  var1.setColor(Color.red);
                  var1.drawString(this.d, 10747 & 22333, 16803 & 16254);
                  if (this.a != null) {
                     this.a.a(var1, 3 >> 1);
                  }

                  if (this.e != null) {
                     var1.setColor(Color.RED);
                     var1.drawString(this.e, 16893 & 16347, 2419 & 30638);
                     return;
                  }
               } else {
                  var1.setColor(Color.white);
                  if (this.a != null) {
                     this.a.a(var1, 3 & 4);
                  }

                  if (this.e != null) {
                     var1.setColor(Color.RED);
                     var1.drawString(this.e, 17151 & 15776, 16189 & 16858);
                  }
               }

            }

            public void h(long var1) {
               if (this.b != null) {
                  Class681.j(Class674.this.xc[2 & 5], var1);
               }

            }

            public void i(BigDecimal var1, String var2) {
               int var10003 = 3 >> 2;
               this.b = var1;
               this.d = var2;
               this.a = new GoodTrans();
               this.e(var10003);
               this.h(0L);
            }
         });
      }

      if (this.wv == null) {
         this.wv = (<undefinedtype>)(new Object() {
            private GoodTrans a;
            private BigDecimal b;
            private int c;
            private String d;
            private String e;

            public void e(int var1) {
               this.c = var1;
               if (this.c == 0) {
                  this.e = null;
                  Class674.this.wx[this.b == null ? --3 : 4].fw("sc/e/29.png");
               } else if (this.c == 5 >> 2) {
                  this.e = "未确定";
                  Class674.this.wx[this.b == null ? --3 : 4].fw("sc/e/30.png");
               } else {
                  if (this.c == (1 ^ 3)) {
                     this.e = "已确定";
                     Class674.this.wx[this.b == null ? --3 : 4].fw("sc/e/30.png");
                  }

               }
            }

            protected void g(Graphics var1) {
               if (this.d != null) {
                  var1.setColor(Color.red);
                  var1.drawString(this.d, 10747 & 22333, 16803 & 16254);
                  if (this.a != null) {
                     this.a.a(var1, 3 >> 1);
                  }

                  if (this.e != null) {
                     var1.setColor(Color.RED);
                     var1.drawString(this.e, 16893 & 16347, 2419 & 30638);
                     return;
                  }
               } else {
                  var1.setColor(Color.white);
                  if (this.a != null) {
                     this.a.a(var1, 3 & 4);
                  }

                  if (this.e != null) {
                     var1.setColor(Color.RED);
                     var1.drawString(this.e, 17151 & 15776, 16189 & 16858);
                  }
               }

            }

            public void h(long var1) {
               if (this.b != null) {
                  Class681.j(Class674.this.xc[2 & 5], var1);
               }

            }

            public void i(BigDecimal var1, String var2) {
               int var10003 = 3 >> 2;
               this.b = var1;
               this.d = var2;
               this.a = new GoodTrans();
               this.e(var10003);
               this.h(0L);
            }
         });
      }

      this.ww.i((BigDecimal)null, (String)null);
      this.wv.i(var1, var2);
      this.xd.setText("0");
      FriendBean var4 = this.vd().getFriend(var1.longValue());
      this.wx[--5].fw(var4 != null && var4.getGroup() == --2 ? null : "sc/b/s00.png");
      this.ve().a(this.ae());
   }

   public Long x(long var1, JTextField var3) {
      if (var1 < 0L) {
         return 0L;
      } else {
         long var4 = this.vd().getLoginResult().getGold().longValue();
         return var1 > var4 ? var4 : null;
      }
   }
}
