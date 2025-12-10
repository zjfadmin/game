package com.xy;

import com.xy.formula.GoodType;
import com.xy.game.RoleData;
import com.xy.readbean.Goodstable;
import com.xy.text.GameView;
import javax.swing.JLabel;

public class Class14 extends Class345 {
   private Class489 axd;
   private Class44 cn;
   private Class350 axe;
   private Class436[] an;
   private JLabel[] u;

   public void p() {
      int var10000;
      int var1;
      for(var10000 = var1 = 1 ^ 3; var10000 < 6; var10000 = var1) {
         this.u[var1++].setText("");
      }

      RoleData var4 = this.vd();
      Goodstable var2;
      if ((var2 = (Goodstable)this.cn.hr()) != null) {
         var2 = var4.getGood(var2.getRgid());
      }

      if (var2 != null) {
         String var5;
         if ((var5 = GoodType.getExtra(var2.getValue(), GoodType.Extras[--3])) != null) {
            String[] var6 = var5.split("\\&");

            int var7;
            for(var10000 = var7 = --4; var10000 < var6.length; var10000 = var7) {
               String[] var3 = var6[var7].split("\\=");
               this.u[(5 >> 1) + (5 >> 1) * (var7 - --4)].setText(var3[2 & 5]);
               this.u[(5 >> 1) + (5 >> 1) * (var7 - --4) + (3 >> 1)].setText(var3[4 ^ 5] + Class270.so(var3[2 & 5]));
               if (var7 == --1) {
                  return;
               }

               ++var7;
            }

         }
      }
   }

