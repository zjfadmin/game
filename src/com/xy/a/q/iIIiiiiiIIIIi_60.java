/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.q.IiIIIiiiiiiII
 *  com.xy.a.q.IiiiIiiiiIIII
 *  com.xy.a.q.iiiiiiiiIIIII
 *  com.xy.bean.PayvipBean
 *  com.xy.q.IiIIIiiiiIIiI
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.socket.Agreement
 *  com.xy.text.GameView
 *  com.xy.w.IIIIIiiiIiiII
 *  com.xy.w.IIIiiiiiIiIiI
 */
package com.xy.a.q;

import com.xy.a.q.IiIIIiiiiiiII;
import com.xy.a.q.IiiiIiiiiIIII;
import com.xy.a.q.iiiiiiiiIIIII;
import com.xy.bean.PayvipBean;
import com.xy.q.IiIIIiiiiIIiI;
import com.xy.q.IiiiIiiiiIiIi;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import com.xy.w.IIIIIiiiIiiII;
import com.xy.w.IIIiiiiiIiIiI;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ImageObserver;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComponent;
import javax.swing.JScrollPane;

public class iIIiiiiiIIIIi
extends IiiiIiiiiIiIi {
    private static Image iiiiIiiiIiiII;
    private IIIiiiiiIiIiI[] iiiIiiiiiiiIi;
    private int iIiiIiiiiiiII = 0;
    private List<iiiiiiiiIIIII> IIiiIiiiIIiIi;
    private JComponent iIiIiiiiIiIii;
    int IiIIIiiiiIiiI = 0;
    private JScrollPane iiIiiiiiiiIii;
    private List<Image> IiiiiiiiIIIII;
    private List<PayvipBean> ALLATORIxDEMO;

    public void iIiIiiiiIIiIi() {
        String IiiiiiiiIIIII = Agreement.getSendTextAES((String)"Getvipgradepack", null);
        this.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII);
    }

    public void ALLATORIxDEMO(JComponent view) {
        iiiiiiiiIIIII IiiiiiiiIIIII = (iiiiiiiiIIIII)view;
        String IiiiiiiiIIIII2 = Agreement.getSendTextAES((String)"Vipgradesure", (String)("v" + iiiiiiiiIIIII.ALLATORIxDEMO((iiiiiiiiIIIII)IiiiiiiiIIIII).getGrade()));
        this.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII2);
    }

    /*
     * Unable to fully structure code
     */
    public void ALLATORIxDEMO(List<PayvipBean> list) {
        block11: {
            block10: {
                this.ALLATORIxDEMO = list;
                IiiiiiiiIIIII = this.ALLATORIxDEMO().getLoginResult();
                IiiiiiiiIIIII = IiiiiiiiIIIII.getPaysum();
                IiiiiiiiIIIII = 0;
                if (this.ALLATORIxDEMO.size() != 0) break block10;
                IiiiiiiiIIIII = 0;
                if (true) ** GOTO lbl19
            }
            IiiiiiiiIIIII = IiiiiiiiIIIII.getVipget();
            IiiiiiiiIIIII = null;
            if (IiiiiiiiIIIII != null) {
                IiiiiiiiIIIII = IiiiiiiiIIIII.split("&&");
            }
            IiiiiiiiIIIII = this.IIiiIiiiIIiIi.size();
            if (true) ** GOTO lbl25
            do {
                v0 = this.IIiiIiiiIIiIi.get(IiiiiiiiIIIII);
                ++IiiiiiiiIIIII;
                v0.ALLATORIxDEMO(null);
lbl19:
                // 2 sources

            } while (IiiiiiiiIIIII < this.IIiiIiiiIIiIi.size());
            break block11;
            do {
                ++IiiiiiiiIIIII;
                this.IIiiIiiiIIiIi.add(new iiiiiiiiIIIII(this));
lbl25:
                // 2 sources

            } while (IiiiiiiiIIIII < this.ALLATORIxDEMO.size());
            IiiiiiiiIIIII = 0;
            while (IiiiiiiiIIIII < this.IIiiIiiiIIiIi.size()) {
                if (IiiiiiiiIIIII > this.ALLATORIxDEMO.size()) {
                    this.IIiiIiiiIIiIi.get(IiiiiiiiIIIII).ALLATORIxDEMO(null);
                } else if (IiiiiiiiIIIII < this.ALLATORIxDEMO.size()) {
                    var9_9 = this.ALLATORIxDEMO.get(IiiiiiiiIIIII);
                    if (IiiiiiiiIIIII.compareTo(new BigDecimal(this.ALLATORIxDEMO.get(IiiiiiiiIIIII).getPaynum())) >= 0) {
                        this.IiIIIiiiiIiiI = this.IiIIIiiiiIiiI > IiiiiiiiIIIII.getGrade() ? this.IiIIIiiiiIiiI : IiiiiiiiIIIII.getGrade();
                    }
                    IiiiiiiiIIIII = IiiiiiiiIIIII > IiiiiiiiIIIII.getGrade() ? IiiiiiiiIIIII : IiiiiiiiIIIII.getGrade();
                    var10_10 = this.IIiiIiiiIIiIi.get(IiiiiiiiIIIII);
                    IiiiiiiiIIIII.ALLATORIxDEMO((PayvipBean)IiiiiiiiIIIII);
                    if (IiIIIiiiiiiII.ALLATORIxDEMO((String[])IiiiiiiiIIIII, (int)1, (int)IiiiiiiiIIIII.getGrade())) {
                        iiiiiiiiIIIII.ALLATORIxDEMO((iiiiiiiiIIIII)IiiiiiiiIIIII).setBtn(-1, "sc/e/55.png");
                    } else {
                        iiiiiiiiIIIII.ALLATORIxDEMO((iiiiiiiiIIIII)IiiiiiiiIIIII).setBtn(1, "sc/e/7.png");
                    }
                }
                ++IiiiiiiiIIIII;
            }
            this.iIiiIiiiiiiII = this.ALLATORIxDEMO(IiiiiiiiIIIII, IiiiiiiiIIIII);
        }
        this.iiiIiiiiiiIIi();
    }

    /*
     * WARNING - void declaration
     */
    public iIIiiiiiIIIIi(GameView gameView) {
        super(-1, -1, IiiiIiiiiIiIi.iIIiIiiiiiiIi, (GameView)gameView2);
        void gameView2;
        this.ALLATORIxDEMO(0, 0, 682, 475, IiiiIiiiiIiIi.iIIiIiiiiiiIi);
        this.IiiiiiiiIIIII = new ArrayList<Image>();
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < 10) {
            StringBuilder stringBuilder = new StringBuilder("sc/item/S").append(IiiiiiiiIIIII + 30).append(".png");
            ++IiiiiiiiIIIII;
            this.IiiiiiiiIIIII.add(IIIIIiiiIiiII.iiiIiiiiiiIIi((String)stringBuilder.toString()));
        }
        this.IIiiIiiiIIiIi = new ArrayList<iiiiiiiiIIIII>();
        this.iIiIiiiiIiIii = new IiiiIiiiiIIII(this);
        this.iiIiiiiiiiIii = IiIIIiiiiIIiI.ALLATORIxDEMO((int)58, (int)207, (int)591, (int)190, (Component)this.iIiIiiiiIiIii, (int)20);
        this.add(this.iiIiiiiiiiIii);
        this.iiiIiiiiiiiIi = new IIIiiiiiIiIiI[3];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iiiIiiiiiiiIi.length) {
            this.iiiIiiiiiiiIi[IiiiiiiiIIIII] = new IIIiiiiiIiIiI();
            if (IiiiiiiiIIIII == 0) {
                this.iiiIiiiiiiiIi[IiiiiiiiIIIII].iIiIiiiiIIiii("sc/d/70.png");
                this.iiiIiiiiiiiIi[IiiiiiiiIIIII].setBounds(61, 60, 583, 110);
            } else if (IiiiiiiiIIIII == 1) {
                this.iiiIiiiiiiiIi[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/36.png", (int)20, (int)20, (int)20, (int)20, (boolean)false));
                this.iiiIiiiiiiiIi[IiiiiiiiIIIII].setBounds(58, 57, 591, 57);
            } else if (IiiiiiiiIIIII == 2) {
                this.iiiIiiiiiiiIi[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/17.png", (int)3, (int)3, (int)3, (int)3, (boolean)false));
                this.iiiIiiiiiiiIi[IiiiiiiiIIIII].setBounds(59, 187, 588, 7);
            }
            this.add((Component)this.iiiIiiiiiiiIi[IiiiiiiiIIIII++]);
        }
    }

    protected void paintChildren(Graphics g) {
        super.paintChildren(g);
        if (iiiiIiiiIiiII == null) {
            iiiiIiiiIiiII = IIIIIiiiIiiII.iiiIiiiiiiIIi((String)"sc/b/S6.png");
        }
        if (this.iIiiIiiiiiiII > 0) {
            g.drawImage(iiiiIiiiIiiII, 60, 188, this.iIiiIiiiiiiII, 5, (ImageObserver)((Object)this));
        }
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IiiiiiiiIIIII.size()) {
            g.drawImage(this.IiiiiiiiIIIII.get(++IiiiiiiiIIIII), 68 + 63 * IiiiiiiiIIIII, 184, 30, 25, (ImageObserver)((Object)this));
        }
    }

    public void iiiIiiiiiiIIi() {
        this.iIiIiiiiIiIii.removeAll();
        this.iIiIiiiiIiIii.repaint();
        int IiiiiiiiIIIII = 0;
        int IiiiiiiiIIIII2 = 0;
        while (IiiiiiiiIIIII2 < this.IIiiIiiiIIiIi.size()) {
            iiiiiiiiIIIII IiiiiiiiIIIII3 = this.IIiiIiiiIIiIi.get(IiiiiiiiIIIII2);
            if (iiiiiiiiIIIII.ALLATORIxDEMO((iiiiiiiiIIIII)IiiiiiiiIIIII3) != null) {
                int n = 0 + IiiiiiiiIIIII % 4 * 152;
                int n2 = IiiiiiiiIIIII / 4 * 190;
                ++IiiiiiiiIIIII;
                IiiiiiiiIIIII3.setBounds(n, n2, 115, 165);
                this.iIiIiiiiIiIii.add((Component)IiiiiiiiIIIII3);
            }
            ++IiiiiiiiIIIII2;
        }
        this.iIiIiiiiIiIii.setPreferredSize(new Dimension(565, 190 * (IiiiiiiiIIIII % 4 == 0 ? IiiiiiiiIIIII / 4 : IiiiiiiiIIIII / 4 + 1)));
        this.iiIiiiiiiiIii.updateUI();
        this.iiIiiiiiiiIii.invalidate();
        this.iiIiiiiiiiIii.validate();
        this.iiIiiiiiiiIii.repaint();
        IiiiiiiiIIIII2 = 0;
        while (IiiiiiiiIIIII2 < this.IiiiiiiiIIIII.size()) {
            if (this.IiIIIiiiiIiiI >= IiiiiiiiIIIII2 + 1) {
                this.IiiiiiiiIIIII.set(IiiiiiiiIIIII2, IIIIIiiiIiiII.iiiIiiiiiiIIi((String)("sc/item/S" + (IiiiiiiiIIIII2 + 20) + ".png")));
            } else {
                this.IiiiiiiiIIIII.set(IiiiiiiiIIIII2, IIIIIiiiIiiII.iiiIiiiiiiIIi((String)("sc/item/S" + (IiiiiiiiIIIII2 + 30) + ".png")));
            }
            ++IiiiiiiiIIIII2;
        }
    }

    public int ALLATORIxDEMO(Integer gradeInteger, BigDecimal paysum) {
        if (gradeInteger == 0) {
            this.iIiiIiiiiiiII = 0;
            return 0;
        }
        BigDecimal bigDecimal = this.ALLATORIxDEMO(paysum).divide(new BigDecimal(gradeInteger), 3, 4);
        BigDecimal IiiiiiiiIIIII = bigDecimal.multiply(new BigDecimal(587)).setScale(0, 1);
        this.iIiiIiiiiiiII = IiiiiiiiIIIII.intValue() > 587 ? 587 : IiiiiiiiIIIII.intValue();
        return this.iIiiIiiiiiiII;
    }

    public BigDecimal ALLATORIxDEMO(BigDecimal paysum) {
        BigDecimal IiiiiiiiIIIII;
        BigDecimal bigDecimal = new BigDecimal(0);
        if (paysum.compareTo(new BigDecimal(30)) < 0) {
            IiiiiiiiIIIII = new BigDecimal(0);
            return IiiiiiiiIIIII;
        }
        if (paysum.compareTo(new BigDecimal(100)) < 0) {
            IiiiiiiiIIIII = new BigDecimal(1);
            return IiiiiiiiIIIII;
        }
        if (paysum.compareTo(new BigDecimal(500)) < 0) {
            IiiiiiiiIIIII = new BigDecimal(2);
            return IiiiiiiiIIIII;
        }
        if (paysum.compareTo(new BigDecimal(1000)) < 0) {
            IiiiiiiiIIIII = new BigDecimal(3);
            return IiiiiiiiIIIII;
        }
        if (paysum.compareTo(new BigDecimal(2000)) < 0) {
            IiiiiiiiIIIII = new BigDecimal(4);
            return IiiiiiiiIIIII;
        }
        if (paysum.compareTo(new BigDecimal(5000)) < 0) {
            IiiiiiiiIIIII = new BigDecimal(5);
            return IiiiiiiiIIIII;
        }
        if (paysum.compareTo(new BigDecimal(10000)) < 0) {
            IiiiiiiiIIIII = new BigDecimal(6);
            return IiiiiiiiIIIII;
        }
        if (paysum.compareTo(new BigDecimal(18000)) < 0) {
            IiiiiiiiIIIII = new BigDecimal(7);
            return IiiiiiiiIIIII;
        }
        if (paysum.compareTo(new BigDecimal(30000)) < 0) {
            IiiiiiiiIIIII = new BigDecimal(8);
            return IiiiiiiiIIIII;
        }
        if (paysum.compareTo(new BigDecimal(50000)) < 0) {
            IiiiiiiiIIIII = new BigDecimal(9);
            return IiiiiiiiIIIII;
        }
        if (paysum.compareTo(new BigDecimal(50000)) < 0) return IiiiiiiiIIIII;
        IiiiiiiiIIIII = new BigDecimal(10);
        return IiiiiiiiIIIII;
    }
}
