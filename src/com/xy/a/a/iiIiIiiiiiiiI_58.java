/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.a.IiiIiiiiIIIiI
 *  com.xy.a.a.iIIIiiiiIiIII
 *  com.xy.entity.Mount
 *  com.xy.formula.BaseMountSkill
 *  com.xy.formula.PropertyUtil
 *  com.xy.i.IiIiIiiiiIIiI
 *  com.xy.q.IIIiIiiiiIiII
 *  com.xy.q.IiIIIiiiiIIiI
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.q.iIIiIiiiIiiIi
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.readbean.Goodstable
 *  com.xy.richtext.RichLabel
 *  com.xy.socket.Agreement
 *  com.xy.text.GameView
 *  com.xy.v.IIiiIiiiiIIiI
 *  com.xy.w.IIIIIiiiIiiII
 *  com.xy.w.IIIiiiiiIiIiI
 */
package com.xy.a.a;

import com.xy.a.a.IiiIiiiiIIIiI;
import com.xy.a.a.iIIIiiiiIiIII;
import com.xy.entity.Mount;
import com.xy.formula.BaseMountSkill;
import com.xy.formula.PropertyUtil;
import com.xy.i.IiIiIiiiiIIiI;
import com.xy.q.IIIiIiiiiIiII;
import com.xy.q.IiIIIiiiiIIiI;
import com.xy.q.IiiiIiiiiIiIi;
import com.xy.q.iIIiIiiiIiiIi;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.readbean.Goodstable;
import com.xy.richtext.RichLabel;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import com.xy.v.IIiiIiiiiIIiI;
import com.xy.w.IIIIIiiiIiiII;
import com.xy.w.IIIiiiiiIiIiI;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.math.BigDecimal;
import javax.swing.DefaultListModel;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.event.ListSelectionListener;

