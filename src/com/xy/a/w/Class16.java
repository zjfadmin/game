package com.xy.a.w;

import com.xy.formula.BaseSkillData;
import com.xy.q.Class49;
import com.xy.q.Class54;
import com.xy.readbean.Skill;
import java.awt.Color;
import javax.swing.JLabel;

class Class16 extends com.xy.w.Class18 {
   // $VF: synthetic field
   final Class21 up;
   private com.xy.w.Class18[] j;
   private JLabel[] o;
   private Class54 ft;

   public Class16(Class21 var1) {
      this.up = var1;
      this.o = new JLabel[2];

      int var2;
      for (int var10000 = var2 = 0; var10000 < this.o.length; var10000 = var2) {
         int var10006 = var2 == 0 ? 10 : 0;
         String var10007 = "|@\u0019e\u0019e\u0019e";
         this.o[var2] = com.xy.q.Class1.f(0, 0, 0, 0, var10006, Class49.c("#cFFFFFF"), var2 == 0 ? Class49.k : Class49.bz);
         Class16 var4;
         if (var2 == 0) {
            var4 = this;
            this.o[var2].setBounds(50, 5, 110, 18);
         } else {
            if (var2 == 1) {
               this.o[var2].setBounds(50, 23, 106, 12);
            }

            var4 = this;
         }

         var4.add(this.o[var2++]);
      }

      this.j = new com.xy.w.Class18[2];

      for (int var5 = var2 = 0; var5 < this.j.length; var5 = var2) {
         this.j[var2] = new com.xy.w.Class18();
         com.xy.w.Class18 var6 = this.j[var2];
         String var8;
         if (var2 == 0) {
            var8 = "[C\u0007D\u0007\u0016\u001d\u000eXNO";
            var8 = "sc/d/65.png";
         } else {
            var8 = "P<\f;\fn\u0014qS1D";
            var8 = "sc/d/17.png";
         }

         var6.mt(com.xy.w.Class16.m(var8, 3, 3, 3, 3, false));
         Class16 var7;
         if (var2 == 0) {
            var7 = this;
            this.j[var2].setBounds(50, 25, 106, 10);
         } else {
            if (var2 == 1) {
               this.j[var2].setBounds(48, 23, 110, 14);
            }

            var7 = this;
         }

         var7.add(this.j[var2++]);
      }

      this.ft = new Class54(var1.eg());
      this.ft.setBounds(10, 7, 30, 30);
      this.add(this.ft);
   }

   public void os(Skill var1, int var2, int var3) {
      if (var1 == null) {
         this.o[0].setText(null);
         this.o[1].setText(null);
         this.j[0].setBounds(50, 25, 0, 10);
         this.ft.gs(0, null);
      } else {
         this.o[0].setText(var1.getSkillname());
         JLabel var10001 = this.o[1];
         StringBuilder var10002 = new StringBuilder(String.valueOf(var2));
         String var10003 = "\u0007";
         var10001.setText(var10002.append("/").append(var3).toString());
         this.o[1].setForeground(var3 > 25000 ? Color.red : Color.white);
         double var4;
         if ((var4 = (double)var2 / var3) <= 0.0) {
            this.j[0].setBounds(50, 25, 0, 10);
         } else if (var4 >= 1.0) {
            this.j[0].setBounds(50, 25, 106, 10);
         } else {
            this.j[0].setBounds(50, 25, (int)(var4 * 106.0), 10);
         }

         BaseSkillData var6 = new BaseSkillData(var1);
         var6.setSld(var2);
         var6.setSldMax(var3);
         this.ft.gs(12, var6);
      }
   }
}
