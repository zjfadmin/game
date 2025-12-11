package com.xy.a.v;

import com.xy.bean.UseCardBean;
import com.xy.i.Class22;
import com.xy.richtext.RichLabel;
import com.xy.text.GameView;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Class44 extends com.xy.q.Class30 {
   private RichLabel h;
   private List<com.xy.i.Class22> wq;
   private Class51 acc;
   private int eg = 21;
   private com.xy.w.Class18[] cl;

   public Class44(GameView var1) {
      super(-1, -1, com.xy.q.Class30.agf, var1);
      this.yy(0, 0, 745, 452, com.xy.q.Class30.agf);
      this.wq = new ArrayList<>();
      String var10004 = "Sz\u000f|\u000f(\u0015*\u000eiN~";
      String var10009 = "笕绹祠卛";
      com.xy.i.Class22 var2 = new com.xy.i.Class22("sc/e/153.png", 2, 21, com.xy.q.Class49.ch, null, "等级礼包", this);
      String var10003 = "\u0003z\u0015+\u0013-\u0012,";
      var2.setBounds(91, 72, 104, 28);
      var2.setForeground(com.xy.q.Class49.c("#c523425"));
      this.wq.add(var2);
      this.add(var2);
      this.h = new RichLabel("", com.xy.q.Class49.bx);
      this.h.setBounds(204 + (498 - this.h.getWidth()) / 2, 120, this.h.getWidth(), this.h.getHeight());
      this.add(this.h);
      this.cl = new com.xy.w.Class18[4];

      int var3;
      for (int var10000 = var3 = 0; var10000 < this.cl.length; var10000 = var3) {
         this.cl[var3] = new com.xy.w.Class18();
         Class44 var4;
         if (var3 == 0) {
            var4 = this;
            com.xy.w.Class18 var10002 = this.cl[var3];
            var10003 = "-?q8qehr.29";
            var10002.dp("sc/d/96.png");
            this.cl[var3].setBounds(203, 51, 499, 97);
         } else if (var3 == 1) {
            var4 = this;
            com.xy.w.Class18 var5 = this.cl[var3];
            var10003 = "jC6D6\u0019!\u000eiN~";
            var5.dp("sc/d/98.png");
            this.cl[var3].setBounds(206, 123, 492, 21);
         } else if (var3 == 2) {
            var4 = this;
            com.xy.w.Class18 var6 = this.cl[var3];
            var10003 = "-?q8qeir.29";
            var6.dp("sc/d/97.png");
            this.cl[var3].setBounds(207, 55, 491, 89);
         } else {
            if (var3 == 3) {
               com.xy.w.Class18 var10001 = this.cl[var3];
               String var7 = "Sz\u000f}\u000f(\u0010(\u000eiN~";
               var10001.dp("sc/d/101.png");
               this.cl[var3].setBounds(202, 136, 499, 310);
            }

            var4 = this;
         }

         var4.add(this.cl[var3++]);
      }
   }

   public void f() {
      this.wt = true;
   }

   public int ky(int var1) {
      boolean var2 = false;
      UseCardBean var3;
      List var4 = (var3 = this.yx().getLimit("限时礼包")) != null ? var3.getKeysByActivity() : null;

      int var5;
      for (int var10000 = var5 = this.wq.size() - 1; var10000 >= 0; var10000 = --var5) {
         com.xy.i.Class22 var6 = this.wq.get(var5);
         if (!this.agz(var6.lj(), var4)) {
            this.remove(var6);
            this.wq.remove(var5);
            var2 = true;
         }
      }

      var5 = 0;
      int var12 = var4 != null ? var4.size() : 0;

      for (int var17 = var5; var17 < var12; var17 = ++var5) {
         com.xy.v.Class26 var7 = (com.xy.v.Class26)var4.get(var5);
         if ((var7 = this.yt().x(var7.a)) != null && !this.at((int)var7.b)) {
            String var10002 = "/=s;soimr.29";
            com.xy.i.Class22 var8 = new com.xy.i.Class22("sc/e/153.png", 2, (int)var7.b, com.xy.q.Class49.ch, null, var7.a, this);
            var10002 = "\u0003z\u0015+\u0013-\u0012,";
            var8.setForeground(com.xy.q.Class49.c("#c523425"));
            this.wq.add(var8);
            this.add(var8);
            var2 = true;
         }
      }

      boolean var19;
      label63: {
         if (!this.at(var1)) {
            var1 = 21;

            Iterator<Class22> var13;
            for (Iterator var18 = var13 = this.wq.iterator(); var18.hasNext(); var18 = var13) {
               com.xy.i.Class22 var10;
               if ((var10 = var13.next()).lj() != 21) {
                  var1 = var10.lj();
                  var19 = var2;
                  break label63;
               }
            }
         }

         var19 = var2;
      }

      if (var19) {
         var5 = 0;
         Iterator var16;
         Iterator var20 = var16 = this.wq.iterator();

         while (var20.hasNext()) {
            com.xy.i.Class22 var14 = (com.xy.i.Class22)var16.next();
            var20 = var16;
            int var10003 = 72 + 40 * var5;
            var5++;
            var14.setBounds(91, var10003, 104, 28);
         }
      }

      return var1;
   }

   public void h() {
      this.f();
   }

   public void g(int var1) {
      this.eg = this.ky(var1);

      Iterator var3;
      for (Iterator var10000 = var3 = this.wq.iterator(); var10000.hasNext(); var10000 = var3) {
         com.xy.i.Class22 var4 = (com.xy.i.Class22)var3.next();
         var4.setKeep(var4.lj() == this.eg);
      }

      if (this.acc == null) {
         this.add(this.acc = new Class51(this), 0);
      }

      this.acc.n(this.eg);
   }

   public boolean at(int var1) {
      Iterator var3;
      for (Iterator var10000 = var3 = this.wq.iterator(); var10000.hasNext(); var10000 = var3) {
         if (((com.xy.i.Class22)var3.next()).lj() == var1) {
            return true;
         }
      }

      return false;
   }

   @Override
   public void paint(Graphics var1) {
      if (this.wt) {
         this.g(this.eg);
      }

      super.paint(var1);
   }

   public boolean agz(int var1, List<com.xy.v.Class26> var2) {
      if (var1 == 21) {
         return true;
      } else if (var2 == null) {
         return false;
      } else {
         Iterator var4;
         for (Iterator var10000 = var4 = var2.iterator(); var10000.hasNext(); var10000 = var4) {
            if (((com.xy.v.Class26)var4.next()).b == var1) {
               return true;
            }
         }

         return false;
      }
   }

   public RichLabel aha() {
      return this.h;
   }
}
