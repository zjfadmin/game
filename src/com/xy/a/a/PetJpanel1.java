/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.a.IiiIIiiiiIiii
 *  com.xy.a.a.MountJpanel2
 *  com.xy.entity.Mount
 *  com.xy.entity.RoleSummoning
 *  com.xy.formula.ExpUtil
 *  com.xy.game.RoleData
 *  com.xy.game.RolePet
 *  com.xy.i.IiIiIiiiiIIiI
 *  com.xy.q.IIIiIiiiIiIII
 *  com.xy.q.IiIIIiiiiIIiI
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.q.iIIiIiiiIiiIi
 *  com.xy.q.iIiIiiiiIiIII
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.socket.Agreement
 *  com.xy.text.GameView
 *  com.xy.v.iIiIIiiiIiiiI
 *  com.xy.v.iiIiiiiiIIiii
 *  com.xy.w.IIIIIiiiIiiII
 *  com.xy.w.IIIiiiiiIiIiI
 *  com.xy.w.IiiiIiiiiIiIi
 *  com.xy.w.iiiiiiiiiiIiI
 */
package com.xy.a.a;

import com.xy.a.a.IiiIIiiiiIiii;
import com.xy.a.a.MountJpanel2;
import com.xy.entity.Mount;
import com.xy.entity.RoleSummoning;
import com.xy.formula.ExpUtil;
import com.xy.game.RoleData;
import com.xy.game.RolePet;
import com.xy.i.IiIiIiiiiIIiI;
import com.xy.q.IIIiIiiiIiIII;
import com.xy.q.IiIIIiiiiIIiI;
import com.xy.q.IiiiIiiiiIiIi;
import com.xy.q.iIIiIiiiIiiIi;
import com.xy.q.iIiIiiiiIiIII;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import com.xy.v.iIiIIiiiIiiiI;
import com.xy.v.iiIiiiiiIIiii;
import com.xy.w.IIIIIiiiIiiII;
import com.xy.w.IIIiiiiiIiIiI;
import com.xy.w.iiiiiiiiiiIiI;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.event.ListSelectionListener;

