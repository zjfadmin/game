/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.i.IIIiiiiiiiiIi
 *  com.xy.bean.SuitOperBean
 *  com.xy.game.RoleData
 *  com.xy.i.iiIiIiiiiIiii
 *  com.xy.q.IiIIIiiiiIIiI
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.q.iIIiIiiiIiiIi
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.readbean.StarSoul
 *  com.xy.richtext.RichLabel
 *  com.xy.socket.Agreement
 *  com.xy.text.GameView
 *  com.xy.v.IiiiiiiiiIIII
 *  com.xy.v.iiIiiiiiIIiii
 *  com.xy.w.IIIIIiiiIiiII
 *  com.xy.w.IIIiiiiiIiIiI
 */
package com.xy.a.i;

import com.xy.a.i.IIIiiiiiiiiIi;
import com.xy.bean.SuitOperBean;
import com.xy.game.RoleData;
import com.xy.i.iiIiIiiiiIiii;
import com.xy.q.IiIIIiiiiIIiI;
import com.xy.q.IiiiIiiiiIiIi;
import com.xy.q.iIIiIiiiIiiIi;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.readbean.StarSoul;
import com.xy.richtext.RichLabel;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import com.xy.v.IiiiiiiiiIIII;
import com.xy.v.iiIiiiiiIIiii;
import com.xy.w.IIIIIiiiIiiII;
import com.xy.w.IIIiiiiiIiIiI;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.math.BigDecimal;
import java.util.ArrayList;
import javax.swing.JLabel;

