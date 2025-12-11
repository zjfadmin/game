package com.xy.a.q;

import com.xy.game.RoleData;
import com.xy.readbean.Goodstable;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import java.awt.Color;
import java.math.BigDecimal;
import javax.swing.JLabel;

public class Class70 extends com.xy.q.Class30 {
   private JLabel bd;
   private int ha;
   private JLabel[] r;
   private com.xy.i.Class19[] aic;
   private com.xy.q.Class54[] aax;
   private Class53[] aid;
   private com.xy.w.Class18[] cl;

   // $VF: synthetic method
   static int aaq(Class70 var0) {
      return var0.ha;
   }

   public Class70(GameView var1) {
      super(125, 2, com.xy.q.Class30.afz, var1);
      String var10003 = "\u0014+H,HyI8\t/";
      this.yy(-1, 0, 662, 475, com.xy.q.Class30.agh);
      com.xy.w.Class9 var36 = com.xy.w.Class16.m("sc/d/1.png", 68, 68, 68, 68, false);
      String var10004 = "旷卿凵绢祻";
      this.yu(var36, "新区冲级礼");
      this.aic = new com.xy.i.Class19[7];

      int var2;
      for (int var10000 = var2 = 0; var10000 < this.aic.length; var10000 = var2) {
         com.xy.i.Class19[] var7 = this.aic;
         if (var2 == 0) {
            var10004 = "\u0014+H-H\u007fI8\t/";
            var10004 = "sc/e/7.png";
         } else {
            var10004 = "4&h hvvk7+ ";
            var10004 = "sc/e/31.png";
         }

         int var10006 = 191 + var2;
         String var43;
         Class70 var10010;
         if (var2 == 0) {
            var43 = "笙剸";
            var43 = "签到";
            var10010 = this;
         } else {
            var43 = "飁e厑";
            var43 = "领 取";
            var10010 = this;
         }

         com.xy.i.Class19 var10001 = new com.xy.i.Class19(var10004, 1, var10006, com.xy.q.Class49.ch, com.xy.q.Class49.bv, var43, var10010);
         var7[var2] = var10001;
         Class70 var8;
         if (var2 == 0) {
            var8 = this;
            this.aic[var2].setBounds(548, 47, 59, 25);
         } else {
            if (var2 >= 1 && var2 <= 6) {
               this.aic[var2].setBounds(71 + 94 * (var2 - 1), 412, 79, 25);
            }

            var8 = this;
         }

         var8.add(this.aic[var2++]);
      }

      this.bd = new JLabel();
      this.bd.setBounds(475, 50, 30, 20);
      this.bd.setForeground(Color.red);
      this.bd.setHorizontalAlignment(0);
      this.bd.setFont(com.xy.q.Class49.ak);
      this.bd.setOpaque(false);
      this.add(this.bd);
      this.r = new JLabel[8];

      for (int var9 = var2 = 0; var9 < this.r.length; var9 = ++var2) {
         this.r[var2] = com.xy.q.Class1.k(69, 45, 240, 18, Color.white, com.xy.q.Class49.ac);
         this.r[var2].setHorizontalAlignment(0);
         JLabel var10 = this.r[var2];
         String var18;
         if (var2 == 0) {
            var18 = "厧遽辏烞决攗嬟淯聟乧寒亾珁込蠄蠂笶";
            var18 = "可通过点击数字消耗一定仙玉进行补签";
         } else if (var2 == 1) {
            var18 = "嶵絪详笻剷｟g奬g";
            var18 = "已累计签到： 天 ";
         } else if (var2 == 2) {
            var18 = "y奎h";
            var18 = "1天 ";
         } else if (var2 == 3) {
            var18 = "t奬g";
            var18 = "3天 ";
         } else if (var2 == 4) {
            var18 = "\u007f奎h";
            var18 = "7天 ";
         } else if (var2 == 5) {
            var18 = "tu奬g";
            var18 = "12天 ";
         } else if (var2 == 6) {
            var18 = "Vp奎h";
            var18 = "18天 ";
         } else if (var2 == 7) {
            var18 = "wr奬g";
            var18 = "25天 ";
         } else {
            var18 = "";
         }

         var10.setText(var18);
         this.add(this.r[var2]);
         if (var2 == 1) {
            this.r[var2].setHorizontalAlignment(10);
            this.r[var2].setFont(com.xy.q.Class49.ak);
            this.r[var2].setForeground(Color.black);
            this.r[var2].setBounds(367, 50, 173, 21);
         } else if (var2 >= 2 && var2 <= 7) {
            this.r[var2].setFont(com.xy.q.Class49.ah);
            this.r[var2].setForeground(Color.black);
            this.r[var2].setBounds(66 + 96 * (var2 - 2), 251, 87, 28);
         }
      }

      this.aid = new Class53[30];

      for (int var11 = var2 = 0; var11 < this.aid.length; var11 = var2) {
         this.aid[var2] = new Class53(this, var2);
         this.aid[var2].setBounds(367 + var2 % 7 * 35, 88 + var2 / 7 * 30, 35, 30);
         this.add(this.aid[var2++]);
      }

      this.cl = new com.xy.w.Class18[11];

      for (int var12 = var2 = 0; var12 < this.cl.length; var12 = ++var2) {
         this.cl[var2] = new com.xy.w.Class18();
         this.add(this.cl[var2]);
         if (var2 == 0) {
            var12 = var2;
            com.xy.w.Class18 var30 = this.cl[var2];
            var10003 = ";\u0004g\u0003gQxI8\t/";
            var30.mt(com.xy.w.Class16.m("sc/d/60.png", 76, 2, 76, 2, false));
            this.cl[var2].setBounds(365, 78, 248, 7);
         } else if (var2 == 1) {
            var12 = var2;
            com.xy.w.Class18 var31 = this.cl[var2];
            var10003 = "4&h!hvtk7+ ";
            var31.mt(com.xy.w.Class16.m("sc/d/33.png", 30, 30, 30, 30, false));
            this.cl[var2].setBounds(354, 39, 272, 204);
         } else if (var2 == 2) {
            var12 = var2;
            com.xy.w.Class18 var32 = this.cl[var2];
            var10003 = ";\u0004g\u0003gP|I8\t/";
            var32.mt(com.xy.w.Class16.m("sc/d/74.png", 16, 16, 30, 30, false));
            this.cl[var2].setBounds(56, 32, 575, 216);
         } else {
            if (var2 == 3) {
               com.xy.w.Class18 var26 = this.cl[var2];
               String var33 = "4&h!hwsk7+ ";
               var26.mt(com.xy.w.Class16.m("sc/d/24.png", 565, 206, 2, 2, false));
               this.cl[var2].setBounds(59, 35, 569, 210);
            }

            var12 = var2;
         }

         if (var12 >= 4 && var2 <= 10) {
            com.xy.w.Class18 var27 = this.cl[var2];
            String var34 = ";\u0004g\u0003gS}I8\t/";
            var27.mt(com.xy.w.Class16.m("sc/d/45.png", 2, 76, 2, 76, false));
            this.cl[var2].setBounds(59 + 94 * (var2 - 4), 251, 7, 191);
         }
      }

      this.aax = new com.xy.q.Class54[30];

      for (int var14 = var2 = 0; var14 < this.aax.length; var14 = var2) {
         this.aax[var2] = new com.xy.q.Class54(this);
         this.aax[var2].wp(com.xy.q.Class54.aty);
         com.xy.q.Class54 var15 = this.aax[var2];
         String var28 = "4&h!hwsk7+ ";
         var15.mt(com.xy.w.Class16.m("sc/d/24.png", 2, 2, 2, 2, false));
         Class70 var16;
         if (var2 < 5) {
            var16 = this;
            this.aax[var2].setBounds(70 + 41 * ((var2 - 0) % 2), 282 + 41 * ((var2 - 0) / 2), 39, 39);
         } else if (var2 < 10) {
            var16 = this;
            this.aax[var2].setBounds(164 + 41 * ((var2 - 5) % 2), 282 + 41 * ((var2 - 5) / 2), 39, 39);
         } else if (var2 < 15) {
            var16 = this;
            this.aax[var2].setBounds(258 + 41 * ((var2 - 10) % 2), 282 + 41 * ((var2 - 10) / 2), 39, 39);
         } else if (var2 < 20) {
            var16 = this;
            this.aax[var2].setBounds(352 + 41 * ((var2 - 15) % 2), 282 + 41 * ((var2 - 15) / 2), 39, 39);
         } else if (var2 < 25) {
            var16 = this;
            this.aax[var2].setBounds(446 + 41 * ((var2 - 20) % 2), 282 + 41 * ((var2 - 20) / 2), 39, 39);
         } else {
            if (var2 < 30) {
               this.aax[var2].setBounds(540 + 41 * ((var2 - 25) % 2), 282 + 41 * ((var2 - 25) / 2), 39, 39);
            }

            var16 = this;
         }

         var16.add(this.aax[var2++]);
      }
   }

