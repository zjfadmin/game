/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.a.iiIiIiiiiiIIi
 *  com.xy.entity.RoleSummoning
 *  com.xy.game.HandlePet
 *  com.xy.game.RoleData
 *  com.xy.q.IIIiiiiiIiIiI
 *  com.xy.q.IiiIiiiiIIIii
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.readbean.Goodstable
 *  com.xy.socket.GameClient
 *  com.xy.socket.ParamTool
 *  com.xy.v.iiIiIiiiIIIiI
 */
package com.xy.a.a;

import com.xy.a.a.iiIiIiiiiiIIi;
import com.xy.entity.RoleSummoning;
import com.xy.game.HandlePet;
import com.xy.game.RoleData;
import com.xy.q.IIIiiiiiIiIiI;
import com.xy.q.IiiIiiiiIIIii;
import com.xy.q.IiiiIiiiiIiIi;
import com.xy.readbean.Goodstable;
import com.xy.socket.GameClient;
import com.xy.socket.ParamTool;
import com.xy.v.iiIiIiiiIIIiI;
import java.awt.event.MouseEvent;
import java.math.BigDecimal;
import javax.swing.JTextField;
import javax.swing.text.BadLocationException;

/*
 * Exception performing whole class analysis ignored.
 */
static class IiIIIiiiiiiIi
extends IIIiiiiiIiIiI {
    private BigDecimal IiIIIiiiiIiiI;
    private int iiIiiiiiiiIii;
    final /* synthetic */ iiIiIiiiiiIIi ALLATORIxDEMO;

    public void ALLATORIxDEMO(Goodstable good) {
        if (good == null) {
            this.IiiIiiiiiiIiI();
            return;
        }
        this.IiIIIiiiiIiiI = good.getRgid();
        this.ALLATORIxDEMO(1, good);
    }

    public void mousePressed(MouseEvent e) {
        super.mousePressed(e);
        if (e.getButton() != 1) return;
        Goodstable IiiiiiiiIIIII = this.ALLATORIxDEMO.ALLATORIxDEMO().getGoodEquip(this.IiIIIiiiiIiiI);
        if (IiiiiiiiIIIII == null) {
            return;
        }
        if (!e.isShiftDown()) return;
        try {
            JTextField IiiiiiiiIIIII2 = this.ALLATORIxDEMO.ALLATORIxDEMO().getBaseView().ALLATORIxDEMO();
            ((IiiIiiiiIIIii)IiiiiiiiIIIII2.getDocument()).ALLATORIxDEMO(IiiiiiiiIIIII2.getCaretPosition(), 2, IiiiiiiiIIIII.getRgid(), "[" + IiiiiiiiIIIII.getGoodsname() + "]", "G", null);
            return;
        }
        catch (BadLocationException IiiiiiiiIIIII3) {
            IiiiiiiiIIIII3.printStackTrace();
            return;
        }
    }

    private /* synthetic */ void IiiIiiiiiiIiI() {
        this.IiIIIiiiiIiiI = null;
        this.ALLATORIxDEMO(0, null);
        this.iIiIiiiiIIiIi();
        this.iIIIIiiiiiIIi.ALLATORIxDEMO().iiiIiiiiiiIIi(46);
        this.setVisible(true);
    }

    public IiIIIiiiiiiIi(iiIiIiiiiiIIi iiIiIiiiiiIIi2, int index, IiiiIiiiiIiIi form) {
        this.ALLATORIxDEMO = iiIiIiiiiiIIi2;
        super(form);
        this.iiIiiiiiiiIii = index;
        this.iIiIiiiiIIiIi();
        if (index != 0 && index != 1 && index != 2) {
            if (index != 3) return;
            this.setBounds(273, 152, 45, 45);
            return;
        }
        this.setBounds(40, 54 + index * 49, 45, 45);
    }

    public void iIiIiiiiIIiIi() {
        if (this.iiIiiiiiiiIii == 0) {
            this.iIiIiiiiIIiii("sc/d/52.png");
            return;
        }
        if (this.iiIiiiiiiiIii == 1) {
            this.iIiIiiiiIIiii("sc/d/53.png");
            return;
        }
        if (this.iiIiiiiiiiIii == 2) {
            this.iIiIiiiiIIiii("sc/d/54.png");
            return;
        }
        if (this.iiIiiiiiiiIii != 3) return;
        this.iIiIiiiiIIiii("sc/d/55.png");
    }

    public void mouseReleased(MouseEvent e) {
        super.mouseReleased(e);
        if (this.ALLATORIxDEMO.iiIIiiiiIiIIi.getBattleScene() != null) {
            return;
        }
        RoleData IiiiiiiiIIIII = this.ALLATORIxDEMO.ALLATORIxDEMO();
        Goodstable IiiiiiiiIIIII2 = IiiiiiiiIIIII.getGoodEquip(this.IiIIIiiiiIiiI);
        if (IiiiiiiiIIIII2 == null) {
            return;
        }
        if (this.ALLATORIxDEMO.ALLATORIxDEMO().ALLATORIxDEMO()) {
            return;
        }
        if (e.getButton() == 3 && this.ALLATORIxDEMO.iiIIiiiiIiIIi.getMouseIndex() == iiIiIiiiIIIiI.IiIIIiiiiIiiI) {
            RoleSummoning IiiiiiiiIIIII3 = this.iIIIIiiiiiIIi.ALLATORIxDEMO().getChosePet();
            if (IiiiiiiiIIIII3 == null) {
                return;
            }
            HandlePet.ALLATORIxDEMO((RoleSummoning)IiiiiiiiIIIII3, null, (int)this.iiIiiiiiiiIii, (RoleData)IiiiiiiiIIIII);
            return;
        }
        if (e.getButton() != 1) return;
        if (this.ALLATORIxDEMO.iiIIiiiiIiIIi.getMouseIndex() == iiIiIiiiIIIiI.iiIIIiiiiiiiI) {
            if (IiiiiiiiIIIII2.getGoodlock() == 1) {
                this.ALLATORIxDEMO.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u8be5\u7269\u54c1\u5df2\u52a0\u9501");
                return;
            }
            IiiiiiiiIIIII2.setGoodlock(1);
            ParamTool.ALLATORIxDEMO((Goodstable)IiiiiiiiIIIII2, (int)0, (GameClient)this.ALLATORIxDEMO.iiIIiiiiIiIIi.getClient());
            this.ALLATORIxDEMO.iiIIiiiiIiIIi.setMouseIndex(iiIiIiiiIIIiI.IiIIIiiiiIiiI);
            this.ALLATORIxDEMO.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u52a0\u9501\u6210\u529f");
            return;
        }
        if (this.ALLATORIxDEMO.iiIIiiiiIiIIi.getMouseIndex() != iiIiIiiiIIIiI.iiiIiiiiiiiIi) return;
        if (IiiiiiiiIIIII2.getGoodlock() == 0) {
            this.ALLATORIxDEMO.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u8be5\u7269\u54c1\u672a\u52a0\u9501");
            return;
        }
        IiiiiiiiIIIII2.setGoodlock(0);
        ParamTool.ALLATORIxDEMO((Goodstable)IiiiiiiiIIIII2, (int)0, (GameClient)this.ALLATORIxDEMO.iiIIiiiiIiIIi.getClient());
        this.ALLATORIxDEMO.iiIIiiiiIiIIi.setMouseIndex(iiIiIiiiIIIiI.IiIIIiiiiIiiI);
        this.ALLATORIxDEMO.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u89e3\u9501\u6210\u529f");
    }
}
