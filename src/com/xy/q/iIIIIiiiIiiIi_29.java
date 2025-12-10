/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.a.IIIIiiiiIIIIi
 *  com.xy.a.a.IiIIIiiiiIIiI
 *  com.xy.a.q.iIiIIiiiiiiiI
 *  com.xy.entity.Lingbao
 *  com.xy.entity.Mount
 *  com.xy.entity.RoleSummoning
 *  com.xy.game.RoleData
 *  com.xy.i.IiIiIiiiiIIiI
 *  com.xy.q.IIIiIiiiIiIII
 *  com.xy.q.IiIIIiiiiIIiI
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.q.iIiIiiiiIiIII
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.v.IIiiIiiiiIIiI
 */
package com.xy.q;

import com.xy.a.a.IIIIiiiiIIIIi;
import com.xy.a.q.iIiIIiiiiiiiI;
import com.xy.entity.Lingbao;
import com.xy.entity.Mount;
import com.xy.entity.RoleSummoning;
import com.xy.game.RoleData;
import com.xy.i.IiIiIiiiiIIiI;
import com.xy.q.IIIiIiiiIiIII;
import com.xy.q.IiIIIiiiiIIiI;
import com.xy.q.IiiiIiiiiIiIi;
import com.xy.q.iIiIiiiiIiIII;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.v.IIiiIiiiiIIiI;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.math.BigDecimal;
import javax.swing.JComponent;
import javax.swing.JLabel;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class iIIIIiiiIiiIi
extends JComponent
implements MouseListener {
    private IiIiIiiiiIIiI IiIiiiiiIIIII;
    private int iiIiIiiiiIIIi;
    private IIIiIiiiIiIII iiiiIiiiIiiII;
    private long iiiIiiiiiiiIi;
    private boolean iIiiIiiiiiiII;
    private JLabel IIiiIiiiIIiIi;
    private int iIiIiiiiIiIii;
    private JLabel IiIIIiiiiIiiI;
    private IiiiIiiiiIiIi iiIiiiiiiiIii;
    private boolean IiiiiiiiIIIII;
    private boolean ALLATORIxDEMO;

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (this.IiiiiiiiIIIII) {
            g.setColor(iIiIiiiiIiIII.iIiiIiiiiiiII);
            g.fillRect(0, 0, this.getWidth(), this.getHeight());
            return;
        }
        if (!this.iIiiIiiiiiiII) return;
        g.setColor(iIiIiiiiIiIII.iiiIiiiiiiiIi);
        g.fillRect(0, 0, this.getWidth(), this.getHeight());
    }

    public void ALLATORIxDEMO() {
        this.iIiIiiiiIiIii = 0;
        this.iiiIiiiiiiiIi = 0L;
        this.IiiiiiiiIIIII = false;
        this.ALLATORIxDEMO = false;
        this.IIiiIiiiIIiIi.setText(null);
        this.IIiiIiiiIIiIi.setForeground(Color.GREEN);
    }

    public boolean ALLATORIxDEMO(int index, long selectId, RoleSummoning pet, RoleData roleData) {
        this.iiiIiiiiiiiIi = pet.getSid().longValue();
        this.IiiiiiiiIIIII = this.iiiIiiiiiiiIi == selectId;
        this.ALLATORIxDEMO = pet.getPetlock() == 1;
        Mount IiiiiiiiIIIII = roleData.getPetMount(pet.getSid());
        String IiiiiiiiIIIII2 = pet.getSummoningname();
        if (!IIiiIiiiiIIiI.ALLATORIxDEMO((String)IiiiiiiiIIIII2, (String)this.IIiiIiiiIIiIi.getText())) {
            this.IIiiIiiiIIiIi.setText(IiiiiiiiIIIII2);
        }
        if (this.iiIiIiiiiIIIi != index) {
            this.iiIiIiiiiIIIi = index;
            this.IiIiiiiiIIIII.setText(String.valueOf(index));
        }
        this.IIiiIiiiIIiIi.setForeground(IiiiiiiiIIIII != null ? Color.GREEN : Color.white);
        this.IiIIIiiiiIiiI.setText(IiiiiiiiIIIII != null ? IiiiiiiiIIIII.getMountname() : null);
        return this.IiiiiiiiIIIII;
    }

    public long ALLATORIxDEMO() {
        return this.iiiIiiiiiiiIi;
    }

    public void ALLATORIxDEMO(long id, String name) {
        this.iiiIiiiiiiiIi = id;
        this.IIiiIiiiIIiIi.setText(name);
    }

    public int ALLATORIxDEMO() {
        return this.iiIiIiiiiIIIi;
    }

    public JLabel ALLATORIxDEMO() {
        return this.IIiiIiiiIIiIi;
    }

    public boolean ALLATORIxDEMO() {
        return this.iIiiIiiiiiiII;
    }

    @Override
    public void mouseExited(MouseEvent e) {
        this.iIiiIiiiiiiII = false;
    }

    /*
     * WARNING - void declaration
     */
    public void ALLATORIxDEMO(RoleSummoning roleSummoning) {
        void pet;
        this.iIiIiiiiIiIii = 0;
        this.iiiIiiiiiiiIi = pet != null ? pet.getSid().longValue() : 0L;
        this.IIiiIiiiIIiIi.setText(pet != null ? pet.getSummoningname() : null);
    }

    public void ALLATORIxDEMO(int index) {
        this.iiIiIiiiiIIIi = index;
        this.IiIiiiiiIIIII.setText(String.valueOf(index));
    }

    public void iIiIiiiiIIiii(boolean inside) {
        this.iIiiIiiiiiiII = inside;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (!e.isMetaDown()) return;
        if (this.iiIiiiiiiiIii instanceof IIIIiiiiIIIIi) {
            this.iiIiiiiiiiIii.ALLATORIxDEMO().iiiIiiiiiiIIi(this.iiIiiiiiiiIii.iIiIiiiiIIiii());
            return;
        }
        if (!(this.iiIiiiiiiiIii instanceof com.xy.a.a.IiIIIiiiiIIiI)) return;
        com.xy.a.a.IiIIIiiiiIIiI iiIIIiiiiIIiI = (com.xy.a.a.IiIIIiiiiIIiI)this.iiIiiiiiiiIii;
        iiIIIiiiiIIiI.ALLATORIxDEMO(new BigDecimal(this.iiiIiiiiiiiIi));
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        this.iIiiIiiiiiiII = true;
    }

    public iIIIIiiiIiiIi(IiiiIiiiiIiIi form) {
        this.iiIiiiiiiiIii = form;
        this.setLayout(null);
        this.setBackground(iiIIiiiiIiiII.IIiIiiiiIIiII);
        this.IiIiiiiiIIIII = new IiIiIiiiiIIiI("sc/c/81", 1, 6, iiIIiiiiIiiII.iiIiiiiiiIIiI, null, null, form);
        this.IiIiiiiiIIIII.setBounds(3, 1, 18, 18);
        this.IiIiiiiiIIIII.ALLATORIxDEMO((Object)this);
        this.add((Component)this.IiIiiiiiIIIII);
        this.IIiiIiiiIIiIi = IiIIIiiiiIIiI.ALLATORIxDEMO((int)24, (int)2, (int)110, (int)16, (Color)Color.GREEN, (Font)iiIIiiiiIiiII.iiIiiiiiiiiiI);
        this.add(this.IIiiIiiiIIiIi);
        this.IiIIIiiiiIiiI = IiIIIiiiiIIiI.ALLATORIxDEMO((int)129, (int)2, (int)110, (int)16, (Color)Color.GREEN, (Font)iiIIiiiiIiiII.iiIiiiiiiiiiI);
        this.add(this.IiIIIiiiiIiiI);
        this.addMouseListener(this);
    }

    public iIIIIiiiIiiIi(IIIiIiiiIiIII box) {
        this.iiIiiiiiiiIii = box.ALLATORIxDEMO();
        this.iiiiIiiiIiiII = box;
        this.setLayout(null);
        this.setBackground(iiIIiiiiIiiII.IIiIiiiiIIiII);
        this.IiIiiiiiIIIII = new IiIiIiiiiIIiI("sc/c/81", 1, 6, iiIIiiiiIiiII.iiIiiiiiiIIiI, null, null, this.iiIiiiiiiiIii);
        this.IiIiiiiiIIIII.setBounds(3, 1, 18, 18);
        this.IiIiiiiiIIIII.ALLATORIxDEMO((Object)this);
        this.add((Component)this.IiIiiiiiIIIII);
        this.IIiiIiiiIIiIi = IiIIIiiiiIIiI.ALLATORIxDEMO((int)24, (int)2, (int)110, (int)16, (Color)Color.GREEN, (Font)iiIIiiiiIiiII.iiIiiiiiiiiiI);
        this.add(this.IIiiIiiiIIiIi);
        if (this.iiIiiiiiiiIii instanceof com.xy.a.a.IiIIIiiiiIIiI) {
            this.IiIIIiiiiIiiI = IiIIIiiiiIIiI.ALLATORIxDEMO((int)260, (int)2, (int)110, (int)16, (Color)Color.GREEN, (Font)iiIIiiiiIiiII.iiIiiiiiiiiiI);
            this.add(this.IiIIIiiiiIiiI);
        } else {
            this.IiIIIiiiiIiiI = IiIIIiiiiIIiI.ALLATORIxDEMO((int)129, (int)2, (int)110, (int)16, (Color)Color.GREEN, (Font)iiIIiiiiIiiII.iiIiiiiiiiiiI);
            this.add(this.IiIIIiiiiIiiI);
        }
        this.addMouseListener(this);
    }

    /*
     * WARNING - void declaration
     */
    public void ALLATORIxDEMO(Lingbao lingbao) {
        void lingbao2;
        this.iIiIiiiiIiIii = 1;
        this.iiiIiiiiiiiIi = lingbao2 != null ? lingbao2.getBaoid().longValue() : 0L;
        this.IIiiIiiiIIiIi.setText(lingbao2 != null ? lingbao2.getBaoname() : null);
    }

    @Override
    public void mousePressed(MouseEvent e) {
        if (this.iiiiIiiiIiiII == null) return;
        this.iiiiIiiiIiiII.ALLATORIxDEMO(this);
    }

    public void ALLATORIxDEMO(boolean select) {
        this.IiiiiiiiIIIII = select;
        if (!(this.iiIiiiiiiiIii instanceof iIiIIiiiiiiiI)) return;
        this.IIiiIiiiIIiIi.setForeground(select ? Color.red : Color.white);
    }
}
