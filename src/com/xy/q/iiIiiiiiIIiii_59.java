/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.a.IIIIiiiiIIIIi
 *  com.xy.a.q.iIiIIiiiiiiiI
 *  com.xy.entity.Mount
 *  com.xy.formula.BaseMountSH
 *  com.xy.game.RoleData
 *  com.xy.q.IIIiiiiiiiiIi
 *  com.xy.q.IiIIIiiiiIIiI
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.q.iIiIiiiiIiIII
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.v.IIiiIiiiiIIiI
 *  com.xy.w.IIIiiiiiIiIiI
 *  com.xy.w.IIiIiiiiIiiIi
 */
package com.xy.q;

import com.xy.a.a.IIIIiiiiIIIIi;
import com.xy.a.q.iIiIIiiiiiiiI;
import com.xy.entity.Mount;
import com.xy.formula.BaseMountSH;
import com.xy.game.RoleData;
import com.xy.q.IIIiiiiiiiiIi;
import com.xy.q.IiIIIiiiiIIiI;
import com.xy.q.IiiiIiiiiIiIi;
import com.xy.q.iIiIiiiiIiIII;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.v.IIiiIiiiiIIiI;
import com.xy.w.IIIiiiiiIiIiI;
import com.xy.w.IIiIiiiiIiiIi;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JComponent;
import javax.swing.JLabel;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class iiIiiiiiIIiii
extends JComponent
implements MouseListener {
    private boolean iiiIiiiiiiiIi;
    private IiiiIiiiiIiIi iIiiIiiiiiiII;
    private int IIiiIiiiIIiIi;
    private IIIiiiiiiiiIi iIiIiiiiIiIii;
    private IIIiiiiiIiIiI IiIIIiiiiIiiI;
    private boolean iiIiiiiiiiIii;
    private JLabel IiiiiiiiIIIII;
    private long ALLATORIxDEMO;

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (this.iiIiiiiiiiIii) {
            g.setColor(iIiIiiiiIiIII.iIiiIiiiiiiII);
            g.fillRect(0, 0, this.getWidth(), this.getHeight());
            return;
        }
        if (!this.iiiIiiiiiiiIi) return;
        g.setColor(iIiIiiiiIiIII.iiiIiiiiiiiIi);
        g.fillRect(0, 0, this.getWidth(), this.getHeight());
    }

    @Override
    public void mouseExited(MouseEvent e) {
        this.iiiIiiiiiiiIi = false;
    }

    @Override
    public void mousePressed(MouseEvent e) {
        if (this.iIiIiiiiIiIii == null) return;
        this.iIiIiiiiIiIii.ALLATORIxDEMO(this);
    }

    public long ALLATORIxDEMO() {
        return this.ALLATORIxDEMO;
    }

    public boolean ALLATORIxDEMO(int index, long selectId, Mount mount, RoleData roleData) {
        this.ALLATORIxDEMO = mount.getMid().longValue();
        this.iiIiiiiiiiIii = this.ALLATORIxDEMO == selectId;
        BaseMountSH IiiiiiiiIIIII = roleData.getMountSHByMountId(mount.getMountid().intValue());
        String IiiiiiiiIIIII2 = mount.getMountname();
        if (roleData.getLoginResult().getMount_id() == mount.getMountid()) {
            IiiiiiiiIIIII2 = String.valueOf(mount.getMountname()) + "(*)";
        }
        if (!IIiiIiiiiIIiI.ALLATORIxDEMO((String)IiiiiiiiIIIII2, (String)this.IiiiiiiiIIIII.getText())) {
            this.IiiiiiiiIIIII.setText(IiiiiiiiIIIII2);
        }
        if (this.IIiiIiiiIIiIi == (IiiiiiiiIIIII != null ? IiiiiiiiIIIII.getId() : 0)) return this.iiIiiiiiiiIii;
        iiIiiiiiIIiii iiIiiiiiIIiii2 = this;
        if (IiiiiiiiIIIII != null) {
            iiIiiiiiIIiii2.IIiiIiiiIIiIi = IiiiiiiiIIIII.getId();
            this.IiIIIiiiiIiiI.ALLATORIxDEMO(IIiIiiiiIiiIi.iIiIiiiiIIiii((int)(100 + this.IIiiIiiiIIiIi)));
            this.IiIIIiiiiIiiI.setVisible(true);
        } else {
            iiIiiiiiIIiii2.IIiiIiiiIIiIi = 0;
            this.IiIIIiiiiIiiI.iIiIiiiiIIiii();
            this.IiIIIiiiiIiiI.setVisible(false);
        }
        this.IIiiIiiiIIiIi = IiiiiiiiIIIII != null ? IiiiiiiiIIIII.getId() : 0;
        this.IiIIIiiiiIiiI.setVisible(this.IIiiIiiiIIiIi > 0);
        return this.iiIiiiiiiiIii;
    }

    public void iIiIiiiiIIiii(boolean inside) {
        this.iiiIiiiiiiiIi = inside;
    }

    public JLabel ALLATORIxDEMO() {
        return this.IiiiiiiiIIIII;
    }

    public void ALLATORIxDEMO(boolean select) {
        this.iiIiiiiiiiIii = select;
        if (!(this.iIiiIiiiiiiII instanceof iIiIIiiiiiiiI)) return;
        this.IiiiiiiiIIIII.setForeground(select ? Color.red : Color.white);
    }

    public void ALLATORIxDEMO() {
        this.ALLATORIxDEMO = 0L;
        this.iiIiiiiiiiIii = false;
        this.IiiiiiiiIIIII.setText(null);
        this.IiiiiiiiIIIII.setForeground(Color.white);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    public iiIiiiiiIIiii(IIIiiiiiiiiIi box) {
        this.iIiiIiiiiiiII = box.ALLATORIxDEMO();
        this.iIiIiiiiIiIii = box;
        this.setLayout(null);
        this.setBackground(iiIIiiiiIiiII.IIiIiiiiIIiII);
        this.IiiiiiiiIIIII = IiIIIiiiiIIiI.ALLATORIxDEMO((int)4, (int)1, (int)140, (int)18, (Color)Color.WHITE, (Font)iiIIiiiiIiiII.iIiIIiiiiIIiI);
        this.add(this.IiiiiiiiIIIII);
        this.IiIIIiiiiIiiI = new IIIiiiiiIiIiI();
        this.IiIIIiiiiIiiI.setBounds(150, 1, 18, 18);
        this.add((Component)this.IiIIIiiiiIiiI);
        this.addMouseListener(this);
    }

    public boolean ALLATORIxDEMO() {
        return this.iiiIiiiiiiiIi;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (!e.isMetaDown()) return;
        if (!(this.iIiiIiiiiiiII instanceof IIIIiiiiIIIIi)) return;
        this.iIiiIiiiiiiII.ALLATORIxDEMO().iiiIiiiiiiIIi(this.iIiiIiiiiiiII.iIiIiiiiIIiii());
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        this.iiiIiiiiiiiIi = true;
    }
}
