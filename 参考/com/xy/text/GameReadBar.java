package com.xy.text;

import com.xy.dI;
import com.xy.ev;
import com.xy.hd;
import com.xy.ho;
import com.xy.lz;
import com.xy.game.Task;
import com.xy.readbean.Goodstable;
import com.xy.readbean.TaskData;
import com.xy.scene.CountDown;
import com.xy.socket.Agreement;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ImageObserver;
import java.math.BigDecimal;
import java.util.List;

public class GameReadBar {
   private Image readBarImg;
   private int readBarId;
   public int readBarType;
   private long readBarTimeStart;
   private GameView gameView;
   private Object readBarData;
   public CountDown countDown;
   private Image readBarBack;
   private int readBarSize;
   public String readBar;
   private double readBarTime;

   public boolean setCountDown(Task var1) {
      if (var1 == null) {
         return (boolean)(3 ^ 3);
      } else {
         TaskData var2;
         if ((var2 = var1.getTaskData()) == null) {
            return (boolean)(2 & 5);
         } else if (var2.getTime() == 0) {
            return (boolean)(2 & 5);
         } else {
            String var3;
            if ((var3 = var2.getUnknowType("倒计时")) == null) {
               return (boolean)(5 >> 3);
            } else if (this.gameView.mapScene.b() != (long)Integer.parseInt(var3)) {
               return (boolean)(2 & 5);
            } else if (this.countDown != null && this.countDown.getId() == var2.getTaskID()) {
               return (boolean)(--1);
            } else {
               this.countDown = new CountDown(var2.getTaskID(), var2.getTaskName(), var1.getTime() + (long)(var2.getTime() * (60 & 127) * (13307 & 20460)));
               return (boolean)(5 >> 2);
            }
         }
      }
   }

   public GameReadBar(GameView var1) {
      int var10003 = 28495 & 14271;
      super();
      this.readBarSize = var10003;
      this.gameView = var1;
   }

   public void a(Graphics var1) {
      long var2;
      double var4 = (double)(var2 = ev.l() - this.readBarTimeStart) >= this.readBarTime ? 1.0D : (double)var2 / this.readBarTime;
      if (this.readBarBack == null) {
         this.readBarBack = ho.a("sc/c/72");
      }

      if (this.readBarImg == null) {
         this.readBarImg = ho.a("sc/c/73");
      }

      int var6 = (this.gameView.screenData.Screen_x - (99 & 126)) / (1 ^ 3);
      int var3 = (int)((double)this.gameView.screenData.Screen_y * 0.75D);
      var1.drawImage(this.readBarBack, var6, var3, (ImageObserver)null);
      var1.drawImage(this.readBarImg, var6 + --3, var3 + --3, (int)(92.0D * var4), --3, (ImageObserver)null);
      var1.setColor(Color.white);
      var1.setFont(lz.bm);
      if (this.readBarSize == (10111 & 32655)) {
         this.readBarSize = ((118 & 107) - var1.getFontMetrics().stringWidth(this.readBar)) / --2;
      }

      var1.drawString(this.readBar, var6 + this.readBarSize, var3 - --4);
   }

   public void setReadBar(int var1, int var2, String var3, double var4, long var6, Object var8) {
      int var9 = this.readBarType != --2 && var2 != 5 >> 1 ? 3 >> 2 : 1;
      int var10002 = 30607 & 12159;
      this.readBarId = var1;
      this.readBarType = var2;
      this.readBar = var3;
      this.readBarTime = var4;
      this.readBarTimeStart = var6;
      this.readBarData = var8;
      this.readBarSize = var10002;
      if (var9 != 0) {
         dI var11;
         if ((var11 = (dI)this.gameView.getFormManagement().m(10997 & 21903)) != null) {
            var11.oc().r((boolean)(this.readBarType == --2 ? 4 ^ 5 : 0));
         }

         if (this.readBarType == 0) {
            String var10 = Agreement.getSendTextAES("clickmonsters", "FZC" + var1);
            this.gameView.getClient().d(var10);
         }
      }

   }

   public void setCountDown() {
      if (this.gameView.isDraw) {
         List var1 = this.gameView.roleData.getTaskSystem().getTaskList();

         int var2;
         for(int var10000 = var2 = 3 ^ 3; var10000 < var1.size(); var10000 = var2) {
            if (this.setCountDown((Task)var1.get(var2))) {
               return;
            }

            ++var2;
         }

         this.b((TaskData)null);
      }
   }

   public void b(TaskData var1) {
      if (this.countDown != null) {
         if (var1 == null || var1.getTaskID() == this.countDown.getId()) {
            this.countDown = null;
         }
      }
   }

   public void c() {
      long var1;
      double var3 = (double)(var1 = ev.l() - this.readBarTimeStart) >= this.readBarTime ? 1.0D : (double)var1 / this.readBarTime;
      if (var3 >= 1.0D) {
         GameReadBar var10000;
         String var5;
         if (this.readBarType == --1) {
            var5 = Agreement.getSendTextAES("clickmonsters", "R" + this.readBarId);
            var10000 = this;
            this.gameView.getClient().d(var5);
         } else if (this.readBarType == (1 ^ 3)) {
            var5 = Agreement.getSendTextAES("clickmonsters", "FZB" + this.readBarId);
            var10000 = this;
            this.gameView.getClient().d(var5);
         } else {
            if (this.readBarType == --3) {
               Goodstable var6;
               if (this.readBarData instanceof BigDecimal && (var6 = this.gameView.roleData.getGood((BigDecimal)this.readBarData)) != null && var6.getType() == 118L) {
                  int var10005;
                  if (this.gameView.roleData.getGoodPackSum(-1L, new BigDecimal(-4 >> 2), 2 ^ 3) == 0) {
                     var10005 = 3 >> 2;
                     this.gameView.fw("你的背包已满");
                     this.setReadBar(var10005, -4 >> 2, (String)null, 0.0D, 0L, (Object)null);
                     this.readBarBack = null;
                     this.readBarImg = null;
                     return;
                  }

                  int var2;
                  if ((var2 = Math.max(1, hd.an(var6.getValue(), "需要数量=", "|"))) > var6.getUsetime()) {
                     var10005 = 2 & 5;
                     this.gameView.fw("你需要凑够" + var2 + "个相同物品才能开启");
                     this.setReadBar(var10005, -4 >> 2, (String)null, 0.0D, 0L, (Object)null);
                     this.readBarBack = null;
                     this.readBarImg = null;
                     return;
                  }

                  var6.ab(var2);
                  if (var6.getUsetime() <= 0) {
                     this.gameView.roleData.h(var6.getRgid());
                  }

                  String var8 = Agreement.getSendTextAES("user", var6.getRgid().toString());
                  this.gameView.getClient().d(var8);
                  this.readBarId -= 3 >> 1;
                  if (this.readBarId > 0 && var6.getUsetime() > 0) {
                     this.setReadBar(this.readBarId, --3, "(" + this.readBarId + ")开启" + var6.getGoodsname(), Math.max(300.0D, this.readBarTime), ev.l(), var6.getRgid());
                     return;
                  }
               }
            } else if (this.readBarType == --5) {
               var5 = (String)this.readBarData;
               String var7 = Agreement.getSendTextAES("taskN", var5);
               this.gameView.getClient().d(var7);
            }

            var10000 = this;
         }

         var10000.setReadBar(0, -4 >> 2, (String)null, 0.0D, 0L, (Object)null);
         this.readBarBack = null;
         this.readBarImg = null;
      }

   }
}
