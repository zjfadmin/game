/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.richtext.RichLabel
 *  com.xy.scene.BangFightScene
 *  com.xy.text.ScreenData
 *  com.xy.v.IiiiIiiiiIIII
 *  com.xy.w.IIIIIiiiIiIii
 *  com.xy.w.IIIIIiiiIiiII
 *  com.xy.w.IIiIiiiiIiiIi
 *  com.xy.w.iiiiiiiiiiIiI
 */
package com.xy.scene;

import com.xy.q.iiIIiiiiIiiII;
import com.xy.richtext.RichLabel;
import com.xy.scene.BangFightScene;
import com.xy.text.ScreenData;
import com.xy.v.IiiiIiiiiIIII;
import com.xy.w.IIIIIiiiIiIii;
import com.xy.w.IIIIIiiiIiiII;
import com.xy.w.IIiIiiiiIiiIi;
import com.xy.w.iiiiiiiiiiIiI;
import java.awt.Graphics;
import java.awt.Image;

public class BangTZ {
    private RichLabel Z_N;
    private Image Z_Z;
    private Image[] Z_FS;
    private int time;
    private RichLabel Y_N;
    private RichLabel Y_V;
    private IIIIIiiiIiIii TZ;
    private Image Y_Z;
    private Image head1;
    private RichLabel Z_V;
    private Image head2;
    private Image kuan;
    private Image[] Y_FS;

    public boolean ALLATORIxDEMO(Graphics g, BangFightScene scene) {
        int IiiiiiiiIIIII;
        ScreenData IiiiiiiiIIIII2 = scene.getGameView().screenData;
        this.time += 13;
        g.drawImage(this.kuan, IiiiiiiiIIIII2.Screen_x - 384, 107, 260, 150, null);
        g.drawImage(this.kuan, 54, IiiiiiiiIIIII2.Screen_y - 310, 260, 150, null);
        int IiiiiiiiIIIII3 = IiiiiiiiIIIII2.Screen_x - 370;
        int IiiiiiiiIIIII4 = 140;
        g.translate(IiiiiiiiIIIII3, IiiiiiiiIIIII4);
        this.Z_N.paint(g);
        int n = -IiiiiiiiIIIII3;
        g.translate(n, -IiiiiiiiIIIII4);
        g.translate(IiiiiiiiIIIII3 += 120, IiiiiiiiIIIII4);
        this.Z_V.paint(g);
        g.translate(-IiiiiiiiIIIII3, -IiiiiiiiIIIII4);
        IiiiiiiiIIIII3 = 68;
        IiiiiiiiIIIII4 = IiiiiiiiIIIII2.Screen_y - 277;
        g.translate(IiiiiiiiIIIII3, IiiiiiiiIIIII4);
        this.Y_N.paint(g);
        int n2 = -IiiiiiiiIIIII3;
        g.translate(n2, -IiiiiiiiIIIII4);
        g.translate(IiiiiiiiIIIII3 += 120, IiiiiiiiIIIII4);
        this.Y_V.paint(g);
        g.translate(-IiiiiiiiIIIII3, -IiiiiiiiIIIII4);
        IiiiiiiiIIIII3 = 252;
        IiiiiiiiIIIII4 = 102;
        g.drawImage(this.Z_Z, IiiiiiiiIIIII3, IiiiiiiiIIIII4, 80, 105, null);
        g.drawImage(this.head1, IiiiiiiiIIIII3, IiiiiiiiIIIII4, 80, 105, null);
        if (this.Z_FS != null) {
            IiiiiiiiIIIII4 = 148;
            IiiiiiiiIIIII = 0;
            while (IiiiiiiiIIIII < this.Z_FS.length) {
                IiiiiiiiIIIII3 = 42 + IiiiiiiiIIIII * 52;
                g.drawImage(this.Z_FS[IiiiiiiiIIIII], IiiiiiiiIIIII3, IiiiiiiiIIIII4, 46, 46, null);
                ++IiiiiiiiIIIII;
                g.drawImage(this.head2, IiiiiiiiIIIII3, IiiiiiiiIIIII4, 46, 46, null);
            }
        }
        IiiiiiiiIIIII3 = IiiiiiiiIIIII2.Screen_x - 486;
        IiiiiiiiIIIII4 = IiiiiiiiIIIII2.Screen_y - 305;
        g.drawImage(this.Y_Z, IiiiiiiiIIIII3, IiiiiiiiIIIII4, 80, 105, null);
        g.drawImage(this.head1, IiiiiiiiIIIII3, IiiiiiiiIIIII4, 80, 105, null);
        if (this.Y_FS != null) {
            IiiiiiiiIIIII4 = IiiiiiiiIIIII2.Screen_y - 265;
            IiiiiiiiIIIII = 0;
            while (IiiiiiiiIIIII < this.Y_FS.length) {
                IiiiiiiiIIIII3 = IiiiiiiiIIIII2.Screen_x - 400 + IiiiiiiiIIIII * 52;
                g.drawImage(this.Y_FS[IiiiiiiiIIIII], IiiiiiiiIIIII3, IiiiiiiiIIIII4, 46, 46, null);
                ++IiiiiiiiIIIII;
                g.drawImage(this.head2, IiiiiiiiIIIII3, IiiiiiiiIIIII4, 46, 46, null);
            }
        }
        if (this.TZ == null) {
            this.TZ = iiiiiiiiiiIiI.iIiIiiiiIIiii((String)"sc/bang/BgTZ.tcp");
        } else {
            if (this.time > this.TZ.IIIiiiiiiIIiI()) {
                return true;
            }
            this.TZ.ALLATORIxDEMO((long)this.time, 0);
            this.TZ.ALLATORIxDEMO(g, IiiiiiiiIIIII2.Screen_x / 2, IiiiiiiiIIIII2.Screen_y / 2);
        }
        return false;
    }

