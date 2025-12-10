/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.w.IiiiIiiiiIiIi
 *  com.xy.bean.LoginResult
 *  com.xy.bean.TitleBean
 *  com.xy.entity.Titletable
 *  com.xy.game.RoleData
 *  com.xy.i.IIiIiiiiIiIII
 *  com.xy.q.IiIIIiiiiIIiI
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.q.iIIiIiiiIiiIi
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.q.iiiIIiiiIIIii
 *  com.xy.readbean.Title
 *  com.xy.richtext.RichLabel
 *  com.xy.socket.Agreement
 *  com.xy.text.GameView
 *  com.xy.text.SystemData
 *  com.xy.v.IIiIiiiiIiIII
 *  com.xy.v.IIiiIiiiiIIiI
 *  com.xy.w.IIIIIiiiIiiII
 *  com.xy.w.IIIiiiiiIiIiI
 */
package com.xy.a.w;

import com.xy.a.w.IiiiIiiiiIiIi;
import com.xy.bean.LoginResult;
import com.xy.bean.TitleBean;
import com.xy.entity.Titletable;
import com.xy.game.RoleData;
import com.xy.i.IIiIiiiiIiIII;
import com.xy.q.IiIIIiiiiIIiI;
import com.xy.q.iIIiIiiiIiiIi;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.q.iiiIIiiiIIIii;
import com.xy.readbean.Title;
import com.xy.richtext.RichLabel;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import com.xy.text.SystemData;
import com.xy.v.IIiiIiiiiIIiI;
import com.xy.w.IIIIIiiiIiiII;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.math.BigDecimal;
import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.event.ListSelectionListener;

