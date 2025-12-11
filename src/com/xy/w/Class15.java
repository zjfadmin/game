package com.xy.w;

import java.awt.Image;
import javax.swing.ImageIcon;

public class Class15 {
   public static Image a = Class16.c("sc/c/65");
   public static String b;
   public static Image c = Class16.c("sc/lingbao/msg/lf_g.png");
   public static Image[] d = new Image[6];
   public static Class1 e;
   public static String f = "sc/skill/";
   public static String g = ".tcp";
   public static String h = "sc/head/";
   public static String i;
   public static String[] j;
   public static String k;
   public static String l = "sc/FightingSkill/";
   public static Class1 m;
   public static Class1 n;
   public static String o = ".png";
   public static String p = "sc/FightingSkill/持续状态/";
   public static String q;
   public static String r = "sc/mouse/";
   public static Image s = Class16.c("sc/c/66");
   public static String t = "skin/";
   public static String u = "sc/item/";
   static String[] v;

   public static String a(String var0) {
      return p + var0 + g;
   }

   public static Image b(String var0) {
      String var10002 = "[C\u0007LANOBIO\u0007";
      return Class16.c("sc/lingbao/" + var0 + o);
   }

   public static String c(String var0, int var1, long var2) {
      StringBuffer var4 = new StringBuffer();
      var4.append(t);
      var4.append(var0);
      String var10004 = "\\";
      var4.append("/");
      var4.append(Class11.g(var1));
      var4.append(g);
      if (var2 != 0L) {
         var4.append("_");
         var4.append(var2);
      }

      return var4.toString();
   }

   public static Image d(String var0) {
      return Class16.c(u + var0 + o);
   }

   public static Image e(String var0) {
      Image var1;
      if ((var1 = Class16.c(h + var0 + o)) != Class16.i()) {
         return var1;
      } else {
         StringBuilder var10000 = new StringBuilder(String.valueOf(h));
         String var10001 = "P\u0018";
         return Class16.c(var10000.append("p0").append(o).toString());
      }
   }

   public static Class1 f(String var0) {
      return Class11.x(var0);
   }

   public static Image g(String var0) {
      return Class16.c(f + var0 + o);
   }

   public static Image h(String var0) {
      String var10002 = "\u00006\\&\u0018<\u001f9\\\"\u000b&,";
      return Class16.c("sc/skill/wxs_" + var0 + o);
   }

   public static Image i(int var0) {
      String var10002 = "[C\u0007SCIDL\u0007\u0014\u0018÷\u001c\u0010\u0007";
      return Class16.c("sc/skill/40×40/" + var0 + o);
   }

   public static Image j(String var0) {
      String var10002 = "\u00006\\9\u001a;\u00147\u0012:\\8\u00002\\";
      return Class16.c("sc/lingbao/msg/" + var0 + o);
   }

   public static Class1 k() {
      if (m == null) {
         m = Class11.x(b);
      }

      return m;
   }

   public static String l(String var0) {
      return h + var0 + o;
   }

   public static Class1 m(int var0) {
      return Class11.x(u(var0));
   }

   public static Image n(int var0) {
      if (var0 >= d.length) {
         var0 = d.length - 1;
      }

      return d[var0];
   }

   public static Image o(String var0) {
      String var10002 = "[C\u0007LANOBIO\u0007SCIDL\u0007";
      return Class16.c("sc/lingbao/skill/" + var0 + o);
   }

   public static String p(String var0) {
      return r + var0 + g;
   }

   public static Class1 q() {
      if (e == null) {
         e = Class11.x(i);
      }

      return e;
   }

   public static Image r(int var0, int var1) {
      StringBuilder var10000 = new StringBuilder(String.valueOf(h));
      String var10001 = "E";
      Image var2;
      return (var2 = Class16.c(var10000.append("m").append(var0 % 10000 * 10000 + var1).append(o).toString())) != Class16.i() ? var2 : Class16.c(h + 780 + o);
   }

