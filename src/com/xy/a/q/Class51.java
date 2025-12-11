package com.xy.a.q;

import com.xy.readbean.Goodstable;
import java.awt.Color;
import java.awt.Graphics;

class Class51 extends com.xy.q.Class54 {
   private int ha;
   private Goodstable abn;
   private int ae;
   private int ds;
   private String abo;
   // $VF: synthetic field
   final Class20 abp;
   private int eg;

   public int lj() {
      return this.abp.yx().getGoodNum(this.abn.getGoodsid()) / this.ae;
   }

   // $VF: synthetic method
   static int wb(Class51 var0) {
      return var0.eg;
   }

   @Override
   protected void paintComponent(Graphics var1) {
      super.paintComponent(var1);
      if (this.abo != null) {
         var1.setFont(com.xy.q.Class49.ac);
         Graphics var10000;
         if (this.eg < 100) {
            int var2 = this.abp.yx().getGoodNum(this.abn.getGoodsid());
            if (this.ha != var2) {
               this.ha = var2;
               this.ds = this.ae * var2;
               StringBuilder var10001 = new StringBuilder(String.valueOf(this.ha));
               String var10002 = ";";
               this.abo = var10001.append("/").append(this.ds).toString();
            }

            var1.setColor(this.ha >= this.ds ? Color.green : Color.WHITE);
            var10000 = var1;
         } else {
            var10000 = var1;
            var1.setColor(Color.WHITE);
         }

         var10000.drawString(this.abo, 8, 15);
      }
   }

   public void n(int var1) {
      if (this.abn == null) {
         this.abo = null;
      } else if (this.eg < 100) {
         this.ha = this.abp.yx().getGoodNum(this.abn.getGoodsid());
         this.ds = this.ae * var1;
         StringBuilder var10001 = new StringBuilder(String.valueOf(this.ha));
         String var10002 = "w";
         this.abo = var10001.append("/").append(this.ds).toString();
      } else {
         this.abo = null;
      }
   }

   public void wc(int var1, int var2, int var3, Goodstable var4) {
      this.eg = var1;
      this.ae = var2;
      this.ds = var3;
      this.abn = var4;
      byte var10001;
      Goodstable var10002;
      if (var4 != null) {
         var10001 = 1;
         var10002 = var4;
      } else {
         var10001 = 0;
         var10002 = var4;
      }

      this.gs(var10001, var10002);
      this.n(1);
      this.setVisible(var1 != -1);
   }

   public Class51(Class20 var1) {
      super(var1.eg());
      this.abp = var1;
      String var10002 = "W;\u000b<\u000bl\n(J?";
      this.mt(com.xy.w.Class16.m("sc/d/4.png", 5, 5, 5, 5, false));
      this.wp(com.xy.q.Class54.aum);
   }
}
