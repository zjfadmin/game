/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.i.IIIIiiiiIIIIi
 *  com.xy.a.i.IiiIIiiiiIiii
 *  com.xy.a.i.IiiiIiiiiIIII
 *  com.xy.a.i.iIIiiiiiIIIIi
 *  com.xy.a.i.iiiiiiiiIIIII
 *  com.xy.game.RoleData
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.readbean.StarSoul
 *  com.xy.text.GameView
 *  com.xy.v.IIiiIiiiiIIiI
 *  com.xy.v.IiiiiiiiiIIII
 *  com.xy.v.iIiIIiiiIiiiI
 *  com.xy.w.IIIIIiiiIiIii
 *  com.xy.w.IIiiIiiiiIIiI
 *  com.xy.w.iiIiIiiiiiIIi
 *  com.xy.w.iiiiiiiiiiIiI
 */
package com.xy.a.i;

import com.xy.a.i.IIIIiiiiIIIIi;
import com.xy.a.i.IiiIIiiiiIiii;
import com.xy.a.i.IiiiIiiiiIIII;
import com.xy.a.i.iIIiiiiiIIIIi;
import com.xy.a.i.iiiiiiiiIIIII;
import com.xy.game.RoleData;
import com.xy.q.IiiiIiiiiIiIi;
import com.xy.readbean.StarSoul;
import com.xy.text.GameView;
import com.xy.v.IiiiiiiiiIIII;
import com.xy.v.iIiIIiiiIiiiI;
import com.xy.w.IIIIIiiiIiIii;
import com.xy.w.IIiiIiiiiIIiI;
import com.xy.w.iiIiIiiiiiIIi;
import com.xy.w.iiiiiiiiiiIiI;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.util.ArrayList;
import java.util.List;