public class iiIiIiiiiiiiI
extends IiiiIiiiiIiIi {
    private RichLabel[] IiiiIiiiIiIII;
    private JScrollPane IIiiiiiiiIIIi;
    private int IIIiiiiiIIiII;
    private int iiIiiiiiiIIiI;
    private BigDecimal iIiiIiiiIiIIi;
    private DefaultListModel<String> iiiiIiiiIIiii;
    private IiIiIiiiiIIiI[] iIIiIiiiiiiIi;
    private JLabel[] IIIIiiiiiiiII;
    private int iiIIIiiiiiiiI;
    private IIIiiiiiIiIiI[] IiIiiiiiIIIII;
    private IIIiIiiiiIiII iiIiIiiiiIIIi;
    private JScrollPane iiiiIiiiIiiII;
    private int iiiIiiiiiiiIi;
    private DefaultListModel<String> iIiiIiiiiiiII;
    private int IIiiIiiiIIiIi;
    private JList<String> iIiIiiiiIiIii;
    private iIIiIiiiIiiIi[] IiIIIiiiiIiiI;
    private JList<String> iiIiiiiiiiIii;
    private int IiiiiiiiIIIII;
    private int ALLATORIxDEMO;

    static /* synthetic */ JList iIiIiiiiIIiii(iiIiIiiiiiiiI arg0) {
        return arg0.iIiIiiiiIiIii;
    }

    /*
     * WARNING - void declaration
     */
    public void iIiIiiiiIIiii(Mount mount) {
        void mount2;
        this.iIiiIiiiIiIIi = mount.getMid();
        this.iiIiiiiiiIIiI = mount.getMountid();
        this.IiIIIiiiiIiiI[0].setText(mount.getMountname());
        this.ALLATORIxDEMO(mount);
        this.iiiIiiiiiiiIi = 4;
        this.IiIIIiiiiIiiI[1].setText(String.valueOf(this.iiiIiiiiiiiIi));
        this.IiIIIiiiiIiiI[2].setText(String.valueOf(this.iiiIiiiiiiiIi == 1 ? 2 : (this.iiiIiiiiiiiIi == 2 ? 6 : (this.iiiIiiiiiiiIi == 3 ? 12 : 20))));
        this.iiIiIiiiiIIIi.ALLATORIxDEMO().removeAllElements();
        if (mount2.getMountid() == 1) {
            this.iiIiIiiiiIIIi.ALLATORIxDEMO("\u52a0\u6839\u9aa8\uff0c\u51cf\u529b\u91cf");
            this.iiIiIiiiiIIIi.ALLATORIxDEMO("\u52a0\u7075\u6027\uff0c\u51cf\u529b\u91cf");
        } else if (mount2.getMountid() == 2) {
            this.iiIiIiiiiIIIi.ALLATORIxDEMO("\u52a0\u529b\u91cf\uff0c\u51cf\u6839\u9aa8");
        } else if (mount2.getMountid() == 3) {
            this.iiIiIiiiiIIIi.ALLATORIxDEMO("\u52a0\u6839\u9aa8\uff0c\u51cf\u7075\u6027");
            this.iiIiIiiiiIIIi.ALLATORIxDEMO("\u52a0\u529b\u91cf\uff0c\u51cf\u7075\u6027");
        } else if (mount2.getMountid() == 4) {
            this.iiIiIiiiiIIIi.ALLATORIxDEMO("\u52a0\u6839\u9aa8\uff0c\u51cf\u529b\u91cf");
        } else if (mount2.getMountid() == 5) {
            this.iiIiIiiiiIIIi.ALLATORIxDEMO("\u52a0\u529b\u91cf\uff0c\u51cf\u6839\u9aa8");
            this.iiIiIiiiiIIIi.ALLATORIxDEMO("\u52a0\u7075\u6027\uff0c\u51cf\u6839\u9aa8");
        }
        this.ALLATORIxDEMO().iIiIiiiiIIiIi(this.iIiIiiiiIIiii());
    }

    public void ALLATORIxDEMO(int type, String skillName) {
        BaseMountSkill IiiiiiiiIIIII;
        RichLabel IiiiiiiiIIIII2;
        RichLabel richLabel = IiiiiiiiIIIII2 = type == 0 ? this.IiiiIiiiIiIII[6] : this.IiiiIiiiIiIII[7];
        if (IIiiIiiiiIIiI.iIiIiiiiIIiIi((String)skillName)) {
            skillName = this.iiiiIiiiIIiii.getElementAt(0);
        }
        if ((IiiiiiiiIIIII = PropertyUtil.getBaseMountSkill((String)skillName)) == null) {
            IiiiiiiiIIIII2.setTextSize(null, 205);
            return;
        }
        int IiiiiiiiIIIII3 = this.iiIIIiiiiiiiI;
        int IiiiiiiiIIIII4 = this.ALLATORIxDEMO;
        int IiiiiiiiIIIII5 = this.IIiiIiiiIIiIi;
        iiIiIiiiiiiiI iiIiIiiiiiiiI2 = this;
        int IiiiiiiiIIIII6 = type == 0 ? iiIiIiiiiiiiI2.IIIiiiiiIIiII : iiIiIiiiiiiiI2.IiiiiiiiIIIII;
        int IiiiiiiiIIIII7 = IiiiiiiiIIIII6 >> 6;
        if (IiiiiiiiIIIII7 > 0) {
            int IiiiiiiiIIIII8 = 0;
            while (IiiiiiiiIIIII8 < 3) {
                if ((IiiiiiiiIIIII6 >> 2 * IiiiiiiiIIIII8 & 1) != 0) {
                    boolean IiiiiiiiIIIII9;
                    boolean bl = IiiiiiiiIIIII9 = (IiiiiiiiIIIII6 >> 2 * IiiiiiiiIIIII8 + 1 & 1) == 1;
                    if (IiiiiiiiIIIII8 == 0) {
                        IiiiiiiiIIIII3 += IiiiiiiiIIIII9 ? IiiiiiiiIIIII7 : -IiiiiiiiIIIII7;
                    } else if (IiiiiiiiIIIII8 == 1) {
                        IiiiiiiiIIIII4 += IiiiiiiiIIIII9 ? IiiiiiiiIIIII7 : -IiiiiiiiIIIII7;
                    } else if (IiiiiiiiIIIII8 == 2) {
                        IiiiiiiiIIIII5 += IiiiiiiiIIIII9 ? IiiiiiiiIIIII7 : -IiiiiiiiIIIII7;
                    }
                }
                ++IiiiiiiiIIIII8;
            }
        }
        String IiiiiiiiIIIII10 = IiiiiiiiIIIII.getText(IiiiiiiiIIIII3, IiiiiiiiIIIII4, IiiiiiiiIIIII5, 100000, this.iiIiiiiiiIIiI);
        IiiiiiiiIIIII10 = IiiiiiiiIIIII10.replace("#r\u3010\u719f\u7ec3\u5ea6\u3011100000/100000", "");
        IiiiiiiiIIIII2.setTextSize(IiiiiiiiIIIII10, 205);
    }

    /*
     * WARNING - void declaration
     */
    public void iiiIiiiiiiIIi() {
        int IiiiiiiiIIIII = this.IiiiiiiiIIIII >> 6;
        StringBuffer IiiiiiiiIIIII2 = new StringBuffer();
        int IiiiiiiiIIIII3 = 0;
        while (IiiiiiiiIIIII3 < 3) {
            IiiiiiiiIIIII2.setLength(0);
            IiiiiiiiIIIII2.append("#W");
            IiiiiiiiIIIII2.append(IiiiiiiiIIIII3 == 0 ? this.iiIIIiiiiiiiI : (IiiiiiiiIIIII3 == 1 ? this.ALLATORIxDEMO : this.IIiiIiiiIIiIi));
            if (IiiiiiiiIIIII > 0 && (this.IiiiiiiiIIIII >> 2 * IiiiiiiiIIIII3 & 1) != 0) {
                void IiiiiiiiIIIII4;
                boolean bl = (this.IiiiiiiiIIIII >> 2 * IiiiiiiiIIIII3 + 1 & 1) == 1;
                IiiiiiiiIIIII2.append("#R");
                IiiiiiiiIIIII2.append(IiiiiiiiIIIII4 != false ? "+" : "-");
                IiiiiiiiIIIII2.append(IiiiiiiiIIIII);
            }
            this.IiiiIiiiIiIII[IiiiiiiiIIIII3 + 3].setTextSize(IiiiiiiiIIIII2.toString(), 150);
            RichLabel richLabel = this.IiiiIiiiIiIII[IiiiiiiiIIIII3 + 3];
            int n = this.IiiiIiiiIiIII[IiiiiiiiIIIII3 + 3].getX();
            int n2 = this.IiiiIiiiIiIII[IiiiiiiiIIIII3 + 3].getY();
            ++IiiiiiiiIIIII3;
            richLabel.setBounds(n, n2, 155, 19);
        }
        this.ALLATORIxDEMO(1, this.iiIiiiiiiiIii.getSelectedValue());
    }

    static /* synthetic */ JList ALLATORIxDEMO(iiIiIiiiiiiiI arg0) {
        return arg0.iiIiiiiiiiIii;
    }

    public void iIiIiiiiIIiii(int id) {
        if (id == 151) {
            if (this.IIIiiiiiIIiII == 0) {
                this.ALLATORIxDEMO().iiiIiiiiiiIIi("\u5750\u9a91\u6ca1\u6709\u91cd\u5851\u65b9\u6848");
                return;
            }
            String IiiiiiiiIIIII = Agreement.getSendTextAES((String)"usermount", (String)("CZ|" + this.iIiiIiiiIiIIi + "|0"));
            this.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII);
            return;
        }
        if (id == 152 || id == 153) {
            if (id == 152) {
                if (this.iiiIiiiiiiiIi <= 1) {
                    this.ALLATORIxDEMO().iiiIiiiiiiIIi("\u91cd\u5851\u7b49\u7ea7\u6700\u4f4e\u4e3a1");
                    return;
                }
                --this.iiiIiiiiiiiIi;
            } else {
                if (this.iiiIiiiiiiiIi >= 4) {
                    this.ALLATORIxDEMO().iiiIiiiiiiIIi("\u91cd\u5851\u7b49\u7ea7\u6700\u9ad8\u4e3a4");
                    return;
                }
                ++this.iiiIiiiiiiiIi;
            }
            this.IiIIIiiiiIiiI[1].setText(String.valueOf(this.iiiIiiiiiiiIi));
            this.IiIIIiiiiIiiI[2].setText(String.valueOf(this.iiiIiiiiiiiIi == 1 ? 2 : (this.iiiIiiiiiiiIi == 2 ? 6 : (this.iiiIiiiiiiiIi == 3 ? 12 : 20))));
            int IiiiiiiiIIIII = this.IiiiiiiiIIIII & 0x3F;
            int IiiiiiiiIIIII2 = 0;
            IiiiiiiiIIIII2 = this.iiIiiiiiiIIiI == 2 || this.iiIiiiiiiIIiI == 4 ? (this.iiiIiiiiiiiIi == 1 ? 2 : (this.iiiIiiiiiiiIi == 2 ? 4 : (this.iiiIiiiiiiiIi == 3 ? 6 : 8))) : (this.iiiIiiiiiiiIi == 1 ? 15 : (this.iiiIiiiiiiiIi == 2 ? 30 : (this.iiiIiiiiiiiIi == 3 ? 40 : 50)));
            this.IiiiiiiiIIIII = IiiiiiiiIIIII |= IiiiiiiiIIIII2 << 6;
            this.iiiIiiiiiiIIi();
            return;
        }
        if (id == 154) return;
        if (id != 155) return;
        int IiiiiiiiIIIII = this.iiiIiiiiiiiIi == 1 ? 2 : (this.iiiIiiiiiiiIi == 2 ? 6 : (this.iiiIiiiiiiiIi == 3 ? 12 : 20));
        Goodstable IiiiiiiiIIIII3 = this.ALLATORIxDEMO().ALLATORIxDEMO(721L);
        if (IiiiiiiiIIIII3 != null && IiiiiiiiIIIII3.getUsetime() >= IiiiiiiiIIIII) {
            String IiiiiiiiIIIII4 = Agreement.getSendTextAES((String)"usermount", (String)("CZ|" + this.iIiiIiiiIiIIi + "|" + this.IiiiiiiiIIIII + "|" + IiiiiiiiIIIII3.getRgid()));
            this.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII4);
            return;
        }
        this.ALLATORIxDEMO().iiiIiiiiiiIIi("\u7269\u54c1\u6570\u91cf\u4e0d\u8db3" + IiiiiiiiIIIII + "\u4e2a");
    }

    public iiIiIiiiiiiiI(GameView gameView) {
        super(171, 2, IiiiIiiiiIiIi.iIIIIiiiiiIIi, gameView);
        String IiiiiiiiIIIII;
        this.ALLATORIxDEMO(-1, 0, 542, 514, IiiiIiiiiIiIi.iiIIIiiiiiiiI);
        this.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/1.png", (int)68, (int)68, (int)68, (int)68, (boolean)false), "\u5750\u9a91\u91cd\u5851");
        this.iiIiIiiiiIIIi = new IIIiIiiiiIiII(0, 100, (IiiiIiiiiIiIi)this);
        this.iiIiIiiiiIIIi.iIiIiiiiIIiii(true);
        this.iiIiIiiiiIIIi.ALLATORIxDEMO(336, 28, 165, 20);
        this.add((Component)this.iiIiIiiiiIIIi);
        this.iIIiIiiiiiiIi = new IiIiIiiiiIIiI[5];
        int IiiiiiiiIIIII2 = 0;
        while (IiiiiiiiIIIII2 < this.iIIiIiiiiiiIi.length) {
            if (IiiiiiiiIIIII2 == 0) {
                this.iIIiIiiiiiiIi[IiiiiiiiIIIII2] = new IiIiIiiiiIIiI("sc/e/6.png", 1, 151 + IiiiiiiiIIIII2, iiIIiiiiIiiII.iiIiiiiiiIIiI, null, "\u6062\u590d", (IiiiIiiiiIiIi)this);
                this.iIIiIiiiiiiIi[IiiiiiiiIIIII2].setBounds(216, 29, 34, 18);
            } else if (IiiiiiiiIIIII2 == 1) {
                this.iIIiIiiiiiiIi[IiiiiiiiIIIII2] = new IiIiIiiiiIIiI("sc/e/32.png", 1, 151 + IiiiiiiiIIIII2, (IiiiIiiiiIiIi)this);
                this.iIIiIiiiiiiIi[IiiiiiiiIIIII2].setBounds(224, 57, 11, 15);
            } else if (IiiiiiiiIIIII2 == 2) {
                this.iIIiIiiiiiiIi[IiiiiiiiIIIII2] = new IiIiIiiiiIIiI("sc/e/34.png", 1, 151 + IiiiiiiiIIIII2, (IiiiIiiiiIiIi)this);
                this.iIIiIiiiiiiIi[IiiiiiiiIIIII2].setBounds(235, 57, 11, 15);
            } else if (IiiiiiiiIIIII2 == 3) {
                this.iIIiIiiiiiiIi[IiiiiiiiIIIII2] = new IiIiIiiiiIIiI("sc/e/40.png", 1, 151 + IiiiiiiiIIIII2, iiIIiiiiIiiII.iiIiiiiiiIIiI, null, "\uff1f", (IiiiIiiiiIiIi)this);
                this.iIIiIiiiiiiIi[IiiiiiiiIIIII2].setBounds(502, 56, 18, 18);
            } else if (IiiiiiiiIIIII2 == 4) {
                this.iIIiIiiiiiiIi[IiiiiiiiIIIII2] = new IiIiIiiiiIIiI("sc/e/7.png", 1, 151 + IiiiiiiiIIIII2, iiIIiiiiIiiII.iiiiIiiiIiiII, null, "\u786e\u8ba4", (IiiiIiiiiIiIi)this);
                this.iIIiIiiiiiiIi[IiiiiiiiIIIII2].setBounds(254, 472, 59, 25);
                this.iIIiIiiiiiiIi[IiiiiiiiIIIII2].setForeground(Color.black);
            }
            this.add((Component)this.iIIiIiiiiiiIi[IiiiiiiiIIIII2++]);
        }
        this.IIIIiiiiiiiII = new JLabel[14];
        IiiiiiiiIIIII2 = 0;
        while (IiiiiiiiIIIII2 < this.IIIIiiiiiiiII.length) {
            this.IIIIiiiiiiiII[IiiiiiiiIIIII2] = IiIIIiiiiIIiI.ALLATORIxDEMO((int)(46 + 215 * (IiiiiiiiIIIII2 % 2)), (int)(28 + 28 * (IiiiiiiiIIIII2 / 2)), (int)120, (int)19, (Color)Color.black, (Font)iiIIiiiiIiiII.iiiiIiiiIiiII);
            this.IIIIiiiiiiiII[IiiiiiiiIIIII2].setText(IiiiiiiiIIIII2 == 0 ? "\u5f85\u91cd\u5851\u5750\u9a91" : (IiiiiiiiIIIII2 == 1 ? "\u91cd\u5851\u65b9\u5411" : (IiiiiiiiIIIII2 == 2 ? "\u91cd\u5851\u7b49\u7ea7" : (IiiiiiiiIIIII2 == 3 ? "\u9700\u8981\u7b4b\u9aa8\u63d0\u6c14\u4e38" : (IiiiiiiiIIIII2 == 4 || IiiiiiiiIIIII2 == 5 ? "\u7075\u6027" : (IiiiiiiiIIIII2 == 6 || IiiiiiiiIIIII2 == 7 ? "\u529b\u91cf" : (IiiiiiiiIIIII2 == 8 || IiiiiiiiIIIII2 == 9 ? "\u6839\u9aa8" : (IiiiiiiiIIIII2 == 10 || IiiiiiiiIIIII2 == 11 ? "\u6280\u80fd\u9884\u89c8" : (IiiiiiiiIIIII2 == 12 ? "\u91cd\u5851\u524d\u5750\u9a91" : (IiiiiiiiIIIII2 == 13 ? "\u91cd\u5851\u540e\u5750\u9a91" : ""))))))))));
            this.IIIIiiiiiiiII[IiiiiiiiIIIII2].setHorizontalAlignment(10);
            if (IiiiiiiiIIIII2 >= 4 && IiiiiiiiIIIII2 <= 9) {
                this.IIIIiiiiiiiII[IiiiiiiiIIIII2].setBounds(59 + 242 * ((IiiiiiiiIIIII2 - 4) % 2), 129 + 25 * ((IiiiiiiiIIIII2 - 4) / 2), 36, 19);
            } else if (IiiiiiiiIIIII2 >= 10 && IiiiiiiiIIIII2 <= 11) {
                this.IIIIiiiiiiiII[IiiiiiiiIIIII2].setForeground(Color.white);
                this.IIIIiiiiiiiII[IiiiiiiiIIIII2].setHorizontalAlignment(0);
                this.IIIIiiiiiiiII[IiiiiiiiIIIII2].setBounds(56 + 242 * (IiiiiiiiIIIII2 - 10), 203, 211, 21);
            } else if (IiiiiiiiIIIII2 >= 12 && IiiiiiiiIIIII2 <= 13) {
                this.IIIIiiiiiiiII[IiiiiiiiIIIII2].setFont(iiIIiiiiIiiII.IIIiiiiiIIiII);
                this.IIIIiiiiiiiII[IiiiiiiiIIIII2].setBounds(70 + (IiiiiiiiIIIII2 - 12) * 242, 95, 100, 23);
                if (IiiiiiiiIIIII2 == 12) {
                    this.IIIIiiiiiiiII[IiiiiiiiIIIII2].setForeground(Color.white);
                } else if (IiiiiiiiIIIII2 == 13) {
                    this.IIIIiiiiiiiII[IiiiiiiiIIIII2].setForeground(Color.green);
                }
            }
            this.add(this.IIIIiiiiiiiII[IiiiiiiiIIIII2++]);
        }
        this.IiiiIiiiIiIII = new RichLabel[8];
        IiiiiiiiIIIII2 = 0;
        while (IiiiiiiiIIIII2 < this.IiiiIiiiIiIII.length) {
            this.IiiiIiiiIiIII[IiiiiiiiIIIII2] = new RichLabel("", IiiiiiiiIIIII2 == 6 || IiiiiiiiIIIII2 == 7 ? iiIIiiiiIiiII.iIiIIiiiiIIiI : iiIIiiiiIiiII.iIIIiiiiIIIii);
            if (IiiiiiiiIIIII2 >= 0 && IiiiiiiiIIIII2 <= 2) {
                this.IiiiIiiiIiIII[IiiiiiiiIIIII2].setBounds(101, 126 + 25 * IiiiiiiiIIIII2, 155, 19);
            } else if (IiiiiiiiIIIII2 >= 3 && IiiiiiiiIIIII2 <= 5) {
                this.IiiiIiiiIiIII[IiiiiiiiIIIII2].setBounds(343, 126 + 25 * (IiiiiiiiIIIII2 - 3), 155, 19);
            } else if (IiiiiiiiIIIII2 == 6) {
                this.IiiiIiiiIiIII[IiiiiiiiIIIII2].setBounds(60, 323, this.IiiiIiiiIiIII[IiiiiiiiIIIII2].getWidth(), this.IiiiIiiiIiIII[IiiiiiiiIIIII2].getHeight());
            } else if (IiiiiiiiIIIII2 == 7) {
                this.IiiiIiiiIiIII[IiiiiiiiIIIII2].setBounds(301, 323, this.IiiiIiiiIiIII[IiiiiiiiIIIII2].getWidth(), this.IiiiIiiiIiIII[IiiiiiiiIIIII2].getHeight());
            }
            this.add((Component)this.IiiiIiiiIiIII[IiiiiiiiIIIII2++]);
        }
        this.IiIIIiiiiIiiI = new iIIiIiiiIiiIi[9];
        IiiiiiiiIIIII2 = 0;
        while (IiiiiiiiIIIII2 < this.IiIIIiiiiIiiI.length) {
            this.IiIIIiiiiIiiI[IiiiiiiiIIIII2] = IiIIIiiiiIIiI.ALLATORIxDEMO((int)136, (int)28, (int)114, (int)19, (int)10, (Color)Color.white, (Font)iiIIiiiiIiiII.iIIIiiiiIIIii);
            if (IiiiiiiiIIIII2 == 1) {
                this.IiIIIiiiiIiiI[IiiiiiiiIIIII2].setBounds(136, 55, 112, 19);
            } else if (IiiiiiiiIIIII2 == 2) {
                this.IiIIIiiiiIiiI[IiiiiiiiIIIII2].setBounds(385, 55, 114, 19);
            } else if (IiiiiiiiIIIII2 >= 3 && IiiiiiiiIIIII2 <= 5) {
                this.IiIIIiiiiIiiI[IiiiiiiiIIIII2].setBounds(99, 129 + 25 * (IiiiiiiiIIIII2 - 3), 155, 19);
            } else if (IiiiiiiiIIIII2 >= 6 && IiiiiiiiIIIII2 <= 8) {
                this.IiIIIiiiiIiiI[IiiiiiiiIIIII2].setBounds(341, 129 + 25 * (IiiiiiiiIIIII2 - 6), 155, 19);
            }
            this.IiIIIiiiiIiiI[IiiiiiiiIIIII2].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/17.png", (int)6, (int)6, (int)6, (int)6, (boolean)false));
            this.add((Component)this.IiIIIiiiiIiiI[IiiiiiiiIIIII2++]);
        }
        this.iiiiIiiiIIiii = new DefaultListModel();
        this.iIiiIiiiiiiII = new DefaultListModel();
        this.iIiIiiiiIiIii = new JList();
        this.iiIiiiiiiiIii = new JList();
        IiiiiiiiIIIII2 = 0;
        while (IiiiiiiiIIIII2 < 2) {
            iiIiIiiiiiiiI iiIiIiiiiiiiI2 = this;
            JList<String> jList = IiiiiiiiIIIII2 == 0 ? iiIiIiiiiiiiI2.iIiIiiiiIiIii : iiIiIiiiiiiiI2.iiIiiiiiiiIii;
            ((JComponent)((Object)IiiiiiiiIIIII)).setOpaque(false);
            ((JList)((Object)IiiiiiiiIIIII)).setSelectionBackground(new Color(33, 42, 52));
            ((JList)((Object)IiiiiiiiIIIII)).setSelectionForeground(Color.GREEN);
            ((JComponent)((Object)IiiiiiiiIIIII)).setForeground(Color.GREEN);
            ((JComponent)((Object)IiiiiiiiIIIII)).setFont(iiIIiiiiIiiII.iIIIiiiiIIIii);
            ((JComponent)((Object)IiiiiiiiIIIII)).setBackground(iiIIiiiiIiiII.IIiIiiiiIIiII);
            ((JList)((Object)IiiiiiiiIIIII)).setModel(IiiiiiiiIIIII2 == 0 ? this.iiiiIiiiIIiii : this.iIiiIiiiiiiII);
            ++IiiiiiiiIIIII2;
        }
        this.iIiIiiiiIiIii.addListSelectionListener((ListSelectionListener)new iIIIiiiiIiIII(this));
        this.iiIiiiiiiiIii.addListSelectionListener((ListSelectionListener)new IiiIiiiiIIIiI(this));
        IiiiiiiiIIIII2 = 0;
        while (IiiiiiiiIIIII2 < 9) {
            IiiiiiiiIIIII = IiiiiiiiIIIII2 == 0 ? "\u593a\u547d\u8ffd\u9b42" : (IiiiiiiiIIIII2 == 1 ? "\u7834\u91dc\u6c89\u821f" : (IiiiiiiiIIIII2 == 2 ? "\u540e\u53d1\u5236\u4eba" : (IiiiiiiiIIIII2 == 3 ? "\u5929\u96f7\u6012\u706b" : (IiiiiiiiIIIII2 == 4 ? "\u5174\u98ce\u4f5c\u6d6a" : (IiiiiiiiIIIII2 == 5 ? "\u4e07\u52ab\u4e0d\u590d" : (IiiiiiiiIIIII2 == 6 ? "\u91d1\u8eab\u4e0d\u574f" : (IiiiiiiiIIIII2 == 7 ? "\u5929\u795e\u62a4\u4f53" : "\u5fc3\u5982\u6b62\u6c34")))))));
            this.iiiiIiiiIIiii.addElement(IiiiiiiiIIIII);
            ++IiiiiiiiIIIII2;
            this.iIiiIiiiiiiII.addElement(IiiiiiiiIIIII);
        }
        this.IIiiiiiiiIIIi = IiIIIiiiiIIiI.ALLATORIxDEMO((int)57, (int)224, (int)210, (int)96, this.iIiIiiiiIiIii, (int)-1);
        this.iiiiIiiiIiiII = IiIIIiiiiIIiI.ALLATORIxDEMO((int)298, (int)224, (int)210, (int)96, this.iiIiiiiiiiIii, (int)-1);
        this.add(this.IIiiiiiiiIIIi);
        this.add(this.iiiiIiiiIiiII);
        this.IiIiiiiiIIIII = new IIIiiiiiIiIiI[10];
        IiiiiiiiIIIII2 = 0;
        while (IiiiiiiiIIIII2 < this.IiIiiiiiIIIII.length) {
            this.IiIiiiiiIIIII[IiiiiiiiIIIII2] = new IIIiiiiiIiIiI();
            this.add((Component)this.IiIiiiiiIIIII[IiiiiiiiIIIII2]);
            if (IiiiiiiiIIIII2 >= 0 && IiiiiiiiIIIII2 <= 1) {
                this.IiIiiiiiIIIII[IiiiiiiiIIIII2].iIiIiiiiIIiii("sc/d/34.png");
                this.IiIiiiiiIIIII[IiiiiiiiIIIII2].setBounds(49 + 242 * IiiiiiiiIIIII2, 95, 205, 23);
            } else if (IiiiiiiiIIIII2 >= 2 && IiiiiiiiIIIII2 <= 3) {
                this.IiIiiiiiIIIII[IiiiiiiiIIIII2].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/25.png", (int)2, (int)2, (int)2, (int)2, (boolean)false));
                this.IiIiiiiiIIIII[IiiiiiiiIIIII2].setBounds(56 + 241 * (IiiiiiiiIIIII2 - 2), 203, 211, 21);
            } else if (IiiiiiiiIIIII2 >= 4 && IiiiiiiiIIIII2 <= 5) {
                this.IiIiiiiiIIIII[IiiiiiiiIIIII2].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/24.png", (int)2, (int)2, (int)2, (int)2, (boolean)false));
                this.IiIiiiiiIIIII[IiiiiiiiIIIII2].setBounds(56 + 241 * (IiiiiiiiIIIII2 - 4), 203, 211, 120);
            } else if (IiiiiiiiIIIII2 >= 6 && IiiiiiiiIIIII2 <= 7) {
                this.IiIiiiiiIIIII[IiiiiiiiIIIII2].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/24.png", (int)2, (int)2, (int)2, (int)2, (boolean)false));
                this.IiIiiiiiIIIII[IiiiiiiiIIIII2].setBounds(56 + 241 * (IiiiiiiiIIIII2 - 6), 322, 211, 130);
            } else if (IiiiiiiiIIIII2 >= 8 && IiiiiiiiIIIII2 <= 9) {
                this.IiIiiiiiIIIII[IiiiiiiiIIIII2].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/36.png", (int)20, (int)20, (int)20, (int)20, (boolean)false));
                this.IiIiiiiiIIIII[IiiiiiiiIIIII2].setBounds(47 + 241 * (IiiiiiiiIIIII2 - 8), 83, 231, 380);
            }
            ++IiiiiiiiIIIII2;
        }
    }

    public void iIiIiiiiIIiIi(String type) {
        int IiiiiiiiIIIII = 0;
        if (type.equals("\u52a0\u6839\u9aa8\uff0c\u51cf\u529b\u91cf")) {
            IiiiiiiiIIIII = 52;
        } else if (type.equals("\u52a0\u7075\u6027\uff0c\u51cf\u529b\u91cf")) {
            IiiiiiiiIIIII = 7;
        } else if (type.equals("\u52a0\u529b\u91cf\uff0c\u51cf\u6839\u9aa8")) {
            IiiiiiiiIIIII = 28;
        } else if (type.equals("\u52a0\u6839\u9aa8\uff0c\u51cf\u7075\u6027")) {
            IiiiiiiiIIIII = 49;
        } else if (type.equals("\u52a0\u529b\u91cf\uff0c\u51cf\u7075\u6027")) {
            IiiiiiiiIIIII = 13;
        } else if (type.equals("\u52a0\u7075\u6027\uff0c\u51cf\u6839\u9aa8")) {
            IiiiiiiiIIIII = 19;
        }
        int IiiiiiiiIIIII2 = 0;
        IiiiiiiiIIIII2 = this.iiIiiiiiiIIiI == 2 || this.iiIiiiiiiIIiI == 4 ? (this.iiiIiiiiiiiIi == 1 ? 2 : (this.iiiIiiiiiiiIi == 2 ? 4 : (this.iiiIiiiiiiiIi == 3 ? 6 : 8))) : (this.iiiIiiiiiiiIi == 1 ? 15 : (this.iiiIiiiiiiiIi == 2 ? 30 : (this.iiiIiiiiiiiIi == 3 ? 40 : 50)));
        this.IiiiiiiiIIIII = IiiiiiiiIIIII |= IiiiiiiiIIIII2 << 6;
        this.iiiIiiiiiiIIi();
    }

    /*
     * WARNING - void declaration
     */
    public void ALLATORIxDEMO(Mount mount) {
        if (this.iiIiiiiiiIIiI != mount.getMountid()) {
            return;
        }
        this.iiIiiiiiiIIiI = mount.getMountid();
        int IiiiiiiiIIIII = mount.getMountlvl();
        if (IiiiiiiiIIIII > 100) {
            IiiiiiiiIIIII -= 100;
        }
        this.iiIIIiiiiiiiI = (int)Math.floor((float)mount.getSpri().intValue() + (float)IiiiiiiiIIIII / 10.0f * (float)mount.getSpri().intValue() / 2.0f);
        this.ALLATORIxDEMO = (int)Math.floor((float)mount.getPower().intValue() + (float)IiiiiiiiIIIII / 10.0f * (float)mount.getPower().intValue() / 2.0f);
        this.IIiiIiiiIIiIi = (int)Math.floor((float)mount.getBone().intValue() + (float)IiiiiiiiIIIII / 10.0f * (float)mount.getBone().intValue() / 2.0f);
        this.IIIiiiiiIIiII = mount.getMountCZ();
        int IiiiiiiiIIIII2 = this.IIIiiiiiIIiII >> 6;
        StringBuffer IiiiiiiiIIIII3 = new StringBuffer();
        int IiiiiiiiIIIII4 = 0;
        while (IiiiiiiiIIIII4 < 3) {
            IiiiiiiiIIIII3.setLength(0);
            IiiiiiiiIIIII3.append("#W");
            IiiiiiiiIIIII3.append(IiiiiiiiIIIII4 == 0 ? this.iiIIIiiiiiiiI : (IiiiiiiiIIIII4 == 1 ? this.ALLATORIxDEMO : this.IIiiIiiiIIiIi));
            if (IiiiiiiiIIIII2 > 0 && (this.IIIiiiiiIIiII >> 2 * IiiiiiiiIIIII4 & 1) != 0) {
                void IiiiiiiiIIIII5;
                boolean bl = (this.IIIiiiiiIIiII >> 2 * IiiiiiiiIIIII4 + 1 & 1) == 1;
                IiiiiiiiIIIII3.append("#R");
                IiiiiiiiIIIII3.append(IiiiiiiiIIIII5 != false ? "+" : "-");
                IiiiiiiiIIIII3.append(IiiiiiiiIIIII2);
            }
            this.IiiiIiiiIiIII[IiiiiiiiIIIII4].setTextSize(IiiiiiiiIIIII3.toString(), 150);
            RichLabel richLabel = this.IiiiIiiiIiIII[IiiiiiiiIIIII4];
            int n = this.IiiiIiiiIiIII[IiiiiiiiIIIII4].getX();
            int n2 = this.IiiiIiiiIiIII[IiiiiiiiIIIII4].getY();
            ++IiiiiiiiIIIII4;
            richLabel.setBounds(n, n2, 155, 19);
        }
        this.ALLATORIxDEMO(0, this.iIiIiiiiIiIii.getSelectedValue());
    }
}
