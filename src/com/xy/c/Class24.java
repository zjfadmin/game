package com.xy.c;

import com.xy.socket.GameClient;
import com.xy.socket.ServerAction;
import com.xy.text.GameMain;

public class Class24 implements ServerAction {
   @Override
   public void b(String var1, String var2, GameClient var3) {
      try {
         if (!var2.startsWith(GameMain.VERSION)) {
            var3.h();
            return;
         }

         if (!var2.equals(GameMain.VERSION)) {
            String var10000 = var2.substring(GameMain.VERSION.length());
            String var10001 = "H^";
            String[] var4 = var10000.split("\\|");

            int var5;
            for (int var7 = var5 = 0; var7 < var4.length; var7 = ++var5) {
               var10000 = var4[var5];
               var10001 = "\u001b";
               if (var10000.startsWith("L")) {
                  var3.gameType = Integer.parseInt(var4[var5].substring(1));
               } else {
                  var10000 = var4[var5];
                  var10001 = "k";
                  if (var10000.startsWith("I")) {
                     var3.gameTypeIndex = Integer.parseInt(var4[var5].substring(1));
                  } else {
                     var10000 = var4[var5];
                     var10001 = ">";
                     if (var10000.startsWith("i")) {
                        var3.gameTypeIndex2 = Integer.parseInt(var4[var5].substring(1));
                     } else {
                        var10000 = var4[var5];
                        var10001 = "vMa";
                        if (var10000.startsWith("TYC")) {
                           var3.gameNewTyc = true;
                        } else {
                           var10000 = var4[var5];
                           var10001 = "w\u0015m\u000e";
                           if (var10000.startsWith("BBXY")) {
                              var3.gameBBXY = true;
                           } else {
                              var10000 = var4[var5];
                              var10001 = "Vs";
                              if (var10000.startsWith("BQ")) {
                                 var3.bq = var4[var5].substring(2);
                              } else {
                                 var10000 = var4[var5];
                                 var10001 = "r\u0019";
                                 if (var10000.startsWith("GN")) {
                                    var3.gn = var4[var5].substring(2);
                                 } else {
                                    var10000 = var4[var5];
                                    var10001 = "tUnAg";
                                    if (var10000.startsWith("VALUE")) {
                                       var3.VALUE = var4[var5].substring(5);
                                    } else {
                                       var10000 = var4[var5];
                                       var10001 = "\u0004o\r";
                                       if (var10000.startsWith("SZZ")) {
                                          var3.gameSZZ = true;
                                       }
                                    }
                                 }
                              }
                           }
                        }
                     }
                  }
               }
            }

            String var10002 = "r";
            var3.drawCloud = var3.VALUE.indexOf("P") != -1;
            var3.gameMsg = var3.l(2, 8);
            var3.gameKey = var3.bq.indexOf("0") != -1;
            var10002 = "\u0004";
            var3.gameText = var3.VALUE.indexOf("S") != -1;
            var10002 = "v";
            var3.gameBattle = var3.VALUE.indexOf("T") != -1;
            var10002 = "\u0002";
            var3.gamePetSkill = var3.VALUE.indexOf("U") != -1;
            var10002 = "t";
            var3.gameBaby = var3.VALUE.indexOf("V") != -1;
            var10002 = "\u000f";
            var3.gameMount = var3.VALUE.indexOf("X") != -1;
            var10002 = "{";
            var3.gamePawn = var3.VALUE.indexOf("Y") != -1;
            var10002 = "\r";
            var3.gameBeau = var3.VALUE.indexOf("Z") != -1;
            return;
         }
      } catch (Exception var6) {
         var6.printStackTrace();
      }
   }
}
