package com.xy.q;

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

public class Class49 {
   public static Font a;
   public static Font b;
   public static final Color c = new Color(1, 251, 249);
   public static int[] d = new int[]{4, 4, 1};
   public static Font e;
   public static Font f;
   public static final Color g = new Color(217, 7, 37);
   public static final Color h = new Color(214, 204, 177);
   public static final Color i = new Color(210, 222, 122);
   public static final Color j = new Color(187, 165, 75);
   public static Font k;
   public static int l = 3;
   public static final Color m = new Color(128, 0, 128, 64);
   public static Font n;
   public static final int o = 18;
   public static final Color p = new Color(228, 217, 189);
   public static final Color q = new Color(208, 39, 39);
   public static Color[] r = new Color[3];
   public static Font s;
   public static final Color t = new Color(243, 94, 1);
   public static final Color u = new Color(135, 180, 235);
   public static int[] v = new int[]{2, 2, 1};
   public static Font w;
   public static final Color x = new Color(0, 18, 31);
   public static Font y;
   public static final Color z = new Color(25, 25, 25);
   public static Font aa;
   public static Font ab;
   public static Font ac;
   public static Font ad;
   public static final Color ae = new Color(251, 217, 50);
   private static Map<String, Color> af = new HashMap<>();
   public static int[] ag = new int[]{-1, -1, -1};
   public static Font ah;
   public static Font ai;
   public static Color[] aj = new Color[3];
   public static Font ak;
   public static final Color al = new Color(255, 64, 64, 128);
   public static Font am;
   public static final Font an = new Font("微软雅体", 0, 20);
   public static Font ao;
   public static Color[] ap = new Color[3];
   public static Font aq;
   public static Font ar;
   public static Font as;
   public static final Color at = new Color(187, 165, 75);
   public static final Color au = new Color(137, 51, 158, 102);
   public static final Color av = new Color(251, 0, 1);
   public static Font aw;
   public static final Color ax = new Color(87, 250, 255);
   public static Color[] ay;
   public static final Color az = new Color(213, 210, 209);
   public static Font ba;
   public static Font bb;
   public static final Color bc = new Color(36, 219, 118);
   public static final Color bd = new Color(41, 191, 107);
   public static final Color be = new Color(219, 10, 205);
   public static Font bf;
   public static final Color bg = new Color(176, 180, 48);
   public static final BigDecimal bh = new BigDecimal(1000);
   public static final Color bi = new Color(127, 29, 166);
   public static Font bj;
   public static final Color bk = new Color(0, 0, 0, 0);
   public static Font bl;
   public static final Font bm = new Font("微软雅体", 0, 14);
   public static final Color bn = new Color(102, 102, 102);
   public static int[] bo = new int[]{2, 2, 0};
   public static Font bp;
   public static final Color bq = new Color(62, 223, 236);
   public static final Color br = new Color(239, 238, 12);
   public static final Color bs = new Color(214, 204, 177, 240);
   public static Font bt;
   public static Font bu;
   public static Color[] bv = new Color[3];
   public static final Color bw = new Color(255, 110, 0);
   public static Font bx;
   public static Font by;
   public static Font bz;
   public static final Color ca = new Color(0, 0, 0, 154);
   public static final Color cb = new Color(255, 255, 0);
   public static final Color cc = new Color(253, 68, 221);
   public static final Color cd = new Color(36, 31, 0);
   public static final Color ce = new Color(128, 128, 128, 128);
   public static final Color cf = new Color(255, 239, 229);
   public static final Color cg = bk;
   public static Font ch;
   public static final Color ci = new Color(102, 205, 0);
   public static final Color cj = new Color(255, 0, 0, 154);
   public static Font ck;
   public static Font cl;
   public static final Color cm = c("#cFF00FF");
   public static final Color cn = new Color(0, 239, 239);
   public static Font co;
   public static Font cp;

   public static void a(JTextField var0, long var1) {
      var0.setForeground(f(var1));
   }

   public static void b(JLabel var0, long var1) {
      var0.setForeground(f(var1));
      StringBuffer var3;
      (var3 = new StringBuffer()).append(var1);
      var1 = (var1 > 0L ? var3.length() - 1 : var3.length() - 2) / l;

      int var4;
      for (int var10000 = var4 = 1; var10000 <= var1; var10000 = var4) {
         int var10001 = var3.length() - l * var4 - var4;
         var4++;
         var3.insert(var10001 + 1, ",");
      }

      var0.setText(var3.toString());
   }

