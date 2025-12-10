package com.xy;

import com.xy.battle.BattleControl;
import com.xy.battle.FightingEvents;
import com.xy.bean.ConfirmBean;
import com.xy.bean.FightOperation;
import com.xy.socket.Agreement;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;

public class Class600 extends Class93 {
   private int m;

   public void mouseExited(MouseEvent var1) {
      super.mouseExited(var1);
      if (this.m == (78 & 59)) {
         if (this.form.aej.getBattleControl().battleScene == null) {
            return;
         }

         if (this.form instanceof Class77) {
            return;
         }

         this.form.ve().n(32435 & 493);
      }

   }

   public void ac(MouseEvent var1, boolean var2) {
      if (this.form != null && this.m >= (111 & 117) && this.m <= (118 & 111) && var2) {
         ((Class275)this.form).as(this.m - (117 & 111));
      }

   }

   public int ae() {
      return this.m;
   }

   public static void acm(BattleControl var0) {
      Class514 var1;
      if ((var1 = var0.getHandleUnit()) != null && var1.bt().getType() == 0) {
         if (var0.getPetUnit() != null) {
            int var10002 = --1;
            var0.c(acq("召回", var1, var0));
            var1.i((boolean)var10002);
            var0.m();
         }
      }
   }

   public static void acn(BattleControl var0) {
      acu(--2, var0);
   }

   public void af(MouseEvent var1) {
      if (this.form instanceof Class77) {
         ((Class77)this.form).y(this.m);
      } else if (this.form instanceof Class275) {
         ((Class275)this.form).y(this.m);
      } else {
         BattleControl var3;
         if ((var3 = this.form.aej.getBattleControl()).battleScene != null) {
            if (var3.battleCamp == -4 >> 2) {
               if (this.m == (43 & 93)) {
                  if (var3.battleScene.video) {
                     var3.battleScene.ag(var3);
                     return;
                  }

                  if (!this.form.aej.roleUnit.h()) {
                     this.form.aej.fw("队员没法主动离开观战");
                     return;
                  }

                  String var2 = Agreement.getSendTextAES("battleconnection", "-1");
                  this.form.uw().d(var2);
               }

            } else if (this.m == 3 >> 1) {
               acy(var3);
            } else if (this.m == --2) {
               acn(var3);
            } else if (this.m == --3) {
               acr(var3);
            } else if (this.m == --4) {
               acx(var3);
            } else if (this.m == --5) {
               aco(var3);
            } else if (this.m == (14 & 119)) {
               acm(var3);
            } else if (this.m == (87 & 47)) {
               acw(var3);
            } else if (this.m == (104 & 31)) {
               acs(var3);
            } else if (this.m == (105 & 31)) {
               acv(var3);
            } else if (this.m == (91 & 47)) {
               acp(var3);
            } else {
               if (this.m == (30 & 109)) {
                  act(var3);
               }

            }
         }
      }
   }

   public Class600(String var1, int var2, int var3, Font var4, Color[] var5, String var6, Class345 var7) {
      super(var1, var2, var5, var7);
      this.m = var3;
      int var10000;
      if (var4 != null) {
         this.setFont(var4);
         var10000 = var3;
      } else {
         this.setFont(Class681.bm);
         var10000 = var3;
      }

      if (var10000 != 21 && var3 != (94 & 55)) {
         this.setHorizontalAlignment(2 & 5);
      }

      this.setText(var6);
   }

   public void mouseEntered(MouseEvent var1) {
      super.mouseEntered(var1);
      if (this.m == (10 & 127)) {
         BattleControl var2;
         if ((var2 = this.form.aej.getBattleControl()).battleScene == null || !var2.battleScene.battleTip) {
            return;
         }

         if (this.form instanceof Class77) {
            return;
         }

         ((Class458)this.form.ve().e(1725 & 31203)).d();
      }

   }

   public static void aco(BattleControl var0) {
      acu(--3, var0);
   }

   public static void acp(BattleControl var0) {
      String var1 = Agreement.getSendText("fig1", "A");
      var0.gameView.getClient().d(var1);
   }

   public static FightingEvents acq(String var0, Class514 var1, BattleControl var2) {
      FightingEvents var10000 = new FightingEvents();
      var10000.setOriginator(var2.b(var0, var1));
      return var10000;
   }

   public static void acr(BattleControl var0) {
      Class514 var1;
      if ((var1 = var0.getHandleUnit()) != null) {
         FightOperation var2 = var1.bt().getType() == 0 ? var0.RoleOperation : var0.PetOperation;
         int var10003 = -4 >> 2;
         var2.a((boolean)(3 & 5), -4 >> 2, --5, (String)null);
         var2.setCamp(var10003);
         var0.s(var2);
      }
   }

   public Class600(String var1, int var2, int var3, Class345 var4) {
      super(var1, var2, var4);
      this.m = var3;
   }

   public static void acs(BattleControl var0) {
      Class514 var1;
      if ((var1 = var0.getHandleUnit()) != null) {
         FightOperation var2 = var1.bt().getType() == 0 ? var0.RoleOperation : var0.PetOperation;
         int var10003 = -4 >> 2;
         var2.a((boolean)(3 & 5), -4 >> 2, 102 & 31, (String)null);
         var2.setCamp(var10003);
         var0.s(var2);
      }
   }

   public static void act(BattleControl var0) {
      var0.gameView.aal(new ConfirmBean(37 & 127, Agreement.getSendText("fig1", "B"), "你确定是否投降?"));
   }

   public Class600(String var1, int var2, int var3, String var4, Class345 var5) {
      this(var1, var2, var3, (Font)null, (Color[])null, var4, var5);
   }

   public static void acu(int var0, BattleControl var1) {
      Class514 var2;
      if ((var2 = var1.getHandleUnit()) != null) {
         if (var0 == (2 ^ 3)) {
            Class658.cy(42 & 119, var1.gameView);
         } else if (var0 == (1 ^ 3)) {
            Class658.cy(1 ^ 3, var1.gameView);
         } else {
            if (var0 == --3) {
               if (var2.bt().getType() != 0) {
                  return;
               }

               if (var1.gameView.getClient().i()) {
                  Class658.cy(21222 & 11737, var1.gameView);
                  return;
               }

               Class658.cy(6, var1.gameView);
            }

         }
      }
   }

   public static void acv(BattleControl var0) {
      var0.automationTime = Class280.l();
      Class77 var1 = (Class77)var0.gameView.getFormManagement().e(14847 & 18071);
      int var10000 = 25239 & 7679;
      int var10002 = --1;
      var1.aje(5 >> 3, var0.RoleOperation, var0);
      var1.aje(var10002, var0.PetOperation, var0);
      Class658.cy(var10000, var0.gameView);
   }

   public static void acw(BattleControl var0) {
      Class514 var1;
      if ((var1 = var0.getHandleUnit()) != null && var1.bt().getType() == 0) {
         var0.setMouseIndex(Class320.c, (Object)null);
         var0.f();
      }
   }

   public static void acx(BattleControl var0) {
      if (var0.getHandleUnit() != null) {
         var0.setMouseIndex(Class320.h, (Object)null);
         var0.f();
      }
   }

   public static void acy(BattleControl var0) {
      acu(4 ^ 5, var0);
   }
}
