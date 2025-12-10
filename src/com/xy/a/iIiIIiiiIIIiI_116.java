/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.IIIiIiiiiIIiI
 *  com.xy.a.iIIiIiiiIiiIi
 *  com.xy.a.iIiIiiiiiiiIi
 *  com.xy.a.iiIIiiiiIiIiI
 *  com.xy.i.IIIIIiiiIIIiI
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.readbean.MapModel
 *  com.xy.text.GameView
 *  com.xy.v.iIiIIiiiIiiiI
 *  com.xy.w.IIIIIiiiIiIii
 *  com.xy.w.IIIIIiiiIiiII
 *  com.xy.w.IIiIiiiiIiiIi
 *  com.xy.w.iiiiiiiiiiIiI
 */
package com.xy.a;

import com.xy.a.IIIiIiiiiIIiI;
import com.xy.a.iIIiIiiiIiiIi;
import com.xy.a.iIiIiiiiiiiIi;
import com.xy.a.iiIIiiiiIiIiI;
import com.xy.i.IIIIIiiiIIIiI;
import com.xy.q.IiiiIiiiiIiIi;
import com.xy.readbean.MapModel;
import com.xy.text.GameView;
import com.xy.v.iIiIIiiiIiiiI;
import com.xy.w.IIIIIiiiIiIii;
import com.xy.w.IIIIIiiiIiiII;
import com.xy.w.IIiIiiiiIiiIi;
import com.xy.w.iiiiiiiiiiIiI;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Point;

