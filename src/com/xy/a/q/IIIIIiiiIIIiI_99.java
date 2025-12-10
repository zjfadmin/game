/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.q.IiIIIiiiIIiII
 *  com.xy.a.q.iIiIiiiiIiIII
 *  com.xy.a.q.iiIiIiiiiIiii
 *  com.xy.bean.ConfirmBean
 *  com.xy.bean.LoginResult
 *  com.xy.bean.NpcComposeBean
 *  com.xy.bean.SuitOperBean
 *  com.xy.entity.PartJade
 *  com.xy.formula.GoodType
 *  com.xy.formula.MsgUntil
 *  com.xy.game.RoleData
 *  com.xy.i.IIiiIiiiIiiiI
 *  com.xy.i.IiiiiiiiiIIII
 *  com.xy.q.IIIiiiiiIiIiI
 *  com.xy.q.IiIIIiiiiIIiI
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.q.iIIiIiiiIiiIi
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.q.iiIiIiiiiIiIi
 *  com.xy.q.iiiiiiiiiiIiI
 *  com.xy.readbean.Goodstable
 *  com.xy.readbean.MoneyType
 *  com.xy.socket.Agreement
 *  com.xy.socket.ParamTool
 *  com.xy.text.GameView
 *  com.xy.v.IIIIIiiiIiIii
 *  com.xy.v.IIIiiiiiIiIiI
 *  com.xy.v.IIiiIiiiiIIiI
 *  com.xy.v.iiIiiiiiIIiii
 *  com.xy.w.IIIIIiiiIiiII
 *  com.xy.w.IIIiiiiiIiIiI
 */
package com.xy.a.q;

