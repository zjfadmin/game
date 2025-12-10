/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.iIiIIiiiIiiiI
 *  com.xy.a.iiiiiiiiiiIiI
 *  com.xy.bean.TeamBean
 *  com.xy.entity.TeamRole
 *  com.xy.i.IIiiIiiiiIIiI
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.socket.Agreement
 */
package com.xy.i;

import com.xy.a.iIiIIiiiIiiiI;
import com.xy.a.iiiiiiiiiiIiI;
import com.xy.bean.TeamBean;
import com.xy.entity.TeamRole;
import com.xy.i.IIiiIiiiiIIiI;
import com.xy.q.IiiiIiiiiIiIi;
import com.xy.socket.Agreement;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;

public class iiIIiiiiIiiII
extends IIiiIiiiiIIiI {
    private int ALLATORIxDEMO;

    public void ALLATORIxDEMO(int id) {
        this.ALLATORIxDEMO = id;
    }

    public iiIIiiiiIiiII(String path, int type, int id, Font font, Color[] colors, String text, IiiiIiiiiIiIi form) {
        super(path, type, colors, form);
        this.ALLATORIxDEMO = id;
        if (font != null) {
            this.setFont(font);
        } else {
            this.setFont(com.xy.q.iiIIiiiiIiiII.iiIiiiiiiIIiI);
        }
        this.setHorizontalAlignment(0);
        this.setText(text);
    }

    public iiIIiiiiIiiII(String path, int type, int id, IiiiIiiiiIiIi form) {
        super(path, type, form);
        this.ALLATORIxDEMO = id;
    }

    public void ALLATORIxDEMO(MouseEvent e) {
        System.out.println(this.ALLATORIxDEMO);
        if (this.ALLATORIxDEMO >= 1 && this.ALLATORIxDEMO <= 6) {
            iIiIIiiiIiiiI IiiiiiiiIIIII = (iIiIIiiiIiiiI)this.form;
            IiiiiiiiIIIII.iIiIiiiiIIiii(this.ALLATORIxDEMO);
            return;
        }
        if (this.ALLATORIxDEMO == 7) {
            String IiiiiiiiIIIII = Agreement.getSendTextAES((String)"team4", (String)"L");
            this.form.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII);
            return;
        }
        if (this.ALLATORIxDEMO == 8) {
            String IiiiiiiiIIIII = Agreement.getSendTextAES((String)"team4", (String)"R");
            this.form.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII);
            return;
        }
        if (this.ALLATORIxDEMO >= 9 && this.ALLATORIxDEMO <= 12) {
            int IiiiiiiiIIIII = this.ALLATORIxDEMO - 8;
            TeamBean IiiiiiiiIIIII2 = this.form.ALLATORIxDEMO().teamBean;
            if (IiiiiiiiIIIII2 == null) return;
            if (IiiiiiiiIIIII >= IiiiiiiiIIIII2.getTeams().size()) {
                return;
            }
            TeamRole IiiiiiiiIIIII3 = (TeamRole)IiiiiiiiIIIII2.getTeams().get(IiiiiiiiIIIII);
            String IiiiiiiiIIIII4 = Agreement.getSendTextAES((String)"team4", (String)("C" + IiiiiiiiIIIII3.getRoleId()));
            this.form.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII4);
            return;
        }
        if (this.ALLATORIxDEMO != 13 && this.ALLATORIxDEMO != 14) {
            if (this.ALLATORIxDEMO != 15) return;
        }
        iiiiiiiiiiIiI IiiiiiiiIIIII = (iiiiiiiiiiIiI)this.form;
        IiiiiiiiIIIII.iIiIiiiiIIiii(this.ALLATORIxDEMO);
    }

    public void ALLATORIxDEMO(MouseEvent e, boolean isChoice) {
    }

    public int ALLATORIxDEMO() {
        return this.ALLATORIxDEMO;
    }

    public iiIIiiiiIiiII(String path, int type, int btn, String text, IiiiIiiiiIiIi form) {
        this(path, type, btn, null, null, text, form);
    }
}
