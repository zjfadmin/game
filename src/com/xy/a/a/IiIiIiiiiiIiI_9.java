/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.a.iiIiIiiiiIiIi
 *  com.xy.entity.Pal
 *  com.xy.i.IiIiIiiiiIIiI
 *  com.xy.q.IiIiIiiiiiIiI
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.readbean.PalData
 *  com.xy.v.iIiIIiiiIiiiI
 *  com.xy.w.IIIIIiiiIiiII
 *  com.xy.w.IIIiiiiiIiIiI
 *  com.xy.w.IiIiIiiiiIIiI
 */
package com.xy.a.a;

import com.xy.a.a.iiIiIiiiiIiIi;
import com.xy.entity.Pal;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.readbean.PalData;
import com.xy.v.iIiIIiiiIiiiI;
import com.xy.w.IIIIIiiiIiiII;
import com.xy.w.IIIiiiiiIiIiI;
import com.xy.w.IiIiIiiiiIIiI;
import java.awt.Component;
import java.awt.Graphics;
import java.math.BigDecimal;
import javax.swing.JComponent;

/*
 * Exception performing whole class analysis ignored.
 */
public static class IiIiIiiiiiIiI
extends JComponent {
    private IIIiiiiiIiIiI[] IiIIIiiiiIiiI;
    final /* synthetic */ iiIiIiiiiIiIi iiIiiiiiiiIii;
    private com.xy.q.IiIiIiiiiiIiI IiiiiiiiIIIII;
    private com.xy.i.IiIiIiiiiIIiI ALLATORIxDEMO;

    public IiIiIiiiiiIiI(iiIiIiiiiIiIi iiIiIiiiiIiIi2) {
        this.iiIiiiiiiiIii = iiIiIiiiiIiIi2;
        this.ALLATORIxDEMO = new com.xy.i.IiIiIiiiiIIiI("sc/e/26.png", 1, 130, iiIIiiiiIiiII.iiiiIiiiIiiII, iiIIiiiiIiiII.IIiiiiiiIiiII, "\u7269\u54c1\u680f", iiIiIiiiiIiIi2.ALLATORIxDEMO());
        this.ALLATORIxDEMO.setBounds(227, 325, 99, 25);
        this.add((Component)this.ALLATORIxDEMO);
        this.IiiiiiiiIIIII = new com.xy.q.IiIiIiiiiiIiI(iiIiIiiiiIiIi2.ALLATORIxDEMO(), 3, 4, 49, 49, 9, 7, 370, 74);
        this.add((Component)this.IiiiiiiiIIIII);
        this.IiIIIiiiiIiiI = new IIIiiiiiIiIiI[28];
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IiIIIiiiiIiiI.length) {
            if (IiiiiiiiIIIII != 0 && IiiiiiiiIIIII != 1 && IiiiiiiiIIIII != 2) {
                this.IiIIIiiiiIiiI[IiiiiiiiIIIII] = new IIIiiiiiIiIiI();
                this.add((Component)this.IiIIIiiiiIiiI[IiiiiiiiIIIII]);
                if (IiiiiiiiIIIII == 0) {
                    this.IiIIIiiiiIiiI[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/35.png", (int)80, (int)10, (int)80, (int)10, (boolean)false));
                    this.IiIIIiiiiIiiI[IiiiiiiiIIIII].setBounds(188, 39, 359, 20);
                } else if (IiiiiiiiIIIII == 1) {
                    this.IiIIIiiiiIiiI[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/25.png", (int)2, (int)2, (int)2, (int)2, (boolean)false));
                    this.IiIIIiiiiIiiI[IiiiiiiiIIIII].setBounds(46, 31, 152, 21);
                } else if (IiiiiiiiIIIII == 2) {
                    this.IiIIIiiiiIiiI[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/24.png", (int)2, (int)2, (int)2, (int)2, (boolean)false));
                    this.IiIIIiiiiIiiI[IiiiiiiiIIIII].setBounds(46, 31, 152, 330);
                } else if (IiiiiiiiIIIII == 3) {
                    this.IiIIIiiiiIiiI[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/16.png", (int)2, (int)2, (int)2, (int)2, (boolean)false));
                    this.IiIIIiiiiIiiI[IiiiiiiiIIIII].setBounds(205, 70, 143, 244);
                } else if (IiiiiiiiIIIII >= 4 && IiiiiiiiIIIII <= 15) {
                    if (IiiiiiiiIIIII == 4) {
                        this.IiIIIiiiiIiiI[IiiiiiiiIIIII].iIiIiiiiIIiii("sc/d/7.png");
                    } else if (IiiiiiiiIIIII == 5) {
                        this.IiIIIiiiiIiiI[IiiiiiiiIIIII].iIiIiiiiIIiii("sc/d/8.png");
                    } else if (IiiiiiiiIIIII == 6) {
                        this.IiIIIiiiiIiiI[IiiiiiiiIIIII].iIiIiiiiIIiii("sc/d/6.png");
                    } else if (IiiiiiiiIIIII == 7) {
                        this.IiIIIiiiiIiiI[IiiiiiiiIIIII].iIiIiiiiIIiii("sc/d/12.png");
                    } else if (IiiiiiiiIIIII == 8) {
                        this.IiIIIiiiiIiiI[IiiiiiiiIIIII].iIiIiiiiIIiii("sc/d/10.png");
                    } else if (IiiiiiiiIIIII == 9) {
                        this.IiIIIiiiiIiiI[IiiiiiiiIIIII].iIiIiiiiIIiii("sc/d/5.png");
                    } else if (IiiiiiiiIIIII == 10) {
                        this.IiIIIiiiiIiiI[IiiiiiiiIIIII].iIiIiiiiIIiii("sc/d/11.png");
                    } else if (IiiiiiiiIIIII == 11) {
                        this.IiIIIiiiiIiiI[IiiiiiiiIIIII].iIiIiiiiIIiii("sc/d/9.png");
                    } else if (IiiiiiiiIIIII == 12) {
                        this.IiIIIiiiiIiiI[IiiiiiiiIIIII].iIiIiiiiIIiii("sc/d/14.png");
                    } else if (IiiiiiiiIIIII == 13) {
                        this.IiIIIiiiiIiiI[IiiiiiiiIIIII].iIiIiiiiIIiii("sc/d/15.png");
                    } else if (IiiiiiiiIIIII == 14) {
                        this.IiIIIiiiiIiiI[IiiiiiiiIIIII].iIiIiiiiIIiii("sc/d/13.png");
                    } else if (IiiiiiiiIIIII == 15) {
                        this.IiIIIiiiiIiiI[IiiiiiiiIIIII].iIiIiiiiIIiii("sc/d/13.png");
                    }
                    this.IiIIIiiiiIiiI[IiiiiiiiIIIII].setBounds(369 + (IiiiiiiiIIIII - 4) % 3 * 58, 73 + (IiiiiiiiIIIII - 4) / 3 * 56, 50, 50);
                } else if (IiiiiiiiIIIII >= 16 && IiiiiiiiIIIII <= 27) {
                    this.IiIIIiiiiIiiI[IiiiiiiiIIIII].iIiIiiiiIIiii("sc/d/4.png");
                    this.IiIIIiiiiIiiI[IiiiiiiiIIIII].setBounds(365 + (IiiiiiiiIIIII - 16) % 3 * 58, 70 + (IiiiiiiiIIIII - 16) / 3 * 56, 59, 57);
                }
            }
            ++IiiiiiiiIIIII;
        }
    }

    @Override
    protected void paintChildren(Graphics g) {
        super.paintChildren(g);
        if (this.iiIiiiiiiiIii.iiiiIiiiIiiII.IiIIIiiiiIiiI == null) return;
        this.iiIiiiiiiiIii.iiiiIiiiIiiII.IiIIIiiiiIiiI.ALLATORIxDEMO(g, 275, 270, 0, iIiIIiiiIiiiI.ALLATORIxDEMO());
    }

    public void ALLATORIxDEMO() {
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IiiiiiiiIIIII.ALLATORIxDEMO().length) {
            if (this.IiiiiiiiIIIII.ALLATORIxDEMO()[IiiiiiiiIIIII] != null) {
                this.IiiiiiiiIIIII.ALLATORIxDEMO()[IiiiiiiiIIIII].ALLATORIxDEMO();
            }
            ++IiiiiiiiIIIII;
        }
    }

    public void ALLATORIxDEMO(Pal pal, PalData palData) {
        this.ALLATORIxDEMO();
        if (pal == null) return;
        if (pal.getParts() == null) return;
        if (pal.getParts().equals("")) {
            return;
        }
        if (this.iiIiiiiiiiIii.ALLATORIxDEMO() == null) {
            return;
        }
        String[] IiiiiiiiIIIII = pal.getParts().split("\\|");
        int IiiiiiiiIIIII2 = 0;
        while (IiiiiiiiIIIII2 < IiiiiiiiIIIII.length) {
            int IiiiiiiiIIIII3 = IiiiiiiiIIIII[IiiiiiiiIIIII2].indexOf("=");
            if (IiiiiiiiIIIII3 != -1) {
                int IiiiiiiiIIIII4 = Integer.parseInt(IiiiiiiiIIIII[IiiiiiiiIIIII2].substring(0, IiiiiiiiIIIII3));
                BigDecimal IiiiiiiiIIIII5 = new BigDecimal(IiiiiiiiIIIII[IiiiiiiiIIIII2].substring(IiiiiiiiIIIII3 + 1));
                this.ALLATORIxDEMO(IiiiiiiiIIIII5, IiiiiiiiIIIII4);
            }
            ++IiiiiiiiIIIII2;
        }
    }

    public void ALLATORIxDEMO(BigDecimal id, int path) {
        IiIiIiiiiIIiI IiiiiiiiIIIII = this.IiiiiiiiIIIII.ALLATORIxDEMO()[path];
        if (IiiiiiiiIIIII == null) {
            this.IiiiiiiiIIIII.ALLATORIxDEMO()[path] = IiiiiiiiIIIII = new IiIiIiiiiIIiI();
        }
        IiiiiiiiIIIII.ALLATORIxDEMO(this.iiIiiiiiiiIii.ALLATORIxDEMO().getGood(id));
    }
}
