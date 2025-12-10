/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.a.IiiiiiiiiIIII
 *  com.xy.a.a.iiIiIiiiiIiii
 *  com.xy.a.q.iIIiiiiiIiIII
 *  com.xy.battle.BattleScene
 *  com.xy.battle.TypeState
 *  com.xy.d.IiIiIiiiiIIiI
 *  com.xy.entity.RoleSummoning
 *  com.xy.game.RoleData
 *  com.xy.game.RolePet
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.q.iIiIiiiiIiIII
 */
package com.xy.q;

import com.xy.a.a.IiiiiiiiiIIII;
import com.xy.a.a.iiIiIiiiiIiii;
import com.xy.a.q.iIIiiiiiIiIII;
import com.xy.battle.BattleScene;
import com.xy.battle.TypeState;
import com.xy.d.IiIiIiiiiIIiI;
import com.xy.entity.RoleSummoning;
import com.xy.game.RoleData;
import com.xy.game.RolePet;
import com.xy.q.IiiiIiiiiIiIi;
import com.xy.q.iIiIiiiiIiIII;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComponent;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class IIIIIiiiIIIiI
extends JComponent {
    private List<BigDecimal> iIiIiiiiIiIii;
    private List<RoleSummoning> IiIIIiiiiIiiI;
    private long iiIiiiiiiiIii;
    private IiiiIiiiiIiIi IiiiiiiiIIIII;
    private int ALLATORIxDEMO;

    public void ALLATORIxDEMO(iIiIiiiiIiIII petGrid) {
        this.iiIiiiiiiiIii = petGrid != null ? petGrid.ALLATORIxDEMO() : 0L;
        int IiiiiiiiIIIII = 0;
        int IiiiiiiiIIIII2 = this.getComponentCount();
        while (IiiiiiiiIIIII < IiiiiiiiIIIII2) {
            iIiIiiiiIiIII iIiIiiiiIiIII2 = (iIiIiiiiIiIII)this.getComponent(IiiiiiiiIIIII);
            iIiIiiiiIiIII2.ALLATORIxDEMO(iIiIiiiiIiIII2 == petGrid);
            ++IiiiiiiiIIIII;
        }
        RolePet IiiiiiiiIIIII22 = this.IiiiiiiiIIIII.ALLATORIxDEMO().getRolePet(petGrid != null ? petGrid.ALLATORIxDEMO() : 0L);
        if (this.IiiiiiiiIIIII instanceof iiIiIiiiiIiii) {
            ((iiIiIiiiiIiii)this.IiiiiiiiIIIII).ALLATORIxDEMO(IiiiiiiiIIIII22);
            return;
        }
        if (this.IiiiiiiiIIIII instanceof iIIiiiiiIiIII) {
            ((iIIiiiiiIiIII)this.IiiiiiiiIIIII).ALLATORIxDEMO(IiiiiiiiIIIII22);
            return;
        }
        if (!(this.IiiiiiiiIIIII instanceof IiiiiiiiiIIII)) return;
        ((IiiiiiiiiIIII)this.IiiiiiiiIIIII).ALLATORIxDEMO(IiiiiiiiIIIII22);
    }

    public void ALLATORIxDEMO(long selectId) {
        this.iiIiiiiiiiIii = selectId;
    }

    public RoleSummoning ALLATORIxDEMO() {
        if (this.iiIiiiiiiiIii == 0L) return null;
        if (this.IiIIIiiiiIiiI == null) {
            return null;
        }
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IiIIIiiiiIiiI.size()) {
            RoleSummoning IiiiiiiiIIIII2 = this.IiIIIiiiiIiiI.get(IiiiiiiiIIIII);
            if (IiiiiiiiIIIII2.getSid().longValue() == this.iiIiiiiiiiIii) {
                return IiiiiiiiIIIII2;
            }
            ++IiiiiiiiIIIII;
        }
        return null;
    }

    public IIIIIiiiIIIiI(IiiiIiiiiIiIi form) {
        this.IiiiiiiiIIIII = form;
    }

    public iIiIiiiiIiIII ALLATORIxDEMO() {
        int IiiiiiiiIIIII = 0;
        int IiiiiiiiIIIII2 = this.getComponentCount();
        while (IiiiiiiiIIIII < IiiiiiiiIIIII2) {
            iIiIiiiiIiIII IiiiiiiiIIIII3 = (iIiIiiiiIiIII)this.getComponent(IiiiiiiiIIIII);
            if (IiiiiiiiIIIII3.ALLATORIxDEMO() == this.iiIiiiiiiiIii) return IiiiiiiiIIIII3;
            ++IiiiiiiiIIIII;
        }
        return null;
    }

    public void ALLATORIxDEMO(List<RoleSummoning> list) {
        this.IiIIIiiiiIiiI = list;
        this.ALLATORIxDEMO();
    }

    public void iIiIiiiiIIiii() {
        IiIiIiiiiIIiI IiiiiiiiIIIII;
        RoleData IiiiiiiiIIIII2 = this.IiiiiiiiIIIII.ALLATORIxDEMO();
        if (IiiiiiiiIIIII2 == null) {
            return;
        }
        BattleScene IiiiiiiiIIIII3 = this.IiiiiiiiIIIII.iiIIiiiiIiIIi.getBattleScene();
        IiIiIiiiiIIiI iiIiIiiiiIIiI = IiiiiiiiIIIII = IiiiiiiiIIIII3 != null ? IiiiiiiiIIIII3.getBattleUnit(0, IiiiiiiiIIIII2.getRoleId()) : null;
        if (IiiiiiiiIIIII == null) {
            if (this.iIiIiiiiIiIii == null) return;
            this.iIiIiiiiIiIii.clear();
            return;
        }
        if (this.iIiIiiiiIiIii == null) {
            this.iIiIiiiiIiIii = new ArrayList<BigDecimal>();
        } else {
            this.iIiIiiiiIiIii.clear();
        }
        List IiiiiiiiIIIII4 = IiiiiiiiIIIII.ALLATORIxDEMO().ALLATORIxDEMO("\u53ec\u5524\u517d");
        int IiiiiiiiIIIII5 = 0;
        while (IiiiiiiiIIIII5 < IiiiiiiiIIIII4.size()) {
            if (((TypeState)IiiiiiiiIIIII4.get(IiiiiiiiIIIII5)).getState() != 0) {
                int IiiiiiiiIIIII6 = Integer.parseInt(((TypeState)IiiiiiiiIIIII4.get(IiiiiiiiIIIII5)).getType());
                this.iIiIiiiiIiIii.add(new BigDecimal(IiiiiiiiIIIII6));
            }
            ++IiiiiiiiIIIII5;
        }
    }

    public long ALLATORIxDEMO() {
        return this.iiIiiiiiiiIii;
    }

    public List<RoleSummoning> ALLATORIxDEMO() {
        return this.IiIIIiiiiIiiI;
    }

    public void ALLATORIxDEMO() {
        if (this.iIiIiiiiIIiii()) {
            return;
        }
        this.ALLATORIxDEMO(this.ALLATORIxDEMO());
    }

    public boolean iIiIiiiiIIiii() {
        if (this.IiIIIiiiiIiiI != null) {
            return this.ALLATORIxDEMO();
        }
        RoleData IiiiiiiiIIIII = this.IiiiiiiiIIIII.ALLATORIxDEMO();
        if (IiiiiiiiIIIII == null) {
            return false;
        }
        long IiiiiiiiIIIII2 = 0L;
        int IiiiiiiiIIIII3 = 0;
        int IiiiiiiiIIIII4 = this.getComponentCount();
        for (RolePet IiiiiiiiIIIII5 : IiiiiiiiIIIII.pets) {
            iIiIiiiiIiIII IiiiiiiiIIIII6;
            Component IiiiiiiiIIIII7 = IiiiiiiiIIIII3 < IiiiiiiiIIIII4 ? this.getComponent(IiiiiiiiIIIII3) : null;
            iIiIiiiiIiIII iIiIiiiiIiIII2 = IiiiiiiiIIIII6 = IiiiiiiiIIIII7 != null ? (iIiIiiiiIiIII)IiiiiiiiIIIII7 : null;
            if (IiiiiiiiIIIII6 == null) {
                IiiiiiiiIIIII6 = new iIiIiiiiIiIII(this);
                IiiiiiiiIIIII6.setBounds(0, 20 * IiiiiiiiIIIII3, this.getWidth(), 20);
                this.add((Component)IiiiiiiiIIIII6);
            }
            if (IiiiiiiiIIIII6.ALLATORIxDEMO(++IiiiiiiiIIIII3, this.iiIiiiiiiiIii, IiiiiiiiIIIII5.getPet(), IiiiiiiiIIIII, this.iIiIiiiiIiIii)) {
                IiiiiiiiIIIII2 = IiiiiiiiIIIII6.ALLATORIxDEMO();
            }
            IiiiiiiiIIIII6.setVisible(true);
        }
        int IiiiiiiiIIIII8 = IiiiiiiiIIIII3;
        while (IiiiiiiiIIIII8 < this.getComponentCount()) {
            Component component = this.getComponent(IiiiiiiiIIIII8);
            ++IiiiiiiiIIIII8;
            Component IiiiiiiiIIIII9 = component;
            component.setVisible(false);
        }
        if (IiiiiiiiIIIII3 != this.ALLATORIxDEMO) {
            this.ALLATORIxDEMO = IiiiiiiiIIIII3;
            if (this.IiiiiiiiIIIII instanceof iiIiIiiiiIiii) {
                ((iiIiIiiiiIiii)this.IiiiiiiiIIIII).ALLATORIxDEMO()[0].setText("\u53ec\u5524\u517d(" + this.ALLATORIxDEMO + "/21)");
            }
            this.setPreferredSize(new Dimension(this.getWidth(), IiiiiiiiIIIII3 * 20));
        }
        if (IiiiiiiiIIIII2 != 0L) return false;
        Component IiiiiiiiIIIII22 = this.getComponentCount() != 0 ? this.getComponent(0) : null;
        this.ALLATORIxDEMO(IiiiiiiiIIIII22 != null ? (iIiIiiiiIiIII)IiiiiiiiIIIII22 : null);
        if (IiiiiiiiIIIII22 == null) return false;
        return true;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (!this.IiiiiiiiIIIII.ALLATORIxDEMO().iIiIiiiiIIiii()) return;
        this.iIiIiiiiIIiii();
    }

    public boolean ALLATORIxDEMO() {
        RoleData IiiiiiiiIIIII = this.IiiiiiiiIIIII.ALLATORIxDEMO();
        if (IiiiiiiiIIIII == null) {
            return false;
        }
        long IiiiiiiiIIIII2 = 0L;
        int IiiiiiiiIIIII3 = 0;
        int IiiiiiiiIIIII4 = this.getComponentCount();
        for (RoleSummoning IiiiiiiiIIIII5 : this.IiIIIiiiiIiiI) {
            iIiIiiiiIiIII IiiiiiiiIIIII6;
            Component IiiiiiiiIIIII7 = IiiiiiiiIIIII3 < IiiiiiiiIIIII4 ? this.getComponent(IiiiiiiiIIIII3) : null;
            iIiIiiiiIiIII iIiIiiiiIiIII2 = IiiiiiiiIIIII6 = IiiiiiiiIIIII7 != null ? (iIiIiiiiIiIII)IiiiiiiiIIIII7 : null;
            if (IiiiiiiiIIIII6 == null) {
                IiiiiiiiIIIII6 = new iIiIiiiiIiIII(this);
                IiiiiiiiIIIII6.setBounds(0, 20 * IiiiiiiiIIIII3, this.getWidth(), 20);
                this.add((Component)IiiiiiiiIIIII6);
            }
            if (IiiiiiiiIIIII6.ALLATORIxDEMO(++IiiiiiiiIIIII3, this.iiIiiiiiiiIii, IiiiiiiiIIIII5, IiiiiiiiIIIII, this.iIiIiiiiIiIii)) {
                IiiiiiiiIIIII2 = IiiiiiiiIIIII6.ALLATORIxDEMO();
            }
            IiiiiiiiIIIII6.setVisible(true);
        }
        int IiiiiiiiIIIII8 = IiiiiiiiIIIII3;
        while (IiiiiiiiIIIII8 < this.getComponentCount()) {
            Component component = this.getComponent(IiiiiiiiIIIII8);
            ++IiiiiiiiIIIII8;
            Component IiiiiiiiIIIII9 = component;
            component.setVisible(false);
        }
        if (IiiiiiiiIIIII3 != this.ALLATORIxDEMO) {
            this.ALLATORIxDEMO = IiiiiiiiIIIII3;
            this.setPreferredSize(new Dimension(this.getWidth(), IiiiiiiiIIIII3 * 20));
        }
        if (IiiiiiiiIIIII2 != 0L) return false;
        Component IiiiiiiiIIIII22 = this.getComponentCount() != 0 ? this.getComponent(0) : null;
        this.ALLATORIxDEMO(IiiiiiiiIIIII22 != null ? (iIiIiiiiIiIII)IiiiiiiiIIIII22 : null);
        if (IiiiiiiiIIIII22 == null) return false;
        return true;
    }

    public IiiiIiiiiIiIi ALLATORIxDEMO() {
        return this.IiiiiiiiIIIII;
    }
}