    public String getLvl(int lvl) {
        StringBuffer IiiiiiiiIIIII = new StringBuffer();
        IiiiiiiiIIIII.append("#Y");
        int IiiiiiiiIIIII2 = IiiiIiiiiIIII.iIiIiiiiIIiii((int)lvl);
        if (IiiiiiiiIIIII2 <= 3) {
            IiiiiiiiIIIII.append(IiiiiiiiIIIII2);
            IiiiiiiiIIIII.append("\u8f6c");
        } else {
            IiiiiiiiIIIII.append("\u98de\u5347");
        }
        IiiiiiiiIIIII.append("#R");
        IiiiiiiiIIIII.append(IiiiIiiiiIIII.ALLATORIxDEMO((int)lvl));
        IiiiiiiiIIIII.append("#G\u7ea7");
        return IiiiiiiiIIIII.toString();
    }

    public BangTZ(String[] v) {
        String[] IiiiiiiiIIIII;
        StringBuffer IiiiiiiiIIIII2 = null;
        StringBuffer IiiiiiiiIIIII3 = null;
        StringBuffer IiiiiiiiIIIII4 = null;
        StringBuffer IiiiiiiiIIIII5 = null;
        this.head1 = IIIIIiiiIiiII.iiiIiiiiiiIIi((String)"sc/c/56");
        this.head2 = IIIIIiiiIiiII.iiiIiiiiiiIIi((String)"sc/c/57");
        this.kuan = IIIIIiiiIiiII.iiiIiiiiiiIIi((String)"sc/c/58");
        String[] IiiiiiiiIIIII6 = v[1].split("=");
        int IiiiiiiiIIIII7 = 0;
        while (IiiiiiiiIIIII7 < IiiiiiiiIIIII6.length) {
            IiiiiiiiIIIII = IiiiiiiiIIIII6[IiiiiiiiIIIII7].split("&");
            if (IiiiiiiiIIIII7 == 0) {
                this.Z_Z = IIIIIiiiIiiII.iiiIiiiiiiIIi((String)IIiIiiiiIiiIi.iiiIiiiiiiIIi((String)IiiiiiiiIIIII[1]));
            } else {
                if (this.Z_FS == null) {
                    this.Z_FS = new Image[IiiiiiiiIIIII6.length - 1];
                }
                this.Z_FS[IiiiiiiiIIIII7 - 1] = IIIIIiiiIiiII.iiiIiiiiiiIIi((String)IIiIiiiiIiiIi.iiiIiiiiiiIIi((String)IiiiiiiiIIIII[1]));
            }
            if (IiiiiiiiIIIII2 == null) {
                IiiiiiiiIIIII2 = new StringBuffer();
            } else {
                IiiiiiiiIIIII2.append("#r");
            }
            if (IiiiiiiiIIIII3 == null) {
                IiiiiiiiIIIII3 = new StringBuffer();
            } else {
                IiiiiiiiIIIII3.append("#r");
            }
            IiiiiiiiIIIII2.append("#G" + IiiiiiiiIIIII[0]);
            ++IiiiiiiiIIIII7;
            IiiiiiiiIIIII3.append(this.getLvl(Integer.parseInt(IiiiiiiiIIIII[2])));
        }
        IiiiiiiiIIIII6 = v[2].split("=");
        IiiiiiiiIIIII7 = 0;
        while (IiiiiiiiIIIII7 < IiiiiiiiIIIII6.length) {
            IiiiiiiiIIIII = IiiiiiiiIIIII6[IiiiiiiiIIIII7].split("&");
            if (IiiiiiiiIIIII7 == 0) {
                this.Y_Z = IIIIIiiiIiiII.iiiIiiiiiiIIi((String)IIiIiiiiIiiIi.iiiIiiiiiiIIi((String)IiiiiiiiIIIII[1]));
            } else {
                if (this.Y_FS == null) {
                    this.Y_FS = new Image[IiiiiiiiIIIII6.length - 1];
                }
                this.Y_FS[IiiiiiiiIIIII7 - 1] = IIIIIiiiIiiII.iiiIiiiiiiIIi((String)IIiIiiiiIiiIi.iiiIiiiiiiIIi((String)IiiiiiiiIIIII[1]));
            }
            if (IiiiiiiiIIIII4 == null) {
                IiiiiiiiIIIII4 = new StringBuffer();
            } else {
                IiiiiiiiIIIII4.append("#r");
            }
            if (IiiiiiiiIIIII5 == null) {
                IiiiiiiiIIIII5 = new StringBuffer();
            } else {
                IiiiiiiiIIIII5.append("#r");
            }
            IiiiiiiiIIIII4.append("#G" + IiiiiiiiIIIII[0]);
            ++IiiiiiiiIIIII7;
            IiiiiiiiIIIII5.append(this.getLvl(Integer.parseInt(IiiiiiiiIIIII[2])));
        }
        if (IiiiiiiiIIIII2 != null) {
            this.Z_N = new RichLabel(IiiiiiiiIIIII2.toString(), iiIIiiiiIiiII.iiIiiiiiiIIiI, 120);
        }
        if (IiiiiiiiIIIII3 != null) {
            this.Z_V = new RichLabel(IiiiiiiiIIIII3.toString(), iiIIiiiiIiiII.iiIiiiiiiIIiI, 120);
        }
        if (IiiiiiiiIIIII4 != null) {
            this.Y_N = new RichLabel(IiiiiiiiIIIII4.toString(), iiIIiiiiIiiII.iiIiiiiiiIIiI, 120);
        }
        if (IiiiiiiiIIIII5 == null) return;
        this.Y_V = new RichLabel(IiiiiiiiIIIII5.toString(), iiIIiiiiIiiII.iiIiiiiiiIIiI, 120);
    }
}
