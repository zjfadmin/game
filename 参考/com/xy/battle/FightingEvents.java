package com.xy.battle;

import java.util.List;

public class FightingEvents {
   private String tips;
   private int Fightingsum;
   private List<FightingState> Accepterlist;
   private FightingState Originator;
   private int CurrentRound;

   public void setOriginator(FightingState var1) {
      this.Originator = var1;
   }

   public void setAccepterlist(List<FightingState> var1) {
      this.Accepterlist = var1;
   }

   public void setCurrentRound(int var1) {
      this.CurrentRound = var1;
   }

   public void setFightingsum(int var1) {
      this.Fightingsum = var1;
   }

   public int getCurrentRound() {
      return this.CurrentRound;
   }

   public List<FightingState> getAccepterlist() {
      return this.Accepterlist;
   }

   public FightingState getOriginator() {
      return this.Originator;
   }

   public int getFightingsum() {
      return this.Fightingsum;
   }

   public String getTips() {
      return this.tips;
   }

   public void setTips(String var1) {
      this.tips = var1;
   }
}
