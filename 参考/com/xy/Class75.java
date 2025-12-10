package com.xy;

import com.xy.formula.ActivityMenuSet2;
import com.xy.readbean.Activity;
import com.xy.richtext.RichLabel;
import com.xy.text.GameView;
import java.awt.Color;
import java.awt.Graphics;

public class Class75 extends Class345 {
   private Class16 ayf;
   private Activity ayg;
   private Class379[] ayh;
   private Class436[] pv;
   private int j;
   private RichLabel bw;
   private Class315 ayi;
   private Class137 ayj;

   protected void paintComponent(Graphics var1) {
      if (this.aej.bl()) {
         this.d();
      }

      super.paintComponent(var1);
   }

   public Class75(Activity var1, GameView var2) {
      int var10005 = 2 & 5;
      super(-4 >> 2, -4 >> 2, Class345.aei, var2);
      this.va(var10005, 3 & 4, 1785 & 31727, 7143 & 26076, Class345.aei);
      this.ayg = var1;
      ActivityMenuSet2[] var4;
      Class379[] var10001 = new Class379[(var4 = var1.getMenuSet2s()).length];
      boolean var10003 = true;
      this.ayh = var10001;

      int var5;
      int var10000;
      for(var10000 = var5 = 5 >> 3; var10000 < this.ayh.length; var10000 = var5) {
         ActivityMenuSet2 var3 = var4[var5];
         this.ayh[var5] = new Class379("sc/e/153.png", 5 >> 1, 95 & 63, Class681.ak, (Color[])null, var3.getKey(), this);
         this.ayh[var5].y(var5);
         this.ayh[var5].setBounds(127 & 91, (124 & 75) + (58 & 109) * var5, 126 & 105, 124 & 31);
         this.ayh[var5].setForeground(Class681.c("#c523425"));
         this.add(this.ayh[var5++]);
      }

      int var7 = --4;
      this.bw = new RichLabel("", Class681.cf);
      this.bw.setBounds((9183 & 23788) + ((11774 & 21491) - this.bw.getWidth()) / (5 >> 1), 121 & 126, this.bw.getWidth(), this.bw.getHeight());
      this.add(this.bw);
      Class436[] var8 = new Class436[var7];
      var10003 = true;
      this.pv = var8;

      for(var10000 = var5 = 2 & 5; var10000 < this.pv.length; var10000 = var5) {
         this.pv[var5] = new Class436();
         Class75 var6;
         if (var5 == 0) {
            var6 = this;
            this.pv[var5].fw("sc/d/96.png");
            this.pv[var5].setBounds(16123 & 16847, 55 & 123, 31739 & 1527, 101 & 123);
         } else if (var5 == --1) {
            var6 = this;
            this.pv[var5].fw("sc/d/98.png");
            this.pv[var5].setBounds(25086 & 7887, 123, 492, 21);
         } else if (var5 == 5 >> 1) {
            var6 = this;
            this.pv[var5].fw("sc/d/97.png");
            this.pv[var5].setBounds(207, 55, 491, 89);
         } else {
            if (var5 == --3) {
               this.pv[var5].fw("sc/d/101.png");
               this.pv[var5].setBounds(202, 136, 499, 310);
            }

            var6 = this;
         }

         var6.add(this.pv[var5++]);
      }

   }

   public Class16 ani() {
      return this.ayf;
   }

   public void y(int var1) {
      int var10000 = 3 & 4;
      this.j = var1;

      for(int var2 = var10000; var10000 < this.ayh.length; var10000 = var2) {
         this.ayh[var2].setKeep((boolean)(var1 == var2 ? 3 & 5 : 0));
         ++var2;
      }

      ActivityMenuSet2 var3;
      if ((var3 = this.ayg.getMenuSet2s()[var1]).getId() != --1 && var3.getId() != --3 && var3.getId() != --4) {
         if (var3.getId() == (1 ^ 3)) {
            if (this.ayf == null) {
               this.add(this.ayf = new Class16(this), 5 >> 3);
            }

            this.ayf.cs(this.ayg, var3);
            this.ayf.setVisible((boolean)(3 >> 1));
            if (this.ayi != null) {
               this.ayi.setVisible((boolean)(2 & 5));
            }

            if (this.ayj != null) {
               this.ayj.setVisible((boolean)(5 >> 3));
               return;
            }
         } else if (var3.getId() == --5) {
            if (this.ayj == null) {
               this.add(this.ayj = new Class137(this), 2 & 5);
            }

            this.ayj.cs(this.ayg, var3);
            this.ayj.setVisible((boolean)(3 >> 1));
            if (this.ayi != null) {
               this.ayi.setVisible((boolean)(5 >> 3));
            }

            if (this.ayf != null) {
               this.ayf.setVisible((boolean)(3 ^ 3));
            }
         }
      } else {
         if (this.ayi == null) {
            this.add(this.ayi = new Class315(this), 3 ^ 3);
         }

         this.ayi.cs(this.ayg, var3);
         this.ayi.setVisible((boolean)(4 ^ 5));
         if (this.ayf != null) {
            this.ayf.setVisible((boolean)(5 >> 3));
         }

         if (this.ayj != null) {
            this.ayj.setVisible((boolean)(3 ^ 3));
            return;
         }
      }

   }

   public Class315 anj() {
      return this.ayi;
   }

   public void p() {
      this.aeg = (boolean)(3 & 5);
   }

   public int e() {
      return this.ayg.getId();
   }

   public Class137 ank() {
      return this.ayj;
   }

   public void s() {
      this.p();
   }

   public void paint(Graphics var1) {
      if (this.aeg) {
         this.y(this.j);
      }

      super.paint(var1);
   }

   public Activity kd() {
      return this.ayg;
   }

   public void d() {
      int var1 = (int)Math.max(0L, (this.ayg.getTimeEnd() - Class280.f()) / 60000L);
      StringBuffer var2 = new StringBuffer();
      var2.append("#Z#W活动时间：仅剩");
      if (var1 > (23979 & 10228)) {
         var2.append("#Y");
         var2.append(var1 / (32760 & 1447));
         var2.append("#W天");
         var1 %= 32697 & 1510;
      }

      if (var1 > (63 & 124)) {
         var2.append("#Y");
         var2.append(var1 / (124 & 63));
         var2.append("#W小时");
         var1 %= 60 & 127;
      }

      var2.append("#Y");
      var2.append(var1);
      var2.append("#W分钟");
      if (this.bw.isTextSize(var2.toString(), 19958 & 13307)) {
         this.bw.setBounds((11212 & 21759) + ((30707 & 2558) - this.bw.getWidth()) / (1 ^ 3), 121 & 126, this.bw.getWidth(), this.bw.getHeight());
      }

   }
}
