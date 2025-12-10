package com.xy.scene;

import com.xy.lz;
import com.xy.richtext.RichLabel;
import com.xy.text.GameView;
import java.awt.Graphics;

public class DLDScene implements Scene {
   private int v2;
   private RichLabel richLabel;
   private GameView gameView;
   private int v1;

   public boolean f(int var1, int var2) {
      return (boolean)(3 >> 2);
   }

   public void e(String[] var1) {
      int var2;
      for(int var10000 = var2 = 2 ^ 3; var10000 < var1.length; var10000 = var2) {
         if (var2 == 3 >> 1) {
            this.v1 = Integer.parseInt(var1[var2]);
         } else if (var2 == --2) {
            this.v2 = Integer.parseInt(var1[var2]);
         }

         ++var2;
      }

      StringBuffer var3;
      (var3 = new StringBuffer()).append("#Y大乱斗#r#W存活队伍:");
      var3.append(this.v2 - this.v1);
      var3.append("/");
      var3.append(this.v2);
      if (this.richLabel == null) {
         this.richLabel = new RichLabel(var3.toString(), lz.bm, 11455 & 21477);
      } else {
         this.richLabel.setTextSize(var3.toString(), 25319 & 7613);
      }
   }

   public RichLabel getRichLabel() {
      return this.richLabel;
   }

   public void a() {
   }

   public void h(Graphics var1) {
      this.gameView.mapScene.s(var1, this.gameView);
   }

   public DLDScene(String[] var1, GameView var2) {
      this.gameView = var2;
      this.e(var1);
   }

   public int getSceneId() {
      return 17407 & 16374;
   }
}
