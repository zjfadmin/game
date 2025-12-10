/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.q.IiIIiiiiiIIII
 *  com.xy.i.IiiiiiiiiIIII
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.socket.Agreement
 *  com.xy.text.GameView
 */
package com.xy.a.q;

import com.xy.a.q.IiIIiiiiiIIII;
import com.xy.i.IiiiiiiiiIIII;
import com.xy.q.IiiiIiiiiIiIi;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import java.awt.Component;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class iiIIIiiiiIiIi
extends IiiiIiiiiIiIi {
    private IiIIiiiiiIIII[] IiIIIiiiiIiiI;
    private IiiiiiiiiIIII iiIiiiiiiiIii;
    private int IiiiiiiiIIIII;
    private int ALLATORIxDEMO;

    public iiIIIiiiiIiIi(GameView gameView) {
        super(124, 2, IiiiIiiiiIiIi.iIIIIiiiiiIIi, gameView);
        this.ALLATORIxDEMO(-1, 0, 631, 387, IiiiIiiiiIiIi.iiIIIiiiiiiiI);
        this.iiiIiiiiiiIIi("sc/b/S291.png");
        this.IiIiiiiiIIIII.setBounds(592, 91, 25, 25);
        this.IiIIIiiiiIiiI = new IiIIiiiiiIIII[3];
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IiIIIiiiiIiiI.length) {
            this.IiIIIiiiiIiiI[IiiiiiiiIIIII] = new IiIIiiiiiIIII(this, IiiiiiiiIIIII);
            this.IiIIIiiiiIiiI[IiiiiiiiIIIII].setBounds(30, 133 + IiiiiiiiIIIII * 62, 580, 50);
            this.add((Component)this.IiIIIiiiiIiiI[IiiiiiiiIIIII++]);
        }
        this.iiIiiiiiiiIii = new IiiiiiiiiIIII("sc/e/26.png", 1, 65, iiIIiiiiIiiII.iiiiIiiiIiiII, iiIIiiiiIiiII.IIiiiiiiIiiII, "\u786e\u5b9a\u9009\u62e9", (IiiiIiiiiIiIi)this);
        this.iiIiiiiiiiIii.setBounds(267, 333, 99, 26);
        this.add((Component)this.iiIiiiiiiiIii);
    }

    static /* synthetic */ IiIIiiiiiIIII[] ALLATORIxDEMO(iiIIIiiiiIiIi arg0) {
        return arg0.IiIIIiiiiIiiI;
    }

    /*
     * Unable to fully structure code
     */
    public void iIiIiiiiIIiIi(String mes) {
        block3: {
            block2: {
                this.IiiiiiiiIIIII = mes.startsWith("B") != false ? 0 : 1;
                this.ALLATORIxDEMO = 0;
                var2_2 = mes.split("\\|");
                v0 = IiiiiiiiIIIII;
                v0[0] = v0[0].substring(1);
                if (this.IiiiiiiiIIIII != 0) break block2;
                IiiiiiiiIIIII = 0;
                if (true) ** GOTO lbl19
            }
            if (this.IiiiiiiiIIIII != 1) break block3;
            this.ALLATORIxDEMO = Integer.parseInt((String)IiiiiiiiIIIII[0]);
            IiiiiiiiIIIII = 0;
            if (true) ** GOTO lbl26
            do {
                IiiiiiiiIIIII = IiiiiiiiIIIII < ((void)IiiiiiiiIIIII).length ? IiiiiiiiIIIII[IiiiiiiiIIIII] : "";
                this.IiIIIiiiiIiiI[IiiiiiiiIIIII].ALLATORIxDEMO(IiiiiiiiIIIII.equals("") == false ? Integer.parseInt(IiiiiiiiIIIII) : 0);
                this.IiIIIiiiiIiiI[IiiiiiiiIIIII].setVisible(IiIIiiiiiIIII.ALLATORIxDEMO((IiIIiiiiiIIII)this.IiIIIiiiiIiiI[IiiiiiiiIIIII]) != 0);
                ++IiiiiiiiIIIII;
lbl19:
                // 2 sources

            } while (IiiiiiiiIIIII < 3);
            break block3;
            do {
                IiiiiiiiIIIII = IiiiiiiiIIIII + 1 < ((void)IiiiiiiiIIIII).length ? IiiiiiiiIIIII[IiiiiiiiIIIII + 1] : "";
                this.IiIIIiiiiIiiI[IiiiiiiiIIIII].ALLATORIxDEMO(IiiiiiiiIIIII.equals("") == false ? Integer.parseInt(IiiiiiiiIIIII) : 0);
                this.IiIIIiiiiIiiI[IiiiiiiiIIIII].setVisible(IiIIiiiiiIIII.ALLATORIxDEMO((IiIIiiiiiIIII)this.IiIIIiiiiIiiI[IiiiiiiiIIIII]) != 0);
                ++IiiiiiiiIIIII;
lbl26:
                // 2 sources

            } while (IiiiiiiiIIIII < 3);
        }
        this.ALLATORIxDEMO().iIiIiiiiIIiIi(this.iIiIiiiiIIiii());
    }

    public void iiiIiiiiiiIIi() {
        int IiiiiiiiIIIII = this.iiiIiiiiiiIIi();
        if (IiiiiiiiIIIII == -1) {
            this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u4f60\u8fd8\u672a\u9009\u4e2dBUFF");
            return;
        }
        if (this.IiiiiiiiIIIII == 0) {
            String IiiiiiiiIIIII2 = Agreement.getSendTextAES((String)"teamArena", (String)("B" + IiiiiiiiIIIII));
            this.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII2);
        } else if (this.IiiiiiiiIIIII == 1) {
            String IiiiiiiiIIIII3 = Agreement.getSendTextAES((String)"teamArena", (String)("T" + this.ALLATORIxDEMO + "|" + IiiiiiiiIIIII));
            this.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII3);
        }
        this.ALLATORIxDEMO().iiiIiiiiiiIIi(this.iIiIiiiiIIiii());
    }

    public int iiiIiiiiiiIIi() {
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IiIIIiiiiIiiI.length) {
            if (this.IiIIIiiiiIiiI[IiiiiiiiIIIII].getBorder() != null) {
                return IiIIiiiiiIIII.ALLATORIxDEMO((IiIIiiiiiIIII)this.IiIIIiiiiIiiI[IiiiiiiiIIIII]);
            }
            ++IiiiiiiiIIIII;
        }
        return -1;
    }
}
