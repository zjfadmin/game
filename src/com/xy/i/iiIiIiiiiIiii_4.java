/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.i.IIIIIiiiIIIiI
 *  com.xy.a.i.IIIIIiiiIiIii
 *  com.xy.a.i.IIIIIiiiIiiII
 *  com.xy.a.i.IIIiiiiiIiIiI
 *  com.xy.a.i.IIiIIiiiIIIiI
 *  com.xy.a.i.IIiIiiiiIiIII
 *  com.xy.a.i.IIiiIiiiiIIiI
 *  com.xy.a.i.IiIIIiiiiiiIi
 *  com.xy.a.i.IiIiIiiiiIiii
 *  com.xy.a.i.IiIiIiiiiiIiI
 *  com.xy.a.i.IiiiiiiiiIIII
 *  com.xy.a.i.iIiIIiiiIIIiI
 *  com.xy.a.i.iIiIIiiiIIiIi
 *  com.xy.a.i.iiIIiiiiIiiII
 *  com.xy.a.i.iiIiIiiiiIiii
 *  com.xy.a.i.iiIiiiiiIIiiI
 *  com.xy.a.i.iiIiiiiiIIiii
 *  com.xy.a.i.iiiiiiiiiiIiI
 *  com.xy.a.iiIiiiiiIIiiI
 *  com.xy.formula.GoodType
 *  com.xy.game.RoleData
 *  com.xy.i.IIiiIiiiiIIiI
 *  com.xy.i.IiiIiiiiIIIii
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.readbean.Activity
 *  com.xy.readbean.ActivityFC
 *  com.xy.readbean.ActivityFCBase
 *  com.xy.readbean.ActivityFCBuy
 *  com.xy.readbean.ActivityFCTarget
 *  com.xy.readbean.Goodstable
 *  com.xy.readbean.LaborShop
 *  com.xy.readbean.LaborVip
 *  com.xy.socket.Agreement
 *  com.xy.text.GameView
 *  com.xy.v.IiiiiiiiiIIII
 */
package com.xy.i;

import com.xy.a.i.IIIIIiiiIIIiI;
import com.xy.a.i.IIIIIiiiIiIii;
import com.xy.a.i.IIIIIiiiIiiII;
import com.xy.a.i.IIIiiiiiIiIiI;
import com.xy.a.i.IIiIIiiiIIIiI;
import com.xy.a.i.IIiIiiiiIiIII;
import com.xy.a.i.IiIIIiiiiiiIi;
import com.xy.a.i.IiIiIiiiiIiii;
import com.xy.a.i.IiIiIiiiiiIiI;
import com.xy.a.i.IiiiiiiiiIIII;
import com.xy.a.i.iIiIIiiiIIIiI;
import com.xy.a.i.iIiIIiiiIIiIi;
import com.xy.a.i.iiIIiiiiIiiII;
import com.xy.a.i.iiIiiiiiIIiii;
import com.xy.a.i.iiiiiiiiiiIiI;
import com.xy.a.iiIiiiiiIIiiI;
import com.xy.formula.GoodType;
import com.xy.game.RoleData;
import com.xy.i.IIiiIiiiiIIiI;
import com.xy.i.IiiIiiiiIIIii;
import com.xy.q.IiiiIiiiiIiIi;
import com.xy.readbean.Activity;
import com.xy.readbean.ActivityFC;
import com.xy.readbean.ActivityFCBase;
import com.xy.readbean.ActivityFCBuy;
import com.xy.readbean.ActivityFCTarget;
import com.xy.readbean.Goodstable;
import com.xy.readbean.LaborShop;
import com.xy.readbean.LaborVip;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.math.BigDecimal;

