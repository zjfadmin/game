package com.xy;

import com.xy.bean.FriendBean;
import com.xy.readbean.petExchange;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.SwingUtilities;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.plaf.basic.BasicTreeUI;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreePath;

public class Class512 extends JComponent {
   private JTree azp;
   private JScrollPane ea;
   DefaultMutableTreeNode azq;
   public static Icon azr = new ImageIcon(Class511.a("sc/b/not_expanded.png"));
   private DefaultMutableTreeNode ed;
   private Class580 azs;
   private boolean lb;
   public static Icon azt = new ImageIcon(Class511.a("sc/b/expand.png"));
   private Class345 is;
   private Class604 ip;

   public boolean t() {
      return this.lb;
   }

   public Class512(Class345 var1) {
      this(var1, 85 & 62);
   }

   public Class512(Class345 var1, int var2) {
      this.is = var1;
      this.ed = new DefaultMutableTreeNode("");
      this.ed.add(new DefaultMutableTreeNode(""));
      this.azp = new JTree(this.ed);
      this.azp.setOpaque((boolean)(2 & 5));
      this.azp.putClientProperty("JTree.lineStyle", "None");
      ((BasicTreeUI)this.azp.getUI()).setLeftChildIndent(3 ^ 3);
      this.azs = new Class580();
      this.azs.wb((Icon)null);
      this.azs.wa(azt);
      this.azs.wi(azr);
      this.azs.vz(Class681.bs);
      this.azs.wn(Class681.bk);
      this.azs.wf(Class681.cu);
      this.azs.ws(Color.white);
      this.azs.wj(Color.white);
      this.azp.setCellRenderer(this.azs);
      this.azp.setRootVisible((boolean)(3 ^ 3));
      this.azp.setRowHeight(var2);
      this.azp.setFont(Class681.bu);
      if (var1 instanceof Class637) {
         this.azs.wn(Class581.pp);
         this.azs.wb(azr);
         this.azp.setFont(Class681.bo);
      }

      int var10003 = 3 ^ 3;
      this.azp.addMouseListener(new MouseAdapter() {
         public void mouseClicked(MouseEvent var1) {
            MouseEvent var10000;
            label30: {
               if (Class512.this.lb) {
                  DefaultMutableTreeNode var2;
                  if ((var2 = (DefaultMutableTreeNode)Class512.this.azp.getLastSelectedPathComponent()) != null && var2.getUserObject() instanceof Class625) {
                     var10000 = var1;
                     Class512.this.aqb(var2, var1.getButton());
                     break label30;
                  }

                  TreePath var3;
                  if (SwingUtilities.isRightMouseButton(var1) && (var3 = Class512.this.azp.getClosestPathForLocation(var1.getX(), var1.getY())) != null) {
                     var2 = (DefaultMutableTreeNode)var3.getLastPathComponent();
                     Class512.this.aqb(var2, var1.getButton());
                  }
               }

               var10000 = var1;
            }

            TreePath var4;
            if (SwingUtilities.isLeftMouseButton(var10000) && (var4 = Class512.this.azp.getSelectionPath()) != null) {
               if (Class512.this.azp.isExpanded(var4)) {
                  Class512.this.azp.collapsePath(var4);
                  return;
               }

               Class512.this.azp.expandPath(var4);
            }

         }
      });
      this.azp.addTreeSelectionListener(new TreeSelectionListener() {
         public void valueChanged(TreeSelectionEvent var1) {
            DefaultMutableTreeNode var2;
            if ((var2 = (DefaultMutableTreeNode)((JTree)var1.getSource()).getLastSelectedPathComponent()) != null) {
               Class512.this.aqb(var2, 2 ^ 3);
            }
         }
      });
      this.ea = Class133.f(var10003, 3 >> 2, 3 >> 2, 3 >> 2, this.azp, -4 >> 2);
      this.add(this.ea);
   }

   protected void paintComponent(Graphics var1) {
      super.paintComponent(var1);
      if (this.ip != null) {
         this.ip.g(var1, this.getWidth(), this.getHeight());
      }

   }

   public void eq(Class604 var1) {
      this.ip = var1;
      this.setBounds(this.getX(), this.getY(), this.getWidth(), this.getHeight());
   }

   public void setBounds(int var1, int var2, int var3, int var4) {
      super.setBounds(var1, var2, var3, var4);
      if (this.ip != null) {
         this.ea.setBounds(79 & 58, --5, var3 - (31 & 111), var4 - (73 & 63));
      } else {
         this.ea.setBounds(3 ^ 3, 3 ^ 3, var3, var4);
      }
   }

   public void q() {
      if (this.azp != null) {
         this.azp.updateUI();
      }

   }

   public DefaultMutableTreeNode aqa() {
      return this.ed;
   }

   public synchronized void aqb(DefaultMutableTreeNode var1, int var2) {
      if (this.azq != var1 || !Class280.j()) {
         this.azq = var1;
         if (var1.getUserObject() instanceof Class625) {
            Class625 var3 = (Class625)var1.getUserObject();
            int var10002;
            if (this.is instanceof Class637) {
               Class637 var4 = (Class637)this.is;
               FriendBean var5;
               if (var3 != null) {
                  var5 = (FriendBean)var3.g();
                  var10002 = var2;
               } else {
                  var5 = null;
                  var10002 = var2;
               }

               var4.afd(var5, var10002);
               return;
            }

            if (this.is instanceof Class474) {
               Class474 var10000 = (Class474)this.is;
               petExchange var10001;
               if (var3 != null) {
                  var10001 = (petExchange)var3.g();
                  var10002 = var2;
               } else {
                  var10001 = null;
                  var10002 = var2;
               }

               var10000.br(var10001, var10002);
            }
         }

      }
   }

   public void ak(boolean var1) {
      this.lb = var1;
   }

   public void aqc(String var1, DefaultMutableTreeNode var2) {
      if (var1 == null) {
         this.ed.add(var2);
      } else {
         int var4 = this.ed.getChildCount();

         int var3;
         for(int var10000 = var3 = 3 >> 2; var10000 < var4; var10000 = var3) {
            DefaultMutableTreeNode var5 = (DefaultMutableTreeNode)this.ed.getChildAt(var3);
            if (var1.equals(var5.toString())) {
               var5.add(var2);
               return;
            }

            ++var3;
         }

         DefaultMutableTreeNode var6 = new DefaultMutableTreeNode(var1);
         var6.add(var2);
         this.ed.add(var6);
      }
   }

   public JTree aqd() {
      return this.azp;
   }
}
