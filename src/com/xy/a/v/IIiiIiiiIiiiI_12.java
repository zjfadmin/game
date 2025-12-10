/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.v.IIiIiiiiIiiIi
 *  com.xy.a.v.iiIiIiiiiiIIi
 *  com.xy.i.IIiIiiiiIiiIi
 *  com.xy.q.iIiIIiiiIiiiI
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.scene.BWDHRuleBattle
 *  com.xy.v.iiiiiiiiIIIII
 *  com.xy.w.IIIIIiiiIiiII
 *  com.xy.w.IIIiiiiiIiIiI
 */
package com.xy.a.v;

import com.xy.a.v.IIiIiiiiIiiIi;
import com.xy.a.v.iiIiIiiiiiIIi;
import com.xy.q.iIiIIiiiIiiiI;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.scene.BWDHRuleBattle;
import com.xy.v.iiiiiiiiIIIII;
import com.xy.w.IIIIIiiiIiiII;
import com.xy.w.IIIiiiiiIiIiI;
import java.awt.Component;

/*
 * Exception performing whole class analysis ignored.
 */
static class IIiiIiiiIiiiI
extends iIiIIiiiIiiiI {
    final /* synthetic */ iiIiIiiiiiIIi iiiIiiiiiiiIi;
    private IIIiiiiiIiIiI iIiiIiiiiiiII;
    private IIIiiiiiIiIiI IIiiIiiiIIiIi;
    private IIiIiiiiIiiIi[] iIiIiiiiIiIii;
    private IIIiiiiiIiIiI IiIIIiiiiIiiI;
    private com.xy.i.IIiIiiiiIiiIi[] iiIiiiiiiiIii;
    private IIIiiiiiIiIiI IiiiiiiiIIIII;
    private IIIiiiiiIiIiI ALLATORIxDEMO;

    public void ALLATORIxDEMO(int menuType, BWDHRuleBattle[] ruleBattles) {
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < 2) {
            BWDHRuleBattle IiiiiiiiIIIII2;
            BWDHRuleBattle bWDHRuleBattle = IiiiiiiiIIIII2 = ruleBattles != null && IiiiiiiiIIIII < ruleBattles.length ? ruleBattles[IiiiiiiiIIIII] : null;
            if (IiiiiiiiIIIII2 == null) {
                if (IiiiiiiiIIIII == 0) {
                    this.ALLATORIxDEMO.iIiIiiiiIIiii(menuType == 3 ? "sc/d/185.png" : "sc/d/186.png");
                } else {
                    if (menuType == 3) {
                        // empty if block
                    }
                    this.IiiiiiiiIIIII.iIiIiiiiIIiii("sc/d/186.png");
                }
                if (IiiiiiiiIIIII == 1 && menuType == 3) {
                    this.iiIiiiiiiiIii[IiiiiiiiIIIII].ALLATORIxDEMO(new String[]{"\u51a0", "\u4e9a", "\u8d5b"});
                } else if (IiiiiiiiIIIII == 0 && menuType == 3) {
                    this.iiIiiiiiiiIii[IiiiiiiiIIIII].ALLATORIxDEMO(new String[]{"\u5b63", "\u6bbf", "\u8d5b"});
                } else {
                    IIiiIiiiIiiiI iIiiIiiiIiiiI = this;
                    if (IiiiiiiiIIIII == 0) {
                        iIiiIiiiIiiiI.iiIiiiiiiiIii[IiiiiiiiIIIII].ALLATORIxDEMO(new String[]{"\u4e0a", "\u534a", "\u573a"});
                    } else {
                        iIiiIiiiIiiiI.iiIiiiiiiiIii[IiiiiiiiIIIII].ALLATORIxDEMO(new String[]{"\u4e0b", "\u534a", "\u573a"});
                    }
                }
                this.iIiIiiiiIiIii[2 * IiiiiiiiIIIII].ALLATORIxDEMO(false, null);
                this.iIiIiiiiIiIii[2 * IiiiiiiiIIIII + 1].ALLATORIxDEMO(false, null);
            } else {
                if (IiiiiiiiIIIII == 0) {
                    this.ALLATORIxDEMO.iIiIiiiiIIiii(IiiiiiiiIIIII2.getType() == 5 ? "sc/d/141.png" : (IiiiiiiiIIIII2.getType() == 5 ? "sc/d/185.png" : "sc/d/186.png"));
                } else {
                    this.IiiiiiiiIIIII.iIiIiiiiIIiii(IiiiiiiiIIIII2.getType() == 5 ? "sc/d/141.png" : (IiiiiiiiIIIII2.getType() == 5 ? "sc/d/185.png" : "sc/d/186.png"));
                }
                if (IiiiiiiiIIIII2.getType() == 5) {
                    this.iiIiiiiiiiIii[IiiiiiiiIIIII].ALLATORIxDEMO(new String[]{"\u51a0", "\u4e9a", "\u8d5b"});
                } else if (IiiiiiiiIIIII2.getType() == 4) {
                    this.iiIiiiiiiiIii[IiiiiiiiIIIII].ALLATORIxDEMO(new String[]{"\u5b63", "\u6bbf", "\u8d5b"});
                } else {
                    IIiiIiiiIiiiI iIiiIiiiIiiiI = this;
                    if (IiiiiiiiIIIII == 0) {
                        iIiiIiiiIiiiI.iiIiiiiiiiIii[IiiiiiiiIIIII].ALLATORIxDEMO(new String[]{"\u4e0a", "\u534a", "\u573a"});
                    } else {
                        iIiiIiiiIiiiI.iiIiiiiiiiIii[IiiiiiiiIIIII].ALLATORIxDEMO(new String[]{"\u4e0b", "\u534a", "\u573a"});
                    }
                }
                this.iIiIiiiiIiIii[2 * IiiiiiiiIIIII].ALLATORIxDEMO(IiiiiiiiIIIII2.getWin() == 1, IiiiiiiiIIIII2.getBwdhTeam1());
                this.iIiIiiiiIiIii[2 * IiiiiiiiIIIII + 1].ALLATORIxDEMO(IiiiiiiiIIIII2.getWin() == 2, IiiiiiiiIIIII2.getBwdhTeam2());
            }
            ++IiiiiiiiIIIII;
        }
    }

    public IIiiIiiiIiiiI(iiIiIiiiiiIIi iiIiIiiiiiIIi2) {
        this.iiiIiiiiiiiIi = iiIiIiiiiiIIi2;
        this.setBounds(0, 0, 718, 526);
        this.iiIiiiiiiiIii = new com.xy.i.IIiIiiiiIiiIi[2];
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iiIiiiiiiiIii.length) {
            String[] stringArray;
            if (IiiiiiiiIIIII == 0) {
                String[] stringArray2 = new String[3];
                stringArray2[0] = "\u4e0a";
                stringArray2[1] = "\u534a";
                stringArray = stringArray2;
                stringArray2[2] = "\u573a";
            } else {
                String[] stringArray3 = new String[3];
                stringArray3[0] = "\u4e0b";
                stringArray3[1] = "\u534a";
                stringArray = stringArray3;
                stringArray3[2] = "\u573a";
            }
            String[] IiiiiiiiIIIII2 = stringArray;
            this.iiIiiiiiiiIii[IiiiiiiiIIIII] = new com.xy.i.IIiIiiiiIiiIi(null, -1, 0, iiIIiiiiIiiII.IiIiiiiiIiIiI, null, IiiiiiiiIIIII2, iiIiIiiiiiIIi2.ALLATORIxDEMO());
            this.iiIiiiiiiiIii[IiiiiiiiIIIII].setForeground(iiIIiiiiIiiII.ALLATORIxDEMO((String)"#c7D6120"));
            if (IiiiiiiiIIIII == 0) {
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].setBounds(58, 149, 20, 120);
            } else if (IiiiiiiiIIIII == 1) {
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].setBounds(58, 338, 20, 120);
            }
            this.iiIiiiiiiiIii[IiiiiiiiIIIII].ALLATORIxDEMO(new iiiiiiiiIIIII(1, 20, 0, 0));
            this.add((Component)this.iiIiiiiiiiIii[IiiiiiiiIIIII++]);
        }
        this.iIiIiiiiIiIii = new IIiIiiiiIiiIi[4];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iIiIiiiiIiIii.length) {
            this.iIiIiiiiIiIii[IiiiiiiiIIIII] = new IIiIiiiiIiiIi(iiIiIiiiiiIIi2);
            if (IiiiiiiiIIIII == 0 || IiiiiiiiIIIII == 1) {
                this.iIiIiiiiIiIii[IiiiiiiiIIIII].setBounds(139 + IiiiiiiiIIIII * 285, 137, 165, 97);
            } else if (IiiiiiiiIIIII == 2 || IiiiiiiiIIIII == 3) {
                this.iIiIiiiiIiIii[IiiiiiiiIIIII].setBounds(139 + (IiiiiiiiIIIII - 2) * 285, 326, 165, 97);
            }
            this.add((Component)this.iIiIiiiiIiIii[IiiiiiiiIIIII++]);
        }
        this.IiIIIiiiiIiiI = new IIIiiiiiIiIiI("sc/d/133.png");
        this.iIiiIiiiiiiII = new IIIiiiiiIiIiI("sc/d/133.png");
        this.ALLATORIxDEMO = new IIIiiiiiIiIiI("sc/d/141.png");
        this.IiiiiiiiIIIII = new IIIiiiiiIiIiI("sc/d/141.png");
        this.IIiiIiiiIIiIi = new IIIiiiiiIiIiI(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/66.png", (int)50, (int)1, (int)50, (int)1, (boolean)false));
        this.IiIIIiiiiIiiI.setBounds(54, 100, 29, 164);
        this.iIiiIiiiiiiII.setBounds(54, 289, 29, 164);
        this.ALLATORIxDEMO.setBounds(321, 131, 84, 109);
        this.IiiiiiiiIIIII.setBounds(321, 320, 84, 109);
        this.IIiiIiiiIIiIi.setBounds(94, 275, 532, 2);
        this.add((Component)this.IiIIIiiiiIiiI);
        this.add((Component)this.iIiiIiiiiiiII);
        this.add((Component)this.ALLATORIxDEMO);
        this.add((Component)this.IiiiiiiiIIIII);
        this.add((Component)this.IIiiIiiiIIiIi);
    }
}
