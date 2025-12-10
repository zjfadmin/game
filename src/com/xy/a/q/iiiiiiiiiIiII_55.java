/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.bean.AssetUpdate
 *  com.xy.bean.QuackGameBean
 *  com.xy.c.IiiiIiiiiIIII
 *  com.xy.i.IiiiiiiiiIIII
 *  com.xy.q.IIIiiiiiIiIiI
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.readbean.Goodstable
 *  com.xy.socket.Agreement
 *  com.xy.text.GameView
 *  com.xy.v.IiiiIiiiiIiIi
 *  com.xy.v.iIiIIiiiIiiiI
 *  com.xy.w.IIIIIiiiIiIii
 *  com.xy.w.IIIIIiiiIiiII
 *  com.xy.w.iiiiiiiiiiIiI
 */
package com.xy.a.q;

import com.xy.bean.AssetUpdate;
import com.xy.bean.QuackGameBean;
import com.xy.c.IiiiIiiiiIIII;
import com.xy.i.IiiiiiiiiIIII;
import com.xy.q.IIIiiiiiIiIiI;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.readbean.Goodstable;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import com.xy.v.IiiiIiiiiIiIi;
import com.xy.v.iIiIIiiiIiiiI;
import com.xy.w.IIIIIiiiIiIii;
import com.xy.w.IIIIIiiiIiiII;
import com.xy.w.iiiiiiiiiiIiI;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.math.BigDecimal;
import javax.swing.JLabel;

