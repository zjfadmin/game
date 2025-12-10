/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.i.IIiIiiiiIIiii
 *  com.xy.a.i.IIiIiiiiIiiIi
 *  com.xy.a.i.IIiiIiiiIiiiI
 *  com.xy.bean.SuitOperBean
 *  com.xy.entity.PartJade
 *  com.xy.game.RoleData
 *  com.xy.i.IIiiIiiiIiiiI
 *  com.xy.i.iiIiIiiiiIiii
 *  com.xy.q.IIIiIiiiiIIiI
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
 *  com.xy.v.IIiiIiiiiIIiI
 *  com.xy.v.iiIiiiiiIIiii
 *  com.xy.w.IIIIIiiiIiiII
 *  com.xy.w.IIIiiiiiIiIiI
 */
package com.xy.a.i;

import com.xy.a.i.IIiIiiiiIIiii;
import com.xy.a.i.IIiIiiiiIiiIi;
import com.xy.a.i.IIiiIiiiIiiiI;
import com.xy.bean.SuitOperBean;
import com.xy.entity.PartJade;
import com.xy.game.RoleData;
import com.xy.i.iiIiIiiiiIiii;
import com.xy.q.IIIiIiiiiIIiI;
import com.xy.q.IiIIIiiiiIIiI;
import com.xy.q.IiiiIiiiiIiIi;
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
import com.xy.w.IIIiiiiiIiIiI;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseListener;
import java.math.BigDecimal;
import java.util.ArrayList;
import javax.swing.JLabel;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class IiiiiiiiiIIII
extends IiiiIiiiiIiIi {
    private iIIiIiiiIiiIi IIIIiiiiiiiII;
    private BigDecimal iiIIIiiiiiiiI;
    private IIIiIiiiiIIiI IiIiiiiiIIIII;
    private IIIiiiiiIiIiI[] iiIiIiiiiIIIi;
    private iiIiIiiiiIiii[] iiiiIiiiIiiII;
    private com.xy.q.IIIiiiiiIiIiI[] iiiIiiiiiiiIi;
    private static Image iIiiIiiiiiiII = IIIIIiiiIiiII.iiiIiiiiiiIIi((String)"sc/d/18.png");
    private int IIiiIiiiIIiIi = -1;
    private IIiIiiiiIiiIi iIiIiiiiIiIii;
    private JLabel[] IiIIIiiiiIiiI;
    private MoneyType iiIiiiiiiiIii;
    private iiIiIiiiiIiIi IiiiiiiiIIIII;
    private iIIiIiiiIiiIi ALLATORIxDEMO;

    static /* synthetic */ Image ALLATORIxDEMO() {
        return iIiiIiiiiiiII;
    }

    protected void paintComponent(Graphics g) {
        if (this.iiIIiiiiIiIIi.iIiIiiiiIIiii()) {
            this.iiiIiiiiiiIIi();
        }
        super.paintComponent(g);
    }

    public void iiiIiiiiiiIIi() {
        if (this.iiiIiiiiiiiIi[0].ALLATORIxDEMO() == 0) return;
        RoleData IiiiiiiiIIIII = this.ALLATORIxDEMO();
        Goodstable IiiiiiiiIIIII2 = (Goodstable)this.iiiIiiiiiiiIi[0].ALLATORIxDEMO();
        if (IiiiiiiiIIIII2 != null) {
            IiiiiiiiIIIII2 = IiiiiiiiIIIII.getGood(IiiiiiiiIIIII2.getRgid());
        }
        if (IiiiiiiiIIIII2 == null) {
            this.ALLATORIxDEMO(null);
            return;
        }
        if (this.IIiiIiiiIIiIi != 0) return;
        this.ALLATORIxDEMO.setText("50/" + IiiiiiiiIIIII2.getUsetime());
        this.ALLATORIxDEMO.setForeground(IiiiiiiiIIIII2.getUsetime() < 50 ? Color.red : Color.white);
    }

    public boolean iIiIiiiiIIiii() {
        ArrayList<BigDecimal> IiiiiiiiIIIII;
        RoleData IiiiiiiiIIIII2 = this.ALLATORIxDEMO();
        Goodstable IiiiiiiiIIIII3 = (Goodstable)this.iiiIiiiiiiiIi[0].ALLATORIxDEMO();
        if (IiiiiiiiIIIII3 != null) {
            IiiiiiiiIIIII3 = IiiiiiiiIIIII2.getGood(IiiiiiiiIIIII3.getRgid());
        }
        if (IiiiiiiiIIIII3 == null) {
            this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u8bf7\u9009\u62e9\u5bf9\u5e94\u7269\u54c1");
            return false;
        }
        if (this.iiIIIiiiiiiiI != null && IiiiiiiiIIIII2.getLoginResult().getGold().compareTo(this.iiIIIiiiiiiiI) < 0) {
            this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u5927\u8bdd\u5e01\u4e0d\u8db3" + this.iiIIIiiiiiiiI.longValue() / 10000L + "\u4e07");
            return false;
        }
        SuitOperBean IiiiiiiiIIIII4 = new SuitOperBean();
        if (this.IIiiIiiiIIiIi == 0) {
            if (this.iiiIiiiiiiiIi[1].ALLATORIxDEMO() == 0L) {
                this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u8bf7\u9009\u62e9\u5bf9\u5e94\u5b69\u5b50\u88c5\u5907\u7c7b\u578b");
                return false;
            }
            IiiiiiiiIIIII = new ArrayList<BigDecimal>();
            IiiiiiiiIIIII.add(IiiiiiiiIIIII3.getRgid());
            IiiiiiiiIIIII4.setType(132);
            IiiiiiiiIIIII4.setGoods(IiiiiiiiIIIII);
            IiiiiiiiIIIII4.setJade(new PartJade(this.iiiIiiiiiiiIi[1].ALLATORIxDEMO(), 0));
        } else if (this.IIiiIiiiIIiIi == 1) {
            IiiiiiiiIIIII = new ArrayList<BigDecimal>();
            IiiiiiiiIIIII.add(IiiiiiiiIIIII3.getRgid());
            IiiiiiiiIIIII4.setType(131);
            IiiiiiiiIIIII4.setGoods(IiiiiiiiIIIII);
        }
        IiiiiiiiIIIII = Agreement.getSendTextAES((String)"suitoperate", (String)iiIiiiiiIIiii.ALLATORIxDEMO().toJson(IiiiiiiiIIIII4));
        this.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII);
        return true;
    }

    public void iiiIiiiiiiIIi(int id) {
        if (id != 61) {
            if (id != 62) return;
            this.iIiIiiiiIIiii();
            return;
        }
        if (this.iIiIiiiiIiIii == null) {
            this.iiiIiiiiiiIIi(true);
            return;
        }
        this.iiiIiiiiiiIIi(!this.iIiIiiiiIiIii.isVisible());
    }

    private /* synthetic */ void iiiIiiiiiiIIi(boolean is) {
        if (this.iIiIiiiiIiIii == null && !is) {
            return;
        }
        if (is) {
            if (this.iIiIiiiiIiIii == null) {
                this.iIiIiiiiIiIii = new IIiIiiiiIiiIi(this);
                this.add((Component)this.iIiIiiiiIiIii, 0);
            }
            this.iIiIiiiiIiIii.setBounds(87, 134, 224, 122);
        }
        this.iIiIiiiiIiIii.setVisible(is);
    }

    public void iIiIiiiiIIiii(int type) {
        if (this.IIiiIiiiIIiIi != type) {
            this.iiIiIiiiiIIIi[0].iIiIiiiiIIiii(type == 0 ? "sc/e/67.png" : "sc/e/68.png");
            this.iiIiIiiiiIIIi[1].iIiIiiiiIIiii(type == 1 ? "sc/e/67.png" : "sc/e/68.png");
        }
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iiiIiiiiiiiIi.length) {
            com.xy.q.IIIiiiiiIiIiI iIIiiiiiIiIiI = this.iiiIiiiiiiiIi[IiiiiiiiIIIII];
            ++IiiiiiiiIIIII;
            iIIiiiiiIiIiI.ALLATORIxDEMO(0, null);
        }
        this.IIiiIiiiIIiIi = type;
        if (this.IIiiIiiiIIiIi == 0) {
            this.IiIiiiiiIIIII.ALLATORIxDEMO(new long[]{138L});
            this.iiIIIiiiiiiiI = new BigDecimal(5000000);
            iiIIiiiiIiiII.ALLATORIxDEMO((JLabel)this.IIIIiiiiiiiII, (long)this.iiIIIiiiiiiiI.longValue());
            this.ALLATORIxDEMO.setBounds(107, 149, 64, 19);
            this.IIIIiiiiiiiII.setVisible(true);
            this.IiiiiiiiIIIII.setVisible(true);
            this.IiIIIiiiiIiiI[0].setVisible(true);
            this.IiIIIiiiiIiiI[1].setVisible(true);
            this.iiiiIiiiIiiII[0].setVisible(true);
            this.iiiiIiiiIiiII[1].setText("\u6253\u9020");
            this.iiiIiiiiiiiIi[1].ALLATORIxDEMO(16, (Object)650);
        } else if (this.IIiiIiiiIIiIi == 1) {
            this.IiIiiiiiIIIII.ALLATORIxDEMO(new long[]{139L});
            this.ALLATORIxDEMO.setForeground(Color.white);
            this.iiIIIiiiiiiiI = null;
            this.ALLATORIxDEMO.setBounds(223, 149, 64, 19);
            this.IIIIiiiiiiiII.setVisible(false);
            this.IiiiiiiiIIIII.setVisible(false);
            this.IiIIIiiiiIiiI[0].setVisible(false);
            this.IiIIIiiiiIiiI[1].setVisible(false);
            this.iiiiIiiiIiiII[0].setVisible(false);
            this.iiiiIiiiIiiII[1].setText("\u5206\u89e3");
        }
        this.iiiIiiiiiiIIi(false);
        this.IiIiiiiiIIIII.ALLATORIxDEMO().iIiIiiiiIIiIi(0);
    }

    public IiiiiiiiiIIII(GameView gameView) {
        super(164, 2, IiiiIiiiiIiIi.iIIIIiiiiiIIi, gameView);
        this.ALLATORIxDEMO(-1, 0, 382, 413, IiiiIiiiiIiIi.iiIIIiiiiiiiI);
        this.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/1.png", (int)68, (int)68, (int)68, (int)68, (boolean)false), "\u6253\u9020\u5206\u89e3");
        this.iiiiIiiiIiiII = new iiIiIiiiiIiii[2];
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iiiiIiiiIiiII.length) {
            this.iiiiIiiiIiiII[IiiiiiiiIIIII] = new iiIiIiiiiIiii(IiiiiiiiIIIII == 0 ? "sc/e/28.png" : "sc/e/7.png", 1, 61 + IiiiiiiiIIIII, IiiiiiiiIIIII == 0 ? iiIIiiiiIiiII.iiIiiiiiiIIiI : iiIIiiiiIiiII.iiiiIiiiIiiII, null, IiiiiiiiIIIII == 0 ? "\u9009\u62e9\u90e8\u4f4d" : (IiiiiiiiIIIII == 1 ? "\u6253\u9020" : ""), (IiiiIiiiiIiIi)this);
            if (IiiiiiiiIIIII == 0) {
                this.iiiiIiiiIiiII[IiiiiiiiIIIII].setBounds(225, 150, 60, 18);
            } else if (IiiiiiiiIIIII == 1) {
                this.iiiiIiiiIiiII[IiiiiiiiIIIII].setBounds(172, 237, 59, 25);
                this.iiiiIiiiIiiII[IiiiiiiiIIIII].setForeground(Color.black);
            }
            this.add((Component)this.iiiiIiiiIiiII[IiiiiiiiIIIII++]);
        }
        this.IIIIiiiiiiiII = IiIIIiiiiIIiI.ALLATORIxDEMO((int)170, (int)180, (int)124, (int)19, (int)10, (Color)Color.white, (Font)iiIIiiiiIiiII.iIIIiiiiIIIii);
        this.ALLATORIxDEMO = IiIIIiiiiIIiI.ALLATORIxDEMO((int)107, (int)149, (int)64, (int)19, (int)0, (Color)Color.white, (Font)iiIIiiiiIiiII.iIIIiiiiIIIii);
        this.iiIiiiiiiiIii = new MoneyType();
        this.iiIiiiiiiiIii.setIdAndKey(1, "\u91d1 \u94b1");
        this.IiiiiiiiIIIII = IiIIIiiiiIIiI.ALLATORIxDEMO((int)170, (int)203, (int)124, (int)19, (int)10, (Color)Color.white, (Font)iiIIiiiiIiiII.iIIIiiiiIIIii, (MoneyType)this.iiIiiiiiiiIii, (GameView)gameView);
        this.IIIIiiiiiiiII.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/17.png", (int)6, (int)6, (int)6, (int)6, (boolean)false));
        this.ALLATORIxDEMO.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/17.png", (int)6, (int)6, (int)6, (int)6, (boolean)false));
        this.IiiiiiiiIIIII.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/17.png", (int)6, (int)6, (int)6, (int)6, (boolean)false));
        this.add((Component)this.IIIIiiiiiiiII);
        this.add((Component)this.IiiiiiiiIIIII);
        this.add((Component)this.ALLATORIxDEMO);
        this.IiIIIiiiiIiiI = new JLabel[4];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IiIIIiiiiIiiI.length) {
            this.IiIIIiiiiIiiI[IiiiiiiiIIIII] = IiIIIiiiiIIiI.ALLATORIxDEMO((int)104, (int)(180 + 23 * IiiiiiiiIIIII), (int)60, (int)19, (int)10, (Color)iiIIiiiiIiiII.ALLATORIxDEMO((String)"#cFFFFFF"), (Font)iiIIiiiiIiiII.iIIiiiiiiIIII);
            this.IiIIIiiiiIiiI[IiiiiiiiIIIII].setText(IiiiiiiiIIIII == 0 ? "\u6d88\u8017\u91d1\u94b1" : (IiiiiiiiIIIII == 1 ? "\u62e5\u6709\u91d1\u94b1" : (IiiiiiiiIIIII == 2 ? "\u88c5\u5907\u6253\u9020" : (IiiiiiiiIIIII == 3 ? "\u88c5\u5907\u5206\u89e3" : ""))));
            if (IiiiiiiiIIIII >= 2 && IiiiiiiiIIIII <= 3) {
                this.IiIIIiiiiIiiI[IiiiiiiiIIIII].setBounds(132 + 101 * (IiiiiiiiIIIII - 2), 49, 60, 18);
            }
            this.add(this.IiIIIiiiiIiiI[IiiiiiiiIIIII++]);
        }
        this.iiiIiiiiiiiIi = new com.xy.q.IIIiiiiiIiIiI[2];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iiiIiiiiiiiIi.length) {
            this.iiiIiiiiiiiIi[IiiiiiiiIIIII] = new com.xy.q.IIIiiiiiIiIiI((IiiiIiiiiIiIi)this);
            this.iiiIiiiiiiiIi[IiiiiiiiIIIII].ALLATORIxDEMO("sc/d/4.png");
            this.iiiIiiiiiiiIi[IiiiiiiiIIIII].ALLATORIxDEMO(com.xy.q.IIIiiiiiIiIiI.iiIiIiiiiIIII);
            this.iiiIiiiiiiiIi[IiiiiiiiIIIII].setBounds(109 + IiiiiiiiIIIII * 116, 90, 59, 57);
            this.add((Component)this.iiiIiiiiiiiIi[IiiiiiiiIIIII++]);
        }
        this.iiIiIiiiiIIIi = new IIIiiiiiIiIiI[5];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iiIiIiiiiIIIi.length) {
            this.iiIiIiiiiIIIi[IiiiiiiiIIIII] = new IIIiiiiiIiIiI();
            if (IiiiiiiiIIIII == 0) {
                this.iiIiIiiiiIIIi[IiiiiiiiIIIII].setBounds(111 + IiiiiiiiIIIII * 101, 49, 18, 18);
                this.iiIiIiiiiIIIi[IiiiiiiiIIIII].addMouseListener((MouseListener)new IIiIiiiiIIiii(this));
            } else if (IiiiiiiiIIIII == 1) {
                this.iiIiIiiiiIIIi[IiiiiiiiIIIII].setBounds(111 + IiiiiiiiIIIII * 101, 49, 18, 18);
                this.iiIiIiiiiIIIi[IiiiiiiiIIIII].addMouseListener((MouseListener)new IIiiIiiiIiiiI(this));
            } else if (IiiiiiiiIIIII == 2) {
                this.iiIiIiiiiIIIi[IiiiiiiiIIIII].iIiIiiiiIIiii("sc/d/73.png");
                this.iiIiIiiiiIIIi[IiiiiiiiIIIII].setBounds(180, 99, 34, 38);
            } else if (IiiiiiiiIIIII == 3) {
                this.iiIiIiiiiIIIi[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/19.png", (int)5, (int)5, (int)5, (int)5, (boolean)false));
                this.iiIiIiiiiIIIi[IiiiiiiiIIIII].setBounds(47, 272, 311, 105);
            } else if (IiiiiiiiIIIII == 4) {
                this.iiIiIiiiiIIIi[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/49.png", (int)5, (int)5, (int)5, (int)5, (boolean)false));
                this.iiIiIiiiiIIIi[IiiiiiiiIIIII].setBounds(46, 32, 311, 240);
            }
            this.add((Component)this.iiIiIiiiiIIIi[IiiiiiiiIIIII++]);
        }
        com.xy.i.IIiiIiiiIiiiI[] IiiiiiiiIIIII2 = new com.xy.i.IIiiIiiiIiiiI[2];
        int IiiiiiiiIIIII3 = 0;
        while (IiiiiiiiIIIII3 < IiiiiiiiIIIII2.length) {
            IiiiiiiiIIIII2[IiiiiiiiIIIII3] = new com.xy.i.IIiiIiiiIiiiI(IiiiiiiiIIIII3 == 0 ? "sc/e/42.png" : "sc/e/43.png", 1, IiiiiiiiIIIII3, (IiiiIiiiiIiIi)this);
            if (IiiiiiiiIIIII3 == 0) {
                IiiiiiiiIIIII2[IiiiiiiiIIIII3].setBounds(316, 378, 18, 18);
            } else {
                IiiiiiiiIIIII2[IiiiiiiiIIIII3].setBounds(338, 378, 18, 18);
            }
            this.add((Component)IiiiiiiiIIIII2[IiiiiiiiIIIII3++]);
        }
        this.IiIiiiiiIIIII = new IIIiIiiiiIIiI((IiiiIiiiiIiIi)this, 6, 2, 51, 51, 0, 0, 48, 273);
        this.IiIiiiiiIIIII.ALLATORIxDEMO(IIIIIiiiIiiII.iiiIiiiiiiIIi((String)"sc/d/18.png"));
        this.IiIiiiiiIIIII.ALLATORIxDEMO(IiiiiiiiIIIII2, 1);
        this.add((Component)this.IiIiiiiiIIIII);
    }

    static /* synthetic */ void ALLATORIxDEMO(IiiiiiiiiIIII arg0, boolean arg1) {
        arg0.iiiIiiiiiiIIi(arg1);
    }

    public void ALLATORIxDEMO(Goodstable good) {
        Goodstable IiiiiiiiIIIII;
        if (this.IIiiIiiiIIiIi == 0) {
            this.iiiIiiiiiiiIi[0].ALLATORIxDEMO(good != null ? 1 : 0, (Object)good);
            if (good == null) {
                this.ALLATORIxDEMO.setText("");
                return;
            }
            this.ALLATORIxDEMO.setText("50/" + good.getUsetime());
            this.ALLATORIxDEMO.setForeground(good.getUsetime() < 50 ? Color.red : Color.white);
            return;
        }
        if (this.IIiiIiiiIIiIi != 1) return;
        this.iiiIiiiiiiiIi[0].ALLATORIxDEMO(good != null ? 1 : 0, (Object)good);
        Goodstable goodstable = IiiiiiiiIIIII = good != null ? this.ALLATORIxDEMO().ALLATORIxDEMO(new BigDecimal(668)) : null;
        if (IiiiiiiiIIIII == null) {
            this.iiiIiiiiiiiIi[1].ALLATORIxDEMO(0, null);
            this.ALLATORIxDEMO.setText("");
            return;
        }
        int IiiiiiiiIIIII2 = IIiiIiiiiIIiI.ALLATORIxDEMO((String)good.getValue(), (String)"\u7b49\u7ea7=", (String)"|");
        this.iiiIiiiiiiiIi[1].ALLATORIxDEMO(1, (Object)IiiiiiiiIIIII);
        this.ALLATORIxDEMO.setText(String.valueOf(IiiiiiiiIIIII2 == 3 ? 30 : (IiiiiiiiIIIII2 == 2 ? 5 : 2)));
    }

    static /* synthetic */ com.xy.q.IIIiiiiiIiIiI[] ALLATORIxDEMO(IiiiiiiiiIIII arg0) {
        return arg0.iiiIiiiiiiiIi;
    }

    static /* synthetic */ int ALLATORIxDEMO(IiiiiiiiiIIII arg0) {
        return arg0.IIiiIiiiIIiIi;
    }

    public void iIiIiiiiIIiii() {
        this.IiiiiiiiIIIII.iIiIiiiiIIiii();
        this.iIiIiiiiIIiii(0);
        super.iIiIiiiiIIiii();
    }
}
