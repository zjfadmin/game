/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.readbean.MoneyType
 *  com.xy.text.GameView
 *  com.xy.w.IIiIiiiiIIiii
 */
package com.xy.q;

import com.xy.q.iiIIiiiiIiiII;
import com.xy.readbean.MoneyType;
import com.xy.text.GameView;
import com.xy.w.IIiIiiiiIIiii;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JLabel;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class iiIiIiiiiIiIi
extends JLabel {
    static final int iIiiIiiiiiiII = 1000;
    protected MoneyType IIiiIiiiIIiIi;
    protected GameView iIiIiiiiIiIii;
    protected Long IiIIIiiiiIiiI;
    protected int iiIiiiiiiiIii;
    protected long IiiiiiiiIIIII;
    protected IIiIiiiiIIiii ALLATORIxDEMO;

    public void iIiIiiiiIIiii() {
        if (this.IIiiIiiiIIiIi == null) {
            return;
        }
        long IiiiiiiiIIIII = 0L;
        if (this.IIiiIiiiIIiIi.getId() == -1) {
            IiiiiiiiIIIII = this.IIiiIiiiIIiIi.getMax();
        } else if (this.IIiiIiiiIIiIi.getId() == -2) {
            IiiiiiiiIIIII = this.iIiIiiiiIiIii.roleData.getMoney(this.IIiiIiiiIIiIi);
        } else if (this.IIiiIiiiIIiIi.getKey() != null) {
            IiiiiiiiIIIII = this.iIiIiiiiIiIii.roleData.getMoney(this.IIiiIiiiIIiIi);
        }
        if (this.IiiiiiiiIIIII == IiiiiiiiIIIII) {
            return;
        }
        this.IiiiiiiiIIIII = IiiiiiiiIIIII;
        this.ALLATORIxDEMO();
    }

    public void ALLATORIxDEMO(Long num) {
        this.IiIIIiiiiIiiI = num;
        this.ALLATORIxDEMO();
    }

    public void ALLATORIxDEMO(int id, long max, Long num) {
        if (this.IIiiIiiiIIiIi == null || this.IIiiIiiiIIiIi.getKey() != null) {
            this.IIiiIiiiIIiIi = new MoneyType(id, max);
        }
        this.IIiiIiiiIIiIi.setIdAndMax(id, max);
        this.IiIIIiiiiIiiI = num;
        this.IiiiiiiiIIIII = 0L;
        this.ALLATORIxDEMO();
    }

    public void iIiIiiiiIIiii(MoneyType moneyType) {
        this.IIiiIiiiIIiIi = moneyType;
    }

    public void ALLATORIxDEMO(int px) {
        this.iiIiiiiiiiIii = px;
    }

    public iiIiIiiiiIiIi(IIiIiiiiIIiii imgCut, MoneyType moneyType, GameView gameView) {
        this.ALLATORIxDEMO = imgCut;
        this.IIiiIiiiIIiIi = moneyType;
        this.iIiIiiiiIiIii = gameView;
        iiIIiiiiIiiII.ALLATORIxDEMO((JLabel)this, (long)this.IiiiiiiiIIIII);
    }

    public long ALLATORIxDEMO() {
        return this.IiiiiiiiIIIII;
    }

    public void ALLATORIxDEMO(long money) {
        if (this.IiiiiiiiIIIII == money) {
            return;
        }
        this.IiiiiiiiIIIII = money;
        this.ALLATORIxDEMO();
    }

    public void ALLATORIxDEMO() {
        if (this.IiIIIiiiiIiiI == null) {
            iiIIiiiiIiiII.ALLATORIxDEMO((JLabel)this, (long)this.IiiiiiiiIIIII);
            return;
        }
        this.setText(String.valueOf(iiIIiiiiIiiII.ALLATORIxDEMO((long)this.IiIIIiiiiIiiI)) + "/" + iiIIiiiiIiiII.ALLATORIxDEMO((long)this.IiiiiiiiIIIII));
        this.setForeground(this.IiiiiiiiIIIII >= this.IiIIIiiiiIiiI ? Color.green : Color.red);
    }

    public void ALLATORIxDEMO(MoneyType moneyType) {
        if (this.IIiiIiiiIIiIi == moneyType) {
            return;
        }
        this.IIiiIiiiIIiIi = moneyType;
        if (this.IIiiIiiiIIiIi != null) {
            this.iIiIiiiiIIiii();
            return;
        }
        this.IiiiiiiiIIIII = 0L;
        if (this.IiIIIiiiiIiiI != null) {
            this.ALLATORIxDEMO();
            return;
        }
        this.setText(null);
    }

    public iiIiIiiiiIiIi(MoneyType moneyType, GameView gameView) {
        this(null, moneyType, gameView);
    }

    public MoneyType ALLATORIxDEMO() {
        return this.IIiiIiiiIIiIi;
    }

    @Override
    protected void paintComponent(Graphics g) {
        if (this.iIiIiiiiIiIii.iIiIiiiiIIiii()) {
            this.iIiIiiiiIIiii();
        }
        if (this.ALLATORIxDEMO != null) {
            this.ALLATORIxDEMO.ALLATORIxDEMO(g, this.getWidth(), this.getHeight());
        }
        if (this.iiIiiiiiiiIii != 0) {
            g.translate(this.iiIiiiiiiiIii, 0);
            super.paintComponent(g);
            g.translate(-this.iiIiiiiiiiIii, 0);
            return;
        }
        super.paintComponent(g);
    }

    public void ALLATORIxDEMO(IIiIiiiiIIiii imgCut) {
        this.ALLATORIxDEMO = imgCut;
    }
}
