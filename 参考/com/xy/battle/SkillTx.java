package com.xy.battle;

import com.xy.cY;
import com.xy.ho;
import com.xy.lg;
import com.xy.readbean.Skill;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ImageObserver;

public class SkillTx {
   private static Image back;
   private Skill skill;
   private int id;
   private int index;
   private boolean is;
   private Image image;

   public void a(Graphics var1, BattleControl var2) {
      BattleControl var10001 = var2;
      int var4 = var2.gameView.screenData.Screen_x - this.index * (123 & 44);
      int var3 = var10001.gameView.screenData.Screen_y - (122 & 125);
      if (this.image == null) {
         this.image = cY.s(this.id);
      }

      var1.drawImage(back, var4 - --3, var3 - --3, 118 & 45, 118 & 45, (ImageObserver)null);
      var1.drawImage(this.image, var4, var3, 126 & 31, 126 & 31, (ImageObserver)null);
   }

   public boolean b(int var1, int var2, BattleControl var3) {
      BattleControl var10000 = var3;
      int var5 = var3.gameView.screenData.Screen_x - this.index * (107 & 60);
      int var4 = var10000.gameView.screenData.Screen_y - (126 & 121);
      return (boolean)(var5 <= var1 && var5 + (127 & 30) >= var1 && var4 <= var2 && var4 + (94 & 63) >= var2 ? 3 & 5 : 0);
   }

   public boolean c() {
      return this.is;
   }

   public void setIs(boolean var1) {
      this.is = var1;
   }

   public SkillTx() {
      if (back == null) {
         back = ho.a("sc/c/54");
      }

   }

   public Skill getSkill() {
      return this.skill;
   }

   public int getId() {
      return this.id;
   }

   public void d(String var1, int var2, lg var3) {
      this.is = (boolean)(2 & 5);
      this.index = var2;
      if (this.skill == null || !this.skill.getSkillname().equals(var1)) {
         this.skill = var3.bg(var1);
         this.id = Integer.parseInt(this.skill.getSkillid());
         this.image = null;
      }

   }
}
