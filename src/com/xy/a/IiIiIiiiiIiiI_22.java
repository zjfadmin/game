/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.IIiIiiiiIiiiI
 *  com.xy.a.iIIiiiiiIiIII
 *  com.xy.a.iIiIiiiiIIIIi
 *  com.xy.bean.ConfirmBean
 *  com.xy.bean.GangResultBean
 *  com.xy.bean.LoginResult
 *  com.xy.d.iiIiIiiiiIiii
 *  com.xy.entity.Gangapplytable
 *  com.xy.i.IIIIIiiiIIIiI
 *  com.xy.q.IiIIIiiiiIIiI
 *  com.xy.q.IiiiIiiiiIiII
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.socket.Agreement
 *  com.xy.text.GameView
 *  com.xy.v.IIiiIiiiiIIiI
 *  com.xy.v.IiiiIiiiiIIII
 *  com.xy.v.iIiIIiiiIiiiI
 *  com.xy.w.IIIIIiiiIiiII
 *  com.xy.w.IIIiiiiiIiIiI
 *  com.xy.w.IIiIiiiiIIiii
 */
package com.xy.a;

import com.xy.a.IIiIiiiiIiiiI;
import com.xy.a.iIIiiiiiIiIII;
import com.xy.a.iIiIiiiiIIIIi;
import com.xy.bean.ConfirmBean;
import com.xy.bean.GangResultBean;
import com.xy.bean.LoginResult;
import com.xy.d.iiIiIiiiiIiii;
import com.xy.entity.Gangapplytable;
import com.xy.i.IIIIIiiiIIIiI;
import com.xy.q.IiIIIiiiiIIiI;
import com.xy.q.IiiiIiiiiIiII;
import com.xy.q.IiiiIiiiiIiIi;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import com.xy.v.IIiiIiiiiIIiI;
import com.xy.v.IiiiIiiiiIIII;
import com.xy.v.iIiIIiiiIiiiI;
import com.xy.w.IIIIIiiiIiiII;
import com.xy.w.IIIiiiiiIiIiI;
import com.xy.w.IIiIiiiiIIiii;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.MouseListener;
import java.math.BigDecimal;
import java.util.List;
import java.util.Vector;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

