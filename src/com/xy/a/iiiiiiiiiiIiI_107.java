/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.IIiiIiiiiIIiI
 *  com.xy.entity.TeamRole
 *  com.xy.formula.SkillUtil
 *  com.xy.i.iiIIiiiiIiiII
 *  com.xy.q.IiIIIiiiiIIiI
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.socket.Agreement
 *  com.xy.text.GameView
 *  com.xy.v.IiiiIiiiiIIII
 *  com.xy.v.iiiiiiiiIIIII
 *  com.xy.w.IIIIIiiiIiiII
 *  com.xy.w.IIIiiiiiIiIiI
 */
package com.xy.a;

import com.xy.a.IIiiIiiiiIIiI;
import com.xy.entity.TeamRole;
import com.xy.formula.SkillUtil;
import com.xy.i.iiIIiiiiIiiII;
import com.xy.q.IiIIIiiiiIIiI;
import com.xy.q.IiiiIiiiiIiIi;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import com.xy.v.IiiiIiiiiIIII;
import com.xy.v.iiiiiiiiIIIII;
import com.xy.w.IIIIIiiiIiiII;
import com.xy.w.IIIiiiiiIiIiI;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.math.BigDecimal;
import java.util.List;
import java.util.Vector;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.event.ListSelectionListener;

