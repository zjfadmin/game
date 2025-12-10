/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.IiIiiiiiIIIII
 *  com.xy.a.iIiIIiiiiiIII
 *  com.xy.i.IIIIIiiiIIIiI
 *  com.xy.q.IIIiiiiiIiIiI
 *  com.xy.q.IiIIIiiiiIIiI
 *  com.xy.q.iIIiIiiiIiiIi
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.readbean.AllFM
 *  com.xy.readbean.FM
 *  com.xy.richtext.RichLabel
 *  com.xy.v.iIiIIiiiIiiiI
 *  com.xy.w.IIIIIiiiIiiII
 *  com.xy.w.IIIiiiiiIiIiI
 *  com.xy.w.IIiIiiiiIiiIi
 *  com.xy.w.IiiiIiiiiIiIi
 *  com.xy.w.iiiiiiiiiiIiI
 */
package com.xy.a;

import com.xy.a.IiIiiiiiIIIII;
import com.xy.a.iIiIIiiiiiIII;
import com.xy.i.IIIIIiiiIIIiI;
import com.xy.q.IiIIIiiiiIIiI;
import com.xy.q.iIIiIiiiIiiIi;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.readbean.AllFM;
import com.xy.readbean.FM;
import com.xy.richtext.RichLabel;
import com.xy.v.iIiIIiiiIiiiI;
import com.xy.w.IIIIIiiiIiiII;
import com.xy.w.IIIiiiiiIiIiI;
import com.xy.w.IIiIiiiiIiiIi;
import com.xy.w.IiiiIiiiiIiIi;
import com.xy.w.iiiiiiiiiiIiI;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JScrollPane;

/*
 * Exception performing whole class analysis ignored.
 */
