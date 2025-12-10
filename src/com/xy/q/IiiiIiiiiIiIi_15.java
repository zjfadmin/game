/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.iiIiIiiiiiIIi
 *  com.xy.game.RoleData
 *  com.xy.i.IIiiIiiiIiiiI
 *  com.xy.i.IiiIiiiiIIIii
 *  com.xy.q.IIiiIiiiIIiIi
 *  com.xy.q.IIiiIiiiiIIiI
 *  com.xy.q.iIIIiiiiIiIII
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.q.iiiiiiiiiiIiI
 *  com.xy.socket.GameClient
 *  com.xy.text.GameView
 *  com.xy.v.IiiiiiiiiIIII
 *  com.xy.v.iiiiiiiiIIIII
 *  com.xy.w.IIIIIiiiIiiII
 *  com.xy.w.IIiIiiiiIIiii
 */
package com.xy.q;

import com.xy.a.iiIiIiiiiiIIi;
import com.xy.game.RoleData;
import com.xy.i.IIiiIiiiIiiiI;
import com.xy.i.IiiIiiiiIIIii;
import com.xy.q.IIiiIiiiIIiIi;
import com.xy.q.IIiiIiiiiIIiI;
import com.xy.q.iIIIiiiiIiIII;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.q.iiiiiiiiiiIiI;
import com.xy.socket.GameClient;
import com.xy.text.GameView;
import com.xy.v.IiiiiiiiiIIII;
import com.xy.v.iiiiiiiiIIIII;
import com.xy.w.IIIIIiiiIiiII;
import com.xy.w.IIiIiiiiIIiii;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.lang.reflect.Field;
import javax.swing.JComponent;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class IiiiIiiiiIiIi
extends JComponent
implements MouseListener,
MouseMotionListener {
    public GameView iiIIiiiiIiIIi;
    public static Field IiIIiiiiIIIII;
    public static byte iIIIIiiiiiIIi;
    public static Field IiiIIiiiiiiiI;
    public static iiiiiiiiIIIII IIiiiiiiIiiII;
    private int IiiiIiiiIiIII;
    private int IIiiiiiiiIIIi;
    private int IIIiiiiiIIiII;
    private int iiIiiiiiiIIiI;
    public static Field iIiiIiiiIiIIi;
    protected String iiiiIiiiIIiii;
    public static byte iIIiIiiiiiiIi;
    protected IIiIiiiiIIiii IIIIiiiiiiiII;
    public static byte iiIIIiiiiiiiI;
    protected IiiIiiiiIIIii IiIiiiiiIIIII;
    public static Field iiIiIiiiiIIIi;
    protected boolean iiiiIiiiIiiII;
    private int iiiIiiiiiiiIi;
    public static Field iIiiIiiiiiiII;
    protected iIIIiiiiIiIII IIiiIiiiIIiIi;
    protected Image iIiIiiiiIiIii;
    private int IiIIIiiiiIiiI;
    private boolean iiIiiiiiiiIii;
    protected iiiiiiiiIIIII IiiiiiiiIIIII;
    private static Image ALLATORIxDEMO;

    public IiiiIiiiiIiIi ALLATORIxDEMO() {
        return this;
    }

    public void iIiIiiiiIIiii(boolean texture) {
        this.iiIiiiiiiiIii = texture;
        if (!texture) return;
        if (ALLATORIxDEMO != null) return;
        ALLATORIxDEMO = IIIIIiiiIiiII.iiiIiiiiiiIIi((String)"sc/d/2.png");
    }

    public void iiiIiiiiiiIIi(String backString) {
        this.iiiiIiiiIIiii = backString;
        this.iIiIiiiiIiIii = null;
    }

    public boolean ALLATORIxDEMO() {
        if (this.isVisible()) {
            this.ALLATORIxDEMO(false);
        }
        this.setVisible(false);
        this.iiIIiiiiIiIIi.remove((Component)this);
        if (this.iiIiiiiiiIIiI == 6) {
            this.iiIiiiiiiIIiI = 2;
            return true;
        }
        if (this.iiIiiiiiiIIiI != 3) return false;
        return true;
    }

    public void iIiIiiiiIIiii(String backString) {
        this.ALLATORIxDEMO(this.IIIIiiiiiiiII, backString);
    }

    public void ALLATORIxDEMO(int formLvl) {
        this.iiIiiiiiiIIiI = formLvl;
    }

    public int iIiIiiiiIIiii() {
        return this.iiiIiiiiiiiIi;
    }

    @Override
    public void paint(Graphics g) {
        if (this.iiiiIiiiIiiII) {
            this.revalidate();
            this.iiiiIiiiIiiII = false;
        }
        super.paint(g);
    }

    public IIiiIiiiIiiiI[] ALLATORIxDEMO(IIiiIiiiiIIiI boxJComponent, IIiiIiiiIiiiI[] pageBtns, int px, int py) {
        int IiiiiiiiIIIII = this.ALLATORIxDEMO().goodPacks.length / 24;
        if (pageBtns != null) {
            if (pageBtns.length == IiiiiiiiIIIII) return pageBtns;
        }
        pageBtns = this.ALLATORIxDEMO(pageBtns, IiiiiiiiIIIII, false);
        int IiiiiiiiIIIII2 = 0;
        while (IiiiiiiiIIIII2 < pageBtns.length) {
            IIiiIiiiIiiiI iIiiIiiiIiiiI = pageBtns[IiiiiiiiIIIII2];
            int n = py + IiiiiiiiIIIII2 * 35;
            ++IiiiiiiiIIIII2;
            iIiiIiiiIiiiI.setBounds(px, n, 36, 33);
        }
        boxJComponent.ALLATORIxDEMO(pageBtns, 0);
        return pageBtns;
    }

    public IiiiiiiiiIIII ALLATORIxDEMO() {
        return this.iiIIiiiiIiIIi.getObjectArea();
    }

    @Override
    public void mouseMoved(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (this.IIIIiiiiiiiII != null) {
            if (this.IiiiiiiiIIIII != null) {
                g.translate(this.IiiiiiiiIIIII.iiiIiiiiiiIIi(), this.IiiiiiiiIIIII.iIiIiiiiIIiii());
                this.IIIIiiiiiiiII.ALLATORIxDEMO(g, this.getWidth() - this.IiiiiiiiIIIII.ALLATORIxDEMO(), this.getHeight() - this.IiiiiiiiIIIII.iiiiiiiiIIiii());
                g.translate(-this.IiiiiiiiIIIII.iiiIiiiiiiIIi(), -this.IiiiiiiiIIIII.iIiIiiiiIIiii());
            } else {
                this.IIIIiiiiiiiII.ALLATORIxDEMO(g, this.getWidth(), this.getHeight());
            }
        } else if (this.iiiiIiiiIIiii != null) {
            if (this.iIiIiiiiIiIii == null) {
                this.iIiIiiiiIiIii = IIIIIiiiIiiII.iiiIiiiiiiIIi((String)this.iiiiIiiiIIiii);
            }
            if (this.IiiiiiiiIIIII != null) {
                g.drawImage(this.iIiIiiiiIiIii, this.IiiiiiiiIIIII.iiiIiiiiiiIIi(), this.IiiiiiiiIIIII.iIiIiiiiIIiii(), this.getWidth() - this.IiiiiiiiIIIII.ALLATORIxDEMO(), this.getHeight() - this.IiiiiiiiIIIII.iiiiiiiiIIiii(), null);
            } else {
                g.drawImage(this.iIiIiiiiIiIii, 0, 0, this.getWidth(), this.getHeight(), null);
            }
        }
        if (!this.iiIiiiiiiiIii) return;
        g.drawImage(ALLATORIxDEMO, 17, 3, 800, 529, null);
    }

    /*
     * WARNING - void declaration
     */
    public IiiiIiiiiIiIi(int n, int n2, byte by, GameView gameView) {
        void gameView2;
        void formLvl;
        void formId;
        this.iiiIiiiiiiiIi = formId;
        this.iiIiiiiiiIIiI = formLvl;
        this.iiIIiiiiIiIIi = gameView2;
        if (by == iIIIIiiiiiIIi) {
            this.addMouseMotionListener(this);
            this.addMouseListener(this);
        }
        if (formId < 0) return;
        this.setVisible(false);
    }

    public void ALLATORIxDEMO(IIiIiiiiIIiii backCut, String backString) {
        if (backCut != null) {
            this.iiiiIiiiIIiii = null;
            this.iIiIiiiiIiIii = null;
            this.IIIIiiiiiiiII = backCut;
            if (backString == null) return;
            this.ALLATORIxDEMO(backString);
            return;
        }
        this.iiiiIiiiIIiii = backString;
        this.iIiIiiiiIiIii = null;
        this.IIIIiiiiiiiII = backCut;
    }

    public void iIiIiiiiIIiii(int show_x, int show_y, int width, int height) {
        int IiiiiiiiIIIII;
        this.IiIIIiiiiIiiI = show_x;
        this.IiiiIiiiIiIII = show_y;
        if (this.IiIiiiiiIIIII != null && (IiiiiiiiIIIII = width - this.getWidth()) != 0) {
            this.IiIiiiiiIIIII.setBounds(this.IiIiiiiiIIIII.getX() + IiiiiiiiIIIII, this.IiIiiiiiIIIII.getY(), this.IiIiiiiiIIIII.getWidth(), this.IiIiiiiiIIIII.getHeight());
        }
        if (show_x == -1) {
            IiiiiiiiIIIII = (this.iiIIiiiiIiIIi.screenData.getScreen_x() - width) / 2;
            int IiiiiiiiIIIII2 = (this.iiIIiiiiIiIIi.screenData.getScreen_y() - height) / 2;
            this.setBounds(IiiiiiiiIIIII > 0 ? IiiiiiiiIIIII : 0, IiiiiiiiIIIII2 > 0 ? IiiiiiiiIIIII2 : 0, width, height);
            return;
        }
        if (show_x == -2) {
            IiiiiiiiIIIII = (this.iiIIiiiiIiIIi.screenData.getScreen_x() / 2 - width) / 2;
            int IiiiiiiiIIIII3 = (this.iiIIiiiiIiIIi.screenData.getScreen_y() - height) / 2;
            this.setBounds(IiiiiiiiIIIII > 0 ? IiiiiiiiIIIII : 0, IiiiiiiiIIIII3 > 0 ? IiiiiiiiIIIII3 : 0, width, height);
            return;
        }
        if (show_x == -3) {
            IiiiiiiiIIIII = (this.iiIIiiiiIiIIi.screenData.getScreen_x() / 2 * 3 - width) / 2;
            int IiiiiiiiIIIII4 = (this.iiIIiiiiIiIIi.screenData.getScreen_y() - height) / 2;
            this.setBounds(IiiiiiiiIIIII > 0 ? IiiiiiiiIIIII : 0, IiiiiiiiIIIII4 > 0 ? IiiiiiiiIIIII4 : 0, width, height);
            return;
        }
        if (show_x != -9) {
            this.setBounds(show_x, show_y, width, height);
            return;
        }
        IiiiiiiiIIIII = this.iiIIiiiiIiIIi.screenData.getScreen_x() - width;
        int IiiiiiiiIIIII5 = 215;
        this.setBounds(IiiiiiiiIIIII > 0 ? IiiiiiiiIIIII : 0, IiiiiiiiIIIII5 > 0 ? IiiiiiiiIIIII5 : 0, width, height);
    }

    public IIiiIiiiIiiiI[] ALLATORIxDEMO(iiiiiiiiiiIiI packBox, IIiiIiiiIiiiI[] pageBtns, int px, int py) {
        int IiiiiiiiIIIII = (packBox.ALLATORIxDEMO() ? 1 : 0) + this.ALLATORIxDEMO().goodPacks.length / 24;
        if (pageBtns != null) {
            if (pageBtns.length == IiiiiiiiIIIII) return pageBtns;
        }
        pageBtns = this.ALLATORIxDEMO(pageBtns, IiiiiiiiIIIII, packBox.ALLATORIxDEMO());
        int IiiiiiiiIIIII2 = 0;
        while (IiiiiiiiIIIII2 < pageBtns.length) {
            IIiiIiiiIiiiI iIiiIiiiIiiiI = pageBtns[IiiiiiiiIIIII2];
            int n = py + IiiiiiiiIIIII2 * 35;
            ++IiiiiiiiIIIII2;
            iIiiIiiiIiiiI.setBounds(px, n, 36, 33);
        }
        packBox.ALLATORIxDEMO(pageBtns, 0);
        return pageBtns;
    }

    public void iIiIiiiiIIiii() {
        if (this.getX() > this.iiIIiiiiIiIIi.screenData.Screen_x || this.getY() > this.iiIIiiiiIiIIi.screenData.Screen_y) {
            this.iIiIiiiiIIiii(this.IiIIIiiiiIiiI, this.IiiiIiiiIiIII, this.getWidth(), this.getHeight());
        }
        if (!this.isVisible()) {
            this.ALLATORIxDEMO(true);
        }
        this.setVisible(true);
        this.iiiiIiiiIiiII = true;
        this.iiIIiiiiIiIIi.add((Component)this);
    }

    public void ALLATORIxDEMO(int x, int y, int h) {
        this.IIiiIiiiIIiIi.ALLATORIxDEMO(x, y, h);
    }

    public RoleData ALLATORIxDEMO() {
        return this.iiIIiiiiIiIIi.roleData;
    }

    @Override
    public void setBounds(int x, int y, int width, int height) {
        try {
            if (this.getX() != x) {
                iIiiIiiiIiIIi.set(this, x);
            }
            if (this.getY() != y) {
                IiiIIiiiiiiiI.set(this, y);
            }
            if (this.getWidth() != width) {
                iIiiIiiiiiiII.set(this, width);
            }
            if (this.getHeight() == height) return;
            IiIIiiiiIIIII.set(this, height);
            return;
        }
        catch (Exception IiiiiiiiIIIII) {
            IiiiiiiiIIIII.printStackTrace();
        }
    }

    /*
     * WARNING - void declaration
     */
    public void ALLATORIxDEMO(int n, int n2, int n3, int n4, byte by) {
        void height;
        void width;
        void show_y;
        void show_x;
        this.setLayout(null);
        this.setBackground(iiIIiiiiIiiII.IIiIiiiiIIiII);
        this.iIiIiiiiIIiii((int)show_x, (int)show_y, (int)width, (int)height);
        if (by != iiIIIiiiiiiiI) return;
        this.IiIiiiiiIIIII = new IiiIiiiiIIIii("sc/c/60", 1, this.iiiIiiiiiiiIi, this);
        this.IiIiiiiiIIIII.setBounds((int)(width - 37), 8, 25, 25);
        this.add((Component)this.IiIiiiiiIIIII);
    }

    @Override
    public void mousePressed(MouseEvent e) {
        if (this.iiIIiiiiIiIIi.choseImg.iIiIiiiiIiIii != 0 && e.isMetaDown()) {
            this.iiIIiiiiIiIIi.choseImg.ALLATORIxDEMO();
            return;
        }
        if (this.iiiIiiiiiiiIi >= 0) {
            if (e.isMetaDown()) {
                if (this.iiiIiiiiiiiIi != 108) {
                    this.ALLATORIxDEMO().iiiIiiiiiiIIi(this.iiiIiiiiiiiIi);
                }
            } else {
                this.ALLATORIxDEMO().IiiIiiiiiiIiI(this.iiiIiiiiiiiIi);
            }
        }
        this.IIIiiiiiIIiII = e.getX();
        this.IIiiiiiiiIIIi = e.getY();
    }

    public void ALLATORIxDEMO(String value, IIiIiiiiIIiii imgCut) {
        if (this.IIiiIiiiIIiIi == null) {
            this.IIiiIiiiIIiIi = new iIIIiiiiIiIII();
            this.add((Component)this.IIiiIiiiIIiIi);
            this.iIiIiiiiIIiii(true);
            this.ALLATORIxDEMO(IIiiiiiiIiiII);
            this.ALLATORIxDEMO(3, 76, 32);
        }
        this.IIiiIiiiIIiIi.ALLATORIxDEMO(value, imgCut);
        this.ALLATORIxDEMO(0, 5, 43, 183 + value.length() * 33);
    }

    public void ALLATORIxDEMO(boolean show) {
        if (this.iiiIiiiiiiiIi < 0) return;
        if (this.iiiIiiiiiiiIi == 42) return;
        if (this.iiiIiiiiiiiIi == 45) return;
        if (this.iiiIiiiiiiiIi == 46) return;
        if (this.iiiIiiiiiiiIi == 77) return;
        if (this.iiiIiiiiiiiIi == 154) {
            return;
        }
        this.iiIIiiiiIiIIi.iIiIiiiiIIiii(false, show ? "\u5f00\u5173\u7a97\u53e3.mp3" : "\u5173\u95ed\u7a97\u53e3.mp3");
    }

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    static {
        IIiiiiiiIiiII = new iiiiiiiiIIIII(14, 0, 0, 0);
        iIIiIiiiiiiIi = 0;
        iIIIIiiiiiIIi = 1;
        iiIIIiiiiiiiI = 1;
        try {
            Class<Component> IiiiiiiiIIIII = Component.class;
            iIiiIiiiIiIIi = IiiiiiiiIIIII.getDeclaredField("x");
            IiiIIiiiiiiiI = IiiiiiiiIIIII.getDeclaredField("y");
            iIiiIiiiiiiII = IiiiiiiiIIIII.getDeclaredField("width");
            IiIIiiiiIIIII = IiiiiiiiIIIII.getDeclaredField("height");
            iiIiIiiiiIIIi = IiiiiiiiIIIII.getDeclaredField("visible");
            iIiiIiiiIiIIi.setAccessible(true);
            IiiIIiiiiiiiI.setAccessible(true);
            iIiiIiiiiiiII.setAccessible(true);
            IiIIiiiiIIIII.setAccessible(true);
            iiIiIiiiiIIIi.setAccessible(true);
        }
        catch (Exception IiiiiiiiIIIII) {
            IiiiiiiiIIIII.printStackTrace();
        }
    }

    public GameClient ALLATORIxDEMO() {
        return this.iiIIiiiiIiIIi.getClient();
    }

    public int ALLATORIxDEMO() {
        return this.iiIiiiiiiIIiI;
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        if (!this.isVisible()) return;
        int IiiiiiiiIIIII = e.getX() - this.IIIiiiiiIIiII;
        int IiiiiiiiIIIII2 = e.getY() - this.IIiiiiiiiIIIi;
        this.setBounds(IiiiiiiiIIIII + this.getX(), IiiiiiiiIIIII2 + this.getY(), this.getWidth(), this.getHeight());
    }

    @Override
    public void repaint(long tm, int x, int y, int width, int height) {
    }

    public void ALLATORIxDEMO() {
    }

    public void ALLATORIxDEMO(iiiiiiiiIIIII borderPoint) {
        int IiiiiiiiIIIII = this.getWidth() - (this.IiiiiiiiIIIII != null ? this.IiiiiiiiIIIII.iIiIiiiiIIiIi() : 0);
        int IiiiiiiiIIIII2 = this.IiiiiiiiIIIII != null ? this.IiiiiiiiIIIII.IiiIiiiiiiIiI() : 0;
        this.IiiiiiiiIIIII = borderPoint;
        if (this.IiIiiiiiIIIII == null) return;
        IiiiiiiiIIIII = this.getWidth() - (borderPoint != null ? borderPoint.iIiIiiiiIIiIi() : 0) - IiiiiiiiIIIII;
        IiiiiiiiIIIII2 = (borderPoint != null ? borderPoint.IiiIiiiiiiIiI() : 0) - IiiiiiiiIIIII2;
        if (IiiiiiiiIIIII == 0) {
            if (IiiiiiiiIIIII2 == 0) return;
        }
        this.IiIiiiiiIIIII.setBounds(this.IiIiiiiiIIIII.getX() + IiiiiiiiIIIII, this.IiIiiiiiIIIII.getY(), this.IiIiiiiiIIIII.getWidth(), this.IiIiiiiiIIIII.getHeight());
    }

    public void ALLATORIxDEMO(int x, int y, int width, int height) {
        this.IIiiIiiiIIiIi.setBounds(x, y, width, height);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void setVisible(boolean aFlag) {
        if (aFlag == this.isVisible()) {
            return;
        }
        try {
            iiIiIiiiiIIIi.set(this, aFlag);
            return;
        }
        catch (Exception IiiiiiiiIIIII) {
            IiiiiiiiIIIII.printStackTrace();
            return;
        }
    }

    public void ALLATORIxDEMO(String value) {
        this.ALLATORIxDEMO(value, IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/3.png", (int)20, (int)66, (int)13, (int)157, (boolean)false));
    }

    public IIiiIiiiIIiIi ALLATORIxDEMO() {
        return this.iiIIiiiiIiIIi.getFormManagement();
    }

    public IIiiIiiiIiiiI[] ALLATORIxDEMO(IIiiIiiiIiiiI[] pageBtns, int num, boolean task) {
        if (pageBtns != null && pageBtns.length == num) {
            return pageBtns;
        }
        IIiiIiiiIiiiI[] IiiiiiiiIIIII = new IIiiIiiiIiiiI[num];
        int IiiiiiiiIIIII2 = 0;
        int IiiiiiiiIIIII3 = pageBtns != null ? pageBtns.length : 0;
        while (IiiiiiiiIIIII2 < IiiiiiiiIIIII.length) {
            if (IiiiiiiiIIIII2 < IiiiiiiiIIIII3) {
                IiiiiiiiIIIII[IiiiiiiiIIIII2] = pageBtns[IiiiiiiiIIIII2];
            } else {
                IiiiiiiiIIIII[IiiiiiiiIIIII2] = new IIiiIiiiIiiiI("sc/e/" + (8 + IiiiiiiiIIIII2) + ".png", 2, IiiiiiiiIIIII2);
                if (this instanceof iiIiIiiiiiIIi) {
                    ((iiIiIiiiiiIIi)this).ALLATORIxDEMO().add((Component)IiiiiiiiIIIII[IiiiiiiiIIIII2], 0);
                } else {
                    this.add((Component)IiiiiiiiIIIII[IiiiiiiiIIIII2]);
                }
            }
            ++IiiiiiiiIIIII2;
        }
        if (!task) return IiiiiiiiIIIII;
        IiiiiiiiIIIII2 = 0;
        while (IiiiiiiiIIIII2 < IiiiiiiiIIIII.length) {
            IiiiiiiiIIIII[IiiiiiiiIIIII2].setBtnPath(IiiiiiiiIIIII2 + 1 == IiiiiiiiIIIII.length ? "sc/e/13.png" : "sc/e/" + (8 + IiiiiiiiIIIII2) + ".png");
            ++IiiiiiiiIIIII2;
        }
        return IiiiiiiiIIIII;
    }

    public GameView ALLATORIxDEMO() {
        return this.iiIIiiiiIiIIi;
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }
}
