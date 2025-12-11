package com.xy.q;

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

public class Class61 extends JLabel implements TreeCellRenderer {
   private boolean ayl;
   protected transient Icon aym;
   private boolean ayn;
   private Color ayo;
   private boolean yu;
   private boolean acr = true;
   protected boolean ln;
   protected boolean ak;
   protected Color ws;
   protected Color ayp;
   private Color wu;
   protected transient Icon ayq;
   private boolean wb;
   protected transient Icon ayr;
   protected Color wv;
   protected Color asu;
   private JTree xi;
   protected Color rr;

   @Override
   public void paint(Graphics var1) {
      Color var2;
      if (this.ayl) {
         String var10002 = "@Hq_:^fUdyqVxxuY\u007f]fUaTp";
         if ((var2 = DefaultLookup.getColor(this, this.ui, "Tree.dropCellBackground")) == null) {
            var2 = this.aob();
         }
      } else if (this.ak) {
         var2 = this.aob();
      } else if ((var2 = this.aon()) == null) {
         var2 = this.getBackground();
      }

      int var3;
      Class61 var10000;
      label49: {
         var3 = -1;
         if (var2 != null && this.yu) {
            var3 = this.il();
            var1.setColor(var2);
            if (this.getComponentOrientation().isLeftToRight()) {
               var1.fillRect(var3, 0, this.getWidth() - var3, this.getHeight());
               var10000 = this;
               break label49;
            }

            var1.fillRect(0, 0, this.getWidth() - var3, this.getHeight());
         }

         var10000 = this;
      }

      label42: {
         if (var10000.ln) {
            if (this.wb) {
               var3 = 0;
               var10000 = this;
            } else {
               if (var3 == -1) {
                  var3 = this.il();
               }

               var10000 = this;
            }

            if (var10000.getComponentOrientation().isLeftToRight()) {
               this.aok(var1, var3, 0, this.getWidth() - var3, this.getHeight(), var2);
               var10000 = this;
               break label42;
            }

            this.aok(var1, 0, 0, this.getWidth() - var3, this.getHeight(), var2);
         }

         var10000 = this;
      }

      var10000.paint(var1);
   }

   @Override
   public Component getTreeCellRendererComponent(JTree var1, Object var2, boolean var3, boolean var4, boolean var5, int var6, boolean var7) {
      DefaultMutableTreeNode var8 = (DefaultMutableTreeNode)var2;
      Class34 var9 = null;
      if (var8.getUserObject() instanceof Class34) {
         var9 = (Class34)var8.getUserObject();
      }

      String var10 = var9 != null ? var9.d() : var1.convertValueToText(var2, var3, var4, var5, var6, var7);
      this.xi = var1;
      this.ln = var7;
      this.setText(var10);
      Object var11 = null;
      this.ayl = false;
      DropLocation var12 = var1.getDropLocation();
      Class61 var10000;
      if (var9 != null && var9.e() != null) {
         var11 = var9.e();
         var10000 = this;
      } else if (var12 != null && var12.getChildIndex() == -1 && var1.getRowForPath(var12.getPath()) == var6) {
         String var10002 = "\u0005|4k\u007fj#a!M4b=H>|4i#a$`5";
         Color var13;
         var11 = (var13 = DefaultLookup.getColor(this, this.ui, "Tree.dropCellForeground")) != null ? var13 : this.aof();
         var10000 = this;
         this.ayl = true;
      } else if (var3) {
         var11 = this.aof();
         var10000 = this;
      } else {
         var11 = this.aoj();
         var10000 = this;
      }

      var10000.setForeground((Color)var11);
      Object var17 = null;
      if (var9 != null && var9.g() != null) {
         var17 = var9.g();
         var10000 = this;
      } else if (var5) {
         var10000 = this;
         var17 = this.aod();
      } else if (var4) {
         var17 = this.aoi();
         var10000 = this;
      } else {
         var17 = this.aoa();
         var10000 = this;
      }

      var10000.setFont(var9 != null && var9.p() != null ? var9.p() : var1.getFont());
      if (!var1.isEnabled()) {
         this.setEnabled(false);
         Icon var15;
         if ((var15 = UIManager.getLookAndFeel().getDisabledIcon(var1, (Icon)var17)) != null) {
            var17 = var15;
         }

         var10000 = this;
         this.setDisabledIcon((Icon)var17);
      } else {
         var10000 = this;
         this.setEnabled(true);
         this.setIcon((Icon)var17);
      }

      var10000.setComponentOrientation(var1.getComponentOrientation());
      this.ak = var3;
      return this;
   }

