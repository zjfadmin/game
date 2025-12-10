/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.iiiIiiiiiiiiI
 *  com.xy.game.GameUtil
 *  com.xy.i.IiiIiiiiIIIii
 *  com.xy.q.IiIIIiiiiIIiI
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.richtext.InputBean
 *  com.xy.text.GameChatPanel$GameChatMenuView
 *  com.xy.text.GameFrame
 *  com.xy.text.GameView
 *  com.xy.text.ScreenData
 *  com.xy.w.IIIIIiiiIiiII
 *  com.xy.w.IIiIiiiiIIiii
 */
package com.xy.text;

import com.xy.a.iiiIiiiiiiiiI;
import com.xy.game.GameUtil;
import com.xy.i.IiiIiiiiIIIii;
import com.xy.q.IiIIIiiiiIIiI;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.richtext.InputBean;
import com.xy.text.GameChatPanel;
import com.xy.text.GameFrame;
import com.xy.text.GameView;
import com.xy.text.ScreenData;
import com.xy.w.IIIIIiiiIiiII;
import com.xy.w.IIiIiiiiIIiii;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import javax.swing.JLabel;
import javax.swing.JPanel;

/*
 * Exception performing whole class analysis ignored.
 */
public class GameChatPanel
extends JPanel
implements MouseListener,
MouseMotionListener,
MouseWheelListener {
    private Image back;
    private IIiIiiiiIIiii backMenu;
    private GameChatMenuView menuView1;
    private InputBean inputBean;
    private int moveX;
    public Color whiteLight = new Color(200, 200, 200);
    private GameChatMenuView menuView2;
    private GameFrame gameFrame;
    private int moveIndex;
    private JLabel titleLab;
    private boolean move;
    private int moveW;

    static /* synthetic */ void ALLATORIxDEMO(GameChatPanel arg0, IIiIiiiiIIiii arg1) {
        arg0.backMenu = arg1;
    }

    static /* synthetic */ GameChatMenuView iIiIiiiiIIiii(GameChatPanel arg0) {
        return arg0.menuView1;
    }

    @Override
    public void mousePressed(MouseEvent e) {
        this.inputBean = this.gameFrame.gameView.chatBox.isMonitor(e.getX(), e.getY(), GameChatMenuView.iIiIiiiiIIiii((GameChatMenuView)this.menuView1), GameChatMenuView.iIiIiiiiIIiii((GameChatMenuView)this.menuView2), GameChatMenuView.ALLATORIxDEMO((GameChatMenuView)this.menuView1), GameChatMenuView.ALLATORIxDEMO((GameChatMenuView)this.menuView2));
        if (this.inputBean != null) {
            this.inputBean.setM(true);
            return;
        }
        if (this.getWidth() - e.getX() >= 20) return;
        this.moveX = e.getX();
        this.moveW = this.moveIndex = this.getWidth();
        this.titleLab.setBounds(0, 0, 1360, 30);
        this.setBounds(this.getX(), 0, 1360, this.getHeight());
        int IiiiiiiiIIIII = 1372;
        ScreenData IiiiiiiiIIIII2 = this.gameFrame.gameView.screenData;
        this.gameFrame.gamePanel.setSize(IiiiiiiiIIIII2.getScreen_x() + IiiiiiiiIIIII, this.gameFrame.getHeight());
        this.gameFrame.setSize(IiiiiiiiIIIII2.getScreen_x() + IiiiiiiiIIIII, this.gameFrame.getHeight());
        this.move = true;
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

    static /* synthetic */ GameFrame ALLATORIxDEMO(GameChatPanel arg0) {
        return arg0.gameFrame;
    }

    public void setGameView(GameView gameView) {
        boolean IiiiiiiiIIIII = gameView.getClient().gameText;
        int IiiiiiiiIIIII2 = 3;
        while (IiiiiiiiIIIII2 < GameChatMenuView.ALLATORIxDEMO((GameChatMenuView)this.menuView1).length) {
            if (GameChatMenuView.ALLATORIxDEMO((GameChatMenuView)this.menuView1)[IiiiiiiiIIIII2] != null) {
                GameChatMenuView.ALLATORIxDEMO((GameChatMenuView)this.menuView1)[IiiiiiiiIIIII2].setVisible(IiiiiiiiIIIII);
                GameChatMenuView.ALLATORIxDEMO((GameChatMenuView)this.menuView2)[IiiiiiiiIIIII2].setVisible(IiiiiiiiIIIII);
            }
            ++IiiiiiiiIIIII2;
        }
    }

    public GameChatPanel(GameFrame gameFrame) {
        this.gameFrame = gameFrame;
        this.setLayout(null);
        this.setBounds(0, 0, 1, 1);
        this.setBackground(iiIIiiiiIiiII.IIiIiiiiIIiII);
        this.titleLab = IiIIIiiiiIIiI.ALLATORIxDEMO((int)0, (int)0, (int)100, (int)30, (Color)Color.black, (Font)iiIIiiiiIiiII.iIiIIiiiiIIiI);
        this.titleLab.setOpaque(true);
        this.titleLab.setBackground(new Color(240, 240, 240));
        this.titleLab.setText("\u3000\u804a\u5929\u7a97\u53e3");
        this.add(this.titleLab);
        this.menuView1 = new GameChatMenuView(this, 0);
        this.menuView2 = new GameChatMenuView(this, 1);
        this.add((Component)this.menuView1);
        this.add((Component)this.menuView2);
        this.addMouseListener(this);
        this.addMouseMotionListener(this);
        this.addMouseWheelListener(this);
    }

    public void ALLATORIxDEMO() {
        if (this.inputBean != null) {
            this.inputBean.setM(false);
        }
        this.inputBean = null;
        ScreenData IiiiiiiiIIIII = this.gameFrame.gameView.screenData;
        int IiiiiiiiIIIII2 = this.gameFrame.getGameFrameHeight();
        if (IiiiiiiiIIIII2 != GameChatMenuView.ALLATORIxDEMO((GameChatMenuView)this.menuView1) + GameChatMenuView.ALLATORIxDEMO((GameChatMenuView)this.menuView2) + 40 + 30) {
            if (GameChatMenuView.ALLATORIxDEMO((GameChatMenuView)this.menuView1) == 0) {
                GameChatMenuView.iIiIiiiiIIiii((GameChatMenuView)this.menuView1, (int)30);
                GameChatMenuView.ALLATORIxDEMO((GameChatMenuView)this.menuView1, (int)((IiiiiiiiIIIII2 - 40 - 30) / 2));
                GameChatMenuView.iIiIiiiiIIiii((GameChatMenuView)this.menuView2, (int)(GameChatMenuView.iIiIiiiiIIiii((GameChatMenuView)this.menuView1) + GameChatMenuView.ALLATORIxDEMO((GameChatMenuView)this.menuView1) + 20));
                GameChatMenuView.ALLATORIxDEMO((GameChatMenuView)this.menuView2, (int)(IiiiiiiiIIIII2 - GameChatMenuView.ALLATORIxDEMO((GameChatMenuView)this.menuView1) - 40 - 30));
            } else {
                double IiiiiiiiIIIII3 = IiiiiiiiIIIII2 - 40 - 30;
                int IiiiiiiiIIIII4 = Math.max(160, (int)(IiiiiiiiIIIII3 * (double)GameChatMenuView.ALLATORIxDEMO((GameChatMenuView)this.menuView1) / (double)(GameChatMenuView.ALLATORIxDEMO((GameChatMenuView)this.menuView1) + GameChatMenuView.ALLATORIxDEMO((GameChatMenuView)this.menuView2))));
                int IiiiiiiiIIIII5 = Math.max(160, IiiiiiiiIIIII2 - IiiiiiiiIIIII4 - 40 - 30);
                IiiiiiiiIIIII4 = IiiiiiiiIIIII2 - IiiiiiiiIIIII5 - 40 - 30;
                GameChatMenuView.iIiIiiiiIIiii((GameChatMenuView)this.menuView1, (int)30);
                GameChatMenuView.ALLATORIxDEMO((GameChatMenuView)this.menuView1, (int)IiiiiiiiIIIII4);
                GameChatMenuView.iIiIiiiiIIiii((GameChatMenuView)this.menuView2, (int)(GameChatMenuView.iIiIiiiiIIiii((GameChatMenuView)this.menuView1) + GameChatMenuView.ALLATORIxDEMO((GameChatMenuView)this.menuView1) + 20));
                GameChatMenuView.ALLATORIxDEMO((GameChatMenuView)this.menuView2, (int)IiiiiiiiIIIII5);
            }
        }
        this.titleLab.setBounds(0, 0, IiiiiiiiIIIII.ChatFram_X, 30);
        this.menuView1.setBounds(0, GameChatMenuView.iIiIiiiiIIiii((GameChatMenuView)this.menuView1) + GameChatMenuView.ALLATORIxDEMO((GameChatMenuView)this.menuView1), IiiiiiiiIIIII.ChatFram_X, 20);
        this.menuView2.setBounds(0, GameChatMenuView.iIiIiiiiIIiii((GameChatMenuView)this.menuView2) + GameChatMenuView.ALLATORIxDEMO((GameChatMenuView)this.menuView2), IiiiiiiiIIIII.ChatFram_X, 20);
    }

    public void ALLATORIxDEMO(int id) {
        if (id == 0) return;
        if (id == 100) return;
        if (id == 1) {
            this.gameFrame.gameView.chatBox.addChat(1, 20, GameChatMenuView.ALLATORIxDEMO((GameChatMenuView)this.menuView1));
            return;
        }
        if (id == 2) {
            this.gameFrame.gameView.chatBox.addChat(1, -20, GameChatMenuView.ALLATORIxDEMO((GameChatMenuView)this.menuView1));
            return;
        }
        if (id == 101) {
            this.gameFrame.gameView.chatBox.addChat(2, 20, GameChatMenuView.ALLATORIxDEMO((GameChatMenuView)this.menuView2));
            return;
        }
        if (id == 102) {
            this.gameFrame.gameView.chatBox.addChat(2, -20, GameChatMenuView.ALLATORIxDEMO((GameChatMenuView)this.menuView2));
            return;
        }
        if (id == 3 || id == 103) {
            ((iiiIiiiiiiiiI)this.gameFrame.gameView.getFormManagement().iiiIiiiiiiIIi(158)).iIiIiiiiIIiii(id == 3 ? 1 : 2);
            return;
        }
        if (id == 4) return;
        if (id == 104) return;
        if (id == 5) return;
        if (id == 105) return;
        if (id == 6) return;
        if (id == 106) return;
        if (id == 7 || id == 107) {
            IiiIiiiiIIIii.ALLATORIxDEMO((int)159, (GameView)this.gameFrame.gameView);
            return;
        }
        if (id != 8 && id != 108) {
            if (id == 9) return;
            return;
        }
        IiiIiiiiIIIii.ALLATORIxDEMO((int)160, (GameView)this.gameFrame.gameView);
    }

    public GameChatPanel getGameChatPanel() {
        return this;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    static /* synthetic */ IIiIiiiiIIiii ALLATORIxDEMO(GameChatPanel arg0) {
        return arg0.backMenu;
    }

    @Override
    public void mouseMoved(MouseEvent e) {
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (this.back == null) {
            this.back = IIIIIiiiIiiII.iiiIiiiiiiIIi((String)"sc/c/2");
        }
        g.drawImage(this.back, 0, 30, Math.max(this.back.getWidth(null), this.getWidth()), Math.max(this.back.getHeight(null), this.getHeight() - 30), null);
        if (this.move) {
            g.setColor(Color.red);
            g.drawLine(this.moveIndex, 0, this.moveIndex, this.getHeight());
            return;
        }
        this.gameFrame.gameView.chatBox.paint(g, GameChatMenuView.iIiIiiiiIIiii((GameChatMenuView)this.menuView1), GameChatMenuView.iIiIiiiiIIiii((GameChatMenuView)this.menuView2), GameChatMenuView.ALLATORIxDEMO((GameChatMenuView)this.menuView1), GameChatMenuView.ALLATORIxDEMO((GameChatMenuView)this.menuView2));
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        if (this.inputBean != null) {
            GameUtil.ALLATORIxDEMO((InputBean)this.inputBean, (GameView)this.gameFrame.gameView);
        }
        if (this.move) {
            this.gameFrame.gameView.screenData.ChatFram_X = this.moveIndex;
            this.gameFrame.gameView.chatBox.setWidth(this.moveIndex);
            this.gameFrame.setGameSize();
        }
        this.move = false;
    }

    static /* synthetic */ GameChatMenuView ALLATORIxDEMO(GameChatPanel arg0) {
        return arg0.menuView2;
    }

    @Override
    public void mouseWheelMoved(MouseWheelEvent e) {
        int IiiiiiiiIIIII = e.getY();
        if (IiiiiiiiIIIII > GameChatMenuView.iIiIiiiiIIiii((GameChatMenuView)this.menuView1) && IiiiiiiiIIIII < GameChatMenuView.iIiIiiiiIIiii((GameChatMenuView)this.menuView1) + GameChatMenuView.ALLATORIxDEMO((GameChatMenuView)this.menuView1)) {
            this.gameFrame.gameView.chatBox.addChat(1, -e.getWheelRotation() * 20, GameChatMenuView.ALLATORIxDEMO((GameChatMenuView)this.menuView1));
            return;
        }
        if (IiiiiiiiIIIII <= GameChatMenuView.iIiIiiiiIIiii((GameChatMenuView)this.menuView2)) return;
        if (IiiiiiiiIIIII >= GameChatMenuView.iIiIiiiiIIiii((GameChatMenuView)this.menuView2) + GameChatMenuView.ALLATORIxDEMO((GameChatMenuView)this.menuView2)) return;
        this.gameFrame.gameView.chatBox.addChat(2, -e.getWheelRotation() * 20, GameChatMenuView.ALLATORIxDEMO((GameChatMenuView)this.menuView2));
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        if (!this.move) return;
        this.moveIndex = Math.max(Math.min(e.getX() - this.moveX + this.moveW, 1360), 160);
    }
}
