/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.a.IIiiIiiiIiiiI
 *  com.xy.a.a.IiiIiiiiIIIii
 *  com.xy.a.a.iiIIiiiiIiiII
 *  com.xy.a.a.iiIiIiiiiiIIi
 *  com.xy.entity.RoleSummoning
 *  com.xy.formula.PetProperty
 *  com.xy.game.RoleData
 *  com.xy.game.RolePet
 *  com.xy.i.IIiIiiiiIiIII
 *  com.xy.i.IiIiIiiiiIIiI
 *  com.xy.q.IIIIIiiiIIIiI
 *  com.xy.q.IiIIIiiiiIIiI
 *  com.xy.q.IiiiIiiiiIiII
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.q.iIIiIiiiIiiIi
 *  com.xy.q.iIiIiiiiIiIII
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.text.GameView
 *  com.xy.v.IiiiIiiiiIIII
 *  com.xy.v.iIiIIiiiIiiiI
 *  com.xy.w.IIIIIiiiIiiII
 *  com.xy.w.IIIiiiiiIiIiI
 *  com.xy.w.IIiIiiiiIIiii
 *  com.xy.w.IIiIiiiiIiiIi
 *  com.xy.w.IiiiIiiiiIiIi
 */
package com.xy.a.a;

import com.xy.a.a.IIiiIiiiIiiiI;
import com.xy.a.a.IiiIiiiiIIIii;
import com.xy.a.a.iiIIiiiiIiiII;
import com.xy.a.a.iiIiIiiiiiIIi;
import com.xy.entity.RoleSummoning;
import com.xy.formula.PetProperty;
import com.xy.game.RoleData;
import com.xy.game.RolePet;
import com.xy.i.IIiIiiiiIiIII;
import com.xy.i.IiIiIiiiiIIiI;
import com.xy.q.IIIIIiiiIIIiI;
import com.xy.q.IiIIIiiiiIIiI;
import com.xy.q.IiiiIiiiiIiII;
import com.xy.q.IiiiIiiiiIiIi;
import com.xy.q.iIIiIiiiIiiIi;
import com.xy.q.iIiIiiiiIiIII;
import com.xy.text.GameView;
import com.xy.v.IiiiIiiiiIIII;
import com.xy.v.iIiIIiiiIiiiI;
import com.xy.w.IIIIIiiiIiiII;
import com.xy.w.IIIiiiiiIiIiI;
import com.xy.w.IIiIiiiiIIiii;
import com.xy.w.IIiIiiiiIiiIi;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.math.BigDecimal;
import javax.swing.JLabel;
import javax.swing.JScrollPane;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class iiIiIiiiiIiii
extends IiiiIiiiiIiIi {
    private JLabel[] IiIiiiiiIIIII;
    private boolean iiIiIiiiiIIIi;
    private iIIiIiiiIiiIi[] iiiiIiiiIiiII;
    private IiIiIiiiiIIiI[] iiiIiiiiiiiIi;
    private IiiiIiiiiIiII iIiiIiiiiiiII;
    private iiIIiiiiIiiII IIiiIiiiIIiIi;
    private JScrollPane iIiIiiiiIiIii;
    private IIIiiiiiIiIiI[] IiIIIiiiiIiiI;
    private com.xy.w.IiiiIiiiiIiIi iiIiiiiiiiIii;
    private IIiIiiiiIiIII[] IiiiiiiiIIIII;
    private IIIIIiiiIIIiI ALLATORIxDEMO;

    public boolean ALLATORIxDEMO() {
        this.iiiIiiiiiiIIi();
        return super.ALLATORIxDEMO();
    }

    public IiiiIiiiiIiII ALLATORIxDEMO() {
        return this.iIiiIiiiiiiII;
    }

    public void ALLATORIxDEMO(BigDecimal petId) {
        this.ALLATORIxDEMO.ALLATORIxDEMO(petId != null ? petId.longValue() : 0L);
    }

    public iIIiIiiiIiiIi[] ALLATORIxDEMO() {
        return this.iiiiIiiiIiiII;
    }

    public IiIiIiiiiIIiI[] ALLATORIxDEMO() {
        return this.iiiIiiiiiiiIi;
    }

    public void iiiIiiiiiiIIi(int index2) {
        RolePet IiiiiiiiIIIII;
        this.IIiiIiiiIIiIi.setVisible(false);
        if (--index2 < 0) {
            return;
        }
        RoleData IiiiiiiiIIIII2 = this.ALLATORIxDEMO();
        RolePet IiiiiiiiIIIII3 = IiiiiiiiIIIII2.getRolePet(iiIIiiiiIiiII.ALLATORIxDEMO((iiIIiiiiIiiII)this.IIiiIiiiIIiIi).longValue());
        int IiiiiiiiIIIII4 = IiiiiiiiIIIII3 != null ? IiiiiiiiIIIII2.pets.indexOf(IiiiiiiiIIIII3) : -1;
        if (IiiiiiiiIIIII3 == null) return;
        if (IiiiiiiiIIIII4 == -1) {
            return;
        }
        if (IiiiiiiiIIIII4 == index2) {
            return;
        }
        RolePet rolePet = IiiiiiiiIIIII = index2 < IiiiiiiiIIIII2.pets.size() ? (RolePet)IiiiiiiiIIIII2.pets.get(index2) : null;
        if (IiiiiiiiIIIII == null) {
            return;
        }
        IiiiiiiiIIIII2.pets.set(IiiiiiiiIIIII4, IiiiiiiiIIIII);
        IiiiiiiiIIIII2.pets.set(index2, IiiiiiiiIIIII3);
        IiiiiiiiIIIII2.iIiIiiiiIIiii();
        this.ALLATORIxDEMO.iIiIiiiiIIiii();
    }

    public iiIiIiiiiIiii(GameView gameView) {
        super(6, 2, IiiiIiiiiIiIi.iIIIIiiiiiIIi, gameView);
        this.ALLATORIxDEMO(-2, 0, 397, 495, IiiiIiiiiIiIi.iiIIIiiiiiiiI);
        this.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/1.png", (int)68, (int)68, (int)68, (int)68, (boolean)false), "\u53ec\u5524\u517d");
        this.ALLATORIxDEMO = new IIIIIiiiIIIiI((IiiiIiiiiIiIi)this);
        this.ALLATORIxDEMO.setBounds(0, 0, 150, 20);
        this.iIiIiiiiIiIii = IiIIIiiiiIIiI.ALLATORIxDEMO((int)45, (int)42, (int)170, (int)140, (Component)this.ALLATORIxDEMO, (int)20);
        this.add(this.iIiIiiiiIiIii);
        this.IiIiiiiiIIIII = new JLabel[17];
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IiIiiiiiIIIII.length) {
            this.IiIiiiiiIIIII[IiiiiiiiIIIII] = IiIIIiiiiIIiI.ALLATORIxDEMO((int)40, (int)146, (int)130, (int)18, (int)0, (Color)Color.black, (Font)com.xy.q.iiIIiiiiIiiII.iiiiIiiiIiiII);
            this.IiIiiiiiIIIII[IiiiiiiiIIIII].setText(IiiiiiiiIIIII == 0 ? "\u53ec\u5524\u517d(6/18)" : (IiiiiiiiIIIII == 1 ? "\u540d\u79f0" : (IiiiiiiiIIIII == 2 ? "\u7b49\u7ea7" : (IiiiiiiiIIIII == 3 ? "\u5fe0\u8bda" : (IiiiiiiiIIIII == 4 ? "\u4eb2\u5bc6" : (IiiiiiiiIIIII == 5 ? "\u6c14\u8840" : (IiiiiiiiIIIII == 6 ? "\u6cd5\u529b" : (IiiiiiiiIIIII == 7 ? "\u653b\u51fb" : (IiiiiiiiIIIII == 8 ? "\u901f\u5ea6" : (IiiiiiiiIIIII == 9 ? "\u7ecf\u9a8c" : (IiiiiiiiIIIII == 10 ? "\u53ef\u5206\u914d\u70b9" : (IiiiiiiiIIIII == 11 ? "\u6839\u9aa8" : (IiiiiiiiIIIII == 12 ? "\u7075\u6027" : (IiiiiiiiIIIII == 13 ? "\u529b\u91cf" : (IiiiiiiiIIIII == 14 ? "\u654f\u6377" : (IiiiiiiiIIIII == 15 ? "\u7985\u5b9a" : (IiiiiiiiIIIII == 16 ? "\u5b9a\u529b" : "")))))))))))))))));
            if (IiiiiiiiIIIII == 0) {
                this.IiIiiiiiIIIII[IiiiiiiiIIIII].setBounds(45, 21, 170, 21);
                this.IiIiiiiiIIIII[IiiiiiiiIIIII].setForeground(Color.white);
            } else if (IiiiiiiiIIIII >= 1 && IiiiiiiiIIIII <= 9) {
                this.IiIiiiiiIIIII[IiiiiiiiIIIII].setBounds(39, 195 + (IiiiiiiiIIIII - 1) * 25, 40, 20);
            } else if (IiiiiiiiIIIII == 10) {
                this.IiIiiiiiIIIII[IiiiiiiiIIIII].setBounds(231, 271, 92, 20);
            } else if (IiiiiiiiIIIII >= 11 && IiiiiiiiIIIII <= 14) {
                this.IiIiiiiiIIIII[IiiiiiiiIIIII].setBounds(231, 297 + (IiiiiiiiIIIII - 11) * 25, 40, 20);
            } else if (IiiiiiiiIIIII == 15) {
                this.IiIiiiiiIIIII[IiiiiiiiIIIII].setBounds(39, 395, 40, 20);
            } else if (IiiiiiiiIIIII == 16) {
                this.IiIiiiiiIIIII[IiiiiiiiIIIII].setBounds(231, 397, 40, 20);
            }
            this.add(this.IiIiiiiiIIIII[IiiiiiiiIIIII++]);
        }
        this.iiiIiiiiiiiIi = new IiIiIiiiiIIiI[17];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iiiIiiiiiiiIi.length) {
            this.iiiIiiiiiiiIi[IiiiiiiiIIIII] = new IiIiIiiiiIIiI(null, 1, 21 + IiiiiiiiIIIII, com.xy.q.iiIIiiiiIiiII.iiIiiiiiiIIiI, null, "", (IiiiIiiiiIiIi)this);
            this.iiiIiiiiiiiIi[IiiiiiiiIIIII].setText(IiiiiiiiIIIII == 5 ? "\u6539" : (IiiiiiiiIIIII == 6 ? "\u653e\u751f" : (IiiiiiiiIIIII == 7 ? "\u9a6f\u517b" : (IiiiiiiiIIIII == 8 ? "\u53ec\u5524" : (IiiiiiiiIIIII == 9 ? "\u53c2\u6218" : (IiiiiiiiIIIII == 10 ? "\u7269\u54c1" : (IiiiiiiiIIIII == 11 ? "\u70bc\u5996" : (IiiiiiiiIIIII == 12 ? "\u6297\u6027" : (IiiiiiiiIIIII == 13 ? "\u6280\u80fd" : (IiiiiiiiIIIII == 14 ? "\u63a8\u8350\u52a0\u70b9" : (IiiiiiiiIIIII == 15 ? "\u786e\u8ba4\u52a0\u70b9" : (IiiiiiiiIIIII == 16 ? "\u7075\u7280" : ""))))))))))));
            if (IiiiiiiiIIIII == 0) {
                this.iiiIiiiiiiiIi[IiiiiiiiIIIII].setImage("sc/e/1.png");
                this.iiiIiiiiiiiIi[IiiiiiiiIIIII].setBounds(258, 22, 18, 18);
            } else if (IiiiiiiiIIIII == 1) {
                this.iiiIiiiiiiiIi[IiiiiiiiIIIII].setImage("sc/e/2.png");
                this.iiiIiiiiiiiIi[IiiiiiiiIIIII].setBounds(279, 22, 18, 18);
            } else if (IiiiiiiiIIIII >= 2 && IiiiiiiiIIIII <= 4) {
                this.iiiIiiiiiiiIi[IiiiiiiiIIIII].setImage("sc/e/49.png");
                this.iiiIiiiiiiiIi[IiiiiiiiIIIII].setBounds(217, 93 + (IiiiiiiiIIIII - 2) * 20, 17, 17);
            } else if (IiiiiiiiIIIII == 5) {
                this.iiiIiiiiiiiIi[IiiiiiiiIIIII].setImage("sc/e/40.png");
                this.iiiIiiiiiiiIi[IiiiiiiiIIIII].setBounds(195, 196, 18, 18);
            } else if (IiiiiiiiIIIII == 6 || IiiiiiiiIIIII == 7) {
                this.iiiIiiiiiiiIi[IiiiiiiiIIIII].setImage("sc/e/6.png");
                this.iiiIiiiiiiiIi[IiiiiiiiIIIII].setBounds(178, 221 + (IiiiiiiiIIIII - 6) * 25, 34, 18);
            } else if (IiiiiiiiIIIII >= 8 && IiiiiiiiIIIII <= 13 || IiiiiiiiIIIII == 16) {
                this.iiiIiiiiiiiIi[IiiiiiiiIIIII].setFont(com.xy.q.iiIIiiiiIiiII.iiiiIiiiIiiII);
                this.iiiIiiiiiiiIi[IiiiiiiiIIIII].setForeground(Color.black);
                this.iiiIiiiiiiiIi[IiiiiiiiIIIII].setImage("sc/e/7.png");
                if (IiiiiiiiIIIII == 8) {
                    this.iiiIiiiiiiiIi[IiiiiiiiIIIII].setBounds(315, 450, 59, 25);
                } else if (IiiiiiiiIIIII == 9) {
                    this.iiiIiiiiiiiIi[IiiiiiiiIIIII].setBounds(310, 243, 59, 25);
                } else if (IiiiiiiiIIIII == 10) {
                    this.iiiIiiiiiiiIi[IiiiiiiiIIIII].setBounds(43 + (IiiiiiiiIIIII - 10) * 68, 450, 59, 25);
                } else if (IiiiiiiiIIIII == 11) {
                    this.iiiIiiiiiiiIi[IiiiiiiiIIIII].setBounds(43 + (IiiiiiiiIIIII - 10) * 68, 450, 59, 25);
                } else if (IiiiiiiiIIIII == 12) {
                    this.iiiIiiiiiiiIi[IiiiiiiiIIIII].setBounds(43 + (IiiiiiiiIIIII - 10) * 68, 450, 59, 25);
                } else if (IiiiiiiiIIIII == 13) {
                    this.iiiIiiiiiiiIi[IiiiiiiiIIIII].setBounds(43 + (IiiiiiiiIIIII - 10) * 68, 450, 59, 25);
                } else if (IiiiiiiiIIIII == 16) {
                    this.iiiIiiiiiiiIi[IiiiiiiiIIIII].setBounds(244, 243, 59, 25);
                }
            } else if (IiiiiiiiIIIII == 14 || IiiiiiiiIIIII == 15) {
                this.iiiIiiiiiiiIi[IiiiiiiiIIIII].setImage("sc/e/27.png");
                this.iiiIiiiiiiiIi[IiiiiiiiIIIII].setBounds(233 + (IiiiiiiiIIIII - 14) * 77, 397, 51, 17);
            }
            this.add((Component)this.iiiIiiiiiiiIi[IiiiiiiiIIIII++]);
        }
        this.IiiiiiiiIIIII = new IIiIiiiiIiIII[10];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IiiiiiiiIIIII.length) {
            this.IiiiiiiiIIIII[IiiiiiiiIIIII] = new IIiIiiiiIiIII(IiiiiiiiIIIII % 2 == 0 ? "sc/e/32.png" : "sc/e/34.png", 1, 200 + IiiiiiiiIIIII, (IiiiIiiiiIiIi)this);
            this.IiiiiiiiIIIII[IiiiiiiiIIIII].setBounds(350 + 11 * (IiiiiiiiIIIII % 2), 300 + 25 * (IiiiiiiiIIIII / 2), 11, 15);
            this.add((Component)this.IiiiiiiiIIIII[IiiiiiiiIIIII++]);
        }
        this.iIiiIiiiiiiII = IiIIIiiiiIIiI.ALLATORIxDEMO((IIiIiiiiIIiii)IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/17.png", (int)3, (int)3, (int)3, (int)3, (boolean)false), (Font)com.xy.q.iiIIiiiiIiiII.ALLATORIxDEMO, (Color)Color.white);
        this.iIiiIiiiiiiII.setBounds(79, 195, 134, 20);
        this.add((Component)this.iIiiIiiiiiiII);
        this.iiiiIiiiIiiII = new iIIiIiiiIiiIi[15];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iiiiIiiiIiiII.length) {
            this.iiiiIiiiIiiII[IiiiiiiiIIIII] = IiIIIiiiiIIiI.ALLATORIxDEMO((int)0, (int)0, (int)0, (int)0, (int)10, (Color)Color.white, (Font)(IiiiiiiiIIIII == 0 ? com.xy.q.iiIIiiiiIiiII.ALLATORIxDEMO : com.xy.q.iiIIiiiiIiiII.iIiIiiiiIiiii));
            this.iiiiIiiiIiiII[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/17.png", (int)3, (int)3, (int)3, (int)3, (boolean)false));
            if (IiiiiiiiIIIII == 0 || IiiiiiiiIIIII == 1) {
                this.iiiiIiiiIiiII[IiiiiiiiIIIII].setBounds(79, 220 + IiiiiiiiIIIII * 25, 98, 20);
            } else if (IiiiiiiiIIIII >= 2 && IiiiiiiiIIIII <= 7) {
                this.iiiiIiiiIiiII[IiiiiiiiIIIII].setBounds(79, 220 + IiiiiiiiIIIII * 25, 134, 20);
            } else if (IiiiiiiiIIIII == 8) {
                this.iiiiIiiiIiiII[IiiiiiiiIIIII].setBounds(323, 271, 52, 20);
            } else if (IiiiiiiiIIIII >= 9 && IiiiiiiiIIIII <= 12) {
                this.iiiiIiiiIiiII[IiiiiiiiIIIII].setBounds(271, 297 + (IiiiiiiiIIIII - 9) * 25, 104, 20);
            } else if (IiiiiiiiIIIII == 13) {
                this.iiiiIiiiIiiII[IiiiiiiiIIIII].setBounds(79, 395, 134, 20);
            } else if (IiiiiiiiIIIII == 14) {
                this.iiiiIiiiIiiII[IiiiiiiiIIIII].setBounds(271, 397, 104, 20);
            }
            this.add((Component)this.iiiiIiiiIiiII[IiiiiiiiIIIII++]);
        }
        this.IiIIIiiiiIiiI = new IIIiiiiiIiIiI[3];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IiIIIiiiiIiiI.length) {
            this.IiIIIiiiiIiiI[IiiiiiiiIIIII] = new IIIiiiiiIiIiI();
            if (IiiiiiiiIIIII == 0) {
                this.IiIIIiiiiIiiI[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/25.png", (int)2, (int)2, (int)2, (int)2, (boolean)false));
                this.IiIIIiiiiIiiI[IiiiiiiiIIIII].setBounds(45, 21, 170, 21);
            } else if (IiiiiiiiIIIII == 1) {
                this.IiIIIiiiiIiiI[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/24.png", (int)2, (int)2, (int)2, (int)2, (boolean)false));
                this.IiIIIiiiiIiiI[IiiiiiiiIIIII].setBounds(45, 21, 170, 160);
            } else if (IiiiiiiiIIIII == 2) {
                this.IiIIIiiiiIiiI[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/16.png", (int)2, (int)2, (int)2, (int)2, (boolean)false));
                this.IiIIIiiiiIiiI[IiiiiiiiIIIII].setBounds(234, 40, 143, 200);
            }
            this.add((Component)this.IiIIIiiiiIiiI[IiiiiiiiIIIII++]);
        }
        this.iIiIiiiiIIiii(0);
    }

    static /* synthetic */ iiIIiiiiIiiII ALLATORIxDEMO(iiIiIiiiiIiii arg0) {
        return arg0.IIiiIiiiIIiIi;
    }

    public void iIiIiiiiIIiii() {
        this.ALLATORIxDEMO.iIiIiiiiIIiii();
        this.ALLATORIxDEMO.ALLATORIxDEMO();
        super.iIiIiiiiIIiii();
    }

    public void iiiIiiiiiiIIi(boolean lock) {
        this.iiIiIiiiiIIIi = lock;
    }

    public void iiiIiiiiiiIIi() {
        this.ALLATORIxDEMO((iIiIiiiiIiIII)null);
        this.iIiiIiiiiiiII.setText(null);
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iiiiIiiiIiiII.length) {
            this.iiiiIiiiIiiII[IiiiiiiiIIIII++].setText(null);
        }
        this.iiIiiiiiiiIii = null;
        this.iiIiIiiiiIIIi = false;
        IiiiiiiiIIIII = 2;
        while (IiiiiiiiIIIII < 5) {
            this.iiiIiiiiiiiIi[IiiiiiiiIIIII++].setVisible(false);
        }
        this.iIiIiiiiIIiii(0);
    }

    /*
     * Enabled unnecessary exception pruning
     */
    public int ALLATORIxDEMO(int type) {
        try {
            if (type == 0) {
                return Integer.parseInt(this.iiiiIiiiIiiII[9].getText());
            }
            if (type == 1) {
                return Integer.parseInt(this.iiiiIiiiIiiII[10].getText());
            }
            if (type == 2) {
                return Integer.parseInt(this.iiiiIiiiIiiII[11].getText());
            }
            if (type == 3) {
                return Integer.parseInt(this.iiiiIiiiIiiII[12].getText());
            }
            if (type == 4) {
                return Integer.parseInt(this.iiiiIiiiIiiII[14].getText());
            }
            if (type != 5) return type;
            return Integer.parseInt(this.iiiiIiiiIiiII[8].getText());
        }
        catch (Exception IiiiiiiiIIIII) {
            return 0;
        }
    }

    public void ALLATORIxDEMO(iIiIiiiiIiIII petGrid) {
        if (petGrid == null) {
            if (this.IIiiIiiiIIiIi == null) {
                return;
            }
            this.IIiiIiiiIIiIi.setVisible(false);
            return;
        }
        if (petGrid.ALLATORIxDEMO() == 0L) {
            return;
        }
        if (this.IIiiIiiiIIiIi == null) {
            this.IIiiIiiiIIiIi = new iiIIiiiiIiiII(this);
            this.add((Component)this.IIiiIiiiIIiIi, 0);
        }
        this.IIiiIiiiIIiIi.ALLATORIxDEMO(new BigDecimal(petGrid.ALLATORIxDEMO()));
        this.IIiiIiiiIIiIi.ALLATORIxDEMO(230, 40);
        this.IIiiIiiiIIiIi.setVisible(true);
    }

    protected void paintChildren(Graphics g) {
        super.paintChildren(g);
        if (this.iiIiiiiiiiIii != null) {
            this.iiIiiiiiiiIii.ALLATORIxDEMO(g, 300, 200, 0, iIiIIiiiIiiiI.ALLATORIxDEMO());
        }
        if (!this.iiIiIiiiiIIIi) return;
        g.drawImage(IIiIiiiiIiiIi.IiIIIiiiiIiiI, 360, 46, 10, 12, null);
    }

    public void ALLATORIxDEMO(int grade, String name) {
        this.iIiiIiiiiiiII.setText(name);
        this.iiiiIiiiIiiII[0].setForeground(Color.white);
        this.iiiiIiiiIiiII[0].setText(String.valueOf(IiiiIiiiiIIII.ALLATORIxDEMO((int)grade)) + "\u7ea7");
        this.iIiIiiiiIIiii(IiiiIiiiiIIII.IIIIIiiiiIIii((int)grade));
    }

    static /* synthetic */ IIIIIiiiIIIiI ALLATORIxDEMO(iiIiIiiiiIiii arg0) {
        return arg0.ALLATORIxDEMO;
    }

    public JLabel[] ALLATORIxDEMO() {
        return this.IiIiiiiiIIIII;
    }

    public void iIiIiiiiIIiii(int lvltrue) {
        if (lvltrue <= 3) {
            this.IiiiiiiiIIIII[8].setVisible(false);
            this.IiiiiiiiIIIII[9].setVisible(false);
            this.IiIiiiiiIIIII[15].setVisible(false);
            this.IiIiiiiiIIIII[16].setVisible(false);
            this.iiiiIiiiIiiII[13].setVisible(false);
            this.iiiiIiiiIiiII[14].setVisible(false);
            this.iiiIiiiiiiiIi[16].setVisible(false);
            this.IiIiiiiiIIIII[9].setBounds(39, 395, 40, 20);
            this.iiiiIiiiIiiII[7].setBounds(79, 395, 134, 20);
            this.iiiIiiiiiiiIi[14].setBounds(253, 397, 51, 17);
            this.iiiIiiiiiiiIi[15].setBounds(310, 397, 51, 17);
            return;
        }
        this.IiiiiiiiIIIII[8].setVisible(true);
        this.IiiiiiiiIIIII[9].setVisible(true);
        this.IiIiiiiiIIIII[15].setVisible(true);
        this.IiIiiiiiIIIII[16].setVisible(true);
        this.iiiiIiiiIiiII[13].setVisible(true);
        this.iiiiIiiiIiiII[14].setVisible(true);
        this.iiiIiiiiiiiIi[16].setVisible(true);
        this.IiIiiiiiIIIII[9].setBounds(39, 420, 40, 20);
        this.iiiiIiiiIiiII[7].setBounds(79, 420, 134, 20);
        this.iiiIiiiiiiiIi[14].setBounds(253, 422, 51, 17);
        this.iiiIiiiiiiiIi[15].setBounds(310, 422, 51, 17);
    }

    public void ALLATORIxDEMO(RolePet rolePet) {
        IiiIiiiiIIIii IiiiiiiiIIIII;
        iiIiIiiiiiIIi IiiiiiiiIIIII2;
        RoleData IiiiiiiiIIIII3 = this.ALLATORIxDEMO();
        IiiiiiiiIIIII3.setChosePetId(rolePet != null ? rolePet.getId() : null);
        if (rolePet == null) {
            this.iiiIiiiiiiIIi();
            this.ALLATORIxDEMO().iiiIiiiiiiIIi(18);
            this.ALLATORIxDEMO().iiiIiiiiiiIIi(67);
            return;
        }
        this.ALLATORIxDEMO((iIiIiiiiIiIII)null);
        RoleSummoning IiiiiiiiIIIII4 = rolePet.getPet();
        int[] IiiiiiiiIIIII5 = PetProperty.getPetHMASp((RoleSummoning)IiiiiiiiIIIII4, (RoleData)IiiiiiiiIIIII3);
        this.iiiiIiiiIiiII[3].setText(String.valueOf(IiiiiiiiIIIII4.getBasishp(IiiiiiiiIIIII5[0])) + "/" + IiiiiiiiIIIII5[0]);
        this.iiiiIiiiIiiII[4].setText(String.valueOf(IiiiiiiiIIIII4.getBasismp(IiiiiiiiIIIII5[1])) + "/" + IiiiiiiiIIIII5[1]);
        this.iiiiIiiiIiiII[5].setText(String.valueOf(IiiiiiiiIIIII5[2]));
        this.iiiiIiiiIiiII[6].setText(String.valueOf(IiiiiiiiIIIII5[3]));
        this.iiiiIiiiIiiII[13].setText(String.valueOf(IiiiiiiiIIIII5[4]));
        this.iiiiIiiiIiiII[9].setText(String.valueOf(IiiiiiiiIIIII5[5]));
        this.iiiiIiiiIiiII[10].setText(String.valueOf(IiiiiiiiIIIII5[6]));
        this.iiiiIiiiIiiII[11].setText(String.valueOf(IiiiiiiiIIIII5[7]));
        this.iiiiIiiiIiiII[12].setText(String.valueOf(IiiiiiiiIIIII5[8]));
        this.iiiiIiiiIiiII[14].setText(String.valueOf(IiiiiiiiIIIII5[9]));
        this.iiiiIiiiIiiII[8].setText(String.valueOf(IiiiiiiiIIIII4.getCanpoint()));
        this.iiiiIiiiIiiII[7].setText(String.valueOf(IiiiiiiiIIIII4.getExp().toString()) + "/" + this.ALLATORIxDEMO().iiiIiiiiiiIIi(IiiiiiiiIIIII4.getTurnRount(), IiiiIiiiiIIII.iiiiiiiiIIiii((int)IiiiiiiiIIIII4.getGrade())));
        this.iiiiIiiiIiiII[1].setText(IiiiiiiiIIIII4.getFaithful().toString());
        this.iiiiIiiiIiiII[2].setText(IiiiiiiiIIIII4.getFriendliness().toString());
        this.ALLATORIxDEMO((int)IiiiiiiiIIIII4.getGrade(), IiiiiiiiIIIII4.getSummoningname());
        this.iiIIiiiiIiIIi.baseView.ALLATORIxDEMO(IiiiiiiiIIIII5, IiiiiiiiIIIII4);
        BigDecimal IiiiiiiiIIIII6 = IiiiiiiiIIIII3.getLoginResult().getSummoning_id();
        if (IiiiiiiiIIIII6 != null && IiiiiiiiIIIII6.compareTo(IiiiiiiiIIIII4.getSid()) == 0) {
            this.iiiIiiiiiiiIi[9].setText("\u4f11\u606f");
        } else {
            this.iiiIiiiiiiiIi[9].setText("\u53c2\u6218");
        }
        int IiiiiiiiIIIII7 = 2;
        while (IiiiiiiiIIIII7 < 5) {
            this.iiiIiiiiiiiIi[IiiiiiiiIIIII7++].setVisible(false);
        }
        if (IiiiiiiiIIIII4.getInnerGoods() != null && !IiiiiiiiIIIII4.getInnerGoods().equals("")) {
            String[] IiiiiiiiIIIII8 = IiiiiiiiIIIII4.getInnerGoods().split("\\|");
            int IiiiiiiiIIIII9 = 0;
            while (IiiiiiiiIIIII9 < IiiiiiiiIIIII8.length && IiiiiiiiIIIII9 < 3) {
                int n = IiiiiiiiIIIII9 + 2;
                ++IiiiiiiiIIIII9;
                this.iiiIiiiiiiiIi[n].setVisible(true);
            }
        }
        this.iiIiiiiiiiIii = IiiiiiiiIIIII4.getPart(this.iiIIiiiiIiIIi);
        this.iiIiIiiiiIIIi = (IiiiiiiiIIIII4.getPetlock() >> 0 & 1) == 1;
        IIiiIiiiIiiiI IiiiiiiiIIIII10 = (IIiiIiiiIiiiI)this.iiIIiiiiIiIIi.getFormManagement().iIiIiiiiIIiii(18);
        if (IiiiiiiiIIIII10 != null) {
            IiiiiiiiIIIII10.ALLATORIxDEMO(IiiiiiiiIIIII4);
        }
        if ((IiiiiiiiIIIII2 = (iiIiIiiiiiIIi)this.iiIIiiiiIiIIi.getFormManagement().iIiIiiiiIIiii(67)) != null) {
            IiiiiiiiIIIII2.ALLATORIxDEMO(IiiiiiiiIIIII4);
        }
        if ((IiiiiiiiIIIII = (IiiIiiiiIIIii)this.iiIIiiiiIiIIi.getFormManagement().iIiIiiiiIIiii(47)) == null) return;
        IiiiiiiiIIIII.ALLATORIxDEMO(IiiiiiiiIIIII4);
    }

    /*
     * Enabled unnecessary exception pruning
     */
    public void ALLATORIxDEMO(int type, int point) {
        try {
            if (type == 0) {
                type = Integer.parseInt(this.iiiiIiiiIiiII[9].getText());
                this.iiiiIiiiIiiII[9].setText(String.valueOf(type + point));
            } else if (type == 1) {
                type = Integer.parseInt(this.iiiiIiiiIiiII[10].getText());
                this.iiiiIiiiIiiII[10].setText(String.valueOf(type + point));
            } else if (type == 2) {
                type = Integer.parseInt(this.iiiiIiiiIiiII[11].getText());
                this.iiiiIiiiIiiII[11].setText(String.valueOf(type + point));
            } else if (type == 3) {
                type = Integer.parseInt(this.iiiiIiiiIiiII[12].getText());
                this.iiiiIiiiIiiII[12].setText(String.valueOf(type + point));
            } else if (type == 4) {
                type = Integer.parseInt(this.iiiiIiiiIiiII[14].getText());
                this.iiiiIiiiIiiII[14].setText(String.valueOf(type + point));
            }
            type = Integer.parseInt(this.iiiiIiiiIiiII[8].getText());
            this.iiiiIiiiIiiII[8].setText(String.valueOf(type - point));
            return;
        }
        catch (Exception exception) {
            return;
        }
    }
}
