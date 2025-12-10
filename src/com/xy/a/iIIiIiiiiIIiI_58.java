/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.IiIiIiiiIIiiI
 *  com.xy.a.iiiiIiiiIiiii
 *  com.xy.bean.UseCardBean
 *  com.xy.game.RoleData
 *  com.xy.i.IIIIIiiiIIIiI
 *  com.xy.w.IIIIIiiiIiiII
 *  com.xy.w.IIIiiiiiIiIiI
 */
package com.xy.a;

import com.xy.a.IiIiIiiiIIiiI;
import com.xy.a.iiiiIiiiIiiii;
import com.xy.bean.UseCardBean;
import com.xy.game.RoleData;
import com.xy.i.IIIIIiiiIIIiI;
import com.xy.w.IIIIIiiiIiiII;
import com.xy.w.IIIiiiiiIiIiI;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComponent;

/*
 * Exception performing whole class analysis ignored.
 */
static class iIIiIiiiiIIiI
extends JComponent
implements MouseListener {
    boolean iIiiIiiiiiiII = false;
    private int IIiiIiiiIIiIi;
    private IIIiiiiiIiIiI iIiIiiiiIiIii;
    boolean IiIIIiiiiIiiI = true;
    private List<iiiiIiiiIiiii> iiIiiiiiiiIii = new ArrayList<iiiiIiiiIiiii>();
    private IIIIIiiiIIIiI IiiiiiiiIIIII;
    final /* synthetic */ IiIiIiiiIIiiI ALLATORIxDEMO;

    public iIIiIiiiiIIiI(IiIiIiiiIIiiI iiIiIiiiIIiiI) {
        this.ALLATORIxDEMO = iiIiIiiiIIiiI;
        this.iIiIiiiiIiIii = new IIIiiiiiIiIiI(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/c/46", (int)6, (int)6, (int)6, (int)6, (boolean)false));
        this.IiiiiiiiIIIII = new IIIIIiiiIIIiI("sc/c/55", 1, 7, iiIiIiiiIIiiI.ALLATORIxDEMO());
        this.add((Component)this.iIiIiiiiIiIii);
        this.add((Component)this.IiiiiiiiIIIII);
        this.addMouseListener(this);
        this.iIiIiiiiIiIii.setVisible(false);
        this.IiiiiiiiIIIII.setVisible(false);
        this.iIiIiiiiIIiii();
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    public void iiiIiiiiiiIIi() {
        if (!this.IiIIIiiiiIiiI) return;
        if (this.iIiiIiiiiiiII) return;
        this.iIiiIiiiiiiII = true;
        this.iIiIiiiiIiIii.setVisible(this.iIiiIiiiiiiII);
        this.IiiiiiiiIIIII.setVisible(this.iIiiIiiiiiiII);
        this.add((Component)this.iIiIiiiiIiIii);
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        this.iiiIiiiiiiIIi();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (!this.IiIIIiiiiIiiI) return;
        if (!this.iIiiIiiiiiiII) return;
        Point IiiiiiiiIIIII = this.ALLATORIxDEMO.iiIIiiiiIiIIi.getMousePoint();
        if (IiiiiiiiIIIII.x >= this.getX() && IiiiiiiiIIIII.x <= this.getX() + this.getWidth() && IiiiiiiiIIIII.y >= this.getY()) {
            if (IiiiiiiiIIIII.y <= this.getY() + this.getHeight()) return;
        }
        this.iIiiIiiiiiiII = false;
        this.iIiIiiiiIiIii.setVisible(this.iIiiIiiiiiiII);
        this.IiiiiiiiIIIII.setVisible(this.iIiiIiiiiiiII);
    }

    static /* synthetic */ IIIiiiiiIiIiI ALLATORIxDEMO(iIIiIiiiiIIiI arg0) {
        return arg0.iIiIiiiiIiIii;
    }

    /*
     * Unable to fully structure code
     */
    public void iIiIiiiiIIiii() {
        block4: {
            block3: {
                if (this.IIiiIiiiIIiIi == 0) {
                    this.setVisible(false);
                    return;
                }
                IiiiiiiiIIIII = this.ALLATORIxDEMO.iiIIiiiiIiIIi.screenData;
                if (!this.IiIIIiiiiIiiI) break block3;
                IiiiiiiiIIIII = this.IIiiIiiiIIiIi * 24 + 8 + 13;
                IiiiiiiiIIIII = 40;
                IiiiiiiiIIIII = 0;
                if (true) ** GOTO lbl19
            }
            IiiiiiiiIIIII = 0;
            if (true) ** GOTO lbl29
            do {
                var5_7 = this.iiIiiiiiiiIii.get(IiiiiiiiIIIII);
                v0 = IiiiiiiiIIIII - 8 - (IiiiiiiiIIIII + 1) * 24;
                ++IiiiiiiiIIIII;
                IiiiiiiiIIIII.setBounds(v0, 0, 24, 40);
                IiiiiiiiIIIII.setVisible(true);
lbl19:
                // 2 sources

            } while (IiiiiiiiIIIII < this.IIiiIiiiIIiIi);
            this.iIiIiiiiIiIii.setBounds(13, 0, this.IIiiIiiiIIiIi * 24 + 8, 40);
            this.IiiiiiiiIIIII.setBounds(0, 2, 13, 37);
            this.setBounds(IiiiiiiiIIIII.getScreen_x() - IiiiiiiiIIIII, 78, IiiiiiiiIIIII, IiiiiiiiIIIII);
            break block4;
            do {
                v1 = this.iiIiiiiiiiIii.get(IiiiiiiiIIIII);
                ++IiiiiiiiIIIII;
                IiiiiiiiIIIII = v1;
                v1.setVisible(false);
lbl29:
                // 2 sources

            } while (IiiiiiiiIIIII < this.IIiiIiiiIIiIi);
            this.IiiiiiiiIIIII.setBounds(0, 2, 11, 37);
            this.setBounds(IiiiiiiiIIIII.Screen_x - 11, 78, 11, 40);
        }
        this.setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

    public void ALLATORIxDEMO() {
        RoleData IiiiiiiiIIIII = this.ALLATORIxDEMO.ALLATORIxDEMO();
        int IiiiiiiiIIIII2 = 0;
        for (UseCardBean IiiiiiiiIIIII3 : IiiiiiiiIIIII.limitMap.values()) {
            iiiiIiiiIiiii IiiiiiiiIIIII4;
            if (IiiiiiiiIIIII3.getType().equals("\u9650\u65f6\u793c\u5305") || IiiiiiiiIIIII3.getType().equals("\u9753\u53f7")) continue;
            iiiiIiiiIiiii iiiiIiiiIiiii2 = IiiiiiiiIIIII4 = IiiiiiiiIIIII2 < this.iiIiiiiiiiIii.size() ? this.iiIiiiiiiiIii.get(IiiiiiiiIIIII2) : null;
            if (IiiiiiiiIIIII4 == null) {
                IiiiiiiiIIIII4 = new iiiiIiiiIiiii(this.ALLATORIxDEMO);
                this.add((Component)IiiiiiiiIIIII4);
                this.iiIiiiiiiiIii.add(IiiiiiiiIIIII4);
            }
            iiiiIiiiIiiii.ALLATORIxDEMO((iiiiIiiiIiiii)IiiiiiiiIIIII4).ALLATORIxDEMO(10, (Object)IiiiiiiiIIIII3);
            long IiiiiiiiIIIII5 = Math.max(IiiiiiiiIIIII3.getUseTime(), 0);
            if (IiiiiiiiIIIII5 == 0L) {
                iiiiIiiiIiiii.ALLATORIxDEMO((iiiiIiiiIiiii)IiiiiiiiIIIII4).setText(null);
            } else if (IiiiiiiiIIIII5 < 60L) {
                iiiiIiiiIiiii.ALLATORIxDEMO((iiiiIiiiIiiii)IiiiiiiiIIIII4).setForeground(Color.red);
                iiiiIiiiIiiii.ALLATORIxDEMO((iiiiIiiiIiiii)IiiiiiiiIIIII4).setText(String.valueOf(IiiiiiiiIIIII5) + "m");
            } else if (IiiiiiiiIIIII5 < 1440L) {
                iiiiIiiiIiiii.ALLATORIxDEMO((iiiiIiiiIiiii)IiiiiiiiIIIII4).setForeground(Color.yellow);
                iiiiIiiiIiiii.ALLATORIxDEMO((iiiiIiiiIiiii)IiiiiiiiIIIII4).setText(String.valueOf(IiiiiiiiIIIII5 / 60L) + "h");
            } else {
                iiiiIiiiIiiii.ALLATORIxDEMO((iiiiIiiiIiiii)IiiiiiiiIIIII4).setForeground(Color.green);
                iiiiIiiiIiiii.ALLATORIxDEMO((iiiiIiiiIiiii)IiiiiiiiIIIII4).setText(String.valueOf(IiiiiiiiIIIII5 / 1440L) + "d");
            }
            ++IiiiiiiiIIIII2;
        }
        int IiiiiiiiIIIII6 = IiiiiiiiIIIII2;
        while (IiiiiiiiIIIII6 < this.iiIiiiiiiiIii.size()) {
            this.iiIiiiiiiiIii.get(IiiiiiiiIIIII6++).ALLATORIxDEMO();
        }
        this.IIiiIiiiIIiIi = IiiiiiiiIIIII2;
        this.iIiIiiiiIIiii();
    }

    static /* synthetic */ IIIIIiiiIIIiI ALLATORIxDEMO(iIIiIiiiiIIiI arg0) {
        return arg0.IiiiiiiiIIIII;
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }
}
