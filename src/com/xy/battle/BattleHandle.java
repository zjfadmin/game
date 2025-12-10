/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.battle.BattlePlayProgress
 *  com.xy.battle.BattleScene
 *  com.xy.battle.FightingEvents
 *  com.xy.battle.FightingState
 *  com.xy.battle.effect.EffectType
 *  com.xy.d.IiIiIiiiiIIiI
 *  com.xy.v.IIiiIiiiiIIiI
 *  com.xy.v.iiIiiiiiIIiii
 */
package com.xy.battle;

import com.xy.battle.BattlePlayProgress;
import com.xy.battle.BattleScene;
import com.xy.battle.FightingEvents;
import com.xy.battle.FightingState;
import com.xy.battle.effect.EffectType;
import com.xy.d.IiIiIiiiiIIiI;
import com.xy.v.IIiiIiiiiIIiI;
import com.xy.v.iiIiiiiiIIiii;
import java.util.ArrayList;
import java.util.List;

public class BattleHandle {
    public static int getdir(int dir) {
        if (dir == 7) {
            dir = 3;
            return dir;
        }
        if (dir == 3) {
            dir = 7;
            return dir;
        }
        if (dir == 5) {
            dir = 1;
            return dir;
        }
        if (dir == 1) {
            dir = 5;
            return dir;
        }
        if (dir == 0) {
            dir = 4;
            return dir;
        }
        if (dir == 2) {
            dir = 6;
            return dir;
        }
        if (dir == 4) {
            dir = 0;
            return dir;
        }
        if (dir != 6) return dir;
        dir = 2;
        return dir;
    }

