/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.n.IIiIiiiiIiiIi
 *  com.xy.w.IIIIIiiiIiIii
 *  com.xy.w.IIiIiiiiIiiIi
 *  com.xy.w.iiIiIiiiiiIIi
 *  com.xy.w.iiiiiiiiiiIiI
 */
package com.xy.scene;

import com.xy.w.IIIIIiiiIiIii;
import com.xy.w.IIiIiiiiIiiIi;
import com.xy.w.iiIiIiiiiiIIi;
import com.xy.w.iiiiiiiiiiIiI;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;

public class Build {
    private int v;
    public static int LY3;
    public static int LY1;
    private int hp;
    private int py;
    public static int PO;
    private int time;
    public static int TOWER_HUO;
    public static int LZ3;
    private IIIIIiiiIiIii s2;
    public static int TOWER_DOOR;
    private IIIIIiiiIiIii s1;
    public static int LY2;
    public static int TOWER_FIRE;
    public static int LZ1;
    public static int CAN;
    private int bh;
    private int px;
    private int state;
    public static int LZ2;
    public static int TOWER_ICE;
    private int type;
    private IIIIIiiiIiIii sprite;
    public static int MAN;
    private int y;
    public static int TOWER_LONG;
    private int x;
    private Image image;
    private IIIIIiiiIiIii s3;

    public void setX(int x) {
        this.x = x;
    }

    public void setHp(int hp) {
        if (this.hp == hp) {
            if (this.type != TOWER_FIRE) {
                if (this.type != TOWER_ICE) return;
            }
            this.time = 1;
            this.v = 2;
            return;
        }
        if (this.type == TOWER_DOOR || this.type == TOWER_FIRE || this.type == TOWER_ICE) {
            this.time = 1;
            this.v = 1;
        }
        this.hp = hp;
    }