public class iiiiiiiiiiIiI
extends IiiiIiiiiIiIi {
    private JScrollPane iiiIiiiiiiiIi;
    private IIIiiiiiIiIiI iIiiIiiiiiiII;
    private iiIIiiiiIiiII IIiiIiiiIIiIi;
    private IIIiiiiiIiIiI iIiIiiiiIiIii;
    private iiIIiiiiIiiII IiIIIiiiiIiiI;
    private iiIIiiiiIiiII iiIiiiiiiiIii;
    private JTable IiiiiiiiIIIII;
    private Vector<Vector<Object>> ALLATORIxDEMO;

    public void iIiIiiiiIIiii(int id) {
        if (id == 13) {
            int IiiiiiiiIIIII = this.IiiiiiiiIIIII.getSelectedRow();
            if (IiiiiiiiIIIII == -1) {
                return;
            }
            TeamRole IiiiiiiiIIIII2 = (TeamRole)this.ALLATORIxDEMO.get(IiiiiiiiIIIII).get(3);
            this.ALLATORIxDEMO.remove(IiiiiiiiIIIII);
            String IiiiiiiiIIIII3 = Agreement.getSendTextAES((String)"team5", (String)("A" + IiiiiiiiIIIII2.getRoleId()));
            this.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII3);
            return;
        }
        if (id != 14) {
            if (id != 15) return;
            this.ALLATORIxDEMO.clear();
            String IiiiiiiiIIIII = Agreement.getSendTextAES((String)"team5", (String)"E");
            this.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII);
            return;
        }
        int IiiiiiiiIIIII = this.IiiiiiiiIIIII.getSelectedRow();
        if (IiiiiiiiIIIII == -1) {
            return;
        }
        TeamRole IiiiiiiiIIIII4 = (TeamRole)this.ALLATORIxDEMO.get(IiiiiiiiIIIII).get(3);
        this.ALLATORIxDEMO.remove(IiiiiiiiIIIII);
        String IiiiiiiiIIIII5 = Agreement.getSendTextAES((String)"team5", (String)("R" + IiiiiiiiIIIII4.getRoleId()));
        this.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII5);
    }

    public void ALLATORIxDEMO(List<TeamRole> t) {
        this.ALLATORIxDEMO.clear();
        int IiiiiiiiIIIII = 0;
        int IiiiiiiiIIIII2 = t != null ? t.size() : 0;
        while (IiiiiiiiIIIII < IiiiiiiiIIIII2) {
            this.ALLATORIxDEMO(t.get(IiiiiiiiIIIII++));
        }
        if (this.IiiiiiiiIIIII.getRowCount() > 0) {
            this.IiiiiiiiIIIII.setRowSelectionInterval(0, 0);
        }
        this.iiiIiiiiiiiIi.getVerticalScrollBar().setValue(0);
        this.ALLATORIxDEMO().iIiIiiiiIIiIi(this.iIiIiiiiIIiii());
    }

    public iiiiiiiiiiIiI(GameView gameView) {
        super(30, 2, IiiiIiiiiIiIi.iIIIIiiiiiIIi, gameView);
        this.ALLATORIxDEMO(-1, 0, 367, 315, IiiiIiiiiIiIi.iiIIIiiiiiiiI);
        this.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/1.png", (int)68, (int)68, (int)68, (int)68, (boolean)false), "\u7533\u8bf7\u52a0\u5165");
        this.ALLATORIxDEMO(new iiiiiiiiIIIII(14, 0, 0, 50));
        this.IIiiIiiiIIiIi = new iiIIiiiiIiiII("sc/e/7.png", 1, 13, com.xy.q.iiIIiiiiIiiII.iiiiIiiiIiiII, com.xy.q.iiIIiiiiIiiII.IIiiiiiiIiiII, "\u5141\u8bb8", (IiiiIiiiiIiIi)this);
        this.IiIIIiiiiIiiI = new iiIIiiiiIiiII("sc/e/7.png", 1, 14, com.xy.q.iiIIiiiiIiiII.iiiiIiiiIiiII, com.xy.q.iiIIiiiiIiiII.IIiiiiiiIiiII, "\u62d2\u7edd", (IiiiIiiiiIiIi)this);
        this.iiIiiiiiiiIii = new iiIIiiiiIiiII("sc/e/7.png", 1, 15, com.xy.q.iiIIiiiiIiiII.iiiiIiiiIiiII, com.xy.q.iiIIiiiiIiiII.IIiiiiiiIiiII, "\u6e05\u7a7a", (IiiiIiiiiIiIi)this);
        this.IIiiIiiiIIiIi.setBounds(50, 225, 59, 26);
        this.IiIIIiiiiIiiI.setBounds(150, 225, 59, 26);
        this.iiIiiiiiiiIii.setBounds(250, 225, 59, 26);
        this.add((Component)this.IIiiIiiiIIiIi);
        this.add((Component)this.IiIIIiiiiIiiI);
        this.add((Component)this.iiIiiiiiiiIii);
        Vector<String> IiiiiiiiIIIII = new Vector<String>();
        IiiiiiiiIIIII.addElement("\u540d\u79f0");
        IiiiiiiiIIIII.addElement("\u7b49\u7ea7");
        IiiiiiiiIIIII.addElement("\u79cd\u65cf");
        this.ALLATORIxDEMO = new Vector();
        this.IiiiiiiiIIIII = IiIIIiiiiIIiI.ALLATORIxDEMO(this.ALLATORIxDEMO, IiiiiiiiIIIII, (Font)com.xy.q.iiIIiiiiIiiII.iIiIIiiiiIIiI, (Color)Color.white, (int[])new int[]{120, 120, 90});
        this.IiiiiiiiIIIII.getSelectionModel().addListSelectionListener((ListSelectionListener)new IIiiIiiiiIIiI(this));
        this.iiiIiiiiiiiIi = IiIIIiiiiIIiI.ALLATORIxDEMO((int)49, (int)30, (int)292, (int)190, (Component)this.IiiiiiiiIIIII, (int)20);
        this.add(this.iiiIiiiiiiiIi);
        this.iIiIiiiiIiIii = new IIIiiiiiIiIiI(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/25.png", (int)2, (int)2, (int)2, (int)2, (boolean)false));
        this.iIiIiiiiIiIii.setBounds(49, 30, 292, 21);
        this.add((Component)this.iIiIiiiiIiIii);
        this.iIiiIiiiiiiII = new IIIiiiiiIiIiI(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/24.png", (int)2, (int)2, (int)2, (int)2, (boolean)false));
        this.iIiiIiiiiiiII.setBounds(49, 30, 292, 191);
        this.add((Component)this.iIiiIiiiiiiII);
    }

    static /* synthetic */ JTable ALLATORIxDEMO(iiiiiiiiiiIiI arg0) {
        return arg0.IiiiiiiiIIIII;
    }

    public void ALLATORIxDEMO(TeamRole teamRole) {
        Vector<String> IiiiiiiiIIIII = new Vector<String>();
        IiiiiiiiIIIII.add(teamRole.getName());
        IiiiiiiiIIIII.add(IiiiIiiiiIIII.iIiIiiiiIIiii((int)teamRole.getGrade()));
        IiiiiiiiIIIII.add(SkillUtil.getSepciesN((BigDecimal)teamRole.getSpeciesId()));
        IiiiiiiiIIIII.add((String)teamRole);
        this.ALLATORIxDEMO.addElement(IiiiiiiiIIIII);
    }
}
