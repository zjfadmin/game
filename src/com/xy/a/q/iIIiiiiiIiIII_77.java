/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.iIIiiiiiIIIIi
 *  com.xy.bean.SummonPetBean
 *  com.xy.entity.RoleSummoning
 *  com.xy.formula.GoodType
 *  com.xy.game.RoleData
 *  com.xy.game.RolePet
 *  com.xy.i.IIiiIiiiIiiiI
 *  com.xy.i.IiIiIiiiiIIiI
 *  com.xy.q.IIIIIiiiIIIiI
 *  com.xy.q.IIIiiiiiIiIiI
 *  com.xy.q.IiIIIiiiiIIiI
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.q.iIIiIiiiIiiIi
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.q.iiiiiiiiiiIiI
 *  com.xy.readbean.Goodstable
 *  com.xy.richtext.RichLabel
 *  com.xy.socket.Agreement
 *  com.xy.text.GameView
 *  com.xy.v.IIiiIiiiiIIiI
 *  com.xy.v.iIiIIiiiIiiiI
 *  com.xy.v.iiIiIiiiiIiii
 *  com.xy.v.iiIiiiiiIIiii
 *  com.xy.w.IIIIIiiiIiiII
 *  com.xy.w.IIIiiiiiIiIiI
 *  com.xy.w.IiiiIiiiiIiIi
 */
package com.xy.a.q;

