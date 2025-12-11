/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.a.IIIiiiiiIiIiI
 *  com.xy.a.a.IiiiIiiiiIiIi
 *  com.xy.a.a.iiiiiiiiiiIiI
 *  com.xy.a.iIIiiiiiIIIIi
 *  com.xy.bean.ConfirmBean
 *  com.xy.bean.SuitOperBean
 *  com.xy.formula.MsgUntil
 *  com.xy.game.RoleData
 *  com.xy.i.IIiIiiiiIiiIi
 *  com.xy.i.IiIiIiiiiIIiI
 *  com.xy.q.IIIiIiiiiIIiI
 *  com.xy.q.IIiIiiiiIIiii
 *  com.xy.q.IiIIIiiiiIIiI
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.q.iIIiIiiiIiiIi
 *  com.xy.q.iIiIIiiiIIIiI
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.q.iiIiIiiiiIiIi
 *  com.xy.readbean.Goodstable
 *  com.xy.readbean.MoneyType
 *  com.xy.richtext.RichLabel
 *  com.xy.socket.Agreement
 *  com.xy.socket.GameClient
 *  com.xy.socket.ParamTool
 *  com.xy.text.GameView
 *  com.xy.v.IIiiIiiiiIIiI
 *  com.xy.v.iiIiiiiiIIiii
 *  com.xy.v.iiiiiiiiIIIII
 *  com.xy.w.IIIIIiiiIiiII
 *  com.xy.w.IIIiiiiiIiIiI
 *  com.xy.w.IIiIiiiiIiiIi
 */
package com.xy.a.a;

