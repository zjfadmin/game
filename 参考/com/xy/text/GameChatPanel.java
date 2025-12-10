package com.xy.text;

import com.xy.cj;
import com.xy.ho;
import com.xy.kV;
import com.xy.lE;
import com.xy.lJ;
import com.xy.lf;
import com.xy.lz;
import com.xy.game.GameUtil;
import com.xy.richtext.InputBean;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.LayoutManager;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import java.awt.geom.Path2D.Float;
import java.awt.image.ImageObserver;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GameChatPanel extends JPanel implements MouseListener, MouseMotionListener, MouseWheelListener {
   private InputBean inputBean;
   private lf backMenu;
   private GameChatPanel.GameChatMenuView menuView1;
   private Image back;
   private boolean move;
   private JLabel titleLab;
   private GameFrame gameFrame;
   private int moveX;
   private int moveIndex;
   private int moveW;
   public Color whiteLight;
   private GameChatPanel.GameChatMenuView menuView2;

   public void mouseWheelMoved(MouseWheelEvent var1) {
      int var2;
      if ((var2 = var1.getY()) > this.menuView1.chatY && var2 < this.menuView1.chatY + this.menuView1.chatH) {
         this.gameFrame.gameView.chatBox.addChat(4 ^ 5, -var1.getWheelRotation() * (117 & 30), this.menuView1.chatH);
      } else {
         if (var2 > this.menuView2.chatY && var2 < this.menuView2.chatY + this.menuView2.chatH) {
            this.gameFrame.gameView.chatBox.addChat(5 >> 1, -var1.getWheelRotation() * (119 & 28), this.menuView2.chatH);
         }

      }
   }

   public GameChatPanel(GameFrame var1) {
      int var10006 = 3 ^ 3;
      int var10009 = 5 >> 3;
      super();
      this.whiteLight = new Color(3549 & 29418, 3549 & 29418, 3549 & 29418);
      this.gameFrame = var1;
      this.setLayout((LayoutManager)null);
      this.setBounds(var10009, 5 >> 3, 2 ^ 3, 2 ^ 3);
      this.setBackground(lz.cu);
      this.titleLab = cj.b(var10006, 5 >> 3, 119 & 108, 94 & 63, Color.black, lz.ce);
      this.titleLab.setOpaque((boolean)(3 & 5));
      this.titleLab.setBackground(new Color(4596 & 28411, 4596 & 28411, 4596 & 28411));
      this.titleLab.setText("　聊天窗口");
      this.add(this.titleLab);
      this.menuView1 = new GameChatPanel.GameChatMenuView(2 & 5);
      this.menuView2 = new GameChatPanel.GameChatMenuView(4 ^ 5);
      this.add(this.menuView1);
      this.add(this.menuView2);
      this.addMouseListener(this);
      this.addMouseMotionListener(this);
      this.addMouseWheelListener(this);
   }

   public void mouseMoved(MouseEvent var1) {
   }

   public void paintComponent(Graphics var1) {
      super.paintComponent(var1);
      if (this.back == null) {
         this.back = ho.a("sc/c/2");
      }

      var1.drawImage(this.back, 3 >> 2, 127 & 30, Math.max(this.back.getWidth((ImageObserver)null), this.getWidth()), Math.max(this.back.getHeight((ImageObserver)null), this.getHeight() - (95 & 62)), (ImageObserver)null);
      if (this.move) {
         var1.setColor(Color.red);
         var1.drawLine(this.moveIndex, 2 & 5, this.moveIndex, this.getHeight());
      } else {
         this.gameFrame.gameView.chatBox.paint(var1, this.menuView1.chatY, this.menuView2.chatY, this.menuView1.chatH, this.menuView2.chatH);
      }
   }

   public void ab(int var1) {
      if (var1 != 0 && var1 != (101 & 126)) {
         if (var1 == (3 & 5)) {
            this.gameFrame.gameView.chatBox.addChat(5 >> 2, 125 & 22, this.menuView1.chatH);
            return;
         }

         if (var1 == 5 >> 1) {
            this.gameFrame.gameView.chatBox.addChat(3 & 5, -4 & -17, this.menuView1.chatH);
            return;
         }

         if (var1 == (125 & 103)) {
            this.gameFrame.gameView.chatBox.addChat(5 >> 1, 95 & 52, this.menuView2.chatH);
            return;
         }

         if (var1 == (103 & 126)) {
            this.gameFrame.gameView.chatBox.addChat(1 ^ 3, -18 & -3, this.menuView2.chatH);
            return;
         }

         if (var1 == --3 || var1 == (119 & 111)) {
            ((kV)this.gameFrame.gameView.getFormManagement().e(18943 & 13982)).y(var1 == --3 ? 4 ^ 5 : 2);
            return;
         }

         if (var1 != --4 && var1 != (123 & 108) && var1 != --5 && var1 != (109 & 123) && var1 != (110 & 23) && var1 != (127 & 106)) {
            if (var1 == (39 & 95) || var1 == (127 & 107)) {
               lE.cy(159, this.gameFrame.gameView);
               return;
            }

            if (var1 == (30 & 105) || var1 == 108) {
               lE.cy(160, this.gameFrame.gameView);
               return;
            }

            if (var1 != 9) {
            }
         }
      }

   }

   public void mouseDragged(MouseEvent var1) {
      if (this.move) {
         this.moveIndex = Math.max(Math.min(var1.getX() - this.moveX + this.moveW, 26488 & 7639), 17329 & 15598);
      }

   }

   public void setGameView(GameView var1) {
      boolean var3 = var1.getClient().gameText;

      int var2;
      for(int var10000 = var2 = --3; var10000 < this.menuView1.menuBtns.length; var10000 = var2) {
         if (this.menuView1.menuBtns[var2] != null) {
            this.menuView1.menuBtns[var2].setVisible(var3);
            this.menuView2.menuBtns[var2].setVisible(var3);
         }

         ++var2;
      }

   }

   public void mouseEntered(MouseEvent var1) {
   }

   public void q() {
      if (this.inputBean != null) {
         this.inputBean.setM((boolean)(3 & 4));
      }

      GameChatPanel var10000;
      ScreenData var1;
      label17: {
         this.inputBean = null;
         var1 = this.gameFrame.gameView.screenData;
         int var2;
         if ((var2 = this.gameFrame.getGameFrameHeight()) != this.menuView1.chatH + this.menuView2.chatH + (57 & 110) + (63 & 94)) {
            if (this.menuView1.chatH == 0) {
               var10000 = this;
               this.menuView1.chatY = 94 & 63;
               this.menuView1.chatH = (var2 - (125 & 42) - (94 & 63)) / (1 ^ 3);
               this.menuView2.chatY = this.menuView1.chatY + this.menuView1.chatH + (29 & 118);
               this.menuView2.chatH = var2 - this.menuView1.chatH - (47 & 120) - (62 & 95);
               break label17;
            }

            double var3 = (double)(var2 - (41 & 126) - (30 & 127));
            int var5 = Math.max(30886 & 2041, (int)(var3 * (double)this.menuView1.chatH / (double)(this.menuView1.chatH + this.menuView2.chatH)));
            int var4 = Math.max(9897 & 23030, var2 - var5 - (121 & 46) - (95 & 62));
            var5 = var2 - var4 - (111 & 56) - (30 & 127);
            this.menuView1.chatY = 30;
            this.menuView1.chatH = var5;
            this.menuView2.chatY = this.menuView1.chatY + this.menuView1.chatH + 20;
            this.menuView2.chatH = var4;
         }

         var10000 = this;
      }

      var10000.titleLab.setBounds(3 & 4, 3 & 4, var1.ChatFram_X, 30);
      this.menuView1.setBounds(5 >> 3, this.menuView1.chatY + this.menuView1.chatH, var1.ChatFram_X, 20);
      this.menuView2.setBounds(3 >> 2, this.menuView2.chatY + this.menuView2.chatH, var1.ChatFram_X, 20);
   }

   public void mouseReleased(MouseEvent var1) {
      if (this.inputBean != null) {
         GameUtil.d(this.inputBean, this.gameFrame.gameView);
      }

      if (this.move) {
         this.gameFrame.gameView.screenData.ChatFram_X = this.moveIndex;
         this.gameFrame.gameView.chatBox.setWidth(this.moveIndex);
         this.gameFrame.setGameSize();
      }

      this.move = (boolean)(3 & 4);
   }

   public GameChatPanel getGameChatPanel() {
      return this;
   }

   public void mousePressed(MouseEvent var1) {
      this.inputBean = this.gameFrame.gameView.chatBox.isMonitor(var1.getX(), var1.getY(), this.menuView1.chatY, this.menuView2.chatY, this.menuView1.chatH, this.menuView2.chatH);
      if (this.inputBean != null) {
         this.inputBean.setM((boolean)(3 >> 1));
      } else {
         if (this.getWidth() - var1.getX() < (94 & 53)) {
            this.moveX = var1.getX();
            this.moveW = this.moveIndex = this.getWidth();
            int var10003 = 32637 & 1502;
            this.titleLab.setBounds(2 & 5, 2 & 5, 13657 & 20470, 126 & 31);
            this.setBounds(this.getX(), 5 >> 3, 20310 & 13817, this.getHeight());
            int var3 = var10003;
            ScreenData var2 = this.gameFrame.gameView.screenData;
            this.gameFrame.gamePanel.setSize(var2.getScreen_x() + var3, this.gameFrame.getHeight());
            this.gameFrame.setSize(var2.getScreen_x() + var3, this.gameFrame.getHeight());
            this.move = (boolean)(3 >> 1);
         }

      }
   }

   public void mouseExited(MouseEvent var1) {
   }

   public void mouseClicked(MouseEvent var1) {
   }

   class GameChatMenuView extends JComponent implements MouseListener, MouseMotionListener {
      private lJ[] menuBtns;
      private int chatH;
      private int chatY;
      private int menuY;
      private int type;

      public void mouseExited(MouseEvent var1) {
      }

      public void mouseClicked(MouseEvent var1) {
      }

      public void paintComponent(Graphics var1) {
         super.paintComponent(var1);
         if (GameChatPanel.this.backMenu == null) {
            GameChatPanel.this.backMenu = ho.q("sc/c/1", 111 & 22, 111 & 22, 111 & 22, 111 & 22, (boolean)(3 ^ 3));
         }

         GameChatPanel.this.backMenu.g(var1, this.getWidth(), this.getHeight());
      }

      public void mousePressed(MouseEvent var1) {
         this.menuY = var1.getY();
      }

      public void mouseMoved(MouseEvent var1) {
      }

      public GameChatMenuView(int var2) {
         int var10001 = 43 & 94;
         int var10005 = 5 >> 3;
         int var10007 = 2 & 5;
         int var10009 = 2 & 5;
         super();
         this.type = var10009;
         this.chatY = var10007;
         this.chatH = var10005;
         this.type = var2;
         lJ[] var6 = new lJ[var10001];
         boolean var10003 = true;
         this.menuBtns = var6;
         int var4 = 5 >> 3;

         int var3;
         for(int var10000 = var3 = 5 >> 3; var10000 < this.menuBtns.length; var10000 = var3) {
            GameChatPanel.GameChatMenuView var5;
            if (var3 == --3) {
               var5 = this;
               this.menuBtns[var3] = new lJ("sc/e/144.png", 4 ^ 5, var2 * (119 & 108) + var3, GameChatPanel.this.getGameChatPanel());
            } else if (var3 == (103 & 31)) {
               var5 = this;
               this.menuBtns[var3] = new lJ("sc/e/149.png", 2 ^ 3, var2 * (125 & 102) + var3, GameChatPanel.this.getGameChatPanel());
            } else if (var3 == (94 & 41)) {
               var5 = this;
               this.menuBtns[var3] = new lJ("sc/e/150.png", 3 >> 1, var2 * (118 & 109) + var3, GameChatPanel.this.getGameChatPanel());
            } else {
               if (var3 != --4 && var3 != --5 && var3 != (87 & 46) && var3 != (43 & 93)) {
                  this.menuBtns[var3] = new lJ("sc/c/" + (--3 + var3), 5 >> 2, var2 * (109 & 118) + var3, GameChatPanel.this.getGameChatPanel());
               }

               var5 = this;
            }

            if (var5.menuBtns[var3] != null) {
               this.menuBtns[var3].setBounds((87 & 57) * var4, --3, 121 & 23, 121 & 23);
               ++var4;
               this.add(this.menuBtns[var3]);
            }

            ++var3;
         }

         if (var2 == 0) {
            this.addMouseListener(this);
            this.addMouseMotionListener(this);
         }
      }

      public void mouseReleased(MouseEvent var1) {
      }

      public void mouseDragged(MouseEvent var1) {
         int var4 = var1.getY() - this.menuY;
         int var2 = GameChatPanel.this.gameFrame.getGameFrameHeight();
         var4 = Math.max(3499 & 29428, var4 + this.getY() - (30 & 127));
         int var3 = Math.max(17385 & 15542, var2 - var4 - (105 & 62) - (95 & 62));
         if ((var4 = var2 - var3 - (125 & 42) - (31 & 126)) != GameChatPanel.this.menuView1.chatH) {
            GameChatPanel.this.menuView1.chatY = 63 & 94;
            GameChatPanel.this.menuView1.chatH = var4;
            GameChatPanel.this.menuView2.chatY = GameChatPanel.this.menuView1.chatY + GameChatPanel.this.menuView1.chatH + (28 & 119);
            GameChatPanel.this.menuView2.chatH = var3;
            GameChatPanel.this.menuView1.setBounds(3 >> 2, GameChatPanel.this.menuView1.chatY + GameChatPanel.this.menuView1.chatH, this.getWidth(), this.getHeight());
            GameChatPanel.this.menuView2.setBounds(3 & 4, GameChatPanel.this.menuView2.chatY + GameChatPanel.this.menuView2.chatH, this.getWidth(), this.getHeight());
         }
      }

      public void mouseEntered(MouseEvent var1) {
      }
   }

   public class RounedShape extends Float {
      private float width;
      private float height;

      public RounedShape(float var2, float var3, float var4) {
         int var10001 = 3 >> 2;
         super();
         this.width = var2;
         this.height = var3;
         this.moveTo(var4, 0.0F);
         this.lineTo(var2 - var4, 0.0F);
         this.curveTo(var2 - var4, 0.0F, var2, 0.0F, var2, var4);
         this.lineTo(var2, var3);
         this.lineTo(0.0F, var3);
         this.lineTo(0.0F, var4);
         this.curveTo(0.0F, var4, 0.0F, 0.0F, var4, 0.0F);
         this.lineTo(var2 - var4, 0.0F);
         this.closePath();
         this.setWindingRule(var10001);
      }
   }
}
