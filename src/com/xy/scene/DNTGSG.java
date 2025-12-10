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

public class DNTGSG {
    private int value1;
    private String msg0 = "";
    private String msg1 = "";
    private String msg = "";
    private Image image = IIIIIiiiIiiII.iiiIiiiiiiIIi((String)"sc/c/78");
    private long endTime;
    private int value0;
    private int length0 = 0;
    private Image image2 = IIIIIiiiIiiII.iiiIiiiiiiIIi((String)"sc/c/79");
    private long time;
    private int max;
    private int length1 = 0;

    public DNTGSG() {
        this.endTime = System.currentTimeMillis() + 1800000L;
    }

    public void ALLATORIxDEMO(String msg) {
        String[] stringArray = msg.split("&");
        this.endTime = Long.parseLong(stringArray[0]);
        this.max = Integer.parseInt(stringArray[1]);
        this.ALLATORIxDEMO(0, this.value0);
        this.ALLATORIxDEMO(1, this.value1);
    }

    public void ALLATORIxDEMO(Graphics g, GameView gameView) {
        long IiiiiiiiIIIII = this.endTime - iIiIIiiiIiiiI.ALLATORIxDEMO();
        if (IiiiiiiiIIIII <= 0L) return;
        int IiiiiiiiIIIII2 = (gameView.screenData.Screen_x - this.image.getWidth(null)) / 2;
        g.drawImage(this.image, IiiiiiiiIIIII2, 50, null);
        if (this.time != (IiiiiiiiIIIII /= 1000L)) {
            this.time = IiiiiiiiIIIII;
            this.msg = String.valueOf(IiiiiiiiIIIII / 60L) + ":" + IiiiiiiiIIIII % 60L;
        }
        g.setColor(Color.RED);
        g.setFont(iiIIiiiiIiiII.iIiIiiiiIiIii);
        g.drawString(this.msg, IiiiiiiiIIIII2 + 5, 80);
        g.setColor(Color.white);
        g.setFont(iiIIiiiiIiiII.iiIiiiiiiIIiI);
        g.drawString(this.msg0, IiiiiiiiIIIII2 + 160, 68);
        g.drawImage(this.image2, IiiiiiiiIIIII2 + 100, 68, this.length0, 2, null);
        g.drawString(this.msg1, IiiiiiiiIIIII2 + 160, 87);
        g.drawImage(this.image2, IiiiiiiiIIIII2 + 100, 87, this.length1, 2, null);
    }

    public void ALLATORIxDEMO(int camp, int value) {
        if (camp == 0) {
            this.value0 = value;
            this.length0 = this.image2.getWidth(null) * value / this.max;
            this.msg0 = String.valueOf(value) + "/" + this.max;
            return;
        }
        this.value1 = value;
        this.length1 = this.image2.getWidth(null) * value / this.max;
        this.msg1 = String.valueOf(value) + "/" + this.max;
    }
}
