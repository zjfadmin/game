package com.xy;

import com.xy.readbean.Eshop;
import com.xy.readbean.RoleTxBean;
import com.xy.text.GameView;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.util.List;
import javax.swing.JLabel;

public class Class139 extends Class345 {
   private Eshop[] aov;
   private int dp;
   private Class529[] aow;
   private int gv;
   private JLabel ik;
   private Class19 aox;
   private int fk;
   private Class436 uc;
   private Class529[] xq;
   private Class254[] aoy;
   private Class245 cv;
   private int m;

   public Class139(GameView var1) {
      int var10001 = --3;
      int var10003 = 3 >> 2;
      int var10005 = --1;
      int var10007 = --1;
      super(-4 >> 2, -4 >> 2, Class345.aei, var1);
      this.fk = var10007;
      this.gv = var10005;
      this.va(var10003, 3 >> 2, 27370 & 6079, 2047 & 31195, Class345.aei);
      Eshop[] var4 = new Eshop[var10001];
      boolean var9 = true;
      this.aov = var4;
      Class529[] var5 = new Class529[--3];
      var9 = true;
      this.xq = var5;

      int var2;
      Class529[] var3;
      Font var10;
      int var10000;
      Class529 var10002;
      int var10006;
      String var10009;
      Class139 var10010;
      for(var10000 = var2 = 2 & 5; var10000 < this.xq.length; var10000 = var2) {
         var3 = this.xq;
         var10002 = new Class529;
         var10005 = 5 >> 1;
         var10006 = (4095 & 28943) + var2;
         var10 = Class681.cw;
         if (var2 == 0) {
            var10009 = "特效";
            var10010 = this;
         } else if (var2 == 3 >> 1) {
            var10009 = "装饰品";
            var10010 = this;
         } else if (var2 == 5 >> 1) {
            var10009 = "足迹";
            var10010 = this;
         } else {
            var10009 = "";
            var10010 = this;
         }

         var10002.<init>("sc/e/39.png", var10005, var10006, var10, (Color[])null, var10009, var10010);
         var3[var2] = var10002;
         this.xq[var2].setBounds((18363 & 14847) + (67 & 125) * var2, 79 & 121, 127 & 63, 126 & 25);
         this.add(this.xq[var2++]);
      }

      Class254[] var6 = new Class254[78 & 55];
      var9 = true;
      this.aoy = var6;

      for(var10000 = var2 = 3 ^ 3; var10000 < this.aoy.length; var10000 = var2) {
         this.aoy[var2] = new Class254(this);
         this.aoy[var2].setBounds((32254 & 797) + var2 % --3 * (125 & 127), (119 & 104) + var2 / --3 * (18935 & 13997), 115 & 127, 6550 & 26367);
         this.add(this.aoy[var2++]);
      }

      var5 = new Class529[107 & 28];
      var9 = true;
      this.aow = var5;

      for(var10000 = var2 = 3 ^ 3; var10000 < this.aow.length; var10000 = var2) {
         var3 = this.aow;
         var10002 = new Class529;
         var10005 = --1;
         var10006 = 274 + var2;
         var10 = Class681.bm;
         if (var2 == 0) {
            var10009 = "首页";
            var10010 = this;
         } else if (var2 == (2 ^ 3)) {
            var10009 = "末页";
            var10010 = this;
         } else if (var2 == 6) {
            var10009 = "卸除";
            var10010 = this;
         } else if (var2 == 7) {
            var10009 = "试穿";
            var10010 = this;
         } else {
            var10009 = "";
            var10010 = this;
         }

         var10002.<init>("sc/e/6.png", var10005, var10006, var10, (Color[])null, var10009, var10010);
         var3[var2] = var10002;
         this.aow[var2].setBounds(264 + 140 * var2, 435, 34, 18);
         Class139 var8;
         if (var2 != (1 ^ 3) && var2 != --3) {
            if (var2 != --4 && var2 != --5) {
               if (var2 == 6 || var2 == 7) {
                  this.aow[var2].setBounds(185 + 40 * (var2 - 6), 391, 34, 18);
               }

               var8 = this;
            } else {
               if (var2 == --4) {
                  var8 = this;
                  this.aow[var2].setImage("sc/e/32.png");
               } else {
                  if (var2 == --5) {
                     this.aow[var2].setImage("sc/e/34.png");
                  }

                  var8 = this;
               }

               var8.aow[var2].setBounds(139 + 35 * (var2 - 4), 353, 11, 15);
               var8 = this;
            }
         } else {
            if (var2 == --2) {
               var8 = this;
               this.aow[var2].setImage("sc/e/42.png");
            } else {
               if (var2 == --3) {
                  this.aow[var2].setImage("sc/e/43.png");
               }

               var8 = this;
            }

            var8.aow[var2].setBounds(301 + 82 * (var2 - --2), 435, 18, 18);
            var8 = this;
         }

         var8.add(this.aow[var2++]);
      }

      this.ik = Class133.b(53, 392, 130, 16, Color.black, Class681.ca);
      this.ik.setText("装扮数：0");
      this.ik.setHorizontalAlignment(10);
      this.add(this.ik);
      this.cv = Class133.a(322, 435, 58, 18, 2 & 5, Color.white, Class681.q);
      this.cv.eq(Class511.q("sc/d/17.png", 6, 6, 6, 6, (boolean)(5 >> 3)));
      this.add(this.cv);
      this.uc = new Class436(Class511.q("sc/d/16.png", 2, 2, 2, 2, (boolean)(5 >> 3)));
      this.uc.setBounds(53, 98, 218, 292);
      this.add(this.uc);
   }

