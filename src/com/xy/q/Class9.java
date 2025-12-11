package com.xy.q;

import com.xy.a.Class74;
import com.xy.bean.LoginResult;
import com.xy.entity.RoleSummoning;
import com.xy.formula.PetProperty;
import com.xy.game.HandleGood;
import com.xy.game.HandlePet;
import com.xy.game.RoleData;
import com.xy.readbean.Goodstable;
import com.xy.socket.Agreement;
import com.xy.socket.ParamTool;
import com.xy.text.GameView;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Class9 implements MouseListener {
   private Class30 cw;
   private int ah;

   public static void ae(int var0, RoleData var1) {
      RoleSummoning var2;
      int[] var3;
      int var11;
      int var12;
      int var10000;
      label144: {
         var2 = null;
         var3 = null;
         boolean var4 = false;
         boolean var5 = false;
         if (var0 == 0) {
            var11 = var1.getRoleProperty().getHp();
            if ((var12 = var1.getLoginResult().getHp().intValue()) == 0) {
               var10000 = var12 = var11;
               break label144;
            }
         } else {
            if (var0 != 1) {
               if (var0 != 2 && var0 != 3) {
                  return;
               }

               if ((var2 = var1.getChosePet()) == null) {
                  return;
               }

               var11 = (var3 = PetProperty.getPetHMASp(var2, var1))[var0 == 2 ? 0 : 1];
               var12 = var0 == 2 ? var2.getBasishp(var11) : var2.getBasismp(var11);
               var10000 = var12;
               break label144;
            }

            var11 = var1.getRoleProperty().getMp();
            if ((var12 = var1.getLoginResult().getMp().intValue()) == 0) {
               var10000 = var12 = var11;
               break label144;
            }
         }

         var10000 = var12;
      }

      if (var10000 < var11) {
         boolean var6 = false;
         int var7;
         var10000 = var7 = 0;

         boolean var18;
         while (true) {
            if (var10000 >= var1.goodPacks.length) {
               var18 = var6;
               break;
            }

            Goodstable var8 = var1.goodPacks[var7] != null ? var1.getGood(var1.goodPacks[var7]) : null;
            label130:
            if (var8 != null && var8.getType() == 0L && !com.xy.v.Class12.h(var8.getValue())) {
               if (var0 == 0 || var0 == 2) {
                  String var15 = var8.getValue();
                  String var10001 = "y|";
                  if (var15.indexOf("HP") == -1) {
                     break label130;
                  }
               }

               if (var0 == 1 || var0 == 3) {
                  String var16 = var8.getValue();
                  String var20 = "\u00052";
                  if (var16.indexOf("MP") == -1) {
                     break label130;
                  }
               }

               Goodstable var17 = var8;
               int[] var9 = com.xy.v.Class4.j(var8.getValue());
               int var10 = var8.getUsetime();

               while (var17.getUsetime() > 0 && var12 < var11) {
                  if (var0 != 0 && var0 != 1) {
                     if (!HandlePet.d(var2, var3, var9, var1)) {
                        break;
                     }

                     var8.n(1);
                     var12 = var0 == 2 ? var2.getBasishp(var11) : var2.getBasismp(var11);
                     var17 = var8;
                  } else {
                     if (!HandleGood.h(var9, var1)) {
                        break;
                     }

                     var8.n(1);
                     var12 = var0 == 0 ? var1.getLoginResult().getHp().intValue() : var1.getLoginResult().getMp().intValue();
                     var17 = var8;
                  }
               }

               if (var10 != var8.getUsetime()) {
                  var6 = true;
                  ParamTool.j(var8, 1, var1.getGameView().getClient());
                  if (var8.getUsetime() <= 0) {
                     var1.ag(var8.getRgid());
                  }
               }

               if (var12 >= var11) {
                  var18 = var6;
                  break;
               }
            }

            var10000 = ++var7;
         }

         if (var18) {
            GameView var19 = var1.getGameView();
            String var10002 = "戩斻〰竵竺〭衽赜低甄荞哭\u001fAA\u001f";
            var19.dg(false, "战斗、站立、行走使用药品.mp3");
            if (var0 != 0 && var0 != 1) {
               ParamTool.d(var2, var1.getGameView().getClient());
               var1.getRoleProperty().i(var2);
            } else {
               String var10003 = "*";
               StringBuilder var21 = new StringBuilder("H").append(var1.getLoginResult().getHp());
               var10002 = "\u0011";
               String var13 = Agreement.getSendTextAES("rolechange", var21.append("=").append(var1.getLoginResult().getMp()).toString());
               var1.getGameView().getClient().k(var13);
               var1.getRoleProperty().e();
            }
         }
      }
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
   }

   public Class9(int var1, Class30 var2) {
      this.ah = var1;
      this.cw = var2;
   }

   @Override
   public void mouseExited(MouseEvent var1) {
      if (this.ah >= 2 && this.ah <= 6) {
         ((Class74)this.cw).bi(-1);
      } else {
         if (this.ah >= 10 && this.ah <= 13) {
            this.cw.zc().f(46);
         }
      }
   }

   @Override
   public void mousePressed(MouseEvent var1) {
   }

   @Override
   public void mouseEntered(MouseEvent var1) {
      if (this.ah >= 2 && this.ah <= 6) {
         ((Class74)this.cw).bi(this.ah - 2);
      } else if (this.ah == 10) {
         LoginResult var4 = this.cw.yx().getLoginResult();
         com.xy.a.Class48 var3 = (com.xy.a.Class48)this.cw.zc().j(46);
         StringBuilder var5 = new StringBuilder(String.valueOf(var4.getRolename()));
         String var7 = "B";
         var5 = var5.append(" ").append(com.xy.v.Class4.h(var4.getGrade()));
         var7 = "纋";
         var3.bq(var5.append("级").toString());
      } else if (this.ah == 11) {
         RoleSummoning var2;
         if ((var2 = this.cw.yx().getChosePet()) != null) {
            com.xy.a.Class48 var10000 = (com.xy.a.Class48)this.cw.zc().j(46);
            StringBuilder var10001 = new StringBuilder(String.valueOf(var2.getSummoningname()));
            String var10002 = "h徂讒X";
            var10000.bq(var10001.append(" 忠诚:").append(var2.getFaithful()).toString());
         }
      } else {
         if (this.ah != 12) {
         }
      }
   }

   @Override
   public void mouseClicked(MouseEvent var1) {
      if (this.ah == 1) {
         ((Class74)this.cw).e();
      }

      if (this.ah >= 2 && this.ah <= 6) {
         ((Class74)this.cw).y(this.ah - 2);
      } else if (this.ah == 10) {
         this.cw.zc().b(0);
      } else if (this.ah == 11) {
         this.cw.zc().b(6);
      } else {
         if (this.ah == 12 || this.ah == 13) {
            int var2 = this.ah == 12 ? 17 : 15;
            if (this.cw.ze().getBattleScene() != null || var1.getY() % var2 > 12) {
               return;
            }

            int var3;
            if ((var3 = var1.getY() / var2 - 1) < 0 || var3 >= 2) {
               return;
            }

            ae(var3 + (this.ah == 12 ? 0 : 2), this.cw.yx());
         }
      }
   }
}
