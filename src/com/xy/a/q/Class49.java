package com.xy.a.q;

import com.xy.text.GameView;

public class Class49 extends com.xy.q.Class30 {
   private com.xy.w.Class18 co;
   private Class20 aat;
   private Class3 aau;
   private com.xy.i.Class18 md;
   private com.xy.i.Class18[] qh;
   private int ah;

   public Class49(GameView var1) {
      super(133, 2, com.xy.q.Class30.afz, var1);
      String var10003 = "0QlVl\u0003mB-U";
      this.ah = -1;
      this.yy(-1, 0, 622, 462, com.xy.q.Class30.agh);
      com.xy.w.Class9 var7 = com.xy.w.Class16.m("sc/d/1.png", 68, 68, 68, 68, false);
      String var10004 = "聊丣";
      this.yu(var7, "职业");
      this.qh = new com.xy.i.Class18[3];

      int var2;
      for (int var10000 = var2 = 0; var10000 < this.qh.length; var10000 = var2) {
         String var10006 = "A \u001d&\u001dp\nmB-U";
         this.qh[var2] = new com.xy.i.Class18("sc/e/38.png", 2, 301 + var2, com.xy.q.Class49.bx, com.xy.q.Class49.bv, "", this);
         this.qh[var2].setBounds(66 + 82 * var2, 16, 79, 33);
         com.xy.i.Class18 var3 = this.qh[var2];
         String var4;
         if (var2 == 0) {
            var4 = "甦&亞";
            var4 = "生 产";
         } else if (var2 == 1) {
            var4 = "戣观乂";
            var4 = "我要买";
         } else if (var2 == 2) {
            var4 = "戨覇卯";
            var4 = "我要卖";
         } else {
            var4 = "";
         }

         var3.setText(var4);
         this.qh[var2].setOffsetTexts(com.xy.q.Class49.d);
         this.add(this.qh[var2++]);
      }

      String var10008 = "A \u001d&\u001dq\nmB-U";
      String var10013 = "刾捤剖聊丣";
      this.md = new com.xy.i.Class18("sc/e/28.png", 1, 304, com.xy.q.Class49.bz, null, "切换副职业", this);
      this.md.setBounds(508, 26, 68, 18);
      this.add(this.md);
      String var10009 = "A \u001d'\u001dp\u0007mB-U";
      this.co = new com.xy.w.Class18(com.xy.w.Class16.m("sc/d/35.png", 80, 10, 80, 10, false));
      this.co.setBounds(32, 30, 574, 20);
      this.add(this.co);
      this.add(this.aat = new Class20(var1), 0);
      this.add(this.aau = new Class3(var1));
   }

   @Override
   public void l() {
      this.y(0);
      super.l();
   }

   public void vb(Class3 var1) {
      this.aau = var1;
   }

   public void vc(Class20 var1) {
      this.aat = var1;
   }

   public void bi(int var1) {
      this.ah = var1;
   }

   public void y(int var1) {
      int var10000 = 0;
      this.ah = var1;

      for (int var2 = 0; var10000 < this.qh.length; var10000 = ++var2) {
         this.qh[var2].setKeep(var2 == this.ah);
      }

      this.g(var1);
      this.aat.setVisible(var1 == 0);
      this.aau.setVisible(var1 == 1 || var1 == 2);
   }

   public int dx() {
      return this.ah;
   }

   @Override
   public boolean ah() {
      return this.ah == 0 && !this.aat.ls() ? false : super.ah();
   }

   public void g(int var1) {
      if (var1 == -1) {
         var1 = this.ah;
      }

      if (var1 == this.ah) {
         if (this.ah == 0) {
            this.aat.y(0);
         } else {
            if (this.ah == 1 || this.ah == 2) {
               this.aau.bi(this.ah);
            }
         }
      }
   }

   public Class20 vd() {
      return this.aat;
   }

   public Class3 ve() {
      return this.aau;
   }
}
