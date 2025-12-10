package com.xy;

import com.xy.text.GameView;
import com.xy.text.ScreenData;
import java.awt.Color;
import java.awt.Font;

public class Class272 extends Class345 {
   private int j;
   private Class600[] mp;
   public Class600 mq;
   public <undefinedtype> mr;

   public void r(boolean var1) {
      this.mr.setVisible(var1);
   }

   public void setVisible(boolean var1) {
      if (var1) {
         this.cc();
      }

      super.setVisible(var1);
   }

   public void d() {
      int var10001 = 3 & 4;
      this.j = -4 >> 2;
      this.setVisible((boolean)var10001);
   }

   public void hb(int var1, boolean var2, int var3) {
      int var10000;
      Class272 var5;
      if ((this.j = var1) == -4 >> 2) {
         for(var10000 = var3 = 2 & 5; var10000 < this.mp.length; var10000 = var3) {
            this.mp[var3++].setVisible((boolean)(3 >> 2));
         }

         var5 = this;
      } else if (var1 == 0) {
         for(var10000 = var3 = 2 & 5; var10000 < this.mp.length; var10000 = var3) {
            if (!var2 || this.mp[var3].ae() != 3 >> 1 && this.mp[var3].ae() != --2 && this.mp[var3].ae() != --4 && this.mp[var3].ae() != (110 & 23) && this.mp[var3].ae() != (71 & 63)) {
               var5 = this;
               this.hc(this.mp[var3], --1);
            } else {
               var5 = this;
               this.hc(this.mp[var3], -4 >> 2);
            }

            var5.mp[var3].setBounds(3 & 4, (121 & 31) * var3, 127 & 59, 57 & 95);
            this.mp[var3++].setVisible((boolean)(--1));
         }

         var5 = this;
      } else {
         if (var1 == (4 ^ 5)) {
            var3 = 2 & 5;
            int var4 = 2 & 5;

            for(var10000 = var3; var10000 < this.mp.length; var10000 = var3) {
               if (this.mp[var3].ae() < --5 || this.mp[var3].ae() > (14 & 121)) {
                  this.hc(this.mp[var3], 2 ^ 3);
                  this.mp[var3].setBounds(3 & 4, var4 * (127 & 25), 63 & 123, 93 & 59);
                  ++var4;
                  this.mp[var3].setVisible((boolean)(--1));
               }

               ++var3;
            }
         }

         var5 = this;
      }

      var5.setVisible(true);
      if (var1 != -4 >> 2) {
         this.mr.setVisible((boolean)(3 >> 1));
      }

   }

   public void cc() {
      ScreenData var1 = this.aej.screenData;
      if (this.j == -4 >> 2) {
         this.setBounds(3 ^ 3, 3 ^ 3, 3 ^ 3, 3 ^ 3);
      } else {
         int var2 = (int)((double)var1.Screen_x * 0.88D);
         int var3 = (int)((double)var1.Screen_y * 0.3D);
         this.setBounds(Math.max(var2, var1.Screen_x - (101 & 126)), var3, 127 & 59, this.j == 0 ? 7116 & 25851 : 100);
      }
   }

   public Class272(GameView var1) {
      int var10001 = 125 & 10;
      super(-4 >> 2, -4 >> 2, Class345.aef, var1);
      this.va(3 >> 2, 3 >> 2, 3 >> 2, 3 >> 2, Class345.aei);
      Class600[] var4 = new Class600[var10001];
      boolean var10003 = true;
      this.mp = var4;

      int var2;
      for(int var10000 = var2 = 2 & 5; var10000 < this.mp.length; var10000 = var2) {
         Class600[] var3 = this.mp;
         Class600 var10002 = new Class600;
         int var10007 = 2 ^ 3;
         int var10005 = 2 ^ 3;
         int var10006 = var2 + var10007;
         Font var6 = Class681.ak;
         Color[] var10008 = Class681.c;
         String var10009;
         Class272 var10010;
         if (var2 == 0) {
            var10009 = "法术";
            var10010 = this;
         } else if (var2 == --1) {
            var10009 = "道具";
            var10010 = this;
         } else if (var2 == (1 ^ 3)) {
            var10009 = "防御";
            var10010 = this;
         } else if (var2 == --3) {
            var10009 = "保护";
            var10010 = this;
         } else if (var2 == --4) {
            var10009 = "召唤";
            var10010 = this;
         } else if (var2 == --5) {
            var10009 = "召回";
            var10010 = this;
         } else if (var2 == (46 & 87)) {
            var10009 = "捕捉";
            var10010 = this;
         } else {
            var10009 = "逃跑";
            var10010 = this;
         }

         var10002.<init>("sc/e/7.png", var10005, var10006, var6, var10008, var10009, var10010);
         var3[var2] = var10002;
         this.mp[var2].setBounds(2 & 5, (57 & 95) * var2, 123 & 63, 57 & 95);
         this.add(this.mp[var2++]);
      }

      this.mr = new Class456() {
         private Class226 ave;
         private Class600 avf = new Class600("sc/d/216.png", 3 & 5, 111 & 27, Class272.this.gk());

         public {
            this.avf.setBounds(3 ^ 3, 3 ^ 3, 101 & 58, 101 & 58);
            this.add(this.avf);
            int var10004 = -4 >> 2;
            int var10005 = 3 ^ 3;
            Font var10006 = Class681.ak;
            String[] var10008 = new String[--3];
            boolean var10010 = true;
            var10008[3 & 4] = "";
            var10008[3 >> 1] = "撤";
            var10008[1 ^ 3] = "回";
            this.ave = new Class226("sc/d/217.png", var10004, var10005, var10006, (Color[])null, var10008, Class272.this.gk());
            this.ave.setForeground(Color.white);
            this.ave.setBounds(--4, -3 & -2, 59 & 92, 124 & 115);
            this.add(this.ave);
         }
      };
      this.mr.setVisible((boolean)(3 >> 2));
      var1.add(this.mr);
      this.mq = new Class600("sc/e/7.png", 2 ^ 3, 111 & 28, Class681.ak, Class681.c, "投降", this);
      this.mq.setVisible((boolean)(5 >> 3));
      var1.add(this.mq);
   }

   public void hc(Class600 var1, int var2) {
      if (var2 != var1.getBtn()) {
         if (var2 == (4 ^ 5)) {
            var1.setBtn(--1, "sc/e/7.png");
         } else {
            var1.setBtn(-4 >> 2, "sc/e/55.png");
         }
      }
   }
}
