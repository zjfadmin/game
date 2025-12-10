/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.IiIiIiiiIIiiI
 *  com.xy.a.iiiiiiiiiiiIi
 *  com.xy.battle.BattleScene
 *  com.xy.battle.FightingEvents
 *  com.xy.battle.FightingState
 *  com.xy.battle.SkillTx
 *  com.xy.battle.TypeState
 *  com.xy.bean.FightOperation
 *  com.xy.d.IiIiIiiiiIIiI
 *  com.xy.entity.Lingbao
 *  com.xy.entity.RoleSummoning
 *  com.xy.i.IiIIIiiiIIiII
 *  com.xy.readbean.Goodstable
 *  com.xy.readbean.Skill
 *  com.xy.socket.Agreement
 *  com.xy.socket.GameClient
 *  com.xy.socket.ParamTool
 *  com.xy.text.GameView
 *  com.xy.v.iIiIIiiiIiiiI
 *  com.xy.v.iiIiIiiiIIIiI
 *  com.xy.v.iiIiiiiiIIiii
 */
package com.xy.battle;

import com.xy.a.IiIiIiiiIIiiI;
import com.xy.a.iiiiiiiiiiiIi;
import com.xy.battle.BattleScene;
import com.xy.battle.FightingEvents;
import com.xy.battle.FightingState;
import com.xy.battle.SkillTx;
import com.xy.battle.TypeState;
import com.xy.bean.FightOperation;
import com.xy.d.IiIiIiiiiIIiI;
import com.xy.entity.Lingbao;
import com.xy.entity.RoleSummoning;
import com.xy.i.IiIIIiiiIIiII;
import com.xy.readbean.Goodstable;
import com.xy.readbean.Skill;
import com.xy.socket.Agreement;
import com.xy.socket.GameClient;
import com.xy.socket.ParamTool;
import com.xy.text.GameView;
import com.xy.v.iIiIIiiiIiiiI;
import com.xy.v.iiIiIiiiIIIiI;
import com.xy.v.iiIiiiiiIIiii;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class BattleControl {
    public GameView gameView;
    private IiIiIiiiiIIiI handleUnit;
    public long automationTime;
    public String yqz = "100";
    public BattleScene battleScene;
    public int battleCamp;
    public FightOperation PetOperation;
    private IiIiIiiiiIIiI XZUnit;
    public String nqz = "100";
    public boolean automationServer;
    private Object data;
    public int automationServerId;
    public FightOperation RoleOperation = new FightOperation();
    public List<SkillTx> skills;
    public int automationServerTime;

    /*
     * WARNING - void declaration
     */
    public void ALLATORIxDEMO(int round) {
        void IiiiiiiiIIIII;
        FightingEvents fightingEvents = new FightingEvents();
        IiiiiiiiIIIII.setFightingsum((int)this.battleScene.getBattleId());
        IiiiiiiiIIIII.setCurrentRound(round);
        String IiiiiiiiIIIII2 = Agreement.getSendText((String)"fig4", (String)iiIiiiiiIIiii.ALLATORIxDEMO().toJson(IiiiiiiiIIIII));
        this.gameView.getClient().ALLATORIxDEMO(IiiiiiiiIIIII2);
    }

    public FightingState ALLATORIxDEMO(String type, IiIiIiiiiIIiI handleUnit) {
        return new FightingState(this.battleCamp, handleUnit.ALLATORIxDEMO().getMan(), type);
    }

    public void IIIIIiiiiIIii() {
        if (this.battleCamp == -1) {
            return;
        }
        IiIiIiiiiIIiI IiiiiiiiIIIII = this.battleScene.getHandleUnit(this.gameView.roleData.getRoleId());
        if (IiiiiiiiIIIII == null) {
            this.iIiIiiiiIIiIi();
            return;
        }
        this.setMouseIndex(iiIiIiiiIIIiI.IiIIIiiiiIiiI, null);
        this.handleUnit = IiiiiiiiIIIII;
        int IiiiiiiiIIIII2 = this.handleUnit.ALLATORIxDEMO().getType();
        this.gameView.baseView.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII2, IiiiiiiiIIIII2 == 0 ? this.battleScene.ALLATORIxDEMO(IiiiiiiiIIIII) : false);
    }

    public void iiiiiiiiIIiii() {
        this.gameView.baseView.ALLATORIxDEMO().iiiIiiiiiiIIi();
    }

    public SkillTx ALLATORIxDEMO(int x, int y) {
        int IiiiiiiiIIIII = this.skills.size() - 1;
        while (IiiiiiiiIIIII >= 0) {
            if (this.skills.get(IiiiiiiiIIIII).ALLATORIxDEMO(x, y, this)) {
                return this.skills.get(IiiiiiiiIIIII);
            }
            --IiiiiiiiIIIII;
        }
        return null;
    }

    public BattleControl(GameView gameView) {
        this.PetOperation = new FightOperation();
        this.skills = new ArrayList<SkillTx>();
        this.gameView = gameView;
    }

    public void setMouseIndex(int mouseIndex, Object data) {
        this.data = data;
        this.gameView.setMouseIndex(mouseIndex);
    }

    public void ALLATORIxDEMO(List<TypeState> states) {
        int IiiiiiiiIIIII = 0;
        int IiiiiiiiIIIII2 = this.skills.size();
        int IiiiiiiiIIIII3 = 0;
        while (IiiiiiiiIIIII3 < states.size()) {
            if (states.get(IiiiiiiiIIIII3).getState() == 1) {
                if (IiiiiiiiIIIII < IiiiiiiiIIIII2) {
                    this.skills.get(++IiiiiiiiIIIII).ALLATORIxDEMO(states.get(IiiiiiiiIIIII3).getType(), IiiiiiiiIIIII, this.gameView.getObjectArea());
                } else {
                    SkillTx IiiiiiiiIIIII4 = new SkillTx();
                    IiiiiiiiIIIII4.ALLATORIxDEMO(states.get(IiiiiiiiIIIII3).getType(), ++IiiiiiiiIIIII, this.gameView.getObjectArea());
                    this.skills.add(IiiiiiiiIIIII4);
                }
            }
            ++IiiiiiiiIIIII3;
        }
        IiiiiiiiIIIII3 = this.skills.size() - 1;
        while (IiiiiiiiIIIII3 >= IiiiiiiiIIIII) {
            this.skills.remove(IiiiiiiiIIIII3--);
        }
    }

    public long getBattleId() {
        if (this.battleScene == null) return 0L;
        return this.battleScene.getBattleId();
    }

    public void setXZUnit(IiIiIiiiiIIiI xZUnit) {
        this.XZUnit = xZUnit;
    }

    public void IiiIiiiiiiIiI() {
        IiIiIiiiIIiiI IiiiiiiiIIIII = this.gameView.baseView;
        if (this.battleScene == null) {
            IiiiiiiiIIIII.ALLATORIxDEMO().setVisible(false);
            IiiiiiiiIIIII.iIiIiiiiIIiii().setVisible(false);
            return;
        }
        IiiiiiiiIIIII.ALLATORIxDEMO().setVisible(this.battleCamp != -1 && !this.gameView.systemData.IIIIIiiiiIIii());
        IiiiiiiiIIIII.iIiIiiiiIIiii().setVisible(this.battleCamp != -1 && !this.gameView.systemData.IIIIIiiiiIIii());
    }

    public FightingEvents ALLATORIxDEMO(IiIiIiiiiIIiI handleUnit, FightOperation operation) {
        FightingEvents IiiiiiiiIIIII = new FightingEvents();
        ArrayList<FightingState> IiiiiiiiIIIII2 = new ArrayList<FightingState>();
        IiiiiiiiIIIII.setOriginator(this.ALLATORIxDEMO("\u666e\u901a\u653b\u51fb", handleUnit));
        switch (operation.getType()) {
            case 1: {
                IiiiiiiiIIIII.getOriginator().setStartState("\u6280\u80fd");
                IiiiiiiiIIIII.getOriginator().setEndState(operation.getSpell());
                break;
            }
            case 2: {
                Goodstable IiiiiiiiIIIII3 = this.gameView.roleData.getGood(operation.getGood());
                if (IiiiiiiiIIIII3 != null) {
                    IiiiiiiiIIIII.getOriginator().setStartState("\u836f");
                    IiiiiiiiIIIII.getOriginator().setEndState(IiiiiiiiIIIII3.getValue());
                    IiiiiiiiIIIII3.ALLATORIxDEMO(1);
                    ParamTool.ALLATORIxDEMO((Goodstable)IiiiiiiiIIIII3, (int)1, (GameClient)this.gameView.getClient());
                    if (IiiiiiiiIIIII3.getUsetime() > 0) break;
                    this.gameView.roleData.iIiIiiiiIIiii(IiiiiiiiIIIII3.getRgid());
                    operation.setCamp(-1);
                    operation.setMan(-1);
                    operation.setType(0);
                    break;
                }
                operation.setCamp(-1);
                operation.setMan(-1);
                break;
            }
            case 3: {
                IiiiiiiiIIIII.getOriginator().setStartState("\u4fdd\u62a4");
                break;
            }
            case 4: {
                IiiiiiiiIIIII.getOriginator().setStartState("\u6355\u6349");
                break;
            }
            case 5: {
                IiiiiiiiIIIII.getOriginator().setStartState("\u9632\u5fa1");
                break;
            }
            case 6: {
                IiiiiiiiIIIII.getOriginator().setStartState("\u9003\u8dd1");
                break;
            }
        }
        int IiiiiiiiIIIII4 = operation.getCamp();
        if (IiiiiiiiIIIII4 == 1) {
            IiiiiiiiIIIII4 = this.battleCamp;
        } else if (IiiiiiiiIIIII4 == 0) {
            IiiiiiiiIIIII4 = this.battleScene.getOtherCamp(this.battleCamp);
        }
        FightingState IiiiiiiiIIIII5 = new FightingState(IiiiiiiiIIIII4, operation.getMan(), null);
        IiiiiiiiIIIII2.add(IiiiiiiiIIIII5);
        IiiiiiiiIIIII.setAccepterlist(IiiiiiiiIIIII2);
        return IiiiiiiiIIIII;
    }

    public SkillTx ALLATORIxDEMO(int skillID) {
        int IiiiiiiiIIIII = this.skills.size() - 1;
        while (IiiiiiiiIIIII >= 0) {
            if (this.skills.get(IiiiiiiiIIIII).getId() == skillID) return this.skills.get(IiiiiiiiIIIII);
            --IiiiiiiiIIIII;
        }
        return null;
    }

    public IiIiIiiiiIIiI getHandleUnit() {
        return this.handleUnit;
    }

    public boolean ALLATORIxDEMO(Skill skill, IiIiIiiiiIIiI handleUnit, IiIiIiiiiIIiI XZUnit) {
        String IiiiiiiiIIIII = skill.getSkillname();
        if (IiiiiiiiIIIII.equals("\u79fb\u82b1\u63a5\u6728")) return true;
        if (IiiiiiiiIIIII.equals("\u5927\u624b\u5370")) return true;
        if (IiiiiiiiIIIII.equals("\u94f6\u7d22\u91d1\u94c3")) return true;
        if (IiiiiiiiIIIII.equals("\u5e7d\u601c\u9b45\u5f71")) return true;
        if (IiiiiiiiIIIII.equals("\u9189\u751f\u68a6\u6b7b")) return true;
        if (IiiiiiiiIIIII.equals("\u4e00\u66f2\u9500\u9b42")) return true;
        if (IiiiiiiiIIIII.equals("\u79e6\u4e1d\u51b0\u96fe")) return true;
        if (IiiiiiiiIIIII.equals("\u5029\u5973\u5e7d\u9b42")) return true;
        if (IiiiiiiiIIIII.equals("\u884c\u7720\u7acb\u76f9")) {
            return true;
        }
        if (handleUnit.ALLATORIxDEMO().getType() == 1) {
            if (IiiiiiiiIIIII.equals("\u9b54\u4e4b\u98de\u6b65")) return true;
            if (IiiiiiiiIIIII.equals("\u6025\u901f\u4e4b\u9b54")) return true;
            if (IiiiiiiiIIIII.equals("\u9b54\u795e\u98de\u821e")) return true;
            if (IiiiiiiiIIIII.equals("\u5929\u5916\u98de\u9b54")) return true;
            if (IiiiiiiiIIIII.equals("\u4e7e\u5764\u501f\u901f")) return true;
            if (IiiiiiiiIIIII.equals("\u795e\u8fdf\u9b42\u949d")) return true;
            if (IiiiiiiiIIIII.equals("\u5bd2\u70df\u7f81\u6c34")) {
                return true;
            }
        }
        if (BattleControl.ALLATORIxDEMO(IiiiiiiiIIIII)) {
            if (handleUnit.ALLATORIxDEMO().getCamp() != XZUnit.ALLATORIxDEMO().getCamp()) return false;
            return true;
        }
        if (handleUnit.ALLATORIxDEMO().getCamp() == XZUnit.ALLATORIxDEMO().getCamp()) return false;
        return true;
    }

    public IiIiIiiiiIIiI getPetUnit() {
        return this.battleScene.getPetUnit(this.getRoleId());
    }

    public void ALLATORIxDEMO(FightOperation Operation) {
        this.ALLATORIxDEMO(Operation, false);
    }

    public void iIiIiiiiIIiIi() {
        this.handleUnit = null;
        this.gameView.getFormManagement().iiiIiiiiiiIIi(34);
        this.gameView.getFormManagement().iiiIiiiiiiIIi(46);
        if (this.battleCamp == -1) {
            return;
        }
        this.setMouseIndex(iiIiIiiiIIIiI.IiIIIiiiiIiiI, null);
        this.gameView.baseView.ALLATORIxDEMO().iiiIiiiiiiIIi();
    }

    public void ALLATORIxDEMO(IiIiIiiiiIIiI handleUnit, SkillTx skillTx, int camp, int man) {
        if (skillTx == null) {
            return;
        }
        FightOperation IiiiiiiiIIIII = new FightOperation();
        IiiiiiiiIIIII.ALLATORIxDEMO(camp == this.battleCamp, man, 1, skillTx.getSkill().getSkillname());
        this.ALLATORIxDEMO(this.ALLATORIxDEMO(handleUnit, IiiiiiiiIIIII));
        skillTx.setIs(true);
        this.gameView.iiiIiiiiiiIIi("\u4f60\u91ca\u653e\u4e86" + skillTx.getSkill().getSkillname());
        this.IIIIIiiiiIIii();
    }

    public static boolean ALLATORIxDEMO(String skillname) {
        if (skillname.equals("\u7edd\u5883\u9022\u751f")) return true;
        if (skillname.equals("\u5b50\u865a\u4e4c\u6709")) return true;
        if (skillname.equals("\u6625\u56de\u5927\u5730")) return true;
        if (skillname.equals("\u5999\u624b\u56de\u6625")) return true;
        if (skillname.equals("\u6625\u610f\u76ce\u7136")) return true;
        if (skillname.equals("\u5fe0\u8bda")) return true;
        if (skillname.equals("\u81ea\u533b")) return true;
        if (skillname.equals("\u9057\u4ea7")) return true;
        if (skillname.equals("\u9690\u8eab")) return true;
        if (skillname.equals("\u4ec1\u4e4b\u6728\u53f6\u795e")) return true;
        if (skillname.equals("\u667a\u4e4b\u6c34\u53f6\u795e")) return true;
        if (skillname.equals("\u5fe0\u8bda")) return true;
        if (skillname.equals("\u793c\u4e4b\u706b\u53f6\u795e")) return true;
        if (skillname.equals("\u5927\u9690\u4e8e\u671d")) return true;
        if (skillname.equals("\u9b3c\u795e\u83ab\u6d4b")) return true;
        if (skillname.equals("\u795e\u51fa\u9b3c\u6ca1")) return true;
        if (skillname.equals("\u4f5c\u9e1f\u517d\u6563")) return true;
        if (skillname.equals("\u5c06\u6b7b")) return true;
        if (skillname.equals("\u5996\u4e4b\u9b54\u529b")) return true;
        if (skillname.equals("\u529b\u795e\u590d\u82cf")) return true;
        if (skillname.equals("\u7ea2\u8896\u6dfb\u9999")) return true;
        if (skillname.equals("\u83b2\u6b65\u8f7b\u821e")) return true;
        if (skillname.equals("\u9b54\u4e4b\u98de\u6b65")) return true;
        if (skillname.equals("\u6025\u901f\u4e4b\u9b54")) return true;
        if (skillname.equals("\u72ee\u738b\u4e4b\u6012")) return true;
        if (skillname.equals("\u517d\u738b\u795e\u529b")) return true;
        if (skillname.equals("\u9b54\u795e\u9644\u8eab")) return true;
        if (skillname.equals("\u695a\u695a\u53ef\u601c")) return true;
        if (skillname.equals("\u9b54\u795e\u62a4\u4f53")) return true;
        if (skillname.equals("\u542b\u60c5\u8109\u8109")) return true;
        if (skillname.equals("\u9b54\u795e\u98de\u821e")) return true;
        if (skillname.equals("\u5929\u5916\u98de\u9b54")) return true;
        if (skillname.equals("\u4e7e\u5764\u501f\u901f")) return true;
        if (skillname.equals("\u6cfd\u62ab\u5929\u4e0b")) return true;
        if (skillname.equals("\u5c06\u519b\u4ee4")) return true;
        if (skillname.equals("\u5927\u52bf\u9524")) return true;
        if (skillname.equals("\u4e03\u5b9d\u73b2\u73d1\u5854")) return true;
        if (skillname.equals("\u9ed1\u9f99\u73e0")) return true;
        if (skillname.equals("\u5e7d\u51a5\u9b3c\u624b")) return true;
        if (skillname.equals("\u7edd\u60c5\u97ad")) return true;
        if (skillname.equals("\u5b9d\u83b2\u706f")) return true;
        if (skillname.equals("\u756a\u5929\u5370")) return true;
        if (skillname.equals("\u9526\u8955\u8888\u88df")) return true;
        if (skillname.equals("\u94f6\u7d22\u91d1\u94c3")) return true;
        if (skillname.equals("\u98de\u82b1\u6e85\u7389")) return true;
        if (skillname.equals("\u767e\u5bb3\u4e0d\u4fb5")) return true;
        if (skillname.equals("\u660e\u5fc3\u89c1\u6027")) return true;
        if (skillname.equals("\u4e94\u8574\u70bd\u76db")) return true;
        if (skillname.equals("\u6e05\u6c5f\u6620\u96ea")) return true;
        if (skillname.equals("\u56de\u5149\u8fd4\u7167")) return true;
        if (skillname.equals("\u5439\u7bab\u5f15\u51e4")) return true;
        if (skillname.equals("\u516d\u6839\u6e05\u51c0")) return true;
        if (skillname.equals("\u56e0\u7f18\u9645\u4f1a")) return true;
        if (skillname.equals("\u4ee5\u76f4\u62a5\u6028")) return true;
        if (skillname.equals("\u5982\u6709\u795e\u52a9")) return true;
        if (skillname.equals("\u7834\u91dc\u6c89\u821f")) return true;
        if (skillname.equals("\u5f31\u6c34\u4e09\u5343")) return true;
        if (skillname.equals("\u6d41\u98ce\u56de\u96ea")) return true;
        if (skillname.equals("\u5cb3\u9547\u6e0a\u6e1f")) return true;
        if (skillname.equals("\u7a7f\u9488\u5f15\u7ebf")) return true;
        if (skillname.equals("\u9e3f\u96c1\u957f\u98de")) return true;
        if (skillname.equals("\u9500\u58f0\u533f\u8ff9")) return true;
        if (skillname.equals("\u4e00\u82c7\u6e21\u6c5f")) return true;
        if (skillname.equals("\u82e6\u6d77\u6148\u822a")) return true;
        if (skillname.equals("\u62d4\u5c71")) return true;
        if (skillname.equals("\u4e03\u661f\u8d2f\u65e5")) return true;
        if (skillname.equals("\u5fa1\u9f99")) return true;
        if (skillname.equals("\u8986\u96e8")) return true;
        if (skillname.equals("\u5fa1\u9f99")) return true;
        if (skillname.equals("\u5f15\u706b\u70e7\u8eab")) return true;
        if (skillname.equals("\u4e45\u65f1\u521d\u96e8")) return true;
        if (skillname.equals("\u5174\u4e91\u81f4\u96e8")) return true;
        if (skillname.equals("\u6da6\u7269\u65e0\u58f0")) return true;
        if (skillname.equals("\u6c9b\u7136\u83ab\u5fa1")) return true;
        if (skillname.equals("\u6cfd\u88ab\u4e07\u7269")) return true;
        if (skillname.equals("\u6625\u6696\u82b1\u5f00")) return true;
        if (skillname.equals("\u7792\u5929\u8fc7\u6d77")) return true;
        if (skillname.equals("\u53cc\u751f\u4e24\u4eea\u76fe")) return true;
        if (skillname.equals("\u56fa\u82e5\u91d1\u6c64")) return true;
        if (skillname.equals("\u4e00\u77e2\u4e2d\u7684")) return true;
        if (skillname.equals("\u6cd5\u9b42\u62a4\u4f53")) return true;
        if (skillname.equals("\u5e7b\u5f71\u8ff7\u8e2a")) return true;
        if (skillname.equals("\u517d\u9b42\u4fef\u9996")) return true;
        if (skillname.equals("\u521a\u67d4\u517c\u5907")) return true;
        if (skillname.equals("\u51dd\u795e\u4e00\u51fb")) return true;
        if (skillname.equals("\u6e05\u5fc3\u9759\u6c14")) return true;
        if (skillname.equals("\u6c14\u541e\u5c71\u6cb3")) return true;
        if (skillname.equals("\u6c14\u805a\u795e\u51dd")) return true;
        if (skillname.equals("\u884c\u6c14\u5982\u8679")) return true;
        if (skillname.equals("\u795e\u9f99\u6446\u5c3e")) return true;
        if (skillname.equals("\u4ee5\u5df1\u6e21\u4eba")) return true;
        if (skillname.equals("\u85cf\u950b\u84c4\u52bf")) return true;
        if (skillname.equals("\u795e\u4f51")) return true;
        if (skillname.equals("\u8537\u8587\u5410\u523a")) return true;
        if (skillname.equals("\u62e8\u4e91\u89c1\u65e5")) return true;
        if (skillname.equals("\u4f73\u671f\u5982\u68a6")) return true;
        if (skillname.equals("\u4e09\u6f6d\u5370\u6708")) return true;
        if (skillname.equals("\u5f00\u5c71\u88c2\u77f3")) return true;
        if (skillname.equals("\u621f\u6307\u6012\u76ee")) return true;
        if (skillname.equals("\u6c14\u8d2f\u957f\u8679")) return true;
        if (!skillname.equals("\u606d\u884c\u5929\u7f5a")) return false;
        return true;
    }

    public void ALLATORIxDEMO(FightingEvents fightingEvents) {
        if (this.battleCamp == -1) {
            return;
        }
        fightingEvents.setFightingsum((int)this.battleScene.getBattleId());
        fightingEvents.setCurrentRound(this.battleScene.getBattleRound());
        String IiiiiiiiIIIII = Agreement.getSendText((String)"fig1", (String)iiIiiiiiIIiii.ALLATORIxDEMO().toJson(fightingEvents));
        this.gameView.getClient().ALLATORIxDEMO(IiiiiiiiIIIII);
        this.iiiIiiiiiiIIi();
        this.gameView.getFormManagement().iiiIiiiiiiIIi(46);
        this.gameView.getFormManagement().iiiIiiiiiiIIi(34);
        this.gameView.getFormManagement().iiiIiiiiiiIIi(6);
    }

    public void iiiIiiiiiiIIi() {
        if (!this.automationServer) {
            return;
        }
        this.automationServer = false;
        this.automationServerId = 0;
        this.automationServerTime = 0;
    }

    public void ALLATORIxDEMO(FightOperation Operation, boolean is) {
        FightingEvents IiiiiiiiIIIII;
        if (this.handleUnit == null) {
            return;
        }
        if (this.handleUnit.ALLATORIxDEMO().getType() == 0 && !is && Operation.getType() != 6 && Operation.getType() != 5 && this.battleScene.ALLATORIxDEMO(this.handleUnit)) {
            return;
        }
        if (!is && (IiiiiiiiIIIII = (iiiiiiiiiiiIi)this.gameView.getFormManagement().iIiIiiiiIIiii(151)) != null) {
            IiiiiiiiIIIII.ALLATORIxDEMO(this.handleUnit.ALLATORIxDEMO().getType(), Operation, this);
        }
        IiiiiiiiIIIII = this.ALLATORIxDEMO(this.handleUnit, Operation);
        this.ALLATORIxDEMO(IiiiiiiiIIIII);
        this.ALLATORIxDEMO();
    }

    public IiIiIiiiiIIiI getXZUnit() {
        return this.XZUnit;
    }

    public void ALLATORIxDEMO(long countdown) {
        if (this.handleUnit == null) {
            return;
        }
        if (this.gameView.getFormManagement().iIiIiiiiIIiii(151) == null) {
            return;
        }
        if (countdown > 5L && iIiIIiiiIiiiI.ALLATORIxDEMO() - this.automationTime < 2000L) {
            return;
        }
        FightOperation IiiiiiiiIIIII = this.handleUnit.ALLATORIxDEMO().getType() == 0 ? this.RoleOperation : this.PetOperation;
        this.ALLATORIxDEMO(IiiiiiiiIIIII, true);
    }

    public void iIiIiiiiIIiii() {
        if (!this.automationServer) {
            return;
        }
        String IiiiiiiiIIIII = Agreement.getSendText((String)Agreement.fightAuto, (String)(String.valueOf(this.automationServerId) + "|0"));
        this.gameView.getClient().ALLATORIxDEMO(IiiiiiiiIIIII);
        this.iiiIiiiiiiIIi();
    }

    public void iIiIiiiiIIiii(int bh, int time) {
        if (this.battleScene == null) {
            String IiiiiiiiIIIII = Agreement.getSendText((String)Agreement.fightAuto, (String)(String.valueOf(bh) + "|1"));
            this.gameView.getClient().ALLATORIxDEMO(IiiiiiiiIIIII);
            return;
        }
        if (this.battleScene.getBattleId() != (long)bh) {
            String IiiiiiiiIIIII = Agreement.getSendText((String)Agreement.fightAuto, (String)(String.valueOf(bh) + "|1|" + this.battleScene.getBattleId()));
            this.gameView.getClient().ALLATORIxDEMO(IiiiiiiiIIIII);
            return;
        }
        this.automationServer = true;
        this.automationServerId = bh;
        this.automationServerTime = time;
        if (this.gameView.getFormManagement().iIiIiiiiIIiii(151) != null) {
            return;
        }
        IiIIIiiiIIiII.iIiIiiiiIIiIi((BattleControl)this);
        this.gameView.iiiIiiiiiiIIi("\u56e0\u4e3a\u4f60\u5728\u5173\u952e\u6218\u6597\u4e2d\u957f\u65f6\u95f4\u4e0d\u64cd\u4f5c,\u7cfb\u7edf\u5e2e\u4f60\u8bbe\u7f6e\u4e3a\u81ea\u52a8\u6218\u6597");
    }

    public void ALLATORIxDEMO(int mouseX, int mouseY) {
        SkillTx IiiiiiiiIIIII;
        if (this.battleCamp == -1) {
            return;
        }
        if (this.battleScene == null) return;
        if (this.handleUnit == null) {
            return;
        }
        SkillTx skillTx = IiiiiiiiIIIII = this.handleUnit.ALLATORIxDEMO().getType() == 0 ? this.ALLATORIxDEMO(mouseX, mouseY) : null;
        if (IiiiiiiiIIIII != null && !IiiiiiiiIIIII.ALLATORIxDEMO()) {
            if (IiiiiiiiIIIII.getId() == 12010) {
                this.gameView.getFormManagement().iiiIiiiiiiIIi(34);
                this.gameView.getFormManagement().iiiIiiiiiiIIi(46);
                this.setMouseIndex(iiIiIiiiIIIiI.ALLATORIxDEMO, IiiiiiiiIIIII.getSkill());
                this.iiiiiiiiIIiii();
                return;
            }
            if (IiiiiiiiIIIII.getId() >= 9001 && IiiiiiiiIIIII.getId() <= 9900 && this.handleUnit.ALLATORIxDEMO().getNqz() < 100) {
                this.gameView.iiiIiiiiiiIIi("\u4f60\u6012\u6c14\u503c\u8fd8\u672a\u8fbe\u5230100,\u65e0\u6cd5\u91ca\u653e" + IiiiiiiiIIIII.getSkill().getSkillname());
                return;
            }
            FightOperation IiiiiiiiIIIII2 = new FightOperation();
            IiiiiiiiIIIII2.ALLATORIxDEMO(this.handleUnit.ALLATORIxDEMO().getCamp() == this.battleCamp, this.handleUnit.ALLATORIxDEMO().getMan(), 1, IiiiiiiiIIIII.getSkill().getSkillname());
            FightingEvents IiiiiiiiIIIII3 = this.ALLATORIxDEMO(this.handleUnit, IiiiiiiiIIIII2);
            this.ALLATORIxDEMO(IiiiiiiiIIIII3);
            IiiiiiiiIIIII.setIs(true);
            this.gameView.iiiIiiiiiiIIi("\u4f60\u91ca\u653e\u4e86" + IiiiiiiiIIIII.getSkill().getSkillname());
            return;
        }
        if (this.XZUnit == null) {
            return;
        }
        if (this.gameView.getMouseIndex() == iiIiIiiiIIIiI.IIiiIiiiIIiIi) {
            if (this.handleUnit == this.XZUnit) return;
            if (this.handleUnit.iiiIiiiiiiIIi() != this.XZUnit.iiiIiiiiiiIIi()) {
                return;
            }
            FightOperation IiiiiiiiIIIII4 = this.handleUnit.ALLATORIxDEMO().getType() == 0 ? this.RoleOperation : this.PetOperation;
            IiiiiiiiIIIII4.ALLATORIxDEMO(this.XZUnit.ALLATORIxDEMO().getCamp() == this.battleCamp, this.XZUnit.ALLATORIxDEMO().getMan(), 3, null);
            this.ALLATORIxDEMO(IiiiiiiiIIIII4);
            return;
        }
        if (this.gameView.getMouseIndex() == iiIiIiiiIIIiI.IiiiiiiiIIIII) {
            if (this.handleUnit.iiiIiiiiiiIIi() == this.XZUnit.iiiIiiiiiiIIi()) return;
            if (this.battleScene.getBattleType() != 0 && this.battleScene.getBattleType() != 1 && this.battleScene.getBattleType() != 2) {
                return;
            }
            FightOperation IiiiiiiiIIIII5 = this.handleUnit.ALLATORIxDEMO().getType() == 0 ? this.RoleOperation : this.PetOperation;
            IiiiiiiiIIIII5.ALLATORIxDEMO(this.XZUnit.ALLATORIxDEMO().getCamp() == this.battleCamp, this.XZUnit.ALLATORIxDEMO().getMan(), 4, null);
            this.ALLATORIxDEMO(IiiiiiiiIIIII5);
            return;
        }
        if (this.gameView.getMouseIndex() == iiIiIiiiIIIiI.iiIiIiiiiIIIi) {
            Goodstable IiiiiiiiIIIII6 = (Goodstable)this.data;
            if (IiiiiiiiIIIII6 == null) {
                return;
            }
            FightOperation IiiiiiiiIIIII7 = this.handleUnit.ALLATORIxDEMO().getType() == 0 ? this.RoleOperation : this.PetOperation;
            IiiiiiiiIIIII7.ALLATORIxDEMO(this.XZUnit.ALLATORIxDEMO().getCamp() == this.battleCamp, this.XZUnit.ALLATORIxDEMO().getMan(), 2, IiiiiiiiIIIII6.getRgid().toString());
            this.ALLATORIxDEMO(IiiiiiiiIIIII7);
            return;
        }
        if (this.gameView.getMouseIndex() == iiIiIiiiIIIiI.ALLATORIxDEMO) {
            Skill IiiiiiiiIIIII8 = (Skill)this.data;
            if (IiiiiiiiIIIII8 == null) {
                return;
            }
            if (IiiiiiiiIIIII8 == null) return;
            if (!this.ALLATORIxDEMO(IiiiiiiiIIIII8, this.handleUnit, this.XZUnit)) {
                return;
            }
            if (IiiiiiiiIIIII8.getSkillid().equals("12010")) {
                this.ALLATORIxDEMO(this.handleUnit, this.ALLATORIxDEMO(12010), this.XZUnit.ALLATORIxDEMO().getCamp(), this.XZUnit.ALLATORIxDEMO().getMan());
                return;
            }
            FightOperation IiiiiiiiIIIII9 = this.handleUnit.ALLATORIxDEMO().getType() == 0 ? this.RoleOperation : this.PetOperation;
            IiiiiiiiIIIII9.ALLATORIxDEMO(this.XZUnit.ALLATORIxDEMO().getCamp() == this.battleCamp, this.XZUnit.ALLATORIxDEMO().getMan(), 1, IiiiiiiiIIIII8.getSkillname());
            this.ALLATORIxDEMO(IiiiiiiiIIIII9);
            return;
        }
        if (this.handleUnit == this.XZUnit) {
            return;
        }
        FightOperation IiiiiiiiIIIII10 = this.handleUnit.ALLATORIxDEMO().getType() == 0 ? this.RoleOperation : this.PetOperation;
        IiiiiiiiIIIII10.ALLATORIxDEMO(this.XZUnit.ALLATORIxDEMO().getCamp() == this.battleCamp, this.XZUnit.ALLATORIxDEMO().getMan(), 0, null);
        this.ALLATORIxDEMO(IiiiiiiiIIIII10);
    }

    public long getRoleId() {
        return this.gameView.roleData.getRoleId();
    }

    public void ALLATORIxDEMO() {
        this.handleUnit.iIiIiiiiIIiii(true);
        this.IIIIIiiiiIIii();
    }

    public void setBattle(int battleCamp, BattleScene battleScene) {
        this.battleCamp = battleCamp;
        this.battleScene = battleScene;
        IiIiIiiiIIiiI IiiiiiiiIIIII = this.gameView.baseView;
        this.iiiIiiiiiiIIi();
        if (battleScene == null) {
            this.skills.clear();
            this.yqz = "0";
            this.nqz = "0";
            IiiiiiiiIIIII.ALLATORIxDEMO().ALLATORIxDEMO(null);
            IiiiiiiiIIIII.iIiIiiiiIIiii().ALLATORIxDEMO(null);
            IiiiiiiiIIIII.iIiIiiiiIIiii().setVisible(false);
            IiiiiiiiIIIII.ALLATORIxDEMO().setVisible(false);
            IiiiiiiiIIIII.ALLATORIxDEMO().setVisible(false);
            IiiiiiiiIIIII.iIiIiiiiIIiii().setVisible(false);
            IiiiiiiiIIIII.iiiIiiiiiiIIi(true);
            IiiiiiiiIIIII.iIiIiiiiIIiIi(true);
            IiiiiiiiIIIII.ALLATORIxDEMO().setVisible(true);
            this.gameView.iIiIiiiiIIiii(true, String.valueOf(this.gameView.mapScene.ALLATORIxDEMO().getMapMusic()) + ".mp3");
        } else {
            if (battleCamp != -1) {
                RoleSummoning IiiiiiiiIIIII2 = null;
                Lingbao IiiiiiiiIIIII3 = null;
                IiIiIiiiiIIiI IiiiiiiiIIIII4 = battleScene.getBattleUnit(0, this.getRoleId());
                if (IiiiiiiiIIIII4 != null) {
                    this.yqz = String.valueOf(IiiiiiiiIIIII4.ALLATORIxDEMO().getYqz());
                    this.nqz = String.valueOf(IiiiiiiiIIIII4.ALLATORIxDEMO().getNqz());
                    this.ALLATORIxDEMO(IiiiiiiiIIIII4.ALLATORIxDEMO().ALLATORIxDEMO("\u6280\u80fd"));
                    int IiiiiiiiIIIII5 = IiiiiiiiIIIII4.ALLATORIxDEMO().getCamp();
                    int IiiiiiiiIIIII6 = IiiiiiiiIIIII4.ALLATORIxDEMO().getMan();
                    IiiiiiiiIIIII4 = battleScene.getPetUnit(this.getRoleId());
                    IiiiiiiiIIIII2 = IiiiiiiiIIIII4 != null ? this.gameView.roleData.getPet(new BigDecimal(IiiiiiiiIIIII4.ALLATORIxDEMO().getId())) : null;
                    IiiiiiiiIIIII4 = battleScene.getBattleUnitByCampMan(IiiiiiiiIIIII5, IiiiiiiiIIIII6 + 10);
                    IiiiiiiiIIIII3 = IiiiiiiiIIIII4 != null ? this.gameView.roleData.getLingbao(new BigDecimal(IiiiiiiiIIIII4.ALLATORIxDEMO().getId())) : null;
                }
                IiiiiiiiIIIII.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII2);
                IiiiiiiiIIIII.iIiIiiiiIIiii().ALLATORIxDEMO(IiiiiiiiIIIII3);
            } else {
                IiiiiiiiIIIII.ALLATORIxDEMO().ALLATORIxDEMO(null);
                IiiiiiiiIIIII.iIiIiiiiIIiii().ALLATORIxDEMO(null);
            }
            this.gameView.chatBox.clearTextListFile(7);
            IiiiiiiiIIIII.iIiIiiiiIIiii().setText(battleCamp == -1 ? "\u79bb\u5f00" : "\u81ea\u52a8");
            IiiiiiiiIIIII.iIiIiiiiIIiii().setVisible(true);
            IiiiiiiiIIIII.ALLATORIxDEMO().setVisible(battleScene.battleTip);
            IiiiiiiiIIIII.ALLATORIxDEMO().setVisible(battleCamp != -1 && !this.gameView.systemData.IIIIIiiiiIIii());
            IiiiiiiiIIIII.iIiIiiiiIIiii().setVisible(battleCamp != -1 && !this.gameView.systemData.IIIIIiiiiIIii());
            IiiiiiiiIIIII.iiiIiiiiiiIIi(false);
            IiiiiiiiIIIII.iIiIiiiiIIiIi(false);
            IiiiiiiiIIIII.ALLATORIxDEMO().setVisible(false);
            this.gameView.ALLATORIxDEMO(true, String.valueOf(this.gameView.mapScene.ALLATORIxDEMO().getMapMusic()) + ".mp3");
            this.gameView.iIiIiiiiIIiii(true, battleScene.getMusic());
        }
        this.gameView.iiiIiiiiiiIIi();
        if (battleScene != null && battleScene.getBattleState() == 1) {
            this.IIIIIiiiiIIii();
            return;
        }
        this.iIiIiiiiIIiIi();
    }

    public IiIiIiiiiIIiI getRoleUnit() {
        return this.battleScene.getBattleUnit(0, this.getRoleId());
    }
}
