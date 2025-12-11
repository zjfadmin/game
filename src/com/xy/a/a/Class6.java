package com.xy.a.a;

import com.xy.entity.RoleSummoning;
import com.xy.readbean.Goodstable;
import com.xy.richtext.RichLabel;
import com.xy.text.GameView;
import java.awt.Color;
import java.math.BigDecimal;
import javax.swing.JLabel;

public class Class6 extends com.xy.q.Class30 {
   private com.xy.q.Class14[] fa;
   private RichLabel ed;
   private BigDecimal ee;
   private int cb;
   private BigDecimal gi;
   private JLabel[] gj;
   private com.xy.w.Class18[] fp;
   private com.xy.i.Class4[] v;

   public Class6(GameView var1) {
      super(47, 2, com.xy.q.Class30.afz, var1);
      this.yy(-1, 0, 282, 335, com.xy.q.Class30.agh);
      this.yu(com.xy.w.Class16.m("sc/d/1.png", 68, 68, 68, 68, false), "内丹栏");
      this.gj = new JLabel[5];

      int var2;
      for (int var10000 = var2 = 0; var10000 < this.gj.length; var10000 = ++var2) {
         this.gj[var2] = com.xy.q.Class1.k(52, 53 + var2 * 23, 72, 19, Color.black, com.xy.q.Class49.ch);
         JLabel var6 = this.gj[var2];
         String var15;
         if (var2 == 0) {
            var15 = "内丹名称";
         } else if (var2 == 1) {
            var15 = "等  级";
         } else if (var2 == 2) {
            var15 = "转生次数";
         } else if (var2 == 3) {
            var15 = "当前经验";
         } else if (var2 == 4) {
            var15 = "升级经验";
         } else {
            var15 = "";
         }

         var6.setText(var15);
         this.add(this.gj[var2]);
         if (var2 == 3 || var2 == 4) {
            this.gj[var2].setBounds(52, 233 + (var2 - 3) * 23, 72, 19);
         }
      }

      this.ed = new RichLabel("", com.xy.q.Class49.w);
      this.ed.setTextSize("#cFFFFFF学习交流#cFF0000练习自学#cFFFFFF练习自学【学习交流】，练习自学：学习交流#c00FF00练习自学#cFFFFFF，学习交流#c00FF00练习自学、%#cFFFFFF学习交流。", 188);
      this.ed.setBounds(58, 128, this.ed.getWidth(), this.ed.getHeight());
      this.add(this.ed);
      this.v = new com.xy.i.Class4[5];

      for (int var7 = var2 = 0; var7 < this.v.length; var7 = var2) {
         if (var2 < 3) {
            var7 = var2;
            this.v[var2] = new com.xy.i.Class4("sc/e/49.png", 1, 23 + var2, this);
         } else {
            com.xy.i.Class4[] var9 = this.v;
            int var32 = 49 + var2;
            String var33;
            Class6 var10010;
            if (var2 == 3) {
               var33 = "转换经验";
               var10010 = this;
            } else if (var2 == 4) {
               var33 = "吐出内丹";
               var10010 = this;
            } else {
               var33 = "";
               var10010 = this;
            }

            com.xy.i.Class4 var10002 = new com.xy.i.Class4("sc/e/26.png", 1, var32, com.xy.q.Class49.ch, com.xy.q.Class49.bv, var33, var10010);
            var9[var2] = var10002;
            var7 = var2;
         }

         Class6 var10;
         if (var7 < 3) {
            var10 = this;
            this.v[var2].setBounds(110 + 30 * var2, 19, 17, 17);
         } else {
            var10 = this;
            this.v[var2].setBounds(43 + 112 * (var2 - 3), 285, 99, 25);
         }

         var10.add(this.v[var2++]);
      }

      this.fa = new com.xy.q.Class14[5];

      for (int var11 = var2 = 0; var11 < this.fa.length; var11 = var2) {
         this.fa[var2] = com.xy.q.Class1.i(132, 53 + var2 * 23, 119, 19, 10, Color.white, com.xy.q.Class49.w);
         this.fa[var2].mt(com.xy.w.Class16.m("sc/d/17.png", 6, 6, 6, 6, false));
         if (var2 == 3 || var2 == 4) {
            this.fa[var2].setBounds(132, 233 + (var2 - 3) * 23, 119, 19);
         }

         this.add(this.fa[var2++]);
      }

      this.fp = new com.xy.w.Class18[3];

      for (int var13 = var2 = 0; var13 < this.fp.length; var13 = var2) {
         this.fp[var2] = new com.xy.w.Class18();
         Class6 var14;
         String var10003;
         if (var2 == 0) {
            var14 = this;
            this.fp[var2].dp("sc/d/37.png");
            this.fp[var2].setBounds(109 + 31 * var2, 18, 19, 19);
         } else if (var2 == 1) {
            var14 = this;
            this.fp[var2].mt(com.xy.w.Class16.m("sc/d/60.png", 76, 2, 76, 2, false));
            this.fp[var2].setBounds(46, 36, 210, 7);
         } else {
            if (var2 == 2) {
               this.fp[var2].mt(com.xy.w.Class16.m("sc/d/24.png", 2, 2, 2, 2, false));
               this.fp[var2].setBounds(55, 127, 195, 100);
            }

            var14 = this;
         }

         var14.add(this.fp[var2++]);
      }
   }

