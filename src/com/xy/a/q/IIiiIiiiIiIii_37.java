/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.q.IIiiiiiiIIIiI
 *  com.xy.bean.AssetUpdate
 *  com.xy.bean.QuackGameBean
 *  com.xy.c.IiiiIiiiiIIII
 *  com.xy.i.IiiiiiiiiIIII
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.readbean.Goodstable
 *  com.xy.socket.Agreement
 *  com.xy.text.GameView
 *  com.xy.v.IiiiIiiiiIiIi
 *  com.xy.w.IIIIIiiiIiIii
 *  com.xy.w.IIiIiiiiIiiIi
 *  com.xy.w.iiiiiiiiiiIiI
 */
package com.xy.a.q;

import com.xy.a.q.IIiiiiiiIIIiI;
import com.xy.bean.AssetUpdate;
import com.xy.bean.QuackGameBean;
import com.xy.c.IiiiIiiiiIIII;
import com.xy.i.IiiiiiiiiIIII;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.readbean.Goodstable;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import com.xy.v.IiiiIiiiiIiIi;
import com.xy.w.IIIIIiiiIiIii;
import com.xy.w.IIiIiiiiIiiIi;
import com.xy.w.iiiiiiiiiiIiI;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.math.BigDecimal;
import javax.swing.JLabel;

