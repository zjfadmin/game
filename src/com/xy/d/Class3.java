package com.xy.d;

import com.xy.bean.StallBean;
import com.xy.q.Class49;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import com.xy.w.Class16;
import java.awt.Color;
import java.awt.Graphics;

public class Class3 extends Class4 {
   private transient com.xy.w.Class9 i;
   public StallBean j;
   private boolean k;
   private int l;
   private int m;
   private boolean n;
   public static int o = 0;
   private boolean p;
   private static Color q = new Color(211, 146, 112);
   public static int r = 3;
   public static int e = 1;
   private int s;
   private static com.xy.w.Class0 t;
   public static int h = 2;
   private static Color u = new Color(203, 181, 91);

   @Override
   public void i(Graphics var1) {
   }

   public void j(Graphics var1, Class4 var2, GameView var3) {
      var1.setFont(Class49.ac);
      var1.setColor(this.n ? q : u);
      if (this.k) {
         if (this.p) {
            String var5 = ";\u0004g\u0005g\u0014<\u0006$\u000bzI8\t/";
            this.i = Class16.m("sc/b/stall2.png", 7, 7, 16, 7, false);
            this.s = var1.getFontMetrics().stringWidth(this.w);
            Class3 var4;
            if (this.s < 96) {
               var4 = this;
               this.m = 110;
               this.s = 48 - this.s / 2 + 8;
            } else {
               var4 = this;
               this.m = 14 + this.s;
               this.s = 8;
            }

            var4.m += 14;
            this.l = 29;
            this.p = false;
         }

         var1.translate(this.x, this.y - 2);
         this.i.g(var1, this.m, this.l);
         var1.drawString(this.w, this.s, 20);
         var1.translate(-this.x, -this.y + 2);
      } else {
         if (this.p) {
            String var10004 = "gY;X;I`[xV%\u0014dTs";
            this.i = Class16.m("sc/b/stall1.png", 7, 7, 7, 7, false);
            this.s = var1.getFontMetrics().stringWidth(this.w);
            Class3 var10000;
            if (this.s < 96) {
               var10000 = this;
               this.m = 110;
               this.s = 48 - this.s / 2 + 8;
            } else {
               var10000 = this;
               this.m = 14 + this.s;
               this.s = 8;
            }

            var10000.l = 24;
            this.p = false;
         }

         var1.translate(this.x, this.y);
         this.i.g(var1, this.m, this.l);
         var1.drawString(this.w, this.s, 17);
         var1.translate(-this.x, -this.y);
      }
   }

   @Override
   public void b(GameView var1) {
      this.n = true;
      String var2 = Agreement.getSendTextAES("stallget", String.valueOf(this.j.getId()));
      var1.getClient().k(var2);
   }

   public boolean k() {
      return this.j.getState() == h;
   }

   @Override
   public boolean l(int var1, int var2) {
      if (this.j.getState() == h) {
         if (t == null) {
            String var10000 = "TxWxSx";
            t = com.xy.w.Class11.t("300040", 2, 1, null);
         }

         return t.h(var1 - (this.ae + 50), var2 - (this.v + 135));
      } else {
         return false;
      }
   }

   public boolean m(int var1, int var2) {
      return !this.p && var1 > this.ae && var2 > this.v && var1 < this.ae + this.m && var2 < this.v + this.l;
   }

   public Class3(StallBean var1) {
      this.aa = 11;
      this.p(var1);
   }

   public boolean n() {
      return this.n;
   }

   @Override
   public int c(Class4 var1) {
      return var1.ab > this.ab ? 1 : -1;
   }

   @Override
   public void o(Graphics var1, Class4 var2, GameView var3) {
      if (t == null) {
         String var10000 = "\t$\n$\u000e$";
         t = com.xy.w.Class11.t("300040", 2, 1, null);
      }

      if (var2 == this) {
         t.d(var1, this.x + 50, this.y + 135, this.ak, this.z, 1.0F);
      } else {
         t.r(var1, this.x + 50, this.y + 135, this.ak, this.z);
      }
   }

   @Override
   public void d(Graphics var1) {
   }

   public void p(StallBean var1) {
      try {
         this.j = var1;
         this.p = true;
         this.ae = var1.getX();
         this.v = var1.getY();
         this.al = 0;
         this.w = var1.getStall();
         this.ag = null;
         this.ak = 4;
         this.k = var1.b();
      } catch (Exception var3) {
         var3.printStackTrace();
      }
   }

   public void q(boolean var1) {
      this.n = var1;
   }
}
