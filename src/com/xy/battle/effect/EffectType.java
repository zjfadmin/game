/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.battle.BattleMan
 *  com.xy.battle.BattlePlayProgress
 *  com.xy.battle.BattleScene
 *  com.xy.battle.BattleSkillShow
 *  com.xy.battle.FightingState
 *  com.xy.battle.ShadowMode
 *  com.xy.battle.effect.AttackEffect
 *  com.xy.battle.effect.Effect
 *  com.xy.battle.effect.EscapeEffect
 *  com.xy.battle.effect.MoveEffect
 *  com.xy.battle.effect.MoveSkillEffect
 *  com.xy.battle.effect.Pet
 *  com.xy.battle.effect.PetCatch
 *  com.xy.battle.effect.TemporaryUnitEffect
 *  com.xy.d.IiIiIiiiiIIiI
 *  com.xy.v.IIiiIiiiiIIiI
 *  com.xy.w.IIiIiiiiIiiIi
 *  com.xy.w.IiiiIiiiiIiIi
 *  com.xy.w.iiiiiiiiiiIiI
 */
package com.xy.battle.effect;

import com.xy.battle.BattleMan;
import com.xy.battle.BattlePlayProgress;
import com.xy.battle.BattleScene;
import com.xy.battle.BattleSkillShow;
import com.xy.battle.FightingState;
import com.xy.battle.ShadowMode;
import com.xy.battle.effect.AttackEffect;
import com.xy.battle.effect.Effect;
import com.xy.battle.effect.EscapeEffect;
import com.xy.battle.effect.MoveEffect;
import com.xy.battle.effect.MoveSkillEffect;
import com.xy.battle.effect.Pet;
import com.xy.battle.effect.PetCatch;
import com.xy.battle.effect.TemporaryUnitEffect;
import com.xy.d.IiIiIiiiiIIiI;
import com.xy.v.IIiiIiiiiIIiI;
import com.xy.w.IIiIiiiiIiiIi;
import com.xy.w.IiiiIiiiiIiIi;
import com.xy.w.iiiiiiiiiiIiI;

public enum EffectType {
    Null(null),
    Move((Effect)new MoveEffect()),
    Attack((Effect)new AttackEffect()),
    Pet((Effect)new Pet()),
    Escape((Effect)new EscapeEffect()),
    PetCatch((Effect)new PetCatch()),
    MoveSkill((Effect)new MoveSkillEffect()),
    TemporaryUnit((Effect)new TemporaryUnitEffect());

    private Effect action;

