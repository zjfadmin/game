package com.xy.game;

import com.xy.eP;
import com.xy.ev;
import com.xy.battle.BattleControl;
import com.xy.bean.ConfirmBean;
import com.xy.readbean.Goodstable;
import com.xy.text.GameView;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class GameMouse implements MouseListener {
   int xd;
   private GameView gameView;
   int yd;

   public void mouseEntered(MouseEvent var1) {
      this.gameView.XZ = (boolean)(--1);
   }

   public void mouseClicked(MouseEvent var1) {
   }

   public void mouseExited(MouseEvent var1) {
      this.gameView.XZ = (boolean)(3 & 4);
   }

   public void mouseReleased(MouseEvent var1) {
      if (var1.getButton() == --3 && this.gameView.getBattleScene() == null) {
         MouseEvent var10001 = var1;
         int var3 = var1.getX();
         int var2 = var10001.getY();
         var3 = (this.gameView.mapCamera.j() + var3) / (20 & 127);
         var2 = (this.gameView.mapCamera.h() + var2) / (20 & 127);
         if (Math.abs(var3 - this.xd) > 5 >> 2 || Math.abs(var2 - this.yd) > 5 >> 2) {
            this.xd = var3;
            this.yd = var2;
            var3 = this.gameView.roleUnit.ar;
            if (!this.gameView.mapScene.f(this.xd, this.yd, var3)) {
               GameUtil.a(this.xd, this.yd, var3, this.gameView);
               return;
            }

            if (!this.gameView.mapScene.f(this.xd, this.yd, var3 == 0 ? --1 : 0)) {
               int var10000 = this.xd;
               int var4 = this.yd;
               int var10002;
               GameMouse var10003;
               if (var3 == 0) {
                  var10002 = 3 & 5;
                  var10003 = this;
               } else {
                  var10002 = 0;
                  var10003 = this;
               }

               GameUtil.a(var10000, var4, var10002, var10003.gameView);
               return;
            }

            GameUtil.a(this.xd, this.yd, var3, this.gameView);
         }
      }

   }

   public GameMouse(GameView var1) {
      int var10003 = 2 & 5;
      int var10005 = 2 & 5;
      super();
      this.xd = var10005;
      this.yd = var10003;
      this.gameView = var1;
   }

   public void mousePressed(MouseEvent var1) {
      if (!ev.j() && this.gameView.isDraw) {
         if (this.gameView.getBattleScene() != null) {
            BattleControl var4 = this.gameView.getBattleControl();
            if (var1.getButton() == --3) {
               if (this.gameView.getMouseIndex() != eP.l) {
                  var4.m();
               } else {
                  var4.e();
               }
            } else {
               if (var1.getButton() == (3 & 5)) {
                  var4.q(var1.getX(), var1.getY());
               }

            }
         } else {
            if (this.gameView.choseImg.o == 0) {
               if (var1.getButton() == --3) {
                  this.gameView.setMouseIndex(eP.l);
                  return;
               }

               if (var1.getButton() == --1) {
                  if (this.gameView.scene != null && this.gameView.scene.f(this.gameView.mapCamera.j() + var1.getX(), this.gameView.mapCamera.h() + var1.getY())) {
                     return;
                  }

                  this.gameView.mapScene.h(this.gameView);
                  return;
               }
            } else if (this.gameView.choseImg.o == --1) {
               Goodstable var2 = this.gameView.roleData.getGood(this.gameView.choseImg.i);
               this.gameView.choseImg.g();
               if (var2 == null) {
                  return;
               }

               if (var1.getButton() == --1) {
                  ConfirmBean var3 = new ConfirmBean(--1, var2.getRgid().toString(), "#W确定要将#G" + var2.getGoodsname() + "#W物品丢弃吗?");
                  this.gameView.aal(var3);
                  return;
               }
            } else {
               this.gameView.choseImg.g();
            }

         }
      }
   }
}
