/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.bean.BeauBean
 *  com.xy.bean.Role_bean
 *  com.xy.i.iiIiIiiiiiIIi
 *  com.xy.q.IiIIIiiiiIIiI
 *  com.xy.q.IiiiIiiiiIiII
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.richtext.RichLabel
 *  com.xy.socket.Agreement
 *  com.xy.text.GameView
 *  com.xy.v.IIiIiiiiIiIII
 *  com.xy.v.IIiiIiiiiIIiI
 *  com.xy.v.IiiiIiiiiIIII
 *  com.xy.w.IIIIIiiiIiiII
 *  com.xy.w.IIIiiiiiIiIiI
 *  com.xy.w.IIiIiiiiIIiii
 */
package com.xy.a;

import com.xy.bean.BeauBean;
import com.xy.bean.Role_bean;
import com.xy.i.iiIiIiiiiiIIi;
import com.xy.q.IiIIIiiiiIIiI;
import com.xy.q.IiiiIiiiiIiII;
import com.xy.q.IiiiIiiiiIiIi;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.richtext.RichLabel;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import com.xy.v.IIiIiiiiIiIII;
import com.xy.v.IIiiIiiiiIIiI;
import com.xy.v.IiiiIiiiiIIII;
import com.xy.w.IIIIIiiiIiiII;
import com.xy.w.IIIiiiiiIiIiI;
import com.xy.w.IIiIiiiiIIiii;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JScrollPane;

