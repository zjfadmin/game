package com.xy;

import com.xy.game.RoleData;
import com.xy.readbean.MoneyType;
import com.xy.richtext.RichLabel;
import com.xy.text.GameView;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.JLabel;

public class Class247 extends Class345 {
   private MoneyType np;
   private JLabel[] iv;
   private Class556 yk;
   private Class489[] ci;
   private RichLabel bw;
   private Class282[] azf;
   private Class436[] g;

   public void q() {
      this.d();
      this.yk.cc();
      super.q();
   }

   public Class247(GameView var1) {
      int var10001 = 5 >> 1;
      int var10009 = -4 >> 2;
      super(8639 & 24266, 5 >> 1, Class345.aef, var1);
      this.va(var10009, 3 ^ 3, 7119 & 26110, 2559 & 30653, Class345.aeo);
      this.uv(Class511.q("sc/d/1.png", 101 & 94, 101 & 94, 101 & 94, 101 & 94, (boolean)(3 >> 2)), "星盘");
      this.bw = new RichLabel("", Class681.ab);
      this.bw.setTextSize("#c000000提示：星魂还可赠与NPC:“#cFF0000亚克西#c000000”“#cFF0000阿拉木汗#c000000”获得友好度。", 12157 & 20990);
      this.bw.setBounds(119 & 59, 39 & 126, this.bw.getWidth(), this.bw.getHeight());
      this.add(this.bw);
      Class489[] var7 = new Class489[var10001];
      boolean var10003 = true;
      this.ci = var7;

      int var2;
      int var10000;
      for(var10000 = var2 = 3 >> 2; var10000 < this.ci.length; var10000 = var2) {
         Class489[] var6 = this.ci;
         Class489 var10002 = new Class489;
         int var10005 = --1;
         int var10006 = (47 & 112) + var2;
         Font var10007 = Class681.ak;
         Color[] var10008 = Class681.c;
         String var12;
         Class247 var10010;
         if (var2 == 0) {
            var12 = "转化";
            var10010 = this;
         } else if (var2 == (2 ^ 3)) {
            var12 = "重炼";
            var10010 = this;
         } else {
            var12 = "";
            var10010 = this;
         }

         var10002.<init>("sc/e/7.png", var10005, var10006, var10007, var10008, var12, var10010);
         var6[var2] = var10002;
         this.ci[var2].setBounds((28382 & 4603) + (103 & 127) * var2, 21898 & 11261, 123 & 63, 93 & 59);
         this.add(this.ci[var2++]);
      }

      JLabel[] var8 = new JLabel[95 & 119];
      var10003 = true;
      this.iv = var8;

      for(var10000 = var2 = 3 >> 2; var10000 < this.iv.length; var10000 = var2) {
         this.iv[var2] = Class133.c(55 & 127, (87 & 125) + 51 * var2, 36, 18, 3 & 4, Class681.c("#cA29577"), Class681.ak);
         this.iv[var2].setText(var2 != 42 && var2 != 48 && var2 != 54 && var2 != 60 && var2 != 66 && var2 != 72 && var2 != 78 ? (var2 != 43 && var2 != 49 && var2 != 55 && var2 != 61 && var2 != 67 && var2 != 73 && var2 != 79 ? (var2 != 44 && var2 != 50 && var2 != 56 && var2 != 62 && var2 != 68 && var2 != 74 && var2 != 80 ? (var2 != 45 && var2 != 51 && var2 != 57 && var2 != 63 && var2 != 69 && var2 != 75 && var2 != 81 ? (var2 != 46 && var2 != 52 && var2 != 58 && var2 != 64 && var2 != 70 && var2 != 76 && var2 != 82 ? (var2 != 47 && var2 != 53 && var2 != 59 && var2 != 65 && var2 != 71 && var2 != 77 && var2 != 83 ? (var2 == 84 ? "魂值" : (var2 == 85 ? "获得过的星魂    点击可收录，收录后可再生成。" : (var2 == 86 ? "左键" : "等级"))) : "6") : "5") : "4") : "3") : "2") : "1");
         this.add(this.iv[var2]);
         if (var2 >= 0 && var2 <= --5) {
            this.iv[var2].setForeground(Class681.c("#cEFE2CD"));
         } else if (var2 >= 6 && var2 <= 11) {
            this.iv[var2].setBounds(54, 85 + 51 * (var2 - 6), 36, 18);
         } else if (var2 >= 12 && var2 <= 17) {
            this.iv[var2].setBounds(56, 85 + 51 * (var2 - 12), 36, 18);
         } else if (var2 >= 18 && var2 <= 23) {
            this.iv[var2].setBounds(54, 84 + 51 * (var2 - 18), 36, 18);
         } else if (var2 >= 24 && var2 <= 29) {
            this.iv[var2].setBounds(56, 84 + 51 * (var2 - 24), 36, 18);
         } else if (var2 >= 30 && var2 <= 35) {
            this.iv[var2].setBounds(54, 86 + 51 * (var2 - 30), 36, 18);
         } else if (var2 >= 36 && var2 <= 41) {
            this.iv[var2].setBounds(56, 86 + 51 * (var2 - 36), 36, 18);
         } else if (var2 >= 42 && var2 <= 47) {
            this.iv[var2].setFont(Class681.cd);
            this.iv[var2].setForeground(Class681.c("#cF0EB3C"));
            this.iv[var2].setBounds(94, 85 + 51 * (var2 - 42), 18, 18);
         } else if (var2 >= 48 && var2 <= 83) {
            this.iv[var2].setFont(Class681.cd);
            this.iv[var2].setForeground(Class681.c("#cA29475"));
            if (var2 >= 48 && var2 <= 53) {
               this.iv[var2].setBounds(93, 85 + 51 * (var2 - 48), 18, 18);
            } else if (var2 >= 54 && var2 <= 59) {
               this.iv[var2].setBounds(95, 85 + 51 * (var2 - 54), 18, 18);
            } else if (var2 >= 60 && var2 <= 65) {
               this.iv[var2].setBounds(93, 84 + 51 * (var2 - 60), 18, 18);
            } else if (var2 >= 66 && var2 <= 71) {
               this.iv[var2].setBounds(95, 84 + 51 * (var2 - 66), 18, 18);
            } else if (var2 >= 72 && var2 <= 77) {
               this.iv[var2].setBounds(93, 86 + 51 * (var2 - 72), 18, 18);
            } else if (var2 >= 78 && var2 <= 83) {
               this.iv[var2].setBounds(95, 86 + 51 * (var2 - 78), 18, 18);
            }
         } else if (var2 == 84) {
            this.iv[var2].setForeground(Class681.c("#c000000"));
            this.iv[var2].setBounds(45, 394, 36, 19);
         } else if (var2 == 85) {
            this.iv[var2].setForeground(Class681.c("#c000000"));
            this.iv[var2].setHorizontalAlignment(10);
            this.iv[var2].setBounds(50, 20, 380, 20);
         } else if (var2 == 86) {
            this.iv[var2].setForeground(Class681.c("#cFF0000"));
            this.iv[var2].setBounds(154, 20, 36, 20);
         }

         ++var2;
      }

      var10001 = --2;
      this.np = new MoneyType();
      this.np.setIdAndKey(2 & 5, "魂值");
      this.yk = Class133.m(87, 394, 84, 19, 10, Color.white, Class681.q, this.np, var1);
      this.yk.eq(Class511.q("sc/d/17.png", 6, 6, 6, 6, (boolean)(3 ^ 3)));
      this.add(this.yk);
      Class436[] var9 = new Class436[var10001];
      var10003 = true;
      this.g = var9;

      for(var10000 = var2 = 5 >> 3; var10000 < this.g.length; var10000 = var2) {
         this.g[var2] = new Class436();
         this.add(this.g[var2]);
         if (var2 == 0) {
            this.g[var2].eq(Class511.q("sc/d/19.png", --5, --5, --5, --5, (boolean)(2 & 5)));
            this.g[var2].setBounds(114, 67, 309, 309);
            Class603 var5 = this.vc();
            Image var4 = Class511.a("sc/d/18.png");
            Class282[] var11 = new Class282[36];
            var10003 = true;
            this.azf = var11;

            int var3;
            for(var10000 = var3 = 3 & 4; var10000 < this.azf.length; var10000 = var3) {
               this.azf[var3] = new Class282(var3 + (3 >> 1), var4, (boolean)(--1), var5, this);
               this.azf[var3].setBounds(115 + var3 % 6 * 51, 69 + var3 / 6 * 51, 51, 51);
               this.add(this.azf[var3++]);
            }
         } else if (var2 == --1) {
            this.g[var2].eq(Class511.q("sc/d/36.png", 30, 30, 30, 30, (boolean)(3 ^ 3)));
            this.g[var2].setBounds(46, 57, 390, 330);
         }

         ++var2;
      }

   }

   public void d() {
      RoleData var1 = this.vd();

      int var2;
      for(int var10000 = var2 = 5 >> 3; var10000 < this.azf.length; var10000 = var2) {
         long var3 = var1.getPackRecord().getStarSoulType(this.azf[var2].tp()) / 10000L;
         this.azf[var2++].gh(var3);
      }

   }
}
