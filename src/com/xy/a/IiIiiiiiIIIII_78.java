/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.IiIIIiiiiIiii
 *  com.xy.a.IiIIIiiiiiiII
 *  com.xy.a.iIIIIiiiiIIII
 *  com.xy.bean.FMBean
 *  com.xy.bean.LoginResult
 *  com.xy.i.IIIIIiiiIIIiI
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.readbean.Shop
 *  com.xy.socket.Agreement
 *  com.xy.text.GameView
 *  com.xy.v.IiiiIiiiiIIII
 *  com.xy.w.IIIIIiiiIiiII
 *  com.xy.w.IIIiiiiiIiIiI
 */
package com.xy.a;

import com.xy.a.IiIIIiiiiIiii;
import com.xy.a.IiIIIiiiiiiII;
import com.xy.a.iIIIIiiiiIIII;
import com.xy.bean.FMBean;
import com.xy.bean.LoginResult;
import com.xy.i.IIIIIiiiIIIiI;
import com.xy.q.IiiiIiiiiIiIi;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.readbean.Shop;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import com.xy.v.IiiiIiiiiIIII;
import com.xy.w.IIIIIiiiIiiII;
import com.xy.w.IIIiiiiiIiIiI;
import java.awt.Component;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JTextField;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class IiIiiiiiIIIII
extends IiiiIiiiiIiIi {
    private IiIIIiiiiiiII IIiiIiiiIIiIi;
    private IiIIIiiiiIiii iIiIiiiiIiIii;
    private IIIIIiiiIIIiI[] IiIIIiiiiIiiI;
    private iIIIIiiiiIIII iiIiiiiiiiIii;
    private int IiiiiiiiIIIII;
    private IIIiiiiiIiIiI[] ALLATORIxDEMO;

    public void IiiIiiiiiiIiI(int type) {
        if (this.IIiiIiiiIIiIi == null) {
            return;
        }
        IiIIIiiiiiiII.iiiIiiiiiiIIi((IiIIIiiiiiiII)this.IIiiIiiiIIiIi, (int)type);
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < IiIIIiiiiiiII.ALLATORIxDEMO((IiIIIiiiiiiII)this.IIiiIiiiIIiIi).length) {
            IiIIIiiiiiiII.ALLATORIxDEMO((IiIIIiiiiiiII)this.IIiiIiiiIIiIi)[IiiiiiiiIIIII].setKeep(IiiiiiiiIIIII == IiIIIiiiiiiII.ALLATORIxDEMO((IiIIIiiiiiiII)this.IIiiIiiiIIiIi));
            ++IiiiiiiiIIIII;
        }
        if (type == 0) {
            this.iIiIiiiiIIiIi(1);
            IiIIIiiiiiiII.ALLATORIxDEMO((IiIIIiiiiiiII)this.IIiiIiiiIIiIi).iIiIiiiiIIiii();
            IiIIIiiiiiiII.ALLATORIxDEMO((IiIIIiiiiiiII)this.IIiiIiiiIIiIi).setVisible(true);
            IiIIIiiiiiiII.iIiIiiiiIIiii((IiIIIiiiiiiII)this.IIiiIiiiIIiIi).setVisible(false);
            return;
        }
        if (type != 1) return;
        IiIIIiiiiiiII.ALLATORIxDEMO((IiIIIiiiiiiII)this.IIiiIiiiIIiIi)[0].iIiIiiiiIIiii();
        IiIIIiiiiiiII.ALLATORIxDEMO((IiIIIiiiiiiII)this.IIiiIiiiIIiIi)[1].iIiIiiiiIIiii();
        IiIIIiiiiiiII.ALLATORIxDEMO((IiIIIiiiiiiII)this.IIiiIiiiIIiIi)[0].setText("0");
        IiIIIiiiiiiII.ALLATORIxDEMO((IiIIIiiiiiiII)this.IIiiIiiiIIiIi)[1].setText("0");
        IiIIIiiiiiiII.iIiIiiiiIIiii((IiIIIiiiiiiII)this.IIiiIiiiIIiIi).setVisible(true);
        IiIIIiiiiiiII.ALLATORIxDEMO((IiIIIiiiiiiII)this.IIiiIiiiIIiIi).setVisible(false);
    }

    public void iIiIiiiiIIiIi(int index) {
        ArrayList IiiiiiiiIIIII = (ArrayList)this.ALLATORIxDEMO().ALLATORIxDEMO().getNpcShopMap().get("3001");
        if (IiiiiiiiIIIII == null) {
            IiiiiiiiIIIII = new ArrayList();
        }
        IiIIIiiiiiiII.iIiIiiiiIIiii((IiIIIiiiiiiII)this.IIiiIiiiIIiIi, (int)(1 + (IiiiiiiiIIIII.size() - 1) / 8));
        if (IiIIIiiiiiiII.iiiIiiiiiiIIi((IiIIIiiiiiiII)this.IIiiIiiiIIiIi) <= 0) {
            IiIIIiiiiiiII.iIiIiiiiIIiii((IiIIIiiiiiiII)this.IIiiIiiiIIiIi, (int)1);
        }
        if (index > IiIIIiiiiiiII.iiiIiiiiiiIIi((IiIIIiiiiiiII)this.IIiiIiiiIIiIi)) {
            index = IiIIIiiiiiiII.iiiIiiiiiiIIi((IiIIIiiiiiiII)this.IIiiIiiiIIiIi);
        }
        if (index <= 0) {
            index = 1;
        }
        IiIIIiiiiiiII.ALLATORIxDEMO((IiIIIiiiiiiII)this.IIiiIiiiIIiIi, (int)index);
        int IiiiiiiiIIIII2 = (IiIIIiiiiiiII.iIiIiiiiIIiii((IiIIIiiiiiiII)this.IIiiIiiiIIiIi) - 1) * 8;
        while (IiiiiiiiIIIII2 < IiIIIiiiiiiII.iIiIiiiiIIiii((IiIIIiiiiiiII)this.IIiiIiiiIIiIi) * 8) {
            Shop IiiiiiiiIIIII3 = IiiiiiiiIIIII2 < IiiiiiiiIIIII.size() ? (Shop)IiiiiiiiIIIII.get(IiiiiiiiIIIII2) : null;
            index = IiiiiiiiIIIII2 % 8;
            ++IiiiiiiiIIIII2;
            IiIIIiiiiiiII.ALLATORIxDEMO((IiIIIiiiiiiII)this.IIiiIiiiIIiIi)[index].ALLATORIxDEMO(IiiiiiiiIIIII3);
        }
        IiIIIiiiiiiII.ALLATORIxDEMO((IiIIIiiiiiiII)this.IIiiIiiiIIiIi).setText(String.valueOf(IiIIIiiiiiiII.iIiIiiiiIIiii((IiIIIiiiiiiII)this.IIiiIiiiIIiIi)) + "/" + IiIIIiiiiiiII.iiiIiiiiiiIIi((IiIIIiiiiiiII)this.IIiiIiiiIIiIi));
    }

    public boolean ALLATORIxDEMO(long number, JTextField textField) {
        return true;
    }

    public boolean ALLATORIxDEMO() {
        if (this.iiIiiiiiiiIii == null) return super.ALLATORIxDEMO();
        iIIIIiiiiIIII.ALLATORIxDEMO((iIIIIiiiiIIII)this.iiIiiiiiiiIii, null);
        return super.ALLATORIxDEMO();
    }

    public void iiiIiiiiiiIIi(int id) {
        if (id == 164) {
            String IiiiiiiiIIIII = Agreement.getSendTextAES((String)"fm", (String)"R");
            this.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII);
            return;
        }
        if (id == 167) {
            this.iIiIiiiiIIiIi(1);
            return;
        }
        if (id == 168) {
            this.iIiIiiiiIIiIi(IiIIIiiiiiiII.iiiIiiiiiiIIi((IiIIIiiiiiiII)this.IIiiIiiiIIiIi));
            return;
        }
        if (id == 169) {
            this.iIiIiiiiIIiIi(IiIIIiiiiiiII.iIiIiiiiIIiii((IiIIIiiiiiiII)this.IIiiIiiiIIiIi) - 1);
            return;
        }
        if (id == 170) {
            this.iIiIiiiiIIiIi(IiIIIiiiiiiII.iIiIiiiiIIiii((IiIIIiiiiiiII)this.IIiiIiiiIIiIi) + 1);
            return;
        }
        if (id == 171) {
            long IiiiiiiiIIIII = IiIIIiiiiiiII.ALLATORIxDEMO((IiIIIiiiiiiII)this.IIiiIiiiIIiIi)[0].ALLATORIxDEMO();
            if (IiiiiiiiIIIII <= 0L) {
                this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u8f93\u5165\u4f60\u8981\u5151\u6362\u7684\u6570\u91cf");
                return;
            }
            String IiiiiiiiIIIII2 = Agreement.getSendTextAES((String)"fm", (String)("D1" + IiiiiiiiIIIII));
            this.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII2);
            return;
        }
        if (id == 172) {
            long IiiiiiiiIIIII = IiIIIiiiiiiII.ALLATORIxDEMO((IiIIIiiiiiiII)this.IIiiIiiiIIiIi)[1].ALLATORIxDEMO();
            if (IiiiiiiiIIIII <= 0L) {
                this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u8f93\u5165\u4f60\u8981\u5151\u6362\u7684\u6570\u91cf");
                return;
            }
            String IiiiiiiiIIIII3 = Agreement.getSendTextAES((String)"fm", (String)("D2" + IiiiiiiiIIIII));
            this.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII3);
            return;
        }
        if (id == 311) {
            this.iiIiiiiiiiIii.ALLATORIxDEMO(iIIIIiiiiIIII.ALLATORIxDEMO((iIIIIiiiiIIII)this.iiIiiiiiiiIii) - 1);
            return;
        }
        if (id != 312) return;
        this.iiIiiiiiiiIii.ALLATORIxDEMO(iIIIIiiiiIIII.ALLATORIxDEMO((iIIIIiiiiIIII)this.iiIiiiiiiiIii) + 1);
    }

    public void iIiIiiiiIIiii(int type) {
        if (type == 1) {
            String IiiiiiiiIIIII = Agreement.getSendTextAES((String)"fm", (String)"");
            this.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII);
            return;
        }
        this.ALLATORIxDEMO(type, (FMBean)null);
    }

    public IiIiiiiiIIIII(GameView gameView) {
        super(114, 2, IiiiIiiiiIiIi.iIIIIiiiiiIIi, gameView);
        this.ALLATORIxDEMO(-1, 0, 620, 479, IiiiIiiiiIiIi.iiIIIiiiiiiiI);
        this.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/1.png", (int)68, (int)68, (int)68, (int)68, (boolean)false), "\u964d\u5996\u4f0f\u9b54");
        this.IiIIIiiiiIiiI = new IIIIIiiiIIIiI[3];
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IiIIIiiiiIiiI.length) {
            this.IiIIIiiiiIiiI[IiiiiiiiIIIII] = new IIIIIiiiIIIiI("sc/e/38.png", 2, 161 + IiiiiiiiIIIII, iiIIiiiiIiiII.IIiiiiiiiIIIi, iiIIiiiiIiiII.IIiiiiiiIiiII, IiiiiiiiIIIII == 0 ? "\u65a9\u5996\u9664\u9b54" : (IiiiiiiiIIIII == 1 ? "\u79ef\u5206\u6392\u540d" : (IiiiiiiiIIIII == 2 ? "\u79ef\u5206\u5546\u57ce" : "")), (IiiiIiiiiIiIi)this);
            this.IiIIIiiiiIiiI[IiiiiiiiIIIII].setOffsetTexts(iiIIiiiiIiiII.IIiiiiiiiIIII);
            this.IiIIIiiiiIiiI[IiiiiiiiIIIII].setBounds(50 + 102 * IiiiiiiiIIIII, 18, 95, 33);
            this.add((Component)this.IiIIIiiiiIiiI[IiiiiiiiIIIII++]);
        }
        this.ALLATORIxDEMO = new IIIiiiiiIiIiI[1];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.ALLATORIxDEMO.length) {
            this.ALLATORIxDEMO[IiiiiiiiIIIII] = new IIIiiiiiIiIiI();
            if (IiiiiiiiIIIII == 0) {
                this.ALLATORIxDEMO[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/35.png", (int)80, (int)10, (int)80, (int)10, (boolean)false));
                this.ALLATORIxDEMO[IiiiiiiiIIIII].setBounds(30, 32, 560, 20);
            }
            this.add((Component)this.ALLATORIxDEMO[IiiiiiiiIIIII++]);
        }
        if (this.iiIiiiiiiiIii == null) {
            this.iiIiiiiiiiIii = new iIIIIiiiiIIII(this);
            this.add((Component)this.iiIiiiiiiiIii, 1);
        }
        if (this.iIiIiiiiIiIii == null) {
            this.iIiIiiiiIiIii = new IiIIIiiiiIiii(this);
            this.add((Component)this.iIiIiiiiIiIii, 1);
        }
        if (this.IIiiIiiiIIiIi != null) return;
        this.IIiiIiiiIIiIi = new IiIIIiiiiiiII(this);
        this.add((Component)this.IIiiIiiiIIiIi, 1);
    }

    public void ALLATORIxDEMO(long number, JTextField textField) {
        if (textField != IiIIIiiiiiiII.ALLATORIxDEMO((IiIIIiiiiiiII)this.IIiiIiiiIIiIi)[0]) {
            if (textField != IiIIIiiiiiiII.ALLATORIxDEMO((IiIIIiiiiiiII)this.IIiiIiiiIIiIi)[1]) return;
            iiIIiiiiIiiII.ALLATORIxDEMO((JLabel)IiIIIiiiiiiII.ALLATORIxDEMO((IiIIIiiiiiiII)this.IIiiIiiiIIiIi)[1], (long)(20L * number));
            return;
        }
        LoginResult loginResult = this.ALLATORIxDEMO().getLoginResult();
        int IiiiiiiiIIIII = loginResult.getTurnAround();
        int IiiiiiiiIIIII2 = IiiiIiiiiIIII.ALLATORIxDEMO((int)loginResult.getGrade());
        long IiiiiiiiIIIII3 = IiiiiiiiIIIII <= 3 ? this.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII, IiiiiiiiIIIII2) : 6000000000L;
        IiiiiiiiIIIII3 = (long)((double)IiiiiiiiIIIII3 * 0.002);
        iiIIiiiiIiiII.ALLATORIxDEMO((JLabel)IiIIIiiiiiiII.ALLATORIxDEMO((IiIIIiiiiiiII)this.IIiiIiiiIIiIi)[0], (long)(IiiiiiiiIIIII3 * number));
    }

    public void ALLATORIxDEMO(int type, FMBean fmBean) {
        this.IiiiiiiiIIIII = type;
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IiIIIiiiiIiiI.length) {
            this.IiIIIiiiiIiiI[IiiiiiiiIIIII].setKeep(IiiiiiiiIIIII == this.IiiiiiiiIIIII);
            ++IiiiiiiiIIIII;
        }
        if (type == 0) {
            if (this.iiIiiiiiiiIii == null) {
                this.iiIiiiiiiiIii = new iIIIIiiiiIIII(this);
                this.add((Component)this.iiIiiiiiiiIii, 1);
            }
            if (iIIIIiiiiIIII.ALLATORIxDEMO((iIIIIiiiiIIII)this.iiIiiiiiiiIii) == null && iIIIIiiiiIIII.ALLATORIxDEMO((iIIIIiiiiIIII)this.iiIiiiiiiiIii) != null) {
                this.iiIiiiiiiiIii.ALLATORIxDEMO(iIIIIiiiiIIII.ALLATORIxDEMO((iIIIIiiiiIIII)this.iiIiiiiiiiIii));
            }
            this.iiIiiiiiiiIii.ALLATORIxDEMO(0);
            this.iiIiiiiiiiIii.setVisible(true);
            if (this.iIiIiiiiIiIii != null) {
                this.iIiIiiiiIiIii.setVisible(false);
            }
            if (this.IIiiIiiiIIiIi == null) return;
            this.IIiiIiiiIIiIi.setVisible(false);
            return;
        }
        if (type == 1) {
            if (this.iIiIiiiiIiIii == null) {
                this.iIiIiiiiIiIii = new IiIIIiiiiIiii(this);
                this.add((Component)this.iIiIiiiiIiIii, 1);
            }
            this.iIiIiiiiIiIii.ALLATORIxDEMO(fmBean);
            this.iIiIiiiiIiIii.setVisible(true);
            if (this.iiIiiiiiiiIii != null) {
                this.iiIiiiiiiiIii.setVisible(false);
            }
            if (this.IIiiIiiiIIiIi == null) return;
            this.IIiiIiiiIIiIi.setVisible(false);
            return;
        }
        if (type != 2) return;
        if (this.IIiiIiiiIIiIi == null) {
            this.IIiiIiiiIIiIi = new IiIIIiiiiiiII(this);
            this.add((Component)this.IIiiIiiiIIiIi, 1);
        }
        this.IIiiIiiiIIiIi.ALLATORIxDEMO();
        this.IiiIiiiiiiIiI(0);
        this.IIiiIiiiIIiIi.setVisible(true);
        if (this.iiIiiiiiiiIii != null) {
            this.iiIiiiiiiiIii.setVisible(false);
        }
        if (this.iIiIiiiiIiIii == null) return;
        this.iIiIiiiiIiIii.setVisible(false);
    }

    public Long ALLATORIxDEMO(long number, JTextField textField) {
        if (number < 0L) {
            return 0L;
        }
        long IiiiiiiiIIIII = this.ALLATORIxDEMO().getMoney(IiIIIiiiiiiII.ALLATORIxDEMO((IiIIIiiiiiiII)this.IIiiIiiiIIiIi));
        if (number <= IiiiiiiiIIIII) return null;
        return IiiiiiiiIIIII;
    }

    public void iIiIiiiiIIiii() {
        this.iIiIiiiiIIiii(0);
        super.iIiIiiiiIIiii();
    }
}
