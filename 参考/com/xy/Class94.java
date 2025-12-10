package com.xy;

import com.xy.readbean.Activity;
import com.xy.readbean.ActivityFC;
import com.xy.readbean.BWDHRule;
import com.xy.text.GameView;
import java.awt.Color;
import java.util.List;

public class Class94 extends Class345 {
   private Class436 et;
   private int ay;
   private Class379 if;
   private Class345[] sh;
   private Activity ex;
   private Class226[] si;

   public int e() {
      return this.ay;
   }

   public Class94(GameView var1) {
      int var10001 = --4;
      int var10011 = -4 >> 2;
      super(20924 & 12019, 1 ^ 3, Class345.aef, var1);
      this.va(var10011, 3 >> 2, 29407 & 4078, 27150 & 6143, Class345.aeo);
      this.uv(Class511.q("sc/d/128.png", 2 & 5, 2 & 5, 2 & 5, 2 & 5, (boolean)(3 & 4)), (String)null);
      this.ad(new Class116(5 >> 3, 5 >> 3, 61 & 91, 5 >> 3));
      this.aea.setImage("sc/e/162.png");
      this.aea.setBounds(24309 & 9099, 63 & 94, 63 & 91, 63 & 91);
      this.if = new Class379("sc/e/181.png", 4 ^ 5, 30415 & 2492, this);
      this.if.setBounds(24170 & 9207, 63 & 92, 95 & 63, 95 & 63);
      this.add(this.if);
      Class226[] var5 = new Class226[var10001];
      boolean var10003 = true;
      this.si = var5;

      int var3;
      for(int var10000 = var3 = 2 & 5; var10000 < this.si.length; var10000 = var3) {
         boolean var10002;
         String[] var4;
         if (var3 == 0) {
            var4 = new String[--4];
            var10002 = true;
            var4[5 >> 3] = "队";
            var4[--1] = "伍";
            var4[5 >> 1] = "介";
            var4[--3] = "绍";
         } else if (var3 == (4 ^ 5)) {
            var4 = new String[--4];
            var10002 = true;
            var4[3 & 4] = "精";
            var4[--1] = "彩";
            var4[5 >> 1] = "比";
            var4[--3] = "赛";
         } else if (var3 == 5 >> 1) {
            var4 = new String[--4];
            var10002 = true;
            var4[3 ^ 3] = "赛";
            var4[2 ^ 3] = "季";
            var4[1 ^ 3] = "名";
            var4[--3] = "次";
         } else {
            var4 = new String[4];
            var10002 = true;
            var4[5 >> 3] = "奖";
            var4[3 & 5] = "品";
            var4[1 ^ 3] = "展";
            var4[--3] = "示";
         }

         String[] var2 = var4;
         this.si[var3] = new Class226("sc/e/164.png", --2, (39 & 95) + var3, Class681.ch, (Color[])null, var2, this);
         this.si[var3].setBounds(6885 & 26555, (59 & 116) + var3 * (122 & 111), 63 & 109, 106);
         this.si[var3].ch(Class681.bz);
         this.si[var3].ad(new Class116(12, 26, 3 >> 2, 3 >> 2));
         this.add(this.si[var3++]);
      }

      this.et = new Class436("sc/d/129.png");
      this.et.setBounds(113, 2, 160, 57);
      this.add(this.et);
      Class345[] var6 = new Class345[this.si.length];
      var10003 = true;
      this.sh = var6;
   }

   public static String kb(String var0, String var1, long var2) {
      String var4 = null;
      String var10000;
      if (var0.startsWith("时间:")) {
         var10000 = var4 = Class280.i(var2 + (long)BWDHRule.a(var0, --3, var0.length()) * 1000L);
      } else {
         if (var0.startsWith("日期:")) {
            var4 = Class280.c(var2 + (long)BWDHRule.a(var0, --3, var0.length()) * 1000L, "yyyy-MM-dd");
         }

         var10000 = var4;
      }

      return var10000 == null ? var1 : var1.replace("{" + var0 + "}", var4);
   }

