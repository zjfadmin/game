/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.scene.BangTZ
 *  com.xy.scene.Build
 *  com.xy.scene.Scene
 *  com.xy.socket.Agreement
 *  com.xy.text.GameView
 *  com.xy.v.iIiIIiiiIiiiI
 *  com.xy.w.IIIIIiiiIiIii
 *  com.xy.w.IIIIIiiiIiiII
 *  com.xy.w.IIiIiiiiIiiIi
 *  com.xy.w.iiiiiiiiiiIiI
 */
package com.xy.scene;

import com.xy.scene.BangTZ;
import com.xy.scene.Build;
import com.xy.scene.Scene;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import com.xy.v.iIiIIiiiIiiiI;
import com.xy.w.IIIIIiiiIiIii;
import com.xy.w.IIIIIiiiIiiII;
import com.xy.w.IIiIiiiiIiiIi;
import com.xy.w.iiiiiiiiiiIiI;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.image.BufferedImage;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class BangFightScene
implements Scene {
    public static int MINSUM = 3;
    private Image t_xr;
    public int manstate;
    private Build[] builds = new Build[11];
    IIIIIiiiIiIii Huo;
    private GameView gameView;
    public BangTZ tz;
    private Image t_z;
    private IIIIIiiiIiIii Bg_Xt_Z;
    public int state;
    private Image t_xg;
    public Build buildMouse;

    /*
     * WARNING - void declaration
     */
    public void ALLATORIxDEMO(Graphics graphics) {
        void g;
        this.gameView.mapScene.iiiIiiiiiiIIi((Graphics)g, this.gameView);
        if (this.state != 1) return;
        if (this.gameView.mapScene.ALLATORIxDEMO() != 3315L) return;
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.builds.length) {
            if (this.builds[IiiiiiiiIIIII] != null) {
                this.builds[IiiiiiiiIIIII].ALLATORIxDEMO((Graphics)g, this.gameView.mapCamera);
            }
            ++IiiiiiiiIIIII;
        }
        if (this.Huo == null) {
            this.Huo = IIiIiiiiIiiIi.ALLATORIxDEMO((String)IIiIiiiiIiiIi.ALLATORIxDEMO((int)40));
        } else {
            this.Huo.ALLATORIxDEMO(iIiIIiiiIiiiI.ALLATORIxDEMO(), 0);
            Point IiiiiiiiIIIII2 = this.gameView.mapCamera.ALLATORIxDEMO(336, 466);
            if (IiiiiiiiIIIII2 != null) {
                this.Huo.ALLATORIxDEMO((Graphics)g, IiiiiiiiIIIII2.x, IiiiiiiiIIIII2.y);
            }
            if ((IiiiiiiiIIIII2 = this.gameView.mapCamera.ALLATORIxDEMO(11, 306)) != null) {
                this.Huo.ALLATORIxDEMO((Graphics)g, IiiiiiiiIIIII2.x, IiiiiiiiIIIII2.y);
            }
            if ((IiiiiiiiIIIII2 = this.gameView.mapCamera.ALLATORIxDEMO(350, 135)) != null) {
                this.Huo.ALLATORIxDEMO((Graphics)g, IiiiiiiiIIIII2.x, IiiiiiiiIIIII2.y);
            }
            if ((IiiiiiiiIIIII2 = this.gameView.mapCamera.ALLATORIxDEMO(684, 292)) != null) {
                this.Huo.ALLATORIxDEMO((Graphics)g, IiiiiiiiIIIII2.x, IiiiiiiiIIIII2.y);
            }
        }
        this.iIiIiiiiIIiii((Graphics)g);
        if (this.tz == null) return;
        if (!this.tz.ALLATORIxDEMO((Graphics)g, this)) return;
        this.tz = null;
    }

    public void iIiIiiiiIIiii(Graphics g) {
        if (this.t_xg == null) {
            return;
        }
        g.drawImage(this.t_z, this.gameView.mapCamera.IIiiIiiiIIiIi.Screen_x / 2 - 274, 75, null);
        this.Bg_Xt_Z.ALLATORIxDEMO(System.currentTimeMillis(), 0);
        this.Bg_Xt_Z.ALLATORIxDEMO(g, this.gameView.mapCamera.IIiiIiiiIIiIi.Screen_x / 2, 105);
        Build IiiiiiiiIIIII = this.builds[1];
        double IiiiiiiiIIIII2 = (double)IiiiiiiiIIIII.getHp() / 4000.0;
        int IiiiiiiiIIIII3 = (int)(IiiiiiiiIIIII2 * 226.0);
        if (IiiiiiiiIIIII2 < 0.3) {
            g.drawImage(this.t_xr, this.gameView.mapCamera.IIiiIiiiIIiIi.Screen_x / 2 - 43 - IiiiiiiiIIIII3, 96, IiiiiiiiIIIII3, 13, null);
        } else {
            g.drawImage(this.t_xg, this.gameView.mapCamera.IIiiIiiiIIiIi.Screen_x / 2 - 43 - IiiiiiiiIIIII3, 96, IiiiiiiiIIIII3, 13, null);
        }
        IiiiiiiiIIIII = this.builds[6];
        IiiiiiiiIIIII2 = (double)IiiiiiiiIIIII.getHp() / 4000.0;
        IiiiiiiiIIIII3 = (int)(IiiiiiiiIIIII2 * 226.0);
        if (IiiiiiiiIIIII2 < 0.3) {
            g.drawImage(this.t_xr, this.gameView.mapCamera.IIiiIiiiIIiIi.Screen_x / 2 + 43, 96, IiiiiiiiIIIII3, 13, null);
            return;
        }
        g.drawImage(this.t_xg, this.gameView.mapCamera.IIiiIiiiIIiIi.Screen_x / 2 + 43, 96, IiiiiiiiIIIII3, 13, null);
    }

    public void ALLATORIxDEMO(String[] vs) {
    }

    public void ALLATORIxDEMO(Build build) {
        this.buildMouse = build;
        String IiiiiiiiIIIII = Agreement.getSendTextAES((String)"gangmonitor", (String)String.valueOf(build.getBh()));
        this.gameView.getClient().ALLATORIxDEMO(IiiiiiiiIIIII);
    }

    public static boolean ALLATORIxDEMO(Image image, int x, int y) {
        if (image == null) {
            return false;
        }
        if (x < 0) return false;
        if (x >= image.getWidth(null)) return false;
        if (y < 0) return false;
        if (y >= image.getHeight(null)) return false;
        BufferedImage IiiiiiiiIIIII = null;
        if (!(image instanceof BufferedImage)) return true;
        IiiiiiiiIIIII = (BufferedImage)image;
        if (IiiiiiiiIIIII.getRGB(x, y) == 0) return false;
        return true;
    }

    public boolean ALLATORIxDEMO() {
        if (this.state != 1) return true;
        if (this.gameView.mapScene.ALLATORIxDEMO() != 3315L) return true;
        if (this.manstate == 0) return true;
        if (this.manstate == 1) return true;
        if (this.manstate != -1) return false;
        return true;
    }

    public void iIiIiiiiIIiii(String[] v) {
        if (this.t_xg == null) {
            this.t_xg = IIIIIiiiIiiII.iiiIiiiiiiIIi((String)"sc/c/74");
            this.t_xr = IIIIIiiiIiiII.iiiIiiiiiiIIi((String)"sc/c/75");
            this.t_z = IIIIIiiiIiiII.iiiIiiiiiiIIi((String)"sc/c/76");
            this.Bg_Xt_Z = iiiiiiiiiiIiI.ALLATORIxDEMO((String)"sc/bang/BgXtZ.tcp", null);
        }
        if (v == null) {
            this.state = 0;
            return;
        }
        int IiiiiiiiIIIII = Integer.parseInt(v[0]);
        if (IiiiiiiiIIIII == 0) {
            this.state = Integer.parseInt(v[1]);
            this.manstate = Integer.parseInt(v[2]);
        }
        int IiiiiiiiIIIII2 = IiiiiiiiIIIII == 1 ? 1 : 3;
        while (IiiiiiiiIIIII2 < v.length) {
            int IiiiiiiiIIIII3;
            String[] IiiiiiiiIIIII4 = v[IiiiiiiiIIIII2].split("=");
            int IiiiiiiiIIIII5 = Integer.parseInt(IiiiiiiiIIIII4[0]);
            int n = IiiiiiiiIIIII3 = IiiiiiiiIIIII5 > 5 ? IiiiiiiiIIIII5 - 5 : IiiiiiiiIIIII5;
            if (this.builds[IiiiiiiiIIIII3] == null) {
                this.builds[IiiiiiiiIIIII3] = new Build(IiiiiiiiIIIII5, Integer.parseInt(IiiiiiiiIIIII4[1]), Integer.parseInt(IiiiiiiiIIIII4[2]), Integer.parseInt(IiiiiiiiIIIII4[3]));
            } else {
                this.builds[IiiiiiiiIIIII3].setState(Integer.parseInt(IiiiiiiiIIIII4[2]));
                this.builds[IiiiiiiiIIIII3].setHp(Integer.parseInt(IiiiiiiiIIIII4[3]));
            }
            ++IiiiiiiiIIIII2;
        }
    }

    public int getSceneId() {
        return 0;
    }

    public BangFightScene(String[] vs, GameView gameView) {
        this.gameView = gameView;
        this.iIiIiiiiIIiii(vs);
    }

    public boolean ALLATORIxDEMO(int x, int y) {
        if (!this.gameView.roleUnit.iIiIiiiiIIiIi()) {
            return false;
        }
        if (this.state != 1) return false;
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.builds.length) {
            if (this.builds[IiiiiiiiIIIII] != null && this.builds[IiiiiiiiIIIII].getImage() != null && BangFightScene.ALLATORIxDEMO(this.builds[IiiiiiiiIIIII].getImage(), x - this.builds[IiiiiiiiIIIII].getX() + this.builds[IiiiiiiiIIIII].getPx(), y - this.builds[IiiiiiiiIIIII].getY() + this.builds[IiiiiiiiIIIII].getPy())) {
                this.ALLATORIxDEMO(this.builds[IiiiiiiiIIIII]);
                return true;
            }
            ++IiiiiiiiIIIII;
        }
        return false;
    }

    public void ALLATORIxDEMO() {
    }

    public GameView getGameView() {
        return this.gameView;
    }
}