    /*
     * Enabled unnecessary exception pruning
     */
    public static List<BattlePlayProgress> ALLATORIxDEMO(FightingEvents fightingEvents, int JD, BattleScene battleScene) {
        ArrayList<BattlePlayProgress> IiiiiiiiIIIII = new ArrayList<BattlePlayProgress>();
        try {
            FightingState IiiiiiiiIIIII2 = fightingEvents.getOriginator();
            if (IiiiiiiiIIIII2 != null) {
                IiIiIiiiiIIiI IiiiiiiiIIIII3;
                String IiiiiiiiIIIII4 = IiiiiiiiIIIII2.getStartState();
                if (IiiiiiiiIIIII4.equals("\u53ec\u5524") || IiiiiiiiIIIII4.equals("\u53ec\u56de") || IiiiiiiiIIIII4.equals("\u95ea\u73b0") || IiiiiiiiIIIII4.equals("\u602a\u7269\u95ea\u73b0")) {
                    BattlePlayProgress IiiiiiiiIIIII5 = EffectType.getEffectById((int)3).ALLATORIxDEMO(IiiiiiiiIIIII2, null, battleScene);
                    if (IiiiiiiiIIIII5 == null) return IiiiiiiiIIIII;
                    IiiiiiiiIIIII.add(IiiiiiiiIIIII5);
                    return IiiiiiiiIIIII;
                }
                if (IiiiiiiiIIIII4.equals("\u9003\u8dd1\u6210\u529f") || IiiiiiiiIIIII4.equals("\u9003\u8dd1\u5931\u8d25")) {
                    IiIiIiiiiIIiI IiiiiiiiIIIII6 = battleScene.getBattleUnitByCampMan(IiiiiiiiIIIII2.getCamp(), IiiiiiiiIIIII2.getMan());
                    if (IiiiiiiiIIIII6 == null) return IiiiiiiiIIIII;
                    BattlePlayProgress IiiiiiiiIIIII7 = EffectType.getEffectById((int)4).ALLATORIxDEMO(IiiiiiiiIIIII2, IiiiiiiiIIIII6, battleScene);
                    if (IiiiiiiiIIIII7 == null) return IiiiiiiiIIIII;
                    IiiiiiiiIIIII.add(IiiiiiiiIIIII7);
                    return IiiiiiiiIIIII;
                }
                if (!IiiiiiiiIIIII4.equals("\u6355\u6349\u5931\u8d25")) {
                    if (!IiiiiiiiIIIII4.equals("\u6355\u6349\u6210\u529f")) return IiiiiiiiIIIII;
                }
                if ((IiiiiiiiIIIII3 = battleScene.getBattleUnitByCampMan(IiiiiiiiIIIII2.getCamp(), IiiiiiiiIIIII2.getMan())) == null) return IiiiiiiiIIIII;
                BattlePlayProgress IiiiiiiiIIIII8 = EffectType.getEffectById((int)5).ALLATORIxDEMO(IiiiiiiiIIIII2, IiiiiiiiIIIII3, battleScene);
                if (IiiiiiiiIIIII8 == null) return IiiiiiiiIIIII;
                IiiiiiiiIIIII.add(IiiiiiiiIIIII8);
                return IiiiiiiiIIIII;
            }
            int IiiiiiiiIIIII9 = 0;
            while (IiiiiiiiIIIII9 < fightingEvents.getAccepterlist().size()) {
                BattlePlayProgress IiiiiiiiIIIII10;
                block18: {
                    String IiiiiiiiIIIII11;
                    FightingState IiiiiiiiIIIII12;
                    block19: {
                        block21: {
                            block20: {
                                block17: {
                                    IiiiiiiiIIIII12 = (FightingState)fightingEvents.getAccepterlist().get(IiiiiiiiIIIII9);
                                    IiiiiiiiIIIII11 = IiiiiiiiIIIII12.getStartState();
                                    IiiiiiiiIIIII10 = null;
                                    if (IiiiiiiiIIIII12.getCamp() != 999) break block17;
                                    IiiiiiiiIIIII10 = EffectType.getEffectById((int)7).ALLATORIxDEMO(IiiiiiiiIIIII12, null, battleScene);
                                    break block18;
                                }
                                if (IiiiiiiiIIIII12.getCamp() != 998) break block19;
                                if (IiiiiiiiIIIII12.getMan() != 11) break block20;
                                battleScene.campPetDie1 = IIiiIiiiiIIiI.ALLATORIxDEMO((String)IiiiiiiiIIIII11);
                                break block18;
                            }
                            if (IiiiiiiiIIIII12.getMan() != 12) break block21;
                            battleScene.campLingDie1 = IIiiIiiiiIIiI.ALLATORIxDEMO((String)IiiiiiiiIIIII11);
                            break block18;
                        }
                        if (IiiiiiiiIIIII12.getMan() == 21) {
                            battleScene.campPetDie2 = IIiiIiiiiIIiI.ALLATORIxDEMO((String)IiiiiiiiIIIII11);
                            break block18;
                        } else if (IiiiiiiiIIIII12.getMan() == 22) {
                            battleScene.campLingDie2 = IIiiIiiiiIIiI.ALLATORIxDEMO((String)IiiiiiiiIIIII11);
                        }
                        break block18;
                    }
                    if (IiiiiiiiIIIII11.equals("\u53ec\u5524") || IiiiiiiiIIIII11.equals("\u53ec\u56de") || IiiiiiiiIIIII11.equals("\u95ea\u73b0") || IiiiiiiiIIIII11.equals("\u602a\u7269\u95ea\u73b0")) {
                        IiiiiiiiIIIII10 = EffectType.getEffectById((int)3).ALLATORIxDEMO(IiiiiiiiIIIII12, null, battleScene);
                    } else {
                        IiIiIiiiiIIiI IiiiiiiiIIIII13 = battleScene.getBattleUnitByCampMan(IiiiiiiiIIIII12.getCamp(), IiiiiiiiIIIII12.getMan());
                        if (IiiiiiiiIIIII13 != null) {
                            IiiiiiiiIIIII10 = IiiiiiiiIIIII11.equals("\u79fb\u52a8") || IiiiiiiiIIIII11.equals("\u77ac\u79fb") || IiiiiiiiIIIII11.equals("\u9041\u5730") ? EffectType.getEffectById((int)1).ALLATORIxDEMO(IiiiiiiiIIIII12, IiiiiiiiIIIII13, battleScene) : (IiiiiiiiIIIII11.equals("\u6280\u80fd\u79fb\u52a8") ? EffectType.getEffectById((int)6).ALLATORIxDEMO(IiiiiiiiIIIII12, IiiiiiiiIIIII13, battleScene) : EffectType.getEffectById((int)2).ALLATORIxDEMO(IiiiiiiiIIIII12, IiiiiiiiIIIII13, battleScene));
                        }
                    }
                }
                if (IiiiiiiiIIIII10 != null) {
                    if (IiiiiiiiIIIII10.getSpell() != null) {
                        IiiiiiiiIIIII10.getSpell().setRound(JD);
                    }
                    IiiiiiiiIIIII.add(IiiiiiiiIIIII10);
                }
                ++IiiiiiiiIIIII9;
            }
            return IiiiiiiiIIIII;
        }
        catch (Exception IiiiiiiiIIIII14) {
            System.err.println(iiIiiiiiIIiii.ALLATORIxDEMO().toJson(fightingEvents));
            IiiiiiiiIIIII14.printStackTrace();
        }
        return IiiiiiiiIIIII;
    }
}
