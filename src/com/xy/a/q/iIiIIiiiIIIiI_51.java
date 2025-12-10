/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.q.IiiIiiiiIiIIi
 *  com.xy.a.q.iIIiIiiiIiiIi
 *  com.xy.bean.ChongjipackBean
 *  com.xy.formula.MsgUntil
 *  com.xy.q.IiIIIiiiiIIiI
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.text.GameView
 *  com.xy.w.IIIIIiiiIiiII
 *  com.xy.w.IIIiiiiiIiIiI
 */
package com.xy.a.q;

import com.xy.a.q.IiiIiiiiIiIIi;
import com.xy.a.q.iIIiIiiiIiiIi;
import com.xy.bean.ChongjipackBean;
import com.xy.formula.MsgUntil;
import com.xy.q.IiIIIiiiiIIiI;
import com.xy.q.IiiiIiiiiIiIi;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.text.GameView;
import com.xy.w.IIIIIiiiIiiII;
import com.xy.w.IIIiiiiiIiIiI;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JScrollPane;

public class iIiIIiiiIIIiI
extends IiiiIiiiiIiIi {
    private JLabel IIiiIiiiIIiIi;
    private JComponent iIiIiiiiIiIii;
    private JLabel IiIIIiiiiIiiI;
    private JLabel iiIiiiiiiiIii;
    private IIIiiiiiIiIiI IiiiiiiiIIIII;
    private JScrollPane ALLATORIxDEMO;

    public void ALLATORIxDEMO(Object data) {
        ((IiiIiiiiIiIIi)data).iiiIiiiiiiIIi();
    }

    public void ALLATORIxDEMO(int day, List<ChongjipackBean> chongjipackBeans) {
        this.IIiiIiiiIIiIi.setText(MsgUntil.iIiIiiiiIIiii((int)day));
        if (chongjipackBeans == null) {
            chongjipackBeans = new ArrayList<ChongjipackBean>();
        }
        String IiiiiiiiIIIII = this.ALLATORIxDEMO().getLoginResult().getVipget();
        String[] IiiiiiiiIIIII2 = null;
        if (IiiiiiiiIIIII != null) {
            IiiiiiiiIIIII2 = IiiiiiiiIIIII.split("&&");
        }
        int IiiiiiiiIIIII3 = 0;
        while (IiiiiiiiIIIII3 < chongjipackBeans.size()) {
            IiiIiiiiIiIIi IiiiiiiiIIIII4 = (IiiIiiiiIiIIi)(IiiiiiiiIIIII3 < this.iIiIiiiiIiIii.getComponentCount() ? this.iIiIiiiiIiIii.getComponent(IiiiiiiiIIIII3) : null);
            if (IiiiiiiiIIIII4 == null) {
                IiiiiiiiIIIII4 = new IiiIiiiiIiIIi(this);
                this.iIiIiiiiIiIii.add((Component)IiiiiiiiIIIII4);
            }
            IiiiiiiiIIIII4.ALLATORIxDEMO(chongjipackBeans.get(IiiiiiiiIIIII3));
            IiiiiiiiIIIII4.ALLATORIxDEMO(IiiiiiiiIIIII2);
            int n = 50 * IiiiiiiiIIIII3;
            ++IiiiiiiiIIIII3;
            IiiiiiiiIIIII4.setBounds(0, n, 420, 50);
            IiiiiiiiIIIII4.setVisible(true);
        }
        IiiiiiiiIIIII3 = chongjipackBeans.size();
        int IiiiiiiiIIIII5 = this.iIiIiiiiIiIii.getComponentCount();
        while (IiiiiiiiIIIII3 < IiiiiiiiIIIII5) {
            Component component = this.iIiIiiiiIiIii.getComponent(IiiiiiiiIIIII3);
            ++IiiiiiiiIIIII3;
            ((IiiIiiiiIiIIi)component).ALLATORIxDEMO(null);
        }
        this.iIiIiiiiIiIii.setPreferredSize(new Dimension(446, 50 * chongjipackBeans.size()));
        this.ALLATORIxDEMO.getVerticalScrollBar().setValue(0);
        if (this.ALLATORIxDEMO().iIiIiiiiIIiii(this.iIiIiiiiIIiii()) != null) return;
        this.ALLATORIxDEMO().iIiIiiiiIIiIi(this.iIiIiiiiIIiii());
    }

    public iIiIIiiiIIIiI(GameView gameView) {
        super(134, 2, IiiiIiiiiIiIi.iIIIIiiiiiIIi, gameView);
        this.ALLATORIxDEMO(-1, 0, 520, 448, IiiiIiiiiIiIi.iiIIIiiiiiiiI);
        this.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/1.png", (int)68, (int)68, (int)68, (int)68, (boolean)false), "\u65b0\u533a\u51b2\u7ea7\u793c");
        this.iiIiiiiiiiIii = IiIIIiiiiIIiI.ALLATORIxDEMO((int)78, (int)23, (int)200, (int)24, (int)4, (Color)Color.black, (Font)iiIIiiiiIiiII.IiiIIiiiiiiiI);
        this.IiIIIiiiiIiiI = IiIIIiiiiIIiI.ALLATORIxDEMO((int)318, (int)23, (int)200, (int)24, (int)10, (Color)Color.black, (Font)iiIIiiiiIiiII.IiiIIiiiiiiiI);
        this.iiIiiiiiiiIii.setText("\u65b0\u533a\u51b2\u7ea7\u5012\u8ba1\u65f6");
        this.IiIIIiiiiIiiI.setText("\u5929,\u52a0\u6cb9\uff01");
        this.add(this.iiIiiiiiiiIii);
        this.add(this.IiIIIiiiiIiiI);
        this.IIiiIiiiIIiIi = IiIIIiiiiIIiI.ALLATORIxDEMO((int)278, (int)23, (int)48, (int)24, (int)0, (Color)Color.RED, (Font)iiIIiiiiIiiII.IiiIIiiiiiiiI);
        this.add(this.IIiiIiiiIIiIi);
        this.iIiIiiiiIiIii = new iIIiIiiiIiiIi(this);
        this.ALLATORIxDEMO = IiIIIiiiiIIiI.ALLATORIxDEMO((int)52, (int)60, (int)446, (int)360, (Component)this.iIiIiiiiIiIii, (int)20);
        this.add(this.ALLATORIxDEMO);
        this.IiiiiiiiIIIII = new IIIiiiiiIiIiI();
        this.IiiiiiiiIIIII.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/24.png", (int)2, (int)2, (int)2, (int)2, (boolean)false));
        this.IiiiiiiiIIIII.setBounds(48, 57, 448, 367);
        this.add((Component)this.IiiiiiiiIIIII);
    }

    public void iiiIiiiiiiIIi() {
        String IiiiiiiiIIIII = this.ALLATORIxDEMO().getLoginResult().getVipget();
        String[] IiiiiiiiIIIII2 = null;
        if (IiiiiiiiIIIII != null) {
            IiiiiiiiIIIII2 = IiiiiiiiIIIII.split("&&");
        }
        int IiiiiiiiIIIII3 = 0;
        int IiiiiiiiIIIII4 = this.iIiIiiiiIiIii.getComponentCount();
        while (IiiiiiiiIIIII3 < IiiiiiiiIIIII4) {
            IiiIiiiiIiIIi IiiiiiiiIIIII5 = (IiiIiiiiIiIIi)this.iIiIiiiiIiIii.getComponent(IiiiiiiiIIIII3);
            if (IiiiiiiiIIIII5.isVisible()) {
                IiiiiiiiIIIII5.ALLATORIxDEMO(IiiiiiiiIIIII2);
            }
            ++IiiiiiiiIIIII3;
        }
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (!this.iiiiIiiiIiiII) return;
        this.iiiiIiiiIiiII = false;
        this.ALLATORIxDEMO.updateUI();
    }
}
