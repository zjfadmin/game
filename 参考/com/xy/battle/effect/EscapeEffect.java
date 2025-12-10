package com.xy.battle.effect;

import com.xy.iO;
import com.xy.battle.BattlePlayProgress;
import com.xy.battle.BattleScene;
import com.xy.battle.FightingState;

public class EscapeEffect implements Effect {
   public BattlePlayProgress a(FightingState var1, iO var2, BattleScene var3) {
      FightingState var10000 = var1;
      BattlePlayProgress var4 = EffectType.getProgress(var1, var2, var3);
      if (var10000.getStartState().equals("逃跑成功")) {
         var4.setEscape(4 ^ 5);
      }

      int var10002 = --3;
      int var10004 = 7 & 127;
      var4.setType(5 >> 2);
      var4.setDir(var10004);
      var4.setDirend(var10002);
      return var4;
   }
}
