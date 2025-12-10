package com.xy.battle;

import com.xy.dx;
import com.xy.iO;
import com.xy.z;
import java.awt.Graphics;

public class BattleSkillShow {
   private long dietime;
   private transient iO battleUnit;
   private transient int camp;
   private ShadowMode shadowMode;
   private int dir;
   private String skillid;
   private int Round;
   private z skill;
   private int skinpath;

   public void setCamp(int var1) {
      this.camp = var1;
   }

   public int getDir() {
      return this.dir;
   }

   public void setSkinpath(int var1) {
      this.skinpath = var1;
   }

   public BattleSkillShow(String var1, int var2) {
      this.skillid = var1;
      this.skinpath = var2;
   }

   public z getSkill() {
      return this.skill;
   }

   public BattleSkillShow(String var1, iO var2) {
      this.skillid = var1;
      this.battleUnit = var2;
   }

   public boolean a(long var1) {
      if (this.shadowMode != null) {
         return this.shadowMode.b(var1 * 2L);
      } else {
         this.dietime = (long)((double)this.dietime + (double)var1 * 1.4D);
         if (this.skill == null) {
            this.skill = dx.q(this.skillid);
         }

         if (this.skill != null) {
            return (boolean)(this.dietime > (long)this.skill.k() ? 5 >> 2 : 0);
         } else {
            return (boolean)(this.dietime > 3000L ? 2 ^ 3 : 0);
         }
      }
   }

   public int getRound() {
      return this.Round;
   }

   public int getCamp() {
      return this.camp;
   }

   public void setRound(int var1) {
      this.Round = var1;
   }

   public void setShadowMode(ShadowMode var1) {
      this.shadowMode = var1;
   }

   public int getSkinpath() {
      return this.skinpath;
   }

   public void setSkillid(String var1) {
      this.skillid = var1;
   }

   public void setBattleUnit(iO var1) {
      this.battleUnit = var1;
   }

   public BattleSkillShow() {
   }

   public long getDietime() {
      return this.dietime;
   }

   public ShadowMode getShadowMode() {
      return this.shadowMode;
   }

   public void setDietime(long var1) {
      this.dietime = var1;
   }

   public void setDir(int var1) {
      this.dir = var1;
   }

   public iO getBattleUnit() {
      return this.battleUnit;
   }

   public String getSkillid() {
      return this.skillid;
   }

   public void setSkill(z var1) {
      this.skill = var1;
   }

   public void b(Graphics var1, int var2, BattleControl var3) {
      if (this.shadowMode != null) {
         this.shadowMode.a(var1, var2, var3);
      } else {
         if (this.skill != null) {
            if (this.skinpath == 0) {
               this.skill.d(this.dietime, this.dir);
               this.skill.aa(var1, this.battleUnit.am, this.battleUnit.ak);
               return;
            }

            int var4;
            int var5;
            if (this.skinpath == (3 & 5)) {
               var4 = var3.gameView.screenData.Screen_x / (5 >> 1);
               var5 = var3.gameView.screenData.Screen_y / (1 ^ 3);
               this.skill.d(this.dietime, this.dir);
               this.skill.aa(var1, var4, var5);
               return;
            }

            if (this.skinpath == --2) {
               var4 = var3.gameView.screenData.Screen_x / --4;
               var5 = var3.gameView.screenData.Screen_y / (5 >> 1);
               if (var2 == this.camp) {
                  var4 = var3.gameView.screenData.Screen_x - var4;
                  var5 = var3.gameView.screenData.Screen_y - var5;
               }

               this.skill.d(this.dietime, this.dir);
               this.skill.aa(var1, var4, var5);
               return;
            }

            if (this.skinpath == --3) {
               var4 = var3.gameView.screenData.Screen_x * --3 / --4;
               var5 = var3.gameView.screenData.Screen_y / (1 ^ 3);
               if (var2 == this.camp) {
                  var4 = var3.gameView.screenData.Screen_x - var4;
                  var5 = var3.gameView.screenData.Screen_y - var5;
               }

               this.skill.d(this.dietime, this.dir);
               this.skill.aa(var1, var4, var5);
               return;
            }

            if (this.skinpath == --5) {
               BattleSkillShow var10000;
               if (this.battleUnit.ap() == this.camp && this.skill.z() == --4) {
                  this.skill.d(this.dietime, this.dir == 0 ? 1 ^ 3 : (this.dir == (2 ^ 3) ? --3 : (this.dir == 5 >> 1 ? 3 ^ 3 : 1)));
                  var10000 = this;
               } else {
                  var10000 = this;
                  this.skill.d(this.dietime, this.dir);
               }

               var10000.skill.aa(var1, this.battleUnit.am, this.battleUnit.ak);
               return;
            }

            if (this.skinpath == (54 & 79)) {
               if (this.dir == --1) {
                  this.skill.d(this.dietime, 2 & 5);
                  this.skill.aa(var1, this.battleUnit.am, this.battleUnit.ak);
                  this.skill.d(this.dietime, 1 ^ 3);
                  this.skill.aa(var1, this.battleUnit.am, this.battleUnit.ak);
                  return;
               }

               this.skill.d(this.dietime, 3 >> 1);
               this.skill.aa(var1, this.battleUnit.am, this.battleUnit.ak);
               this.skill.d(this.dietime, --3);
               this.skill.aa(var1, this.battleUnit.am, this.battleUnit.ak);
            }
         }

      }
   }
}
