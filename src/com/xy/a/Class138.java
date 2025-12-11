package com.xy.a;

import com.xy.text.GameView;
import java.awt.Color;
import javax.swing.JLabel;

public class Class138 extends com.xy.q.Class30 {
   private int cb;
   private com.xy.i.Class18 fn;
   private Class129[] ayi;
   private com.xy.w.Class18[] fp;
   private JLabel[] au;

   public Class138(GameView var1) {
      super(158, 2, com.xy.q.Class30.afz, var1);
      String var10004 = "aa=f=3<r|e";
      this.yy(-1, 0, 302, 320, com.xy.q.Class30.agh);
      com.xy.w.Class9 var21 = com.xy.w.Class16.m("sc/d/1.png", 68, 68, 68, 68, false);
      String var10005 = "飾逰笴遪";
      this.yu(var21, "频道筛选");
      this.wp(new com.xy.v.Class32(14, 0, 0, 35));
      this.au = new JLabel[7];

      int var2;
      for (int var10000 = var2 = 0; var10000 < this.au.length; var10000 = ++var2) {
         this.au[var2] = com.xy.q.Class1.k(57, 23, 200, 19, Color.black, com.xy.q.Class49.ch);
         JLabel var5 = this.au[var2];
         String var10;
         if (var2 == 0) {
            var10 = "诵勬逋覓昼礨皆颃遑俳恭";
            var10 = "请勾选要显示的频道信息";
         } else if (var2 == 1) {
            var10 = "弼刮";
            var10 = "当前";
         } else if (var2 == 2) {
            var10 = "阍伏";
            var10 = "队伍";
         } else if (var2 == 3) {
            var10 = "乹甯";
            var10 = "世界";
         } else if (var2 == 4) {
            var10 = "帼洼";
            var10 = "帮派";
         } else if (var2 == 5) {
            var10 = "扷旴";
            var10 = "战斗";
         } else if (var2 == 6) {
            var10 = "俳恭";
            var10 = "信息";
         } else {
            var10 = "";
         }

         var5.setText(var10);
         this.au[var2].setHorizontalAlignment(10);
         this.add(this.au[var2]);
         if (var2 == 0) {
            this.au[var2].setHorizontalAlignment(0);
         } else if (var2 >= 1 && var2 <= 10) {
            this.au[var2].setBounds(103 + (var2 - 1) % 2 * 99, 64 + (var2 - 1) / 2 * 27, 36, 17);
         }
      }

      String var10008 = "\u0010\fL\nL]UA\u0013\u0001\u0004";
      String var10013 = "俏孚讬罬";
      this.fn = new com.xy.i.Class18("sc/e/26.png", 1, 313, com.xy.q.Class49.ch, com.xy.q.Class49.bv, "保存设置", this);
      this.fn.setBounds(111, 225, 99, 25);
      this.add(this.fn);
      this.fp = new com.xy.w.Class18[8];

      for (int var6 = var2 = 0; var6 < this.fp.length; var6 = var2) {
         this.fp[var2] = new com.xy.w.Class18();
         Class138 var7;
         if (var2 != 0 && var2 != 1) {
            if (var2 >= 2 && var2 <= 7) {
               com.xy.w.Class18 var17 = this.fp[var2];
               String var18 = "qq-w- ;<r|e";
               var17.dp("sc/e/29.png");
               this.fp[var2].setBounds(85 + (var2 - 2) % 2 * 99, 64 + (var2 - 2) / 2 * 27, 17, 17);
            }

            var7 = this;
         } else {
            var7 = this;
            com.xy.w.Class18 var10002 = this.fp[var2];
            String var10003 = "\u0010\fL\u000bLYUA\u0013\u0001\u0004";
            var10002.mt(com.xy.w.Class16.m("sc/d/66.png", 50, 1, 50, 1, false));
            this.fp[var2].setBounds(49, 45 + 163 * var2, 220, 2);
         }

         var7.add(this.fp[var2++]);
      }

      this.ayi = new Class129[6];

      for (int var8 = var2 = 0; var8 < this.ayi.length; var8 = var2) {
         this.ayi[var2] = new Class129(this, var2);
         this.fp[2 + var2].addMouseListener(this.ayi[var2++]);
      }
   }

   public void y(int var1) {
      if (var1 == 313) {
         long var2 = 0L;

         int var4;
         for (int var10000 = var4 = 0; var10000 < this.ayi.length; var10000 = ++var4) {
            if (Class129.amj(this.ayi[var4])) {
               var2 |= 1 << var4;
            }
         }

         Class138 var5;
         if (this.cb == 1 && this.afx.systemData.chatUp != var2) {
            var5 = this;
            this.afx.systemData.chatUp = var2;
            this.afx.systemData.b();
         } else {
            if (this.cb == 2 && this.afx.systemData.chatDown != var2) {
               this.afx.systemData.chatDown = var2;
               this.afx.systemData.b();
            }

            var5 = this;
         }

         var5.zc().f(this.lj());
      }
   }

   // $VF: synthetic method
   static com.xy.w.Class18[] anv(Class138 var0) {
      return var0.fp;
   }

   public void g(int var1) {
      long var2 = (this.cb = var1) == 1 ? this.afx.systemData.chatUp : (var1 == 2 ? this.afx.systemData.chatDown : 0L);

      int var4;
      for (int var10000 = var4 = 0; var10000 < this.ayi.length; var10000 = ++var4) {
         this.ayi[var4].be((var2 >> var4 & 1L) == 1L);
      }

      if (this.zc().l(this.lj()) == null) {
         this.zc().b(this.lj());
      }
   }
}
