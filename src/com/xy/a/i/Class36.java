package com.xy.a.i;

import com.xy.a.Class127;
import com.xy.q.Class49;
import com.xy.readbean.AllStallBuy;
import com.xy.readbean.StallBuyData;
import com.xy.readbean.StallBuyMenu;
import java.awt.Color;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.SwingUtilities;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.plaf.basic.BasicTreeUI;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreePath;

public class Class36 implements TreeSelectionListener, MouseListener {
   private com.xy.q.Class30 ri;
   private JTree apc;
   private JScrollPane ba;
   private DefaultMutableTreeNode xj;

   public Class36(com.xy.q.Class30 var1) {
      this.ri = var1;
      this.xj = new DefaultMutableTreeNode("");
      this.xj.add(new DefaultMutableTreeNode(""));
      this.apc = new JTree(this.xj);
      this.apc.setOpaque(false);
      String var10002 = "&n\u001e_\t\u0014\u0000S\u0002_?N\u0015V\t";
      String var10003 = "\\m|g";
      this.apc.putClientProperty("JTree.lineStyle", "None");
      ((BasicTreeUI)this.apc.getUI()).setLeftChildIndent(0);
      Class0 var2 = new Class0(this);
      var2.setLeafIcon(null);
      var2.setOpenIcon(com.xy.q.Class47.arm);
      var2.setClosedIcon(com.xy.q.Class47.arp);
      var2.setFont(Class49.ac);
      var2.setBackgroundNonSelectionColor(Class49.bk);
      var2.setBackgroundSelectionColor(new Color(99, 93, 90));
      var2.setBorderSelectionColor(Class49.bk);
      var2.setTextNonSelectionColor(Color.white);
      var2.setTextSelectionColor(Color.white);
      this.apc.setCellRenderer(var2);
      this.apc.setRootVisible(false);
      this.apc.setRowHeight(20);
      this.apc.addMouseListener(this);
      this.apc.addTreeSelectionListener(this);
      this.ba = com.xy.q.Class1.g(0, 0, 0, 0, this.apc, -1);
   }

   public void ahc(StallBuyMenu var1) {
      this.xj.removeAllChildren();
      AllStallBuy var2;
      if ((var2 = this.ri.yt().k()) != null && var1 != null && var1.getPointList() != null) {
         Point var3;
         Iterator var4;
         int var5;
         for (Iterator var10000 = var4 = var1.getPointList().iterator(); var10000.hasNext(); var10000 = var4) {
            for (int var8 = var5 = (var3 = (Point)var4.next()).x; var8 <= var3.y; var8 = var5) {
               StallBuyData var6 = var2.getBuyDataMap().get(var5);
               Class39 var7 = new Class39(var6);
               var5++;
               this.xj.add(var7);
            }
         }

         this.apc.updateUI();
      } else {
         this.apc.updateUI();
      }
   }

   public void l() {
      this.xj.removeAllChildren();
      AllStallBuy var1;
      if ((var1 = this.ri.yt().k()) == null) {
         this.apc.updateUI();
      } else {
         Iterator var3;
         Iterator var10000 = var3 = var1.getBuyMenuList().iterator();

         while (var10000.hasNext()) {
            StallBuyMenu var2 = (StallBuyMenu)var3.next();
            Class39 var4 = new Class39(var2);
            var10000 = var3;
            this.ahd(var2, var4, var1);
            this.xj.add(var4);
         }

         this.apc.updateUI();
      }
   }

   @Override
   public void mouseClicked(MouseEvent var1) {
      if (SwingUtilities.isLeftMouseButton(var1)) {
         this.t();
      }
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
   }

   @Override
   public void mouseExited(MouseEvent var1) {
   }

   public void t() {
      TreePath var1;
      if ((var1 = this.apc.getSelectionPath()) != null) {
         if (this.apc.isExpanded(var1)) {
            this.apc.collapsePath(var1);
            return;
         }

         this.apc.expandPath(var1);
      }
   }

   @Override
   public void mouseEntered(MouseEvent var1) {
   }

   @Override
   public void mousePressed(MouseEvent var1) {
   }

   public void ahd(StallBuyMenu var1, Class39 var2, AllStallBuy var3) {
      if (var1.getMenuList() != null) {
         Iterator var5;
         Iterator var10000 = var5 = var1.getMenuList().iterator();

         while (var10000.hasNext()) {
            StallBuyMenu var4 = (StallBuyMenu)var5.next();
            Class39 var6 = new Class39(var4);
            var10000 = var5;
            this.ahd(var4, var6, var3);
            var2.add(var6);
         }
      }

      Iterator var10;
      if (var1.getMenuList() != null && var1.getPointList() != null) {
         Point var9;
         int var11;
         for (Iterator var12 = var10 = var1.getPointList().iterator(); var12.hasNext(); var12 = var10) {
            for (int var13 = var11 = (var9 = (Point)var10.next()).x; var13 <= var9.y; var13 = var11) {
               StallBuyData var7 = var3.getBuyDataMap().get(var11);
               Class39 var8 = new Class39(var7);
               var11++;
               var2.add(var8);
            }
         }
      }
   }

   public void dq(String var1) {
      this.xj.removeAllChildren();
      AllStallBuy var2;
      if ((var2 = this.ri.yt().k()) == null) {
         this.apc.updateUI();
      } else {
         ArrayList var3 = null;
         Iterator var5;
         Iterator var10000 = var5 = var2.getBuyDataMap().values().iterator();

         label54:
         while (var10000.hasNext()) {
            StallBuyData var4;
            if ((var4 = (StallBuyData)var5.next()).getName().indexOf(var1) == -1) {
               var10000 = var5;
            } else {
               if (var3 == null) {
                  var3 = new ArrayList();
               }

               int var6;
               for (int var11 = var6 = 0; var11 < var3.size(); var11 = ++var6) {
                  if (((StallBuyData)var3.get(var6)).getId() >= var4.getId()) {
                     var3.add(var6, var4);
                     var10000 = var5;
                     continue label54;
                  }
               }

               var10000 = var5;
               var3.add(var4);
            }
         }

         int var8 = 0;
         int var9 = var3 != null ? var3.size() : 0;

         for (int var12 = var8; var12 < var9; var12 = var8) {
            StallBuyData var10 = (StallBuyData)var3.get(var8);
            Class39 var7 = new Class39(var10);
            var8++;
            this.xj.add(var7);
         }

         this.apc.updateUI();
      }
   }

   @Override
   public void valueChanged(TreeSelectionEvent var1) {
      Class39 var3;
      if ((var3 = (Class39)((JTree)var1.getSource()).getLastSelectedPathComponent()) != null) {
         if (this.ri instanceof Class127) {
            Class127 var4 = (Class127)this.ri;
            if (var3.ajw() != null) {
               if (var3.ajw().getMenuList() == null && var3.ajw().getPointList() != null) {
                  var4.alz().ahc(var3.ajw());
                  return;
               }
            } else if (var3.ajv() != null) {
               var4.amb(var3.ajv(), null);
            }
         }
      }
   }

   public JScrollPane cn() {
      return this.ba;
   }
}
