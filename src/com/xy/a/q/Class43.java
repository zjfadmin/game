package com.xy.a.q;

import com.xy.bean.LoginResult;
import com.xy.game.RoleData;
import com.xy.readbean.Goodstable;
import com.xy.text.GameTXMask;
import com.xy.text.GameView;
import java.awt.Color;
import java.awt.Graphics;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import javax.swing.JLabel;

public class Class43 extends com.xy.q.Class30 {
   private BigDecimal[] yx;
   private com.xy.q.Class52 si;
   private com.xy.q.Class19 yy;
   private com.xy.i.Class19 jv;
   private com.xy.i.Class19[] vw;
   private JLabel df;
   private com.xy.i.Class19 tc;
   private JLabel dh;
   private com.xy.i.Class19 kc;
   private com.xy.q.Class19 yz;
   private JLabel im;

   public void tn(BigDecimal[] var1) {
      this.yx = var1;
      this.h();
      this.zc().b(112);
   }

   public void g(int var1) {
      if (var1 == 31) {
         this.yy.setVisible(true);
      } else if (var1 == 32) {
         this.yz.setVisible(true);
      } else if (var1 != 33 && var1 != 34 && var1 != 35) {
         if (var1 == 36) {
            if (this.afx.ah()) {
               return;
            }

            Map var17 = this.yt().bg().getNpcShopMap();
            String var28 = "\u0015\u0003\u0016\u0003";
            List var9;
            if ((var9 = (List)var17.get("3000")) == null) {
               return;
            }

            Class82 var10 = (Class82)this.zc().j(88);
            String var32 = "礝秼禺創";
            var10.adn(var9, "祈福积分");
            this.zc().b(88);
         }
      } else if (this.yx != null) {
         RoleData var2 = this.yx();
         String var3;
         String var10000 = var3 = this.im.getText();
         String var10001 = "乾勵捲";
         int var12;
         if (var10000.equals("不加持")) {
            var12 = 0;
         } else {
            var10001 = "\u0017炊";
            if (var3.equals("1点")) {
               var12 = 1;
            } else {
               var10001 = "m烊";
               var12 = var3.equals("8点") ? 8 : 20;
            }
         }

         int var4 = var12;
         String var5;
         var10000 = var5 = this.dh.getText();
         var10001 = "产迸抎";
         int var14;
         if (var10000.equals("五连抽")) {
            var14 = 5;
         } else {
            var10001 = "仙匲辋拎";
            var14 = var5.equals("二十连抽") ? 20 : 1;
         }

         int var6 = var14;
         if (var2.getGoodPackSum(-1L, new BigDecimal(-1), 1 + var6) <= 0) {
            var10001 = "胪匶穜闇丫趀";
            this.afx._do("背包空间不足");
         } else {
            BigDecimal var7 = this.yx[var1 - 33];
            Goodstable var8;
            if ((var8 = var2.bk(var7)) != null && var6 <= var8.getUsetime()) {
               if (var4 != 0) {
                  long var15 = var4 * var6;
                  LoginResult var24 = var2.getLoginResult();
                  String var10002 = "礝慌禺創";
                  if (var15 > var24.getScoretype("祈愿积分").longValue()) {
                     var10001 = "体祮愌秉刵丫趀";
                     this.afx._do("你祈愿积分不足");
                     return;
                  }
               }

               GameTXMask var16 = this.afx.gameTXMask;
               var10001 = "\u0011$\u0004*";
               boolean var10005 = true;
               String var35 = "b";
               StringBuilder var29 = new StringBuilder("Q").append(var1 - 32);
               String var10004 = "\u000f";
               var29 = var29.append("|").append(var8.getRgid());
               var10004 = "O";
               var29 = var29.append("|").append(var4);
               var10004 = "\u000f";
               var16.a("DWQY", 1, var29.append("|").append(var6).toString());
            } else {
               var8 = this.yt().ay(var7);
               if (var8 != null) {
                  String var10003 = "肙卶泴杺";
                  var10001 = "背包没有" + var8.getGoodsname();
               } else {
                  var10001 = "牏哲丫趀";
                  var10001 = "物品不足";
               }

               this.afx._do(var10001);
            }
         }
      }
   }

   // $VF: synthetic method
   static com.xy.q.Class19 to(Class43 var0) {
      return var0.yz;
   }

   public void h() {
      LoginResult var2 = this.yx().getLoginResult();
      String var10003 = "祮愌秉刵";
      this.si.ef(var2.getScoretype("祈愿积分").longValue());
      JLabel var10000 = this.df;
      var10003 = "礻秚禜剓I";
      StringBuilder var10001 = new StringBuilder("祈福积分:");
      var10003 = "祮禼秉刵";
      var10000.setText(var10001.append(var2.getScoretype("祈福积分")).toString());
   }

   // $VF: synthetic method
   static JLabel tp(Class43 var0) {
      return var0.im;
   }

