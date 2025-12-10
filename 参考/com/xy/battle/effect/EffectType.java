package com.xy.battle.effect;

import com.xy.cY;
import com.xy.dx;
import com.xy.hd;
import com.xy.iO;
import com.xy.o;
import com.xy.battle.BattleMan;
import com.xy.battle.BattlePlayProgress;
import com.xy.battle.BattleScene;
import com.xy.battle.BattleSkillShow;
import com.xy.battle.FightingState;
import com.xy.battle.ShadowMode;
import java.util.List;

public enum EffectType {
   private Effect action;
   Pet(new Pet()),
   TemporaryUnit(new TemporaryUnitEffect()),
   Escape(new EscapeEffect()),
   MoveSkill(new MoveSkillEffect()),
   Attack(new AttackEffect()),
   Move(new MoveEffect()),
   Null((Effect)null),
   PetCatch(new PetCatch());

   public Effect getTarget() {
      return this.action;
   }

   static {
      EffectType[] var10000 = new EffectType[15 & 120];
      boolean var10002 = true;
      var10000[3 >> 2] = Null;
      var10000[4 ^ 5] = Move;
      var10000[5 >> 1] = Attack;
      var10000[--3] = Pet;
      var10000[--4] = Escape;
      var10000[--5] = PetCatch;
      var10000[6 & 127] = MoveSkill;
      var10000[15 & 119] = TemporaryUnit;
   }


   private EffectType(Effect var3) {
      this.action = var3;
   }