   protected void paintChildren(Graphics var1) {
      super.paintChildren(var1);
      if (this.aox != null) {
         this.aox.a(var1, 30367 & 2558, 23983 & 9076, this.dp, Class280.l());
      }

   }

   public void do(int var1) {
      Eshop var2;
      if ((var2 = this.aov[var1]) != null) {
         this.aov[var1] = null;
         RoleTxBean var3;
         if ((var3 = this.vc().bw(-Integer.parseInt(var2.getEshopiid()))) != null) {
            this.aox = this.aox.j("tx/tx" + var3.getRdId());
         }

         var1 = 0;

         int var4;
         for(int var10000 = var4 = 5 >> 3; var10000 < this.aov.length; var10000 = var4) {
            if (this.aov[var4] != null) {
               ++var1;
            }

            ++var4;
         }

         this.ik.setText("装扮数：" + var1);
      }
   }

   public void dp(int var1) {
      int var10000 = 3 ^ 3;
      this.m = var1;

      for(var1 = var10000; var10000 < this.xq.length; var10000 = var1) {
         this.xq[var1].setKeep((boolean)(var1 == this.m ? 3 & 5 : 0));
         ++var1;
      }

      this.gv = (var1 = this.e()) % (110 & 23) == 0 ? var1 / (95 & 38) : var1 / 6 + (4 ^ 5);
      this.y(3 >> 1);
   }

   public void as(int var1) {
      if (var1 == (24019 & 9022)) {
         this.y(2 ^ 3);
      } else if (var1 == (28083 & 4959)) {
         this.y(this.gv);
      } else if (var1 == (25501 & 7542)) {
         this.y(this.fk - (3 >> 1));
      } else if (var1 == (10621 & 22423)) {
         this.y(this.fk + (3 >> 1));
      } else if (var1 == (2455 & 30590)) {
         this.r((boolean)(3 & 5));
      } else if (var1 == (13663 & 19383)) {
         this.r((boolean)(5 >> 3));
      } else if (var1 == (19257 & 13790)) {
         int var10001 = --2;
         int var10003 = 2 ^ 3;
         this.do(3 ^ 3);
         this.do(var10003);
         this.do(var10001);
      } else {
         if (var1 == (7453 & 25595)) {
            ((Class359)this.ve().e(55 & 123)).ji(this.aov);
         }

      }
   }

   public void s() {
      this.aox = Class330.f(this.vd().getLoginResult().getSpecies_id().toString(), 5 >> 1, 3 >> 1, (String)null);

      int var1;
      for(int var10000 = var1 = 5 >> 3; var10000 < this.aov.length; var10000 = var1) {
         this.aov[var1++] = null;
      }

      int var10001 = 3 >> 2;
      this.ik.setText("装扮数：0");
      this.dp(var10001);
   }

