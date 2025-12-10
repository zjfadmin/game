/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.IIiiiiiiIIIii
 *  com.xy.a.IiiiIiiiiIiII
 *  com.xy.a.q.IiiiIiiiiIiIi
 *  com.xy.a.q.iIiIIiiiIiiiI
 *  com.xy.entity.Lingbao
 *  com.xy.entity.RoleSummoning
 *  com.xy.socket.Agreement
 */
package com.xy.a.q;

import com.xy.a.IIiiiiiiIIIii;
import com.xy.a.IiiiIiiiiIiII;
import com.xy.a.q.IiiiIiiiiIiIi;
import com.xy.a.q.iIiIIiiiIiiiI;
import com.xy.entity.Lingbao;
import com.xy.entity.RoleSummoning;
import com.xy.socket.Agreement;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/*
 * Exception performing whole class analysis ignored.
 */
static class IIIiiiiiIiIiI
implements MouseListener {
    private int iiIiiiiiiiIii;
    final /* synthetic */ iIiIIiiiIiiiI IiiiiiiiIIIII;
    private int ALLATORIxDEMO;

    @Override
    public void mousePressed(MouseEvent e) {
        if (this.ALLATORIxDEMO == 0) {
            if (IiiiIiiiiIiIi.ALLATORIxDEMO((IiiiIiiiiIiIi)iIiIIiiiIiiiI.iIiIiiiiIIiii((iIiIIiiiIiiiI)this.IiiiiiiiIIIII)) == 0) {
                String IiiiiiiiIIIII = Agreement.getSendTextAES((String)"TransState", (String)"3");
                this.IiiiiiiiIIIII.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII);
                return;
            }
            String IiiiiiiiIIIII = Agreement.getSendTextAES((String)"TransState", (String)"4");
            this.IiiiiiiiIIIII.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII);
            return;
        }
        if (this.ALLATORIxDEMO != 1) return;
        if (this.iiIiiiiiiiIii == 0 || this.iiIiiiiiiiIii == 1) {
            RoleSummoning IiiiiiiiIIIII = IiiiIiiiiIiIi.ALLATORIxDEMO((IiiiIiiiiIiIi)iIiIIiiiIiiiI.iIiIiiiiIIiii((iIiIIiiiIiiiI)this.IiiiiiiiIIIII)).getPet(this.iiIiiiiiiiIii);
            if (IiiiiiiiIIIII == null) {
                return;
            }
            this.IiiiiiiiIIIII.ALLATORIxDEMO(this.IiiiiiiiIIIII.ALLATORIxDEMO().getRolePet(IiiiiiiiIIIII.getSid().longValue()), e);
            return;
        }
        Lingbao IiiiiiiiIIIII = IiiiIiiiiIiIi.ALLATORIxDEMO((IiiiIiiiiIiIi)iIiIIiiiIiiiI.iIiIiiiiIIiii((iIiIIiiiIiiiI)this.IiiiiiiiIIIII)).getLingbao(this.iiIiiiiiiiIii - 2);
        if (IiiiiiiiIIIII == null) {
            return;
        }
        this.IiiiiiiiIIIII.ALLATORIxDEMO(IiiiiiiiIIIII);
    }

    public IIIiiiiiIiIiI(iIiIIiiiIiiiI iIiIIiiiIiiiI2, int type, int index) {
        this.IiiiiiiiIIIII = iIiIIiiiIiiiI2;
        this.ALLATORIxDEMO = type;
        this.iiIiiiiiiiIii = index;
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
        if (this.ALLATORIxDEMO != 1) {
            if (this.ALLATORIxDEMO != 2) return;
        }
        if (this.iiIiiiiiiiIii != 0 && this.iiIiiiiiiiIii != 1) {
            this.IiiiiiiiIIIII.ALLATORIxDEMO().iiiIiiiiiiIIi(45);
            return;
        }
        this.IiiiiiiiIIIII.ALLATORIxDEMO().iiiIiiiiiiIIi(42);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        Lingbao IiiiiiiiIIIII;
        if (this.ALLATORIxDEMO != 1) {
            if (this.ALLATORIxDEMO != 2) return;
        }
        if (this.iiIiiiiiiiIii == 0 || this.iiIiiiiiiiIii == 1) {
            RoleSummoning IiiiiiiiIIIII2;
            RoleSummoning roleSummoning = IiiiiiiiIIIII2 = this.ALLATORIxDEMO == 1 ? IiiiIiiiiIiIi.ALLATORIxDEMO((IiiiIiiiiIiIi)iIiIIiiiIiiiI.iIiIiiiiIIiii((iIiIIiiiIiiiI)this.IiiiiiiiIIIII)).getPet(this.iiIiiiiiiiIii) : IiiiIiiiiIiIi.ALLATORIxDEMO((IiiiIiiiiIiIi)iIiIIiiiIiiiI.ALLATORIxDEMO((iIiIIiiiIiiiI)this.IiiiiiiiIIIII)).getPet(this.iiIiiiiiiiIii);
            if (IiiiiiiiIIIII2 == null) {
                return;
            }
            IiiiIiiiiIiII IiiiiiiiIIIII3 = (IiiiIiiiiIiII)this.IiiiiiiiIIIII.ALLATORIxDEMO().iiiIiiiiiiIIi(42);
            IiiiiiiiIIIII3.ALLATORIxDEMO(IiiiiiiiIIIII2, null, false);
            return;
        }
        Lingbao lingbao = IiiiiiiiIIIII = this.ALLATORIxDEMO == 1 ? IiiiIiiiiIiIi.ALLATORIxDEMO((IiiiIiiiiIiIi)iIiIIiiiIiiiI.iIiIiiiiIIiii((iIiIIiiiIiiiI)this.IiiiiiiiIIIII)).getLingbao(this.iiIiiiiiiiIii - 2) : IiiiIiiiiIiIi.ALLATORIxDEMO((IiiiIiiiiIiIi)iIiIIiiiIiiiI.ALLATORIxDEMO((iIiIIiiiIiiiI)this.IiiiiiiiIIIII)).getLingbao(this.iiIiiiiiiiIii - 2);
        if (IiiiiiiiIIIII == null) {
            return;
        }
        IIiiiiiiIIIii IiiiiiiiIIIII4 = (IIiiiiiiIIIii)this.IiiiiiiiIIIII.ALLATORIxDEMO().iiiIiiiiiiIIi(45);
        IiiiiiiiIIIII4.ALLATORIxDEMO(IiiiiiiiIIIII, false);
    }
}
