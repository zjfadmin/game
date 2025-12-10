package com.xy;

import com.xy.game.RoleData;
import com.xy.readbean.Activity;
import com.xy.readbean.ActivityPetManualRole;
import com.xy.readbean.ActivitySeries;
import com.xy.text.GameView;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JLabel;

public class Class395 extends Class345 {
   private JLabel[] iv;
   private Class345[] sj;
   private Class226[] sk;
   private Class379 sl;
   private int cy;
   private Class436[] g;

   protected void paintComponent(Graphics var1) {
      if (this.aej.bl()) {
         this.p();
      }

      super.paintComponent(var1);
   }

   public void as(int var1) {
      int var10000 = 3 ^ 3;
      this.cy = var1;

      int var2;
      for(var2 = var10000; var10000 < this.sk.length; var10000 = var2) {
         this.sk[var2].gb((boolean)(var2 == this.cy ? --1 : 0));
         ++var2;
      }

      Class395 var3;
      if (var1 == 0) {
         if (this.sj[2 & 5] == null) {
            this.add(this.sj[3 & 4] = new Class455(this), 61 & 75);
         }

         ((Class455)this.sj[3 >> 2]).s();
         var3 = this;
      } else {
         if (var1 == 5 >> 2) {
            if (this.sj[--1] == null) {
               this.add(this.sj[3 & 5] = new Class522(this), 75 & 61);
            }

            ((Class522)this.sj[--1]).d();
         }

         var3 = this;
      }

      if (var3.sj[var1] != null) {
         this.sj[var1].setVisible((boolean)(--1));
      }

      for(var10000 = var2 = 0; var10000 < this.sj.length; var10000 = var2) {
         if (this.sj[var2] != null && var1 != var2) {
            this.sj[var2].setVisible((boolean)(5 >> 3));
         }

         ++var2;
      }

   }

   public void q() {
      this.as(3 ^ 3);
      this.s();
      super.q();
   }

   public void p() {
      this.iv[5 >> 1].setText("缘念积分:" + this.aej.roleData.getLoginResult().getScoretype("缘念积分").longValue());
   }

   public void y(int var1) {
      if (var1 == (8621 & 24447)) {
         ((Class110)this.ve().e(93 & 126)).y(28639 & 4730);
      }

   }

