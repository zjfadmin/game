/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.q.IiIiiiiiIIIiI
 *  com.xy.a.q.IiiIiiiiIIIIi
 *  com.xy.a.q.iIIiiiiiIIIIi
 *  com.xy.a.q.iiIiiiiiIIiiI
 *  com.xy.bean.PayvipBean
 *  com.xy.i.IiiiiiiiiIIII
 *  com.xy.q.IiIIIiiiiIIiI
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.q.iiIiIiiiiIiIi
 *  com.xy.readbean.MoneyType
 *  com.xy.text.GameView
 *  com.xy.w.IIIIIiiiIiiII
 *  com.xy.w.IIIiiiiiIiIiI
 */
package com.xy.a.q;

import com.xy.a.q.IiIiiiiiIIIiI;
import com.xy.a.q.IiiIiiiiIIIIi;
import com.xy.a.q.iIIiiiiiIIIIi;
import com.xy.a.q.iiIiiiiiIIiiI;
import com.xy.bean.PayvipBean;
import com.xy.i.IiiiiiiiiIIII;
import com.xy.q.IiIIIiiiiIIiI;
import com.xy.q.IiiiIiiiiIiIi;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.q.iiIiIiiiiIiIi;
import com.xy.readbean.MoneyType;
import com.xy.text.GameView;
import com.xy.w.IIIIIiiiIiiII;
import com.xy.w.IIIiiiiiIiIiI;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.util.List;
import javax.swing.JLabel;

