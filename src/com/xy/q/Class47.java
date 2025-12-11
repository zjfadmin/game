package com.xy.q;

import com.xy.a.Class128;
import com.xy.bean.FriendBean;
import com.xy.readbean.petExchange;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.plaf.basic.BasicTreeUI;
import javax.swing.tree.DefaultMutableTreeNode;

public class Class47 extends JComponent {
   private Class61 arl;
   public static Icon arm = new ImageIcon(com.xy.w.Class16.c("sc/b/expand.png"));
   private Class30 amh;
   private DefaultMutableTreeNode arn;
   private boolean wb;
   private com.xy.w.Class9 aro;
   DefaultMutableTreeNode ahb;
   private JScrollPane jo;
   private JTree xi;
   public static Icon arp = new ImageIcon(com.xy.w.Class16.c("sc/b/not_expanded.png"));

   public Class47(Class30 var1) {
      this(var1, 20);
   }

   @Override
   public void setBounds(int var1, int var2, int var3, int var4) {
      super.setBounds(var1, var2, var3, var4);
      if (this.aro != null) {
         this.jo.setBounds(10, 5, var3 - 15, var4 - 9);
      } else {
         this.jo.setBounds(0, 0, var3, var4);
      }
   }

   static {
      String var10002 = "eO9N9In\\wBr\u0002fBq";
      var10002 = "id5e5iusEbbw{i~b~)ji}";
   }

   public Class47(Class30 var1, int var2) {
      this.amh = var1;
      this.arn = new DefaultMutableTreeNode("");
      this.arn.add(new DefaultMutableTreeNode(""));
      this.xi = new JTree(this.arn);
      this.xi.setOpaque(false);
      String var10002 = "\\xdIs\u0002zExIEXo@s";
      String var10003 = "Iui\u007f";
      this.xi.putClientProperty("JTree.lineStyle", "None");
      ((BasicTreeUI)this.xi.getUI()).setLeftChildIndent(0);
      this.arl = new Class61();
      this.arl.aoe(null);
      this.arl.aoo(arm);
      this.arl.anz(arp);
      this.arl.any(Class49.cg);
      this.arl.aoc(Class49.au);
      this.arl.aog(Class49.bk);
      this.arl.anw(Color.white);
      this.arl.aom(Color.white);
      this.xi.setCellRenderer(this.arl);
      this.xi.setRootVisible(false);
      this.xi.setRowHeight(var2);
      this.xi.setFont(Class49.k);
      if (var1 instanceof Class128) {
         this.arl.aoc(Class53.acj);
         this.arl.aoe(arp);
         this.xi.setFont(Class49.e);
      }

      this.xi.addMouseListener(new Class10(this));
      this.xi.addTreeSelectionListener(new Class59(this));
      this.jo = Class1.g(0, 0, 0, 0, this.xi, -1);
      this.add(this.jo);
   }

   public boolean ah() {
      return this.wb;
   }

   public void ajm(String var1, DefaultMutableTreeNode var2) {
      if (var1 == null) {
         this.arn.add(var2);
      } else {
         int var3 = this.arn.getChildCount();

         int var4;
         for (int var10000 = var4 = 0; var10000 < var3; var10000 = ++var4) {
            DefaultMutableTreeNode var5 = (DefaultMutableTreeNode)this.arn.getChildAt(var4);
            if (var1.equals(var5.toString())) {
               var5.add(var2);
               return;
            }
         }

         DefaultMutableTreeNode var6 = new DefaultMutableTreeNode(var1);
         var6.add(var2);
         this.arn.add(var6);
      }
   }

   public void be(boolean var1) {
      this.wb = var1;
   }

   // $VF: synthetic method
   static boolean ajn(Class47 var0) {
      return var0.wb;
   }

   // $VF: synthetic method
   static JTree ajo(Class47 var0) {
      return var0.xi;
   }

   @Override
   protected void paintComponent(Graphics var1) {
      super.paintComponent(var1);
      if (this.aro != null) {
         this.aro.g(var1, this.getWidth(), this.getHeight());
      }
   }

   public void mt(com.xy.w.Class9 var1) {
      this.aro = var1;
      this.setBounds(this.getX(), this.getY(), this.getWidth(), this.getHeight());
   }

   public void t() {
      if (this.xi != null) {
         this.xi.updateUI();
      }
   }

   public synchronized void ajp(DefaultMutableTreeNode var1, int var2) {
      if (this.ahb != var1 || !com.xy.v.Class22.h()) {
         this.ahb = var1;
         if (var1.getUserObject() instanceof Class34) {
            Class34 var3 = (Class34)var1.getUserObject();
            if (this.amh instanceof Class128) {
               Class128 var4 = (Class128)this.amh;
               FriendBean var5;
               int var6;
               if (var3 != null) {
                  var5 = (FriendBean)var3.j();
                  var6 = var2;
               } else {
                  var5 = null;
                  var6 = var2;
               }

               var4.amh(var5, var6);
               return;
            }

            if (this.amh instanceof com.xy.a.q.Class40) {
               com.xy.a.q.Class40 var10000 = (com.xy.a.q.Class40)this.amh;
               petExchange var10001;
               int var10002;
               if (var3 != null) {
                  var10001 = (petExchange)var3.j();
                  var10002 = var2;
               } else {
                  var10001 = null;
                  var10002 = var2;
               }

               var10000.sp(var10001, var10002);
            }
         }
      }
   }

   public DefaultMutableTreeNode ajq() {
      return this.arn;
   }

   public JTree ajr() {
      return this.xi;
   }
}
