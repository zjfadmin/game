/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.game.RoleData
 *  com.xy.q.IIiIiiiiiiiII
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.readbean.Goodstable
 *  com.xy.v.IIiiIiiiiIIiI
 */
package com.xy.q;

import com.xy.game.RoleData;
import com.xy.q.IIiIiiiiiiiII;
import com.xy.q.IiiiIiiiiIiIi;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.readbean.Goodstable;
import com.xy.v.IIiiIiiiiIIiI;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.math.BigDecimal;
import javax.swing.JComponent;
import javax.swing.JLabel;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class IiiIiiiiIIIiI
extends JComponent
implements MouseListener {
    private JLabel iiIIIiiiiiiiI;
    private int IiIiiiiiIIIII;
    public static Color iiIiIiiiiIIIi;
    private boolean iiiiIiiiIiiII;
    public static Color iiiIiiiiiiiIi;
    private IiiiIiiiiIiIi iIiiIiiiiiiII;
    private BigDecimal IIiiIiiiIIiIi;
    private int iIiIiiiiIiIii;
    public static Color IiIIIiiiiIiiI;
    private long iiIiiiiiiiIii;
    private IIiIiiiiiiiII IiiiiiiiIIIII;
    private boolean ALLATORIxDEMO;

    public boolean ALLATORIxDEMO() {
        return this.ALLATORIxDEMO;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void setVisible(boolean aFlag) {
        if (aFlag == this.isVisible()) return;
        this.show(aFlag);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        this.ALLATORIxDEMO = false;
    }

    public void ALLATORIxDEMO() {
        this.IiIiiiiiIIIII = 0;
        this.iiIiiiiiiiIii = 0L;
        this.iiiiIiiiIiiII = false;
        this.iiIIIiiiiiiiI.setText(null);
        this.iiIIIiiiiiiiI.setForeground(Color.GREEN);
    }

    public void ALLATORIxDEMO(int index) {
        this.iIiIiiiiIiIii = index;
    }

    public boolean ALLATORIxDEMO(int index, long selectId, Goodstable good, RoleData roleData) {
        if (this.IIiiIiiiIIiIi == good.getRgid()) {
            this.iiiiIiiiIiiII = this.iiIiiiiiiiIii == selectId;
            return this.iiiiIiiiIiiII;
        }
        this.IIiiIiiiIIiIi = good.getRgid();
        this.iiIiiiiiiiIii = good.getRgid().longValue();
        this.iiiiIiiiIiiII = this.iiIiiiiiiiIii == selectId;
        String IiiiiiiiIIIII = IIiiIiiiiIIiI.iIiIiiiiIIiii((String)good.getValue(), (String)"\u6280\u80fd=", (String)"|");
        if (IIiiIiiiiIIiI.ALLATORIxDEMO((String)IiiiiiiiIIIII, (String)this.iiIIIiiiiiiiI.getText())) return this.iiiiIiiiIiiII;
        this.iiIIIiiiiiiiI.setText(IiiiiiiiIIIII);
        return this.iiiiIiiiIiiII;
    }

    public IiiIiiiiIIIiI(IiiiIiiiiIiIi form) {
        this.iIiiIiiiiiiII = form;
        this.setLayout(null);
        this.setBackground(iiIIiiiiIiiII.IIiIiiiiIIiII);
        this.iiIIIiiiiiiiI = new JLabel();
        this.iiIIIiiiiiiiI.setFont(iiIIiiiiIiiII.iiIiiiiiiiiiI);
        this.iiIIIiiiiiiiI.setForeground(Color.GREEN);
        this.iiIIIiiiiiiiI.setBounds(24, 2, 110, 16);
        this.add(this.iiIIIiiiiiiiI);
        this.addMouseListener(this);
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        this.ALLATORIxDEMO = true;
    }

    static {
        iiiIiiiiiiiIi = new Color(203, 181, 91);
        iiIiIiiiiIIIi = new Color(75, 165, 145, 180);
        IiIIIiiiiIiiI = new Color(153, 153, 153, 150);
    }

    public IiiIiiiiIIIiI(IIiIiiiiiiiII goodBox) {
        this.iIiiIiiiiiiII = goodBox.ALLATORIxDEMO();
        this.IiiiiiiiIIIII = goodBox;
        this.setLayout(null);
        this.setBackground(iiIIiiiiIiiII.IIiIiiiiIIiII);
        this.iiIIIiiiiiiiI = new JLabel();
        this.iiIIIiiiiiiiI.setFont(iiIIiiiiIiiII.iiIiiiiiiiiiI);
        this.iiIIIiiiiiiiI.setForeground(Color.GREEN);
        this.iiIIIiiiiiiiI.setBounds(4, 2, 130, 16);
        this.add(this.iiIIIiiiiiiiI);
        this.addMouseListener(this);
    }

    public int ALLATORIxDEMO() {
        return this.iIiIiiiiIiIii;
    }

    public void ALLATORIxDEMO(long id, String name) {
        this.iiIiiiiiiiIii = id;
        this.iiIIIiiiiiiiI.setText(name);
    }

    @Override
    public void mousePressed(MouseEvent e) {
        if (this.IiiiiiiiIIIII == null) return;
        this.IiiiiiiiIIIII.ALLATORIxDEMO(this);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (this.iiiiIiiiIiiII) {
            g.setColor(iiIiIiiiiIIIi);
            g.fillRect(0, 0, this.getWidth(), this.getHeight());
            return;
        }
        if (!this.ALLATORIxDEMO) return;
        g.setColor(IiIIIiiiiIiiI);
        g.fillRect(0, 0, this.getWidth(), this.getHeight());
    }

    public void iIiIiiiiIIiii(boolean inside) {
        this.ALLATORIxDEMO = inside;
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    public BigDecimal ALLATORIxDEMO() {
        return this.IIiiIiiiIIiIi;
    }

    public void ALLATORIxDEMO(boolean select) {
        this.iiiiIiiiIiiII = select;
    }

    public long ALLATORIxDEMO() {
        return this.iiIiiiiiiiIii;
    }

    /*
     * WARNING - void declaration
     */
    public void ALLATORIxDEMO(Goodstable goodstable) {
        void good;
        this.IiIiiiiiIIIII = 0;
        this.iiIiiiiiiiIii = good != null ? good.getRgid().longValue() : 0L;
        this.iiIIIiiiiiiiI.setText(good != null ? good.getGoodsname() : null);
    }

    public JLabel ALLATORIxDEMO() {
        return this.iiIIIiiiiiiiI;
    }
}