import com.xy.a.q.IiIIIiiiIIiII;
import com.xy.a.q.iIiIiiiiIiIII;
import com.xy.a.q.iiIiIiiiiIiii;
import com.xy.bean.ConfirmBean;
import com.xy.bean.LoginResult;
import com.xy.bean.NpcComposeBean;
import com.xy.bean.SuitOperBean;
import com.xy.entity.PartJade;
import com.xy.formula.GoodType;
import com.xy.formula.MsgUntil;
import com.xy.game.RoleData;
import com.xy.i.IIiiIiiiIiiiI;
import com.xy.i.IiiiiiiiiIIII;
import com.xy.q.IIIiiiiiIiIiI;
import com.xy.q.IiIIIiiiiIIiI;
import com.xy.q.IiiiIiiiiIiIi;
import com.xy.q.iIIiIiiiIiiIi;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.q.iiIiIiiiiIiIi;
import com.xy.q.iiiiiiiiiiIiI;
import com.xy.readbean.Goodstable;
import com.xy.readbean.MoneyType;
import com.xy.socket.Agreement;
import com.xy.socket.ParamTool;
import com.xy.text.GameView;
import com.xy.v.IIIIIiiiIiIii;
import com.xy.v.IIiiIiiiiIIiI;
import com.xy.v.iiIiiiiiIIiii;
import com.xy.w.IIIIIiiiIiiII;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.event.ListSelectionListener;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class IIIIIiiiIIIiI
extends IiiiIiiiiIiIi {
    private DefaultListModel<String> iiiiIiiiIIiii;
    private JScrollPane iIIiIiiiiiiIi;
    private iIiIiiiiIiIII[] IIIIiiiiiiiII;
    private iiIiIiiiiIiIi iiIIIiiiiiiiI;
    Goodstable[] IiIiiiiiIIIII;
    private BigDecimal iiIiIiiiiIIIi;
    private JLabel[] iiiiIiiiIiiII;
    private iiiiiiiiiiIiI iiiIiiiiiiiIi;
    private int iIiiIiiiiiiII = -1;
    private JList<String> IIiiIiiiIIiIi;
    private IIiiIiiiIiiiI[] iIiIiiiiIiIii;
    private IiiiiiiiiIIII IiIIIiiiiIiiI;
    private MoneyType iiIiiiiiiiIii;
    private iIIiIiiiIiiIi[] IiiiiiiiIIIII;
    private com.xy.w.IIIiiiiiIiIiI[] ALLATORIxDEMO;

    public boolean ALLATORIxDEMO(Goodstable[] goods, BigDecimal money, String v, boolean confirm) {
        if (this.ALLATORIxDEMO().getLoginResult().getGold().longValue() < money.longValue()) {
            this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u91d1\u94b1\u4e0d\u8db3");
            return false;
        }
        ArrayList<BigDecimal> IiiiiiiiIIIII = new ArrayList<BigDecimal>();
        int IiiiiiiiIIIII2 = 0;
        int IiiiiiiiIIIII3 = -1;
        int IiiiiiiiIIIII4 = 0;
        while (IiiiiiiiIIIII4 < goods.length) {
            if (goods[IiiiiiiiIIIII4] != null) {
                ++IiiiiiiiIIIII2;
                IiiiiiiiIIIII3 = IiiiiiiiIIIII4;
                if (goods[IiiiiiiiIIIII4].getGoodlock() == 1) {
                    this.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u8be5\u7269\u54c1\u5df2\u88ab\u52a0\u9501");
                    return false;
                }
                int IiiiiiiiIIIII5 = 1;
                int IiiiiiiiIIIII6 = 0;
                while (IiiiiiiiIIIII6 < IiiiiiiiIIIII.size()) {
                    if (goods[IiiiiiiiIIIII4].getRgid().compareTo((BigDecimal)IiiiiiiiIIIII.get(IiiiiiiiIIIII6)) == 0) {
                        ++IiiiiiiiIIIII5;
                    }
                    ++IiiiiiiiIIIII6;
                }
                if (IiiiiiiiIIIII5 > goods[IiiiiiiiIIIII4].getUsetime()) {
                    this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u8bf7\u51d1\u9f50\u7269\u54c1\u518d\u6765");
                    return false;
                }
                IiiiiiiiIIIII.add(goods[IiiiiiiiIIIII4].getRgid());
            }
            ++IiiiiiiiIIIII4;
        }
        if (IiiiiiiiIIIII3 + 1 != IiiiiiiiIIIII2) {
            this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("#Y\u8bf7\u5728\u5f15\u5bfc\u754c\u9762\u67e5\u770b\u516c\u5f0f,\u5982\u679c\u5f15\u5bfc\u754c\u9762\u6ca1\u6709\u5bf9\u5e94\u516c\u5f0f \u8054\u7cfb\u7ba1\u7406\u5458\u8865\u5145");
            return false;
        }
        if (v.equals("\u4f69\u9970\u57f9\u517b")) return this.ALLATORIxDEMO(goods, money, IiiiiiiiIIIII);
        if (v.equals("\u4e00\u952e\u57f9\u517b")) {
            return this.ALLATORIxDEMO(goods, money, IiiiiiiiIIIII);
        }
        if (v.equals("\u79d8\u77f3\u5408\u6210")) return this.ALLATORIxDEMO(goods, money, v, IiiiiiiiIIIII, confirm);
        if (v.equals("\u9020\u578b\u91cd\u94f8")) return this.ALLATORIxDEMO(goods, money, v, IiiiiiiiIIIII, confirm);
        if (v.equals("\u4ed9\u5668\u5206\u89e3")) return this.ALLATORIxDEMO(goods, money, v, IiiiiiiiIIIII, confirm);
        if (v.equals("\u5750\u9a91\u9a6d\u70bc")) return this.ALLATORIxDEMO(goods, money, v, IiiiiiiiIIIII, confirm);
        if (!v.equals("\u5b88\u62a4\u77f3\u5206\u89e3")) return this.ALLATORIxDEMO(goods, money, v, IiiiiiiiIIIII);
        return this.ALLATORIxDEMO(goods, money, v, IiiiiiiiIIIII, confirm);
    }

    public Goodstable[] ALLATORIxDEMO() {
        int IiiiiiiiIIIII;
        if (this.IiIiiiiiIIIII == null) {
            this.IiIiiiiiIIIII = new Goodstable[this.IIIIiiiiiiiII.length];
        } else {
            IiiiiiiiIIIII = 0;
            while (IiiiiiiiIIIII < this.IiIiiiiiIIIII.length) {
                this.IiIiiiiiIIIII[IiiiiiiiIIIII++] = null;
            }
        }
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IiIiiiiiIIIII.length) {
            this.IiIiiiiiIIIII[IiiiiiiiIIIII] = this.IIIIiiiiiiiII[IiiiiiiiIIIII].ALLATORIxDEMO();
            if (this.IiIiiiiiIIIII[IiiiiiiiIIIII] == null) {
                if (iIiIiiiiIiIII.ALLATORIxDEMO((iIiIiiiiIiIII)this.IIIIiiiiiiiII[IiiiiiiiIIIII]).ALLATORIxDEMO() == 0) return this.IiIiiiiiIIIII;
                this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u7269\u54c1\u5df2\u4e0d\u518d\u80cc\u5305");
                return null;
            }
            ++IiiiiiiiIIIII;
        }
        return this.IiIiiiiiIIIII;
    }

    public void ALLATORIxDEMO(Goodstable good, int path) {
        this.IIIIiiiiiiiII[path].ALLATORIxDEMO(good);
        this.iiiIiiiiiiIIi();
    }

    public boolean iiiIiiiiiiIIi(String formula, Goodstable[] goods, boolean confirm) {
        if (formula.equals("\u70bc\u5316\u88c5\u5907") || formula.equals("\u70bc\u5316\u4ed9\u5668") || formula.equals("\u70bc\u5316\u795e\u5175")) {
            iiIiIiiiiIiii IiiiiiiiIIIII = (iiIiIiiiiIiii)this.ALLATORIxDEMO().iIiIiiiiIIiii(11);
            if (IiiiiiiiIIIII != null) {
                if (IiiiiiiiIIIII.ALLATORIxDEMO(0, goods[0].getRgid())) return this.ALLATORIxDEMO(IiiiiiiiIIIII, goods, this.iiIiIiiiiIIIi, 4);
            }
            String IiiiiiiiIIIII2 = GoodType.getExtra((String)goods[0].getValue(), (String)"\u70bc\u5316\u5c5e\u6027");
            if (IiiiiiiiIIIII == null) {
                IiiiiiiiIIIII = (iiIiIiiiiIiii)this.ALLATORIxDEMO().iiiIiiiiiiIIi(11);
            }
            IiiiiiiiIIIII.ALLATORIxDEMO(goods[0].getRgid(), IiiiiiiiIIIII2, 0, true);
            return false;
        }
        if (!formula.equals("\u88c5\u5907\u57f9\u517b") && !formula.equals("\u88c5\u5907\u5347\u7ea7")) {
            if (!formula.equals("\u88c5\u5907\u91cd\u94f8")) return this.ALLATORIxDEMO(goods, this.iiIiIiiiiIIIi, formula, confirm);
        }
        if (this.ALLATORIxDEMO().getLoginResult().getGold().longValue() < this.iiIiIiiiiIIIi.longValue()) {
            this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u91d1\u94b1\u4e0d\u8db3");
            return false;
        }
        this.ALLATORIxDEMO(goods, formula);
        return true;
    }

    public boolean ALLATORIxDEMO(int path) {
        if (this.IIIIiiiiiiiII[path].ALLATORIxDEMO() == null) return false;
        return true;
    }

    public int iiiIiiiiiiIIi() {
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IIIIiiiiiiiII.length) {
            if (this.IIIIiiiiiiiII[IiiiiiiiIIIII].isVisible() && iIiIiiiiIiIII.ALLATORIxDEMO((iIiIiiiiIiIII)this.IIIIiiiiiiiII[IiiiiiiiIIIII]).ALLATORIxDEMO() != 1) {
                return IiiiiiiiIIIII;
            }
            ++IiiiiiiiIIIII;
        }
        return -1;
    }

    public void iIiIiiiiIIiii(int type) {
        this.iIiIiiiiIIiIi();
        if (this.iIiiIiiiiiiII == type) {
            return;
        }
        this.iIiiIiiiiiiII = type;
        this.iiiiIiiiIIiii.removeAllElements();
        if (type == 0) {
            this.iiiiIiiiIIiii.addElement("\u70bc\u5316\u88c5\u5907");
            this.iiiiIiiiIIiii.addElement("\u70bc\u5316\u4ed9\u5668");
            if (this.ALLATORIxDEMO().gameType == 2) {
                if (!this.ALLATORIxDEMO().ALLATORIxDEMO(2, 3)) {
                    this.iiiiIiiiIIiii.addElement("\u70bc\u5316\u795e\u5175");
                }
                if (!this.ALLATORIxDEMO().ALLATORIxDEMO(2, 3)) {
                    this.iiiiIiiiIIiii.addElement("\u88c5\u5907\u6253\u9020");
                }
                this.iiiiIiiiIIiii.addElement("\u88c5\u5907\u5deb\u94f8");
            }
            this.iiiiIiiiIIiii.addElement("\u9020\u578b\u91cd\u94f8");
            this.iiiiIiiiIIiii.addElement("\u4f19\u4f34\u88c5\u5907\u5347\u7ea7");
            this.iiiiIiiiIIiii.addElement("\u4f19\u4f34\u88c5\u5907\u91cd\u94f8");
            this.iiiiIiiiIIiii.addElement("\u4f19\u4f34\u88c5\u5907\u57f9\u517b");
            if (this.ALLATORIxDEMO().gameMount) {
                this.iiiiIiiiIIiii.addElement("\u5750\u9a91\u767e\u70bc\u4e39");
            }
        } else if (type == 1) {
            this.iiiiIiiiIIiii.addElement("\u4f69\u9970\u57f9\u517b");
            this.iiiiIiiiIIiii.addElement("\u4f69\u9970\u91cd\u94f8");
            this.iiiiIiiiIIiii.addElement("\u62a4\u8eab\u7b26\u57f9\u517b");
            this.iiiiIiiiIIiii.addElement("\u62a4\u8eab\u7b26\u91cd\u94f8");
            this.iiiiIiiiIIiii.addElement("\u5f69\u6676\u77f3\u57f9\u517b");
            this.iiiiIiiiIIiii.addElement("\u914d\u9970\u70b9\u7cb9");
            this.iiiiIiiiIIiii.addElement("\u914d\u9970\u7cb9\u70bc");
            this.iiiiIiiiIIiii.addElement("\u914d\u9970\u7cb9\u53d6");
            this.iiiiIiiiIIiii.addElement("\u914d\u9970\u70bc\u5408");
            this.iiiiIiiiIIiii.addElement("\u914d\u9970\u5206\u89e3");
            if (this.ALLATORIxDEMO().gameType == 2) {
                this.iiiiIiiiIIiii.addElement("\u4ed9\u5668\u5206\u89e3");
            }
            if (this.ALLATORIxDEMO().gameMount) {
                this.iiiiIiiiIIiii.addElement("\u5b88\u62a4\u77f3\u5206\u89e3");
            }
        } else if (type == 2) {
            this.iiiiIiiiIIiii.addElement("\u5f00\u5149");
            this.iiiiIiiiIIiii.addElement("\u70bc\u5668");
            this.iiiiIiiiIIiii.addElement("\u6e05\u9664\u70bc\u5668");
        }
        this.iIiIiiiiIIiIi(null);
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IIIIiiiiiiiII.length) {
            if (type == 2) {
                if (IiiiiiiiIIIII < 4) {
                    this.IIIIiiiiiiiII[IiiiiiiiIIIII].setBounds(248 + IiiiiiiiIIIII % 2 * 67, 75 + IiiiiiiiIIIII / 2 * 65, 59, 58);
                } else if (IiiiiiiiIIIII == 4) {
                    this.IIIIiiiiiiiII[IiiiiiiiIIIII].setBounds(382, 108, 59, 58);
                }
                if (IiiiiiiiIIIII > 4) {
                    this.IIIIiiiiiiiII[IiiiiiiiIIIII].setVisible(false);
                }
            } else {
                this.IIIIiiiiiiiII[IiiiiiiiIIIII].setBounds(248 + IiiiiiiiIIIII % 3 * 67, 75 + IiiiiiiiIIIII / 3 * 65, 59, 58);
                if (IiiiiiiiIIIII >= 4) {
                    this.IIIIiiiiiiiII[IiiiiiiiIIIII].setVisible(true);
                }
            }
            this.IIIIiiiiiiiII[IiiiiiiiIIIII++].ALLATORIxDEMO(null);
        }
        this.iiiIiiiiiiIIi();
    }

    public boolean ALLATORIxDEMO(iiIiIiiiiIiii valueView, Goodstable[] goods, BigDecimal money, int type) {
        RoleData IiiiiiiiIIIII = this.ALLATORIxDEMO();
        LoginResult IiiiiiiiIIIII2 = IiiiiiiiIIIII.getLoginResult();
        int IiiiiiiiIIIII3 = 0;
        int IiiiiiiiIIIII4 = 0;
        if (type == 4 || type == 1) {
            IiiiiiiiIIIII3 = valueView.iIiIiiiiIIiIi();
            IiiiiiiiIIIII4 = IiiiiiiiIIIII3 % 10;
            IiiiiiiiIIIII3 /= 10;
        }
        int IiiiiiiiIIIII5 = type == 4 ? valueView.iiiIiiiiiiIIi() : 0;
        BigDecimal IiiiiiiiIIIII6 = null;
        if (IiiiiiiiIIIII2.getGold().longValue() < money.longValue()) {
            this.iiIIiiiiIiIIi.iIiIiiiiIIiii("#Y\u91d1\u94b1\u4e0d\u8db3");
            return false;
        }
        if (this.ALLATORIxDEMO().ALLATORIxDEMO(2, 7)) {
            if (IiiiiiiiIIIII4 > 2) {
                this.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u6700\u591a\u53ea\u80fd\u9501\u5b9a2\u4e2a");
                return false;
            }
            if (IiiiiiiiIIIII4 == 1 && type == 4) {
                IiiiiiiiIIIII6 = new BigDecimal(1000);
            } else if (IiiiiiiiIIIII4 == 2 && type == 4) {
                IiiiiiiiIIIII6 = new BigDecimal(2500);
            }
            if (IiiiiiiiIIIII6 != null && IiiiiiiiIIIII2.getCodecard().longValue() < IiiiiiiiIIIII6.longValue()) {
                this.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u4ed9\u7389\u4e0d\u8db3");
                return false;
            }
        } else {
            if (IiiiiiiiIIIII4 > 3) {
                this.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u6700\u591a\u53ea\u80fd\u9501\u5b9a3\u4e2a");
                return false;
            }
            if (IiiiiiiiIIIII4 > 0) {
                if (IiiiiiiiIIIII4 == 1) {
                    IiiiiiiiIIIII6 = type == 4 ? new BigDecimal(100) : new BigDecimal(1000);
                } else if (IiiiiiiiIIIII4 == 2) {
                    IiiiiiiiIIIII6 = type == 4 ? new BigDecimal(500) : new BigDecimal(3000);
                } else if (IiiiiiiiIIIII4 == 3) {
                    IiiiiiiiIIIII6 = type == 4 ? new BigDecimal(2500) : new BigDecimal(6000);
                }
            }
            if (type == 4 && IiiiiiiiIIIII5 == 1) {
                IiiiiiiiIIIII6 = IiiiiiiiIIIII6 == null ? new BigDecimal(10000) : IiiiiiiiIIIII6.add(new BigDecimal(10000));
            }
            if (IiiiiiiiIIIII6 != null && IiiiiiiiIIIII2.getSavegold().longValue() < IiiiiiiiIIIII6.longValue()) {
                this.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u7ed1\u7389\u4e0d\u8db3");
                return false;
            }
        }
        ArrayList<BigDecimal> IiiiiiiiIIIII7 = new ArrayList<BigDecimal>();
        int IiiiiiiiIIIII8 = 0;
        int IiiiiiiiIIIII9 = -1;
        int IiiiiiiiIIIII10 = 0;
        while (IiiiiiiiIIIII10 < goods.length) {
            if (goods[IiiiiiiiIIIII10] != null) {
                IiiiiiiiIIIII9 = IiiiiiiiIIIII10;
                ++IiiiiiiiIIIII8;
                if (goods[IiiiiiiiIIIII10].getGoodlock() == 1) {
                    this.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u8be5\u7269\u54c1\u5df2\u88ab\u52a0\u9501");
                    return false;
                }
                int IiiiiiiiIIIII11 = 1;
                int IiiiiiiiIIIII12 = 0;
                while (IiiiiiiiIIIII12 < IiiiiiiiIIIII7.size()) {
                    if (goods[IiiiiiiiIIIII10].getRgid().compareTo((BigDecimal)IiiiiiiiIIIII7.get(IiiiiiiiIIIII12)) == 0) {
                        ++IiiiiiiiIIIII11;
                    }
                    ++IiiiiiiiIIIII12;
                }
                if (IiiiiiiiIIIII11 > goods[IiiiiiiiIIIII10].getUsetime()) {
                    this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u8bf7\u51d1\u9f50\u7269\u54c1\u518d\u6765");
                    return false;
                }
                IiiiiiiiIIIII7.add(goods[IiiiiiiiIIIII10].getRgid());
            }
            ++IiiiiiiiIIIII10;
        }
        if (IiiiiiiiIIIII9 + 1 != IiiiiiiiIIIII8) {
            this.iiIIiiiiIiIIi.iIiIiiiiIIiii("#Y\u8bf7\u5728\u5f15\u5bfc\u754c\u9762\u67e5\u770b\u516c\u5f0f,\u5982\u679c\u5f15\u5bfc\u754c\u9762\u6ca1\u6709\u5bf9\u5e94\u516c\u5f0f \u8054\u7cfb\u7ba1\u7406\u5458\u8865\u5145");
            return false;
        }
        SuitOperBean IiiiiiiiIIIII22 = new SuitOperBean();
        if (type == 0) {
            String[] IiiiiiiiIIIII13;
            if (IiiiiiiiIIIII8 != 2) {
                this.iiIIiiiiIiIIi.iIiIiiiiIIiii("#Y\u8bf7\u5728\u5f15\u5bfc\u754c\u9762\u67e5\u770b\u516c\u5f0f,\u5982\u679c\u5f15\u5bfc\u754c\u9762\u6ca1\u6709\u5bf9\u5e94\u516c\u5f0f \u8054\u7cfb\u7ba1\u7406\u5458\u8865\u5145");
                return false;
            }
            String IiiiiiiiIIIII14 = GoodType.getExtra((String)goods[0].getValue(), (String)"\u70bc\u5668\u5c5e\u6027");
            if (IiiiiiiiIIIII14 != null && Integer.parseInt((IiiiiiiiIIIII13 = IiiiiiiiIIIII14.split("&"))[1]) >= 5) {
                this.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u6700\u5927\u5f00\u5149\u6b21\u65705");
                return false;
            }
            IiiiiiiiIIIII22.setType(10);
        } else if (type == 1) {
            if (IiiiiiiiIIIII8 != 4) {
                this.iiIIiiiiIiIIi.iIiIiiiiIIiii("#Y\u8bf7\u5728\u5f15\u5bfc\u754c\u9762\u67e5\u770b\u516c\u5f0f,\u5982\u679c\u5f15\u5bfc\u754c\u9762\u6ca1\u6709\u5bf9\u5e94\u516c\u5f0f \u8054\u7cfb\u7ba1\u7406\u5458\u8865\u5145");
                return false;
            }
            String IiiiiiiiIIIII15 = GoodType.getExtra((String)goods[0].getValue(), (String)"\u70bc\u5668\u5c5e\u6027");
            if (IiiiiiiiIIIII15 == null) {
                this.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u5148\u53bb\u5f00\u5149");
                return false;
            }
            IiiiiiiiIIIII22.setType(11);
        } else if (type == 3) {
            if (IiiiiiiiIIIII8 != 1) {
                this.iiIIiiiiIiIIi.iIiIiiiiIIiii("#Y\u8bf7\u5728\u5f15\u5bfc\u754c\u9762\u67e5\u770b\u516c\u5f0f,\u5982\u679c\u5f15\u5bfc\u754c\u9762\u6ca1\u6709\u5bf9\u5e94\u516c\u5f0f \u8054\u7cfb\u7ba1\u7406\u5458\u8865\u5145");
                return false;
            }
            IiiiiiiiIIIII22.setType(13);
        } else if (type == 4) {
            if (GoodType.getExtra((String)goods[0].getValue(), (String)"\u5957\u88c5\u5c5e\u6027") != null) {
                this.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u5957\u88c5\u65e0\u6cd5\u70bc\u5316");
                return false;
            }
            if (IiiiiiiiIIIII5 == 1 && !GoodType.IIIiiiiiIIIII((long)goods[0].getType()) && !GoodType.iiiiiiiiIIiii((long)goods[0].getType())) {
                this.iiIIiiiiIiIIi.iIiIiiiiIIiii("#Y\u8fd9\u7c7b\u578b\u88c5\u5907\u6682\u65f6\u6ca1\u6709\u5bf9\u5e94\u7684\u7279\u6280");
                return false;
            }
            if (GoodType.iiiIIiiiiIIii((long)goods[0].getType())) {
                String IiiiiiiiIIIII16;
                if (goods[1].getType() == 7005L) {
                    String IiiiiiiiIIIII17 = GoodType.ALLATORIxDEMO((String)goods[1].getValue())[1];
                    if (!IiiiiiiiIIIII17.equals("\u9636\u6570=1")) {
                        this.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u4f7f\u7528\u4e00\u9636\u4f5c\u4e3a\u70bc\u5316\u6750\u6599\u592a\u6389\u4ef7\u4e86\u5417?");
                        return false;
                    }
                } else if (GoodType.iiiIIiiiiIIii((long)goods[1].getType()) && !(IiiiiiiiIIIII16 = GoodType.ALLATORIxDEMO((String)goods[1].getValue())[0]).equals("\u9636\u6570=1")) {
                    this.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u4f7f\u7528\u4e00\u9636\u4f5c\u4e3a\u70bc\u5316\u6750\u6599\u592a\u6389\u4ef7\u4e86\u5417?");
                    return false;
                }
            }
            IiiiiiiiIIIII22.setType(14);
        }
        int IiiiiiiiIIIII18 = 1;
        while (IiiiiiiiIIIII18 < goods.length) {
            if (goods[IiiiiiiiIIIII18] != null) {
                goods[IiiiiiiiIIIII18].ALLATORIxDEMO(1);
                if (goods[IiiiiiiiIIIII18].getUsetime() <= 0) {
                    IiiiiiiiIIIII.iIiIiiiiIIiii(goods[IiiiiiiiIIIII18].getRgid());
                }
            }
            ++IiiiiiiiIIIII18;
        }
        IiiiiiiiIIIII2.setGold(IiiiiiiiIIIII2.getGold().subtract(money));
        if (IiiiiiiiIIIII6 != null) {
            if (this.ALLATORIxDEMO().ALLATORIxDEMO(2, 7)) {
                IiiiiiiiIIIII2.setCodecard(IiiiiiiiIIIII2.getCodecard().subtract(IiiiiiiiIIIII6));
            } else {
                IiiiiiiiIIIII2.setSavegold(IiiiiiiiIIIII2.getSavegold().subtract(IiiiiiiiIIIII6));
            }
            IiiiiiiiIIIII22.setJade(new PartJade((long)IiiiiiiiIIIII3, IiiiiiiiIIIII5));
        }
        IiiiiiiiIIIII22.setGoods(IiiiiiiiIIIII7);
        String IiiiiiiiIIIII32 = Agreement.getSendTextAES((String)"suitoperate", (String)iiIiiiiiIIiii.ALLATORIxDEMO().toJson(IiiiiiiiIIIII22));
        this.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII32);
        return true;
    }

    public void iIiIiiiiIIiii(Goodstable good) {
        block14: {
            Goodstable IiiiiiiiIIIII;
            int IiiiiiiiIIIII2;
            block12: {
                int IiiiiiiiIIIII3;
                block13: {
                    if (this.iIiiIiiiiiiII != 2) break block12;
                    if (!GoodType.IIIiiiiiIIIII((long)good.getType())) break block13;
                    this.IIIIiiiiiiiII[0].ALLATORIxDEMO(good);
                    break block14;
                }
                if (good.getType() != 505L && good.getType() != 507L || (IiiiiiiiIIIII3 = this.iiiIiiiiiiIIi()) <= 0) break block14;
                this.IIIIiiiiiiiII[IiiiiiiiIIIII3].ALLATORIxDEMO(good);
                break block14;
            }
            boolean IiiiiiiiIIIII4 = true;
            if (good.getType() >= 497L && good.getType() <= 499L) {
                IiiiiiiiIIIII2 = 1;
                if (good.getType() == 497L) {
                    IiiiiiiiIIIII2 = 1;
                } else if (good.getType() == 499L) {
                    IiiiiiiiIIIII2 = 2;
                } else if (good.getType() == 498L) {
                    IiiiiiiiIIIII2 = 3;
                }
                IiiiiiiiIIIII = this.IIIIiiiiiiiII[IiiiiiiiIIIII2].ALLATORIxDEMO();
                if (IiiiiiiiIIIII == null) {
                    this.IIIIiiiiiiiII[IiiiiiiiIIIII2].ALLATORIxDEMO(good);
                    IiiiiiiiIIIII4 = false;
                } else if (IiiiiiiiIIIII.getType() != good.getType()) {
                    this.IIIIiiiiiiiII[IiiiiiiiIIIII2].ALLATORIxDEMO(good);
                    IiiiiiiiIIIII4 = false;
                }
            }
            if (IiiiiiiiIIIII4) {
                IiiiiiiiIIIII2 = 0;
                while (IiiiiiiiIIIII2 < this.IIIIiiiiiiiII.length) {
                    IiiiiiiiIIIII = this.IIIIiiiiiiiII[IiiiiiiiIIIII2].ALLATORIxDEMO();
                    if (IiiiiiiiIIIII == null) {
                        this.IIIIiiiiiiiII[IiiiiiiiIIIII2].ALLATORIxDEMO(good);
                        break;
                    }
                    ++IiiiiiiiIIIII2;
                }
            }
        }
        this.iiiIiiiiiiIIi();
    }

    public boolean iIiIiiiiIIiii(String formula, Goodstable[] goods, boolean confirm) {
        if (!formula.equals("\u914d\u9970\u70b9\u7cb9") && !formula.equals("\u914d\u9970\u7cb9\u70bc")) {
            if (formula.equals("\u914d\u9970\u5206\u89e3")) return this.ALLATORIxDEMO(goods, this.iiIiIiiiiIIIi, formula);
            if (formula.equals("\u914d\u9970\u7cb9\u53d6")) return this.ALLATORIxDEMO(goods, this.iiIiIiiiiIIIi, formula);
            if (!formula.equals("\u914d\u9970\u70bc\u5408")) return this.ALLATORIxDEMO(goods, this.iiIiIiiiiIIIi, formula, confirm);
            return this.ALLATORIxDEMO(goods, this.iiIiIiiiiIIIi, formula);
        }
        int IiiiiiiiIIIII = formula.equals("\u914d\u9970\u70b9\u7cb9") ? 5 : 6;
        iiIiIiiiiIiii IiiiiiiiIIIII2 = (iiIiIiiiiIiii)this.ALLATORIxDEMO().iIiIiiiiIIiii(11);
        if (IiiiiiiiIIIII2 != null) {
            if (IiiiiiiiIIIII2.ALLATORIxDEMO(IiiiiiiiIIIII, goods[0].getRgid())) return this.ALLATORIxDEMO(goods, this.iiIiIiiiiIIIi, formula);
        }
        String IiiiiiiiIIIII3 = GoodType.getExtra((String)goods[0].getValue(), (String)GoodType.Extras[8]);
        if (IiiiiiiiIIIII == 5) {
            if (IIIIIiiiIiIii.ALLATORIxDEMO((String)goods[0].getValue(), (String)"\u7b49\u7ea7=", (String)"|") != 7L) {
                this.iiIIiiiiIiIIi.iIiIiiiiIIiii("7\u7ea7\u914d\u9970\u624d\u80fd\u70b9\u7cb9");
                return false;
            }
        } else if (IiiiiiiiIIIII3 == null) {
            this.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u6709\u70b9\u7cb9\u5c5e\u6027\u624d\u80fd\u7cb9\u70bc");
            return false;
        }
        if (IiiiiiiiIIIII2 == null) {
            IiiiiiiiIIIII2 = (iiIiIiiiiIiii)this.ALLATORIxDEMO().iiiIiiiiiiIIi(11);
        }
        IiiiiiiiIIIII2.ALLATORIxDEMO(goods[0].getRgid(), IiiiiiiiIIIII3, IiiiiiiiIIIII, false);
        return false;
    }

    public BigDecimal ALLATORIxDEMO() {
        return this.iiIiIiiiiIIIi;
    }

    /*
     * Unable to fully structure code
     */
    public boolean ALLATORIxDEMO(Goodstable[] goods, BigDecimal money, String v) {
        block29: {
            block31: {
                block30: {
                    block28: {
                        IiiiiiiiIIIII = this.ALLATORIxDEMO();
                        IiiiiiiiIIIII = IiiiiiiiIIIII.getLoginResult();
                        if (IiiiiiiiIIIII.getGold().longValue() < money.longValue()) {
                            this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u91d1\u94b1\u4e0d\u8db3");
                            return false;
                        }
                        IiiiiiiiIIIII = new ArrayList<BigDecimal>();
                        IiiiiiiiIIIII = 0;
                        IiiiiiiiIIIII = -1;
                        IiiiiiiiIIIII = 0;
                        while (IiiiiiiiIIIII < goods.length) {
                            if (goods[IiiiiiiiIIIII] != null) {
                                IiiiiiiiIIIII = IiiiiiiiIIIII;
                                ++IiiiiiiiIIIII;
                                if (goods[IiiiiiiiIIIII].getGoodlock() == 1) {
                                    this.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u8be5\u7269\u54c1\u5df2\u88ab\u52a0\u9501");
                                    return false;
                                }
                                IiiiiiiiIIIII = 1;
                                IiiiiiiiIIIII = 0;
                                while (IiiiiiiiIIIII < IiiiiiiiIIIII.size()) {
                                    if (goods[IiiiiiiiIIIII].getRgid().compareTo((BigDecimal)IiiiiiiiIIIII.get(IiiiiiiiIIIII)) == 0) {
                                        ++IiiiiiiiIIIII;
                                    }
                                    ++IiiiiiiiIIIII;
                                }
                                if (IiiiiiiiIIIII > goods[IiiiiiiiIIIII].getUsetime()) {
                                    this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u8bf7\u51d1\u9f50\u7269\u54c1\u518d\u6765");
                                    return false;
                                }
                                IiiiiiiiIIIII.add(goods[IiiiiiiiIIIII].getRgid());
                            }
                            ++IiiiiiiiIIIII;
                        }
                        if (IiiiiiiiIIIII + 1 != IiiiiiiiIIIII) {
                            this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("#Y\u8bf7\u5728\u5f15\u5bfc\u754c\u9762\u67e5\u770b\u516c\u5f0f,\u5982\u679c\u5f15\u5bfc\u754c\u9762\u6ca1\u6709\u5bf9\u5e94\u516c\u5f0f \u8054\u7cfb\u7ba1\u7406\u5458\u8865\u5145");
                            return false;
                        }
                        IiiiiiiiIIIII = 1;
                        IiiiiiiiIIIII = new SuitOperBean();
                        if (!v.equals("\u914d\u9970\u70b9\u7cb9")) break block28;
                        IiiiiiiiIIIII.setType(81);
                        if (IIIIIiiiIiIii.ALLATORIxDEMO((String)goods[0].getValue(), (String)"\u7b49\u7ea7=", (String)"|") != 7L) {
                            this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u9700\u89817\u7ea7\u914d\u9970\u624d\u80fd\u70b9\u7cb9");
                            return false;
                        }
                        break block29;
                    }
                    if (!v.equals("\u914d\u9970\u7cb9\u70bc")) break block30;
                    IiiiiiiiIIIII.setType(82);
                    IiiiiiiiIIIII = IIIIIiiiIiIii.ALLATORIxDEMO((String)goods[0].getValue(), (String)"\u70b9\u7cb9\u5c5e\u6027&", (String)"|");
                    if (IiiiiiiiIIIII == null) {
                        this.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u6709\u70b9\u7cb9\u5c5e\u6027\u624d\u80fd\u7cb9\u70bc");
                        return false;
                    }
                    IiiiiiiiIIIII = IiiiiiiiIIIII.indexOf("&");
                    IiiiiiiiIIIII = IiiiiiiiIIIII != -1 ? Integer.parseInt(IiiiiiiiIIIII.substring(0, IiiiiiiiIIIII)) : 33;
                    IiiiiiiiIIIII = IiiiiiiiIIIII >> 5 & 31;
                    IiiiiiiiIIIII = IiiiiiiiIIIII & 31;
                    IiiiiiiiIIIII = 1 + IiiiiiiiIIIII / 8 + IiiiiiiiIIIII / 8;
                    break block29;
                }
                if (!v.equals("\u914d\u9970\u5206\u89e3")) break block31;
                IiiiiiiiIIIII.setType(83);
                IiiiiiiiIIIII = 0;
                if (true) ** GOTO lbl97
            }
            if (v.equals("\u914d\u9970\u7cb9\u53d6")) {
                IiiiiiiiIIIII.setType(84);
                if (IIIIIiiiIiIii.ALLATORIxDEMO((String)goods[0].getValue(), (String)"\u7b49\u7ea7=", (String)"|") != 7L) {
                    this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u9700\u89817\u7ea7\u914d\u9970\u624d\u80fd\u7cb9\u53d6");
                    return false;
                }
                if (IIIIIiiiIiIii.ALLATORIxDEMO((String)goods[0].getValue(), (String)GoodType.Extras[8], (String)"|") == null) {
                    this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u914d\u9970\u6ca1\u6709\u70b9\u7cb9\u5c5e\u6027\u65e0\u6cd5\u7cb9\u53d6");
                    return false;
                }
                if (IIIIIiiiIiIii.ALLATORIxDEMO((String)goods[1].getValue(), (String)GoodType.Extras[8], (String)"|") != null) {
                    this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u7cb9\u7389\u7ed3\u6676\u5df2\u6709\u70b9\u7cb9\u5c5e\u6027\u65e0\u6cd5\u7cb9\u53d6");
                    return false;
                }
            } else if (v.equals("\u914d\u9970\u70bc\u5408")) {
                IiiiiiiiIIIII.setType(85);
                if (IIIIIiiiIiIii.ALLATORIxDEMO((String)goods[0].getValue(), (String)GoodType.Extras[8], (String)"|") == null) {
                    this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u7cb9\u7389\u7ed3\u6676\u6ca1\u6709\u70b9\u7cb9\u5c5e\u6027\u65e0\u6cd5\u7cb9\u53d6");
                    return false;
                }
                if (IIIIIiiiIiIii.ALLATORIxDEMO((String)goods[1].getValue(), (String)"\u7b49\u7ea7=", (String)"|") != 7L) {
                    this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u9700\u89817\u7ea7\u914d\u9970\u624d\u80fd\u7cb9\u53d6");
                    return false;
                }
                IiiiiiiiIIIII = goods[0].getValue();
                IiiiiiiiIIIII = IiiiiiiiIIIII != null && IiiiiiiiIIIII.equals("") == false ? IiiiiiiiIIIII.indexOf("|") : -1;
                v0 = IiiiiiiiIIIII = IiiiiiiiIIIII != -1 ? IiiiiiiiIIIII.substring(0, IiiiiiiiIIIII) : null;
                if (IiiiiiiiIIIII == null || !IiiiiiiiIIIII.equals(GoodType.ALLATORIxDEMO((long)goods[1].getType()))) {
                    this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u8fd9\u4e2a\u914d\u9970\u4e0d\u9002\u5408\u8fd9\u4e2a\u7c7b\u578b\u7684\u7cb9\u7389\u7ed3\u6676");
                    return false;
                }
            }
            break block29;
            do {
                if (goods[IiiiiiiiIIIII] != null) {
                    if (IIIIIiiiIiIii.ALLATORIxDEMO((String)goods[IiiiiiiiIIIII].getValue(), (String)"\u7b49\u7ea7=", (String)"|") < 4L) {
                        this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u6700\u5c11\u9700\u89814\u7ea7\u914d\u9970\u624d\u80fd\u5206\u89e3");
                        return false;
                    }
                    if (IIIIIiiiIiIii.ALLATORIxDEMO((String)goods[IiiiiiiiIIIII].getValue(), (String)GoodType.Extras[8], (String)"|") != null) {
                        this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u914d\u9970\u5df2\u6709\u70b9\u7cb9\u5c5e\u6027\u65e0\u6cd5\u5206\u89e3");
                        return false;
                    }
                }
                ++IiiiiiiiIIIII;
lbl97:
                // 2 sources

            } while (IiiiiiiiIIIII < goods.length);
        }
        IiiiiiiiIIIII = IiiiiiiiIIIII != 1 ? 1 : goods.length;
        while (IiiiiiiiIIIII < goods.length) {
            if (goods[IiiiiiiiIIIII] != null && goods[IiiiiiiiIIIII].getUsetime() < IiiiiiiiIIIII) {
                this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u8bf7\u51d1\u9f50\u7269\u54c1\u518d\u6765");
                return false;
            }
            ++IiiiiiiiIIIII;
        }
        IiiiiiiiIIIII.setGold(IiiiiiiiIIIII.getGold().subtract(money));
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < goods.length) {
            if (goods[IiiiiiiiIIIII] != null && (IiiiiiiiIIIII != 0 || IiiiiiiiIIIII.getType() != 81 && IiiiiiiiIIIII.getType() != 82 && IiiiiiiiIIIII.getType() != 84)) {
                goods[IiiiiiiiIIIII].ALLATORIxDEMO(IiiiiiiiIIIII == 0 ? 1 : IiiiiiiiIIIII);
                if (goods[IiiiiiiiIIIII].getUsetime() <= 0) {
                    IiiiiiiiIIIII.iIiIiiiiIIiii(goods[IiiiiiiiIIIII].getRgid());
                    this.IIIIiiiiiiiII[IiiiiiiiIIIII].ALLATORIxDEMO(null);
                }
            }
            ++IiiiiiiiIIIII;
        }
        IiiiiiiiIIIII.setGoods(IiiiiiiiIIIII);
        IiiiiiiiIIIII = Agreement.getSendTextAES((String)"suitoperate", (String)iiIiiiiiIIiii.ALLATORIxDEMO().toJson(IiiiiiiiIIIII));
        this.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII);
        return true;
    }

    public boolean ALLATORIxDEMO(Goodstable[] goods, BigDecimal money, List<BigDecimal> rgids) {
        PartJade IiiiiiiiIIIII;
        RoleData IiiiiiiiIIIII2 = this.ALLATORIxDEMO();
        LoginResult IiiiiiiiIIIII3 = IiiiiiiiIIIII2.getLoginResult();
        int IiiiiiiiIIIII4 = goods[1].getUsetime();
        long IiiiiiiiIIIII5 = IiiiiiiiIIIII3.getGold().longValue();
        if (IiiiiiiiIIIII5 / money.longValue() < (long)IiiiiiiiIIIII4) {
            IiiiiiiiIIIII4 = (int)(IiiiiiiiIIIII5 / money.longValue());
        }
        int IiiiiiiiIIIII6 = 0;
        String[] IiiiiiiiIIIII7 = goods[0].getValue().split("\\|");
        if (MsgUntil.getGoodLvl((String)IiiiiiiiIIIII7[0]) >= 7) {
            this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u8fd8\u6ca1\u5f00\u653e8\u7ea7\u4f69\u9970\u57f9\u517b");
            return false;
        }
        if (GoodType.iIiIiiiiIIiIi((long)goods[1].getType())) {
            if (this.ALLATORIxDEMO().ALLATORIxDEMO(2, 11)) {
                this.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u526f\u914d\u9970\u53ea\u5141\u8bb8\u4f7f\u7528\u914d\u9970\u7cbe\u534e");
                return false;
            }
            if (MsgUntil.getGoodLvl((String)goods[1].getValue()) >= 2) {
                this.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u526f\u914d\u9970\u5df2\u7ecf\u8fbe\u52302\u7ea7\u4ee5\u4e0a");
                return false;
            }
        }
        int IiiiiiiiIIIII8 = 0;
        int IiiiiiiiIIIII9 = 0;
        while (IiiiiiiiIIIII9 < IiiiiiiiIIIII7.length) {
            if (IiiiiiiiIIIII7[IiiiiiiiIIIII9].length() >= 2 && IiiiiiiiIIIII7[IiiiiiiiIIIII9].substring(0, 2).equals("\u57f9\u517b")) {
                IiiiiiiiIIIII = IiiiiiiiIIIII7[IiiiiiiiIIIII9].split("=")[1].split("/");
                int IiiiiiiiIIIII10 = Integer.parseInt(IiiiiiiiIIIII[0]);
                IiiiiiiiIIIII8 = Integer.parseInt(IiiiiiiiIIIII[1]);
                IiiiiiiiIIIII6 = IiiiiiiiIIIII8 - IiiiiiiiIIIII10 + 1;
            }
            ++IiiiiiiiIIIII9;
        }
        if (IiiiiiiiIIIII8 == 0) {
            this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u8be5\u914d\u9970\u65e0\u6cd5\u57f9\u517b");
            return false;
        }
        if (IiiiiiiiIIIII6 > IiiiiiiiIIIII4) {
            IiiiiiiiIIIII6 = IiiiiiiiIIIII4;
        }
        if (IiiiiiiiIIIII6 <= 0) {
            this.iiIIiiiiIiIIi.iIiIiiiiIIiii("#Y\u8bf7\u51d1\u9f50\u7269\u54c1\u518d\u6765");
            return false;
        }
        money = new BigDecimal(money.longValue() * (long)IiiiiiiiIIIII6);
        if (IiiiiiiiIIIII3.getGold().longValue() < money.longValue()) {
            this.iiIIiiiiIiIIi.iIiIiiiiIIiii("#Y\u91d1\u94b1\u4e0d\u8db3");
            return false;
        }
        this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u4e00\u952e\u57f9\u517b\u4e86" + IiiiiiiiIIIII6 + "\u6b21");
        IiiiiiiiIIIII3.setGold(IiiiiiiiIIIII3.getGold().subtract(money));
        SuitOperBean IiiiiiiiIIIII22 = new SuitOperBean();
        IiiiiiiiIIIII = new PartJade(-1L, -1);
        IiiiiiiiIIIII.setJade1(IiiiiiiiIIIII6);
        IiiiiiiiIIIII22.setType(15);
        goods[0].setUsetime(Integer.valueOf(0));
        IiiiiiiiIIIII2.iIiIiiiiIIiii(goods[0].getRgid());
        this.IIIIiiiiiiiII[0].ALLATORIxDEMO(null);
        goods[1].ALLATORIxDEMO(IiiiiiiiIIIII6);
        if (goods[1].getUsetime() <= 0) {
            IiiiiiiiIIIII2.iIiIiiiiIIiii(goods[1].getRgid());
            this.IIIIiiiiiiiII[1].ALLATORIxDEMO(null);
        }
        IiiiiiiiIIIII22.setJade(IiiiiiiiIIIII);
        IiiiiiiiIIIII22.setGoods(rgids);
        String IiiiiiiiIIIII11 = Agreement.getSendTextAES((String)"suitoperate", (String)iiIiiiiiIIiii.ALLATORIxDEMO().toJson(IiiiiiiiIIIII22));
        this.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII11);
        return true;
    }

    public String iIiIiiiiIIiIi() {
        int IiiiiiiiIIIII = 0;
        int IiiiiiiiIIIII2 = -1;
        int IiiiiiiiIIIII3 = 0;
        while (IiiiiiiiIIIII3 < this.IIIIiiiiiiiII.length) {
            if (!this.IIIIiiiiiiiII[IiiiiiiiIIIII3].isVisible()) break;
            if (iIiIiiiiIiIII.ALLATORIxDEMO((iIiIiiiiIiIII)this.IIIIiiiiiiiII[IiiiiiiiIIIII3]).ALLATORIxDEMO() == 1) {
                ++IiiiiiiiIIIII;
                IiiiiiiiIIIII2 = IiiiiiiiIIIII3;
            }
            ++IiiiiiiiIIIII3;
        }
        if (IiiiiiiiIIIII2 + 1 != IiiiiiiiIIIII) {
            return "?";
        }
        Goodstable IiiiiiiiIIIII22 = this.IIIIiiiiiiiII[0].ALLATORIxDEMO();
        if (IiiiiiiiIIIII22 == null) return "?";
        if (!GoodType.IIIiiiiiIIIII((long)IiiiiiiiIIIII22.getType())) {
            return "?";
        }
        if (IiiiiiiiIIIII == 1 && IiiiiiiiIIIII22.getValue().indexOf("\u70bc\u5668\u5c5e\u6027") != -1) {
            return "\u6e05\u9664";
        }
        if (IiiiiiiiIIIII == 2 && this.IIIIiiiiiiiII[1].ALLATORIxDEMO() == 505L) {
            return "\u5f00\u5149";
        }
        if (IiiiiiiiIIIII != 4) return "?";
        if (this.IIIIiiiiiiiII[1].ALLATORIxDEMO() != 507L) return "?";
        if (this.IIIIiiiiiiiII[2].ALLATORIxDEMO() != 507L) return "?";
        if (this.IIIIiiiiiiiII[3].ALLATORIxDEMO() != 507L) return "?";
        return "\u70bc\u5668";
    }

    public boolean ALLATORIxDEMO(boolean confirm) {
        String IiiiiiiiIIIII = this.ALLATORIxDEMO();
        if (IiiiiiiiIIIII.equals("?")) {
            return false;
        }
        Goodstable[] IiiiiiiiIIIII2 = this.ALLATORIxDEMO();
        if (IiiiiiiiIIIII2 == null) {
            return false;
        }
        if (this.iIiiIiiiiiiII == 0) {
            return this.iiiIiiiiiiIIi(IiiiiiiiIIIII, IiiiiiiiIIIII2, confirm);
        }
        if (this.iIiiIiiiiiiII == 1) {
            return this.iIiIiiiiIIiii(IiiiiiiiIIIII, IiiiiiiiIIIII2, confirm);
        }
        if (this.iIiiIiiiiiiII != 2) return false;
        return this.ALLATORIxDEMO(IiiiiiiiIIIII, IiiiiiiiIIIII2, confirm);
    }

    public void iIiIiiiiIIiIi(String value) {
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IIIIiiiiiiiII.length) {
            this.IIIIiiiiiiiII[IiiiiiiiIIIII].ALLATORIxDEMO(null);
            this.IIIIiiiiiiiII[IiiiiiiiIIIII++].ALLATORIxDEMO(null);
        }
        if (!IIiiIiiiiIIiI.iIiIiiiiIIiIi((String)value)) {
            if (value.equals("\u70bc\u5316\u88c5\u5907")) {
                this.IIIIiiiiiiiII[0].ALLATORIxDEMO("\u666e\u901a\u88c5\u5907");
                this.IIIIiiiiiiiII[1].ALLATORIxDEMO("\u5185\u4e39");
                this.IIIIiiiiiiiII[2].ALLATORIxDEMO("\u8840\u73b2\u73d1");
                this.IIIIiiiiiiiII[3].ALLATORIxDEMO("\u4e5d\u5f69");
            } else if (value.equals("\u70bc\u5316\u4ed9\u5668")) {
                this.IIIIiiiiiiiII[0].ALLATORIxDEMO("\u4ed9\u5668");
                this.IIIIiiiiiiiII[1].ALLATORIxDEMO("\u4ed9\u5668\u7cbe\u534e");
            } else if (value.equals("\u70bc\u5316\u795e\u5175")) {
                this.IIIIiiiiiiiII[0].ALLATORIxDEMO("\u795e\u5175");
                this.IIIIiiiiiiiII[1].ALLATORIxDEMO("\u795e\u5175\u77f3");
            } else if (value.equals("\u88c5\u5907\u6253\u9020")) {
                this.IIIIiiiiiiiII[0].ALLATORIxDEMO("\u666e\u901a\u88c5\u5907");
                this.IIIIiiiiiiiII[1].ALLATORIxDEMO("\u77ff\u77f3");
            } else if (value.equals("\u88c5\u5907\u5deb\u94f8")) {
                this.IIIIiiiiiiiII[0].ALLATORIxDEMO("\u666e\u901a\u88c5\u5907");
                this.IIIIiiiiiiiII[1].ALLATORIxDEMO("\u77ff\u77f3");
                this.IIIIiiiiiiiII[2].ALLATORIxDEMO("\u5deb\u94f8\u6750\u6599");
            } else if (value.equals("\u9020\u578b\u91cd\u94f8")) {
                this.IIIIiiiiiiiII[0].ALLATORIxDEMO("\u4ed9\u5668");
                this.IIIIiiiiiiiII[1].ALLATORIxDEMO("\u91cd\u94f8\u77f3");
            } else if (value.equals("\u4f19\u4f34\u88c5\u5907\u5347\u7ea7")) {
                this.IIIIiiiiiiiII[0].ALLATORIxDEMO("\u4f19\u4f34\u88c5\u5907");
                this.IIIIiiiiiiiII[1].ALLATORIxDEMO("\u77ff\u77f3");
            } else if (value.equals("\u4f19\u4f34\u88c5\u5907\u91cd\u94f8")) {
                this.IIIIiiiiiiiII[0].ALLATORIxDEMO("\u4f19\u4f34\u88c5\u5907");
                this.IIIIiiiiiiiII[1].ALLATORIxDEMO("\u77ff\u77f3");
            } else if (value.equals("\u4f19\u4f34\u88c5\u5907\u57f9\u517b")) {
                this.IIIIiiiiiiiII[0].ALLATORIxDEMO("\u4f19\u4f34\u88c5\u5907");
                this.IIIIiiiiiiiII[1].ALLATORIxDEMO("\u4f19\u4f34\u88c5\u5907");
            } else if (value.equals("\u4f69\u9970\u57f9\u517b")) {
                this.IIIIiiiiiiiII[0].ALLATORIxDEMO("\u4f69\u9970");
                this.IIIIiiiiiiiII[1].ALLATORIxDEMO("\u4f69\u9970");
            } else if (value.equals("\u4f69\u9970\u91cd\u94f8")) {
                if (this.ALLATORIxDEMO().gameType == 2) {
                    this.IIIIiiiiiiiII[0].ALLATORIxDEMO("\u4f69\u9970");
                    this.IIIIiiiiiiiII[1].ALLATORIxDEMO("\u5185\u4e39");
                    this.IIIIiiiiiiiII[2].ALLATORIxDEMO("\u8840\u73b2\u73d1");
                    this.IIIIiiiiiiiII[3].ALLATORIxDEMO("\u4e5d\u5f69");
                } else {
                    this.IIIIiiiiiiiII[0].ALLATORIxDEMO("\u4f69\u9970");
                    this.IIIIiiiiiiiII[1].ALLATORIxDEMO("\u77ff\u77f3");
                }
            } else if (value.equals("\u62a4\u8eab\u7b26\u57f9\u517b")) {
                this.IIIIiiiiiiiII[0].ALLATORIxDEMO("\u62a4\u8eab\u7b26");
                this.IIIIiiiiiiiII[1].ALLATORIxDEMO("\u62a4\u8eab\u7b26");
            } else if (value.equals("\u62a4\u8eab\u7b26\u91cd\u94f8")) {
                this.IIIIiiiiiiiII[0].ALLATORIxDEMO("\u62a4\u8eab\u7b26");
                this.IIIIiiiiiiiII[1].ALLATORIxDEMO("\u77ff\u77f3");
            } else if (value.equals("\u5f69\u6676\u77f3\u57f9\u517b")) {
                this.IIIIiiiiiiiII[0].ALLATORIxDEMO("\u5f69\u6676\u77f3");
                this.IIIIiiiiiiiII[1].ALLATORIxDEMO("\u5f69\u6676\u77f3");
            } else if (value.equals("\u914d\u9970\u70b9\u7cb9")) {
                this.IIIIiiiiiiiII[0].ALLATORIxDEMO("\u4f69\u9970");
                this.IIIIiiiiiiiII[1].ALLATORIxDEMO("\u8865\u5929\u795e\u77f3");
                this.IIIIiiiiiiiII[2].ALLATORIxDEMO("\u8840\u73b2\u73d1");
            } else if (value.equals("\u914d\u9970\u7cb9\u70bc")) {
                this.IIIIiiiiiiiII[0].ALLATORIxDEMO("\u4f69\u9970");
                this.IIIIiiiiiiiII[1].ALLATORIxDEMO("\u7cb9\u7389");
                this.IIIIiiiiiiiII[2].ALLATORIxDEMO("\u7559\u5149\u7cb9\u7389");
            } else if (value.equals("\u914d\u9970\u7cb9\u53d6")) {
                this.IIIIiiiiiiiII[0].ALLATORIxDEMO("\u4f69\u9970");
                this.IIIIiiiiiiiII[1].ALLATORIxDEMO("\u7cb9\u7389\u7ed3\u6676");
            } else if (value.equals("\u914d\u9970\u70bc\u5408")) {
                this.IIIIiiiiiiiII[1].ALLATORIxDEMO("\u4f69\u9970");
                this.IIIIiiiiiiiII[0].ALLATORIxDEMO("\u7cb9\u7389\u7ed3\u6676");
            } else if (value.equals("\u914d\u9970\u5206\u89e3")) {
                this.IIIIiiiiiiiII[0].ALLATORIxDEMO("\u4f69\u9970");
            } else if (value.equals("\u4ed9\u5668\u5206\u89e3")) {
                this.IIIIiiiiiiiII[0].ALLATORIxDEMO("\u4ed9\u5668");
            } else if (value.equals("\u5f00\u5149")) {
                this.IIIIiiiiiiiII[0].ALLATORIxDEMO("\u6b66\u5668");
                this.IIIIiiiiiiiII[1].ALLATORIxDEMO("\u4e5d\u7384\u4ed9\u7389");
            } else if (value.equals("\u70bc\u5668")) {
                this.IIIIiiiiiiiII[0].ALLATORIxDEMO("\u6b66\u5668");
                this.IIIIiiiiiiiII[1].ALLATORIxDEMO("\u843d\u9b44\u6c99");
                this.IIIIiiiiiiiII[2].ALLATORIxDEMO("\u843d\u9b44\u6c99");
                this.IIIIiiiiiiiII[3].ALLATORIxDEMO("\u843d\u9b44\u6c99");
            } else if (value.equals("\u6e05\u9664\u70bc\u5668")) {
                this.IIIIiiiiiiiII[0].ALLATORIxDEMO("\u6b66\u5668");
            } else if (value.equals("\u5750\u9a91\u767e\u70bc\u4e39")) {
                this.IIIIiiiiiiiII[0].ALLATORIxDEMO("\u767e\u70bc\u4e39");
                this.IIIIiiiiiiiII[1].ALLATORIxDEMO("\u767e\u70bc\u4e39");
                this.IIIIiiiiiiiII[2].ALLATORIxDEMO("\u70bc\u5996\u77f3");
                this.IIIIiiiiiiiII[3].ALLATORIxDEMO("\u70bc\u5996\u77f3");
                this.IIIIiiiiiiiII[4].ALLATORIxDEMO("\u70bc\u5996\u77f3");
                this.IIIIiiiiiiiII[5].ALLATORIxDEMO("\u70bc\u5996\u77f3");
            } else if (value.equals("\u5b88\u62a4\u77f3\u5206\u89e3")) {
                this.IIIIiiiiiiiII[0].ALLATORIxDEMO("\u5b88\u62a4\u77f3");
            }
        }
        this.iiiIiiiiiiIIi();
    }

    public void ALLATORIxDEMO(IIIiiiiiIiIiI imgGrid) {
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IIIIiiiiiiiII.length) {
            if (iIiIiiiiIiIII.ALLATORIxDEMO((iIiIiiiiIiIII)this.IIIIiiiiiiiII[IiiiiiiiIIIII]) == imgGrid) {
                this.IIIIiiiiiiiII[IiiiiiiiIIIII].ALLATORIxDEMO(null);
                this.ALLATORIxDEMO().iiiIiiiiiiIIi(46);
                this.iiiIiiiiiiIIi();
                return;
            }
            ++IiiiiiiiIIIII;
        }
    }

    public boolean ALLATORIxDEMO(String formula, Goodstable[] goods, boolean confirm) {
        if (formula.equals("\u70bc\u5668")) {
            iiIiIiiiiIiii IiiiiiiiIIIII = (iiIiIiiiiIiii)this.ALLATORIxDEMO().iIiIiiiiIIiii(11);
            if (IiiiiiiiIIIII != null) {
                if (IiiiiiiiIIIII.ALLATORIxDEMO(1, goods[0].getRgid())) return this.ALLATORIxDEMO(IiiiiiiiIIIII, goods, this.iiIiIiiiiIIIi, 1);
            }
            String IiiiiiiiIIIII2 = GoodType.getExtra((String)goods[0].getValue(), (String)"\u70bc\u5668\u5c5e\u6027");
            if (IiiiiiiiIIIII == null) {
                IiiiiiiiIIIII = (iiIiIiiiiIiii)this.ALLATORIxDEMO().iiiIiiiiiiIIi(11);
            }
            IiiiiiiiIIIII.ALLATORIxDEMO(goods[0].getRgid(), IiiiiiiiIIIII2, 1, true);
            return false;
        }
        if (formula.equals("\u6e05\u9664")) {
            return this.ALLATORIxDEMO(null, goods, this.iiIiIiiiiIIIi, 3);
        }
        if (!formula.equals("\u5f00\u5149")) return false;
        return this.ALLATORIxDEMO(null, goods, this.iiIiIiiiiIIIi, 0);
    }

    static /* synthetic */ JList ALLATORIxDEMO(IIIIIiiiIIIiI arg0) {
        return arg0.IIiiIiiiIIiIi;
    }

    public void iIiIiiiiIIiIi() {
        int IiiiiiiiIIIII = 1 + this.ALLATORIxDEMO().goodPacks.length / 24;
        if (this.iIiIiiiiIiIii != null) {
            if (this.iIiIiiiiIiIii.length == IiiiiiiiIIIII) return;
        }
        this.iIiIiiiiIiIii = this.ALLATORIxDEMO(this.iIiIiiiiIiIii, IiiiiiiiIIIII, this.iiiIiiiiiiiIi.ALLATORIxDEMO());
        int IiiiiiiiIIIII2 = 524;
        int IiiiiiiiIIIII3 = 283;
        int IiiiiiiiIIIII4 = 0;
        while (IiiiiiiiIIIII4 < this.iIiIiiiiIiIii.length) {
            IIiiIiiiIiiiI iIiiIiiiIiiiI = this.iIiIiiiiIiIii[IiiiiiiiIIIII4];
            int n = IiiiiiiiIIIII3 + IiiiiiiiIIIII4 * 35;
            ++IiiiiiiiIIIII4;
            iIiiIiiiIiiiI.setBounds(IiiiiiiiIIIII2, n, 36, 33);
        }
        this.iiiIiiiiiiiIi.ALLATORIxDEMO(this.iIiIiiiiIiIii, 0);
    }

    public String iiiIiiiiiiIIi() {
        int IiiiiiiiIIIII;
        int IiiiiiiiIIIII2 = 0;
        int IiiiiiiiIIIII3 = -1;
        int IiiiiiiiIIIII4 = 0;
        while (IiiiiiiiIIIII4 < this.IIIIiiiiiiiII.length) {
            if (!this.IIIIiiiiiiiII[IiiiiiiiIIIII4].isVisible()) break;
            if (iIiIiiiiIiIII.ALLATORIxDEMO((iIiIiiiiIiIII)this.IIIIiiiiiiiII[IiiiiiiiIIIII4]).ALLATORIxDEMO() == 1) {
                ++IiiiiiiiIIIII2;
                IiiiiiiiIIIII3 = IiiiiiiiIIIII4;
            }
            ++IiiiiiiiIIIII4;
        }
        if (IiiiiiiiIIIII3 + 1 != IiiiiiiiIIIII2) {
            return "?";
        }
        if (IiiiiiiiIIIII2 == 2 && GoodType.iIiIiiiiIIiIi((long)this.IIIIiiiiiiiII[0].ALLATORIxDEMO())) {
            if (GoodType.iIiIiiiiIIiIi((long)this.IIIIiiiiiiiII[1].ALLATORIxDEMO())) return "\u4e00\u952e\u57f9\u517b";
            if (this.IIIIiiiiiiiII[1].ALLATORIxDEMO() == 1008L) {
                return "\u4e00\u952e\u57f9\u517b";
            }
        }
        if (this.ALLATORIxDEMO().gameType == 2 ? IiiiiiiiIIIII2 == 4 && GoodType.iIiIiiiiIIiIi((long)this.IIIIiiiiiiiII[0].ALLATORIxDEMO()) && this.IIIIiiiiiiiII[1].ALLATORIxDEMO() == 497L && this.IIIIiiiiiiiII[2].ALLATORIxDEMO() == 499L && this.IIIIiiiiiiiII[3].ALLATORIxDEMO() == 498L : IiiiiiiiIIIII2 == 2 && GoodType.iIiIiiiiIIiIi((long)this.IIIIiiiiiiiII[0].ALLATORIxDEMO()) && GoodType.IIIiiiiiiiiII((long)this.IIIIiiiiiiiII[1].ALLATORIxDEMO())) {
            return "\u4f69\u9970\u91cd\u94f8";
        }
        if (IiiiiiiiIIIII2 == 2 && GoodType.iiiiiiiiIIiii((long)this.IIIIiiiiiiiII[0].ALLATORIxDEMO()) && GoodType.iiiiiiiiIIiii((long)this.IIIIiiiiiiiII[1].ALLATORIxDEMO())) {
            return "\u62a4\u8eab\u7b26\u57f9\u517b";
        }
        if (IiiiiiiiIIIII2 == 2 && GoodType.iiiiiiiiIIiii((long)this.IIIIiiiiiiiII[0].ALLATORIxDEMO()) && GoodType.IIIiiiiiiiiII((long)this.IIIIiiiiiiiII[1].ALLATORIxDEMO())) {
            return "\u62a4\u8eab\u7b26\u91cd\u94f8";
        }
        if (IiiiiiiiIIIII2 == 2 && this.IIIIiiiiiiiII[0].ALLATORIxDEMO() == 729L && this.IIIIiiiiiiiII[1].ALLATORIxDEMO() == 729L) {
            return "\u5f69\u6676\u77f3\u57f9\u517b";
        }
        if (IiiiiiiiIIIII2 == 4 && this.IIIIiiiiiiiII[0].ALLATORIxDEMO() == 8889L && this.IIIIiiiiiiiII[1].ALLATORIxDEMO() == 8889L && this.IIIIiiiiiiiII[2].ALLATORIxDEMO() == 8889L && this.IIIIiiiiiiiII[3].ALLATORIxDEMO() == 8889L) {
            return "\u79d8\u77f3\u5408\u6210";
        }
        if (IiiiiiiiIIIII2 == 3 && GoodType.iIiIiiiiiIIiI((long)this.IIIIiiiiiiiII[0].ALLATORIxDEMO()) && this.IIIIiiiiiiiII[1].ALLATORIxDEMO().getGoodsid().intValue() == 309 && this.IIIIiiiiiiiII[2].ALLATORIxDEMO() == 499L) {
            return "\u914d\u9970\u70b9\u7cb9";
        }
        if ((IiiiiiiiIIIII2 == 2 || IiiiiiiiIIIII2 == 3) && GoodType.iIiIiiiiiIIiI((long)this.IIIIiiiiiiiII[0].ALLATORIxDEMO()) && this.IIIIiiiiiiiII[1].ALLATORIxDEMO() == 777L) {
            if (IiiiiiiiIIIII2 == 2) return "\u914d\u9970\u7cb9\u70bc";
            if (IiiiiiiiIIIII2 == 3 && this.IIIIiiiiiiiII[2].ALLATORIxDEMO() == 778L) {
                return "\u914d\u9970\u7cb9\u70bc";
            }
        }
        if (IiiiiiiiIIIII2 == 2 && GoodType.iIiIiiiiiIIiI((long)this.IIIIiiiiiiiII[0].ALLATORIxDEMO()) && this.IIIIiiiiiiiII[1].ALLATORIxDEMO() == 779L) {
            return "\u914d\u9970\u7cb9\u53d6";
        }
        if (IiiiiiiiIIIII2 == 2 && GoodType.iIiIiiiiiIIiI((long)this.IIIIiiiiiiiII[1].ALLATORIxDEMO()) && this.IIIIiiiiiiiII[0].ALLATORIxDEMO() == 779L) {
            return "\u914d\u9970\u70bc\u5408";
        }
        if (IiiiiiiiIIIII2 >= 1) {
            IiiiiiiiIIIII4 = 1;
            IiiiiiiiIIIII = 0;
            while (IiiiiiiiIIIII < this.IIIIiiiiiiiII.length) {
                if (iIiIiiiiIiIII.ALLATORIxDEMO((iIiIiiiiIiIII)this.IIIIiiiiiiiII[IiiiiiiiIIIII]).ALLATORIxDEMO() == 1 && !GoodType.iIiIiiiiiIIiI((long)this.IIIIiiiiiiiII[IiiiiiiiIIIII].ALLATORIxDEMO())) {
                    IiiiiiiiIIIII4 = 0;
                    break;
                }
                ++IiiiiiiiIIIII;
            }
            if (IiiiiiiiIIIII4 != 0) {
                return "\u914d\u9970\u5206\u89e3";
            }
        }
        if (this.ALLATORIxDEMO().gameType != 2) return "?";
        if (IiiiiiiiIIIII2 < 1) return "?";
        IiiiiiiiIIIII4 = 1;
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IIIIiiiiiiiII.length) {
            if (iIiIiiiiIiIII.ALLATORIxDEMO((iIiIiiiiIiIII)this.IIIIiiiiiiiII[IiiiiiiiIIIII]).ALLATORIxDEMO() == 1 && !GoodType.iiiIIiiiiIIii((long)this.IIIIiiiiiiiII[IiiiiiiiIIIII].ALLATORIxDEMO())) {
                IiiiiiiiIIIII4 = 0;
                break;
            }
            ++IiiiiiiiIIIII;
        }
        if (IiiiiiiiIIIII4 != 0) {
            return "\u4ed9\u5668\u5206\u89e3";
        }
        if (!this.ALLATORIxDEMO().gameMount) return "?";
        IiiiiiiiIIIII4 = 1;
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IIIIiiiiiiiII.length) {
            if (iIiIiiiiIiIII.ALLATORIxDEMO((iIiIiiiiIiIII)this.IIIIiiiiiiiII[IiiiiiiiIIIII]).ALLATORIxDEMO() == 1 && this.IIIIiiiiiiiII[IiiiiiiiIIIII].ALLATORIxDEMO() != 108L) {
                IiiiiiiiIIIII4 = 0;
                break;
            }
            ++IiiiiiiiIIIII;
        }
        if (IiiiiiiiIIIII4 == 0) return "?";
        return "\u5b88\u62a4\u77f3\u5206\u89e3";
    }

    public void ALLATORIxDEMO(Goodstable[] goods, String type) {
        String[] IiiiiiiiIIIII;
        Object IiiiiiiiIIIII2;
        String[] IiiiiiiiIIIII3 = MsgUntil.getPalEquipAgree((String)goods[0].getValue(), (String)"\u5951\u5408\u5ea6").split("=")[1].split("/");
        if ("\u88c5\u5907\u5347\u7ea7".equals(type)) {
            if (Integer.parseInt(IiiiiiiiIIIII3[0]) < Integer.parseInt(IiiiiiiiIIIII3[1])) {
                this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u8be5\u88c5\u5907\u5951\u5408\u5ea6\u4e0d\u591f");
                return;
            }
        } else if ("\u88c5\u5907\u57f9\u517b".equals(type)) {
            if (Integer.parseInt(IiiiiiiiIIIII3[0]) >= Integer.parseInt(IiiiiiiiIIIII3[1])) {
                this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u8be5\u88c5\u5907\u5951\u5408\u5ea6\u5df2\u6ee1");
                return;
            }
            if (GoodType.IiiIiiiiiIiII((long)goods[1].getType())) {
                IiiiiiiiIIIII2 = MsgUntil.getPalEquipAgree((String)goods[1].getValue(), (String)"\u7b49\u7ea7");
                IiiiiiiiIIIII = ((String)IiiiiiiiIIIII2).split("=");
                if (Integer.parseInt(IiiiiiiiIIIII[1]) >= 4) {
                    this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u88c5\u59074\u7ea7\u4ee5\u4e0a\u5305\u62ec4\u7ea7,\u4e0d\u80fd\u4f5c\u4e3a\u57f9\u517b\u9053\u5177");
                    return;
                }
            } else if (goods[1].getType() != 7511L) {
                this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u4e0d\u662f\u4f19\u4f34\u88c5\u5907\u57f9\u517b\u9053\u5177");
                return;
            }
        }
        IiiiiiiiIIIII2 = new SuitOperBean();
        IiiiiiiiIIIII = new ArrayList();
        int IiiiiiiiIIIII4 = 0;
        while (IiiiiiiiIIIII4 < goods.length) {
            if (goods[IiiiiiiiIIIII4] != null) {
                IiiiiiiiIIIII.add(goods[IiiiiiiiIIIII4].getRgid());
            }
            ++IiiiiiiiIIIII4;
        }
        IiiiiiiiIIIII2.setGoods(IiiiiiiiIIIII);
        IiiiiiiiIIIII2.setType(62 - ("\u88c5\u5907\u57f9\u517b".equals(type) ? 1 : 0));
        String IiiiiiiiIIIII22 = Agreement.getSendTextAES((String)"suitoperate", (String)iiIiiiiiIIiii.ALLATORIxDEMO().toJson(IiiiiiiiIIIII2));
        this.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII22);
    }

    /*
     * Unable to fully structure code
     */
    public boolean ALLATORIxDEMO(Goodstable[] goods, BigDecimal money, String type, List<BigDecimal> rgids) {
        block42: {
            block44: {
                block43: {
                    block41: {
                        IiiiiiiiIIIII = this.ALLATORIxDEMO();
                        IiiiiiiiIIIII = IiiiiiiiIIIII.getLoginResult();
                        IiiiiiiiIIIII = new NpcComposeBean();
                        if (!type.equals("\u4f69\u9970\u91cd\u94f8")) break block41;
                        if (this.ALLATORIxDEMO().gameType != 2) {
                            IiiiiiiiIIIII = goods[0].getValue();
                            IiiiiiiiIIIII = MsgUntil.getGoodLvl((String)goods[0].getValue());
                            if (IiiiiiiiIIIII != (IiiiiiiiIIIII = MsgUntil.getGoodLvl((String)goods[1].getValue())) - 3) {
                                this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u8bf7\u4f7f\u7528" + (IiiiiiiiIIIII + 3) + "\u7ea7\u77ff\u77f3\u8fdb\u884c\u91cd\u94f8!");
                                return false;
                            }
                        }
                        if (IIIIIiiiIiIii.ALLATORIxDEMO((String)goods[0].getValue(), (String)GoodType.Extras[8], (String)"|") != null) {
                            this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u914d\u9970\u5df2\u6709\u70b9\u7cb9\u5c5e\u6027\u65e0\u6cd5\u91cd\u94f8");
                            return false;
                        }
                        if (IIIIIiiiIiIii.ALLATORIxDEMO((String)goods[0].getValue(), (String)GoodType.Extras[3], (String)"|") != null) {
                            this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u914d\u9970\u5df2\u6709\u5957\u88c5\u5c5e\u6027\u65e0\u6cd5\u91cd\u94f8");
                            return false;
                        }
                        IiiiiiiiIIIII.setComposetype("\u6211\u8981\u91cd\u94f8\u9970\u54c1");
                        break block42;
                    }
                    if (!type.equals("\u62a4\u8eab\u7b26\u57f9\u517b")) break block43;
                    IiiiiiiiIIIII = goods[0].getValue().split("\\|");
                    IiiiiiiiIIIII = 0;
                    IiiiiiiiIIIII = 0;
                    if (true) ** GOTO lbl87
                }
                if (!type.equals("\u62a4\u8eab\u7b26\u91cd\u94f8")) break block44;
                IiiiiiiiIIIII = goods[0].getValue().split("\\|");
                IiiiiiiiIIIII = 0;
                IiiiiiiiIIIII = 0;
                if (true) ** GOTO lbl115
            }
            if (type.equals("\u5f69\u6676\u77f3\u57f9\u517b")) {
                IiiiiiiiIIIII.setComposetype("\u57f9\u517b\u5f69\u6676\u77f3");
            } else if (type.equals("\u88c5\u5907\u6253\u9020")) {
                if (this.ALLATORIxDEMO().gameType == 2 && !this.ALLATORIxDEMO().ALLATORIxDEMO(2, 3)) {
                    IiiiiiiiIIIII = MsgUntil.getGoodLvl((String)goods[0].getValue());
                    IiiiiiiiIIIII = MsgUntil.getGoodLvl((String)goods[1].getValue());
                    if (IiiiiiiiIIIII >= 6) {
                        IiiiiiiiIIIII = 5 + IiiiiiiiIIIII;
                        if ((IiiiiiiiIIIII >= 11 || IiiiiiiiIIIII != 11) && (IiiiiiiiIIIII < 11 || IiiiiiiiIIIII != IiiiiiiiIIIII && IiiiiiiiIIIII + 1 != IiiiiiiiIIIII)) {
                            this.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u9700\u8981\u4f7f\u7528\u5bf9\u5e94\u7b49\u7ea7\u7684\u77ff\u77f3\u6765\u5347\u7ea7\u6216\u8005\u91cd\u94f8");
                            return false;
                        }
                    } else if (IiiiiiiiIIIII < 11) {
                        this.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u9700\u8981\u4f7f\u7528\u66f4\u9ad8\u7ea7\u7684\u77ff\u77f3");
                        return false;
                    }
                }
                IiiiiiiiIIIII.setComposetype("\u6253\u902011-16\u7ea7\u88c5\u5907");
            } else {
                if (type.equals("\u88c5\u5907\u5deb\u94f8") == false) return false;
                IiiiiiiiIIIII = MsgUntil.getGoodLvl((String)goods[0].getValue());
                IiiiiiiiIIIII = MsgUntil.getGoodLvl((String)goods[1].getValue());
                if (IiiiiiiiIIIII < 10) {
                    this.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u6253\u90201-10\u7ea7\u88c5\u5907\u53bb\u957f\u5b89\u57ce\u6253\u94c1\u94fa\u627e\u51af\u94c1\u5320!");
                    return false;
                }
                if (IiiiiiiiIIIII >= 10 && IiiiiiiiIIIII <= 13) {
                    if (IiiiiiiiIIIII != 8 && IiiiiiiiIIIII != 9) {
                        this.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u6253\u902011-14\u7ea7\u88c5\u5907\u4f7f\u75289\u7ea7\u77ff\u77f3!");
                        this.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u91cd\u94f810-13\u7ea7\u88c5\u5907\u4f7f\u75288\u7ea7\u77ff\u77f3!");
                        return false;
                    }
                } else if (IiiiiiiiIIIII == 14) {
                    if (IiiiiiiiIIIII != 9 && IiiiiiiiIIIII != 10) {
                        this.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u6253\u902015\u7ea7\u88c5\u5907\u4f7f\u752810\u7ea7\u77ff\u77f3!");
                        this.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u91cd\u94f814\u7ea7\u88c5\u5907\u4f7f\u75289\u7ea7\u77ff\u77f3!");
                        return false;
                    }
                } else if (IiiiiiiiIIIII == 15) {
                    if (IiiiiiiiIIIII != 10 && IiiiiiiiIIIII != 11) {
                        this.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u6253\u902016\u7ea7\u88c5\u5907\u4f7f\u752811\u7ea7\u77ff\u77f3!");
                        this.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u91cd\u94f815\u7ea7\u88c5\u5907\u4f7f\u752810\u7ea7\u77ff\u77f3!");
                        return false;
                    }
                } else {
                    if (IiiiiiiiIIIII != 16) {
                        this.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u9519\u8bef\u516c\u5f0f");
                        return false;
                    }
                    if (IiiiiiiiIIIII != 11) {
                        this.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u91cd\u94f816\u7ea7\u88c5\u5907\u4f7f\u752811\u7ea7\u77ff\u77f3!");
                        return false;
                    }
                }
                IiiiiiiiIIIII.setComposetype("\u88c5\u5907\u5deb\u94f8");
            }
            break block42;
            do {
                if ((IiiiiiiiIIIII = IiiiiiiiIIIII[IiiiiiiiIIIII].split("="))[0].equals("\u54c1\u8d28")) {
                    IiiiiiiiIIIII = Integer.parseInt(IiiiiiiiIIIII[1].split("/")[0]);
                    break;
                }
                ++IiiiiiiiIIIII;
lbl87:
                // 2 sources

            } while (IiiiiiiiIIIII < IiiiiiiiIIIII.length);
            IiiiiiiiIIIII = 800;
            IiiiiiiiIIIII = GoodType.getExtra((String)goods[0].getValue(), (String)"\u70bc\u5316\u5c5e\u6027");
            if (IiiiiiiiIIIII != null) {
                IiiiiiiiIIIII = IiiiiiiiIIIII.split("&");
                IiiiiiiiIIIII = 0;
                block1: while (IiiiiiiiIIIII < IiiiiiiiIIIII.length) {
                    IiiiiiiiIIIII = IiiiiiiiIIIII[IiiiiiiiIIIII].split("=");
                    if (IiiiiiiiIIIII[0].equals("\u7279\u6280")) {
                        IiiiiiiiIIIII = 1;
                        while (IiiiiiiiIIIII < IiiiiiiiIIIII.length) {
                            if (IiiiiiiiIIIII[IiiiiiiiIIIII].equals("8031")) {
                                IiiiiiiiIIIII = 900;
                                break block1;
                            }
                            ++IiiiiiiiIIIII;
                        }
                    }
                    ++IiiiiiiiIIIII;
                }
            }
            if (IiiiiiiiIIIII > IiiiiiiiIIIII) {
                this.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u8be5\u62a4\u8eab\u7b26\u54c1\u8d28\u5927\u4e8e" + IiiiiiiiIIIII + "\u540e\u65e0\u6cd5\u57f9\u517b");
                return false;
            }
            IiiiiiiiIIIII.setComposetype("\u6211\u8981\u57f9\u517b\u62a4\u8eab\u7b26");
            break block42;
            do {
                if ((IiiiiiiiIIIII = IiiiiiiiIIIII[IiiiiiiiIIIII].split("="))[0].equals("\u54c1\u8d28")) {
                    IiiiiiiiIIIII = Integer.parseInt(IiiiiiiiIIIII[1].split("/")[0]);
                    break;
                }
                ++IiiiiiiiIIIII;
lbl115:
                // 2 sources

            } while (IiiiiiiiIIIII < IiiiiiiiIIIII.length);
            if (IiiiiiiiIIIII < 300) {
                this.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u8be5\u62a4\u8eab\u7b26\u54c1\u8d28\u4f4e\u4e8e300\u7684\u9700\u8981\u57f9\u517b");
                return false;
            }
            IiiiiiiiIIIII = Integer.parseInt(goods[1].getValue().split("=")[1]);
            if (IiiiiiiiIIIII != 9 && IiiiiiiiIIIII != 10) {
                this.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u62a4\u8eab\u7b26\u91cd\u94f8\u4f7f\u75289\u7ea7\u77ff\u77f3,\u5347\u7ea7\u4f7f\u752810\u7ea7\u77ff\u77f3");
                return false;
            }
            IiiiiiiiIIIII.setComposetype("\u6211\u8981\u91cd\u94f8\u62a4\u8eab\u7b26");
            IiiiiiiiIIIII = Integer.parseInt(goods[0].getValue().split("\\|")[0].split("=")[1]);
            if (IiiiiiiiIIIII == 10 && ++IiiiiiiiIIIII > (this.ALLATORIxDEMO().IiiIiiiiiiIiI() != false ? 9 : 7)) {
                this.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u62a4\u8eab\u7b26\u7b49\u7ea7\u6700\u9ad8\u4e3a" + (this.ALLATORIxDEMO().IiiIiiiiiiIiI() != false ? 9 : 7) + "\u7ea7");
                return false;
            }
        }
        ParamTool.ALLATORIxDEMO((long)money.longValue(), (GameView)this.iiIIiiiiIiIIi);
        IiiiiiiiIIIII = new ArrayList<BigDecimal>();
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < goods.length) {
            if (goods[IiiiiiiiIIIII] != null) {
                IiiiiiiiIIIII.add(goods[IiiiiiiiIIIII].getRgid());
                goods[IiiiiiiiIIIII].ALLATORIxDEMO(1);
                if (goods[IiiiiiiiIIIII].getUsetime() <= 0) {
                    IiiiiiiiIIIII.iIiIiiiiIIiii(goods[IiiiiiiiIIIII].getRgid());
                    this.IIIIiiiiiiiII[IiiiiiiiIIIII].ALLATORIxDEMO(null);
                }
            }
            ++IiiiiiiiIIIII;
        }
        IiiiiiiiIIIII.setGoodstables(IiiiiiiiIIIII);
        IiiiiiiiIIIII = Agreement.getSendTextAES((String)"npccompose", (String)iiIiiiiiIIiii.ALLATORIxDEMO().toJson(IiiiiiiiIIIII));
        this.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII);
        return true;
    }

    public void iiiIiiiiiiIIi() {
        String IiiiiiiiIIIII = this.ALLATORIxDEMO();
        if (this.IiIIIiiiiIiiI.getText().equals(IiiiiiiiIIIII)) {
            return;
        }
        this.IiIIIiiiiIiiI.setText(IiiiiiiiIIIII);
        if (IiiiiiiiIIIII.equals("\u914d\u9970\u70b9\u7cb9")) {
            long IiiiiiiiIIIII2 = this.ALLATORIxDEMO().ALLATORIxDEMO(2, 12) ? 100000 : 10000000;
            if (this.iiIiIiiiiIIIi == null || this.iiIiIiiiiIIIi.longValue() != IiiiiiiiIIIII2) {
                this.iiIiIiiiiIIIi = new BigDecimal(IiiiiiiiIIIII2);
            }
        } else if (IiiiiiiiIIIII.equals("\u914d\u9970\u7cb9\u53d6")) {
            long IiiiiiiiIIIII3;
            long l = IiiiiiiiIIIII3 = this.ALLATORIxDEMO().ALLATORIxDEMO(2, 12) ? 20000000L : 2000000000L;
            if (this.iiIiIiiiiIIIi == null || this.iiIiIiiiiIIIi.longValue() != IiiiiiiiIIIII3) {
                this.iiIiIiiiiIIIi = new BigDecimal(IiiiiiiiIIIII3);
            }
        } else if (IiiiiiiiIIIII.equals("\u5750\u9a91\u767e\u70bc\u4e39")) {
            long IiiiiiiiIIIII4 = 100000L;
            if (this.iiIiIiiiiIIIi == null || this.iiIiIiiiiIIIi.longValue() != IiiiiiiiIIIII4) {
                this.iiIiIiiiiIIIi = new BigDecimal(IiiiiiiiIIIII4);
            }
        } else if (this.iiIiIiiiiIIIi == null || this.iiIiIiiiiIIIi.longValue() != 100000L) {
            this.iiIiIiiiiIIIi = new BigDecimal(100000);
        }
        iiIIiiiiIiiII.ALLATORIxDEMO((JLabel)this.IiiiiiiiIIIII[0], (long)this.iiIiIiiiiIIIi.longValue());
    }

    /*
     * Unable to fully structure code
     */
    private /* synthetic */ boolean ALLATORIxDEMO(Goodstable[] goods, BigDecimal money, String v, List<BigDecimal> rgids, boolean confirm) {
        block52: {
            block54: {
                block53: {
                    block51: {
                        block50: {
                            IiiiiiiiIIIII = this.ALLATORIxDEMO();
                            IiiiiiiiIIIII = IiiiiiiiIIIII.getLoginResult();
                            IiiiiiiiIIIII = new SuitOperBean();
                            if (!v.equals("\u79d8\u77f3\u5408\u6210")) break block50;
                            IiiiiiiiIIIII.setType(36);
                            IiiiiiiiIIIII = -1;
                            IiiiiiiiIIIII = 0;
                            if (true) ** GOTO lbl47
                        }
                        if (!v.equals("\u9020\u578b\u91cd\u94f8")) break block51;
                        IiiiiiiiIIIII.setType(22);
                        IiiiiiiiIIIII = IiiiiiiiIIIII.getGood(rgids.get(0));
                        if (!GoodType.IIIiiiiiIIIII((long)IiiiiiiiIIIII.getType())) {
                            this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u53ea\u6709\u6b66\u5668\u624d\u80fd\u91cd\u94f8\u9020\u578b");
                            return false;
                        }
                        break block52;
                    }
                    if (!v.equals("\u4ed9\u5668\u5206\u89e3")) break block53;
                    IiiiiiiiIIIII.setType(23);
                    IiiiiiiiIIIII = 0;
                    IiiiiiiiIIIII = confirm != false ? null : new StringBuffer("#W\u4f60\u662f\u5426\u8981\u628a");
                    IiiiiiiiIIIII = 0;
                    if (true) ** GOTO lbl87
                }
                if (!v.equals("\u5750\u9a91\u9a6d\u70bc")) break block54;
                IiiiiiiiIIIII.setType(141);
                IiiiiiiiIIIII = 0;
                IiiiiiiiIIIII = 0;
                IiiiiiiiIIIII = 0;
                if (true) ** GOTO lbl111
            }
            if (!v.equals("\u5b88\u62a4\u77f3\u5206\u89e3")) break block52;
            IiiiiiiiIIIII.setType(142);
            IiiiiiiiIIIII = 0;
            IiiiiiiiIIIII = confirm != false ? null : new StringBuffer("#W\u4f60\u662f\u5426\u8981\u628a");
            IiiiiiiiIIIII = 0;
            if (true) ** GOTO lbl158
            do {
                if (goods[IiiiiiiiIIIII] != null) {
                    if (IiiiiiiiIIIII == -1) {
                        IiiiiiiiIIIII = Integer.parseInt(goods[IiiiiiiiIIIII].getValue().split("=")[1]);
                    } else if (IiiiiiiiIIIII != Integer.parseInt(goods[IiiiiiiiIIIII].getValue().split("=")[1])) {
                        this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u4f7f\u7528\u7b49\u7ea7\u76f8\u540c\u7684\u79d8\u77f3\u5408\u6210");
                        return false;
                    }
                }
                ++IiiiiiiiIIIII;
lbl47:
                // 2 sources

            } while (IiiiiiiiIIIII < goods.length);
            if (IiiiiiiiIIIII == -1) {
                return false;
            }
            if (IiiiiiiiIIIII >= 5) {
                this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u6700\u9ad85\u7ea7");
                return false;
            }
            break block52;
            do {
                if (goods[IiiiiiiiIIIII] != null) {
                    if (goods[IiiiiiiiIIIII].getGoodlock() == 1) {
                        this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u53ea\u80fd\u5206\u89e3\u672a\u52a0\u9501\u7684\u4ed9\u5668");
                        return false;
                    }
                    if (IiiiiiiiIIIII != null) {
                        IiiiiiiiIIIII = com.xy.v.IIIiiiiiIiIiI.ALLATORIxDEMO((String)goods[IiiiiiiiIIIII].getValue(), (String)"\u9636\u6570=", (String)"|");
                        if (IiiiiiiiIIIII == 1L) {
                            ++IiiiiiiiIIIII;
                        } else if (IiiiiiiiIIIII == 2L) {
                            IiiiiiiiIIIII += 8;
                        } else if (IiiiiiiiIIIII == 3L) {
                            IiiiiiiiIIIII += 64;
                        } else if (IiiiiiiiIIIII == 4L) {
                            IiiiiiiiIIIII += 384;
                        } else if (IiiiiiiiIIIII == 5L) {
                            IiiiiiiiIIIII += 1920;
                        } else if (IiiiiiiiIIIII == 6L) {
                            IiiiiiiiIIIII += 5760;
                        }
                        IiiiiiiiIIIII.append(goods[IiiiiiiiIIIII].getGoodsname());
                        IiiiiiiiIIIII.append("(#R");
                        IiiiiiiiIIIII.append(MsgUntil.iIiIiiiiIIiii((int)((int)IiiiiiiiIIIII)));
                        IiiiiiiiIIIII.append("#W\u9636).");
                    }
                }
                ++IiiiiiiiIIIII;
lbl87:
                // 2 sources

            } while (IiiiiiiiIIIII < goods.length);
            if (IiiiiiiiIIIII != null) {
                IiiiiiiiIIIII.append("\u8fdb\u884c\u5206\u89e3.\u9884\u8ba1\u83b7\u5f97\u4ed9\u5668\u7cbe\u534e\u6570\u91cf:#R");
                IiiiiiiiIIIII.append(IiiiiiiiIIIII);
                this.iiIIiiiiIiIIi.ALLATORIxDEMO(new ConfirmBean(22, null, IiiiiiiiIIIII.toString()));
                return false;
            }
            break block52;
            do {
                if (goods[IiiiiiiiIIIII] != null) {
                    if (goods[IiiiiiiiIIIII].getGoodlock() == 1) {
                        this.iiIIiiiiIiIIi.iiiIiiiiiiIIi(String.valueOf(goods[IiiiiiiiIIIII].getGoodsname()) + "\u88ab\u52a0\u9501\u65e0\u6cd5\u64cd\u4f5c");
                        return false;
                    }
                    if (IiiiiiiiIIIII == 0) {
                        IiiiiiiiIIIII = IIiiIiiiiIIiI.ALLATORIxDEMO((String)goods[IiiiiiiiIIIII].getValue(), (String)"\u7b49\u7ea7=", (String)"|");
                    } else if (IiiiiiiiIIIII == 1) {
                        IiiiiiiiIIIII = IIiiIiiiiIIiI.ALLATORIxDEMO((String)goods[IiiiiiiiIIIII].getValue(), (String)"\u7b49\u7ea7=", (String)"|");
                    } else if (IIiiIiiiiIIiI.ALLATORIxDEMO((String)goods[IiiiiiiiIIIII].getValue(), (String)"\u7b49\u7ea7=", (String)"|") < 6) {
                        this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u70bc\u5996\u77f3\u6700\u5c116\u7ea7\u624d\u80fd\u88ab\u9a6d\u70bc");
                        return false;
                    }
                }
                ++IiiiiiiiIIIII;
lbl111:
                // 2 sources

            } while (IiiiiiiiIIIII < goods.length);
            if (IiiiiiiiIIIII != IiiiiiiiIIIII) {
                this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u9700\u8981\u540c\u7ea7\u7684\u767e\u70bc\u4e39\u624d\u80fd\u9a6d\u70bc");
                return false;
            }
            break block52;
            do {
                if (goods[IiiiiiiiIIIII] != null) {
                    if (goods[IiiiiiiiIIIII].getGoodlock() == 1) {
                        this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u53ea\u80fd\u5206\u89e3\u672a\u52a0\u9501\u7684\u5b88\u62a4\u77f3");
                        return false;
                    }
                    if (IiiiiiiiIIIII != null) {
                        IiiiiiiiIIIII = this.ALLATORIxDEMO().ALLATORIxDEMO();
                        IiiiiiiiIIIII = 0;
                        IiiiiiiiIIIII = goods[IiiiiiiiIIIII].getValue();
                        IiiiiiiiIIIII = 0;
                        IiiiiiiiIIIII = 0;
                        while (IiiiiiiiIIIII < IiiiiiiiIIIII.length()) {
                            IiiiiiiiIIIII = IiiiiiiiIIIII.indexOf("|", IiiiiiiiIIIII + 1);
                            if (IiiiiiiiIIIII == -1) {
                                IiiiiiiiIIIII = IiiiiiiiIIIII.length();
                            }
                            if ((IiiiiiiiIIIII = IiiiiiiiIIIII.indexOf("=", IiiiiiiiIIIII + 1)) != -1 && IiiiiiiiIIIII <= IiiiiiiiIIIII) {
                                IiiiiiiiIIIII = IiiiiiiiIIIII.substring(IiiiiiiiIIIII, IiiiiiiiIIIII);
                                if (IiiiiiiiIIIII.equals("\u7b49\u7ea7")) {
                                    IiiiiiiiIIIII = IIiiIiiiiIIiI.ALLATORIxDEMO((String)IiiiiiiiIIIII, (int)(IiiiiiiiIIIII + 1), (int)IiiiiiiiIIIII);
                                } else if (!IiiiiiiiIIIII.equals("\u8010\u4e45")) {
                                    if (IiiiiiiiIIIII.equals("\u6280\u80fd")) {
                                        IiiiiiiiIIIII = IiiiiiiiIIIII + 1;
                                        IiiiiiiiIIIII = IiiiiiiiIIIII.indexOf("#", IiiiiiiiIIIII + 1);
                                        IiiiiiiiIIIII = IIiiIiiiiIIiI.ALLATORIxDEMO((String)IiiiiiiiIIIII, (int)(IiiiiiiiIIIII + 1), (int)IiiiiiiiIIIII);
                                        IiiiiiiiIIIII += 120 * IiiiiiiiIIIII;
                                    } else {
                                        v0 = IiiiiiiiIIIII = IiiiiiiiIIIII != null ? IiiiiiiiIIIII.getAlchemyUnit(IiiiiiiiIIIII) : null;
                                        if (IiiiiiiiIIIII != null) {
                                            IiiiiiiiIIIII = Double.parseDouble(IiiiiiiiIIIII.substring(IiiiiiiiIIIII + 1, IiiiiiiiIIIII));
                                            IiiiiiiiIIIII = (int)((double)IiiiiiiiIIIII + 600.0 * Math.min(IiiiiiiiIIIII / IiiiiiiiIIIII.getMax(), 1.0));
                                        }
                                    }
                                }
                            }
                            IiiiiiiiIIIII = IiiiiiiiIIIII + 1;
                        }
                        IiiiiiiiIIIII.append(goods[IiiiiiiiIIIII].getGoodsname());
                        IiiiiiiiIIIII.append("(#R");
                        IiiiiiiiIIIII.append(IiiiiiiiIIIII);
                        IiiiiiiiIIIII.append("#W\u7ea7).");
                    }
                }
                ++IiiiiiiiIIIII;
lbl158:
                // 2 sources

            } while (IiiiiiiiIIIII < goods.length);
            if (IiiiiiiiIIIII != null) {
                IiiiiiiiIIIII.append("\u8fdb\u884c\u5206\u89e3.\u9884\u8ba1\u83b7\u5f97\u5b88\u62a4\u4e4b\u5c18\u6570\u91cf:#R");
                IiiiiiiiIIIII.append(IiiiiiiiIIIII);
                this.iiIIiiiiIiIIi.ALLATORIxDEMO(new ConfirmBean(22, null, IiiiiiiiIIIII.toString()));
                return false;
            }
        }
        IiiiiiiiIIIII.setGold(IiiiiiiiIIIII.getGold().subtract(money));
        IiiiiiiiIIIII = IiiiiiiiIIIII.getType() == 141 ? 1 : 0;
        while (IiiiiiiiIIIII < goods.length) {
            if (goods[IiiiiiiiIIIII] != null) {
                goods[IiiiiiiiIIIII].ALLATORIxDEMO(1);
                if (goods[IiiiiiiiIIIII].getUsetime() <= 0) {
                    IiiiiiiiIIIII.iIiIiiiiIIiii(goods[IiiiiiiiIIIII].getRgid());
                    this.IIIIiiiiiiiII[IiiiiiiiIIIII].ALLATORIxDEMO(null);
                }
            }
            ++IiiiiiiiIIIII;
        }
        IiiiiiiiIIIII.setGoods(rgids);
        IiiiiiiiIIIII = Agreement.getSendTextAES((String)"suitoperate", (String)iiIiiiiiIIiii.ALLATORIxDEMO().toJson(IiiiiiiiIIIII));
        this.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII);
        return true;
    }

    public void ALLATORIxDEMO(Goodstable good) {
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IIIIiiiiiiiII.length) {
            if (this.IIIIiiiiiiiII[IiiiiiiiIIIII].isVisible() && iIiIiiiiIiIII.ALLATORIxDEMO((iIiIiiiiIiIII)this.IIIIiiiiiiiII[IiiiiiiiIIIII]).ALLATORIxDEMO() == 1) {
                Goodstable IiiiiiiiIIIII2 = (Goodstable)iIiIiiiiIiIII.ALLATORIxDEMO((iIiIiiiiIiIII)this.IIIIiiiiiiiII[IiiiiiiiIIIII]).ALLATORIxDEMO();
                if (IIiiIiiiiIIiI.ALLATORIxDEMO((BigDecimal)good.getRgid(), (BigDecimal)IiiiiiiiIIIII2.getRgid())) {
                    this.IIIIiiiiiiiII[IiiiiiiiIIIII].ALLATORIxDEMO((Goodstable)(good.getUsetime() > 0 ? good : null));
                    this.iiiIiiiiiiIIi();
                    return;
                }
            }
            ++IiiiiiiiIIIII;
        }
    }

    public IIIIIiiiIIIiI(GameView gameView) {
        super(-1, -1, IiiiIiiiiIiIi.iIIiIiiiiiiIi, gameView);
        this.ALLATORIxDEMO(0, 0, 562, 520, IiiiIiiiiIiIi.iIIiIiiiiiiIi);
        this.iiiiIiiiIIiii = new DefaultListModel();
        this.IIiiIiiiIIiIi = new JList();
        this.IIiiIiiiIIiIi.setOpaque(false);
        this.IIiiIiiiIIiIi.setSelectionBackground(new Color(33, 42, 52));
        this.IIiiIiiiIIiIi.setSelectionForeground(Color.GREEN);
        this.IIiiIiiiIIiIi.setForeground(Color.GREEN);
        this.IIiiIiiiIIiIi.setFont(iiIIiiiiIiiII.iIiIIiiiiIIiI);
        this.IIiiIiiiIIiIi.setBackground(iiIIiiiiIiiII.IIiIiiiiIIiII);
        this.IIiiIiiiIIiIi.setModel(this.iiiiIiiiIIiii);
        this.IIiiIiiiIIiIi.setSelectionMode(0);
        this.IIiiIiiiIIiIi.addListSelectionListener((ListSelectionListener)new IiIIIiiiIIiII(this));
        this.iIIiIiiiiiiIi = IiIIIiiiiIIiI.ALLATORIxDEMO((int)49, (int)75, (int)163, (int)202, this.IIiiIiiiIIiIi, (int)-1);
        this.add(this.iIIiIiiiiiiIi);
        this.IiIIIiiiiIiiI = new IiiiiiiiiIIII("sc/e/31.png", 1, 115, iiIIiiiiIiiII.iIIiiiiiIiiii, iiIIiiiiIiiII.IIiiiiiiIiiII, "?", (IiiiIiiiiIiIi)this);
        this.IiIIIiiiiIiiI.setBounds(443, 125, 79, 25);
        this.add((Component)this.IiIIIiiiiIiiI);
        this.iiiiIiiiIiiII = new JLabel[9];
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iiiiIiiiIiiII.length) {
            this.iiiiIiiiIiiII[IiiiiiiiIIIII] = IiIIIiiiiIIiI.ALLATORIxDEMO((int)46, (int)54, (int)165, (int)21, (int)0, (Color)iiIIiiiiIiiII.ALLATORIxDEMO((String)"#cFFFFFF"), (Font)iiIIiiiiIiiII.iiiiIiiiIiiII);
            this.iiiiIiiiIiiII[IiiiiiiiIIIII].setText(IiiiiiiiIIIII == 0 ? "\u5df2\u52a0\u5165\u4f5c\u574a" : (IiiiiiiiIIIII == 1 ? "\u73b0    \u91d1" : (IiiiiiiiIIIII == 2 ? "\u6d88\u8017\u91d1\u94b1" : (IiiiiiiiIIIII == 3 ? "\u4f5c\u574a\u4e3b" : (IiiiiiiiIIIII == 4 ? "\u6bb5  \u4f4d" : (IiiiiiiiIIIII == 5 ? "\u7b49  \u7ea7" : (IiiiiiiiIIIII == 6 ? "\u53ef\u751f\u4ea7" : (IiiiiiiiIIIII == 7 ? "\u719f\u7ec3\u5ea6" : (IiiiiiiiIIIII == 8 ? "\u6210  \u5c31" : "")))))))));
            if (IiiiiiiiIIIII >= 1 && IiiiiiiiIIIII <= 2) {
                this.iiiiIiiiIiiII[IiiiiiiiIIIII].setFont(iiIIiiiiIiiII.iIIIiiiiIIIii);
                this.iiiiIiiiIiiII[IiiiiiiiIIIII].setBounds(248, 215 + (IiiiiiiiIIIII - 1) * 27, 62, 19);
            }
            if (IiiiiiiiIIIII >= 3 && IiiiiiiiIIIII <= 9) {
                this.iiiiIiiiIiiII[IiiiiiiiIIIII].setForeground(iiIIiiiiIiiII.ALLATORIxDEMO((String)"#c000000"));
                this.iiiiIiiiIiiII[IiiiiiiiIIIII].setBounds(41, 297 + (IiiiiiiiIIIII - 3) * 32, 62, 19);
            }
            this.add(this.iiiiIiiiIiiII[IiiiiiiiIIIII++]);
        }
        this.iiIiiiiiiiIii = new MoneyType();
        this.iiIiiiiiiiIii.setIdAndKey(1, "\u73b0 \u91d1");
        this.iiIIIiiiiiiiI = IiIIIiiiiIIiI.ALLATORIxDEMO((int)320, (int)215, (int)144, (int)19, (int)10, (Color)Color.white, (Font)iiIIiiiiIiiII.iIIIiiiiIIIii, (MoneyType)this.iiIiiiiiiiIii, (GameView)gameView);
        this.iiIIIiiiiiiiI.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/17.png", (int)3, (int)3, (int)3, (int)3, (boolean)false));
        this.iiIIIiiiiiiiI.ALLATORIxDEMO(2);
        this.add((Component)this.iiIIIiiiiiiiI);
        this.IiiiiiiiIIIII = new iIIiIiiiIiiIi[7];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IiiiiiiiIIIII.length) {
            this.IiiiiiiiIIIII[IiiiiiiiIIIII] = IiIIIiiiiIIiI.ALLATORIxDEMO((int)0, (int)0, (int)0, (int)0, (int)10, (Color)Color.white, (Font)iiIIiiiiIiiII.iIIIiiiiIIIii);
            this.IiiiiiiiIIIII[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/17.png", (int)3, (int)3, (int)3, (int)3, (boolean)false));
            IIIIIiiiIIIiI iIIIIiiiIIIiI = this;
            if (IiiiiiiiIIIII == 0) {
                iIIIIiiiIIIiI.IiiiiiiiIIIII[IiiiiiiiIIIII].setBounds(320, 242, 144, 19);
            } else {
                iIIIIiiiIIIiI.IiiiiiiiIIIII[IiiiiiiiIIIII].setBounds(107, 297 + (IiiiiiiiIIIII - 1) * 32, 104, 19);
            }
            this.add((Component)this.IiiiiiiiIIIII[IiiiiiiiIIIII++]);
        }
        this.IIIIiiiiiiiII = new iIiIiiiiIiIII[6];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IIIIiiiiiiiII.length) {
            this.IIIIiiiiiiiII[IiiiiiiiIIIII] = new iIiIiiiiIiIII(this);
            this.IIIIiiiiiiiII[IiiiiiiiIIIII].setBounds(248 + IiiiiiiiIIIII % 3 * 67, 75 + IiiiiiiiIIIII / 3 * 65, 59, 58);
            this.add((Component)this.IIIIiiiiiiiII[IiiiiiiiIIIII++]);
        }
        this.ALLATORIxDEMO = new com.xy.w.IIIiiiiiIiIiI[4];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.ALLATORIxDEMO.length) {
            this.ALLATORIxDEMO[IiiiiiiiIIIII] = new com.xy.w.IIIiiiiiIiIiI();
            if (IiiiiiiiIIIII == 0) {
                this.ALLATORIxDEMO[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/25.png", (int)2, (int)2, (int)2, (int)2, (boolean)false));
                this.ALLATORIxDEMO[IiiiiiiiIIIII].setBounds(46, 54, 165, 21);
            } else if (IiiiiiiiIIIII == 1) {
                this.ALLATORIxDEMO[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/24.png", (int)2, (int)2, (int)2, (int)2, (boolean)false));
                this.ALLATORIxDEMO[IiiiiiiiIIIII].setBounds(46, 54, 165, 225);
            } else if (IiiiiiiiIIIII == 2) {
                this.ALLATORIxDEMO[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/16.png", (int)2, (int)2, (int)2, (int)2, (boolean)false));
                this.ALLATORIxDEMO[IiiiiiiiIIIII].setBounds(215, 54, 310, 225);
            } else if (IiiiiiiiIIIII == 3) {
                this.ALLATORIxDEMO[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/19.png", (int)5, (int)5, (int)5, (int)5, (boolean)false));
                this.ALLATORIxDEMO[IiiiiiiiIIIII].setBounds(215, 283, 309, 207);
            }
            this.add((Component)this.ALLATORIxDEMO[IiiiiiiiIIIII++]);
        }
        this.iiiIiiiiiiiIi = new iiiiiiiiiiIiI((IiiiIiiiiIiIi)this, 6, 4, 51, 51, 0, 0, 216, 285);
        this.iiiIiiiiiiiIi.ALLATORIxDEMO(IIIIIiiiIiiII.iiiIiiiiiiIIi((String)"sc/d/18.png"));
        this.iiiIiiiiiiiIi.iIiIiiiiIIiii(true);
        this.add((Component)this.iiiIiiiiiiiIi);
    }

    public String iIiIiiiiIIiii() {
        int IiiiiiiiIIIII = 0;
        int IiiiiiiiIIIII2 = -1;
        int IiiiiiiiIIIII3 = 0;
        while (IiiiiiiiIIIII3 < this.IIIIiiiiiiiII.length) {
            if (!this.IIIIiiiiiiiII[IiiiiiiiIIIII3].isVisible()) break;
            if (iIiIiiiiIiIII.ALLATORIxDEMO((iIiIiiiiIiIII)this.IIIIiiiiiiiII[IiiiiiiiIIIII3]).ALLATORIxDEMO() == 1) {
                ++IiiiiiiiIIIII;
                IiiiiiiiIIIII2 = IiiiiiiiIIIII3;
            }
            ++IiiiiiiiIIIII3;
        }
        if (IiiiiiiiIIIII2 + 1 != IiiiiiiiIIIII) {
            return "?";
        }
        if (IiiiiiiiIIIII == 4 && this.IIIIiiiiiiiII[1].ALLATORIxDEMO() == 497L && this.IIIIiiiiiiiII[2].ALLATORIxDEMO() == 499L && this.IIIIiiiiiiiII[3].ALLATORIxDEMO() == 498L) {
            if (GoodType.iiiiIiiiIIIiI((long)this.IIIIiiiiiiiII[0].ALLATORIxDEMO())) return "\u70bc\u5316\u88c5\u5907";
            if (GoodType.iiiiiiiiIIiii((long)this.IIIIiiiiiiiII[0].ALLATORIxDEMO())) return "\u70bc\u5316\u88c5\u5907";
            if (GoodType.IiiIiiiiiIiII((long)this.IIIIiiiiiiiII[0].ALLATORIxDEMO())) {
                return "\u70bc\u5316\u88c5\u5907";
            }
            if (GoodType.iiiIIiiiiIIii((long)this.IIIIiiiiiiiII[0].ALLATORIxDEMO())) {
                if (this.ALLATORIxDEMO().gameType != 2) return "\u70bc\u5316\u4ed9\u5668";
                return "?";
            }
        }
        if (IiiiiiiiIIIII == 2 && GoodType.iiiIIiiiiIIii((long)this.IIIIiiiiiiiII[0].ALLATORIxDEMO())) {
            if (GoodType.iiiIIiiiiIIii((long)this.IIIIiiiiiiiII[1].ALLATORIxDEMO())) return "\u70bc\u5316\u4ed9\u5668";
            if (this.IIIIiiiiiiiII[1].ALLATORIxDEMO() == 7005L) return "\u70bc\u5316\u4ed9\u5668";
            if (this.IIIIiiiiiiiII[1].ALLATORIxDEMO() == 7010L) {
                return "\u70bc\u5316\u4ed9\u5668";
            }
        }
        if (IiiiiiiiIIIII == 2 && GoodType.IIIIIiiiiIIii((long)this.IIIIiiiiiiiII[0].ALLATORIxDEMO()) && this.IIIIiiiiiiiII[1].ALLATORIxDEMO() == 191L && !this.ALLATORIxDEMO().ALLATORIxDEMO(2, 3)) {
            return "\u70bc\u5316\u795e\u5175";
        }
        if (IiiiiiiiIIIII == 2 && GoodType.IiiIiiiiiIiII((long)this.IIIIiiiiiiiII[0].ALLATORIxDEMO()) && this.IIIIiiiiiiiII[1].ALLATORIxDEMO() == 500L) {
            return MsgUntil.ALLATORIxDEMO((String)MsgUntil.getPalEquipAgree((String)this.IIIIiiiiiiiII[0].ALLATORIxDEMO(), (String)"\u7b49\u7ea7").split("=")[1], (String)this.IIIIiiiiiiiII[1].ALLATORIxDEMO().split("=")[1]);
        }
        if (IiiiiiiiIIIII == 2 && GoodType.IiiIiiiiiIiII((long)this.IIIIiiiiiiiII[0].ALLATORIxDEMO())) {
            if (GoodType.IiiIiiiiiIiII((long)this.IIIIiiiiiiiII[1].ALLATORIxDEMO())) return "\u88c5\u5907\u57f9\u517b";
            if (this.IIIIiiiiiiiII[1].ALLATORIxDEMO() == 7511L) {
                return "\u88c5\u5907\u57f9\u517b";
            }
        }
        if (IiiiiiiiIIIII == 2 && GoodType.iiiIIiiiiIIii((long)this.IIIIiiiiiiiII[0].ALLATORIxDEMO()) && this.IIIIiiiiiiiII[1].ALLATORIxDEMO() == 214L) {
            return "\u9020\u578b\u91cd\u94f8";
        }
        if (this.ALLATORIxDEMO().gameType == 2) {
            if (IiiiiiiiIIIII == 3 && GoodType.iiiiIiiiIIIiI((long)this.IIIIiiiiiiiII[0].ALLATORIxDEMO()) && this.IIIIiiiiiiiII[1].ALLATORIxDEMO() == 500L && this.IIIIiiiiiiiII[2].ALLATORIxDEMO() == 555L) {
                return "\u88c5\u5907\u5deb\u94f8";
            }
            if (!this.ALLATORIxDEMO().ALLATORIxDEMO(2, 3) && IiiiiiiiIIIII == 2 && GoodType.iiiiIiiiIIIiI((long)this.IIIIiiiiiiiII[0].ALLATORIxDEMO()) && this.IIIIiiiiiiiII[1].ALLATORIxDEMO() == 500L) {
                return "\u88c5\u5907\u6253\u9020";
            }
        }
        if (!this.ALLATORIxDEMO().gameMount) return "?";
        if (IiiiiiiiIIIII < 3) return "?";
        if (this.IIIIiiiiiiiII[0].ALLATORIxDEMO() != 103L) return "?";
        if (this.IIIIiiiiiiiII[1].ALLATORIxDEMO() != 103L) return "?";
        IiiiiiiiIIIII3 = 1;
        int IiiiiiiiIIIII4 = 2;
        while (IiiiiiiiIIIII4 < IiiiiiiiIIIII) {
            if (!GoodType.IiiIiiiiiiIiI((long)this.IIIIiiiiiiiII[IiiiiiiiIIIII4].ALLATORIxDEMO())) {
                IiiiiiiiIIIII3 = 0;
                break;
            }
            ++IiiiiiiiIIIII4;
        }
        if (IiiiiiiiIIIII3 == 0) return "?";
        return "\u5750\u9a91\u9a6d\u70bc";
    }

    public String ALLATORIxDEMO() {
        if (this.iIiiIiiiiiiII == 0) {
            return this.iIiIiiiiIIiii();
        }
        if (this.iIiiIiiiiiiII == 1) {
            return this.iiiIiiiiiiIIi();
        }
        if (this.iIiiIiiiiiiII != 2) return "?";
        return this.iIiIiiiiIIiIi();
    }
}
