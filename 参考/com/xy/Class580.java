package com.xy;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Rectangle;
import javax.swing.Icon;
import javax.swing.JLabel;
import javax.swing.JTree;
import javax.swing.UIManager;
import javax.swing.JTree.DropLocation;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.ColorUIResource;
import javax.swing.plaf.FontUIResource;
import javax.swing.plaf.UIResource;
import javax.swing.plaf.basic.BasicGraphicsUtils;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreeCellRenderer;
import sun.swing.DefaultLookup;

public class Class580 extends JLabel implements TreeCellRenderer {
   private JTree afq;
   protected Color afr;
   protected boolean afs;
   private boolean ku;
   protected Color aft;
   private boolean afu;
   private boolean afv;
   private Color afw;
   protected transient Icon afx;
   private Color afy;
   protected boolean afz;
   protected Color wl;
   protected transient Icon aga;
   protected transient Icon agb;
   protected Color pq;
   private boolean lc;
   private boolean bb;
   protected Color wh;

   public void vz(Color var1) {
      this.afr = var1;
   }

   public void wa(Icon var1) {
      this.aga = var1;
   }

   public void firePropertyChange(String var1, short var2, short var3) {
   }

   public void updateUI() {
      super.updateUI();
      if (!this.ku || this.wp() instanceof UIResource) {
         this.wb(DefaultLookup.getIcon(this, this.ui, "Tree.leafIcon"));
      }

      if (!this.ku || this.wo() instanceof UIResource) {
         this.wi(DefaultLookup.getIcon(this, this.ui, "Tree.closedIcon"));
      }

      if (!this.ku || this.wl() instanceof UIManager) {
         this.wa(DefaultLookup.getIcon(this, this.ui, "Tree.openIcon"));
      }

      if (!this.ku || this.wm() instanceof UIResource) {
         this.wj(DefaultLookup.getColor(this, this.ui, "Tree.selectionForeground"));
      }

      if (!this.ku || this.wh() instanceof UIResource) {
         this.ws(DefaultLookup.getColor(this, this.ui, "Tree.textForeground"));
      }

      if (!this.ku || this.wc() instanceof UIResource) {
         this.wn(DefaultLookup.getColor(this, this.ui, "Tree.selectionBackground"));
      }

      if (!this.ku || this.wk() instanceof UIResource) {
         this.vz(DefaultLookup.getColor(this, this.ui, "Tree.textBackground"));
      }

      if (!this.ku || this.wr() instanceof UIResource) {
         this.wf(DefaultLookup.getColor(this, this.ui, "Tree.selectionBorderColor"));
      }

      this.lc = DefaultLookup.getBoolean(this, this.ui, "Tree.drawsFocusBorderAroundIcon", (boolean)(3 ^ 3));
      this.afu = DefaultLookup.getBoolean(this, this.ui, "Tree.drawDashedFocusIndicator", (boolean)(2 & 5));
      this.bb = DefaultLookup.getBoolean(this, this.ui, "Tree.rendererFillBackground", (boolean)(3 & 5));
      Insets var1;
      if ((var1 = DefaultLookup.getInsets(this, this.ui, "Tree.rendererMargins")) != null) {
         this.setBorder(new EmptyBorder(var1.top, var1.left, var1.bottom, var1.right));
      }

      this.setName("Tree.cellRenderer");
   }

   public void wb(Icon var1) {
      this.agb = var1;
   }

   public Color wc() {
      return this.wl;
   }

   public void firePropertyChange(String var1, byte var2, byte var3) {
   }

   public Icon wd() {
      return DefaultLookup.getIcon(this, this.ui, "Tree.closedIcon");
   }

   public void paint(Graphics var1) {
      Color var2;
      if (this.afv) {
         if ((var2 = DefaultLookup.getColor(this, this.ui, "Tree.dropCellBackground")) == null) {
            var2 = this.wc();
         }
      } else if (this.afs) {
         var2 = this.wc();
      } else if ((var2 = this.wk()) == null) {
         var2 = this.getBackground();
      }

      Class580 var10000;
      int var3;
      label47: {
         var3 = -1;
         if (var2 != null && this.bb) {
            var3 = this.ae();
            var1.setColor(var2);
            if (this.getComponentOrientation().isLeftToRight()) {
               var1.fillRect(var3, 3 ^ 3, this.getWidth() - var3, this.getHeight());
               var10000 = this;
               break label47;
            }

            var1.fillRect(0, 0, this.getWidth() - var3, this.getHeight());
         }

         var10000 = this;
      }

      label40: {
         if (var10000.afz) {
            if (this.lc) {
               var3 = 3 & 4;
               var10000 = this;
            } else {
               if (var3 == -4 >> 2) {
                  var3 = this.ae();
               }

               var10000 = this;
            }

            if (var10000.getComponentOrientation().isLeftToRight()) {
               this.wg(var1, var3, 2 & 5, this.getWidth() - var3, this.getHeight(), var2);
               var10000 = this;
               break label40;
            }

            this.wg(var1, 3 >> 2, 3 >> 2, this.getWidth() - var3, this.getHeight(), var2);
         }

         var10000 = this;
      }

      var10000.paint(var1);
   }

   public void revalidate() {
   }

   public Icon we() {
      return DefaultLookup.getIcon(this, this.ui, "Tree.openIcon");
   }

   public void firePropertyChange(String var1, char var2, char var3) {
   }

   public void wf(Color var1) {
      this.pq = var1;
   }

   public void firePropertyChange(String var1, float var2, float var3) {
   }

   public void firePropertyChange(String var1, long var2, long var4) {
   }

