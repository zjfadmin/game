/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.v.iiIiIiiiiIiIi
 *  com.xy.q.IiIIIiiiiIIiI
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.readbean.Activity
 *  com.xy.socket.Agreement
 *  com.xy.v.IIiiIiiiiIIiI
 *  com.xy.v.iIiIIiiiIiiiI
 *  com.xy.w.IIIiiiiiIiIiI
 */
package com.xy.a.v;

import com.xy.a.v.iiIiIiiiiIiIi;
import com.xy.q.IiIIIiiiiIIiI;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.readbean.Activity;
import com.xy.socket.Agreement;
import com.xy.v.IIiiIiiiiIIiI;
import com.xy.v.iIiIIiiiIiiiI;
import com.xy.w.IIIiiiiiIiIiI;
import java.awt.Color;
import java.awt.Font;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JLabel;

/*
 * Exception performing whole class analysis ignored.
 */
static class IiIIIiiiIIiII
extends IIIiiiiiIiIiI
implements MouseListener {
    final /* synthetic */ iiIiIiiiiIiIi iIiIiiiiIiIii;
    private int IiIIIiiiiIiiI;
    private JLabel iiIiiiiiiiIii;
    private JLabel IiiiiiiiIIIII;
    private boolean ALLATORIxDEMO;

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    static /* synthetic */ boolean ALLATORIxDEMO(IiIIIiiiIIiII arg0) {
        return arg0.ALLATORIxDEMO;
    }

    public boolean ALLATORIxDEMO(boolean select) {
        if (select == this.ALLATORIxDEMO) {
            return false;
        }
        this.ALLATORIxDEMO = select;
        if (select) {
            this.IiiiiiiiIIIII.setForeground(Color.white);
            this.iiIiiiiiiiIii.setForeground(Color.white);
            this.IiiiiiiiIIIII.setBounds(0, 4, 142, 20);
            this.iiIiiiiiiiIii.setBounds(0, 18, 142, 20);
        } else {
            this.IiiiiiiiIIIII.setForeground(iiIIiiiiIiiII.ALLATORIxDEMO((String)"#c462803"));
            this.iiIiiiiiiiIii.setForeground(iiIIiiiiIiiII.ALLATORIxDEMO((String)"#c462803"));
            this.IiiiiiiiIIIII.setBounds(40, 3, 93, 20);
            this.iiIiiiiiiiIii.setBounds(40, 17, 93, 20);
        }
        return true;
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    public void iiiIiiiiiiIIi(String text) {
        if (IIiiIiiiiIIiI.ALLATORIxDEMO((String)text, (String)this.iiIiiiiiiiIii.getText())) {
            return;
        }
        this.iiIiiiiiiiIii.setText(text);
    }

    /*
     * WARNING - void declaration
     */
    public void ALLATORIxDEMO(Point[] times, Activity activity) {
        void IiiiiiiiIIIII;
        if (times == null) {
            this.iiiIiiiiiiIIi("00.00-00.00");
            return;
        }
        long IiiiiiiiIIIII2 = activity.getTimeOpen() + (long)times[0].x * 1000L;
        long l = activity.getTimeOpen() + (long)times[times.length - 1].y * 1000L;
        this.iiiIiiiiiiIIi(String.valueOf(iIiIIiiiIiiiI.ALLATORIxDEMO((long)IiiiiiiiIIIII2, (String)"MM.dd")) + "-" + iIiIIiiiIiiiI.ALLATORIxDEMO((long)IiiiiiiiIIIII, (String)"MM.dd"));
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (iIiIIiiiIiiiI.ALLATORIxDEMO()) {
            return;
        }
        Activity IiiiiiiiIIIII = iiIiIiiiiIiIi.ALLATORIxDEMO((iiIiIiiiiIiIi)this.iIiIiiiiIiIii).ALLATORIxDEMO();
        String IiiiiiiiIIIII2 = Agreement.getSendTextAES((String)"activity", (String)(String.valueOf(IiiiiiiiIIIII.getId()) + "|M" + (this.IiIIIiiiiIiiI + 2)));
        this.iIiIiiiiIiIii.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII2);
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    public IiIIIiiiIIiII(iiIiIiiiiIiIi iiIiIiiiiIiIi2, int index) {
        this.iIiIiiiiIiIii = iiIiIiiiiIiIi2;
        this.IiIIIiiiiIiiI = index;
        this.IiiiiiiiIIIII = IiIIIiiiiIIiI.ALLATORIxDEMO((int)40, (int)3, (int)93, (int)20, (Color)iiIIiiiiIiiII.ALLATORIxDEMO((String)"#c462803"), (Font)iiIIiiiiIiiII.iiiiIiiiIiiII);
        this.iiIiiiiiiiIii = IiIIIiiiiIIiI.ALLATORIxDEMO((int)40, (int)17, (int)93, (int)20, (Color)iiIIiiiiIiiII.ALLATORIxDEMO((String)"#c462803"), (Font)iiIIiiiiIiiII.iiIiiiiiiIIiI);
        this.IiiiiiiiIIIII.setHorizontalAlignment(0);
        this.iiIiiiiiiiIii.setHorizontalAlignment(0);
        this.IiiiiiiiIIIII.setText(index == 0 ? "\u79ef\u5206\u8d5b" : (index == 1 ? "\u5165\u56f4\u8d5b" : (index == 2 ? "\u534a\u51b3\u8d5b" : "\u603b\u51b3\u8d5b")));
        this.add(this.IiiiiiiiIIIII);
        this.add(this.iiIiiiiiiiIii);
        this.addMouseListener(this);
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }
}
