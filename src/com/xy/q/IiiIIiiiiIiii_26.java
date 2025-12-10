/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.IIiiiiiiIIIii
 *  com.xy.a.a.iiiIIiiiIIIii
 *  com.xy.a.q.iIiIIiiiIiiiI
 *  com.xy.entity.Lingbao
 *  com.xy.game.RoleData
 *  com.xy.q.IIiiIiiiiIIiI
 *  com.xy.q.IiiIiiiiIIIii
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.w.IIIIIiiiIiiII
 *  com.xy.w.IIiIiiiiIiiIi
 *  com.xy.w.IiIiIiiiiIIiI
 */
package com.xy.q;

import com.xy.a.IIiiiiiiIIIii;
import com.xy.a.a.iiiIIiiiIIIii;
import com.xy.a.q.iIiIIiiiIiiiI;
import com.xy.entity.Lingbao;
import com.xy.game.RoleData;
import com.xy.q.IIiiIiiiiIIiI;
import com.xy.q.IiiIiiiiIIIii;
import com.xy.q.IiiiIiiiiIiIi;
import com.xy.w.IIIIIiiiIiiII;
import com.xy.w.IIiIiiiiIiiIi;
import com.xy.w.IiIiIiiiiIIiI;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;
import javax.swing.JTextField;
import javax.swing.text.BadLocationException;

