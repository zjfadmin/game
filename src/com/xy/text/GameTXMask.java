/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.socket.Agreement
 *  com.xy.text.GameView
 *  com.xy.v.iIiIIiiiIiiiI
 *  com.xy.w.IIIIIiiiIiIii
 *  com.xy.w.IIiIiiiiIiiIi
 *  com.xy.w.iiiiiiiiiiIiI
 */
package com.xy.text;

import com.xy.socket.Agreement;
import com.xy.text.GameView;
import com.xy.v.iIiIIiiiIiiiI;
import com.xy.w.IIIIIiiiIiIii;
import com.xy.w.IIiIiiiiIiiIi;
import com.xy.w.iiiiiiiiiiIiI;
import java.awt.Graphics;

public class GameTXMask {
    private long time;
    private IIIIIiiiIiIii tx;
    private String sendMsg;
    private int sendType;
    public boolean draw;
    private GameView gameView;

    public void ALLATORIxDEMO(String type, int sendType, String sendMsg) {
        if (sendType == 0 && this.tx != null) {
            return;
        }
        IIIIIiiiIiIii IiiiiiiiIIIII = iiiiiiiiiiIiI.ALLATORIxDEMO((String)IIiIiiiiIiiIi.iIiIiiiiIIiii((String)type));
        if (IiiiiiiiIIIII == null) {
            return;
        }
        this.sendType = sendType;
        this.sendMsg = sendMsg;
        this.time = iIiIIiiiIiiiI.ALLATORIxDEMO();
        this.tx = IiiiiiiiIIIII;
        this.draw = true;
        this.gameView.getFormManagement().iIiIiiiiIIiIi();
    }

    public void ALLATORIxDEMO(Graphics g) {
        if ((long)this.tx.IIIiiiiiiIIiI() <= iIiIIiiiIiiiI.ALLATORIxDEMO() - this.time) {
            this.ALLATORIxDEMO();
            return;
        }
        this.tx.ALLATORIxDEMO(iIiIIiiiIiiiI.ALLATORIxDEMO() - this.time, 0);
        this.tx.ALLATORIxDEMO(g, this.gameView.screenData.Screen_x / 2, this.gameView.screenData.Screen_y / 2);
    }

    public synchronized void ALLATORIxDEMO() {
        this.draw = false;
        this.tx = null;
        if (this.sendType == 1) {
            String IiiiiiiiIIIII = Agreement.getSendTextAES((String)"getfivemsg", (String)this.sendMsg);
            this.gameView.getClient().ALLATORIxDEMO(IiiiiiiiIIIII);
        } else if (this.sendType == 2) {
            String IiiiiiiiIIIII = Agreement.getSendTextAES((String)"activity", (String)this.sendMsg);
            this.gameView.getClient().ALLATORIxDEMO(IiiiiiiiIIIII);
        }
        this.sendType = 0;
        this.sendMsg = null;
        this.gameView.getFormManagement().iiiIiiiiiiIIi();
    }

    public GameTXMask(GameView gameView) {
        this.gameView = gameView;
    }
}
