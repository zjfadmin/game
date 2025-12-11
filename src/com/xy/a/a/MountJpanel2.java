/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.a.iiiiiiiiIIIII
 *  com.xy.entity.Mount
 *  com.xy.entity.MountSkill
 *  com.xy.formula.BaseMountSkill
 *  com.xy.formula.PropertyUtil
 *  com.xy.q.IiIIIiiiiIIiI
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.q.iIIiIiiiIiiIi
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.richtext.RichLabel
 *  com.xy.text.GameView
 *  com.xy.v.IIiiIiiiiIIiI
 *  com.xy.w.IIIIIiiiIiiII
 *  com.xy.w.IIIiiiiiIiIiI
 */
package com.xy.a.a;

import com.xy.a.a.iiiiiiiiIIIII;
import com.xy.entity.Mount;
import com.xy.entity.MountSkill;
import com.xy.formula.BaseMountSkill;
import com.xy.formula.PropertyUtil;
import com.xy.q.IiIIIiiiiIIiI;
import com.xy.q.IiiiIiiiiIiIi;
import com.xy.q.iIIiIiiiIiiIi;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.richtext.RichLabel;
import com.xy.text.GameView;
import com.xy.v.IIiiIiiiiIIiI;
import com.xy.w.IIIIIiiiIiiII;
import com.xy.w.IIIiiiiiIiIiI;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.event.ListSelectionListener;

