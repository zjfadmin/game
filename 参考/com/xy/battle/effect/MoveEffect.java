package com.xy.battle.effect;

import com.xy.iO;
import com.xy.battle.BattlePlayProgress;
import com.xy.battle.BattleScene;
import com.xy.battle.FightingState;
import com.xy.bean.PathPoint;
import java.util.ArrayList;

public class MoveEffect implements Effect {
   public static PathPoint b(String var0, int var1) {
      return var0.equals("99") ? new PathPoint(26488 & 6791, 4990 & 28141) : c(var0.split("\\|"), var1);
   }

   public BattlePlayProgress a(FightingState var1, iO var2, BattleScene var3) {
      BattlePlayProgress var5 = EffectType.getProgress(var1, var2, var3);
      ArrayList var4 = new ArrayList();
      if (!var1.getStartState().equals("瞬移")) {
         var4.add(new PathPoint(var2.ab, var2.al));
      }

      var4.add(b(var1.getEndState(), var2.ap()));
      int var10002 = 123 & 14;
      var5.setPath(var4);
      var5.setType(var10002);
      return var5;
   }

   public static PathPoint c(String[] var0, int var1) {
      int var10000;
      int var2;
      PathPoint var4;
      label27: {
         var2 = Integer.parseInt(var0[3 ^ 3]);
         int var3 = Integer.parseInt(var0[3 >> 1]);
         var4 = iO.bw(var2, var3);
         if (var0.length == --3) {
            switch(Integer.parseInt(var0[--2])) {
            case 1:
               while(false) {
               }

               var4.setX(var4.getX() + (78 & 119));
               var4.setY(var4.getY() - (61 & 106));
               var10000 = var1;
               break label27;
            case 2:
            case 4:
            default:
               var4.setX(var4.getX() - (79 & 118));
               var4.setY(var4.getY() - (63 & 94));
               break;
            case 3:
               var4.setX(var4.getX() + (127 & 70));
               var4.setY(var4.getY() + (126 & 31));
               var10000 = var1;
               break label27;
            case 5:
               var4.setX(var4.getX() - (127 & 70));
               var4.setY(var4.getY() + (46 & 121));
               var10000 = var1;
               break label27;
            }
         }

         var10000 = var1;
      }

      if (var10000 != var2) {
         var10000 = 29435 & 4060;
         var4.setX((29990 & 3801) - var4.getX());
         var4.setY(var10000 - var4.getY());
      }

      return var4;
   }
}
