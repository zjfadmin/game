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
import java.math.BigDecimal;

public class PetCatch
implements Effect {
    public BattlePlayProgress ALLATORIxDEMO(FightingState State, IiIiIiiiiIIiI battleUnit, BattleScene battleScene) {
        BattlePlayProgress IiiiiiiiIIIII = EffectType.getProgress((FightingState)State, (IiIiIiiiiIIiI)battleUnit, (BattleScene)battleScene);
        BattleSkillShow IiiiiiiiIIIII2 = new BattleSkillShow(IIiIiiiiIiiIi.ALLATORIxDEMO((String)"\u6355\u6349"), 1);
        IiiiiiiiIIIII2.setSkinpath(1);
        IiiiiiiiIIIII.setSpell(IiiiiiiiIIIII2);
        IiiiiiiiIIIII.setType(7);
        if (State.getStartState().equals("\u6355\u6349\u5931\u8d25")) return IiiiiiiiIIIII;
        IiiiiiiiIIIII.setEscape(1);
        String[] IiiiiiiiIIIII3 = State.getEndState().split("\\|");
        battleScene.ALLATORIxDEMO(Integer.parseInt(IiiiiiiiIIIII3[0]), Integer.parseInt(IiiiiiiiIIIII3[1]), new BigDecimal(IiiiiiiiIIIII3[2]));
        return IiiiiiiiIIIII;
    }
}
