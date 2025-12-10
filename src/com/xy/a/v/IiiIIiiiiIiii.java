/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.v.IIIiiiiiiiiIi
 *  com.xy.bean.RoleShow
 *  com.xy.q.IiIIIiiiiIIiI
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.scene.BWDHTeam
 *  com.xy.text.GameView
 *  com.xy.w.IIIIIiiiIiiII
 */
package com.xy.a.v;

import com.xy.a.v.IIIiiiiiiiiIi;
import com.xy.bean.RoleShow;
import com.xy.q.IiIIIiiiiIIiI;
import com.xy.q.IiiiIiiiiIiIi;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.scene.BWDHTeam;
import com.xy.text.GameView;
import com.xy.w.IIIIIiiiIiiII;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Image;
import javax.swing.JLabel;

public class IiiIIiiiiIiii
extends IiiiIiiiiIiIi {
    private Image iiIiiiiiiiIii;
    private IIIiiiiiiiiIi[] IiiiiiiiIIIII;
    private JLabel[] ALLATORIxDEMO;

    static /* synthetic */ void ALLATORIxDEMO(IiiIIiiiiIiii arg0, Image arg1) {
        arg0.iiIiiiiiiiIii = arg1;
    }

    public void ALLATORIxDEMO(BWDHTeam bwdhTeam1, BWDHTeam bwdhTeam2) {
        this.ALLATORIxDEMO[0].setText(bwdhTeam1.getName());
        this.ALLATORIxDEMO[1].setText(bwdhTeam2.getName());
        RoleShow[] IiiiiiiiIIIII = bwdhTeam1.getRoleShows();
        int IiiiiiiiIIIII2 = 0;
        while (IiiiiiiiIIIII2 < 5) {
            this.IiiiiiiiIIIII[IiiiiiiiIIIII2].ALLATORIxDEMO(IiiiiiiiIIIII2 == 0, IiiiiiiiIIIII2 < IiiiiiiiIIIII.length ? IiiiiiiiIIIII[IiiiiiiiIIIII2] : null);
            ++IiiiiiiiIIIII2;
        }
        IiiiiiiiIIIII = bwdhTeam2.getRoleShows();
        IiiiiiiiIIIII2 = 0;
        while (IiiiiiiiIIIII2 < 5) {
            this.IiiiiiiiIIIII[5 + IiiiiiiiIIIII2].ALLATORIxDEMO(IiiiiiiiIIIII2 == 0, IiiiiiiiIIIII2 < IiiiiiiiIIIII.length ? IiiiiiiiIIIII[IiiiiiiiIIIII2] : null);
            ++IiiiiiiiIIIII2;
        }
        this.ALLATORIxDEMO().iIiIiiiiIIiIi(this.iIiIiiiiIIiii());
    }

    public IiiIIiiiiIiii(GameView gameView) {
        super(177, 2, IiiiIiiiiIiIi.iIIIIiiiiiIIi, gameView);
        this.ALLATORIxDEMO(-1, 0, 794, 362, IiiiIiiiiIiIi.iiIIIiiiiiiiI);
        this.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/146.png", (int)0, (int)0, (int)0, (int)0, (boolean)false), null);
        this.IiIiiiiiIIIII.setImage("sc/e/162.png");
        this.IiIiiiiiIIIII.setBounds(764, 4, 27, 27);
        this.ALLATORIxDEMO = new JLabel[2];
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.ALLATORIxDEMO.length) {
            this.ALLATORIxDEMO[IiiiiiiiIIIII] = IiIIIiiiiIIiI.ALLATORIxDEMO((int)(99 + 400 * IiiiiiiiIIIII), (int)2, (int)200, (int)32, (Color)Color.white, (Font)iiIIiiiiIiiII.iiiIIiiiIiiII);
            this.ALLATORIxDEMO[IiiiiiiiIIIII].setHorizontalAlignment(0);
            this.add(this.ALLATORIxDEMO[IiiiiiiiIIIII++]);
        }
        this.IiiiiiiiIIIII = new IIIiiiiiiiiIi[10];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IiiiiiiiIIIII.length) {
            this.IiiiiiiiIIIII[IiiiiiiiIIIII] = new IIIiiiiiiiiIi(this);
            if (IiiiiiiiIIIII == 0 || IiiiiiiiIIIII == 1) {
                this.IiiiiiiiIIIII[IiiiiiiiIIIII].setBounds(167, 97 + 105 * IiiiiiiiIIIII, 165, 97);
            } else if (IiiiiiiiIIIII >= 2 && IiiiiiiiIIIII <= 4) {
                this.IiiiiiiiIIIII[IiiiiiiiIIIII].setBounds(7, 44 + 105 * (IiiiiiiiIIIII - 2), 165, 97);
            } else if (IiiiiiiiIIIII == 5 || IiiiiiiiIIIII == 6) {
                this.IiiiiiiiIIIII[IiiiiiiiIIIII].setBounds(452, 97 + 105 * (IiiiiiiiIIIII - 5), 165, 97);
            } else if (IiiiiiiiIIIII >= 7 && IiiiiiiiIIIII <= 9) {
                this.IiiiiiiiIIIII[IiiiiiiiIIIII].setBounds(612, 44 + 105 * (IiiiiiiiIIIII - 7), 165, 97);
            }
            this.add((Component)this.IiiiiiiiIIIII[IiiiiiiiIIIII++]);
        }
    }

    static /* synthetic */ Image ALLATORIxDEMO(IiiIIiiiiIiii arg0) {
        return arg0.iiIiiiiiiiIii;
    }
}
