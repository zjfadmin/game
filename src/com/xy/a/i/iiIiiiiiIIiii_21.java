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
import com.xy.richtext.RichLabel;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import com.xy.v.IiiiiiiiiIIII;
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

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class iiIiiiiiIIiii
extends IiiiIiiiiIiIi {
    private iiIiIiiiiIiii iiiIiiiiiiiIi;
    private IIIiiiiiiiiIi[] iIiiIiiiiiiII;
    private iIIiIiiiIiiIi IIiiIiiiIIiIi;
    private IIIiiiiiiiiIi[] iIiIiiiiIiIii;
    private IIIiiiiiIiIiI[] IiIIIiiiiIiiI;
    private RichLabel iiIiiiiiiiIii;
    private JLabel[] IiiiiiiiIIIII;
    private BigDecimal ALLATORIxDEMO = new BigDecimal(1000000);

    public long ALLATORIxDEMO(int id) {
        long IiiiiiiiIIIII = 0L;
        int IiiiiiiiIIIII2 = 0;
        while (IiiiiiiiIIIII2 < this.iIiIiiiiIiIii.length) {
            if (this.iIiIiiiiIiIii[IiiiiiiiIIIII2].iIiIiiiiIIiii() == id) {
                ++IiiiiiiiIIIII;
            }
            ++IiiiiiiiIIIII2;
        }
        return IiiiiiiiIIIII;
    }

    public void ALLATORIxDEMO(IIIiiiiiiiiIi starSoulXHView, MouseEvent e) {
        long IiiiiiiiIIIII;
        boolean IiiiiiiiIIIII2 = false;
        int IiiiiiiiIIIII3 = 0;
        while (IiiiiiiiIIIII3 < this.iIiIiiiiIiIii.length) {
            if (this.iIiIiiiiIiIii[IiiiiiiiIIIII3] == starSoulXHView) {
                IiiiiiiiIIIII2 = true;
            }
            ++IiiiiiiiIIIII3;
        }
        if (IiiiiiiiIIIII2) {
            if (e.getButton() != 3) return;
            if (starSoulXHView.iIiIiiiiIIiii() == 0) {
                return;
            }
            starSoulXHView.ALLATORIxDEMO(0, null);
            return;
        }
        long IiiiiiiiIIIII22 = this.ALLATORIxDEMO(starSoulXHView.iIiIiiiiIIiii());
        if (IiiiiiiiIIIII22 >= (IiiiiiiiIIIII = this.ALLATORIxDEMO().getPackRecord().getStarSoulType(starSoulXHView.iIiIiiiiIIiii()) / 10000L)) {
            return;
        }
        IIIiiiiiiiiIi IiiiiiiiIIIII4 = this.ALLATORIxDEMO(starSoulXHView.iIiIiiiiIIiii());
        if (IiiiiiiiIIIII4 == null) {
            return;
        }
        IiiiiiiiIIIII4.ALLATORIxDEMO(1L);
    }

    public IIIiiiiiiiiIi ALLATORIxDEMO(int id) {
        IIIiiiiiiiiIi IiiiiiiiIIIII = null;
        int IiiiiiiiIIIII2 = 0;
        while (IiiiiiiiIIIII2 < this.iIiIiiiiIiIii.length) {
            if (this.iIiIiiiiIiIii[IiiiiiiiIIIII2].iIiIiiiiIIiii() == 0 && IiiiiiiiIIIII == null) {
                IiiiiiiiIIIII = this.iIiIiiiiIiIii[IiiiiiiiIIIII2];
            }
            ++IiiiiiiiIIIII2;
        }
        if (IiiiiiiiIIIII == null) {
            IiiiiiiiIIIII = this.iIiIiiiiIiIii[1];
        }
        if (IiiiiiiiIIIII == null) return IiiiiiiiIIIII;
        IiiiiiiiIIIII.ALLATORIxDEMO(id, this.ALLATORIxDEMO());
        return IiiiiiiiIIIII;
    }

    public void iIiIiiiiIIiii() {
        this.iIiIiiiiIIiIi();
        super.iIiIiiiiIIiii();
    }

    public void iIiIiiiiIIiIi() {
        RoleData IiiiiiiiIIIII = this.ALLATORIxDEMO();
        int IiiiiiiiIIIII2 = 0;
        while (IiiiiiiiIIIII2 < this.iIiiIiiiiiiII.length) {
            long IiiiiiiiIIIII3 = IiiiiiiiIIIII.getPackRecord().getStarSoulType(this.iIiiIiiiiiiII[IiiiiiiiIIIII2].iIiIiiiiIIiii()) / 10000L;
            this.iIiiIiiiiiiII[IiiiiiiiIIIII2++].ALLATORIxDEMO(IiiiiiiiIIIII3);
        }
        IiiiiiiiIIIII2 = 0;
        while (IiiiiiiiIIIII2 < this.iIiIiiiiIiIii.length) {
            IIIiiiiiiiiIi iIIiiiiiiiiIi = this.iIiIiiiiIiIii[IiiiiiiiIIIII2];
            ++IiiiiiiiIIIII2;
            iIIiiiiiiiiIi.ALLATORIxDEMO(0, null);
        }
    }

    public void iiiIiiiiiiIIi() {
        ArrayList<BigDecimal> IiiiiiiiIIIII = new ArrayList<BigDecimal>();
        int IiiiiiiiIIIII22 = 0;
        while (IiiiiiiiIIIII22 < this.iIiIiiiiIiIii.length) {
            if (this.iIiIiiiiIiIii[IiiiiiiiIIIII22].iIiIiiiiIIiii() != 0) {
                IiiiiiiiIIIII.add(new BigDecimal(this.iIiIiiiiIiIii[IiiiiiiiIIIII22].iIiIiiiiIIiii()));
            }
            ++IiiiiiiiIIIII22;
        }
        if (IiiiiiiiIIIII.size() != 2) {
            return;
        }
        SuitOperBean IiiiiiiiIIIII22 = new SuitOperBean();
        IiiiiiiiIIIII22.setType(111);
        IiiiiiiiIIIII22.setGoods(IiiiiiiiIIIII);
        String IiiiiiiiIIIII3 = Agreement.getSendTextAES((String)"suitoperate", (String)com.xy.v.iiIiiiiiIIiii.ALLATORIxDEMO().toJson(IiiiiiiiIIIII22));
        this.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII3);
    }

    public iiIiiiiiIIiii(GameView gameView) {
        super(139, 2, IiiiIiiiiIiIi.iIIIIiiiiiIIi, gameView);
        this.ALLATORIxDEMO(-2, 0, 382, 495, IiiiIiiiiIiIi.iiIIIiiiiiiiI);
        this.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/1.png", (int)68, (int)68, (int)68, (int)68, (boolean)false), "\u91cd\u70bc");
        this.iiIiiiiiiiIii = new RichLabel("", iiIIiiiiIiiII.iIIiiiiiiIIII);
        this.iiIiiiiiiiIii.setTextSize("#c000000\u91cd\u70bc\u540e\uff0c\u968f\u673a\u751f\u6210\u4e00\u9897\u66f4\u9ad8\u7ea7\u7684\u661f\u9b42\u6216\u540c\u7ea7\u661f\u9b42\u3002", 300);
        this.iiIiiiiiiiIii.setBounds(56, 350, this.iiIiiiiiiiIii.getWidth(), this.iiIiiiiiiiIii.getHeight());
        this.add((Component)this.iiIiiiiiiiIii);
        this.iiiIiiiiiiiIi = new iiIiIiiiiIiii("sc/e/7.png", 1, 35, iiIIiiiiIiiII.iiiiIiiiIiiII, iiIIiiiiIiiII.IIiiiiiiIiiII, "\u91cd\u70bc", (IiiiIiiiiIiIi)this);
        this.iiiIiiiiiiiIi.setBounds(270, 443, 59, 25);
        this.add((Component)this.iiiIiiiiiiiIi);
        this.IiiiiiiiIIIII = new JLabel[2];
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IiiiiiiiIIIII.length) {
            this.IiiiiiiiIIIII[IiiiiiiiIIIII] = IiIIIiiiiIIiI.ALLATORIxDEMO((int)47, (int)18, (int)300, (int)19, (int)10, (Color)iiIIiiiiIiiII.ALLATORIxDEMO((String)"#c000000"), (Font)iiIIiiiiIiiII.iiiiIiiiIiiII);
            this.IiiiiiiiIIIII[IiiiiiiiIIIII].setText(IiiiiiiiIIIII == 0 ? "\u53ea\u80fd\u4f7f\u7528\u4e24\u9897\u540c\u7ea7\u661f\u9b42\u8fdb\u884c\u91cd\u70bc\u3002" : (IiiiiiiiIIIII == 1 ? "\u6d88\u8017\u91d1\u94b1" : ""));
            this.add(this.IiiiiiiiIIIII[IiiiiiiiIIIII]);
            if (IiiiiiiiIIIII == 1) {
                this.IiiiiiiiIIIII[IiiiiiiiIIIII].setBounds(84, 446, 72, 19);
            }
            ++IiiiiiiiIIIII;
        }
        this.IIiiIiiiIIiIi = IiIIIiiiiIIiI.ALLATORIxDEMO((int)156, (int)446, (int)104, (int)19, (int)10, (Color)Color.white, (Font)iiIIiiiiIiiII.iIIIiiiiIIIii);
        this.IIiiIiiiIIiIi.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/17.png", (int)6, (int)6, (int)6, (int)6, (boolean)false));
        this.add((Component)this.IIiiIiiiIIiIi);
        iiIIiiiiIiiII.ALLATORIxDEMO((JLabel)this.IIiiIiiiIIiIi, (long)this.ALLATORIxDEMO.longValue());
        this.iIiIiiiiIiIii = new IIIiiiiiiiiIi[2];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iIiIiiiiIiIii.length) {
            this.iIiIiiiiIiIii[IiiiiiiiIIIII] = new IIIiiiiiiiiIi(0, null, true, null, (IiiiIiiiiIiIi)this);
            this.iIiIiiiiIiIii[IiiiiiiiIIIII].setBounds(86 + IiiiiiiiIIIII * 67, 377, 51, 51);
            this.add((Component)this.iIiIiiiiIiIii[IiiiiiiiIIIII++]);
        }
        this.IiIIIiiiiIiiI = new IIIiiiiiIiIiI[9];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IiIIIiiiiIiiI.length) {
            this.IiIIIiiiiIiiI[IiiiiiiiIIIII] = new IIIiiiiiIiIiI();
            this.add((Component)this.IiIIIiiiiIiiI[IiiiiiiiIIIII]);
            if (IiiiiiiiIIIII == 0) {
                this.IiIIIiiiiIiiI[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/19.png", (int)5, (int)5, (int)5, (int)5, (boolean)false));
                this.IiIIIiiiiIiiI[IiiiiiiiIIIII].setBounds(46, 37, 309, 309);
            } else if (IiiiiiiiIIIII >= 1 && IiiiiiiiIIIII <= 3) {
                this.IiIIIiiiiIiiI[IiiiiiiiIIIII].iIiIiiiiIIiii("sc/d/4.png");
                if (IiiiiiiiIIIII == 1 || IiiiiiiiIIIII == 2) {
                    this.IiIIIiiiiIiiI[IiiiiiiiIIIII].setBounds(83 + (IiiiiiiiIIIII - 1) * 67, 374, 59, 57);
                } else if (IiiiiiiiIIIII == 3) {
                    this.IiIIIiiiiIiiI[IiiiiiiiIIIII].setBounds(269, 373, 59, 57);
                }
            } else if (IiiiiiiiIIIII >= 4 && IiiiiiiiIIIII <= 6) {
                this.IiIIIiiiiIiiI[IiiiiiiiIIIII].iIiIiiiiIIiii("sc/d/30.png");
                if (IiiiiiiiIIIII == 4 || IiiiiiiiIIIII == 5) {
                    this.IiIIIiiiiIiiI[IiiiiiiiIIIII].setBounds(84 + (IiiiiiiiIIIII - 4) * 67, 431, 58, 1);
                } else if (IiiiiiiiIIIII == 6) {
                    this.IiIIIiiiiIiiI[IiiiiiiiIIIII].setBounds(270, 430, 58, 1);
                }
            } else if (IiiiiiiiIIIII == 7) {
                this.IiIIIiiiiIiiI[IiiiiiiiIIIII].iIiIiiiiIIiii("sc/d/73.png");
                this.IiIIIiiiiIiiI[IiiiiiiiIIIII].setBounds(224, 383, 34, 38);
            } else if (IiiiiiiiIIIII == 8) {
                this.IiIIIiiiiIiiI[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/36.png", (int)20, (int)20, (int)20, (int)20, (boolean)false));
                this.IiIIIiiiiIiiI[IiiiiiiiIIIII].setBounds(46, 345, 310, 130);
            }
            ++IiiiiiiiIIIII;
        }
        IiiiiiiiiIIII IiiiiiiiIIIII2 = this.ALLATORIxDEMO();
        Image IiiiiiiiIIIII3 = IIIIIiiiIiiII.iiiIiiiiiiIIi((String)"sc/d/18.png");
        this.iIiiIiiiiiiII = new IIIiiiiiiiiIi[36];
        int IiiiiiiiIIIII4 = 0;
        while (IiiiiiiiIIIII4 < this.iIiiIiiiiiiII.length) {
            this.iIiiIiiiiiiII[IiiiiiiiIIIII4] = new IIIiiiiiiiiIi(IiiiiiiiIIIII4 + 1, IiiiiiiiIIIII3, true, IiiiiiiiIIIII2, (IiiiIiiiiIiIi)this);
            this.iIiiIiiiiiiII[IiiiiiiiIIIII4].setBounds(47 + IiiiiiiiIIIII4 % 6 * 51, 39 + IiiiiiiiIIIII4 / 6 * 51, 51, 51);
            this.add((Component)this.iIiiIiiiiiiII[IiiiiiiiIIIII4++]);
        }
    }
}
