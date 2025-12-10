/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.IIiiIiiiIIiIi
 *  com.xy.a.IiIIIiiiiIiIi
 *  com.xy.a.IiiIiiiiIIIiI
 *  com.xy.a.iIIIiiiiIiIII
 *  com.xy.a.iIIIiiiiiIiIi
 *  com.xy.a.iiIIiiiiIiIiI
 *  com.xy.a.iiIiIiiiiiiiI
 *  com.xy.a.iiiIIiiiIIIii
 *  com.xy.formula.FormulaNum
 *  com.xy.formula.GoodType
 *  com.xy.game.GameMove
 *  com.xy.i.IIIIIiiiIIIiI
 *  com.xy.i.IIiiIiiiiIIiI
 *  com.xy.n.iIiIIiiiIiiiI
 *  com.xy.q.IiIIIiiiiIIiI
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.q.iIIIiiiiIiIII
 *  com.xy.q.iIIiIiiiIiiIi
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.readbean.MapModel
 *  com.xy.readbean.NpcInfoBean
 *  com.xy.text.GameView
 *  com.xy.v.IIiiIiiiiIIiI
 *  com.xy.v.IiiiiiiiiIIII
 *  com.xy.v.iIiIIiiiIiiiI
 *  com.xy.v.iiiiiiiiIIIII
 *  com.xy.w.IIIIIiiiIiIii
 *  com.xy.w.IIIIIiiiIiiII
 *  com.xy.w.IIIiiiiiIiIiI
 *  com.xy.w.IIiIiiiiIIiii
 *  com.xy.w.IiiiiiiiiIIII
 */
package com.xy.a;

