/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.iiIIIiiiiiIII
 *  com.xy.d.iiIiIiiiiIiii
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.text.GameView
 */
package com.xy.a;

import com.xy.a.iiIIIiiiiiIII;
import com.xy.d.iiIiIiiiiIiii;
import com.xy.q.IiiiIiiiiIiIi;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.text.GameView;
import java.awt.Color;
import java.awt.Point;
import java.math.BigDecimal;
import javax.swing.JList;
import javax.swing.event.ListSelectionListener;

public class IiiIiiiiIIIIi
extends IiiiIiiiiIiIi {
    private String IiIIIiiiiIiiI;
    private String[] iiIiiiiiiiIii;
    private JList<String> IiiiiiiiIIIII;
    private BigDecimal ALLATORIxDEMO;

    public void ALLATORIxDEMO(BigDecimal id, String name) {
        this.ALLATORIxDEMO = id;
        this.IiIIIiiiiIiiI = name;
        this.IiiiiiiiIIIII.clearSelection();
        Point IiiiiiiiIIIII = this.ALLATORIxDEMO().iIiIiiiiIIiii(99, 147);
        this.iIiIiiiiIIiii(Math.min(IiiiiiiiIIIII.x, this.iiIIiiiiIiIIi.screenData.Screen_x - 99), IiiiiiiiIIIII.y, 99, 147);
        this.ALLATORIxDEMO().iIiIiiiiIIiIi(this.iIiIiiiiIIiii());
    }

    public IiiIiiiiIIIIi(GameView gameView) {
        super(77, 2, IiiiIiiiiIiIi.iIIiIiiiiiiIi, gameView);
        this.ALLATORIxDEMO(80, 100, 99, 147, IiiiIiiiiIiIi.iIIiIiiiiiiIi);
        this.iiiIiiiiiiIIi("sc/c/59");
        this.IiiiiiiiIIIII = new JList();
        this.IiiiiiiiIIIII.setOpaque(false);
        this.IiiiiiiiIIIII.setBackground(iiIIiiiiIiiII.IIiIiiiiIIiII);
        this.IiiiiiiiIIIII.setForeground(Color.white);
        this.IiiiiiiiIIIII.setFont(iiIIiiiiIiiII.iIiIIiiiiIIiI);
        this.IiiiiiiiIIIII.setSelectionForeground(Color.white);
        this.IiiiiiiiIIIII.setSelectionBackground(iiIIiiiiIiiII.IIiIiiiiIIiII);
        this.IiiiiiiiIIIII.addListSelectionListener((ListSelectionListener)new iiIIIiiiiiIII(this));
        this.iiIiiiiiiiIii = new String[]{"\u4ea4\u6613", "\u7ec4\u961f", "\u52a0\u597d\u53cb", "\u5173\u95ed"};
        this.IiiiiiiiIIIII.setListData((String[])this.iiIiiiiiiiIii);
        this.IiiiiiiiIIIII.setBounds(1, 3, 94, 140);
        this.add(this.IiiiiiiiIIIII);
    }

    static /* synthetic */ JList ALLATORIxDEMO(IiiIiiiiIIIIi arg0) {
        return arg0.IiiiiiiiIIIII;
    }

    public void iIiIiiiiIIiii(int v) {
        this.ALLATORIxDEMO().iiiIiiiiiiIIi(this.iIiIiiiiIIiii());
        if (v == -1) return;
        if (v == 3) {
            return;
        }
        if (v == 2) {
            iiIiIiiiiIiii.ALLATORIxDEMO((BigDecimal)this.ALLATORIxDEMO, (String)this.IiIIIiiiiIiiI, (GameView)this.ALLATORIxDEMO());
            return;
        }
        if (v == 1) {
            iiIiIiiiiIiii.ALLATORIxDEMO((BigDecimal)this.ALLATORIxDEMO, (GameView)this.ALLATORIxDEMO());
            return;
        }
        iiIiIiiiiIiii IiiiiiiiIIIII = this.ALLATORIxDEMO().mapScene.ALLATORIxDEMO(this.ALLATORIxDEMO);
        if (IiiiiiiiIIIII == null) {
            this.ALLATORIxDEMO().iIiIiiiiIIiii("\u73a9\u5bb6\u79bb\u4f60\u592a\u8fdc\u4e86");
            return;
        }
        if (IiiiiiiiIIIII == this.ALLATORIxDEMO().roleUnit) {
            this.ALLATORIxDEMO().iIiIiiiiIIiii("\u4e0d\u80fd\u5bf9\u81ea\u5df1\u64cd\u4f5c");
            return;
        }
        if (v != 0) return;
        iiIiIiiiiIiii.ALLATORIxDEMO((iiIiIiiiiIiii)IiiiiiiiIIIII, (GameView)this.ALLATORIxDEMO());
    }
}
