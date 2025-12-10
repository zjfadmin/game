/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.w.IIIIIiiiIiIii
 *  com.xy.a.w.iiIIiiiiIiiII
 *  com.xy.bean.ConfirmBean
 *  com.xy.bean.PrivateData
 *  com.xy.formula.ExpUtil
 *  com.xy.formula.SkillUtil
 *  com.xy.game.RoleData
 *  com.xy.i.IIiIiiiiIiIII
 *  com.xy.q.IiIIIiiiiiiIi
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.readbean.TYCModel
 *  com.xy.socket.GameClient
 *  com.xy.socket.ParamTool
 *  com.xy.text.GameView
 *  com.xy.v.IiiiiiiiiIIII
 *  com.xy.v.iiiiiiiiIIIII
 *  com.xy.w.IIIiiiiiIiIiI
 */
package com.xy.a.w;

import com.xy.a.w.IIIIIiiiIiIii;
import com.xy.a.w.iiIIiiiiIiiII;
import com.xy.bean.ConfirmBean;
import com.xy.bean.PrivateData;
import com.xy.formula.ExpUtil;
import com.xy.formula.SkillUtil;
import com.xy.game.RoleData;
import com.xy.i.IIiIiiiiIiIII;
import com.xy.q.IiIIIiiiiiiIi;
import com.xy.q.IiiiIiiiiIiIi;
import com.xy.readbean.TYCModel;
import com.xy.socket.GameClient;
import com.xy.socket.ParamTool;
import com.xy.text.GameView;
import com.xy.v.IiiiiiiiiIIII;
import com.xy.v.iiiiiiiiIIIII;
import com.xy.w.IIIiiiiiIiIiI;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.MouseListener;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComponent;
import javax.swing.JLabel;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class iiIiIiiiiIiii
extends IiiiIiiiiIiIi {
    public int iIIIIiiiiiIIi;
    private IIiIiiiiIiIII IiiIIiiiiiiiI;
    private IIiIiiiiIiIII IIiiiiiiIiiII;
    private IiIIIiiiiiiIi IiiiIiiiIiIII;
    private IIIiiiiiIiIiI[] IIiiiiiiiIIIi;
    public int IIIiiiiiIIiII;
    private IIIiiiiiIiIiI iiIiiiiiiIIiI;
    public int iIiiIiiiIiIIi;
    private JLabel iiiiIiiiIIiii;
    private List<IIIIIiiiIiIii> iIIiIiiiiiiIi;
    private IIiIiiiiIiIII IIIIiiiiiiiII;
    private IIiIiiiiIiIII iiIIIiiiiiiiI;
    private IIiIiiiiIiIII IiIiiiiiIIIII;
    private JLabel iiIiIiiiiIIIi;
    private IIiIiiiiIiIII iiiiIiiiIiiII;
    public int iiiIiiiiiiiIi;
    public int iIiiIiiiiiiII;
    private IIIiiiiiIiIiI IIiiIiiiIIiIi;
    private IIiIiiiiIiIII iIiIiiiiIiIii;
    private IIiIiiiiIiIII IiIIIiiiiIiiI;
    public int iiIiiiiiiiIii;
    private boolean IiiiiiiiIIIII;
    public int ALLATORIxDEMO;

    public void IIIIIiiiiIIii() {
        this.iiIiIiiiiIIIi.setText(String.valueOf(this.IIIiiiiiIIiII - this.iIiiIiiiiiiII));
        for (IIIIIiiiIiIii IiiiiiiiIIIII : this.iIIiIiiiiiiIi) {
            if (IIIIIiiiIiIii.ALLATORIxDEMO((IIIIIiiiIiIii)IiiiiiiiIIIII) == null) continue;
            if (IIIIIiiiIiIii.ALLATORIxDEMO((IIIIIiiiIiIii)IiiiiiiiIIIII) >= 5) {
                IIIIIiiiIiIii.ALLATORIxDEMO((IIIIIiiiIiIii)IiiiiiiiIIIII, (boolean)false);
            } else {
                IIIIIiiiIiIii.ALLATORIxDEMO((IIIIIiiiIiIii)IiiiiiiiIIIII, (boolean)this.ALLATORIxDEMO(IiiiiiiiIIIII, IiiiiiiiIIIII, true));
            }
            IiiiiiiiIIIII.iiiiiiiiIIiii();
        }
    }

    public void iiiiiiiiIIiii() {
        IIIIIiiiIiIii IiiiiiiiIIIII4;
        if (this.iIiiIiiiIiIIi != 0) return;
        if (this.iIiiIiiiiiiII > this.IIIiiiiiIIiII) {
            return;
        }
        boolean IiiiiiiiIIIII2 = false;
        StringBuffer IiiiiiiiIIIII3 = new StringBuffer();
        IiiiiiiiIIIII3.append(this.ALLATORIxDEMO);
        for (IIIIIiiiIiIii IiiiiiiiIIIII4 : this.iIIiIiiiiiiIi) {
            if (IIIIIiiiIiIii.ALLATORIxDEMO((IIIIIiiiIiIii)IiiiiiiiIIIII4) == null || IIIIIiiiIiIii.ALLATORIxDEMO((IIIIIiiiIiIii)IiiiiiiiIIIII4) == 0) continue;
            int IiiiiiiiIIIII5 = 0;
            if (IIIIIiiiIiIii.ALLATORIxDEMO((IIIIIiiiIiIii)IiiiiiiiIIIII4).getType() == 0) {
                IiiiiiiiIIIII5 = 0;
            } else if (IIIIIiiiIiIii.ALLATORIxDEMO((IIIIIiiiIiIii)IiiiiiiiIIIII4).getType() == 1) {
                IiiiiiiiIIIII5 = (IIIIIiiiIiIii.ALLATORIxDEMO((IIIIIiiiIiIii)IiiiiiiiIIIII4).getKey() == this.iiiIiiiiiiiIi ? 1 : 2) << 9;
            } else if (IIIIIiiiIiIii.ALLATORIxDEMO((IIIIIiiiIiIii)IiiiiiiiIIIII4).getType() == 2) {
                IiiiiiiiIIIII5 = 1536;
            }
            IiiiiiiiIIIII5 |= IIIIIiiiIiIii.ALLATORIxDEMO((IIIIIiiiIiIii)IiiiiiiiIIIII4).getLvl() << 6;
            IiiiiiiiIIIII5 |= IIIIIiiiIiIii.ALLATORIxDEMO((IIIIIiiiIiIii)IiiiiiiiIIIII4).getIndex() << 3;
            IiiiiiiiIIIII3.append("#");
            IiiiiiiiIIIII3.append(IiiiiiiiIIIII5 |= IIIIIiiiIiIii.ALLATORIxDEMO((IIIIIiiiIiIii)IiiiiiiiIIIII4));
            if (IIIIIiiiIiIii.ALLATORIxDEMO((IIIIIiiiIiIii)IiiiiiiiIIIII4) <= IIIIIiiiIiIii.iIiIiiiiIIiii((IIIIIiiiIiIii)IiiiiiiiIIIII4)) continue;
            IiiiiiiiIIIII2 = true;
        }
        if (!IiiiiiiiIIIII2) {
            this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u6ca1\u6709\u4fee\u6539\u7684\u75d5\u8ff9");
            return;
        }
        IiiiiiiiIIIII4 = this.ALLATORIxDEMO();
        IiiiiiiiIIIII4.getPrivateData().setSkills("N", IiiiiiiiIIIII3.toString());
        IiiiiiiiIIIII4.getRoleProperty().iiiiiiiiIIiii();
        ParamTool.ALLATORIxDEMO((PrivateData)IiiiiiiiIIIII4.getPrivateData(), (GameClient)this.ALLATORIxDEMO());
        IiiiiiiiIIIII4.getRoleProperty().ALLATORIxDEMO();
        this.iIiIiiiiIIiii(0);
        this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u5df2\u4fdd\u5b58");
    }

    /*
     * WARNING - void declaration
     */
    public void ALLATORIxDEMO(int n, String[] stringArray) {
        void datas;
        void typeSkill;
        this.ALLATORIxDEMO = typeSkill;
        this.IiiiiiiiIIIII = datas != null;
        this.iIiiIiiiiiiII = 0;
        this.iiiIiiiiiiiIi = SkillUtil.getSmIndex((int)this.iiIiiiiiiiIii, (int)(this.ALLATORIxDEMO == 2 ? 1 : 0));
        this.iIIIIiiiiiIIi = SkillUtil.getSmIndex((int)this.iiIiiiiiiiIii, (int)(this.ALLATORIxDEMO == 0 ? 1 : 2));
        int IiiiiiiiIIIII = SkillUtil.getSmIndex((int)this.iiIiiiiiiiIii, (int)(this.ALLATORIxDEMO == 0 ? 2 : (this.ALLATORIxDEMO == 1 ? 1 : 0)));
        this.IIiiiiiiiIIIi[8].iIiIiiiiIIiii("sc/c/" + (112 + this.iiiIiiiiiiiIi));
        this.IIiiiiiiiIIIi[9].iIiIiiiiIIiii("sc/c/" + (112 + this.iIIIIiiiiiIIi));
        this.IIiiiiiiiIIIi[10].iIiIiiiiIIiii("sc/c/" + (132 + this.iiiIiiiiiiiIi));
        this.IIiiiiiiiIIIi[11].iIiIiiiiIIiii("sc/c/" + (132 + this.iIIIIiiiiiIIi));
        this.IIiiiiiiiIIIi[12].iIiIiiiiIIiii("sc/c/" + (112 + IiiiiiiiIIIII));
        IiiiiiiiiIIII IiiiiiiiIIIII2 = this.ALLATORIxDEMO();
        int IiiiiiiiIIIII3 = 0;
        List IiiiiiiiIIIII4 = IiiiiiiiIIIII2.ALLATORIxDEMO((long)this.iiIiiiiiiiIii);
        IiiiiiiiIIIII3 = this.ALLATORIxDEMO(IiiiiiiiIIIII3, 0, IiiiiiiiIIIII4);
        IiiiiiiiIIIII4 = IiiiiiiiIIIII2.ALLATORIxDEMO(0x100000000L | (long)this.iiiIiiiiiiiIi);
        IiiiiiiiIIIII3 = this.ALLATORIxDEMO(IiiiiiiiIIIII3, 1, IiiiiiiiIIIII4);
        IiiiiiiiIIIII4 = IiiiiiiiIIIII2.ALLATORIxDEMO(0x100000000L | (long)this.iIIIIiiiiiIIi);
        IiiiiiiiIIIII3 = this.ALLATORIxDEMO(IiiiiiiiIIIII3, 2, IiiiiiiiIIIII4);
        IiiiiiiiIIIII4 = IiiiiiiiIIIII2.ALLATORIxDEMO(0x200000000L | (long)(this.iIIIIiiiiiIIi > this.iiiIiiiiiiiIi ? this.iIIIIiiiiiIIi << 8 | this.iiiIiiiiiiiIi : this.iiiIiiiiiiiIi << 8 | this.iIIIIiiiiiIIi));
        IiiiiiiiIIIII3 = this.ALLATORIxDEMO(IiiiiiiiIIIII3, 3, IiiiiiiiIIIII4);
        this.IiiIiiiiiiIiI(IiiiiiiiIIIII3);
        this.ALLATORIxDEMO((String[])datas);
        this.IIIIIiiiiIIii();
    }

    public int ALLATORIxDEMO(int index, int type, List<TYCModel> list) {
        int IiiiiiiiIIIII = -1;
        int IiiiiiiiIIIII2 = 0;
        for (TYCModel IiiiiiiiIIIII3 : list) {
            this.ALLATORIxDEMO(index).ALLATORIxDEMO(IiiiiiiiIIIII3);
            ++index;
            if (IiiiiiiiIIIII == -1 || IiiiiiiiIIIII != IiiiiiiiIIIII3.getLvl()) {
                if (IiiiiiiiIIIII != -1) {
                    this.iiiIiiiiiiIIi(IiiiiiiiIIIII2, index - 1, IiiiiiiiIIIII, type);
                }
                IiiiiiiiIIIII = IiiiiiiiIIIII3.getLvl();
                IiiiiiiiIIIII2 = 1;
                continue;
            }
            ++IiiiiiiiIIIII2;
        }
        this.iiiIiiiiiiIIi(IiiiiiiiIIIII2, index, IiiiiiiiIIIII, type);
        return index;
    }

    public void IIIIIiiiiIIii(int tycTotal) {
        this.IIIiiiiiIIiII = tycTotal;
        this.iiIiIiiiiIIIi.setText(String.valueOf(tycTotal - this.iIiiIiiiiiiII));
    }

    public boolean iIiIiiiiIIiii() {
        return this.IiiiiiiiIIIII;
    }

    public void iiiiiiiiIIiii(int typeBtn) {
        if (typeBtn == 0) {
            this.IIiiIiiiIIiIi.setBounds(117, 517, 98, 22);
            this.iiIiIiiiiIIIi.setBounds(173, 517, 60, 22);
            this.IIiiiiiiIiiII.setBounds(216, 519, 34, 18);
            this.iiiiIiiiIiiII.setBounds(252, 519, 34, 18);
            this.iIiIiiiiIiIii.setBounds(52, 515, 59, 25);
            this.iiIiiiiiiIIiI.setVisible(false);
            this.iiiiIiiiIIiii.setVisible(false);
            this.IiiiIiiiIiIII.setVisible(false);
            this.iIiIiiiiIiIii.iiiIiiiiiiIIi(301);
            this.iIiIiiiiIiIii.setImage("sc/e/7.png");
            this.iIiIiiiiIiIii.setText("\u5207\u6362");
            this.IIiiiiiiIiiII.setBtn(1, "sc/e/6.png");
            this.IiiIIiiiiiiiI.setText("\u6a21\u62df\u52a0\u70b9");
            this.IiIIIiiiiIiiI.setBtn(1, "sc/e/26.png");
            return;
        }
        this.IIiiIiiiIIiIi.setBounds(52, 517, 98, 22);
        this.iiIiIiiiiIIIi.setBounds(108, 517, 60, 22);
        this.IIiiiiiiIiiII.setBounds(151, 519, 34, 18);
        this.iiiiIiiiIiiII.setBounds(187, 519, 34, 18);
        this.iIiIiiiiIiIii.setBounds(320, 518, 17, 17);
        this.iiIiiiiiiIIiI.setVisible(true);
        this.iiiiIiiiIIiii.setVisible(true);
        this.iIiIiiiiIiIii.iiiIiiiiiiIIi(302);
        this.iIiIiiiiIiIii.setText(null);
        this.iIiIiiiiIiIii.setImage("sc/c/5");
        this.IIiiiiiiIiiII.setBtn(-1, "sc/c/158");
        this.IiiIIiiiiiiiI.setText("\u53d6\u6d88\u6a21\u62df");
        this.IiIIIiiiiIiiI.setBtn(-1, "sc/c/159");
    }

    public void IiiIiiiiiiIiI(int index) {
        int IiiiiiiiIIIII = index;
        while (IiiiiiiiIIIII < this.iIIiIiiiiiiIi.size()) {
            IIIIIiiiIiIii iIIIIiiiIiIii = this.iIIiIiiiiiiIi.get(IiiiiiiiIIIII);
            ++IiiiiiiiIIIII;
            iIIIIiiiIiIii.ALLATORIxDEMO(null);
        }
    }

    /*
     * WARNING - void declaration
     */
    public void iIiIiiiiIIiIi(int n) {
        void select;
        this.iiiIiiiiiiIIi((int)select);
        this.ALLATORIxDEMO(0, null);
        this.iiiiIiiiIIiii.setText((String)this.IiiiIiiiIiIII.ALLATORIxDEMO().get((int)(select - true)));
        this.IiiiIiiiIiIII.setVisible(false);
    }

    static /* synthetic */ IiIIIiiiiiiIi ALLATORIxDEMO(iiIiIiiiiIiii arg0) {
        return arg0.IiiiIiiiIiIII;
    }

    /*
     * WARNING - void declaration
     */
    public void iiiIiiiiiiIIi(int num, int index, int lvl, int type) {
        int IiiiiiiiIIIII = 0;
        int IiiiiiiiIIIII2 = 0;
        if (type == 0) {
            IiiiiiiiIIIII = 400 - num * 42 / 2;
            IiiiiiiiIIIII2 = 76;
        } else if (type == 1) {
            IiiiiiiiIIIII = lvl == 2 || lvl == 4 ? 81 : (lvl == 3 ? 66 : 126);
            IiiiiiiiIIIII2 = 116 + lvl * 54;
        } else if (type == 2) {
            IiiiiiiiIIIII = lvl == 2 || lvl == 4 ? 81 : (lvl == 3 ? 66 : 126);
            IiiiiiiiIIIII = 795 - IiiiiiiiIIIII - num * 42;
            IiiiiiiiIIIII2 = 116 + lvl * 54;
        } else if (type == 3) {
            IiiiiiiiIIIII = 400 - num * 42 / 2;
            IiiiiiiiIIIII2 = 116 + lvl * 54;
        }
        int IiiiiiiiIIIII3 = index - num;
        while (IiiiiiiiIIIII3 < index) {
            void IiiiiiiiIIIII4;
            IIIIIiiiIiIii iIIIIiiiIiIii = this.ALLATORIxDEMO(IiiiiiiiIIIII3);
            ++IiiiiiiiIIIII3;
            iIIIIiiiIiIii.setBounds(IiiiiiiiIIIII + IIIIIiiiIiIii.ALLATORIxDEMO((IIIIIiiiIiIii)IiiiiiiiIIIII4).getIndex() * 42, IiiiiiiiIIIII2, 38, 38);
        }
    }

    static /* synthetic */ List ALLATORIxDEMO(iiIiIiiiiIiii arg0) {
        return arg0.iIIiIiiiiiiIi;
    }

    public IIIIIiiiIiIii ALLATORIxDEMO(int type, int key, int lvl, int index) {
        for (IIIIIiiiIiIii IiiiiiiiIIIII : this.iIIiIiiiiiiIi) {
            if (!IiiiiiiiIIIII.isVisible() || IIIIIiiiIiIii.ALLATORIxDEMO((IIIIIiiiIiIii)IiiiiiiiIIIII).getType() != type || IIIIIiiiIiIii.ALLATORIxDEMO((IIIIIiiiIiIii)IiiiiiiiIIIII).getKey() != key || IIIIIiiiIiIii.ALLATORIxDEMO((IIIIIiiiIiIii)IiiiiiiiIIIII).getLvl() != lvl) continue;
            if (IIIIIiiiIiIii.ALLATORIxDEMO((IIIIIiiiIiIii)IiiiiiiiIIIII).getIndex() == index) return IiiiiiiiIIIII;
        }
        return null;
    }

    public void IiiIiiiiiiIiI() {
        if (this.iIiiIiiiIiIIi != 1) return;
        this.ALLATORIxDEMO().setVisible(true);
    }

    public boolean ALLATORIxDEMO(IIIIIiiiIiIii view, IIIIIiiiIiIii changView, boolean is) {
        if (IIIIIiiiIiIii.ALLATORIxDEMO((IIIIIiiiIiIii)view).getType() == 0) return true;
        if (view == changView && !is) {
            return true;
        }
        if (IIIIIiiiIiIii.ALLATORIxDEMO((IIIIIiiiIiIii)view).getType() == 1) {
            int IiiiiiiiIIIII;
            int IiiiiiiiIIIII2 = IIIIIiiiIiIii.ALLATORIxDEMO((IIIIIiiiIiIii)view).getLvl() == 1 ? 20 : 5;
            int IiiiiiiiIIIII3 = this.ALLATORIxDEMO(0, IIIIIiiiIiIii.ALLATORIxDEMO((IIIIIiiiIiIii)view).getKey(), IIIIIiiiIiIii.ALLATORIxDEMO((IIIIIiiiIiIii)view).getLvl() - 1, null, changView, is);
            if (IiiiiiiiIIIII3 < IiiiiiiiIIIII2) {
                return false;
            }
            IiiiiiiiIIIII3 = this.ALLATORIxDEMO(0, IIIIIiiiIiIii.ALLATORIxDEMO((IIIIIiiiIiIii)view).getKey(), IIIIIiiiIiIii.ALLATORIxDEMO((IIIIIiiiIiIii)view).getLvl(), null, changView, is);
            if (IiiiiiiiIIIII3 > 10) {
                return false;
            }
            if (IIIIIiiiIiIii.ALLATORIxDEMO((IIIIIiiiIiIii)view).getLvl() > 1 && IiiiiiiiIIIII3 > (IiiiiiiiIIIII2 = this.ALLATORIxDEMO(0, IIIIIiiiIiIii.ALLATORIxDEMO((IIIIIiiiIiIii)view).getKey(), IIIIIiiiIiIii.ALLATORIxDEMO((IIIIIiiiIiIii)view).getLvl() - 1, null, changView, is))) {
                return false;
            }
            if (IIIIIiiiIiIii.ALLATORIxDEMO((IIIIIiiiIiIii)view).getLvl() == 5) {
                IiiiiiiiIIIII = IIIIIiiiIiIii.ALLATORIxDEMO((IIIIIiiiIiIii)view);
                if (view == changView) {
                    IiiiiiiiIIIII += is ? 1 : -1;
                }
                IiiiiiiiIIIII2 = IiiiiiiiIIIII == 0 ? 20 : (IiiiiiiiIIIII == 1 ? 21 : (IiiiiiiiIIIII == 2 ? 26 : (IiiiiiiiIIIII == 3 ? 31 : (IiiiiiiiIIIII == 4 ? 36 : 40))));
                IiiiiiiiIIIII3 = this.ALLATORIxDEMO(1, IIIIIiiiIiIii.ALLATORIxDEMO((IIIIIiiiIiIii)view).getKey(), IIIIIiiiIiIii.ALLATORIxDEMO((IIIIIiiiIiIii)view).getLvl(), null, changView, is);
                if (IiiiiiiiIIIII3 < IiiiiiiiIIIII2) {
                    return false;
                }
            }
            if (IIIIIiiiIiIii.ALLATORIxDEMO((IIIIIiiiIiIii)view).getLvl() == 5 || IIIIIiiiIiIii.ALLATORIxDEMO((IIIIIiiiIiIii)view).getLvl() == 6) {
                if (IIIIIiiiIiIii.ALLATORIxDEMO((IIIIIiiiIiIii)view).getLvl() == 5) {
                    IiiiiiiiIIIII2 = this.ALLATORIxDEMO(0, IIIIIiiiIiIii.ALLATORIxDEMO((IIIIIiiiIiIii)view).getKey() == this.iiiIiiiiiiiIi ? this.iIIIIiiiiiIIi : this.iiiIiiiiiiiIi, 5, null, changView, is);
                    if (IiiiiiiiIIIII2 > 0) {
                        IiiiiiiiIIIII = IIIIIiiiIiIii.ALLATORIxDEMO((IIIIIiiiIiIii)view);
                        if (view == changView) {
                            IiiiiiiiIIIII += is ? 1 : -1;
                        }
                        IiiiiiiiIIIII2 = IiiiiiiiIIIII == 0 ? 119 : 120;
                    } else {
                        IiiiiiiiIIIII2 = 0;
                    }
                } else {
                    IiiiiiiiIIIII2 = 80;
                }
                IiiiiiiiIIIII3 = this.ALLATORIxDEMO(2, 0, 0, null, changView, is);
                if (IiiiiiiiIIIII3 < IiiiiiiiIIIII2) {
                    return false;
                }
            }
            if (IIIIIiiiIiIii.ALLATORIxDEMO((IIIIIiiiIiIii)view).getLvl() == 5 && this.ALLATORIxDEMO(0, IIIIIiiiIiIii.ALLATORIxDEMO((IIIIIiiiIiIii)view).getKey(), 5, view, changView, is) > 0) {
                return false;
            }
            if (IIIIIiiiIiIii.ALLATORIxDEMO((IIIIIiiiIiIii)view).getLvl() != 6) return true;
            if (this.ALLATORIxDEMO(3, IIIIIiiiIiIii.ALLATORIxDEMO((IIIIIiiiIiIii)view).getKey(), 5, view, changView, is) >= 5) return true;
            return false;
        }
        if (IIIIIiiiIiIii.ALLATORIxDEMO((IIIIIiiiIiIii)view).getType() != 2) return true;
        if (this.ALLATORIxDEMO(0, this.iiiIiiiiiiiIi, IIIIIiiiIiIii.ALLATORIxDEMO((IIIIIiiiIiIii)view).getLvl(), null, changView, is) < 5) {
            return false;
        }
        if (this.ALLATORIxDEMO(0, this.iIIIIiiiiiIIi, IIIIIiiiIiIii.ALLATORIxDEMO((IIIIIiiiIiIii)view).getLvl(), null, changView, is) < 5) {
            return false;
        }
        if (this.ALLATORIxDEMO(0, 0, IIIIIiiiIiIii.ALLATORIxDEMO((IIIIIiiiIiIii)view).getLvl(), view, changView, is) <= 0) return true;
        return false;
    }

    public void ALLATORIxDEMO(IIIIIiiiIiIii view, boolean is) {
        int IiiiiiiiIIIII = IIIIIiiiIiIii.ALLATORIxDEMO((IIIIIiiiIiIii)view) + (is ? 1 : -1);
        if (IiiiiiiiIIIII < IIIIIiiiIiIii.iIiIiiiiIIiii((IIIIIiiiIiIii)view)) return;
        if (IiiiiiiiIIIII > 5) return;
        if (this.iIiiIiiiiiiII + (is ? 1 : -1) > this.IIIiiiiiIIiII) {
            return;
        }
        for (IIIIIiiiIiIii IiiiiiiiIIIII2 : this.iIIiIiiiiiiIi) {
            if (IIIIIiiiIiIii.ALLATORIxDEMO((IIIIIiiiIiIii)IiiiiiiiIIIII2) == null || IIIIIiiiIiIii.ALLATORIxDEMO((IIIIIiiiIiIii)IiiiiiiiIIIII2) == 0 || this.ALLATORIxDEMO(IiiiiiiiIIIII2, view, is)) continue;
            return;
        }
        view.ALLATORIxDEMO(IiiiiiiiIIIII);
        this.iIiiIiiiiiiII += is ? 1 : -1;
        this.IIIIIiiiiIIii();
    }

    public JComponent ALLATORIxDEMO() {
        return this.IiiiIiiiIiIII;
    }

    public IIIIIiiiIiIii ALLATORIxDEMO(int index) {
        IIIIIiiiIiIii IiiiiiiiIIIII = index < this.iIIiIiiiiiiIi.size() ? this.iIIiIiiiiiiIi.get(index) : null;
        if (IiiiiiiiIIIII != null) return IiiiiiiiIIIII;
        IiiiiiiiIIIII = new IIIIIiiiIiIii(this);
        this.iIIiIiiiiiiIi.add(IiiiiiiiIIIII);
        this.add((Component)IiiiiiiiIIIII);
        return IiiiiiiiIIIII;
    }

    public void iiiIiiiiiiIIi(int sepciesId) {
        if (sepciesId == 0) {
            return;
        }
        int IiiiiiiiIIIII = (this.iiIiiiiiiiIii - 1) / 2;
        int IiiiiiiiIIIII2 = (sepciesId - 1) / 2;
        this.iiIiiiiiiiIii = sepciesId;
        if (IiiiiiiiIIIII2 == IiiiiiiiIIIII) {
            return;
        }
        this.iiiIiiiiiiIIi("sc/c/" + (88 + IiiiiiiiIIIII2));
        this.IiIiiiiiIIIII.setImage("sc/c/" + (93 + IiiiiiiiIIIII2 * 3));
        this.iiIIIiiiiiiiI.setImage("sc/c/" + (94 + IiiiiiiiIIIII2 * 3));
        this.IIIIiiiiiiiII.setImage("sc/c/" + (95 + IiiiiiiiIIIII2 * 3));
        this.IIiiiiiiiIIIi[6].iIiIiiiiIIiii("sc/c/" + (108 + IiiiiiiiIIIII2));
        this.IIiiiiiiiIIIi[7].iIiIiiiiIIiii("sc/c/" + (108 + IiiiiiiiIIIII2));
    }

    public int ALLATORIxDEMO(int type, int key, int lvl, IIIIIiiiIiIii tycView, IIIIIiiiIiIii changView, boolean is) {
        if (type == 2) {
            return this.iIiiIiiiiiiII + (changView == null ? 0 : (is ? 1 : -1));
        }
        int IiiiiiiiIIIII = 0;
        for (IIIIIiiiIiIii IiiiiiiiIIIII2 : this.iIIiIiiiiiiIi) {
            if (IIIIIiiiIiIii.ALLATORIxDEMO((IIIIIiiiIiIii)IiiiiiiiIIIII2) == null || IiiiiiiiIIIII2 == tycView) continue;
            int IiiiiiiiIIIII3 = IIIIIiiiIiIii.ALLATORIxDEMO((IIIIIiiiIiIii)IiiiiiiiIIIII2);
            if (IiiiiiiiIIIII2 == changView) {
                IiiiiiiiIIIII3 += is ? 1 : -1;
            }
            if (IiiiiiiiIIIII3 < 0) continue;
            if (type == 0) {
                if (IIIIIiiiIiIii.ALLATORIxDEMO((IIIIIiiiIiIii)IiiiiiiiIIIII2).getType() == 0) {
                    if (lvl != 0) continue;
                    IiiiiiiiIIIII += IiiiiiiiIIIII3;
                    continue;
                }
                if (IIIIIiiiIiIii.ALLATORIxDEMO((IIIIIiiiIiIii)IiiiiiiiIIIII2).getType() == 1) {
                    if (key != IIIIIiiiIiIii.ALLATORIxDEMO((IIIIIiiiIiIii)IiiiiiiiIIIII2).getKey() || lvl != IIIIIiiiIiIii.ALLATORIxDEMO((IIIIIiiiIiIii)IiiiiiiiIIIII2).getLvl()) continue;
                    IiiiiiiiIIIII += IiiiiiiiIIIII3;
                    continue;
                }
                if (IIIIIiiiIiIii.ALLATORIxDEMO((IIIIIiiiIiIii)IiiiiiiiIIIII2).getType() != 2 || key != 0 || lvl != IIIIIiiiIiIii.ALLATORIxDEMO((IIIIIiiiIiIii)IiiiiiiiIIIII2).getLvl()) continue;
                IiiiiiiiIIIII += IiiiiiiiIIIII3;
                continue;
            }
            if (type == 1) {
                if (IIIIIiiiIiIii.ALLATORIxDEMO((IIIIIiiiIiIii)IiiiiiiiIIIII2).getType() == 1) {
                    if (key != IIIIIiiiIiIii.ALLATORIxDEMO((IIIIIiiiIiIii)IiiiiiiiIIIII2).getKey()) continue;
                    IiiiiiiiIIIII += IiiiiiiiIIIII3;
                    continue;
                }
                if (IIIIIiiiIiIii.ALLATORIxDEMO((IIIIIiiiIiIii)IiiiiiiiIIIII2).getType() != 2 || key != 0) continue;
                IiiiiiiiIIIII += IiiiiiiiIIIII3;
                continue;
            }
            if (type != 3 || tycView == null || IIIIIiiiIiIii.ALLATORIxDEMO((IIIIIiiiIiIii)IiiiiiiiIIIII2).getType() != IIIIIiiiIiIii.ALLATORIxDEMO((IIIIIiiiIiIii)tycView).getType() || IIIIIiiiIiIii.ALLATORIxDEMO((IIIIIiiiIiIii)IiiiiiiiIIIII2).getKey() != IIIIIiiiIiIii.ALLATORIxDEMO((IIIIIiiiIiIii)tycView).getKey() || IIIIIiiiIiIii.ALLATORIxDEMO((IIIIIiiiIiIii)IiiiiiiiIIIII2).getLvl() + 1 != IIIIIiiiIiIii.ALLATORIxDEMO((IIIIIiiiIiIii)tycView).getLvl()) continue;
            if (IIIIIiiiIiIii.ALLATORIxDEMO((IIIIIiiiIiIii)IiiiiiiiIIIII2).getIndex() == IIIIIiiiIiIii.ALLATORIxDEMO((IIIIIiiiIiIii)tycView).getIndex()) return IiiiiiiiIIIII += IiiiiiiiIIIII3;
        }
        return IiiiiiiiIIIII;
    }

    public void iIiIiiiiIIiIi() {
        if (this.iIiiIiiiIiIIi == 1) {
            this.ALLATORIxDEMO(this.ALLATORIxDEMO, null);
            return;
        }
        if (this.iIiiIiiiiiiII == 0) {
            return;
        }
        long IiiiiiiiIIIII = this.iIiiIiiiiiiII * (this.ALLATORIxDEMO().ALLATORIxDEMO(2, 12) ? 200000 : 5000000);
        this.iiIIiiiiIiIIi.ALLATORIxDEMO(new ConfirmBean(15, String.valueOf(IiiiiiiiIIIII), "#W\u4f60\u786e\u5b9a\u8981\u82b1\u8d39#R" + IiiiiiiiIIIII / 10000L + "W#W\u94f6\u4e24,\u91cd\u7f6e\u5929\u6f14\u7b56\u52a0\u70b9\u5417?"));
    }

    /*
     * WARNING - void declaration
     */
    public void ALLATORIxDEMO(String[] datas) {
        if (datas == null) {
            return;
        }
        int IiiiiiiiIIIII = 0;
        int IiiiiiiiIIIII2 = 1;
        while (IiiiiiiiIIIII2 < datas.length) {
            void IiiiiiiiIIIII3;
            IiiiiiiiIIIII = Integer.parseInt(datas[IiiiiiiiIIIII2]);
            int IiiiiiiiIIIII4 = IiiiiiiiIIIII >> 9 & 7;
            int IiiiiiiiIIIII5 = 0;
            int IiiiiiiiIIIII6 = IiiiiiiiIIIII >> 6 & 7;
            int IiiiiiiiIIIII7 = IiiiiiiiIIIII >> 3 & 7;
            if (IiiiiiiiIIIII4 == 0) {
                IiiiiiiiIIIII4 = 0;
                IiiiiiiiIIIII5 = this.iiIiiiiiiiIii;
            } else if (IiiiiiiiIIIII4 == 1) {
                IiiiiiiiIIIII4 = 1;
                IiiiiiiiIIIII5 = this.iiiIiiiiiiiIi;
            } else if (IiiiiiiiIIIII4 == 2) {
                IiiiiiiiIIIII4 = 1;
                IiiiiiiiIIIII5 = this.iIIIIiiiiiIIi;
            } else {
                IiiiiiiiIIIII4 = 2;
                IiiiiiiiIIIII5 = this.iIIIIiiiiiIIi > this.iiiIiiiiiiiIi ? this.iIIIIiiiiiIIi << 8 | this.iiiIiiiiiiiIi : this.iiiIiiiiiiiIi << 8 | this.iIIIIiiiiiIIi;
            }
            IIIIIiiiIiIii iIIIIiiiIiIii = this.ALLATORIxDEMO(IiiiiiiiIIIII4, IiiiiiiiIIIII5, IiiiiiiiIIIII6, IiiiiiiiIIIII7);
            IiiiiiiiIIIII3.ALLATORIxDEMO(IiiiiiiiIIIII & 7);
            IIIIIiiiIiIii.ALLATORIxDEMO((IIIIIiiiIiIii)IiiiiiiiIIIII3, (int)IIIIIiiiIiIii.ALLATORIxDEMO((IIIIIiiiIiIii)IiiiiiiiIIIII3));
            ++IiiiiiiiIIIII2;
            this.iIiiIiiiiiiII += IIIIIiiiIiIii.ALLATORIxDEMO((IIIIIiiiIiIii)IiiiiiiiIIIII3);
        }
    }

    public int ALLATORIxDEMO(int type, int key, int lvl, IIIIIiiiIiIii tycView) {
        return this.ALLATORIxDEMO(type, key, lvl, tycView, null, true);
    }

    public void iIiIiiiiIIiii(int typeBtn) {
        if (typeBtn == -1) {
            int n = typeBtn = this.iIiiIiiiIiIIi == 0 ? 1 : 0;
        }
        if (this.iIiiIiiiIiIIi != typeBtn) {
            this.iiiiiiiiIIiii(typeBtn);
        }
        this.iIiiIiiiIiIIi = typeBtn;
        this.iIiiIiiiiiiII = 0;
        if (this.iIiiIiiiIiIIi != 0) {
            this.IIIIIiiiiIIii(120);
            this.iIiIiiiiIIiIi(1);
            return;
        }
        RoleData IiiiiiiiIIIII = this.ALLATORIxDEMO();
        this.IIIIIiiiiIIii(ExpUtil.getTSP((int)IiiiiiiiIIIII.getLoginResult().getExtraPointInt("T")));
        String[] IiiiiiiiIIIII2 = IiiiiiiiIIIII.getPrivateData().getSkill("N");
        this.iiiIiiiiiiIIi(SkillUtil.getSepciesIndex((BigDecimal)IiiiiiiiIIIII.getLoginResult().getSpecies_id()));
        this.ALLATORIxDEMO(IiiiiiiiIIIII2 != null ? Integer.parseInt(IiiiiiiiIIIII2[0]) : 0, IiiiiiiiIIIII2);
    }

    public iiIiIiiiiIiii(GameView gameView) {
        super(-1, -1, IiiiIiiiiIiIi.iIIiIiiiiiiIi, gameView);
        this.ALLATORIxDEMO(0, 0, 776, 560, IiiiIiiiiIiIi.iIIiIiiiiiiIi);
        this.ALLATORIxDEMO(new iiiiiiiiIIIII(48, 63, 31, 52));
        this.iIiiIiiiIiIIi = -1;
        String[] IiiiiiiiIIIII = new String[]{"\u7537\u4eba", "\u5973\u4eba", "\u7537\u9b54", "\u5973\u9b54", "\u7537\u4ed9", "\u5973\u4ed9", "\u7537\u9b3c", "\u5973\u9b3c", "\u7537\u9f99", "\u5973\u9f99"};
        this.IiiiIiiiIiIII = new IiIIIiiiiiiIi(64, 120, "sc/c/157", IiiiiiiiIIIII);
        this.add((Component)this.IiiiIiiiIiIII);
        this.IiiiIiiiIiIII.ALLATORIxDEMO().addMouseListener((MouseListener)new iiIIiiiiIiiII(this));
        this.iIiIiiiiIiIii = new IIiIiiiiIiIII("sc/e/7.png", 1, 301, com.xy.q.iiIIiiiiIiiII.iiiiIiiiIiiII, com.xy.q.iiIIiiiiIiiII.IIiiiiiiIiiII, "\u5207\u6362", (IiiiIiiiiIiIi)this);
        this.add((Component)this.iIiIiiiiIiIii);
        this.IIiiiiiiIiiII = new IIiIiiiiIiIII("sc/e/6.png", 1, 303, com.xy.q.iiIIiiiiIiiII.iiIiiiiiiIIiI, null, "\u5151\u6362", (IiiiIiiiiIiIi)this);
        this.IIiiiiiiIiiII.setOffsetTexts(com.xy.q.iiIIiiiiIiiII.IiIIIiiiIIiIi);
        this.add((Component)this.IIiiiiiiIiiII);
        this.iiiiIiiiIiiII = new IIiIiiiiIiIII("sc/e/6.png", 1, 304, com.xy.q.iiIIiiiiIiiII.iiIiiiiiiIIiI, null, "\u6d17\u70b9", (IiiiIiiiiIiIi)this);
        this.iiiiIiiiIiiII.setOffsetTexts(com.xy.q.iiIIiiiiIiiII.IiIIIiiiIIiIi);
        this.add((Component)this.iiiiIiiiIiiII);
        this.IiiIIiiiiiiiI = new IIiIiiiiIiIII("sc/e/26.png", 1, 305, com.xy.q.iiIIiiiiIiiII.iiiiIiiiIiiII, com.xy.q.iiIIiiiiIiiII.IIiiiiiiIiiII, "\u6a21\u62df\u52a0\u70b9", (IiiiIiiiiIiIi)this);
        this.add((Component)this.IiiIIiiiiiiiI);
        this.IiIIIiiiiIiiI = new IIiIiiiiIiIII("sc/e/26.png", 1, 306, com.xy.q.iiIIiiiiIiiII.iiiiIiiiIiiII, com.xy.q.iiIIiiiiIiiII.IIiiiiiiIiiII, "\u786e\u8ba4\u52a0\u70b9", (IiiiIiiiiIiIi)this);
        this.add((Component)this.IiIIIiiiiIiiI);
        this.iiIiIiiiiIIIi = new JLabel();
        this.iiIiIiiiiIIIi.setForeground(Color.white);
        this.iiIiIiiiiIIIi.setFont(com.xy.q.iiIIiiiiIiiII.iIiIIiiiiIIiI);
        this.add(this.iiIiIiiiiIIIi);
        this.IIiiIiiiIIiIi = new IIIiiiiiIiIiI("sc/c/155");
        this.add((Component)this.IIiiIiiiIIiIi);
        this.iiiiIiiiIIiii = new JLabel();
        this.iiiiIiiiIIiii.setForeground(Color.white);
        this.iiiiIiiiIIiii.setFont(com.xy.q.iiIIiiiiIiiII.iIiIIiiiiIIiI);
        this.add(this.iiiiIiiiIIiii);
        this.iiIiiiiiiIIiI = new IIIiiiiiIiIiI("sc/c/156");
        this.add((Component)this.iiIiiiiiiIIiI);
        this.IiiiIiiiIiIII.setBounds(272, 397, 64, 120);
        this.iiiiIiiiIIiii.setBounds(274, 517, 64, 20);
        this.iiIiiiiiiIIiI.setBounds(235, 517, 104, 20);
        this.IiiIIiiiiiiiI.setBounds(540, 515, 99, 25);
        this.IiIIIiiiiIiiI.setBounds(645, 515, 99, 25);
        this.IiIiiiiiIIIII = new IIiIiiiiIiIII(null, 1, 307, (IiiiIiiiiIiIi)this);
        this.iiIIIiiiiiiiI = new IIiIiiiiIiIII(null, 1, 308, (IiiiIiiiiIiIi)this);
        this.IIIIiiiiiiiII = new IIiIiiiiIiIII(null, -1, 309, (IiiiIiiiiIiIi)this);
        this.IiIiiiiiIIIII.setBounds(329, 372, 73, 92);
        this.iiIIIiiiiiiiI.setBounds(393, 372, 73, 92);
        this.IIIIiiiiiiiII.setBounds(350, 435, 99, 72);
        this.add((Component)this.IiIiiiiiIIIII);
        this.add((Component)this.iiIIIiiiiiiiI);
        this.add((Component)this.IIIIiiiiiiiII);
        this.IIiiiiiiiIIIi = new IIIiiiiiIiIiI[13];
        int IiiiiiiiIIIII2 = this.IIiiiiiiiIIIi.length - 1;
        while (IiiiiiiiIIIII2 >= 0) {
            this.IIiiiiiiiIIIi[IiiiiiiiIIIII2] = new IIIiiiiiIiIiI(IiiiiiiiIIIII2 < 6 ? "sc/c/154" : null);
            if (IiiiiiiiIIIII2 == 0) {
                this.IIiiiiiiiIIIi[IiiiiiiiIIIII2].setBounds(141, 425, 11, 14);
            } else if (IiiiiiiiIIIII2 == 1) {
                this.IIiiiiiiiIIIi[IiiiiiiiIIIII2].setBounds(183, 425, 11, 14);
            } else if (IiiiiiiiIIIII2 == 2) {
                this.IIiiiiiiiIIIi[IiiiiiiiIIIII2].setBounds(225, 425, 11, 14);
            } else if (IiiiiiiiIIIII2 == 3) {
                this.IIiiiiiiiIIIi[IiiiiiiiIIIII2].setBounds(557, 425, 11, 14);
            } else if (IiiiiiiiIIIII2 == 4) {
                this.IIiiiiiiiIIIi[IiiiiiiiIIIII2].setBounds(599, 425, 11, 14);
            } else if (IiiiiiiiIIIII2 == 5) {
                this.IIiiiiiiiIIIi[IiiiiiiiIIIII2].setBounds(641, 425, 11, 14);
            } else if (IiiiiiiiIIIII2 == 6) {
                this.IIiiiiiiiIIIi[IiiiiiiiIIIII2].setBounds(164, 110, 95, 60);
            } else if (IiiiiiiiIIIII2 == 7) {
                this.IIiiiiiiiIIIi[IiiiiiiiIIIII2].setBounds(537, 110, 95, 60);
            } else if (IiiiiiiiIIIII2 == 8) {
                this.IIiiiiiiiIIIi[IiiiiiiiIIIII2].setBounds(198, 123, 33, 33);
            } else if (IiiiiiiiIIIII2 == 9) {
                this.IIiiiiiiiIIIi[IiiiiiiiIIIII2].setBounds(570, 123, 33, 33);
            } else if (IiiiiiiiIIIII2 == 10) {
                this.IIiiiiiiiIIIi[IiiiiiiiIIIII2].setBounds(343, 445, 33, 33);
            } else if (IiiiiiiiIIIII2 == 11) {
                this.IIiiiiiiiIIIi[IiiiiiiiIIIII2].setBounds(420, 445, 33, 33);
            } else if (IiiiiiiiIIIII2 == 12) {
                this.IIiiiiiiiIIIi[IiiiiiiiIIIII2].setBounds(382, 384, 33, 33);
            }
            this.add((Component)this.IIiiiiiiiIIIi[IiiiiiiiIIIII2--]);
        }
        this.iIIiIiiiiiiIi = new ArrayList<IIIIIiiiIiIii>();
    }

    public void iiiIiiiiiiIIi() {
        this.iIiIiiiiIIiii(0);
    }

    public int iiiIiiiiiiIIi() {
        return this.ALLATORIxDEMO;
    }
}