static class iIIIIiiiiIIII
extends JComponent {
    private RichLabel IiIiiiiiIIIII;
    private FM iiIiIiiiiIIIi;
    final /* synthetic */ IiIiiiiiIIIII iiiiIiiiIiiII;
    private iIIiIiiiIiiIi[] iiiIiiiiiiiIi;
    private JLabel[] iIiiIiiiiiiII;
    private IIIiiiiiIiIiI[] IIiiIiiiIIiIi;
    private List<com.xy.q.IIIiiiiiIiIiI> iIiIiiiiIiIii;
    private IIIIIiiiIIIiI[] IiIIIiiiiIiiI = new IIIIIiiiIIIiI[2];
    private JScrollPane iiIiiiiiiiIii;
    private int IiiiiiiiIIIII = -1;
    private IiiiIiiiiIiIi ALLATORIxDEMO;

    public void ALLATORIxDEMO(FM fm) {
        this.iiIiIiiiiIIIi = fm;
        this.iIiiIiiiiiiII[0].setText("<html>" + fm.getFmName() + "</html>");
        this.iIiiIiiiiiiII[1].setText(String.valueOf(fm.getFmLvl()));
        this.iiiIiiiiiiiIi[1].setText(String.valueOf(fm.getFmLvl()));
        this.ALLATORIxDEMO = iiiiiiiiiiIiI.ALLATORIxDEMO((String)fm.getFmSkin(), (int)7, (int)1, null);
        StringBuffer IiiiiiiiIIIII = new StringBuffer();
        if (fm.getFmMsg1() != null) {
            IiiiiiiiIIIII.append(fm.getFmMsg1());
        }
        if (fm.getFmMsg2() != null) {
            IiiiiiiiIIIII.append("#r");
            IiiiiiiiIIIII.append(fm.getFmMsg2());
        }
        this.IiIiiiiiIIIII.setTextSize(IiiiiiiiIIIII.toString(), 190);
    }

    static /* synthetic */ int ALLATORIxDEMO(iIIIIiiiiIIII arg0) {
        return arg0.IiiiiiiiIIIII;
    }

    public iIIIIiiiiIIII(IiIiiiiiIIIII iiIiiiiiIIIII) {
        this.iiiiIiiiIiiII = iiIiiiiiIIIII;
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IiIIIiiiiIiiI.length) {
            this.IiIIIiiiiIiiI[IiiiiiiiIIIII] = new IIIIIiiiIIIiI(IiiiiiiiIIIII == 0 ? "sc/e/42.png" : "sc/e/43.png", 1, 311 + IiiiiiiiIIIII, iiIiiiiiIIIII.ALLATORIxDEMO());
            this.IiIIIiiiiIiiI[IiiiiiiiIIIII].setBounds(109 + 154 * IiiiiiiiIIIII, 425, 18, 18);
            this.add((Component)this.IiIIIiiiiIiiI[IiiiiiiiIIIII++]);
        }
        this.iIiiIiiiiiiII = new JLabel[4];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iIiiIiiiiiiII.length) {
            this.iIiiIiiiiiiII[IiiiiiiiIIIII] = IiIIIiiiiIIiI.ALLATORIxDEMO((int)366, (int)70, (int)18, (int)100, (Color)Color.white, (Font)iiIIiiiiIiiII.IIiiIiiiIIiIi);
            this.iIiiIiiiiiiII[IiiiiiiiIIIII].setText(IiiiiiiiIIIII == 2 ? "\u51fb\u6740\u83b7\u5f97" : (IiiiiiiiIIIII == 3 ? "\u79ef\u5206" : ""));
            this.iIiiIiiiiiiII[IiiiiiiiIIIII].setHorizontalAlignment(0);
            if (IiiiiiiiIIIII == 1) {
                this.iIiiIiiiiiiII[IiiiiiiiIIIII].setFont(iiIIiiiiIiiII.iIiIIiiiiIIiI);
                this.iIiiIiiiiiiII[IiiiiiiiIIIII].setBounds(542, 93, 41, 15);
            } else if (IiiiiiiiIIIII == 2) {
                this.iIiiIiiiiiiII[IiiiiiiiIIIII].setFont(iiIIiiiiIiiII.iiIiiiiiiIIiI);
                this.iIiiIiiiiiiII[IiiiiiiiIIIII].setBounds(393, 213, 60, 18);
                this.iIiiIiiiiiiII[IiiiiiiiIIIII].setForeground(Color.red);
                this.iIiiIiiiiiiII[IiiiiiiiIIIII].setHorizontalAlignment(4);
            } else if (IiiiiiiiIIIII == 3) {
                this.iIiiIiiiiiiII[IiiiiiiiIIIII].setFont(iiIIiiiiIiiII.iiIiiiiiiIIiI);
                this.iIiiIiiiiiiII[IiiiiiiiIIIII].setBounds(522, 213, 60, 18);
                this.iIiiIiiiiiiII[IiiiiiiiIIIII].setForeground(Color.red);
                this.iIiiIiiiiiiII[IiiiiiiiIIIII].setHorizontalAlignment(10);
            }
            this.add(this.iIiiIiiiiiiII[IiiiiiiiIIIII++]);
        }
        this.iiiIiiiiiiiIi = new iIIiIiiiIiiIi[2];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iiiIiiiiiiiIi.length) {
            this.iiiIiiiiiiiIi[IiiiiiiiIIIII] = IiIIIiiiiIIiI.ALLATORIxDEMO((int)133, (int)425, (int)124, (int)19, (int)0, (Color)Color.white, (Font)iiIIiiiiIiiII.iIIIiiiiIIIii);
            this.iiiIiiiiiiiIi[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/17.png", (int)6, (int)6, (int)6, (int)6, (boolean)false));
            if (IiiiiiiiIIIII == 1) {
                this.iiiIiiiiiiiIi[IiiiiiiiIIIII].setBounds(457, 214, 60, 18);
            }
            this.add((Component)this.iiiIiiiiiiiIi[IiiiiiiiIIIII++]);
        }
        this.IIiiIiiiIIiIi = new IIIiiiiiIiIiI[5];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IIiiIiiiIIiIi.length) {
            this.IIiiIiiiIIiIi[IiiiiiiiIIIII] = new IIIiiiiiIiIiI();
            if (IiiiiiiiIIIII == 0) {
                this.IIiiIiiiIIiIi[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/24.png", (int)2, (int)2, (int)2, (int)2, (boolean)false));
                this.IIiiIiiiIIiIi[IiiiiiiiIIIII].setBounds(43, 65, 305, 388);
            } else if (IiiiiiiiIIIII == 1) {
                this.IIiiIiiiIIiIi[IiiiiiiiIIIII].iIiIiiiiIIiii("sc/d/75.png");
                this.IIiiIiiiIIiIi[IiiiiiiiIIIII].setBounds(361, 68, 28, 157);
            } else if (IiiiiiiiIIIII == 2) {
                this.IIiiIiiiIIiIi[IiiiiiiiIIIII].iIiIiiiiIIiii("sc/d/76.png");
                this.IIiiIiiiIIiIi[IiiiiiiiIIIII].setBounds(542, 67, 42, 41);
            } else if (IiiiiiiiIIIII == 3) {
                this.IIiiIiiiIIiIi[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/36.png", (int)20, (int)20, (int)20, (int)20, (boolean)false));
                this.IIiiIiiiIIiIi[IiiiiiiiIIIII].setBounds(357, 65, 236, 172);
            } else if (IiiiiiiiIIIII == 4) {
                this.IIiiIiiiIIiIi[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/24.png", (int)2, (int)2, (int)2, (int)2, (boolean)false));
                this.IIiiIiiiIIiIi[IiiiiiiiIIIII].setBounds(357, 239, 236, 213);
            }
            this.add((Component)this.IIiiIiiiIIiIi[IiiiiiiiIIIII++]);
        }
        this.iIiIiiiiIiIii = new ArrayList<com.xy.q.IIIiiiiiIiIiI>();
        this.IiIiiiiiIIIII = new RichLabel("", iiIIiiiiIiiII.iIiIIiiiiIIiI);
        this.iiIiiiiiiiIii = IiIIIiiiiIIiI.ALLATORIxDEMO((int)362, (int)240, (int)235, (int)214, (Component)this.IiIiiiiiIIIII, (int)20);
        this.add(this.iiIiiiiiiiIii);
        this.setBounds(0, 0, 620, 479);
    }

    static /* synthetic */ FM ALLATORIxDEMO(iIIIIiiiiIIII arg0) {
        return arg0.iiIiIiiiiIIIi;
    }

    public void ALLATORIxDEMO(int page) {
        AllFM IiiiiiiiIIIII = this.iiiiIiiiIiiII.ALLATORIxDEMO().ALLATORIxDEMO();
        if (IiiiiiiiIIIII == null) {
            return;
        }
        List IiiiiiiiIIIII2 = IiiiiiiiIIIII.getFmType();
        int n = page < 0 ? 0 : (page = page < IiiiiiiiIIIII2.size() ? page : IiiiiiiiIIIII2.size() - 1);
        if (page == this.IiiiiiiiIIIII) {
            return;
        }
        this.IiiiiiiiIIIII = page;
        String IiiiiiiiIIIII3 = (String)IiiiiiiiIIIII2.get(this.IiiiiiiiIIIII);
        this.iiiIiiiiiiiIi[0].setText(IiiiiiiiIIIII3);
        List IiiiiiiiIIIII4 = IiiiiiiiIIIII.getAllList();
        int IiiiiiiiIIIII5 = 0;
        int IiiiiiiiIIIII6 = 0;
        while (IiiiiiiiIIIII6 < IiiiiiiiIIIII4.size()) {
            FM IiiiiiiiIIIII7 = (FM)IiiiiiiiIIIII4.get(IiiiiiiiIIIII6);
            if (IiiiiiiiIIIII7.getFmType().equals(IiiiiiiiIIIII3)) {
                com.xy.q.IIIiiiiiIiIiI IiiiiiiiIIIII8 = null;
                if (IiiiiiiiIIIII6 < this.iIiIiiiiIiIii.size()) {
                    IiiiiiiiIIIII8 = this.iIiIiiiiIiIii.get(IiiiiiiiIIIII6);
                } else {
                    IiiiiiiiIIIII8 = new iIiIIiiiiiIII(this, this.iiiiIiiiIiiII.ALLATORIxDEMO());
                    IiiiiiiiIIIII8.ALLATORIxDEMO("sc/d/51.png");
                    IiiiiiiiIIIII8.ALLATORIxDEMO(com.xy.q.IIIiiiiiIiIiI.IIiIiiiiIiiiI);
                    IiiiiiiiIIIII8.setBounds(62 + IiiiiiiiIIIII5 % 5 * 55, 78 + IiiiiiiiIIIII5 / 5 * 55, 45, 45);
                    this.add((Component)IiiiiiiiIIIII8, 0);
                    this.iIiIiiiiIiIii.add(IiiiiiiiIIIII8);
                }
                IiiiiiiiIIIII8.ALLATORIxDEMO(0, (Object)IiiiiiiiIIIII7);
                ++IiiiiiiiIIIII5;
                IiiiiiiiIIIII8.iIiIiiiiIIiii(IIiIiiiiIiiIi.iiiIiiiiiiIIi((String)IiiiiiiiIIIII7.getFmHead()));
                IiiiiiiiIIIII8.setVisible(true);
            }
            ++IiiiiiiiIIIII6;
        }
        IiiiiiiiIIIII6 = this.iIiIiiiiIiIii.size() - 1;
        while (IiiiiiiiIIIII6 >= IiiiiiiiIIIII5) {
            this.remove((Component)this.iIiIiiiiIiIii.get(IiiiiiiiIIIII6));
            this.iIiIiiiiIiIii.remove(IiiiiiiiIIIII6--);
        }
    }

    static /* synthetic */ void ALLATORIxDEMO(iIIIIiiiiIIII arg0, IiiiIiiiiIiIi arg1) {
        arg0.ALLATORIxDEMO = arg1;
    }

    static /* synthetic */ IiiiIiiiiIiIi ALLATORIxDEMO(iIIIIiiiiIIII arg0) {
        return arg0.ALLATORIxDEMO;
    }

    @Override
    protected void paintChildren(Graphics g) {
        super.paintChildren(g);
        if (this.ALLATORIxDEMO == null) return;
        this.ALLATORIxDEMO.ALLATORIxDEMO(g, 486, 202, 0, iIiIIiiiIiiiI.ALLATORIxDEMO());
    }
}
