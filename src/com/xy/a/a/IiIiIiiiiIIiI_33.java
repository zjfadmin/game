/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.a.IIiiIiiiIiiiI
 *  com.xy.i.IiIiIiiiiIIiI
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.readbean.Skill
 *  com.xy.richtext.RichLabel
 *  com.xy.w.IIIIIiiiIiiII
 *  com.xy.w.IIiIiiiiIIiii
 */
package com.xy.a.a;

import com.xy.a.a.IIiiIiiiIiiiI;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.readbean.Skill;
import com.xy.richtext.RichLabel;
import com.xy.w.IIIIIiiiIiiII;
import com.xy.w.IIiIiiiiIIiii;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JComponent;
import javax.swing.JLabel;

/*
 * Exception performing whole class analysis ignored.
 */
static class IiIiIiiiiIIiI
extends JComponent {
    private com.xy.i.IiIiIiiiiIIiI IIIIiiiiiiiII;
    private RichLabel iiIIIiiiiiiiI;
    private IIiIiiiiIIiii IiIiiiiiIIIII;
    private RichLabel iiIiIiiiiIIIi;
    private int iiiiIiiiIiiII;
    private Skill iiiIiiiiiiiIi;
    private JLabel iIiiIiiiiiiII;
    private RichLabel IIiiIiiiIIiIi = new RichLabel("", iiIIiiiiIiiII.iIIiiiiiiIIII);
    private int iIiIiiiiIiIii = 5;
    private int IiIIIiiiiIiiI;
    private int iiIiiiiiiiIii;
    final /* synthetic */ IIiiIiiiIiiiI IiiiiiiiIIIII;
    private int ALLATORIxDEMO = 215;

    public int iIiIiiiiIIiii(int slvl, int h) {
        this.iiIiiiiiiiIii = slvl;
        this.iiiiIiiiIiiII = 5 + h;
        this.IiIIIiiiiIiiI = 30;
        if (slvl == -1) {
            this.iiIiIiiiiIIIi.setText("\u8fd8\u6ca1\u5f00\u542f#G\u5929\u8d4b\u8fdb\u9636");
            Dimension IiiiiiiiIIIII = this.iiIiIiiiiIIIi.computeSize(180);
            this.iiIiIiiiiIIIi.setBounds(10, this.iiiiIiiiIiiII + 3, (int)IiiiiiiiIIIII.getWidth(), (int)IiiiiiiiIIIII.getHeight());
            StringBuffer IiiiiiiiIIIII2 = new StringBuffer();
            IiiiiiiiIIIII2.append("#R\u4e00\u9636\u5929\u8d4b\u6548\u679c:(\u5c1a\u672a\u6fc0\u6d3b)");
            IiiiiiiiIIIII2.append(IIiiIiiiIiiiI.ALLATORIxDEMO((int)3036, (int)1));
            this.iiIIIiiiiiiiI.setText(IiiiiiiiIIIII2.toString());
            IiiiiiiiIIIII = IIiiIiiiIiiiI.ALLATORIxDEMO((IIiiIiiiIiiiI)this.IiiiiiiiIIIII).iiIIIiiiiiiiI.computeSize(210);
            this.iiIIIiiiiiiiI.setBounds(10, this.iiiiIiiiIiiII + 28 + 5 + 18, (int)IiiiiiiiIIIII.getWidth(), (int)IiiiiiiiIIIII.getHeight());
            this.IiIIIiiiiIiiI += (int)IiiiiiiiIIIII.getHeight() + 6 + 20;
        } else {
            this.iiIiIiiiiIIIi.setText("\u5df2\u7ecf\u5f00\u542f#G\u5929\u8d4b\u8fdb\u9636");
            Dimension IiiiiiiiIIIII = this.iiIiIiiiiIIIi.computeSize(180);
            this.iiIiIiiiiIIIi.setBounds(10, this.iiiiIiiiIiiII + 3, (int)IiiiiiiiIIIII.getWidth(), (int)IiiiiiiiIIIII.getHeight());
            this.iIiiIiiiiiiII.setBounds(8, this.iiiiIiiiIiiII + 28 + 5, 68, 14);
            this.iIiiIiiiiiiII.setText("\u7b49\u7ea7:" + slvl + "/5");
            this.iIiiIiiiiiiII.setVisible(true);
            StringBuffer IiiiiiiiIIIII3 = new StringBuffer();
            IiiiiiiiIIIII3.append("#G\u5f53\u524d\u5929\u8d4b\u6548\u679c:");
            IiiiiiiiIIIII3.append(IIiiIiiiIiiiI.ALLATORIxDEMO((int)3036, (int)slvl));
            if (slvl < 5) {
                if (IiiiiiiiIIIII3.length() != 0) {
                    IiiiiiiiIIIII3.append("#r");
                }
                IiiiiiiiIIIII3.append("#R\u4e0b\u4e00\u9636\u5929\u8d4b\u6548\u679c:(\u5c1a\u672a\u6fc0\u6d3b)");
                IiiiiiiiIIIII3.append(IIiiIiiiIiiiI.ALLATORIxDEMO((int)3036, (int)(slvl + 1)));
            }
            this.iiIIIiiiiiiiI.setText(IiiiiiiiIIIII3.toString());
            IiiiiiiiIIIII = IIiiIiiiIiiiI.ALLATORIxDEMO((IIiiIiiiIiiiI)this.IiiiiiiiIIIII).iiIIIiiiiiiiI.computeSize(210);
            this.iiIIIiiiiiiiI.setBounds(10, this.iiiiIiiiIiiII + 28 + 5 + 18, (int)IiiiiiiiIIIII.getWidth(), (int)IiiiiiiiIIIII.getHeight());
            this.IiIIIiiiiIiiI += (int)IiiiiiiiIIIII.getHeight() + 6 + 20;
        }
        return 10 + this.IiIIIiiiiIiiI;
    }

    static /* synthetic */ RichLabel ALLATORIxDEMO(IiIiIiiiiIIiI arg0) {
        return arg0.IIiiIiiiIIiIi;
    }

    public IiIiIiiiiIIiI(IIiiIiiiIiiiI iIiiIiiiIiiiI) {
        this.IiiiiiiiIIIII = iIiiIiiiIiiiI;
        this.add((Component)this.IIiiIiiiIIiIi);
        this.iiIiIiiiiIIIi = new RichLabel();
        this.add((Component)this.iiIiIiiiiIIIi);
        this.iiIIIiiiiiiiI = new RichLabel();
        this.add((Component)this.iiIIIiiiiiiiI);
        this.IIIIiiiiiiiII = new com.xy.i.IiIiIiiiiIIiI("sc/e/5.png", 1, 45, iiIIiiiiIiiII.iiIiiiiiiIIiI, iiIIiiiiIiiII.iIiiIiiiiiIIi, null, iIiiIiiiIiiiI.ALLATORIxDEMO());
        this.add((Component)this.IIIIiiiiiiiII);
        this.iIiiIiiiiiiII = new JLabel("\u7b49\u7ea7", 0);
        this.iIiiIiiiiiiII.setFont(iiIIiiiiIiiII.iiIiiiiiiIIiI);
        this.iIiiIiiiiiiII.setForeground(Color.white);
        this.add(this.iIiiIiiiiiiII);
    }

    public void ALLATORIxDEMO() {
        this.IIiiIiiiIIiIi.setText(null);
        this.iiIiIiiiiIIIi.setText(null);
        this.iiIIIiiiiiiiI.setText(null);
        this.IIIIiiiiiiiII.setVisible(false);
        this.iIiiIiiiiiiII.setVisible(false);
    }

    static /* synthetic */ void ALLATORIxDEMO(IiIiIiiiiIIiI arg0, Skill arg1) {
        arg0.iiiIiiiiiiiIi = arg1;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (this.IiIiiiiiIIIII == null) {
            this.IiIiiiiiIIIII = IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/17.png", (int)6, (int)6, (int)6, (int)6, (boolean)false);
        }
        g.translate(this.iIiIiiiiIiIii, this.iiiiIiiiIiiII);
        this.IiIiiiiiIIIII.ALLATORIxDEMO(g, this.ALLATORIxDEMO, this.IiIIIiiiiIiiI);
        g.translate(-this.iIiIiiiiIiIii, -this.iiiiIiiiIiiII);
    }

    static /* synthetic */ Skill ALLATORIxDEMO(IiIiIiiiiIIiI arg0) {
        return arg0.iiiIiiiiiiiIi;
    }

    public int ALLATORIxDEMO(int slvl, int h) {
        this.iiIiiiiiiiIii = slvl;
        this.iiiiIiiiIiiII = 5 + h;
        this.IiIIIiiiiIiiI = 30;
        if (slvl == -3) {
            this.iiIiIiiiiIIIi.setText("\u6b64\u6280\u80fd\u65e0\u6cd5\u609f\u7075");
            Dimension IiiiiiiiIIIII = this.iiIiIiiiiIIIi.computeSize(180);
            this.iiIiIiiiiIIIi.setBounds(10, this.iiiiIiiiIiiII + 3, (int)IiiiiiiiIIIII.getWidth(), (int)IiiiiiiiIIIII.getHeight());
        } else if (slvl == -2) {
            this.iiIiIiiiiIIIi.setText("\u6280\u80fd\u609f\u7075\u4e2a\u6570#R\u5df2\u8fbe\u4e0a\u9650");
            Dimension IiiiiiiiIIIII = this.iiIiIiiiiIIIi.computeSize(180);
            this.iiIiIiiiiIIIi.setBounds(10, this.iiiiIiiiIiiII + 3, (int)IiiiiiiiIIIII.getWidth(), (int)IiiiiiiiIIIII.getHeight());
        } else if (slvl == -1) {
            IiIiIiiiiIIiI iiIiIiiiiIIiI = this;
            IiIiIiiiiIIiI iiIiIiiiiIIiI2 = this;
            iiIiIiiiiIIiI2.iiIiIiiiiIIIi.setText("\u6280\u80fd\u53ef\u4ee5\u5f00\u542f#G\u609f\u7075\u72b6\u6001");
            Dimension IiiiiiiiIIIII = iiIiIiiiiIIiI.iiIiIiiiiIIIi.computeSize(180);
            iiIiIiiiiIIiI2.iiIiIiiiiIIIi.setBounds(10, this.iiiiIiiiIiiII + 3, (int)IiiiiiiiIIIII.getWidth(), (int)IiiiiiiiIIIII.getHeight());
            iiIiIiiiiIIiI.IIIIiiiiiiiII.setText("\u5f00\u542f");
            iiIiIiiiiIIiI2.IIIIiiiiiiiII.setBounds(175, this.iiiiIiiiIiiII + 3, 34, 17);
            iiIiIiiiiIIiI.IIIIiiiiiiiII.setVisible(true);
        } else {
            this.iiIiIiiiiIIIi.setText("\u6b64\u6280\u80fd\u5904\u4e8e#G\u609f\u7075\u72b6\u6001");
            Dimension IiiiiiiiIIIII = this.iiIiIiiiiIIIi.computeSize(180);
            this.iiIiIiiiiIIIi.setBounds(10, this.iiiiIiiiIiiII + 3, (int)IiiiiiiiIIIII.getWidth(), (int)IiiiiiiiIIIII.getHeight());
            this.IIIIiiiiiiiII.setText("\u5173\u95ed");
            this.IIIIiiiiiiiII.setBounds(175, this.iiiiIiiiIiiII + 3, 34, 17);
            this.IIIIiiiiiiiII.setVisible(true);
            this.iIiiIiiiiiiII.setBounds(8, this.iiiiIiiiIiiII + 28 + 5, 68, 14);
            this.iIiiIiiiiiiII.setText("\u7b49\u7ea7:" + slvl + "/10");
            this.iIiiIiiiiiiII.setVisible(true);
            int IiiiiiiiIIIII2 = Integer.parseInt(this.iiiIiiiiiiiIi.getSkillid());
            StringBuffer IiiiiiiiIIIII3 = new StringBuffer();
            if (slvl > 0) {
                IiiiiiiiIIIII3.append("#G\u5f53\u524d\u7075\u9636\u6548\u679c:");
                IiiiiiiiIIIII3.append(IIiiIiiiIiiiI.ALLATORIxDEMO((int)IiiiiiiiIIIII2, (int)slvl));
            }
            if (slvl < 10) {
                if (IiiiiiiiIIIII3.length() != 0) {
                    IiiiiiiiIIIII3.append("#r");
                }
                IiiiiiiiIIIII3.append("#R\u4e0b\u4e00\u7075\u9636\u6548\u679c:(\u5c1a\u672a\u6fc0\u6d3b)");
                IiiiiiiiIIIII3.append(IIiiIiiiIiiiI.ALLATORIxDEMO((int)IiiiiiiiIIIII2, (int)(slvl + 1)));
            }
            this.iiIIIiiiiiiiI.setText(IiiiiiiiIIIII3.toString());
            IiiiiiiiIIIII = IIiiIiiiIiiiI.ALLATORIxDEMO((IIiiIiiiIiiiI)this.IiiiiiiiIIIII).iiIIIiiiiiiiI.computeSize(210);
            this.iiIIIiiiiiiiI.setBounds(10, this.iiiiIiiiIiiII + 28 + 5 + 18, (int)IiiiiiiiIIIII.getWidth(), (int)IiiiiiiiIIIII.getHeight());
            this.IiIIIiiiiIiiI += (int)IiiiiiiiIIIII.getHeight() + 6 + 20;
        }
        return 10 + this.IiIIIiiiiIiiI;
    }
}
