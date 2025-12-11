package com.xy.a.q;

import com.xy.i.Class18;
import com.xy.i.Class19;
import com.xy.q.Class49;
import com.xy.readbean.Eshop;
import com.xy.readbean.MoneyType;
import com.xy.text.GameView;
import java.awt.Color;
import java.util.List;
import javax.swing.JLabel;

public class Class33 extends com.xy.q.Class30 {
   private int z;
   private com.xy.i.Class19[] vv;
   private com.xy.i.Class19[] vw;
   private com.xy.q.Class52[] vx;
   private JLabel[] r;
   private int ae;
   private com.xy.q.Class14 oo;
   private int eg = 1;
   private Class102[] vy;

   public int dx() {
      int var1 = 0;
      String var2 = String.valueOf(this.z);
      List var3 = this.yt().i();

      int var4;
      for (int var10000 = var4 = 0; var10000 < var3.size(); var10000 = ++var4) {
         if (((Eshop)var3.get(var4)).getEshoptype().equals(var2)) {
            var1++;
         }
      }

      return var1;
   }

   public void bi(int var1) {
      int var2;
      for (int var10000 = var2 = 0; var10000 < this.vy.length; var10000 = var2) {
         this.vy[var2].t();
         this.vy[var2++].setVisible(false);
      }

      Class33 var11;
      if (var1 <= 0) {
         var1 = 1;
         var11 = this;
      } else {
         if (var1 >= this.ae) {
            var1 = this.ae;
         }

         var11 = this;
      }

      var11.eg = var1;
      com.xy.q.Class14 var17 = this.oo;
      StringBuilder var10002 = new StringBuilder(String.valueOf(this.eg));
      String var10003 = "H";
      var17.setText(var10002.append("/").append(this.ae).toString());
      var2 = 0;
      int var3 = 0;
      int var4 = (var1 - 1) * 10;
      String var5 = String.valueOf(this.z);
      String var13;
      if (this.z == 5) {
         String var12 = "禸刱";
         var13 = "积分";
      } else {
         String var14 = "于珮";
         var13 = "仙玉";
      }

      String var6 = var13;
      List var7 = this.yt().i();

      int var8;
      for (int var15 = var8 = 0; var15 < var7.size(); var15 = ++var8) {
         Eshop var9;
         if ((var9 = (Eshop)var7.get(var8)).getEshoptype().equals(var5)) {
            if (var2 >= var4) {
               Class102 var16 = this.vy[var3];
               var3++;
               var16.alc(var9, var6);
               if (var3 >= this.vy.length) {
                  return;
               }
            }

            var2++;
         }
      }
   }

   public void y(int var1) {
      if (var1 == 261) {
         this.bi(1);
      } else if (var1 == 262) {
         this.bi(this.ae);
      } else if (var1 == 263) {
         this.bi(this.eg - 1);
      } else {
         if (var1 == 264) {
            this.bi(this.eg + 1);
         }
      }
   }

