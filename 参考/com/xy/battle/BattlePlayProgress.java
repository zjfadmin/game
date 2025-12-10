package com.xy.battle;

import com.xy.iO;
import com.xy.bean.PathPoint;
import java.util.List;

public class BattlePlayProgress {
   private int xy_Change;
   private int Escape;
   private int type;
   private int hp_Change;
   private int delayTime;
   private String text;
   private String Music;
   private List<PathPoint> path;
   private BattleSkillShow spell;
   private int mp_Change;
   private String buff;
   private String deletechixu;
   private int yq_Change;
   private String data2;
   private int dir;
   private int dirend;
   private int nq_Change;
   private int zxzt;
   private transient iO battleUnit;
   private String addchixu;
   private String data;

   public void setData(String var1) {
      this.data = var1;
   }

   public void setHp_Change(int var1) {
      this.hp_Change = var1;
   }

   public void setDirend(int var1) {
      this.dirend = var1;
   }

   public void setAddchixu(String var1) {
      this.addchixu = var1;
   }

   public void setYq_Change(int var1) {
      this.yq_Change = var1;
   }

   public BattleSkillShow getSpell() {
      return this.spell;
   }

   public String getDeletechixu() {
      return this.deletechixu;
   }

   public void setXy_Change(int var1) {
      this.xy_Change = var1;
   }

   public void setType(int var1) {
      this.type = var1;
   }

   public int getXy_Change() {
      return this.xy_Change;
   }

   public int getDirend() {
      return this.dirend;
   }

   public int getHp_Change() {
      return this.hp_Change;
   }

   public String getData2() {
      if (this.data2 == null) {
         this.data2 = "";
      }

      return this.data2;
   }

   public int getDir() {
      return this.dir;
   }

   public int getMp_Change() {
      return this.mp_Change;
   }

   public void setDelayTime(int var1) {
      this.delayTime = var1;
   }

   public void setEscape(int var1) {
      this.Escape = var1;
   }

   public String getData() {
      return this.data;
   }

   public void setMp_Change(int var1) {
      this.mp_Change = var1;
   }

   public void setText(String var1) {
      this.text = var1;
   }

   public void setBattleUnit(iO var1) {
      this.battleUnit = var1;
   }

   public void setZxzt(int var1) {
      this.zxzt = var1;
   }

   public String getBuff() {
      return this.buff;
   }

   public void setSpell(BattleSkillShow var1) {
      this.spell = var1;
   }

   public int getZxzt() {
      return this.zxzt;
   }

   public List<PathPoint> getPath() {
      return this.path;
   }

   public void setBuff(String var1) {
      this.buff = var1;
   }

   public void setDeletechixu(String var1) {
      this.deletechixu = var1;
   }

   public String getText() {
      return this.text;
   }

   public void setPath(List<PathPoint> var1) {
      this.path = var1;
   }

   public boolean a(long var1) {
      if (this.delayTime > 0) {
         this.delayTime = (int)((long)this.delayTime - var1);
      }

      return (boolean)(this.delayTime > 0 ? 4 ^ 5 : 0);
   }

   public void setDir(int var1) {
      this.dir = var1;
   }

   public void setData2(String var1) {
      this.data2 = var1;
   }

   public String getMusic() {
      return this.Music == null ? "" : this.Music;
   }

   public BattlePlayProgress(iO var1) {
      this.battleUnit = var1;
   }

   public String getAddchixu() {
      return this.addchixu;
   }

   public int getDelayTime() {
      return this.delayTime;
   }

   public iO getBattleUnit() {
      return this.battleUnit;
   }

   public void setNq_Change(int var1) {
      this.nq_Change = var1;
   }

   public void setMusic(String var1) {
      this.Music = var1;
   }

   public int getYq_Change() {
      return this.yq_Change;
   }

   public int getNq_Change() {
      return this.nq_Change;
   }

   public int getEscape() {
      return this.Escape;
   }

   public int getType() {
      return this.type;
   }
}
