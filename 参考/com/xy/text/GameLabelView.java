package com.xy.text;

import com.xy.cj;
import com.xy.fy;
import com.xy.lJ;
import com.xy.lz;
import java.awt.Color;
import java.awt.LayoutManager;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import javax.swing.JComponent;
import javax.swing.JLabel;

public class GameLabelView extends JComponent implements MouseMotionListener {
   private GameView gameView;
   private int first_y;
   private lJ gameBtn;
   private int first;
   private lJ gameCloseBtn;
   private fy headImg;
   private int first_x;
   private JLabel nameLabel;

   public void setHeadImg(fy var1) {
      this.headImg = var1;
   }

   public void fy(MouseEvent var1) {
      if (this.first != 0) {
         this.gameView.gameFrame.q();
      }

   }

   public lJ getGameCloseBtn() {
      return this.gameCloseBtn;
   }

   public GameLabelView(GameView var1) {
      int var10008 = 54 & 95;
      int var10012 = 3 & 4;
      super();
      this.gameView = var1;
      this.setLayout((LayoutManager)null);
      this.setBackground(lz.cu);
      this.setBounds(var10012, 2 & 5, 9663 & 23276, 95 & 55);
      this.headImg = new fy();
      this.headImg.setBounds(--4, 62 & 71, 84 & 59, 84 & 59);
      this.nameLabel = cj.b(var10008, 38 & 95, 109 & 118, 94 & 51, Color.black, lz.ab);
      this.gameBtn = new lJ("sc/b/96.png", 3 >> 1, 3 >> 1, var1) {
         public void mousePressed(MouseEvent var1) {
            super.mousePressed(var1);
            GameLabelView.this.af(var1);
         }

         public void mouseReleased(MouseEvent var1) {
            super.mouseReleased(var1);
            GameLabelView.this.fy(var1);
         }
      };
      this.gameBtn.addMouseMotionListener(this);
      this.gameCloseBtn = new lJ("sc/b/94.png", 4 ^ 5, 1 ^ 3, var1);
      this.gameBtn.setBounds(3 ^ 3, 3 ^ 3, 28079 & 4860, 23 & 127);
      this.gameCloseBtn.setBounds(8159 & 24763, --5, 125 & 15, 125 & 15);
      this.add(this.headImg);
      this.add(this.nameLabel);
      this.add(this.gameCloseBtn);
      this.add(this.gameBtn);
   }

   public JLabel getNameLabel() {
      return this.nameLabel;
   }

   public void setNameLabel(JLabel var1) {
      this.nameLabel = var1;
   }

   public void af(MouseEvent var1) {
      this.first = 2 & 5;
      this.first_x = var1.getX();
      this.first_y = var1.getY();
   }

   public void mouseMoved(MouseEvent var1) {
   }

   public lJ getGameBtn() {
      return this.gameBtn;
   }

   public void mouseDragged(MouseEvent var1) {
      if (this.first == 0) {
         this.first = 4 ^ 5;
         this.gameView.gameFrame.add(this, 1 ^ 3);
      }

      MouseEvent var10000 = var1;
      int var3 = var1.getX() - this.first_x;
      int var2 = var10000.getY() - this.first_y;
      this.setBounds(var3 + this.getX(), this.getY(), this.getWidth(), this.getHeight());
      this.gameView.gameFrame.nh(this.gameView);
   }

   public void setGameBtn(lJ var1) {
      this.gameBtn = var1;
   }

   public void setGameCloseBtn(lJ var1) {
      this.gameCloseBtn = var1;
   }

   public fy getHeadImg() {
      return this.headImg;
   }
}
