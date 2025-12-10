package com.xy.battle.effect;

import com.xy.dx;
import com.xy.iO;
import com.xy.o;
import com.xy.battle.BattlePlayProgress;
import com.xy.battle.BattleScene;
import com.xy.battle.BattleSkillShow;
import com.xy.battle.FightingState;
import com.xy.battle.ShadowMode;
import com.xy.bean.PathPoint;
import com.xy.game.GameMove;
import java.util.ArrayList;
import java.util.List;

public class MoveSkillEffect implements Effect {
   public BattlePlayProgress a(FightingState var1, iO var2, BattleScene var3) {
      BattlePlayProgress var4 = EffectType.getProgress(var1, var2, var3);
      BattleSkillShow var5 = new BattleSkillShow();
      int var8;
      o var9;
      ShadowMode var10;
      BattlePlayProgress var10000;
      if (!var1.getSkillskin().equals("4000") && !var1.getSkillskin().equals("4005") && !var1.getSkillskin().equals("1284") && !var1.getSkillskin().equals("10") && !var1.getSkillskin().equals("3")) {
         String[] var12;
         if (!var1.getSkillskin().equals("1252") && !var1.getSkillskin().equals("1253") && !var1.getSkillskin().equals("1254") && !var1.getSkillskin().equals("1255")) {
            var12 = var1.getEndState().split("\\|");
            iO var14;
            if ((var14 = var3.getBattleUnitByCampMan(Integer.parseInt(var12[3 ^ 3]), Integer.parseInt(var12[4 ^ 5]))).bt().getCamp() == (32759 & 1007)) {
               int var18 = var14.bt().getCampId() & --3;
            } else {
               var14.bt().getCamp();
            }

            int var15 = --3;
            o var16 = var14.ay().s();
            var16.r(Integer.parseInt(var1.getSkillskin()));
            ShadowMode var11;
            ShadowMode var19;
            int var10003;
            int var10004;
            int var10006;
            iO var10007;
            if (var12.length == (1 ^ 3)) {
               var19 = new ShadowMode;
               var10003 = var14.ab;
               var10004 = var14.al;
               if (var15 == --3) {
                  var10006 = --1;
                  var10007 = var2;
               } else {
                  var10006 = 0;
                  var10007 = var2;
               }

               var19.<init>(var16, var10003, var10004, (List)null, var10006, var10007);
               var11 = var19;
               var10000 = var4;
               var5.setShadowMode(var11);
            } else {
               var19 = new ShadowMode;
               if (var15 == --3) {
                  var10003 = var14.ab + (79 & 118);
                  var10004 = var15;
               } else {
                  var10003 = var14.ab - (102 & 95);
                  var10004 = var15;
               }

               var10004 = var10004 == 3 ? var14.al + (63 & 94) : var14.al - (127 & 30);
               if (var15 == --3) {
                  var10006 = 4 ^ 5;
                  var10007 = var2;
               } else {
                  var10006 = 0;
                  var10007 = var2;
               }

               var19.<init>(var16, var10003, var10004, (List)null, var10006, var10007);
               var11 = var19;
               var10000 = var4;
               var5.setShadowMode(var11);
            }
         } else {
            String[] var17 = var12 = var1.getEndState().split("\\|");
            PathPoint var13 = MoveEffect.c(var17, var2.ap());
            var8 = var17.length == --3 ? Integer.parseInt(var12[1 ^ 3]) : 3;
            var9 = dx.f(var1.getSkillskin(), -4 >> 2, 3 ^ 3, (String)null);
            var10 = new ShadowMode(var9, var13.getX(), var13.getY(), (List)null, var8, var2);
            var10000 = var4;
            var5.setShadowMode(var10);
         }
      } else {
         PathPoint var6 = MoveEffect.b(var1.getEndState(), var2.ap());
         ArrayList var7 = new ArrayList();
         var7.add(new PathPoint(var2.ab, var2.al));
         var7.add(var6);
         var8 = GameMove.getDirTwo(var6.getX() - var2.ab, var6.getY() - var2.al);
         var9 = null;
         if (!var1.getSkillskin().equals("4000") && !var1.getSkillskin().equals("4005") && !var1.getSkillskin().equals("1284")) {
            (var9 = var2.ay().s()).r(Integer.parseInt(var1.getSkillskin()));
         } else {
            var9 = dx.f(var1.getSkillskin(), -4 >> 2, 3 & 4, (String)null);
         }

         var10 = new ShadowMode(var9, var2.ab, var2.al, var7, var8, var2);
         var10000 = var4;
         var5.setShadowMode(var10);
      }

      var10000.setSpell(var5);
      var4.setType(5 >> 3);
      return var4;
   }
}
