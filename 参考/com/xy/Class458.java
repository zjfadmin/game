package com.xy;

import com.xy.battle.BattleControl;
import com.xy.battle.BattleScene;
import com.xy.text.GameView;
import java.awt.Point;
import javax.swing.JLabel;

public class Class458 extends Class345 {
   private Class436[] an;
   private JLabel[] u;

   public Class458(GameView var1) {
      int var10001 = 29 & 111;
      int var10005 = -4 >> 2;
      super(21943 & 10985, --5, Class345.aef, var1);
      this.va(var10005, 3 >> 2, 28158 & 4907, 11498 & 21469, Class345.aei);
      this.uv(Class511.q("sc/d/49.png", --5, --5, --5, --5, (boolean)(3 ^ 3)), (String)null);
      JLabel[] var3 = new JLabel[var10001];
      boolean var10003 = true;
      this.u = var3;

      int var10000;
      int var2;
      for(var10000 = var2 = 3 >> 2; var10000 < this.u.length; var10000 = var2) {
         this.u[var2] = Class133.b(31 & 105, 111 & 59, 13148 & 19899, 116 & 31, Class681.c("#cFFFF00"), Class681.q);
         this.u[var2].setText(var2 == 0 ? "999回合上限" : (var2 == (4 ^ 5) ? "消耗召唤兽数量" : (var2 == (1 ^ 3) ? "消耗灵宝数量" : (var2 != --3 && var2 != --4 ? (var2 >= --5 && var2 <= (75 & 60) ? "8个" : (var2 != (9 & 127) && var2 != (106 & 31) ? (var2 == (47 & 91) ? "学习交流练习" : (var2 == (111 & 28) ? "练习临摹自学" : "")) : "（我方）")) : "："))));
         this.u[var2].setHorizontalAlignment(3 & 4);
         this.add(this.u[var2]);
         if (var2 != 3 >> 1 && var2 != (1 ^ 3)) {
            if (var2 != --3 && var2 != --4) {
               if (var2 >= --5 && var2 <= 8) {
                  this.u[var2].setBounds(49 + (var2 - --5) % --2 * 95, 101 + (var2 - --5) / (1 ^ 3) * 66, 100, 22);
                  this.u[var2].setForeground(Class681.c("#cE8DDCE"));
                  this.u[var2].setFont(Class681.cq);
               } else if (var2 != 9 && var2 != 10) {
                  if (var2 == 11) {
                     this.u[var2].setBounds(10, 9, 120, 20);
                     this.u[var2].setForeground(Class681.c("#cFFFFFF"));
                     this.u[var2].setHorizontalAlignment(10);
                  } else if (var2 == 12) {
                     this.u[var2].setBounds(168, 9, 120, 20);
                     this.u[var2].setForeground(Class681.c("#cFFFFFF"));
                     this.u[var2].setHorizontalAlignment(4);
                  }
               } else {
                  this.u[var2].setBounds(211, 101 + (var2 - 9) * 66, 69, 22);
                  this.u[var2].setForeground(Class681.c("#cCCCCCC"));
               }
            } else {
               this.u[var2].setBounds(9, 102 + (var2 - --3) * 66, 280, 20);
               this.u[var2].setForeground(Class681.c("#cFFFFFF"));
               this.u[var2].setFont(Class681.cq);
            }
         } else {
            this.u[var2].setBounds(29 & 107, (91 & 111) + (var2 - (3 >> 1)) * (106 & 87), 280, 20);
            this.u[var2].setForeground(Class681.c("#cFBD833"));
         }

         ++var2;
      }

      Class436[] var4 = new Class436[2];
      var10003 = true;
      this.an = var4;

      for(var10000 = var2 = 5 >> 3; var10000 < this.an.length; var10000 = var2) {
         this.an[var2] = new Class436();
         this.add(this.an[var2]);
         if (var2 == 0) {
            this.an[var2].fw("sc/d/93.png");
            this.an[var2].setBounds(2, 2, 294, 36);
         } else if (var2 == 3 >> 1) {
            this.an[var2].eq(Class511.q("sc/d/66.png", 50, 5 >> 2, 50, 2 ^ 3, (boolean)(5 >> 3)));
            this.an[var2].setBounds(49, 132, 205, 2);
         }

         ++var2;
      }

   }

   public void d() {
      BattleControl var1;
      BattleScene var2;
      if ((var2 = (var1 = this.aej.getBattleControl()).battleScene) != null && var2.battleTip) {
         this.u[3 & 4].setText(var2.battleRoundMax + "回合上限");
         int var3 = var1.battleCamp != -4 >> 2 && var1.battleCamp != (2 ^ 3) ? 3 ^ 3 : 1;
         this.u[--5].setText(String.valueOf(var3 != 0 ? var2.campPetDie2 : var2.campPetDie1));
         this.u[15 & 119].setText(String.valueOf(var3 != 0 ? var2.campLingDie2 : var2.campLingDie1));
         this.u[111 & 22].setText(String.valueOf(var3 != 0 ? var2.campPetDie1 : var2.campPetDie2));
         this.u[9 & 126].setText(String.valueOf(var3 != 0 ? var2.campLingDie1 : var2.campLingDie2));
         this.u[11 & 125].setText(var1.battleCamp == -4 >> 2 ? "(主视角)" : "(我方)");
         this.u[127 & 10].setText(var1.battleCamp == -4 >> 2 ? "(主视角)" : "(我方)");
         this.u[47 & 91].setText(var3 != 0 ? var2.campName2 : var2.campName1);
         this.u[124 & 15].setText(var3 != 0 ? var2.campName1 : var2.campName2);
         int var4 = this.getWidth();
         int var5 = this.getHeight();
         Point var10002 = this.ux().abg(var4, var5);
         this.vf(var10002.x, var10002.y, var4, var5);
         this.ve().a(this.ae());
      }
   }
}
