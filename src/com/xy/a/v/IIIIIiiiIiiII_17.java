/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.v.IIiIiiiiIiIII
 *  com.xy.i.IIiIiiiiIiiIi
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.scene.BWDHTeam
 *  com.xy.text.GameView
 *  com.xy.v.iiiiiiiiIIIII
 *  com.xy.w.IIIIIiiiIiIii
 *  com.xy.w.IIIIIiiiIiiII
 *  com.xy.w.IIIiiiiiIiIiI
 */
package com.xy.a.v;

import com.xy.a.v.IIiIiiiiIiIII;
import com.xy.i.IIiIiiiiIiiIi;
import com.xy.q.IiiiIiiiiIiIi;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.scene.BWDHTeam;
import com.xy.text.GameView;
import com.xy.v.iiiiiiiiIIIII;
import com.xy.w.IIIIIiiiIiIii;
import com.xy.w.IIIiiiiiIiIiI;
import java.awt.Component;

public class IIIIIiiiIiiII
extends IiiiIiiiiIiIi {
    private IIiIiiiiIiIII[] iIiIiiiiIiIii;
    private int IiIIIiiiiIiiI = 0;
    private IIIIIiiiIiIii iiIiiiiiiiIii = null;
    private IIiIiiiiIiiIi IiiiiiiiIIIII;
    private IIIiiiiiIiIiI ALLATORIxDEMO;

    static /* synthetic */ void ALLATORIxDEMO(IIIIIiiiIiiII arg0, IIIIIiiiIiIii arg1) {
        arg0.iiIiiiiiiiIii = arg1;
    }

    static /* synthetic */ IIIIIiiiIiIii ALLATORIxDEMO(IIIIIiiiIiiII arg0) {
        return arg0.iiIiiiiiiiIii;
    }

    /*
     * Unable to fully structure code
     */
    private /* synthetic */ void iIiIiiiiIIiii(BWDHTeam bwdhTeam) {
        block3: {
            v0 = this.IiIIIiiiiIiiI = bwdhTeam != null ? bwdhTeam.getId() : 0;
            if (bwdhTeam != null) break block3;
            IiiiiiiiIIIII = 0;
            if (true) ** GOTO lbl11
        }
        IiiiiiiiIIIII = bwdhTeam.getRoleShows();
        IiiiiiiiIIIII = 0;
        if (true) ** GOTO lbl17
        do {
            this.iIiIiiiiIiIii[IiiiiiiiIIIII++].ALLATORIxDEMO(null);
lbl11:
            // 2 sources

        } while (IiiiiiiiIIIII < this.iIiIiiiiIiIii.length);
        this.IiiiiiiiIIIII.ALLATORIxDEMO(new String[]{"\u961f", "\u4f0d", "\u540d", "\u79f0"});
        return;
        do {
            IiiiiiiiIIIII = IiiiiiiiIIIII < IiiiiiiiIIIII.length ? IiiiiiiiIIIII[IiiiiiiiIIIII] : null;
            this.iIiIiiiiIiIii[IiiiiiiiIIIII++].ALLATORIxDEMO(IiiiiiiiIIIII);
lbl17:
            // 2 sources

        } while (IiiiiiiiIIIII < this.iIiIiiiiIiIii.length);
        IiiiiiiiIIIII = new String[bwdhTeam.getName().length()];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < IiiiiiiiIIIII.length) {
            v1 = IiiiiiiiIIIII;
            v2 = bwdhTeam.getName().substring(IiiiiiiiIIIII, IiiiiiiiIIIII + 1);
            ++IiiiiiiiIIIII;
            IiiiiiiiIIIII[v1] = v2;
        }
        this.IiiiiiiiIIIII.ALLATORIxDEMO(IiiiiiiiIIIII);
    }

    public IIIIIiiiIiiII(GameView gameView) {
        super(179, 2, IiiiIiiiiIiIi.iIIIIiiiiiIIi, gameView);
        this.ALLATORIxDEMO(-1, 0, 632, 234, IiiiIiiiiIiIi.iiIIIiiiiiiiI);
        this.ALLATORIxDEMO(com.xy.w.IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/145.png", (int)60, (int)60, (int)200, (int)100, (boolean)false), null);
        this.IiIiiiiiIIIII.setImage("sc/e/162.png");
        this.IiIiiiiiIIIII.setBounds(590, 10, 27, 27);
        this.IiiiiiiiIIIII = new IIiIiiiiIiiIi(null, -1, 0, iiIIiiiiIiiII.IiIiiiiiIiIiI, null, new String[]{"\u961f", "\u4f0d", "\u540d", "\u79f0"}, this.ALLATORIxDEMO());
        this.IiiiiiiiIIIII.setForeground(iiIIiiiiIiiII.ALLATORIxDEMO((String)"#c7D6120"));
        this.IiiiiiiiIIIII.setBounds(25, 59, 20, 120);
        this.IiiiiiiiIIIII.ALLATORIxDEMO(new iiiiiiiiIIIII(1, 20, 0, 0));
        this.add((Component)this.IiiiiiiiIIIII);
        this.iIiIiiiiIiIii = new IIiIiiiiIiIII[5];
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iIiIiiiiIiIii.length) {
            this.iIiIiiiiIiIii[IiiiiiiiIIIII] = new IIiIiiiiIiIII(this);
            this.iIiIiiiiIiIii[IiiiiiiiIIIII].setBounds(39 + 108 * IiiiiiiiIIIII, 11, 135, 200);
            this.iIiIiiiiIiIii[IiiiiiiiIIIII].setVisible(false);
            this.add((Component)this.iIiIiiiiIiIii[IiiiiiiiIIIII++]);
        }
        this.ALLATORIxDEMO = new IIIiiiiiIiIiI("sc/d/133.png");
        this.ALLATORIxDEMO.setBounds(21, 30, 29, 164);
        this.add((Component)this.ALLATORIxDEMO);
    }

    public void ALLATORIxDEMO(BWDHTeam bwdhTeam) {
        this.iIiIiiiiIIiii(bwdhTeam);
        this.ALLATORIxDEMO().iIiIiiiiIIiIi(this.iIiIiiiiIIiii());
    }

    public boolean ALLATORIxDEMO() {
        this.iIiIiiiiIIiii(null);
        return super.ALLATORIxDEMO();
    }
}
