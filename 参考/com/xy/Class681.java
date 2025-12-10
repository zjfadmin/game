package com.xy;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.io.File;
import java.io.FileInputStream;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Class681 {
   public static Font a;
   public static Font b;
   public static Color[] c;
   public static int d = --3;
   public static final Color e;
   public static Color[] f;
   public static final Color g;
   public static Font h;
   public static final BigDecimal i;
   public static final Color j;
   public static final Color k;
   public static final Color l;
   public static Font m;
   public static final Color n;
   public static Color[] o;
   public static final Color p;
   public static Font q;
   public static Font r;
   public static final Color s;
   public static Font t;
   public static final Color u;
   public static Font v;
   public static final Color w;
   public static final Color x;
   public static Font y;
   public static final Color z;
   public static final Color aa;
   public static Font ab;
   public static Font ac;
   public static final Font ad = new Font("微软雅体", 3 >> 2, 63 & 78);
   public static Font ae;
   public static Color[] af;
   public static final Color ag;
   public static final Color ah;
   public static final Color ai;
   public static final Color aj;
   public static Font ak;
   public static Font al;
   public static int[] am;
   public static Color[] an;
   public static Font ao;
   public static final Color ap;
   private static Map<String, Color> aq;
   public static Font ar;
   public static Font as;
   public static final Font at = new Font("微软雅体", 2 & 5, 126 & 21);
   public static final Color au;
   public static Font av;
   public static Font aw;
   public static Font ax;
   public static Color[] ay;
   public static final Color az;
   public static Font ba;
   public static Color[] bb;
   public static final Color bc;
   public static Font bd;
   public static Font be;
   public static final Color bf;
   public static final int bg = 18;
   public static Font bh;
   public static Font bi;
   public static final Color bj;
   public static final Color bk;
   public static final Color bl;
   public static Font bm;
   public static final Color bn;
   public static Font bo;
   public static final Color bp;
   public static Font bq;
   public static Font br;
   public static final Color bs;
   public static final Color bt;
   public static Font bu;
   public static int[] bv;
   public static final Color bw;
   public static Font bx;
   public static final Color by;
   public static int[] bz;
   public static Font ca;
   public static final Color cb;
   public static final Color cc;
   public static Font cd;
   public static Font ce;
   public static Font cf;
   public static Font cg;
   public static Font ch;
   public static Color[] ci;
   public static final Color cj;
   public static final Color ck;
   public static int[] cl;
   public static Font cm;
   public static Font cn;
   public static final Color co;
   public static final Color cp;
   public static Font cq;
   public static Font cr;
   public static final Color cs;
   public static Font ct;
   public static final Color cu;
   public static final Color cv;
   public static Font cw;
   public static final Color cx;

   public static Font a(int var0) {
      return e("6/HYF2GJM_0.TTF", (float)var0).deriveFont(--1);
   }

   public static Font b(String var0) {
      try {
         File var1 = new File(var0);
         FileInputStream var2 = new FileInputStream(var1);
         Font var4 = Font.createFont(3 >> 2, var2);
         return var4;
      } catch (Exception var3) {
         var3.printStackTrace();
         return new Font("宋体", 2 & 5, 111 & 30);
      }
   }

   public static Color c(String var0) {
      Color var1;
      if ((var1 = (Color)aq.get(var0)) == null) {
         var1 = Color.decode("0x" + var0.substring(--2));
         aq.put(var0, var1);
      }

      return var1;
   }

   public static Font d(int var0) {
      return e("6/HYC1GJM.TTF", (float)var0).deriveFont(5 >> 2);
   }

   public static Font e(String var0, float var1) {
      try {
         File var2 = new File(var0);
         FileInputStream var3 = new FileInputStream(var2);
         Font var5 = Font.createFont(2 & 5, var3).deriveFont(var1);
         var3.close();
         return var5;
      } catch (Exception var4) {
         var4.printStackTrace();
         return new Font("宋体", 3 ^ 3, 110 & 31);
      }
   }

   static {
      Font var0 = new Font("楷体", 3 >> 2, 49 & 94);
      int var10002 = 3 ^ 3;
      int var10004 = 4 ^ 5;
      int var10006 = 4 ^ 5;
      int var10008 = 3 ^ 3;
      int var10010 = 3 ^ 3;
      int var10012 = 3 & 5;
      int var10014 = 3 & 5;
      int var10016 = 3 ^ 3;
      int var10018 = 5 >> 2;
      int var10020 = 5 >> 3;
      int var10022 = 2 ^ 3;
      int var10024 = 2 & 5;
      int var10026 = 2 ^ 3;
      int var10028 = 3 ^ 3;
      int var10030 = 5 >> 2;
      cn = var0.deriveFont(2 & 5, 14.0F);
      bi = var0.deriveFont(var10030, 14.0F);
      bu = var0.deriveFont(var10028, 16.0F);
      ak = var0.deriveFont(var10026, 16.0F);
      v = var0.deriveFont(var10024, 17.0F);
      bq = var0.deriveFont(var10022, 17.0F);
      cw = var0.deriveFont(var10020, 18.0F);
      cf = var0.deriveFont(var10018, 18.0F);
      cg = var0.deriveFont(var10016, 19.0F);
      bd = var0.deriveFont(var10014, 19.0F);
      ao = var0.deriveFont(var10012, 22.0F);
      b = var0.deriveFont(var10010, 21.0F);
      av = var0.deriveFont(var10008, 24.0F);
      h = var0.deriveFont(var10006, 24.0F);
      as = var0.deriveFont(var10004, 32.0F);
      ac = var0.deriveFont(var10002, 34.0F);
      var0 = b("sc/font/hywb.ttf");
      int var10001 = 3 ^ 3;
      int var10003 = 5 >> 3;
      int var10005 = 5 >> 3;
      int var10007 = 5 >> 3;
      int var10009 = 5 >> 3;
      be = var0.deriveFont(3 ^ 3, 16.0F);
      bh = var0.deriveFont(var10009, 17.0F);
      cm = var0.deriveFont(var10007, 18.0F);
      m = var0.deriveFont(var10005, 19.0F);
      ch = var0.deriveFont(var10003, 20.0F);
      br = var0.deriveFont(var10001, 42.0F);
      var0 = new Font("宋体", 0, 16 & 127);
      r = var0.deriveFont(0, 10.0F);
      bm = var0.deriveFont(0, 12.0F);
      bo = var0.deriveFont(1, 12.0F);
      ab = var0.deriveFont(0, 13.0F);
      al = var0.deriveFont(1, 13.0F);
      ce = var0.deriveFont(0, 14.0F);
      ca = var0.deriveFont(1, 14.0F);
      q = var0.deriveFont(0, 15.0F);
      ax = var0.deriveFont(1, 15.0F);
      bx = var0.deriveFont(0, 16.0F);
      cd = var0.deriveFont(1, 16.0F);
      y = var0.deriveFont(0, 18.0F);
      aw = var0.deriveFont(0, 20.0F);
      cq = var0.deriveFont(1, 20.0F);
      t = var0.deriveFont(0, 24.0F);
      ar = var0.deriveFont(1, 24.0F);
      a = var0.deriveFont(1, 32.0F);
      cr = var0.deriveFont(1, 48.0F);
      var0 = b("sc/font/hy.ttf");
      ba = var0.deriveFont(0, 16.0F);
      var0 = b("sc/font/hyxk.ttf");
      int var10000 = --3;
      ae = var0.deriveFont(0, 30.0F);
      ct = var0.deriveFont(0, 20.0F);
      cn = new Class191(cn);
      bi = new Class191(bi);
      bu = new Class191(bu);
      ak = new Class191(ak);
      v = new Class191(v);
      bq = new Class191(bq);
      cw = new Class191(cw);
      cf = new Class191(cf);
      cg = new Class191(cg);
      bd = new Class191(bd);
      ao = new Class191(ao);
      b = new Class191(b);
      av = new Class191(av);
      h = new Class191(h);
      as = new Class191(as);
      ac = new Class191(ac);
      be = new Class191(be);
      bh = new Class191(bh);
      cm = new Class191(cm);
      m = new Class191(m);
      ch = new Class191(ch);
      br = new Class191(br);
      bo = new Class191(bo);
      ae = new Class191(ae);
      ct = new Class191(ct);
      cu = new Color(0, 0, 0, 0);
      cc = new Color(24575 & 8447, 74 & 117, 74 & 117, 7926 & 24969);
      cb = new Color(0, 0, 0, 30619 & 2302);
      cv = new Color(30975 & 2047, 0, 0, 4506 & 28415);
      n = new Color(22270 & 10625, 0, 22270 & 10625, 120 & 71);
      l = new Color(23254 & 9641, 23254 & 9641, 23254 & 9641, 23254 & 9641);
      by = new Color(110 & 119, 31181 & 1791, 0);
      z = new Color(13567 & 19455, 110, 0);
      ck = new Color(62, 223, 236);
      az = new Color(208, 39, 39);
      bt = new Color(127, 29, 166);
      au = new Color(25, 25, 25);
      bw = new Color(217, 7, 37);
      aa = new Color(0, 18, 31);
      bp = new Color(135, 180, 235);
      cp = new Color(255, 255, 0);
      bs = cu;
      bk = new Color(137, 51, 158, 102);
      u = new Color(214, 204, 177, 240);
      j = new Color(214, 204, 177);
      cs = new Color(255, 239, 229);
      ai = new Color(228, 217, 189);
      s = new Color(41, 191, 107);
      bf = new Color(1, 251, 249);
      bn = new Color(239, 238, 12);
      ah = new Color(219, 10, 205);
      e = new Color(243, 94, 1);
      x = new Color(251, 0, 1);
      bl = new Color(187, 165, 75);
      bc = new Color(176, 180, 48);
      co = new Color(102, 102, 102);
      bj = new Color(213, 210, 209);
      ag = new Color(187, 165, 75);
      w = new Color(210, 222, 122);
      ap = new Color(87, 250, 255);
      g = new Color(36, 31, 0);
      int[] var2 = new int[var10000];
      boolean var4 = true;
      var2[0] = -4 >> 2;
      var2[1] = -4 >> 2;
      var2[5 >> 1] = -4 >> 2;
      am = var2;
      var2 = new int[--3];
      var4 = true;
      var2[0] = 5 >> 1;
      var2[1] = 1 ^ 3;
      cl = var2;
      var2 = new int[--3];
      var4 = true;
      var2[0] = --2;
      var2[1] = 5 >> 1;
      var2[1 ^ 3] = 1;
      bz = var2;
      var2 = new int[--3];
      var4 = true;
      var2[0] = --4;
      var2[1] = --4;
      var2[2] = 1;
      bv = var2;
      aq = new HashMap();
      aq.put("black", Color.black);
      aq.put("blue", Color.blue);
      aq.put("cyan", Color.cyan);
      aq.put("darkGray", Color.darkGray);
      aq.put("gray", Color.gray);
      aq.put("green", Color.green);
      aq.put("lightGray", Color.lightGray);
      aq.put("magenta", Color.magenta);
      aq.put("orange", Color.orange);
      aq.put("pink", Color.pink);
      aq.put("red", Color.red);
      aq.put("white", Color.white);
      aq.put("yellow", Color.yellow);
      aj = new Color(36, 219, 118);
      cj = new Color(253, 68, 221);
      p = new Color(251, 217, 50);
      k = new Color(0, 239, 239);
      cx = c("#cFF00FF");
      i = new BigDecimal(1000);
      Color[] var3 = new Color[3];
      var4 = true;
      f = var3;
      boolean var5 = false;
      f[0] = new Color(16, 24, 2);
      f[2] = f[1] = new Color(48, 88, 56);
      var3 = new Color[3];
      var4 = true;
      an = var3;
      an[0] = an[2] = an[1] = new Color(255, 255, 255);
      var3 = new Color[3];
      var4 = true;
      ay = var3;
      ay[0] = new Color(187, 165, 75);
      ay[1] = ay[2] = new Color(219, 229, 107);
      var3 = new Color[3];
      var4 = true;
      c = var3;

      int var1;
      for(var10000 = var1 = 0; var10000 < c.length; var10000 = var1) {
         c[var1++] = Color.black;
      }

      var3 = new Color[3];
      var4 = true;
      o = var3;
      o[0] = o[1] = o[2] = c("#cAD9F52");
      var3 = new Color[3];
      var4 = true;
      bb = var3;
      bb[0] = c("#c605331");
      bb[1] = c("#c643E0F");
      bb[2] = c("#c643E0F");
      var3 = new Color[3];
      var4 = true;
      ci = var3;
      ci[0] = c("#c899D96");
      ci[1] = c("#c2E4A50");
      ci[2] = c("#c2E4A50");
      var3 = new Color[3];
      var4 = true;
      af = var3;
      af[0] = c("#cC8D0CC");
      af[1] = c("#c2F4B51");
      af[2] = c("#c2F4B51");
   }

   public static void f(JTextField var0, long var1) {
      var0.setForeground(g(var1));
   }

   public static Color g(long var0) {
      if (var0 < 10000L) {
         return Color.white;
      } else if (var0 < 100000L) {
         return aj;
      } else if (var0 < 1000000L) {
         return cj;
      } else if (var0 < 10000000L) {
         return p;
      } else if (var0 < 100000000L) {
         return k;
      } else if (var0 < 1000000000L) {
         return Color.GREEN;
      } else {
         return var0 < 10000000000L ? Color.RED : cx;
      }
   }

   public static String h(long var0) {
      if (var0 >= 1000000000L) {
         return var0 / 100000000L + "亿";
      } else {
         return var0 >= 100000L ? var0 / 10000L + "万" : String.valueOf(var0);
      }
   }

   public static Color i(int var0) {
      if (var0 == 0) {
         return by;
      } else if (var0 == --1) {
         return z;
      } else if (var0 == (1 ^ 3)) {
         return ck;
      } else if (var0 == --3) {
         return az;
      } else if (var0 == --4) {
         return bt;
      } else {
         return var0 == -4 >> 2 ? Color.gray : Color.white;
      }
   }

   public static void j(JLabel var0, long var1) {
      var0.setForeground(g(var1));
      StringBuffer var3;
      (var3 = new StringBuffer()).append(var1);
      var1 = (long)((var1 > 0L ? var3.length() - (5 >> 2) : var3.length() - (1 ^ 3)) / d);

      int var4;
      for(int var10000 = var4 = --1; (long)var10000 <= var1; var10000 = var4) {
         int var10001 = var3.length() - d * var4 - var4;
         int var10002 = 5 >> 2;
         ++var4;
         var3.insert(var10001 + var10002, ",");
      }

      var0.setText(var3.toString());
   }

   public static void k(Graphics var0, BigDecimal var1, int var2, int var3) {
      var0.setColor(g(var1.longValue()));
      var0.setFont(ce);
      if (var1.compareTo(i) < 0) {
         var0.drawString(var1.toString(), var2, var3);
      } else {
         String var4 = var1.toString();

         int var5;
         StringBuffer var6;
         for(int var10000 = var5 = (var6 = new StringBuffer(var4)).length() - d; var10000 > 0; var10000 = var5) {
            var6.insert(var5, (char)('?' & 'l'));
            var5 -= d;
         }

         var0.drawString(var6.toString(), var2, var3);
      }
   }
}