   public void y(int var1) {
      int var10000;
      int var2;
      for(var10000 = var2 = 3 & 4; var10000 < this.aoy.length; var10000 = var2) {
         this.aoy[var2].q();
         this.aoy[var2++].setVisible((boolean)(3 ^ 3));
      }

      Class139 var9;
      if (var1 <= 0) {
         var1 = 5 >> 2;
         var9 = this;
      } else {
         if (var1 >= this.gv) {
            var1 = this.gv;
         }

         var9 = this;
      }

      var9.fk = var1;
      var10000 = 3 & 4;
      this.cv.setText(this.fk + "/" + this.gv);
      var2 = var10000;
      int var3 = 3 >> 2;
      var1 = (var1 - (4 ^ 5)) * (23 & 110);
      String var4 = String.valueOf((31 & 107) + this.m);
      String var5 = "仙玉";
      List var6 = this.vc().ba();

      int var7;
      for(var10000 = var7 = 5 >> 3; var10000 < var6.size(); var10000 = var7) {
         Eshop var8;
         if ((var8 = (Eshop)var6.get(var7)).getEshoptype().equals(var4)) {
            if (var2 >= var1) {
               Class254 var10 = this.aoy[var3];
               ++var3;
               var10.xk(var8, var5);
               if (var3 >= this.aoy.length) {
                  return;
               }
            }

            ++var2;
         }

         ++var7;
      }

   }

   public int e() {
      int var4 = 2 & 5;
      String var2 = String.valueOf((11 & 127) + this.m);
      List var3 = this.vc().ba();

      int var1;
      for(int var10000 = var1 = 5 >> 3; var10000 < var3.size(); var10000 = var1) {
         if (((Eshop)var3.get(var1)).getEshoptype().equals(var2)) {
            ++var4;
         }

         ++var1;
      }

      return var4;
   }

   public void r(boolean var1) {
      if (this.dp == 0) {
         this.dp = var1 ? --4 : 7;
      } else if (this.dp == --1) {
         this.dp = var1 ? --5 : 4;
      } else if (this.dp == --2) {
         this.dp = var1 ? 119 & 14 : 5;
      } else if (this.dp == --3) {
         this.dp = var1 ? 127 & 7 : 6;
      } else if (this.dp == --4) {
         this.dp = var1 ? 5 >> 2 : 0;
      } else if (this.dp == --5) {
         this.dp = var1 ? 1 ^ 3 : 1;
      } else if (this.dp == (14 & 119)) {
         this.dp = var1 ? --3 : 2;
      } else {
         if (this.dp == (47 & 87)) {
            this.dp = var1 ? 5 >> 3 : 3;
         }

      }
   }

   public void d() {
      int var10000 = 2 & 5;
      this.aox = null;

      for(int var1 = var10000; var10000 < this.aov.length; var10000 = var1) {
         this.aov[var1++] = null;
      }

      this.ik.setText("装扮数：0");
   }

   public void sq(Eshop var1) {
      if (var1 != null) {
         int var10000;
         if (var1.getEshoptype().equals("11")) {
            var10000 = 3 ^ 3;
         } else if (var1.getEshoptype().equals("12")) {
            var10000 = --1;
         } else {
            boolean var7 = true;
         }

         RoleTxBean var3;
         if ((var3 = this.vc().bw(-Integer.parseInt(var1.getEshopiid()))) != null) {
            int var2 = var3.getRdType() - (4 ^ 5);
            this.do(var2);
            this.aov[var2] = var1;
            Class19 var4 = Class330.f("tx/tx" + var3.getRdId(), -1 & -2, var3.getRdStatues() - var3.getRdType(), (String)null);
            this.aox = this.aox.d(var4);
         }

         int var6 = 0;

         int var5;
         for(var10000 = var5 = 5 >> 3; var10000 < this.aov.length; var10000 = var5) {
            if (this.aov[var5] != null) {
               ++var6;
            }

            ++var5;
         }

         this.ik.setText("装扮数：" + var6);
      }
   }
}
