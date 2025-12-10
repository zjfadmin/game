package com.xy.readbean;

import java.util.concurrent.ConcurrentHashMap;

public class AllStarSoul {
   private int skillId;
   private transient double[] ls;
   private ConcurrentHashMap<Integer, StarSoul> starSoulMap;

   public int getSkillId() {
      return this.skillId;
   }

   public void setStarSoulMap(ConcurrentHashMap<Integer, StarSoul> var1) {
      this.starSoulMap = var1;
   }

   public ConcurrentHashMap<Integer, StarSoul> getStarSoulMap() {
      return this.starSoulMap;
   }

   public double[] getLs() {
      return this.ls;
   }

   public void setSkillId(int var1) {
      this.skillId = var1;
   }

   public void setLs(double[] var1) {
      this.ls = var1;
   }
}
