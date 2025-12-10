/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.battle.BattleControl
 *  com.xy.bean.FightOperation
 *  com.xy.i.IiIIIiiiIIiII
 *  com.xy.q.IiIIIiiiiIIiI
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.text.GameView
 *  com.xy.w.IIIIIiiiIiiII
 */
package com.xy.a;

import com.xy.battle.BattleControl;
import com.xy.bean.FightOperation;
import com.xy.i.IiIIIiiiIIiII;
import com.xy.q.IiIIIiiiiIIiI;
import com.xy.q.IiiiIiiiiIiIi;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.text.GameView;
import com.xy.w.IIIIIiiiIiiII;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.JLabel;

public class iiiiiiiiiiiIi
extends IiiiIiiiiIiIi {
    private IiIIIiiiIIiII iIiIiiiiIiIii;
    private JLabel IiIIIiiiiIiiI;
    private JLabel iiIiiiiiiiIii;
    private JLabel IiiiiiiiIIIII;
    private JLabel ALLATORIxDEMO;

    public void iIiIiiiiIIiii() {
        super.iIiIiiiiIIiii();
    }

    public void iIiIiiiiIIiii(int id) {
        this.ALLATORIxDEMO().iiiIiiiiiiIIi(this.iIiIiiiiIIiii());
    }

    public iiiiiiiiiiiIi(GameView gameView) {
        super(151, 2, IiiiIiiiiIiIi.iIIIIiiiiiIIi, gameView);
        this.ALLATORIxDEMO(-1, 0, 150, 90, IiiiIiiiiIiIi.iIIiIiiiiiiIi);
        this.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/c/0", (int)6, (int)6, (int)6, (int)6, (boolean)false), null);
        this.IiIIIiiiiIiiI = IiIIIiiiiIIiI.ALLATORIxDEMO((int)20, (int)15, (int)50, (int)20, (Color)Color.white, (Font)iiIIiiiiIiiII.iIiIIiiiiIIiI);
        this.IiiiiiiiIIIII = IiIIIiiiiIIiI.ALLATORIxDEMO((int)20, (int)35, (int)50, (int)20, (Color)Color.white, (Font)iiIIiiiiIiiII.iIiIIiiiiIIiI);
        this.IiIIIiiiiIiiI.setText("\u4eba\u3000\u7269");
        this.IiiiiiiiIIIII.setText("\u53ec\u5524\u517d");
        this.add(this.IiIIIiiiiIiiI);
        this.add(this.IiiiiiiiIIIII);
        this.ALLATORIxDEMO = IiIIIiiiiIIiI.ALLATORIxDEMO((int)75, (int)15, (int)80, (int)20, (Color)iiIIiiiiIiiII.ALLATORIxDEMO((String)"#cFFFB99"), (Font)iiIIiiiiIiiII.iIiIIiiiiIIiI);
        this.iiIiiiiiiiIii = IiIIIiiiiIIiI.ALLATORIxDEMO((int)75, (int)35, (int)80, (int)20, (Color)iiIIiiiiIiiII.ALLATORIxDEMO((String)"#cFFFB99"), (Font)iiIIiiiiIiiII.iIiIIiiiiIIiI);
        this.ALLATORIxDEMO.setText("\u666e\u901a\u653b\u51fb");
        this.iiIiiiiiiiIii.setText("\u666e\u901a\u653b\u51fb");
        this.add(this.ALLATORIxDEMO);
        this.add(this.iiIiiiiiiiIii);
        this.iIiIiiiiIiIii = new IiIIIiiiIIiII(null, 1, 0, iiIIiiiiIiiII.iIiIIiiiiIIiI, null, "\u53d6\u6d88", (IiiiIiiiiIiIi)this);
        this.iIiIiiiiIiIii.setForeground(Color.GREEN);
        this.iIiIiiiiIiIii.setBounds(55, 60, 40, 16);
        this.add((Component)this.iIiIiiiiIiIii);
    }

    public boolean ALLATORIxDEMO() {
        this.iiIIiiiiIiIIi.getBattleControl().iIiIiiiiIIiii();
        return super.ALLATORIxDEMO();
    }

    public void ALLATORIxDEMO(int type, FightOperation operation, BattleControl battleControl) {
        String IiiiiiiiIIIII = null;
        if (operation.getType() == 0) {
            IiiiiiiiIIIII = "\u666e\u901a\u653b\u51fb";
        } else if (operation.getType() == 1) {
            IiiiiiiiIIIII = operation.getSpell();
        } else if (operation.getType() == 2) {
            IiiiiiiiIIIII = "\u836f\u54c1";
        } else if (operation.getType() == 3) {
            IiiiiiiiIIIII = "\u4fdd\u62a4";
        } else if (operation.getType() == 4) {
            IiiiiiiiIIIII = "\u6355\u6349";
        } else if (operation.getType() == 5) {
            IiiiiiiiIIIII = "\u9632\u5fa1";
        } else if (operation.getType() == 6) {
            IiiiiiiiIIIII = "\u9003\u8dd1";
        } else if (operation.getType() == 7) {
            IiiiiiiiIIIII = "\u53ec\u56de";
        }
        if (type == 0) {
            this.ALLATORIxDEMO.setText(IiiiiiiiIIIII);
            return;
        }
        this.iiIiiiiiiiIii.setText(IiiiiiiiIIIII);
    }
}
