package com.xy.text;

import com.xy.ar;
import com.xy.ho;
import com.xy.socket.GameClient;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.MemoryImageSource;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComponent;
import javax.swing.JFrame;

public class GameFrame extends JFrame {
   public GameView gameView;
   private boolean addViewFirst;
   public GamePanel gamePanel;
   public GameChatPanel gameChatPanel;
   Point point;
   public int alwaysOnTopIndex;
   public int frameIndex;
   public JComponent mouseView;
   private static boolean loadAWTEvent = 2 & 5;
   public List<GameView> gameList;

   public void setGameView(int var1) {
      synchronized(this) {
         if (var1 < this.gameList.size()) {
            this.setGameView((GameView)this.gameList.get(var1));
         }
      }
   }

   public void nb(boolean var1, String var2, GameView var3) {
      if (this.gameView == var3) {
         if (var1) {
            ar.e(var2);
         } else {
            ar.h(var2);
         }
      }
   }

   public void nc(String var1, GameView var2) {
      if (this.gameView == var2) {
         ar.a(var1);
      }
   }

   public void setGameView(GameView var1) {
      synchronized(this) {
         if (var1 != this.gameView) {
            if (this.gameView != null) {
               this.gamePanel.remove(this.gameView);
            }

            this.gameView = var1;
            this.gameView.setViewTitle();
            this.gamePanel.add(this.gameView);
            int var3 = 5 >> 3;

            for(int var10000 = var3; var10000 < this.gameList.size(); var10000 = var3) {
               GameView var4;
               (var4 = (GameView)this.gameList.get(var3)).getLabelView().getGameBtn().setBtnPath(var4 == this.gameView ? "sc/b/95.png" : "sc/b/96.png");
               ++var3;
            }

            this.gameChatPanel.setGameView(var1);
            this.d();
            GameMain.gameRunnable.setFPS(this.gameView.systemData.getFPS());
            this.gameView.p();
         }
      }
   }

   public void d() {
      synchronized(this) {
         this.gameView.dg();
         this.setGameSize();
      }
   }

   public void setViewTitle(GameView var1, BigDecimal var2, String var3) {
      synchronized(this) {
         if (this.gameView == var1) {
            this.setTitle(var3 + " ID:" + var2);
            this.gamePanel.getTitleLab().setText("大话西游2经典版 $Revision:" + GameMain.VERSIONSIZE + " - " + var1.getClient().getAreaName() + " - " + var3 + " (ID: " + var2 + ")");
         }
      }
   }


   private void setBtnSize() {
      boolean var1 = this.gamePanel.t();
      this.gamePanel.getGameBtns()[--3].setVisible(var1);
      this.gamePanel.getGameBtns()[--3].setBounds(126 & 9, 116 & 43, 30 & 109, 54 & 89);

      int var2;
      for(int var10000 = var2 = 3 >> 2; var10000 < this.gameList.size(); var10000 = var2) {
         GameView var3 = (GameView)this.gameList.get(var2);
         var3.getLabelView().setVisible(var1);
         GameLabelView var4 = var3.getLabelView();
         int var10001 = (127 & 22) + (18366 & 14573) * var2;
         int var10002 = 127 & 29;
         ++var2;
         var4.setBounds(var10001, var10002, 21950 & 10989, 23 & 127);
      }

      this.gamePanel.getGameBtns()[--4].setVisible(var1);
      this.gamePanel.getGameBtns()[--4].setBounds((122 & 29) + (26878 & 6061) * this.gameList.size(), 121 & 38, 31 & 112, 31 & 112);
   }

   public int getGameFrameHeight() {
      return this.gameView == null ? 5 >> 3 : 37 + (this.gamePanel.t() ? 95 & 57 : 0) + this.gameView.screenData.getScreen_y();
   }

   public void setShowLable() {
      synchronized(this) {
         this.setBtnSize();
         this.setGameSize();
      }
   }

   public Point nd() {
      Point var1 = MouseInfo.getPointerInfo().getLocation();
      this.point.move(var1.x - this.getX(), var1.y - this.getY());
      return this.point;
   }

   public void setGameSize() {
      synchronized(this) {
         ScreenData var2 = this.gameView.screenData;
         int var3 = 63 & 70;
         int var1 = this.gamePanel.t() ? 127 & 25 : 0;
         var1 += 31;
         GameView var10008 = this.gameView;
         int var10009 = var3;
         int var10011 = var2.getScreen_x();
         var3 += 6;
         var10008.setBounds(var10009, var1, var10011, var2.getScreen_y());
         var1 += 6;
         this.gameChatPanel.setBounds(var3 + var2.getScreen_x(), 2 & 5, var2.getChatFram_X(), var2.getScreen_y() + var1);
         this.gameChatPanel.q();
         this.mouseView.setSize(var2.getScreen_x() + var2.getChatFram_X() + var3, var2.getScreen_y() + var1);
         this.gamePanel.setSize(var2.getScreen_x() + var2.getChatFram_X() + var3, var2.getScreen_y() + var1);
         this.gamePanel.q();
         this.setSize(var2.getScreen_x() + var2.getChatFram_X() + var3, var2.getScreen_y() + var1);
      }
   }

