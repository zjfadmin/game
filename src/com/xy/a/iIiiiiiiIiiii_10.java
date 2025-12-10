/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.iiIiIiiiiIIII
 *  com.xy.a.iiiiIiiiIiIiI
 *  com.xy.q.IIiIIiiiIIIiI
 *  com.xy.q.IiIIIiiiiIIiI
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.readbean.Assist
 *  com.xy.readbean.TaskSet
 *  com.xy.richtext.RichLabel
 *  com.xy.w.IIIIIiiiIiiII
 *  com.xy.w.IIIiiiiiIiIiI
 */
package com.xy.a;

import com.xy.a.iiIiIiiiiIIII;
import com.xy.a.iiiiIiiiIiIiI;
import com.xy.q.IIiIIiiiIIIiI;
import com.xy.q.IiIIIiiiiIIiI;
import com.xy.q.IiiiIiiiiIiIi;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.readbean.Assist;
import com.xy.readbean.TaskSet;
import com.xy.richtext.RichLabel;
import com.xy.w.IIIIIiiiIiiII;
import com.xy.w.IIIiiiiiIiIiI;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JComponent;
import javax.swing.JTextField;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class iIiiiiiiIiiii
extends JComponent
implements MouseListener {
    private static Image iiIiIiiiiIIIi;
    private IIIiiiiiIiIiI iiiiIiiiIiiII;
    private RichLabel iiiIiiiiiiiIi;
    private int iIiiIiiiiiiII;
    private boolean IIiiIiiiIIiIi;
    private iiIiIiiiiIIII iIiIiiiiIiIii;
    private JTextField IiIIIiiiiIiiI;
    private IIiIIiiiIIIiI iiIiiiiiiiIii;
    private boolean IiiiiiiiIIIII;
    private Assist ALLATORIxDEMO;

    public void iIiIiiiiIIiii(boolean script) {
        this.IIiiIiiiIIiIi = script;
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    public void ALLATORIxDEMO(int index, Assist assist) {
        boolean IiiiiiiiIIIII = this.ALLATORIxDEMO == null || this.ALLATORIxDEMO.getId() != assist.getId();
        this.iIiiIiiiiiiII = index;
        this.ALLATORIxDEMO = assist;
        if (assist == null) {
            this.setVisible(false);
            return;
        }
        if (IiiiiiiiIIIII) {
            this.ALLATORIxDEMO(true);
            this.IiIIIiiiiIiiI.setText(String.valueOf(assist.getNum()));
        }
        StringBuffer IiiiiiiiIIIII2 = new StringBuffer("#Z");
        if (assist.getType() == 0) {
            IiiiiiiiIIIII2.append("#c81291F");
            IiiiiiiiIIIII2.append(assist.getName());
            IiiiiiiiIIIII2.append("(\u5df2\u5b8c\u6210#R");
            IiiiiiiiIIIII2.append(this.iIiIiiiiIiIii.ALLATORIxDEMO().getTaskSystem().ALLATORIxDEMO(assist.getSid(), 2));
            IiiiiiiiIIIII2.append("#c81291F\u6b21)");
        }
        this.iiiIiiiiiiiIi.setTextSize(IiiiiiiiIIIII2.toString(), 300);
        this.iiiIiiiiiiiIi.setBounds(28, 10, this.iiiIiiiiiiiIi.getWidth(), this.iiiIiiiiiiiIi.getHeight());
        this.ALLATORIxDEMO(assist.ALLATORIxDEMO());
        this.setVisible(true);
    }

    @Override
    public void mousePressed(MouseEvent e) {
        this.iIiIiiiiIiIii.ALLATORIxDEMO(this);
    }

    public int iiiIiiiiiiIIi() {
        return this.iIiiIiiiiiiII;
    }

    public int iIiIiiiiIIiii() {
        if (!this.IiiiiiiiIIIII) return 0;
        if (this.ALLATORIxDEMO == null) {
            return 0;
        }
        TaskSet IiiiiiiiIIIII = this.iIiIiiiiIiIii.ALLATORIxDEMO().ALLATORIxDEMO(this.ALLATORIxDEMO.getSid());
        int IiiiiiiiIIIII2 = this.iIiIiiiiIiIii.ALLATORIxDEMO().getTaskSystem().ALLATORIxDEMO(this.ALLATORIxDEMO.getSid(), 2);
        int IiiiiiiiIIIII3 = (int)this.iiIiiiiiiiIii.ALLATORIxDEMO();
        int IiiiiiiiIIIII4 = this.iIiIiiiiIiIii.ALLATORIxDEMO().getTaskSystem().getTaskSetNum(IiiiiiiiIIIII, 2);
        if (IiiiiiiiIIIII4 == 0) return IiiiiiiiIIIII3 - IiiiiiiiIIIII2;
        IiiiiiiiIIIII3 = Math.min((int)this.iiIiiiiiiiIii.ALLATORIxDEMO(), IiiiiiiiIIIII4);
        return IiiiiiiiIIIII3 - IiiiiiiiIIIII2;
    }

    public void ALLATORIxDEMO(boolean execute, int num, Assist assist) {
        this.ALLATORIxDEMO(this.iIiiIiiiiiiII, assist);
        this.ALLATORIxDEMO(execute);
        this.IiIIIiiiiIiiI.setText(String.valueOf(assist.getNum()));
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (iiIiIiiiiIIIi == null) {
            iiIiIiiiiIIIi = IIIIIiiiIiiII.iiiIiiiiiiIIi((String)"sc/b/S342.png");
        }
        g.drawImage(iiIiIiiiiIIIi, 0, 0, null);
    }

    public JTextField ALLATORIxDEMO() {
        return this.IiIIIiiiiIiiI;
    }

    public int ALLATORIxDEMO() {
        return (int)this.iiIiiiiiiiIii.ALLATORIxDEMO();
    }

    public Assist ALLATORIxDEMO() {
        return this.ALLATORIxDEMO;
    }

    public boolean iIiIiiiiIIiii() {
        return this.IIiiIiiiIIiIi;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

    public iIiiiiiiIiiii(iiIiIiiiiIIII assistView) {
        this.iIiIiiiiIiIii = assistView;
        this.iiiiIiiiIiiII = new IIIiiiiiIiIiI();
        this.iiiiIiiiIiiII.setBounds(8, 16, 16, 16);
        this.iiiiIiiiIiiII.addMouseListener((MouseListener)new iiiiIiiiIiIiI(this));
        this.add((Component)this.iiiiIiiiIiiII);
        this.iiiIiiiiiiiIi = new RichLabel("", iiIIiiiiIiiII.IIiiIiiiIIiIi, 300);
        this.IiIIIiiiiIiiI = IiIIIiiiiIIiI.ALLATORIxDEMO((Font)iiIIiiiiIiiII.iiIiiiiiiiiiI, (Color)Color.white);
        this.IiIIIiiiiIiiI.setText("0");
        this.IiIIIiiiiIiiI.setBounds(382, 14, 68, 19);
        this.IiIIIiiiiIiiI.setHorizontalAlignment(0);
        this.iiIiiiiiiiIii = new IIiIIiiiIIIiI(4, this.IiIIIiiiiIiiI, (IiiiIiiiiIiIi)assistView);
        this.add((Component)this.iiiIiiiiiiiIi);
        this.add(this.IiIIIiiiiIiiI);
        this.addMouseListener(this);
        this.ALLATORIxDEMO(true);
    }

    public boolean ALLATORIxDEMO() {
        return this.IiiiiiiiIIIII;
    }

    public void ALLATORIxDEMO(boolean execute) {
        this.IiiiiiiiIIIII = execute;
        this.iiiiIiiiIiiII.ALLATORIxDEMO(IIIIIiiiIiiII.iiiIiiiiiiIIi((String)(execute ? "sc/b/B460.png" : "sc/b/B461.png")));
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }
}
