/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.q.iiIIIiiiiiIII
 *  com.xy.a.q.iiIiIiiiiIiIi
 *  com.xy.i.IiiiiiiiiIIII
 *  com.xy.q.IiIIIiiiiIIiI
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.q.iIIiIiiiIiiIi
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.readbean.Eshop
 *  com.xy.readbean.RoleTxBean
 *  com.xy.text.GameView
 *  com.xy.v.iIiIIiiiIiiiI
 *  com.xy.w.IIIIIiiiIiiII
 *  com.xy.w.IIIiiiiiIiIiI
 *  com.xy.w.IiiiIiiiiIiIi
 *  com.xy.w.iiiiiiiiiiIiI
 */
package com.xy.a.q;

import com.xy.a.q.iiIIIiiiiiIII;
import com.xy.a.q.iiIiIiiiiIiIi;
import com.xy.i.IiiiiiiiiIIII;
import com.xy.q.IiIIIiiiiIIiI;
import com.xy.q.IiiiIiiiiIiIi;
import com.xy.q.iIIiIiiiIiiIi;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.readbean.Eshop;
import com.xy.readbean.RoleTxBean;
import com.xy.text.GameView;
import com.xy.v.iIiIIiiiIiiiI;
import com.xy.w.IIIIIiiiIiiII;
import com.xy.w.IIIiiiiiIiIiI;
import com.xy.w.iiiiiiiiiiIiI;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.util.List;
import javax.swing.JLabel;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class iiIiiiiiIIiiI
extends IiiiIiiiiIiIi {
    private int iiIIIiiiiiiiI = 1;
    private int IiIiiiiiIIIII;
    private JLabel iiIiIiiiiIIIi;
    private IiiiiiiiiIIII[] iiiiIiiiIiiII;
    private int iiiIiiiiiiiIi = 1;
    private iiIiIiiiiIiIi[] iIiiIiiiiiiII;
    private com.xy.w.IiiiIiiiiIiIi IIiiIiiiIIiIi;
    private int iIiIiiiiIiIii;
    private iIIiIiiiIiiIi IiIIIiiiiIiiI;
    private IIIiiiiiIiIiI iiIiiiiiiiIii;
    private Eshop[] IiiiiiiiIIIII;
    private IiiiiiiiiIIII[] ALLATORIxDEMO;

    public void IiiIiiiiiiIiI(int type) {
        Eshop IiiiiiiiIIIII = this.IiiiiiiiIIIII[type];
        if (IiiiiiiiIIIII == null) {
            return;
        }
        this.IiiiiiiiIIIII[type] = null;
        RoleTxBean IiiiiiiiIIIII2 = this.ALLATORIxDEMO().ALLATORIxDEMO(-Integer.parseInt(IiiiiiiiIIIII.getEshopiid()));
        if (IiiiiiiiIIIII2 != null) {
            this.IIiiIiiiIIiIi = this.IIiiIiiiIIiIi.ALLATORIxDEMO("tx/tx" + IiiiiiiiIIIII2.getRdId());
        }
        int IiiiiiiiIIIII3 = 0;
        int IiiiiiiiIIIII4 = 0;
        while (IiiiiiiiIIIII4 < this.IiiiiiiiIIIII.length) {
            if (this.IiiiiiiiIIIII[IiiiiiiiIIIII4] != null) {
                ++IiiiiiiiIIIII3;
            }
            ++IiiiiiiiIIIII4;
        }
        this.iiIiIiiiiIIIi.setText("\u88c5\u626e\u6570\uff1a" + IiiiiiiiIIIII3);
    }

    public void ALLATORIxDEMO(Eshop eshop) {
        if (eshop == null) {
            return;
        }
        int IiiiiiiiIIIII = eshop.getEshoptype().equals("11") ? 0 : (eshop.getEshoptype().equals("12") ? 1 : 2);
        RoleTxBean IiiiiiiiIIIII2 = this.ALLATORIxDEMO().ALLATORIxDEMO(-Integer.parseInt(eshop.getEshopiid()));
        if (IiiiiiiiIIIII2 != null) {
            IiiiiiiiIIIII = IiiiiiiiIIIII2.getRdType() - 1;
            this.IiiIiiiiiiIiI(IiiiiiiiIIIII);
            this.IiiiiiiiIIIII[IiiiiiiiIIIII] = eshop;
            com.xy.w.IiiiIiiiiIiIi IiiiiiiiIIIII3 = iiiiiiiiiiIiI.ALLATORIxDEMO((String)("tx/tx" + IiiiiiiiIIIII2.getRdId()), (int)-2, (int)(IiiiiiiiIIIII2.getRdStatues() - IiiiiiiiIIIII2.getRdType()), null);
            this.IIiiIiiiIIiIi = this.IIiiIiiiIIiIi.ALLATORIxDEMO(IiiiiiiiIIIII3);
        }
        int IiiiiiiiIIIII4 = 0;
        int IiiiiiiiIIIII5 = 0;
        while (IiiiiiiiIIIII5 < this.IiiiiiiiIIIII.length) {
            if (this.IiiiiiiiIIIII[IiiiiiiiIIIII5] != null) {
                ++IiiiiiiiIIIII4;
            }
            ++IiiiiiiiIIIII5;
        }
        this.iiIiIiiiiIIIi.setText("\u88c5\u626e\u6570\uff1a" + IiiiiiiiIIIII4);
    }

    public void iIiIiiiiIIiIi(int page) {
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iIiiIiiiiiiII.length) {
            this.iIiiIiiiiiiII[IiiiiiiiIIIII].ALLATORIxDEMO();
            this.iIiiIiiiiiiII[IiiiiiiiIIIII++].setVisible(false);
        }
        if (page <= 0) {
            page = 1;
        } else if (page >= this.iiiIiiiiiiiIi) {
            page = this.iiiIiiiiiiiIi;
        }
        this.iiIIIiiiiiiiI = page;
        this.IiIIIiiiiIiiI.setText(String.valueOf(this.iiIIIiiiiiiiI) + "/" + this.iiiIiiiiiiiIi);
        IiiiiiiiIIIII = 0;
        int IiiiiiiiIIIII2 = 0;
        int IiiiiiiiIIIII3 = (page - 1) * 6;
        String IiiiiiiiIIIII4 = String.valueOf(11 + this.IiIiiiiiIIIII);
        String IiiiiiiiIIIII5 = "\u4ed9\u7389";
        List IiiiiiiiIIIII6 = this.ALLATORIxDEMO().ALLATORIxDEMO();
        int IiiiiiiiIIIII7 = 0;
        while (IiiiiiiiIIIII7 < IiiiiiiiIIIII6.size()) {
            Eshop IiiiiiiiIIIII8 = (Eshop)IiiiiiiiIIIII6.get(IiiiiiiiIIIII7);
            if (IiiiiiiiIIIII8.getEshoptype().equals(IiiiiiiiIIIII4)) {
                if (IiiiiiiiIIIII >= IiiiiiiiIIIII3) {
                    iiIiIiiiiIiIi iiIiIiiiiIiIi2 = this.iIiiIiiiiiiII[IiiiiiiiIIIII2];
                    iiIiIiiiiIiIi2.ALLATORIxDEMO(IiiiiiiiIIIII8, IiiiiiiiIIIII5);
                    if (++IiiiiiiiIIIII2 >= this.iIiiIiiiiiiII.length) {
                        return;
                    }
                }
                ++IiiiiiiiIIIII;
            }
            ++IiiiiiiiIIIII7;
        }
    }

    public void iiiIiiiiiiIIi(boolean is) {
        if (this.iIiIiiiiIiIii == 0) {
            this.iIiIiiiiIiIii = is ? 4 : 7;
            return;
        }
        if (this.iIiIiiiiIiIii == 1) {
            this.iIiIiiiiIiIii = is ? 5 : 4;
            return;
        }
        if (this.iIiIiiiiIiIii == 2) {
            this.iIiIiiiiIiIii = is ? 6 : 5;
            return;
        }
        if (this.iIiIiiiiIiIii == 3) {
            this.iIiIiiiiIiIii = is ? 7 : 6;
            return;
        }
        if (this.iIiIiiiiIiIii == 4) {
            this.iIiIiiiiIiIii = is ? 1 : 0;
            return;
        }
        if (this.iIiIiiiiIiIii == 5) {
            this.iIiIiiiiIiIii = is ? 2 : 1;
            return;
        }
        if (this.iIiIiiiiIiIii == 6) {
            this.iIiIiiiiIiIii = is ? 3 : 2;
            return;
        }
        if (this.iIiIiiiiIiIii != 7) return;
        this.iIiIiiiiIiIii = is ? 0 : 3;
    }

    public void iiiIiiiiiiIIi(int id) {
        if (id == 274) {
            this.iIiIiiiiIIiIi(1);
            return;
        }
        if (id == 275) {
            this.iIiIiiiiIIiIi(this.iiiIiiiiiiiIi);
            return;
        }
        if (id == 276) {
            this.iIiIiiiiIIiIi(this.iiIIIiiiiiiiI - 1);
            return;
        }
        if (id == 277) {
            this.iIiIiiiiIIiIi(this.iiIIIiiiiiiiI + 1);
            return;
        }
        if (id == 278) {
            this.iiiIiiiiiiIIi(true);
            return;
        }
        if (id == 279) {
            this.iiiIiiiiiiIIi(false);
            return;
        }
        if (id == 280) {
            this.IiiIiiiiiiIiI(0);
            this.IiiIiiiiiiIiI(1);
            this.IiiIiiiiiiIiI(2);
            return;
        }
        if (id != 281) return;
        ((iiIIIiiiiiIII)this.ALLATORIxDEMO().iiiIiiiiiiIIi(51)).ALLATORIxDEMO(this.IiiiiiiiIIIII);
    }

    public int iiiIiiiiiiIIi() {
        int IiiiiiiiIIIII = 0;
        String IiiiiiiiIIIII2 = String.valueOf(11 + this.IiIiiiiiIIIII);
        List IiiiiiiiIIIII3 = this.ALLATORIxDEMO().ALLATORIxDEMO();
        int IiiiiiiiIIIII4 = 0;
        while (IiiiiiiiIIIII4 < IiiiiiiiIIIII3.size()) {
            if (((Eshop)IiiiiiiiIIIII3.get(IiiiiiiiIIIII4)).getEshoptype().equals(IiiiiiiiIIIII2)) {
                ++IiiiiiiiIIIII;
            }
            ++IiiiiiiiIIIII4;
        }
        return IiiiiiiiIIIII;
    }

    public void iIiIiiiiIIiIi() {
        this.IIiiIiiiIIiIi = null;
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IiiiiiiiIIIII.length) {
            this.IiiiiiiiIIIII[IiiiiiiiIIIII++] = null;
        }
        this.iiIiIiiiiIIIi.setText("\u88c5\u626e\u6570\uff1a0");
    }

    protected void paintChildren(Graphics g) {
        super.paintChildren(g);
        if (this.IIiiIiiiIIiIi == null) return;
        this.IIiiIiiiIIiIi.ALLATORIxDEMO(g, 158, 292, this.iIiIiiiiIiIii, iIiIIiiiIiiiI.ALLATORIxDEMO());
    }

    public void iIiIiiiiIIiii(int type) {
        this.IiIiiiiiIIIII = type;
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.ALLATORIxDEMO.length) {
            this.ALLATORIxDEMO[IiiiiiiiIIIII].setKeep(IiiiiiiiIIIII == this.IiIiiiiiIIIII);
            ++IiiiiiiiIIIII;
        }
        IiiiiiiiIIIII = this.iiiIiiiiiiIIi();
        this.iiiIiiiiiiiIi = IiiiiiiiIIIII % 6 == 0 ? IiiiiiiiIIIII / 6 : IiiiiiiiIIIII / 6 + 1;
        this.iIiIiiiiIIiIi(1);
    }

    public iiIiiiiiIIiiI(GameView gameView) {
        super(-1, -1, IiiiIiiiiIiIi.iIIiIiiiiiiIi, gameView);
        this.ALLATORIxDEMO(0, 0, 682, 475, IiiiIiiiiIiIi.iIIiIiiiiiiIi);
        this.IiiiiiiiIIIII = new Eshop[3];
        this.ALLATORIxDEMO = new IiiiiiiiiIIII[3];
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.ALLATORIxDEMO.length) {
            this.ALLATORIxDEMO[IiiiiiiiIIIII] = new IiiiiiiiiIIII("sc/e/39.png", 2, 271 + IiiiiiiiIIIII, iiIIiiiiIiiII.IIiiIiiiIIiIi, null, IiiiiiiiIIIII == 0 ? "\u7279\u6548" : (IiiiiiiiIIIII == 1 ? "\u88c5\u9970\u54c1" : (IiiiiiiiIIIII == 2 ? "\u8db3\u8ff9" : "")), (IiiiIiiiiIiIi)this);
            this.ALLATORIxDEMO[IiiiiiiiIIIII].setBounds(443 + 65 * IiiiiiiiIIIII, 73, 63, 24);
            this.add((Component)this.ALLATORIxDEMO[IiiiiiiiIIIII++]);
        }
        this.iIiiIiiiiiiII = new iiIiIiiiiIiIi[6];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iIiiIiiiiiiII.length) {
            this.iIiiIiiiiiiII[IiiiiiiiIIIII] = new iiIiIiiiiIiIi((IiiiIiiiiIiIi)this);
            this.iIiiIiiiiiiII[IiiiiiiiIIIII].setBounds(284 + IiiiiiiiIIIII % 3 * 125, 96 + IiiiiiiiIIIII / 3 * 165, 115, 150);
            this.add((Component)this.iIiiIiiiiiiII[IiiiiiiiIIIII++]);
        }
        this.iiiiIiiiIiiII = new IiiiiiiiiIIII[8];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iiiiIiiiIiiII.length) {
            this.iiiiIiiiIiiII[IiiiiiiiIIIII] = new IiiiiiiiiIIII("sc/e/6.png", 1, 274 + IiiiiiiiIIIII, iiIIiiiiIiiII.iiIiiiiiiIIiI, null, IiiiiiiiIIIII == 0 ? "\u9996\u9875" : (IiiiiiiiIIIII == 1 ? "\u672b\u9875" : (IiiiiiiiIIIII == 6 ? "\u5378\u9664" : (IiiiiiiiIIIII == 7 ? "\u8bd5\u7a7f" : ""))), (IiiiIiiiiIiIi)this);
            this.iiiiIiiiIiiII[IiiiiiiiIIIII].setBounds(264 + 140 * IiiiiiiiIIIII, 435, 34, 18);
            if (IiiiiiiiIIIII == 2 || IiiiiiiiIIIII == 3) {
                if (IiiiiiiiIIIII == 2) {
                    this.iiiiIiiiIiiII[IiiiiiiiIIIII].setImage("sc/e/42.png");
                } else if (IiiiiiiiIIIII == 3) {
                    this.iiiiIiiiIiiII[IiiiiiiiIIIII].setImage("sc/e/43.png");
                }
                this.iiiiIiiiIiiII[IiiiiiiiIIIII].setBounds(301 + 82 * (IiiiiiiiIIIII - 2), 435, 18, 18);
            } else if (IiiiiiiiIIIII == 4 || IiiiiiiiIIIII == 5) {
                if (IiiiiiiiIIIII == 4) {
                    this.iiiiIiiiIiiII[IiiiiiiiIIIII].setImage("sc/e/32.png");
                } else if (IiiiiiiiIIIII == 5) {
                    this.iiiiIiiiIiiII[IiiiiiiiIIIII].setImage("sc/e/34.png");
                }
                this.iiiiIiiiIiiII[IiiiiiiiIIIII].setBounds(139 + 35 * (IiiiiiiiIIIII - 4), 353, 11, 15);
            } else if (IiiiiiiiIIIII == 6 || IiiiiiiiIIIII == 7) {
                this.iiiiIiiiIiiII[IiiiiiiiIIIII].setBounds(185 + 40 * (IiiiiiiiIIIII - 6), 391, 34, 18);
            }
            this.add((Component)this.iiiiIiiiIiiII[IiiiiiiiIIIII++]);
        }
        this.iiIiIiiiiIIIi = IiIIIiiiiIIiI.ALLATORIxDEMO((int)53, (int)392, (int)130, (int)16, (Color)Color.black, (Font)iiIIiiiiIiiII.iIiiIiiiiiiii);
        this.iiIiIiiiiIIIi.setText("\u88c5\u626e\u6570\uff1a0");
        this.iiIiIiiiiIIIi.setHorizontalAlignment(10);
        this.add(this.iiIiIiiiiIIIi);
        this.IiIIIiiiiIiiI = IiIIIiiiiIIiI.ALLATORIxDEMO((int)322, (int)435, (int)58, (int)18, (int)0, (Color)Color.white, (Font)iiIIiiiiIiiII.iIIIiiiiIIIii);
        this.IiIIIiiiiIiiI.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/17.png", (int)6, (int)6, (int)6, (int)6, (boolean)false));
        this.add((Component)this.IiIIIiiiiIiiI);
        this.iiIiiiiiiiIii = new IIIiiiiiIiIiI(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/16.png", (int)2, (int)2, (int)2, (int)2, (boolean)false));
        this.iiIiiiiiiiIii.setBounds(53, 98, 218, 292);
        this.add((Component)this.iiIiiiiiiiIii);
    }

    public void iiiIiiiiiiIIi() {
        this.IIiiIiiiIIiIi = iiiiiiiiiiIiI.ALLATORIxDEMO((String)this.ALLATORIxDEMO().getLoginResult().getSpecies_id().toString(), (int)2, (int)1, null);
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IiiiiiiiIIIII.length) {
            this.IiiiiiiiIIIII[IiiiiiiiIIIII++] = null;
        }
        this.iiIiIiiiiIIIi.setText("\u88c5\u626e\u6570\uff1a0");
        this.iIiIiiiiIIiii(0);
    }
}