public class IIIiiiiiIiIiI
extends com.xy.q.IiiiIiiiiIiIi {
    private DefaultListModel<iiiIIiiiIIIii> iiiiIiiiIiiII;
    private RichLabel iiiIiiiiiiiIi;
    private JLabel[] iIiiIiiiiiiII;
    private com.xy.w.IIIiiiiiIiIiI[] IIiiIiiiIIiIi;
    private JScrollPane iIiIiiiiIiIii;
    private IIiIiiiiIiIII[] IiIIIiiiiIiiI;
    private iIIiIiiiIiiIi iiIiiiiiiiIii;
    private JScrollPane IiiiiiiiIIIII;
    private JList<iiiIIiiiIIIii> ALLATORIxDEMO;

    static /* synthetic */ JList ALLATORIxDEMO(IIIiiiiiIiIiI arg0) {
        return arg0.ALLATORIxDEMO;
    }

    public void iIiIiiiiIIiii() {
        this.IiIIIiiiiIiiI[1].setText(SystemData.ISTITLE ? "\u9690\u85cf\u79f0\u8c13" : "\u663e\u793a\u79f0\u8c13");
        super.iIiIiiiiIIiii();
    }

    /*
     * WARNING - void declaration
     */
    public void ALLATORIxDEMO(TitleBean titleBean) {
        void IiiiiiiiIIIII;
        this.iiiiIiiiIiiII.removeAllElements();
        LoginResult IiiiiiiiIIIII2 = this.ALLATORIxDEMO().getLoginResult();
        this.iiIiiiiiiiIii.setText(IiiiiiiiIIIII2.getTitle());
        int IiiiiiiiIIIII3 = 0;
        int IiiiiiiiIIIII4 = titleBean.getTitletables() != null ? titleBean.getTitletables().size() : 0;
        while (IiiiiiiiIIIII3 < IiiiiiiiIIIII4) {
            Titletable IiiiiiiiIIIII5 = (Titletable)titleBean.getTitletables().get(IiiiiiiiIIIII3);
            ++IiiiiiiiIIIII3;
            this.iiiiIiiiIiiII.addElement(new iiiIIiiiIIIii(IiiiiiiiIIIII5.getTitlename(), null));
        }
        if (IiiiiiiiIIIII2.getGang_id() != null && IiiiiiiiIIIII2.getGangname() != null && IiiiiiiiIIIII2.getGangpost() != null) {
            this.iiiiIiiiIiiII.addElement(new iiiIIiiiIIIii(String.valueOf(IiiiiiiiIIIII2.getGangname()) + IiiiiiiiIIIII2.getGangpost(), null));
        }
        if (!IIiiIiiiiIIiI.iIiIiiiiIIiIi((String)IiiiiiiiIIIII2.getMarryObject())) {
            if (IiiiiiiiIIIII2.getSex().equals("\u7537")) {
                this.iiiiIiiiIiiII.addElement(new iiiIIiiiIIIii(String.valueOf(IiiiiiiiIIIII2.getMarryObject()) + "\u7684\u8001\u516c", null));
            } else if (IiiiiiiiIIIII2.getSex().equals("\u5973")) {
                this.iiiiIiiiIiiII.addElement(new iiiIIiiiIIIii(String.valueOf(IiiiiiiiIIIII2.getMarryObject()) + "\u7684\u8001\u5a46", null));
            }
        }
        if ((IiiiiiiiIIIII = IiiiiiiiIIIII2.getKilltype("\u51fb\u6740\u715e\u661f")) >= 7.0) {
            this.iiiiIiiiIiiII.addElement(new iiiIIiiiIIIii("\u5730\u715e\u6597\u58eb", null));
        }
        if (IiiiiiiiIIIII >= 11.0) {
            this.iiiiIiiiIiiII.addElement(new iiiIIiiiIIIii("\u5730\u715e\u514b\u661f", null));
        }
        if (IiiiiiiiIIIII >= 15.0) {
            this.iiiiIiiiIiiII.addElement(new iiiIIiiiIIIii("\u5730\u715e\u6218\u795e", null));
        }
        int IiiiiiiiIIIII6 = this.ALLATORIxDEMO().getTaskSystem().ALLATORIxDEMO(110, 3);
        int IiiiiiiiIIIII7 = this.ALLATORIxDEMO(IiiiiiiiIIIII6);
        BigDecimal bigDecimal = IiiiiiiiIIIII2.getRace_id();
        String[] IiiiiiiiIIIII8 = bigDecimal.compareTo(new BigDecimal(10001)) == 0 ? new String[]{"\u6b66\u6797\u65b0\u4e01", "\u6c5f\u6e56\u5c0f\u867e", "\u540e\u8d77\u4e4b\u79c0", "\u6b66\u6797\u9ad8\u624b", "\u98ce\u5c18\u5947\u4fa0", "\u65e0\u53cc\u9690\u58eb", "\u4e16\u5916\u9ad8\u4eba", "\u6c5f\u6e56\u4fa0\u9690", "\u65e0\u654c\u5723\u8005", "\u4e09\u754c\u8d24\u541b"} : (IiiiiiiiIIIII.compareTo(new BigDecimal(10002)) == 0 ? new String[]{"\u53e4\u7075\u7cbe\u602a", "\u9b45\u529b\u7cbe\u7075", "\u9b54\u5e7b\u4f7f\u8005", "\u5996\u4e4b\u5947\u8469", "\u5929\u795e\u715e\u661f", "\u4e07\u517d\u5996\u7075", "\u6df7\u4e16\u9b54\u738b", "\u4e09\u754c\u5996\u4ed9", "\u9b54\u795e\u81f3\u5c0a", "\u9f50\u5929\u5996\u738b"} : (IiiiiiiiIIIII.compareTo(new BigDecimal(10003)) == 0 ? new String[]{"\u4ed9\u7075\u5c0f\u7ae5", "\u900d\u9065\u4e4b\u4ed9", "\u9646\u5730\u98de\u4ed9", "\u65e0\u6781\u5929\u5e08", "\u795e\u673a\u771f\u4eba", "\u964d\u9b54\u91d1\u4ed9", "\u91d1\u8eab\u5c0a\u8005", "\u592a\u5916\u98de\u4ed9", "\u4e07\u5723\u5929\u5c0a", "\u4e5d\u5929\u5723\u4f5b"} : new String[]{"\u9634\u66f9\u5c0f\u9b3c", "\u98d8\u6e3a\u4e4b\u9b42", "\u5e7d\u51a5\u9b3c\u58eb", "\u52fe\u9b42\u4f7f\u8005", "\u50ac\u547d\u5224\u5b98", "\u9634\u9633\u65e0\u5e38", "\u960e\u7f57\u9b3c\u738b", "\u51a5\u7075\u9b3c\u4ed9", "\u4e5d\u5e7d\u795e\u541b", "\u9634\u90fd\u5927\u5e1d"}));
        int IiiiiiiiIIIII9 = 0;
        while (IiiiiiiiIIIII9 < IiiiiiiiIIIII7) {
            String string = IiiiiiiiIIIII8[IiiiiiiiIIIII9];
            ++IiiiiiiiIIIII9;
            this.iiiiIiiiIiiII.addElement(new iiiIIiiiIIIii(string, null));
        }
        this.iiiiIiiiIiiII.addElement(new iiiIIiiiIIIii(String.valueOf(this.ALLATORIxDEMO().getAreaName()) + "\u4e00\u5458", null));
        if (this.iiiiIiiiIiiII.size() > 0) {
            this.ALLATORIxDEMO.setSelectedIndex(0);
        } else {
            this.ALLATORIxDEMO((iiiIIiiiIIIii)null);
        }
        this.ALLATORIxDEMO().iIiIiiiiIIiIi(this.iIiIiiiiIIiii());
    }

    public int ALLATORIxDEMO(int jqId) {
        if (jqId >= 3265) {
            return 9;
        }
        if (jqId >= 3253) {
            return 8;
        }
        if (jqId >= 3239) {
            return 7;
        }
        if (jqId >= 3227) {
            return 6;
        }
        if (jqId >= 3215) {
            return 5;
        }
        if (jqId >= 3204) {
            return 4;
        }
        if (jqId >= 3187) {
            return 3;
        }
        if (jqId >= 3178) {
            return 2;
        }
        if (jqId < 3166) return 0;
        return 1;
    }

    public IIIiiiiiIiIiI(GameView gameView) {
        super(10, 2, com.xy.q.IiiiIiiiiIiIi.iIIIIiiiiiIIi, gameView);
        this.ALLATORIxDEMO(-2, 0, 291, 395, com.xy.q.IiiiIiiiiIiIi.iiIIIiiiiiiiI);
        this.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/1.png", (int)68, (int)68, (int)68, (int)68, (boolean)false), "\u66f4\u6539\u79f0\u8c13");
        this.iIiiIiiiiiiII = new JLabel[2];
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iIiiIiiiiiiII.length) {
            this.iIiiIiiiiiiII[IiiiiiiiIIIII] = IiIIIiiiiIIiI.ALLATORIxDEMO((int)48, (int)33, (int)72, (int)19, (int)0, (Color)Color.white, (Font)iiIIiiiiIiiII.iiiiIiiiIiiII);
            this.iIiiIiiiiiiII[IiiiiiiiIIIII].setText(IiiiiiiiIIIII == 0 ? "\u5f53\u524d\u79f0\u8c13" : (IiiiiiiiIIIII == 1 ? "\u62e5\u6709\u79f0\u8c13" : ""));
            this.add(this.iIiiIiiiiiiII[IiiiiiiiIIIII]);
            if (IiiiiiiiIIIII == 0) {
                this.iIiiIiiiiiiII[IiiiiiiiIIIII].setForeground(Color.black);
            } else if (IiiiiiiiIIIII == 1) {
                this.iIiiIiiiiiiII[IiiiiiiiIIIII].setBounds(50, 56, 210, 21);
            }
            ++IiiiiiiiIIIII;
        }
        this.iiIiiiiiiiIii = IiIIIiiiiIIiI.ALLATORIxDEMO((int)124, (int)33, (int)134, (int)19, (int)0, (Color)Color.white, (Font)iiIIiiiiIiiII.iIiIIiiiiIIiI);
        this.iiIiiiiiiiIii.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/17.png", (int)6, (int)6, (int)6, (int)6, (boolean)false));
        this.add((Component)this.iiIiiiiiiiIii);
        this.iiiiIiiiIiiII = new DefaultListModel();
        this.ALLATORIxDEMO = new JList();
        IiIIIiiiiIIiI.ALLATORIxDEMO(this.ALLATORIxDEMO, (Color)Color.white, (Font)iiIIiiiiIiiII.ALLATORIxDEMO);
        this.ALLATORIxDEMO.setModel(this.iiiiIiiiIiiII);
        this.ALLATORIxDEMO.addListSelectionListener((ListSelectionListener)new IiiiIiiiiIiIi(this));
        this.iIiIiiiiIiIii = IiIIIiiiiIIiI.ALLATORIxDEMO((int)50, (int)77, (int)210, (int)128, this.ALLATORIxDEMO, (int)-1);
        this.add(this.iIiIiiiiIiIii);
        this.iiiIiiiiiiiIi = com.xy.v.IIiIiiiiIiIII.ALLATORIxDEMO((String)"", (Font)iiIIiiiiIiiII.ALLATORIxDEMO, (int)190);
        this.IiiiiiiiIIIII = IiIIIiiiiIIiI.ALLATORIxDEMO((int)52, (int)206, (int)206, (int)108, (Component)this.iiiIiiiiiiiIi, (int)-1);
        this.add(this.IiiiiiiiIIIII);
        this.IIiiIiiiIIiIi = new com.xy.w.IIIiiiiiIiIiI[3];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IIiiIiiiIIiIi.length) {
            this.IIiiIiiiIIiIi[IiiiiiiiIIIII] = new com.xy.w.IIIiiiiiIiIiI();
            IIIiiiiiIiIiI iIIiiiiiIiIiI = this;
            if (IiiiiiiiIIIII == 0) {
                iIIiiiiiIiIiI.IIiiIiiiIIiIi[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/25.png", (int)2, (int)2, (int)2, (int)2, (boolean)false));
            } else {
                iIIiiiiiIiIiI.IIiiIiiiIIiIi[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/24.png", (int)2, (int)2, (int)2, (int)2, (boolean)false));
            }
            if (IiiiiiiiIIIII == 0) {
                this.IIiiIiiiIIiIi[IiiiiiiiIIIII].setBounds(50, 56, 210, 21);
            } else if (IiiiiiiiIIIII == 1) {
                this.IIiiIiiiIIiIi[IiiiiiiiIIIII].setBounds(50, 56, 210, 150);
            } else if (IiiiiiiiIIIII == 2) {
                this.IIiiIiiiIIiIi[IiiiiiiiIIIII].setBounds(50, 205, 210, 110);
            }
            this.add((Component)this.IIiiIiiiIIiIi[IiiiiiiiIIIII++]);
        }
        this.IiIIIiiiiIiiI = new IIiIiiiiIiIII[2];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IiIIIiiiiIiiI.length) {
            this.IiIIIiiiiIiiI[IiiiiiiiIIIII] = new IIiIiiiiIiIII("sc/e/26.png", 1, 371 + IiiiiiiiIIIII, iiIIiiiiIiiII.iiiiIiiiIiiII, iiIIiiiiIiiII.IIiiiiiiIiiII, "", (com.xy.q.IiiiIiiiiIiIi)this);
            this.IiIIIiiiiIiiI[IiiiiiiiIIIII].setBounds(51 + 111 * IiiiiiiiIIIII, 332, 99, 25);
            this.IiIIIiiiiIiiI[IiiiiiiiIIIII].setText(IiiiiiiiIIIII == 0 ? "\u66f4\u6539\u79f0\u8c13" : (IiiiiiiiIIIII == 1 ? "\u9690\u85cf\u79f0\u8c13" : ""));
            this.add((Component)this.IiIIIiiiiIiiI[IiiiiiiiIIIII++]);
        }
    }

    public void ALLATORIxDEMO(iiiIIiiiIIIii item) {
        Title IiiiiiiiIIIII;
        Title title = IiiiiiiiIIIII = item != null ? this.ALLATORIxDEMO().ALLATORIxDEMO(item.ALLATORIxDEMO()) : null;
        if (IiiiiiiiIIIII == null) {
            this.iiiIiiiiiiiIi.setTextSize(null, 190);
            return;
        }
        StringBuffer IiiiiiiiIIIII2 = new StringBuffer();
        if (IiiiiiiiIIIII.getText() != null) {
            IiiiiiiiIIIII2.append(IiiiiiiiIIIII.getText());
        }
        if (IiiiiiiiIIIII.getValue() != null) {
            if (IiiiiiiiIIIII2.length() != 0) {
                IiiiiiiiIIIII2.append("#r");
            }
            IiiiiiiiIIIII2.append(IiiiiiiiIIIII.getValue().replace("\\|", "#r"));
        }
        this.iiiIiiiiiiiIi.setTextSize(IiiiiiiiIIIII2.toString(), 190);
    }

    public void iIiIiiiiIIiii(int id) {
        if (id == 371) {
            if (this.iiIIiiiiIiIIi.mapScene.IiiiIiiiIiIII == 3315L || this.iiIIiiiiIiIIi.scene != null && this.iiIIiiiiIiIIi.scene.getSceneId() == 1011) {
                this.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u8be5\u573a\u666f\u4e0d\u80fd\u66f4\u6362\u79f0\u8c13");
                return;
            }
            iiiIIiiiIIIii IiiiiiiiIIIII = this.ALLATORIxDEMO.getSelectedValue();
            if (IiiiiiiiIIIII == null) {
                this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u8bf7\u9009\u62e9\u60a8\u8981\u66f4\u6539\u7684\u79f0\u8c13\uff01");
                return;
            }
            String IiiiiiiiIIIII2 = IiiiiiiiIIIII.ALLATORIxDEMO();
            String IiiiiiiiIIIII3 = Agreement.getSendTextAES((String)"titlechange", (String)IiiiiiiiIIIII2);
            this.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII3);
            RoleData IiiiiiiiIIIII4 = this.ALLATORIxDEMO();
            this.iiIIiiiiIiIIi.roleUnit.iIiIiiiiIIiii(IiiiiiiiIIIII2);
            IiiiiiiiIIIII4.getLoginResult().setTitle(IiiiiiiiIIIII2);
            IiiiiiiiIIIII4.getRoleProperty().ALLATORIxDEMO();
            IiiiiiiiIIIII4.ALLATORIxDEMO(false);
            return;
        }
        if (id != 372) return;
        SystemData.ISTITLE = !SystemData.ISTITLE;
        this.IiIIIiiiiIiiI[1].setText(SystemData.ISTITLE ? "\u9690\u85cf\u79f0\u8c13" : "\u663e\u793a\u79f0\u8c13");
    }
}
