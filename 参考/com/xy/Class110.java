package com.xy;

import com.xy.bean.BuyShopBean;
import com.xy.game.HandleOption;
import com.xy.game.RoleData;
import com.xy.readbean.MoneyType;
import com.xy.readbean.Shop;
import com.xy.text.GameView;
import java.awt.Color;
import java.awt.Graphics;
import java.math.BigDecimal;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Class110 extends Class345 {
   private Class319 uh;
   private Class529 ui;
   private MoneyType rr;
   private JLabel[] c;
   private Shop ia;
   private Class436[] e;
   private Class505 uj;
   private BigDecimal py;

   public void p() {
      if (this.ia == null) {
         this.aej.fw("没有选中的商品");
      } else {
         int var1;
         if ((var1 = (int)this.uh.gl()) <= 0) {
            this.aej.fw("购买数量不能为0");
         } else {
            BuyShopBean var2 = new BuyShopBean();
            var2.setAte(--1);
            HandleOption.b(var2, this.ia, var1, this.rr, this.aej);
         }
      }
   }

   public void em(Shop var1, boolean var2) {
      if (this.ia != null && this.ia == var1) {
         long var5 = this.uh.gl() + (long)(var2 ? 119 & 107 : 1);
         this.uh.jj().setText(String.valueOf(var5));
      } else {
         this.ia = var1;
         if (this.ia == null) {
            this.e[3 & 5].q();
            this.py = new BigDecimal(3 & 4);
            this.uh.jj().setText("0");
         } else {
            int var3 = var2 ? 99 & 127 : 1;
            this.e[4 ^ 5].hf(Class222.i(this.ia.getShopskin()));
            this.uh.jj().setText(String.valueOf(var3));
         }
      }
   }

   public void s() {
      this.ia = null;
      this.e[2 ^ 3].q();
      this.py = new BigDecimal(5 >> 3);
      this.uh.jj().setText("0");
   }

   public void y(int var1) {
      this.s();
      List var2 = (List)this.vc().bz().getNpcShopMap().get(String.valueOf(var1));
      this.uj.ck(var2);
      Class110 var10000;
      if (var1 == (16383 & 16984)) {
         var10000 = this;
         this.rr.setIdAndKey(3 & 4, "比斗奖章");
      } else if (var1 == (11997 & 21371)) {
         var10000 = this;
         this.rr.setIdAndKey(2 & 5, "星芒");
      } else {
         if (var1 != (10878 & 22491)) {
            return;
         }

         var10000 = this;
         this.rr.setIdAndKey(3 & 4, "缘念积分");
      }

      var10000.ve().a(this.ae());
   }

   public void z(long var1, JTextField var3) {
      Class110 var10000;
      if (var1 <= 0L) {
         this.py = new BigDecimal(3 >> 2);
         var10000 = this;
      } else if (this.ia != null) {
         this.py = new BigDecimal(this.ia.getShopprice() * var1);
         var10000 = this;
      } else {
         this.py = new BigDecimal(3 & 4);
         var10000 = this;
      }

      var10000.d();
   }

   protected void paintComponent(Graphics var1) {
      super.paintComponent(var1);
      if (this.aej.bl()) {
         this.d();
      }

   }

   public Class110(GameView var1) {
      int var10001 = --4;
      int var10008 = -4 >> 2;
      super(93 & 126, 5 >> 1, Class345.aef, var1);
      this.va(var10008, 3 & 4, 18942 & 14207, 4981 & 28111, Class345.aeo);
      this.uv(Class511.q("sc/d/1.png", 70 & 125, 70 & 125, 70 & 125, 70 & 125, (boolean)(2 & 5)), "兑换");
      this.ui = new Class529("sc/e/31.png", 4 ^ 5, 127 & 104, Class681.ak, Class681.c, "兑 换", this);
      this.ui.setBounds(14308 & 18623, 20735 & 12287, 95 & 111, 63 & 89);
      this.add(this.ui);
      JLabel[] var5 = new JLabel[var10001];
      boolean var10003 = true;
      this.c = var5;

      int var10000;
      int var2;
      for(var10000 = var2 = 2 & 5; var10000 < this.c.length; var10000 = var2) {
         this.c[var2] = Class133.c(63 & 109, 95 & 55, 115 & 126, 31 & 115, 15 & 122, Class681.c("#c000000"), Class681.ak);
         this.c[var2].setText(var2 == 0 ? "可兑换物品" : (var2 == (3 & 5) ? "数量" : (var2 == 5 >> 1 ? "消耗" : (var2 == --3 ? "星芒：30/50" : ""))));
         this.add(this.c[var2]);
         if (var2 == (2 ^ 3) || var2 == 5 >> 1) {
            this.c[var2].setBounds(6063 & 26869, (3769 & 29174) + 24 * (var2 - (5 >> 2)), 36, 19);
         }

         if (var2 == --3) {
            this.c[var2].setFont(Class681.ab);
            this.c[var2].setBounds(208 + 39 * (var2 - --3), 200, 200, 21);
         }

         ++var2;
      }

      Class217 var3 = Class133.n(Class511.q("sc/d/17.png", 6, 6, 6, 6, (boolean)(3 & 4)), Class681.q, Color.white);
      var3.setBounds(208, 176, 54, 19);
      var3.setHorizontalAlignment(10);
      this.uh = new Class319(15, var3, this);
      this.add(var3);
      Class436[] var6 = new Class436[--4];
      var10003 = true;
      this.e = var6;

      for(var10000 = var2 = 3 >> 2; var10000 < this.e.length; var10000 = var2) {
         this.e[var2] = new Class436();
         Class110 var4;
         if (var2 == 0) {
            var4 = this;
            this.e[var2].eq(Class511.q("sc/d/19.png", --5, --5, --5, --5, (boolean)(3 ^ 3)));
            this.e[var2].setBounds(44, 43, 309, 105);
         } else if (var2 == (4 ^ 5)) {
            var4 = this;
            this.e[var2].setBounds(86, 172, 50, 50);
         } else if (var2 == (1 ^ 3)) {
            var4 = this;
            this.e[var2].fw("sc/d/4.png");
            this.e[var2].setBounds(82, 168, 59, 57);
         } else {
            if (var2 == --3) {
               this.e[var2].eq(Class511.q("sc/d/36.png", 20, 20, 20, 20, (boolean)(3 >> 2)));
               this.e[var2].setBounds(44, 148, 310, 150);
            }

            var4 = this;
         }

         var4.add(this.e[var2++]);
      }

      this.uj = new Class505(this, 6, 1 ^ 3, 51, 51, 2 & 5, 2 & 5, 45, 45);
      this.uj.hf(Class511.a("sc/d/18.png"));
      this.uj.ak((boolean)(3 >> 1));
      this.add(this.uj);
      this.rr = new MoneyType();
   }

   public boolean aa(long var1, JTextField var3) {
      return (boolean)(this.ia != null ? --1 : 0);
   }

   public void d() {
      RoleData var1 = this.vd();
      if (this.ia == null) {
         this.c[--3].setText((String)null);
      } else {
         this.c[--3].setText(this.rr.getKey() + "：" + this.py.longValue() + "/" + var1.getMoney(this.rr));
      }
   }

   public Long x(long var1, JTextField var3) {
      if (var1 == 0L) {
         return null;
      } else if (var1 >= 0L && this.ia != null) {
         long var4 = this.vd().getMoney(this.rr) / this.ia.getShopprice();
         if ((var4 = Math.max(1L, var4)) < var1 && var4 <= 999L) {
            return var4;
         } else {
            return var1 > 999L ? 999L : null;
         }
      } else {
         return 0L;
      }
   }
}
