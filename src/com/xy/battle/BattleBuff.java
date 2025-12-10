/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.battle.BattleControl
 *  com.xy.text.ScreenData
 *  com.xy.v.iIiIIiiiIiiiI
 *  com.xy.w.IIIIIiiiIiIii
 *  com.xy.w.IIiIiiiiIiiIi
 *  com.xy.w.iiiiiiiiiiIiI
 */
package com.xy.battle;

import com.xy.battle.BattleControl;
import com.xy.text.ScreenData;
import com.xy.v.iIiIIiiiIiiiI;
import com.xy.w.IIIIIiiiIiIii;
import com.xy.w.IIiIiiiiIiiIi;
import com.xy.w.iiiiiiiiiiIiI;
import java.awt.Graphics;

public class BattleBuff {
    private boolean isv;
    private long time;
    private int xy;
    private IIIIIiiiIiIii sprite;
    private String skin;
    private String type;
    private int camp;
    private int id;

    public int getCamp() {
        return this.camp;
    }

    public void setCamp(int camp) {
        this.camp = camp;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public boolean ALLATORIxDEMO() {
        return this.isv;
    }

    public int getId() {
        return this.id;
    }

    public void setIsv(boolean isv) {
        this.isv = isv;
    }

    public void setSkin(String skin) {
        this.skin = skin;
    }

    public BattleBuff(String[] v) {
        this.id = Integer.parseInt(v[1]);
        this.camp = Integer.parseInt(v[2]);
        this.skin = this.type = v[3];
        this.time = iIiIIiiiIiiiI.ALLATORIxDEMO();
    }

    public BattleBuff(String type, String skin, int camp) {
        this.type = type;
        this.skin = skin;
        this.camp = camp;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setXy(int xy) {
        this.xy = xy;
    }

    public void ALLATORIxDEMO(Graphics g, long time, int x, int y) {
        if (this.sprite == null) {
            this.sprite = iiiiiiiiiiIiI.iIiIiiiiIIiii((String)this.getSkin());
        }
        if (this.sprite == null) return;
        this.sprite.ALLATORIxDEMO(time, 0);
        this.sprite.ALLATORIxDEMO(g, x, y);
    }

    public String getType() {
        return this.type;
    }

    public long getTime() {
        return this.time;
    }

    public void setId(int id) {
        this.id = id;
    }

    private /* synthetic */ String getSkin() {
        return IIiIiiiiIiiIi.iIiIiiiiIIiIi((String)this.skin);
    }

    public void ALLATORIxDEMO(Graphics g, int camp, BattleControl battleControl) {
        if (!this.isv) {
            return;
        }
        if (this.sprite == null) {
            this.sprite = iiiiiiiiiiIiI.iIiIiiiiIIiii((String)this.getSkin());
        }
        if (this.sprite == null) {
            return;
        }
        this.sprite.ALLATORIxDEMO(iIiIIiiiIiiiI.ALLATORIxDEMO() - this.time, 0);
        ScreenData IiiiiiiiIIIII = battleControl.gameView.screenData;
        if (this.camp == camp) {
            if (this.xy == 1) {
                this.sprite.ALLATORIxDEMO(g, IiiiiiiiIIIII.Screen_x / 2, IiiiiiiiIIIII.Screen_y / 2);
                return;
            }
            if (this.xy == 2) {
                this.sprite.ALLATORIxDEMO(g, IiiiiiiiIIIII.Screen_x - 230, IiiiiiiiIIIII.Screen_y - 80);
                return;
            }
            if (this.xy == 3) {
                this.sprite.ALLATORIxDEMO(g, 50, IiiiiiiiIIIII.Screen_y * 2 / 5);
                return;
            }
            if (this.xy == 4) {
                this.sprite.ALLATORIxDEMO(g, IiiiiiiiIIIII.Screen_x - 30, IiiiiiiiIIIII.Screen_y * 3 / 5);
                return;
            }
            if (this.xy == 5) {
                this.sprite.ALLATORIxDEMO(g, IiiiiiiiIIIII.Screen_x - 50, IiiiiiiiIIIII.Screen_y * 4 / 5);
                return;
            }
            if (this.xy == 6) {
                this.sprite.ALLATORIxDEMO(g, 90, IiiiiiiiIIIII.Screen_y * 2 / 5);
                return;
            }
            if (this.xy != 7) return;
            if (IiiiiiiiIIIII.Screen_x <= 1024 && IiiiiiiiIIIII.Screen_y <= 700) {
                this.sprite.ALLATORIxDEMO(g, IiiiiiiiIIIII.Screen_x * 3 / 4, IiiiiiiiIIIII.Screen_y / 2 - 35);
                return;
            }
            int IiiiiiiiIIIII2 = Math.max(0, (battleControl.gameView.screenData.Screen_x - 1024) / 2);
            int IiiiiiiiIIIII3 = Math.max(0, (battleControl.gameView.screenData.Screen_y - 700) / 2);
            this.sprite.ALLATORIxDEMO(g, IiiiiiiiIIIII2 += IiiiiiiiIIIII.Screen_x > 1024 ? 768 : IiiiiiiiIIIII.Screen_x * 3 / 4, (IiiiiiiiIIIII3 += IiiiiiiiIIIII.Screen_y > 700 ? 350 : IiiiiiiiIIIII.Screen_y / 2) - 70);
            return;
        }
        if (this.xy == 1) {
            this.sprite.ALLATORIxDEMO(g, IiiiiiiiIIIII.Screen_x / 2, IiiiiiiiIIIII.Screen_y / 2);
            return;
        }
        if (this.xy == 2) {
            this.sprite.ALLATORIxDEMO(g, 100, 360);
            return;
        }
        if (this.xy == 3) {
            this.sprite.ALLATORIxDEMO(g, IiiiiiiiIIIII.Screen_x - 70, IiiiiiiiIIIII.Screen_y * 4 / 5);
            return;
        }
        if (this.xy == 4) {
            this.sprite.ALLATORIxDEMO(g, 160, IiiiiiiiIIIII.Screen_y * 3 / 10);
            return;
        }
        if (this.xy == 5) {
            this.sprite.ALLATORIxDEMO(g, 120, IiiiiiiiIIIII.Screen_y * 2 / 5);
            return;
        }
        if (this.xy == 6) {
            this.sprite.ALLATORIxDEMO(g, IiiiiiiiIIIII.Screen_x - 90, IiiiiiiiIIIII.Screen_y * 4 / 5);
            return;
        }
        if (this.xy != 7) return;
        if (IiiiiiiiIIIII.Screen_x <= 1024 && IiiiiiiiIIIII.Screen_y <= 700) {
            this.sprite.ALLATORIxDEMO(g, IiiiiiiiIIIII.Screen_x / 4, IiiiiiiiIIIII.Screen_y / 2 - 35);
            return;
        }
        int IiiiiiiiIIIII4 = Math.max(0, (battleControl.gameView.screenData.Screen_x - 1024) / 2);
        int IiiiiiiiIIIII5 = Math.max(0, (battleControl.gameView.screenData.Screen_y - 700) / 2);
        this.sprite.ALLATORIxDEMO(g, IiiiiiiiIIIII4 += IiiiiiiiIIIII.Screen_x > 1024 ? 256 : IiiiiiiiIIIII.Screen_x / 4, (IiiiiiiiIIIII5 += IiiiiiiiIIIII.Screen_y > 700 ? 350 : IiiiiiiiIIIII.Screen_y / 2) - 70);
    }

    public int getXy() {
        return this.xy;
    }
}