   public void g(int var1) {
      if (var1 == 191) {
         String var10001 = "\u0017px\u0016";
         String var3 = Agreement.getSendTextAES("taskN", "R7=Q");
         this.za().k(var3);
      } else {
         String var10003 = "5\u007fZ\u001c";
         String var2 = Agreement.getSendTextAES("taskN", "R7=T" + (var1 - 192));
         this.za().k(var2);
      }
   }

   public void h() {
      this.ha++;
      if (this.ha >= 30) {
         this.ha = 0;
      }

      this.ci(null);
   }

   public void ci(String var1) {
      if (var1 != null) {
         this.ha = Integer.parseInt(var1);
      }

      com.xy.v.Class8 var2 = this.yt();
      RoleData var3 = this.yx();
      int var4 = var3.getTaskSystem().f(7, 1);
      int var5 = var3.getTaskSystem().f(7, 2);
      String[] var6 = var2.q().getTotals();

      int var7;
      for (int var10000 = var7 = 0; var10000 < 6; var10000 = ++var7) {
         String var8 = var6 != null && var7 < var6.length ? var6[var7] : null;
         String[] var15;
         if (var8 != null && !var8.equals("")) {
            String var10001 = ";4";
            var15 = var8.split("\\|");
         } else {
            var15 = null;
         }

         String[] var9 = var15;

         int var10;
         for (int var16 = var10 = 0; var16 < 5; var16 = ++var10) {
            String var11 = var9 != null && var10 < var9.length ? var9[var10] : null;
            Goodstable var12 = var11 != null ? var2.ay(new BigDecimal(var11)) : null;
            if (var12 != null) {
               this.aax[var7 * 5 + var10].gs(1, var12);
            } else {
               this.aax[var7 * 5 + var10].gs(0, null);
               this.aax[var7 * 5 + var10].setVisible(true);
            }
         }

         if ((var4 >>> var7 & 1) == 0) {
            com.xy.i.Class19 var17 = this.aic[1 + var7];
            String var22 = "飁e厑";
            var17.setText("领 取");
            com.xy.i.Class19 var18 = this.aic[1 + var7];
            String var10002 = ";\u0004g\u0002gTyI8\t/";
            var18.setBtn(1, "sc/e/31.png");
         } else {
            com.xy.i.Class19 var19 = this.aic[1 + var7];
            String var23 = "嶵飃厑";
            var19.setText("已领取");
            com.xy.i.Class19 var20 = this.aic[1 + var7];
            String var24 = ";\u0004g\u0002gRpI8\t/";
            var20.setBtn(-1, "sc/e/58.png");
         }
      }

      var7 = 0;

      int var14;
      for (int var21 = var14 = 0; var21 < 30; var21 = ++var14) {
         if ((var5 >>> var14 & 1) == 1) {
            var7++;
            this.aid[var14].setBackground(com.xy.q.Class49.al);
         } else {
            this.aid[var14].setBackground(com.xy.q.Class49.bk);
         }
      }

      this.bd.setText(String.valueOf(var7));
      this.aic[0].setVisible((var5 >>> this.ha & 1) == 0);
      this.zc().b(this.lj());
   }
}
