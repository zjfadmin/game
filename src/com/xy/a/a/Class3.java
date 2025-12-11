package com.xy.a.a;

import com.xy.formula.BaseMountSH;
import com.xy.formula.PropertyUtil;
import com.xy.game.RoleData;
import com.xy.richtext.RichLabel;
import javax.swing.JLabel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;

public class Class3 extends com.xy.q.Class50 {
   private RichLabel am;
   private RichLabel av;
   private JScrollPane ab;
   private com.xy.w.Class18[] aw;
   private Class27 ax;
   private JLabel[] ay;
   private Class39[] az;
   private JScrollPane ba;
   private int ah;

   public Class3(Class27 var1) {
      this.ax = var1;
      this.ay = new JLabel[2];

      int var2;
      for (int var10000 = var2 = 0; var10000 < this.ay.length; var10000 = var2) {
         this.ay[var2] = com.xy.q.Class1.k(328 + 229 * var2, 260, 76, 19, com.xy.q.Class49.c("#cCCC09F"), com.xy.q.Class49.ao);
         JLabel var5 = this.ay[var2];
         String var10;
         if (var2 == 0) {
            var10 = "等级属性";
         } else if (var2 == 1) {
            var10 = "加成总览";
         } else {
            var10 = "";
         }

         var5.setText(var10);
         this.ay[var2].setHorizontalAlignment(0);
         this.add(this.ay[var2++]);
      }

      this.av = new RichLabel("", com.xy.q.Class49.w);
      this.am = new RichLabel("", com.xy.q.Class49.w);
      this.ba = com.xy.q.Class1.g(270, 281, 205, 128, this.av, -1);
      this.ab = com.xy.q.Class1.g(500, 281, 205, 128, this.am, -1);
      this.ba.getVerticalScrollBar().setUI(new com.xy.v.Class13(com.xy.w.Class16.m("sc/d/168.png", 3, 3, 3, 3, false), 6));
      this.ab.getVerticalScrollBar().setUI(new com.xy.v.Class13(com.xy.w.Class16.m("sc/d/168.png", 3, 3, 3, 3, false), 6));
      this.add(this.ba);
      this.add(this.ab);
      this.az = new Class39[2];

      for (int var6 = var2 = 0; var6 < this.az.length; var6 = var2) {
         this.az[var2] = new Class39(this, var2);
         Class3 var7;
         if (var2 == 0) {
            var7 = this;
            this.az[var2].setBounds(310, 121, 115, 115);
         } else {
            if (var2 == 1) {
               this.az[var2].setBounds(531, 121, 115, 115);
            }

            var7 = this;
         }

         var7.add(this.az[var2]);
         this.add(Class39.acw(this.az[var2++]));
      }

      this.aw = new com.xy.w.Class18[4];

      for (int var8 = var2 = 0; var8 < this.aw.length; var8 = var2) {
         this.aw[var2] = new com.xy.w.Class18();
         Class3 var9;
         if (var2 >= 0 && var2 <= 1) {
            var9 = this;
            this.aw[var2].dp("sc/d/167.png");
            this.aw[var2].setBounds(264 + var2 * 229, 267, 195, 5);
         } else {
            if (var2 >= 2 && var2 <= 3) {
               this.aw[var2].dp("sc/d/164.png");
               this.aw[var2].setBounds(259 + 229 * (var2 - 2), 255, 220, 172);
            }

            var9 = this;
         }

         var9.add(this.aw[var2++]);
      }

      this.setBounds(0, 0, 743, 519);
   }

   // $VF: synthetic method
   static Class27 ac(Class3 var0) {
      return var0.ax;
   }

   // $VF: synthetic method
   static int ad(Class3 var0) {
      return var0.ah;
   }

   public void ae(int var1, RoleData var2) {
      this.ah = var1;
      StringBuffer var3 = new StringBuffer();
      PropertyUtil.getMountSHSXString(var1, var2, var3, false);
      this.av.setTextSize(var3.toString(), 200);
      this.ba.getVerticalScrollBar().setMaximum(this.av.getHeight());
      this.ba.getVerticalScrollBar().setValue(2 + 18 * Math.max(0, var2.getMountSHByindex(var1).getLvl() - 1));
      var3.setLength(0);
      PropertyUtil.getMountSHSXString(var1, var2, var3, true);
      this.am.setTextSize(var3.toString(), 200);
      this.ab.getVerticalScrollBar().setMaximum(this.am.getHeight());
      this.ab.getVerticalScrollBar().setValue(0);
      BaseMountSH var4 = var2.getMountSHByindex(var1);

      int var5;
      for (int var10000 = var5 = 0; var10000 < this.az.length; var10000 = var5) {
         Class39 var6 = this.az[var5];
         boolean var10001;
         BaseMountSH var10002;
         if (var5 < var4.getUnlock()) {
            var10001 = true;
            var10002 = var4;
         } else {
            var10001 = false;
            var10002 = var4;
         }

         var5++;
         var6.acx(var10001, var10002, var2);
      }
   }
}
