/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.q.IIiiIiiiiIIiI
 *  com.xy.entity.TeamRole
 *  com.xy.i.IiiiiiiiiIIII
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.text.GameView
 *  com.xy.v.iIiIIiiiIiiiI
 *  com.xy.w.IIIIIiiiIiIii
 *  com.xy.w.IIIIIiiiIiiII
 *  com.xy.w.iiiiiiiiiiIiI
 */
package com.xy.a.q;

import com.xy.a.q.IIiiIiiiiIIiI;
import com.xy.entity.TeamRole;
import com.xy.i.IiiiiiiiiIIII;
import com.xy.q.IiiiIiiiiIiIi;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.text.GameView;
import com.xy.v.iIiIIiiiIiiiI;
import com.xy.w.IIIIIiiiIiIii;
import com.xy.w.IIIIIiiiIiiII;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class iiiiiiiiiiIiI
extends IiiiIiiiiIiIi {
    private int iIIiIiiiiiiIi = 0;
    private int IIIIiiiiiiiII;
    private StringBuffer iiIIIiiiiiiiI = new StringBuffer();
    private IIIIIiiiIiIii IiIiiiiiIIIII = com.xy.w.iiiiiiiiiiIiI.ALLATORIxDEMO((String)"sc/mouse/teamArenaBack.tcp", null);
    private int iiIiIiiiiIIIi = 287;
    private IiiiiiiiiIIII iiiiIiiiIiiII;
    private int iiiIiiiiiiiIi = 1;
    private String iIiiIiiiiiiII;
    private Image IIiiIiiiIIiIi;
    private int IiIIIiiiiIiiI = 0;
    private IiiiiiiiiIIII iiIiiiiiiiIii;
    private List<IIiiIiiiiIIiI> IiiiiiiiIIIII;
    private long ALLATORIxDEMO;

    protected void paintChildren(Graphics g) {
        super.paintChildren(g);
        this.IiIiiiiiIIIII.ALLATORIxDEMO(iIiIIiiiIiiiI.ALLATORIxDEMO(), 0);
        int IiiiiiiiIIIII = 0;
        int IiiiiiiiIIIII2 = this.IiiiiiiiIIIII.size();
        while (IiiiiiiiIIIII < IiiiiiiiIIIII2) {
            if (this.iiiIiiiiiiiIi == 0) {
                if (IIiiIiiiiIIiI.ALLATORIxDEMO((IIiiIiiiiIIiI)this.IiiiiiiiIIIII.get(IiiiiiiiIIIII)) != null) {
                    this.IiIiiiiiIIIII.ALLATORIxDEMO(g, 67 + IiiiiiiiIIIII % 5 * 96, 57 + IiiiiiiiIIIII / 5 * 157);
                }
            } else if (IIiiIiiiiIIiI.ALLATORIxDEMO((IIiiIiiiiIIiI)this.IiiiiiiiIIIII.get(IiiiiiiiIIIII)) == 1) {
                this.IiIiiiiiIIIII.ALLATORIxDEMO(g, 67 + IiiiiiiiIIIII % 5 * 96, 57 + IiiiiiiiIIIII / 5 * 157);
            }
            ++IiiiiiiiIIIII;
        }
    }

    public void ALLATORIxDEMO(String str, int countDown, int typeMenu) {
        this.IIIIiiiiiiiII = countDown;
        this.iIiiIiiiiiiII = str;
        this.iiiIiiiiiiiIi = typeMenu;
        if (typeMenu == 0) return;
        this.ALLATORIxDEMO = iIiIIiiiIiiiI.ALLATORIxDEMO();
    }

    public void ALLATORIxDEMO(List<TeamRole> teamRoles, int numType) {
        int IiiiiiiiIIIII = numType * 5;
        if (teamRoles != null && teamRoles.size() != 0) {
            int IiiiiiiiIIIII2 = teamRoles.size();
            int IiiiiiiiIIIII3 = 0;
            int IiiiiiiiIIIII4 = this.IiiiiiiiIIIII.size();
            while (IiiiiiiiIIIII3 < IiiiiiiiIIIII4) {
                if (IiiiiiiiIIIII3 >= 5) break;
                if (IiiiiiiiIIIII3 < IiiiiiiiIIIII2) {
                    TeamRole IiiiiiiiIIIII5 = teamRoles.get(IiiiiiiiIIIII3);
                    if (IiiiiiiiIIIII3 < 5) {
                        this.IiiiiiiiIIIII.get(IiiiiiiiIIIII3 + IiiiiiiiIIIII).ALLATORIxDEMO(IiiiiiiiIIIII5, numType);
                    }
                } else {
                    this.IiiiiiiiIIIII.get(IiiiiiiiIIIII3 + IiiiiiiiIIIII).ALLATORIxDEMO(null, numType);
                }
                ++IiiiiiiiIIIII3;
            }
        }
        if (numType != 1) {
            if (numType != 0) return;
            this.iIiIiiiiIIiii(1);
            this.ALLATORIxDEMO(null, 0, 0);
            return;
        }
        this.ALLATORIxDEMO("\u5012\u8ba1\u65f6", 30, 1);
        this.IiIIIiiiiIiiI = teamRoles != null ? teamRoles.size() : 0;
    }

    public iiiiiiiiiiIiI(GameView gameView) {
        super(108, 2, IiiiIiiiiIiIi.iIIIIiiiiiIIi, gameView);
        this.ALLATORIxDEMO(-1, 0, 591, 406, IiiiIiiiiIiIi.iIIiIiiiiiiIi);
        this.iiiIiiiiiiIIi("sc/b/S191.png");
        this.IiiiiiiiIIIII = new ArrayList<IIiiIiiiiIIiI>();
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < 10) {
            IIiiIiiiiIIiI IiiiiiiiIIIII2 = new IIiiIiiiiIIiI(this);
            IiiiiiiiIIIII2.setBounds(50 + IiiiiiiiIIIII % 5 * 96, 59 + IiiiiiiiIIIII / 5 * 157, 93, 110);
            this.add((Component)IiiiiiiiIIIII2);
            ++IiiiiiiiIIIII;
            this.IiiiiiiiIIIII.add(IiiiiiiiIIIII2);
        }
        iiiiiiiiiiIiI iiiiiiiiiiIiI2 = this;
        iiiiiiiiiiIiI iiiiiiiiiiIiI3 = this;
        iiiiiiiiiiIiI3.iiIiiiiiiiIii = new IiiiiiiiiIIII("sc/e/7.png", 1, 63, iiIIiiiiIiiII.iiiiIiiiIiiII, iiIIiiiiIiiII.IIiiiiiiIiiII, "\u5339\u914d", (IiiiIiiiiIiIi)this);
        iiiiiiiiiiIiI2.iiiiIiiiIiiII = new IiiiiiiiiIIII("sc/e/7.png", 1, 64, iiIIiiiiIiiII.iiiiIiiiIiiII, iiIIiiiiIiiII.IIiiiiiiIiiII, "\u62d2\u7edd", (IiiiIiiiiIiIi)this);
        iiiiiiiiiiIiI3.iiIiiiiiiiIii.setBounds(82, 177, 59, 26);
        iiiiiiiiiiIiI2.iiiiIiiiIiiII.setBounds(447, 177, 59, 26);
        iiiiiiiiiiIiI2.add((Component)iiiiiiiiiiIiI3.iiIiiiiiiiIii);
        this.add((Component)this.iiiiIiiiIiiII);
    }

    public void ALLATORIxDEMO(BigDecimal decimal) {
        ++this.iIIiIiiiiiiIi;
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IiiiiiiiIIIII.size()) {
            IIiiIiiiiIIiI IiiiiiiiIIIII2 = this.IiiiiiiiIIIII.get(IiiiiiiiIIIII);
            if (IIiiIiiiiIIiI.ALLATORIxDEMO((IIiiIiiiiIIiI)IiiiiiiiIIIII2) != null && IIiiIiiiiIIiI.ALLATORIxDEMO((IIiiIiiiiIIiI)IiiiiiiiIIIII2).compareTo(decimal) == 0) {
                IIiiIiiiiIIiI.ALLATORIxDEMO((IIiiIiiiiIIiI)IiiiiiiiIIIII2, (int)1);
            }
            ++IiiiiiiiIIIII;
        }
        if (this.iIIiIiiiiiiIi != this.IiIIIiiiiIiiI) return;
        this.ALLATORIxDEMO(null, 0, 1);
    }

    public void IiiIiiiiiiIiI() {
        this.iiIIIiiiiiiiI.setLength(0);
        this.iiIIIiiiiiiiI.append(this.iIiiIiiiiiiII);
        this.iiIIIiiiiiiiI.append("0:");
        if (this.IIIIiiiiiiiII > 9) {
            this.iiIIIiiiiiiiI.append(this.IIIIiiiiiiiII);
        } else {
            this.iiIIIiiiiiiiI.append("0");
            this.iiIIIiiiiiiiI.append(this.IIIIiiiiiiiII);
        }
        if (this.IIIIiiiiiiiII <= 0) return;
        --this.IIIIiiiiiiiII;
    }

    private /* synthetic */ void ALLATORIxDEMO(Graphics g) {
        g.setColor(Color.white);
        g.setFont(iiIIiiiiIiiII.iiIiIiiiIiiII);
        if (this.iiIIIiiiiiiiI.length() != 0) {
            g.drawString(this.iiIIIiiiiiiiI.toString(), this.iiIiIiiiiIIIi, 199);
        }
        if (iIiIIiiiIiiiI.ALLATORIxDEMO() - this.ALLATORIxDEMO < 1000L) return;
        if (this.iIiiIiiiiiiII == null) {
            this.iiiIiiiiiiIIi();
        } else {
            this.IiiIiiiiiiIiI();
        }
        int IiiiiiiiIIIII = g.getFontMetrics().stringWidth(this.iiIIIiiiiiiiI.toString());
        this.iiIiIiiiiIIIi = 287 - IiiiiiiiIIIII / 2;
        this.ALLATORIxDEMO += 1000L;
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (this.iiiIiiiiiiiIi != 0) {
            this.ALLATORIxDEMO(g);
            return;
        }
        if (this.IIiiIiiiIIiIi == null) {
            this.IIiiIiiiIIiIi = IIIIIiiiIiiII.iiiIiiiiiiIIi((String)"sc/b/S192.png");
        }
        g.drawImage(this.IIiiIiiiIIiIi, 258, 169, null);
    }

    public void iIiIiiiiIIiii(int type) {
        if (type == 0) {
            this.iiiiIiiiIiiII.setText("\u62d2\u7edd");
            this.iiIiiiiiiiIii.setText("\u5339\u914d");
            this.iiiiIiiiIiiII.setVisible(true);
            this.iiIiiiiiiiIii.setVisible(true);
            return;
        }
        if (type == 1) {
            this.iiiiIiiiIiiII.setVisible(false);
            this.iiIiiiiiiiIii.setVisible(false);
            return;
        }
        if (type != 2) return;
        this.iiiiIiiiIiiII.setVisible(true);
        this.iiiiIiiiIiiII.setText("\u53d6\u6d88");
        this.iiIiiiiiiiIii.setVisible(false);
    }

    public void iIiIiiiiIIiIi() {
        this.iIIiIiiiiiiIi = 0;
        this.iiIIIiiiiiiiI.setLength(0);
        this.ALLATORIxDEMO().iiiIiiiiiiIIi(this.iIiIiiiiIIiii());
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IiiiiiiiIIIII.size()) {
            this.IiiiiiiiIIIII.get(++IiiiiiiiIIIII).ALLATORIxDEMO(null, 0);
        }
    }

    public void iiiIiiiiiiIIi() {
        ++this.IIIIiiiiiiiII;
        int IiiiiiiiIIIII = this.IIIIiiiiiiiII / 60;
        int IiiiiiiiIIIII2 = this.IIIIiiiiiiiII % 60;
        this.iiIIIiiiiiiiI.setLength(0);
        if (IiiiiiiiIIIII > 0) {
            this.iiIIIiiiiiiiI.append(IiiiiiiiIIIII);
        } else {
            this.iiIIIiiiiiiiI.append("0");
        }
        this.iiIIIiiiiiiiI.append(":");
        if (IiiiiiiiIIIII2 > 9) {
            this.iiIIIiiiiiiiI.append(IiiiiiiiIIIII2);
            return;
        }
        this.iiIIIiiiiiiiI.append("0");
        this.iiIIIiiiiiiiI.append(IiiiiiiiIIIII2);
    }
}
