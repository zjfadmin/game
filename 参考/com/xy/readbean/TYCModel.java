package com.xy.readbean;

import com.xy.lg;

public class TYCModel {
   private int key;
   private Skill skill;
   private int lvl;
   private int skillId;
   private int index;
   private int type;

   public void setIndex(int var1) {
      this.index = var1;
   }

   public void setType(int var1) {
      this.type = var1;
   }

   public void setKey(int var1) {
      this.key = var1;
   }

   public void setLvl(int var1) {
      this.lvl = var1;
   }

   public int getIndex() {
      return this.index;
   }

   public int getSkillId() {
      return this.skillId;
   }

   public int getLvl() {
      return this.lvl;
   }

   public String getSkillName(lg var1) {
      this.getSkill(var1);
      return this.skill != null ? this.skill.getSkillname() : "未知技能";
   }

   public void setSkillId(int var1) {
      this.skillId = var1;
   }

   public TYCModel(int var1, int var2, int var3) {
      this.type = var1;
      this.key = var2;
      this.index = var3;
   }

   public boolean a(TYCModel var1) {
      return (boolean)(this.type == var1.getType() && this.key == var1.getKey() && this.lvl == var1.getLvl() ? 3 >> 1 : 0);
   }

   public Skill getSkill(lg var1) {
      if (this.skill == null) {
         this.skill = var1.bf(String.valueOf(this.skillId));
      }

      return this.skill;
   }

   public int getKey() {
      return this.key;
   }

   public int getType() {
      return this.type;
   }
}