public class PetJpanel1
extends IiiiIiiiiIiIi {
    private com.xy.w.IiiiIiiiiIiIi iiIiIiiiiIIIi;
    private JList<String> iiiiIiiiIiiII;
    private JScrollPane iiiIiiiiiiiIi;
    private IIIiIiiiIiIII iIiiIiiiiiiII;
    private IIIiiiiiIiIiI[] IIiiIiiiIIiIi;
    private JScrollPane iIiIiiiiIiIii;
    private iIIiIiiiIiiIi[] IiIIIiiiiIiiI;
    private IiIiIiiiiIIiI[] iiIiiiiiiiIii;
    private DefaultListModel<String> IiiiiiiiIIIII;
    private JLabel[] ALLATORIxDEMO;

    protected void paintChildren(Graphics g) {
        super.paintChildren(g);
        if (this.iiIiIiiiiIIIi == null) return;
        this.iiIiIiiiiIIIi.ALLATORIxDEMO(g, 110, 180, 0, iIiIIiiiIiiiI.ALLATORIxDEMO());
    }

    /*
     * Unable to fully structure code
     */
    public void iiiiiiiiIIiii() {
        block8: {
            IiiiiiiiIIIII = this.ALLATORIxDEMO();
            if (IiiiiiiiIIIII == null) {
                return;
            }
            IiiiiiiiIIIII = IiiiiiiiIIIII.getChoseMount();
            if (IiiiiiiiIIIII == null) {
                return;
            }
            IiiiiiiiIIIII = IiiiiiiiIIIII.getLoginResult().getMount_id();
            if (IiiiiiiiIIIII != IiiiiiiiIIIII.getMountid()) break block8;
            IiiiiiiiIIIII = 0;
            if (true) ** GOTO lbl20
        }
        IiiiiiiiIIIII = 0;
        if (true) ** GOTO lbl35
        do {
            if (IiiiiiiiIIIII == ((Mount)IiiiiiiiIIIII.mounts.get(IiiiiiiiIIIII)).getMountid()) {
                this.IiiiiiiiIIIII.set(IiiiiiiiIIIII, ((Mount)IiiiiiiiIIIII.mounts.get(IiiiiiiiIIIII)).getMountname());
                break;
            }
            ++IiiiiiiiIIIII;
lbl20:
            // 2 sources

        } while (IiiiiiiiIIIII < IiiiiiiiIIIII.mounts.size());
        IiiiiiiiIIIII.getLoginResult().setMount_id(Integer.valueOf(0));
        IiiiiiiiIIIII = Agreement.getSendTextAES((String)"rolechange", (String)"M");
        this.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII);
        this.iiIiiiiiiiIii[0].setText("\u9a91\u4e58");
        return;
        do {
            if (IiiiiiiiIIIII == ((Mount)IiiiiiiiIIIII.mounts.get(IiiiiiiiIIIII)).getMountid()) {
                this.IiiiiiiiIIIII.set(IiiiiiiiIIIII, ((Mount)IiiiiiiiIIIII.mounts.get(IiiiiiiiIIIII)).getMountname());
            } else if (IiiiiiiiIIIII.getMountid() == ((Mount)IiiiiiiiIIIII.mounts.get(IiiiiiiiIIIII)).getMountid()) {
                this.IiiiiiiiIIIII.set(IiiiiiiiIIIII, "(*)" + ((Mount)IiiiiiiiIIIII.mounts.get(IiiiiiiiIIIII)).getMountname());
            }
            ++IiiiiiiiIIIII;
lbl35:
            // 2 sources

        } while (IiiiiiiiIIIII < IiiiiiiiIIIII.mounts.size());
        IiiiiiiiIIIII.getLoginResult().setMount_id(IiiiiiiiIIIII.getMountid());
        IiiiiiiiIIIII = Agreement.getSendTextAES((String)"rolechange", (String)("M" + IiiiiiiiIIIII.getMountid() + "=" + IiiiiiiiIIIII.getMid()));
        this.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII);
        this.iiIiiiiiiiIii[0].setText("\u4f11\u606f");
    }

    public void iIiIiiiiIIiii() {
        this.IiiIiiiiiiIiI();
        super.iIiIiiiiIIiii();
    }

    public boolean ALLATORIxDEMO() {
        this.ALLATORIxDEMO(null);
        return super.ALLATORIxDEMO();
    }

    public void IiiIiiiiiiIiI() {
        RoleData IiiiiiiiIIIII = this.ALLATORIxDEMO();
        this.IiiiiiiiIIIII.removeAllElements();
        int IiiiiiiiIIIII2 = -1;
        int IiiiiiiiIIIII3 = IiiiiiiiIIIII.getLoginResult().getMount_id();
        int IiiiiiiiIIIII4 = 0;
        while (IiiiiiiiIIIII4 < IiiiiiiiIIIII.mounts.size()) {
            Mount IiiiiiiiIIIII5 = (Mount)IiiiiiiiIIIII.mounts.get(IiiiiiiiIIIII4);
            if (IiiiiiiiIIIII3 == IiiiiiiiIIIII5.getMountid()) {
                this.IiiiiiiiIIIII.addElement("(*)" + IiiiiiiiIIIII5.getMountname());
                IiiiiiiiIIIII2 = IiiiiiiiIIIII4;
            } else {
                this.IiiiiiiiIIIII.addElement(IiiiiiiiIIIII5.getMountname());
            }
            ++IiiiiiiiIIIII4;
        }
        this.iIiiIiiiiiiII.ALLATORIxDEMO();
        if (IiiiiiiiIIIII2 == -1 & IiiiiiiiIIIII.mounts.size() != 0) {
            IiiiiiiiIIIII2 = 0;
        }
        if (IiiiiiiiIIIII2 == -1) return;
        this.iiiiIiiiIiiII.setSelectedIndex(IiiiiiiiIIIII2);
    }

    public void iIiIiiiiIIiIi() {
        RoleSummoning IiiiiiiiIIIII;
        RoleData IiiiiiiiIIIII2 = this.ALLATORIxDEMO();
        if (IiiiiiiiIIIII2 == null) {
            return;
        }
        Mount IiiiiiiiIIIII3 = IiiiiiiiIIIII2.getChoseMount();
        if (IiiiiiiiIIIII3 == null) {
            return;
        }
        RolePet IiiiiiiiIIIII4 = IiiiiiiiIIIII2.getRolePet(this.iIiiIiiiiiiII.ALLATORIxDEMO());
        RoleSummoning roleSummoning = IiiiiiiiIIIII = IiiiiiiiIIIII4 != null ? IiiiiiiiIIIII4.getPet() : null;
        if (IiiiiiiiIIIII == null) {
            this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u8bf7\u9009\u62e9\u4f60\u8981\u7ba1\u5236\u7684\u53ec\u5524\u517d\uff01");
            return;
        }
        Mount IiiiiiiiIIIII5 = IiiiiiiiIIIII2.getPetMount(IiiiiiiiIIIII.getSid());
        if (IiiiiiiiIIIII5 != null && IiiiiiiiIIIII5.getMountid().intValue() != IiiiiiiiIIIII3.getMountid().intValue()) {
            this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u8be5\u53ec\u5524\u517d\u5df2\u88ab\u5176\u4ed6\u5750\u9a91\u7ba1\u5236");
            return;
        }
        int IiiiiiiiIIIII6 = 0;
        if (IiiiiiiiIIIII3.getSid() != null && IiiiiiiiIIIII.getSid().compareTo(IiiiiiiiIIIII3.getSid()) == 0) {
            IiiiiiiiIIIII6 = -1;
            IiiiiiiiIIIII3.setSid(null);
        } else if (IiiiiiiiIIIII3.getOthrersid() != null && IiiiiiiiIIIII.getSid().compareTo(IiiiiiiiIIIII3.getOthrersid()) == 0) {
            IiiiiiiiIIIII6 = -2;
            IiiiiiiiIIIII3.setOthrersid(null);
        } else if (IiiiiiiiIIIII3.getSid3() != null && IiiiiiiiIIIII.getSid().compareTo(IiiiiiiiIIIII3.getSid3()) == 0) {
            IiiiiiiiIIIII6 = -3;
            IiiiiiiiIIIII3.setSid3(null);
        } else if (IiiiiiiiIIIII3.getSid() == null) {
            IiiiiiiiIIIII3.setSid(IiiiiiiiIIIII.getSid());
            IiiiiiiiIIIII6 = 1;
        } else if (IiiiiiiiIIIII3.getOthrersid() == null) {
            IiiiiiiiIIIII3.setOthrersid(IiiiiiiiIIIII.getSid());
            IiiiiiiiIIIII6 = 2;
        } else if (IiiiiiiiIIIII3.getMountlvl() > 100 && IiiiiiiiIIIII3.getSid3() == null) {
            IiiiiiiiIIIII3.setSid3(IiiiiiiiIIIII.getSid());
            IiiiiiiiIIIII6 = 3;
        }
        if (IiiiiiiiIIIII6 == 0) {
            this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u76ee\u524d\u5750\u9a91\u7ba1\u5236\u4e0a\u9650!");
            return;
        }
        this.iIiiIiiiiiiII.ALLATORIxDEMO();
        String IiiiiiiiIIIII7 = Agreement.getSendTextAES((String)"changemountvalue", (String)iiIiiiiiIIiii.ALLATORIxDEMO().toJson(IiiiiiiiIIIII3));
        this.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII7);
    }

    public void iiiIiiiiiiIIi() {
        this.iiIiIiiiiIIIi = null;
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IiIIIiiiiIiiI.length) {
            this.IiIIIiiiiIiiI[IiiiiiiiIIIII++].setText(null);
        }
    }

    public PetJpanel1(GameView gameView) {
        super(7, 2, IiiiIiiiiIiIi.iIIIIiiiiiIIi, gameView);
        this.ALLATORIxDEMO(-2, 0, 412, 475, IiiiIiiiiIiIi.iiIIIiiiiiiiI);
        this.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/1.png", (int)68, (int)68, (int)68, (int)68, (boolean)false), "\u5750\u9a91");
        this.IiiiiiiiIIIII = new DefaultListModel();
        this.iiiiIiiiIiiII = new JList();
        this.iiiiIiiiIiiII.setOpaque(false);
        this.iiiiIiiiIiiII.setSelectionBackground(iIiIiiiiIiIII.iiiIiiiiiiiIi);
        this.iiiiIiiiIiiII.setSelectionForeground(Color.white);
        this.iiiiIiiiIiiII.setForeground(Color.white);
        this.iiiiIiiiIiiII.setFont(iiIIiiiiIiiII.iIiIIiiiiIIiI);
        this.iiiiIiiiIiiII.setBackground(iiIIiiiiIiiII.IIiIiiiiIIiII);
        this.iiiiIiiiIiiII.setModel(this.IiiiiiiiIIIII);
        this.iiiiIiiiIiiII.addListSelectionListener((ListSelectionListener)new IiiIIiiiiIiii(this));
        this.iiiIiiiiiiiIi = IiIIIiiiiIIiI.ALLATORIxDEMO((int)47, (int)266, (int)140, (int)159, this.iiiiIiiiIiiII, (int)20);
        this.add(this.iiiIiiiiiiiIi);
        JLabel IiiiiiiiIIIII = IiIIIiiiiIIiI.ALLATORIxDEMO((int)193, (int)245, (int)110, (int)20, (int)0, (Color)Color.white, (Font)iiIIiiiiIiiII.iiiiIiiiIiiII);
        JLabel IiiiiiiiIIIII2 = IiIIIiiiiIIiI.ALLATORIxDEMO((int)303, (int)245, (int)70, (int)20, (int)0, (Color)Color.white, (Font)iiIIiiiiIiiII.iiiiIiiiIiiII);
        IiiiiiiiIIIII.setText("\u53ec\u5524\u517d");
        IiiiiiiiIIIII2.setText("\u7ba1\u5236\u5750\u9a91");
        this.add(IiiiiiiiIIIII);
        this.add(IiiiiiiiIIIII2);
        this.iIiiIiiiiiiII = new IIIiIiiiIiIII((IiiiIiiiiIiIi)this);
        this.iIiiIiiiiiiII.setBounds(0, 0, 200, 20);
        this.iIiIiiiiIiIii = IiIIIiiiiIIiI.ALLATORIxDEMO((int)193, (int)265, (int)200, (int)160, (Component)this.iIiiIiiiiiiII, (int)20);
        this.add(this.iIiIiiiiIiIii);
        this.iiIiiiiiiiIii = new IiIiIiiiiIIiI[5];
        int IiiiiiiiIIIII3 = 0;
        while (IiiiiiiiIIIII3 < this.iiIiiiiiiiIii.length) {
            this.iiIiiiiiiiIii[IiiiiiiiIIIII3] = new IiIiIiiiiIIiI("sc/e/7.png", 1, 61 + IiiiiiiiIIIII3, iiIIiiiiIiiII.iiiiIiiiIiiII, iiIIiiiiIiiII.IIiiiiiiIiiII, "", (IiiiIiiiiIiIi)this);
            this.iiIiiiiiiiIii[IiiiiiiiIIIII3].setBounds(44 + 73 * IiiiiiiiIIIII3, 432, 59, 25);
            this.iiIiiiiiiiIii[IiiiiiiiIIIII3].setText(IiiiiiiiIIIII3 == 0 ? "\u4f11\u606f" : (IiiiiiiiIIIII3 == 1 ? "\u7ba1\u5236" : (IiiiiiiiIIIII3 == 2 ? "\u5582\u517b" : (IiiiiiiiIIIII3 == 3 ? "\u6280\u80fd" : (IiiiiiiiIIIII3 == 4 ? "\u653e\u751f" : "")))));
            this.add((Component)this.iiIiiiiiiiIii[IiiiiiiiIIIII3++]);
        }
        this.ALLATORIxDEMO = new JLabel[9];
        IiiiiiiiIIIII3 = 0;
        while (IiiiiiiiIIIII3 < this.ALLATORIxDEMO.length) {
            if (IiiiiiiiIIIII3 != 7 && IiiiiiiiIIIII3 != 8) {
                this.ALLATORIxDEMO[IiiiiiiiIIIII3] = IiIIIiiiiIIiI.ALLATORIxDEMO((int)198, (int)(28 + 34 * IiiiiiiiIIIII3), (int)36, (int)19, (int)0, (Color)(IiiiiiiiIIIII3 >= 6 && IiiiiiiiIIIII3 <= 8 ? Color.white : Color.black), (Font)iiIIiiiiIiiII.iiiiIiiiIiiII);
                this.ALLATORIxDEMO[IiiiiiiiIIIII3].setText(IiiiiiiiIIIII3 == 0 ? "\u7b49\u7ea7" : (IiiiiiiiIIIII3 == 1 ? "\u4f53\u529b" : (IiiiiiiiIIIII3 == 2 ? "\u7075\u6027" : (IiiiiiiiIIIII3 == 3 ? "\u529b\u91cf" : (IiiiiiiiIIIII3 == 4 ? "\u6839\u9aa8" : (IiiiiiiiIIIII3 == 5 ? "\u7ecf\u9a8c" : (IiiiiiiiIIIII3 == 6 ? "\u5750\u9a91\u5217\u8868" : (IiiiiiiiIIIII3 == 7 ? "\u53ec\u5524\u517d" : (IiiiiiiiIIIII3 == 8 ? "\u7ba1\u5236\u5750\u9a91" : "")))))))));
                if (IiiiiiiiIIIII3 == 6) {
                    this.ALLATORIxDEMO[IiiiiiiiIIIII3].setBounds(45, 245, 143, 21);
                } else if (IiiiiiiiIIIII3 == 7) {
                    this.ALLATORIxDEMO[IiiiiiiiIIIII3].setBounds(222, 245, 63, 21);
                } else if (IiiiiiiiIIIII3 == 8) {
                    this.ALLATORIxDEMO[IiiiiiiiIIIII3].setBounds(308, 245, 73, 21);
                }
                this.add(this.ALLATORIxDEMO[IiiiiiiiIIIII3]);
            }
            ++IiiiiiiiIIIII3;
        }
        this.IiIIIiiiiIiiI = new iIIiIiiiIiiIi[6];
        IiiiiiiiIIIII3 = 0;
        while (IiiiiiiiIIIII3 < this.IiIIIiiiiIiiI.length) {
            this.IiIIIiiiiIiiI[IiiiiiiiIIIII3] = IiIIIiiiiIIiI.ALLATORIxDEMO((int)243, (int)(28 + 34 * IiiiiiiiIIIII3), (int)138, (int)19, (int)10, (Color)Color.white, (Font)iiIIiiiiIiiII.iIIIiiiiIIIii);
            this.IiIIIiiiiIiiI[IiiiiiiiIIIII3].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/17.png", (int)6, (int)6, (int)6, (int)6, (boolean)false));
            this.add((Component)this.IiIIIiiiiIiiI[IiiiiiiiIIIII3++]);
        }
        this.IIiiIiiiIIiIi = new IIIiiiiiIiIiI[5];
        IiiiiiiiIIIII3 = 0;
        while (IiiiiiiiIIIII3 < this.IIiiIiiiIIiIi.length) {
            this.IIiiIiiiIIiIi[IiiiiiiiIIIII3] = new IIIiiiiiIiIiI();
            if (IiiiiiiiIIIII3 == 0) {
                this.IIiiIiiiIIiIi[IiiiiiiiIIIII3].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/16.png", (int)2, (int)2, (int)2, (int)2, (boolean)false));
                this.IIiiIiiiIIiIi[IiiiiiiiIIIII3].setBounds(45, 24, 143, 200);
            } else if (IiiiiiiiIIIII3 == 1) {
                this.IIiiIiiiIIiIi[IiiiiiiiIIIII3].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/25.png", (int)2, (int)2, (int)2, (int)2, (boolean)false));
                this.IIiiIiiiIIiIi[IiiiiiiiIIIII3].setBounds(45, 245, 143, 21);
            } else if (IiiiiiiiIIIII3 == 2) {
                this.IIiiIiiiIIiIi[IiiiiiiiIIIII3].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/25.png", (int)2, (int)2, (int)2, (int)2, (boolean)false));
                this.IIiiIiiiIIiIi[IiiiiiiiIIIII3].setBounds(191, 245, 204, 21);
            } else if (IiiiiiiiIIIII3 == 3) {
                this.IIiiIiiiIIiIi[IiiiiiiiIIIII3].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/24.png", (int)2, (int)2, (int)2, (int)2, (boolean)false));
                this.IIiiIiiiIIiIi[IiiiiiiiIIIII3].setBounds(45, 245, 143, 180);
            } else if (IiiiiiiiIIIII3 == 4) {
                this.IIiiIiiiIIiIi[IiiiiiiiIIIII3].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/24.png", (int)2, (int)2, (int)2, (int)2, (boolean)false));
                this.IIiiIiiiIIiIi[IiiiiiiiIIIII3].setBounds(191, 245, 204, 180);
            }
            this.add((Component)this.IIiiIiiiIIiIi[IiiiiiiiIIIII3++]);
        }
    }

    static /* synthetic */ JList ALLATORIxDEMO(PetJpanel1 arg0) {
        return arg0.iiiiIiiiIiiII;
    }

    /*
     * WARNING - void declaration
     */
    public void ALLATORIxDEMO(Mount mount) {
        void IiiiiiiiIIIII;
        RoleData IiiiiiiiIIIII2 = this.ALLATORIxDEMO();
        if (IiiiiiiiIIIII2 == null) {
            return;
        }
        IiiiiiiiIIIII2.setChoseMountId(mount != null ? mount.getMid() : null);
        this.iiiIiiiiiiIIi();
        if (mount == null) {
            this.ALLATORIxDEMO().iiiIiiiiiiIIi(20);
            return;
        }
        int IiiiiiiiIIIII3 = mount.getMountlvl();
        if (IiiiiiiiIIIII3 > 100) {
            IiiiiiiiIIIII3 -= 100;
        }
        int n = (int)Math.floor((float)mount.getSpri().intValue() + (float)IiiiiiiiIIIII3 / 10.0f * (float)mount.getSpri().intValue() / 2.0f);
        int IiiiiiiiIIIII4 = (int)Math.floor((float)mount.getPower().intValue() + (float)IiiiiiiiIIIII3 / 10.0f * (float)mount.getPower().intValue() / 2.0f);
        int IiiiiiiiIIIII5 = (int)Math.floor((float)mount.getBone().intValue() + (float)IiiiiiiiIIIII3 / 10.0f * (float)mount.getBone().intValue() / 2.0f);
        int IiiiiiiiIIIII6 = mount.getMountCZ();
        int IiiiiiiiIIIII7 = IiiiiiiiIIIII6 >> 6;
        if (IiiiiiiiIIIII7 > 0) {
            int IiiiiiiiIIIII8 = 0;
            while (IiiiiiiiIIIII8 < 3) {
                if ((IiiiiiiiIIIII6 >> 2 * IiiiiiiiIIIII8 & 1) != 0) {
                    boolean IiiiiiiiIIIII9;
                    boolean bl = IiiiiiiiIIIII9 = (IiiiiiiiIIIII6 >> 2 * IiiiiiiiIIIII8 + 1 & 1) == 1;
                    if (IiiiiiiiIIIII8 == 0) {
                        IiiiiiiiIIIII += IiiiiiiiIIIII9 ? IiiiiiiiIIIII7 : -IiiiiiiiIIIII7;
                    } else if (IiiiiiiiIIIII8 == 1) {
                        IiiiiiiiIIIII4 += IiiiiiiiIIIII9 ? IiiiiiiiIIIII7 : -IiiiiiiiIIIII7;
                    } else if (IiiiiiiiIIIII8 == 2) {
                        IiiiiiiiIIIII5 += IiiiiiiiIIIII9 ? IiiiiiiiIIIII7 : -IiiiiiiiIIIII7;
                    }
                }
                ++IiiiiiiiIIIII8;
            }
        }
        this.iiIiiiiiiiIii[0].setText(IiiiiiiiIIIII2.getLoginResult().getMount_id() == mount.getMountid() ? "\u4f11\u606f" : "\u9a91\u4e58");
        this.IiIIIiiiiIiiI[0].setText(mount.getMountlvlString());
        this.IiIIIiiiiIiiI[1].setText("" + mount.getLive());
        this.IiIIIiiiiIiiI[2].setText(String.valueOf((int)IiiiiiiiIIIII));
        this.IiIIIiiiiIiiI[3].setText(String.valueOf(IiiiiiiiIIIII4));
        this.IiIIIiiiiIiiI[4].setText(String.valueOf(IiiiiiiiIIIII5));
        if (IiiiiiiiIIIII3 < 100) {
            this.IiIIIiiiiIiiI[5].setText(mount.getExp() + "/" + ExpUtil.getMountExp((int)mount.getMountlvl()));
        } else {
            this.IiIIIiiiiIiiI[5].setText(mount.getExp() + "/999999");
        }
        this.iiIiIiiiiIIIi = iiiiiiiiiiIiI.ALLATORIxDEMO((long)((long)mount.getMountid().intValue() << 40 | IiiiiiiiIIIII2.getLoginResult().getSpecies_id().longValue()), (int)2, (int)1, null);
        IiiiIiiiiIIII IiiiiiiiIIIII10 = (IiiiIiiiiIIII)this.iiIIiiiiIiIIi.getFormManagement().iIiIiiiiIIiii(20);
        if (IiiiiiiiIIIII10 == null) return;
        IiiiiiiiIIIII10.ALLATORIxDEMO(mount);
    }
}
