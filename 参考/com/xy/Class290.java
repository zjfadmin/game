package com.xy;

import com.xy.bean.StallNeedBean;
import com.xy.readbean.AllStallBuy;
import com.xy.readbean.StallBuyData;
import com.xy.readbean.StallBuyMenu;
import java.awt.Color;
import java.awt.Component;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.Icon;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.SwingUtilities;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.plaf.basic.BasicTreeUI;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeCellRenderer;
import javax.swing.tree.TreePath;

public class Class290 implements TreeSelectionListener, MouseListener {
   private Class345 afa;
   private DefaultMutableTreeNode afb;
   private JTree afc;
   private JScrollPane af;

   public void cc() {
      TreePath var1;
      if ((var1 = this.afc.getSelectionPath()) != null) {
         if (this.afc.isExpanded(var1)) {
            this.afc.collapsePath(var1);
            return;
         }

         this.afc.expandPath(var1);
      }

   }

   public void mouseClicked(MouseEvent var1) {
      if (SwingUtilities.isLeftMouseButton(var1)) {
         this.cc();
      }

   }

   public void vj(StallBuyMenu var1, Class668 var2, AllStallBuy var3) {
      Iterator var5;
      Iterator var10000;
      if (var1.getMenuList() != null) {
         var10000 = var5 = var1.getMenuList().iterator();

         while(var10000.hasNext()) {
            StallBuyMenu var4 = (StallBuyMenu)var5.next();
            Class668 var6 = new Class668(var4);
            var10000 = var5;
            this.vj(var4, var6, var3);
            var2.add(var6);
         }
      }

      if (var1.getMenuList() != null && var1.getPointList() != null) {
         Point var9;
         int var10;
         for(var10000 = var5 = var1.getPointList().iterator(); var10000.hasNext(); var10000 = var5) {
            for(int var11 = var10 = (var9 = (Point)var5.next()).x; var11 <= var9.y; var11 = var10) {
               StallBuyData var7 = (StallBuyData)var3.getBuyDataMap().get(var10);
               Class668 var8 = new Class668(var7);
               ++var10;
               var2.add(var8);
            }
         }
      }

   }

   public void fx(String var1) {
      this.afb.removeAllChildren();
      AllStallBuy var2;
      if ((var2 = this.afa.vc().bn()) == null) {
         this.afc.updateUI();
      } else {
         ArrayList var3 = null;
         Iterator var4;
         Iterator var10000 = var4 = var2.getBuyDataMap().values().iterator();

         while(true) {
            int var11;
            label51:
            while(var10000.hasNext()) {
               StallBuyData var7;
               if ((var7 = (StallBuyData)var4.next()).getName().indexOf(var1) == -4 >> 2) {
                  var10000 = var4;
               } else {
                  if (var3 == null) {
                     var3 = new ArrayList();
                  }

                  int var5;
                  for(var11 = var5 = 0; var11 < var3.size(); var11 = var5) {
                     if (((StallBuyData)var3.get(var5)).getId() >= var7.getId()) {
                        var3.add(var5, var7);
                        var10000 = var4;
                        continue label51;
                     }

                     ++var5;
                  }

                  var10000 = var4;
                  var3.add(var7);
               }
            }

            int var8 = 3 ^ 3;
            int var9 = var3 != null ? var3.size() : 0;

            for(var11 = var8; var11 < var9; var11 = var8) {
               StallBuyData var10 = (StallBuyData)var3.get(var8);
               Class668 var6 = new Class668(var10);
               ++var8;
               this.afb.add(var6);
            }

            this.afc.updateUI();
            return;
         }
      }
   }

   public JScrollPane ce() {
      return this.af;
   }

