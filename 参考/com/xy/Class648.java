package com.xy;

import com.xy.text.GameChatPanel;
import com.xy.text.GamePanel;
import com.xy.text.GameView;
import com.xy.text.WatchServiceRunnable;
import java.awt.event.MouseEvent;

public class Class648 extends Class93 {
   private GamePanel gamePanel;
   private int id;
   private GameChatPanel gameChatPanel;
   private GameView gameView;

   public Class648(String var1, int var2, int var3, Object var4) {
      super(var1, var2, (Class345)null);
      this.id = var3;
      if (var4 instanceof GamePanel) {
         this.gamePanel = (GamePanel)var4;
      } else if (var4 instanceof GameChatPanel) {
         this.gameChatPanel = (GameChatPanel)var4;
      } else {
         if (var4 instanceof GameView) {
            this.gameView = (GameView)var4;
         }

      }
   }

   public void af(MouseEvent var1) {
      if (this.gamePanel != null) {
         if (this.id == --1) {
            this.gamePanel.setShowLable();
            return;
         }

         if (this.id == --2) {
            this.gamePanel.getGameFrame().setExtendedState(3 >> 1);
            return;
         }

         if (this.id == --3) {
            this.gamePanel.getGameFrame().cc();
            return;
         }

         if (this.id == --4) {
            this.gamePanel.setShowTab();
            return;
         }

         if (this.id == --5) {
            WatchServiceRunnable.c();
            return;
         }
      } else {
         if (this.gameChatPanel != null) {
            this.gameChatPanel.ab(this.id);
            return;
         }

         if (this.gameView != null) {
            if (this.id == (2 ^ 3)) {
               this.gameView.gameFrame.setGameView(this.gameView);
               return;
            }

            if (this.id == --2) {
               this.gameView.gameFrame.ng(this.gameView);
            }
         }
      }

   }

   public void ac(MouseEvent var1, boolean var2) {
   }
}
