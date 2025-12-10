/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.IIIIIiiiiiiii
 *  com.xy.a.iIiIiiiiIiIiI
 *  com.xy.a.iIiiIiiiIiIIi
 *  com.xy.bean.Role_bean
 *  com.xy.d.iiIiIiiiiIiii
 *  com.xy.i.IIiiIiiiiIIiI
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.text.GameView
 *  com.xy.v.iiIiIiiiIIIiI
 */
package com.xy.i;

import com.xy.a.IIIIIiiiiiiii;
import com.xy.a.iIiIiiiiIiIiI;
import com.xy.a.iIiiIiiiIiIIi;
import com.xy.bean.Role_bean;
import com.xy.d.iiIiIiiiiIiii;
import com.xy.i.IIiiIiiiiIIiI;
import com.xy.q.IiiiIiiiiIiIi;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.text.GameView;
import com.xy.v.iiIiIiiiIIIiI;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.math.BigDecimal;

public class iiIiIiiiiiIIi
extends IIiiIiiiiIIiI {
    private int ALLATORIxDEMO;

    public static void ALLATORIxDEMO(int id, GameView gameView) {
    }

    public int ALLATORIxDEMO() {
        return this.ALLATORIxDEMO;
    }

    public iiIiIiiiiiIIi(String path, int type, int id, String text, IiiiIiiiiIiIi form) {
        this(path, type, id, null, null, text, form);
    }

    public iiIiIiiiiiIIi(String path, int type, int id, IiiiIiiiiIiIi form) {
        super(path, type, form);
        this.ALLATORIxDEMO = id;
    }

    public void ALLATORIxDEMO(MouseEvent e, boolean isChoice) {
    }

    public void ALLATORIxDEMO(MouseEvent e) {
        if (this.ALLATORIxDEMO == 1) {
            if (this.form.ALLATORIxDEMO().getBattleScene() != null) {
                return;
            }
            this.form.ALLATORIxDEMO().setMouseIndex(iiIiIiiiIIIiI.iiiiIiiiIiiII);
            return;
        }
        if (this.ALLATORIxDEMO == 2) {
            this.form.ALLATORIxDEMO().iIiIiiiiIIiIi(75);
            return;
        }
        if (this.ALLATORIxDEMO == 101) {
            ((iIiIiiiiIiIiI)this.form).iiiIiiiiiiIIi();
            return;
        }
        if (this.ALLATORIxDEMO == 102) {
            Role_bean IiiiiiiiIIIII = ((iIiIiiiiIiIiI)this.form).ALLATORIxDEMO();
            if (IiiiiiiiIIIII == null) {
                return;
            }
            iiIiIiiiiIiii.ALLATORIxDEMO((BigDecimal)IiiiiiiiIIIII.getRole_id(), (String)IiiiiiiiIIIII.getRolename(), (GameView)this.form.iiIIiiiiIiIIi);
            return;
        }
        if (this.ALLATORIxDEMO == 103) {
            Role_bean IiiiiiiiIIIII = ((iIiIiiiiIiIiI)this.form).ALLATORIxDEMO();
            if (IiiiiiiiIIIII == null) {
                return;
            }
            iiIiIiiiiIiii.ALLATORIxDEMO((BigDecimal)IiiiiiiiIIIII.getRole_id(), (GameView)this.form.iiIIiiiiIiIIi);
            return;
        }
        if (this.ALLATORIxDEMO == 201) {
            ((iIiiIiiiIiIIi)this.form).iiiIiiiiiiIIi();
            return;
        }
        if (this.ALLATORIxDEMO < 301) return;
        if (this.ALLATORIxDEMO > 309) return;
        ((IIIIIiiiiiiii)this.form).iIiIiiiiIIiii(this.ALLATORIxDEMO);
    }

    public iiIiIiiiiiIIi(String path, int type, int id, Font font, Color[] colors, String text, IiiiIiiiiIiIi form) {
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

    public void ALLATORIxDEMO(int id) {
        this.ALLATORIxDEMO = id;
    }
}