   public Class14(GameView var1) {
      int var10001 = 38 & 95;
      int var10006 = 127 & 46;
      super(-4 >> 2, -4 >> 2, Class345.aei, var1);
      this.va(var10006, 74 & 127, 3051 & 30206, 5548 & 27647, Class345.aei);
      this.axd = new Class489("sc/e/31.png", 3 >> 1, 5 >> 1, Class681.ak, Class681.c, "洗 练", this);
      this.axd.setBounds(3897 & 29159, 30182 & 2877, 127 & 79, 63 & 89);
      this.add(this.axd);
      JLabel[] var6 = new JLabel[var10001];
      boolean var10003 = true;
      this.u = var6;

      int var4;
      Class14 var5;
      int var10000;
      for(var10000 = var4 = 3 ^ 3; var10000 < this.u.length; var10000 = var4) {
         this.u[var4] = Class133.c(57 & 127, 123 & 92, 37 & 127, 57 & 87, 3 ^ 3, Class681.c("#c000000"), Class681.ak);
         this.u[var4].setText(var4 == 0 ? "套装" : (var4 == (2 ^ 3) ? "现有套装属性" : ""));
         if (var4 == 5 >> 2) {
            this.u[var4].setForeground(Class681.c("#cFFFFFF"));
            this.u[var4].setBounds(17279 & 15764, 509 & 32511, 32767 & 191, 20);
         }

         label109: {
            if (var4 >= 5 >> 1 && var4 <= --5) {
               this.u[var4].setFont(Class681.ce);
               this.u[var4].setForeground(Class681.c("#cFFFFFF"));
               if (var4 == 5 >> 1) {
                  var5 = this;
                  this.u[var4].setBounds(276, 273, 135, 27);
                  break label109;
               }

               if (var4 == --3) {
                  var5 = this;
                  this.u[var4].setBounds(411, 273, 56, 27);
                  break label109;
               }

               if (var4 == --4) {
                  var5 = this;
                  this.u[var4].setBounds(276, 300, 135, 27);
                  break label109;
               }

               if (var4 == --5) {
                  this.u[var4].setBounds(411, 300, 56, 27);
               }
            }

            var5 = this;
         }

         var5.u[var4].setBounds(this.u[var4].getX() - 46, this.u[var4].getY() - 74, this.u[var4].getWidth(), this.u[var4].getHeight());
         this.add(this.u[var4++]);
      }

      this.cn = new Class44(this);
      this.cn.setBounds(302, 104, 50, 50);
      this.add(this.cn);
      Class436[] var7 = new Class436[8];
      var10003 = true;
      this.an = var7;

      for(var10000 = var4 = 3 & 4; var10000 < this.an.length; var10000 = var4) {
         this.an[var4] = new Class436();
         this.add(this.an[var4]);
         if (var4 == 0) {
            var10000 = 5 >> 1;
            this.an[var4].eq(Class511.q("sc/d/19.png", --5, --5, --5, --5, (boolean)(5 >> 3)));
            this.an[var4].setBounds(59, 109, 156, 360);
            Class216[] var10 = new Class216[var10000];
            boolean var8 = true;
            Class216[] var2 = var10;

            int var3;
            for(var10000 = var3 = 5 >> 3; var10000 < var2.length; var10000 = var3) {
               if (var3 == 0) {
                  var2[var3] = new Class216("sc/e/42.png", 4 ^ 5, 3 ^ 3, this);
                  var10000 = var3;
               } else {
                  var2[var3] = new Class216("sc/e/43.png", --1, --1, this);
                  var10000 = var3;
               }

               if (var10000 == 0) {
                  var5 = this;
                  var2[var3].setBounds(111, 395, 18, 18);
               } else {
                  var2[var3].setBounds(140, 395, 18, 18);
                  var5 = this;
               }

               var5.add(var2[var3++]);
            }

            var5 = this;
            this.axe = new Class350(1 ^ 3, this, --3, 7, 51, 51, 2 & 5, 2 & 5, 14, 37);
            this.axe.hf(Class511.a("sc/d/18.png"));
            this.axe.aix(var2, 5 >> 2);
            this.add(this.axe);
         } else if (var4 == (2 ^ 3)) {
            var5 = this;
            this.an[var4].fw("sc/d/4.png");
            this.an[var4].setBounds(344, 174, 59, 57);
         } else {
            label130: {
               if (var4 >= (1 ^ 3) && var4 <= 6) {
                  this.an[var4].eq(Class511.q("sc/d/24.png", --2, --2, --2, --2, (boolean)(3 ^ 3)));
                  if (var4 == --2) {
                     var5 = this;
                     this.an[var4].setBounds(276, 253, 191, 20);
                     break label130;
                  }

                  if (var4 == --3) {
                     var5 = this;
                     this.an[var4].setBounds(276, 273, 135, 27);
                     break label130;
                  }

                  if (var4 == 4) {
                     var5 = this;
                     this.an[var4].setBounds(411, 273, 56, 27);
                     break label130;
                  }

                  if (var4 == 5) {
                     var5 = this;
                     this.an[var4].setBounds(276, 300, 135, 27);
                     break label130;
                  }

                  if (var4 == 6) {
                     var5 = this;
                     this.an[var4].setBounds(411, 300, 56, 27);
                     break label130;
                  }
               } else if (var4 == 9) {
                  this.an[var4].eq(Class511.q("sc/d/33.png", 30, 30, 30, 30, (boolean)(3 >> 2)));
                  this.an[var4].setBounds(229, 111, 289, 358);
               }

               var5 = this;
            }
         }

         var5.an[var4].setBounds(this.an[var4].getX() - 46, this.an[var4].getY() - 74, this.an[var4].getWidth(), this.an[var4++].getHeight());
      }

   }

   public void s() {
      RoleData var1 = this.vd();
      Goodstable var2;
      if ((var2 = (Goodstable)this.cn.hr()) != null) {
         var2 = var1.getGood(var2.getRgid());
      }

      if (var2 == null) {
         this.aej.fw("请选择你要洗炼的套装..");
      } else if (var2.getGoodlock() == --1) {
         this.aej.fw("该物品已被加锁");
      } else {
         ((Class86)this.ve().e(126 & 75)).ax(var2);
      }
   }

   public void d() {
      this.cn.c(3 >> 2, (Object)null);
      this.p();
      this.axe.aiz().i(2 & 5);
   }

   public Class44 u() {
      return this.cn;
   }
}
