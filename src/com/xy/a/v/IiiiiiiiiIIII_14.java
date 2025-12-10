/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.v.IiIiIiiiiIIiI
 *  com.xy.a.v.iiIiIiiiiiIIi
 *  com.xy.i.IIiIiiiiIiiIi
 *  com.xy.i.iiIiIiiiIIIiI
 *  com.xy.q.iIiIIiiiIiiiI
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.readbean.Activity
 *  com.xy.scene.BWDHTeam
 *  com.xy.socket.Agreement
 *  com.xy.v.iiiiiiiiIIIII
 *  com.xy.w.IIIIIiiiIiiII
 *  com.xy.w.IIIiiiiiIiIiI
 */
package com.xy.a.v;

import com.xy.a.v.IiIiIiiiiIIiI;
import com.xy.a.v.iiIiIiiiiiIIi;
import com.xy.i.IIiIiiiiIiiIi;
import com.xy.i.iiIiIiiiIIIiI;
import com.xy.q.iIiIIiiiIiiiI;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.readbean.Activity;
import com.xy.scene.BWDHTeam;
import com.xy.socket.Agreement;
import com.xy.v.iiiiiiiiIIIII;
import com.xy.w.IIIIIiiiIiiII;
import com.xy.w.IIIiiiiiIiIiI;
import java.awt.Component;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Exception performing whole class analysis ignored.
 */
