/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.q.IIIiiiiiIiIIi
 *  com.xy.bean.AssetUpdate
 *  com.xy.bean.QuackGameBean
 *  com.xy.c.IiiiIiiiiIIII
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.readbean.Goodstable
 *  com.xy.socket.Agreement
 *  com.xy.text.GameView
 *  com.xy.w.IIIIIiiiIiIii
 */
package com.xy.a.q;

import com.xy.a.q.IIIiiiiiIiIIi;
import com.xy.bean.AssetUpdate;
import com.xy.bean.QuackGameBean;
import com.xy.c.IiiiIiiiiIIII;
import com.xy.q.IiiiIiiiiIiIi;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.readbean.Goodstable;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import com.xy.w.IIIIIiiiIiIii;
import java.awt.Color;
import java.awt.Component;
import java.awt.Image;
import java.math.BigDecimal;
import javax.swing.JLabel;

public class iIiIIiiiiiiii
extends IiiiIiiiiIiIi {
    private int IiIiiiiiIIIII = 1;
    private JLabel iiIiIiiiiIIIi;
    private QuackGameBean iiiiIiiiIiiII;
    private IIIIIiiiIiIii iiiIiiiiiiiIi;
    private BigDecimal iIiiIiiiiiiII;
    private IIIiiiiiIiIIi[] IIiiIiiiIIiIi;
    private BigDecimal iIiIiiiiIiIii;
    private String IiIIIiiiiIiiI;
    private static Image iiIiiiiiiiIii;
    private BigDecimal IiiiiiiiIIIII;
    private BigDecimal ALLATORIxDEMO;

    public void iiiIiiiiiiIIi(QuackGameBean gameBean) {
        this.ALLATORIxDEMO = gameBean.getMoney();
        this.iIiIiiiiIIiIi(gameBean.getPetmsg2());
        String[] IiiiiiiiIIIII = gameBean.getPetmsg() != null && !gameBean.getPetmsg().equals("") ? gameBean.getPetmsg().split("\\|") : null;
        int IiiiiiiiIIIII2 = 0;
        while (IiiiiiiiIIIII2 < this.IIiiIiiiIIiIi.length) {
            if (IiiiiiiiIIIII == null || IiiiiiiiIIIII2 >= IiiiiiiiIIIII.length || IiiiiiiiIIIII[IiiiiiiiIIIII2].equals("null")) {
                this.IIiiIiiiIIiIi[IiiiiiiiIIIII2].ALLATORIxDEMO(null, 0);
            } else {
                String[] IiiiiiiiIIIII3 = IiiiiiiiIIIII[IiiiiiiiIIIII2].split("_");
                Goodstable IiiiiiiiIIIII4 = this.ALLATORIxDEMO().ALLATORIxDEMO(new BigDecimal(IiiiiiiiIIIII3[0]));
                this.IIiiIiiiIIiIi[IiiiiiiiIIIII2].ALLATORIxDEMO(IiiiiiiiIIIII4, Integer.parseInt(IiiiiiiiIIIII3[1]));
                this.IIiiIiiiIIiIi[IiiiiiiiIIIII2].ALLATORIxDEMO(gameBean.getIndex() == IiiiiiiiIIIII2 ? 1 : 2);
            }
            ++IiiiiiiiIIIII2;
        }
        if (this.ALLATORIxDEMO().iIiIiiiiIIiii(this.iIiIiiiiIIiii()) != null) return;
        this.ALLATORIxDEMO().iIiIiiiiIIiIi(this.iIiIiiiiIIiii());
    }

    static /* synthetic */ IIIIIiiiIiIii ALLATORIxDEMO(iIiIIiiiiiiii arg0) {
        return arg0.iiiIiiiiiiiIi;
    }

    static /* synthetic */ void ALLATORIxDEMO(iIiIIiiiiiiii arg0, IIIIIiiiIiIii arg1) {
        arg0.iiiIiiiiiiiIi = arg1;
    }

    public boolean ALLATORIxDEMO() {
        if (this.iiiiIiiiIiiII == null && this.IiIiiiiiIIIII != 0) {
            if (this.IiIiiiiiIIIII <= 0) return super.ALLATORIxDEMO();
            String IiiiiiiiIIIII = Agreement.getSendTextAES((String)"getfivemsg", (String)("PP" + this.ALLATORIxDEMO));
            this.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII);
            return super.ALLATORIxDEMO();
        }
        this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u62bd\u5956\u8fd8\u6ca1\u6709\u7ed3\u675f\u65e0\u6cd5\u5173\u95ed\u9762\u677f");
        return false;
    }

    public synchronized void iIiIiiiiIIiii(QuackGameBean bean) {
        this.ALLATORIxDEMO(bean);
    }

    public synchronized void iIiIiiiiIIiIi(String value) {
        String[] IiiiiiiiIIIII = value.split("=");
        this.iIiiIiiiiiiII = !IiiiiiiiIIIII[0].equals("null") ? new BigDecimal(IiiiiiiiIIIII[0]) : null;
        this.IiIIIiiiiIiiI = !IiiiiiiiIIIII[1].equals("null") ? IiiiiiiiIIIII[1] : null;
        this.iIiIiiiiIiIii = !IiiiiiiiIIIII[2].equals("null") ? new BigDecimal(IiiiiiiiIIIII[2]) : null;
        this.IiIiiiiiIIIII = Integer.parseInt(IiiiiiiiIIIII[3]);
        if (IiiiiiiiIIIII.length == 5) {
            BigDecimal bigDecimal = this.IiiiiiiiIIIII = !IiiiiiiiIIIII[4].equals("null") ? new BigDecimal(IiiiiiiiIIIII[4]) : null;
        }
        if (this.IiIiiiiiIIIII == -1) {
            this.iiIiIiiiiIIIi.setText("\u7ffb\u724c\u6b21\u6570\u5df2\u7528\u5b8c");
            return;
        }
        if (this.IiIiiiiiIIIII == 0 || this.iIiiIiiiiiiII == null && this.IiIIIiiiiIiiI == null) {
            this.iiIiIiiiiIIIi.setText("\u514d\u8d39\u7ffb\u4e00\u5f20\u724c");
            return;
        }
        if (this.iIiiIiiiiiiII == null) {
            this.iiIiIiiiiIIIi.setText("\u7ffb\u724c\u6d88\u8017" + this.iIiIiiiiIiIii.longValue() * (long)this.IiIiiiiiIIIII + this.IiIIIiiiiIiiI);
            return;
        }
        Goodstable IiiiiiiiIIIII2 = this.ALLATORIxDEMO().ALLATORIxDEMO(this.iIiiIiiiiiiII);
        if (IiiiiiiiIIIII2 == null) {
            this.iiIiIiiiiIIIi.setText("\u6570\u636e\u5f02\u5e38");
            return;
        }
        if (this.IiIIIiiiiIiiI == null) {
            this.iiIiIiiiiIIIi.setText("\u7ffb\u724c\u6d88\u8017" + this.IiIiiiiiIIIII + "\u4e2a" + IiiiiiiiIIIII2.getGoodsname());
            return;
        }
        this.iiIiIiiiiIIIi.setText("\u7ffb\u724c\u6d88\u8017" + this.IiIiiiiiIIIII + "\u4e2a" + IiiiiiiiIIIII2.getGoodsname() + ",\u7269\u54c1\u4e0d\u8db3\u65f6\u53ef\u4ee5\u7528" + this.iIiIiiiiIiIii.longValue() + this.IiIIIiiiiIiiI + "\u62b5\u6d88");
    }

    static /* synthetic */ int ALLATORIxDEMO(iIiIIiiiiiiii arg0) {
        return arg0.IiIiiiiiIIIII;
    }

    static /* synthetic */ Image ALLATORIxDEMO() {
        return iiIiiiiiiiIii;
    }

    static /* synthetic */ void ALLATORIxDEMO(Image arg0) {
        iiIiiiiiiiIii = arg0;
    }

    public synchronized void ALLATORIxDEMO(QuackGameBean bean) {
        if (this.iiiiIiiiIiiII != null) {
            IiiiIiiiiIIII.ALLATORIxDEMO((AssetUpdate)this.iiiiIiiiIiiII.getAssetUpdate(), (GameView)this.iiIIiiiiIiIIi);
            this.iIiIiiiiIIiIi(this.iiiiIiiiIiiII.getPetmsg2());
        }
        this.iiiiIiiiIiiII = bean;
        if (bean == null) return;
        this.iiiIiiiiiiIIi(bean);
    }

    static /* synthetic */ BigDecimal iIiIiiiiIIiii(iIiIIiiiiiiii arg0) {
        return arg0.ALLATORIxDEMO;
    }

    static /* synthetic */ BigDecimal ALLATORIxDEMO(iIiIIiiiiiiii arg0) {
        return arg0.iIiiIiiiiiiII;
    }

    public iIiIIiiiiiiii(GameView gameView) {
        super(127, 2, IiiiIiiiiIiIi.iIIIIiiiiiIIi, gameView);
        this.ALLATORIxDEMO(-1, 0, 747, 340, IiiiIiiiiIiIi.iIIiIiiiiiiIi);
        this.iiiIiiiiiiIIi("sc/b/S300.png");
        this.IIiiIiiiIIiIi = new IIIiiiiiIiIIi[4];
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IIiiIiiiIIiIi.length) {
            this.IIiiIiiiIIiIi[IiiiiiiiIIIII] = new IIIiiiiiIiIIi(this, IiiiiiiiIIIII);
            this.IIiiIiiiIIiIi[IiiiiiiiIIIII].setBounds(140 + 120 * IiiiiiiiIIIII, 100, 120, 188);
            this.IIiiIiiiIIiIi[IiiiiiiiIIIII].ALLATORIxDEMO(this.ALLATORIxDEMO().ALLATORIxDEMO(new BigDecimal(100)), 12);
            this.add((Component)this.IIiiIiiiIIiIi[IiiiiiiiIIIII++]);
        }
        this.iiIiIiiiiIIIi = new JLabel("\u514d\u8d39\u7ffb\u4e00\u5f20\u724c", 0);
        this.iiIiIiiiiIIIi.setBounds(230, 300, 300, 20);
        this.iiIiIiiiiIIIi.setFont(iiIIiiiiIiiII.iiIiIiiiIiiII);
        this.iiIiIiiiiIIIi.setForeground(Color.WHITE);
        this.add(this.iiIiIiiiiIIIi);
    }
}
