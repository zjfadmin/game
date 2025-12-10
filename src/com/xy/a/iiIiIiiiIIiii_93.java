/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.i.IiIIIiiiIIiII
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.text.GameView
 *  com.xy.text.ScreenData
 */
package com.xy.a;

import com.xy.i.IiIIIiiiIIiII;
import com.xy.q.IiiiIiiiiIiIi;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.text.GameView;
import com.xy.text.ScreenData;
import java.awt.Component;

public class iiIiIiiiIIiii
extends IiiiIiiiiIiIi {
    private int IiiiiiiiIIIII;
    private IiIIIiiiIIiII[] ALLATORIxDEMO;

    public void ALLATORIxDEMO() {
        ScreenData IiiiiiiiIIIII = this.iiIIiiiiIiIIi.screenData;
        if (this.IiiiiiiiIIIII == -1) {
            this.setBounds(0, 0, 0, 0);
            return;
        }
        int IiiiiiiiIIIII2 = (int)((double)IiiiiiiiIIIII.Screen_x * 0.88);
        int IiiiiiiiIIIII3 = (int)((double)IiiiiiiiIIIII.Screen_y * 0.3);
        this.setBounds(Math.max(IiiiiiiiIIIII2, IiiiiiiiIIIII.Screen_x - 100), IiiiiiiiIIIII3, 59, this.IiiiiiiiIIIII == 0 ? 200 : 100);
    }

    public void iiiIiiiiiiIIi() {
        this.IiiiiiiiIIIII = -1;
        this.setVisible(false);
    }

    public void setVisible(boolean aFlag) {
        if (aFlag) {
            this.ALLATORIxDEMO();
        }
        super.setVisible(aFlag);
    }

    /*
     * Unable to fully structure code
     */
    public void ALLATORIxDEMO(int type, boolean ll) {
        block8: {
            block7: {
                block6: {
                    this.IiiiiiiiIIIII = type;
                    if (type != -1) break block6;
                    IiiiiiiiIIIII = 0;
                    if (true) ** GOTO lbl16
                }
                if (type != 0) break block7;
                IiiiiiiiIIIII = 0;
                if (true) ** GOTO lbl25
            }
            if (type != 1) break block8;
            IiiiiiiiIIIII = 0;
            IiiiiiiiIIIII = 0;
            if (true) ** GOTO lbl34
            do {
                this.ALLATORIxDEMO[IiiiiiiiIIIII++].setVisible(false);
lbl16:
                // 2 sources

            } while (IiiiiiiiIIIII < this.ALLATORIxDEMO.length);
            break block8;
            do {
                if (ll && (this.ALLATORIxDEMO[IiiiiiiiIIIII].ALLATORIxDEMO() == 1 || this.ALLATORIxDEMO[IiiiiiiiIIIII].ALLATORIxDEMO() == 2 || this.ALLATORIxDEMO[IiiiiiiiIIIII].ALLATORIxDEMO() == 4 || this.ALLATORIxDEMO[IiiiiiiiIIIII].ALLATORIxDEMO() == 6 || this.ALLATORIxDEMO[IiiiiiiiIIIII].ALLATORIxDEMO() == 7)) {
                    this.ALLATORIxDEMO(this.ALLATORIxDEMO[IiiiiiiiIIIII], -1);
                } else {
                    this.ALLATORIxDEMO(this.ALLATORIxDEMO[IiiiiiiiIIIII], 1);
                }
                this.ALLATORIxDEMO[IiiiiiiiIIIII].setBounds(0, 25 * IiiiiiiiIIIII, 59, 25);
                this.ALLATORIxDEMO[IiiiiiiiIIIII++].setVisible(true);
lbl25:
                // 2 sources

            } while (IiiiiiiiIIIII < this.ALLATORIxDEMO.length);
            break block8;
            do {
                if (this.ALLATORIxDEMO[IiiiiiiiIIIII].ALLATORIxDEMO() < 5 || this.ALLATORIxDEMO[IiiiiiiiIIIII].ALLATORIxDEMO() > 8) {
                    this.ALLATORIxDEMO(this.ALLATORIxDEMO[IiiiiiiiIIIII], 1);
                    this.ALLATORIxDEMO[IiiiiiiiIIIII].setBounds(0, IiiiiiiiIIIII * 25, 59, 25);
                    ++IiiiiiiiIIIII;
                    this.ALLATORIxDEMO[IiiiiiiiIIIII].setVisible(true);
                }
                ++IiiiiiiiIIIII;
lbl34:
                // 2 sources

            } while (IiiiiiiiIIIII < this.ALLATORIxDEMO.length);
        }
        this.setVisible(true);
    }

    public void ALLATORIxDEMO(IiIIIiiiIIiII battleBtn, int type) {
        if (type == battleBtn.getBtn()) {
            return;
        }
        if (type == 1) {
            battleBtn.setBtn(1, "sc/e/7.png");
            return;
        }
        battleBtn.setBtn(-1, "sc/e/55.png");
    }

    public iiIiIiiiIIiii(GameView gameView) {
        super(-1, -1, IiiiIiiiiIiIi.iIIIIiiiiiIIi, gameView);
        this.ALLATORIxDEMO(0, 0, 0, 0, IiiiIiiiiIiIi.iIIiIiiiiiiIi);
        this.ALLATORIxDEMO = new IiIIIiiiIIiII[8];
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.ALLATORIxDEMO.length) {
            this.ALLATORIxDEMO[IiiiiiiiIIIII] = new IiIIIiiiIIiII("sc/e/7.png", 1, IiiiiiiiIIIII + 1, iiIIiiiiIiiII.iiiiIiiiIiiII, iiIIiiiiIiiII.IIiiiiiiIiiII, IiiiiiiiIIIII == 0 ? "\u6cd5\u672f" : (IiiiiiiiIIIII == 1 ? "\u9053\u5177" : (IiiiiiiiIIIII == 2 ? "\u9632\u5fa1" : (IiiiiiiiIIIII == 3 ? "\u4fdd\u62a4" : (IiiiiiiiIIIII == 4 ? "\u53ec\u5524" : (IiiiiiiiIIIII == 5 ? "\u53ec\u56de" : (IiiiiiiiIIIII == 6 ? "\u6355\u6349" : "\u9003\u8dd1")))))), (IiiiIiiiiIiIi)this);
            this.ALLATORIxDEMO[IiiiiiiiIIIII].setBounds(0, 25 * IiiiiiiiIIIII, 59, 25);
            this.add((Component)this.ALLATORIxDEMO[IiiiiiiiIIIII++]);
        }
    }
}
