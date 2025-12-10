package com.xy;

import com.xy.richtext.RichLabel;
import com.xy.text.GameView;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.Icon;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.SwingUtilities;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.plaf.basic.BasicTreeUI;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeCellRenderer;
import javax.swing.tree.TreePath;

public class Class81 extends Class345 {
   private DefaultMutableTreeNode ed;
   private Class436[] pv;
   private JScrollPane fe;
   private JTree zf;
   private JLabel[] ly;
   private JScrollPane af;

   public Class81(GameView var1) {
      int var10001 = --2;
      int var10005 = -2 & -1;
      super(108 & 87, 1 ^ 3, Class345.aef, var1);
      this.va(var10005, 3 ^ 3, 16195 & 17151, 28669 & 4495, Class345.aeo);
      this.uv(Class511.q("sc/d/1.png", 84 & 111, 84 & 111, 84 & 111, 84 & 111, (boolean)(5 >> 3)), "新手引导");
      JLabel[] var5 = new JLabel[var10001];
      boolean var10003 = true;
      this.ly = var5;

      int var10000;
      int var2;
      Class81 var4;
      for(var10000 = var2 = 3 >> 2; var10000 < this.ly.length; var10000 = var2) {
         this.ly[var2] = Class133.c(3 ^ 3, 3 ^ 3, 3 ^ 3, 3 ^ 3, var2 == 0 ? 26 & 111 : 0, Color.white, Class681.ak);
         this.ly[var2].setText(var2 == 0 ? "玩法介绍" : (var2 == --1 ? "说明" : ""));
         if (var2 == 0) {
            var4 = this;
            this.ly[var2].setBounds(47 & 122, 62 & 89, 5854 & 27133, 31 & 117);
         } else {
            if (var2 == 3 >> 1) {
               this.ly[var2].setBounds(9192 & 23839, 27 & 124, 28463 & 4594, 55 & 93);
            }

            var4 = this;
         }

         var4.add(this.ly[var2++]);
      }

      this.ed = new DefaultMutableTreeNode("");
      Class375.a(this.ed, this.vc());
      this.zf = new JTree(this.ed);
      this.zf.setOpaque((boolean)(3 >> 2));
      this.zf.putClientProperty("JTree.lineStyle", "None");
      ((BasicTreeUI)this.zf.getUI()).setLeftChildIndent(5 >> 3);
      DefaultTreeCellRenderer var3 = new DefaultTreeCellRenderer() {
         Color wm = new Color(2303 & 30701, 29179 & 3822, 3 >> 2);

         public Component getTreeCellRendererComponent(JTree var1, Object var2, boolean var3, boolean var4, boolean var5, int var6, boolean var7) {
            DefaultMutableTreeNode var8;
            DefaultMutableTreeNode var10000 = var8 = (DefaultMutableTreeNode)var2;
            super.getTreeCellRendererComponent(var1, var2, var3, var4, var5, var6, var7);
            if (var10000.getLevel() == 5 >> 2) {
               this.setForeground(this.wm);
               this.setFont(Class681.ce);
            }

            if (var8.getLevel() == (1 ^ 3)) {
               this.setFont(Class681.ce);
            }

            return this;
         }
      };
      var3.setLeafIcon((Icon)null);
      var3.setOpenIcon(Class512.azt);
      var3.setClosedIcon(Class512.azr);
      var3.setBackgroundNonSelectionColor(Class681.cu);
      var3.setBackgroundSelectionColor(new Color(119 & 107, 125 & 95, 90));
      var3.setBorderSelectionColor(Class681.cu);
      var3.setTextNonSelectionColor(Color.white);
      var3.setTextSelectionColor(Color.white);
      this.zf.setCellRenderer(var3);
      this.zf.setRootVisible((boolean)(3 & 4));
      this.zf.setRowHeight(25);
      this.zf.addMouseListener(new MouseAdapter() {
         public void mousePressed(MouseEvent var1) {
            TreePath var2;
            if (SwingUtilities.isLeftMouseButton(var1) && (var2 = Class81.this.zf.getSelectionPath()) != null) {
               if (Class81.this.zf.isExpanded(var2)) {
                  Class81.this.zf.collapsePath(var2);
                  return;
               }

               Class81.this.zf.expandPath(var2);
            }

         }
      });
      this.zf.addTreeSelectionListener(new TreeSelectionListener() {
         public void valueChanged(TreeSelectionEvent var1) {
            DefaultMutableTreeNode var6;
            if ((var6 = (DefaultMutableTreeNode)((JTree)var1.getSource()).getLastSelectedPathComponent()) == null) {
               Class81.this.af.setViewportView((Component)null);
            } else {
               RichLabel var10000;
               String var2;
               String var3;
               RichLabel var4;
               Dimension var5;
               if (!(var2 = var6.toString()).equals("游戏介绍") && !var2.equals("充值比例") && !var2.equals("版本特色") && !var2.equals("功能介绍")) {
                  if (var6.isLeaf()) {
                     Class81.this.af.setViewportView((Component)null);
                     if ((var3 = Class375.c(var2, Class81.this.vc())) != null) {
                        var10000 = var4 = new RichLabel(var3, Class681.bm);
                        var10000.setSize(var5 = var10000.computeSize(18939 & 14078));
                        var10000.setPreferredSize(var5);
                        Class81.this.af.setViewportView(var4);
                     }
                  } else {
                     Class81.this.af.setViewportView((Component)null);
                     if ((var3 = Class375.d(var2)) != null) {
                        var10000 = var4 = new RichLabel(var3, Class681.bm);
                        var10000.setSize(var5 = var10000.computeSize(1531 & 31486));
                        var10000.setPreferredSize(var5);
                        Class81.this.af.setViewportView(var4);
                     }
                  }
               } else {
                  Class81.this.af.setViewportView((Component)null);
                  if ((var3 = Class375.d(var2)) != null) {
                     var10000 = var4 = new RichLabel(var3, Class681.bm);
                     var10000.setSize(var5 = var10000.computeSize(22014 & 11003));
                     var10000.setPreferredSize(var5);
                     Class81.this.af.setViewportView(var4);
                  }
               }
            }
         }
      });
      this.fe = Class133.f(43, 45, 220, 328, this.zf, -4 >> 2);
      this.add(this.fe);
      this.af = Class133.f(266, 45, 290, 328, (Component)null, 50);
      this.add(this.af);
      Class436[] var6 = new Class436[--4];
      var10003 = true;
      this.pv = var6;

      for(var10000 = var2 = 5 >> 3; var10000 < this.pv.length; var10000 = var2) {
         this.pv[var2] = new Class436();
         if (var2 == 0) {
            var4 = this;
            this.pv[var2].eq(Class511.q("sc/d/25.png", 1 ^ 3, 1 ^ 3, 1 ^ 3, 1 ^ 3, (boolean)(2 & 5)));
            this.pv[var2].setBounds(42, 24, 220, 21);
         } else if (var2 == --1) {
            var4 = this;
            this.pv[var2].eq(Class511.q("sc/d/25.png", --2, --2, --2, --2, (boolean)(3 ^ 3)));
            this.pv[var2].setBounds(264, 24, 290, 21);
         } else if (var2 == (1 ^ 3)) {
            var4 = this;
            this.pv[var2].eq(Class511.q("sc/d/24.png", 5 >> 1, 5 >> 1, 5 >> 1, 5 >> 1, (boolean)(2 & 5)));
            this.pv[var2].setBounds(42, 24, 220, 350);
         } else {
            if (var2 == --3) {
               this.pv[var2].eq(Class511.q("sc/d/24.png", 1 ^ 3, 1 ^ 3, 1 ^ 3, 1 ^ 3, (boolean)(5 >> 3)));
               this.pv[var2].setBounds(264, 24, 290, 350);
            }

            var4 = this;
         }

         var4.add(this.pv[var2++]);
      }

   }
}
