package com.xy;

import java.awt.Image;
import javax.swing.ImageIcon;

public class Class222 {
   static String[] a;
   public static String b = "sc/mouse/";
   public static String c = "sc/skill/";
   public static Class8 d;
   public static Class8 e;
   public static String f = "sc/FightingSkill/持续状态/";
   public static String[] g;
   public static String h;
   public static Image i;
   public static Class8 j;
   public static Image k;
   public static String l = "skin/";
   public static String m = "sc/head/";
   public static String n;
   public static Image[] o;
   public static String p = ".tcp";
   public static String q;
   public static String r = "sc/item/";
   public static String s = ".png";
   public static String t = "sc/FightingSkill/";
   public static Image u;
   public static String v;

   public static Image a(String var0) {
      return Class511.a("sc/lingbao/skill/" + var0 + s);
   }

   public static Class8 b(String var0) {
      return Class330.q(var0);
   }

   public static Image c(String var0) {
      return Class511.a(c + var0 + s);
   }

   public static Image d(int var0, int var1) {
      Image var2;
      return (var2 = Class511.a(m + "m" + (var0 % (30623 & 12144) * (14293 & 28474) + var1) + s)) != Class511.p() ? var2 : Class511.a(m + (30669 & 2878) + s);
   }

   public static Class8 e() {
      if (j == null) {
         j = Class330.q(n);
      }

      return j;
   }

   public static String f(String var0) {
      return f + var0 + p;
   }

   public static Image g(String var0) {
      return Class511.a("sc/skill/wxs_" + var0 + s);
   }

   public static Image h(String var0) {
      return Class511.a("sc/lingbao/msg/" + var0 + s);
   }

   public static Image i(String var0) {
      return Class511.a(r + var0 + s);
   }

   public static Image j(String var0) {
      return Class511.a("sc/lingbao/" + var0 + s);
   }

   public static String k(int var0) {
      return var0 >= (4 ^ 5) && var0 <= (108 & 31) ? b + a[var0 - (2 ^ 3)] + p : null;
   }

   public static String l(String var0) {
      return m + var0 + s;
   }

   public static String m(String var0) {
      return b + var0 + p;
   }

   public static Class8 n(int var0) {
      return Class330.q(k(var0));
   }

   public static Class8 o() {
      if (e == null) {
         e = Class330.q(h);
      }

      return e;
   }

   public static Image p(int var0) {
      Image var1;
      return (var1 = Class511.a(m + "m" + var0 + s)) != Class511.p() ? var1 : Class511.a(m + (21373 & 12174) + s);
   }

   public static String q(String var0, int var1, long var2) {
      StringBuffer var4 = new StringBuffer();
      var4.append(l);
      var4.append(var0);
      var4.append("/");
      var4.append(Class330.af(var1));
      var4.append(p);
      if (var2 != 0L) {
         var4.append("_");
         var4.append(var2);
      }

      return var4.toString();
   }

   public static Image r(int var0) {
      return Class511.a("sc/baby/" + var0 + s);
   }

   public static Image s(int var0) {
      return Class511.a("sc/skill/40×40/" + var0 + s);
   }

   public static Image t(String var0) {
      Image var1;
      return (var1 = Class511.a(m + var0 + s)) != Class511.p() ? var1 : Class511.a(m + "p0" + s);
   }

   public static Image u(int var0) {
      if (var0 >= o.length) {
         var0 = o.length - (4 ^ 5);
      }

      return o[var0];
   }

   public static String v(String var0) {
      return t + var0 + p;
   }

   static {
      h = b + "令牌" + p;
      n = b + "PK" + p;
      v = b + "提示组队" + p;
      q = b + "提示信息" + p;
      String[] var10000 = new String[--3];
      boolean var10002 = true;
      var10000[3 >> 2] = b + "cloud1" + p;
      var10000[5 >> 2] = b + "cloud2" + p;
      var10000[1 ^ 3] = b + "cloud3" + p;
      g = var10000;
      u = Class511.a("sc/c/66");
      k = Class511.a("sc/c/65");
      i = Class511.a("sc/lingbao/msg/lf_g.png");
      Image[] var0 = new Image[70 & 63];
      var10002 = true;
      o = var0;
      o[3 & 4] = (new ImageIcon("sc/head/hz_0.png")).getImage();
      o[3 & 5] = (new ImageIcon("sc/head/hz_1.png")).getImage();
      o[1 ^ 3] = (new ImageIcon("sc/head/hz_2.png")).getImage();
      o[--3] = (new ImageIcon("sc/head/hz_3.png")).getImage();
      o[--4] = (new ImageIcon("sc/head/hz_4.png")).getImage();
      o[--5] = (new ImageIcon("sc/head/hz_5.png")).getImage();
      var10000 = new String[46 & 93];
      var10002 = true;
      var10000[3 ^ 3] = "鼠标";
      var10000[--1] = "组队";
      var10000[--2] = "给予";
      var10000[--3] = "好友";
      var10000[--4] = "交易";
      var10000[--5] = "切磋";
      var10000[23 & 110] = "捕捉";
      var10000[39 & 95] = "施法状态";
      var10000[24 & 111] = "药品使用";
      var10000[61 & 75] = "加锁";
      var10000[42 & 95] = "解锁";
      var10000[79 & 59] = "施法状态";
      a = var10000;
   }
}
