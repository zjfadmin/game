package com.xy.battle;

import com.xy.hd;
import com.xy.iO;
import com.xy.mi;
import com.xy.battle.effect.EffectType;
import java.util.ArrayList;
import java.util.List;

public class BattleHandle {
   public static List<BattlePlayProgress> a(FightingEvents var0, int var1, BattleScene var2) {
      ArrayList var6 = new ArrayList();

      try {
         FightingState var4;
         if ((var4 = var0.getOriginator()) == null) {
            int var13;
            for(int var10000 = var13 = 0; var10000 < var0.getAccepterlist().size(); var10000 = var13) {
               FightingState var12;
               FightingState var15 = var12 = (FightingState)var0.getAccepterlist().get(var13);
               String var14 = var15.getStartState();
               BattlePlayProgress var8 = null;
               BattlePlayProgress var16;
               if (var15.getCamp() == (11263 & 22503)) {
                  var16 = var8 = EffectType.getEffectById(111 & 23).a(var12, (iO)null, var2);
               } else {
                  label139: {
                     if (var12.getCamp() == (15350 & 18415)) {
                        if (var12.getMan() == (79 & 59)) {
                           var16 = var8;
                           var2.campPetDie1 = hd.g(var14);
                           break label139;
                        }

                        if (var12.getMan() == (108 & 31)) {
                           var16 = var8;
                           var2.campLingDie1 = hd.g(var14);
                           break label139;
                        }

                        if (var12.getMan() == (95 & 53)) {
                           var16 = var8;
                           var2.campPetDie2 = hd.g(var14);
                           break label139;
                        }

                        if (var12.getMan() == (86 & 63)) {
                           var16 = var8;
                           var2.campLingDie2 = hd.g(var14);
                           break label139;
                        }
                     } else {
                        if (var14.equals("召唤") || var14.equals("召回") || var14.equals("闪现") || var14.equals("怪物闪现")) {
                           var16 = var8 = EffectType.getEffectById(3).a(var12, (iO)null, var2);
                           break label139;
                        }

                        iO var9;
                        if ((var9 = var2.getBattleUnitByCampMan(var12.getCamp(), var12.getMan())) != null) {
                           if (var14.equals("移动") || var14.equals("瞬移") || var14.equals("遁地")) {
                              var16 = var8 = EffectType.getEffectById(1).a(var12, var9, var2);
                              break label139;
                           }

                           if (var14.equals("技能移动")) {
                              var16 = var8 = EffectType.getEffectById(6 & 127).a(var12, var9, var2);
                              break label139;
                           }

                           var8 = EffectType.getEffectById(2).a(var12, var9, var2);
                        }
                     }

                     var16 = var8;
                  }
               }

               if (var16 != null) {
                  if (var8.getSpell() != null) {
                     var8.getSpell().setRound(var1);
                  }

                  var6.add(var8);
               }

               ++var13;
            }

            return var6;
         }

         String var5;
         if (!(var5 = var4.getStartState()).equals("召唤") && !var5.equals("召回") && !var5.equals("闪现") && !var5.equals("怪物闪现")) {
            BattlePlayProgress var7;
            iO var11;
            if (!var5.equals("逃跑成功") && !var5.equals("逃跑失败")) {
               if ((var5.equals("捕捉失败") || var5.equals("捕捉成功")) && (var11 = var2.getBattleUnitByCampMan(var4.getCamp(), var4.getMan())) != null && (var7 = EffectType.getEffectById(--5).a(var4, var11, var2)) != null) {
                  var6.add(var7);
                  return var6;
               }
            } else if ((var11 = var2.getBattleUnitByCampMan(var4.getCamp(), var4.getMan())) != null && (var7 = EffectType.getEffectById(--4).a(var4, var11, var2)) != null) {
               var6.add(var7);
               return var6;
            }
         } else {
            BattlePlayProgress var3;
            if ((var3 = EffectType.getEffectById(3).a(var4, (iO)null, var2)) != null) {
               var6.add(var3);
               return var6;
            }
         }
      } catch (Exception var10) {
         System.err.println(mi.b().toJson(var0));
         var10.printStackTrace();
      }

      return var6;
   }

   public static int getdir(int var0) {
      if (var0 == (15 & 119)) {
         return var0 = --3;
      } else if (var0 == --3) {
         return var0 = 63 & 71;
      } else if (var0 == --5) {
         return var0 = --1;
      } else if (var0 == --1) {
         return var0 = --5;
      } else if (var0 == 0) {
         return var0 = --4;
      } else if (var0 == --2) {
         return var0 = 94 & 39;
      } else if (var0 == --4) {
         return var0 = 2 & 5;
      } else {
         if (var0 == (47 & 86)) {
            var0 = 1 ^ 3;
         }

         return var0;
      }
   }
}
