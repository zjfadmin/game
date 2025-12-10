/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.iIIIIiiiIiiiI
 *  com.xy.battle.BattleControl
 *  com.xy.d.IiIiIiiiiIIiI
 *  com.xy.game.HandleGood
 *  com.xy.game.RoleData
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.readbean.Goodstable
 *  com.xy.readbean.Skill
 *  com.xy.text.GameView
 *  com.xy.text.ScreenData
 *  com.xy.v.iiIiIiiiIIIiI
 *  com.xy.w.IIIIIiiiIiiII
 */
package com.xy.a;

import com.xy.a.iIIIIiiiIiiiI;
import com.xy.battle.BattleControl;
import com.xy.d.IiIiIiiiiIIiI;
import com.xy.game.HandleGood;
import com.xy.game.RoleData;
import com.xy.q.IiiiIiiiiIiIi;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.readbean.Goodstable;
import com.xy.readbean.Skill;
import com.xy.text.GameView;
import com.xy.text.ScreenData;
import com.xy.v.iiIiIiiiIIIiI;
import com.xy.w.IIIIIiiiIiiII;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.math.BigDecimal;

public class IiIIIiiiiiIII
extends IiiiIiiiiIiIi {
    private int iiIiiiiiiiIii = -1;
    private iIIIIiiiIiiiI[] IiiiiiiiIIIII;
    private static Image ALLATORIxDEMO = IIIIIiiiIiiII.iiiIiiiiiiIIi((String)"sc/c/45");

    public void ALLATORIxDEMO() {
        ScreenData screenData = this.iiIIiiiiIiIIi.screenData;
        int IiiiiiiiIIIII = screenData.getScreen_x() - 322;
        int IiiiiiiiIIIII2 = screenData.getScreen_y() - 83;
        this.setBounds(IiiiiiiiIIIII, IiiiiiiiIIIII2, 323, 43);
    }

    private /* synthetic */ void ALLATORIxDEMO(Graphics g, RoleData roleData) {
        g.setColor(Color.white);
        g.setFont(iiIIiiiiIiiII.iIIIIiiiiiIiI);
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IiiiiiiiIIIII.length) {
            iIIIIiiiIiiiI IiiiiiiiIIIII2 = this.IiiiiiiiIIIII[IiiiiiiiIIIII];
            g.drawImage(ALLATORIxDEMO, IiiiiiiiIIIII2.getX(), 0, 43, 43, null);
            long IiiiiiiiIIIII3 = roleData.getShortCutSkill(iIIIIiiiIiiiI.ALLATORIxDEMO((iIIIIiiiIiiiI)IiiiiiiiIIIII2));
            if (IiiiiiiiIIIII3 == 0L) {
                IiiiiiiiIIIII2.ALLATORIxDEMO();
            } else {
                if (iIIIIiiiIiiiI.ALLATORIxDEMO((iIIIIiiiIiiiI)IiiiiiiiIIIII2) == null || iIIIIiiiIiiiI.ALLATORIxDEMO((iIIIIiiiIiiiI)IiiiiiiiIIIII2) != IiiiiiiiIIIII3) {
                    Skill IiiiiiiiIIIII4;
                    if (IiiiiiiiIIIII3 > Integer.MAX_VALUE) {
                        IiiiiiiiIIIII4 = roleData.getGood(new BigDecimal(IiiiiiiiIIIII3 - Integer.MAX_VALUE));
                        if (IiiiiiiiIIIII4 != null) {
                            IiiiiiiiIIIII2.ALLATORIxDEMO(IiiiiiiiIIIII3, (Goodstable)IiiiiiiiIIIII4);
                        }
                    } else {
                        IiiiiiiiIIIII4 = roleData.getShortCutSkillById(IiiiiiiiIIIII3);
                        if (IiiiiiiiIIIII4 != null) {
                            IiiiiiiiIIIII2.ALLATORIxDEMO(IiiiiiiiIIIII3, IiiiiiiiIIIII4);
                        }
                    }
                }
                g.drawImage(iIIIIiiiIiiiI.ALLATORIxDEMO((iIIIIiiiIiiiI)IiiiiiiiIIIII2), IiiiiiiiIIIII2.getX() + 4, 4, 36, 36, null);
            }
            ++IiiiiiiiIIIII;
            g.drawString(iIIIIiiiIiiiI.ALLATORIxDEMO((iIIIIiiiIiiiI)IiiiiiiiIIIII2), IiiiiiiiIIIII2.getX() + 6, 13);
        }
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        RoleData IiiiiiiiIIIII = this.ALLATORIxDEMO();
        if (IiiiiiiiIIIII == null) return;
        if (!this.iiIIiiiiIiIIi.isDraw) {
            return;
        }
        this.ALLATORIxDEMO(g, IiiiiiiiIIIII);
    }

    static /* synthetic */ void ALLATORIxDEMO(IiIIIiiiiiIII arg0, int arg1) {
        arg0.iiIiiiiiiiIii = arg1;
    }

    public IiIIIiiiiiIII(int type, GameView gameView) {
        super(-1, -1, IiiiIiiiiIiIi.iIIiIiiiiiiIi, gameView);
        this.ALLATORIxDEMO(0, 0, 0, 0, IiiiIiiiiIiIi.iIIiIiiiiiiIi);
        this.IiiiiiiiIIIII = new iIIIIiiiIiiiI[8];
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IiiiiiiiIIIII.length) {
            this.IiiiiiiiIIIII[IiiiiiiiIIIII] = new iIIIIiiiIiiiI(this, IiiiiiiiIIIII);
            this.IiiiiiiiIIIII[IiiiiiiiIIIII].setBounds(IiiiiiiiIIIII * 40, 0, 43, 43);
            this.add((Component)this.IiiiiiiiIIIII[IiiiiiiiIIIII++]);
        }
    }

    public void iIiIiiiiIIiii(int id) {
        this.ALLATORIxDEMO(this.IiiiiiiiIIIII[id]);
    }

    public void setVisible(boolean aFlag) {
        if (aFlag) {
            this.ALLATORIxDEMO();
        }
        super.setVisible(aFlag);
    }

    public void ALLATORIxDEMO(iIIIIiiiIiiiI keyGrid) {
        if (this.iiIIiiiiIiIIi.getBattleScene() == null) {
            RoleData IiiiiiiiIIIII = this.ALLATORIxDEMO();
            long IiiiiiiiIIIII2 = IiiiiiiiIIIII.getShortCutSkill(iIIIIiiiIiiiI.ALLATORIxDEMO((iIIIIiiiIiiiI)keyGrid));
            if (IiiiiiiiIIIII2 <= Integer.MAX_VALUE) {
                return;
            }
            Goodstable IiiiiiiiIIIII3 = IiiiiiiiIIIII.getGood(new BigDecimal(IiiiiiiiIIIII2 - Integer.MAX_VALUE));
            if (IiiiiiiiIIIII3 == null) {
                return;
            }
            try {
                HandleGood.ALLATORIxDEMO((Goodstable)IiiiiiiiIIIII3, (boolean)false, (RoleData)IiiiiiiiIIIII);
                return;
            }
            catch (Exception IiiiiiiiIIIII4) {
                IiiiiiiiIIIII4.printStackTrace();
                return;
            }
        }
        IiIiIiiiiIIiI IiiiiiiiIIIII = this.iiIIiiiiIiIIi.getBattleControl().getHandleUnit();
        if (IiiiiiiiIIIII == null) {
            return;
        }
        RoleData IiiiiiiiIIIII5 = this.ALLATORIxDEMO();
        long IiiiiiiiIIIII6 = IiiiiiiiIIIII5.getShortCutSkill(iIIIIiiiIiiiI.ALLATORIxDEMO((iIIIIiiiIiiiI)keyGrid));
        if (IiiiiiiiIIIII6 > Integer.MAX_VALUE) {
            Goodstable IiiiiiiiIIIII7 = IiiiiiiiIIIII5.getGood(new BigDecimal(IiiiiiiiIIIII6 - Integer.MAX_VALUE));
            if (IiiiiiiiIIIII7 == null) {
                return;
            }
            if (!IiiiiiiiIIIII.ALLATORIxDEMO().iIiIiiiiIIiii("\u9057\u5fd8")) {
                this.iiIIiiiiIiIIi.getBattleControl().setMouseIndex(iiIiIiiiIIIiI.iiIiIiiiiIIIi, (Object)IiiiiiiiIIIII7);
                this.iiIIiiiiIiIIi.getBattleControl().iiiiiiiiIIiii();
                return;
            }
            this.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u5f53\u524d\u72b6\u6001\u65e0\u6cd5\u4f7f\u7528\u836f\u54c1");
            return;
        }
        if (IiiiiiiiIIIII.ALLATORIxDEMO().getType() != 0) {
            return;
        }
        Skill IiiiiiiiIIIII8 = IiiiiiiiIIIII5.getShortCutSkillById(IiiiiiiiIIIII6);
        if (IiiiiiiiIIIII8 == null) {
            return;
        }
        BattleControl battleControl = this.iiIIiiiiIiIIi.getBattleControl();
        battleControl.setMouseIndex(iiIiIiiiIIIiI.ALLATORIxDEMO, (Object)IiiiiiiiIIIII8);
        battleControl.iiiiiiiiIIiii();
        this.iiIIiiiiIiIIi.getFormManagement().iiiIiiiiiiIIi(34);
    }
}
