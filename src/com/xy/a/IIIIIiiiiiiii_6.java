/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.iIiiIiiiIiIIi
 *  com.xy.a.iIiiiiiiiiiii
 *  com.xy.bean.BeauBean
 *  com.xy.bean.FriendBean
 *  com.xy.d.iiIiIiiiiIiii
 *  com.xy.entity.Friend
 *  com.xy.formula.UtilSkin
 *  com.xy.game.RoleData
 *  com.xy.i.iiIiIiiiiiIIi
 *  com.xy.q.IiIIIiiiiIIiI
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.q.iIIiIiiiIiiIi
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.richtext.RichLabel
 *  com.xy.socket.Agreement
 *  com.xy.text.GameView
 *  com.xy.v.IiiiIiiiiIIII
 *  com.xy.v.iiIiiiiiIIiii
 *  com.xy.v.iiiiiiiiIIIII
 *  com.xy.w.IIIIIiiiIiiII
 *  com.xy.w.IIIiiiiiIiIiI
 *  com.xy.w.IIiIiiiiIiiIi
 */
package com.xy.a;

import com.xy.a.iIiiIiiiIiIIi;
import com.xy.a.iIiiiiiiiiiii;
import com.xy.bean.BeauBean;
import com.xy.bean.FriendBean;
import com.xy.d.iiIiIiiiiIiii;
import com.xy.entity.Friend;
import com.xy.formula.UtilSkin;
import com.xy.game.RoleData;
import com.xy.i.iiIiIiiiiiIIi;
import com.xy.q.IiIIIiiiiIIiI;
import com.xy.q.IiiiIiiiiIiIi;
import com.xy.q.iIIiIiiiIiiIi;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.richtext.RichLabel;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import com.xy.v.IiiiIiiiiIIII;
import com.xy.v.iiIiiiiiIIiii;
import com.xy.v.iiiiiiiiIIIII;
import com.xy.w.IIIIIiiiIiiII;
import com.xy.w.IIIiiiiiIiIiI;
import com.xy.w.IIiIiiiiIiiIi;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.math.BigDecimal;
import javax.swing.JLabel;

