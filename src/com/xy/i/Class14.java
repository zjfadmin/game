package com.xy.i;

import com.xy.a.Class40;
import com.xy.a.Class97;
import com.xy.battle.BattleControl;
import com.xy.battle.FightingEvents;
import com.xy.bean.FightOperation;
import com.xy.q.Class30;
import com.xy.q.Class49;
import com.xy.socket.Agreement;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;

public class Class14 extends Class1 {
   private int ah;

   public int il() {
      return this.ah;
   }

   public static void ahv(int var0, BattleControl var1) {
      com.xy.d.Class11 var2;
      if ((var2 = var1.getHandleUnit()) != null) {
         if (var0 == 1) {
            Class0.ff(34, var1.gameView);
         } else if (var0 == 2) {
            Class0.ff(2, var1.gameView);
         } else {
            if (var0 == 3) {
               if (var2.cg().getType() != 0) {
                  return;
               }

               Class0.ff(6, var1.gameView);
            }
         }
      }
   }

   @Override
   public void fe(MouseEvent var1, boolean var2) {
   }

   public static void ahw(BattleControl var0) {
      com.xy.d.Class11 var1;
      if ((var1 = var0.getHandleUnit()) != null && var1.cg().getType() == 0) {
         var0.setMouseIndex(com.xy.v.Class3.m, null);
         var0.d();
      }
   }

   public Class14(String var1, int var2, int var3, Class30 var4) {
      super(var1, var2, var4);
      this.ah = var3;
   }

   @Override
   public void mouseEntered(MouseEvent var1) {
      super.mouseEntered(var1);
      if (this.ah == 10) {
         BattleControl var2;
         if ((var2 = this.form.afx.getBattleControl()).battleScene == null || !var2.battleScene.battleTip) {
            return;
         }

         if (this.form instanceof Class97) {
            return;
         }

         ((Class40)this.form.zc().j(161)).h();
      }
   }

   public static void ahx(BattleControl var0) {
      ahv(3, var0);
   }

   public static void ahy(BattleControl var0) {
      ahv(1, var0);
   }

   public static void ahz(BattleControl var0) {
      ahv(2, var0);
   }

   public static void aia(BattleControl var0) {
      com.xy.d.Class11 var1;
      if ((var1 = var0.getHandleUnit()) != null) {
         FightOperation var2 = var1.cg().getType() == 0 ? var0.RoleOperation : var0.PetOperation;
         var2.a(true, -1, 6, null);
         var2.setCamp(-1);
         var0.k(var2);
      }
   }

   public Class14(String var1, int var2, int var3, String var4, Class30 var5) {
      this(var1, var2, var3, null, null, var4, var5);
   }

   public Class14(String var1, int var2, int var3, Font var4, Color[] var5, String var6, Class30 var7) {
      super(var1, var2, var5, var7);
      this.ah = var3;
      int var10000;
      if (var4 != null) {
         var10000 = var3;
         this.setFont(var4);
      } else {
         this.setFont(Class49.bz);
         var10000 = var3;
      }

      if (var10000 != 21 && var3 != 22) {
         this.setHorizontalAlignment(0);
      }

      this.setText(var6);
   }

   @Override
   public void cw(MouseEvent var1) {
      if (this.form instanceof Class97) {
         ((Class97)this.form).g(this.ah);
      } else {
         BattleControl var2;
         if ((var2 = this.form.afx.getBattleControl()).battleScene != null) {
            if (var2.battleCamp == -1) {
               if (this.ah == 9) {
                  if (var2.battleScene.video) {
                     var2.battleScene.e(var2);
                     return;
                  }

                  if (!this.form.afx.roleUnit.bb()) {
                     String var4 = "阑吁沯沌丵勱禵彙觌扁";
                     this.form.afx.dp("队员没法主动离开观战");
                     return;
                  }

                  String var10001 = "\u0014D";
                  String var3 = Agreement.getSendTextAES("battleconnection", "-1");
                  this.form.za().k(var3);
               }
            } else if (this.ah == 1) {
               ahy(var2);
            } else if (this.ah == 2) {
               ahz(var2);
            } else if (this.ah == 3) {
               aie(var2);
            } else if (this.ah == 4) {
               aif(var2);
            } else if (this.ah == 5) {
               ahx(var2);
            } else if (this.ah == 6) {
               aic(var2);
            } else if (this.ah == 7) {
               ahw(var2);
            } else if (this.ah == 8) {
               aia(var2);
            } else {
               if (this.ah == 9) {
                  aib(var2);
               }
            }
         }
      }
   }

   public static void aib(BattleControl var0) {
      var0.automationTime = com.xy.v.Class22.l();
      Class97 var1 = (Class97)var0.gameView.getFormManagement().j(151);
      var1.acy(0, var0.RoleOperation, var0);
      var1.acy(1, var0.PetOperation, var0);
      Class0.ff(151, var0.gameView);
   }

   @Override
   public void mouseExited(MouseEvent var1) {
      super.mouseExited(var1);
      if (this.ah == 10) {
         if (this.form.afx.getBattleControl().battleScene == null) {
            return;
         }

         if (this.form instanceof Class97) {
            return;
         }

         this.form.zc().f(161);
      }
   }

   public static void aic(BattleControl var0) {
      com.xy.d.Class11 var1;
      if ((var1 = var0.getHandleUnit()) != null && var1.cg().getType() == 0) {
         if (var0.getPetUnit() != null) {
            String var10002 = "叢嚇";
            var0.o(aid("召回", var1, var0));
            var1.q(true);
            var0.c();
         }
      }
   }

   public static FightingEvents aid(String var0, com.xy.d.Class11 var1, BattleControl var2) {
      FightingEvents var10000 = new FightingEvents();
      var10000.setOriginator(var2.b(var0, var1));
      return var10000;
   }

   public static void aie(BattleControl var0) {
      com.xy.d.Class11 var1;
      if ((var1 = var0.getHandleUnit()) != null) {
         FightOperation var2 = var1.cg().getType() == 0 ? var0.RoleOperation : var0.PetOperation;
         var2.a(true, -1, 5, null);
         var2.setCamp(-1);
         var0.k(var2);
      }
   }

   public static void aif(BattleControl var0) {
      if (var0.getHandleUnit() != null) {
         var0.setMouseIndex(com.xy.v.Class3.i, null);
         var0.d();
      }
   }
}