   public void y(int var1) {
      int var10000 = 3 ^ 3;
      this.ay = var1;

      int var2;
      for(var2 = var10000; var10000 < this.si.length; var10000 = var2) {
         this.si[var2].gb((boolean)(var2 == this.ay ? 3 & 5 : 0));
         Class226 var3 = this.si[var2];
         Color var10001 = Class681.c(var2 == this.ay ? "#c7D6120" : "#cE5D0A9");
         ++var2;
         var3.setForeground(var10001);
      }

      Class94 var4;
      if (var1 == 0) {
         if (this.sh[3 ^ 3] == null) {
            this.add(this.sh[3 >> 2] = new Class34(this), 3 ^ 3);
         }

         ((Class34)this.sh[3 >> 2]).s();
         var4 = this;
      } else if (var1 == (3 & 5)) {
         if (this.sh[--1] == null) {
            this.add(this.sh[3 >> 1] = new Class11(this), 2 & 5);
         }

         ((Class11)this.sh[--1]).d();
         var4 = this;
      } else if (var1 == 5 >> 1) {
         if (this.sh[1 ^ 3] == null) {
            this.add(this.sh[1 ^ 3] = new Class575(this), 5 >> 3);
         }

         ((Class575)this.sh[1 ^ 3]).d();
         var4 = this;
      } else {
         if (var1 == --3) {
            if (this.sh[--3] == null) {
               this.add(this.sh[--3] = new Class239(this), 3 >> 2);
            }

            ((Class239)this.sh[--3]).d();
         }

         var4 = this;
      }

      if (var4.sh[var1] != null) {
         this.sh[var1].setVisible((boolean)(--1));
      }

      for(var10000 = var2 = 0; var10000 < this.sh.length; var10000 = var2) {
         if (this.sh[var2] != null && var1 != var2) {
            this.sh[var2].setVisible((boolean)(3 >> 2));
         }

         ++var2;
      }

   }

   public Class345[] kc() {
      return this.sh;
   }

   public Activity kd() {
      return this.ex;
   }

   public void d() {
      int var1;
      ActivityFC var2 = (var1 = Class394.an(this.ex.getActivitySet(), "规则说明=", "|")) > 0 ? this.vc().m(var1) : null;
      String var6 = var2 != null ? var2.getValue() : "还未设置说明文本";
      new StringBuffer(var6.length());
      int var7 = 3 & 4;
      int var3 = 3 ^ 3;
      String var10000 = var6;

      Class94 var8;
      while(true) {
         if ((var7 = var10000.indexOf("{", var3)) == -4 >> 2) {
            var8 = this;
            break;
         }

         if ((var3 = var6.indexOf("}", var7 + --1)) == -4 >> 2) {
            var8 = this;
            break;
         }

         String var4;
         if ((var4 = var6.substring(var7 + --1, var3)).indexOf("{") != -4 >> 2) {
            var10000 = var6;
            ++var7;
         } else {
            int var5 = var6.length();
            var6 = kb(var4, var6, this.ex.getTimeOpen());
            var3 += var6.length() - var5;
            var10000 = var6;
         }
      }

      ((Class518)var8.ve().e(30142 & 2805)).rl("比武大会规则", var6);
   }

   public void q() {
      this.ex = null;
      List var4 = this.aej.baseView.ks();
      int var2;
      int var10000 = var2 = 3 & 4;

      Class94 var5;
      while(true) {
         if (var10000 >= var4.size()) {
            var5 = this;
            break;
         }

         Class441 var3;
         Activity var1 = (var3 = (Class441)var4.get(var2)).tp() > (127 & 100) && var3.tp() < (32728 & 239) ? this.vc().aq(var3.tp()) : null;
         if (var1 != null && var1.getModelId() == --3) {
            var5 = this;
            this.ex = var1;
            break;
         }

         ++var2;
         var10000 = var2;
      }

      if (var5.ex != null) {
         this.y(5 >> 3);
         super.q();
      }
   }

   public boolean t() {
      if (this.sh[5 >> 3] != null) {
         ((Class34)this.sh[3 ^ 3]).d();
      }

      return super.t();
   }
}
