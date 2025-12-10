/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.q.IiIIIiiiiiiII
 *  com.xy.a.q.iiIiiiiiIIiii
 *  com.xy.bean.ChongjipackBean
 *  com.xy.bean.LoginResult
 *  com.xy.entity.RoleTable
 *  com.xy.formula.SkillUtil
 *  com.xy.i.IiiiiiiiiIIII
 *  com.xy.q.IiIIIiiiiIIiI
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.readbean.Shop
 *  com.xy.socket.Agreement
 *  com.xy.text.GameView
 *  com.xy.v.IIiiIiiiiIIiI
 *  com.xy.v.IiiiIiiiiIIII
 *  com.xy.w.IIIIIiiiIiiII
 *  com.xy.w.IIIiiiiiIiIiI
 */
package com.xy.a.q;

import com.xy.a.q.IiIIIiiiiiiII;
import com.xy.a.q.iiIiiiiiIIiii;
import com.xy.bean.ChongjipackBean;
import com.xy.bean.LoginResult;
import com.xy.entity.RoleTable;
import com.xy.formula.SkillUtil;
import com.xy.i.IiiiiiiiiIIII;
import com.xy.q.IiIIIiiiiIIiI;
import com.xy.q.IiiiIiiiiIiIi;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.readbean.Shop;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import com.xy.v.IIiiIiiiiIIiI;
import com.xy.v.IiiiIiiiiIIII;
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
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class IiIiiiiiIiIii
extends IiiiIiiiiIiIi {
    private JLabel iiIiiiiiiIIiI;
    private IiiiiiiiiIIII iIiiIiiiIiIIi;
    private IiiiiiiiiIIII iiiiIiiiIIiii;
    private IiiiiiiiiIIII iIIiIiiiiiiIi;
    private JTextField IIIIiiiiiiiII;
    private IIIiiiiiIiIiI iiIIIiiiiiiiI;
    private IIIiiiiiIiIiI IiIiiiiiIIIII;
    private JLabel iiIiIiiiiIIIi;
    private List<IiIIIiiiiiiII> iiiiIiiiIiiII;
    private JLabel iiiIiiiiiiiIi;
    private IiiiiiiiiIIII iIiiIiiiiiiII;
    private List<ChongjipackBean> IIiiIiiiIIiIi;
    private JLabel iIiIiiiiIiIii;
    private JScrollPane IiIIIiiiiIiiI;
    private IIIiiiiiIiIiI iiIiiiiiiiIii;
    private int IiiiiiiiIIIII = -1;
    private IIIiiiiiIiIiI ALLATORIxDEMO;

    public void iiiiiiiiIIiii() {
        this.iIiIiiiiIiIii.setVisible(false);
        this.iiIiiiiiiIIiI.setVisible(false);
        this.iiiIiiiiiiiIi.setVisible(false);
        this.iiIiIiiiiIIIi.setVisible(false);
        this.IIIIiiiiiiiII.setVisible(false);
        this.iIiiIiiiiiiII.setVisible(false);
    }

    public void ALLATORIxDEMO(RoleTable roleTable, List<RoleTable> list) {
        this.iiiiiiiiIIiii();
        LoginResult IiiiiiiiIIIII = this.ALLATORIxDEMO().getLoginResult();
        if (list != null) {
            this.iIiIiiiiIiIii.setText(IiiiiiiiIIIII.getRolename());
            this.iiIiiiiiiIIiI.setText(String.valueOf(IiiiIiiiiIIII.iIiIiiiiIIiii((int)IiiiiiiiIIIII.getGrade())) + "\u7ea7");
            this.iiIiIiiiiIIIi.setText(SkillUtil.getSepciesN((BigDecimal)IiiiiiiiIIIII.getSpecies_id()));
            this.iiIiIiiiiIIIi.setText(IiiiiiiiIIIII.getRole_id().toString());
            this.iIiIiiiiIiIii.setVisible(true);
            this.iiIiiiiiiIIiI.setVisible(true);
            this.iiiIiiiiiiiIi.setVisible(true);
            this.iiIiIiiiiIIIi.setVisible(true);
            this.IIIIiiiiiiiII.setText(String.valueOf(list.size()));
            this.IIIIiiiiiiiII.setEditable(false);
            this.IIIIiiiiiiiII.setBounds(355, 132, 70, 15);
            this.IIIIiiiiiiiII.setVisible(true);
            return;
        }
        if (roleTable != null) {
            this.iIiIiiiiIiIii.setText(roleTable.getRolename());
            this.iiIiiiiiiIIiI.setText(String.valueOf(IiiiIiiiiIIII.iIiIiiiiIIiii((int)roleTable.getGrade())) + "\u7ea7");
            this.iiIiIiiiiIIIi.setText(SkillUtil.getSepciesN((BigDecimal)roleTable.getSpecies_id()));
            this.iiIiIiiiiIIIi.setText(roleTable.getRole_id().toString());
            this.iIiIiiiiIiIii.setVisible(true);
            this.iiIiiiiiiIIiI.setVisible(true);
            this.iiiIiiiiiiiIi.setVisible(true);
            this.iiIiIiiiiIIIi.setVisible(true);
            this.iiIiiiiiiiIii.iIiIiiiiIIiii("sc/b/B258.png");
            return;
        }
        this.IIIIiiiiiiiII.setText("");
        this.IIIIiiiiiiiII.setEditable(true);
        this.IIIIiiiiiiiII.setBounds(323, 120, 70, 15);
        this.IIIIiiiiiiiII.setVisible(true);
        this.iIiiIiiiiiiII.setVisible(true);
        if (!this.iiIIiiiiIiIIi.isVisible()) return;
        if (!this.iiIIiiiiIiIIi.gameFrame.isFocused()) return;
        this.IIIIiiiiiiiII.requestFocus();
    }

    /*
     * WARNING - void declaration
     */
    public void iIiIiiiiIIiii(List<Shop> list) {
        JPanel IiiiiiiiIIIII = (JPanel)this.IiIIIiiiiIiiI.getViewport().getView();
        IiiiiiiiIIIII.removeAll();
        if (list != null && list.size() != 0) {
            int IiiiiiiiIIIII2 = 0;
            while (IiiiiiiiIIIII2 < list.size()) {
                void IiiiiiiiIIIII3;
                Shop IiiiiiiiIIIII4 = list.get(IiiiiiiiIIIII2);
                int IiiiiiiiIIIII5 = IiiiiiiiIIIII2 / 2;
                int IiiiiiiiIIIII6 = IiiiiiiiIIIII2 % 2;
                iiIiiiiiIIiii iiIiiiiiIIiii2 = new iiIiiiiiIIiii((IiiiIiiiiIiIi)this, IiiiiiiiIIIII4);
                ++IiiiiiiiIIIII2;
                IiiiiiiiIIIII3.setBounds(IiiiiiiiIIIII6 * 235 - 15, IiiiiiiiIIIII5 * 65, 250, 65);
                IiiiiiiiIIIII.add((Component)IiiiiiiiIIIII3);
            }
            IiiiiiiiIIIII.setPreferredSize(new Dimension(479, 65 * (list.size() % 2 == 0 ? list.size() / 2 : list.size() / 2 + 1)));
        }
        if (this.ALLATORIxDEMO().iIiIiiiiIIiii(this.iIiIiiiiIIiii()) != null) return;
        this.ALLATORIxDEMO().iIiIiiiiIIiIi(this.iIiIiiiiIIiii());
    }

    public void IiiIiiiiiiIiI() {
        this.ALLATORIxDEMO(this.IIiiIiiiIIiIi);
    }

    /*
     * Enabled unnecessary exception pruning
     */
    public void iIiIiiiiIIiii(int type) {
        if (type == -1) {
            type = 1;
        }
        this.IiiiiiiiIIIII = type;
        try {
            String IiiiiiiiIIIII;
            this.iIIiIiiiiiiIi.setKeep(this.IiiiiiiiIIIII == 1);
            this.iiiiIiiiIIiii.setKeep(this.IiiiiiiiIIIII == 2);
            this.iIiiIiiiIiIIi.setKeep(this.IiiiiiiiIIIII == 3);
            this.IiIIIiiiiIiiI.getVerticalScrollBar().setValue(0);
            this.iiIiiiiiiiIii.iIiIiiiiIIiii(this.IiiiiiiiIIIII == 1 ? "sc/b/S14.png" : (this.IiiiiiiiIIIII == 2 ? "sc/b/B257.png" : "sc/b/B259.png"));
            this.iiiiiiiiIIiii();
            if (this.IiiiiiiiIIIII == 1 || this.IiiiiiiiIIIII == 2) {
                IiiiiiiiIIIII = Agreement.getSendTextAES((String)"chongjipackget", (String)String.valueOf(this.IiiiiiiiIIIII));
                this.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII);
            }
            if (this.IiiiiiiiIIIII == 2) {
                IiiiiiiiIIIII = Agreement.getSendTextAES((String)"TG01", null);
                this.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII);
                return;
            }
            if (this.IiiiiiiiIIIII != 3) return;
            IiiiiiiiIIIII = Agreement.getSendTextAES((String)"TG00", null);
            this.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII);
            this.iIiIiiiiIIiii((List)this.ALLATORIxDEMO().ALLATORIxDEMO().getNpcShopMap().get("1100"));
            return;
        }
        catch (Exception IiiiiiiiIIIII) {
            IiiiiiiiIIIII.printStackTrace();
        }
    }

    public void ALLATORIxDEMO(List<ChongjipackBean> chongjipackBeans) {
        if (chongjipackBeans == null) {
            chongjipackBeans = new ArrayList<ChongjipackBean>();
        }
        this.IIiiIiiiIIiIi = chongjipackBeans;
        int IiiiiiiiIIIII = this.iiiiIiiiIiiII.size();
        while (IiiiiiiiIIIII < chongjipackBeans.size()) {
            ++IiiiiiiiIIIII;
            this.iiiiIiiiIiiII.add(new IiIIIiiiiiiII((IiiiIiiiiIiIi)this));
        }
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iiiiIiiiIiiII.size()) {
            if (IiiiiiiiIIIII < chongjipackBeans.size()) {
                this.iiiiIiiiIiiII.get(IiiiiiiiIIIII).ALLATORIxDEMO(chongjipackBeans.get(IiiiiiiiIIIII), this.IiiiiiiiIIIII);
            } else {
                this.iiiiIiiiIiiII.get(IiiiiiiiIIIII).ALLATORIxDEMO(null, this.IiiiiiiiIIIII);
            }
            ++IiiiiiiiIIIII;
        }
        this.iIiIiiiiIIiIi();
    }

    public void iIiIiiiiIIiIi() {
        JPanel IiiiiiiiIIIII = (JPanel)this.IiIIIiiiiIiiI.getViewport().getView();
        IiiiiiiiIIIII.removeAll();
        int IiiiiiiiIIIII2 = 0;
        int IiiiiiiiIIIII3 = 0;
        while (IiiiiiiiIIIII3 < this.iiiiIiiiIiiII.size()) {
            IiIIIiiiiiiII IiiiiiiiIIIII4 = this.iiiiIiiiIiiII.get(IiiiiiiiIIIII3);
            if (IiiiiiiiIIIII4.ALLATORIxDEMO() != null) {
                IiiiiiiiIIIII4.setBounds(10, IiiiiiiiIIIII2 * 62, 463, 61);
                ++IiiiiiiiIIIII2;
                IiiiiiiiIIIII.add((Component)IiiiiiiiIIIII4);
            }
            ++IiiiiiiiIIIII3;
        }
        IiiiiiiiIIIII.setPreferredSize(new Dimension(479, 62 * IiiiiiiiIIIII2));
        if (this.ALLATORIxDEMO().iIiIiiiiIIiii(this.iIiIiiiiIIiii()) != null) return;
        this.ALLATORIxDEMO().iIiIiiiiIIiIi(this.iIiIiiiiIIiii());
    }

    public IiIiiiiiIiIii(GameView gameView) {
        super(103, 2, IiiiIiiiiIiIi.iIIIIiiiiiIIi, gameView);
        this.ALLATORIxDEMO(-1, 0, 562, 520, IiiiIiiiiIiIi.iiIIIiiiiiiiI);
        this.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/1.png", (int)68, (int)68, (int)68, (int)68, (boolean)false), "\u51b2\u7ea7\u793c\u5305");
        this.iiiiIiiiIiiII = new ArrayList<IiIIIiiiiiiII>();
        this.iIIiIiiiiiiIi = new IiiiiiiiiIIII("sc/e/38.png", 2, 21, iiIIiiiiIiiII.IIiiiiiiiIIIi, iiIIiiiiIiiII.IIiiiiiiIiiII, "\u6210\u957f\u793c\u5305", (IiiiIiiiiIiIi)this);
        this.iiiiIiiiIIiii = new IiiiiiiiiIIII("sc/e/38.png", 2, 22, iiIIiiiiIiiII.IIiiiiiiiIIIi, iiIIiiiiIiiII.IIiiiiiiIiiII, "\u6211\u7684\u63a8\u5e7f", (IiiiIiiiiIiIi)this);
        this.iIiiIiiiIiIIi = new IiiiiiiiiIIII("sc/e/38.png", 2, 23, iiIIiiiiIiiII.IIiiiiiiiIIIi, iiIIiiiiIiiII.IIiiiiiiIiiII, "\u63a8\u5e7f\u793c\u5305", (IiiiIiiiiIiIi)this);
        this.iIIiIiiiiiiIi.setOffsetTexts(iiIIiiiiIiiII.IIiiiiiiiIIII);
        this.iiiiIiiiIIiii.setOffsetTexts(iiIIiiiiIiiII.IIiiiiiiiIIII);
        this.iIiiIiiiIiIIi.setOffsetTexts(iiIIiiiiIiiII.IIiiiiiiiIIII);
        this.iIIiIiiiiiiIi.setBounds(57, 16, 130, 33);
        this.iiiiIiiiIIiii.setBounds(189, 16, 130, 33);
        this.iIiiIiiiIiIIi.setBounds(321, 16, 130, 33);
        this.add((Component)this.iIIiIiiiiiiIi);
        this.add((Component)this.iiiiIiiiIIiii);
        this.add((Component)this.iIiiIiiiIiIIi);
        this.iIiIiiiiIiIii = new JLabel();
        this.iiIiiiiiiIIiI = new JLabel();
        this.iiiIiiiiiiiIi = new JLabel();
        this.iiIiIiiiiIIIi = new JLabel();
        this.iIiIiiiiIiIii.setBounds(315, 88, 70, 15);
        this.iiIiiiiiiIIiI.setBounds(448, 88, 70, 15);
        this.iiiIiiiiiiiIi.setBounds(315, 109, 70, 15);
        this.iiIiIiiiiIIIi.setBounds(448, 109, 70, 15);
        this.iIiIiiiiIiIii.setForeground(Color.WHITE);
        this.iiIiiiiiiIIiI.setForeground(Color.WHITE);
        this.iiiIiiiiiiiIi.setForeground(Color.WHITE);
        this.iiIiIiiiiIIIi.setForeground(Color.WHITE);
        this.iIiIiiiiIiIii.setFont(iiIIiiiiIiiII.iiIiiiiiiIIiI);
        this.iiIiiiiiiIIiI.setFont(iiIIiiiiIiiII.iiIiiiiiiIIiI);
        this.iiiIiiiiiiiIi.setFont(iiIIiiiiIiiII.iiIiiiiiiIIiI);
        this.iiIiIiiiiIIIi.setFont(iiIIiiiiIiiII.iiIiiiiiiIIiI);
        this.IIIIiiiiiiiII = IiIIIiiiiIIiI.ALLATORIxDEMO((Font)iiIIiiiiIiiII.iiIiiiiiiIIiI, (Color)Color.WHITE);
        this.IIIIiiiiiiiII.setEditable(false);
        this.IIIIiiiiiiiII.setBounds(355, 132, 70, 15);
        this.IIIIiiiiiiiII.setBounds(323, 120, 70, 15);
        this.IIIIiiiiiiiII.setText("\u6b21\u6570");
        this.iIiiIiiiiiiII = new IiiiiiiiiIIII("sc/e/7.png", 1, 24, iiIIiiiiIiiII.iiiiIiiiIiiII, iiIIiiiiIiiII.IIiiiiiiIiiII, "\u7ed1\u5b9a", (IiiiIiiiiIiIi)this);
        this.iIiiIiiiiiiII.setBounds(430, 115, 68, 26);
        this.add(this.iIiIiiiiIiIii);
        this.add(this.iiIiiiiiiIIiI);
        this.add(this.iiiIiiiiiiiIi);
        this.add(this.iiIiIiiiiIIIi);
        this.add(this.IIIIiiiiiiiII);
        this.add((Component)this.iIiiIiiiiiiII);
        JPanel IiiiiiiiIIIII = new JPanel();
        IiiiiiiiIIIII.setBackground(null);
        IiiiiiiiIIIII.setOpaque(false);
        IiiiiiiiIIIII.setBorder(null);
        IiiiiiiiIIIII.setLayout(null);
        this.IiIIIiiiiIiiI = IiIIIiiiiIIiI.ALLATORIxDEMO((int)47, (int)180, (int)479, (int)310, (Component)IiiiiiiiIIIII, (int)20);
        this.add(this.IiIIIiiiiIiiI);
        this.ALLATORIxDEMO = new IIIiiiiiIiIiI(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/35.png", (int)80, (int)10, (int)80, (int)10, (boolean)false));
        this.ALLATORIxDEMO.setBounds(38, 30, 491, 20);
        this.add((Component)this.ALLATORIxDEMO);
        this.IiIiiiiiIIIII = new IIIiiiiiIiIiI(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/25.png", (int)2, (int)2, (int)2, (int)2, (boolean)false));
        this.iiIIIiiiiiiiI = new IIIiiiiiIiIiI(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/24.png", (int)2, (int)2, (int)2, (int)2, (boolean)false));
        this.IiIiiiiiIIIII.setBounds(45, 160, 478, 21);
        this.iiIIIiiiiiiiI.setBounds(45, 160, 478, 330);
        this.add((Component)this.IiIiiiiiIIIII);
        this.add((Component)this.iiIIIiiiiiiiI);
        this.iiIiiiiiiiIii = new IIIiiiiiIiIiI();
        this.iiIiiiiiiiIii.setBounds(45, 51, 479, 100);
        this.add((Component)this.iiIiiiiiiiIii);
        if (!this.ALLATORIxDEMO().ALLATORIxDEMO(2, 11)) return;
        this.iiiiIiiiIIiii.setVisible(false);
        this.iIiiIiiiIiIIi.setVisible(false);
    }

    public void iiiIiiiiiiIIi() {
        String IiiiiiiiIIIII = this.IIIIiiiiiiiII.getText();
        if (!IiiiiiiiIIIII.equals("") && IIiiIiiiiIIiI.iiiIiiiiiiIIi((String)IiiiiiiiIIIII)) {
            String IiiiiiiiIIIII2 = Agreement.getSendTextAES((String)"TG02", (String)IiiiiiiiIIIII);
            this.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII2);
            return;
        }
        this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u8bf7\u8f93\u5165\u6b63\u786e\u7684ID");
    }
}
