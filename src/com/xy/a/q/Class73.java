package com.xy.a.q;

import com.xy.bean.LoginResult;
import com.xy.readbean.MoneyType;
import com.xy.richtext.RichLabel;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Class73 extends com.xy.q.Class30 {
   private com.xy.q.Class27[] ajt;
   private com.xy.i.Class19[] vv;
   private com.xy.q.Class36[] fz;
   private com.xy.q.Class14[] bx;
   private JLabel[] r;
   private MoneyType uz;
   private com.xy.q.Class52[] bz;
   private RichLabel ck;
   private com.xy.w.Class18[] cl;

   @Override
   public void l() {
      this.fz[0].setText("0");
      this.fz[1].setText("0");
      super.l();
   }

   public void ds(long var1, JTextField var3) {
      if (var3 == this.fz[0]) {
         LoginResult var10001 = this.yx().getLoginResult();
         int var5 = var10001.getTurnAround();
         int var6 = com.xy.v.Class4.s(var10001.getGrade());
         long var7 = 0L;
         long var10000;
         if (this.za().l(2, 12)) {
            var7 = var5 <= 3 ? this.yt().ag(var5, var6) : this.yt().ag(3, 180);
            var10000 = var7;
         } else {
            var7 = var5 <= 3 ? this.yt().ag(var5, var6) : 6000000000L;
            var10000 = var7;
         }

         var7 = (long)(var10000 * 0.002);
         com.xy.q.Class49.b(this.bx[0], var7 * var1);
      } else {
         if (var3 == this.fz[1]) {
            com.xy.q.Class49.b(this.bx[1], 31864L * var1);
         }
      }
   }

   public void g(int var1) {
      if (var1 == 311) {
         long var5;
         if ((var5 = this.ajt[0].ee()) <= 0L) {
            String var7 = "返儥伧见儖挢盃攰醈";
            this.afx._do("输入你要兑换的数量");
         } else {
            String var8 = "}D";
            String var6 = Agreement.getSendTextAES("fm", "D1" + var5);
            this.za().k(var6);
         }
      } else {
         if (var1 == 312) {
            long var2;
            if ((var2 = this.ajt[1].ee()) <= 0L) {
               String var10001 = "返儥伧见儖挢盃攰醈";
               this.afx._do("输入你要兑换的数量");
               return;
            }

            String var10003 = "}F";
            String var4 = Agreement.getSendTextAES("fm", "D3" + var2);
            this.za().k(var4);
         }
      }
   }

   public boolean du(long var1, JTextField var3) {
      return true;
   }

   public Long dt(long var1, JTextField var3) {
      if (var1 < 0L) {
         return 0L;
      } else {
         long var4 = this.yx().getMoney(this.uz);
         return var1 > var4 ? var4 : null;
      }
   }

   public Class73(GameView var1) {
      super(170, 2, com.xy.q.Class30.afz, var1);
      String var10003 = "J\u0016\u0016\u0011\u0016D\u0017\u0005W\u0012";
      this.yy(-1, 0, 492, 417, com.xy.q.Class30.agh);
      com.xy.w.Class9 var26 = com.xy.w.Class16.m("sc/d/1.png", 68, 68, 68, 68, false);
      String var10004 = "亣爌隁";
      this.yu(var26, "令牌集");
      this.vv = new com.xy.i.Class19[2];

      int var2;
      for (int var10000 = var2 = 0; var10000 < this.vv.length; var10000 = var2) {
         String var10007 = "\u0006ZZ\\Z\nD\u0017\u0005W\u0012";
         int var10009 = 311 + var2;
         String var10012 = "儑挥";
         this.vv[var2] = new com.xy.i.Class19("sc/e/31.png", 1, var10009, com.xy.q.Class49.ch, com.xy.q.Class49.bv, "兑换", this);
         this.vv[var2].setBounds(354, 98 + var2 * 160, 79, 25);
         this.add(this.vv[var2++]);
      }

      this.r = new JLabel[10];

      for (int var6 = var2 = 0; var6 < this.r.length; var6 = ++var2) {
         this.r[var2] = com.xy.q.Class1.k(79, 42 + 160 * var2, 100, 19, Color.black, com.xy.q.Class49.ch);
         JLabel var7 = this.r[var2];
         String var13;
         if (var2 == 0 || var2 == 1) {
            var13 = "佺魭云";
            var13 = "伏魔令";
         } else if (var2 == 2 || var2 == 5) {
            var13 = "报李";
            var13 = "拥有";
         } else if (var2 == 3 || var2 == 6) {
            var13 = "全挗";
            var13 = "兑换";
         } else if (var2 == 4 || var2 == 7) {
            var13 = "菷忐";
            var13 = "获得";
         } else if (var2 == 8) {
            var13 = "〩仏牐纺骵つ";
            var13 = "【人物经验】";
         } else if (var2 == 9) {
            var13 = "し奧讚幁ざ";
            var13 = "【大话币】";
         } else {
            var13 = "";
         }

         var7.setText(var13);
         this.r[var2].setHorizontalAlignment(0);
         this.add(this.r[var2]);
         if (var2 >= 2 && var2 <= 4) {
            this.r[var2].setBounds(202, 74 + (var2 - 2) * 27, 36, 19);
         } else if (var2 >= 5 && var2 <= 7) {
            this.r[var2].setBounds(202, 235 + (var2 - 5) * 27, 36, 19);
         } else if (var2 >= 8 && var2 <= 9) {
            this.r[var2].setHorizontalAlignment(10);
            this.r[var2].setFont(com.xy.q.Class49.n);
            this.r[var2].setBounds(239, 148 + (var2 - 8) * 160, 80, 14);
         }
      }

      this.ck = new RichLabel("", com.xy.q.Class49.n);
      String var10006 = "\u001a\u0016\tE\tE\tE渐駝揩祏ＣVKD〸殺弙佺魭云取儤捛盱亃爜绶髹丷儤捛斃皽仏牐笼纞杼兊ぷ\u001a\u0007\u000bぴ毶录伶鬡仝厚全挗皽奒诤年\u0015桌捗亂栅覱徲洛劑ぷ";
      this.ck.setTextSize("#c000000温馨提示：#r1、每张伏魔令可兑换的人物经验与兑换时的人物等级有关。#r2、每张伏魔令可兑换的大话币,根据价格规律浮动。", 360);
      this.ck.setBounds(50, 348, this.ck.getWidth(), this.ck.getHeight());
      this.add(this.ck);
      this.uz = new MoneyType();
      String var10005 = "佈鬔亣";
      this.uz.setIdAndKey(0, "伏魔令");
      this.ajt = new com.xy.q.Class27[2];
      this.bz = new com.xy.q.Class52[2];
      this.fz = new com.xy.q.Class36[2];
      this.bx = new com.xy.q.Class14[2];

      for (int var8 = var2 = 0; var8 < 2; var8 = var2) {
         this.bz[var2] = com.xy.q.Class1.m(244, 74 + 160 * var2, 94, 19, 10, Color.white, com.xy.q.Class49.w, this.uz, var1);
         String var35 = "\u0006ZZ]Z\bB\u0017\u0005W\u0012";
         this.fz[var2] = com.xy.q.Class1.j(com.xy.w.Class16.m("sc/d/17.png", 6, 6, 6, 6, false), com.xy.q.Class49.w, Color.white);
         this.bx[var2] = com.xy.q.Class1.i(244, 128 + 160 * var2, 94, 19, 10, Color.white, com.xy.q.Class49.w);
         this.fz[var2].setBounds(244, 101 + 160 * var2, 94, 19);
         com.xy.q.Class52 var30 = this.bz[var2];
         var10005 = "4#h$hqpn7. ";
         var30.mt(com.xy.w.Class16.m("sc/d/17.png", 6, 6, 6, 6, false));
         com.xy.q.Class14 var27 = this.bx[var2];
         var10004 = "\u0006ZZ]Z\bB\u0017\u0005W\u0012";
         var27.mt(com.xy.w.Class16.m("sc/d/17.png", 6, 6, 6, 6, false));
         this.bz[var2].n(2);
         this.add(this.fz[var2]);
         this.add(this.bx[var2]);
         this.add(this.bz[var2]);
         com.xy.q.Class27[] var28 = this.ajt;
         int var32 = var2;
         com.xy.q.Class27 var34 = new com.xy.q.Class27(15, this.fz[var2], this.eg());
         var2++;
         var28[var32] = var34;
      }

      this.cl = new com.xy.w.Class18[6];

      for (int var9 = var2 = 0; var9 < this.cl.length; var9 = var2) {
         this.cl[var2] = new com.xy.w.Class18();
         Class73 var10;
         if (var2 >= 0 && var2 <= 1) {
            Class73 var11;
            if (var2 == 0) {
               var11 = this;
               com.xy.w.Class18 var20 = this.cl[var2];
               String var24 = "4#h$hwpn7. ";
               var20.dp("sc/d/77.png");
            } else {
               if (var2 == 1) {
                  com.xy.w.Class18 var12 = this.cl[var2];
                  String var21 = "\u0006ZZ]Z\u000eM\u0017\u0005W\u0012";
                  var12.dp("sc/d/78.png");
               }

               var11 = this;
            }

            var11.cl[var2].setBounds(82, 65 + var2 * 160, 92, 92);
            var10 = this;
         } else if (var2 >= 2 && var2 <= 3) {
            var10 = this;
            com.xy.w.Class18 var23 = this.cl[var2];
            var10003 = "3$o#osn7. ";
            var23.mt(com.xy.w.Class16.m("sc/d/4.png", 5, 5, 5, 5, false));
            this.cl[var2].setBounds(78, 61 + (var2 - 2) * 160, 100, 100);
         } else {
            if (var2 >= 4 && var2 <= 5) {
               com.xy.w.Class18 var19 = this.cl[var2];
               String var22 = "\u0006ZZ]Z\nC\u0017\u0005W\u0012";
               var19.mt(com.xy.w.Class16.m("sc/d/36.png", 20, 20, 20, 20, false));
               this.cl[var2].setBounds(50, 28 + (var2 - 4) * 160, 411, 158);
            }

            var10 = this;
         }

         var10.add(this.cl[var2++]);
      }
   }
}
