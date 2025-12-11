/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.v.IIIIIiiiIIIiI
 *  com.xy.a.v.BWDHButton1
 *  com.xy.a.v.BWDHJpanel2
 *  com.xy.q.IIIiIiiiiIiII
 *  com.xy.q.IiIIIiiiiIIiI
 *  com.xy.q.iIiIIiiiIiiiI
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.q.iiiIIiiiIIIii
 *  com.xy.scene.BWDHRuleBattleRecord
 *  com.xy.v.iiiiiiiiiiIiI
 *  com.xy.w.IIIIIiiiIiiII
 */
package com.xy.a.v;

import com.xy.a.v.IIIIIiiiIIIiI;
import com.xy.a.v.BWDHButton1;
import com.xy.a.v.BWDHJpanel2;
import com.xy.q.IIIiIiiiiIiII;
import com.xy.q.IiIIIiiiiIIiI;
import com.xy.q.iIiIIiiiIiiiI;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.q.iiiIIiiiIIIii;
import com.xy.scene.BWDHRuleBattleRecord;
import com.xy.v.iiiiiiiiiiIiI;
import com.xy.w.IIIIIiiiIiiII;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.plaf.ScrollBarUI;

/*
 * Exception performing whole class analysis ignored.
 */
static class iiIiIiiiIIIiI
extends iIiIIiiiIiiiI {
    private IIIiIiiiiIiII IIiiIiiiIIiIi;
    private JLabel[] iIiIiiiiIiIii;
    private JScrollPane IiIIIiiiiIiiI;
    private List<BWDHButton1> iiIiiiiiiiIii;
    private JComponent IiiiiiiiIIIII;
    final /* synthetic */ iiIiIiiiiIiIi ALLATORIxDEMO;

    static /* synthetic */ IIIiIiiiiIiII ALLATORIxDEMO(iiIiIiiiIIIiI arg0) {
        return arg0.IIiiIiiiIIiIi;
    }

    public BWDHJpanel8(BWDHJpanel2 iiIiIiiiiIiIi2) {
        this.ALLATORIxDEMO = iiIiIiiiiIiIi2;
        this.IIiiIiiiIIiIi = new IIIiIiiiiIiII(2, 100, iiIiIiiiiIiIi2.ALLATORIxDEMO());
        this.IIiiIiiiIIiIi.iIiIiiiiIIiii(true);
        this.IIiiIiiiIIiIi.ALLATORIxDEMO(550, 71, 100, 19);
        this.IIiiIiiiIIiIi.iiiIiiiiiiIIi(new iiiIIiiiIIIii("16强抢位赛", (Object)0));
        this.IIiiIiiiIIiIi.iiiIiiiiiiIIi(new iiiIIiiiIIIii("8强抢位赛", (Object)1));
        this.IIiiIiiiIIiIi.iiiIiiiiiiIIi(new iiiIIiiiIIIii("4强抢位赛", (Object)2));
        this.IIiiIiiiIIiIi.ALLATORIxDEMO().setText("16强抢位赛");
        this.add((Component)this.IIiiIiiiIIiIi);
        this.iIiIiiiiIiIii = new JLabel[4];
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iIiIiiiiIiIii.length) {
            this.iIiIiiiiIiIii[IiiiiiiiIIIII] = IiIIIiiiiIIiI.ALLATORIxDEMO((int)48, (int)95, (int)145, (int)21, (Color)Color.white, (Font)iiIIiiiiIiiII.iiiiIiiiIiiII);
            this.iIiIiiiiIiIii[IiiiiiiiIIIII].setText(IiiiiiiiIIIII == 0 ? "比赛" : (IiiiiiiiIIIII == 1 ? "对阵" : (IiiiiiiiIIIII == 2 ? "队伍" : (IiiiiiiiIIIII == 3 ? "观看" : ""))));
            this.iIiIiiiiIiIii[IiiiiiiiIIIII].setHorizontalAlignment(0);
            if (IiiiiiiiIIIII == 1) {
                this.iIiIiiiiIiIii[IiiiiiiiIIIII].setBounds(193, 95, 245, 21);
            } else if (IiiiiiiiIIIII == 2) {
                this.iIiIiiiiIiIii[IiiiiiiiIIIII].setBounds(467, 95, 61, 21);
            } else if (IiiiiiiiIIIII == 3) {
                this.iIiIiiiiIiIii[IiiiiiiiIIIII].setBounds(555, 95, 61, 21);
            }
            this.add(this.iIiIiiiiIiIii[IiiiiiiiIIIII++]);
        }
        this.IiiiiiiiIIIII = new IIIIIiiiIIIiI(this);
        this.IiIIIiiiiIiiI = IiIIIiiiiIIiI.ALLATORIxDEMO((int)50, (int)118, (int)593, (int)336, (Component)this.IiiiiiiiIIIII, (int)20);
        this.IiIIIiiiiIiiI.getVerticalScrollBar().setUI((ScrollBarUI)new iiiiiiiiiiIiI(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/106.png", (int)3, (int)3, (int)3, (int)3, (boolean)false), 8));
        this.add(this.IiIIIiiiiIiiI);
        this.iiIiiiiiiiIii = new ArrayList<BWDHButton1>();
    }

    public void ALLATORIxDEMO(BWDHRuleBattleRecord[] records) {
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < records.length) {
            BWDHButton1 IiiiiiiiIIIII2;
            BWDHButton1 iIiIIiiiIIIiI = IiiiiiiiIIIII2 = IiiiiiiiIIIII < this.iiIiiiiiiiIii.size() ? this.iiIiiiiiiiIii.get(IiiiiiiiIIIII) : null;
            if (IiiiiiiiIIIII2 == null) {
                IiiiiiiiIIIII2 = new BWDHButton1(this.ALLATORIxDEMO);
                this.iiIiiiiiiiIii.add(IiiiiiiiIIIII2);
                this.IiiiiiiiIIIII.add((Component)IiiiiiiiIIIII2);
            }
            IiiiiiiiIIIII2.ALLATORIxDEMO(records[IiiiiiiiIIIII]);
            int n = 42 * IiiiiiiiIIIII;
            ++IiiiiiiiIIIII;
            IiiiiiiiIIIII2.setBounds(0, n, 580, 42);
            IiiiiiiiIIIII2.setVisible(true);
        }
        IiiiiiiiIIIII = records.length;
        while (IiiiiiiiIIIII < this.iiIiiiiiiiIii.size()) {
            BWDHButton1 iIiIIiiiIIIiI = this.iiIiiiiiiiIii.get(IiiiiiiiIIIII);
            ++IiiiiiiiIIIII;
            iIiIIiiiIIIiI.setVisible(false);
        }
        this.IiiiiiiiIIIII.setPreferredSize(new Dimension(580, 42 * records.length));
        JScrollBar IiiiiiiiIIIII2 = this.IiIIIiiiiIiiI.getVerticalScrollBar();
        IiiiiiiiIIIII2.setMaximum(this.IiiiiiiiIIIII.getHeight());
        IiiiiiiiIIIII2.setValue(0);
    }
}
