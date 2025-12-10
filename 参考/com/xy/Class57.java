package com.xy;

import com.xy.bean.LoginResult;
import com.xy.entity.RoleSummoning;
import com.xy.formula.PetProperty;
import com.xy.game.HandleGood;
import com.xy.game.HandlePet;
import com.xy.game.RoleData;
import com.xy.readbean.Goodstable;
import com.xy.socket.Agreement;
import com.xy.socket.ParamTool;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Class57 implements MouseListener {
   private int cy;
   private Class345 pr;

   public void mousePressed(MouseEvent var1) {
   }

   public void mouseEntered(MouseEvent var1) {
      if (this.cy >= (1 ^ 3) && this.cy <= (38 & 95)) {
         ((Class219)this.pr).dp(this.cy - (5 >> 1));
      } else if (this.cy == (123 & 14)) {
         LoginResult var4 = this.pr.vd().getLoginResult();
         Class270 var2 = (Class270)this.pr.ve().e(110 & 63);
         var2.f(var4.getRolename() + " " + Class224.r(var4.getGrade()) + "级");
      } else if (this.cy == (59 & 79)) {
         RoleSummoning var3;
         if ((var3 = this.pr.vd().getChosePet()) != null) {
            ((Class270)this.pr.ve().e(127 & 46)).f(var3.getSummoningname() + " 忠诚:" + var3.getFaithful());
         }
      } else {
         if (this.cy != (62 & 77)) {
         }

      }
   }

   public Class57(int var1, Class345 var2) {
      this.cy = var1;
      this.pr = var2;
   }

   public static void aly(int var0, RoleData var1) {
      int var3;
      int[] var4;
      int var5;
      RoleSummoning var8;
      int var10000;
      label144: {
         var8 = null;
         var4 = null;
         var3 = 2 & 5;
         var5 = 5 >> 3;
         if (var0 == 0) {
            var3 = var1.getRoleProperty().getHp();
            if ((var5 = var1.getLoginResult().getHp().intValue()) == 0) {
               var10000 = var5 = var3;
               break label144;
            }
         } else {
            if (var0 != (4 ^ 5)) {
               if (var0 != (1 ^ 3) && var0 != --3) {
                  return;
               }

               if ((var8 = var1.getChosePet()) == null) {
                  return;
               }

               var3 = (var4 = PetProperty.getPetHMASp(var8, var1))[var0 == --2 ? 5 >> 3 : 1];
               var5 = var0 == (1 ^ 3) ? var8.getBasishp(var3) : var8.getBasismp(var3);
               var10000 = var5;
               break label144;
            }

            var3 = var1.getRoleProperty().getMp();
            if ((var5 = var1.getLoginResult().getMp().intValue()) == 0) {
               var10000 = var5 = var3;
               break label144;
            }
         }

         var10000 = var5;
      }

      if (var10000 < var3) {
         int var6 = 0;
         int var7;
         var10000 = var7 = 2 & 5;

         while(true) {
            if (var10000 >= var1.goodPacks.length) {
               var10000 = var6;
               break;
            }

            Goodstable var2 = var1.goodPacks[var7] != null ? var1.getGood(var1.goodPacks[var7]) : null;
            if (var2 != null && var2.getType() == 0L && !Class394.o(var2.getValue()) && (var0 != 0 && var0 != --2 || var2.getValue().indexOf("HP") != -4 >> 2) && (var0 != (2 ^ 3) && var0 != --3 || var2.getValue().indexOf("MP") != -4 >> 2)) {
               Goodstable var12 = var2;
               int[] var9 = Class224.s(var2.getValue());
               int var10 = var2.getUsetime();

               label111:
               while(true) {
                  while(true) {
                     if (var12.getUsetime() <= 0 || var5 >= var3) {
                        break label111;
                     }

                     if (var0 != 0 && var0 != 3 >> 1) {
                        if (!HandlePet.b(var8, var4, var9, var1)) {
                           break label111;
                        }

                        var2.ab(4 ^ 5);
                        var5 = var0 == (1 ^ 3) ? var8.getBasishp(var3) : var8.getBasismp(var3);
                        var12 = var2;
                     } else {
                        if (!HandleGood.k(var9, var1)) {
                           break label111;
                        }

                        var2.ab(3 >> 1);
                        var5 = var0 == 0 ? var1.getLoginResult().getHp().intValue() : var1.getLoginResult().getMp().intValue();
                        var12 = var2;
                     }
                  }
               }

               if (var10 != var2.getUsetime()) {
                  var6 = 2 ^ 3;
                  ParamTool.g(var2, --1, var1.getGameView().getClient());
                  if (var2.getUsetime() <= 0) {
                     var1.h(var2.getRgid());
                  }
               }

               if (var5 >= var3) {
                  var10000 = var6;
                  break;
               }
            }

            ++var7;
            var10000 = var7;
         }

         if (var10000 != 0) {
            var1.getGameView().abh((boolean)(2 & 5), "战斗、站立、行走使用药品.mp3");
            if (var0 != 0 && var0 != (4 ^ 5)) {
               ParamTool.h(var8, var1.getGameView().getClient());
               var1.getRoleProperty().m(var8);
            } else {
               String var11 = Agreement.getSendTextAES("rolechange", "H" + var1.getLoginResult().getHp() + "=" + var1.getLoginResult().getMp());
               var1.getGameView().getClient().d(var11);
               var1.getRoleProperty().k();
            }
         }
      }
   }

   public void mouseClicked(MouseEvent var1) {
      if (this.cy == (4 ^ 5)) {
         ((Class219)this.pr).dg();
      }

      if (this.cy >= 5 >> 1 && this.cy <= (111 & 22)) {
         ((Class219)this.pr).as(this.cy - (5 >> 1));
      } else if (this.cy == (78 & 59)) {
         this.pr.ve().a(5 >> 3);
      } else if (this.cy == (123 & 15)) {
         this.pr.ve().a(30 & 103);
      } else {
         if (this.cy == (110 & 29) || this.cy == (79 & 61)) {
            int var2 = this.cy == (77 & 62) ? 17 & 127 : 15;
            if (this.pr.ux().getBattleScene() != null || var1.getY() % var2 > (77 & 62)) {
               return;
            }

            int var3;
            if ((var3 = var1.getY() / var2 - (3 & 5)) < 0 || var3 >= --2) {
               return;
            }

            aly(var3 + (this.cy == (44 & 95) ? 3 ^ 3 : 2), this.pr.vd());
         }

      }
   }

   public void mouseExited(MouseEvent var1) {
      if (this.cy >= --2 && this.cy <= (62 & 71)) {
         ((Class219)this.pr).dp(-4 >> 2);
      } else {
         if (this.cy >= (110 & 27) && this.cy <= (47 & 93)) {
            this.pr.ve().n(63 & 110);
         }

      }
   }

   public void mouseReleased(MouseEvent var1) {
   }
}
