/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.n.IIIIIiiiIiiII
 *  com.xy.n.iIiIIiiiIiiiI
 *  com.xy.text.GameView
 *  com.xy.text.ScreenData
 *  com.xy.w.IIIIIiiiIiIii
 */
package com.xy.n;

import com.xy.n.IIIIIiiiIiiII;
import com.xy.n.iIiIIiiiIiiiI;
import com.xy.text.GameView;
import com.xy.text.ScreenData;
import com.xy.w.IIIIIiiiIiIii;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class IIiIiiiiIiiIi {
    private int iIIIIiiiiiIIi;
    private StringBuffer IiiIIiiiiiiiI;
    private int IIiiiiiiIiiII;
    private int IiiiIiiiIiIII;
    private int IIiiiiiiiIIIi;
    private int IIIiiiiiIIiII;
    public static final int iiIiiiiiiIIiI = 70;
    private int iIiiIiiiIiIIi;
    private int iiiiIiiiIIiii;
    public static final int iIIiIiiiiiiIi = 25;
    private Point IIIIiiiiiiiII = new Point(0, 0);
    private static IIIIIiiiIiIii iiIIIiiiiiiiI;
    private int IiIiiiiiIIIII;
    private int iiIiIiiiiIIIi;
    static String iiiiIiiiIiiII;
    public GameView iiiIiiiiiiiIi;
    static String iIiiIiiiiiiII;
    public ScreenData IIiiIiiiIIiIi;
    public iIiIIiiiIiiiI iIiIiiiiIiIii;
    private int IiIIIiiiiIiiI;
    static String iiIiiiiiiiIii;
    private int IiiiiiiiIIIII;
    private int ALLATORIxDEMO;

    static {
        iIiiIiiiiiiII = "[";
        iiIiiiiiiiIii = ",";
        iiiiIiiiIiiII = "]";
    }

    public void ALLATORIxDEMO(Graphics graphics) {
        this.iIiIiiiiIIiii(graphics, this.IiIIIiiiiIiiI - this.IIiiIiiiIIiIi.Screen_x / 2, this.IiiiIiiiIiIII - this.IIiiIiiiIIiIi.Screen_y / 2);
    }

    public void ALLATORIxDEMO(iIiIIiiiIiiiI mapScene) {
        this.iIiIiiiiIiIii = mapScene;
    }

    public iIiIIiiiIiiiI ALLATORIxDEMO() {
        return this.iIiIiiiiIiIii;
    }

    public void iiiiiiiiIIiii(int y) {
        if (y == this.IIiiiiiiIiiII && y == this.IiiiIiiiIiIII) {
            return;
        }
        this.IiiiIiiiIiIII += (y - this.IiiiIiiiIiIII > 0 ? 1 : -1) * (Math.abs(y - this.IiiiIiiiIiIII) > 2 ? 2 : 1);
        int IiiiiiiiIIIII = this.IIiiIiiiIIiIi.Screen_y / 2;
        if (this.IiiiIiiiIiIII > this.iIiIiiiiIiIii.iIiiIiiiiiiII.iIiIiiiiIiIii - IiiiiiiiIIIII) {
            this.IiiiIiiiIiIII = this.iIiIiiiiIiIii.iIiiIiiiiiiII.iIiIiiiiIiIii - IiiiiiiiIIIII;
        }
        if (this.IiiiIiiiIiIII < IiiiiiiiIIIII) {
            this.IiiiIiiiIiIII = IiiiiiiiIIIII;
        }
        this.IIiiiiiiIiiII = y;
    }

    public void iIiIiiiiIIiii(int x, int y) {
        int IiiiiiiiIIIII;
        this.IiIIIiiiiIiiI = x;
        this.ALLATORIxDEMO = x;
        this.IiiiIiiiIiIII = y;
        this.IIiiiiiiIiiII = y;
        int IiiiiiiiIIIII2 = this.IIiiIiiiIIiIi.Screen_x / 2;
        if (this.IiIIIiiiiIiiI > this.iIiIiiiiIiIii.iIiiIiiiiiiII.IiIiiiiiIIIII - IiiiiiiiIIIII2) {
            this.IiIIIiiiiIiiI = this.iIiIiiiiIiIii.iIiiIiiiiiiII.IiIiiiiiIIIII - IiiiiiiiIIIII2;
        }
        if (this.IiIIIiiiiIiiI < IiiiiiiiIIIII2) {
            this.IiIIIiiiiIiiI = IiiiiiiiIIIII2;
        }
        if (this.IiiiIiiiIiIII > this.iIiIiiiiIiIii.iIiiIiiiiiiII.iIiIiiiiIiIii - (IiiiiiiiIIIII = this.IIiiIiiiIIiIi.Screen_y / 2)) {
            this.IiiiIiiiIiIII = this.iIiIiiiiIiIii.iIiiIiiiiiiII.iIiIiiiiIiIii - IiiiiiiiIIIII;
        }
        if (this.IiiiIiiiIiIII >= IiiiiiiiIIIII) return;
        this.IiiiIiiiIiIII = IiiiiiiiIIIII;
    }

    public void iIiIiiiiIIiii(Graphics g, int map_x, int map_y) {
        if (this.iIiIiiiiIiIii.iIiiIiiiiiiII == null) {
            return;
        }
        this.iiIiIiiiiIIIi = -map_x % IIIIIiiiIiiII.iiIiIiiiiIIIi;
        this.iIIIIiiiiiIIi = -map_y % IIIIIiiiIiiII.iiIiiiiiiIIiI;
        g.translate(this.iiIiIiiiiIIIi, this.iIIIIiiiiiIIi);
        map_x /= IIIIIiiiIiiII.iiIiIiiiiIIIi;
        map_y /= IIIIIiiiIiiII.iiIiiiiiiIIiI;
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IiiiiiiiIIIII) {
            this.iIiiIiiiIiIIi = IiiiiiiiIIIII * IIIIIiiiIiiII.iiIiIiiiiIIIi;
            this.IIiiiiiiiIIIi = IiiiiiiiIIIII + map_x;
            int IiiiiiiiIIIII2 = 0;
            while (IiiiiiiiIIIII2 < this.IIIiiiiiIIiII) {
                Image IiiiiiiiIIIII3 = this.iIiIiiiiIiIii.ALLATORIxDEMO(this.IIiiiiiiiIIIi, IiiiiiiiIIIII2 + map_y);
                if (IiiiiiiiIIIII3 != null) {
                    g.drawImage(IiiiiiiiIIIII3, this.iIiiIiiiIiIIi, IiiiiiiiIIIII2 * IIIIIiiiIiiII.iiIiiiiiiIIiI, null);
                } else {
                    this.ALLATORIxDEMO(g, this.iIiiIiiiIiIIi, IiiiiiiiIIIII2 * IIIIIiiiIiiII.iiIiiiiiiIIiI);
                }
                ++IiiiiiiiIIIII2;
            }
            ++IiiiiiiiIIIII;
        }
        g.translate(-this.iiIiIiiiiIIIi, -this.iIIIIiiiiiIIi);
    }

    public void ALLATORIxDEMO(ScreenData screenData) {
        this.IIiiIiiiIIiIi = screenData;
    }

    public void ALLATORIxDEMO(int x, int y) {
        if (this.iIiIiiiiIiIii.iIiiIiiiiiiII == null) {
            return;
        }
        if (this.ALLATORIxDEMO == x && this.IIiiiiiiIiiII == y) {
            this.iIiIiiiiIIiii(x);
            this.iiiiiiiiIIiii(y);
            return;
        }
        this.IiiIIiiiiiiiI.setLength(0);
        this.IiiIIiiiiiiiI.append(iIiiIiiiiiiII);
        this.IiiIIiiiiiiiI.append(x / 20);
        this.IiiIIiiiiiiiI.append(iiIiiiiiiiIii);
        this.IiiIIiiiiiiiI.append(y / 20);
        this.IiiIIiiiiiiiI.append(iiiiIiiiIiiII);
        this.iiiIiiiiiiiIi.getBaseView().iiiiiiiiIIiii(this.IiiIIiiiiiiiI.toString());
        this.IiiIiiiiiiIiI(x);
        this.iiiIiiiiiiIIi(y);
        this.ALLATORIxDEMO = x;
        this.IIiiiiiiIiiII = y;
    }

    public ScreenData ALLATORIxDEMO() {
        return this.IIiiIiiiIIiIi;
    }

    public void IiiIiiiiiiIiI(int x) {
        if (x == this.ALLATORIxDEMO && x == this.IiIIIiiiiIiiI) {
            return;
        }
        if (x == this.ALLATORIxDEMO) return;
        this.ALLATORIxDEMO(x);
    }

    public Point ALLATORIxDEMO(int x, int y) {
        if (Math.abs(x - this.IiIIIiiiiIiiI) >= this.IIiiIiiiIIiIi.Screen_x / 2) return null;
        if (Math.abs(y - this.IiiiIiiiIiIII) >= this.IIiiIiiiIIiIi.Screen_y / 2) return null;
        this.IIIIiiiiiiiII.x = x - this.IiIIIiiiiIiiI + this.IIiiIiiiIIiIi.Screen_x / 2;
        this.IIIIiiiiiiiII.y = y - this.IiiiIiiiIiIII + this.IIiiIiiiIIiIi.Screen_y / 2;
        return this.IIIIiiiiiiiII;
    }

    public void iIiIiiiiIIiIi(int shot_y) {
        int IiiiiiiiIIIII = this.IIiiIiiiIIiIi.Screen_y / 2;
        if (Math.abs(this.IiiiIiiiIiIII - shot_y) > 25) {
            this.IiiiIiiiIiIII = shot_y + (shot_y - this.IiiiIiiiIiIII < 0 ? 25 : -25);
        }
        if (this.IiiiIiiiIiIII > this.iIiIiiiiIiIii.iIiiIiiiiiiII.iIiIiiiiIiIii - IiiiiiiiIIIII) {
            this.IiiiIiiiIiIII = this.iIiIiiiiIiIii.iIiiIiiiiiiII.iIiIiiiiIiIii - IiiiiiiiIIIII;
        }
        if (this.IiiiIiiiIiIII >= IiiiiiiiIIIII) return;
        this.IiiiIiiiIiIII = IiiiiiiiIIIII;
    }

    public int iIiIiiiiIIiii() {
        return this.IiiiIiiiIiIII - this.IIiiIiiiIIiIi.Screen_y / 2;
    }

    /*
     * WARNING - void declaration
     */
    public void ALLATORIxDEMO(Graphics graphics, int n, int n2) {
        void map_y;
        void map_x;
        void g;
        g.setColor(Color.black);
        graphics.fillRect((int)map_x, (int)map_y, IIIIIiiiIiiII.iiIiIiiiiIIIi, IIIIIiiiIiiII.iiIiiiiiiIIiI);
    }

    public void iiiIiiiiiiIIi(int y) {
        if (y == this.IIiiiiiiIiiII && y == this.IiiiIiiiIiIII) {
            return;
        }
        if (y == this.IIiiiiiiIiiII) return;
        this.iIiIiiiiIIiIi(y);
    }

    public void iIiIiiiiIIiii(int x) {
        if (x == this.ALLATORIxDEMO && x == this.IiIIIiiiiIiiI) {
            return;
        }
        this.IiIIIiiiiIiiI += (x - this.IiIIIiiiiIiiI > 0 ? 1 : -1) * (Math.abs(x - this.IiIIIiiiiIiiI) > 2 ? 2 : 1);
        int IiiiiiiiIIIII = this.IIiiIiiiIIiIi.Screen_x / 2;
        if (this.IiIIIiiiiIiiI > this.iIiIiiiiIiIii.iIiiIiiiiiiII.IiIiiiiiIIIII - IiiiiiiiIIIII) {
            this.IiIIIiiiiIiiI = this.iIiIiiiiIiIii.iIiiIiiiiiiII.IiIiiiiiIIIII - IiiiiiiiIIIII;
        }
        if (this.IiIIIiiiiIiiI < IiiiiiiiIIIII) {
            this.IiIIIiiiiIiiI = IiiiiiiiIIIII;
        }
        this.ALLATORIxDEMO = x;
    }

    public IIiIiiiiIiiIi(GameView gameView) {
        this.IiiIIiiiiiiiI = new StringBuffer();
        this.iiiIiiiiiiiIi = gameView;
        this.IIiiIiiiIIiIi = gameView.screenData;
        this.ALLATORIxDEMO();
    }

    public int ALLATORIxDEMO() {
        return this.IiIIIiiiiIiiI - this.IIiiIiiiIIiIi.Screen_x / 2;
    }

    public Point ALLATORIxDEMO(int x, int y, int w, int h) {
        if (Math.abs(x + (w /= 2) - this.IiIIIiiiiIiiI) >= this.IIiiIiiiIIiIi.Screen_x / 2 + w) return null;
        if (Math.abs(y + (h /= 2) - this.IiiiIiiiIiIII) >= this.IIiiIiiiIIiIi.Screen_y / 2 + h) return null;
        this.IIIIiiiiiiiII.x = x - this.IiIIIiiiiIiiI + this.IIiiIiiiIIiIi.Screen_x / 2;
        this.IIIIiiiiiiiII.y = y - this.IiiiIiiiIiIII + this.IIiiIiiiIIiIi.Screen_y / 2;
        return this.IIIIiiiiiiiII;
    }

    public void ALLATORIxDEMO(int shot_x) {
        int IiiiiiiiIIIII = this.IIiiIiiiIIiIi.Screen_x / 2;
        if (Math.abs(this.IiIIIiiiiIiiI - shot_x) > 70) {
            this.IiIIIiiiiIiiI = shot_x + (shot_x - this.IiIIIiiiiIiiI < 0 ? 70 : -70);
        }
        if (this.IiIIIiiiiIiiI > this.iIiIiiiiIiIii.iIiiIiiiiiiII.IiIiiiiiIIIII - IiiiiiiiIIIII) {
            this.IiIIIiiiiIiiI = this.iIiIiiiiIiIii.iIiiIiiiiiiII.IiIiiiiiIIIII - IiiiiiiiIIIII;
        }
        if (this.IiIIIiiiiIiiI >= IiiiiiiiIIIII) return;
        this.IiIIIiiiiIiiI = IiiiiiiiIIIII;
    }

    public void ALLATORIxDEMO() {
        this.IiiiiiiiIIIII = this.IIiiIiiiIIiIi.getScreen_x() / IIIIIiiiIiiII.iiIiIiiiiIIIi + 2;
        this.IIIiiiiiIIiII = this.IIiiIiiiIIiIi.getScreen_y() / IIIIIiiiIiiII.iiIiiiiiiIIiI + 2;
        this.IiIiiiiiIIIII = IIIIIiiiIiiII.iiIiIiiiiIIIi * this.IiiiiiiiIIIII;
        this.iiiiIiiiIIiii = IIIIIiiiIiiII.iiIiiiiiiIIiI * this.IIIiiiiiIIiII;
    }
}
