/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.i.IIiiIiiiiIIiI
 *  com.xy.text.GameChatPanel
 *  com.xy.text.GamePanel
 *  com.xy.text.GameView
 *  com.xy.text.WatchServiceRunnable
 */
package com.xy.i;

import com.xy.i.IIiiIiiiiIIiI;
import com.xy.text.GameChatPanel;
import com.xy.text.GamePanel;
import com.xy.text.GameView;
import com.xy.text.WatchServiceRunnable;
import java.awt.event.MouseEvent;

public class iiiiiiiiiiIiI
extends IIiiIiiiiIIiI {
    private GameView gameView;
    private int id;
    private GamePanel gamePanel;
    private GameChatPanel gameChatPanel;

    public void ALLATORIxDEMO(MouseEvent e, boolean isChoice) {
    }

    public void ALLATORIxDEMO(MouseEvent e) {
        if (this.gamePanel != null) {
            if (this.id == 1) {
                this.gamePanel.setShowLable();
                return;
            }
            if (this.id == 2) {
                this.gamePanel.getGameFrame().setExtendedState(1);
                return;
            }
            if (this.id == 3) {
                this.gamePanel.getGameFrame().iiiIiiiiiiIIi();
                return;
            }
            if (this.id == 4) {
                this.gamePanel.setShowTab();
                return;
            }
            if (this.id != 5) return;
            WatchServiceRunnable.ALLATORIxDEMO();
            return;
        }
        if (this.gameChatPanel != null) {
            this.gameChatPanel.ALLATORIxDEMO(this.id);
            return;
        }
        if (this.gameView == null) return;
        if (this.id == 1) {
            this.gameView.gameFrame.setGameView(this.gameView);
            return;
        }
        if (this.id != 2) return;
        this.gameView.gameFrame.ALLATORIxDEMO(this.gameView);
    }

    public iiiiiiiiiiIiI(String path, int type, int id, Object view) {
        super(path, type, null);
        this.id = id;
        if (view instanceof GamePanel) {
            this.gamePanel = (GamePanel)view;
            return;
        }
        if (view instanceof GameChatPanel) {
            this.gameChatPanel = (GameChatPanel)view;
            return;
        }
        if (!(view instanceof GameView)) return;
        this.gameView = (GameView)view;
    }
}
