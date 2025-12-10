package com.xy.battle;

import java.math.BigDecimal;

public class FightingState {
   private String state_2;
   private int Camp;
   private String state_1;
   private String buff;
   private String proces;
   private String up;
   private String skin;
   private String msg;
   private BattleMan data;
   private Integer delayTime;
   private BigDecimal mp_c;
   private String text;
   private BigDecimal xy_c;
   private String endState;
   private BigDecimal nq_c;
   private BigDecimal yq_c;
   private String skillskin;
   private String StartState;
   private BigDecimal hp_c;
   private String skillsy;
   private int man;

   public String getEndState_1() {
      return this.state_1;
   }

   public String getProcessState() {
      return this.proces;
   }

   public void setXy_c(int var1) {
      if (this.xy_c == null) {
         this.xy_c = new BigDecimal(var1);
      } else {
         this.xy_c = new BigDecimal(this.xy_c.intValue() + var1);
      }
   }

   public void setStartState(String var1) {
      this.StartState = var1;
   }

   public int getCamp() {
      return this.Camp;
   }

   public void setEndState(String var1) {
      this.endState = var1;
   }

   public void setCamp(int var1) {
      this.Camp = var1;
   }

   public String getBuff() {
      return this.buff;
   }

   public void setSkillsy(String var1) {
      this.skillsy = var1;
   }

   public void setBuff(String var1) {
      this.buff = var1;
   }

   public BigDecimal getYq_c() {
      return this.yq_c;
   }

   public void setMan(int var1) {
      this.man = var1;
   }

   public String getEndState_2() {
      return this.state_2;
   }

   public void setFightingManData(BattleMan var1) {
      this.data = var1;
   }

   public String getSkin() {
      return this.skin;
   }

   public String getEndState() {
      return this.endState;
   }

   public BigDecimal getXy_c() {
      return this.xy_c;
   }

   public String getStartState() {
      if (this.StartState == null || this.StartState.equals("")) {
         this.StartState = "代价";
      }

      return this.StartState;
   }

   public BigDecimal getHp_Change() {
      return this.hp_c;
   }

   public String getSkillskin() {
      return this.skillskin;
   }

   public String getMsg() {
      return this.msg;
   }

   public FightingState(int var1, int var2, String var3) {
      this.Camp = var1;
      this.man = var2;
      this.StartState = var3;
   }

   public void setHp_Change(int var1) {
      if (this.hp_c == null) {
         this.hp_c = new BigDecimal(var1);
      } else {
         this.hp_c = new BigDecimal(this.hp_c.intValue() + var1);
      }
   }

   public int getMan() {
      return this.man;
   }

   public void setYq_c(int var1) {
      if (this.yq_c == null) {
         this.yq_c = new BigDecimal(var1);
      } else {
         this.yq_c = new BigDecimal(this.yq_c.intValue() + var1);
      }
   }

   public String getUp() {
      return this.up;
   }

   public BattleMan getFightingManData() {
      return this.data;
   }

   public void setSkillskin(String var1) {
      this.skillskin = var1;
   }

   public void setUp(String var1) {
      this.up = var1;
   }

   public void setSkin(String var1) {
      this.skin = var1;
   }

   public void setEndState_2(String var1) {
      this.state_2 = var1;
   }

   public void setNq_c(int var1) {
      if (this.nq_c == null) {
         this.nq_c = new BigDecimal(var1);
      } else {
         this.nq_c = new BigDecimal(this.nq_c.intValue() + var1);
      }
   }

   public void setDelayTime(Integer var1) {
      this.delayTime = var1;
   }

   public void setText(String var1) {
      this.text = var1;
   }

   public void setEndState_1(String var1) {
      this.state_1 = var1;
   }

   public FightingState() {
   }

   public String getText() {
      return this.text;
   }

   public Integer getDelayTime() {
      return this.delayTime;
   }

   public BigDecimal getMp_Change() {
      return this.mp_c;
   }

   public void setMp_Change(int var1) {
      if (this.mp_c == null) {
         this.mp_c = new BigDecimal(var1);
      } else {
         this.mp_c = new BigDecimal(this.mp_c.intValue() + var1);
      }
   }

   public void setProcessState(String var1) {
      this.proces = var1;
   }

   public BigDecimal getNq_c() {
      return this.nq_c;
   }

   public String getSkillsy() {
      return this.skillsy;
   }
}
