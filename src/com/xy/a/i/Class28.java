package com.xy.a.i;

import com.xy.bean.LoginResult;
import com.xy.game.RoleData;
import com.xy.q.Class49;
import com.xy.readbean.LaborVip;
import com.xy.text.GameView;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JComponent;
import javax.swing.JLabel;

public class Class28 extends com.xy.q.Class30 {
   private JLabel dc;
   private JLabel xg;
   private int z;
   private com.xy.i.Class11 ec;
   private Class28 aie;
   private int ha;
   private com.xy.i.Class11[] by;
   private JComponent[] aif;
   private com.xy.q.Class14 oo;
   private JLabel di;
   private com.xy.i.Class11 aig;

   // $VF: synthetic method
   static int aar(Class28 var0) {
      return var0.ha;
   }

   public void y(int var1) {
      int var2;
      for (int var10000 = var2 = 0; var10000 < this.by.length; var10000 = ++var2) {
         this.by[var2].setKeep(var2 == var1);
      }

      if (this.aif[var1] == null) {
         Class28 var6;
         if (var1 == 0) {
            this.aif[var1] = new Class16(this);
            var6 = this;
         } else {
            this.aif[var1] = new Class41(this, var1);
            var6 = this;
         }

         if (var6.aif[var1] != null) {
            this.add(this.aif[var1], 1);
         }
      }

      for (int var7 = var2 = 0; var7 < this.aif.length; var7 = ++var2) {
         if (this.aif[var2] != null) {
            this.aif[var2].setVisible(var2 == var1);
            if (var2 == var1) {
               if (var1 == 0) {
                  Class16 var3 = (Class16)this.aif[var1];
                  var3.t();
                  this.z = 1 + (this.yt().am().getShopList(0).size() - 1) / Class16.lv(var3).length;
               } else {
                  Class41 var5 = (Class41)this.aif[var1];
                  var5.l();
                  this.z = 1 + (this.yt().am().getShopList(var1).size() - 1) / Class41.aky(var5).length;
               }
            }
         }
      }

      this.g(1);
   }

   public void g(int var1) {
      if (var1 == -2 || var1 == -1) {
         if ((var1 = this.ha + (var1 == -2 ? -1 : 1)) <= 0) {
            String var3 = "彈刦昴駽顮";
            this.afx._do("当前是首页");
            return;
         }

         if (var1 > this.z) {
            String var2 = "彉刄昵屷顯";
            this.afx._do("当前是尾页");
            return;
         }
      }

      this.ha = var1;
      if (this.ha > this.z) {
         this.z = this.ha;
      }

      com.xy.q.Class14 var10001 = this.oo;
      StringBuilder var10002 = new StringBuilder(String.valueOf(this.ha));
      String var10003 = "4";
      var10001.setText(var10002.append("/").append(this.z).toString());
      if (this.by[0].ah() && this.aif[0] != null) {
         ((Class16)this.aif[0]).l();
      } else if (this.by[1].ah() && this.aif[1] != null) {
         ((Class41)this.aif[1]).t();
      } else if (this.by[2].ah() && this.aif[2] != null) {
         ((Class41)this.aif[2]).t();
      } else {
         if (this.by[3].ah() && this.aif[3] != null) {
            ((Class41)this.aif[3]).t();
         }
      }
   }

   @Override
   public void l() {
      this.y(0);
      super.l();
   }

   public double aas() {
      int var1 = this.yx().getLoginResult().getPaysum().intValue();
      if (this.za().l(2, 11)) {
         LoginResult var10000 = this.yx().getLoginResult();
         String var10001 = "嚗馒儌倦";
         var1 = var10000.getScoretype("回馈充值").intValue();
      }

      LaborVip[] var2;
      int var3;
      for (int var4 = var3 = (var2 = this.yt().am().getVips()).length - 1; var4 >= 0; var4 = --var3) {
         if (var1 >= var2[var3].getMoney()) {
            return var2[var3].getZk();
         }
      }

      return 1.0;
   }

