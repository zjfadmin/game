/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.a.TestpackJpanel
 *  com.xy.a.a.iiiIIiiiIIIii
 *  com.xy.a.iIIiiiiiIIIIi
 *  com.xy.a.iiIiiiiiIIiii
 *  com.xy.bean.ConfirmBean
 *  com.xy.bean.RoleShow
 *  com.xy.formula.GoodType
 *  com.xy.game.RoleData
 *  com.xy.i.IIiiIiiiiIIiI
 *  com.xy.i.IiiIiiiiIIIii
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.q.iiiiiiiiiiIiI
 *  com.xy.readbean.Goodstable
 *  com.xy.socket.Agreement
 *  com.xy.text.GameView
 *  com.xy.v.IIiiIiiiiIIiI
 *  com.xy.v.iiIiIiiiIIIiI
 */
package com.xy.i;

import com.xy.a.a.TestpackJpanel;
import com.xy.a.a.iiiIIiiiIIIii;
import com.xy.a.iIIiiiiiIIIIi;
import com.xy.a.iiIiiiiiIIiii;
import com.xy.bean.ConfirmBean;
import com.xy.bean.RoleShow;
import com.xy.formula.GoodType;
import com.xy.game.RoleData;
import com.xy.i.IIiiIiiiiIIiI;
import com.xy.i.IiiIiiiiIIIii;
import com.xy.q.IiiiIiiiiIiIi;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.q.iiiiiiiiiiIiI;
import com.xy.readbean.Goodstable;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import com.xy.v.iiIiIiiiIIIiI;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.math.BigDecimal;

