/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.game.RoleData
 *  com.xy.i.iiIiIiiiiIiii
 *  com.xy.q.IIiIIiiiIIIiI
 *  com.xy.q.IiIIIiiiiIIiI
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.readbean.Activity
 *  com.xy.readbean.ActivityFC
 *  com.xy.readbean.ActivityFCBase
 *  com.xy.readbean.ActivityFCBuy
 *  com.xy.readbean.LaborShop
 *  com.xy.readbean.MoneyType
 *  com.xy.text.GameView
 *  com.xy.v.iiIiIiiiiIiii
 *  com.xy.w.IIIiiiiiIiIiI
 *  com.xy.w.IIiIiiiiIiiIi
 */
package com.xy.a.i;

import com.xy.game.RoleData;
import com.xy.q.IIiIIiiiIIIiI;
import com.xy.q.IiIIIiiiiIIiI;
import com.xy.q.IiiiIiiiiIiIi;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.readbean.Activity;
import com.xy.readbean.ActivityFC;
import com.xy.readbean.ActivityFCBase;
import com.xy.readbean.ActivityFCBuy;
import com.xy.readbean.LaborShop;
import com.xy.readbean.MoneyType;
import com.xy.text.GameView;
import com.xy.v.iiIiIiiiiIiii;
import com.xy.w.IIIiiiiiIiIiI;
import com.xy.w.IIiIiiiiIiiIi;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.math.BigDecimal;
import javax.swing.JLabel;
import javax.swing.JTextField;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class iIiIIiiiIIiIi
extends IiiiIiiiiIiIi {
    private JLabel iiiiIiiiIIiii;
    private JLabel iIIiIiiiiiiIi;
    private com.xy.i.iiIiIiiiiIiii IIIIiiiiiiiII;
    private MoneyType iiIIIiiiiiiiI;
    private JLabel IiIiiiiiIIIII;
    private LaborShop iiIiIiiiiIIIi;
    private ActivityFC iiiiIiiiIiiII;
    private IIiIIiiiIIIiI iiiIiiiiiiiIi;
    private IIIiiiiiIiIiI iIiiIiiiiiiII;
    private Activity IIiiIiiiIIiIi;
    private JTextField iIiIiiiiIiIii;
    private JLabel IiIIIiiiiIiiI;
    private JLabel iiIiiiiiiiIii;
    private JLabel IiiiiiiiIIIII;
    private JLabel ALLATORIxDEMO;

    public Activity ALLATORIxDEMO() {
        return this.IIiiIiiiIIiIi;
    }

    public void ALLATORIxDEMO(long number, JTextField textField) {
        if (this.iiIiIiiiiIIIi != null) {
            iiIIiiiiIiiII.ALLATORIxDEMO((JLabel)this.iiIiiiiiiiIii, (long)(this.iiIiIiiiiIIIi.getMoney() * number));
            return;
        }
        if (this.iiiiIiiiIiiII == null) return;
        iiIIiiiiIiiII.ALLATORIxDEMO((JLabel)this.iiIiiiiiiiIii, (long)(((ActivityFCBuy)this.iiiiIiiiIiiII.getData()).getUses()[0].getNum() * number));
    }

    public boolean ALLATORIxDEMO(long number, JTextField textField) {
        return true;
    }

    public void ALLATORIxDEMO(LaborShop laborShop) {
        this.IIiiIiiiIIiIi = null;
        this.iiiiIiiiIiiII = null;
        this.iiIIIiiiiiiiI = null;
        this.iiIiIiiiiIIIi = laborShop;
        String IiiiiiiiIIIII = laborShop.getMoneyType().substring(laborShop.getMoneyType().length() - 2, laborShop.getMoneyType().length());
        this.IiIIIiiiiIiiI.setText("\u6d88\u8017" + IiiiiiiiIIIII);
        this.ALLATORIxDEMO.setText("\u62e5\u6709" + IiiiiiiiIIIII);
        this.iIIiIiiiiiiIi.setText(laborShop.getName());
        this.iIiiIiiiiiiII.ALLATORIxDEMO(IIiIiiiiIiiIi.iiiiiiiiIIiii((String)laborShop.getSkin()));
        this.IiiiiiiiIIIII.setText(String.valueOf(laborShop.getMoney()));
        this.iiiIiiiiiiIIi();
        this.iIiIiiiiIiIii.setText("1");
        this.ALLATORIxDEMO().iIiIiiiiIIiIi(this.iIiIiiiiIIiii());
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (!this.iiIIiiiiIiIIi.iIiIiiiiIIiii()) return;
        this.iiiIiiiiiiIIi();
    }

    public ActivityFC ALLATORIxDEMO() {
        return this.iiiiIiiiIiiII;
    }

    public iIiIIiiiIIiIi(GameView gameView) {
        super(144, 2, IiiiIiiiiIiIi.iIIIIiiiiiIIi, gameView);
        this.ALLATORIxDEMO(-1, 0, 426, 462, IiiiIiiiiIiIi.iIIiIiiiiiiIi);
        this.iiiIiiiiiiIIi("sc/b/S335.png");
        this.IiIiiiiiIIIII = IiIIIiiiiIIiI.ALLATORIxDEMO((int)170, (int)319, (int)75, (int)16, (int)10, (Color)iiIIiiiiIiiII.ALLATORIxDEMO((String)"#c62584C"), (Font)iiIIiiiiIiiII.iIiIiiiiiiIIi);
        this.IiIIIiiiiIiiI = IiIIIiiiiIIiI.ALLATORIxDEMO((int)170, (int)349, (int)75, (int)16, (int)10, (Color)iiIIiiiiIiiII.ALLATORIxDEMO((String)"#c62584C"), (Font)iiIIiiiiIiiII.iIiIiiiiiiIIi);
        this.ALLATORIxDEMO = IiIIIiiiiIIiI.ALLATORIxDEMO((int)170, (int)379, (int)75, (int)16, (int)10, (Color)iiIIiiiiIiiII.ALLATORIxDEMO((String)"#c62584C"), (Font)iiIIiiiiIiiII.iIiIiiiiiiIIi);
        this.IiIiiiiiIIIII.setText("\u8d2d\u4e70\u6570\u91cf");
        this.add(this.IiIiiiiiIIIII);
        this.add(this.IiIIIiiiiIiiI);
        this.add(this.ALLATORIxDEMO);
        this.iIiIiiiiIiIii = IiIIIiiiiIIiI.ALLATORIxDEMO((Font)iiIIiiiiIiiII.iiIiiiiiiiiiI, (Color)Color.white);
        this.iIiIiiiiIiIii.setBounds(250, 317, 144, 20);
        this.iiiIiiiiiiiIi = new IIiIIiiiIIIiI(15, this.iIiIiiiiIiIii, (IiiiIiiiiIiIi)this);
        this.iiIiiiiiiiIii = IiIIIiiiiIIiI.ALLATORIxDEMO((int)250, (int)347, (int)144, (int)20, (int)10, (Color)Color.white, (Font)iiIIiiiiIiiII.iiIiiiiiiiiiI);
        this.iiiiIiiiIIiii = IiIIIiiiiIIiI.ALLATORIxDEMO((int)250, (int)377, (int)144, (int)20, (int)10, (Color)Color.white, (Font)iiIIiiiiIiiII.iiIiiiiiiiiiI);
        this.add(this.iIiIiiiiIiIii);
        this.add(this.iiIiiiiiiiIii);
        this.add(this.iiiiIiiiIIiii);
        this.iIIiIiiiiiiIi = IiIIIiiiiIIiI.ALLATORIxDEMO((int)73, (int)20, (int)277, (int)28, (int)0, (Color)Color.white, (Font)iiIIiiiiIiiII.iIiIiiiiiiIIi);
        this.iIiiIiiiiiiII = new IIIiiiiiIiIiI();
        this.iIiiIiiiiiiII.setBounds(150, 77, 120, 120);
        this.IiiiiiiiIIIII = IiIIIiiiiIIiI.ALLATORIxDEMO((int)210, (int)223, (int)144, (int)20, (int)10, (Color)Color.green, (Font)iiIIiiiiIiiII.iiIiIiiiIiiII);
        this.IIIIiiiiiiiII = new com.xy.i.iiIiIiiiiIiii("sc/b/B457.png", 1, 55, (IiiiIiiiiIiIi)this);
        this.IIIIiiiiiiiII.setBounds(346, 420, 68, 36);
        this.add(this.iIIiIiiiiiiIi);
        this.add((Component)this.iIiiIiiiiiiII);
        this.add(this.IiiiiiiiIIIII);
        this.add((Component)this.IIIIiiiiiiiII);
    }

    public void ALLATORIxDEMO(Activity activity, ActivityFC activityFC) {
        iiIiIiiiiIiii IiiiiiiiIIIII;
        this.IIiiIiiiIIiIi = activity;
        this.iiiiIiiiIiiII = activityFC;
        this.iiIIIiiiiiiiI = null;
        this.iiIiIiiiiIIIi = null;
        String IiiiiiiiIIIII2 = null;
        ActivityFCBuy activityFCBuy = (ActivityFCBuy)activityFC.getData();
        ActivityFCBase IiiiiiiiIIIII3 = activityFCBuy.getGains()[0];
        ActivityFCBase IiiiiiiiIIIII4 = activityFCBuy.getUses()[0];
        if (IiiiiiiiIIIII3.getType() == 1) {
            IiiiiiiiIIIII = activity.getPointKey(IiiiiiiiIIIII3.getId());
            this.iIIiIiiiiiiIi.setText(String.valueOf(IiiiiiiiIIIII3.getNum()) + (IiiiiiiiIIIII != null ? IiiiiiiiIIIII.IiiiiiiiIIIII : "\u672a\u77e5\u79ef\u5206"));
            this.iIiiIiiiiiiII.ALLATORIxDEMO(IIiIiiiiIiiIi.iiiiiiiiIIiii((String)"903"));
        } else if (IiiiiiiiIIIII3.getType() == 2) {
            IiiiiiiiIIIII = this.ALLATORIxDEMO().ALLATORIxDEMO(new BigDecimal(IiiiiiiiIIIII3.getId()));
            this.iIIiIiiiiiiIi.setText(IiiiiiiiIIIII != null ? IiiiiiiiIIIII.getGoodsname() : "");
            this.iIiiIiiiiiiII.ALLATORIxDEMO(IIiIiiiiIiiIi.iiiiiiiiIIiii((String)IiiiiiiiIIIII.getSkin()));
        } else if (IiiiiiiiIIIII3.getType() == 3) {
            this.iIIiIiiiiiiIi.setText("\u968f\u673a\u5956\u52b1");
            this.iIiiIiiiiiiII.ALLATORIxDEMO(IIiIiiiiIiiIi.iiiiiiiiIIiii((String)"903"));
        } else if (IiiiiiiiIIIII3.getType() == 4) {
            this.iIIiIiiiiiiIi.setText(String.valueOf(IiiiiiiiIIIII3.getNum()) + IiiiiiiiIIIII3.getKey());
            this.iIiiIiiiiiiII.ALLATORIxDEMO(IIiIiiiiIiiIi.iiiiiiiiIIiii((String)"903"));
        } else {
            this.IiIiiiiiIIIII.setText("");
            this.iIiiIiiiiiiII.iIiIiiiiIIiii();
        }
        if (IiiiiiiiIIIII4.getType() == 1) {
            IiiiiiiiIIIII = activity.getPointKey(IiiiiiiiIIIII4.getId());
            IiiiiiiiIIIII2 = IiiiiiiiIIIII != null ? IiiiiiiiIIIII.IiiiiiiiIIIII : "\u672a\u77e5\u79ef\u5206";
            this.iiIIIiiiiiiiI = new MoneyType(-2, (long)activity.getId() << 32 | (long)IiiiiiiiIIIII4.getId());
        } else if (IiiiiiiiIIIII4.getType() == 4) {
            IiiiiiiiIIIII2 = IiiiiiiiIIIII4.getKey();
            this.iiIIIiiiiiiiI = new MoneyType(ActivityFC.getActivityMoneyKey((String)IiiiiiiiIIIII2), 0L);
            if (this.iiIIIiiiiiiiI.getId() == 0) {
                this.iiIIIiiiiiiiI.setKey(IiiiiiiiIIIII2);
            }
        }
        this.IiIIIiiiiIiiI.setText("\u6d88\u8017" + IiiiiiiiIIIII2);
        this.ALLATORIxDEMO.setText("\u62e5\u6709" + IiiiiiiiIIIII2);
        this.IiiiiiiiIIIII.setText(String.valueOf(IiiiiiiiIIIII4.getNum()));
        this.iiiIiiiiiiIIi();
        this.iIiIiiiiIiIii.setText("1");
        this.ALLATORIxDEMO().iIiIiiiiIIiIi(this.iIiIiiiiIIiii());
    }

    public long ALLATORIxDEMO() {
        return this.iiiIiiiiiiiIi.ALLATORIxDEMO();
    }

    public void iiiIiiiiiiIIi() {
        if (this.iiIiIiiiiIIIi != null) {
            iiIIiiiiIiiII.ALLATORIxDEMO((JLabel)this.iiiiIiiiIIiii, (long)com.xy.i.iiIiIiiiiIiii.ALLATORIxDEMO((LaborShop)this.iiIiIiiiiIIIi, (RoleData)this.ALLATORIxDEMO()).longValue());
            return;
        }
        if (this.iiiiIiiiIiiII == null) return;
        iiIIiiiiIiiII.ALLATORIxDEMO((JLabel)this.iiiiIiiiIIiii, (long)this.ALLATORIxDEMO().getMoney(this.iiIIIiiiiiiiI));
    }

    public Long ALLATORIxDEMO(long number, JTextField textField) {
        if (number == 0L) {
            return null;
        }
        if (number < 0L) {
            return 0L;
        }
        RoleData IiiiiiiiIIIII = this.ALLATORIxDEMO();
        if (this.iiIiIiiiiIIIi != null) {
            long IiiiiiiiIIIII2 = com.xy.i.iiIiIiiiiIiii.ALLATORIxDEMO((LaborShop)this.iiIiIiiiiIIIi, (RoleData)IiiiiiiiIIIII).longValue() / this.iiIiIiiiiIIIi.getMoney();
            if (IiiiiiiiIIIII2 > 999L) {
                IiiiiiiiIIIII2 = 999L;
            }
            if (number <= IiiiiiiiIIIII2) return null;
            return IiiiiiiiIIIII2;
        }
        if (this.iiiiIiiiIiiII == null) return 0L;
        long IiiiiiiiIIIII3 = number;
        ActivityFCBuy IiiiiiiiIIIII4 = (ActivityFCBuy)this.iiiiIiiiIiiII.getData();
        int IiiiiiiiIIIII5 = 0;
        while (IiiiiiiiIIIII5 < IiiiiiiiIIIII4.getUses().length) {
            ActivityFCBase IiiiiiiiIIIII6 = IiiiiiiiIIIII4.getUses()[IiiiiiiiIIIII5];
            if (IiiiiiiiIIIII6.getType() == 1) {
                IiiiiiiiIIIII3 = Math.min(IiiiiiiiIIIII3, IiiiiiiiIIIII.getActivityMoney(this.IIiiIiiiIIiIi.getId(), IiiiiiiiIIIII6.getId()) / IiiiiiiiIIIII6.getNum());
            } else if (IiiiiiiiIIIII6.getType() == 4) {
                MoneyType IiiiiiiiIIIII7 = new MoneyType(ActivityFC.getActivityMoneyKey((String)IiiiiiiiIIIII6.getKey()), 0L);
                if (IiiiiiiiIIIII7.getId() == 0) {
                    IiiiiiiiIIIII7.setKey(IiiiiiiiIIIII6.getKey());
                }
                IiiiiiiiIIIII3 = Math.min(IiiiiiiiIIIII3, IiiiiiiiIIIII.getMoney(IiiiiiiiIIIII7) / IiiiiiiiIIIII6.getNum());
            }
            ++IiiiiiiiIIIII5;
        }
        if (IiiiiiiiIIIII3 > 999L) {
            IiiiiiiiIIIII3 = 999L;
        }
        if (number <= IiiiiiiiIIIII3) return null;
        return IiiiiiiiIIIII3;
    }

    public LaborShop ALLATORIxDEMO() {
        return this.iiIiIiiiiIIIi;
    }
}
