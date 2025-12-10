package com.xy;

import com.xy.entity.PartJade;
import com.xy.game.RoleData;
import com.xy.readbean.RoleSuitBean;
import com.xy.richtext.RichLabel;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
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

public class Class614 implements TreeSelectionListener, MouseListener {
   private JScrollPane ea;
   private JScrollPane eb;
   private Class436 ec;
   private DefaultMutableTreeNode ed;
   private boolean ee;
   private RichLabel bv;
   private Class345 ef;
   private Class641 eg;
   private JTree eh;

   public JScrollPane by() {
      return this.ea;
   }

   public void mouseClicked(MouseEvent var1) {
      if (SwingUtilities.isLeftMouseButton(var1)) {
         this.cc();
      }

   }

   public Class614(Class345 var1, Class436 var2) {
      int var10002 = 3 & 5;
      super();
      this.ef = var1;
      this.ec = var2;
      this.ee = (boolean)var10002;
      this.ec.hf(Class511.a(this.ee ? "sc/e/30.png" : "sc/e/29.png"));
      this.ec.addMouseListener(new MouseListener() {
         public void mouseEntered(MouseEvent var1) {
         }

         public void mouseReleased(MouseEvent var1) {
         }

         public void mousePressed(MouseEvent var1) {
         }

         public void mouseClicked(MouseEvent var1) {
            Class614.this.ee = (boolean)(Class614.this.ee ? 2 & 5 : 1);
            Class614.this.ec.hf(Class511.a(Class614.this.ee ? "sc/e/30.png" : "sc/e/29.png"));
            Class614.this.q();
         }

         public void mouseExited(MouseEvent var1) {
         }
      });
      this.ed = new DefaultMutableTreeNode("");
      this.ed.add(new DefaultMutableTreeNode(""));
      this.eh = new JTree(this.ed);
      this.eh.setOpaque((boolean)(2 & 5));
      this.eh.putClientProperty("JTree.lineStyle", "None");
      ((BasicTreeUI)this.eh.getUI()).setLeftChildIndent(5 >> 3);
      DefaultTreeCellRenderer var3 = new DefaultTreeCellRenderer() {
         public Component getTreeCellRendererComponent(JTree var1, Object var2, boolean var3, boolean var4, boolean var5, int var6, boolean var7) {
            super.getTreeCellRendererComponent(var1, var2, var3, var4, var5, var6, var7);
            if (var2 instanceof Class339) {
               this.setForeground(((Class339)var2).wr());
            }

            return this;
         }
      };
      var3.setLeafIcon((Icon)null);
      var3.setOpenIcon(Class512.azt);
      var3.setClosedIcon(Class512.azr);
      var3.setFont(Class681.ce);
      var3.setBackgroundNonSelectionColor(Class681.cu);
      var3.setBackgroundSelectionColor(new Color(99 & 127, 127 & 93, 91 & 126));
      var3.setBorderSelectionColor(Class681.cu);
      var3.setTextNonSelectionColor(Color.white);
      var3.setTextSelectionColor(Color.white);
      var10002 = 3 ^ 3;
      this.eh.setCellRenderer(var3);
      this.eh.setRootVisible((boolean)(3 >> 2));
      this.eh.setRowHeight(55 & 92);
      this.eh.addMouseListener(this);
      this.eh.addTreeSelectionListener(this);
      this.eb = Class133.f(var10002, 2 & 5, 2 & 5, 2 & 5, this.eh, -4 >> 2);
      this.ea = Class133.f(31227 & 1725, 55 & 127, 10105 & 22959, 17391 & 15549, (Component)null, -4 >> 2);
   }

   public void d() {
      if (this.ea != null) {
         this.ea.setViewportView((Component)null);
      }

      this.q();
   }

   public void mouseEntered(MouseEvent var1) {
   }