   public static Color c(String var0) {
      Color var1;
      if ((var1 = af.get(var0)) == null) {
         String var10002 = "l&";
         var1 = Color.decode("0x" + var0.substring(2));
         af.put(var0, var1);
      }

      return var1;
   }

   public static Color d(int var0) {
      if (var0 == 0) {
         return ci;
      } else if (var0 == 1) {
         return bw;
      } else if (var0 == 2) {
         return bq;
      } else if (var0 == 3) {
         return q;
      } else if (var0 == 4) {
         return bi;
      } else {
         return var0 == -1 ? Color.gray : Color.white;
      }
   }

   public static Font e(String var0) {
      try {
         File var1 = new File(var0);
         FileInputStream var2 = new FileInputStream(var1);
         return Font.createFont(0, var2);
      } catch (Exception var4) {
         var4.printStackTrace();
         String var10002 = "寗伍";
         return new Font("宋体", 0, 14);
      }
   }

   public static Color f(long var0) {
      if (var0 < 10000L) {
         return Color.white;
      } else if (var0 < 100000L) {
         return bc;
      } else if (var0 < 1000000L) {
         return cc;
      } else if (var0 < 10000000L) {
         return ae;
      } else if (var0 < 100000000L) {
         return cn;
      } else if (var0 < 1000000000L) {
         return Color.GREEN;
      } else {
         return var0 < 10000000000L ? Color.RED : cm;
      }
   }

   public static Font g(String var0, float var1) {
      try {
         File var2 = new File(var0);
         FileInputStream var3 = new FileInputStream(var2);
         Font var5 = Font.createFont(0, var3).deriveFont(var1);
         var3.close();
         return var5;
      } catch (Exception var6) {
         var6.printStackTrace();
         String var10002 = "寗伍";
         return new Font("宋体", 0, 14);
      }
   }

   public static Font h(int var0) {
      String var10000 = "hs\u0016\u0005\u0018n\u0019\u0016\u0013\u0003nr\n\b\u0018";
      return g("6/HYF2GJM_0.TTF", var0).deriveFont(1);
   }

   public static void i(Graphics var0, BigDecimal var1, int var2, int var3) {
      var0.setColor(f(var1.longValue()));
      var0.setFont(ac);
      if (var1.compareTo(bh) < 0) {
         var0.drawString(var1.toString(), var2, var3);
      } else {
         String var4 = var1.toString();

         StringBuffer var5;
         int var6;
         for (int var10000 = var6 = (var5 = new StringBuffer(var4)).length() - l; var10000 > 0; var10000 = var6) {
            var5.insert(var6, ',');
            var6 -= l;
         }

         var0.drawString(var5.toString(), var2, var3);
      }
   }

   public static Font j(int var0) {
      String var10000 = "hs\u0016\u0005\u001dm\u0019\u0016\u0013r\n\b\u0018";
      return g("6/HYC1GJM.TTF", var0).deriveFont(1);
   }

   public static String k(long var0) {
      if (var0 >= 1000000000L) {
         StringBuilder var2 = new StringBuilder(String.valueOf(var0 / 100000000L));
         String var3 = "仡";
         return var2.append("亿").toString();
      } else if (var0 >= 100000L) {
         StringBuilder var10000 = new StringBuilder(String.valueOf(var0 / 10000L));
         String var10001 = "乙";
         return var10000.append("万").toString();
      } else {
         return String.valueOf(var0);
      }
   }

