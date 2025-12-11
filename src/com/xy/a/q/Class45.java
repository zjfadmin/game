package com.xy.a.q;

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

public class Class45 extends com.xy.q.Class30 {
   private com.xy.i.Class19 jv;
   private com.xy.w.Class18[] sk;
   private com.xy.q.Class29 aak;
   private com.xy.q.Class27 aal;
   private Shop uv;
   private BigDecimal bn;
   private JLabel[] o;
   private MoneyType ca;

   public void e() {
      RoleData var1 = this.yx();
      if (this.uv == null) {
         this.o[3].setText(null);
      } else {
         JLabel var10000 = this.o[3];
         StringBuilder var10001 = new StringBuilder(String.valueOf(this.ca.getKey()));
         String var10002 = "］";
         var10001 = var10001.append("：").append(this.bn.longValue());
         var10002 = "\u0000";
         var10000.setText(var10001.append("/").append(var1.getMoney(this.ca)).toString());
      }
   }

   public void ds(long var1, JTextField var3) {
      Class45 var10000;
      if (var1 <= 0L) {
         var10000 = this;
         this.bn = new BigDecimal(0);
      } else if (this.uv != null) {
         var10000 = this;
         this.bn = new BigDecimal(this.uv.getShopprice() * var1);
      } else {
         var10000 = this;
         this.bn = new BigDecimal(0);
      }

      var10000.e();
   }

   public Class45(GameView var1) {
      super(92, 2, com.xy.q.Class30.afz, var1);
      String var10006 = "\u0019DECE\u0016DW\u0004@";
      this.yy(-1, 0, 382, 325, com.xy.q.Class30.agh);
      com.xy.w.Class9 var18 = com.xy.w.Class16.m("sc/d/1.png", 68, 68, 68, 68, false);
      String var10007 = "儉捍";
      this.yu(var18, "兑换");
      String var10008 = "T\t\b\u000f\bY\u0016DW\u0004@";
      String var10013 = "兾x捍";
      this.jv = new com.xy.i.Class19("sc/e/31.png", 1, 104, com.xy.q.Class49.ch, com.xy.q.Class49.bv, "兑 换", this);
      this.jv.setBounds(164, 255, 79, 25);
      this.add(this.jv);
      this.o = new JLabel[4];

      int var2;
      for (int var10000 = var2 = 0; var10000 < this.o.length; var10000 = ++var2) {
         var10008 = "IDZ\u0017Z\u0017Z\u0017";
         this.o[var2] = com.xy.q.Class1.f(45, 23, 114, 19, 10, com.xy.q.Class49.c("#c000000"), com.xy.q.Class49.ch);
         JLabel var5 = this.o[var2];
         String var9;
         if (var2 == 0) {
            var9 = "叀儉捍爱哮";
            var9 = "可兑换物品";
         } else if (var2 == 1) {
            var9 = "攚釨";
            var9 = "数量";
         } else if (var2 == 2) {
            var9 = "淐耸";
            var9 = "消耗";
         } else if (var2 == 3) {
            var9 = "晵芵ｰ\u0014Z\b_\u0017";
            var9 = "星芒：30/50";
         } else {
            var9 = "";
         }

         var5.setText(var9);
         this.add(this.o[var2]);
         if (var2 == 1 || var2 == 2) {
            this.o[var2].setBounds(165, 176 + 24 * (var2 - 1), 36, 19);
         }

         if (var2 == 3) {
            this.o[var2].setFont(com.xy.q.Class49.n);
            this.o[var2].setBounds(208 + 39 * (var2 - 3), 200, 200, 21);
         }
      }

      String var6 = "\\;\u0000<\u0000i\u0018v_6H";
      com.xy.q.Class36 var4 = com.xy.q.Class1.j(com.xy.w.Class16.m("sc/d/17.png", 6, 6, 6, 6, false), com.xy.q.Class49.w, Color.white);
      var4.setBounds(208, 176, 54, 19);
      var4.setHorizontalAlignment(10);
      this.aal = new com.xy.q.Class27(15, var4, this);
      this.add(var4);
      this.sk = new com.xy.w.Class18[4];

      int var3;
      for (int var7 = var3 = 0; var7 < this.sk.length; var7 = var3) {
         this.sk[var3] = new com.xy.w.Class18();
         Class45 var8;
         if (var3 == 0) {
            var8 = this;
            com.xy.w.Class18 var10002 = this.sk[var3];
            String var10003 = "T\t\b\u000e\b[\u001eDW\u0004@";
            var10002.mt(com.xy.w.Class16.m("sc/d/19.png", 5, 5, 5, 5, false));
            this.sk[var3].setBounds(44, 43, 309, 105);
         } else if (var3 == 1) {
            var8 = this;
            this.sk[var3].setBounds(86, 172, 50, 50);
         } else if (var3 == 2) {
            var8 = this;
            com.xy.w.Class18 var14 = this.sk[var3];
            String var17 = "+LwKw\u001bv_6H";
            var14.dp("sc/d/4.png");
            this.sk[var3].setBounds(82, 168, 59, 57);
         } else {
            if (var3 == 3) {
               com.xy.w.Class18 var13 = this.sk[var3];
               String var15 = "T\t\b\u000e\bY\u0011DW\u0004@";
               var13.mt(com.xy.w.Class16.m("sc/d/36.png", 20, 20, 20, 20, false));
               this.sk[var3].setBounds(44, 148, 310, 150);
            }

            var8 = this;
         }

         var8.add(this.sk[var3++]);
      }

      this.aak = new com.xy.q.Class29(this, 6, 2, 51, 51, 0, 0, 45, 45);
      String var10004 = "\\;\u0000<\u0000i\u0017v_6H";
      this.aak.gt(com.xy.w.Class16.c("sc/d/18.png"));
      this.aak.be(true);
      this.add(this.aak);
      this.ca = new MoneyType();
   }

