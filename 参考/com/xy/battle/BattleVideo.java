package com.xy.battle;

import java.util.List;

public class BattleVideo {
   public String tip;
   private int round;
   public int BattleType;
   private List<List<FightingEvents>> lists;
   private List<BattleMan> datas;
   public String buff;

   public List<List<FightingEvents>> getLists() {
      return this.lists;
   }

   public void setTip(String var1) {
      this.tip = var1;
   }

   public String getTip() {
      return this.tip;
   }

   public void setLists(List<List<FightingEvents>> var1) {
      this.lists = var1;
   }

   public List<BattleMan> getDatas() {
      return this.datas;
   }

   public void setBattleType(int var1) {
      this.BattleType = var1;
   }

   public void setRound(int var1) {
      this.round = var1;
   }

   public void setDatas(List<BattleMan> var1) {
      this.datas = var1;
   }

   public int getBattleType() {
      return this.BattleType;
   }

   public String getBuff() {
      return this.buff;
   }

   public int getRound() {
      return this.round;
   }

   public void setBuff(String var1) {
      this.buff = var1;
   }
}
