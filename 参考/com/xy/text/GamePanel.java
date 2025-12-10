package com.xy.text;

import com.xy.cj;
import com.xy.fy;
import com.xy.lJ;
import com.xy.lz;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.LayoutManager;
import java.awt.RenderingHints;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.BorderFactory;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GamePanel extends JPanel implements MouseListener, MouseMotionListener {
   public long repaintCount;
   private int moveX;
   private boolean showLable;
   private Color color3;
   private GameFrame gameFrame;
   private lJ[] gameBtns;
   private JLabel titleLab;
   private JComponent componentTab;
   private GradientPaint grad1;
   private int moveY;
   private Color color2;
   public long repaintIndex;
   private Color color1;
   private fy img;

   public lJ[] getGameBtns() {
      return this.gameBtns;
   }

   public GamePanel(GameFrame var1) {
      int var10001 = --5;
      int var10005 = 27 & 124;
      int var10010 = 2 & 5;
      int var10022 = --1;
      super();
      this.showLable = (boolean)var10022;
      this.color1 = Color.decode("0xDDDDDD");
      this.color2 = lz.c("0x324147");
      this.color3 = lz.c("0x97A5B5");
      this.gameFrame = var1;
      this.setLayout((LayoutManager)null);
      this.setBounds(var10010, 5 >> 3, --1, --1);
      this.setBackground(lz.cu);
      this.grad1 = new GradientPaint(0.0F, 0.0F, Color.decode("0x5E7B9D"), 0.0F, 60.0F, Color.decode("0x789CC0"));
      this.img = new fy("sc/b/SZ1.png");
      this.img.setBounds(--5, 119 & 15, 88 & 55, 88 & 55);
      this.titleLab = cj.b(var10005, --5, 31587 & 1980, 29 & 118, Color.black, lz.ab);
      this.add(this.img);
      this.add(this.titleLab);
      this.componentTab = new JComponent() {
      };
      this.componentTab.setVisible((boolean)(5 >> 3));
      this.add(this.componentTab);
      lJ[] var4 = new lJ[var10001];
      boolean var10003 = true;
      this.gameBtns = var4;

      int var2;
      for(int var10000 = var2 = 3 >> 2; var10000 < this.gameBtns.length; var10000 = var2) {
         GamePanel var3;
         if (var2 == --3) {
            var3 = this;
            this.gameBtns[var2] = new lJ("sc/e/76.png", 4 ^ 5, var2 + (4 ^ 5), this);
            this.gameBtns[var2].setBounds(3 & 4, 3 & 4, 109 & 30, 56 & 87);
         } else if (var2 == --4) {
            var3 = this;
            this.gameBtns[var2] = new lJ("sc/e/77.png", 3 >> 1, var2 + (3 >> 1), this);
            this.gameBtns[var2].setBounds(3 >> 2, 3 >> 2, 17 & 126, 17 & 126);
         } else {
            var3 = this;
            this.gameBtns[var2] = new lJ("sc/b/" + ((118 & 107) + var2) + ".png", 5 >> 2, var2 + (5 >> 2), this);
            this.gameBtns[var2].setBounds(3 & 4, 3 & 4, 123 & 21, 123 & 21);
         }

         var3.add(this.gameBtns[var2++]);
      }

      this.addMouseListener(this);
      this.addMouseMotionListener(this);
   }

   public void mouseMoved(MouseEvent var1) {
   }

   public void setShowTab() {
      if (this.componentTab.isVisible()) {
         this.componentTab.setVisible((boolean)(3 & 4));
      } else {
         int var5 = this.gameFrame.gameList.indexOf(this.gameFrame.gameView);
         int var2 = this.componentTab.getComponentCount();

         int var10000;
         int var3;
         for(var10000 = var3 = 3 >> 2; var10000 < this.gameFrame.gameList.size(); var10000 = var3) {
            GameView var4 = (GameView)this.gameFrame.gameList.get(var3);
            GamePanel.TabComponent var1;
            if ((var1 = (GamePanel.TabComponent)(var3 < var2 ? this.componentTab.getComponent(var3) : null)) == null) {
               this.componentTab.add(var1 = new GamePanel.TabComponent(var3));
            }

            var1.label1.setText(var5 == var3 ? "√" : "");
            var1.label2.setText(var4.isDraw ? var4.roleUnit.aw() : null);
            ++var3;
            var1.setVisible((boolean)(2 ^ 3));
         }

         for(var10000 = var3 = this.gameFrame.gameList.size(); var10000 < var2; var10000 = var3) {
            this.componentTab.getComponent(var3++).setVisible((boolean)(3 ^ 3));
         }

         this.componentTab.setBounds(124 & 23, 118 & 59, 9203 & 23724, --1 + this.gameFrame.gameList.size() * (87 & 59));
         this.componentTab.setVisible((boolean)(4 ^ 5));
      }
   }

   public void mouseEntered(MouseEvent var1) {
   }

   public void mousePressed(MouseEvent var1) {
      this.moveX = var1.getX();
      this.moveY = var1.getY();
   }

   public void mouseReleased(MouseEvent var1) {
   }

   public void mouseExited(MouseEvent var1) {
   }

   public JLabel getTitleLab() {
      return this.titleLab;
   }

   public void q() {
      if (this.gameFrame.gameView != null) {
         ScreenData var10000 = this.gameFrame.gameView.screenData;
         int var1 = var10000.Screen_x + (47 & 92);
         int var3 = var10000.Screen_y + (60 & 79) + (93 & 59) + (this.t() ? 121 & 31 : 0);

         int var2;
         for(var3 = var2 = 2 & 5; var3 < 3; var3 = var2) {
            lJ var4 = this.gameBtns[var2];
            int var10001 = var1 - (117 & 27) * (--3 - var2) - --1;
            int var10002 = --1;
            ++var2;
            var4.setBounds(var10001, var10002, 55 & 89, 55 & 89);
         }
      }

   }

   public void mouseDragged(MouseEvent var1) {
      int var10002 = var1.getX();
      MouseEvent var10001 = var1;
      int var3 = var10002 - this.moveX;
      int var2 = var10001.getY() - this.moveY;
      this.gameFrame.setBounds(var3 + this.gameFrame.getX(), var2 + this.gameFrame.getY(), this.gameFrame.getWidth(), this.gameFrame.getHeight());
   }

   public void setShowLable() {
      this.showLable = (boolean)(this.showLable ? 3 ^ 3 : 1);
      this.gameBtns[2 & 5].setBtnPath(this.showLable ? "sc/b/98.png" : "sc/b/97.png");
      this.gameBtns[--3].setVisible(this.showLable);
      this.gameBtns[--4].setVisible(this.showLable);
      this.gameFrame.setShowLable();
   }

   public GameFrame getGameFrame() {
      return this.gameFrame;
   }

   public boolean t() {
      return this.showLable;
   }

   public void paintComponent(Graphics var1) {
      super.paintComponent(var1);
      if (this.gameFrame.gameView != null) {
         Graphics2D var5 = (Graphics2D)var1;
         ScreenData var4;
         ScreenData var10000 = var4 = this.gameFrame.gameView.screenData;
         int var3 = var10000.Screen_x + (93 & 46);
         int var2 = var10000.Screen_y + (110 & 29) + (63 & 89) + (this.t() ? 27 & 125 : 0);
         int var10002 = 3 & 5;
         var5.setPaint(this.grad1);
         var5.fillRect(var10002, 2 ^ 3, var3 - --2, var2 - (1 ^ 3));
         if (this.showLable) {
            int var10020 = 62 & 71;
            var5.setColor(this.color1);
            int var10021 = 119 & 60;
            --var3;
            var5.fillRect(var10020, var10021, var4.Screen_x, --4);
            --var2;
            var5.setColor(this.color2);
            var5.drawLine(--5, 119 & 61, 31 & 103, 55 & 123);
            var5.drawLine(111 & 23, 115 & 63, var3 - (111 & 23), 55 & 123);
            var5.drawLine(var3 - (95 & 39), 55 & 123, var3 - --5, 119 & 61);
            var5.drawLine(var3 - --5, 125 & 55, var3 - --5, var2 - --5);
            var5.drawLine(var3 - --5, var2 - --5, --5, var2 - --5);
            var5.drawLine(--5, var2 - --5, --5, 53);
            var5.drawLine(3 & 4, 1 ^ 3, 1 ^ 3, 3 & 4);
            var5.drawLine(5 >> 1, 3 >> 2, var3 - (5 >> 1), 2 & 5);
            var5.drawLine(var3 - --2, 5 >> 3, var3, 2);
            var5.drawLine(var3, 2, var3, var2 - 2);
            var5.drawLine(var3, var2 - 2, var3 - 2, var2);
            var5.drawLine(var3 - 2, var2, 2, var2);
            var5.drawLine(2, var2, 3 >> 2, var2 - 2);
            var5.drawLine(2 & 5, var2 - 2, 2 & 5, 2);
            var5.setColor(this.color3);
            var5.drawLine(2, 4 ^ 5, var3 - 2, 4 ^ 5);
            return;
         }

         --var3;
         --var2;
         int var10005 = 2 & 5;
         int var10017 = 3 ^ 3;
         var5.setColor(this.color2);
         var5.drawLine(5, 30, var3 - 5, 30);
         var5.drawLine(var3 - 5, 30, var3 - 5, var2 - 5);
         var5.drawLine(var3 - 5, var2 - 5, 5, var2 - 5);
         var5.drawLine(5, var2 - 5, 5, 30);
         var5.drawLine(var10017, 2, 2, 3 & 4);
         var5.drawLine(2, 2 & 5, var3 - 2, 2 & 5);
         var5.drawLine(var3 - 2, 3 ^ 3, var3, 2);
         var5.drawLine(var3, 2, var3, var2 - 2);
         var5.drawLine(var3, var2 - 2, var3 - 2, var2);
         var5.drawLine(var3 - 2, var2, 2, var2);
         var5.drawLine(2, var2, 5 >> 3, var2 - 2);
         var5.drawLine(var10005, var2 - 2, 5 >> 3, 2);
         var5.setColor(this.color3);
         var5.drawLine(2, 2 ^ 3, var3 - 2, 2 ^ 3);
      }

   }

   public void mouseClicked(MouseEvent var1) {
   }

   public void paint(Graphics var1) {
      ++this.repaintCount;
      ((Graphics2D)var1).setRenderingHint(RenderingHints.KEY_STROKE_CONTROL, RenderingHints.VALUE_STROKE_DEFAULT);
      super.paint(var1);
   }

   class TabComponent extends JPanel implements MouseListener {
      private int index;
      private JLabel label1;
      private JLabel label2;

      public void mouseExited(MouseEvent var1) {
      }

      public void mouseReleased(MouseEvent var1) {
      }

      public TabComponent(int var2) {
         int var10003 = 126 & 31;
         int var10005 = --3;
         super();
         this.index = var2;
         this.setLayout((LayoutManager)null);
         this.setBackground(Color.white);
         this.setBorder(BorderFactory.createLineBorder(Color.black));
         this.label1 = cj.c(var10005, 1 ^ 3, 94 & 63, 25 & 118, 126 & 11, Color.black, lz.cn);
         this.label2 = cj.c(var10003, 5 >> 2, 125 & 127, 114 & 31, --4, Color.black, lz.bx);
         this.add(this.label1);
         this.add(this.label2);
         var10003 = 3 & 4;
         this.addMouseListener(this);
         this.setBounds(var10003, (23 & 123) * var2, 26543 & 6384, 125 & 22);
      }

      public void mouseEntered(MouseEvent var1) {
      }

      public void mousePressed(MouseEvent var1) {
         GamePanel.this.setShowTab();
         GamePanel.this.gameFrame.setGameView(this.index);
      }

      public void mouseClicked(MouseEvent var1) {
      }
   }
}
