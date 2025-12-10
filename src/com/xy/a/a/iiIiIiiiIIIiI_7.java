/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.a.IIIIIiiiIIIiI
 *  com.xy.a.a.IIiiIiiiIiiiI
 *  com.xy.a.a.iiIiIiiiiIiIi
 *  com.xy.entity.Pal
 *  com.xy.game.RoleData
 *  com.xy.i.IiIiIiiiiIIiI
 *  com.xy.q.IiIIIiiiiIIiI
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.readbean.PalData
 *  com.xy.readbean.Skill
 *  com.xy.richtext.RichLabel
 *  com.xy.v.IiiiIiiiiIIII
 *  com.xy.w.IIIIIiiiIiiII
 *  com.xy.w.IIIiiiiiIiIiI
 */
package com.xy.a.a;

import com.xy.a.a.IIIIIiiiIIIiI;
import com.xy.a.a.IIiiIiiiIiiiI;
import com.xy.a.a.iiIiIiiiiIiIi;
import com.xy.entity.Pal;
import com.xy.game.RoleData;
import com.xy.i.IiIiIiiiiIIiI;
import com.xy.q.IiIIIiiiiIIiI;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.readbean.PalData;
import com.xy.readbean.Skill;
import com.xy.richtext.RichLabel;
import com.xy.v.IiiiIiiiiIIII;
import com.xy.w.IIIIIiiiIiiII;
import com.xy.w.IIIiiiiiIiIiI;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.DefaultListModel;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.event.ListSelectionListener;

/*
 * Exception performing whole class analysis ignored.
 */
