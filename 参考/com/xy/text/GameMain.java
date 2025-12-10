package com.xy.text;

import com.xy.W;
import com.xy.hd;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.SwingUtilities;

public class GameMain {
   public static long VERSIONSIZE = 23048L;
   public static GameRunnable gameRunnable;
   public static List<GameFrame> frameList;
   public static int frameIndex = 3 >> 2;
   public static String mac = W.a() + "0000";
   public static int index = -4 >> 2;
   public static String VERSION = "version-45.8";
   public static WatchServiceRunnable watchServiceRunnable;

   public static boolean a() {
      if (frameList == null) {
         return (boolean)(3 >> 1);
      } else {
         int var0;
         for(int var10000 = var0 = 0; var10000 < frameList.size(); var10000 = var0) {
            if (((GameFrame)frameList.get(var0)).gameList.size() != 0) {
               return (boolean)(2 & 5);
            }

            ++var0;
         }

         return (boolean)(--1);
      }
   }

   public static void b(GameFrame var0) {
      frameList.remove(var0);
      if (frameList.size() == 0) {
         System.exit(3 >> 2);
      } else {
         var0.dispose();
      }
   }

   public static void main(String[] var0) throws Exception {
      System.out.println("\n###########################################\n#                                         #\n#      ## #   #    ## ### ### ##  ###     #\n#     # # #   #   # #  #  # # # #  #      #\n#     ### #   #   ###  #  # # ##   #      #\n#     # # ### ### # #  #  ### # # ###     #\n#                                         #\n# Protecting Java applications since 2006 #\n#                                         #\n#      Allatori Obfuscator v9.4 DEMO      #\n#                                         #\n#              DEMO VERSION!              #\n#                                         #\n#         NOT FOR COMMERCIAL USE!         #\n#                                         #\n#          https://allatori.com           #\n#                                         #\n###########################################\n");
      String[] var10000;
      boolean var10002;
      if (var0 == null || var0.length == 0) {
         var10000 = new String[2];
         var10002 = true;
         var10000[3 ^ 3] = "frame";
         var10000[--1] = "0";
         var0 = var10000;
      }

      System.out.println("运行成功");
      if (var0 != null && var0.length >= (1 ^ 3)) {
         if (var0[3 & 4].equals("skinRole")) {
            e(var0[--1]);
         } else {
            watchServiceRunnable = new WatchServiceRunnable();
            (new Thread(watchServiceRunnable)).start();
            if (var0[3 ^ 3].equals("frame")) {
               if (frameList == null) {
                  frameList = new ArrayList();
               }

               if (frameList.size() == 0) {
                  c();
               }

            } else {
               String[] var1;
               if ((var1 = GameView.abe(Integer.parseInt(var0[--1]))) != null) {
                  if (var0[5 >> 3].equals("version")) {
                     WatchServiceRunnable.g(var1);
                  } else {
                     if (var0[3 >> 2].equals("game")) {
                        var10000 = new String[63 & 70];
                        var10002 = true;
                        var1 = var10000;
                        int var2 = --5;
                        int var10004 = --4;
                        int var10006 = --3;
                        int var10008 = 5 >> 1;
                        int var10010 = 5 >> 2;
                        var1[3 & 4] = var0[--2];
                        var1[var10010] = var0[--1];
                        var1[var10008] = var0[--3];
                        var1[var10006] = var0[--4];
                        var1[var10004] = var0[--5];
                        var1[var2] = var0[87 & 46];
                        WatchServiceRunnable.i(var1);
                     }

                  }
               }
            }
         }
      }
   }

   public static int getGameNum() {
      int var0 = 3 >> 2;

      int var1;
      for(int var10000 = var1 = 3 ^ 3; var10000 < frameList.size(); var10000 = var1) {
         GameFrame var2 = (GameFrame)frameList.get(var1);
         ++var1;
         var0 += var2.gameList.size();
      }

      return var0;
   }

   public static synchronized GameFrame c() {
      int var0;
      int var10000;
      for(var10000 = var0 = 5 >> 3; var10000 < frameList.size(); var10000 = var0) {
         GameFrame var1;
         if ((var1 = (GameFrame)frameList.get(var0)).gameList.size() < --5) {
            return var1;
         }

         ++var0;
      }

      frameIndex += --1;
      Runnable var5 = new Runnable() {
         public void run() {
            GameFrame var1 = new GameFrame();
            GameMain.frameList.add(var1);
         }
      };
      var10000 = 2 & 5;
      SwingUtilities.invokeLater(var5);

      for(int var6 = var10000; var10000 < 10000; var10000 = var6) {
         try {
            Thread.sleep(20L);

            Iterator var3;
            for(Iterator var7 = var3 = frameList.iterator(); var7.hasNext(); var7 = var3) {
               GameFrame var2;
               if ((var2 = (GameFrame)var3.next()).frameIndex == frameIndex) {
                  return var2;
               }
            }
         } catch (Exception var4) {
            var4.printStackTrace();
         }

         ++var6;
      }

      return (GameFrame)frameList.get(3 & 4);
   }

