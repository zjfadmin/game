package com.xy.a;

import com.xy.battle.BattleControl;
import com.xy.battle.BattleScene;
import com.xy.text.GameView;
import java.awt.Point;
import javax.swing.JLabel;

public class Class40 extends com.xy.q.Class30 {
   private JLabel[] o;
   private com.xy.w.Class18[] cl;

   public void h() {
      BattleControl var1;
      BattleScene var2;
      if ((var2 = (var1 = this.afx.getBattleControl()).battleScene) != null && var2.battleTip) {
         JLabel var10000 = this.o[0];
         StringBuilder var10001 = new StringBuilder(String.valueOf(var2.battleRoundMax));
         String var10002 = "囙吂不陚";
         var10000.setText(var10001.append("回合上限").toString());
         boolean var3 = var1.battleCamp == -1 || var1.battleCamp == 1;
         this.o[5].setText(String.valueOf(var3 ? var2.campPetDie2 : var2.campPetDie1));
         this.o[7].setText(String.valueOf(var3 ? var2.campLingDie2 : var2.campLingDie1));
         this.o[6].setText(String.valueOf(var3 ? var2.campPetDie1 : var2.campPetDie2));
         this.o[8].setText(String.valueOf(var3 ? var2.campLingDie1 : var2.campLingDie2));
         var10000 = this.o[9];
         String var9;
         if (var1.battleCamp == -1) {
            String var8 = ">丗觐觾?";
            var9 = "(主视角)";
         } else {
            String var10 = "/戛斾#";
            var9 = "(我方)";
         }

         var10000.setText(var9);
         var10000 = this.o[10];
         String var12;
         if (var1.battleCamp == -1) {
            String var11 = ">丗觐觾?";
            var12 = "(主视角)";
         } else {
            String var13 = "/戛斾#";
            var12 = "(我方)";
         }

         var10000.setText(var12);
         this.o[11].setText(var3 ? var2.campName2 : var2.campName1);
         this.o[12].setText(var3 ? var2.campName1 : var2.campName2);
         int var4 = this.getWidth();
         int var5 = this.getHeight();
         Point var14 = this.ze().dd(var4, var5);
         this.yv(var14.x, var14.y, var4, var5);
         this.zc().b(this.lj());
      }
   }

   public Class40(GameView var1) {
      super(161, 5, com.xy.q.Class30.afz, var1);
      String var10003 = "yd%c%33)zim";
      this.yy(-1, 0, 298, 200, com.xy.q.Class30.agf);
      this.yu(com.xy.w.Class16.m("sc/d/49.png", 5, 5, 5, 5, false), null);
      this.o = new JLabel[13];

      int var2;
      for (int var10000 = var2 = 0; var10000 < this.o.length; var10000 = ++var2) {
         String var10007 = "\u000fujPjP\u001c&";
         this.o[var2] = com.xy.q.Class1.k(9, 43, 280, 20, com.xy.q.Class49.c("#cFFFF00"), com.xy.q.Class49.w);
         JLabel var4 = this.o[var2];
         String var8;
         if (var2 == 0) {
            var8 = "3>3囙吂不陚";
            var8 = "999回合上限";
         } else if (var2 == 1) {
            var8 = "涞耻叺唈八敜釙";
            var8 = "消耗召唤兽数量";
         } else if (var2 == 2) {
            var8 = "涏耝灲宗敷釅";
            var8 = "消耗灵宝数量";
         } else if (var2 == 3 || var2 == 4) {
            var8 = "，";
            var8 = "：";
         } else if (var2 >= 5 && var2 <= 8) {
            var8 = "?丠";
            var8 = "8个";
         } else if (var2 == 9 || var2 == 10) {
            var8 = "Ｄ戇斕？";
            var8 = "（我方）";
         } else if (var2 == 11) {
            var8 = "孡乪亣测组乪";
            var8 = "学习交流练习";
         } else if (var2 == 12) {
            var8 = "绯乶丘摯臆孰";
            var8 = "练习临摹自学";
         } else {
            var8 = "";
         }

         var4.setText(var8);
         this.o[var2].setHorizontalAlignment(0);
         this.add(this.o[var2]);
         if (var2 == 1 || var2 == 2) {
            this.o[var2].setBounds(9, 75 + (var2 - 1) * 66, 280, 20);
            JLabel var6 = this.o[var2];
            var8 = "$iAHC249";
            var6.setForeground(com.xy.q.Class49.c("#cFBD833"));
         } else if (var2 == 3 || var2 == 4) {
            this.o[var2].setBounds(9, 102 + (var2 - 3) * 66, 280, 20);
            JLabel var20 = this.o[var2];
            String var26 = "\u000fujPjPjP";
            var20.setForeground(com.xy.q.Class49.c("#cFFFFFF"));
            this.o[var2].setFont(com.xy.q.Class49.f);
         } else if (var2 >= 5 && var2 <= 8) {
            this.o[var2].setBounds(49 + (var2 - 5) % 2 * 95, 101 + (var2 - 5) / 2 * 66, 100, 22);
            JLabel var19 = this.o[var2];
            String var25 = "$iB2CNDO";
            var19.setForeground(com.xy.q.Class49.c("#cE8DDCE"));
            this.o[var2].setFont(com.xy.q.Class49.f);
         } else if (var2 == 9 || var2 == 10) {
            this.o[var2].setBounds(211, 101 + (var2 - 9) * 66, 69, 22);
            JLabel var5 = this.o[var2];
            var8 = "\u000fuoUoUoU";
            var5.setForeground(com.xy.q.Class49.c("#cCCCCCC"));
         } else if (var2 == 11) {
            this.o[var2].setBounds(10, 9, 120, 20);
            JLabel var16 = this.o[var2];
            String var10002 = "$iALALAL";
            var16.setForeground(com.xy.q.Class49.c("#cFFFFFF"));
            this.o[var2].setHorizontalAlignment(10);
         } else if (var2 == 12) {
            this.o[var2].setBounds(168, 9, 120, 20);
            JLabel var17 = this.o[var2];
            String var24 = "\u000fujPjPjP";
            var17.setForeground(com.xy.q.Class49.c("#cFFFFFF"));
            this.o[var2].setHorizontalAlignment(4);
         }
      }

      this.cl = new com.xy.w.Class18[2];

      for (int var7 = var2 = 0; var7 < this.cl.length; var7 = ++var2) {
         this.cl[var2] = new com.xy.w.Class18();
         this.add(this.cl[var2]);
         if (var2 == 0) {
            com.xy.w.Class18 var22 = this.cl[var2];
            String var27 = "yd%c%>9)zim";
            var22.dp("sc/d/93.png");
            this.cl[var2].setBounds(2, 2, 294, 36);
         } else if (var2 == 1) {
            com.xy.w.Class18 var23 = this.cl[var2];
            String var28 = "eO9H9\u001a \u0002fBq";
            var23.mt(com.xy.w.Class16.m("sc/d/66.png", 50, 1, 50, 1, false));
            this.cl[var2].setBounds(49, 132, 205, 2);
         }
      }
   }
}
