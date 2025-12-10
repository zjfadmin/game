/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.q.IIiIiiiiIiiIi
 */
package com.xy.q;

import com.xy.q.IIiIiiiiIiiIi;
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
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.ColorUIResource;
import javax.swing.plaf.FontUIResource;
import javax.swing.plaf.UIResource;
import javax.swing.plaf.basic.BasicGraphicsUtils;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreeCellRenderer;
import sun.swing.DefaultLookup;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class IIIIIiiiIiIii
extends JLabel
implements TreeCellRenderer {
    private boolean IIIiiiiiIIiII;
    protected transient Icon iiIiiiiiiIIiI;
    private boolean iIiiIiiiIiIIi;
    private Color iiiiIiiiIIiii;
    private boolean iIIiIiiiiiiIi;
    private boolean IIIIiiiiiiiII = true;
    protected boolean iiIIIiiiiiiiI;
    protected boolean IiIiiiiiIIIII;
    protected Color iiIiIiiiiIIIi;
    protected Color iiiiIiiiIiiII;
    private Color iiiIiiiiiiiIi;
    protected transient Icon iIiiIiiiiiiII;
    private boolean IIiiIiiiIIiIi;
    protected transient Icon iIiIiiiiIiIii;
    protected Color IiIIIiiiiIiiI;
    protected Color iiIiiiiiiiIii;
    private JTree IiiiiiiiIIIII;
    protected Color ALLATORIxDEMO;

    @Override
    public void paint(Graphics g) {
        Color IiiiiiiiIIIII;
        if (this.IIIiiiiiIIiII) {
            IiiiiiiiIIIII = DefaultLookup.getColor(this, this.ui, "Tree.dropCellBackground");
            if (IiiiiiiiIIIII == null) {
                IiiiiiiiIIIII = this.IiiIiiiiiiIiI();
            }
        } else if (this.IiIiiiiiIIIII) {
            IiiiiiiiIIIII = this.IiiIiiiiiiIiI();
        } else {
            IiiiiiiiIIIII = this.iIiIiiiiIIiii();
            if (IiiiiiiiIIIII == null) {
                IiiiiiiiIIIII = this.getBackground();
            }
        }
        int IiiiiiiiIIIII2 = -1;
        if (IiiiiiiiIIIII != null && this.iIIiIiiiiiiIi) {
            IiiiiiiiIIIII2 = this.ALLATORIxDEMO();
            g.setColor(IiiiiiiiIIIII);
            if (this.getComponentOrientation().isLeftToRight()) {
                g.fillRect(IiiiiiiiIIIII2, 0, this.getWidth() - IiiiiiiiIIIII2, this.getHeight());
            } else {
                g.fillRect(0, 0, this.getWidth() - IiiiiiiiIIIII2, this.getHeight());
            }
        }
        if (this.iiIIIiiiiiiiI) {
            if (this.IIiiIiiiIIiIi) {
                IiiiiiiiIIIII2 = 0;
            } else if (IiiiiiiiIIIII2 == -1) {
                IiiiiiiiIIIII2 = this.ALLATORIxDEMO();
            }
            if (this.getComponentOrientation().isLeftToRight()) {
                this.ALLATORIxDEMO(g, IiiiiiiiIIIII2, 0, this.getWidth() - IiiiiiiiIIIII2, this.getHeight(), IiiiiiiiIIIII);
            } else {
                this.ALLATORIxDEMO(g, 0, 0, this.getWidth() - IiiiiiiiIIIII2, this.getHeight(), IiiiiiiiIIIII);
            }
        }
        super.paint(g);
    }

    @Override
    public Component getTreeCellRendererComponent(JTree tree, Object value, boolean sel, boolean expanded, boolean leaf, int row, boolean hasFocus) {
        Object IiiiiiiiIIIII;
        DefaultMutableTreeNode IiiiiiiiIIIII2 = (DefaultMutableTreeNode)value;
        IIiIiiiiIiiIi IiiiiiiiIIIII3 = null;
        if (IiiiiiiiIIIII2.getUserObject() instanceof IIiIiiiiIiiIi) {
            IiiiiiiiIIIII3 = (IIiIiiiiIiiIi)IiiiiiiiIIIII2.getUserObject();
        }
        String IiiiiiiiIIIII4 = IiiiiiiiIIIII3 != null ? IiiiiiiiIIIII3.ALLATORIxDEMO() : tree.convertValueToText(value, sel, expanded, leaf, row, hasFocus);
        this.IiiiiiiiIIIII = tree;
        this.iiIIIiiiiiiiI = hasFocus;
        this.setText(IiiiiiiiIIIII4);
        Object IiiiiiiiIIIII5 = null;
        this.IIIiiiiiIIiII = false;
        JTree.DropLocation IiiiiiiiIIIII6 = tree.getDropLocation();
        if (IiiiiiiiIIIII3 != null && IiiiiiiiIIIII3.ALLATORIxDEMO() != null) {
            IiiiiiiiIIIII5 = IiiiiiiiIIIII3.ALLATORIxDEMO();
        } else if (IiiiiiiiIIIII6 != null && IiiiiiiiIIIII6.getChildIndex() == -1 && tree.getRowForPath(IiiiiiiiIIIII6.getPath()) == row) {
            IiiiiiiiIIIII = DefaultLookup.getColor(this, this.ui, "Tree.dropCellForeground");
            IiiiiiiiIIIII5 = IiiiiiiiIIIII != null ? IiiiiiiiIIIII : this.iIiIiiiiIIiIi();
            this.IIIiiiiiIIiII = true;
        } else {
            IIIIIiiiIiIii iIIIIiiiIiIii = this;
            IiiiiiiiIIIII5 = sel ? iIIIIiiiIiIii.iIiIiiiiIIiIi() : iIIIIiiiIiIii.iiiIiiiiiiIIi();
        }
        this.setForeground((Color)IiiiiiiiIIIII5);
        IiiiiiiiIIIII = null;
        if (IiiiiiiiIIIII3 != null && IiiiiiiiIIIII3.ALLATORIxDEMO() != null) {
            IiiiiiiiIIIII = IiiiiiiiIIIII3.ALLATORIxDEMO();
        } else if (leaf) {
            IiiiiiiiIIIII = this.iIiIiiiiIIiIi();
        } else {
            IIIIIiiiIiIii iIIIIiiiIiIii = this;
            IiiiiiiiIIIII = expanded ? iIIIIiiiIiIii.iIiIiiiiIIiii() : iIIIIiiiIiIii.IiiIiiiiiiIiI();
        }
        this.setFont(IiiiiiiiIIIII3 != null && IiiiiiiiIIIII3.ALLATORIxDEMO() != null ? IiiiiiiiIIIII3.ALLATORIxDEMO() : tree.getFont());
        if (!tree.isEnabled()) {
            this.setEnabled(false);
            Icon IiiiiiiiIIIII7 = UIManager.getLookAndFeel().getDisabledIcon(tree, (Icon)IiiiiiiiIIIII);
            if (IiiiiiiiIIIII7 != null) {
                IiiiiiiiIIIII = IiiiiiiiIIIII7;
            }
            this.setDisabledIcon((Icon)IiiiiiiiIIIII);
        } else {
            this.setEnabled(true);
            this.setIcon((Icon)IiiiiiiiIIIII);
        }
        this.setComponentOrientation(tree.getComponentOrientation());
        this.IiIiiiiiIIIII = sel;
        return this;
    }

    @Override
    public void firePropertyChange(String propertyName, byte oldValue, byte newValue) {
    }

    @Override
    public void revalidate() {
    }

    @Override
    public void firePropertyChange(String propertyName, int oldValue, int newValue) {
    }

    @Override
    public void repaint(long tm, int x, int y, int width, int height) {
    }

    public void IiiIiiiiiiIiI(Color newColor) {
        this.ALLATORIxDEMO = newColor;
    }

    @Override
    protected void firePropertyChange(String propertyName, Object oldValue, Object newValue) {
        if (propertyName != "text") {
            if (propertyName != "font") {
                if (propertyName != "foreground") return;
            }
            if (oldValue == newValue) return;
            if (this.getClientProperty("html") == null) return;
        }
        super.firePropertyChange(propertyName, oldValue, newValue);
    }

    public Icon iiiiiiiiIIiii() {
        return DefaultLookup.getIcon(this, this.ui, "Tree.closedIcon");
    }

    @Override
    public void firePropertyChange(String propertyName, double oldValue, double newValue) {
    }

    @Override
    public void setFont(Font font) {
        if (font instanceof FontUIResource) {
            font = null;
        }
        super.setFont(font);
    }

    public void iIiIiiiiIIiIi(Color newColor) {
        this.IiIIIiiiiIiiI = newColor;
    }

    @Override
    public void firePropertyChange(String propertyName, char oldValue, char newValue) {
    }

    public void iiiIiiiiiiIIi(Icon newIcon) {
        this.iiIiiiiiiIIiI = newIcon;
    }

    @Override
    public Dimension getPreferredSize() {
        Dimension IiiiiiiiIIIII = super.getPreferredSize();
        if (IiiiiiiiIIIII == null) return IiiiiiiiIIIII;
        IiiiiiiiIIIII = new Dimension(IiiiiiiiIIIII.width + 3, IiiiiiiiIIIII.height);
        return IiiiiiiiIIIII;
    }

    @Override
    public void firePropertyChange(String propertyName, long oldValue, long newValue) {
    }

    @Override
    public void updateUI() {
        super.updateUI();
        if (!this.IIIIiiiiiiiII || this.iIiIiiiiIIiIi() instanceof UIResource) {
            this.iIiIiiiiIIiii(DefaultLookup.getIcon(this, this.ui, "Tree.leafIcon"));
        }
        if (!this.IIIIiiiiiiiII || this.IiiIiiiiiiIiI() instanceof UIResource) {
            this.iiiIiiiiiiIIi(DefaultLookup.getIcon(this, this.ui, "Tree.closedIcon"));
        }
        if (!this.IIIIiiiiiiiII || this.iIiIiiiiIIiii() instanceof UIManager) {
            this.ALLATORIxDEMO(DefaultLookup.getIcon(this, this.ui, "Tree.openIcon"));
        }
        if (!this.IIIIiiiiiiiII || this.iIiIiiiiIIiIi() instanceof UIResource) {
            this.ALLATORIxDEMO(DefaultLookup.getColor(this, this.ui, "Tree.selectionForeground"));
        }
        if (!this.IIIIiiiiiiiII || this.iiiIiiiiiiIIi() instanceof UIResource) {
            this.IiiIiiiiiiIiI(DefaultLookup.getColor(this, this.ui, "Tree.textForeground"));
        }
        if (!this.IIIIiiiiiiiII || this.IiiIiiiiiiIiI() instanceof UIResource) {
            this.iiiIiiiiiiIIi(DefaultLookup.getColor(this, this.ui, "Tree.selectionBackground"));
        }
        if (!this.IIIIiiiiiiiII || this.iIiIiiiiIIiii() instanceof UIResource) {
            this.iIiIiiiiIIiIi(DefaultLookup.getColor(this, this.ui, "Tree.textBackground"));
        }
        if (!this.IIIIiiiiiiiII || this.ALLATORIxDEMO() instanceof UIResource) {
            this.iIiIiiiiIIiii(DefaultLookup.getColor(this, this.ui, "Tree.selectionBorderColor"));
        }
        this.IIiiIiiiIIiIi = DefaultLookup.getBoolean(this, this.ui, "Tree.drawsFocusBorderAroundIcon", false);
        this.iIiiIiiiIiIIi = DefaultLookup.getBoolean(this, this.ui, "Tree.drawDashedFocusIndicator", false);
        this.iIIiIiiiiiiIi = DefaultLookup.getBoolean(this, this.ui, "Tree.rendererFillBackground", true);
        Insets IiiiiiiiIIIII = DefaultLookup.getInsets(this, this.ui, "Tree.rendererMargins");
        if (IiiiiiiiIIIII != null) {
            this.setBorder(new EmptyBorder(IiiiiiiiIIIII.top, IiiiiiiiIIIII.left, IiiiiiiiIIIII.bottom, IiiiiiiiIIIII.right));
        }
        this.setName("Tree.cellRenderer");
    }

    public Icon IiiIiiiiiiIiI() {
        return this.iiIiiiiiiIIiI;
    }

    public Color IiiIiiiiiiIiI() {
        return this.iiiiIiiiIiiII;
    }

    public void iiiIiiiiiiIIi(Color newColor) {
        this.iiiiIiiiIiiII = newColor;
    }

    public Icon iIiIiiiiIIiIi() {
        return this.iIiIiiiiIiIii;
    }

    public void iIiIiiiiIIiii(Icon newIcon) {
        this.iIiIiiiiIiIii = newIcon;
    }

    @Override
    public void setBackground(Color color) {
        if (color instanceof ColorUIResource) {
            color = null;
        }
        super.setBackground(color);
    }

    @Override
    public void invalidate() {
    }

    @Override
    public void validate() {
    }

    public Color iIiIiiiiIIiIi() {
        return this.iiIiIiiiiIIIi;
    }

    private /* synthetic */ int ALLATORIxDEMO() {
        Icon IiiiiiiiIIIII = this.getIcon();
        if (IiiiiiiiIIIII == null) return 0;
        if (this.getText() == null) return 0;
        return IiiiiiiiIIIII.getIconWidth() + Math.max(0, this.getIconTextGap() - 1);
    }

    @Override
    public void repaint(Rectangle r) {
    }

    @Override
    public void firePropertyChange(String propertyName, short oldValue, short newValue) {
    }

    public void iIiIiiiiIIiii(Color newColor) {
        this.iiIiiiiiiiIii = newColor;
    }

    public Icon iiiIiiiiiiIIi() {
        return DefaultLookup.getIcon(this, this.ui, "Tree.openIcon");
    }

    public Icon iIiIiiiiIIiii() {
        return this.iIiiIiiiiiiII;
    }

    public Color iiiIiiiiiiIIi() {
        return this.ALLATORIxDEMO;
    }

    private /* synthetic */ void ALLATORIxDEMO(Graphics g, int x, int y, int w, int h, Color notColor) {
        Color IiiiiiiiIIIII = this.ALLATORIxDEMO();
        if (IiiiiiiiIIIII != null && (this.IiIiiiiiIIIII || !this.iIiiIiiiIiIIi)) {
            g.setColor(IiiiiiiiIIIII);
            g.drawRect(x, y, w - 1, h - 1);
        }
        if (!this.iIiiIiiiIiIIi) return;
        if (notColor == null) return;
        if (this.iiiIiiiiiiiIi != notColor) {
            this.iiiIiiiiiiiIi = notColor;
            this.iiiiIiiiIIiii = new Color(~notColor.getRGB());
        }
        g.setColor(this.iiiiIiiiIIiii);
        BasicGraphicsUtils.drawDashedRect(g, x, y, w, h);
    }

    public Icon ALLATORIxDEMO() {
        return DefaultLookup.getIcon(this, this.ui, "Tree.leafIcon");
    }

    @Override
    public void firePropertyChange(String propertyName, float oldValue, float newValue) {
    }

    @Override
    public Font getFont() {
        Font IiiiiiiiIIIII = super.getFont();
        if (IiiiiiiiIIIII != null) return IiiiiiiiIIIII;
        if (this.IiiiiiiiIIIII == null) return IiiiiiiiIIIII;
        IiiiiiiiIIIII = this.IiiiiiiiIIIII.getFont();
        return IiiiiiiiIIIII;
    }

    @Override
    public void repaint() {
    }

    @Override
    public void firePropertyChange(String propertyName, boolean oldValue, boolean newValue) {
    }

    public void ALLATORIxDEMO(Color newColor) {
        this.iiIiIiiiiIIIi = newColor;
    }

    public Color iIiIiiiiIIiii() {
        return this.IiIIIiiiiIiiI;
    }

    public Color ALLATORIxDEMO() {
        return this.iiIiiiiiiiIii;
    }

    public void ALLATORIxDEMO(Icon newIcon) {
        this.iIiiIiiiiiiII = newIcon;
    }
}
