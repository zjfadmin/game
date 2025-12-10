/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.i.IiiiIiiiiIiIi
 *  com.xy.a.i.iIiIIiiiIiiiI
 *  com.xy.a.iiIiiiiiIIiiI
 *  com.xy.a.q.IIIIIiiiIiIii
 *  com.xy.bean.QualityClBean
 *  com.xy.bean.SuitOperBean
 *  com.xy.formula.GoodType
 *  com.xy.game.RoleData
 *  com.xy.i.iiIiIiiiiIiii
 *  com.xy.q.IIIiiiiiIiIiI
 *  com.xy.q.IiIIIiiiiIIiI
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.q.iIIiIiiiIiiIi
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.q.iiIiIiiiiIiIi
 *  com.xy.readbean.Goodstable
 *  com.xy.readbean.MoneyType
 *  com.xy.socket.Agreement
 *  com.xy.text.GameView
 *  com.xy.v.IIIiiiiiIiIiI
 *  com.xy.v.IIiiIiiiiIIiI
 *  com.xy.v.iiIiiiiiIIiii
 *  com.xy.w.IIIIIiiiIiiII
 *  com.xy.w.IIIiiiiiIiIiI
 */
package com.xy.a.i;

import com.xy.a.i.IiiiIiiiiIiIi;
import com.xy.a.i.iIiIIiiiIiiiI;
import com.xy.a.iiIiiiiiIIiiI;
import com.xy.a.q.IIIIIiiiIiIii;
import com.xy.bean.QualityClBean;
import com.xy.bean.SuitOperBean;
import com.xy.formula.GoodType;
import com.xy.game.RoleData;
import com.xy.i.iiIiIiiiiIiii;
import com.xy.q.IiIIIiiiiIIiI;
import com.xy.q.iIIiIiiiIiiIi;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.q.iiIiIiiiiIiIi;
import com.xy.readbean.Goodstable;
import com.xy.readbean.MoneyType;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import com.xy.v.IIiiIiiiiIIiI;
import com.xy.v.iiIiiiiiIIiii;
import com.xy.w.IIIIIiiiIiiII;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.MouseListener;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JLabel;

