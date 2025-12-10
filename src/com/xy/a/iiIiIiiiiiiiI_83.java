/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.iIiIiiiiiiiIi
 *  com.xy.formula.FormulaNum
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.readbean.Door
 *  com.xy.readbean.MapModel
 *  com.xy.readbean.NpcInfoBean
 *  com.xy.richtext.InputBean
 *  com.xy.richtext.RichLabel
 *  com.xy.v.IIiiIiiiiIIiI
 *  com.xy.v.IiiiiiiiiIIII
 *  com.xy.v.iiIiiiiiIIiii
 *  com.xy.w.IIIIIiiiIiiII
 *  com.xy.w.IIIiiiiiIiIiI
 */
package com.xy.a;

import com.xy.a.iIiIiiiiiiiIi;
import com.xy.formula.FormulaNum;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.readbean.Door;
import com.xy.readbean.MapModel;
import com.xy.readbean.NpcInfoBean;
import com.xy.richtext.InputBean;
import com.xy.richtext.RichLabel;
import com.xy.v.IIiiIiiiiIIiI;
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
static class iiIiIiiiiiiiI
extends IIIiiiiiIiIiI
implements MouseListener {
    private List<RichLabel> IiIIIiiiiIiiI;
    final /* synthetic */ iIiIiiiiiiiIi iiIiiiiiiiIii;
    private RichLabel IiiiiiiiIIIII;
    private InputBean ALLATORIxDEMO;

    @Override
    public void mouseReleased(MouseEvent e) {
        MapModel IiiiiiiiIIIII;
        if (this.ALLATORIxDEMO == null) return;
        this.ALLATORIxDEMO.setM(false);
        Door IiiiiiiiIIIII2 = this.iiIiiiiiiiIii.ALLATORIxDEMO().ALLATORIxDEMO(this.ALLATORIxDEMO.getId().toString());
        MapModel mapModel = IiiiiiiiIIIII = IiiiiiiiIIIII2 != null ? this.iiIiiiiiiiIii.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII2.getDoormap()) : null;
        if (IiiiiiiiIIIII == null) {
            return;
        }
        if (!this.iiIiiiiiiiIii.ALLATORIxDEMO(IiiiiiiiIIIII)) {
            return;
        }
        int IiiiiiiiIIIII3 = IiiiiiiiIIIII2.getDoorpoint().indexOf("|");
        int IiiiiiiiIIIII4 = IIiiIiiiiIIiI.ALLATORIxDEMO((String)IiiiiiiiIIIII2.getDoorpoint(), (int)0, (int)IiiiiiiiIIIII3);
        int IiiiiiiiIIIII5 = IIiiIiiiiIIiI.ALLATORIxDEMO((String)IiiiiiiiIIIII2.getDoorpoint(), (int)(IiiiiiiiIIIII3 + 1), (int)IiiiiiiiIIIII2.getDoorpoint().length());
        IiiiiiiiIIIII4 = (int)((double)IiiiiiiiIIIII4 / iIiIiiiiiiiIi.ALLATORIxDEMO((iIiIiiiiiiiIi)this.iiIiiiiiiiIii) - 13.0);
        IiiiiiiiIIIII5 = (int)((double)IiiiiiiiIIIII5 / iIiIiiiiiiiIi.ALLATORIxDEMO((iIiIiiiiiiiIi)this.iiIiiiiiiiIii) - 6.0);
        iIiIiiiiiiiIi.iIiIiiiiIIiii((iIiIiiiiiiiIi)this.iiIiiiiiiiIii, (int)(IiiiiiiiIIIII4 += iIiIiiiiiiiIi.ALLATORIxDEMO((iIiIiiiiiiiIi)this.iiIiiiiiiiIii)[2].getX()));
        iIiIiiiiiiiIi.ALLATORIxDEMO((iIiIiiiiiiiIi)this.iiIiiiiiiiIii, (int)(IiiiiiiiIIIII5 += iIiIiiiiiiiIi.ALLATORIxDEMO((iIiIiiiiiiiIi)this.iiIiiiiiiiIii)[2].getY()));
        iIiIiiiiiiiIi.ALLATORIxDEMO((iIiIiiiiiiiIi)this.iiIiiiiiiiIii, (boolean)true);
    }

    public iiIiIiiiiiiiI(iIiIiiiiiiiIi iIiIiiiiiiiIi2) {
        this.iiIiiiiiiiIii = iIiIiiiiiiiIi2;
        super(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/b/S0.png", (int)6, (int)6, (int)6, (int)6, (boolean)false));
        this.IiiiiiiiIIIII = new RichLabel("#Y\u53ef\u4f20\u9001\u5230\u4ee5\u4e0b\u5730\u70b9:", iiIIiiiiIiiII.iIiIIiiiiIIiI, 180);
        this.IiiiiiiiIIIII.setBounds(7, 11, this.IiiiiiiiIIIII.getWidth(), this.IiiiiiiiIIIII.getHeight());
        this.add((Component)this.IiiiiiiiIIIII);
        this.addMouseListener(this);
        this.IiIIIiiiiIiiI = new ArrayList<RichLabel>();
    }

    public void ALLATORIxDEMO(NpcInfoBean npcInfoBean) {
        RichLabel IiiiiiiiIIIII;
        int IiiiiiiiIIIII2;
        this.ALLATORIxDEMO = null;
        IiiiiiiiiIIII IiiiiiiiIIIII3 = this.iiIiiiiiiiIii.ALLATORIxDEMO();
        ArrayList<Door> IiiiiiiiIIIII4 = npcInfoBean.getDoors();
        if (IiiiiiiiIIIII4 == null && !IIiiIiiiiIIiI.iIiIiiiiIIiIi((String)npcInfoBean.getNpctable().getNpcway())) {
            IiiiiiiiIIIII4 = new ArrayList<Door>();
            String IiiiiiiiIIIII5 = npcInfoBean.getNpctable().getNpcway();
            IiiiiiiiIIIII2 = 0;
            int IiiiiiiiIIIII6 = 0;
            while (IiiiiiiiIIIII6 != IiiiiiiiIIIII5.length()) {
                IiiiiiiiIIIII6 = IiiiiiiiIIIII5.indexOf("|", IiiiiiiiIIIII2 + 1);
                if (IiiiiiiiIIIII6 == -1) {
                    IiiiiiiiIIIII6 = IiiiiiiiIIIII5.length();
                }
                IiiiiiiiIIIII = new FormulaNum(IiiiiiiiIIIII5.substring(IiiiiiiiIIIII2, IiiiiiiiIIIII6));
                int IiiiiiiiIIIII7 = 0;
                int IiiiiiiiIIIII8 = IiiiiiiiIIIII.getSize();
                while (IiiiiiiiIIIII7 < IiiiiiiiIIIII8) {
                    long IiiiiiiiIIIII9 = IiiiiiiiIIIII.getZhi(IiiiiiiiIIIII7);
                    Door IiiiiiiiIIIII10 = IiiiiiiiIIIII3.ALLATORIxDEMO(String.valueOf(IiiiiiiiIIIII9));
                    if (IiiiiiiiIIIII10 != null) {
                        IiiiiiiiIIIII4.add(IiiiiiiiIIIII10);
                    }
                    ++IiiiiiiiIIIII7;
                }
                IiiiiiiiIIIII2 = IiiiiiiiIIIII6 + 1;
            }
            npcInfoBean.setDoors(IiiiiiiiIIIII4);
        }
        int IiiiiiiiIIIII11 = IiiiiiiiIIIII4 != null ? IiiiiiiiIIIII4.size() : 0;
        IiiiiiiiIIIII2 = 0;
        while (IiiiiiiiIIIII2 < IiiiiiiiIIIII11) {
            Door IiiiiiiiIIIII12 = (Door)IiiiiiiiIIIII4.get(IiiiiiiiIIIII2);
            RichLabel richLabel = IiiiiiiiIIIII = IiiiiiiiIIIII2 < this.IiIIIiiiiIiiI.size() ? this.IiIIIiiiiIiiI.get(IiiiiiiiIIIII2) : null;
            if (IiiiiiiiIIIII == null) {
                IiiiiiiiIIIII = new RichLabel("", iiIIiiiiIiiII.iIiIIiiiiIIiI);
                this.IiIIIiiiiIiiI.add(IiiiiiiiIIIII);
                this.add((Component)IiiiiiiiIIIII);
            }
            MapModel IiiiiiiiIIIII13 = IiiiiiiiIIIII3.ALLATORIxDEMO(IiiiiiiiIIIII12.getDoormap());
            InputBean IiiiiiiiIIIII8 = new InputBean(13);
            IiiiiiiiIIIII8.setId(new BigDecimal(IiiiiiiiIIIII12.getDoorid()));
            IiiiiiiiIIIII8.setName(IiiiiiiiIIIII13 != null ? IiiiiiiiIIIII13.getMapName() : "\u672a\u77e5\u5730\u56fe");
            StringBuffer IiiiiiiiIIIII14 = new StringBuffer();
            IiiiiiiiIIIII14.append("#Y");
            IiiiiiiiIIIII14.append("#V");
            IiiiiiiiIIIII14.append(iiIiiiiiIIiii.ALLATORIxDEMO().toJson(IiiiiiiiIIIII8));
            IiiiiiiiIIIII14.append("#L");
            IiiiiiiiIIIII.setTextSize(IiiiiiiiIIIII14.toString(), 180);
            int n = 32 + IiiiiiiiIIIII2 * 22;
            ++IiiiiiiiIIIII2;
            IiiiiiiiIIIII.setBounds(7, n, IiiiiiiiIIIII.getWidth(), 22);
            IiiiiiiiIIIII.setVisible(true);
        }
        IiiiiiiiIIIII2 = IiiiiiiiIIIII11;
        while (IiiiiiiiIIIII2 < this.IiIIIiiiiIiiI.size()) {
            RichLabel richLabel = this.IiIIIiiiiIiiI.get(IiiiiiiiIIIII2);
            ++IiiiiiiiIIIII2;
            richLabel.setVisible(false);
        }
        this.setBounds(0, 0, 185, Math.max(90, 46 + IiiiiiiiIIIII11 * 22));
    }

    @Override
    public void mousePressed(MouseEvent e) {
        if (e.isMetaDown()) {
            iIiIiiiiiiiIi.ALLATORIxDEMO((iIiIiiiiiiiIi)this.iiIiiiiiiiIii).setVisible(false);
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

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

    @Override
    public void mouseClicked(MouseEvent e) {
    }
}
