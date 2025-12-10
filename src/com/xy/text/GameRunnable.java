/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.IIIiIiiiIiIii
 *  com.xy.battle.BattleScene
 *  com.xy.n.IIIIIiiiIiiII
 *  com.xy.richtext.ChatBox
 *  com.xy.socket.Agreement
 *  com.xy.text.GameFrame
 *  com.xy.text.GameMain
 *  com.xy.text.GameView
 *  com.xy.v.IIiIiiiiIiIII
 *  com.xy.v.iIiIIiiiIiiiI
 *  com.xy.w.IIIIIiiiIiiII
 *  com.xy.w.iiiiiiiiiiIiI
 */
package com.xy.text;

import com.xy.a.IIIiIiiiIiIii;
import com.xy.battle.BattleScene;
import com.xy.richtext.ChatBox;
import com.xy.socket.Agreement;
import com.xy.text.GameFrame;
import com.xy.text.GameMain;
import com.xy.text.GameView;
import com.xy.v.IIiIiiiiIiIII;
import com.xy.v.iIiIIiiiIiiiI;
import com.xy.w.IIIIIiiiIiiII;
import com.xy.w.iiiiiiiiiiIiI;

public class GameRunnable
implements Runnable {
    static final int DEFAULT_CHA = 1000000;
    long now = System.nanoTime();
    public int counterIndex;
    private int handleIndex;
    public static int FZ = 60000;
    static long fpsTime;
    public long interval;
    public long counterTime;
    static final int HANDLE_TIME = 500;
    public boolean counter;
    static final int HANDLE_TIME_MAX = 5000;
    long now2 = 0L;
    static int DEFAULT_FPS;
    private String timeString;
    public long total = 0L;
    public long time;

    static {
        DEFAULT_FPS = 60;
        fpsTime = (long)(Double.valueOf(1000.0) / Double.valueOf(DEFAULT_FPS) * 1000000.0);
    }

    /*
     * Enabled unnecessary exception pruning
     */
    @Override
    public void run() {
        while (true) {
            try {
                while (true) {
                    this.ALLATORIxDEMO();
                    this.timeString = iIiIIiiiIiiiI.iiiIiiiiiiIIi((long)this.total);
                    this.ALLATORIxDEMO(this.total);
                    int IiiiiiiiIIIII = GameMain.frameList.size() - 1;
                    while (IiiiiiiiIIIII >= 0) {
                        GameFrame IiiiiiiiIIIII2 = (GameFrame)GameMain.frameList.get(IiiiiiiiIIIII);
                        if (IiiiiiiiIIIII2.gameView != null) {
                            this.ALLATORIxDEMO(IiiiiiiiIIIII2);
                        }
                        --IiiiiiiiIIIII;
                    }
                    if (!this.counter) continue;
                    this.iIiIiiiiIIiii();
                }
            }
            catch (Exception IiiiiiiiIIIII) {
                IiiiiiiiIIIII.printStackTrace();
                continue;
            }
            break;
        }
    }

    public void iIiIiiiiIIiii() {
        if (this.counterIndex % 60 != 0) {
            return;
        }
        if (this.handleIndex % 2 == 0) {
            IIIIIiiiIiiII.iIiIiiiiIIiii();
        }
        if (this.handleIndex % 6 == 0) {
            iiiiiiiiiiIiI.ALLATORIxDEMO();
            IIIIIiiiIiiII.ALLATORIxDEMO();
            ChatBox.ResetAndRemove();
        }
        if (this.handleIndex % 10 != 0) return;
        System.gc();
    }

    public void setFPS(int fps) {
        if (fps == DEFAULT_FPS) {
            return;
        }
        DEFAULT_FPS = fps;
        fpsTime = (long)(Double.valueOf(1000.0) / Double.valueOf(DEFAULT_FPS) * 1000000.0);
    }

    public void ALLATORIxDEMO(GameFrame gameFrame) {
        GameView IiiiiiiiIIIII;
        int IiiiiiiiIIIII2 = gameFrame.gameList.size() - 1;
        while (IiiiiiiiIIIII2 >= 0) {
            IiiiiiiiIIIII = (GameView)gameFrame.gameList.get(IiiiiiiiIIIII2);
            if (IiiiiiiiIIIII.isDraw) {
                IiiiiiiiIIIII.mapScene.ALLATORIxDEMO(this.total);
                IiiiiiiiIIIII.mapCamera.ALLATORIxDEMO(IiiiiiiiIIIII.roleUnit.iiIiIiiiiIIIi, IiiiiiiiIIIII.roleUnit.IIiiiiiiiIIIi);
                IiiiiiiiIIIII.roleUnit.ALLATORIxDEMO(IiiiiiiiIIIII, IiiiiiiiIIIII.automation.script, this.counter);
                if (this.timeString != null) {
                    IiiiiiiiIIIII.getBaseView().iIiIiiiiIIiIi(this.timeString);
                    if (IiiiiiiiIIIII.mapScene.ALLATORIxDEMO() == 1207L) {
                        int IiiiiiiiIIIII3 = iIiIIiiiIiiiI.iiIiiiiiiiIii ? -IiiiiiiiIIIII.mapScene.ALLATORIxDEMO().getMapModel() : IiiiiiiiIIIII.mapScene.ALLATORIxDEMO().getMapModel();
                        com.xy.n.IIIIIiiiIiiII IiiiiiiiIIIII4 = IiiiiiiiIIIII.mapScene.iIiiIiiiiiiII;
                        if (IiiiiiiiIIIII3 != IiiiiiiiIIIII4.iiiIiiiiiiiIi) {
                            try {
                                IiiiiiiiIIIII.mapScene.iIiiIiiiiiiII = IIIIIiiiIiiII.ALLATORIxDEMO((int)IiiiiiiiIIIII3);
                                IIIIIiiiIiiII.ALLATORIxDEMO((com.xy.n.IIIIIiiiIiiII)IiiiiiiiIIIII4);
                            }
                            catch (Exception IiiiiiiiIIIII5) {
                                IiiiiiiiIIIII5.printStackTrace();
                            }
                        }
                    }
                }
                if (IiiiiiiiIIIII.roleData.goodChoses[14] != null && IiiiiiiiIIIII.roleUnit.ALLATORIxDEMO() == 1 && (IiiiiiiiIIIII.rlTime = (int)((long)IiiiiiiiIIIII.rlTime + this.total)) > FZ) {
                    IiiiiiiiIIIII.rlTime -= FZ;
                    String IiiiiiiiIIIII6 = Agreement.getSendTextAES((String)"rolechange", (String)("FU" + IiiiiiiiIIIII.roleData.goodChoses[14]));
                    IiiiiiiiIIIII.getClient().ALLATORIxDEMO(IiiiiiiiIIIII6);
                }
                if (this.counter) {
                    IiiiiiiiIIIII.iIiIiiiiIIiIi();
                    IiiiiiiiIIIII.automation.ALLATORIxDEMO();
                    IIIiIiiiIiIii IiiiiiiiIIIII7 = (IIIiIiiiIiIii)IiiiiiiiIIIII.getFormManagement().iIiIiiiiIIiii(121);
                    if (IiiiiiiiIIIII7 != null) {
                        IiiiiiiiIIIII7.iiiIiiiiiiIIi();
                    }
                }
            }
            --IiiiiiiiIIIII2;
        }
        if (gameFrame.gamePanel.repaintIndex >= gameFrame.gamePanel.repaintCount) {
            gameFrame.gamePanel.repaintIndex = gameFrame.gamePanel.repaintCount + 1L;
            gameFrame.gamePanel.repaint();
        } else {
            gameFrame.gamePanel.repaintIndex = gameFrame.gamePanel.repaintCount;
        }
        if (!this.counter) {
            return;
        }
        if (gameFrame.isAlwaysOnTop() && gameFrame.alwaysOnTopIndex++ > 1) {
            gameFrame.setAlwaysOnTop(false);
        }
        if (this.counterIndex % 60 != 0) {
            return;
        }
        IiiiiiiiIIIII2 = gameFrame.gameList.size() - 1;
        while (IiiiiiiiIIIII2 >= 0) {
            IiiiiiiiIIIII = (GameView)gameFrame.gameList.get(IiiiiiiiIIIII2);
            if (IiiiiiiiIIIII.isDraw) {
                IiiiiiiiIIIII.roleData.iiiiiiiiIIiii();
                if (this.handleIndex % 2 == 0) {
                    IiiiiiiiIIIII.roleData.getTaskSystem().ALLATORIxDEMO();
                    IiiiiiiiIIIII.roleData.IIiiIiiiiIiII();
                    IiiiiiiiIIIII.roleData.getPkSys().iIiIiiiiIIiii();
                    IiiiiiiiIIIII.mapScene.ALLATORIxDEMO(IiiiiiiiIIIII);
                }
            }
            --IiiiiiiiIIIII2;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Unable to fully structure code
     */
    public void ALLATORIxDEMO(long total) {
        block8: {
            IiiiiiiiIIIII = IIiIiiiiIiIII.ALLATORIxDEMO();
            if (IiiiiiiiIIIII.size() == 0) {
                return;
            }
            if (!this.counter) break block8;
            var4_3 = IiiiiiiiIIIII;
            synchronized (var4_3) {
                IiiiiiiiIIIII = false;
                IiiiiiiiIIIII = IiiiiiiiIIIII.iterator();
                if (true) ** GOTO lbl19
                do {
                    v1 = (BattleScene)IiiiiiiiIIIII.next();
                    v1.ALLATORIxDEMO(total);
                    if (!v1.ALLATORIxDEMO()) continue;
                    IiiiiiiiIIIII = true;
                    IiiiiiiiIIIII.remove();
lbl19:
                    // 3 sources

                } while (IiiiiiiiIIIII.hasNext());
                if (IiiiiiiiIIIII == false) return;
                iiiiiiiiiiIiI.ALLATORIxDEMO();
                return;
            }
        }
        var5_6 = IiiiiiiiIIIII.iterator();
        while (true) {
            if (!var5_6.hasNext()) {
                return;
            }
            IiiiiiiiIIIII = (BattleScene)var5_6.next();
            IiiiiiiiIIIII.ALLATORIxDEMO(total);
        }
    }

    /*
     * Enabled unnecessary exception pruning
     */
    public void ALLATORIxDEMO() {
        try {
            this.total = fpsTime - System.nanoTime() + this.now;
            Thread.sleep(this.total > 0L ? this.total / 1000000L : 1L);
            this.now2 = System.nanoTime();
            this.interval += this.now2 - this.now;
            this.total = this.interval / 1000000L;
            this.interval %= 1000000L;
            this.now = this.now2;
            this.counterTime += this.total;
            if (this.counterTime > 500L) {
                this.counterTime = this.counterTime > 5000L ? 0L : (this.counterTime -= 500L);
                ++this.counterIndex;
                this.counter = true;
                if (this.counterIndex % 60 != 0) return;
                ++this.handleIndex;
                return;
            }
            this.counter = false;
            return;
        }
        catch (Exception IiiiiiiiIIIII) {
            IiiiiiiiIIIII.printStackTrace();
        }
    }
}
