/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.q.iiIIIiiiIIiII
 *  com.xy.game.RoleData
 *  com.xy.i.IiiiiiiiiIIII
 *  com.xy.q.IIIiiiiiIiIiI
 *  com.xy.q.IiIIIiiiiIIiI
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.q.iIIiIiiiIiiIi
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.readbean.Goodstable
 *  com.xy.richtext.RichLabel
 *  com.xy.socket.Agreement
 *  com.xy.text.GameView
 *  com.xy.v.iIiIIiiiIiiiI
 *  com.xy.v.iiiiiiiiIIIII
 *  com.xy.w.IIIIIiiiIiiII
 *  com.xy.w.IIIiiiiiIiIiI
 *  com.xy.w.IIiIiiiiIiiIi
 */
package com.xy.a.q;

import com.xy.a.q.iiIIIiiiIIiII;
import com.xy.game.RoleData;
import com.xy.i.IiiiiiiiiIIII;
import com.xy.q.IiIIIiiiiIIiI;
import com.xy.q.IiiiIiiiiIiIi;
import com.xy.q.iIIiIiiiIiiIi;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.readbean.Goodstable;
import com.xy.richtext.RichLabel;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import com.xy.v.iIiIIiiiIiiiI;
import com.xy.v.iiiiiiiiIIIII;
import com.xy.w.IIIIIiiiIiiII;
import com.xy.w.IIIiiiiiIiIiI;
import com.xy.w.IIiIiiiiIiiIi;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.event.MouseListener;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JLabel;