public class MountJpanel2
extends IiiiIiiiiIiIi {
    private JList<String> IIiiIiiiIIiIi;
    private RichLabel iIiIiiiiIiIii;
    private DefaultListModel<String> IiIIIiiiiIiiI;
    private IIIiiiiiIiIiI[] iiIiiiiiiiIii;
    private JLabel[] IiiiiiiiIIIII;
    private iIIiIiiiIiiIi ALLATORIxDEMO;

    /*
     * Unable to fully structure code
     */
    public void ALLATORIxDEMO(Mount mount) {
        block6: {
            block5: {
                this.IiIIIiiiiIiiI.removeAllElements();
                this.ALLATORIxDEMO.setText(mount != null ? mount.getProficiency().toString() : null);
                if (!this.ALLATORIxDEMO().gameMount) break block5;
                IiiiiiiiIIIII = null;
                IiiiiiiiIIIII = mount.getDataValue("JN");
                if (IIiiIiiiiIIiI.iIiIiiiiIIiIi((String)IiiiiiiiIIIII)) break block6;
                IiiiiiiiIIIII = 0;
                IiiiiiiiIIIII = 0;
                if (true) ** GOTO lbl24
            }
            if (mount == null || mount.getMountskill() == null || mount.getMountskill().size() == 0) {
                this.ALLATORIxDEMO(mount, null);
                return;
            }
            IiiiiiiiIIIII = 0;
            if (true) ** GOTO lbl32
            do {
                if ((IiiiiiiiIIIII = IiiiiiiiIIIII.indexOf("#", IiiiiiiiIIIII + 1)) == -1) {
                    IiiiiiiiIIIII = IiiiiiiiIIIII.length();
                }
                var6_8 = IiiiiiiiIIIII.substring(IiiiiiiiIIIII, IiiiiiiiIIIII);
                this.IiIIIiiiiIiiI.addElement((String)IiiiiiiiIIIII);
                if (IIiiIiiiiIIiI.iIiIiiiiIIiIi(IiiiiiiiIIIII)) {
                    IiiiiiiiIIIII = IiiiiiiiIIIII;
                }
                IiiiiiiiIIIII = IiiiiiiiIIIII + 1;
lbl24:
                // 2 sources

            } while (IiiiiiiiIIIII < IiiiiiiiIIIII.length());
        }
        this.ALLATORIxDEMO(mount, IiiiiiiiIIIII);
        return;
        do {
            IiiiiiiiIIIII = (MountSkill)mount.getMountskill().get(IiiiiiiiIIIII);
            ++IiiiiiiiIIIII;
            this.IiIIIiiiiIiiI.addElement(IiiiiiiiIIIII.getSkillname());
lbl32:
            // 2 sources

        } while (IiiiiiiiIIIII < mount.getMountskill().size());
        if (mount.getMountskill().size() == 0) return;
        this.ALLATORIxDEMO(mount, ((MountSkill)mount.getMountskill().get(0)).getSkillname());
    }

    static /* synthetic */ JList ALLATORIxDEMO(MountJpanel2 arg0) {
        return arg0.IIiiIiiiIIiIi;
    }

    public void iIiIiiiiIIiii() {
        Mount IiiiiiiiIIIII = this.ALLATORIxDEMO().getChoseMount();
        if (IiiiiiiiIIIII == null) {
            return;
        }
        this.ALLATORIxDEMO(IiiiiiiiIIIII);
        super.iIiIiiiiIIiii();
    }

    /*
     * WARNING - void declaration
     */
    public void ALLATORIxDEMO(Mount mount, String skillName) {
        if (mount == null || IIiiIiiiiIIiI.iIiIiiiiIIiIi((String)skillName)) {
            this.iIiIiiiiIiIii.setTextSize(null, 235);
            return;
        }
        if (this.ALLATORIxDEMO().gameMount) {
            BaseMountSkill IiiiiiiiIIIII = PropertyUtil.getBaseMountSkill((String)skillName);
            if (IiiiiiiiIIIII == null) {
                this.iIiIiiiiIiIii.setTextSize(null, 235);
                return;
            }
            this.iIiIiiiiIiIii.setTextSize(IiiiiiiiIIIII.getText(mount), 235);
            return;
        }
        String[] IiiiiiiiIIIII = PropertyUtil.ALLATORIxDEMO((Mount)mount, (String)skillName).split("\\|");
        StringBuffer IiiiiiiiIIIII2 = new StringBuffer();
        int IiiiiiiiIIIII3 = 0;
        while (IiiiiiiiIIIII3 < IiiiiiiiIIIII.length) {
            int IiiiiiiiIIIII4;
            if (IiiiiiiiIIIII2.length() != 0) {
                IiiiiiiiIIIII2.append("#r");
            }
            if ((IiiiiiiiIIIII4 = IiiiiiiiIIIII[IiiiiiiiIIIII3].indexOf("=")) != -1) {
                void IiiiiiiiIIIII5;
                String IiiiiiiiIIIII6 = IiiiiiiiIIIII[IiiiiiiiIIIII3].substring(0, IiiiiiiiIIIII4);
                String string = IiiiiiiiIIIII[IiiiiiiiIIIII3].substring(IiiiiiiiIIIII4 + 1);
                IiiiiiiiIIIII2.append(IiiiiiiiIIIII6);
                IiiiiiiiIIIII2.append(" +");
                if (IiiiiiiiIIIII6.equals("\u6297\u4e09\u5c38\u866b")) {
                    IiiiiiiiIIIII2.append(Integer.parseInt((String)IiiiiiiiIIIII5));
                } else {
                    IiiiiiiiIIIII2.append((int)(Float.parseFloat((String)IiiiiiiiIIIII5) * 100.0f));
                    IiiiiiiiIIIII2.append("%");
                }
            }
            ++IiiiiiiiIIIII3;
        }
        this.iIiIiiiiIiIii.setTextSize(IiiiiiiiIIIII2.toString(), 235);
    }

    public MountJpanel2(GameView gameView) {
        super(20, 2, IiiiIiiiiIiIi.iIIIIiiiiiIIi, gameView);
        this.ALLATORIxDEMO(-3, 0, 322, 330, IiiiIiiiiIiIi.iiIIIiiiiiiiI);
        this.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/1.png", (int)68, (int)68, (int)68, (int)68, (boolean)false), "\u5750\u9a91\u6280\u80fd");
        this.IiIIIiiiiIiiI = new DefaultListModel();
        this.IIiiIiiiIIiIi = new JList();
        this.IIiiIiiiIIiIi.setOpaque(false);
        this.IIiiIiiiIIiIi.setSelectionBackground(new Color(33, 42, 52));
        this.IIiiIiiiIIiIi.setSelectionForeground(Color.GREEN);
        this.IIiiIiiiIIiIi.setForeground(Color.GREEN);
        this.IIiiIiiiIIiIi.setFont(iiIIiiiiIiiII.iIiiIiiiiiiii);
        this.IIiiIiiiIIiIi.setBackground(iiIIiiiiIiiII.IIiIiiiiIIiII);
        this.IIiiIiiiIIiIi.setModel(this.IiIIIiiiiIiiI);
        this.IIiiIiiiIIiIi.addListSelectionListener((ListSelectionListener)new iiiiiiiiIIIII(this));
        this.IIiiIiiiIIiIi.setBounds(49, 52, 247, 70);
        this.add(this.IIiiIiiiIIiIi);
        this.iIiIiiiiIiIii = new RichLabel("", iiIIiiiiIiiII.iIiIIiiiiIIiI);
        this.iIiIiiiiIiIii.setBounds(49, 124, 235, 183);
        this.add((Component)this.iIiIiiiiIiIii);
        this.IiiiiiiiIIIII = new JLabel[2];
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IiiiiiiiIIIII.length) {
            this.IiiiiiiiIIIII[IiiiiiiiIIIII] = IiIIIiiiiIIiI.ALLATORIxDEMO((int)47, (int)32, (int)250, (int)21, (int)0, (Color)iiIIiiiiIiiII.ALLATORIxDEMO((String)"#cFFFFFF"), (Font)iiIIiiiiIiiII.iiiiIiiiIiiII);
            this.IiiiiiiiIIIII[IiiiiiiiIIIII].setText(IiiiiiiiIIIII == 0 ? "\u5750\u9a91\u6280\u80fd" : (IiiiiiiiIIIII == 1 ? "\u719f\u7ec3\u5ea6" : ""));
            this.add(this.IiiiiiiiIIIII[IiiiiiiiIIIII]);
            if (IiiiiiiiIIIII == 1) {
                this.IiiiiiiiIIIII[IiiiiiiiIIIII].setBounds(47, 290, 57, 19);
                this.IiiiiiiiIIIII[IiiiiiiiIIIII].setForeground(iiIIiiiiIiiII.ALLATORIxDEMO((String)"#c000000"));
            }
            ++IiiiiiiiIIIII;
        }
        this.ALLATORIxDEMO = IiIIIiiiiIIiI.ALLATORIxDEMO((int)112, (int)290, (int)184, (int)19, (int)10, (Color)Color.white, (Font)iiIIiiiiIiiII.iIIIiiiiIIIii);
        this.ALLATORIxDEMO.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/17.png", (int)6, (int)6, (int)6, (int)6, (boolean)false));
        this.add((Component)this.ALLATORIxDEMO);
        this.iiIiiiiiiiIii = new IIIiiiiiIiIiI[5];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iiIiiiiiiiIii.length) {
            this.iiIiiiiiiiIii[IiiiiiiiIIIII] = new IIIiiiiiIiIiI();
            this.add((Component)this.iiIiiiiiiiIii[IiiiiiiiIIIII]);
            if (IiiiiiiiIIIII == 0) {
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/25.png", (int)2, (int)2, (int)2, (int)2, (boolean)false));
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].setBounds(47, 32, 250, 21);
            } else if (IiiiiiiiIIIII == 1) {
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/24.png", (int)2, (int)2, (int)2, (int)2, (boolean)false));
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].setBounds(47, 32, 250, 90);
            } else if (IiiiiiiiIIIII == 2) {
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/24.png", (int)2, (int)2, (int)2, (int)2, (boolean)false));
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].setBounds(47, 122, 250, 160);
            }
            ++IiiiiiiiIIIII;
        }
    }
}
