/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.IiIIIiiiiIIiI
 *  com.xy.a.q.IiIIIiiiiIiii
 *  com.xy.bean.FightingForesee
 *  com.xy.bean.FriendBean
 *  com.xy.bean.RoleShow
 *  com.xy.d.IIiiIiiiiIIiI
 *  com.xy.d.iiiiiiiiiiIiI
 *  com.xy.entity.Friend
 *  com.xy.game.GameMove
 *  com.xy.game.HandleOption
 *  com.xy.game.RoleData
 *  com.xy.n.IIIIIiiiIiiII
 *  com.xy.n.iIiIIiiiIiiiI
 *  com.xy.n.iiIiIiiiiIiii
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.readbean.Door
 *  com.xy.scene.BangFightScene
 *  com.xy.socket.Agreement
 *  com.xy.text.GameView
 *  com.xy.text.SystemData
 *  com.xy.v.IIiiIiiiiIIiI
 *  com.xy.v.IiiiIiiiiIIII
 *  com.xy.v.IiiiIiiiiIiIi
 *  com.xy.v.iiIiIiiiIIIiI
 *  com.xy.v.iiIiiiiiIIiii
 *  com.xy.v.iiiiiiiiIIIII
 *  com.xy.w.IIIIIiiiIiIii
 *  com.xy.w.IIiIiiiiIiiIi
 */
package com.xy.d;

