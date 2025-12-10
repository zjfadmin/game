package com.xy;

import com.xy.richtext.RichLabel;
import com.xy.scene.BWDHTeam;
import com.xy.text.GameView;
import javax.swing.JLabel;

public class Class667 extends Class345 {
   private RichLabel aj;
   private JLabel[] c;
   private JLabel[] hj;
   private Class436[] e;
   private RichLabel acv;
   private RichLabel gi;

   public Class667(GameView var1) {
      int var10001 = 63 & 80;
      int var10006 = -4 >> 2;
      super(25075 & 7870, 1 ^ 3, Class345.aef, var1);
      this.va(var10006, 2 & 5, 23551 & 9963, 20863 & 12287, Class345.aeo);
      this.uv(Class511.q("sc/d/189.png", 3 & 4, 3 & 4, 3 & 4, 3 & 4, (boolean)(5 >> 3)), (String)null);
      this.ad(new Class116(3 & 4, 3 & 4, 127 & 25, 3 & 4));
      JLabel[] var4 = new JLabel[var10001];
      boolean var10003 = true;
      this.hj = var4;

      int var10000;
      int var2;
      Class667 var3;
      for(var10000 = var2 = 2 & 5; var10000 < this.hj.length; var10000 = var2) {
         this.hj[var2] = Class133.b(25850 & 7111, 91 & 55, 24428 & 8699, 127 & 30, Class681.c("#cFFF28B"), Class681.cm);
         this.hj[var2].setText(var2 == 0 ? "战斗回合数：99" : (var2 == (2 ^ 3) ? "队伍名称1" : (var2 == (1 ^ 3) ? "队伍名称2" : (var2 == --3 ? "比武大会积分数" : (var2 == --4 ? "战斗结束时存活单位数" : (var2 == --5 ? "全场离场召唤兽" : (var2 == (23 & 110) ? "战斗结束时在场灵宝数" : (var2 == (47 & 87) ? "全场离场灵宝数" : ""))))))));
         this.hj[var2].setHorizontalAlignment(3 >> 2);
         if (var2 != (2 ^ 3) && var2 != --2) {
            if (var2 >= --3 && var2 <= 7) {
               this.hj[var2].setFont(Class681.ab);
               this.hj[var2].setBounds(211, 186 + (var2 - --3) * 25, 326, 20);
            }

            var3 = this;
         } else {
            var3 = this;
            this.hj[var2].setFont(Class681.ch);
            this.hj[var2].setForeground(Class681.c("#cFFFFFF"));
            this.hj[var2].setBounds((24758 & 8157) + (var2 - (4 ^ 5)) * (31231 & 1805), 127 & 126, 15870 & 17079, 126 & 45);
         }

         var3.add(this.hj[var2++]);
      }

      this.aj = new RichLabel("#cD1C3421000(#G+100#cD1C342)", Class681.ab, 90);
      this.gi = new RichLabel("#cD1C342(#R-100#cD1C342)1000", Class681.ab, 90);
      this.aj.setBounds(240, 185, 90, 20);
      this.gi.setBounds(507 - this.gi.getWidth(), 185, 90, 20);
      this.add(this.aj);
      this.add(this.gi);
      var4 = new JLabel[8];
      var10003 = true;
      this.c = var4;

      for(var10000 = var2 = 3 >> 2; var10000 < this.c.length; var10000 = var2) {
         this.c[var2] = Class133.b(240 + var2 / --4 * 237, 211 + var2 % --4 * 25, 30, 20, Class681.c("#cD1C342"), Class681.ab);
         this.c[var2].setText("0");
         this.c[var2].setHorizontalAlignment(var2 < --4 ? 10 : 4);
         this.add(this.c[var2++]);
      }

      this.acv = new RichLabel("", Class681.ab, 747);
      this.add(this.acv);
      Class436[] var5 = new Class436[12];
      var10003 = true;
      this.e = var5;

      for(var10000 = var2 = 2 & 5; var10000 < this.e.length; var10000 = var2) {
         this.e[var2] = new Class436();
         if (var2 == 0) {
            var3 = this;
            this.e[var2].fw("sc/d/191.png");
            this.e[var2].setBounds(342, 103, 64, 84);
         } else if (var2 == (2 ^ 3)) {
            var3 = this;
            this.e[var2].fw("sc/d/192.png");
            this.e[var2].setBounds(196, 73, 86, 45);
         } else if (var2 == 5 >> 1) {
            var3 = this;
            this.e[var2].fw("sc/d/193.png");
            this.e[var2].setBounds(463, 73, 90, 47);
         } else if (var2 != --3 && var2 != --4) {
            if (var2 != 5 && var2 != 6) {
               if (var2 >= 7 && var2 <= 11) {
                  this.e[var2].fw("sc/d/139.png");
                  this.e[var2].setBounds(211, 186 + (var2 - 7) * 25, 326, 20);
               }

               var3 = this;
            } else {
               var3 = this;
               this.e[var2].fw("sc/d/66.png");
               this.e[var2].setBounds(115, 56 + (var2 - 5) * 251, 561, 2);
            }
         } else {
            var3 = this;
            this.e[var2].fw("sc/d/194.png");
            this.e[var2].setBounds(148 + (var2 - --3) * 269, 126, 182, 51);
         }

         var3.add(this.e[var2++]);
      }

   }

