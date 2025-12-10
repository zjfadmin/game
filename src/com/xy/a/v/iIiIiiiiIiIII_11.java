/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.v.IIIiIiiiIiIII
 *  com.xy.a.v.iIIIIiiiIiiIi
 *  com.xy.a.v.iiIiIiiiiIiii
 *  com.xy.i.iiIiIiiiIIIiI
 *  com.xy.q.IiIIIiiiiIIiI
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.readbean.Activity
 *  com.xy.scene.BWDHTeam
 *  com.xy.socket.Agreement
 *  com.xy.v.iIiIIiiiIiiiI
 *  com.xy.v.iiiiiiiiiiIiI
 *  com.xy.w.IIIIIiiiIiiII
 *  com.xy.w.IIIiiiiiIiIiI
 */
package com.xy.a.v;

import com.xy.a.v.IIIiIiiiIiIII;
import com.xy.a.v.iIIIIiiiIiiIi;
import com.xy.a.v.iiIiIiiiiIiii;
import com.xy.i.iiIiIiiiIIIiI;
import com.xy.q.IiIIIiiiiIIiI;
import com.xy.q.IiiiIiiiiIiIi;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.readbean.Activity;
import com.xy.scene.BWDHTeam;
import com.xy.socket.Agreement;
import com.xy.v.iIiIIiiiIiiiI;
import com.xy.v.iiiiiiiiiiIiI;
import com.xy.w.IIIIIiiiIiiII;
import com.xy.w.IIIiiiiiIiIiI;
import java.awt.Component;
import java.awt.Dimension;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComponent;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.plaf.ScrollBarUI;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class iIiIiiiiIiIII
extends IiiiIiiiiIiIi {
    private List<iIIIIiiiIiiIi> iiiiIiiiIiiII;
    private JComponent iiiIiiiiiiiIi;
    private long iIiiIiiiiiiII;
    private IIIiiiiiIiIiI IIiiIiiiIIiIi;
    private IIIiiiiiIiIiI iIiIiiiiIiIii;
    private List<IIIiiiiiIiIiI> IiIIIiiiiIiiI;
    private iiIiIiiiiIiii iiIiiiiiiiIii;
    private List<iiIiIiiiIIIiI> IiiiiiiiIIIII;
    private JScrollPane ALLATORIxDEMO;

    public void ALLATORIxDEMO(List<BWDHTeam> list) {
        int IiiiiiiiIIIII = 2;
        int IiiiiiiiIIIII2 = 0;
        int IiiiiiiiIIIII3 = 0;
        int IiiiiiiiIIIII4 = 0;
        int IiiiiiiiIIIII5 = 0;
        int IiiiiiiiIIIII6 = 0;
        int IiiiiiiiIIIII7 = 0;
        while (IiiiiiiiIIIII7 < list.size()) {
            iiIiIiiiIIIiI IiiiiiiiIIIII8;
            BWDHTeam IiiiiiiiIIIII9 = list.get(IiiiiiiiIIIII7);
            if (IiiiiiiiIIIII9.getFlag() != IiiiiiiiIIIII6) {
                IiiiiiiiIIIII5 = 0;
                IiiiiiiiIIIII6 = IiiiiiiiIIIII9.getFlag();
                if (IiiiiiiiIIIII != 2) {
                    IiiiiiiiIIIII8 = this.ALLATORIxDEMO(IiiiiiiiIIIII4);
                    int n = IiiiiiiiIIIII += 53;
                    IiiiiiiiIIIII += 18;
                    IiiiiiiiIIIII8.setBounds(1, n, 542, 2);
                    ++IiiiiiiiIIIII4;
                }
                IiiiiiiiIIIII8 = this.ALLATORIxDEMO(IiiiiiiiIIIII2);
                int n = IiiiiiiiIIIII;
                IiiiiiiiIIIII += 48;
                IiiiiiiiIIIII8.ALLATORIxDEMO(IiiiiiiiIIIII6, n);
                ++IiiiiiiiIIIII2;
            }
            IiiiiiiiIIIII8 = this.ALLATORIxDEMO(IiiiiiiiIIIII3);
            IiiiiiiiIIIII8.setName(String.valueOf(IiiiiiiiIIIII9.getId()));
            IiiiiiiiIIIII8.setText(IiiiiiiiIIIII9.getName());
            if (IiiiiiiiIIIII6 == 8 || IiiiiiiiIIIII6 == 7 || IiiiiiiiIIIII6 == 6 || IiiiiiiiIIIII6 == 5) {
                IiiiiiiiIIIII8.setBounds(215, IiiiiiiiIIIII, 107, 35);
            } else if (IiiiiiiiIIIII5 >= 4) {
                IiiiiiiiIIIII5 = 0;
                IiiiiiiiIIIII8.setBounds(145 * IiiiiiiiIIIII5, IiiiiiiiIIIII += 46, 107, 35);
            } else {
                IiiiiiiiIIIII8.setBounds(145 * IiiiiiiiIIIII5, IiiiiiiiIIIII, 107, 35);
            }
            ++IiiiiiiiIIIII5;
            ++IiiiiiiiIIIII7;
            ++IiiiiiiiIIIII3;
        }
        if (list.size() > 0) {
            IIIiiiiiIiIiI IiiiiiiiIIIII10 = this.ALLATORIxDEMO(IiiiiiiiIIIII4);
            int n = IiiiiiiiIIIII += 53;
            IiiiiiiiIIIII += 2;
            IiiiiiiiIIIII10.setBounds(1, n, 542, 2);
            ++IiiiiiiiIIIII4;
        }
        int IiiiiiiiIIIII11 = IiiiiiiiIIIII2;
        while (IiiiiiiiIIIII11 < this.iiiiIiiiIiiII.size()) {
            iIIIIiiiIiiIi iIIIIiiiIiiIi2 = this.iiiiIiiiIiiII.get(IiiiiiiiIIIII11);
            ++IiiiiiiiIIIII11;
            iIIIIiiiIiiIi2.setVisible(false);
        }
        IiiiiiiiIIIII11 = IiiiiiiiIIIII3;
        while (IiiiiiiiIIIII11 < this.IiiiiiiiIIIII.size()) {
            iiIiIiiiIIIiI iiIiIiiiIIIiI2 = this.IiiiiiiiIIIII.get(IiiiiiiiIIIII11);
            ++IiiiiiiiIIIII11;
            iiIiIiiiIIIiI2.setVisible(false);
        }
        IiiiiiiiIIIII11 = IiiiiiiiIIIII4;
        while (IiiiiiiiIIIII11 < this.IiIIIiiiiIiiI.size()) {
            IIIiiiiiIiIiI iIIiiiiiIiIiI = this.IiIIIiiiiIiiI.get(IiiiiiiiIIIII11);
            ++IiiiiiiiIIIII11;
            iIIiiiiiIiIiI.setVisible(false);
        }
        this.iiiIiiiiiiiIi.setPreferredSize(new Dimension(543, IiiiiiiiIIIII));
        JScrollBar IiiiiiiiIIIII22 = this.ALLATORIxDEMO.getVerticalScrollBar();
        IiiiiiiiIIIII22.setMaximum(this.iiiIiiiiiiiIi.getHeight());
        IiiiiiiiIIIII22.setValue(0);
    }

    public iIiIiiiiIiIII(iiIiIiiiiIiii bwdhView) {
        super(-1, -1, IiiiIiiiiIiIi.iIIiIiiiiiiIi, bwdhView.iiIIiiiiIiIIi);
        this.ALLATORIxDEMO(0, 0, 718, 526, IiiiIiiiiIiIi.iIIiIiiiiiiIi);
        this.iiIiiiiiiiIii = bwdhView;
        this.iiiiIiiiIiiII = new ArrayList<iIIIIiiiIiiIi>();
        this.IiiiiiiiIIIII = new ArrayList<iiIiIiiiIIIiI>();
        this.IiIIIiiiiIiiI = new ArrayList<IIIiiiiiIiIiI>();
        this.iiiIiiiiiiiIi = new IIIiIiiiIiIII(this);
        this.ALLATORIxDEMO = IiIIIiiiiIIiI.ALLATORIxDEMO((int)77, (int)76, (int)566, (int)372, (Component)this.iiiIiiiiiiiIi, (int)20);
        this.ALLATORIxDEMO.getVerticalScrollBar().setUI((ScrollBarUI)new iiiiiiiiiiIiI(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/106.png", (int)3, (int)3, (int)3, (int)3, (boolean)false), 8));
        this.add(this.ALLATORIxDEMO);
        this.IIiiIiiiIIiIi = new IIIiiiiiIiIiI(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/105.png", (int)3, (int)3, (int)3, (int)3, (boolean)false));
        this.IIiiIiiiIIiIi.setBounds(636, 76, 6, 370);
        this.add((Component)this.IIiiIiiiIIiIi);
        this.iIiIiiiiIiIii = new IIIiiiiiIiIiI(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/132.png", (int)50, (int)50, (int)50, (int)50, (boolean)false));
        this.iIiIiiiiIiIii.setBounds(41, 58, 615, 406);
        this.add((Component)this.iIiIiiiiIiIii);
    }

    public IIIiiiiiIiIiI ALLATORIxDEMO(int index) {
        if (index < this.IiIIIiiiiIiiI.size()) {
            return this.IiIIIiiiiIiiI.get(index);
        }
        IIIiiiiiIiIiI IiiiiiiiIIIII = new IIIiiiiiIiIiI(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/66.png", (int)50, (int)1, (int)50, (int)1, (boolean)false));
        this.IiIIIiiiiIiiI.add(IiiiiiiiIIIII);
        this.iiiIiiiiiiiIi.add((Component)IiiiiiiiIIIII);
        return IiiiiiiiIIIII;
    }

    public void iiiIiiiiiiIIi() {
        if (iIiIIiiiIiiiI.iIiIiiiiIIiii() - this.iIiiIiiiiiiII < (long)(iIiIIiiiIiiiI.IIIIiiiiiiiII * 5)) {
            return;
        }
        this.iIiiIiiiiiiII = iIiIIiiiIiiiI.iIiIiiiiIIiii();
        Activity IiiiiiiiIIIII = this.iiIiiiiiiiIii.ALLATORIxDEMO();
        String IiiiiiiiIIIII2 = Agreement.getSendTextAES((String)"activity", (String)(String.valueOf(IiiiiiiiIIIII.getId()) + "|P"));
        this.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII2);
    }

    public void iIiIiiiiIIiii(int teamId) {
        Activity IiiiiiiiIIIII = this.iiIiiiiiiiIii.ALLATORIxDEMO();
        String IiiiiiiiIIIII2 = Agreement.getSendTextAES((String)"activity", (String)(String.valueOf(IiiiiiiiIIIII.getId()) + "|t" + teamId));
        this.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII2);
    }

    public iIIIIiiiIiiIi ALLATORIxDEMO(int index) {
        if (index < this.iiiiIiiiIiiII.size()) {
            return this.iiiiIiiiIiiII.get(index);
        }
        iIIIIiiiIiiIi IiiiiiiiIIIII = new iIIIIiiiIiiIi(this);
        this.iiiiIiiiIiiII.add(IiiiiiiiIIIII);
        this.iiiIiiiiiiiIi.add((Component)IiiiiiiiIIIII);
        return IiiiiiiiIIIII;
    }

    public iiIiIiiiIIIiI ALLATORIxDEMO(int index) {
        if (index < this.IiiiiiiiIIIII.size()) {
            return this.IiiiiiiiIIIII.get(index);
        }
        iiIiIiiiIIIiI IiiiiiiiIIIII = new iiIiIiiiIIIiI("sc/e/163.png", 1, 151, iiIIiiiiIiiII.iIIIiiiiIIIii, iiIIiiiiIiiII.IIiiiiiiIiiII, "", (IiiiIiiiiIiIi)this);
        this.IiiiiiiiIIIII.add(IiiiiiiiIIIII);
        this.iiiIiiiiiiiIi.add((Component)IiiiiiiiIIIII);
        return IiiiiiiiIIIII;
    }
}
