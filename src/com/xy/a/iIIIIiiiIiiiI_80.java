/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.IiIIIiiiiiIII
 *  com.xy.a.iiIiiiiiIIiiI
 *  com.xy.formula.GoodType
 *  com.xy.game.RoleData
 *  com.xy.readbean.Goodstable
 *  com.xy.readbean.Skill
 *  com.xy.v.IiiiIiiiiIIII
 *  com.xy.w.IIiIiiiiIiiIi
 *  com.xy.w.IiIiIiiiiIIiI
 */
package com.xy.a;

import com.xy.a.IiIIIiiiiiIII;
import com.xy.a.iiIiiiiiIIiiI;
import com.xy.formula.GoodType;
import com.xy.game.RoleData;
import com.xy.readbean.Goodstable;
import com.xy.readbean.Skill;
import com.xy.v.IiiiIiiiiIIII;
import com.xy.w.IIiIiiiiIiiIi;
import com.xy.w.IiIiIiiiiIIiI;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.math.BigDecimal;
import javax.swing.JComponent;

/*
 * Exception performing whole class analysis ignored.
 */
static class iIIIIiiiIiiiI
extends JComponent
implements MouseListener {
    private Long IIiiIiiiIIiIi;
    private String iIiIiiiiIiIii;
    final /* synthetic */ IiIIIiiiiiIII IiIIIiiiiIiiI;
    private Image iiIiiiiiiiIii;
    private int IiiiiiiiIIIII;
    private String ALLATORIxDEMO;

    static /* synthetic */ Long ALLATORIxDEMO(iIIIIiiiIiiiI arg0) {
        return arg0.IIiiIiiiIIiIi;
    }

    static /* synthetic */ String ALLATORIxDEMO(iIIIIiiiIiiiI arg0) {
        return arg0.iIiIiiiiIiIii;
    }

    @Override
    public void mouseExited(MouseEvent e) {
        IiIIIiiiiiIII.ALLATORIxDEMO((IiIIIiiiiiIII)this.IiIIIiiiiIiiI, (int)-1);
        this.IiIIIiiiiIiiI.ALLATORIxDEMO().iiiIiiiiiiIIi(46);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    /*
     * WARNING - void declaration
     */
    public void ALLATORIxDEMO(long l, Goodstable goodstable) {
        void goodstable2;
        void id;
        this.IIiiIiiiIIiIi = (long)id;
        this.iiIiiiiiiiIii = IIiIiiiiIiiIi.iiiiiiiiIIiii((String)goodstable2.getSkin());
        this.ALLATORIxDEMO = GoodType.ALLATORIxDEMO((Long)goodstable2.getType()) ? String.valueOf(goodstable2.getUsetime()) : null;
    }

    public iIIIIiiiIiiiI(IiIIIiiiiiIII iiIIIiiiiiIII, int index) {
        this.IiIIIiiiiIiiI = iiIIIiiiiiIII;
        this.IiiiiiiiIIIII = index;
        this.iIiIiiiiIiIii = "F" + (index + 1);
        this.addMouseListener(this);
    }

    public void ALLATORIxDEMO() {
        this.IIiiIiiiIIiIi = null;
        this.iiIiiiiiiiIii = null;
        this.ALLATORIxDEMO = null;
    }

    public void ALLATORIxDEMO(long id, Skill skill) {
        this.IIiiIiiiIIiIi = id;
        int IiiiiiiiIIIII = Integer.parseInt(skill.getSkillid());
        this.iiIiiiiiiiIii = IiiiiiiiIIIII > 12000 && IiiiiiiiIIIII <= 13000 ? IIiIiiiiIiiIi.iIiIiiiiIIiIi((int)IiiiiiiiIIIII) : IIiIiiiiIiiIi.iiiIiiiiiiIIi((String)skill.getSkillid());
        this.ALLATORIxDEMO = null;
    }

    @Override
    public void mouseEntered(MouseEvent mouseEvent) {
        IiIIIiiiiiIII.ALLATORIxDEMO((IiIIIiiiiiIII)this.IiIIIiiiiIiiI, (int)this.IiiiiiiiIIIII);
        RoleData IiiiiiiiIIIII = this.IiIIIiiiiIiiI.ALLATORIxDEMO();
        long IiiiiiiiIIIII2 = IiiiiiiiIIIII.getShortCutSkill(this.IiiiiiiiIIIII);
        if (IiiiiiiiIIIII2 > Integer.MAX_VALUE) {
            Goodstable IiiiiiiiIIIII3 = IiiiiiiiIIIII.getGood(new BigDecimal(IiiiiiiiIIIII2 - Integer.MAX_VALUE));
            if (IiiiiiiiIIIII3 == null) {
                return;
            }
            iiIiiiiiIIiiI IiiiiiiiIIIII4 = (iiIiiiiiIIiiI)this.IiIIIiiiiIiiI.ALLATORIxDEMO().iiiIiiiiiiIIi(46);
            IiiiiiiiIIIII4.ALLATORIxDEMO(IiiiiiiiIIIII3, false);
            return;
        }
        Skill IiiiiiiiIIIII5 = IiiiiiiiIIIII.getShortCutSkillById(IiiiiiiiIIIII2);
        if (IiiiiiiiIIIII5 == null) {
            return;
        }
        int IiiiiiiiIIIII6 = IiiiIiiiiIIII.IiiIiiiiiiIiI((int)IiiiiiiiIIIII.getLoginResult().getGrade());
        ((iiIiiiiiIIiiI)this.IiIIIiiiiIiiI.ALLATORIxDEMO().iiiIiiiiiiIIi(46)).ALLATORIxDEMO(IiiiiiiiIIIII5, (double)IiiiiiiiIIIII6, IiiiIiiiiIIII.ALLATORIxDEMO((int)IiiiiiiiIIIII.getLoginResult().getGrade()), IiiiIiiiiIIII.iIiIiiiiIIiii((int)IiiiiiiiIIIII.getLoginResult().getGrade()));
    }

    static /* synthetic */ int ALLATORIxDEMO(iIIIIiiiIiiiI arg0) {
        return arg0.IiiiiiiiIIIII;
    }

    @Override
    public void mousePressed(MouseEvent e) {
        RoleData IiiiiiiiIIIII = this.IiIIIiiiiIiiI.ALLATORIxDEMO();
        IiIiIiiiiIIiI IiiiiiiiIIIII2 = this.IiIIIiiiiIiiI.iiIIiiiiIiIIi.choseImg;
        if (IiiiiiiiIIIII2.iIiIiiiiIiIii == 2 || IiiiiiiiIIIII2.iIiIiiiiIiIii == 12) {
            Long IiiiiiiiIIIII3 = IiiiiiiiIIIII.getShortCutSkillByIndex(IiiiiiiiIIIII2.iiIIIiiiiiiiI.intValue());
            if (IiiiiiiiIIIII3 == null) return;
            IiiiiiiiIIIII.ALLATORIxDEMO(IiiiiiiiIIIII3, this.IiiiiiiiIIIII);
            IiiiiiiiIIIII.IIIIIiiiiIIii();
            IiiiiiiiIIIII2.ALLATORIxDEMO();
            return;
        }
        if (IiiiiiiiIIIII2.iIiIiiiiIiIii == 1 || IiiiiiiiIIIII2.iIiIiiiiIiIii == 11) {
            Goodstable IiiiiiiiIIIII4 = IiiiiiiiIIIII.getGood(IiiiiiiiIIIII2.iiIIIiiiiiiiI);
            if (IiiiiiiiIIIII4 == null) {
                return;
            }
            if (IiiiiiiiIIIII4.getType() != 0L && IiiiiiiiIIIII4.getType() != 1L) {
                this.IiIIIiiiiIiiI.ALLATORIxDEMO().iiiIiiiiiiIIi("\u8be5\u7c7b\u7269\u54c1\u65e0\u6cd5\u653e\u5165\u5feb\u6377\u680f");
                return;
            }
            Long IiiiiiiiIIIII5 = IiiiiiiiIIIII.getShortCutGoodByIndex(IiiiiiiiIIIII2.iiIIIiiiiiiiI);
            if (IiiiiiiiIIIII5 == null) return;
            IiiiiiiiIIIII.ALLATORIxDEMO(IiiiiiiiIIIII5, this.IiiiiiiiIIIII);
            IiiiiiiiIIIII.IIIIIiiiiIIii();
            IiiiiiiiIIIII2.ALLATORIxDEMO();
            return;
        }
        long IiiiiiiiIIIII6 = IiiiiiiiIIIII.getShortCutSkill(this.IiiiiiiiIIIII);
        if (IiiiiiiiIIIII6 > Integer.MAX_VALUE) {
            Goodstable IiiiiiiiIIIII7 = IiiiiiiiIIIII.getGood(new BigDecimal(IiiiiiiiIIIII6 - Integer.MAX_VALUE));
            if (IiiiiiiiIIIII7 == null) {
                return;
            }
            if (e.getButton() == 1) {
                IiiiiiiiIIIII.ALLATORIxDEMO(Long.valueOf(IiiiiiiiIIIII6), -1);
                IiiiiiiiIIIII.IIIIIiiiiIIii();
                IiiiiiiiIIIII2.ALLATORIxDEMO((byte)11, IiiiiiiiIIIII7, IiiiiiiiIIIII7.getUsetime().intValue());
                return;
            }
            if (e.getButton() != 3) return;
            this.IiIIIiiiiIiiI.ALLATORIxDEMO(this);
            return;
        }
        Skill IiiiiiiiIIIII8 = IiiiiiiiIIIII.getShortCutSkillById(IiiiiiiiIIIII6);
        if (IiiiiiiiIIIII8 == null) {
            return;
        }
        if (e.getButton() == 1) {
            IiiiiiiiIIIII.ALLATORIxDEMO(Long.valueOf(IiiiiiiiIIIII6), -1);
            IiiiiiiiIIIII.IIIIIiiiiIIii();
            IiiiiiiiIIIII2.ALLATORIxDEMO((byte)12, IiiiiiiiIIIII8, 0);
            return;
        }
        if (e.getButton() != 3) return;
        this.IiIIIiiiiIiiI.ALLATORIxDEMO(this);
    }

    static /* synthetic */ Image ALLATORIxDEMO(iIIIIiiiIiiiI arg0) {
        return arg0.iiIiiiiiiiIii;
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }
}
