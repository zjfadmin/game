/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.battle.BattleMan
 *  com.xy.battle.BattlePlayProgress
 *  com.xy.battle.BattleScene
 *  com.xy.battle.BattleSkillShow
 *  com.xy.battle.FightingState
 *  com.xy.battle.effect.Effect
 *  com.xy.battle.effect.EffectType
 *  com.xy.d.IiIiIiiiiIIiI
 *  com.xy.v.IIiiIiiiiIIiI
 *  com.xy.w.IIiIiiiiIiiIi
 */
package com.xy.battle.effect;

import com.xy.battle.BattleMan;
import com.xy.battle.BattlePlayProgress;
import com.xy.battle.BattleScene;
import com.xy.battle.BattleSkillShow;
import com.xy.battle.FightingState;
import com.xy.battle.effect.Effect;
import com.xy.battle.effect.EffectType;
import com.xy.d.IiIiIiiiiIIiI;
import com.xy.v.IIiiIiiiiIIiI;
import com.xy.w.IIiIiiiiIiiIi;

public class Pet
implements Effect {
    public BattlePlayProgress ALLATORIxDEMO(FightingState State, IiIiIiiiiIIiI battleUnit, BattleScene battleScene) {
        if (State.getStartState().equals("\u53ec\u56de")) {
            IiIiIiiiiIIiI IiiiiiiiIIIII = battleScene.ALLATORIxDEMO(State.getCamp(), State.getMan());
            battleScene.buffUtil.ALLATORIxDEMO(State.getBuff());
            if (IiiiiiiiIIIII == null) return null;
            if (IiiiiiiiIIIII.ALLATORIxDEMO().getType() == 1) {
                battleScene.ALLATORIxDEMO(1, IiiiiiiiIIIII.ALLATORIxDEMO());
            } else {
                if (IiiiiiiiIIIII.ALLATORIxDEMO().getType() != 3) return null;
                battleScene.iIiIiiiiIIiii(1, IiiiiiiiIIIII.ALLATORIxDEMO());
            }
            return null;
        }
        BattleMan IiiiiiiiIIIII = State.getFightingManData();
        if (IiiiiiiiIIIII.getType() == 1) {
            battleScene.ALLATORIxDEMO(0, IiiiiiiiIIIII);
        } else if (IiiiiiiiIIIII.getType() == 3) {
            battleScene.iIiIiiiiIIiii(0, IiiiiiiiIIIII);
        }
        battleUnit = battleScene.ALLATORIxDEMO(IiiiiiiiIIIII);
        BattlePlayProgress IiiiiiiiIIIII2 = EffectType.getProgress((FightingState)State, (IiIiIiiiiIIiI)battleUnit, (BattleScene)battleScene);
        if (IIiiIiiiiIIiI.ALLATORIxDEMO((String)State.getEndState(), (String)"\u6cd5\u672f\u653b\u51fb")) {
            IiiiiiiiIIIII2.setType(5);
        }
        if (State.getStartState().equals("\u95ea\u73b0")) {
            BattleSkillShow IiiiiiiiIIIII3 = new BattleSkillShow(IIiIiiiiIiiIi.ALLATORIxDEMO((String)"1806"), battleUnit);
            IiiiiiiiIIIII2.setSpell(IiiiiiiiIIIII3);
            return IiiiiiiiIIIII2;
        }
        if (!State.getStartState().equals("\u602a\u7269\u95ea\u73b0")) return IiiiiiiiIIIII2;
        if (!IIiiIiiiiIIiI.iIiIiiiiIIiIi((String)State.getSkillskin())) return IiiiiiiiIIIII2;
        BattleSkillShow IiiiiiiiIIIII4 = new BattleSkillShow(IIiIiiiiIiiIi.ALLATORIxDEMO((String)"3050"), battleUnit);
        IiiiiiiiIIIII2.setSpell(IiiiiiiiIIIII4);
        return IiiiiiiiIIIII2;
    }
}
