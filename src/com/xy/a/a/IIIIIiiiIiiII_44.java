/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.a.IIiIiiiiIiIII
 *  com.xy.entity.RoleSummoning
 *  com.xy.i.IiIiIiiiiIIiI
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.readbean.TYC
 *  com.xy.socket.Agreement
 *  com.xy.text.GameView
 *  com.xy.v.IiiiIiiiiIIII
 */
package com.xy.a.a;

import com.xy.a.a.IIiIiiiiIiIII;
import com.xy.entity.RoleSummoning;
import com.xy.i.IiIiIiiiiIIiI;
import com.xy.q.IiiiIiiiiIiIi;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.readbean.TYC;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import com.xy.v.IiiiIiiiiIIII;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Point;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JLabel;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class IIIIIiiiIiiII
extends IiiiIiiiiIiIi {
    private BigDecimal iIiiIiiiiiiII;
    private IiIiIiiiiIIiI IIiiIiiiIIiIi;
    private List<IIiIiiiiIiIII> iIiIiiiiIiIii;
    private IiIiIiiiiIIiI IiIIIiiiiIiiI;
    private String iiIiiiiiiiIii;
    private JLabel IiiiiiiiIIIII;
    private IiIiIiiiiIIiI ALLATORIxDEMO;

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (!this.iiIIiiiiIiIIi.iIiIiiiiIIiii()) return;
        this.iiiIiiiiiiIIi();
    }

    public RoleSummoning ALLATORIxDEMO() {
        return this.ALLATORIxDEMO().getPet(this.iIiiIiiiiiiII);
    }

    public void ALLATORIxDEMO(RoleSummoning pet) {
        this.iIiiIiiiiiiII = pet.getSid();
        this.iiIiiiiiiiIii = pet.getXy();
        this.iIiIiiiiIIiIi();
        this.ALLATORIxDEMO().iIiIiiiiIIiIi(this.iIiIiiiiIIiii());
    }

    public IIiIiiiiIiIII ALLATORIxDEMO(int id) {
        for (IIiIiiiiIiIII IiiiiiiiIIIII : this.iIiIiiiiIiIii) {
            if (IIiIiiiiIiIII.ALLATORIxDEMO((IIiIiiiiIiIII)IiiiiiiiIIIII).getV2() != id) continue;
            return IiiiiiiiIIIII;
        }
        return null;
    }

    public String ALLATORIxDEMO() {
        boolean IiiiiiiiIIIII = false;
        StringBuffer IiiiiiiiIIIII2 = new StringBuffer();
        for (IIiIiiiiIiIII IiiiiiiiIIIII3 : this.iIiIiiiiIiIii) {
            if (IIiIiiiiIiIII.iIiIiiiiIIiii((IIiIiiiiIiIII)IiiiiiiiIIIII3) == 0 || IIiIiiiiIiIII.ALLATORIxDEMO((IIiIiiiiIiIII)IiiiiiiiIIIII3) <= 0) continue;
            if (!IiiiiiiiIIIII && IIiIiiiiIiIII.ALLATORIxDEMO((IIiIiiiiIiIII)IiiiiiiiIIIII3) > IIiIiiiiIiIII.iiiIiiiiiiIIi((IIiIiiiiIiIII)IiiiiiiiIIIII3)) {
                IiiiiiiiIIIII = true;
            }
            if (IiiiiiiiIIIII2.length() != 0) {
                IiiiiiiiIIIII2.append("=");
            }
            IiiiiiiiIIIII2.append(IIiIiiiiIiIII.iIiIiiiiIIiii((IIiIiiiiIiIII)IiiiiiiiIIIII3));
        }
        if (!IiiiiiiiIIIII) return null;
        return IiiiiiiiIIIII2.toString();
    }

    /*
     * Unable to fully structure code
     */
    public void IiiIiiiiiiIiI() {
        IiiiiiiiIIIII = this.ALLATORIxDEMO();
        IiiiiiiiIIIII = IiiiiiiiIIIII.getTurnRount();
        IiiiiiiiIIIII = IiiiIiiiiIIII.iiiiiiiiIIiii((int)IiiiiiiiIIIII.getGrade());
        IiiiiiiiIIIII = IiiiiiiiIIIII.getXYLvl();
        IiiiiiiiIIIII = 0;
        for (IIiIiiiiIiIII IiiiiiiiIIIII : this.iIiIiiiiIiIii) {
            IiiiiiiiIIIII += IIiIiiiiIiIII.ALLATORIxDEMO((IIiIiiiiIiIII)IiiiiiiiIIIII);
        }
        for (IIiIiiiiIiIII IiiiiiiiIIIII : this.iIiIiiiiIiIii) {
            if (IIiIiiiiIiIII.ALLATORIxDEMO((IIiIiiiiIiIII)IiiiiiiiIIIII) > 0) continue;
            if (IIiIiiiiIiIII.ALLATORIxDEMO((IIiIiiiiIiIII)IiiiiiiiIIIII).getList() == null) {
                IiiiiiiiIIIII.ALLATORIxDEMO(true);
                continue;
            }
            IiiiiiiiIIIII = true;
            IiiiiiiiIIIII = IIiIiiiiIiIII.ALLATORIxDEMO((IIiIiiiiIiIII)IiiiiiiiIIIII).getList().size() - 1;
            while (IiiiiiiiIIIII >= 0) {
                block15: {
                    block20: {
                        block19: {
                            block18: {
                                block17: {
                                    block16: {
                                        IiiiiiiiIIIII = (TYC)IIiIiiiiIiIII.ALLATORIxDEMO((IIiIiiiiIiIII)IiiiiiiiIIIII).getList().get(IiiiiiiiIIIII);
                                        if (IiiiiiiiIIIII.getType() != 2) break block16;
                                        IiiiiiiiIIIII = IiiiiiiiIIIII.getVs();
                                        if (IiiiiiiiIIIII[IiiiiiiiIIIII = Math.min(IIiIiiiiIiIII.ALLATORIxDEMO((IIiIiiiiIiIII)IiiiiiiiIIIII), IiiiiiiiIIIII.length - 1)] > IiiiiiiiIIIII - IIiIiiiiIiIII.ALLATORIxDEMO((IIiIiiiiIiIII)IiiiiiiiIIIII)) {
                                            IiiiiiiiIIIII = false;
                                        }
                                        break block15;
                                    }
                                    if (IiiiiiiiIIIII.getType() != 3) break block17;
                                    IiiiiiiiIIIII = this.ALLATORIxDEMO(IiiiiiiiIIIII.getV1());
                                    if (IiiiiiiiIIIII == null || IIiIiiiiIiIII.ALLATORIxDEMO((IIiIiiiiIiIII)IiiiiiiiIIIII) < IiiiiiiiIIIII.getV2()) {
                                        IiiiiiiiIIIII = false;
                                    }
                                    break block15;
                                }
                                if (IiiiiiiiIIIII.getType() != 4) break block18;
                                if (IiiiiiiiIIIII < IiiiiiiiIIIII.getV1() || IiiiiiiiIIIII == IiiiiiiiIIIII.getV1() && IiiiiiiiIIIII < IiiiiiiiIIIII.getV2()) {
                                    IiiiiiiiIIIII = false;
                                }
                                break block15;
                            }
                            if (IiiiiiiiIIIII.getType() != 5) break block19;
                            IiiiiiiiIIIII = 0;
                            if (true) ** GOTO lbl52
                        }
                        if (IiiiiiiiIIIII.getType() != 6) break block20;
                        IiiiiiiiIIIII = IiiiiiiiIIIII.getV1();
                        IiiiiiiiIIIII = 0;
                        if (true) ** GOTO lbl58
                    }
                    if (IiiiiiiiIIIII.getType() == 7 && 12 < IiiiiiiiIIIII.getV1()) {
                        IiiiiiiiIIIII = false;
                    }
                    break block15;
                    do {
                        if ((IiiiiiiiIIIII = this.ALLATORIxDEMO(IiiiiiiiIIIII.getVs()[IiiiiiiiIIIII])) != null && IIiIiiiiIiIII.ALLATORIxDEMO((IIiIiiiiIiIII)IiiiiiiiIIIII) > 0 && IIiIiiiiIiIII.iIiIiiiiIIiii((IIiIiiiiIiIII)IiiiiiiiIIIII) != IIiIiiiiIiIII.iIiIiiiiIIiii((IIiIiiiiIiIII)IiiiiiiiIIIII)) {
                            IiiiiiiiIIIII = false;
                            break block15;
                        }
                        ++IiiiiiiiIIIII;
lbl52:
                        // 2 sources

                    } while (IiiiiiiiIIIII < IiiiiiiiIIIII.getVs().length);
                    break block15;
                    do {
                        if (this.ALLATORIxDEMO(IiiiiiiiIIIII.getVs()[IiiiiiiiIIIII]) != null && IIiIiiiiIiIII.ALLATORIxDEMO((IIiIiiiiIiIII)IiiiiiiiIIIII) > 0) {
                            --IiiiiiiiIIIII;
                        }
                        ++IiiiiiiiIIIII;
lbl58:
                        // 2 sources

                    } while (IiiiiiiiIIIII < IiiiiiiiIIIII.getVs().length);
                    if (IiiiiiiiIIIII <= 0 && IIiIiiiiIiIII.ALLATORIxDEMO((IIiIiiiiIiIII)IiiiiiiiIIIII) <= 0) {
                        IiiiiiiiIIIII = false;
                    }
                }
                --IiiiiiiiIIIII;
            }
            IiiiiiiiIIIII.ALLATORIxDEMO(IiiiiiiiIIIII);
        }
        this.IiiiiiiiIIIII.setText(String.valueOf(IiiiiiiiIIIII - IiiiiiiiIIIII));
        if (!this.ALLATORIxDEMO().ALLATORIxDEMO(2, 8) && !this.ALLATORIxDEMO().ALLATORIxDEMO(2, 11)) {
            if (this.ALLATORIxDEMO().ALLATORIxDEMO(2, 12) == false) return;
        }
        if (IiiiiiiiIIIII >= 12 && IiiiiiiiIIIII.ALLATORIxDEMO("1250")) {
            this.IIiiIiiiIIiIi.ALLATORIxDEMO(84, "\u6210\u5723");
            return;
        }
        this.IIiiIiiiIIiIi.ALLATORIxDEMO(81, "\u5151\u6362");
    }

    public IIIIIiiiIiiII(GameView gameView) {
        super(146, 2, IiiiIiiiiIiIi.iIIIIiiiiiIIi, gameView);
        this.ALLATORIxDEMO(-1, 0, 901, 548, IiiiIiiiiIiIi.iiIIIiiiiiiiI);
        this.iIiIiiiiIIiii("sc/c/160");
        List IiiiiiiiIIIII = this.ALLATORIxDEMO().ALLATORIxDEMO("\u5fc3\u610f\u4fee\u70bc");
        this.iIiIiiiiIiIii = new ArrayList<IIiIiiiiIiIII>();
        for (TYC IiiiiiiiIIIII2 : IiiiiiiiIIIII) {
            IIiIiiiiIiIII IiiiiiiiIIIII3 = new IIiIiiiiIiIII(this, IiiiiiiiIIIII2);
            Point IiiiiiiiIIIII4 = this.ALLATORIxDEMO(IiiiiiiiIIIII2.getV1());
            IiiiiiiiIIIII3.setBounds(IiiiiiiiIIIII4.x, IiiiiiiiIIIII4.y, 27, 27);
            this.iIiIiiiiIiIii.add(IiiiiiiiIIIII3);
            this.add((Component)IiiiiiiiIIIII3);
        }
        IIIIIiiiIiiII iIIIIiiiIiiII = this;
        IIIIIiiiIiiII iIIIIiiiIiiII2 = this;
        iIIIIiiiIiiII2.IiiiiiiiIIIII = new JLabel("0");
        iIIIIiiiIiiII.IiiiiiiiIIIII.setBounds(232, 416, 40, 16);
        iIIIIiiiIiiII2.IiiiiiiiIIIII.setFont(iiIIiiiiIiiII.IIiiiiiiiIIIi);
        iIIIIiiiIiiII.IiiiiiiiIIIII.setForeground(Color.red);
        iIIIIiiiIiiII.add(iIIIIiiiIiiII2.IiiiiiiiIIIII);
        this.IIiiIiiiIIiIi = new IiIiIiiiiIIiI("sc/e/7.png", 1, 81, iiIIiiiiIiiII.iiiiIiiiIiiII, iiIIiiiiIiiII.IIiiiiiiIiiII, "\u5151\u6362", (IiiiIiiiiIiIi)this);
        this.ALLATORIxDEMO = new IiIiIiiiiIIiI("sc/e/7.png", 1, 82, iiIIiiiiIiiII.iiiiIiiiIiiII, iiIIiiiiIiiII.IIiiiiiiIiiII, "\u6d17\u70b9", (IiiiIiiiiIiIi)this);
        this.IiIIIiiiiIiiI = new IiIiIiiiiIIiI("sc/e/26.png", 1, 83, iiIIiiiiIiiII.iiiiIiiiIiiII, iiIIiiiiIiiII.IIiiiiiiIiiII, "\u786e\u5b9a\u52a0\u70b9", (IiiiIiiiiIiIi)this);
        this.IIiiIiiiIIiIi.setBounds(167, 437, 68, 26);
        this.ALLATORIxDEMO.setBounds(440, 476, 68, 26);
        this.IiIIIiiiiIiiI.setBounds(428, 448, 92, 26);
        this.add((Component)this.IIiiIiiiIIiIi);
        this.add((Component)this.ALLATORIxDEMO);
        this.add((Component)this.IiIIIiiiiIiiI);
    }

    public void iIiIiiiiIIiIi() {
        IIiIiiiiIiIII IiiiiiiiIIIII2;
        for (IIiIiiiiIiIII IiiiiiiiIIIII2 : this.iIiIiiiiIiIii) {
            IiiiiiiiIIIII2.iIiIiiiiIIiIi();
        }
        IiiiiiiiIIIII2 = this.iiIiiiiiiiIii != null && !this.iiIiiiiiiiIii.equals("") ? this.iiIiiiiiiiIii.split("=") : null;
        int IiiiiiiiIIIII3 = IiiiiiiiIIIII2 != null ? Integer.parseInt((String)IiiiiiiiIIIII2[0]) : 0;
        int IiiiiiiiIIIII4 = 1;
        int IiiiiiiiIIIII5 = IiiiiiiiIIIII2 != null ? ((IIiIiiiiIiIII)IiiiiiiiIIIII2).length : 0;
        while (IiiiiiiiIIIII4 < IiiiiiiiIIIII5) {
            IIiIiiiiIiIII IiiiiiiiIIIII6 = this.ALLATORIxDEMO(Integer.parseInt((String)IiiiiiiiIIIII2[IiiiiiiiIIIII4]));
            if (IiiiiiiiIIIII6 != null) {
                IiiiiiiiIIIII6.ALLATORIxDEMO(1);
                IiiiiiiiIIIII3 -= IIiIiiiiIiIII.iiiIiiiiiiIIi((IIiIiiiiIiIII)IiiiiiiiIIIII6);
            }
            ++IiiiiiiiIIIII4;
        }
        this.IiiiiiiiIIIII.setText(String.valueOf(IiiiiiiiIIIII3));
        this.IiiIiiiiiiIiI();
    }

    public void iIiIiiiiIIiii(int id) {
        RoleSummoning IiiiiiiiIIIII = this.ALLATORIxDEMO();
        if (IiiiiiiiIIIII == null) {
            return;
        }
        if (id == 81) {
            String IiiiiiiiIIIII2 = Agreement.getSendTextAES((String)"userpet", (String)("XYXL|" + IiiiiiiiIIIII.getSid()));
            this.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII2);
            return;
        }
        if (id == 82) {
            String IiiiiiiiIIIII3 = Agreement.getSendTextAES((String)"userpet", (String)("XY|" + IiiiiiiiIIIII.getSid()));
            this.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII3);
            return;
        }
        if (id != 83) {
            if (id != 84) return;
            String IiiiiiiiIIIII4 = Agreement.getSendTextAES((String)"userpet", (String)("XYCS|" + IiiiiiiiIIIII.getSid()));
            this.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII4);
            return;
        }
        String IiiiiiiiIIIII5 = this.ALLATORIxDEMO();
        if (IiiiiiiiIIIII5 == null) {
            this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u8bf7\u4fee\u6539\u70b9\u6570");
            return;
        }
        if (this.ALLATORIxDEMO().ALLATORIxDEMO(2, 11)) {
            this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u5b9d\u5b9d\u98de\u5347\u540e\u5fc3\u610f\u624d\u751f\u6548");
        }
        String IiiiiiiiIIIII6 = Agreement.getSendTextAES((String)"userpet", (String)("XY|" + IiiiiiiiIIIII.getSid() + "|" + IiiiiiiiIIIII5));
        this.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII6);
    }

    public Point ALLATORIxDEMO(int id) {
        if (id == 11) {
            return new Point(464, 352);
        }
        if (id == 12) {
            return new Point(390, 313);
        }
        if (id == 21) {
            return new Point(317, 415);
        }
        if (id == 22) {
            return new Point(607, 403);
        }
        if (id == 31) {
            return new Point(545, 308);
        }
        if (id == 32) {
            return new Point(380, 220);
        }
        if (id == 41) {
            return new Point(231, 321);
        }
        if (id == 42) {
            return new Point(689, 320);
        }
        if (id == 51) {
            return new Point(539, 218);
        }
        if (id == 52) {
            return new Point(459, 173);
        }
        if (id == 61) {
            return new Point(202, 191);
        }
        if (id == 62) {
            return new Point(717, 187);
        }
        if (id == 71) {
            return new Point(267, 163);
        }
        if (id == 72) {
            return new Point(656, 158);
        }
        if (id == 81) {
            return new Point(225, 105);
        }
        if (id != 82) return null;
        return new Point(693, 92);
    }

    public synchronized void iiiIiiiiiiIIi() {
        RoleSummoning IiiiiiiiIIIII = this.ALLATORIxDEMO();
        if (IiiiiiiiIIIII == null) {
            this.ALLATORIxDEMO().iiiIiiiiiiIIi(this.iIiIiiiiIIiii());
            return;
        }
        String IiiiiiiiIIIII2 = IiiiiiiiIIIII.getXy();
        if (IiiiiiiiIIIII2 == null) {
            IiiiiiiiIIIII2 = "";
        }
        if (IiiiiiiiIIIII2.equals(this.iiIiiiiiiiIii)) {
            return;
        }
        this.iiIiiiiiiiIii = IiiiiiiiIIIII2;
        this.iIiIiiiiIIiIi();
    }

    static /* synthetic */ JLabel ALLATORIxDEMO(IIIIIiiiIiiII arg0) {
        return arg0.IiiiiiiiIIIII;
    }
}