public class IIiIIiiiIIIiI
extends IiiiIiiiiIiIi {
    private RichLabel iIiiIiiiiiiII;
    private iIIiIiiiIiiIi IIiiIiiiIIiIi;
    private IIIiiiiiiiiIi[] iIiIiiiiIiIii;
    private iiIiIiiiiIiii IiIIIiiiiIiiI;
    private IIIiiiiiIiIiI[] iiIiiiiiiiIii;
    private JLabel[] IiiiiiiiIIIII;
    private IIIiiiiiiiiIi[] ALLATORIxDEMO;

    public void iIiIiiiiIIiii() {
        this.iiiiiiiiIIiii();
        super.iIiIiiiiIIiii();
    }

    public void iiiiiiiiIIiii() {
        RoleData IiiiiiiiIIIII = this.ALLATORIxDEMO();
        int IiiiiiiiIIIII2 = 0;
        while (IiiiiiiiIIIII2 < this.iIiIiiiiIiIii.length) {
            long IiiiiiiiIIIII3 = IiiiiiiiIIIII.getPackRecord().getStarSoulType(this.iIiIiiiiIiIii[IiiiiiiiIIIII2].iIiIiiiiIIiii()) / 10000L;
            this.iIiIiiiiIiIii[IiiiiiiiIIIII2++].ALLATORIxDEMO(IiiiiiiiIIIII3);
        }
        IiiiiiiiIIIII2 = 0;
        while (IiiiiiiiIIIII2 < this.ALLATORIxDEMO.length) {
            IIIiiiiiiiiIi iIIiiiiiiiiIi = this.ALLATORIxDEMO[IiiiiiiiIIIII2];
            ++IiiiiiiiIIIII2;
            iIIiiiiiiiiIi.ALLATORIxDEMO(0, null);
        }
        this.IiiIiiiiiiIiI();
    }

    public void IiiIiiiiiiIiI() {
        long IiiiiiiiIIIII = 0L;
        int IiiiiiiiIIIII2 = 0;
        while (IiiiiiiiIIIII2 < this.ALLATORIxDEMO.length) {
            StarSoul IiiiiiiiIIIII3;
            StarSoul starSoul = IiiiiiiiIIIII3 = this.ALLATORIxDEMO[IiiiiiiiIIIII2].iIiIiiiiIIiii() != 0 ? this.ALLATORIxDEMO().ALLATORIxDEMO(this.ALLATORIxDEMO[IiiiiiiiIIIII2].iIiIiiiiIIiii()) : null;
            if (IiiiiiiiIIIII3 != null) {
                IiiiiiiiIIIII += Long.parseLong(IiiiiiiiIIIII3.getValue()) * (long)this.ALLATORIxDEMO[IiiiiiiiIIIII2].ALLATORIxDEMO();
            }
            ++IiiiiiiiIIIII2;
        }
        iiIIiiiiIiiII.ALLATORIxDEMO((JLabel)this.IIiiIiiiIIiIi, (long)IiiiiiiiIIIII);
    }

    public void ALLATORIxDEMO(IIIiiiiiiiiIi starSoulXHView, MouseEvent e) {
        boolean IiiiiiiiIIIII = false;
        int IiiiiiiiIIIII2 = 0;
        while (IiiiiiiiIIIII2 < this.ALLATORIxDEMO.length) {
            if (this.ALLATORIxDEMO[IiiiiiiiIIIII2] == starSoulXHView) {
                IiiiiiiiIIIII = true;
            }
            ++IiiiiiiiIIIII2;
        }
        if (IiiiiiiiIIIII) {
            if (e.getButton() != 3) return;
            if (starSoulXHView.iIiIiiiiIIiii() == 0) {
                return;
            }
            starSoulXHView.ALLATORIxDEMO(0, this.ALLATORIxDEMO());
            this.iiiIiiiiiiIIi();
            this.IiiIiiiiiiIiI();
            return;
        }
        RoleData IiiiiiiiIIIII22 = this.ALLATORIxDEMO();
        long IiiiiiiiIIIII3 = IiiiiiiiIIIII22.getPackRecord().getStarSoulType(starSoulXHView.iIiIiiiiIIiii()) / 10000L;
        if (IiiiiiiiIIIII3 == 0L) {
            return;
        }
        IIIiiiiiiiiIi IiiiiiiiIIIII4 = this.ALLATORIxDEMO(starSoulXHView.iIiIiiiiIIiii());
        if (IiiiiiiiIIIII4 == null) {
            return;
        }
        long IiiiiiiiIIIII5 = IiiiiiiiIIIII4.ALLATORIxDEMO();
        if (IiiiiiiiIIIII5 >= IiiiiiiiIIIII3) {
            return;
        }
        if (e.getButton() == 1) {
            IiiiiiiiIIIII3 = IiiiiiiiIIIII5 + 1L;
        }
        IiiiiiiiIIIII4.ALLATORIxDEMO(IiiiiiiiIIIII3);
        this.IiiIiiiiiiIiI();
    }

    public IIiIIiiiIIIiI(GameView gameView) {
        super(140, 2, IiiiIiiiiIiIi.iIIIIiiiiiIIi, gameView);
        this.ALLATORIxDEMO(-3, 0, 382, 485, IiiiIiiiiIiIi.iiIIIiiiiiiiI);
        this.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/1.png", (int)68, (int)68, (int)68, (int)68, (boolean)false), "\u8f6c\u5316");
        this.iIiiIiiiiiiII = new RichLabel("", iiIIiiiiIiiII.iIIiiiiiiIIII);
        this.iIiiIiiiiiiII.setTextSize("#c000000\u63d0\u793a\uff1a\u5de6\u952e\u70b9\u51fb\u9009\u4e2d1\u4e2a\uff0c\u53f3\u952e\u70b9\u51fb\u9009\u4e2d1\u7ec4\u3002", 380);
        this.iIiiIiiiiiiII.setBounds(48, 347, this.iIiiIiiiiiiII.getWidth(), this.iIiiIiiiiiiII.getHeight());
        this.add((Component)this.iIiiIiiiiiiII);
        this.IiIIIiiiiIiiI = new iiIiIiiiiIiii("sc/e/7.png", 1, 34, iiIIiiiiIiiII.iiiiIiiiIiiII, iiIIiiiiIiiII.IIiiiiiiIiiII, "\u8f6c\u5316", (IiiiIiiiiIiIi)this);
        this.IiIIIiiiiIiiI.setBounds(269, 434, 59, 25);
        this.add((Component)this.IiIIIiiiiIiiI);
        this.IiiiiiiiIIIII = new JLabel[2];
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IiiiiiiiIIIII.length) {
            this.IiiiiiiiIIIII[IiiiiiiiIIIII] = IiIIIiiiiIIiI.ALLATORIxDEMO((int)47, (int)18, (int)200, (int)19, (int)10, (Color)iiIIiiiiIiiII.ALLATORIxDEMO((String)"#c000000"), (Font)iiIIiiiiIiiII.iiiiIiiiIiiII);
            this.IiiiiiiiIIIII[IiiiiiiiIIIII].setText(IiiiiiiiIIIII == 0 ? "\u8bf7\u9009\u62e9\u8981\u8f6c\u5316\u7684\u661f\u9b42\uff1a" : (IiiiiiiiIIIII == 1 ? "\u53ef\u83b7\u5f97\u9b42\u503c" : ""));
            this.add(this.IiiiiiiiIIIII[IiiiiiiiIIIII]);
            if (IiiiiiiiIIIII == 1) {
                this.IiiiiiiiIIIII[IiiiiiiiIIIII].setBounds(65, 437, 88, 19);
            }
            ++IiiiiiiiIIIII;
        }
        this.IIiiIiiiIIiIi = IiIIIiiiiIIiI.ALLATORIxDEMO((int)154, (int)437, (int)104, (int)19, (int)10, (Color)Color.white, (Font)iiIIiiiiIiiII.iIIIiiiiIIIii);
        this.IIiiIiiiIIiIi.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/17.png", (int)6, (int)6, (int)6, (int)6, (boolean)false));
        this.add((Component)this.IIiiIiiiIIiIi);
        this.iiIiiiiiiiIii = new IIIiiiiiIiIiI[2];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iiIiiiiiiiIii.length) {
            this.iiIiiiiiiiIii[IiiiiiiiIIIII] = new IIIiiiiiIiIiI();
            this.add((Component)this.iiIiiiiiiiIii[IiiiiiiiIIIII]);
            if (IiiiiiiiIIIII == 0) {
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/19.png", (int)5, (int)5, (int)5, (int)5, (boolean)false));
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].setBounds(46, 37, 309, 309);
            } else if (IiiiiiiiIIIII == 1) {
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/19.png", (int)5, (int)5, (int)5, (int)5, (boolean)false));
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].setBounds(45, 372, 309, 54);
            }
            ++IiiiiiiiIIIII;
        }
        IiiiiiiiiIIII IiiiiiiiIIIII2 = this.ALLATORIxDEMO();
        Image IiiiiiiiIIIII3 = IIIIIiiiIiiII.iiiIiiiiiiIIi((String)"sc/d/18.png");
        this.iIiIiiiiIiIii = new IIIiiiiiiiiIi[36];
        int IiiiiiiiIIIII4 = 0;
        while (IiiiiiiiIIIII4 < this.iIiIiiiiIiIii.length) {
            this.iIiIiiiiIiIii[IiiiiiiiIIIII4] = new IIIiiiiiiiiIi(IiiiiiiiIIIII4 + 1, IiiiiiiiIIIII3, true, IiiiiiiiIIIII2, (IiiiIiiiiIiIi)this);
            this.iIiIiiiiIiIii[IiiiiiiiIIIII4].setBounds(47 + IiiiiiiiIIIII4 % 6 * 51, 39 + IiiiiiiiIIIII4 / 6 * 51, 51, 51);
            this.add((Component)this.iIiIiiiiIiIii[IiiiiiiiIIIII4++]);
        }
        this.ALLATORIxDEMO = new IIIiiiiiiiiIi[6];
        IiiiiiiiIIIII4 = 0;
        while (IiiiiiiiIIIII4 < this.ALLATORIxDEMO.length) {
            this.ALLATORIxDEMO[IiiiiiiiIIIII4] = new IIIiiiiiiiiIi(0, IiiiiiiiIIIII3, true, IiiiiiiiIIIII2, (IiiiIiiiiIiIi)this);
            this.ALLATORIxDEMO[IiiiiiiiIIIII4].setBounds(46 + IiiiiiiiIIIII4 % 6 * 51, 374 + IiiiiiiiIIIII4 / 6 * 51, 51, 51);
            this.add((Component)this.ALLATORIxDEMO[IiiiiiiiIIIII4++]);
        }
    }

    public void iIiIiiiiIIiIi() {
        Object IiiiiiiiIIIII;
        ArrayList<Object> IiiiiiiiIIIII2 = new ArrayList<Object>();
        int IiiiiiiiIIIII222 = 0;
        while (IiiiiiiiIIIII222 < this.ALLATORIxDEMO.length) {
            if (this.ALLATORIxDEMO[IiiiiiiiIIIII222].iIiIiiiiIIiii() != 0) {
                IiiiiiiiIIIII = new BigDecimal(this.ALLATORIxDEMO[IiiiiiiiIIIII222].iIiIiiiiIIiii());
                int IiiiiiiiIIIII3 = this.ALLATORIxDEMO[IiiiiiiiIIIII222].ALLATORIxDEMO();
                if (IiiiiiiiIIIII3 != 0) {
                    int IiiiiiiiIIIII4 = 0;
                    while (IiiiiiiiIIIII4 < IiiiiiiiIIIII3) {
                        ++IiiiiiiiIIIII4;
                        IiiiiiiiIIIII2.add(IiiiiiiiIIIII);
                    }
                }
            }
            ++IiiiiiiiIIIII222;
        }
        if (IiiiiiiiIIIII2.size() == 0) {
            return;
        }
        SuitOperBean IiiiiiiiIIIII222 = new SuitOperBean();
        IiiiiiiiIIIII222.setType(112);
        IiiiiiiiIIIII222.setGoods(IiiiiiiiIIIII2);
        IiiiiiiiIIIII = Agreement.getSendTextAES((String)"suitoperate", (String)iiIiiiiiIIiii.ALLATORIxDEMO().toJson(IiiiiiiiIIIII222));
        this.ALLATORIxDEMO().ALLATORIxDEMO((String)IiiiiiiiIIIII);
    }

    public void iiiIiiiiiiIIi() {
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.ALLATORIxDEMO.length - 1) {
            if (this.ALLATORIxDEMO[IiiiiiiiIIIII].iIiIiiiiIIiii() == 0) {
                int IiiiiiiiIIIII2 = IiiiiiiiIIIII + 1;
                while (IiiiiiiiIIIII2 < this.ALLATORIxDEMO.length) {
                    if (this.ALLATORIxDEMO[IiiiiiiiIIIII2].iIiIiiiiIIiii() == 0) {
                        ++IiiiiiiiIIIII2;
                        continue;
                    }
                    this.ALLATORIxDEMO[IiiiiiiiIIIII].ALLATORIxDEMO(this.ALLATORIxDEMO[IiiiiiiiIIIII2].iIiIiiiiIIiii(), this.ALLATORIxDEMO());
                    this.ALLATORIxDEMO[IiiiiiiiIIIII].ALLATORIxDEMO((long)this.ALLATORIxDEMO[IiiiiiiiIIIII2].ALLATORIxDEMO());
                    this.ALLATORIxDEMO[IiiiiiiiIIIII2].ALLATORIxDEMO(0, this.ALLATORIxDEMO());
                    break;
                }
            }
            ++IiiiiiiiIIIII;
        }
    }

    public IIIiiiiiiiiIi ALLATORIxDEMO(int id) {
        IIIiiiiiiiiIi IiiiiiiiIIIII = null;
        int IiiiiiiiIIIII2 = 0;
        while (IiiiiiiiIIIII2 < this.ALLATORIxDEMO.length) {
            if (this.ALLATORIxDEMO[IiiiiiiiIIIII2].iIiIiiiiIIiii() == id) {
                return this.ALLATORIxDEMO[IiiiiiiiIIIII2];
            }
            if (this.ALLATORIxDEMO[IiiiiiiiIIIII2].iIiIiiiiIIiii() == 0 && IiiiiiiiIIIII == null) {
                IiiiiiiiIIIII = this.ALLATORIxDEMO[IiiiiiiiIIIII2];
            }
            ++IiiiiiiiIIIII2;
        }
        if (IiiiiiiiIIIII == null) return IiiiiiiiIIIII;
        IiiiiiiiIIIII.ALLATORIxDEMO(id, this.ALLATORIxDEMO());
        return IiiiiiiiIIIII;
    }
}
