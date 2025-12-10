package com.xy.text;

import com.xy.cY;
import com.xy.dx;
import com.xy.ev;
import com.xy.z;
import com.xy.socket.Agreement;
import java.awt.Graphics;

public class GameTXMask {
   private String sendMsg;
   private long time;
   private z tx;
   private GameView gameView;
   public boolean draw;
   private int sendType;

   public void a(String var1, int var2, String var3) {
      if (var2 != 0 || this.tx == null) {
         z var4;
         if ((var4 = dx.y(cY.m(var1))) != null) {
            int var10002 = 3 & 5;
            this.sendType = var2;
            this.sendMsg = var3;
            this.time = ev.l();
            this.tx = var4;
            this.draw = (boolean)var10002;
            this.gameView.getFormManagement().k();
         }
      }
   }

   public synchronized void b() {
      this.draw = (boolean)(3 & 4);
      this.tx = null;
      GameTXMask var10000;
      String var1;
      if (this.sendType == 5 >> 2) {
         var1 = Agreement.getSendTextAES("getfivemsg", this.sendMsg);
         var10000 = this;
         this.gameView.getClient().d(var1);
      } else {
         if (this.sendType == 5 >> 1) {
            var1 = Agreement.getSendTextAES("activity", this.sendMsg);
            this.gameView.getClient().d(var1);
         }

         var10000 = this;
      }

      var10000.sendType = 0;
      this.sendMsg = null;
      this.gameView.getFormManagement().l();
   }

   public GameTXMask(GameView var1) {
      this.gameView = var1;
   }

   public void c(Graphics var1) {
      if ((long)this.tx.k() <= ev.l() - this.time) {
         this.b();
      } else {
         this.tx.d(ev.l() - this.time, 5 >> 3);
         this.tx.aa(var1, this.gameView.screenData.Screen_x / (5 >> 1), this.gameView.screenData.Screen_y / --2);
      }
   }
}
