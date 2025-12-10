/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.IiIiIiiiIIiiI
 *  com.xy.a.iiIiiiiiIIiiI
 *  com.xy.bean.LoginResult
 *  com.xy.d.IiIiIiiiiIIiI
 *  com.xy.entity.RoleSummoning
 *  com.xy.formula.PetProperty
 *  com.xy.game.RoleData
 *  com.xy.q.iiIiIiiiIiIiI
 *  com.xy.v.IiiiIiiiiIIII
 *  com.xy.w.IIIIIiiiIiiII
 */
package com.xy.a;

import com.xy.a.IiIiIiiiIIiiI;
import com.xy.a.iiIiiiiiIIiiI;
import com.xy.bean.LoginResult;
import com.xy.d.IiIiIiiiiIIiI;
import com.xy.entity.RoleSummoning;
import com.xy.formula.PetProperty;
import com.xy.game.RoleData;
import com.xy.q.iiIiIiiiIiIiI;
import com.xy.v.IiiiIiiiiIIII;
import com.xy.w.IIIIIiiiIiiII;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JComponent;

/*
 * Exception performing whole class analysis ignored.
 */
static class IIIIiiiiIIiII
extends JComponent
implements MouseListener,
MouseMotionListener {
    private int iiIiiiiiiIIiI;
    private int iIiiIiiiIiIIi;
    private int iiiiIiiiIIiii;
    private int iIIiIiiiiiiIi;
    private int IIIIiiiiiiiII;
    final /* synthetic */ IiIiIiiiIIiiI iiIIIiiiiiiiI;
    private int IiIiiiiiIIIII;
    private int iiIiIiiiiIIIi;
    private int iiiiIiiiIiiII;
    private boolean iiiIiiiiiiiIi;
    private int iIiiIiiiiiiII;
    private int IIiiIiiiIIiIi;
    private int iIiIiiiiIiIii;
    private int IiIIIiiiiIiiI;
    private int iiIiiiiiiiIii;
    private int IiiiiiiiIIIII;
    private int ALLATORIxDEMO;

    public void ALLATORIxDEMO(int type, double xs) {
        int IiiiiiiiIIIII = (int)(xs * (double)this.iIiiIiiiiiiII);
        if (IiiiiiiiIIIII < 0) {
            IiiiiiiiIIIII = 0;
        } else if (IiiiiiiiIIIII > this.iIiiIiiiiiiII) {
            IiiiiiiiIIIII = this.iIiiIiiiiiiII;
        }
        if (type == 0) {
            this.IIiiIiiiIIiIi = IiiiiiiiIIIII;
            return;
        }
        if (type == 1) {
            this.iiiiIiiiIIiii = IiiiiiiiIIIII;
            return;
        }
        if (type != 2) return;
        this.IiiiiiiiIIIII = IiiiiiiiIIIII;
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        this.iiiIiiiiiiiIi = Boolean.TRUE;
        int IiiiiiiiIIIII = this.ALLATORIxDEMO == 0 ? 17 : 15;
        this.IiIIIiiiiIiiI = e.getY() / IiiiiiiiIIIII;
        this.ALLATORIxDEMO();
    }

    public IIIIiiiiIIiII(IiIiIiiiIIiiI iiIiIiiiIIiiI, int maxW, int type) {
        this.iiIIIiiiiiiiI = iiIiIiiiIIiiI;
        this.ALLATORIxDEMO = type;
        this.iIiiIiiiiiiII = maxW;
        this.iiIiiiiiiiIii = 0;
        this.iIIiIiiiiiiIi = 0;
        this.iiIiIiiiiIIIi = 0;
        if (type == 0) {
            this.iIiIiiiiIiIii = 12;
            this.iIiiIiiiIiIIi = 12;
            this.IiIiiiiiIIIII = 12;
            this.iiIiiiiiiIIiI = 17;
            this.IIIIiiiiiiiII = 34;
            this.iiiiIiiiIiiII = 0;
        } else if (type == 1) {
            this.iIiIiiiiIiIii = 12;
            this.iIiiIiiiIiIIi = 12;
            this.IiIiiiiiIIIII = 12;
            this.iiIiiiiiiIIiI = 15;
            this.IIIIiiiiiiiII = 30;
            this.iiiiIiiiIiiII = 0;
        }
        this.addMouseListener(this);
        this.addMouseMotionListener(this);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        this.iiiIiiiiiiiIi = Boolean.FALSE;
        this.IiIIIiiiiIiiI = -1;
        this.ALLATORIxDEMO();
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    protected void paintComponent(Graphics g) {
        if (this.IIiiIiiiIIiIi > 0) {
            g.drawImage(IIIIIiiiIiiII.iIiIiiiiIiIii, this.iiIiIiiiiIIIi, this.iiIiiiiiiIIiI, this.IIiiIiiiIIiIi, this.IiIiiiiiIIIII, null);
        }
        if (this.iiiiIiiiIIiii > 0) {
            g.drawImage(IIIIIiiiIiiII.IiIiiiiiIIIII, this.iIIiIiiiiiiIi, this.IIIIiiiiiiiII, this.iiiiIiiiIIiii, this.iIiiIiiiIiIIi, null);
        }
        if (this.IiiiiiiiIIIII <= 0) return;
        g.drawImage(IIIIIiiiIiiII.IIiiIiiiIIiIi, this.iiIiiiiiiiIii, this.iiiiIiiiIiiII, this.IiiiiiiiIIIII, this.iIiIiiiiIiIii, null);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseDragged(MouseEvent e) {
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        int IiiiiiiiIIIII;
        int n = IiiiiiiiIIIII = this.ALLATORIxDEMO == 0 ? 17 : 15;
        if (this.IiIIIiiiiIiiI == e.getY() / IiiiiiiiIIIII) {
            return;
        }
        this.IiIIIiiiiIiiI = e.getY() / IiiiiiiiIIIII;
        this.ALLATORIxDEMO();
    }

    public void ALLATORIxDEMO() {
        IiIiIiiiiIIiI IiiiiiiiIIIII;
        if (this.IiIIIiiiiIiiI < 0 || this.IiIIIiiiiIiiI > 2) {
            this.iiIIIiiiiiiiI.ALLATORIxDEMO().iiiIiiiiiiIIi(46);
            return;
        }
        iiIiiiiiIIiiI IiiiiiiiIIIII2 = (iiIiiiiiIIiiI)this.iiIIIiiiiiiiI.ALLATORIxDEMO().iiiIiiiiiiIIi(46);
        if (this.ALLATORIxDEMO == 0) {
            LoginResult IiiiiiiiIIIII3 = this.iiIIIiiiiiiiI.ALLATORIxDEMO().getLoginResult();
            if (this.IiIIIiiiiIiiI == 0) {
                int IiiiiiiiIIIII4 = IiiiIiiiiIIII.iIiIiiiiIIiii((int)IiiiiiiiIIIII3.getGrade());
                int IiiiiiiiIIIII5 = IiiiIiiiiIIII.ALLATORIxDEMO((int)IiiiiiiiIIIII3.getGrade());
                if (IiiiiiiiIIIII4 <= 3) {
                    IiiiiiiiIIIII2.IiiIiiiiiiIiI("EXP(\u7ecf\u9a8c): " + IiiiiiiiIIIII3.getExperience().toString() + "/" + this.iiIIIiiiiiiiI.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII4, IiiiiiiiIIIII5));
                    return;
                }
                IiiiiiiiIIIII2.IiiIiiiiiiIiI("EXP(\u7ecf\u9a8c): " + IiiiiiiiIIIII3.getExperience().toString());
                return;
            }
            if (this.IiIIIiiiiIiiI == 1) {
                IiIiIiiiiIIiI IiiiiiiiIIIII6 = this.iiIIIiiiiiiiI.iiIIiiiiIiIIi.getBattleScene() != null ? this.iiIIIiiiiiiiI.iiIIiiiiIiIIi.getBattleScene().getBattleUnit(0, this.iiIIIiiiiiiiI.iiIIiiiiIiIIi.roleData.getRoleId()) : null;
                iiIiiiiiIIiiI iiIiiiiiIIiiI2 = IiiiiiiiIIIII2;
                if (IiiiiiiiIIIII6 != null) {
                    iiIiiiiiIIiiI2.IiiIiiiiiiIiI("HP(\u6c14\u8840): " + IiiiiiiiIIIII6.ALLATORIxDEMO().getHp_Current() + "/" + IiiiiiiiIIIII6.ALLATORIxDEMO().getHp_Total());
                    return;
                }
                iiIiiiiiIIiiI2.IiiIiiiiiiIiI("HP(\u6c14\u8840): " + IiiiiiiiIIIII3.getHp().intValue() + "/" + this.iiIIIiiiiiiiI.ALLATORIxDEMO().getRoleProperty().getHp());
                return;
            }
            if (this.IiIIIiiiiIiiI != 2) return;
            IiIiIiiiiIIiI IiiiiiiiIIIII7 = this.iiIIIiiiiiiiI.iiIIiiiiIiIIi.getBattleScene() != null ? this.iiIIIiiiiiiiI.iiIIiiiiIiIIi.getBattleScene().getBattleUnit(0, this.iiIIIiiiiiiiI.iiIIiiiiIiIIi.roleData.getRoleId()) : null;
            iiIiiiiiIIiiI iiIiiiiiIIiiI3 = IiiiiiiiIIIII2;
            if (IiiiiiiiIIIII7 != null) {
                iiIiiiiiIIiiI3.IiiIiiiiiiIiI("MP(\u6cd5\u529b): " + IiiiiiiiIIIII7.ALLATORIxDEMO().getMp_Current() + "/" + IiiiiiiiIIIII7.ALLATORIxDEMO().getMp_Total());
                return;
            }
            iiIiiiiiIIiiI3.IiiIiiiiiiIiI("MP(\u6cd5\u529b): " + IiiiiiiiIIIII3.getMp().intValue() + "/" + this.iiIIIiiiiiiiI.ALLATORIxDEMO().getRoleProperty().getMp());
            return;
        }
        if (this.ALLATORIxDEMO != 1) return;
        RoleSummoning IiiiiiiiIIIII8 = this.iiIIIiiiiiiiI.ALLATORIxDEMO().getChosePet();
        if (IiiiiiiiIIIII8 == null) {
            return;
        }
        if (this.IiIIIiiiiIiiI == 0) {
            IiiiiiiiIIIII2.IiiIiiiiiiIiI("EXP(\u7ecf\u9a8c): " + IiiiiiiiIIIII8.getExp().toString() + "/" + this.iiIIIiiiiiiiI.ALLATORIxDEMO().iiiIiiiiiiIIi(IiiiiiiiIIIII8.getTurnRount(), IiiiIiiiiIIII.iiiiiiiiIIiii((int)IiiiiiiiIIIII8.getGrade())));
            return;
        }
        if (this.IiIIIiiiiIiiI == 1) {
            IiIiIiiiiIIiI IiiiiiiiIIIII9;
            IiIiIiiiiIIiI iiIiIiiiiIIiI = IiiiiiiiIIIII9 = this.iiIIIiiiiiiiI.iiIIiiiiIiIIi.getBattleScene() != null ? this.iiIIIiiiiiiiI.iiIIiiiiIiIIi.getBattleScene().getBattleUnit(1, IiiiiiiiIIIII8.getSid().longValue()) : null;
            if (IiiiiiiiIIIII9 != null) {
                IiiiiiiiIIIII2.IiiIiiiiiiIiI("HP(\u6c14\u8840): " + IiiiiiiiIIIII9.ALLATORIxDEMO().getHp_Current() + "/" + IiiiiiiiIIIII9.ALLATORIxDEMO().getHp_Total());
                return;
            }
            int[] IiiiiiiiIIIII10 = PetProperty.getPetHMASp((RoleSummoning)IiiiiiiiIIIII8, (RoleData)this.iiIIIiiiiiiiI.ALLATORIxDEMO());
            IiiiiiiiIIIII2.IiiIiiiiiiIiI("HP(\u6c14\u8840): " + IiiiiiiiIIIII8.getBasishp(IiiiiiiiIIIII10[0]) + "/" + IiiiiiiiIIIII10[0]);
            return;
        }
        if (this.IiIIIiiiiIiiI != 2) return;
        IiIiIiiiiIIiI iiIiIiiiiIIiI = IiiiiiiiIIIII = this.iiIIIiiiiiiiI.iiIIiiiiIiIIi.getBattleScene() != null ? this.iiIIIiiiiiiiI.iiIIiiiiIiIIi.getBattleScene().getBattleUnit(1, IiiiiiiiIIIII8.getSid().longValue()) : null;
        if (IiiiiiiiIIIII != null) {
            IiiiiiiiIIIII2.IiiIiiiiiiIiI("MP(\u6cd5\u529b): " + IiiiiiiiIIIII.ALLATORIxDEMO().getMp_Current() + "/" + IiiiiiiiIIIII.ALLATORIxDEMO().getMp_Total());
            return;
        }
        int[] IiiiiiiiIIIII11 = PetProperty.getPetHMASp((RoleSummoning)IiiiiiiiIIIII8, (RoleData)this.iiIIIiiiiiiiI.ALLATORIxDEMO());
        IiiiiiiiIIIII2.IiiIiiiiiiIiI("MP(\u6cd5\u529b): " + IiiiiiiiIIIII8.getBasismp(IiiiiiiiIIIII11[1]) + "/" + IiiiiiiiIIIII11[1]);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        int IiiiiiiiIIIII = this.ALLATORIxDEMO == 0 ? 17 : 15;
        if (this.iiIIIiiiiiiiI.ALLATORIxDEMO().getBattleScene() != null) return;
        if (e.getY() % IiiiiiiiIIIII > 12) {
            return;
        }
        int IiiiiiiiIIIII2 = e.getY() / IiiiiiiiIIIII - 1;
        if (IiiiiiiiIIIII2 < 0) return;
        if (IiiiiiiiIIIII2 >= 2) {
            return;
        }
        iiIiIiiiIiIiI.ALLATORIxDEMO((int)(IiiiiiiiIIIII2 + (this.ALLATORIxDEMO == 0 ? 0 : 2)), (RoleData)this.iiIIIiiiiiiiI.ALLATORIxDEMO());
    }
}
