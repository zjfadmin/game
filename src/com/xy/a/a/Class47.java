package com.xy.a.a;

import com.xy.bean.ConfirmBean;
import com.xy.formula.BaseMountSH;
import com.xy.formula.PropertyUtil;
import com.xy.game.RoleData;
import com.xy.readbean.Goodstable;
import com.xy.readbean.MoneyType;
import com.xy.richtext.RichLabel;
import com.xy.text.GameView;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;

public class Class47 extends com.xy.q.Class50 {
   private com.xy.q.Class52 agw;
   private RichLabel to;
   private MoneyType yj;
   private Class27 ane;
   private JScrollPane rf;
   private com.xy.a.i.Class12 anf;
   private JLabel[] ap;
   private RichLabel h;
   private JScrollPane i;
   private com.xy.i.Class4[] ly;
   private com.xy.w.Class18[] fp;
   private Class49[] ang;

   // $VF: synthetic method
   static Class27 agp(Class47 var0) {
      return var0.ane;
   }

   public void be(boolean var1) {
      if (this.anf != null) {
         if (var1) {
            this.anf.setBounds(312, 85, 330, 150);
         }

         this.anf.setVisible(var1);
      }
   }

   public void n(int var1) {
      if (this.anf == null) {
         this.anf = new com.xy.a.i.Class12(this.ane);
         this.anf.ne.ol(108L);
         this.anf.nd = var1;
         this.add(this.anf, 0);
         this.be(true);
      } else {
         this.anf.nd = var1;
         this.be(!this.anf.isVisible());
      }
   }

   public void am(RoleData var1) {
      StringBuffer var2 = new StringBuffer();
      PropertyUtil.getMountSHZTString(var1, var2, false);
      this.to.setTextSize(var2.toString(), 200);
      this.rf.getVerticalScrollBar().setMaximum(this.to.getHeight());
      this.rf.getVerticalScrollBar().setValue(2 + 18 * Math.max(0, var1.getMountSHByindex(0).getLvl() - 1));
      var2.setLength(0);
      PropertyUtil.getMountSHZTString(var1, var2, true);
      this.h.setTextSize(var2.toString(), 200);
      this.i.getVerticalScrollBar().setMaximum(this.h.getHeight());
      this.i.getVerticalScrollBar().setValue(0);
      BaseMountSH var3 = var1.getMountSHByindex(0);

      int var4;
      for (int var10000 = var4 = 0; var10000 < this.ang.length; var10000 = var4) {
         Class49 var5 = this.ang[var4];
         boolean var10001;
         BaseMountSH var10002;
         if (var4 < var3.getUnlock()) {
            var10001 = true;
            var10002 = var3;
         } else {
            var10001 = false;
            var10002 = var3;
         }

         var4++;
         var5.acx(var10001, var10002, var1);
      }
   }

