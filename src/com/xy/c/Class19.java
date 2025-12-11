package com.xy.c;

import com.xy.bean.NPCDialog;
import com.xy.readbean.NpcInfoBean;
import com.xy.socket.GameClient;
import com.xy.socket.ServerAction;
import com.xy.text.GameView;

public class Class19 implements ServerAction {
   @Override
   public void b(String var1, String var2, GameClient var3) {
      GameView var4 = var3.gameView;
      if (var1.equals("npc")) {
         NPCDialog var7 = com.xy.v.Class31.a().fromJson(var2, NPCDialog.class);
         ((com.xy.a.Class6)var4.getFormManagement().j(27)).bu(var7);
      } else {
         if (var1.equals("npcdialog")) {
            NpcInfoBean var5;
            if ((var5 = var4.getObjectArea().at(var2)) == null) {
               return;
            }

            ((com.xy.a.Class6)var4.getFormManagement().j(27)).bw(null, var5, Integer.parseInt(var5.getNpctable().getNpctype()));
         }
      }
   }
}
