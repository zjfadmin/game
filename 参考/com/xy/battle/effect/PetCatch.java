package com.xy.battle.effect;

import com.xy.cY;
import com.xy.iO;
import com.xy.battle.BattlePlayProgress;
import com.xy.battle.BattleScene;
import com.xy.battle.BattleSkillShow;
import com.xy.battle.FightingState;
import java.math.BigDecimal;

public class PetCatch implements Effect {
   public BattlePlayProgress a(FightingState var1, iO var2, BattleScene var3) {
      BattlePlayProgress var6 = EffectType.getProgress(var1, var2, var3);
      BattleSkillShow var4 = new BattleSkillShow(cY.v("捕捉"), 3 & 5);
      var4.setSkinpath(--1);
      var6.setSpell(var4);
      var6.setType(95 & 39);
      if (!var1.getStartState().equals("捕捉失败")) {
         var6.setEscape(5 >> 2);
         String[] var5 = var1.getEndState().split("\\|");
         var3.k(Integer.parseInt(var5[2 & 5]), Integer.parseInt(var5[--1]), new BigDecimal(var5[5 >> 1]));
      }

      return var6;
   }
}
