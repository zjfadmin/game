package com.xy.battle;

import java.util.List;

public class BattlePlay {
   private int battleRound;
   private int Progress;
   private List<FightingEvents> Round;
   private List<BattlePlayProgress> State;
   private long battleId;

   public BattlePlay() {
      int var10001 = 5 >> 3;
      super();
      this.Progress = var10001;
   }

   public int getProgress() {
      return this.Progress;
   }

   public void setState(List<BattlePlayProgress> var1) {
      this.State = var1;
   }

   public BattlePlay(long var1, int var3) {
      int var10005 = 3 & 4;
      super();
      this.Progress = var10005;
      this.battleId = var1;
      this.battleRound = var3;
   }

   public void setRound(List<FightingEvents> var1) {
      this.Round = var1;
   }

   public boolean a() {
      return (boolean)(this.Progress < this.Round.size() ? 2 ^ 3 : 0);
   }

   public List<FightingEvents> getRound() {
      return this.Round;
   }

   public void setProgress(int var1) {
      this.Progress = var1;
   }

   public FightingEvents getEvents() {
      return (FightingEvents)this.Round.get(this.Progress);
   }

   public List<BattlePlayProgress> getState() {
      return this.State;
   }
}
