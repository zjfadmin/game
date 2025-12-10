/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.scene.DNTGNVRole
 *  com.xy.text.GameView
 *  com.xy.w.IIIIIiiiIiiII
 */
package com.xy.scene;

import com.xy.q.iiIIiiiiIiiII;
import com.xy.scene.DNTGNVRole;
import com.xy.text.GameView;
import com.xy.w.IIIIIiiiIiiII;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

public class DNTGNV {
    private int num = 0;
    private String msg2 = "";
    private DNTGNVRole[] TTNV = new DNTGNVRole[5];
    private int ci = 0;
    private DNTGNVRole[] HGSNV = new DNTGNVRole[5];
    private String msg1 = "";
    private Image image = IIIIIiiiIiiII.iiiIiiiiiiIIi((String)"sc/c/77");

    public int getCi() {
        return this.ci;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public DNTGNVRole[] getTTNV() {
        return this.TTNV;
    }

    public int getNum() {
        return this.num;
    }

    /*
     * WARNING - void declaration
     */
    public void ALLATORIxDEMO(Graphics graphics, GameView gameView) {
        DNTGNVRole IiiiiiiiIIIII;
        void g;
        void gameView2;
        int IiiiiiiiIIIII2 = gameView2.screenData.Screen_x - this.image.getWidth(null);
        graphics.drawImage(this.image, IiiiiiiiIIIII2, 130, null);
        g.setColor(Color.white);
        g.setFont(iiIIiiiiIiiII.iIIiiiiiiIIII);
        g.drawString(this.msg1, IiiiiiiiIIIII2 += 40, 230);
        g.drawString(this.msg2, IiiiiiiiIIIII2 + 108, 230);
        int IiiiiiiiIIIII3 = 0;
        while (IiiiiiiiIIIII3 < this.TTNV.length) {
            IiiiiiiiIIIII = this.TTNV[IiiiiiiiIIIII3];
            if (IiiiiiiiIIIII == null) break;
            g.drawString(IiiiiiiiIIIII.getName(), IiiiiiiiIIIII2, 258 + 21 * IiiiiiiiIIIII3);
            g.drawString(IiiiiiiiIIIII.getSize(), IiiiiiiiIIIII2 + 108, 258 + 21 * IiiiiiiiIIIII3++);
        }
        IiiiiiiiIIIII3 = 0;
        while (IiiiiiiiIIIII3 < this.HGSNV.length) {
            IiiiiiiiIIIII = this.HGSNV[IiiiiiiiIIIII3];
            if (IiiiiiiiIIIII == null) {
                return;
            }
            g.drawString(IiiiiiiiIIIII.getName(), IiiiiiiiIIIII2, 381 + 21 * IiiiiiiiIIIII3);
            g.drawString(IiiiiiiiIIIII.getSize(), IiiiiiiiIIIII2 + 108, 381 + 21 * IiiiiiiiIIIII3++);
        }
    }

    public DNTGNVRole[] getHGSNV() {
        return this.HGSNV;
    }

    public void setTTNV(DNTGNVRole[] tTNV) {
        this.TTNV = tTNV;
    }

    public void ALLATORIxDEMO(int camp, String msg) {
        DNTGNVRole[] IiiiiiiiIIIII = camp == 0 ? this.TTNV : this.HGSNV;
        String[] IiiiiiiiIIIII2 = msg.split("&");
        int IiiiiiiiIIIII3 = 0;
        while (IiiiiiiiIIIII3 < IiiiiiiiIIIII2.length && IiiiiiiiIIIII3 < 5) {
            String[] IiiiiiiiIIIII4 = IiiiiiiiIIIII2[IiiiiiiiIIIII3].split("\\$");
            if (IiiiiiiiIIIII[IiiiiiiiIIIII3] == null) {
                IiiiiiiiIIIII[IiiiiiiiIIIII3] = new DNTGNVRole(IiiiiiiiIIIII4[0], IiiiiiiiIIIII4[1]);
            } else {
                IiiiiiiiIIIII[IiiiiiiiIIIII3].ALLATORIxDEMO(IiiiiiiiIIIII4[0], IiiiiiiiIIIII4[1]);
            }
            ++IiiiiiiiIIIII3;
        }
        IiiiiiiiIIIII3 = IiiiiiiiIIIII2.length;
        while (IiiiiiiiIIIII3 < 5) {
            IiiiiiiiIIIII[IiiiiiiiIIIII3++] = null;
        }
    }

    public void setHGSNV(DNTGNVRole[] hGSNV) {
        this.HGSNV = hGSNV;
    }

    public Image getImage() {
        return this.image;
    }

    public void setCi(int ci) {
        this.ci = ci;
    }

    public void ALLATORIxDEMO(int camp, int num, int ci) {
        this.num = num;
        this.ci = ci;
        if (ci == 0) {
            this.msg1 = camp == 0 ? "\u5929\u5ead" : "\u82b1\u679c\u5c71";
        } else {
            String string;
            StringBuilder stringBuilder;
            if (camp == 0) {
                stringBuilder = new StringBuilder("\u5929\u5ead   \u7b2c");
                string = stringBuilder.append(ci).append("\u540d").toString();
            } else {
                stringBuilder = new StringBuilder("\u82b1\u679c\u5c71   \u7b2c");
                string = stringBuilder.append(ci).append("\u540d").toString();
            }
            this.msg1 = string;
        }
        this.msg2 = String.valueOf(num);
    }

    public void setNum(int num) {
        this.num = num;
    }
}
