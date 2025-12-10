package com.xy.battle;

import java.util.ArrayList;
import java.util.List;

public class FightingRound {
   private int Fightingsumber;
   private int CurrentRound;
   private List<FightingEvents> Round = new ArrayList();

   public void setCurrentRound(int var1) {
      this.CurrentRound = var1;
   }

   public List<FightingEvents> getRound() {
      return this.Round;
   }

   public void setRound(List<FightingEvents> var1) {
      this.Round = var1;
   }

   public void setFightingsumber(int var1) {
      this.Fightingsumber = var1;
   }

   public int getCurrentRound() {
      return this.CurrentRound;
   }

   public int getFightingsumber() {
      return this.Fightingsumber;
   }
}
