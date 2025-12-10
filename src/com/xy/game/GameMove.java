/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.battle.ShadowMode
 *  com.xy.bean.PathPoint
 *  com.xy.d.IiIiIiiiiIIiI
 *  com.xy.d.iiiiiiiiiiIiI
 *  com.xy.n.iiIiIiiiiIiii
 */
package com.xy.game;

import com.xy.battle.ShadowMode;
import com.xy.bean.PathPoint;
import com.xy.d.IiIiIiiiiIIiI;
import com.xy.d.iiiiiiiiiiIiI;
import com.xy.n.iiIiIiiiiIiii;
import java.util.List;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class GameMove {
    private boolean isMove;
    public int z1;
    private double sp;
    public int z2;
    private int index;
    public int y1;
    static final char B = '-';
    public int x2;
    public int x1;
    private long time;
    public int y2;
    private long moveTime;
    private boolean flag;
    private String value;
    static final char A = '*';

    public void ALLATORIxDEMO() {
        this.x1 = this.x2;
        this.y1 = this.y2;
        this.z1 = this.z2;
        if (this.value == null) {
            this.isMove = Boolean.FALSE;
            return;
        }
        boolean IiiiiiiiIIIII = Boolean.FALSE;
        boolean IiiiiiiiIIIII2 = Boolean.TRUE;
        int IiiiiiiiIIIII3 = 0;
        while (this.index < this.value.length()) {
            char IiiiiiiiIIIII4 = this.value.charAt(this.index);
            if (IiiiiiiiIIIII4 == '*' || this.index == this.value.length() - 1) {
                if (this.index == this.value.length() - 1) {
                    if (IiiiiiiiIIIII4 != '*') {
                        IiiiiiiiIIIII3 = IiiiiiiiIIIII3 * 10 + (this.value.charAt(this.index) - 48);
                    }
                    this.value = null;
                }
                if (IiiiiiiiIIIII) {
                    int n = this.y2 = IiiiiiiiIIIII2 ? IiiiiiiiIIIII3 : -IiiiiiiiIIIII3;
                    if (this.y2 >= iiIiIiiiiIiii.iiIiiiiiiiIii) {
                        this.z2 = 1;
                        this.y2 &= iiIiIiiiiIiii.iiIiiiiiiiIii;
                    } else {
                        this.z2 = 0;
                    }
                    this.moveTime = GameMove.gettime(this.x2 - this.x1, this.y2 - this.y1, this.sp);
                    this.isMove = Boolean.TRUE;
                    ++this.index;
                    return;
                }
                this.x2 = IiiiiiiiIIIII2 ? IiiiiiiiIIIII3 : -IiiiiiiiIIIII3;
                IiiiiiiiIIIII = Boolean.TRUE;
                IiiiiiiiIIIII3 = 0;
            } else if (IiiiiiiiIIIII4 == '-') {
                IiiiiiiiIIIII2 = Boolean.FALSE;
            } else {
                if (IiiiiiiiIIIII4 < '0' || IiiiiiiiIIIII4 > '9') break;
                IiiiiiiiIIIII3 = IiiiiiiiIIIII3 * 10 + (this.value.charAt(this.index) - 48);
            }
            ++this.index;
        }
        this.isMove = Boolean.FALSE;
        this.value = null;
        this.x2 = this.x1;
        this.y2 = this.y1;
        this.z2 = this.z1;
    }

    public static int getDirTwo(int dx, int dy) {
        int IiiiiiiiIIIII;
        int IiiiiiiiIIIII2;
        int IiiiiiiiIIIII3 = Math.abs(dx);
        int n = IiiiiiiiIIIII3 > 2 * (IiiiiiiiIIIII2 = Math.abs(dy)) ? 1 : (IiiiiiiiIIIII = IiiiiiiiIIIII2 > 2 * IiiiiiiiIIIII3 ? 2 : 0);
        if (dx > 0 && dy > 0) {
            if (IiiiiiiiIIIII == 1) {
                return 1;
            }
            if (IiiiiiiiIIIII != 2) return 3;
            return 5;
        }
        if (dx < 0 && dy < 0) {
            if (IiiiiiiiIIIII == 1) {
                return 5;
            }
            if (IiiiiiiiIIIII != 2) return 7;
            return 1;
        }
        if (dx > 0) {
            if (IiiiiiiiIIIII == 1) {
                return 3;
            }
            if (IiiiiiiiIIIII != 2) return 1;
            return 7;
        }
        if (IiiiiiiiIIIII == 1) {
            return 7;
        }
        if (IiiiiiiiIIIII != 2) return 5;
        return 3;
    }

    public GameMove(double sp) {
        this.sp = sp;
    }

    public boolean iIiIiiiiIIiii() {
        return this.isMove;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void setValue(int index, long time, String value) {
        GameMove gameMove = this;
        synchronized (gameMove) {
            this.time = time;
            this.index = index;
            this.value = value;
            if (value == null) {
                this.ALLATORIxDEMO();
                return;
            }
            this.ALLATORIxDEMO();
            this.ALLATORIxDEMO();
            return;
        }
    }

    public static double getdou(long time, long endtime) {
        double IiiiiiiiIIIII = (double)time / (double)endtime;
        if (!(IiiiiiiiIIIII > 1.0)) return IiiiiiiiIIIII;
        return 1.0;
    }

    public static int getmove2(int s, int e, long time, long endtime) {
        return s + (int)((double)(e - s) * GameMove.getdou(time, endtime));
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void setSp(double sp) {
        GameMove gameMove = this;
        synchronized (gameMove) {
            if (this.sp == sp) {
                return;
            }
            if (this.isMove) {
                this.x1 = GameMove.getmove2(this.x1, this.x2, this.time, this.moveTime);
                this.y1 = GameMove.getmove2(this.y1, this.y2, this.time, this.moveTime);
                this.moveTime -= this.time;
                this.time = 0L;
            }
            this.sp = sp;
            return;
        }
    }

    public String getValue() {
        return this.value;
    }

    public static int getDir(int dx, int dy, int dir) {
        if (dx == 0 && dy == 0) {
            return dir;
        }
        int IiiiiiiiIIIII = Math.abs(dx);
        int IiiiiiiiIIIII2 = Math.abs(dy);
        if (dx == 0) {
            dir = dy < 0 ? 6 : 4;
            return dir;
        }
        if (dy == 0) {
            dir = dx > 0 ? 7 : 5;
            return dir;
        }
        if (IiiiiiiiIIIII > 3 * IiiiiiiiIIIII2) {
            dir = dx > 0 ? 7 : 5;
            return dir;
        }
        if (IiiiiiiiIIIII2 > 3 * IiiiiiiiIIIII) {
            dir = dy > 0 ? 4 : 6;
            return dir;
        }
        if (dx > 0 && dy > 0) {
            dir = 0;
            return dir;
        }
        if (dx > 0 && dy < 0) {
            dir = 3;
            return dir;
        }
        if (dx < 0 && dy < 0) {
            dir = 2;
            return dir;
        }
        if (dx >= 0) return dir;
        if (dy <= 0) return dir;
        dir = 1;
        return dir;
    }

    public static boolean getMovetime(IiIiIiiiiIIiI battleUnit, List<PathPoint> list) {
        if (list == null) return true;
        if (list.size() == 0) {
            return true;
        }
        if (list.size() == 1) {
            battleUnit.iiIiIiiiiIIIi = list.get(0).getX();
            battleUnit.IIiiiiiiiIIIi = list.get(0).getY();
            return true;
        }
        PathPoint IiiiiiiiIIIII = list.get(0);
        PathPoint IiiiiiiiIIIII2 = list.get(1);
        battleUnit.iiIiIiiiiIIIi = GameMove.getmove2(IiiiiiiiIIIII.x, IiiiiiiiIIIII2.x, battleUnit.iiiiIiiiIIiii, 700L);
        battleUnit.IIiiiiiiiIIIi = GameMove.getmove2(IiiiiiiiIIIII.y, IiiiiiiiIIIII2.y, battleUnit.iiiiIiiiIIiii, 700L);
        battleUnit.iiIiiiiiiiIii = GameMove.getDirTwo(IiiiiiiiIIIII2.x - IiiiiiiiIIIII.x, IiiiiiiiIIIII2.y - IiiiiiiiIIIII.y);
        if (battleUnit.iiiiIiiiIIiii < 700L) return false;
        return true;
    }

    public static boolean getMovetime(ShadowMode shadowMode, List<PathPoint> list) {
        if (list == null) return true;
        if (list.size() == 0) {
            return true;
        }
        if (list.size() == 1) {
            shadowMode.setX(list.get(0).getX());
            shadowMode.setY(list.get(0).getY());
            return true;
        }
        PathPoint IiiiiiiiIIIII = list.get(0);
        PathPoint IiiiiiiiIIIII2 = list.get(1);
        shadowMode.setX(GameMove.getmove2(IiiiiiiiIIIII.x, IiiiiiiiIIIII2.x, shadowMode.getTime(), 1000L));
        shadowMode.setY(GameMove.getmove2(IiiiiiiiIIIII.y, IiiiiiiiIIIII2.y, shadowMode.getTime(), 1000L));
        shadowMode.setDir(GameMove.getDirTwo(IiiiiiiiIIIII2.x - IiiiiiiiIIIII.x, IiiiiiiiIIIII2.y - IiiiiiiiIIIII.y));
        if (shadowMode.getTime() < 1000) return false;
        return true;
    }

    public static long gettime(long l, long m, double sp) {
        return (long)(Math.sqrt(l * l + m * m) / sp);
    }

    public boolean ALLATORIxDEMO() {
        return this.flag;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public boolean ALLATORIxDEMO(long addTime, iiiiiiiiiiIiI baseUnit) {
        GameMove gameMove = this;
        synchronized (gameMove) {
            if (!this.isMove) {
                return false;
            }
            this.time += addTime;
            if (this.time < 0L) {
                return this.isMove;
            }
            int IiiiiiiiIIIII = baseUnit.iIiIiiiiIIiii();
            do {
                int n = IiiiiiiiIIIII = baseUnit instanceof IiIiIiiiiIIiI ? GameMove.getDirTwo(this.x2 - this.x1, this.y2 - this.y1) : GameMove.getDir(this.x2 - this.x1, this.y2 - this.y1, IiiiiiiiIIIII);
                if (this.time < this.moveTime) {
                    baseUnit.ALLATORIxDEMO(GameMove.getmove2(this.x1, this.x2, this.time, this.moveTime), GameMove.getmove2(this.y1, this.y2, this.time, this.moveTime), this.z1, IiiiiiiiIIIII);
                    return this.isMove;
                }
                this.time -= this.moveTime;
                this.ALLATORIxDEMO();
            } while (this.isMove);
            baseUnit.ALLATORIxDEMO(this.x1, this.y1, this.z1, IiiiiiiiIIIII);
            return this.isMove;
        }
    }
}
