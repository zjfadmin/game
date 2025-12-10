/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.iIiIIiiiIIiIi
 *  com.xy.i.IIIIIiiiIIIiI
 *  com.xy.i.IIiIiiiiIiIII
 *  com.xy.q.IIIiIiiiiIiII
 *  com.xy.q.IiIIIiiiiIIiI
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.q.iiiIIiiiIIIii
 *  com.xy.readbean.AllMapBean
 *  com.xy.readbean.MapModel
 *  com.xy.richtext.InputBean
 *  com.xy.richtext.RichLabel
 *  com.xy.text.GameView
 *  com.xy.w.IIIIIiiiIiiII
 *  com.xy.w.IIIiiiiiIiIiI
 */
package com.xy.a;

import com.xy.a.iIiIIiiiIIiIi;
import com.xy.i.IIIIIiiiIIIiI;
import com.xy.i.IIiIiiiiIiIII;
import com.xy.q.IIIiIiiiiIiII;
import com.xy.q.IiIIIiiiiIIiI;
import com.xy.q.IiiiIiiiiIiIi;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.q.iiiIIiiiIIIii;
import com.xy.readbean.AllMapBean;
import com.xy.readbean.MapModel;
import com.xy.richtext.InputBean;
import com.xy.richtext.RichLabel;
import com.xy.text.GameView;
import com.xy.w.IIIIIiiiIiiII;
import com.xy.w.IIIiiiiiIiIiI;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JLabel;
import javax.swing.JScrollPane;

