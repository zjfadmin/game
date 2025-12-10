/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.IIIiiiiiIiIIi
 *  com.xy.a.IiIIiiiiiIIII
 *  com.xy.a.iiiiIiiiiiIII
 *  com.xy.i.IIIIIiiiIIIiI
 *  com.xy.q.IiIIIiiiiIIiI
 *  com.xy.q.IiiiIiiiiIiII
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.text.GameView
 *  com.xy.v.IIiiIiiiiIIiI
 *  com.xy.v.iiiiiiiiIIIII
 *  com.xy.w.IIIIIiiiIiiII
 *  com.xy.w.IIIiiiiiIiIiI
 *  com.xy.w.IIiIiiiiIIiii
 */
package com.xy.a;

import com.xy.a.IIIiiiiiIiIIi;
import com.xy.a.IiIIiiiiiIIII;
import com.xy.a.iiiiIiiiiiIII;
import com.xy.i.IIIIIiiiIIIiI;
import com.xy.q.IiIIIiiiiIIiI;
import com.xy.q.IiiiIiiiiIiII;
import com.xy.q.IiiiIiiiiIiIi;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.text.GameView;
import com.xy.v.IIiiIiiiiIIiI;
import com.xy.v.iiiiiiiiIIIII;
import com.xy.w.IIIIIiiiIiiII;
import com.xy.w.IIIiiiiiIiIiI;
import com.xy.w.IIiIiiiiIIiii;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JScrollPane;

