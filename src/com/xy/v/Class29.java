package com.xy.v;

import com.xy.text.GameFrame;
import com.xy.text.GameMain;
import com.xy.text.GameView;

class Class29 implements Runnable {
   @Override
   public void run() {
      int var1;
      try {
         for (int var10000 = var1 = 0; var10000 < GameMain.frameList.size(); var10000 = ++var1) {
            GameFrame var2 = GameMain.frameList.get(var1);

            int var3;
            for (int var6 = var3 = 0; var6 < var2.gameList.size(); var6 = var3) {
               GameView var7 = var2.gameList.get(var3);
               var3++;
               String var10001 = "粇绹梼浭剌术霢泳辧稭P\u0015禮吨遼凜湄戩";
               var7._do("系统检测到有非法进程,3秒后退出游戏");
            }
         }
      } catch (Exception var5) {
      }

      try {
         Thread.sleep(3000L);
         System.exit(0);
      } catch (Exception var4) {
      }
   }
}