   public void amw(boolean var1, int var2, int var3, BWDHTeam var4, BWDHTeam var5, String var6) {
      this.hj[2 & 5].setText("战斗回合数：" + var3);
      this.hj[--1].setText(var4.getName());
      this.hj[5 >> 1].setText(var5.getName());
      BWDHTeam var10000;
      if (var4.getData2()[2 ^ 3] != 0) {
         this.aj.setTextSize("#cD1C342" + var4.getData2()[3 >> 2] + "(" + (var4.getData2()[4 ^ 5] > 0 ? "#G" : "#R") + var4.getData2()[5 >> 2] + "#cD1C342)", 123 & 94);
         var10000 = var5;
      } else {
         this.aj.setTextSize("#cD1C342" + var4.getData2()[3 >> 2], 94 & 123);
         var10000 = var5;
      }

      Class667 var8;
      if (var10000.getData2()[--1] != 0) {
         this.gi.setTextSize("#cD1C342(" + (var5.getData2()[5 >> 2] > 0 ? "#G" : "#R") + var5.getData2()[3 & 5] + "#cD1C342)" + var5.getData2()[3 >> 2], 90 & 127);
         var8 = this;
      } else {
         var8 = this;
         this.gi.setTextSize("#cD1C342" + var5.getData2()[3 ^ 3], 95 & 122);
      }

      var8.gi.setBounds((1019 & 32255) - this.gi.getWidth(), 24313 & 8639, 127 & 90, 28 & 119);

      for(int var9 = var2 = 2 & 5; var9 < 2; var9 = var2) {
         var3 = var2 == 0 ? 3 ^ 3 : 4;
         BWDHTeam var7 = var2 == 0 ? var4 : var5;
         this.c[var3 + (3 >> 2)].setText(String.valueOf(var7.getData2()[1 ^ 3]));
         this.c[var3 + (3 >> 1)].setText(String.valueOf(var7.getData2()[--3]));
         this.c[var3 + (5 >> 1)].setText(String.valueOf(var7.getData2()[--4]));
         JLabel var10 = this.c[var3 + --3];
         int[] var10001 = var7.getData2();
         int var10002 = --5;
         ++var2;
         var10.setText(String.valueOf(var10001[var10002]));
      }

      String var11;
      if (var1) {
         this.e[2 ^ 3].fw("sc/d/192.png");
         var11 = var6;
         this.e[--2].fw("sc/d/193.png");
         this.e[--1].setBounds(10959 & 22004, 91 & 109, 119 & 94, 47 & 125);
         this.e[--2].setBounds(32719 & 511, 111 & 89, 95 & 122, 63 & 111);
      } else {
         this.e[--1].fw("sc/d/193.png");
         var11 = var6;
         this.e[1 ^ 3].fw("sc/d/192.png");
         this.e[--1].setBounds(194, 73, 90, 47);
         this.e[1 ^ 3].setBounds(465, 73, 86, 45);
      }

      if (!Class394.o(var11)) {
         this.acv.setTextSize("#W" + var6, 747);
         var8 = this;
      } else {
         this.acv.setTextSize((String)null, 747);
         var8 = this;
      }

      var8.acv.setBounds((747 - this.acv.getWidth()) / --2, 326, this.acv.getWidth(), 20);
      this.ve().a(this.ae());
   }
}