public class IIIiiiiiIiIiI
extends com.xy.q.IiiiIiiiiIiIi {
    private MoneyType iiIIIiiiiiiiI;
    private BigDecimal IiIiiiiiIIIII;
    private BigDecimal iiIiIiiiiIIIi = new BigDecimal(30);
    private QualityClBean iiiiIiiiIiiII;
    private boolean iiiIiiiiiiiIi = true;
    private com.xy.q.IIIiiiiiIiIiI iIiiIiiiiiiII;
    private iIIiIiiiIiiIi[] IIiiIiiiIIiIi;
    private iiIiIiiiiIiii[] iIiIiiiiIiIii;
    private com.xy.w.IIIiiiiiIiIiI[] IiIIIiiiiIiiI;
    private iiIiIiiiiIiIi[] iiIiiiiiiiIii;
    private JLabel[] IiiiiiiiIIIII;
    private MoneyType ALLATORIxDEMO;

    /*
     * WARNING - void declaration
     */
    public boolean ALLATORIxDEMO(int id) {
        void IiiiiiiiIIIII;
        if (id == 21) {
            this.ALLATORIxDEMO().iiiIiiiiiiIIi(this.iIiIiiiiIIiii());
            return false;
        }
        Goodstable IiiiiiiiIIIII2 = (Goodstable)this.iIiiIiiiiiiII.ALLATORIxDEMO();
        if (IiiiiiiiIIIII2 != null) {
            IiiiiiiiIIIII2 = this.ALLATORIxDEMO().getGood(IiiiiiiiIIIII2.getRgid());
        }
        if (IiiiiiiiIIIII2 == null) {
            return false;
        }
        if (id == 22) {
            if (this.iiiiIiiiIiiII == null) {
                return false;
            }
            String IiiiiiiiIIIII3 = Agreement.getSendTextAES((String)"extrattroper", (String)iiIiiiiiIIiii.ALLATORIxDEMO().toJson(this.iiiiIiiiIiiII));
            this.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII3);
            this.iiiiIiiiIiiII.setType(-4);
            this.ALLATORIxDEMO(this.iiiiIiiiIiiII);
            return false;
        }
        RoleData IiiiiiiiIIIII4 = this.ALLATORIxDEMO();
        if (IiiiiiiiIIIII4.getLoginResult().getGold().longValue() < this.IiIiiiiiIIIII.longValue()) {
            this.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u91d1\u5e01\u4e0d\u8db3");
            return false;
        }
        if (IiiiiiiiIIIII4.getLoginResult().getScoretype("\u7075\u4fee\u503c").longValue() < this.iiIiIiiiiIIIi.longValue()) {
            this.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u7075\u4fee\u503c\u4e0d\u8db3");
            return false;
        }
        SuitOperBean IiiiiiiiIIIII5 = new SuitOperBean();
        ArrayList arrayList = new ArrayList();
        IiiiiiiiIIIII.add(IiiiiiiiIIIII2.getRgid());
        IiiiiiiiIIIII5.setType(this.iiiIiiiiiiiIi ? 2 : 1);
        IiiiiiiiIIIII5.setGoods((List)IiiiiiiiIIIII);
        String IiiiiiiiIIIII6 = Agreement.getSendTextAES((String)"suitoperate", (String)iiIiiiiiIIiii.ALLATORIxDEMO().toJson(IiiiiiiiIIIII5));
        this.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII6);
        IiiiiiiiIIIII4.getLoginResult().setGold(IiiiiiiiIIIII4.getLoginResult().getGold().subtract(this.IiIiiiiiIIIII));
        IiiiiiiiIIIII4.getLoginResult().setScore(com.xy.v.IIIiiiiiIiIiI.iIiIiiiiIIiii((String)IiiiiiiiIIIII4.getLoginResult().getScore(), (String)("\u7075\u4fee\u503c=" + this.iiIiIiiiiIIIi.longValue()), (int)3));
        this.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u6d88\u8017\u4e86" + this.IiIiiiiiIIIII + "\u91d1\u5e01\u548c" + this.iiIiIiiiiIIIi + "\u70b9\u7075\u4fee\u503c");
        return true;
    }

    public IIIiiiiiIiIiI(GameView gameView) {
        super(74, 3, com.xy.q.IiiiIiiiiIiIi.iIIIIiiiiiIIi, gameView);
        this.IiIiiiiiIIIII = new BigDecimal(100000);
        this.ALLATORIxDEMO(-1, 0, 482, 350, com.xy.q.IiiiIiiiiIiIi.iiIIIiiiiiiiI);
        this.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/1.png", (int)68, (int)68, (int)68, (int)68, (boolean)false), "\u5957\u88c5\u6d17\u7ec3");
        this.iIiIiiiiIiIii = new iiIiIiiiiIiii[3];
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iIiIiiiiIiIii.length) {
            this.iIiIiiiiIiIii[IiiiiiiiIIIII] = new iiIiIiiiiIiii("sc/e/26.png", 1, 20 + IiiiiiiiIIIII, iiIIiiiiIiiII.iiiiIiiiIiiII, iiIIiiiiIiiII.IIiiiiiiIiiII, IiiiiiiiIIIII == 0 ? "\u5f00\u59cb\u6d17\u7ec3" : (IiiiiiiiIIIII == 1 ? "\u4fdd\u7559\u5c5e\u6027" : (IiiiiiiiIIIII == 2 ? "\u66ff\u6362\u5c5e\u6027" : "")), (com.xy.q.IiiiIiiiiIiIi)this);
            if (IiiiiiiiIIIII == 0) {
                this.iIiIiiiiIiIii[IiiiiiiiIIIII].setBounds(320, 155, 99, 25);
            } else if (IiiiiiiiIIIII == 1 || IiiiiiiiIIIII == 2) {
                this.iIiIiiiiIiIii[IiiiiiiiIIIII].setBounds(96 + (IiiiiiiiIIIII - 1) * 209, 302, 99, 25);
            }
            this.add((Component)this.iIiIiiiiIiIii[IiiiiiiiIIIII++]);
        }
        this.IiiiiiiiIIIII = new JLabel[15];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IiiiiiiiIIIII.length) {
            this.IiiiiiiiIIIII[IiiiiiiiIIIII] = IiIIIiiiiIIiI.ALLATORIxDEMO((int)148, (int)(73 + 30 * IiiiiiiiIIIII), (int)110, (int)19, (int)0, (Color)iiIIiiiiIiiII.ALLATORIxDEMO((String)"#c000000"), (Font)iiIIiiiiIiiII.iiiiIiiiIiiII);
            this.IiiiiiiiIIIII[IiiiiiiiIIIII].setText(IiiiiiiiIIIII == 0 ? "\u6240\u9700\u91d1\u94b1\uff1a" : (IiiiiiiiIIIII == 1 ? "\u6240\u9700\u7075\u4fee\u503c\uff1a" : (IiiiiiiiIIIII == 2 ? "/" : (IiiiiiiiIIIII == 3 ? "/" : (IiiiiiiiIIIII == 4 ? "\u82b1\u8d39\u91d1\u94b1\u4fdd\u7559\u539f\u5957\u88c5\u5c5e\u6027\u3002" : (IiiiiiiiIIIII == 5 ? "\u73b0\u6709\u5957\u88c5\u5c5e\u6027" : (IiiiiiiiIIIII == 6 ? "\u65b0\u5957\u88c5\u5c5e\u6027" : "")))))));
            this.add(this.IiiiiiiiIIIII[IiiiiiiiIIIII]);
            if (IiiiiiiiIIIII == 0 || IiiiiiiiIIIII == 1) {
                this.IiiiiiiiIIIII[IiiiiiiiIIIII].setHorizontalAlignment(10);
            }
            if (IiiiiiiiIIIII == 2 || IiiiiiiiIIIII == 3) {
                this.IiiiiiiiIIIII[IiiiiiiiIIIII].setFont(iiIIiiiiIiiII.iIiIiiiiIiiii);
                this.IiiiiiiiIIIII[IiiiiiiiIIIII].setBounds(314, 73 + 30 * (IiiiiiiiIIIII - 2), 15, 19);
            } else if (IiiiiiiiIIIII == 4) {
                this.IiiiiiiiIIIII[IiiiiiiiIIIII].setHorizontalAlignment(10);
                this.IiiiiiiiIIIII[IiiiiiiiIIIII].setFont(iiIIiiiiIiiII.iIiIiiiiiiIIi);
                this.IiiiiiiiIIIII[IiiiiiiiIIIII].setBounds(90, 136, 200, 17);
            } else if (IiiiiiiiIIIII >= 5 && IiiiiiiiIIIII <= 6) {
                this.IiiiiiiiIIIII[IiiiiiiiIIIII].setBounds(52 + (IiiiiiiiIIIII - 5) * 210, 217, 191, 20);
                this.IiiiiiiiIIIII[IiiiiiiiIIIII].setForeground(iiIIiiiiIiiII.ALLATORIxDEMO((String)"#cFFFFFF"));
            } else if (IiiiiiiiIIIII >= 7 && IiiiiiiiIIIII <= 14) {
                this.IiiiiiiiIIIII[IiiiiiiiIIIII].setFont(iiIIiiiiIiiII.iIIIiiiiIIIii);
                this.IiiiiiiiIIIII[IiiiiiiiIIIII].setForeground(iiIIiiiiIiiII.ALLATORIxDEMO((String)"#cFFFFFF"));
                if (IiiiiiiiIIIII == 7) {
                    this.IiiiiiiiIIIII[IiiiiiiiIIIII].setBounds(52, 237, 135, 27);
                } else if (IiiiiiiiIIIII == 8) {
                    this.IiiiiiiiIIIII[IiiiiiiiIIIII].setBounds(187, 237, 56, 27);
                } else if (IiiiiiiiIIIII == 9) {
                    this.IiiiiiiiIIIII[IiiiiiiiIIIII].setBounds(52, 264, 135, 27);
                } else if (IiiiiiiiIIIII == 10) {
                    this.IiiiiiiiIIIII[IiiiiiiiIIIII].setBounds(187, 264, 56, 27);
                } else if (IiiiiiiiIIIII == 11) {
                    this.IiiiiiiiIIIII[IiiiiiiiIIIII].setBounds(262, 237, 135, 27);
                } else if (IiiiiiiiIIIII == 12) {
                    this.IiiiiiiiIIIII[IiiiiiiiIIIII].setBounds(397, 237, 56, 27);
                } else if (IiiiiiiiIIIII == 13) {
                    this.IiiiiiiiIIIII[IiiiiiiiIIIII].setBounds(262, 264, 135, 27);
                } else if (IiiiiiiiIIIII == 14) {
                    this.IiiiiiiiIIIII[IiiiiiiiIIIII].setBounds(397, 264, 56, 27);
                }
            }
            ++IiiiiiiiIIIII;
        }
        this.IIiiIiiiIIiIi = new iIIiIiiiIiiIi[2];
        this.iiIiiiiiiiIii = new iiIiIiiiiIiIi[2];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IIiiIiiiIIiIi.length) {
            this.IIiiIiiiIIiIi[IiiiiiiiIIIII] = IiIIIiiiiIIiI.ALLATORIxDEMO((int)245, (int)(73 + 30 * IiiiiiiiIIIII), (int)69, (int)19, (int)10, (Color)Color.white, (Font)iiIIiiiiIiiII.iIIIiiiiIIIii);
            this.IIiiIiiiIIiIi[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/17.png", (int)6, (int)6, (int)6, (int)6, (boolean)false));
            this.add((Component)this.IIiiIiiiIIiIi[IiiiiiiiIIIII++]);
        }
        this.ALLATORIxDEMO = new MoneyType();
        this.iiIIIiiiiiiiI = new MoneyType();
        this.ALLATORIxDEMO.setIdAndKey(1, "\u91d1\u94b1");
        this.iiIIIiiiiiiiI.setIdAndKey(0, "\u7075\u4fee\u503c");
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iiIiiiiiiiIii.length) {
            IIIiiiiiIiIiI iIIiiiiiIiIiI = this;
            this.iiIiiiiiiiIii[IiiiiiiiIIIII] = IiIIIiiiiIIiI.ALLATORIxDEMO((int)10, (Color)Color.white, (Font)iiIIiiiiIiiII.iIIIiiiiIIIii, (MoneyType)(IiiiiiiiIIIII == 0 ? iIIiiiiiIiIiI.ALLATORIxDEMO : iIIiiiiiIiIiI.iiIIIiiiiiiiI), (GameView)gameView);
            this.iiIiiiiiiiIii[IiiiiiiiIIIII].setBounds(329, 73 + 30 * IiiiiiiiIIIII, 109, 19);
            this.iiIiiiiiiiIii[IiiiiiiiIIIII].ALLATORIxDEMO(2);
            this.iiIiiiiiiiIii[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/17.png", (int)6, (int)6, (int)6, (int)6, (boolean)false));
            this.add((Component)this.iiIiiiiiiiIii[IiiiiiiiIIIII++]);
        }
        this.iIiiIiiiiiiII = new com.xy.q.IIIiiiiiIiIiI((com.xy.q.IiiiIiiiiIiIi)this);
        this.iIiiIiiiiiiII.setBounds(76, 73, 50, 50);
        this.add((Component)this.iIiiIiiiiiiII);
        this.IiIIIiiiiIiiI = new com.xy.w.IIIiiiiiIiIiI[13];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IiIIIiiiiIiiI.length) {
            this.IiIIIiiiiIiiI[IiiiiiiiIIIII] = new com.xy.w.IIIiiiiiIiIiI();
            this.add((Component)this.IiIIIiiiiIiiI[IiiiiiiiIIIII]);
            if (IiiiiiiiIIIII == 0) {
                this.IiIIIiiiiIiiI[IiiiiiiiIIIII].iIiIiiiiIIiii("sc/d/4.png");
                this.IiIIIiiiiIiiI[IiiiiiiiIIIII].setBounds(72, 69, 59, 57);
            } else if (IiiiiiiiIIIII == 1) {
                this.IiIIIiiiiIiiI[IiiiiiiiIIIII].iIiIiiiiIIiii("sc/e/30.png");
                this.IiIIIiiiiIiiI[IiiiiiiiIIIII].setBounds(72, 136, 17, 17);
                this.IiIIIiiiiIiiI[IiiiiiiiIIIII].addMouseListener((MouseListener)new IiiiIiiiiIiIi(this));
            } else if (IiiiiiiiIIIII == 2) {
                this.IiIIIiiiiIiiI[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/36.png", (int)30, (int)30, (int)30, (int)30, (boolean)false));
                this.IiIIIiiiiIiiI[IiiiiiiiIIIII].setBounds(52, 37, 400, 160);
            } else if (IiiiiiiiIIIII >= 3 && IiiiiiiiIIIII <= 12) {
                this.IiIIIiiiiIiiI[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/24.png", (int)2, (int)2, (int)2, (int)2, (boolean)false));
                if (IiiiiiiiIIIII >= 3 && IiiiiiiiIIIII <= 4) {
                    this.IiIIIiiiiIiiI[IiiiiiiiIIIII].setBounds(52 + (IiiiiiiiIIIII - 3) * 210, 217, 191, 20);
                } else if (IiiiiiiiIIIII == 5) {
                    this.IiIIIiiiiIiiI[IiiiiiiiIIIII].setBounds(52, 237, 135, 27);
                } else if (IiiiiiiiIIIII == 6) {
                    this.IiIIIiiiiIiiI[IiiiiiiiIIIII].setBounds(187, 237, 56, 27);
                } else if (IiiiiiiiIIIII == 7) {
                    this.IiIIIiiiiIiiI[IiiiiiiiIIIII].setBounds(52, 264, 135, 27);
                } else if (IiiiiiiiIIIII == 8) {
                    this.IiIIIiiiiIiiI[IiiiiiiiIIIII].setBounds(187, 264, 56, 27);
                } else if (IiiiiiiiIIIII == 9) {
                    this.IiIIIiiiiIiiI[IiiiiiiiIIIII].setBounds(262, 237, 135, 27);
                } else if (IiiiiiiiIIIII == 10) {
                    this.IiIIIiiiiIiiI[IiiiiiiiIIIII].setBounds(397, 237, 56, 27);
                } else if (IiiiiiiiIIIII == 11) {
                    this.IiIIIiiiiIiiI[IiiiiiiiIIIII].setBounds(262, 264, 135, 27);
                } else if (IiiiiiiiIIIII == 12) {
                    this.IiIIIiiiiIiiI[IiiiiiiiIIIII].setBounds(397, 264, 56, 27);
                }
            }
            ++IiiiiiiiIIIII;
        }
        this.IiIiiiiiIIIII = new BigDecimal(this.iiiIiiiiiiiIi ? 100000 : 80000);
        iiIIiiiiIiiII.ALLATORIxDEMO((JLabel)this.IIiiIiiiIIiIi[0], (long)this.IiIiiiiiIIIII.longValue());
        iiIIiiiiIiiII.ALLATORIxDEMO((JLabel)this.IIiiIiiiIIiIi[1], (long)this.iiIiIiiiiIIIi.longValue());
    }

    static /* synthetic */ BigDecimal ALLATORIxDEMO(IIIiiiiiIiIiI arg0) {
        return arg0.IiIiiiiiIIIII;
    }

    static /* synthetic */ iIIiIiiiIiiIi[] ALLATORIxDEMO(IIIiiiiiIiIiI arg0) {
        return arg0.IIiiIiiiIIiIi;
    }

    static /* synthetic */ void ALLATORIxDEMO(IIIiiiiiIiIiI arg0, BigDecimal arg1) {
        arg0.IiIiiiiiIIIII = arg1;
    }

    static /* synthetic */ void ALLATORIxDEMO(IIIiiiiiIiIiI arg0, boolean arg1) {
        arg0.iiiIiiiiiiiIi = arg1;
    }

    public void iIiIiiiiIIiii(Goodstable good) {
        this.iiiiIiiiIiiII = null;
        this.iIiiIiiiiiiII.ALLATORIxDEMO(1, (Object)good);
        if (this.ALLATORIxDEMO().ALLATORIxDEMO(2, 12)) {
            String IiiiiiiiIIIII = IIiiIiiiiIIiI.iIiIiiiiIIiii((String)good.getValue(), (String)"\u5957\u88c5\u54c1\u8d28=", (String)"|");
            this.iiIiIiiiiIIIi = IIiiIiiiiIIiI.iIiIiiiiIIiIi((String)IiiiiiiiIIIII) ? new BigDecimal(30) : (IiiiiiiiIIIII.equals("\u4f20\u4e16") ? new BigDecimal(30) : (IiiiiiiiIIIII.equals("\u65e0\u4ef7") ? new BigDecimal(25) : (IiiiiiiiIIIII.equals("\u73cd\u85cf") ? new BigDecimal(20) : (IiiiiiiiIIIII.equals("\u8d34\u8eab") ? new BigDecimal(15) : (IiiiiiiiIIIII.equals("\u628a\u73a9") ? new BigDecimal(10) : new BigDecimal(30))))));
            iiIIiiiiIiiII.ALLATORIxDEMO((JLabel)this.IIiiIiiiIIiIi[1], (long)this.iiIiIiiiiIIIi.longValue());
        }
        this.ALLATORIxDEMO(good);
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iiIiiiiiiiIii.length) {
            this.iiIiiiiiiiIii[IiiiiiiiIIIII++].iIiIiiiiIIiii();
        }
        this.ALLATORIxDEMO().iIiIiiiiIIiIi(this.iIiIiiiiIIiii());
    }

    static /* synthetic */ boolean ALLATORIxDEMO(IIIiiiiiIiIiI arg0) {
        return arg0.iiiIiiiiiiiIi;
    }

    public void ALLATORIxDEMO(QualityClBean clBean) {
        this.iiiiIiiiIiiII = null;
        Goodstable IiiiiiiiIIIII = (Goodstable)this.iIiiIiiiiiiII.ALLATORIxDEMO();
        if (IiiiiiiiIIIII != null) {
            IiiiiiiiIIIII = this.ALLATORIxDEMO().getGood(IiiiiiiiIIIII.getRgid());
        }
        if (IiiiiiiiIIIII == null) return;
        if (IiiiiiiiIIIII.getRgid().compareTo(clBean.getRgid()) != 0) {
            return;
        }
        if (clBean.getType() == -4) {
            iIiIIiiiIiiiI IiiiiiiiIIIII2;
            String[] IiiiiiiiIIIII3 = IiiiiiiiIIIII.getValue().split("\\|");
            String IiiiiiiiIIIII4 = GoodType.ALLATORIxDEMO((String[])IiiiiiiiIIIII3, (int)3, (String)clBean.getNewAttr());
            IiiiiiiiIIIII.setValue(IiiiiiiiIIIII4);
            IIIIIiiiIiIii IiiiiiiiIIIII5 = (IIIIIiiiIiIii)this.ALLATORIxDEMO().iIiIiiiiIIiii(61);
            if (IiiiiiiiIIIII5 != null && IiiiiiiiIIIII5.iiiIiiiiiiIIi() == 3 && (IiiiiiiiIIIII2 = IiiiiiiiIIIII5.ALLATORIxDEMO()).iiiIiiiiiiIIi() == 1) {
                IiiiiiiiIIIII2.ALLATORIxDEMO().IiiIiiiiiiIiI();
            }
            this.ALLATORIxDEMO(IiiiiiiiIIIII);
            return;
        }
        String[] IiiiiiiiIIIII6 = clBean.getNewAttr().split("\\&");
        int IiiiiiiiIIIII7 = 4;
        while (IiiiiiiiIIIII7 < 6) {
            if (IiiiiiiiIIIII7 < IiiiiiiiIIIII6.length) {
                String[] IiiiiiiiIIIII8 = IiiiiiiiIIIII6[IiiiiiiiIIIII7].split("\\=");
                this.IiiiiiiiIIIII[11 + 2 * (IiiiiiiiIIIII7 - 4)].setText(IiiiiiiiIIIII8[0]);
                this.IiiiiiiiIIIII[11 + 2 * (IiiiiiiiIIIII7 - 4) + 1].setText(String.valueOf(IiiiiiiiIIIII8[1]) + iiIiiiiiIIiiI.iIiIiiiiIIiii((String)IiiiiiiiIIIII8[0]));
            } else {
                this.IiiiiiiiIIIII[11 + 2 * (IiiiiiiiIIIII7 - 4)].setText(null);
                this.IiiiiiiiIIIII[11 + 2 * (IiiiiiiiIIIII7 - 4) + 1].setText(null);
            }
            ++IiiiiiiiIIIII7;
        }
        this.iiiiIiiiIiiII = clBean;
    }

    /*
     * WARNING - void declaration
     */
    public void ALLATORIxDEMO(Goodstable good) {
        int IiiiiiiiIIIII = 7;
        while (IiiiiiiiIIIII < this.IiiiiiiiIIIII.length) {
            this.IiiiiiiiIIIII[IiiiiiiiIIIII++].setText(null);
        }
        String IiiiiiiiIIIII2 = GoodType.getExtra((String)good.getValue(), (String)GoodType.Extras[3]);
        if (IiiiiiiiIIIII2 == null) return;
        String[] IiiiiiiiIIIII3 = IiiiiiiiIIIII2.split("\\&");
        int IiiiiiiiIIIII4 = 4;
        while (IiiiiiiiIIIII4 < IiiiiiiiIIIII3.length) {
            void IiiiiiiiIIIII5;
            String[] stringArray = IiiiiiiiIIIII3[IiiiiiiiIIIII4].split("\\=");
            this.IiiiiiiiIIIII[7 + 2 * (IiiiiiiiIIIII4 - 4)].setText((String)IiiiiiiiIIIII5[0]);
            this.IiiiiiiiIIIII[7 + 2 * (IiiiiiiiIIIII4 - 4) + 1].setText(String.valueOf(IiiiiiiiIIIII5[1]) + iiIiiiiiIIiiI.iIiIiiiiIIiii((String)IiiiiiiiIIIII5[0]));
            if (IiiiiiiiIIIII4 == 5) {
                return;
            }
            ++IiiiiiiiIIIII4;
        }
    }

    static /* synthetic */ com.xy.w.IIIiiiiiIiIiI[] ALLATORIxDEMO(IIIiiiiiIiIiI arg0) {
        return arg0.IiIIIiiiiIiiI;
    }
}
