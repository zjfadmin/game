/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.IIIIiiiiIIiII
 *  com.xy.a.IIiIiiiiiIiIi
 *  com.xy.a.IiIIIiiiiiIII
 *  com.xy.a.IiiiIiiiiIIIi
 *  com.xy.a.iIIIIiiiIiIII
 *  com.xy.a.iIIiIiiiiIIiI
 *  com.xy.a.iIiIIiiiiIiii
 *  com.xy.a.iiIIIiiiiiIiI
 *  com.xy.a.iiIiIiiiIIiii
 *  com.xy.a.iiIiiiiiIIIiI
 *  com.xy.a.iiiiiiiiiIIii
 *  com.xy.a.v.IIIIiiiiIIIIi
 *  com.xy.bean.LoginResult
 *  com.xy.bean.RoleShow
 *  com.xy.bean.TeamBean
 *  com.xy.bean.UseCardBean
 *  com.xy.d.IiIiIiiiiIIiI
 *  com.xy.entity.RoleSummoning
 *  com.xy.entity.TeamRole
 *  com.xy.formula.PetProperty
 *  com.xy.game.RoleData
 *  com.xy.i.IIIIIiiiIIIiI
 *  com.xy.i.IIIIIiiiIiIii
 *  com.xy.i.IiIIIiiiIIiII
 *  com.xy.i.iIiIiiiiIiIII
 *  com.xy.i.iiIIiiiiIiiII
 *  com.xy.q.IIIiiiiiIiIiI
 *  com.xy.q.IiIIIiiiiIIiI
 *  com.xy.q.IiiIiiiiIIIii
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.q.iiIiIiiiIiIiI
 *  com.xy.socket.GameClient
 *  com.xy.text.GameView
 *  com.xy.text.ScreenData
 *  com.xy.v.IIiiIiiiiIIiI
 *  com.xy.v.IiiiIiiiiIIII
 *  com.xy.v.iIiIIiiiIiiiI
 *  com.xy.w.IIIIIiiiIiIii
 *  com.xy.w.IIIIIiiiIiiII
 *  com.xy.w.IIIiiiiiIiIiI
 *  com.xy.w.IIiIiiiiIiiIi
 *  com.xy.w.iiiiiiiiiiIiI
 */
package com.xy.a;