public class IiIiiiiiIIIiI
extends IiiiIiiiiIiIi {
    private IIIIIiiiIiIii iiIIIiiiiiiiI;
    private long IiIiiiiiIIIII = -1L;
    private static IIIIIiiiIiIii iiIiIiiiiIIIi;
    public static IIIIIiiiIiIii iiiiIiiiIiiII;
    private int iiiIiiiiiiiIi;
    private IiiIIiiiiIiii iIiiIiiiiiiII;
    private IiiiIiiiiIIII IIiiIiiiIIiIi;
    private static IIIIIiiiIiIii iIiIiiiiIiIii;
    private iIIiiiiiIIIIi[] IiIIIiiiiIiiI;
    private IIIIIiiiIiIii iiIiiiiiiiIii;
    private List<iiiiiiiiIIIII> IiiiiiiiIIIII;
    private IIIIiiiiIIIIi ALLATORIxDEMO;

    public IIIIIiiiIiIii iIiIiiiiIIiii() {
        if (this.iiiIiiiiiiiIi == 0) {
            return null;
        }
        if (this.iiIiiiiiiiIii != null) return this.iiIiiiiiiiIii;
        this.iiIiiiiiiiIii = iiiiiiiiiiIiI.iIiIiiiiIIiii((String)("sc/bang/XPXJ" + this.iiiIiiiiiiiIi + ".tcp"));
        return this.iiIiiiiiiiIii;
    }

    static /* synthetic */ IIIIIiiiIiIii ALLATORIxDEMO() {
        return iIiIiiiiIiIii;
    }

    public void iiiIiiiiiiIIi(int type) {
        this.iiiIiiiiiiIIi();
        if (type == -1) {
            type = this.iiiIiiiiiiiIi == 0 ? 1 : this.iiiIiiiiiiiIi;
        }
        this.iIiIiiiiIIiii(type);
        if (this.ALLATORIxDEMO().iIiIiiiiIIiii(this.iIiIiiiiIIiii()) != null) return;
        this.ALLATORIxDEMO().iIiIiiiiIIiIi(this.iIiIiiiiIIiii());
    }

    public void iIiIiiiiIIiii(int XJIndex) {
        this.iiIiiiiiiiIii = this.iiiIiiiiiiiIi == XJIndex ? this.iiIiiiiiiiIii : null;
        this.iiiIiiiiiiiIi = XJIndex;
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IiiiiiiiIIIII.size()) {
            this.IiiiiiiiIIIII.get(++IiiiiiiiIIIII).ALLATORIxDEMO(0, false, null);
        }
        StarSoul starSoul = IiiiiiiiIIIII = XJIndex != 0 ? this.ALLATORIxDEMO().ALLATORIxDEMO(10000 + XJIndex) : null;
        if (IiiiiiiiIIIII == null) {
            return;
        }
        long IiiiiiiiIIIII2 = this.ALLATORIxDEMO().getPackRecord().getStarSoulType(IiiiiiiiIIIII.getId());
        String[] IiiiiiiiIIIII3 = IiiiiiiiIIIII.getValue().split("\\|");
        int IiiiiiiiIIIII4 = 0;
        while (IiiiiiiiIIIII4 < IiiiiiiiIIIII3.length) {
            iiiiiiiiIIIII IiiiiiiiIIIII5;
            iiiiiiiiIIIII iiiiiiiiIIIII2 = IiiiiiiiIIIII5 = IiiiiiiiIIIII4 < this.IiiiiiiiIIIII.size() ? this.IiiiiiiiIIIII.get(IiiiiiiiIIIII4) : null;
            if (IiiiiiiiIIIII5 == null) {
                IiiiiiiiIIIII5 = new iiiiiiiiIIIII(this);
                this.IiiiiiiiIIIII.add(IiiiiiiiIIIII5);
                this.add((Component)IiiiiiiiIIIII5);
            }
            IiiiiiiiIIIII5.ALLATORIxDEMO(Integer.parseInt(IiiiiiiiIIIII3[IiiiiiiiIIIII4]), (IiiiiiiiIIIII2 >> IiiiiiiiIIIII4 & 1L) == 1L, this.ALLATORIxDEMO(XJIndex, IiiiiiiiIIIII4++));
        }
        IIIIiiiiIIIIi.ALLATORIxDEMO((IIIIiiiiIIIIi)this.ALLATORIxDEMO, (int)(IiiIIiiiiIiii.ALLATORIxDEMO((IiiIIiiiiIiii)this.iIiiIiiiiiiII) == XJIndex ? 2 : (XJIndex > 0 && iIIiiiiiIIIIi.ALLATORIxDEMO((iIIiiiiiIIIIi)this.IiIIIiiiiIiiI[XJIndex - 1]) ? 1 : 0)));
        Point IiiiiiiiIIIII22 = this.ALLATORIxDEMO(100, XJIndex);
        this.ALLATORIxDEMO.setBounds(IiiiiiiiIIIII22.x, IiiiiiiiIIIII22.y, 48, 48);
    }

    public static Image[] ALLATORIxDEMO(int index) {
        Image[] IiiiiiiiIIIII = new Image[3];
        IIIIIiiiIiIii IiiiiiiiIIIII2 = iiiiiiiiiiIiI.ALLATORIxDEMO((String)("sc/bang/XPBtn" + index + ".tcp"), null);
        if (IiiiiiiiIIIII2 == null) return IiiiiiiiIIIII;
        IiiiiiiiIIIII[1] = iiiiiiiiiiIiI.ALLATORIxDEMO((IIiiIiiiiIIiI)IiiiiiiiIIIII2.ALLATORIxDEMO(), (iiIiIiiiiiIIi)IiiiiiiiIIIII2.ALLATORIxDEMO()[2], (IIIIIiiiIiIii)IiiiiiiiIIIII2);
        IiiiiiiiIIIII[2] = iiiiiiiiiiIiI.ALLATORIxDEMO((IIiiIiiiiIIiI)IiiiiiiiIIIII2.ALLATORIxDEMO(), (iiIiIiiiiiIIi)IiiiiiiiIIIII2.ALLATORIxDEMO()[1], (IIIIIiiiIiIii)IiiiiiiiIIIII2);
        return IiiiiiiiIIIII;
    }

    static /* synthetic */ int ALLATORIxDEMO(IiIiiiiiIIIiI arg0) {
        return arg0.iiiIiiiiiiiIi;
    }

    public IiIiiiiiIIIiI(GameView gameView) {
        super(137, 2, IiiiIiiiiIiIi.iIIIIiiiiiIIi, gameView);
        this.ALLATORIxDEMO(-1, 0, 646, 464, IiiiIiiiiIiIi.iIIiIiiiiiiIi);
        this.IIiiIiiiIIiIi = new IiiiIiiiiIIII(this, -1);
        this.IIiiIiiiIIiIi.setBounds(123, 376, 63, 58);
        this.add((Component)this.IIiiIiiiIIiIi);
        this.iIiiIiiiiiiII = new IiiIIiiiiIiii(this);
        this.iIiiIiiiiiiII.setBounds(451, 340, 112, 124);
        this.add((Component)this.iIiiIiiiiiiII);
        this.ALLATORIxDEMO = new IIIIiiiiIIIIi(this);
        this.add((Component)this.ALLATORIxDEMO);
        this.IiIIIiiiiIiiI = new iIIiiiiiIIIIi[8];
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IiIIIiiiiIiiI.length) {
            this.IiIIIiiiiIiiI[IiiiiiiiIIIII] = new iIIiiiiiIIIIi(this, IiiiiiiiIIIII + 1);
            this.add((Component)this.IiIIIiiiiIiiI[IiiiiiiiIIIII++]);
        }
        this.IiiiiiiiIIIII = new ArrayList<iiiiiiiiIIIII>();
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (iiIiIiiiiIIIi == null) {
            iiIiIiiiiIIIi = iiiiiiiiiiIiI.ALLATORIxDEMO((String)"sc/bang/XPBack.tcp", null);
            iiIiIiiiiIIIi.ALLATORIxDEMO(iIiIIiiiIiiiI.ALLATORIxDEMO(), 0);
        }
        iiIiIiiiiIIIi.ALLATORIxDEMO(g, 0, 0);
        if (this.iIiIiiiiIIiii() == null) return;
        this.iiIiiiiiiiIii.ALLATORIxDEMO(iIiIIiiiIiiiI.ALLATORIxDEMO(), 0);
        this.iiIiiiiiiiIii.ALLATORIxDEMO(g, 185, 75);
    }

    static /* synthetic */ void ALLATORIxDEMO(IIIIIiiiIiIii arg0) {
        iIiIiiiiIiIii = arg0;
    }

    static {
        iiiiIiiiIiiII = null;
    }

    protected void paintChildren(Graphics g) {
        super.paintChildren(g);
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IiIIIiiiiIiiI.length) {
            this.IiIIIiiiiIiiI[IiiiiiiiIIIII].ALLATORIxDEMO(this.iIiiIiiiiiiII.ALLATORIxDEMO(++IiiiiiiiIIIII), g);
        }
        if (IIIIiiiiIIIIi.ALLATORIxDEMO((IIIIiiiiIIIIi)this.ALLATORIxDEMO) == 2) {
            if (iiiiIiiiIiiII == null) {
                iiiiIiiiIiiII = iiiiiiiiiiIiI.ALLATORIxDEMO((String)"sc/mouse/flicker.tcp", null);
            }
            iiiiIiiiIiiII.ALLATORIxDEMO(iIiIIiiiIiiiI.ALLATORIxDEMO(), 0);
            iiiiIiiiIiiII.ALLATORIxDEMO(g, this.ALLATORIxDEMO.getX(), this.ALLATORIxDEMO.getY());
        }
        if (this.IiIiiiiiIIIII == -1L) return;
        if (this.iiIIIiiiiiiiI == null) {
            this.iiIIIiiiiiiiI = iiiiiiiiiiIiI.ALLATORIxDEMO((String)"sc/bang/XPBackYY.tcp", null);
        }
        this.iiIIIiiiiiiiI.ALLATORIxDEMO(Math.min(iIiIIiiiIiiiI.ALLATORIxDEMO() - this.IiIiiiiiIIIII, (long)(this.iiIIIiiiiiiiI.IIIiiiiiiIIiI() - 1)), 0);
        this.iiIIIiiiiiiiI.ALLATORIxDEMO(g, 322, 212);
        if (iIiIIiiiIiiiI.ALLATORIxDEMO() - this.IiIiiiiiIIIII < (long)this.iiIIIiiiiiiiI.IIIiiiiiiIIiI()) return;
        this.IiIiiiiiIIIII = -1L;
    }

    static /* synthetic */ void ALLATORIxDEMO(IiIiiiiiIIIiI arg0, long arg1) {
        arg0.IiIiiiiiIIIII = arg1;
    }

    static /* synthetic */ long ALLATORIxDEMO(IiIiiiiiIIIiI arg0) {
        return arg0.IiIiiiiiIIIII;
    }

    public Point ALLATORIxDEMO(int index, int i) {
        if (index == 1) {
            if (i == 0) {
                return new Point(389, 200);
            }
            if (i == 1) {
                return new Point(288, 249);
            }
            if (i != 2) return new Point(0, 0);
            return new Point(252, 164);
        }
        if (index == 2) {
            if (i == 0) {
                return new Point(336, 245);
            }
            if (i == 1) {
                return new Point(278, 274);
            }
            if (i == 2) {
                return new Point(233, 216);
            }
            if (i != 3) return new Point(0, 0);
            return new Point(256, 125);
        }
        if (index == 3) {
            if (i == 0) {
                return new Point(399, 144);
            }
            if (i == 1) {
                return new Point(229, 270);
            }
            if (i == 2) {
                return new Point(302, 250);
            }
            if (i == 3) {
                return new Point(250, 201);
            }
            if (i != 4) return new Point(0, 0);
            return new Point(348, 117);
        }
        if (index == 4) {
            if (i == 0) {
                return new Point(322, 244);
            }
            if (i == 1) {
                return new Point(268, 238);
            }
            if (i == 2) {
                return new Point(297, 199);
            }
            if (i == 3) {
                return new Point(390, 166);
            }
            if (i != 4) return new Point(0, 0);
            return new Point(366, 112);
        }
        if (index == 5) {
            if (i == 0) {
                return new Point(394, 143);
            }
            if (i == 1) {
                return new Point(401, 190);
            }
            if (i == 2) {
                return new Point(232, 232);
            }
            if (i == 3) {
                return new Point(309, 213);
            }
            if (i == 4) {
                return new Point(244, 179);
            }
            if (i != 5) return new Point(0, 0);
            return new Point(299, 137);
        }
        if (index == 6) {
            if (i == 0) {
                return new Point(335, 266);
            }
            if (i == 1) {
                return new Point(430, 200);
            }
            if (i == 2) {
                return new Point(354, 184);
            }
            if (i == 3) {
                return new Point(361, 130);
            }
            if (i != 4) return new Point(0, 0);
            return new Point(296, 126);
        }
        if (index == 7) {
            if (i == 0) {
                return new Point(392, 290);
            }
            if (i == 1) {
                return new Point(363, 210);
            }
            if (i == 2) {
                return new Point(291, 166);
            }
            if (i != 3) return new Point(0, 0);
            return new Point(298, 115);
        }
        if (index == 8) {
            if (i == 0) {
                return new Point(398, 142);
            }
            if (i == 1) {
                return new Point(347, 208);
            }
            if (i == 2) {
                return new Point(247, 274);
            }
            if (i != 3) return new Point(0, 0);
            return new Point(236, 214);
        }
        if (index != 100) return new Point(0, 0);
        if (i == 1) {
            return new Point(300, 85);
        }
        if (i == 2) {
            return new Point(353, 121);
        }
        if (i == 3) {
            return new Point(354, 259);
        }
        if (i == 4) {
            return new Point(300, 288);
        }
        if (i == 5) {
            return new Point(351, 260);
        }
        if (i == 6) {
            return new Point(206, 187);
        }
        if (i == 7) {
            return new Point(267, 270);
        }
        if (i != 8) return new Point(0, 0);
        return new Point(357, 257);
    }

    public void iiiIiiiiiiIIi() {
        int IiiiiiiiIIIII = 0;
        RoleData IiiiiiiiIIIII2 = this.ALLATORIxDEMO();
        IiiiiiiiiIIII IiiiiiiiIIIII3 = this.ALLATORIxDEMO();
        int IiiiiiiiIIIII4 = 0;
        while (IiiiiiiiIIIII4 < this.IiIIIiiiiIiiI.length) {
            StarSoul IiiiiiiiIIIII5 = IiiiiiiiIIIII3.ALLATORIxDEMO(10000 + iIIiiiiiIIIIi.ALLATORIxDEMO((iIIiiiiiIIIIi)this.IiIIIiiiiIiiI[IiiiiiiiIIIII4]));
            long IiiiiiiiIIIII6 = IiiiiiiiIIIII2.getPackRecord().getStarSoulType(IiiiiiiiIIIII5.getId());
            int IiiiiiiiIIIII7 = com.xy.v.IIiiIiiiiIIiI.ALLATORIxDEMO((char)'|', (String)IiiiiiiiIIIII5.getValue()) + 1;
            boolean IiiiiiiiIIIII8 = true;
            int IiiiiiiiIIIII9 = 0;
            while (IiiiiiiiIIIII9 < IiiiiiiiIIIII7) {
                if ((IiiiiiiiIIIII6 >> IiiiiiiiIIIII9 & 1L) == 1L) {
                    ++IiiiiiiiIIIII9;
                    continue;
                }
                IiiiiiiiIIIII8 = false;
                break;
            }
            if (IiiiiiiiIIIII8) {
                ++IiiiiiiiIIIII;
            }
            iIIiiiiiIIIIi.ALLATORIxDEMO((iIIiiiiiIIIIi)this.IiIIIiiiiIiiI[IiiiiiiiIIIII4], (boolean)IiiiiiiiIIIII8);
            if (this.iiiIiiiiiiiIi + 10000 == IiiiiiiiIIIII5.getId()) {
                IiiiiiiiIIIII9 = 0;
                while (IiiiiiiiIIIII9 < IiiiiiiiIIIII7) {
                    iiiiiiiiIIIII IiiiiiiiIIIII10 = IiiiiiiiIIIII9 < this.IiiiiiiiIIIII.size() ? this.IiiiiiiiIIIII.get(IiiiiiiiIIIII9) : null;
                    IiiiiiiiIIIII10.ALLATORIxDEMO(iiiiiiiiIIIII.ALLATORIxDEMO((iiiiiiiiIIIII)IiiiiiiiIIIII10), (IiiiiiiiIIIII6 >> IiiiiiiiIIIII9 & 1L) == 1L, this.ALLATORIxDEMO(this.iiiIiiiiiiiIi, IiiiiiiiIIIII9++));
                }
            }
            ++IiiiiiiiIIIII4;
        }
        this.iIiiIiiiiiiII.iIiIiiiiIIiii(IiiiiiiiIIIII);
        this.iIiiIiiiiiiII.ALLATORIxDEMO((int)IiiiiiiiIIIII2.getPackRecord().getStarSoulType(20000));
        IIIIiiiiIIIIi.ALLATORIxDEMO((IIIIiiiiIIIIi)this.ALLATORIxDEMO, (int)(IiiIIiiiiIiii.ALLATORIxDEMO((IiiIIiiiiIiii)this.iIiiIiiiiiiII) == this.iiiIiiiiiiiIi ? 2 : (this.iiiIiiiiiiiIi > 0 && iIIiiiiiIIIIi.ALLATORIxDEMO((iIIiiiiiIIIIi)this.IiIIIiiiiIiiI[this.iiiIiiiiiiiIi - 1]) ? 1 : 0)));
    }
}