public class IiIiIiiiiIiiI
extends IiiiIiiiiIiIi {
    private int iiIIIiiiiiiiI;
    private int IiIiiiiiIIIII;
    private IIIIIiiiIIIiI[] iiIiIiiiiIIIi;
    private GangResultBean iiiiIiiiIiiII;
    private IIIIIiiiIIIiI[] iiiIiiiiiiiIi;
    private JLabel[] iIiiIiiiiiiII;
    private Vector<Vector<Object>> IIiiIiiiIIiIi;
    private JTable iIiIiiiiIiIii;
    private boolean IiIIIiiiiIiiI;
    private JScrollPane iiIiiiiiiiIii;
    private IIIiiiiiIiIiI[] IiiiiiiiIIIII;
    private IiiiIiiiiIiII ALLATORIxDEMO;

    public void iiiIiiiiiiIIi(int type) {
        this.iiiIiiiiiiIIi(false);
        this.iiIIIiiiiiiiI = type;
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iiiIiiiiiiiIi.length) {
            this.iiiIiiiiiiiIi[IiiiiiiiIIIII].setKeep(IiiiiiiiIIIII == this.iiIIIiiiiiiiI);
            ++IiiiiiiiIIIII;
        }
        this.ALLATORIxDEMO(this.iiiiIiiiIiiII);
        this.iiiIiiiiiiIIi(true);
    }

    public boolean iIiIiiiiIIiii(String post) {
        if (post == null) {
            return false;
        }
        if (post.equals("\u5e2e\u4e3b")) return true;
        if (post.equals("\u62a4\u6cd5")) return true;
        return false;
    }

    public void ALLATORIxDEMO(BigDecimal roleId) {
        if (this.iiiiIiiiIiiII == null) {
            return;
        }
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iiiiIiiiIiiII.getRoleTables().size()) {
            LoginResult IiiiiiiiIIIII2 = (LoginResult)this.iiiiIiiiIiiII.getRoleTables().get(IiiiiiiiIIIII);
            if (IIiiIiiiiIIiI.ALLATORIxDEMO((BigDecimal)IiiiiiiiIIIII2.getRole_id(), (BigDecimal)roleId)) {
                this.iiiiIiiiIiiII.getRoleTables().remove(IiiiiiiiIIIII);
                break;
            }
            ++IiiiiiiiIIIII;
        }
        List IiiiiiiiIIIII2 = this.iiiiIiiiIiiII.getGangapplytables();
        int IiiiiiiiIIIII3 = 0;
        while (IiiiiiiiIIIII3 < IiiiiiiiIIIII2.size()) {
            if (IIiiIiiiiIIiI.ALLATORIxDEMO((BigDecimal)((Gangapplytable)IiiiiiiiIIIII2.get(IiiiiiiiIIIII3)).getRole_id(), (BigDecimal)roleId)) {
                this.iiiiIiiiIiiII.getGangapplytables().remove(IiiiiiiiIIIII3);
                break;
            }
            ++IiiiiiiiIIIII3;
        }
        this.ALLATORIxDEMO(this.iiiiIiiiIiiII);
    }

    static /* synthetic */ boolean ALLATORIxDEMO(IiIiIiiiiIiiI arg0) {
        return arg0.IiIIIiiiiIiiI;
    }

    static /* synthetic */ GangResultBean ALLATORIxDEMO(IiIiIiiiiIiiI arg0) {
        return arg0.iiiiIiiiIiiII;
    }

    public void iIiIiiiiIIiii(int id) {
        if (id == 209) {
            if (this.iiIiIiiiiIIIi[0].getText().equals("\u8131\u79bb\u5e2e\u6d3e")) {
                if (this.ALLATORIxDEMO().getLoginResult().getGangpost().equals("\u5e2e\u4e3b")) {
                    this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u5e2e\u4e3b\u4e0d\u80fd\u9000\u51fa\u5e2e\u6d3e!");
                    return;
                }
                this.iiIIiiiiIiIIi.ALLATORIxDEMO(new ConfirmBean(24, null, "#Y\u60a8\u786e\u5b9a\u8981\u8131\u79bb\u5e2e\u6d3e\u5417?"));
                return;
            }
            if (!this.iiIiIiiiiIIIi[0].getText().equals("\u6e05\u7a7a\u5217\u8868")) return;
            if (!this.iIiIiiiiIIiii(this.ALLATORIxDEMO().getLoginResult().getGangpost())) {
                this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u4f60\u4e0d\u662f\u5e2e\u4e3b\u6216\u8005\u62a4\u6cd5");
                return;
            }
            String IiiiiiiiIIIII = Agreement.getSendTextAES((String)"gangrefuse", null);
            this.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII);
            this.iiiiIiiiIiiII.getGangapplytables().clear();
            this.ALLATORIxDEMO(this.iiiiIiiiIiiII);
            return;
        }
        if (id == 210) {
            int IiiiiiiiIIIII = this.iIiIiiiiIiIii.getSelectedRow();
            if (IiiiiiiiIIIII == -1) {
                this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u8bf7\u9009\u62e9\u4e00\u4e2a\u4eba\u5458\uff01");
                return;
            }
            Vector<Object> IiiiiiiiIIIII2 = this.IIiiIiiiIIiIi.get(IiiiiiiiIIIII);
            BigDecimal IiiiiiiiIIIII3 = (BigDecimal)IiiiiiiiIIIII2.get(6);
            String IiiiiiiiIIIII4 = (String)IiiiiiiiIIIII2.get(0);
            if (IIiiIiiiiIIiI.ALLATORIxDEMO((BigDecimal)IiiiiiiiIIIII3, (BigDecimal)this.ALLATORIxDEMO().getLoginResult().getRole_id())) {
                this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u4e0d\u80fd\u5bf9\u81ea\u5df1\u8fdb\u884c\u64cd\u4f5c!");
                return;
            }
            iiIiIiiiiIiii.ALLATORIxDEMO((BigDecimal)IiiiiiiiIIIII3, (String)IiiiiiiiIIIII4, (GameView)this.iiIIiiiiIiIIi);
            return;
        }
        if (id == 211) {
            if (!this.ALLATORIxDEMO().getLoginResult().getGangpost().equals("\u5e2e\u4e3b")) {
                this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u53ea\u6709\u5e2e\u4e3b\u624d\u6709\u6743\u5229!");
                return;
            }
            int IiiiiiiiIIIII = this.iIiIiiiiIiIii.getSelectedRow();
            if (IiiiiiiiIIIII == -1) {
                this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u8bf7\u9009\u62e9\u4e00\u4e2a\u5e2e\u6d3e\u4eba\u5458\uff01");
                return;
            }
            Vector<Object> IiiiiiiiIIIII5 = this.IIiiIiiiIIiIi.get(IiiiiiiiIIIII);
            BigDecimal IiiiiiiiIIIII6 = (BigDecimal)IiiiiiiiIIIII5.get(6);
            if (IIiiIiiiiIIiI.ALLATORIxDEMO((BigDecimal)IiiiiiiiIIIII6, (BigDecimal)this.ALLATORIxDEMO().getLoginResult().getRole_id())) {
                this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u4e0d\u80fd\u5bf9\u81ea\u5df1\u8fdb\u884c\u64cd\u4f5c!");
                return;
            }
            String IiiiiiiiIIIII7 = (String)IiiiiiiiIIIII5.get(0);
            String IiiiiiiiIIIII8 = (String)IiiiiiiiIIIII5.get(2);
            String IiiiiiiiIIIII9 = (String)IiiiiiiiIIIII5.get(3);
            ((iIIiiiiiIiIII)this.ALLATORIxDEMO().iiiIiiiiiiIIi(37)).ALLATORIxDEMO(IiiiiiiiIIIII6, IiiiiiiiIIIII7, IiiiiiiiIIIII8, IiiiiiiiIIIII9);
            return;
        }
        if (id == 212) {
            if (this.iiIiIiiiiIIIi[3].getText().equals("\u5378\u4efb")) {
                if (!this.ALLATORIxDEMO().getLoginResult().getGangpost().equals("\u5e2e\u4e3b")) {
                    this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u4f60\u4e0d\u662f\u5e2e\u4e3b\u5427!");
                    return;
                }
                int IiiiiiiiIIIII = this.iIiIiiiiIiIii.getSelectedRow();
                if (IiiiiiiiIIIII == -1) {
                    this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u8bf7\u9009\u62e9\u4e00\u4e2a\u5e2e\u6d3e\u4eba\u5458\uff01");
                    return;
                }
                Vector<Object> IiiiiiiiIIIII10 = this.IIiiIiiiIIiIi.get(IiiiiiiiIIIII);
                BigDecimal IiiiiiiiIIIII11 = (BigDecimal)IiiiiiiiIIIII10.get(6);
                String IiiiiiiiIIIII12 = (String)IiiiiiiiIIIII10.get(0);
                if (IIiiIiiiiIIiI.ALLATORIxDEMO((BigDecimal)IiiiiiiiIIIII11, (BigDecimal)this.ALLATORIxDEMO().getLoginResult().getRole_id())) {
                    this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u4e0d\u80fd\u5bf9\u81ea\u5df1\u8fdb\u884c\u64cd\u4f5c!");
                    return;
                }
                this.iiIIiiiiIiIIi.ALLATORIxDEMO(new ConfirmBean(25, IiiiiiiiIIIII11.toString(), "#Y  \u60a8\u786e\u5b9a\u8981\u9000\u4f4d\u7ed9  #G" + IiiiiiiiIIIII12 + "    #Y\u5417?"));
                return;
            }
            if (!this.iiIiIiiiiIIIi[3].getText().equals("\u62d2\u7edd\u73a9\u5bb6")) return;
            if (!this.iIiIiiiiIIiii(this.ALLATORIxDEMO().getLoginResult().getGangpost())) {
                this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u4f60\u4e0d\u662f\u5e2e\u4e3b\u6216\u8005\u62a4\u6cd5");
                return;
            }
            int IiiiiiiiIIIII = this.iIiIiiiiIiIii.getSelectedRow();
            if (IiiiiiiiIIIII == -1) {
                this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u8bf7\u9009\u62e9\u4e00\u4e2a\u5e2e\u6d3e\u4eba\u5458\uff01");
                return;
            }
            Vector<Object> IiiiiiiiIIIII13 = this.IIiiIiiiIIiIi.get(IiiiiiiiIIIII);
            BigDecimal IiiiiiiiIIIII14 = (BigDecimal)IiiiiiiiIIIII13.get(6);
            this.iiiiIiiiIiiII.getGangapplytables().remove(IiiiiiiiIIIII);
            this.IIiiIiiiIIiIi.remove(IiiiiiiiIIIII);
            this.iIiIiiiiIiIii.updateUI();
            String IiiiiiiiIIIII15 = Agreement.getSendTextAES((String)"gangrefuse", (String)IiiiiiiiIIIII14.toString());
            this.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII15);
            return;
        }
        if (id != 213) return;
        if (this.iiIiIiiiiIIIi[4].getText().equals("\u8e22\u51fa\u5e2e\u6d3e")) {
            if (!this.ALLATORIxDEMO().getLoginResult().getGangpost().equals("\u5e2e\u4e3b")) {
                this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u53ea\u6709\u5e2e\u4e3b\u624d\u6709\u6743\u5229!");
                return;
            }
            int IiiiiiiiIIIII = this.iIiIiiiiIiIii.getSelectedRow();
            if (IiiiiiiiIIIII == -1) {
                this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u8bf7\u9009\u62e9\u4e00\u4e2a\u5e2e\u6d3e\u4eba\u5458\uff01");
                return;
            }
            Vector<Object> IiiiiiiiIIIII16 = this.IIiiIiiiIIiIi.get(IiiiiiiiIIIII);
            BigDecimal IiiiiiiiIIIII17 = (BigDecimal)IiiiiiiiIIIII16.get(6);
            String IiiiiiiiIIIII18 = (String)IiiiiiiiIIIII16.get(0);
            if (IIiiIiiiiIIiI.ALLATORIxDEMO((BigDecimal)IiiiiiiiIIIII17, (BigDecimal)this.ALLATORIxDEMO().getLoginResult().getRole_id())) {
                this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u4e0d\u80fd\u5bf9\u81ea\u5df1\u8fdb\u884c\u64cd\u4f5c!");
                return;
            }
            this.iiIIiiiiIiIIi.ALLATORIxDEMO(new ConfirmBean(26, IiiiiiiiIIIII17.toString(), "#Y  \u60a8\u786e\u5b9a\u8981\u5c06  #G" + IiiiiiiiIIIII18 + "    #Y\u8e22\u51fa\u5e2e\u6d3e\u5417?"));
            return;
        }
        if (!this.iiIiIiiiiIIIi[4].getText().equals("\u63a5\u6536\u73a9\u5bb6")) return;
        if (!this.iIiIiiiiIIiii(this.ALLATORIxDEMO().getLoginResult().getGangpost())) {
            this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u4f60\u4e0d\u662f\u5e2e\u4e3b\u6216\u8005\u62a4\u6cd5");
            return;
        }
        int IiiiiiiiIIIII = this.iIiIiiiiIiIii.getSelectedRow();
        if (IiiiiiiiIIIII == -1) {
            this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u8bf7\u9009\u62e9\u4e00\u4e2a\u5e2e\u6d3e\u4eba\u5458\uff01");
            return;
        }
        Vector<Object> IiiiiiiiIIIII19 = this.IIiiIiiiIIiIi.get(IiiiiiiiIIIII);
        BigDecimal IiiiiiiiIIIII20 = (BigDecimal)IiiiiiiiIIIII19.get(6);
        this.iiiiIiiiIiiII.getGangapplytables().remove(IiiiiiiiIIIII);
        this.IIiiIiiiIIiIi.remove(IiiiiiiiIIIII);
        this.iIiIiiiiIiIii.updateUI();
        String IiiiiiiiIIIII21 = Agreement.getSendTextAES((String)"gangagree", (String)IiiiiiiiIIIII20.toString());
        this.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII21);
    }

    public IiIiIiiiiIiiI(GameView gameView) {
        super(-1, -1, IiiiIiiiiIiIi.iIIiIiiiiiiIi, gameView);
        this.ALLATORIxDEMO(0, 0, 662, 475, IiiiIiiiiIiIi.iIIiIiiiiiiIi);
        this.iiiIiiiiiiiIi = new IIIIIiiiIIIiI[3];
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iiiIiiiiiiiIi.length) {
            this.iiiIiiiiiiiIi[IiiiiiiiIIIII] = new IIIIIiiiIIIiI("sc/e/61.png", 2, 206 + IiiiiiiiIIIII, iiIIiiiiIiiII.IIiiIiiiIIiIi, null, IiiiiiiiIIIII == 0 ? "\u5168\u90e8\u6210\u5458" : (IiiiiiiiIIIII == 1 ? "\u6838\u5fc3\u6210\u5458" : (IiiiiiiiIIIII == 2 ? "\u7533\u8bf7\u4eba" : "")), (IiiiIiiiiIiIi)this);
            this.iiiIiiiiiiiIi[IiiiiiiiIIIII].setOffsetTexts(iiIIiiiiIiiII.IiIIIiiiiiiiI);
            this.iiiIiiiiiiiIi[IiiiiiiiIIIII].setBounds(56 + 92 * IiiiiiiiIIIII, 65, 90, 24);
            this.add((Component)this.iiiIiiiiiiiIi[IiiiiiiiIIIII++]);
        }
        this.iiIiIiiiiIIIi = new IIIIIiiiIIIiI[5];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iiIiIiiiiIIIi.length) {
            this.iiIiIiiiiIIIi[IiiiiiiiIIIII] = new IIIIIiiiIIIiI(IiiiiiiiIIIII == 0 || IiiiiiiiIIIII == 1 || IiiiiiiiIIIII == 4 ? "sc/e/26.png" : "sc/e/7.png", 1, 209 + IiiiiiiiIIIII, iiIIiiiiIiiII.iiiiIiiiIiiII, iiIIiiiiIiiII.IIiiiiiiIiiII, "", (IiiiIiiiiIiIi)this);
            if (IiiiiiiiIIIII == 0) {
                this.iiIiIiiiiIIIi[IiiiiiiiIIIII].setBounds(433, 429, 99, 25);
            } else if (IiiiiiiiIIIII == 1) {
                this.iiIiIiiiiIIIi[IiiiiiiiIIIII].setBounds(536, 429, 99, 25);
            } else if (IiiiiiiiIIIII == 2) {
                this.iiIiIiiiiIIIi[IiiiiiiiIIIII].setBounds(204, 429, 59, 25);
            } else if (IiiiiiiiIIIII == 3) {
                this.iiIiIiiiiIIIi[IiiiiiiiIIIII].setBounds(267, 429, 59, 25);
            } else if (IiiiiiiiIIIII == 4) {
                this.iiIiIiiiiIIIi[IiiiiiiiIIIII].setBounds(330, 429, 99, 25);
            }
            this.iiIiIiiiiIIIi[IiiiiiiiIIIII].setText(IiiiiiiiIIIII == 0 ? "\u8131\u79bb\u5e2e\u6d3e" : (IiiiiiiiIIIII == 1 ? "\u52a0\u4e3a\u597d\u53cb" : (IiiiiiiiIIIII == 2 ? "\u4efb\u804c" : (IiiiiiiiIIIII == 3 ? "\u5378\u4efb" : (IiiiiiiiIIIII == 4 ? "\u8e22\u51fa\u5e2e\u6d3e" : "")))));
            this.add((Component)this.iiIiIiiiiIIIi[IiiiiiiiIIIII++]);
        }
        this.iIiiIiiiiiiII = new JLabel[2];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iIiiIiiiiiiII.length) {
            this.iIiiIiiiiiiII[IiiiiiiiIIIII] = IiIIIiiiiIIiI.ALLATORIxDEMO((int)499, (int)68, (int)36, (int)19, (Color)Color.black, (Font)iiIIiiiiIiiII.iiiiIiiiIiiII);
            this.iIiiIiiiiiiII[IiiiiiiiIIIII].setText(IiiiiiiiIIIII == 0 ? "\u641c\u7d22" : (IiiiiiiiIIIII == 1 ? "\u53ea\u663e\u793a\u5728\u7ebf\u73a9\u5bb6" : ""));
            this.iIiiIiiiiiiII[IiiiiiiiIIIII].setHorizontalAlignment(10);
            this.add(this.iIiiIiiiiiiII[IiiiiiiiIIIII]);
            if (IiiiiiiiIIIII == 1) {
                this.iIiiIiiiiiiII[IiiiiiiiIIIII].setBounds(72, 432, 120, 19);
            }
            ++IiiiiiiiIIIII;
        }
        Vector<String> IiiiiiiiIIIII2 = new Vector<String>();
        IiiiiiiiIIIII2.addElement("\u540d\u5b57");
        IiiiiiiiIIIII2.addElement("\u804c\u4f4d");
        IiiiiiiiIIIII2.addElement("\u79cd\u65cf");
        IiiiiiiiIIIII2.addElement("\u7b49\u7ea7");
        IiiiiiiiIIIII2.addElement("\u8d21\u732e");
        IiiiiiiiIIIII2.addElement("\u79bb\u7ebf");
        this.IIiiIiiiIIiIi = new Vector();
        this.iIiIiiiiIiIii = IiIIIiiiiIIiI.ALLATORIxDEMO(this.IIiiIiiiIIiIi, IiiiiiiiIIIII2, (Font)iiIIiiiiIiiII.iIiIIiiiiIIiI, (Color)Color.white, (int[])new int[]{100, 100, 90, 95, 100, 100});
        iIiIiiiiIIIIi IiiiiiiiIIIII3 = new iIiIiiiiIIIIi(this);
        IiiiiiiiIIIII3.setHorizontalAlignment(0);
        this.iIiIiiiiIiIii.setDefaultRenderer(Object.class, (TableCellRenderer)IiiiiiiiIIIII3);
        this.iiIiiiiiiiIii = IiIIIiiiiIIiI.ALLATORIxDEMO((int)49, (int)89, (int)589, (int)336, (Component)this.iIiIiiiiIiIii, (int)20);
        this.add(this.iiIiiiiiiiIii);
        this.ALLATORIxDEMO = IiIIIiiiiIIiI.ALLATORIxDEMO((IIiIiiiiIIiii)IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/17.png", (int)6, (int)6, (int)6, (int)6, (boolean)false), (Font)iiIIiiiiIiiII.iIIIiiiiIIIii, (Color)Color.white);
        this.ALLATORIxDEMO.setHorizontalAlignment(10);
        this.ALLATORIxDEMO.setBounds(539, 68, 97, 19);
        this.add((Component)this.ALLATORIxDEMO);
        this.IiiiiiiiIIIII = new IIIiiiiiIiIiI[3];
        int IiiiiiiiIIIII4 = 0;
        while (IiiiiiiiIIIII4 < this.IiiiiiiiIIIII.length) {
            this.IiiiiiiiIIIII[IiiiiiiiIIIII4] = new IIIiiiiiIiIiI();
            if (IiiiiiiiIIIII4 == 0) {
                this.IiiiiiiiIIIII[IiiiiiiiIIIII4].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/25.png", (int)2, (int)2, (int)2, (int)2, (boolean)false));
                this.IiiiiiiiIIIII[IiiiiiiiIIIII4].setBounds(49, 89, 589, 21);
            } else if (IiiiiiiiIIIII4 == 1) {
                this.IiiiiiiiIIIII[IiiiiiiiIIIII4].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/24.png", (int)2, (int)2, (int)2, (int)2, (boolean)false));
                this.IiiiiiiiIIIII[IiiiiiiiIIIII4].setBounds(49, 89, 589, 336);
            } else if (IiiiiiiiIIIII4 == 2) {
                this.IiiiiiiiIIIII[IiiiiiiiIIIII4].iIiIiiiiIIiii("sc/e/29.png");
                this.IiiiiiiiIIIII[IiiiiiiiIIIII4].setBounds(49, 433, 17, 17);
                this.IiiiiiiiIIIII[IiiiiiiiIIIII4].addMouseListener((MouseListener)new IIiIiiiiIiiiI(this));
            }
            this.add((Component)this.IiiiiiiiIIIII[IiiiiiiiIIIII4++]);
        }
    }

    static /* synthetic */ void ALLATORIxDEMO(IiIiIiiiiIiiI arg0, boolean arg1) {
        arg0.IiIIIiiiiIiiI = arg1;
    }

    public void ALLATORIxDEMO(BigDecimal roleId, String post) {
        if (this.iiiiIiiiIiiII == null) {
            return;
        }
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iiiiIiiiIiiII.getRoleTables().size()) {
            LoginResult IiiiiiiiIIIII2 = (LoginResult)this.iiiiIiiiIiiII.getRoleTables().get(IiiiiiiiIIIII);
            if (IIiiIiiiiIIiI.ALLATORIxDEMO((BigDecimal)IiiiiiiiIIIII2.getRole_id(), (BigDecimal)roleId)) {
                IiiiiiiiIIIII2.setGangpost(post);
                break;
            }
            ++IiiiiiiiIIIII;
        }
        this.ALLATORIxDEMO(this.iiiiIiiiIiiII);
    }

    /*
     * Enabled unnecessary exception pruning
     */
    public void iiiIiiiiiiIIi(boolean type) {
        try {
            LoginResult IiiiiiiiIIIII = this.ALLATORIxDEMO().getLoginResult();
            if (this.iiIIIiiiiiiiI < 2) {
                if (type) {
                    if (this.ALLATORIxDEMO(IiiiiiiiIIIII.getGangpost())) {
                        this.iiIiIiiiiIIIi[2].setBounds(204, 429, 59, 25);
                        this.iiIiIiiiiIIIi[3].setText("\u5378\u4efb");
                        this.iiIiIiiiiIIIi[3].setImage("sc/e/7.png");
                        this.iiIiIiiiiIIIi[3].setBounds(267, 429, 59, 25);
                        this.iiIiIiiiiIIIi[0].setText("\u8131\u79bb\u5e2e\u6d3e");
                        this.iiIiIiiiiIIIi[4].setText("\u8e22\u51fa\u5e2e\u6d3e");
                        this.iiIiIiiiiIIIi[4].setVisible(type);
                        this.iiIiIiiiiIIIi[2].setVisible(type);
                        this.iiIiIiiiiIIIi[3].setVisible(type);
                        return;
                    }
                    if (!this.iIiIiiiiIIiii(IiiiiiiiIIIII.getGangpost())) return;
                    this.iiIiIiiiiIIIi[0].setText("\u8131\u79bb\u5e2e\u6d3e");
                    return;
                }
                this.iiIiIiiiiIIIi[4].setVisible(type);
                this.iiIiIiiiiIIIi[2].setVisible(type);
                this.iiIiIiiiiIIIi[3].setVisible(type);
                return;
            }
            if (this.iiIIIiiiiiiiI != 2) return;
            if (type) {
                if (!this.iIiIiiiiIIiii(IiiiiiiiIIIII.getGangpost())) return;
                this.iiIiIiiiiIIIi[3].setText("\u62d2\u7edd\u73a9\u5bb6");
                this.iiIiIiiiiIIIi[3].setImage("sc/e/26.png");
                this.iiIiIiiiiIIIi[3].setBounds(227, 429, 99, 26);
                this.iiIiIiiiiIIIi[0].setText("\u6e05\u7a7a\u5217\u8868");
                this.iiIiIiiiiIIIi[4].setText("\u63a5\u6536\u73a9\u5bb6");
                this.iiIiIiiiiIIIi[4].setVisible(type);
                this.iiIiIiiiiIIIi[3].setVisible(type);
                return;
            }
            this.iiIiIiiiiIIIi[4].setVisible(type);
            this.iiIiIiiiiIIIi[3].setVisible(type);
            return;
        }
        catch (Exception IiiiiiiiIIIII) {
            IiiiiiiiIIIII.printStackTrace();
        }
    }

    public GangResultBean ALLATORIxDEMO() {
        return this.iiiiIiiiIiiII;
    }

    public boolean ALLATORIxDEMO(String post) {
        if (post != null) return post.equals("\u5e2e\u4e3b");
        return false;
    }

    static /* synthetic */ IIIiiiiiIiIiI[] ALLATORIxDEMO(IiIiIiiiiIiiI arg0) {
        return arg0.IiiiiiiiIIIII;
    }

    /*
     * Unable to fully structure code
     */
    public void ALLATORIxDEMO(GangResultBean gangResultBean) {
        block15: {
            block14: {
                block13: {
                    this.iiiiIiiiIiiII = gangResultBean;
                    this.IIiiIiiiIIiIi.clear();
                    this.IiIiiiiiIIIII = 0;
                    if (gangResultBean == null) {
                        this.iIiIiiiiIiIii.updateUI();
                        return;
                    }
                    if (this.iiIIIiiiiiiiI == 0 || this.iiIIIiiiiiiiI == 1) {
                        this.iIiIiiiiIiIii.getTableHeader().getColumnModel().getColumn(1).setHeaderValue("\u804c\u4f4d");
                        this.iIiIiiiiIiIii.getTableHeader().getColumnModel().getColumn(2).setHeaderValue("\u79cd\u65cf");
                        this.iIiIiiiiIiIii.getTableHeader().getColumnModel().getColumn(3).setHeaderValue("\u7b49\u7ea7");
                        this.iIiIiiiiIiIii.getTableHeader().getColumnModel().getColumn(4).setHeaderValue("\u8d21\u732e");
                        this.iIiIiiiiIiIii.getTableHeader().getColumnModel().getColumn(5).setHeaderValue("\u79bb\u7ebf");
                        this.iIiIiiiiIiIii.getColumnModel().getColumn(0).setPreferredWidth(110);
                        this.iIiIiiiiIiIii.getColumnModel().getColumn(1).setPreferredWidth(90);
                        this.iIiIiiiiIiIii.getColumnModel().getColumn(2).setPreferredWidth(105);
                        this.iIiIiiiiIiIii.getColumnModel().getColumn(3).setPreferredWidth(80);
                        this.iIiIiiiiIiIii.getColumnModel().getColumn(4).setPreferredWidth(120);
                        this.iIiIiiiiIiIii.getColumnModel().getColumn(5).setPreferredWidth(65);
                    } else {
                        this.iIiIiiiiIiIii.getTableHeader().getColumnModel().getColumn(1).setHeaderValue("\u79cd\u65cf");
                        this.iIiIiiiiIiIii.getTableHeader().getColumnModel().getColumn(2).setHeaderValue("\u7b49\u7ea7");
                        this.iIiIiiiiIiIii.getTableHeader().getColumnModel().getColumn(3).setHeaderValue("");
                        this.iIiIiiiiIiIii.getTableHeader().getColumnModel().getColumn(4).setHeaderValue("");
                        this.iIiIiiiiIiIii.getTableHeader().getColumnModel().getColumn(5).setHeaderValue("");
                        this.iIiIiiiiIiIii.getColumnModel().getColumn(0).setPreferredWidth(190);
                        this.iIiIiiiiIiIii.getColumnModel().getColumn(1).setPreferredWidth(190);
                        this.iIiIiiiiIiIii.getColumnModel().getColumn(2).setPreferredWidth(190);
                        this.iIiIiiiiIiIii.getColumnModel().getColumn(3).setPreferredWidth(0);
                        this.iIiIiiiiIiIii.getColumnModel().getColumn(4).setPreferredWidth(0);
                        this.iIiIiiiiIiIii.getColumnModel().getColumn(5).setPreferredWidth(0);
                    }
                    if (this.iiIIIiiiiiiiI != 0) break block13;
                    IiiiiiiiIIIII = gangResultBean.getRoleTables();
                    IiiiiiiiIIIII = 0;
                    if (true) ** GOTO lbl70
                }
                if (this.iiIIIiiiiiiiI != 1) break block14;
                IiiiiiiiIIIII = gangResultBean.getRoleTables();
                IiiiiiiiIIIII = 0;
                if (true) ** GOTO lbl97
            }
            if (this.iiIIIiiiiiiiI != 2) break block15;
            IiiiiiiiIIIII = gangResultBean.getGangapplytables();
            IiiiiiiiIIIII = 0;
            if (true) ** GOTO lbl118
            do {
                IiiiiiiiIIIII = (LoginResult)IiiiiiiiIIIII.get(IiiiiiiiIIIII);
                if (!this.IiIIIiiiiIiiI || "\u5728\u7ebf".equals(IiiiiiiiIIIII.getUptime())) {
                    IiiiiiiiIIIII = new Vector<Object>();
                    IiiiiiiiIIIII.add(IiiiiiiiIIIII.getRolename());
                    IiiiiiiiIIIII.add(IiiiiiiiIIIII.getGangpost());
                    IiiiiiiiIIIII.add(IiiiiiiiIIIII.getRace_name());
                    IiiiiiiiIIIII.add(IiiiIiiiiIIII.iIiIiiiiIIiii((int)IiiiiiiiIIIII.getGrade()));
                    IiiiiiiiIIIII.add(IiiiiiiiIIIII.getContribution().toString());
                    if (!"\u5728\u7ebf".equals(IiiiiiiiIIIII.getUptime())) {
                        IiiiiiiiIIIII.add(iIiIIiiiIiiiI.ALLATORIxDEMO((long)new Long(IiiiiiiiIIIII.getUptime()), (String)"yy-MM-dd"));
                    } else {
                        ++this.IiIiiiiiIIIII;
                        IiiiiiiiIIIII.add(IiiiiiiiIIIII.getUptime());
                    }
                    IiiiiiiiIIIII.add(IiiiiiiiIIIII.getRole_id());
                    this.IIiiIiiiIIiIi.addElement(IiiiiiiiIIIII);
                }
                ++IiiiiiiiIIIII;
lbl70:
                // 2 sources

            } while (IiiiiiiiIIIII < IiiiiiiiIIIII.size());
            break block15;
            do {
                IiiiiiiiIIIII = (LoginResult)IiiiiiiiIIIII.get(IiiiiiiiIIIII);
                if ((!this.IiIIIiiiiIiiI || "\u5728\u7ebf".equals(IiiiiiiiIIIII.getUptime())) && this.iIiIiiiiIIiii(IiiiiiiiIIIII.getGangpost())) {
                    IiiiiiiiIIIII = new Vector<Object>();
                    IiiiiiiiIIIII.add(IiiiiiiiIIIII.getRolename());
                    IiiiiiiiIIIII.add(IiiiiiiiIIIII.getGangpost());
                    IiiiiiiiIIIII.add(IiiiiiiiIIIII.getRace_name());
                    IiiiiiiiIIIII.add(IiiiIiiiiIIII.iIiIiiiiIIiii((int)IiiiiiiiIIIII.getGrade()));
                    IiiiiiiiIIIII.add(IiiiiiiiIIIII.getContribution().toString());
                    if (!"\u5728\u7ebf".equals(IiiiiiiiIIIII.getUptime())) {
                        IiiiiiiiIIIII.add(iIiIIiiiIiiiI.ALLATORIxDEMO((long)new Long(IiiiiiiiIIIII.getUptime()), (String)"yy-MM-dd"));
                    } else {
                        ++this.IiIiiiiiIIIII;
                        IiiiiiiiIIIII.add(IiiiiiiiIIIII.getUptime());
                    }
                    IiiiiiiiIIIII.add(IiiiiiiiIIIII.getRole_id());
                    this.IIiiIiiiIIiIi.addElement(IiiiiiiiIIIII);
                }
                ++IiiiiiiiIIIII;
lbl97:
                // 2 sources

            } while (IiiiiiiiIIIII < IiiiiiiiIIIII.size());
            break block15;
            do {
                IiiiiiiiIIIII = (Gangapplytable)IiiiiiiiIIIII.get(IiiiiiiiIIIII);
                IiiiiiiiIIIII = new Vector<Object>();
                IiiiiiiiIIIII.add(IiiiiiiiIIIII.getRolename());
                IiiiiiiiIIIII.add(IiiiiiiiIIIII.getRace_name());
                IiiiiiiiIIIII.add(IiiiIiiiiIIII.iIiIiiiiIIiii((int)IiiiiiiiIIIII.getGrade().intValue()));
                IiiiiiiiIIIII.add("");
                IiiiiiiiIIIII.add("");
                IiiiiiiiIIIII.add("");
                IiiiiiiiIIIII.add(IiiiiiiiIIIII.getRole_id());
                ++IiiiiiiiIIIII;
                this.IIiiIiiiIIiIi.addElement(IiiiiiiiIIIII);
lbl118:
                // 2 sources

            } while (IiiiiiiiIIIII < IiiiiiiiIIIII.size());
        }
        if (this.iIiIiiiiIiIii.getRowCount() > 0) {
            this.iIiIiiiiIiIii.setRowSelectionInterval(0, 0);
        }
        this.iIiIiiiiIiIii.updateUI();
        this.iiIiiiiiiiIii.getVerticalScrollBar().setValue(0);
    }

    static /* synthetic */ int ALLATORIxDEMO(IiIiIiiiiIiiI arg0) {
        return arg0.IiIiiiiiIIIII;
    }
}