public class iiIiIiiiiIiii
extends IIiiIiiiiIIiI {
    private int IiiiiiiiIIIII;
    private Object ALLATORIxDEMO;

    public void ALLATORIxDEMO(int id, int index, int num) {
        Object IiiiiiiiIIIII;
        if (num <= 0) {
            return;
        }
        if (id != 0) {
            double IiiiiiiiIIIII2;
            IiiiiiiiIIIII = (LaborShop)this.form.ALLATORIxDEMO().ALLATORIxDEMO().getShops().get(id);
            if (IiiiiiiiIIIII == null) {
                return;
            }
            long IiiiiiiiIIIII3 = iiIiIiiiiIiii.ALLATORIxDEMO(IiiiiiiiIIIII, this.form.ALLATORIxDEMO()).longValue();
            long IiiiiiiiIIIII4 = IiiiiiiiIIIII.getMoney();
            if (IiiiiiiiIIIII.getZk() != null && (IiiiiiiiIIIII2 = iiIiIiiiiIiii.ALLATORIxDEMO(this.form.ALLATORIxDEMO())) != 1.0) {
                IiiiiiiiIIIII4 = (long)((double)IiiiiiiiIIIII4 * IiiiiiiiIIIII2);
            }
            if ((IiiiiiiiIIIII4 *= (long)num) > IiiiiiiiIIIII3) {
                this.form.iiIIiiiiIiIIi.iIiIiiiiIIiii(String.valueOf(IiiiiiiiIIIII.getMoneyType()) + "\u4e0d\u8db3");
                return;
            }
            if (IiiiiiiiIIIII.getChoice() != null && index == -1) {
                this.form.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u8bf7\u9009\u62e9\u5176\u4e2d\u4e00\u4e2a\u8d2d\u4e70");
                return;
            }
        }
        IiiiiiiiIIIII = Agreement.getSendTextAES((String)"labor", (String)("NL|" + id + "|" + index + "|" + num));
        this.form.ALLATORIxDEMO().ALLATORIxDEMO((String)IiiiiiiiIIIII);
    }

    public iiIiIiiiiIiii(String path, int type, int id, String text, IiiiIiiiiIiIi form) {
        this(path, type, id, null, null, text, form);
    }

    public void ALLATORIxDEMO(int id) {
        this.IiiiiiiiIIIII = id;
    }

    public int ALLATORIxDEMO() {
        return this.IiiiiiiiIIIII;
    }

    public void ALLATORIxDEMO(MouseEvent e) {
        if (this.IiiiiiiiIIIII == 1) {
            ((com.xy.a.i.iiIiIiiiiIiii)this.form).iIiIiiiiIIiIi();
            return;
        }
        if (this.IiiiiiiiIIIII == 2) {
            ((iiIIiiiiIiiII)this.form).iIiIiiiiIIiIi();
            return;
        }
        if (this.IiiiiiiiIIIII == 3) {
            ((IIIIIiiiIiIii)this.form).IiiIiiiiiiIiI();
            return;
        }
        if (this.IiiiiiiiIIIII == 4) {
            ((iiiiiiiiiiIiI)this.form).iIiIiiiiIIiIi();
            return;
        }
        if (this.IiiiiiiiIIIII == 5 || this.IiiiiiiiIIIII == 6) {
            ((com.xy.a.i.IIiiIiiiiIIiI)this.form).iIiIiiiiIIiii(this.IiiiiiiiIIIII);
            return;
        }
        if (this.IiiiiiiiIIIII == 9) {
            ((IiIIIiiiiiiIi)this.form).iIiIiiiiIIiii(this.IiiiiiiiIIIII);
            return;
        }
        if (this.IiiiiiiiIIIII == 12) {
            ((IIIIIiiiIIIiI)this.form).IiiIiiiiiiIiI();
            return;
        }
        if (this.IiiiiiiiIIIII == 13 || this.IiiiiiiiIIIII == 16) {
            IiiIiiiiIIIii.ALLATORIxDEMO((int)63, (GameView)this.form.iiIIiiiiIiIIi);
            return;
        }
        if (this.IiiiiiiiIIIII == 18) {
            IiiIiiiiIIIii.ALLATORIxDEMO((int)64, (GameView)this.form.iiIIiiiiIiIIi);
            return;
        }
        if (this.IiiiiiiiIIIII >= 14 && this.IiiiiiiiIIIII <= 19) {
            ((IiIiIiiiiiIiI)this.form).iIiIiiiiIIiii(this.IiiiiiiiIIIII);
            return;
        }
        if (this.IiiiiiiiIIIII >= 20 && this.IiiiiiiiIIIII <= 22) {
            ((IIIiiiiiIiIiI)this.form).ALLATORIxDEMO(this.IiiiiiiiIIIII);
            return;
        }
        if (this.IiiiiiiiIIIII == 31) {
            ((com.xy.a.i.iiIiiiiiIIiiI)this.form).iIiIiiiiIIiIi();
            return;
        }
        if (this.IiiiiiiiIIIII == 32) {
            IiiIiiiiIIIii.ALLATORIxDEMO((int)140, (GameView)this.form.iiIIiiiiIiIIi);
            return;
        }
        if (this.IiiiiiiiIIIII == 33) {
            IiiIiiiiIIIii.ALLATORIxDEMO((int)139, (GameView)this.form.iiIIiiiiIiIIi);
            return;
        }
        if (this.IiiiiiiiIIIII == 34) {
            ((IIiIIiiiIIIiI)this.form).iIiIiiiiIIiIi();
            return;
        }
        if (this.IiiiiiiiIIIII == 35) {
            ((iiIiiiiiIIiii)this.form).iiiIiiiiiiIIi();
            return;
        }
        if (this.IiiiiiiiIIIII == 51 || this.IiiiiiiiIIIII == 52) {
            ((iIiIIiiiIIIiI)this.form).iIiIiiiiIIiii(this.IiiiiiiiIIIII == 51 ? -2 : -1);
            return;
        }
        if (this.IiiiiiiiIIIII == 53) {
            this.ALLATORIxDEMO(0, Integer.parseInt(this.getName()), 1);
            return;
        }
        if (this.IiiiiiiiIIIII == 54) {
            IiIiIiiiiIiii IiiiiiiiIIIII = (IiIiIiiiiIiii)this.form;
            this.ALLATORIxDEMO(IiiiiiiiIIIII.ALLATORIxDEMO().getId(), IiiiiiiiIIIII.iiiIiiiiiiIIi(), 1);
            return;
        }
        if (this.IiiiiiiiIIIII == 55) {
            iIiIIiiiIIiIi IiiiiiiiIIIII = (iIiIIiiiIIiIi)this.form;
            if (IiiiiiiiIIIII.ALLATORIxDEMO() != null) {
                this.ALLATORIxDEMO(IiiiiiiiIIIII.ALLATORIxDEMO().getId(), 0, (int)IiiiiiiiIIIII.ALLATORIxDEMO());
                return;
            }
            if (IiiiiiiiIIIII.ALLATORIxDEMO() == null) return;
            this.ALLATORIxDEMO(IiiiiiiiIIIII.ALLATORIxDEMO(), IiiiiiiiIIIII.ALLATORIxDEMO(), (int)IiiiiiiiIIIII.ALLATORIxDEMO());
            return;
        }
        if (this.IiiiiiiiIIIII == 61 || this.IiiiiiiiIIIII == 62) {
            ((IiiiiiiiiIIII)this.form).iiiIiiiiiiIIi(this.IiiiiiiiIIIII);
            return;
        }
        if (this.IiiiiiiiIIIII == 71 || this.IiiiiiiiIIIII == 72) {
            ((IIIIIiiiIiiII)this.form).iIiIiiiiIIiii(this.IiiiiiiiIIIII);
            return;
        }
        if (this.IiiiiiiiIIIII != 83 && this.IiiiiiiiIIIII != 84) {
            if (this.IiiiiiiiIIIII != 85) return;
        }
        ((IIiIiiiiIiIII)this.form).iIiIiiiiIIiii(this.IiiiiiiiIIIII);
    }

    public static BigDecimal ALLATORIxDEMO(LaborShop laborShop, RoleData roleData) {
        if (laborShop.getMoneyType().equals("\u4ed9\u7389")) {
            return roleData.getLoginResult().getCodecard();
        }
        if (laborShop.getMoneyType().equals("\u91d1\u94b1")) {
            return roleData.getLoginResult().getGold();
        }
        if (!laborShop.getMoneyType().equals("\u79ef\u5206")) return roleData.getLoginResult().getScoretype(laborShop.getMoneyType());
        return new BigDecimal(roleData.getLoginResult().getMoney());
    }

    public void ALLATORIxDEMO(MouseEvent e, boolean isChoice) {
        if (this.IiiiiiiiIIIII >= 41 && this.IiiiiiiiIIIII <= 44) {
            if (!isChoice) return;
            ((iIiIIiiiIIIiI)this.form).iiiIiiiiiiIIi(this.IiiiiiiiIIIII - 41);
            return;
        }
        if (this.IiiiiiiiIIIII < 81) return;
        if (this.IiiiiiiiIIIII > 82) return;
        if (!isChoice) return;
        ((IIiIiiiiIiIII)this.form).iIiIiiiiIIiIi(this.IiiiiiiiIIIII - 81);
    }

    public iiIiIiiiiIiii(String path, int type, int id, Font font, Color[] colors, String text, IiiiIiiiiIiIi form) {
        super(path, type, colors, form);
        this.IiiiiiiiIIIII = id;
        if (font != null) {
            this.setFont(font);
        } else {
            this.setFont(com.xy.q.iiIIiiiiIiiII.iiIiiiiiiIIiI);
        }
        this.setHorizontalAlignment(0);
        this.setText(text);
    }

    public void ALLATORIxDEMO(Object data) {
        this.ALLATORIxDEMO = data;
    }

    public iiIiIiiiiIiii(String path, int type, int id, IiiiIiiiiIiIi form) {
        super(path, type, form);
        this.IiiiiiiiIIIII = id;
        this.form = form;
    }

    public void mouseEntered(MouseEvent e) {
        super.mouseEntered(e);
        if (this.IiiiiiiiIIIII != 53) return;
        LaborVip IiiiiiiiIIIII = this.form.ALLATORIxDEMO().ALLATORIxDEMO().getVips()[Integer.parseInt(this.getName())];
        iiIiiiiiIIiiI iiIiiiiiIIiiI2 = (iiIiiiiiIIiiI)this.form.ALLATORIxDEMO().iiiIiiiiiiIIi(46);
        iiIiiiiiIIiiI2.ALLATORIxDEMO(String.valueOf(IiiiiiiiIIIII.getMoney()) + "\u7d2f\u51b2\u5956\u52b1", IiiiiiiiIIIII.getText());
    }

    public void mouseExited(MouseEvent e) {
        super.mouseExited(e);
        if (this.IiiiiiiiIIIII != 53) return;
        this.form.ALLATORIxDEMO().iiiIiiiiiiIIi(46);
    }

    public void ALLATORIxDEMO(Activity activity, ActivityFC activityFC, int num) {
        Object IiiiiiiiIIIII;
        if (num <= 0) {
            return;
        }
        RoleData IiiiiiiiIIIII2 = this.form.ALLATORIxDEMO();
        int IiiiiiiiIIIII3 = 0;
        int IiiiiiiiIIIII4 = 0;
        com.xy.v.IiiiiiiiiIIII IiiiiiiiIIIII5 = this.form.ALLATORIxDEMO();
        ActivityFCBase[] IiiiiiiiIIIII6 = null;
        if (activityFC.getType() == 1) {
            IiiiiiiiIIIII6 = ((ActivityFCBuy)activityFC.getData()).getGains();
        } else if (activityFC.getType() == 2) {
            IiiiiiiiIIIII6 = ((ActivityFCTarget)activityFC.getData()).getGains();
        }
        int IiiiiiiiIIIII7 = 0;
        while (IiiiiiiiIIIII7 < IiiiiiiiIIIII6.length) {
            IiiiiiiiIIIII = IiiiiiiiIIIII6[IiiiiiiiIIIII7];
            if (IiiiiiiiIIIII.getType() != 1) {
                if (IiiiiiiiIIIII.getType() == 2) {
                    Goodstable IiiiiiiiIIIII8 = IiiiiiiiIIIII5.ALLATORIxDEMO(new BigDecimal(IiiiiiiiIIIII.getId()));
                    if (IiiiiiiiIIIII8 == null || !GoodType.ALLATORIxDEMO((Long)IiiiiiiiIIIII8.getType())) {
                        IiiiiiiiIIIII4 = (int)((long)IiiiiiiiIIIII4 + IiiiiiiiIIIII.getNum());
                    } else {
                        ++IiiiiiiiIIIII3;
                    }
                } else if (IiiiiiiiIIIII.getType() == 3) {
                    ++IiiiiiiiIIIII4;
                } else {
                    IiiiiiiiIIIII.getType();
                }
            }
            ++IiiiiiiiIIIII7;
        }
        IiiiiiiiIIIII7 = IiiiiiiiIIIII2.getGoodPackSum(-1L, new BigDecimal(-1), IiiiiiiiIIIII3 + IiiiiiiiIIIII4 * num);
        IiiiiiiiIIIII7 -= IiiiiiiiIIIII3;
        if (IiiiiiiiIIIII4 > 0) {
            num = IiiiiiiiIIIII7 / IiiiiiiiIIIII4;
        }
        if (num > 0 && IiiiiiiiIIIII7 >= 0) {
            IiiiiiiiIIIII = Agreement.getSendTextAES((String)"activity", (String)(String.valueOf(activity.getId()) + "|" + activityFC.getId() + "|" + num));
            this.form.ALLATORIxDEMO().ALLATORIxDEMO((String)IiiiiiiiIIIII);
            return;
        }
        this.form.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u4f60\u7684\u80cc\u5305\u4e0d\u591f");
    }

    public static double ALLATORIxDEMO(RoleData roleData) {
        int IiiiiiiiIIIII = roleData.getLoginResult().getPaysum().intValue();
        LaborVip[] IiiiiiiiIIIII2 = roleData.getObjectArea().ALLATORIxDEMO().getVips();
        int IiiiiiiiIIIII3 = IiiiiiiiIIIII2.length - 1;
        while (IiiiiiiiIIIII3 >= 0) {
            if (IiiiiiiiIIIII >= IiiiiiiiIIIII2[IiiiiiiiIIIII3].getMoney()) {
                return IiiiiiiiIIIII2[IiiiiiiiIIIII3].getZk();
            }
            --IiiiiiiiIIIII3;
        }
        return 1.0;
    }
}