static class IiiiiiiiiIIII
extends iIiIIiiiIiiiI {
    private int iiIiIiiiiIIIi;
    final /* synthetic */ iiIiIiiiiiIIi iiiiIiiiIiiII;
    private IIiIiiiiIiiIi[] iiiIiiiiiiiIi;
    private IiIiIiiiiIIiI[] iIiiIiiiiiiII;
    private iiIiIiiiIIIiI[] IIiiIiiiIIiIi;
    private BWDHTeam[] iIiIiiiiIiIii;
    private IIIiiiiiIiIiI IiIIIiiiiIiiI;
    private IIIiiiiiIiIiI iiIiiiiiiiIii;
    private int IiiiiiiiIIIII;
    private iiIiIiiiIIIiI[] ALLATORIxDEMO;

    public BWDHTeam ALLATORIxDEMO(int teamId) {
        int IiiiiiiiIIIII = 0;
        int IiiiiiiiIIIII2 = this.iIiIiiiiIiIii != null ? this.iIiIiiiiIiIii.length : 0;
        while (IiiiiiiiIIIII < IiiiiiiiIIIII2) {
            if (this.iIiIiiiiIiIii[IiiiiiiiIIIII].getId() == teamId) {
                return this.iIiIiiiiIiIii[IiiiiiiiIIIII];
            }
            ++IiiiiiiiIIIII;
        }
        return null;
    }

    public void ALLATORIxDEMO() {
        int IiiiiiiiIIIII = 0;
        int IiiiiiiiIIIII2 = this.iiIiIiiiiIIIi * this.IIiiIiiiIIiIi.length;
        while (IiiiiiiiIIIII < this.IIiiIiiiIIiIi.length) {
            BWDHTeam IiiiiiiiIIIII3;
            BWDHTeam bWDHTeam = IiiiiiiiIIIII3 = this.iIiIiiiiIiIii != null && IiiiiiiiIIIII2 < this.iIiIiiiiIiIii.length ? this.iIiIiiiiIiIii[IiiiiiiiIIIII2] : null;
            if (IiiiiiiiIIIII3 != null) {
                this.IIiiIiiiIIiIi[IiiiiiiiIIIII].setKeep(this.IiiiiiiiIIIII == IiiiiiiiIIIII3.getId());
            }
            ++IiiiiiiiIIIII;
            ++IiiiiiiiIIIII2;
        }
    }

    public void ALLATORIxDEMO(int id, Object data) {
        if (id != 141 && id != 142) {
            if (id != 143) return;
            int IiiiiiiiIIIII = (Integer)data;
            Activity IiiiiiiiIIIII2 = iiIiIiiiiiIIi.ALLATORIxDEMO((iiIiIiiiiiIIi)this.iiiiIiiiIiiII).ALLATORIxDEMO();
            String IiiiiiiiIIIII3 = Agreement.getSendTextAES((String)"activity", (String)(String.valueOf(IiiiiiiiIIIII2.getId()) + "|T" + IiiiiiiiIIIII));
            this.iiiiIiiiIiiII.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII3);
            return;
        }
        int IiiiiiiiIIIII = this.iIiIiiiiIiIii != null ? Math.max((this.iIiIiiiiIiIii.length - 1) / this.IIiiIiiiIIiIi.length, 0) : 0;
        int IiiiiiiiIIIII4 = this.iiIiIiiiiIIIi;
        if (id == 141) {
            IiiiiiiiIIIII4 = IiiiiiiiIIIII4 == 0 ? IiiiiiiiIIIII : IiiiiiiiIIIII4 - 1;
        } else if (id == 142) {
            int n = IiiiiiiiIIIII4 = IiiiiiiiIIIII4 == IiiiiiiiIIIII ? 0 : IiiiiiiiIIIII4 + 1;
        }
        if (IiiiiiiiIIIII4 == this.iiIiIiiiiIIIi) {
            return;
        }
        this.ALLATORIxDEMO(IiiiiiiiIIIII4);
    }

    /*
     * Unable to fully structure code
     */
    public void ALLATORIxDEMO(BWDHTeam bwdhTeam) {
        block4: {
            v0 = this.IiiiiiiiIIIII = bwdhTeam != null ? bwdhTeam.getId() : 0;
            if (bwdhTeam != null) break block4;
            IiiiiiiiIIIII = 0;
            if (true) ** GOTO lbl16
        }
        IiiiiiiiIIIII = this.ALLATORIxDEMO(bwdhTeam.getId());
        if (IiiiiiiiIIIII == null) {
            this.ALLATORIxDEMO((BWDHTeam)null);
            return;
        }
        bwdhTeam.setName(IiiiiiiiIIIII.getName());
        IiiiiiiiIIIII = bwdhTeam.getRoleShows();
        IiiiiiiiIIIII = 0;
        if (true) ** GOTO lbl23
        do {
            this.iIiiIiiiiiiII[IiiiiiiiIIIII++].ALLATORIxDEMO(null);
lbl16:
            // 2 sources

        } while (IiiiiiiiIIIII < this.iIiiIiiiiiiII.length);
        this.iiiIiiiiiiiIi[1].ALLATORIxDEMO(new String[]{"\u961f", "\u4f0d", "\u540d", "\u79f0"});
        this.ALLATORIxDEMO();
        return;
        do {
            IiiiiiiiIIIII = IiiiiiiiIIIII < IiiiiiiiIIIII.length ? IiiiiiiiIIIII[IiiiiiiiIIIII] : null;
            this.iIiiIiiiiiiII[IiiiiiiiIIIII++].ALLATORIxDEMO(IiiiiiiiIIIII);
lbl23:
            // 2 sources

        } while (IiiiiiiiIIIII < this.iIiiIiiiiiiII.length);
        IiiiiiiiIIIII = new String[bwdhTeam.getName().length()];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < IiiiiiiiIIIII.length) {
            v1 = IiiiiiiiIIIII;
            v2 = bwdhTeam.getName().substring(IiiiiiiiIIIII, IiiiiiiiIIIII + 1);
            ++IiiiiiiiIIIII;
            IiiiiiiiIIIII[v1] = v2;
        }
        this.iiiIiiiiiiiIi[1].ALLATORIxDEMO(IiiiiiiiIIIII);
        this.ALLATORIxDEMO();
    }

    public IiiiiiiiiIIII(iiIiIiiiiiIIi iiIiIiiiiiIIi2) {
        this.iiiiIiiiIiiII = iiIiIiiiiiIIi2;
        this.setBounds(0, 0, 718, 526);
        this.ALLATORIxDEMO = new iiIiIiiiIIIiI[3];
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.ALLATORIxDEMO.length) {
            this.ALLATORIxDEMO[IiiiiiiiIIIII] = new iiIiIiiiIIIiI(IiiiiiiiIIIII == 0 ? "sc/e/156.png" : "sc/e/155.png", 1, 141 + IiiiiiiiIIIII, iiIiIiiiiiIIi2.ALLATORIxDEMO());
            if (IiiiiiiiIIIII == 0) {
                this.ALLATORIxDEMO[IiiiiiiiIIIII].setBounds(76, 150, 18, 25);
            } else if (IiiiiiiiIIIII == 1) {
                this.ALLATORIxDEMO[IiiiiiiiIIIII].setBounds(631, 150, 18, 25);
            }
            this.add((Component)this.ALLATORIxDEMO[IiiiiiiiIIIII++]);
        }
        this.iiiIiiiiiiiIi = new IIiIiiiiIiiIi[2];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iiiIiiiiiiiIi.length) {
            String[] stringArray;
            if (IiiiiiiiIIIII == 0) {
                String[] stringArray2 = new String[4];
                stringArray2[0] = "\u70b9";
                stringArray2[1] = "\u51fb";
                stringArray2[2] = "\u67e5";
                stringArray = stringArray2;
                stringArray2[3] = "\u770b";
            } else {
                String[] stringArray3 = new String[4];
                stringArray3[0] = "\u961f";
                stringArray3[1] = "\u4f0d";
                stringArray3[2] = "\u540d";
                stringArray = stringArray3;
                stringArray3[3] = "\u79f0";
            }
            String[] IiiiiiiiIIIII2 = stringArray;
            this.iiiIiiiiiiiIi[IiiiiiiiIIIII] = new IIiIiiiiIiiIi(null, -1, 0, iiIIiiiiIiiII.IiIiiiiiIiIiI, null, IiiiiiiiIIIII2, iiIiIiiiiiIIi2.ALLATORIxDEMO());
            this.iiiIiiiiiiiIi[IiiiiiiiIIIII].setForeground(iiIIiiiiIiiII.ALLATORIxDEMO((String)"#c7D6120"));
            if (IiiiiiiiIIIII == 0) {
                this.iiiIiiiiiiiIi[IiiiiiiiIIIII].setBounds(58, 124, 20, 120);
            } else if (IiiiiiiiIIIII == 1) {
                this.iiiIiiiiiiiIi[IiiiiiiiIIIII].setBounds(58, 278, 20, 120);
            }
            this.iiiIiiiiiiiIi[IiiiiiiiIIIII].ALLATORIxDEMO(new iiiiiiiiIIIII(1, 20, 0, 0));
            this.add((Component)this.iiiIiiiiiiiIi[IiiiiiiiIIIII++]);
        }
        this.IIiiIiiiIIiIi = new iiIiIiiiIIIiI[16];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IIiiIiiiIIiIi.length) {
            this.IIiiIiiiIIiIi[IiiiiiiiIIIII] = new iiIiIiiiIIIiI("sc/e/163.png", 2, 143, iiIIiiiiIiiII.iIiIiiiiiiIIi, iiIIiiiiIiiII.IIiiiiiiIiiII, "", iiIiIiiiiiIIi2.ALLATORIxDEMO());
            this.IIiiIiiiIIiIi[IiiiiiiiIIIII].setBounds(94 + IiiiiiiiIIIII % 4 * 138, 109 + IiiiiiiiIIIII / 4 * 27, 121, 27);
            this.add((Component)this.IIiiIiiiIIiIi[IiiiiiiiIIIII++]);
        }
        this.iIiiIiiiiiiII = new IiIiIiiiiIIiI[5];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iIiiIiiiiiiII.length) {
            this.iIiiIiiiiiiII[IiiiiiiiIIIII] = new IiIiIiiiiIIiI(iiIiIiiiiiIIi2);
            this.iIiiIiiiiiiII[IiiiiiiiIIIII].setBounds(72 + 108 * IiiiiiiiIIIII, 230, 135, 200);
            this.iIiiIiiiiiiII[IiiiiiiiIIIII].setVisible(false);
            this.add((Component)this.iIiiIiiiiiiII[IiiiiiiiIIIII++]);
        }
        this.iiIiiiiiiiIii = new IIIiiiiiIiIiI("sc/d/133.png");
        this.iiIiiiiiiiIii.setBounds(54, 249, 29, 164);
        this.add((Component)this.iiIiiiiiiiIii);
        this.IiIIIiiiiIiiI = new IIIiiiiiIiIiI(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/66.png", (int)50, (int)1, (int)50, (int)1, (boolean)false));
        this.IiIIIiiiiIiiI.setBounds(94, 228, 532, 2);
        this.add((Component)this.IiIIIiiiiIiiI);
    }

    public void ALLATORIxDEMO(int page) {
        this.iiIiIiiiiIIIi = page;
        int IiiiiiiiIIIII = 0;
        int IiiiiiiiIIIII2 = page * this.IIiiIiiiIIiIi.length;
        while (IiiiiiiiIIIII < this.IIiiIiiiIIiIi.length) {
            BWDHTeam IiiiiiiiIIIII3 = this.iIiIiiiiIiIii != null && IiiiiiiiIIIII2 < this.iIiIiiiiIiIii.length ? this.iIiIiiiiIiIii[IiiiiiiiIIIII2] : null;
            IiiiiiiiiIIII iiiiiiiiiIIII = this;
            if (IiiiiiiiIIIII3 == null) {
                iiiiiiiiiIIII.IIiiIiiiIIiIi[IiiiiiiiIIIII].setVisible(false);
            } else {
                iiiiiiiiiIIII.IIiiIiiiIIiIi[IiiiiiiiIIIII].setText(IiiiiiiiIIIII3.getName());
                this.IIiiIiiiIIiIi[IiiiiiiiIIIII].setName(String.valueOf(IiiiiiiiIIIII3.getId()));
                this.IIiiIiiiIIiIi[IiiiiiiiIIIII].setKeep(this.IiiiiiiiIIIII == IiiiiiiiIIIII3.getId());
                this.IIiiIiiiIIiIi[IiiiiiiiIIIII].setVisible(true);
            }
            ++IiiiiiiiIIIII;
            ++IiiiiiiiIIIII2;
        }
    }

    public void ALLATORIxDEMO(BWDHTeam[] teams) {
        this.iIiIiiiiIiIii = teams;
        this.ALLATORIxDEMO(0);
    }
}
