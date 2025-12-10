/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.battle.BattlePlayProgress
 *  com.xy.battle.BattleScene
 *  com.xy.battle.FightingState
 *  com.xy.battle.effect.Effect
 *  com.xy.battle.effect.EffectType
 *  com.xy.d.IiIiIiiiiIIiI
 */
package com.xy.battle.effect;

import com.xy.battle.BattlePlayProgress;
import com.xy.battle.BattleScene;
import com.xy.battle.FightingState;
import com.xy.battle.effect.Effect;
import com.xy.battle.effect.EffectType;
import com.xy.d.IiIiIiiiiIIiI;

public class EscapeEffect
implements Effect {
    public BattlePlayProgress ALLATORIxDEMO(FightingState State, IiIiIiiiiIIiI battleUnit, BattleScene battleScene) {
        BattlePlayProgress IiiiiiiiIIIII = EffectType.getProgress((FightingState)State, (IiIiIiiiiIIiI)battleUnit, (BattleScene)battleScene);
        if (State.getStartState().equals("\u9003\u8dd1\u6210\u529f")) {
            IiiiiiiiIIIII.setEscape(1);
        }
        IiiiiiiiIIIII.setType(1);
        IiiiiiiiIIIII.setDir(7);
        IiiiiiiiIIIII.setDirend(3);
        return IiiiiiiiIIIII;
    }
}
