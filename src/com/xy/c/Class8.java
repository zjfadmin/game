package com.xy.c;

import com.xy.a.Class128;
import com.xy.a.Class52;
import com.xy.a.Class78;
import com.xy.bean.ChatFriendBean;
import com.xy.bean.FriendBean;
import com.xy.bean.FriendResultBean;
import com.xy.bean.RoleShow;
import com.xy.bean.Role_bean;
import com.xy.entity.Friendtable;
import com.xy.game.RoleData;
import com.xy.socket.GameClient;
import com.xy.socket.ServerAction;
import com.xy.text.GameView;
import java.util.List;

public class Class8 implements ServerAction {
   @Override
   public void b(String var1, String var2, GameClient var3) {
      GameView var4 = var3.gameView;
      RoleData var5 = var3.gameView.roleData;
      if (var1.equals("friend")) {
         List var14 = com.xy.v.Class31.a().fromJson(var2, FriendResultBean.class).getFriendtables();
         int var15 = 0;
         int var17 = var14 != null ? var14.size() : 0;

         for (int var21 = var15; var21 < var17; var21 = var15) {
            Friendtable var19 = (Friendtable)var14.get(var15);
            var15++;
            var5.aw(var19);
         }

         if (var4.getFormManagement().n(4) != null) {
            ((Class128)var4.getFormManagement().n(4)).amg(var5.getFriendList(), true);
         }
      } else if (var1.equals("friendchat")) {
         ChatFriendBean var12;
         long var13 = (var12 = com.xy.v.Class31.a().fromJson(var2, ChatFriendBean.class)).getSendRoleId() != null ? var12.getSendRoleId().longValue() : 0L;
         if (var13 == 0L) {
            String var10001 = "奏译糖灹";
            var12.setRolename("大话精灵");
         }

         FriendBean var9;
         if ((var9 = var5.getFriend(var13)) == null) {
            var9 = new FriendBean();
            var9.setFid(var13);
            var9.setRoleName(var12.getRolename());
            com.xy.d.Class8 var10;
            RoleShow var11 = (var10 = var4.mapScene.j(var12.getRolename())) != null ? var10.ap : null;
            if (var11 != null) {
               var9.setSpeciesId(var11.getSpecies_id().intValue());
               var9.setLvl(var11.getGrade());
            }

            var9 = var5.am(var9);
         } else {
            var9.setRoleName(var12.getRolename());
         }

         StringBuffer var18;
         StringBuffer var10000 = var18 = new StringBuffer();
         String var22 = "\u0019\u001e\u0019>";
         var10000.append("#r#R");
         var18.append(com.xy.v.Class22.i(com.xy.v.Class22.l()));
         String var10003 = ",";
         var18.append(" ");
         var18.append(var9.getRoleName());
         String var10005 = "\u0019\u001e\u0019;";
         var18.append("#r#W");
         var18.append(var12.getMessage());
         var9.c(var18.toString());
         com.xy.q.Class30 var20 = var4.getFormManagement().l(56);
         if (var20 == null || !((Class52)var20).ss(var9.getFid(), var18.toString())) {
            var9.setChat(true);
            var4.baseView.ab(9, true);
            String var10002 = "奱厣俭亞揜祒響Fa\u0018?";
            var4.dg(false, "好友信件提示音.mp3");
         }
      } else {
         if (!var1.equals("searcahChatRoleId") && !var1.equals("searcahChatRoleName")) {
            var1.equals("searchChatRecorde");
         } else {
            com.xy.q.Class30 var6;
            if ((var6 = var4.getFormManagement().l(75)) != null) {
               Role_bean var7 = com.xy.v.Class31.a().fromJson(var2, Role_bean.class);
               Class78 var8;
               (var8 = (Class78)var6).zf(var7);
               return;
            }
         }
      }
   }
}
