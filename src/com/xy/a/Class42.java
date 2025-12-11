package com.xy.a;

import com.xy.readbean.AllFM;
import com.xy.readbean.FM;
import com.xy.richtext.RichLabel;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JScrollPane;

class Class42 extends JComponent {
   private RichLabel to;
   private FM tp;
   // $VF: synthetic field
   final Class44 tq;
   private com.xy.q.Class14[] fa;
   private JLabel[] ch;
   private com.xy.w.Class18[] aw;
   private List<com.xy.q.Class54> tr;
   private com.xy.i.Class18[] ts;
   private JScrollPane jo;
   private int eg;
   private com.xy.w.Class0 tt;

   public void nv(FM var1) {
      this.tp = var1;
      JLabel var10004 = this.ch[0];
      String var10007 = "\u0013B[GC\u0014";
      StringBuilder var10005 = new StringBuilder("<html>").append(var1.getFmName());
      String var10006 = "GX\u0013\u0003\u0016\u001bE";
      var10004.setText(var10005.append("</html>").toString());
      this.ch[1].setText(String.valueOf(var1.getFmLvl()));
      this.fa[1].setText(String.valueOf(var1.getFmLvl()));
      this.tt = com.xy.w.Class11.t(var1.getFmSkin(), 7, 1, null);
      StringBuffer var2 = new StringBuffer();
      if (var1.getFmMsg1() != null) {
         var2.append(var1.getFmMsg1());
      }

      if (var1.getFmMsg2() != null) {
         String var10001 = "\fX";
         var2.append("#r");
         var2.append(var1.getFmMsg2());
      }

      this.to.setTextSize(var2.toString(), 190);
   }

   // $VF: synthetic method
   static int nw(Class42 var0) {
      return var0.eg;
   }

   public Class42(Class44 var1) {
      this.tq = var1;
      this.eg = -1;
      this.ts = new com.xy.i.Class18[2];

      int var2;
      for (int var10000 = var2 = 0; var10000 < this.ts.length; var10000 = var2) {
         com.xy.i.Class18[] var6 = this.ts;
         String var30;
         if (var2 == 0) {
            var30 = "\b\u0014T\u0012TCIY\u000b\u0019\u001c";
            var30 = "sc/e/42.png";
         } else {
            var30 = "YL\u0005J\u0005\u001b\u0019\u0001ZAM";
            var30 = "sc/e/43.png";
         }

         com.xy.i.Class18 var10001 = new com.xy.i.Class18(var30, 1, 311 + var2, var1.eg());
         var6[var2] = var10001;
         this.ts[var2].setBounds(109 + 154 * var2, 425, 18, 18);
         this.add(this.ts[var2++]);
      }

      this.ch = new JLabel[4];

      for (int var7 = var2 = 0; var7 < this.ch.length; var7 = var2) {
         this.ch[var2] = com.xy.q.Class1.k(366, 70, 18, 100, Color.white, com.xy.q.Class49.ck);
         JLabel var8 = this.ch[var2];
         String var15;
         if (var2 == 2) {
            var15 = "册朻菀忬";
            var15 = "击杀获得";
         } else if (var2 == 3) {
            var15 = "秀刬";
            var15 = "积分";
         } else {
            var15 = "";
         }

         var8.setText(var15);
         this.ch[var2].setHorizontalAlignment(0);
         Class42 var9;
         if (var2 == 1) {
            var9 = this;
            this.ch[var2].setFont(com.xy.q.Class49.ac);
            this.ch[var2].setBounds(542, 93, 41, 15);
         } else if (var2 == 2) {
            var9 = this;
            this.ch[var2].setFont(com.xy.q.Class49.bz);
            this.ch[var2].setBounds(393, 213, 60, 18);
            this.ch[var2].setForeground(Color.red);
            this.ch[var2].setHorizontalAlignment(4);
         } else {
            if (var2 == 3) {
               this.ch[var2].setFont(com.xy.q.Class49.bz);
               this.ch[var2].setBounds(522, 213, 60, 18);
               this.ch[var2].setForeground(Color.red);
               this.ch[var2].setHorizontalAlignment(10);
            }

            var9 = this;
         }

         var9.add(this.ch[var2++]);
      }

      this.fa = new com.xy.q.Class14[2];

      for (int var10 = var2 = 0; var10 < this.fa.length; var10 = var2) {
         this.fa[var2] = com.xy.q.Class1.i(133, 425, 124, 19, 0, Color.white, com.xy.q.Class49.w);
         com.xy.q.Class14 var11 = this.fa[var2];
         String var17 = "\b\u0014T\u0013TFLY\u000b\u0019\u001c";
         var11.mt(com.xy.w.Class16.m("sc/d/17.png", 6, 6, 6, 6, false));
         if (var2 == 1) {
            this.fa[var2].setBounds(457, 214, 60, 18);
         }

         this.add(this.fa[var2++]);
      }

      this.aw = new com.xy.w.Class18[5];

      for (int var12 = var2 = 0; var12 < this.aw.length; var12 = var2) {
         this.aw[var2] = new com.xy.w.Class18();
         Class42 var13;
         if (var2 == 0) {
            var13 = this;
            com.xy.w.Class18 var21 = this.aw[var2];
            String var10003 = "YL\u0005K\u0005\u001d\u001e\u0001ZAM";
            var21.mt(com.xy.w.Class16.m("sc/d/24.png", 2, 2, 2, 2, false));
            this.aw[var2].setBounds(43, 65, 305, 388);
         } else if (var2 == 1) {
            var13 = this;
            com.xy.w.Class18 var22 = this.aw[var2];
            String var27 = "\b\u0014T\u0013T@NY\u000b\u0019\u001c";
            var22.dp("sc/d/75.png");
            this.aw[var2].setBounds(361, 68, 28, 157);
         } else if (var2 == 2) {
            var13 = this;
            com.xy.w.Class18 var23 = this.aw[var2];
            String var28 = "YL\u0005K\u0005\u0018\u001c\u0001ZAM";
            var23.dp("sc/d/76.png");
            this.aw[var2].setBounds(542, 67, 42, 41);
         } else if (var2 == 3) {
            var13 = this;
            com.xy.w.Class18 var24 = this.aw[var2];
            String var29 = "\b\u0014T\u0013TDMY\u000b\u0019\u001c";
            var24.mt(com.xy.w.Class16.m("sc/d/36.png", 20, 20, 20, 20, false));
            this.aw[var2].setBounds(357, 65, 236, 172);
         } else {
            if (var2 == 4) {
               com.xy.w.Class18 var18 = this.aw[var2];
               String var25 = "YL\u0005K\u0005\u001d\u001e\u0001ZAM";
               var18.mt(com.xy.w.Class16.m("sc/d/24.png", 2, 2, 2, 2, false));
               this.aw[var2].setBounds(357, 239, 236, 213);
            }

            var13 = this;
         }

         var13.add(this.aw[var2++]);
      }

      this.tr = new ArrayList<>();
      this.to = new RichLabel("", com.xy.q.Class49.ac);
      this.jo = com.xy.q.Class1.g(362, 240, 235, 214, this.to, 20);
      this.add(this.jo);
      this.setBounds(0, 0, 620, 479);
   }