public class IIIiIiiiiIIiI
extends IiiiIiiiiIiIi {
    private JScrollPane IiIiiiiiIIIII;
    private MapModel iiIiIiiiiIIIi;
    private IIIiiiiiIiIiI[] iiiiIiiiIiiII;
    private IIIiIiiiiIiII iiiIiiiiiiiIi;
    private MapModel iIiiIiiiiiiII;
    private IIiIiiiiIiIII[] IIiiIiiiIIiIi;
    private RichLabel iIiIiiiiIiIii;
    private InputBean IiIIIiiiiIiiI;
    private JLabel[] iiIiiiiiiiIii;
    private IIIiIiiiiIiII IiiiiiiiIIIII;
    private IIIIIiiiIIIiI ALLATORIxDEMO;

    public IIIiIiiiiIIiI(GameView gameJpanel) {
        super(156, 2, IiiiIiiiiIiIi.iIIIIiiiiiIIi, gameJpanel);
        this.ALLATORIxDEMO(-1, 0, 400, 250, IiiiIiiiiIiIi.iiIIIiiiiiiiI);
        this.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/1.png", (int)68, (int)68, (int)68, (int)68, (boolean)false), null);
        this.IiiiiiiiIIIII = new IIIiIiiiiIiII(2, 100, (IiiiIiiiiIiIi)this);
        this.iiiIiiiiiiiIi = new IIIiIiiiiIiII(2, 100, (IiiiIiiiiIiIi)this);
        this.IiiiiiiiIIIII.iIiIiiiiIIiii(true);
        this.iiiIiiiiiiiIi.iIiIiiiiIIiii(true);
        this.IiiiiiiiIIIII.ALLATORIxDEMO(47, 35, 115, 20);
        this.iiiIiiiiiiiIi.ALLATORIxDEMO(188, 35, 115, 20);
        this.add((Component)this.IiiiiiiiIIIII);
        this.add((Component)this.iiiIiiiiiiiIi);
        this.ALLATORIxDEMO = new IIIIIiiiIIIiI("sc/e/7.png", 1, 291, iiIIiiiiIiiII.iiiiIiiiIiiII, iiIIiiiiIiiII.IIiiiiiiIiiII, "", (IiiiIiiiiIiIi)this);
        this.ALLATORIxDEMO.setBounds(311, 33, 59, 25);
        this.ALLATORIxDEMO.setText("\u641c\u7d22");
        this.add((Component)this.ALLATORIxDEMO);
        this.iiIiiiiiiiIii = new JLabel[2];
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iiIiiiiiiiIii.length) {
            this.iiIiiiiiiiIii[IiiiiiiiIIIII] = IiIIIiiiiIIiI.ALLATORIxDEMO((int)(25 + 141 * IiiiiiiiIIIII), (int)35, (int)18, (int)20, (Color)Color.black, (Font)iiIIiiiiIiiII.iiiiIiiiIiiII);
            this.iiIiiiiiiiIii[IiiiiiiiIIIII].setText(IiiiiiiiIIIII == 0 ? "\u4ece" : (IiiiiiiiIIIII == 1 ? "\u5230" : ""));
            this.iiIiiiiiiiIii[IiiiiiiiIIIII].setHorizontalAlignment(0);
            this.add(this.iiIiiiiiiiIii[IiiiiiiiIIIII++]);
        }
        this.iIiIiiiiIiIii = new RichLabel("", iiIIiiiiIiiII.iIIIiiiiIIIii);
        this.iIiIiiiiIiIii.addMouseListener((MouseListener)new iIiIIiiiIIiIi(this));
        this.IiIiiiiiIIIII = IiIIIiiiiIIiI.ALLATORIxDEMO((int)34, (int)85, (int)336, (int)138, (Component)this.iIiIiiiiIiIii, (int)20);
        this.add(this.IiIiiiiiIIIII);
        ArrayList<Long> IiiiiiiiIIIII2 = new ArrayList<Long>();
        AllMapBean IiiiiiiiIIIII3 = this.ALLATORIxDEMO().ALLATORIxDEMO();
        for (MapModel IiiiiiiiIIIII4 : IiiiiiiiIIIII3.getAllMap().values()) {
            IiiiiiiiIIIII2.add(IiiiiiiiIIIII4.getMapId());
        }
        Collections.sort(IiiiiiiiIIIII2);
        int IiiiiiiiIIIII5 = 0;
        while (IiiiiiiiIIIII5 < IiiiiiiiIIIII2.size()) {
            MapModel IiiiiiiiIIIII6 = (MapModel)IiiiiiiiIIIII3.getAllMap().get(((Long)IiiiiiiiIIIII2.get(IiiiiiiiIIIII5)).toString());
            this.IiiiiiiiIIIII.ALLATORIxDEMO(new iiiIIiiiIIIii(IiiiiiiiIIIII6.getMapName(), (Object)IiiiiiiiIIIII6.getMapId()));
            ++IiiiiiiiIIIII5;
            this.iiiIiiiiiiiIi.ALLATORIxDEMO(new iiiIIiiiIIIii(IiiiiiiiIIIII6.getMapName(), (Object)IiiiiiiiIIIII6.getMapId()));
        }
        this.iiiiIiiiIiiII = new IIIiiiiiIiIiI[2];
        IiiiiiiiIIIII5 = 0;
        while (IiiiiiiiIIIII5 < this.iiiiIiiiIiiII.length) {
            this.iiiiIiiiIiiII[IiiiiiiiIIIII5] = new IIIiiiiiIiIiI();
            this.add((Component)this.iiiiIiiiIiiII[IiiiiiiiIIIII5]);
            if (IiiiiiiiIIIII5 == 0) {
                this.iiiiIiiiIiiII[IiiiiiiiIIIII5].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/25.png", (int)2, (int)2, (int)2, (int)2, (boolean)false));
                this.iiiiIiiiIiiII[IiiiiiiiIIIII5].setBounds(30, 65, 340, 21);
            } else if (IiiiiiiiIIIII5 == 1) {
                this.iiiiIiiiIiiII[IiiiiiiiIIIII5].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/24.png", (int)2, (int)2, (int)2, (int)2, (boolean)false));
                this.iiiiIiiiIiiII[IiiiiiiiIIIII5].setBounds(30, 65, 340, 160);
            }
            ++IiiiiiiiIIIII5;
        }
    }

    public void iiiIiiiiiiIIi() {
        if (this.iiIiIiiiiIIIi != null && this.iIiiIiiiiiiII != null && this.iiIiIiiiiIIIi != this.iIiiIiiiiiiII) {
            this.iIiIiiiiIiIii.setTextSize(this.ALLATORIxDEMO().ALLATORIxDEMO().ALLATORIxDEMO(this.iiIiIiiiiIIIi, this.iIiiIiiiiiiII, this.ALLATORIxDEMO()), 316);
            return;
        }
        this.iIiIiiiiIiIii.setTextSize("", 316);
    }

    static /* synthetic */ InputBean ALLATORIxDEMO(IIIiIiiiiIIiI arg0) {
        return arg0.IiIIIiiiiIiiI;
    }

    public void ALLATORIxDEMO(MapModel mapModel) {
        this.IiIIIiiiiIiiI = null;
        this.IiiiiiiiIIIII.ALLATORIxDEMO((Object)mapModel.getMapId());
        this.iiiIiiiiiiiIi.ALLATORIxDEMO((Object)mapModel.getMapId());
        this.ALLATORIxDEMO().iIiIiiiiIIiIi(this.iIiIiiiiIIiii());
    }

    static /* synthetic */ void ALLATORIxDEMO(IIIiIiiiiIIiI arg0, InputBean arg1) {
        arg0.IiIIIiiiiIiiI = arg1;
    }

    public void ALLATORIxDEMO(long mapId, IIIiIiiiiIiII downList) {
        MapModel IiiiiiiiIIIII = this.ALLATORIxDEMO().ALLATORIxDEMO(String.valueOf(mapId));
        if (IiiiiiiiIIIII == null) {
            return;
        }
        if (this.IiiiiiiiIIIII == downList) {
            this.iiIiIiiiiIIIi = IiiiiiiiIIIII;
        } else if (this.iiiIiiiiiiiIi == downList) {
            this.iIiiIiiiiiiII = IiiiiiiiIIIII;
        }
        this.iiiIiiiiiiIIi();
    }

    public void iIiIiiiiIIiii(int id) {
    }

    static /* synthetic */ RichLabel ALLATORIxDEMO(IIIiIiiiiIIiI arg0) {
        return arg0.iIiIiiiiIiIii;
    }
}
