package com.xy;

import com.xy.bean.ChatBean;
import com.xy.richtext.InputBean;
import com.xy.richtext.RichBeau;
import com.xy.socket.GameClient;
import com.xy.socket.ServerAction;
import com.xy.text.GameMain;
import com.xy.text.GameView;

public class Class310 implements ServerAction {
   public void a(String var1, String var2, GameClient var3) {
      GameView var9 = var3.gameView;
      if (var1.equals("prompt")) {
         var9.f(var2);
      } else {
         if (var1.equals("chat")) {
            InputBean var4;
            ChatBean var5;
            StringBuffer var8;
            if ((var5 = (ChatBean)Class695.b().fromJson(var2, ChatBean.class)).getId() != 0 && var5.getId() != (2 ^ 3)) {
               if (var5.getId() == (26 & 109) || var5.getId() == (31 & 105)) {
                  var9.abj("#T" + var5.getMessage(), var5.getId(), var5.getSkin());
                  return;
               }

               if (var5.getId() == (42 & 95)) {
                  (var8 = new StringBuffer()).append("#X");
                  var4 = new InputBean();
                  var4.setType(111 & 31);
                  var4.setId(var5.getRoleId());
                  var4.setName("[摊位:" + var5.getRole() + "]");
                  var4.setColor("G");
                  var8.append("#V");
                  var8.append(Class695.b().toJson(var4));
                  var8.append("#L#W");
                  var8.append(var5.getMessage());
                  var9.chatBox.addChat(47 & 91, var8.toString());
                  return;
               }
            } else if (var9.getBattleScene() != null) {
               Class514 var6;
               if ((var6 = var9.getBattleScene().getBattleUnit(2 & 5, var5.getRoleId().longValue())) != null) {
                  if ((long)var6.bt().getId() == var9.roleData.getRoleId()) {
                     var6.as(var5.getMessage());
                  } else if (!GameMain.d((long)var6.bt().getId())) {
                     var6.bk(var5.getMessage());
                  }
               }
            } else {
               Class183 var7;
               if ((var7 = var9.mapScene.a(var5.getRole())) != null) {
                  var7.as(var5.getMessage());
               }
            }

            var8 = new StringBuffer();
            if (var5.getId() == --4) {
               if (var5.getRoleId() != null) {
                  var4 = new InputBean();
                  var4.setType(--1);
                  var4.setId(var5.getRoleId());
                  var4.setName("[" + var5.getRole() + "]");
                  var4.setColor("cFFFF00");
                  var4.setRichBeau(var5.getBeauBean() != null ? new RichBeau(var5.getBeauBean().toString()) : null);
                  var8.append("#V");
                  var8.append(Class695.b().toJson(var4));
                  var8.append("#L#W");
               }

               var8.append(var5.getMessage());
               var9.fx(var8.toString());
               return;
            }

            if (var5.getId() == (119 & 15)) {
               var9.abj("#T" + var5.getMessage(), 127 & 8, (String)null);
            }

            ChatBean var10000;
            if (var5.getId() == 0) {
               var10000 = var5;
               var8.append("#Q");
            } else if (var5.getId() == 3 >> 1) {
               var10000 = var5;
               var8.append("#D");
            } else if (var5.getId() == --2) {
               var10000 = var5;
               var8.append("#P");
            } else if (var5.getId() == --3) {
               var10000 = var5;
               var8.append("#J");
            } else if (var5.getId() != --5 && var5.getId() != (95 & 39)) {
               if (var5.getId() == (6 & 127)) {
                  var8.append("#X");
               }

               var10000 = var5;
            } else {
               var8.append("#T");
               var10000 = var5;
            }

            GameView var10;
            if (var10000.getId() != --5 && var5.getId() != (103 & 30) && var5.getId() != (47 & 87)) {
               StringBuffer var11;
               if (var5.getRoleId() != null) {
                  var4 = new InputBean();
                  var4.setType(--1);
                  var4.setId(var5.getRoleId());
                  var4.setName("[" + var5.getRole() + "]");
                  var4.setColor("G");
                  var4.setRichBeau(var5.getBeauBean() != null ? new RichBeau(var5.getBeauBean().toString()) : null);
                  var8.append("#V");
                  var8.append(Class695.b().toJson(var4));
                  var11 = var8;
                  var8.append("#L");
               } else {
                  if (var5.getRole() != null) {
                     var8.append("[" + var5.getRole() + "]");
                  }

                  var11 = var8;
               }

               var11.append(var5.getMessage());
               var10 = var9;
            } else {
               var8.append("#Y");
               var8.append(var5.getMessage());
               var10 = var9;
            }

            var10.chatBox.addChat(var5.getId(), var8.toString());
         }

      }
   }
}