   public static BattlePlayProgress getProgress(FightingState var0, iO var1, BattleScene var2) {
      BattlePlayProgress var7;
      BattlePlayProgress var10001 = var7 = new BattlePlayProgress(var1);
      var7.setData2(var0.getStartState());
      var7.setData(var0.getProcessState());
      var10001.setBuff(var0.getBuff());
      if (var0.getHp_Change() != null) {
         var7.setHp_Change(var0.getHp_Change().intValue());
      }

      if (var0.getMp_Change() != null) {
         var7.setMp_Change(var0.getMp_Change().intValue());
      }

      if (var0.getYq_c() != null) {
         var7.setYq_Change(var0.getYq_c().intValue());
      }

      if (var0.getNq_c() != null) {
         var7.setNq_Change(var0.getNq_c().intValue());
      }

      if (var0.getXy_c() != null) {
         var7.setXy_Change(var0.getXy_c().intValue());
      }

      var7.setAddchixu(var0.getEndState_1());
      var7.setDeletechixu(var0.getEndState_2());
      var7.setMusic(var0.getSkillsy());
      var7.setText(var0.getText());
      if (var0.getDelayTime() != null) {
         var7.setDelayTime(var0.getDelayTime());
      }

      int var10000;
      if (!hd.o(var0.getUp())) {
         String[] var4 = var0.getUp().split("\\|");

         int var5;
         for(var10000 = var5 = 3 & 4; var10000 < var4.length; var10000 = var5) {
            if (var4[var5].startsWith("HP")) {
               var1.bt().setHp_Total(Integer.parseInt(var4[var5].split("=")[3 & 5]));
            } else if (var4[var5].startsWith("MP")) {
               var1.bt().setMp_Total(Integer.parseInt(var4[var5].split("=")[3 & 5]));
            } else if (var4[var5].startsWith("ZRYQ")) {
               BattleMan var6 = var1.bt();
               iO var3;
               if ((var3 = var2.getBattleUnitByCampMan(var6.getCamp(), var6.getMan() - --5)) != null) {
                  var3.bt().a(3 & 4, 3 & 4, Integer.parseInt(var4[var5].substring(--5)), 3 & 4, 5 >> 3);
                  var2.aa(var3);
               }
            }

            ++var5;
         }
      }

      if (!hd.o(var0.getSkin())) {
         var1.bt().setModel(var0.getSkin());
         o var11;
         (var11 = var1.bt().getPart()).r(var1.bt().getHp_Current() <= 0 ? 74 & 61 : 7);
         var1.bh(var11);
      }

      if (var0.getSkillskin() != null && !var0.getSkillskin().equals("4000") && !var0.getSkillskin().equals("4005") && !var0.getSkillskin().equals("1284")) {
         BattleSkillShow var12 = new BattleSkillShow();
         String var13;
         int var14;
         if ((var14 = (var13 = var0.getSkillskin()).indexOf("|")) != -4 >> 2) {
            var10000 = 3 ^ 3;
            var12.setDir(hd.b(var13, var14 + (4 ^ 5), var13.length()));
            var13 = var13.substring(var10000, var14);
         }

         int var10 = 0;

         label187: {
            label186: {
               try {
                  if (var13.charAt(3 >> 2) >= (121 & 54) && var13.charAt(3 & 4) <= (123 & 61)) {
                     var10 = Integer.parseInt(var13);
                     break label186;
                  }
               } catch (Exception var9) {
               }

               var10000 = var10;
               break label187;
            }

            var10000 = var10;
         }

         BattleSkillShow var17;
         if (var10000 == 1283) {
            var17 = var12;
            var12.setSkinpath(14 & 119);
            var12.setBattleUnit(var1);
         } else if (var10 != (30638 & 3959) && var10 != (28539 & 6095) && var10 != (27842 & 6015) && (var10 < (8158 & 27645) || var10 > (28663 & 7148)) && var10 != (28654 & 16123) && var10 != (16363 & 28415)) {
            if (var10 != (30015 & 3827) && var10 != (32254 & 1583) && var10 != (16377 & 17455) && var10 != 1035 && var10 != 1085 && var10 != 1095 && var10 != 1100 && var10 != 1234 && var10 != 1236 && var10 != 7012 && var10 != 1883 && var10 != 30023 && var10 != 30032 && !var13.equals("捕捉") && var10 != 40006) {
               if (var10 != 4001 && var10 != 4002 && var10 != 4003 && var10 != 4004) {
                  if (var10 == 1282) {
                     var17 = var12;
                     var12.setSkinpath(--5);
                     var12.setBattleUnit(var1);
                  } else {
                     var17 = var12;
                     var12.setSkinpath(3 >> 2);
                     var12.setBattleUnit(var1);
                  }
               } else {
                  byte var15 = 7;
                  o var8 = dx.f(var13, -4 >> 2, 5 >> 3, (String)null);
                  ShadowMode var18 = new ShadowMode;
                  int var10003 = var1.ab + 70;
                  int var10004 = var1.al + 30;
                  int var10006;
                  iO var10007;
                  if (var15 == --3) {
                     var10006 = --1;
                     var10007 = var1;
                  } else {
                     var10006 = 0;
                     var10007 = var1;
                  }

                  var18.<init>(var8, var10003, var10004, (List)null, var10006, var10007);
                  ShadowMode var16 = var18;
                  var17 = var12;
                  var12.setShadowMode(var16);
               }
            } else if (!var2.gameBattle || var10 != 1035 && var10 != 1065 && var10 != 1070 && var10 != 1075 && var10 != 1085 && var10 != 1095 && var10 != 1100) {
               var17 = var12;
               var12.setSkinpath(2 ^ 3);
            } else {
               var17 = var12;
               var12.setSkinpath(2 & 5);
               var12.setBattleUnit(var1);
            }
         } else if (var2.gameBattle && var10 == (11719 & 22138)) {
            var17 = var12;
            var12.setSkinpath(5 >> 3);
            var12.setBattleUnit(var1);
         } else {
            var14 = var0.getCamp() == (27639 & 6127) ? var1.bt().getCampId() & --3 : var0.getCamp();
            var17 = var12;
            var12.setSkinpath(1 ^ 3);
            var12.setCamp(var14);
         }

         var17.setSkillid(cY.v(var13));
         var7.setSpell(var12);
      }

      if (var0.getMsg() != null && var1 != null && var1.bt().getType() == 0) {
         var2.ae(var0.getMsg(), var1);
      }

      return var7;
   }

   public static Effect getEffectById(int var0) {
      return values()[var0].getTarget();
   }
}
