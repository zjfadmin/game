/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.formula.FormulaNum
 *  com.xy.v.IIiiIiiiiIIiI
 */
package com.xy.readbean;

import com.xy.formula.FormulaNum;
import com.xy.v.IIiiIiiiiIIiI;

public class MapModel {
    private int mapExp;
    private String mapMusic;
    private int mapFlag;
    private transient FormulaNum[] npcs;
    private String mapDoor;
    private int mapPk;
    private int mapLvl;
    private int mapKf;
    private String mapNpc;
    private long mapId;
    private int mapMove;
    private String mapName;
    private String mapMonster;
    private int mapModel;

    public String getMapDoor() {
        return this.mapDoor;
    }

    public int getMapKf() {
        return this.mapKf;
    }

    public void setMapDoor(String mapDoor) {
        this.mapDoor = mapDoor;
    }

    public void setMapMonster(String mapMonster) {
        this.mapMonster = mapMonster;
    }

    public String getMapName() {
        return this.mapName;
    }

    public void setMapKf(int mapKf) {
        this.mapKf = mapKf;
    }

    public FormulaNum[] getNpcs() {
        if (this.npcs != null) return this.npcs;
        if (IIiiIiiiiIIiI.iIiIiiiiIIiIi((String)this.mapNpc)) {
            return this.npcs;
        }
        this.npcs = new FormulaNum[1 + IIiiIiiiiIIiI.ALLATORIxDEMO((String)"|", (String)this.mapNpc)];
        int IiiiiiiiIIIII = 0;
        int IiiiiiiiIIIII2 = 0;
        int IiiiiiiiIIIII3 = 0;
        while (IiiiiiiiIIIII3 != this.mapNpc.length()) {
            IiiiiiiiIIIII3 = this.mapNpc.indexOf("|", IiiiiiiiIIIII2 + 1);
            if (IiiiiiiiIIIII3 == -1) {
                IiiiiiiiIIIII3 = this.mapNpc.length();
            }
            this.npcs[IiiiiiiiIIIII] = new FormulaNum(this.mapNpc.substring(IiiiiiiiIIIII2, IiiiiiiiIIIII3));
            ++IiiiiiiiIIIII;
            IiiiiiiiIIIII2 = IiiiiiiiIIIII3 + 1;
        }
        return this.npcs;
    }

    public int getMapMove() {
        return this.mapMove;
    }

    public int getMapPk() {
        return this.mapPk;
    }

    public String getMapMusic() {
        return this.mapMusic;
    }

    public void setMapPk(int mapPk) {
        this.mapPk = mapPk;
    }

    public void setMapMove(int mapMove) {
        this.mapMove = mapMove;
    }

    public long getMapId() {
        return this.mapId;
    }

    public int getMapLvl() {
        return this.mapLvl;
    }

    public void setMapLvl(int mapLvl) {
        this.mapLvl = mapLvl;
    }

    public void setMapExp(int mapExp) {
        this.mapExp = mapExp;
    }

    public int getMapFlag() {
        return this.mapFlag;
    }

    public String getMapNpc() {
        return this.mapNpc;
    }

    public String getMapMonster() {
        return this.mapMonster;
    }

    public void setMapMusic(String mapMusic) {
        this.mapMusic = mapMusic;
    }

    public void setMapNpc(String mapNpc) {
        this.mapNpc = mapNpc;
    }

    public int getMapExp() {
        return this.mapExp;
    }

    public void setMapId(long mapId) {
        this.mapId = mapId;
    }

    public void setMapFlag(int mapFlag) {
        this.mapFlag = mapFlag;
    }

    public void setMapModel(int mapModel) {
        this.mapModel = mapModel;
    }

    public void setMapName(String mapName) {
        this.mapName = mapName;
    }

    public int getMapModel() {
        return this.mapModel;
    }
}
