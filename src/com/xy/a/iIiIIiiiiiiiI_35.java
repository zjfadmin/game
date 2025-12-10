/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.iiiiIiiiiIiii
 *  com.xy.entity.Gang
 *  com.xy.i.IIIIIiiiIIIiI
 *  com.xy.q.IiIIIiiiiIIiI
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.richtext.RichLabel
 *  com.xy.socket.Agreement
 *  com.xy.text.GameView
 *  com.xy.w.IIIIIiiiIiiII
 *  com.xy.w.IIIiiiiiIiIiI
 */
package com.xy.a;

import com.xy.a.iiiiIiiiiIiii;
import com.xy.entity.Gang;
import com.xy.i.IIIIIiiiIIIiI;
import com.xy.q.IiIIIiiiiIIiI;
import com.xy.q.IiiiIiiiiIiIi;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.richtext.RichLabel;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import com.xy.w.IIIIIiiiIiiII;
import com.xy.w.IIIiiiiiIiIiI;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.math.BigDecimal;
import java.util.List;
import java.util.Vector;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.event.ListSelectionListener;

public class iIiIIiiiiiiiI
extends IiiiIiiiiIiIi {
    private JTable iIiiIiiiiiiII;
    private JLabel IIiiIiiiIIiIi;
    private IIIiiiiiIiIiI[] iIiIiiiiIiIii;
    private IIIIIiiiIIIiI IiIIIiiiiIiiI;
    private Vector<Vector<Object>> iiIiiiiiiiIii;
    private JScrollPane IiiiiiiiIIIII;
    private RichLabel ALLATORIxDEMO;

    static /* synthetic */ JTable ALLATORIxDEMO(iIiIIiiiiiiiI arg0) {
        return arg0.iIiiIiiiiiiII;
    }

    public void ALLATORIxDEMO(Vector<Object> vector) {
        Gang IiiiiiiiIIIII = (Gang)vector.get(4);
        this.ALLATORIxDEMO.setTextSize(IiiiiiiiIIIII.getIntroduction(), 300);
        this.ALLATORIxDEMO.setBounds(50, 320, this.ALLATORIxDEMO.getWidth(), this.ALLATORIxDEMO.getHeight());
    }

    static /* synthetic */ Vector ALLATORIxDEMO(iIiIIiiiiiiiI arg0) {
        return arg0.iiIiiiiiiiIii;
    }

    public iIiIIiiiiiiiI(GameView gameView) {
        super(28, 2, IiiiIiiiiIiIi.iIIIIiiiiiIIi, gameView);
        this.ALLATORIxDEMO(-1, 0, 404, 501, IiiiIiiiiIiIi.iiIIIiiiiiiiI);
        this.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/1.png", (int)68, (int)68, (int)68, (int)68, (boolean)false), "\u52a0\u5165\u5e2e\u6d3e");
        this.IiIIIiiiiIiiI = new IIIIIiiiIIIiI("sc/e/26.png", 1, 146, iiIIiiiiIiiII.iiiiIiiiIiiII, iiIIiiiiIiiII.IIiiiiiiIiiII, "\u7533\u8bf7\u52a0\u5165", (IiiiIiiiiIiIi)this);
        this.IiIIIiiiiIiiI.setBounds(161, 455, 99, 25);
        this.add((Component)this.IiIIIiiiiIiiI);
        this.IIiiIiiiIIiIi = IiIIIiiiiIIiI.ALLATORIxDEMO((int)49, (int)296, (int)322, (int)21, (int)0, (Color)iiIIiiiiIiiII.ALLATORIxDEMO((String)"#cFFFFFF"), (Font)iiIIiiiiIiiII.iiiiIiiiIiiII);
        this.IIiiIiiiIIiIi.setText("\u5e2e\u6d3e\u5b97\u65e8");
        this.add(this.IIiiIiiiIIiIi);
        Vector<String> IiiiiiiiIIIII = new Vector<String>();
        IiiiiiiiIIIII.addElement("\u5e2e\u6d3e\u540d\u79f0");
        IiiiiiiiIIIII.addElement("\u521b\u59cb\u4eba");
        IiiiiiiiIIIII.addElement("\u5e2e\u6d3e\u7b49\u7ea7");
        IiiiiiiiIIIII.addElement("\u4eba\u6570");
        this.iiIiiiiiiiIii = new Vector();
        this.iIiiIiiiiiiII = IiIIIiiiiIIiI.ALLATORIxDEMO(this.iiIiiiiiiiIii, IiiiiiiiIIIII, (Font)iiIIiiiiIiiII.iIiIIiiiiIIiI, (Color)Color.white, (int[])new int[]{85, 110, 75, 55});
        this.iIiiIiiiiiiII.getSelectionModel().addListSelectionListener((ListSelectionListener)new iiiiIiiiiIiii(this));
        this.IiiiiiiiIIIII = IiIIIiiiiIIiI.ALLATORIxDEMO((int)50, (int)31, (int)320, (int)250, (Component)this.iIiiIiiiiiiII, (int)20);
        this.add(this.IiiiiiiiIIIII);
        this.ALLATORIxDEMO = new RichLabel(null, iiIIiiiiIiiII.iIiIIiiiiIIiI);
        this.add((Component)this.ALLATORIxDEMO);
        this.iIiIiiiiIiIii = new IIIiiiiiIiIiI[4];
        int IiiiiiiiIIIII2 = 0;
        while (IiiiiiiiIIIII2 < this.iIiIiiiiIiIii.length) {
            this.iIiIiiiiIiIii[IiiiiiiiIIIII2] = new IIIiiiiiIiIiI();
            if (IiiiiiiiIIIII2 >= 0 && IiiiiiiiIIIII2 <= 1) {
                this.iIiIiiiiIiIii[IiiiiiiiIIIII2].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/25.png", (int)2, (int)2, (int)2, (int)2, (boolean)false));
                this.iIiIiiiiIiIii[IiiiiiiiIIIII2].setBounds(49, 31 + IiiiiiiiIIIII2 * 265, 322, 21);
            } else if (IiiiiiiiIIIII2 == 2) {
                this.iIiIiiiiIiIii[IiiiiiiiIIIII2].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/24.png", (int)2, (int)2, (int)2, (int)2, (boolean)false));
                this.iIiIiiiiIiIii[IiiiiiiiIIIII2].setBounds(49, 31, 322, 250);
            } else if (IiiiiiiiIIIII2 == 3) {
                this.iIiIiiiiIiIii[IiiiiiiiIIIII2].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/24.png", (int)2, (int)2, (int)2, (int)2, (boolean)false));
                this.iIiIiiiiIiIii[IiiiiiiiIIIII2].setBounds(49, 296, 322, 150);
            }
            this.add((Component)this.iIiIiiiiIiIii[IiiiiiiiIIIII2++]);
        }
    }

    public void iiiIiiiiiiIIi() {
        BigDecimal IiiiiiiiIIIII = this.iiIIiiiiIiIIi.roleUnit.iIiIiiiiIiIii.getGang_id();
        if (IiiiiiiiIIIII != null && IiiiiiiiIIIII.intValue() != 0) {
            this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u4f60\u5df2\u6709\u5e2e\u6d3e");
            return;
        }
        int IiiiiiiiIIIII2 = this.iIiiIiiiiiiII.getSelectedRow();
        if (IiiiiiiiIIIII2 == -1) {
            this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u4f60\u672a\u9009\u4e2d\u8981\u52a0\u5165\u7684\u5e2e\u6d3e");
            return;
        }
        Gang IiiiiiiiIIIII3 = (Gang)this.iiIiiiiiiiIii.get(IiiiiiiiIIIII2).get(4);
        String IiiiiiiiIIIII4 = Agreement.getSendTextAES((String)"gangapply", (String)IiiiiiiiIIIII3.getGangid().toString());
        this.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII4);
    }

    public void ALLATORIxDEMO(List<Gang> gangs) {
        this.iiIiiiiiiiIii.clear();
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < gangs.size()) {
            Gang IiiiiiiiIIIII2 = gangs.get(IiiiiiiiIIIII);
            Vector<String> IiiiiiiiIIIII3 = new Vector<String>();
            IiiiiiiiIIIII3.add(IiiiiiiiIIIII2.getGangname());
            IiiiiiiiIIIII3.add(IiiiiiiiIIIII2.getFounder());
            IiiiiiiiIIIII3.add("" + IiiiiiiiIIIII2.getGanggrade());
            IiiiiiiiIIIII3.add("" + IiiiiiiiIIIII2.getGangnumber());
            IiiiiiiiIIIII3.add((String)IiiiiiiiIIIII2);
            ++IiiiiiiiIIIII;
            this.iiIiiiiiiiIii.addElement(IiiiiiiiIIIII3);
        }
        if (this.iIiiIiiiiiiII.getRowCount() > 0) {
            this.iIiiIiiiiiiII.setRowSelectionInterval(0, 0);
        }
        this.IiiiiiiiIIIII.getVerticalScrollBar().setValue(0);
        this.ALLATORIxDEMO().iIiIiiiiIIiIi(this.iIiIiiiiIIiii());
    }
}
