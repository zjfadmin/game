package com.xy;

import com.xy.bean.NPCDialog;
import com.xy.readbean.NpcInfoBean;
import com.xy.socket.GameClient;
import com.xy.socket.ServerAction;
import com.xy.text.GameView;

public class Class325 implements ServerAction {
   public void a(String var1, String var2, GameClient var3) {
      GameView var5 = var3.gameView;
      if (var1.equals("npc")) {
         NPCDialog var6 = (NPCDialog)Class695.b().fromJson(var2, NPCDialog.class);
         ((Class472)var5.getFormManagement().e(27 & 127)).lw(var6);
      } else {
         if (var1.equals("npcdialog")) {
            NpcInfoBean var4;
            if ((var4 = var5.getObjectArea().ck(var2)) == null) {
               return;
            }

            ((Class472)var5.getFormManagement().e(31 & 123)).ll((Class165)null, var4, Integer.parseInt(var4.getNpctable().getNpctype()));
         }

      }
   }
}
