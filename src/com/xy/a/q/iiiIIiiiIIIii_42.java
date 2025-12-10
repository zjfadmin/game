/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.q.IiIIIiiiiIiIi
 *  com.xy.battle.BattleScene
 *  com.xy.battle.TypeState
 *  com.xy.d.IiIiIiiiiIIiI
 *  com.xy.entity.Lingbao
 *  com.xy.entity.RoleSummoning
 *  com.xy.game.RoleData
 *  com.xy.game.RolePet
 *  com.xy.i.IiiiiiiiiIIII
 *  com.xy.q.IiIIIiiiiIIiI
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.q.iIiIiiiiIiIII
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.socket.Agreement
 *  com.xy.text.GameView
 *  com.xy.w.IIIIIiiiIiiII
 *  com.xy.w.IIIiiiiiIiIiI
 */
package com.xy.a.q;

import com.xy.a.q.IiIIIiiiiIiIi;
import com.xy.battle.BattleScene;
import com.xy.battle.TypeState;
import com.xy.d.IiIiIiiiiIIiI;
import com.xy.entity.Lingbao;
import com.xy.entity.RoleSummoning;
import com.xy.game.RoleData;
import com.xy.game.RolePet;
import com.xy.i.IiiiiiiiiIIII;
import com.xy.q.IiIIIiiiiIIiI;
import com.xy.q.IiiiIiiiiIiIi;
import com.xy.q.iIiIiiiiIiIII;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import com.xy.w.IIIIIiiiIiiII;
import com.xy.w.IIIiiiiiIiIiI;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;