    /*
     * WARNING - void declaration
     */
    public static BattlePlayProgress getProgress(FightingState State, IiIiIiiiiIIiI battleUnit, BattleScene battleScene) {
        IiiiIiiiiIiIi IiiiiiiiIIIII;
        BattlePlayProgress IiiiiiiiIIIII2 = new BattlePlayProgress(battleUnit);
        IiiiiiiiIIIII2.setData2(State.getStartState());
        IiiiiiiiIIIII2.setData(State.getProcessState());
        IiiiiiiiIIIII2.setBuff(State.getBuff());
        if (State.getHp_Change() != null) {
            IiiiiiiiIIIII2.setHp_Change(State.getHp_Change().intValue());
        }
        if (State.getMp_Change() != null) {
            IiiiiiiiIIIII2.setMp_Change(State.getMp_Change().intValue());
        }
        if (State.getYq_c() != null) {
            IiiiiiiiIIIII2.setYq_Change(State.getYq_c().intValue());
        }
        if (State.getNq_c() != null) {
            IiiiiiiiIIIII2.setNq_Change(State.getNq_c().intValue());
        }
        IiiiiiiiIIIII2.setAddchixu(State.getEndState_1());
        IiiiiiiiIIIII2.setDeletechixu(State.getEndState_2());
        IiiiiiiiIIIII2.setMusic(State.getSkillsy());
        IiiiiiiiIIIII2.setText(State.getText());
        if (State.getDelayTime() != null) {
            IiiiiiiiIIIII2.setDelayTime(State.getDelayTime().intValue());
        }
        if (!IIiiIiiiiIIiI.iIiIiiiiIIiIi((String)State.getUp())) {
            IiiiiiiiIIIII = State.getUp().split("\\|");
            int IiiiiiiiIIIII3 = 0;
            while (IiiiiiiiIIIII3 < ((String[])IiiiiiiiIIIII).length) {
                BattleMan IiiiiiiiIIIII4;
                IiIiIiiiiIIiI IiiiiiiiIIIII5;
                if (IiiiiiiiIIIII[IiiiiiiiIIIII3].startsWith("HP")) {
                    battleUnit.ALLATORIxDEMO().setHp_Total(Integer.parseInt(IiiiiiiiIIIII[IiiiiiiiIIIII3].split("=")[1]));
                } else if (IiiiiiiiIIIII[IiiiiiiiIIIII3].startsWith("MP")) {
                    battleUnit.ALLATORIxDEMO().setMp_Total(Integer.parseInt(IiiiiiiiIIIII[IiiiiiiiIIIII3].split("=")[1]));
                } else if (IiiiiiiiIIIII[IiiiiiiiIIIII3].startsWith("ZRYQ") && (IiiiiiiiIIIII5 = battleScene.getBattleUnitByCampMan((IiiiiiiiIIIII4 = battleUnit.ALLATORIxDEMO()).getCamp(), IiiiiiiiIIIII4.getMan() - 5)) != null) {
                    IiiiiiiiIIIII5.ALLATORIxDEMO().ALLATORIxDEMO(0, 0, Integer.parseInt(IiiiiiiiIIIII[IiiiiiiiIIIII3].substring(5)), 0);
                    battleScene.iiiIiiiiiiIIi(IiiiiiiiIIIII5);
                }
                ++IiiiiiiiIIIII3;
            }
        }
        if (!IIiiIiiiiIIiI.iIiIiiiiIIiIi((String)State.getSkin())) {
            battleUnit.ALLATORIxDEMO().setModel(State.getSkin());
            IiiiiiiiIIIII = battleUnit.ALLATORIxDEMO().getPart();
            IiiiiiiiIIIII.ALLATORIxDEMO(battleUnit.ALLATORIxDEMO().getHp_Current() <= 0 ? 8 : 7);
            battleUnit.ALLATORIxDEMO(IiiiiiiiIIIII);
        }
        if (State.getSkillskin() != null && !State.getSkillskin().equals("4000") && !State.getSkillskin().equals("4005")) {
            IiiiiiiiIIIII = new BattleSkillShow();
            String IiiiiiiiIIIII6 = State.getSkillskin();
            int IiiiiiiiIIIII7 = IiiiiiiiIIIII6.indexOf("|");
            if (IiiiiiiiIIIII7 != -1) {
                IiiiiiiiIIIII.setDir(IIiiIiiiiIIiI.ALLATORIxDEMO((String)IiiiiiiiIIIII6, (int)(IiiiiiiiIIIII7 + 1), (int)IiiiiiiiIIIII6.length()));
                IiiiiiiiIIIII6 = IiiiiiiiIIIII6.substring(0, IiiiiiiiIIIII7);
            }
            int IiiiiiiiIIIII8 = 0;
            try {
                if (IiiiiiiiIIIII6.charAt(0) >= '0' && IiiiiiiiIIIII6.charAt(0) <= '9') {
                    IiiiiiiiIIIII8 = Integer.parseInt(IiiiiiiiIIIII6);
                }
            }
            catch (Exception exception) {
                // empty catch block
            }
            if (IiiiiiiiIIIII8 == 1830 || IiiiiiiiIIIII8 == 1867 || IiiiiiiiIIIII8 == 1090 || IiiiiiiiIIIII8 >= 3036 && IiiiiiiiIIIII8 <= 3044 || IiiiiiiiIIIII8 == 12010 || IiiiiiiiIIIII8 == 12011) {
                if (battleScene.gameBattle && IiiiiiiiIIIII8 == 1090) {
                    IiiiiiiiIIIII.setSkinpath(0);
                    IiiiiiiiIIIII.setBattleUnit(battleUnit);
                } else {
                    void IiiiiiiiIIIII9;
                    int n = State.getCamp() == 999 ? battleUnit.ALLATORIxDEMO().getCampId() & 3 : State.getCamp();
                    IiiiiiiiIIIII.setSkinpath(2);
                    IiiiiiiiIIIII.setCamp((int)IiiiiiiiIIIII9);
                }
            } else if (IiiiiiiiIIIII8 == 1075 || IiiiiiiiIIIII8 == 1070 || IiiiiiiiIIIII8 == 1065 || IiiiiiiiIIIII8 == 1035 || IiiiiiiiIIIII8 == 1085 || IiiiiiiiIIIII8 == 1095 || IiiiiiiiIIIII8 == 1100 || IiiiiiiiIIIII8 == 1234 || IiiiiiiiIIIII8 == 1236 || IiiiiiiiIIIII8 == 7012 || IiiiiiiiIIIII8 == 1883 || IiiiiiiiIIIII8 == 30023 || IiiiiiiiIIIII8 == 30032 || IiiiiiiiIIIII6.equals("\u6355\u6349") || IiiiiiiiIIIII8 == 40006) {
                if (battleScene.gameBattle && (IiiiiiiiIIIII8 == 1035 || IiiiiiiiIIIII8 == 1065 || IiiiiiiiIIIII8 == 1070 || IiiiiiiiIIIII8 == 1075 || IiiiiiiiIIIII8 == 1085 || IiiiiiiiIIIII8 == 1095 || IiiiiiiiIIIII8 == 1100)) {
                    IiiiiiiiIIIII.setSkinpath(0);
                    IiiiiiiiIIIII.setBattleUnit(battleUnit);
                } else {
                    IiiiiiiiIIIII.setSkinpath(1);
                }
            } else if (IiiiiiiiIIIII8 == 4001 || IiiiiiiiIIIII8 == 4002 || IiiiiiiiIIIII8 == 4003 || IiiiiiiiIIIII8 == 4004) {
                int IiiiiiiiIIIII10 = 7;
                IiiiIiiiiIiIi IiiiiiiiIIIII11 = iiiiiiiiiiIiI.ALLATORIxDEMO((String)IiiiiiiiIIIII6, (int)-1, (int)0, null);
                ShadowMode IiiiiiiiIIIII12 = new ShadowMode(IiiiiiiiIIIII11, battleUnit.iiIiIiiiiIIIi + 70, battleUnit.IIiiiiiiiIIIi + 30, null, IiiiiiiiIIIII10 == 3 ? 1 : 0, battleUnit);
                IiiiiiiiIIIII.setShadowMode(IiiiiiiiIIIII12);
            } else if (IiiiiiiiIIIII8 == 1282) {
                IiiiiiiiIIIII.setSkinpath(5);
                IiiiiiiiIIIII.setBattleUnit(battleUnit);
            } else {
                IiiiiiiiIIIII.setSkinpath(0);
                IiiiiiiiIIIII.setBattleUnit(battleUnit);
            }
            IiiiiiiiIIIII.setSkillid(IIiIiiiiIiiIi.ALLATORIxDEMO((String)IiiiiiiiIIIII6));
            IiiiiiiiIIIII2.setSpell((BattleSkillShow)IiiiiiiiIIIII);
        }
        if (State.getMsg() == null) return IiiiiiiiIIIII2;
        if (battleUnit == null) return IiiiiiiiIIIII2;
        if (battleUnit.ALLATORIxDEMO().getType() != 0) return IiiiiiiiIIIII2;
        battleScene.ALLATORIxDEMO(State.getMsg(), battleUnit);
        return IiiiiiiiIIIII2;
    }

    private /* synthetic */ EffectType(String string, int n, Effect action) {
        this.action = action;
    }

    public Effect getTarget() {
        return this.action;
    }

    public static Effect getEffectById(int effectId) {
        return EffectType.values()[effectId].getTarget();
    }
}
