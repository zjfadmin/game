/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.a.IIIiiiiiiiiIi
 *  com.xy.game.HandleEquip
 *  com.xy.game.RoleData
 *  com.xy.q.IIIiiiiiIiIiI
 *  com.xy.q.IiiIiiiiIIIii
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.readbean.Goodstable
 *  com.xy.socket.GameClient
 *  com.xy.socket.ParamTool
 *  com.xy.v.iiIiIiiiIIIiI
 *  com.xy.w.IIiIiiiiIiiIi
 */
package com.xy.a.a;

import com.xy.a.a.IIIiiiiiiiiIi;
import com.xy.game.HandleEquip;
import com.xy.game.RoleData;
import com.xy.q.IIIiiiiiIiIiI;
import com.xy.q.IiiIiiiiIIIii;
import com.xy.q.IiiiIiiiiIiIi;
import com.xy.readbean.Goodstable;
import com.xy.socket.GameClient;
import com.xy.socket.ParamTool;
import com.xy.v.iiIiIiiiIIIiI;
import com.xy.w.IIiIiiiiIiiIi;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.math.BigDecimal;
import javax.swing.JTextField;
import javax.swing.text.BadLocationException;

/*
 * Exception performing whole class analysis ignored.
 */
static class iiIiiiiiIIiii
extends IIIiiiiiIiIiI {
    final /* synthetic */ IIIiiiiiiiiIi iiIiiiiiiiIii;
    private BigDecimal IiiiiiiiIIIII;
    private int ALLATORIxDEMO;

    protected void paintComponent(Graphics g) {
        RoleData roleData = this.iiIiiiiiiiIii.ALLATORIxDEMO();
        Goodstable IiiiiiiiIIIII = roleData.getGoodEquip(roleData.goodChoses[this.ALLATORIxDEMO]);
        if (IiiiiiiiIIIII != null) {
            if (this.IiiiiiiiIIIII != IiiiiiiiIIIII.getRgid()) {
                this.IiiiiiiiIIIII = IiiiiiiiIIIII.getRgid();
                this.ALLATORIxDEMO(1, IiiiiiiiIIIII);
            }
        } else if (this.IiiiiiiiIIIII != null) {
            this.IiiIiiiiiiIiI();
        }
        super.paintComponent(g);
        if (IiiiiiiiIIIII != null && IiiiiiiiIIIII.getGoodlock() == 1) {
            g.drawImage(IIiIiiiiIiiIi.IiIIIiiiiIiiI, 42, 5, null);
        }
        if (!this.IiIIIiiiiiiiI) return;
        g.setColor(Color.white);
        g.drawRect(2, 2, this.getWidth() - 4, this.getHeight() - 4);
        g.drawRect(3, 3, this.getWidth() - 6, this.getHeight() - 6);
    }

    public void mouseReleased(MouseEvent e) {
        super.mouseReleased(e);
        if (this.iiIiiiiiiiIii.iiIIiiiiIiIIi.getBattleScene() != null) {
            return;
        }
        RoleData IiiiiiiiIIIII = this.iiIiiiiiiiIii.ALLATORIxDEMO();
        Goodstable IiiiiiiiIIIII2 = IiiiiiiiIIIII.getGoodEquip(IiiiiiiiIIIII.goodChoses[this.ALLATORIxDEMO]);
        if (IiiiiiiiIIIII2 == null) {
            return;
        }
        if (this.iiIiiiiiiiIii.ALLATORIxDEMO().ALLATORIxDEMO()) {
            return;
        }
        if (e.getButton() == 3 && this.iiIiiiiiiiIii.iiIIiiiiIiIIi.getMouseIndex() == iiIiIiiiIIIiI.IiIIIiiiiIiiI) {
            if (!HandleEquip.ALLATORIxDEMO((RoleData)IiiiiiiiIIIII, (int)this.ALLATORIxDEMO, null)) return;
            this.IiiIiiiiiiIiI();
            return;
        }
        if (e.getButton() != 1) return;
        if (this.iiIiiiiiiiIii.iiIIiiiiIiIIi.getMouseIndex() == iiIiIiiiIIIiI.iiIIIiiiiiiiI) {
            if (IiiiiiiiIIIII2.getGoodlock() == 1) {
                this.iiIiiiiiiiIii.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u8be5\u7269\u54c1\u5df2\u52a0\u9501");
                return;
            }
            IiiiiiiiIIIII2.setGoodlock(1);
            ParamTool.ALLATORIxDEMO((Goodstable)IiiiiiiiIIIII2, (int)0, (GameClient)this.iiIiiiiiiiIii.iiIIiiiiIiIIi.getClient());
            this.iiIiiiiiiiIii.iiIIiiiiIiIIi.setMouseIndex(iiIiIiiiIIIiI.IiIIIiiiiIiiI);
            this.iiIiiiiiiiIii.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u52a0\u9501\u6210\u529f");
            return;
        }
        if (this.iiIiiiiiiiIii.iiIIiiiiIiIIi.getMouseIndex() != iiIiIiiiIIIiI.iiiIiiiiiiiIi) return;
        if (IiiiiiiiIIIII2.getGoodlock() == 0) {
            this.iiIiiiiiiiIii.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u8be5\u7269\u54c1\u672a\u52a0\u9501");
            return;
        }
        IiiiiiiiIIIII2.setGoodlock(0);
        ParamTool.ALLATORIxDEMO((Goodstable)IiiiiiiiIIIII2, (int)0, (GameClient)this.iiIiiiiiiiIii.iiIIiiiiIiIIi.getClient());
        this.iiIiiiiiiiIii.iiIIiiiiIiIIi.setMouseIndex(iiIiIiiiIIIiI.IiIIIiiiiIiiI);
        this.iiIiiiiiiiIii.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u89e3\u9501\u6210\u529f");
    }

    public iiIiiiiiIIiii(IIIiiiiiiiiIi iIIiiiiiiiiIi, int index, IiiiIiiiiIiIi form) {
        this.iiIiiiiiiiIii = iIIiiiiiiiiIi;
        super(form);
        this.ALLATORIxDEMO = index;
        this.iIiIiiiiIIiIi();
        if (index == 0) {
            this.setBounds(44, 87, 59, 57);
            return;
        }
        if (index == 1) {
            this.setBounds(102, 31, 59, 57);
            return;
        }
        if (index == 2) {
            this.setBounds(331, 31, 59, 57);
            return;
        }
        if (index == 3) {
            this.setBounds(102, 87, 59, 57);
            return;
        }
        if (index == 4) {
            this.setBounds(331, 143, 59, 57);
            return;
        }
        if (index == 5) {
            this.setBounds(102, 143, 59, 57);
            return;
        }
        if (index == 6) {
            this.setBounds(273, 31, 59, 57);
            return;
        }
        if (index == 7) {
            this.setBounds(273, 143, 59, 57);
            return;
        }
        if (index == 8) {
            this.setBounds(44, 31, 59, 57);
            return;
        }
        if (index == 9) {
            this.setBounds(44, 143, 59, 57);
            return;
        }
        if (index == 10) {
            this.setBounds(273, 87, 59, 57);
            return;
        }
        if (index != 11) return;
        this.setBounds(331, 87, 59, 57);
    }

    private /* synthetic */ void IiiIiiiiiiIiI() {
        this.IiiiiiiiIIIII = null;
        this.ALLATORIxDEMO(0, null);
        this.iIiIiiiiIIiIi();
        this.iIIIIiiiiiIIi.ALLATORIxDEMO().iiiIiiiiiiIIi(46);
        this.setVisible(true);
    }

    public void iIiIiiiiIIiIi() {
        if (this.ALLATORIxDEMO == 0) {
            this.iIiIiiiiIIiii("sc/d/7.png");
            return;
        }
        if (this.ALLATORIxDEMO == 1) {
            this.iIiIiiiiIIiii("sc/d/6.png");
            return;
        }
        if (this.ALLATORIxDEMO == 2) {
            this.iIiIiiiiIIiii("sc/d/12.png");
            return;
        }
        if (this.ALLATORIxDEMO == 3) {
            this.iIiIiiiiIIiii("sc/d/8.png");
            return;
        }
        if (this.ALLATORIxDEMO == 4) {
            this.iIiIiiiiIIiii("sc/d/15.png");
            return;
        }
        if (this.ALLATORIxDEMO == 5) {
            this.iIiIiiiiIIiii("sc/d/10.png");
            return;
        }
        if (this.ALLATORIxDEMO == 6) {
            this.iIiIiiiiIIiii("sc/d/11.png");
            return;
        }
        if (this.ALLATORIxDEMO == 7) {
            this.iIiIiiiiIIiii("sc/d/14.png");
            return;
        }
        if (this.ALLATORIxDEMO == 8) {
            this.iIiIiiiiIIiii("sc/d/5.png");
            return;
        }
        if (this.ALLATORIxDEMO == 9) {
            this.iIiIiiiiIIiii("sc/d/9.png");
            return;
        }
        if (this.ALLATORIxDEMO == 10) {
            this.iIiIiiiiIIiii("sc/d/13.png");
            return;
        }
        if (this.ALLATORIxDEMO != 11) return;
        this.iIiIiiiiIIiii("sc/d/13.png");
    }

    public void mousePressed(MouseEvent e) {
        super.mousePressed(e);
        if (e.getButton() != 1) return;
        RoleData roleData = this.iiIiiiiiiiIii.ALLATORIxDEMO();
        Goodstable IiiiiiiiIIIII = roleData.getGoodEquip(roleData.goodChoses[this.ALLATORIxDEMO]);
        if (IiiiiiiiIIIII == null) {
            return;
        }
        if (!e.isShiftDown()) return;
        try {
            JTextField IiiiiiiiIIIII2 = this.iiIiiiiiiiIii.ALLATORIxDEMO().getBaseView().ALLATORIxDEMO();
            ((IiiIiiiiIIIii)IiiiiiiiIIIII2.getDocument()).ALLATORIxDEMO(IiiiiiiiIIIII2.getCaretPosition(), 2, IiiiiiiiIIIII.getRgid(), "[" + IiiiiiiiIIIII.getGoodsname() + "]", "G", null);
            return;
        }
        catch (BadLocationException IiiiiiiiIIIII3) {
            IiiiiiiiIIIII3.printStackTrace();
            return;
        }
    }
}
