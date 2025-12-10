/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.iiIiiiiiIIiiI
 *  com.xy.a.w.iIiIiiiiIiIII
 *  com.xy.game.RoleData
 *  com.xy.q.IIiiIiiiiIIiI
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.readbean.Goodstable
 *  com.xy.readbean.RoleTxBean
 *  com.xy.w.IIIIIiiiIiiII
 *  com.xy.w.IiIiIiiiiIIiI
 */
package com.xy.q;

import com.xy.a.iiIiiiiiIIiiI;
import com.xy.a.w.iIiIiiiiIiIII;
import com.xy.game.RoleData;
import com.xy.q.IIiiIiiiiIIiI;
import com.xy.q.IiiiIiiiiIiIi;
import com.xy.readbean.Goodstable;
import com.xy.readbean.RoleTxBean;
import com.xy.w.IIIIIiiiIiiII;
import com.xy.w.IiIiIiiiiIIiI;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.math.BigDecimal;

public class IiIIIiiiiIiIi
extends IIiiIiiiiIIiI {
    private int IiiiiiiiIIIII;

    public void iIiIiiiiIIiii(Graphics g, RoleData roleData) {
        if (((iIiIiiiiIiIII)this.iiIiiiiiiiIii).iiiIiiiiiiIIi() != 3) {
            this.ALLATORIxDEMO(g);
            return;
        }
        int IiiiiiiiIIIII = this.iiiIiiiiiiIIi();
        int IiiiiiiiIIIII2 = 0;
        int IiiiiiiiIIIII3 = 0;
        while (IiiiiiiiIIIII3 < this.iIiiIiiiiiiII.length) {
            Goodstable IiiiiiiiIIIII4;
            IiiiiiiiIIIII2 = IiiiiiiiIIIII3 + IiiiiiiiIIIII;
            if (this.iiiIiiiiiiiIi != null) {
                g.drawImage(this.iiiIiiiiiiiIi, IiiiiiiiIIIII3 % this.IiIIIiiiiIiiI * this.iiiiIiiiIiiII, IiiiiiiiIIIII3 / this.IiIIIiiiiIiiI * this.iIiIiiiiIiIii, this.iiIiIiiiiIIIi + 2, this.ALLATORIxDEMO + 2, null);
            }
            BigDecimal IiiiiiiiIIIII5 = IiiiiiiiIIIII2 < roleData.wingGoodsList.size() ? (BigDecimal)roleData.wingGoodsList.get(IiiiiiiiIIIII2) : null;
            Goodstable goodstable = IiiiiiiiIIIII4 = IiiiiiiiIIIII5 != null ? roleData.getGood(IiiiiiiiIIIII5) : null;
            if (IiiiiiiiIIIII4 == null) {
                if (this.iIiiIiiiiiiII[IiiiiiiiIIIII3] != null) {
                    this.iIiiIiiiiiiII[IiiiiiiiIIIII3].ALLATORIxDEMO();
                }
            } else {
                if (this.iIiiIiiiiiiII[IiiiiiiiIIIII3] == null || IiiiiiiiIIIII4.getRgid() != this.iIiiIiiiiiiII[IiiiiiiiIIIII3].iiIIIiiiiiiiI) {
                    if (this.iIiiIiiiiiiII[IiiiiiiiIIIII3] == null) {
                        this.iIiiIiiiiiiII[IiiiiiiiIIIII3] = new IiIiIiiiiIIiI();
                    }
                    this.iIiiIiiiiiiII[IiiiiiiiIIIII3].ALLATORIxDEMO(IiiiiiiiIIIII4);
                }
                if (IiiiiiiiIIIII2 != this.iIIiIiiiiiiIi) {
                    IIIIIiiiIiiII.ALLATORIxDEMO((Graphics)g, (Image)this.iIiiIiiiiiiII[IiiiiiiiIIIII3].ALLATORIxDEMO, (int)(IiiiiiiiIIIII3 % this.IiIIIiiiiIiiI * this.iiiiIiiiIiiII + 1), (int)(IiiiiiiiIIIII3 / this.IiIIIiiiiIiiI * this.iIiIiiiiIiIii + 1), (int)this.iiIiIiiiiIIIi, (int)this.ALLATORIxDEMO);
                } else {
                    IIIIIiiiIiiII.ALLATORIxDEMO((Graphics)g, (Image)this.iIiiIiiiiiiII[IiiiiiiiIIIII3].ALLATORIxDEMO, (int)(IiiiiiiiIIIII3 % this.IiIIIiiiiIiiI * this.iiiiIiiiIiiII + 2), (int)(IiiiiiiiIIIII3 / this.IiIIIiiiiIiiI * this.iIiIiiiiIiIii + 2), (int)this.iiIiIiiiiIIIi, (int)this.ALLATORIxDEMO);
                }
                if (this.IiiiiiiiIIIII != 0 && IiiiiiiiIIIII2 == this.IIIIiiiiiiiII) {
                    g.setColor(Color.red);
                    g.drawRect(IiiiiiiiIIIII3 % this.IiIIIiiiiIiiI * this.iiiiIiiiIiiII + 1, IiiiiiiiIIIII3 / this.IiIIIiiiiIiiI * this.iIiIiiiiIiIii + 1, this.iiIiIiiiiIIIi, this.ALLATORIxDEMO);
                    g.drawRect(IiiiiiiiIIIII3 % this.IiIIIiiiiIiiI * this.iiiiIiiiIiiII + 2, IiiiiiiiIIIII3 / this.IiIIIiiiiIiiI * this.iIiIiiiiIiIii + 2, this.iiIiIiiiiIIIi - 2, this.ALLATORIxDEMO - 2);
                    g.setColor(Color.white);
                }
            }
            ++IiiiiiiiIIIII3;
        }
    }

    protected void iIiIiiiiIIiii(int choseIndex, MouseEvent e, RoleData roleData) {
    }

    /*
     * WARNING - void declaration
     */
    protected void ALLATORIxDEMO(int choseIndex, MouseEvent e, RoleData roleData) {
        void IiiiiiiiIIIII;
        if (this.IiiiiiiiIIIII != 5) return;
        IiIiIiiiiIIiI IiiiiiiiIIIII2 = this.iIiiIiiiiiiII[choseIndex - this.iiiIiiiiiiIIi()];
        if (IiiiiiiiIIIII2 == null) return;
        if (IiiiiiiiIIIII2.iIiIiiiiIiIii == 0) {
            return;
        }
        iIiIiiiiIiIII iIiIiiiiIiIII2 = (iIiIiiiiIiIII)this.iiIiiiiiiiIii;
        iIiIiiiiIiIII2.ALLATORIxDEMO(IiiiiiiiIIIII2.iiIIIiiiiiiiI, IiiiiiiiIIIII.iiiIiiiiiiIIi());
    }

    protected void ALLATORIxDEMO(Graphics g, RoleData roleData) {
        if (this.IiiiiiiiIIIII == 5) {
            this.iIiIiiiiIIiii(g, roleData);
            return;
        }
        if (this.IiiiiiiiIIIII != 6) return;
        this.ALLATORIxDEMO(g);
    }

    protected void ALLATORIxDEMO(RoleData roleData) {
        Goodstable IiiiiiiiIIIII;
        if (this.IiiiiiiiIIIII != 5) return;
        int IiiiiiiiIIIII2 = ((iIiIiiiiIiIII)this.iiIiiiiiiiIii).iiiIiiiiiiIIi();
        if (IiiiiiiiIIIII2 < 0) {
            return;
        }
        if (IiiiiiiiIIIII2 != 3) {
            IiIiIiiiiIIiI IiiiiiiiIIIII3 = this.iIiiIiiiiiiII[this.iiIIIiiiiiiiI];
            if (IiiiiiiiIIIII3 == null) return;
            if (IiiiiiiiIIIII3.iIiIiiiiIiIii != 7) {
                return;
            }
            RoleTxBean IiiiiiiiIIIII4 = this.iiIiiiiiiiIii.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII3.iiIIIiiiiiiiI.intValue());
            iiIiiiiiIIiiI IiiiiiiiIIIII5 = (iiIiiiiiIIiiI)this.iiIiiiiiiiIii.ALLATORIxDEMO().iiiIiiiiiiIIi(46);
            IiiiiiiiIIIII5.ALLATORIxDEMO(IiiiiiiiIIIII4);
            return;
        }
        int IiiiiiiiIIIII6 = this.iiIIIiiiiiiiI + this.iiiIiiiiiiIIi();
        BigDecimal IiiiiiiiIIIII7 = IiiiiiiiIIIII6 < roleData.wingGoodsList.size() ? (BigDecimal)roleData.wingGoodsList.get(IiiiiiiiIIIII6) : null;
        Goodstable goodstable = IiiiiiiiIIIII = IiiiiiiiIIIII7 != null ? roleData.getGood(IiiiiiiiIIIII7) : null;
        if (IiiiiiiiIIIII == null) {
            return;
        }
        ((iiIiiiiiIIiiI)this.iiIiiiiiiiIii.ALLATORIxDEMO().iiiIiiiiiiIIi(46)).ALLATORIxDEMO(IiiiiiiiIIIII, false);
    }

    public void ALLATORIxDEMO(Graphics g) {
        int IiiiiiiiIIIII = this.iiiIiiiiiiIIi();
        int IiiiiiiiIIIII2 = 0;
        int IiiiiiiiIIIII3 = 0;
        while (IiiiiiiiIIIII3 < this.iIiiIiiiiiiII.length) {
            IiiiiiiiIIIII2 = IiiiiiiiIIIII3 + IiiiiiiiIIIII;
            if (this.iiiIiiiiiiiIi != null) {
                g.drawImage(this.iiiIiiiiiiiIi, IiiiiiiiIIIII3 % this.IiIIIiiiiIiiI * this.iiiiIiiiIiiII, IiiiiiiiIIIII3 / this.IiIIIiiiiIiiI * this.iIiIiiiiIiIii, this.iiIiIiiiiIIIi + 2, this.ALLATORIxDEMO + 2, null);
            }
            if (this.iIiiIiiiiiiII[IiiiiiiiIIIII3] != null && this.iIiiIiiiiiiII[IiiiiiiiIIIII3].iIiIiiiiIiIii == 7) {
                if (IiiiiiiiIIIII2 != this.iIIiIiiiiiiIi) {
                    IIIIIiiiIiiII.ALLATORIxDEMO((Graphics)g, (Image)this.iIiiIiiiiiiII[IiiiiiiiIIIII3].ALLATORIxDEMO, (int)(IiiiiiiiIIIII3 % this.IiIIIiiiiIiiI * this.iiiiIiiiIiiII + 1), (int)(IiiiiiiiIIIII3 / this.IiIIIiiiiIiiI * this.iIiIiiiiIiIii + 1), (int)this.iiIiIiiiiIIIi, (int)this.ALLATORIxDEMO);
                } else {
                    IIIIIiiiIiiII.ALLATORIxDEMO((Graphics)g, (Image)this.iIiiIiiiiiiII[IiiiiiiiIIIII3].ALLATORIxDEMO, (int)(IiiiiiiiIIIII3 % this.IiIIIiiiiIiiI * this.iiiiIiiiIiiII + 2), (int)(IiiiiiiiIIIII3 / this.IiIIIiiiiIiiI * this.iIiIiiiiIiIii + 2), (int)this.iiIiIiiiiIIIi, (int)this.ALLATORIxDEMO);
                }
            }
            ++IiiiiiiiIIIII3;
        }
    }

    protected void iIiIiiiiIIiii() {
        this.iiIiiiiiiiIii.ALLATORIxDEMO().iiiIiiiiiiIIi(46);
    }

    public IiIIIiiiiIiIi(int type, IiiiIiiiiIiIi form, int bw, int bh, int bw1, int bh1, int bw2, int bh2, int px, int py) {
        super(form, bw, bh, bw1, bh1, bw2, bh2, px, py);
        this.IiiiiiiiIIIII = type;
    }

    /*
     * Unable to fully structure code
     */
    public boolean ALLATORIxDEMO(int page) {
        block9: {
            if (this.IiiiiiiiIIIII != 5) return false;
            IiiiiiiiIIIII = this.iiIiiiiiiiIii.ALLATORIxDEMO();
            if (IiiiiiiiIIIII == null) {
                return false;
            }
            IiiiiiiiIIIII = ((iIiIiiiiIiIII)this.iiIiiiiiiiIii).iiiIiiiiiiIIi();
            if (IiiiiiiiIIIII < 0) {
                return false;
            }
            if (IiiiiiiiIIIII == 3) break block9;
            IiiiiiiiIIIII = page * this.IiIIIiiiiIiiI * this.IIiiIiiiIIiIi;
            IiiiiiiiIIIII = IiiiiiiiIIIII.getPackRecord().getTX(IiiiiiiiIIIII + 1, this.iiIiiiiiiiIii.ALLATORIxDEMO());
            if (IiiiiiiiIIIII >= IiiiiiiiIIIII.size() && page != 0) {
                return false;
            }
            IiiiiiiiIIIII = 0;
            if (true) ** GOTO lbl22
        }
        IiiiiiiiIIIII = 0;
        if (true) ** GOTO lbl39
        do {
            if (this.iIiiIiiiiiiII[IiiiiiiiIIIII] != null) {
                this.iIiiIiiiiiiII[IiiiiiiiIIIII].ALLATORIxDEMO();
            }
            ++IiiiiiiiIIIII;
lbl22:
            // 2 sources

        } while (IiiiiiiiIIIII < this.iIiiIiiiiiiII.length);
        IiiiiiiiIIIII = 0;
        IiiiiiiiIIIII = (page + 1) * this.IiIIIiiiiIiiI * this.IIiiIiiiIIiIi;
        if (true) ** GOTO lbl32
        do {
            IiiiiiiiIIIII = (RoleTxBean)IiiiiiiiIIIII.get(IiiiiiiiIIIII);
            if (this.iIiiIiiiiiiII[IiiiiiiiIIIII] == null) {
                this.iIiiIiiiiiiII[IiiiiiiiIIIII] = new IiIiIiiiiIIiI();
            }
            this.iIiiIiiiiiiII[IiiiiiiiIIIII++].ALLATORIxDEMO(IiiiiiiiIIIII);
            ++IiiiiiiiIIIII;
lbl32:
            // 2 sources

            if (IiiiiiiiIIIII >= IiiiiiiiIIIII) return true;
        } while (IiiiiiiiIIIII < IiiiiiiiIIIII.size());
        return true;
        do {
            if (this.iIiiIiiiiiiII[IiiiiiiiIIIII] != null) {
                this.iIiiIiiiiiiII[IiiiiiiiIIIII].ALLATORIxDEMO();
            }
            ++IiiiiiiiIIIII;
lbl39:
            // 2 sources

        } while (IiiiiiiiIIIII < this.iIiiIiiiiiiII.length);
        if (page == 0) return true;
        if (page * this.IiIIIiiiiIiiI * this.IIiiIiiiIIiIi < IiiiiiiiIIIII.wingGoodsList.size()) return true;
        return false;
    }

    public int ALLATORIxDEMO() {
        int IiiiiiiiIIIII = this.IiIIIiiiiIiiI * this.IIiiIiiiIIiIi;
        if (this.IiiiiiiiIIIII != 5) return 0;
        RoleData IiiiiiiiIIIII2 = this.iiIiiiiiiiIii.ALLATORIxDEMO();
        if (IiiiiiiiIIIII2 == null) {
            return 0;
        }
        int IiiiiiiiIIIII3 = ((iIiIiiiiIiIII)this.iiIiiiiiiiIii).iiiIiiiiiiIIi();
        if (IiiiiiiiIIIII3 < 0) {
            return 0;
        }
        if (IiiiiiiiIIIII3 == 3) return (IiiiiiiiIIIII2.wingGoodsList.size() - 1) / IiiiiiiiIIIII;
        return (IiiiiiiiIIIII2.getPackRecord().getTX(IiiiiiiiIIIII3 + 1, this.iiIiiiiiiiIii.ALLATORIxDEMO()).size() - 1) / IiiiiiiiIIIII;
    }
}