   // $VF: synthetic method
   static FM nx(Class42 var0) {
      return var0.tp;
   }

   public void n(int var1) {
      AllFM var2;
      if ((var2 = this.tq.yt().r()) != null) {
         List var3 = var2.getFmType();
         var1 = var1 < 0 ? 0 : (var1 < var3.size() ? var1 : var3.size() - 1);
         if (var1 != this.eg) {
            this.eg = var1;
            String var4 = (String)var3.get(this.eg);
            this.fa[0].setText(var4);
            List var5 = var2.getAllList();
            int var6 = 0;

            int var7;
            for (int var10000 = var7 = 0; var10000 < var5.size(); var10000 = ++var7) {
               FM var8;
               if ((var8 = (FM)var5.get(var7)).getFmType().equals(var4)) {
                  Object var9 = null;
                  Object var13;
                  if (var7 < this.tr.size()) {
                     var13 = var9 = this.tr.get(var7);
                  } else {
                     var9 = new Class86(this, this.tq.eg());
                     var13 = var9;
                     String var10007 = "\b\u0014T\u0013TBJY\u000b\u0019\u001c";
                     ((com.xy.q.Class54)var9).dq("sc/d/51.png");
                     ((com.xy.q.Class54)var9).wp(com.xy.q.Class54.atw);
                     ((com.xy.q.Class54)var9).setBounds(62 + var6 % 5 * 55, 78 + var6 / 5 * 55, 45, 45);
                     this.add((Component)var9, 0);
                     this.tr.add((com.xy.q.Class54)var9);
                  }

                  ((com.xy.q.Class54)var13).gs(0, var8);
                  String var10003 = var8.getFmHead();
                  var6++;
                  ((com.xy.q.Class54)var9).dp(com.xy.w.Class15.l(var10003));
                  ((com.xy.q.Class54)var9).setVisible(true);
               }
            }

            for (int var14 = var7 = this.tr.size() - 1; var14 >= var6; var14 = var7) {
               this.remove(this.tr.get(var7));
               this.tr.remove(var7--);
            }
         }
      }
   }

   // $VF: synthetic method
   static void ny(Class42 var0, com.xy.w.Class0 var1) {
      var0.tt = var1;
   }

   // $VF: synthetic method
   static com.xy.w.Class0 nz(Class42 var0) {
      return var0.tt;
   }

   @Override
   protected void paintChildren(Graphics var1) {
      super.paintChildren(var1);
      if (this.tt != null) {
         this.tt.r(var1, 486, 202, 0, com.xy.v.Class22.l());
      }
   }
}