   public void cb(PartJade var1) {
      RoleSuitBean var4;
      if ((var4 = this.ef.vc().bx((int)var1.getSuitid())) != null) {
         Enumeration var3;
         for(Enumeration var10000 = var3 = this.ed.children(); var10000.hasMoreElements(); var10000 = var3) {
            DefaultMutableTreeNode var2 = (DefaultMutableTreeNode)var3.nextElement();
            if (var4.getSname().equals(var2.getUserObject())) {
               Enumeration var6;
               var10000 = var6 = var2.children();

               while(var10000.hasMoreElements()) {
                  Class339 var5;
                  if ((var5 = (Class339)var6.nextElement()).aiq().getSuitid() != var1.getSuitid()) {
                     var10000 = var6;
                  } else {
                     if (var5.aiq().getPartId() == var1.getPartId()) {
                        var5.aiq().a(var1);
                        return;
                     }

                     var10000 = var6;
                  }
               }

               return;
            }
         }

      }
   }

   public void mouseReleased(MouseEvent var1) {
   }

   public void cc() {
      TreePath var1;
      if ((var1 = this.eh.getSelectionPath()) != null) {
         if (this.eh.isExpanded(var1)) {
            this.eh.collapsePath(var1);
            return;
         }

         this.eh.expandPath(var1);
      }

   }

   public void mousePressed(MouseEvent var1) {
   }

   public void mouseExited(MouseEvent var1) {
   }

   public void q() {
      RoleData var6;
      if ((var6 = this.ef.vd()) != null) {
         boolean var4 = this.ee;
         this.ed.removeAllChildren();
         Map var3;
         if ((var3 = this.ef.vc().v().getRolesuit()) != null) {
            Iterator var11;
            Iterator var10000 = var11 = var3.entrySet().iterator();

            label37:
            while(true) {
               while(true) {
                  if (!var10000.hasNext()) {
                     break label37;
                  }

                  RoleSuitBean var2 = (RoleSuitBean)((Entry)var11.next()).getValue();
                  DefaultMutableTreeNode var5 = new DefaultMutableTreeNode(var2.getSname());
                  int var1 = --1;
                  int[] var7 = var2.getParts();

                  int var8;
                  for(int var12 = var8 = 3 & 4; var12 < var7.length; var12 = var8) {
                     PartJade var9 = var6.getPackRecord().getPartJade(var2.getSuitID(), var7[var8]);
                     Class339 var10 = new Class339(var9);
                     var5.add(var10);
                     if (var1 != 0) {
                        var1 = var9.d();
                     }

                     ++var8;
                  }

                  if (var4 && var1 != 0) {
                     var10000 = var11;
                  } else {
                     this.ed.add(var5);
                     var10000 = var11;
                  }
               }
            }
         }

         this.eh.updateUI();
      }
   }

   public JScrollPane ce() {
      return this.eb;
   }

   public void valueChanged(TreeSelectionEvent var1) {
      if (this.ea != null) {
         Object var3;
         if ((var3 = ((JTree)var1.getSource()).getLastSelectedPathComponent()) == null) {
            this.ea.setViewportView((Component)null);
         } else {
            Class614 var10000;
            if (var3 instanceof Class339) {
               Class339 var6 = (Class339)var3;
               if (this.eg == null) {
                  this.eg = new Class641(this.ef, var6.aiq());
                  var10000 = this;
               } else {
                  this.eg.cb(var6.aiq());
                  var10000 = this;
               }

               var10000.ea.setViewportView(this.eg);
            } else {
               if (var3 instanceof DefaultMutableTreeNode) {
                  DefaultMutableTreeNode var2;
                  String var4 = (var2 = (DefaultMutableTreeNode)var3).toString();
                  RoleSuitBean var5;
                  if ((var5 = this.ef.vc().v().a(var4)) == null) {
                     return;
                  }

                  if (this.bv == null) {
                     this.bv = new RichLabel(var5.getIntroduce(), Class681.bm);
                     var10000 = this;
                  } else {
                     this.bv.setText(var5.getIntroduce());
                     var10000 = this;
                  }

                  Dimension var7 = var10000.bv.computeSize(11027 & 22015);
                  this.bv.setSize(var7);
                  this.bv.setPreferredSize(var7);
                  this.ea.setViewportView(this.bv);
               }

            }
         }
      }
   }
}
