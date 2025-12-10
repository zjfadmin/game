/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.a.IIIIIiiiIiIii
 *  com.xy.a.a.iIiIIiiiIiiiI
 *  com.xy.a.a.iiiiiiiiiiIiI
 *  com.xy.a.iiIiiiiiIIiiI
 *  com.xy.formula.GoodType
 *  com.xy.game.RoleData
 *  com.xy.q.IIiiIiiiiIIiI
 *  com.xy.q.IiiIiiiiIIIii
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.readbean.Goodstable
 *  com.xy.socket.GameClient
 *  com.xy.socket.ParamTool
 *  com.xy.v.iiIiIiiiIIIiI
 *  com.xy.w.IIIIIiiiIiiII
 *  com.xy.w.IIiIiiiiIiiIi
 *  com.xy.w.IiIiIiiiiIIiI
 */
package com.xy.q;

import com.xy.a.a.IIIIIiiiIiIii;
import com.xy.a.a.iIiIIiiiIiiiI;
import com.xy.a.a.iiiiiiiiiiIiI;
import com.xy.a.iiIiiiiiIIiiI;
import com.xy.formula.GoodType;
import com.xy.game.RoleData;
import com.xy.q.IIiiIiiiiIIiI;
import com.xy.q.IiiIiiiiIIIii;
import com.xy.q.IiiiIiiiiIiIi;
import com.xy.readbean.Goodstable;
import com.xy.socket.GameClient;
import com.xy.socket.ParamTool;
import com.xy.v.iiIiIiiiIIIiI;
import com.xy.w.IIIIIiiiIiiII;
import com.xy.w.IIiIiiiiIiiIi;
import com.xy.w.IiIiIiiiiIIiI;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.util.List;
import javax.swing.JTextField;
import javax.swing.text.BadLocationException;

