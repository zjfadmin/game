package com.xy;

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

public class Class126 implements ServerAction {
   public void a(String var1, String var2, GameClient var3) {
      GameView var11;
      RoleData var4 = (var11 = var3.gameView).roleData;
      if (var1.equals("friend")) {
         List var14 = ((FriendResultBean)Class695.b().fromJson(var2, FriendResultBean.class)).getFriendtables();
         int var15 = 3 & 4;
         int var16 = var14 != null ? var14.size() : 0;

         for(int var10000 = var15; var10000 < var16; var10000 = var15) {
            Friendtable var18 = (Friendtable)var14.get(var15);
            ++var15;
            var4.u(var18);
         }

         if (var11.getFormManagement().d(--4) != null) {
            ((Class637)var11.getFormManagement().d(--4)).afb(var4.getFriendList(), (boolean)(--1));
         }
      } else if (var1.equals("friendchat")) {
         ChatFriendBean var12;
         long var13 = (var12 = (ChatFriendBean)Class695.b().fromJson(var2, ChatFriendBean.class)).getSendRoleId() != null ? var12.getSendRoleId().longValue() : 0L;
         if (var13 == 0L) {
            var12.setRolename("大话精灵");
         }

         FriendBean var8;
         if ((var8 = var4.getFriend(var13)) == null) {
            var8 = new FriendBean();
            var8.setFid(var13);
            var8.setRoleName(var12.getRolename());
            Class183 var9;
            RoleShow var10 = (var9 = var11.mapScene.a(var12.getRolename())) != null ? var9.r : null;
            if (var10 != null) {
               var8.setSpeciesId(var10.getSpecies_id().intValue());
               var8.setLvl(var10.getGrade());
            }

            var8 = var4.bh(var8);
         } else {
            var8.setRoleName(var12.getRolename());
         }

         StringBuffer var17;
         (var17 = new StringBuffer()).append("#r#R");
         var17.append(Class280.i(Class280.l()));
         var17.append(" ");
         var17.append(var8.getRoleName());
         var17.append("#r#W");
         var17.append(var12.getMessage());
         var8.d(var17.toString());
         Class345 var19 = var11.getFormManagement().m(123 & 60);
         if (var19 == null || !((Class494)var19).ajg(var8.getFid(), var17.toString())) {
            var8.setChat((boolean)(2 ^ 3));
            int var10001 = 5 >> 3;
            var11.baseView.jy(109 & 27, (boolean)(4 ^ 5));
            var11.abh((boolean)var10001, "好友信件提示音.mp3");
         }
      } else {
         if (!var1.equals("searcahChatRoleId") && !var1.equals("searcahChatRoleName")) {
            var1.equals("searchChatRecorde");
         } else {
            Class345 var5;
            if ((var5 = var11.getFormManagement().m(111 & 91)) != null) {
               Role_bean var6 = (Role_bean)Class695.b().fromJson(var2, Role_bean.class);
               Class83 var7;
               (var7 = (Class83)var5).m(var6);
               return;
            }
         }

      }
   }
}
