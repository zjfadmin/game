package com.xy;

import com.xy.socket.GameClient;
import com.xy.socket.ServerAction;
import com.xy.text.GameMain;

public class Class528 implements ServerAction {
   public void a(String var1, String var2, GameClient var3) {
      try {
         if (!var2.startsWith(GameMain.VERSION)) {
            var3.c();
            return;
         }

         if (!var2.equals(GameMain.VERSION)) {
            String[] var5 = var2.substring(GameMain.VERSION.length()).split("\\|");

            int var6;
            for(int var10000 = var6 = 3 >> 2; var10000 < var5.length; var10000 = var6) {
               if (!var5[var6].startsWith("L") && !var5[var6].startsWith("I") && !var5[var6].startsWith("i") && !var5[var6].startsWith("A")) {
                  if (var5[var6].startsWith("VN")) {
                     var3.setGameType(var5[var6].substring(5 >> 1));
                  } else if (var5[var6].startsWith("TYC")) {
                     var3.gameNewTyc = (boolean)(3 & 5);
                  } else if (var5[var6].startsWith("BBXY")) {
                     var3.gameBBXY = (boolean)(5 >> 2);
                  } else if (var5[var6].startsWith("BQ")) {
                     var3.bq = var5[var6].substring(5 >> 1);
                     var3.j(var3.bq);
                  } else if (var5[var6].startsWith("GN")) {
                     var3.gn = var5[var6].substring(--2);
                  } else if (var5[var6].startsWith("VALUE")) {
                     var3.VALUE = var5[var6].substring(--5);
                  } else if (var5[var6].startsWith("SZZ")) {
                     var3.gameSZZ = (boolean)(3 & 5);
                  } else if (var5[var6].startsWith("server.game.")) {
                     var3.gameUX = var5[var6].substring(127 & 12);
                  }
               } else {
                  int var10001 = 4 ^ 5;
                  int var10003 = 4 ^ 5;
                  var3.gameTypeIndex = var3.gameType = 4 ^ 5;
                  var3.gameTypeIndex2 = var10003;
                  var3.gameTypeIndex3 = var10001;
               }

               ++var6;
            }

            var3.drawCloud = (boolean)(var3.VALUE.indexOf("P") != -4 >> 2 ? --1 : 0);
            var3.gameMsg = var3.n(5 >> 1, 123 & 12);
            var3.gameKey = (boolean)(var3.bq.indexOf("0") != -4 >> 2 ? 4 ^ 5 : 0);
            var3.gameText = (boolean)(var3.VALUE.indexOf("S") != -4 >> 2 ? 3 & 5 : 0);
            var3.gameBattle = (boolean)(var3.VALUE.indexOf("T") != -4 >> 2 ? --1 : 0);
            var3.gamePetSkill = (boolean)(var3.VALUE.indexOf("U") != -4 >> 2 ? --1 : 0);
            var3.gameBaby = (boolean)(var3.VALUE.indexOf("V") != -4 >> 2 ? 3 & 5 : 0);
            var3.gameMount = (boolean)(var3.VALUE.indexOf("X") != -4 >> 2 ? 4 ^ 5 : 0);
            var3.gamePawn = (boolean)(var3.VALUE.indexOf("Y") != -4 >> 2 ? 3 >> 1 : 0);
            var3.gameBeau = (boolean)(var3.VALUE.indexOf("Z") != -4 >> 2 ? 3 >> 1 : 0);
            var3.gamePetManual = (boolean)(var3.VALUE.indexOf("a") != -4 >> 2 ? 5 >> 2 : 0);
            var3.gameXuanBao = (boolean)(var3.VALUE.indexOf("b") != -4 >> 2 ? 5 >> 2 : 0);
            return;
         }
      } catch (Exception var4) {
         var4.printStackTrace();
      }

   }
}
