package com.xy.a.i;

import com.xy.entity.PartJade;
import com.xy.game.RoleData;
import com.xy.q.Class49;
import com.xy.readbean.RoleSuitBean;
import com.xy.richtext.RichLabel;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.SwingUtilities;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.plaf.basic.BasicTreeUI;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreePath;

public class Class2 implements TreeSelectionListener, MouseListener {
   private RichLabel am;
   private DefaultMutableTreeNode ct;
   private JTree cu;
   private com.xy.w.Class18 co;
   private JScrollPane cp;
   private JScrollPane i;
   private Class31 cv;
   private com.xy.q.Class30 cw;
   private boolean cf;

   // $VF: synthetic method
   static boolean cj(Class2 var0) {
      return var0.cf;
   }

   public void ck(PartJade var1) {
      RoleSuitBean var2;
      if ((var2 = this.cw.yt().bd((int)var1.getSuitid())) != null) {
         Enumeration var3;
         for (Enumeration var10000 = var3 = this.ct.children(); var10000.hasMoreElements(); var10000 = var3) {
            DefaultMutableTreeNode var4 = (DefaultMutableTreeNode)var3.nextElement();
            if (var2.getSname().equals(var4.getUserObject())) {
               Enumeration var5;
               var10000 = var5 = var4.children();

               while (var10000.hasMoreElements()) {
                  Class33 var6;
                  if ((var6 = (Class33)var5.nextElement()).aex().getSuitid() != var1.getSuitid()) {
                     var10000 = var5;
                  } else {
                     if (var6.aex().getPartId() == var1.getPartId()) {
                        var6.aex().c(var1);
                        return;
                     }

                     var10000 = var5;
                  }
               }

               return;
            }
         }
      }
   }

   public void h() {
      if (this.i != null) {
         this.i.setViewportView(null);
      }

      this.l();
   }

   @Override
   public void valueChanged(TreeSelectionEvent var1) {
      if (this.i != null) {
         Object var3;
         if ((var3 = ((JTree)var1.getSource()).getLastSelectedPathComponent()) == null) {
            this.i.setViewportView(null);
         } else if (var3 instanceof Class33) {
            Class33 var8 = (Class33)var3;
            Class2 var9;
            if (this.cv == null) {
               this.cv = new Class31(this.cw, var8.aex());
               var9 = this;
            } else {
               this.cv.ck(var8.aex());
               var9 = this;
            }

            var9.i.setViewportView(this.cv);
         } else {
            if (var3 instanceof DefaultMutableTreeNode) {
               DefaultMutableTreeNode var4;
               String var5 = (var4 = (DefaultMutableTreeNode)var3).toString();
               RoleSuitBean var6;
               if ((var6 = this.cw.yt().bs().a(var5)) == null) {
                  return;
               }

               Class2 var10000;
               if (this.am == null) {
                  this.am = new RichLabel(var6.getIntroduce(), Class49.bz);
                  var10000 = this;
               } else {
                  this.am.setText(var6.getIntroduce());
                  var10000 = this;
               }

               Dimension var7 = var10000.am.computeSize(275);
               this.am.setSize(var7);
               this.am.setPreferredSize(var7);
               this.i.setViewportView(this.am);
            }
         }
      }
   }

   public JScrollPane cl() {
      return this.cp;
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
   }

   @Override
   public void mousePressed(MouseEvent var1) {
   }

   // $VF: synthetic method
   static com.xy.w.Class18 cm(Class2 var0) {
      return var0.co;
   }

   public void l() {
      RoleData var1;
      if ((var1 = this.cw.yx()) != null) {
         boolean var2 = this.cf;
         this.ct.removeAllChildren();
         Map var3;
         if ((var3 = this.cw.yt().bs().getRolesuit()) != null) {
            Iterator var4;
            Iterator var10000 = var4 = var3.entrySet().iterator();

            while (var10000.hasNext()) {
               RoleSuitBean var5 = (RoleSuitBean)((Entry)var4.next()).getValue();
               DefaultMutableTreeNode var6 = new DefaultMutableTreeNode(var5.getSname());
               boolean var7 = true;
               int[] var8 = var5.getParts();

               int var9;
               for (int var12 = var9 = 0; var12 < var8.length; var12 = ++var9) {
                  PartJade var10 = var1.getPackRecord().getPartJade(var5.getSuitID(), var8[var9]);
                  Class33 var11 = new Class33(var10);
                  var6.add(var11);
                  if (var7) {
                     var7 = var10.a();
                  }
               }

               if (var2 && var7) {
                  var10000 = var4;
               } else {
                  this.ct.add(var6);
                  var10000 = var4;
               }
            }
         }

         this.cu.updateUI();
      }
   }

   public void t() {
      TreePath var1;
      if ((var1 = this.cu.getSelectionPath()) != null) {
         if (this.cu.isExpanded(var1)) {
            this.cu.collapsePath(var1);
            return;
         }

         this.cu.expandPath(var1);
      }
   }

   @Override
   public void mouseEntered(MouseEvent var1) {
   }

   public Class2(com.xy.q.Class30 var1, com.xy.w.Class18 var2) {
      this.cw = var1;
      this.co = var2;
      this.cf = true;
      String var4;
      if (this.cf) {
         var4 = "&VzPz\u0006e\u001b%[2";
         var4 = "sc/e/30.png";
      } else {
         var4 = "&\u0003z\u0005zRlN%\u000e2";
         var4 = "sc/e/29.png";
      }

      this.co.gt(com.xy.w.Class16.c(var4));
      this.co.addMouseListener(new Class44(this));
      this.ct = new DefaultMutableTreeNode("");
      this.ct.add(new DefaultMutableTreeNode(""));
      this.cu = new JTree(this.ct);
      this.cu.setOpaque(false);
      String var10002 = "\u001fa'P0\u001b9\\;P\u0006A,Y0";
      String var10003 = ".:\u000e0";
      this.cu.putClientProperty("JTree.lineStyle", "None");
      ((BasicTreeUI)this.cu.getUI()).setLeftChildIndent(0);
      Class4 var3 = new Class4(this);
      var3.setLeafIcon(null);
      var3.setOpenIcon(com.xy.q.Class47.arm);
      var3.setClosedIcon(com.xy.q.Class47.arp);
      var3.setFont(Class49.ac);
      var3.setBackgroundNonSelectionColor(Class49.bk);
      var3.setBackgroundSelectionColor(new Color(99, 93, 90));
      var3.setBorderSelectionColor(Class49.bk);
      var3.setTextNonSelectionColor(Color.white);
      var3.setTextSelectionColor(Color.white);
      this.cu.setCellRenderer(var3);
      this.cu.setRootVisible(false);
      this.cu.setRowHeight(20);
      this.cu.addMouseListener(this);
      this.cu.addTreeSelectionListener(this);
      this.cp = com.xy.q.Class1.g(0, 0, 0, 0, this.cu, -1);
      this.i = com.xy.q.Class1.g(185, 55, 297, 173, null, -1);
   }

   @Override
   public void mouseExited(MouseEvent var1) {
   }

   public JScrollPane cn() {
      return this.i;
   }

   @Override
   public void mouseClicked(MouseEvent var1) {
      if (SwingUtilities.isLeftMouseButton(var1)) {
         this.t();
      }
   }

   // $VF: synthetic method
   static void co(Class2 var0, boolean var1) {
      var0.cf = var1;
   }
}
