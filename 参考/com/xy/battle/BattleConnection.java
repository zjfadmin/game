package com.xy.battle;

import java.util.List;

public class BattleConnection {
   private List<FightingEvents> playeEvents;
   private int Round;
   private long time;
   private int state;
   public String buff;
   private List<BattleMan> datas;
   private int eventState;
   public int BattleType;
   public String tip;
   public int FightingNumber;

   public void setPlayeEvents(List<FightingEvents> var1) {
      this.playeEvents = var1;
   }

   public long getTime() {
      return this.time;
   }

   public int getFightingNumber() {
      return this.FightingNumber;
   }

   public void setState(int var1) {
      this.state = var1;
   }

   public void setEventState(int var1) {
      this.eventState = var1;
   }

   public List<FightingEvents> getPlayeEvents() {
      return this.playeEvents;
   }

   public void setRound(int var1) {
      this.Round = var1;
   }

   public String getTip() {
      return this.tip;
   }

   public void setBuff(String var1) {
      this.buff = var1;
   }

   public int getState() {
      return this.state;
   }

   public int getRound() {
      return this.Round;
   }

   public void setTime(long var1) {
      this.time = var1;
   }

   public List<BattleMan> getDatas() {
      return this.datas;
   }

   public int getBattleType() {
      return this.BattleType;
   }

   public void setDatas(List<BattleMan> var1) {
      this.datas = var1;
   }

   public void setTip(String var1) {
      this.tip = var1;
   }

   public String getBuff() {
      return this.buff;
   }

   public void setFightingNumber(int var1) {
      this.FightingNumber = var1;
   }

   public void setBattleType(int var1) {
      this.BattleType = var1;
   }

   public int getEventState() {
      return this.eventState;
   }

   public BattlePlay getPlay() {
      BattlePlay var10000 = new BattlePlay((long)this.FightingNumber, this.Round);
      var10000.setRound(this.playeEvents);
      return var10000;
   }
}
