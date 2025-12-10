/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.text.GameView
 *  com.xy.v.iIiIIiiiIiiiI
 *  com.xy.w.IIIIIiiiIiiII
 */
package com.xy.scene;

import com.xy.q.iiIIiiiiIiiII;
import com.xy.text.GameView;
import com.xy.v.iIiIIiiiIiiiI;
import com.xy.w.IIIIIiiiIiiII;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

public class CountDown {
    private long time;
    private long endTime;
    private String msg;
    private Image image;
    private String name;
    private int id;
    private int type;

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }

    public void setId(int id) {
        this.id = id;
    }

    public CountDown(int type, long endTime) {
        this.type = type;
        this.endTime = endTime;
        if (type == 0) {
            this.image = IIIIIiiiIiiII.iiiIiiiiiiIIi((String)"sc/c/69");
        } else if (type == 1) {
            this.image = IIIIIiiiIiiII.iiiIiiiiiiIIi((String)"sc/c/70");
        }
        this.msg = "";
    }

    public void ALLATORIxDEMO(Graphics g, GameView gameView) {
        long IiiiiiiiIIIII = this.endTime - iIiIIiiiIiiiI.ALLATORIxDEMO();
        if (IiiiiiiiIIIII <= 0L) return;
        g.drawImage(this.image, 0, gameView.screenData.Screen_y - 130, null);
        if (this.time != (IiiiiiiiIIIII /= 1000L)) {
            this.time = IiiiiiiiIIIII;
            this.msg = String.valueOf(IiiiiiiiIIIII / 60L) + ":" + IiiiiiiiIIIII % 60L;
        }
        g.setColor(Color.YELLOW);
        g.setFont(iiIIiiiiIiiII.iiIiIiiiiIIii);
        if (this.name != null) {
            g.drawString(this.name, 30, gameView.screenData.Screen_y - 100);
        }
        g.drawString(this.msg, 30, gameView.screenData.Screen_y - 65);
    }

    public int getType() {
        return this.type;
    }

    public int getId() {
        return this.id;
    }

    public CountDown(int id, String name, long endTime) {
        this.id = id;
        this.name = name;
        this.type = 2;
        this.image = IIIIIiiiIiiII.iiiIiiiiiiIIi((String)"sc/c/71");
        this.endTime = endTime;
        this.msg = "";
    }

    public long getEndTime() {
        return this.endTime;
    }

    public void setType(int type) {
        this.type = type;
    }

    public void ALLATORIxDEMO(StringBuffer buffer) {
        buffer.append(this.type);
        buffer.append("$");
        buffer.append(this.endTime);
    }
}
