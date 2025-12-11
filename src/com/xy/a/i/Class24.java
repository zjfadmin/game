package com.xy.a.i;

import com.xy.bean.SuitOperBean;
import com.xy.game.RoleData;
import com.xy.q.Class49;
import com.xy.readbean.StarSoul;
import com.xy.richtext.RichLabel;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.math.BigDecimal;
import java.util.ArrayList;
import javax.swing.JLabel;

public class Class24 extends com.xy.q.Class30 {
   private RichLabel ed;
   private com.xy.q.Class14 ac;
   private Class19[] adm;
   private com.xy.i.Class11 adn;
   private com.xy.w.Class18[] j;
   private JLabel[] o;
   private Class19[] ado;

   @Override
   public void l() {
      this.c();
      super.l();
   }

   public void c() {
      RoleData var1 = this.yx();

      int var2;
      for (int var10000 = var2 = 0; var10000 < this.adm.length; var10000 = var2) {
         long var3 = var1.getPackRecord().getStarSoulType(this.adm[var2].lj()) / 10000L;
         this.adm[var2++].ef(var3);
      }

      for (int var6 = var2 = 0; var6 < this.ado.length; var6 = var2) {
         Class19 var7 = this.ado[var2];
         var2++;
         var7.tz(0, null);
      }

      this.e();
   }

   public void e() {
      long var1 = 0L;

      int var3;
      for (int var10000 = var3 = 0; var10000 < this.ado.length; var10000 = ++var3) {
         StarSoul var4 = this.ado[var3].lj() != 0 ? this.yt().p(this.ado[var3].lj()) : null;
         if (var4 != null) {
            var1 += Long.parseLong(var4.getValue()) * this.ado[var3].il();
         }
      }

      Class49.b(this.ac, var1);
   }

   public void wu(Class19 var1, MouseEvent var2) {
      boolean var3 = false;

      int var4;
      for (int var10000 = var4 = 0; var10000 < this.ado.length; var10000 = ++var4) {
         if (this.ado[var4] == var1) {
            var3 = true;
         }
      }

      if (var3) {
         if (var2.getButton() == 3 && var1.lj() != 0) {
            var1.tz(0, this.yt());
            this.h();
            this.e();
         }
      } else {
         long var5;
         if ((var5 = this.yx().getPackRecord().getStarSoulType(var1.lj()) / 10000L) != 0L) {
            Class19 var7;
            if ((var7 = this.wv(var1.lj())) != null) {
               long var8;
               if ((var8 = var7.il()) < var5) {
                  if (var2.getButton() == 1) {
                     var5 = var8 + 1L;
                  }

                  var7.ef(var5);
                  this.e();
               }
            }
         }
      }
   }

