package com.xy.a.i;

import com.xy.bean.LoginResult;
import com.xy.readbean.LaborShop;
import com.xy.readbean.LaborVip;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComponent;
import javax.swing.JLabel;

class Class16 extends JComponent {
   private Class32[] qr;
   private int cn;
   private Image g;
   private int cb;
   private Image gl;
   private List<Class43> eq;
   private Image at;
   // $VF: synthetic field
   final Class28 qs;

   public void n(int var1) {
      if (this.cb != var1) {
         this.cb = var1;
         this.cn = 585;

         int var2;
         for (int var10000 = var2 = 0; var10000 < this.eq.size(); var10000 = ++var2) {
            Class43 var3 = this.eq.get(var2);
            if (var1 >= Class43.b(var3).getMoney()) {
               if (var2 != 0) {
                  var1 -= Class43.b(this.eq.get(var2 - 1)).getMoney();
               }

               int var4 = 585 / this.eq.size();
               this.cn = (int)(var4 * (var2 + (double)var1 / Class43.b(var3).getMoney()));
            }
         }

         this.t();
      }
   }

   public void l() {
      List var1 = this.qs.yt().am().getShopList(0);
      int var2 = 0;
      int var3 = (Class28.aar(this.qs) - 1) * this.qr.length;

      for (int var10000 = var2; var10000 < this.qr.length; var3++) {
         LaborShop var4 = var3 < var1.size() ? (LaborShop)var1.get(var3) : null;
         if (var4 != null || this.qr[var2] != null) {
            if (this.qr[var2] == null) {
               this.qr[var2] = new Class32(this.qs);
               this.qr[var2].setBounds(143 + 163 * var2, 257, 155, 234);
               this.add(this.qr[var2]);
            }

            this.qr[var2].adh(0, var4);
            this.qr[var2].setVisible(var4 != null);
         }

         var10000 = ++var2;
      }
   }

   public Class16(Class28 var1) {
      this.qs = var1;
      this.setOpaque(false);
      this.setLayout(null);
      this.setPreferredSize(new Dimension(802, 538));
      this.setBounds(0, 0, 802, 538);
      this.eq = new ArrayList<>();
      this.qr = new Class32[4];
   }

   // $VF: synthetic method
   static Class32[] lv(Class16 var0) {
      return var0.qr;
   }

   public void t() {
      int var1 = this.qs.yx().getLoginResult().getPaysum().intValue();
      if (this.qs.za().l(2, 11)) {
         LoginResult var10000 = this.qs.yx().getLoginResult();
         String var10001 = "囵駃兮偷";
         var1 = var10000.getScoretype("回馈充值").intValue();
      }

      long var2 = this.qs.yx().getPackRecord().getLabortype(0);
      LaborVip[] var4 = this.qs.yt().am().getVips();

      int var5;
      for (int var10 = var5 = 0; var10 < var4.length; var10 = ++var5) {
         Class43 var6 = var5 < this.eq.size() ? this.eq.get(var5) : null;
         if (var6 == null) {
            var6 = new Class43(this.qs, var5);
            this.eq.add(var6);
            this.add(Class43.c(var6));
            this.add(Class43.a(var6));
         }

         byte var7 = 0;
         Class43 var11;
         if ((var2 >> var5 & 1L) == 1L) {
            var7 = 2;
            var11 = var6;
         } else {
            if (var1 >= var4[var5].getMoney()) {
               var7 = 1;
            }

            var11 = var6;
         }

         var11.d(var4[var5], var7, 140 + (var5 + 1) * (585 / var4.length));
         Class43.c(var6).setForeground(var5 + 1 == var4.length ? Color.red : Color.black);
      }

      for (int var12 = var5 = this.eq.size() - 1; var12 >= var4.length; var12 = var5) {
         Class43 var9;
         Class43 var13 = var9 = this.eq.remove(var5);
         JLabel var10003 = Class43.c(var9);
         var5--;
         this.remove(var10003);
         this.remove(Class43.a(var13));
      }
   }

   @Override
   protected void paintComponent(Graphics var1) {
      super.paintComponent(var1);
      if (this.at == null) {
         String var10001 = "&\u0003z\u0002z3fScN%\u000e2";
         this.at = com.xy.w.Class16.c("sc/b/S336.png");
      }

      var1.drawImage(this.at, 143, 52, null);
      if (this.gl == null) {
         String var3 = "8HdIdxx\u0018|\u0005;E,";
         this.gl = com.xy.w.Class16.c("sc/b/S337.png");
      }

      var1.drawImage(this.gl, 148, 190, null);
      if (this.cn > 0) {
         if (this.g == null) {
            String var4 = "&\u0003z\u0002z3fSmN%\u000e2";
            this.g = com.xy.w.Class16.c("sc/b/S338.png");
         }

         Graphics var2;
         (var2 = var1.create(163, 195, this.cn, 15)).drawImage(this.g, 0, 0, null);
         var2.dispose();
      }
   }
}