public class iIiIIiiiIIIiI
extends IiiiIiiiiIiIi {
    private MapModel IIiiIiiiIIiIi;
    private int iIiIiiiiIiIii;
    private int IiIIIiiiiIiiI;
    private IIIIIiiiIIIiI[] iiIiiiiiiiIii;
    private iIIiIiiiIiiIi IiiiiiiiIIIII;
    private static IIIIIiiiIiIii ALLATORIxDEMO;

    protected void paintChildren(Graphics g) {
        super.paintChildren(g);
        if (this.IIiiIiiiIIiIi != this.iiIIiiiiIiIIi.mapScene.iiIiiiiiiiIii) {
            this.IIiiIiiiIIiIi = this.iiIIiiiiIiIIi.mapScene.iiIiiiiiiiIii;
            if (this.IIiiIiiiIIiIi == null) {
                return;
            }
            this.IiIIIiiiiIiiI = 0;
            this.iIiIiiiiIiIii = 0;
            int IiiiiiiiIIIII = 3;
            while (IiiiiiiiIIIII < this.iiIiiiiiiiIii.length) {
                int IiiiiiiiIIIII2;
                Object IiiiiiiiIIIII3 = this.iiIiiiiiiiIii[IiiiiiiiIIIII].ALLATORIxDEMO();
                if (IiiiiiiiIIIII3 != null && !((IiiiiiiiIIIII2 = ((Integer)IiiiiiiiIIIII3).intValue()) == -1 ? this.IIiiIiiiIIiIi.getMapId() < 1282L || this.IIiiIiiiIIiIi.getMapId() > 1288L : (IiiiiiiiIIIII2 == -2 ? this.IIiiIiiiIIiIi.getMapId() < 1289L || this.IIiiIiiiIIiIi.getMapId() > 1295L : (IiiiiiiiIIIII2 == -3 ? this.IIiiIiiiIIiIi.getMapId() < 1268L || this.IIiiIiiiIIiIi.getMapId() > 1271L : (IiiiiiiiIIIII2 == -4 ? (this.IIiiIiiiIIiIi.getMapId() < 1221L || this.IIiiIiiiIIiIi.getMapId() > 1226L) && this.IIiiIiiiIIiIi.getMapId() != 3311L : (IiiiiiiiIIIII2 == -5 ? this.IIiiIiiiIIiIi.getMapId() < 1273L || this.IIiiIiiiIIiIi.getMapId() > 1276L : this.IIiiIiiiIIiIi.getMapId() != (long)IiiiiiiiIIIII2)))))) {
                    this.IiIIIiiiiIiiI = this.iiIiiiiiiiIii[IiiiiiiiIIIII].getX() + this.iiIiiiiiiiIii[IiiiiiiiIIIII].getWidth() / 2;
                    this.iIiIiiiiIiIii = this.iiIiiiiiiiIii[IiiiiiiiIIIII].getY() + this.iiIiiiiiiiIii[IiiiiiiiIIIII].getHeight() / 2;
                    break;
                }
                ++IiiiiiiiIIIII;
            }
        }
        if (this.IiIIIiiiiIiiI <= 0) return;
        if (ALLATORIxDEMO == null) {
            ALLATORIxDEMO = iiiiiiiiiiIiI.ALLATORIxDEMO((String)IIiIiiiiIiiIi.iIiIiiiiIIiii((String)"word"), null);
        }
        if (ALLATORIxDEMO == null) return;
        ALLATORIxDEMO.ALLATORIxDEMO(iIiIIiiiIiiiI.ALLATORIxDEMO(), 0);
        ALLATORIxDEMO.ALLATORIxDEMO(g, this.IiIIIiiiiIiiI, this.iIiIiiiiIiIii);
    }

    static /* synthetic */ iIIiIiiiIiiIi ALLATORIxDEMO(iIiIIiiiIIIiI arg0) {
        return arg0.IiiiiiiiIIIII;
    }

    public void iIiIiiiiIIiii() {
        if (this.IiiiiiiiIIIII != null) {
            this.IiiiiiiiIIIII.setVisible(false);
        }
        super.iIiIiiiiIIiii();
    }

    public iIiIIiiiIIIiI(GameView gameView) {
        super(155, 2, IiiiIiiiiIiIi.iIIIIiiiiiIIi, gameView);
        this.ALLATORIxDEMO(-1, 0, 953, 501, IiiiIiiiiIiIi.iIIiIiiiiiiIi);
        this.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/91.png", (int)0, (int)0, (int)0, (int)0, (boolean)false), null);
        this.iiIiiiiiiiIii = new IIIIIiiiIIIiI[55];
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iiIiiiiiiiIii.length) {
            this.iiIiiiiiiiIii[IiiiiiiiIIIII] = new IIIIIiiiIIIiI(null, 1, IiiiiiiiIIIII == 0 ? 281 : (IiiiiiiiIIIII == 1 ? 282 : (IiiiiiiiIIIII == 2 ? 283 : 284)), (IiiiIiiiiIiIi)this);
            this.add((Component)this.iiIiiiiiiiIii[IiiiiiiiIIIII]);
            if (IiiiiiiiIIIII == 0) {
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].setImage("sc/e/140.png");
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].setBounds(850, 38, 20, 20);
            } else if (IiiiiiiiIIIII == 1) {
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].setImage("sc/e/138.png");
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].setBounds(142, 428, 104, 42);
            } else if (IiiiiiiiIIIII == 2) {
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].setImage("sc/e/139.png");
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].setBounds(262, 428, 104, 42);
            } else if (IiiiiiiiIIIII == 3) {
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].ALLATORIxDEMO((Object)1230);
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].setImage("sc/e/128.png");
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].setBounds(182, 115, 49, 25);
            } else if (IiiiiiiiIIIII == 4) {
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].ALLATORIxDEMO((Object)1267);
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].setImage("sc/e/129.png");
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].setBounds(396, 96, 110, 31);
            } else if (IiiiiiiiIIIII == 5) {
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].ALLATORIxDEMO((Object)1250);
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].setImage("sc/e/130.png");
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].setBounds(580, 127, 82, 32);
            } else if (IiiiiiiiIIIII == 6) {
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].ALLATORIxDEMO((Object)1244);
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].setImage("sc/e/131.png");
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].setBounds(562, 220, 55, 29);
            } else if (IiiiiiiiIIIII == 7) {
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].setImage("sc/e/132.png");
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].setBounds(770, 221, 57, 31);
            } else if (IiiiiiiiIIIII == 8) {
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].ALLATORIxDEMO((Object)1228);
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].setImage("sc/e/133.png");
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].setBounds(154, 226, 81, 33);
            } else if (IiiiiiiiIIIII == 9) {
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].ALLATORIxDEMO((Object)3180);
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].setImage("sc/e/134.png");
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].setBounds(258, 249, 72, 27);
            } else if (IiiiiiiiIIIII == 10) {
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].ALLATORIxDEMO((Object)1207);
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].setImage("sc/e/135.png");
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].setBounds(476, 299, 95, 35);
            } else if (IiiiiiiiIIIII == 11) {
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].ALLATORIxDEMO((Object)1236);
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].setImage("sc/e/136.png");
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].setBounds(435, 420, 77, 29);
            } else if (IiiiiiiiIIIII == 12) {
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].ALLATORIxDEMO((Object)1211);
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].setImage("sc/e/137.png");
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].setBounds(585, 446, 52, 26);
            } else if (IiiiiiiiIIIII == 13) {
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].ALLATORIxDEMO((Object)1241);
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].setImage("sc/e/141.png");
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].setBounds(205, 39, 59, 21);
            } else if (IiiiiiiiIIIII == 14) {
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].ALLATORIxDEMO((Object)1240);
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].setImage("sc/e/142.png");
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].setBounds(143, 47, 59, 20);
            } else if (IiiiiiiiIIIII == 15) {
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].ALLATORIxDEMO((Object)1232);
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].setImage("sc/e/143.png");
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].setBounds(152, 86, 43, 21);
            } else if (IiiiiiiiIIIII == 16) {
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].ALLATORIxDEMO((Object)1231);
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].setImage("sc/e/78.png");
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].setBounds(226, 88, 59, 21);
            } else if (IiiiiiiiIIIII == 17) {
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].ALLATORIxDEMO((Object)3205);
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].setImage("sc/e/79.png");
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].setBounds(432, 34, 79, 20);
            } else if (IiiiiiiiIIIII == 18) {
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].ALLATORIxDEMO((Object)1296);
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].setImage("sc/e/80.png");
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].setBounds(402, 53, 61, 23);
            } else if (IiiiiiiiIIIII == 19) {
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].ALLATORIxDEMO((Object)-1);
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].setImage("sc/e/81.png");
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].setBounds(472, 65, 41, 20);
            } else if (IiiiiiiiIIIII == 20) {
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].ALLATORIxDEMO((Object)-2);
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].setImage("sc/e/82.png");
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].setBounds(373, 75, 41, 20);
            } else if (IiiiiiiiIIIII == 21) {
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].ALLATORIxDEMO((Object)1248);
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].setImage("sc/e/83.png");
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].setBounds(628, 102, 59, 20);
            } else if (IiiiiiiiIIIII == 22) {
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].ALLATORIxDEMO((Object)40001);
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].setImage("sc/e/84.png");
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].setBounds(625, 162, 59, 20);
            } else if (IiiiiiiiIIIII == 23) {
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].ALLATORIxDEMO((Object)3155);
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].setImage("sc/e/85.png");
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].setBounds(602, 185, 56, 20);
            } else if (IiiiiiiiIIIII == 24) {
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].ALLATORIxDEMO((Object)-3);
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].setImage("sc/e/86.png");
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].setBounds(608, 249, 78, 22);
            } else if (IiiiiiiiIIIII == 25) {
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].ALLATORIxDEMO((Object)1208);
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].setImage("sc/e/87.png");
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].setBounds(656, 292, 77, 20);
            } else if (IiiiiiiiIIIII == 26) {
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].ALLATORIxDEMO((Object)1213);
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].setImage("sc/e/88.png");
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].setBounds(653, 321, 77, 21);
            } else if (IiiiiiiiIIIII == 27) {
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].ALLATORIxDEMO((Object)1214);
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].setImage("sc/e/89.png");
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].setBounds(661, 356, 76, 18);
            } else if (IiiiiiiiIIIII == 28) {
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].ALLATORIxDEMO((Object)40007);
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].setImage("sc/e/90.png");
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].setBounds(808, 178, 41, 19);
            } else if (IiiiiiiiIIIII == 29) {
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].ALLATORIxDEMO((Object)40004);
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].setImage("sc/e/91.png");
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].setBounds(826, 262, 42, 20);
            } else if (IiiiiiiiIIIII == 30) {
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].ALLATORIxDEMO((Object)40005);
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].setImage("sc/e/92.png");
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].setBounds(788, 311, 42, 19);
            } else if (IiiiiiiiIIIII == 31) {
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].ALLATORIxDEMO((Object)40006);
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].setImage("sc/e/93.png");
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].setBounds(752, 336, 84, 27);
            } else if (IiiiiiiiIIIII == 32) {
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].ALLATORIxDEMO((Object)1136);
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].setImage("sc/e/94.png");
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].setBounds(119, 172, 78, 19);
            } else if (IiiiiiiiIIIII == 33) {
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].ALLATORIxDEMO((Object)1246);
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].setImage("sc/e/95.png");
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].setBounds(146, 197, 59, 19);
            } else if (IiiiiiiiIIIII == 34) {
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].ALLATORIxDEMO((Object)1229);
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].setImage("sc/e/96.png");
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].setBounds(131, 277, 78, 21);
            } else if (IiiiiiiiIIIII == 35) {
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].ALLATORIxDEMO((Object)1252);
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].setImage("sc/e/97.png");
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].setBounds(113, 371, 58, 20);
            } else if (IiiiiiiiIIIII == 36) {
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].ALLATORIxDEMO((Object)3307);
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].setImage("sc/e/98.png");
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].setBounds(239, 288, 56, 18);
            } else if (IiiiiiiiIIIII == 37) {
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].ALLATORIxDEMO((Object)3210);
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].setImage("sc/e/99.png");
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].setBounds(216, 328, 73, 20);
            } else if (IiiiiiiiIIIII == 38) {
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].ALLATORIxDEMO((Object)3308);
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].setImage("sc/e/100.png");
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].setBounds(213, 351, 58, 20);
            } else if (IiiiiiiiIIIII == 39) {
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].ALLATORIxDEMO((Object)1280);
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].setImage("sc/e/101.png");
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].setBounds(331, 269, 57, 19);
            } else if (IiiiiiiiIIIII == 40) {
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].ALLATORIxDEMO((Object)1278);
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].setImage("sc/e/102.png");
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].setBounds(314, 297, 59, 21);
            } else if (IiiiiiiiIIIII == 41) {
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].ALLATORIxDEMO((Object)1279);
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].setImage("sc/e/103.png");
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].setBounds(301, 328, 58, 20);
            } else if (IiiiiiiiIIIII == 42) {
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].ALLATORIxDEMO((Object)1251);
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].setImage("sc/e/104.png");
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].setBounds(281, 362, 78, 21);
            } else if (IiiiiiiiIIIII == 43) {
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].ALLATORIxDEMO((Object)1259);
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].setImage("sc/e/105.png");
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].setBounds(271, 391, 60, 20);
            } else if (IiiiiiiiIIIII == 44) {
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].ALLATORIxDEMO((Object)1263);
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].setImage("sc/e/106.png");
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].setBounds(393, 298, 60, 20);
            } else if (IiiiiiiiIIIII == 45) {
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].ALLATORIxDEMO((Object)1272);
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].setImage("sc/e/107.png");
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].setBounds(373, 334, 59, 20);
            } else if (IiiiiiiiIIIII == 46) {
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].ALLATORIxDEMO((Object)1242);
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].setImage("sc/e/119.png");
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].setBounds(371, 359, 59, 20);
            } else if (IiiiiiiiIIIII == 47) {
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].ALLATORIxDEMO((Object)1254);
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].setImage("sc/e/120.png");
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].setBounds(501, 248, 59, 20);
            } else if (IiiiiiiiIIIII == 48) {
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].ALLATORIxDEMO((Object)-4);
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].setImage("sc/e/121.png");
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].setBounds(455, 274, 60, 20);
            } else if (IiiiiiiiIIIII == 49) {
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].ALLATORIxDEMO((Object)1298);
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].setImage("sc/e/122.png");
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].setBounds(540, 276, 40, 20);
            } else if (IiiiiiiiIIIII == 50) {
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].ALLATORIxDEMO((Object)1193);
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].setImage("sc/e/123.png");
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].setBounds(570, 344, 58, 20);
            } else if (IiiiiiiiIIIII == 51) {
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].ALLATORIxDEMO((Object)1210);
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].setImage("sc/e/124.png");
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].setBounds(430, 381, 78, 21);
            } else if (IiiiiiiiIIIII == 52) {
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].ALLATORIxDEMO((Object)-5);
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].setImage("sc/e/125.png");
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].setBounds(605, 411, 78, 21);
            } else if (IiiiiiiiIIIII == 53) {
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].ALLATORIxDEMO((Object)1227);
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].setImage("sc/e/126.png");
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].setBounds(534, 424, 58, 20);
            } else if (IiiiiiiiIIIII == 54) {
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].ALLATORIxDEMO((Object)3012);
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].setImage("sc/e/127.png");
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].setBounds(653, 454, 58, 20);
            }
            ++IiiiiiiiIIIII;
        }
    }

    public void ALLATORIxDEMO(int id, Object data, IIIIIiiiIIIiI baseBtn) {
        if (id == 281) {
            this.ALLATORIxDEMO().iiiIiiiiiiIIi(this.iIiIiiiiIIiii());
            return;
        }
        if (id == 282) {
            IIIiIiiiiIIiI IiiiiiiiIIIII = (IIIiIiiiiIIiI)this.ALLATORIxDEMO().iiiIiiiiiiIIi(156);
            IiiiiiiiIIIII.ALLATORIxDEMO(this.iiIIiiiiIiIIi.mapScene.iiIiiiiiiiIii);
            return;
        }
        if (id == 283) {
            iiIIiiiiIiIiI IiiiiiiiIIIII = (iiIIiiiiIiIiI)this.ALLATORIxDEMO().iiiIiiiiiiIIi(157);
            IiiiiiiiIIIII.ALLATORIxDEMO(this.iiIIiiiiIiIIi.mapScene.iiIiiiiiiiIii);
            return;
        }
        if (id != 284) return;
        if (data == null) {
            return;
        }
        int IiiiiiiiIIIII = (Integer)data;
        if (IiiiiiiiIIIII < 0) {
            if (this.IiiiiiiiIIIII == null) {
                this.IiiiiiiiIIIII = new iIIiIiiiIiiIi(this);
            }
            this.IiiiiiiiIIIII.ALLATORIxDEMO(IiiiiiiiIIIII);
            Point IiiiiiiiIIIII2 = GameView.ALLATORIxDEMO((int)baseBtn.getX(), (int)baseBtn.getY(), (int)this.IiiiiiiiIIIII.getWidth(), (int)this.IiiiiiiiIIIII.getHeight(), (int)this.getWidth(), (int)this.getHeight());
            this.IiiiiiiiIIIII.setBounds(IiiiiiiiIIIII2.x, IiiiiiiiIIIII2.y, this.IiiiiiiiIIIII.getWidth(), this.IiiiiiiiIIIII.getHeight());
            this.add((Component)this.IiiiiiiiIIIII, 0);
            this.IiiiiiiiIIIII.setVisible(true);
            return;
        }
        MapModel IiiiiiiiIIIII3 = this.ALLATORIxDEMO().ALLATORIxDEMO(String.valueOf(IiiiiiiiIIIII));
        if (IiiiiiiiIIIII3 == null) {
            return;
        }
        ((iIiIiiiiiiiIi)this.ALLATORIxDEMO().iiiIiiiiiiIIi(22)).ALLATORIxDEMO(IiiiiiiiIIIII3);
    }
}