import com.xy.a.IIiiIiiiIIiIi;
import com.xy.a.IiIIIiiiiIiIi;
import com.xy.a.IiiIiiiiIIIiI;
import com.xy.a.iIIIiiiiIiIII;
import com.xy.a.iIIIiiiiiIiIi;
import com.xy.a.iiIIiiiiIiIiI;
import com.xy.a.iiIiIiiiiiiiI;
import com.xy.a.iiiIIiiiIIIii;
import com.xy.formula.FormulaNum;
import com.xy.formula.GoodType;
import com.xy.game.GameMove;
import com.xy.i.IIIIIiiiIIIiI;
import com.xy.q.IiIIIiiiiIIiI;
import com.xy.q.IiiiIiiiiIiIi;
import com.xy.q.iIIiIiiiIiiIi;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.readbean.MapModel;
import com.xy.readbean.NpcInfoBean;
import com.xy.text.GameView;
import com.xy.v.IIiiIiiiiIIiI;
import com.xy.v.IiiiiiiiiIIII;
import com.xy.v.iIiIIiiiIiiiI;
import com.xy.v.iiiiiiiiIIIII;
import com.xy.w.IIIIIiiiIiIii;
import com.xy.w.IIIIIiiiIiiII;
import com.xy.w.IIIiiiiiIiIiI;
import com.xy.w.IIiIiiiiIIiii;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComponent;
import javax.swing.JLabel;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class iIiIiiiiiiiIi
extends IiiiIiiiiIiIi {
    private int iIiIIiiiIIIii;
    private IIiIiiiiIIiii IIIIIiiiIiIIi = IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/e/75.png", (int)6, (int)6, (int)6, (int)6, (boolean)false);
    private IIIiiiiiIiIiI[] iiIIiiiiIiIIi;
    private iIIiIiiiIiiIi IiIIiiiiIIIII;
    private iiIiIiiiiiiiI iIIIIiiiiiIIi;
    private int IiiIIiiiiiiiI;
    private IIIIIiiiIIIiI IIiiiiiiIiiII;
    private static IIIIIiiiIiIii IiiiIiiiIiIII;
    private Image IIiiiiiiiIIIi;
    private IIIIIiiiIIIiI IIIiiiiiIIiII;
    private double iiIiiiiiiIIiI;
    private Image[] iIiiIiiiIiIIi;
    private double iiiiIiiiIIiii;
    private Image iIIiIiiiiiiIi;
    private List<IiIIIiiiiIiIi> IIIIiiiiiiiII;
    private IIiiIiiiIIiIi[] iiIIIiiiiiiiI;
    private String IiIiiiiiIIIII;
    private IIIIIiiiIIIiI iiIiIiiiiIIIi;
    private String iiiiIiiiIiiII;
    private JComponent iiiIiiiiiiiIi;
    private boolean iIiiIiiiiiiII;
    private List<iIIIiiiiIiIII> IIiiIiiiIIiIi;
    private iiiiiiiiIIIII iIiIiiiiIiIii = new iiiiiiiiIIIII(-1, -1, 0, 0);
    private IiiIiiiiIIIiI IiIIIiiiiIiiI;
    private MapModel iiIiiiiiiiIii;
    private iIIiIiiiIiiIi IiiiiiiiIIIII;
    private List<IIIIIiiiIIIiI> ALLATORIxDEMO;

    protected void iIiIiiiiIIiii(Graphics g) {
        if (this.IiIIIiiiiIiiI != null) {
            this.IiIIIiiiiIiiI.ALLATORIxDEMO(g);
        }
        if (this.iIiiIiiiiiiII || this.iiIiiiiiiiIii == this.iiIIiiiiIiIIi.mapScene.iiIiiiiiiiIii && this.iiIIiiiiIiIIi.roleUnit.ALLATORIxDEMO()) {
            if (this.iIiiIiiiIiIIi[0] == null) {
                this.iIiiIiiiIiIIi[0] = IIIIIiiiIiiII.iiiIiiiiiiIIi((String)"sc/e/114.png");
                this.iIiiIiiiIiIIi[1] = IIIIIiiiIiiII.iiiIiiiiiiIIi((String)"sc/e/115.png");
            }
            if (this.iIiiIiiiiiiII) {
                if (this.iiIiiiiiiiIii == this.iiIIiiiiIiIIi.mapScene.iiIiiiiiiiIii && this.iiIIiiiiIiIIi.roleUnit.ALLATORIxDEMO()) {
                    this.iIiiIiiiiiiII = false;
                    this.iiiiIiiiIiiII = null;
                    this.iiiiiiiiIIiii();
                }
            } else {
                this.iiiiiiiiIIiii();
            }
            if (iIiIIiiiIiiiI.ALLATORIxDEMO() / 100L % 2L == 0L) {
                g.drawImage(this.iIiiIiiiIiIIi[0], this.iIiIIiiiIIIii, this.IiiIIiiiiiiiI - 20, 23, 21, null);
            } else {
                g.drawImage(this.iIiiIiiiIiIIi[0], this.iIiIIiiiIIIii, this.IiiIIiiiiiiiI - 21, 23, 21, null);
            }
            g.drawImage(this.iIiiIiiiIiIIi[1], this.iIiIIiiiIIIii - 1, this.IiiIIiiiiiiiI, 25, 11, null);
        }
        if (this.IiIiiiiiIIIII == null) return;
        g.setColor(Color.YELLOW);
        g.setFont(iiIIiiiiIiiII.iIiIIiiiiIIiI);
        if (this.iIiIiiiiIiIii.iiIiiiiiiiIii == -1) {
            this.iIiIiiiiIiIii.iiIiiiiiiiIii = g.getFontMetrics().stringWidth(this.IiIiiiiiIIIII) + 6;
            this.iIiIiiiiIiIii.IiiiiiiiIIIII = g.getFontMetrics().getHeight() + 6;
        }
        g.translate(this.iIiIiiiiIiIii.ALLATORIxDEMO, this.iIiIiiiiIiIii.IiIIIiiiiIiiI);
        this.IIIIIiiiIiIIi.ALLATORIxDEMO(g, this.iIiIiiiiIiIii.iiIiiiiiiiIii, this.iIiIiiiiIiIii.IiiiiiiiIIIII);
        g.translate(-this.iIiIiiiiIiIii.ALLATORIxDEMO, -this.iIiIiiiiIiIii.IiIIIiiiiIiiI);
        g.drawString(this.IiIiiiiiIIIII, this.iIiIiiiiIiIii.ALLATORIxDEMO + 3, this.iIiIiiiiIiIii.IiIIIiiiiIiiI + 16);
    }

    static /* synthetic */ IIIIIiiiIiIii ALLATORIxDEMO() {
        return IiiiIiiiIiIII;
    }

    static /* synthetic */ MapModel ALLATORIxDEMO(iIiIiiiiiiiIi arg0) {
        return arg0.iiIiiiiiiiIii;
    }

    static /* synthetic */ IIIiiiiiIiIiI[] ALLATORIxDEMO(iIiIiiiiiiiIi arg0) {
        return arg0.iiIIiiiiIiIIi;
    }

    public boolean iIiIiiiiIIiii() {
        com.xy.n.iIiIIiiiIiiiI IiiiiiiiIIIII = this.iiIIiiiiIiIIi.mapScene;
        if (IiiiiiiiIIIII == null) {
            return false;
        }
        if (this.iiIiiiiiiiIii == null) return this.ALLATORIxDEMO(IiiiiiiiIIIII.iiIiiiiiiiIii);
        if (this.iiIiiiiiiiIii.getMapId() != IiiiiiiiIIIII.IiiiIiiiIiIII) return this.ALLATORIxDEMO(IiiiiiiiIIIII.iiIiiiiiiiIii);
        return true;
    }

    static /* synthetic */ void iIiIiiiiIIiii(iIiIiiiiiiiIi arg0, Image arg1) {
        arg0.IIiiiiiiiIIIi = arg1;
    }

    public void ALLATORIxDEMO(int id, Object data, com.xy.i.IIiiIiiiiIIiI btn) {
        if (id != 271) {
            if (id != 272) return;
            iiIIiiiiIiIiI IiiiiiiiIIIII = (iiIIiiiiIiIiI)this.ALLATORIxDEMO().iiiIiiiiiiIIi(157);
            IiiiiiiiIIIII.ALLATORIxDEMO(this.iiIiiiiiiiIii);
            return;
        }
        NpcInfoBean IiiiiiiiIIIII = this.ALLATORIxDEMO().ALLATORIxDEMO(String.valueOf(data));
        if (IiiiiiiiIIIII == null) {
            return;
        }
        if (this.iIIIIiiiiiIIi == null) {
            this.iIIIIiiiiiIIi = new iiIiIiiiiiiiI(this);
        }
        this.iIIIIiiiiiIIi.ALLATORIxDEMO(IiiiiiiiIIIII);
        Point IiiiiiiiIIIII2 = GameView.ALLATORIxDEMO((int)btn.getX(), (int)btn.getY(), (int)this.iIIIIiiiiiIIi.getWidth(), (int)this.iIIIIiiiiiIIi.getHeight(), (int)this.getWidth(), (int)this.getHeight());
        this.iIIIIiiiiiIIi.setBounds(IiiiiiiiIIIII2.x, IiiiiiiiIIIII2.y, this.iIIIIiiiiiIIi.getWidth(), this.iIIIIiiiiiIIi.getHeight());
        this.add((Component)this.iIIIIiiiiiIIi, 0);
        this.iIIIIiiiiiIIi.setVisible(true);
    }

    static /* synthetic */ void iIiIiiiiIIiii(iIiIiiiiiiiIi arg0, int arg1) {
        arg0.iIiIIiiiIIIii = arg1;
    }

    public iIiIiiiiiiiIi(GameView gameView) {
        super(22, 2, IiiiIiiiiIiIi.iIIIIiiiiiIIi, gameView);
        this.iIiiIiiiIiIIi = new Image[2];
        this.ALLATORIxDEMO(-1, 0, 863, 484, IiiiIiiiiIiIi.iiIIIiiiiiiiI);
        this.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/86.png", (int)80, (int)36, (int)80, (int)36, (boolean)false), null);
        this.ALLATORIxDEMO(new iiiiiiiiIIIII(0, 0, 3, 0));
        this.IIiiIiiiIIiIi = new com.xy.q.iIIIiiiiIiIII();
        this.add((Component)this.IIiiIiiiIIiIi);
        this.ALLATORIxDEMO(2, 34, 32);
        this.IiIiiiiiIIIII.setImage("sc/e/73.png");
        this.IiIiiiiiIIIII.setBounds(this.getWidth() - 44, 5, 46, 32);
        this.IiiiiiiiIIIII = IiIIIiiiiIIiI.ALLATORIxDEMO((int)6, (int)5, (int)128, (int)25, (int)10, (Color)Color.white, (Font)iiIIiiiiIiiII.iIiIIiiiiIIiI);
        this.IiIIiiiiIIIII = IiIIIiiiiIIiI.ALLATORIxDEMO((int)141, (int)5, (int)95, (int)25, (int)10, (Color)Color.white, (Font)iiIIiiiiIiiII.iIiIIiiiiIIiI);
        this.IiiiiiiiIIIII.setText(" \u67e5\u8be2NPC\u540d\u5b57");
        this.IiIIiiiiIIIII.setText(" \u67e5\u8be2\u5750\u6807");
        this.IiiiiiiiIIIII.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/e/29.png", (int)3, (int)3, (int)3, (int)3, (boolean)false));
        this.IiIIiiiiIIIII.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/e/29.png", (int)3, (int)3, (int)3, (int)3, (boolean)false));
        this.IIiiiiiiIiiII = new IIIIIiiiIIIiI("sc/e/117.png", 2, 0, (IiiiIiiiiIiIi)this);
        this.iiIiIiiiiIIIi = new IIIIIiiiIIIiI("sc/e/116.png", 2, 0, (IiiiIiiiiIiIi)this);
        this.IIiiiiiiIiiII.setBounds(111, 6, 23, 23);
        this.iiIiIiiiiIIIi.setBounds(213, 6, 23, 23);
        this.add((Component)this.IIiiiiiiIiiII);
        this.add((Component)this.iiIiIiiiiIIIi);
        this.add((Component)this.IiiiiiiiIIIII);
        this.add((Component)this.IiIIiiiiIIIII);
        this.IIIiiiiiIIiII = new IIIIIiiiIIIiI("sc/e/118.png", 1, 272, iiIIiiiiIiiII.iIIIiiiiIIIii, null, "\u9ad8\u7ea7\u641c\u7d22", (IiiiIiiiiIiIi)this);
        this.IIIiiiiiIIiII.setForeground(iiIIiiiiIiiII.ALLATORIxDEMO((String)"#cFFFFED"));
        this.IIIiiiiiIIiII.setOffsetTexts(iiIIiiiiIiiII.IiIIIiiiiiiiI);
        this.IIIiiiiiIIiII.setBounds(245, 6, 76, 23);
        this.add((Component)this.IIIiiiiiIIiII);
        this.iiIIIiiiiiiiI = new IIiiIiiiIIiIi[5];
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iiIIIiiiiiiiI.length) {
            int n = IiiiiiiiIIIII;
            IIiiIiiiIIiIi iIiiIiiiIIiIi = new IIiiIiiiIIiIi(this, IiiiiiiiIIIII, this);
            ++IiiiiiiiIIIII;
            this.iiIIIiiiiiiiI[n] = iIiiIiiiIIiIi;
        }
        this.iiIIiiiiIiIIi = new IIIiiiiiIiIiI[3];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iiIIiiiiIiIIi.length) {
            this.iiIIiiiiIiIIi[IiiiiiiiIIIII] = new IIIiiiiiIiIiI();
            if (IiiiiiiiIIIII == 0) {
                this.iiIIiiiiIiIIi[IiiiiiiiIIIII].iIiIiiiiIIiii("sc/d/88.png");
                this.iiIIiiiiIiIIi[IiiiiiiiIIIII].setBounds(788, 66, 29, 179);
            } else if (IiiiiiiiIIIII == 1) {
                this.iiIIiiiiIiIIi[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/87.png", (int)10, (int)10, (int)10, (int)200, (boolean)false));
                this.iiIIiiiiIiIIi[IiiiiiiiIIIII].setBounds(776, 34, 82, 420);
            } else if (IiiiiiiiIIIII == 2) {
                this.iiIIiiiiIiIIi[IiiiiiiiIIIII].setBounds(3, 34, 772, 420);
                iIIIiiiiiIiIi IiiiiiiiIIIII2 = new iIIIiiiiiIiIi(this);
                this.iiIIiiiiIiIIi[IiiiiiiiIIIII].addMouseListener((MouseListener)IiiiiiiiIIIII2);
                this.iiIIiiiiIiIIi[IiiiiiiiIIIII].addMouseMotionListener((MouseMotionListener)IiiiiiiiIIIII2);
                this.iiiIiiiiiiiIi = new iiiIIiiiIIIii(this);
                this.add(this.iiiIiiiiiiiIi, 0);
            }
            this.add((Component)this.iiIIiiiiIiIIi[IiiiiiiiIIIII++]);
        }
        this.IIiiIiiiIIiIi = new ArrayList<iIIIiiiiIiIII>();
        this.IIIIiiiiiiiII = new ArrayList<IiIIIiiiiIiIi>();
        this.ALLATORIxDEMO = new ArrayList<IIIIIiiiIIIiI>();
    }

    static /* synthetic */ void ALLATORIxDEMO(iIiIiiiiiiiIi arg0, String arg1) {
        arg0.IiIiiiiiIIIII = arg1;
    }

    public void ALLATORIxDEMO(List<iIIIiiiiIiIII> npcModelList, NpcInfoBean npcInfoBean, int type) {
        int IiiiiiiiIIIII = Integer.parseInt(npcInfoBean.getNpctable().getNpcid());
        iIIIiiiiIiIII IiiiiiiiIIIII2 = this.ALLATORIxDEMO(IiiiiiiiIIIII);
        if (IiiiiiiiIIIII2 == null) {
            int IiiiiiiiIIIII3 = Integer.parseInt(npcInfoBean.getNpctable().getTx());
            int IiiiiiiiIIIII4 = Integer.parseInt(npcInfoBean.getNpctable().getTy());
            iIIIiiiiIiIII iIIIiiiiIiIII2 = IiiiiiiiIIIII2 = new iIIIiiiiIiIII(this, IiiiiiiiIIIII, (int)((double)IiiiiiiiIIIII3 / this.iiIiiiiiiIIiI - 4.5), (int)((double)IiiiiiiiIIIII4 / this.iiiiIiiiIIiii - 4.5), npcInfoBean.getNpctable().getNpcname());
            iIIIiiiiIiIII.iiiIiiiiiiIIi((iIIIiiiiIiIII)IiiiiiiiIIIII2, (int)type);
            iIIIiiiiIiIII.iIiIiiiiIIiii((iIIIiiiiIiIII)iIIIiiiiIiIII2, (int)(iIIIiiiiIiIII.ALLATORIxDEMO((iIIIiiiiIiIII)iIIIiiiiIiIII2) + this.iiIIiiiiIiIIi[2].getX()));
            iIIIiiiiIiIII.ALLATORIxDEMO((iIIIiiiiIiIII)IiiiiiiiIIIII2, (int)(iIIIiiiiIiIII.iiiIiiiiiiIIi((iIIIiiiiIiIII)IiiiiiiiIIIII2) + this.iiIIiiiiIiIIi[2].getY()));
        } else if (npcModelList == this.IIiiIiiiIIiIi) {
            return;
        }
        npcModelList.add(IiiiiiiiIIIII2);
    }

    static /* synthetic */ void ALLATORIxDEMO(iIiIiiiiiiiIi arg0, int arg1) {
        arg0.IiiIIiiiiiiiI = arg1;
    }

    public void iiiiiiiiIIiii() {
        GameMove IiiiiiiiIIIII = this.iiIIiiiiIiIIi.roleUnit.ALLATORIxDEMO();
        if (IiiiiiiiIIIII == null) {
            this.iiiiIiiiIiiII = null;
            this.iIiIIiiiIIIii = 0;
            this.IiiIIiiiiiiiI = 0;
            return;
        }
        if (IIiiIiiiiIIiI.iIiIiiiiIIiIi((String)IiiiiiiiIIIII.getValue())) {
            int IiiiiiiiIIIII2 = IiiiiiiiIIIII.x2;
            int IiiiiiiiIIIII3 = IiiiiiiiIIIII.y2;
            IiiiiiiiIIIII2 = (int)((double)IiiiiiiiIIIII2 / this.iiIiiiiiiIIiI - 12.5);
            IiiiiiiiIIIII3 = (int)((double)IiiiiiiiIIIII3 / this.iiIiiiiiiIIiI - 6.0);
            this.iIiIIiiiIIIii = IiiiiiiiIIIII2 += this.iiIIiiiiIiIIi[2].getX();
            this.IiiIIiiiiiiiI = IiiiiiiiIIIII3 += this.iiIIiiiiIiIIi[2].getY();
            return;
        }
        if (this.iiiiIiiiIiiII == IiiiiiiiIIIII.getValue()) return;
        this.iiiiIiiiIiiII = IiiiiiiiIIIII.getValue();
        int IiiiiiiiIIIII4 = this.iiiiIiiiIiiII.lastIndexOf("*");
        int IiiiiiiiIIIII5 = this.iiiiIiiiIiiII.lastIndexOf("*", IiiiiiiiIIIII4 - 1);
        int IiiiiiiiIIIII6 = IIiiIiiiiIIiI.ALLATORIxDEMO((String)this.iiiiIiiiIiiII, (int)(IiiiiiiiIIIII5 + 1), (int)IiiiiiiiIIIII4);
        int IiiiiiiiIIIII7 = IIiiIiiiiIIiI.ALLATORIxDEMO((String)this.iiiiIiiiIiiII, (int)(IiiiiiiiIIIII4 + 1), (int)this.iiiiIiiiIiiII.length());
        IiiiiiiiIIIII6 = (int)((double)IiiiiiiiIIIII6 / this.iiIiiiiiiIIiI - 12.5);
        IiiiiiiiIIIII7 = (int)((double)IiiiiiiiIIIII7 / this.iiIiiiiiiIIiI - 6.0);
        this.iIiIIiiiIIIii = IiiiiiiiIIIII6 += this.iiIIiiiiIiIIi[2].getX();
        this.IiiIIiiiiiiiI = IiiiiiiiIIIII7 += this.iiIIiiiiIiIIi[2].getY();
    }

    static /* synthetic */ IIiiIiiiIIiIi[] ALLATORIxDEMO(iIiIiiiiiiiIi arg0) {
        return arg0.iiIIIiiiiiiiI;
    }

    static /* synthetic */ void ALLATORIxDEMO(iIiIiiiiiiiIi arg0, boolean arg1) {
        arg0.iIiiIiiiiiiII = arg1;
    }

    public void IiiIiiiiiiIiI() {
        int IiiiiiiiIIIII = 0;
        int IiiiiiiiIIIII2 = 1;
        while (IiiiiiiiIIIII2 < this.iiIIIiiiiiiiI.length) {
            if (com.xy.a.IIiiIiiiIIiIi.ALLATORIxDEMO((IIiiIiiiIIiIi)this.iiIIIiiiiiiiI[IiiiiiiiIIIII2])) {
                IiiiiiiiIIIII |= 1 << IiiiiiiiIIIII2;
            }
            ++IiiiiiiiIIIII2;
        }
        IiiiiiiiIIIII2 = 0;
        while (IiiiiiiiIIIII2 < this.ALLATORIxDEMO.size()) {
            IIIIIiiiIIIiI iIIIIiiiIIIiI = this.ALLATORIxDEMO.get(IiiiiiiiIIIII2);
            ++IiiiiiiiIIIII2;
            iIIIIiiiIIIiI.setVisible(false);
        }
        if (IiiiiiiiIIIII == 0) {
            this.IIiiIiiiIIiIi.clear();
            return;
        }
        IiiiiiiiIIIII2 = 0;
        IiiiiiiiiIIII IiiiiiiiIIIII3 = this.ALLATORIxDEMO();
        boolean IiiiiiiiIIIII4 = com.xy.a.IIiiIiiiIIiIi.ALLATORIxDEMO((IIiiIiiiIIiIi)this.iiIIIiiiiiiiI[0]);
        ArrayList<iIIIiiiiIiIII> IiiiiiiiIIIII5 = new ArrayList<iIIIiiiiIiIII>();
        FormulaNum[] IiiiiiiiIIIII6 = this.iiIiiiiiiiIii.getNpcs();
        int IiiiiiiiIIIII7 = 0;
        int IiiiiiiiIIIII8 = IiiiiiiiIIIII6 != null ? IiiiiiiiIIIII6.length : 0;
        while (IiiiiiiiIIIII7 < IiiiiiiiIIIII8) {
            FormulaNum IiiiiiiiIIIII9 = IiiiiiiiIIIII6[IiiiiiiiIIIII7];
            int IiiiiiiiIIIII10 = 0;
            int IiiiiiiiIIIII11 = IiiiiiiiIIIII9.getSize();
            while (IiiiiiiiIIIII10 < IiiiiiiiIIIII11) {
                long IiiiiiiiIIIII12 = IiiiiiiiIIIII9.getZhi(IiiiiiiiIIIII10);
                NpcInfoBean IiiiiiiiIIIII13 = IiiiiiiiIIIII3.ALLATORIxDEMO(String.valueOf(IiiiiiiiIIIII12));
                if (IiiiiiiiIIIII13 != null && !IIiiIiiiiIIiI.iIiIiiiiIIiIi((String)IiiiiiiiIIIII13.getNpctable().getNpctype()) && !IIiiIiiiiIIiI.iIiIiiiiIIiIi((String)IiiiiiiiIIIII13.getNpctable().getNpcname())) {
                    int IiiiiiiiIIIII14 = Integer.parseInt(IiiiiiiiIIIII13.getNpctable().getNpctype());
                    if (IiiiiiiiIIIII14 == 2) {
                        if (IiiiiiiiIIIII4 || com.xy.a.IIiiIiiiIIiIi.ALLATORIxDEMO((IIiiIiiiIIiIi)this.iiIIIiiiiiiiI[1])) {
                            IIIIIiiiIIIiI IiiiiiiiIIIII15;
                            IIIIIiiiIIIiI iIIIIiiiIIIiI = IiiiiiiiIIIII15 = IiiiiiiiIIIII2 < this.ALLATORIxDEMO.size() ? this.ALLATORIxDEMO.get(IiiiiiiiIIIII2) : null;
                            if (IiiiiiiiIIIII15 == null) {
                                IiiiiiiiIIIII15 = new IIIIIiiiIIIiI("sc/e/110.png", 1, 271, (IiiiIiiiiIiIi)this);
                                this.iiiIiiiiiiiIi.add((Component)IiiiiiiiIIIII15, 0);
                                this.ALLATORIxDEMO.add(IiiiiiiiIIIII15);
                            }
                            ++IiiiiiiiIIIII2;
                            int IiiiiiiiIIIII16 = Integer.parseInt(IiiiiiiiIIIII13.getNpctable().getTx());
                            int IiiiiiiiIIIII17 = Integer.parseInt(IiiiiiiiIIIII13.getNpctable().getTy());
                            IiiiiiiiIIIII16 = (int)((double)IiiiiiiiIIIII16 / this.iiIiiiiiiIIiI - 13.5) + this.iiIIiiiiIiIIi[2].getX();
                            IiiiiiiiIIIII17 = (int)((double)IiiiiiiiIIIII17 / this.iiiiIiiiIIiii - 13.5) + this.iiIIiiiiIiIIi[2].getY();
                            IiiiiiiiIIIII15.ALLATORIxDEMO((Object)IiiiiiiiIIIII12);
                            IiiiiiiiIIIII15.setBounds(IiiiiiiiIIIII16, IiiiiiiiIIIII17, 27, 27);
                            IiiiiiiiIIIII15.setVisible(true);
                        }
                    } else if (IiiiiiiiIIIII14 >= 5 && IiiiiiiiIIIII14 <= 10 || IiiiiiiiIIIII14 >= 13 && IiiiiiiiIIIII14 <= 15 || IiiiiiiiIIIII14 == 18 || IiiiiiiiIIIII14 == 37 || IiiiiiiiIIIII14 == 45 || IiiiiiiiIIIII14 == 50 || IiiiiiiiIIIII14 == 88 || IiiiiiiiIIIII14 == 99 || IiiiiiiiIIIII14 == 120 || IiiiiiiiIIIII14 == 121 || IiiiiiiiIIIII14 == 123 || IiiiiiiiIIIII14 == 124 || IiiiiiiiIIIII14 == 125 || IiiiiiiiIIIII14 == 131 || IiiiiiiiIIIII14 == 136 || IiiiiiiiIIIII14 == 735 || IiiiiiiiIIIII14 == 2025) {
                        if (IiiiiiiiIIIII4 || com.xy.a.IIiiIiiiIIiIi.ALLATORIxDEMO((IIiiIiiiIIiIi)this.iiIIIiiiiiiiI[4])) {
                            this.ALLATORIxDEMO(IiiiiiiiIIIII5, IiiiiiiiIIIII13, 1);
                        }
                    } else if (IiiiiiiiIIIII4 || com.xy.a.IIiiIiiiIIiIi.ALLATORIxDEMO((IIiiIiiiIIiIi)this.iiIIIiiiiiiiI[2])) {
                        this.ALLATORIxDEMO(IiiiiiiiIIIII5, IiiiiiiiIIIII13, 0);
                    }
                }
                ++IiiiiiiiIIIII10;
            }
            ++IiiiiiiiIIIII7;
        }
        this.IIiiIiiiIIiIi = IiiiiiiiIIIII5;
    }

    static /* synthetic */ double iIiIiiiiIIiii(iIiIiiiiiiiIi arg0) {
        return arg0.iiiiIiiiIIiii;
    }

    static /* synthetic */ Image iIiIiiiiIIiii(iIiIiiiiiiiIi arg0) {
        return arg0.iIIiIiiiiiiIi;
    }

    static /* synthetic */ Image ALLATORIxDEMO(iIiIiiiiiiiIi arg0) {
        return arg0.IIiiiiiiiIIIi;
    }

    public iIIIiiiiIiIII ALLATORIxDEMO(int nid) {
        for (iIIIiiiiIiIII IiiiiiiiIIIII : this.IIiiIiiiIIiIi) {
            if (iIIIiiiiIiIII.iIiIiiiiIIiii((iIIIiiiiIiIII)IiiiiiiiIIIII) != nid) continue;
            return IiiiiiiiIIIII;
        }
        return null;
    }

    static /* synthetic */ void ALLATORIxDEMO(IIIIIiiiIiIii arg0) {
        IiiiIiiiIiIII = arg0;
    }

    static /* synthetic */ void ALLATORIxDEMO(iIiIiiiiiiiIi arg0, Image arg1) {
        arg0.iIIiIiiiiiiIi = arg1;
    }

    protected void ALLATORIxDEMO(Graphics g) {
        for (iIIIiiiiIiIII iIIIiiiiIiIII2 : this.IIiiIiiiIIiIi) {
            iIIIiiiiIiIII2.ALLATORIxDEMO(g);
        }
        for (IiIIIiiiiIiIi iiIIIiiiiIiIi : this.IIIIiiiiiiiII) {
            iiIIIiiiiIiIi.ALLATORIxDEMO(g);
        }
        if (this.iiIIiiiiIiIIi.mapScene.iiIiiiiiiiIii != this.iiIiiiiiiiIii) return;
        g.drawImage(IIIIIiiiIiiII.ALLATORIxDEMO(), (int)((double)this.iiIIiiiiIiIIi.roleUnit.iiIiIiiiiIIIi / this.iiIiiiiiiIIiI - 5.0) + this.iiIIiiiiIiIIi[2].getX(), (int)((double)this.iiIIiiiiIiIIi.roleUnit.IIiiiiiiiIIIi / this.iiiiIiiiIIiii - 5.0) + this.iiIIiiiiIiIIi[2].getY(), 10, 10, null);
    }

    /*
     * Unable to fully structure code
     */
    public void iIiIiiiiIIiIi() {
        IiiiiiiiIIIII = this.ALLATORIxDEMO();
        IiiiiiiiIIIII = new ArrayList<IiIIIiiiiIiIi>();
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < IiiiiiiiIIIII.goodPacks.length) {
            block3: {
                IiiiiiiiIIIII = IiiiiiiiIIIII.getGood(IiiiiiiiIIIII.goodPacks[IiiiiiiiIIIII]);
                if (IiiiiiiiIIIII != null && GoodType.IIiIIiiiIiIIi((long)IiiiiiiiIIIII.getType()) && (IiiiiiiiIIIII = IiiiiiiiIIIII.getFight()) != null) ** GOTO lbl13
                break block3;
lbl-1000:
                // 1 sources

                {
                    if ((long)IiiiiiiiIIIII.getMap() == this.iiIiiiiiiiIii.getMapId()) {
                        IiiiiiiiIIIII = new IiIIIiiiiIiIi(this, IiiiiiiiIIIII.getRgid(), IiiiiiiiIIIII);
                        IiiiiiiiIIIII.add(IiiiiiiiIIIII);
                    }
                    IiiiiiiiIIIII = IiiiiiiiIIIII.getNextFight();
lbl13:
                    // 2 sources

                    ** while (IiiiiiiiIIIII != null)
                }
            }
            ++IiiiiiiiIIIII;
        }
        this.IIIIiiiiiiiII = IiiiiiiiIIIII;
    }

    public boolean ALLATORIxDEMO(MapModel mapModel) {
        com.xy.w.IiiiiiiiiIIII IiiiiiiiIIIII = IIIIIiiiIiiII.ALLATORIxDEMO((String)String.valueOf(mapModel.getMapModel()));
        if (IiiiiiiiIIIII == null) {
            return false;
        }
        this.iiIiiiiiiiIii = mapModel;
        this.IiIIIiiiiIiiI = null;
        this.iIiiIiiiiiiII = false;
        this.iiiiIiiiIiiII = null;
        this.iiIIiiiiIiIIi[2].ALLATORIxDEMO(IiiiiiiiIIIII.ALLATORIxDEMO());
        this.iiIIiiiiIiIIi[2].setBounds(3, 34, IiiiiiiiIIIII.ALLATORIxDEMO().getWidth(null), IiiiiiiiIIIII.ALLATORIxDEMO().getHeight(null));
        this.iiIIiiiiIiIIi[0].setBounds(this.iiIIiiiiIiIIi[2].getWidth() + 15, 66, 29, 179);
        this.iiIIiiiiIiIIi[1].setBounds(this.iiIIiiiiIiIIi[2].getWidth() + 3, 34, 82, this.iiIIiiiiIiIIi[2].getHeight());
        int IiiiiiiiIIIII2 = 0;
        while (IiiiiiiiIIIII2 < this.iiIIIiiiiiiiI.length) {
            com.xy.a.IIiiIiiiIIiIi.ALLATORIxDEMO((IIiiIiiiIIiIi)this.iiIIIiiiiiiiI[IiiiiiiiIIIII2]).setBounds(20 + 68 * IiiiiiiiIIIII2, 37 + this.iiIIiiiiIiIIi[2].getHeight(), 20, 20);
            JLabel jLabel = com.xy.a.IIiiIiiiIIiIi.ALLATORIxDEMO((IIiiIiiiIIiIi)this.iiIIIiiiiiiiI[IiiiiiiiIIIII2]);
            int n = 43 + 68 * IiiiiiiiIIIII2;
            ++IiiiiiiiIIIII2;
            jLabel.setBounds(n, 37 + this.iiIIiiiiIiIIi[2].getHeight(), 45, 20);
        }
        this.IIiiIiiiIIiIi.ALLATORIxDEMO(mapModel.getMapName(), null);
        this.ALLATORIxDEMO(this.iiIIiiiiIiIIi[2].getWidth() + 47, 46, 34, (mapModel.getMapName().length() + 1) * 34);
        this.iIiIiiiiIIiii(-1, 0, this.iiIIiiiiIiIIi[2].getWidth() + 90, this.iiIIiiiiIiIIi[2].getHeight() + 64);
        this.iiiIiiiiiiiIi.setBounds(0, 0, this.iiIIiiiiIiIIi[2].getWidth() + 90, this.iiIIiiiiIiIIi[2].getHeight() + 64);
        if (this.iIIIIiiiiiIIi != null) {
            this.iIIIIiiiiiIIi.setVisible(false);
        }
        Point IiiiiiiiIIIII22 = IIIIIiiiIiiII.ALLATORIxDEMO((int)mapModel.getMapModel());
        this.iiIiiiiiiIIiI = (double)IiiiiiiiIIIII22.x / (double)this.iiIIiiiiIiIIi[2].getWidth();
        this.iiiiIiiiIIiii = (double)IiiiiiiiIIIII22.y / (double)this.iiIIiiiiIiIIi[2].getHeight();
        this.iiiIiiiiiiIIi();
        return true;
    }

    static /* synthetic */ List ALLATORIxDEMO(iIiIiiiiiiiIi arg0) {
        return arg0.IIIIiiiiiiiII;
    }

    public void ALLATORIxDEMO(MapModel mapModel) {
        this.IiIIIiiiiIiiI = null;
        if (this.iiIiiiiiiiIii != null && this.iiIiiiiiiiIii.getMapId() == mapModel.getMapId()) {
            this.iIiIiiiiIIiIi();
        } else if (!this.ALLATORIxDEMO(mapModel)) {
            return;
        }
        this.ALLATORIxDEMO().iIiIiiiiIIiIi(this.iIiIiiiiIIiii());
    }

    static /* synthetic */ iiIiIiiiiiiiI ALLATORIxDEMO(iIiIiiiiiiiIi arg0) {
        return arg0.iIIIIiiiiiIIi;
    }

    static /* synthetic */ double ALLATORIxDEMO(iIiIiiiiiiiIi arg0) {
        return arg0.iiIiiiiiiIIiI;
    }

    public void ALLATORIxDEMO(MapModel mapModel, NpcInfoBean npcInfoBean) {
        if (this.iiIiiiiiiiIii != null && this.iiIiiiiiiiIii.getMapId() == mapModel.getMapId()) {
            this.iIiIiiiiIIiIi();
        } else if (!this.ALLATORIxDEMO(mapModel)) {
            return;
        }
        int IiiiiiiiIIIII = Integer.parseInt(npcInfoBean.getNpctable().getTx());
        int IiiiiiiiIIIII2 = Integer.parseInt(npcInfoBean.getNpctable().getTy());
        IiiIiiiiIIIiI iiiIiiiiIIIiI = this.IiIIIiiiiIiiI = new IiiIiiiiIIIiI(this, (int)((double)IiiiiiiiIIIII / this.iiIiiiiiiIIiI - 4.5), (int)((double)IiiiiiiiIIIII2 / this.iiiiIiiiIIiii - 4.5), npcInfoBean.getNpctable().getNpcname());
        IiiIiiiiIIIiI.iIiIiiiiIIiii((IiiIiiiiIIIiI)iiiIiiiiIIIiI, (int)(IiiIiiiiIIIiI.ALLATORIxDEMO((IiiIiiiiIIIiI)iiiIiiiiIIIiI) + this.iiIIiiiiIiIIi[2].getX()));
        IiiIiiiiIIIiI iiiIiiiiIIIiI2 = this.IiIIIiiiiIiiI;
        IiiIiiiiIIIiI.ALLATORIxDEMO((IiiIiiiiIIIiI)iiiIiiiiIIIiI2, (int)(IiiIiiiiIIIiI.iIiIiiiiIIiii((IiiIiiiiIIIiI)iiiIiiiiIIIiI2) + this.iiIIiiiiIiIIi[2].getY()));
        this.ALLATORIxDEMO().iIiIiiiiIIiIi(this.iIiIiiiiIIiii());
    }

    public void iiiIiiiiiiIIi() {
        this.IiiIiiiiiiIiI();
        this.iIiIiiiiIIiIi();
    }

    static /* synthetic */ iiiiiiiiIIIII ALLATORIxDEMO(iIiIiiiiiiiIi arg0) {
        return arg0.iIiIiiiiIiIii;
    }
}