import com.xy.a.IIIIiiiiIIiII;
import com.xy.a.IIiIiiiiiIiIi;
import com.xy.a.IiIIIiiiiiIII;
import com.xy.a.IiiiIiiiiIIIi;
import com.xy.a.iIIIIiiiIiIII;
import com.xy.a.iIIiIiiiiIIiI;
import com.xy.a.iIiIIiiiiIiii;
import com.xy.a.iiIIIiiiiiIiI;
import com.xy.a.iiIiIiiiIIiii;
import com.xy.a.iiIiiiiiIIIiI;
import com.xy.a.iiiiiiiiiIIii;
import com.xy.a.v.IIIIiiiiIIIIi;
import com.xy.bean.LoginResult;
import com.xy.bean.RoleShow;
import com.xy.bean.TeamBean;
import com.xy.bean.UseCardBean;
import com.xy.d.IiIiIiiiiIIiI;
import com.xy.entity.RoleSummoning;
import com.xy.entity.TeamRole;
import com.xy.formula.PetProperty;
import com.xy.game.RoleData;
import com.xy.i.IIIIIiiiIIIiI;
import com.xy.i.IIIIIiiiIiIii;
import com.xy.i.IiIIIiiiIIiII;
import com.xy.i.iIiIiiiiIiIII;
import com.xy.q.IIIiiiiiIiIiI;
import com.xy.q.IiIIIiiiiIIiI;
import com.xy.q.IiiIiiiiIIIii;
import com.xy.q.IiiiIiiiiIiIi;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.q.iiIiIiiiIiIiI;
import com.xy.socket.GameClient;
import com.xy.text.GameView;
import com.xy.text.ScreenData;
import com.xy.v.IIiiIiiiiIIiI;
import com.xy.v.IiiiIiiiiIIII;
import com.xy.v.iIiIIiiiIiiiI;
import com.xy.w.IIIIIiiiIiiII;
import com.xy.w.IIiIiiiiIiiIi;
import com.xy.w.iiiiiiiiiiIiI;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.text.Document;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class IiIiIiiiIIiiI
extends IiiiIiiiiIiIi {
    private com.xy.w.IIIiiiiiIiIiI IiiIIiiiiIiIi;
    private IiIIIiiiIIiII iIIIiiiiIiiiI;
    private IIIIIiiiIIIiI[] iIiIIiiiIIiII;
    private IiIIIiiiIIiII IIiIIiiiIiiII;
    private IIIIIiiiIIIiI IIIIIiiiIIIII;
    private IIIiiiiiIiIiI IiiIiiiiIIiiI;
    private JLabel IiIiiiiiiiiIi;
    private iIiIiiiiIiIII IiIIIiiiIiiIi;
    private IIIIIiiiIIIiI IIIiiiiiiIiiI;
    private JLabel IIiIiiiiIiiiI;
    private com.xy.w.IIIiiiiiIiIiI IiiiIiiiIiiIi;
    private iiIiIiiiIIiii iiIIIiiiIiIii;
    private IIIIIiiiIIIiI IIiIiiiiIIiII;
    public boolean iIiiIiiiiIiiI;
    private String iiIiiiiiiiiiI;
    private JLabel iiIiIiiiiIIII;
    private IIIIIiiiIIIiI IiIIIiiiiiiiI;
    private IiIIIiiiiiIII iIiIIiiiIIIii;
    private com.xy.w.IIIiiiiiIiIiI IIIIIiiiIiIIi;
    private IIIiiiiiIiIiI iiIIiiiiIiIIi;
    private List<IIIIIiiiIiIii> IiIIiiiiIIIII;
    static com.xy.w.IIIIIiiiIiIii iIIIIiiiiiIIi;
    private String IiiIIiiiiiiiI;
    public boolean IIiiiiiiIiiII;
    private int IiiiIiiiIiIII;
    static com.xy.w.IIIIIiiiIiIii IIiiiiiiiIIIi;
    private String IIIiiiiiIIiII;
    private com.xy.w.IIIiiiiiIiIiI iiIiiiiiiIIiI;
    private List<IIIIIiiiIiIii> iIiiIiiiIiIIi;
    private JLabel iiiiIiiiIIiii;
    private IIIIiiiiIIiII iIIiIiiiiiiIi;
    private IIIIIiiiIIIiI IIIIiiiiiiiII;
    private JLabel iiIIIiiiiiiiI;
    private IiiiIiiiiIIIi IiIiiiiiIIIII;
    private IIIIIiiiIIIiI[] iiIiIiiiiIIIi;
    private iiiiiiiiiIIii iiiiIiiiIiiII;
    private iIIiIiiiiIIiI iiiIiiiiiiiIi;
    private IIIIiiiiIIiII iIiiIiiiiiiII;
    private iIiIIiiiiIiii IIiiIiiiIIiIi;
    private com.xy.w.IIIiiiiiIiIiI iIiIiiiiIiIii;
    private iiIiiiiiIIIiI[] IiIIIiiiiIiiI;
    private IIiIiiiiiIiIi iiIiiiiiiiIii;
    private JTextField IiiiiiiiIIIII;
    private iIiIiiiiIiIII ALLATORIxDEMO;

    public boolean ALLATORIxDEMO(int type) {
        return iiIiiiiiIIIiI.ALLATORIxDEMO((iiIiiiiiIIIiI)this.IiIIIiiiiIiiI[type]);
    }

    private /* synthetic */ void IIiIIiiiiiIiI() {
        IIIIiiiiIIIIi IiiiiiiiIIIII;
        UseCardBean IiiiiiiiIIIII2 = this.ALLATORIxDEMO().getLimit("\u9650\u65f6\u793c\u5305");
        IIIIIiiiIiIii IiiiiiiiIIIII3 = null;
        int IiiiiiiiIIIII4 = 5;
        List<IIIIIiiiIiIii> IiiiiiiiIIIII5 = this.ALLATORIxDEMO();
        int IiiiiiiiIIIII62 = 0;
        while (IiiiiiiiIIIII62 < IiiiiiiiIIIII5.size()) {
            IIIIIiiiIiIii IiiiiiiiIIIII7 = IiiiiiiiIIIII5.get(IiiiiiiiIIIII62);
            if (IiiiiiiiIIIII7.ALLATORIxDEMO() != IiiiiiiiIIIII4) {
                ++IiiiiiiiIIIII62;
                continue;
            }
            IiiiiiiiIIIII3 = IiiiiiiiIIIII7;
            break;
        }
        if (IiiiiiiiIIIII2 != null) {
            if (IiiiiiiiIIIII3 == null) {
                IIIIIiiiIiIii IiiiiiiiIIIII62 = new IIIIIiiiIiIii("sc/b/vicon" + IiiiiiiiIIIII4 + ".png", 1, 0, (IiiiIiiiiIiIi)this);
                IiiiiiiiIIIII62.iIiIiiiiIIiii(IiiiiiiiIIIII4);
                this.add((Component)IiiiiiiiIIIII62);
                IiiiiiiiIIIII5.add(IiiiiiiiIIIII62);
                this.iiiIiiiiiiIIi();
            }
        } else if (IiiiiiiiIIIII3 != null) {
            IiiiiiiiIIIII5.remove(IiiiiiiiIIIII3);
            this.remove((Component)IiiiiiiiIIIII3);
            this.iiiIiiiiiiIIi();
        }
        if ((IiiiiiiiIIIII = (IIIIiiiiIIIIi)this.iiIIiiiiIiIIi.getFormManagement().iIiIiiiiIIiii(167)) != null) {
            IiiiiiiiIIIII.iiiIiiiiiiIIi(1);
        }
        this.iIiiIiiiiIiiI = false;
    }

    public iiIiIiiiIIiii ALLATORIxDEMO() {
        return this.iiIIIiiiIiIii;
    }

    /*
     * Unable to fully structure code
     */
    public synchronized void ALLATORIxDEMO(RoleShow roleShow, TeamBean teamBean) {
        block19: {
            if (teamBean != null) break block19;
            if (this.iiiiIiiiIiiII == null) return;
            IiiiiiiiIIIII = 0;
            if (true) ** GOTO lbl16
        }
        if (this.iiiiIiiiIiiII == null) {
            this.iiiiIiiiIiiII = new iiiiiiiiiIIii(this);
            this.add((Component)this.iiiiIiiiIiiII);
        }
        IiiiiiiiIIIII = ((TeamRole)teamBean.getTeams().get(0)).getRoleId().compareTo(roleShow.getRole_id()) == 0;
        IiiiiiiiIIIII = 0;
        IiiiiiiiIIIII = teamBean.getTeams().size();
        if (true) ** GOTO lbl54
        do {
            this.iiiiIiiiIiiII.IiIIIiiiiIiiI[IiiiiiiiIIIII++] = null;
lbl16:
            // 2 sources

        } while (IiiiiiiiIIIII < this.iiiiIiiiIiiII.IiIIIiiiiIiiI.length);
        this.iiiiIiiiIiiII.setVisible(false);
        return;
        do {
            v0 = IiiiiiiiIIIII = IiiiiiiiIIIII < IiiiiiiiIIIII ? (TeamRole)teamBean.getTeams().get(IiiiiiiiIIIII) : null;
            if (IiiiiiiiIIIII != null) {
                this.iiiiIiiiIiiII.IiIIIiiiiIiiI[IiiiiiiiIIIII] = IIIIIiiiIiiII.iiiIiiiiiiIIi((String)IIiIiiiiIiiIi.iiiIiiiiiiIIi((String)("s" + IiiiiiiiIIIII.getSpeciesId().intValue())));
                if (IiiiiiiiIIIII != 0) {
                    IiiiiiiiIIIII = null;
                    if (IiiiiiiiIIIII && IiiiiiiiIIIII.getState() < 0) {
                        IiiiiiiiIIIII = "\u53ec";
                    } else if (IiiiiiiiIIIII.getRoleId().compareTo(roleShow.getRole_id()) == 0) {
                        v1 = IiiiiiiiIIIII = IiiiiiiiIIIII.getState() >= 0 ? "\u79bb" : "\u5f52";
                    }
                    if (IiiiiiiiIIIII != null) {
                        if (this.iiiiIiiiIiiII.iiIiiiiiiiIii[IiiiiiiiIIIII - 1] == null) {
                            this.iiiiIiiiIiiII.iiIiiiiiiiIii[IiiiiiiiIIIII - 1] = new com.xy.i.iiIIiiiiIiiII("sc/c/52", 1, 0, iiIIiiiiIiiII.iiIiiiiiiIIiI, iiIIiiiiIiiII.iIiiIiiiiiIIi, null, (IiiiIiiiiIiIi)this);
                            this.iiiiIiiiIiiII.iiIiiiiiiiIii[IiiiiiiiIIIII - 1].setBounds(IiiiiiiiIIIII * 71, 55, 17, 17);
                            this.iiiiIiiiIiiII.add((Component)this.iiiiIiiiIiiII.iiIiiiiiiiIii[IiiiiiiiIIIII - 1], 0);
                        }
                        this.iiiiIiiiIiiII.iiIiiiiiiiIii[IiiiiiiiIIIII - 1].setText(IiiiiiiiIIIII);
                        if (IiiiiiiiIIIII.equals("\u53ec")) {
                            this.iiiiIiiiIiiII.iiIiiiiiiiIii[IiiiiiiiIIIII - 1].ALLATORIxDEMO(8 + IiiiiiiiIIIII);
                        } else if (IiiiiiiiIIIII.equals("\u79bb")) {
                            this.iiiiIiiiIiiII.iiIiiiiiiiIii[IiiiiiiiIIIII - 1].ALLATORIxDEMO(7);
                        } else if (IiiiiiiiIIIII.equals("\u5f52")) {
                            this.iiiiIiiiIiiII.iiIiiiiiiiIii[IiiiiiiiIIIII - 1].ALLATORIxDEMO(8);
                        }
                        this.iiiiIiiiIiiII.iiIiiiiiiiIii[IiiiiiiiIIIII - 1].setVisible(true);
                    } else if (this.iiiiIiiiIiiII.iiIiiiiiiiIii[IiiiiiiiIIIII - 1] != null) {
                        this.iiiiIiiiIiiII.iiIiiiiiiiIii[IiiiiiiiIIIII - 1].setVisible(false);
                    }
                }
            } else {
                this.iiiiIiiiIiiII.IiIIIiiiiIiiI[IiiiiiiiIIIII] = null;
                if (IiiiiiiiIIIII != 0 && this.iiiiIiiiIiiII.iiIiiiiiiiIii[IiiiiiiiIIIII - 1] != null) {
                    this.iiiiIiiiIiiII.iiIiiiiiiiIii[IiiiiiiiIIIII - 1].setVisible(false);
                }
            }
            ++IiiiiiiiIIIII;
lbl54:
            // 2 sources

        } while (IiiiiiiiIIIII < 5);
        this.iiiiIiiiIiiII.setBounds(223 + (this.iiIIiiiiIiIIi.screenData.Screen_x - 892) / 2, 0, 358, 75);
        this.iiiiIiiiIiiII.setVisible(this.iiIIiiiiIiIIi.getBattleScene() == null);
    }

    private /* synthetic */ void IIIiIiiiIiIii() {
        if (this.iiiIiiiiiiiIi == null) {
            this.iiiIiiiiiiiIi = new iIIiIiiiiIIiI(this);
            this.add((Component)this.iiiIiiiiiiiIi);
        }
        this.iiiIiiiiiiiIi.ALLATORIxDEMO();
        if (!this.iIiiIiiiiIiiI) return;
        this.IIiIIiiiiiIiI();
    }

    /*
     * Unable to fully structure code
     */
    public void ALLATORIxDEMO(int id, IIIIIiiiIIIiI baseBtn) {
        block9: {
            block8: {
                if (id != 3) break block8;
                baseBtn.setImage("sc/c/14");
                baseBtn.ALLATORIxDEMO(4);
                IiiiiiiiIIIII = 0;
                if (true) ** GOTO lbl43
            }
            if (id != 4) break block9;
            baseBtn.setImage("sc/c/15");
            baseBtn.ALLATORIxDEMO(3);
            IiiiiiiiIIIII = 0;
            if (true) ** GOTO lbl55
        }
        if (id == 5) {
            baseBtn.setImage("sc/c/47");
            baseBtn.ALLATORIxDEMO(6);
            IiiiiiiiIIIII = this.iiIIiiiiIiIIi.screenData;
            this.IIIiiiiiiIiiI.setBounds(IiiiiiiiIIIII.getScreen_x() - 332, IiiiiiiiIIIII.getScreen_y() - 80, 11, 37);
            this.iIiIIiiiIIIii.setVisible(true);
            return;
        }
        if (id == 6) {
            baseBtn.setImage("sc/c/48");
            baseBtn.ALLATORIxDEMO(5);
            IiiiiiiiIIIII = this.iiIIiiiiIiIIi.screenData;
            this.IIIiiiiiiIiiI.setBounds(IiiiiiiiIIIII.getScreen_x() - 11, IiiiiiiiIIIII.getScreen_y() - 80, 11, 37);
            this.iIiIIiiiIIIii.setVisible(false);
            return;
        }
        if (id != 7) return;
        v0 = this.iiiIiiiiiiiIi.IiIIIiiiiIiiI = this.iiiIiiiiiiiIi.IiIIIiiiiIiiI == false;
        if (this.iiiIiiiiiiiIi.IiIIIiiiiIiiI) {
            iIIiIiiiiIIiI.ALLATORIxDEMO((iIIiIiiiiIIiI)this.iiiIiiiiiiiIi).setImage("sc/c/55");
            iIIiIiiiiIIiI.ALLATORIxDEMO((iIIiIiiiiIIiI)this.iiiIiiiiiiiIi).setVisible(this.iiiIiiiiiiiIi.iIiiIiiiiiiII);
            iIIiIiiiiIIiI.ALLATORIxDEMO((iIIiIiiiiIIiI)this.iiiIiiiiiiiIi).setVisible(this.iiiIiiiiiiiIi.iIiiIiiiiiiII);
        } else {
            iIIiIiiiiIIiI.ALLATORIxDEMO((iIIiIiiiiIIiI)this.iiiIiiiiiiiIi).setImage("sc/c/48");
            iIIiIiiiiIIiI.ALLATORIxDEMO((iIIiIiiiiIIiI)this.iiiIiiiiiiiIi).setVisible(false);
            iIIiIiiiiIIiI.ALLATORIxDEMO((iIIiIiiiiIIiI)this.iiiIiiiiiiiIi).setVisible(true);
        }
        this.iiiIiiiiiiiIi.iIiIiiiiIIiii();
        return;
        do {
            v1 = this.IiIIiiiiIIIII.get(IiiiiiiiIIIII);
            ++IiiiiiiiIIIII;
            v1.setVisible(false);
lbl43:
            // 2 sources

        } while (IiiiiiiiIIIII < this.IiIIiiiiIIIII.size());
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iIiiIiiiIiIIi.size()) {
            v2 = this.iIiiIiiiIiIIi.get(IiiiiiiiIIIII);
            ++IiiiiiiiIIIII;
            v2.setVisible(false);
        }
        return;
        do {
            v3 = this.IiIIiiiiIIIII.get(IiiiiiiiIIIII);
            ++IiiiiiiiIIIII;
            v3.setVisible(true);
lbl55:
            // 2 sources

        } while (IiiiiiiiIIIII < this.IiIIiiiiIIIII.size());
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iIiiIiiiIiIIi.size()) {
            v4 = this.iIiiIiiiIiIIi.get(IiiiiiiiIIIII);
            ++IiiiiiiiIIIII;
            v4.setVisible(true);
        }
    }

    public IIIIIiiiIIIiI ALLATORIxDEMO() {
        return this.IIIIiiiiiiiII;
    }

    public void IIiIIiiiIiIIi() {
        RoleData roleData = this.ALLATORIxDEMO();
        LoginResult IiiiiiiiIIIII = roleData.getLoginResult();
        int IiiiiiiiIIIII2 = roleData.getRoleProperty().getHp();
        int IiiiiiiiIIIII3 = roleData.getRoleProperty().getMp();
        int IiiiiiiiIIIII4 = IiiiIiiiiIIII.ALLATORIxDEMO((int)IiiiiiiiIIIII.getGrade());
        int IiiiiiiiIIIII5 = IiiiIiiiiIIII.iIiIiiiiIIiii((int)IiiiiiiiIIIII.getGrade());
        this.iIiiIiiiiiiII.ALLATORIxDEMO(0, IiiiiiiiIIIII.getHp().doubleValue() / (double)IiiiiiiiIIIII2);
        this.iIiiIiiiiiiII.ALLATORIxDEMO(1, IiiiiiiiIIIII.getMp().doubleValue() / (double)IiiiiiiiIIIII3);
        this.iIiiIiiiiiiII.ALLATORIxDEMO(2, IiiiiiiiIIIII.getExperience().doubleValue() / (double)this.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII5, IiiiiiiiIIIII4));
    }

    public void iIiIiiiiIIiIi(int type) {
        if (this.iiIiiiiiiiIii == null) return;
        this.iiIiiiiiiiIii.ALLATORIxDEMO(type);
    }

    public void IIiiIiiiiIiII() {
        if (this.iiiIiiiiiiiIi == null) {
            return;
        }
        this.iiiIiiiiiiiIi.iiiIiiiiiiIIi();
    }

    public IiIIIiiiiiIII ALLATORIxDEMO() {
        return this.iIiIIiiiIIIii;
    }

    /*
     * WARNING - void declaration
     */
    public void IIIiiiiiiIIiI() {
        boolean bl = false;
        this.IiIIiiiiIIIII = new ArrayList<IIIIIiiiIiIii>();
        GameClient IiiiiiiiIIIII = this.ALLATORIxDEMO();
        int IiiiiiiiIIIII2 = 0;
        while (IiiiiiiiIIIII2 < IiiiiiiiIIIII.gn.length()) {
            char IiiiiiiiIIIII3 = IiiiiiiiIIIII.gn.charAt(IiiiiiiiIIIII2);
            IIIIIiiiIiIii IiiiiiiiIIIII4 = null;
            if (IiiiiiiiIIIII3 == 'a') {
                IiiiiiiiIIIII4 = new IIIIIiiiIiIii("sc/b/B434.png", 1, 50, (IiiiIiiiiIiIi)this);
            } else if (IiiiiiiiIIIII3 == 'b') {
                IiiiiiiiIIIII4 = new IIIIIiiiIiIii("sc/b/B385.png", 1, 56, (IiiiIiiiiIiIi)this);
            } else if (IiiiiiiiIIIII3 == 'c') {
                IiiiiiiiIIIII4 = new IIIIIiiiIiIii("sc/b/B394.png", 1, 57, (IiiiIiiiiIiIi)this);
            } else if (IiiiiiiiIIIII3 == 'd') {
                IiiiiiiiIIIII4 = new IIIIIiiiIiIii("sc/b/B22.png", 1, 52, (IiiiIiiiiIiIi)this);
            } else if (IiiiiiiiIIIII3 == 'e') {
                IiiiiiiiIIIII4 = new IIIIIiiiIiIii("sc/b/B466.png", 1, 68, (IiiiIiiiiIiIi)this);
            } else if (IiiiiiiiIIIII3 == 'f') {
                IiiiiiiiIIIII4 = new IIIIIiiiIiIii("sc/b/B464.png", 1, 150, (IiiiIiiiiIiIi)this);
            } else if (IiiiiiiiIIIII3 == 'g') {
                IiiiiiiiIIIII4 = new IIIIIiiiIiIii("sc/b/B465.png", 1, 50, (IiiiIiiiiIiIi)this);
            }
            if (IiiiiiiiIIIII4 != null) {
                void IiiiiiiiIIIII5;
                if (IiiiiiiiIIIII3 == 'a') {
                    IiiiiiiiIIIII4.setBounds(19 + 60 * IiiiiiiiIIIII5, 81, 52, 52);
                } else if (IiiiiiiiIIIII3 == 'b') {
                    IiiiiiiiIIIII4.setBounds(21 + 60 * IiiiiiiiIIIII5, 82, 49, 49);
                } else if (IiiiiiiiIIIII3 == 'c') {
                    IiiiiiiiIIIII4.setBounds(19 + 60 * IiiiiiiiIIIII5, 66, 59, 72);
                } else if (IiiiiiiiIIIII3 == 'd') {
                    IiiiiiiiIIIII4.setBounds(19 + 60 * IiiiiiiiIIIII5, 80, 53, 53);
                } else if (IiiiiiiiIIIII3 == 'e') {
                    IiiiiiiiIIIII4.setBounds(19 + 60 * IiiiiiiiIIIII5, 84, 53, 44);
                } else if (IiiiiiiiIIIII3 == 'f') {
                    IiiiiiiiIIIII4.setBounds(19 + 60 * IiiiiiiiIIIII5, 84, 53, 44);
                } else if (IiiiiiiiIIIII3 == 'g') {
                    IiiiiiiiIIIII4.setBounds(19 + 60 * IiiiiiiiIIIII5, 84, 53, 44);
                }
                this.add((Component)IiiiiiiiIIIII4);
                ++IiiiiiiiIIIII5;
                this.IiIIiiiiIIIII.add(IiiiiiiiIIIII4);
            }
            ++IiiiiiiiIIIII2;
        }
    }

    public int iiiIiiiiiiIIi() {
        return this.IiiiIiiiIiIII;
    }

    public void ALLATORIxDEMO(RoleSummoning pet, IiIiIiiiiIIiI battleUnit) {
        if (pet == null) {
            this.iiIIiiiiIiIIi.ALLATORIxDEMO(IIiIiiiiIiiIi.IiiIiiiiiiIiI((String)"p0"));
            this.iIIiIiiiiiiIi.ALLATORIxDEMO(0, 0.0);
            this.iIIiIiiiiiiIi.ALLATORIxDEMO(1, 0.0);
            this.iIIiIiiiiiiIi.ALLATORIxDEMO(2, 0.0);
            return;
        }
        this.iiIIiiiiIiIIi.ALLATORIxDEMO(IIiIiiiiIiiIi.IiiIiiiiiiIiI((String)("p" + pet.getSummoningskin())));
        if (battleUnit != null) {
            this.iIIiIiiiiiiIi.ALLATORIxDEMO(0, (double)battleUnit.ALLATORIxDEMO().getHp_Current() / (double)battleUnit.ALLATORIxDEMO().getHp_Total());
            this.iIIiIiiiiiiIi.ALLATORIxDEMO(1, (double)battleUnit.ALLATORIxDEMO().getMp_Current() / (double)battleUnit.ALLATORIxDEMO().getMp_Total());
        } else {
            int[] IiiiiiiiIIIII = PetProperty.getPetHMASp((RoleSummoning)pet, (RoleData)this.ALLATORIxDEMO());
            this.iIIiIiiiiiiIi.ALLATORIxDEMO(0, (double)pet.getBasishp(IiiiiiiiIIIII[0]) / (double)IiiiiiiiIIIII[0]);
            this.iIIiIiiiiiiIi.ALLATORIxDEMO(1, (double)pet.getBasismp(IiiiiiiiIIIII[1]) / (double)IiiiiiiiIIIII[1]);
        }
        this.iIIiIiiiiiiIi.ALLATORIxDEMO(2, pet.getExp().doubleValue() / (double)this.ALLATORIxDEMO().iiiIiiiiiiIIi(pet.getTurnRount(), IiiiIiiiiIIII.iiiiiiiiIIiii((int)pet.getGrade())));
    }

    public List<IIIIIiiiIiIii> iIiIiiiiIIiii() {
        return this.IiIIiiiiIIIII;
    }

    public void IIIIIiiiiIIii() {
        ScreenData IiiiiiiiIIIII = this.iiIIiiiiIiIIi.screenData;
        if (this.iiIIiiiiIiIIi.getBattleScene() != null) {
            this.iIIiIiiiiiiIi.setBounds(61, 7, 70, 44);
            this.IIIIIiiiIiIIi.setBounds(0, 0, 140, 61);
            this.iiIIiiiiIiIIi.setBounds(4, 5, 50, 50);
            return;
        }
        this.iIIiIiiiiiiIi.setBounds(IiiiiiiiIIIII.getScreen_x() - 254, 7, 70, 44);
        this.IIIIIiiiIiIIi.setBounds(IiiiiiiiIIIII.getScreen_x() - 315, 0, 140, 61);
        this.iiIIiiiiIiIIi.setBounds(IiiiiiiiIIIII.getScreen_x() - 311, 5, 50, 50);
    }

    public IiIiIiiiIIiiI(GameView gameView) {
        super(-1, -1, IiiiIiiiiIiIi.iIIiIiiiiiiIi, gameView);
        ScreenData screenData = gameView.screenData;
        this.ALLATORIxDEMO(0, 0, screenData.getScreen_x(), screenData.getScreen_y(), IiiiIiiiiIiIi.iIIiIiiiiiiIi);
        this.IiIIiiiiIIIII = new ArrayList<IIIIIiiiIiIii>();
        this.iIiiIiiiIiIIi = new ArrayList<IIIIIiiiIiIii>();
        this.IiIIIiiiiIiiI = new iiIiiiiiIIIiI[12];
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IiIIIiiiiIiiI.length) {
            this.IiIIIiiiiIiiI[IiiiiiiiIIIII] = new iiIiiiiiIIIiI(this, IiiiiiiiIIIII);
            this.add((Component)this.IiIIIiiiiIiiI[IiiiiiiiIIIII++]);
        }
        this.IiiiIiiiIiiIi = new com.xy.w.IIIiiiiiIiIiI(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/c/16", (int)60, (int)24, (int)20, (int)10, (boolean)false));
        this.IiiiiiiiIIIII = IiIIIiiiiIIiI.ALLATORIxDEMO((Font)iiIIiiiiIiiII.ALLATORIxDEMO, (Color)Color.white);
        this.IiiiiiiiIIIII.setDocument((Document)new IiiIiiiiIIIii());
        this.IiiiiiiiIIIII.setFocusable(true);
        this.IiiIIiiiiIiIi = new com.xy.w.IIIiiiiiIiIiI("sc/c/17");
        this.IiiIIiiiiIiIi.addMouseListener((MouseListener)new iiIiIiiiIiIiI(1, (IiiiIiiiiIiIi)this));
        this.iIiIIiiiIIiII = new IIIIIiiiIIIiI[3];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iIiIIiiiIIiII.length) {
            if (IiiiiiiiIIIII == 0) {
                this.iIiIIiiiIIiII[IiiiiiiiIIIII] = new IIIIIiiiIIIiI("sc/c/22", 1, 28, (IiiiIiiiiIiIi)this);
            } else if (IiiiiiiiIIIII == 1) {
                this.iIiIIiiiIIiII[IiiiiiiiIIIII] = new IIIIIiiiIIIiI("sc/c/23", 1, 0, (IiiiIiiiiIiIi)this);
            } else if (IiiiiiiiIIIII == 2) {
                this.iIiIIiiiIIiII[IiiiiiiiIIIII] = new IIIIIiiiIIIiI("sc/c/24", 1, 0, (IiiiIiiiiIiIi)this);
            }
            this.add((Component)this.iIiIIiiiIIiII[IiiiiiiiIIIII++]);
        }
        this.add(this.IiiiiiiiIIIII);
        this.add((Component)this.IiiIIiiiiIiIi);
        this.add((Component)this.IiiiIiiiIiiIi);
        this.iiIIIiiiIiIii = new iiIiIiiiIIiii(gameView);
        this.iiIIIiiiIiIii.setVisible(false);
        this.add((Component)this.iiIIIiiiIiIii);
        this.IIiIIiiiIiiII = new IiIIIiiiIIiII("sc/e/7.png", 1, 9, iiIIiiiiIiiII.iiiiIiiiIiiII, iiIIiiiiIiiII.IIiiiiiiIiiII, "\u81ea\u52a8", (IiiiIiiiiIiIi)this);
        this.IIiIIiiiIiiII.setBounds(0, 0, 59, 25);
        this.IIiIIiiiIiiII.setVisible(false);
        this.add((Component)this.IIiIIiiiIiiII);
        this.iIIIiiiiIiiiI = new IiIIIiiiIIiII("sc/e/40.png", 1, 10, iiIIiiiiIiiII.iiIiiiiiiIIiI, null, "\u8be6", (IiiiIiiiiIiIi)this);
        this.iIIIiiiiIiiiI.setBounds(142, 65, 18, 18);
        this.iIIIiiiiIiiiI.setVisible(false);
        this.add((Component)this.iIIIiiiiIiiiI);
        this.IiIIIiiiIiiIi = new iIiIiiiiIiIII("sc/b/bap.png", 1, 11, (IiiiIiiiiIiIi)this);
        this.IiIIIiiiIiiIi.setBounds(137, 3, 44, 62);
        this.IiIIIiiiIiiIi.setVisible(false);
        this.add((Component)this.IiIIIiiiIiiIi);
        this.ALLATORIxDEMO = new iIiIiiiiIiIII("sc/b/bap.png", 1, 12, (IiiiIiiiiIiIi)this);
        this.ALLATORIxDEMO.setBounds(182, 3, 44, 62);
        this.ALLATORIxDEMO.setVisible(false);
        this.add((Component)this.ALLATORIxDEMO);
        this.IiIiiiiiIIIII = new IiiiIiiiiIIIi(gameView);
        this.add((Component)this.IiIiiiiiIIIII);
        this.iIiIiiiiIiIii = new com.xy.w.IIIiiiiiIiIiI("sc/c/6");
        this.iIiIiiiiIiIii.setBounds(0, 0, 223, 67);
        this.iiiiIiiiIIiii = new JLabel("\u957f\u5b89\u57ce", 4);
        this.iiIIIiiiiiiiI = new JLabel("[0,0]");
        this.IIiIiiiiIiiiI = new JLabel(iIiIIiiiIiiiI.iIiIiiiiIIiii(), 0);
        this.iiIIIiiiiiiiI.setForeground(Color.white);
        this.iiiiIiiiIIiii.setForeground(Color.white);
        this.IIiIiiiiIiiiI.setForeground(Color.white);
        this.iiIIIiiiiiiiI.setFont(iiIIiiiiIiiII.iIIiiiiiiIIII);
        this.iiiiIiiiIIiii.setFont(iiIIiiiiIiiII.iIIiiiiiiIIII);
        this.IIiIiiiiIiiiI.setFont(iiIIiiiiIiiII.iIiIIiiiiIIiI);
        this.iiiiIiiiIIiii.setBounds(0, 14, 90, 16);
        this.iiIIIiiiiiiiI.setBounds(100, 14, 100, 16);
        this.IIiIiiiiIiiiI.setBounds(88, 45, 95, 20);
        this.IIiIiiiiIIiII = new IIIIIiiiIIIiI("sc/c/8", 1, 1, (IiiiIiiiiIiIi)this);
        this.IIiIiiiiIIiII.setBounds(180, 3, 20, 20);
        this.IiIIIiiiiiiiI = new IIIIIiiiIIIiI("sc/c/9", 1, 2, (IiiiIiiiiIiIi)this);
        this.IiIIIiiiiiiiI.setBounds(182, 23, 17, 17);
        this.IIIIIiiiIIIII = new IIIIIiiiIIIiI("sc/c/7", 1, 0, (IiiiIiiiiIiIi)this);
        this.IIIIIiiiIIIII.setBounds(170, 32, 11, 11);
        this.iiIiIiiiiIIIi = new IIIIIiiiIIIiI[4];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iiIiIiiiiIIIi.length) {
            if (IiiiiiiiIIIII == 0) {
                this.iiIiIiiiiIIIi[IiiiiiiiIIIII] = new IIIIIiiiIIIiI("sc/c/10", 1, 0, (IiiiIiiiiIiIi)this);
            } else if (IiiiiiiiIIIII == 1) {
                this.iiIiIiiiiIIIi[IiiiiiiiIIIII] = new IIIIIiiiIIIiI("sc/c/11", 1, 31, (IiiiIiiiiIiIi)this);
            } else if (IiiiiiiiIIIII == 2) {
                this.iiIiIiiiiIIIi[IiiiiiiiIIIII] = new IIIIIiiiIIIiI("sc/c/12", 1, this.ALLATORIxDEMO().ALLATORIxDEMO(2, 12) ? 33 : 0, (IiiiIiiiiIiIi)this);
            } else if (IiiiiiiiIIIII == 3) {
                this.iiIiIiiiiIIIi[IiiiiiiiIIIII] = new IIIIIiiiIIIiI("sc/c/13", 1, 32, (IiiiIiiiiIiIi)this);
            }
            this.iiIiIiiiiIIIi[IiiiiiiiIIIII].setBounds(IiiiiiiiIIIII * 22, 45, 20, 20);
            this.add((Component)this.iiIiIiiiiIIIi[IiiiiiiiIIIII++]);
        }
        this.add((Component)this.IIiIiiiiIIiII);
        this.add((Component)this.IiIIIiiiiiiiI);
        this.add((Component)this.IIIIIiiiIIIII);
        this.add(this.iiiiIiiiIIiii);
        this.add(this.iiIIIiiiiiiiI);
        this.add(this.IIiIiiiiIiiiI);
        this.add((Component)this.iIiIiiiiIiIii);
        Color IiiiiiiiIIIII2 = new Color(0, 0, 0);
        this.setBackground(IiiiiiiiIIIII2);
        if (this.ALLATORIxDEMO().VALUE.indexOf(76) == -1) {
            this.IiIiiiiiiiiIi = new JLabel();
            this.IiIiiiiiiiiIi.setBounds(205, 5, 35, 35);
            this.IiIiiiiiiiiIi.addMouseListener((MouseListener)new iIIIIiiiIiIII(this));
            this.add(this.IiIiiiiiiiiIi);
        }
        if (this.ALLATORIxDEMO().VALUE.indexOf(65) != -1) {
            this.iiIiIiiiiIIII = new JLabel();
            this.iiIiIiiiiIIII.setBounds(245, 5, 35, 35);
            this.iiIiIiiiiIIII.addMouseListener((MouseListener)new iiIIIiiiiiIiI(this));
            this.add(this.iiIiIiiiiIIII);
        }
        this.iIiiIiiiiiiII = new IIIIiiiiIIiII(this, 98, 0);
        this.iIIiIiiiiiiIi = new IIIIiiiiIIiII(this, 70, 1);
        this.iiIiiiiiiIIiI = new com.xy.w.IIIiiiiiIiIiI("sc/c/40");
        this.IIIIIiiiIiIIi = new com.xy.w.IIIiiiiiIiIiI("sc/c/41");
        this.IiiIiiiiIIiiI = new IIIiiiiiIiIiI((IiiiIiiiiIiIi)this);
        this.iiIIiiiiIiIIi = new IIIiiiiiIiIiI((IiiiIiiiiIiIi)this);
        this.IiiIiiiiIIiiI.ALLATORIxDEMO(23, (Object)1);
        this.iiIIiiiiIiIIi.ALLATORIxDEMO(23, (Object)2);
        this.add((Component)this.iIiiIiiiiiiII);
        this.add((Component)this.iIIiIiiiiiiIi);
        this.add((Component)this.iiIiiiiiiIIiI);
        this.add((Component)this.IIIIIiiiIiIIi);
        this.add((Component)this.IiiIiiiiIIiiI);
        this.add((Component)this.iiIIiiiiIiIIi);
        this.IIIiiiiiiIIiI();
        this.IIIIiiiiiiiII = new IIIIIiiiIIIiI("sc/c/15", 1, 3, (IiiiIiiiiIiIi)this);
        this.IIIIiiiiiiiII.setBounds(0, 87, 13, 37);
        this.add((Component)this.IIIIiiiiiiiII);
        this.IIIiiiiiiIiiI = new IIIIIiiiIIIiI("sc/c/47", 1, 6, (IiiiIiiiiIiIi)this);
        this.iIiIIiiiIIIii = new IiIIIiiiiiIII(0, gameView);
        this.add((Component)this.IIIiiiiiiIiiI);
        this.add((Component)this.iIiIIiiiIIIii);
        this.ALLATORIxDEMO();
        if (iIIIIiiiiiIIi == null && this.IiIiiiiiiiiIi != null) {
            iIIIIiiiiiIIi = iiiiiiiiiiIiI.ALLATORIxDEMO((String)"sc/mouse/\u5546\u57ce.tcp", null);
        }
        if (IIiiiiiiiIIIi != null) return;
        if (this.iiIiIiiiiIIII == null) return;
        IIiiiiiiiIIIi = iiiiiiiiiiIiI.ALLATORIxDEMO((String)"sc/mouse/\u5956.tcp", null);
    }

    public void iiiiiiiiIIiii(String text) {
        this.IIIiiiiiIIiII = text;
    }

    public void iIiIiiiiIIiIi(boolean aFlag) {
        if (this.iiiiIiiiIiiII == null) return;
        this.iiiiIiiiIiiII.setVisible(aFlag);
    }

    public void iIiIiiiiIIiii(int[] pets, RoleSummoning pet) {
        if (pets == null) {
            this.iIIiIiiiiiiIi.ALLATORIxDEMO(0, 0.0);
            this.iIIiIiiiiiiIi.ALLATORIxDEMO(1, 0.0);
            this.iIIiIiiiiiiIi.ALLATORIxDEMO(2, 0.0);
            return;
        }
        this.iIIiIiiiiiiIi.ALLATORIxDEMO(0, (double)pet.getBasishp(pets[0]) / (double)pets[0]);
        this.iIIiIiiiiiiIi.ALLATORIxDEMO(1, (double)pet.getBasismp(pets[1]) / (double)pets[1]);
        this.iIIiIiiiiiiIi.ALLATORIxDEMO(2, pet.getExp().doubleValue() / (double)this.ALLATORIxDEMO().iiiIiiiiiiIIi(pet.getTurnRount(), IiiiIiiiiIIII.iiiiiiiiIIiii((int)pet.getGrade())));
    }

    static /* synthetic */ iiIiiiiiIIIiI[] ALLATORIxDEMO(IiIiIiiiIIiiI arg0) {
        return arg0.IiIIIiiiiIiiI;
    }

    public void IiiIiiiiiiIiI(String text) {
        this.IiiIIiiiiiiiI = text;
    }

    public IiiiIiiiiIIIi ALLATORIxDEMO() {
        return this.IiIiiiiiIIIII;
    }

    public IiIIIiiiIIiII iIiIiiiiIIiii() {
        return this.IIiIIiiiIiiII;
    }

    public void iiiiiiiiIIiii() {
        this.IiiIiiiiIIiiI.iIiIiiiiIIiii(IIiIiiiiIiiIi.iiiIiiiiiiIIi((String)("s" + this.iiIIiiiiIiIIi.roleData.getLoginResult().getSpecies_id().intValue())));
        this.IIiIIiiiIiIIi();
    }

    public IiIIIiiiIIiII ALLATORIxDEMO() {
        return this.iIIIiiiiIiiiI;
    }

    public synchronized void IiiIiiiiiiIiI() {
        if (this.iiIiiiiiiiIii == null) {
            ScreenData IiiiiiiiIIIII = this.iiIIiiiiIiIIi.screenData;
            this.iiIiiiiiiiIii = new IIiIiiiiiIiIi(this);
            this.iiIiiiiiiiIii.setBounds(0, IiiiiiiiIIIII.getScreen_y() - 118, 47, 92);
            this.add((Component)this.iiIiiiiiiiIii, 0);
            return;
        }
        this.iIiIiiiiIIiIi(-1);
        this.iiIiiiiiiiIii.setVisible(!this.iiIiiiiiiiIii.isVisible());
    }

    public void ALLATORIxDEMO(int[] pets, RoleSummoning pet) {
        this.iiIIiiiiIiIIi.ALLATORIxDEMO(IIiIiiiiIiiIi.IiiIiiiiiiIiI((String)(pet != null ? "p" + pet.getSummoningskin() : "p0")));
        this.iIiIiiiiIIiii(pets, pet);
    }

    public void ALLATORIxDEMO(int type, boolean tips) {
        this.IiIIIiiiiIiiI[type].ALLATORIxDEMO(tips);
    }

    public void iIiIiiiiIIiIi() {
        if (this.IIiiIiiiIIiIi == null) return;
        this.IIiiIiiiIIiIi.setVisible(false);
    }

    public JTextField ALLATORIxDEMO() {
        return this.IiiiiiiiIIIII;
    }

    public iIiIiiiiIiIII iIiIiiiiIIiii() {
        return this.ALLATORIxDEMO;
    }

    public void iIiIiiiiIIiIi(String time) {
        this.iiIiiiiiiiiiI = time;
    }

    public void iIiIiiiiIIiii(int type, double xs) {
        this.iIiiIiiiiiiII.ALLATORIxDEMO(type, xs);
    }

    public List<IIIIIiiiIiIii> ALLATORIxDEMO() {
        return this.iIiiIiiiIiIIi;
    }

    public void ALLATORIxDEMO() {
        ScreenData IiiiiiiiIIIII = this.iiIIiiiiIiIIi.screenData;
        int IiiiiiiiIIIII2 = 0;
        while (IiiiiiiiIIIII2 < this.IiIIIiiiiIiiI.length) {
            iiIiiiiiIIIiI iiIiiiiiIIIiI2 = this.IiIIIiiiiIiiI[IiiiiiiiIIIII2];
            int n = IiiiiiiiIIIII.getScreen_x() - (this.IiIIIiiiiIiiI.length - IiiiiiiiIIIII2) * 39;
            ++IiiiiiiiIIIII2;
            iiIiiiiiIIIiI2.setBounds(n, IiiiiiiiIIIII.getScreen_y() - 39, 39, 39);
        }
        this.IiiIIiiiiIiIi.setBounds(2, IiiiiiiiIIIII.getScreen_y() - 22, 39, 60);
        this.IiiiiiiiIIIII.setBounds(52, IiiiiiiiIIIII.getScreen_y() - 22, IiiiiiiiIIIII.getScreen_x() - 610, 18);
        IiiiiiiiIIIII2 = 0;
        while (IiiiiiiiIIIII2 < this.iIiIIiiiIIiII.length) {
            if (IiiiiiiiIIIII2 == 0) {
                this.iIiIIiiiIIiII[IiiiiiiiIIIII2].setBounds(IiiiiiiiIIIII.getScreen_x() - 562, IiiiiiiiIIIII.getScreen_y() - 24, 35, 19);
            } else if (IiiiiiiiIIIII2 == 1) {
                this.iIiIIiiiIIiII[IiiiiiiiIIIII2].setBounds(IiiiiiiiIIIII.getScreen_x() - 523, IiiiiiiiIIIII.getScreen_y() - 26, 17, 27);
            } else if (IiiiiiiiIIIII2 == 2) {
                this.iIiIIiiiIIiII[IiiiiiiiIIIII2].setBounds(IiiiiiiiIIIII.getScreen_x() - 498, IiiiiiiiIIIII.getScreen_y() - 22, 21, 21);
            }
            ++IiiiiiiiIIIII2;
        }
        this.IiiiIiiiIiiIi.setBounds(0, IiiiiiiiIIIII.getScreen_y() - 42, IiiiiiiiIIIII.getScreen_x() - 468, 42);
        if (this.iiIIIiiiIiIii.isVisible()) {
            this.iiIIIiiiIiIii.ALLATORIxDEMO();
        }
        this.IiIiiiiiIIIII.ALLATORIxDEMO();
        this.iIiiIiiiiiiII.setBounds(IiiiiiiiIIIII.getScreen_x() - 106, 11, 98, 50);
        this.iiIiiiiiiIIiI.setBounds(IiiiiiiiIIIII.getScreen_x() - 180, 0, 181, 75);
        this.IiiIiiiiIIiiI.setBounds(IiiiiiiiIIIII.getScreen_x() - 175, 10, 60, 60);
        this.IIIIIiiiiIIii();
        this.IIiIIiiiIiiII.setBounds(IiiiiiiiIIIII.getScreen_x() - 59, IiiiiiiiIIIII.getScreen_y() - 150, 59, 25);
        this.iIiIIiiiIIIii.ALLATORIxDEMO();
        this.IIIiiiiiiIiiI.setBounds(IiiiiiiiIIIII.getScreen_x() - 332, IiiiiiiiIIIII.getScreen_y() - 80, 11, 37);
        if (this.iiiiIiiiIiiII != null) {
            this.iiiiIiiiIiiII.setBounds(223 + (this.iiIIiiiiIiIIi.screenData.Screen_x - 892) / 2, 0, 358, 75);
        }
        if (this.iiiIiiiiiiiIi != null) {
            this.iiiIiiiiiiiIi.iIiIiiiiIIiii();
        }
        if (this.IIiiIiiiIIiIi == null) return;
        this.IIiiIiiiIIiIi.ALLATORIxDEMO();
    }

    public void iiiIiiiiiiIIi(int type) {
        this.IiiiIiiiIiIII = type;
        if (this.IiiiIiiiIiIII == 0) {
            this.IiiIIiiiiIiIi.iIiIiiiiIIiii("sc/c/17");
        } else if (this.IiiiIiiiIiIII == 1) {
            this.IiiIIiiiiIiIi.iIiIiiiiIIiii("sc/c/18");
        } else if (this.IiiiIiiiIiIII == 2) {
            this.IiiIIiiiiIiIi.iIiIiiiiIIiii("sc/c/19");
        } else if (this.IiiiIiiiIiIII == 3) {
            this.IiiIIiiiiIiIi.iIiIiiiiIIiii("sc/c/20");
        } else if (this.IiiiIiiiIiIII == 4) {
            this.IiiIIiiiiIiIi.iIiIiiiiIIiii("sc/c/21");
        }
        this.IiiIiiiiiiIiI();
    }

    public void ALLATORIxDEMO(int type, double xs) {
        this.iIIiIiiiiiiIi.ALLATORIxDEMO(type, xs);
    }

    public iIiIiiiiIiIII ALLATORIxDEMO() {
        return this.IiIIIiiiIiiIi;
    }

    protected void paintChildren(Graphics g) {
        if (this.IiiIIiiiiiiiI != null) {
            if (!IIiiIiiiiIIiI.ALLATORIxDEMO((String)this.iiiiIiiiIIiii.getText(), (String)this.IiiIIiiiiiiiI)) {
                this.iiiiIiiiIIiii.setText(this.IiiIIiiiiiiiI);
            }
            this.IiiIIiiiiiiiI = null;
        }
        if (this.IIIiiiiiIIiII != null) {
            if (!IIiiIiiiiIIiI.ALLATORIxDEMO((String)this.iiIIIiiiiiiiI.getText(), (String)this.IiiIIiiiiiiiI)) {
                this.iiIIIiiiiiiiI.setText(this.IIIiiiiiIIiII);
            }
            this.IIIiiiiiIIiII = null;
        }
        if (this.iiIiiiiiiiiiI != null) {
            if (!IIiiIiiiiIIiI.ALLATORIxDEMO((String)this.IIiIiiiiIiiiI.getText(), (String)this.IiiIIiiiiiiiI)) {
                this.IIiIiiiiIiiiI.setText(this.iiIiiiiiiiiiI);
            }
            this.iiIiiiiiiiiiI = null;
        }
        if (this.IIiiiiiiIiiII) {
            this.IIIiIiiiIiIii();
            this.IIiiiiiiIiiII = false;
        }
        super.paintChildren(g);
        if (this.IiIiiiiiiiiIi != null && this.IiIiiiiiiiiIi.isVisible()) {
            iIIIIiiiiiIIi.ALLATORIxDEMO(iIiIIiiiIiiiI.ALLATORIxDEMO(), 0);
            iIIIIiiiiiIIi.ALLATORIxDEMO(g, 205, 5);
        }
        if (this.iiIiIiiiiIIII == null) return;
        if (!this.iiIiIiiiiIIII.isVisible()) return;
        IIiiiiiiiIIIi.ALLATORIxDEMO(iIiIIiiiIiiiI.ALLATORIxDEMO(), 0);
        IIiiiiiiiIIIi.ALLATORIxDEMO(g, 245, 5);
    }

    public void iiiIiiiiiiIIi() {
        List<IIIIIiiiIiIii> IiiiiiiiIIIII = this.ALLATORIxDEMO();
        int IiiiiiiiIIIII2 = this.iIiIiiiiIIiii().size();
        boolean IiiiiiiiIIIII3 = this.ALLATORIxDEMO().ALLATORIxDEMO() == 3;
        int IiiiiiiiIIIII4 = 0;
        while (IiiiiiiiIIIII4 < IiiiiiiiIIIII.size()) {
            IIIIIiiiIiIii IiiiiiiiIIIII5 = IiiiiiiiIIIII.get(IiiiiiiiIIIII4);
            int IiiiiiiiIIIII6 = IiiiiiiiIIIII2 + (IiiiiiiiIIIII.size() - 1 - IiiiiiiiIIIII4);
            int IiiiiiiiIIIII7 = IiiiiiiiIIIII6 % 4 * 60 + 19;
            int IiiiiiiiIIIII8 = IiiiiiiiIIIII6 / 4 * 55 + 80;
            try {
                int IiiiiiiiIIIII9 = 0;
                while (IiiiiiiiIIIII5.getImgW() == -1 && IiiiiiiiIIIII9 < 10) {
                    ++IiiiiiiiIIIII9;
                    IiiiiiiiIIIII5.getImageSize();
                    Thread.sleep(5L);
                }
            }
            catch (Exception IiiiiiiiIIIII10) {
                IiiiiiiiIIIII10.printStackTrace();
            }
            if (IiiiiiiiIIIII5.getImage() == IIIIIiiiIiiII.ALLATORIxDEMO()) {
                IiiiiiiiIIIII5.setBounds(IiiiiiiiIIIII7, IiiiiiiiIIIII8, 40, 40);
            } else {
                IiiiiiiiIIIII5.setBounds(IiiiiiiiIIIII7, IiiiiiiiIIIII8, IiiiiiiiIIIII5.getImgW(), IiiiiiiiIIIII5.getImgH());
            }
            ++IiiiiiiiIIIII4;
            IiiiiiiiIIIII5.setVisible(IiiiiiiiIIIII3);
        }
    }

    public void iiiIiiiiiiIIi(boolean aFlag) {
        this.IIiIiiiiIIiII.setVisible(aFlag);
        this.IiIIIiiiiiiiI.setVisible(aFlag);
        this.IIIIIiiiIIIII.setVisible(aFlag);
        this.iiiiIiiiIIiii.setVisible(aFlag);
        this.iiIIIiiiiiiiI.setVisible(aFlag);
        this.IIiIiiiiIiiiI.setVisible(aFlag);
        this.iIiIiiiiIiIii.setVisible(aFlag);
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iiIiIiiiiIIIi.length) {
            this.iiIiIiiiiIIIi[IiiiiiiiIIIII++].setVisible(aFlag);
        }
        if (this.IiIiiiiiiiiIi != null) {
            this.IiIiiiiiiiiIi.setVisible(aFlag);
        }
        if (this.iiIiIiiiiIIII == null) return;
        this.iiIiIiiiiIIII.setVisible(aFlag);
    }

    public void iIiIiiiiIIiii(int id) {
        if (this.IIiiIiiiIIiIi != null && this.IIiiIiiiIIiIi.isVisible() && this.IIiiIiiiIIiIi.IiIIIiiiiIiiI == id) {
            this.iIiIiiiiIIiIi();
            return;
        }
        if (this.IIiiIiiiIIiIi == null) {
            this.IIiiIiiiIIiIi = new iIiIIiiiiIiii(this);
            this.add((Component)this.IIiiIiiiIIiIi, 0);
        }
        this.IIiiIiiiIIiIi.ALLATORIxDEMO(id);
        this.IIiiIiiiIIiIi.setVisible(true);
    }
}