   @Override
   public void firePropertyChange(String var1, byte var2, byte var3) {
   }

   @Override
   public void revalidate() {
   }

   @Override
   public void firePropertyChange(String var1, int var2, int var3) {
   }

   @Override
   public void repaint(long var1, int var3, int var4, int var5, int var6) {
   }

   public void anw(Color var1) {
      this.rr = var1;
   }

   @Override
   protected void firePropertyChange(String var1, Object var2, Object var3) {
      if (var1 != "text") {
         if (var1 != "font" && var1 != "foreground" || var2 == var3) {
            return;
         }

         String var10001 = "R`Wx";
         if (this.getClientProperty("html") == null) {
            return;
         }
      }

      super.firePropertyChange(var1, var2, var3);
   }

   public Icon anx() {
      String var10002 = "@Hq_:YxUg_pswUz";
      return DefaultLookup.getIcon(this, this.ui, "Tree.closedIcon");
   }

   @Override
   public void firePropertyChange(String var1, double var2, double var4) {
   }

   @Override
   public void setFont(Font var1) {
      if (var1 instanceof FontUIResource) {
         var1 = null;
      }

      super.setFont(var1);
   }

   public void any(Color var1) {
      this.wv = var1;
   }

   @Override
   public void firePropertyChange(String var1, char var2, char var3) {
   }

   public void anz(Icon var1) {
      this.aym = var1;
   }

   @Override
   public Dimension getPreferredSize() {
      Dimension var1;
      if ((var1 = super.getPreferredSize()) != null) {
         var1 = new Dimension(var1.width + 3, var1.height);
      }

      return var1;
   }

   @Override
   public void firePropertyChange(String var1, long var2, long var4) {
   }

   @Override
   public void updateUI() {
      super.updateUI();
      if (!this.acr || this.aod() instanceof UIResource) {
         String var10003 = "@Hq_:Vq[rswUz";
         this.aoe(DefaultLookup.getIcon(this, this.ui, "Tree.leafIcon"));
      }

      if (!this.acr || this.aoa() instanceof UIResource) {
         String var2 = "\u0005|4k\u007fm=a\"k5G2a?";
         this.anz(DefaultLookup.getIcon(this, this.ui, "Tree.closedIcon"));
      }

      if (!this.acr || this.aoi() instanceof UIManager) {
         String var3 = "@Hq_:Ud_zswUz";
         this.aoo(DefaultLookup.getIcon(this, this.ui, "Tree.openIcon"));
      }

      if (!this.acr || this.aof() instanceof UIResource) {
         String var4 = "Z#k4 \"k=k2z8a?H>|4i#a$`5";
         this.aom(DefaultLookup.getColor(this, this.ui, "Tree.selectionForeground"));
      }

      if (!this.acr || this.aoj() instanceof UIResource) {
         String var5 = "@Hq_:NqB`|{Hq]fUaTp";
         this.anw(DefaultLookup.getColor(this, this.ui, "Tree.textForeground"));
      }

      if (!this.acr || this.aob() instanceof UIResource) {
         String var6 = "Z#k4 \"k=k2z8a?L0m:i#a$`5";
         this.aoc(DefaultLookup.getColor(this, this.ui, "Tree.selectionBackground"));
      }

      if (!this.acr || this.aon() instanceof UIResource) {
         String var7 = "@Hq_:NqB`xuY\u007f]fUaTp";
         this.any(DefaultLookup.getColor(this, this.ui, "Tree.textBackground"));
      }

      if (!this.acr || this.aew() instanceof UIResource) {
         String var8 = "\u0005|4k\u007f}4b4m%g>`\u0013a#j4|\u0012a=a#";
         this.aog(DefaultLookup.getColor(this, this.ui, "Tree.selectionBorderColor"));
      }

      String var10011 = "@Hq_:^f[cIRUwOgx{Hp_f{fUaTpswUz";
      this.wb = DefaultLookup.getBoolean(this, this.ui, "Tree.drawsFocusBorderAroundIcon", false);
      String var10008 = "\u0005|4k\u007fj#o&J0}9k5H>m$}\u0018`5g2o%a#";
      this.ayn = DefaultLookup.getBoolean(this, this.ui, "Tree.drawDashedFocusIndicator", false);
      String var10005 = "@Hq_:HqTp_f_f|}VxxuY\u007f]fUaTp";
      this.yu = DefaultLookup.getBoolean(this, this.ui, "Tree.rendererFillBackground", true);
      String var10002 = "Z#k4 #k?j4|4|\u001co#i8`\"";
      Insets var1;
      if ((var1 = DefaultLookup.getInsets(this, this.ui, "Tree.rendererMargins")) != null) {
         this.setBorder(new EmptyBorder(var1.top, var1.left, var1.bottom, var1.right));
      }

      String var10001 = "@Hq_:YqVxhqTp_f_f";
      this.setName("Tree.cellRenderer");
   }

