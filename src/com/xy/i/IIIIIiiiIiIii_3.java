/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.i.IIiiIiiiiIIiI
 *  com.xy.i.IiiIiiiiIIIii
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.readbean.Activity
 *  com.xy.socket.Agreement
 *  com.xy.text.GameView
 */
package com.xy.i;

import com.xy.i.IIiiIiiiiIIiI;
import com.xy.i.IiiIiiiiIIIii;
import com.xy.q.IiiiIiiiiIiIi;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.readbean.Activity;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;

public class IIIIIiiiIiIii
extends IIiiIiiiiIIiI {
    private int IiiiiiiiIIIII;
    private int ALLATORIxDEMO;

    public void ALLATORIxDEMO(MouseEvent e, boolean isChoice) {
    }

    public void iIiIiiiiIIiii(int vicon) {
        this.IiiiiiiiIIIII = vicon;
    }

    public IIIIIiiiIiIii(String path, int type, int id, IiiiIiiiiIiIi form) {
        super(path, type, form);
        this.ALLATORIxDEMO = id;
    }

    public int iIiIiiiiIIiii() {
        return this.ALLATORIxDEMO;
    }

    public IIIIIiiiIiIii(String path, int type, int id, Font font, Color[] colors, String text, IiiiIiiiiIiIi form) {
        super(path, type, colors, form);
        this.ALLATORIxDEMO = id;
        if (font != null) {
            this.setFont(font);
        } else {
            this.setFont(iiIIiiiiIiiII.iiIiiiiiiIIiI);
        }
        this.setHorizontalAlignment(0);
        this.setText(text);
    }

    public void ALLATORIxDEMO(MouseEvent e) {
        if (this.IiiiiiiiIIIII != 0) {
            if (this.IiiiiiiiIIIII == 3) {
                IiiIiiiiIIIii.ALLATORIxDEMO((int)142, (GameView)this.form.iiIIiiiiIiIIi);
                return;
            }
            if (this.IiiiiiiiIIIII == 5) {
                IiiIiiiiIIIii.ALLATORIxDEMO((int)167, (GameView)this.form.iiIIiiiiIiIIi, (Object)new Integer(1));
                return;
            }
            if (this.IiiiiiiiIIIII > 100 && this.IiiiiiiiIIIII < 200) {
                Activity IiiiiiiiIIIII = this.form.ALLATORIxDEMO().ALLATORIxDEMO(this.IiiiiiiiIIIII);
                if (IiiiiiiiIIIII == null) {
                    return;
                }
                if (IiiiiiiiIIIII.getModelId() == 1) {
                    IiiIiiiiIIIii.ALLATORIxDEMO((int)168, (GameView)this.form.iiIIiiiiIiIIi, (Object)IiiiiiiiIIIII);
                    return;
                }
                if (IiiiiiiiIIIII.getModelId() == 2) {
                    IiiIiiiiIIIii.ALLATORIxDEMO((int)167, (GameView)this.form.iiIIiiiiIiIIi, (Object)IiiiiiiiIIIII);
                    return;
                }
                if (IiiiiiiiIIIII.getModelId() != 3) return;
                IiiIiiiiIIIii.ALLATORIxDEMO((int)176, (GameView)this.form.iiIIiiiiIiIIi, (Object)IiiiiiiiIIIII);
                return;
            }
            String IiiiiiiiIIIII = Agreement.getSendTextAES((String)"vicon", (String)String.valueOf(this.IiiiiiiiIIIII));
            this.form.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII);
            return;
        }
        if (this.ALLATORIxDEMO == 50) {
            if (this.form.ALLATORIxDEMO().gameType == 2) {
                IiiIiiiiIIIii.ALLATORIxDEMO((int)103, (GameView)this.form.iiIIiiiiIiIIi);
                return;
            }
            IiiIiiiiIIIii.ALLATORIxDEMO((int)129, (GameView)this.form.iiIIiiiiIiIIi);
            return;
        }
        if (this.ALLATORIxDEMO == 52) {
            String IiiiiiiiIIIII = Agreement.getSendTextAES((String)"Paydaygradepay", null);
            this.form.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII);
            return;
        }
        if (this.ALLATORIxDEMO == 56) {
            IiiIiiiiIIIii.ALLATORIxDEMO((int)120, (GameView)this.form.iiIIiiiiIiIIi);
            return;
        }
        if (this.ALLATORIxDEMO == 57) {
            String IiiiiiiiIIIII = Agreement.getSendTextAES((String)"getfivemsg", (String)"VV2001");
            this.form.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII);
            return;
        }
        if (this.ALLATORIxDEMO == 68) {
            IiiIiiiiIIIii.ALLATORIxDEMO((int)68, (GameView)this.form.iiIIiiiiIiIIi);
            return;
        }
        if (this.ALLATORIxDEMO != 150) return;
        IiiIiiiiIIIii.ALLATORIxDEMO((int)150, (GameView)this.form.iiIIiiiiIiIIi);
    }

    public void ALLATORIxDEMO(int id) {
        this.ALLATORIxDEMO = id;
    }

    public int ALLATORIxDEMO() {
        return this.IiiiiiiiIIIII;
    }

    public IIIIIiiiIiIii(String path, int type, int btn, String text, IiiiIiiiiIiIi form) {
        this(path, type, btn, null, null, text, form);
    }
}
