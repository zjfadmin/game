/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.iIIiiiiiIIIIi
 *  com.xy.d.iiIiIiiiiIiii
 *  com.xy.d.iiiiiiiiiiIiI
 *  com.xy.game.Task
 *  com.xy.game.TaskProgress
 *  com.xy.i.IIIIIiiiIiIii
 *  com.xy.readbean.Activity
 *  com.xy.readbean.NpcInfoBean
 *  com.xy.readbean.Npctable
 *  com.xy.socket.Agreement
 *  com.xy.text.GameView
 *  com.xy.v.IIiiIiiiiIIiI
 *  com.xy.v.IiiiiiiiiIIII
 *  com.xy.v.iIiIIiiiIiiiI
 *  com.xy.v.iiIiIiiiIIIiI
 */
package com.xy.d;

import com.xy.a.iIIiiiiiIIIIi;
import com.xy.d.iiIiIiiiiIiii;
import com.xy.d.iiiiiiiiiiIiI;
import com.xy.game.Task;
import com.xy.game.TaskProgress;
import com.xy.i.IIIIIiiiIiIii;
import com.xy.readbean.Activity;
import com.xy.readbean.NpcInfoBean;
import com.xy.readbean.Npctable;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import com.xy.v.IIiiIiiiiIIiI;
import com.xy.v.IiiiiiiiiIIII;
import com.xy.v.iIiIIiiiIiiiI;
import com.xy.v.iiIiIiiiIIIiI;
import java.awt.Graphics;
import java.util.List;

