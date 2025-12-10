/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.battle.BattleControl
 *  com.xy.battle.BattleHandle
 *  com.xy.bean.PathPoint
 *  com.xy.d.IiIiIiiiiIIiI
 *  com.xy.game.GameMove
 *  com.xy.w.IiiiIiiiiIiIi
 */
package com.xy.battle;

import com.xy.battle.BattleControl;
import com.xy.battle.BattleHandle;
import com.xy.bean.PathPoint;
import com.xy.d.IiIiIiiiiIIiI;
import com.xy.game.GameMove;
import com.xy.w.IiiiIiiiiIiIi;
import java.awt.Graphics;
import java.util.List;

public class ShadowMode {
    private List<PathPoint> paths;
    private int y;
    private IiiiIiiiiIiIi part;
    private IiIiIiiiiIIiI battleUnit;
    private int dir;
    private int time;
    private int x;

    public void ALLATORIxDEMO(Graphics g, int scamp, BattleControl battleControl) {
        int IiiiiiiiIIIII;
        double d;
        int IiiiiiiiIIIII2;
        int IiiiiiiiIIIII3;
        int IiiiiiiiIIIII4 = this.battleUnit.ALLATORIxDEMO().getCamp() == 999 ? this.battleUnit.ALLATORIxDEMO().getCampId() & 3 : this.battleUnit.ALLATORIxDEMO().getCamp();
        double IiiiiiiiIIIII5 = (double)battleControl.gameView.screenData.Screen_x / 1024.0;
        double IiiiiiiiIIIII6 = (double)battleControl.gameView.screenData.Screen_y / 700.0;
        int IiiiiiiiIIIII7 = Math.max(0, (battleControl.gameView.screenData.Screen_x - 1024) / 2);
        int IiiiiiiiIIIII8 = Math.max(0, (battleControl.gameView.screenData.Screen_y - 700) / 2);
        if (IiiiiiiiIIIII4 != scamp) {
            IiiiiiiiIIIII3 = this.x;
            IiiiiiiiIIIII2 = this.y;
            int n = this.dir;
            d = IiiiiiiiIIIII5;
        } else {
            IiiiiiiiIIIII3 = 1024 - this.x;
            IiiiiiiiIIIII2 = 700 - this.y;
            IiiiiiiiIIIII = BattleHandle.getdir((int)this.dir);
            d = IiiiiiiiIIIII5;
        }
        if (d < 1.0) {
            IiiiiiiiIIIII3 = (int)((double)IiiiiiiiIIIII3 * IiiiiiiiIIIII5);
        }
        if (IiiiiiiiIIIII6 < 1.0) {
            IiiiiiiiIIIII2 = (int)((double)IiiiiiiiIIIII2 * IiiiiiiiIIIII6);
        }
        this.part.ALLATORIxDEMO(g, IiiiiiiiIIIII3 += IiiiiiiiIIIII7, IiiiiiiiIIIII2 += IiiiiiiiIIIII8, IiiiiiiiIIIII, (long)this.time, 1.0f);
    }

    public void setPart(IiiiIiiiiIiIi part) {
        this.part = part;
    }

    public void setPaths(List<PathPoint> paths) {
        this.paths = paths;
    }

    public int getX() {
        return this.x;
    }

    public ShadowMode(IiiiIiiiiIiIi part, int x, int y, List<PathPoint> paths, int dir, IiIiIiiiiIIiI battleUnit) {
        this.part = part;
        this.x = x;
        this.y = y;
        this.paths = paths;
        this.dir = dir;
        this.battleUnit = battleUnit;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public void setY(int y) {
        this.y = y;
    }

    public IiiiIiiiiIiIi getPart() {
        return this.part;
    }

    public int getTime() {
        return this.time;
    }

    public boolean ALLATORIxDEMO(long time) {
        this.time = (int)((long)this.time + time);
        if (this.paths != null) {
            return GameMove.getMovetime((ShadowMode)this, this.paths);
        }
        if (this.time < this.part.iIiIiiiiIIiii()) return false;
        this.time = this.part.iIiIiiiiIIiii();
        return true;
    }

    public void setX(int x) {
        this.x = x;
    }

    public List<PathPoint> getPaths() {
        return this.paths;
    }

    public int getY() {
        return this.y;
    }

    public int getDir() {
        return this.dir;
    }

    public void setDir(int dir) {
        this.dir = dir;
    }
}