   public Class47(Class27 var1) {
      this.ane = var1;
      this.ap = new JLabel[3];

      int var2;
      for (int var10000 = var2 = 0; var10000 < this.ap.length; var10000 = var2) {
         Color var10006;
         int var10007;
         if (var2 == 0) {
            var10006 = Color.black;
            var10007 = var2;
         } else {
            String var27 = "CW#w#\u0004Yr";
            var10006 = com.xy.q.Class49.c("#cCCC09F");
            var10007 = var2;
         }

         this.ap[var2] = com.xy.q.Class1.k(545, 25, 72, 19, var10006, var10007 == 0 ? com.xy.q.Class49.ch : com.xy.q.Class49.ao);
         JLabel var6 = this.ap[var2];
         String var14;
         if (var2 == 0) {
            var14 = "宄拒乇屮";
            var14 = "守护之尘";
         } else if (var2 == 1) {
            var14 = "笩纓尾怓";
            var14 = "等级属性";
         } else if (var2 == 2) {
            var14 = "劬扦怷覾";
            var14 = "加成总览";
         } else {
            var14 = "";
         }

         var6.setText(var14);
         this.ap[var2].setHorizontalAlignment(0);
         if (var2 >= 1 && var2 <= 2) {
            this.ap[var2].setBounds(330 + 230 * (var2 - 1), 323, 76, 19);
         }

         this.add(this.ap[var2++]);
      }

      this.yj = new MoneyType();
      String var10009 = "寨抐丫尬";
      this.yj.setIdAndKey(0, "守护之尘");
      this.agw = com.xy.q.Class1.m(622, 25, 74, 19, 10, Color.white, com.xy.q.Class49.w, this.yj, var1.afx);
      String var10005 = "\u0005oYhY=A\"\u0006b\u0011";
      this.agw.mt(com.xy.w.Class16.m("sc/d/17.png", 3, 3, 3, 3, false));
      this.add(this.agw);
      this.to = new RichLabel("", com.xy.q.Class49.w);
      this.h = new RichLabel("", com.xy.q.Class49.w);
      this.rf = com.xy.q.Class1.g(270, 343, 205, 74, this.to, -1);
      this.i = com.xy.q.Class1.g(500, 343, 205, 74, this.h, -1);
      JScrollBar var28 = this.rf.getVerticalScrollBar();
      var10009 = "\u0013WOPO\u0005V\fND\u000eS";
      var28.setUI(new com.xy.v.Class13(com.xy.w.Class16.m("sc/d/168.png", 3, 3, 3, 3, false), 6));
      JScrollBar var26 = this.i.getVerticalScrollBar();
      String var10008 = "\u007f\u0015#\u0012#G:N\"\u0006b\u0011";
      var26.setUI(new com.xy.v.Class13(com.xy.w.Class16.m("sc/d/168.png", 3, 3, 3, 3, false), 6));
      this.add(this.rf);
      this.add(this.i);
      this.ly = new com.xy.i.Class4[2];

      for (int var7 = var2 = 0; var7 < this.ly.length; var7 = var2) {
         com.xy.i.Class4[] var8 = this.ly;
         String var24;
         if (var2 == 0) {
            var24 = "\u0013WOQO\u0005W\u0001ND\u000eS";
            var24 = "sc/e/175.png";
         } else {
            var24 = "\u007f\u0015#\u0013#G;@\"\u0006b\u0011";
            var24 = "sc/e/176.png";
         }

         com.xy.i.Class4 var17 = new com.xy.i.Class4(var24, 1, 192 + var2, var1);
         var8[var2] = var17;
         Class47 var9;
         if (var2 == 0) {
            var9 = this;
            this.ly[var2].setBounds(258, 281, 81, 26);
         } else {
            if (var2 == 1) {
               this.ly[var2].setBounds(615, 281, 81, 26);
            }

            var9 = this;
         }

         var9.add(this.ly[var2++]);
      }

      this.ang = new Class49[7];

      for (int var10 = var2 = 0; var10 < this.ang.length; var10 = var2) {
         this.ang[var2] = new Class49(this, var2);
         Class47 var11;
         if (var2 == 0) {
            var11 = this;
            this.ang[var2].setBounds(420, 66, 115, 92);
         } else if (var2 == 1) {
            var11 = this;
            this.ang[var2].setBounds(320, 82, 115, 92);
         } else if (var2 == 2) {
            var11 = this;
            this.ang[var2].setBounds(238, 138, 115, 92);
         } else if (var2 == 3) {
            var11 = this;
            this.ang[var2].setBounds(363, 199, 115, 92);
         } else if (var2 == 4) {
            var11 = this;
            this.ang[var2].setBounds(482, 199, 115, 92);
         } else if (var2 == 5) {
            var11 = this;
            this.ang[var2].setBounds(606, 138, 115, 92);
         } else {
            if (var2 == 6) {
               this.ang[var2].setBounds(520, 82, 115, 92);
            }

            var11 = this;
         }

         var11.add(this.ang[var2++]);
      }

      this.fp = new com.xy.w.Class18[4];

      for (int var12 = var2 = 0; var12 < this.fp.length; var12 = var2) {
         this.fp[var2] = new com.xy.w.Class18();
         Class47 var13;
         if (var2 >= 0 && var2 <= 1) {
            var13 = this;
            com.xy.w.Class18 var22 = this.fp[var2];
            String var10003 = "\u0013WOPO\u0005V\u0003ND\u000eS";
            var22.dp("sc/d/167.png");
            this.fp[var2].setBounds(267 + var2 * 230, 330, 195, 5);
         } else {
            if (var2 >= 2 && var2 <= 3) {
               com.xy.w.Class18 var18 = this.fp[var2];
               String var21 = "\u007f\u0015#\u0012#G:B\"\u0006b\u0011";
               var18.dp("sc/d/164.png");
               this.fp[var2].setBounds(258 + (var2 - 2) * 230, 317, 221, 123);
            }

            var13 = this;
         }

         var13.add(this.fp[var2++]);
      }

      this.setBounds(0, 0, 743, 519);
   }

   public void bb(Goodstable var1) {
      if (this.anf != null) {
         this.be(false);
         int var2 = (Integer)this.anf.nd;
         GameView var10000 = this.ane.afx;
         String var10006 = "3|8e";
         StringBuilder var10004 = new StringBuilder("SHXQ").append(var2);
         String var10005 = "\n";
         String var3 = var10004.append("|").append(var1.getRgid()).toString();
         var10005 = "Cc砎宮屦宼拄矇禛兑寨抐榝Ｋ";
         var10000.dm(new ConfirmBean(32, var3, "#W确定将守护石移入守护槽？"));
      }
   }
}