public class IIiiIiiiIiIii
extends com.xy.q.IiiiIiiiiIiIi {
    private BigDecimal iiIiiiiiiIIiI;
    private double iIiiIiiiIiIIi = 0.0;
    private IIiiiiiiIIIiI[] iiiiIiiiIIiii;
    private int iIIiIiiiiiiIi = 1;
    private int IIIIiiiiiiiII = 0;
    private String iiIIIiiiiiiiI;
    private JLabel IiIiiiiiIIIII;
    private int iiIiIiiiiIIIi = 0;
    private BigDecimal iiiiIiiiIiiII;
    private int iiiIiiiiiiiIi;
    private BigDecimal iIiiIiiiiiiII;
    private QuackGameBean IIiiIiiiIIiIi;
    private double iIiIiiiiIiIii = Math.toRadians(1.0);
    private BigDecimal IiIIIiiiiIiiI;
    private AffineTransform iiIiiiiiiiIii = new AffineTransform();
    private static IIIIIiiiIiIii IiiiiiiiIIIII;
    private IiiiiiiiiIIII ALLATORIxDEMO;

    public synchronized void iiiIiiiiiiIIi(QuackGameBean bean) {
        this.ALLATORIxDEMO(bean);
    }

    public boolean ALLATORIxDEMO() {
        if (this.IIiiIiiiIIiIi == null) return super.ALLATORIxDEMO();
        this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u62bd\u5956\u8fd8\u6ca1\u6709\u7ed3\u675f\u65e0\u6cd5\u5173\u95ed\u9762\u677f");
        return false;
    }

    public void iIiIiiiiIIiii(QuackGameBean gameBean) {
        this.iiIiiiiiiIIiI = gameBean.getMoney();
        this.iIiIiiiiIIiIi(gameBean.getPetmsg2());
        String[] IiiiiiiiIIIII = gameBean.getPetmsg() != null && !gameBean.getPetmsg().equals("") ? gameBean.getPetmsg().split("\\|") : null;
        int IiiiiiiiIIIII2 = -1;
        int IiiiiiiiIIIII3 = 0;
        while (IiiiiiiiIIIII3 < this.iiiiIiiiIIiii.length) {
            if (IiiiiiiiIIIII == null || IiiiiiiiIIIII3 >= IiiiiiiiIIIII.length) {
                this.iiiiIiiiIIiii[IiiiiiiiIIIII3].ALLATORIxDEMO(null, 0);
            } else {
                String[] IiiiiiiiIIIII4 = IiiiiiiiIIIII[IiiiiiiiIIIII3].split("_");
                Goodstable IiiiiiiiIIIII5 = this.ALLATORIxDEMO().ALLATORIxDEMO(new BigDecimal(IiiiiiiiIIIII4[0]));
                this.iiiiIiiiIIiii[IiiiiiiiIIIII3].ALLATORIxDEMO(IiiiiiiiIIIII5, Integer.parseInt(IiiiiiiiIIIII4[1]));
                if (IiiiiiiiIIIII4[2].equals("1")) {
                    IiiiiiiiIIIII2 = IiiiiiiiIIIII3;
                }
            }
            ++IiiiiiiiIIIII3;
        }
        if (IiiiiiiiIIIII2 >= 0 && IiiiiiiiIIIII2 < 14) {
            double IiiiiiiiIIIII6 = 25.714285714285715;
            int IiiiiiiiIIIII7 = (int)(IiiiiiiiIIIII6 * (double)IiiiiiiiIIIII2);
            int IiiiiiiiIIIII8 = (int)(IiiiiiiiIIIII6 * (double)(IiiiiiiiIIIII2 + 1));
            if ((IiiiiiiiIIIII8 -= 2) - (IiiiiiiiIIIII7 += 2) > 0) {
                IiiiiiiiIIIII7 += IiiiIiiiiIiIi.iIiIiiiiIiIii.nextInt(IiiiiiiiIIIII8 - IiiiiiiiIIIII7);
            }
            IiiiiiiiIIIII7 += 720;
            this.IIIIiiiiiiiII += (IiiiiiiiIIIII7 += 360 - this.iiIiIiiiiIIIi % 360);
        }
        if (this.ALLATORIxDEMO().iIiIiiiiIIiii(this.iIiIiiiiIIiii()) != null) return;
        this.ALLATORIxDEMO().iIiIiiiiIIiIi(this.iIiIiiiiIIiii());
    }

    /*
     * WARNING - void declaration
     */
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (IiiiiiiiIIIII == null) {
            IiiiiiiiIIIII = iiiiiiiiiiIiI.iIiIiiiiIIiii((String)IIiIiiiiIiiIi.iIiIiiiiIIiii((String)"drawzp"));
            return;
        }
        if (this.iiIiIiiiiIIIi != this.IIIIiiiiiiiII) {
            this.iiIiIiiiiIIIi = this.IIIIiiiiiiiII - this.iiIiIiiiiIIIi > 150 ? (this.iiIiIiiiiIIIi += 2 + (this.IIIIiiiiiiiII - this.iiIiIiiiiIIIi) / 150) : (this.iiIiIiiiiIIIi += 2);
            if (this.iiIiIiiiiIIIi > this.IIIIiiiiiiiII) {
                this.iiIiIiiiiIIIi = this.IIIIiiiiiiiII;
            }
            this.iiiIiiiiiiiIi = this.iiIiIiiiiIIIi % 360;
            this.iIiiIiiiIiIIi = (double)this.iiiIiiiiiiiIi * this.iIiIiiiiIiIii;
            this.iiiIiiiiiiiIi = (int)((double)this.iiiIiiiiiiiIi / 25.714285714285715);
            if (this.iiIiIiiiiIIIi == this.IIIIiiiiiiiII) {
                this.ALLATORIxDEMO(null);
            }
        }
        IiiiiiiiIIIII.ALLATORIxDEMO(0L, 0);
        if (this.iIiiIiiiIiIIi != 0.0) {
            void IiiiiiiiIIIII;
            Graphics2D graphics2D = (Graphics2D)g;
            this.iiIiiiiiiiIii.setToIdentity();
            this.iiIiiiiiiiIii.rotate(this.iIiiIiiiIiIIi, IIiiIiiiIiIii.IiiiiiiiIIIII.ALLATORIxDEMO().iiiIiiiiiiIIi(), IIiiIiiiIiIii.IiiiiiiiIIIII.ALLATORIxDEMO().iIiIiiiiIIiii());
            int IiiiiiiiIIIII2 = 247 - IIiiIiiiIiIii.IiiiiiiiIIIII.ALLATORIxDEMO().iiiIiiiiiiIIi();
            int IiiiiiiiIIIII3 = 250 - IIiiIiiiIiIii.IiiiiiiiIIIII.ALLATORIxDEMO().iIiIiiiiIIiii();
            IiiiiiiiIIIII.translate(IiiiiiiiIIIII2, IiiiiiiiIIIII3);
            graphics2D.drawImage(IIiiIiiiIiIii.IiiiiiiiIIIII.ALLATORIxDEMO().ALLATORIxDEMO(), this.iiIiiiiiiiIii, null);
            IiiiiiiiIIIII.translate(-IiiiiiiiIIIII2, -IiiiiiiiIIIII3);
            return;
        }
        IiiiiiiiIIIII.ALLATORIxDEMO(g, 247, 250);
    }

    public synchronized void ALLATORIxDEMO(QuackGameBean bean) {
        if (this.IIiiIiiiIIiIi != null) {
            IiiiIiiiiIIII.ALLATORIxDEMO((AssetUpdate)this.IIiiIiiiIIiIi.getAssetUpdate(), (GameView)this.iiIIiiiiIiIIi);
            this.iIiIiiiiIIiIi(this.IIiiIiiiIIiIi.getPetmsg2());
        }
        this.IIiiIiiiIIiIi = bean;
        if (bean == null) return;
        this.iIiIiiiiIIiii(bean);
    }

    public synchronized void iiiIiiiiiiIIi() {
        if (this.IIiiIiiiIIiIi != null) {
            this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u62bd\u5956\u8fd8\u6ca1\u6709\u7ed3\u675f");
            return;
        }
        if (this.IiIiiiiiIIIII.equals("0")) {
            this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u62bd\u5956\u6b21\u6570\u4e0d\u8db3");
            return;
        }
        Goodstable IiiiiiiiIIIII = this.ALLATORIxDEMO().ALLATORIxDEMO(this.IiIIIiiiiIiiI);
        StringBuffer IiiiiiiiIIIII2 = new StringBuffer();
        IiiiiiiiIIIII2.append("R");
        IiiiiiiiIIIII2.append(this.iiIiiiiiiIIiI);
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

    public IIiiIiiiIiIii(GameView gameView) {
        super(126, 2, com.xy.q.IiiiIiiiiIiIi.iIIIIiiiiiIIi, gameView);
        this.ALLATORIxDEMO(-2, 0, 880, 502, com.xy.q.IiiiIiiiiIiIi.iiIIIiiiiiiiI);
        this.iiiIiiiiiiIIi("sc/b/S295.png");
        this.IiIiiiiiIIIII.setBtnPath("sc/b/B395.png");
        this.IiIiiiiiIIIII.setBounds(637, 86, 25, 25);
        this.IiIiiiiiIIIII = new JLabel("", 0);
        this.IiIiiiiiIIIII.setBounds(602, 312, 50, 20);
        this.IiIiiiiiIIIII.setFont(iiIIiiiiIiiII.iiIiIiiiIiiII);
        this.IiIiiiiiIIIII.setForeground(Color.red);
        this.add(this.IiIiiiiiIIIII);
        this.ALLATORIxDEMO = new IiiiiiiiiIIII("sc/e/31.png", 1, 203, iiIIiiiiIiiII.iiiiIiiiIiiII, iiIIiiiiIiiII.IIiiiiiiIiiII, "\u62bd\u5956", (com.xy.q.IiiiIiiiiIiIi)this);
        this.ALLATORIxDEMO.setBounds(536, 350, 79, 25);
        this.add((Component)this.ALLATORIxDEMO);
        this.iiiiIiiiIIiii = new IIiiiiiiIIIiI[14];
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iiiiIiiiIIiii.length) {
            this.iiiiIiiiIIiii[IiiiiiiiIIIII] = new IIiiiiiiIIIiI(this, IiiiiiiiIIIII);
            if (IiiiiiiiIIIII == 0) {
                this.iiiiIiiiIIiii[IiiiiiiiIIIII].setBounds(247, 53, 76, 75);
            } else if (IiiiiiiiIIIII == 1) {
                this.iiiiIiiiIIiii[IiiiiiiiIIIII].setBounds(312, 88, 76, 75);
            } else if (IiiiiiiiIIIII == 2) {
                this.iiiiIiiiIIiii[IiiiiiiiIIIII].setBounds(358, 145, 76, 75);
            } else if (IiiiiiiiIIIII == 3) {
                this.iiiiIiiiIIiii[IiiiiiiiIIIII].setBounds(376, 216, 76, 75);
            } else if (IiiiiiiiIIIII == 4) {
                this.iiiiIiiiIIiii[IiiiiiiiIIIII].setBounds(358, 286, 76, 75);
            } else if (IiiiiiiiIIIII == 5) {
                this.iiiiIiiiIIiii[IiiiiiiiIIIII].setBounds(312, 344, 76, 75);
            } else if (IiiiiiiiIIIII == 6) {
                this.iiiiIiiiIIiii[IiiiiiiiIIIII].setBounds(247, 376, 76, 75);
            } else if (IiiiiiiiIIIII == 7) {
                this.iiiiIiiiIIiii[IiiiiiiiIIIII].setBounds(172, 376, 76, 75);
            } else if (IiiiiiiiIIIII == 8) {
                this.iiiiIiiiIIiii[IiiiiiiiIIIII].setBounds(106, 344, 76, 75);
            } else if (IiiiiiiiIIIII == 9) {
                this.iiiiIiiiIIiii[IiiiiiiiIIIII].setBounds(60, 286, 76, 75);
            } else if (IiiiiiiiIIIII == 10) {
                this.iiiiIiiiIIiii[IiiiiiiiIIIII].setBounds(45, 216, 76, 75);
            } else if (IiiiiiiiIIIII == 11) {
                this.iiiiIiiiIIiii[IiiiiiiiIIIII].setBounds(60, 145, 76, 75);
            } else if (IiiiiiiiIIIII == 12) {
                this.iiiiIiiiIIiii[IiiiiiiiIIIII].setBounds(108, 88, 76, 75);
            } else if (IiiiiiiiIIIII == 13) {
                this.iiiiIiiiIIiii[IiiiiiiiIIIII].setBounds(172, 53, 76, 75);
            }
            this.add((Component)this.iiiiIiiiIIiii[IiiiiiiiIIIII++]);
        }
    }

    static /* synthetic */ int ALLATORIxDEMO(IIiiIiiiIiIii arg0) {
        return arg0.iiiIiiiiiiiIi;
    }

    public synchronized void iIiIiiiiIIiIi(String value) {
        String[] IiiiiiiiIIIII = value.split("=");
        this.IiIIIiiiiIiiI = !IiiiiiiiIIIII[0].equals("null") ? new BigDecimal(IiiiiiiiIIIII[0]) : null;
        this.iiIIIiiiiiiiI = !IiiiiiiiIIIII[1].equals("null") ? IiiiiiiiIIIII[1] : null;
        this.iiiiIiiiIiiII = !IiiiiiiiIIIII[2].equals("null") ? new BigDecimal(IiiiiiiiIIIII[2]) : null;
        this.iIIiIiiiiiiIi = Integer.parseInt(IiiiiiiiIIIII[3]);
        if (IiiiiiiiIIIII.length == 5) {
            this.iIiiIiiiiiiII = !IiiiiiiiIIIII[4].equals("null") ? new BigDecimal(IiiiiiiiIIIII[4]) : null;
        }
        int IiiiiiiiIIIII2 = 0;
        if (this.IiIIIiiiiIiiI != null) {
            IiiiiiiiIIIII2 += this.ALLATORIxDEMO().getGoodNum(this.IiIIIiiiiIiiI);
        }
        if (this.iIiiIiiiiiiII != null && this.iiiiIiiiIiiII != null) {
            IiiiiiiiIIIII2 = (int)((long)IiiiiiiiIIIII2 + this.iIiiIiiiiiiII.longValue() / this.iiiiIiiiIiiII.longValue());
        }
        this.IiIiiiiiIIIII.setText(String.valueOf(IiiiiiiiIIIII2 / this.iIIiIiiiiiiIi));
    }
}