public class IiiIIiiiiIiii
extends IIiiIiiiiIIiI {
    private boolean ALLATORIxDEMO;

    public int ALLATORIxDEMO() {
        int IiiiiiiiIIIII = this.IiIIIiiiiIiiI * this.IIiiIiiiIIiIi;
        RoleData IiiiiiiiIIIII2 = this.iiIiiiiiiiIii.ALLATORIxDEMO();
        if (IiiiiiiiIIIII2 == null) {
            return 0;
        }
        if (!this.ALLATORIxDEMO) return (IiiiiiiiIIIII2.fabaoList.size() - 1) / IiiiiiiiIIIII;
        return (IiiiiiiiIIIII2.lingbaoList.size() - 1) / IiiiiiiiIIIII;
    }

    public boolean ALLATORIxDEMO(int page) {
        int IiiiiiiiIIIII = page * this.IiIIIiiiiIiiI * this.IIiiIiiiIIiIi;
        if (IiiiiiiiIIIII == 0) {
            return true;
        }
        RoleData IiiiiiiiIIIII2 = this.iiIiiiiiiiIii.ALLATORIxDEMO();
        if (IiiiiiiiIIIII2 == null) {
            return false;
        }
        if (this.ALLATORIxDEMO) {
            if (IiiiiiiiIIIII2.getLingBaoIndex(IiiiiiiiIIIII) == null) return false;
            return true;
        }
        if (IiiiiiiiIIIII2.getFaBaoIndex(IiiiiiiiIIIII) == null) return false;
        return true;
    }

    protected void iIiIiiiiIIiii(int choseIndex, MouseEvent e, RoleData roleData) {
        Lingbao IiiiiiiiIIIII;
        if (e.isShiftDown()) {
            Lingbao IiiiiiiiIIIII2;
            Lingbao lingbao = IiiiiiiiIIIII2 = this.ALLATORIxDEMO ? roleData.getLingBaoIndex(choseIndex) : roleData.getFaBaoIndex(choseIndex);
            if (IiiiiiiiIIIII2 == null) {
                return;
            }
            try {
                JTextField IiiiiiiiIIIII3 = this.iiIiiiiiiiIii.iiIIiiiiIiIIi.getBaseView().ALLATORIxDEMO();
                ((IiiIiiiiIIIii)IiiiiiiiIIIII3.getDocument()).ALLATORIxDEMO(IiiiiiiiIIIII3.getCaretPosition(), 4, IiiiiiiiIIIII2.getBaoid(), "[" + IiiiiiiiIIIII2.getBaoname() + "]", "G", null);
                return;
            }
            catch (BadLocationException IiiiiiiiIIIII4) {
                IiiiiiiiIIIII4.printStackTrace();
                return;
            }
        }
        RoleData roleData2 = roleData;
        Lingbao lingbao = IiiiiiiiIIIII = this.ALLATORIxDEMO ? roleData2.getLingBaoIndex(choseIndex) : roleData2.getFaBaoIndex(choseIndex);
        if (IiiiiiiiIIIII == null) {
            return;
        }
        if (!(this.iiIiiiiiiiIii instanceof iIiIIiiiIiiiI)) return;
        ((iIiIIiiiIiiiI)this.iiIiiiiiiiIii).ALLATORIxDEMO(IiiiiiiiIIIII);
    }

    protected void ALLATORIxDEMO(Graphics g, RoleData roleData) {
        int IiiiiiiiIIIII = this.iiiIiiiiiiIIi();
        int IiiiiiiiIIIII2 = 0;
        int IiiiiiiiIIIII3 = 0;
        while (IiiiiiiiIIIII3 < this.iIiiIiiiiiiII.length) {
            Lingbao IiiiiiiiIIIII4;
            IiiiiiiiIIIII2 = IiiiiiiiIIIII3 + IiiiiiiiIIIII;
            if (this.iiiIiiiiiiiIi != null) {
                g.drawImage(this.iiiIiiiiiiiIi, IiiiiiiiIIIII3 % this.IiIIIiiiiIiiI * this.iiiiIiiiIiiII, IiiiiiiiIIIII3 / this.IiIIIiiiiIiiI * this.iIiIiiiiIiIii, this.iiIiIiiiiIIIi + 2, this.ALLATORIxDEMO + 2, null);
            }
            Lingbao lingbao = IiiiiiiiIIIII4 = this.ALLATORIxDEMO ? roleData.getLingBaoIndex(IiiiiiiiIIIII2) : roleData.getFaBaoIndex(IiiiiiiiIIIII2);
            if (IiiiiiiiIIIII4 == null) {
                if (this.iIiiIiiiiiiII[IiiiiiiiIIIII3] != null) {
                    this.iIiiIiiiiiiII[IiiiiiiiIIIII3].ALLATORIxDEMO();
                }
            } else {
                if (this.iIiiIiiiiiiII[IiiiiiiiIIIII3] == null || IiiiiiiiIIIII4.getBaoid() != this.iIiiIiiiiiiII[IiiiiiiiIIIII3].iiIIIiiiiiiiI) {
                    if (this.iIiiIiiiiiiII[IiiiiiiiIIIII3] == null) {
                        this.iIiiIiiiiiiII[IiiiiiiiIIIII3] = new IiIiIiiiiIIiI();
                    }
                    this.iIiiIiiiiiiII[IiiiiiiiIIIII3].ALLATORIxDEMO(IiiiiiiiIIIII4);
                }
                if (IiiiiiiiIIIII2 != this.iIIiIiiiiiiIi) {
                    IIIIIiiiIiiII.ALLATORIxDEMO((Graphics)g, (Image)this.iIiiIiiiiiiII[IiiiiiiiIIIII3].ALLATORIxDEMO, (int)(IiiiiiiiIIIII3 % this.IiIIIiiiiIiiI * this.iiiiIiiiIiiII + 1), (int)(IiiiiiiiIIIII3 / this.IiIIIiiiiIiiI * this.iIiIiiiiIiIii + 1), (int)this.iiIiIiiiiIIIi, (int)(this.ALLATORIxDEMO ? 1 : 0));
                } else {
                    IIIIIiiiIiiII.ALLATORIxDEMO((Graphics)g, (Image)this.iIiiIiiiiiiII[IiiiiiiiIIIII3].ALLATORIxDEMO, (int)(IiiiiiiiIIIII3 % this.IiIIIiiiiIiiI * this.iiiiIiiiIiiII + 2), (int)(IiiiiiiiIIIII3 / this.IiIIIiiiiIiiI * this.iIiIiiiiIiIii + 2), (int)this.iiIiIiiiiIIIi, (int)(this.ALLATORIxDEMO ? 1 : 0));
                }
                if (IiiiiiiiIIIII4.getEquipment() == 1) {
                    g.drawImage(IIiIiiiiIiiIi.IiiiIiiiIiIII, IiiiiiiiIIIII3 % this.IiIIIiiiiIiiI * this.iiiiIiiiIiiII, IiiiiiiiIIIII3 / this.IiIIIiiiiIiiI * this.iIiIiiiiIiIii, null);
                }
            }
            ++IiiiiiiiIIIII3;
        }
    }

    protected void iIiIiiiiIIiii() {
        this.iiIiiiiiiiIii.ALLATORIxDEMO().iiiIiiiiiiIIi(45);
    }

    public IiiIIiiiiIiii(boolean isLingBao, IiiiIiiiiIiIi form, int bw, int bh, int bw1, int bh1, int bw2, int bh2, int px, int py) {
        super(form, bw, bh, bw1, bh1, bw2, bh2, px, py);
        this.ALLATORIxDEMO = isLingBao;
    }

    protected void ALLATORIxDEMO(RoleData roleData) {
        Lingbao IiiiiiiiIIIII;
        Lingbao lingbao = IiiiiiiiIIIII = this.ALLATORIxDEMO ? roleData.getLingBaoIndex(this.iiIIIiiiiiiiI + this.iiiIiiiiiiIIi()) : roleData.getFaBaoIndex(this.iiIIIiiiiiiiI + this.iiiIiiiiiiIIi());
        if (IiiiiiiiIIIII == null) {
            return;
        }
        ((IIiiiiiiIIIii)this.iiIiiiiiiiIii.ALLATORIxDEMO().iiiIiiiiiiIIi(45)).ALLATORIxDEMO(IiiiiiiiIIIII, false);
    }

    protected void ALLATORIxDEMO(int choseIndex, MouseEvent e, RoleData roleData) {
        Lingbao IiiiiiiiIIIII;
        Lingbao lingbao = IiiiiiiiIIIII = this.ALLATORIxDEMO ? roleData.getLingBaoIndex(choseIndex) : roleData.getFaBaoIndex(choseIndex);
        if (IiiiiiiiIIIII == null) {
            return;
        }
        if (this.iiIiiiiiiiIii instanceof iiiIIiiiIIIii) {
            ((iiiIIiiiIIIii)this.iiIiiiiiiiIii).iIiIiiiiIIiii(IiiiiiiiIIIII);
            return;
        }
        if (!(this.iiIiiiiiiiIii instanceof iIiIIiiiIiiiI)) return;
        ((iIiIIiiiIiiiI)this.iiIiiiiiiiIii).ALLATORIxDEMO(IiiiiiiiIIIII);
    }
}
