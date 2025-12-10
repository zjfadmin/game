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

public class TemporaryUnitEffect
implements Effect {
    public BattlePlayProgress ALLATORIxDEMO(FightingState State, IiIiIiiiiIIiI battleUnit, BattleScene battleScene) {
        battleUnit = battleScene.getBattleUnitByCampMan(State.getCamp(), State.getMan());
        if (battleUnit == null) {
            if (State.getFightingManData() == null) {
                return null;
            }
            battleUnit = new IiIiIiiiiIIiI(State.getFightingManData(), State, battleScene);
            battleScene.iIiIiiiiIIiIi(battleUnit);
        }
        BattlePlayProgress IiiiiiiiIIIII = null;
        String IiiiiiiiIIIII2 = State.getStartState();
        boolean IiiiiiiiIIIII3 = false;
        if (IiiiiiiiIIIII2.startsWith("\u53ec\u56de")) {
            IiiiiiiiIIIII3 = true;
            if ((IiiiiiiiIIIII2 = IiiiiiiiIIIII2.substring(2)).equals("")) {
                IiiiiiiiIIIII2 = "\u4ee3\u4ef7";
            }
            State.setStartState(IiiiiiiiIIIII2);
        }
        IiiiiiiiIIIII = IiiiiiiiIIIII2.equals("\u79fb\u52a8") || IiiiiiiiIIIII2.equals("\u77ac\u79fb") || IiiiiiiiIIIII2.equals("\u9041\u5730") ? EffectType.getEffectById((int)1).ALLATORIxDEMO(State, battleUnit, battleScene) : (IiiiiiiiIIIII2.equals("\u6280\u80fd\u79fb\u52a8") ? EffectType.getEffectById((int)6).ALLATORIxDEMO(State, battleUnit, battleScene) : EffectType.getEffectById((int)2).ALLATORIxDEMO(State, battleUnit, battleScene));
        if (!IiiiiiiiIIIII3) return IiiiiiiiIIIII;
        if (IiiiiiiiIIIII == null) return IiiiiiiiIIIII;
        IiiiiiiiIIIII.setEscape(1);
        return IiiiiiiiIIIII;
    }
}
