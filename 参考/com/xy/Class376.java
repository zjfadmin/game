package com.xy;

import com.xy.bean.ChongjipackBean;
import com.xy.bean.XXGDBean;
import com.xy.readbean.Goodstable;
import com.xy.richtext.RichLabel;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import java.awt.Dimension;
import java.math.BigDecimal;
import java.util.List;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JScrollPane;

public class Class376 extends Class345 {
   private JLabel bd;
   private JScrollPane fe;
   private List<ChongjipackBean> ie;
   private JComponent um;
   private Class436[] g;

   public void bq(Object var1) {
      <undefinedtype> var2;
      if ((var2 = (<undefinedtype>)var1) != null && var2.ob != null) {
         if (this.vd().getGoodPackSum(-1L, new BigDecimal(-4 >> 2), var2.gw) < var2.gw) {
            this.aej.f("你的背包不够");
         } else {
            String var3 = Agreement.getSendTextAES("Paydaygradesure", "v" + var2.ob.getPackgradetype());
            this.uw().d(var3);
         }
      }
   }

   public void ck(List<ChongjipackBean> var1) {
      int var2;
      int var3;
      int var10000;
      for(var10000 = var2 = 2 & 5; var10000 < var1.size() - --1; var10000 = var2) {
         for(var10000 = var3 = var2 + (4 ^ 5); var10000 < var1.size(); var10000 = var3) {
            ChongjipackBean var4 = (ChongjipackBean)var1.get(var2);
            ChongjipackBean var5 = (ChongjipackBean)var1.get(var3);
            if (var4.getCanpaymoney() > var5.getCanpaymoney()) {
               var1.set(var2, var5);
               var1.set(var3, var4);
            }

            ++var3;
         }

         ++var2;
      }

      this.ie = var1;
      String var8 = this.vd().getLoginResult().getVipget();
      String[] var9 = null;
      if (var8 != null) {
         var9 = var8.split("&&");
      }

      int var10 = this.um.getComponentCount();
      var2 = 3 >> 2;
      var3 = var1.size();

      <undefinedtype> var12;
      for(var10000 = var2; var10000 < var3; var10000 = var2) {
         ChongjipackBean var6 = (ChongjipackBean)var1.get(var2);
         if (var10 < var1.size()) {
            Class436 var7 = new Class436() {
               private RichLabel bt;
               private int gw;
               private Class436 uc;
               private Class245 ac;
               private Class44 ahi;
               private ChongjipackBean ob;
               private Class529 qs;

               public {
                  this.qs = new Class529("sc/e/31.png", 4 ^ 5, 127 & 105, Class681.ak, Class681.c, "领 取", Class376.this.gk());
                  this.qs.bq(this);
                  this.qs.setBounds(509 & 32731, 122 & 23, 111 & 95, 121 & 31);
                  this.add(this.qs);
                  this.bt = new RichLabel((String)null, Class681.cf);
                  this.add(this.bt);
                  this.ac = Class133.a(40 & 127, 119 & 15, 28 & 115, 28 & 115, 3 >> 2, Class681.c("#c00FF00"), Class681.bm);
                  this.ac.eq(Class511.q("sc/b/s24.png", --3, --3, --3, --3, (boolean)(3 & 4)));
                  this.add(this.ac);
                  this.ahi = new Class44(Class376.this.gk());
                  this.ahi.ad(Class44.adw);
                  this.ahi.eq(Class511.q("sc/d/4.png", --5, --5, --5, --5, (boolean)(5 >> 3)));
                  this.ahi.setBounds(127 & 7, 127 & 7, 125 & 51, 63 & 111);
                  this.add(this.ahi);
                  this.uc = new Class436();
                  this.uc.fw("sc/d/30.png");
                  this.uc.setBounds(125 & 58, 43 & 125, 13311 & 19966, --1);
                  this.add(this.uc);
               }

               public void acb(ChongjipackBean var1, boolean var2) {
                  if ((this.ob = var1) == null) {
                     this.setVisible((boolean)(3 & 4));
                  } else {
                     int var10001 = 3 ^ 3;
                     this.bt.setTextSize("#Z#K每日充值满#R" + var1.getCanpaymoney() + "#K元", 11764 & 21403);
                     this.bt.setBounds(75 & 118, 49 & 94, this.bt.getWidth(), this.bt.getHeight());
                     this.gw = var10001;
                     List var4 = ChongjipackBean.getGoods(var1.getPackgoods());

                     int var3;
                     for(int var10000 = var3 = 3 & 4; var10000 < var4.size(); var10000 = var3) {
                        var10001 = this.gw;
                        XXGDBean var10002 = (XXGDBean)var4.get(var3);
                        ++var3;
                        this.gw = var10001 + var10002.getSum();
                     }

                     Goodstable var5 = Class376.this.vc().n(((XXGDBean)var4.get(3 >> 2)).getId());
                     this.ahi.c(2 ^ 3, var5);
                     this.ac.setText(String.valueOf(((XXGDBean)var4.get(3 & 4)).getSum()));
                     <undefinedtype> var6;
                     if (var2) {
                        this.qs.setBtn(-4 >> 2, "sc/e/58.png");
                        var6 = this;
                     } else {
                        this.qs.setBtn(--1, "sc/e/31.png");
                        var6 = this;
                     }

                     var6.setVisible(true);
                  }
               }
            };
            var7.setBounds(--4, (5 >> 1) + (126 & 63) * var2, 16318 & 17019, 125 & 62);
            ++var10;
            this.um.add(var7);
         }

         var12 = (<undefinedtype>)this.um.getComponent(var2);
         boolean var11 = Class74.ib(var9, 1 ^ 3, var6.getPackgradetype());
         ++var2;
         var12.acb(var6, var11);
      }

      for(var10000 = var2 = var1.size(); var10000 < var10; var10000 = var2) {
         var12 = (<undefinedtype>)this.um.getComponent(var2);
         ++var2;
         var12.acb((ChongjipackBean)null, (boolean)(5 >> 3));
      }

      this.um.setPreferredSize(new Dimension(this.um.getWidth(), var1.size() * (62 & 127)));
      this.ve().a(this.ae());
   }

