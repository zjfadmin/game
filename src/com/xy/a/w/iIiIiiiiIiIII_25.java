/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.w.IIIiIiiiIiIII
 *  com.xy.game.GameUtil
 *  com.xy.game.RoleData
 *  com.xy.i.IIiIiiiiIiIII
 *  com.xy.i.IIiiIiiiIiiiI
 *  com.xy.q.IIIiiiiiIiIiI
 *  com.xy.q.IiIIIiiiiIIiI
 *  com.xy.q.IiIIIiiiiIiIi
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.readbean.Goodstable
 *  com.xy.readbean.RoleTxBean
 *  com.xy.socket.GameClient
 *  com.xy.socket.ParamTool
 *  com.xy.text.GameView
 *  com.xy.v.iIiIIiiiIiiiI
 *  com.xy.w.IIIIIiiiIiiII
 *  com.xy.w.IIIiiiiiIiIiI
 *  com.xy.w.IiiiIiiiiIiIi
 *  com.xy.w.iiiiiiiiiiIiI
 */
package com.xy.a.w;

import com.xy.a.w.IIIiIiiiIiIII;
import com.xy.game.GameUtil;
import com.xy.game.RoleData;
import com.xy.i.IIiIiiiiIiIII;
import com.xy.i.IIiiIiiiIiiiI;
import com.xy.q.IiIIIiiiiIIiI;
import com.xy.q.IiIIIiiiiIiIi;
import com.xy.q.IiiiIiiiiIiIi;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.readbean.Goodstable;
import com.xy.readbean.RoleTxBean;
import com.xy.socket.GameClient;
import com.xy.socket.ParamTool;
import com.xy.text.GameView;
import com.xy.v.iIiIIiiiIiiiI;
import com.xy.w.IIIIIiiiIiiII;
import com.xy.w.IIIiiiiiIiIiI;
import com.xy.w.iiiiiiiiiiIiI;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.math.BigDecimal;
import java.util.List;
import javax.swing.JLabel;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class iIiIiiiiIiIII
extends IiiiIiiiiIiIi {
    private IIIiiiiiIiIiI[] iiiiIiiiIiiII;
    private IIIiIiiiIiIII[] iiiIiiiiiiiIi;
    private com.xy.w.IiiiIiiiiIiIi iIiiIiiiiiiII;
    private IiIIIiiiiIiIi IIiiIiiiIIiIi;
    private IIiIiiiiIiIII[] iIiIiiiiIiIii;
    private int IiIIIiiiiIiiI = 0;
    private int iiIiiiiiiiIii = 0;
    private JLabel IiiiiiiiIIIII;
    private IIiIiiiiIiIII[] ALLATORIxDEMO;

    public void ALLATORIxDEMO(BigDecimal id, int type) {
        if (type == 3) {
            this.iIiIiiiiIIiii(3);
            Goodstable IiiiiiiiIIIII = this.ALLATORIxDEMO().getGood(id);
            if (IiiiiiiiIIIII == null) return;
            IIIiIiiiIiIII.ALLATORIxDEMO((IIIiIiiiIiIII)this.iiiIiiiiiiiIi[type]).ALLATORIxDEMO(1, (Object)IiiiiiiiIIIII);
            com.xy.w.IiiiIiiiiIiIi IiiiiiiiIIIII2 = iiiiiiiiiiIiI.ALLATORIxDEMO((String)("tx/" + IiiiiiiiIIIII.getSkin() + "0"), (int)-2, (int)-5, null);
            com.xy.w.IiiiIiiiiIiIi IiiiiiiiIIIII3 = iiiiiiiiiiIiI.ALLATORIxDEMO((String)("tx/" + IiiiiiiiIIIII.getSkin() + "1"), (int)-2, (int)5, null);
            this.iIiiIiiiiiiII = this.iIiiIiiiiiiII.ALLATORIxDEMO(IiiiiiiiIIIII2);
            this.iIiiIiiiiiiII = this.iIiiIiiiiiiII.ALLATORIxDEMO(IiiiiiiiIIIII3);
            return;
        }
        if (id == null) return;
        RoleTxBean IiiiiiiiIIIII = this.ALLATORIxDEMO().ALLATORIxDEMO(id.intValue());
        if (IiiiiiiiIIIII == null) return;
        type = IiiiiiiiIIIII.getRdType() - 1;
        this.iIiIiiiiIIiii(type);
        IIIiIiiiIiIII.ALLATORIxDEMO((IIIiIiiiIiIII)this.iiiIiiiiiiiIi[type]).ALLATORIxDEMO(8, (Object)IiiiiiiiIIIII);
        com.xy.w.IiiiIiiiiIiIi IiiiiiiiIIIII4 = iiiiiiiiiiIiI.ALLATORIxDEMO((String)("tx/tx" + IiiiiiiiIIIII.getRdId()), (int)-2, (int)(IiiiiiiiIIIII.getRdStatues() - IiiiiiiiIIIII.getRdType()), null);
        this.iIiiIiiiiiiII = this.iIiiIiiiiiiII.ALLATORIxDEMO(IiiiiiiiIIIII4);
    }

    public int iiiIiiiiiiIIi() {
        return this.IiIIIiiiiIiiI;
    }

    public void IiiIiiiiiiIiI() {
        this.IIiiIiiiIIiIi.ALLATORIxDEMO().iIiIiiiiIIiIi(0);
    }

    public void iiiIiiiiiiIIi(int type) {
        this.IiIIIiiiiIiiI = type;
        this.IIiiIiiiIIiIi.ALLATORIxDEMO().iIiIiiiiIIiIi(0);
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < 4) {
            this.ALLATORIxDEMO[IiiiiiiiIIIII].setKeep(IiiiiiiiIIIII == type);
            ++IiiiiiiiIIIII;
        }
    }

    public void ALLATORIxDEMO(com.xy.q.IIIiiiiiIiIiI imgGrid) {
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iiiIiiiiiiiIi.length) {
            if (IIIiIiiiIiIII.ALLATORIxDEMO((IIIiIiiiIiIII)this.iiiIiiiiiiiIi[IiiiiiiiIIIII]) == imgGrid) {
                this.iIiIiiiiIIiii(IiiiiiiiIIIII);
                return;
            }
            ++IiiiiiiiIIIII;
        }
    }

    protected void paintChildren(Graphics g) {
        super.paintChildren(g);
        if (this.iIiiIiiiiiiII == null) return;
        this.iIiiIiiiiiiII.ALLATORIxDEMO(g, 205, 290, this.iiIiiiiiiiIii, iIiIIiiiIiiiI.ALLATORIxDEMO());
    }

    public void iIiIiiiiIIiIi() {
        BigDecimal IiiiiiiiIIIII;
        RoleData IiiiiiiiIIIII2 = this.ALLATORIxDEMO();
        IiiiiiiiIIIII2.getPackRecord().ALLATORIxDEMO(new String[]{IIIiIiiiIiIII.ALLATORIxDEMO((IIIiIiiiIiIII)this.iiiIiiiiiiiIi[0]).ALLATORIxDEMO() == 8 ? String.valueOf(IIIiIiiiIiIII.ALLATORIxDEMO((IIIiIiiiIiIII)this.iiiIiiiiiiiIi[0]).ALLATORIxDEMO()) : "", IIIiIiiiIiIII.ALLATORIxDEMO((IIIiIiiiIiIII)this.iiiIiiiiiiiIi[1]).ALLATORIxDEMO() == 8 ? String.valueOf(IIIiIiiiIiIII.ALLATORIxDEMO((IIIiIiiiIiIII)this.iiiIiiiiiiiIi[1]).ALLATORIxDEMO()) : "", IIIiIiiiIiIII.ALLATORIxDEMO((IIIiIiiiIiIII)this.iiiIiiiiiiiIi[2]).ALLATORIxDEMO() == 8 ? String.valueOf(IIIiIiiiIiIII.ALLATORIxDEMO((IIIiIiiiIiIII)this.iiiIiiiiiiiIi[2]).ALLATORIxDEMO()) : ""});
        boolean IiiiiiiiIIIII3 = false;
        BigDecimal bigDecimal = IiiiiiiiIIIII = IIIiIiiiIiIII.ALLATORIxDEMO((IIIiIiiiIiIII)this.iiiIiiiiiiiIi[3]).ALLATORIxDEMO() == 1 ? new BigDecimal(IIIiIiiiIiIII.ALLATORIxDEMO((IIIiIiiiIiIII)this.iiiIiiiiiiiIi[3]).ALLATORIxDEMO()) : null;
        if (IiiiiiiiIIIII2.goodChoses[12] == null || IiiiiiiiIIIII == null || IiiiiiiiIIIII2.goodChoses[12].compareTo(IiiiiiiiIIIII) != 0) {
            Goodstable IiiiiiiiIIIII4;
            if (IiiiiiiiIIIII2.goodChoses[12] != null) {
                IiiiiiiiIIIII3 = true;
                IiiiiiiiIIIII4 = IiiiiiiiIIIII2.getGood(IiiiiiiiIIIII2.goodChoses[12]);
                IiiiiiiiIIIII2.goodChoses[12] = null;
                if (IiiiiiiiIIIII4 != null) {
                    IiiiiiiiIIIII4.setStatus(Integer.valueOf(0));
                    ParamTool.ALLATORIxDEMO((Goodstable)IiiiiiiiIIIII4, (int)0, (GameClient)this.ALLATORIxDEMO());
                }
            }
            if (IiiiiiiiIIIII != null) {
                IiiiiiiiIIIII3 = true;
                IiiiiiiiIIIII4 = IiiiiiiiIIIII2.getGood(IiiiiiiiIIIII);
                if (IiiiiiiiIIIII4 != null) {
                    IiiiiiiiIIIII2.goodChoses[12] = IiiiiiiiIIIII4.getRgid();
                    IiiiiiiiIIIII4.setStatus(Integer.valueOf(1));
                    ParamTool.ALLATORIxDEMO((Goodstable)IiiiiiiiIIIII4, (int)0, (GameClient)this.ALLATORIxDEMO());
                }
            }
        }
        IiiiiiiiIIIII2.ALLATORIxDEMO(true);
        if (!IiiiiiiiIIIII3) return;
        IiiiiiiiIIIII2.getRoleProperty().IIIIIiiiiIIii();
    }

    public boolean ALLATORIxDEMO() {
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < 4) {
            this.iIiIiiiiIIiii(IiiiiiiiIIIII++);
        }
        this.iIiiIiiiiiiII = null;
        return super.ALLATORIxDEMO();
    }

    public iIiIiiiiIiIII(GameView gameView) {
        super(38, 2, IiiiIiiiiIiIi.iIIIIiiiiiIIi, gameView);
        this.ALLATORIxDEMO(-2, 0, 622, 409, IiiiIiiiiIiIi.iiIIIiiiiiiiI);
        this.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/1.png", (int)68, (int)68, (int)68, (int)68, (boolean)false), "\u5f62\u8c61\u88c5\u626e");
        this.ALLATORIxDEMO = new IIiIiiiiIiIII[5];
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.ALLATORIxDEMO.length) {
            this.ALLATORIxDEMO[IiiiiiiiIIIII] = new IIiIiiiiIiIII(IiiiiiiiIIIII == 4 ? "sc/e/38.png" : "sc/e/39.png", 2, 61 + IiiiiiiiIIIII, iiIIiiiiIiiII.iIiIiiiiiiIIi, null, IiiiiiiiIIIII == 0 ? "\u7279\u6548" : (IiiiiiiiIIIII == 1 ? "\u88c5\u9970\u54c1" : (IiiiiiiiIIIII == 2 ? "\u8db3\u8ff9 " : (IiiiiiiiIIIII == 3 ? "\u7fc5\u8180 " : (IiiiiiiiIIIII == 4 ? "\u9526 \u7ee3" : "")))), (IiiiIiiiiIiIi)this);
            if (IiiiiiiiIIIII == 4) {
                this.ALLATORIxDEMO[IiiiiiiiIIIII].setForeground(Color.black);
                this.ALLATORIxDEMO[IiiiiiiiIIIII].setFont(iiIIiiiiIiiII.IIiiiiiiiIIIi);
                this.ALLATORIxDEMO[IiiiiiiiIIIII].setBounds(58, 21, 95, 33);
                this.ALLATORIxDEMO[IiiiiiiiIIIII].setOffsetTexts(iiIIiiiiIiiII.IIiiiiiiiIIII);
                this.ALLATORIxDEMO[IiiiiiiiIIIII].setKeep(true);
            } else {
                this.ALLATORIxDEMO[IiiiiiiiIIIII].setOffsetTexts(iiIIiiiiIiiII.IiIIIiiiiiiiI);
                this.ALLATORIxDEMO[IiiiiiiiIIIII].setBounds(328 + 65 * IiiiiiiiIIIII, 62, 63, 24);
            }
            this.add((Component)this.ALLATORIxDEMO[IiiiiiiiIIIII++]);
        }
        this.iiiIiiiiiiiIi = new IIIiIiiiIiIII[4];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iiiIiiiiiiiIi.length) {
            this.iiiIiiiiiiiIi[IiiiiiiiIIIII] = new IIIiIiiiIiIII(this, 0, IiiiiiiiIIIII);
            this.iiiIiiiiiiiIi[IiiiiiiiIIIII].setBounds(53, 112 + IiiiiiiiIIIII * 42, 42, 42);
            this.add((Component)this.iiiIiiiiiiiIi[IiiiiiiiIIIII++]);
        }
        this.IiiiiiiiIIIII = IiIIIiiiiIIiI.ALLATORIxDEMO((int)46, (int)60, (int)115, (int)23, (int)0, (Color)iiIIiiiiIiiII.ALLATORIxDEMO((String)"#cFFFFFF"), (Font)iiIIiiiiIiiII.IIIiiiiiIIiII);
        this.IiiiiiiiIIIII.setText("\u9526\u7ee3\u9884\u89c8");
        this.add(this.IiiiiiiiIIIII);
        this.iIiIiiiiIiIii = new IIiIiiiiIiIII[6];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iIiIiiiiIiIii.length) {
            this.iIiIiiiiIiIii[IiiiiiiiIIIII] = new IIiIiiiiIiIII(null, 1, 71 + IiiiiiiiIIIII, iiIIiiiiIiiII.iiiiIiiiIiiII, iiIIiiiiIiiII.IIiiiiiiIiiII, IiiiiiiiIIIII == 2 ? "\u4fdd\u5b58\u5f62\u8c61" : (IiiiiiiiIIIII == 3 ? "\u4e00\u952e\u5378\u9664" : (IiiiiiiiIIIII == 4 ? "\u6350\u732e" : (IiiiiiiiIIIII == 5 ? "\u591a\u5b9d\u9601\u8d2d\u4e70" : ""))), (IiiiIiiiiIiIi)this);
            if (IiiiiiiiIIIII == 0) {
                this.iIiIiiiiIiIii[IiiiiiiiIIIII].setImage("sc/e/32.png");
                this.iIiIiiiiIiIii[IiiiiiiiIIIII].setBounds(184, 322, 11, 15);
            } else if (IiiiiiiiIIIII == 1) {
                this.iIiIiiiiIiIii[IiiiiiiiIIIII].setImage("sc/e/34.png");
                this.iIiIiiiiIiIii[IiiiiiiiIIIII].setBounds(213, 322, 11, 15);
            } else if (IiiiiiiiIIIII == 2) {
                this.iIiIiiiiIiIii[IiiiiiiiIIIII].setImage("sc/e/26.png");
                this.iIiIiiiiIiIii[IiiiiiiiIIIII].setBounds(76, 367, 99, 25);
            } else if (IiiiiiiiIIIII == 3) {
                this.iIiIiiiiIiIii[IiiiiiiiIIIII].setImage("sc/e/26.png");
                this.iIiIiiiiIiIii[IiiiiiiiIIIII].setBounds(198, 367, 99, 25);
            } else if (IiiiiiiiIIIII == 4) {
                this.iIiIiiiiIiIii[IiiiiiiiIIIII].setImage("sc/e/7.png");
                this.iIiIiiiiIiIii[IiiiiiiiIIIII].setBounds(323, 367, 59, 25);
            } else if (IiiiiiiiIIIII == 5) {
                this.iIiIiiiiIiIii[IiiiiiiiIIIII].setForeground(Color.black);
                this.iIiIiiiiIiIii[IiiiiiiiIIIII].setImage("sc/e/46.png");
                this.iIiIiiiiIiIii[IiiiiiiiIIIII].setBounds(476, 367, 119, 25);
            }
            this.add((Component)this.iIiIiiiiIiIii[IiiiiiiiIIIII++]);
        }
        this.iiiiIiiiIiiII = new IIIiiiiiIiIiI[6];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iiiiIiiiIiiII.length) {
            this.iiiiIiiiIiiII[IiiiiiiiIIIII] = new IIIiiiiiIiIiI();
            if (IiiiiiiiIIIII == 0) {
                this.iiiiIiiiIiiII[IiiiiiiiIIIII].iIiIiiiiIIiii("sc/d/34.png");
                this.iiiiIiiiIiiII[IiiiiiiiIIIII].setBounds(46, 60, 205, 23);
            } else if (IiiiiiiiIIIII == 1) {
                this.iiiiIiiiIiiII[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/24.png", (int)2, (int)2, (int)2, (int)2, (boolean)false));
                this.iiiiIiiiIiiII[IiiiiiiiIIIII].setBounds(103, 100, 200, 250);
            } else if (IiiiiiiiIIIII == 2) {
                this.iiiiIiiiIiiII[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/19.png", (int)5, (int)5, (int)5, (int)5, (boolean)false));
                this.iiiiIiiiIiiII[IiiiiiiiIIIII].setBounds(326, 94, 258, 258);
            } else if (IiiiiiiiIIIII == 3) {
                this.iiiiIiiiIiiII[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/36.png", (int)30, (int)30, (int)30, (int)30, (boolean)false));
                this.iiiiIiiiIiiII[IiiiiiiiIIIII].setBounds(46, 85, 266, 274);
            } else if (IiiiiiiiIIIII == 4) {
                this.iiiiIiiiIiiII[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/36.png", (int)30, (int)30, (int)30, (int)30, (boolean)false));
                this.iiiiIiiiIiiII[IiiiiiiiIIIII].setBounds(321, 85, 273, 274);
            } else if (IiiiiiiiIIIII == 5) {
                this.iiiiIiiiIiiII[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/35.png", (int)80, (int)10, (int)80, (int)10, (boolean)false));
                this.iiiiIiiiIiiII[IiiiiiiiIIIII].setBounds(29, 36, 578, 20);
            }
            this.add((Component)this.iiiiIiiiIiiII[IiiiiiiiIIIII]);
            if (IiiiiiiiIIIII == 2) {
                IIiiIiiiIiiiI[] IiiiiiiiIIIII2 = new IIiiIiiiIiiiI[2];
                int IiiiiiiiIIIII3 = 0;
                while (IiiiiiiiIIIII3 < IiiiiiiiIIIII2.length) {
                    IiiiiiiiIIIII2[IiiiiiiiIIIII3] = new IIiiIiiiIiiiI(IiiiiiiiIIIII3 == 0 ? "sc/e/47.png" : "sc/e/48.png", 1, IiiiiiiiIIIII3, (IiiiIiiiiIiIi)this);
                    if (IiiiiiiiIIIII3 == 0) {
                        IiiiiiiiIIIII2[IiiiiiiiIIIII3].setBounds(583, 307, 18, 18);
                    } else {
                        IiiiiiiiIIIII2[IiiiiiiiIIIII3].setBounds(583, 327, 18, 18);
                    }
                    this.add((Component)IiiiiiiiIIIII2[IiiiiiiiIIIII3++]);
                }
                this.IIiiIiiiIIiIi = new IiIIIiiiiIiIi(5, (IiiiIiiiiIiIi)this, 5, 5, 51, 51, 0, 0, 327, 96);
                this.IIiiIiiiIIiIi.ALLATORIxDEMO(IIIIIiiiIiiII.iiiIiiiiiiIIi((String)"sc/d/18.png"));
                this.IIiiIiiiIIiIi.ALLATORIxDEMO(IiiiiiiiIIIII2, 1);
                this.add((Component)this.IIiiIiiiIIiIi);
            }
            ++IiiiiiiiIIIII;
        }
    }

    public void iIiIiiiiIIiii(int type) {
        if (IIIiIiiiIiIII.ALLATORIxDEMO((IIIiIiiiIiIII)this.iiiIiiiiiiiIi[type]).ALLATORIxDEMO() == 0) {
            return;
        }
        BigDecimal IiiiiiiiIIIII = new BigDecimal(IIIiIiiiIiIII.ALLATORIxDEMO((IIIiIiiiIiIII)this.iiiIiiiiiiiIi[type]).ALLATORIxDEMO());
        IIIiIiiiIiIII.ALLATORIxDEMO((IIIiIiiiIiIII)this.iiiIiiiiiiiIi[type]).ALLATORIxDEMO(0, null);
        if (type == 3) {
            Goodstable IiiiiiiiIIIII2 = this.ALLATORIxDEMO().getGood(IiiiiiiiIIIII);
            if (IiiiiiiiIIIII2 == null) return;
            this.iIiiIiiiiiiII = this.iIiiIiiiiiiII.ALLATORIxDEMO("tx/" + IiiiiiiiIIIII2.getSkin() + "0");
            this.iIiiIiiiiiiII = this.iIiiIiiiiiiII.ALLATORIxDEMO("tx/" + IiiiiiiiIIIII2.getSkin() + "1");
            return;
        }
        RoleTxBean IiiiiiiiIIIII3 = this.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII.intValue());
        if (IiiiiiiiIIIII3 == null) return;
        this.iIiiIiiiiiiII = this.iIiiIiiiiiiII.ALLATORIxDEMO("tx/tx" + IiiiiiiiIIIII3.getRdId());
    }

    public void iiiIiiiiiiIIi(boolean is) {
        if (this.iiIiiiiiiiIii == 0) {
            this.iiIiiiiiiiIii = is ? 4 : 7;
            return;
        }
        if (this.iiIiiiiiiiIii == 1) {
            this.iiIiiiiiiiIii = is ? 5 : 4;
            return;
        }
        if (this.iiIiiiiiiiIii == 2) {
            this.iiIiiiiiiiIii = is ? 6 : 5;
            return;
        }
        if (this.iiIiiiiiiiIii == 3) {
            this.iiIiiiiiiiIii = is ? 7 : 6;
            return;
        }
        if (this.iiIiiiiiiiIii == 4) {
            this.iiIiiiiiiiIii = is ? 1 : 0;
            return;
        }
        if (this.iiIiiiiiiiIii == 5) {
            this.iiIiiiiiiiIii = is ? 2 : 1;
            return;
        }
        if (this.iiIiiiiiiiIii == 6) {
            this.iiIiiiiiiiIii = is ? 3 : 2;
            return;
        }
        if (this.iiIiiiiiiiIii != 7) return;
        this.iiIiiiiiiiIii = is ? 0 : 3;
    }

    public void iIiIiiiiIIiii() {
        if (this.ALLATORIxDEMO() == null) {
            return;
        }
        this.iiIiiiiiiiIii = 0;
        this.iiiIiiiiiiIIi();
        this.iiiIiiiiiiIIi(0);
        super.iIiIiiiiIIiii();
    }

    public void iiiIiiiiiiIIi() {
        long IiiiiiiiIIIII;
        RoleData IiiiiiiiIIIII2 = this.ALLATORIxDEMO();
        long IiiiiiiiIIIII3 = IiiiiiiiIIIII2.getLoginResult().getSpecies_id().longValue();
        Goodstable IiiiiiiiIIIII4 = IiiiiiiiIIIII2.getGoodEquip(IiiiiiiiIIIII2.goodChoses[0]);
        if (IiiiiiiiIIIII4 != null && (IiiiiiiiIIIII = (long)GameUtil.ALLATORIxDEMO((int)Integer.parseInt(IiiiiiiiIIIII4.getSkin()))) != 0L) {
            IiiiiiiiIIIII3 = (IiiiiiiiIIIII += 18L) << 32 | IiiiiiiiIIIII3;
        }
        this.iIiiIiiiiiiII = this.iIiiIiiiiiiII == null ? iiiiiiiiiiIiI.ALLATORIxDEMO((long)IiiiiiiiIIIII3, (int)2, (int)1, null) : iiiiiiiiiiIiI.ALLATORIxDEMO((com.xy.w.IiiiIiiiiIiIi)this.iIiiIiiiiiiII, (int)1, (String)String.valueOf(IiiiiiiiIIIII3));
        int IiiiiiiiIIIII22 = 0;
        while (IiiiiiiiIIIII22 < 4) {
            this.iIiIiiiiIIiii(IiiiiiiiIIIII22++);
        }
        List IiiiiiiiIIIII32 = IiiiiiiiIIIII2.getPackRecord().getPutTX();
        int IiiiiiiiIIIII5 = 0;
        int IiiiiiiiIIIII6 = IiiiiiiiIIIII32 != null ? IiiiiiiiIIIII32.size() : 0;
        while (IiiiiiiiIIIII5 < IiiiiiiiIIIII6) {
            RoleTxBean IiiiiiiiIIIII7 = this.ALLATORIxDEMO().ALLATORIxDEMO(Integer.parseInt((String)IiiiiiiiIIIII32.get(IiiiiiiiIIIII5)));
            if (IiiiiiiiIIIII7 != null) {
                this.ALLATORIxDEMO(new BigDecimal(IiiiiiiiIIIII7.getGid()), IiiiiiiiIIIII7.getRdType() - 1);
            }
            ++IiiiiiiiIIIII5;
        }
        Goodstable IiiiiiiiIIIII42 = IiiiiiiiIIIII2.getGoodEquip(IiiiiiiiIIIII2.goodChoses[12]);
        if (IiiiiiiiIIIII42 == null) return;
        this.ALLATORIxDEMO(IiiiiiiiIIIII42.getRgid(), 3);
    }
}