public class iiiiiiiiiIiII
extends com.xy.q.IiiiIiiiiIiIi {
    private int iiIiiiiiiIIiI = 121;
    private long iIiiIiiiIiIIi;
    private int iiiiIiiiIIiii;
    private boolean iIIiIiiiiiiIi;
    private BigDecimal IIIIiiiiiiiII;
    private JLabel[] iiIIIiiiiiiiI;
    private JLabel[] IiIiiiiiIIIII;
    private int iiIiIiiiiIIIi;
    public static IIIIIiiiIiIii iiiiIiiiIiiII = iiiiiiiiiiIiI.ALLATORIxDEMO((String)"sc/mouse/cjwrk.tcp", null);
    private Image iiiIiiiiiiiIi;
    private int iIiiIiiiiiiII = 0;
    private int IIiiIiiiIIiIi;
    private long iIiIiiiiIiIii;
    private IIIiiiiiIiIiI[] IiIIIiiiiIiiI;
    private JLabel iiIiiiiiiiIii;
    private QuackGameBean IiiiiiiiIIIII;
    private IiiiiiiiiIIII ALLATORIxDEMO;

    protected void paintChildren(Graphics g) {
        super.paintChildren(g);
        if (this.iiiIiiiiiiiIi == null) {
            this.iiiIiiiiiiiIi = IIIIIiiiIiiII.iiiIiiiiiiIIi((String)"sc/b/S116.png");
        }
        this.ALLATORIxDEMO(g);
    }

    public boolean ALLATORIxDEMO() {
        if (this.IIiiIiiiIIiIi == 0) return super.ALLATORIxDEMO();
        this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u62bd\u5956\u8fd8\u6ca1\u6709\u7ed3\u675f\u65e0\u6cd5\u5173\u95ed\u9762\u677f");
        return false;
    }

    public void iiiIiiiiiiIIi() {
        if (this.IIiiIiiiIIiIi != 0) {
            this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u62bd\u5956\u8fd8\u6ca1\u6709\u7ed3\u675f\u65e0\u6cd5\u5173\u95ed\u9762\u677f");
            return;
        }
        Goodstable IiiiiiiiIIIII = this.ALLATORIxDEMO().getGood(this.IIIIiiiiiiiII);
        if (IiiiiiiiIIIII != null && IiiiiiiiIIIII.getUsetime() > 0) {
            String IiiiiiiiIIIII2 = Agreement.getSendTextAES((String)"user", (String)IiiiiiiiIIIII.getRgid().toString());
            this.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII2);
            IiiiiiiiIIIII.ALLATORIxDEMO(1);
            this.iiIiiiiiiiIii.setText(IiiiiiiiIIIII.getUsetime().toString());
            if (IiiiiiiiIIIII.getUsetime() > 0) return;
            this.ALLATORIxDEMO().iIiIiiiiIIiii(IiiiiiiiIIIII.getRgid());
            return;
        }
        this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u62bd\u5956\u6b21\u6570\u4e0d\u8db3");
    }

    public void ALLATORIxDEMO(Graphics g) {
        if (this.IIiiIiiiIIiIi == 0) {
            if (this.iIIiIiiiiiiIi) {
                if (this.IiiiiiiiIIIII != null) {
                    IiiiIiiiiIIII.ALLATORIxDEMO((AssetUpdate)this.IiiiiiiiIIIII.getAssetUpdate(), (GameView)this.iiIIiiiiIiIIi);
                    this.IiiiiiiiIIIII = null;
                }
                this.iIIiIiiiiiiIi = false;
            }
        } else {
            long IiiiiiiiIIIII = (iIiIIiiiIiiiI.ALLATORIxDEMO() - this.iIiIiiiiIiIii) / 17L;
            this.iIiiIiiiIiIIi += (IiiiiiiiIIIII -= this.iIiiIiiiIiIIi);
            this.iiiiIiiiIIiii = (int)((long)this.iiiiIiiiIIiii + IiiiiiiiIIIII);
            if (this.iiiiIiiiIIiii > (this.IIiiIiiiIIiIi > 1 ? 100 / this.IIiiIiiiIIiIi : 70)) {
                --this.IIiiIiiiIIiIi;
                ++this.iiIiIiiiiIIIi;
                if (this.iiIiIiiiiIIIi >= 14) {
                    this.iiIiIiiiiIIIi = 0;
                }
                this.iiiiIiiiIIiii = 0;
                if (this.iiIiIiiiiIIIi <= 4) {
                    this.iIiiIiiiiiiII = this.iiIiIiiiiIIIi * 84;
                    this.iiIiiiiiiIIiI = 121;
                } else if (this.iiIiIiiiiIIIi <= 7) {
                    this.iIiiIiiiiiiII = 335;
                    this.iiIiiiiiiIIiI = 121 + (this.iiIiIiiiiIIIi - 4) * 77;
                } else if (this.iiIiIiiiiIIIi <= 11) {
                    this.iIiiIiiiiiiII = 335 - (this.iiIiIiiiiIIIi - 7) * 84;
                    this.iiIiiiiiiIIiI = 352;
                } else if (this.iiIiIiiiiIIIi <= 13) {
                    this.iIiiIiiiiiiII = 0;
                    this.iiIiiiiiiIIiI = 352 - (this.iiIiIiiiiIIIi - 11) * 77;
                }
                if (this.IIiiIiiiIIiIi == 0) {
                    this.iIIiIiiiiiiIi = true;
                }
            }
        }
        iiiiIiiiIiiII.ALLATORIxDEMO(iIiIIiiiIiiiI.ALLATORIxDEMO(), 0);
        iiiiIiiiIiiII.ALLATORIxDEMO(g, this.iIiiIiiiiiiII, this.iiIiiiiiiIIiI - 130);
    }

    public void ALLATORIxDEMO(QuackGameBean gameBean) {
        if (this.IiiiiiiiIIIII != null) {
            this.iiIiIiiiiIIIi += this.IIiiIiiiIIiIi;
            this.iiIiIiiiiIIIi %= 14;
            this.IIiiIiiiIIiIi = 0;
            this.iIIiIiiiiiiIi = false;
            IiiiIiiiiIIII.ALLATORIxDEMO((AssetUpdate)this.IiiiiiiiIIIII.getAssetUpdate(), (GameView)this.iiIIiiiiIiIIi);
        }
        this.IiiiiiiiIIIII = gameBean;
        String[] IiiiiiiiIIIII = gameBean.getPetmsg().split("\\|");
        int IiiiiiiiIIIII2 = -1;
        int IiiiiiiiIIIII3 = 0;
        while (IiiiiiiiIIIII3 < this.IiIIIiiiiIiiI.length) {
            Goodstable IiiiiiiiIIIII4;
            String[] IiiiiiiiIIIII5 = IiiiiiiiIIIII3 < IiiiiiiiIIIII.length ? IiiiiiiiIIIII[IiiiiiiiIIIII3].split("_") : null;
            Goodstable goodstable = IiiiiiiiIIIII4 = IiiiiiiiIIIII5 != null ? this.ALLATORIxDEMO().ALLATORIxDEMO(new BigDecimal(IiiiiiiiIIIII5[0])) : null;
            if (IiiiiiiiIIIII4 != null) {
                this.IiIIIiiiiIiiI[IiiiiiiiIIIII3].ALLATORIxDEMO(1, (Object)IiiiiiiiIIIII4);
                int IiiiiiiiIIIII6 = Integer.parseInt(IiiiiiiiIIIII5[1]);
                this.IiIiiiiiIIIII[IiiiiiiiIIIII3].setText(IiiiiiiiIIIII6 > 1 ? IiiiiiiiIIIII5[1] : "");
                this.iiIIIiiiiiiiI[IiiiiiiiIIIII3].setText(IiiiiiiiIIIII4.getGoodsname());
                if (IiiiiiiiIIIII2 == -1) {
                    IiiiiiiiIIIII2 = IiiiiiiiIIIII5[2].equals("1") ? IiiiiiiiIIIII3 : -1;
                }
            } else {
                this.IiIIIiiiiIiiI[IiiiiiiiIIIII3].ALLATORIxDEMO(0, null);
                this.IiIiiiiiIIIII[IiiiiiiiIIIII3].setText("");
                this.iiIIIiiiiiiiI[IiiiiiiiIIIII3].setText("");
            }
            ++IiiiiiiiIIIII3;
        }
        IiiiiiiiIIIII3 = 14 - this.iiIiIiiiiIIIi;
        this.iIiIiiiiIiIii = iIiIIiiiIiiiI.ALLATORIxDEMO();
        this.iIiiIiiiIiIIi = 0L;
        this.IIiiIiiiIIiIi = IiiiiiiiIIIII2 + 14 * (IiiiIiiiiIiIi.iIiIiiiiIiIii.nextInt(3) == 0 ? 3 : 2) + IiiiiiiiIIIII3;
    }

    public void ALLATORIxDEMO(Goodstable good) {
        if (this.IIiiIiiiIIiIi != 0) {
            this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u62bd\u5956\u8fd8\u6ca1\u6709\u7ed3\u675f");
            return;
        }
        this.IIIIiiiiiiiII = good.getRgid();
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IiIIIiiiiIiiI.length) {
            this.IiIIIiiiiIiiI[IiiiiiiiIIIII].ALLATORIxDEMO(0, null);
            this.IiIiiiiiIIIII[IiiiiiiiIIIII].setText("");
            this.iiIIIiiiiiiiI[IiiiiiiiIIIII++].setText("");
        }
        this.iiIiiiiiiiIii.setText(good.getUsetime().toString());
        this.ALLATORIxDEMO().iIiIiiiiIIiIi(this.iIiIiiiiIIiii());
    }

    public iiiiiiiiiIiII(GameView gameView) {
        super(118, 2, com.xy.q.IiiiIiiiiIiIi.iIIIIiiiiiIIi, gameView);
        this.ALLATORIxDEMO(-1, 0, 430, 320, com.xy.q.IiiiIiiiiIiIi.iIIiIiiiiiiIi);
        this.iiiIiiiiiiIIi("sc/b/S195.png");
        this.ALLATORIxDEMO = new IiiiiiiiiIIII("sc/e/31.png", 1, 229, iiIIiiiiIiiII.iiiiIiiiIiiII, iiIIiiiiIiiII.IIiiiiiiIiiII, "\u62bd\u5956", (com.xy.q.IiiiIiiiiIiIi)this);
        this.ALLATORIxDEMO.setBounds(165, 142, 79, 25);
        this.add((Component)this.ALLATORIxDEMO);
        this.IiIIIiiiiIiiI = new IIIiiiiiIiIiI[14];
        this.IiIiiiiiIIIII = new JLabel[14];
        this.iiIIIiiiiiiiI = new JLabel[14];
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IiIIIiiiiIiiI.length) {
            this.IiIIIiiiiIiiI[IiiiiiiiIIIII] = new IIIiiiiiIiIiI((com.xy.q.IiiiIiiiiIiIi)this);
            this.IiIIIiiiiIiiI[IiiiiiiiIIIII].setOpaque(false);
            this.IiIiiiiiIIIII[IiiiiiiiIIIII] = new JLabel("", 4);
            this.IiIiiiiiIIIII[IiiiiiiiIIIII].setOpaque(false);
            this.IiIiiiiiIIIII[IiiiiiiiIIIII].setForeground(Color.red);
            this.iiIIIiiiiiiiI[IiiiiiiiIIIII] = new JLabel("", 0);
            this.iiIIIiiiiiiiI[IiiiiiiiIIIII].setOpaque(false);
            this.iiIIIiiiiiiiI[IiiiiiiiIIIII].setForeground(Color.black);
            if (IiiiiiiiIIIII <= 4) {
                if (IiiiiiiiIIIII >= 3) {
                    this.IiIIIiiiiIiiI[IiiiiiiiIIIII].setBounds(187 + (IiiiiiiiIIIII - 2) * 84, 11, 51, 51);
                } else {
                    this.IiIIIiiiiIiiI[IiiiiiiiIIIII].setBounds(20 + IiiiiiiiIIIII * 84, 11, 51, 51);
                }
            } else if (IiiiiiiiIIIII <= 7) {
                this.IiIIIiiiiIiiI[IiiiiiiiIIIII].setBounds(355, 11 + (IiiiiiiiIIIII - 4) * 77, 51, 51);
            } else if (IiiiiiiiIIIII <= 11) {
                if (IiiiiiiiIIIII >= 9) {
                    this.IiIIIiiiiIiiI[IiiiiiiiIIIII].setBounds(355 - (IiiiiiiiIIIII - 7) * 84 + 1, 242, 51, 51);
                } else {
                    this.IiIIIiiiiIiiI[IiiiiiiiIIIII].setBounds(355 - (IiiiiiiiIIIII - 7) * 84, 242, 51, 51);
                }
            } else if (IiiiiiiiIIIII <= 13) {
                this.IiIIIiiiiIiiI[IiiiiiiiIIIII].setBounds(20, 242 - (IiiiiiiiIIIII - 11) * 77, 51, 51);
            }
            this.IiIiiiiiIIIII[IiiiiiiiIIIII].setBounds(this.IiIIIiiiiIiiI[IiiiiiiiIIIII].getX() + 32, this.IiIIIiiiiIiiI[IiiiiiiiIIIII].getY() + 2, 17, 12);
            this.iiIIIiiiiiiiI[IiiiiiiiIIIII].setBounds(this.IiIIIiiiiIiiI[IiiiiiiiIIIII].getX() - 8, this.IiIIIiiiiIiiI[IiiiiiiiIIIII].getY() + 50, 75, 20);
            this.IiIIIiiiiIiiI[IiiiiiiiIIIII].setBounds(this.IiIIIiiiiIiiI[IiiiiiiiIIIII].getX() + 1, this.IiIIIiiiiIiiI[IiiiiiiiIIIII].getY() + 1, 51, 51);
            this.add(this.iiIIIiiiiiiiI[IiiiiiiiIIIII]);
            this.add(this.IiIiiiiiIIIII[IiiiiiiiIIIII]);
            this.add((Component)this.IiIIIiiiiIiiI[IiiiiiiiIIIII++]);
        }
        this.iiIiiiiiiiIii = new JLabel("100", 0);
        this.iiIiiiiiiiIii.setBounds(233, 188, 40, 14);
        this.iiIiiiiiiiIii.setForeground(Color.red);
        this.iiIiiiiiiiIii.setFont(iiIIiiiiIiiII.iiIiiiiiiIIiI);
        this.add(this.iiIiiiiiiiIii);
    }
}