   public Class24(GameView var1) {
      super(140, 2, com.xy.q.Class30.afz, var1);
      String var10007 = "07l0lem$-3";
      this.yy(-3, 0, 382, 485, com.xy.q.Class30.agh);
      com.xy.w.Class9 var20 = com.xy.w.Class16.m("sc/d/1.png", 68, 68, 68, 68, false);
      String var10008 = "轖卓";
      this.yu(var20, "转化");
      this.ed = new RichLabel("", Class49.n);
      String var10006 = "w dsdsds掄祹ｎ嶥镺烺冯遊乹r乾ｏ厧镭热冸遝乮e纇ざ";
      this.ed.setTextSize("#c000000提示：左键点击选中1个，右键点击选中1组。", 380);
      this.ed.setBounds(48, 347, this.ed.getWidth(), this.ed.getHeight());
      this.add(this.ed);
      String var10009 = "I&\u0015 \u0015r\u00145T\"";
      String var10014 = "輯卂";
      this.adn = new com.xy.i.Class11("sc/e/7.png", 1, 34, Class49.ch, Class49.bv, "转化", this);
      this.adn.setBounds(269, 434, 59, 25);
      this.add(this.adn);
      this.o = new JLabel[2];

      int var2;
      for (int var10000 = var2 = 0; var10000 < this.o.length; var10000 = ++var2) {
         var10008 = "\u0019&\nu\nu\nu";
         this.o[var2] = com.xy.q.Class1.f(47, 18, 200, 19, 10, Class49.c("#c000000"), Class49.ch);
         JLabel var8 = this.o[var2];
         String var12;
         if (var2 == 0) {
            var12 = "讴遝抪觕輯卂盇晋鬁ｎ";
            var12 = "请选择要转化的星魂：";
         } else if (var2 == 1) {
            var12 = "厪莍忒魸偹";
            var12 = "可获得魂值";
         } else {
            var12 = "";
         }

         var8.setText(var12);
         this.add(this.o[var2]);
         if (var2 == 1) {
            this.o[var2].setBounds(65, 437, 88, 19);
         }
      }

      this.ac = com.xy.q.Class1.i(154, 437, 104, 19, 10, Color.white, Class49.w);
      String var10005 = "' {'{rcm$-3";
      this.ac.mt(com.xy.w.Class16.m("sc/d/17.png", 6, 6, 6, 6, false));
      this.add(this.ac);
      this.j = new com.xy.w.Class18[2];

      for (int var9 = var2 = 0; var9 < this.j.length; var9 = ++var2) {
         this.j[var2] = new com.xy.w.Class18();
         this.add(this.j[var2]);
         if (var2 == 0) {
            com.xy.w.Class18 var14 = this.j[var2];
            String var10002 = "6Yj^j\u000b|\u00145T\"";
            var14.mt(com.xy.w.Class16.m("sc/d/19.png", 5, 5, 5, 5, false));
            this.j[var2].setBounds(46, 37, 309, 309);
         } else if (var2 == 1) {
            com.xy.w.Class18 var15 = this.j[var2];
            String var17 = "' {'{rmm$-3";
            var15.mt(com.xy.w.Class16.m("sc/d/19.png", 5, 5, 5, 5, false));
            this.j[var2].setBounds(45, 372, 309, 54);
         }
      }

      com.xy.v.Class8 var6 = this.yt();
      String var16 = "6Yj^j\u000b}\u00145T\"";
      Image var3 = com.xy.w.Class16.c("sc/d/18.png");
      this.adm = new Class19[36];

      int var4;
      for (int var10 = var4 = 0; var10 < this.adm.length; var10 = var4) {
         this.adm[var4] = new Class19(var4 + 1, var3, true, var6, this);
         this.adm[var4].setBounds(47 + var4 % 6 * 51, 39 + var4 / 6 * 51, 51, 51);
         this.add(this.adm[var4++]);
      }

      this.ado = new Class19[6];

      for (int var11 = var4 = 0; var11 < this.ado.length; var11 = var4) {
         this.ado[var4] = new Class19(0, var3, true, var6, this);
         this.ado[var4].setBounds(46 + var4 % 6 * 51, 374 + var4 / 6 * 51, 51, 51);
         this.add(this.ado[var4++]);
      }
   }

   public void f() {
      ArrayList var1 = new ArrayList();

      int var2;
      for (int var10000 = var2 = 0; var10000 < this.ado.length; var10000 = ++var2) {
         if (this.ado[var2].lj() != 0) {
            BigDecimal var3 = new BigDecimal(this.ado[var2].lj());
            int var4;
            int var5;
            if ((var4 = this.ado[var2].il()) != 0) {
               for (int var8 = var5 = 0; var8 < var4; var8 = var5) {
                  var5++;
                  var1.add(var3);
               }
            }
         }
      }

      if (var1.size() != 0) {
         SuitOperBean var6 = new SuitOperBean();
         var6.setType(112);
         var6.setGoods(var1);
         String var7 = Agreement.getSendTextAES("suitoperate", com.xy.v.Class31.a().toJson(var6));
         this.za().k(var7);
      }
   }

   public void h() {
      int var1;
      for (int var10000 = var1 = 0; var10000 < this.ado.length - 1; var10000 = ++var1) {
         int var2;
         if (this.ado[var1].lj() == 0) {
            for (int var3 = var2 = var1 + 1; var3 < this.ado.length; var3 = ++var2) {
               if (this.ado[var2].lj() != 0) {
                  this.ado[var1].tz(this.ado[var2].lj(), this.yt());
                  this.ado[var1].ef(this.ado[var2].il());
                  this.ado[var2].tz(0, this.yt());
                  break;
               }
            }
         }
      }
   }

   public Class19 wv(int var1) {
      Class19 var2 = null;

      int var3;
      for (int var10000 = var3 = 0; var10000 < this.ado.length; var10000 = ++var3) {
         if (this.ado[var3].lj() == var1) {
            return this.ado[var3];
         }

         if (this.ado[var3].lj() == 0 && var2 == null) {
            var2 = this.ado[var3];
         }
      }

      if (var2 != null) {
         var2.tz(var1, this.yt());
      }

      return var2;
   }
}