   public void repaint() {
   }

   public void setBackground(Color var1) {
      if (var1 instanceof ColorUIResource) {
         var1 = null;
      }

      super.setBackground(var1);
   }

   protected void firePropertyChange(String var1, Object var2, Object var3) {
      if (var1 == "text" || (var1 == "font" || var1 == "foreground") && var2 != var3 && this.getClientProperty("html") != null) {
         super.firePropertyChange(var1, var2, var3);
      }

   }


   private void wg(Graphics var1, int var2, int var3, int var4, int var5, Color var6) {
      Color var7;
      if ((var7 = this.wr()) != null && (this.afs || !this.afu)) {
         var1.setColor(var7);
         var1.drawRect(var2, var3, var4 - (5 >> 2), var5 - (3 & 5));
      }

      if (this.afu && var6 != null) {
         if (this.afw != var6) {
            this.afw = var6;
            this.afy = new Color(var6.getRGB() ^ -4 >> 2);
         }

         var1.setColor(this.afy);
         BasicGraphicsUtils.drawDashedRect(var1, var2, var3, var4, var5);
      }

   }

   public Color wh() {
      return this.aft;
   }

   public Font getFont() {
      Font var1;
      if ((var1 = super.getFont()) == null && this.afq != null) {
         var1 = this.afq.getFont();
      }

      return var1;
   }

   public void firePropertyChange(String var1, int var2, int var3) {
   }

   public void wi(Icon var1) {
      this.afx = var1;
   }

   public void wj(Color var1) {
      this.wh = var1;
   }


   private int ae() {
      Icon var1;
      return (var1 = this.getIcon()) != null && this.getText() != null ? var1.getIconWidth() + Math.max(3 ^ 3, this.getIconTextGap() - --1) : 0;
   }

   public Color wk() {
      return this.afr;
   }

   public Icon wl() {
      return this.aga;
   }

   public void invalidate() {
   }

   public Color wm() {
      return this.wh;
   }

   public Component getTreeCellRendererComponent(JTree var1, Object var2, boolean var3, boolean var4, boolean var5, int var6, boolean var7) {
      DefaultMutableTreeNode var8 = (DefaultMutableTreeNode)var2;
      Class625 var9 = null;
      if (var8.getUserObject() instanceof Class625) {
         var9 = (Class625)var8.getUserObject();
      }

      String var13 = var9 != null ? var9.h() : var1.convertValueToText(var2, var3, var4, var5, var6, var7);
      this.afq = var1;
      this.afz = var7;
      this.setText(var13);
      var2 = null;
      this.afv = (boolean)(3 >> 2);
      DropLocation var12 = var1.getDropLocation();
      Color var10;
      Class580 var10000;
      if (var9 != null && var9.c() != null) {
         var10 = var9.c();
         var10000 = this;
      } else if (var12 != null && var12.getChildIndex() == -4 >> 2 && var1.getRowForPath(var12.getPath()) == var6) {
         Color var14;
         var10 = (var14 = DefaultLookup.getColor(this, this.ui, "Tree.dropCellForeground")) != null ? var14 : this.wm();
         var10000 = this;
         this.afv = (boolean)(--1);
      } else if (var3) {
         var10 = this.wm();
         var10000 = this;
      } else {
         var10 = this.wh();
         var10000 = this;
      }

      var10000.setForeground(var10);
      var8 = null;
      Icon var15;
      if (var9 != null && var9.i() != null) {
         var15 = var9.i();
         var10000 = this;
      } else if (var5) {
         var10000 = this;
         var15 = this.wp();
      } else if (var4) {
         var15 = this.wl();
         var10000 = this;
      } else {
         var15 = this.wo();
         var10000 = this;
      }

      var10000.setFont(var9 != null && var9.l() != null ? var9.l() : var1.getFont());
      if (!var1.isEnabled()) {
         this.setEnabled((boolean)(3 ^ 3));
         Icon var11;
         if ((var11 = UIManager.getLookAndFeel().getDisabledIcon(var1, var15)) != null) {
            var15 = var11;
         }

         var10000 = this;
         this.setDisabledIcon(var15);
      } else {
         var10000 = this;
         this.setEnabled((boolean)(3 >> 1));
         this.setIcon(var15);
      }

      var10000.setComponentOrientation(var1.getComponentOrientation());
      this.afs = var3;
      return this;
   }

   public void repaint(Rectangle var1) {
   }

   public void wn(Color var1) {
      this.wl = var1;
   }

   public void setFont(Font var1) {
      if (var1 instanceof FontUIResource) {
         var1 = null;
      }

      super.setFont(var1);
   }

   public Icon wo() {
      return this.afx;
   }

   public void firePropertyChange(String var1, boolean var2, boolean var3) {
   }

   public void validate() {
   }

   public Icon wp() {
      return this.agb;
   }

   public Class580() {
      int var10001 = 2 ^ 3;
      super();
      this.ku = (boolean)var10001;
   }

   public Icon wq() {
      return DefaultLookup.getIcon(this, this.ui, "Tree.leafIcon");
   }

   public void firePropertyChange(String var1, double var2, double var4) {
   }

   public Color wr() {
      return this.pq;
   }

   public void repaint(long var1, int var3, int var4, int var5, int var6) {
   }

   public Dimension getPreferredSize() {
      Dimension var1;
      if ((var1 = super.getPreferredSize()) != null) {
         var1 = new Dimension(var1.width + --3, var1.height);
      }

      return var1;
   }

   public void ws(Color var1) {
      this.aft = var1;
   }
}
