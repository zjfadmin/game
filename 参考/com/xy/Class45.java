package com.xy;

import com.xy.entity.RoleSummoning;
import com.xy.readbean.Goodstable;
import com.xy.richtext.RichLabel;
import com.xy.text.GameView;
import java.awt.Color;
import java.awt.Font;
import java.math.BigDecimal;
import javax.swing.JLabel;

public class Class45 extends Class345 {
   private BigDecimal rc;
   private int gw;
   private JLabel[] iv;
   private BigDecimal aaq;
   private RichLabel bv;
   private Class245[] nr;
   private Class436[] an;
   private Class643[] aco;

   public BigDecimal ug() {
      return this.rc;
   }

   public BigDecimal ez() {
      return this.aaq;
   }

   public void v(RoleSummoning var1) {
      this.gs(var1, this.gw);
   }

   public void gs(RoleSummoning var1, int var2) {
      if (var1 == null) {
         this.d();
         this.ve().n(this.ae());
      } else {
         BigDecimal var4 = null;
         int var10002 = 3 >> 2;
         int var10000 = 3 >> 2;
         this.an[var10002].setBounds((111 & 125) + (63 & 94) * var2, 114 & 31, 127 & 19, 127 & 19);

         for(int var3 = var10000; var10000 < 3; var10000 = var3) {
            this.aco[var3++].setVisible((boolean)(3 >> 2));
         }

         if (Class394.o(var1.getInnerGoods())) {
            this.d();
            this.ve().n(this.ae());
         } else {
            String[] var8 = var1.getInnerGoods().split("\\|");
            var2 = Math.min(var2, var8.length - (3 >> 1));
            int var5;
            var10000 = var5 = 2 & 5;

            Class45 var11;
            while(true) {
               if (var10000 >= var8.length) {
                  var11 = this;
                  break;
               }

               if (var5 >= --3) {
                  var11 = this;
                  break;
               }

               this.aco[var5].setVisible((boolean)(4 ^ 5));
               if (var5 == var2) {
                  var4 = new BigDecimal(var8[var5]);
               }

               ++var5;
               var10000 = var5;
            }

            var11.gw = var2;
            this.aaq = var1.getSid();
            this.rc = var4;
            Goodstable var9;
            if ((var9 = this.vd().getGoodEquip(var4)) != null) {
               this.nr[3 ^ 3].setText(var9.getGoodsname());
               String[] var12 = var9.getValue().split("\\|");
               String[] var6;
               String[] var7 = (var6 = var12[--2].split("\\="))[3 >> 1].split("\\转");
               String[] var10 = var12[--3].split("\\=");
               int var10001 = 5 >> 3;
               this.nr[5 >> 2].setText(var6[--1] + "级");
               this.nr[1 ^ 3].setText(var7[3 & 4]);
               this.nr[--3].setText(var10[5 >> 2]);
               this.nr[--4].setText(String.valueOf(this.vc().aw(Integer.parseInt(var7[5 >> 3]), Integer.parseInt(var7[--1]) + (5 >> 2))));
               var6 = var12[var10001].split("\\=")[--1].split("\\:");
               this.bv.setTextSize(var6[5 >> 2], 15103 & 17852);
               if (this.ve().m(this.ae()) == null) {
                  this.ve().a(this.ae());
               }

            } else {
               this.d();
               this.ve().n(this.ae());
            }
         }
      }
   }

