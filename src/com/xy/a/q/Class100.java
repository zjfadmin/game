package com.xy.a.q;

import com.xy.bean.UseCardBean;
import com.xy.game.RoleData;
import com.xy.i.Class18;
import com.xy.i.Class19;
import com.xy.q.Class49;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import java.awt.Color;
import javax.swing.JLabel;

public class Class100 extends com.xy.q.Class30 {
   private com.xy.w.Class18[] ar;
   private com.xy.i.Class19[] pa;
   private com.xy.q.Class14[] k;
   private JLabel[] au;

   public Class100(GameView var1) {
      super(-1, -1, com.xy.q.Class30.agf, var1);
      this.yy(0, 0, 682, 475, com.xy.q.Class30.agf);
      this.pa = new com.xy.i.Class19[2];

      int var2;
      for (int var10000 = var2 = 0; var10000 < this.pa.length; var10000 = var2) {
         com.xy.i.Class19[] var6 = this.pa;
         String var10004 = "eO9I9\u001e \u0002fBq";
         int var10006 = 282 + var2;
         String var35;
         Class100 var10010;
         if (var2 == 0) {
            var35 = "飩厵夹勒";
            var35 = "领取奖励";
            var10010 = this;
         } else if (var2 == 1) {
            var35 = "颪叀奺劧";
            var35 = "领取奖励";
            var10010 = this;
         } else {
            var35 = "";
            var10010 = this;
         }

         Class19 var10002 = new Class19("sc/e/26.png", 1, var10006, Class49.ch, Class49.bv, var35, var10010);
         var6[var2] = var10002;
         this.pa[var2].setBounds(381, 81 + 190 * var2, 99, 25);
         this.add(this.pa[var2++]);
      }

      this.au = new JLabel[2];

      for (int var7 = var2 = 0; var7 < this.au.length; var7 = var2) {
         this.au[var2] = com.xy.q.Class1.k(67, 172 + var2 * 190, 79, 22, Color.black, com.xy.q.Class49.bx);
         JLabel var8 = this.au[var2];
         String var14;
         if (var2 == 0) {
            var14 = "杧匂";
            var14 = "月卡";
         } else if (var2 == 1) {
            var14 = "孏卷";
            var14 = "季卡";
         } else {
            var14 = "";
         }

         var8.setText(var14);
         this.au[var2].setHorizontalAlignment(0);
         this.add(this.au[var2++]);
      }

      this.k = new com.xy.q.Class14[2];

      for (int var9 = var2 = 0; var9 < this.k.length; var9 = var2) {
         this.k[var2] = com.xy.q.Class1.i(253, 84 + var2 * 190, 79, 19, 0, Color.white, com.xy.q.Class49.ba);
         com.xy.q.Class14 var22 = this.k[var2];
         String var10003 = "\u0010\fL\u000bL^TA\u0013\u0001\u0004";
         var22.mt(com.xy.w.Class16.m("sc/d/17.png", 6, 6, 6, 6, false));
         this.add(this.k[var2]);
         com.xy.q.Class14 var16 = this.k[var2];
         var2++;
         String var23 = "\u0015/";
         var16.setText("99");
      }

      this.ar = new com.xy.w.Class18[10];

      for (int var10 = var2 = 0; var10 < this.ar.length; var10 = var2) {
         this.ar[var2] = new com.xy.w.Class18();
         Class100 var13;
         if (var2 != 0 && var2 != 1) {
            if (var2 == 2 || var2 == 3) {
               var13 = this;
               com.xy.w.Class18 var29 = this.ar[var2];
               String var34 = "\u001c\u0000@\u0007@WA\u0013\u0001\u0004";
               var29.mt(com.xy.w.Class16.m("sc/d/4.png", 5, 5, 5, 5, false));
               this.ar[var2].setBounds(67, 85 + (var2 - 2) * 190, 79, 77);
            } else if (var2 == 4 || var2 == 5) {
               var13 = this;
               com.xy.w.Class18 var28 = this.ar[var2];
               String var33 = "eO9H9\u001a \u0002fBq";
               var28.mt(com.xy.w.Class16.m("sc/d/66.png", 80, 1, 80, 1, false));
               this.ar[var2].setBounds(154, 109 + (var2 - 4) * 190, 501, 2);
            } else if (var2 == 6) {
               var13 = this;
               com.xy.w.Class18 var25 = this.ar[var2];
               String var31 = "\u0010\fL\u000bLWWA\u0013\u0001\u0004";
               var25.dp("sc/d/84.png");
               this.ar[var2].setBounds(157, 87, 494, 141);
            } else if (var2 == 7) {
               var13 = this;
               com.xy.w.Class18 var26 = this.ar[var2];
               String var32 = "eO9H9\u0014#\u0002fBq";
               var26.dp("sc/d/85.png");
               this.ar[var2].setBounds(157, 277, 497, 148);
            } else {
               if (var2 == 8 || var2 == 9) {
                  com.xy.w.Class18 var19 = this.ar[var2];
                  String var27 = "\u0010\fL\u000bL\\UA\u0013\u0001\u0004";
                  var19.mt(com.xy.w.Class16.m("sc/d/36.png", 20, 20, 20, 20, false));
                  this.ar[var2].setBounds(53, 62 + (var2 - 8) * 190, 610, 180);
               }

               var13 = this;
            }
         } else {
            Class100 var11;
            if (var2 == 0) {
               var11 = this;
               com.xy.w.Class18 var17 = this.ar[var2];
               String var24 = "\u0010\fL\u000bLWQA\u0013\u0001\u0004";
               var17.dp("sc/d/82.png");
            } else {
               if (var2 == 1) {
                  com.xy.w.Class18 var12 = this.ar[var2];
                  String var18 = "eO9H9\u0014%\u0002fBq";
                  var12.dp("sc/d/83.png");
               }

               var11 = this;
            }

            var11.ar[var2].setBounds(67, 85 + var2 * 190, 79, 77);
            var13 = this;
         }

         var13.add(this.ar[var2++]);
      }
   }