public class IIIIiiiiIIIIi
extends IiiiIiiiiIiIi {
    private IiiiiiiiiIIII[] iiiiIiiiIiiII;
    private IiIiiiiiIIIiI iiiIiiiiiiiIi;
    private JLabel iIiiIiiiiiiII;
    private iiIiiiiiIIiiI IIiiIiiiIIiIi;
    private iiIiIiiiiIiIi iIiIiiiiIiIii;
    private IIIiiiiiIiIiI IiIIIiiiiIiiI;
    private iIIiiiiiIIIIi iiIiiiiiiiIii;
    private IiiIiiiiIIIIi IiiiiiiiIIIII;
    private int ALLATORIxDEMO;

    public void ALLATORIxDEMO(List<PayvipBean> list) {
        this.iiIiiiiiiiIii.ALLATORIxDEMO(list);
    }

    public void iIiIiiiiIIiii() {
        this.iiiIiiiiiiIIi(0);
        this.iIiIiiiiIiIii.iIiIiiiiIIiii();
        super.iIiIiiiiIIiii();
    }

    public void iiiIiiiiiiIIi(int type) {
        this.ALLATORIxDEMO = type;
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iiiiIiiiIiiII.length) {
            this.iiiiIiiiIiiII[IiiiiiiiIIIII].setKeep(IiiiiiiiIIIII == this.ALLATORIxDEMO);
            ++IiiiiiiiIIIII;
        }
        this.iIiIiiiiIIiii(type);
        this.IiiiiiiiIIIII.setVisible(type == 0);
        this.IIiiIiiiIIiIi.setVisible(type == 1);
        this.iiiIiiiiiiiIi.setVisible(type == 2);
        this.iiIiiiiiiiIii.setVisible(type == 3);
    }

    public boolean ALLATORIxDEMO() {
        this.IIiiIiiiIIiIi.iIiIiiiiIIiIi();
        return super.ALLATORIxDEMO();
    }

    public IIIIiiiiIIIIi(GameView gameView) {
        super(39, 2, IiiiIiiiiIiIi.iIIIIiiiiiIIi, gameView);
        this.ALLATORIxDEMO(-1, 0, 682, 475, IiiiIiiiiIiIi.iiIIIiiiiiiiI);
        this.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/1.png", (int)68, (int)68, (int)68, (int)68, (boolean)false), "\u591a\u5b9d\u9601");
        this.iiiiIiiiIiiII = new IiiiiiiiiIIII[4];
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iiiiIiiiIiiII.length) {
            this.iiiiIiiiIiiII[IiiiiiiiIIIII] = new IiiiiiiiiIIII("sc/e/64.png", 2, 241 + IiiiiiiiIIIII, iiIIiiiiIiiII.IIiiiiiiiIIIi, iiIIiiiiIiiII.IIiiiiiiIiiII, IiiiiiiiIIIII == 0 ? "\u5546\u57ce" : (IiiiiiiiIIIII == 1 ? "\u9526\u7ee3" : (IiiiiiiiIIIII == 2 ? "\u6708\u5361" : (IiiiiiiiIIIII == 3 ? "VIP" : ""))), (IiiiIiiiiIiIi)this);
            this.iiiiIiiiIiiII[IiiiiiiiIIIII].setOffsetTexts(iiIIiiiiIiiII.IIiiiiiiiIIII);
            this.iiiiIiiiIiiII[IiiiiiiiIIIII].setBounds(61 + 86 * IiiiiiiiIIIII, 21, 79, 33);
            this.add((Component)this.iiiiIiiiIiiII[IiiiiiiiIIIII++]);
        }
        this.iIiiIiiiiiiII = IiIIIiiiiIIiI.ALLATORIxDEMO((int)480, (int)34, (int)72, (int)18, (Color)Color.black, (Font)iiIIiiiiIiiII.iiiiIiiiIiiII);
        this.iIiiIiiiiiiII.setText("\u5f53\u524d\u4ed9\u7389");
        this.add(this.iIiiIiiiiiiII);
        MoneyType IiiiiiiiIIIII2 = new MoneyType();
        IiiiiiiiIIIII2.setIdAndKey(3, "\u4ed9\u7389");
        this.iIiIiiiiIiIii = IiIIIiiiiIIiI.ALLATORIxDEMO((int)552, (int)34, (int)110, (int)18, (int)10, (Color)Color.white, (Font)iiIIiiiiIiiII.iIIIiiiiIIIii, (MoneyType)IiiiiiiiIIIII2, (GameView)gameView);
        this.iIiIiiiiIiIii.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/17.png", (int)6, (int)6, (int)6, (int)6, (boolean)false));
        this.iIiIiiiiIiIii.ALLATORIxDEMO(2);
        this.add((Component)this.iIiIiiiiIiIii);
        this.IiIIIiiiiIiiI = new IIIiiiiiIiIiI(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/35.png", (int)80, (int)10, (int)80, (int)10, (boolean)false));
        this.IiIIIiiiiIiiI.setBounds(31, 35, 625, 20);
        this.add((Component)this.IiIIIiiiiIiiI);
        this.IiiiiiiiIIIII = new IiiIiiiiIIIIi(gameView);
        this.add((Component)this.IiiiiiiiIIIII);
        this.IIiiIiiiIIiIi = new iiIiiiiiIIiiI(gameView);
        this.add((Component)this.IIiiIiiiIIiIi);
        this.iiiIiiiiiiiIi = new IiIiiiiiIIIiI(gameView);
        this.add((Component)this.iiiIiiiiiiiIi);
        this.iiIiiiiiiiIii = new iIIiiiiiIIIIi(gameView);
        this.add((Component)this.iiIiiiiiiiIii);
        if (this.ALLATORIxDEMO().VALUE.indexOf(71) == -1) {
            this.iiiiIiiiIiiII[1].setVisible(false);
            this.iiiiIiiiIiiII[2].setBounds(147, 21, 79, 33);
            this.iiiiIiiiIiiII[3].setBounds(233, 21, 79, 33);
        }
        if (this.ALLATORIxDEMO().VALUE.indexOf(72) == -1) {
            this.iiiiIiiiIiiII[3].setVisible(false);
        }
        if (this.ALLATORIxDEMO().iiiiiiiiIIiii()) return;
        if (!this.ALLATORIxDEMO().ALLATORIxDEMO(2, 12)) return;
        if (this.ALLATORIxDEMO().VALUE.indexOf(76) == -1) return;
        this.iiiiIiiiIiiII[0].setVisible(false);
        this.iiiiIiiiIiiII[1].setVisible(false);
        this.iiiiIiiiIiiII[3].setVisible(false);
        this.iiiiIiiiIiiII[2].setBounds(61, 21, 79, 33);
    }

    /*
     * Unable to fully structure code
     */
    public void iIiIiiiiIIiii(int type) {
        block4: {
            if (type != this.ALLATORIxDEMO) {
                return;
            }
            if (this.ALLATORIxDEMO != 0) break block4;
            this.IiiiiiiiIIIII.iIiIiiiiIIiii(0);
            IiiiiiiiIIIII = 0;
            if (true) ** GOTO lbl19
        }
        if (this.ALLATORIxDEMO == 1) {
            this.IIiiIiiiIIiIi.iiiIiiiiiiIIi();
            return;
        }
        if (this.ALLATORIxDEMO == 2) {
            this.iiiIiiiiiiiIi.iiiIiiiiiiIIi();
            return;
        }
        if (this.ALLATORIxDEMO != 3) return;
        this.iiIiiiiiiiIii.iIiIiiiiIIiIi();
        return;
        do {
            this.IiiiiiiiIIIII.ALLATORIxDEMO()[IiiiiiiiIIIII++].iIiIiiiiIIiii();
lbl19:
            // 2 sources

        } while (IiiiiiiiIIIII < this.IiiiiiiiIIIII.ALLATORIxDEMO().length);
    }
}
