/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.battle.BattleSkillShow
 *  com.xy.bean.PathPoint
 *  com.xy.d.IiIiIiiiiIIiI
 */
package com.xy.battle;

import com.xy.battle.BattleSkillShow;
import com.xy.bean.PathPoint;
import com.xy.d.IiIiIiiiiIIiI;
import java.util.List;

public class BattlePlayProgress {
    private String data2;
    private BattleSkillShow spell;
    private transient IiIiIiiiiIIiI battleUnit;
    private String addchixu;
    private int mp_Change;
    private int delayTime;
    private String buff;
    private String deletechixu;
    private int zxzt;
    private int Escape;
    private int yq_Change;
    private int dirend;
    private int dir;
    private String data;
    private List<PathPoint> path;
    private int hp_Change;
    private int nq_Change;
    private String Music;
    private String text;
    private int type;

    public void setZxzt(int zxzt) {
        this.zxzt = zxzt;
    }

    public int getMp_Change() {
        return this.mp_Change;
    }

    public void setData2(String data2) {
        this.data2 = data2;
    }

    public void setPath(List<PathPoint> path) {
        this.path = path;
    }

    public void setNq_Change(int nq_Change) {
        this.nq_Change = nq_Change;
    }

    public int getEscape() {
        return this.Escape;
    }

    public String getBuff() {
        return this.buff;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getYq_Change() {
        return this.yq_Change;
    }

    public BattlePlayProgress(IiIiIiiiiIIiI battleUnit) {
        this.battleUnit = battleUnit;
    }

    public int getNq_Change() {
        return this.nq_Change;
    }

    public void setBattleUnit(IiIiIiiiiIIiI battleUnit) {
        this.battleUnit = battleUnit;
    }

    public boolean ALLATORIxDEMO(long pass) {
        if (this.delayTime > 0) {
            this.delayTime = (int)((long)this.delayTime - pass);
        }
        if (this.delayTime <= 0) return false;
        return true;
    }

    public void setDelayTime(int delayTime) {
        this.delayTime = delayTime;
    }

    public void setYq_Change(int yq_Change) {
        this.yq_Change = yq_Change;
    }

    public void setAddchixu(String addchixu) {
        this.addchixu = addchixu;
    }

    public void setEscape(int escape) {
        this.Escape = escape;
    }

    public BattleSkillShow getSpell() {
        return this.spell;
    }

    public List<PathPoint> getPath() {
        return this.path;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getData2() {
        if (this.data2 != null) return this.data2;
        this.data2 = "";
        return this.data2;
    }

    public int getDir() {
        return this.dir;
    }

    public void setBuff(String buff) {
        this.buff = buff;
    }

    public String getAddchixu() {
        return this.addchixu;
    }

    public void setData(String data) {
        this.data = data;
    }

    public IiIiIiiiiIIiI getBattleUnit() {
        return this.battleUnit;
    }

    public int getDelayTime() {
        return this.delayTime;
    }

    public String getMusic() {
        if (this.Music != null) return this.Music;
        return "";
    }

    public String getText() {
        return this.text;
    }

    public void setSpell(BattleSkillShow spell) {
        this.spell = spell;
    }

    public int getType() {
        return this.type;
    }

    public int getHp_Change() {
        return this.hp_Change;
    }

    public void setHp_Change(int hp_Change) {
        this.hp_Change = hp_Change;
    }

    public int getDirend() {
        return this.dirend;
    }

    public void setMusic(String music) {
        this.Music = music;
    }

    public int getZxzt() {
        return this.zxzt;
    }

    public void setDir(int dir) {
        this.dir = dir;
    }

    public void setDeletechixu(String deletechixu) {
        this.deletechixu = deletechixu;
    }

    public String getData() {
        return this.data;
    }

    public void setMp_Change(int mp_Change) {
        this.mp_Change = mp_Change;
    }

    public void setDirend(int dirend) {
        this.dirend = dirend;
    }

    public String getDeletechixu() {
        return this.deletechixu;
    }
}
