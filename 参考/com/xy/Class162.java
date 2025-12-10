package com.xy;

import com.xy.bean.BuyShopBean;
import com.xy.game.HandleOption;
import com.xy.readbean.MoneyType;
import com.xy.readbean.Shop;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import java.awt.Color;
import java.awt.Font;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Class162 extends Class345 {
   private JLabel[] fx;
   private Class44 hs;
   private Class319 ht;
   private int dp;
   private Class245[] hu;
   private Class505 hv;
   private Class556 hw;
   private Class217 hx;
   private Class529 hy;
   private MoneyType hz;
   private Shop ia;
   private Class529[] ib;
   private int cy;
   private Class436[] g;

   public Long x(long var1, JTextField var3) {
      if (var1 > 0L && this.ia != null) {
         long var4;
         if (this.dp == --1) {
            var4 = this.vd().getMoney(this.hz) / this.ia.getShopprice();
            return var1 > var4 ? var4 : null;
         } else {
            var4 = (long)this.vd().getGoodNum(this.ia.getShopiid());
            return var1 > var4 ? var4 : null;
         }
      } else {
         return 0L;
      }
   }

   public void dp(int var1) {
      int var10000 = 5 >> 3;
      this.cy = var1;

      for(var1 = var10000; var10000 < this.ib.length; var10000 = var1) {
         this.ib[var1].setKeep((boolean)(var1 == this.cy ? 3 >> 1 : 0));
         ++var1;
      }

      List var2 = (List)this.vc().bz().getNpcShopMap().get(String.valueOf((7145 & 30623) + this.cy));
      this.hv.ck(var2);
   }

   public void el(String var1, long var2) {
      if (this.ia != null && this.ia.getShopid().equals(var1)) {
         this.ia.setShopprice(var2);
         Class681.j(this.hu[2 & 5], this.ia.getShopprice());
         this.ht.jj().setText(String.valueOf(this.ht.gl()));
      }

   }

   public void z(long var1, JTextField var3) {
      if (this.ia == null) {
         this.hu[2 ^ 3].setText((String)null);
      } else {
         Class681.j(this.hu[3 & 5], this.ia.getShopprice() * var1);
      }
   }

   public Class162(GameView var1) {
      int var10001 = 78 & 55;
      int var10003 = 3 & 4;
      super(-4 >> 2, -4 >> 2, Class345.aei, var1);
      this.va(var10003, 3 >> 2, 17022 & 16367, 22015 & 11214, Class345.aei);
      Class529[] var8 = new Class529[var10001];
      boolean var15 = true;
      this.ib = var8;

      int var2;
      int var10000;
      for(var10000 = var2 = 3 ^ 3; var10000 < this.ib.length; var10000 = var2) {
         Class529[] var7 = this.ib;
         Class529 var10002 = new Class529;
         int var10005 = 5 >> 1;
         int var10006 = (815 & 32253) + var2;
         Font var10007 = Class681.cw;
         String var10009;
         Class162 var10010;
         if (var2 == 0) {
            var10009 = "畜牧";
            var10010 = this;
         } else if (var2 == 3 >> 1) {
            var10009 = "种植";
            var10010 = this;
         } else if (var2 == --2) {
            var10009 = "采矿";
            var10010 = this;
         } else if (var2 == --3) {
            var10009 = "家具";
            var10010 = this;
         } else if (var2 == --4) {
            var10009 = "制药";
            var10010 = this;
         } else if (var2 == --5) {
            var10009 = "符文";
            var10010 = this;
         } else {
            var10009 = "";
            var10010 = this;
         }

         var10002.<init>("sc/e/39.png", var10005, var10006, var10007, (Color[])null, var10009, var10010);
         var7[var2] = var10002;
         this.ib[var2].setOffsetTexts(Class681.cl);
         this.ib[var2].setBounds((63 & 122) + (117 & 75) * var2, 53 & 127, 127 & 63, 59 & 92);
         this.add(this.ib[var2++]);
      }

      var10001 = --4;
      this.hy = new Class529("sc/e/31.png", --1, 3571 & 29503, Class681.ak, (Color[])null, "购 买", this);
      this.hy.setBounds(21503 & 11770, 6517 & 26623, 111 & 95, 25 & 127);
      this.hy.setForeground(Color.black);
      this.add(this.hy);
      JLabel[] var9 = new JLabel[var10001];
      var15 = true;
      this.fx = var9;

      for(var10000 = var2 = 3 ^ 3; var10000 < this.fx.length; var10000 = var2) {
         this.fx[var2] = Class133.b(24574 & 8665, (90 & 125) + 61 * var2, 58, 19, Color.black, Class681.ak);
         this.fx[var2].setText(var2 == 0 ? "单  价" : (var2 == (4 ^ 5) ? "总  额" : (var2 == (1 ^ 3) ? "数量" : (var2 == --3 ? "现 金" : ""))));
         this.fx[var2].setHorizontalAlignment(10);
         this.add(this.fx[var2]);
         if (var2 == 5 >> 1) {
            this.fx[var2].setBounds(485, 345, 36, 19);
         }

         if (var2 == --3) {
            this.fx[var2].setBounds(58, 410, 58, 19);
         }

         ++var2;
      }

      Class245[] var10 = new Class245[--3];
      var15 = true;
      this.hu = var10;

      for(var10000 = var2 = 3 & 4; var10000 < this.hu.length; var10000 = var2) {
         this.hu[var2] = Class133.a(472, 111 + 61 * var2, 114, 19, 10, Color.white, Class681.q);
         if (var2 == --2) {
            this.hu[var2].setBounds(397, 407, 55, 19);
            this.hu[var2].setHorizontalAlignment(3 ^ 3);
         }

         this.hu[var2].eq(Class511.q("sc/d/17.png", 6, 6, 6, 6, (boolean)(2 & 5)));
         this.add(this.hu[var2++]);
      }

      Class217 var5 = Class133.n(Class511.q("sc/d/17.png", 6, 6, 6, 6, (boolean)(2 & 5)), Class681.q, Color.white);
      var5.setBounds(526, 345, 60, 19);
      var5.setHorizontalAlignment(10);
      this.ht = new Class319(15, var5, this);
      this.hz = new MoneyType();
      this.hz.setIdAndKey(3 & 5, "现 金");
      this.hw = Class133.m(109, 410, 169, 19, 10, Color.white, Class681.q, this.hz, var1);
      this.hw.eq(Class511.q("sc/d/17.png", 6, 6, 6, 6, (boolean)(5 >> 3)));
      this.hw.ab(--2);
      this.add(var5);
      this.add(this.hw);
      this.hs = new Class44(this);
      this.hs.setBounds(530, 284, 50, 50);
      this.add(this.hs);
      Class436[] var12 = new Class436[--3];
      var15 = true;
      this.g = var12;

      int var4;
      for(var10000 = var4 = 3 >> 2; var10000 < this.g.length; var10000 = var4) {
         this.g[var4] = new Class436();
         this.add(this.g[var4]);
         if (var4 == 0) {
            this.g[var4].fw("sc/d/4.png");
            this.g[var4].setBounds(526, 280, 59, 57);
         } else if (var4 != 3 >> 1) {
            if (var4 == 2) {
               this.g[var4].eq(Class511.q("sc/d/36.png", 16, 16, 16, 16, false));
               this.g[var4].setBounds(45, 77, 549, 360);
            }
         } else {
            var10000 = 1 ^ 3;
            this.g[var4].eq(Class511.q("sc/d/19.png", 5, 5, 5, 5, (boolean)(3 & 4)));
            this.g[var4].setBounds(58, 90, 411, 309);
            Class216[] var13 = new Class216[var10000];
            boolean var14 = true;
            Class216[] var6 = var13;

            int var3;
            for(var10000 = var3 = 2 & 5; var10000 < var6.length; var10000 = var3) {
               var6[var3] = new Class216(var3 == 0 ? "sc/e/42.png" : "sc/e/43.png", 1, var3, this);
               Class162 var16;
               if (var3 == 0) {
                  var16 = this;
                  var6[var3].setBounds(378, 408, 18, 18);
               } else {
                  if (var3 == 5 >> 2) {
                     var6[var3].setBounds(453, 408, 18, 18);
                  }

                  var16 = this;
               }

               var16.add(var6[var3++]);
            }

            this.hv = new Class505(this, 8, 6, 51, 51, 3 & 4, 3 & 4, 59, 92);
            this.hv.hf(Class511.a("sc/d/18.png"));
            this.hv.aix(var6, --1);
            this.hv.ak(true);
            this.add(this.hv);
            this.hv.aiz().k(this.hu[2]);
         }

         ++var4;
      }

   }

   public void as(int var1) {
      if (var1 == (23423 & 9651)) {
         if (this.aej.t()) {
            return;
         }

         if (this.ve().m(95 & 46) != null) {
            this.aej.f("交易时不能操作");
            return;
         }

         Shop var4;
         if ((var4 = this.ia) == null) {
            this.aej.f("没有选中的物品");
            return;
         }

         int var2;
         if ((var2 = (int)this.ht.gl()) <= 0) {
            this.aej.f("你输入数量为零");
            return;
         }

         Class162 var10000;
         if (this.dp == 3 >> 1) {
            BuyShopBean var3 = new BuyShopBean();
            var10000 = this;
            var3.setAte(5 >> 2);
            HandleOption.b(var3, var4, var2, this.hz, this.aej);
         } else {
            StringBuffer var7;
            (var7 = new StringBuffer()).append(var4.getShopid());
            String var5 = this.vd().getGoodNum(var4.getShopiid(), var7, var2);
            if (var5 != null) {
               this.aej.f(var5);
               return;
            }

            BuyShopBean var6 = new BuyShopBean();
            var6.setAte(47 & 91);
            var6.setCd(var7.toString());
            var5 = Agreement.getSendTextAES("nbuy", Class695.b().toJson(var6));
            var10000 = this;
            this.aej.getClient().d(var5);
         }

         var10000.hx.setText("0");
      }

   }

   public void em(Shop var1, boolean var2) {
      long var3;
      long var5;
      if (this.ia != null && this.ia == var1) {
         if (this.dp == --1) {
            var3 = this.ht.gl() + (long)(var2 ? 99 & 127 : 1);
            this.ht.jj().setText(String.valueOf(var3));
         } else {
            var3 = (long)this.vd().getGoodNum(this.ia.getShopiid());
            var5 = var2 ? var3 : this.ht.gl() + 1L;
            this.ht.jj().setText(String.valueOf(var5));
         }
      } else {
         this.ia = var1;
         if (this.ia == null) {
            this.hs.c(3 >> 2, (Object)null);
            this.hu[3 >> 2].setText((String)null);
            this.ht.jj().setText("0");
         } else {
            this.hs.c(93 & 47, var1);
            Class681.j(this.hu[3 ^ 3], this.ia.getShopprice());
            if (this.dp == (4 ^ 5)) {
               int var7 = var2 ? 103 & 123 : 1;
               this.ht.jj().setText(String.valueOf(var7));
            } else {
               var3 = (long)this.vd().getGoodNum(this.ia.getShopiid());
               var5 = var2 ? var3 : 1L;
               this.ht.jj().setText(String.valueOf(var5));
            }
         }
      }
   }

   public boolean aa(long var1, JTextField var3) {
      return (boolean)(--1);
   }

   public void y(int var1) {
      this.hw.cc();
      this.hy.setText(var1 == --1 ? "购买" : "出售");
      int var10001 = 3 ^ 3;
      this.em((Shop)null, (boolean)(3 >> 2));
      this.dp = var1;
      this.dp(var10001);
   }
}
