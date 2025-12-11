package com.xy.i;

import com.xy.text.GameChatPanel;
import com.xy.text.GamePanel;
import com.xy.text.GameView;
import com.xy.text.WatchServiceRunnable;
import java.awt.event.MouseEvent;

public class Class9 extends Class1 {
   private GameView gameView;
   private int id;
   private GamePanel gamePanel;
   private GameChatPanel gameChatPanel;

   @Override
   public void fe(MouseEvent var1, boolean var2) {
   }

   @Override
   public void cw(MouseEvent var1) {
      if (this.gamePanel != null) {
         if (this.id == 1) {
            this.gamePanel.setShowLable();
            return;
         }

         if (this.id == 2) {
            this.gamePanel.getGameFrame().setExtendedState(1);
            return;
         }

         if (this.id == 3) {
            this.gamePanel.getGameFrame().h();
            return;
         }

         if (this.id == 4) {
            this.gamePanel.setShowTab();
            return;
         }

         if (this.id == 5) {
            WatchServiceRunnable.g();
            return;
         }
      } else {
         if (this.gameChatPanel != null) {
            this.gameChatPanel.n(this.id);
            return;
         }

         if (this.gameView != null) {
            if (this.id == 1) {
               this.gameView.gameFrame.setGameView(this.gameView);
               return;
            }

            if (this.id == 2) {
               this.gameView.gameFrame.fg(this.gameView);
            }
         }
      }
   }

   public Class9(String var1, int var2, int var3, Object var4) {
      super(var1, var2, null);
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
}
