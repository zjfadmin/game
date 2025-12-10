package com.xy.battle.effect;

import com.xy.iO;
import com.xy.battle.BattlePlayProgress;
import com.xy.battle.BattleScene;
import com.xy.battle.FightingState;

public class TemporaryUnitEffect implements Effect {
   public BattlePlayProgress a(FightingState var1, iO var2, BattleScene var3) {
      if ((var2 = var3.getBattleUnitByCampMan(var1.getCamp(), var1.getMan())) == null) {
         if (var1.getFightingManData() == null) {
            return null;
         }

         var2 = new iO(var1.getFightingManData(), var1, var3);
         var3.p(var2);
      }

      BattlePlayProgress var4 = null;
      String var5 = var1.getStartState();
      int var6 = 3 & 4;
      if (var5.startsWith("召回")) {
         var6 = --1;
         if ((var5 = var5.substring(5 >> 1)).equals("")) {
            var5 = "代价";
         }

         var1.setStartState(var5);
      }

      int var10000;
      if (!var5.equals("移动") && !var5.equals("瞬移") && !var5.equals("遁地")) {
         if (var5.equals("技能移动")) {
            var4 = EffectType.getEffectById(23 & 110).a(var1, var2, var3);
            var10000 = var6;
         } else {
            var4 = EffectType.getEffectById(2).a(var1, var2, var3);
            var10000 = var6;
         }
      } else {
         var4 = EffectType.getEffectById(1).a(var1, var2, var3);
         var10000 = var6;
      }

      if (var10000 != 0 && var4 != null) {
         var4.setEscape(--1);
      }

      return var4;
   }
}
