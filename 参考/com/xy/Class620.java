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

public class Class620 extends Class345 {
   private JComponent id;
   private JScrollPane fe;
   private List<ChongjipackBean> ie;
   private Class436[] an;
   private JLabel ax;

   public void d() {
      this.ck(this.ie);
   }

   public void bq(Object var1) {
      <undefinedtype> var2;
      if ((var2 = (<undefinedtype>)var1) != null && var2.amv != null) {
         if (this.vd().getGoodPackSum(-1L, new BigDecimal(-4 >> 2), var2.fk) < var2.fk) {
            this.aej.f("你的背包不够");
         } else {
            String var3 = Agreement.getSendTextAES("Dayforweekgradesure", "v" + var2.amv.getPackgradetype());
            this.uw().d(var3);
         }
      }
   }

   public Class620(GameView var1) {
      int var10001 = --4;
      int var10006 = 124 & 59;
      int var10010 = -4 >> 2;
      super(125 & 103, 1 ^ 3, Class345.aef, var1);
      this.va(var10010, 3 & 4, 16126 & 17325, 17310 & 15863, Class345.aeo);
      this.uv(Class511.q("sc/d/1.png", 119 & 76, 119 & 76, 119 & 76, 119 & 76, (boolean)(3 >> 2)), "连续充值");
      this.ax = Class133.c(var10006, 21147 & 11775, 14974 & 18387, 119 & 29, 5 >> 3, Class681.c("#cFFFFFF"), Class681.ak);
      this.ax.setText("领取奖励");
      this.add(this.ax);
      var10006 = 62 & 121;
      this.id = new JComponent() {
      };
      this.fe = Class133.f(var10006, 31217 & 1726, 7903 & 25458, 25854 & 7121, this.id, 127 & 20);
      this.add(this.fe);
      Class436[] var4 = new Class436[var10001];
      boolean var10003 = true;
      this.an = var4;

      int var2;
      for(int var10000 = var2 = 2 & 5; var10000 < this.an.length; var10000 = var2) {
         this.an[var2] = new Class436();
         Class620 var3;
         if (var2 == 0) {
            var3 = this;
            this.an[var2].fw("sc/d/70.png");
            this.an[var2].setBounds(59 & 127, 31 & 123, 30311 & 3039, 110);
         } else if (var2 == (2 ^ 3)) {
            var3 = this;
            this.an[var2].eq(Class511.q("sc/d/36.png", 15, 15, 15, 15, (boolean)(5 >> 3)));
            this.an[var2].setBounds(55, 23, 591, 118);
         } else if (var2 == --2) {
            var3 = this;
            this.an[var2].eq(Class511.q("sc/d/25.png", 1 ^ 3, 1 ^ 3, 1 ^ 3, 1 ^ 3, (boolean)(3 & 4)));
            this.an[var2].setBounds(56, 155, 594, 21);
         } else {
            if (var2 == --3) {
               this.an[var2].eq(Class511.q("sc/d/24.png", 5 >> 1, 5 >> 1, 5 >> 1, 5 >> 1, (boolean)(3 >> 2)));
               this.an[var2].setBounds(56, 155, 594, 229);
            }

            var3 = this;
         }

         var3.add(this.an[var2++]);
      }

   }

