/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.IiIIIiiiiIiIi
 *  com.xy.a.iIIiiiiiIIIIi
 *  com.xy.a.iIiIiiiiiiiIi
 *  com.xy.game.GameUtil
 *  com.xy.game.HandleOption
 *  com.xy.readbean.Goodstable
 *  com.xy.readbean.MapModel
 *  com.xy.text.GameView
 */
package com.xy.a;

import com.xy.a.IiIIIiiiiIiIi;
import com.xy.a.iIIiiiiiIIIIi;
import com.xy.a.iIiIiiiiiiiIi;
import com.xy.game.GameUtil;
import com.xy.game.HandleOption;
import com.xy.readbean.Goodstable;
import com.xy.readbean.MapModel;
import com.xy.text.GameView;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.List;

/*
 * Exception performing whole class analysis ignored.
 */
static class iIIIiiiiiIiIi
implements MouseListener,
MouseMotionListener {
    final /* synthetic */ iIiIiiiiiiiIi ALLATORIxDEMO;

    iIIIiiiiiIiIi(iIiIiiiiiiiIi iIiIiiiiiiiIi2) {
        this.ALLATORIxDEMO = iIiIiiiiiiiIi2;
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseDragged(MouseEvent e) {
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        int IiiiiiiiIIIII = e.getX();
        int IiiiiiiiIIIII2 = e.getY();
        for (IiIIIiiiiIiIi IiiiiiiiIIIII3 : iIiIiiiiiiiIi.ALLATORIxDEMO((iIiIiiiiiiiIi)this.ALLATORIxDEMO)) {
            if (iIiIiiiiiiiIi.ALLATORIxDEMO() == null) break;
            if (!iIiIiiiiiiiIi.ALLATORIxDEMO().ALLATORIxDEMO(e.getX() + iIiIiiiiiiiIi.ALLATORIxDEMO((iIiIiiiiiiiIi)this.ALLATORIxDEMO)[2].getX() - IiIIIiiiiIiIi.ALLATORIxDEMO((IiIIIiiiiIiIi)IiiiiiiiIIIII3), e.getY() + iIiIiiiiiiiIi.ALLATORIxDEMO((iIiIiiiiiiiIi)this.ALLATORIxDEMO)[2].getY() - IiIIIiiiiIiIi.iIiIiiiiIIiii((IiIIIiiiiIiIi)IiiiiiiiIIIII3))) continue;
            iIiIiiiiiiiIi.ALLATORIxDEMO((iIiIiiiiiiiIi)this.ALLATORIxDEMO, (String)IiIIIiiiiIiIi.ALLATORIxDEMO((IiIIIiiiiIiIi)IiiiiiiiIIIII3).getMenu());
            iIiIiiiiiiiIi.ALLATORIxDEMO((iIiIiiiiiiiIi)this.ALLATORIxDEMO).ALLATORIxDEMO = e.getX() + 8;
            iIiIiiiiiiiIi.ALLATORIxDEMO((iIiIiiiiiiiIi)this.ALLATORIxDEMO).IiIIIiiiiIiiI = e.getY() + 12;
            iIiIiiiiiiiIi.ALLATORIxDEMO((iIiIiiiiiiiIi)this.ALLATORIxDEMO).iiIiiiiiiiIii = -1;
            return;
        }
        IiiiiiiiIIIII = (int)((double)IiiiiiiiIIIII * (iIiIiiiiiiiIi.ALLATORIxDEMO((iIiIiiiiiiiIi)this.ALLATORIxDEMO) / 20.0));
        IiiiiiiiIIIII2 = (int)((double)IiiiiiiiIIIII2 * (iIiIiiiiiiiIi.iIiIiiiiIIiii((iIiIiiiiiiiIi)this.ALLATORIxDEMO) / 20.0));
        iIiIiiiiiiiIi.ALLATORIxDEMO((iIiIiiiiiiiIi)this.ALLATORIxDEMO, (String)("(" + IiiiiiiiIIIII + "," + IiiiiiiiIIIII2 + ")"));
        iIiIiiiiiiiIi.ALLATORIxDEMO((iIiIiiiiiiiIi)this.ALLATORIxDEMO).ALLATORIxDEMO = e.getX() + 8;
        iIiIiiiiiiiIi.ALLATORIxDEMO((iIiIiiiiiiiIi)this.ALLATORIxDEMO).IiIIIiiiiIiiI = e.getY() + 12;
        iIiIiiiiiiiIi.ALLATORIxDEMO((iIiIiiiiiiiIi)this.ALLATORIxDEMO).iiIiiiiiiiIii = -1;
    }

    @Override
    public void mouseExited(MouseEvent e) {
        iIiIiiiiiiiIi.ALLATORIxDEMO((iIiIiiiiiiiIi)this.ALLATORIxDEMO, null);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        IiIIIiiiiIiIi IiiiiiiiIIIII4;
        int IiiiiiiiIIIII2 = e.getX();
        int IiiiiiiiIIIII3 = e.getY();
        if (e.isMetaDown()) {
            IiiiiiiiIIIII2 = (int)((double)IiiiiiiiIIIII2 * iIiIiiiiiiiIi.ALLATORIxDEMO((iIiIiiiiiiiIi)this.ALLATORIxDEMO));
            IiiiiiiiIIIII3 = (int)((double)IiiiiiiiIIIII3 * iIiIiiiiiiiIi.iIiIiiiiIIiii((iIiIiiiiiiiIi)this.ALLATORIxDEMO));
            HandleOption.ALLATORIxDEMO((MapModel)iIiIiiiiiiiIi.ALLATORIxDEMO((iIiIiiiiiiiIi)this.ALLATORIxDEMO), (int)IiiiiiiiIIIII2, (int)IiiiiiiiIIIII3, (GameView)this.ALLATORIxDEMO.iiIIiiiiIiIIi, (boolean)this.ALLATORIxDEMO.iiIIiiiiIiIIi.systemData.ALLATORIxDEMO());
            return;
        }
        for (IiIIIiiiiIiIi IiiiiiiiIIIII4 : iIiIiiiiiiiIi.ALLATORIxDEMO((iIiIiiiiiiiIi)this.ALLATORIxDEMO)) {
            if (iIiIiiiiiiiIi.ALLATORIxDEMO() == null) break;
            if (!iIiIiiiiiiiIi.ALLATORIxDEMO().ALLATORIxDEMO(e.getX() + iIiIiiiiiiiIi.ALLATORIxDEMO((iIiIiiiiiiiIi)this.ALLATORIxDEMO)[2].getX() - IiIIIiiiiIiIi.ALLATORIxDEMO((IiIIIiiiiIiIi)IiiiiiiiIIIII4), e.getY() + iIiIiiiiiiiIi.ALLATORIxDEMO((iIiIiiiiiiiIi)this.ALLATORIxDEMO)[2].getY() - IiIIIiiiiIiIi.iIiIiiiiIIiii((IiIIIiiiiIiIi)IiiiiiiiIIIII4))) continue;
            Goodstable IiiiiiiiIIIII5 = this.ALLATORIxDEMO.ALLATORIxDEMO().getGood(IiIIIiiiiIiIi.ALLATORIxDEMO((IiIIIiiiiIiIi)IiiiiiiiIIIII4));
            if (IiiiiiiiIIIII5 == null) {
                return;
            }
            ((iIIiiiiiIIIIi)this.ALLATORIxDEMO.ALLATORIxDEMO().iiiIiiiiiiIIi(27)).ALLATORIxDEMO(IiiiiiiiIIIII5, IiIIIiiiiIiIi.ALLATORIxDEMO((IiIIIiiiiIiIi)IiiiiiiiIIIII4).getMenu());
            return;
        }
        IiiiiiiiIIIII2 = (int)((double)IiiiiiiiIIIII2 * iIiIiiiiiiiIi.ALLATORIxDEMO((iIiIiiiiiiiIi)this.ALLATORIxDEMO));
        IiiiiiiiIIIII3 = (int)((double)IiiiiiiiIIIII3 * iIiIiiiiiiiIi.iIiIiiiiIIiii((iIiIiiiiiiiIi)this.ALLATORIxDEMO));
        if (this.ALLATORIxDEMO.iiIIiiiiIiIIi.mapScene.iiIiiiiiiiIii == iIiIiiiiiiiIi.ALLATORIxDEMO((iIiIiiiiiiiIi)this.ALLATORIxDEMO)) {
            GameUtil.ALLATORIxDEMO((int)(IiiiiiiiIIIII2 / 20), (int)(IiiiiiiiIIIII3 / 20), (int)0, (GameView)this.ALLATORIxDEMO.iiIIiiiiIiIIi);
            return;
        }
        IiiiiiiiIIIII4 = this.ALLATORIxDEMO.iiIIiiiiIiIIi.roleUnit.iIiIiiiiIiIii;
        List IiiiiiiiIIIII6 = this.ALLATORIxDEMO.iiIIiiiiIiIIi.getObjectArea().ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII4.getMapid().intValue(), IiiiiiiiIIIII4.getX(), IiiiiiiiIIIII4.getY(), 0, (int)iIiIiiiiiiiIi.ALLATORIxDEMO((iIiIiiiiiiiIi)this.ALLATORIxDEMO).getMapId(), IiiiiiiiIIIII2, IiiiiiiiIIIII3, 0, 0, this.ALLATORIxDEMO.iiIIiiiiIiIIi.roleData);
        if (IiiiiiiiIIIII6 == null) {
            this.ALLATORIxDEMO.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u4f60\u6240\u5728\u4f4d\u7f6e\u65e0\u6cd5\u8fbe\u5230\u76ee\u7684\u5730");
            return;
        }
        this.ALLATORIxDEMO.iiIIiiiiIiIIi.automation.ALLATORIxDEMO(IiiiiiiiIIIII6);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }
}
