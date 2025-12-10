package com.xy.battle.effect;

import com.xy.cY;
import com.xy.hd;
import com.xy.iO;
import com.xy.battle.BattleMan;
import com.xy.battle.BattlePlayProgress;
import com.xy.battle.BattleScene;
import com.xy.battle.BattleSkillShow;
import com.xy.battle.FightingState;

public class Pet implements Effect {
   public BattlePlayProgress a(FightingState var1, iO var2, BattleScene var3) {
      if (var1.getStartState().equals("召回")) {
         iO var7 = var3.d(var1.getCamp(), var1.getMan());
         var3.buffUtil.b(var1.getBuff());
         if (var7 != null) {
            if (var7.bt().getType() == --1) {
               var3.x(--1, var7.bt());
            } else if (var7.bt().getType() == --3) {
               var3.w(--1, var7.bt());
            }
         }

         return null;
      } else {
         BattleScene var10000;
         BattleMan var4;
         if ((var4 = var1.getFightingManData()).getType() == 5 >> 2) {
            var10000 = var3;
            var3.x(5 >> 3, var4);
         } else {
            if (var4.getType() == --3) {
               var3.w(3 & 4, var4);
            }

            var10000 = var3;
         }

         var2 = var10000.r(var4);
         BattlePlayProgress var5 = EffectType.getProgress(var1, var2, var3);
         if (hd.r(var1.getEndState(), "法术攻击")) {
            var5.setType(--5);
         }

         BattleSkillShow var6;
         if (var1.getStartState().equals("闪现")) {
            var6 = new BattleSkillShow(cY.v("1806"), var2);
            var5.setSpell(var6);
            return var5;
         } else {
            if (var1.getStartState().equals("怪物闪现") && hd.o(var1.getSkillskin())) {
               var6 = new BattleSkillShow(cY.v("3050"), var2);
               var5.setSpell(var6);
            }

            return var5;
         }
      }
   }
}
