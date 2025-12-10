package com.xy.text;

import com.xy.W;
import com.xy.dG;
import com.xy.em;
import com.xy.socket.GameClient;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardWatchEventKinds;
import java.nio.file.WatchEvent;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;
import java.nio.file.WatchEvent.Kind;
import java.util.ArrayList;
import java.util.Iterator;

public class WatchServiceRunnable implements Runnable {
   static long sendShowLoginTime;
   private WatchService watcher;
   private String historyText;
   static long sendVersionTime;
   private Path path;

   public static void e(String var0) {
      try {
         Process var1 = Runtime.getRuntime().exec(var0);
      } catch (Exception var2) {
         var2.printStackTrace();
      }
   }

   public static synchronized void f(long var0, int var2) {
      int var3 = var2;
      StringBuffer var4;
      (var4 = new StringBuffer()).append("GAME|");
      var4.append(System.currentTimeMillis());
      var4.append("|");
      var4.append(var0);
      var4.append("|");
      var4.append(var3);
      W.g("map/game", dG.a(var4.toString(), GameMain.mac));
   }

   public static synchronized void g(String[] var0) {
      if (System.currentTimeMillis() - sendVersionTime >= 1000L) {
         sendVersionTime = System.currentTimeMillis();
         StringBuffer var1;
         (var1 = new StringBuffer()).append("VERSION|");
         var1.append(System.currentTimeMillis());
         var1.append("|");
         var1.append(GameMain.VERSION);
         int var2 = 3 & 4;

         for(int var10000 = var2; var10000 < var0.length; var10000 = var2) {
            var1.append("|");
            var1.append(var0[var2++]);
         }

         W.g("map/game", dG.a(var1.toString(), GameMain.mac));
      }
   }

   public static boolean h(String var0, String var1) {
      if (var0 != null && var0.equals("")) {
         var0 = null;
      }

      if (var1 != null && var1.equals("")) {
         var1 = null;
      }

      if (var0 != null && var1 != null) {
         return var0.equals(var1);
      } else {
         return (boolean)(var0 == null && var1 == null ? --1 : 0);
      }
   }

   public static synchronized void i(String[] var0) {
      if (GameMain.frameList == null) {
         GameMain.frameList = new ArrayList();
      }

      long var1 = Long.parseLong(var0[2 & 5]);
      int var14 = Integer.parseInt(var0[5 >> 2]);
      int var4 = Integer.parseInt(var0[1 ^ 3]);
      long var5 = Long.parseLong(var0[--3]);
      String var7 = var0[--4];
      String var8 = var0[--5];
      String[] var19;
      if ((var19 = GameView.abe(var14)) != null) {
         if (GameMain.getGameNum() >= (84 & 63)) {
            f(var1, 1 ^ 3);
         } else {
            byte var9 = 0;
            String var10 = null;
            String var11 = null;
            int var12 = 3 & 4;
            int var13 = 5 >> 3;
            int var3;
            int var10000 = var3 = 2 & 5;

            while(true) {
               if (var10000 >= var19.length) {
                  var10000 = var9;
                  break;
               }

               int var15 = var19[var3].indexOf("_");
               if (var4 == Integer.parseInt(var19[var3].substring(2 & 5, var15))) {
                  String[] var20 = var19[var3].split("_");
                  var10 = var20[--4];
                  var11 = var20[--1];
                  var12 = Integer.parseInt(var20[5 >> 1]);
                  var13 = Integer.parseInt(var20[--3]);
                  int var18;
                  var10000 = var18 = 3 & 5;
                  break;
               }

               ++var3;
               var10000 = var3;
            }

            if (var10000 != 0) {
               try {
                  em.g(var4 = Math.abs(var4), var11, var13);
                  if (GameMain.frameList.size() == 0) {
                     GameMain.c();
                  }

                  (new GameClient(var1, var4, var10, var11, var12, var13, var5, var7, var8)).m();
               } catch (Exception var17) {
                  var17.printStackTrace();
                  f(var1, --1);
                  return;
               }

               f(var1, 0);

               try {
                  Thread.sleep(800L);
               } catch (Exception var16) {
                  var16.printStackTrace();
               }
            }
         }
      }
   }

   public void run() {
      try {
         while(true) {
            WatchKey var1;
            Iterator var3;
            Iterator var10000 = var3 = (var1 = this.watcher.take()).pollEvents().iterator();

            while(true) {
               while(var10000.hasNext()) {
                  WatchEvent var2;
                  if ((var2 = (WatchEvent)var3.next()).kind() == StandardWatchEventKinds.OVERFLOW) {
                     var10000 = var3;
                  } else {
                     Path var6 = (Path)var2.context();

                     try {
                        System.out.println(var6.toString());
                        this.j(var6.toString());
                     } catch (Exception var4) {
                        var10000 = var3;
                        var4.printStackTrace();
                        continue;
                     }

                     var10000 = var3;
                  }
               }

               if (var1.reset()) {
                  break;
               }

               return;
            }
         }
      } catch (Exception var5) {
         var5.printStackTrace();
      }
   }

   public void j(String var1) {
      if (var1.equals("login")) {
         var1 = W.m("map/" + var1);
         if (!h(this.historyText, var1)) {
            this.historyText = var1;
            if ((var1 = dG.b(var1, GameMain.mac)) == null) {
               GameMain.mac = W.a() + "0000";
            } else {
               int var2 = var1.indexOf("|");
               String var3 = var1.substring(3 & 4, var2);
               var2 = var1.indexOf("|", var2 + (5 >> 2));
               Long.parseLong(var1.substring(var3.length() + (4 ^ 5), var2));
               var1 = var1.substring(var2 + (5 >> 2));
               if (var3.equals("VERSION")) {
                  String[] var4;
                  if ((var4 = GameView.abe(Integer.parseInt(var1))) != null) {
                     g(var4);
                  }
               } else if (var3.equals("GAME")) {
                  i(var1.split("\\|"));
               } else {
                  if (var3.equals("EXIT") && GameMain.a()) {
                     System.exit(3 ^ 3);
                  }

               }
            }
         }
      }
   }

   public static synchronized void c() {
      if (System.currentTimeMillis() - sendShowLoginTime >= 1000L) {
         sendShowLoginTime = System.currentTimeMillis();
         StringBuffer var0;
         (var0 = new StringBuffer()).append("SHOWLOGIN|");
         var0.append(System.currentTimeMillis());
         var0.append("|");
         var0.append(GameMain.VERSION);
         W.g("map/game", dG.a(var0.toString(), GameMain.mac));
         e(System.getProperty("user.dir") + "\\startLogin.bat");
      }
   }

   public WatchServiceRunnable() throws IOException {
      String[] var10002 = new String[3 ^ 3];
      boolean var10004 = true;
      this.path = Paths.get("map/", var10002);
      this.watcher = FileSystems.getDefault().newWatchService();
      Path var10000 = this.path;
      WatchService var10001 = this.watcher;
      Kind[] var1 = new Kind[3 >> 1];
      var10004 = true;
      var1[2 & 5] = StandardWatchEventKinds.ENTRY_MODIFY;
      var10000.register(var10001, var1);
   }
}
