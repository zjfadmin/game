/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.w.IIIIIiiiIiIii
 *  com.xy.w.IIiIiiiiIiiIi
 *  com.xy.w.iiiiiiiiiiIiI
 */
package com.xy.battle;

import com.xy.q.iiIIiiiiIiiII;
import com.xy.w.IIIIIiiiIiIii;
import com.xy.w.IIiIiiiiIiiIi;
import com.xy.w.iiiiiiiiiiIiI;
import java.awt.Color;
import java.awt.Graphics;

public class BattleDisplay {
    public static int TILIU = 1300;
    public String ZM = "\u81f4\u547d";
    private String hpbig;
    private boolean is;
    private String mpbig;
    private Color mpc;
    private String mpsmall;
    private long time;
    private String ts;
    private String hpsmall;
    private Color hpc;
    private Color tsc;
    private String tcp;
    private IIIIIiiiIiIii sprite;

    public void setTime(long time) {
        this.time = time;
    }

    public long getTime() {
        return this.time;
    }

    public boolean ALLATORIxDEMO(Graphics g, int x, int y, boolean camp) {
        int IiiiiiiiIIIII;
        if (this.time > (long)TILIU) {
            return true;
        }
        int IiiiiiiiIIIII2 = (int)(this.time / 15L);
        y -= IiiiiiiiIIIII2;
        if (this.tsc != null) {
            int n = x - this.ts.length() * 16 - 5;
            g.setFont(iiIIiiiiIiiII.iIiIiiiiIiiii);
            g.setColor(iiIIiiiiIiiII.IIiIiiiiIiIiI);
            g.drawString(this.ts, IiiiiiiiIIIII - 1, y);
            g.drawString(this.ts, IiiiiiiiIIIII + 1, y);
            g.drawString(this.ts, IiiiiiiiIIIII, y - 1);
            g.drawString(this.ts, IiiiiiiiIIIII, y + 1);
            g.setColor(this.tsc);
            g.drawString(this.ts, IiiiiiiiIIIII, y);
        }
        if (this.tcp != null) {
            if (this.sprite == null) {
                this.sprite = iiiiiiiiiiIiI.iIiIiiiiIIiii((String)this.tcp);
            }
            if (this.sprite != null) {
                this.sprite.ALLATORIxDEMO(0L, 0);
                this.sprite.ALLATORIxDEMO(g, x - 40, y - 15);
            }
        }
        if (this.hpc != null) {
            IiiiiiiiIIIII = x;
            if (this.hpbig != null) {
                g.setFont(iiIIiiiiIiiII.iiIiIiiiIiiII);
                g.setColor(Color.BLACK);
                g.drawString(this.hpbig, x - 1, y);
                g.drawString(this.hpbig, x + 1, y);
                g.drawString(this.hpbig, x, y - 1);
                g.drawString(this.hpbig, x, y + 1);
                g.setColor(this.hpc);
                g.drawString(this.hpbig, x, y);
                IiiiiiiiIIIII += this.hpbig.length() * 10;
            }
            g.setFont(iiIIiiiiIiiII.iIiiIiiiiiiii);
            g.setColor(Color.BLACK);
            g.drawString(this.hpsmall, IiiiiiiiIIIII - 1, y);
            g.drawString(this.hpsmall, IiiiiiiiIIIII + 1, y);
            g.drawString(this.hpsmall, IiiiiiiiIIIII, y - 1);
            g.drawString(this.hpsmall, IiiiiiiiIIIII, y + 1);
            g.setColor(this.hpc);
            g.drawString(this.hpsmall, IiiiiiiiIIIII, y);
        }
        y -= 15;
        if (this.mpc == null) return false;
        if (!camp) return false;
        IiiiiiiiIIIII = x;
        if (this.mpbig != null) {
            g.setFont(iiIIiiiiIiiII.iiIiIiiiIiiII);
            g.setColor(Color.BLACK);
            g.drawString(this.mpbig, x - 1, y);
            g.drawString(this.mpbig, x + 1, y);
            g.drawString(this.mpbig, x, y - 1);
            g.drawString(this.mpbig, x, y + 1);
            g.setColor(this.mpc);
            g.drawString(this.mpbig, x, y);
            IiiiiiiiIIIII += this.mpbig.length() * 10;
        }
        g.setFont(iiIIiiiiIiiII.iIiiIiiiiiiii);
        g.setColor(Color.BLACK);
        g.drawString(this.mpsmall, IiiiiiiiIIIII - 1, y);
        g.drawString(this.mpsmall, IiiiiiiiIIIII + 1, y);
        g.drawString(this.mpsmall, IiiiiiiiIIIII, y - 1);
        g.drawString(this.mpsmall, IiiiiiiiIIIII, y + 1);
        g.setColor(this.mpc);
        g.drawString(this.mpsmall, IiiiiiiiIIIII, y);
        return false;
    }

