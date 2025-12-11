package com.xy.a;

import com.xy.text.GameView;
import com.xy.text.ScreenData;

public class Class9 extends com.xy.q.Class30 {
   private int eg;
   private com.xy.i.Class14[] es;

   @Override
   public void t() {
      ScreenData var1 = this.afx.screenData;
      if (this.eg == -1) {
         this.setBounds(0, 0, 0, 0);
      } else {
         int var2 = (int)(var1.Screen_x * 0.88);
         int var3 = (int)(var1.Screen_y * 0.3);
         this.setBounds(Math.max(var2, var1.Screen_x - 100), var3, 59, this.eg == 0 ? 200 : 100);
      }
   }

   public void h() {
      this.eg = -1;
      this.setVisible(false);
   }

   @Override
   public void setVisible(boolean var1) {
      if (var1) {
         this.t();
      }

      super.setVisible(var1);
   }

   public void ab(int var1, boolean var2) {
      Class9 var7;
      if ((this.eg = var1) == -1) {
         int var3;
         for (int var10000 = var3 = 0; var10000 < this.es.length; var10000 = var3) {
            this.es[var3++].setVisible(false);
         }

         var7 = this;
      } else if (var1 == 0) {
         int var5;
         for (int var8 = var5 = 0; var8 < this.es.length; var8 = var5) {
            if (!var2 || this.es[var5].il() != 1 && this.es[var5].il() != 2 && this.es[var5].il() != 4 && this.es[var5].il() != 6 && this.es[var5].il() != 7) {
               var7 = this;
               this.eb(this.es[var5], 1);
            } else {
               var7 = this;
               this.eb(this.es[var5], -1);
            }

            var7.es[var5].setBounds(0, 25 * var5, 59, 25);
            this.es[var5++].setVisible(true);
         }

         var7 = this;
      } else {
         if (var1 == 1) {
            int var6 = 0;
            int var4 = 0;

            for (int var10 = var6; var10 < this.es.length; var10 = ++var6) {
               if (this.es[var6].il() < 5 || this.es[var6].il() > 8) {
                  this.eb(this.es[var6], 1);
                  this.es[var6].setBounds(0, var4 * 25, 59, 25);
                  var4++;
                  this.es[var6].setVisible(true);
               }
            }
         }

         var7 = this;
      }

      var7.setVisible(true);
   }

   public void eb(com.xy.i.Class14 var1, int var2) {
      if (var2 != var1.getBtn()) {
         if (var2 == 1) {
            String var3 = "5\ni\fi^h\u0019(\u000e";
            var1.setBtn(1, "sc/e/7.png");
         } else {
            String var10002 = "\u00144H2HbRy\u00179\u0000";
            var1.setBtn(-1, "sc/e/55.png");
         }
      }
   }

   public Class9(GameView var1) {
      super(-1, -1, com.xy.q.Class30.afz, var1);
      this.yy(0, 0, 0, 0, com.xy.q.Class30.agf);
      this.es = new com.xy.i.Class14[8];

      int var2;
      for (int var10000 = var2 = 0; var10000 < this.es.length; var10000 = var2) {
         com.xy.i.Class14[] var3 = this.es;
         String var10004 = "$\u0004x\u0002xPy\u00179\u0000";
         int var10006 = var2 + 1;
         String var5;
         Class9 var10010;
         if (var2 == 0) {
            var5 = "沓杆";
            var5 = "法术";
            var10010 = this;
         } else if (var2 == 1) {
            var5 = "逄儐";
            var5 = "道具";
            var10010 = this;
         } else if (var2 == 2) {
            var5 = "陴忈";
            var5 = "防御";
            var10010 = this;
         } else if (var2 == 3) {
            var5 = "侊拃";
            var5 = "保护";
            var10010 = this;
         } else if (var2 == 4) {
            var5 = "厪啍";
            var5 = "召唤";
            var10010 = this;
         } else if (var2 == 5) {
            var5 = "去嚹";
            var5 = "召回";
            var10010 = this;
         } else if (var2 == 6) {
            var5 = "挓挠";
            var5 = "捕捉";
            var10010 = this;
         } else {
            var5 = "達趶";
            var5 = "逃跑";
            var10010 = this;
         }

         com.xy.i.Class14 var10002 = new com.xy.i.Class14("sc/e/7.png", 1, var10006, com.xy.q.Class49.ch, com.xy.q.Class49.bv, var5, var10010);
         var3[var2] = var10002;
         this.es[var2].setBounds(0, 25 * var2, 59, 25);
         this.add(this.es[var2++]);
      }
   }
}