public class IIiIiiiiIIiii
extends IIiiIiiiiIIiI {
    protected void iIiIiiiiIIiii(int choseIndex, MouseEvent e, RoleData roleData) {
        Goodstable IiiiiiiiIIIII = roleData.getStarCardGood(choseIndex);
        if (this.iiIiiiiiiiIii instanceof iIiIIiiiIiiiI) {
            if (IiiiiiiiIIIII == null) {
                return;
            }
            if (e.isShiftDown()) {
                try {
                    JTextField IiiiiiiiIIIII2 = this.iiIiiiiiiiIii.iiIIiiiiIiIIi.getBaseView().ALLATORIxDEMO();
                    ((IiiIiiiiIIIii)IiiiiiiiIIIII2.getDocument()).ALLATORIxDEMO(IiiiiiiiIIIII2.getCaretPosition(), 2, IiiiiiiiIIIII.getRgid(), "[" + IiiiiiiiIIIII.getGoodsname() + "]", "G", null);
                    return;
                }
                catch (BadLocationException IiiiiiiiIIIII3) {
                    IiiiiiiiIIIII3.printStackTrace();
                    return;
                }
            }
            if (this.iiIiiiiiiiIii.iiIIiiiiIiIIi.getMouseIndex() == iiIiIiiiIIIiI.iiIIIiiiiiiiI) {
                if (IiiiiiiiIIIII.getGoodlock() == 1) {
                    this.iiIiiiiiiiIii.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u8be5\u7269\u54c1\u5df2\u52a0\u9501");
                    return;
                }
                if (GoodType.ALLATORIxDEMO((Long)IiiiiiiiIIIII.getType())) {
                    this.iiIiiiiiiiIii.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u8be5\u7269\u54c1\u65e0\u6cd5\u52a0\u9501");
                    return;
                }
                IiiiiiiiIIIII.setGoodlock(1);
                ParamTool.ALLATORIxDEMO((Goodstable)IiiiiiiiIIIII, (int)0, (GameClient)this.iiIiiiiiiiIii.iiIIiiiiIiIIi.getClient());
                this.iiIiiiiiiiIii.iiIIiiiiIiIIi.setMouseIndex(iiIiIiiiIIIiI.IiIIIiiiiIiiI);
                this.iiIiiiiiiiIii.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u52a0\u9501\u6210\u529f");
                return;
            }
            if (this.iiIiiiiiiiIii.iiIIiiiiIiIIi.getMouseIndex() != iiIiIiiiIIIiI.iiiIiiiiiiiIi) {
                ((iIiIIiiiIiiiI)this.iiIiiiiiiiIii).ALLATORIxDEMO(IiiiiiiiIIIII);
                return;
            }
            if (IiiiiiiiIIIII.getGoodlock() == 0) {
                this.iiIiiiiiiiIii.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u8be5\u7269\u54c1\u672a\u52a0\u9501");
                return;
            }
            IiiiiiiiIIIII.setGoodlock(0);
            ParamTool.ALLATORIxDEMO((Goodstable)IiiiiiiiIIIII, (int)0, (GameClient)this.iiIiiiiiiiIii.iiIIiiiiIiIIi.getClient());
            this.iiIiiiiiiiIii.iiIIiiiiIiIIi.setMouseIndex(iiIiIiiiIIIiI.IiIIIiiiiIiiI);
            this.iiIiiiiiiiIii.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u89e3\u9501\u6210\u529f");
            return;
        }
        if (this.iiIiiiiiiiIii instanceof IIIIIiiiIiIii) {
            if (IiiiiiiiIIIII == null) {
                return;
            }
            ((IIIIIiiiIiIii)this.iiIiiiiiiiIii).ALLATORIxDEMO(IiiiiiiiIIIII.getRgid());
            return;
        }
        if (!(this.iiIiiiiiiiIii instanceof iiiiiiiiiiIiI)) return;
        if (IiiiiiiiIIIII == null) {
            return;
        }
        ((iiiiiiiiiiIiI)this.iiIiiiiiiiIii).ALLATORIxDEMO(1, null, IiiiiiiiIIIII);
    }

    public IIiIiiiiIIiii(IiiiIiiiiIiIi form, int bw, int bh, int bw1, int bh1, int bw2, int bh2, int px, int py) {
        super(form, bw, bh, bw1, bh1, bw2, bh2, px, py);
    }

    protected void ALLATORIxDEMO(RoleData roleData) {
        Goodstable IiiiiiiiIIIII = roleData.getStarCardGood(this.iiIIIiiiiiiiI + this.iiiIiiiiiiIIi());
        if (IiiiiiiiIIIII == null) {
            return;
        }
        ((iiIiiiiiIIiiI)this.iiIiiiiiiiIii.ALLATORIxDEMO().iiiIiiiiiiIIi(46)).ALLATORIxDEMO(IiiiiiiiIIIII, false);
    }

    protected void ALLATORIxDEMO(int choseIndex, MouseEvent e, RoleData roleData) {
        Goodstable IiiiiiiiIIIII = roleData.getStarCardGood(choseIndex);
        if (IiiiiiiiIIIII == null) {
            return;
        }
        if (this.iiIiiiiiiiIii instanceof iIiIIiiiIiiiI) {
            ((iIiIIiiiIiiiI)this.iiIiiiiiiiIii).ALLATORIxDEMO(IiiiiiiiIIIII);
            return;
        }
        if (this.iiIiiiiiiiIii instanceof IIIIIiiiIiIii) {
            ((IIIIIiiiIiIii)this.iiIiiiiiiiIii).ALLATORIxDEMO(IiiiiiiiIIIII.getRgid());
            return;
        }
        if (!(this.iiIiiiiiiiIii instanceof iiiiiiiiiiIiI)) return;
        ((iiiiiiiiiiIiI)this.iiIiiiiiiiIii).ALLATORIxDEMO(1, null, IiiiiiiiIIIII);
    }

    protected void ALLATORIxDEMO(Graphics g, RoleData roleData) {
        List IiiiiiiiIIIII = null;
        if (this.iiIiiiiiiiIii instanceof IIIIIiiiIiIii) {
            IiiiiiiiIIIII = ((IIIIIiiiIiIii)this.iiIiiiiiiiIii).ALLATORIxDEMO();
        }
        int IiiiiiiiIIIII2 = 0;
        while (IiiiiiiiIIIII2 < this.iIiiIiiiiiiII.length) {
            Goodstable IiiiiiiiIIIII3;
            if (this.iiiIiiiiiiiIi != null) {
                g.drawImage(this.iiiIiiiiiiiIi, IiiiiiiiIIIII2 % this.IiIIIiiiiIiiI * this.iiiiIiiiIiiII, IiiiiiiiIIIII2 / this.IiIIIiiiiIiiI * this.iIiIiiiiIiIii, this.iiIiIiiiiIIIi + 2, this.ALLATORIxDEMO + 2, null);
            }
            if ((IiiiiiiiIIIII3 = roleData.getStarCardGood(IiiiiiiiIIIII2)) == null) {
                if (this.iIiiIiiiiiiII[IiiiiiiiIIIII2] != null) {
                    this.iIiiIiiiiiiII[IiiiiiiiIIIII2].ALLATORIxDEMO();
                }
            } else {
                if (this.iIiiIiiiiiiII[IiiiiiiiIIIII2] == null || IiiiiiiiIIIII3.getRgid() != this.iIiiIiiiiiiII[IiiiiiiiIIIII2].iiIIIiiiiiiiI) {
                    if (this.iIiiIiiiiiiII[IiiiiiiiIIIII2] == null) {
                        this.iIiiIiiiiiiII[IiiiiiiiIIIII2] = new IiIiIiiiiIIiI();
                    }
                    this.iIiiIiiiiiiII[IiiiiiiiIIIII2].ALLATORIxDEMO(IiiiiiiiIIIII3);
                }
                if (IiiiiiiiIIIII2 != this.iIIiIiiiiiiIi) {
                    IIIIIiiiIiiII.ALLATORIxDEMO((Graphics)g, (Image)this.iIiiIiiiiiiII[IiiiiiiiIIIII2].ALLATORIxDEMO, (int)(IiiiiiiiIIIII2 % this.IiIIIiiiiIiiI * this.iiiiIiiiIiiII + 1), (int)(IiiiiiiiIIIII2 / this.IiIIIiiiiIiiI * this.iIiIiiiiIiIii + 1), (int)this.iiIiIiiiiIIIi, (int)this.ALLATORIxDEMO);
                } else {
                    IIIIIiiiIiiII.ALLATORIxDEMO((Graphics)g, (Image)this.iIiiIiiiiiiII[IiiiiiiiIIIII2].ALLATORIxDEMO, (int)(IiiiiiiiIIIII2 % this.IiIIIiiiiIiiI * this.iiiiIiiiIiiII + 2), (int)(IiiiiiiiIIIII2 / this.IiIIIiiiiIiiI * this.iIiIiiiiIiIii + 2), (int)this.iiIiIiiiiIIIi, (int)this.ALLATORIxDEMO);
                }
                if (IiiiiiiiIIIII != null) {
                    if (IiiiiiiiIIIII.contains(IiiiiiiiIIIII3.getRgid())) {
                        g.drawImage(IIiIiiiiIiiIi.IiiiIiiiIiIII, IiiiiiiiIIIII2 % this.IiIIIiiiiIiiI * this.iiiiIiiiIiiII, IiiiiiiiIIIII2 / this.IiIIIiiiiIiiI * this.iIiIiiiiIiIii, null);
                    }
                } else if (IiiiiiiiIIIII3.getStatus() == 1) {
                    g.drawImage(IIiIiiiiIiiIi.IiiiIiiiIiIII, IiiiiiiiIIIII2 % this.IiIIIiiiiIiiI * this.iiiiIiiiIiiII, IiiiiiiiIIIII2 / this.IiIIIiiiiIiiI * this.iIiIiiiiIiIii, null);
                }
                if (IiiiiiiiIIIII3.getGoodlock() == 1) {
                    g.drawImage(IIiIiiiiIiiIi.IiIIIiiiiIiiI, IiiiiiiiIIIII2 % this.IiIIIiiiiIiiI * this.iiiiIiiiIiiII + 36, IiiiiiiiIIIII2 / this.IiIIIiiiiIiiI * this.iIiIiiiiIiIii, 10, 12, null);
                }
            }
            ++IiiiiiiiIIIII2;
        }
    }

    protected void iIiIiiiiIIiii() {
        this.iiIiiiiiiiIii.ALLATORIxDEMO().iiiIiiiiiiIIi(46);
    }
}
