/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.game.GameUtil
 *  com.xy.game.Task
 *  com.xy.i.IIIIIiiiIIIiI
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.richtext.InputBean
 *  com.xy.richtext.RichLabel
 *  com.xy.scene.DLDScene
 *  com.xy.text.GameView
 *  com.xy.w.IIIIIiiiIiiII
 */
package com.xy.a;

import com.xy.game.GameUtil;
import com.xy.game.Task;
import com.xy.i.IIIIIiiiIIIiI;
import com.xy.q.IiiiIiiiiIiIi;
import com.xy.richtext.InputBean;
import com.xy.richtext.RichLabel;
import com.xy.scene.DLDScene;
import com.xy.text.GameView;
import com.xy.w.IIIIIiiiIiiII;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.util.List;

public class IiiiIiiiiIIIi
extends IiiiIiiiiIiIi {
    private int iIiIiiiiIiIii = 214;
    private IIIIIiiiIIIiI IiIIIiiiiIiiI;
    private int iiIiiiiiiiIii;
    private InputBean IiiiiiiiIIIII;
    private int ALLATORIxDEMO;

    public void mouseReleased(MouseEvent e) {
        super.mouseReleased(e);
        if (this.IiiiiiiiIIIII == null) {
            return;
        }
        GameUtil.ALLATORIxDEMO((InputBean)this.IiiiiiiiIIIII, (GameView)this.iiIIiiiiIiIIi);
        this.IiiiiiiiIIIII = null;
    }

    protected void paintChildren(Graphics g) {
        List IiiiiiiiIIIII;
        super.paintChildren(g);
        if (this.iiIiiiiiiiIii == 1) return;
        if (this.ALLATORIxDEMO().getTaskSystem() == null) {
            return;
        }
        int IiiiiiiiIIIII2 = 0;
        if (this.iiIIiiiiIiIIi.scene != null && this.iiIIiiiiIiIIi.scene instanceof DLDScene) {
            RichLabel IiiiiiiiIIIII3;
            if (IiiiiiiiIIIII2 == 0) {
                IiiiiiiiIIIII2 = 20;
                g.translate(5, IiiiiiiiIIIII2);
            }
            if ((IiiiiiiiIIIII3 = (IiiiiiiiIIIII = (DLDScene)this.iiIIiiiiIiIIi.scene).getRichLabel()) != null) {
                IiiiiiiiIIIII3.paint(g);
                IiiiiiiiIIIII2 += IiiiiiiiIIIII3.getHeight();
                g.translate(0, IiiiiiiiIIIII3.getHeight());
            }
        }
        if ((IiiiiiiiIIIII = this.ALLATORIxDEMO().getTaskSystem().getTaskList()) != null && IiiiiiiiIIIII.size() != 0) {
            if (IiiiiiiiIIIII2 == 0) {
                IiiiiiiiIIIII2 = 20;
                g.translate(5, IiiiiiiiIIIII2);
            }
            int IiiiiiiiIIIII4 = 0;
            while (IiiiiiiiIIIII4 < IiiiiiiiIIIII.size()) {
                RichLabel IiiiiiiiIIIII5 = ((Task)IiiiiiiiIIIII.get(IiiiiiiiIIIII4)).getRichLabel();
                if (IiiiiiiiIIIII5 != null) {
                    IiiiiiiiIIIII5.paint(g);
                    IiiiiiiiIIIII2 += IiiiiiiiIIIII5.getHeight();
                    g.translate(0, IiiiiiiiIIIII5.getHeight());
                }
                ++IiiiiiiiIIIII4;
            }
        }
        if (IiiiiiiiIIIII2 > 0) {
            g.translate(-5, -IiiiiiiiIIIII2);
            IiiiiiiiIIIII2 = Math.max(100, IiiiiiiiIIIII2 + 20);
            if (IiiiiiiiIIIII2 == this.iIiIiiiiIiIii) return;
            this.iIiIiiiiIiIii = IiiiiiiiIIIII2;
            this.setBounds(this.getX(), this.getY(), this.getWidth(), IiiiiiiiIIIII2);
            return;
        }
        if (this.iIiIiiiiIiIii == 214) return;
        this.iIiIiiiiIiIii = 214;
        this.setBounds(this.getX(), this.getY(), this.getWidth(), 214);
    }

    public void mousePressed(MouseEvent e) {
        super.mousePressed(e);
        if (this.iiIiiiiiiiIii == 1) return;
        if (this.ALLATORIxDEMO().getTaskSystem() == null) {
            return;
        }
        List IiiiiiiiIIIII = this.ALLATORIxDEMO().getTaskSystem().getTaskList();
        if (IiiiiiiiIIIII == null) return;
        if (IiiiiiiiIIIII.size() == 0) {
            return;
        }
        int IiiiiiiiIIIII2 = e.getX();
        int IiiiiiiiIIIII3 = e.getY();
        int IiiiiiiiIIIII4 = 20;
        int IiiiiiiiIIIII5 = 0;
        while (IiiiiiiiIIIII5 < IiiiiiiiIIIII.size()) {
            RichLabel IiiiiiiiIIIII6 = ((Task)IiiiiiiiIIIII.get(IiiiiiiiIIIII5)).getRichLabel();
            if (IiiiiiiiIIIII6 != null) {
                InputBean IiiiiiiiIIIII7 = IiiiiiiiIIIII6.isMonitor(IiiiiiiiIIIII2 - 5, IiiiiiiiIIIII3 - IiiiiiiiIIIII4);
                if (IiiiiiiiIIIII7 != null) {
                    this.IiiiiiiiIIIII = IiiiiiiiIIIII7;
                    this.IiiiiiiiIIIII.setM(true);
                    return;
                }
                IiiiiiiiIIIII4 += IiiiiiiiIIIII6.getHeight();
            }
            ++IiiiiiiiIIIII5;
        }
    }

    public void ALLATORIxDEMO() {
        if (this.iiIiiiiiiiIii == 0) {
            this.setBounds(0, 200, 189, this.iIiIiiiiIiIii);
            return;
        }
        this.setBounds(0, 200, 17, 17);
    }

    public void iiiIiiiiiiIIi() {
        if (this.iiIiiiiiiiIii == 0) {
            this.iiIiiiiiiiIii = 1;
            this.IiIIIiiiiIiiI.setImage("sc/c/51");
            this.IiIIIiiiiIiiI.setBounds(0, 0, 17, 17);
        } else {
            this.iiIiiiiiiiIii = 0;
            this.IiIIIiiiiIiiI.setImage("sc/c/49");
            this.IiIIIiiiiIiiI.setBounds(0, 0, 189, 23);
        }
        this.ALLATORIxDEMO();
    }

    public void iIiIiiiiIIiii(int id) {
        if (this.ALLATORIxDEMO == id) {
            return;
        }
        this.ALLATORIxDEMO = id;
    }

    public IiiiIiiiiIIIi(GameView gameView) {
        super(-1, -1, IiiiIiiiiIiIi.iIIIIiiiiiIIi, gameView);
        this.ALLATORIxDEMO(0, 200, 189, this.iIiIiiiiIiIii, IiiiIiiiiIiIi.iIIiIiiiiiiIi);
        this.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/c/50", (int)50, (int)50, (int)50, (int)50, (boolean)false), null);
        this.IiIIIiiiiIiiI = new IIIIIiiiIIIiI("sc/c/49", 1, 90, (IiiiIiiiiIiIi)this);
        this.IiIIIiiiiIiiI.setBounds(0, 0, 189, 23);
        this.add((Component)this.IiIIIiiiiIiiI);
    }
}