    public void ALLATORIxDEMO(Graphics g, com.xy.n.IIiIiiiiIiiIi mapCamera) {
        iiIiIiiiiiIIi IiiiiiiiIIIII;
        if (this.type == TOWER_DOOR && this.state == PO) {
            this.image = null;
            return;
        }
        this.time += 9;
        if (this.state >= LZ1) {
            if (this.sprite != null && this.time > this.sprite.IIIiiiiiiIIiI()) {
                this.state = this.state == LY3 || this.state == LZ3 ? MAN : ++this.state;
                this.setState(this.state);
            }
        } else {
            this.time += 9;
        }
        Point IiiiiiiiIIIII2 = mapCamera.ALLATORIxDEMO(this.x, this.y);
        if (this.sprite == null) {
            StringBuffer stringBuffer = new StringBuffer();
            IiiiiiiiIIIII.append(IIiIiiiiIiiIi.iIiIiiiiIiIii);
            stringBuffer.append(this.type == TOWER_ICE ? TOWER_FIRE : this.type);
            if (this.state == LZ3) {
                IiiiiiiiIIIII.append(LZ1);
            } else if (this.state == LY3) {
                IiiiiiiiIIIII.append(LY1);
            } else {
                IiiiiiiiIIIII.append(this.state);
            }
            IiiiiiiiIIIII.append(IIiIiiiiIiiIi.iIiiIiiiIiIIi);
            this.sprite = iiiiiiiiiiIiI.iIiIiiiiIIiii((String)IiiiiiiiIIIII.toString());
        }
        if (this.sprite == null) {
            this.image = null;
            return;
        }
        if (IiiiiiiiIIIII2 == null) {
            this.image = null;
            return;
        }
        if (this.type == TOWER_FIRE || this.type == TOWER_ICE) {
            if (this.s2 == null) {
                this.s2 = this.type == TOWER_FIRE ? iiiiiiiiiiIiI.iIiIiiiiIIiii((String)"sc/bang/BgTDbR.tcp") : iiiiiiiiiiIiI.iIiIiiiiIIiii((String)"sc/bang/BgTDbB.tcp");
            } else {
                this.s2.ALLATORIxDEMO((long)this.time, 0);
                this.s2.ALLATORIxDEMO(g, IiiiiiiiIIIII2.x, IiiiiiiiIIIII2.y);
            }
        }
        if (this.state == LZ3 || this.state == LY3) {
            this.sprite.ALLATORIxDEMO((long)(this.sprite.IIIiiiiiiIIiI() - this.time), 0);
        } else {
            this.sprite.ALLATORIxDEMO((long)this.time, 0);
        }
        this.sprite.ALLATORIxDEMO(g, IiiiiiiiIIIII2.x, IiiiiiiiIIIII2.y);
        IiiiiiiiIIIII = this.sprite.ALLATORIxDEMO();
        this.px = IiiiiiiiIIIII.iiiIiiiiiiIIi();
        this.py = IiiiiiiiIIIII.iIiIiiiiIIiii();
        this.image = IiiiiiiiIIIII.ALLATORIxDEMO();
        if (this.v == 0) return;
        if (this.s3 != null) {
            this.s3.ALLATORIxDEMO((long)this.time, 0);
            this.s3.ALLATORIxDEMO(g, IiiiiiiiIIIII2.x, IiiiiiiiIIIII2.y);
            if (this.time <= this.s3.IIIiiiiiiIIiI()) return;
            this.v = 0;
            this.s3 = null;
            return;
        }
        if (this.v == 1) {
            if (this.type == TOWER_DOOR) {
                this.s3 = iiiiiiiiiiIiI.iIiIiiiiIIiii((String)"sc/bang/BgTHs.tcp");
                return;
            }
            this.s3 = iiiiiiiiiiIiI.iIiIiiiiIIiii((String)"sc/bang/BgTDj.tcp");
            return;
        }
        if (this.type == TOWER_FIRE) {
            this.s3 = iiiiiiiiiiIiI.iIiIiiiiIIiii((String)"sc/bang/BgTQR.tcp");
            return;
        }
        this.s3 = iiiiiiiiiiIiI.iIiIiiiiIIiii((String)"sc/bang/BgTQB.tcp");
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getY() {
        return this.y;
    }

    public int getState() {
        return this.state;
    }

    public void setPx(int px) {
        this.px = px;
    }

    public void setBh(int bh) {
        this.bh = bh;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getBh() {
        return this.bh;
    }

    public void setState(int state) {
        this.sprite = null;
        this.image = null;
        this.time = 1;
        this.state = state;
    }

    public void setPy(int py) {
        this.py = py;
    }

    static {
        MAN = 0;
        CAN = 1;
        PO = 2;
        LZ1 = 3;
        LZ2 = 4;
        LZ3 = 5;
        LY1 = 6;
        LY2 = 7;
        LY3 = 8;
        TOWER_DOOR = 0;
        TOWER_FIRE = 1;
        TOWER_ICE = 2;
        TOWER_LONG = 3;
        TOWER_HUO = 4;
    }

    public Build(int bh, int type, int state, int hp) {
        this.bh = bh;
        this.type = type;
        this.state = state;
        this.hp = hp;
        switch (bh) {
            case 0: {
                this.x = 307;
                this.y = 360;
                return;
            }
            case 1: {
                this.x = 340;
                this.y = 1593;
                return;
            }
            case 2: {
                this.x = 841;
                this.y = 1113;
                return;
            }
            case 3: {
                this.x = 1118;
                this.y = 1287;
                return;
            }
            case 4: {
                this.x = 556;
                this.y = 1228;
                return;
            }
            case 5: {
                this.x = 882;
                this.y = 1414;
                return;
            }
            case 11: {
                this.x = 2149;
                this.y = 552;
                return;
            }
            case 12: {
                this.x = 1465;
                this.y = 781;
                return;
            }
            case 13: {
                this.x = 1767;
                this.y = 956;
                return;
            }
            case 14: {
                this.x = 1701;
                this.y = 648;
                return;
            }
            case 15: {
                this.x = 2001;
                this.y = 826;
                break;
            }
        }
    }

    public Image getImage() {
        return this.image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public int getType() {
        return this.type;
    }

    public int getHp() {
        return this.hp;
    }

    public int getPy() {
        return this.py;
    }

    public String getName() {
        switch (this.type) {
            case 0: {
                return "\u57ce\u95e8";
            }
            case 1: {
                return "\u706b\u5854";
            }
            case 2: {
                return "\u51b0\u5854";
            }
            case 3: {
                return "\u9f99\u795e\u5927\u70ae";
            }
        }
        return "";
    }

    public int getPx() {
        return this.px;
    }

    public int getX() {
        return this.x;
    }
}
