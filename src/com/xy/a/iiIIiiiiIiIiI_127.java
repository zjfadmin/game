/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.IIiIiiiiiiiII
 *  com.xy.a.IiIiIiiiiIiii
 *  com.xy.formula.FormulaNum
 *  com.xy.q.IIIiIiiiiIiII
 *  com.xy.q.IIiiIiiiIiiiI
 *  com.xy.q.IiIIIiiiiIIiI
 *  com.xy.q.IiiiIiiiiIiII
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.q.iiiIIiiiIIIii
 *  com.xy.readbean.AllMapBean
 *  com.xy.readbean.MapModel
 *  com.xy.readbean.NpcInfoBean
 *  com.xy.richtext.RichLabel
 *  com.xy.text.GameView
 *  com.xy.v.IIiiIiiiiIIiI
 *  com.xy.v.IiiiiiiiiIIII
 *  com.xy.w.IIIIIiiiIiiII
 *  com.xy.w.IIIiiiiiIiIiI
 *  com.xy.w.IIiIiiiiIIiii
 */
package com.xy.a;

import com.xy.a.IIiIiiiiiiiII;
import com.xy.a.IiIiIiiiiIiii;
import com.xy.formula.FormulaNum;
import com.xy.q.IIIiIiiiiIiII;
import com.xy.q.IIiiIiiiIiiiI;
import com.xy.q.IiIIIiiiiIIiI;
import com.xy.q.IiiiIiiiiIiII;
import com.xy.q.IiiiIiiiiIiIi;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.q.iiiIIiiiIIIii;
import com.xy.readbean.AllMapBean;
import com.xy.readbean.MapModel;
import com.xy.readbean.NpcInfoBean;
import com.xy.richtext.RichLabel;
import com.xy.text.GameView;
import com.xy.v.IIiiIiiiiIIiI;
import com.xy.v.IiiiiiiiiIIII;
import com.xy.w.IIIIIiiiIiiII;
import com.xy.w.IIIiiiiiIiIiI;
import com.xy.w.IIiIiiiiIIiii;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class iiIIiiiiIiIiI
extends IiiiIiiiiIiIi {
    private IIIiiiiiIiIiI[] iiiiIiiiIiiII;
    private JLabel[] iiiIiiiiiiiIi;
    private IIIiIiiiiIiII iIiiIiiiiiiII;
    private IiiiIiiiiIiII IIiiIiiiIIiIi;
    private IIiiIiiiIiiiI iIiIiiiiIiIii;
    private MapModel IiIIIiiiiIiiI;
    private JComponent iiIiiiiiiiIii;
    private JScrollPane IiiiiiiiIIIII;
    private RichLabel ALLATORIxDEMO;

    public void ALLATORIxDEMO(String value, JTextField textField) {
        if (this.IiIIIiiiiIiiI == null) return;
        this.iiiIiiiiiiIIi();
    }

    public iiIIiiiiIiIiI(GameView gameView) {
        super(157, 2, IiiiIiiiiIiIi.iIIIIiiiiiIIi, gameView);
        this.ALLATORIxDEMO(-2, 0, 262, 415, IiiiIiiiiIiIi.iiIIIiiiiiiiI);
        this.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/1.png", (int)68, (int)68, (int)68, (int)68, (boolean)false), "\u5bfb\u627eNPC");
        this.iiIiiiiiiiIii = new IIiIiiiiiiiII(this);
        this.iiiIiiiiiiiIi = new JLabel[2];
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iiiIiiiiiiiIi.length) {
            this.iiiIiiiiiiiIi[IiiiiiiiIIIII] = IiIIIiiiiIIiI.ALLATORIxDEMO((int)47, (int)(32 + 47 * IiiiiiiiIIIII), (int)120, (int)20, (Color)Color.black, (Font)iiIIiiiiIiiII.iiiiIiiiIiiII);
            this.iiiIiiiiiiiIi[IiiiiiiiIIIII].setText(IiiiiiiiIIIII == 0 ? "\u8f93\u5165npc\u540d\u79f0" : (IiiiiiiiIIIII == 1 ? "\u573a\u666f" : ""));
            this.iiiIiiiiiiiIi[IiiiiiiiIIIII].setHorizontalAlignment(10);
            this.add(this.iiiIiiiiiiiIi[IiiiiiiiIIIII++]);
        }
        this.IIiiIiiiIIiIi = IiIIIiiiiIIiI.ALLATORIxDEMO((IIiIiiiiIIiii)IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/17.png", (int)5, (int)5, (int)5, (int)5, (boolean)false), (Font)iiIIiiiiIiiII.iIIIiiiiIIIii, (Color)Color.white);
        this.IIiiIiiiIIiIi.setHorizontalAlignment(10);
        this.IIiiIiiiIIiIi.setBounds(47, 54, 184, 19);
        this.add((Component)this.IIiiIiiiIIiIi);
        this.iIiIiiiiIiIii = new IIiiIiiiIiiiI(15, (JTextField)this.IIiiIiiiIIiIi, (IiiiIiiiiIiIi)this);
        this.iIiiIiiiiiiII = new IIIiIiiiiIiII(2, 100, (IiiiIiiiiIiIi)this);
        this.iIiiIiiiiiiII.iIiIiiiiIIiii(true);
        this.iIiiIiiiiiiII.ALLATORIxDEMO(84, 79, 145, 20);
        this.add((Component)this.iIiiIiiiiiiII);
        ArrayList<Long> IiiiiiiiIIIII2 = new ArrayList<Long>();
        AllMapBean IiiiiiiiIIIII3 = this.ALLATORIxDEMO().ALLATORIxDEMO();
        for (MapModel IiiiiiiiIIIII4 : IiiiiiiiIIIII3.getAllMap().values()) {
            IiiiiiiiIIIII2.add(IiiiiiiiIIIII4.getMapId());
        }
        Collections.sort(IiiiiiiiIIIII2);
        int IiiiiiiiIIIII5 = 0;
        while (IiiiiiiiIIIII5 < IiiiiiiiIIIII2.size()) {
            MapModel IiiiiiiiIIIII6 = (MapModel)IiiiiiiiIIIII3.getAllMap().get(((Long)IiiiiiiiIIIII2.get(IiiiiiiiIIIII5)).toString());
            ++IiiiiiiiIIIII5;
            this.iIiiIiiiiiiII.ALLATORIxDEMO(new iiiIIiiiIIIii(IiiiiiiiIIIII6.getMapName(), (Object)IiiiiiiiIIIII6.getMapId()));
        }
        this.IiiiiiiiIIIII = IiIIIiiiiIIiI.ALLATORIxDEMO((int)50, (int)124, (int)181, (int)223, (Component)this.iiIiiiiiiiIii, (int)20);
        this.add(this.IiiiiiiiIIIII);
        this.ALLATORIxDEMO = new RichLabel("", iiIIiiiiIiiII.iIIiiiiiiIIII);
        this.ALLATORIxDEMO.setTextSize("#c000000*\u70b9\u51fb\u641c\u7d22\u7ed3\u679c\u53ef\u4ee5\u67e5\u770b\u8be5NPC\u5728\u5c0f\u5730\u56fe\u7684\u4f4d\u7f6e", 180);
        this.ALLATORIxDEMO.setBounds(51, 352, this.ALLATORIxDEMO.getWidth(), this.ALLATORIxDEMO.getHeight());
        this.add((Component)this.ALLATORIxDEMO);
        this.iiiiIiiiIiiII = new IIIiiiiiIiIiI[2];
        IiiiiiiiIIIII5 = 0;
        while (IiiiiiiiIIIII5 < this.iiiiIiiiIiiII.length) {
            this.iiiiIiiiIiiII[IiiiiiiiIIIII5] = new IIIiiiiiIiIiI();
            this.add((Component)this.iiiiIiiiIiiII[IiiiiiiiIIIII5]);
            if (IiiiiiiiIIIII5 == 0) {
                this.iiiiIiiiIiiII[IiiiiiiiIIIII5].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/25.png", (int)2, (int)2, (int)2, (int)2, (boolean)false));
                this.iiiiIiiiIiiII[IiiiiiiiIIIII5].setBounds(49, 103, 180, 21);
            } else if (IiiiiiiiIIIII5 == 1) {
                this.iiiiIiiiIiiII[IiiiiiiiIIIII5].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/24.png", (int)2, (int)2, (int)2, (int)2, (boolean)false));
                this.iiiiIiiiIiiII[IiiiiiiiIIIII5].setBounds(49, 103, 180, 245);
            }
            ++IiiiiiiiIIIII5;
        }
    }

    public void iiiIiiiiiiIIi() {
        String IiiiiiiiIIIII = this.IIiiIiiiIIiIi.getText();
        if (IIiiIiiiiIIiI.iIiIiiiiIIiIi((String)IiiiiiiiIIIII)) {
            IiiiiiiiIIIII = null;
        }
        IiiiiiiiiIIII IiiiiiiiIIIII2 = this.ALLATORIxDEMO();
        FormulaNum[] IiiiiiiiIIIII3 = this.IiIIIiiiiIiiI.getNpcs();
        int IiiiiiiiIIIII4 = 0;
        int IiiiiiiiIIIII5 = 0;
        int IiiiiiiiIIIII6 = IiiiiiiiIIIII3 != null ? IiiiiiiiIIIII3.length : 0;
        while (IiiiiiiiIIIII5 < IiiiiiiiIIIII6) {
            FormulaNum IiiiiiiiIIIII7 = IiiiiiiiIIIII3[IiiiiiiiIIIII5];
            int IiiiiiiiIIIII8 = 0;
            int IiiiiiiiIIIII9 = IiiiiiiiIIIII7.getSize();
            while (IiiiiiiiIIIII8 < IiiiiiiiIIIII9) {
                long IiiiiiiiIIIII10 = IiiiiiiiIIIII7.getZhi(IiiiiiiiIIIII8);
                NpcInfoBean IiiiiiiiIIIII11 = IiiiiiiiIIIII2.ALLATORIxDEMO(String.valueOf(IiiiiiiiIIIII10));
                if (!(IiiiiiiiIIIII11 == null || IIiiIiiiiIIiI.iIiIiiiiIIiIi((String)IiiiiiiiIIIII11.getNpctable().getNpctype()) || IIiiIiiiiIIiI.iIiIiiiiIIiIi((String)IiiiiiiiIIIII11.getNpctable().getNpcname()) || IiiiiiiiIIIII != null && IiiiiiiiIIIII11.getNpctable().getNpcname().indexOf(IiiiiiiiIIIII) == -1)) {
                    IiIiIiiiiIiii IiiiiiiiIIIII12 = (IiIiIiiiiIiii)(IiiiiiiiIIIII4 < this.iiIiiiiiiiIii.getComponentCount() ? this.iiIiiiiiiiIii.getComponent(IiiiiiiiIIIII4) : null);
                    if (IiiiiiiiIIIII12 == null) {
                        IiiiiiiiIIIII12 = new IiIiIiiiiIiii(this, IiiiiiiiIIIII4);
                        this.iiIiiiiiiiIii.add((Component)IiiiiiiiIIIII12);
                    }
                    IiiiiiiiIIIII12.ALLATORIxDEMO(IiiiiiiiIIIII4++, this.IiIIIiiiiIiiI, IiiiiiiiIIIII11);
                }
                ++IiiiiiiiIIIII8;
            }
            ++IiiiiiiiIIIII5;
        }
        IiiiiiiiIIIII5 = IiiiiiiiIIIII4;
        while (IiiiiiiiIIIII5 < this.iiIiiiiiiiIii.getComponentCount()) {
            this.iiIiiiiiiiIii.getComponent(IiiiiiiiIIIII5++).setVisible(false);
        }
        this.iiIiiiiiiiIii.setPreferredSize(new Dimension(163, IiiiiiiiIIIII4 * 38));
    }

    public void ALLATORIxDEMO(long mapId) {
        this.IiIIIiiiiIiiI = this.ALLATORIxDEMO().ALLATORIxDEMO(String.valueOf(mapId));
        this.iiiIiiiiiiIIi();
    }

    public void ALLATORIxDEMO(MapModel mapModel) {
        this.IIiiIiiiIIiIi.setText("");
        this.iIiiIiiiiiiII.ALLATORIxDEMO((Object)mapModel.getMapId());
        this.ALLATORIxDEMO().iIiIiiiiIIiIi(this.iIiIiiiiIIiii());
    }
}
