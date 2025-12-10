/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.battle.BattleControl
 *  com.xy.bean.ConfirmBean
 *  com.xy.game.GameUtil
 *  com.xy.readbean.Goodstable
 *  com.xy.text.GameView
 *  com.xy.v.iIiIIiiiIiiiI
 *  com.xy.v.iiIiIiiiIIIiI
 */
package com.xy.game;

import com.xy.battle.BattleControl;
import com.xy.bean.ConfirmBean;
import com.xy.game.GameUtil;
import com.xy.readbean.Goodstable;
import com.xy.text.GameView;
import com.xy.v.iIiIIiiiIiiiI;
import com.xy.v.iiIiIiiiIIIiI;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class GameMouse
implements MouseListener {
    private GameView gameView;
    int yd = 0;
    int xd = 0;

    public GameMouse(GameView gameView) {
        this.gameView = gameView;
    }

    @Override
    public void mouseExited(MouseEvent e) {
        this.gameView.XZ = false;
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        this.gameView.XZ = true;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        if (e.getButton() != 3) return;
        if (this.gameView.getBattleScene() != null) return;
        int IiiiiiiiIIIII = e.getX();
        int IiiiiiiiIIIII2 = e.getY();
        int IiiiiiiiIIIII3 = (this.gameView.mapCamera.ALLATORIxDEMO() + IiiiiiiiIIIII) / 20;
        int IiiiiiiiIIIII4 = (this.gameView.mapCamera.iIiIiiiiIIiii() + IiiiiiiiIIIII2) / 20;
        if (Math.abs(IiiiiiiiIIIII3 - this.xd) <= 1) {
            if (Math.abs(IiiiiiiiIIIII4 - this.yd) <= 1) return;
        }
        this.xd = IiiiiiiiIIIII3;
        this.yd = IiiiiiiiIIIII4;
        int IiiiiiiiIIIII5 = this.gameView.roleUnit.IiiiiiiiIIIII;
        if (!this.gameView.mapScene.ALLATORIxDEMO(this.xd, this.yd, IiiiiiiiIIIII5)) {
            GameUtil.ALLATORIxDEMO((int)this.xd, (int)this.yd, (int)IiiiiiiiIIIII5, (GameView)this.gameView);
            return;
        }
        if (this.gameView.mapScene.ALLATORIxDEMO(this.xd, this.yd, IiiiiiiiIIIII5 == 0 ? 1 : 0)) {
            GameUtil.ALLATORIxDEMO((int)this.xd, (int)this.yd, (int)IiiiiiiiIIIII5, (GameView)this.gameView);
            return;
        }
        GameUtil.ALLATORIxDEMO((int)this.xd, (int)this.yd, (int)(IiiiiiiiIIIII5 == 0 ? 1 : 0), (GameView)this.gameView);
    }

    @Override
    public void mousePressed(MouseEvent e) {
        if (iIiIIiiiIiiiI.ALLATORIxDEMO()) return;
        if (!this.gameView.isDraw) {
            return;
        }
        if (this.gameView.getBattleScene() != null) {
            BattleControl IiiiiiiiIIIII = this.gameView.getBattleControl();
            if (e.getButton() == 3) {
                if (this.gameView.getMouseIndex() == iiIiIiiiIIIiI.IiIIIiiiiIiiI) return;
                IiiiiiiiIIIII.IIIIIiiiiIIii();
                return;
            }
            if (e.getButton() != 1) return;
            IiiiiiiiIIIII.ALLATORIxDEMO(e.getX(), e.getY());
            return;
        }
        if (this.gameView.choseImg.iIiIiiiiIiIii == 0) {
            if (e.getButton() == 3) {
                this.gameView.setMouseIndex(iiIiIiiiIIIiI.IiIIIiiiiIiiI);
                return;
            }
            if (e.getButton() != 1) return;
            if (this.gameView.scene != null && this.gameView.scene.ALLATORIxDEMO(this.gameView.mapCamera.ALLATORIxDEMO() + e.getX(), this.gameView.mapCamera.iIiIiiiiIIiii() + e.getY())) {
                return;
            }
            this.gameView.mapScene.ALLATORIxDEMO(this.gameView);
            return;
        }
        if (this.gameView.choseImg.iIiIiiiiIiIii != 1) {
            this.gameView.choseImg.ALLATORIxDEMO();
            return;
        }
        Goodstable IiiiiiiiIIIII = this.gameView.roleData.getGood(this.gameView.choseImg.iiIIIiiiiiiiI);
        this.gameView.choseImg.ALLATORIxDEMO();
        if (IiiiiiiiIIIII == null) {
            return;
        }
        if (e.getButton() != 1) return;
        ConfirmBean IiiiiiiiIIIII2 = new ConfirmBean(1, IiiiiiiiIIIII.getRgid().toString(), "#W\u786e\u5b9a\u8981\u5c06#G" + IiiiiiiiIIIII.getGoodsname() + "#W\u7269\u54c1\u4e22\u5f03\u5417?");
        this.gameView.ALLATORIxDEMO(IiiiiiiiIIIII2);
    }
}