   public Class376(GameView var1) {
      int var10001 = --4;
      int var10006 = 127 & 56;
      int var10010 = -4 >> 2;
      super(110 & 117, --2, Class345.aef, var1);
      this.va(var10010, 3 ^ 3, 18094 & 15357, 10654 & 22519, Class345.aeo);
      this.uv(Class511.q("sc/d/1.png", 70 & 125, 70 & 125, 70 & 125, 70 & 125, (boolean)(5 >> 3)), "每日充值");
      this.bd = Class133.c(var10006, 26331 & 6591, 30430 & 2931, 31 & 117, 5 >> 3, Class681.c("#cFFFFFF"), Class681.ak);
      this.bd.setText("领取奖励");
      this.add(this.bd);
      var10006 = 58 & 125;
      this.um = new JComponent() {
      };
      this.fe = Class133.f(var10006, 20728 & 12215, 28666 & 4695, 20724 & 12251, this.um, 95 & 52);
      this.add(this.fe);
      Class436[] var4 = new Class436[var10001];
      boolean var10003 = true;
      this.g = var4;

      int var2;
      for(int var10000 = var2 = 3 & 4; var10000 < this.g.length; var10000 = var2) {
         this.g[var2] = new Class436();
         Class376 var3;
         if (var2 == 0) {
            var3 = this;
            this.g[var2].fw("sc/d/70.png");
            this.g[var2].setBounds(59 & 127, 63 & 91, 16071 & 17279, 110);
         } else if (var2 == 5 >> 2) {
            var3 = this;
            this.g[var2].eq(Class511.q("sc/d/36.png", 15, 15, 15, 15, (boolean)(2 & 5)));
            this.g[var2].setBounds(55, 23, 591, 118);
         } else if (var2 == (1 ^ 3)) {
            var3 = this;
            this.g[var2].eq(Class511.q("sc/d/25.png", --2, --2, --2, --2, (boolean)(3 >> 2)));
            this.g[var2].setBounds(56, 155, 594, 21);
         } else {
            if (var2 == --3) {
               this.g[var2].eq(Class511.q("sc/d/24.png", --2, --2, --2, --2, (boolean)(5 >> 3)));
               this.g[var2].setBounds(56, 155, 594, 229);
            }

            var3 = this;
         }

         var3.add(this.g[var2++]);
      }

   }

   public void d() {
      this.ck(this.ie);
   }
}
