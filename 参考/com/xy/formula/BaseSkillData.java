package com.xy.formula;

import com.xy.readbean.Skill;

public class BaseSkillData {
   private int sld;
   private Skill skill;
   private int sldMax;

   public Skill getSkill() {
      return this.skill;
   }

   public void setSldMax(int var1) {
      this.sldMax = var1;
   }

   public void setSkill(Skill var1) {
      this.skill = var1;
   }

   public void setSld(int var1) {
      this.sld = var1;
   }

   public BaseSkillData(Skill var1) {
      this.skill = var1;
   }

   public int getSldMax() {
      return this.sldMax;
   }

   public int getSld() {
      return this.sld;
   }
}
