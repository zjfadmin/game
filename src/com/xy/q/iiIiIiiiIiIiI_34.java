/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.IiIiIiiiIIiiI
 *  com.xy.a.iiIiiiiiIIiiI
 *  com.xy.bean.LoginResult
 *  com.xy.entity.RoleSummoning
 *  com.xy.formula.PetProperty
 *  com.xy.game.HandleGood
 *  com.xy.game.HandlePet
 *  com.xy.game.RoleData
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.readbean.Goodstable
 *  com.xy.socket.Agreement
 *  com.xy.socket.GameClient
 *  com.xy.socket.ParamTool
 *  com.xy.v.IIiiIiiiiIIiI
 *  com.xy.v.IiiiIiiiiIIII
 */
package com.xy.q;

import com.xy.a.IiIiIiiiIIiiI;
import com.xy.a.iiIiiiiiIIiiI;
import com.xy.bean.LoginResult;
import com.xy.entity.RoleSummoning;
import com.xy.formula.PetProperty;
import com.xy.game.HandleGood;
import com.xy.game.HandlePet;
import com.xy.game.RoleData;
import com.xy.q.IiiiIiiiiIiIi;
import com.xy.readbean.Goodstable;
import com.xy.socket.Agreement;
import com.xy.socket.GameClient;
import com.xy.socket.ParamTool;
import com.xy.v.IIiiIiiiiIIiI;
import com.xy.v.IiiiIiiiiIIII;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class iiIiIiiiIiIiI
implements MouseListener {
    private IiiiIiiiiIiIi IiiiiiiiIIIII;
    private int ALLATORIxDEMO;

    public static void ALLATORIxDEMO(int lx, RoleData roleData) {
        RoleSummoning IiiiiiiiIIIII = null;
        int[] IiiiiiiiIIIII2 = null;
        int IiiiiiiiIIIII3 = 0;
        int IiiiiiiiIIIII4 = 0;
        if (lx == 0) {
            IiiiiiiiIIIII3 = roleData.getRoleProperty().getHp();
            IiiiiiiiIIIII4 = roleData.getLoginResult().getHp().intValue();
            if (IiiiiiiiIIIII4 == 0) {
                IiiiiiiiIIIII4 = IiiiiiiiIIIII3;
            }
        } else if (lx == 1) {
            IiiiiiiiIIIII3 = roleData.getRoleProperty().getMp();
            IiiiiiiiIIIII4 = roleData.getLoginResult().getMp().intValue();
            if (IiiiiiiiIIIII4 == 0) {
                IiiiiiiiIIIII4 = IiiiiiiiIIIII3;
            }
        } else {
            if (lx != 2) {
                if (lx != 3) return;
            }
            if ((IiiiiiiiIIIII = roleData.getChosePet()) == null) {
                return;
            }
            IiiiiiiiIIIII2 = PetProperty.getPetHMASp((RoleSummoning)IiiiiiiiIIIII, (RoleData)roleData);
            IiiiiiiiIIIII3 = IiiiiiiiIIIII2[lx == 2 ? 0 : 1];
            int n = IiiiiiiiIIIII4 = lx == 2 ? IiiiiiiiIIIII.getBasishp(IiiiiiiiIIIII3) : IiiiiiiiIIIII.getBasismp(IiiiiiiiIIIII3);
        }
        if (IiiiiiiiIIIII4 >= IiiiiiiiIIIII3) {
            return;
        }
        boolean IiiiiiiiIIIII5 = false;
        int IiiiiiiiIIIII6 = 0;
        while (IiiiiiiiIIIII6 < roleData.goodPacks.length) {
            Goodstable IiiiiiiiIIIII7;
            Goodstable goodstable = IiiiiiiiIIIII7 = roleData.goodPacks[IiiiiiiiIIIII6] != null ? roleData.getGood(roleData.goodPacks[IiiiiiiiIIIII6]) : null;
            if (IiiiiiiiIIIII7 != null && IiiiiiiiIIIII7.getType() == 0L && !IIiiIiiiiIIiI.iIiIiiiiIIiIi((String)IiiiiiiiIIIII7.getValue()) && (lx != 0 && lx != 2 || IiiiiiiiIIIII7.getValue().indexOf("HP") != -1) && (lx != 1 && lx != 3 || IiiiiiiiIIIII7.getValue().indexOf("MP") != -1)) {
                int[] IiiiiiiiIIIII8 = IiiiIiiiiIIII.ALLATORIxDEMO((String)IiiiiiiiIIIII7.getValue());
                int IiiiiiiiIIIII9 = IiiiiiiiIIIII7.getUsetime();
                while (IiiiiiiiIIIII7.getUsetime() > 0 && IiiiiiiiIIIII4 < IiiiiiiiIIIII3) {
                    if (lx == 0 || lx == 1) {
                        if (!HandleGood.ALLATORIxDEMO((int[])IiiiiiiiIIIII8, (RoleData)roleData)) break;
                        IiiiiiiiIIIII7.ALLATORIxDEMO(1);
                        IiiiiiiiIIIII4 = lx == 0 ? roleData.getLoginResult().getHp().intValue() : roleData.getLoginResult().getMp().intValue();
                        continue;
                    }
                    if (!HandlePet.ALLATORIxDEMO((RoleSummoning)IiiiiiiiIIIII, (int[])IiiiiiiiIIIII2, (int[])IiiiiiiiIIIII8, (RoleData)roleData)) break;
                    IiiiiiiiIIIII7.ALLATORIxDEMO(1);
                    int n = IiiiiiiiIIIII4 = lx == 2 ? IiiiiiiiIIIII.getBasishp(IiiiiiiiIIIII3) : IiiiiiiiIIIII.getBasismp(IiiiiiiiIIIII3);
                }
                if (IiiiiiiiIIIII9 != IiiiiiiiIIIII7.getUsetime()) {
                    IiiiiiiiIIIII5 = true;
                    ParamTool.ALLATORIxDEMO((Goodstable)IiiiiiiiIIIII7, (int)1, (GameClient)roleData.getGameView().getClient());
                    if (IiiiiiiiIIIII7.getUsetime() <= 0) {
                        roleData.iIiIiiiiIIiii(IiiiiiiiIIIII7.getRgid());
                    }
                }
                if (IiiiiiiiIIIII4 >= IiiiiiiiIIIII3) break;
            }
            ++IiiiiiiiIIIII6;
        }
        if (!IiiiiiiiIIIII5) {
            return;
        }
        roleData.getGameView().iIiIiiiiIIiii(false, "\u6218\u6597\u3001\u7ad9\u7acb\u3001\u884c\u8d70\u4f7f\u7528\u836f\u54c1.mp3");
        if (lx != 0 && lx != 1) {
            ParamTool.ALLATORIxDEMO((RoleSummoning)IiiiiiiiIIIII, (GameClient)roleData.getGameView().getClient());
            roleData.getRoleProperty().ALLATORIxDEMO(IiiiiiiiIIIII);
            return;
        }
        String IiiiiiiiIIIII22 = Agreement.getSendTextAES((String)"rolechange", (String)("H" + roleData.getLoginResult().getHp() + "=" + roleData.getLoginResult().getMp()));
        roleData.getGameView().getClient().ALLATORIxDEMO(IiiiiiiiIIIII22);
        roleData.getRoleProperty().IIIiiiiiiIIiI();
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    public iiIiIiiiIiIiI(int type, IiiiIiiiiIiIi form) {
        this.ALLATORIxDEMO = type;
        this.IiiiiiiiIIIII = form;
    }

    @Override
    public void mouseExited(MouseEvent e) {
        if (this.ALLATORIxDEMO >= 2 && this.ALLATORIxDEMO <= 6) {
            ((IiIiIiiiIIiiI)this.IiiiiiiiIIIII).iIiIiiiiIIiIi(-1);
            return;
        }
        if (this.ALLATORIxDEMO < 10) return;
        if (this.ALLATORIxDEMO > 13) return;
        this.IiiiiiiiIIIII.ALLATORIxDEMO().iiiIiiiiiiIIi(46);
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        if (this.ALLATORIxDEMO >= 2 && this.ALLATORIxDEMO <= 6) {
            ((IiIiIiiiIIiiI)this.IiiiiiiiIIIII).iIiIiiiiIIiIi(this.ALLATORIxDEMO - 2);
            return;
        }
        if (this.ALLATORIxDEMO == 10) {
            LoginResult IiiiiiiiIIIII = this.IiiiiiiiIIIII.ALLATORIxDEMO().getLoginResult();
            iiIiiiiiIIiiI iiIiiiiiIIiiI2 = (iiIiiiiiIIiiI)this.IiiiiiiiIIIII.ALLATORIxDEMO().iiiIiiiiiiIIi(46);
            iiIiiiiiIIiiI2.IiiIiiiiiiIiI(String.valueOf(IiiiiiiiIIIII.getRolename()) + " " + IiiiIiiiiIIII.iIiIiiiiIIiii((int)IiiiiiiiIIIII.getGrade()) + "\u7ea7");
            return;
        }
        if (this.ALLATORIxDEMO != 11) {
            if (this.ALLATORIxDEMO == 12) return;
            return;
        }
        RoleSummoning IiiiiiiiIIIII = this.IiiiiiiiIIIII.ALLATORIxDEMO().getChosePet();
        if (IiiiiiiiIIIII == null) {
            return;
        }
        iiIiiiiiIIiiI IiiiiiiiIIIII2 = (iiIiiiiiIIiiI)this.IiiiiiiiIIIII.ALLATORIxDEMO().iiiIiiiiiiIIi(46);
        IiiiiiiiIIIII2.IiiIiiiiiiIiI(String.valueOf(IiiiiiiiIIIII.getSummoningname()) + " \u5fe0\u8bda:" + IiiiiiiiIIIII.getFaithful());
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (this.ALLATORIxDEMO == 1) {
            ((IiIiIiiiIIiiI)this.IiiiiiiiIIIII).IiiIiiiiiiIiI();
        }
        if (this.ALLATORIxDEMO >= 2 && this.ALLATORIxDEMO <= 6) {
            ((IiIiIiiiIIiiI)this.IiiiiiiiIIIII).iiiIiiiiiiIIi(this.ALLATORIxDEMO - 2);
            return;
        }
        if (this.ALLATORIxDEMO == 10) {
            this.IiiiiiiiIIIII.ALLATORIxDEMO().iIiIiiiiIIiIi(0);
            return;
        }
        if (this.ALLATORIxDEMO == 11) {
            this.IiiiiiiiIIIII.ALLATORIxDEMO().iIiIiiiiIIiIi(6);
            return;
        }
        if (this.ALLATORIxDEMO != 12) {
            if (this.ALLATORIxDEMO != 13) return;
        }
        int IiiiiiiiIIIII = this.ALLATORIxDEMO == 12 ? 17 : 15;
        if (this.IiiiiiiiIIIII.ALLATORIxDEMO().getBattleScene() != null) return;
        if (e.getY() % IiiiiiiiIIIII > 12) {
            return;
        }
        int IiiiiiiiIIIII2 = e.getY() / IiiiiiiiIIIII - 1;
        if (IiiiiiiiIIIII2 < 0) return;
        if (IiiiiiiiIIIII2 >= 2) {
            return;
        }
        iiIiIiiiIiIiI.ALLATORIxDEMO(IiiiiiiiIIIII2 + (this.ALLATORIxDEMO == 12 ? 0 : 2), this.IiiiiiiiIIIII.ALLATORIxDEMO());
    }
}