   public Class290(Class345 var1) {
      this.afa = var1;
      this.afb = new DefaultMutableTreeNode("");
      this.afb.add(new DefaultMutableTreeNode(""));
      this.afc = new JTree(this.afb);
      this.afc.setOpaque((boolean)(2 & 5));
      this.afc.putClientProperty("JTree.lineStyle", "None");
      ((BasicTreeUI)this.afc.getUI()).setLeftChildIndent(3 ^ 3);
      DefaultTreeCellRenderer var2 = new DefaultTreeCellRenderer() {
         public Component getTreeCellRendererComponent(JTree var1, Object var2, boolean var3, boolean var4, boolean var5, int var6, boolean var7) {
            super.getTreeCellRendererComponent(var1, var2, var3, var4, var5, var6, var7);
            if (var2 instanceof Class339) {
               this.setForeground(((Class339)var2).wr());
            }

            return this;
         }
      };
      var2.setLeafIcon((Icon)null);
      var2.setOpenIcon(Class512.azt);
      var2.setClosedIcon(Class512.azr);
      var2.setFont(Class681.ce);
      var2.setBackgroundNonSelectionColor(Class681.cu);
      var2.setBackgroundSelectionColor(new Color(127 & 99, 125 & 95, 94 & 123));
      var2.setBorderSelectionColor(Class681.cu);
      var2.setTextNonSelectionColor(Color.white);
      var2.setTextSelectionColor(Color.white);
      this.afc.setCellRenderer(var2);
      this.afc.setRootVisible((boolean)(2 & 5));
      this.afc.setRowHeight(126 & 21);
      this.afc.addMouseListener(this);
      this.afc.addTreeSelectionListener(this);
      this.af = Class133.f(3 & 4, 3 & 4, 3 & 4, 3 & 4, this.afc, -4 >> 2);
   }

   public void q() {
      this.afb.removeAllChildren();
      AllStallBuy var1;
      if ((var1 = this.afa.vc().bn()) == null) {
         this.afc.updateUI();
      } else {
         Iterator var3;
         Iterator var10000 = var3 = var1.getBuyMenuList().iterator();

         while(var10000.hasNext()) {
            StallBuyMenu var2 = (StallBuyMenu)var3.next();
            Class668 var4 = new Class668(var2);
            var10000 = var3;
            this.vj(var2, var4, var1);
            this.afb.add(var4);
         }

         this.afc.updateUI();
      }
   }

   public void mouseReleased(MouseEvent var1) {
   }

   public void mousePressed(MouseEvent var1) {
   }

   public void mouseExited(MouseEvent var1) {
   }

   public void bg(StallBuyMenu var1) {
      this.afb.removeAllChildren();
      AllStallBuy var5;
      if ((var5 = this.afa.vc().bn()) != null && var1 != null && var1.getPointList() != null) {
         Iterator var3;
         int var4;
         Point var7;
         for(Iterator var10000 = var3 = var1.getPointList().iterator(); var10000.hasNext(); var10000 = var3) {
            for(int var6 = var4 = (var7 = (Point)var3.next()).x; var6 <= var7.y; var6 = var4) {
               StallBuyData var2 = (StallBuyData)var5.getBuyDataMap().get(var4);
               Class668 var8 = new Class668(var2);
               ++var4;
               this.afb.add(var8);
            }
         }

         this.afc.updateUI();
      } else {
         this.afc.updateUI();
      }
   }

   public void valueChanged(TreeSelectionEvent var1) {
      Class668 var3;
      if ((var3 = (Class668)((JTree)var1.getSource()).getLastSelectedPathComponent()) != null) {
         if (this.afa instanceof Class130) {
            Class130 var2 = (Class130)this.afa;
            if (var3.bi() != null) {
               if (var3.bi().getMenuList() == null && var3.bi().getPointList() != null) {
                  var2.fi().bg(var3.bi());
                  return;
               }
            } else if (var3.bf() != null) {
               var2.fo(var3.bf(), (StallNeedBean)null);
            }
         }

      }
   }

   public void mouseEntered(MouseEvent var1) {
   }
}
