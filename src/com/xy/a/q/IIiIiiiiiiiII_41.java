/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.bean.ChongjipackBean
 *  com.xy.bean.XXGDBean
 *  com.xy.i.IiiiiiiiiIIII
 *  com.xy.q.IIIiiiiiIiIiI
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.readbean.Goodstable
 *  com.xy.socket.Agreement
 *  com.xy.text.GameView
 *  com.xy.v.IIiiIiiiiIIiI
 *  com.xy.v.iIiIIiiiIiiiI
 *  com.xy.v.iiiiiiiiIIIII
 *  com.xy.w.IIIIIiiiIiiII
 *  com.xy.w.IIIiiiiiIiIiI
 */
package com.xy.a.q;

import com.xy.bean.ChongjipackBean;
import com.xy.bean.XXGDBean;
import com.xy.i.IiiiiiiiiIIII;
import com.xy.q.IiiiIiiiiIiIi;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.readbean.Goodstable;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import com.xy.v.IIiiIiiiiIIiI;
import com.xy.v.iIiIIiiiIiiiI;
import com.xy.v.iiiiiiiiIIIII;
import com.xy.w.IIIIIiiiIiiII;
import com.xy.w.IIIiiiiiIiIiI;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.List;

public class IIiIiiiiiiiII
extends IiiiIiiiiIiIi {
    private com.xy.q.IIIiiiiiIiIiI IIiiIiiiIIiIi;
    private String iIiIiiiiIiIii;
    private String IiIIIiiiiIiiI;
    private IIIiiiiiIiIiI iiIiiiiiiiIii;
    private IiiiiiiiiIIII IiiiiiiiIIIII;
    private IIIiiiiiIiIiI ALLATORIxDEMO;

    public IIiIiiiiiiiII(GameView gameView) {
        super(102, 2, IiiiIiiiiIiIi.iIIIIiiiiiIIi, gameView);
        this.ALLATORIxDEMO(-1, 0, 298, 316, IiiiIiiiiIiIi.iiIIIiiiiiiiI);
        this.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/1.png", (int)68, (int)68, (int)68, (int)68, (boolean)false), "\u6bcf\u65e5\u7279\u60e0");
        this.iIiIiiiiIIiii(false);
        this.ALLATORIxDEMO(new iiiiiiiiIIIII(14, 0, 0, 34));
        this.iiIiiiiiiiIii = new IIIiiiiiIiIiI("sc/b/S12.png");
        this.iiIiiiiiiiIii.setBounds(48, 20, 230, 77);
        this.add((Component)this.iiIiiiiiiiIii);
        this.IIiiIiiiIIiIi = new com.xy.q.IIIiiiiiIiIiI((IiiiIiiiiIiIi)this);
        this.IIiiIiiiIIiIi.setBounds(107, 108, 100, 100);
        this.add((Component)this.IIiiIiiiIIiIi);
        this.ALLATORIxDEMO = new IIIiiiiiIiIiI(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/4.png", (int)6, (int)6, (int)6, (int)6, (boolean)false));
        this.ALLATORIxDEMO.setBounds(100, 111, 115, 115);
        this.add((Component)this.ALLATORIxDEMO);
        this.IiiiiiiiIIIII = new IiiiiiiiiIIII("sc/e/7.png", 1, 122, iiIIiiiiIiiII.iiiiIiiiIiiII, iiIIiiiiIiiII.IIiiiiiiIiiII, "\u8d2d\u4e70", (IiiiIiiiiIiIi)this);
        this.IiiiiiiiIIIII.setBounds(173, 244, 59, 25);
        this.add((Component)this.IiiiiiiiIIIII);
    }

    public void ALLATORIxDEMO(ChongjipackBean chongjipackBean) {
        if (chongjipackBean != null) {
            long IiiiiiiiIIIII = iIiIIiiiIiiiI.iIiIiiiiIIiii();
            String IiiiiiiiIIIII2 = new SimpleDateFormat("yyyy-MM-dd").format(IiiiiiiiIIIII);
            if (!IIiiIiiiiIIiI.ALLATORIxDEMO((String)chongjipackBean.getHuitime(), (String)IiiiiiiiIIIII2)) {
                chongjipackBean = null;
            }
        }
        if (chongjipackBean == null) {
            this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u6682\u65e0\u6bcf\u65e5\u7279\u60e0");
            return;
        }
        List IiiiiiiiIIIII = ChongjipackBean.getGoods((String)chongjipackBean.getPackgoods());
        Goodstable goodstable = this.ALLATORIxDEMO().ALLATORIxDEMO(((XXGDBean)IiiiiiiiIIIII.get(0)).getId());
        this.IIiiIiiiIIiIi.ALLATORIxDEMO(1, (Object)goodstable);
        this.iIiIiiiiIiIii = goodstable.getGoodsname();
        this.IiIIIiiiiIiiI = chongjipackBean.getCanpaymoney() + "\u4ed9\u7389";
        this.ALLATORIxDEMO().iIiIiiiiIIiIi(this.iIiIiiiiIIiii());
    }

    public void iiiIiiiiiiIIi() {
        if (this.ALLATORIxDEMO().getGoodPackSum(-1L, new BigDecimal(-1), 1) < 1) {
            this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u4f60\u7684\u80cc\u5305\u4e0d\u591f");
            return;
        }
        String IiiiiiiiIIIII = Agreement.getSendTextAES((String)"Dayforonesure", null);
        this.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII);
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (this.iIiIiiiiIiIii != null) {
            g.setFont(iiIIiiiiIiiII.iIiIIiiiiIIiI);
            g.drawString(this.iIiIiiiiIiIii, 100, 238);
        }
        if (this.IiIIIiiiiIiiI == null) return;
        g.setFont(iiIIiiiiIiiII.iIiIIiiiiIIiI);
        g.setColor(Color.red);
        g.drawString(this.IiIIIiiiiIiiI, 100, 258);
    }
}
