/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.bean.PathPoint
 *  com.xy.bean.RoleShow
 *  com.xy.d.IIIIIiiiIiiII
 *  com.xy.d.IIIiiiiiIiIiI
 *  com.xy.d.IiIiIiiiiIIiI
 *  com.xy.d.iiIiIiiiiIiii
 *  com.xy.game.GameMove
 *  com.xy.n.IIIIIiiiIiiII
 *  com.xy.n.iIiIIiiiIiiiI
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.richtext.FloatBox
 *  com.xy.text.GameView
 *  com.xy.text.SystemData
 *  com.xy.v.IIiiIiiiiIIiI
 *  com.xy.v.iIiIIiiiIiiiI
 *  com.xy.v.iiiiiiiiIIIII
 *  com.xy.w.IiiiIiiiiIiIi
 *  com.xy.w.iiiiiiiiiiIiI
 */
package com.xy.d;

import com.xy.bean.PathPoint;
import com.xy.bean.RoleShow;
import com.xy.d.IIIIIiiiIiiII;
import com.xy.d.IIIiiiiiIiIiI;
import com.xy.d.IiIiIiiiiIIiI;
import com.xy.d.iiIiIiiiiIiii;
import com.xy.game.GameMove;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.richtext.FloatBox;
import com.xy.text.GameView;
import com.xy.text.SystemData;
import com.xy.v.IIiiIiiiiIIiI;
import com.xy.v.iIiIIiiiIiiiI;
import com.xy.v.iiiiiiiiIIIII;
import com.xy.w.IiiiIiiiiIiIi;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.RenderingHints;
import java.util.List;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public abstract class iiiiiiiiiiIiI {
    public int IIiiiiiiiIIIi;
    protected String IIIiiiiiIIiII;
    public int iiIiiiiiiIIiI;
    public int iIiiIiiiIiIIi;
    public long iiiiIiiiIIiii;
    public int iIIiIiiiiiiIi;
    public int IIIIiiiiiiiII = iiiiiiiiiiIiI.iiiIiiiiiiIIi();
    protected IiiiIiiiiIiIi iiIIIiiiiiiiI;
    protected GameMove IiIiiiiiIIIII;
    public int iiIiIiiiiIIIi;
    protected FloatBox iiiiIiiiIiiII;
    protected String iiiIiiiiiiiIi;
    public long iIiiIiiiiiiII;
    protected IIIiiiiiIiIiI IIiiIiiiIIiIi;
    protected int iIiIiiiiIiIii;
    private static int IiIIIiiiiIiiI = 0;
    public int iiIiiiiiiiIii;
    public int IiiiiiiiIIIII;
    protected int ALLATORIxDEMO;

    public void iIiIiiiiIIiii(iiiiiiiiIIIII four) {
        this.iiIiIiiiiIIIi = four.ALLATORIxDEMO + 5;
        this.IIiiiiiiiIIIi = four.IiIIIiiiiIiiI + 5;
        this.iiIiiiiiiiIii = four.iiIiiiiiiiIii;
        this.ALLATORIxDEMO(four.IiiiiiiiIIIII);
    }

    public void ALLATORIxDEMO(int type) {
        if (this.iiIIIiiiiiiiI.iiiIiiiiiiIIi() == type) {
            return;
        }
        this.iiIIIiiiiiiiI.ALLATORIxDEMO(type);
    }

    public void ALLATORIxDEMO(List<PathPoint> Player_Paths, double sp) {
        if (this.IiIiiiiiIIIII == null) {
            this.IiIiiiiiIIIII = new GameMove(sp);
        } else {
            this.IiIiiiiiIIIII.setSp(sp);
        }
        if (Player_Paths == null || Player_Paths.size() < 2) {
            this.IiIiiiiiIIIII.setValue(0, 0L, null);
            return;
        }
        StringBuffer IiiiiiiiIIIII = new StringBuffer(Player_Paths.size() * 8);
        int IiiiiiiiIIIII2 = 0;
        while (IiiiiiiiIIIII2 < Player_Paths.size()) {
            PathPoint IiiiiiiiIIIII3 = Player_Paths.get(IiiiiiiiIIIII2);
            if (IiiiiiiiIIIII2 != 0) {
                IiiiiiiiIIIII.append("*");
            }
            IiiiiiiiIIIII.append(IiiiiiiiIIIII3.getX());
            IiiiiiiiIIIII.append("*");
            ++IiiiiiiiIIIII2;
            IiiiiiiiIIIII.append(IiiiiiiiIIIII3.getY());
        }
        this.IiIiiiiiIIIII.setValue(0, 0L, IiiiiiiiIIIII.toString());
    }

    public void ALLATORIxDEMO(int x, int y, int z, int dir) {
        this.iiIiIiiiiIIIi = x;
        this.IIiiiiiiiIIIi = y;
        this.IiiiiiiiIIIII = z;
        this.iiIiiiiiiiIii = dir;
    }

    public void ALLATORIxDEMO(iiiiiiiiIIIII four) {
        this.iiIiIiiiiIIIi = four.ALLATORIxDEMO;
        this.IIiiiiiiiIIIi = four.IiIIIiiiiIiiI;
        this.iiIiiiiiiiIii = four.iiIiiiiiiiIii;
        this.ALLATORIxDEMO(four.IiiiiiiiIIIII);
    }

    public void IiiIiiiiiiIiI(Graphics g) {
        this.iIiIiiiiIIiii(g);
        this.iIiIiiiiIIiIi(g);
        this.iiiIiiiiiiIIi(g);
        this.ALLATORIxDEMO(g);
    }

    public void ALLATORIxDEMO(boolean flag) {
        if (this.IiIiiiiiIIIII == null) {
            this.iIiIiiiiIIiii();
        }
        this.IiIiiiiiIIIII.setFlag(flag);
    }

    public boolean ALLATORIxDEMO(GameView view) {
        Point IiiiiiiiIIIII = view.mapCamera.ALLATORIxDEMO(this.iiIiIiiiiIIIi, this.IIiiiiiiiIIIi);
        if (IiiiiiiiIIIII == null) {
            if (this.iiIIIiiiiiiiI == null) return false;
            this.iiIIIiiiiiiiI.iIiIiiiiIIiii();
            return false;
        }
        this.iiIiiiiiiIIiI = IiiiiiiiIIIII.x;
        this.iIiiIiiiIiIIi = IiiiiiiiIIIII.y;
        return true;
    }

    public void ALLATORIxDEMO(Graphics g, iiiiiiiiiiIiI XZUnit, GameView view) {
        if (!SystemData.ISTCP && this.iIIiIiiiiiiIi == 1) {
            this.iiIIIiiiiiiiI.iIiIiiiiIIiii();
            if (SystemData.ISNAME) {
                this.iIiIiiiiIIiii(g);
            }
            this.iiiIiiiiiiIIi(g);
            return;
        }
        if (view.mapScene.iIiIiiiiIIiii(this.iiIiIiiiiIIIi / com.xy.n.IIIIIiiiIiiII.iiIiiiiiiiIii, this.IIiiiiiiiIIIi / com.xy.n.IIIIIiiiIiiII.iiIiiiiiiiIii, 0)) {
            if (XZUnit == this) {
                this.iiIIIiiiiiiiI.iIiIiiiiIIiIi(g, this.iiIiiiiiiIIiI, this.iIiiIiiiIiIIi, this.iiIiiiiiiiIii, this.iiiiIiiiIIiii, 0.6f);
            } else {
                this.iiIIIiiiiiiiI.IiiIiiiiiiIiI(g, this.iiIiiiiiiIIiI, this.iIiiIiiiIiIIi, this.iiIiiiiiiiIii, this.iiiiIiiiIIiii, 0.6f);
            }
        } else if (XZUnit == this) {
            this.iiIIIiiiiiiiI.iIiIiiiiIIiIi(g, this.iiIiiiiiiIIiI, this.iIiiIiiiIiIIi, this.iiIiiiiiiiIii, this.iiiiIiiiIIiii, 1.0f);
        } else {
            this.iiIIIiiiiiiiI.ALLATORIxDEMO(g, this.iiIiiiiiiIIiI, this.iIiiIiiiIiIIi, this.iiIiiiiiiiIii, this.iiiiIiiiIIiii);
        }
        if (this.IIiiIiiiIIiIi == null) return;
        this.IIiiIiiiIIiIi.ALLATORIxDEMO(g, view);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Unable to fully structure code
     */
    public void iiiIiiiiiiIIi() {
        if (this.iiiiIiiiIiiII == null) {
            return;
        }
        var1_1 = this;
        synchronized (var1_1) {
            IiiiiiiiIIIII = iIiIIiiiIiiiI.ALLATORIxDEMO();
            IiiiiiiiIIIII = null;
            IiiiiiiiIIIII = this.iiiiIiiiIiiII;
            if (true) ** GOTO lbl22
            do {
                if (IiiiiiiiIIIII.IsTime(IiiiiiiiIIIII)) {
                    IiiiiiiiIIIII = IiiiiiiiIIIII;
                } else {
                    IiiiiiiiIIIII.removeLabel();
                    if (IiiiiiiiIIIII != null) {
                        IiiiiiiiIIIII.nextFloatBox = IiiiiiiiIIIII.nextFloatBox;
                    } else {
                        this.iiiiIiiiIiiII = IiiiiiiiIIIII.nextFloatBox;
                    }
                }
                IiiiiiiiIIIII = IiiiiiiiIIIII.nextFloatBox;
lbl22:
                // 2 sources

            } while (IiiiiiiiIIIII != null);
            return;
        }
    }

    public void ALLATORIxDEMO(int index, long time, String value) {
        if (this.IiIiiiiiIIIII == null) {
            this.iIiIiiiiIIiii();
        }
        if (this.IiIiiiiiIIIII.ALLATORIxDEMO() && index > 0) {
            return;
        }
        this.IiIiiiiiIIIII.setValue(index, time, value);
        if (value == null) return;
        this.ALLATORIxDEMO(this.IiIiiiiiIIIII.x1, this.IiIiiiiiIIIII.y1, this.IiIiiiiiIIIII.z1, this.iiIiiiiiiiIii);
    }

    public void iIiIiiiiIIiii() {
        if (this.IiIiiiiiIIIII == null) {
            this.IiIiiiiiIIIII = new GameMove(this instanceof IiIiIiiiiIIiI ? 0.5 : (this instanceof IIIIIiiiIiiII ? 0.07 : 0.24));
        }
        this.IiIiiiiiIIIII.setSp(this instanceof IiIiIiiiiIIiI ? 0.5 : (this instanceof IIIIIiiiIiiII ? 0.07 : 0.24));
    }

    private static /* synthetic */ int iiiIiiiiiiIIi() {
        return IiIIIiiiiIiiI++;
    }

    public static IiiiIiiiiIiIi ALLATORIxDEMO(IiiiIiiiiIiIi newPart, IiiiIiiiiIiIi addPart) {
        if (newPart == null) {
            newPart = addPart;
            return newPart;
        }
        newPart = newPart.ALLATORIxDEMO(addPart);
        return newPart;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void iIiIiiiiIIiIi(Graphics g) {
        if (this.iiiiIiiiIiiII == null) {
            return;
        }
        iiiiiiiiiiIiI iiiiiiiiiiIiI2 = this;
        synchronized (iiiiiiiiiiIiI2) {
            if (this.iiiiIiiiIiiII == null) {
                return;
            }
            int IiiiiiiiIIIII = this.iiIIIiiiiiiiI.iIiIiiiiIIiIi();
            if (IiiiiiiiIIIII == -1) {
                return;
            }
            ((Graphics2D)g).setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_DEFAULT);
            int IiiiiiiiIIIII2 = this.iIiiIiiiIiIIi - IiiiiiiiIIIII + 8;
            FloatBox IiiiiiiiIIIII3 = this.iiiiIiiiIiiII;
            while (IiiiiiiiIIIII3 != null) {
                int IiiiiiiiIIIII4 = this.iiIiiiiiiIIiI - IiiiiiiiIIIII3.getWidth() / 2;
                g.translate(IiiiiiiiIIIII4, IiiiiiiiIIIII2 -= IiiiiiiiIIIII3.getHeight() + 2);
                IiiiiiiiIIIII3.paint(g);
                g.translate(-IiiiiiiiIIIII4, -IiiiiiiiIIIII2);
                IiiiiiiiIIIII3 = IiiiiiiiIIIII3.nextFloatBox;
            }
            ((Graphics2D)g).setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_OFF);
            return;
        }
    }

    public abstract int ALLATORIxDEMO(iiiiiiiiiiIiI var1);

    public String ALLATORIxDEMO() {
        return this.IIIiiiiiIIiII;
    }

    public void ALLATORIxDEMO(String skin, RoleShow roleShow) {
        IiiiIiiiiIiIi IiiiiiiiIIIII;
        boolean IiiiiiiiIIIII2 = false;
        this.iiIIIiiiiiiiI = null;
        String IiiiiiiiIIIII3 = null;
        if (roleShow != null && !IIiiIiiiiIIiI.iIiIiiiiIIiIi((String)roleShow.getSkin())) {
            IiiiiiiiIIIII = roleShow.getSkin().split("\\|");
            int IiiiiiiiIIIII4 = 0;
            while (IiiiiiiiIIIII4 < ((IiiiIiiiiIiIi)IiiiiiiiIIIII).length) {
                IiiiIiiiiIiIi IiiiiiiiIIIII5;
                IiiiIiiiiIiIi IiiiiiiiIIIII6;
                if (IiiiiiiiIIIII[IiiiiiiiIIIII4].startsWith("X") || IiiiiiiiIIIII[IiiiiiiiIIIII4].startsWith("P")) {
                    if (roleShow.getMount_id() == 0 || skin == null || skin.length() >= 10) {
                        IiiiiiiiIIIII6 = IiiiiiiiIIIII[IiiiiiiiIIIII4].substring(1).split("_");
                        IiiiiiiiIIIII5 = com.xy.w.iiiiiiiiiiIiI.ALLATORIxDEMO((String)("tx/tx" + IiiiiiiiIIIII6[0]), (int)-2, (int)Integer.parseInt(IiiiiiiiIIIII6[1]), null);
                        this.iiIIIiiiiiiiI = this.iiIIIiiiiiiiI == null ? IiiiiiiiIIIII5 : this.iiIIIiiiiiiiI.ALLATORIxDEMO(IiiiiiiiIIIII5);
                    }
                } else if (IiiiiiiiIIIII[IiiiiiiiIIIII4].startsWith("J")) {
                    IiiiiiiiIIIII2 = true;
                    if (this.IIiiIiiiIIiIi == null) {
                        this.IIiiIiiiIIiIi = new IIIiiiiiIiIiI("tx/tx" + IiiiiiiiIIIII[IiiiiiiiIIIII4].substring(1));
                    } else {
                        this.IIiiIiiiIIiIi.ALLATORIxDEMO("tx/tx" + IiiiiiiiIIIII[IiiiiiiiIIIII4].substring(1));
                    }
                } else if (IiiiiiiiIIIII[IiiiiiiiIIIII4].startsWith("S")) {
                    skin = IiiiiiiiIIIII[IiiiiiiiIIIII4].substring(1);
                } else if (IiiiiiiiIIIII[IiiiiiiiIIIII4].startsWith("C")) {
                    IiiiiiiiIIIII6 = com.xy.w.iiiiiiiiiiIiI.ALLATORIxDEMO((String)("tx/" + IiiiiiiiIIIII[IiiiiiiiIIIII4].substring(1)), (int)-2, (int)6, null);
                    this.iiIIIiiiiiiiI = this.iiIIIiiiiiiiI == null ? IiiiiiiiIIIII6 : this.iiIIIiiiiiiiI.ALLATORIxDEMO(IiiiiiiiIIIII6);
                } else if (IiiiiiiiIIIII[IiiiiiiiIIIII4].startsWith("B")) {
                    if (!SystemData.isWing) {
                        IiiiiiiiIIIII6 = IiiiiiiiIIIII[IiiiiiiiIIIII4].substring(1);
                        IiiiiiiiIIIII5 = com.xy.w.iiiiiiiiiiIiI.ALLATORIxDEMO((String)("tx/" + (String)IiiiiiiiIIIII6 + "0"), (int)-2, (int)-5, null);
                        this.iiIIIiiiiiiiI = this.iiIIIiiiiiiiI == null ? IiiiiiiiIIIII5 : this.iiIIIiiiiiiiI.ALLATORIxDEMO(IiiiiiiiIIIII5);
                        IiiiiiiiIIIII5 = com.xy.w.iiiiiiiiiiIiI.ALLATORIxDEMO((String)("tx/" + (String)IiiiiiiiIIIII6 + "1"), (int)-2, (int)5, null);
                        this.iiIIIiiiiiiiI = this.iiIIIiiiiiiiI.ALLATORIxDEMO(IiiiiiiiIIIII5);
                    }
                } else if (IiiiiiiiIIIII[IiiiiiiiIIIII4].startsWith("F")) {
                    IiiiiiiiIIIII3 = IiiiiiiiIIIII[IiiiiiiiIIIII4].substring(1);
                }
                ++IiiiiiiiIIIII4;
            }
        }
        if (skin != null && (roleShow == null || roleShow.getMount_id() == 0 || skin.length() < 10)) {
            IiiiiiiiIIIII = com.xy.w.iiiiiiiiiiIiI.ALLATORIxDEMO((String)skin, (int)2, (int)1, null);
            this.iiIIIiiiiiiiI = this.iiIIIiiiiiiiI == null ? IiiiiiiiIIIII : this.iiIIIiiiiiiiI.ALLATORIxDEMO(IiiiiiiiIIIII);
        } else if (SystemData.ISMOUNT && roleShow.getMount_id() != 0 && IiiiiiiiIIIII3 == null) {
            IiiiiiiiIIIII = com.xy.w.iiiiiiiiiiIiI.ALLATORIxDEMO((long)((long)roleShow.getMount_id() << 40 | roleShow.getSpecies_id().longValue()), (int)2, (int)1, null);
            this.iiIIIiiiiiiiI = this.iiIIIiiiiiiiI == null ? IiiiiiiiIIIII : this.iiIIIiiiiiiiI.ALLATORIxDEMO(IiiiiiiiIIIII);
        } else {
            IiiiiiiiIIIII = com.xy.w.iiiiiiiiiiIiI.ALLATORIxDEMO((long)roleShow.getSpecies_id().longValue(), (int)2, (int)1, null);
            this.iiIIIiiiiiiiI = this.iiIIIiiiiiiiI == null ? IiiiiiiiIIIII : this.iiIIIiiiiiiiI.ALLATORIxDEMO(IiiiiiiiIIIII);
        }
        this.iiIIIiiiiiiiI.ALLATORIxDEMO(IiiiiiiiIIIII3);
        if (!IiiiiiiiIIIII2) {
            this.IIiiIiiiIIiIi = null;
        }
        if (roleShow == null) return;
        ((iiIiIiiiiIiii)this).ALLATORIxDEMO(IiiiiiiiIIIII3 != null, roleShow.getMount_id() == 7);
    }

    public boolean ALLATORIxDEMO(int x, int y) {
        return this.iiIIIiiiiiiiI.ALLATORIxDEMO(x - this.iiIiIiiiiIIIi, y - this.IIiiiiiiiIIIi);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Unable to fully structure code
     */
    public FloatBox iIiIiiiiIIiii(String text) {
        if (text == null) return null;
        if (text.equals("")) {
            return null;
        }
        var2_2 = this;
        synchronized (var2_2) {
            IiiiiiiiIIIII = this.iiiiIiiiIiiII;
            if (true) ** GOTO lbl15
            do {
                if (IIiiIiiiiIIiI.ALLATORIxDEMO((String)text, (String)IiiiiiiiIIIII.getText())) {
                    return null;
                }
                IiiiiiiiIIIII = IiiiiiiiIIIII.nextFloatBox;
lbl15:
                // 2 sources

            } while (IiiiiiiiIIIII != null);
            IiiiiiiiIIIII = new FloatBox(text);
            this.ALLATORIxDEMO(IiiiiiiiIIIII);
            return IiiiiiiiIIIII;
        }
    }

    public boolean ALLATORIxDEMO() {
        if (this.IiIiiiiiIIIII == null) return false;
        if (!this.IiIiiiiiIIIII.iIiIiiiiIIiii()) return false;
        return true;
    }

    public void ALLATORIxDEMO(double sp) {
        if (this.IiIiiiiiIIIII == null) {
            return;
        }
        this.IiIiiiiiIIIII.setSp(sp);
    }

    public void iiiIiiiiiiIIi(Graphics g) {
    }

    public void ALLATORIxDEMO(long time, com.xy.n.iIiIIiiiIiiiI mapScene) {
        this.iiiiIiiiIIiii += time;
        if (this.IIiiIiiiIIiIi != null) {
            this.IIiiIiiiIIiIi.ALLATORIxDEMO(time);
        }
        if (this.IiIiiiiiIIIII != null) {
            this.IiIiiiiiIIIII.ALLATORIxDEMO(time, this);
        }
        this.iiiIiiiiiiIIi();
    }

    public FloatBox ALLATORIxDEMO(String text) {
        if (text == null) return null;
        if (text.equals("")) {
            return null;
        }
        FloatBox IiiiiiiiIIIII = new FloatBox(text);
        this.ALLATORIxDEMO(IiiiiiiiIIIII);
        return IiiiiiiiIIIII;
    }

    public void ALLATORIxDEMO(int x, int y, int z) {
        if (this.IiIiiiiiIIIII != null) {
            this.IiIiiiiiIIIII.setValue(0, 0L, null);
        }
        this.ALLATORIxDEMO(x, y, z, this.iiIiiiiiiiIii);
        this.ALLATORIxDEMO(2);
    }

    public void ALLATORIxDEMO(IiiiIiiiiIiIi part) {
        this.iiIIIiiiiiiiI = part;
    }

    public void iIiIiiiiIIiii(Graphics g) {
        int IiiiiiiiIIIII;
        Graphics2D IiiiiiiiIIIII2 = (Graphics2D)g;
        Object IiiiiiiiIIIII3 = IiiiiiiiIIIII2.getRenderingHint(RenderingHints.KEY_STROKE_CONTROL);
        Object IiiiiiiiIIIII4 = IiiiiiiiIIIII2.getRenderingHint(RenderingHints.KEY_ANTIALIASING);
        if (IiiiiiiiIIIII3 != RenderingHints.VALUE_STROKE_DEFAULT) {
            IiiiiiiiIIIII2.setRenderingHint(RenderingHints.KEY_STROKE_CONTROL, RenderingHints.VALUE_STROKE_DEFAULT);
        } else {
            IiiiiiiiIIIII3 = null;
        }
        if (IiiiiiiiIIIII4 != RenderingHints.VALUE_ANTIALIAS_ON) {
            IiiiiiiiIIIII2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        } else {
            IiiiiiiiIIIII4 = null;
        }
        g.setFont(iiIIiiiiIiiII.iIiIiiiiIiiii);
        int IiiiiiiiIIIII5 = this.iIiiIiiiIiIIi + 23;
        if (this.iiiIiiiiiiiIi != null) {
            if (this.ALLATORIxDEMO == 0) {
                this.ALLATORIxDEMO = g.getFontMetrics().stringWidth(this.iiiIiiiiiiiIi) / 2;
            }
            int n = this.iiIiiiiiiIIiI - this.ALLATORIxDEMO;
            g.setColor(iiIIiiiiIiiII.iiiiiiiiIIIii);
            g.drawString(this.iiiIiiiiiiiIi, IiiiiiiiIIIII + 1, IiiiiiiiIIIII5 + 1);
            g.setColor(iiIIiiiiIiiII.iiIIIiiiIiiIi);
            int n2 = IiiiiiiiIIIII5;
            IiiiiiiiIIIII5 += 19;
            g.drawString(this.iiiIiiiiiiiIi, IiiiiiiiIIIII, n2);
        }
        if (this.IIIiiiiiIIiII != null) {
            if (this.iIiIiiiiIiIii == 0) {
                this.iIiIiiiiIiIii = g.getFontMetrics().stringWidth(this.IIIiiiiiIIiII) / 2;
            }
            IiiiiiiiIIIII = this.iiIiiiiiiIIiI - this.iIiIiiiiIiIii;
            g.setColor(iiIIiiiiIiiII.iiiiiiiiIIIii);
            g.drawString(this.IIIiiiiiIIiII, IiiiiiiiIIIII + 1, IiiiiiiiIIIII5 + 1);
            g.setColor(iiIIiiiiIiiII.iiiiIiiiIIiii);
            g.drawString(this.IIIiiiiiIIiII, IiiiiiiiIIIII, IiiiiiiiIIIII5);
        }
        if (IiiiiiiiIIIII3 != null) {
            IiiiiiiiIIIII2.setRenderingHint(RenderingHints.KEY_STROKE_CONTROL, IiiiiiiiIIIII3);
        }
        if (IiiiiiiiIIIII4 == null) return;
        IiiiiiiiIIIII2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, IiiiiiiiIIIII4);
    }

    public static int ALLATORIxDEMO(int dir) {
        if (dir == 1) {
            return 0;
        }
        if (dir == 3) {
            return 5;
        }
        if (dir == 5) {
            return 1;
        }
        if (dir != 7) return 1;
        return 7;
    }

    public int iIiIiiiiIIiii() {
        return this.iiIiiiiiiiIii;
    }

    public void iIiIiiiiIIiii(String title) {
        this.iiiIiiiiiiiIi = title;
        this.ALLATORIxDEMO = 0;
    }

    public GameMove ALLATORIxDEMO() {
        return this.IiIiiiiiIIIII;
    }

    public void ALLATORIxDEMO() {
        if (this.IiIiiiiiIIIII == null) {
            return;
        }
        this.IiIiiiiiIIIII.setValue(0, 0L, null);
        this.ALLATORIxDEMO(2);
    }

    public IiiiIiiiiIiIi ALLATORIxDEMO() {
        return this.iiIIIiiiiiiiI;
    }

    public void ALLATORIxDEMO(String name) {
        this.IIIiiiiiIIiII = name;
        this.iIiIiiiiIiIii = 0;
    }

    public abstract void ALLATORIxDEMO(GameView var1);

    public int ALLATORIxDEMO() {
        if (this.iiIIIiiiiiiiI == null) return 0;
        return this.iiIIIiiiiiiiI.iiiIiiiiiiIIi();
    }

    public void ALLATORIxDEMO(Graphics g) {
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void ALLATORIxDEMO(FloatBox floatLabel) {
        iiiiiiiiiiIiI iiiiiiiiiiIiI2 = this;
        synchronized (iiiiiiiiiiIiI2) {
            if (this.iiiiIiiiIiiII == null) {
                this.iiiiIiiiIiiII = floatLabel;
                return;
            }
            floatLabel.nextFloatBox = this.iiiiIiiiIiiII;
            this.iiiiIiiiIiiII = floatLabel;
            return;
        }
    }
}
