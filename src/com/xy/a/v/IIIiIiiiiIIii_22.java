/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.i.iIiIIiiiIIiIi
 *  com.xy.a.v.IIiiiiiiIIIii
 *  com.xy.a.v.IiiIiiiiIiIIi
 *  com.xy.i.IIiiIiiiiIIiI
 *  com.xy.q.IIIiiiiiIiIiI
 *  com.xy.q.IiIIIiiiiIIiI
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.readbean.ActivityFC
 *  com.xy.readbean.ActivityFCBase
 *  com.xy.readbean.ActivityFCBuy
 *  com.xy.v.iiIiIiiiiIiii
 *  com.xy.w.IIiIiiiiIiiIi
 */
package com.xy.a.v;

import com.xy.a.i.iIiIIiiiIIiIi;
import com.xy.a.v.IIiiiiiiIIIii;
import com.xy.a.v.IiiIiiiiIiIIi;
import com.xy.i.IIiiIiiiiIIiI;
import com.xy.q.IIIiiiiiIiIiI;
import com.xy.q.IiIIIiiiiIIiI;
import com.xy.q.IiiiIiiiiIiIi;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.readbean.ActivityFC;
import com.xy.readbean.ActivityFCBase;
import com.xy.readbean.ActivityFCBuy;
import com.xy.v.iiIiIiiiiIiii;
import com.xy.w.IIiIiiiiIiiIi;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.math.BigDecimal;
import javax.swing.JLabel;

/*
 * Exception performing whole class analysis ignored.
 */