    public void ALLATORIxDEMO(int time) {
        this.time += (long)time;
    }

    public BattleDisplay(boolean is, String ts, int hp, int mp) {
        String IiiiiiiiIIIII;
        this.is = is;
        if (ts != null) {
            if (ts.equals("\u81f4\u547d")) {
                this.tcp = IIiIiiiiIiiIi.iIiIiiiiIIiii((String)"ztzm");
            } else if (ts.equals("\u81f3\u5723")) {
                this.tcp = IIiIiiiiIiiIi.iIiIiiiiIIiii((String)"ztzs");
            } else if (ts.equals("\u6028\u6c14")) {
                this.tcp = IIiIiiiiIiiIi.iIiIiiiiIIiii((String)"ztyq");
            } else if (ts.equals("\u5438\u6536")) {
                this.tcp = IIiIiiiiIiiIi.iIiIiiiiIIiii((String)"ztxs");
            } else if (ts.equals("\u6012\u6c14")) {
                this.tcp = IIiIiiiiIiiIi.iIiIiiiiIIiii((String)"ztnq");
            } else if (ts.equals("\u72c2\u66b4")) {
                this.tcp = IIiIiiiiIiiIi.iIiIiiiiIIiii((String)"ztkb");
            } else if (ts.equals("4\u500d")) {
                this.tcp = IIiIiiiiIiiIi.iIiIiiiiIIiii((String)"zt4b");
            } else if (ts.equals("3\u500d")) {
                this.tcp = IIiIiiiiIiiIi.iIiIiiiiIIiii((String)"zt3b");
            } else {
                this.ts = ts;
                this.tsc = Color.YELLOW;
            }
        }
        if (hp != 0) {
            StringBuilder stringBuilder;
            IiiiiiiiIIIII = null;
            if (hp > 0) {
                stringBuilder = new StringBuilder("+");
                IiiiiiiiIIIII = stringBuilder.append(hp).toString();
                this.hpc = Color.GREEN;
            } else {
                stringBuilder = new StringBuilder(String.valueOf(hp));
                IiiiiiiiIIIII = stringBuilder.toString();
                this.hpc = iiIIiiiiIiiII.iiiiIiiiiiIII;
            }
            if (IiiiiiiiIIIII.length() >= 6) {
                this.hpbig = IiiiiiiiIIIII.substring(0, IiiiiiiiIIIII.length() - 4);
                this.hpsmall = IiiiiiiiIIIII.substring(IiiiiiiiIIIII.length() - 4, IiiiiiiiIIIII.length());
            } else {
                this.hpsmall = IiiiiiiiIIIII;
            }
        }
        if (mp != 0) {
            StringBuilder stringBuilder;
            IiiiiiiiIIIII = null;
            if (hp > 0) {
                stringBuilder = new StringBuilder("+");
                IiiiiiiiIIIII = stringBuilder.append(mp).toString();
            } else {
                stringBuilder = new StringBuilder(String.valueOf(mp));
                IiiiiiiiIIIII = stringBuilder.toString();
            }
            this.mpc = Color.BLUE;
            if (IiiiiiiiIIIII.length() >= 6) {
                this.mpbig = IiiiiiiiIIIII.substring(0, IiiiiiiiIIIII.length() - 4);
                this.mpsmall = IiiiiiiiIIIII.substring(IiiiiiiiIIIII.length() - 4, IiiiiiiiIIIII.length());
            } else {
                this.mpsmall = IiiiiiiiIIIII;
            }
        }
        this.time = 0L;
    }

    public String getTs() {
        return this.ts;
    }

    public void setTs(String ts) {
        this.ts = ts;
    }

    public boolean ALLATORIxDEMO(boolean camp) {
        if (this.time < 0L) {
            return false;
        }
        if (!this.is) return true;
        return camp;
    }
}
