/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.entity.Gang
 *  com.xy.game.RoleData
 *  com.xy.i.IIIIIiiiIIIiI
 *  com.xy.q.IiIIIiiiiIIiI
 *  com.xy.q.IiiiIiiiiIiII
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.socket.Agreement
 *  com.xy.text.GameView
 *  com.xy.v.iiIiiiiiIIiii
 *  com.xy.v.iiiiiiiiIIIII
 *  com.xy.w.IIIIIiiiIiiII
 *  com.xy.w.IIIiiiiiIiIiI
 *  com.xy.w.IIiIiiiiIIiii
 */
package com.xy.a;

import com.xy.entity.Gang;
import com.xy.game.RoleData;
import com.xy.i.IIIIIiiiIIIiI;
import com.xy.q.IiIIIiiiiIIiI;
import com.xy.q.IiiiIiiiiIiII;
import com.xy.q.IiiiIiiiiIiIi;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import com.xy.v.iiIiiiiiIIiii;
import com.xy.v.iiiiiiiiIIIII;
import com.xy.w.IIIIIiiiIiiII;
import com.xy.w.IIIiiiiiIiIiI;
import com.xy.w.IIiIiiiiIIiii;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.math.BigDecimal;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class IIiiiiiiiiIii
extends IiiiIiiiiIiIi {
    private JTextArea iIiIiiiiIiIii;
    private JLabel[] IiIIIiiiiIiiI;
    private IiiiIiiiiIiII iiIiiiiiiiIii;
    private IIIiiiiiIiIiI IiiiiiiiIIIII;
    private IIIIIiiiIIIiI ALLATORIxDEMO;

    public IIiiiiiiiiIii(GameView gameView) {
        super(25, 2, IiiiIiiiiIiIi.iIIIIiiiiiIIi, gameView);
        this.ALLATORIxDEMO(-2, 0, 362, 320, IiiiIiiiiIiIi.iiIIIiiiiiiiI);
        this.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/1.png", (int)68, (int)68, (int)68, (int)68, (boolean)false), "\u521b\u5efa\u5e2e\u6d3e");
        this.ALLATORIxDEMO(new iiiiiiiiIIIII(14, 0, 0, 85));
        this.ALLATORIxDEMO = new IIIIIiiiIIIiI("sc/e/26.png", 1, 145, iiIIiiiiIiiII.iiiiIiiiIiiII, iiIIiiiiIiiII.IIiiiiiiIiiII, "\u521b\u5efa\u5e2e\u6d3e", (IiiiIiiiiIiIi)this);
        this.ALLATORIxDEMO.setBounds(140, 178, 99, 25);
        this.add((Component)this.ALLATORIxDEMO);
        this.iiIiiiiiiiIii = IiIIIiiiiIIiI.ALLATORIxDEMO((IIiIiiiiIIiii)IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/17.png", (int)3, (int)3, (int)3, (int)3, (boolean)false), (Font)iiIIiiiiIiiII.iIIIiiiiIIIii, (Color)Color.white);
        this.IiiiiiiiIIIII = new IIIiiiiiIiIiI(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/17.png", (int)3, (int)3, (int)3, (int)3, (boolean)false));
        this.iIiIiiiiIiIii = IiIIIiiiiIIiI.ALLATORIxDEMO((Font)iiIIiiiiIiiII.iIIIiiiiIIIii, (Color)Color.white);
        this.iIiIiiiiIiIii.setBounds(132, 65, 200, 80);
        this.iiIiiiiiiiIii.setBounds(130, 37, 160, 19);
        this.IiiiiiiiIIIII.setBounds(130, 63, 204, 84);
        this.add((Component)this.iiIiiiiiiiIii);
        this.add(this.iIiIiiiiIiIii);
        this.add((Component)this.IiiiiiiiIIIII);
        this.IiIIIiiiiIiiI = new JLabel[2];
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IiIIIiiiiIiiI.length) {
            this.IiIIIiiiiIiiI[IiiiiiiiIIIII] = IiIIIiiiiIIiI.ALLATORIxDEMO((int)52, (int)(37 + IiiiiiiiIIIII * 26), (int)72, (int)19, (int)10, (Color)iiIIiiiiIiiII.ALLATORIxDEMO((String)"#c000000"), (Font)iiIIiiiiIiiII.iiiiIiiiIiiII);
            this.IiIIIiiiiIiiI[IiiiiiiiIIIII].setText(IiiiiiiiIIIII == 0 ? "\u5e2e\u6d3e\u540d\u79f0" : (IiiiiiiiIIIII == 1 ? "\u5e2e\u6d3e\u5b97\u65e8" : ""));
            this.add(this.IiIIIiiiiIiiI[IiiiiiiiIIIII++]);
        }
    }

    /*
     * WARNING - void declaration
     */
    public void iiiIiiiiiiIIi() {
        BigDecimal IiiiiiiiIIIII = this.iiIIiiiiIiIIi.roleUnit.iIiIiiiiIiIii.getGang_id();
        if (IiiiiiiiIIIII != null && IiiiiiiiIIIII.intValue() != 0) {
            this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u4f60\u5df2\u6709\u5e2e\u6d3e");
            return;
        }
        String IiiiiiiiIIIII2 = this.iiIiiiiiiiIii.getText().trim();
        String IiiiiiiiIIIII3 = this.iIiIiiiiIiIii.getText().trim();
        if (IiiiiiiiIIIII2.equals("")) {
            this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u5e2e\u6d3e\u540d\u4e3a\u7a7a");
            return;
        }
        if (IiiiiiiiIIIII3.equals("")) {
            this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u5e2e\u6d3e\u5b97\u65e8\u4e3a\u7a7a");
            return;
        }
        RoleData roleData = this.ALLATORIxDEMO();
        if (roleData.ALLATORIxDEMO(new BigDecimal(501)) != null) {
            void IiiiiiiiIIIII4;
            Gang gang = new Gang();
            IiiiiiiiIIIII4.setGangname(IiiiiiiiIIIII2);
            IiiiiiiiIIIII4.setIntroduction(IiiiiiiiIIIII3);
            String IiiiiiiiIIIII5 = Agreement.getSendTextAES((String)"gangcreate", (String)iiIiiiiiIIiii.ALLATORIxDEMO().toJson(IiiiiiiiIIIII4));
            this.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII5);
        } else {
            this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u4f60\u80cc\u5305\u6ca1\u6709\u4e09\u754c\u53ec\u96c6\u4ee4");
        }
        this.ALLATORIxDEMO().iiiIiiiiiiIIi(this.iIiIiiiiIIiii());
    }
}
