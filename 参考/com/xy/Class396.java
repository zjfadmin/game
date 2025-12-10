package com.xy;

import com.xy.richtext.RichLabel;
import com.xy.text.GameView;
import java.awt.Color;
import javax.swing.JLabel;

public class Class396 extends Class345 {
   private RichLabel z;
   private Class70[] da;
   private JLabel[] c;
   private Class70[] db;
   private RichLabel bw;
   private Class217[] dc;
   private Class436[] g;

   public Class396(GameView var1) {
      int var10001 = --3;
      int var10005 = -4 >> 2;
      super(16301 & 17658, 5 >> 1, Class345.aef, var1);
      this.va(var10005, 3 & 4, 15319 & 18303, 32380 & 963, Class345.aeo);
      this.uv(Class511.q("sc/music/204.a", 3 & 4, 3 & 4, 3 & 4, 3 & 4, (boolean)(3 >> 2)), (String)null);
      Class70[] var3 = new Class70[var10001];
      boolean var10003 = true;
      this.db = var3;

      int var10000;
      int var2;
      for(var10000 = var2 = 5 >> 3; var10000 < this.db.length; var10000 = var2) {
         this.db[var2] = new Class70("sc/music/193.b", 5 >> 1, --3, Class681.b, Class681.bb, "", this);
         this.db[var2].setBounds(18238 & 15315, (103 & 95) + (30709 & 2191) * var2, 123 & 54, 15847 & 17055);
         this.db[var2].setText(var2 == 0 ? "结缘之卷" : (var2 == (2 ^ 3) ? "契印之卷" : (var2 == (1 ^ 3) ? "结缘奖励 " : "")));
         this.add(this.db[var2]);
         if (var2 == (3 & 5)) {
            this.db[var2].setKeep((boolean)(3 & 5));
         }

         ++var2;
      }

      var3 = new Class70[23 & 111];
      var10003 = true;
      this.da = var3;

      for(var10000 = var2 = 3 >> 2; var10000 < this.da.length; var10000 = var2) {
         this.da[var2] = new Class70("sc/music/195.b", --1, --3, Class681.ab, (Color[])null, "", this);
         this.da[var2].setBounds((111 & 115) + (126 & 93) * var2, 61 & 115, 95 & 122, 91 & 60);
         this.da[var2].setText(var2 == 0 ? " 契约状态   " : (var2 == (3 & 5) ? " 契约等级   " : (var2 == --2 ? "改" : (var2 == --4 ? "兑换" : (var2 == (86 & 47) ? "切换" : "")))));
         this.add(this.da[var2]);
         if (var2 >= 0 && var2 <= --1) {
            this.da[var2].setForeground(Class681.c("#c214248"));
         }

         if (var2 == (4 ^ 5)) {
            this.da[var2].setImage("sc/music/196.b");
         } else if (var2 != --2 && var2 != --4 && var2 != (30 & 103)) {
            if (var2 == --3) {
               this.da[var2].setBounds(386, 49, 24, 24);
               this.da[var2].setImage("sc/music/198.b");
            } else if (var2 == --5) {
               this.da[var2].setBounds(800, --5, 35, 34);
               this.da[var2].setImage("sc/music/199.b");
            }
         } else {
            this.da[var2].setImage("sc/music/197.b");
            this.da[var2].setFont(Class681.bh);
            this.da[var2].setForeground(Class681.c("#c304340"));
            if (var2 == --2) {
               this.da[var2].setBounds(332, 516, 21, 23);
            } else if (var2 == --4) {
               this.da[var2].setBounds(782, 530, 49, 23);
            } else if (var2 == 6) {
               this.da[var2].setBounds(358, 516, 49, 23);
            }
         }

         ++var2;
      }

      Class217[] var4 = new Class217[2];
      var10003 = true;
      this.dc = var4;

      for(var10000 = var2 = 2 & 5; var10000 < this.dc.length; var10000 = var2) {
         this.dc[var2] = Class133.n(Class511.q("sc/e/29.png", 6, 6, 6, 6, (boolean)(3 & 4)), Class681.ab, Color.white);
         this.dc[var2].setHorizontalAlignment(10);
         this.dc[var2].setBounds(291, 50, 118, 19);
         this.add(this.dc[var2]);
         if (var2 == 3 >> 1) {
            this.dc[var2].setBounds(220, 517, 130, 17);
         }

         ++var2;
      }

      this.bw = new RichLabel("", Class681.q);
      this.bw.setTextSize("#c535441学习练习交流临摹学习练习交流临摹学习练习交流临摹。", 150);
      this.bw.setBounds(615, 92, this.bw.getWidth(), this.bw.getHeight());
      this.add(this.bw);
      this.z = new RichLabel("", Class681.ab);
      this.z.setTextSize("#c57442D学习练习交流临摹学习练习交流临摹学习练习交流临摹。", 220);
      this.z.setBounds(538, 351, this.z.getWidth(), this.z.getHeight());
      this.add(this.z);
      JLabel[] var5 = new JLabel[24];
      var10003 = true;
      this.c = var5;

      for(var10000 = var2 = 5 >> 3; var10000 < this.c.length; var10000 = var2) {
         this.c[var2] = Class133.b(459, 150, 120, 24, Class681.c("#c57442d"), Class681.cg);
         this.c[var2].setText(var2 == 0 ? "学习交流" : (var2 == --1 ? "技能效果" : (var2 == 2 ? "未解锁" : (var2 == 3 ? "契印升级条件" : (var2 == 4 ? "一级" : (var2 == 5 ? "二级" : (var2 == 6 ? "三级" : (var2 >= 7 && var2 <= 12 ? "学习练习" : (var2 >= 13 && var2 <= 18 ? "未解锁" : (var2 == 19 ? "结契对象" : (var2 == 20 ? "未选择" : (var2 == 21 ? "结缘等级" : (var2 == 22 ? "0" : (var2 == 23 ? "缘念积分:0" : ""))))))))))))));
         this.c[var2].setHorizontalAlignment(3 & 4);
         this.add(this.c[var2]);
         if (var2 == 5 >> 2) {
            this.c[var2].setBounds(628, 73, 120, 20);
         } else if (var2 == 2) {
            this.c[var2].setBounds(459, 174, 120, 20);
            this.c[var2].setFont(Class681.q);
            this.c[var2].setForeground(Class681.c("#c6B5423"));
         } else if (var2 == 3) {
            this.c[var2].setBounds(440, 319, 339, 25);
            this.c[var2].setForeground(Class681.c("#cFFFFFF"));
         } else if (var2 >= 4 && var2 <= 6) {
            this.c[var2].setBounds(441, 362 + (var2 - 4) * 52, 50, 20);
            this.c[var2].setFont(Class681.q);
            this.c[var2].setForeground(Class681.c("#c6B5323"));
         } else if (var2 >= 7 && var2 <= 12) {
            this.c[var2].setHorizontalAlignment(10);
            this.c[var2].setBounds(177, 89 + (var2 - 7) * 66, 120, 20);
            this.c[var2].setFont(Class681.q);
            this.c[var2].setForeground(Class681.c("#c4F6066"));
         } else if (var2 >= 13 && var2 <= 18) {
            this.c[var2].setHorizontalAlignment(4);
            this.c[var2].setBounds(261, 89 + (var2 - 13) * 66, 120, 20);
            this.c[var2].setFont(Class681.q);
            this.c[var2].setForeground(Class681.c("#c4F6066"));
         } else if (var2 == 19) {
            this.c[var2].setBounds(462, 238, 100, 24);
            this.c[var2].setFont(Class681.cg);
         } else if (var2 == 20) {
            this.c[var2].setBounds(659, 270, 50, 16);
            this.c[var2].setFont(Class681.ab);
            this.c[var2].setForeground(Class681.c("#c6B5423"));
         } else if (var2 == 21) {
            this.c[var2].setBounds(23, 538, 80, 22);
            this.c[var2].setFont(Class681.ch);
            this.c[var2].setForeground(Class681.c("#cE1EBCA"));
         } else if (var2 == 22) {
            this.c[var2].setBounds(37, 491, 50, 50);
            this.c[var2].setFont(Class681.br);
            this.c[var2].setForeground(Class681.c("#cD6EBCE"));
         } else if (var2 == 23) {
            this.c[var2].setBounds(670, 534, 100, 15);
            this.c[var2].setFont(Class681.ab);
            this.c[var2].setForeground(Class681.c("#cFFFFFF"));
         }

         ++var2;
      }

      Class436[] var6 = new Class436[35];
      var10003 = true;
      this.g = var6;

      for(var10000 = var2 = 3 >> 2; var10000 < this.g.length; var10000 = var2) {
         this.g[var2] = new Class436();
         this.add(this.g[var2]);
         if (var2 == 0) {
            this.g[var2].fw("sc/d/139.png");
            this.g[var2].setBounds(6, 539, 111, 21);
         } else if (var2 == 1) {
            this.g[var2].fw("sc/music/207.a");
            this.g[var2].setBounds(16, 471, 92, 92);
         } else if (var2 == 2) {
            this.g[var2].fw("sc/music/227.a");
            this.g[var2].setBounds(110, 80, 287, 68);
         } else if (var2 >= 3 && var2 <= 8) {
            this.g[var2].fw("sc/d/77.png");
            this.g[var2].setBounds(125, 95 + (var2 - 3) * 66, 35, 35);
         } else if (var2 >= 9 && var2 <= 14) {
            this.g[var2].fw("sc/d/118.png");
            this.g[var2].setBounds(177, 111 + (var2 - 9) * 66, 22, 22);
         } else if (var2 >= 15 && var2 <= 20) {
            this.g[var2].fw("sc/music/223.a");
            this.g[var2].setBounds(114, 84 + (var2 - 15) * 66, 281, 63);
         } else if (var2 == 21) {
            this.g[var2].eq(Class511.q("sc/music/210.a", 2, 8, 2, 8, false));
            this.g[var2].setBounds(398, 84, 10, 225);
         } else if (var2 == 22) {
            this.g[var2].eq(Class511.q("sc/music/211.a", 2, 10, 2, 10, false));
            this.g[var2].setBounds(400, 84, 7, 413);
         } else if (var2 == 23) {
            this.g[var2].fw("sc/d/77.png");
            this.g[var2].setBounds(490, 79, 56, 56);
         } else if (var2 == 24) {
            this.g[var2].fw("sc/music/225.a");
            this.g[var2].setBounds(483, 71, 71, 71);
         } else if (var2 == 25) {
            this.g[var2].fw("sc/d/167.png");
            this.g[var2].setBounds(587, 81, 195, 5);
         } else if (var2 >= 26 && var2 <= 27) {
            this.g[var2].fw("sc/music/222.a");
            this.g[var2].setBounds(662 + (var2 - 26) * 47, 225, 45, 44);
         } else if (var2 == 28) {
            this.g[var2].fw("sc/music/224.a");
            this.g[var2].setBounds(446, 200, 326, 100);
         } else if (var2 == 29) {
            this.g[var2].eq(Class511.q("sc/d/132.png", 50, 50, 50, 50, false));
            this.g[var2].setBounds(435, 34, 352, 280);
         } else if (var2 == 30) {
            this.g[var2].fw("sc/music/226.a");
            this.g[var2].setBounds(440, 319, 341, 196);
         } else if (var2 >= 31 && var2 <= 32) {
            this.g[var2].eq(Class511.q("sc/d/66.png", 50, 1, 50, 1, false));
            this.g[var2].setBounds(449, 398 + (var2 - 31) * 53, 292, 2);
         } else if (var2 == 33) {
            this.g[var2].fw("sc/d/139.png");
            this.g[var2].setBounds(653, 531, 135, 20);
         } else if (var2 == 34) {
            this.g[var2].fw("sc/music/228.a");
            this.g[var2].setBounds(58, 0, 395, 576);
         }

         ++var2;
      }

   }
}