public class iiiIIiiiIIIii
extends IiiiIiiiiIiIi {
    private boolean IiIiiiiiIIIII;
    private iIiIiiiiIiIII iiIiIiiiiIIIi;
    private int iiiiIiiiIiiII = -1;
    private JLabel iiiIiiiiiiiIi;
    private BigDecimal[] iIiiIiiiiiiII;
    private IIIiiiiiIiIiI[] IIiiIiiiIIiIi;
    private IiiiiiiiiIIII[] iIiIiiiiIiIii;
    private JScrollPane IiIIIiiiiIiiI;
    private JList<iIiIiiiiIiIII> iiIiiiiiiiIii;
    private List<iIiIiiiiIiIII> IiiiiiiiIIIII;
    private IiIIIiiiiIiIi[] ALLATORIxDEMO;

    public void iIiIiiiiIIiii() {
        if (this.ALLATORIxDEMO() == null) {
            return;
        }
        this.ALLATORIxDEMO[2].ALLATORIxDEMO(this.iiIIiiiiIiIIi.systemData.IIIIIiiiiIIii() ? 0 : 1);
        this.iiiIiiiiiiIIi(this.iiiiIiiiIiiII);
        super.iIiIiiiiIIiii();
    }

    public void IIIiiiiiiIIiI() {
        List<BigDecimal> IiiiiiiiIIIII = this.ALLATORIxDEMO(0);
        this.iiIiIiiiiIIIi = null;
        this.iiIiiiiiiiIii.removeAll();
        int IiiiiiiiIIIII2 = 0;
        while (IiiiiiiiIIIII2 < this.IiiiiiiiIIIII.size()) {
            this.IiiiiiiiIIIII.get(IiiiiiiiIIIII2++).ALLATORIxDEMO();
        }
        RoleData IiiiiiiiIIIII22 = this.ALLATORIxDEMO();
        List IiiiiiiiIIIII3 = IiiiiiiiIIIII22.ALLATORIxDEMO();
        int IiiiiiiiIIIII4 = 0;
        int IiiiiiiiIIIII5 = IiiiiiiiIIIII3.size();
        while (IiiiiiiiIIIII4 < IiiiiiiiIIIII5) {
            RolePet IiiiiiiiIIIII6 = (RolePet)IiiiiiiiIIIII3.get(IiiiiiiiIIIII4);
            if (!(IiiiiiiiIIIII6.getHelp() == 0 || IiiiiiiiIIIII != null && IiiiiiiiIIIII.contains(IiiiiiiiIIIII6.getId()))) {
                this.ALLATORIxDEMO(IiiiiiiiIIIII6.getPet());
            }
            ++IiiiiiiiIIIII4;
        }
        this.IIIIIiiiiIIii();
        this.iiIiiiiiiiIii.setPreferredSize(new Dimension(180, 20 * this.iiIiiiiiiiIii.getComponentCount()));
        this.iiiIiiiiiiIIi();
    }

    public void iIiIiiiiIIiIi(int showType) {
        this.iiiiIiiiIiiII = showType;
    }

    public void IIIIIiiiiIIii() {
        if (this.iIiiIiiiiiiII == null) {
            return;
        }
        int IiiiiiiiIIIII = this.iiIiiiiiiiIii.getComponentCount();
        ArrayList<iIiIiiiiIiIII> IiiiiiiiIIIII2 = new ArrayList<iIiIiiiiIiIII>();
        int IiiiiiiiIIIII3 = 0;
        while (IiiiiiiiIIIII3 < this.IiiiiiiiIIIII.size()) {
            IiiiiiiiIIIII2.add(this.IiiiiiiiIIIII.get(IiiiiiiiIIIII3++));
        }
        IiiiiiiiIIIII3 = this.iIiiIiiiiiiII.length - 1;
        while (IiiiiiiiIIIII3 >= 0) {
            this.ALLATORIxDEMO(this.iIiiIiiiiiiII[IiiiiiiiIIIII3--], IiiiiiiiIIIII2);
        }
        IiiiiiiiIIIII3 = 0;
        while (IiiiiiiiIIIII3 < IiiiiiiiIIIII2.size() && IiiiiiiiIIIII3 < IiiiiiiiIIIII) {
            ((iIiIiiiiIiIII)IiiiiiiiIIIII2.get(IiiiiiiiIIIII3)).ALLATORIxDEMO(IiiiiiiiIIIII3 + 1);
            iIiIiiiiIiIII iIiIiiiiIiIII2 = (iIiIiiiiIiIII)IiiiiiiiIIIII2.get(IiiiiiiiIIIII3);
            int n = 20 * IiiiiiiiIIIII3;
            ++IiiiiiiiIIIII3;
            iIiIiiiiIiIII2.setBounds(0, n, 180, 20);
        }
        this.IiiiiiiiIIIII = IiiiiiiiIIIII2;
    }

    public void ALLATORIxDEMO(BigDecimal id, List<iIiIiiiiIiIII> list) {
        int IiiiiiiiIIIII = 0;
        int IiiiiiiiIIIII2 = list.size();
        while (IiiiiiiiIIIII < IiiiiiiiIIIII2) {
            if (list.get(IiiiiiiiIIIII).ALLATORIxDEMO() == id.longValue()) {
                list.add(0, list.remove(IiiiiiiiIIIII));
                return;
            }
            ++IiiiiiiiIIIII;
        }
    }

    /*
     * WARNING - void declaration
     */
    public List<BigDecimal> ALLATORIxDEMO(int type) {
        this.IiIiiiiiIIIII = this.iiIIiiiiIiIIi.getBattleScene() != null && this.iiIIiiiiIiIIi.getClient().gameBattle;
        this.iIiiIiiiiiiII = null;
        ArrayList<BigDecimal> IiiiiiiiIIIII = null;
        if (!this.IiIiiiiiIIIII) return IiiiiiiiIIIII;
        RoleData IiiiiiiiIIIII2 = this.ALLATORIxDEMO();
        BattleScene IiiiiiiiIIIII3 = this.iiIIiiiiIiIIi.getBattleScene();
        IiIiIiiiiIIiI IiiiiiiiIIIII4 = IiiiiiiiIIIII3 != null ? IiiiiiiiIIIII3.getBattleUnit(0, IiiiiiiiIIIII2.getRoleId()) : null;
        if (IiiiiiiiIIIII4 == null) return IiiiiiiiIIIII;
        IiiiiiiiIIIII = new ArrayList<BigDecimal>();
        List IiiiiiiiIIIII5 = IiiiiiiiIIIII4.ALLATORIxDEMO().ALLATORIxDEMO(type == 0 ? "\u53ec\u5524\u517d" : "\u7075\u5b9d");
        int IiiiiiiiIIIII6 = 0;
        while (IiiiiiiiIIIII6 < IiiiiiiiIIIII5.size()) {
            if (((TypeState)IiiiiiiiIIIII5.get(IiiiiiiiIIIII6)).getState() != 0) {
                void IiiiiiiiIIIII7;
                int n = Integer.parseInt(((TypeState)IiiiiiiiIIIII5.get(IiiiiiiiIIIII6)).getType());
                IiiiiiiiIIIII.add(new BigDecimal((int)IiiiiiiiIIIII7));
            }
            ++IiiiiiiiIIIII6;
        }
        if (type == 0) {
            this.iIiiIiiiiiiII = IiiiiiiiIIIII4.ALLATORIxDEMO().petIds;
            return IiiiiiiiIIIII;
        }
        if (type != 1) return IiiiiiiiIIIII;
        this.iIiiIiiiiiiII = IiiiiiiiIIIII4.ALLATORIxDEMO().lingIds;
        return IiiiiiiiIIIII;
    }

    public void iiiiiiiiIIiii() {
        List<BigDecimal> IiiiiiiiIIIII = this.ALLATORIxDEMO(0);
        this.iiIiIiiiiIIIi = null;
        this.iiIiiiiiiiIii.removeAll();
        int IiiiiiiiIIIII2 = 0;
        while (IiiiiiiiIIIII2 < this.IiiiiiiiIIIII.size()) {
            this.IiiiiiiiIIIII.get(IiiiiiiiIIIII2++).ALLATORIxDEMO();
        }
        RoleData IiiiiiiiIIIII22 = this.ALLATORIxDEMO();
        int IiiiiiiiIIIII3 = 0;
        int IiiiiiiiIIIII4 = IiiiiiiiIIIII22.lingbaoList.size();
        while (IiiiiiiiIIIII3 < IiiiiiiiIIIII4) {
            BigDecimal IiiiiiiiIIIII5 = (BigDecimal)IiiiiiiiIIIII22.lingbaoList.get(IiiiiiiiIIIII3);
            Lingbao IiiiiiiiIIIII6 = IiiiiiiiIIIII22.getLingbao(IiiiiiiiIIIII5);
            if (!(IiiiiiiiIIIII6 == null || IiiiiiiiIIIII != null && IiiiiiiiIIIII.contains(IiiiiiiiIIIII6.getBaoid()))) {
                this.ALLATORIxDEMO(IiiiiiiiIIIII6);
            }
            ++IiiiiiiiIIIII3;
        }
        this.IIIIIiiiiIIii();
        this.iiIiiiiiiiIii.setPreferredSize(new Dimension(180, 20 * this.iiIiiiiiiiIii.getComponentCount()));
        this.iiiIiiiiiiIIi();
    }

    public void iiiIiiiiiiIIi(int id) {
        if (id == -1) {
            id = this.iiiiIiiiIiiII == 0 ? 1 : 0;
        }
        this.iiiiIiiiIiiII = id;
        this.iiiIiiiiiiiIi.setText(this.iiiiIiiiIiiII == 0 ? "\u53ec\u5524\u517d" : "\u7075\u5b9d");
        this.iIiIiiiiIiIii[0].setText(this.iiiiIiiiIiiII == 0 ? "\u5ba0" : "\u7075");
        IiIIIiiiiIiIi.ALLATORIxDEMO((IiIIIiiiiIiIi)this.ALLATORIxDEMO[1]).setText(this.iiiiIiiiIiiII == 0 ? "\u9501\u5b9a\u9996\u53d1\u53ec\u5524\u517d" : "\u9501\u5b9a\u9996\u53d1\u7075\u5b9d");
        if (this.iiiiIiiiIiiII == 0) {
            this.IIIiiiiiiIIiI();
            return;
        }
        this.iiiiiiiiIIiii();
    }

    public void iIiIiiiiIIiii(int type) {
        if (this.iiIiIiiiiIIIi == null) {
            return;
        }
        int IiiiiiiiIIIII = this.iiIiIiiiiIIIi.ALLATORIxDEMO();
        int IiiiiiiiIIIII2 = type == 0 ? IiiiiiiiIIIII - 1 : (type == 1 ? IiiiiiiiIIIII + 1 : (type == 2 ? 1 : this.iiIiiiiiiiIii.getComponentCount()));
        if (IiiiiiiiIIIII2 < 1) return;
        if (IiiiiiiiIIIII2 > this.iiIiiiiiiiIii.getComponentCount()) {
            return;
        }
        iIiIiiiiIiIII IiiiiiiiIIIII3 = this.IiiiiiiiIIIII.get(IiiiiiiiIIIII2 - 1);
        long IiiiiiiiIIIII4 = this.iiIiIiiiiIIIi.ALLATORIxDEMO();
        String IiiiiiiiIIIII5 = this.iiIiIiiiiIIIi.ALLATORIxDEMO().getText();
        this.iiIiIiiiiIIIi.ALLATORIxDEMO(IiiiiiiiIIIII3.ALLATORIxDEMO(), IiiiiiiiIIIII3.ALLATORIxDEMO().getText());
        IiiiiiiiIIIII3.ALLATORIxDEMO(IiiiiiiiIIIII4, IiiiiiiiIIIII5);
        this.ALLATORIxDEMO(IiiiiiiiIIIII3);
    }

    public void ALLATORIxDEMO(Lingbao lingbao) {
        int IiiiiiiiIIIII22 = 0;
        while (IiiiiiiiIIIII22 < this.IiiiiiiiIIIII.size()) {
            iIiIiiiiIiIII IiiiiiiiIIIII = this.IiiiiiiiIIIII.get(IiiiiiiiIIIII22);
            if (IiiiiiiiIIIII.ALLATORIxDEMO() == 0L) {
                IiiiiiiiIIIII.ALLATORIxDEMO(IiiiiiiiIIIII22 + 1);
                IiiiiiiiIIIII.ALLATORIxDEMO(lingbao);
                IiiiiiiiIIIII.setBounds(0, 20 * IiiiiiiiIIIII22, 180, 20);
                this.iiIiiiiiiiIii.add((Component)IiiiiiiiIIIII);
                return;
            }
            ++IiiiiiiiIIIII22;
        }
        iIiIiiiiIiIII IiiiiiiiIIIII22 = new iIiIiiiiIiIII((IiiiIiiiiIiIi)this);
        IiiiiiiiIIIII22.ALLATORIxDEMO(this.iiIiiiiiiiIii.getComponentCount() + 1);
        IiiiiiiiIIIII22.ALLATORIxDEMO(lingbao);
        IiiiiiiiIIIII22.setBounds(0, 20 * this.iiIiiiiiiiIii.getComponentCount(), 180, 20);
        this.IiiiiiiiIIIII.add(IiiiiiiiIIIII22);
        this.iiIiiiiiiiIii.add((Component)IiiiiiiiIIIII22);
    }

    public void IiiIiiiiiiIiI() {
        RoleData IiiiiiiiIIIII = this.ALLATORIxDEMO();
        if (this.iiiiIiiiIiiII == 0) {
            IiiiiiiiIIIII.setHelpPet(!IiiiiiiiIIIII.ALLATORIxDEMO());
            IiiiiiiiIIIII.iIiIiiiiIIiii();
        } else {
            IiiiiiiiIIIII.setHelpLing(!IiiiiiiiIIIII.iIiIiiiiIIiii());
            IiiiiiiiIIIII.IIIiIiiiIiIii();
        }
        if (this.IiIiiiiiIIIII) {
            this.iIiIiiiiIIiIi();
        }
        this.iiiIiiiiiiIIi();
    }

    public BigDecimal[] ALLATORIxDEMO() {
        BigDecimal[] IiiiiiiiIIIII = new BigDecimal[this.iiIiiiiiiiIii.getComponentCount()];
        int IiiiiiiiIIIII2 = 0;
        while (IiiiiiiiIIIII2 < IiiiiiiiIIIII.length) {
            int n = IiiiiiiiIIIII2;
            BigDecimal bigDecimal = new BigDecimal(this.IiiiiiiiIIIII.get(IiiiiiiiIIIII2).ALLATORIxDEMO());
            ++IiiiiiiiIIIII2;
            IiiiiiiiIIIII[n] = bigDecimal;
        }
        return IiiiiiiiIIIII;
    }

    public void ALLATORIxDEMO(iIiIiiiiIiIII petGrid) {
        this.iiIiIiiiiIIIi = petGrid;
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IiiiiiiiIIIII.size()) {
            iIiIiiiiIiIII IiiiiiiiIIIII2 = this.IiiiiiiiIIIII.get(IiiiiiiiIIIII);
            IiiiiiiiIIIII2.ALLATORIxDEMO().setForeground(petGrid == IiiiiiiiIIIII2 ? Color.RED : Color.green);
            ++IiiiiiiiIIIII;
        }
    }

    /*
     * Unable to fully structure code
     */
    public void iIiIiiiiIIiIi() {
        block6: {
            if (!this.IiIiiiiiIIIII) break block6;
            IiiiiiiiIIIII = this.ALLATORIxDEMO();
            IiiiiiiiIIIII = this.ALLATORIxDEMO();
            if (IiiiiiiiIIIII.length == 0) {
                return;
            }
            IiiiiiiiIIIII = new StringBuffer();
            IiiiiiiiIIIII.append(this.iiiiIiiiIiiII == 0 ? 7 : 8);
            if (this.iiiiIiiiIiiII == 0) {
                IiiiiiiiIIIII.append(IiiiiiiiIIIII.ALLATORIxDEMO() != false ? 1 : 0);
            } else {
                IiiiiiiiIIIII.append(IiiiiiiiIIIII.iIiIiiiiIIiii() != false ? 1 : 0);
            }
            IiiiiiiiIIIII = 0;
            if (true) ** GOTO lbl29
        }
        IiiiiiiiIIIII = this.ALLATORIxDEMO();
        if (this.iiiiIiiiIiiII == 0) {
            IiiiiiiiIIIII.setHelpBB(this.ALLATORIxDEMO());
            return;
        }
        IiiiiiiiIIIII.setHelpLB(this.ALLATORIxDEMO());
        return;
        do {
            IiiiiiiiIIIII.append("|");
            IiiiiiiiIIIII.append(IiiiiiiiIIIII[IiiiiiiiIIIII++]);
lbl29:
            // 2 sources

        } while (IiiiiiiiIIIII < IiiiiiiiIIIII.length);
        IiiiiiiiIIIII = Agreement.getSendTextAES((String)"1", (String)IiiiiiiiIIIII.toString());
        this.iiIIiiiiIiIIi.getClient().ALLATORIxDEMO(IiiiiiiiIIIII);
        IiiiiiiiIIIII = this.iiIIiiiiIiIIi.getBattleScene();
        IiiiiiiiIIIII = IiiiiiiiIIIII != null ? IiiiiiiiIIIII.getBattleUnit(0, this.ALLATORIxDEMO().getRoleId()) : null;
        if (IiiiiiiiIIIII == null) return;
        if (this.iiiiIiiiIiiII == 0) {
            IiiiiiiiIIIII.ALLATORIxDEMO().petIds = IiiiiiiiIIIII;
            return;
        }
        if (this.iiiiIiiiIiiII != 1) return;
        IiiiiiiiIIIII.ALLATORIxDEMO().lingIds = IiiiiiiiIIIII;
    }

    public void iiiIiiiiiiIIi() {
        RoleData IiiiiiiiIIIII = this.ALLATORIxDEMO();
        if (this.iiiiIiiiIiiII == 0) {
            this.ALLATORIxDEMO[0].ALLATORIxDEMO(IiiiiiiiIIIII.ALLATORIxDEMO() ? 1 : 0);
            return;
        }
        if (this.iiiiIiiiIiiII != 1) return;
        this.ALLATORIxDEMO[0].ALLATORIxDEMO(IiiiiiiiIIIII.iIiIiiiiIIiii() ? 1 : 0);
    }

    public iiiIIiiiIIIii(GameView gameView) {
        super(62, 2, IiiiIiiiiIiIi.iIIIIiiiiiIIi, gameView);
        this.ALLATORIxDEMO(-3, 0, 297, 442, IiiiIiiiiIiIi.iiIIIiiiiiiiI);
        this.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/1.png", (int)68, (int)68, (int)68, (int)68, (boolean)false), "\u8bbe\u7f6e\u6392\u5e8f");
        this.iiiIiiiiiiiIi = IiIIIiiiiIIiI.ALLATORIxDEMO((int)47, (int)26, (int)200, (int)21, (int)0, (Color)iiIIiiiiIiiII.ALLATORIxDEMO((String)"#cFFFFFF"), (Font)iiIIiiiiIiiII.iiiiIiiiIiiII);
        this.iiiIiiiiiiiIi.setText("\u53ec\u5524\u517d");
        this.add(this.iiiIiiiiiiiIi);
        this.iIiIiiiiIiIii = new IiiiiiiiiIIII[6];
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iIiIiiiiIiIii.length) {
            this.iIiIiiiiIiIii[IiiiiiiiIIIII] = new IiiiiiiiiIIII("sc/e/40.png", 1, 1 + IiiiiiiiIIIII, iiIIiiiiIiiII.iiIiiiiiiIIiI, null, IiiiiiiiIIIII == 0 ? "\u5ba0" : (IiiiiiiiIIIII == 1 ? "" : (IiiiiiiiIIIII == 2 ? "" : (IiiiiiiiIIIII == 3 ? "\u9876" : (IiiiiiiiIIIII == 4 ? "\u5e95" : (IiiiiiiiIIIII == 5 ? "\u4fdd\u5b58\u8bbe\u7f6e" : ""))))), (IiiiIiiiiIiIi)this);
            if (IiiiiiiiIIIII == 0) {
                this.iIiIiiiiIiIii[IiiiiiiiIIIII].setBounds(257, 74, 18, 18);
            } else if (IiiiiiiiIIIII == 1) {
                this.iIiIiiiiIiIii[IiiiiiiiIIIII].setImage("sc/e/47.png");
                this.iIiIiiiiIiIii[IiiiiiiiIIIII].setBounds(257, 128, 18, 18);
            } else if (IiiiiiiiIIIII == 2) {
                this.iIiIiiiiIiIii[IiiiiiiiIIIII].setImage("sc/e/48.png");
                this.iIiIiiiiIiIii[IiiiiiiiIIIII].setBounds(257, 157, 18, 18);
            } else if (IiiiiiiiIIIII == 3) {
                this.iIiIiiiiIiIii[IiiiiiiiIIIII].setBounds(257, 211, 18, 18);
            } else if (IiiiiiiiIIIII == 4) {
                this.iIiIiiiiIiIii[IiiiiiiiIIIII].setBounds(257, 240, 18, 18);
            } else if (IiiiiiiiIIIII == 5) {
                this.iIiIiiiiIiIii[IiiiiiiiIIIII].setImage("sc/e/28.png");
                this.iIiIiiiiIiIii[IiiiiiiiIIIII].setBounds(47, 333, 85, 18);
            }
            this.add((Component)this.iIiIiiiiIiIii[IiiiiiiiIIIII++]);
        }
        this.IiiiiiiiIIIII = new ArrayList<iIiIiiiiIiIII>();
        this.iiIiiiiiiiIii = new JList();
        this.iiIiiiiiiiIii.setBackground(iiIIiiiiIiiII.IIiIiiiiIIiII);
        this.iiIiiiiiiiIii.setSelectionMode(0);
        this.IiIIIiiiiIiiI = IiIIIiiiiIIiI.ALLATORIxDEMO((int)47, (int)47, (int)200, (int)279, this.iiIiiiiiiiIii, (int)20);
        this.add(this.IiIIIiiiiIiiI);
        this.ALLATORIxDEMO = new IiIIIiiiiIiIi[3];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.ALLATORIxDEMO.length) {
            int n = IiiiiiiiIIIII;
            IiIIIiiiiIiIi iiIIIiiiiIiIi = new IiIIIiiiiIiIi(this, IiiiiiiiIIIII, this);
            ++IiiiiiiiIIIII;
            this.ALLATORIxDEMO[n] = iiIIIiiiiIiIi;
        }
        this.IIiiIiiiIIiIi = new IIIiiiiiIiIiI[2];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IIiiIiiiIIiIi.length) {
            this.IIiiIiiiIIiIi[IiiiiiiiIIIII] = new IIIiiiiiIiIiI();
            if (IiiiiiiiIIIII == 0) {
                this.IIiiIiiiIIiIi[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/25.png", (int)2, (int)2, (int)2, (int)2, (boolean)false));
                this.IIiiIiiiIIiIi[IiiiiiiiIIIII].setBounds(47, 26, 200, 21);
            } else if (IiiiiiiiIIIII == 1) {
                this.IIiiIiiiIIiIi[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/24.png", (int)2, (int)2, (int)2, (int)2, (boolean)false));
                this.IIiiIiiiIIiIi[IiiiiiiiIIIII].setBounds(47, 26, 200, 300);
            }
            this.add((Component)this.IIiiIiiiIIiIi[IiiiiiiiIIIII++]);
        }
    }

    public void ALLATORIxDEMO(RoleSummoning pet) {
        int IiiiiiiiIIIII22 = 0;
        while (IiiiiiiiIIIII22 < this.IiiiiiiiIIIII.size()) {
            iIiIiiiiIiIII IiiiiiiiIIIII = this.IiiiiiiiIIIII.get(IiiiiiiiIIIII22);
            if (IiiiiiiiIIIII.ALLATORIxDEMO() == 0L) {
                IiiiiiiiIIIII.ALLATORIxDEMO(IiiiiiiiIIIII22 + 1);
                IiiiiiiiIIIII.ALLATORIxDEMO(pet);
                IiiiiiiiIIIII.setBounds(0, 20 * IiiiiiiiIIIII22, 180, 20);
                this.iiIiiiiiiiIii.add((Component)IiiiiiiiIIIII);
                return;
            }
            ++IiiiiiiiIIIII22;
        }
        iIiIiiiiIiIII IiiiiiiiIIIII22 = new iIiIiiiiIiIII((IiiiIiiiiIiIi)this);
        IiiiiiiiIIIII22.ALLATORIxDEMO(this.iiIiiiiiiiIii.getComponentCount() + 1);
        IiiiiiiiIIIII22.ALLATORIxDEMO(pet);
        IiiiiiiiIIIII22.setBounds(0, 20 * this.iiIiiiiiiiIii.getComponentCount(), 180, 20);
        this.IiiiiiiiIIIII.add(IiiiiiiiIIIII22);
        this.iiIiiiiiiiIii.add((Component)IiiiiiiiIIIII22);
    }
}
