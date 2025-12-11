package com.xy.a;

import com.xy.battle.BattleControl;
import com.xy.battle.BattleMan;
import com.xy.game.HandleGood;
import com.xy.game.RoleData;
import com.xy.readbean.Goodstable;
import com.xy.readbean.Skill;
import com.xy.text.GameView;
import com.xy.text.ScreenData;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.math.BigDecimal;

public class Class61 extends com.xy.q.Class30 {
   private int ds = -1;
   private Class104[] aaw;
   private static Image bp = com.xy.w.Class16.c("sc/c/45");

   @Override
   public void t() {
      ScreenData var10001 = this.afx.screenData;
      int var2 = this.afx.screenData.getScreen_x() - 322;
      int var3 = var10001.getScreen_y() - 83;
      this.setBounds(var2, var3, 323, 43);
   }

   // $VF: synthetic method
   private void an(Graphics var1, RoleData var2) {
      int var10000 = 0;
      var1.setColor(Color.white);
      var1.setFont(com.xy.q.Class49.e);

      for (int var3 = 0; var10000 < this.aaw.length; var10000 = var3) {
         Class104 var4 = this.aaw[var3];
         var1.drawImage(bp, var4.getX(), 0, 43, 43, null);
         long var5 = var2.getShortCutSkill(Class104.afk(var4));
         Graphics var9;
         if (var5 == 0L) {
            var9 = var1;
            var4.t();
         } else {
            Graphics var10;
            label39: {
               if (Class104.afg(var4) == null || Class104.afg(var4) != var5) {
                  if (var5 > 2147483647L) {
                     Goodstable var7;
                     if ((var7 = var2.getGood(new BigDecimal(var5 - 2147483647L))) != null) {
                        var10 = var1;
                        var4.afi(var5, var7);
                        break label39;
                     }
                  } else {
                     Skill var8;
                     if ((var8 = var2.getShortCutSkillById(var5)) != null) {
                        var4.afj(var5, var8);
                     }
                  }
               }

               var10 = var1;
            }

            var10.drawImage(Class104.afl(var4), var4.getX() + 4, 4, 36, 36, null);
            var9 = var1;
         }

         String var10001 = Class104.afh(var4);
         int var10002 = var4.getX();
         var3++;
         var9.drawString(var10001, var10002 + 6, 13);
      }
   }

   @Override
   protected void paintComponent(Graphics var1) {
      super.paintComponent(var1);
      RoleData var2;
      if ((var2 = this.yx()) != null && this.afx.isDraw) {
         this.an(var1, var2);
      }
   }

   // $VF: synthetic method
   static void vg(Class61 var0, int var1) {
      var0.ds = var1;
   }

   static {
      String var10000 = "eO9O9\u0018#";
   }

   public Class61(int var1, GameView var2) {
      super(-1, -1, com.xy.q.Class30.agf, var2);
      this.yy(0, 0, 0, 0, com.xy.q.Class30.agf);
      this.aaw = new Class104[8];

      int var3;
      for (int var10000 = var3 = 0; var10000 < this.aaw.length; var10000 = var3) {
         this.aaw[var3] = new Class104(this, var3);
         this.aaw[var3].setBounds(var3 * 40, 0, 43, 43);
         this.add(this.aaw[var3++]);
      }
   }

   public void g(int var1) {
      this.vh(this.aaw[var1]);
   }

   @Override
   public void setVisible(boolean var1) {
      if (var1) {
         this.t();
      }

      super.setVisible(var1);
   }

   public void vh(Class104 var1) {
      if (this.afx.getBattleScene() == null) {
         RoleData var8;
         long var9;
         if ((var9 = (var8 = this.yx()).getShortCutSkill(Class104.afk(var1))) > 2147483647L) {
            Goodstable var5;
            if ((var5 = var8.getGood(new BigDecimal(var9 - 2147483647L))) != null) {
               try {
                  HandleGood.e(var5, false, var8);
               } catch (Exception var7) {
                  var7.printStackTrace();
               }
            }
         }
      } else {
         com.xy.d.Class11 var2;
         if ((var2 = this.afx.getBattleControl().getHandleUnit()) != null) {
            RoleData var3;
            long var4;
            if ((var4 = (var3 = this.yx()).getShortCutSkill(Class104.afk(var1))) > 2147483647L) {
               Goodstable var10;
               if ((var10 = var3.getGood(new BigDecimal(var4 - 2147483647L))) != null) {
                  BattleMan var10000 = var2.cg();
                  String var11 = "透忷";
                  if (!var10000.d("遗忘")) {
                     this.afx.getBattleControl().setMouseIndex(com.xy.v.Class3.e, var10);
                     this.afx.getBattleControl().d();
                  } else {
                     var11 = "彿剛犚怗旌泃体甾荃哗";
                     this.afx.dp("当前状态无法使用药品");
                  }
               }
            } else if (var2.cg().getType() == 0) {
               Skill var6;
               if ((var6 = var3.getShortCutSkillById(var4)) != null) {
                  BattleControl var10001 = this.afx.getBattleControl();
                  var10001.setMouseIndex(com.xy.v.Class3.n, var6);
                  var10001.d();
                  this.afx.getFormManagement().f(34);
               }
            }
         }
      }
   }
}