   public Icon aoa() {
      return this.aym;
   }

   public Color aob() {
      return this.ayp;
   }

   public void aoc(Color var1) {
      this.ayp = var1;
   }

   public Icon aod() {
      return this.ayr;
   }

   public void aoe(Icon var1) {
      this.ayr = var1;
   }

   @Override
   public void setBackground(Color var1) {
      if (var1 instanceof ColorUIResource) {
         var1 = null;
      }

      super.setBackground(var1);
   }

   @Override
   public void invalidate() {
   }

   @Override
   public void validate() {
   }

   public Color aof() {
      return this.ws;
   }

   // $VF: synthetic method
   private int il() {
      Icon var1;
      return (var1 = this.getIcon()) != null && this.getText() != null ? var1.getIconWidth() + Math.max(0, this.getIconTextGap() - 1) : 0;
   }

   @Override
   public void repaint(Rectangle var1) {
   }

   @Override
   public void firePropertyChange(String var1, short var2, short var3) {
   }

   public void aog(Color var1) {
      this.asu = var1;
   }

   public Icon aoh() {
      String var10002 = "\u0005|4k\u007fa!k?G2a?";
      return DefaultLookup.getIcon(this, this.ui, "Tree.openIcon");
   }

   public Icon aoi() {
      return this.ayq;
   }

   public Color aoj() {
      return this.rr;
   }

   // $VF: synthetic method
   private void aok(Graphics var1, int var2, int var3, int var4, int var5, Color var6) {
      Color var7;
      if ((var7 = this.aew()) != null && (this.ak || !this.ayn)) {
         var1.setColor(var7);
         var1.drawRect(var2, var3, var4 - 1, var5 - 1);
      }

      if (this.ayn && var6 != null) {
         if (this.wu != var6) {
            this.wu = var6;
            this.ayo = new Color(~var6.getRGB());
         }

         var1.setColor(this.ayo);
         BasicGraphicsUtils.drawDashedRect(var1, var2, var3, var4, var5);
      }
   }

   public Icon aol() {
      String var10002 = "\u0005|4k\u007fb4o7G2a?";
      return DefaultLookup.getIcon(this, this.ui, "Tree.leafIcon");
   }

   @Override
   public void firePropertyChange(String var1, float var2, float var3) {
   }

   @Override
   public Font getFont() {
      Font var1;
      if ((var1 = super.getFont()) == null && this.xi != null) {
         var1 = this.xi.getFont();
      }

      return var1;
   }

   @Override
   public void repaint() {
   }

   @Override
   public void firePropertyChange(String var1, boolean var2, boolean var3) {
   }

   public void aom(Color var1) {
      this.ws = var1;
   }

   public Color aon() {
      return this.wv;
   }

   public Color aew() {
      return this.asu;
   }

   public void aoo(Icon var1) {
      this.ayq = var1;
   }
}
