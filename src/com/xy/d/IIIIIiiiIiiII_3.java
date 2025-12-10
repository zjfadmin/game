/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.iIIiiiiiIIIIi
 *  com.xy.bean.MonsterBean
 *  com.xy.d.iiIiIiiiiIiii
 *  com.xy.d.iiiiiiiiiiIiI
 *  com.xy.n.iIiIIiiiIiiiI
 *  com.xy.socket.Agreement
 *  com.xy.text.GameView
 *  com.xy.v.iiIiIiiiIIIiI
 *  com.xy.v.iiiiiiiiIIIII
 *  com.xy.w.IIIIIiiiIiiII
 */
package com.xy.d;

import com.xy.a.iIIiiiiiIIIIi;
import com.xy.bean.MonsterBean;
import com.xy.d.iiIiIiiiiIiii;
import com.xy.d.iiiiiiiiiiIiI;
import com.xy.n.iIiIIiiiIiiiI;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import com.xy.v.iiIiIiiiIIIiI;
import com.xy.v.iiiiiiiiIIIII;
import java.awt.Graphics;
import java.awt.Image;
import java.math.BigDecimal;

public class IIIIIiiiIiiII
extends iiiiiiiiiiIiI {
    public MonsterBean IiiiiiiiIIIII;
    public static Image[] ALLATORIxDEMO = new Image[4];

    public void ALLATORIxDEMO(long time, iIiIIiiiIiiiI mapScene) {
        this.iiiiIiiiIIiii += time;
        if (this.IIiiIiiiIIiIi != null) {
            this.IIiiIiiiIIiIi.ALLATORIxDEMO(time);
        }
        if (this.IiiiiiiiIIIII.getFollow() != null) {
            iiIiIiiiiIiii IiiiiiiiIIIII = mapScene.ALLATORIxDEMO(this.IiiiiiiiIIIII.getFollow());
            if (IiiiiiiiIIIII == null) return;
            this.ALLATORIxDEMO(IiiiiiiiIIIII.ALLATORIxDEMO(), IiiiiiiiIIIII.ALLATORIxDEMO());
            return;
        }
        if (this.IiIiiiiiIIIII == null) return;
        if (this.IiiiiiiiIIIII.getType() == 0 && this.IiIiiiiiIIIII.ALLATORIxDEMO(time, (iiiiiiiiiiIiI)this)) {
            this.ALLATORIxDEMO(1);
            return;
        }
        this.ALLATORIxDEMO(2);
    }

    public IIIIIiiiIiiII(MonsterBean monsterBean) {
        this.iIIiIiiiiiiIi = 5;
        this.ALLATORIxDEMO(monsterBean);
    }

    public int ALLATORIxDEMO(iiiiiiiiiiIiI unit) {
        if (unit.IIIIiiiiiiiII <= this.IIIIiiiiiiiII) return -1;
        return 1;
    }

    public void iiiIiiiiiiIIi(Graphics g) {
    }

    public void ALLATORIxDEMO(MonsterBean monsterBean) {
        try {
            this.IiiiiiiiIIIII = monsterBean;
            this.iiIiIiiiiIIIi = monsterBean.getX();
            this.IIiiiiiiiIIIi = monsterBean.getY();
            this.IiiiiiiiIIIII = (MonsterBean)false;
            this.IIIiiiiiIIiII = monsterBean.getRobotname();
            this.iiiIiiiiiiiIi = monsterBean.getRobottitle();
            this.ALLATORIxDEMO(monsterBean.getRobotskin(), null);
            if (monsterBean.getMovePath() == null) return;
            this.ALLATORIxDEMO(0, monsterBean.getMovePath().getTime(), monsterBean.getMovePath().toString());
            return;
        }
        catch (Exception IiiiiiiiIIIII) {
            IiiiiiiiIIIII.printStackTrace();
        }
    }

    public void ALLATORIxDEMO(GameView gameView) {
        if (this.IiiiiiiiIIIII.getRobottype() == 3) {
            iiIiIiiiiIiii.ALLATORIxDEMO((iiiiiiiiiiIiI)this, (GameView)gameView);
            return;
        }
        if (this.IiiiiiiiIIIII.getRobottype() == 1) {
            int IiiiiiiiIIIII = gameView.roleData.getGoodPackSum(-1L, new BigDecimal(-1), 999);
            if (IiiiiiiiIIIII <= 0) {
                gameView.iIiIiiiiIIiii("\u80cc\u5305\u5df2\u6ee1\uff01\uff01\uff01");
                return;
            }
            String IiiiiiiiIIIII2 = Agreement.getSendTextAES((String)"clickmonsters", (String)("" + this.IiiiiiiiIIIII.getI()));
            gameView.getClient().ALLATORIxDEMO(IiiiiiiiIIIII2);
            return;
        }
        if (this.IiiiiiiiIIIII.getRobottype() >= 100 && this.IiiiiiiiIIIII.getRobottype() <= 199) {
            if (this.IiiiiiiiIIIII.getRobottype() == 120 || this.IiiiiiiiIIIII.getRobottype() == 121) {
                if (gameView.getMouseIndex() != iiIiIiiiIIIiI.IiIiiiiiIIIII) return;
                String IiiiiiiiIIIII = Agreement.getSendTextAES((String)"gangbattle", (String)("M" + this.IiiiiiiiIIIII.getI() + "|\u653b\u51fb"));
                gameView.getClient().ALLATORIxDEMO(IiiiiiiiIIIII);
                gameView.setMouseIndex(iiIiIiiiIIIiI.IiIIIiiiiIiiI);
                return;
            }
            if (this.IiiiiiiiIIIII.getRobottype() == 132) {
                iIIiiiiiIIIIi IiiiiiiiIIIII = (iIIiiiiiIIIIi)gameView.getFormManagement().iiiIiiiiiiIIi(27);
                IiiiiiiiIIIII.ALLATORIxDEMO(this);
                return;
            }
            String IiiiiiiiIIIII = Agreement.getSendTextAES((String)"gangmonitor", (String)("M" + this.IiiiiiiiIIIII.getI()));
            gameView.getClient().ALLATORIxDEMO(IiiiiiiiIIIII);
            return;
        }
        iIIiiiiiIIIIi IiiiiiiiIIIII = (iIIiiiiiIIIIi)gameView.getFormManagement().iiiIiiiiiiIIi(27);
        IiiiiiiiIIIII.ALLATORIxDEMO(this);
    }

    public void ALLATORIxDEMO(iiiiiiiiIIIII four, int type) {
        this.iiIiIiiiiIIIi = four.ALLATORIxDEMO + 5;
        this.IIiiiiiiiIIIi = four.IiIIIiiiiIiiI + 5;
        this.iiIiiiiiiiIii = four.iiIiiiiiiiIii;
        this.ALLATORIxDEMO(type);
    }

    static {
        IIIIIiiiIiiII.ALLATORIxDEMO[0] = com.xy.w.IIIIIiiiIiiII.iiiIiiiiiiIIi((String)"sc/b/75_png.xy2uiimg.sempty.png");
        IIIIIiiiIiiII.ALLATORIxDEMO[1] = com.xy.w.IIIIIiiiIiiII.iiiIiiiiiiIIi((String)"sc/b/6_png.xy2uiimg.hps.png");
        IIIIIiiiIiiII.ALLATORIxDEMO[2] = com.xy.w.IIIIIiiiIiiII.iiiIiiiiiiIIi((String)"sc/b/2_png.xy2uiimg.mps.png");
        IIIIIiiiIiiII.ALLATORIxDEMO[3] = com.xy.w.IIIIIiiiIiiII.iiiIiiiiiiIIi((String)"sc/b/wait.png");
    }

    public void ALLATORIxDEMO(Graphics g) {
        if (this.IiiiiiiiIIIII.getHP() == null) return;
        int IiiiiiiiIIIII = (int)(75.0 * (double)this.IiiiiiiiIIIII.getHP().getX() / (double)this.IiiiiiiiIIIII.getHP().getY());
        if (IiiiiiiiIIIII > 75) {
            IiiiiiiiIIIII = 75;
        } else if (IiiiiiiiIIIII < 0) {
            IiiiiiiiIIIII = 0;
        }
        g.drawImage(ALLATORIxDEMO[0], this.iiIiiiiiiIIiI - 35, this.iIiiIiiiIiIIi - 125, 75, 5, null);
        g.drawImage(ALLATORIxDEMO[1], this.iiIiiiiiiIIiI - 35, this.iIiiIiiiIiIIi - 125, IiiiiiiiIIIII, 5, null);
    }
}
