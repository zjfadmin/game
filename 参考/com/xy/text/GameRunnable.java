package com.xy.text;

import com.xy.dx;
import com.xy.em;
import com.xy.ev;
import com.xy.fj;
import com.xy.ho;
import com.xy.le;
import com.xy.battle.BattleScene;
import com.xy.richtext.ChatBox;
import com.xy.socket.Agreement;
import java.util.Iterator;
import java.util.LinkedList;

public class GameRunnable implements Runnable {
   long now2 = 0L;
   static long fpsTime;
   static final int DEFAULT_CHA = 1000000;
   static final int HANDLE_TIME = 500;
   public static int FZ = 60000;
   private int handleIndex;
   public boolean counter;
   public long total = 0L;
   private String timeString;
   static final int HANDLE_TIME_MAX = 5000;
   long now = System.nanoTime();
   public long time;
   public int counterIndex;
   static int DEFAULT_FPS = 63 & 124;
   public long counterTime;
   public long interval;

   public void a(GameFrame var1) {
      GameView var3;
      int var4;
      int var10000;
      for(var10000 = var4 = var1.gameList.size() - (2 ^ 3); var10000 >= 0; var10000 = var4) {
         if ((var3 = (GameView)var1.gameList.get(var4)).isDraw) {
            GameView var9;
            label81: {
               var3.mapScene.g(this.total);
               var3.mapCamera.r(var3.roleUnit.ab, var3.roleUnit.al);
               var3.roleUnit.v(var3, var3.automation.script, this.counter);
               if (this.timeString != null) {
                  var3.getBaseView().la(this.timeString);
                  if (var3.mapScene.b() == 1207L) {
                     int var2 = ev.d ? -var3.mapScene.ad().getMapModel() : var3.mapScene.ad().getMapModel();
                     fj var5 = var3.mapScene.r;
                     if (var2 != var5.r) {
                        label76: {
                           try {
                              var3.mapScene.r = ho.o(var2);
                              ho.j(var5);
                           } catch (Exception var6) {
                              var6.printStackTrace();
                              break label76;
                           }

                           var9 = var3;
                           break label81;
                        }
                     }
                  }
               }

               var9 = var3;
            }

            if (var9.roleData.goodChoses[31 & 110] != null && var3.roleUnit.be() == --1 && (var3.rlTime = (int)((long)var3.rlTime + this.total)) > FZ) {
               var3.rlTime -= FZ;
               String var7 = Agreement.getSendTextAES("rolechange", "FU" + var3.roleData.goodChoses[111 & 30]);
               var3.getClient().d(var7);
            }

            if (this.counter) {
               var3.d();
               var3.automation.i();
               le var8;
               if ((var8 = (le)var3.getFormManagement().m(123 & 125)) != null) {
                  var8.d();
               }
            }
         }

         --var4;
      }

      GameRunnable var10;
      if (var1.gamePanel.repaintIndex >= var1.gamePanel.repaintCount) {
         var1.gamePanel.repaintIndex = var1.gamePanel.repaintCount + 1L;
         var10 = this;
         var1.gamePanel.repaint();
      } else {
         var1.gamePanel.repaintIndex = var1.gamePanel.repaintCount;
         var10 = this;
      }

      if (var10.counter) {
         if (var1.isAlwaysOnTop()) {
            int var10002 = var1.alwaysOnTopIndex;
            var1.alwaysOnTopIndex = var10002 + (3 >> 1);
            if (var10002 > 3 >> 1) {
               var1.setAlwaysOnTop((boolean)(5 >> 3));
            }
         }

         if (this.counterIndex % (124 & 63) == 0) {
            for(var10000 = var4 = var1.gameList.size() - --1; var10000 >= 0; var10000 = var4) {
               if ((var3 = (GameView)var1.gameList.get(var4)).isDraw) {
                  var3.roleData.ay();
                  var3.roleData.getTaskSystem().i();
                  if (this.handleIndex % --2 == 0) {
                     var3.roleData.bq();
                     var3.roleData.getPkSys().d();
                     var3.mapScene.y(var3);
                  }
               }

               --var4;
            }

         }
      }
   }

   public void setFPS(int var1) {
      if (var1 != DEFAULT_FPS) {
         DEFAULT_FPS = var1;
         fpsTime = (long)(Double.valueOf(1000.0D) / Double.valueOf((double)DEFAULT_FPS) * 1000000.0D);
      }
   }

   static {
      fpsTime = (long)(Double.valueOf(1000.0D) / Double.valueOf((double)DEFAULT_FPS) * 1000000.0D);
   }

   public void b() {
      try {
         this.total = fpsTime - System.nanoTime() + this.now;
         Thread.sleep(this.total > 0L ? this.total / 1000000L : 1L);
         this.now2 = System.nanoTime();
         this.interval += this.now2 - this.now;
         this.total = this.interval / 1000000L;
         this.interval %= 1000000L;
         this.now = this.now2;
         this.counterTime += this.total;
         if (this.counterTime <= 500L) {
            this.counter = (boolean)(2 & 5);
            return;
         }

         GameRunnable var10000;
         if (this.counterTime > 5000L) {
            this.counterTime = 0L;
            var10000 = this;
         } else {
            this.counterTime -= 500L;
            var10000 = this;
         }

         var10000.counterIndex += 5 >> 2;
         this.counter = (boolean)(2 ^ 3);
         if (this.counterIndex % (63 & 124) == 0) {
            this.handleIndex += --1;
            return;
         }
      } catch (Exception var2) {
         var2.printStackTrace();
      }

   }

   public void c() {
      if (this.counterIndex % (124 & 63) == 0) {
         if (this.handleIndex % (5 >> 1) == 0) {
            ho.e();
         }

         if (this.handleIndex % (111 & 22) == 0) {
            dx.u();
            ho.b();
            ChatBox.ResetAndRemove();
         }

         if (this.handleIndex % (94 & 43) == 0) {
            System.gc();
         }

      }
   }

   public void d(long var1) {
      LinkedList var5;
      if ((var5 = em.h()).size() != 0) {
         Iterator var10000;
         if (this.counter) {
            synchronized(var5) {
               int var8 = 0;

               Iterator var6;
               for(var10000 = var6 = var5.iterator(); var10000.hasNext(); var10000 = var6) {
                  BattleScene var9 = (BattleScene)var6.next();
                  var9.ad(var1);
                  if (var9.n()) {
                     var8 = 4 ^ 5;
                     var6.remove();
                  }
               }

               if (var8 != 0) {
                  dx.u();
               }

            }
         } else {
            Iterator var3;
            var10000 = var3 = var5.iterator();

            while(var10000.hasNext()) {
               BattleScene var4 = (BattleScene)var3.next();
               var10000 = var3;
               var4.ad(var1);
            }

         }
      }
   }

   public void run() {
      // $FF: Couldn't be decompiled
   }
}
