package com.xy.a.v;

import com.xy.formula.ActivityMenuSet2;
import com.xy.readbean.Activity;
import com.xy.richtext.RichLabel;
import com.xy.text.GameView;
import java.awt.Graphics;

public class Class28 extends com.xy.q.Class30 {
   private com.xy.i.Class22[] wj;
   private Class21 aca;
   private int ha;
   private Class16 acb;
   private com.xy.w.Class18[] ar;
   private Class51 acc;
   private RichLabel ck;
   private Activity rj;

   public Activity wg() {
      return this.rj;
   }

   public void g(int var1) {
      int var10000 = 0;
      this.ha = var1;

      for (int var2 = 0; var10000 < this.wj.length; var10000 = ++var2) {
         this.wj[var2].setKeep(var1 == var2);
      }

      ActivityMenuSet2 var3;
      if ((var3 = this.rj.getMenuSet2s()[var1]).getId() != 1 && var3.getId() != 3 && var3.getId() != 4) {
         if (var3.getId() == 2) {
            if (this.aca == null) {
               this.add(this.aca = new Class21(this), 0);
            }

            this.aca.mj(this.rj, var3);
            this.aca.setVisible(true);
            if (this.acc != null) {
               this.acc.setVisible(false);
            }

            if (this.acb != null) {
               this.acb.setVisible(false);
               return;
            }
         } else if (var3.getId() == 5) {
            if (this.acb == null) {
               this.add(this.acb = new Class16(this), 0);
            }

            this.acb.mj(this.rj, var3);
            this.acb.setVisible(true);
            if (this.acc != null) {
               this.acc.setVisible(false);
            }

            if (this.aca != null) {
               this.aca.setVisible(false);
            }
         }
      } else {
         if (this.acc == null) {
            this.add(this.acc = new Class51(this), 0);
         }

         this.acc.mj(this.rj, var3);
         this.acc.setVisible(true);
         if (this.aca != null) {
            this.aca.setVisible(false);
         }

         if (this.acb != null) {
            this.acb.setVisible(false);
            return;
         }
      }
   }

   public void e() {
      this.h();
   }

   public Class28(Activity var1, GameView var2) {
      super(-1, -1, com.xy.q.Class30.agf, var2);
      this.yy(0, 0, 745, 452, com.xy.q.Class30.agf);
      this.rj = var1;
      ActivityMenuSet2[] var3;
      this.wj = new com.xy.i.Class22[(var3 = var1.getMenuSet2s()).length];

      int var4;
      for (int var10000 = var4 = 0; var10000 < this.wj.length; var10000 = var4) {
         ActivityMenuSet2 var5 = var3[var4];
         String var10009 = "\u000ewRqR%H'Sd\u0013s";
         this.wj[var4] = new com.xy.i.Class22("sc/e/153.png", 2, 31, com.xy.q.Class49.ch, null, var5.getKey(), this);
         this.wj[var4].g(var4);
         this.wj[var4].setBounds(91, 72 + 40 * var4, 104, 28);
         com.xy.i.Class22 var10002 = this.wj[var4];
         String var10003 = "/09a?g>f";
         var10002.setForeground(com.xy.q.Class49.c("#c523425"));
         this.add(this.wj[var4++]);
      }

      this.ck = new RichLabel("", com.xy.q.Class49.bx);
      this.ck.setBounds(204 + (498 - this.ck.getWidth()) / 2, 120, this.ck.getWidth(), this.ck.getHeight());
      this.add(this.ck);
      this.ar = new com.xy.w.Class18[4];

      for (int var7 = var4 = 0; var7 < this.ar.length; var7 = var4) {
         this.ar[var4] = new com.xy.w.Class18();
         Class28 var8;
         if (var4 == 0) {
            var8 = this;
            com.xy.w.Class18 var10 = this.ar[var4];
            String var15 = "g\u001e;\u0019;D\"Sd\u0013s";
            var10.dp("sc/d/96.png");
            this.ar[var4].setBounds(203, 51, 499, 97);
         } else if (var4 == 1) {
            var8 = this;
            com.xy.w.Class18 var11 = this.ar[var4];
            String var16 = " o|h|5k\"#b4";
            var11.dp("sc/d/98.png");
            this.ar[var4].setBounds(206, 123, 492, 21);
         } else if (var4 == 2) {
            var8 = this;
            com.xy.w.Class18 var12 = this.ar[var4];
            String var17 = "g\u001e;\u0019;D#Sd\u0013s";
            var12.dp("sc/d/97.png");
            this.ar[var4].setBounds(207, 55, 491, 89);
         } else {
            if (var4 == 3) {
               com.xy.w.Class18 var10001 = this.ar[var4];
               String var13 = "\u007f0#7#b<b\"#b4";
               var10001.dp("sc/d/101.png");
               this.ar[var4].setBounds(202, 136, 499, 310);
            }

            var8 = this;
         }

         var8.add(this.ar[var4++]);
      }
   }

   public void f() {
      int var1 = (int)Math.max(0L, (this.rj.getTimeEnd() - com.xy.v.Class22.f()) / 60000L);
      StringBuffer var2 = new StringBuffer();
      String var10002 = "7'7*洯動既閉．亸剽";
      var2.append("#Z#W活动时间：仅剩");
      if (var1 > 1440) {
         String var10001 = "/\n";
         var2.append("#Y");
         var2.append(var1 / 1440);
         String var10003 = "7*夽";
         var2.append("#W天");
         var1 %= 1440;
      }

      if (var1 > 60) {
         String var3 = "/\n";
         var2.append("#Y");
         var2.append(var1 / 60);
         String var5 = "^C屲既";
         var2.append("#W小时");
         var1 %= 60;
      }

      String var4 = "/\n";
      var2.append("#Y");
      var2.append(var1);
      String var6 = "^C剻钋";
      var2.append("#W分钟");
      if (this.ck.isTextSize(var2.toString(), 498)) {
         this.ck.setBounds(204 + (498 - this.ck.getWidth()) / 2, 120, this.ck.getWidth(), this.ck.getHeight());
      }
   }

   public Class21 wk() {
      return this.aca;
   }

   @Override
   protected void paintComponent(Graphics var1) {
      if (this.afx.dh()) {
         this.f();
      }

      super.paintComponent(var1);
   }

   public Class16 wl() {
      return this.acb;
   }

   public int dx() {
      return this.rj.getId();
   }

   public void h() {
      this.wt = true;
   }

   @Override
   public void paint(Graphics var1) {
      if (this.wt) {
         this.g(this.ha);
      }

      super.paint(var1);
   }

   public Class51 wm() {
      return this.acc;
   }
}
