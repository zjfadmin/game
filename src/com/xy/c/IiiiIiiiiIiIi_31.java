/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.socket.GameClient
 *  com.xy.socket.ServerAction
 *  com.xy.text.GameMain
 */
package com.xy.c;

import com.xy.socket.GameClient;
import com.xy.socket.ServerAction;
import com.xy.text.GameMain;

public class IiiiIiiiiIiIi
implements ServerAction {
    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     */
    public void ALLATORIxDEMO(String head, String mes, GameClient gameClient) {
        block23: {
            try {
                if (!mes.startsWith(GameMain.VERSION)) {
                    gameClient.ALLATORIxDEMO();
                    return;
                }
            }
            catch (Exception IiiiiiiiIIIII) {
                IiiiiiiiIIIII.printStackTrace();
                break block23;
            }
            {
                if (mes.equals(GameMain.VERSION) != false) return;
                mes = mes.substring(GameMain.VERSION.length());
                IiiiiiiiIIIII = mes.split("\\|");
                IiiiiiiiIIIII = 0;
                ** while (IiiiiiiiIIIII < IiiiiiiiIIIII.length)
            }
lbl-1000:
            // 1 sources

            {
                if (IiiiiiiiIIIII[IiiiiiiiIIIII].startsWith("L")) {
                    gameClient.gameType = Integer.parseInt(IiiiiiiiIIIII[IiiiiiiiIIIII].substring(1));
                } else if (IiiiiiiiIIIII[IiiiiiiiIIIII].startsWith("I")) {
                    gameClient.gameTypeIndex = Integer.parseInt(IiiiiiiiIIIII[IiiiiiiiIIIII].substring(1));
                } else if (IiiiiiiiIIIII[IiiiiiiiIIIII].startsWith("i")) {
                    gameClient.gameTypeIndex2 = Integer.parseInt(IiiiiiiiIIIII[IiiiiiiiIIIII].substring(1));
                } else if (IiiiiiiiIIIII[IiiiiiiiIIIII].startsWith("TYC")) {
                    gameClient.gameNewTyc = true;
                } else if (IiiiiiiiIIIII[IiiiiiiiIIIII].startsWith("BBXY")) {
                    gameClient.gameBBXY = true;
                } else if (IiiiiiiiIIIII[IiiiiiiiIIIII].startsWith("BQ")) {
                    gameClient.bq = IiiiiiiiIIIII[IiiiiiiiIIIII].substring(2);
                } else if (IiiiiiiiIIIII[IiiiiiiiIIIII].startsWith("GN")) {
                    gameClient.gn = IiiiiiiiIIIII[IiiiiiiiIIIII].substring(2);
                } else if (IiiiiiiiIIIII[IiiiiiiiIIIII].startsWith("VALUE")) {
                    gameClient.VALUE = IiiiiiiiIIIII[IiiiiiiiIIIII].substring(5);
                } else if (IiiiiiiiIIIII[IiiiiiiiIIIII].startsWith("SZZ")) {
                    gameClient.gameSZZ = true;
                }
                ++IiiiiiiiIIIII;
                continue;
            }
lbl42:
            // 1 sources

            gameClient.drawCloud = gameClient.VALUE.indexOf("P") != -1;
            gameClient.gameMsg = gameClient.ALLATORIxDEMO(2, 8);
            gameClient.gameKey = gameClient.bq.indexOf("0") != -1;
            gameClient.gameText = gameClient.VALUE.indexOf("S") != -1;
            gameClient.gameBattle = gameClient.VALUE.indexOf("T") != -1;
            gameClient.gamePetSkill = gameClient.VALUE.indexOf("U") != -1;
            gameClient.gameBaby = gameClient.VALUE.indexOf("V") != -1;
            gameClient.gameMount = gameClient.VALUE.indexOf("X") != -1;
            gameClient.gamePawn = gameClient.VALUE.indexOf("Y") != -1;
            gameClient.gameBeau = gameClient.VALUE.indexOf("Z") != -1;
            return;
        }
    }
}
