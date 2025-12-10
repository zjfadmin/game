/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.i.IIiIiiiiIiIII
 *  com.xy.q.IIiIIiiiIIIiI
 *  com.xy.q.IIiiiiiiIIIii
 *  com.xy.q.IiIIIiiiiIIiI
 *  com.xy.q.IiiiIiiiiIiII
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.richtext.RichLabel
 *  com.xy.socket.Agreement
 *  com.xy.text.GameAWTEventListener
 *  com.xy.text.GameView
 *  com.xy.v.IIiiIiiiiIIiI
 *  com.xy.w.IIIIIiiiIiiII
 *  com.xy.w.IIIiiiiiIiIiI
 *  com.xy.w.IIiIiiiiIIiii
 */
package com.xy.a;

import com.xy.i.IIiIiiiiIiIII;
import com.xy.q.IIiIIiiiIIIiI;
import com.xy.q.IIiiiiiiIIIii;
import com.xy.q.IiIIIiiiiIIiI;
import com.xy.q.IiiiIiiiiIiII;
import com.xy.q.IiiiIiiiiIiIi;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.richtext.RichLabel;
import com.xy.socket.Agreement;
import com.xy.text.GameAWTEventListener;
import com.xy.text.GameView;
import com.xy.v.IIiiIiiiiIIiI;
import com.xy.w.IIIIIiiiIiiII;
import com.xy.w.IIIiiiiiIiIiI;
import com.xy.w.IIiIiiiiIIiii;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class iiIiIiiiIIIiI
extends IiiiIiiiiIiIi {
    private IIiIIiiiIIIiI[] iiiIiiiiiiiIi;
    private RichLabel iIiiIiiiiiiII;
    private JLabel[] IIiiIiiiIIiIi;
    private IIiIiiiiIiIII iIiIiiiiIiIii;
    private IIIiiiiiIiIiI IiIIIiiiiIiiI;
    private IIiiiiiiIIIii iiIiiiiiiiIii;
    private JScrollPane IiiiiiiiIIIII;
    private IiiiIiiiiIiII[] ALLATORIxDEMO;

    public iiIiIiiiIIIiI(GameView gameView) {
        super(181, 2, IiiiIiiiiIiIi.iIIIIiiiiiIIi, gameView);
        this.ALLATORIxDEMO(-1, 0, 364, 340, IiiiIiiiiIiIi.iiIIIiiiiiiiI);
        this.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/1.png", (int)68, (int)68, (int)68, (int)68, (boolean)false), "\u8d27\u90ce\u558a\u8bdd");
        this.iIiIiiiiIiIii = new IIiIiiiiIiIII("sc/e/26.png", 1, 373, iiIIiiiiIiiII.iiiiIiiiIiiII, iiIIiiiiIiiII.IIiiiiiiIiiII, "\u5f00\u59cb\u6267\u884c", (IiiiIiiiiIiIi)this);
        this.iIiIiiiiIiIii.setBounds(145, 295, 99, 25);
        this.add((Component)this.iIiIiiiiIiIii);
        this.IIiiIiiiIIiIi = new JLabel[4];
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IIiiIiiiIIiIi.length) {
            this.IIiiIiiiIIiIi[IiiiiiiiIIIII] = IiIIIiiiiIIiI.ALLATORIxDEMO((int)49, (int)27, (int)100, (int)19, (Color)Color.black, (Font)iiIIiiiiIiiII.iiiiIiiiIiiII);
            this.IIiiIiiiIIiIi[IiiiiiiiIIIII].setText(IiiiiiiiIIIII == 0 ? "\u558a\u8bdd\u8bbe\u7f6e" : (IiiiiiiiIIIII == 1 ? "\u95f4\u9694\u5206\u949f" : (IiiiiiiiIIIII == 2 ? "\u558a\u8bdd\u6b21\u6570" : (IiiiiiiiIIIII == 3 ? "\u558a\u8bdd\u5185\u5bb9" : ""))));
            this.IIiiIiiiIIiIi[IiiiiiiiIIIII].setHorizontalAlignment(10);
            this.add(this.IIiiIiiiIIiIi[IiiiiiiiIIIII]);
            if (IiiiiiiiIIIII == 0) {
                this.IIiiIiiiIIiIi[IiiiiiiiIIIII].setFont(iiIIiiiiIiiII.IIiiiiiiiIIIi);
            } else if (IiiiiiiiIIIII >= 1 && IiiiiiiiIIIII <= 3) {
                this.IIiiIiiiIIiIi[IiiiiiiiIIIII].setBounds(70, 69 + (IiiiiiiiIIIII - 1) * 25, 72, 19);
            }
            ++IiiiiiiiIIIII;
        }
        this.iIiiIiiiiiiII = new RichLabel("", iiIIiiiiIiiII.iIIiiiiiiIIII);
        this.iIiiIiiiiiiII.setTextSize("#c000000\u81ea\u52a8\u558a\u8bdd\uff1a#r\u7cfb\u7edf\u6bcf\u9694\u4e00\u6bb5\u65f6\u95f4\u540e\u81ea\u52a8\u558a\u8bdd\u3002#r\u6bcf\u6b21\u558a\u8bdd\u6263\u9664#cFF0000200#c000000\u4e07\u4e24\u5927\u8bdd\u5e01\u3002", 280);
        this.iIiiIiiiiiiII.setBounds(55, 232, this.iIiiIiiiiiiII.getWidth(), this.iIiiIiiiiiiII.getHeight());
        this.add((Component)this.iIiiIiiiiiiII);
        this.ALLATORIxDEMO = new IiiiIiiiiIiII[2];
        this.iiiIiiiiiiiIi = new IIiIIiiiIIIiI[2];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.ALLATORIxDEMO.length) {
            this.ALLATORIxDEMO[IiiiiiiiIIIII] = IiIIIiiiiIIiI.ALLATORIxDEMO((IIiIiiiiIIiii)IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/17.png", (int)6, (int)6, (int)6, (int)6, (boolean)false), (Font)iiIIiiiiIiiII.iIIIiiiiIIIii, (Color)Color.white);
            this.ALLATORIxDEMO[IiiiiiiiIIIII].setBounds(144, 69 + 25 * IiiiiiiiIIIII, 115, 19);
            this.iiiIiiiiiiiIi[IiiiiiiiIIIII] = new IIiIIiiiIIIiI(0, (JTextField)this.ALLATORIxDEMO[IiiiiiiiIIIII], (IiiiIiiiiIiIi)this);
            this.add((Component)this.ALLATORIxDEMO[IiiiiiiiIIIII++]);
        }
        this.iiIiiiiiiiIii = IiIIIiiiiIIiI.ALLATORIxDEMO((IIiIiiiiIIiii)IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/17.png", (int)3, (int)3, (int)3, (int)3, (boolean)false), (Font)iiIIiiiiIiiII.iIiIIiiiiIIiI, (Color)Color.white);
        this.iiIiiiiiiiIii.setLineWrap(true);
        this.iiIiiiiiiiIii.setWrapStyleWord(true);
        this.IiiiiiiiIIIII = IiIIIiiiiIIiI.ALLATORIxDEMO((int)74, (int)140, (int)250, (int)77, (Component)this.iiIiiiiiiiIii, (int)20);
        this.add(this.IiiiiiiiIIIII);
        this.IiIIIiiiiIiiI = new IIIiiiiiIiIiI();
        this.IiIIIiiiiIiiI.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/36.png", (int)20, (int)20, (int)20, (int)20, (boolean)false));
        this.IiIIIiiiiIiiI.setBounds(54, 52, 281, 176);
        this.add((Component)this.IiIIIiiiiIiiI);
    }

    public void iIiIiiiiIIiii() {
        this.ALLATORIxDEMO[0].setText("5");
        this.ALLATORIxDEMO[1].setText("10");
        this.iiIiiiiiiiIii.setText(null);
        super.iIiIiiiiIIiii();
    }

    public void iIiIiiiiIIiii(int id) {
        if (id != 373) return;
        int IiiiiiiiIIIII = (int)this.iiiIiiiiiiiIi[0].ALLATORIxDEMO();
        int IiiiiiiiIIIII2 = (int)this.iiiIiiiiiiiIi[1].ALLATORIxDEMO();
        if (IiiiiiiiIIIII <= 0) {
            this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u65f6\u95f4\u95f4\u9694\u4e0d\u80fd\u4e3a0");
            return;
        }
        if (IiiiiiiiIIIII2 <= 0) {
            this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u558a\u8bdd\u6b21\u6570\u4e0d\u80fd\u4e3a0");
            return;
        }
        String IiiiiiiiIIIII3 = this.iiIiiiiiiiIii.getText().trim().replace("\n", "");
        if (IIiiIiiiiIIiI.iIiIiiiiIIiIi((String)IiiiiiiiIIIII3)) {
            this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u558a\u8bdd\u5185\u5bb9\u4e0d\u80fd\u4e3a\u7a7a");
            return;
        }
        if (IiiiiiiiIIIII3.length() > 100) {
            this.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u6700\u5927\u5b57\u7b26\u9650\u5236100\u4e2a");
            return;
        }
        if (GameAWTEventListener.ALLATORIxDEMO((String)IiiiiiiiIIIII3)) {
            this.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u53d1\u9001\u5185\u5bb9\u5e26\u6709\u654f\u611f\u8bcd");
            return;
        }
        StringBuffer IiiiiiiiIIIII4 = new StringBuffer();
        IiiiiiiiIIIII4.append("AUTOMSG");
        IiiiiiiiIIIII4.append(IiiiiiiiIIIII);
        IiiiiiiiIIIII4.append("|");
        IiiiiiiiIIIII4.append(IiiiiiiiIIIII2);
        IiiiiiiiIIIII4.append("|");
        IiiiiiiiIIIII4.append(IiiiiiiiIIIII3);
        String IiiiiiiiIIIII5 = Agreement.getSendTextAES((String)"stall", (String)IiiiiiiiIIIII4.toString());
        this.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII5);
        this.ALLATORIxDEMO().iiiIiiiiiiIIi(this.iIiIiiiiIIiii());
    }
}
