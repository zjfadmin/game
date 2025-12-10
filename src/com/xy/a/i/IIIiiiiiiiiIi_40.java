/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.i.IIiIIiiiIIIiI
 *  com.xy.a.i.iiIiiiiiIIiii
 *  com.xy.q.IiIIIiiiiIIiI
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.readbean.StarSoul
 *  com.xy.v.IIiiIiiiiIIiI
 *  com.xy.v.IiiiiiiiiIIII
 *  com.xy.w.IIIIIiiiIiiII
 */
package com.xy.a.i;

import com.xy.a.i.IIiIIiiiIIIiI;
import com.xy.a.i.iiIiiiiiIIiii;
import com.xy.q.IiIIIiiiiIIiI;
import com.xy.q.IiiiIiiiiIiIi;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.readbean.StarSoul;
import com.xy.v.IIiiIiiiiIIiI;
import com.xy.v.IiiiiiiiiIIII;
import com.xy.w.IIIIIiiiIiiII;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JComponent;
import javax.swing.JLabel;

public class IIIiiiiiiiiIi
extends JComponent
implements MouseListener {
    public static Image iiiIiiiiiiiIi;
    private JLabel iIiiIiiiiiiII;
    private Image IIiiIiiiIIiIi;
    private int iIiIiiiiIiIii;
    private IiiiIiiiiIiIi IiIIIiiiiIiiI;
    private JLabel iiIiiiiiiiIii;
    public static Image IiiiiiiiIIIII;
    private Image ALLATORIxDEMO;

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    public void ALLATORIxDEMO(int id, IiiiiiiiiIIII objectArea) {
        this.iIiIiiiiIiIii = id;
        if (id == 0) {
            this.iIiiIiiiiiiII.setText("");
            this.ALLATORIxDEMO(0L);
            this.ALLATORIxDEMO = null;
            return;
        }
        StarSoul IiiiiiiiIIIII = objectArea.ALLATORIxDEMO(id);
        StringBuffer IiiiiiiiIIIII2 = new StringBuffer();
        IiiiiiiiIIIII2.append("<html>");
        int IiiiiiiiIIIII3 = 0;
        while (IiiiiiiiIIIII3 < IiiiiiiiIIIII.getName().length()) {
            if (IiiiiiiiIIIII3 != 0) {
                IiiiiiiiIIIII2.append("<br/>");
            }
            IiiiiiiiIIIII2.append(IiiiiiiiIIIII.getName().charAt(IiiiiiiiIIIII3++));
        }
        IiiiiiiiIIIII2.append("</div></html>");
        this.iIiiIiiiiiiII.setText(IiiiiiiiIIIII2.toString());
    }

    @Override
    public void mousePressed(MouseEvent e) {
        if (this.IiIIIiiiiIiiI instanceof IIiIIiiiIIIiI) {
            IIiIIiiiIIIiI IiiiiiiiIIIII = (IIiIIiiiIIIiI)this.IiIIIiiiiIiiI;
            IiiiiiiiIIIII.ALLATORIxDEMO(this, e);
            return;
        }
        if (!(this.IiIIIiiiiIiiI instanceof iiIiiiiiIIiii)) return;
        iiIiiiiiIIiii IiiiiiiiIIIII = (iiIiiiiiIIiii)this.IiIIIiiiiIiiI;
        IiiiiiiiIIIII.ALLATORIxDEMO(this, e);
    }

    public IIIiiiiiiiiIi(int id, Image back, boolean num, IiiiiiiiiIIII objectArea, IiiiIiiiiIiIi form) {
        this.IiIIIiiiiIiiI = form;
        this.IIiiIiiiIIiIi = back;
        if (num) {
            this.iiIiiiiiiiIii = IiIIIiiiiIIiI.ALLATORIxDEMO((int)4, (int)4, (int)32, (int)16, (Color)Color.white, (Font)iiIIiiiiIiiII.iiIiiiiiiIIiI);
            this.add(this.iiIiiiiiiiIii);
        }
        this.iIiiIiiiiiiII = IiIIIiiiiIIiI.ALLATORIxDEMO((int)0, (int)0, (int)0, (int)0, (Color)Color.black, (Font)iiIIiiiiIiiII.iiiiIiiiIiiII);
        this.iIiiIiiiiiiII.setHorizontalAlignment(0);
        this.add(this.iIiiIiiiiiiII);
        this.addMouseListener(this);
        this.ALLATORIxDEMO(id, objectArea);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (this.IIiiIiiiIIiIi != null) {
            g.drawImage(this.IIiiIiiiIIiIi, 0, 0, this.getWidth(), this.getHeight(), null);
        }
        g.drawImage(this.ALLATORIxDEMO, 1, 1, this.getWidth() - 2, this.getHeight() - 2, null);
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void setBounds(int n, int n2, int n3, int n4) {
        void y;
        void x;
        void height;
        void width;
        this.iIiiIiiiiiiII.setBounds(0, 0, (int)width, (int)height);
        super.setBounds((int)x, (int)y, (int)width, (int)height);
    }

    public int iIiIiiiiIIiii() {
        return this.iIiIiiiiIiIii;
    }

    static {
        IiiiiiiiIIIII = IIIIIiiiIiiII.iiiIiiiiiiIIi((String)"sc/bang/XPSoul1.png");
        iiiIiiiiiiiIi = IIIIIiiiIiiII.iiiIiiiiiiIIi((String)"sc/bang/XPSoul2.png");
    }

    public void ALLATORIxDEMO(long value) {
        if (this.iiIiiiiiiiIii != null) {
            this.iiIiiiiiiiIii.setText(value > 0L ? String.valueOf(value) : null);
        }
        this.ALLATORIxDEMO = value > 0L ? IiiiiiiiIIIII : iiiIiiiiiiiIi;
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    public int ALLATORIxDEMO() {
        if (this.iiIiiiiiiiIii == null) return 0;
        if (!IIiiIiiiiIIiI.iIiIiiiiIIiIi((String)this.iiIiiiiiiiIii.getText())) return Integer.parseInt(this.iiIiiiiiiiIii.getText());
        return 0;
    }
}
