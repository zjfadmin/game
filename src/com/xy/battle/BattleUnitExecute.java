/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.game.GameMove
 */
package com.xy.battle;

import com.xy.game.GameMove;
import java.awt.Point;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class BattleUnitExecute {
    private BattleUnitExecute execute;
    private boolean playEnd;
    private double playSpeed;
    private Point p2;
    private Point p1;
    private int key;
    private int value;

    public boolean iIiIiiiiIIiii() {
        if (this.p1.x == this.p2.x && this.p1.y == this.p2.y) {
            return true;
        }
        if (this.value < 1000) return false;
        return true;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public boolean ALLATORIxDEMO(BattleUnitExecute execute) {
        if (this.key == 0) {
            if (execute.key == 0) return true;
        }
        if (this.key == 0) return false;
        if (execute.key != 0) return true;
        return false;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getMoveY() {
        if (this.p1.y == this.p2.y) {
            return this.p1.y;
        }
        if (this.key != 2) {
            if (this.key != 4) return GameMove.getmove2((int)this.p1.y, (int)this.p2.y, (long)this.value, (long)1000L);
        }
        if (this.value < 500) return GameMove.getmove2((int)this.p1.y, (int)this.p2.y, (long)this.value, (long)500L);
        return GameMove.getmove2((int)this.p2.y, (int)this.p1.y, (long)(this.value - 500), (long)500L);
    }

    public boolean ALLATORIxDEMO() {
        return this.playEnd;
    }

    public void ALLATORIxDEMO(BattleUnitExecute execute) {
        if (this.execute != null) {
            this.execute.ALLATORIxDEMO(execute);
            return;
        }
        this.execute = execute;
    }

    public void setP2(Point p2) {
        this.p2 = p2;
    }

    public void ALLATORIxDEMO(long value) {
        this.value = (int)((long)this.value + value);
    }

    public void setPlayEnd(boolean playEnd) {
        this.playEnd = playEnd;
    }

    public void setP1(Point p1) {
        this.p1 = p1;
    }

    public int getMoveDir() {
        if (this.key != 2) return GameMove.getDirTwo((int)(this.p2.x - this.p1.x), (int)(this.p2.y - this.p1.y));
        if (this.value < 500) return GameMove.getDirTwo((int)(this.p2.x - this.p1.x), (int)(this.p2.y - this.p1.y));
        return GameMove.getDirTwo((int)(this.p1.x - this.p2.x), (int)(this.p1.y - this.p2.y));
    }

    public BattleUnitExecute(int key, Point p1, Point p2) {
        this.key = key;
        this.p1 = p1;
        this.p2 = p2;
        this.playEnd = true;
    }

    public Point getP2() {
        return this.p2;
    }

    public void setExecute(BattleUnitExecute execute) {
        this.execute = execute;
    }

    public BattleUnitExecute(int key, int value, double playSpeed, boolean playEnd) {
        this.key = key;
        this.value = value;
        this.playSpeed = playSpeed;
        this.playEnd = playEnd;
    }

    public Point getP1() {
        return this.p1;
    }

    public int getMoveX() {
        if (this.p1.x == this.p2.x) {
            return this.p1.x;
        }
        if (this.key != 2) {
            if (this.key != 4) return GameMove.getmove2((int)this.p1.x, (int)this.p2.x, (long)this.value, (long)1000L);
        }
        if (this.value < 500) return GameMove.getmove2((int)this.p1.x, (int)this.p2.x, (long)this.value, (long)500L);
        return GameMove.getmove2((int)this.p2.x, (int)this.p1.x, (long)(this.value - 500), (long)500L);
    }

    public int getValue() {
        return this.value;
    }

    public int getKey() {
        return this.key;
    }

    public void setPlaySpeed(double playSpeed) {
        this.playSpeed = playSpeed;
    }

    public double getPlaySpeed() {
        return this.playSpeed;
    }

    public BattleUnitExecute getExecute() {
        return this.execute;
    }
}