   public void f() {
      RoleData var1 = this.yx();
      Class49.b(this.dc, var1.getLoginResult().getCodecard().longValue());
      Class49.b(this.di, var1.getLoginResult().getMoney().intValue());
      JLabel var10001 = this.xg;
      LoginResult var10002 = var1.getLoginResult();
      String var10003 = "嚵馓禄初";
      Class49.b(var10001, var10002.getScoretype("回馈积分").longValue());
      if (this.by[0].getBtn() == 2 && this.aif[0] != null) {
         int var2 = this.yx().getLoginResult().getPaysum().intValue();
         if (this.za().l(2, 11)) {
            LoginResult var10000 = this.yx().getLoginResult();
            String var3 = "嚗馒儌倦";
            var2 = var10000.getScoretype("回馈充值").intValue();
         }

         ((Class16)this.aif[0]).n(var2);
      }
   }

   public Class28(GameView var1) {
      super(142, 2, com.xy.q.Class30.afz, var1);
      String var10005 = "i*5+5\u001a)z)gj'}";
      this.yy(-1, 0, 802, 538, com.xy.q.Class30.agh);
      this._do("sc/b/S333.png");
      String var10004 = "h\b4\t4)/_#Ek\u0005|";
      this.agi.setBtnPath("sc/b/B448.png");
      this.agi.setBounds(761, 14, 22, 21);
      this.aif = new JComponent[4];
      this.dc = com.xy.q.Class1.f(272, 17, 110, 16, 10, Color.white, Class49.cp);
      this.add(this.dc);
      this.di = com.xy.q.Class1.f(443, 17, 110, 16, 10, Color.white, Class49.cp);
      this.add(this.di);
      this.xg = com.xy.q.Class1.f(645, 17, 110, 16, 10, Color.white, Class49.cp);
      this.add(this.xg);
      this.by = new com.xy.i.Class11[4];

      int var2;
      for (int var10000 = var2 = 0; var10000 < this.by.length; var10000 = var2) {
         String var5;
         if (var2 == 0) {
            String var4 = "兟i倦i囄i馒";
            var5 = "充 值 回 馈";
         } else if (var2 == 1) {
            String var6 = "囅K馓K豱K礧";
            var5 = "回 馈 豪 礼";
         } else if (var2 == 2) {
            String var7 = "牣i惺i啜i埔";
            var5 = "特 惠 商 城";
         } else {
            String var8 = "牢K惻K礧K匞";
            var5 = "特 惠 礼 包";
         }

         String var3 = var5;
         String var10007 = "i*5+5\u000b.}#gj'}";
         this.by[var2] = new com.xy.i.Class11("sc/b/B449.png", 2, 41 + var2, Class49.k, Class49.ay, var3, this);
         this.by[var2].setBounds(23, 66 + 35 * var2, 110, 30);
         this.add(this.by[var2++]);
      }

      String var10010 = "h\b4\t4)/^+Ek\u0005|";
      this.aig = new com.xy.i.Class11("sc/b/B450.png", 1, 51, this);
      String var10009 = "i*5+5\u000b.|+gj'}";
      this.ec = new com.xy.i.Class11("sc/b/B451.png", 1, 52, this);
      this.oo = com.xy.q.Class1.i(433, 511, 60, 16, 0, Color.white, Class49.cp);
      this.aig.setBounds(416, 513, 12, 14);
      this.ec.setBounds(498, 513, 12, 14);
      this.add(this.aig);
      this.add(this.ec);
      this.add(this.oo);
      this.f();
   }

   @Override
   protected void paintComponent(Graphics var1) {
      super.paintComponent(var1);
      if (this.afx.dh()) {
         this.f();
      }
   }

   public void h() {
      if (this.by[0].ah() && this.aif[0] != null) {
         ((Class16)this.aif[0]).t();
         ((Class16)this.aif[0]).l();
      }
   }

   public Class28 aat() {
      return this.aie;
   }
}
