/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.socket.GameClient
 *  com.xy.text.GameAWTEventListener
 *  com.xy.text.GameChatPanel
 *  com.xy.text.GameMain
 *  com.xy.text.GamePanel
 *  com.xy.text.GameRunnable
 *  com.xy.text.GameView
 *  com.xy.text.ScreenData
 *  com.xy.v.IIIIIiiiIIIiI
 *  com.xy.w.IIIIIiiiIiiII
 */
package com.xy.text;

import com.xy.socket.GameClient;
import com.xy.text.GameAWTEventListener;
import com.xy.text.GameChatPanel;
import com.xy.text.GameMain;
import com.xy.text.GamePanel;
import com.xy.text.GameRunnable;
import com.xy.text.GameView;
import com.xy.text.ScreenData;
import com.xy.v.IIIIIiiiIIIiI;
import com.xy.w.IIIIIiiiIiiII;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.AWTEventListener;
import java.awt.event.WindowListener;
import java.awt.image.MemoryImageSource;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComponent;
import javax.swing.JFrame;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class GameFrame
extends JFrame {
    public int frameIndex = 0;
    public GamePanel gamePanel;
    private boolean addViewFirst = true;
    public JComponent mouseView;
    private static boolean loadAWTEvent = false;
    Point point = new Point();
    public int alwaysOnTopIndex = 0;
    public GameChatPanel gameChatPanel;
    public List<GameView> gameList;
    public GameView gameView;

    public void ALLATORIxDEMO(boolean loop, String path, GameView gameView) {
        if (this.gameView != gameView) {
            return;
        }
        if (loop) {
            IIIIIiiiIIIiI.iIiIiiiiIIiIi((String)path);
            return;
        }
        IIIIIiiiIIIiI.iIiIiiiiIIiii((String)path);
    }

    public void iiiIiiiiiiIIi() {
        if (this.gameView != null) {
            this.gameView.getFormManagement().iIiIiiiiIIiIi(50);
            return;
        }
        System.exit(0);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void iIiIiiiiIIiii() {
        GameFrame gameFrame = this;
        synchronized (gameFrame) {
            this.setBtnSize();
            return;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void ALLATORIxDEMO() {
        GameFrame gameFrame = this;
        synchronized (gameFrame) {
            this.gameView.iiiiiiiiIIiii();
            this.setGameSize();
            return;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Unable to fully structure code
     */
    public void setGameView(GameView gameView) {
        var2_2 = this;
        synchronized (var2_2) {
            if (gameView == this.gameView) {
                return;
            }
            if (this.gameView != null) {
                this.gamePanel.remove((Component)this.gameView);
            }
            this.gameView = gameView;
            this.gameView.setViewTitle();
            this.gamePanel.add((Component)this.gameView);
            IiiiiiiiIIIII = 0;
            if (true) ** GOTO lbl20
            do {
                IiiiiiiiIIIII = this.gameList.get(IiiiiiiiIIIII);
                IiiiiiiiIIIII.getLabelView().getGameBtn().setBtnPath(IiiiiiiiIIIII == this.gameView ? "sc/b/95.png" : "sc/b/96.png");
                ++IiiiiiiiIIIII;
lbl20:
                // 2 sources

            } while (IiiiiiiiIIIII < this.gameList.size());
            this.gameChatPanel.setGameView(gameView);
            this.ALLATORIxDEMO();
            GameMain.gameRunnable.setFPS(this.gameView.systemData.getFPS());
            this.gameView.iIiIiiiiIIiii();
            return;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void setViewTitle(GameView gameView, BigDecimal roleId, String roleName) {
        GameFrame gameFrame = this;
        synchronized (gameFrame) {
            if (this.gameView != gameView) {
                return;
            }
            this.setTitle(String.valueOf(roleName) + " ID:" + roleId);
            this.gamePanel.getTitleLab().setText("\u5927\u8bdd\u897f\u6e382\u7ecf\u5178\u7248 $Revision:" + GameMain.VERSIONSIZE + " - " + gameView.getClient().getAreaName() + " - " + roleName + " (ID: " + roleId + ")");
            return;
        }
    }

    private /* synthetic */ void IiiIiiiiiiIiI(GameView gameView) {
        this.gamePanel.add((Component)gameView.getLabelView());
        this.setBtnSize();
    }

    /*
     * WARNING - void declaration
     */
    public Point ALLATORIxDEMO() {
        void IiiiiiiiIIIII;
        Point point = MouseInfo.getPointerInfo().getLocation();
        this.point.move(point.x - this.getX(), IiiiiiiiIIIII.y - this.getY());
        return this.point;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Unable to fully structure code
     */
    public void iIiIiiiiIIiIi(GameView gameView) {
        var2_2 = this;
        synchronized (var2_2) {
            IiiiiiiiIIIII = this.gameList.indexOf(gameView);
            IiiiiiiiIIIII = this.getHypothesisindex(gameView);
            if (IiiiiiiiIIIII == IiiiiiiiIIIII) {
                return;
            }
            this.gameList.remove(gameView);
            this.gameList.add(IiiiiiiiIIIII, gameView);
            IiiiiiiiIIIII = 0;
            if (true) ** GOTO lbl19
            do {
                if ((IiiiiiiiIIIII = this.gameList.get(IiiiiiiiIIIII)) != gameView) {
                    IiiiiiiiIIIII.getLabelView().setBounds(22 + 172 * IiiiiiiiIIIII, 30, 172, 23);
                }
                ++IiiiiiiiIIIII;
lbl19:
                // 2 sources

            } while (IiiiiiiiIIIII < this.gameList.size());
            return;
        }
    }

    public void iIiIiiiiIIiii(String path, GameView gameView) {
        if (this.gameView != gameView) {
            return;
        }
        IIIIIiiiIIIiI.iiiIiiiiiiIIi((String)path);
    }

    public GameFrame() {
        this.frameIndex = GameMain.frameIndex;
        this.setIconImage(IIIIIiiiIiiII.iiiIiiiiiiIIi((String)"sc/b/SZ1.png"));
        Image IiiiiiiiIIIII = Toolkit.getDefaultToolkit().createImage(new MemoryImageSource(0, 0, new int[0], 0, 0));
        this.setCursor(Toolkit.getDefaultToolkit().createCustomCursor(IiiiiiiiIIIII, new Point(0, 0), null));
        this.setUndecorated(true);
        this.gameList = new ArrayList<GameView>();
        this.gamePanel = new GamePanel(this);
        this.setContentPane((Container)this.gamePanel);
        this.setDefaultCloseOperation(0);
        this.setVisible(true);
        this.setResizable(false);
        this.setFocusable(true);
        this.setFocusTraversalKeysEnabled(false);
        this.addWindowListener((WindowListener)new /* Unavailable Anonymous Inner Class!! */);
        this.gameChatPanel = new GameChatPanel(this);
        this.mouseView = new /* Unavailable Anonymous Inner Class!! */;
        this.gamePanel.add((Component)this.mouseView, 0);
        this.gamePanel.add((Component)this.gameChatPanel, 1);
        if (!loadAWTEvent) {
            loadAWTEvent = true;
            Toolkit.getDefaultToolkit().addAWTEventListener((AWTEventListener)new GameAWTEventListener(), 8L);
        }
        if (GameMain.gameRunnable != null) return;
        GameMain.gameRunnable = new GameRunnable();
        new Thread((Runnable)GameMain.gameRunnable).start();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void setGameView() {
        GameFrame gameFrame = this;
        synchronized (gameFrame) {
            if (this.gameList.size() <= 1) {
                return;
            }
            int IiiiiiiiIIIII = this.gameList.indexOf(this.gameView) + 1;
            if (IiiiiiiiIIIII >= this.gameList.size()) {
                IiiiiiiiIIIII = 0;
            }
            this.setGameView(IiiiiiiiIIIII);
            return;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * WARNING - void declaration
     */
    public void iiiIiiiiiiIIi(GameView gameView) {
        GameFrame gameFrame = this;
        synchronized (gameFrame) {
            this.gameList.add(gameView);
            this.IiiIiiiiiiIiI(gameView);
            this.setGameView(gameView);
            if (this.addViewFirst) {
                void IiiiiiiiIIIII;
                Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
                this.setBounds((IiiiiiiiIIIII.width - this.getWidth()) / 2, (IiiiiiiiIIIII.height - this.getHeight()) / 2, this.getWidth(), this.getHeight());
                this.addViewFirst = false;
            }
            this.alwaysOnTopIndex = 0;
            this.setAlwaysOnTop(true);
            return;
        }
    }

    public int getHypothesisindex(GameView gameView) {
        int IiiiiiiiIIIII = gameView.getLabelView().getX() - 22;
        int IiiiiiiiIIIII2 = 0;
        while (IiiiiiiiIIIII2 < this.gameList.size()) {
            GameView IiiiiiiiIIIII3 = this.gameList.get(IiiiiiiiIIIII2);
            if (IiiiiiiiIIIII < 0 || IiiiiiiiIIIII >= IiiiiiiiIIIII3.getLabelView().getWidth()) {
                IiiiiiiiIIIII -= IiiiiiiiIIIII3.getLabelView().getWidth();
                ++IiiiiiiiIIIII2;
                continue;
            }
            if (!((double)IiiiiiiiIIIII * 0.5 > (double)IiiiiiiiIIIII3.getLabelView().getWidth())) return Math.min(IiiiiiiiIIIII2, this.gameList.size() - 1);
            ++IiiiiiiiIIIII2;
            break;
        }
        return Math.min(IiiiiiiiIIIII2, this.gameList.size() - 1);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void setGameView(int index) {
        GameFrame gameFrame = this;
        synchronized (gameFrame) {
            if (index >= this.gameList.size()) {
                return;
            }
            this.setGameView(this.gameList.get(index));
            return;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void setShowLable() {
        GameFrame gameFrame = this;
        synchronized (gameFrame) {
            this.setBtnSize();
            this.setGameSize();
            return;
        }
    }

    public void ALLATORIxDEMO(String path, GameView gameView) {
        if (this.gameView != gameView) {
            return;
        }
        IIIIIiiiIIIiI.ALLATORIxDEMO((String)path);
    }

    public int getGameFrameHeight() {
        if (this.gameView != null) return 37 + (this.gamePanel.ALLATORIxDEMO() ? 25 : 0) + this.gameView.screenData.getScreen_y();
        return 0;
    }

    private /* synthetic */ void iIiIiiiiIIiii(GameView gameView) {
        this.gamePanel.remove((Component)gameView.getLabelView());
        this.setBtnSize();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * WARNING - void declaration
     */
    public void setGameSize() {
        GameFrame gameFrame = this;
        synchronized (gameFrame) {
            ScreenData IiiiiiiiIIIII = this.gameView.screenData;
            int IiiiiiiiIIIII2 = 6;
            int n = this.gamePanel.ALLATORIxDEMO() ? 25 : 0;
            {
                void IiiiiiiiIIIII3;
                int n2 = n;
                GameFrame gameFrame2 = this;
                int n3 = IiiiiiiiIIIII2;
                this.gameView.setBounds(n3, (int)(IiiiiiiiIIIII3 += 31), IiiiiiiiIIIII.getScreen_x(), IiiiiiiiIIIII.getScreen_y());
                this.gameChatPanel.setBounds((IiiiiiiiIIIII2 += 6) + IiiiiiiiIIIII.getScreen_x(), 0, IiiiiiiiIIIII.getChatFram_X(), IiiiiiiiIIIII.getScreen_y() + (IiiiiiiiIIIII3 += 6));
                this.gameChatPanel.ALLATORIxDEMO();
                this.mouseView.setSize(IiiiiiiiIIIII.getScreen_x() + IiiiiiiiIIIII.getChatFram_X() + IiiiiiiiIIIII2, IiiiiiiiIIIII.getScreen_y() + IiiiiiiiIIIII3);
                gameFrame2.gamePanel.setSize(IiiiiiiiIIIII.getScreen_x() + IiiiiiiiIIIII.getChatFram_X() + IiiiiiiiIIIII2, IiiiiiiiIIIII.getScreen_y() + IiiiiiiiIIIII3);
                gameFrame2.gamePanel.ALLATORIxDEMO();
                gameFrame2.setSize(IiiiiiiiIIIII.getScreen_x() + IiiiiiiiIIIII.getChatFram_X() + IiiiiiiiIIIII2, IiiiiiiiIIIII.getScreen_y() + IiiiiiiiIIIII3);
                return;
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void ALLATORIxDEMO(GameView gameView) {
        GameFrame gameFrame = this;
        synchronized (gameFrame) {
            gameView.setVisible(false);
            gameView.ALLATORIxDEMO();
            if (!this.gameList.remove(gameView)) {
                return;
            }
            gameView.roleUnit.ALLATORIxDEMO(false);
            GameClient IiiiiiiiIIIII = gameView.getClient();
            if (IiiiiiiiIIIII != null) {
                IiiiiiiiIIIII.ALLATORIxDEMO();
            }
            if (this.gameList.size() == 0) {
                GameMain.ALLATORIxDEMO((GameFrame)this);
                return;
            }
            if (gameView.getBattleScene() != null) {
                gameView.getBattleScene().iIiIiiiiIIiii(gameView.getBattleControl());
            }
            this.iIiIiiiiIIiii(gameView);
            if (gameView == this.gameView) {
                this.setGameView(0);
            } else {
                this.ALLATORIxDEMO();
            }
            return;
        }
    }

    private /* synthetic */ void setBtnSize() {
        boolean IiiiiiiiIIIII = this.gamePanel.ALLATORIxDEMO();
        this.gamePanel.getGameBtns()[3].setVisible(IiiiiiiiIIIII);
        this.gamePanel.getGameBtns()[3].setBounds(8, 32, 12, 16);
        int IiiiiiiiIIIII2 = 0;
        while (IiiiiiiiIIIII2 < this.gameList.size()) {
            GameView gameView = this.gameList.get(IiiiiiiiIIIII2);
            gameView.getLabelView().setVisible(IiiiiiiiIIIII);
            int n = 22 + 172 * IiiiiiiiIIIII2;
            ++IiiiiiiiIIIII2;
            gameView.getLabelView().setBounds(n, 29, 172, 23);
        }
        this.gamePanel.getGameBtns()[4].setVisible(IiiiiiiiIIIII);
        this.gamePanel.getGameBtns()[4].setBounds(24 + 172 * this.gameList.size(), 32, 16, 16);
    }
}