   public void h() {
      RoleData var1;
      RoleData var10000 = var1 = this.yx();
      String var10001 = "朤卷";
      UseCardBean var2;
      int var3 = (var2 = var10000.getLimit("月卡")) != null ? var2.getUseTime() / 1440 : 0;
      com.xy.q.Class14 var6 = this.k[0];
      if (var3 > 0) {
         var10001 = String.valueOf(var3);
      } else {
         var10001 = "BN";
         var10001 = "--";
      }

      label49: {
         var6.setText(var10001);
         this.pa[0].setVisible(var2 != null);
         if (var2 == null) {
            var10001 = "]";
            if (this.za().VALUE.indexOf("K") != -1) {
               var10000 = var1;
               com.xy.i.Class19 var10002 = this.pa[0];
               String var10003 = "赂专杧匂";
               var10002.setText("购买月卡");
               this.pa[0].setVisible(true);
               break label49;
            }
         }

         com.xy.i.Class19 var7 = this.pa[0];
         var10001 = "颪叀奺劧";
         var7.setText("领取奖励");
         var10000 = var1;
      }

      var10001 = "嬌匂";
      var3 = (var2 = var10000.getLimit("季卡")) != null ? var2.getUseTime() / 1440 : 0;
      com.xy.q.Class14 var9 = this.k[1];
      if (var3 > 0) {
         var10001 = String.valueOf(var3);
      } else {
         var10001 = "\u0001;";
         var10001 = "--";
      }

      var9.setText(var10001);
      this.pa[1].setVisible(var2 != null);
      if (var2 == null) {
         var10001 = "(";
         if (this.za().VALUE.indexOf("K") != -1) {
            com.xy.i.Class19 var20 = this.pa[1];
            String var21 = "贁书孏卷";
            var20.setText("购买季卡");
            this.pa[1].setVisible(true);
            return;
         }
      }

      com.xy.i.Class19 var10 = this.pa[1];
      var10001 = "飩厵夹勒";
      var10.setText("领取奖励");
   }

   public void g(int var1) {
      String var10003 = "D\u001d+";
      String var2 = Agreement.getSendTextAES("taskN", "R1=" + (var1 == 283 ? 2 : (var1 == 282 ? 1 : 0)));
      this.za().k(var2);
   }
}
