/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.i.IiiiIiiiiIiII
 *  com.xy.a.q.IIiIiiiiIIiii
 *  com.xy.a.q.IIiiIiiiIiiiI
 *  com.xy.a.q.IiiiiiiiiIIII
 *  com.xy.bean.SuitOperBean
 *  com.xy.entity.PartJade
 *  com.xy.entity.RoleSummoning
 *  com.xy.formula.ExpUtil
 *  com.xy.formula.GoodType
 *  com.xy.formula.MsgUntil
 *  com.xy.game.RoleData
 *  com.xy.game.RolePet
 *  com.xy.i.IiiiiiiiiIIII
 *  com.xy.q.IIIiiiiiIiIiI
 *  com.xy.q.IIiIIiiiIIIiI
 *  com.xy.q.IiIIIiiiIIiII
 *  com.xy.q.IiIIIiiiiIIiI
 *  com.xy.q.IiiiIiiiiIiII
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.q.iIIiIiiiIiiIi
 *  com.xy.q.iIiIIiiiIIIiI
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.q.iiIiIiiiiIiIi
 *  com.xy.q.iiiIIiiiIIIii
 *  com.xy.readbean.Goodstable
 *  com.xy.readbean.MoneyType
 *  com.xy.socket.Agreement
 *  com.xy.text.GameView
 *  com.xy.v.iiIiiiiiIIiii
 *  com.xy.w.IIIIIiiiIiiII
 *  com.xy.w.IIIiiiiiIiIiI
 *  com.xy.w.IIiIiiiiIIiii
 */
package com.xy.a.q;