public class iIiIiiiiIiIiI
extends IiiiIiiiiIiIi {
    private iiIiIiiiiiIIi[] iIiiIiiiiiiII;
    private JScrollPane IIiiIiiiIIiIi;
    private RichLabel iIiIiiiiIiIii;
    private Role_bean IiIIIiiiiIiiI;
    private JLabel[] iiIiiiiiiiIii;
    private IIIiiiiiIiIiI IiiiiiiiIIIII;
    private IiiiIiiiiIiII[] ALLATORIxDEMO;

    public void iiiIiiiiiiIIi() {
        String IiiiiiiiIIIII;
        String IiiiiiiiIIIII2 = null;
        if (IiiiiiiiIIIII2 == null && !IIiiIiiiiIIiI.iIiIiiiiIIiIi((String)(IiiiiiiiIIIII = this.ALLATORIxDEMO[0].getText().trim()))) {
            IiiiiiiiIIIII2 = Agreement.getSendTextAES((String)"searcahChatRoleId", (String)IiiiiiiiIIIII);
        }
        if (IiiiiiiiIIIII2 == null && !IIiiIiiiiIIiI.iIiIiiiiIIiIi((String)(IiiiiiiiIIIII = this.ALLATORIxDEMO[1].getText().trim()))) {
            IiiiiiiiIIIII2 = Agreement.getSendTextAES((String)"searcahChatRoleName", (String)IiiiiiiiIIIII);
        }
        if (IiiiiiiiIIIII2 == null) {
            this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u8bf7\u8f93\u5165\u641c\u7d22\u6761\u4ef6");
            return;
        }
        this.ALLATORIxDEMO(null);
        this.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII2);
    }

    public iIiIiiiiIiIiI(GameView gameView) {
        super(75, 2, IiiiIiiiiIiIi.iIIIIiiiiiIIi, gameView);
        this.ALLATORIxDEMO(-1, 0, 406, 329, IiiiIiiiiIiIi.iiIIIiiiiiiiI);
        this.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/1.png", (int)68, (int)68, (int)68, (int)68, (boolean)false), "\u67e5\u627e\u6dfb\u52a0");
        this.iiIiiiiiiiIii = new JLabel[2];
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iiIiiiiiiiIii.length) {
            this.iiIiiiiiiiIii[IiiiiiiiIIIII] = IiIIIiiiiIIiI.ALLATORIxDEMO((int)60, (int)(41 + IiiiiiiiIIIII * 30), (int)56, (int)19, (Color)Color.black, (Font)iiIIiiiiIiiII.iiiiIiiiIiiII);
            this.iiIiiiiiiiIii[IiiiiiiiIIIII].setText(IiiiiiiiIIIII == 0 ? "\u6570\u5b57ID" : (IiiiiiiiIIIII == 1 ? "\u6635\u79f0" : ""));
            this.add(this.iiIiiiiiiiIii[IiiiiiiiIIIII++]);
        }
        this.ALLATORIxDEMO = new IiiiIiiiiIiII[2];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.ALLATORIxDEMO.length) {
            this.ALLATORIxDEMO[IiiiiiiiIIIII] = IiIIIiiiiIIiI.ALLATORIxDEMO((IIiIiiiiIIiii)IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/17.png", (int)6, (int)6, (int)6, (int)6, (boolean)false), (Font)iiIIiiiiIiiII.iiIiiiiiiIIiI, (Color)Color.white);
            this.ALLATORIxDEMO[IiiiiiiiIIIII].setBounds(117, 41 + IiiiiiiiIIIII * 30, 134, 19);
            this.add((Component)this.ALLATORIxDEMO[IiiiiiiiIIIII++]);
        }
        this.iIiiIiiiiiiII = new iiIiIiiiiiIIi[3];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iIiiIiiiiiiII.length) {
            this.iIiiIiiiiiiII[IiiiiiiiIIIII] = new iiIiIiiiiiIIi(IiiiiiiiIIIII >= 1 && IiiiiiiiIIIII <= 2 ? "sc/e/26.png" : "sc/e/7.png", 1, 101 + IiiiiiiiIIIII, iiIIiiiiIiiII.iiiiIiiiIiiII, iiIIiiiiIiiII.IIiiiiiiIiiII, IiiiiiiiIIIII == 0 ? "\u641c\u7d22" : (IiiiiiiiIIIII == 1 ? "\u52a0\u4e3a\u597d\u53cb" : (IiiiiiiiIIIII == 2 ? "\u7533\u8bf7\u5165\u961f" : "")), (IiiiIiiiiIiIi)this);
            iIiIiiiiIiIiI iIiIiiiiIiIiI2 = this;
            if (IiiiiiiiIIIII == 0) {
                iIiIiiiiIiIiI2.iIiiIiiiiiiII[IiiiiiiiIIIII].setBounds(275, 54, 59, 25);
            } else {
                iIiIiiiiIiIiI2.iIiiIiiiiiiII[IiiiiiiiIIIII].setBounds(-104 + 179 * IiiiiiiiIIIII, 271, 99, 25);
            }
            this.add((Component)this.iIiiIiiiiiiII[IiiiiiiiIIIII++]);
        }
        this.iIiIiiiiIiIii = IIiIiiiiIiIII.ALLATORIxDEMO((String)"", (Font)iiIIiiiiIiiII.iIIIiiiiIIIii, (int)95);
        this.IIiiIiiiIIiIi = IiIIIiiiiIIiI.ALLATORIxDEMO((int)71, (int)121, (int)286, (int)126, (Component)this.iIiIiiiiIiIii, (int)20);
        this.add(this.IIiiIiiiIIiIi);
        this.IiiiiiiiIIIII = new IIIiiiiiIiIiI();
        this.IiiiiiiiIIIII.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/24.png", (int)2, (int)2, (int)2, (int)2, (boolean)false));
        this.IiiiiiiiIIIII.setBounds(69, 119, 290, 130);
        this.add((Component)this.IiiiiiiiIIIII);
    }

    public void ALLATORIxDEMO(Role_bean roleBean) {
        this.IiIIIiiiiIiiI = roleBean;
        if (roleBean == null) {
            this.iIiIiiiiIiIii.setTextSize(null, 270);
            return;
        }
        StringBuffer IiiiiiiiIIIII = new StringBuffer();
        IiiiiiiiIIIII.append("\u540d\u5b57:");
        IiiiiiiiIIIII.append(roleBean.getRolename());
        IiiiiiiiIIIII.append("#rid:");
        BeauBean IiiiiiiiIIIII2 = roleBean.getBeauBean();
        if (IiiiiiiiIIIII2 == null) {
            IiiiiiiiIIIII.append("#W" + roleBean.getRole_id());
        } else if (IiiiiiiiIIIII2.ALLATORIxDEMO()) {
            IiiiiiiiIIIII.append("#VBEAU" + IiiiiiiiIIIII2.toString() + "#L");
        } else {
            IiiiiiiiIIIII.append("#cFF00FF" + IiiiiiiiIIIII2.getBeau());
        }
        IiiiiiiiIIIII.append("#W#r\u79cd\u65cf:");
        IiiiiiiiIIIII.append(roleBean.getRace_name());
        IiiiiiiiIIIII.append("#r\u6027\u522b:");
        IiiiiiiiIIIII.append("\u4e0d\u613f\u900f\u9732");
        IiiiiiiiIIIII.append("#r\u7b49\u7ea7:");
        IiiiiiiiIIIII.append(IiiiIiiiiIIII.iIiIiiiiIIiii((int)roleBean.getGrade()));
        this.iIiIiiiiIiIii.setTextSize(IiiiiiiiIIIII.toString(), 270);
    }

    public Role_bean ALLATORIxDEMO() {
        return this.IiIIIiiiiIiiI;
    }
}