public class iIiIIiiiiiiii
extends IiiiIiiiiIiIi {
    private JScrollPane IIiiIiiiIIiIi;
    private IIIiiiiiIiIiI[] iIiIiiiiIiIii;
    private IIIIIiiiIIIiI[] IiIIIiiiiIiiI;
    private JComponent iiIiiiiiiiIii;
    private IiiiIiiiiIiII IiiiiiiiIIIII;
    private JLabel[] ALLATORIxDEMO;

    public String ALLATORIxDEMO(int index) {
        return ((iiiiIiiiiiIII)this.iiIiiiiiiiIii.getComponent(index)).ALLATORIxDEMO();
    }

    public iIiIIiiiiiiii(GameView gameView) {
        super(160, 2, IiiiIiiiiIiIi.iIIIIiiiiiIIi, gameView);
        this.ALLATORIxDEMO(-1, 0, 272, 353, IiiiIiiiiIiIi.iiIIIiiiiiiiI);
        this.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/1.png", (int)68, (int)68, (int)68, (int)68, (boolean)false), "\u5173\u952e\u8bcd\u641c\u7d22");
        this.ALLATORIxDEMO(new iiiiiiiiIIIII(14, 0, 0, 18));
        this.ALLATORIxDEMO = new JLabel[3];
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.ALLATORIxDEMO.length) {
            this.ALLATORIxDEMO[IiiiiiiiIIIII] = IiIIIiiiiIIiI.ALLATORIxDEMO((int)47, (int)37, (int)87, (int)17, (Color)Color.white, (Font)iiIIiiiiIiiII.iiiiIiiiIiiII);
            this.ALLATORIxDEMO[IiiiiiiiIIIII].setText(IiiiiiiiIIIII == 0 ? "\u6dfb\u52a0\u5173\u952e\u8bcd" : (IiiiiiiiIIIII == 1 ? "\u641c\u7d22\u4e2d\u7684\u5173\u952e\u8bcd" : (IiiiiiiiIIIII == 2 ? "\u804a\u5929\u9891\u9053\u663e\u793a\u641c\u7d22\u4fe1\u606f" : "")));
            this.ALLATORIxDEMO[IiiiiiiiIIIII].setHorizontalAlignment(10);
            if (IiiiiiiiIIIII == 0) {
                this.ALLATORIxDEMO[IiiiiiiiIIIII].setForeground(Color.black);
            } else if (IiiiiiiiIIIII == 1) {
                this.ALLATORIxDEMO[IiiiiiiiIIIII].setBounds(50, 57, 190, 21);
                this.ALLATORIxDEMO[IiiiiiiiIIIII].setHorizontalAlignment(0);
            } else if (IiiiiiiiIIIII == 2) {
                this.ALLATORIxDEMO[IiiiiiiiIIIII].setBounds(67, 260, 173, 17);
                this.ALLATORIxDEMO[IiiiiiiiIIIII].setFont(iiIIiiiiIiiII.iIiIiiiiiiIIi);
                this.ALLATORIxDEMO[IiiiiiiiIIIII].setForeground(Color.black);
            }
            this.add(this.ALLATORIxDEMO[IiiiiiiiIIIII++]);
        }
        this.IiIIIiiiiIiiI = new IIIIIiiiIIIiI[2];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IiIIIiiiiIiiI.length) {
            this.IiIIIiiiiIiiI[IiiiiiiiIIIII] = new IIIIIiiiIIIiI(IiiiiiiiIIIII == 0 ? "sc/e/26.png" : "sc/e/6.png", 1, 341 + IiiiiiiiIIIII, IiiiiiiiIIIII == 0 ? iiIIiiiiIiiII.iiiiIiiiIiiII : iiIIiiiiIiiII.iiIiiiiiiIIiI, null, IiiiiiiiIIIII == 0 ? "\u786e\u5b9a\u641c\u7d22" : (IiiiiiiiIIIII == 1 ? "\u6dfb\u52a0" : ""), (IiiiIiiiiIiIi)this);
            if (IiiiiiiiIIIII == 0) {
                this.IiIIIiiiiIiiI[IiiiiiiiIIIII].setForeground(Color.black);
                this.IiIIIiiiiIiiI[IiiiiiiiIIIII].setBounds(92, 287, 99, 25);
            } else if (IiiiiiiiIIIII == 1) {
                this.IiIIIiiiiIiiI[IiiiiiiiIIIII].setBounds(212, 37, 34, 18);
            }
            this.add((Component)this.IiIIIiiiiIiiI[IiiiiiiiIIIII++]);
        }
        this.IiiiiiiiIIIII = IiIIIiiiiIIiI.ALLATORIxDEMO((IIiIiiiiIIiii)IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/17.png", (int)6, (int)6, (int)6, (int)6, (boolean)false), (Font)iiIIiiiiIiiII.iIIIiiiiIIIii, (Color)Color.white);
        this.IiiiiiiiIIIII.setHorizontalAlignment(10);
        this.IiiiiiiiIIIII.setBounds(134, 37, 105, 17);
        this.add((Component)this.IiiiiiiiIIIII);
        this.iiIiiiiiiiIii = new IIIiiiiiIiIIi(this);
        this.IIiiIiiiIIiIi = IiIIIiiiiIIiI.ALLATORIxDEMO((int)50, (int)78, (int)190, (int)178, (Component)this.iiIiiiiiiiIii, (int)20);
        this.add(this.IIiiIiiiIIiIi);
        this.iIiIiiiiIiIii = new IIIiiiiiIiIiI[3];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iIiIiiiiIiIii.length) {
            this.iIiIiiiiIiIii[IiiiiiiiIIIII] = new IIIiiiiiIiIiI();
            if (IiiiiiiiIIIII == 0) {
                this.iIiIiiiiIiIii[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/25.png", (int)2, (int)2, (int)2, (int)2, (boolean)false));
                this.iIiIiiiiIiIii[IiiiiiiiIIIII].setBounds(50, 57, 190, 21);
            } else if (IiiiiiiiIIIII == 1) {
                this.iIiIiiiiIiIii[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/24.png", (int)2, (int)2, (int)2, (int)2, (boolean)false));
                this.iIiIiiiiIiIii[IiiiiiiiIIIII].setBounds(50, 57, 190, 200);
            } else if (IiiiiiiiIIIII == 2) {
                this.iIiIiiiiIiIii[IiiiiiiiIIIII].iIiIiiiiIIiii("sc/e/29.png");
                this.iIiIiiiiIiIii[IiiiiiiiIIIII].setBounds(49, 260, 17, 17);
            }
            this.add((Component)this.iIiIiiiiIiIii[IiiiiiiiIIIII++]);
        }
    }

    /*
     * Unable to fully structure code
     */
    public void ALLATORIxDEMO(int id, Object data) {
        block7: {
            if (id == 341) {
                if (this.iiIiiiiiiiIii.getComponentCount() == 0) {
                    this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u5f53\u524d\u6ca1\u6709\u8bbe\u7f6e\u5173\u952e\u8bcd");
                    return;
                }
                IiiiiiiiIIIII = (IiIIiiiiiIIII)this.iiIIiiiiIiIIi.getFormManagement().iiiIiiiiiiIIi(159);
                IiiiiiiiIIIII.IiiIiiiiiiIiI(8);
                return;
            }
            if (id != 342) break block7;
            IiiiiiiiIIIII = this.IiiiiiiiIIIII.getText().trim();
            if (IIiiIiiiiIIiI.iIiIiiiiIIiIi((String)IiiiiiiiIIIII)) {
                this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u8bf7\u8f93\u5165\u5173\u952e\u8bcd");
                return;
            }
            IiiiiiiiIIIII = this.iiIiiiiiiiIii.getComponentCount();
            IiiiiiiiIIIII = 0;
            if (true) ** GOTO lbl28
        }
        if (id != 343) return;
        IiiiiiiiIIIII = (iiiiIiiiiiIII)data;
        this.iiIiiiiiiiIii.remove((Component)IiiiiiiiIIIII);
        IiiiiiiiIIIII = this.iiIiiiiiiiIii.getComponentCount();
        IiiiiiiiIIIII = 0;
        if (true) ** GOTO lbl48
        do {
            if (IIiiIiiiiIIiI.ALLATORIxDEMO((String)IiiiiiiiIIIII, (String)(IiiiiiiiIIIII = (iiiiIiiiiiIII)this.iiIiiiiiiiIii.getComponent(IiiiiiiiIIIII)).ALLATORIxDEMO())) {
                this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u4e0d\u80fd\u6dfb\u52a0\u76f8\u540c\u5173\u952e\u8bcd");
                return;
            }
            ++IiiiiiiiIIIII;
lbl28:
            // 2 sources

        } while (IiiiiiiiIIIII < IiiiiiiiIIIII);
        ++IiiiiiiiIIIII;
        this.iiIiiiiiiiIii.add((Component)new iiiiIiiiiiIII(this, IiiiiiiiIIIII));
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < IiiiiiiiIIIII) {
            v0 = this.iiIiiiiiiiIii.getComponent(IiiiiiiiIIIII);
            v1 = 20 * IiiiiiiiIIIII;
            ++IiiiiiiiIIIII;
            v0.setBounds(0, v1, 175, 20);
        }
        this.IiiiiiiiIIIII.setText("");
        this.iiIiiiiiiiIii.setPreferredSize(new Dimension(175, IiiiiiiiIIIII * 20));
        this.IIiiIiiiIIiIi.updateUI();
        return;
        do {
            v2 = this.iiIiiiiiiiIii.getComponent(IiiiiiiiIIIII);
            v3 = 20 * IiiiiiiiIIIII;
            ++IiiiiiiiIIIII;
            v2.setBounds(0, v3, 175, 20);
lbl48:
            // 2 sources

        } while (IiiiiiiiIIIII < IiiiiiiiIIIII);
        this.iiIiiiiiiiIii.setPreferredSize(new Dimension(175, IiiiiiiiIIIII * 20));
        this.IIiiIiiiIIiIi.updateUI();
    }

    public int iiiIiiiiiiIIi() {
        return this.iiIiiiiiiiIii.getComponentCount();
    }
}
