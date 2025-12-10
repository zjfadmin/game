/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.iIIiiiiiIIIIi
 *  com.xy.bean.SuitOperBean
 *  com.xy.entity.PartJade
 *  com.xy.formula.GoodType
 *  com.xy.i.IiIiIiiiiIIiI
 *  com.xy.q.IIIiiiiiIiIiI
 *  com.xy.q.IIiIIiiiIIIiI
 *  com.xy.q.IiIIIiiiiIIiI
 *  com.xy.q.IiiiIiiiiIiII
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.readbean.Goodstable
 *  com.xy.socket.Agreement
 *  com.xy.text.GameView
 *  com.xy.v.IIiiIiiiiIIiI
 *  com.xy.v.iIiIIiiiIiiiI
 *  com.xy.v.iiIIiiiiIiiII
 *  com.xy.v.iiIiiiiiIIiii
 *  com.xy.w.IIIIIiiiIiiII
 *  com.xy.w.IIIiiiiiIiIiI
 *  com.xy.w.IIiIiiiiIIiii
 */
package com.xy.a.a;

import com.xy.a.iIIiiiiiIIIIi;
import com.xy.bean.SuitOperBean;
import com.xy.entity.PartJade;
import com.xy.formula.GoodType;
import com.xy.i.IiIiIiiiiIIiI;
import com.xy.q.IIiIIiiiIIIiI;
import com.xy.q.IiIIIiiiiIIiI;
import com.xy.q.IiiiIiiiiIiII;
import com.xy.q.IiiiIiiiiIiIi;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.readbean.Goodstable;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import com.xy.v.IIiiIiiiiIIiI;
import com.xy.v.iIiIIiiiIiiiI;
import com.xy.v.iiIiiiiiIIiii;
import com.xy.w.IIIIIiiiIiiII;
import com.xy.w.IIIiiiiiIiIiI;
import com.xy.w.IIiIiiiiIIiii;
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
public class iIiIiiiiiiiIi
extends IiiiIiiiiIiIi {
    private com.xy.v.iiIIiiiiIiiII[] IIIIiiiiiiiII;
    private BigDecimal iiIIIiiiiiiiI;
    private IiIiIiiiiIIiI[] IiIiiiiiIIIII;
    private BigDecimal iiIiIiiiiIIIi;
    private com.xy.q.IIIiiiiiIiIiI iiiiIiiiIiiII;
    private int iiiIiiiiiiiIi;
    private int iIiiIiiiiiiII;
    private String IIiiIiiiIIiIi;
    private IIiIIiiiIIIiI iIiIiiiiIiIii;
    private IiiiIiiiiIiII IiIIIiiiiIiiI;
    private int iiIiiiiiiiIii;
    private JLabel[] IiiiiiiiIIIII;
    private IIIiiiiiIiIiI[] ALLATORIxDEMO;

    public void ALLATORIxDEMO(BigDecimal id, com.xy.v.iiIIiiiiIiiII[] longs, Goodstable goodstable) {
        this.IIiiIiiiIIiIi = null;
        this.iIiiIiiiiiiII = 12;
        this.iiIIIiiiiiiiI = id;
        this.IIIIiiiiiiiII = longs;
        this.iiiIiiiiiiiIi = this.ALLATORIxDEMO().ALLATORIxDEMO(longs);
        this.iiIiiiiiiiIii = 1;
        this.iiiiIiiiIiiII.ALLATORIxDEMO(1, (Object)goodstable);
        this.IiiiiiiiIIIII[1].setText(goodstable.getGoodsname());
        this.IiiiiiiiIIIII[2].setText("\u53ef\u5151\u6362\u6b21\u6570:" + this.iiiIiiiiiiiIi);
        this.iIiIiiiiIIiii(132);
        this.ALLATORIxDEMO().iIiIiiiiIIiIi(this.iIiIiiiiIIiii());
    }

    public void ALLATORIxDEMO(Goodstable good) {
        if (good.getType() != 721L) {
            return;
        }
        this.IIiiIiiiIIiIi = null;
        this.iIiiIiiiiiiII = 13;
        this.iiIIIiiiiiiiI = good.getRgid();
        this.iiiIiiiiiiiIi = good.getUsetime();
        this.iiIiiiiiiiIii = 1;
        this.iiiiIiiiIiiII.ALLATORIxDEMO(1, (Object)good);
        if (good.getType() == 721L) {
            this.iiIiiiiiiiIii = 3;
            this.IiiiiiiiIIIII[1].setText("\u5151\u6362\u7075\u5143\u6676");
        }
        this.IiiiiiiiIIIII[2].setText("\u53ef\u5151\u6362\u6b21\u6570:" + this.iiiIiiiiiiiIi / this.iiIiiiiiiiIii);
        this.iIiIiiiiIIiii(132);
        this.ALLATORIxDEMO().iIiIiiiiIIiIi(this.iIiIiiiiIIiii());
    }

    public void ALLATORIxDEMO(long number, JTextField textField) {
    }

    public boolean ALLATORIxDEMO(long number, JTextField textField) {
        return true;
    }

    public void ALLATORIxDEMO(int type, BigDecimal id, Goodstable goodstable) {
        this.IIiiIiiiIIiIi = null;
        this.IIIIiiiiiiiII = null;
        this.iIiiIiiiiiiII = type;
        this.iiIIIiiiiiiiI = id;
        this.iiIiIiiiiIIIi = goodstable.getRgid();
        this.iiiIiiiiiiiIi = goodstable.getUsetime();
        this.iiIiiiiiiiIii = 1;
        if (goodstable.getType() == 118L) {
            this.iiIiiiiiiiIii = Math.max(this.iiIiiiiiiiIii, IIiiIiiiiIIiI.ALLATORIxDEMO((String)goodstable.getValue(), (String)"\u9700\u8981\u6570\u91cf=", (String)"|"));
        }
        this.iiiiIiiiIiiII.ALLATORIxDEMO(1, (Object)goodstable);
        this.IiiiiiiiIIIII[1].setText(goodstable.getGoodsname());
        this.IiiiiiiiIIIII[2].setText("\u62e5\u6709\u6570\u91cf:" + this.iiiIiiiiiiiIi / this.iiIiiiiiiiIii);
        this.iIiIiiiiIIiii(132);
        this.ALLATORIxDEMO().iIiIiiiiIIiIi(this.iIiIiiiiIIiii());
    }

    public void ALLATORIxDEMO(BigDecimal id, String key) {
        this.IIIIiiiiiiiII = null;
        this.iIiiIiiiiiiII = 11;
        this.iiIIIiiiiiiiI = id;
        this.IIiiIiiiIIiIi = key;
        this.iiiIiiiiiiiIi = (int)this.ALLATORIxDEMO().getLoginResult().getContribution().longValue();
        this.iiIiiiiiiiIii = 1500;
        this.iiiiIiiiIiiII.ALLATORIxDEMO(16, (Object)2019);
        this.IiiiiiiiIIIII[1].setText(key.substring(2));
        this.IiiiiiiiIIIII[2].setText("\u9a6f\u517b\u6b21\u6570:" + this.iiiIiiiiiiiIi / this.iiIiiiiiiiIii);
        this.iIiIiiiiIIiii(132);
        this.ALLATORIxDEMO().iIiIiiiiIIiIi(this.iIiIiiiiIIiii());
    }

    /*
     * Unable to fully structure code
     */
    public void iIiIiiiiIIiii(int btnId) {
        block41: {
            if (btnId == 131) {
                this.IiIIIiiiiIiiI.setText("1");
                return;
            }
            if (btnId == 132) {
                if (this.iIiiIiiiiiiII == 11 || this.iIiiIiiiiiiII == 12 || this.iIiiIiiiiiiII == 13) {
                    this.IiIIIiiiiIiiI.setText(String.valueOf(this.iiiIiiiiiiiIi / this.iiIiiiiiiiIii));
                    return;
                }
                IiiiiiiiIIIII = this.ALLATORIxDEMO().getGood(this.iiIiIiiiiIIIi);
                if (IiiiiiiiIIIII == null) {
                    return;
                }
                IiiiiiiiIIIII = IiiiiiiiIIIII.getUsetime();
                if (IiiiiiiiIIIII.getType() == 118L && IiiiiiiiIIIII.getGoodsid().intValue() != 81229 && IIiiIiiiiIIiI.ALLATORIxDEMO((String)IiiiiiiiIIIII.getValue(), (String)"\u8bfb\u6761=", (String)"|") == 0L) {
                    IiiiiiiiIIIII = Math.min(10, IiiiiiiiIIIII);
                }
                this.IiIIIiiiiIiiI.setText(String.valueOf(IiiiiiiiIIIII));
                return;
            }
            if (btnId == 133) {
                this.ALLATORIxDEMO().iiiIiiiiiiIIi(this.iIiIiiiiIIiii());
                return;
            }
            if (btnId != 134) return;
            if (this.iIiiIiiiiiiII == 11) {
                IiiiiiiiIIIII = Math.min((int)this.iIiIiiiiIiIii.ALLATORIxDEMO(), this.iiiIiiiiiiiIi / this.iiIiiiiiiiIii);
                v0 = this.IIiiIiiiIIiIi.equals("\u6279\u91cf\u9a6f\u517b\u53c2\u6218\u53ec\u5524\u517d\u4eb2\u5bc6") != false ? 53 : (this.IIiiIiiiIIiIi.equals("\u6279\u91cf\u9a6f\u517b\u5750\u9a91\u7ecf\u9a8c") != false ? 54 : (this.IIiiIiiiIIiIi.equals("\u6279\u91cf\u9a6f\u517b\u5750\u9a91\u6280\u80fd\u719f\u7ec3\u5ea6") != false ? 55 : (this.IIiiIiiiIIiIi.equals("\u6279\u91cf\u9a6f\u517b\u7075\u5b9d\u5951\u5408") != false ? 56 : (this.IIiiIiiiIIiIi.equals("\u6279\u91cf\u9a6f\u517b\u7075\u5b9d\u7ecf\u9a8c") != false ? 57 : (IiiiiiiiIIIII = this.IIiiIiiiIIiIi.equals("\u6279\u91cf\u9a6f\u517b\u9996\u4e2a\u53c2\u6218\u6cd5\u5b9d\u7ecf\u9a8c") != false ? 58 : 0)))));
                if (IiiiiiiiIIIII > 0 && IiiiiiiiIIIII != 0) {
                    IiiiiiiiIIIII = Agreement.getSendTextAES((String)"gangbattle", (String)(String.valueOf(IiiiiiiiIIIII) + "|" + this.iiIIIiiiiiiiI + "|" + IiiiiiiiIIIII));
                    this.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII);
                    this.ALLATORIxDEMO().iiiIiiiiiiIIi(this.iIiIiiiiIIiii());
                    return;
                }
                this.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u6570\u91cf\u4e0d\u80fd\u4e3a0");
                return;
            }
            if (this.iIiiIiiiiiiII != 12) break block41;
            IiiiiiiiIIIII = this.ALLATORIxDEMO();
            IiiiiiiiIIIII = Math.min((int)this.iIiIiiiiIiIii.ALLATORIxDEMO(), IiiiiiiiIIIII.ALLATORIxDEMO(this.IIIIiiiiiiiII));
            if (IiiiiiiiIIIII <= 0) {
                this.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u6570\u91cf\u4e0d\u80fd\u4e3a0");
                return;
            }
            IiiiiiiiIIIII = this.ALLATORIxDEMO().ALLATORIxDEMO(this.iiIIIiiiiiiiI);
            if (IiiiiiiiIIIII == null || IiiiiiiiIIIII.getGoodPackSum(IiiiiiiiIIIII.getType().longValue(), IiiiiiiiIIIII.getGoodsid(), IiiiiiiiIIIII) < IiiiiiiiIIIII) {
                this.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u80cc\u5305\u5df2\u6ee1");
                return;
            }
            IiiiiiiiIIIII = new com.xy.v.iiIIiiiiIiiII[this.IIIIiiiiiiiII.length];
            IiiiiiiiIIIII = 0;
            if (true) ** GOTO lbl135
        }
        if (this.iIiiIiiiiiiII == 13) {
            IiiiiiiiIIIII = this.ALLATORIxDEMO().getGood(this.iiIIIiiiiiiiI);
            if (IiiiiiiiIIIII == null) {
                this.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u7269\u54c1\u5df2\u4e0d\u5b58\u5728");
                return;
            }
            IiiiiiiiIIIII = Math.min((int)this.iIiIiiiiIiIii.ALLATORIxDEMO(), IiiiiiiiIIIII.getUsetime() / this.iiIiiiiiiiIii);
            if (IiiiiiiiIIIII <= 0) {
                this.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u6570\u91cf\u4e0d\u80fd\u4e3a0");
                return;
            }
            IiiiiiiiIIIII = new PartJade(IiiiiiiiIIIII.getRgid().longValue(), IiiiiiiiIIIII);
            IiiiiiiiIIIII = new SuitOperBean();
            IiiiiiiiIIIII.setType(24);
            IiiiiiiiIIIII.setJade(IiiiiiiiIIIII);
            IiiiiiiiIIIII = Agreement.getSendTextAES((String)"suitoperate", (String)iiIiiiiiIIiii.ALLATORIxDEMO().toJson(IiiiiiiiIIIII));
            this.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII);
            this.ALLATORIxDEMO().iiiIiiiiiiIIi(this.iIiIiiiiIIiii());
            return;
        }
        IiiiiiiiIIIII = this.ALLATORIxDEMO().getGood(this.iiIiIiiiiIIIi);
        if (IiiiiiiiIIIII == null) {
            this.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u7269\u54c1\u5df2\u4e0d\u5b58\u5728");
            return;
        }
        IiiiiiiiIIIII = Math.min((int)this.iIiIiiiiIiIii.ALLATORIxDEMO(), IiiiiiiiIIIII.getUsetime() / this.iiIiiiiiiiIii);
        if (IiiiiiiiIIIII <= 0) {
            this.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u6570\u91cf\u4e0d\u80fd\u4e3a0");
            return;
        }
        IiiiiiiiIIIII = IiiiiiiiIIIII.getType();
        if (this.iIiiIiiiiiiII == 0) {
            if (IiiiiiiiIIIII != 88L && IiiiiiiiIIIII != 112L && IiiiiiiiIIIII != 151L && !GoodType.iiiIiiiiiIiii((long)IiiiiiiiIIIII) && !GoodType.IIiiiiiiIIiiI((long)IiiiiiiiIIIII)) {
                if (IiiiiiiiIIIII == 132L) {
                    IiiiiiiiIIIII = (iIIiiiiiIIIIi)this.ALLATORIxDEMO().getFormManagement().iiiIiiiiiiIIi(27);
                    IiiiiiiiIIIII.ALLATORIxDEMO(IiiiiiiiIIIII, IiiiiiiiIIIII);
                    this.ALLATORIxDEMO().iiiIiiiiiiIIi(this.iIiIiiiiIIiii());
                    return;
                }
                if (IiiiiiiiIIIII == 118L) {
                    IiiiiiiiIIIII = this.ALLATORIxDEMO();
                    if (IiiiiiiiIIIII.getGoodPackSum(-1L, new BigDecimal(-1), 1) == 0) {
                        this.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u4f60\u7684\u80cc\u5305\u5df2\u6ee1");
                        return;
                    }
                    IiiiiiiiIIIII = IIiiIiiiiIIiI.ALLATORIxDEMO((String)IiiiiiiiIIIII.getValue(), (String)"\u8bfb\u6761=", (String)"|");
                    if (IiiiiiiiIIIII > 0L) {
                        this.iiIIiiiiIiIIi.getGameReadBar().setReadBar(IiiiiiiiIIIII, 3, "(" + IiiiiiiiIIIII + ")\u5f00\u542f" + IiiiiiiiIIIII.getGoodsname(), (double)Math.max(300L, IiiiiiiiIIIII), iIiIIiiiIiiiI.ALLATORIxDEMO(), (Object)IiiiiiiiIIIII.getRgid());
                        this.ALLATORIxDEMO().iiiIiiiiiiIIi(this.iIiIiiiiIIiii());
                        return;
                    }
                    IiiiiiiiIIIII.ALLATORIxDEMO(IiiiiiiiIIIII * this.iiIiiiiiiiIii);
                    if (IiiiiiiiIIIII.getUsetime() <= 0) {
                        this.ALLATORIxDEMO().iIiIiiiiIIiii(IiiiiiiiIIIII.getRgid());
                    }
                } else {
                    IiiiiiiiIIIII.ALLATORIxDEMO(IiiiiiiiIIIII * this.iiIiiiiiiiIii);
                    if (IiiiiiiiIIIII.getUsetime() <= 0) {
                        this.ALLATORIxDEMO().iIiIiiiiIIiii(IiiiiiiiIIIII.getRgid());
                    }
                }
            }
            IiiiiiiiIIIII = Agreement.getSendTextAES((String)"user", (String)(String.valueOf(IiiiiiiiIIIII.getRgid().toString()) + "|" + IiiiiiiiIIIII));
            this.iiIIiiiiIiIIi.getClient().ALLATORIxDEMO(IiiiiiiiIIIII);
        } else if (this.iIiiIiiiiiiII == 1) {
            IiiiiiiiIIIII = this.ALLATORIxDEMO().getPet(this.iiIIIiiiiiiiI);
            if (IiiiiiiiIIIII == null) {
                this.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u53ec\u5524\u517d\u5df2\u4e0d\u5b58\u5728");
                return;
            }
            if (IiiiiiiiIIIII == 715L) {
                if (IiiiiiiiIIIII.getFriendliness() >= 20000000L) {
                    this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u8be5\u53ec\u5524\u517d\u7684\u4eb2\u5bc6\u503c\u5df2\u6ee1\uff01");
                    return;
                }
            } else if (IiiiiiiiIIIII != 2040L && IiiiiiiiIIIII != 1005L && IiiiiiiiIIIII == 2323L && IiiiiiiiIIIII.getPetSkills().indexOf("3034") == -1) {
                this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u8be5\u53ec\u5524\u517d\u6ca1\u6709???");
                return;
            }
            IiiiiiiiIIIII = Agreement.getSendTextAES((String)"userpet", (String)(String.valueOf(IiiiiiiiIIIII.getRgid().toString()) + "|" + IiiiiiiiIIIII.getSid() + "|" + IiiiiiiiIIIII));
            this.iiIIiiiiIiIIi.getClient().ALLATORIxDEMO(IiiiiiiiIIIII);
        } else if (this.iIiiIiiiiiiII != 2) {
            if (this.iIiiIiiiiiiII == 3) {
                IiiiiiiiIIIII = this.ALLATORIxDEMO().getBaby(this.iiIIIiiiiiiiI);
                if (IiiiiiiiIIIII == null) {
                    this.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u5b69\u5b50\u5df2\u4e0d\u5b58\u5728");
                    return;
                }
                if (IiiiiiiiIIIII != 133L) {
                    // empty if block
                }
                IiiiiiiiIIIII = Agreement.getSendTextAES((String)"userbaby", (String)(IiiiiiiiIIIII.getRgid() + "|" + IiiiiiiiIIIII.getBabyid() + "|" + IiiiiiiiIIIII));
                this.iiIIiiiiIiIIi.getClient().ALLATORIxDEMO(IiiiiiiiIIIII);
            } else if (this.iIiiIiiiiiiII == 4) {
                IiiiiiiiIIIII = this.ALLATORIxDEMO().getLingbao(this.iiIIIiiiiiiiI);
                if (IiiiiiiiIIIII == null) {
                    this.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u7075\u5b9d\u6216\u6cd5\u5b9d\u5df2\u4e0d\u5b58\u5728");
                    return;
                }
                IiiiiiiiIIIII = Agreement.getSendTextAES((String)"userling", (String)(IiiiiiiiIIIII.getRgid() + "|" + IiiiiiiiIIIII.getBaoid() + "|" + IiiiiiiiIIIII));
                this.iiIIiiiiIiIIi.getClient().ALLATORIxDEMO(IiiiiiiiIIIII);
            }
        }
        this.ALLATORIxDEMO().iiiIiiiiiiIIi(this.iIiIiiiiIIiii());
        return;
        do {
            IiiiiiiiIIIII[IiiiiiiiIIIII++] = new com.xy.v.iiIIiiiiIiiII(this.IIIIiiiiiiiII[IiiiiiiiIIIII].ALLATORIxDEMO, this.IIIIiiiiiiiII[IiiiiiiiIIIII].IiiiiiiiIIIII * (long)IiiiiiiiIIIII);
lbl135:
            // 2 sources

        } while (IiiiiiiiIIIII < IiiiiiiiIIIII.length);
        IiiiiiiiIIIII = IiiiiiiiIIIII.ALLATORIxDEMO(IiiiiiiiIIIII);
        if (IiiiiiiiIIIII == null) {
            this.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u7269\u54c1\u4e0d\u8db3");
            return;
        }
        IiiiiiiiIIIII = new PartJade(10L, this.iiIIIiiiiiiiI.intValue());
        IiiiiiiiIIIII.setJade1(IiiiiiiiIIIII);
        var8_31 = new SuitOperBean();
        IiiiiiiiIIIII.setType(21);
        IiiiiiiiIIIII.setJade(IiiiiiiiIIIII);
        IiiiiiiiIIIII.setGoods(IiiiiiiiIIIII.ALLATORIxDEMO(IiiiiiiiIIIII));
        IiiiiiiiIIIII = Agreement.getSendTextAES((String)"suitoperate", (String)iiIiiiiiIIiii.ALLATORIxDEMO().toJson(IiiiiiiiIIIII));
        this.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII);
        this.ALLATORIxDEMO().iiiIiiiiiiIIi(this.iIiIiiiiIIiii());
    }

    public iIiIiiiiiiiIi(GameView gameView) {
        super(162, 3, IiiiIiiiiIiIi.iIIIIiiiiiIIi, gameView);
        this.ALLATORIxDEMO(-1, 0, 234, 186, IiiiIiiiiIiIi.iIIiIiiiiiiIi);
        this.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/1.png", (int)68, (int)68, (int)68, (int)68, (boolean)false), null);
        this.IiIiiiiiIIIII = new IiIiIiiiiIIiI[4];
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IiIiiiiiIIIII.length) {
            this.IiIiiiiiIIIII[IiiiiiiiIIIII] = new IiIiIiiiiIIiI("sc/e/6.png", 1, 131 + IiiiiiiiIIIII, iiIIiiiiIiiII.iiiiIiiiIiiII, null, IiiiiiiiIIIII == 0 ? "\u6700\u5c0f" : (IiiiiiiiIIIII == 1 ? "\u6700\u5927" : (IiiiiiiiIIIII == 2 ? "\u53d6\u6d88" : (IiiiiiiiIIIII == 3 ? "\u786e\u5b9a" : ""))), (IiiiIiiiiIiIi)this);
            if (IiiiiiiiIIIII == 0 || IiiiiiiiIIIII == 1) {
                this.IiIiiiiiIIIII[IiiiiiiiIIIII].setBounds(32 + 136 * IiiiiiiiIIIII, 103, 34, 18);
                this.IiIiiiiiIIIII[IiiiiiiiIIIII].setFont(iiIIiiiiIiiII.iiIiiiiiiIIiI);
            } else if (IiiiiiiiIIIII == 2 || IiiiiiiiIIIII == 3) {
                this.IiIiiiiiIIIII[IiiiiiiiIIIII].setImage("sc/e/7.png");
                this.IiIiiiiiIIIII[IiiiiiiiIIIII].setBounds(32 + 111 * (IiiiiiiiIIIII - 2), 136, 59, 25);
                this.IiIiiiiiIIIII[IiiiiiiiIIIII].setForeground(Color.black);
            }
            this.add((Component)this.IiIiiiiiIIIII[IiiiiiiiIIIII++]);
        }
        this.IiiiiiiiIIIII = new JLabel[3];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IiiiiiiiIIIII.length) {
            this.IiiiiiiiIIIII[IiiiiiiiIIIII] = IiIIIiiiiIIiI.ALLATORIxDEMO((int)21, (int)16, (int)192, (int)21, (Color)(IiiiiiiiIIIII == 1 ? Color.red : Color.white), (Font)(IiiiiiiiIIIII == 0 ? iiIIiiiiIiiII.iiiiIiiiIiiII : iiIIiiiiIiiII.iIIIiiiiIIIii));
            this.IiiiiiiiIIIII[IiiiiiiiIIIII].setText(IiiiiiiiIIIII == 0 ? "\u4e00\u952e\u4f7f\u7528" : (IiiiiiiiIIIII == 1 ? "\u5b66\u4e60\u4ea4\u6d41\u7ec3\u4e60" : (IiiiiiiiIIIII == 2 ? "123,456" : "")));
            if (IiiiiiiiIIIII == 0) {
                this.IiiiiiiiIIIII[IiiiiiiiIIIII].setHorizontalAlignment(0);
            } else if (IiiiiiiiIIIII >= 1 && IiiiiiiiIIIII <= 2) {
                this.IiiiiiiiIIIII[IiiiiiiiIIIII].setHorizontalAlignment(10);
                this.IiiiiiiiIIIII[IiiiiiiiIIIII].setBounds(84, 51 + (IiiiiiiiIIIII - 1) * 21, 150, 16);
            }
            this.add(this.IiiiiiiiIIIII[IiiiiiiiIIIII++]);
        }
        this.IiIIIiiiiIiiI = IiIIIiiiiIIiI.ALLATORIxDEMO((IIiIiiiiIIiii)IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/17.png", (int)6, (int)6, (int)6, (int)6, (boolean)false), (Font)iiIIiiiiIiiII.iIIIiiiiIIIii, (Color)Color.white);
        this.IiIIIiiiiIiiI.setBounds(70, 103, 94, 19);
        this.add((Component)this.IiIIIiiiiIiiI);
        this.iIiIiiiiIiIii = new IIiIIiiiIIIiI(15, (JTextField)this.IiIIIiiiiIiiI, (IiiiIiiiiIiIi)this);
        this.iiiiIiiiIiiII = new com.xy.q.IIIiiiiiIiIiI((IiiiIiiiiIiIi)this);
        this.iiiiIiiiIiiII.ALLATORIxDEMO(com.xy.q.IIIiiiiiIiIiI.iIiIIiiiIIiII);
        this.iiiiIiiiIiiII.setBounds(31, 47, 45, 45);
        this.iiiiIiiiIiiII.ALLATORIxDEMO("sc/d/51.png");
        this.add((Component)this.iiiiIiiiIiiII);
        this.ALLATORIxDEMO = new IIIiiiiiIiIiI[2];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.ALLATORIxDEMO.length) {
            this.ALLATORIxDEMO[IiiiiiiiIIIII] = new IIIiiiiiIiIiI();
            if (IiiiiiiiIIIII == 0) {
                this.ALLATORIxDEMO[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/25.png", (int)2, (int)2, (int)2, (int)2, (boolean)false));
                this.ALLATORIxDEMO[IiiiiiiiIIIII].setBounds(21, 16, 192, 21);
            } else if (IiiiiiiiIIIII == 1) {
                this.ALLATORIxDEMO[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/24.png", (int)2, (int)2, (int)2, (int)2, (boolean)false));
                this.ALLATORIxDEMO[IiiiiiiiIIIII].setBounds(21, 16, 192, 152);
            }
            this.add((Component)this.ALLATORIxDEMO[IiiiiiiiIIIII++]);
        }
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (!this.iiIIiiiiIiIIi.iIiIiiiiIIiii()) return;
        if (this.iIiiIiiiiiiII == 11) {
            int IiiiiiiiIIIII = (int)this.ALLATORIxDEMO().getLoginResult().getContribution().longValue();
            if (this.iiiIiiiiiiiIi == IiiiiiiiIIIII) return;
            this.iiiIiiiiiiiIi = IiiiiiiiIIIII;
            this.IiiiiiiiIIIII[2].setText("\u9a6f\u517b\u6b21\u6570:" + IiiiiiiiIIIII / this.iiIiiiiiiiIii);
            return;
        }
        if (this.iIiiIiiiiiiII == 12) {
            int IiiiiiiiIIIII = this.ALLATORIxDEMO().ALLATORIxDEMO(this.IIIIiiiiiiiII);
            if (this.iiiIiiiiiiiIi == IiiiiiiiIIIII) return;
            this.iiiIiiiiiiiIi = IiiiiiiiIIIII;
            this.IiiiiiiiIIIII[2].setText("\u53ef\u5151\u6362\u6b21\u6570:" + IiiiiiiiIIIII / this.iiIiiiiiiiIii);
            return;
        }
        if (this.iIiiIiiiiiiII == 13) {
            Goodstable IiiiiiiiIIIII = this.ALLATORIxDEMO().getGood(this.iiIIIiiiiiiiI);
            if (IiiiiiiiIIIII == null) {
                this.ALLATORIxDEMO().iiiIiiiiiiIIi(this.iIiIiiiiIIiii());
                return;
            }
            if (this.iiiIiiiiiiiIi == IiiiiiiiIIIII.getUsetime()) return;
            this.iiiIiiiiiiiIi = IiiiiiiiIIIII.getUsetime();
            this.IiiiiiiiIIIII[2].setText("\u53ef\u5151\u6362\u6b21\u6570:" + this.iiiIiiiiiiiIi / this.iiIiiiiiiiIii);
            return;
        }
        Goodstable IiiiiiiiIIIII = this.ALLATORIxDEMO().getGood(this.iiIiIiiiiIIIi);
        if (IiiiiiiiIIIII == null) {
            this.ALLATORIxDEMO().iiiIiiiiiiIIi(this.iIiIiiiiIIiii());
            return;
        }
        if (this.iiiIiiiiiiiIi == IiiiiiiiIIIII.getUsetime()) return;
        this.iiiIiiiiiiiIi = IiiiiiiiIIIII.getUsetime();
        this.IiiiiiiiIIIII[2].setText("\u62e5\u6709\u6570\u91cf:" + this.iiiIiiiiiiiIi / this.iiIiiiiiiiIii);
    }

    public Long ALLATORIxDEMO(long number, JTextField textField) {
        if (number == 0L) {
            return null;
        }
        if (number < 0L) {
            return 0L;
        }
        if (this.iIiiIiiiiiiII == 11 || this.iIiiIiiiiiiII == 12 || this.iIiiIiiiiiiII == 13) {
            if (number <= (long)(this.iiiIiiiiiiiIi / this.iiIiiiiiiiIii)) return null;
            return this.iiiIiiiiiiiIi / this.iiIiiiiiiiIii;
        }
        if (this.iiIiIiiiiIIIi == null) {
            return 0L;
        }
        Goodstable IiiiiiiiIIIII = this.ALLATORIxDEMO().getGood(this.iiIiIiiiiIIIi);
        if (IiiiiiiiIIIII == null) {
            return 0L;
        }
        int IiiiiiiiIIIII2 = IiiiiiiiIIIII.getUsetime() / this.iiIiiiiiiiIii;
        if (IiiiiiiiIIIII.getType() == 118L && IiiiiiiiIIIII.getGoodsid().intValue() != 81229 && IIiiIiiiiIIiI.ALLATORIxDEMO((String)IiiiiiiiIIIII.getValue(), (String)"\u8bfb\u6761=", (String)"|") == 0L) {
            IiiiiiiiIIIII2 = Math.min(10, IiiiiiiiIIIII2);
        }
        if (number <= (long)IiiiiiiiIIIII2) return null;
        return IiiiiiiiIIIII2;
    }
}
