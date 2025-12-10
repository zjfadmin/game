/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.iIIiiiiiIIIIi
 *  com.xy.a.iiIiiiiiIIiiI
 *  com.xy.bean.ConfirmBean
 *  com.xy.game.HandleOption
 *  com.xy.i.IIiiIiiiiIIiI
 *  com.xy.i.IiiIiiiiIIIii
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.socket.Agreement
 *  com.xy.text.GameView
 */
package com.xy.i;

import com.xy.a.iIIiiiiiIIIIi;
import com.xy.a.iiIiiiiiIIiiI;
import com.xy.bean.ConfirmBean;
import com.xy.game.HandleOption;
import com.xy.i.IIiiIiiiiIIiI;
import com.xy.i.IiiIiiiiIIIii;
import com.xy.q.IiiiIiiiiIiIi;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class IiIIIiiiiiiIi
extends IIiiIiiiiIIiI {
    private int iiIiiiiiiiIii;
    private Object IiiiiiiiIIIII;
    private int ALLATORIxDEMO;

    public void ALLATORIxDEMO(Object data) {
        this.IiiiiiiiIIIII = data;
    }

    public void iIiIiiiiIIiii(int id) {
        this.iiIiiiiiiiIii = id;
    }

    public void mouseExited(MouseEvent e) {
        super.mouseExited(e);
        if (this.iiIiiiiiiiIii != 2021 && this.iiIiiiiiiiIii != 2022) {
            if (this.iiIiiiiiiiIii != 2023) return;
        }
        this.form.ALLATORIxDEMO().iiiIiiiiiiIIi(46);
    }

    public void mouseEntered(MouseEvent e) {
        super.mouseEntered(e);
        if (this.iiIiiiiiiiIii != 2021 && this.iiIiiiiiiiIii != 2022) {
            if (this.iiIiiiiiiiIii != 2023) return;
        }
        iiIiiiiiIIiiI iiIiiiiiIIiiI2 = (iiIiiiiiIIiiI)this.form.ALLATORIxDEMO().iiiIiiiiiiIIi(46);
        iiIiiiiiIIiiI2.IiiIiiiiiiIiI("\u7b49\u7ea7  " + this.ALLATORIxDEMO);
    }

    public int iIiIiiiiIIiii() {
        return this.ALLATORIxDEMO;
    }

    public IiIIIiiiiiiIi(String path, int type, int id, String text, IiiiIiiiiIiIi form) {
        this(path, type, id, null, null, text, form);
    }

    public void ALLATORIxDEMO(int lvl) {
        this.ALLATORIxDEMO = lvl;
    }

    public IiIIIiiiiiiIi(String path, int type, int id, IiiiIiiiiIiIi form) {
        super(path, type, form);
        this.iiIiiiiiiiIii = id;
        this.form = form;
    }

    public int ALLATORIxDEMO() {
        return this.iiIiiiiiiiIii;
    }

    public IiIIIiiiiiiIi(String path, int type, int id, Font font, Color[] colors, String text, IiiiIiiiiIiIi form) {
        super(path, type, colors, form);
        this.iiIiiiiiiiIii = id;
        if (font != null) {
            this.setFont(font);
        } else {
            this.setFont(iiIIiiiiIiiII.iiIiiiiiiIIiI);
        }
        this.setHorizontalAlignment(0);
        this.setVerticalTextPosition(0);
        this.setText(text);
    }

    public void ALLATORIxDEMO(MouseEvent e) {
        if (this.iiIiiiiiiiIii == 0) return;
        if (this.iiIiiiiiiiIii == 59999) {
            this.form.ALLATORIxDEMO().iIiIiiiiIIiIi(121);
            return;
        }
        if (this.iiIiiiiiiiIii == 59998) {
            iIIiiiiiIIIIi IiiiiiiiIIIII = (iIIiiiiiIIIIi)this.form.ALLATORIxDEMO().iiiIiiiiiiIIi(27);
            IiiiiiiiIIIII.iIiIiiiiIIiii(null, null, 59998);
            return;
        }
        if (this.iiIiiiiiiiIii == 59997) {
            String IiiiiiiiIIIII = Agreement.getSendTextAES((String)"taskN", (String)"G7");
            this.form.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII);
            return;
        }
        if (this.iiIiiiiiiiIii == 59996) {
            IiiIiiiiIIIii.ALLATORIxDEMO((int)117, (GameView)this.form.iiIIiiiiIiIIi);
            return;
        }
        if (this.iiIiiiiiiiIii == 59995) {
            iIIiiiiiIIIIi IiiiiiiiIIIII = (iIIiiiiiIIIIi)this.form.ALLATORIxDEMO().iiiIiiiiiiIIi(27);
            IiiiiiiiIIIII.iIiIiiiiIIiii(null, null, 85);
            return;
        }
        if (this.iiIiiiiiiiIii == 59994) {
            HandleOption.iIiIiiiiIIiii((String)"\u7b26\u77f3", (GameView)this.form.iiIIiiiiIiIIi);
            return;
        }
        if (this.iiIiiiiiiiIii == 59993) {
            HandleOption.iIiIiiiiIIiii((String)"\u6211\u8981\u5408\u6210\u70bc\u5996\u77f3", (GameView)this.form.iiIIiiiiIiIIi);
            return;
        }
        if (this.iiIiiiiiiiIii == 59992) {
            IiiIiiiiIIIii.ALLATORIxDEMO((int)105, (GameView)this.form.iiIIiiiiIiIIi);
            return;
        }
        if (this.iiIiiiiiiiIii == 59991) {
            IiiIiiiiIIIii.ALLATORIxDEMO((int)113, (GameView)this.form.iiIIiiiiIiIIi);
            return;
        }
        if (this.iiIiiiiiiiIii == 59990) {
            iIIiiiiiIIIIi IiiiiiiiIIIII = (iIIiiiiiIIIIi)this.form.ALLATORIxDEMO().iiiIiiiiiiIIi(27);
            IiiiiiiiIIIII.iIiIiiiiIIiii(null, null, 59990);
            return;
        }
        if (this.iiIiiiiiiiIii == 59989) {
            String IiiiiiiiIIIII = Agreement.getSendTextAES((String)"exchange", (String)"X01");
            this.form.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII);
            return;
        }
        if (this.iiIiiiiiiiIii == 59988) {
            IiiIiiiiIIIii.ALLATORIxDEMO((int)40, (GameView)this.form.iiIIiiiiIiIIi);
            return;
        }
        if (this.iiIiiiiiiiIii == 59987) {
            this.form.iiIIiiiiIiIIi.ALLATORIxDEMO(new ConfirmBean(81, null, "\u8bf7\u8f93\u5165\u4f60\u7684\u65b0\u540d\u79f0,\u4fee\u6539\u6210\u529f\u540e\u5c06\u6263\u966430\u79ef\u5206,\u4f60\u5f53\u524d\u79ef\u5206:#G" + this.form.ALLATORIxDEMO().getLoginResult().getMoney()));
            return;
        }
        if (HandleOption.ALLATORIxDEMO((int)this.iiIiiiiiiiIii, null, (GameView)this.form.iiIIiiiiIiIIi)) {
            return;
        }
        if (!(this.iiIiiiiiiiIii == 1002 || this.iiIiiiiiiiIii == 1107 || this.iiIiiiiiiiIii == 521 || this.iiIiiiiiiiIii >= 1101 && this.iiIiiiiiiiIii <= 1105 || this.iiIiiiiiiiIii >= 510 && this.iiIiiiiiiiIii <= 514 || this.iiIiiiiiiiIii == 2020 || this.iiIiiiiiiiIii == 2022 || this.iiIiiiiiiiIii == 2023)) {
            iIIiiiiiIIIIi IiiiiiiiIIIII = (iIIiiiiiIIIIi)this.form.ALLATORIxDEMO().iiiIiiiiiiIIi(27);
            IiiiiiiiIIIII.iIiIiiiiIIiii(null, null, this.iiIiiiiiiiIii);
            return;
        }
        String IiiiiiiiIIIII = Agreement.getSendTextAES((String)"gangmonitor", (String)String.valueOf(this.iiIiiiiiiiIii));
        this.form.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII);
    }

    public Object ALLATORIxDEMO() {
        return this.IiiiiiiiIIIII;
    }

    public void ALLATORIxDEMO(MouseEvent e, boolean isChoice) {
    }

    public void ALLATORIxDEMO(int id, String text) {
        this.iiIiiiiiiiIii = id;
        this.setText(text);
    }
}
