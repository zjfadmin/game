/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.v.IiiIiiiiIIIIi
 *  com.xy.a.v.IiiIiiiiIiIIi
 *  com.xy.a.v.IiiiIiiiiIIII
 *  com.xy.formula.ActivityMenuSet2
 *  com.xy.i.iiIiIiiiIIIiI
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.readbean.Activity
 *  com.xy.richtext.RichLabel
 *  com.xy.text.GameView
 *  com.xy.v.iIiIIiiiIiiiI
 *  com.xy.w.IIIiiiiiIiIiI
 */
package com.xy.a.v;

import com.xy.a.v.IiiIiiiiIIIIi;
import com.xy.a.v.IiiIiiiiIiIIi;
import com.xy.a.v.IiiiIiiiiIIII;
import com.xy.formula.ActivityMenuSet2;
import com.xy.i.iiIiIiiiIIIiI;
import com.xy.q.IiiiIiiiiIiIi;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.readbean.Activity;
import com.xy.richtext.RichLabel;
import com.xy.text.GameView;
import com.xy.v.iIiIIiiiIiiiI;
import com.xy.w.IIIiiiiiIiIiI;
import java.awt.Component;
import java.awt.Graphics;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class iiIiiiiiIIiiI
extends IiiiIiiiiIiIi {
    private iiIiIiiiIIIiI[] iiiIiiiiiiiIi;
    private IiiIiiiiIiIIi iIiiIiiiiiiII;
    private int IIiiIiiiIIiIi;
    private IiiIiiiiIIIIi iIiIiiiiIiIii;
    private IIIiiiiiIiIiI[] IiIIIiiiiIiiI;
    private IiiiIiiiiIIII iiIiiiiiiiIii;
    private RichLabel IiiiiiiiIIIII;
    private Activity ALLATORIxDEMO;

    public Activity ALLATORIxDEMO() {
        return this.ALLATORIxDEMO;
    }

    public void iIiIiiiiIIiii(int key) {
        this.IIiiIiiiIIiIi = key;
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iiiIiiiiiiiIi.length) {
            this.iiiIiiiiiiiIi[IiiiiiiiIIIII].setKeep(key == IiiiiiiiIIIII);
            ++IiiiiiiiIIIII;
        }
        ActivityMenuSet2 IiiiiiiiIIIII2 = this.ALLATORIxDEMO.getMenuSet2s()[key];
        if (IiiiiiiiIIIII2.getId() == 1 || IiiiiiiiIIIII2.getId() == 3 || IiiiiiiiIIIII2.getId() == 4) {
            if (this.iiIiiiiiiiIii == null) {
                this.iiIiiiiiiiIii = new IiiiIiiiiIIII((IiiiIiiiiIiIi)this);
                this.add((Component)this.iiIiiiiiiiIii, 0);
            }
            this.iiIiiiiiiiIii.ALLATORIxDEMO(this.ALLATORIxDEMO, IiiiiiiiIIIII2);
            this.iiIiiiiiiiIii.setVisible(true);
            if (this.iIiiIiiiiiiII != null) {
                this.iIiiIiiiiiiII.setVisible(false);
            }
            if (this.iIiIiiiiIiIii == null) return;
            this.iIiIiiiiIiIii.setVisible(false);
            return;
        }
        if (IiiiiiiiIIIII2.getId() == 2) {
            if (this.iIiiIiiiiiiII == null) {
                this.iIiiIiiiiiiII = new IiiIiiiiIiIIi((IiiiIiiiiIiIi)this);
                this.add((Component)this.iIiiIiiiiiiII, 0);
            }
            this.iIiiIiiiiiiII.ALLATORIxDEMO(this.ALLATORIxDEMO, IiiiiiiiIIIII2);
            this.iIiiIiiiiiiII.setVisible(true);
            if (this.iiIiiiiiiiIii != null) {
                this.iiIiiiiiiiIii.setVisible(false);
            }
            if (this.iIiIiiiiIiIii == null) return;
            this.iIiIiiiiIiIii.setVisible(false);
            return;
        }
        if (IiiiiiiiIIIII2.getId() != 5) return;
        if (this.iIiIiiiiIiIii == null) {
            this.iIiIiiiiIiIii = new IiiIiiiiIIIIi((IiiiIiiiiIiIi)this);
            this.add((Component)this.iIiIiiiiIiIii, 0);
        }
        this.iIiIiiiiIiIii.ALLATORIxDEMO(this.ALLATORIxDEMO, IiiiiiiiIIIII2);
        this.iIiIiiiiIiIii.setVisible(true);
        if (this.iiIiiiiiiiIii != null) {
            this.iiIiiiiiiiIii.setVisible(false);
        }
        if (this.iIiiIiiiiiiII == null) return;
        this.iIiiIiiiiiiII.setVisible(false);
    }

    public void IiiIiiiiiiIiI() {
        this.iiiIiiiiiiIIi();
    }

    public iiIiiiiiIIiiI(Activity activity, GameView gameView) {
        super(-1, -1, IiiiIiiiiIiIi.iIIiIiiiiiiIi, gameView);
        this.ALLATORIxDEMO(0, 0, 745, 452, IiiiIiiiiIiIi.iIIiIiiiiiiIi);
        this.ALLATORIxDEMO = activity;
        ActivityMenuSet2[] IiiiiiiiIIIII = activity.getMenuSet2s();
        this.iiiIiiiiiiiIi = new iiIiIiiiIIIiI[IiiiiiiiIIIII.length];
        int IiiiiiiiIIIII2 = 0;
        while (IiiiiiiiIIIII2 < this.iiiIiiiiiiiIi.length) {
            ActivityMenuSet2 IiiiiiiiIIIII3 = IiiiiiiiIIIII[IiiiiiiiIIIII2];
            this.iiiIiiiiiiiIi[IiiiiiiiIIIII2] = new iiIiIiiiIIIiI("sc/e/153.png", 2, 31, iiIIiiiiIiiII.iiiiIiiiIiiII, null, IiiiiiiiIIIII3.getKey(), (IiiiIiiiiIiIi)this);
            this.iiiIiiiiiiiIi[IiiiiiiiIIIII2].iIiIiiiiIIiii(IiiiiiiiIIIII2);
            this.iiiIiiiiiiiIi[IiiiiiiiIIIII2].setBounds(91, 72 + 40 * IiiiiiiiIIIII2, 104, 28);
            this.iiiIiiiiiiiIi[IiiiiiiiIIIII2].setForeground(iiIIiiiiIiiII.ALLATORIxDEMO((String)"#c523425"));
            this.add((Component)this.iiiIiiiiiiiIi[IiiiiiiiIIIII2++]);
        }
        this.IiiiiiiiIIIII = new RichLabel("", iiIIiiiiIiiII.IIiiiiiiiIIIi);
        this.IiiiiiiiIIIII.setBounds(204 + (498 - this.IiiiiiiiIIIII.getWidth()) / 2, 120, this.IiiiiiiiIIIII.getWidth(), this.IiiiiiiiIIIII.getHeight());
        this.add((Component)this.IiiiiiiiIIIII);
        this.IiIIIiiiiIiiI = new IIIiiiiiIiIiI[4];
        IiiiiiiiIIIII2 = 0;
        while (IiiiiiiiIIIII2 < this.IiIIIiiiiIiiI.length) {
            this.IiIIIiiiiIiiI[IiiiiiiiIIIII2] = new IIIiiiiiIiIiI();
            if (IiiiiiiiIIIII2 == 0) {
                this.IiIIIiiiiIiiI[IiiiiiiiIIIII2].iIiIiiiiIIiii("sc/d/96.png");
                this.IiIIIiiiiIiiI[IiiiiiiiIIIII2].setBounds(203, 51, 499, 97);
            } else if (IiiiiiiiIIIII2 == 1) {
                this.IiIIIiiiiIiiI[IiiiiiiiIIIII2].iIiIiiiiIIiii("sc/d/98.png");
                this.IiIIIiiiiIiiI[IiiiiiiiIIIII2].setBounds(206, 123, 492, 21);
            } else if (IiiiiiiiIIIII2 == 2) {
                this.IiIIIiiiiIiiI[IiiiiiiiIIIII2].iIiIiiiiIIiii("sc/d/97.png");
                this.IiIIIiiiiIiiI[IiiiiiiiIIIII2].setBounds(207, 55, 491, 89);
            } else if (IiiiiiiiIIIII2 == 3) {
                this.IiIIIiiiiIiiI[IiiiiiiiIIIII2].iIiIiiiiIIiii("sc/d/101.png");
                this.IiIIIiiiiIiiI[IiiiiiiiIIIII2].setBounds(202, 136, 499, 310);
            }
            this.add((Component)this.IiIIIiiiiIiiI[IiiiiiiiIIIII2++]);
        }
    }

    public void iIiIiiiiIIiIi() {
        int IiiiiiiiIIIII = (int)Math.max(0L, (this.ALLATORIxDEMO.getTimeEnd() - iIiIIiiiIiiiI.iIiIiiiiIIiii()) / 60000L);
        StringBuffer IiiiiiiiIIIII2 = new StringBuffer();
        IiiiiiiiIIIII2.append("#Z#W\u6d3b\u52a8\u65f6\u95f4\uff1a\u4ec5\u5269");
        if (IiiiiiiiIIIII > 1440) {
            IiiiiiiiIIIII2.append("#Y");
            IiiiiiiiIIIII2.append(IiiiiiiiIIIII / 1440);
            IiiiiiiiIIIII2.append("#W\u5929");
            IiiiiiiiIIIII %= 1440;
        }
        if (IiiiiiiiIIIII > 60) {
            IiiiiiiiIIIII2.append("#Y");
            IiiiiiiiIIIII2.append(IiiiiiiiIIIII / 60);
            IiiiiiiiIIIII2.append("#W\u5c0f\u65f6");
            IiiiiiiiIIIII %= 60;
        }
        IiiiiiiiIIIII2.append("#Y");
        IiiiiiiiIIIII2.append(IiiiiiiiIIIII);
        IiiiiiiiIIIII2.append("#W\u5206\u949f");
        if (!this.IiiiiiiiIIIII.isTextSize(IiiiiiiiIIIII2.toString(), 498)) return;
        this.IiiiiiiiIIIII.setBounds(204 + (498 - this.IiiiiiiiIIIII.getWidth()) / 2, 120, this.IiiiiiiiIIIII.getWidth(), this.IiiiiiiiIIIII.getHeight());
    }

    public IiiIiiiiIiIIi ALLATORIxDEMO() {
        return this.iIiiIiiiiiiII;
    }

    protected void paintComponent(Graphics g) {
        if (this.iiIIiiiiIiIIi.iIiIiiiiIIiii()) {
            this.iIiIiiiiIIiIi();
        }
        super.paintComponent(g);
    }

    public IiiIiiiiIIIIi ALLATORIxDEMO() {
        return this.iIiIiiiiIiIii;
    }

    public int iiiIiiiiiiIIi() {
        return this.ALLATORIxDEMO.getId();
    }

    public void iiiIiiiiiiIIi() {
        this.iiiiIiiiIiiII = true;
    }

    public void paint(Graphics g) {
        if (this.iiiiIiiiIiiII) {
            this.iIiIiiiiIIiii(this.IIiiIiiiIIiIi);
        }
        super.paint(g);
    }

    public IiiiIiiiiIIII ALLATORIxDEMO() {
        return this.iiIiiiiiiiIii;
    }
}
