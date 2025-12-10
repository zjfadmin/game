/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.a.IIiiiiiiIiIii
 *  com.xy.game.RoleData
 *  com.xy.i.IIIiIiiiIiIII
 *  com.xy.i.IIIiiiiiIiIiI
 *  com.xy.i.IIiiIiiiIiiiI
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.v.iIiIIiiiIiiiI
 *  com.xy.w.IiIiIiiiiIIiI
 */
package com.xy.q;

import com.xy.a.a.IIiiiiiiIiIii;
import com.xy.game.RoleData;
import com.xy.i.IIIiIiiiIiIII;
import com.xy.i.IIIiiiiiIiIiI;
import com.xy.i.IIiiIiiiIiiiI;
import com.xy.q.IiiiIiiiiIiIi;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.v.iIiIIiiiIiiiI;
import com.xy.w.IiIiIiiiiIIiI;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JComponent;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public abstract class IIiiIiiiiIIiI
extends JComponent
implements MouseListener,
MouseMotionListener,
IIIiiiiiIiIiI {
    protected int iIIiIiiiiiiIi;
    protected int IIIIiiiiiiiII;
    protected int iiIIIiiiiiiiI;
    protected IIIiIiiiIiIII IiIiiiiiIIIII;
    protected int iiIiIiiiiIIIi;
    protected int iiiiIiiiIiiII;
    protected Image iiiIiiiiiiiIi;
    protected IiIiIiiiiIIiI[] iIiiIiiiiiiII;
    protected int IIiiIiiiIIiIi;
    protected int iIiIiiiiIiIii;
    protected int IiIIIiiiiIiiI;
    protected IiiiIiiiiIiIi iiIiiiiiiiIii;
    protected boolean IiiiiiiiIIIII;
    protected int ALLATORIxDEMO;

    public int IiiIiiiiiiIiI() {
        if (this.IiIiiiiiIIIII == null) return this.iIiiIiiiiiiII.length;
        return this.IiIiiiiiIIIII.iIiIiiiiIIiii() * this.iIiiIiiiiiiII.length;
    }

    public int ALLATORIxDEMO(int index) {
        int IiiiiiiiIIIII = index;
        while (IiiiiiiiIIIII < this.iIiiIiiiiiiII.length) {
            if (this.iIiiIiiiiiiII[IiiiiiiiIIIII] == null) return IiiiiiiiIIIII;
            if (this.iIiiIiiiiiiII[IiiiiiiiIIIII].iIiIiiiiIiIii == 0) {
                return IiiiiiiiIIIII;
            }
            ++IiiiiiiiIIIII;
        }
        return -1;
    }

    public void ALLATORIxDEMO(IIIiIiiiIiIII btnGroup) {
        this.IiIiiiiiIIIII = btnGroup;
    }

    public void iiiIiiiiiiIIi() {
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iIiiIiiiiiiII.length) {
            if (this.iIiiIiiiiiiII[IiiiiiiiIIIII] != null) {
                this.iIiiIiiiiiiII[IiiiiiiiIIIII].ALLATORIxDEMO();
            }
            ++IiiiiiiiIIIII;
        }
    }

    public void iIiIiiiiIIiii(IIiiIiiiIiiiI[] btns, int type) {
        if (this.IiIiiiiiIIIII != null) {
            return;
        }
        this.IiIiiiiiIIIII = new IIIiIiiiIiIII(btns, (IIIiiiiiIiIiI)this, type);
    }

    @Override
    public void mousePressed(MouseEvent e) {
        if (iIiIIiiiIiiiI.ALLATORIxDEMO()) {
            return;
        }
        if (e.getButton() == 3) {
            this.iIIiIiiiiiiIi = this.ALLATORIxDEMO(e.getX(), e.getY());
            if (this.iIIiIiiiiiiIi == -1) return;
            this.iIIiIiiiiiiIi += this.iiiIiiiiiiIIi();
            return;
        }
        if (e.getButton() != 1) return;
        int IiiiiiiiIIIII = this.ALLATORIxDEMO(e.getX(), e.getY());
        if (IiiiiiiiIIIII == -1) {
            return;
        }
        IiiiiiiiIIIII += this.iiiIiiiiiiIIi();
        RoleData IiiiiiiiIIIII2 = this.iiIiiiiiiiIii.ALLATORIxDEMO();
        if (IiiiiiiiIIIII2 == null) {
            return;
        }
        this.iIiIiiiiIIiii(IiiiiiiiIIIII, e, IiiiiiiiIIIII2);
    }

    protected abstract void iIiIiiiiIIiii(int var1, MouseEvent var2, RoleData var3);

    public void iIiIiiiiIIiii(int index) {
        if (this.iiIIIiiiiiiiI == index) {
            return;
        }
        this.iiIIIiiiiiiiI = index;
        if (index == -1) {
            this.iIiIiiiiIIiii();
            return;
        }
        RoleData IiiiiiiiIIIII = this.iiIiiiiiiiIii.ALLATORIxDEMO();
        if (IiiiiiiiIIIII == null) {
            return;
        }
        this.ALLATORIxDEMO(IiiiiiiiIIIII);
    }

    @Override
    protected void paintComponent(Graphics g) {
        RoleData IiiiiiiiIIIII = this.iiIiiiiiiiIii.ALLATORIxDEMO();
        if (IiiiiiiiIIIII == null) {
            return;
        }
        this.ALLATORIxDEMO(g, IiiiiiiiIIIII);
    }

    protected abstract void iIiIiiiiIIiii();

    public void ALLATORIxDEMO(IiIiIiiiiIIiI[] models) {
        this.iIiiIiiiiiiII = models;
    }

    public int iIiIiiiiIIiIi() {
        return this.IIIIiiiiiiiII;
    }

    public void ALLATORIxDEMO() {
        this.ALLATORIxDEMO(-1);
        this.iiiIiiiiiiIIi();
    }

    @Override
    public void mouseExited(MouseEvent e) {
        this.iIIiIiiiiiiIi = -1;
        this.iIiIiiiiIIiii(-1);
    }

    public int iiiIiiiiiiIIi() {
        if (this.IiIiiiiiIIIII == null) return 0;
        return this.IiIiiiiiIIIII.ALLATORIxDEMO() * this.iIiiIiiiiiiII.length;
    }

    private /* synthetic */ int ALLATORIxDEMO(int x, int y) {
        int IiiiiiiiIIIII = x / this.iiiiIiiiIiiII;
        int IiiiiiiiIIIII2 = y / this.iIiIiiiiIiIii;
        if (IiiiiiiiIIIII >= this.IiIIIiiiiIiiI) return -1;
        if (IiiiiiiiIIIII2 >= this.IIiiIiiiIIiIi) {
            return -1;
        }
        if ((x %= this.iiiiIiiiIiiII) >= this.iiIiIiiiiIIIi) return -1;
        if ((y %= this.iIiIiiiiIiIii) >= this.ALLATORIxDEMO) return -1;
        return IiiiiiiiIIIII + IiiiiiiiIIIII2 * this.IiIIIiiiiIiiI;
    }

    public boolean ALLATORIxDEMO(int page) {
        return false;
    }

    public int ALLATORIxDEMO() {
        return 0;
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        this.iIiIiiiiIIiii(this.ALLATORIxDEMO(e.getX(), e.getY()));
    }

    protected abstract void ALLATORIxDEMO(Graphics var1, RoleData var2);

    public IiIiIiiiiIIiI[] ALLATORIxDEMO() {
        return this.iIiiIiiiiiiII;
    }

    public void ALLATORIxDEMO(boolean isFrame) {
        this.IiiiiiiiIIIII = isFrame;
    }

    public void ALLATORIxDEMO(IIiiIiiiIiiiI[] btns, int type) {
        if (this.IiIiiiiiIIIII == null) {
            this.iIiIiiiiIIiii(btns, type);
            return;
        }
        this.IiIiiiiiIIIII.ALLATORIxDEMO(btns, 0);
    }

    public int iIiIiiiiIIiii() {
        return this.iiIIIiiiiiiiI;
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        this.iIiIiiiiIIiii(this.ALLATORIxDEMO(e.getX(), e.getY()));
    }

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        this.iIiIiiiiIIiii(this.ALLATORIxDEMO(e.getX(), e.getY()));
    }

    public IIiiIiiiiIIiI(IiiiIiiiiIiIi form, int bw, int bh, int bw1, int bh1, int bw2, int bh2, int px, int py) {
        this.iiIiiiiiiiIii = form;
        this.IiIIIiiiiIiiI = bw;
        this.IIiiIiiiIIiIi = bh;
        this.iiIiIiiiiIIIi = bw1;
        this.ALLATORIxDEMO = bh1;
        this.iiiiIiiiIiiII = bw1 + bw2;
        this.iIiIiiiiIiIii = bh1 + bh2;
        if (!(form instanceof IIiiiiiiIiIii)) {
            this.iiIiIiiiiIIIi -= 2;
            this.ALLATORIxDEMO -= 2;
        }
        this.iiIIIiiiiiiiI = -1;
        this.iIIiIiiiiiiIi = -1;
        this.IIIIiiiiiiiII = -1;
        this.iIiiIiiiiiiII = new IiIiIiiiiIIiI[bw * bh];
        this.addMouseListener(this);
        this.addMouseMotionListener(this);
        this.setLayout(null);
        this.setBackground(iiIIiiiiIiiII.IIiIiiiiIIiII);
        this.setBounds(px, py, this.iiiiIiiiIiiII * bw - bw2, this.iIiIiiiiIiIii * bh - bh2);
    }

    public void ALLATORIxDEMO(Image backImage) {
        this.iiiIiiiiiiiIi = backImage;
    }

    public IIIiIiiiIiIII ALLATORIxDEMO() {
        return this.IiIiiiiiIIIII;
    }

    protected abstract void ALLATORIxDEMO(RoleData var1);

    @Override
    public void mouseReleased(MouseEvent e) {
        if (e.getButton() != 3) {
            return;
        }
        if (this.iIIiIiiiiiiIi == -1) {
            return;
        }
        int IiiiiiiiIIIII = this.ALLATORIxDEMO(e.getX(), e.getY());
        if (IiiiiiiiIIIII != -1) {
            IiiiiiiiIIIII += this.iiiIiiiiiiIIi();
        }
        if (this.iIIiIiiiiiiIi != IiiiiiiiIIIII || IiiiiiiiIIIII == -1) {
            this.iIIiIiiiiiiIi = -1;
            return;
        }
        this.iIIiIiiiiiiIi = -1;
        RoleData IiiiiiiiIIIII2 = this.iiIiiiiiiiIii.ALLATORIxDEMO();
        if (IiiiiiiiIIIII2 == null) {
            return;
        }
        this.ALLATORIxDEMO(IiiiiiiiIIIII, e, IiiiiiiiIIIII2);
    }

    protected abstract void ALLATORIxDEMO(int var1, MouseEvent var2, RoleData var3);

    public void ALLATORIxDEMO(int frameIndex) {
        this.IIIIiiiiiiiII = frameIndex;
    }

    public void ALLATORIxDEMO(IiiiIiiiiIiIi form) {
        this.iiIiiiiiiiIii = form;
    }
}
