package com.xy.readbean;

import com.xy.hd;
import com.xy.formula.FormulaNum;

public class MapModel {
   private String mapMusic;
   private int mapPk;
   private int mapLvl;
   private long mapId;
   private String mapDoor;
   private int mapFlag;
   private transient FormulaNum[] npcs;
   private int mapModel;
   private int mapExp;
   private String mapName;
   private String mapMonster;
   private int mapMove;
   private String mapNpc;
   private int mapKf;

   public void setMapMove(int var1) {
      this.mapMove = var1;
   }

   public void setMapName(String var1) {
      this.mapName = var1;
   }

   public String getMapNpc() {
      return this.mapNpc;
   }

   public void setMapModel(int var1) {
      this.mapModel = var1;
   }

   public void setMapMonster(String var1) {
      this.mapMonster = var1;
   }

   public int getMapLvl() {
      return this.mapLvl;
   }

   public int getMapModel() {
      return this.mapModel;
   }

   public void setMapLvl(int var1) {
      this.mapLvl = var1;
   }

   public String getMapMonster() {
      return this.mapMonster;
   }

   public FormulaNum[] getNpcs() {
      if (this.npcs == null && !hd.o(this.mapNpc)) {
         FormulaNum[] var10001 = new FormulaNum[--1 + hd.s("|", this.mapNpc)];
         boolean var10003 = true;
         this.npcs = var10001;
         int var1 = 5 >> 3;
         int var2 = 3 ^ 3;

         int var3;
         for(int var10000 = var3 = 5 >> 3; var10000 != this.mapNpc.length(); var10000 = var3) {
            if ((var3 = this.mapNpc.indexOf("|", var2 + --1)) == -4 >> 2) {
               var3 = this.mapNpc.length();
            }

            this.npcs[var1] = new FormulaNum(this.mapNpc.substring(var2, var3));
            ++var1;
            var2 = var3 + (3 & 5);
         }

         return this.npcs;
      } else {
         return this.npcs;
      }
   }

   public String getMapName() {
      return this.mapName;
   }

   public int getMapExp() {
      return this.mapExp;
   }

   public String getMapDoor() {
      return this.mapDoor;
   }

   public void setMapPk(int var1) {
      this.mapPk = var1;
   }

   public String getMapMusic() {
      return this.mapMusic;
   }

   public void setMapKf(int var1) {
      this.mapKf = var1;
   }

   public int getMapMove() {
      return this.mapMove;
   }

   public void setMapDoor(String var1) {
      this.mapDoor = var1;
   }

   public long getMapId() {
      return this.mapId;
   }

   public void setMapNpc(String var1) {
      this.mapNpc = var1;
   }

   public void setMapMusic(String var1) {
      this.mapMusic = var1;
   }

   public int getMapKf() {
      return this.mapKf;
   }

   public int getMapPk() {
      return this.mapPk;
   }

   public void setMapId(long var1) {
      this.mapId = var1;
   }

   public int getMapFlag() {
      return this.mapFlag;
   }

   public void setMapFlag(int var1) {
      this.mapFlag = var1;
   }

   public void setMapExp(int var1) {
      this.mapExp = var1;
   }
}