   public void ew(RoleSummoning var1) {
      this.ey(var1, this.cb);
   }

   public BigDecimal ex() {
      return this.gi;
   }

   public BigDecimal em() {
      return this.ee;
   }

   public void h() {
      int var10000 = this.cb = 0;
      this.ee = null;
      this.gi = null;
      this.ed.setTextSize(null, 188);

      for (int var1 = 0; var10000 < this.fa.length; var10000 = var1) {
         this.fa[var1++].setText(null);
      }
   }

   public void ey(RoleSummoning var1, int var2) {
      if (var1 == null) {
         this.h();
         this.zc().f(this.lj());
      } else {
         BigDecimal var3 = null;
         int var10000 = 0;
         this.fp[0].setBounds(109 + 30 * var2, 18, 19, 19);

         for (int var4 = 0; var10000 < 3; var10000 = var4) {
            this.v[var4++].setVisible(false);
         }

         if (com.xy.v.Class12.h(var1.getInnerGoods())) {
            this.h();
            this.zc().f(this.lj());
         } else {
            String var14 = var1.getInnerGoods();
            String var21 = "5F";
            String[] var12 = var14.split("\\|");
            var2 = Math.min(var2, var12.length - 1);
            int var5;
            var10000 = var5 = 0;

            Class6 var16;
            while (true) {
               if (var10000 >= var12.length) {
                  var16 = this;
                  break;
               }

               if (var5 >= 3) {
                  var16 = this;
                  break;
               }

               this.v[var5].setVisible(true);
               if (var5 == var2) {
                  var3 = new BigDecimal(var12[var5]);
               }

               var10000 = ++var5;
            }

            var16.cb = var2;
            this.ee = var1.getSid();
            this.gi = var3;
            Goodstable var13;
            if ((var13 = this.yx().getGoodEquip(var3)) != null) {
               this.fa[0].setText(var13.getGoodsname());
               String var17 = var13.getValue();
               var21 = "\u000bK";
               String[] var18 = var17.split("\\|");
               String[] var6 = var18[2].split("\\=");
               String[] var7 = var6[1].split("\\转");
               String[] var8 = var18[3].split("\\=");
               this.fa[1].setText(new StringBuilder(String.valueOf(var6[1])).append("级").toString());
               this.fa[2].setText(var7[0]);
               this.fa[3].setText(var8[1]);
               this.fa[4].setText(String.valueOf(this.yt().n(Integer.parseInt(var7[0]), Integer.parseInt(var7[1]) + 1)));
               String[] var10 = var18[0].split("\\=")[1].split("\\:");
               this.ed.setTextSize(var10[1], 188);
               if (this.zc().l(this.lj()) == null) {
                  this.zc().b(this.lj());
               }
            } else {
               this.h();
               this.zc().f(this.lj());
            }
         }
      }
   }
}