import com.xy.a.a.IIIiiiiiIiIiI;
import com.xy.a.a.IiiiIiiiiIiIi;
import com.xy.a.a.iiiiiiiiiiIiI;
import com.xy.a.iIIiiiiiIIIIi;
import com.xy.bean.ConfirmBean;
import com.xy.bean.SuitOperBean;
import com.xy.formula.MsgUntil;
import com.xy.game.RoleData;
import com.xy.i.IIiIiiiiIiiIi;
import com.xy.i.IiIiIiiiiIIiI;
import com.xy.q.IIIiIiiiiIIiI;
import com.xy.q.IIiIiiiiIIiii;
import com.xy.q.IiIIIiiiiIIiI;
import com.xy.q.iIIiIiiiIiiIi;
import com.xy.q.iIiIIiiiIIIiI;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.q.iiIiIiiiiIiIi;
import com.xy.readbean.Goodstable;
import com.xy.readbean.MoneyType;
import com.xy.richtext.RichLabel;
import com.xy.socket.Agreement;
import com.xy.socket.GameClient;
import com.xy.socket.ParamTool;
import com.xy.text.GameView;
import com.xy.v.IIiiIiiiiIIiI;
import com.xy.v.iiIiiiiiIIiii;
import com.xy.v.iiiiiiiiIIIII;
import com.xy.w.IIIIIiiiIiiII;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseListener;
import java.math.BigDecimal;
import java.util.ArrayList;
import javax.swing.JLabel;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class StarcardJpanel1
extends com.xy.q.IiiiIiiiiIiIi {
    private int iiIIiiiiIiIIi = -1;
    private iIIiIiiiIiiIi[] IiIIiiiiIIIII;
    private IIiIiiiiIiiIi[] iIIIIiiiiiIIi;
    private iiIiIiiiiIiIi IiiIIiiiiiiiI;
    private IiIiIiiiiIIiI[] IIiiiiiiIiiII;
    private JLabel IiiiIiiiIiIII;
    private JLabel[] IIiiiiiiiIIIi;
    private int IIIiiiiiIIiII;
    private BigDecimal iiIiiiiiiIIiI;
    private RichLabel[] iIiiIiiiIiIIi;
    private IiIiIiiiiIIiI[] iiiiIiiiIIiii;
    private com.xy.w.IIIiiiiiIiIiI[] iIIiIiiiiiiIi;
    private JLabel[] IIIIiiiiiiiII;
    private com.xy.w.IIIiiiiiIiIiI[] iiIIIiiiiiiiI;
    private IIIiIiiiiIIiI IiIiiiiiIIIII;
    private iiIiIiiiiIiIi iiIiIiiiiIIIi;
    private MoneyType iiiiIiiiIiiII;
    private iIIiIiiiIiiIi iiiIiiiiiiiIi;
    private com.xy.w.IIIiiiiiIiIiI[] iIiiIiiiiiiII;
    private int IIiiIiiiIIiIi;
    private MoneyType iIiIiiiiIiIii;
    private IIiIiiiiIIiii IiIIIiiiiIiiI;
    private IiIiIiiiiIIiI[] iiIiiiiiiiIii;
    private iIiIIiiiIIIiI[] IiiiiiiiIIIII;
    private IiIiIiiiiIIiI ALLATORIxDEMO;

    public int IiiIiiiiiiIiI() {
        return this.IIiiIiiiIIiIi;
    }

    public void IiiIiiiiiiIiI(int type) {
        if (this.IIiiIiiiIIiIi != 1) {
            return;
        }
        this.IIIiiiiiIIiII = type;
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iIIIIiiiiiIIi.length) {
            this.iIIIIiiiiiIIi[IiiiiiiiIIIII].ALLATORIxDEMO(IiiiiiiiIIIII == this.IIIiiiiiIIiII);
            ++IiiiiiiiIIIII;
        }
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IiiiiiiiIIIII.length) {
            iIiIIiiiIIIiI iIiIIiiiIIIiI2 = this.IiiiiiiiIIIII[IiiiiiiiIIIII];
            ++IiiiiiiiIIIII;
            iIiIIiiiIIIiI2.ALLATORIxDEMO(0, null);
        }
        this.iIIiIiiiiiiIi[1].setVisible(false);
        this.iIIiIiiiiiiIi[2].setVisible(false);
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IIiiiiiiiIIIi.length) {
            this.IIiiiiiiiIIIi[IiiiiiiiIIIII++].setVisible(false);
        }
        this.IiiIIiiiiiiiI.setVisible(false);
        if (this.IIIiiiiiIIiII == 0) {
            this.IiIiiiiiIIIII.ALLATORIxDEMO(new long[]{522L});
            this.ALLATORIxDEMO.setText("培养");
            this.IiiiiiiiIIIII[1].ALLATORIxDEMO("观星册");
            this.IIiiiiiiiIIIi[0].setText("消耗金钱");
            this.IIiiiiiiiIIIi[1].setText("当前神力");
            this.IiiIIiiiiiiiI.ALLATORIxDEMO(null);
            this.IiiIIiiiiiiiI.setText(null);
            iiIIiiiiIiiII.ALLATORIxDEMO((JLabel)this.iiiIiiiiiiiIi, (long)(this.ALLATORIxDEMO().ALLATORIxDEMO(2, 12) ? 100000L : 1000000L));
            this.iiiIiiiiiiiIi.setBounds(200, 162, 114, 19);
            this.IiiIIiiiiiiiI.setBounds(200, 188, 114, 19);
            this.IIiiiiiiiIIIi[0].setVisible(true);
            this.IIiiiiiiiIIIi[1].setVisible(true);
            this.IiiIIiiiiiiiI.setVisible(true);
        } else if (this.IIIiiiiiIIiII == 1) {
            this.IiIiiiiiIIIII.ALLATORIxDEMO(new long[]{500L});
            this.ALLATORIxDEMO.setText("升级");
            this.IiiiiiiiIIIII[1].ALLATORIxDEMO("矿石");
            this.IIiiiiiiiIIIi[0].setText("消耗金钱");
            this.IIiiiiiiiIIIi[1].setText("当前金钱");
            this.IiiIIiiiiiiiI.ALLATORIxDEMO(this.iiiiIiiiIiiII);
            this.iiiIiiiiiiiIi.setBounds(200, 162, 114, 19);
            this.IiiIIiiiiiiiI.setBounds(200, 188, 114, 19);
            this.IIiiiiiiiIIIi[0].setVisible(true);
            this.IIiiiiiiiIIIi[1].setVisible(true);
            this.IiiIIiiiiiiiI.setVisible(true);
        } else if (this.IIIiiiiiIIiII == 2) {
            this.iIiIiiiiIIiii(0);
        } else if (this.IIIiiiiiIIiII == 3) {
            this.IiIiiiiiIIIII.ALLATORIxDEMO(new long[]{521L});
            this.ALLATORIxDEMO.setText("炼星");
            this.IiiiiiiiIIIII[1].ALLATORIxDEMO("炼星石");
            this.iiiIiiiiiiiIi.setText(null);
            this.iiiIiiiiiiiIi.setBounds(241, 149, 54, 19);
            this.IIiiiiiiiIIIi[2].setFont(iiIIiiiiIiiII.iIIiiiiiiIIII);
            this.IIiiiiiiiIIIi[3].setFont(iiIIiiiiIiiII.iIIiiiiiiIIII);
            this.IIiiiiiiiIIIi[2].setBounds(101, 178, 250, 14);
            this.IIiiiiiiiIIIi[3].setBounds(101, 194, 250, 14);
            this.IIiiiiiiiIIIi[2].setText("注：有一定几率地煞星符最高等级+1；");
            this.IIiiiiiiiIIIi[3].setText("非100%成功，若失败不影响地煞星符。");
            this.IIiiiiiiiIIIi[2].setVisible(true);
            this.IIiiiiiiiIIIi[3].setVisible(true);
        }
        this.iiiIiiiiiiIIi();
        this.IiiIIiiiiiiiI.iIiIiiiiIIiii();
    }

    public void iIiIiiiiIIiIi(boolean type) {
        int IiiiiiiiIIIII;
        if (!type) {
            IiiiiiiiIIIII = 0;
            while (IiiiiiiiIIIII < this.IiiiiiiiIIIII.length) {
                iIiIIiiiIIIiI iIiIIiiiIIIiI2 = this.IiiiiiiiIIIII[IiiiiiiiIIIII];
                ++IiiiiiiiIIIII;
                iIiIIiiiIIIiI2.ALLATORIxDEMO(0, null);
            }
        }
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iIIIIiiiiiIIi.length) {
            this.iIIIIiiiiiIIi[IiiiiiiiIIIII++].setVisible(type);
        }
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iIIiIiiiiiiIi.length) {
            this.iIIiIiiiiiiIi[IiiiiiiiIIIII++].setVisible(type);
        }
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IiiiiiiiIIIII.length) {
            this.IiiiiiiiIIIII[IiiiiiiiIIIII++].setVisible(type);
        }
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IIiiiiiiiIIIi.length) {
            this.IIiiiiiiiIIIi[IiiiiiiiIIIII++].setVisible(type);
        }
        this.iiiIiiiiiiiIi.setVisible(type);
        this.IiiIIiiiiiiiI.setVisible(type);
        this.IiIiiiiiIIIII.setVisible(type);
        this.ALLATORIxDEMO.setVisible(type);
    }

    static /* synthetic */ int ALLATORIxDEMO(iIiIIiiiIiiiI arg0) {
        return arg0.iiIIiiiiIiIIi;
    }

    public int iIiIiiiiIIiIi() {
        return this.iiIIiiiiIiIIi;
    }

    public void iIiIiiiiIIiIi(int type) {
        this.IIiiIiiiIIiIi = type;
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iiIiiiiiiiIii.length) {
            this.iiIiiiiiiiIii[IiiiiiiiIIIII].setKeep(IiiiiiiiIIIII == this.IIiiIiiiIIiIi);
            ++IiiiiiiiIIIII;
        }
        this.iiiIiiiiiiIIi(this.IIiiIiiiIIiIi == 0);
        this.iIiIiiiiIIiIi(this.IIiiIiiiIIiIi == 1);
        if (this.IIiiIiiiIIiIi == 0) {
            this.ALLATORIxDEMO(null);
            return;
        }
        if (this.IIiiIiiiIIiIi != 1) return;
        this.IiiIiiiiiiIiI(0);
    }

    public String ALLATORIxDEMO(String value, String interval) {
        String[] IiiiiiiiIIIII = value.split("=");
        return String.valueOf(IiiiiiiiIIIII[0]) + interval + IiiiiiiiIIIII[1];
    }

    public void iiiIiiiiiiIIi(Goodstable good) {
        if (this.IIiiIiiiIIiIi == 0) {
            if (!IIiiIiiiiIIiI.ALLATORIxDEMO((BigDecimal)this.iiIiiiiiiIIiI, (BigDecimal)good.getRgid())) {
                return;
            }
            this.iIiIiiiiIIiii(null);
            return;
        }
        if (this.IIiiIiiiIIiIi != 1) return;
        Goodstable IiiiiiiiIIIII = (Goodstable)this.IiiiiiiiIIIII[0].ALLATORIxDEMO().ALLATORIxDEMO();
        if (IIiiIiiiiIIiI.ALLATORIxDEMO((BigDecimal)(IiiiiiiiIIIII != null ? IiiiiiiiIIIII.getRgid() : null), (BigDecimal)good.getRgid())) {
            this.IiiiiiiiIIIII[0].ALLATORIxDEMO(0, null);
            this.iiiIiiiiiiIIi();
            return;
        }
        Goodstable IiiiiiiiIIIII2 = (Goodstable)this.IiiiiiiiIIIII[1].ALLATORIxDEMO().ALLATORIxDEMO();
        if (!IIiiIiiiiIIiI.ALLATORIxDEMO((BigDecimal)(IiiiiiiiIIIII2 != null ? IiiiiiiiIIIII2.getRgid() : null), (BigDecimal)good.getRgid())) return;
        this.IiiiiiiiIIIII[1].ALLATORIxDEMO(0, null);
        this.iiiIiiiiiiIIi();
    }

    public void iIiIiiiiIIiIi() {
        if (this.iiIiiiiiiIIiI == null) return;
        Goodstable IiiiiiiiIIIII = this.ALLATORIxDEMO().getGood(this.iiIiiiiiiIIiI);
        if (IiiiiiiiIIIII == null) {
            this.iIiIiiiiIIiii(null);
            return;
        }
        if (IiiiiiiiIIIII.getRgid() == this.iiIiiiiiiIIiI) return;
        this.iIiIiiiiIIiii(IiiiiiiiIIIII);
    }

    /*
     * WARNING - void declaration
     */
    public StarcardJpanel1(GameView gameView) {
        super(95, 2, com.xy.q.IiiiIiiiiIiIi.iIIIIiiiiiIIi, (GameView)gameView2);
        void gameView2;
        this.ALLATORIxDEMO(-1, 0, 637, 443, com.xy.q.IiiiIiiiiIiIi.iiIIIiiiiiiiI);
        this.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/1.png", (int)68, (int)68, (int)68, (int)68, (boolean)false), "地煞星");
        iiiiiiiiIIIII IiiiiiiiIIIII = new iiiiiiiiIIIII(6, 21, 0, 18);
        this.iIIIIiiiiiIIi = new IIiIiiiiIiiIi[4];
        int IiiiiiiiIIIII2 = 0;
        while (IiiiiiiiIIIII2 < this.iIIIIiiiiiIIi.length) {
            String[] stringArray;
            if (IiiiiiiiIIIII2 == 0) {
                String[] stringArray2 = new String[2];
                stringArray2[0] = "培";
                stringArray = stringArray2;
                stringArray2[1] = "养";
            } else if (IiiiiiiiIIIII2 == 1) {
                String[] stringArray3 = new String[2];
                stringArray3[0] = "升";
                stringArray = stringArray3;
                stringArray3[1] = "级";
            } else if (IiiiiiiiIIIII2 == 2) {
                String[] stringArray4 = new String[2];
                stringArray4[0] = "重";
                stringArray = stringArray4;
                stringArray4[1] = "洗";
            } else if (IiiiiiiiIIIII2 == 3) {
                String[] stringArray5 = new String[2];
                stringArray5[0] = "炼";
                stringArray = stringArray5;
                stringArray5[1] = "星";
            } else {
                stringArray = null;
            }
            String[] IiiiiiiiIIIII3 = stringArray;
            this.iIIIIiiiiiIIi[IiiiiiiiIIIII2] = new IIiIiiiiIiiIi("sc/e/71.png", 2, 3 + IiiiiiiiIIIII2, iiIIiiiiIiiII.IIiiIiiiIIiIi, null, IiiiiiiiIIIII3, (com.xy.q.IiiiIiiiiIiIi)this);
            this.iIIIIiiiiiIIi[IiiiiiiiIIIII2].ALLATORIxDEMO(IiiiiiiiIIIII);
            this.iIIIIiiiiiIIi[IiiiiiiiIIIII2].ALLATORIxDEMO(iiIIiiiiIiiII.IIiiiiiiiIIII);
            this.iIIIIiiiiiIIi[IiiiiiiiIIIII2].setBounds(60, 57 + 49 * IiiiiiiiIIIII2, 30, 48);
            this.add((Component)this.iIIIIiiiiiIIi[IiiiiiiiIIIII2++]);
        }
        this.iiiiIiiiIiiII = new MoneyType();
        this.iiiiIiiiIiiII.setIdAndKey(1, "金钱");
        this.IIiiiiiiiIIIi = new JLabel[4];
        IiiiiiiiIIIII2 = 0;
        while (IiiiiiiiIIIII2 < this.IIiiiiiiiIIIi.length) {
            this.IIiiiiiiiIIIi[IiiiiiiiIIIII2] = IiIIIiiiiIIiI.ALLATORIxDEMO((int)123, (int)(162 + 26 * IiiiiiiiIIIII2), (int)72, (int)19, (int)0, (Color)iiIIiiiiIiiII.ALLATORIxDEMO((String)"#c000000"), (Font)iiIIiiiiIiiII.iiiiIiiiIiiII);
            this.add(this.IIiiiiiiiIIIi[IiiiiiiiIIIII2++]);
        }
        this.iiiIiiiiiiiIi = IiIIIiiiiIIiI.ALLATORIxDEMO((int)0, (int)0, (int)0, (int)0, (int)10, (Color)Color.white, (Font)iiIIiiiiIiiII.iIIIiiiiIIIii);
        this.IiiIIiiiiiiiI = IiIIIiiiiIIiI.ALLATORIxDEMO((int)0, (int)0, (int)0, (int)0, (int)10, (Color)Color.white, (Font)iiIIiiiiIiiII.iIIIiiiiIIIii, null, (GameView)gameView2);
        this.IiiIIiiiiiiiI.ALLATORIxDEMO(2);
        this.iiiIiiiiiiiIi.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/17.png", (int)6, (int)6, (int)6, (int)6, (boolean)false));
        this.IiiIIiiiiiiiI.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/17.png", (int)6, (int)6, (int)6, (int)6, (boolean)false));
        this.add((Component)this.IiiIIiiiiiiiI);
        this.add((Component)this.iiiIiiiiiiiIi);
        this.IiiiiiiiIIIII = new iIiIIiiiIIIiI[2];
        IiiiiiiiIIIII2 = 0;
        while (IiiiiiiiIIIII2 < this.IiiiiiiiIIIII.length) {
            this.IiiiiiiiIIIII[IiiiiiiiIIIII2] = new iIiIIiiiIIIiI((com.xy.q.IiiiIiiiiIiIi)this, false);
            this.IiiiiiiiIIIII[IiiiiiiiIIIII2].setBounds(151 + IiiiiiiiIIIII2 * 87, 90, 59, 58);
            this.add((Component)this.IiiiiiiiIIIII[IiiiiiiiIIIII2++]);
        }
        this.IiiiiiiiIIIII[0].ALLATORIxDEMO("地煞星");
        this.ALLATORIxDEMO = new IiIiIiiiiIIiI("sc/e/7.png", 1, 115, iiIIiiiiIiiII.iiiiIiiiIiiII, iiIIiiiiIiiII.IIiiiiiiIiiII, "培养", (com.xy.q.IiiiIiiiiIiIi)this);
        this.ALLATORIxDEMO.setBounds(197, 218, 59, 25);
        this.add((Component)this.ALLATORIxDEMO);
        this.iIIiIiiiiiiIi = new com.xy.w.IIIiiiiiIiIiI[4];
        IiiiiiiiIIIII2 = 0;
        while (IiiiiiiiIIIII2 < this.iIIiIiiiiiiIi.length) {
            this.iIIiIiiiiiiIi[IiiiiiiiIIIII2] = new com.xy.w.IIIiiiiiIiIiI();
            if (IiiiiiiiIIIII2 == 0) {
                this.iIIiIiiiiiiIi[IiiiiiiiIIIII2].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/19.png", (int)5, (int)5, (int)5, (int)5, (boolean)false));
                this.iIIiIiiiiiiIi[IiiiiiiiIIIII2].setBounds(64, 282, 309, 105);
            } else if (IiiiiiiiIIIII2 == 1) {
                this.iIIiIiiiiiiIi[IiiiiiiiIIIII2].setBounds(129 + (IiiiiiiiIIIII2 - 1) * 107, 64, 18, 18);
                this.iIIiIiiiiiiIi[IiiiiiiiIIIII2].addMouseListener((MouseListener)new IIIiiiiiIiIiI(this));
            } else if (IiiiiiiiIIIII2 == 2) {
                this.iIIiIiiiiiiIi[IiiiiiiiIIIII2].setBounds(129 + (IiiiiiiiIIIII2 - 1) * 107, 64, 18, 18);
                this.iIIiIiiiiiiIi[IiiiiiiiIIIII2].addMouseListener((MouseListener)new IiiiIiiiiIiIi(this));
            } else if (IiiiiiiiIIIII2 == 3) {
                this.iIIiIiiiiiiIi[IiiiiiiiIIIII2].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/33.png", (int)30, (int)30, (int)30, (int)30, (boolean)false));
                this.iIIiIiiiiiiIi[IiiiiiiiIIIII2].setBounds(87, 58, 287, 196);
            }
            this.add((Component)this.iIIiIiiiiiiIi[IiiiiiiiIIIII2++]);
        }
        this.IiIiiiiiIIIII = new IIIiIiiiiIIiI((com.xy.q.IiiiIiiiiIiIi)this, 6, 2, 51, 51, 0, 0, 65, 284);
        this.IiIiiiiiIIIII.ALLATORIxDEMO(IIIIIiiiIiiII.iiiIiiiiiiIIi((String)"sc/d/18.png"));
        this.IiIiiiiiIIIII.ALLATORIxDEMO(new long[]{-1L});
        this.add((Component)this.IiIiiiiiIIIII);
        this.iiiiIiiiIIiii = new IiIiIiiiiIIiI[6];
        IiiiiiiiIIIII2 = 0;
        while (IiiiiiiiIIIII2 < this.iiiiIiiiIIiii.length) {
            this.iiiiIiiiIIiii[IiiiiiiiIIIII2] = new IiIiIiiiiIIiI("sc/e/6.png", 1, 109 + IiiiiiiiIIIII2, iiIIiiiiIiiII.iiIiiiiiiIIiI, null, IiiiiiiiIIIII2 == 2 ? "\u8865\u5145" : (IiiiiiiiIIIII2 == 3 ? "\u5220\u9664" : (IiiiiiiiIIIII2 == 4 ? "\u8f6c\u79fb" : (IiiiiiiiIIIII2 == 5 ? "\u53c2\u6218" : ""))), (com.xy.q.IiiiIiiiiIiIi)this);
            this.iiiiIiiiIIiii[IiiiiiiiIIIII2].setBounds(170, 330, 34, 18);
            if (IiiiiiiiIIIII2 == 0) {
                this.iiiiIiiiIIiii[IiiiiiiiIIIII2].setImage("sc/e/1.png");
                this.iiiiIiiiIIiii[IiiiiiiiIIIII2].setBounds(111, 278, 18, 18);
            } else if (IiiiiiiiIIIII2 == 1) {
                this.iiiiIiiiIIiii[IiiiiiiiIIIII2].setImage("sc/e/2.png");
                this.iiiiIiiiIIiii[IiiiiiiiIIIII2].setBounds(134, 278, 18, 18);
            } else if (IiiiiiiiIIIII2 == 3 || IiiiiiiiIIIII2 == 4) {
                this.iiiiIiiiIIiii[IiiiiiiiIIIII2].setBounds(300, 339 + 21 * (IiiiiiiiIIIII2 - 3), 34, 18);
            } else if (IiiiiiiiIIIII2 == 5) {
                this.iiiiIiiiIIiii[IiiiiiiiIIIII2].setForeground(Color.black);
                this.iiiiIiiiIIiii[IiiiiiiiIIIII2].setFont(iiIIiiiiIiiII.iiiiIiiiIiiII);
                this.iiiiIiiiIIiii[IiiiiiiiIIIII2].setImage("sc/e/7.png");
                this.iiiiIiiiIIiii[IiiiiiiiIIIII2].setBounds(104, 356, 59, 25);
            }
            this.add((Component)this.iiiiIiiiIIiii[IiiiiiiiIIIII2++]);
        }
        this.IiIIiiiiIIIII = new iIIiIiiiIiiIi[2];
        IiiiiiiiIIIII2 = 0;
        while (IiiiiiiiIIIII2 < this.IiIIiiiiIIIII.length) {
            this.IiIIiiiiIIIII[IiiiiiiiIIIII2] = IiIIIiiiiIIiI.ALLATORIxDEMO((int)95, (int)(304 + 25 * IiiiiiiiIIIII2), (int)109, (int)19, (int)10, (Color)Color.white, (Font)iiIIiiiiIiiII.iIIIiiiiIIIii);
            this.IiIIiiiiIIIII[IiiiiiiiIIIII2].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/17.png", (int)6, (int)6, (int)6, (int)6, (boolean)false));
            this.add((Component)this.IiIIiiiiIIIII[IiiiiiiiIIIII2++]);
        }
        this.IIIIiiiiiiiII = new JLabel[5];
        IiiiiiiiIIIII2 = 0;
        while (IiiiiiiiIIIII2 < this.IIIIiiiiiiiII.length) {
            this.IIIIiiiiiiiII[IiiiiiiiIIIII2] = IiIIIiiiiIIiI.ALLATORIxDEMO((int)58, (int)(304 + 25 * IiiiiiiiIIIII2), (int)36, (int)19, (int)0, (Color)iiIIiiiiIiiII.ALLATORIxDEMO((String)"#c000000"), (Font)iiIIiiiiIiiII.iiiiIiiiIiiII);
            this.IIIIiiiiiiiII[IiiiiiiiIIIII2].setText(IiiiiiiiIIIII2 == 0 ? "神力" : (IiiiiiiiIIIII2 == 1 ? "战力" : (IiiiiiiiIIIII2 == 2 ? "学习交流" : (IiiiiiiiIIIII2 == 3 ? "8" : (IiiiiiiiIIIII2 == 4 ? "/18" : "")))));
            this.add(this.IIIIiiiiiiiII[IiiiiiiiIIIII2]);
            if (IiiiiiiiIIIII2 == 2) {
                this.IIIIiiiiiiiII[IiiiiiiiIIIII2].setFont(iiIIiiiiIiiII.IIiiiiiiiIIIi);
                this.IIIIiiiiiiiII[IiiiiiiiIIIII2].setHorizontalAlignment(10);
                this.IIIIiiiiiiiII[IiiiiiiiIIIII2].setBounds(232, 55, 120, 23);
                this.IIIIiiiiiiiII[IiiiiiiiIIIII2].setForeground(iiIIiiiiIiiII.ALLATORIxDEMO((String)"#cFFFFF00"));
            } else if (IiiiiiiiIIIII2 == 3) {
                this.IIIIiiiiiiiII[IiiiiiiiIIIII2].setFont(iiIIiiiiIiiII.IIiIIiiiIiiII);
                this.IIIIiiiiiiiII[IiiiiiiiIIIII2].setBounds(262, 80, 54, 33);
                this.IIIIiiiiiiiII[IiiiiiiiIIIII2].setForeground(iiIIiiiiIiiII.ALLATORIxDEMO((String)"#cFFFFFF"));
            } else if (IiiiiiiiIIIII2 == 4) {
                this.IIIIiiiiiiiII[IiiiiiiiIIIII2].setFont(iiIIiiiiIiiII.iIIiiiiiiIIII);
                this.IIIIiiiiiiiII[IiiiiiiiIIIII2].setHorizontalAlignment(10);
                this.IIIIiiiiiiiII[IiiiiiiiIIIII2].setBounds(316, 96, 54, 13);
                this.IIIIiiiiiiiII[IiiiiiiiIIIII2].setForeground(iiIIiiiiIiiII.ALLATORIxDEMO((String)"#c999999"));
            }
            ++IiiiiiiiIIIII2;
        }
        this.iIiiIiiiIiIIi = new RichLabel[4];
        IiiiiiiiIIIII2 = 0;
        while (IiiiiiiiIIIII2 < this.iIiiIiiiIiIIi.length) {
            this.iIiiIiiiIiIIi[IiiiiiiiIIIII2] = new RichLabel(null, iiIIiiiiIiiII.iIIiiiiiiIIII);
            if (IiiiiiiiIIIII2 == 0) {
                this.iIiiIiiiIiIIi[IiiiiiiiIIIII2].setBounds(216, 91, this.iIiiIiiiIiIIi[IiiiiiiiIIIII2].getWidth(), this.iIiiIiiiIiIIi[IiiiiiiiIIIII2].getHeight());
            } else if (IiiiiiiiIIIII2 == 1) {
                this.iIiiIiiiIiIIi[IiiiiiiiIIIII2].setBounds(216, 126, this.iIiiIiiiIiIIi[IiiiiiiiIIIII2].getWidth(), this.iIiiIiiiIiIIi[IiiiiiiiIIIII2].getHeight());
            } else if (IiiiiiiiIIIII2 == 2) {
                this.iIiiIiiiIiIIi[IiiiiiiiIIIII2].setBounds(216, 192, this.iIiiIiiiIiIIi[IiiiiiiiIIIII2].getWidth(), this.iIiiIiiiIiIIi[IiiiiiiiIIIII2].getHeight());
            } else if (IiiiiiiiIIIII2 == 3) {
                this.iIiiIiiiIiIIi[IiiiiiiiIIIII2].setBounds(216, 311, this.iIiiIiiiIiIIi[IiiiiiiiIIIII2].getWidth(), this.iIiiIiiiIiIIi[IiiiiiiiIIIII2].getHeight());
            }
            this.add((Component)this.iIiiIiiiIiIIi[IiiiiiiiIIIII2++]);
        }
        this.iIiiIiiiIiIIi[0].setTextSize("#cFFFFFF【等级】", 180);
        this.iIiiIiiiiiiII = new com.xy.w.IIIiiiiiIiIiI[9];
        IiiiiiiiIIIII2 = 0;
        while (IiiiiiiiIIIII2 < this.iIiiIiiiiiiII.length) {
            this.iIiiIiiiiiiII[IiiiiiiiIIIII2] = new com.xy.w.IIIiiiiiIiIiI();
            this.add((Component)this.iIiiIiiiiiiII[IiiiiiiiIIIII2]);
            if (IiiiiiiiIIIII2 == 0) {
                this.iIiiIiiiiiiII[IiiiiiiiIIIII2].iIiIiiiiIIiii("sc/d/61.png");
                this.iIiiIiiiiiiII[IiiiiiiiIIIII2].setBounds(51, 51, 160, 221);
            } else if (IiiiiiiiIIIII2 == 1) {
                this.iIiiIiiiiiiII[IiiiiiiiIIIII2].setBounds(51, 53, 160, 220);
            } else if (IiiiiiiiIIIII2 == 2) {
                this.iIiiIiiiiiiII[IiiiiiiiIIIII2].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/33.png", (int)30, (int)30, (int)30, (int)30, (boolean)false));
                this.iIiiIiiiiiiII[IiiiiiiiIIIII2].setBounds(51, 270, 162, 117);
            } else if (IiiiiiiiIIIII2 == 3) {
                this.iIiiIiiiiiiII[IiiiiiiiIIIII2].iIiIiiiiIIiii("sc/d/34.png");
                this.iIiiIiiiiiiII[IiiiiiiiIIIII2].setBounds(212, 55, 143, 23);
            } else if (IiiiiiiiIIIII2 == 4) {
                this.iIiiIiiiiiiII[IiiiiiiiIIIII2].setBounds(253, 340, 39, 39);
            } else if (IiiiiiiiIIIII2 == 5) {
                this.iIiiIiiiiiiII[IiiiiiiiIIIII2].iIiIiiiiIIiii("sc/d/51.png");
                this.iIiiIiiiiiiII[IiiiiiiiIIIII2].setBounds(250, 337, 45, 45);
            } else if (IiiiiiiiIIIII2 >= 6 && IiiiiiiiIIIII2 <= 8) {
                this.iIiiIiiiiiiII[IiiiiiiiIIIII2].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/66.png", (int)30, (int)1, (int)30, (int)1, (boolean)false));
                if (IiiiiiiiIIIII2 == 6) {
                    this.iIiiIiiiiiiII[IiiiiiiiIIIII2].setBounds(212, 118, 185, 2);
                } else if (IiiiiiiiIIIII2 == 7) {
                    this.iIiiIiiiiiiII[IiiiiiiiIIIII2].setBounds(212, 188, 185, 2);
                } else if (IiiiiiiiIIIII2 == 8) {
                    this.iIiiIiiiiiiII[IiiiiiiiIIIII2].setBounds(212, 307, 185, 2);
                }
            }
            ++IiiiiiiiIIIII2;
        }
        this.iiIiiiiiiiIii = new IiIiIiiiiIIiI[2];
        IiiiiiiiIIIII2 = 0;
        while (IiiiiiiiIIIII2 < this.iiIiiiiiiiIii.length) {
            this.iiIiiiiiiiIii[IiiiiiiiIIIII2] = new IiIiIiiiiIIiI("sc/e/39.png", 2, 103 + IiiiiiiiIIIII2, iiIIiiiiIiiII.IIiiIiiiIIiIi, null, IiiiiiiiIIIII2 == 0 ? "属性" : (IiiiiiiiIIIII2 == 1 ? "重铸" : ""), (com.xy.q.IiiiIiiiiIiIi)this);
            this.iiIiiiiiiiIii[IiiiiiiiIIIII2].setOffsetTexts(iiIIiiiiIiiII.IiIIIiiiiiiiI);
            this.iiIiiiiiiiIii[IiiiiiiiIIIII2].setBounds(58 + 65 * IiiiiiiiIIIII2, 20, 63, 24);
            this.add((Component)this.iiIiiiiiiiIii[IiiiiiiiIIIII2++]);
        }
        this.IIiiiiiiIiiII = new IiIiIiiiiIIiI[4];
        IiiiiiiiIIIII2 = 0;
        while (IiiiiiiiIIIII2 < this.IIiiiiiiIiiII.length) {
            this.IIiiiiiiIiiII[IiiiiiiiIIIII2] = new IiIiIiiiiIIiI("sc/e/7.png", 1, 105 + IiiiiiiiIIIII2, iiIIiiiiIiiII.iiiiIiiiIiiII, null, IiiiiiiiIIIII2 == 0 ? "兑换" : (IiiiiiiiIIIII2 == 1 ? "地煞星称谓" : (IiiiiiiiIIIII2 == 2 ? "取出" : (IiiiiiiiIIIII2 == 3 ? "魂归" : ""))), (com.xy.q.IiiiIiiiiIiIi)this);
            this.IIiiiiiiIiiII[IiiiiiiiIIIII2].setBounds(432 + (IiiiiiiiIIIII2 - 2) * 82, 371, 59, 25);
            if (IiiiiiiiIIIII2 == 0) {
                this.IIiiiiiiIiiII[IiiiiiiiIIIII2].setFont(iiIIiiiiIiiII.iiIiiiiiiIIiI);
                this.IIiiiiiiIiiII[IiiiiiiiIIIII2].setImage("sc/e/6.png");
                this.IIiiiiiiIiiII[IiiiiiiiIIIII2].setBounds(364, 27, 34, 18);
            } else if (IiiiiiiiIIIII2 == 1) {
                this.IIiiiiiiIiiII[IiiiiiiiIIIII2].setFont(iiIIiiiiIiiII.iiIiiiiiiIIiI);
                this.IIiiiiiiIiiII[IiiiiiiiIIIII2].setImage("sc/e/69.png");
                this.IIiiiiiiIiiII[IiiiiiiiIIIII2].setBounds(517, 28, 85, 18);
            } else if (IiiiiiiiIIIII2 == 2 || IiiiiiiiIIIII2 == 3) {
                this.IIiiiiiiIiiII[IiiiiiiiIIIII2].setForeground(Color.black);
            }
            this.add((Component)this.IIiiiiiiIiiII[IiiiiiiiIIIII2++]);
        }
        this.IiiiIiiiIiIII = IiIIIiiiiIIiI.ALLATORIxDEMO((int)260, (int)26, (int)36, (int)19, (int)10, (Color)iiIIiiiiIiiII.ALLATORIxDEMO((String)"#c000000"), (Font)iiIIiiiiIiiII.iiiiIiiiIiiII);
        this.IiiiIiiiIiIII.setText("星芒");
        this.add(this.IiiiIiiiIiIII);
        this.iIiIiiiiIiIii = new MoneyType();
        this.iIiIiiiiIiIii.setIdAndKey(0, "星芒");
        this.iiIiIiiiiIIIi = IiIIIiiiiIIiI.ALLATORIxDEMO((int)10, (Color)Color.white, (Font)iiIIiiiiIiiII.iIIIiiiiIIIii, (MoneyType)this.iIiIiiiiIiIii, (GameView)gameView2);
        this.iiIiIiiiiIIIi.ALLATORIxDEMO(2);
        this.iiIiIiiiiIIIi.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/17.png", (int)3, (int)3, (int)3, (int)3, (boolean)false));
        this.iiIiIiiiiIIIi.setBounds(295, 26, 104, 19);
        this.add((Component)this.iiIiIiiiiIIIi);
        this.iiIIIiiiiiiiI = new com.xy.w.IIIiiiiiIiIiI[4];
        IiiiiiiiIIIII2 = 0;
        while (IiiiiiiiIIIII2 < this.iiIIIiiiiiiiI.length) {
            this.iiIIIiiiiiiiI[IiiiiiiiIIIII2] = new com.xy.w.IIIiiiiiIiIiI();
            if (IiiiiiiiIIIII2 == 0) {
                this.iiIIIiiiiiiiI[IiiiiiiiIIIII2].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/24.png", (int)2, (int)2, (int)2, (int)2, (boolean)false));
                this.iiIIIiiiiiiiI[IiiiiiiiIIIII2].setBounds(402, 354, 205, 58);
            } else if (IiiiiiiiIIIII2 == 1) {
                this.iiIIIiiiiiiiI[IiiiiiiiIIIII2].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/19.png", (int)5, (int)5, (int)5, (int)5, (boolean)false));
                this.iiIIIiiiiiiiI[IiiiiiiiIIIII2].setBounds(401, 46, 207, 309);
            } else if (IiiiiiiiIIIII2 == 2) {
                this.iiIIIiiiiiiiI[IiiiiiiiIIIII2].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/74.png", (int)16, (int)16, (int)16, (int)16, (boolean)false));
                this.iiIIIiiiiiiiI[IiiiiiiiIIIII2].setBounds(45, 44, 358, 368);
            } else if (IiiiiiiiIIIII2 == 3) {
                this.iiIIIiiiiiiiI[IiiiiiiiIIIII2].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/24.png", (int)290, (int)290, (int)2, (int)2, (boolean)false));
                this.iiIIIiiiiiiiI[IiiiiiiiIIIII2].setBounds(48, 47, 352, 362);
            }
            this.add((Component)this.iiIIIiiiiiiiI[IiiiiiiiIIIII2++]);
        }
        this.IiIIIiiiiIiiI = new IIiIiiiiIIiii((com.xy.q.IiiiIiiiiIiIi)this, 4, 6, 51, 51, 0, 0, 402, 48);
        this.IiIIIiiiiIiiI.ALLATORIxDEMO(IIIIIiiiIiiII.iiiIiiiiiiIIi((String)"sc/d/18.png"));
        this.add((Component)this.IiIIIiiiiIiiI);
    }

    public void iiiIiiiiiiIIi(boolean type) {
        if (!type) {
            this.iiIiiiiiiIIiI = null;
        }
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iiiiIiiiIIiii.length) {
            this.iiiiIiiiIIiii[IiiiiiiiIIIII++].setVisible(type);
        }
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IiIIiiiiIIIII.length) {
            this.IiIIiiiiIIIII[IiiiiiiiIIIII++].setVisible(type);
        }
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IIIIiiiiiiiII.length) {
            this.IIIIiiiiiiiII[IiiiiiiiIIIII++].setVisible(type);
        }
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iIiiIiiiIiIIi.length) {
            this.iIiiIiiiIiIIi[IiiiiiiiIIIII++].setVisible(type);
        }
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iIiiIiiiiiiII.length) {
            this.iIiiIiiiiiiII[IiiiiiiiIIIII++].setVisible(type);
        }
    }

    protected void paintComponent(Graphics g) {
        if (this.iiIIiiiiIiIIi.iIiIiiiiIIiii()) {
            this.iIiIiiiiIIiIi();
        }
        super.paintComponent(g);
    }

    public BigDecimal ALLATORIxDEMO() {
        Goodstable IiiiiiiiIIIII = (Goodstable)this.IiiiiiiiIIIII[0].ALLATORIxDEMO().ALLATORIxDEMO();
        if (IiiiiiiiIIIII == null) return null;
        return IiiiiiiiIIIII.getRgid();
    }

    public void iIiIiiiiIIiii(Goodstable good) {
        this.iiIiiiiiiIIiI = null;
        this.IiIIiiiiIIIII[0].setText(null);
        this.IiIIiiiiIIIII[1].setText(null);
        this.IIIIiiiiiiiII[2].setText(null);
        this.IIIIiiiiiiiII[3].setText(null);
        this.IIIIiiiiiiiII[4].setText(null);
        this.iiiiIiiiIIiii[3].setVisible(false);
        this.iiiiIiiiIIiii[4].setVisible(false);
        this.iiiiIiiiIIiii[5].setText("参 战");
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iIiiIiiiIiIIi.length) {
            this.iIiiIiiiIiIIi[IiiiiiiiIIIII++].setVisible(false);
        }
        this.iIiiIiiiiiiII[1].iIiIiiiiIIiii();
        this.iIiiIiiiiiiII[4].iIiIiiiiIIiii();
        this.iIiiIiiiiiiII[4].setVisible(false);
        this.iIiiIiiiiiiII[5].setVisible(false);
        if (good == null) return;
        if (good.getType() != 520L) {
            return;
        }
        this.iiIiiiiiiIIiI = good.getRgid();
        this.iiiiIiiiIIiii[5].setText(good.getStatus() == 1 ? "待 机" : "参 战");
        this.iIiiIiiiiiiII[1].iIiIiiiiIIiii(com.xy.w.IIiIiiiiIiiIi.iiiIiiiiiiIIi((String)good.getSkin()));
        String[] IiiiiiiiIIIII2 = good.getValue().split("\\|");
        int IiiiiiiiIIIII3 = IiiiiiiiIIIII2[0].indexOf("/");
        int IiiiiiiiIIIII4 = Integer.parseInt(IiiiiiiiIIIII2[0].substring(3, IiiiiiiiIIIII3));
        int IiiiiiiiIIIII5 = Integer.parseInt(IiiiiiiiIIIII2[0].substring(IiiiiiiiIIIII3 + 1));
        int IiiiiiiiIIIII6 = Integer.parseInt(IiiiiiiiIIIII2[1].substring(3));
        int IiiiiiiiIIIII7 = Integer.parseInt(IiiiiiiiIIIII2[2].split("=")[1]);
        this.IiIIiiiiIIIII[0].setForeground(Color.white);
        this.IiIIiiiiIIIII[0].setText(String.valueOf(IiiiiiiiIIIII6) + "/" + IiiiiiiiIIIII4 * 200);
        this.IiIIiiiiIIIII[1].setText(String.valueOf(IiiiiiiiIIIII7));
        this.iIiiIiiiIiIIi[0].setVisible(true);
        this.IIIIiiiiiiiII[2].setText(good.getGoodsname());
        this.IIIIiiiiiiiII[3].setText(String.valueOf(IiiiiiiiIIIII4));
        this.IIIIiiiiiiiII[4].setText("/" + IiiiiiiiIIIII5);
        String[] IiiiiiiiIIIII8 = IiiiiiiiIIIII2[3].split("&");
        String[] IiiiiiiiIIIII9 = IiiiiiiiIIIII2[4].split("&");
        this.iIiiIiiiIiIIi[1].setTextSize("#W【神通】 资质：" + IiiiiiiiIIIII8[1].split("=")[1] + "/100#r#G" + this.ALLATORIxDEMO(IiiiiiiiIIIII8[2], "+") + "#r" + this.ALLATORIxDEMO(IiiiiiiiIIIII8[3], "+"), 180);
        this.iIiiIiiiIiIIi[1].setVisible(true);
        StringBuffer IiiiiiiiIIIII10 = new StringBuffer();
        IiiiiiiiIIIII10.append("#W【五行】");
        int IiiiiiiiIIIII11 = 1;
        while (IiiiiiiiIIIII11 < IiiiiiiiIIIII9.length) {
            String string = this.ALLATORIxDEMO(IiiiiiiiIIIII9[IiiiiiiiIIIII11], " ");
            ++IiiiiiiiIIIII11;
            IiiiiiiiIIIII10.append("#r#Y" + string);
        }
        IiiiiiiiIIIII11 = 0;
        double IiiiiiiiIIIII12 = 0.0;
        int IiiiiiiiIIIII13 = 0;
        while (IiiiiiiiIIIII13 < IiiiiiiiIIIII8.length) {
            if (IiiiiiiiIIIII8[IiiiiiiiIIIII13].startsWith("星阵属性")) {
                String[] IiiiiiiiIIIII14 = IiiiiiiiIIIII8[IiiiiiiiIIIII13].split("=");
                int IiiiiiiiIIIII15 = 1;
                while (IiiiiiiiIIIII15 < IiiiiiiiIIIII9.length) {
                    String[] IiiiiiiiIIIII16 = IiiiiiiiIIIII9[IiiiiiiiIIIII15].split("=");
                    ++IiiiiiiiIIIII15;
                    IiiiiiiiIIIII12 += MsgUntil.ALLATORIxDEMO((String)IiiiiiiiIIIII14[2], (String)IiiiiiiiIIIII16[0], (String)IiiiiiiiIIIII16[1]);
                }
                IiiiiiiiIIIII10.append("#r#c43E4D2五行加成星阵之力 " + String.format("%.1f", IiiiiiiiIIIII12) + "%");
                this.iIiiIiiiiiiII[4].ALLATORIxDEMO(IIIIIiiiIiiII.iiiIiiiiiiIIi((String)("sc/skill/" + IiiiiiiiIIIII14[1] + ".png")));
                this.iIiiIiiiiiiII[4].setVisible(true);
                this.iIiiIiiiiiiII[5].setVisible(true);
                this.iIiiIiiiIiIIi[3].setTextSize("#W【星阵之力】 " + IiiiiiiiIIIII14[1], 180);
                this.iIiiIiiiIiIIi[3].setVisible(true);
                this.iiiiIiiiIIiii[3].setVisible(true);
                this.iiiiIiiiIIiii[4].setVisible(true);
                IiiiiiiiIIIII11 = 1;
            }
            ++IiiiiiiiIIIII13;
        }
        if (IiiiiiiiIIIII11 == 0) {
            IiiiiiiiIIIII10.append("#r#Y无星阵，五行暂不生效");
            this.iIiiIiiiIiIIi[3].setTextSize("#W【星阵之力】 无", 180);
            this.iIiiIiiiIiIIi[3].setVisible(true);
        }
        this.iIiiIiiiIiIIi[2].setTextSize(IiiiiiiiIIIII10.toString(), 180);
        this.iIiiIiiiIiIIi[2].setVisible(true);
    }

    public int iiiIiiiiiiIIi() {
        return this.IIIiiiiiIIiII;
    }

    public static boolean ALLATORIxDEMO(String value) {
        if (value.equals("朱雀")) return true;
        if (value.equals("玄武")) return true;
        if (value.equals("白虎")) return true;
        if (!value.equals("青龙")) return false;
        return true;
    }

    public void ALLATORIxDEMO(Goodstable good) {
        if (this.IIiiIiiiIIiIi == 0) {
            this.iIiIiiiiIIiii(good);
            return;
        }
        if (this.IIiiIiiiIIiIi != 1) return;
        this.IiiiiiiiIIIII[good.getType() == 520L ? 0 : 1].ALLATORIxDEMO(1, (Object)good);
        this.iiiIiiiiiiIIi();
    }

    public void iIiIiiiiIIiii() {
        this.iIiIiiiiIIiIi(0);
        super.iIiIiiiiIIiii();
    }

    /*
     * Unable to fully structure code
     */
    public void iiiIiiiiiiIIi(int id) {
        block13: {
            if (id == 115) {
                this.iIiIiiiiIIiii();
                return;
            }
            if (id != 111 && this.iiIIiiiiIiIIi.ALLATORIxDEMO()) {
                return;
            }
            IiiiiiiiIIIII = this.ALLATORIxDEMO();
            v0 = IiiiiiiiIIIII = this.iiIiiiiiiIIiI != null ? IiiiiiiiIIIII.getGood(this.iiIiiiiiiIIiI) : null;
            if (IiiiiiiiIIIII == null) {
                this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("请选择对应的星卡");
                return;
            }
            if (id == 107) {
                this.iiIIiiiiIiIIi.ALLATORIxDEMO(new ConfirmBean(2, IiiiiiiiIIIII.getRgid().toString(), "真的要取出该星卡吗?"));
                return;
            }
            if (id == 111) {
                IiiiiiiiIIIII = (iIIiiiiiIIIIi)this.ALLATORIxDEMO().iiiIiiiiiiIIi(27);
                IiiiiiiiIIIII.iiiIiiiiiiIIi(IiiiiiiiIIIII);
                return;
            }
            if (id == 112) {
                this.iiIIiiiiIiIIi.ALLATORIxDEMO(new ConfirmBean(20, IiiiiiiiIIIII.getRgid().toString(), "真的要删除该星卡的星阵吗？删除后不可恢复"));
                return;
            }
            if (id != 113) break block13;
            IiiiiiiiIIIII = IiiiiiiiIIIII.getValue().split("\\|");
            IiiiiiiiIIIII = IiiiiiiiIIIII[3].split("&");
            IiiiiiiiIIIII = 0;
            if (true) ** GOTO lbl60
        }
        if (id != 114) return;
        IiiiiiiiIIIII = Integer.parseInt(IiiiiiiiIIIII.getValue().split("\\|")[2].split("=")[1]);
        if (IiiiiiiiIIIII <= 0) {
            this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("战力不足无法参战");
            return;
        }
        if (IiiiiiiiIIIII.getStatus() == 1) {
            IiiiiiiiIIIII.iIiIiiiiIIiii(IiiiiiiiIIIII.getRgid());
            IiiiiiiiIIIII.setStatus(Integer.valueOf(4));
            IiiiiiiiIIIII.ALLATORIxDEMO(IiiiiiiiIIIII);
            ParamTool.ALLATORIxDEMO((Goodstable)IiiiiiiiIIIII, (int)0, (GameClient)this.ALLATORIxDEMO());
        } else {
            IiiiiiiiIIIII = IiiiiiiiIIIII.getEquipGood(13);
            if (IiiiiiiiIIIII != null) {
                IiiiiiiiIIIII.iIiIiiiiIIiii(IiiiiiiiIIIII.getRgid());
                IiiiiiiiIIIII.setStatus(Integer.valueOf(4));
                IiiiiiiiIIIII.ALLATORIxDEMO(IiiiiiiiIIIII);
                ParamTool.ALLATORIxDEMO((Goodstable)IiiiiiiiIIIII, (int)0, (GameClient)this.ALLATORIxDEMO());
            }
            IiiiiiiiIIIII.iIiIiiiiIIiii(IiiiiiiiIIIII.getRgid());
            IiiiiiiiIIIII.setStatus(Integer.valueOf(1));
            IiiiiiiiIIIII.ALLATORIxDEMO(IiiiiiiiIIIII);
            ParamTool.ALLATORIxDEMO((Goodstable)IiiiiiiiIIIII, (int)0, (GameClient)this.ALLATORIxDEMO());
        }
        this.iiiiIiiiIIiii[5].setText(IiiiiiiiIIIII.getStatus() == 1 ? "待 机" : "参 战");
        return;
        do {
            if (IiiiiiiiIIIII[IiiiiiiiIIIII].startsWith("星阵属性")) {
                IiiiiiiiIIIII = IiiiiiiiIIIII[IiiiiiiiIIIII].split("=");
                if (!iIiIIiiiIiiiI.ALLATORIxDEMO(IiiiiiiiIIIII[1])) {
                    this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("不是四神兽星阵无法转移");
                    return;
                }
                ((iiiiiiiiiiIiI)this.ALLATORIxDEMO().iiiIiiiiiiIIi(97)).ALLATORIxDEMO(0, IiiiiiiiIIIII, IiiiiiiiIIIII);
                return;
            }
            ++IiiiiiiiIIIII;
lbl60:
            // 2 sources

        } while (IiiiiiiiIIIII < IiiiiiiiIIIII.length);
    }

    public void iiiIiiiiiiIIi() {
        if (this.IIiiIiiiIIiIi != 1) {
            return;
        }
        if (this.IIIiiiiiIIiII != 0 && this.IIIiiiiiIIiII != 1 && this.IIIiiiiiIIiII != 3) {
            return;
        }
        RoleData IiiiiiiiIIIII = this.ALLATORIxDEMO();
        Goodstable IiiiiiiiIIIII2 = (Goodstable)this.IiiiiiiiIIIII[0].ALLATORIxDEMO().ALLATORIxDEMO();
        Goodstable IiiiiiiiIIIII3 = (Goodstable)this.IiiiiiiiIIIII[1].ALLATORIxDEMO().ALLATORIxDEMO();
        if (IiiiiiiiIIIII2 != null) {
            IiiiiiiiIIIII2 = IiiiiiiiIIIII.getGood(IiiiiiiiIIIII2.getRgid());
        }
        if (IiiiiiiiIIIII3 != null) {
            IiiiiiiiIIIII3 = IiiiiiiiIIIII.getGood(IiiiiiiiIIIII3.getRgid());
        }
        if (IiiiiiiiIIIII2 == null) {
            if (this.IIIiiiiiIIiII == 0) {
                this.IiiIIiiiiiiiI.setText(null);
                return;
            }
            if (this.IIIiiiiiIIiII == 1) {
                this.iiiIiiiiiiiIi.setText(null);
                return;
            }
            if (this.IIIiiiiiIIiII != 3) return;
            this.iiiIiiiiiiiIi.setText(null);
            return;
        }
        String[] IiiiiiiiIIIII4 = IiiiiiiiIIIII2.getValue().split("\\|");
        String[] IiiiiiiiIIIII5 = IiiiiiiiIIIII4[0].split("=")[1].split("/");
        int IiiiiiiiIIIII6 = Integer.parseInt(IiiiiiiiIIIII5[0]);
        if (this.IIIiiiiiIIiII == 0) {
            if (IiiiiiiiIIIII6 >= 14) {
                this.IiiIIiiiiiiiI.setText(null);
                return;
            }
            int IiiiiiiiIIIII7 = Integer.parseInt(IiiiiiiiIIIII4[1].split("=")[1]);
            this.IiiIIiiiiiiiI.setText(String.valueOf(IiiiiiiiIIIII7) + "/" + IiiiiiiiIIIII6 * 200);
            return;
        }
        if (this.IIIiiiiiIIiII == 1) {
            if (this.ALLATORIxDEMO().ALLATORIxDEMO(2, 12)) {
                iiIIiiiiIiiII.ALLATORIxDEMO((JLabel)this.iiiIiiiiiiiIi, (long)(500000L + (long)IiiiiiiiIIIII6 * 500000L));
                return;
            }
            iiIIiiiiIiiII.ALLATORIxDEMO((JLabel)this.iiiIiiiiiiiIi, (long)((long)IiiiiiiiIIIII6 * 20000000L));
            return;
        }
        if (this.IIIiiiiiIIiII != 3) return;
        int IiiiiiiiIIIII8 = Integer.parseInt(IiiiiiiiIIIII5[1]);
        if (IiiiiiiiIIIII8 >= 14) {
            this.iiiIiiiiiiiIi.setForeground(Color.white);
            this.iiiIiiiiiiiIi.setText("0/0");
            return;
        }
        if (IiiiiiiiIIIII3 == null) {
            this.iiiIiiiiiiiIi.setText(null);
            return;
        }
        int IiiiiiiiIIIII9 = IiiiiiiiIIIII8 / 2 + 2;
        if (IiiiiiiiIIIII9 < IiiiiiiiIIIII3.getUsetime()) {
            this.iiiIiiiiiiiIi.setForeground(Color.white);
            this.iiiIiiiiiiiIi.setText(String.valueOf(IiiiiiiiIIIII9) + "/" + IiiiiiiiIIIII3.getUsetime());
            return;
        }
        this.iiiIiiiiiiiIi.setForeground(Color.red);
        this.iiiIiiiiiiiIi.setText(String.valueOf(IiiiiiiiIIIII9) + "/" + IiiiiiiiIIIII3.getUsetime());
    }

    public boolean iIiIiiiiIIiii() {
        RoleData IiiiiiiiIIIII = this.ALLATORIxDEMO();
        Goodstable IiiiiiiiIIIII2 = (Goodstable)this.IiiiiiiiIIIII[0].ALLATORIxDEMO().ALLATORIxDEMO();
        Goodstable IiiiiiiiIIIII3 = (Goodstable)this.IiiiiiiiIIIII[1].ALLATORIxDEMO().ALLATORIxDEMO();
        if (IiiiiiiiIIIII2 != null) {
            IiiiiiiiIIIII2 = IiiiiiiiIIIII.getGood(IiiiiiiiIIIII2.getRgid());
        }
        if (IiiiiiiiIIIII3 != null) {
            IiiiiiiiIIIII3 = IiiiiiiiIIIII.getGood(IiiiiiiiIIIII3.getRgid());
        }
        if (IiiiiiiiIIIII2 == null) {
            this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u8bf7\u9009\u62e9\u8981\u57f9\u517b\u7684\u661f\u5361");
            return false;
        }
        if (IiiiiiiiIIIII3 == null) {
            this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u8bf7\u9009\u62e9\u6750\u6599");
            return false;
        }
        String[] stringArray = IiiiiiiiIIIII2.getValue().split("\\|");
        String[] stringArray2 = stringArray[0].split("=")[1].split("/");
        int IiiiiiiiIIIII4 = Integer.parseInt(stringArray2[0]);
        int IiiiiiiiIIIII5 = Integer.parseInt(stringArray2[1]);
        int IiiiiiiiIIIII6 = Integer.parseInt(stringArray[1].split("=")[1]);
        int IiiiiiiiIIIII7 = 1;
        int IiiiiiiiIIIII8 = 0;
        if (this.IIIiiiiiIIiII == 0) {
            if (IiiiiiiiIIIII4 >= 14) {
                this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u7b49\u7ea7\u5df2\u7ecf\u62b5\u8fbe\u4e0a\u9650");
                return false;
            }
            if (IiiiiiiiIIIII3.getType() != 522L) {
                this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u7269\u54c1\u4e0d\u662f\u89c2\u661f\u518c");
                return false;
            }
            if (IiiiiiiiIIIII3.getUsetime() < IiiiiiiiIIIII7) {
                this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u89c2\u661f\u518c\u6570\u91cf\u4e0d\u8db3");
                return false;
            }
            if (IiiiiiiiIIIII6 >= IiiiiiiiIIIII4 * 200) {
                this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u795e\u529b\u5df2\u7ecf\u62b5\u8fbe\u4e0a\u9650\uff0c\u65e0\u6cd5\u57f9\u517b");
                return false;
            }
            if (Long.parseLong(this.iiiIiiiiiiiIi.getText().replace(",", "")) > IiiiiiiiIIIII.getLoginResult().getGold().longValue()) {
                this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u5927\u8bdd\u5e01\u4e0d\u8db3");
                return false;
            }
            IiiiiiiiIIIII8 = 51;
        } else if (this.IIIiiiiiIIiII == 1) {
            if (IiiiiiiiIIIII6 < IiiiiiiiIIIII4 * 200) {
                this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u795e\u529b\u6ca1\u6709\u62b5\u8fbe\u4e0a\u9650\uff0c\u65e0\u6cd5\u5347\u7ea7");
                return false;
            }
            if (IiiiiiiiIIIII4 >= IiiiiiiiIIIII5) {
                this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u7b49\u7ea7\u5df2\u7ecf\u62b5\u8fbe\u7b49\u7ea7\u4e0a\u9650,\u65e0\u6cd5\u7ee7\u7eed\u5347\u7ea7");
                return false;
            }
            if (IiiiiiiiIIIII3.getType() != 500L) {
                this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u7269\u54c1\u4e0d\u662f\u77ff\u77f3");
                return false;
            }
            int IiiiiiiiIIIII9 = Integer.parseInt(IiiiiiiiIIIII3.getValue().split("=")[1]);
            if (this.iiIIiiiiIiIIi.getClient().ALLATORIxDEMO(2, 12)) {
                if (IiiiiiiiIIIII4 == 1 && IiiiiiiiIIIII9 != 6) {
                    this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("1\u7ea7\u661f\u5361\u4f7f\u7528\u5343\u5e74\u5bd2\u94c1\u5347\u7ea7");
                    return false;
                }
                if (IiiiiiiiIIIII4 >= 2 && IiiiiiiiIIIII4 <= 3 && IiiiiiiiIIIII9 != 7) {
                    this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("2,3\u7ea7\u661f\u5361\u4f7f\u7528\u5929\u5916\u98de\u77f3\u5347\u7ea7");
                    return false;
                }
                if (IiiiiiiiIIIII4 >= 4 && IiiiiiiiIIIII4 <= 5 && IiiiiiiiIIIII9 != 8) {
                    this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("4-6\u7ea7\u661f\u5361\u4f7f\u7528\u76d8\u53e4\u7cbe\u94c1\u5347\u7ea7");
                    return false;
                }
                if (IiiiiiiiIIIII4 >= 7 && IiiiiiiiIIIII4 <= 9 && IiiiiiiiIIIII9 != 9) {
                    this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("7-9\u7ea7\u661f\u5361\u4f7f\u7528\u8865\u5929\u795e\u77f3\u5347\u7ea7");
                    return false;
                }
                if (IiiiiiiiIIIII4 >= 10 && IiiiiiiiIIIII4 <= 13 && IiiiiiiiIIIII9 != 10) {
                    this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("10-13\u7ea7\u661f\u5361\u4f7f\u7528\u516d\u9b42\u4e4b\u7389\u5347\u7ea7");
                    return false;
                }
                if (IiiiiiiiIIIII4 >= 14 && IiiiiiiiIIIII9 != 11) {
                    this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u4f7f\u7528\u65e0\u91cf\u7409\u7483\u5347\u7ea7");
                    return false;
                }
            } else if (IiiiiiiiIIIII9 != 11) {
                this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u77ff\u77f3\u4e0d\u662f\u65e0\u91cf\u7409\u7483");
                return false;
            }
            if (IiiiiiiiIIIII3.getUsetime() < IiiiiiiiIIIII7) {
                this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u77ff\u77f3\u6570\u91cf\u4e0d\u8db3");
                return false;
            }
            if (Long.parseLong(this.iiiIiiiiiiiIi.getText().replace(",", "")) > IiiiiiiiIIIII.getLoginResult().getGold().longValue()) {
                this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u5927\u8bdd\u5e01\u4e0d\u8db3");
                return false;
            }
            IiiiiiiiIIIII8 = 52;
        } else if (this.IIIiiiiiIIiII == 2) {
            if (this.iiIIiiiiIiIIi == 0) {
                if (IiiiiiiiIIIII3.getType() != 524L) {
                    this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u7269\u54c1\u4e0d\u662f\u6d51\u5929\u77f3");
                    return false;
                }
                if (IiiiiiiiIIIII3.getUsetime() < IiiiiiiiIIIII7) {
                    this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u6d51\u5929\u77f3\u6570\u91cf\u4e0d\u8db3");
                    return false;
                }
                if (Long.parseLong(this.iiiIiiiiiiiIi.getText().replace(",", "")) > IiiiiiiiIIIII.getLoginResult().getGold().longValue()) {
                    this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u5927\u8bdd\u5e01\u4e0d\u8db3");
                    return false;
                }
                IiiiiiiiIIIII8 = 53;
            } else if (this.iiIIiiiiIiIIi == 1) {
                if (IiiiiiiiIIIII3.getType() != 523L) {
                    this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u7269\u54c1\u4e0d\u662f\u6613\u8c61\u7b26");
                    return false;
                }
                if (IiiiiiiiIIIII3.getUsetime() < IiiiiiiiIIIII7) {
                    this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u6613\u8c61\u7b26\u6570\u91cf\u4e0d\u8db3");
                    return false;
                }
                if (Long.parseLong(this.iiiIiiiiiiiIi.getText().replace(",", "")) > IiiiiiiiIIIII.getLoginResult().getGold().longValue()) {
                    this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u5927\u8bdd\u5e01\u4e0d\u8db3");
                    return false;
                }
                IiiiiiiiIIIII8 = 54;
            }
        } else if (this.IIIiiiiiIIiII == 3) {
            if (IiiiiiiiIIIII5 >= 14) {
                this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u5df2\u7ecf\u5347\u5230\u6700\u5927\u7b49\u7ea7");
                return false;
            }
            if (IiiiiiiiIIIII3.getType() != 521L) {
                this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u7269\u54c1\u4e0d\u662f\u70bc\u661f\u77f3");
                return false;
            }
            IiiiiiiiIIIII7 = IiiiiiiiIIIII5 / 2 + 2;
            if (IiiiiiiiIIIII3.getUsetime() < IiiiiiiiIIIII7) {
                this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u70bc\u661f\u77f3\u6570\u91cf\u4e0d\u8db3");
                return false;
            }
            IiiiiiiiIIIII8 = 55;
        }
        SuitOperBean IiiiiiiiIIIII10 = new SuitOperBean();
        IiiiiiiiIIIII10.setType(IiiiiiiiIIIII8);
        ArrayList<BigDecimal> IiiiiiiiIIIII11 = new ArrayList<BigDecimal>();
        IiiiiiiiIIIII11.add(IiiiiiiiIIIII2.getRgid());
        IiiiiiiiIIIII11.add(IiiiiiiiIIIII3.getRgid());
        IiiiiiiiIIIII10.setGoods(IiiiiiiiIIIII11);
        IiiiiiiiIIIII3.ALLATORIxDEMO(IiiiiiiiIIIII7);
        if (IiiiiiiiIIIII3.getUsetime() <= 0) {
            IiiiiiiiIIIII.iIiIiiiiIIiii(IiiiiiiiIIIII3.getRgid());
            this.iiiIiiiiiiIIi(IiiiiiiiIIIII3);
        }
        String IiiiiiiiIIIII12 = Agreement.getSendTextAES((String)"suitoperate", (String)iiIiiiiiIIiii.ALLATORIxDEMO().toJson(IiiiiiiiIIIII10));
        this.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII12);
        return true;
    }

    public void iIiIiiiiIIiii(int type) {
        if (this.IIiiIiiiIIiIi != 1) return;
        if (this.IIIiiiiiIIiII != 2) {
            return;
        }
        if (this.iiIIiiiiIiIIi != type) {
            this.iIIiIiiiiiiIi[1].iIiIiiiiIIiii(type == 0 ? "sc/e/67.png" : "sc/e/68.png");
            this.iIIiIiiiiiiIi[2].iIiIiiiiIIiii(type == 1 ? "sc/e/67.png" : "sc/e/68.png");
        }
        this.iiIIiiiiIiIIi = type;
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IiiiiiiiIIIII.length) {
            iIiIIiiiIIIiI iIiIIiiiIIIiI2 = this.IiiiiiiiIIIII[IiiiiiiiIIIII];
            ++IiiiiiiiIIIII;
            iIiIIiiiIIIiI2.ALLATORIxDEMO(0, null);
        }
        if (this.iiIIiiiiIiIIi == 0) {
            this.IiIiiiiiIIIII.ALLATORIxDEMO(new long[]{524L});
            this.ALLATORIxDEMO.setText("\u91cd\u6d17");
            this.IiiiiiiiIIIII[1].ALLATORIxDEMO("\u6d51\u5929\u77f3");
        } else {
            this.IiIiiiiiIIIII.ALLATORIxDEMO(new long[]{523L});
            this.ALLATORIxDEMO.setText("\u91cd\u6d17");
            this.IiiiiiiiIIIII[1].ALLATORIxDEMO("\u6613\u8c61\u7b26");
        }
        this.iIIiIiiiiiiIi[1].setVisible(true);
        this.iIIiIiiiiiiIi[2].setVisible(true);
        if (this.ALLATORIxDEMO().ALLATORIxDEMO(2, 12)) {
            iiIIiiiiIiiII.ALLATORIxDEMO((JLabel)this.iiiIiiiiiiiIi, (long)100000L);
        } else {
            iiIIiiiiIiiII.ALLATORIxDEMO((JLabel)this.iiiIiiiiiiiIi, (long)(this.iiIIiiiiIiIIi == 0 ? 1000000L : 5000000L));
        }
        this.IIiiiiiiiIIIi[0].setText("消耗金钱");
        this.IIiiiiiiiIIIi[1].setText("当前金钱");
        this.IiiIIiiiiiiiI.ALLATORIxDEMO(this.iiiiIiiiIiiII);
        this.iiiIiiiiiiiIi.setBounds(200, 162, 114, 19);
        this.IiiIIiiiiiiiI.setBounds(200, 188, 114, 19);
        this.IIiiiiiiiIIIi[0].setVisible(true);
        this.IIiiiiiiiIIIi[1].setVisible(true);
        this.IiiIIiiiiiiiI.setVisible(true);
        this.IIiiiiiiiIIIi[2].setFont(iiIIiiiiIiiII.iIiIiiiiiiIIi);
        this.IIiiiiiiiIIIi[3].setFont(iiIIiiiiIiiII.iIiIiiiiiiIIi);
        this.IIiiiiiiiIIIi[2].setBounds(145, 64, 72, 18);
        this.IIiiiiiiiIIIi[3].setBounds(252, 64, 72, 18);
        this.IIiiiiiiiIIIi[2].setText("重洗神通");
        this.IIiiiiiiiIIIi[3].setText("重洗五行");
        this.IIiiiiiiiIIIi[2].setVisible(true);
        this.IIiiiiiiiIIIi[3].setVisible(true);
    }
}
