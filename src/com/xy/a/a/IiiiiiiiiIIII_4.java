/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.a.IIiIiiiiIIiii
 *  com.xy.entity.RoleSummoning
 *  com.xy.game.HandlePet
 *  com.xy.game.RolePet
 *  com.xy.i.IiIiIiiiiIIiI
 *  com.xy.q.IIIIIiiiIIIiI
 *  com.xy.q.IIIiiiiiIiIiI
 *  com.xy.q.IIiIiiiiiiiII
 *  com.xy.q.IiIIIiiiiIIiI
 *  com.xy.q.IiiiIiiiiIiIi
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

import com.xy.a.a.IIiIiiiiIIiii;
import com.xy.entity.RoleSummoning;
import com.xy.game.HandlePet;
import com.xy.game.RolePet;
import com.xy.i.IiIiIiiiiIIiI;
import com.xy.q.IIIIIiiiIIIiI;
import com.xy.q.IIiIiiiiiiiII;
import com.xy.q.IiIIIiiiiIIiI;
import com.xy.q.IiiiIiiiiIiIi;
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
import java.awt.Image;
import java.math.BigDecimal;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JScrollPane;

public class IiiiiiiiiIIII
extends IiiiIiiiiIiIi {
    private IIIiiiiiIiIiI[] IIIIiiiiiiiII;
    private IiIiIiiiiIIiI[] iiIIIiiiiiiiI;
    private IIIIIiiiIIIiI IiIiiiiiIIIII;
    private IIiIiiiiiiiII iiIiIiiiiIIIi;
    private JLabel[] iiiiIiiiIiiII;
    private JScrollPane iiiIiiiiiiiIi;
    private IIiIiiiiIIiii[] iIiiIiiiiiiII;
    private com.xy.q.IIIiiiiiIiIiI IIiiIiiiIIiIi;
    private BigDecimal iIiIiiiiIiIii;
    private JScrollPane IiIIIiiiiIiiI;
    private BigDecimal iiIiiiiiiiIii;
    private RichLabel IiiiiiiiIIIII;
    private static Image ALLATORIxDEMO = IIIIIiiiIiiII.iiiIiiiiiiIIi((String)"sc/d/113.png");

    public void ALLATORIxDEMO(RolePet rolePet) {
        int IiiiiiiiIIIII;
        if (rolePet == null) {
            this.iiiIiiiiiiIIi();
            return;
        }
        RoleSummoning IiiiiiiiIIIII2 = rolePet.getPet();
        ArrayList<String> IiiiiiiiIIIII3 = new ArrayList<String>();
        if (IiiiiiiiIIIII2.getPetSkills() != null && !IiiiiiiiIIIII2.getPetSkills().equals("")) {
            String[] IiiiiiiiIIIII4 = IiiiiiiiIIIII2.getPetSkills().split("\\|");
            IiiiiiiiIIIII = 0;
            while (IiiiiiiiIIIII < IiiiiiiiIIIII4.length) {
                if (!(IiiiiiiiIIIII4[IiiiiiiiIIIII].startsWith("L") || IiiiiiiiIIIII4[IiiiiiiiIIIII].startsWith("Q") || IiiiiiiiIIIII4[IiiiiiiiIIIII].startsWith("T") || IiiiiiiiIIIII4[IiiiiiiiIIIII].startsWith("X"))) {
                    IiiiiiiiIIIII3.add(IiiiiiiiIIIII4[IiiiiiiiIIIII]);
                }
                ++IiiiiiiiIIIII;
            }
        }
        this.iiIiiiiiiiIii = rolePet.getId();
        int IiiiiiiiIIIII5 = IiiiiiiiIIIII2.getOpenSealByType(0);
        IiiiiiiiIIIII = IiiiiiiiIIIII2.getOpenSealByType(1);
        int IiiiiiiiIIIII6 = 0;
        while (IiiiiiiiIIIII6 < 9) {
            if (IiiiiiiiIIIII6 >= IiiiiiiiIIIII5) {
                if (this.ALLATORIxDEMO().gamePetSkill && IiiiiiiiIIIII6 >= IiiiiiiiIIIII) {
                    this.iIiiIiiiiiiII[IiiiiiiiIIIII6].ALLATORIxDEMO(-2, -1);
                } else {
                    this.iIiiIiiiiiiII[IiiiiiiiIIIII6].ALLATORIxDEMO(-1, -1);
                }
            } else if (IiiiiiiiIIIII6 != 6 || IiiiiiiiIIIII2.getBeastSkills() == null || IiiiiiiiIIIII2.getBeastSkills().equals("")) {
                if (IiiiiiiiIIIII6 < 6 && IiiiiiiiIIIII3 != null && IiiiiiiiIIIII6 < IiiiiiiiIIIII3.size() || IiiiiiiiIIIII6 > 6 && IiiiiiiiIIIII3 != null && IiiiiiiiIIIII6 - 1 < IiiiiiiiIIIII3.size()) {
                    String IiiiiiiiIIIII7 = (String)IiiiiiiiIIIII3.get(IiiiiiiiIIIII6 < 6 ? IiiiiiiiIIIII6 : IiiiiiiiIIIII6 - 1);
                    int IiiiiiiiIIIII8 = IiiiiiiiIIIII7.indexOf("=");
                    int IiiiiiiiIIIII9 = IiiiiiiiIIIII8 == -1 ? -1 : Integer.parseInt(IiiiiiiiIIIII7.substring(IiiiiiiiIIIII8 + 1));
                    this.iIiiIiiiiiiII[IiiiiiiiIIIII6].ALLATORIxDEMO(Integer.parseInt(IiiiiiiiIIIII8 == -1 ? IiiiiiiiIIIII7 : IiiiiiiiIIIII7.substring(0, IiiiiiiiIIIII8)), IiiiiiiiIIIII9);
                } else {
                    this.iIiiIiiiiiiII[IiiiiiiiIIIII6].ALLATORIxDEMO(0, -1);
                }
            }
            ++IiiiiiiiIIIII6;
        }
    }

    public void iIiIiiiiIIiIi() {
        this.IiIiiiiiIIIII.ALLATORIxDEMO();
        this.iiIiIiiiiIIIi.ALLATORIxDEMO();
    }

    public void ALLATORIxDEMO(Goodstable good, RoleSummoning pet) {
        this.IiIiiiiiIIIII.ALLATORIxDEMO(pet.getSid().longValue());
        this.iiIiIiiiiIIIi.ALLATORIxDEMO(good.getRgid().longValue());
        this.iIiIiiiiIIiIi();
        this.ALLATORIxDEMO().iIiIiiiiIIiIi(this.iIiIiiiiIIiii());
    }

    public void iIiIiiiiIIiii(int id) {
        int IiiiiiiiIIIII;
        if (id != 141) {
            if (id != 142) return;
        }
        RoleSummoning IiiiiiiiIIIII2 = this.ALLATORIxDEMO().getPet(this.iiIiiiiiiiIii);
        Goodstable IiiiiiiiIIIII3 = this.ALLATORIxDEMO().getGood(this.iIiIiiiiIiIii);
        if (IiiiiiiiIIIII2 == null) return;
        if (IiiiiiiiIIIII3 == null) {
            return;
        }
        if (IiiiiiiiIIIII3.getGoodlock() == 1) {
            this.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u8be5\u7269\u54c1\u5df2\u52a0\u9501");
            return;
        }
        if (id == 141) {
            Object IiiiiiiiIIIII4;
            String IiiiiiiiIIIII5 = IiiiiiiiIIIII2.getPetSkills();
            int IiiiiiiiIIIII6 = IiiiiiiiIIIII2.getOpenSealByType(0);
            if (IiiiiiiiIIIII6 > 0 && IiiiiiiiIIIII5 != null && !IiiiiiiiIIIII5.equals("")) {
                IiiiiiiiIIIII4 = IiiiiiiiIIIII5.split("\\|");
                int IiiiiiiiIIIII7 = ((String[])IiiiiiiiIIIII4).length;
                if (IiiiiiiiIIIII5.indexOf("L") != -1) {
                    --IiiiiiiiIIIII7;
                }
                if (IiiiiiiiIIIII5.indexOf("Q") != -1) {
                    --IiiiiiiiIIIII7;
                }
                if (IiiiiiiiIIIII5.indexOf("X") != -1) {
                    --IiiiiiiiIIIII7;
                }
                if (IiiiiiiiIIIII5.indexOf("T") != -1) {
                    --IiiiiiiiIIIII7;
                }
                if (HandlePet.getSkillNum((int)IiiiiiiiIIIII6) <= IiiiiiiiIIIII7) {
                    this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u53ec\u5524\u517d\u6280\u80fd\u683c\u5b50\u5df2\u7ecf\u6ee1\u4e86");
                    return;
                }
            }
            IiiiiiiiIIIII4 = Agreement.getSendTextAES((String)"userpet", (String)(String.valueOf(IiiiiiiiIIIII3.getRgid().toString()) + "|" + IiiiiiiiIIIII2.getSid()));
            this.ALLATORIxDEMO().ALLATORIxDEMO((String)IiiiiiiiIIIII4);
            return;
        }
        if (id != 142) return;
        int n = IiiiiiiiIIIII = IiiiiiiiIIIII2.getSsn().equals("2") || IiiiiiiiIIIII2.getSsn().equals("3") || IiiiiiiiIIIII2.getSsn().equals("4") ? 9 : 6;
        if (IiiiiiiiIIIII2.getOpenSealByType(1) >= IiiiiiiiIIIII) {
            this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u8fd9\u53ea\u53ec\u5524\u517d\u7684\u6280\u80fd\u683c\u5b50\u90fd\u5df2\u89e3\u5f00\uff01");
            return;
        }
        String IiiiiiiiIIIII8 = Agreement.getSendTextAES((String)"userpet", (String)("JP|" + IiiiiiiiIIIII2.getSid() + "|" + IiiiiiiiIIIII3.getRgid()));
        this.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII8);
    }

    static /* synthetic */ Image ALLATORIxDEMO() {
        return ALLATORIxDEMO;
    }

    public IiiiiiiiiIIII(GameView gameView) {
        super(163, 2, IiiiIiiiiIiIi.iIIIIiiiiiIIi, gameView);
        this.ALLATORIxDEMO(-1, 0, 487, 448, IiiiIiiiiIiIi.iiIIIiiiiiiiI);
        this.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/1.png", (int)68, (int)68, (int)68, (int)68, (boolean)false), "\u805a\u9b44\u4e39");
        this.IiIiiiiiIIIII = new IIIIIiiiIIIiI((IiiiIiiiiIiIi)this);
        this.IiIiiiiiIIIII.setBounds(0, 0, 150, 20);
        this.iiIiIiiiiIIIi = new IIiIiiiiiiiII((IiiiIiiiiIiIi)this);
        this.iiIiIiiiiIIIi.setBounds(0, 0, 150, 20);
        this.IiIIIiiiiIiiI = IiIIIiiiiIIiI.ALLATORIxDEMO((int)43, (int)59, (int)155, (int)168, (Component)this.IiIiiiiiIIIII, (int)20);
        this.iiiIiiiiiiiIi = IiIIIiiiiIIiI.ALLATORIxDEMO((int)43, (int)252, (int)155, (int)168, (Component)this.iiIiIiiiiIIIi, (int)20);
        this.add(this.IiIIIiiiiIiiI);
        this.add(this.iiiIiiiiiiiIi);
        this.iiIIIiiiiiiiI = new IiIiIiiiiIIiI[3];
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iiIIIiiiiiiiI.length) {
            this.iiIIIiiiiiiiI[IiiiiiiiIIIII] = new IiIiIiiiiIIiI(IiiiiiiiIIIII == 2 ? "sc/e/1.png" : "sc/e/26.png", 1, 141 + IiiiiiiiIIIII, iiIIiiiiIiiII.iiiiIiiiIiiII, iiIIiiiiIiiII.IIiiiiiiIiiII, IiiiiiiiIIIII == 0 ? "\u83b7\u5f97\u6280\u80fd" : (IiiiiiiiIIIII == 1 ? "\u5f00\u6280\u80fd\u683c" : ""), (IiiiIiiiiIiIi)this);
            if (IiiiiiiiIIIII == 2) {
                this.iiIIIiiiiiiiI[IiiiiiiiIIIII].setBounds(437, 48, 18, 18);
            } else {
                this.iiIIIiiiiiiiI[IiiiiiiiIIIII].setBounds(223 + 128 * IiiiiiiiIIIII, 398, 99, 25);
            }
            this.add((Component)this.iiIIIiiiiiiiI[IiiiiiiiIIIII++]);
        }
        this.iiiiIiiiIiiII = new JLabel[2];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iiiiIiiiIiiII.length) {
            this.iiiiIiiiIiiII[IiiiiiiiIIIII] = IiIIIiiiiIIiI.ALLATORIxDEMO((int)43, (int)(38 + 193 * IiiiiiiiIIIII), (int)155, (int)21, (Color)Color.white, (Font)iiIIiiiiIiiII.iiiiIiiiIiiII);
            this.iiiiIiiiIiiII[IiiiiiiiIIIII].setText(IiiiiiiiIIIII == 0 ? "\u53ec\u5524\u517d\u5217\u8868" : (IiiiiiiiIIIII == 1 ? "\u62e5\u6709\u805a\u9b44\u4e39" : ""));
            this.iiiiIiiiIiiII[IiiiiiiiIIIII].setHorizontalAlignment(0);
            this.add(this.iiiiIiiiIiiII[IiiiiiiiIIIII++]);
        }
        this.IiiiiiiiIIIII = new RichLabel("", iiIIiiiiIiiII.iIIIiiiiIIIii);
        this.add((Component)this.IiiiiiiiIIIII);
        this.iIiiIiiiiiiII = new IIiIiiiiIIiii[9];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iIiiIiiiiiiII.length) {
            this.iIiiIiiiiiiII[IiiiiiiiIIIII] = new IIiIiiiiIIiii(this, IiiiiiiiIIIII);
            if (IiiiiiiiIIIII == 0) {
                this.iIiiIiiiiiiII[IiiiiiiiIIIII].setBounds(301, 40, 62, 62);
            } else if (IiiiiiiiIIIII == 1) {
                this.iIiiIiiiiiiII[IiiiiiiiIIIII].setBounds(233, 82, 62, 62);
            } else if (IiiiiiiiIIIII == 2) {
                this.iIiiIiiiiiiII[IiiiiiiiIIIII].setBounds(204, 149, 62, 62);
            } else if (IiiiiiiiIIIII == 3) {
                this.iIiiIiiiiiiII[IiiiiiiiIIIII].setBounds(233, 217, 62, 62);
            } else if (IiiiiiiiIIIII == 4) {
                this.iIiiIiiiiiiII[IiiiiiiiIIIII].setBounds(301, 259, 62, 62);
            } else if (IiiiiiiiIIIII == 5) {
                this.iIiiIiiiiiiII[IiiiiiiiIIIII].setBounds(370, 216, 62, 62);
            } else if (IiiiiiiiIIIII == 6) {
                this.iIiiIiiiiiiII[IiiiiiiiIIIII].setVisible(false);
            } else if (IiiiiiiiIIIII == 7) {
                this.iIiiIiiiiiiII[IiiiiiiiIIIII].setBounds(398, 149, 62, 62);
            } else if (IiiiiiiiIIIII == 8) {
                this.iIiiIiiiiiiII[IiiiiiiiIIIII].setBounds(369, 82, 62, 62);
            }
            this.add((Component)this.iIiiIiiiiiiII[IiiiiiiiIIIII++]);
        }
        this.IIiiIiiiIIiIi = new com.xy.q.IIIiiiiiIiIiI((IiiiIiiiiIiIi)this);
        this.IIiiIiiiIIiIi.setBounds(210, 337, 50, 50);
        this.add((Component)this.IIiiIiiiIIiIi);
        this.IIIIiiiiiiiII = new IIIiiiiiIiIiI[7];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IIIIiiiiiiiII.length) {
            this.IIIIiiiiiiiII[IiiiiiiiIIIII] = new IIIiiiiiIiIiI();
            if (IiiiiiiiIIIII == 0 || IiiiiiiiIIIII == 1) {
                this.IIIIiiiiiiiII[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/25.png", (int)2, (int)2, (int)2, (int)2, (boolean)false));
                this.IIIIiiiiiiiII[IiiiiiiiIIIII].setBounds(43, 38 + 193 * IiiiiiiiIIIII, 155, 21);
            } else if (IiiiiiiiIIIII == 2 || IiiiiiiiIIIII == 3) {
                this.IIIIiiiiiiiII[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/24.png", (int)2, (int)2, (int)2, (int)2, (boolean)false));
                this.IIIIiiiiiiiII[IiiiiiiiIIIII].setBounds(43, 38 + 193 * (IiiiiiiiIIIII - 2), 155, 190);
            } else if (IiiiiiiiIIIII == 4) {
                this.IIIIiiiiiiiII[IiiiiiiiIIIII].setBounds(202, 37, 264, 291);
                this.IIIIiiiiiiiII[IiiiiiiiIIIII].iIiIiiiiIIiii("sc/d/114.png");
            } else if (IiiiiiiiIIIII == 5) {
                this.IIIIiiiiiiiII[IiiiiiiiIIIII].setBounds(206, 333, 59, 57);
                this.IIIIiiiiiiiII[IiiiiiiiIIIII].iIiIiiiiIIiii("sc/d/4.png");
            } else if (IiiiiiiiIIIII == 6) {
                this.IIIIiiiiiiiII[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/24.png", (int)2, (int)2, (int)2, (int)2, (boolean)false));
                this.IIIIiiiiiiiII[IiiiiiiiIIIII].setBounds(270, 333, 195, 56);
            }
            this.add((Component)this.IIIIiiiiiiiII[IiiiiiiiIIIII++]);
        }
    }

    public void iiiIiiiiiiIIi() {
        this.iiIiiiiiiiIii = null;
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iIiiIiiiiiiII.length) {
            IIiIiiiiIIiii iIiIiiiiIIiii = this.iIiiIiiiiiiII[IiiiiiiiIIIII];
            ++IiiiiiiiIIIII;
            iIiIiiiiIIiii.ALLATORIxDEMO(-1, -1);
        }
    }

    public void ALLATORIxDEMO(Goodstable good) {
        if (good == null) {
            this.iIiIiiiiIiIii = null;
            this.IiiiiiiiIIIII.clear();
            this.IIiiIiiiIIiIi.ALLATORIxDEMO(0, null);
            return;
        }
        this.iIiIiiiiIiIii = good.getRgid();
        String IiiiiiiiIIIII = IIiiIiiiiIIiI.iIiIiiiiIIiii((String)good.getValue(), (String)"\u6280\u80fd=", (String)"|");
        String IiiiiiiiIIIII2 = IIiiIiiiiIIiI.iIiIiiiiIIiii((String)good.getValue(), (String)"\u6280\u80fd\u7b49\u7ea7=", (String)"|");
        this.IIiiIiiiIIiIi.ALLATORIxDEMO(1, (Object)good);
        this.IiiiiiiiIIIII.setTextSize("#Y\u6280\u80fd\uff1a#G" + IiiiiiiiIIIII + "#r#Y\u6280\u80fd\u7b49\u7ea7\uff1a#G" + IiiiiiiiIIIII2, 188);
        this.IiiiiiiiIIIII.setBounds(274, 334, this.IiiiiiiiIIIII.getWidth(), this.IiiiiiiiIIIII.getHeight());
    }
}
