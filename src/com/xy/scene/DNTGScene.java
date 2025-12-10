/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.q.iiIiiiiiiIIii
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.scene.CountDown
 *  com.xy.scene.DNTGNV
 *  com.xy.scene.DNTGSG
 *  com.xy.scene.Scene
 *  com.xy.text.GameView
 */
package com.xy.scene;

import com.xy.a.q.iiIiiiiiiIIii;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.scene.CountDown;
import com.xy.scene.DNTGNV;
import com.xy.scene.DNTGSG;
import com.xy.scene.Scene;
import com.xy.text.GameView;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.math.BigDecimal;
import javax.swing.ImageIcon;

public class DNTGScene
implements Scene {
    private static Image image;
    private static Image XY;
    private CountDown countDown;
    private static Image XZ;
    private boolean is2;
    private String DN_TT_KJ;
    private BigDecimal DN_JF;
    private boolean is1;
    private String DN_HGS_KJ;
    private DNTGSG DNTGSg;
    private GameView gameView;
    private int camp;
    private BigDecimal DN_JB;
    private String DN_SLs;
    private DNTGNV DNTGNv;

    public void iIiIiiiiIIiii() {
        ((iiIiiiiiiIIii)this.gameView.getFormManagement().iiiIiiiiiiIIi(98)).iIiIiiiiIIiIi(this.DN_SLs);
        this.gameView.getFormManagement().iIiIiiiiIIiIi(98);
    }

    /*
     * WARNING - void declaration
     */
    public void ALLATORIxDEMO(Graphics graphics) {
        void g;
        this.gameView.mapScene.iiiIiiiiiiIIi((Graphics)g, this.gameView);
        if (this.is1) {
            g.drawImage(image, 0, 120, null);
            iiIIiiiiIiiII.ALLATORIxDEMO((Graphics)g, (BigDecimal)this.DN_JB, (int)25, (int)253);
            iiIIiiiiIiiII.ALLATORIxDEMO((Graphics)g, (BigDecimal)this.DN_JF, (int)25, (int)303);
            g.setColor(Color.white);
            g.drawString(this.DN_HGS_KJ, 90, 377);
            g.drawString(this.DN_TT_KJ, 90, 454);
            g.drawImage(XZ, 160, 180, null);
        } else {
            g.drawImage(XY, 0, 180, null);
        }
        if (this.countDown != null) {
            this.countDown.ALLATORIxDEMO((Graphics)g, this.gameView);
        }
        if (this.DNTGNv == null) {
            if (this.DNTGSg == null) return;
            this.DNTGSg.ALLATORIxDEMO((Graphics)g, this.gameView);
            return;
        }
        if (this.is2) {
            this.DNTGNv.ALLATORIxDEMO((Graphics)g, this.gameView);
            g.drawImage(XY, this.gameView.screenData.Screen_x - this.DNTGNv.getImage().getWidth(null) + 10, 190, null);
            return;
        }
        g.drawImage(XZ, this.gameView.screenData.Screen_x - 20, 190, null);
    }

    public void ALLATORIxDEMO() {
    }

    public void setCamp(int camp) {
        this.camp = camp;
    }

    public boolean ALLATORIxDEMO(int x, int y) {
        x -= this.gameView.mapCamera.ALLATORIxDEMO();
        y -= this.gameView.mapCamera.iIiIiiiiIIiii();
        if (this.is1) {
            if (x >= 160 && x <= 180 && y >= 180 && y <= 205) {
                this.is1 = !this.is1;
                return true;
            }
        } else if (x >= 0 && x <= 20 && y >= 180 && y <= 205) {
            this.is1 = !this.is1;
            return true;
        }
        if (this.DNTGNv == null) return false;
        if (this.is2) {
            if (y < 190) return false;
            if (y > 215) return false;
            if (x < this.gameView.screenData.Screen_x - this.DNTGNv.getImage().getWidth(null) + 10) return false;
            if (x > this.gameView.screenData.Screen_x - this.DNTGNv.getImage().getWidth(null) + 30) return false;
            this.is2 = !this.is2;
            return true;
        }
        if (x < this.gameView.screenData.Screen_x - 20) return false;
        if (x > this.gameView.screenData.Screen_x) return false;
        if (y < 190) return false;
        if (y > 215) return false;
        this.is2 = !this.is2;
        return true;
    }

    public int getCamp() {
        return this.camp;
    }

    public BigDecimal getDN_JF() {
        return this.DN_JF;
    }

    public void setDN_JF(BigDecimal dN_JF) {
        this.DN_JF = dN_JF;
    }

    public BigDecimal getDN_JB() {
        return this.DN_JB;
    }

    public int getSceneId() {
        return 1011;
    }

    public void setDN_JB(BigDecimal dN_JB) {
        this.DN_JB = dN_JB;
    }

    public void ALLATORIxDEMO(String[] vs) {
        int IiiiiiiiIIIII = 1;
        while (IiiiiiiiIIIII < vs.length) {
            iiIiiiiiiIIii IiiiiiiiIIIII2;
            if (vs[IiiiiiiiIIIII].startsWith("M")) {
                this.DN_JB = new BigDecimal(vs[IiiiiiiiIIIII].substring(1));
            } else if (vs[IiiiiiiiIIIII].startsWith("J")) {
                this.DN_JF = new BigDecimal(vs[IiiiiiiiIIIII].substring(1));
            } else if (vs[IiiiiiiiIIIII].startsWith("K")) {
                if (vs[IiiiiiiiIIIII].startsWith("K0")) {
                    this.DN_TT_KJ = vs[IiiiiiiiIIIII].substring(2);
                } else {
                    this.DN_HGS_KJ = vs[IiiiiiiiIIIII].substring(2);
                }
            } else if (vs[IiiiiiiiIIIII].startsWith("N")) {
                if (vs[IiiiiiiiIIIII].length() == 1) {
                    this.DNTGNv = null;
                } else {
                    if (this.DNTGNv == null) {
                        this.DNTGNv = new DNTGNV();
                    }
                    if (vs[IiiiiiiiIIIII].startsWith("N0")) {
                        this.DNTGNv.ALLATORIxDEMO(0, vs[IiiiiiiiIIIII].substring(2));
                    } else if (vs[IiiiiiiiIIIII].startsWith("N1")) {
                        this.DNTGNv.ALLATORIxDEMO(1, vs[IiiiiiiiIIIII].substring(2));
                    } else {
                        IiiiiiiiIIIII2 = vs[IiiiiiiiIIIII].substring(2).split("\\$");
                        this.DNTGNv.ALLATORIxDEMO(this.camp, Integer.parseInt(IiiiiiiiIIIII2[0]), Integer.parseInt((String)IiiiiiiiIIIII2[1]));
                    }
                }
            } else if (vs[IiiiiiiiIIIII].startsWith("S")) {
                if (vs[IiiiiiiiIIIII].length() == 1) {
                    this.DNTGSg = null;
                } else {
                    if (this.DNTGSg == null) {
                        this.DNTGSg = new DNTGSG();
                    }
                    if (vs[IiiiiiiiIIIII].startsWith("S0")) {
                        this.DNTGSg.ALLATORIxDEMO(0, Integer.parseInt(vs[IiiiiiiiIIIII].substring(2)));
                    } else if (vs[IiiiiiiiIIIII].startsWith("S1")) {
                        this.DNTGSg.ALLATORIxDEMO(1, Integer.parseInt(vs[IiiiiiiiIIIII].substring(2)));
                    } else {
                        this.DNTGSg.ALLATORIxDEMO(vs[IiiiiiiiIIIII].substring(2));
                    }
                }
            } else if (vs[IiiiiiiiIIIII].startsWith("D")) {
                if (vs[IiiiiiiiIIIII].length() == 1) {
                    this.countDown = null;
                } else {
                    IiiiiiiiIIIII2 = vs[IiiiiiiiIIIII].substring(1).split("\\$");
                    this.countDown = new CountDown(Integer.parseInt(IiiiiiiiIIIII2[0]), Long.parseLong(IiiiiiiiIIIII2[1]));
                }
            } else if (vs[IiiiiiiiIIIII].startsWith("C")) {
                this.camp = Integer.parseInt(vs[IiiiiiiiIIIII].substring(1));
            } else if (vs[IiiiiiiiIIIII].startsWith("L")) {
                this.DN_SLs = vs[IiiiiiiiIIIII].substring(1);
                IiiiiiiiIIIII2 = (iiIiiiiiiIIii)this.gameView.getFormManagement().iiiIiiiiiiIIi(98);
                IiiiiiiiIIIII2.iIiIiiiiIIiIi(this.DN_SLs);
            }
            ++IiiiiiiiIIIII;
        }
    }

    public DNTGScene(String[] vs, GameView gameView) {
        this.gameView = gameView;
        this.is1 = true;
        this.is2 = true;
        if (image == null) {
            image = new ImageIcon("sc/b/S23.png").getImage();
        }
        if (XZ == null) {
            XZ = new ImageIcon("sc/b/B27.png").getImage();
        }
        if (XY == null) {
            XY = new ImageIcon("sc/b/B28.png").getImage();
        }
        this.DN_JB = new BigDecimal(0);
        this.DN_JF = new BigDecimal(0);
        this.DN_TT_KJ = "0";
        this.DN_HGS_KJ = "0";
        this.ALLATORIxDEMO(vs);
    }
}