public class IIiIiiiiIIiii
extends IIiiIiiiiIIiI {
    private int ALLATORIxDEMO;

    public IIiIiiiiIIiii(String path, int type, int id, String text, IiiiIiiiiIiIi form) {
        this(path, type, id, null, null, text, form);
    }

    public void ALLATORIxDEMO(MouseEvent e, boolean isChoice) {
    }

    public IIiIiiiiIIiii(String path, int type, int id, IiiiIiiiiIiIi form) {
        super(path, type, form);
        this.ALLATORIxDEMO = id;
        this.form = form;
    }

    public IIiIiiiiIIiii(String path, int type, int id, Font font, Color[] colors, String text, IiiiIiiiiIiIi form) {
        super(path, type, colors, form);
        this.ALLATORIxDEMO = id;
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
        if (this.ALLATORIxDEMO == 1) {
            if (this.form.iiIIiiiiIiIIi.getBattleScene() != null) {
                return;
            }
            this.form.iiIIiiiiIiIIi.setMouseIndex(iiIiIiiiIIIiI.iiIIIiiiiiiiI);
            return;
        }
        if (this.ALLATORIxDEMO == 2) {
            if (this.form.iiIIiiiiIiIIi.getBattleScene() != null) {
                return;
            }
            if (this.form.iiIIiiiiIiIIi.ALLATORIxDEMO()) {
                return;
            }
            this.form.iiIIiiiiIiIIi.setMouseIndex(iiIiIiiiIIIiI.iiiIiiiiiiiIi);
            return;
        }
        if (this.ALLATORIxDEMO == 3) {
            if (this.form.iiIIiiiiIiIIi.ALLATORIxDEMO()) {
                return;
            }
            this.form.ALLATORIxDEMO().setLockPack();
            this.form.ALLATORIxDEMO().iiiIiiiiiiIIi("\u80cc\u5305\u5df2\u52a0\u9501\uff01");
            return;
        }
        if (this.ALLATORIxDEMO == 4) {
            iiIiiiiiIIiii IiiiiiiiIIIII = (iiIiiiiiIIiii)this.form.ALLATORIxDEMO().iiiIiiiiiiIIi(32);
            IiiiiiiiIIIII.iIiIiiiiIIiii(com.xy.v.IIiiIiiiiIIiI.iIiIiiiiIIiIi((String)this.form.ALLATORIxDEMO().getLoginResult().getPassword()) ? 0 : 1);
            return;
        }
        if (this.ALLATORIxDEMO == 5) {
            iIIiiiiiIIIIi IiiiiiiiIIIII = (iIIiiiiiIIIIi)this.form.ALLATORIxDEMO().iiiIiiiiiiIIi(27);
            IiiiiiiiIIIII.iIiIiiiiIIiii(null, null, 33);
            return;
        }
        if (this.ALLATORIxDEMO == 6) {
            if (this.form.iiIIiiiiIiIIi.ALLATORIxDEMO()) {
                return;
            }
            RoleShow IiiiiiiiIIIII = this.form.iiIIiiiiIiIIi.roleUnit.iIiIiiiiIiIii;
            if (this.form.ALLATORIxDEMO().ALLATORIxDEMO(2, 3)) {
                if (!(IiiiiiiiIIIII.getMapid() == 1236L && IiiiiiiiIIIII.getX() > 5977 && IiiiiiiiIIIII.getX() < 8290 && IiiiiiiiIIIII.getY() > 3099 && IiiiiiiiIIIII.getY() < 4174 || IiiiiiiiIIIII.getMapid() == 1207L && IiiiiiiiIIIII.getX() > 3320 && IiiiiiiiIIIII.getX() < 4320 && IiiiiiiiIIIII.getY() > 4220 && IiiiiiiiIIIII.getY() < 4500)) {
                    this.form.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u5728\u6d1b\u9633\u96c6\u5e02\u6216\u8005\u957f\u5b89\u96c6\u5e02\u6446\u644a");
                    return;
                }
                if (IiiiiiiiIIIII.getMapid() == 1236L && IiiiiiiiIIIII.getX() > 7130 && IiiiiiiiIIIII.getX() < 7370 && IiiiiiiiIIIII.getY() > 3435 && IiiiiiiiIIIII.getY() < 3585) {
                    this.form.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u8f66\u592b\u5468\u56f4\u7981\u6b62\u6446\u644a");
                    return;
                }
            } else {
                if (IiiiiiiiIIIII.getMapid() != 1236L || IiiiiiiiIIIII.getX() <= 5977 || IiiiiiiiIIIII.getX() >= 8290 || IiiiiiiiIIIII.getY() <= 3099 || IiiiiiiiIIIII.getY() >= 4174) {
                    this.form.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u53ea\u80fd\u5728\u6d1b\u9633\u96c6\u5e02\u6446\u644a");
                    return;
                }
                if (IiiiiiiiIIIII.getMapid() == 1236L && IiiiiiiiIIIII.getX() > 7130 && IiiiiiiiIIIII.getX() < 7370 && IiiiiiiiIIIII.getY() > 3435 && IiiiiiiiIIIII.getY() < 3585) {
                    this.form.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u8f66\u592b\u5468\u56f4\u7981\u6b62\u6446\u644a");
                    return;
                }
            }
            if (IiiiiiiiIIIII.getTroop_id() == null && this.form.ALLATORIxDEMO().getBattleScene() == null && this.form.ALLATORIxDEMO().iIiIiiiiIIiii(14) == null) {
                if (IiiiiiiiIIIII.getBooth_id() != null) {
                    String IiiiiiiiIIIII2 = Agreement.getSendTextAES((String)"stallget", (String)IiiiiiiiIIIII.getBooth_id().toString());
                    this.form.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII2);
                    return;
                }
                IiiIiiiiIIIii.ALLATORIxDEMO((int)152, (GameView)this.form.iiIIiiiiIiIIi);
                return;
            }
            this.form.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u5f53\u524d\u72b6\u6001\u4e0d\u80fd\u6446\u644a\uff01");
            return;
        }
        if (this.ALLATORIxDEMO == 7) {
            IiiIiiiiIIIii.ALLATORIxDEMO((int)38, (GameView)this.form.iiIIiiiiIiIIi);
            return;
        }
        if (this.ALLATORIxDEMO == 8) {
            RoleData IiiiiiiiIIIII = this.form.ALLATORIxDEMO();
            if (IiiiiiiiIIIII.iiiIiiiiiiIIi()) {
                IiiIiiiiIIIii.ALLATORIxDEMO((int)182, (GameView)this.form.iiIIiiiiIiIIi);
                return;
            }
            String IiiiiiiiIIIII3 = Agreement.getSendTextAES((String)"parcel", (String)"GET");
            this.form.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII3);
            return;
        }
        if (this.ALLATORIxDEMO == 9) {
            this.form.ALLATORIxDEMO().IiiIiiiiiiIiI();
            return;
        }
        if (this.ALLATORIxDEMO == 10) {
            IIIiiiiiiiiIi IiiiiiiiIIIII = (IIIiiiiiiiiIi)this.form;
            IiiiiiiiIIIII.iIiIiiiiIIiIi();
            return;
        }
        if (this.ALLATORIxDEMO >= 11 && this.ALLATORIxDEMO <= 13) {
            IIIiiiiiiiiIi IiiiiiiiIIIII = (IIIiiiiiiiiIi)this.form;
            RoleData IiiiiiiiIIIII4 = this.form.ALLATORIxDEMO();
            BigDecimal[] IiiiiiiiIIIII5 = IiiiiiiiIIIII4.getPackRecord().setEquipType(this.ALLATORIxDEMO - 11);
            if (IiiiiiiiIIIII5 == null) {
                return;
            }
            String IiiiiiiiIIIII6 = Agreement.getSendTextAES((String)"rolechange", (String)("EO" + (this.ALLATORIxDEMO - 11)));
            this.form.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII6);
            IiiiiiiiIIIII.iIiIiiiiIIiii(this.ALLATORIxDEMO - 11);
            IiiiiiiiIIIII4.setEquipGoodsList(IiiiiiiiIIIII5);
            IiiiiiiiIIIII4.getRoleProperty().IIIIIiiiiIIii();
            try {
                Thread.sleep(5L);
            }
            catch (Exception IiiiiiiiIIIII7) {
                IiiiiiiiIIIII7.printStackTrace();
            }
            IiiiiiiiIIIII4.ALLATORIxDEMO(false);
            IiiiiiiiIIIII.iIiIiiiiIIiIi();
            return;
        }
        if (this.ALLATORIxDEMO == 21 || this.ALLATORIxDEMO == 22 || this.ALLATORIxDEMO == 23) {
            ((iiiIIiiiIIIii)this.form).iiiIiiiiiiIIi(this.ALLATORIxDEMO);
            return;
        }
        if (this.ALLATORIxDEMO == 22) return;
        if (this.ALLATORIxDEMO == 23) return;
        if (this.ALLATORIxDEMO != 24) return;
        RoleData IiiiiiiiIIIII = this.form.ALLATORIxDEMO();
        iiiiiiiiiiIiI IiiiiiiiIIIII8 = ((IIIiiiiiiiiIi)this.form).ALLATORIxDEMO();
        int IiiiiiiiIIIII9 = IiiiiiiiIIIII8.iiiIiiiiiiIIi();
        if (IiiiiiiiIIIII8.ALLATORIxDEMO() && IiiiiiiiIIIII9 >= IiiiiiiiIIIII8.IiiIiiiiiiIiI() - IiiiiiiiIIIII8.ALLATORIxDEMO().length) {
            return;
        }
        StringBuffer IiiiiiiiIIIII10 = new StringBuffer();
        int IiiiiiiiIIIII11 = 0;
        while (IiiiiiiiIIIII11 < IiiiiiiiIIIII8.ALLATORIxDEMO().length) {
            int IiiiiiiiIIIII12 = IiiiiiiiIIIII11 + IiiiiiiiIIIII9;
            Goodstable IiiiiiiiIIIII13 = IiiiiiiiIIIII.getGood(IiiiiiiiIIIII.goodPacks[IiiiiiiiIIIII12]);
            if (IiiiiiiiIIIII13 != null && IiiiiiiiIIIII13.getGoodlock() != 1 && (GoodType.ALLATORIxDEMO((long)IiiiiiiiIIIII13.getType()) == -1 || GoodType.getExtra((String)IiiiiiiiIIIII13.getValue(), (String)GoodType.Extras[4]) == null)) {
                if (IiiiiiiiIIIII10.length() != 0) {
                    IiiiiiiiIIIII10.append("|");
                }
                IiiiiiiiIIIII10.append(IiiiiiiiIIIII13.getRgid());
            }
            ++IiiiiiiiIIIII11;
        }
        if (IiiiiiiiIIIII10.length() == 0) {
            this.form.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u5f53\u524d\u80cc\u5305\u680f\u6ca1\u6709\u8981\u6e05\u7406\u7684\u7269\u54c1");
            return;
        }
        ConfirmBean IiiiiiiiIIIII2 = new ConfirmBean(1, IiiiiiiiIIIII10.toString(), "#W\u786e\u5b9a\u8981\u5c06\u5f53\u524d\u80cc\u5305\u680f\u7684\u7269\u54c1\u4e22\u5f03\u5417(\u4e0d\u5305\u542b\u52a0\u9501\u7269\u54c1)?");
        this.form.iiIIiiiiIiIIi.ALLATORIxDEMO(IiiiiiiiIIIII2);
    }

    public int ALLATORIxDEMO() {
        return this.ALLATORIxDEMO;
    }

    public void ALLATORIxDEMO(int id) {
        this.ALLATORIxDEMO = id;
    }
}
