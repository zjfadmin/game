package com.xy.readbean;

public class XuanBao {
   private String race;
   private String name;
   private int skillId;
   private int[] yins;
   private int level;
   private int[] resonances;
   private String text;
   private int type;
   private int id;

   public void setName(String var1) {
      this.name = var1;
   }

   public int[] getResonances() {
      return this.resonances;
   }

   public void setLevel(int var1) {
      this.level = var1;
   }

   public String getText() {
      return this.text;
   }

   public void setResonances(int[] var1) {
      this.resonances = var1;
   }

   public int getType() {
      return this.type;
   }

   public String getName() {
      return this.name;
   }

   public void setType(int var1) {
      this.type = var1;
   }

   public void setText(String var1) {
      this.text = var1;
   }

   public int[] getYins() {
      return this.yins;
   }

   public void setId(int var1) {
      this.id = var1;
   }

   public void setYins(int[] var1) {
      this.yins = var1;
   }

   public void setSkillId(int var1) {
      this.skillId = var1;
   }

   public int getSkillId() {
      return this.skillId;
   }

   public void setRace(String var1) {
      this.race = var1;
   }

   public String getRace() {
      return this.race;
   }

   public int getId() {
      return this.id;
   }

   public int getLevel() {
      return this.level;
   }
}
