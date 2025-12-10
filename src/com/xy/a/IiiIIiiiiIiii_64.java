/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.IIIiiiiiiiiIi
 *  com.xy.a.iIIiiiiiIIIIi
 *  com.xy.bean.LoginResult
 *  com.xy.bean.PalacePkBean
 *  com.xy.i.IIIIIiiiIIIiI
 *  com.xy.q.IIiIIiiiIIIiI
 *  com.xy.q.IiIIIiiiiIIiI
 *  com.xy.q.IiiiIiiiiIiII
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.richtext.RichLabel
 *  com.xy.socket.Agreement
 *  com.xy.text.GameView
 *  com.xy.v.IIiiIiiiiIIiI
 *  com.xy.v.iiIiiiiiIIiii
 *  com.xy.w.IIIIIiiiIiiII
 *  com.xy.w.IIIiiiiiIiIiI
 *  com.xy.w.IIiIiiiiIIiii
 */
package com.xy.a;

import com.xy.a.IIIiiiiiiiiIi;
import com.xy.a.iIIiiiiiIIIIi;
import com.xy.bean.LoginResult;
import com.xy.bean.PalacePkBean;
import com.xy.i.IIIIIiiiIIIiI;
import com.xy.q.IIiIIiiiIIIiI;
import com.xy.q.IiIIIiiiiIIiI;
import com.xy.q.IiiiIiiiiIiII;
import com.xy.q.IiiiIiiiiIiIi;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.richtext.RichLabel;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import com.xy.v.IIiiIiiiiIIiI;
import com.xy.v.iiIiiiiiIIiii;
import com.xy.w.IIIIIiiiIiiII;
import com.xy.w.IIIiiiiiIiIiI;
import com.xy.w.IIiIiiiiIIiii;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.MouseListener;
import java.math.BigDecimal;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class IiiIIiiiiIiii
extends IiiiIiiiiIiIi {
    private JTextArea iIIiIiiiiiiIi;
    private IIIiiiiiIiIiI IIIIiiiiiiiII;
    private JLabel[] iiIIIiiiiiiiI;
    private IIIIIiiiIIIiI[] IiIiiiiiIIIII;
    private IIIiiiiiiiiIi[] iiIiIiiiiIIIi;
    private PalacePkBean iiiiIiiiIiiII;
    private IiiiIiiiiIiII[] iiiIiiiiiiiIi;
    private RichLabel[] iIiiIiiiiiiII;
    private long IIiiIiiiIIiIi = 0L;
    private IIiIIiiiIIIiI iIiIiiiiIiIii;
    private IIIiiiiiIiIiI IiIIIiiiiIiiI;
    private long iiIiiiiiiiIii = 0L;
    private int IiiiiiiiIIIII;
    private long ALLATORIxDEMO = 0L;

    public boolean ALLATORIxDEMO(long number, JTextField textField) {
        return true;
    }

    static /* synthetic */ IIIiiiiiiiiIi[] ALLATORIxDEMO(IiiIIiiiiIiii arg0) {
        return arg0.iiIiIiiiiIIIi;
    }

    static /* synthetic */ long iiiIiiiiiiIIi(IiiIIiiiiIiii arg0) {
        return arg0.IIiiIiiiIIiIi;
    }

    public void ALLATORIxDEMO(long number, JTextField textField) {
        if (this.IiiiiiiiIIIII != 0) {
            if (this.IiiiiiiiIIIII != 1) return;
        }
        if (IIIiiiiiiiiIi.ALLATORIxDEMO((IIIiiiiiiiiIi)this.iiIiIiiiiIIIi[3])) {
            this.iiIiiiiiiiIii = number;
            this.iiIIIiiiiiiiI[8].setText("\u6d88\u8017\u91d1\u94b1\uff1a" + number + "\u4e24");
            return;
        }
        if (IIIiiiiiiiiIi.ALLATORIxDEMO((IIIiiiiiiiiIi)this.iiIiIiiiiIIIi[4])) {
            this.ALLATORIxDEMO = number;
            this.iiIIIiiiiiiiI[9].setText("\u6d88\u8017\u4ed9\u7389\uff1a" + number + "\u4ed9\u7389");
            return;
        }
        if (!IIIiiiiiiiiIi.ALLATORIxDEMO((IIIiiiiiiiiIi)this.iiIiIiiiiIIIi[5])) return;
        this.IIiiIiiiIIiIi = number;
        this.iiIIIiiiiiiiI[10].setText("\u6d88\u8017\u7ecf\u9a8c\uff1a" + number + "\u7ecf\u9a8c");
    }

    static /* synthetic */ void iiiIiiiiiiIIi(IiiIIiiiiIiii arg0, long arg1) {
        arg0.IIiiIiiiIIiIi = arg1;
    }

    public void ALLATORIxDEMO(int type, PalacePkBean palacePkBean) {
        IiiIIiiiiIiii iiiIIiiiiIiii;
        this.IiiiiiiiIIIII = type;
        this.iiiiIiiiIiiII = palacePkBean;
        this.iIIiIiiiiiiIi.setText("");
        this.iiIIIiiiiiiiI[7].setText("");
        this.IIiiIiiiIIiIi = 0L;
        this.ALLATORIxDEMO = 0L;
        this.iiIiiiiiiiIii = 0L;
        this.iiIIIiiiiiiiI[8].setText("\u6d88\u8017\u91d1\u94b1\uff1a0\u4e24");
        this.iiIIIiiiiiiiI[9].setText("\u6d88\u8017\u4ed9\u7389\uff1a0\u4ed9\u7389");
        this.iiIIIiiiiiiiI[10].setText("\u6d88\u8017\u7ecf\u9a8c\uff1a0\u7ecf\u9a8c");
        this.iiiIiiiiiiiIi[0].setVisible(false);
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iiIiIiiiiIIIi.length) {
            this.iiIiIiiiiIIIi[IiiiiiiiIIIII++].ALLATORIxDEMO(true);
        }
        if (this.IiiiiiiiIIIII == 0) {
            IiiIIiiiiIiii iiiIIiiiiIiii2 = this;
            IiiIIiiiiIiii iiiIIiiiiIiii3 = this;
            iiiIIiiiiIiii = iiiIIiiiiIiii2;
            iiiIIiiiiIiii3.iiIIIiiiiiiiI[0].setText("\u8f93\u5165\u51b3\u6597\u5bf9\u8c61\u540d\u5b57\uff1a");
            iiiIIiiiiIiii2.iiiIiiiiiiiIi[0].setText("");
            iiiIIiiiiIiii3.iiiIiiiiiiiIi[0].setVisible(true);
            iiiIIiiiiIiii2.iiiIiiiiiiiIi[1].setEditable(true);
            iiiIIiiiiIiii3.iiIiIiiiiIIIi[3].ALLATORIxDEMO(false);
            iiiIIiiiiIiii2.iiIiIiiiiIIIi[4].ALLATORIxDEMO(false);
            iiiIIiiiiIiii3.iiIiIiiiiIIIi[5].ALLATORIxDEMO(false);
            iiiIIiiiiIiii2.IiIiiiiiIIIII[0].setText("\u786e \u8ba4");
            iiiIIiiiiIiii3.IiIiiiiiIIIII[1].setText("\u53d6 \u6d88");
        } else if (this.IiiiiiiiIIIII == 1) {
            iiiIIiiiiIiii = this;
            this.iiIIIiiiiiiiI[0].setText("\u6311\u6218\u6210\u529f\u8005\u5347\u4e3a\u64c2\u4e3b");
            this.iiiIiiiiiiiIi[1].setEditable(true);
            this.iiIiIiiiiIIIi[3].ALLATORIxDEMO(false);
            this.iiIiIiiiiIIIi[4].ALLATORIxDEMO(false);
            this.iiIiIiiiiIIIi[5].ALLATORIxDEMO(false);
            this.IiIiiiiiIIIII[0].setText("\u786e \u8ba4");
            this.IiIiiiiiIIIII[1].setText("\u53d6 \u6d88");
        } else if (this.IiiiiiiiIIIII == 2) {
            iiiIIiiiiIiii = this;
            this.iiiIiiiiiiiIi[1].setEditable(false);
            this.iiIIIiiiiiiiI[0].setText("\u3010" + palacePkBean.getUsername() + "\u3011\u73a9\u5bb6\u5411\u4f60\u4e0b\u8fbe\u4e86\u6218\u4e66");
            this.IiIiiiiiIIIII[0].setText("\u63a5\u53d7\u6311\u6218");
            this.IiIiiiiiIIIII[1].setText("\u8ba4\u6002\u6295\u964d");
        } else {
            if (this.IiiiiiiiIIIII == 3) {
                this.iiiIiiiiiiiIi[1].setEditable(false);
                this.iiIIIiiiiiiiI[0].setText("\u6311\u6218\u6210\u529f\u8005\u5347\u4e3a\u64c2\u4e3b");
                this.IiIiiiiiIIIII[0].setText("\u63a5\u53d7\u6311\u6218");
                this.IiIiiiiiIIIII[1].setText("\u8ba4\u6002\u6295\u964d");
            }
            iiiIIiiiiIiii = this;
        }
        if (iiiIIiiiiIiii.IiiiiiiiIIIII == 2 || this.IiiiiiiiIIIII == 3) {
            this.iiIiiiiiiiIii = palacePkBean.getGold() != null ? palacePkBean.getGold().longValue() : 0L;
            this.ALLATORIxDEMO = palacePkBean.getXianyu() != null ? palacePkBean.getXianyu().longValue() : 0L;
            this.IIiiIiiiIIiIi = palacePkBean.getExp() != null ? palacePkBean.getExp().longValue() : 0L;
            this.iiIIIiiiiiiiI[8].setText("\u6d88\u8017\u91d1\u94b1\uff1a" + this.iiIiiiiiiiIii + "\u4e24");
            this.iiIIIiiiiiiiI[9].setText("\u6d88\u8017\u4ed9\u7389\uff1a" + this.ALLATORIxDEMO + "\u4ed9\u7389");
            this.iiIIIiiiiiiiI[10].setText("\u6d88\u8017\u7ecf\u9a8c\uff1a" + this.IIiiIiiiIIiIi + "\u7ecf\u9a8c");
        }
        this.iiiIiiiiiiiIi[1].setText("");
        this.ALLATORIxDEMO().iIiIiiiiIIiIi(this.iIiIiiiiIIiii());
    }

    static /* synthetic */ long iIiIiiiiIIiii(IiiIIiiiiIiii arg0) {
        return arg0.ALLATORIxDEMO;
    }

    public void iIiIiiiiIIiii(int id) {
        if (id == 156) {
            Object IiiiiiiiIIIII;
            if (this.iiIIiiiiIiIIi.ALLATORIxDEMO()) {
                return;
            }
            LoginResult IiiiiiiiIIIII2 = this.ALLATORIxDEMO().getLoginResult();
            String IiiiiiiiIIIII3 = this.iiiIiiiiiiiIi[0].getText().trim();
            String IiiiiiiiIIIII4 = this.iIIiIiiiiiiIi.getText().trim();
            if (this.iiIiiiiiiiIii < 10000000L && this.ALLATORIxDEMO < 1000L) {
                this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u5927\u8bdd\u5e01\u6700\u4f4e\u4e0b\u6ce8\u91d1\u989d\uff1a 1\u5343\u4e07\u5927\u8bdd\u5e01\u3002\u6216\u8005\u4ed9\u7389\u6700\u4f4e\u4e0b\u6ce8\u91d1\u989d\uff1a 1000\u4ed9\u7389\u3002");
                return;
            }
            if (this.iiIiiiiiiiIii > IiiiiiiiIIIII2.getGold().longValue()) {
                this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u5927\u8bdd\u5e01\u4e0d\u8db3\u4ee5\u652f\u4ed8\u6295\u5165\u91d1\u989d");
                return;
            }
            if (this.ALLATORIxDEMO > IiiiiiiiIIIII2.getCodecard().longValue()) {
                this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u4ed9\u7389\u4e0d\u8db3\u4ee5\u652f\u4ed8\u6295\u5165\u4ed9\u7389");
                return;
            }
            if (this.IIiiIiiiIIiIi > IiiiiiiiIIIII2.getExperience().longValue()) {
                this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u7ecf\u9a8c\u4e0d\u8db3\u4ee5\u652f\u4ed8\u6295\u5165\u7ecf\u9a8c");
                return;
            }
            long IiiiiiiiIIIII5 = this.iiIiiiiiiiIii;
            long IiiiiiiiIIIII6 = this.ALLATORIxDEMO;
            if (IIIiiiiiiiiIi.ALLATORIxDEMO((IIIiiiiiiiiIi)this.iiIiIiiiiIIIi[1]) && (IiiiiiiiIIIII5 += 20000000L) > IiiiiiiiIIIII2.getGold().longValue()) {
                this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u5927\u8bdd\u5e01\u4e0d\u8db3\u4ee5\u652f\u4ed8\u5168\u670d\u516c\u544a\u91d1\u989d");
                return;
            }
            if ((IiiiiiiiIIIII5 += 2000000L) > IiiiiiiiIIIII2.getGold().longValue()) {
                this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u5927\u8bdd\u5e01\u4e0d\u8db3\u4ee5\u6218\u4e66\u8d39\u7528");
                return;
            }
            if (IIIiiiiiiiiIi.ALLATORIxDEMO((IIIiiiiiiiiIi)this.iiIiIiiiiIIIi[2]) && (IiiiiiiiIIIII6 += 100L) > IiiiiiiiIIIII2.getCodecard().longValue()) {
                this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u4ed9\u7389\u4e0d\u8db3\u4ee5\u652f\u4ed8\u94c3\u94db\u91d1\u989d");
                return;
            }
            if (this.IiiiiiiiIIIII == 0) {
                if (IIiiIiiiiIIiI.iIiIiiiiIIiIi((String)IiiiiiiiIIIII3)) {
                    this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u8bf7\u8f93\u5165\u60a8\u8981\u6311\u6218\u8005\u7684\u540d\u79f0\u3002");
                    return;
                }
                if (IiiiiiiiIIIII3.equals(IiiiiiiiIIIII2.getRolename())) {
                    this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u60a8\u4e0d\u80fd\u6311\u6218\u81ea\u5df1\uff01\uff01");
                    return;
                }
            } else if (this.IiiiiiiiIIIII == 1) {
                if (this.iiIiiiiiiiIii > 1000000000L) {
                    this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u6700\u9ad8\u4e0b\u6ce8\u91d1\u989d\uff1a 10\u4ebf\u5927\u8bdd\u5e01\u3002");
                    return;
                }
                if (this.ALLATORIxDEMO > 100000L) {
                    this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u4ed9\u7389\u6700\u9ad8\u4e0b\u6ce8\u91d1\u989d\uff1a 10\u4e07\u4ed9\u7389\u3002");
                    return;
                }
            } else if (this.IiiiiiiiIIIII != 2) {
                // empty if block
            }
            PalacePkBean IiiiiiiiIIIII7 = new PalacePkBean();
            if (this.IiiiiiiiIIIII == 0) {
                IiiiiiiiIIIII7.setUsername(IiiiiiiiIIIII3);
                IiiiiiiiIIIII7.setType(0);
            } else if (this.IiiiiiiiIIIII == 1) {
                IiiiiiiiIIIII7.setType(11);
                IiiiiiiiIIIII = (iIIiiiiiIIIIi)this.iiIIiiiiIiIIi.getFormManagement().iiiIiiiiiiIIi(27);
                Long IiiiiiiiIIIII8 = IiiiiiiiIIIII.iIiIiiiiIIiii();
                IiiiiiiiIIIII7.setNtype(IiiiiiiiIIIII8 != null ? IiiiiiiiIIIII8.intValue() : 0);
                if (IiiiiiiiIIIII7.getNtype() < 510 || IiiiiiiiIIIII7.getNtype() > 514) {
                    IiiiiiiiIIIII7.setNtype(510);
                }
            } else if (this.IiiiiiiiIIIII == 2) {
                IiiiiiiiIIIII7.setType(1);
                IiiiiiiiIIIII7.setPId(this.iiiiIiiiIiiII.getPId());
            } else if (this.IiiiiiiiIIIII == 3) {
                IiiiiiiiIIIII7.setType(1);
                IiiiiiiiIIIII7.setPId(this.iiiiIiiiIiiII.getPId());
            }
            IiiiiiiiIIIII7.setGold(new BigDecimal(this.iiIiiiiiiiIii));
            IiiiiiiiIIIII7.setXianyu(new BigDecimal(this.ALLATORIxDEMO));
            IiiiiiiiIIIII7.setExp(new BigDecimal(this.IIiiIiiiIIiIi));
            IiiiiiiiIIIII7.setSendStr(IIIiiiiiiiiIi.ALLATORIxDEMO((IIIiiiiiiiiIi)this.iiIiIiiiiIIIi[2]) ? IiiiiiiiIIIII4 : null);
            IiiiiiiiIIIII7.setChoices(IiiiiiiiIIIII7.getChoices() + ((IIIiiiiiiiiIi.ALLATORIxDEMO((IIIiiiiiiiiIi)this.iiIiIiiiiIIIi[1]) ? 1 : 0) << 0));
            IiiiiiiiIIIII7.setChoices(IiiiiiiiIIIII7.getChoices() + ((IIIiiiiiiiiIi.ALLATORIxDEMO((IIIiiiiiiiiIi)this.iiIiIiiiiIIIi[2]) ? 1 : 0) << 0));
            IiiiiiiiIIIII = Agreement.getSendTextAES((String)"bookofchalg", (String)iiIiiiiiIIiii.ALLATORIxDEMO().toJson(IiiiiiiiIIIII7));
            this.ALLATORIxDEMO().ALLATORIxDEMO((String)IiiiiiiiIIIII);
            return;
        }
        if (id != 157) return;
        if (this.IiiiiiiiIIIII == 2 && this.iiiiIiiiIiiII != null) {
            this.iiiiIiiiIiiII.setType(2);
            String IiiiiiiiIIIII = Agreement.getSendTextAES((String)"bookofchalg", (String)iiIiiiiiIIiii.ALLATORIxDEMO().toJson(this.iiiiIiiiIiiII));
            this.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII);
            this.iiiiIiiiIiiII = null;
        }
        this.ALLATORIxDEMO().iiiIiiiiiiIIi(66);
    }

    static /* synthetic */ void iIiIiiiiIIiii(IiiIIiiiiIiii arg0, long arg1) {
        arg0.iiIiiiiiiiIii = arg1;
    }

    static /* synthetic */ void ALLATORIxDEMO(IiiIIiiiiIiii arg0, long arg1) {
        arg0.ALLATORIxDEMO = arg1;
    }

    public IiiIIiiiiIiii(GameView gameView) {
        super(66, 2, IiiiIiiiiIiIi.iIIIIiiiiiIIi, gameView);
        this.ALLATORIxDEMO(-1, 0, 442, 386, IiiiIiiiiIiIi.iiIIIiiiiiiiI);
        this.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/1.png", (int)68, (int)68, (int)68, (int)68, (boolean)false), "\u51b3\u6597\u4e0b\u6218\u4e66");
        this.IiIiiiiiIIIII = new IIIIIiiiIIIiI[2];
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IiIiiiiiIIIII.length) {
            this.IiIiiiiiIIIII[IiiiiiiiIIIII] = new IIIIIiiiIIIiI("sc/e/26.png", 1, 156 + IiiiiiiiIIIII, iiIIiiiiIiiII.iiiiIiiiIiiII, iiIIiiiiIiiII.IIiiiiiiIiiII, IiiiiiiiIIIII == 0 ? "\u786e \u8ba4" : (IiiiiiiiIIIII == 1 ? "\u53d6 \u6d88" : ""), (IiiiIiiiiIiIi)this);
            this.IiIiiiiiIIIII[IiiiiiiiIIIII].setBounds(112 + 146 * IiiiiiiiIIIII, 340, 99, 25);
            this.add((Component)this.IiIiiiiiIIIII[IiiiiiiiIIIII++]);
        }
        this.iiIIIiiiiiiiI = new JLabel[11];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iiIIIiiiiiiiI.length) {
            this.iiIIIiiiiiiiI[IiiiiiiiIIIII] = IiIIIiiiiIIiI.ALLATORIxDEMO((int)50, (int)28, (int)300, (int)19, (Color)Color.black, (Font)iiIIiiiiIiiII.iIiIiiiiiiIIi);
            this.iiIIIiiiiiiiI[IiiiiiiiIIIII].setText(IiiiiiiiIIIII == 0 ? "\u8f93\u5165\u51b3\u6597\u5bf9\u8c61\u540d\u5b57\uff1a" : (IiiiiiiiIIIII == 1 ? "\u6295\u5165" : (IiiiiiiiIIIII == 2 ? "\u4e0b\u6218\u4e66" : (IiiiiiiiIIIII == 3 ? "\u53d1\u9001\u94c3\u94db" : (IiiiiiiiIIIII == 4 ? "\u94f6\u4e24" : (IiiiiiiiIIIII == 5 ? "\u4ed9\u7389" : (IiiiiiiiIIIII == 6 ? "\u4eba\u7269\u7ecf\u9a8c" : (IiiiiiiiIIIII == 7 ? "\u5355\u4f4d" : (IiiiiiiiIIIII == 8 ? "\u6d88\u8017\u91d1\u94b1\uff1a0\u4e24" : (IiiiiiiiIIIII == 9 ? "\u6d88\u8017\u4ed9\u7389\uff1a0\u4ed9\u7389" : (IiiiiiiiIIIII == 10 ? "\u6d88\u8017\u7ecf\u9a8c\uff1a0\u7ecf\u9a8c" : "")))))))))));
            this.iiIIIiiiiiiiI[IiiiiiiiIIIII].setHorizontalAlignment(10);
            this.add(this.iiIIIiiiiiiiI[IiiiiiiiIIIII]);
            if (IiiiiiiiIIIII == 0) {
                this.iiIIIiiiiiiiI[IiiiiiiiIIIII].setFont(iiIIiiiiIiiII.iiiiIiiiIiiII);
            } else if (IiiiiiiiIIIII == 1) {
                this.iiIIIiiiiiiiI[IiiiiiiiIIIII].setBounds(85, 65, 36, 17);
            } else if (IiiiiiiiIIIII == 2) {
                this.iiIIIiiiiiiiI[IiiiiiiiIIIII].setBounds(85, 159, 54, 17);
            } else if (IiiiiiiiIIIII == 3) {
                this.iiIIIiiiiiiiI[IiiiiiiiIIIII].setBounds(85, 182, 72, 17);
            } else if (IiiiiiiiIIIII >= 4 && IiiiiiiiIIIII <= 6) {
                this.iiIIIiiiiiiiI[IiiiiiiiIIIII].setBounds(106 + (IiiiiiiiIIIII - 4) * 80, 89, 72, 17);
            } else if (IiiiiiiiIIIII == 7) {
                this.iiIIIiiiiiiiI[IiiiiiiiIIIII].setFont(iiIIiiiiIiiII.IiiiiiiiIIIII);
                this.iiIIIiiiiiiiI[IiiiiiiiIIIII].setBounds(192, 112, 40, 19);
            } else if (IiiiiiiiIIIII >= 8 && IiiiiiiiIIIII <= 10) {
                this.iiIIIiiiiiiiI[IiiiiiiiIIIII].setForeground(Color.red);
                this.iiIIIiiiiiiiI[IiiiiiiiIIIII].setFont(iiIIiiiiIiiII.iiIiiiiiiIIiI);
                this.iiIIIiiiiiiiI[IiiiiiiiIIIII].setBounds(233, 111 + (IiiiiiiiIIIII - 8) * 16, 200, 14);
            }
            ++IiiiiiiiIIIII;
        }
        this.iIiiIiiiiiiII = new RichLabel[3];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iIiiIiiiiiiII.length) {
            if (IiiiiiiiIIIII == 0) {
                this.iIiiIiiiiiiII[IiiiiiiiIIIII] = new RichLabel(null, iiIIiiiiIiiII.iIIiiiiiiIIII);
                this.iIiiIiiiiiiII[IiiiiiiiIIIII].setTextSize("#c000000(\u6218\u4e66\u5c06\u516c\u544a\u5168\u670d,#cFF0000\u82b1\u8d395,000,000\u4e24#c000000)", 230);
                this.iIiiIiiiiiiII[IiiiiiiiIIIII].setBounds(134, 156, this.iIiiIiiiiiiII[IiiiiiiiIIIII].getWidth(), this.iIiiIiiiiiiII[IiiiiiiiIIIII].getHeight());
            } else if (IiiiiiiiIIIII == 1) {
                this.iIiiIiiiiiiII[IiiiiiiiIIIII] = new RichLabel(null, iiIIiiiiIiiII.iIIiiiiiiIIII);
                this.iIiiIiiiiiiII[IiiiiiiiIIIII].setTextSize("#c000000(\u52fe\u9009\u540e\u6263\u9664#cFF0000100\u4ed9\u7389#c000000)", 230);
                this.iIiiIiiiiiiII[IiiiiiiiIIIII].setBounds(151, 179, this.iIiiIiiiiiiII[IiiiiiiiIIIII].getWidth(), this.iIiiIiiiiiiII[IiiiiiiiIIIII].getHeight());
            } else if (IiiiiiiiIIIII == 2) {
                this.iIiiIiiiiiiII[IiiiiiiiIIIII] = new RichLabel(null, iiIIiiiiIiiII.IiiiiiiiIIIII);
                this.iIiiIiiiiiiII[IiiiiiiiIIIII].setTextSize("#c000000\u51b3\u6597\u8b66\u793a\uff1a#r1\u3001\u4e0b\u6ce8\u91d1\u989d\u5c06\u5168\u989d\u5f52\u5c5e\u51b3\u6597\u80dc\u65b9\u3002#r2\u3001\u4e0b\u6ce8\u7ecf\u9a8c\u5728\u51b3\u6597\u7ed3\u675f\u540e\uff0c\u5931\u8d25\u65b9\u635f\u5931\u6240\u4e0b\u6ce8\u7684\u7ecf\u9a8c\u3002", 360);
                this.iIiiIiiiiiiII[IiiiiiiiIIIII].setBounds(55, 279, this.iIiiIiiiiiiII[IiiiiiiiIIIII].getWidth(), this.iIiiIiiiiiiII[IiiiiiiiIIIII].getHeight());
            }
            this.add((Component)this.iIiiIiiiiiiII[IiiiiiiiIIIII++]);
        }
        this.iiiIiiiiiiiIi = new IiiiIiiiiIiII[2];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iiiIiiiiiiiIi.length) {
            this.iiiIiiiiiiiIi[IiiiiiiiIIIII] = IiIIIiiiiIIiI.ALLATORIxDEMO((IIiIiiiiIIiii)IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/17.png", (int)6, (int)6, (int)6, (int)6, (boolean)false), (Font)iiIIiiiiIiiII.iIIIiiiiIIIii, (Color)Color.white);
            this.iiiIiiiiiiiIi[IiiiiiiiIIIII].setBounds(203, 28, 132, 19);
            this.add((Component)this.iiiIiiiiiiiIi[IiiiiiiiIIIII]);
            if (IiiiiiiiIIIII == 1) {
                this.iiiIiiiiiiiIi[IiiiiiiiIIIII].setBounds(86, 112, 104, 19);
            } else if (IiiiiiiiIIIII == 2) {
                this.iiiIiiiiiiiIi[IiiiiiiiIIIII].setBounds(77, 205, 324, 49);
            }
            ++IiiiiiiiIIIII;
        }
        this.iIiIiiiiIiIii = new IIiIIiiiIIIiI(15, (JTextField)this.iiiIiiiiiiiIi[1], (IiiiIiiiiIiIi)this);
        this.IIIIiiiiiiiII = new IIIiiiiiIiIiI(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/17.png", (int)6, (int)6, (int)6, (int)6, (boolean)false));
        this.iIIiIiiiiiiIi = IiIIIiiiiIIiI.ALLATORIxDEMO((Font)iiIIiiiiIiiII.iIIIiiiiIIIii, (Color)Color.white);
        this.iIIiIiiiiiiIi.setBounds(79, 207, 320, 45);
        this.IIIIiiiiiiiII.setBounds(77, 205, 324, 49);
        this.add(this.iIIiIiiiiiiIi);
        this.add((Component)this.IIIIiiiiiiiII);
        this.iiIiIiiiiIIIi = new IIIiiiiiiiiIi[6];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iiIiIiiiiIIIi.length) {
            this.iiIiIiiiiIIIi[IiiiiiiiIIIII] = new IIIiiiiiiiiIi(this);
            IIIiiiiiiiiIi.ALLATORIxDEMO((IIIiiiiiiiiIi)this.iiIiIiiiiIIIi[IiiiiiiiIIIII], (int)IiiiiiiiIIIII);
            IIIiiiiiIiIiI IiiiiiiiIIIII2 = new IIIiiiiiIiIiI();
            if (IiiiiiiiIIIII == 0) {
                IiiiiiiiIIIII2.setBounds(66, 65, 17, 17);
            } else if (IiiiiiiiIIIII == 1) {
                IiiiiiiiIIIII2.setBounds(66, 158, 17, 17);
            } else if (IiiiiiiiIIIII == 2) {
                IiiiiiiiIIIII2.setBounds(66, 182, 17, 17);
            } else {
                IiiiiiiiIIIII2.setBounds(86 + 80 * (IiiiiiiiIIIII - 3), 89, 18, 18);
            }
            IIIiiiiiiiiIi.ALLATORIxDEMO((IIIiiiiiiiiIi)this.iiIiIiiiiIIIi[IiiiiiiiIIIII], (IIIiiiiiIiIiI)IiiiiiiiIIIII2);
            this.iiIiIiiiiIIIi[IiiiiiiiIIIII].ALLATORIxDEMO(IiiiiiiiIIIII < 4);
            IiiiiiiiIIIII2.addMouseListener((MouseListener)this.iiIiIiiiiIIIi[IiiiiiiiIIIII++]);
            this.add((Component)IiiiiiiiIIIII2);
        }
        this.IiIIIiiiiIiiI = new IIIiiiiiIiIiI(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/36.png", (int)20, (int)20, (int)20, (int)20, (boolean)false));
        this.IiIIIiiiiIiiI.setBounds(54, 54, 360, 226);
        this.add((Component)this.IiIIIiiiiIiiI);
    }

    static /* synthetic */ long ALLATORIxDEMO(IiiIIiiiiIiii arg0) {
        return arg0.iiIiiiiiiiIii;
    }

    static /* synthetic */ IiiiIiiiiIiII[] ALLATORIxDEMO(IiiIIiiiiIiii arg0) {
        return arg0.iiiIiiiiiiiIi;
    }

    static /* synthetic */ JLabel[] ALLATORIxDEMO(IiiIIiiiiIiii arg0) {
        return arg0.iiIIIiiiiiiiI;
    }

    static /* synthetic */ int ALLATORIxDEMO(IiiIIiiiiIiii arg0) {
        return arg0.IiiiiiiiIIIII;
    }

    public Long ALLATORIxDEMO(long number, JTextField textField) {
        if (number < 0L) {
            return 0L;
        }
        if (this.IiiiiiiiIIIII != 0) {
            if (this.IiiiiiiiIIIII != 1) return 0L;
        }
        LoginResult IiiiiiiiIIIII = this.ALLATORIxDEMO().getLoginResult();
        if (IIIiiiiiiiiIi.ALLATORIxDEMO((IIIiiiiiiiiIi)this.iiIiIiiiiIIIi[3])) {
            if (number <= IiiiiiiiIIIII.getGold().longValue()) return null;
            return IiiiiiiiIIIII.getGold().longValue();
        }
        if (IIIiiiiiiiiIi.ALLATORIxDEMO((IIIiiiiiiiiIi)this.iiIiIiiiiIIIi[4])) {
            if (number <= IiiiiiiiIIIII.getCodecard().longValue()) return null;
            return IiiiiiiiIIIII.getCodecard().longValue();
        }
        if (!IIIiiiiiiiiIi.ALLATORIxDEMO((IIIiiiiiiiiIi)this.iiIiIiiiiIIIi[5])) return 0L;
        if (number <= IiiiiiiiIIIII.getExperience().longValue()) return null;
        return IiiiiiiiIIIII.getExperience().longValue();
    }

    public boolean ALLATORIxDEMO() {
        if (this.IiiiiiiiIIIII != 2) return super.ALLATORIxDEMO();
        if (this.iiiiIiiiIiiII == null) return super.ALLATORIxDEMO();
        this.iiiiIiiiIiiII.setType(2);
        String IiiiiiiiIIIII = Agreement.getSendTextAES((String)"bookofchalg", (String)iiIiiiiiIIiii.ALLATORIxDEMO().toJson(this.iiiiIiiiIiiII));
        this.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII);
        this.iiiiIiiiIiiII = null;
        return super.ALLATORIxDEMO();
    }
}
