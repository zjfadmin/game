package com.xy.a.v;

import com.xy.readbean.Activity;
import com.xy.scene.BWDHTeam;
import com.xy.socket.Agreement;
import java.awt.Dimension;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComponent;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;

public class Class45 extends com.xy.q.Class30 {
   private List<Class17> lo;
   private JComponent ahn;
   private long qb;
   private com.xy.w.Class18 co;
   private com.xy.w.Class18 nn;
   private List<com.xy.w.Class18> wq;
   private Class27 apj;
   private List<com.xy.i.Class22> iv;
   private JScrollPane l;

   public void fm(List<BWDHTeam> var1) {
      int var2 = 2;
      int var3 = 0;
      int var4 = 0;
      int var5 = 0;
      int var6 = 0;
      int var7 = 0;

      int var8;
      for (int var10000 = var8 = 0; var10000 < var1.size(); var4++) {
         BWDHTeam var9;
         if ((var9 = var1.get(var8)).getFlag() != var7) {
            var6 = 0;
            var7 = var9.getFlag();
            if (var2 != 2) {
               com.xy.w.Class18 var17 = this.ahq(var5);
               var2 += 53;
               var2 += 18;
               var17.setBounds(1, var2, 542, 2);
               var5++;
            }

            Class17 var18 = this.ahr(var3);
            int var26 = var2;
            var2 += 48;
            var18.cc(var7, var26);
            var3++;
         }

         com.xy.i.Class22 var10 = this.ahs(var4);
         var10.setName(String.valueOf(var9.getId()));
         var10.setText(var9.getName());
         if (var7 == 8 || var7 == 7 || var7 == 6 || var7 == 5) {
            var10.setBounds(215, var2, 107, 35);
         } else if (var6 >= 4) {
            var6 = 0;
            var2 += 46;
            var10.setBounds(145 * var6, var2, 107, 35);
         } else {
            var10.setBounds(145 * var6, var2, 107, 35);
         }

         var6++;
         var10000 = ++var8;
      }

      if (var1.size() > 0) {
         com.xy.w.Class18 var19 = this.ahq(var5);
         var2 += 53;
         var2 += 2;
         var19.setBounds(1, var2, 542, 2);
         var5++;
      }

      for (int var20 = var8 = var3; var20 < this.lo.size(); var20 = var8) {
         Object var21 = this.lo.get(var8);
         var8++;
         ((Class17)var21).setVisible(false);
      }

      for (int var22 = var8 = var4; var22 < this.iv.size(); var22 = var8) {
         Object var23 = this.iv.get(var8);
         var8++;
         ((com.xy.i.Class22)var23).setVisible(false);
      }

      for (int var24 = var8 = var5; var24 < this.wq.size(); var24 = var8) {
         Object var25 = this.wq.get(var8);
         var8++;
         ((com.xy.w.Class18)var25).setVisible(false);
      }

      this.ahn.setPreferredSize(new Dimension(543, var2));
      JScrollBar var16 = this.l.getVerticalScrollBar();
      var16.setMaximum(this.ahn.getHeight());
      var16.setValue(0);
   }

   public Class45(Class27 var1) {
      super(-1, -1, com.xy.q.Class30.agf, var1.afx);
      this.yy(0, 0, 718, 526, com.xy.q.Class30.agf);
      this.apj = var1;
      this.lo = new ArrayList<>();
      this.iv = new ArrayList<>();
      this.wq = new ArrayList<>();
      this.ahn = new Class18(this);
      this.l = com.xy.q.Class1.g(77, 76, 566, 372, this.ahn, 20);
      JScrollBar var10002 = this.l.getVerticalScrollBar();
      String var10005 = "].\u0001)\u0001|\u001e{\u0000=@*";
      var10002.setUI(new com.xy.v.Class13(com.xy.w.Class16.m("sc/d/106.png", 3, 3, 3, 3, false), 8));
      this.add(this.l);
      String var10007 = "t\u000b(\f(Y7])\u0018i\u000f";
      this.co = new com.xy.w.Class18(com.xy.w.Class16.m("sc/d/105.png", 3, 3, 3, 3, false));
      this.co.setBounds(636, 76, 6, 370);
      this.add(this.co);
      String var10008 = "].\u0001)\u0001|\u001d\u007f\u0000=@*";
      this.nn = new com.xy.w.Class18(com.xy.w.Class16.m("sc/d/132.png", 50, 50, 50, 50, false));
      this.nn.setBounds(41, 58, 615, 406);
      this.add(this.nn);
   }

   public com.xy.w.Class18 ahq(int var1) {
      if (var1 < this.wq.size()) {
         return this.wq.get(var1);
      } else {
         String var10002 = ">MbJb\u0018{\u0000=@*";
         com.xy.w.Class18 var2 = new com.xy.w.Class18(com.xy.w.Class16.m("sc/d/66.png", 50, 1, 50, 1, false));
         this.wq.add(var2);
         this.ahn.add(var2);
         return var2;
      }
   }

   public void h() {
      if (com.xy.v.Class22.f() - this.qb >= com.xy.v.Class22.h * 5) {
         this.qb = com.xy.v.Class22.f();
         Activity var1 = this.apj.wg();
         StringBuilder var10002 = new StringBuilder(String.valueOf(var1.getId()));
         String var10003 = "{8";
         String var2 = Agreement.getSendTextAES("activity", var10002.append("|P").toString());
         this.za().k(var2);
      }
   }

   public void g(int var1) {
      Activity var2 = this.apj.wg();
      StringBuilder var10002 = new StringBuilder(String.valueOf(var2.getId()));
      String var10003 = "R9";
      String var3 = Agreement.getSendTextAES("activity", var10002.append("|t").append(var1).toString());
      this.za().k(var3);
   }

   public Class17 ahr(int var1) {
      if (var1 < this.lo.size()) {
         return this.lo.get(var1);
      } else {
         Class17 var2 = new Class17(this);
         this.lo.add(var2);
         this.ahn.add(var2);
         return var2;
      }
   }

   public com.xy.i.Class22 ahs(int var1) {
      if (var1 < this.iv.size()) {
         return this.iv.get(var1);
      } else {
         String var10002 = "t\u000b(\r(Y1[)\u0018i\u000f";
         com.xy.i.Class22 var2 = new com.xy.i.Class22("sc/e/163.png", 1, 151, com.xy.q.Class49.w, com.xy.q.Class49.bv, "", this);
         this.iv.add(var2);
         this.ahn.add(var2);
         return var2;
      }
   }
}
