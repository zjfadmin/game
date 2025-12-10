/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.q.iIiIIiiiiiIII
 *  com.xy.a.q.iiiiIiiiiiIiI
 *  com.xy.formula.GoodType
 *  com.xy.game.RoleData
 *  com.xy.q.IIIiiiiiIiIiI
 *  com.xy.q.IiIIIiiiiIIiI
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.readbean.Goodstable
 *  com.xy.w.IIIIIiiiIiiII
 *  com.xy.w.IIIiiiiiIiIiI
 */
package com.xy.a.q;

import com.xy.a.q.iIiIIiiiiiIII;
import com.xy.a.q.iiiiIiiiiiIiI;
import com.xy.formula.GoodType;
import com.xy.game.RoleData;
import com.xy.q.IiIIIiiiiIIiI;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.readbean.Goodstable;
import com.xy.w.IIIIIiiiIiiII;
import com.xy.w.IIIiiiiiIiIiI;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.math.BigDecimal;
import javax.swing.JLabel;

/*
 * Exception performing whole class analysis ignored.
 */
static class iIIIIiiiiIIII
extends IIIiiiiiIiIiI
implements MouseListener {
    private com.xy.q.IIIiiiiiIiIiI[] iiIiiiiiiiIii;
    private JLabel IiiiiiiiIIIII;
    final /* synthetic */ iiiiIiiiiiIiI ALLATORIxDEMO;

    public iIIIIiiiiIIII(iiiiIiiiiiIiI iiiiIiiiiiIiI2) {
        this.ALLATORIxDEMO = iiiiIiiiiiIiI2;
        super(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/36.png", (int)16, (int)16, (int)16, (int)16, (boolean)false));
        this.IiiiiiiiIIIII = IiIIIiiiiIIiI.ALLATORIxDEMO((int)72, (int)9, (int)80, (int)19, (int)10, (Color)Color.black, (Font)iiIIiiiiIiiII.iiiiIiiiIiiII);
        this.add(this.IiiiiiiiIIIII);
        this.iiIiiiiiiiIii = new com.xy.q.IIIiiiiiIiIiI[4];
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iiIiiiiiiiIii.length) {
            this.iiIiiiiiiiIii[IiiiiiiiIIIII] = new iIiIIiiiiiIII(this, iiiiIiiiiiIiI2.ALLATORIxDEMO());
            if (IiiiiiiiIIIII == 0) {
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].ALLATORIxDEMO(com.xy.q.IIIiiiiiIiIiI.ALLATORIxDEMO);
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].ALLATORIxDEMO("sc/d/4.png");
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].setBounds(7, 5, 59, 57);
            } else {
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].ALLATORIxDEMO(com.xy.q.IIIiiiiiIiIiI.IiIIIiiiiIiiI);
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/4.png", (int)5, (int)5, (int)5, (int)5, (boolean)false));
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].setBounds(65 + 29 * (IiiiiiiiIIIII - 1), 30, 31, 31);
            }
            this.add((Component)this.iiIiiiiiiiIii[IiiiiiiiIIIII++]);
        }
        this.addMouseListener(this);
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

    public void iiiIiiiiiiIIi() {
        this.ALLATORIxDEMO.ALLATORIxDEMO(this);
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {
        this.iiiIiiiiiiIIi();
    }

    public void ALLATORIxDEMO(Goodstable good) {
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iiIiiiiiiiIii.length) {
            com.xy.q.IIIiiiiiIiIiI iIIiiiiiIiIiI = this.iiIiiiiiiiIii[IiiiiiiiIIIII];
            ++IiiiiiiiIIIII;
            iIIiiiiiIiIiI.ALLATORIxDEMO(0, null);
        }
        if (good == null) {
            this.setVisible(false);
            return;
        }
        IiiiiiiiIIIII = GoodType.ALLATORIxDEMO((long)good.getType());
        this.IiiiiiiiIIIII.setText(IiiiiiiiIIIII == 0 ? "\u6b66\u5668" : (IiiiiiiiIIIII == 3 ? "\u8863\u670d" : (IiiiiiiiIIIII == 1 ? "\u5e3d\u5b50" : (IiiiiiiiIIIII == 2 ? "\u9879\u94fe" : "\u978b\u5b50"))));
        this.iiIiiiiiiiIii[0].ALLATORIxDEMO(1, (Object)good);
        String IiiiiiiiIIIII2 = GoodType.getExtra((String)good.getValue(), (String)"\u5b9d\u77f3\u5c5e\u6027");
        if (IiiiiiiiIIIII2 != null) {
            RoleData IiiiiiiiIIIII3 = this.ALLATORIxDEMO.ALLATORIxDEMO();
            String[] IiiiiiiiIIIII4 = IiiiiiiiIIIII2.split("&");
            int IiiiiiiiIIIII5 = 1;
            while (IiiiiiiiIIIII5 < IiiiiiiiIIIII4.length) {
                int IiiiiiiiIIIII6;
                BigDecimal IiiiiiiiIIIII7 = new BigDecimal(IiiiiiiiIIIII4[IiiiiiiiIIIII5]);
                Goodstable IiiiiiiiIIIII8 = IiiiiiiiIIIII3.getGoodEquip(IiiiiiiiIIIII7);
                if (IiiiiiiiIIIII8 != null && (IiiiiiiiIIIII6 = GoodType.ALLATORIxDEMO((int)IiiiiiiiIIIII, (long)IiiiiiiiIIIII8.getType())) != 0) {
                    this.iiIiiiiiiiIii[IiiiiiiiIIIII6].ALLATORIxDEMO(1, (Object)IiiiiiiiIIIII8);
                }
                ++IiiiiiiiIIIII5;
            }
        }
        int IiiiiiiiIIIII9 = 1;
        int IiiiiiiiIIIII10 = IiiiiiiiIIIII == 0 ? 4 : 3;
        while (IiiiiiiiIIIII9 < IiiiiiiiIIIII10) {
            this.iiIiiiiiiiIii[IiiiiiiiIIIII9++].setVisible(true);
        }
        this.setVisible(true);
    }

    static /* synthetic */ com.xy.q.IIIiiiiiIiIiI[] ALLATORIxDEMO(iIIIIiiiiIIII arg0) {
        return arg0.iiIiiiiiiiIii;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }
}
