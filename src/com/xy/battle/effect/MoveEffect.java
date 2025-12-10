/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.battle.BattlePlayProgress
 *  com.xy.battle.BattleScene
 *  com.xy.battle.FightingState
 *  com.xy.battle.effect.Effect
 *  com.xy.battle.effect.EffectType
 *  com.xy.bean.PathPoint
 *  com.xy.d.IiIiIiiiiIIiI
 */
package com.xy.battle.effect;

import com.xy.battle.BattlePlayProgress;
import com.xy.battle.BattleScene;
import com.xy.battle.FightingState;
import com.xy.battle.effect.Effect;
import com.xy.battle.effect.EffectType;
import com.xy.bean.PathPoint;
import com.xy.d.IiIiIiiiiIIiI;
import java.util.ArrayList;

public class MoveEffect
implements Effect {
    public BattlePlayProgress ALLATORIxDEMO(FightingState State, IiIiIiiiiIIiI battleUnit, BattleScene battleScene) {
        BattlePlayProgress IiiiiiiiIIIII = EffectType.getProgress((FightingState)State, (IiIiIiiiiIIiI)battleUnit, (BattleScene)battleScene);
        ArrayList<PathPoint> IiiiiiiiIIIII2 = new ArrayList<PathPoint>();
        if (!State.getStartState().equals("\u77ac\u79fb")) {
            IiiiiiiiIIIII2.add(new PathPoint(battleUnit.iiIiIiiiiIIIi, battleUnit.IIiiiiiiiIIIi));
        }
        IiiiiiiiIIIII2.add(MoveEffect.ALLATORIxDEMO(State.getEndState(), battleUnit.iiiIiiiiiiIIi()));
        IiiiiiiiIIIII.setPath(IiiiiiiiIIIII2);
        IiiiiiiiIIIII.setType(10);
        return IiiiiiiiIIIII;
    }

    public static PathPoint ALLATORIxDEMO(String[] vs, int myCamp) {
        int IiiiiiiiIIIII = Integer.parseInt(vs[0]);
        int IiiiiiiiIIIII2 = Integer.parseInt(vs[1]);
        PathPoint IiiiiiiiIIIII3 = IiIiIiiiiIIiI.ALLATORIxDEMO((int)IiiiiiiiIIIII, (int)IiiiiiiiIIIII2);
        if (vs.length == 3) {
            switch (Integer.parseInt(vs[2])) {
                case 1: {
                    IiiiiiiiIIIII3.setX(IiiiiiiiIIIII3.getX() + 70);
                    IiiiiiiiIIIII3.setY(IiiiiiiiIIIII3.getY() - 40);
                    break;
                }
                case 3: {
                    IiiiiiiiIIIII3.setX(IiiiiiiiIIIII3.getX() + 70);
                    IiiiiiiiIIIII3.setY(IiiiiiiiIIIII3.getY() + 30);
                    break;
                }
                case 5: {
                    IiiiiiiiIIIII3.setX(IiiiiiiiIIIII3.getX() - 70);
                    IiiiiiiiIIIII3.setY(IiiiiiiiIIIII3.getY() + 40);
                    break;
                }
                default: {
                    IiiiiiiiIIIII3.setX(IiiiiiiiIIIII3.getX() - 70);
                    IiiiiiiiIIIII3.setY(IiiiiiiiIIIII3.getY() - 30);
                }
            }
        }
        if (myCamp == IiiiiiiiIIIII) return IiiiiiiiIIIII3;
        IiiiiiiiIIIII3.setX(1024 - IiiiiiiiIIIII3.getX());
        IiiiiiiiIIIII3.setY(700 - IiiiiiiiIIIII3.getY());
        return IiiiiiiiIIIII3;
    }

    public static PathPoint ALLATORIxDEMO(String v, int myCamp) {
        if (!v.equals("99")) return MoveEffect.ALLATORIxDEMO(v.split("\\|"), myCamp);
        return new PathPoint(512, 350);
    }
}