static class IIIiIiiiiIIii
extends IIiiIiiiiIIiI {
    private ActivityFC iIiIiiiiIiIii;
    private JLabel IiIIIiiiiIiiI;
    private JLabel iiIiiiiiiiIii;
    final /* synthetic */ IiiIiiiiIiIIi IiiiiiiiIIIII;
    private IIIiiiiiIiIiI ALLATORIxDEMO;

    public void ALLATORIxDEMO(ActivityFC activityFC) {
        iiIiIiiiiIiii IiiiiiiiIIIII;
        this.iIiIiiiiIiIii = activityFC;
        if (activityFC == null) {
            this.ALLATORIxDEMO.iiiIiiiiiiIIi();
            this.setVisible(false);
            return;
        }
        String IiiiiiiiIIIII2 = null;
        ActivityFCBuy activityFCBuy = (ActivityFCBuy)activityFC.getData();
        ActivityFCBase IiiiiiiiIIIII3 = activityFCBuy.getGains()[0];
        ActivityFCBase IiiiiiiiIIIII4 = activityFCBuy.getUses()[0];
        if (IiiiiiiiIIIII3.getType() == 1) {
            IiiiiiiiIIIII = IiiIiiiiIiIIi.ALLATORIxDEMO((IiiIiiiiIiIIi)this.IiiiiiiiIIIII).getPointKey(IiiiiiiiIIIII3.getId());
            this.iiIiiiiiiiIii.setText(String.valueOf(IiiiiiiiIIIII3.getNum()) + (IiiiiiiiIIIII != null ? IiiiiiiiIIIII.IiiiiiiiIIIII : "\u672a\u77e5\u79ef\u5206"));
            this.ALLATORIxDEMO.ALLATORIxDEMO(22, (Object)this.iiIiiiiiiiIii.getText());
            this.ALLATORIxDEMO.ALLATORIxDEMO(IIiIiiiiIiiIi.iiiiiiiiIIiii((String)"903"));
        } else if (IiiiiiiiIIIII3.getType() == 2) {
            IiiiiiiiIIIII = this.form.ALLATORIxDEMO().ALLATORIxDEMO(new BigDecimal(IiiiiiiiIIIII3.getId()));
            this.iiIiiiiiiiIii.setText(IiiiiiiiIIIII != null ? IiiiiiiiIIIII.getGoodsname() : "");
            this.ALLATORIxDEMO.ALLATORIxDEMO(IiiiiiiiIIIII != null ? 1 : 0, (Object)IiiiiiiiIIIII);
        } else if (IiiiiiiiIIIII3.getType() == 3) {
            this.iiIiiiiiiiIii.setText("\u968f\u673a\u5956\u52b1");
            this.ALLATORIxDEMO.ALLATORIxDEMO(22, (Object)this.iiIiiiiiiiIii.getText());
            this.ALLATORIxDEMO.ALLATORIxDEMO(IIiIiiiiIiiIi.iiiiiiiiIIiii((String)"903"));
        } else if (IiiiiiiiIIIII3.getType() == 4) {
            this.iiIiiiiiiiIii.setText(String.valueOf(IiiiiiiiIIIII3.getNum()) + IiiiiiiiIIIII3.getKey());
            this.ALLATORIxDEMO.ALLATORIxDEMO(22, (Object)this.iiIiiiiiiiIii.getText());
            this.ALLATORIxDEMO.ALLATORIxDEMO(IIiIiiiiIiiIi.iiiiiiiiIIiii((String)"903"));
        } else {
            this.iiIiiiiiiiIii.setText("");
            this.ALLATORIxDEMO.iiiIiiiiiiIIi();
        }
        if (IiiiiiiiIIIII4.getType() == 1) {
            IiiiiiiiIIIII = IiiIiiiiIiIIi.ALLATORIxDEMO((IiiIiiiiIiIIi)this.IiiiiiiiIIIII).getPointKey(IiiiiiiiIIIII4.getId());
            IiiiiiiiIIIII2 = IiiiiiiiIIIII != null ? IiiiiiiiIIIII.IiiiiiiiIIIII : "\u672a\u77e5\u79ef\u5206";
        } else if (IiiiiiiiIIIII4.getType() == 4) {
            IiiiiiiiIIIII2 = IiiiiiiiIIIII4.getKey();
        }
        iiIIiiiiIiiII.ALLATORIxDEMO((JLabel)this.IiIIIiiiiIiiI, (long)IiiiiiiiIIIII4.getNum());
        this.IiIIIiiiiIiiI.setText(String.valueOf(this.IiIIIiiiiIiiI.getText()) + (IiiiiiiiIIIII2 != null ? IiiiiiiiIIIII2 : ""));
        this.IiIIIiiiiIiiI.setForeground(Color.red);
        this.setVisible(true);
    }

    public void ALLATORIxDEMO(MouseEvent e, boolean isChoice) {
    }

    public void ALLATORIxDEMO(MouseEvent e) {
        if (this.iIiIiiiiIiIii == null) {
            return;
        }
        ((iIiIIiiiIIiIi)this.form.ALLATORIxDEMO().iiiIiiiiiiIIi(144)).ALLATORIxDEMO(IiiIiiiiIiIIi.ALLATORIxDEMO((IiiIiiiiIiIIi)this.IiiiiiiiIIIII), this.iIiIiiiiIiIii);
    }

    public IIIiIiiiiIIii(IiiIiiiiIiIIi iiiIiiiiIiIIi, String path, int type, IiiiIiiiiIiIi form) {
        this.IiiiiiiiIIIII = iiiIiiiiIiIIi;
        super(path, type, null, form);
        this.iiIiiiiiiiIii = IiIIIiiiiIIiI.ALLATORIxDEMO((int)8, (int)15, (int)92, (int)18, (Color)Color.black, (Font)iiIIiiiiIiiII.iIiIIiiiiIIiI);
        this.IiIIIiiiiIiiI = IiIIIiiiiIIiI.ALLATORIxDEMO((int)8, (int)36, (int)92, (int)18, (Color)Color.red, (Font)iiIIiiiiIiiII.iIiIIiiiiIIiI);
        this.IiIIIiiiiIiiI.setHorizontalAlignment(4);
        this.ALLATORIxDEMO = new IIiiiiiiIIIii(this, form);
        this.ALLATORIxDEMO.setBounds(101, 3, 58, 58);
        this.add((Component)this.ALLATORIxDEMO);
        this.add(this.iiIiiiiiiiIii);
        this.add(this.IiIIIiiiiIiiI);
    }
}
