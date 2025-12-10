package com.xy.formula;

import com.xy.lg;
import com.xy.readbean.Skill;

public class BaseSkill {
   private BaseQl ql;
   private int lvl;
   private Skill skill;
   private double pz;
   private int skillId;

   public void setPz(double var1) {
      this.pz = var1;
   }

   public void setQl(BaseQl var1) {
      this.ql = var1;
   }

   public void setSkill(Skill var1) {
      this.skill = var1;
   }

   public boolean a() {
      return this.skillId >= (30581 & 8187) && this.skillId <= (32735 & 6049) || this.skillId == (30687 & 8110) || this.skillId == (16275 & 22527) || this.skillId == (6143 & 32660) || this.skillId == (22463 & 16343) || this.skillId == (14287 & 24511) || this.skillId == (14303 & 24496) || this.skillId >= (16239 & 24529) && this.skillId <= (32759 & 8031) || this.skillId >= (16222 & 24575) && this.skillId <= (24437 & 16366) || this.skillId >= (8047 & 32758) && this.skillId <= (8183 & 32623);
   }

   public void setLvl(int var1) {
      this.lvl = var1;
   }

   public BaseQl getQl() {
      return this.ql;
   }

   public int getLvl() {
      return this.lvl;
   }

   public BaseSkill() {
   }

   public Skill getSkill(lg var1) {
      if (this.skill == null) {
         this.skill = var1.bf(String.valueOf(this.skillId));
      }

      return this.skill;
   }

   public int getSkillId() {
      return this.skillId;
   }

   public BaseSkill(int var1, int var2, double var3, Skill var5) {
      this.skillId = var1;
      this.lvl = var2;
      this.pz = var3;
      this.skill = var5;
   }

   public void setSkillId(int var1) {
      this.skillId = var1;
   }

   public BaseSkill(int var1, int var2) {
      this.skillId = var1;
      this.lvl = var2;
   }

   public double getPz() {
      return this.pz;
   }

   public BaseSkill(int var1, int var2, Skill var3, BaseQl var4) {
      this.skillId = var1;
      this.lvl = var2;
      this.skill = var3;
      this.ql = var4;
   }
}
