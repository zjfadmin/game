/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.IIIiiiiiIiIiI
 *  com.xy.bean.TeamBean
 *  com.xy.d.iiIiIiiiiIiii
 *  com.xy.entity.TeamRole
 *  com.xy.i.iiIIiiiiIiiII
 *  com.xy.q.IiIIIiiiiIIiI
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.socket.Agreement
 *  com.xy.text.GameView
 *  com.xy.v.iIiIIiiiIiiiI
 *  com.xy.v.iiiiiiiiIIIII
 *  com.xy.w.IIIIIiiiIiIii
 *  com.xy.w.IIIIIiiiIiiII
 *  com.xy.w.IIiIiiiiIIiii
 *  com.xy.w.IIiIiiiiIiiIi
 */
package com.xy.a;

import com.xy.a.IIIiiiiiIiIiI;
import com.xy.bean.TeamBean;
import com.xy.d.iiIiIiiiiIiii;
import com.xy.entity.TeamRole;
import com.xy.i.iiIIiiiiIiiII;
import com.xy.q.IiIIIiiiiIIiI;
import com.xy.q.IiiiIiiiiIiIi;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import com.xy.v.iiiiiiiiIIIII;
import com.xy.w.IIIIIiiiIiIii;
import com.xy.w.IIIIIiiiIiiII;
import com.xy.w.IIiIiiiiIIiii;
import com.xy.w.IIiIiiiiIiiIi;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.math.BigDecimal;
import javax.swing.JLabel;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class iIiIIiiiIiiiI
extends IiiiIiiiiIiIi {
    private JLabel iiiiIiiiIiiII;
    private IIiIiiiiIIiii iiiIiiiiiiiIi = IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/29.png", (int)2, (int)2, (int)2, (int)2, (boolean)false);
    private Image iIiiIiiiiiiII;
    private Image IIiiIiiiIIiIi;
    private IIIiiiiiIiIiI[] iIiIiiiiIiIii;
    private int IiIIIiiiiIiiI = -1;
    private IIiIiiiiIIiii iiIiiiiiiiIii = IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/16.png", (int)2, (int)2, (int)2, (int)2, (boolean)false);
    private int IiiiiiiiIIIII = -1;
    private iiIIiiiiIiiII[] ALLATORIxDEMO;

    static /* synthetic */ Image ALLATORIxDEMO(iIiIIiiiIiiiI arg0) {
        return arg0.IIiiIiiiIIiIi;
    }

    public void iIiIiiiiIIiii() {
        if (this.iiIIiiiiIiIIi.roleData.teamBean == null) {
            return;
        }
        this.iiiIiiiiiiIIi();
        super.iIiIiiiiIIiii();
    }

    public void iIiIiiiiIIiIi(int v) {
        this.IiIIIiiiiIiiI = v;
    }

    public int iiiIiiiiiiIIi() {
        return this.IiIIIiiiiIiiI;
    }

    public void iiiIiiiiiiIIi() {
        TeamBean IiiiiiiiIIIII = this.iiIIiiiiIiIIi.roleData.teamBean;
        if (IiiiiiiiIIIII == null) {
            return;
        }
        long IiiiiiiiIIIII2 = this.iiIIiiiiIiIIi.roleData.getRoleId();
        TeamRole IiiiiiiiIIIII3 = null;
        boolean IiiiiiiiIIIII4 = ((TeamRole)IiiiiiiiIIIII.getTeams().get(0)).getRoleId().longValue() == IiiiiiiiIIIII2;
        int IiiiiiiiIIIII5 = 0;
        int IiiiiiiiIIIII6 = IiiiiiiiIIIII.getTeams().size();
        while (IiiiiiiiIIIII5 < this.iIiIiiiiIiIii.length) {
            iiIiIiiiiIiii IiiiiiiiIIIII7;
            TeamRole IiiiiiiiIIIII8 = IiiiiiiiIIIII5 < IiiiiiiiIIIII6 ? (TeamRole)IiiiiiiiIIIII.getTeams().get(IiiiiiiiIIIII5) : null;
            iiIiIiiiiIiii iiIiIiiiiIiii2 = IiiiiiiiIIIII7 = IiiiiiiiIIIII8 != null ? this.iiIIiiiiIiIIi.mapScene.ALLATORIxDEMO(IiiiiiiiIIIII8.getName()) : null;
            if (IiiiiiiiIIIII7 != null) {
                IiiiiiiiIIIII8.setGrade(IiiiiiiiIIIII7.iIiIiiiiIiIii.getGrade().intValue());
            }
            this.iIiIiiiiIiIii[IiiiiiiiIIIII5].ALLATORIxDEMO(IiiiiiiiIIIII8);
            if (IiiiiiiiIIIII8 != null && IiiiiiiiIIIII8.getRoleId().longValue() == IiiiiiiiIIIII2) {
                IiiiiiiiIIIII3 = IiiiiiiiIIIII8;
            }
            ++IiiiiiiiIIIII5;
        }
        if (IiiiiiiiIIIII4) {
            iIiIIiiiIiiiI iIiIIiiiIiiiI2 = this;
            iIiIIiiiIiiiI iIiIIiiiIiiiI3 = this;
            iIiIIiiiIiiiI3.ALLATORIxDEMO[0].setText("\u79fb\u4ea4\u961f\u957f");
            iIiIIiiiIiiiI2.ALLATORIxDEMO[0].ALLATORIxDEMO(1);
            iIiIIiiiIiiiI3.ALLATORIxDEMO[0].setVisible(true);
            iIiIIiiiIiiiI2.ALLATORIxDEMO[1].setText("\u7533\u8bf7\u5217\u8868");
            iIiIIiiiIiiiI3.ALLATORIxDEMO[1].ALLATORIxDEMO(2);
            iIiIIiiiIiiiI2.ALLATORIxDEMO[1].setVisible(true);
            iIiIIiiiIiiiI3.ALLATORIxDEMO[2].setText("\u89e3\u6563\u961f\u4f0d");
            iIiIIiiiIiiiI2.ALLATORIxDEMO[2].ALLATORIxDEMO(3);
            iIiIIiiiIiiiI3.ALLATORIxDEMO[2].setVisible(true);
            iIiIIiiiIiiiI2.ALLATORIxDEMO[3].setText("\u8bf7\u79bb\u961f\u4f0d");
            iIiIIiiiIiiiI3.ALLATORIxDEMO[3].ALLATORIxDEMO(4);
            iIiIIiiiIiiiI2.ALLATORIxDEMO[3].setVisible(true);
            iIiIIiiiIiiiI3.ALLATORIxDEMO[4].setText("\u52a0\u4e3a\u597d\u53cb");
            iIiIIiiiIiiiI2.ALLATORIxDEMO[4].ALLATORIxDEMO(5);
            this.ALLATORIxDEMO[4].setVisible(true);
        } else if (IiiiiiiiIIIII3.getState() >= 0) {
            this.ALLATORIxDEMO[0].setText("\u6682\u79bb\u961f\u4f0d");
            this.ALLATORIxDEMO[0].ALLATORIxDEMO(7);
            this.ALLATORIxDEMO[0].setVisible(true);
            this.ALLATORIxDEMO[1].setVisible(false);
            this.ALLATORIxDEMO[2].setVisible(false);
            this.ALLATORIxDEMO[3].setText("\u79bb\u5f00\u961f\u4f0d");
            this.ALLATORIxDEMO[3].ALLATORIxDEMO(6);
            this.ALLATORIxDEMO[3].setVisible(true);
            this.ALLATORIxDEMO[4].setText("\u52a0\u4e3a\u597d\u53cb");
            this.ALLATORIxDEMO[4].ALLATORIxDEMO(5);
            this.ALLATORIxDEMO[4].setVisible(true);
        } else {
            this.ALLATORIxDEMO[0].setText("\u56de\u5f52\u961f\u4f0d");
            this.ALLATORIxDEMO[0].ALLATORIxDEMO(8);
            this.ALLATORIxDEMO[0].setVisible(true);
            this.ALLATORIxDEMO[1].setVisible(false);
            this.ALLATORIxDEMO[2].setVisible(false);
            this.ALLATORIxDEMO[3].setText("\u79bb\u5f00\u961f\u4f0d");
            this.ALLATORIxDEMO[3].ALLATORIxDEMO(6);
            this.ALLATORIxDEMO[3].setVisible(true);
            this.ALLATORIxDEMO[4].setText("\u52a0\u4e3a\u597d\u53cb");
            this.ALLATORIxDEMO[4].ALLATORIxDEMO(5);
            this.ALLATORIxDEMO[4].setVisible(true);
        }
        this.iiiIiiiiiiIIi(-1);
        this.iIiIiiiiIIiIi(-1);
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        long IiiiiiiiIIIII = com.xy.v.iIiIIiiiIiiiI.ALLATORIxDEMO();
        IIIIIiiiIiIii IiiiiiiiIIIII2 = IIiIiiiiIiiIi.iIiIiiiiIIiii();
        if (IiiiiiiiIIIII2 != null) {
            IiiiiiiiIIIII2.ALLATORIxDEMO(IiiiiiiiIIIII, 0);
            IiiiiiiiIIIII2.ALLATORIxDEMO(g, 92, 42);
        }
        int IiiiiiiiIIIII3 = 0;
        while (IiiiiiiiIIIII3 < this.iIiIiiiiIiIii.length) {
            g.translate(this.iIiIiiiiIiIii[IiiiiiiiIIIII3].getX(), this.iIiIiiiiIiIii[IiiiiiiiIIIII3].getY());
            this.iiIiiiiiiiIii.ALLATORIxDEMO(g, 80, 170);
            g.drawImage(this.iIiiIiiiiiiII, 2, 118, 76, 1, null);
            g.drawImage(this.iIiiIiiiiiiII, 2, 141, 76, 1, null);
            if (this.iIiIiiiiIiIii[IiiiiiiiIIIII3].isVisible()) {
                if (IiiiiiiiIIIII3 == this.IiIIIiiiiIiiI || IiiiiiiiIIIII3 == this.IiiiiiiiIIIII) {
                    this.iiiIiiiiiiiIi.ALLATORIxDEMO(g, 84, 174);
                }
                if (IIIiiiiiIiIiI.ALLATORIxDEMO((IIIiiiiiIiIiI)this.iIiIiiiiIiIii[IiiiiiiiIIIII3]) != null) {
                    IIIiiiiiIiIiI.ALLATORIxDEMO((IIIiiiiiIiIiI)this.iIiIiiiiIiIii[IiiiiiiiIIIII3]).ALLATORIxDEMO(g, 40, 108, 4, IiiiiiiiIIIII);
                }
            }
            int n = -this.iIiIiiiiIiIii[IiiiiiiiIIIII3].getX();
            IIIiiiiiIiIiI iIIiiiiiIiIiI = this.iIiIiiiiIiIii[IiiiiiiiIIIII3];
            ++IiiiiiiiIIIII3;
            g.translate(n, -iIIiiiiiIiIiI.getY());
        }
    }

    public TeamRole ALLATORIxDEMO() {
        if (this.IiIIIiiiiIiiI != -1) return IIIiiiiiIiIiI.ALLATORIxDEMO((IIIiiiiiIiIiI)this.iIiIiiiiIiIii[this.IiIIIiiiiIiiI]);
        return null;
    }

    public void iiiIiiiiiiIIi(int v) {
        this.IiiiiiiiIIIII = v;
    }

    public iIiIIiiiIiiiI(GameView gameView) {
        super(13, 2, IiiiIiiiiIiIi.iIIIIiiiiiIIi, gameView);
        this.iIiiIiiiiiiII = IIIIIiiiIiiII.iiiIiiiiiiIIi((String)"sc/d/30.png");
        this.ALLATORIxDEMO(-1, 0, 542, 287, IiiiIiiiiIiIi.iiIIIiiiiiiiI);
        this.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/1.png", (int)68, (int)68, (int)68, (int)68, (boolean)false), "\u961f \u4f0d");
        this.ALLATORIxDEMO(new iiiiiiiiIIIII(14, 0, 0, 2));
        this.iiiiIiiiIiiII = IiIIIiiiiIIiI.ALLATORIxDEMO((int)43, (int)21, (int)40, (int)18, (int)0, (Color)com.xy.q.iiIIiiiiIiiII.ALLATORIxDEMO((String)"#c000000"), (Font)com.xy.q.iiIIiiiiIiiII.iiiiIiiiIiiII);
        this.iiiiIiiiIiiII.setText("\u961f\u6807");
        this.add(this.iiiiIiiiIiiII);
        this.iIiIiiiiIiIii = new IIIiiiiiIiIiI[5];
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iIiIiiiiIiIii.length) {
            this.iIiIiiiiIiIii[IiiiiiiiIIIII] = new IIIiiiiiIiIiI(this, IiiiiiiiIIIII);
            this.iIiIiiiiIiIii[IiiiiiiiIIIII].setBounds(53 + IiiiiiiiIIIII * 95, 51, 80, 170);
            this.add((Component)this.iIiIiiiiIiIii[IiiiiiiiIIIII++]);
        }
        this.ALLATORIxDEMO = new iiIIiiiiIiiII[5];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.ALLATORIxDEMO.length) {
            this.ALLATORIxDEMO[IiiiiiiiIIIII] = new iiIIiiiiIiiII("sc/e/26.png", 1, 0, com.xy.q.iiIIiiiiIiiII.iiiiIiiiIiiII, com.xy.q.iiIIiiiiIiiII.IIiiiiiiIiiII, null, (IiiiIiiiiIiIi)this);
            iIiIIiiiIiiiI iIiIIiiiIiiiI2 = this;
            if (IiiiiiiiIIIII == 0) {
                iIiIIiiiIiiiI2.ALLATORIxDEMO[IiiiiiiiIIIII].setBounds(410, 20, 89, 25);
            } else {
                iIiIIiiiIiiiI2.ALLATORIxDEMO[IiiiiiiiIIIII].setBounds(53 + (IiiiiiiiIIIII - 1) * 114, 237, 99, 25);
            }
            this.add((Component)this.ALLATORIxDEMO[IiiiiiiiIIIII++]);
        }
    }

    public void iIiIiiiiIIiii(int id) {
        if (id == 1) {
            TeamRole IiiiiiiiIIIII = this.ALLATORIxDEMO();
            if (IiiiiiiiIIIII == null) {
                this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u4f60\u6ca1\u6709\u9009\u4e2d\u7684\u73a9\u5bb6");
                return;
            }
            if (IiiiiiiiIIIII.getRoleId().compareTo(this.ALLATORIxDEMO().getLoginResult().getRole_id()) == 0) {
                this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u4e0d\u80fd\u9009\u4e2d\u4f60\u81ea\u5df1");
                return;
            }
            String IiiiiiiiIIIII2 = Agreement.getSendTextAES((String)"team5", (String)("S" + IiiiiiiiIIIII.getRoleId()));
            this.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII2);
            this.iIiIiiiiIIiIi(-1);
            return;
        }
        if (id == 2) {
            String IiiiiiiiIIIII = Agreement.getSendTextAES((String)"team6", null);
            this.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII);
            return;
        }
        if (id == 3 || id == 6) {
            String IiiiiiiiIIIII = Agreement.getSendTextAES((String)"team5", (String)"D");
            this.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII);
            this.ALLATORIxDEMO().iiiIiiiiiiIIi(this.iIiIiiiiIIiii());
            return;
        }
        if (id == 4) {
            TeamRole IiiiiiiiIIIII = this.ALLATORIxDEMO();
            if (IiiiiiiiIIIII == null) {
                this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u4f60\u6ca1\u6709\u9009\u4e2d\u7684\u73a9\u5bb6");
                return;
            }
            if (IiiiiiiiIIIII.getRoleId().compareTo(this.ALLATORIxDEMO().getLoginResult().getRole_id()) == 0) {
                this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u4e0d\u80fd\u9009\u4e2d\u4f60\u81ea\u5df1");
                return;
            }
            String IiiiiiiiIIIII3 = Agreement.getSendTextAES((String)"team5", (String)("K" + IiiiiiiiIIIII.getRoleId()));
            this.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII3);
            this.iIiIiiiiIIiIi(-1);
            return;
        }
        if (id != 5) return;
        TeamRole IiiiiiiiIIIII = this.ALLATORIxDEMO();
        if (IiiiiiiiIIIII == null) {
            this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u4f60\u6ca1\u6709\u9009\u4e2d\u7684\u73a9\u5bb6");
            return;
        }
        if (IiiiiiiiIIIII.getRoleId().compareTo(this.ALLATORIxDEMO().getLoginResult().getRole_id()) == 0) {
            this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u4e0d\u80fd\u9009\u4e2d\u4f60\u81ea\u5df1");
            return;
        }
        iiIiIiiiiIiii.ALLATORIxDEMO((BigDecimal)IiiiiiiiIIIII.getRoleId(), (String)IiiiiiiiIIIII.getName(), (GameView)this.iiIIiiiiIiIIi);
    }

    static /* synthetic */ void ALLATORIxDEMO(iIiIIiiiIiiiI arg0, Image arg1) {
        arg0.IIiiIiiiIIiIi = arg1;
    }
}
