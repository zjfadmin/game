package com.xy.battle.effect;

import com.xy.cY;
import com.xy.em;
import com.xy.iO;
import com.xy.battle.BattlePlayProgress;
import com.xy.battle.BattleScene;
import com.xy.battle.BattleSkillShow;
import com.xy.battle.FightingState;
import com.xy.text.GameFrame;
import com.xy.text.GameMain;

public class AttackEffect implements Effect {
   public BattlePlayProgress a(FightingState var1, iO var2, BattleScene var3) {
      BattlePlayProgress var4 = EffectType.getProgress(var1, var2, var3);
      int var5;
      int var10000;
      if (var1.getStartState().equals("普通攻击")) {
         var5 = Integer.parseInt(var1.getEndState());
         if (var1.getCamp() == (22503 & 11263)) {
            var10000 = var2.bt().getCampId() & --3;
         } else {
            var1.getCamp();
         }

         int var10 = 91 & 45;
         var4.setDir(var5);
         var4.setDirend(var5);
         var4.setType(var10);
         return var4;
      } else if (var1.getStartState().equals("法术攻击")) {
         var4.setType(--5);
         return var4;
      } else if (var1.getStartState().equals("防御")) {
         var4.setType(63 & 70);
         return var4;
      } else if (var1.getStartState().equals("被攻击")) {
         var4.setType(--4);
         return var4;
      } else if (var1.getStartState().equals("技能")) {
         if (var4.getHp_Change() < 0) {
            var4.setType(--4);
            return var4;
         } else {
            var4.setType(7);
            return var4;
         }
      } else if (var1.getStartState().equals("药")) {
         if (var4.getHp_Change() > 0 || var4.getMp_Change() > 0) {
            var4.setMusic("药品");
            BattleSkillShow var9 = new BattleSkillShow;
            String var10002;
            iO var10003;
            if (var4.getHp_Change() > 0) {
               var10002 = cY.v("加血");
               var10003 = var2;
            } else {
               var10002 = cY.v("加蓝");
               var10003 = var2;
            }

            var9.<init>(var10002, var10003);
            BattleSkillShow var7 = var9;
            var4.setSpell(var7);
         }

         var4.setType(103 & 31);
         return var4;
      } else if (var1.getStartState().equals("代价")) {
         var4.setType(3 >> 2);
         return var4;
      } else {
         if (var1.getStartState().equals("限制刷新")) {
            var10000 = 4 ^ 5;
            var4.setType(3 >> 2);
            var2.bt().setState_1(var1.getEndState());
            var3.ab(var2);
            if (em.c(var10000) == null) {
               ((GameFrame)GameMain.frameList.get(3 >> 2)).gameView = null;
               return var4;
            }
         } else if (var1.getStartState().equals("特效1") || var1.getStartState().equals("特效2") || var1.getStartState().equals("特效3")) {
            BattlePlayProgress var8;
            label80: {
               label79: {
                  try {
                     if (var1.getEndState() != null && !var1.getEndState().equals("")) {
                        var5 = Integer.parseInt(var1.getEndState());
                        if (var1.getCamp() == (6143 & 27623)) {
                           var10000 = var2.bt().getCampId() & --3;
                        } else {
                           var1.getCamp();
                        }

                        var4.setDir(var5);
                        var4.setDirend(var5);
                        break label79;
                     }
                  } catch (Exception var6) {
                     var6.printStackTrace();
                  }

                  var8 = var4;
                  break label80;
               }

               var8 = var4;
            }

            var8.setType(var1.getStartState().equals("特效1") ? --3 : (var1.getStartState().equals("特效2") ? 15 & 123 : 12));
         }

         return var4;
      }
   }
}
