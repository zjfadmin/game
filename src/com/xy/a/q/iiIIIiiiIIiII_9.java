/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.q.iiIIiiiiiIIII
 *  com.xy.bean.AssetUpdate
 *  com.xy.bean.QuackGameBean
 *  com.xy.c.IiiiIiiiiIIII
 *  com.xy.i.IiiiiiiiiIIII
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.readbean.Goodstable
 *  com.xy.socket.Agreement
 *  com.xy.text.GameView
 *  com.xy.v.iIiIIiiiIiiiI
 *  com.xy.w.IIIIIiiiIiIii
 *  com.xy.w.iiiiiiiiiiIiI
 */
package com.xy.a.q;

import com.xy.a.q.iiIIiiiiiIIII;
import com.xy.bean.AssetUpdate;
import com.xy.bean.QuackGameBean;
import com.xy.c.IiiiIiiiiIIII;
import com.xy.i.IiiiiiiiiIIII;
import com.xy.q.IiiiIiiiiIiIi;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.readbean.Goodstable;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import com.xy.v.iIiIIiiiIiiiI;
import com.xy.w.IIIIIiiiIiIii;
import com.xy.w.iiiiiiiiiiIiI;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JLabel;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class iiIIIiiiIIiII
extends IiiiIiiiiIiIi {
    private IiiiiiiiiIIII IIIiiiiiIIiII;
    private int iiIiiiiiiIIiI;
    private int iIiiIiiiIiIIi = -1;
    private int iiiiIiiiIIiii;
    private BigDecimal iIIiIiiiiiiIi;
    private QuackGameBean IIIIiiiiiiiII;
    private BigDecimal iiIIIiiiiiiiI;
    private String IiIiiiiiIIIII;
    public static IIIIIiiiIiIii iiIiIiiiiIIIi = iiiiiiiiiiIiI.ALLATORIxDEMO((String)"sc/mouse/flicker.tcp", null);
    private JLabel iiiiIiiiIiiII;
    private int iiiIiiiiiiiIi = 1;
    private int iIiiIiiiiiiII;
    private int IIiiIiiiIIiIi;
    private int iIiIiiiiIiIii;
    private int IiIIIiiiiIiiI;
    private BigDecimal iiIiiiiiiiIii;
    private List<iiIIiiiiiIIII> IiiiiiiiIIIII;
    private JLabel ALLATORIxDEMO;

    public int iiiIiiiiiiIIi() {
        int IiiiiiiiIIIII = 40 - (int)((double)(this.iIiiIiiiiiiII - this.iiIiiiiiiIIiI) * 1.5);
        if (IiiiiiiiIIIII >= 4) return IiiiiiiiIIIII;
        return 4;
    }

    public synchronized void iiiIiiiiiiIIi() {
        if (this.IIIIiiiiiiiII != null) {
            this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u62bd\u5956\u8fd8\u6ca1\u6709\u7ed3\u675f");
            return;
        }
        if (this.iiIIIiiiiiiiI == null && this.iiIiiiiiiiIii.longValue() * (long)this.iiiIiiiiiiiIi > this.iIIiIiiiiiiIi.longValue()) {
            this.iiIIiiiiIiIIi.iiiIiiiiiiIIi(String.valueOf(this.IiIiiiiiIIIII) + "\u4e0d\u8db3" + this.iiIiiiiiiiIii.longValue() * (long)this.iiiIiiiiiiiIi);
            return;
        }
        Goodstable IiiiiiiiIIIII = this.ALLATORIxDEMO().ALLATORIxDEMO(this.iiIIIiiiiiiiI);
        StringBuffer IiiiiiiiIIIII2 = new StringBuffer();
        IiiiiiiiIIIII2.append("D");
        IiiiiiiiIIIII2.append(this.iIiiIiiiIiIIi);
        IiiiiiiiIIIII2.append("|");
        IiiiiiiiIIIII2.append(0);
        IiiiiiiiIIIII2.append("|");
        IiiiiiiiIIIII2.append(1);
        if (IiiiiiiiIIIII != null) {
            IiiiiiiiIIIII2.append("|");
            IiiiiiiiIIIII2.append(IiiiiiiiIIIII.getRgid());
        }
        String IiiiiiiiIIIII3 = Agreement.getSendTextAES((String)"getfivemsg", (String)IiiiiiiiIIIII2.toString());
        this.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII3);
    }

    public void ALLATORIxDEMO(int w, int h) {
        this.iIiIiiiiIIiii(-1, 0, w, h);
    }

    /*
     * WARNING - void declaration
     */
    public synchronized void iiiIiiiiiiIIi(QuackGameBean bean) {
        iiIIiiiiiIIII IiiiiiiiIIIII;
        this.iIiIiiiiIIiIi(bean.getPetmsg2());
        String[] IiiiiiiiIIIII2 = bean.getPetmsg().split("\\|");
        int IiiiiiiiIIIII3 = 0;
        while (IiiiiiiiIIIII3 < IiiiiiiiIIIII2.length) {
            void IiiiiiiiIIIII4;
            iiIIiiiiiIIII iiIIiiiiiIIII2 = IiiiiiiiIIIII = IiiiiiiiIIIII3 < this.IiiiiiiiIIIII.size() ? this.IiiiiiiiIIIII.get(IiiiiiiiIIIII3) : null;
            if (IiiiiiiiIIIII == null) {
                IiiiiiiiIIIII = new iiIIiiiiiIIII(1, (IiiiIiiiiIiIi)this);
                this.IiiiiiiiIIIII.add(IiiiiiiiIIIII);
                this.add((Component)IiiiiiiiIIIII);
            }
            String[] stringArray = IiiiiiiiIIIII2[IiiiiiiiIIIII3].split("=");
            ++IiiiiiiiIIIII3;
            IiiiiiiiIIIII.ALLATORIxDEMO(this.ALLATORIxDEMO().ALLATORIxDEMO(new BigDecimal((String)IiiiiiiiIIIII4[0])), Integer.parseInt((String)IiiiiiiiIIIII4[1]), Integer.parseInt((String)IiiiiiiiIIIII4[2]));
            IiiiiiiiIIIII.setVisible(true);
        }
        this.iIiIiiiiIiIii = IiiiiiiiIIIII2.length;
        IiiiiiiiIIIII3 = IiiiiiiiIIIII2.length;
        while (IiiiiiiiIIIII3 < this.IiiiiiiiIIIII.size()) {
            iiIIiiiiiIIII iiIIiiiiiIIII3 = this.IiiiiiiiIIIII.get(IiiiiiiiIIIII3);
            ++IiiiiiiiIIIII3;
            iiIIiiiiiIIII3.setVisible(false);
        }
        this.iIiiIiiiIiIIi = bean.getMoney().intValue();
        if (this.iIiiIiiiIiIIi == 1) {
            this.iiiIiiiiiiIIi("sc/b/S276.png");
            this.IIIiiiiiIIiII.setBounds(352, 230, 80, 26);
            this.ALLATORIxDEMO.setBounds(350, 198, 75, 18);
            this.iiiiIiiiIiiII.setBounds(350, 168, 75, 18);
            IiiiiiiiIIIII3 = 0;
            while (IiiiiiiiIIIII3 < this.IiiiiiiiIIIII.size()) {
                IiiiiiiiIIIII = this.IiiiiiiiIIIII.get(IiiiiiiiIIIII3);
                if (IiiiiiiiIIIII.isVisible()) {
                    if (IiiiiiiiIIIII3 < 6) {
                        IiiiiiiiIIIII.setBounds(52 + IiiiiiiiIIIII3 * 94, 52, 75, 70);
                    } else if (IiiiiiiiIIIII3 < 8) {
                        IiiiiiiiIIIII.setBounds(522, IiiiiiiiIIIII3 == 6 ? 145 : 237, 75, 70);
                    } else if (IiiiiiiiIIIII3 < 14) {
                        IiiiiiiiIIIII.setBounds(52 + (13 - IiiiiiiiIIIII3) * 94, 329, 75, 70);
                    } else {
                        IiiiiiiiIIIII.setBounds(52, IiiiiiiiIIIII3 == 14 ? 237 : 145, 75, 70);
                    }
                }
                ++IiiiiiiiIIIII3;
            }
            this.ALLATORIxDEMO(652, 446);
        }
        this.ALLATORIxDEMO().iIiIiiiiIIiIi(this.iIiIiiiiIIiii());
    }

    public synchronized void iIiIiiiiIIiIi(String value) {
        String[] IiiiiiiiIIIII = value.split("=");
        this.iiIIIiiiiiiiI = !IiiiiiiiIIIII[0].equals("null") ? new BigDecimal(IiiiiiiiIIIII[0]) : null;
        this.IiIiiiiiIIIII = !IiiiiiiiIIIII[1].equals("null") ? IiiiiiiiIIIII[1] : null;
        this.iiIiiiiiiiIii = !IiiiiiiiIIIII[2].equals("null") ? new BigDecimal(IiiiiiiiIIIII[2]) : null;
        this.iiiIiiiiiiiIi = Integer.parseInt(IiiiiiiiIIIII[3]);
        if (IiiiiiiiIIIII.length == 5) {
            this.iIIiIiiiiiiIi = !IiiiiiiiIIIII[4].equals("null") ? new BigDecimal(IiiiiiiiIIIII[4]) : null;
        }
        this.ALLATORIxDEMO.setText(this.iiIiiiiiiiIii != null ? String.valueOf(this.iiIiiiiiiiIii.longValue() * (long)this.iiiIiiiiiiiIi) : "");
        this.iiiiIiiiIiiII.setText(this.iIIiIiiiiiiIi != null ? this.iIIiIiiiiiiIi.toString() : "");
    }

    public iiIIIiiiIIiII(GameView gameView) {
        super(119, 2, IiiiIiiiiIiIi.iIIIIiiiiiIIi, gameView);
        this.ALLATORIxDEMO(-1, 0, 0, 0, IiiiIiiiiIiIi.iiIIIiiiiiiiI);
        this.iiiIiiiiiiIIi("sc/b/S276.png");
        this.IiiiiiiiIIIII = new ArrayList<iiIIiiiiiIIII>();
        this.IIIiiiiiIIiII = new IiiiiiiiiIIII("sc/e/31.png", 1, 204, iiIIiiiiIiiII.iiiiIiiiIiiII, iiIIiiiiIiiII.IIiiiiiiIiiII, "\u62bd\u5956", (IiiiIiiiiIiIi)this);
        this.IIIiiiiiIIiII.setBounds(165, 142, 79, 25);
        this.add((Component)this.IIIiiiiiIIiII);
        this.ALLATORIxDEMO = new JLabel("", 0);
        this.ALLATORIxDEMO.setBounds(0, 0, 75, 18);
        this.ALLATORIxDEMO.setFont(iiIIiiiiIiiII.iiIiiiiiiiiiI);
        this.ALLATORIxDEMO.setForeground(Color.red);
        this.add(this.ALLATORIxDEMO);
        this.iiiiIiiiIiiII = new JLabel("", 0);
        this.iiiiIiiiIiiII.setBounds(0, 0, 75, 18);
        this.iiiiIiiiIiiII.setFont(iiIIiiiiIiiII.iiIiiiiiiiiiI);
        this.iiiiIiiiIiiII.setForeground(Color.red);
        this.add(this.iiiiIiiiIiiII);
    }

    public synchronized void iIiIiiiiIIiii(QuackGameBean bean) {
        this.ALLATORIxDEMO(bean);
        this.iIiIiiiiIIiIi(bean.getPetmsg2());
    }

    public boolean ALLATORIxDEMO() {
        if (this.IIIIiiiiiiiII == null) return super.ALLATORIxDEMO();
        this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u62bd\u5956\u8fd8\u6ca1\u6709\u7ed3\u675f\u65e0\u6cd5\u5173\u95ed\u9762\u677f");
        return false;
    }

    public synchronized void ALLATORIxDEMO(QuackGameBean bean) {
        if (this.IIIIiiiiiiiII != null) {
            IiiiIiiiiIIII.ALLATORIxDEMO((AssetUpdate)this.IIIIiiiiiiiII.getAssetUpdate(), (GameView)this.iiIIiiiiIiIIi);
            this.iiiIiiiiiiIIi(this.IIIIiiiiiiiII);
        }
        this.iiIiiiiiiIIiI = 0;
        this.iIiiIiiiiiiII = bean != null && bean.getIndex() != null ? bean.getIndex() : 0;
        this.IiIIIiiiiIiiI = 0;
        this.IIIIiiiiiiiII = bean;
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (this.IIIIiiiiiiiII != null) {
            ++this.IiIIIiiiiIiiI;
            if (this.IiIIIiiiiIiiI > this.iiiIiiiiiiIIi()) {
                this.IiIIIiiiiIiiI = 0;
                ++this.iiIiiiiiiIIiI;
                if (this.iIiIiiiiIiIii <= 0) {
                    return;
                }
                iiIIiiiiiIIII IiiiiiiiIIIII = this.IiiiiiiiIIIII.get(this.iiIiiiiiiIIiI % this.iIiIiiiiIiIii);
                this.IIiiIiiiIIiIi = IiiiiiiiIIIII.getX() + 13;
                this.iiiiIiiiIIiii = IiiiiiiiIIIII.getY();
                if (this.iiIiiiiiiIIiI >= this.iIiiIiiiiiiII) {
                    this.ALLATORIxDEMO(null);
                }
            }
        }
        if (this.IIiiIiiiIIiIi <= 0) return;
        iiIiIiiiiIIIi.ALLATORIxDEMO(iIiIIiiiIiiiI.ALLATORIxDEMO(), 0);
        iiIiIiiiiIIIi.ALLATORIxDEMO(g, this.IIiiIiiiIIiIi, this.iiiiIiiiIIiii);
    }
}