   public Long dt(long var1, JTextField var3) {
      if (var1 == 0L) {
         return null;
      } else if (var1 >= 0L && this.uv != null) {
         long var4 = this.yx().getMoney(this.ca) / this.uv.getShopprice();
         if ((var4 = Math.max(1L, var4)) < var1 && var4 <= 999L) {
            return var4;
         } else {
            return var1 > 999L ? 999L : null;
         }
      } else {
         return 0L;
      }
   }

   public void ei(Shop var1, boolean var2) {
      if (this.uv != null && this.uv == var1) {
         long var5 = this.aal.ee() + (var2 ? 99 : 1);
         this.aal.ty().setText(String.valueOf(var5));
      } else {
         this.uv = var1;
         if (this.uv == null) {
            this.sk[1].l();
            this.bn = new BigDecimal(0);
            this.aal.ty().setText("0");
         } else {
            int var3 = var2 ? 99 : 1;
            this.sk[1].gt(com.xy.w.Class15.d(this.uv.getShopskin()));
            this.aal.ty().setText(String.valueOf(var3));
         }
      }
   }

   public boolean du(long var1, JTextField var3) {
      return this.uv != null;
   }

   public void f() {
      this.uv = null;
      this.sk[1].l();
      this.bn = new BigDecimal(0);
      this.aal.ty().setText("0");
   }

   public void h() {
      if (this.uv == null) {
         String var3 = "沆杣逮乇皣唬哦";
         this.afx.dp("没有选中的商品");
      } else {
         int var1;
         if ((var1 = (int)this.aal.ee()) <= 0) {
            String var10001 = "赵也攨釠乕胒乢\u001f";
            this.afx.dp("购买数量不能为0");
         } else {
            BuyShopBean var2 = new BuyShopBean();
            var2.setAte(1);
            HandleOption.k(var2, this.uv, var1, this.ca, this.afx);
         }
      }
   }

   @Override
   protected void paintComponent(Graphics var1) {
      super.paintComponent(var1);
      if (this.afx.dh()) {
         this.e();
      }
   }

   public void g(int var1) {
      this.f();
      List var2 = this.yt().bg().getNpcShopMap().get(String.valueOf(var1));
      this.aak.fm(var2);
      Class45 var10000;
      if (var1 == 600) {
         var10000 = this;
         String var10003 = "殾新夼竇";
         this.ca.setIdAndKey(0, "比斗奖章");
      } else {
         if (var1 != 601) {
            return;
         }

         var10000 = this;
         String var3 = "晇芽";
         this.ca.setIdAndKey(0, "星芒");
      }

      var10000.zc().b(this.lj());
   }
}