   public Class395(GameView var1) {
      int var10001 = 5 >> 1;
      int var10007 = -4 >> 2;
      super(29947 & 3007, 5 >> 1, Class345.aef, var1);
      this.va(var10007, 2 & 5, 18271 & 15351, 22113 & 11230, Class345.aeo);
      this.uv(Class511.q("sc/music/204.a", 3 >> 2, 3 >> 2, 3 >> 2, 3 >> 2, (boolean)(2 & 5)), (String)null);
      this.aea.setImage("sc/music/199.b");
      this.aea.setBounds(11170 & 22397, --5, 43 & 119, 50 & 111);
      Class345[] var5 = new Class345[var10001];
      boolean var10003 = true;
      this.sj = var5;
      Class226[] var6 = new Class226[5 >> 1];
      var10003 = true;
      this.sk = var6;

      int var3;
      int var10000;
      for(var10000 = var3 = 5 >> 3; var10000 < this.sk.length; var10000 = var3) {
         String[] var4;
         boolean var10002;
         if (var3 == 0) {
            var4 = new String[--5];
            var10002 = true;
            var4[5 >> 3] = "";
            var4[2 ^ 3] = "结";
            var4[--2] = "缘";
            var4[--3] = "之";
            var4[--4] = "卷";
         } else if (var3 == --1) {
            var4 = new String[--5];
            var10002 = true;
            var4[2 & 5] = "";
            var4[3 & 5] = "契";
            var4[1 ^ 3] = "印";
            var4[--3] = "之";
            var4[--4] = "卷";
         } else if (var3 == (1 ^ 3)) {
            var4 = new String[--5];
            var10002 = true;
            var4[3 ^ 3] = "";
            var4[2 ^ 3] = "结";
            var4[1 ^ 3] = "缘";
            var4[3] = "奖";
            var4[4] = "励 ";
         } else {
            var4 = new String[1];
            var10002 = true;
            var4[3 >> 2] = "";
         }

         String[] var2 = var4;
         this.sk[var3] = new Class226("sc/music/193.b", 2, (43 & 95) + var3, Class681.b, Class681.bb, var2, this);
         this.sk[var3].setBounds(19378 & 14175, (111 & 87) + (21231 & 11669) * var3, 126 & 51, 29951 & 2951);
         this.add(this.sk[var3++]);
      }

      this.sl = new Class379("sc/music/197.b", 2 ^ 3, 19757 & 13311, Class681.bh, (Color[])null, "兑换", this);
      this.sl.setForeground(Class681.c("#c304340"));
      this.sl.setBounds(28447 & 5102, 20063 & 13234, 121 & 55, 23);
      this.add(this.sl);
      JLabel[] var7 = new JLabel[3];
      var10003 = true;
      this.iv = var7;

      Class395 var9;
      for(var10000 = var3 = 3 >> 2; var10000 < this.iv.length; var10000 = var3) {
         this.iv[var3] = Class133.b(749, 96 + 22 * var3, 20, 17, Class681.c(var3 == 0 ? "#cE1EBCA" : (var3 == (4 ^ 5) ? "#cD6EBCE" : "#cFFFFFF")), Class681.q);
         this.iv[var3].setText(var3 == 0 ? "结缘等级" : (var3 == (3 & 5) ? "0" : (var3 == 2 ? "缘念积分:0" : "")));
         this.iv[var3].setHorizontalAlignment(2 & 5);
         if (var3 == 0) {
            var9 = this;
            this.iv[var3].setBounds(23, 538, 80, 22);
            this.iv[var3].setFont(Class681.ch);
         } else if (var3 == (2 ^ 3)) {
            var9 = this;
            this.iv[var3].setBounds(37, 491, 50, 50);
            this.iv[var3].setFont(Class681.br);
         } else {
            if (var3 == 2) {
               this.iv[var3].setBounds(670, 534, 100, 15);
               this.iv[var3].setFont(Class681.ab);
            }

            var9 = this;
         }

         var9.add(this.iv[var3++]);
      }

      Class436[] var8 = new Class436[4];
      var10003 = true;
      this.g = var8;

      for(var10000 = var3 = 2 & 5; var10000 < this.g.length; var10000 = var3) {
         this.g[var3] = new Class436();
         if (var3 == 0) {
            var9 = this;
            this.g[var3].fw("sc/d/139.png");
            this.g[var3].setBounds(6, 539, 111, 21);
         } else if (var3 == (4 ^ 5)) {
            var9 = this;
            this.g[var3].fw("sc/music/207.a");
            this.g[var3].setBounds(16, 471, 92, 92);
         } else if (var3 == 2) {
            var9 = this;
            this.g[var3].fw("sc/d/139.png");
            this.g[var3].setBounds(653, 531, 135, 20);
         } else {
            if (var3 == 3) {
               this.g[var3].fw("sc/music/219.a");
               this.g[var3].setBounds(58, 0, 395, 576);
            }

            var9 = this;
         }

         var9.add(this.g[var3++]);
      }

   }

   public void s() {
      Class603 var1 = this.vc();
      RoleData var2 = this.vd();
      Activity var3;
      ActivitySeries var5;
      if ((var3 = (var5 = var1.br()).getActivityPetManual()) != null) {
         ActivityPetManualRole var4 = var3 != null ? (ActivityPetManualRole)var2.getActivity(var3.getId()) : null;
         this.iv[3 & 5].setText(String.valueOf(var4.a(var3, var5)[2 & 5]));
      }

   }

   public void d() {
      Class395 var10000;
      if (this.cy == 0 && this.sj[2 & 5] != null) {
         ((Class455)this.sj[3 >> 2]).d();
         var10000 = this;
      } else {
         if (this.cy == --1 && this.sj[3 >> 1] != null) {
            ((Class522)this.sj[5 >> 2]).o();
         }

         var10000 = this;
      }

      var10000.s();
   }
}