   public static String[] getAreas(int var0) {
      String[] var1 = null;
      String[] var10000;
      boolean var10002;
      if (var0 == (20469 & 14079)) {
         var10000 = new String[--2];
         var10002 = true;
         var10000[5 >> 3] = new String("79_47.98.143.156_7772_8882_策马奔腾_1");
         var10000[2 ^ 3] = new String("-79_127.0.0.10_7772_8882_策马奔腾盾_1");
         return var10000;
      } else if (var0 == (8182 & 26367)) {
         var10000 = new String[--4];
         var10002 = true;
         var10000[2 & 5] = new String("90_8.139.7.153_7771_8881_龙魂西游_1");
         var10000[--1] = new String("-90_127.0.0.11_7771_8881_龙魂西游盾_1");
         var10000[--2] = new String("94_8.139.7.153_7773_8883_龙魂三区_1");
         var10000[--3] = new String("-94_127.0.0.11_7773_8883_龙魂三区盾_1");
         return var10000;
      } else if (var0 == (1783 & 32767)) {
         var10000 = new String[--4];
         var10002 = true;
         var10000[2 & 5] = new String("87_47.97.193.78_7771_8881_龙腾合区_1");
         var10000[2 ^ 3] = new String("-87_127.0.0.10_7771_8881_龙腾合区盾_1");
         var10000[1 ^ 3] = new String("91_47.97.193.78_7772_8882_龙腾三区_1");
         var10000[--3] = new String("-91_127.0.0.10_7772_8882_龙腾三区盾_1");
         return var10000;
      } else if (var0 == (14909 & 20471)) {
         var10000 = new String[--4];
         var10002 = true;
         var10000[3 & 4] = new String("83_47.96.190.102_7771_8881_沧海月明_1");
         var10000[--1] = new String("-83_127.0.0.10_7771_8881_沧海月明盾_1");
         var10000[--2] = new String("89_47.97.74.0_7772_8882_沧海二区_1");
         var10000[--3] = new String("-89_127.0.0.10_7772_8882_沧海二区盾_1");
         return var10000;
      } else {
         if (var0 == (12222 & 24063)) {
            var10000 = new String[4 ^ 5];
            var10002 = true;
            var10000[3 & 4] = new String("85_124.221.34.205_7771_8881_半生缘_1");
            var1 = var10000;
         }

         return var1;
      }
   }

   public static boolean d(long var0) {
      if (frameList == null) {
         return (boolean)(3 >> 2);
      } else {
         int var2;
         for(int var10000 = var2 = 0; var10000 < frameList.size(); var10000 = var2) {
            int var4;
            GameFrame var5;
            for(var10000 = var4 = (var5 = (GameFrame)frameList.get(var2)).gameList.size() - --1; var10000 >= 0; var10000 = var4) {
               GameView var3;
               if ((var3 = (GameView)var5.gameList.get(var4)).isDraw && var3.getClient().s() && var3.roleData.getRoleId() == var0) {
                  return true;
               }

               --var4;
            }

            ++var2;
         }

         return (boolean)(2 & 5);
      }
   }

   public static void e(String var0) {
      String var1 = "skin\\";
      int var5 = var0.equals("1") ? 5 >> 2 : 0;
      String var3 = var0.equals("1") ? "skinRoleGW\\" : "skinRole\\";
      int var4 = 3 ^ 3;
      File var2;
      if (!(var2 = new File(var3)).exists()) {
         var2.mkdirs();
      }

      File[] var13 = (new File(var1)).listFiles();
      System.out.println("该目录下对象个数：" + var13.length);

      int var14;
      for(int var10000 = var14 = 2 & 5; var10000 < var13.length; var10000 = var14) {
         String var6;
         if (var13[var14].isDirectory() && (var6 = var13[var14].getPath()).indexOf("火柴人") == -4 >> 2 && hd.i(var6 = var6.substring(var6.lastIndexOf("\\") + (3 & 5)))) {
            long var7;
            long var9 = (var7 = Long.parseLong(var6)) & 2147483647L;
            long var11 = var7 >> (123 & 36);
            if (var9 >= 20001L && var9 <= 20012L || var9 >= 21001L && var9 <= 21012L || var9 >= 22001L && var9 <= 22012L || var9 >= 23001L && var9 <= 23012L || var9 >= 24001L && var9 <= 24012L) {
               if (var11 >= 256L && var11 <= 1792L) {
                  if (var5 == 0) {
                     ++var4;
                     System.out.println(var7 + ":" + var9 + ":" + var11 + ":" + var13[var14].getPath());
                     var13[var14].renameTo(new File(var3 + var7));
                  }
               } else if (var11 >= 1L && var11 <= 18L) {
                  if (var5 == 0) {
                     ++var4;
                     System.out.println(var7 + ":" + var9 + ":" + var11 + ":" + var13[var14].getPath());
                     var13[var14].renameTo(new File(var3 + var7));
                  }
               } else if (var11 >= 19L && var11 <= 36L && var5 == --1) {
                  ++var4;
                  System.out.println(var7 + ":" + var9 + ":" + var11 + ":" + var13[var14].getPath());
                  var13[var14].renameTo(new File(var3 + var7));
               }
            }
         }

         ++var14;
      }

      System.out.println(var4);
   }
}
