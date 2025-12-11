/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.v.BWDHJpanel6
 *  com.xy.q.IiIIIiiiiIIiI
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.readbean.Activity
 *  com.xy.socket.Agreement
 *  com.xy.v.IIiiIiiiiIIiI
 *  com.xy.v.iIiIIiiiIiiiI
 *  com.xy.w.IIIiiiiiIiIiI
 */
package com.xy.a.v;

import com.xy.a.v.BWDHJpanel6;
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
static class BWDHButton4
extends IIIiiiiiIiIiI
implements MouseListener {
    private boolean iIiIiiiiIiIii;
    private JLabel IiIIIiiiiIiiI;
    private JLabel iiIiiiiiiiIii;
    private int IiiiiiiiIIIII;
    final /* synthetic */ BWDHJpanel6 ALLATORIxDEMO;

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

    static /* synthetic */ boolean ALLATORIxDEMO(BWDHButton4 arg0) {
        return arg0.iIiIiiiiIiIii;
    }

    public BWDHButton4(BWDHJpanel6 iiIiIiiiiiIIi2, int index) {
        this.ALLATORIxDEMO = iiIiIiiiiiIIi2;
        this.IiiiiiiiIIIII = index;
        this.iiIiiiiiiiIii = IiIIIiiiiIIiI.ALLATORIxDEMO((int)40, (int)3, (int)93, (int)20, (Color)iiIIiiiiIiiII.ALLATORIxDEMO((String)"#c462803"), (Font)iiIIiiiiIiiII.iiiiIiiiIiiII);
        this.IiIIIiiiiIiiI = IiIIIiiiiIIiI.ALLATORIxDEMO((int)40, (int)17, (int)93, (int)20, (Color)iiIIiiiiIiiII.ALLATORIxDEMO((String)"#c462803"), (Font)iiIIiiiiIiiII.iiIiiiiiiIIiI);
        this.iiIiiiiiiiIii.setHorizontalAlignment(0);
        this.IiIIIiiiiIiiI.setHorizontalAlignment(0);
        this.iiIiiiiiiiIii.setText(index == 0 ? "积分赛" : (index == 1 ? "入围赛" : (index == 2 ? "半决赛" : "总决赛")));
        this.add(this.iiIiiiiiiiIii);
        this.add(this.IiIIIiiiiIiiI);
        this.addMouseListener(this);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    public boolean ALLATORIxDEMO(boolean select) {
        if (select == this.iIiIiiiiIiIii) {
            return false;
        }
        this.iIiIiiiiIiIii = select;
        if (select) {
            this.iiIiiiiiiiIii.setForeground(Color.white);
            this.IiIIIiiiiIiiI.setForeground(Color.white);
            this.iiIiiiiiiiIii.setBounds(0, 4, 142, 20);
            this.IiIIIiiiiIiiI.setBounds(0, 18, 142, 20);
        } else {
            this.iiIiiiiiiiIii.setForeground(iiIIiiiiIiiII.ALLATORIxDEMO((String)"#c462803"));
            this.IiIIIiiiiIiiI.setForeground(iiIIiiiiIiiII.ALLATORIxDEMO((String)"#c462803"));
            this.iiIiiiiiiiIii.setBounds(40, 3, 93, 20);
            this.IiIIIiiiiIiiI.setBounds(40, 17, 93, 20);
        }
        return true;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (iIiIIiiiIiiiI.ALLATORIxDEMO()) {
            return;
        }
        Activity IiiiiiiiIIIII = BWDHJpanel6.ALLATORIxDEMO((BWDHJpanel6)this.ALLATORIxDEMO).ALLATORIxDEMO();
        String IiiiiiiiIIIII2 = Agreement.getSendTextAES((String)"activity", (String)(String.valueOf(IiiiiiiiIIIII.getId()) + "|R" + (this.IiiiiiiiIIIII + 2)));
        this.ALLATORIxDEMO.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII2);
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

    public void iiiIiiiiiiIIi(String text) {
        if (IIiiIiiiiIIiI.ALLATORIxDEMO((String)text, (String)this.IiIIIiiiiIiiI.getText())) {
            return;
        }
        this.IiIIIiiiiIiiI.setText(text);
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }
}
