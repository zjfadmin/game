package com.xy.c;

import com.xy.bean.ChatBean;
import com.xy.richtext.InputBean;
import com.xy.richtext.RichBeau;
import com.xy.socket.GameClient;
import com.xy.socket.ServerAction;
import com.xy.text.GameMain;
import com.xy.text.GameView;

public class Class12 implements ServerAction {
   @Override
   public void b(String var1, String var2, GameClient var3) {
      GameView var4 = var3.gameView;
      if (var1.equals("prompt")) {
         var4._do(var2);
      } else {
         if (var1.equals("chat")) {
            ChatBean var5;
            if ((var5 = com.xy.v.Class31.a().fromJson(var2, ChatBean.class)).getId() != 0 && var5.getId() != 1) {
               if (var5.getId() == 8 || var5.getId() == 9) {
                  String var28 = "C\u0001";
                  var4.di("#T" + var5.getMessage(), var5.getId(), var5.getSkin());
                  return;
               }

               if (var5.getId() == 10) {
                  StringBuffer var10;
                  StringBuffer var15 = var10 = new StringBuffer();
                  String var20 = "\u0019,";
                  var15.append("#X");
                  InputBean var12 = new InputBean();
                  String var24 = "C\u0003";
                  String var29 = "3";
                  var12.setType(15);
                  var12.setId(var5.getRoleId());
                  String var10008 = ";搟伭o";
                  var12.setName("[摊位:" + var5.getRole() + "]");
                  var12.setColor("G");
                  var10.append("#V");
                  var10.append(com.xy.v.Class31.a().toJson(var12));
                  var29 = "\u00198\u0019#";
                  var10.append("#L#W");
                  var10.append(var5.getMessage());
                  var4.chatBox.addChat(11, var10.toString());
                  return;
               }
            } else if (var4.getBattleScene() != null) {
               com.xy.d.Class11 var6;
               if ((var6 = var4.getBattleScene().getBattleUnit(0, var5.getRoleId().longValue())) != null) {
                  if (var6.cg().getId() == var4.roleData.getRoleId()) {
                     var6.ak(var5.getMessage());
                  } else if (!GameMain.d(var6.cg().getId())) {
                     var6.ag(var5.getMessage());
                  }
               }
            } else {
               com.xy.d.Class8 var8;
               if ((var8 = var4.mapScene.j(var5.getRole())) != null) {
                  var8.ak(var5.getMessage());
               }
            }

            StringBuffer var9 = new StringBuffer();
            if (var5.getId() == 4) {
               if (var5.getRoleId() != null) {
                  InputBean var11 = new InputBean();
                  String var26 = "6&\u0013&\u0013Pe";
                  var11.setType(1);
                  var11.setId(var5.getRoleId());
                  var11.setName("[" + var5.getRole() + "]");
                  var11.setColor("cFFFF00");
                  var11.setRichBeau(var5.getBeauBean() != null ? new RichBeau(var5.getBeauBean().toString()) : null);
                  String var19 = "\u0019\"";
                  var9.append("#V");
                  var9.append(com.xy.v.Class31.a().toJson(var11));
                  var26 = "C\u0019C\u0002";
                  var9.append("#L#W");
               }

               var9.append(var5.getMessage());
               var4.ci(var9.toString());
               return;
            }

            if (var5.getId() == 7) {
               String var10003 = "\u0019 ";
               var4.di("#T" + var5.getMessage(), 8, null);
            }

            ChatBean var10000;
            if (var5.getId() == 0) {
               var10000 = var5;
               String var23 = "C\u0004";
               var9.append("#Q");
            } else if (var5.getId() == 1) {
               var10000 = var5;
               String var22 = "\u00190";
               var9.append("#D");
            } else if (var5.getId() == 2) {
               var10000 = var5;
               String var21 = "C\u0005";
               var9.append("#P");
            } else if (var5.getId() == 3) {
               var10000 = var5;
               String var10002 = "\u0019>";
               var9.append("#J");
            } else if (var5.getId() != 5 && var5.getId() != 7) {
               if (var5.getId() == 6) {
                  String var16 = "\u0019,";
                  var9.append("#X");
               }

               var10000 = var5;
            } else {
               String var10001 = "C\u0001";
               var9.append("#T");
               var10000 = var5;
            }

            GameView var13;
            if (var10000.getId() != 5 && var5.getId() != 6 && var5.getId() != 7) {
               StringBuffer var14;
               if (var5.getRoleId() != null) {
                  InputBean var7 = new InputBean();
                  String var25 = "3";
                  var7.setType(1);
                  var7.setId(var5.getRoleId());
                  var7.setName("[" + var5.getRole() + "]");
                  var7.setColor("G");
                  var7.setRichBeau(var5.getBeauBean() != null ? new RichBeau(var5.getBeauBean().toString()) : null);
                  String var18 = "C\u0003";
                  var9.append("#V");
                  var9.append(com.xy.v.Class31.a().toJson(var7));
                  var14 = var9;
                  String var10004 = "\u00198";
                  var9.append("#L");
               } else {
                  if (var5.getRole() != null) {
                     var9.append("[" + var5.getRole() + "]");
                  }

                  var14 = var9;
               }

               var14.append(var5.getMessage());
               var13 = var4;
            } else {
               String var17 = "C\f";
               var9.append("#Y");
               var9.append(var5.getMessage());
               var13 = var4;
            }

            var13.chatBox.addChat(var5.getId(), var9.toString());
         }
      }
   }
}
