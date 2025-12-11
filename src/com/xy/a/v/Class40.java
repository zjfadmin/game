package com.xy.a.v;

import com.xy.q.Class60;
import com.xy.scene.BWDHRuleBattleRecord;
import java.awt.Color;
import java.awt.Dimension;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;

class Class40 extends com.xy.q.Class50 {
   private com.xy.q.Class44 akn;
   private JLabel[] r;
   private JScrollPane i;
   private List<Class32> eq;
   private JComponent qe;
   // $VF: synthetic field
   final Class23 ako;

   // $VF: synthetic method
   static com.xy.q.Class44 acu(Class40 var0) {
      return var0.akn;
   }

   public Class40(Class23 var1) {
      this.ako = var1;
      this.akn = new com.xy.q.Class44(2, 100, var1.eg());
      this.akn.rm(true);
      this.akn.zb(550, 71, 100, 19);
      String var10010 = "\u000bB开拖佷贯";
      this.akn.afo(new Class60("16强抢位赛", 0));
      String var10009 = "d彰拾伇贇";
      this.akn.afo(new Class60("8强抢位赛", 1));
      String var10008 = "@开拖佷贯";
      this.akn.afo(new Class60("4强抢位赛", 2));
      JLabel var10004 = this.akn.en();
      String var10005 = "{j彰拾伇贇";
      var10004.setText("16强抢位赛");
      this.add(this.akn);
      this.r = new JLabel[4];

      int var2;
      for (int var10000 = var2 = 0; var10000 < this.r.length; var10000 = var2) {
         this.r[var2] = com.xy.q.Class1.k(48, 95, 145, 21, Color.white, com.xy.q.Class49.ch);
         JLabel var3 = this.r[var2];
         String var5;
         if (var2 == 0) {
            var5 = "毮贯";
            var5 = "比赛";
         } else if (var2 == 1) {
            var5 = "害险";
            var5 = "对阵";
         } else if (var2 == 2) {
            var5 = "阥佹";
            var5 = "队伍";
         } else if (var2 == 3) {
            var5 = "覈睗";
            var5 = "观看";
         } else {
            var5 = "";
         }

         var3.setText(var5);
         this.r[var2].setHorizontalAlignment(0);
         Class40 var4;
         if (var2 == 1) {
            var4 = this;
            this.r[var2].setBounds(193, 95, 245, 21);
         } else if (var2 == 2) {
            var4 = this;
            this.r[var2].setBounds(467, 95, 61, 21);
         } else {
            if (var2 == 3) {
               this.r[var2].setBounds(555, 95, 61, 21);
            }

            var4 = this;
         }

         var4.add(this.r[var2++]);
      }

      this.qe = new Class1(this);
      this.i = com.xy.q.Class1.g(50, 118, 593, 336, this.qe, 20);
      JScrollBar var9 = this.i.getVerticalScrollBar();
      var10005 = "I\u0017\u0015\u0010\u0015E\nB\u0014\u0004T\u0013";
      var9.setUI(new com.xy.v.Class13(com.xy.w.Class16.m("sc/d/106.png", 3, 3, 3, 3, false), 8));
      this.add(this.i);
      this.eq = new ArrayList<>();
   }

   public void acv(BWDHRuleBattleRecord[] var1) {
      int var2;
      for (int var10000 = var2 = 0; var10000 < var1.length; var10000 = var2) {
         Class32 var3 = var2 < this.eq.size() ? this.eq.get(var2) : null;
         if (var3 == null) {
            var3 = new Class32(this.ako);
            this.eq.add(var3);
            this.qe.add(var3);
         }

         var3.yf(var1[var2]);
         int var10004 = 42 * var2;
         var2++;
         var3.setBounds(0, var10004, 580, 42);
         var3.setVisible(true);
      }

      for (int var6 = var2 = var1.length; var6 < this.eq.size(); var6 = var2) {
         Object var7 = this.eq.get(var2);
         var2++;
         ((Class32)var7).setVisible(false);
      }

      this.qe.setPreferredSize(new Dimension(580, 42 * var1.length));
      JScrollBar var5 = this.i.getVerticalScrollBar();
      var5.setMaximum(this.qe.getHeight());
      var5.setValue(0);
   }
}
