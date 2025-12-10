/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.v.IiIIIiiiiIIiI
 *  com.xy.i.IiiIiiiiIIIii
 *  com.xy.q.IiIIIiiiiIIiI
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.text.GameView
 *  com.xy.v.IIiiIiiiiIIiI
 *  com.xy.v.iIiIIiiiIiiiI
 *  com.xy.v.iiiiiiiiIIIII
 *  com.xy.v.iiiiiiiiiiIiI
 *  com.xy.w.IIIIIiiiIiiII
 *  com.xy.w.IIIiiiiiIiIiI
 */
package com.xy.a.v;

import com.xy.a.v.IiIIIiiiiIIiI;
import com.xy.i.IiiIiiiiIIIii;
import com.xy.q.IiiiIiiiiIiIi;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.text.GameView;
import com.xy.v.IIiiIiiiiIIiI;
import com.xy.v.iIiIIiiiIiiiI;
import com.xy.v.iiiiiiiiIIIII;
import com.xy.v.iiiiiiiiiiIiI;
import com.xy.w.IIIIIiiiIiiII;
import com.xy.w.IIIiiiiiIiIiI;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.Vector;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.event.ListSelectionListener;
import javax.swing.plaf.ScrollBarUI;

public class IiiiIiiiiIiII
extends IiiiIiiiiIiIi {
    private Vector<Vector<Object>> IiIIIiiiiIiiI;
    private JTable iiIiiiiiiiIii;
    private JScrollPane IiiiiiiiIIIII;
    private IIIiiiiiIiIiI[] ALLATORIxDEMO;

    static /* synthetic */ JTable ALLATORIxDEMO(IiiiIiiiiIiII arg0) {
        return arg0.iiIiiiiiiiIii;
    }

    public void iiiIiiiiiiIIi() {
        JScrollBar IiiiiiiiIIIII = this.IiiiiiiiIIIII.getVerticalScrollBar();
        IiiiiiiiIIIII.setMaximum(this.iiIiiiiiiiIii.getHeight());
        IiiiiiiiIIIII.setValue(0);
    }

    public void ALLATORIxDEMO(String value, int index) {
        this.IiIIIiiiiIiiI.clear();
        if (!IIiiIiiiiIIiI.iIiIiiiiIIiIi((String)value) && index < value.length()) {
            int IiiiiiiiIIIII = 0;
            int IiiiiiiiIIIII2 = 0;
            while (IiiiiiiiIIIII2 < value.length()) {
                IiiiiiiiIIIII2 = value.indexOf("^", index + 1);
                if (IiiiiiiiIIIII2 == -1) {
                    IiiiiiiiIIIII2 = value.length();
                }
                this.ALLATORIxDEMO(value, index, IiiiiiiiIIIII2);
                ++IiiiiiiiIIIII;
                index = IiiiiiiiIIIII2 + 1;
            }
        }
        this.iiiIiiiiiiIIi();
        this.ALLATORIxDEMO().iIiIiiiiIIiIi(this.iIiIiiiiIIiii());
    }

    public IiiiIiiiiIiII(GameView gameView) {
        super(169, 2, IiiiIiiiiIiIi.iIIIIiiiiiIIi, gameView);
        this.ALLATORIxDEMO(-1, 0, 340, 150, IiiiIiiiiIiIi.iIIiIiiiiiiIi);
        this.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/125.png", (int)11, (int)11, (int)13, (int)14, (boolean)false), null);
        this.iIiIiiiiIIiii(false);
        this.ALLATORIxDEMO(new iiiiiiiiIIIII(0, 12, 0, 0));
        this.IiIiiiiiIIIII = new IiiIiiiiIIIii("sc/e/160.png", 1, this.iIiIiiiiIIiii(), (IiiiIiiiiIiIi)this);
        this.IiIiiiiiIIIII.setBounds(319, 0, 21, 21);
        this.add((Component)this.IiIiiiiiIIIII);
        Vector<String> IiiiiiiiIIIII = new Vector<String>();
        IiiiiiiiIIIII.addElement("\u540d\u79f0");
        IiiiiiiiIIIII.addElement("\u5956\u54c1");
        IiiiiiiiIIIII.addElement("\u65f6\u95f4");
        this.IiIIIiiiiIiiI = new Vector();
        this.iiIiiiiiiiIii = com.xy.q.IiIIIiiiiIIiI.ALLATORIxDEMO(this.IiIIIiiiiIiiI, IiiiiiiiIIIII, (Font)iiIIiiiiIiiII.iIIiiiiiiIIII, (Color)iiIIiiiiIiiII.ALLATORIxDEMO((String)"#c6E3D2C"), (int[])new int[]{100, 80, 140});
        this.iiIiiiiiiiIii.getSelectionModel().addListSelectionListener((ListSelectionListener)new IiIIIiiiiIIiI(this));
        this.IiiiiiiiIIIII = com.xy.q.IiIIIiiiiIIiI.ALLATORIxDEMO((int)0, (int)1, (int)337, (int)145, (Component)this.iiIiiiiiiiIii, (int)20);
        this.IiiiiiiiIIIII.getVerticalScrollBar().setUI((ScrollBarUI)new iiiiiiiiiiIiI(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/106.png", (int)3, (int)3, (int)3, (int)3, (boolean)false), 8));
        this.add(this.IiiiiiiiIIIII);
        this.IiiiiiiiIIIII.addMouseListener((MouseListener)((Object)this));
        this.IiiiiiiiIIIII.addMouseMotionListener((MouseMotionListener)((Object)this));
        this.iiIiiiiiiiIii.getTableHeader().addMouseListener((MouseListener)((Object)this));
        this.iiIiiiiiiiIii.getTableHeader().addMouseMotionListener((MouseMotionListener)((Object)this));
        this.ALLATORIxDEMO = new IIIiiiiiIiIiI[6];
        int IiiiiiiiIIIII2 = 0;
        while (IiiiiiiiIIIII2 < this.ALLATORIxDEMO.length) {
            this.ALLATORIxDEMO[IiiiiiiiIIIII2] = new IIIiiiiiIiIiI();
            if (IiiiiiiiIIIII2 == 0) {
                this.ALLATORIxDEMO[IiiiiiiiIIIII2].iIiIiiiiIIiii("sc/d/105.png");
                this.ALLATORIxDEMO[IiiiiiiiIIIII2].setBounds(330, 24, 6, 120);
            } else if (IiiiiiiiIIIII2 == 1) {
                this.ALLATORIxDEMO[IiiiiiiiIIIII2].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/94.png", (int)5, (int)3, (int)5, (int)8, (boolean)false));
                this.ALLATORIxDEMO[IiiiiiiiIIIII2].setBounds(-2, 0, 344, 24);
            } else if (IiiiiiiiIIIII2 >= 2 && IiiiiiiiIIIII2 <= 5) {
                this.ALLATORIxDEMO[IiiiiiiiIIIII2].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/125.png", (int)11, (int)11, (int)13, (int)14, (boolean)false));
                this.ALLATORIxDEMO[IiiiiiiiIIIII2].setBounds(0, 0, 340, 150);
            }
            this.add((Component)this.ALLATORIxDEMO[IiiiiiiiIIIII2++]);
        }
    }

    public void ALLATORIxDEMO(String value, int index, int valueEnd) {
        String IiiiiiiiIIIII = null;
        String IiiiiiiiIIIII2 = null;
        long IiiiiiiiIIIII3 = 0L;
        int IiiiiiiiIIIII4 = 0;
        int IiiiiiiiIIIII5 = 0;
        while (IiiiiiiiIIIII5 < valueEnd) {
            IiiiiiiiIIIII5 = value.indexOf("#", index + 1);
            if (IiiiiiiiIIIII5 == -1 || IiiiiiiiIIIII5 > valueEnd) {
                IiiiiiiiIIIII5 = valueEnd;
            }
            if (IiiiiiiiIIIII4 == 1) {
                IiiiiiiiIIIII = value.substring(index, IiiiiiiiIIIII5);
            } else if (IiiiiiiiIIIII4 == 3) {
                IiiiiiiiIIIII2 = value.substring(index, IiiiiiiiIIIII5);
            } else if (IiiiiiiiIIIII4 == 4) {
                IiiiiiiiIIIII3 = IIiiIiiiiIIiI.ALLATORIxDEMO((String)value, (int)index, (int)IiiiiiiiIIIII5) * 1000L;
            }
            ++IiiiiiiiIIIII4;
            index = IiiiiiiiIIIII5 + 1;
        }
        Vector<String> IiiiiiiiIIIII22 = new Vector<String>();
        IiiiiiiiIIIII22.add(IiiiiiiiIIIII);
        IiiiiiiiIIIII22.add(IiiiiiiiIIIII2);
        IiiiiiiiIIIII22.add(iIiIIiiiIiiiI.iIiIiiiiIIiii((long)IiiiiiiiIIIII3));
        this.IiIIIiiiiIiiI.addElement(IiiiiiiiIIIII22);
    }
}