public static class iiIiIiiiIIIiI
extends JComponent {
    final /* synthetic */ iiIiIiiiiIiIi iiiIiiiiiiiIi;
    private IiIiIiiiiIIiI[] iIiiIiiiiiiII = new IiIiIiiiiIIiI[2];
    private IIIiiiiiIiIiI[] IIiiIiiiIIiIi;
    private DefaultListModel<String> iIiIiiiiIiIii;
    private JList<String> IiIIIiiiiIiiI;
    private JScrollPane iiIiiiiiiiIii;
    private JLabel[] IiiiiiiiIIIII;
    private RichLabel ALLATORIxDEMO;

    static /* synthetic */ iiIiIiiiiIiIi ALLATORIxDEMO(iiIiIiiiIIIiI arg0) {
        return arg0.iiiIiiiiiiiIi;
    }

    static /* synthetic */ JList ALLATORIxDEMO(iiIiIiiiIIIiI arg0) {
        return arg0.IiIIIiiiiIiiI;
    }

    public iiIiIiiiIIIiI(iiIiIiiiiIiIi iiIiIiiiiIiIi2) {
        this.iiiIiiiiiiiIi = iiIiIiiiiIiIi2;
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iIiiIiiiiiiII.length) {
            this.iIiiIiiiiiiII[IiiiiiiiIIIII] = new IiIiIiiiiIIiI("sc/e/26.png", 1, 129 + IiiiiiiiIIIII, iiIIiiiiIiiII.iiiiIiiiIiiII, iiIIiiiiIiiII.IIiiiiiiIiiII, IiiiiiiiIIIII == 0 ? "\u5220\u9664\u6280\u80fd" : (IiiiiiiiIIIII == 1 ? "\u4f7f\u7528\u7269\u54c1" : ""), iiIiIiiiiIiIi2.ALLATORIxDEMO());
            this.iIiiIiiiiiiII[IiiiiiiiIIIII].setBounds(205 + IiiiiiiiIIIII * 105, 325, 99, 25);
            this.add((Component)this.iIiiIiiiiiiII[IiiiiiiiIIIII++]);
        }
        this.IiiiiiiiIIIII = new JLabel[2];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IiiiiiiiIIIII.length) {
            this.IiiiiiiiIIIII[IiiiiiiiIIIII] = IiIIIiiiiIIiI.ALLATORIxDEMO((int)413, (int)70, (int)127, (int)21, (int)0, (Color)Color.white, (Font)iiIIiiiiIiiII.iiiiIiiiIiiII);
            this.IiiiiiiiIIIII[IiiiiiiiIIIII].setText(IiiiiiiiIIIII == 0 ? "\u6280\u80fd\u540d\u79f0" : (IiiiiiiiIIIII == 1 ? "\u6280\u80fd\u4ecb\u7ecd" : ""));
            if (IiiiiiiiIIIII == 1) {
                this.IiiiiiiiIIIII[IiiiiiiiIIIII].setBounds(413, 171, 127, 21);
            }
            this.add(this.IiiiiiiiIIIII[IiiiiiiiIIIII++]);
        }
        this.ALLATORIxDEMO = new RichLabel();
        this.add((Component)this.ALLATORIxDEMO);
        this.iIiIiiiiIiIii = new DefaultListModel();
        this.IiIIIiiiiIiiI = new JList();
        this.IiIIIiiiiIiiI.setOpaque(false);
        this.IiIIIiiiiIiiI.setSelectionBackground(new Color(33, 42, 52));
        this.IiIIIiiiiIiiI.setSelectionForeground(Color.YELLOW);
        this.IiIIIiiiiIiiI.setForeground(Color.YELLOW);
        this.IiIIIiiiiIiiI.setFont(iiIIiiiiIiiII.iIiiIiiiiiiii);
        this.IiIIIiiiiIiiI.setBackground(iiIIiiiiIiiII.IIiIiiiiIIiII);
        this.IiIIIiiiiIiiI.setModel(this.iIiIiiiiIiIii);
        this.IiIIIiiiiIiiI.setSelectionMode(0);
        this.IiIIIiiiiIiiI.addListSelectionListener((ListSelectionListener)new IIIIIiiiIIIiI(this));
        this.IiIIIiiiiIiiI.setBounds(415, 90, 113, 78);
        this.add(this.IiIIIiiiiIiiI);
        this.iiIiiiiiiiIii = IiIIIiiiiIIiI.ALLATORIxDEMO((int)416, (int)192, (int)128, (int)165, (Component)this.ALLATORIxDEMO, (int)30);
        this.add(this.iiIiiiiiiiIii);
        this.IIiiIiiiIIiIi = new IIIiiiiiIiIiI[5];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IIiiIiiiIIiIi.length) {
            this.IIiiIiiiIIiIi[IiiiiiiiIIIII] = new IIIiiiiiIiIiI();
            if (IiiiiiiiIIIII == 0) {
                this.IIiiIiiiIIiIi[IiiiiiiiIIIII].iIiIiiiiIIiii("sc/d/79.png");
                this.IIiiIiiiIIiIi[IiiiiiiiIIIII].setBounds(205, 70, 204, 243);
            } else if (IiiiiiiiIIIII == 1) {
                this.IIiiIiiiIIiIi[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/25.png", (int)2, (int)2, (int)2, (int)2, (boolean)false));
                this.IIiiIiiiIIiIi[IiiiiiiiIIIII].setBounds(413, 70, 127, 21);
            } else if (IiiiiiiiIIIII == 2) {
                this.IIiiIiiiIIiIi[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/25.png", (int)2, (int)2, (int)2, (int)2, (boolean)false));
                this.IIiiIiiiIIiIi[IiiiiiiiIIIII].setBounds(413, 171, 127, 21);
            } else if (IiiiiiiiIIIII == 3) {
                this.IIiiIiiiIIiIi[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/24.png", (int)2, (int)2, (int)2, (int)2, (boolean)false));
                this.IIiiIiiiIIiIi[IiiiiiiiIIIII].setBounds(413, 70, 127, 101);
            } else if (IiiiiiiiIIIII == 4) {
                this.IIiiIiiiIIiIi[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/24.png", (int)2, (int)2, (int)2, (int)2, (boolean)false));
                this.IIiiIiiiIIiIi[IiiiiiiiIIIII].setBounds(413, 171, 127, 187);
            }
            this.add((Component)this.IIiiIiiiIIiIi[IiiiiiiiIIIII++]);
        }
    }

    public void ALLATORIxDEMO(Skill skill, boolean is) {
        this.ALLATORIxDEMO.setText(null);
        if (skill == null) {
            return;
        }
        RoleData IiiiiiiiIIIII = this.iiiIiiiiiiiIi.ALLATORIxDEMO();
        int IiiiiiiiIIIII2 = IiiiIiiiiIIII.ALLATORIxDEMO((int)IiiiiiiiIIIII.getLoginResult().getGrade());
        int IiiiiiiiIIIII3 = IiiiIiiiiIIII.iIiIiiiiIIiii((int)IiiiiiiiIIIII.getLoginResult().getGrade());
        double IiiiiiiiIIIII4 = IiiiiiiiIIIII2 * 150;
        String IiiiiiiiIIIII5 = IIiiIiiiIiiiI.ALLATORIxDEMO((int)Integer.parseInt(skill.getSkillid()), (Skill)skill, (double)IiiiiiiiIIIII4, (int)IiiiiiiiIIIII2, (int)IiiiiiiiIIIII3);
        if (IiiiiiiiIIIII5 != null) {
            this.ALLATORIxDEMO.addText(IiiiiiiiIIIII5);
        }
        Dimension IiiiiiiiIIIII6 = this.ALLATORIxDEMO.computeSize(110);
        this.ALLATORIxDEMO.setSize(IiiiiiiiIIIII6);
        this.ALLATORIxDEMO.setPreferredSize(IiiiiiiiIIIII6);
    }

    /*
     * WARNING - void declaration
     */
    public void ALLATORIxDEMO(Pal pal, PalData palData) {
        void palData2;
        this.iIiIiiiiIiIii.removeAllElements();
        this.ALLATORIxDEMO(null, false);
        if (palData2.getSkill() == null) return;
        if (palData2.getSkill().equals("")) {
            return;
        }
        String[] IiiiiiiiIIIII = palData2.getSkill().split("\\|");
        int IiiiiiiiIIIII2 = 0;
        while (IiiiiiiiIIIII2 < IiiiiiiiIIIII.length) {
            Skill IiiiiiiiIIIII3 = this.iiiIiiiiiiiIi.ALLATORIxDEMO().iIiIiiiiIIiii(IiiiiiiiIIIII[IiiiiiiiIIIII2]);
            if (IiiiiiiiIIIII3 != null) {
                this.iIiIiiiiIiIii.addElement(IiiiiiiiIIIII3.getSkillname());
            }
            ++IiiiiiiiIIIII2;
        }
    }
}
