/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.v.IiiiIiiiiIIII
 *  com.xy.bean.UseCardBean
 *  com.xy.i.iiIiIiiiIIIiI
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.richtext.RichLabel
 *  com.xy.text.GameView
 *  com.xy.v.iiIiIiiiiIiii
 *  com.xy.w.IIIiiiiiIiIiI
 */
package com.xy.a.v;

import com.xy.a.v.IiiiIiiiiIIII;
import com.xy.bean.UseCardBean;
import com.xy.i.iiIiIiiiIIIiI;
import com.xy.q.IiiiIiiiiIiIi;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.richtext.RichLabel;
import com.xy.text.GameView;
import com.xy.v.iiIiIiiiiIiii;
import com.xy.w.IIIiiiiiIiIiI;
import java.awt.Component;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class IiiIiiiiIIIiI
extends IiiiIiiiiIiIi {
    private RichLabel iIiIiiiiIiIii;
    private List<iiIiIiiiIIIiI> IiIIIiiiiIiiI;
    private IiiiIiiiiIIII iiIiiiiiiiIii;
    private int IiiiiiiiIIIII = 21;
    private IIIiiiiiIiIiI[] ALLATORIxDEMO;

    public IiiIiiiiIIIiI(GameView gameView) {
        super(-1, -1, IiiiIiiiiIiIi.iIIiIiiiiiiIi, gameView);
        this.ALLATORIxDEMO(0, 0, 745, 452, IiiiIiiiiIiIi.iIIiIiiiiiiIi);
        this.IiIIIiiiiIiiI = new ArrayList<iiIiIiiiIIIiI>();
        iiIiIiiiIIIiI IiiiiiiiIIIII = new iiIiIiiiIIIiI("sc/e/153.png", 2, 21, iiIIiiiiIiiII.iiiiIiiiIiiII, null, "等级礼包", (IiiiIiiiiIiIi)this);
        IiiiiiiiIIIII.setBounds(91, 72, 104, 28);
        IiiiiiiiIIIII.setForeground(iiIIiiiiIiiII.ALLATORIxDEMO((String)"#c523425"));
        this.IiIIIiiiiIiiI.add(IiiiiiiiIIIII);
        this.add((Component)IiiiiiiiIIIII);
        this.iIiIiiiiIiIii = new RichLabel("", iiIIiiiiIiiII.IIiiiiiiiIIIi);
        this.iIiIiiiiIiIii.setBounds(204 + (498 - this.iIiIiiiiIiIii.getWidth()) / 2, 120, this.iIiIiiiiIiIii.getWidth(), this.iIiIiiiiIiIii.getHeight());
        this.add((Component)this.iIiIiiiiIiIii);
        this.ALLATORIxDEMO = new IIIiiiiiIiIiI[4];
        int IiiiiiiiIIIII2 = 0;
        while (IiiiiiiiIIIII2 < this.ALLATORIxDEMO.length) {
            this.ALLATORIxDEMO[IiiiiiiiIIIII2] = new IIIiiiiiIiIiI();
            if (IiiiiiiiIIIII2 == 0) {
                this.ALLATORIxDEMO[IiiiiiiiIIIII2].iIiIiiiiIIiii("sc/d/96.png");
                this.ALLATORIxDEMO[IiiiiiiiIIIII2].setBounds(203, 51, 499, 97);
            } else if (IiiiiiiiIIIII2 == 1) {
                this.ALLATORIxDEMO[IiiiiiiiIIIII2].iIiIiiiiIIiii("sc/d/98.png");
                this.ALLATORIxDEMO[IiiiiiiiIIIII2].setBounds(206, 123, 492, 21);
            } else if (IiiiiiiiIIIII2 == 2) {
                this.ALLATORIxDEMO[IiiiiiiiIIIII2].iIiIiiiiIIiii("sc/d/97.png");
                this.ALLATORIxDEMO[IiiiiiiiIIIII2].setBounds(207, 55, 491, 89);
            } else if (IiiiiiiiIIIII2 == 3) {
                this.ALLATORIxDEMO[IiiiiiiiIIIII2].iIiIiiiiIIiii("sc/d/101.png");
                this.ALLATORIxDEMO[IiiiiiiiIIIII2].setBounds(202, 136, 499, 310);
            }
            this.add((Component)this.ALLATORIxDEMO[IiiiiiiiIIIII2++]);
        }
    }

    public void iIiIiiiiIIiIi() {
        this.iiiiIiiiIiiII = true;
    }

    /*
     * WARNING - void declaration
     */
    public int ALLATORIxDEMO(int id) {
        boolean IiiiiiiiIIIII = false;
        UseCardBean IiiiiiiiIIIII2 = this.ALLATORIxDEMO().getLimit("限时礼包");
        List IiiiiiiiIIIII3 = IiiiiiiiIIIII2 != null ? IiiiiiiiIIIII2.getKeysByActivity() : null;
        int IiiiiiiiIIIII4 = this.IiIIIiiiiIiiI.size() - 1;
        while (IiiiiiiiIIIII4 >= 0) {
            iiIiIiiiIIIiI IiiiiiiiIIIII5 = this.IiIIIiiiiIiiI.get(IiiiiiiiIIIII4);
            if (!this.ALLATORIxDEMO(IiiiiiiiIIIII5.iIiIiiiiIIiii(), IiiiiiiiIIIII3)) {
                this.remove((Component)IiiiiiiiIIIII5);
                this.IiIIIiiiiIiiI.remove(IiiiiiiiIIIII4);
                IiiiiiiiIIIII = true;
            }
            --IiiiiiiiIIIII4;
        }
        IiiiiiiiIIIII4 = 0;
        int IiiiiiiiIIIII6 = IiiiiiiiIIIII3 != null ? IiiiiiiiIIIII3.size() : 0;
        while (IiiiiiiiIIIII4 < IiiiiiiiIIIII6) {
            iiIiIiiiiIiii IiiiiiiiIIIII7 = (iiIiIiiiiIiii)IiiiiiiiIIIII3.get(IiiiiiiiIIIII4);
            IiiiiiiiIIIII7 = this.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII7.IiiiiiiiIIIII);
            if (IiiiiiiiIIIII7 != null && !this.ALLATORIxDEMO((int)IiiiiiiiIIIII7.ALLATORIxDEMO)) {
                void IiiiiiiiIIIII8;
                iiIiIiiiIIIiI iiIiIiiiIIIiI2 = new iiIiIiiiIIIiI("sc/e/153.png", 2, (int)IiiiiiiiIIIII7.ALLATORIxDEMO, iiIIiiiiIiiII.iiiiIiiiIiiII, null, IiiiiiiiIIIII7.IiiiiiiiIIIII, (IiiiIiiiiIiIi)this);
                IiiiiiiiIIIII8.setForeground(iiIIiiiiIiiII.ALLATORIxDEMO((String)"#c523425"));
                this.IiIIIiiiiIiiI.add((iiIiIiiiIIIiI)IiiiiiiiIIIII8);
                this.add((Component)IiiiiiiiIIIII8);
                IiiiiiiiIIIII = true;
            }
            ++IiiiiiiiIIIII4;
        }
        if (!this.ALLATORIxDEMO(id)) {
            id = 21;
            for (iiIiIiiiIIIiI IiiiiiiiIIIII9 : this.IiIIIiiiiIiiI) {
                if (IiiiiiiiIIIII9.iIiIiiiiIIiii() == 21) continue;
                id = IiiiiiiiIIIII9.iIiIiiiiIIiii();
                break;
            }
        }
        if (!IiiiiiiiIIIII) return id;
        int IiiiiiiiIIIII10 = 0;
        for (iiIiIiiiIIIiI IiiiiiiiIIIII11 : this.IiIIIiiiiIiiI) {
            int n = 72 + 40 * IiiiiiiiIIIII10;
            ++IiiiiiiiIIIII10;
            IiiiiiiiIIIII11.setBounds(91, n, 104, 28);
        }
        return id;
    }

    public void iiiIiiiiiiIIi() {
        this.iIiIiiiiIIiIi();
    }

    public void iIiIiiiiIIiii(int id) {
        this.IiiiiiiiIIIII = this.ALLATORIxDEMO(id);
        for (iiIiIiiiIIIiI iiIiIiiiIIIiI2 : this.IiIIIiiiiIiiI) {
            iiIiIiiiIIIiI2.setKeep(iiIiIiiiIIIiI2.iIiIiiiiIIiii() == this.IiiiiiiiIIIII);
        }
        if (this.iiIiiiiiiiIii == null) {
            this.iiIiiiiiiiIii = new IiiiIiiiiIIII((IiiiIiiiiIiIi)this);
            this.add((Component)this.iiIiiiiiiiIii, 0);
        }
        this.iiIiiiiiiiIii.ALLATORIxDEMO(this.IiiiiiiiIIIII);
    }

    public boolean ALLATORIxDEMO(int id) {
        Iterator<iiIiIiiiIIIiI> iterator = this.IiIIIiiiiIiiI.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().iIiIiiiiIIiii() != id) continue;
            return true;
        }
        return false;
    }

    public void paint(Graphics g) {
        if (this.iiiiIiiiIiiII) {
            this.iIiIiiiiIIiii(this.IiiiiiiiIIIII);
        }
        super.paint(g);
    }

    public boolean ALLATORIxDEMO(int id, List<iiIiIiiiiIiii> keys) {
        if (id == 21) {
            return true;
        }
        if (keys == null) {
            return false;
        }
        Iterator<iiIiIiiiiIiii> iterator = keys.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().ALLATORIxDEMO != (long)id) continue;
            return true;
        }
        return false;
    }

    public RichLabel ALLATORIxDEMO() {
        return this.iIiIiiiiIiIii;
    }
}