public class iiIiIiiiiiiiI
extends IiiiIiiiiIiIi {
    private long IiiiIiiiIiIII;
    public BigDecimal IIiiiiiiiIIIi = null;
    public String[] IIIiiiiiIIiII = null;
    public String[] iiIiiiiiiIIiI = null;
    private com.xy.q.IIIiiiiiIiIiI[] iIiiIiiiIiIIi;
    private long iiiiIiiiIIiii;
    public List<Point> iIIiIiiiiiiIi = null;
    private iIIiIiiiIiiIi IIIIiiiiiiiII;
    public String[] iiIIIiiiiiiiI = null;
    private IIIiiiiiIiIiI IiIiiiiiIIIII;
    private JLabel[] iiIiIiiiiIIIi;
    private IiiiiiiiiIIII[] iiiiIiiiIiiII;
    public int iiiIiiiiiiiIi;
    private RichLabel iIiiIiiiiiiII;
    private Image IIiiIiiiIIiIi = IIiIiiiiIiiIi.IiiIiiiiiiIiI((String)"p0");
    private long IiIIIiiiiIiiI;
    private int iiIiiiiiiiIii;
    private IIIiiiiiIiIiI[] IiiiiiiiIIIII;
    private com.xy.q.IIIiiiiiIiIiI[] ALLATORIxDEMO;

    public void iIiIiiiiIIiIi() {
        RoleData IiiiiiiiIIIII = this.ALLATORIxDEMO();
        Goodstable IiiiiiiiIIIII2 = IiiiiiiiIIIII.ALLATORIxDEMO(889L);
        if (IiiiiiiiIIIII2 == null) {
            this.iiiIiiiiiiiIi = 0;
            this.IIIIiiiiiiiII.setText(String.valueOf(this.iiiIiiiiiiiIi));
            this.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u4f60\u6ca1\u6709\u901a\u7075\u5b9d\u5238\uff0c\u5feb\u53bb\u8d2d\u4e70\u5427\uff01\uff01");
            return;
        }
        IiiiiiiiIIIII2.ALLATORIxDEMO(1);
        if (IiiiiiiiIIIII2.getUsetime() <= 0) {
            IiiiiiiiIIIII.iIiIiiiiIIiii(IiiiiiiiIIIII2.getRgid());
        }
        this.iiiIiiiiiiiIi = IiiiiiiiIIIII2.getUsetime();
        this.IIIIiiiiiiiII.setText(String.valueOf(this.iiiIiiiiiiiIi));
        String IiiiiiiiIIIII3 = Agreement.getSendTextAES((String)"getfivemsg", (String)("G" + IiiiiiiiIIIII2.getRgid()));
        this.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII3);
        this.iiiiIiiiIiiII[1].setBtn(-1, "sc/e/56.png");
    }

    /*
     * Unable to fully structure code
     */
    public iiIiIiiiiiiiI(GameView gameView) {
        super(71, 2, IiiiIiiiiIiIi.iIIIIiiiiiIIi, gameView);
        this.ALLATORIxDEMO(-1, 0, 400, 400, IiiiIiiiiIiIi.iiIIIiiiiiiiI);
        this.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/1.png", (int)68, (int)68, (int)68, (int)68, (boolean)false), null);
        this.iIiIiiiiIIiii(true);
        this.iiiiIiiiIiiII = new IiiiiiiiiIIII[2];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iiiiIiiiIiiII.length) {
            this.iiiiIiiiIiiII[IiiiiiiiIIIII] = new IiiiiiiiiIIII("sc/e/40.png", 1, 227 + IiiiiiiiIIIII, iiIIiiiiIiiII.iiIiiiiiiIIiI, null, IiiiiiiiIIIII == 0 ? "\uff1f" : (IiiiiiiiIIIII == 1 ? "\u4e00\u952e\u53ec\u5524" : ""), (IiiiIiiiiIiIi)this);
            this.iiiiIiiiIiiII[IiiiiiiiIIIII].setBounds(353, 110, 18, 18);
            if (IiiiiiiiIIIII == 1) {
                this.iiiiIiiiIiiII[IiiiiiiiIIIII].setFont(iiIIiiiiIiiII.iiiiIiiiIiiII);
                this.iiiiIiiiIiiII[IiiiiiiiIIIII].setForeground(Color.black);
                this.iiiiIiiiIiiII[IiiiiiiiIIIII].setImage("sc/e/26.png");
                this.iiiiIiiiIiiII[IiiiiiiiIIIII].setBounds(250, 360, 99, 25);
            }
            this.add((Component)this.iiiiIiiiIiiII[IiiiiiiiIIIII++]);
        }
        this.iiIiIiiiiIIIi = new JLabel[2];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iiIiIiiiiIIIi.length) {
            this.iiIiIiiiiIIIi[IiiiiiiiIIIII] = IiIIIiiiiIIiI.ALLATORIxDEMO((int)155, (int)13, (int)91, (int)24, (Color)Color.black, (Font)iiIIiiiiIiiII.IIiIiiiiiIiII);
            this.iiIiIiiiiIIIi[IiiiiiiiIIIII].setText(IiiiiiiiIIIII == 0 ? "\u5b88\u536b\u5b9d\u5b9d" : (IiiiiiiiIIIII == 1 ? "\u901a\u7075\u5b9d\u5238" : ""));
            this.iiIiIiiiiIIIi[IiiiiiiiIIIII].setHorizontalAlignment(0);
            if (IiiiiiiiIIIII == 1) {
                this.iiIiIiiiiIIIi[IiiiiiiiIIIII].setFont(iiIIiiiiIiiII.iiiiIiiiIiiII);
                this.iiIiIiiiiIIIi[IiiiiiiiIIIII].setBounds(31, 362, 72, 19);
            }
            this.add(this.iiIiIiiiiIIIi[IiiiiiiiIIIII++]);
        }
        this.iIiiIiiiiiiII = new RichLabel("", iiIIiiiiIiiII.iIIIiiiiIIIii);
        this.iIiiIiiiiiiII.setTextSize("#c000000\u5b88\u536b\u53ec\u5524\u517d#cFF0000\u79cd\u7c7b#c000000(\u975e\u4e2a\u6570)\u8d8a\u591a\uff0c\u5956\u52b1\u8d8a\u597d\u3002", 330);
        this.iIiiIiiiiiiII.setBounds(32, 106, this.iIiiIiiiiiiII.getWidth(), this.iIiiIiiiiiiII.getHeight());
        this.add((Component)this.iIiiIiiiiiiII);
        this.IIIIiiiiiiiII = IiIIIiiiiIIiI.ALLATORIxDEMO((int)112, (int)362, (int)104, (int)19, (int)0, (Color)Color.white, (Font)iiIIiiiiIiiII.iIIIiiiiIIIii);
        this.IIIIiiiiiiiII.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/17.png", (int)6, (int)6, (int)6, (int)6, (boolean)false));
        this.add((Component)this.IIIIiiiiiiiII);
        IiiiiiiiIIIII = new iiiiiiiiIIIII(7, 8, 35, 35);
        IiiiiiiiIIIII = new iiiiiiiiIIIII(8, 8, 35, 35);
        this.ALLATORIxDEMO = new com.xy.q.IIIiiiiiIiIiI[5];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.ALLATORIxDEMO.length) {
            this.ALLATORIxDEMO[IiiiiiiiIIIII] = new com.xy.q.IIIiiiiiIiIiI(this.ALLATORIxDEMO());
            this.ALLATORIxDEMO[IiiiiiiiIIIII].setBounds(41 + 66 * IiiiiiiiIIIII, 42, 50, 50);
            this.ALLATORIxDEMO[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/49.png", (int)5, (int)5, (int)5, (int)5, (boolean)false));
            this.ALLATORIxDEMO[IiiiiiiiIIIII].ALLATORIxDEMO(IiiiiiiiIIIII);
            this.ALLATORIxDEMO[IiiiiiiiIIIII].removeMouseListener((MouseListener)this.ALLATORIxDEMO[IiiiiiiiIIIII]);
            this.add((Component)this.ALLATORIxDEMO[IiiiiiiiIIIII++]);
        }
        this.IiIiiiiiIIIII = new IIIiiiiiIiIiI(this.IIiiIiiiIIiIi);
        this.IiIiiiiiIIIII.setBounds(313, 141, 35, 35);
        this.add((Component)this.IiIiiiiiIIIII);
        this.IiiiiiiiIIIII = new IIIiiiiiIiIiI[9];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IiiiiiiiIIIII.length) {
            block13: {
                block12: {
                    this.IiiiiiiiIIIII[IiiiiiiiIIIII] = new IIIiiiiiIiIiI();
                    this.add((Component)this.IiiiiiiiIIIII[IiiiiiiiIIIII]);
                    if (IiiiiiiiIIIII != 5) break block12;
                    this.IiiiiiiiIIIII[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/19.png", (int)5, (int)5, (int)5, (int)5, (boolean)false));
                    this.IiiiiiiiIIIII[IiiiiiiiIIIII].setBounds(31, 130, 258, 207);
                    this.iIiiIiiiIiIIi = new com.xy.q.IIIiiiiiIiIiI[20];
                    IiiiiiiiIIIII = 0;
                    if (true) ** GOTO lbl96
                }
                if (IiiiiiiiIIIII == 6) {
                    this.IiiiiiiiIIIII[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/28.png", (int)20, (int)20, (int)20, (int)20, (boolean)false));
                    this.IiiiiiiiIIIII[IiiiiiiiIIIII].setBounds(306, 134, 49, 49);
                } else if (IiiiiiiiIIIII == 7) {
                    this.IiiiiiiiIIIII[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/40.png", (int)20, (int)20, (int)20, (int)20, (boolean)false));
                    this.IiiiiiiiIIIII[IiiiiiiiIIIII].setBounds(301, 129, 59, 59);
                } else if (IiiiiiiiIIIII == 8) {
                    this.IiiiiiiiIIIII[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/36.png", (int)20, (int)20, (int)20, (int)20, (boolean)false));
                    this.IiiiiiiiIIIII[IiiiiiiiIIIII].setBounds(20, 103, 360, 250);
                }
                break block13;
                do {
                    this.iIiiIiiiIiIIi[IiiiiiiiIIIII] = new com.xy.q.IIIiiiiiIiIiI((IiiiIiiiiIiIi)this);
                    this.iIiiIiiiIiIIi[IiiiiiiiIIIII].ALLATORIxDEMO(this.IIiiIiiiIIiIi);
                    this.iIiiIiiiIiIIi[IiiiiiiiIIIII].ALLATORIxDEMO(IiiiiiiiIIIII);
                    this.iIiiIiiiIiIIi[IiiiiiiiIIIII].setBounds(32 + 51 * (IiiiiiiiIIIII % 5), 132 + 51 * (IiiiiiiiIIIII / 5), 51, 51);
                    this.iIiiIiiiIiIIi[IiiiiiiiIIIII].iIiIiiiiIIiii(IIIIIiiiIiiII.iiiIiiiiiiIIi((String)"sc/d/18.png"));
                    this.iIiiIiiiIiIIi[IiiiiiiiIIIII].removeMouseListener((MouseListener)this.iIiiIiiiIiIIi[IiiiiiiiIIIII]);
                    this.add((Component)this.iIiiIiiiIiIIi[IiiiiiiiIIIII++]);
lbl96:
                    // 2 sources

                } while (IiiiiiiiIIIII < this.iIiiIiiiIiIIi.length);
            }
            ++IiiiiiiiIIIII;
        }
    }

    protected void paintChildren(Graphics g) {
        super.paintChildren(g);
        if (this.iiIIIiiiiiiiI != null) {
            long IiiiiiiiIIIII = (iIiIIiiiIiiiI.ALLATORIxDEMO() - this.IiIIIiiiiIiiI) / 5L;
            this.iiiiIiiiIIiii += (IiiiiiiiIIIII -= this.IiiiIiiiIiIII);
            this.IiiiIiiiIiIII += IiiiiiiiIIIII;
            if (this.iiiiIiiiIIiii >= 30L) {
                this.iiiiIiiiIIiii = 0L;
                Image IiiiiiiiIIIII2 = null;
                if (!this.iiIIIiiiiiiiI[this.iiIiiiiiiiIii].equals("0")) {
                    IiiiiiiiIIIII2 = IIiIiiiiIiiIi.IiiIiiiiiiIiI((String)("p" + this.iiIIIiiiiiiiI[this.iiIiiiiiiiIii]));
                }
                if (this.iiIiiiiiiiIii == 20) {
                    this.IiIiiiiiIIIII.ALLATORIxDEMO(IiiiiiiiIIIII2);
                } else {
                    int IiiiiiiiIIIII3 = 0;
                    while (IiiiiiiiIIIII3 < this.iiIiiiiiiIIiI.length) {
                        if (this.iiIiiiiiiIIiI[IiiiiiiiIIIII3] != null && this.iiIiiiiiiIIiI[IiiiiiiiIIIII3].equals(this.iiIIIiiiiiiiI[this.iiIiiiiiiiIii])) {
                            this.iiIiiiiiiIIiI[IiiiiiiiIIIII3] = null;
                            if (this.iIIiIiiiiiiIi == null) {
                                this.iIIiIiiiiiiIi = new ArrayList<Point>();
                            }
                            int IiiiiiiiIIIII4 = this.iiIiiiiiiiIii % 5;
                            int IiiiiiiiIIIII5 = this.iiIiiiiiiiIii / 5;
                            this.iIIiIiiiiiiIi.add(new Point(34 + IiiiiiiiIIIII4 * 51, 133 + IiiiiiiiIIIII5 * 51));
                        }
                        ++IiiiiiiiIIIII3;
                    }
                    this.iIiiIiiiIiIIi[this.iiIiiiiiiiIii].ALLATORIxDEMO(IiiiiiiiIIIII2);
                }
                ++this.iiIiiiiiiiIii;
                if (this.iiIiiiiiiiIii > 20) {
                    this.iiiiIiiiIiiII[1].setBtn(1, "sc/e/26.png");
                    this.iiiiIiiiIiiII[1].setText("\u518d\u6765\u4e00\u6b21");
                    if (this.iiIIIiiiiiiiI[this.iiIIIiiiiiiiI.length - 1].equals("400151")) {
                        this.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u4f60\u9047\u5230\u4e86\u91d1\u7075\u9f20,\u7855\u9f20\u7855\u9f20,\u52ff\u98df\u6211\u9ecd\u3002\u672c\u6b21\u9897\u7c92\u65e0\u6536\uff01");
                    } else if (this.IIiiiiiiiIIIi != null && this.IIiiiiiiiIIIi.intValue() != 0) {
                        this.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u83b7\u5f97\u4e86" + this.IIiiiiiiiIIIi + "\u94f6\u4e24");
                    }
                    this.iiIIIiiiiiiiI = null;
                }
            }
        }
        if (this.iIIiIiiiiiiIi == null) return;
        if (this.iIIiIiiiiiiIi.size() <= 0) return;
        iiIIIiiiIIiII.iiIiIiiiiIIIi.ALLATORIxDEMO(iIiIIiiiIiiiI.ALLATORIxDEMO(), 0);
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iIIiIiiiiiiIi.size()) {
            iiIIIiiiIIiII.iiIiIiiiiIIIi.ALLATORIxDEMO(g, this.iIIiIiiiiiiIi.get((int)(++IiiiiiiiIIIII)).x, this.iIIiIiiiiiiIi.get((int)IiiiiiiiIIIII).y);
        }
    }

    public void ALLATORIxDEMO(String[] v) {
        this.iiiIiiiiiiIIi();
        this.IIIiiiiiIIiII = v;
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < v.length) {
            com.xy.q.IIIiiiiiIiIiI iIIiiiiiIiIiI = this.ALLATORIxDEMO[IiiiiiiiIIIII];
            StringBuilder stringBuilder = new StringBuilder("p").append(v[IiiiiiiiIIIII]);
            ++IiiiiiiiIIIII;
            iIIiiiiiIiIiI.ALLATORIxDEMO(IIiIiiiiIiiIi.IiiIiiiiiiIiI((String)stringBuilder.toString()));
        }
        Goodstable IiiiiiiiIIIII2 = this.ALLATORIxDEMO().ALLATORIxDEMO(889L);
        this.iiiIiiiiiiiIi = IiiiiiiiIIIII2 != null ? IiiiiiiiIIIII2.getUsetime() : 0;
        this.IIIIiiiiiiiII.setText(String.valueOf(this.iiiIiiiiiiiIi));
        this.iiiiIiiiIiiII[1].setBtn(1, "sc/e/26.png");
        this.ALLATORIxDEMO().iIiIiiiiIIiIi(this.iIiIiiiiIIiii());
    }

    public boolean ALLATORIxDEMO() {
        if (this.iiIIIiiiiiiiI == null) return super.ALLATORIxDEMO();
        this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u6b63\u5728\u62bd\u5956\u65e0\u6cd5\u5173\u95ed\u754c\u9762");
        return false;
    }

    public void iiiIiiiiiiIIi() {
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iIiiIiiiIiIIi.length) {
            com.xy.q.IIIiiiiiIiIiI iIIiiiiiIiIiI = this.iIiiIiiiIiIIi[IiiiiiiiIIIII];
            ++IiiiiiiiIIIII;
            iIIiiiiiIiIiI.ALLATORIxDEMO(this.IIiiIiiiIIiIi);
        }
        this.IiIiiiiiIIIII.ALLATORIxDEMO(this.IIiiIiiiIIiIi);
        if (this.iIIiIiiiiiiIi == null) return;
        this.iIIiIiiiiiiIi.clear();
    }

    public void ALLATORIxDEMO(String[] v, BigDecimal moeny) {
        this.iiiIiiiiiiIIi();
        this.iiIIIiiiiiiiI = v;
        this.IIiiiiiiiIIIi = moeny;
        this.IiIIIiiiiIiiI = iIiIIiiiIiiiI.ALLATORIxDEMO();
        this.IiiiIiiiIiIII = 0L;
        this.iiiiIiiiIIiii = 0L;
        this.iiIiiiiiiiIii = 0;
        if (this.iIIiIiiiiiiIi != null) {
            this.iIIiIiiiiiiIi.clear();
        }
        this.iiIiiiiiiIIiI = new String[this.IIIiiiiiIIiII.length];
        System.arraycopy(this.IIIiiiiiIIiII, 0, this.iiIiiiiiiIIiI, 0, 5);
    }
}