import com.xy.a.IiIIIiiiiIIiI;
import com.xy.a.q.IiIIIiiiiIiii;
import com.xy.bean.FightingForesee;
import com.xy.bean.FriendBean;
import com.xy.bean.RoleShow;
import com.xy.d.IIiiIiiiiIIiI;
import com.xy.d.iiiiiiiiiiIiI;
import com.xy.entity.Friend;
import com.xy.game.GameMove;
import com.xy.game.HandleOption;
import com.xy.game.RoleData;
import com.xy.n.IIIIIiiiIiiII;
import com.xy.n.iIiIIiiiIiiiI;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.readbean.Door;
import com.xy.scene.BangFightScene;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import com.xy.text.SystemData;
import com.xy.v.IiiiIiiiiIIII;
import com.xy.v.IiiiIiiiiIiIi;
import com.xy.v.iiIiIiiiIIIiI;
import com.xy.v.iiIiiiiiIIiii;
import com.xy.v.iiiiiiiiIIIII;
import com.xy.w.IIIIIiiiIiIii;
import com.xy.w.IIiIiiiiIiiIi;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class iiIiIiiiiIiii
extends iiiiiiiiiiIiI {
    public long iiiIiiiiiiiIi = 0L;
    private String[] IIiiIiiiIIiIi;
    public RoleShow iIiIiiiiIiIii;
    private boolean IiIIIiiiiIiiI;
    private List<iiiiiiiiIIIII> iiIiiiiiiiIii;
    private boolean IiiiiiiiIIIII;
    private IIiiIiiiiIIiI ALLATORIxDEMO;

    public void iiiiiiiiIIiii() {
        if (this.iiIiiiiiiiIii == null) {
            return;
        }
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iiIiiiiiiiIii.size()) {
            this.iiIiiiiiiiIii.get(++IiiiiiiiIIIII).ALLATORIxDEMO(this.iiIiIiiiiIIIi, this.IIiiiiiiiIIIi, this.iiIiiiiiiiIii, this.iiIIIiiiiiiiI.iiiIiiiiiiIIi());
        }
    }

    public static void ALLATORIxDEMO(BigDecimal id, GameView gameView) {
        gameView.setMouseIndex(iiIiIiiiIIIiI.IiIIIiiiiIiiI);
        if (!iiIiIiiiiIiii.iiiIiiiiiiIIi(gameView)) {
            return;
        }
        String IiiiiiiiIIIII = Agreement.getSendTextAES((String)"team2", (String)id.toString());
        gameView.getClient().ALLATORIxDEMO(IiiiiiiiIIIII);
    }

    public String[] ALLATORIxDEMO() {
        return this.IIiiIiiiIIiIi;
    }

    public boolean iIiIiiiiIIiIi() {
        if (this.iIiIiiiiIiIii.getTroop_id() == null) return true;
        if (this.IIiiIiiiIIiIi != null) return true;
        if (this.IIiiIiiiIIiIi != null) return false;
        if (com.xy.v.IIiiIiiiiIIiI.iIiIiiiiIIiIi((String)this.iIiIiiiiIiIii.getTeamInfo())) return true;
        return false;
    }

    public void iiiIiiiiiiIIi(GameView gameView) {
        if (gameView.getBattleScene() != null) return;
        if (IiiiIiiiiIiIi.iIiIiiiiIiIii.nextInt(20) != 0) {
            return;
        }
        RoleData IiiiiiiiIIIII = gameView.roleData;
        if (IiiiiiiiIIIII.getTaskSystem().getTaskXL(gameView.mapScene.ALLATORIxDEMO())) {
            HandleOption.iIiIiiiiIIiii((int)3, (GameView)gameView);
            return;
        }
        if (!gameView.mapScene.iiiiIiiiIiiII) {
            return;
        }
        if (IiiiiiiiIIIII.getLimit("\u6444\u5996\u9999") != null && IiiiIiiiiIIII.ALLATORIxDEMO((int)IiiiiiiiIIIII.getLoginResult().getGrade()) - 10 > gameView.mapScene.ALLATORIxDEMO().getMapLvl()) {
            return;
        }
        HandleOption.iIiIiiiiIIiii((int)0, (GameView)gameView);
    }

    public void iIiIiiiiIIiii(int type) {
        if (this.iiIiiiiiiiIii == null) {
            return;
        }
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iiIiiiiiiiIii.size()) {
            iiiiiiiiIIIII iiiiiiiiIIIII2 = this.iiIiiiiiiiIii.get(IiiiiiiiIIIII);
            ++IiiiiiiiIIIII;
            iiiiiiiiIIIII2.ALLATORIxDEMO(type);
        }
    }

    public boolean iiiIiiiiiiIIi() {
        if (this.iIiIiiiiIiIii.getBooth_id() != null) return false;
        return true;
    }

    public static void iIiIiiiiIIiii(GameView gameView) {
        gameView.setMouseIndex(iiIiIiiiIIIiI.IiIIIiiiiIiiI);
        if (!iiIiIiiiiIiii.iiiIiiiiiiIIi(gameView)) {
            return;
        }
        String IiiiiiiiIIIII = Agreement.getSendTextAES((String)"team1", null);
        gameView.getClient().ALLATORIxDEMO(IiiiiiiiIIIII);
    }

    public void iIiIiiiiIIiii(boolean shadowUnit) {
        this.ALLATORIxDEMO = shadowUnit ? new IIiiIiiiiIIiI((iiiiiiiiiiIiI)this) : null;
    }

    public void ALLATORIxDEMO(boolean fly, boolean mount) {
        this.IiiiiiiiIIIII = fly;
        this.IiIIIiiiiIiiI = false;
    }

    public static void iIiIiiiiIIiii(iiIiIiiiiIiii roleUnit, GameView gameView) {
        boolean IiiiiiiiIIIII;
        gameView.setMouseIndex(iiIiIiiiIIIiI.IiIIIiiiiIiiI);
        if (!gameView.roleUnit.iIiIiiiiIIiIi()) {
            gameView.iIiIiiiiIIiii("\u961f\u5458\u6ca1\u6709\u6743\u9650\u64cd\u4f5c");
            return;
        }
        if (roleUnit.iIiIiiiiIiIii.getFighting() != 0) {
            String IiiiiiiiIIIII2 = Agreement.getSendTextAES((String)"battleconnection", (String)String.valueOf(roleUnit.iIiIiiiiIiIii.getFighting()));
            gameView.getClient().ALLATORIxDEMO(IiiiiiiiIIIII2);
            return;
        }
        boolean bl = IiiiiiiiIIIII = gameView.roleUnit == roleUnit;
        if (IiiiiiiiIIIII) {
            return;
        }
        if (gameView.mapScene.iiIiiiiiiiIii.getMapId() == 3315L && gameView.scene != null && gameView.scene instanceof BangFightScene) {
            BangFightScene IiiiiiiiIIIII3 = (BangFightScene)gameView.scene;
            if (IiiiiiiiIIIII3.manstate == 1) {
                gameView.iIiIiiiiIIiii("\u4f60\u9700\u8981\u7b49\u5f85\u4e00\u6bb5\u65f6\u95f4\u624d\u80fd\u6295\u5165\u6218\u6597");
                return;
            }
            if (!IiiiiiiiIIIII3.ALLATORIxDEMO()) {
                gameView.iIiIiiiiIIiii("\u4f60\u5f53\u524d\u72b6\u6001\u88ab\u9650\u5236");
                return;
            }
            if ((gameView.roleUnit.IIiiIiiiIIiIi != null ? gameView.roleUnit.IIiiIiiiIIiIi.length : 1) < BangFightScene.MINSUM) {
                gameView.iIiIiiiiIIiii("\u6700\u5c11\u4eba\u6570" + BangFightScene.MINSUM);
                return;
            }
            iiIiIiiiiIiii.ALLATORIxDEMO(roleUnit, 11, gameView);
            return;
        }
        if (gameView.roleUnit.iIiIiiiiIiIii.getGrade() < 30 || roleUnit.iIiIiiiiIiIii.getGrade() < 30) {
            gameView.iIiIiiiiIIiii("\u7981\u6b6230\u7ea7\u4ee5\u5185\u7684\u5207\u78cb");
            return;
        }
        if (gameView.roleUnit.iIiIiiiiIiIii.getBooth_id() != null || roleUnit.iIiIiiiiIiIii.getBooth_id() != null) {
            gameView.iIiIiiiiIIiii("\u4f60\u6216\u8005\u73a9\u5bb6\u5904\u4e8e\u6446\u644a\u72b6\u6001");
            return;
        }
        String[] IiiiiiiiIIIII4 = roleUnit.IIiiIiiiIIiIi;
        if (IiiiiiiiIIIII4 == null) {
            IiiiiiiiIIIII4 = roleUnit.iIiIiiiiIiIii.getTeam().split("\\|");
        }
        int IiiiiiiiIIIII5 = 0;
        while (IiiiiiiiIIIII5 < IiiiiiiiIIIII4.length) {
            if (IiiiiiiiIIIII4[IiiiiiiiIIIII5].equals(gameView.roleUnit.IIIiiiiiIIiII)) {
                gameView.iIiIiiiiIIiii("\u73a9\u5bb6\u662f\u4f60\u7684\u961f\u5458");
                return;
            }
            ++IiiiiiiiIIIII5;
        }
        iiIiIiiiiIiii.ALLATORIxDEMO(roleUnit, 5, gameView);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     */
    public static boolean ALLATORIxDEMO(String msg) {
        if (com.xy.v.IIiiIiiiiIIiI.iIiIiiiiIIiIi((String)msg)) {
            return false;
        }
        try {
            if (Integer.parseInt(msg.split("\\|")[1]) == 0) return false;
            return true;
        }
        catch (Exception IiiiiiiiIIIII) {
            IiiiiiiiIIIII.printStackTrace();
            return false;
        }
    }

    public static boolean iiiIiiiiiiIIi(GameView gameView) {
        if (gameView.roleUnit.iIiIiiiiIiIii.getMapid() == 3321L || gameView.roleUnit.iIiIiiiiIiIii.getMapid() == 3322L) {
            gameView.iIiIiiiiIIiii("\u8be5\u5730\u56fe\u65e0\u6cd5\u7ec4\u961f");
            return false;
        }
        if (iiIiIiiiiIiii.ALLATORIxDEMO(gameView.roleData.getLoginResult().getTaskDaily())) {
            gameView.iIiIiiiiIIiii("\u5750\u7262\u72b6\u6001\u65e0\u6cd5\u7ec4\u961f");
            return false;
        }
        if (gameView.roleUnit.iIiIiiiiIiIii.getTroop_id() == null) return true;
        gameView.iIiIiiiiIIiii("\u4f60\u5df2\u7ecf\u6709\u961f\u4f0d\u4e86");
        return false;
    }

    public void iIiIiiiiIIiii(Graphics g) {
        int IiiiiiiiIIIII;
        if (this.IIIiiiiiIIiII == null) {
            return;
        }
        Graphics2D IiiiiiiiIIIII2 = (Graphics2D)g;
        Object IiiiiiiiIIIII3 = IiiiiiiiIIIII2.getRenderingHint(RenderingHints.KEY_STROKE_CONTROL);
        Object IiiiiiiiIIIII4 = IiiiiiiiIIIII2.getRenderingHint(RenderingHints.KEY_ANTIALIASING);
        if (IiiiiiiiIIIII3 != RenderingHints.VALUE_STROKE_DEFAULT) {
            IiiiiiiiIIIII2.setRenderingHint(RenderingHints.KEY_STROKE_CONTROL, RenderingHints.VALUE_STROKE_DEFAULT);
        } else {
            IiiiiiiiIIIII3 = null;
        }
        if (IiiiiiiiIIIII4 != RenderingHints.VALUE_ANTIALIAS_ON) {
            IiiiiiiiIIIII2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        } else {
            IiiiiiiiIIIII4 = null;
        }
        g.setFont(iiIIiiiiIiiII.iIiIiiiiIiiii);
        int IiiiiiiiIIIII5 = this.iIiiIiiiIiIIi + 28;
        if (SystemData.ISTITLE && this.iiiIiiiiiiiIi != null) {
            if (this.ALLATORIxDEMO == false) {
                this.ALLATORIxDEMO = (IIiiIiiiiIIiI)(g.getFontMetrics().stringWidth((String)this.iiiIiiiiiiiIi) / 2);
            }
            int n = this.iiIiiiiiiIIiI - this.ALLATORIxDEMO;
            g.setColor(iiIIiiiiIiiII.iiiiiiiiIIIii);
            g.drawString((String)this.iiiIiiiiiiiIi, IiiiiiiiIIIII + 1, IiiiiiiiIIIII5 + 1);
            g.setColor(iiIIiiiiIiiII.iiIIIiiiIiiIi);
            int n2 = IiiiiiiiIIIII5;
            IiiiiiiiIIIII5 += 19;
            g.drawString((String)this.iiiIiiiiiiiIi, IiiiiiiiIIIII, n2);
        }
        if (this.iIiIiiiiIiIii == false) {
            this.iIiIiiiiIiIii = (RoleShow)(g.getFontMetrics().stringWidth(this.IIIiiiiiIIiII) / 2);
        }
        IiiiiiiiIIIII = this.iiIiiiiiiIIiI - this.iIiIiiiiIiIii;
        if (this.iIiIiiiiIiIii.getSkill_id() != null) {
            Image IiiiiiiiIIIII6 = IIiIiiiiIiiIi.iiiIiiiiiiIIi((int)this.iIiIiiiiIiIii.getSkill_id());
            g.drawImage(IiiiiiiiIIIII6, IiiiiiiiIIIII - 28, IiiiiiiiIIIII5 - 18, null);
        }
        g.setColor(iiIIiiiiIiiII.iiiiiiiiIIIii);
        g.drawString(this.IIIiiiiiIIiII, IiiiiiiiIIIII + 1, IiiiiiiiIIIII5 + 1);
        g.setColor(iiIIiiiiIiiII.ALLATORIxDEMO((int)this.iIiIiiiiIiIii.getTurnAround()));
        g.drawString(this.IIIiiiiiIIiII, IiiiiiiiIIIII, IiiiiiiiIIIII5);
        if (IiiiiiiiIIIII3 != null) {
            IiiiiiiiIIIII2.setRenderingHint(RenderingHints.KEY_STROKE_CONTROL, IiiiiiiiIIIII3);
        }
        if (IiiiiiiiIIIII4 == null) return;
        IiiiiiiiIIIII2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, IiiiiiiiIIIII4);
    }

    /*
     * WARNING - void declaration
     */
    public static void ALLATORIxDEMO(iiIiIiiiiIiii roleUnit, int type, GameView gameView) {
        void IiiiiiiiIIIII;
        FightingForesee fightingForesee = new FightingForesee();
        IiiiiiiiIIIII.setYidui(gameView.roleUnit.iIiIiiiiIiIii.getTeam());
        IiiiiiiiIIIII.setErdui(roleUnit.iIiIiiiiIiIii.getTeam());
        IiiiiiiiIIIII.setType(type);
        String IiiiiiiiIIIII2 = Agreement.getSendTextAES((String)"fig2", (String)iiIiiiiiIIiii.ALLATORIxDEMO().toJson(IiiiiiiiIIIII));
        gameView.getClient().ALLATORIxDEMO(IiiiiiiiIIIII2);
    }

    public void iIiIiiiiIIiii(String title) {
        this.iIiIiiiiIiIii.setTitle(title);
        super.iIiIiiiiIIiii(title);
    }

    public void IiiIiiiiiiIiI() {
        this.IIiiIiiiIIiIi = null;
        if (this.iIiIiiiiIiIii.getTroop_id() == null || com.xy.v.IIiiIiiiiIIiI.iIiIiiiiIIiIi((String)this.iIiIiiiiIiIii.getTeamInfo())) {
            this.IIiiIiiiIIiIi = new String[]{this.iIiIiiiiIiIii.getRolename()};
            this.iIiIiiiiIiIii.setCaptian(0);
            return;
        }
        this.IIiiIiiiIIiIi = this.iIiIiiiiIiIii.getTeamInfo().split("\\|");
        if (!this.IIiiIiiiIIiIi[0].equals(this.iIiIiiiiIiIii.getRolename())) {
            this.IIiiIiiiIIiIi = null;
        }
        this.iIiIiiiiIiIii.setCaptian(this.IIiiIiiiIIiIi != null ? 1 : 0);
    }

    public void ALLATORIxDEMO(long time, iIiIIiiiIiiiI mapScene) {
        this.iiiiIiiiIIiii += time;
        if (this.IIiiIiiiIIiIi != null) {
            this.IIiiIiiiIIiIi.ALLATORIxDEMO(time);
        }
        if (this.ALLATORIxDEMO() && this.iIiIiiiiIIiIi()) {
            if (this.IiIiiiiiIIIII.ALLATORIxDEMO(time, (iiiiiiiiiiIiI)this)) {
                this.ALLATORIxDEMO(1);
            } else {
                this.ALLATORIxDEMO(2);
                this.iIiIiiiiIIiii(2);
            }
            this.iIiIiiiiIIiIi();
            if (this.IIiiIiiiIIiIi != null) {
                iiIiIiiiiIiii IiiiiiiiIIIII = this;
                int IiiiiiiiIIIII2 = 1;
                while (IiiiiiiiIIIII2 < this.IIiiIiiiIIiIi.length) {
                    iiIiIiiiiIiii IiiiiiiiIIIII3 = mapScene.ALLATORIxDEMO(this.IIiiIiiiIIiIi[IiiiiiiiIIIII2]);
                    if (IiiiiiiiIIIII3 != null) {
                        IiiiiiiiIIIII3.ALLATORIxDEMO(IiiiiiiiIIIII.ALLATORIxDEMO(), IiiiiiiiIIIII.ALLATORIxDEMO());
                        IiiiiiiiIIIII = IiiiiiiiIIIII3;
                    }
                    ++IiiiiiiiIIIII2;
                }
            }
        }
        if (this.ALLATORIxDEMO != null) {
            this.ALLATORIxDEMO.ALLATORIxDEMO((iiiiiiiiiiIiI)this, this.IiIiiiiiIIIII != null && this.IiIiiiiiIIIII.iIiIiiiiIIiii());
        }
        this.iiiIiiiiiiIIi();
    }

    public void ALLATORIxDEMO(Graphics g, iiiiiiiiiiIiI XZUnit, GameView view) {
        if (!SystemData.ISTCP && view.roleUnit != this) {
            this.iiIIIiiiiiiiI.iIiIiiiiIIiii();
            return;
        }
        if (this.ALLATORIxDEMO != null) {
            this.ALLATORIxDEMO.ALLATORIxDEMO(g, view);
        }
        if (view.mapScene.iIiIiiiiIIiii(this.iiIiIiiiiIIIi / IIIIIiiiIiiII.iiIiiiiiiiIii, this.IIiiiiiiiIIIi / IIIIIiiiIiiII.iiIiiiiiiiIii, 0)) {
            if (XZUnit == this) {
                this.iiIIIiiiiiiiI.iIiIiiiiIIiIi(g, this.iiIiiiiiiIIiI, this.iIiiIiiiIiIIi, this.iiIiiiiiiiIii, this.iiiiIiiiIIiii, 0.6f);
            } else {
                this.iiIIIiiiiiiiI.IiiIiiiiiiIiI(g, this.iiIiiiiiiIIiI, this.iIiiIiiiIiIIi, this.iiIiiiiiiiIii, this.iiiiIiiiIIiii, 0.6f);
            }
        } else if (XZUnit == this) {
            this.iiIIIiiiiiiiI.iIiIiiiiIIiIi(g, this.iiIiiiiiiIIiI, this.iIiiIiiiIiIIi, this.iiIiiiiiiiIii, this.iiiiIiiiIIiii, 1.0f);
        } else {
            this.iiIIIiiiiiiiI.ALLATORIxDEMO(g, this.iiIiiiiiiIIiI, this.iIiiIiiiIiIIi, this.iiIiiiiiiiIii, this.iiiiIiiiIIiii);
        }
        if (this.IIiiIiiiIIiIi == null) return;
        this.IIiiIiiiIIiIi.ALLATORIxDEMO(g, view);
    }

    public void ALLATORIxDEMO(GameView gameView, boolean script, boolean refreshTime) {
        Door IiiiiiiiIIIII;
        if (this.IiIiiiiiIIIII == null) return;
        if (!this.IiIiiiiiIIIII.iIiIiiiiIIiii()) return;
        if (!this.iIiIiiiiIIiIi()) return;
        if (!script && (IiiiiiiiIIIII = gameView.mapScene.ALLATORIxDEMO(this.iiIiIiiiiIIIi, this.IIiiiiiiiIIIi, this.IiiiiiiiIIIII ? 1 : 0)) != null) {
            this.IiIiiiiiIIIII.setValue(0, 0L, null);
            HandleOption.ALLATORIxDEMO((Door)IiiiiiiiIIIII, (int)0, (GameView)gameView);
            return;
        }
        if (!refreshTime) return;
        this.iiiIiiiiiiIIi(gameView);
    }

    public void iIiIiiiiIIiii() {
        if (this.IiIiiiiiIIIII == null) {
            this.IiIiiiiiIIIII = new GameMove(0.18);
        }
        this.IiIiiiiiIIIII.setSp(this.iIiIiiiiIiIii.getSp());
    }

    public void iIiIiiiiIIiIi() {
        if (this.ALLATORIxDEMO().size() >= 13) {
            if (this.iiIIIiiiiiiiI.iiiIiiiiiiIIi() == 1) {
                iiiiiiiiIIIII IiiiiiiiIIIII = this.iiIiiiiiiiIii.remove(0);
                IiiiiiiiIIIII.ALLATORIxDEMO(this.iiIiIiiiiIIIi, this.IIiiiiiiiIIIi, this.iiIiiiiiiiIii, this.iiIIIiiiiiiiI.iiiIiiiiiiIIi());
                this.iiIiiiiiiiIii.add(IiiiiiiiIIIII);
            } else {
                this.ALLATORIxDEMO().ALLATORIxDEMO(2);
            }
        } else {
            this.iiIiiiiiiiIii.add(new iiiiiiiiIIIII(this.iiIiIiiiiIIIi, this.IIiiiiiiiIIIi, this.iiIiiiiiiiIii, this.iiIIIiiiiiiiI.iiiIiiiiiiIIi()));
        }
        if (this.IIiiIiiiIIiIi == null) return;
        if (this.iiIIIiiiiiiiI.iiiIiiiiiiIIi() != 1) return;
        this.IIiiIiiiIIiIi.ALLATORIxDEMO(this.iiIiIiiiiIIIi, this.IIiiiiiiiIIIi, this.iiIiiiiiiiIii);
    }

    public void IiiIiiiiiiIiI(Graphics g) {
        if (SystemData.ISNAME || this.iIIiIiiiiiiIi == 0) {
            this.iIiIiiiiIIiii(g);
        }
        this.iIiIiiiiIIiIi(g);
        this.iiiIiiiiiiIIi(g);
        this.ALLATORIxDEMO(g);
    }

    public int ALLATORIxDEMO(iiiiiiiiiiIiI unit) {
        iiIiIiiiiIiii IiiiiiiiIIIII = (iiIiIiiiiIiii)unit;
        return this.iIiIiiiiIiIii.getRole_id().compareTo(IiiiiiiiIIIII.iIiIiiiiIiIii.getRole_id());
    }

    public void ALLATORIxDEMO(GameView gameView) {
        boolean IiiiiiiiIIIII;
        boolean bl = IiiiiiiiIIIII = gameView.roleUnit == this;
        if (gameView.getMouseIndex() == iiIiIiiiIIIiI.iIiiIiiiiiiII) {
            if (IiiiiiiiIIIII) {
                iiIiIiiiiIiii.iIiIiiiiIIiii(gameView);
                return;
            }
            iiIiIiiiiIiii.ALLATORIxDEMO(this.iIiIiiiiIiIii.getRole_id(), gameView);
            return;
        }
        if (gameView.getMouseIndex() == iiIiIiiiIIIiI.iiIiiiiiiiIii) {
            iiIiIiiiiIiii.ALLATORIxDEMO((iiiiiiiiiiIiI)this, gameView);
            return;
        }
        if (gameView.getMouseIndex() == iiIiIiiiIIIiI.iiiiIiiiIiiII) {
            iiIiIiiiiIiii.ALLATORIxDEMO(this.iIiIiiiiIiIii.getRole_id(), this.iIiIiiiiIiIii.getRolename(), gameView);
            return;
        }
        if (gameView.getMouseIndex() == iiIiIiiiIIIiI.iIiIiiiiIiIii) {
            iiIiIiiiiIiii.ALLATORIxDEMO(this, gameView);
            return;
        }
        if (gameView.getMouseIndex() == iiIiIiiiIIIiI.IiIiiiiiIIIII) {
            iiIiIiiiiIiii.iIiIiiiiIIiii(this, gameView);
            return;
        }
        if (IiiiiiiiIIIII) return;
        ((IiIIIiiiiIIiI)gameView.getFormManagement().iiiIiiiiiiIIi(154)).ALLATORIxDEMO(this.iIiIiiiiIiIii);
    }

    public iiIiIiiiiIiii(RoleShow roleShow) {
        this.iIIiIiiiiiiIi = 1;
        this.ALLATORIxDEMO(roleShow);
    }

    public boolean iIiIiiiiIIiii() {
        if (this.IiiiiiiiIIIII) return true;
        if (!this.IiIIIiiiiIiiI) return false;
        if (this.ALLATORIxDEMO() == 1) return true;
        return false;
    }

    public void ALLATORIxDEMO(iiiiiiiiIIIII four, int type) {
        this.iIiIiiiiIIiIi();
        this.iIiIiiiiIiIii.setX(four.ALLATORIxDEMO);
        this.iIiIiiiiIiIii.setY(four.IiIIIiiiiIiiI);
        this.iiIiIiiiiIIIi = four.ALLATORIxDEMO;
        this.IIiiiiiiiIIIi = four.IiIIIiiiiIiiI;
        this.iiIiiiiiiiIii = (List<iiiiiiiiIIIII>)four.iiIiiiiiiiIii;
        this.ALLATORIxDEMO(type);
    }

    public static void ALLATORIxDEMO(iiiiiiiiiiIiI unit, GameView gameView) {
        boolean IiiiiiiiIIIII;
        boolean bl = IiiiiiiiIIIII = gameView.roleUnit == unit;
        if (IiiiiiiiIIIII) {
            gameView.iiiIiiiiiiIIi("\u4e0d\u80fd\u5c06\u7269\u54c1\u7ed9\u4e0e\u81ea\u5df1\uff01\uff01");
            return;
        }
        gameView.setMouseIndex(iiIiIiiiIIIiI.IiIIIiiiiIiiI);
        if (gameView.mapScene.ALLATORIxDEMO().getMapKf() != 0) {
            gameView.iiiIiiiiiiIIi("\u8de8\u670d\u9891\u9053\u7981\u7528\u7ed9\u4e88");
            return;
        }
        if (gameView.getFormManagement().iIiIiiiiIIiii(12) != null) {
            gameView.iIiIiiiiIIiii("\u4f60\u73b0\u5728\u5df2\u7ecf\u5904\u4e8e\u7ed9\u4e88\u72b6\u6001");
            return;
        }
        ((IiIIIiiiiIiii)gameView.getFormManagement().iiiIiiiiiiIIi(12)).ALLATORIxDEMO(unit);
    }

    public iiiiiiiiIIIII ALLATORIxDEMO() {
        if (this.ALLATORIxDEMO().size() != 0) return this.iiIiiiiiiiIii.get(0);
        this.iiIiiiiiiiIii.add(new iiiiiiiiIIIII(this.iiIiIiiiiIIIi, this.IIiiiiiiiIIIi, this.iiIiiiiiiiIii, this.iiIIIiiiiiiiI.iiiIiiiiiiIIi()));
        return this.iiIiiiiiiiIii.get(0);
    }

    public void iiiIiiiiiiIIi(Graphics g) {
        if (this.iIiIiiiiIiIii.getFighting() != 0) {
            IIIIIiiiIiIii IiiiiiiiIIIII = IIiIiiiiIiiIi.ALLATORIxDEMO();
            if (IiiiiiiiIIIII == null) return;
            IiiiiiiiIIIII.ALLATORIxDEMO(this.iiiiIiiiIIiii, 0);
            IiiiiiiiIIIII.ALLATORIxDEMO(g, this.iiIiiiiiiIIiI - 10, this.iIiiIiiiIiIIi - 115);
            return;
        }
        if (this.iIiIiiiiIiIii.getTroop_id() == null) return;
        if (this.iIiIiiiiIiIii.getCaptian() != 1) return;
        IIIIIiiiIiIii IiiiiiiiIIIII = IIiIiiiiIiiIi.iIiIiiiiIIiii();
        if (IiiiiiiiIIIII == null) return;
        IiiiiiiiIIIII.ALLATORIxDEMO(this.iiiiIiiiIIiii, 0);
        IiiiiiiiIIIII.ALLATORIxDEMO(g, this.iiIiiiiiiIIiI - 10, this.iIiiIiiiIiIIi - 165);
    }

    public void ALLATORIxDEMO(int x, int y, int z, int dir) {
        super.ALLATORIxDEMO(x, y, z, dir);
        this.iIiIiiiiIiIii.setX(x);
        this.iIiIiiiiIiIii.setY(z > 0 ? com.xy.n.iiIiIiiiiIiii.iiIiiiiiiiIii + y : y);
    }

    public List<iiiiiiiiIIIII> ALLATORIxDEMO() {
        if (this.iiIiiiiiiiIii != null) return this.iiIiiiiiiiIii;
        this.iiIiiiiiiiIii = new ArrayList<iiiiiiiiIIIII>();
        return this.iiIiiiiiiiIii;
    }

    /*
     * WARNING - void declaration
     */
    public static void ALLATORIxDEMO(BigDecimal id, String role, GameView gameView) {
        void IiiiiiiiIIIII;
        boolean IiiiiiiiIIIII2;
        boolean bl = IiiiiiiiIIIII2 = gameView.roleData.getRoleId() == id.longValue();
        if (IiiiiiiiIIIII2) {
            gameView.iIiIiiiiIIiii("\u81ea\u5df1\u52a0\u81ea\u5df1?");
            return;
        }
        gameView.setMouseIndex(iiIiIiiiIIIiI.IiIIIiiiiIiiI);
        FriendBean IiiiiiiiIIIII3 = gameView.roleData.getFriend(id.longValue());
        if (IiiiiiiiIIIII3 != null && IiiiiiiiIIIII3.getGroup() != 0) {
            gameView.iIiIiiiiIIiii("\u4f60\u5df2\u7ecf\u6dfb\u52a0#G" + role + "#Y\u4e3a\u597d\u53cb");
            return;
        }
        Friend friend = new Friend();
        IiiiiiiiIIIII.setFriendid(id);
        IiiiiiiiIIIII.setRoleid(gameView.roleUnit.iIiIiiiiIiIii.getRole_id());
        String IiiiiiiiIIIII4 = Agreement.getSendTextAES((String)"addfriend", (String)iiIiiiiiIIiii.ALLATORIxDEMO().toJson(IiiiiiiiIIIII));
        gameView.getClient().ALLATORIxDEMO(IiiiiiiiIIIII4);
        gameView.iIiIiiiiIIiii("\u4f60\u6dfb\u52a0#G" + role + "#Y\u4e3a\u597d\u53cb");
    }

    public boolean iIiIiiiiIIiii(GameView gameView) {
        if (gameView.getClient().ALLATORIxDEMO(2, 3)) return this.IiiiiiiiIIIII;
        if (gameView.getClient().ALLATORIxDEMO(2, 8)) return this.IiiiiiiiIIIII;
        if (gameView.getClient().ALLATORIxDEMO(2, 9)) return this.IiiiiiiiIIIII;
        if (gameView.getClient().ALLATORIxDEMO(2, 10)) return this.IiiiiiiiIIIII;
        if (gameView.getClient().ALLATORIxDEMO(2, 12)) {
            return this.IiiiiiiiIIIII;
        }
        if (this.IiiiiiiiIIIII) return true;
        if (this.IiIIIiiiiIiiI) return true;
        return false;
    }

    /*
     * Enabled unnecessary exception pruning
     */
    public void ALLATORIxDEMO(RoleShow roleShow) {
        try {
            this.iIiIiiiiIiIii = roleShow;
            this.iiIiIiiiiIIIi = roleShow.getX();
            this.IIiiiiiiiIIIi = roleShow.getY();
            if (this.IIiiiiiiiIIIi >= com.xy.n.iiIiIiiiiIiii.iiIiiiiiiiIii) {
                this.IiiiiiiiIIIII = true;
                this.IIiiiiiiiIIIi &= com.xy.n.iiIiIiiiiIiii.iiIiiiiiiiIii;
            } else {
                this.IiiiiiiiIIIII = false;
            }
            this.IIIiiiiiIIiII = roleShow.getRolename();
            this.iiiIiiiiiiiIi = (long)roleShow.getTitle();
            this.IiiIiiiiiiIiI();
            super.ALLATORIxDEMO(null, roleShow);
            this.iiiiiiiiIIiii();
            this.ALLATORIxDEMO(roleShow.getPlayer_Paths(), roleShow.getSp());
            return;
        }
        catch (Exception IiiiiiiiIIIII) {
            IiiiiiiiIIIII.printStackTrace();
            return;
        }
    }

    public static void ALLATORIxDEMO(iiIiIiiiiIiii unit, GameView gameView) {
        boolean IiiiiiiiIIIII;
        boolean bl = IiiiiiiiIIIII = gameView.roleUnit == unit;
        if (IiiiiiiiIIIII) {
            gameView.iiiIiiiiiiIIi("\u4e0d\u80fd\u548c\u81ea\u5df1\u4ea4\u6613\uff01\uff01");
            return;
        }
        gameView.setMouseIndex(iiIiIiiiIIIiI.IiIIIiiiiIiiI);
        if (gameView.mapScene.ALLATORIxDEMO().getMapKf() != 0) {
            gameView.iiiIiiiiiiIIi("\u8de8\u670d\u9891\u9053\u7981\u7528\u4ea4\u6613");
            return;
        }
        String IiiiiiiiIIIII2 = Agreement.getSendTextAES((String)"TransState", (String)("0|" + unit.iIiIiiiiIiIii.getRolename()));
        gameView.getClient().ALLATORIxDEMO(IiiiiiiiIIIII2);
    }
}
