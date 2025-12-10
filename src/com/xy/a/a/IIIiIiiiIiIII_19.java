/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.a.iIIIIiiiIiiIi
 *  com.xy.a.a.iIiIiiiiIiIII
 *  com.xy.bean.ConfirmBean
 *  com.xy.entity.RoleSummoning
 *  com.xy.formula.BaseValue
 *  com.xy.formula.MsgUntil
 *  com.xy.i.IiIiIiiiiIIiI
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.readbean.Skill
 *  com.xy.readbean.TYC
 *  com.xy.socket.Agreement
 *  com.xy.text.GameView
 *  com.xy.v.IIIiiiiiIiIiI
 *  com.xy.v.IiiiIiiiiIIII
 *  com.xy.v.IiiiiiiiiIIII
 *  com.xy.w.IIIIIiiiIiiII
 */
package com.xy.a.a;

import com.xy.a.a.iIIIIiiiIiiIi;
import com.xy.a.a.iIiIiiiiIiIII;
import com.xy.bean.ConfirmBean;
import com.xy.entity.RoleSummoning;
import com.xy.formula.BaseValue;
import com.xy.formula.MsgUntil;
import com.xy.i.IiIiIiiiiIIiI;
import com.xy.q.IiiiIiiiiIiIi;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.readbean.Skill;
import com.xy.readbean.TYC;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import com.xy.v.IIIiiiiiIiIiI;
import com.xy.v.IiiiIiiiiIIII;
import com.xy.v.IiiiiiiiiIIII;
import com.xy.w.IIIIIiiiIiiII;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JLabel;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class IIIiIiiiIiIII
extends IiiiIiiiiIiIi {
    private List<iIIIIiiiIiiIi> iiiiIiiiIIiii;
    private Image iIIiIiiiiiiIi;
    private Image IIIIiiiiiiiII;
    private BigDecimal iiIIIiiiiiiiI;
    private Image IiIiiiiiIIIII;
    private IiIiIiiiiIIiI iiIiIiiiiIIIi;
    private int iiiiIiiiIiiII;
    private IiIiIiiiiIIiI iiiIiiiiiiiIi;
    private String iIiiIiiiiiiII;
    private IiIiIiiiiIIiI IIiiIiiiIIiIi;
    private IiIiIiiiiIIiI iIiIiiiiIiIii;
    private IiIiIiiiiIIiI[] IiIIIiiiiIiiI;
    private Image iiIiiiiiiiIii = IIIIIiiiIiiII.iiiIiiiiiiIIi((String)"sc/b/S271.png");
    private JLabel IiiiiiiiIIIII;
    private String ALLATORIxDEMO;

    /*
     * WARNING - void declaration
     */
    public synchronized void IIIIIiiiiIIii() {
        String[] IiiiiiiiIIIII;
        IiiiiiiiiIIII IiiiiiiiIIIII2 = this.ALLATORIxDEMO();
        List IiiiiiiiIIIII3 = IiiiiiiiIIIII2.ALLATORIxDEMO(this.ALLATORIxDEMO);
        String[] stringArray = IiiiiiiiIIIII = this.iIiiIiiiiiiII != null ? this.iIiiIiiiiiiII.split("=") : new String[]{};
        if (IiiiiiiiIIIII.length > 2 && !IiiiiiiiIIIII[2].equals(this.ALLATORIxDEMO)) {
            this.ALLATORIxDEMO().iiiIiiiiiiIIi(115);
            return;
        }
        int IiiiiiiiIIIII4 = 0;
        while (IiiiiiiiIIIII4 < this.iiiiIiiiIIiii.size()) {
            void IiiiiiiiIIIII5;
            iIIIIiiiIiiIi iIIIIiiiIiiIi2 = this.iiiiIiiiIIiii.get(IiiiiiiiIIIII4);
            ++IiiiiiiiIIIII4;
            iIIIIiiiIiiIi2.ALLATORIxDEMO(this.ALLATORIxDEMO(IiiiiiiiIIIII3, iIIIIiiiIiiIi.iiiIiiiiiiIIi((iIIIIiiiIiiIi)IiiiiiiiIIIII5)));
        }
        IiiiiiiiIIIII4 = 3;
        while (IiiiiiiiIIIII4 < IiiiiiiiIIIII.length) {
            Skill IiiiiiiiIIIII6;
            int IiiiiiiiIIIII7 = IiiiiiiiIIIII[IiiiiiiiIIIII4].indexOf("-");
            if (IiiiiiiiIIIII7 != -1 && (IiiiiiiiIIIII6 = IiiiiiiiIIIII2.iIiIiiiiIIiii(IiiiiiiiIIIII[IiiiiiiiIIIII4].substring(0, IiiiiiiiIIIII7))) != null) {
                void IiiiiiiiIIIII8;
                int n = Integer.parseInt(IiiiiiiiIIIII6.getSkillid());
                int IiiiiiiiIIIII9 = Integer.parseInt(IiiiiiiiIIIII[IiiiiiiiIIIII4].substring(IiiiiiiiIIIII7 + 1));
                iIIIIiiiIiiIi IiiiiiiiIIIII10 = this.ALLATORIxDEMO((int)IiiiiiiiIIIII8);
                if (IiiiiiiiIIIII10 != null) {
                    iIIIIiiiIiiIi.iiiIiiiiiiIIi((iIIIIiiiIiiIi)IiiiiiiiIIIII10, (int)IiiiiiiiIIIII9);
                    iIIIIiiiIiiIi.iIiIiiiiIIiii((iIIIIiiiIiiIi)IiiiiiiiIIIII10, (int)IiiiiiiiIIIII9);
                    iIIIIiiiIiiIi.ALLATORIxDEMO((iIIIIiiiIiiIi)IiiiiiiiIIIII10, (int)Integer.parseInt(IiiiiiiiIIIII6.getSkilllevel()));
                }
            }
            ++IiiiiiiiIIIII4;
        }
        this.iiiiiiiiIIiii();
    }

    static /* synthetic */ Image iIiIiiiiIIiIi(IIIiIiiiIiIII arg0) {
        return arg0.IIIIiiiiiiiII;
    }

    /*
     * Unable to fully structure code
     */
    public void iiiiiiiiIIiii() {
        v0 = this.ALLATORIxDEMO();
        IiiiiiiiIIIII = v0.getTurnRount();
        IiiiiiiiIIIII = IiiiIiiiiIIII.iiiiiiiiIIiii((int)v0.getGrade());
        IiiiiiiiIIIII = v0.getLxGZ();
        IiiiiiiiIIIII = 0;
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iiiiIiiiIIiii.size()) {
            IiiiiiiiIIIII = this.iiiiIiiiIIiii.get(IiiiiiiiIIIII);
            if (IiiiiiiiIIIII.isVisible()) {
                IiiiiiiiIIIII += iIIIIiiiIiiIi.iIiIiiiiIIiii((iIIIIiiiIiiIi)IiiiiiiiIIIII);
            }
            ++IiiiiiiiIIIII;
        }
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iiiiIiiiIIiii.size()) {
            block14: {
                IiiiiiiiIIIII = this.iiiiIiiiIIiii.get(IiiiiiiiIIIII);
                if (!IiiiiiiiIIIII.isVisible()) break block14;
                iIIIIiiiIiiIi.ALLATORIxDEMO((iIIIIiiiIiiIi)IiiiiiiiIIIII, (boolean)false);
                if (iIIIIiiiIiiIi.ALLATORIxDEMO((iIIIIiiiIiiIi)IiiiiiiiIIIII).getList() == null) {
                    iIIIIiiiIiiIi.iIiIiiiiIIiii((iIIIIiiiIiiIi)IiiiiiiiIIIII, (boolean)true);
                } else {
                    iIIIIiiiIiiIi.iIiIiiiiIIiii((iIIIIiiiIiiIi)IiiiiiiiIIIII, (boolean)false);
                }
                IiiiiiiiIIIII = iIIIIiiiIiiIi.ALLATORIxDEMO((iIIIIiiiIiiIi)IiiiiiiiIIIII).getList().size() - 1;
                while (IiiiiiiiIIIII >= 0) {
                    block16: {
                        block19: {
                            block18: {
                                block17: {
                                    block15: {
                                        IiiiiiiiIIIII = (TYC)iIIIIiiiIiiIi.ALLATORIxDEMO((iIIIIiiiIiiIi)IiiiiiiiIIIII).getList().get(IiiiiiiiIIIII);
                                        if (IiiiiiiiIIIII.getType() != 2) break block15;
                                        IiiiiiiiIIIII = IiiiiiiiIIIII.getVs();
                                        if (IiiiiiiiIIIII[IiiiiiiiIIIII = Math.min(iIIIIiiiIiiIi.iIiIiiiiIIiii((iIIIIiiiIiiIi)IiiiiiiiIIIII), IiiiiiiiIIIII.length - 1)] > IiiiiiiiIIIII - iIIIIiiiIiiIi.iIiIiiiiIIiii((iIIIIiiiIiiIi)IiiiiiiiIIIII)) {
                                            iIIIIiiiIiiIi.iIiIiiiiIIiii((iIIIIiiiIiiIi)IiiiiiiiIIIII, (boolean)false);
                                            break block14;
                                        }
                                        break block16;
                                    }
                                    if (IiiiiiiiIIIII.getType() != 4) break block17;
                                    if (IiiiiiiiIIIII < IiiiiiiiIIIII.getV1() || IiiiiiiiIIIII == IiiiiiiiIIIII.getV1() && IiiiiiiiIIIII < IiiiiiiiIIIII.getV2()) {
                                        iIIIIiiiIiiIi.iIiIiiiiIIiii((iIIIIiiiIiiIi)IiiiiiiiIIIII, (boolean)false);
                                        break block14;
                                    }
                                    break block16;
                                }
                                if (IiiiiiiiIIIII.getType() != 5) break block18;
                                IiiiiiiiIIIII = 0;
                                if (true) ** GOTO lbl57
                            }
                            if (IiiiiiiiIIIII.getType() != 6) break block19;
                            IiiiiiiiIIIII = IiiiiiiiIIIII.getV1();
                            IiiiiiiiIIIII = 0;
                            if (true) ** GOTO lbl63
                        }
                        if (IiiiiiiiIIIII.getType() == 7 && IiiiiiiiIIIII < IiiiiiiiIIIII.getV1()) {
                            iIIIIiiiIiiIi.iIiIiiiiIIiii((iIIIIiiiIiiIi)IiiiiiiiIIIII, (boolean)false);
                            iIIIIiiiIiiIi.ALLATORIxDEMO((iIIIIiiiIiiIi)IiiiiiiiIIIII, (boolean)true);
                            break block14;
                        }
                        break block16;
                        do {
                            if ((IiiiiiiiIIIII = this.ALLATORIxDEMO(IiiiiiiiIIIII.getVs()[IiiiiiiiIIIII])) != null && iIIIIiiiIiiIi.iIiIiiiiIIiii((iIIIIiiiIiiIi)IiiiiiiiIIIII) > 0 && iIIIIiiiIiiIi.ALLATORIxDEMO((iIIIIiiiIiiIi)IiiiiiiiIIIII) != iIIIIiiiIiiIi.ALLATORIxDEMO((iIIIIiiiIiiIi)IiiiiiiiIIIII)) {
                                iIIIIiiiIiiIi.iIiIiiiiIIiii((iIIIIiiiIiiIi)IiiiiiiiIIIII, (boolean)false);
                                break block14;
                            }
                            ++IiiiiiiiIIIII;
lbl57:
                            // 2 sources

                        } while (IiiiiiiiIIIII < IiiiiiiiIIIII.getVs().length);
                        break block16;
                        do {
                            if ((IiiiiiiiIIIII = this.ALLATORIxDEMO(IiiiiiiiIIIII.getVs()[IiiiiiiiIIIII])) != null && iIIIIiiiIiiIi.iIiIiiiiIIiii((iIIIIiiiIiiIi)IiiiiiiiIIIII) > 0) {
                                --IiiiiiiiIIIII;
                            }
                            ++IiiiiiiiIIIII;
lbl63:
                            // 2 sources

                        } while (IiiiiiiiIIIII < IiiiiiiiIIIII.getVs().length);
                        if (IiiiiiiiIIIII <= 0 && iIIIIiiiIiiIi.iIiIiiiiIIiii((iIIIIiiiIiiIi)IiiiiiiiIIIII) <= 0) {
                            iIIIIiiiIiiIi.iIiIiiiiIIiii((iIIIIiiiIiiIi)IiiiiiiiIIIII, (boolean)false);
                            break block14;
                        }
                    }
                    --IiiiiiiiIIIII;
                }
                iIIIIiiiIiiIi.ALLATORIxDEMO((iIIIIiiiIiiIi)IiiiiiiiIIIII, (boolean)false);
                iIIIIiiiIiiIi.iIiIiiiiIIiii((iIIIIiiiIiiIi)IiiiiiiiIIIII, (boolean)true);
            }
            ++IiiiiiiiIIIII;
        }
        this.IiiiiiiiIIIII.setText(String.valueOf(this.iiiiIiiiIiiII - IiiiiiiiIIIII));
    }

    public void IiiIiiiiiiIiI() {
        this.IiIIIiiiiIiiI = new IiIiIiiiiIIiI[3];
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IiIIIiiiiIiiI.length) {
            this.IiIIIiiiiIiiI[IiiiiiiiIIIII] = new IiIiIiiiiIIiI("sc/b/B" + (363 + IiiiiiiiIIIII) + ".png", 1, 95 + IiiiiiiiIIIII, (IiiiIiiiiIiIi)this);
            this.IiIIIiiiiIiiI[IiiiiiiiIIIII].setBounds(52 + 182 * IiiiiiiiIIIII, 12, 171, 346);
            this.add((Component)this.IiIIIiiiiIiiI[IiiiiiiiIIIII++]);
        }
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (!this.iiIIiiiiIiIIi.iIiIiiiiIIiii()) return;
        this.iIiIiiiiIIiIi();
    }

    public String ALLATORIxDEMO() {
        boolean IiiiiiiiIIIII = false;
        StringBuffer IiiiiiiiIIIII2 = new StringBuffer();
        IiiiiiiiIIIII2.append(this.ALLATORIxDEMO);
        int IiiiiiiiIIIII3 = 0;
        while (IiiiiiiiIIIII3 < this.iiiiIiiiIIiii.size()) {
            iIIIIiiiIiiIi IiiiiiiiIIIII4 = this.iiiiIiiiIIiii.get(IiiiiiiiIIIII3);
            if (iIIIIiiiIiiIi.ALLATORIxDEMO((iIIIIiiiIiiIi)IiiiiiiiIIIII4) != 0 && iIIIIiiiIiiIi.iIiIiiiiIIiii((iIIIIiiiIiiIi)IiiiiiiiIIIII4) > 0) {
                if (!IiiiiiiiIIIII && iIIIIiiiIiiIi.iIiIiiiiIIiii((iIIIIiiiIiiIi)IiiiiiiiIIIII4) > iIIIIiiiIiiIi.iIiIiiiiIIiIi((iIIIIiiiIiiIi)IiiiiiiiIIIII4)) {
                    IiiiiiiiIIIII = true;
                }
                IiiiiiiiIIIII2.append("=");
                IiiiiiiiIIIII2.append(iIIIIiiiIiiIi.ALLATORIxDEMO((iIIIIiiiIiiIi)IiiiiiiiIIIII4));
                IiiiiiiiIIIII2.append("-");
                IiiiiiiiIIIII2.append(iIIIIiiiIiiIi.iIiIiiiiIIiii((iIIIIiiiIiiIi)IiiiiiiiIIIII4));
            }
            ++IiiiiiiiIIIII3;
        }
        if (!IiiiiiiiIIIII) return null;
        return IiiiiiiiIIIII2.toString();
    }

    public void iIiIiiiiIIiIi(String type) {
        this.ALLATORIxDEMO = type;
        if (type.equals("\u7269\u7406\u7cfb")) {
            int IiiiiiiiIIIII;
            this.iiiIiiiiiiIIi("sc/b/S268.png");
            this.iiiIiiiiiiIIi(1);
            RoleSummoning IiiiiiiiIIIII2 = this.ALLATORIxDEMO();
            int IiiiiiiiIIIII3 = IiiiiiiiIIIII2.getLxValue();
            this.iiiiIiiiIiiII = IiiiiiiiIIIII = BaseValue.getLxLvl((int)IiiiiiiiIIIII3);
            this.IIIIIiiiiIIii();
            return;
        }
        if (type.equals("\u6cd5\u672f\u7cfb")) {
            int IiiiiiiiIIIII;
            this.iiiIiiiiiiIIi("sc/b/S269.png");
            this.iiiIiiiiiiIIi(1);
            RoleSummoning IiiiiiiiIIIII4 = this.ALLATORIxDEMO();
            int IiiiiiiiIIIII5 = IiiiiiiiIIIII4.getLxValue();
            this.iiiiIiiiIiiII = IiiiiiiiIIIII = BaseValue.getLxLvl((int)IiiiiiiiIIIII5);
            this.IIIIIiiiiIIii();
            return;
        }
        if (type.equals("\u8f85\u52a9\u7cfb")) {
            int IiiiiiiiIIIII;
            this.iiiIiiiiiiIIi("sc/b/S270.png");
            this.iiiIiiiiiiIIi(1);
            RoleSummoning IiiiiiiiIIIII6 = this.ALLATORIxDEMO();
            int IiiiiiiiIIIII7 = IiiiiiiiIIIII6.getLxValue();
            this.iiiiIiiiIiiII = IiiiiiiiIIIII = BaseValue.getLxLvl((int)IiiiiiiiIIIII7);
            this.IIIIIiiiiIIii();
            return;
        }
        this.iiiIiiiiiiIIi("sc/b/S267.png");
        this.iiiIiiiiiiIIi(0);
    }

    public synchronized void iIiIiiiiIIiIi() {
        int IiiiiiiiIIIII;
        RoleSummoning IiiiiiiiIIIII2 = this.ALLATORIxDEMO();
        if (IiiiiiiiIIIII2 == null) {
            this.ALLATORIxDEMO().iiiIiiiiiiIIi(115);
            return;
        }
        this.iiiiIiiiIiiII = IiiiiiiiIIIII = BaseValue.getLxLvl((int)IiiiiiiiIIIII2.getLxValue());
        if (this.ALLATORIxDEMO == null || this.ALLATORIxDEMO.equals("")) {
            this.IiiiiiiiIIIII.setText(String.valueOf(IiiiiiiiIIIII));
            return;
        }
        String IiiiiiiiIIIII3 = IiiiiiiiIIIII2.getLx();
        if (IiiiiiiiIIIII3 == null) {
            IiiiiiiiIIIII3 = "";
        }
        if (IiiiiiiiIIIII3.equals(this.iIiiIiiiiiiII)) {
            return;
        }
        this.iIiiIiiiiiiII = IiiiiiiiIIIII3;
        this.IIIIIiiiiIIii();
    }

    public void iiiIiiiiiiIIi(int type) {
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IiIIIiiiiIiiI.length) {
            this.IiIIIiiiiIiiI[IiiiiiiiIIIII].setVisible(type == 0);
            ++IiiiiiiiIIIII;
        }
        this.IIiiIiiiIIiIi.setVisible(type == 1);
        this.iIiIiiiiIiIii.setVisible(type == 1);
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iiiiIiiiIIiii.size()) {
            iIIIIiiiIiiIi IiiiiiiiIIIII2 = this.iiiiIiiiIIiii.get(IiiiiiiiIIIII);
            if (type == 1) {
                IiiiiiiiIIIII2.setVisible(iIIIIiiiIiiIi.ALLATORIxDEMO((iIIIIiiiIiiIi)IiiiiiiiIIIII2) != 0);
            } else {
                IiiiiiiiIIIII2.setVisible(false);
            }
            ++IiiiiiiiIIIII;
        }
    }

    public static String ALLATORIxDEMO(Skill skill, int lvl) {
        String IiiiiiiiIIIII = skill.getRemark();
        double IiiiiiiiIIIII2 = Double.parseDouble(skill.getValue());
        double IiiiiiiiIIIII3 = Double.parseDouble(skill.getGrow());
        int IiiiiiiiIIIII4 = 1;
        while (IiiiiiiiIIIII4 <= 34) {
            String IiiiiiiiIIIII5 = MsgUntil.iIiIiiiiIIiii((int)IiiiiiiiIIIII4);
            if (IiiiiiiiIIIII4 > 10 && IiiiiiiiIIIII4 % 10 == 0) {
                IiiiiiiiIIIII5 = String.valueOf(MsgUntil.iIiIiiiiIIiii((int)(IiiiiiiiIIIII4 / 10))) + "\u5341";
            } else if (IiiiiiiiIIIII4 > 20) {
                IiiiiiiiIIIII5 = String.valueOf(MsgUntil.iIiIiiiiIIiii((int)(IiiiiiiiIIIII4 / 10))) + "\u5341" + MsgUntil.iIiIiiiiIIiii((int)(IiiiiiiiIIIII4 % 10));
            } else if (IiiiiiiiIIIII4 > 10) {
                IiiiiiiiIIIII5 = "\u5341" + MsgUntil.iIiIiiiiIIiii((int)(IiiiiiiiIIIII4 % 10));
            }
            IiiiiiiiIIIII5 = "{\u7075\u7280" + IiiiiiiiIIIII5 + "}";
            IiiiiiiiIIIII = IiiiiiiiIIIII.replace(IiiiiiiiIIIII5, IIIiIiiiIiIII.ALLATORIxDEMO(IiiiiiiiIIIII4++, IiiiiiiiIIIII2, IiiiiiiiIIIII3, lvl));
        }
        return IiiiiiiiIIIII;
    }

    static /* synthetic */ Image iiiIiiiiiiIIi(IIIiIiiiIiIII arg0) {
        return arg0.IiIiiiiiIIIII;
    }

    static /* synthetic */ Image iIiIiiiiIIiii(IIIiIiiiIiIII arg0) {
        return arg0.iiIiiiiiiiIii;
    }

    public void ALLATORIxDEMO(RoleSummoning pet) {
        this.iiIIIiiiiiiiI = pet.getSid();
        this.iIiiIiiiiiiII = pet.getLx();
        if (this.iIiiIiiiiiiII == null) {
            this.iIiIiiiiIIiIi("");
        } else if (this.iIiiIiiiiiiII.indexOf("\u7269\u7406\u7cfb") != -1) {
            this.iIiIiiiiIIiIi("\u7269\u7406\u7cfb");
        } else if (this.iIiiIiiiiiiII.indexOf("\u6cd5\u672f\u7cfb") != -1) {
            this.iIiIiiiiIIiIi("\u6cd5\u672f\u7cfb");
        } else if (this.iIiiIiiiiiiII.indexOf("\u8f85\u52a9\u7cfb") != -1) {
            this.iIiIiiiiIIiIi("\u8f85\u52a9\u7cfb");
        } else {
            this.iIiIiiiiIIiIi("");
        }
        this.ALLATORIxDEMO().iIiIiiiiIIiIi(this.iIiIiiiiIIiii());
    }

    public void iiiIiiiiiiIIi() {
        this.IIiiIiiiIIiIi = new IiIiIiiiiIIiI("sc/b/B366.png", 1, 93, (IiiiIiiiiIiIi)this);
        this.iIiIiiiiIiIii = new IiIiIiiiiIIiI("sc/e/26.png", 1, 94, iiIIiiiiIiiII.iiiiIiiiIiiII, iiIIiiiiIiiII.IIiiiiiiIiiII, "\u786e\u5b9a\u52a0\u70b9", (IiiiIiiiiIiIi)this);
        this.IIiiIiiiIIiIi.setBounds(0, 310, 55, 43);
        this.iIiIiiiiIiIii.setBounds(510, 365, 92, 26);
        this.add((Component)this.IIiiIiiiIIiIi);
        this.add((Component)this.iIiIiiiiIiIii);
        this.iiiiIiiiIIiii = new ArrayList<iIIIIiiiIiiIi>();
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < 24) {
            iIIIIiiiIiiIi IiiiiiiiIIIII2 = null;
            IiiiiiiiIIIII2 = IiiiiiiiIIIII < 6 ? new iIIIIiiiIiiIi(this, 11 + IiiiiiiiIIIII) : (IiiiiiiiIIIII < 10 ? new iIIIIiiiIiiIi(this, 22 + IiiiiiiiIIIII - 6) : (IiiiiiiiIIIII < 12 ? new iIIIIiiiIiiIi(this, 33 + IiiiiiiiIIIII - 10) : (IiiiiiiiIIIII < 14 ? new iIIIIiiiIiiIi(this, 43 + IiiiiiiiIIIII - 12) : (IiiiiiiiIIIII < 16 ? new iIIIIiiiIiiIi(this, 53 + IiiiiiiiIIIII - 14) : (IiiiiiiiIIIII < 18 ? new iIIIIiiiIiiIi(this, 63 + IiiiiiiiIIIII - 16) : new iIIIIiiiIiiIi(this, 71 + IiiiiiiiIIIII - 18))))));
            this.iiiiIiiiIIiii.add(IiiiiiiiIIIII2);
            ++IiiiiiiiIIIII;
            this.add((Component)IiiiiiiiIIIII2);
        }
    }

    public void iIiIiiiiIIiii(int id) {
        RoleSummoning IiiiiiiiIIIII = this.ALLATORIxDEMO();
        if (IiiiiiiiIIIII == null) {
            return;
        }
        if (id == 95) {
            this.iIiIiiiiIIiIi("\u7269\u7406\u7cfb");
            return;
        }
        if (id == 96) {
            this.iIiIiiiiIIiIi("\u6cd5\u672f\u7cfb");
            return;
        }
        if (id == 97) {
            this.iIiIiiiiIIiIi("\u8f85\u52a9\u7cfb");
            return;
        }
        if (id == 91) {
            iIiIiiiiIiIII IiiiiiiiIIIII2 = (iIiIiiiiIiIII)this.ALLATORIxDEMO().iiiIiiiiiiIIi(116);
            IiiiiiiiIIIII2.ALLATORIxDEMO(IiiiiiiiIIIII.getSid());
            return;
        }
        if (id == 92) {
            int IiiiiiiiIIIII3 = IiiiiiiiIIIII.getLxValue();
            int IiiiiiiiIIIII4 = IiiiiiiiIIIII.getLxGZ();
            if (IiiiiiiiIIIII3 == 0) {
                return;
            }
            long IiiiiiiiIIIII5 = (this.ALLATORIxDEMO().ALLATORIxDEMO(2, 12) ? 1000000L : 10000000L) * (long)IiiiiiiiIIIII4;
            this.iiIIiiiiIiIIi.ALLATORIxDEMO(new ConfirmBean(13, "LXXD|" + IiiiiiiiIIIII.getSid(), "#Y\u4f60\u786e\u5b9a\u8981\u82b1\u8d39#R" + IiiiiiiiIIIII5 / 10000L + "W#Y\u5927\u8bdd\u5e01\u91cd\u6d17\u7075\u7280\u6280\u80fd"));
            return;
        }
        if (id == 93) {
            String IiiiiiiiIIIII6 = IiiiiiiiIIIII.getLx();
            if (IiiiiiiiIIIII6 != null && IiiiiiiiIIIII6.indexOf("\u7cfb") != -1) {
                this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u9700\u8981\u6d17\u70b9\u540e\u624d\u80fd\u91cd\u65b0\u9009\u62e9\u5929\u8d4b\u7cfb");
                return;
            }
            this.iIiIiiiiIIiIi("");
            return;
        }
        if (id != 94) return;
        String IiiiiiiiIIIII7 = this.ALLATORIxDEMO();
        if (IiiiiiiiIIIII7 == null) {
            this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u8bf7\u4fee\u6539\u70b9\u6570");
            return;
        }
        String IiiiiiiiIIIII8 = Agreement.getSendTextAES((String)"userpet", (String)("LXJN|" + IiiiiiiiIIIII.getSid() + "|" + IiiiiiiiIIIII7));
        this.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII8);
    }

    public iIIIIiiiIiiIi ALLATORIxDEMO(int id) {
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iiiiIiiiIIiii.size()) {
            iIIIIiiiIiiIi IiiiiiiiIIIII2 = this.iiiiIiiiIIiii.get(IiiiiiiiIIIII);
            if (iIIIIiiiIiiIi.ALLATORIxDEMO((iIIIIiiiIiiIi)IiiiiiiiIIIII2) == id) {
                return IiiiiiiiIIIII2;
            }
            ++IiiiiiiiIIIII;
        }
        return null;
    }

    static /* synthetic */ Image ALLATORIxDEMO(IIIiIiiiIiIII arg0) {
        return arg0.iIIiIiiiiiiIi;
    }

    public RoleSummoning ALLATORIxDEMO() {
        return this.ALLATORIxDEMO().getPet(this.iiIIIiiiiiiiI);
    }

    public IIIiIiiiIiIII(GameView gameView) {
        super(115, 2, IiiiIiiiiIiIi.iIIIIiiiiiIIi, gameView);
        this.IiIiiiiiIIIII = IIIIIiiiIiiII.iiiIiiiiiiIIi((String)"sc/b/S39.png");
        this.iIIiIiiiiiiIi = IIIIIiiiIiiII.iiiIiiiiiiIIi((String)"sc/b/\u8499\u7248w34,h34.png");
        this.IIIIiiiiiiiII = IIIIIiiiIiiII.iiiIiiiiiiIIi((String)"sc/b/78_png.xy2uiimg.btn_plock.png");
        this.ALLATORIxDEMO(-1, 0, 644, 405, IiiiIiiiiIiIi.iiIIIiiiiiiiI);
        this.IiiiiiiiIIIII = new JLabel("0");
        this.IiiiiiiiIIIII.setBounds(132, 368, 40, 16);
        this.IiiiiiiiIIIII.setFont(iiIIiiiiIiiII.iIiIiiiiIiiii);
        this.IiiiiiiiIIIII.setForeground(Color.white);
        this.add(this.IiiiiiiiIIIII);
        this.iiiIiiiiiiiIi = new IiIiIiiiiIIiI("sc/e/7.png", 1, 91, iiIIiiiiIiiII.iiiiIiiiIiiII, iiIIiiiiIiiII.IIiiiiiiIiiII, "\u5151\u6362", (IiiiIiiiiIiIi)this);
        this.iiIiIiiiiIIIi = new IiIiIiiiiIIiI("sc/e/7.png", 1, 92, iiIIiiiiIiiII.iiiiIiiiIiiII, iiIIiiiiIiiII.IIiiiiiiIiiII, "\u6d17\u70b9", (IiiiIiiiiIiIi)this);
        this.iiiIiiiiiiiIi.setBounds(190, 365, 68, 26);
        this.iiIiIiiiiIIIi.setBounds(265, 365, 68, 26);
        this.add((Component)this.iiiIiiiiiiiIi);
        this.add((Component)this.iiIiIiiiiIIIi);
        this.IiiIiiiiiiIiI();
        this.iiiIiiiiiiIIi();
    }

    /*
     * Unable to fully structure code
     */
    public String ALLATORIxDEMO(Skill skill, iIIIIiiiIiiIi view) {
        IiiiiiiiIIIII = new StringBuffer();
        IiiiiiiiIIIII.append("#cffffff\u3010\u7b49\u7ea7\u3011\t");
        IiiiiiiiIIIII.append(iIIIIiiiIiiIi.iIiIiiiiIIiii((iIIIIiiiIiiIi)view));
        IiiiiiiiIIIII.append("/");
        IiiiiiiiIIIII.append(iIIIIiiiIiiIi.IiiIiiiiiiIiI((iIIIIiiiIiiIi)view));
        IiiiiiiiIIIII.append("#r\u3010\u6280\u80fd\u7c7b\u522b\u3011\t");
        IiiiiiiiIIIII.append("\u88ab\u52a8");
        IiiiiiiiIIIII.append("#r#G");
        IiiiiiiiIIIII.append(IIIiIiiiIiIII.ALLATORIxDEMO(skill, iIIIIiiiIiiIi.iIiIiiiiIIiii((iIIIIiiiIiiIi)view)));
        IiiiiiiiIIIII.append("#r#W\u5b66\u4e60\u6761\u4ef6");
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < iIIIIiiiIiiIi.ALLATORIxDEMO((iIIIIiiiIiiIi)view).getList().size()) {
            block8: {
                block10: {
                    block9: {
                        block7: {
                            IiiiiiiiIIIII = (TYC)iIIIIiiiIiiIi.ALLATORIxDEMO((iIIIIiiiIiiIi)view).getList().get(IiiiiiiiIIIII);
                            if (IiiiiiiiIIIII.getType() != 2) break block7;
                            IiiiiiiiIIIII = IiiiiiiiIIIII.getVs();
                            var7_9 = Math.min(iIIIIiiiIiiIi.iIiIiiiiIIiii((iIIIIiiiIiiIi)view), IiiiiiiiIIIII.length - 1);
                            IiiiiiiiIIIII.append("#r#Y\u9700\u5df2\u5206\u914d\u70b9\u6570#R" + IiiiiiiiIIIII[IiiiiiiiIIIII] + "#Y\u70b9");
                            break block8;
                        }
                        if (IiiiiiiiIIIII.getType() != 4) break block9;
                        IiiiiiiiIIIII.append("#r#Y\u53ec\u5524\u517d\u8981\u8fbe\u5230" + (IiiiiiiiIIIII.getV1() == 4 ? "\u70b9\u5316" : String.valueOf(IiiiiiiiIIIII.getV1()) + "\u8f6c") + IiiiiiiiIIIII.getV2() + "\u7ea7");
                        break block8;
                    }
                    if (IiiiiiiiIIIII.getType() != 5) break block10;
                    IiiiiiiiIIIII.append("#r\u4e0e#R");
                    IiiiiiiiIIIII = false;
                    IiiiiiiiIIIII = 0;
                    if (true) ** GOTO lbl56
                }
                if (IiiiiiiiIIIII.getType() != 6) break block8;
                IiiiiiiiIIIII.append("#r\u53ef\u540c\u65f6\u4fee\u70bc#R");
                IiiiiiiiIIIII = 0;
                if (true) ** GOTO lbl68
                do {
                    if (IiiiiiiiIIIII.getVs()[IiiiiiiiIIIII] != iIIIIiiiIiiIi.ALLATORIxDEMO((iIIIIiiiIiiIi)view) && (IiiiiiiiIIIII = this.ALLATORIxDEMO().iIiIiiiiIIiii(String.valueOf(IiiiiiiiIIIII.getVs()[IiiiiiiiIIIII]))) != null) {
                        if (!IiiiiiiiIIIII) {
                            IiiiiiiiIIIII.append("\u3001");
                        }
                        IiiiiiiiIIIII.append(IiiiiiiiIIIII.getSkillname());
                        IiiiiiiiIIIII = true;
                    }
                    ++IiiiiiiiIIIII;
lbl56:
                    // 2 sources

                } while (IiiiiiiiIIIII < IiiiiiiiIIIII.getVs().length);
                IiiiiiiiIIIII.append("#Y\u4e92\u65a5");
                break block8;
                do {
                    if ((IiiiiiiiIIIII = this.ALLATORIxDEMO().iIiIiiiiIIiii(String.valueOf(IiiiiiiiIIIII.getVs()[IiiiiiiiIIIII]))) != null) {
                        if (IiiiiiiiIIIII != 0) {
                            IiiiiiiiIIIII.append("\u3001");
                        }
                        IiiiiiiiIIIII.append(IiiiiiiiIIIII.getSkillname());
                    }
                    ++IiiiiiiiIIIII;
lbl68:
                    // 2 sources

                } while (IiiiiiiiIIIII < IiiiiiiiIIIII.getVs().length);
                IiiiiiiiIIIII.append("#Y\u4e2d\u7684#R");
                IiiiiiiiIIIII.append(IiiiiiiiIIIII.getV1());
                IiiiiiiiIIIII.append("#Y\u79cd\u6280\u80fd");
            }
            ++IiiiiiiiIIIII;
        }
        return IiiiiiiiIIIII.toString();
    }

    public TYC ALLATORIxDEMO(List<TYC> list, int wh) {
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < list.size()) {
            TYC IiiiiiiiIIIII2 = list.get(IiiiiiiiIIIII);
            if (IiiiiiiiIIIII2.getV1() == wh) {
                return IiiiiiiiIIIII2;
            }
            ++IiiiiiiiIIIII;
        }
        return null;
    }

    static /* synthetic */ JLabel ALLATORIxDEMO(IIIiIiiiIiIII arg0) {
        return arg0.IiiiiiiiIIIII;
    }

    public static String ALLATORIxDEMO(int type, double value, double sv, int lvl) {
        value = type == 1 ? (value += sv * (double)lvl) : (type == 2 ? value / 6.0 * 5.0 + sv / 3.0 * 10.0 * (double)lvl : (type == 3 ? value / 10.0 * 9.0 + sv / 10.0 * 3.0 * (double)lvl : (type == 4 ? (value + sv * (double)lvl) * 2.5 : (type == 5 ? sv / 3.0 * 10.0 * (double)lvl : (type == 6 ? (value + sv * (double)lvl) * 10.0 : (type == 7 ? value * 10.0 + sv * 15.0 * (double)lvl : (type == 9 ? (double)(50 + 10 * lvl) : (type == 10 ? 0.1 + 0.035 * (double)lvl : (type == 11 ? (double)(20 + 1 * lvl) : (type == 12 ? (double)(40 + 1 * lvl) : (type == 13 ? 50.0 - 1.2 * (double)lvl : (type == 14 ? 20.0 - 0.5 * (double)lvl : (type == 15 ? 2.5 + 0.08 * (double)lvl : (type == 16 ? 28.0 + 2.4 * (double)lvl : (type == 17 ? (double)(10 + 10 * lvl) : (type == 18 ? (double)(20 + 10 * lvl) : (type == 19 ? 11.0 + 1.3 * (double)lvl : (type == 20 ? 28.0 + 2.4 * (double)lvl : (type == 21 ? 3.8 + 0.54 * (double)lvl : (type == 22 ? 11.0 + 0.31 * (double)lvl : (type == 23 ? 97.5 + 2.75 * (double)lvl : (type == 24 ? 13.5 + 0.75 * (double)lvl : (type == 25 ? 5.5 + 0.65 * (double)lvl : (type == 26 ? 3.0 + 0.4 * (double)lvl : (type == 27 ? (double)(15 + 5 * lvl) : (type == 28 ? value + sv * (double)lvl + 2.0 : (type == 29 ? value + sv * (double)lvl + 4.0 : (type == 30 ? (double)Math.min(lvl, 3) : (type == 31 ? (double)(9000 + 2500 * lvl) : (type == 32 ? (double)(4500 + 1250 * lvl) : (type == 33 ? (double)(40000 + 2000 * lvl) : (type == 34 ? (double)(60000 + 8000 * lvl) : (value += sv * (double)lvl)))))))))))))))))))))))))))))))));
        return "#R" + IIIiiiiiIiIiI.iIiIiiiiIIiii((double)value) + "#G";
    }
}
