/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.iIIIiiiiIiiII
 *  com.xy.i.IIIIIiiiIIIiI
 *  com.xy.q.IiIIIiiiiIIiI
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.q.iIIiIiiiIiiIi
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.socket.Agreement
 *  com.xy.text.GameView
 *  com.xy.w.IIIIIiiiIiiII
 *  com.xy.w.IIIiiiiiIiIiI
 */
package com.xy.a;

import com.xy.a.iIIIiiiiIiiII;
import com.xy.i.IIIIIiiiIIIiI;
import com.xy.q.IiIIIiiiiIIiI;
import com.xy.q.IiiiIiiiiIiIi;
import com.xy.q.iIIiIiiiIiiIi;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import com.xy.w.IIIIIiiiIiiII;
import com.xy.w.IIIiiiiiIiIiI;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.math.BigDecimal;
import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;

public class iIIiiiiiIiIII
extends IiiiIiiiiIiIi {
    private IIIiiiiiIiIiI[] iiiIiiiiiiiIi;
    private BigDecimal iIiiIiiiiiiII;
    private JScrollPane IIiiIiiiIIiIi;
    private IIIIIiiiIIIiI[] iIiIiiiiIiIii;
    private DefaultListModel<String> IiIIIiiiiIiiI;
    private iIIiIiiiIiiIi[] iiIiiiiiiiIii;
    private JLabel[] IiiiiiiiIIIII;
    private JList<String> ALLATORIxDEMO;

    public iIIiiiiiIiIII(GameView gameView) {
        super(37, 3, IiiiIiiiiIiIi.iIIIIiiiiiIIi, gameView);
        this.ALLATORIxDEMO(-1, 0, 266, 330, IiiiIiiiiIiIi.iiIIIiiiiiiiI);
        this.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/1.png", (int)68, (int)68, (int)68, (int)68, (boolean)false), "\u4efb\u547d");
        this.iIiIiiiiIiIii = new IIIIIiiiIIIiI[2];
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iIiIiiiiIiIii.length) {
            this.iIiIiiiiIiIii[IiiiiiiiIIIII] = new IIIIIiiiIIIiI("sc/e/7.png", 1, 214 + IiiiiiiiIIIII, iiIIiiiiIiiII.iiiiIiiiIiiII, iiIIiiiiIiiII.IIiiiiiiIiiII, IiiiiiiiIIIII == 0 ? "\u786e\u8ba4" : (IiiiiiiiIIIII == 1 ? "\u53d6\u6d88" : ""), (IiiiIiiiiIiIi)this);
            this.iIiIiiiiIiIii[IiiiiiiiIIIII].setBounds(70 + IiiiiiiiIIIII * 89, 286, 59, 25);
            this.iIiIiiiiIiIii[IiiiiiiiIIIII].setText(IiiiiiiiIIIII == 0 ? "\u786e\u8ba4" : (IiiiiiiiIIIII == 1 ? "\u53d6\u6d88" : ""));
            this.add((Component)this.iIiIiiiiIiIii[IiiiiiiiIIIII++]);
        }
        this.iiIiiiiiiiIii = new iIIiIiiiIiiIi[3];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iiIiiiiiiiIii.length) {
            this.iiIiiiiiiiIii[IiiiiiiiIIIII] = IiIIIiiiiIIiI.ALLATORIxDEMO((int)87, (int)(32 + IiiiiiiiIIIII * 26), (int)154, (int)19, (int)10, (Color)Color.white, (Font)iiIIiiiiIiiII.iIIIiiiiIIIii);
            this.iiIiiiiiiiIii[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/17.png", (int)3, (int)3, (int)3, (int)3, (boolean)false));
            this.add((Component)this.iiIiiiiiiiIii[IiiiiiiiIIIII++]);
        }
        this.IiiiiiiiIIIII = new JLabel[4];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IiiiiiiiIIIII.length) {
            this.IiiiiiiiIIIII[IiiiiiiiIIIII] = IiIIIiiiiIIiI.ALLATORIxDEMO((int)46, (int)(32 + 26 * IiiiiiiiIIIII), (int)36, (int)19, (int)0, (Color)iiIIiiiiIiiII.ALLATORIxDEMO((String)"#c000000"), (Font)iiIIiiiiIiiII.iiiiIiiiIiiII);
            this.IiiiiiiiIIIII[IiiiiiiiIIIII].setText(IiiiiiiiIIIII == 0 ? "\u540d\u79f0" : (IiiiiiiiIIIII == 1 ? "\u79cd\u65cf" : (IiiiiiiiIIIII == 2 ? "\u7b49\u7ea7" : (IiiiiiiiIIIII == 3 ? "\u804c\u4f4d\u5217\u8868" : ""))));
            this.add(this.IiiiiiiiIIIII[IiiiiiiiIIIII]);
            if (IiiiiiiiIIIII == 3) {
                this.IiiiiiiiIIIII[IiiiiiiiIIIII].setForeground(iiIIiiiiIiiII.ALLATORIxDEMO((String)"#cFFFFFF"));
                this.IiiiiiiiIIIII[IiiiiiiiIIIII].setBounds(47, 113, 194, 21);
            }
            ++IiiiiiiiIIIII;
        }
        this.IiIIIiiiiIiiI = new DefaultListModel();
        this.IiIIIiiiiIiiI.add(0, "\u62a4\u6cd5");
        this.IiIIIiiiiIiiI.add(1, "\u957f\u8001");
        this.IiIIIiiiiIiiI.add(2, "\u5802\u4e3b");
        this.IiIIIiiiiIiiI.add(3, "\u9999\u4e3b");
        this.IiIIIiiiiIiiI.add(4, "\u7cbe\u82f1");
        this.IiIIIiiiiIiiI.add(5, "\u5e2e\u4f17");
        this.ALLATORIxDEMO = new JList();
        this.ALLATORIxDEMO.setSelectionBackground(new Color(33, 42, 52));
        this.ALLATORIxDEMO.setSelectionForeground(Color.GREEN);
        this.ALLATORIxDEMO.setForeground(Color.GREEN);
        this.ALLATORIxDEMO.setFont(iiIIiiiiIiiII.iIiIIiiiiIIiI);
        this.ALLATORIxDEMO.setBackground(iiIIiiiiIiiII.IIiIiiiiIIiII);
        this.ALLATORIxDEMO.setModel(this.IiIIIiiiiIiiI);
        this.IIiiIiiiIIiIi = IiIIIiiiiIIiI.ALLATORIxDEMO((int)49, (int)133, (int)195, (int)146, this.ALLATORIxDEMO, (int)-1);
        this.add(this.IIiiIiiiIIiIi);
        this.iiiIiiiiiiiIi = new IIIiiiiiIiIiI[2];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iiiIiiiiiiiIi.length) {
            this.iiiIiiiiiiiIi[IiiiiiiiIIIII] = new IIIiiiiiIiIiI();
            if (IiiiiiiiIIIII == 0) {
                this.iiiIiiiiiiiIi[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/25.png", (int)2, (int)2, (int)2, (int)2, (boolean)false));
                this.iiiIiiiiiiiIi[IiiiiiiiIIIII].setBounds(47, 113, 194, 21);
            } else if (IiiiiiiiIIIII == 1) {
                this.iiiIiiiiiiiIi[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/24.png", (int)2, (int)2, (int)2, (int)2, (boolean)false));
                this.iiiIiiiiiiiIi[IiiiiiiiIIIII].setBounds(47, 113, 194, 166);
            }
            this.add((Component)this.iiiIiiiiiiiIi[IiiiiiiiIIIII++]);
        }
    }

    public void ALLATORIxDEMO(BigDecimal roleId, String roleName, String race, String lvl) {
        this.iIiiIiiiiiiII = roleId;
        this.iiIiiiiiiiIii[0].setText(roleName);
        this.iiIiiiiiiiIii[1].setText(race);
        this.iiIiiiiiiiIii[2].setText(lvl);
        this.ALLATORIxDEMO().iIiIiiiiIIiIi(this.iIiIiiiiIIiii());
    }

    public void iIiIiiiiIIiii(int id) {
        if (id != 214) {
            if (id != 215) return;
            this.ALLATORIxDEMO().iiiIiiiiiiIIi(this.iIiIiiiiIIiii());
            return;
        }
        String IiiiiiiiIIIII = this.ALLATORIxDEMO.getSelectedValue();
        if (IiiiiiiiIIIII == null) return;
        if (IiiiiiiiIIIII.equals("")) {
            return;
        }
        String string = Agreement.getSendTextAES((String)"gangappoint", (String)(this.iIiiIiiiiiiII + "|" + IiiiiiiiIIIII));
        this.ALLATORIxDEMO().ALLATORIxDEMO(string);
        this.ALLATORIxDEMO().iiiIiiiiiiIIi(this.iIiIiiiiIIiii());
        iIIIiiiiIiiII IiiiiiiiIIIII2 = (iIIIiiiiIiiII)this.ALLATORIxDEMO().iIiIiiiiIIiii(48);
        if (IiiiiiiiIIIII2 == null) return;
        IiiiiiiiIIIII2.ALLATORIxDEMO(this.iIiiIiiiiiiII, IiiiiiiiIIIII);
    }
}