   public GameFrame() {
      int var10020 = 2 & 5;
      int var10022 = 2 ^ 3;
      int var10024 = 3 ^ 3;
      super();
      this.frameIndex = var10024;
      this.addViewFirst = (boolean)var10022;
      this.alwaysOnTopIndex = var10020;
      this.point = new Point();
      this.frameIndex = GameMain.frameIndex;
      this.setIconImage(ho.a("sc/b/SZ1.png"));
      Toolkit var10015 = Toolkit.getDefaultToolkit();
      int[] var10018 = new int[5 >> 3];
      boolean var2 = true;
      Image var1 = var10015.createImage(new MemoryImageSource(3 & 4, 3 & 4, var10018, 3 & 4, 3 & 4));
      this.setCursor(Toolkit.getDefaultToolkit().createCustomCursor(var1, new Point(2 & 5, 2 & 5), (String)null));
      this.setUndecorated((boolean)(3 & 5));
      this.gameList = new ArrayList();
      this.gamePanel = new GamePanel(this);
      this.setContentPane(this.gamePanel);
      this.setDefaultCloseOperation(3 & 4);
      this.setVisible((boolean)(2 ^ 3));
      this.setResizable((boolean)(3 & 4));
      this.setFocusable((boolean)(5 >> 2));
      this.setFocusTraversalKeysEnabled((boolean)(5 >> 3));
      this.addWindowListener(new WindowAdapter() {
         public void windowClosing(WindowEvent var1) {
            GameFrame.this.cc();
         }
      });
      this.gameChatPanel = new GameChatPanel(this);
      this.mouseView = new JComponent() {
         protected void paintComponent(Graphics var1) {
            if (GameFrame.this.gameView != null) {
               GameFrame.this.gameView.fu(var1);
            }
         }
      };
      this.gamePanel.add(this.mouseView, 3 >> 2);
      this.gamePanel.add(this.gameChatPanel, 5 >> 2);
      if (!loadAWTEvent) {
         loadAWTEvent = (boolean)(--1);
         Toolkit.getDefaultToolkit().addAWTEventListener(new GameAWTEventListener(), 8L);
      }

      if (GameMain.gameRunnable == null) {
         GameMain.gameRunnable = new GameRunnable();
         (new Thread(GameMain.gameRunnable)).start();
      }

   }


   private void ne(GameView var1) {
      this.gamePanel.remove(var1.getLabelView());
      this.setBtnSize();
   }

   public void cc() {
      if (this.gameView != null) {
         this.gameView.getFormManagement().a(115 & 62);
      } else {
         System.exit(0);
      }
   }

   public void q() {
      synchronized(this) {
         this.setBtnSize();
      }
   }

   public void setGameView() {
      synchronized(this) {
         if (this.gameList.size() > (2 ^ 3)) {
            int var2;
            if ((var2 = this.gameList.indexOf(this.gameView) + (2 ^ 3)) >= this.gameList.size()) {
               var2 = 5 >> 3;
            }

            this.setGameView(var2);
         }
      }
   }

   public void nf(String var1, GameView var2) {
      if (this.gameView == var2) {
         ar.d(var1);
      }
   }

   public void ng(GameView var1) {
      GameFrame var2 = this;
      synchronized(this) {
         var1.setVisible((boolean)(3 ^ 3));
         var1.cc();
         if (this.gameList.remove(var1)) {
            var1.roleUnit.at((boolean)(3 >> 2));
            GameClient var3;
            if ((var3 = var1.getClient()) != null) {
               var3.c();
            }

            if (this.gameList.size() == 0) {
               GameMain.b(this);
            } else {
               if (var1.getBattleScene() != null) {
                  var1.getBattleScene().ag(var1.getBattleControl());
               }

               this.ne(var1);
               GameFrame var10000;
               if (var1 == this.gameView) {
                  var10000 = var2;
                  this.setGameView(3 & 4);
               } else {
                  this.d();
                  var10000 = var2;
               }

            }
         }
      }
   }

   public void nh(GameView var1) {
      synchronized(this) {
         int var3 = this.gameList.indexOf(var1);
         int var2 = this.getHypothesisindex(var1);
         if (var3 != var2) {
            this.gameList.remove(var1);
            int var10001 = 3 >> 2;
            this.gameList.add(var2, var1);
            var3 = var10001;

            for(int var10000 = var3; var10000 < this.gameList.size(); var10000 = var3) {
               GameView var6;
               if ((var6 = (GameView)this.gameList.get(var3)) != var1) {
                  var6.getLabelView().setBounds((62 & 87) + (29166 & 3773) * var3, 30 & 127, 22012 & 10927, 87 & 63);
               }

               ++var3;
            }

         }
      }
   }

   public int getHypothesisindex(GameView var1) {
      int var4 = var1.getLabelView().getX() - (86 & 63);
      int var2;
      int var10000 = var2 = 5 >> 3;

      while(true) {
         if (var10000 < this.gameList.size()) {
            GameView var3 = (GameView)this.gameList.get(var2);
            if (var4 < 0 || var4 >= var3.getLabelView().getWidth()) {
               var4 -= var3.getLabelView().getWidth();
               ++var2;
               var10000 = var2;
               continue;
            }

            if ((double)var4 * 0.5D > (double)var3.getLabelView().getWidth()) {
               ++var2;
               var10000 = var2;
               break;
            }
         }

         var10000 = var2;
         break;
      }

      return Math.min(var10000, this.gameList.size() - (5 >> 2));
   }


   private void ni(GameView var1) {
      this.gamePanel.add(var1.getLabelView());
      this.setBtnSize();
   }

   public void cx(GameView var1) {
      synchronized(this) {
         this.gameList.add(var1);
         this.ni(var1);
         this.setGameView(var1);
         int var10001;
         if (this.addViewFirst) {
            Dimension var4 = Toolkit.getDefaultToolkit().getScreenSize();
            var10001 = 3 & 4;
            this.setBounds((var4.width - this.getWidth()) / (5 >> 1), (var4.height - this.getHeight()) / (5 >> 1), this.getWidth(), this.getHeight());
            this.addViewFirst = (boolean)var10001;
         }

         var10001 = 3 & 5;
         this.alwaysOnTopIndex = 2 & 5;
         this.setAlwaysOnTop((boolean)var10001);
      }
   }
}
