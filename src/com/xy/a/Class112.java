package com.xy.a;

import com.xy.text.GameView;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.plaf.basic.BasicTreeUI;
import javax.swing.tree.DefaultMutableTreeNode;

public class Class112 extends com.xy.q.Class30 {
   private com.xy.w.Class18[] aw;
   private JTree aov;
   private JLabel[] ay;
   private JScrollPane jo;
   private DefaultMutableTreeNode aow;
   private JScrollPane l;

   // $VF: synthetic method
   static JScrollPane agx(Class112 var0) {
      return var0.l;
   }

   public Class112(GameView var1) {
      super(68, 2, com.xy.q.Class30.afz, var1);
      String var10003 = "aa=f=3<r|e";
      this.yy(-2, 0, 579, 397, com.xy.q.Class30.agh);
      com.xy.w.Class9 var18 = com.xy.w.Class16.m("sc/d/1.png", 68, 68, 68, 68, false);
      String var10004 = "旗戃彲宴";
      this.yu(var18, "新手引导");
      this.ay = new JLabel[2];

      int var2;
      for (int var10000 = var2 = 0; var10000 < this.ay.length; var10000 = var2) {
         this.ay[var2] = com.xy.q.Class1.f(0, 0, 0, 0, var2 == 0 ? 10 : 0, Color.white, com.xy.q.Class49.ch);
         JLabel var5 = this.ay[var2];
         String var9;
         if (var2 == 0) {
            var9 = "玻泗仙经";
            var9 = "玩法介绍";
         } else if (var2 == 1) {
            var9 = "讓晆";
            var9 = "说明";
         } else {
            var9 = "";
         }

         var5.setText(var9);
         Class112 var6;
         if (var2 == 0) {
            var6 = this;
            this.ay[var2].setBounds(42, 24, 220, 21);
         } else {
            if (var2 == 1) {
               this.ay[var2].setBounds(264, 24, 290, 21);
            }

            var6 = this;
         }

         var6.add(this.ay[var2++]);
      }

      this.aow = new DefaultMutableTreeNode("");
      com.xy.v.Class7.a(this.aow, this.yt());
      this.aov = new JTree(this.aow);
      this.aov.setOpaque(false);
      String var12 = "HFpwg<n{lwQf{~g";
      var10003 = ")'\t-";
      this.aov.putClientProperty("JTree.lineStyle", "None");
      ((BasicTreeUI)this.aov.getUI()).setLeftChildIndent(0);
      Class33 var4 = new Class33(this);
      var4.setLeafIcon(null);
      var4.setOpenIcon(com.xy.q.Class47.arm);
      var4.setClosedIcon(com.xy.q.Class47.arp);
      var4.setBackgroundNonSelectionColor(com.xy.q.Class49.bk);
      var4.setBackgroundSelectionColor(new Color(99, 93, 90));
      var4.setBorderSelectionColor(com.xy.q.Class49.bk);
      var4.setTextNonSelectionColor(Color.white);
      var4.setTextSelectionColor(Color.white);
      this.aov.setCellRenderer(var4);
      this.aov.setRootVisible(false);
      this.aov.setRowHeight(25);
      this.aov.addMouseListener(new Class62(this));
      this.aov.addTreeSelectionListener(new Class60(this));
      this.jo = com.xy.q.Class1.g(43, 45, 220, 328, this.aov, -1);
      this.add(this.jo);
      this.l = com.xy.q.Class1.g(266, 45, 290, 328, null, 50);
      this.add(this.l);
      this.aw = new com.xy.w.Class18[4];

      int var3;
      for (int var7 = var3 = 0; var7 < this.aw.length; var7 = var3) {
         this.aw[var3] = new com.xy.w.Class18();
         Class112 var8;
         if (var3 == 0) {
            var8 = this;
            com.xy.w.Class18 var13 = this.aw[var3];
            var10003 = "qq-v- 7<r|e";
            var13.mt(com.xy.w.Class16.m("sc/d/25.png", 2, 2, 2, 2, false));
            this.aw[var3].setBounds(42, 24, 220, 21);
         } else if (var3 == 1) {
            var8 = this;
            com.xy.w.Class18 var14 = this.aw[var3];
            var10003 = ";\u0004g\u0003gU}I8\t/";
            var14.mt(com.xy.w.Class16.m("sc/d/25.png", 2, 2, 2, 2, false));
            this.aw[var3].setBounds(264, 24, 290, 21);
         } else if (var3 == 2) {
            var8 = this;
            com.xy.w.Class18 var15 = this.aw[var3];
            var10003 = "qq-v- 6<r|e";
            var15.mt(com.xy.w.Class16.m("sc/d/24.png", 2, 2, 2, 2, false));
            this.aw[var3].setBounds(42, 24, 220, 350);
         } else {
            if (var3 == 3) {
               com.xy.w.Class18 var11 = this.aw[var3];
               var12 = ";\u0004g\u0003gU|I8\t/";
               var11.mt(com.xy.w.Class16.m("sc/d/24.png", 2, 2, 2, 2, false));
               this.aw[var3].setBounds(264, 24, 290, 350);
            }

            var8 = this;
         }

         var8.add(this.aw[var3++]);
      }
   }

   // $VF: synthetic method
   static JTree agy(Class112 var0) {
      return var0.aov;
   }
}
