/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.battle.BattleControl
 *  com.xy.battle.ShadowMode
 *  com.xy.d.IiIiIiiiiIIiI
 *  com.xy.w.IIIIIiiiIiIii
 *  com.xy.w.iiiiiiiiiiIiI
 */
package com.xy.battle;

import com.xy.battle.BattleControl;
import com.xy.battle.ShadowMode;
import com.xy.d.IiIiIiiiiIIiI;
import com.xy.w.IIIIIiiiIiIii;
import com.xy.w.iiiiiiiiiiIiI;
import java.awt.Graphics;

public class BattleSkillShow {
    private int Round;
    private int dir;
    private String skillid;
    private int skinpath;
    private ShadowMode shadowMode;
    private transient int camp;
    private transient IiIiIiiiiIIiI battleUnit;
    private IIIIIiiiIiIii skill;
    private long dietime;

    public IIIIIiiiIiIii getSkill() {
        return this.skill;
    }

    public void setCamp(int camp) {
        this.camp = camp;
    }

    public void setRound(int round) {
        this.Round = round;
    }

    public String getSkillid() {
        return this.skillid;
    }

    public BattleSkillShow(String skinid, IiIiIiiiiIIiI battleUnit) {
        this.skillid = skinid;
        this.battleUnit = battleUnit;
    }

    public int getCamp() {
        return this.camp;
    }

    /*
     * WARNING - void declaration
     */
    public void ALLATORIxDEMO(Graphics g, int scamp, BattleControl battleControl) {
        if (this.shadowMode != null) {
            this.shadowMode.ALLATORIxDEMO(g, scamp, battleControl);
            return;
        }
        if (this.skill == null) return;
        if (this.skinpath == 0) {
            this.skill.ALLATORIxDEMO(this.dietime, this.dir);
            this.skill.ALLATORIxDEMO(g, this.battleUnit.iiIiiiiiiIIiI, this.battleUnit.iIiiIiiiIiIIi);
            return;
        }
        if (this.skinpath == 1) {
            void IiiiiiiiIIIII;
            int IiiiiiiiIIIII2 = battleControl.gameView.screenData.Screen_x / 2;
            int n = battleControl.gameView.screenData.Screen_y / 2;
            this.skill.ALLATORIxDEMO(this.dietime, this.dir);
            this.skill.ALLATORIxDEMO(g, IiiiiiiiIIIII2, (int)IiiiiiiiIIIII);
            return;
        }
        if (this.skinpath == 2) {
            int IiiiiiiiIIIII = battleControl.gameView.screenData.Screen_x / 4;
            int IiiiiiiiIIIII3 = battleControl.gameView.screenData.Screen_y / 2;
            if (scamp == this.camp) {
                IiiiiiiiIIIII = battleControl.gameView.screenData.Screen_x - IiiiiiiiIIIII;
                IiiiiiiiIIIII3 = battleControl.gameView.screenData.Screen_y - IiiiiiiiIIIII3;
            }
            this.skill.ALLATORIxDEMO(this.dietime, this.dir);
            this.skill.ALLATORIxDEMO(g, IiiiiiiiIIIII, IiiiiiiiIIIII3);
            return;
        }
        if (this.skinpath == 3) {
            int IiiiiiiiIIIII = battleControl.gameView.screenData.Screen_x * 3 / 4;
            int IiiiiiiiIIIII4 = battleControl.gameView.screenData.Screen_y / 2;
            if (scamp == this.camp) {
                IiiiiiiiIIIII = battleControl.gameView.screenData.Screen_x - IiiiiiiiIIIII;
                IiiiiiiiIIIII4 = battleControl.gameView.screenData.Screen_y - IiiiiiiiIIIII4;
            }
            this.skill.ALLATORIxDEMO(this.dietime, this.dir);
            this.skill.ALLATORIxDEMO(g, IiiiiiiiIIIII, IiiiiiiiIIIII4);
            return;
        }
        if (this.skinpath != 5) return;
        if (this.battleUnit.iiiIiiiiiiIIi() == this.camp && this.skill.ALLATORIxDEMO() == 4) {
            this.skill.ALLATORIxDEMO(this.dietime, this.dir == 0 ? 2 : (this.dir == 1 ? 3 : (this.dir == 2 ? 0 : 1)));
        } else {
            this.skill.ALLATORIxDEMO(this.dietime, this.dir);
        }
        this.skill.ALLATORIxDEMO(g, this.battleUnit.iiIiiiiiiIIiI, this.battleUnit.iIiiIiiiIiIIi);
    }

    public void setDietime(long dietime) {
        this.dietime = dietime;
    }

    public void setBattleUnit(IiIiIiiiiIIiI battleUnit) {
        this.battleUnit = battleUnit;
    }

    public void setSkinpath(int skinpath) {
        this.skinpath = skinpath;
    }

    public ShadowMode getShadowMode() {
        return this.shadowMode;
    }

    public long getDietime() {
        return this.dietime;
    }

    public boolean ALLATORIxDEMO(long pass) {
        if (this.shadowMode != null) {
            return this.shadowMode.ALLATORIxDEMO(pass * 2L);
        }
        this.dietime = (long)((double)this.dietime + (double)pass * 1.4);
        if (this.skill == null) {
            this.skill = iiiiiiiiiiIiI.iIiIiiiiIIiii((String)this.skillid);
        }
        if (this.skill != null) {
            if (this.dietime <= (long)this.skill.IIIiiiiiiIIiI()) return false;
            return true;
        }
        if (this.dietime <= 3000L) return false;
        return true;
    }

    public BattleSkillShow(String skillid, int skinpath) {
        this.skillid = skillid;
        this.skinpath = skinpath;
    }

    public IiIiIiiiiIIiI getBattleUnit() {
        return this.battleUnit;
    }

    public void setSkillid(String skillid) {
        this.skillid = skillid;
    }

    public void setShadowMode(ShadowMode shadowMode) {
        this.shadowMode = shadowMode;
    }

    public int getDir() {
        return this.dir;
    }

    public void setSkill(IIIIIiiiIiIii skill) {
        this.skill = skill;
    }

    public int getRound() {
        return this.Round;
    }

    public void setDir(int dir) {
        this.dir = dir;
    }

    public BattleSkillShow() {
    }

    public int getSkinpath() {
        return this.skinpath;
    }
}
