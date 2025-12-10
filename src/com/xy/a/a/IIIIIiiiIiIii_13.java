/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.bean.SuitOperBean
 *  com.xy.i.IiIiIiiiiIIiI
 *  com.xy.q.IIiIiiiiIIiii
 *  com.xy.q.IiIIIiiiiIIiI
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.socket.Agreement
 *  com.xy.text.GameView
 *  com.xy.v.iiIiiiiiIIiii
 *  com.xy.w.IIIIIiiiIiiII
 *  com.xy.w.IIIiiiiiIiIiI
 */
package com.xy.a.a;

import com.xy.bean.SuitOperBean;
import com.xy.i.IiIiIiiiiIIiI;
import com.xy.q.IIiIiiiiIIiii;
import com.xy.q.IiIIIiiiiIIiI;
import com.xy.q.IiiiIiiiiIiIi;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import com.xy.v.iiIiiiiiIIiii;
import com.xy.w.IIIIIiiiIiiII;
import com.xy.w.IIIiiiiiIiIiI;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JLabel;

public class IIIIIiiiIiIii
extends IiiiIiiiiIiIi {
    private IIIiiiiiIiIiI iIiIiiiiIiIii;
    private List<BigDecimal> IiIIIiiiiIiiI;
    private IiIiIiiiiIIiI[] iiIiiiiiiiIii;
    private JLabel[] IiiiiiiiIIIII;
    private IIiIiiiiIIiii ALLATORIxDEMO;

    public IIIIIiiiIiIii(GameView gameView) {
        super(96, 2, IiiiIiiiiIiIi.iIIIIiiiiiIIi, gameView);
        this.ALLATORIxDEMO(-1, 0, 390, 365, IiiiIiiiiIiIi.iiIIIiiiiiiiI);
        this.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/1.png", (int)68, (int)68, (int)68, (int)68, (boolean)false), "\u9b42\u5f52");
        this.IiIIIiiiiIiiI = new ArrayList<BigDecimal>();
        this.iiIiiiiiiiIii = new IiIiIiiiiIIiI[2];
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iiIiiiiiiiIii.length) {
            this.iiIiiiiiiiIii[IiiiiiiiIIIII] = new IiIiIiiiiIIiI("sc/e/26.png", 1, 116, iiIIiiiiIiiII.iiiiIiiiIiiII, iiIIiiiiIiiII.IIiiiiiiIiiII, "", (IiiiIiiiiIiIi)this);
            this.iiIiiiiiiiIii[IiiiiiiiIIIII].setBounds(80 + IiiiiiiiIIIII * 151, 303, 99, 25);
            this.iiIiiiiiiiIii[IiiiiiiiIIIII].setText(IiiiiiiiIIIII == 0 ? "\u786e \u8ba4" : (IiiiiiiiIIIII == 1 ? "\u53d6 \u6d88" : ""));
            this.add((Component)this.iiIiiiiiiiIii[IiiiiiiiIIIII++]);
        }
        this.IiiiiiiiIIIII = new JLabel[2];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IiiiiiiiIIIII.length) {
            this.IiiiiiiiIIIII[IiiiiiiiIIIII] = IiIIIiiiiIIiI.ALLATORIxDEMO((int)58, (int)(25 + IiiiiiiiIIIII * 18), (int)309, (int)18, (Color)Color.red, (Font)iiIIiiiiIiiII.iiiiIiiiIiiII);
            this.IiiiiiiiIIIII[IiiiiiiiIIIII].setText(IiiiiiiiIIIII == 0 ? "\u6e29\u99a8\u63d0\u793a\uff1a\u53ef\u5de6\u952e\u9009\u4e2d\u591a\u4e2a\u8fdb\u884c\u9b42\u5f52\uff0c" : (IiiiiiiiIIIII == 1 ? "\u53f3\u952e\u53ef\u4ee5\u53d6\u6d88" : ""));
            this.add(this.IiiiiiiiIIIII[IiiiiiiiIIIII++]);
        }
        this.iIiIiiiiIiIii = new IIIiiiiiIiIiI();
        this.iIiIiiiiIiIii.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/19.png", (int)5, (int)5, (int)5, (int)5, (boolean)false));
        this.iIiIiiiiIiIii.setBounds(50, 68, 309, 207);
        this.add((Component)this.iIiIiiiiIiIii);
        this.ALLATORIxDEMO = new IIiIiiiiIIiii((IiiiIiiiiIiIi)this, 6, 4, 51, 51, 0, 0, 51, 70);
        this.ALLATORIxDEMO.ALLATORIxDEMO(IIIIIiiiIiiII.iiiIiiiiiiIIi((String)"sc/d/18.png"));
        this.add((Component)this.ALLATORIxDEMO);
    }

    public void iIiIiiiiIIiii() {
        this.IiIIIiiiiIiiI.clear();
        super.iIiIiiiiIIiii();
    }

    /*
     * WARNING - void declaration
     */
    public void iIiIiiiiIIiii(int id) {
        void IiiiiiiiIIIII;
        if (id != 116) {
            if (id != 117) return;
            this.ALLATORIxDEMO().iiiIiiiiiiIIi(this.iIiIiiiiIIiii());
            return;
        }
        if (this.IiIIIiiiiIiiI.size() == 0) {
            this.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u8bf7\u9009\u62e9\u81f3\u5c11\u4e00\u4e2a\u8981\u9b42\u5f52\u7684\u661f\u5361");
            return;
        }
        SuitOperBean suitOperBean = new SuitOperBean();
        IiiiiiiiIIIII.setGoods(this.IiIIIiiiiIiiI);
        IiiiiiiiIIIII.setType(57);
        String IiiiiiiiIIIII2 = Agreement.getSendTextAES((String)"suitoperate", (String)iiIiiiiiIIiii.ALLATORIxDEMO().toJson(IiiiiiiiIIIII));
        this.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII2);
    }

    public List<BigDecimal> ALLATORIxDEMO() {
        return this.IiIIIiiiiIiiI;
    }

    public void ALLATORIxDEMO(BigDecimal rgid) {
        if (this.IiIIIiiiiIiiI.remove(rgid)) return;
        this.IiIIIiiiiIiiI.add(rgid);
    }
}
