package com.xy;

import com.xy.text.GameFrame;
import com.xy.text.GameMain;
import com.xy.text.GameView;

public class Class215 {
   public static long a(long var0) {
      int var2 = (var0 += 1341L) < 0L ? 4 ^ 5 : 0;
      if (var2 != 0) {
         var0 = -var0;
      }

      int var3 = 0;

      long var4;
      for(long var10000 = var4 = var0; var10000 >= 10L; var10000 = var4 /= 10L) {
         ++var3;
      }

      var4 = 2L;
      int var6 = var3 != 0 ? --5 % var3 : 0;
      long var7 = (var0 + 4L) % 10L;

      for(int var9 = var3 = var3; var9 >= 0; var9 = var3) {
         var4 = (var4 *= 10L) + var0 % 10L;
         if (var6 == var3) {
            var4 = (var4 *= 10L) + var7;
         }

         --var3;
         var0 /= 10L;
      }

      if (var2 != 0) {
         return -var4;
      } else {
         return var4;
      }
   }

   public static long b(long var0) {
      if (var0 == 0L) {
         return 0L;
      } else {
         int var4 = var0 < 0L ? --1 : 0;
         if (var4 != 0) {
            var0 = -var0;
         }

         int var3 = 0;
         int var2 = 2 & 5;

         long var10000;
         long var5;
         for(var10000 = var5 = var0; var10000 >= 10L; var10000 = var5 /= 10L) {
            ++var3;
         }

         var5 = 1L;

         int var7;
         int var12;
         for(var12 = var7 = 2 & 5; var12 < var3; var12 = var7) {
            ++var7;
            var5 *= 10L;
         }

         var12 = (int)(var0 / var5);
         var3 -= 2;
         var2 = var12;
         long var11 = 0L;
         int var6;
         int var9;
         int var10;
         if (var2 >> (5 >> 1) == 0) {
            var2 += 3;
            if (var2 == --3) {
               var2 = 4 ^ 5;
               var12 = var3;
            } else {
               if (var2 == (43 & 94)) {
                  var2 = --5;
               }

               var12 = var3;
            }

            if (var12 != 0) {
               var2 %= var3;
            } else {
               var2 = 0;
            }

            ++var3;
            var10 = 3 ^ 3;
            var6 = 5 >> 3;

            for(var12 = var9 = 2 & 5; var12 <= var3; var12 = var9) {
               label126: {
                  if (var2 == var9) {
                     var10 = (int)(var0 % 10L);
                     var10 -= 4;
                     if (var10 < 0) {
                        var10000 = var0;
                        var10 += 10;
                        break label126;
                     }
                  } else {
                     if (var9 == var3) {
                        var6 = (int)(var0 % 10L);
                     }

                     var11 = (var11 *= 10L) + var0 % 10L;
                  }

                  var10000 = var0;
               }

               ++var9;
               var0 = var10000 / 10L;
            }

            if (var10 != var6) {
               c();
               return 0L;
            }
         } else if (var2 >> (5 >> 1) == --1) {
            var2 += 3;
            if (var2 == --3) {
               var2 = 4 ^ 5;
               var12 = var3;
            } else {
               if (var2 == (47 & 90)) {
                  var2 = --5;
               }

               var12 = var3;
            }

            if (var12 != 0) {
               var2 %= var3;
            } else {
               var2 = 0;
            }

            ++var3;
            var10 = 3 >> 2;
            var6 = 3 ^ 3;

            for(var12 = var9 = 3 & 4; var12 <= var3; var12 = var9) {
               label142: {
                  if (var2 == var9) {
                     var10 = (int)(var0 % 10L);
                     var10 -= 2;
                     if (var10 < 0) {
                        var10000 = var0;
                        var10 += 10;
                        break label142;
                     }
                  } else {
                     label139: {
                        if (var3 >= --2) {
                           if (var9 == var3 - (3 & 5)) {
                              var6 = (int)(var0 % 10L);
                              var10000 = var11;
                              break label139;
                           }
                        } else if (var9 == var3) {
                           var6 = (int)(var0 % 10L);
                        }

                        var10000 = var11;
                     }

                     var11 = var10000 * 10L + var0 % 10L;
                  }

                  var10000 = var0;
               }

               ++var9;
               var0 = var10000 / 10L;
            }

            if (var10 != var6) {
               c();
               return 0L;
            }
         } else if (var2 >> (1 ^ 3) == (1 ^ 3)) {
            var2 += 3;
            if (var2 == --3) {
               var2 = 2 ^ 3;
               var12 = var3;
            } else {
               if (var2 == (127 & 10)) {
                  var2 = --5;
               }

               var12 = var3;
            }

            if (var12 != 0) {
               var2 %= var3;
            } else {
               var2 = 0;
            }

            ++var3;
            var10 = 3 & 4;
            var6 = 5 >> 3;

            for(var12 = var9 = 3 >> 2; var12 <= var3; var12 = var9) {
               label153: {
                  if (var2 == var9) {
                     var10 = (int)(var0 % 10L);
                     --var10;
                     if (var10 < 0) {
                        var10000 = var0;
                        var10 += 10;
                        break label153;
                     }
                  } else {
                     if (var9 == var3) {
                        var6 = (int)(var0 % 10L);
                     }

                     var11 = (var11 *= 10L) + var0 % 10L;
                  }

                  var10000 = var0;
               }

               ++var9;
               var0 = var10000 / 10L;
            }

            if (var10 != var6) {
               c();
               return 0L;
            }
         }

         if (var4 != 0) {
            var11 = -var11;
         }

         return var11 -= 1341L;
      }
   }

   public static void c() {
      (new Thread(new Runnable() {
         public void run() {
            int var1;
            try {
               for(int var10000 = var1 = 0; var10000 < GameMain.frameList.size(); var10000 = var1) {
                  GameFrame var2 = (GameFrame)GameMain.frameList.get(var1);

                  int var3;
                  for(var10000 = var3 = 5 >> 3; var10000 < var2.gameList.size(); var10000 = var3) {
                     GameView var6 = (GameView)var2.gameList.get(var3);
                     ++var3;
                     var6.f("系统检测到有非法进程,3秒后退出游戏");
                  }

                  ++var1;
               }
            } catch (Exception var5) {
            }

            try {
               Thread.sleep(3000L);
               System.exit(2 & 5);
            } catch (Exception var4) {
            }
         }
      })).start();
   }
}