import com.xy.a.iIIiiiiiIIIIi;
import com.xy.bean.SummonPetBean;
import com.xy.entity.RoleSummoning;
import com.xy.formula.GoodType;
import com.xy.game.RoleData;
import com.xy.game.RolePet;
import com.xy.i.IIiiIiiiIiiiI;
import com.xy.i.IiIiIiiiiIIiI;
import com.xy.q.IIIIIiiiIIIiI;
import com.xy.q.IiIIIiiiiIIiI;
import com.xy.q.IiiiIiiiiIiIi;
import com.xy.q.iIIiIiiiIiiIi;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.q.iiiiiiiiiiIiI;
import com.xy.readbean.Goodstable;
import com.xy.richtext.RichLabel;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import com.xy.v.IIiiIiiiiIIiI;
import com.xy.v.iIiIIiiiIiiiI;
import com.xy.v.iiIiIiiiiIiii;
import com.xy.v.iiIiiiiiIIiii;
import com.xy.w.IIIIIiiiIiiII;
import com.xy.w.IIIiiiiiIiIiI;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.math.BigDecimal;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JScrollPane;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class iIIiiiiiIiIII
extends IiiiIiiiiIiIi {
    private iiiiiiiiiiIiI iiIIIiiiiiiiI;
    private JScrollPane IiIiiiiiIIIII;
    private IIiiIiiiIiiiI[] iiIiIiiiiIIIi;
    private JScrollPane iiiiIiiiIiiII;
    private IIIIIiiiIIIiI iiiIiiiiiiiIi;
    private IiIiIiiiiIIiI[] iIiiIiiiiiiII;
    private RichLabel IIiiIiiiIIiIi;
    private IIIiiiiiIiIiI[] iIiIiiiiIiIii;
    private com.xy.q.IIIiiiiiIiIiI IiIIIiiiiIiiI;
    private JLabel[] iiIiiiiiiiIii;
    private com.xy.w.IiiiIiiiiIiIi IiiiiiiiIIIII;
    private iIIiIiiiIiiIi ALLATORIxDEMO;

    public void ALLATORIxDEMO(RoleSummoning pet) {
        long IiiiiiiiIIIII;
        String IiiiiiiiIIIII2;
        int IiiiiiiiIIIII3;
        int IiiiiiiiIIIII4;
        int IiiiiiiiIIIII5;
        if (pet == null) {
            this.IIiiIiiiIIiIi.isTextSize("", 130);
            return;
        }
        Goodstable IiiiiiiiIIIII6 = (Goodstable)this.IiIIIiiiiIiiI.ALLATORIxDEMO();
        if (IiiiiiiiIIIII6 != null && !GoodType.IiiIiiiiiiIiI((long)IiiiiiiiIIIII6.getType())) {
            IiiiiiiiIIIII6 = null;
        }
        ArrayList<iiIiIiiiiIiii> IiiiiiiiIIIII7 = null;
        StringBuffer IiiiiiiiIIIII8 = new StringBuffer();
        if (!IIiiIiiiiIIiI.iIiIiiiiIIiIi((String)pet.getLyk())) {
            IiiiiiiiIIIII5 = 0;
            IiiiiiiiIIIII4 = 0;
            IiiiiiiiIIIII3 = 0;
            while (IiiiiiiiIIIII4 < pet.getLyk().length()) {
                block24: {
                    IiiiiiiiIIIII4 = pet.getLyk().indexOf("|", IiiiiiiiIIIII5 + 1);
                    if (IiiiiiiiIIIII4 == -1) {
                        IiiiiiiiIIIII4 = pet.getLyk().length();
                    }
                    if ((IiiiiiiiIIIII3 = pet.getLyk().indexOf("=", IiiiiiiiIIIII5 + 1)) == -1 || IiiiiiiiIIIII3 > IiiiiiiiIIIII4) {
                        IiiiiiiiIIIII3 = IiiiiiiiIIIII4;
                    }
                    if (!(IiiiiiiiIIIII2 = pet.getLyk().substring(IiiiiiiiIIIII5, IiiiiiiiIIIII3)).equals("\u7269\u54c1\u4eb2\u5bc6")) {
                        IiiiiiiiIIIII = (long)(Double.parseDouble(pet.getLyk().substring(IiiiiiiiIIIII3 + 1, IiiiiiiiIIIII4)) * 100.0);
                        if (IiiiiiiiIIIII7 == null) {
                            IiiiiiiiIIIII7 = new ArrayList<iiIiIiiiiIiii>();
                        }
                        for (iiIiIiiiiIiii IiiiiiiiIIIII9 : IiiiiiiiIIIII7) {
                            if (!IiiiiiiiIIIII9.IiiiiiiiIIIII.equals(IiiiiiiiIIIII2)) continue;
                            IiiiiiiiIIIII9.ALLATORIxDEMO += IiiiiiiiIIIII;
                            break block24;
                        }
                        IiiiiiiiIIIII7.add(new iiIiIiiiiIiii(IiiiiiiiIIIII2, IiiiiiiiIIIII));
                    }
                }
                IiiiiiiiIIIII5 = IiiiiiiiIIIII4 + 1;
            }
        }
        if (!IIiiIiiiiIIiI.iIiIiiiiIIiIi((String)pet.getResistance())) {
            IiiiiiiiIIIII5 = 0;
            IiiiiiiiIIIII4 = 0;
            IiiiiiiiIIIII3 = 0;
            while (IiiiiiiiIIIII4 < pet.getResistance().length()) {
                block25: {
                    IiiiiiiiIIIII4 = pet.getResistance().indexOf("|", IiiiiiiiIIIII5 + 1);
                    if (IiiiiiiiIIIII4 == -1) {
                        IiiiiiiiIIIII4 = pet.getResistance().length();
                    }
                    if ((IiiiiiiiIIIII3 = pet.getResistance().indexOf("=", IiiiiiiiIIIII5 + 1)) == -1 || IiiiiiiiIIIII3 > IiiiiiiiIIIII4) {
                        IiiiiiiiIIIII3 = IiiiiiiiIIIII4;
                    }
                    if (!(IiiiiiiiIIIII2 = pet.getResistance().substring(IiiiiiiiIIIII5, IiiiiiiiIIIII3)).equals("\u7269\u54c1\u4eb2\u5bc6")) {
                        IiiiiiiiIIIII = (long)(Double.parseDouble(pet.getResistance().substring(IiiiiiiiIIIII3 + 1, IiiiiiiiIIIII4)) * 100.0);
                        if (IiiiiiiiIIIII7 == null) {
                            IiiiiiiiIIIII7 = new ArrayList();
                        }
                        for (iiIiIiiiiIiii IiiiiiiiIIIII9 : IiiiiiiiIIIII7) {
                            if (!IiiiiiiiIIIII9.IiiiiiiiIIIII.equals(IiiiiiiiIIIII2)) continue;
                            IiiiiiiiIIIII9.ALLATORIxDEMO += IiiiiiiiIIIII;
                            break block25;
                        }
                        IiiiiiiiIIIII7.add(new iiIiIiiiiIiii(IiiiiiiiIIIII2, IiiiiiiiIIIII));
                    }
                }
                IiiiiiiiIIIII5 = IiiiiiiiIIIII4 + 1;
            }
        }
        if (IiiiiiiiIIIII6 != null) {
            IiiiiiiiIIIII5 = 0;
            IiiiiiiiIIIII4 = 0;
            IiiiiiiiIIIII3 = 0;
            while (IiiiiiiiIIIII4 < IiiiiiiiIIIII6.getValue().length()) {
                IiiiiiiiIIIII4 = IiiiiiiiIIIII6.getValue().indexOf("|", IiiiiiiiIIIII5 + 1);
                if (IiiiiiiiIIIII4 == -1) {
                    IiiiiiiiIIIII4 = IiiiiiiiIIIII6.getValue().length();
                }
                if ((IiiiiiiiIIIII3 = IiiiiiiiIIIII6.getValue().indexOf("=", IiiiiiiiIIIII5 + 1)) == -1 || IiiiiiiiIIIII3 > IiiiiiiiIIIII4) {
                    IiiiiiiiIIIII3 = IiiiiiiiIIIII4;
                }
                if (!(IiiiiiiiIIIII2 = IiiiiiiiIIIII6.getValue().substring(IiiiiiiiIIIII5, IiiiiiiiIIIII3)).equals("\u7b49\u7ea7")) {
                    iiIiIiiiiIiii IiiiiiiiIIIII10 = null;
                    int IiiiiiiiIIIII11 = 0;
                    int IiiiiiiiIIIII12 = IiiiiiiiIIIII7 != null ? IiiiiiiiIIIII7.size() : 0;
                    while (IiiiiiiiIIIII11 < IiiiiiiiIIIII12) {
                        if (!IiiiiiiiIIIII2.equals(((iiIiIiiiiIiii)IiiiiiiiIIIII7.get((int)IiiiiiiiIIIII11)).IiiiiiiiIIIII)) {
                            ++IiiiiiiiIIIII11;
                            continue;
                        }
                        IiiiiiiiIIIII10 = (iiIiIiiiiIiii)IiiiiiiiIIIII7.remove(IiiiiiiiIIIII11);
                        break;
                    }
                    IiiiiiiiIIIII8.append(IiiiiiiiIIIII8.length() == 0 ? "#W" : "#r");
                    IiiiiiiiIIIII8.append(IiiiiiiiIIIII2);
                    IiiiiiiiIIIII8.append(": ");
                    IiiiiiiiIIIII8.append(IiiiiiiiIIIII10 != null ? IIiiIiiiiIIiI.ALLATORIxDEMO((double)((double)IiiiiiiiIIIII10.ALLATORIxDEMO / 100.0), (int)1) : Integer.valueOf(0));
                    IiiiiiiiIIIII8.append(" #G+ ");
                    IiiiiiiiIIIII8.append(IIiiIiiiiIIiI.ALLATORIxDEMO((double)Double.parseDouble(IiiiiiiiIIIII6.getValue().substring(IiiiiiiiIIIII3 + 1, IiiiiiiiIIIII4)), (int)1));
                    IiiiiiiiIIIII8.append("#W");
                }
                IiiiiiiiIIIII5 = IiiiiiiiIIIII4 + 1;
            }
        }
        IiiiiiiiIIIII5 = 0;
        IiiiiiiiIIIII4 = IiiiiiiiIIIII7 != null ? IiiiiiiiIIIII7.size() : 0;
        while (IiiiiiiiIIIII5 < IiiiiiiiIIIII4) {
            iiIiIiiiiIiii IiiiiiiiIIIII13 = (iiIiIiiiiIiii)IiiiiiiiIIIII7.get(IiiiiiiiIIIII5);
            IiiiiiiiIIIII8.append(IiiiiiiiIIIII8.length() == 0 ? "#W" : "#r");
            IiiiiiiiIIIII8.append(IiiiiiiiIIIII13.IiiiiiiiIIIII);
            IiiiiiiiIIIII8.append(": ");
            ++IiiiiiiiIIIII5;
            IiiiiiiiIIIII8.append(IIiiIiiiiIIiI.ALLATORIxDEMO((double)((double)IiiiiiiiIIIII13.ALLATORIxDEMO / 100.0), (int)1));
        }
        this.IIiiIiiiIIiIi.isTextSize(IiiiiiiiIIIII8.toString(), 130);
    }

    public void iIiIiiiiIIiii() {
        if (this.ALLATORIxDEMO() == null) {
            return;
        }
        this.iIiIiiiiIIiIi();
        this.IiIIIiiiiIiiI.ALLATORIxDEMO(0, null);
        this.iiiIiiiiiiiIi.ALLATORIxDEMO();
        super.iIiIiiiiIIiii();
    }

    public iIIiiiiiIiIII(GameView gameView) {
        super(17, 2, IiiiIiiiiIiIi.iIIIIiiiiiIIi, gameView);
        this.ALLATORIxDEMO(-1, 0, 560, 475, IiiiIiiiiIiIi.iiIIIiiiiiiiI);
        this.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/1.png", (int)68, (int)68, (int)68, (int)68, (boolean)false), " \u70bc \u5996 ");
        this.iiiIiiiiiiiIi = new IIIIIiiiIIIiI((IiiiIiiiiIiIi)this);
        this.iiiIiiiiiiiIi.setBounds(0, 0, 140, 20);
        this.iiiiIiiiIiiII = IiIIIiiiiIIiI.ALLATORIxDEMO((int)42, (int)270, (int)170, (int)185, (Component)this.iiiIiiiiiiiIi, (int)20);
        this.add(this.iiiiIiiiIiiII);
        this.IIiiIiiiIIiIi = new RichLabel("", iiIIiiiiIiiII.iIIiiiiiiIIII, 130);
        this.IiIiiiiiIIIII = IiIIIiiiiIIiI.ALLATORIxDEMO((int)376, (int)60, (int)145, (int)178, (Component)this.IIiiIiiiIIiIi, (int)20);
        this.add(this.IiIiiiiiIIIII);
        this.iIiiIiiiiiiII = new IiIiIiiiiIIiI[5];
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iIiiIiiiiiiII.length) {
            this.iIiiIiiiiiiII[IiiiiiiiIIIII] = new IiIiIiiiiIIiI(IiiiiiiiIIIII == 0 ? "sc/e/38.png" : "sc/e/7.png", 1, IiiiiiiiIIIII == 0 ? 0 : 51, IiiiiiiiIIIII == 0 ? iiIIiiiiIiiII.IIiiiiiiiIIIi : iiIIiiiiIiiII.iiiiIiiiIiiII, iiIIiiiiIiiII.IIiiiiiiIiiII, IiiiiiiiIIIII == 0 ? "\u70bc \u5996" : (IiiiiiiiIIIII == 1 ? "\u70bc\u5996" : ""), (IiiiIiiiiIiIi)this);
            if (IiiiiiiiIIIII == 0) {
                this.iIiiIiiiiiiII[IiiiiiiiIIIII].setOffsetTexts(iiIIiiiiIiiII.IIiiiiiiiIIII);
                this.iIiiIiiiiiiII[IiiiiiiiIIIII].setBounds(60, 16, 95, 33);
                this.iIiiIiiiiiiII[IiiiiiiiIIIII].setKeep(true);
            } else if (IiiiiiiiIIIII == 1) {
                this.iIiiIiiiiiiII[IiiiiiiiIIIII].setBounds(258, 168, 59, 25);
            }
            this.add((Component)this.iIiiIiiiiiiII[IiiiiiiiIIIII++]);
        }
        this.iiIiiiiiiiIii = new JLabel[3];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iiIiiiiiiiIii.length) {
            if (IiiiiiiiIIIII != 0 && IiiiiiiiIIIII != 1) {
                this.iiIiiiiiiiIii[IiiiiiiiIIIII] = IiIIIiiiiIIiI.ALLATORIxDEMO((int)256, (int)(101 + IiiiiiiiIIIII * 17), (int)59, (int)16, (int)0, (Color)iiIIiiiiIiiII.ALLATORIxDEMO((String)"#c999999"), (Font)iiIIiiiiIiiII.iiIiiiiiiIIiI);
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].setText(IiiiiiiiIIIII == 0 ? "\u70bc\u5996" : (IiiiiiiiIIIII == 1 ? "\u7269\u54c1" : (IiiiiiiiIIIII == 2 ? "\u70bc\u5996\u6b21\u6570\uff1a" : "")));
                if (IiiiiiiiIIIII == 2) {
                    this.iiIiiiiiiiIii[IiiiiiiiIIIII].setFont(iiIIiiiiIiiII.iiiiIiiiIiiII);
                    this.iiIiiiiiiiIii[IiiiiiiiIIIII].setForeground(iiIIiiiiIiiII.ALLATORIxDEMO((String)"#c000000"));
                    this.iiIiiiiiiiIii[IiiiiiiiIIIII].setBounds(218, 203, 86, 19);
                }
                this.add(this.iiIiiiiiiiIii[IiiiiiiiIIIII]);
            }
            ++IiiiiiiiIIIII;
        }
        this.ALLATORIxDEMO = IiIIIiiiiIIiI.ALLATORIxDEMO((int)300, (int)203, (int)44, (int)19, (int)0, (Color)Color.white, (Font)iiIIiiiiIiiII.iIiIIiiiiIIiI);
        this.ALLATORIxDEMO.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/17.png", (int)6, (int)6, (int)6, (int)6, (boolean)false));
        this.add((Component)this.ALLATORIxDEMO);
        this.IiIIIiiiiIiiI = new com.xy.q.IIIiiiiiIiIiI((IiiiIiiiiIiIi)this);
        this.IiIIIiiiiIiiI.setBounds(260, 93, 50, 50);
        this.add((Component)this.IiIIIiiiiIiiI);
        this.iIiIiiiiIiIii = new IIIiiiiiIiIiI[9];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iIiIiiiiIiIii.length) {
            this.iIiIiiiiIiIii[IiiiiiiiIIIII] = new IIIiiiiiIiIiI();
            if (IiiiiiiiIIIII == 0) {
                this.iIiIiiiiIiIii[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/24.png", (int)2, (int)2, (int)2, (int)2, (boolean)false));
                this.iIiIiiiiIiIii[IiiiiiiiIIIII].setBounds(46, 59, 150, 180);
            } else if (IiiiiiiiIIIII == 1) {
                this.iIiIiiiiIiIii[IiiiiiiiIIIII].iIiIiiiiIIiii("sc/d/4.png");
                this.iIiIiiiiIiIii[IiiiiiiiIIIII].setBounds(256, 89, 59, 57);
            } else if (IiiiiiiiIIIII == 2) {
                this.iIiIiiiiIiIii[IiiiiiiiIIIII].iIiIiiiiIIiii("sc/d/30.png");
                this.iIiIiiiiIiIii[IiiiiiiiIIIII].setBounds(257, 146, 58, 1);
            } else if (IiiiiiiiIIIII == 3) {
                this.iIiIiiiiIiIii[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/49.png", (int)6, (int)6, (int)6, (int)6, (boolean)false));
                this.iIiIiiiiIiIii[IiiiiiiiIIIII].setBounds(372, 59, 150, 180);
            } else if (IiiiiiiiIIIII == 4) {
                this.iIiIiiiiIiIii[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/24.png", (int)2, (int)2, (int)2, (int)2, (boolean)false));
                this.iIiIiiiiIiIii[IiiiiiiiIIIII].setBounds(372, 59, 150, 180);
            } else if (IiiiiiiiIIIII == 5) {
                this.iIiIiiiiIiIii[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/25.png", (int)2, (int)2, (int)2, (int)2, (boolean)false));
                this.iIiIiiiiIiIii[IiiiiiiiIIIII].setBounds(42, 249, 170, 21);
            } else if (IiiiiiiiIIIII == 6) {
                this.iIiIiiiiIiIii[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/24.png", (int)2, (int)2, (int)2, (int)2, (boolean)false));
                this.iIiIiiiiIiIii[IiiiiiiiIIIII].setBounds(42, 249, 170, 206);
            } else if (IiiiiiiiIIIII == 7) {
                this.iIiIiiiiIiIii[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/19.png", (int)5, (int)5, (int)5, (int)5, (boolean)false));
                this.iIiIiiiiIiIii[IiiiiiiiIIIII].setBounds(217, 249, 309, 207);
            } else if (IiiiiiiiIIIII == 8) {
                this.iIiIiiiiIiIii[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/35.png", (int)80, (int)10, (int)80, (int)10, (boolean)false));
                this.iIiIiiiiIiIii[IiiiiiiiIIIII].setBounds(31, 30, 515, 20);
            }
            this.add((Component)this.iIiIiiiiIiIii[IiiiiiiiIIIII++]);
        }
        this.iiIIIiiiiiiiI = new iiiiiiiiiiIiI((IiiiIiiiiIiIi)this, 6, 4, 51, 51, 0, 0, 218, 251);
        this.iiIIIiiiiiiiI.ALLATORIxDEMO(IIIIIiiiIiiII.iiiIiiiiiiIIi((String)"sc/d/18.png"));
        this.iiIIIiiiiiiiI.iIiIiiiiIIiii(true);
        this.add((Component)this.iiIIIiiiiiiiI);
    }

    public com.xy.q.IIIiiiiiIiIiI ALLATORIxDEMO() {
        return this.IiIIIiiiiIiiI;
    }

    public void iiiiiiiiIIiii() {
        this.ALLATORIxDEMO.setText(null);
        this.IiiiiiiiIIIII = null;
        this.ALLATORIxDEMO((RoleSummoning)null);
    }

    public void IiiIiiiiiiIiI() {
        this.ALLATORIxDEMO(this.ALLATORIxDEMO().getRolePet(this.iiiIiiiiiiiIi.ALLATORIxDEMO()));
    }

    public void iIiIiiiiIIiIi() {
        int IiiiiiiiIIIII = 1 + this.ALLATORIxDEMO().goodPacks.length / 24;
        if (this.iiIiIiiiiIIIi != null) {
            if (this.iiIiIiiiiIIIi.length == IiiiiiiiIIIII) return;
        }
        this.iiIiIiiiiIIIi = this.ALLATORIxDEMO(this.iiIiIiiiiIIIi, IiiiiiiiIIIII, this.iiIIIiiiiiiiI.ALLATORIxDEMO());
        int IiiiiiiiIIIII2 = 526;
        int IiiiiiiiIIIII3 = 249;
        int IiiiiiiiIIIII4 = 0;
        while (IiiiiiiiIIIII4 < this.iiIiIiiiiIIIi.length) {
            IIiiIiiiIiiiI iIiiIiiiIiiiI = this.iiIiIiiiiIIIi[IiiiiiiiIIIII4];
            int n = IiiiiiiiIIIII3 + IiiiiiiiIIIII4 * 35;
            ++IiiiiiiiIIIII4;
            iIiiIiiiIiiiI.setBounds(IiiiiiiiIIIII2, n, 36, 33);
        }
        this.iiIIIiiiiiiiI.ALLATORIxDEMO(this.iiIiIiiiiIIIi, 0);
    }

    protected void paintChildren(Graphics g) {
        super.paintChildren(g);
        if (this.IiiiiiiiIIIII == null) return;
        this.IiiiiiiiIIIII.ALLATORIxDEMO(g, 122, 215, 0, iIiIIiiiIiiiI.ALLATORIxDEMO());
    }

    public void iiiIiiiiiiIIi(boolean confirm) {
        Goodstable IiiiiiiiIIIII;
        RoleSummoning IiiiiiiiIIIII2;
        RoleData IiiiiiiiIIIII3 = this.ALLATORIxDEMO();
        RolePet IiiiiiiiIIIII4 = IiiiiiiiIIIII3.getRolePet(this.iiiIiiiiiiiIi.ALLATORIxDEMO());
        RoleSummoning roleSummoning = IiiiiiiiIIIII2 = IiiiiiiiIIIII4 != null ? IiiiiiiiIIIII4.getPet() : null;
        if (IiiiiiiiIIIII2 == null) {
            this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u8bf7\u9009\u62e9\u4f60\u8981\u70bc\u5316\u7684\u53ec\u5524\u517d\uff01");
            return;
        }
        Goodstable goodstable = IiiiiiiiIIIII = this.IiIIIiiiiIiiI.ALLATORIxDEMO() == 1 ? IiiiiiiiIIIII3.getGood(new BigDecimal(this.IiIIIiiiiIiiI.ALLATORIxDEMO())) : null;
        if (IiiiiiiiIIIII == null) {
            this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u4f60\u8fd8\u6ca1\u9009\u4e2d\u7269\u54c1");
            return;
        }
        if (IiiiiiiiIIIII.getGoodlock() == 1) {
            this.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u8be5\u7269\u54c1\u5df2\u88ab\u52a0\u9501");
            return;
        }
        SummonPetBean IiiiiiiiIIIII5 = null;
        if (IiiiiiiiIIIII.getType() == 701L) {
            if (IiiiiiiiIIIII2.getSsn() != null && !IiiiiiiiIIIII2.getSsn().equals("0")) {
                this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u8fd9\u53ea\u53ec\u5524\u517d\u65e0\u6cd5\u4f7f\u7528\u91d1\u67f3\u9732");
                return;
            }
            if (IiiiiiiiIIIII2.getTurnRount() != 0) {
                this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u672a\u8f6c\u7684\u5b9d\u5b9d\u624d\u53ef\u4ee5\u4f7f\u7528\u91d1\u67f3\u9732");
                return;
            }
            IiiiiiiiIIIII5 = new SummonPetBean(1);
        } else if (IiiiiiiiIIIII.getType() == 713L) {
            IiiiiiiiIIIII5 = new SummonPetBean(101);
        } else if (IiiiiiiiIIIII.getType() == 714L) {
            IiiiiiiiIIIII5 = new SummonPetBean(102);
        } else if (GoodType.IiiIiiiiiiIiI((long)IiiiiiiiIIIII.getType())) {
            int IiiiiiiiIIIII6;
            int n = this.ALLATORIxDEMO().ALLATORIxDEMO(2, 3) ? 9 : (IiiiiiiiIIIII6 = this.ALLATORIxDEMO().ALLATORIxDEMO(2, 12) ? 11 : 12);
            if (IiiiiiiiIIIII2.getAlchemynum() >= IiiiiiiiIIIII6) {
                this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u53ec\u5524\u517d" + IiiiiiiiIIIII2.getSummoningname() + "\u7684\u70bc\u5996\u6b21\u6570\u5df2\u7ecf\u8d85\u8fc7" + IiiiiiiiIIIII6 + "\u6b21\uff01");
                return;
            }
            if (!confirm && this.ALLATORIxDEMO().ALLATORIxDEMO(2, 12)) {
                ((iIIiiiiiIIIIi)this.ALLATORIxDEMO().iiiIiiiiiiIIi(27)).ALLATORIxDEMO(IiiiiiiiIIIII2, IiiiiiiiIIIII);
                return;
            }
            IiiiiiiiIIIII5 = new SummonPetBean(103);
        }
        if (IiiiiiiiIIIII5 == null) {
            return;
        }
        IiiiiiiiIIIII5.setPetid(IiiiiiiiIIIII2.getSid());
        IiiiiiiiIIIII5.setGoodid(IiiiiiiiIIIII.getRgid());
        String IiiiiiiiIIIII7 = Agreement.getSendTextAES((String)"summonpet", (String)iiIiiiiiIIiii.ALLATORIxDEMO().toJson(IiiiiiiiIIIII5));
        this.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII7);
        this.IiIIIiiiiIiiI.ALLATORIxDEMO(0, null);
    }

    public void iiiIiiiiiiIIi() {
        RolePet IiiiiiiiIIIII = this.ALLATORIxDEMO().getRolePet(this.iiiIiiiiiiiIi.ALLATORIxDEMO());
        this.ALLATORIxDEMO(IiiiiiiiIIIII != null ? IiiiiiiiIIIII.getPet() : null);
    }

    public boolean ALLATORIxDEMO() {
        this.iiiiiiiiIIiii();
        return super.ALLATORIxDEMO();
    }

    public void ALLATORIxDEMO(RolePet rolePet) {
        if (rolePet == null) {
            this.iiiiiiiiIIiii();
            return;
        }
        this.ALLATORIxDEMO.setText(String.valueOf(rolePet.getPet().getAlchemynum()));
        this.IiiiiiiiIIIII = rolePet.getPet().getPart(this.iiIIiiiiIiIIi);
        this.ALLATORIxDEMO(rolePet.getPet());
    }
}