   public Class45(GameView var1) {
      int var10001 = --5;
      int var10005 = -4 >> 2;
      super(47 & 127, 1 ^ 3, Class345.aef, var1);
      this.va(var10005, 3 & 4, 32062 & 987, 6623 & 26479, Class345.aeo);
      this.uv(Class511.q("sc/d/1.png", 124 & 71, 124 & 71, 124 & 71, 124 & 71, (boolean)(3 >> 2)), "内丹栏");
      JLabel[] var3 = new JLabel[var10001];
      boolean var10003 = true;
      this.iv = var3;

      int var2;
      int var10000;
      for(var10000 = var2 = 3 ^ 3; var10000 < this.iv.length; var10000 = var2) {
         this.iv[var2] = Class133.b(63 & 116, (117 & 63) + var2 * (31 & 119), 79 & 120, 19 & 127, Color.black, Class681.ak);
         this.iv[var2].setText(var2 == 0 ? "内丹名称" : (var2 == --1 ? "等  级" : (var2 == (1 ^ 3) ? "转生次数" : (var2 == --3 ? "当前经验" : (var2 == --4 ? "升级经验" : "")))));
         this.add(this.iv[var2]);
         if (var2 == --3 || var2 == --4) {
            this.iv[var2].setBounds(126 & 53, (32233 & 767) + (var2 - --3) * (31 & 119), 125 & 74, 83 & 63);
         }

         ++var2;
      }

      var10001 = --5;
      this.bv = new RichLabel("", Class681.q);
      this.bv.setTextSize("#cFFFFFF学习交流#cFF0000练习自学#cFFFFFF练习自学【学习交流】，练习自学：学习交流#c00FF00练习自学#cFFFFFF，学习交流#c00FF00练习自学、%#cFFFFFF学习交流。", 18943 & 14012);
      this.bv.setBounds(127 & 58, 128, this.bv.getWidth(), this.bv.getHeight());
      this.add(this.bv);
      Class643[] var5 = new Class643[var10001];
      var10003 = true;
      this.aco = var5;

      Class45 var7;
      for(var10000 = var2 = 2 & 5; var10000 < this.aco.length; var10000 = var2) {
         if (var2 < --3) {
            var10000 = var2;
            this.aco[var2] = new Class643("sc/e/49.png", 3 >> 1, 23 + var2, this);
         } else {
            Class643[] var4 = this.aco;
            Class643 var10002 = new Class643;
            var10005 = --1;
            int var10006 = 49 + var2;
            Font var10007 = Class681.ak;
            Color[] var10008 = Class681.c;
            String var10009;
            Class45 var10010;
            if (var2 == --3) {
               var10009 = "转换经验";
               var10010 = this;
            } else if (var2 == --4) {
               var10009 = "吐出内丹";
               var10010 = this;
            } else {
               var10009 = "";
               var10010 = this;
            }

            var10002.<init>("sc/e/26.png", var10005, var10006, var10007, var10008, var10009, var10010);
            var4[var2] = var10002;
            var10000 = var2;
         }

         if (var10000 < 3) {
            var7 = this;
            this.aco[var2].setBounds(110 + 30 * var2, 19, 17, 17);
         } else {
            var7 = this;
            this.aco[var2].setBounds(43 + 112 * (var2 - --3), 285, 99, 25);
         }

         var7.add(this.aco[var2++]);
      }

      Class245[] var6 = new Class245[--5];
      var10003 = true;
      this.nr = var6;

      for(var10000 = var2 = 2 & 5; var10000 < this.nr.length; var10000 = var2) {
         this.nr[var2] = Class133.a(132, 53 + var2 * 23, 119, 19, 10, Color.white, Class681.q);
         this.nr[var2].eq(Class511.q("sc/d/17.png", 6, 6, 6, 6, (boolean)(2 & 5)));
         if (var2 == --3 || var2 == 4) {
            this.nr[var2].setBounds(132, 233 + (var2 - 3) * 23, 119, 19);
         }

         this.add(this.nr[var2++]);
      }

      Class436[] var9 = new Class436[3];
      var10003 = true;
      this.an = var9;

      for(var10000 = var2 = 5 >> 3; var10000 < this.an.length; var10000 = var2) {
         this.an[var2] = new Class436();
         if (var2 == 0) {
            var7 = this;
            this.an[var2].fw("sc/d/37.png");
            this.an[var2].setBounds(109 + 31 * var2, 18, 19, 19);
         } else if (var2 == (4 ^ 5)) {
            var7 = this;
            this.an[var2].eq(Class511.q("sc/d/60.png", 76, 2, 76, 2, (boolean)(3 ^ 3)));
            this.an[var2].setBounds(46, 36, 210, 7);
         } else {
            if (var2 == 2) {
               this.an[var2].eq(Class511.q("sc/d/24.png", 2, 2, 2, 2, (boolean)(3 & 4)));
               this.an[var2].setBounds(55, 127, 195, 100);
            }

            var7 = this;
         }

         var7.add(this.an[var2++]);
      }

   }

   public void d() {
      int var10000 = 2 & 5;
      this.gw = 5 >> 3;
      this.aaq = null;
      this.rc = null;
      this.bv.setTextSize((String)null, 16639 & 16316);

      for(int var1 = var10000; var10000 < this.nr.length; var10000 = var1) {
         this.nr[var1++].setText((String)null);
      }

   }
}