public class IIIIIiiiiiiii
extends IiiiIiiiiIiIi {
    private iiIiIiiiiiIIi[] iiiIiiiiiiiIi;
    private iIIiIiiiIiiIi[] iIiiIiiiiiiII;
    private JLabel[] IIiiIiiiIIiIi;
    private iiIiIiiiiiIIi[] iIiIiiiiIiIii;
    private RichLabel IiIIIiiiiIiiI;
    private FriendBean iiIiiiiiiiIii;
    private IIIiiiiiIiIiI IiiiiiiiIIIII;
    private IIIiiiiiIiIiI ALLATORIxDEMO;

    public void ALLATORIxDEMO(FriendBean friendBean) {
        this.iiIiiiiiiiIii = friendBean;
        this.ALLATORIxDEMO.iIiIiiiiIIiii(IIiIiiiiIiiIi.iiiIiiiiiiIIi((String)String.valueOf(friendBean.getSpeciesId())));
        this.iIiiIiiiiiiII[0].setText(friendBean.getRoleName());
        BeauBean IiiiiiiiIIIII = friendBean.getBeauBean();
        if (IiiiiiiiIIIII == null) {
            this.IiIIIiiiiIiiI.setText("#W" + friendBean.getFid());
        } else if (IiiiiiiiIIIII.ALLATORIxDEMO()) {
            this.IiIIIiiiiIiiI.setText("#VBEAU" + IiiiiiiiIIIII.toString() + "#L");
        } else {
            this.IiIIIiiiiIiiI.setText("#cFF00FF" + IiiiiiiiIIIII.getBeau());
        }
        this.iIiiIiiiiiiII[3].setText(IiiiIiiiiIIII.iIiIiiiiIIiii((int)friendBean.getLvl()));
        this.iIiiIiiiiiiII[4].setText(UtilSkin.getRaceSting((int)friendBean.getSpeciesId()));
        this.ALLATORIxDEMO().iIiIiiiiIIiIi(this.iIiIiiiiIIiii());
    }

    public IIIIIiiiiiiii(GameView gameView) {
        super(76, 2, IiiiIiiiiIiIi.iIIIIiiiiiIIi, gameView);
        this.ALLATORIxDEMO(-1, 0, 360, 315, IiiiIiiiiIiIi.iiIIIiiiiiiiI);
        this.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/1.png", (int)68, (int)68, (int)68, (int)68, (boolean)false), "\u597d\u53cb\u4fe1\u606f");
        this.ALLATORIxDEMO(new iiiiiiiiIIIII(14, 0, 0, 51));
        this.ALLATORIxDEMO = new IIIiiiiiIiIiI();
        this.ALLATORIxDEMO.setBounds(50, 69, 75, 100);
        this.add((Component)this.ALLATORIxDEMO);
        this.IiiiiiiiIIIII = new IIIiiiiiIiIiI("sc/d/27.png");
        this.IiiiiiiiIIIII.setBounds(44, 63, 87, 112);
        this.add((Component)this.IiiiiiiiIIIII);
        this.iiiIiiiiiiiIi = new iiIiIiiiiiIIi[2];
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iiiIiiiiiiiIi.length) {
            this.iiiIiiiiiiiIi[IiiiiiiiIIIII] = new iiIiIiiiiiIIi(IiiiiiiiIIIII == 0 ? "sc/e/5.png" : "sc/e/28.png", 1, 301 + IiiiiiiiIIIII, iiIIiiiiIiiII.iiIiiiiiiIIiI, null, IiiiiiiiIIIII == 0 ? "\u65ad\u4ea4" : (IiiiiiiiIIIII == 1 ? "\u5386\u53f2\u6d88\u606f" : ""), (IiiiIiiiiIiIi)this);
            IIIIIiiiiiiii iIIIIiiiiiiii = this;
            if (IiiiiiiiIIIII == 0) {
                iIIIIiiiiiiii.iiiIiiiiiiiIi[IiiiiiiiIIIII].setBounds(43, 38, 34, 17);
            } else {
                iIIIIiiiiiiii.iiiIiiiiiiiIi[IiiiiiiiIIIII].setBounds(54, 180, 68, 17);
            }
            this.add((Component)this.iiiIiiiiiiiIi[IiiiiiiiIIIII++]);
        }
        this.iIiIiiiiIiIii = new iiIiIiiiiiIIi[3];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iIiIiiiiIiIii.length) {
            this.iIiIiiiiIiIii[IiiiiiiiIIIII] = new iiIiIiiiiiIIi("sc/e/26.png", 1, 303 + IiiiiiiiIIIII, iiIIiiiiIiiII.iiiiIiiiIiiII, iiIIiiiiIiiII.IIiiiiiiIiiII, IiiiiiiiIIIII == 0 ? "\u53d1\u9001\u6d88\u606f" : (IiiiiiiiIIIII == 1 ? "\u4ea4\u6613" : (IiiiiiiiIIIII == 2 ? "\u7533\u8bf7\u5165\u961f" : "")), (IiiiIiiiiIiIi)this);
            this.iIiIiiiiIiIii[IiiiiiiiIIIII].setBounds(158, 211, 59, 25);
            this.add((Component)this.iIiIiiiiIiIii[IiiiiiiiIIIII]);
            if (IiiiiiiiIIIII == 0) {
                this.iIiIiiiiIiIii[IiiiiiiiIIIII].setBounds(49, 211, 99, 25);
            } else if (IiiiiiiiIIIII == 1) {
                this.iIiIiiiiIiIii[IiiiiiiiIIIII].setBtnPath("sc/e/7.png");
            } else if (IiiiiiiiIIIII == 2) {
                this.iIiIiiiiIiIii[IiiiiiiiIIIII].setBounds(227, 211, 99, 25);
            }
            ++IiiiiiiiIIIII;
        }
        this.IIiiIiiiIIiIi = new JLabel[7];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IIiiIiiiIIiIi.length) {
            this.IIiiIiiiIIiIi[IiiiiiiiIIIII] = IiIIIiiiiIIiI.ALLATORIxDEMO((int)132, (int)(38 + IiiiiiiiIIIII * 23), (int)72, (int)19, (int)0, (Color)Color.black, (Font)iiIIiiiiIiiII.iiiiIiiiIiiII);
            this.IIiiIiiiIIiIi[IiiiiiiiIIIII].setText(IiiiiiiiIIIII == 0 ? "\u540d  \u5b57" : (IiiiiiiiIIIII == 1 ? "\u79f0  \u8c13" : (IiiiiiiiIIIII == 2 ? "I  D" : (IiiiiiiiIIIII == 3 ? "\u7b49  \u7ea7" : (IiiiiiiiIIIII == 4 ? "\u79cd  \u65cf" : (IiiiiiiiIIIII == 5 ? "\u5173  \u7cfb" : (IiiiiiiiIIIII == 6 ? "\u5e2e  \u6d3e" : "")))))));
            this.add(this.IIiiIiiiIIiIi[IiiiiiiiIIIII++]);
        }
        this.iIiiIiiiiiiII = new iIIiIiiiIiiIi[7];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iIiiIiiiiiiII.length) {
            if (IiiiiiiiIIIII == 2) {
                this.IiIIIiiiiIiiI = new RichLabel("", iiIIiiiiIiiII.iIIIiiiiIIIii);
                this.IiIIIiiiiIiiI.setBounds(209, 35 + IiiiiiiiIIIII * 23, 124, 19);
                this.add((Component)this.IiIIIiiiiIiiI);
            }
            this.iIiiIiiiiiiII[IiiiiiiiIIIII] = IiIIIiiiiIIiI.ALLATORIxDEMO((int)207, (int)(38 + IiiiiiiiIIIII * 23), (int)124, (int)19, (int)10, (Color)Color.white, (Font)iiIIiiiiIiiII.iIiIIiiiiIIiI);
            this.iIiiIiiiiiiII[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/17.png", (int)6, (int)6, (int)6, (int)6, (boolean)false));
            this.add((Component)this.iIiiIiiiiiiII[IiiiiiiiIIIII++]);
        }
    }

    /*
     * WARNING - void declaration
     */
    public void iIiIiiiiIIiii(int id) {
        if (this.iiIiiiiiiiIii == null) {
            return;
        }
        if (id == 301) {
            void IiiiiiiiIIIII;
            RoleData IiiiiiiiIIIII2 = this.ALLATORIxDEMO();
            FriendBean IiiiiiiiIIIII3 = IiiiiiiiIIIII2.getFriend(this.iiIiiiiiiiIii.getFid());
            if (IiiiiiiiIIIII3 == null) return;
            if (IiiiiiiiIIIII3.getGroup() == 0) {
                return;
            }
            IiiiiiiiIIIII3.setFlag((IiiiiiiiIIIII3.ALLATORIxDEMO() ? 1 : 0) << 4);
            Friend friend = new Friend();
            friend.setRoleid(IiiiiiiiIIIII2.getLoginResult().getRole_id());
            friend.setFriendid(new BigDecimal(IiiiiiiiIIIII3.getFid()));
            String string = Agreement.getSendTextAES((String)"deletefriend", (String)iiIiiiiiIIiii.ALLATORIxDEMO().toJson(IiiiiiiiIIIII));
            this.ALLATORIxDEMO().ALLATORIxDEMO(string);
            this.ALLATORIxDEMO().iiiIiiiiiiIIi(this.iIiIiiiiIIiii());
            if (this.ALLATORIxDEMO().iIiIiiiiIIiii(4) == null) return;
            ((iIiiiiiiiiiii)this.iiIIiiiiIiIIi.getFormManagement().ALLATORIxDEMO(4)).ALLATORIxDEMO(IiiiiiiiIIIII2.getFriendList(), false);
            return;
        }
        if (id == 302 || id == 303) {
            iIiiIiiiIiIIi IiiiiiiiIIIII = (iIiiIiiiIiIIi)this.iiIIiiiiIiIIi.getFormManagement().iiiIiiiiiiIIi(56);
            IiiiiiiiIIIII.ALLATORIxDEMO(this.ALLATORIxDEMO().getFriend(this.iiIiiiiiiiIii.getFid()));
            return;
        }
        if (id != 304) {
            if (id != 305) return;
            iiIiIiiiiIiii.ALLATORIxDEMO((BigDecimal)new BigDecimal(this.iiIiiiiiiiIii.getFid()), (GameView)this.iiIIiiiiIiIIi);
            return;
        }
        iiIiIiiiiIiii IiiiiiiiIIIII = this.iiIIiiiiIiIIi.mapScene.ALLATORIxDEMO(this.iiIiiiiiiiIii.getRoleName());
        if (IiiiiiiiIIIII == null) {
            this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u73a9\u5bb6\u79bb\u4f60\u592a\u8fdc\u4e86");
            return;
        }
        iiIiIiiiiIiii.ALLATORIxDEMO((iiIiIiiiiIiii)IiiiiiiiIIIII, (GameView)this.iiIIiiiiIiIIi);
    }
}
