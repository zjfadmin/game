/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.i.IIIIIiiiIIIiI
 *  com.xy.q.IiIIIiiiiIIiI
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.socket.Agreement
 *  com.xy.text.GameView
 */
package com.xy.a;

import com.xy.i.IIIIIiiiIIIiI;
import com.xy.q.IiIIIiiiiIIiI;
import com.xy.q.IiiiIiiiiIiIi;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.JTextField;

public class IIiiiiiiIIIiI
extends IiiiIiiiiIiIi {
    private IIIIIiiiIIIiI IiiiiiiiIIIII;
    private JTextField ALLATORIxDEMO;

    public IIiiiiiiIIIiI(GameView gameView) {
        super(130, 2, IiiiIiiiiIiIi.iIIIIiiiiiIIi, gameView);
        this.ALLATORIxDEMO(-1, 0, 433, 285, IiiiIiiiiIiIi.iIIiIiiiiiiIi);
        this.iiiIiiiiiiIIi("sc/b/S308.png");
        this.ALLATORIxDEMO = IiIIIiiiiIIiI.ALLATORIxDEMO((Font)iiIIiiiiIiiII.iIiIIiiiiIIiI, (Color)Color.WHITE);
        this.ALLATORIxDEMO.setBounds(121, 192, 200, 16);
        this.add(this.ALLATORIxDEMO);
        this.IiiiiiiiIIIII = new IIIIIiiiIIIiI("sc/e/31.png", 1, 144, iiIIiiiiIiiII.iiiiIiiiIiiII, iiIIiiiiIiiII.IIiiiiiiIiiII, "\u5151 \u6362", (IiiiIiiiiIiIi)this);
        this.IiiiiiiiIIIII.setBounds(340, 186, 75, 25);
        this.add((Component)this.IiiiiiiiIIIII);
    }

    public void iIiIiiiiIIiii(int id) {
        String IiiiiiiiIIIII = this.ALLATORIxDEMO.getText();
        if (IiiiiiiiIIIII == null) return;
        if (IiiiiiiiIIIII.equals("")) {
            return;
        }
        String IiiiiiiiIIIII2 = Agreement.getSendTextAES((String)"exchangegoods", (String)IiiiiiiiIIIII);
        this.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII2);
    }
}
