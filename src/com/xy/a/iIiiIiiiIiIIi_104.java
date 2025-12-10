/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.bean.BeauBean
 *  com.xy.bean.ChatFriendBean
 *  com.xy.bean.FriendBean
 *  com.xy.i.iiIiIiiiiiIIi
 *  com.xy.q.IIiiiiiiIIIii
 *  com.xy.q.IiIIIiiiiIIiI
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.richtext.RichLabel
 *  com.xy.socket.Agreement
 *  com.xy.text.GameView
 *  com.xy.v.IIiIiiiiIiIII
 *  com.xy.v.IiiiIiiiiIIII
 *  com.xy.v.iIiIIiiiIiiiI
 *  com.xy.v.iiIiiiiiIIiii
 *  com.xy.w.IIIIIiiiIiiII
 *  com.xy.w.IIIiiiiiIiIiI
 *  com.xy.w.IIiIiiiiIIiii
 *  com.xy.w.IIiIiiiiIiiIi
 */
package com.xy.a;

import com.xy.bean.BeauBean;
import com.xy.bean.ChatFriendBean;
import com.xy.bean.FriendBean;
import com.xy.i.iiIiIiiiiiIIi;
import com.xy.q.IIiiiiiiIIIii;
import com.xy.q.IiIIIiiiiIIiI;
import com.xy.q.IiiiIiiiiIiIi;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.richtext.RichLabel;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import com.xy.v.IIiIiiiiIiIII;
import com.xy.v.IiiiIiiiiIIII;
import com.xy.v.iIiIIiiiIiiiI;
import com.xy.v.iiIiiiiiIIiii;
import com.xy.w.IIIIIiiiIiiII;
import com.xy.w.IIIiiiiiIiIiI;
import com.xy.w.IIiIiiiiIIiii;
import com.xy.w.IIiIiiiiIiiIi;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class iIiiIiiiIiIIi
extends IiiiIiiiiIiIi {
    private IIIiiiiiIiIiI iIIiIiiiiiiIi;
    private JLabel IIIIiiiiiiiII;
    private JScrollPane iiIIIiiiiiiiI;
    private IIIiiiiiIiIiI IiIiiiiiIIIII;
    private RichLabel iiIiIiiiiIIIi;
    private IIiiiiiiIIIii iiiiIiiiIiiII;
    private JScrollPane iiiIiiiiiiiIi;
    private RichLabel iIiiIiiiiiiII;
    private JLabel[] IIiiIiiiIIiIi;
    private FriendBean iIiIiiiiIiIii;
    private IIIiiiiiIiIiI IiIIIiiiiIiiI;
    private IIIiiiiiIiIiI iiIiiiiiiiIii;
    private iiIiIiiiiiIIi IiiiiiiiIIIII;
    private IIIiiiiiIiIiI ALLATORIxDEMO;

    public void iIiIiiiiIIiIi() {
        JScrollBar jScrollBar = this.iiiIiiiiiiiIi.getVerticalScrollBar();
        jScrollBar.setMaximum(this.iiIiIiiiiIIIi.getHeight());
        jScrollBar.setValue(jScrollBar.getMaximum());
    }

    public iIiiIiiiIiIIi(GameView gameView) {
        super(56, 2, IiiiIiiiiIiIi.iIIIIiiiiiIIi, gameView);
        this.ALLATORIxDEMO(-1, 0, 356, 411, IiiiIiiiiIiIi.iiIIIiiiiiiiI);
        this.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/1.png", (int)68, (int)68, (int)68, (int)68, (boolean)false), null);
        this.iIiIiiiiIIiii(true);
        this.IiIIIiiiiIiiI = new IIIiiiiiIiIiI();
        this.IiIIIiiiiIiiI.setBounds(23, 18, 40, 40);
        this.add((Component)this.IiIIIiiiiIiiI);
        this.iiIiiiiiiiIii = new IIIiiiiiIiIiI("sc/d/28.png");
        this.iiIiiiiiiiIii.setBounds(17, 12, 52, 52);
        this.add((Component)this.iiIiiiiiiiIii);
        this.IIiiIiiiIIiIi = new JLabel[2];
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IIiiIiiiIIiIi.length) {
            this.IIiiIiiiIIiIi[IiiiiiiiIIIII] = IiIIIiiiiIIiI.ALLATORIxDEMO((int)73, (int)23, (int)200, (int)18, (Color)Color.black, (Font)iiIIiiiiIiiII.iIiIiiiiiiIIi);
            this.IIiiIiiiIIiIi[IiiiiiiiIIIII].setText(IiiiiiiiIIIII == 1 ? "\u53d1\u9001\u4e0d\u5173\u95ed" : "");
            this.add(this.IIiiIiiiIIiIi[IiiiiiiiIIIII]);
            if (IiiiiiiiIIIII == 1) {
                this.IIiiIiiiIIiIi[IiiiiiiiIIIII].setBounds(39, 297, 200, 19);
            }
            ++IiiiiiiiIIIII;
        }
        this.IIIIiiiiiiiII = IiIIIiiiiIIiI.ALLATORIxDEMO((int)75, (int)46, (int)120, (int)19, (Color)Color.black, (Font)iiIIiiiiIiiII.iIIIiiiiIIIii);
        this.add(this.IIIIiiiiiiiII);
        this.iIiiIiiiiiiII = new RichLabel("", iiIIiiiiIiiII.iIIIiiiiIIIii);
        this.iIiiIiiiiiiII.setBounds(147, 43, 124, 19);
        this.add((Component)this.iIiiIiiiiiiII);
        this.iiIiIiiiiIIIi = IIiIiiiiIiIII.ALLATORIxDEMO((String)"", (Font)iiIIiiiiIiiII.iIiIIiiiiIIiI, (int)228);
        this.iiiIiiiiiiiIi = IiIIIiiiiIIiI.ALLATORIxDEMO((int)24, (int)87, (int)306, (int)206, (Component)this.iiIiIiiiiIIIi, (int)200);
        this.add(this.iiiIiiiiiiiIi);
        this.iiiiIiiiIiiII = IiIIIiiiiIIiI.ALLATORIxDEMO((IIiIiiiiIIiii)IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/17.png", (int)3, (int)3, (int)3, (int)3, (boolean)false), (Font)iiIIiiiiIiiII.iiIiiiiiiIIiI, (Color)Color.white);
        this.iiiiIiiiIiiII.setLineWrap(true);
        this.iiiiIiiiIiiII.setWrapStyleWord(true);
        this.iiIIIiiiiiiiI = IiIIIiiiiIIiI.ALLATORIxDEMO((int)20, (int)319, (int)314, (int)44, (Component)this.iiiiIiiiIiiII, (int)20);
        this.add(this.iiIIIiiiiiiiI);
        this.IiIiiiiiIIIII = new IIIiiiiiIiIiI();
        this.IiIiiiiiIIIII.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/25.png", (int)2, (int)2, (int)2, (int)2, (boolean)false));
        this.IiIiiiiiIIIII.setBounds(20, 67, 312, 21);
        this.add((Component)this.IiIiiiiiIIIII);
        this.ALLATORIxDEMO = new IIIiiiiiIiIiI();
        this.ALLATORIxDEMO.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/24.png", (int)2, (int)2, (int)2, (int)2, (boolean)false));
        this.ALLATORIxDEMO.setBounds(20, 67, 312, 228);
        this.add((Component)this.ALLATORIxDEMO);
        this.iIIiIiiiiiiIi = new IIIiiiiiIiIiI("sc/e/30.png");
        this.iIIiIiiiiiiIi.setBounds(20, 298, 17, 17);
        this.add((Component)this.iIIiIiiiiiiIi);
        this.IiiiiiiiIIIII = new iiIiIiiiiiIIi("sc/e/7.png", 1, 201, iiIIiiiiIiiII.iiiiIiiiIiiII, iiIIiiiiIiiII.IIiiiiiiIiiII, "\u53d1\u9001", (IiiiIiiiiIiIi)this);
        this.IiiiiiiiIIIII.setBounds(269, 368, 59, 25);
        this.add((Component)this.IiiiiiiiIIIII);
    }

    public boolean ALLATORIxDEMO(long id, String chat) {
        if (this.iIiIiiiiIiIii == null) return false;
        if (this.iIiIiiiiIiIii.getFid() != id) {
            return false;
        }
        this.iiIiIiiiiIIIi.addText(chat, 286);
        this.iIiIiiiiIIiIi();
        return true;
    }

    /*
     * WARNING - void declaration
     */
    public void iiiIiiiiiiIIi() {
        void IiiiiiiiIIIII;
        String IiiiiiiiIIIII2 = this.iiiiIiiiIiiII.getText().trim().replace("\n", "#r");
        if (IiiiiiiiIIIII2.equals("")) {
            return;
        }
        this.iiiiIiiiIiiII.setText(null);
        ChatFriendBean chatFriendBean = new ChatFriendBean();
        IiiiiiiiIIIII.setSendRoleId(this.ALLATORIxDEMO().getLoginResult().getRole_id());
        IiiiiiiiIIIII.setRolename(this.ALLATORIxDEMO().getLoginResult().getRolename());
        IiiiiiiiIIIII.setFriendName(this.iIiIiiiiIiIii.getRoleName());
        IiiiiiiiIIIII.setMessage(IiiiiiiiIIIII2);
        IiiiiiiiIIIII.setTime(iIiIIiiiIiiiI.iIiIiiiiIIiii());
        String IiiiiiiiIIIII3 = Agreement.getSendTextAES((String)"friendchat", (String)iiIiiiiiIIiii.ALLATORIxDEMO().toJson(IiiiiiiiIIIII));
        this.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII3);
        StringBuffer IiiiiiiiIIIII4 = new StringBuffer();
        IiiiiiiiIIIII4.append("#r#R");
        IiiiiiiiIIIII4.append(iIiIIiiiIiiiI.iIiIiiiiIIiii((long)iIiIIiiiIiiiI.ALLATORIxDEMO()));
        IiiiiiiiIIIII4.append(" ");
        IiiiiiiiIIIII4.append(this.ALLATORIxDEMO().getLoginResult().getRolename());
        IiiiiiiiIIIII4.append("#r#W");
        IiiiiiiiIIIII4.append(IiiiiiiiIIIII2);
        this.iIiIiiiiIiIii.ALLATORIxDEMO(IiiiiiiiIIIII4.toString());
        this.iiIiIiiiiIIIi.addText(IiiiiiiiIIIII4.toString(), 286);
        this.iIiIiiiiIIiIi();
    }

    public void ALLATORIxDEMO(FriendBean friendBean) {
        this.iIiIiiiiIiIii = friendBean;
        this.iiiiIiiiIiiII.setText(null);
        this.IiIIIiiiiIiiI.iIiIiiiiIIiii(IIiIiiiiIiiIi.iiiIiiiiiiIIi((String)("s" + friendBean.getSpeciesId())));
        BeauBean IiiiiiiiIIIII = friendBean.getBeauBean();
        if (IiiiiiiiIIIII == null) {
            this.iIiiIiiiiiiII.setText("#W" + friendBean.getFid());
        } else if (IiiiiiiiIIIII.ALLATORIxDEMO()) {
            this.iIiiIiiiiiiII.setText("#VBEAU" + IiiiiiiiIIIII.toString() + "#L");
        } else {
            this.iIiiIiiiiiiII.setText("#cFF00FF" + IiiiiiiiIIIII.getBeau());
        }
        this.IIiiIiiiIIiIi[0].setForeground(iiIIiiiiIiiII.ALLATORIxDEMO((int)IiiiIiiiiIIII.iIiIiiiiIIiii((int)friendBean.getLvl())));
        this.IIiiIiiiIIiIi[0].setText(friendBean.getRoleName());
        if (friendBean.getGroup() == 0) {
            this.IIIIiiiiiiiII.setText("\u975e\u597d\u53cb");
        } else {
            this.IIIIiiiiiiiII.setText(IiiiIiiiiIIII.iIiIiiiiIIiii((int)friendBean.getLvl()));
        }
        this.iiIiIiiiiIIIi.setTextSize(friendBean.getChat(), 286);
        this.iIiIiiiiIIiIi();
        this.ALLATORIxDEMO().iIiIiiiiIIiIi(this.iIiIiiiiIIiii());
    }

    public JTextArea ALLATORIxDEMO() {
        return this.iiiiIiiiIiiII;
    }
}