import com.xy.a.i.IiiiIiiiiIiII;
import com.xy.a.q.IIiIiiiiIIiii;
import com.xy.a.q.IIiiIiiiIiiiI;
import com.xy.a.q.IiiiiiiiiIIII;
import com.xy.bean.SuitOperBean;
import com.xy.entity.PartJade;
import com.xy.entity.RoleSummoning;
import com.xy.formula.ExpUtil;
import com.xy.formula.GoodType;
import com.xy.formula.MsgUntil;
import com.xy.game.RoleData;
import com.xy.game.RolePet;
import com.xy.q.IIiIIiiiIIIiI;
import com.xy.q.IiIIIiiiIIiII;
import com.xy.q.IiIIIiiiiIIiI;
import com.xy.q.IiiiIiiiiIiIi;
import com.xy.q.iIIiIiiiIiiIi;
import com.xy.q.iIiIIiiiIIIiI;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.q.iiIiIiiiiIiIi;
import com.xy.q.iiiIIiiiIIIii;
import com.xy.readbean.Goodstable;
import com.xy.readbean.MoneyType;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import com.xy.v.iiIiiiiiIIiii;
import com.xy.w.IIIIIiiiIiiII;
import com.xy.w.IIIiiiiiIiIiI;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.MouseListener;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JTextField;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class IiIIIiiiiiiIi
extends IiiiIiiiiIiIi {
    private IIiIIiiiIIIiI IiiiIiiiIiIII;
    private IIiiIiiiIiiiI IIiiiiiiiIIIi;
    private MoneyType IIIiiiiiIIiII;
    private int iiIiiiiiiIIiI = -1;
    private com.xy.i.IiiiiiiiiIIII iIiiIiiiIiIIi;
    private com.xy.i.IiiiiiiiiIIII iiiiIiiiIIiii;
    private iiIiIiiiiIiIi iIIiIiiiiiiIi;
    private IiIIIiiiIIiII IIIIiiiiiiiII;
    private iIIiIiiiIiiIi iiIIIiiiiiiiI;
    private com.xy.q.IiiiIiiiiIiII IiIiiiiiIIIII;
    private iIiIIiiiIIIiI[] iiIiIiiiiIIIi;
    private MoneyType iiiiIiiiIiiII;
    private com.xy.i.IiiiiiiiiIIII iiiIiiiiiiiIi;
    private IIIiiiiiIiIiI[] iIiiIiiiiiiII;
    private IiiiIiiiiIiII IIiiIiiiIIiIi;
    private BigDecimal iIiIiiiiIiIii = null;
    private com.xy.i.IiiiiiiiiIIII[] IiIIIiiiiIiiI;
    private int iiIiiiiiiiIii;
    private iiIiIiiiiIiIi IiiiiiiiIIIII;
    private JLabel[] ALLATORIxDEMO;

    public void iiiIiiiiiiIIi(boolean is) {
        if (this.IIiiIiiiIIiIi == null && !is) {
            return;
        }
        if (is) {
            if (this.IIiiIiiiIIiIi == null) {
                this.IIiiIiiiIIiIi = new IiiiIiiiiIiII((IiiiIiiiiIiIi)this);
                this.add((Component)this.IIiiIiiiIIiIi, 0);
            }
            this.IIiiIiiiIIiIi.iIiIiiiiIiIii.ALLATORIxDEMO(false);
            this.IIiiIiiiIIiIi.iIiIiiiiIiIii.ALLATORIxDEMO().removeAllElements();
            int IiiiiiiiIIIII = 0;
            RoleData IiiiiiiiIIIII2 = this.ALLATORIxDEMO();
            List<BigDecimal> IiiiiiiiIIIII3 = null;
            int IiiiiiiiIIIII222 = 0;
            while (IiiiiiiiIIIII222 < IiiiiiiiIIIII2.pets.size()) {
                RoleSummoning IiiiiiiiIIIII4 = ((RolePet)IiiiiiiiIIIII2.pets.get(IiiiiiiiIIIII222)).getPet();
                String IiiiiiiiIIIII5 = IiiiiiiiIIIII4.getStye();
                if (IiiiiiiiIIIII5 != null && IiiiiiiiIIIII5.length() > 1) {
                    String[] IiiiiiiiIIIII6 = IiiiiiiiIIIII5.split("\\|");
                    if (IiiiiiiiIIIII3 != null) {
                        IiiiiiiiIIIII3.clear();
                    }
                    if ((IiiiiiiiIIIII3 = this.ALLATORIxDEMO(IiiiiiiiIIIII3, IiiiiiiiIIIII6)) != null && IiiiiiiiIIIII3.size() != 0) {
                        IiiiiiiiIIIII += IiiiiiiiIIIII3.size();
                        iiiIIiiiIIIii IiiiiiiiIIIII7 = new iiiIIiiiIIIii(String.valueOf(IiiiiiiiIIIII4.getSummoningname()) + "(" + IiiiiiiiIIIII3.size() + ")", (Object)IiiiiiiiIIIII4.getSid());
                        this.IIiiIiiiIIiIi.iIiIiiiiIiIii.iiiIiiiiiiIIi(IiiiiiiiIIIII7);
                    }
                }
                ++IiiiiiiiIIIII222;
            }
            iiiIIiiiIIIii IiiiiiiiIIIII222 = new iiiIIiiiIIIii("\u5168\u90e8(" + IiiiiiiiIIIII + ")", null);
            this.IIiiIiiiIIiIi.iIiIiiiiIiIii.iiiIiiiiiiIIi(IiiiiiiiIIIII222);
            this.IIiiIiiiIIiIi.iIiIiiiiIiIii.ALLATORIxDEMO(this.IIiiIiiiIIiIi.iIiIiiiiIiIii.ALLATORIxDEMO().size() - 1);
            this.IIiiIiiiIIiIi.setBounds(30, 128, 330, 150);
        }
        this.IIiiIiiiIIiIi.setVisible(is);
    }

    public List<BigDecimal> ALLATORIxDEMO(List<BigDecimal> list, String[] v) {
        int IiiiiiiiIIIII = 1;
        while (IiiiiiiiIIIII < v.length) {
            Goodstable IiiiiiiiIIIII2;
            String[] IiiiiiiiIIIII3 = v[IiiiiiiiIIIII].split("-");
            if (IiiiiiiiIIIII3.length >= 2 && !IiiiiiiiIIIII3[0].equals("3") && (IiiiiiiiIIIII2 = this.ALLATORIxDEMO().getGood(new BigDecimal(IiiiiiiiIIIII3[1]))) != null) {
                if (list == null) {
                    list = new ArrayList<BigDecimal>();
                }
                list.add(IiiiiiiiIIIII2.getRgid());
            }
            ++IiiiiiiiIIIII;
        }
        return list;
    }

    static /* synthetic */ int ALLATORIxDEMO(IiIIIiiiiiiIi arg0) {
        return arg0.iiIiiiiiiIIiI;
    }

    public Long ALLATORIxDEMO(long number, JTextField textField) {
        if (number == 0L) {
            return null;
        }
        if (number < 0L) {
            return 0L;
        }
        long IiiiiiiiIIIII = this.ALLATORIxDEMO().getMoney(this.iiiiIiiiIiiII);
        if (number <= IiiiiiiiIIIII) return null;
        return IiiiiiiiIIIII;
    }

    public int iIiIiiiiIIiIi() {
        return this.iiIiiiiiiIIiI;
    }

    public void iiiIiiiiiiIIi() {
        if (this.IIiiIiiiIIiIi == null) {
            this.iiiIiiiiiiIIi(true);
            return;
        }
        this.iiiIiiiiiiIIi(!this.IIiiIiiiIIiIi.isVisible());
    }

    /*
     * Unable to fully structure code
     */
    public boolean iIiIiiiiIIiii() {
        block30: {
            block34: {
                block33: {
                    block32: {
                        block31: {
                            block29: {
                                IiiiiiiiIIIII = this.ALLATORIxDEMO();
                                IiiiiiiiIIIII = (Goodstable)this.iiIiIiiiiIIIi[0].ALLATORIxDEMO().ALLATORIxDEMO();
                                if (IiiiiiiiIIIII != null) {
                                    IiiiiiiiIIIII = IiiiiiiiIIIII.getGood(IiiiiiiiIIIII.getRgid());
                                }
                                if (IiiiiiiiIIIII == null) {
                                    this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u8bf7\u9009\u62e9\u53ec\u5524\u517d\u88c5\u5907");
                                    return false;
                                }
                                if (this.iIiIiiiiIiIii != null && IiiiiiiiIIIII.getLoginResult().getGold().compareTo(this.iIiIiiiiIiIii) < 0) {
                                    this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u5927\u8bdd\u5e01\u4e0d\u8db3" + this.iIiIiiiiIiIii.longValue() / 10000L + "\u4e07");
                                    return false;
                                }
                                IiiiiiiiIIIII = IiiiiiiiIIIII.getValue().split("\\|");
                                IiiiiiiiIIIII = new SuitOperBean();
                                if (this.iiIiiiiiiiIii != 0 || this.iiIiiiiiiIIiI != 0) break block29;
                                IiiiiiiiIIIII = (Goodstable)this.iiIiIiiiiIIIi[1].ALLATORIxDEMO().ALLATORIxDEMO();
                                if (IiiiiiiiIIIII != null) {
                                    IiiiiiiiIIIII = IiiiiiiiIIIII.getGood(IiiiiiiiIIIII.getRgid());
                                }
                                if (IiiiiiiiIIIII == null) {
                                    this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u6ca1\u6709\u9009\u4e2d\u7384\u94c1\u6676\u77f3");
                                    return false;
                                }
                                IiiiiiiiIIIII = Integer.parseInt(MsgUntil.getValuesMessage((String[])IiiiiiiiIIIII, (String)"\u901a\u7075"));
                                if (IiiiiiiiIIIII >= 6000) {
                                    this.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u8be5\u88c5\u5907\u7684\u901a\u7075\u503c\u5df2\u7ecf\u62b5\u8fbe\u4e0a\u9650\uff0c\u65e0\u6cd5\u5728\u57f9\u517b");
                                    return false;
                                }
                                IiiiiiiiIIIII.setType(41);
                                IiiiiiiiIIIII = new ArrayList<BigDecimal>();
                                IiiiiiiiIIIII.add(IiiiiiiiIIIII.getRgid());
                                IiiiiiiiIIIII.add(IiiiiiiiIIIII.getRgid());
                                IiiiiiiiIIIII.setGoods(IiiiiiiiIIIII);
                                IiiiiiiiIIIII.ALLATORIxDEMO(1);
                                if (IiiiiiiiIIIII.getUsetime() <= 0) {
                                    IiiiiiiiIIIII.iIiIiiiiIIiii(IiiiiiiiIIIII.getRgid());
                                    this.iiIiIiiiiIIIi[1].ALLATORIxDEMO(0, null);
                                }
                                break block30;
                            }
                            if (this.iiIiiiiiiiIii != 0 || this.iiIiiiiiiIIiI != 1) break block31;
                            IiiiiiiiIIIII.setType(42);
                            IiiiiiiiIIIII = new ArrayList<E>();
                            IiiiiiiiIIIII.add(IiiiiiiiIIIII.getRgid());
                            IiiiiiiiIIIII.setGoods((List)IiiiiiiiIIIII);
                            IiiiiiiiIIIII.ALLATORIxDEMO(1);
                            if (IiiiiiiiIIIII.getUsetime() <= 0) {
                                IiiiiiiiIIIII.iIiIiiiiIIiii(IiiiiiiiIIIII.getRgid());
                                this.iiIiIiiiiIIIi[0].ALLATORIxDEMO(0, null);
                            }
                            break block30;
                        }
                        if (this.iiIiiiiiiiIii != 1 || this.iiIiiiiiiIIiI != 0) break block32;
                        IiiiiiiiIIIII.setType(43);
                        IiiiiiiiIIIII = new ArrayList<E>();
                        IiiiiiiiIIIII.add(IiiiiiiiIIIII.getRgid());
                        IiiiiiiiIIIII.setGoods((List)IiiiiiiiIIIII);
                        IiiiiiiiIIIII = 1;
                        if (true) ** GOTO lbl156
                    }
                    if (this.iiIiiiiiiiIii != 1 || this.iiIiiiiiiIIiI != 1) break block33;
                    IiiiiiiiIIIII = (Goodstable)this.iiIiIiiiiIIIi[1].ALLATORIxDEMO().ALLATORIxDEMO();
                    if (IiiiiiiiIIIII != null) {
                        IiiiiiiiIIIII = IiiiiiiiIIIII.getGood(IiiiiiiiIIIII.getRgid());
                    }
                    if (IiiiiiiiIIIII == null) {
                        this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u6ca1\u6709\u9009\u4e2d\u9690\u6708\u795e\u77f3");
                        return false;
                    }
                    if (MsgUntil.getValuesMessage((String[])IiiiiiiiIIIII, (String)"\u89c9\u9192\u6280") == null) {
                        this.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u8be5\u88c5\u5907\u6ca1\u6709\u89c9\u9192\u6280");
                        return false;
                    }
                    IiiiiiiiIIIII.setType(44);
                    IiiiiiiiIIIII = new ArrayList<BigDecimal>();
                    IiiiiiiiIIIII.add(IiiiiiiiIIIII.getRgid());
                    IiiiiiiiIIIII.add(IiiiiiiiIIIII.getRgid());
                    IiiiiiiiIIIII.setGoods(IiiiiiiiIIIII);
                    IiiiiiiiIIIII.ALLATORIxDEMO(1);
                    if (IiiiiiiiIIIII.getUsetime() <= 0) {
                        IiiiiiiiIIIII.iIiIiiiiIIiii(IiiiiiiiIIIII.getRgid());
                        this.iiIiIiiiiIIIi[1].ALLATORIxDEMO(0, null);
                    }
                    break block30;
                }
                if (this.iiIiiiiiiiIii != 2 || this.iiIiiiiiiIIiI != 0) break block34;
                IiiiiiiiIIIII = MsgUntil.getValuesMessage((String[])IiiiiiiiIIIII, (String)"\u89c9\u9192\u6280");
                if (IiiiiiiiIIIII == null) {
                    this.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u8be5\u88c5\u5907\u6ca1\u6709\u89c9\u9192\u6280");
                    return false;
                }
                IiiiiiiiIIIII = (int)this.IiiiIiiiIiIII.ALLATORIxDEMO();
                if (IiiiiiiiIIIII <= 0) {
                    return false;
                }
                if ((long)IiiiiiiiIIIII > IiiiiiiiIIIII.getLoginResult().getScoretype("\u6bd4\u6597\u5956\u7ae0").longValue()) {
                    this.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u6bd4\u6597\u5956\u7ae0\u6570\u91cf\u4e0d\u8db3");
                    return false;
                }
                IiiiiiiiIIIII = IiiiiiiiIIIII.split("&");
                IiiiiiiiIIIII = Long.parseLong(IiiiiiiiIIIII[3]);
                if (ExpUtil.ALLATORIxDEMO((long)IiiiiiiiIIIII) >= 20L) {
                    this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u7b49\u7ea7\u5df2\u7ecf\u8fbe\u5230\u6700\u5927\u503c");
                    return false;
                }
                IiiiiiiiIIIII.setType(46);
                IiiiiiiiIIIII.setJade(new PartJade((long)IiiiiiiiIIIII, 0));
                IiiiiiiiIIIII = new ArrayList<BigDecimal>();
                IiiiiiiiIIIII.add(IiiiiiiiIIIII.getRgid());
                IiiiiiiiIIIII.setGoods(IiiiiiiiIIIII);
                break block30;
            }
            if (this.iiIiiiiiiiIii != 2) return false;
            if (this.iiIiiiiiiIIiI != 1) return false;
            if (MsgUntil.getValuesMessage((String[])IiiiiiiiIIIII, (String)"\u89c9\u9192\u6280") != null) {
                this.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u8be5\u88c5\u5907\u5df2\u6709\u89c9\u9192\u6280");
                return false;
            }
            IiiiiiiiIIIII = (Goodstable)this.iiIiIiiiiIIIi[1].ALLATORIxDEMO().ALLATORIxDEMO();
            if (IiiiiiiiIIIII != null) {
                IiiiiiiiIIIII = IiiiiiiiIIIII.getGood(IiiiiiiiIIIII.getRgid());
            }
            if (IiiiiiiiIIIII == null) {
                this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u6ca1\u6709\u9009\u4e2d\u5343\u5e74\u9b42\u77f3");
                return false;
            }
            IiiiiiiiIIIII.setType(45);
            IiiiiiiiIIIII = new ArrayList<BigDecimal>();
            IiiiiiiiIIIII.add(IiiiiiiiIIIII.getRgid());
            IiiiiiiiIIIII.add(IiiiiiiiIIIII.getRgid());
            IiiiiiiiIIIII.setGoods(IiiiiiiiIIIII);
            IiiiiiiiIIIII.ALLATORIxDEMO(1);
            if (IiiiiiiiIIIII.getUsetime() > 0) break block30;
            IiiiiiiiIIIII.iIiIiiiiIIiii(IiiiiiiiIIIII.getRgid());
            this.iiIiIiiiiIIIi[1].ALLATORIxDEMO(0, null);
            break block30;
            do {
                block36: {
                    block35: {
                        if ((IiiiiiiiIIIII = (Goodstable)this.iiIiIiiiiIIIi[IiiiiiiiIIIII].ALLATORIxDEMO().ALLATORIxDEMO()) != null) {
                            IiiiiiiiIIIII = IiiiiiiiIIIII.getGood(IiiiiiiiIIIII.getRgid());
                        }
                        if (IiiiiiiiIIIII != null) break block35;
                        if (IiiiiiiiIIIII == 1) {
                            this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u8bf7\u653e\u5165\u7384\u94c1\u6676\u77f3");
                        } else if (IiiiiiiiIIIII == 2) {
                            this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u8bf7\u653e\u5165\u5185\u4e39\u7cbe\u534e");
                        } else {
                            this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u8bf7\u653e\u5165\u4e5d\u5f69\u4e91\u9f99\u73e0");
                        }
                        break block36;
                    }
                    IiiiiiiiIIIII = 1;
                    var10_16 = IiiiiiiiIIIII.iterator();
                    if (true) ** GOTO lbl149
                }
                return false;
                do {
                    if (((BigDecimal)var10_16.next()).compareTo(IiiiiiiiIIIII.getRgid()) != 0) continue;
                    ++IiiiiiiiIIIII;
lbl149:
                    // 3 sources

                } while (var10_16.hasNext());
                if (IiiiiiiiIIIII > IiiiiiiiIIIII.getUsetime()) {
                    this.iiIIiiiiIiIIi.iIiIiiiiIIiii(String.valueOf(IiiiiiiiIIIII.getGoodsname()) + "\u6570\u91cf\u4e0d\u8db3");
                    return false;
                }
                ++IiiiiiiiIIIII;
                IiiiiiiiIIIII.add(IiiiiiiiIIIII.getRgid());
lbl156:
                // 2 sources

            } while (IiiiiiiiIIIII < this.iiIiIiiiiIIIi.length);
            IiiiiiiiIIIII = 1;
            while (IiiiiiiiIIIII < IiiiiiiiIIIII.size()) {
                IiiiiiiiIIIII = IiiiiiiiIIIII.getGood((BigDecimal)IiiiiiiiIIIII.get(IiiiiiiiIIIII));
                IiiiiiiiIIIII.ALLATORIxDEMO(1);
                if (IiiiiiiiIIIII.getUsetime() <= 0) {
                    IiiiiiiiIIIII.iIiIiiiiIIiii(IiiiiiiiIIIII.getRgid());
                    this.iiIiIiiiiIIIi[IiiiiiiiIIIII].ALLATORIxDEMO(0, null);
                }
                ++IiiiiiiiIIIII;
            }
        }
        IiiiiiiiIIIII = Agreement.getSendTextAES((String)"suitoperate", (String)iiIiiiiiIIiii.ALLATORIxDEMO().toJson(IiiiiiiiIIIII));
        this.ALLATORIxDEMO().ALLATORIxDEMO((String)IiiiiiiiIIIII);
        return true;
    }

    public int iiiIiiiiiiIIi() {
        return this.iiIiiiiiiiIii;
    }

    public void ALLATORIxDEMO(com.xy.q.IIIiiiiiIiIiI imgGrid) {
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iiIiIiiiiIIIi.length) {
            if (this.iiIiIiiiiIIIi[IiiiiiiiIIIII].ALLATORIxDEMO() == imgGrid) {
                this.iiIiIiiiiIIIi[IiiiiiiiIIIII].ALLATORIxDEMO(0, null);
                if (this.iiIiiiiiiiIii != 2) return;
                if (this.iiIiiiiiiIIiI != 0) return;
                this.IIiiiiiiiIIIi.iiiIiiiiiiIIi();
                return;
            }
            ++IiiiiiiiIIIII;
        }
    }

    public IiIIIiiiiiiIi(GameView gameView) {
        super(91, 2, IiiiIiiiiIiIi.iIIIIiiiiiIIi, gameView);
        this.ALLATORIxDEMO(-3, 0, 382, 455, IiiiIiiiiIiIi.iiIIIiiiiiiiI);
        this.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/1.png", (int)68, (int)68, (int)68, (int)68, (boolean)false), "\u88c5\u5907\u70bc\u5316");
        this.IiIIIiiiiIiiI = new com.xy.i.IiiiiiiiiIIII[3];
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IiIIIiiiiIiiI.length) {
            this.IiIIIiiiiIiiI[IiiiiiiiIIIII] = new com.xy.i.IiiiiiiiiIIII("sc/e/39.png", 2, 133 + IiiiiiiiIIIII, iiIIiiiiIiiII.IIiiIiiiIIiIi, null, IiiiiiiiIIIII == 0 ? "\u57f9\u517b" : (IiiiiiiiIIIII == 1 ? "\u91cd\u94f8" : (IiiiiiiiIIIII == 2 ? "\u89c9\u9192" : "")), (IiiiIiiiiIiIi)this);
            this.IiIIIiiiiIiiI[IiiiiiiiIIIII].setOffsetTexts(iiIIiiiiIiiII.IiIIIiiiiiiiI);
            this.IiIIIiiiiIiiI[IiiiiiiiIIIII].setBounds(56 + 65 * IiiiiiiiIIIII, 30, 63, 24);
            this.add((Component)this.IiIIIiiiiIiiI[IiiiiiiiIIIII++]);
        }
        this.iiiIiiiiiiiIi = new com.xy.i.IiiiiiiiiIIII("sc/e/28.png", 1, 141, iiIIiiiiIiiII.iiIiiiiiiIIiI, null, "\u5151\u6362\u5956\u52b1", (IiiiIiiiiIiIi)this);
        this.iiiIiiiiiiiIi.setBounds(49, 420, 68, 18);
        this.add((Component)this.iiiIiiiiiiiIi);
        this.iIiiIiiiIiIIi = new com.xy.i.IiiiiiiiiIIII("sc/e/28.png", 1, 142, iiIIiiiiIiiII.iiIiiiiiiIIiI, null, "\u5df2\u7a7f\u88c5\u5907", (IiiiIiiiiIiIi)this);
        this.iiiiIiiiIIiii = new com.xy.i.IiiiiiiiiIIII("sc/e/7.png", 1, 143, iiIIiiiiIiiII.iiiiIiiiIiiII, iiIIiiiiIiiII.IIiiiiiiIiiII, "\u57f9\u517b", (IiiiIiiiiIiIi)this);
        this.add((Component)this.iIiiIiiiIiIIi);
        this.add((Component)this.iiiiIiiiIIiii);
        this.iiIiIiiiiIIIi = new iIiIIiiiIIIiI[6];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iiIiIiiiiIIIi.length) {
            this.iiIiIiiiiIIIi[IiiiiiiiIIIII] = new iIiIIiiiIIIiI((IiiiIiiiiIiIi)this);
            this.add((Component)this.iiIiIiiiiIIIi[IiiiiiiiIIIII++]);
        }
        this.ALLATORIxDEMO = new JLabel[6];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.ALLATORIxDEMO.length) {
            this.ALLATORIxDEMO[IiiiiiiiIIIII] = IiIIIiiiiIIiI.ALLATORIxDEMO((int)0, (int)0, (int)0, (int)0, (int)10, (Color)Color.white, (Font)iiIIiiiiIiiII.iIIiiiiiiIIII);
            if (IiiiiiiiIIIII == 0) {
                this.ALLATORIxDEMO[IiiiiiiiIIIII].setBounds(130, 68, 54, 18);
            } else if (IiiiiiiiIIIII == 1) {
                this.ALLATORIxDEMO[IiiiiiiiIIIII].setBounds(224, 68, 54, 18);
            } else if (IiiiiiiiIIIII == 2) {
                this.ALLATORIxDEMO[IiiiiiiiIIIII].setText("\u6d88\u8017\u91d1\u94b1");
            } else if (IiiiiiiiIIIII == 3) {
                this.ALLATORIxDEMO[IiiiiiiiIIIII].setText("\u62e5\u6709\u91d1\u94b1");
            } else if (IiiiiiiiIIIII == 4) {
                this.ALLATORIxDEMO[IiiiiiiiIIIII].setText("\u6d88\u8017\u5956\u7ae0");
            } else if (IiiiiiiiIIIII == 5) {
                this.ALLATORIxDEMO[IiiiiiiiIIIII].setText("\u62e5\u6709\u5956\u7ae0");
            }
            this.add(this.ALLATORIxDEMO[IiiiiiiiIIIII++]);
        }
        this.IIIiiiiiIIiII = new MoneyType();
        this.IIIiiiiiIIiII.setIdAndKey(1, "\u91d1\u94b1");
        this.iiiiIiiiIiiII = new MoneyType();
        this.iiiiIiiiIiiII.setIdAndKey(0, "\u6bd4\u6597\u5956\u7ae0");
        com.xy.w.IIiIiiiiIIiii IiiiiiiiIIIII2 = IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/17.png", (int)6, (int)6, (int)6, (int)6, (boolean)false);
        this.iiIIIiiiiiiiI = IiIIIiiiiIIiI.ALLATORIxDEMO((int)0, (int)0, (int)0, (int)0, (int)10, (Color)Color.white, (Font)iiIIiiiiIiiII.iIIIiiiiIIIii);
        this.IiIiiiiiIIIII = IiIIIiiiiIIiI.ALLATORIxDEMO((com.xy.w.IIiIiiiiIIiii)IiiiiiiiIIIII2, (Font)iiIIiiiiIiiII.iIIIiiiiIIIii, (Color)Color.white);
        this.IiiiiiiiIIIII = IiIIIiiiiIIiI.ALLATORIxDEMO((int)10, (Color)Color.white, (Font)iiIIiiiiIiiII.iIIIiiiiIIIii, (MoneyType)this.IIIiiiiiIIiII, (GameView)gameView);
        this.iIIiIiiiiiiIi = IiIIIiiiiIIiI.ALLATORIxDEMO((int)10, (Color)Color.white, (Font)iiIIiiiiIiiII.iIIIiiiiIIIii, (MoneyType)this.iiiiIiiiIiiII, (GameView)gameView);
        this.IiiiiiiiIIIII.ALLATORIxDEMO(2);
        this.iIIiIiiiiiiIi.ALLATORIxDEMO(2);
        this.iiIIIiiiiiiiI.ALLATORIxDEMO(IiiiiiiiIIIII2);
        this.IiiiiiiiIIIII.ALLATORIxDEMO(IiiiiiiiIIIII2);
        this.iIIiIiiiiiiIi.ALLATORIxDEMO(IiiiiiiiIIIII2);
        this.add((Component)this.iiIIIiiiiiiiI);
        this.add((Component)this.IiIiiiiiIIIII);
        this.add((Component)this.IiiiiiiiIIIII);
        this.add((Component)this.iIIiIiiiiiiIi);
        this.IiiiIiiiIiIII = new IIiIIiiiIIIiI(15, (JTextField)this.IiIiiiiiIIIII, (IiiiIiiiiIiIi)this);
        this.iIiiIiiiiiiII = new IIIiiiiiIiIiI[4];
        int IiiiiiiiIIIII3 = 0;
        while (IiiiiiiiIIIII3 < this.iIiiIiiiiiiII.length) {
            this.iIiiIiiiiiiII[IiiiiiiiIIIII3] = new IIIiiiiiIiIiI();
            if (IiiiiiiiIIIII3 == 0) {
                this.iIiiIiiiiiiII[IiiiiiiiIIIII3].setBounds(111 + IiiiiiiiIIIII3 * 94, 68, 18, 18);
                this.iIiiIiiiiiiII[IiiiiiiiIIIII3].addMouseListener((MouseListener)new IiiiiiiiiIIII(this));
            } else if (IiiiiiiiIIIII3 == 1) {
                this.iIiiIiiiiiiII[IiiiiiiiIIIII3].setBounds(111 + IiiiiiiiIIIII3 * 94, 68, 18, 18);
                this.iIiiIiiiiiiII[IiiiiiiiIIIII3].addMouseListener((MouseListener)new IIiIiiiiIIiii(this));
            } else if (IiiiiiiiIIIII3 == 2) {
                this.iIiiIiiiiiiII[IiiiiiiiIIIII3].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/19.png", (int)5, (int)5, (int)5, (int)5, (boolean)false));
                this.iIiiIiiiiiiII[IiiiiiiiIIIII3].setBounds(48, 313, 309, 105);
            } else if (IiiiiiiiIIIII3 == 3) {
                this.iIiiIiiiiiiII[IiiiiiiiIIIII3].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/49.png", (int)5, (int)5, (int)5, (int)5, (boolean)false));
                this.iIiiIiiiiiiII[IiiiiiiiIIIII3].setBounds(47, 54, 310, 260);
            }
            this.add((Component)this.iIiiIiiiiiiII[IiiiiiiiIIIII3++]);
        }
        this.IIIIiiiiiiiII = new IiIIIiiiIIiII((IiiiIiiiiIiIi)this, 6, 2, 51, 51, 0, 0, 49, 315);
        this.IIIIiiiiiiiII.ALLATORIxDEMO(IIIIIiiiIiiII.iiiIiiiiiiIIi((String)"sc/d/18.png"));
        this.add((Component)this.IIIIiiiiiiiII);
    }

    public void iiiIiiiiiiIIi(int type) {
        this.iiIiiiiiiiIii = type;
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IiIIIiiiiIiiI.length) {
            this.IiIIIiiiiIiiI[IiiiiiiiIIIII].setKeep(IiiiiiiiIIIII == this.iiIiiiiiiiIii);
            ++IiiiiiiiIIIII;
        }
        if (this.iiIiiiiiiiIii == 0) {
            this.ALLATORIxDEMO[0].setText("\u57f9\u517b");
            this.ALLATORIxDEMO[1].setText("\u5206\u89e3");
        } else if (this.iiIiiiiiiiIii == 1) {
            this.ALLATORIxDEMO[0].setText("\u91cd\u6d17\u5c5e\u6027");
            this.ALLATORIxDEMO[1].setText("\u91cd\u609f\u6280\u80fd");
        } else if (this.iiIiiiiiiiIii == 2) {
            this.ALLATORIxDEMO[0].setText("\u63d0\u5347\u7b49\u7ea7");
            this.ALLATORIxDEMO[1].setText("\u5f00\u542f\u89c9\u9192");
        }
        this.iIiIiiiiIIiii(0);
        this.IiiiiiiiIIIII.iIiIiiiiIIiii();
        this.iIIiIiiiiiiIi.iIiIiiiiIIiii();
    }

    public void ALLATORIxDEMO(long number, JTextField textField) {
    }

    public void ALLATORIxDEMO(BigDecimal sid) {
        if (this.IIiiIiiiIIiIi == null) {
            return;
        }
        RoleData IiiiiiiiIIIII = this.ALLATORIxDEMO();
        List<BigDecimal> IiiiiiiiIIIII2 = new ArrayList<BigDecimal>();
        int IiiiiiiiIIIII3 = 0;
        while (IiiiiiiiIIIII3 < IiiiiiiiIIIII.pets.size()) {
            String IiiiiiiiIIIII4;
            RoleSummoning IiiiiiiiIIIII5 = ((RolePet)IiiiiiiiIIIII.pets.get(IiiiiiiiIIIII3)).getPet();
            if ((sid == null || IiiiiiiiIIIII5.getSid().compareTo(sid) == 0) && (IiiiiiiiIIIII4 = IiiiiiiiIIIII5.getStye()) != null && IiiiiiiiIIIII4.length() > 1) {
                String[] IiiiiiiiIIIII6 = IiiiiiiiIIIII4.split("\\|");
                IiiiiiiiIIIII2 = this.ALLATORIxDEMO(IiiiiiiiIIIII2, IiiiiiiiIIIII6);
            }
            ++IiiiiiiiIIIII3;
        }
        this.IIiiIiiiIIiIi.IiIIIiiiiIiiI.ALLATORIxDEMO().iIiIiiiiIIiIi(0);
        this.IIiiIiiiIIiIi.IiIIIiiiiIiiI.ALLATORIxDEMO(IiiiiiiiIIIII2);
    }

    public void ALLATORIxDEMO(Goodstable goodstable) {
        if (GoodType.IIiIIiiiiiIiI((long)goodstable.getType())) {
            this.iiIiIiiiiIIIi[0].ALLATORIxDEMO(1, (Object)goodstable);
            if (this.iiIiiiiiiiIii != 2) return;
            if (this.iiIiiiiiiIIiI != 0) return;
            this.IIiiiiiiiIIIi.iiiIiiiiiiIIi();
            return;
        }
        if (this.iiIiiiiiiiIii == 0 && this.iiIiiiiiiIIiI == 0) {
            if (goodstable.getType() != 513L) return;
            this.iiIiIiiiiIIIi[1].ALLATORIxDEMO(1, (Object)goodstable);
            return;
        }
        if (this.iiIiiiiiiiIii == 1 && this.iiIiiiiiiIIiI == 0) {
            if (goodstable.getType() == 513L) {
                this.iiIiIiiiiIIIi[1].ALLATORIxDEMO(1, (Object)goodstable);
                return;
            }
            if (goodstable.getType() == 497L) {
                this.iiIiIiiiiIIIi[2].ALLATORIxDEMO(1, (Object)goodstable);
                return;
            }
            if (goodstable.getType() != 498L) return;
            this.iiIiIiiiiIIIi[3].ALLATORIxDEMO(1, (Object)goodstable);
            this.iiIiIiiiiIIIi[4].ALLATORIxDEMO(1, (Object)goodstable);
            this.iiIiIiiiiIIIi[5].ALLATORIxDEMO(1, (Object)goodstable);
            return;
        }
        if (this.iiIiiiiiiiIii == 1 && this.iiIiiiiiiIIiI == 1) {
            if (goodstable.getType() != 515L) return;
            this.iiIiIiiiiIIIi[1].ALLATORIxDEMO(1, (Object)goodstable);
            return;
        }
        if (this.iiIiiiiiiiIii != 2) return;
        if (this.iiIiiiiiiIIiI != 1) return;
        if (goodstable.getType() != 514L) return;
        this.iiIiIiiiiIIIi[1].ALLATORIxDEMO(1, (Object)goodstable);
    }

    static /* synthetic */ iIiIIiiiIIIiI[] ALLATORIxDEMO(IiIIIiiiiiiIi arg0) {
        return arg0.iiIiIiiiiIIIi;
    }

    public iIiIIiiiIIIiI[] ALLATORIxDEMO() {
        return this.iiIiIiiiiIIIi;
    }

    public void iIiIiiiiIIiii() {
        this.iiiIiiiiiiIIi(0);
        super.iIiIiiiiIIiii();
    }

    public boolean ALLATORIxDEMO(long number, JTextField textField) {
        return true;
    }

    /*
     * Unable to fully structure code
     */
    public void iIiIiiiiIIiii(int type) {
        block10: {
            if (this.iiIiiiiiiIIiI != type) {
                this.iIiiIiiiiiiII[0].iIiIiiiiIIiii(type == 0 ? "sc/e/67.png" : "sc/e/68.png");
                this.iIiiIiiiiiiII[1].iIiIiiiiIIiii(type == 1 ? "sc/e/67.png" : "sc/e/68.png");
            }
            this.iiIiiiiiiIIiI = type;
            this.iiiIiiiiiiIIi(false);
            this.iIiiIiiiIiIIi.setVisible(false);
            IiiiiiiiIIIII = 2;
            while (IiiiiiiiIIIII < this.ALLATORIxDEMO.length) {
                this.ALLATORIxDEMO[IiiiiiiiIIIII++].setVisible(false);
            }
            this.iiIIIiiiiiiiI.setVisible(false);
            this.IiIiiiiiIIIII.setVisible(false);
            this.IiiiiiiiIIIII.setVisible(false);
            this.iIIiIiiiiiiIi.setVisible(false);
            IiiiiiiiIIIII = 0;
            while (IiiiiiiiIIIII < this.iiIiIiiiiIIIi.length) {
                this.iiIiIiiiiIIIi[IiiiiiiiIIIII].ALLATORIxDEMO(0, null);
                this.iiIiIiiiiIIIi[IiiiiiiiIIIII++].setVisible(false);
            }
            if (this.IIiiiiiiiIIIi != null) {
                this.IIiiiiiiiIIIi.setVisible(false);
            }
            if (this.iiIiiiiiiiIii == 0 && this.iiIiiiiiiIIiI == 0) {
                this.iiIiIiiiiIIIi[0].setBounds(115, 118, 59, 58);
                this.iiIiIiiiiIIIi[1].setBounds(231, 118, 59, 58);
                this.iiIiIiiiiIIIi[0].ALLATORIxDEMO("\u88c5\u5907");
                this.iiIiIiiiiIIIi[1].ALLATORIxDEMO("\u7384\u94c1\u6676\u77f3");
                this.iIiiIiiiIiIIi.setBounds(114, 100, 61, 18);
                this.iIiiIiiiIiIIi.setVisible(true);
                this.iiiiIiiiIIiii.setText("\u57f9\u517b");
                this.iiiiIiiiIIiii.setBounds(170, 272, 59, 25);
                this.ALLATORIxDEMO[2].setBounds(98, 204, 72, 19);
                this.ALLATORIxDEMO[2].setVisible(true);
                this.ALLATORIxDEMO[3].setBounds(98, 227, 72, 19);
                this.ALLATORIxDEMO[3].setVisible(true);
                this.iiIIIiiiiiiiI.setBounds(170, 204, 124, 19);
                this.iiIIIiiiiiiiI.setVisible(true);
                this.IiiiiiiiIIIII.setBounds(170, 227, 124, 19);
                this.IiiiiiiiIIIII.setVisible(true);
                this.iIiIiiiiIiIii = this.ALLATORIxDEMO().ALLATORIxDEMO(2, 8) != false ? new BigDecimal(1000000) : (this.ALLATORIxDEMO().ALLATORIxDEMO(2, 12) != false ? new BigDecimal(100000) : new BigDecimal(50000000));
                iiIIiiiiIiiII.ALLATORIxDEMO((JLabel)this.iiIIIiiiiiiiI, (long)this.iIiIiiiiIiIii.longValue());
                return;
            }
            if (this.iiIiiiiiiiIii == 0 && this.iiIiiiiiiIIiI == 1) {
                this.iiIiIiiiiIIIi[0].setBounds(165, 118, 59, 58);
                this.iiIiIiiiiIIIi[0].ALLATORIxDEMO("\u88c5\u5907");
                this.iiiiIiiiIIiii.setText("\u5206\u89e3");
                this.iiiiIiiiIIiii.setBounds(170, 272, 59, 25);
                this.iIiIiiiiIiIii = null;
                this.iiIIIiiiiiiiI.setText(null);
                return;
            }
            if (this.iiIiiiiiiiIii != 1 || this.iiIiiiiiiIIiI != 0) break block10;
            this.iiIiIiiiiIIIi[0].setBounds(165, 114, 59, 58);
            IiiiiiiiIIIII = 1;
            if (true) ** GOTO lbl135
        }
        if (this.iiIiiiiiiiIii == 1 && this.iiIiiiiiiIIiI == 1) {
            this.iiIiIiiiiIIIi[0].setBounds(115, 118, 59, 58);
            this.iiIiIiiiiIIIi[1].setBounds(231, 118, 59, 58);
            this.iiIiIiiiiIIIi[0].ALLATORIxDEMO("\u88c5\u5907");
            this.iiIiIiiiiIIIi[1].ALLATORIxDEMO("\u9690\u6708\u795e\u77f3");
            this.iIiiIiiiIiIIi.setBounds(114, 100, 61, 18);
            this.iIiiIiiiIiIIi.setVisible(true);
            this.iiiiIiiiIIiii.setText("\u91cd\u609f");
            this.iiiiIiiiIIiii.setBounds(170, 272, 59, 25);
            this.ALLATORIxDEMO[2].setBounds(98, 204, 72, 19);
            this.ALLATORIxDEMO[2].setVisible(true);
            this.ALLATORIxDEMO[3].setBounds(98, 227, 72, 19);
            this.ALLATORIxDEMO[3].setVisible(true);
            this.iiIIIiiiiiiiI.setBounds(170, 204, 124, 19);
            this.iiIIIiiiiiiiI.setVisible(true);
            this.IiiiiiiiIIIII.setBounds(170, 227, 124, 19);
            this.IiiiiiiiIIIII.setVisible(true);
            this.iIiIiiiiIiIii = this.ALLATORIxDEMO().ALLATORIxDEMO(2, 12) != false ? new BigDecimal(1000000) : new BigDecimal(5000000);
            iiIIiiiiIiiII.ALLATORIxDEMO((JLabel)this.iiIIIiiiiiiiI, (long)this.iIiIiiiiIiIii.longValue());
            return;
        }
        if (this.iiIiiiiiiiIii == 2 && this.iiIiiiiiiIIiI == 0) {
            this.iiIiIiiiiIIIi[0].setBounds(85, 105, 59, 58);
            this.iiIiIiiiiIIIi[0].ALLATORIxDEMO("\u88c5\u5907");
            this.iIiiIiiiIiIIi.setBounds(85, 88, 61, 18);
            this.iIiiIiiiIiIIi.setVisible(true);
            this.iiiiIiiiIIiii.setText("\u63d0\u5347");
            this.iiiiIiiiIIiii.setBounds(170, 278, 59, 25);
            this.ALLATORIxDEMO[2].setBounds(100, 229, 58, 20);
            this.ALLATORIxDEMO[2].setVisible(true);
            this.ALLATORIxDEMO[3].setBounds(100, 252, 58, 20);
            this.ALLATORIxDEMO[3].setVisible(true);
            this.iiIIIiiiiiiiI.setBounds(161, 229, 124, 20);
            this.iiIIIiiiiiiiI.setVisible(true);
            this.IiiiiiiiIIIII.setBounds(161, 252, 124, 20);
            this.IiiiiiiiIIIII.setVisible(true);
            this.ALLATORIxDEMO[4].setBounds(100, 168, 58, 20);
            this.ALLATORIxDEMO[4].setVisible(true);
            this.ALLATORIxDEMO[5].setBounds(100, 191, 58, 20);
            this.ALLATORIxDEMO[5].setVisible(true);
            this.IiIiiiiiIIIII.setBounds(161, 168, 124, 20);
            this.IiIiiiiiIIIII.setVisible(true);
            this.iIIiIiiiiiiIi.setBounds(161, 191, 124, 20);
            this.iIIiIiiiiiiIi.setVisible(true);
            this.iIiIiiiiIiIii = new BigDecimal(6000);
            iiIIiiiiIiiII.ALLATORIxDEMO((JLabel)this.iiIIIiiiiiiiI, (long)this.iIiIiiiiIiIii.longValue());
            if (this.IIiiiiiiiIIIi == null) {
                this.IIiiiiiiiIIIi = new IIiiIiiiIiiiI(this);
                this.IIiiiiiiiIIIi.setBounds(149, 106, 165, 56);
                this.add((Component)this.IIiiiiiiiIIIi, 1);
            }
            this.IIiiiiiiiIIIi.iiiIiiiiiiIIi();
            this.IIiiiiiiiIIIi.setVisible(true);
            this.IiIiiiiiIIIII.setText("0");
            return;
        }
        if (this.iiIiiiiiiiIii != 2) return;
        if (this.iiIiiiiiiIIiI != 1) return;
        this.iiIiIiiiiIIIi[0].setBounds(115, 118, 59, 58);
        this.iiIiIiiiiIIIi[1].setBounds(231, 118, 59, 58);
        this.iiIiIiiiiIIIi[0].ALLATORIxDEMO("\u88c5\u5907");
        this.iiIiIiiiiIIIi[1].ALLATORIxDEMO("\u5343\u5e74\u9b42\u77f3");
        this.iIiiIiiiIiIIi.setBounds(114, 100, 61, 18);
        this.iIiiIiiiIiIIi.setVisible(true);
        this.iiiiIiiiIIiii.setText("\u5f00\u542f");
        this.iiiiIiiiIIiii.setBounds(170, 272, 59, 25);
        this.ALLATORIxDEMO[2].setBounds(98, 204, 72, 19);
        this.ALLATORIxDEMO[2].setVisible(true);
        this.ALLATORIxDEMO[3].setBounds(98, 227, 72, 19);
        this.ALLATORIxDEMO[3].setVisible(true);
        this.iiIIIiiiiiiiI.setBounds(170, 204, 124, 19);
        this.iiIIIiiiiiiiI.setVisible(true);
        this.IiiiiiiiIIIII.setBounds(170, 227, 124, 19);
        this.IiiiiiiiIIIII.setVisible(true);
        this.iIiIiiiiIiIii = this.ALLATORIxDEMO().ALLATORIxDEMO(2, 12) != false ? new BigDecimal(2000000) : new BigDecimal(10000000);
        iiIIiiiiIiiII.ALLATORIxDEMO((JLabel)this.iiIIIiiiiiiiI, (long)this.iIiIiiiiIiIii.longValue());
        return;
        do {
            v0 = this.iiIiIiiiiIIIi[IiiiiiiiIIIII];
            v1 = 54 + (IiiiiiiiIIIII - 1) * 59;
            ++IiiiiiiiIIIII;
            v0.setBounds(v1, 177, 59, 58);
lbl135:
            // 2 sources

        } while (IiiiiiiiIIIII < this.iiIiIiiiiIIIi.length);
        this.iiIiIiiiiIIIi[0].ALLATORIxDEMO("\u88c5\u5907");
        this.iiIiIiiiiIIIi[1].ALLATORIxDEMO("\u7384\u94c1\u6676\u77f3");
        this.iiIiIiiiiIIIi[2].ALLATORIxDEMO("\u5185\u4e39\u7cbe\u534e");
        this.iiIiIiiiiIIIi[3].ALLATORIxDEMO("\u4e5d\u5f69");
        this.iiIiIiiiiIIIi[4].ALLATORIxDEMO("\u4e5d\u5f69");
        this.iiIiIiiiiIIIi[5].ALLATORIxDEMO("\u4e5d\u5f69");
        this.iIiiIiiiIiIIi.setBounds(164, 96, 61, 18);
        this.iIiiIiiiIiIIi.setVisible(true);
        this.iiiiIiiiIIiii.setText("\u91cd\u6d17");
        this.iiiiIiiiIIiii.setBounds(170, 284, 59, 25);
        this.ALLATORIxDEMO[2].setBounds(98, 237, 72, 19);
        this.ALLATORIxDEMO[2].setVisible(true);
        this.ALLATORIxDEMO[3].setBounds(98, 260, 72, 19);
        this.ALLATORIxDEMO[3].setVisible(true);
        this.iiIIIiiiiiiiI.setBounds(170, 237, 124, 19);
        this.iiIIIiiiiiiiI.setVisible(true);
        this.IiiiiiiiIIIII.setBounds(170, 260, 124, 19);
        this.IiiiiiiiIIIII.setVisible(true);
        this.iIiIiiiiIiIii = this.ALLATORIxDEMO().ALLATORIxDEMO(2, 12) != false ? new BigDecimal(100000) : new BigDecimal(1000000);
        iiIIiiiiIiiII.ALLATORIxDEMO((JLabel)this.iiIIIiiiiiiiI, (long)this.iIiIiiiiIiIii.longValue());
    }
}