public class IIiIiiiiIiIII
extends iiiiiiiiiiIiI {
    public static final List<String> iiiiIiiiIiiII = IIiiIiiiiIIiI.ALLATORIxDEMO((String)"5-9|12-18|31|38-40|44-48|50|54|57|58|60|61|66|69|71|77|78");
    public Npctable iiiIiiiiiiiIi;
    private int iIiiIiiiiiiII;
    public NpcInfoBean IIiiIiiiIIiIi;
    private String iIiIiiiiIiIii;
    private int IiIIIiiiiIiiI;

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     */
    public void ALLATORIxDEMO(NpcInfoBean npcInfoBean) {
        int n;
        try {
            IIiIiiiiIiIII iIiIiiiiIiIII = this;
            this.IIiiIiiiIIiIi = npcInfoBean;
            this.iiiIiiiiiiiIi = npcInfoBean.getNpctable();
            this.iiIiIiiiiIIIi = Integer.parseInt(this.iiiIiiiiiiiIi.getTx());
            this.IIiiiiiiiIIIi = Integer.parseInt(this.iiiIiiiiiiiIi.getTy());
            this.IiiiiiiiIIIII = 0;
            this.IIIiiiiiIIiII = this.iiiIiiiiiiiIi.getNpcname();
            this.iiiIiiiiiiiIi = this.iiiIiiiiiiiIi.getTitle();
            n = !IIiiIiiiiIIiI.iIiIiiiiIIiIi((String)this.iiiIiiiiiiiIi.getDir()) ? iiiiiiiiiiIiI.ALLATORIxDEMO((int)Integer.parseInt(this.iiiIiiiiiiiIi.getDir())) : 3;
        }
        catch (Exception IiiiiiiiIIIII) {
            IiiiiiiiIIIII.printStackTrace();
            return;
        }
        {
            iIiIiiiiIiIII.iiIiiiiiiiIii = n;
            this.ALLATORIxDEMO(this.iiiIiiiiiiiIi.getSkin(), null);
            this.iIiIiiiiIIiIi();
            return;
        }
    }

    public String iIiIiiiiIIiii() {
        if (this.IiIIIiiiiIiiI == 0) {
            return null;
        }
        this.iIiiIiiiiiiII += 60;
        if (this.IiIIIiiiiIiiI > this.iIiiIiiiiiiII) {
            return null;
        }
        this.iIiiIiiiiiiII -= this.IiIIIiiiiIiiI;
        this.ALLATORIxDEMO(this.iIiIiiiiIiIii);
        return this.iIiIiiiiIiIii;
    }

    public void ALLATORIxDEMO(GameView gameView) {
        if (gameView.getMouseIndex() == iiIiIiiiIIIiI.IiIIIiiiiIiiI) {
            IIiIiiiiIiIII.ALLATORIxDEMO(this, this.IIiiIiiiIIiIi, gameView);
            return;
        }
        if (gameView.getMouseIndex() != iiIiIiiiIIIiI.iiIiiiiiiiIii) return;
        iiIiIiiiiIiii.ALLATORIxDEMO((iiiiiiiiiiIiI)this, (GameView)gameView);
    }

    public void iiiIiiiiiiIIi(Graphics g) {
    }

    public int ALLATORIxDEMO(iiiiiiiiiiIiI unit) {
        if (unit.IIIIiiiiiiiII <= this.IIIIiiiiiiiII) return -1;
        return 1;
    }

    public void iIiIiiiiIIiIi() {
        this.iIiiIiiiiiiII = 0;
        this.IiIIIiiiiIiiI = 0;
        this.iIiIiiiiIiIii = null;
        if (IIiiIiiiiIIiI.iIiIiiiiIIiIi((String)this.iiiIiiiiiiiIi.getTicktxt())) return;
        if (IIiiIiiiiIIiI.iIiIiiiiIIiIi((String)this.iiiIiiiiiiiIi.getTick())) {
            return;
        }
        this.IiIIIiiiiIiiI = Integer.parseInt(this.iiiIiiiiiiiIi.getTick());
        if (this.IiIIIiiiiIiiI <= 0) {
            this.IiIIIiiiiIiiI = 0;
            return;
        }
        this.iIiIiiiiIiIii = this.iiiIiiiiiiiIi.getTicktxt();
    }

    public IIiIiiiiIiIII(NpcInfoBean npcInfoBean) {
        this.iIIiIiiiiiiIi = 2;
        this.ALLATORIxDEMO(npcInfoBean);
    }

    public static void ALLATORIxDEMO(IIiIiiiiIiIII npcUnit, NpcInfoBean npc, GameView gameView) {
        int IiiiiiiiIIIII;
        Object IiiiiiiiIIIII2;
        TaskProgress IiiiiiiiIIIII3;
        IiiiiiiiiIIII IiiiiiiiIIIII4;
        Npctable IiiiiiiiIIIII5 = npc.getNpctable();
        if (IIiiIiiiiIIiI.iIiIiiiiIIiIi((String)IiiiiiiiIIIII5.getNpctype())) {
            return;
        }
        int IiiiiiiiIIIII6 = Integer.parseInt(IiiiiiiiIIIII5.getNpctype());
        if (IiiiiiiiIIIII6 == 1002 || IiiiiiiiIIIII6 == 1107 || IiiiiiiiIIIII6 == 521 || IiiiiiiiIIIII6 >= 1101 && IiiiiiiiIIIII6 <= 1105 || IiiiiiiiIIIII6 >= 510 && IiiiiiiiIIIII6 <= 514 || IiiiiiiiIIIII6 == 2020 || IiiiiiiiIIIII6 == 2022 || IiiiiiiiIIIII6 == 2023) {
            String IiiiiiiiIIIII7 = Agreement.getSendTextAES((String)"gangmonitor", (String)String.valueOf(IiiiiiiiIIIII6));
            gameView.getClient().ALLATORIxDEMO(IiiiiiiiIIIII7);
            return;
        }
        if (IiiiiiiiIIIII6 == 156) {
            IiiiiiiiIIIII4 = gameView.getObjectArea();
            IiiiiiiiIIIII3 = gameView.baseView.ALLATORIxDEMO();
            IiiiiiiiIIIII2 = null;
            IiiiiiiiIIIII = 0;
            while (IiiiiiiiIIIII < IiiiiiiiIIIII3.size()) {
                Activity IiiiiiiiIIIII8;
                IIIIIiiiIiIii IiiiiiiiIIIII9 = (IIIIIiiiIiIii)IiiiiiiiIIIII3.get(IiiiiiiiIIIII);
                Activity activity = IiiiiiiiIIIII8 = IiiiiiiiIIIII9.ALLATORIxDEMO() > 100 && IiiiiiiiIIIII9.ALLATORIxDEMO() < 200 ? IiiiiiiiIIIII4.ALLATORIxDEMO(IiiiiiiiIIIII9.ALLATORIxDEMO()) : null;
                if (IiiiiiiiIIIII8 != null && IiiiiiiiIIIII8.getModelId() == 3) {
                    IiiiiiiiIIIII2 = IiiiiiiiIIIII8;
                    break;
                }
                ++IiiiiiiiIIIII;
            }
            if (IiiiiiiiIIIII2 != null) {
                String IiiiiiiiIIIII10 = Agreement.getSendTextAES((String)"activity", (String)(String.valueOf(IiiiiiiiIIIII2.getId()) + "|N"));
                gameView.getClient().ALLATORIxDEMO(IiiiiiiiIIIII10);
                return;
            }
        }
        if ((IiiiiiiiIIIII4 = gameView.roleData.getTaskSystem().ALLATORIxDEMO("\u7b54\u9898", npc.getNpctable().getNpcname())) != null) {
            IiiiiiiiIIIII3 = IiiiiiiiIIIII4.getProgressFinish("\u7b54\u9898", npc.getNpctable().getNpcname());
            IiiiiiiiIIIII2 = (iIIiiiiiIIIIi)gameView.getFormManagement().iiiIiiiiiiIIi(27);
            IiiiiiiiIIIII2.ALLATORIxDEMO(npcUnit, npc, (Task)IiiiiiiiIIIII4, IiiiiiiiIIIII3);
            return;
        }
        IiiiiiiiIIIII3 = gameView.roleUnit.ALLATORIxDEMO();
        if (IiiiiiiiIIIII3 != null && ((TaskProgress)IiiiiiiiIIIII3).length > 1 && iiiiIiiiIiiII.contains(IiiiiiiiIIIII5.getNpctype())) {
            IiiiiiiiIIIII2 = Agreement.getSendTextAES((String)"npcdialog", (String)npc.getNpctable().getNpcid());
            gameView.getClient().ALLATORIxDEMO((String)IiiiiiiiIIIII2);
        } else {
            IiiiiiiiIIIII2 = (iIIiiiiiIIIIi)gameView.getFormManagement().iiiIiiiiiiIIi(27);
            IiiiiiiiIIIII2.iIiIiiiiIIiii(npcUnit, npc, IiiiiiiiIIIII6);
        }
        IiiiiiiiIIIII4 = gameView.roleData.getTaskSystem().ALLATORIxDEMO("\u95ee\u5019", npc.getNpctable().getNpcname());
        if (IiiiiiiiIIIII4 == null) return;
        IiiiiiiiIIIII2 = IiiiiiiiIIIII4.getTaskData().getUnknowType("\u8bbf\u95ee\u8bfb\u6761");
        if (IIiiIiiiiIIiI.iIiIiiiiIIiIi((String)IiiiiiiiIIIII2)) {
            String IiiiiiiiIIIII11 = Agreement.getSendTextAES((String)"taskN", (String)("W" + IiiiiiiiIIIII4.getTaskId() + "|" + npc.getNpctable().getNpcname()));
            gameView.getClient().ALLATORIxDEMO(IiiiiiiiIIIII11);
            return;
        }
        IiiiiiiiIIIII = ((String)IiiiiiiiIIIII2).indexOf("#");
        long IiiiiiiiIIIII12 = IIiiIiiiiIIiI.ALLATORIxDEMO((String)IiiiiiiiIIIII2, (int)0, (int)IiiiiiiiIIIII) * 1000L;
        gameView.getGameReadBar().setReadBar(IiiiiiiiIIIII4.getTaskId(), 5, ((String)IiiiiiiiIIIII2).substring(IiiiiiiiIIIII + 1), (double)IiiiiiiiIIIII12, iIiIIiiiIiiiI.ALLATORIxDEMO(), (Object)("W" + IiiiiiiiIIIII4.getTaskId() + "|" + npc.getNpctable().getNpcname()));
    }
}