   public static Image s(int var0) {
      StringBuilder var10000 = new StringBuilder(String.valueOf(h));
      String var10001 = "\u001e";
      Image var1;
      return (var1 = Class16.c(var10000.append("m").append(var0).append(o).toString())) != Class16.i() ? var1 : Class16.c(h + 780 + o);
   }

   public static String t(String var0) {
      return l + var0 + g;
   }

   public static String u(int var0) {
      return var0 >= 1 && var0 <= 12 ? r + v[var0 - 1] + g : null;
   }

   static {
      StringBuilder var10000 = new StringBuilder(String.valueOf(r));
      String var10001 = "亱爿";
      b = var10000.append("令牌").append(Class15.g).toString();
      var10000 = new StringBuilder(String.valueOf(r));
      var10001 = "pc";
      i = var10000.append("PK").append(g).toString();
      var10000 = new StringBuilder(String.valueOf(r));
      var10001 = "掅祉纑陬";
      q = var10000.append("提示组队").append(g).toString();
      var10000 = new StringBuilder(String.valueOf(r));
      var10001 = "揰礒俁恇";
      k = var10000.append("提示信息").append(g).toString();
      String[] var3 = new String[3];
      boolean var10005 = false;
      StringBuilder var10003 = new StringBuilder(String.valueOf(r));
      String var10004 = "6\u001f:\u00061B";
      var3[0] = var10003.append("cloud1").append(g).toString();
      var10003 = new StringBuilder(String.valueOf(r));
      var10004 = "CDO]D\u001a";
      var3[1] = var10003.append("cloud2").append(g).toString();
      var10003 = new StringBuilder(String.valueOf(r));
      var10004 = "6\u001f:\u00061@";
      var3[2] = var10003.append("cloud3").append(g).toString();
      j = var3;
      String var4 = "[C\u0007C\u0007\u0016\u001e";
      String var5 = "\u00006\\6\\cF";
      String var6 = "[C\u0007LANOBIO\u0007M[G\u0007LN\u007fO\u000eXNO";
      var10004 = "&\u0010z\u001b0\u00121\\=\t\nC{\u0003;\u0014";
      d[0] = new ImageIcon("sc/head/hz_0.png").getImage();
      var10004 = "SK\u000f@EID\u0007HR\u007f\u0019\u000eXNO";
      d[1] = new ImageIcon("sc/head/hz_1.png").getImage();
      var10004 = "&\u0010z\u001b0\u00121\\=\t\nA{\u0003;\u0014";
      d[2] = new ImageIcon("sc/head/hz_2.png").getImage();
      var10004 = "SK\u000f@EID\u0007HR\u007f\u001b\u000eXNO";
      d[3] = new ImageIcon("sc/head/hz_3.png").getImage();
      var10004 = "&\u0010z\u001b0\u00121\\=\t\nG{\u0003;\u0014";
      d[4] = new ImageIcon("sc/head/hz_4.png").getImage();
      var10004 = "SK\u000f@EID\u0007HR\u007f\u001d\u000eXNO";
      d[5] = new ImageIcon("sc/head/hz_5.png").getImage();
      String[] var7 = new String[12];
      String var13 = "齵桴";
      var7[0] = "鼠标";
      String var14 = "绤阷";
      var7[1] = "组队";
      String var15 = "續任";
      var7[2] = "给予";
      String var16 = "奝口";
      var7[3] = "好友";
      String var17 = "仱晠";
      var7[4] = "交易";
      String var18 = "刧磣";
      var7[5] = "切磋";
      String var19 = "挀挺";
      var7[6] = "捕捉";
      String var20 = "斝泽犖怩";
      var7[7] = "施法状态";
      String var21 = "茺咲伪畛";
      var7[8] = "药品使用";
      String var22 = "劀锩";
      var7[9] = "加锁";
      String var23 = "覶镲";
      var7[10] = "解锁";
      String var24 = "斝泽犖怩";
      var7[11] = "施法状态";
      v = var7;
   }

   public static Image v(int var0) {
      String var10002 = "&\u0010z\u00114\u0011,\\";
      return Class16.c("sc/baby/" + var0 + o);
   }
}
