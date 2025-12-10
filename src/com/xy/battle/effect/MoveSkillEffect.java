/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.battle.BattlePlayProgress
 *  com.xy.battle.BattleScene
 *  com.xy.battle.BattleSkillShow
 *  com.xy.battle.FightingState
 *  com.xy.battle.ShadowMode
 *  com.xy.battle.effect.Effect
 *  com.xy.battle.effect.EffectType
 *  com.xy.battle.effect.MoveEffect
 *  com.xy.bean.PathPoint
 *  com.xy.d.IiIiIiiiiIIiI
 *  com.xy.game.GameMove
 *  com.xy.w.IiiiIiiiiIiIi
 *  com.xy.w.iiiiiiiiiiIiI
 */
package com.xy.battle.effect;

import com.xy.battle.BattlePlayProgress;
import com.xy.battle.BattleScene;
import com.xy.battle.BattleSkillShow;
import com.xy.battle.FightingState;
import com.xy.battle.ShadowMode;
import com.xy.battle.effect.Effect;
import com.xy.battle.effect.EffectType;
import com.xy.battle.effect.MoveEffect;
import com.xy.bean.PathPoint;
import com.xy.d.IiIiIiiiiIIiI;
import com.xy.game.GameMove;
import com.xy.w.IiiiIiiiiIiIi;
import com.xy.w.iiiiiiiiiiIiI;
import java.util.ArrayList;
import java.util.List;

public class MoveSkillEffect
implements Effect {
    /*
     * WARNING - void declaration
     */
    public BattlePlayProgress ALLATORIxDEMO(FightingState State, IiIiIiiiiIIiI battleUnit, BattleScene battleScene) {
        BattlePlayProgress IiiiiiiiIIIII = EffectType.getProgress((FightingState)State, (IiIiIiiiiIIiI)battleUnit, (BattleScene)battleScene);
        BattleSkillShow IiiiiiiiIIIII2 = new BattleSkillShow();
        if (State.getSkillskin().equals("4000") || State.getSkillskin().equals("4005") || State.getSkillskin().equals("10") || State.getSkillskin().equals("3")) {
            void IiiiiiiiIIIII3;
            PathPoint IiiiiiiiIIIII4 = MoveEffect.ALLATORIxDEMO((String)State.getEndState(), (int)battleUnit.iiiIiiiiiiIIi());
            ArrayList<PathPoint> arrayList = new ArrayList<PathPoint>();
            arrayList.add(new PathPoint(battleUnit.iiIiIiiiiIIIi, battleUnit.IIiiiiiiiIIIi));
            IiiiiiiiIIIII3.add(IiiiiiiiIIIII4);
            int IiiiiiiiIIIII5 = GameMove.getDirTwo((int)(IiiiiiiiIIIII4.getX() - battleUnit.iiIiIiiiiIIIi), (int)(IiiiiiiiIIIII4.getY() - battleUnit.IIiiiiiiiIIIi));
            IiiiIiiiiIiIi IiiiiiiiIIIII6 = null;
            if (State.getSkillskin().equals("4000") || State.getSkillskin().equals("4005")) {
                IiiiiiiiIIIII6 = iiiiiiiiiiIiI.ALLATORIxDEMO((String)State.getSkillskin(), (int)-1, (int)0, null);
            } else {
                IiiiiiiiIIIII6 = battleUnit.ALLATORIxDEMO().iIiIiiiiIIiii();
                IiiiiiiiIIIII6.ALLATORIxDEMO(Integer.parseInt(State.getSkillskin()));
            }
            ShadowMode IiiiiiiiIIIII7 = new ShadowMode(IiiiiiiiIIIII6, battleUnit.iiIiIiiiiIIIi, battleUnit.IIiiiiiiiIIIi, (List)IiiiiiiiIIIII3, IiiiiiiiIIIII5, battleUnit);
            IiiiiiiiIIIII2.setShadowMode(IiiiiiiiIIIII7);
        } else if (State.getSkillskin().equals("1252") || State.getSkillskin().equals("1253") || State.getSkillskin().equals("1254") || State.getSkillskin().equals("1255")) {
            String[] IiiiiiiiIIIII8 = State.getEndState().split("\\|");
            PathPoint IiiiiiiiIIIII9 = MoveEffect.ALLATORIxDEMO((String[])IiiiiiiiIIIII8, (int)battleUnit.iiiIiiiiiiIIi());
            int IiiiiiiiIIIII10 = IiiiiiiiIIIII8.length == 3 ? Integer.parseInt(IiiiiiiiIIIII8[2]) : 3;
            IiiiIiiiiIiIi IiiiiiiiIIIII11 = iiiiiiiiiiIiI.ALLATORIxDEMO((String)State.getSkillskin(), (int)-1, (int)0, null);
            ShadowMode IiiiiiiiIIIII12 = new ShadowMode(IiiiiiiiIIIII11, IiiiiiiiIIIII9.getX(), IiiiiiiiIIIII9.getY(), null, IiiiiiiiIIIII10, battleUnit);
            IiiiiiiiIIIII2.setShadowMode(IiiiiiiiIIIII12);
        } else {
            String[] IiiiiiiiIIIII13 = State.getEndState().split("\\|");
            IiIiIiiiiIIiI IiiiiiiiIIIII14 = battleScene.getBattleUnitByCampMan(Integer.parseInt(IiiiiiiiIIIII13[0]), Integer.parseInt(IiiiiiiiIIIII13[1]));
            int IiiiiiiiIIIII15 = IiiiiiiiIIIII14.ALLATORIxDEMO().getCamp() == 999 ? IiiiiiiiIIIII14.ALLATORIxDEMO().getCampId() & 3 : IiiiiiiiIIIII14.ALLATORIxDEMO().getCamp();
            int IiiiiiiiIIIII16 = 3;
            IiiiIiiiiIiIi IiiiiiiiIIIII17 = IiiiiiiiIIIII14.ALLATORIxDEMO().iIiIiiiiIIiii();
            IiiiiiiiIIIII17.ALLATORIxDEMO(Integer.parseInt(State.getSkillskin()));
            if (IiiiiiiiIIIII13.length == 2) {
                ShadowMode IiiiiiiiIIIII18 = new ShadowMode(IiiiiiiiIIIII17, IiiiiiiiIIIII14.iiIiIiiiiIIIi, IiiiiiiiIIIII14.IIiiiiiiiIIIi, null, IiiiiiiiIIIII16 == 3 ? 1 : 0, battleUnit);
                IiiiiiiiIIIII2.setShadowMode(IiiiiiiiIIIII18);
            } else {
                ShadowMode IiiiiiiiIIIII19 = new ShadowMode(IiiiiiiiIIIII17, IiiiiiiiIIIII16 == 3 ? IiiiiiiiIIIII14.iiIiIiiiiIIIi + 70 : IiiiiiiiIIIII14.iiIiIiiiiIIIi - 70, IiiiiiiiIIIII16 == 3 ? IiiiiiiiIIIII14.IIiiiiiiiIIIi + 30 : IiiiiiiiIIIII14.IIiiiiiiiIIIi - 30, null, IiiiiiiiIIIII16 == 3 ? 1 : 0, battleUnit);
                IiiiiiiiIIIII2.setShadowMode(IiiiiiiiIIIII19);
            }
        }
        IiiiiiiiIIIII.setSpell(IiiiiiiiIIIII2);
        IiiiiiiiIIIII.setType(0);
        return IiiiiiiiIIIII;
    }
}
