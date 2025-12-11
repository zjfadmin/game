/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.bean.ConfirmBean
 *  com.xy.entity.Mount
 *  com.xy.game.RoleData
 *  com.xy.i.IiIiIiiiiIIiI
 *  com.xy.q.IiIIIiiiiIIiI
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.q.iIiIiiiiIiIII
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.text.GameView
 *  com.xy.w.IIIIIiiiIiiII
 *  com.xy.w.IIIiiiiiIiIiI
 */
package com.xy.a.a;

import com.xy.bean.ConfirmBean;
import com.xy.entity.Mount;
import com.xy.game.RoleData;
import com.xy.i.IiIiIiiiiIIiI;
import com.xy.q.IiIIIiiiiIIiI;
import com.xy.q.IiiiIiiiiIiIi;
import com.xy.q.iIiIiiiiIiIII;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.text.GameView;
import com.xy.w.IIIIIiiiIiiII;
import com.xy.w.IIIiiiiiIiIiI;
import java.awt.Color;
import java.awt.Component;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JScrollPane;

public class MountJpanel3
extends IiiiIiiiiIiIi {
    private int iIiiIiiiiiiII;
    private JScrollPane IIiiIiiiIIiIi;
    private IiIiIiiiiIIiI iIiIiiiiIiIii;
    private int IiIIIiiiiIiiI;
    private JList<String> iiIiiiiiiiIii;
    private DefaultListModel<String> IiiiiiiiIIIII;
    private IIIiiiiiIiIiI[] ALLATORIxDEMO;

    public void ALLATORIxDEMO(int id, int index) {
        this.iIiiIiiiiiiII = id;
        this.IiIIIiiiiIiiI = index;
        this.iiiIiiiiiiIIi();
        this.ALLATORIxDEMO().iIiIiiiiIIiIi(this.iIiIiiiiIIiii());
    }

    public MountJpanel3(GameView gameView) {
        super(173, 3, IiiiIiiiiIiIi.iIIIIiiiiiIIi, gameView);
        this.ALLATORIxDEMO(-1, 0, 282, 345, IiiiIiiiiIiIi.iiIIIiiiiiiiI);
        this.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/1.png", (int)68, (int)68, (int)68, (int)68, (boolean)false), "\u9009\u62e9\u5750\u9a91");
        this.iIiIiiiiIiIii = new IiIiIiiiiIIiI("sc/e/7.png", 1, 201, iiIIiiiiIiiII.iiiiIiiiIiiII, iiIIiiiiIiiII.IIiiiiiiIiiII, "\u786e\u5b9a", (IiiiIiiiiIiIi)this);
        this.iIiIiiiiIiIii.setBounds(124, 297, 59, 25);
        this.add((Component)this.iIiIiiiiIiIii);
        this.IiiiiiiiIIIII = new DefaultListModel();
        this.iiIiiiiiiiIii = new JList();
        this.iiIiiiiiiiIii.setOpaque(false);
        this.iiIiiiiiiiIii.setSelectionBackground(iIiIiiiiIiIII.iiiIiiiiiiiIi);
        this.iiIiiiiiiiIii.setSelectionForeground(Color.white);
        this.iiIiiiiiiiIii.setForeground(Color.white);
        this.iiIiiiiiiiIii.setFont(iiIIiiiiIiiII.iIiIIiiiiIIiI);
        this.iiIiiiiiiiIii.setBackground(iiIIiiiiIiiII.IIiIiiiiIIiII);
        this.iiIiiiiiiiIii.setModel(this.IiiiiiiiIIIII);
        this.IIiiIiiiIIiIi = IiIIIiiiiIIiI.ALLATORIxDEMO((int)54, (int)59, (int)197, (int)229, this.iiIiiiiiiiIii, (int)20);
        this.add(this.IIiiIiiiIIiIi);
        this.ALLATORIxDEMO = new IIIiiiiiIiIiI[2];
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.ALLATORIxDEMO.length) {
            this.ALLATORIxDEMO[IiiiiiiiIIIII] = new IIIiiiiiIiIiI();
            if (IiiiiiiiIIIII == 0) {
                this.ALLATORIxDEMO[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/25.png", (int)2, (int)2, (int)2, (int)2, (boolean)false));
                this.ALLATORIxDEMO[IiiiiiiiIIIII].setBounds(52, 38, 200, 21);
            } else if (IiiiiiiiIIIII == 1) {
                this.ALLATORIxDEMO[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/24.png", (int)2, (int)2, (int)2, (int)2, (boolean)false));
                this.ALLATORIxDEMO[IiiiiiiiIIIII].setBounds(52, 38, 200, 250);
            }
            this.add((Component)this.ALLATORIxDEMO[IiiiiiiiIIIII++]);
        }
    }

    public void iIiIiiiiIIiii() {
        this.iiiIiiiiiiIIi();
        super.iIiIiiiiIIiii();
    }

    public void iIiIiiiiIIiii(int type) {
        Mount IiiiiiiiIIIII;
        if (type != 201) return;
        RoleData IiiiiiiiIIIII2 = this.ALLATORIxDEMO();
        Mount mount = IiiiiiiiIIIII = this.iiIiiiiiiiIii.getSelectedIndex() >= 0 ? (Mount)IiiiiiiiIIIII2.mounts.get(this.iiIiiiiiiiIii.getSelectedIndex()) : null;
        if (IiiiiiiiIIIII == null) {
            this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u6ca1\u6709\u9009\u4e2d\u7684\u5750\u9a91");
            return;
        }
        this.ALLATORIxDEMO().iiiIiiiiiiIIi(this.iIiIiiiiIIiii());
        if (this.iIiiIiiiiiiII == 0) {
            this.iiIIiiiiIiIIi.ALLATORIxDEMO(new ConfirmBean(32, "SHGZ" + IiiiiiiiIIIII.getMountid() + "|" + this.iIiiIiiiiiiII + "|" + this.IiIIIiiiiIiiI, "#W\u5750\u9a91\u79fb\u5165\u5b88\u62a4\u69fd\u540e\uff0c\u53ef#G\u83b7\u5f97\u5b88\u62a4\u77f3\u52a0\u6301#W\u3002\u5750\u9a91\u79fb\u5165\u5b88\u62a4\u69fd\u9700\u8981\u82b1\u8d39#G30W#W\u94f6\u4e24,\u786e\u8ba4\u9009\u62e9\u6b64\u5750\u9a91\u5417\uff1f"));
            return;
        }
        this.iiIIiiiiIiIIi.ALLATORIxDEMO(new ConfirmBean(32, "SHGZ" + IiiiiiiiIIIII.getMountid() + "|" + this.iIiiIiiiiiiII + "|" + this.IiIIIiiiiIiiI, "#W\u786e\u8ba4\u9009\u62e9\u6b64\u5750\u9a91\u79fb\u5165\u5b88\u62a4\u69fd\u5417\uff1f"));
    }

    public void iiiIiiiiiiIIi() {
        RoleData IiiiiiiiIIIII = this.ALLATORIxDEMO();
        this.IiiiiiiiIIIII.removeAllElements();
        int IiiiiiiiIIIII2 = 0;
        while (IiiiiiiiIIIII2 < IiiiiiiiIIIII.mounts.size()) {
            Mount IiiiiiiiIIIII3 = (Mount)IiiiiiiiIIIII.mounts.get(IiiiiiiiIIIII2);
            ++IiiiiiiiIIIII2;
            this.IiiiiiiiIIIII.addElement(IiiiiiiiIIIII3.getMountname());
        }
        this.iiIiiiiiiiIii.clearSelection();
    }
}