   public Class33(GameView var1) {
      super(-1, -1, com.xy.q.Class30.agf, var1);
      this.ae = 1;
      this.yy(0, 0, 682, 475, com.xy.q.Class30.agf);
      this.vv = new com.xy.i.Class19[6];

      int var2;
      for (int var10000 = var2 = 0; var10000 < this.vv.length; var10000 = var2) {
         com.xy.i.Class19[] var8 = this.vv;
         String var10004 = "\u00144H2Hd^y\u00179\u0000";
         int var10006 = 251 + var2;
         String var33;
         Class33 var10010;
         if (var2 == 0) {
            var33 = "朇斮";
            var33 = "材料";
            var10010 = this;
         } else if (var2 == 1) {
            var33 = "忪窇";
            var33 = "徽章";
            var10010 = this;
         } else if (var2 == 2) {
            var33 = "礉兊";
            var33 = "神兽";
            var10010 = this;
         } else if (var2 == 3) {
            var33 = "筱瞔";
            var33 = "符石";
            var10010 = this;
         } else if (var2 == 4) {
            var33 = "鄚饇";
            var33 = "配饰";
            var10010 = this;
         } else if (var2 == 5) {
            var33 = "禸剡";
            var33 = "积分";
            var10010 = this;
         } else {
            var33 = "";
            var10010 = this;
         }

         Class19 var10002 = new Class19("sc/e/39.png", 2, var10006, Class49.ck, null, var33, var10010);

         var8[var2] = var10002;
         this.vv[var2].setOffsetTexts(com.xy.q.Class49.bo);
         this.vv[var2].setBounds(54 + 65 * var2, 73, 63, 24);
         this.add(this.vv[var2++]);
      }

      this.vy = new Class102[10];

      for (int var9 = var2 = 0; var9 < this.vy.length; var9 = var2) {
         this.vy[var2] = new Class102(this);
         this.vy[var2].setBounds(54 + var2 % 5 * 120, 97 + var2 / 5 * 165, 115, 150);
         this.add(this.vy[var2++]);
      }

      this.vw = new com.xy.i.Class19[4];

      for (int var10 = var2 = 0; var10 < this.vw.length; var10 = var2) {
         com.xy.i.Class19[] var11 = this.vw;
         String var28;
         if (var2 == 2) {
            var28 = "D4\u00182\u0018c\u0005yG9P";
            var28 = "sc/e/42.png";
         } else if (var2 == 3) {
            var28 = "\u00144H2HcTy\u00179\u0000";
            var28 = "sc/e/43.png";
         } else {
            var28 = "$TxRx\u0001yG9P";
            var28 = "sc/e/6.png";
         }

         int var32 = 261 + var2;
         String var40;
         Class33 var42;
         if (var2 == 0) {
            var40 = "駁頒";
            var40 = "首页";
            var42 = this;
         } else if (var2 == 1) {
            var40 = "杼顂";
            var40 = "末页";
            var42 = this;
         } else {
            var40 = "";
            var42 = this;
         }

         com.xy.i.Class19 var10001 = new com.xy.i.Class19(var28, 1, var32, com.xy.q.Class49.bz, null, var40, var42);
         var11[var2] = var10001;
         this.vw[var2].setBounds(264 + 140 * var2, 435, 34, 18);
         if (var2 == 2 || var2 == 3) {
            this.vw[var2].setBounds(301 + 82 * (var2 - 2), 435, 18, 18);
         }

         this.add(this.vw[var2++]);
      }

      this.r = new JLabel[4];

      for (int var12 = var2 = 0; var12 < this.r.length; var12 = ++var2) {
         this.r[var2] = com.xy.q.Class1.k(480, 34 + (var2 + 1) * 19, 72, 18, Color.black, com.xy.q.Class49.ch);
         JLabel var13 = this.r[var2];
         String var17;
         if (var2 == 0) {
            var17 = "絸识儒偛";
            var17 = "累计充值";
         } else if (var2 == 1) {
            var17 = "弄剺禸刱";
            var17 = "当前积分";
         } else if (var2 == 2) {
            var17 = "儤";
            var17 = "元";
         } else if (var2 == 3) {
            var17 = "禸刱";
            var17 = "积分";
         } else {
            var17 = "";
         }

         var13.setText(var17);
         this.r[var2].setHorizontalAlignment(10);
         this.add(this.r[var2]);
         if (var2 >= 2 && var2 <= 3) {
            this.r[var2].setForeground(Color.white);
            this.r[var2].setFont(com.xy.q.Class49.bz);
            this.r[var2].setBounds(627, 53 + (var2 - 2) * 19, 30, 18);
            this.r[var2].setHorizontalAlignment(4);
         }
      }

      this.vx = new com.xy.q.Class52[2];

      for (int var14 = var2 = 0; var14 < this.vx.length; var14 = var2) {
         MoneyType var3 = new MoneyType();
         Class33 var15;
         if (var2 == 0) {
            var15 = this;
            String var10003 = "絸识";
            var3.setIdAndKey(5, "累计");
         } else {
            if (var2 == 1) {
               String var24 = "禸刱";
               var3.setIdAndKey(4, "积分");
            }

            var15 = this;
         }

         var15.vx[var2] = com.xy.q.Class1.a(10, Color.white, com.xy.q.Class49.w, var3, var1);
         com.xy.q.Class52 var31 = this.vx[var2];
         String var10005 = "\u00144H3HfPy\u00179\u0000";
         var31.mt(com.xy.w.Class16.m("sc/d/17.png", 6, 6, 6, 6, false));
         this.vx[var2].setBounds(552, 34 + (var2 + 1) * 19, 110, 18);
         this.vx[var2].n(2);
         this.add(this.vx[var2++]);
      }

      this.oo = com.xy.q.Class1.i(322, 435, 58, 18, 0, Color.white, com.xy.q.Class49.w);
      String var26 = "D4\u00183\u0018f\u0000yG9P";
      this.oo.mt(com.xy.w.Class16.m("sc/d/17.png", 6, 6, 6, 6, false));
      this.add(this.oo);
   }

   public com.xy.q.Class52[] rl() {
      return this.vx;
   }

   public void g(int var1) {
      int var10000 = 0;
      this.z = var1;

      for (int var2 = 0; var10000 < this.vv.length; var10000 = ++var2) {
         this.vv[var2].setKeep(var2 == this.z);
      }

      int var3;
      this.ae = (var3 = this.dx()) % 10 == 0 ? var3 / 10 : var3 / 10 + 1;
      this.bi(1);
   }
}
