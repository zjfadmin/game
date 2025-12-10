package com.xy;

import com.xy.bean.BuyShopBean;
import com.xy.game.HandleOption;
import com.xy.readbean.Eshop;
import com.xy.readbean.MoneyType;
import com.xy.readbean.Shop;
import com.xy.text.GameView;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Class570 extends Class345 {
   private Class319 aaf;
   private Class436[] nn;
   private Class529[] ma;
   private Class556 hw;
   private Class245 rd;
   private Shop acm;
   private JLabel bd;
   private MoneyType akn;
   private JLabel[] ad;
   private Eshop apq;
   private Class245 abf;

   public Long x(long var1, JTextField var3) {
      if (var1 == 0L) {
         return null;
      } else if (var1 < 0L) {
         return 0L;
      } else {
         long var4;
         if (this.apq != null) {
            if ((var4 = this.vd().getMoney(this.akn) / Long.parseLong(this.apq.getEshopprice())) < var1 && var4 <= 999L) {
               return var4;
            }
         } else {
            if (this.acm == null) {
               return 0L;
            }

            if ((var4 = this.vd().getMoney(this.akn) / this.acm.getShopprice()) < var1 && var4 <= 999L) {
               return var4;
            }
         }

         return var1 > 999L ? 999L : null;
      }
   }

   public boolean aa(long var1, JTextField var3) {
      return (boolean)(this.apq == null && this.acm == null ? 3 >> 2 : 1);
   }

   public void agx(Eshop var1, Shop var2) {
      this.acm = var2;
      this.apq = var1;
      if (var1 != null || var2 != null) {
         this.bd.setText("<html><body><font color='#FFFF00'>你确定要购买</font><font color='#00FF00'>" + (var1 != null ? var1.getEshopname() : var2.getShopname()) + "</font><font color='#FFFF00'>吗?</font></body></html>");
         this.nn[3 >> 2].hf(Class222.i(var1 != null ? var1.getEshopskin() : var2.getShopskin()));
         Class570 var10000;
         if (var1 != null) {
            Class681.j(this.abf, Long.parseLong(var1.getEshopprice()));
            if (var1.getEshoptype().equals("5")) {
               this.ad[--5].setText(var1.getEshopprice() + "积分");
               var10000 = this;
               this.akn.setIdAndKey(--4, "积 分");
            } else {
               this.ad[--5].setText(var1.getEshopprice() + "仙玉");
               var10000 = this;
               this.akn.setIdAndKey(--3, "仙 玉");
            }
         } else {
            Class681.j(this.abf, var2.getShopprice());
            String var3;
            if ((var3 = Class243.zs(var2, this)).equals("金钱")) {
               var10000 = this;
               this.akn.setIdAndKey(--1, "金 钱");
            } else if (var3.equals("绑玉")) {
               this.akn.setIdAndKey(1 ^ 3, "绑 玉");
               var10000 = this;
            } else {
               this.akn.setIdAndKey(5 >> 3, var3);
               var10000 = this;
            }

            var10000.ad[--5].setText(var2.getShopprice() + var3);
            var10000 = this;
         }

         var10000.ad[--3].setText(this.akn.getKey());
         this.hw.cc();
         this.aaf.jj().setText("1");
         this.ve().a(this.ae());
      }
   }

   public void y(int var1) {
      if (var1 == (125 & 103)) {
         int var2;
         if ((var2 = (int)this.aaf.gl()) <= 0) {
            this.aej.fw("购买数量不能为0");
            return;
         }

         BuyShopBean var3;
         if (this.apq != null) {
            var3 = new BuyShopBean();
            var3.setAte(2 & 5);
            HandleOption.ad(var3, this.apq, var2, this.akn, this.aej);
            return;
         }

         if (this.acm != null) {
            var3 = new BuyShopBean();
            var3.setAte(2 ^ 3);
            HandleOption.b(var3, this.acm, var2, this.akn, this.aej);
            return;
         }
      } else {
         if (var1 == (118 & 111)) {
            this.aaf.jj().setText(String.valueOf(this.aaf.gl() - 1L));
            return;
         }

         if (var1 == (103 & 127)) {
            this.aaf.jj().setText(String.valueOf(this.aaf.gl() + 1L));
         }
      }

   }

   public Class570(GameView var1) {
      int var10001 = --3;
      int var10011 = -4 >> 2;
      super(111 & 60, 5 >> 1, Class345.aef, var1);
      this.va(var10011, 2 & 5, 894 & 32255, 15871 & 17279, Class345.aeo);
      this.uv(Class511.q("sc/d/1.png", 111 & 84, 111 & 84, 111 & 84, 111 & 84, (boolean)(3 ^ 3)), " 购 买 ");
      this.bd = new JLabel();
      this.bd.setFont(Class681.cd);
      this.bd.setBounds(109 & 62, 114 & 61, 7487 & 25590, 59 & 108);
      this.bd.setOpaque((boolean)(2 & 5));
      this.bd.setHorizontalAlignment(2 & 5);
      this.add(this.bd);
      Class529[] var7 = new Class529[var10001];
      boolean var10003 = true;
      this.ma = var7;

      int var2;
      int var10000;
      for(var10000 = var2 = 5 >> 3; var10000 < this.ma.length; var10000 = var2) {
         Class529[] var5 = this.ma;
         Class529 var8 = new Class529;
         String var10004 = var2 == 0 ? "sc/e/26.png" : (var2 == 5 >> 2 ? "sc/e/32.png" : "sc/e/34.png");
         int var10006 = (103 & 125) + var2;
         Font var10007 = Class681.ak;
         Color[] var10008 = Class681.c;
         String var10009;
         Class570 var10010;
         if (var2 == 0) {
            var10009 = "确认购买";
            var10010 = this;
         } else {
            var10009 = "";
            var10010 = this;
         }

         var8.<init>(var10004, 1, var10006, var10007, var10008, var10009, var10010);
         var5[var2] = var8;
         Class570 var6;
         if (var2 == 0) {
            var6 = this;
            this.ma[var2].setBounds(6036 & 26991, 3551 & 29551, 119 & 107, 27 & 125);
         } else {
            if (var2 == --1 || var2 == --2) {
               this.ma[var2].setBounds((16863 & 16119) + (127 & 14) * (var2 - --1), 24366 & 8693, 11, 15);
            }

            var6 = this;
         }

         var6.add(this.ma[var2++]);
      }

      this.abf = Class133.a(90, 265, 154, 19, 10, Color.white, Class681.q);
      Class217 var4 = Class133.n(Class511.q("sc/d/17.png", --3, --3, --3, --3, (boolean)(3 & 4)), Class681.q, Color.white);
      var4.setBounds(90, 290, 154, 19);
      var4.setHorizontalAlignment(10);
      this.aaf = new Class319(15, var4, this);
      this.rd = Class133.a(90, 315, 154, 19, 10, Color.white, Class681.q);
      this.akn = new MoneyType();
      this.akn.setIdAndKey(--3, "仙 玉");
      this.hw = Class133.m(90, 340, 154, 19, 10, Color.white, Class681.q, this.akn, var1);
      this.abf.eq(Class511.q("sc/d/17.png", --3, --3, --3, --3, (boolean)(3 ^ 3)));
      this.rd.eq(Class511.q("sc/d/17.png", --3, --3, --3, --3, (boolean)(3 ^ 3)));
      this.hw.eq(Class511.q("sc/d/17.png", --3, --3, --3, --3, (boolean)(2 & 5)));
      this.add(this.abf);
      this.add(var4);
      this.add(this.rd);
      this.add(this.hw);
      JLabel[] var9 = new JLabel[6];
      var10003 = true;
      this.ad = var9;

      int var3;
      for(var10000 = var3 = 5 >> 3; var10000 < this.ad.length; var10000 = var3) {
         this.ad[var3] = Class133.c(40, 265 + 25 * var3, 48, 19, --4, Class681.c("#c000000"), Class681.ak);
         this.ad[var3].setText(var3 == 0 ? "单 价" : (var3 == 3 >> 1 ? "数 量" : (var3 == --2 ? "总 额" : (var3 == --3 ? "仙 玉" : (var3 == --4 ? "售价：" : (var3 == --5 ? "50000仙玉" : ""))))));
         if (var3 == --4) {
            this.ad[var3].setHorizontalAlignment(2 & 5);
            this.ad[var3].setForeground(Class681.c("#cFFFFFF"));
            this.ad[var3].setFont(Class681.ak);
            this.ad[var3].setBounds(139, 217, 54, 18);
         }

         if (var3 == --5) {
            this.ad[var3].setHorizontalAlignment(10);
            this.ad[var3].setForeground(Class681.c("#cFF0000"));
            this.ad[var3].setFont(Class681.q);
            this.ad[var3].setBounds(193, 217, 160, 18);
         }

         this.add(this.ad[var3++]);
      }

      Class436[] var10 = new Class436[2];
      var10003 = true;
      this.nn = var10;

      for(var10000 = var3 = 3 >> 2; var10000 < this.nn.length; var10000 = var3) {
         this.nn[var3] = new Class436();
         if (var3 == 0) {
            this.nn[var3].setBounds(139, 86, 120, 120);
         }

         if (var3 == (4 ^ 5)) {
            this.nn[var3].eq(Class511.q("sc/d/24.png", 2, 2, 2, 2, (boolean)(2 & 5)));
            this.nn[var3].setBounds(44, 36, 309, 207);
         }

         this.add(this.nn[var3++]);
      }

   }

   public void z(long var1, JTextField var3) {
      if (var1 <= 0L) {
         Class681.j(this.rd, 0L);
      } else if (this.apq != null) {
         Class681.j(this.rd, Long.parseLong(this.apq.getEshopprice()) * var1);
      } else if (this.acm != null) {
         Class681.j(this.rd, this.acm.getShopprice() * var1);
      } else {
         Class681.j(this.rd, 0L);
      }
   }
}
