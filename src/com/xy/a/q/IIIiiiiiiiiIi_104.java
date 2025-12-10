/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.q.iiIiiiiiIIiii
 *  com.xy.bean.LoginResult
 *  com.xy.q.IiIIIiiiiIIiI
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.q.iiIiIiiiiIiIi
 *  com.xy.readbean.Shop
 *  com.xy.text.GameView
 *  com.xy.w.IIIIIiiiIiiII
 *  com.xy.w.IIIiiiiiIiIiI
 */
package com.xy.a.q;

import com.xy.a.q.iiIiiiiiIIiii;
import com.xy.bean.LoginResult;
import com.xy.q.IiIIIiiiiIIiI;
import com.xy.q.IiiiIiiiiIiIi;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.q.iiIiIiiiiIiIi;
import com.xy.readbean.Shop;
import com.xy.text.GameView;
import com.xy.w.IIIIIiiiIiiII;
import com.xy.w.IIIiiiiiIiIiI;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class IIIiiiiiiiiIi
extends IiiiIiiiiIiIi {
    private JScrollPane iIiiIiiiiiiII;
    private JPanel IIiiIiiiIIiIi;
    private IIIiiiiiIiIiI iIiIiiiiIiIii;
    private JLabel IiIIIiiiiIiiI;
    private IIIiiiiiIiIiI iiIiiiiiiiIii;
    private iiIiIiiiiIiIi IiiiiiiiIIIII;
    private IIIiiiiiIiIiI ALLATORIxDEMO;

    public void iiiIiiiiiiIIi() {
        LoginResult IiiiiiiiIIIII = this.ALLATORIxDEMO().getLoginResult();
        this.IiiiiiiiIIIII.ALLATORIxDEMO(IiiiiiiiIIIII.getScoretype(this.IiIIIiiiiIiiI.getText()).longValue());
    }

    /*
     * Unable to fully structure code
     */
    public void ALLATORIxDEMO(List<Shop> shopList, String integralType) {
        block5: {
            block4: {
                IiiiiiiiIIIII = this.IIiiIiiiIIiIi.getComponents();
                if (IiiiiiiiIIIII.length < shopList.size()) break block4;
                IiiiiiiiIIIII = 0;
                if (true) ** GOTO lbl12
            }
            if (IiiiiiiiIIIII.length >= shopList.size()) break block5;
            IiiiiiiiIIIII = 0;
            if (true) ** GOTO lbl25
            do {
                IiiiiiiiIIIII = (iiIiiiiiIIiii)this.IIiiIiiiIIiIi.getComponent(IiiiiiiiIIIII);
                IiiiiiiiIIIII.ALLATORIxDEMO(shopList.get(IiiiiiiiIIIII++));
lbl12:
                // 2 sources

            } while (IiiiiiiiIIIII < shopList.size());
            IiiiiiiiIIIII = shopList.size();
            while (IiiiiiiiIIIII < IiiiiiiiIIIII.length) {
                v0 = (iiIiiiiiIIiii)this.IIiiIiiiIIiIi.getComponent(IiiiiiiiIIIII);
                ++IiiiiiiiIIIII;
                IiiiiiiiIIIII = v0;
                IiiiiiiiIIIII.ALLATORIxDEMO();
            }
            this.IIiiIiiiIIiIi.setPreferredSize(new Dimension(656, 65 * (shopList.size() % 2 == 0 ? shopList.size() / 2 : shopList.size() / 2 + 1)));
            break block5;
            do {
                IiiiiiiiIIIII = (iiIiiiiiIIiii)this.IIiiIiiiIIiIi.getComponent(IiiiiiiiIIIII);
                IiiiiiiiIIIII.ALLATORIxDEMO(shopList.get(IiiiiiiiIIIII++));
lbl25:
                // 2 sources

            } while (IiiiiiiiIIIII < IiiiiiiiIIIII.length);
            IiiiiiiiIIIII = IiiiiiiiIIIII.length;
            while (IiiiiiiiIIIII < shopList.size()) {
                IiiiiiiiIIIII = IiiiiiiiIIIII / 2;
                IiiiiiiiIIIII = IiiiiiiiIIIII % 2;
                var7_10 = new iiIiiiiiIIiii((IiiiIiiiiIiIi)this, shopList.get(IiiiiiiiIIIII));
                IiiiiiiiIIIII.setBounds(IiiiiiiiIIIII * 259 + 0, IiiiiiiiIIIII * 65 + 0, 250, 65);
                ++IiiiiiiiIIIII;
                this.IIiiIiiiIIiIi.add((Component)IiiiiiiiIIIII);
            }
            this.IIiiIiiiIIiIi.setPreferredSize(new Dimension(656, 65 * (shopList.size() % 2 == 0 ? shopList.size() / 2 : shopList.size() / 2 + 1)));
        }
        this.iIiiIiiiiiiII.updateUI();
        this.iIiiIiiiiiiII.invalidate();
        this.iIiiIiiiiiiII.validate();
        this.iIiiIiiiiiiII.repaint();
        this.IiIIIiiiiIiiI.setText(integralType);
        this.iiiIiiiiiiIIi();
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (!this.iiIIiiiiIiIIi.iIiIiiiiIIiii()) return;
        this.iiiIiiiiiiIIi();
    }

    public IIIiiiiiiiiIi(GameView gameView) {
        super(88, 2, IiiiIiiiiIiIi.iIIIIiiiiiIIi, gameView);
        this.ALLATORIxDEMO(-1, 0, 588, 478, IiiiIiiiiIiIi.iiIIIiiiiiiiI);
        this.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/1.png", (int)68, (int)68, (int)68, (int)68, (boolean)false), "\u79ef\u5206\u5151\u6362");
        this.IIiiIiiiIIiIi = new JPanel();
        this.IIiiIiiiIIiIi.setOpaque(false);
        this.IIiiIiiiIIiIi.setLayout(null);
        this.iIiiIiiiiiiII = IiIIIiiiiIIiI.ALLATORIxDEMO((int)50, (int)99, (int)512, (int)354, (Component)this.IIiiIiiiIIiIi, (int)30);
        this.add(this.iIiiIiiiiiiII);
        this.iIiiIiiiiiiII.updateUI();
        this.iIiiIiiiiiiII.invalidate();
        this.iIiiIiiiiiiII.validate();
        this.iIiiIiiiiiiII.repaint();
        this.IiIIIiiiiIiiI = IiIIIiiiiIIiI.ALLATORIxDEMO((int)382, (int)53, (int)80, (int)20, (int)10, (Color)iiIIiiiiIiiII.ALLATORIxDEMO((String)"#c000000"), (Font)iiIIiiiiIiiII.iiiiIiiiIiiII);
        this.IiIIIiiiiIiiI.setText("\u79ef\u5206\u7c7b\u578b");
        this.add(this.IiIIIiiiiIiiI);
        this.IiiiiiiiIIIII = IiIIIiiiiIIiI.ALLATORIxDEMO((int)10, (Color)Color.white, (Font)iiIIiiiiIiiII.iIIIiiiiIIIii, null, (GameView)gameView);
        this.IiiiiiiiIIIII.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/17.png", (int)3, (int)3, (int)3, (int)3, (boolean)false));
        this.IiiiiiiiIIIII.setBounds(462, 53, 100, 20);
        this.IiiiiiiiIIIII.ALLATORIxDEMO(2);
        this.IiiiiiiiIIIII.setText("0");
        this.add((Component)this.IiiiiiiiIIIII);
        this.ALLATORIxDEMO = new IIIiiiiiIiIiI(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/35.png", (int)80, (int)10, (int)80, (int)10, (boolean)false));
        this.ALLATORIxDEMO.setBounds(38, 30, 517, 20);
        this.add((Component)this.ALLATORIxDEMO);
        this.iIiIiiiiIiIii = new IIIiiiiiIiIiI(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/25.png", (int)2, (int)2, (int)2, (int)2, (boolean)false));
        this.iiIiiiiiiiIii = new IIIiiiiiIiIiI(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/24.png", (int)2, (int)2, (int)2, (int)2, (boolean)false));
        this.iIiIiiiiIiIii.setBounds(49, 78, 514, 21);
        this.iiIiiiiiiiIii.setBounds(49, 78, 514, 377);
        this.add((Component)this.iIiIiiiiIiIii);
        this.add((Component)this.iiIiiiiiiiIii);
    }
}
