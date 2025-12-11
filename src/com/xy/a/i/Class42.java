package com.xy.a.i;

import com.xy.game.RoleData;
import com.xy.i.Class11;
import com.xy.i.Class18;
import com.xy.q.Class49;
import com.xy.q.Class52;
import com.xy.readbean.MoneyType;
import com.xy.richtext.RichLabel;
import com.xy.text.GameView;
import java.awt.Color;
import java.awt.Image;
import javax.swing.JLabel;

public class Class42 extends com.xy.q.Class30 {
   private JLabel[] ch;
   private Class52 zs;
   private com.xy.i.Class11[] by;
   private com.xy.w.Class18[] ar;
   private MoneyType ef;
   private Class19[] asz;
   private RichLabel bj;

   public void h() {
      RoleData var1 = this.yx();

      int var2;
      for (int var10000 = var2 = 0; var10000 < this.asz.length; var10000 = var2) {
         long var3 = var1.getPackRecord().getStarSoulType(this.asz[var2].lj()) / 10000L;
         this.asz[var2++].ef(var3);
      }
   }

   @Override
   public void l() {
      this.h();
      this.zs.l();
      super.l();
   }

   public Class42(GameView var1) {
      super(138, 2, com.xy.q.Class30.afz, var1);
      String var10007 = "ed9c968wx`";
      this.yy(-1, 0, 462, 445, com.xy.q.Class30.agh);
      com.xy.w.Class9 var42 = com.xy.w.Class16.m("sc/d/1.png", 68, 68, 68, 68, false);
      String var10008 = "晶盪";
      this.yu(var42, "星盘");
      this.bj = new RichLabel("", Class49.n);
      String var10006 = "5d&7&7&7揆礽，昘魔迟叹赧丘IFD,‛5dPA&7&7二兌襩$u7&7&7&‚ $uAP7&7&阸拟术汁$u7&7&7&‚莡徐叝奺庰々";
      this.bj.setTextSize("#c000000提示：星魂还可赠与NPC:“#cFF0000亚克西#c000000”“#cFF0000阿拉木汗#c000000”获得友好度。", 380);
      this.bj.setBounds(51, 38, this.bj.getWidth(), this.bj.getHeight());
      this.add(this.bj);
      this.by = new com.xy.i.Class11[2];

      int var2;
      for (int var10000 = var2 = 0; var10000 < this.by.length; var10000 = var2) {
         com.xy.i.Class11[] var8 = this.by;
         String var10004 = "\u001aQFWF\u0005GB\u0007U";
         int var41 = 32 + var2;
         String var44;
         Class42 var10010;
         if (var2 == 0) {
            var44 = "轺匑";
            var44 = "转化";
            var10010 = this;
         } else if (var2 == 1) {
            var44 = "醤炎";
            var44 = "重炼";
            var10010 = this;
         } else {
            var44 = "";
            var10010 = this;
         }

         Class11 var10002 = new Class11("sc/e/7.png", 1, var41, Class49.ch, Class49.bv, var44, var10010);
         var8[var2] = var10002;
         this.by[var2].setBounds(218 + 103 * var2, 392, 59, 25);
         this.add(this.by[var2++]);
      }

      this.ch = new JLabel[87];

      for (int var9 = var2 = 0; var9 < this.ch.length; var9 = ++var2) {
         int var39 = 85 + 51 * var2;
         var10008 = "5dW5/2!0";
         this.ch[var2] = com.xy.q.Class1.f(55, var39, 36, 18, 0, Class49.c("#cA29577"), Class49.ch);
         JLabel var10 = this.ch[var2];
         String var14;
         if (var2 == 42 || var2 == 48 || var2 == 54 || var2 == 60 || var2 == 66 || var2 == 72 || var2 == 78) {
            var14 = "1";
         } else if (var2 == 43 || var2 == 49 || var2 == 55 || var2 == 61 || var2 == 67 || var2 == 73 || var2 == 79) {
            var14 = "\u0000";
            var14 = "2";
         } else if (var2 == 44 || var2 == 50 || var2 == 56 || var2 == 62 || var2 == 68 || var2 == 74 || var2 == 80) {
            var14 = "4";
            var14 = "3";
         } else if (var2 == 45 || var2 == 51 || var2 == 57 || var2 == 63 || var2 == 69 || var2 == 75 || var2 == 81) {
            var14 = "\u0006";
            var14 = "4";
         } else if (var2 == 46 || var2 == 52 || var2 == 58 || var2 == 64 || var2 == 70 || var2 == 76 || var2 == 82) {
            var14 = "2";
            var14 = "5";
         } else if (var2 == 47 || var2 == 53 || var2 == 59 || var2 == 65 || var2 == 71 || var2 == 77 || var2 == 83) {
            var14 = "\u0004";
            var14 = "6";
         } else if (var2 == 84) {
            var14 = "魔倻";
            var14 = "魂值";
         } else if (var2 == 85) {
            var14 = "菞徥辮皶晶魰I\u0012I\u0012烐凉历攄弼＾敟彧呧叝凤甭批〰";
            var14 = "获得过的星魂    点击可收录，收录后可再生成。";
         } else if (var2 == 86) {
            var14 = "巰锩";
            var14 = "左键";
         } else {
            var14 = "笠纕";
            var14 = "等级";
         }

         var10.setText(var14);
         this.add(this.ch[var2]);
         if (var2 >= 0 && var2 <= 5) {
            JLabel var11 = this.ch[var2];
            var14 = "5dSAS5UC";
            var11.setForeground(Class49.c("#cEFE2CD"));
         } else if (var2 >= 6 && var2 <= 11) {
            this.ch[var2].setBounds(54, 85 + 51 * (var2 - 6), 36, 18);
         } else if (var2 >= 12 && var2 <= 17) {
            this.ch[var2].setBounds(56, 85 + 51 * (var2 - 12), 36, 18);
         } else if (var2 >= 18 && var2 <= 23) {
            this.ch[var2].setBounds(54, 84 + 51 * (var2 - 18), 36, 18);
         } else if (var2 >= 24 && var2 <= 29) {
            this.ch[var2].setBounds(56, 84 + 51 * (var2 - 24), 36, 18);
         } else if (var2 >= 30 && var2 <= 35) {
            this.ch[var2].setBounds(54, 86 + 51 * (var2 - 30), 36, 18);
         } else if (var2 >= 36 && var2 <= 41) {
            this.ch[var2].setBounds(56, 86 + 51 * (var2 - 36), 36, 18);
         } else if (var2 >= 42 && var2 <= 47) {
            this.ch[var2].setFont(Class49.ab);
            JLabel var26 = this.ch[var2];
            String var35 = "JQ/\u0002,pZq";
            var26.setForeground(Class49.c("#cF0EB3C"));
            this.ch[var2].setBounds(94, 85 + 51 * (var2 - 42), 18, 18);
         } else if (var2 >= 48 && var2 <= 83) {
            this.ch[var2].setFont(Class49.ab);
            JLabel var25 = this.ch[var2];
            String var34 = "5dW5/3!2";
            var25.setForeground(Class49.c("#cA29475"));
            if (var2 >= 48 && var2 <= 53) {
               this.ch[var2].setBounds(93, 85 + 51 * (var2 - 48), 18, 18);
            } else if (var2 >= 54 && var2 <= 59) {
               this.ch[var2].setBounds(95, 85 + 51 * (var2 - 54), 18, 18);
            } else if (var2 >= 60 && var2 <= 65) {
               this.ch[var2].setBounds(93, 84 + 51 * (var2 - 60), 18, 18);
            } else if (var2 >= 66 && var2 <= 71) {
               this.ch[var2].setBounds(95, 84 + 51 * (var2 - 66), 18, 18);
            } else if (var2 >= 72 && var2 <= 77) {
               this.ch[var2].setBounds(93, 86 + 51 * (var2 - 72), 18, 18);
            } else if (var2 >= 78 && var2 <= 83) {
               this.ch[var2].setBounds(95, 86 + 51 * (var2 - 78), 18, 18);
            }
         } else if (var2 == 84) {
            JLabel var23 = this.ch[var2];
            String var31 = "JQY\u0002Y\u0002Y\u0002";
            var23.setForeground(Class49.c("#c000000"));
            this.ch[var2].setBounds(45, 394, 36, 19);
         } else if (var2 == 85) {
            JLabel var32 = this.ch[var2];
            String var10003 = "5d&7&7&7";
            var32.setForeground(Class49.c("#c000000"));
            this.ch[var2].setHorizontalAlignment(10);
            this.ch[var2].setBounds(50, 20, 380, 20);
         } else if (var2 == 86) {
            JLabel var24 = this.ch[var2];
            String var33 = "JQ/tY\u0002Y\u0002";
            var24.setForeground(Class49.c("#cFF0000"));
            this.ch[var2].setBounds(154, 20, 36, 20);
         }
      }

      this.ef = new MoneyType();
      String var46 = "魔倻";
      this.ef.setIdAndKey(0, "魂值");
      this.zs = com.xy.q.Class1.m(87, 394, 84, 19, 10, Color.white, Class49.w, this.ef, var1);
      String var10005 = "A\n\u001d\r\u001dX\u0005GB\u0007U";
      this.zs.mt(com.xy.w.Class16.m("sc/d/17.png", 6, 6, 6, 6, false));
      this.add(this.zs);
      this.ar = new com.xy.w.Class18[2];

      for (int var12 = var2 = 0; var12 < this.ar.length; var12 = ++var2) {
         this.ar[var2] = new com.xy.w.Class18();
         this.add(this.ar[var2]);
         if (var2 == 0) {
            com.xy.w.Class18 var38 = this.ar[var2];
            String var40 = "tu(r('>8wx`";
            var38.mt(com.xy.w.Class16.m("sc/d/19.png", 5, 5, 5, 5, false));
            this.ar[var2].setBounds(114, 67, 309, 309);
            com.xy.v.Class8 var3 = this.yt();
            String var29 = "A\n\u001d\r\u001dX\nGB\u0007U";
            Image var4 = com.xy.w.Class16.c("sc/d/18.png");
            this.asz = new Class19[36];

            int var5;
            for (int var13 = var5 = 0; var13 < this.asz.length; var13 = var5) {
               this.asz[var5] = new Class19(var5 + 1, var4, true, var3, this);
               this.asz[var5].setBounds(115 + var5 % 6 * 51, 69 + var5 / 6 * 51, 51, 51);
               this.add(this.asz[var5++]);
            }
         } else if (var2 == 1) {
            com.xy.w.Class18 var28 = this.ar[var2];
            String var36 = "tu(r(%18wx`";
            var28.mt(com.xy.w.Class16.m("sc/d/36.png", 30, 30, 30, 30, false));
            this.ar[var2].setBounds(46, 57, 390, 330);
         }
      }
   }
}
