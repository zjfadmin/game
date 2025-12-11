/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.IIIiIiiiIiIii
 *  com.xy.a.IIIiIiiiiIIiI
 *  com.xy.a.a.iiIiIiiiiiiiI
 *  com.xy.a.i.WorkshopBtn
 *  com.xy.a.iiIIiiiiIiIiI
 *  com.xy.a.q.IiIIIiiiiiiIi
 *  com.xy.a.v.iiIiIiiiiIiIi
 *  com.xy.a.v.iiIiIiiiiiIIi
 *  com.xy.i.IIiiIiiiiIIiI
 *  com.xy.q.IIiiiiiiIiIii
 *  com.xy.q.IiIIIiiiiIIiI
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.q.iIiIiiiiiiiIi
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.q.iiiIIiiiIIIii
 *  com.xy.w.IIIIIiiiIiIii
 *  com.xy.w.IIIIIiiiIiiII
 *  com.xy.w.IIIiiiiiIiIiI
 */
package com.xy.q;

import com.xy.a.IIIiIiiiIiIii;
import com.xy.a.IIIiIiiiiIIiI;
import com.xy.a.a.iiIiIiiiiiiiI;
import com.xy.a.iiIIiiiiIiIiI;
import com.xy.a.q.IiIIIiiiiiiIi;
import com.xy.a.v.iiIiIiiiiIiIi;
import com.xy.a.v.iiIiIiiiiiIIi;
import com.xy.i.IIiiIiiiiIIiI;
import com.xy.q.IIiiiiiiIiIii;
import com.xy.q.IiIIIiiiiIIiI;
import com.xy.q.IiiiIiiiiIiIi;
import com.xy.q.iIiIiiiiiiiIi;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.q.iiiIIiiiIIIii;
import com.xy.w.IIIIIiiiIiIii;
import com.xy.w.IIIIIiiiIiiII;
import com.xy.w.IIIiiiiiIiIiI;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.math.BigDecimal;
import javax.swing.DefaultListModel;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.event.ListSelectionListener;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class IIIiIiiiiIiII
extends JComponent {
    private IIIiiiiiIiIiI iiiiIiiiIIiii;
    private int iIIiIiiiiiiIi = 20;
    private int IIIIiiiiiiiII;
    private boolean iiIIIiiiiiiiI;
    private IIiiIiiiiIIiI IiIiiiiiIIIII;
    private int iiIiIiiiiIIIi;
    private DefaultListModel<iiiIIiiiIIIii> iiiiIiiiIiiII;
    private IiiiIiiiiIiIi iiiIiiiiiiiIi;
    private int iIiiIiiiiiiII;
    private int IIiiIiiiIIiIi;
    private JLabel iIiIiiiiIiIii;
    private int IiIIIiiiiIiiI;
    private int iiIiiiiiiiIii;
    private JList<iiiIIiiiIIIii> IiiiiiiiIIIII;
    private JScrollPane ALLATORIxDEMO;

    public void iIiIiiiiIIiii(boolean down) {
        this.iiIIIiiiiiiiI = down;
    }

    public void iiiIiiiiiiIIi(iiiIIiiiIIIii node) {
        this.iiiiIiiiIiiII.addElement(node);
    }

    public void ALLATORIxDEMO(boolean flag) {
        if (this.iiiIiiiiiiiIi != null) {
            // empty if block
        }
        this.ALLATORIxDEMO.setVisible(flag);
        this.setBounds(this.IiIIIiiiiIiiI, this.iiIiiiiiiiIii, this.iIiiIiiiiiiII, this.iiIiIiiiiIIIi);
    }

    public JList<iiiIIiiiIIIii> ALLATORIxDEMO() {
        return this.IiiiiiiiIIIII;
    }

    /*
     * WARNING - void declaration
     */
    public IIIiIiiiiIiII(int n, int n2, IiiiIiiiiIiIi iiiiIiiiiIiIi) {
        void form;
        void maxHeight;
        void style;
        this.IIIIiiiiiiiII = style;
        this.IIiiIiiiIIiIi = maxHeight;
        this.iiiIiiiiiiiIi = form;
        this.iiIIIiiiiiiiI = false;
        this.iIIiIiiiiiiIi = style == true ? 21 : 20;
        this.iiiiIiiiIIiii = new IIIiiiiiIiIiI(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/17.png", (int)6, (int)6, (int)6, (int)6, (boolean)false));
        this.iIiIiiiiIiIii = IiIIIiiiiIIiI.ALLATORIxDEMO((int)0, (int)0, (int)0, (int)0, (Color)(style == true ? Color.black : Color.white), (Font)(style == 2 ? iiIIiiiiIiiII.iIIIiiiiIIIii : iiIIiiiiIiiII.iiIiIiiiIiiII));
        this.iIiIiiiiIiIii.setHorizontalAlignment(style == 2 ? 10 : 0);
        this.IiIiiiiiIIIII = new IIiiiiiiIiIii(this, style == 2 ? "sc/e/48.png" : "sc/b/B43.png", 1, (IiiiIiiiiIiIi)form);
        this.iiiiIiiiIiiII = new DefaultListModel();
        this.IiiiiiiiIIIII = new JList();
        IiIIIiiiiIIiI.ALLATORIxDEMO(this.IiiiiiiiIIIII, (Color)Color.white, (Font)iiIIiiiiIiiII.ALLATORIxDEMO);
        this.IiiiiiiiIIIII.setModel(this.iiiiIiiiIiiII);
        this.IiiiiiiiIIIII.addListSelectionListener((ListSelectionListener)new iIiIiiiiiiiIi(this));
        this.ALLATORIxDEMO = IiIIIiiiiIIiI.ALLATORIxDEMO((int)0, (int)0, (int)0, (int)0, this.IiiiiiiiIIIII, (int)-1);
        this.ALLATORIxDEMO.setVisible(false);
        this.add(this.ALLATORIxDEMO);
        this.add((Component)this.IiIiiiiiIIIII);
        this.add(this.iIiIiiiiIiIii);
        this.add((Component)this.iiiiIiiiIIiii);
    }

    public IIIiIiiiiIiII() {
        this(0, 100, null);
    }

    static /* synthetic */ JScrollPane ALLATORIxDEMO(IIIiIiiiiIiII arg0) {
        return arg0.ALLATORIxDEMO;
    }

    public JLabel ALLATORIxDEMO() {
        return this.iIiIiiiiIiIii;
    }

    public void ALLATORIxDEMO(Object data) {
        int IiiiiiiiIIIII = 0;
        int IiiiiiiiIIIII2 = this.iiiiIiiiIiiII.getSize();
        while (IiiiiiiiIIIII < IiiiiiiiIIIII2) {
            iiiIIiiiIIIii IiiiiiiiIIIII3 = this.iiiiIiiiIiiII.get(IiiiiiiiIIIII);
            if (data.equals(IiiiiiiiIIIII3.ALLATORIxDEMO())) {
                this.IiiiiiiiIIIII.setSelectedIndex(IiiiiiiiIIIII);
                return;
            }
            ++IiiiiiiiIIIII;
        }
        this.IiiiiiiiIIIII.setSelectedIndex(0);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    protected void paintComponent(Graphics g) {
        void IiiiiiiiIIIII;
        super.paintComponent(g);
        if (!this.ALLATORIxDEMO.isVisible()) return;
        Graphics2D graphics2D = (Graphics2D)g;
        IiiiiiiiIIIII.setComposite(IIIIIiiiIiIii.iIiiIiiiiiiII);
        IiiiiiiiIIIII.setColor(Color.BLACK);
        IiiiiiiiIIIII.fillRect(this.ALLATORIxDEMO.getX(), this.ALLATORIxDEMO.getY(), this.ALLATORIxDEMO.getWidth(), this.ALLATORIxDEMO.getHeight());
        IiiiiiiiIIIII.setComposite(IIIIIiiiIiIii.iIiiIiiiIiIIi);
    }

    static /* synthetic */ JList ALLATORIxDEMO(IIIiIiiiiIiII arg0) {
        return arg0.IiiiiiiiIIIII;
    }

    @Override
    public void setBounds(int x, int y, int width, int height) {
        if (this.ALLATORIxDEMO.isVisible()) {
            this.iiiiIiiiIIiii.setBounds(0, this.iiIIIiiiiiiiI ? 0 : this.IIiiIiiiIIiIi - this.iIIiIiiiiiiIi, this.iIiiIiiiiiiII, this.iIIiIiiiiiiIi);
            if (this.IIIIiiiiiiiII == 2) {
                this.iIiIiiiiIiIii.setBounds(0, this.iiIIIiiiiiiiI ? 0 : this.IIiiIiiiIIiIi - this.iIIiIiiiiiiIi, this.iIiiIiiiiiiII - 18, this.iIIiIiiiiiiIi);
                this.IiIiiiiiIIIII.setBounds(this.iIiiIiiiiiiII - this.iIIiIiiiiiiIi + 1, this.iiIIIiiiiiiiI ? 1 : this.IIiiIiiiIIiIi - this.iIIiIiiiiiiIi + 1, 18, 18);
            } else if (this.IIIIiiiiiiiII == 1) {
                this.iIiIiiiiIiIii.setBounds(8, this.iiIIIiiiiiiiI ? 0 : this.IIiiIiiiIIiIi - this.iIIiIiiiiiiIi, this.iIiiIiiiiiiII - 8 - 23, this.iIIiIiiiiiiIi);
                this.IiIiiiiiIIIII.setBounds(this.iIiiIiiiiiiII - this.iIIiIiiiiiiIi - 2, this.iiIIIiiiiiiiI ? 0 : this.IIiiIiiiIIiIi - this.iIIiIiiiiiiIi, 23, 21);
            } else {
                this.iIiIiiiiIiIii.setBounds(0, this.iiIIIiiiiiiiI ? 0 : this.IIiiIiiiIIiIi - this.iIIiIiiiiiiIi, this.iIiiIiiiiiiII - 18, this.iIIiIiiiiiiIi);
                this.IiIiiiiiIIIII.setBounds(this.iIiiIiiiiiiII - this.iIIiIiiiiiiIi + 2, this.iiIIIiiiiiiiI ? 2 : this.IIiiIiiiIIiIi - this.iIIiIiiiiiiIi + 2, 17, 17);
            }
            this.ALLATORIxDEMO.setBounds(0, this.iiIIIiiiiiiiI ? this.iIIiIiiiiiiIi : 0, this.iIiiIiiiiiiII, this.IIiiIiiiIIiIi - this.iIIiIiiiiiiIi);
            super.setBounds(this.IiIIIiiiiIiiI, this.iiIIIiiiiiiiI ? this.iiIiiiiiiiIii : this.iiIiiiiiiiIii - this.IIiiIiiiIIiIi + this.iIIiIiiiiiiIi, this.iIiiIiiiiiiII, this.IIiiIiiiIIiIi);
            return;
        }
        this.iiiiIiiiIIiii.setBounds(0, 0, this.iIiiIiiiiiiII, this.iIIiIiiiiiiIi);
        if (this.IIIIiiiiiiiII == 2) {
            this.iIiIiiiiIiIii.setBounds(0, 0, this.iIiiIiiiiiiII - 18, this.iIIiIiiiiiiIi);
            this.IiIiiiiiIIIII.setBounds(this.iIiiIiiiiiiII - this.iIIiIiiiiiiIi + 1, 1, 18, 18);
        } else if (this.IIIIiiiiiiiII == 1) {
            this.iIiIiiiiIiIii.setBounds(8, 0, this.iIiiIiiiiiiII - 8 - 23, this.iIIiIiiiiiiIi);
            this.IiIiiiiiIIIII.setBounds(this.iIiiIiiiiiiII - this.iIIiIiiiiiiIi - 2, 0, 23, 21);
        } else {
            this.iIiIiiiiIiIii.setBounds(0, 0, this.iIiiIiiiiiiII - 18, this.iIIiIiiiiiiIi);
            this.IiIiiiiiIIIII.setBounds(this.iIiiIiiiiiiII - this.iIIiIiiiiiiIi + 2, 2, 17, 17);
        }
        super.setBounds(this.IiIIIiiiiIiiI, this.iiIiiiiiiiIii, this.iIiiIiiiiiiII, this.iiIiIiiiiIIIi);
    }

    public void iIiIiiiiIIiii(iiiIIiiiIIIii item) {
        if (this.iiiIiiiiiiiIi != null && this.iiiIiiiiiiiIi instanceof IIIiIiiiIiIii && !((IIIiIiiiIiIii)this.iiiIiiiiiiiIi).ALLATORIxDEMO(item.ALLATORIxDEMO())) {
            this.IiiiiiiiIIIII.clearSelection();
            return;
        }
        if (this.iiiIiiiiiiiIi != null && this.iiiIiiiiiiiIi instanceof iiIiIiiiiiIIi) {
            ((iiIiIiiiiiIIi)this.iiiIiiiiiiiIi).iIiIiiiiIIiii(((Integer)item.ALLATORIxDEMO()).intValue());
            return;
        }
        if (this.iiiIiiiiiiiIi != null && this.iiiIiiiiiiiIi instanceof iiIiIiiiiIiIi) {
            ((iiIiIiiiiIiIi)this.iiiIiiiiiiiIi).iIiIiiiiIIiii(((Integer)item.ALLATORIxDEMO()).intValue());
            return;
        }
        this.iIiIiiiiIiIii.setText(item.ALLATORIxDEMO());
        if (this.iiiIiiiiiiiIi == null) {
            return;
        }
        if (this.iiiIiiiiiiiIi instanceof IiIIIiiiiiiIi) {
            ((IiIIIiiiiiiIi)this.iiiIiiiiiiiIi).ALLATORIxDEMO((BigDecimal)item.ALLATORIxDEMO());
            return;
        }
        if (this.iiiIiiiiiiiIi instanceof com.xy.a.i.WorkshopBtn) {
            ((com.xy.a.i.WorkshopBtn)this.iiiIiiiiiiiIi).ALLATORIxDEMO((BigDecimal)item.ALLATORIxDEMO());
            return;
        }
        if (this.iiiIiiiiiiiIi instanceof iiIIiiiiIiIiI) {
            ((iiIIiiiiIiIiI)this.iiiIiiiiiiiIi).ALLATORIxDEMO(((Long)item.ALLATORIxDEMO()).longValue());
            return;
        }
        if (this.iiiIiiiiiiiIi instanceof IIIiIiiiiIIiI) {
            ((IIIiIiiiiIIiI)this.iiiIiiiiiiiIi).ALLATORIxDEMO(((Long)item.ALLATORIxDEMO()).longValue(), this);
            return;
        }
        if (!(this.iiiIiiiiiiiIi instanceof iiIiIiiiiiiiI)) return;
        ((iiIiIiiiiiiiI)this.iiiIiiiiiiiIi).iIiIiiiiIIiIi(item.ALLATORIxDEMO());
    }

    public void ALLATORIxDEMO(iiiIIiiiIIIii node) {
        this.iiiiIiiiIiiII.addElement(node);
        if (this.iiiiIiiiIiiII.size() != 1) return;
        this.IiiiiiiiIIIII.setSelectedIndex(0);
    }

    public void iIiIiiiiIIiii(int maxHeight) {
        this.IIiiIiiiIIiIi = maxHeight;
    }

    public void ALLATORIxDEMO(int index) {
        this.IiiiiiiiIIIII.setSelectedIndex(index);
    }

    public DefaultListModel<iiiIIiiiIIIii> ALLATORIxDEMO() {
        return this.iiiiIiiiIiiII;
    }

    /*
     * WARNING - void declaration
     */
    public void ALLATORIxDEMO(int n, int n2, int n3, int n4) {
        void dh;
        void dw;
        void dy;
        void dx;
        this.IiIIIiiiiIiiI = dx;
        this.iiIiiiiiiiIii = dy;
        this.iIiiIiiiiiiII = dw;
        this.iiIiIiiiiIIIi = dh;
        this.setBounds((int)dx, (int)dy, (int)dw, (int)dh);
    }

    /*
     * WARNING - void declaration
     */
    public void ALLATORIxDEMO(String string) {
        void item;
        this.ALLATORIxDEMO(new iiiIIiiiIIIii((String)item, null));
    }

    public iiiIIiiiIIIii ALLATORIxDEMO() {
        return this.IiiiiiiiIIIII.getSelectedValue();
    }

    public int ALLATORIxDEMO() {
        return this.IiiiiiiiIIIII.getSelectedIndex();
    }
}
