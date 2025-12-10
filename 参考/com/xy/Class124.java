package com.xy;

import com.xy.bean.StallBean;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import java.awt.Color;
import java.awt.Graphics;

public class Class124 extends Class292 {
   private int a;
   private boolean b;
   private boolean c;
   public StallBean d;
   private boolean e;
   public static int f = --3;
   public static int g = 3 & 5;
   private int h;
   public static int i = 1 ^ 3;
   private static Color j = new Color(16591 & 16379, 15359 & 17589, 127 & 91);
   private static Color k = new Color(1535 & 31443, 31423 & 1490, 114 & 125);
   private static Class19 l;
   private transient Class604 m;
   private int n;
   public static int o = 3 & 4;

   public void a(GameView var1) {
      this.e = (boolean)(--1);
      String var2 = Agreement.getSendTextAES("stallget", String.valueOf(this.d.getId()));
      var1.getClient().d(var2);
   }

   public void b(Graphics var1, Class292 var2, GameView var3) {
      if (l == null) {
         l = Class330.f("300040", 5 >> 1, --1, (String)null);
      }

      if (var2 == this) {
         l.t(var1, this.am + (118 & 59), this.ak + (27327 & 5575), this.as, this.an, 1.0F);
      } else {
         l.a(var1, this.am + (126 & 51), this.ak + (3759 & 29143), this.as, this.an);
      }
   }

   public boolean c(int var1, int var2) {
      if (this.d.getState() == i) {
         if (l == null) {
            l = Class330.f("300040", --2, 3 >> 1, (String)null);
         }

         return l.x(var1 - (this.ab + (55 & 122)), var2 - (this.al + (29655 & 3247)));
      } else {
         return false;
      }
   }

   public void d(Graphics var1, Class292 var2, GameView var3) {
      var1.setFont(Class681.ce);
      var1.setColor(this.e ? k : j);
      Class124 var10000;
      int var10002;
      if (this.c) {
         if (this.b) {
            this.m = Class511.q("sc/b/stall2.png", 103 & 31, 103 & 31, 18 & 125, 103 & 31, (boolean)(5 >> 3));
            this.n = var1.getFontMetrics().stringWidth(this.ad);
            if (this.n < (101 & 122)) {
               var10002 = 53 & 122;
               var10000 = this;
               this.h = 111 & 126;
               this.n = var10002 - this.n / (5 >> 1) + (120 & 15);
            } else {
               var10000 = this;
               var10002 = 74 & 61;
               this.h = (15 & 126) + this.n;
               this.n = var10002;
            }

            var10000.h += 15 & 126;
            int var10001 = 5 >> 3;
            this.a = 95 & 61;
            this.b = (boolean)var10001;
         }

         var1.translate(this.am, this.ak - (1 ^ 3));
         this.m.g(var1, this.h, this.a);
         var1.drawString(this.ad, this.n, 127 & 20);
         var1.translate(-this.am, -this.ak + (5 >> 1));
      } else {
         if (this.b) {
            this.m = Class511.q("sc/b/stall1.png", 79 & 55, 79 & 55, 79 & 55, 79 & 55, (boolean)(5 >> 3));
            this.n = var1.getFontMetrics().stringWidth(this.ad);
            if (this.n < (117 & 106)) {
               var10002 = 51 & 124;
               var10000 = this;
               this.h = 111 & 126;
               this.n = var10002 - this.n / --2 + (95 & 40);
            } else {
               var10000 = this;
               this.h = 14 + this.n;
               this.n = 8;
            }

            var10000.a = 24;
            this.b = (boolean)(3 >> 2);
         }

         var1.translate(this.am, this.ak);
         this.m.g(var1, this.h, this.a);
         var1.drawString(this.ad, this.n, 17);
         var1.translate(-this.am, -this.ak);
      }
   }

   public boolean e(int var1, int var2) {
      return (boolean)(!this.b && var1 > this.ab && var2 > this.al && var1 < this.ab + this.h && var2 < this.al + this.a ? 3 >> 1 : 0);
   }

   public void f(StallBean var1) {
      try {
         int var10003 = --4;
         int var10009 = 5 >> 3;
         int var10015 = 3 >> 1;
         this.d = var1;
         this.b = (boolean)var10015;
         this.ab = var1.getX();
         this.al = var1.getY();
         this.ar = var10009;
         this.ad = var1.getStall();
         this.ai = null;
         this.as = var10003;
         this.c = var1.a();
      } catch (Exception var2) {
         var2.printStackTrace();
      }
   }

   public boolean g() {
      return (boolean)(this.d.getState() == i ? --1 : 0);
   }

   public boolean h() {
      return this.e;
   }

   public void i(boolean var1) {
      this.e = var1;
   }

   public void j(Graphics var1) {
   }

   public void k(Graphics var1) {
   }

   public int l(Class292 var1) {
      return var1.ah > this.ah ? --1 : -1;
   }

   public Class124(StallBean var1) {
      int var10003 = 123 & 15;
      super();
      this.ac = var10003;
      this.f(var1);
   }
}
