package com.xy.a.w;

import com.xy.formula.BaseSkillData;
import com.xy.q.Class49;
import com.xy.q.Class54;
import com.xy.readbean.Skill;
import javax.swing.JLabel;

class Class27 extends com.xy.w.Class18 {
   private JLabel[] r;
   private com.xy.i.Class20 aaj;
   // $VF: synthetic field
   final Class12 hy;
   private Class54 ada;
   private com.xy.w.Class18[] cl;

   public Class27(Class12 var1) {
      this.hy = var1;
      this.r = new JLabel[3];

      int var2;
      for (int var10000 = var2 = 0; var10000 < this.r.length; var10000 = var2) {
         byte var10006;
         int var10007;
         if (var2 == 2) {
            var10006 = 0;
            var10007 = var2;
         } else {
            var10006 = 10;
            var10007 = var2;
         }

         String var12;
         if (var10007 == 1) {
            String var11 = "NRT\bT\bT\b";
            var12 = "#c999999";
         } else {
            String var13 = "s \u0016\u0005\u0016\u0005\u0016\u0005";
            var12 = "#cFFFFFF";
         }

         this.r[var2] = com.xy.q.Class1.f(0, 0, 0, 0, var10006, Class49.c(var12), var2 == 0 ? Class49.k : (var2 == 1 ? Class49.n : Class49.bz));
         Class27 var4;
         if (var2 == 0) {
            var4 = this;
            this.r[var2].setBounds(57, 8, 80, 18);
         } else if (var2 == 1) {
            var4 = this;
            this.r[var2].setBounds(57, 27, 80, 18);
         } else {
            if (var2 == 2) {
               this.r[var2].setBounds(12, 52, 100, 14);
            }

            var4 = this;
         }

         var4.add(this.r[var2++]);
      }

      this.cl = new com.xy.w.Class18[2];

      for (int var5 = var2 = 0; var5 < this.cl.length; var5 = var2) {
         this.cl[var2] = new com.xy.w.Class18();
         com.xy.w.Class18 var6 = this.cl[var2];
         String var8;
         if (var2 == 0) {
            var8 = "B\u000e\u001e\t\u001e[\u0004CA\u0003V";
            var8 = "sc/d/65.png";
         } else {
            var8 = "03l4lat~3>$";
            var8 = "sc/d/17.png";
         }

         var6.mt(com.xy.w.Class16.m(var8, 3, 3, 3, 3, false));
         Class27 var7;
         if (var2 == 0) {
            var7 = this;
            this.cl[var2].setBounds(14, 55, 96, 10);
         } else {
            if (var2 == 1) {
               this.cl[var2].setBounds(12, 53, 100, 14);
            }

            var7 = this;
         }

         var7.add(this.cl[var2++]);
      }

      this.ada = new Class54(var1.eg());
      this.ada.setBounds(15, 12, 30, 30);
      this.add(this.ada);
      String var10008 = "\u001eRBTB\u0007CA\u0003V";
      String var10013 = "侾烿";
      this.aaj = new com.xy.i.Class20("sc/e/6.png", 1, 0, Class49.bz, null, "修炼", var1.eg());
      this.aaj.setOffsetTexts(Class49.ag);
      this.aaj.setBounds(116, 52, 34, 18);
      this.add(this.aaj);
   }

   public void adf(boolean var1, boolean var2) {
      this.r[2].setVisible(var1);
      this.cl[0].setVisible(var1);
      this.cl[1].setVisible(var1);
      this.aaj.y(var2 ? 95 : 96);
      this.aaj.setVisible(var1);
      if (var1) {
         this.setBounds(4, 135 + (var2 ? 0 : 82), 160, 80);
      } else {
         this.setBounds(4, 135 + (var2 ? 0 : 56), 160, 54);
      }
   }

   public void adg(int var1, int var2, int var3, boolean var4, boolean var5) {
      com.xy.v.Class8 var10000 = this.hy.yt();
      short var10001;
      int var10002;
      if (var5) {
         var10001 = 12000;
         var10002 = var1;
      } else {
         var10001 = 12500;
         var10002 = var1;
      }

      Skill var6 = var10000.ac(String.valueOf(var10001 + var10002));
      BaseSkillData var7 = new BaseSkillData(var6);
      var7.setSld(var2);
      var7.setSldMax(var3);
      this.r[0].setText(var6.getSkillname());
      JLabel var10 = this.r[1];
      String var13;
      if (var5) {
         String var12 = "乖劙拭背";
         var13 = "主动技能";
      } else {
         String var14 = "裻勫拐肾";
         var13 = "被动技能";
      }

      var10.setText(var13);
      JLabel var15 = this.r[2];
      StringBuilder var16 = new StringBuilder(String.valueOf(var2));
      String var10003 = "\u001e";
      var15.setText(var16.append("/").append(var3).toString());
      double var8;
      Class27 var11;
      if ((var8 = (double)var2 / var3) <= 0.0) {
         var11 = this;
         this.cl[0].setBounds(14, 55, 0, 10);
      } else if (var8 >= 1.0) {
         this.cl[0].setBounds(14, 55, 96, 10);
         var11 = this;
      } else {
         this.cl[0].setBounds(14, 55, (int)(var8 * 96.0), 10);
         var11 = this;
      }

      var11.ada.gs(12, var7);
      this.adf(var4, var5);
   }
}
