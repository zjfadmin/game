/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.iIiIIiiiIIIiI
 *  com.xy.a.iIiIiiiiiiiIi
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.readbean.MapModel
 *  com.xy.richtext.InputBean
 *  com.xy.richtext.RichLabel
 *  com.xy.v.IiiiiiiiiIIII
 *  com.xy.v.iiIiiiiiIIiii
 *  com.xy.w.IIIIIiiiIiiII
 *  com.xy.w.IIIiiiiiIiIiI
 */
package com.xy.a;

import com.xy.a.iIiIIiiiIIIiI;
import com.xy.a.iIiIiiiiiiiIi;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.readbean.MapModel;
import com.xy.richtext.InputBean;
import com.xy.richtext.RichLabel;
import com.xy.v.IiiiiiiiiIIII;
import com.xy.v.iiIiiiiiIIiii;
import com.xy.w.IIIIIiiiIiiII;
import com.xy.w.IIIiiiiiIiIiI;
import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/*
 * Exception performing whole class analysis ignored.
 */
static class iIIiIiiiIiiIi
extends IIIiiiiiIiIiI
implements MouseListener {
    private List<RichLabel> IiIIIiiiiIiiI;
    private RichLabel iiIiiiiiiiIii;
    final /* synthetic */ iIiIIiiiIIIiI IiiiiiiiIIIII;
    private InputBean ALLATORIxDEMO;

    @Override
    public void mouseExited(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        if (this.ALLATORIxDEMO == null) return;
        this.ALLATORIxDEMO.setM(false);
        if (!iIiIIiiiIIIiI.ALLATORIxDEMO((iIiIIiiiIIIiI)this.IiiiiiiiIIIII).isVisible()) {
            return;
        }
        MapModel IiiiiiiiIIIII = this.IiiiiiiiIIIII.ALLATORIxDEMO().ALLATORIxDEMO(this.ALLATORIxDEMO.getId().toString());
        if (IiiiiiiiIIIII == null) {
            return;
        }
        ((iIiIiiiiiiiIi)this.IiiiiiiiIIIII.ALLATORIxDEMO().iiiIiiiiiiIIi(22)).ALLATORIxDEMO(IiiiiiiiIIIII);
    }

    @Override
    public void mousePressed(MouseEvent e) {
        if (e.isMetaDown()) {
            iIiIIiiiIIIiI.ALLATORIxDEMO((iIiIIiiiIIIiI)this.IiiiiiiiIIIII).setVisible(false);
            return;
        }
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IiIIIiiiiIiiI.size()) {
            RichLabel IiiiiiiiIIIII2 = this.IiIIIiiiiIiiI.get(IiiiiiiiIIIII);
            if (!IiiiiiiiIIIII2.isVisible()) {
                return;
            }
            this.ALLATORIxDEMO = IiiiiiiiIIIII2.isMonitor(e.getX() - IiiiiiiiIIIII2.getX(), e.getY() - IiiiiiiiIIIII2.getY());
            if (this.ALLATORIxDEMO != null) {
                this.ALLATORIxDEMO.setM(true);
                return;
            }
            ++IiiiiiiiIIIII;
        }
    }

    public iIIiIiiiIiiIi(iIiIIiiiIIIiI iIiIIiiiIIIiI2) {
        this.IiiiiiiiIIIII = iIiIIiiiIIIiI2;
        super(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/b/S0.png", (int)6, (int)6, (int)6, (int)6, (boolean)false));
        this.iiIiiiiiiiIii = new RichLabel("#Y\u53ef\u6253\u5f00\u4ee5\u4e0b\u5730\u56fe:", iiIIiiiiIiiII.iIiIIiiiiIIiI, 180);
        this.iiIiiiiiiiIii.setBounds(7, 11, this.iiIiiiiiiiIii.getWidth(), this.iiIiiiiiiiIii.getHeight());
        this.add((Component)this.iiIiiiiiiiIii);
        this.addMouseListener(this);
        this.IiIIIiiiiIiiI = new ArrayList<RichLabel>();
    }

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    /*
     * WARNING - void declaration
     */
    public void ALLATORIxDEMO(int value) {
        this.ALLATORIxDEMO = null;
        IiiiiiiiiIIII IiiiiiiiIIIII = this.IiiiiiiiIIIII.ALLATORIxDEMO();
        int IiiiiiiiIIIII2 = 0;
        int IiiiiiiiIIIII3 = 0;
        int IiiiiiiiIIIII4 = 0;
        if (value == -1) {
            IiiiiiiiIIIII3 = 1282;
            IiiiiiiiIIIII4 = 1288;
        } else if (value == -2) {
            IiiiiiiiIIIII3 = 1289;
            IiiiiiiiIIIII4 = 1295;
        } else if (value == -3) {
            IiiiiiiiIIIII3 = 1268;
            IiiiiiiiIIIII4 = 1271;
        } else if (value == -4) {
            IiiiiiiiIIIII3 = 1221;
            IiiiiiiiIIIII4 = 1227;
        } else if (value == -5) {
            IiiiiiiiIIIII3 = 1273;
            IiiiiiiiIIIII4 = 1276;
        }
        int IiiiiiiiIIIII5 = IiiiiiiiIIIII3;
        while (IiiiiiiiIIIII5 <= IiiiiiiiIIIII4) {
            MapModel IiiiiiiiIIIII6;
            int IiiiiiiiIIIII7 = IiiiiiiiIIIII5;
            if (value == -4 && IiiiiiiiIIIII5 == 1227) {
                IiiiiiiiIIIII7 = 3311;
            }
            if ((IiiiiiiiIIIII6 = IiiiiiiiIIIII.ALLATORIxDEMO(String.valueOf(IiiiiiiiIIIII7))) != null) {
                void IiiiiiiiIIIII8;
                RichLabel IiiiiiiiIIIII9;
                RichLabel richLabel = IiiiiiiiIIIII9 = IiiiiiiiIIIII2 < this.IiIIIiiiiIiiI.size() ? this.IiIIIiiiiIiiI.get(IiiiiiiiIIIII2) : null;
                if (IiiiiiiiIIIII9 == null) {
                    IiiiiiiiIIIII9 = new RichLabel("", iiIIiiiiIiiII.iIiIIiiiiIIiI);
                    this.IiIIIiiiiIiiI.add(IiiiiiiiIIIII9);
                    this.add((Component)IiiiiiiiIIIII9);
                }
                InputBean inputBean = new InputBean(14);
                IiiiiiiiIIIII8.setId(new BigDecimal(IiiiiiiiIIIII6.getMapId()));
                inputBean.setName(IiiiiiiiIIIII6 != null ? IiiiiiiiIIIII6.getMapName() : "\u672a\u77e5\u5730\u56fe");
                StringBuffer IiiiiiiiIIIII10 = new StringBuffer();
                IiiiiiiiIIIII10.append("#Y");
                IiiiiiiiIIIII10.append("#V");
                IiiiiiiiIIIII10.append(iiIiiiiiIIiii.ALLATORIxDEMO().toJson(IiiiiiiiIIIII8));
                IiiiiiiiIIIII10.append("#L");
                IiiiiiiiIIIII9.setTextSize(IiiiiiiiIIIII10.toString(), 180);
                int n = 32 + IiiiiiiiIIIII2 * 22;
                ++IiiiiiiiIIIII2;
                IiiiiiiiIIIII9.setBounds(7, n, IiiiiiiiIIIII9.getWidth(), 22);
                IiiiiiiiIIIII9.setVisible(true);
            }
            ++IiiiiiiiIIIII5;
        }
        IiiiiiiiIIIII5 = IiiiiiiiIIIII2;
        while (IiiiiiiiIIIII5 < this.IiIIIiiiiIiiI.size()) {
            RichLabel richLabel = this.IiIIIiiiiIiiI.get(IiiiiiiiIIIII5);
            ++IiiiiiiiIIIII5;
            richLabel.setVisible(false);
        }
        this.setBounds(0, 0, 185, Math.max(90, 46 + IiiiiiiiIIIII2 * 22));
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }
}
