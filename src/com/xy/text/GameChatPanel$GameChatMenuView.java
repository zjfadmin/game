/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.i.iiiiiiiiiiIiI
 *  com.xy.text.GameChatPanel
 *  com.xy.w.IIIIIiiiIiiII
 *  com.xy.w.IIiIiiiiIIiii
 */
package com.xy.text;

import com.xy.i.iiiiiiiiiiIiI;
import com.xy.text.GameChatPanel;
import com.xy.w.IIIIIiiiIiiII;
import com.xy.w.IIiIiiiiIIiii;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JComponent;

/*
 * Exception performing whole class analysis ignored.
 */
class GameChatPanel.GameChatMenuView
extends JComponent
implements MouseListener,
MouseMotionListener {
    private iiiiiiiiiiIiI[] menuBtns;
    private int menuY;
    private int chatY = 0;
    private int chatH = 0;
    private int type = 0;

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {
        this.menuY = e.getY();
    }

    static /* synthetic */ iiiiiiiiiiIiI[] ALLATORIxDEMO(GameChatPanel.GameChatMenuView arg0) {
        return arg0.menuBtns;
    }

    static /* synthetic */ void iIiIiiiiIIiii(GameChatPanel.GameChatMenuView arg0, int arg1) {
        arg0.chatY = arg1;
    }

    static /* synthetic */ int iIiIiiiiIIiii(GameChatPanel.GameChatMenuView arg0) {
        return arg0.chatY;
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (GameChatPanel.ALLATORIxDEMO((GameChatPanel)GameChatPanel.this) == null) {
            GameChatPanel.ALLATORIxDEMO((GameChatPanel)GameChatPanel.this, (IIiIiiiiIIiii)IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/c/1", (int)6, (int)6, (int)6, (int)6, (boolean)false));
        }
        GameChatPanel.ALLATORIxDEMO((GameChatPanel)GameChatPanel.this).ALLATORIxDEMO(g, this.getWidth(), this.getHeight());
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        int IiiiiiiiIIIII = e.getY() - this.menuY;
        int IiiiiiiiIIIII2 = GameChatPanel.ALLATORIxDEMO((GameChatPanel)GameChatPanel.this).getGameFrameHeight();
        int IiiiiiiiIIIII3 = Math.max(160, IiiiiiiiIIIII + this.getY() - 30);
        int IiiiiiiiIIIII4 = Math.max(160, IiiiiiiiIIIII2 - IiiiiiiiIIIII3 - 40 - 30);
        if ((IiiiiiiiIIIII3 = IiiiiiiiIIIII2 - IiiiiiiiIIIII4 - 40 - 30) == GameChatPanel.iIiIiiiiIIiii((GameChatPanel)GameChatPanel.this).chatH) {
            return;
        }
        GameChatPanel.iIiIiiiiIIiii((GameChatPanel)GameChatPanel.this).chatY = 30;
        GameChatPanel.iIiIiiiiIIiii((GameChatPanel)GameChatPanel.this).chatH = IiiiiiiiIIIII3;
        GameChatPanel.ALLATORIxDEMO((GameChatPanel)GameChatPanel.this).chatY = GameChatPanel.iIiIiiiiIIiii((GameChatPanel)GameChatPanel.this).chatY + GameChatPanel.iIiIiiiiIIiii((GameChatPanel)GameChatPanel.this).chatH + 20;
        GameChatPanel.ALLATORIxDEMO((GameChatPanel)GameChatPanel.this).chatH = IiiiiiiiIIIII4;
        GameChatPanel.iIiIiiiiIIiii((GameChatPanel)GameChatPanel.this).setBounds(0, GameChatPanel.iIiIiiiiIIiii((GameChatPanel)GameChatPanel.this).chatY + GameChatPanel.iIiIiiiiIIiii((GameChatPanel)GameChatPanel.this).chatH, this.getWidth(), this.getHeight());
        GameChatPanel.ALLATORIxDEMO((GameChatPanel)GameChatPanel.this).setBounds(0, GameChatPanel.ALLATORIxDEMO((GameChatPanel)GameChatPanel.this).chatY + GameChatPanel.ALLATORIxDEMO((GameChatPanel)GameChatPanel.this).chatH, this.getWidth(), this.getHeight());
    }

    static /* synthetic */ void ALLATORIxDEMO(GameChatPanel.GameChatMenuView arg0, int arg1) {
        arg0.chatH = arg1;
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    public GameChatPanel.GameChatMenuView(int type) {
        this.type = type;
        this.menuBtns = new iiiiiiiiiiIiI[10];
        int IiiiiiiiIIIII = 0;
        int IiiiiiiiIIIII2 = 0;
        while (IiiiiiiiIIIII2 < this.menuBtns.length) {
            if (IiiiiiiiIIIII2 == 3) {
                this.menuBtns[IiiiiiiiIIIII2] = new iiiiiiiiiiIiI("sc/e/144.png", 1, type * 100 + IiiiiiiiIIIII2, (Object)GameChatPanel.this.getGameChatPanel());
            } else if (IiiiiiiiIIIII2 == 7) {
                this.menuBtns[IiiiiiiiIIIII2] = new iiiiiiiiiiIiI("sc/e/149.png", 1, type * 100 + IiiiiiiiIIIII2, (Object)GameChatPanel.this.getGameChatPanel());
            } else if (IiiiiiiiIIIII2 == 8) {
                this.menuBtns[IiiiiiiiIIIII2] = new iiiiiiiiiiIiI("sc/e/150.png", 1, type * 100 + IiiiiiiiIIIII2, (Object)GameChatPanel.this.getGameChatPanel());
            } else if (IiiiiiiiIIIII2 != 4 && IiiiiiiiIIIII2 != 5 && IiiiiiiiIIIII2 != 6 && IiiiiiiiIIIII2 != 9) {
                this.menuBtns[IiiiiiiiIIIII2] = new iiiiiiiiiiIiI("sc/c/" + (3 + IiiiiiiiIIIII2), 1, type * 100 + IiiiiiiiIIIII2, (Object)GameChatPanel.this.getGameChatPanel());
            }
            if (this.menuBtns[IiiiiiiiIIIII2] != null) {
                this.menuBtns[IiiiiiiiIIIII2].setBounds(17 * IiiiiiiiIIIII, 3, 17, 17);
                ++IiiiiiiiIIIII;
                this.add((Component)this.menuBtns[IiiiiiiiIIIII2]);
            }
            ++IiiiiiiiIIIII2;
        }
        if (type != 0) {
            return;
        }
        GameChatPanel.GameChatMenuView gameChatMenuView = this;
        GameChatPanel.GameChatMenuView gameChatMenuView2 = this;
        gameChatMenuView.addMouseListener(gameChatMenuView2);
        gameChatMenuView.addMouseMotionListener(gameChatMenuView2);
    }

    @Override
    public void mouseMoved(MouseEvent e) {
    }

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    static /* synthetic */ int ALLATORIxDEMO(GameChatPanel.GameChatMenuView arg0) {
        return arg0.chatH;
    }
}
