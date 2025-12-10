/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.socket.GameClient$2
 */
package com.xy.socket;

import com.xy.socket.GameClient;

/*
 * Exception performing whole class analysis ignored.
 */
class GameClient.1
implements Runnable {
    GameClient.1() {
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     */
    @Override
    public void run() {
        try {
            if (GameClient.2.ALLATORIxDEMO(this).socketNum++ <= 10) {
                GameClient.2.ALLATORIxDEMO(this).iIiIiiiiIIiii();
                return;
            }
        }
        catch (Exception IiiiiiiiIIIII) {
            IiiiiiiiIIIII.printStackTrace();
            return;
        }
        {
            System.exit(0);
            return;
        }
    }
}
