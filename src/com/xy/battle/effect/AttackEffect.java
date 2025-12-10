/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.battle.BattlePlayProgress
 *  com.xy.battle.BattleScene
 *  com.xy.battle.BattleSkillShow
 *  com.xy.battle.FightingState
 *  com.xy.battle.effect.Effect
 *  com.xy.battle.effect.EffectType
 *  com.xy.d.IiIiIiiiiIIiI
 *  com.xy.w.IIiIiiiiIiiIi
 */
package com.xy.battle.effect;

import com.xy.battle.BattlePlayProgress;
import com.xy.battle.BattleScene;
import com.xy.battle.BattleSkillShow;
import com.xy.battle.FightingState;
import com.xy.battle.effect.Effect;
import com.xy.battle.effect.EffectType;
import com.xy.d.IiIiIiiiiIIiI;
import com.xy.w.IIiIiiiiIiiIi;

public class AttackEffect
implements Effect {
    public BattlePlayProgress ALLATORIxDEMO(FightingState State, IiIiIiiiiIIiI battleUnit, BattleScene battleScene) {
        BattlePlayProgress IiiiiiiiIIIII = EffectType.getProgress((FightingState)State, (IiIiIiiiiIIiI)battleUnit, (BattleScene)battleScene);
        if (State.getStartState().equals("\u666e\u901a\u653b\u51fb")) {
            int IiiiiiiiIIIII2 = Integer.parseInt(State.getEndState());
            int IiiiiiiiIIIII3 = State.getCamp() == 999 ? battleUnit.ALLATORIxDEMO().getCampId() & 3 : State.getCamp();
            IiiiiiiiIIIII.setDir(IiiiiiiiIIIII2);
            IiiiiiiiIIIII.setDirend(IiiiiiiiIIIII2);
            IiiiiiiiIIIII.setType(9);
            return IiiiiiiiIIIII;
        }
        if (State.getStartState().equals("\u6cd5\u672f\u653b\u51fb")) {
            IiiiiiiiIIIII.setType(5);
            return IiiiiiiiIIIII;
        }
        if (State.getStartState().equals("\u9632\u5fa1")) {
            IiiiiiiiIIIII.setType(6);
            return IiiiiiiiIIIII;
        }
        if (State.getStartState().equals("\u88ab\u653b\u51fb")) {
            IiiiiiiiIIIII.setType(4);
            return IiiiiiiiIIIII;
        }
        if (State.getStartState().equals("\u6280\u80fd")) {
            if (IiiiiiiiIIIII.getHp_Change() < 0) {
                IiiiiiiiIIIII.setType(4);
                return IiiiiiiiIIIII;
            }
            IiiiiiiiIIIII.setType(7);
            return IiiiiiiiIIIII;
        }
        if (State.getStartState().equals("\u836f")) {
            if (IiiiiiiiIIIII.getHp_Change() > 0 || IiiiiiiiIIIII.getMp_Change() > 0) {
                IiiiiiiiIIIII.setMusic("\u836f\u54c1");
                BattleSkillShow IiiiiiiiIIIII4 = new BattleSkillShow(IiiiiiiiIIIII.getHp_Change() > 0 ? IIiIiiiiIiiIi.ALLATORIxDEMO((String)"\u52a0\u8840") : IIiIiiiiIiiIi.ALLATORIxDEMO((String)"\u52a0\u84dd"), battleUnit);
                IiiiiiiiIIIII.setSpell(IiiiiiiiIIIII4);
            }
            IiiiiiiiIIIII.setType(7);
            return IiiiiiiiIIIII;
        }
        if (State.getStartState().equals("\u4ee3\u4ef7")) {
            IiiiiiiiIIIII.setType(0);
            return IiiiiiiiIIIII;
        }
        if (State.getStartState().equals("\u9650\u5236\u5237\u65b0")) {
            IiiiiiiiIIIII.setType(0);
            battleUnit.ALLATORIxDEMO().setState_1(State.getEndState());
            battleScene.ALLATORIxDEMO(battleUnit);
            return IiiiiiiiIIIII;
        }
        if (!State.getStartState().equals("\u7279\u65481") && !State.getStartState().equals("\u7279\u65482")) {
            if (!State.getStartState().equals("\u7279\u65483")) return IiiiiiiiIIIII;
        }
        try {
            if (State.getEndState() != null && !State.getEndState().equals("")) {
                int IiiiiiiiIIIII5 = Integer.parseInt(State.getEndState());
                int IiiiiiiiIIIII3 = State.getCamp() == 999 ? battleUnit.ALLATORIxDEMO().getCampId() & 3 : State.getCamp();
                IiiiiiiiIIIII.setDir(IiiiiiiiIIIII5);
                IiiiiiiiIIIII.setDirend(IiiiiiiiIIIII5);
            }
        }
        catch (Exception IiiiiiiiIIIII6) {
            IiiiiiiiIIIII6.printStackTrace();
        }
        IiiiiiiiIIIII.setType(State.getStartState().equals("\u7279\u65481") ? 3 : (State.getStartState().equals("\u7279\u65482") ? 11 : 12));
        return IiiiiiiiIIIII;
    }
}
