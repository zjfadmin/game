package com.xy.a.i;

import com.xy.bean.LoginResult;
import com.xy.bean.SuitOperBean;
import com.xy.entity.PartJade;
import com.xy.game.RoleData;
import com.xy.q.Class49;
import com.xy.q.Class52;
import com.xy.readbean.MoneyType;
import com.xy.readbean.StarSoul;
import com.xy.richtext.RichLabel;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import java.awt.Color;
import java.awt.Graphics;
import java.math.BigDecimal;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Class3 extends com.xy.q.Class30 {
   private com.xy.q.Class14[] dx;
   private JLabel[] dy;
   private MoneyType dz;
   private com.xy.q.Class36 ea;
   private com.xy.q.Class27 eb;
   private com.xy.i.Class11 ec;
   private RichLabel ed;
   private BigDecimal ee;
   private int cb;
   private com.xy.w.Class18[] ar;
   private MoneyType ef;
   private int eg;
   private Class52[] eh;

   public void ds(long var1, JTextField var3) {
      Class49.b(this.dx[1], var1 * this.eg);
      Class49.b(this.dx[2], var1 * this.ee.longValue());
   }

   public Long dt(long var1, JTextField var3) {
      if (var1 == 0L) {
         return null;
      } else if (var1 < 0L) {
         return 0L;
      } else {
         RoleData var4 = this.yx();
         long var5;
         if ((var5 = (8000L - var4.getPackRecord().getStarSoulType(this.cb) % 10000L) / this.eg) * this.ee.longValue()
            > var4.getLoginResult().getGold().longValue()) {
            var5 = var4.getLoginResult().getGold().longValue() / this.ee.longValue();
         }

         LoginResult var10001 = var4.getLoginResult();
         String var10002 = "鬀倔";
         if (var5 > var10001.getScoretype("魂值").longValue()) {
            LoginResult var10000 = var4.getLoginResult();
            String var7 = "魌健";
            var5 = var10000.getScoretype("魂值").longValue();
         }

         return var1 > var5 ? var5 : null;
      }
   }

   public void g(int var1) {
      int var10000 = this.cb = var1;
      this.ar[0].gt(Class19.at);
      StarSoul var2 = var10000 != 0 ? this.yt().p(var1) : null;
      if (var2 != null) {
         StringBuffer var3;
         StringBuffer var6 = var3 = new StringBuffer();
         String var10001 = "21z4bg";
         var6.append("<html>");
         int var4 = 0;

         for (int var7 = var4; var7 < var2.getName().length(); var7 = var4) {
            if (var4 != 0) {
               var10001 = "\u0014 Zm\u0016";
               var3.append("<br/>");
            }

            var3.append(var2.getName().charAt(var4++));
         }

         var10001 = "e!=g/0e!1z4bg";
         var3.append("</div></html>");
         this.dy[7].setText(var3.toString());
         this.ea.setText("0");
         this.h();
         var4 = 0;

         for (int var8 = var4; var8 < this.eh.length; var8 = var4) {
            this.eh[var4++].l();
         }

         if (this.zc().l(this.lj()) == null) {
            this.zc().b(this.lj());
         }
      }
   }

   public void f() {
      int var1;
      if ((var1 = (int)this.eb.ee()) > 0) {
         SuitOperBean var2 = new SuitOperBean();
         var2.setType(117);
         var2.setJade(new PartJade(this.cb, var1));
         String var3 = Agreement.getSendTextAES("suitoperate", com.xy.v.Class31.a().toJson(var2));
         this.za().k(var3);
      }
   }

   public void h() {
      com.xy.q.Class14 var10000 = this.dx[0];
      StringBuilder var10001 = new StringBuilder(String.valueOf(this.yx().getPackRecord().getStarSoulType(this.cb) % 10000L));
      String var10002 = "\u0007z\u0018r\u0018";
      var10000.setText(var10001.append("/8000").toString());
   }

   @Override
   protected void paintComponent(Graphics var1) {
      super.paintComponent(var1);
      if (this.afx.dh()) {
         this.h();
      }
   }

   public boolean du(long var1, JTextField var3) {
      return true;
   }

   public Class3(GameView var1) {
      super(141, 2, com.xy.q.Class30.afz, var1);
      String var10008 = "}:!=!h )`>";
      this.eg = 50;
      this.ee = new BigDecimal(1000000);
      this.yy(-1, 0, 404, 413, com.xy.q.Class30.agh);
      com.xy.w.Class9 var29 = com.xy.w.Class16.m("sc/d/1.png", 68, 68, 68, 68, false);
      String var10009 = "晝魪聒乭";
      this.yu(var29, "星魂耐久");
      this.ed = new RichLabel("", Class49.n);
      String var10006 = "-:H\u001f>i>i或旎專淑耙晆魌聉之せ耞东临隯旸ｕ昑鬛七提萳ｕ佈拙胳方泛畆敆せ叡淑耙鬛倲侷夃聉之せ";
      this.ed.setTextSize("#cFF0000战斗将消耗星魂耐久。耐久为零时，星魂不掉落，但技能无法生效。可消耗魂值修复耐久。", 308);
      this.ed.setBounds(58, 28, this.ed.getWidth(), this.ed.getHeight());
      this.add(this.ed);
      var10009 = "[!\u0007'\u0007p\u001elX,O";
      String var10014 = "俠奔耞东";
      this.ec = new com.xy.i.Class11("sc/e/26.png", 1, 31, Class49.ch, Class49.bv, "修复耐久", this);
      this.ec.setBounds(162, 362, 99, 25);
      this.add(this.ec);
      this.dy = new JLabel[8];

      int var2;
      for (int var10000 = var2 = 0; var10000 < this.dy.length; var10000 = ++var2) {
         this.dy[var2] = com.xy.q.Class1.f(107, 157 + 29 * var2, 111, 19, 10, Color.black, Class49.ch);
         JLabel var6 = this.dy[var2];
         String var11;
         if (var2 == 0) {
            var11 = "弑剥聒乭";
            var11 = "当前耐久";
         } else if (var2 == 1) {
            var11 = "俠奔耞东";
            var11 = "修复耐久";
         } else if (var2 == 2) {
            var11 = "淊耿鬀倔";
            var11 = "消耗魂值";
         } else if (var2 == 3) {
            var11 = "拫材魌健";
            var11 = "拥有魂值";
         } else if (var2 == 4) {
            var11 = "淊耿醓钙";
            var11 = "消耗金钱";
         } else if (var2 == 5) {
            var11 = "拫材釟铨";
            var11 = "拥有金钱";
         } else if (var2 == 6) {
            var11 = "丨烻魪偾叇侬夥w\u0018聒乭";
            var11 = "一点魂值可修复50耐久";
         } else {
            var11 = "";
         }

         var6.setText(var11);
         this.add(this.dy[var2]);
         if (var2 == 2 || var2 == 3) {
            this.dy[var2].setBounds(107, 172 + 29 * var2, 111, 19);
         } else if (var2 == 4 || var2 == 5) {
            this.dy[var2].setBounds(107, 186 + 29 * var2, 111, 19);
         } else if (var2 == 6) {
            this.dy[var2].setFont(Class49.n);
            this.dy[var2].setBounds(184, 213, 150, 15);
         } else if (var2 == 7) {
            this.dy[var2].setHorizontalAlignment(0);
            this.dy[var2].setBounds(185, 83, 49, 49);
         }
      }

      this.ef = new MoneyType();
      this.dz = new MoneyType();
      String var10005 = "魌健";
      this.ef.setIdAndKey(0, "魂值");
      String var10004 = "醓钙";
      this.dz.setIdAndKey(1, "金钱");
      this.dx = new com.xy.q.Class14[3];

      for (int var7 = var2 = 0; var7 < this.dx.length; var7 = var2) {
         this.dx[var2] = com.xy.q.Class1.i(185, 157 + 29 * var2, 111, 19, 10, Color.white, Class49.w);
         if (var2 == 2) {
            this.dx[var2].setBounds(185, 302, 111, 19);
         }

         com.xy.q.Class14 var10002 = this.dx[var2];
         String var10003 = "*mvjv?n )`>";
         var10002.mt(com.xy.w.Class16.m("sc/d/17.png", 6, 6, 6, 6, false));
         this.add(this.dx[var2++]);
      }

      var10006 = "[!\u0007&\u0007s\u001flX,O";
      this.ea = com.xy.q.Class1.j(com.xy.w.Class16.m("sc/d/17.png", 6, 6, 6, 6, false), Class49.w, Color.white);
      this.ea.setBounds(185, 230, 111, 19);
      this.add(this.ea);
      this.eh = new Class52[2];

      for (int var8 = var2 = 0; var8 < this.eh.length; var8 = var2) {
         MoneyType var26;
         GameView var28;
         if (var2 == 0) {
            var26 = this.ef;
            var28 = var1;
         } else {
            var26 = this.dz;
            var28 = var1;
         }

         this.eh[var2] = com.xy.q.Class1.a(10, Color.white, Class49.w, var26, var28);
         Class52 var21 = this.eh[var2];
         String var25 = "*mvjv?n )`>";
         var21.mt(com.xy.w.Class16.m("sc/d/17.png", 6, 6, 6, 6, false));
         this.eh[var2].n(2);
         Class3 var9;
         if (var2 == 0) {
            var9 = this;
            this.eh[var2].setBounds(185, 256, 111, 19);
         } else {
            if (var2 == 1) {
               this.eh[var2].setBounds(185, 331, 111, 19);
            }

            var9 = this;
         }

         var9.add(this.eh[var2++]);
      }

      this.eb = new com.xy.q.Class27(15, this.ea, this);
      this.ar = new com.xy.w.Class18[3];

      for (int var10 = var2 = 0; var10 < this.ar.length; var10 = ++var2) {
         this.ar[var2] = new com.xy.w.Class18();
         this.add(this.ar[var2]);
         if (var2 == 0) {
            this.ar[var2].setBounds(184, 83, 50, 50);
         } else if (var2 == 1) {
            com.xy.w.Class18 var18 = this.ar[var2];
            String var23 = "1KmLm\u001clX,O";
            var18.dp("sc/d/4.png");
            this.ar[var2].setBounds(180, 79, 59, 57);
         } else if (var2 == 2) {
            com.xy.w.Class18 var19 = this.ar[var2];
            String var24 = "*mvjv8o )`>";
            var19.mt(com.xy.w.Class16.m("sc/d/66.png", 30, 1, 30, 1, false));
            this.ar[var2].setBounds(71, 287, 273, 2);
         }
      }
   }
}