   public Class43(GameView var1) {
      super(112, 2, com.xy.q.Class30.afz, var1);
      String var10003 = "\u00006\\7\\\u0006A`E{\u0003;\u0014";
      this.yy(-1, 0, 696, 446, com.xy.q.Class30.agh);
      this._do("sc/b/S256.png");
      this.agi.setBounds(638, 14, 25, 25);
      String[] var10000 = new String[4];
      var10003 = "举劆挲";
      var10000[0] = "不加持";
      var10003 = "d烊";
      var10000[1] = "1点";
      var10003 = "\u001e炊";
      var10000[2] = "8点";
      var10003 = "Ae烊";
      var10000[3] = "20点";
      String[] var2 = var10000;
      String var10010 = "UP\tP\t\u0002\u0013\u0004";
      this.yy = new com.xy.q.Class19(78, 80, "sc/c/157", var2);
      this.yy.setBounds(160, 319, 78, 80);
      this.yy.setVisible(false);
      this.add(this.yy);
      this.yy.th().addMouseListener(new Class66(this));
      var10010 = "乾勵捲";
      this.im = new JLabel("不加持");
      this.im.setFont(com.xy.q.Class49.cp);
      this.im.setBounds(162, 400, 60, 18);
      this.im.setForeground(Color.WHITE);
      this.add(this.im);
      String var10009 = "UP\tP\t\u0006";
      this.kc = new com.xy.i.Class19("sc/c/5", 1, 31, this);
      this.kc.setBounds(225, 400, 18, 18);
      this.add(this.kc);
      var10000 = new String[3];
      var10003 = "匀拎";
      var10000[0] = "单抽";
      var10003 = "产迸抎";
      var10000[1] = "五连抽";
      var10003 = "仙匲辋拎";
      var10000[2] = "二十连抽";
      String[] var3 = var10000;
      String var10011 = "UP\tP\t\u0002\u0013\u0004";
      this.yz = new com.xy.q.Class19(78, 80, "sc/c/157", var3);
      this.yz.setBounds(342, 319, 78, 80);
      this.yz.setVisible(false);
      this.add(this.yz);
      this.yz.th().addMouseListener(new Class74(this));
      var10011 = "匀拎";
      this.dh = new JLabel("单抽");
      this.dh.setFont(com.xy.q.Class49.cp);
      this.dh.setBounds(344, 400, 80, 18);
      this.dh.setForeground(Color.WHITE);
      this.add(this.dh);
      var10010 = "UP\tP\t\u0006";
      this.tc = new com.xy.i.Class19("sc/c/5", 1, 32, this);
      this.tc.setBounds(407, 400, 17, 17);
      this.add(this.tc);
      this.vw = new com.xy.i.Class19[3];

      int var4;
      for (int var6 = var4 = 0; var6 < this.vw.length; var6 = var4) {
         com.xy.i.Class19[] var7 = this.vw;
         String var10006 = "\u00006\\7\\";
         StringBuilder var10004 = new StringBuilder("sc/b/");
         String var16;
         if (var4 == 0) {
            var16 = "d\u0000\u0013\u0003";
            var16 = "B350";
         } else if (var4 == 1) {
            var16 = "\u0017@`B";
            var16 = "B351";
         } else {
            var16 = "d\u0000\u0013\u0001";
            var16 = "B352";
         }

         com.xy.i.Class19 var10002 = new com.xy.i.Class19(var10004.append(var16).append(".png").toString(), 1, 33 + var4, this);
         var7[var4] = var10002;
         this.vw[var4].setBounds(var4 == 0 ? 63 : (var4 == 1 ? 252 : 440), -7, 200, 400);
         this.add(this.vw[var4++]);
      }

      var10009 = "礝秼禺創oC";
      this.df = new JLabel("祈福积分:0", 4);
      this.df.setBounds(290, 420, 260, 17);
      this.df.setFont(com.xy.q.Class49.bz);
      this.df.setOpaque(false);
      this.df.setForeground(Color.black);
      this.add(this.df);
      this.si = com.xy.q.Class1.a(10, Color.white, com.xy.q.Class49.w, null, var1);
      this.si.setBounds(506, 399, 80, 19);
      this.si.setText("0");
      this.add(this.si);
      var10009 = "@E\u001cC\u001c\u0014\u0004\bCHT";
      String var10014 = "禺創億挑";
      this.jv = new com.xy.i.Class19("sc/e/27.png", 1, 36, com.xy.q.Class49.bz, null, "积分兑换", this);
      this.jv.setBounds(573, 420, 51, 17);
      this.jv.setOpaque(false);
      this.add(this.jv);
   }

   // $VF: synthetic method
   static JLabel tq(Class43 var0) {
      return var0.dh;
   }

   // $VF: synthetic method
   static com.xy.q.Class19 tr(Class43 var0) {
      return var0.yy;
   }

   @Override
   protected void paintComponent(Graphics var1) {
      super.paintComponent(var1);
      if (this.afx.dh()) {
         this.h();
      }
   }
}