   static {
      String var10002 = "忲輱隙伍";
      var10002 = "忲輱隙伍";
      var10002 = "椫伍";
      Font var0 = new Font("楷体", 0, 16);
      String var10000 = "/=s830(q4'+<r*(8";
      ai = var0.deriveFont(0, 14.0F);
      aq = var0.deriveFont(1, 14.0F);
      k = var0.deriveFont(0, 16.0F);
      ch = var0.deriveFont(1, 16.0F);
      s = var0.deriveFont(0, 17.0F);
      a = var0.deriveFont(1, 17.0F);
      ck = var0.deriveFont(0, 18.0F);
      bx = var0.deriveFont(1, 18.0F);
      by = var0.deriveFont(0, 19.0F);
      ak = var0.deriveFont(1, 19.0F);
      as = var0.deriveFont(1, 22.0F);
      ad = var0.deriveFont(0, 24.0F);
      bu = var0.deriveFont(1, 24.0F);
      bf = var0.deriveFont(1, 32.0F);
      bl = var0.deriveFont(0, 34.0F);
      var0 = e("sc/font/hywb.ttf");
      aa = var0.deriveFont(0, 16.0F);
      ao = var0.deriveFont(0, 18.0F);
      bj = var0.deriveFont(0, 19.0F);
      ar = var0.deriveFont(0, 20.0F);
      var10002 = "寗伍";
      var0 = new Font("宋体", 0, 16);
      var10000 = "/=s830(q4'r*(8";
      bp = var0.deriveFont(0, 10.0F);
      bz = var0.deriveFont(0, 12.0F);
      e = var0.deriveFont(1, 12.0F);
      n = var0.deriveFont(0, 13.0F);
      co = var0.deriveFont(1, 13.0F);
      ac = var0.deriveFont(0, 14.0F);
      y = var0.deriveFont(1, 14.0F);
      w = var0.deriveFont(0, 15.0F);
      cp = var0.deriveFont(0, 16.0F);
      ab = var0.deriveFont(1, 16.0F);
      aw = var0.deriveFont(0, 18.0F);
      cl = var0.deriveFont(0, 20.0F);
      f = var0.deriveFont(1, 20.0F);
      ba = var0.deriveFont(0, 24.0F);
      ah = var0.deriveFont(1, 24.0F);
      bb = var0.deriveFont(1, 32.0F);
      b = var0.deriveFont(1, 48.0F);
      var0 = e("sc/font/hy.ttf");
      var10000 = "/=s830(q4'$5r*(8";
      am = var0.deriveFont(0, 16.0F);
      var0 = e("sc/font/hyxk.ttf");
      bt = var0.deriveFont(0, 30.0F);
      ai = new Class0(ai);
      aq = new Class0(aq);
      k = new Class0(k);
      ch = new Class0(ch);
      s = new Class0(s);
      a = new Class0(a);
      ck = new Class0(ck);
      bx = new Class0(bx);
      by = new Class0(by);
      ak = new Class0(ak);
      as = new Class0(as);
      ad = new Class0(ad);
      bu = new Class0(bu);
      bf = new Class0(bf);
      bl = new Class0(bl);
      aa = new Class0(aa);
      ao = new Class0(ao);
      bj = new Class0(bj);
      ar = new Class0(ar);
      e = new Class0(e);
      bt = new Class0(bt);
      String var10001 = "<0??5";
      af.put("black", Color.black);
      var10002 = ">2);";
      af.put("blue", Color.blue);
      String var10003 = "?'=0";
      af.put("cyan", Color.cyan);
      String var10004 = "8?.5\u001b,='";
      af.put("darkGray", Color.darkGray);
      String var10005 = ";,='";
      af.put("gray", Color.gray);
      String var10006 = "9.;90";
      af.put("green", Color.green);
      String var10007 = "2594*\u001b,='";
      af.put("lightGray", Color.lightGray);
      String var10008 = "3=990(?";
      af.put("magenta", Color.magenta);
      String var10009 = "3,=0;;";
      af.put("orange", Color.orange);
      String var10010 = ",725";
      af.put("pink", Color.pink);
      String var10011 = ",9:";
      af.put("red", Color.red);
      String var10012 = ")47(;";
      af.put("white", Color.white);
      String var10013 = "%;023)";
      af.put("yellow", Color.yellow);
      var10013 = "\u007f=\u001a\u0018ln\u001a\u0018";
      boolean var14 = false;
      ap[0] = new Color(16, 24, 2);
      ap[2] = ap[1] = new Color(48, 88, 56);
      r[0] = r[2] = r[1] = new Color(255, 255, 255);
      aj[0] = new Color(187, 165, 75);
      aj[1] = aj[2] = new Color(219, 229, 107);

      int var5;
      for (int var8 = var5 = 0; var8 < bv.length; var8 = var5) {
         bv[var5++] = Color.black;
      }

      ay = new Color[3];
      var10006 = "\u007f=\u001d\u001ae\u0018il";
      ay[0] = ay[1] = ay[2] = c("#cAD9F52");
   }
}