   public void ck(List<ChongjipackBean> var1) {
      int var2;
      int var3;
      int var10000;
      for(var10000 = var2 = 3 & 4; var10000 < var1.size() - (5 >> 2); var10000 = var2) {
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

      int var10 = this.id.getComponentCount();
      var2 = 3 ^ 3;
      var3 = var1.size();

      <undefinedtype> var12;
      for(var10000 = var2; var10000 < var3; var10000 = var2) {
         ChongjipackBean var6 = (ChongjipackBean)var1.get(var2);
         if (var10 < var1.size()) {
            Class436 var7 = new Class436() {
               private RichLabel z;
               private int fk;
               private ChongjipackBean amv;
               private Class44[] amw;
               private Class529 qr;
               private Class245[] ail;

               public {
                  int var10001 = --5;
                  this.qr = new Class529("sc/e/31.png", 3 >> 1, 127 & 121, Class681.ak, Class681.c, "领 取", Class620.this.gk());
                  this.qr.bq(this);
                  this.qr.setBounds(17405 & 15835, 118 & 27, 95 & 111, 59 & 93);
                  this.add(this.qr);
                  this.z = new RichLabel((String)null, Class681.cf);
                  this.add(this.z);
                  Class245[] var3 = new Class245[var10001];
                  boolean var10003 = true;
                  this.ail = var3;

                  int var10000;
                  int var2;
                  for(var10000 = var2 = 3 & 4; var10000 < this.ail.length; var10000 = var2) {
                     this.ail[var2] = Class133.a((45 & 122) + var2 * (54 & 125), 63 & 71, 89 & 54, 89 & 54, 3 >> 2, Class681.c("#c00FF00"), Class681.bm);
                     this.ail[var2].eq(Class511.q("sc/b/s24.png", --3, --3, --3, --3, (boolean)(3 >> 2)));
                     this.add(this.ail[var2++]);
                  }

                  Class44[] var4 = new Class44[--5];
                  var10003 = true;
                  this.amw = var4;

                  for(var10000 = var2 = 2 & 5; var10000 < this.amw.length; var10000 = var2) {
                     this.amw[var2] = new Class44(Class620.this.gk());
                     this.amw[var2].ad(Class44.adw);
                     this.amw[var2].eq(Class511.q("sc/d/4.png", --5, --5, --5, --5, (boolean)(2 & 5)));
                     this.amw[var2].setBounds((47 & 87) + var2 * (118 & 61), 47 & 87, 127 & 49, 47 & 127);
                     this.add(this.amw[var2++]);
                  }

               }

               public void acb(ChongjipackBean var1, boolean var2) {
                  if ((this.amv = var1) == null) {
                     this.setVisible((boolean)(2 & 5));
                  } else {
                     int var10001 = 2 & 5;
                     this.z.setTextSize("#Z#K连续充值#R" + this.amv.getPackgradetype() + "#K天", 17298 & 15869);
                     this.z.setBounds(9564 & 23483, 24 & 119, this.z.getWidth(), this.z.getHeight());
                     this.fk = var10001;
                     List var6 = ChongjipackBean.getGoods(var1.getPackgoods());

                     int var10000;
                     int var3;
                     for(var10000 = var3 = 3 >> 2; var10000 < var6.size(); var10000 = var3) {
                        var10001 = this.fk;
                        XXGDBean var10002 = (XXGDBean)var6.get(var3);
                        ++var3;
                        this.fk = var10001 + var10002.getSum();
                     }

                     for(var10000 = var3 = 3 & 4; var10000 < this.ail.length; var10000 = var3) {
                        XXGDBean var4 = var3 < var6.size() ? (XXGDBean)var6.get(var3) : null;
                        if (var4 == null) {
                           this.amw[var3].c(3 & 4, (Object)null);
                           this.amw[var3].setVisible((boolean)(4 ^ 5));
                           this.ail[var3].setVisible((boolean)(5 >> 3));
                        } else {
                           Goodstable var5 = Class620.this.vc().n(var4.getId());
                           this.amw[var3].c(--1, var5);
                           this.ail[var3].setText(String.valueOf(var4.getSum()));
                        }

                        ++var3;
                     }

                     <undefinedtype> var7;
                     if (var2) {
                        this.qr.setBtn(-4 >> 2, "sc/e/58.png");
                        var7 = this;
                     } else {
                        this.qr.setBtn(--1, "sc/e/31.png");
                        var7 = this;
                     }

                     var7.setVisible(true);
                  }
               }
            };
            var7.setBounds(--4, (5 >> 1) + (63 & 126) * var2, 28607 & 4730, 126 & 61);
            ++var10;
            this.id.add(var7);
         }

         var12 = (<undefinedtype>)this.id.getComponent(var2);
         boolean var11 = Class74.ib(var9, --3, var6.getPackgradetype());
         ++var2;
         var12.acb(var6, var11);
      }

      for(var10000 = var2 = var1.size(); var10000 < var10; var10000 = var2) {
         var12 = (<undefinedtype>)this.id.getComponent(var2);
         ++var2;
         var12.acb((ChongjipackBean)null, (boolean)(2 & 5));
      }

      this.id.setPreferredSize(new Dimension(this.id.getWidth(), var1.size() * (127 & 62)));
      this.ve().a(this.ae());
   }
}
